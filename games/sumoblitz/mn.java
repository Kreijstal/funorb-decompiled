/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    String field_f;
    float field_d;
    static String[] field_g;
    private int field_a;
    static hr field_j;
    private int field_e;
    static ri field_c;
    private int field_h;
    private gn[] field_l;
    static String field_k;
    static int field_i;
    static ri[] field_b;

    final static void b(byte param0) {
        if (null == rf.field_a) {
          L0: {
            if (null != he.field_n) {
              he.field_n.k(-43);
              break L0;
            } else {
              break L0;
            }
          }
          aw.j((byte) 89);
          if (param0 == -116) {
            return;
          } else {
            field_g = null;
            return;
          }
        } else {
          L1: {
            rf.field_a.e(false);
            if (null != he.field_n) {
              he.field_n.k(-43);
              break L1;
            } else {
              break L1;
            }
          }
          aw.j((byte) 89);
          if (param0 == -116) {
            return;
          } else {
            field_g = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        if (!param8) {
          mn.a((byte) 51);
          L0: while (true) {
            param3--;
            if (-1 >= (param3 ^ -1)) {
              var19 = param2;
              var17 = var19;
              var10 = var17;
              var11 = param7;
              var12 = param6;
              var13 = param5;
              var14 = param9;
              var15 = (var19[var11] & 16711422) >> -1499374047;
              var10[var11] = eb.a(var12 >> 2127652929, 16711680) - -eb.a(65280, var13 >> -1030814391) - (-eb.a(255, var14 >> 413743537) - var15);
              param9 = param9 + param4;
              param5 = param5 + param0;
              param7++;
              param6 = param6 + param1;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param3--;
            if (-1 >= (param3 ^ -1)) {
              var18 = param2;
              var17 = var18;
              var10 = var17;
              var11 = param7;
              var12 = param6;
              var13 = param5;
              var14 = param9;
              var15 = (var18[var11] & 16711422) >> -1499374047;
              var10[var11] = eb.a(var12 >> 2127652929, 16711680) - -eb.a(65280, var13 >> -1030814391) - (-eb.a(255, var14 >> 413743537) - var15);
              param9 = param9 + param4;
              param5 = param5 + param0;
              param7++;
              param6 = param6 + param1;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static void a(db param0, int param1, int param2) {
        pl var3 = null;
        int var4 = 0;
        pl var5 = null;
        var5 = as.field_v;
        var3 = var5;
        var5.g(param2, 8);
        var5.field_p = var5.field_p + 1;
        var4 = var5.field_p;
        if (param1 <= -5) {
          var5.b((byte) 53, 1);
          if (null != param0.field_k) {
            var5.b((byte) 72, param0.field_k.length);
            var5.a(param0.field_k, (byte) -123, param0.field_k.length, 0);
            int discarded$4 = var5.a(var4, false);
            var5.field_p = var5.field_p - 4;
            param0.field_m = var5.c(true);
            var5.c(-var4 + var5.field_p, -13745);
            return;
          } else {
            var5.b((byte) 52, 0);
            int discarded$5 = var5.a(var4, false);
            var5.field_p = var5.field_p - 4;
            param0.field_m = var5.c(true);
            var5.c(-var4 + var5.field_p, -13745);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        gn var4 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          if (((mn) this).field_e >= ((mn) this).field_h) {
            if (param0 != 100) {
              ((mn) this).field_a = 103;
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((mn) this).field_l[((mn) this).field_e];
            if (var4.field_a.b((byte) 127)) {
              L1: {
                if ((var4.field_e ^ -1) > -1) {
                  break L1;
                } else {
                  if (var4.field_a.b((byte) -110, var4.field_e)) {
                    break L1;
                  } else {
                    this.a(var4.field_a.a(var4.field_e, (byte) 67), -75, var4);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_h) {
                  break L2;
                } else {
                  if (!var4.field_a.a(var4.field_h, 100)) {
                    this.a(var4.field_a.a(var4.field_h, (byte) 33), -18, var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (0 <= var4.field_e) {
                  break L3;
                } else {
                  if (var4.field_h != null) {
                    break L3;
                  } else {
                    if (null == var4.field_c) {
                      break L3;
                    } else {
                      if (!var4.field_a.a(true)) {
                        this.a(var4.field_a.a(0), -113, var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((mn) this).field_e = ((mn) this).field_e + 1;
              continue L0;
            } else {
              this.a(0, -111, var4);
              return false;
            }
          }
        }
    }

    private final void a(int param0, int param1, gn param2) {
        float var4 = 0.0f;
        if (param1 >= -10) {
            mn.b((byte) -42);
            var4 = (float)(1 + ((mn) this).field_e) + (float)param0 / 100.0f;
            ((mn) this).field_d = var4 * (float)((mn) this).field_a / (float)(1 + ((mn) this).field_h);
            if (0 == param0) {
                ((mn) this).field_f = param2.field_f;
            } else {
                ((mn) this).field_f = param2.field_c + " - " + param0 + "%";
                return;
            }
            return;
        }
        var4 = (float)(1 + ((mn) this).field_e) + (float)param0 / 100.0f;
        ((mn) this).field_d = var4 * (float)((mn) this).field_a / (float)(1 + ((mn) this).field_h);
        if (0 == param0) {
            ((mn) this).field_f = param2.field_f;
        } else {
            ((mn) this).field_f = param2.field_c + " - " + param0 + "%";
            return;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
        field_c = null;
        field_k = null;
        if (param0 == 17) {
            return;
        }
        field_b = null;
    }

    private mn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "High";
        field_i = 0;
    }
}
