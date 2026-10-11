/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends wia {
    boolean field_o;

    bq(int param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (kaa.a(param0, (byte) 63)) {
            return false;
          }
          if (tfa.a(41, param0)) {
            return false;
          }
          if (eha.a(15, param0)) {
            return false;
          }
          if (param1 != 20133) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (vs.a(param1 - 20165, param2, param0)) {
            return false;
          }
          if (cw.a(param0, param2, true)) {
            return false;
          }
          if (!db.a(param2, param0, false)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("bq.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
    }
}
