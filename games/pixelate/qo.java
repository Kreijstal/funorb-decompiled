/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends mg {
    static fm field_u;
    private c field_p;
    static ak field_q;
    static int field_o;
    static int field_s;
    static String field_m;
    static boolean field_z;
    static ii field_r;
    static String[] field_t;
    static tf field_v;
    static int field_A;
    static ge field_n;
    static int[] field_w;
    static String field_x;
    static java.security.SecureRandom field_y;

    final static String e(int param0) {
        if (param0 != 480) {
            qo.b(false);
            return vi.field_o.h(5);
        }
        return vi.field_o.h(5);
    }

    final String a(int param0, String param1) {
        Object var4 = null;
        ml var5 = null;
        ml var6 = null;
        if (param0 < -76) {
          if (((qo) this).field_p instanceof bp) {
            var6 = ((bp) (Object) ((qo) this).field_p).a(1);
            if (var6 != null) {
              if (var6.a((byte) 68) == qk.field_g) {
                if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                  return var6.b((byte) -7);
                } else {
                  return sk.field_d;
                }
              } else {
                return var6.b((byte) -7);
              }
            } else {
              if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                return null;
              } else {
                return sk.field_d;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
              return null;
            } else {
              return sk.field_d;
            }
          }
        } else {
          var4 = null;
          String discarded$1 = ((qo) this).a(-37, (String) null);
          if (((qo) this).field_p instanceof bp) {
            var5 = ((bp) (Object) ((qo) this).field_p).a(1);
            if (var5 != null) {
              if (var5.a((byte) 68) == qk.field_g) {
                if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                  return var5.b((byte) -7);
                } else {
                  return sk.field_d;
                }
              } else {
                return var5.b((byte) -7);
              }
            } else {
              if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                return null;
              } else {
                return sk.field_d;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((qo) this).field_p.field_q)) {
              return null;
            } else {
              return sk.field_d;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_t = null;
        field_y = null;
        field_v = null;
        field_q = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_w = null;
        if (!param0) {
          return;
        } else {
          field_m = null;
          field_r = null;
          return;
        }
    }

    qo(c param0, c param1) {
        super(param0);
        ((qo) this).field_p = param1;
    }

    final dj a(String param0, boolean param1) {
        ml var3 = null;
        dj stackIn_6_0 = null;
        dj stackIn_11_0 = null;
        dj stackIn_17_0 = null;
        dj stackOut_16_0 = null;
        dj stackOut_15_0 = null;
        dj stackOut_10_0 = null;
        dj stackOut_9_0 = null;
        dj stackOut_5_0 = null;
        dj stackOut_4_0 = null;
        if (param1) {
          if (((qo) this).field_p instanceof bp) {
            var3 = ((bp) (Object) ((qo) this).field_p).a(1);
            if (var3 != null) {
              if (var3.a((byte) 69) == qk.field_g) {
                L0: {
                  if (param0.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                    stackOut_16_0 = qk.field_g;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_15_0 = sk.field_a;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  }
                }
                return stackIn_17_0;
              } else {
                return sk.field_a;
              }
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                  stackOut_10_0 = qk.field_g;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                } else {
                  stackOut_9_0 = sk.field_a;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                }
              }
              return stackIn_11_0;
            }
          } else {
            L2: {
              if (param0.equals((Object) (Object) ((qo) this).field_p.field_q)) {
                stackOut_5_0 = qk.field_g;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = sk.field_a;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Report abuse";
        field_A = 3;
        field_t = new String[]{"The darker squares around the edge of the grid are called the <col=ffff00>buffer zone</col>. They do not count as part of the picture.", "Use them to place awkward pieces half-on, half-off the grid."};
        field_w = new int[8192];
        field_o = 480;
        field_z = true;
        field_x = "Find opponents";
    }
}
