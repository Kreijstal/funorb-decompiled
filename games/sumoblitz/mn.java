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
            field_g = (String[]) null;
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
            field_g = (String[]) null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8) {
                break L1;
              } else {
                mn.a((byte) 51);
                break L1;
              }
            }
            L2: while (true) {
              param3--;
              if (-1 < (param3 ^ -1)) {
                break L0;
              } else {
                var17 = param2;
                var10_array = var17;
                var11 = param7;
                var12 = param6;
                var13 = param5;
                var14 = param9;
                var15 = (var17[var11] & 16711422) >> -1499374047;
                var10_array[var11] = eb.a(var12 >> 2127652929, 16711680) - -eb.a(65280, var13 >> -1030814391) - (-eb.a(255, var14 >> 413743537) - var15);
                param9 = param9 + param4;
                param5 = param5 + param0;
                param7++;
                param6 = param6 + param1;
                if (var16 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var10);
            stackOut_9_1 = new StringBuilder().append("mn.E(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(db param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        pl var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var5 = as.field_v;
            var5.g(param2, 8);
            var5.field_p = var5.field_p + 1;
            var4 = var5.field_p;
            if (param1 <= -5) {
              L1: {
                var5.b((byte) 53, 1);
                if (null == param0.field_k) {
                  var5.b((byte) 52, 0);
                  break L1;
                } else {
                  var5.b((byte) 72, param0.field_k.length);
                  var5.a(param0.field_k, (byte) -123, param0.field_k.length, 0);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    var5.b((byte) 52, 0);
                    break L1;
                  }
                }
              }
              discarded$1 = var5.a(var4, false);
              var5.field_p = var5.field_p - 4;
              param0.field_m = var5.c(true);
              var5.c(-var4 + var5.field_p, -13745);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("mn.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        gn var4 = null;
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_19_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_e >= this.field_h) {
                break L2;
              } else {
                var4 = this.field_l[this.field_e];
                stackOut_2_0 = var4.field_a.b((byte) 127);
                stackIn_20_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    L3: {
                      if ((var4.field_e ^ -1) > -1) {
                        break L3;
                      } else {
                        if (var4.field_a.b((byte) -110, var4.field_e)) {
                          break L3;
                        } else {
                          this.a(var4.field_a.a(var4.field_e, (byte) 67), -75, var4);
                          return false;
                        }
                      }
                    }
                    L4: {
                      if (null == var4.field_h) {
                        break L4;
                      } else {
                        if (!var4.field_a.a(var4.field_h, 100)) {
                          this.a(var4.field_a.a(var4.field_h, (byte) 33), -18, var4);
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (0 <= var4.field_e) {
                        break L5;
                      } else {
                        if (var4.field_h != null) {
                          break L5;
                        } else {
                          if (null == var4.field_c) {
                            break L5;
                          } else {
                            if (!var4.field_a.a(true)) {
                              this.a(var4.field_a.a(0), -113, var4);
                              return false;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    this.field_e = this.field_e + 1;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    this.a(0, -111, var4);
                    return false;
                  }
                }
              }
            }
            stackOut_19_0 = param0;
            stackIn_20_0 = stackOut_19_0;
            break L1;
          }
          if (stackIn_20_0 != 100) {
            this.field_a = 103;
            return true;
          } else {
            return true;
          }
        }
    }

    private final void a(int param0, int param1, gn param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -10) {
                break L1;
              } else {
                mn.b((byte) -42);
                break L1;
              }
            }
            L2: {
              var4_float = (float)(1 + this.field_e) + (float)param0 / 100.0f;
              this.field_d = var4_float * (float)this.field_a / (float)(1 + this.field_h);
              if (0 != param0) {
                break L2;
              } else {
                this.field_f = param2.field_f;
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            this.field_f = param2.field_c + " - " + param0 + "%";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("mn.F(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
        field_b = (ri[]) null;
    }

    private mn() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "High";
        field_i = 0;
    }
}
