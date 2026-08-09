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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new gb(param0, ph.field_q, ne.field_h, cg.field_k, tf.field_b, mf.field_j);
              eb.a(param1);
              stackIn_4_0 = (gb) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("dc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gb) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static o[] a(int param0) {
        o[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        byte[] var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var8 = wizardrun.field_H;
        var1 = new o[wb.field_f];
        var2 = 0;
        L0: while (true) {
          if (wb.field_f <= var2) {
            eb.a(0);
            if (param0 != 19999) {
              var9 = (byte[]) null;
              dc.a((byte[]) null, 37);
              return var1;
            } else {
              return var1;
            }
          } else {
            var3 = cg.field_k[var2] * tf.field_b[var2];
            var21 = mf.field_j[var2];
            if (v.field_e[var2]) {
              var23 = ue.field_e[var2];
              var17 = new int[var3];
              var14 = var17;
              var6 = var14;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (o) ((Object) new be(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var17));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = sd.a(ic.field_b[kl.b((int) var21[var7], 255)], kl.b(255, (int) var23[var7]) << 2138757784);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var3];
              var22 = var10;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var10[var6_int] = ic.field_b[kl.b((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static te a(byte param0, int param1) {
        te var2;
        var2 = new te();
        bk.field_d.a(var2, false);
        hg.a(param1, (byte) 106);
        if (param0 != 103) {
          return (te) null;
        } else {
          return var2;
        }
    }

    dc(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param4;
        this.field_r = param2;
        this.field_l = param3;
        this.field_m = param1;
        this.field_p = param5;
        this.field_k = param0;
    }

    public static void c(int param0) {
        byte[] var2;
        field_s = null;
        field_o = null;
        field_q = null;
        if (param0 > -2) {
          var2 = (byte[]) null;
          dc.a((byte[]) null, 30);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    static {
        field_t = 0;
        field_q = "Email: ";
        field_j = 0.0;
        field_o = "Passwords can only contain letters and numbers";
    }
}
