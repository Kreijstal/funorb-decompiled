/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int field_d;
    private int field_a;
    private int field_g;
    private gj[] field_j;
    static byte[][] field_e;
    private int field_i;
    String field_b;
    static int field_c;
    static int[] field_h;
    float field_f;

    public static void a(int param0) {
        field_e = (byte[][]) null;
        field_h = null;
        if (param0 == 26) {
            return;
        }
        ji var2 = (ji) null;
        ja.a((byte) -91, (ji) null, false);
    }

    final static void a(byte param0, ji param1, boolean param2) {
        try {
            if (ha.field_w.field_p == param1) {
                ha.field_w.field_p = null;
            }
            if (!(ha.field_w.field_u != param1)) {
                ha.field_w.field_u = null;
            }
            db.a(true, 256, param1);
            int var3_int = -47 % ((param0 - -45) / 56);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var3;
        gj var4;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (param0 <= -32) {
            break L0;
          } else {
            this.field_i = -29;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_a > this.field_i) {
            var4 = this.field_j[this.field_i];
            if (!var4.field_a.a(-15879)) {
              this.a(0, 20467, var4);
              return false;
            } else {
              L2: {
                if ((var4.field_f ^ -1) > -1) {
                  break L2;
                } else {
                  if (var4.field_a.a(var4.field_f, (byte) 8)) {
                    break L2;
                  } else {
                    this.a(var4.field_a.b(-8102, var4.field_f), 20467, var4);
                    return false;
                  }
                }
              }
              L3: {
                if (null == var4.field_c) {
                  break L3;
                } else {
                  if (!var4.field_a.a(-8088, var4.field_c)) {
                    this.a(var4.field_a.b(-113, var4.field_c), 20467, var4);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((var4.field_f ^ -1) <= -1) {
                  break L4;
                } else {
                  if (null != var4.field_c) {
                    break L4;
                  } else {
                    if (var4.field_g == null) {
                      break L4;
                    } else {
                      if (var4.field_a.e(0)) {
                        break L4;
                      } else {
                        this.a(var4.field_a.c(0), 20467, var4);
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_i = this.field_i + 1;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!nf.a(param0, param2 ^ -29205)) {
              if (pb.a(param2 ^ 17032, param0)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!vg.a(true, param0)) {
                  if (param1.length() == 0) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (kc.a(param0, true, param1)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L1: {
                        if (param2 == 0) {
                          break L1;
                        } else {
                          field_d = -123;
                          break L1;
                        }
                      }
                      if (!vh.a(param1, param2 ^ 29360, param0)) {
                        if (!eg.a(false, param1, param0)) {
                          stackIn_27_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("ja.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0 != 0;
                    } else {
                      return stackIn_27_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, gj param2) {
        float var4_float = 0.0f;
        try {
            if (param1 != 20467) {
                this.field_j = (gj[]) null;
            }
            var4_float = (float)(this.field_i + 1) + (float)param0 / 100.0f;
            if (-1 == (param0 ^ -1)) {
                this.field_b = param2.field_e;
            } else {
                this.field_b = param2.field_g + " - " + param0 + "%";
            }
            this.field_f = (float)this.field_g * var4_float / (float)(1 + this.field_a);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ja.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(oj param0, byte param1, oc param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-2 <= (param0.field_F ^ -1)) {
                break L1;
              } else {
                param0.field_F = param0.field_F - 1;
                break L1;
              }
            }
            L2: {
              if (param0.field_F <= 0) {
                break L2;
              } else {
                if (param0.field_F >= 220) {
                  break L2;
                } else {
                  if (param0.field_I <= 0) {
                    break L2;
                  } else {
                    param0.field_e = param0.field_e + 1;
                    if (1000 < param0.field_e) {
                      param0.field_I = param0.field_I - 1;
                      param0.field_e = 0;
                      mm.field_m[el.field_j] = new oj(param2, 1, rl.field_c);
                      mm.field_m[el.field_j].field_F = 1;
                      el.field_j = el.field_j + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            if (param1 == 113) {
              break L0;
            } else {
              field_c = -3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ja.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(-1 == (param0 & param1 ^ -1))) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    private ja() throws Throwable {
        throw new Error();
    }

    static {
        field_d = 0;
        field_h = new int[]{32, 26};
    }
}
