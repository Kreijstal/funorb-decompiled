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
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var7 = EscapeVector.field_A;
        if (param0 <= 44) {
          L0: {
            je.a(24);
            var1 = qh.field_k[0] * bc.field_a[0];
            var19 = qe.field_a[0];
            if (!bj.field_E[0]) {
              var9 = new int[var1];
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var9);
                  break L0;
                } else {
                  var9[var5] = qk.field_f[ae.a((int) var19[var5], 255)];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var18 = hn.field_b[0];
              var13 = new int[var1];
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var13);
                  break L0;
                } else {
                  var5_ref_int__[var6] = lb.a(ae.a(var18[var6] << 93821816, -16777216), qk.field_f[ae.a((int) var19[var6], 255)]);
                  var6++;
                  continue L2;
                }
              }
            }
          }
          of.a(false);
          return (ed) (var3);
        } else {
          L3: {
            var1 = qh.field_k[0] * bc.field_a[0];
            var21 = qe.field_a[0];
            if (!bj.field_E[0]) {
              var9 = new int[var1];
              var5 = 0;
              L4: while (true) {
                if (var1 <= var5) {
                  var3 = new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var9);
                  break L3;
                } else {
                  var9[var5] = qk.field_f[ae.a((int) var21[var5], 255)];
                  var5++;
                  continue L4;
                }
              }
            } else {
              var20 = hn.field_b[0];
              var13 = new int[var1];
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L5: while (true) {
                if (var1 <= var6) {
                  var3 = new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var13);
                  break L3;
                } else {
                  var5_ref_int__[var6] = lb.a(ae.a(var20[var6] << 93821816, -16777216), qk.field_f[ae.a((int) var21[var6], 255)]);
                  var6++;
                  continue L5;
                }
              }
            }
          }
          of.a(false);
          return (ed) (var3);
        }
    }

    final static int a(boolean param0, int param1) {
        ed discarded$6 = null;
        if (!param0) {
          if (!qd.a(param1, -102)) {
            return 0;
          } else {
            return pc.a(2513, param1);
          }
        } else {
          discarded$6 = je.b(13);
          if (!qd.a(param1, -102)) {
            return 0;
          } else {
            return pc.a(2513, param1);
          }
        }
    }

    final static void a(mf param0, hj param1, int param2, byte param3) {
        try {
            hb.field_h = se.a(0) * param2 / 1000;
            on.a(param0, -58);
            h.a(param0, (byte) 110);
            cj.a(0, param0);
            pa.a(-83);
            if (param3 < 80) {
                String var5 = (String) null;
                je.a(false, (String) null);
            }
            id.c(120);
            kb.field_d = 0 - hb.field_h;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "je.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        System.out.println("Error: " + vg.a(param1, "%0a", (byte) 111, "\n"));
        if (param0) {
            String var3 = (String) null;
            je.a(false, (String) null);
        }
    }

    static {
        field_a = new cn();
    }
}
