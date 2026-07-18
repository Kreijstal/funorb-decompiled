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
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (param3 < 0) {
                break L0;
              } else {
                var17 = param2;
                var10 = var17;
                var11 = param7;
                var12 = param6;
                var13 = param5;
                var14 = param9;
                var15 = (var17[var11] & 16711422) >> 1;
                var10[var11] = eb.a(var12 >> 1, 16711680) - -eb.a(65280, var13 >> 9) - (-eb.a(255, var14 >> 17) - var15);
                param9 = param9 + param4;
                param5 = param5 + param0;
                param7++;
                param6 = param6 + param1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10_ref;
            stackOut_5_1 = new StringBuilder().append("mn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + true + ',' + param9 + ')');
        }
    }

    final static void a(db param0, int param1, int param2) {
        pl var5 = as.field_v;
        pl var3 = var5;
        var5.g(param2, 8);
        var5.field_p = var5.field_p + 1;
        int var4 = var5.field_p;
        if (param1 > -5) {
            return;
        }
        try {
            var5.b((byte) 53, 1);
            if (null != param0.field_k) {
                var5.b((byte) 72, param0.field_k.length);
                var5.a(param0.field_k, (byte) -123, param0.field_k.length, 0);
            } else {
                var5.b((byte) 52, 0);
            }
            int discarded$0 = var5.a(var4, false);
            var5.field_p = var5.field_p - 4;
            param0.field_m = var5.c(true);
            var5.c(-var4 + var5.field_p, -13745);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
                if (var4.field_e < 0) {
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
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
        try {
          L0: {
            if (param1 < -10) {
              break L0;
            } else {
              mn.b((byte) -42);
              break L0;
            }
          }
          var4_float = (float)(1 + ((mn) this).field_e) + (float)param0 / 100.0f;
          ((mn) this).field_d = var4_float * (float)((mn) this).field_a / (float)(1 + ((mn) this).field_h);
          if (0 != param0) {
            ((mn) this).field_f = param2.field_c + " - " + param0 + "%";
            return;
          } else {
            ((mn) this).field_f = param2.field_f;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("mn.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_b = null;
        field_j = null;
        field_c = null;
        field_k = null;
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
