/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TableDataRequest extends IntrusiveNode {
    long[][] rowIds;
    boolean complete;
    int[][] values;
    int tableId;
    static String field_j;
    static int field_m;
    static boolean field_k;
    int rowLimit;
    String[][] names;
    int columnCount;

    final static void a(boolean param0, int param1) {
        AppletResourceHelpers.a(param0, false);
        RankingsRequest.a(param0, (byte) -125);
        if (param1 < 10) {
          byte[] var3 = (byte[]) null;
          TableDataRequest.storeArchiveBytes(38, (byte[]) null, true);
        }
    }

    final static Object storeArchiveBytes(int obfuscationGuard, byte[] data, boolean copy) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        DirectByteStorage stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (data == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (data.length > 136) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).store(67, data);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (obfuscationGuard >= -103) {
            stackIn_9_0 = (Object) null;
            return stackIn_9_0;
          }
          if (!copy) {
            stackIn_14_0 = (byte[]) (data);
            return stackIn_14_0;
          }
          stackIn_12_0 = AppletGameShell.copyBytes(false, data);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("eg.C(").append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(copy).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 136) {
          field_k = false;
        }
    }

    TableDataRequest() {
    }

    static {
        field_j = "Enter name of friend to delete from list";
    }
}
