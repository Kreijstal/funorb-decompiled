/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static jp[] field_b;
    static String field_c;
    static boolean field_d;
    static int[] field_f;
    static String field_a;
    static int[] field_e;

    final static void a(int param0, int param1) {
        si.field_k.a(true, dm.field_b, 0, param1, param0);
        if (!(-8 != (si.field_k.field_m ^ -1))) {
            hq.b(true, true, param0);
        }
    }

    final static void a(boolean param0, mf param1, mf param2, byte param3) {
        ai.a(lp.field_Ab, (dh) (Object) ul.field_m, f.field_a, vo.field_C, im.field_d, wi.field_n, tk.field_t, ad.field_l, (byte) 61, param0, ic.field_c, fp.field_u);
        if (param3 < 74) {
          int discarded$1 = ed.b(2, -57);
          ef.field_b = cr.a("lobby", param1, "chatfilter", 2);
          rh.field_e[0] = mc.field_a;
          rh.field_e[2] = sp.field_s;
          rh.field_e[1] = e.field_j;
          hk.a((dh) (Object) rd.field_e, (byte) 90, param2);
          return;
        } else {
          ef.field_b = cr.a("lobby", param1, "chatfilter", 2);
          rh.field_e[0] = mc.field_a;
          rh.field_e[2] = sp.field_s;
          rh.field_e[1] = e.field_j;
          hk.a((dh) (Object) rd.field_e, (byte) 90, param2);
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param0 == 9) {
            break L0;
          } else {
            int discarded$1 = ed.b(-83, -74);
            break L0;
          }
        }
        if (-1 >= (param1 ^ -1)) {
          if (param1 >= 65536) {
            L1: {
              var2 += 16;
              param1 = param1 >>> 16;
              if (256 > param1) {
                break L1;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L1;
              }
            }
            L2: {
              if (16 > param1) {
                break L2;
              } else {
                param1 = param1 >>> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (4 > param1) {
                break L3;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L3;
              }
            }
            L4: {
              if (param1 < 1) {
                break L4;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L4;
              }
            }
            return var2 - -param1;
          } else {
            L5: {
              if (256 > param1) {
                break L5;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L5;
              }
            }
            L6: {
              if (16 > param1) {
                break L6;
              } else {
                param1 = param1 >>> 4;
                var2 += 4;
                break L6;
              }
            }
            L7: {
              if (4 > param1) {
                break L7;
              } else {
                param1 = param1 >>> 2;
                var2 += 2;
                break L7;
              }
            }
            L8: {
              if (param1 < 1) {
                break L8;
              } else {
                param1 = param1 >>> 1;
                var2++;
                break L8;
              }
            }
            return var2 - -param1;
          }
        } else {
          L9: {
            var2 += 16;
            param1 = param1 >>> 16;
            if (256 > param1) {
              break L9;
            } else {
              param1 = param1 >>> 8;
              var2 += 8;
              break L9;
            }
          }
          L10: {
            if (16 > param1) {
              break L10;
            } else {
              param1 = param1 >>> 4;
              var2 += 4;
              break L10;
            }
          }
          L11: {
            if (4 > param1) {
              break L11;
            } else {
              param1 = param1 >>> 2;
              var2 += 2;
              break L11;
            }
          }
          L12: {
            if (param1 < 1) {
              break L12;
            } else {
              param1 = param1 >>> 1;
              var2++;
              break L12;
            }
          }
          return var2 - -param1;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 > -61) {
            return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Asking for or providing contact information";
        field_e = new int[8192];
        field_f = new int[]{0, 1, 2, 10, 25, -1, -1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, 5, 6, 7, 8, -1, -1, -1, -1, -1, -1, 9, 10, 11, 12, 13, -1, -1, -1, -1, -1, 14, -1};
        field_c = "You have <%0> unread messages!";
    }
}
