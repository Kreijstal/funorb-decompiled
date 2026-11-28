/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_b;
    static String field_a;

    final static dh a(ResourceArchive param0, String param1, ResourceArchive param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        LevelProgressUpdate var7 = null;
        dh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 17153) {
            var7 = (LevelProgressUpdate) null;
            lj.a(96, (LevelProgressUpdate) null, -65);
          }
          var5_int = param0.getGroupIdByName(param1, param4 ^ -17154);
          var6 = param0.getFileIdByName(-2862, param3, var5_int);
          stackIn_3_0 = ve.a(103, param0, var6, param2, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lj.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, LevelProgressUpdate param1, int param2) {
        try {
          tb.field_b.addLast(0, param1);
          pm.a(param0, param1, (byte) 71);
          if (param2 > -38) {
            field_b = -2;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "lj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 30447) {
          LevelProgressUpdate var2 = (LevelProgressUpdate) null;
          lj.a(45, (LevelProgressUpdate) null, 63);
        }
    }

    static {
        field_a = "This entry doesn't match";
    }
}
