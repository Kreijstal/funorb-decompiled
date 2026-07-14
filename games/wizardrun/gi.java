/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_d;
    static String field_e;
    static bh field_a;
    static int field_c;
    static boolean field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
            Object var2 = null;
            gi.a(true, (uh) null, true, true, 25);
        }
    }

    final static void a(boolean param0, uh param1, boolean param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        uh.field_d[0] = oi.field_c.nextInt();
        uh.field_d[1] = oi.field_c.nextInt();
        uh.field_d[2] = (int)(tg.field_g >> 800793056);
        uh.field_d[3] = (int)tg.field_g;
        re.field_G.field_m = 0;
        re.field_G.f(uh.field_d[0], 613003928);
        re.field_G.f(uh.field_d[1], 613003928);
        re.field_G.f(uh.field_d[2], 613003928);
        re.field_G.f(uh.field_d[3], 613003928);
        u.a(re.field_G, -18);
        re.field_G.b(-1947079288, param4);
        param1.a(4, re.field_G);
        n.field_b.field_m = 0;
        if (!param3) {
          L0: {
            n.field_b.b((byte) 11, 16);
            n.field_b.field_m = n.field_b.field_m + 2;
            var5 = n.field_b.field_m;
            n.field_b.f(vk.field_G, 613003928);
            n.field_b.b(1290648728, bl.field_d);
            var6 = 0;
            if (pf.field_g) {
              var6 = var6 | 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (cb.field_g) {
              var6 = var6 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              var6 = var6 | 8;
              break L2;
            }
          }
          L3: {
            if (sf.field_b == null) {
              break L3;
            } else {
              var6 = var6 | 16;
              break L3;
            }
          }
          n.field_b.b((byte) 11, var6);
          if (param2) {
            L4: {
              var7 = fb.a(jg.f(1), (byte) 102);
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              n.field_b.a(var7, false);
              if (null != sf.field_b) {
                n.field_b.b(0, sf.field_b);
                break L5;
              } else {
                break L5;
              }
            }
            pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
            n.field_b.a(n.field_b.field_m + -var5, (byte) -67);
            id.a((byte) -67, -1);
            return;
          } else {
            L6: {
              field_c = -6;
              var7 = fb.a(jg.f(1), (byte) 102);
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              n.field_b.a(var7, false);
              if (null != sf.field_b) {
                n.field_b.b(0, sf.field_b);
                break L7;
              } else {
                break L7;
              }
            }
            pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
            n.field_b.a(n.field_b.field_m + -var5, (byte) -67);
            id.a((byte) -67, -1);
            return;
          }
        } else {
          L8: {
            n.field_b.b((byte) 11, 18);
            n.field_b.field_m = n.field_b.field_m + 2;
            var5 = n.field_b.field_m;
            n.field_b.f(vk.field_G, 613003928);
            n.field_b.b(1290648728, bl.field_d);
            var6 = 0;
            if (pf.field_g) {
              var6 = var6 | 1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (cb.field_g) {
              var6 = var6 | 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (!param0) {
              break L10;
            } else {
              var6 = var6 | 8;
              break L10;
            }
          }
          L11: {
            if (sf.field_b == null) {
              break L11;
            } else {
              var6 = var6 | 16;
              break L11;
            }
          }
          n.field_b.b((byte) 11, var6);
          if (param2) {
            L12: {
              var7 = fb.a(jg.f(1), (byte) 102);
              if (var7 == null) {
                var7 = "";
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              n.field_b.a(var7, false);
              if (null != sf.field_b) {
                n.field_b.b(0, sf.field_b);
                break L13;
              } else {
                break L13;
              }
            }
            pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
            n.field_b.a(n.field_b.field_m + -var5, (byte) -67);
            id.a((byte) -67, -1);
            return;
          } else {
            L14: {
              field_c = -6;
              var7 = fb.a(jg.f(1), (byte) 102);
              if (var7 == null) {
                var7 = "";
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              n.field_b.a(var7, false);
              if (null != sf.field_b) {
                n.field_b.b(0, sf.field_b);
                break L15;
              } else {
                break L15;
              }
            }
            pa.a(ag.field_s, 0, ad.field_d, re.field_G, (va) (Object) n.field_b);
            n.field_b.a(n.field_b.field_m + -var5, (byte) -67);
            id.a((byte) -67, -1);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This password is part of your Player Name, and would be easy to guess";
        field_e = null;
        field_a = new bh(11, 0, 1, 2);
    }
}
