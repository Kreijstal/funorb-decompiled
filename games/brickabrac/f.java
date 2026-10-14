/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static UiComponent field_a;
    static ScrollPaneWithFooter field_c;

    final static void handleTableResponse(byte obfuscationGuard) {
        int dictionaryIndex = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int entryIndex = 0;
        int firstPartitionValueIndex = 0;
        int playerPartitionValueIndex = 0;
        int distinctNameValueIndex = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int responseType = 0;
        int tableId = 0;
        long acknowledgedRowId = 0L;
        TableDataRequest tableRequest = null;
        int dictionarySize = 0;
        TableRowSubmission rowSubmission = null;
        int rowLimit = 0;
        int columnCount = 0;
        String[][] names = null;
        String[][] secondaryLabels = null;
        long[][] rowIds = null;
        int[][] values = null;
        int firstPartitionRows = 0;
        int playerPartitionRows = 0;
        int distinctNameRows = 0;
        int firstPartitionValueOffset = 0;
        int playerPartitionValueOffset = 0;
        int distinctNameValueOffset = 0;
        int entryCount = 0;
        int nameIndex = 0;
        String name = null;
        long rowId = 0L;
        int valuesStart = 0;
        int columnIndex = 0;
        int clientBranchFlag = 0;
        BitPacketBuffer packet = null;
        int submissionRequestId;
        int playerColumnIndex;
        int distinctNameColumnIndex;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 7) {
            f.a(-30);
          }
          packet = jl.incomingPackets;
          responseType = packet.readUnsignedByte(255);
          if (0 == responseType) {
            tableId = packet.readUnsignedShort(65280);
            tableRequest = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.first(-105));
            while (tableRequest != null) {
              if (tableRequest.tableId != tableId) {
                tableRequest = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.next((byte) 116));
                continue;
              }
              break;
            }
            if (tableRequest == null) {
              hn.a((byte) 127);
              return;
            }
            dictionarySize = packet.readUnsignedByte(obfuscationGuard ^ 248);
            if (dictionarySize != 0) {
              rowLimit = tableRequest.rowLimit;
              SoftwareFramebuffer.tableNameScratch[0].secondaryLabel = null;
              SoftwareFramebuffer.tableNameScratch[0].name = LoadingProgressDialog.field_cb;
              columnCount = tableRequest.columnCount;
              SoftwareFramebuffer.tableNameScratch[0].partitionSeen = false;
              for (dictionaryIndex = 1; dictionarySize > dictionaryIndex; dictionaryIndex++) {
                SoftwareFramebuffer.tableNameScratch[dictionaryIndex].name = packet.readCp1252String(-1);
                SoftwareFramebuffer.tableNameScratch[dictionaryIndex].partitionSeen = false;
                if (packet.readUnsignedByte(obfuscationGuard ^ 248) == 1) {
                  SoftwareFramebuffer.tableNameScratch[dictionaryIndex].secondaryLabel = packet.readCp1252String(-1);
                } else {
                  SoftwareFramebuffer.tableNameScratch[dictionaryIndex].secondaryLabel = null;
                }
              }
              dupTemp$0 = new String[3][rowLimit];
              tableRequest.names = dupTemp$0;
              names = dupTemp$0;
              secondaryLabels = new String[3][rowLimit];
              dupTemp$1 = new long[3][rowLimit];
              tableRequest.rowIds = dupTemp$1;
              rowIds = dupTemp$1;
              dupTemp$2 = new int[3][rowLimit * columnCount];
              tableRequest.values = dupTemp$2;
              values = dupTemp$2;
              firstPartitionRows = 0;
              playerPartitionRows = 0;
              distinctNameRows = 0;
              firstPartitionValueOffset = 0;
              playerPartitionValueOffset = 0;
              distinctNameValueOffset = 0;
              entryCount = packet.readUnsignedByte(obfuscationGuard ^ 248);
              if (0 < entryCount) {
                for (entryIndex = 0; entryIndex < entryCount; entryIndex++) {
                  nameIndex = packet.readUnsignedByte(255);
                  name = SoftwareFramebuffer.tableNameScratch[nameIndex].name;
                  rowId = packet.readLong(-32768);
                  valuesStart = packet.position;
                  if (rowLimit > entryIndex) {
                    names[0][firstPartitionRows] = name;
                    secondaryLabels[0][firstPartitionRows] = SoftwareFramebuffer.tableNameScratch[nameIndex].secondaryLabel;
                    rowIds[0][firstPartitionRows] = rowId;
                    for (columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                      firstPartitionValueIndex = firstPartitionValueOffset;
                      firstPartitionValueOffset++;
                      values[0][firstPartitionValueIndex] = packet.readInt(255);
                    }
                    firstPartitionRows++;
                  }
                  if (name != null &&
                    SpaceBackground.isLocalPlayerName(name, obfuscationGuard ^ -88)) {
                    names[1][playerPartitionRows] = LoadingProgressDialog.field_cb;
                    secondaryLabels[1][playerPartitionRows] = null;
                    rowIds[1][playerPartitionRows] = rowId;
                    playerPartitionRows++;
                    packet.position = valuesStart;
                    for (playerColumnIndex = 0; playerColumnIndex < columnCount; playerColumnIndex++) {
                      playerPartitionValueIndex = playerPartitionValueOffset;
                      playerPartitionValueOffset++;
                      values[1][playerPartitionValueIndex] = packet.readInt(255);
                    }
                  }
                  if (distinctNameRows < rowLimit &&
                    !SoftwareFramebuffer.tableNameScratch[nameIndex].partitionSeen) {
                    SoftwareFramebuffer.tableNameScratch[nameIndex].partitionSeen = true;
                    names[2][distinctNameRows] = name;
                    secondaryLabels[2][distinctNameRows] = SoftwareFramebuffer.tableNameScratch[nameIndex].secondaryLabel;
                    rowIds[2][distinctNameRows] = rowId;
                    distinctNameRows++;
                    packet.position = valuesStart;
                    for (distinctNameColumnIndex = 0; columnCount > distinctNameColumnIndex; distinctNameColumnIndex++) {
                      distinctNameValueIndex = distinctNameValueOffset;
                      distinctNameValueOffset++;
                      values[2][distinctNameValueIndex] = packet.readInt(255);
                    }
                  }
                }
              }
            }
            tableRequest.complete = true;
            tableRequest.unlink((byte) 111);
            return;
          }
          if (responseType == 1) {
            submissionRequestId = packet.readUnsignedShort(obfuscationGuard + 65273);
            acknowledgedRowId = packet.readLong(-32768);
            rowSubmission = (TableRowSubmission) (tm.pendingTableSubmissions.first(-60));
            while (rowSubmission != null) {
              if (rowSubmission.requestId != submissionRequestId) {
                rowSubmission = (TableRowSubmission) (tm.pendingTableSubmissions.next((byte) 116));
                continue;
              }
              break;
            }
            if (rowSubmission == null) {
              hn.a((byte) 53);
              return;
            }
            rowSubmission.rowId = acknowledgedRowId;
            rowSubmission.unlink((byte) 111);
            return;
          }
          AlignedIconLabel.a("HS1: " + WhirlpoolHasher.c((byte) -96), (Throwable) null, obfuscationGuard ^ 102);
          hn.a((byte) 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "f.B(" + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          f.handleTableResponse((byte) 116);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Level Select";
    }
}
