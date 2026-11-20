/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshMaterial {
    static AccountProtocolState field_d;
    int color;
    static boolean field_e;
    static String field_b;
    static String field_f;
    static int field_h;
    static NamedSoundEffect field_a;
    static boolean field_c;

    final static void sleepIgnoringInterrupt(long param0, int param1) {
        try {
          try {
            Thread.sleep(param0);
          } catch (InterruptedException interruptedException) {
          }
          if (param1 > -60) {
            field_a = (NamedSoundEffect) null;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String formatArchiveLoadingStatus(int param0, ResourceArchive param1, String param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.ensureIndexLoaded((byte) -86)) {
            stackIn_2_0 = (String) (param3);
            return stackIn_2_0;
          }
          if (param0 >= -6) {
            MeshMaterial.clearSharedReferences((byte) -56);
          }
          stackIn_6_0 = param2 + " - " + param1.getLoadPercent(0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("uj.A(").append(param0).append(',');
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_f = null;
        if (param0 == -122) {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
        MeshMaterial.clearSharedReferences((byte) -14);
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_d = new AccountProtocolState();
        field_e = false;
        field_b = "Loading extra data";
    }
}
