/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends eb {
    private g field_r;
    je field_u;
    static String field_v;
    static uh field_t;
    fg field_s;

    final eb c() {
        oc var1_ref = null;
        int var2 = TetraLink.field_J;
        do {
            var1_ref = (oc) ((Object) this.field_u.a((byte) -70));
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_I == null);
        return (eb) ((Object) var1_ref.field_I);
    }

    final eb b() {
        oc var1 = null;
        var1 = (oc) ((Object) this.field_u.c(false));
        if (var1 != null) {
          if (var1.field_I != null) {
            return (eb) ((Object) var1.field_I);
          } else {
            return this.c();
          }
        } else {
          return null;
        }
    }

    private final void a(boolean param0, int param1, oc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        g stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        oc stackIn_8_2 = null;
        g stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        oc stackIn_9_2 = null;
        g stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oc stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        g stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        oc stackOut_7_2 = null;
        g stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        oc stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        g stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        oc stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if ((this.field_r.field_I[param2.field_n] & 4) == 0) {
                  break L1;
                } else {
                  if (0 <= param2.field_v) {
                    break L1;
                  } else {
                    var4_int = this.field_r.field_T[param2.field_n] / nk.field_k;
                    var5 = (1048575 + var4_int - param2.field_F) / var4_int;
                    param2.field_F = param2.field_F - -(var4_int * param1) & 1048575;
                    if (var5 <= param1) {
                      L2: {
                        if (-1 == (this.field_r.field_G[param2.field_n] ^ -1)) {
                          param2.field_I = ee.a(param2.field_y, param2.field_I.i(), param2.field_I.k(), param2.field_I.j());
                          break L2;
                        } else {
                          L3: {
                            param2.field_I = ee.a(param2.field_y, param2.field_I.i(), 0, param2.field_I.j());
                            stackOut_7_0 = this.field_r;
                            stackOut_7_1 = 0;
                            stackOut_7_2 = (oc) (param2);
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            if ((param2.field_B.field_o[param2.field_E] ^ -1) <= -1) {
                              stackOut_9_0 = (g) ((Object) stackIn_9_0);
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = (oc) ((Object) stackIn_9_2);
                              stackOut_9_3 = 0;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              stackIn_10_2 = stackOut_9_2;
                              stackIn_10_3 = stackOut_9_3;
                              break L3;
                            } else {
                              stackOut_8_0 = (g) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (oc) ((Object) stackIn_8_2);
                              stackOut_8_3 = 1;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_10_2 = stackOut_8_2;
                              stackIn_10_3 = stackOut_8_3;
                              break L3;
                            }
                          }
                          ((g) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2, stackIn_10_3 != 0);
                          break L2;
                        }
                      }
                      L4: {
                        if (0 <= param2.field_B.field_o[param2.field_E]) {
                          break L4;
                        } else {
                          param2.field_I.c(-1);
                          break L4;
                        }
                      }
                      param1 = param2.field_F / var4_int;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              param2.field_I.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("wn.D(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 != 20406) {
            field_t = (uh) null;
            field_t = null;
            return;
        }
        field_t = null;
    }

    final static qa a(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        qa var2 = null;
        qa stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        qa stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_t = (uh) null;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              var2 = n.field_U.a(var1_int, true);
              if (var2.field_w) {
                stackOut_5_0 = (qa) (var2);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_6_0;
    }

    private final void a(oc param0, int[] param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ee var11 = null;
        int var12 = 0;
        g stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        oc stackIn_10_2 = null;
        g stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        oc stackIn_11_2 = null;
        g stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        oc stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        g stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        oc stackOut_9_2 = null;
        g stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        oc stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        g stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        oc stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if ((this.field_r.field_I[param0.field_n] & 4) == 0) {
                break L1;
              } else {
                if ((param0.field_v ^ -1) <= -1) {
                  break L1;
                } else {
                  var7_int = this.field_r.field_T[param0.field_n] / nk.field_k;
                  L2: while (true) {
                    var8 = (-param0.field_F + (var7_int + 1048575)) / var7_int;
                    if (param3 < var8) {
                      param0.field_F = param0.field_F + var7_int * param3;
                      break L1;
                    } else {
                      L3: {
                        param0.field_I.b(param1, param2, var8);
                        param2 = param2 + var8;
                        param0.field_F = param0.field_F + (var8 * var7_int - 1048576);
                        param3 = param3 - var8;
                        var9 = nk.field_k / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_I;
                        if (this.field_r.field_G[param0.field_n] != 0) {
                          L5: {
                            param0.field_I = ee.a(param0.field_y, var11.i(), 0, var11.j());
                            stackOut_9_0 = this.field_r;
                            stackOut_9_1 = 0;
                            stackOut_9_2 = (oc) (param0);
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            if (param0.field_B.field_o[param0.field_E] >= 0) {
                              stackOut_11_0 = (g) ((Object) stackIn_11_0);
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (oc) ((Object) stackIn_11_2);
                              stackOut_11_3 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              stackIn_12_3 = stackOut_11_3;
                              break L5;
                            } else {
                              stackOut_10_0 = (g) ((Object) stackIn_10_0);
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = (oc) ((Object) stackIn_10_2);
                              stackOut_10_3 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              stackIn_12_3 = stackOut_10_3;
                              break L5;
                            }
                          }
                          ((g) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2, stackIn_12_3 != 0);
                          param0.field_I.b(var9, var11.k());
                          break L4;
                        } else {
                          param0.field_I = ee.a(param0.field_y, var11.i(), var11.k(), var11.j());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_B.field_o[param0.field_E]) {
                          param0.field_I.c(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.g(var9);
                      var11.b(param1, param2, param5 + -param2);
                      if (var11.g()) {
                        this.field_s.a(var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            if (!param4) {
              param0.field_I.b(param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("wn.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2 = 0;
        oc var3 = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        this.field_s.a(param0);
        var3 = (oc) ((Object) this.field_u.c(false));
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (this.field_r.b((byte) 108, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_s) {
                    this.a(false, var2, var3);
                    var3.field_s = var3.field_s - var2;
                    break L1;
                  } else {
                    this.a(false, var3.field_s, var3);
                    var2 = var2 - var3.field_s;
                    if (this.field_r.a(0, (int[]) null, var2, var3, 21107)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (oc) ((Object) this.field_u.a((byte) -70));
            continue L0;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            this.field_s.b(param0, param1, param2);
            var6 = (oc) ((Object) this.field_u.c(false));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (this.field_r.b((byte) 127, var6)) {
                    break L2;
                  } else {
                    var5 = param2;
                    var4_int = param1;
                    L3: while (true) {
                      if (var6.field_s >= var5) {
                        this.a(var6, param0, var4_int, var5, false, var5 + var4_int);
                        var6.field_s = var6.field_s - var5;
                        break L2;
                      } else {
                        this.a(var6, param0, var4_int, var6.field_s, false, var4_int - -var5);
                        var5 = var5 - var6.field_s;
                        var4_int = var4_int + var6.field_s;
                        if (this.field_r.a(var4_int, param0, var5, var6, 21107)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var6 = (oc) ((Object) this.field_u.a((byte) -70));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wn.BA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    wn(g param0) {
        this.field_u = new je();
        this.field_s = new fg();
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
