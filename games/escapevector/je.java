/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_b;
    static cn field_a;

    public static void a(int param0) {
        int var1 = 86 / ((-10 - param0) / 57);
        field_a = null;
    }

    final static ed b(int param0) {
        int var1 = 0;
        Object var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        var7 = EscapeVector.field_A;
        if (param0 <= 44) {
          L0: {
            je.a(24);
            var1 = qh.field_k[0] * bc.field_a[0];
            var23 = qe.field_a[0];
            if (!bj.field_E[0]) {
              var25 = new int[var1];
              var17 = var25;
              var9 = var17;
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = (Object) (Object) new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var25);
                  break L0;
                } else {
                  var9[var5] = qk.field_f[ae.a((int) var23[var5], 255)];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var22 = hn.field_b[0];
              var24 = new int[var1];
              var16 = var24;
              var13 = var16;
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = (Object) (Object) new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var24);
                  break L0;
                } else {
                  var5_ref_int__[var6] = lb.a(ae.a(var22[var6] << 24, -16777216), qk.field_f[ae.a((int) var23[var6], 255)]);
                  var6++;
                  continue L2;
                }
              }
            }
          }
          of.a(false);
          return (ed) var3;
        } else {
          L3: {
            var1 = qh.field_k[0] * bc.field_a[0];
            var27 = qe.field_a[0];
            if (!bj.field_E[0]) {
              var29 = new int[var1];
              var21 = var29;
              var9 = var21;
              var5 = 0;
              L4: while (true) {
                if (var1 <= var5) {
                  var3 = (Object) (Object) new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var29);
                  break L3;
                } else {
                  var9[var5] = qk.field_f[ae.a((int) var27[var5], 255)];
                  var5++;
                  continue L4;
                }
              }
            } else {
              var26 = hn.field_b[0];
              var28 = new int[var1];
              var20 = var28;
              var13 = var20;
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L5: while (true) {
                if (var1 <= var6) {
                  var3 = (Object) (Object) new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var28);
                  break L3;
                } else {
                  var5_ref_int__[var6] = lb.a(ae.a(var26[var6] << 24, -16777216), qk.field_f[ae.a((int) var27[var6], 255)]);
                  var6++;
                  continue L5;
                }
              }
            }
          }
          of.a(false);
          return (ed) var3;
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
          if (!qd.a(param1, -102)) {
            return 0;
          } else {
            return pc.a(2513, param1);
          }
        } else {
          ed discarded$6 = je.b(13);
          if (!qd.a(param1, -102)) {
            return 0;
          } else {
            return pc.a(2513, param1);
          }
        }
    }

    final static void a(mf param0, hj param1, int param2) {
        try {
            hb.field_h = se.a(0) * param2 / 1000;
            int discarded$0 = -58;
            on.a(param0);
            int discarded$1 = 110;
            h.a(param0);
            cj.a(0, param0);
            pa.a(-83);
            int discarded$2 = 120;
            id.c();
            kb.field_d = 0 - hb.field_h;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "je.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 103 + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        System.out.println("Error: " + vg.a(param1, "%0a", (byte) 111, "\n"));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new cn();
    }
}
