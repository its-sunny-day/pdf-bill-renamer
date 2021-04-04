# pdf-bill-renamer
Parser for PDF files.  With ability to rename files based on a content of a file.
1. Parse each PDF in target directory.
2. Using keywords determine type of content.
3. Choose template for new file-name depends on type of content.
4. Template for file-name can consist of substrings from the file.

Example of result:
```
receipt_5787651857586966383.pdf -> ГВП_2021.04.04_233-240_114-117.pdf
receipt_5787313432586966738.pdf-> Інтернет_2021.04.04.pdf
receipt_1067133811471378560.pdf-> Вивезення_Відходів_2021.04.04.pdf
receipt_1135896243212580325.pdf-> Електоренергія_2021.04.04_18578-18894.pdf
receipt_2948951240546694283.pdf-> ВГВ_2021.04.04_347-357.pdf
receipt_3707067139837923487.pdf-> ЦО_2021.04.04.pdf
receipt_3867117538403896655.pdf-> ХВП_2021.04.04_567-574.pdf
receipt_5787651857586966383.pdf-> ГВП_2021.04.04_233-240_114-117.pdf
receipt_7325002134071519023.pdf-> Утримання_будинків_2021.04.04.pdf
```

