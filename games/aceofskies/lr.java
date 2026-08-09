/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends lg {
    private byte[] field_w;
    static long field_v;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4688) {
                break L1;
              } else {
                var3 = (String) null;
                lr.a(-91, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = te.field_f.a("", (byte) -71, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("lr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    lr() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final void b(int param0, int param1, byte param2) {
        int var4;
        int var5;
        var4 = 2 * param0;
        int incrementValue$1 = var4;
        var4++;
        this.field_w[incrementValue$1] = (byte)-1;
        var5 = 255 & param2;
        this.field_w[var4] = (byte)(var5 * 3 >> -750572635);
        if (param1 != -1) {
          field_v = 21L;
          return;
        } else {
          return;
        }
    }

    final byte[] a(int param0, int param1, byte param2, int param3) {
        this.field_w = new byte[2 * param3 * param0 * param1];
        if (param2 != -120) {
          return (byte[]) null;
        } else {
          this.a(true, param3, param0, param1);
          return this.field_w;
        }
    }

    static {
    }
}
