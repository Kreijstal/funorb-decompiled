/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends gn {
    int[] field_h;
    static kj field_j;
    byte[][][] field_l;
    int field_p;
    wu[] field_e;
    int field_n;
    int[] field_m;
    wu[] field_f;
    static String field_i;
    static String[] field_q;
    int[] field_o;
    static int field_k;
    static int field_g;

    public static void a(int param0) {
        if (param0 != 0) {
          si.a(45);
          field_i = null;
          field_q = null;
          field_j = null;
          return;
        }
        field_i = null;
        field_q = null;
        field_j = null;
    }

    final static void a(byte param0, bu param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (param1.field_a == null) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (param1.field_a.peekEvent() != null) {
              aj.a(1L, 1);
              continue;
            }
            break;
          }
          if (param0 != 41) {
            si.a(-5);
          }
          try {
            if (param2 == null) {
              return;
            }
            param1.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("si.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    si() {
    }

    static {
        field_i = "Email (Login):";
        field_j = new kj(0);
        field_g = 0;
    }
}
