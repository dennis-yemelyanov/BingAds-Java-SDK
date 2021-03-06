package com.microsoft.bingads.internal.bulk;

import com.googlecode.jcsv.reader.CSVReader;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import java.io.FileNotFoundException;

public class TestFactory {

    public static BulkFileReader createBulkFileReader(BulkObjectReader objectReader, ResultFileType fileType) {
        BulkFileReader fileReader = new BulkFileReader(new SimpleBulkStreamReader(objectReader), fileType);

        return fileReader;
    }

    public static BulkFileReader createBulkFileReader(CSVReader<String[]> csvReader, BulkObjectFactory factory) throws FileNotFoundException {
        BulkFileReader fileReader = new BulkFileReader(new SimpleBulkStreamReader(new SimpleBulkObjectReader(csvReader, factory)), ResultFileType.PARTIAL_DOWNLOAD);

        return fileReader;
    }
}
