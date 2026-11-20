/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static TriangleMesh[] field_c;
    static String field_e;
    static IntrusiveDeque field_a;
    static int field_b;
    static String field_d;

    abstract byte[] getBytes(int param0);

    public static void clearSharedReferences(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 == -20) {
          field_d = null;
          field_a = null;
          return;
        }
        field_a = (IntrusiveDeque) null;
        field_d = null;
        field_a = null;
    }

    final static boolean pollCommonUiLoaded(ResourceArchive param0, ResourceArchive param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.ensureIndexLoaded((byte) -122)) {
            return false;
          }
          if (!param0.tryLoadNamedGroup("commonui", -108)) {
            return false;
          }
          if (param1.ensureIndexLoaded((byte) -111) &&
            param1.tryLoadNamedGroup("commonui", -83)) {
            if (param2 < 125) {
              field_e = (String) null;
            }
            if (param3.ensureIndexLoaded((byte) -75) &&
              param3.tryLoadNamedGroup("button.gif", -85)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ej.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static String formatGroupLoadingStatus(String param0, String param1, String param2, boolean param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4.ensureIndexLoaded((byte) -94)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          if (param3) {
            field_c = (TriangleMesh[]) null;
          }
          stackIn_6_0 = param1 + " - " + param4.getNamedGroupLoadPercent(param2, 0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ej.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void putBytes(int param0, byte[] param1);

    static {
        field_e = "Confirm Email:";
        field_d = "Next";
    }
}
