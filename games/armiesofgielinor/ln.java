/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static boolean field_e;
    int[] field_b;
    static byte[] field_d;
    static String field_c;
    int[] field_a;

    final int b(byte param0) {
        if (!((this.field_a[4] ^ -1) != 0)) {
            return -20;
        }
        int var2 = -4 % ((47 - param0) / 62);
        return 0;
    }

    final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        int discarded$2 = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                discarded$2 = this.b((byte) 83);
                break L1;
              }
            }
            stackOut_2_0 = cc.a(param5, param3, this.field_a, param6, -1, true, param2, param4, this.field_b, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("ln.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 21930) {
          this.a(42, -104, -118);
          return tt.a(param0 - param3, param4 + -param2, this.field_a, false);
        } else {
          return tt.a(param0 - param3, param4 + -param2, this.field_a, false);
        }
    }

    final String a(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = "coat=";
        var3 = -16 % ((param0 - -23) / 40);
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_a.length <= var4) {
                break L2;
              } else {
                stackOut_2_0 = var2 + this.field_a[var4] + ":" + this.field_b[var4] + ":";
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  var2 = stackIn_3_0;
                  var4++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_4_0 = (String) (var2);
            stackIn_5_0 = stackOut_4_0;
            break L1;
          }
          return stackIn_5_0;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_d = null;
    }

    final static void a(kl param0, kl param1, kl param2, int param3) {
        qb[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ck.field_e = new qb[or.field_f.length][];
            var4_int = param3;
            L1: while (true) {
              L2: {
                L3: {
                  if (or.field_f.length <= var4_int) {
                    break L3;
                  } else {
                    var10 = or.field_f[var4_int];
                    var5 = var10;
                    var6_int = jq.field_I[var4_int].length;
                    array$1 = new qb[var6_int];
                    ck.field_e[var4_int] = array$1;
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var7 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          if (var6_int <= var7) {
                            var4_int++;
                            break L5;
                          } else {
                            var8 = jq.field_I[var4_int][var7];
                            ck.field_e[var4_int][var7] = new qb(param0, var10, var8);
                            var7++;
                            if (var9 != 0) {
                              break L5;
                            } else {
                              continue L4;
                            }
                          }
                        }
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = ta.field_L;
                stackIn_12_0 = stackOut_11_0 ? 1 : 0;
                break L2;
              }
              L6: {
                L7: {
                  if (stackIn_12_0 == 0) {
                    var4_int = 0;
                    L8: while (true) {
                      if (-7 >= (var4_int ^ -1)) {
                        break L7;
                      } else {
                        var11 = ArmiesOfGielinor.field_N[var4_int];
                        var5 = var11;
                        if (var9 != 0) {
                          break L6;
                        } else {
                          L9: {
                            L10: {
                              if (var5 == null) {
                                pv.field_a[var4_int] = new qb[]{};
                                if (var9 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            }
                            pv.field_a[var4_int] = new qb[1];
                            var6 = bv.field_u[var4_int];
                            pv.field_a[var4_int][0] = new qb(param0, var11, var6);
                            break L9;
                          }
                          var4_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                nl.a(param1, ck.field_e, param2, (byte) 126);
                nl.a(param1, pv.field_a, param2, (byte) 126);
                qv.c(param3 ^ -11757);
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("ln.B(");
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
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          L12: {
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
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < 52) {
            return;
        }
        this.field_a[param2] = param1;
    }

    final wk a(String param0, byte param1, boolean param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        nj stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_4_0 = null;
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
            L1: {
              no.field_P.field_v = qn.field_g;
              if (param1 == -70) {
                break L1;
              } else {
                var5 = (String) null;
                this.a(false, true, (byte) -47, true, false, true, -69, (String) null, 102);
                break L1;
              }
            }
            L2: {
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              ku.field_J.b();
              qn.b();
              if (param2) {
                break L2;
              } else {
                var4_int = this.field_a[3];
                this.field_a[3] = -1;
                discarded$4 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param0, this.field_b, 0);
                this.field_a[3] = var4_int;
                break L2;
              }
            }
            discarded$5 = dm.a(-1, -1, this.field_a, -1, false, this.field_b, -1, false, 0, false, 0, param0);
            no.field_P.b();
            stackOut_4_0 = ew.a((byte) 107, ku.field_J);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("ln.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (wk) ((Object) stackIn_5_0);
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, String param5, boolean param6, boolean param7, boolean param8, int param9) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var11 = null;
        int[] var11_array = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                no.field_P.field_v = qn.field_g;
                no.field_P.field_B = qn.field_d;
                no.field_P.field_y = qn.field_l;
                if (param8) {
                  L3: {
                    L4: {
                      if (null == dv.field_k) {
                        break L4;
                      } else {
                        if (param1 != t.field_f) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    dv.field_k = a.field_m[0].g();
                    var21 = dv.field_k.field_B;
                    var20 = var21;
                    var19 = var20;
                    var11_array = var19;
                    var12 = 0;
                    L5: while (true) {
                      if (var21.length <= var12) {
                        break L3;
                      } else {
                        var13 = 255 & var21[var12];
                        var14 = (param1 >> -460363248 & 255) * var13 >> 117135016;
                        var15 = var13 * ((65280 & param1) >> -440616568) >> 581166312;
                        var16 = (255 & param1) * var13 >> 599129992;
                        var11_array[var12] = (var15 << -644131672) + ((var14 << 1530946064) + var16);
                        var12++;
                        if (var17 != 0) {
                          break L1;
                        } else {
                          if (var17 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
                  break L2;
                } else {
                  break L2;
                }
              }
              ku.field_J.b();
              qn.b();
              break L1;
            }
            L6: {
              L7: {
                if (param6) {
                  break L7;
                } else {
                  var11_int = this.field_a[3];
                  this.field_a[3] = -1;
                  discarded$2 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param5, this.field_b, 0);
                  this.field_a[3] = var11_int;
                  if (var17 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              discarded$3 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param5, this.field_b, 0);
              break L6;
            }
            L8: {
              L9: {
                if (!param7) {
                  break L9;
                } else {
                  a.field_m[1].g(0, 0);
                  if (var17 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (!param0) {
                  break L10;
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  if (var17 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              if (param3) {
                a.field_m[3].g(0, 0);
                break L8;
              } else {
                break L8;
              }
            }
            no.field_P.b();
            ku.field_J.e(param4, param2);
            if (param9 == -19744) {
              break L0;
            } else {
              var18 = (String) null;
              this.a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var11 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var11);
            stackOut_28_1 = new StringBuilder().append("ln.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4, boolean param5, int param6, String param7, int param8) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                no.field_P.field_v = qn.field_g;
                no.field_P.field_B = qn.field_d;
                no.field_P.field_y = qn.field_l;
                ku.field_J.b();
                qn.b();
                if (!param3) {
                  break L2;
                } else {
                  discarded$2 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param7, this.field_b, 0);
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var10_int = this.field_a[3];
              this.field_a[3] = -1;
              discarded$3 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param7, this.field_b, 0);
              this.field_a[3] = var10_int;
              break L1;
            }
            L3: {
              L4: {
                if (param0) {
                  break L4;
                } else {
                  L5: {
                    if (!param5) {
                      break L5;
                    } else {
                      fe.a(a.field_m[2], 0, 0);
                      a.field_m[2].f(0, 0, 228);
                      if (var11 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!param4) {
                    break L3;
                  } else {
                    a.field_m[3].g(0, 0);
                    if (var11 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              a.field_m[1].g(0, 0);
              break L3;
            }
            L6: {
              if (param2 == 68) {
                break L6;
              } else {
                field_d = (byte[]) null;
                break L6;
              }
            }
            ko.field_g.b();
            qn.b();
            ku.field_J.e(0, 0);
            no.field_P.b();
            ko.field_g.h(param8, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var10);
            stackOut_17_1 = new StringBuilder().append("ln.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param7 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_b[param0] = param1;
        if (param2 > -93) {
            this.field_b = (int[]) null;
        }
    }

    final void a(int param0, String param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, int param7) {
        int discarded$1 = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 > 16) {
                break L1;
              } else {
                field_d = (byte[]) null;
                break L1;
              }
            }
            L2: {
              no.field_P.field_y = qn.field_l;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_v = qn.field_g;
              if (param6) {
                a.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                ku.field_J.b();
                qn.b();
                discarded$1 = cc.a(0, -1, this.field_a, -1, -1, false, -1, param1, this.field_b, 0);
                if (!param3) {
                  break L4;
                } else {
                  a.field_m[1].g(0, 0);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!param2) {
                  break L5;
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if (!param5) {
                break L3;
              } else {
                a.field_m[3].g(0, 0);
                break L3;
              }
            }
            no.field_P.b();
            ku.field_J.h(param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var9);
            stackOut_16_1 = new StringBuilder().append("ln.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ln(int[] param0, int[] param1) {
        try {
            this.field_a = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ln() {
        this.field_a = new int[6];
        this.field_b = new int[6];
        this.field_a[0] = 0;
        this.field_a[3] = 0;
        this.field_a[2] = -1;
        this.field_a[4] = -1;
        this.field_a[1] = -1;
        this.field_a[5] = 0;
        this.field_b[3] = 0;
        this.field_b[5] = 0;
        this.field_b[2] = 0;
        this.field_b[1] = 0;
        this.field_b[4] = 0;
        this.field_b[0] = 0;
    }

    static {
        field_e = false;
        field_c = "<%0> of <%1> strength";
    }
}
