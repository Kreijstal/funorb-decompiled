/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    int field_f;
    static String[] field_d;
    String field_j;
    static byte[] field_i;
    private int field_l;
    int[] field_k;
    int field_b;
    private String field_g;
    int field_a;
    private boolean field_e;
    static String field_h;
    private long field_c;

    final int a(int param0) {
        if (param0 == 0) {
          if (!((s) this).field_e) {
            L0: {
              if (2 != ((s) this).field_f) {
                break L0;
              } else {
                if (((s) this).field_l <= 0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (~((s) this).field_c != ~lr.field_v) {
              if (eo.field_a == 2) {
                if (vc.a(param0 + -8759, ((s) this).field_g)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          ((s) this).field_a = -18;
          if (!((s) this).field_e) {
            if (2 == ((s) this).field_f) {
              if (((s) this).field_l <= 0) {
                if (~((s) this).field_c != ~lr.field_v) {
                  if (eo.field_a == 2) {
                    if (vc.a(param0 + -8759, ((s) this).field_g)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              if (~((s) this).field_c != ~lr.field_v) {
                if (eo.field_a == 2) {
                  if (vc.a(param0 + -8759, ((s) this).field_g)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 2;
          }
        }
    }

    public static void a() {
        field_i = null;
        int var1 = 0;
        field_h = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param6--;
              if (0 > param6) {
                break L0;
              } else {
                var17 = param3;
                var10 = var17;
                var11 = param7;
                var12 = param1;
                var13 = param9;
                var14 = param2;
                var15 = (var17[var11] & 16711422) >> 1;
                var10[var11] = var15 + (pg.a(33423360, var12) >> 1) + ((pg.a(33423495, var13) >> 9) + pg.a(var14 >> 17, 255));
                param1 = param1 + param8;
                param9 = param9 + param5;
                param2 = param2 + param4;
                param7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10_ref;
            stackOut_5_1 = new StringBuilder().append("s.A(").append(118).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
            tn.a(1, false, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "s.B(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    s(boolean param0) {
        ((s) this).field_c = pe.field_g;
        ((s) this).field_j = ep.field_x;
        ((s) this).field_g = tn.field_t;
        ((s) this).field_a = jt.field_t;
        ((s) this).field_f = m.field_f;
        ((s) this).field_e = sj.field_b;
        ((s) this).field_l = km.field_b;
        if (param0) {
            ((s) this).field_k = ku.field_e;
        } else {
            ((s) this).field_k = null;
        }
        ((s) this).field_b = ot.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"explosion1", "explosion2", "explosion3", "big plane explosion", "ufo explosion_fall", "ufo explosion_impact"};
        field_i = new byte[520];
        field_h = "Resume Game";
    }
}
