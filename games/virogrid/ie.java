/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie {
    ri[] field_d;
    static float field_e;
    static String field_b;
    static kf field_a;
    static String field_c;

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
            ie.a(81, -82, 22, -52, -108, 64);
        }
        field_a = null;
        field_b = null;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 20) {
            break L0;
          } else {
            ie.a(-6, -99, 20, 28, 4, 1);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_d) {
              break L2;
            } else {
              if ((this.field_d.length ^ -1) < -1) {
                stackOut_6_0 = -this.field_d[0].field_c + this.field_d[-1 + this.field_d.length].field_b;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ri var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        for (var3 = param1; var3 < this.field_d.length; var3++) {
            var4 = this.field_d[var3];
            if (param0 < var4.field_d.length) {
                return var3;
            }
            param0 = param0 - (var4.field_d.length - 1);
        }
        return this.field_d.length;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              fd.field_B = new int[param5];
              o.field_d = new int[param0];
              var6_int = 0;
              if (param2 == 28476) {
                break L1;
              } else {
                field_e = 1.0884095430374146f;
                break L1;
              }
            }
            L2: while (true) {
              if (var6_int >= param0) {
                var10 = 0;
                var6_int = var10;
                L3: while (true) {
                  if (var10 >= param5) {
                    break L0;
                  } else {
                    var7 = -(var10 * param1) + 370 + -param4;
                    fd.field_B[var10] = var7;
                    var10++;
                    continue L3;
                  }
                }
              } else {
                var7 = -param3 + (500 + -(param1 * var6_int));
                var8 = param1 * var6_int + param3 + 140;
                o.field_d[var6_int] = var8;
                o.field_d[var6_int] = var7;
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var6), "ie.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static vh a(boolean param0, int param1, int param2, eh param3, eh param4) {
        RuntimeException var5 = null;
        vh stackIn_2_0 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_6_0 = null;
        vh stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!param0) {
              if (hn.a(param3, param2, param1, (byte) 109)) {
                stackOut_6_0 = jf.a(param4.a(param2, param1, 0), 20);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (vh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        ri var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        ri[] var7 = this.field_d;
        ri[] var3 = var7;
        if (param1 != -1) {
            field_c = (String) null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_d.length <= param0)) {
                return var5.field_d[param0];
            }
            param0 = param0 - (var5.field_d.length + -1);
        }
        return 0;
    }

    final int a(String param0, int param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param2) {
              var5_int = 0;
              var6 = 0;
              var7 = param0.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (var5_int <= 0) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_17_0 = (param3 - param1 << -2060076376) / var5_int;
                    stackIn_18_0 = stackOut_17_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param0.charAt(var8);
                    if (var9 == 60) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (62 != var9) {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 28;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("ie.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final int a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        ri[] var3 = null;
        int var4 = 0;
        ri var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param0 == 3209) {
            break L0;
          } else {
            discarded$2 = this.a(-28, -45);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_d != null) {
            var3 = this.field_d;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(-1);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ri var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Virogrid.field_F ? 1 : 0;
          if (this.field_d == null) {
            break L0;
          } else {
            if (-1 == (this.field_d.length ^ -1)) {
              break L0;
            } else {
              if (param1 < this.field_d[0].field_c) {
                break L0;
              } else {
                if (this.field_d[-1 + this.field_d.length].field_b >= param1) {
                  if (-2 != (this.field_d.length ^ -1)) {
                    var4 = 0;
                    var6 = -97 / ((-46 - param0) / 56);
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= this.field_d.length) {
                        return -1;
                      } else {
                        L2: {
                          var7 = this.field_d[var5];
                          if (var7.field_c > param1) {
                            break L2;
                          } else {
                            if (param1 <= var7.field_b) {
                              var8 = var7.a((byte) 119, param2);
                              if (0 == (var8 ^ -1)) {
                                return -1;
                              } else {
                                return var8 + var4;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var7.field_d.length);
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    return this.field_d[0].a((byte) 89, param2);
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        field_b = "<%2>'s turn - playing <%0> (<%1>)";
        field_c = "Visit the Account Management section on the main site to view.";
    }
}
