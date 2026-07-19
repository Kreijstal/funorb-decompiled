/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os extends hn {
    at field_p;
    private ih field_r;
    static int field_o;
    uv field_s;
    static String field_q;

    final hn b() {
        Object var1 = null;
        mi var1_ref = null;
        int var2 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: while (true) {
          L1: {
            var1_ref = (mi) ((Object) this.field_p.a((byte) 123));
            if (var1_ref != null) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_5_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var2 != 0) {
                break L1;
              } else {
                return (hn) ((Object) stackIn_3_0);
              }
            }
          }
          if (stackIn_5_0 == var1_ref.field_K) {
            continue L0;
          } else {
            return (hn) ((Object) var1_ref.field_K);
          }
        }
    }

    final hn a() {
        mi var1 = (mi) ((Object) this.field_p.e((byte) 99));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_K)) {
            return (hn) ((Object) var1.field_K);
        }
        return this.b();
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_s.b(param0, param1, param2);
            var6 = (mi) ((Object) this.field_p.e((byte) 94));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  stackOut_5_0 = this.field_r.c((byte) -109, var6);
                  stackIn_6_0 = stackOut_5_0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (!stackIn_6_0) {
                          break L4;
                        } else {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4_int = param1;
                      var5 = param2;
                      L5: while (true) {
                        if (var6.field_w >= var5) {
                          this.a(var4_int, var4_int - -var5, param0, -1, var6, var5);
                          var6.field_w = var6.field_w - var5;
                          break L3;
                        } else {
                          this.a(var4_int, var5 + var4_int, param0, -1, var6, var6.field_w);
                          var5 = var5 - var6.field_w;
                          var4_int = var4_int + var6.field_w;
                          stackOut_10_0 = this.field_r.a(var5, var4_int, var6, (byte) 116, param0);
                          stackIn_6_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var7 != 0) {
                            continue L2;
                          } else {
                            if (stackIn_11_0) {
                              break L3;
                            } else {
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                    var6 = (mi) ((Object) this.field_p.a((byte) 123));
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("os.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >>> 1589591487;
        if (param2 != 1589591487) {
            return 83;
        }
        return (param1 - -var3) / param0 - var3;
    }

    final static boolean e(int param0) {
        int discarded$12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            discarded$12 = os.a(-56, 74, 21);
            if (vi.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (vi.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int g(int param0) {
        if (param0 != 4) {
            return 68;
        }
        return av.field_a;
    }

    final void a(int param0) {
        int var2 = 0;
        mi var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_s.a(param0);
        var3 = (mi) ((Object) this.field_p.e((byte) 103));
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              L1: {
                L2: {
                  if (!this.field_r.c((byte) -97, var3)) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = param0;
                L3: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var3, (byte) 16, var2);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3, (byte) 16, var3.field_w);
                    var2 = var2 - var3.field_w;
                    if (!this.field_r.a(var2, 0, var3, (byte) 78, (int[]) null)) {
                      continue L3;
                    } else {
                      if (var4 != 0) {
                        var3.field_w = var3.field_w - var2;
                        break L1;
                      } else {
                        if (var4 == 0) {
                          break L1;
                        } else {
                          this.a(var3, (byte) 16, var2);
                          var3.field_w = var3.field_w - var2;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (mi) ((Object) this.field_p.a((byte) 123));
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(mi param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ih stackIn_7_0 = null;
        ih stackIn_8_0 = null;
        ih stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_6_0 = null;
        ih stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ih stackOut_7_0 = null;
        int stackOut_7_1 = 0;
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
            L1: {
              if ((this.field_r.field_o[param0.field_m] & 4) == 0) {
                break L1;
              } else {
                if (0 <= param0.field_x) {
                  break L1;
                } else {
                  var4_int = this.field_r.field_s[param0.field_m] / rc.field_d;
                  var5 = (1048575 + var4_int + -param0.field_B) / var4_int;
                  param0.field_B = var4_int * param2 + param0.field_B & 1048575;
                  if (param2 < var5) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (0 != this.field_r.field_W[param0.field_m]) {
                          break L3;
                        } else {
                          param0.field_K = aa.b(param0.field_q, param0.field_K.h(), param0.field_K.l(), param0.field_K.k());
                          if (!ArmiesOfGielinor.field_M) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        param0.field_K = aa.b(param0.field_q, param0.field_K.h(), 0, param0.field_K.k());
                        stackOut_6_0 = this.field_r;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (0 <= param0.field_H.field_r[param0.field_D]) {
                          stackOut_8_0 = (ih) ((Object) stackIn_8_0);
                          stackOut_8_1 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          break L4;
                        } else {
                          stackOut_7_0 = (ih) ((Object) stackIn_7_0);
                          stackOut_7_1 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          break L4;
                        }
                      }
                      ((ih) (Object) stackIn_9_0).a(stackIn_9_1 != 0, param0, 16);
                      break L2;
                    }
                    L5: {
                      if (0 <= param0.field_H.field_r[param0.field_D]) {
                        break L5;
                      } else {
                        param0.field_K.f(-1);
                        break L5;
                      }
                    }
                    param2 = param0.field_B / var4_int;
                    break L1;
                  }
                }
              }
            }
            L6: {
              if (param1 == 16) {
                break L6;
              } else {
                os.f(119);
                break L6;
              }
            }
            param0.field_K.a(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("os.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int c() {
        return 0;
    }

    os(ih param0) {
        this.field_p = new at();
        this.field_s = new uv();
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "os.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, int param3, mi param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aa var11 = null;
        int var12 = 0;
        ih stackIn_15_0 = null;
        ih stackIn_16_0 = null;
        ih stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_14_0 = null;
        ih stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ih stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == (this.field_r.field_o[param4.field_m] & 4 ^ -1)) {
                break L1;
              } else {
                if (-1 < (param4.field_x ^ -1)) {
                  var7_int = this.field_r.field_s[param4.field_m] / rc.field_d;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          var8 = (-param4.field_B + (var7_int + 1048575)) / var7_int;
                          if (param5 >= var8) {
                            break L5;
                          } else {
                            if (var12 != 0) {
                              break L4;
                            } else {
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param4.field_K.b(param2, param0, var8);
                        param0 = param0 + var8;
                        param5 = param5 - var8;
                        param4.field_B = param4.field_B + (-1048576 + var7_int * var8);
                        break L4;
                      }
                      L6: {
                        var9 = rc.field_d / 100;
                        var10 = 262144 / var7_int;
                        if (var9 > var10) {
                          var9 = var10;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          var11 = param4.field_K;
                          if (this.field_r.field_W[param4.field_m] == 0) {
                            break L8;
                          } else {
                            L9: {
                              param4.field_K = aa.b(param4.field_q, var11.h(), 0, var11.k());
                              stackOut_14_0 = this.field_r;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if ((param4.field_H.field_r[param4.field_D] ^ -1) <= -1) {
                                stackOut_16_0 = (ih) ((Object) stackIn_16_0);
                                stackOut_16_1 = 0;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                break L9;
                              } else {
                                stackOut_15_0 = (ih) ((Object) stackIn_15_0);
                                stackOut_15_1 = 1;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                break L9;
                              }
                            }
                            ((ih) (Object) stackIn_17_0).a(stackIn_17_1 != 0, param4, 16);
                            param4.field_K.d(var9, var11.l());
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param4.field_K = aa.b(param4.field_q, var11.h(), var11.l(), var11.k());
                        break L7;
                      }
                      L10: {
                        if (-1 >= (param4.field_H.field_r[param4.field_D] ^ -1)) {
                          break L10;
                        } else {
                          param4.field_K.f(-1);
                          break L10;
                        }
                      }
                      L11: {
                        var11.h(var9);
                        var11.b(param2, param0, -param0 + param1);
                        if (!var11.e()) {
                          break L11;
                        } else {
                          this.field_s.a(var11);
                          break L11;
                        }
                      }
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                    param4.field_B = param4.field_B + param5 * var7_int;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            param4.field_K.b(param2, param0, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var7);
            stackOut_27_1 = new StringBuilder().append("os.H(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          L13: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param5 + ')');
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 == 1048575) {
            return;
        }
        field_o = 68;
    }

    static {
        field_q = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
