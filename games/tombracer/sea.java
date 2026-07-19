/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea extends nv {
    static String field_q;
    static String field_o;
    private aia[] field_n;
    static String field_p;

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        aia var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.field_g.d(3);
              var5 = this.field_g.e(9648);
              var6 = param2.field_d + -var4_int;
              if (param0 < -85) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            var7 = -var4_int + param2.field_e;
            var8 = -var5 + param2.field_k;
            var9 = -var5 + param2.field_a;
            var10 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var10 >= this.field_n.length) {
                    break L4;
                  } else {
                    var11 = this.field_n[var10];
                    var12 = var4_int + var11.a((byte) 110);
                    var13 = var5 + var11.f(0);
                    var14 = eha.a(var11.g(0), 12, var13, var11.g(0), param2, var12, 2);
                    stackOut_5_0 = -1;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var16 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 > (var14 ^ -1)) {
                          var15 = wm.a(4096, var14, 15);
                          this.a(var8 + gqa.a(-var8 + var9, (byte) 24, var15), var6 - -gqa.a(var7 - var6, (byte) 24, var15), var11, (byte) -102, param1);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var10++;
                      if (var16 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("sea.S(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final int a(int param0, ep param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 25940) {
              var4_int = param1.i(-1);
              stackOut_3_0 = this.a(var4_int, var4_int, param2, param1.d(param0 ^ 25943), (byte) 125, param1.e(param0 ^ 16612));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 123;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("sea.BC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final aia b(int param0, int param1) {
        int var3 = 15 / ((-50 - param0) / 56);
        return this.field_n[param1];
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.d(param0);
            param1.a(26492, true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sea.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 27508) {
          field_o = (String) null;
          field_o = null;
          field_p = null;
          field_q = null;
          return;
        } else {
          field_o = null;
          field_p = null;
          field_q = null;
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 91;
        }
        return param0;
    }

    final void h(int param0) {
        aia[] var2 = null;
        int var3 = 0;
        aia var4 = null;
        int var5 = 0;
        aia[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        super.h(param0);
        var6 = this.field_n;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length > var3) {
            var4 = var6[var3];
            var4.c(126);
            var3++;
            if (var5 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 5418) {
          var2 = this.field_g.d(3);
          var3 = this.field_g.e(9648);
          var4 = 0;
          L0: while (true) {
            L1: {
              if (this.field_n.length <= var4) {
                L2: {
                  if (!this.d(8031)) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                var4 = stackIn_19_0;
                break L1;
              } else {
                this.field_n[var4].a(var2, this.field_g.c(-112), this.field_g.a((byte) 55), var3, (byte) -80, this.field_g.r(0), this.field_g.f((byte) 77));
                var4++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    L3: {
                      if (!this.d(8031)) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L3;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L3;
                      }
                    }
                    var4 = stackIn_9_0;
                    var5 = 0;
                    L4: while (true) {
                      if (var5 < this.field_n.length) {
                        this.field_n[var5].a(111, var4 != 0, var3, var2, this.m((byte) 19));
                        var5++;
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            var5 = 0;
            L5: while (true) {
              if (var5 < this.field_n.length) {
                this.field_n[var5].a(111, var4 != 0, var3, var2, this.m((byte) 19));
                var5++;
                if (var6 == 0) {
                  continue L5;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_p = (String) null;
            return 15;
        }
        return 15;
    }

    final static boolean l(int param0) {
        boolean discarded$2 = false;
        aj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        aj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (aj) ((Object) al.field_g.f(-80));
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == 10371) {
                  break L1;
                } else {
                  discarded$2 = sea.l(41);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var1.field_f <= var2) {
                    break L3;
                  } else {
                    L4: {
                      if (null == var4.field_j[var2]) {
                        break L4;
                      } else {
                        if (-1 == (var4.field_j[var2].field_b ^ -1)) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == var4.field_k[var2]) {
                        break L5;
                      } else {
                        if (var4.field_k[var2].field_b != 0) {
                          break L5;
                        } else {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "sea.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    sea(la param0, boolean param1) {
        super(param0, param1);
    }

    private final void a(int param0, int param1, aia param2, byte param3, up param4) {
        float[] discarded$2 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param3 <= -34) {
                break L1;
              } else {
                discarded$2 = sea.a(0.6912761926651001f, -0.5952900052070618f, -96, -20, 0.25126492977142334f, -40, 39, 3);
                break L1;
              }
            }
            L2: {
              if ((param4.field_j ^ -1) == -4) {
                param2.a(param1, param4.field_b, param0, true);
                break L2;
              } else {
                if (-5 != (param4.field_j ^ -1)) {
                  break L2;
                } else {
                  param2.a(param1, param0, param4.field_b, (byte) 99);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    param2.a(param1, param4.field_b, param0, true);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("sea.L(").append(param0).append(',').append(param1).append(',');
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
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final int c(int param0) {
        int discarded$2 = 0;
        up var3 = null;
        if (param0 != 3) {
          var3 = (up) null;
          discarded$2 = this.a(-115, (ep) null, (up) null);
          return this.field_n.length;
        } else {
          return this.field_n.length;
        }
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        aia var10_ref_aia = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = this.field_g.d(3);
            var8 = this.field_g.e(9648);
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_n.length <= var9) {
                    break L3;
                  } else {
                    var10_ref_aia = this.field_n[var9];
                    var11 = var10_ref_aia.a((byte) 91) + var7_int;
                    var12 = var8 + var10_ref_aia.f(0);
                    stackOut_3_0 = io.a(param1, var12, (byte) -61, param0, var11, param5, var10_ref_aia.g(0), var10_ref_aia.g(0), param3);
                    stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          this.a(-this.field_g.e(9648) + param5, -this.field_g.d(3) + param3, var10_ref_aia, (byte) -115, param2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var9++;
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_8_0 = -90 / ((param4 - 62) / 52);
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              var10 = stackIn_9_0;
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7);
            stackOut_11_1 = new StringBuilder().append("sea.UB(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_10_0;
    }

    final static float[] a(float param0, float param1, int param2, int param3, float param4, int param5, int param6, int param7) {
        float[] discarded$1 = null;
        float[] var8 = null;
        float[] var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float[] var13 = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float[] var17 = null;
        float[] var18 = null;
        float[] var19 = null;
        float[] var20 = null;
        float[] var21 = null;
        float[] var22 = null;
        var21 = new float[9];
        var19 = var21;
        var17 = var19;
        var8 = var17;
        var18 = new float[9];
        var9 = var18;
        var10 = (float)Math.cos((double)((float)param5 * 0.02454369328916073f));
        if (param2 == 16486) {
          var11 = (float)Math.sin((double)((float)param5 * 0.02454369328916073f));
          var17[3] = 0.0f;
          var21[0] = var10;
          var17[7] = 0.0f;
          var21[8] = var10;
          var17[6] = -var11;
          var12 = -var10 + 1.0f;
          var17[1] = 0.0f;
          var17[5] = 0.0f;
          var17[4] = 1.0f;
          var21[2] = var11;
          var22 = new float[9];
          var20 = var22;
          var13 = var20;
          var14 = 1.0f;
          var10 = (float)param7 / 32767.0f;
          var15 = 0.0f;
          var12 = -var10 + 1.0f;
          var11 = -(float)Math.sqrt((double)(-(var10 * var10) + 1.0f));
          var16 = (float)Math.sqrt((double)(param3 * param3 + param6 * param6));
          if (0.0f != var16) {
            L0: {
              if (var16 != 0.0f) {
                var14 = (float)(-param3) / var16;
                var15 = (float)param6 / var16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var13[8] = var10 + var15 * var15 * var12;
              var13[6] = var14 * var15 * var12;
              var13[0] = var10 + var12 * (var14 * var14);
              var13[5] = var14 * var11;
              var13[1] = var11 * var15;
              var13[7] = var11 * -var14;
              var13[2] = var12 * (var14 * var15);
              var22[4] = var10;
              var13[3] = -var15 * var11;
              var18[0] = var21[2] * var22[6] + (var22[3] * var21[1] + var21[0] * var22[0]);
              var18[1] = var21[2] * var22[7] + (var22[1] * var21[0] + var22[4] * var21[1]);
              var18[3] = var21[4] * var22[3] + var22[0] * var21[3] + var22[6] * var21[5];
              var18[2] = var21[0] * var22[2] + var22[5] * var21[1] + var21[2] * var22[8];
              var18[4] = var22[7] * var21[5] + (var22[4] * var21[4] + var21[3] * var22[1]);
              var18[5] = var22[8] * var21[5] + (var22[2] * var21[3] + var21[4] * var22[5]);
              var18[6] = var21[6] * var22[0] + var21[7] * var22[3] + var21[8] * var22[6];
              var18[7] = var21[8] * var22[7] + (var21[7] * var22[4] + var22[1] * var21[6]);
              var18[8] = var22[2] * var21[6] + var21[7] * var22[5] + var21[8] * var22[8];
              if (!TombRacer.field_G) {
                break L1;
              } else {
                var9 = var17;
                break L1;
              }
            }
            var9[2] = var9[2] * param4;
            var9[1] = var9[1] * param4;
            var9[7] = var9[7] * param1;
            var9[3] = var9[3] * param0;
            var9[8] = var9[8] * param1;
            var9[6] = var9[6] * param1;
            var9[5] = var9[5] * param0;
            var9[4] = var9[4] * param0;
            var9[0] = var9[0] * param4;
            return var9;
          } else {
            if (var10 != 0.0f) {
              L2: {
                if (var16 != 0.0f) {
                  var14 = (float)(-param3) / var16;
                  var15 = (float)param6 / var16;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var13[8] = var10 + var15 * var15 * var12;
                var13[6] = var14 * var15 * var12;
                var13[0] = var10 + var12 * (var14 * var14);
                var13[5] = var14 * var11;
                var13[1] = var11 * var15;
                var13[7] = var11 * -var14;
                var13[2] = var12 * (var14 * var15);
                var22[4] = var10;
                var13[3] = -var15 * var11;
                var18[0] = var21[2] * var22[6] + (var22[3] * var21[1] + var21[0] * var22[0]);
                var18[1] = var21[2] * var22[7] + (var22[1] * var21[0] + var22[4] * var21[1]);
                var18[3] = var21[4] * var22[3] + var22[0] * var21[3] + var22[6] * var21[5];
                var18[2] = var21[0] * var22[2] + var22[5] * var21[1] + var21[2] * var22[8];
                var18[4] = var22[7] * var21[5] + (var22[4] * var21[4] + var21[3] * var22[1]);
                var18[5] = var22[8] * var21[5] + (var22[2] * var21[3] + var21[4] * var22[5]);
                var18[6] = var21[6] * var22[0] + var21[7] * var22[3] + var21[8] * var22[6];
                var18[7] = var21[8] * var22[7] + (var21[7] * var22[4] + var22[1] * var21[6]);
                var18[8] = var22[2] * var21[6] + var21[7] * var22[5] + var21[8] * var22[8];
                if (!TombRacer.field_G) {
                  break L3;
                } else {
                  var9 = var17;
                  break L3;
                }
              }
              var9[2] = var9[2] * param4;
              var9[1] = var9[1] * param4;
              var9[7] = var9[7] * param1;
              var9[3] = var9[3] * param0;
              var9[8] = var9[8] * param1;
              var9[6] = var9[6] * param1;
              var9[5] = var9[5] * param0;
              var9[4] = var9[4] * param0;
              var9[0] = var9[0] * param4;
              return var9;
            } else {
              var9 = var17;
              var9[2] = var9[2] * param4;
              var9[1] = var9[1] * param4;
              var9[7] = var9[7] * param1;
              var9[3] = var9[3] * param0;
              var9[8] = var9[8] * param1;
              var9[6] = var9[6] * param1;
              var9[5] = var9[5] * param0;
              var9[4] = var9[4] * param0;
              var9[0] = var9[0] * param4;
              return var9;
            }
          }
        } else {
          L4: {
            L5: {
              L6: {
                discarded$1 = sea.a(1.2596310377120972f, 1.2713145017623901f, -99, -49, -0.6455500721931458f, 23, -23, -74);
                var11 = (float)Math.sin((double)((float)param5 * 0.02454369328916073f));
                var17[3] = 0.0f;
                var21[0] = var10;
                var17[7] = 0.0f;
                var21[8] = var10;
                var17[6] = -var11;
                var12 = -var10 + 1.0f;
                var17[1] = 0.0f;
                var17[5] = 0.0f;
                var17[4] = 1.0f;
                var21[2] = var11;
                var22 = new float[9];
                var20 = var22;
                var13 = var20;
                var14 = 1.0f;
                var10 = (float)param7 / 32767.0f;
                var15 = 0.0f;
                var12 = -var10 + 1.0f;
                var11 = -(float)Math.sqrt((double)(-(var10 * var10) + 1.0f));
                var16 = (float)Math.sqrt((double)(param3 * param3 + param6 * param6));
                if (0.0f != var16) {
                  break L6;
                } else {
                  if (var10 == 0.0f) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var16 != 0.0f) {
                  var14 = (float)(-param3) / var16;
                  var15 = (float)param6 / var16;
                  break L7;
                } else {
                  break L7;
                }
              }
              var13[8] = var10 + var15 * var15 * var12;
              var13[6] = var14 * var15 * var12;
              var13[0] = var10 + var12 * (var14 * var14);
              var13[5] = var14 * var11;
              var13[1] = var11 * var15;
              var13[7] = var11 * -var14;
              var13[2] = var12 * (var14 * var15);
              var22[4] = var10;
              var13[3] = -var15 * var11;
              var18[0] = var21[2] * var22[6] + (var22[3] * var21[1] + var21[0] * var22[0]);
              var18[1] = var21[2] * var22[7] + (var22[1] * var21[0] + var22[4] * var21[1]);
              var18[3] = var21[4] * var22[3] + var22[0] * var21[3] + var22[6] * var21[5];
              var18[2] = var21[0] * var22[2] + var22[5] * var21[1] + var21[2] * var22[8];
              var18[4] = var22[7] * var21[5] + (var22[4] * var21[4] + var21[3] * var22[1]);
              var18[5] = var22[8] * var21[5] + (var22[2] * var21[3] + var21[4] * var22[5]);
              var18[6] = var21[6] * var22[0] + var21[7] * var22[3] + var21[8] * var22[6];
              var18[7] = var21[8] * var22[7] + (var21[7] * var22[4] + var22[1] * var21[6]);
              var18[8] = var22[2] * var21[6] + var21[7] * var22[5] + var21[8] * var22[8];
              if (!TombRacer.field_G) {
                break L4;
              } else {
                break L5;
              }
            }
            var9 = var17;
            break L4;
          }
          var9[2] = var9[2] * param4;
          var9[1] = var9[1] * param4;
          var9[7] = var9[7] * param1;
          var9[3] = var9[3] * param0;
          var9[8] = var9[8] * param1;
          var9[6] = var9[6] * param1;
          var9[5] = var9[5] * param0;
          var9[4] = var9[4] * param0;
          var9[0] = var9[0] * param4;
          return var9;
        }
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        int discarded$0 = 0;
        if (param0 != 120) {
            discarded$0 = this.a(false);
            return true;
        }
        return true;
    }

    sea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_g.c(-33);
        var3 = this.field_g.a((byte) 55);
        if (param0) {
          L0: {
            var4 = 1572864;
            var5 = (var2 >> 1994341328) * (var3 >> -460611888) / ((var4 >> -2142931088) * (var4 >> 1596999440)) >> 1396990722;
            if (50 < var5) {
              var5 = 50;
              break L0;
            } else {
              break L0;
            }
          }
          if ((-var4 + var2 ^ -1) >= -1) {
            this.field_n = new aia[]{};
            if (var9 == 0) {
              return;
            } else {
              this.field_n = new aia[var5];
              var6 = 0;
              L1: while (true) {
                if (var5 <= var6) {
                  return;
                } else {
                  var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                  var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                  this.field_n[var6] = new aia(var7, var8, var4);
                  var6++;
                  if (var9 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (-var4 + var3 > 0) {
              this.field_n = new aia[var5];
              var6 = 0;
              L2: while (true) {
                if (var5 <= var6) {
                  return;
                } else {
                  var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                  var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                  this.field_n[var6] = new aia(var7, var8, var4);
                  var6++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    return;
                  }
                }
              }
            } else {
              this.field_n = new aia[]{};
              if (var9 != 0) {
                this.field_n = new aia[var5];
                var6 = 0;
                L3: while (true) {
                  if (var5 <= var6) {
                    return;
                  } else {
                    var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                    var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                    this.field_n[var6] = new aia(var7, var8, var4);
                    var6++;
                    if (var9 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          L4: {
            this.field_n = (aia[]) null;
            var4 = 1572864;
            var5 = (var2 >> 1994341328) * (var3 >> -460611888) / ((var4 >> -2142931088) * (var4 >> 1596999440)) >> 1396990722;
            if (50 < var5) {
              var5 = 50;
              break L4;
            } else {
              break L4;
            }
          }
          if ((-var4 + var2 ^ -1) < -1) {
            if (-var4 + var3 > 0) {
              this.field_n = new aia[var5];
              var6 = 0;
              L5: while (true) {
                if (var5 > var6) {
                  var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                  var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                  this.field_n[var6] = new aia(var7, var8, var4);
                  var6++;
                  if (var9 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.field_n = new aia[]{};
              if (var9 != 0) {
                this.field_n = new aia[var5];
                var6 = 0;
                L6: while (true) {
                  if (var5 > var6) {
                    var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                    var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                    this.field_n[var6] = new aia(var7, var8, var4);
                    var6++;
                    if (var9 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            this.field_n = new aia[]{};
            if (var9 != 0) {
              this.field_n = new aia[var5];
              var6 = 0;
              L7: while (true) {
                if (var5 > var6) {
                  var7 = var4 / 2 + this.o((byte) 46).a(-var4 + var2, 0) - var2 / 2;
                  var8 = -(var3 / 2) + (this.o((byte) 46).a(var3 + -var4, 0) + var4 / 2);
                  this.field_n[var6] = new aia(var7, var8, var4);
                  var6++;
                  if (var9 == 0) {
                    continue L7;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_q = "Instructions";
        field_o = null;
        field_p = "+15 Coins";
    }
}
