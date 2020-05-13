# CallList
Test task CDEK

Примеры запросов:

1) GET http://localhost:9000/api/v1/tasks/search?fromDate=2020-05-15&toDate=2020-05-21


[
  {
    "id": 1,
    "orderId": "12NSK002",
    "deliveryDate": "2020-05-20",
    "creationDate": "0020-06-12T09:42:33.424+0000",
    "done": false,
    "new": false
  },
  {
    "id": 2,
    "orderId": "12NSK005",
    "deliveryDate": "2020-05-21",
    "creationDate": "0020-07-12T09:42:33.424+0000",
    "done": false,
    "new": false
  }
]

2) GET http://localhost:9000/api/v1/tasks/search?fromDate=2020-05-15&toDate=2020-05-21&orderId=12NSK002


[
  {
    "id": 1,
    "orderId": "12NSK002",
    "deliveryDate": "2020-05-20",
    "creationDate": "0020-06-12T09:42:33.424+0000",
    "done": false,
    "new": false
  }
]

3) POST http://localhost:9000/api/v1/tasks/
    c параметрами (body):
    orderId: 12NSK999,    deliveryDate: 2022/06/15
    
    
{
    "id": 7,
    "orderId": "12NSK999",
    "deliveryDate": "2022-06-14T17:00:00.000+0000",
    "creationDate": "2020-05-13T17:17:50.793+0000",
    "done": false,
    "new": false
}
