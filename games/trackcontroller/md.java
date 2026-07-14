/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_f;
    static char field_d;
    static int[] field_b;
    static String field_c;
    static double field_a;
    static ba field_e;

    final static void a(kd param0, int param1, boolean param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        pl.field_a[0] = ta.field_c.nextInt();
        pl.field_a[1] = ta.field_c.nextInt();
        pl.field_a[3] = (int)h.field_d;
        pl.field_a[2] = (int)(h.field_d >> 488269600);
        ui.field_p.field_k = 0;
        ui.field_p.b(false, pl.field_a[0]);
        ui.field_p.b(false, pl.field_a[1]);
        ui.field_p.b(false, pl.field_a[2]);
        ui.field_p.b(false, pl.field_a[3]);
        vd.a(ui.field_p, (byte) -69);
        ui.field_p.b(param1, (byte) -124);
        param0.a((byte) -6, ui.field_p);
        ra.field_C.field_k = 0;
        if (!param2) {
          L0: {
            ra.field_C.a(16, (byte) -96);
            ra.field_C.field_k = ra.field_C.field_k + 2;
            var5 = ra.field_C.field_k;
            ra.field_C.b(false, db.field_Z);
            ra.field_C.a(sb.field_a, 2147483647);
            var6 = 0;
            if (oc.field_i) {
              var6 = var6 | 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (mk.field_c) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param4) {
              break L2;
            } else {
              var6 = var6 | 8;
              break L2;
            }
          }
          L3: {
            if (kg.field_a == null) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          L4: {
            ra.field_C.a(var6, (byte) -77);
            var7 = bg.a(gd.b((byte) 77), -22004);
            if (var7 == null) {
              var7 = "";
              break L4;
            } else {
              break L4;
            }
          }
          ra.field_C.a((byte) -57, var7);
          if (null == kg.field_a) {
            ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, param3 ^ -1, ui.field_p);
            ra.field_C.c(ra.field_C.field_k - var5, (byte) -96);
            me.a(param3, -1);
            return;
          } else {
            ra.field_C.b(kg.field_a, 126);
            ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, param3 ^ -1, ui.field_p);
            ra.field_C.c(ra.field_C.field_k - var5, (byte) -96);
            me.a(param3, -1);
            return;
          }
        } else {
          L5: {
            ra.field_C.a(18, (byte) -105);
            ra.field_C.field_k = ra.field_C.field_k + 2;
            var5 = ra.field_C.field_k;
            ra.field_C.b(false, db.field_Z);
            ra.field_C.a(sb.field_a, 2147483647);
            var6 = 0;
            if (oc.field_i) {
              var6 = var6 | 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (mk.field_c) {
              var6 = var6 | 4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!param4) {
              break L7;
            } else {
              var6 = var6 | 8;
              break L7;
            }
          }
          L8: {
            if (kg.field_a == null) {
              break L8;
            } else {
              var6 = var6 | 16;
              break L8;
            }
          }
          L9: {
            ra.field_C.a(var6, (byte) -77);
            var7 = bg.a(gd.b((byte) 77), -22004);
            if (var7 == null) {
              var7 = "";
              break L9;
            } else {
              break L9;
            }
          }
          ra.field_C.a((byte) -57, var7);
          if (null == kg.field_a) {
            ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, param3 ^ -1, ui.field_p);
            ra.field_C.c(ra.field_C.field_k - var5, (byte) -96);
            me.a(param3, -1);
            return;
          } else {
            ra.field_C.b(kg.field_a, 126);
            ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, param3 ^ -1, ui.field_p);
            ra.field_C.c(ra.field_C.field_k - var5, (byte) -96);
            me.a(param3, -1);
            return;
          }
        }
    }

    final static void a(int param0, cf param1, int param2) {
        la var6 = ra.field_C;
        var6.c(param0, 7);
        int var4 = 81 / ((-12 - param2) / 48);
        var6.field_k = var6.field_k + 1;
        int var5 = var6.field_k;
        var6.a(1, (byte) -87);
        var6.a(param1.field_j, (byte) -91);
        var6.a(param1.field_k, (byte) -77);
        var6.b(false, param1.field_i);
        var6.b(false, param1.field_n);
        var6.b(false, param1.field_l);
        var6.b(false, param1.field_o);
        int discarded$0 = var6.a(var5, false);
        var6.a(true, -var5 + var6.field_k);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0) {
            Object var2 = null;
            md.a((kd) null, -5, false, 89, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
        field_c = "To Customer Support";
        field_f = "Create a free Account";
        field_a = Math.atan2(1.0, 0.0);
        field_e = new ba();
    }
}
