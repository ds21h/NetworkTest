# NetworkTest

This is a desktop application for testing services.

You specify the IP address of the service you are testing. You also enter the URI to use and optionally the data to send and the format of the data and the reception format. You can offcourse use any browser for testing, but than your testing is limited to just GET services. Also sending data in another way than just als direct parameters is quite hard.

History

Version 1.0 - 06-10-2020
- Supports data format 'text' and 'JSON'
- Also supports data format 'image' for reply
- If the IP address is specified then the URI to use is constructed from that IP address and the URI, otherwise the URI is used as such (so include http://...)

Version 0.2 - 09-06-2019
- Now also handles other verbs.
- Can send data to the service
- Data format only 'text'
- Data format reply only 'JSON'

Version 0.1 - 08-06-2019
- First version only supporting GET with response as JSON
