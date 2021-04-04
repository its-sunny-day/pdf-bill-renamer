# pdf-bill-renamer
Parser for PDF files.  With ability to rename files based on a content of a file.
1. Parse each PDF in target directory.
2. Using keywords determine type of content.
3. Choose template for new file-name depends on type of content.
4. Template for file-name can consist of substrings from the file.

Example of result:
```
receipt_1.pdf -> ГВП_2021.04.04_233-240_114-117.pdf
receipt_2.pdf-> Інтернет_2021.04.04.pdf
receipt_3.pdf-> Вивезення_Відходів_2021.04.04.pdf
receipt_4.pdf-> Електоренергія_2021.04.04_18578-18894.pdf
receipt_5.pdf-> ВГВ_2021.04.04_347-357.pdf
receipt_6.pdf-> ЦО_2021.04.04.pdf
receipt_7.pdf-> ХВП_2021.04.04_567-574.pdf
receipt_8.pdf-> ГВП_2021.04.04_233-240_114-117.pdf
receipt_9.pdf-> Утримання_будинків_2021.04.04.pdf
```

Example2(only for receipt_1.pdf):
```
receipt_1.pdf -> ГВП_2021.04.04_233-240_114-117.pdf
```
Content of receipt_1.pdf:
![alt text](https://github.com/ioakimov/pdf-bill-renamer/blob/master/resources/ExampleOfBillContent.jpg?raw=true)
