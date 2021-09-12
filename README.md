# CreateDIFramework
자바 내가만든 DI 프레임워크

## 폴더 구조
![20210912_125755_1](https://user-images.githubusercontent.com/35192352/132971549-346850fc-c353-47fb-9969-67774979fa48.png)
## 소스코드
- BookRepository는 주입 받는 내용이 없기 때문에 인스턴스만 생성하고 리턴 받으면 된다.
![20210912_125755_2](https://user-images.githubusercontent.com/35192352/132971551-c5efec78-18a5-4f75-80c4-fb913e7d1017.png)
![20210912_125755_3](https://user-images.githubusercontent.com/35192352/132971553-a7fe97e4-40ed-4155-b68c-c07bc26cc79f.png)
- BookService는 BookRepository를 Inject 하고 있기 때문에 리플렉션으로 BookService 필드를 모두 찾고 Inject 애노테이션이 있는지 확인한다.
- f.getType() 필드의 타입은 BookRepository 클래스이기 때문에 해당하는 인스턴스를 만들어주고 필드의 접근제어자가 public 아닌경우가 많기 때문에 접근 허용을 한다.
- bookservice, bookRepository 인스턴스를 파라미터로 세팅한다.
![20210912_125755_4](https://user-images.githubusercontent.com/35192352/132971559-c39bcd36-b884-483d-b583-8af1a87d34bf.png)
- 테스트 코드가 정상적으로 동작하면 mvn install로 로컬 메이븐 저장소에 저장한다.
![11](https://user-images.githubusercontent.com/35192352/132971554-69da9d76-e45a-4e4c-a546-864268eee976.png)
- 새로운 프로젝트에 dependency를 적용하여 정상동작 하는지 테스트 해본다.
![20210912_125755_5](https://user-images.githubusercontent.com/35192352/132971561-2422b354-4765-4a07-bd2e-6eff57abbc94.png)
