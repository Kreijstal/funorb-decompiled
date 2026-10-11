/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ef extends kc {
    private String field_k;
    static ed field_h;
    private long field_i;
    static String field_m;
    static int field_l;
    static String field_j;

    uj a(boolean param0) {
        if (!param0) {
          this.a(false);
        }
        return mk.field_i;
    }

    final static void a(int param0, int param1) {
        ih var2 = ud.field_b;
        var2.e(param0 + 8, param1);
        var2.a(-11, 1);
        var2.a(-11, param0);
    }

    public static void b(byte param0) {
        field_j = null;
        field_m = null;
        if (param0 >= -91) {
          field_j = (String) null;
        }
        field_h = null;
    }

    final static int a(byte param0) {
        int var1 = -20 / ((-69 - param0) / 49);
        return bm.field_K - ei.field_M;
    }

    final static void a(sg param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = fleas.field_A ? 1 : 0;
        try {
          for (var2_int = 0; 3 > var2_int; var2_int++) {
            bd.field_ob[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < qb.field_a; var2_intLifetime1++) {
            if (~param0.field_j == ~vg.field_H[var2_intLifetime1].field_j) {
              dupTemp$3 = vg.field_H[var2_intLifetime1].b(0);
              bd.field_ob[dupTemp$3] = bd.field_ob[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.b(0);
          bd.field_ob[dupTemp$0] = bd.field_ob[dupTemp$0] + 1;
          if (param1 >= -27) {
            field_h = (ed) null;
          }
          var2_intLifetime2 = 0;
          for (var3 = 0; qb.field_a > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_j == vg.field_H[var3].field_j) {
              var4 = vg.field_H[var3].b(0);
              if (bf.field_h < bd.field_ob[var4]) {
                bd.field_ob[var4] = bd.field_ob[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              vg.field_H[incrementValue$2] = vg.field_H[var3];
            }
          }
          qb.field_a = var2_intLifetime2;
          fieldTemp$1 = qb.field_a;
          qb.field_a = qb.field_a + 1;
          vg.field_H[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ef.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ni param0, byte param1) {
        try {
          int var3_int = -115 % ((-62 - param1) / 38);
          param0.a(-110, this.field_i);
          param0.b(this.field_k, (byte) 94);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ef.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 17) {
            stackIn_6_0 = (null != rg.b((byte) 59, param1));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ef.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ef(long param0, String param1) {
        try {
          this.field_i = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ef.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Password is valid";
        field_h = new ed();
    }
}
