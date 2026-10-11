/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class i {
    static th field_d;
    static oj field_c;
    static int field_a;
    static int[] field_e;
    static int field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        try {
          if (11 == eg.field_d) {
            tc.d(1);
          }
          if (param1 >= -96) {
            field_a = 100;
          }
          nb.a(b.field_v, fg.field_K, am.field_i, (byte) -120);
          pd.a(param0, 0, 0, (byte) -79);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "i.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(byte[] param0, byte param1);

    final static wb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        wb var5 = null;
        int var6 = 0;
        wb stackIn_4_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_7_0 = uj.field_d;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var6 = 35 % ((param0 - 58) / 48);
            var5 = ok.a(var3, 1);
            if (var5 == null) {
              return sd.a((byte) -96, var4);
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = rk.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("i.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract byte[] a(int param0);

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != 64) {
          String var2 = (String) null;
          i.a(76, (String) null);
        }
    }

    static {
        field_d = new th();
        field_e = new int[256];
        field_c = new oj();
    }
}
