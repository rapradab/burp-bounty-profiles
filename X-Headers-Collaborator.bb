[{"Name":"X-Headers-Collaborator","Enabled":true,"Scanner":1,"Author":"@egarme","Payloads":["http://{BC}"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["Collaborator","All"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":1,"RedirType":1,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"X-Headers-Collaborator","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"X-Headers-Collaborator","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Header":[{"type":"Request","match":"","replace":"X-Forwarded-For: {PAYLOAD}","regex":"String"},{"type":"Request","match":"","replace":"X-Host: {PAYLOAD}","regex":"String"},{"type":"Request","match":"","replace":"X-Forwarded-Server: {PAYLOAD}","regex":"String"},{"type":"Request","match":"","replace":"X-Forwarded-Scheme: {PAYLOAD}","regex":"String"},{"type":"Request","match":"","replace":"X-Original-URL: {PAYLOAD}","regex":"String"},{"type":"Request","match":"","replace":"X-Rewrite-URL: {PAYLOAD}","regex":"String"}],"VariationAttributes":[],"InsertionPointType":[18,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127,65,32,36,7,1,2,6,33,5,35,34,64,0,3,4,37,127],"Scantype":0,"pathDiscovery":false}]