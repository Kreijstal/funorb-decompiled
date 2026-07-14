/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private long field_h;
    int field_f;
    private static int[] field_b;
    String field_k;
    int field_o;
    static int field_n;
    private int field_c;
    static volatile int field_a;
    private String field_i;
    int[] field_g;
    private boolean field_j;
    static String[] field_m;
    int field_d;
    static boolean field_l;
    static int field_p;
    static String field_e;

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_m = null;
        int var1 = -39 % ((62 - param0) / 42);
    }

    final static String a(String param0, String param1, int param2, boolean param3, rh param4) {
        Object var6 = null;
        if (!param4.a(0)) {
          return param1;
        } else {
          if (param3) {
            var6 = null;
            String discarded$2 = vd.a((String) null, (String) null, 53, false, (rh) null);
            return param0 + " - " + param4.b((byte) 42, param2) + "%";
          } else {
            return param0 + " - " + param4.b((byte) 42, param2) + "%";
          }
        }
    }

    final static int a(int param0) {
        double var1 = 0.0;
        if (param0 == 741924304) {
          if (Math.random() < sa.field_c) {
            var1 = Math.random();
            if (0.13 <= var1) {
              if (var1 >= 0.25) {
                if (var1 < 0.65) {
                  return 1;
                } else {
                  return 2;
                }
              } else {
                return 4;
              }
            } else {
              return 3;
            }
          } else {
            return 0;
          }
        } else {
          return 104;
        }
    }

    final int c(int param0) {
        if (!((vd) this).field_j) {
          if (((vd) this).field_f == 2) {
            if (-1 <= (((vd) this).field_c ^ -1)) {
              if (wh.field_n == ((vd) this).field_h) {
                return 1;
              } else {
                if ((vk.field_a ^ -1) == -3) {
                  if (!v.a(((vd) this).field_i, (byte) 89)) {
                    if (param0 <= 113) {
                      int discarded$4 = vd.a(-69);
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 <= 113) {
                    int discarded$5 = vd.a(-69);
                    return 0;
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              return 2;
            }
          } else {
            if (wh.field_n == ((vd) this).field_h) {
              return 1;
            } else {
              if ((vk.field_a ^ -1) == -3) {
                if (!v.a(((vd) this).field_i, (byte) 89)) {
                  if (param0 <= 113) {
                    int discarded$6 = vd.a(-69);
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                if (param0 <= 113) {
                  int discarded$7 = vd.a(-69);
                  return 0;
                } else {
                  return 0;
                }
              }
            }
          }
        } else {
          return 2;
        }
    }

    vd(boolean param0) {
        ((vd) this).field_i = jc.field_b;
        ((vd) this).field_f = gj.field_u;
        ((vd) this).field_h = uf.field_c;
        ((vd) this).field_d = uk.field_o;
        ((vd) this).field_k = re.field_f;
        ((vd) this).field_j = field_l;
        if (param0) {
            ((vd) this).field_g = vj.field_c;
        } else {
            ((vd) this).field_g = null;
        }
        ((vd) this).field_o = tj.field_b;
        ((vd) this).field_c = bm.field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new int[5];
        field_n = 0;
        field_a = 0;
        field_m = new String[]{"All scores", "My scores", "Best each"};
        field_p = 6;
        var0 = 0;
        L0: while (true) {
          if (field_b.length <= var0) {
            field_e = "Excellent! Now try connecting three of a kind by shape.<br>Press <img=2> to continue.";
          } else {
            L1: {
              if (-1 != (var0 ^ -1)) {
                field_b[var0] = (1 + var0) * 51 << -874678192;
                break L1;
              } else {
                field_b[var0] = (var0 - -1) * 20 << 741924304;
                break L1;
              }
            }
            if ((var0 ^ -1) < -3) {
              field_b[var0] = lb.a(field_b[var0], (var0 + -2) * 22 << 1940867656);
              var0++;
              var0++;
              continue L0;
            } else {
              var0++;
              var0++;
              var0++;
              continue L0;
            }
          }
        }
    }
}
