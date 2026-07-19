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
          if (!this.field_e) {
            L0: {
              if (2 != this.field_f) {
                break L0;
              } else {
                if (this.field_l <= 0) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if ((this.field_c ^ -1L) != (lr.field_v ^ -1L)) {
              if (eo.field_a == 2) {
                if (vc.a(param0 + -8759, this.field_g)) {
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
          this.field_a = -18;
          if (!this.field_e) {
            if (2 == this.field_f) {
              if (this.field_l <= 0) {
                if ((this.field_c ^ -1L) != (lr.field_v ^ -1L)) {
                  if (eo.field_a == 2) {
                    if (vc.a(param0 + -8759, this.field_g)) {
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
              if ((this.field_c ^ -1L) != (lr.field_v ^ -1L)) {
                if (eo.field_a == 2) {
                  if (vc.a(param0 + -8759, this.field_g)) {
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

    public static void a(byte param0) {
        field_i = null;
        int var1 = -86 % ((param0 - 49) / 51);
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 118) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            L2: while (true) {
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
                var15 = (var17[var11] & 16711422) >> 1559202625;
                var10[var11] = var15 + (pg.a(33423360, var12) >> 1176971969) + ((pg.a(33423495, var13) >> 2073497577) + pg.a(var14 >> 1114604145, 255));
                param1 = param1 + param8;
                param9 = param9 + param5;
                param2 = param2 + param4;
                param7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var10_ref);
            stackOut_6_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
            tn.a(1, param1, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "s.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    s(boolean param0) {
        this.field_c = pe.field_g;
        this.field_j = ep.field_x;
        this.field_g = tn.field_t;
        this.field_a = jt.field_t;
        this.field_f = m.field_f;
        this.field_e = sj.field_b;
        this.field_l = km.field_b;
        if (param0) {
            this.field_k = ku.field_e;
        } else {
            this.field_k = null;
        }
        this.field_b = ot.field_a;
    }

    static {
        field_d = new String[]{"explosion1", "explosion2", "explosion3", "big plane explosion", "ufo explosion_fall", "ufo explosion_impact"};
        field_i = new byte[520];
        field_h = "Resume Game";
    }
}
