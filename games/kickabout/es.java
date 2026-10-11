/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends gn {
    static byte[][] field_e;
    private int field_j;
    static int field_h;
    private int field_i;
    private int field_l;
    static String field_g;
    static vn field_k;
    static ut field_f;

    final void a(ml param0, byte param1) {
        try {
          param0.a(112, this.field_j);
          param0.a(this.field_l, (byte) 118);
          param0.a(102, this.field_i);
          if (param1 < 89) {
            ml var4 = (ml) null;
            this.a((ml) null, (byte) 107);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "es.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = (byte[][]) null;
        if (param0 != -49) {
          return;
        }
        field_f = null;
        field_k = null;
    }

    es(int param0, int param1, int param2) {
        this.field_i = param2;
        this.field_l = param1;
        this.field_j = param0;
    }

    final static void a(int param0, nl param1, int param2, nl param3, tj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        tj var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4.field_m == -1) {
            return;
          }
          var5_int = param1.f(-92) - param4.a(true);
          if (param0 >= -56) {
            var8 = (tj) null;
            es.a(-29, (nl) null, -8, (nl) null, (tj) null);
          }
          var6 = param1.a(true) - param4.c(879306160);
          var7 = nb.a(param1, 170);
          if (var7 * var7 <= var5_int * var5_int + var6 * var6) {
            return;
          }
          param1.b(0, -1);
          param1.field_L = 200;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("es.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_g = "Continue";
    }
}
