/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_c;
    static boolean field_a;
    static uc field_b;

    final static int a(byte param0) {
        if (param0 > -77) {
          boolean discarded$2 = ih.a(76, -4, -17, 16, true, -96, 63);
          return (int)(1000000000L / wj.field_E);
        } else {
          return (int)(1000000000L / wj.field_E);
        }
    }

    final static boolean a(String param0, boolean param1, nk param2, int param3, int param4, String param5, String param6) {
        kk var9 = null;
        kk var10 = null;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param3 == 0) {
          if (fi.field_y != ej.field_b) {
            return false;
          } else {
            var10 = new kk(u.field_A, param2);
            u.field_A.b((ub) (Object) var10, (byte) 94);
            if (!ri.c(42)) {
              L0: {
                ki.field_F = null;
                fi.field_y = pl.field_E;
                na.field_l = param0;
                ac.field_t = param4;
                sf.field_a = param5;
                we.field_a = param6;
                if (!param1) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L0;
                }
              }
              ub.field_m = stackIn_19_0 != 0;
              return true;
            } else {
              var10.p(param3 ^ -20371);
              return true;
            }
          }
        } else {
          field_a = true;
          if (fi.field_y != ej.field_b) {
            return false;
          } else {
            var9 = new kk(u.field_A, param2);
            u.field_A.b((ub) (Object) var9, (byte) 94);
            if (!ri.c(42)) {
              L1: {
                ki.field_F = null;
                fi.field_y = pl.field_E;
                na.field_l = param0;
                ac.field_t = param4;
                sf.field_a = param5;
                we.field_a = param6;
                if (!param1) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              ub.field_m = stackIn_9_0 != 0;
              return true;
            } else {
              var9.p(param3 ^ -20371);
              return true;
            }
          }
        }
    }

    final static void a(int param0) {
        if (!qb.field_p) {
            throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(param0 + 11579568, true);
        ml.field_t = param0;
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ih.a((String) null, false, (nk) null, -33, -128, (String) null, (String) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param4) {
          if (param5 >= param0) {
            if (param5 < param0 - -param1) {
              if (param6 >= param3) {
                if (param3 + param2 <= param6) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_a = true;
          if (param5 >= param0) {
            if (param5 < param0 - -param1) {
              if (param6 >= param3) {
                if (param3 + param2 <= param6) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
