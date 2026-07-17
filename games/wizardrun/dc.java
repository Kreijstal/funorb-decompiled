/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends wl {
    int field_m;
    int field_i;
    static String field_n;
    static volatile int field_t;
    int field_r;
    int field_l;
    static String field_q;
    static double field_j;
    static String field_o;
    static o[] field_s;
    int field_k;
    int field_p;

    final static gb a(byte[] param0, int param1) {
        gb var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        gb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        gb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new gb(param0, ph.field_q, ne.field_h, cg.field_k, tf.field_b, mf.field_j);
              eb.a(param1);
              stackOut_3_0 = (gb) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("dc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static o[] a(int param0) {
        o[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        var8 = wizardrun.field_H;
        var1 = new o[wb.field_f];
        var2 = 0;
        L0: while (true) {
          if (wb.field_f <= var2) {
            eb.a(0);
            return var1;
          } else {
            var3 = cg.field_k[var2] * tf.field_b[var2];
            var22 = mf.field_j[var2];
            if (v.field_e[var2]) {
              var24 = ue.field_e[var2];
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var14 = var17;
              var6 = var14;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (o) (Object) new be(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var25);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = sd.a(ic.field_b[kl.b((int) var22[var7], 255)], kl.b(255, (int) var24[var7]) << 24);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var3];
              var23 = var10;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var23);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var10[var6_int] = ic.field_b[kl.b((int) var22[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static te a(byte param0, int param1) {
        te var2 = null;
        var2 = new te();
        bk.field_d.a((wl) (Object) var2, false);
        hg.a(4, (byte) 106);
        if (param0 != 103) {
          return null;
        } else {
          return var2;
        }
    }

    dc(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((dc) this).field_i = param4;
        ((dc) this).field_r = param2;
        ((dc) this).field_l = param3;
        ((dc) this).field_m = param1;
        ((dc) this).field_p = param5;
        ((dc) this).field_k = param0;
    }

    public static void c(int param0) {
        Object var2 = null;
        field_s = null;
        field_o = null;
        field_q = null;
        if (param0 > -2) {
          var2 = null;
          gb discarded$2 = dc.a((byte[]) null, 30);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0;
        field_q = "Email: ";
        field_j = 0.0;
        field_o = "Passwords can only contain letters and numbers";
    }
}
