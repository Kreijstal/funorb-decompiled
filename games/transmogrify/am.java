/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends wf {
    int field_p;
    long field_o;
    int[] field_m;
    static oa field_q;
    int field_i;
    int field_k;
    int field_g;
    static int field_n;
    int field_l;
    int field_h;
    int field_j;

    final static void a(boolean param0, int param1, pl param2, byte param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (null != jj.field_a) {
            ff.a(param2, param0, param1, 1048576, (byte) 40);
          }
          if (null != jk.field_D) {
            var4 = re.field_h;
            synchronized (var4) {
              jk.field_D.c(-1, param1, 0);
              if (d.field_e == param2) {
                return;
              }
              jk.field_D.f(16);
              re.field_h.c();
              d.field_e = param2;
              if (d.field_e != null) {
                jk.field_D.a(-63, param0, d.field_e);
              }
            }
          }
          var4_int = -81 % ((-55 - param3) / 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("am.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 != 5) {
          am.a((byte) -97);
        }
    }

    final static mi a(String param0, ci param1, byte param2, ci param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 72) {
            stackIn_2_0 = (mi) null;
            return stackIn_2_0;
          }
          var5_int = param1.b(114, param4);
          var6 = param1.a(param2 - 73, param0, var5_int);
          stackIn_4_0 = oa.a(-123, param3, param1, var5_int, var6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("am.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    am(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_i = param1;
          this.field_k = param3;
          this.field_m = param6;
          this.field_g = param2;
          this.field_l = param5;
          this.field_j = param0;
          this.field_h = param4;
          fieldTemp$0 = qa.field_r;
          qa.field_r = qa.field_r + 1;
          this.field_p = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "am.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new oa((byte[]) null);
    }
}
