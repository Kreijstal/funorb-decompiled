/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jjb {
    ob field_a;
    ob field_g;
    boolean field_d;
    static String field_f;
    aia[] field_e;
    aia[] field_c;
    ob field_b;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_f = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!li.field_i) {
          dma.d(param4, param3, param5, param1, param0);
        } else {
          if (ne.field_v) {
            og.field_r.aa(param4, param3, param5, param1, param0, 0);
          }
        }
        if (param2 == 17634) {
          return;
        }
        field_f = (String) null;
    }

    jjb(qfa param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ob var4 = null;
        nk var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.field_a = null;
        this.field_g = null;
        this.field_e = null;
        this.field_c = null;
        this.field_b = null;
        try {
          this.field_d = param0.field_tc;
          lna.a(param0, 16);
          if (!this.field_d) {
            this.field_e = new aia[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var23 = ppb.a(pra.field_p, 32768 * var2_int, true, 32768);
              this.field_e[var2_int] = new aia(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.field_c = new aia[16];
            for (var2_intLifetime1 = 0; 16 > var2_intLifetime1; var2_intLifetime1++) {
              var24 = ppb.a(pjb.field_vb, var2_intLifetime1 * 32768, true, 32768);
              this.field_c[var2_intLifetime1] = new aia(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = ffb.a(false, pra.field_p, true);
          this.field_b = new ob(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = ffb.a(false, pjb.field_vb, true);
          this.field_g = new ob(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_yb;
          if (var10.a(92)) {
            var22 = ffb.a(false, lda.field_o, true);
            this.field_a = new ob(param0, 6408, 128, 128, 16);
            var4 = new ob(param0, 6409, 128, 128, 16, var22, 6409);
            if (var10.a(2.0f, -28279, var4, this.field_a)) {
              this.field_a.c(9729);
              var4.e(0);
              return;
            }
            this.field_a.e(0);
            this.field_a = null;
            var4.e(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("jjb.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_f = "Provides a burst of acceleration";
    }
}
