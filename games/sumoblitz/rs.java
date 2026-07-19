/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    private boolean field_b;
    private int[] field_a;
    private int field_f;
    private int field_d;
    static tf field_c;
    static int field_g;
    static int field_h;
    static ri field_e;

    final static int a(boolean param0, String param1, int param2, String param3, int param4, int param5, String param6) {
        lj var7 = null;
        RuntimeException var7_ref = null;
        lj var8 = null;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
            var7 = new lj(param1);
            if (param5 >= 115) {
              var8 = new lj(param3);
              stackOut_3_0 = jd.a(var7, param2, var8, param4, param0, 21, param6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -95;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7_ref);
            stackOut_5_1 = new StringBuilder().append("rs.A(").append(param0).append(',');
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
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
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int d(int param0, int param1) {
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != -29816) {
            field_e = (ri) null;
            return this.field_a[param0];
          } else {
            return this.field_a[param0];
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = -38 % ((-60 - param0) / 46);
        int[] var5 = new int[this.b(1, param1)];
        int[] var3 = var5;
        la.a(this.field_a, 0, var5, 0, this.field_a.length);
        this.field_a = var5;
    }

    final static boolean a(String param0, int param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!wi.field_o.startsWith("win")) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  if (param1 == -2528) {
                    var3 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (param0.length() <= var3) {
                            break L5;
                          } else {
                            stackOut_14_0 = -1;
                            stackIn_21_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var4 != 0) {
                              break L4;
                            } else {
                              if (stackIn_15_0 == var2.indexOf((int) param0.charAt(var3))) {
                                stackOut_17_0 = 0;
                                stackIn_18_0 = stackOut_17_0;
                                decompiledRegionSelector0 = 4;
                                break L1;
                              } else {
                                var3++;
                                if (var4 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L4;
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2_ref2);
            stackOut_24_1 = new StringBuilder().append("rs.G(");
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
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -26791) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final void a(byte param0, int param1) {
        if (param0 == 61) {
          if (param1 >= 0) {
            if (this.field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != this.field_f) {
                  la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_f = this.field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          field_g = 27;
          if (param1 >= 0) {
            if (this.field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != this.field_f) {
                  la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_f = this.field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    private rs() throws Throwable {
        throw new Error();
    }

    private final int b(int param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_3_0 = false;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 1) {
          var5 = (String) null;
          discarded$1 = rs.a(false, (String) null, 93, (String) null, -122, -38, (String) null);
          var3 = this.field_a.length;
          L0: while (true) {
            L1: {
              if (var3 > param1) {
                stackOut_19_0 = var3;
                stackIn_20_0 = stackOut_19_0;
                break L1;
              } else {
                stackOut_13_0 = this.field_b;
                stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (!stackIn_14_0) {
                    var3 = var3 + this.field_d;
                    continue L0;
                  } else {
                    if (0 == var3) {
                      var3 = 1;
                      continue L0;
                    } else {
                      var3 = var3 * this.field_d;
                      continue L0;
                    }
                  }
                }
              }
            }
            return stackIn_20_0;
          }
        } else {
          var3 = this.field_a.length;
          L2: while (true) {
            L3: {
              if (var3 > param1) {
                stackOut_9_0 = var3;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_3_0 = this.field_b;
                stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                stackIn_4_0 = stackOut_3_0;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (!stackIn_4_0) {
                    var3 = var3 + this.field_d;
                    continue L2;
                  } else {
                    if (0 == var3) {
                      var3 = 1;
                      continue L2;
                    } else {
                      var3 = var3 * this.field_d;
                      continue L2;
                    }
                  }
                }
              }
            }
            return stackIn_10_0;
          }
        }
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + this.field_f, false);
        int var3 = 29 % ((-83 - param0) / 33);
    }

    private final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > this.field_f) {
            L0: {
              this.field_f = param1;
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_a[param1] = param0;
            return;
          } else {
            L1: {
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_a[param1] = param0;
            return;
          }
        } else {
          field_e = (ri) null;
          if (param1 <= this.field_f) {
            L2: {
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_a[param1] = param0;
            return;
          } else {
            L3: {
              this.field_f = param1;
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L3;
              } else {
                break L3;
              }
            }
            this.field_a[param1] = param0;
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 <= 28) {
            return 121;
        }
        return 1 + this.field_f;
    }

    static {
        field_c = new tf();
        field_g = 2;
        field_h = 4;
    }
}
