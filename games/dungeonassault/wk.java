/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String[] field_a;
    private int field_d;
    private int field_e;
    static char[] field_f;
    float field_j;
    private bl[] field_i;
    static int field_g;
    static int field_h;
    private int field_c;
    String field_b;

    final boolean a(boolean param0) {
        int var3;
        bl var4;
        L0: {
          var3 = DungeonAssault.field_K;
          if (!param0) {
            break L0;
          } else {
            wk.a(73, -60);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e > this.field_d) {
            var4 = this.field_i[this.field_d];
            if (!var4.field_q.a(-14354)) {
              this.a((byte) 12, 0, var4);
              return false;
            } else {
              L2: {
                if (0 > var4.field_m) {
                  break L2;
                } else {
                  if (!var4.field_q.a(false, var4.field_m)) {
                    this.a((byte) 12, var4.field_q.c(-123, var4.field_m), var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_h == null) {
                  break L3;
                } else {
                  if (!var4.field_q.a(false, var4.field_h)) {
                    this.a((byte) 12, var4.field_q.b(var4.field_h, -1), var4);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var4.field_m >= 0) {
                  break L4;
                } else {
                  if (var4.field_h != null) {
                    break L4;
                  } else {
                    if (null == var4.field_f) {
                      break L4;
                    } else {
                      if (!var4.field_q.a((byte) 59)) {
                        this.a((byte) 12, var4.field_q.b(100), var4);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_d = this.field_d + 1;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, String param1, se param2, int param3, int[] param4, int param5) {
        tf var6 = null;
        if (param5 != 31139) {
            return;
        }
        try {
            var6 = new tf(param2, param1, param4);
            var6.b(-param2.field_H + param3, 32, -var6.field_i + param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "wk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private final void a(byte param0, int param1, bl param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_float = (float)(this.field_d + 1) + (float)param1 / 100.0f;
            this.field_j = (float)this.field_c * var4_float / (float)(this.field_e + 1);
            if (param0 == 12) {
              break L0;
            } else {
              var5 = (int[]) null;
              wk.a(-109, (String) null, (se) null, 89, (int[]) null, -3);
              break L0;
            }
          }
          if (param1 != 0) {
            this.field_b = param2.field_f + " - " + param1 + "%";
            return;
          } else {
            this.field_b = param2.field_g;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("wk.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            wk.a(105, 105);
            field_a = null;
            field_f = null;
            return;
        }
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            wk.c(true);
            sn.a(66, 17);
            return;
        }
        sn.a(66, 17);
    }

    final static cn[] a(cn[] param0, int param1) {
        cn[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        cn[] var5 = null;
        cn[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var5 = new cn[param0.length];
            var2 = var5;
            var3 = param1;
            L1: while (true) {
              if (param0.length <= var3) {
                stackIn_5_0 = (cn[]) (var2);
                break L0;
              } else {
                var5[var3] = g.a(param0[var3], (byte) -105);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("wk.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static int c(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            lg.field_w.a(wo.field_b, (byte) 66, ci.field_m, true);
            lg.field_w.b(true);
            L1: while (true) {
              if (!ha.b((byte) 47)) {
                if (!param0) {
                  if (0 != (ki.field_f ^ -1)) {
                    var1_int = ki.field_f;
                    sn.a(16, -1);
                    stackIn_10_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (cd.field_b) {
                      stackIn_14_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (wd.field_d != ql.field_f) {
                        if (!im.field_b.b(36)) {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ol.field_i == ql.field_f) {
                            stackIn_25_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            return -1;
                          }
                        }
                      } else {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_6_0 = 11;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                lg.field_w.a(126, mm.field_t, ob.field_Yb);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "wk.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_25_0;
                }
              }
            }
          }
        }
    }

    private final void a(nh param0, String param1, String param2, boolean param3, int param4, String param5) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        bl[] var7 = null;
        bl var7_ref = null;
        RuntimeException var7_ref2 = null;
        int[] var8 = null;
        bl var9 = null;
        bl[] var10 = null;
        bl var11 = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var8 = (int[]) null;
                wk.a(13, (String) null, (se) null, -71, (int[]) null, -117);
                break L1;
              }
            }
            L2: {
              if (this.field_i.length <= this.field_e) {
                var10 = new bl[this.field_e * 2];
                var7 = var10;
                cj.a(this.field_i, 0, var10, 0, this.field_e);
                this.field_i = var10;
                break L2;
              } else {
                break L2;
              }
            }
            var9 = new bl();
            var11 = var9;
            var7_ref = var11;
            var11.field_g = param5;
            var11.field_h = param2;
            var11.field_m = param4;
            var11.field_f = param1;
            var11.field_q = param0;
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_i[fieldTemp$0] = var9;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7_ref2);

            stackIn_9_1 = new StringBuilder().append("wk.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ')');
        }
    }

    final void a(String param0, String param1, String param2, nh param3, int param4) {
        RuntimeException runtimeException = null;
        cn[] var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param3, param0, param1, false, -1, param2);
              if (param4 < -75) {
                break L1;
              } else {
                var7 = (cn[]) null;
                wk.a((cn[]) null, 114);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wk.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, String param2, nh param3) {
        if (param1 != 237) {
            return;
        }
        try {
            this.a(param3, param2, (String) null, false, -1, param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "wk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        L0: {
          var2 = 0;
          if (0 == (param0 & 7)) {
            break L0;
          } else {
            var2 = -(param0 & 7) + 8;
            break L0;
          }
        }
        if (param1 != 18605) {
          wk.c(true);
          var3 = var2 + param0;
          return var3;
        } else {
          var3 = var2 + param0;
          return var3;
        }
    }

    wk(int param0) {
        this.field_i = new bl[16];
        this.field_c = param0;
    }

    static {
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
