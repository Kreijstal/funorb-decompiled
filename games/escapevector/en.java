/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private int[] field_b;
    static String field_a;
    static String field_g;
    boolean field_c;
    private jh field_m;
    private cn field_f;
    private int[] field_j;
    boolean field_h;
    static int field_k;
    static cn field_i;
    static long field_l;
    static hh field_d;
    static String field_e;

    final int[] a(int param0, byte param1) {
        int var3;
        int[] var4;
        int var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int[] var13;
        int[] var14;
        int[] var15;
        int[] var16;
        int stackIn_3_0 = 0;
        int var11;
        L0: {
          var12 = EscapeVector.field_A;
          if (aj.b(-101)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (var3 == 0) {
            break L1;
          } else {
            if (this.field_h) {
              break L1;
            } else {
              if (!this.field_c) {
                break L1;
              } else {
                this.b((byte) -128);
                break L1;
              }
            }
          }
        }
        if (this.e(127, param0)) {
          var16 = this.c(param0, (byte) -122);
          var14 = var16;
          var4 = var14;
          if (var4 != null) {
            var5 = this.a(10999, param0);
            var15 = new int[var5];
            var13 = var15;
            var6 = var13;
            var7 = 0;
            L2: while (true) {
              if (var15.length <= var7) {
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (var16.length <= var7) {
                    L4: {
                      if (param1 <= -2) {
                        break L4;
                      } else {
                        field_e = (String) null;
                        break L4;
                      }
                    }
                    return var6;
                  } else {
                    var9 = 0;
                    L5: while (true) {
                      if ((var9 ^ -1) <= -33) {
                        var7++;
                        continue L3;
                      } else {
                        var10 = this.a(1, var7, var16, var9) ? 1 : 0;
                        if (var10 != 0) {
                          var11 = 32 * var7 + var9;
                          var15[var8] = var11;
                          var8++;
                          if (var8 == var5) {
                            return var6;
                          } else {
                            var9++;
                            continue L5;
                          }
                        } else {
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var15[var7] = -1;
                var7++;
                continue L2;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        ci var4 = this.b(param1, false);
        if (!(var4 != null)) {
            return false;
        }
        if (param2 != 0) {
            field_d = (hh) null;
        }
        return var4.a(param0, (byte) -100);
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_g = null;
    }

    final int c(int param0, int param1) {
        int var3 = this.a(param0, true);
        if (!(param0 != 0)) {
            return var3;
        }
        int var4 = this.d(param0, param1);
        var3 = var3 - var4;
        return var3;
    }

    private final int a(boolean param0, int param1, int[] param2, int[] param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < param3.length) {
                break L1;
              } else {
                if (param1 < param2.length) {
                  break L1;
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.field_j = (int[]) null;
                break L2;
              }
            }
            if (param1 < param3.length) {
              if (param1 < param2.length) {
                stackIn_13_0 = this.c((byte) -101, param3[param1], param2[param1]);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_11_0 = param3[param1];
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_8_0 = param2[param1];
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("en.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final int a(int[] param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < param0.length) {
                break L1;
              } else {
                if (param2 < param3.length) {
                  break L1;
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0.length <= param2) {
              stackIn_7_0 = param3[param2];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5_int = 53 % ((70 - param1) / 39);
              if (param3.length > param2) {
                stackIn_12_0 = this.b((byte) -116, param0[param2], param3[param2]);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_10_0 = param0[param2];
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("en.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final void b(byte param0) {
        if (aj.b(-97)) {
            return;
        }
        if (!(!this.field_h)) {
            return;
        }
        int var2 = 95 / ((-79 - param0) / 45);
        if (!(null != this.field_m)) {
            this.field_m = tg.b(4, 126);
            this.field_c = false;
            this.field_h = false;
        }
    }

    private final void a(byte param0, int[] param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == -82) {
              if (param1 == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_j == null) {
                  this.field_j = param1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    var7 = this.field_j;
                    var3 = var7;
                    var4 = 0;
                    if (var7 != null) {
                      var4 = var7.length;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (param1.length <= var4) {
                        break L2;
                      } else {
                        var4 = param1.length;
                        break L2;
                      }
                    }
                  }
                  this.field_j = new int[var4];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      this.field_j[var5] = this.a(false, var5, param1, var7);
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("en.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int var4 = -35 / ((param0 - 28) / 45);
        return (param2 ^ -1) & param1;
    }

    private final boolean e(int param0, int param1) {
        if (param0 <= 120) {
            return true;
        }
        if (-1 == (param1 ^ -1)) {
            return true;
        }
        if (1 != param1) {
            return false;
        }
        return true;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 38) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (param0.equals("B")) {
              stackIn_5_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0.equals("I")) {
                if (param0.equals("S")) {
                  stackIn_12_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.equals("J")) {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("D")) {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param0.equals("C")) {
                            stackIn_30_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_8_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("en.HA(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return stackIn_30_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final ci b(int param0, boolean param1) {
        if (-1 < (param0 ^ -1)) {
            return null;
        }
        if (jb.field_l.length <= param0) {
            return null;
        }
        if (param1) {
            field_k = -102;
        }
        return jb.field_l[param0];
    }

    final ed b(int param0, int param1) {
        if (param1 < 98) {
            field_a = (String) null;
        }
        ci var3 = this.b(param0, false);
        if (var3 == null || null == var3.field_e) {
            return qh.field_l;
        }
        return var3.field_e;
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        if (this.a(param3, (byte) -127, 1)) {
            return;
        }
        if (!(this.a(param2, (byte) -127, 1))) {
            return;
        }
        if (param0 > -127) {
            return;
        }
        int var7 = param3;
        int var8 = param3 ^ 255;
        oe var9 = ma.field_a;
        if (var9 == null) {
            return;
        }
        var9.a(param1, false, var7, var8);
    }

    private final void a(int[] param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_b == null) {
                this.field_b = new int[param0.length];
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 == -20915) {
                    break L1;
                  } else {
                    this.field_j = (int[]) null;
                    break L1;
                  }
                }
                L2: {
                  var7 = this.field_b;
                  var3 = var7;
                  var4 = 0;
                  if (var7 == null) {
                    break L2;
                  } else {
                    var4 = var7.length;
                    break L2;
                  }
                }
                L3: {
                  if (param0 == null) {
                    break L3;
                  } else {
                    if (param0.length <= var4) {
                      break L3;
                    } else {
                      var4 = param0.length;
                      break L3;
                    }
                  }
                }
                this.field_b = new int[var4];
                var5 = 0;
                L4: while (true) {
                  if (var4 <= var5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.field_b[var5] = this.a(var7, 118, var5, param0);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("en.H(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if ((param0 ^ -1) >= -2) {
                if (param2 == -1) {
                  if (-2 != (param0 ^ -1)) {
                    stackIn_15_0 = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_13_0 = param1 * var3_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = -53;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if (-1 != (1 & param0 ^ -1)) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 * param1;
                param0 = param0 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "en.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int stackIn_3_0 = 0;
        L0: {
          if (aj.b(-116)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var5 == 0) {
            break L1;
          } else {
            if (this.field_h) {
              break L1;
            } else {
              if (!this.field_c) {
                break L1;
              } else {
                this.b((byte) 118);
                break L1;
              }
            }
          }
        }
        if (!this.a(param2, (byte) -128, 1)) {
          if (this.a(param3, param2, param0 + -54)) {
            this.a((byte) -47, 1, param2);
            this.a((byte) -47, 0, param2);
            nk.b(param2, -128);
            if (param0 == 54) {
              L2: {
                var8 = pl.d(126);
                var7 = var8;
                var6 = var7;
                if (var6 == null) {
                  break L2;
                } else {
                  if (4 != var8.length) {
                    break L2;
                  } else {
                    this.field_f.a(-12328, new qd(param2, param1, var8[0], var8[1], var8[2], var8[3]));
                    return true;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void d(byte param0, int param1, int param2) {
        int var5 = 0;
        mb var6 = null;
        int var7 = EscapeVector.field_A;
        if (null == jb.field_i) {
            return;
        }
        if (param0 > -63) {
            this.field_c = false;
        }
        mb[] var8 = jb.field_i;
        mb[] var4 = var8;
        for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 == null) {
                return;
            }
            var6.a(11827, param1, param2);
        }
    }

    final void e(int param0) {
        if (aj.b(-123)) {
            return;
        }
        if (!(!this.field_h)) {
            return;
        }
        if (!(this.field_m != null)) {
            return;
        }
        if (param0 != -19636) {
            return;
        }
        if (!(this.field_m.field_h)) {
            return;
        }
        if (!this.field_m.field_g) {
            this.a((byte) -82, this.field_m.field_i);
            this.a(this.field_m.field_i, -20915);
            this.field_c = false;
            this.field_m = null;
            this.field_h = true;
        } else {
            this.field_h = false;
            this.field_m = null;
            this.field_c = true;
        }
    }

    final static void a(mf param0, int param1) {
        int var2_int = param1;
        if (!param0.a(0, da.field_d[var2_int])) {
            return;
        }
        try {
            sl.field_b[var2_int][0] = fe.a("tutorial", param0, "layer0", true);
            uj.field_a = sl.field_b[var2_int][0];
            sl.field_b[var2_int][2] = fe.a("tutorial", param0, "layer2", true);
            uf.field_e = fe.a("tutorial", param0, "edge_exit_left", true);
            wa.field_b = fe.a("tutorial", param0, "edge_exit_right", true);
            dg.field_r = fe.a("tutorial", param0, "edge_inner_bottom", true);
            ej.field_e = fe.a("tutorial", param0, "edge_inner_bottom_left", true);
            q.field_G = fe.a("tutorial", param0, "edge_inner_bottom_right", true);
            n.field_l = fe.a("tutorial", param0, "edge_inner_left", true);
            cj.field_a = fe.a("tutorial", param0, "edge_inner_right", true);
            mj.field_f = fe.a("tutorial", param0, "edge_inner_top", true);
            bf.field_T = fe.a("tutorial", param0, "edge_inner_top_left", true);
            kn.field_h = fe.a("tutorial", param0, "edge_inner_top_right", true);
            wa.field_e = fe.a("tutorial", param0, "edge_outer", true);
            qf.field_d = fe.a("tutorial", param0, "exitbg", true);
            c.field_n = fe.a("tutorial", param0, "panel", true);
            gm.field_a = fe.a("tutorial", param0, "platform", true);
            tk.field_a[var2_int] = fe.a("tutorial", param0, "texture", true);
            fa.field_c[var2_int] = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "en.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        if (param1 != 1) {
            this.b((byte) 92, -90, -126, -118);
        }
        ci var3 = this.b(param0, false);
        if (var3 == null) {
            return true;
        }
        return var3.field_h;
    }

    final static void a(byte param0, long param1) {
        int var3 = -51 / ((param0 - 41) / 34);
        if (!(0L < param1)) {
            return;
        }
        if (-1L == (param1 % 10L ^ -1L)) {
            ae.a(-1L + param1, (byte) 118);
            ae.a(1L, (byte) 118);
        } else {
            ae.a(param1, (byte) 118);
        }
    }

    final void a(byte param0) {
        this.b((byte) -128, 1, 0, 18);
        this.b((byte) -128, 1, 1, 19);
        this.b((byte) -128, 1, 2, 20);
        this.b((byte) -128, 1, 3, 21);
        int var2 = 9 / ((-27 - param0) / 41);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (!(this.field_b != null)) {
            return;
        }
        if (!param0) {
            this.a(42, false);
        }
        for (var2 = 0; this.field_b.length > var2; var2++) {
            this.field_b[var2] = 0;
        }
    }

    final int a(int param0, boolean param1) {
        if (!(0 != param0)) {
            return this.b((byte) 119, this.field_b);
        }
        if (!param1) {
            this.field_f = (cn) null;
        }
        if ((param0 ^ -1) != -2) {
            return 0;
        }
        return 32;
    }

    private final int c(byte param0, int param1, int param2) {
        if (param0 > -95) {
            this.field_m = (jh) null;
        }
        return param1 | param2;
    }

    final void c(int param0, int param1, int param2) {
        jk[] var4;
        int var5;
        jk var6;
        int var7;
        jk[] var8;
        var7 = EscapeVector.field_A;
        if (jb.field_k != null) {
          var8 = jb.field_k;
          var4 = var8;
          var5 = param0;
          L0: while (true) {
            if (var8.length <= var5) {
              return;
            } else {
              var6 = var8[var5];
              if (var6 != null) {
                var6.a((byte) 106, param2, param1);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int[] c(int param0, byte param1) {
        if (param0 == 0) {
            return this.field_b;
        }
        if ((param0 ^ -1) == -2) {
            return this.field_j;
        }
        int var3 = 7 % ((param1 - -78) / 38);
        return null;
    }

    private final boolean c(byte param0) {
        if (param0 >= -115) {
            field_i = (cn) null;
        }
        return null != this.field_m ? true : false;
    }

    private final int a(int param0, int param1) {
        if (-1 == (param1 ^ -1)) {
            return this.b((byte) 118, this.field_b);
        }
        if (param0 != 10999) {
            return 106;
        }
        if (param1 != 1) {
            return 0;
        }
        return this.b((byte) 114, this.field_j);
    }

    private final int d(int param0, int param1) {
        int var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = EscapeVector.field_A;
          var3 = 0;
          if (param1 == 1) {
            break L0;
          } else {
            this.field_m = (jh) null;
            break L0;
          }
        }
        var4 = jb.field_z;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            return var3;
          } else {
            var6 = var4[var5];
            var7 = this.a(var6, (byte) -128, param0) ? 1 : 0;
            if (var7 == 0) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param2[param1];
              var6 = param0 << param3;
              if (-1 == (var6 & var5_int ^ -1)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("en.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final void a(int param0, boolean param1, int[] param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            var5_int = param2[param3];
            var6 = 1 << param0;
            var5_int = var5_int | var6;
            if (param1) {
                this.d((byte) 123, 114, -50);
            }
            param2[param3] = var5_int;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "en.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(int param0) {
        int var2 = 25 / ((9 - param0) / 54);
        return this.a(10999, 0) > 0 ? true : false;
    }

    private final void a(byte param0, int param1, int param2) {
        int var6 = 0;
        if (!(this.e(122, param1))) {
            return;
        }
        int[] var7 = this.c(param1, (byte) -16);
        int[] var4 = var7;
        if (var7 == null) {
            return;
        }
        if (param0 != -47) {
            this.field_m = (jh) null;
        }
        int var5 = param2 / 32;
        if (-1 >= (var5 ^ -1)) {
            if (!(var5 < var7.length)) {
                return;
            }
            var6 = param2 % 32;
            if (0 > var6) {
                return;
            }
            this.a(var6, false, var7, var5);
            return;
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 <= 21) {
            field_k = -22;
        }
        ci var3 = this.b(param0, false);
        if (!(var3 != null)) {
            return true;
        }
        return var3.field_f;
    }

    final static void c(int param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        fd stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var1_int = hi.field_o;
              var2 = param0;
              if (2 == f.field_j) {
                var3_long = -bd.field_k + td.b(128);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (s.field_I.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = jj.field_a[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (var4 != cb.field_c.field_h) {
                      var5 = gd.field_X;
                      break L3;
                    } else {
                      var5 = pc.field_d;
                      break L3;
                    }
                  } else {
                    var5 = lh.field_e;
                    break L3;
                  }
                }
                L4: {
                  var6 = s.field_I[var3];
                  if (2 != f.field_j) {
                    break L4;
                  } else {
                    if (1 == var2) {
                      L5: {
                        if (tg.field_nb.length >= qm.field_f.length) {
                          stackIn_19_0 = tg.field_nb.length;
                          break L5;
                        } else {
                          stackIn_19_0 = qm.field_f.length;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (tb.field_G.length > nn.field_i.length) {
                          stackIn_22_0 = tb.field_G.length;
                          break L6;
                        } else {
                          stackIn_22_0 = nn.field_i.length;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 >= var7 + 6) {
                            break L7;
                          } else {
                            L8: {
                              if (-var7 + var3 + (-6 + tg.field_nb.length) < 0) {
                                stackIn_27_0 = "";
                                break L8;
                              } else {
                                stackIn_27_0 = tg.field_nb[-var7 + (tg.field_nb.length + var3) - 6];
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var3 >= var7 + 7 - -var8) {
                          break L4;
                        } else {
                          L9: {
                            if (-var7 + (-7 + var3) < nn.field_i.length) {
                              stackIn_33_0 = nn.field_i[-var7 + (var3 - 7)];
                              break L9;
                            } else {
                              stackIn_33_0 = "";
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (1 != (var4 ^ -1)) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackIn_38_0 = param0 ^ 94;

                  stackIn_38_1 = (String) (var6);

                  if (-1 < (var4 ^ -1)) {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = (String) ((Object) stackIn_38_1);
                    stackIn_39_2 = 0;
                    break L11;
                  } else {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = (String) ((Object) stackIn_38_1);
                    stackIn_39_2 = 1;
                    break L11;
                  }
                }
                L12: {
                  var7 = ee.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = rn.field_e - (var7 >> -2014354495);
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + hn.field_s;
                      if (var4 != cb.field_c.field_h) {
                        stackIn_44_0 = of.field_g;
                        break L13;
                      } else {
                        stackIn_44_0 = gf.field_e;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a(-fe.field_k + var8, var1_int, -96, var7 + (fe.field_k << 1475024961), (field_k << -1946318271) + ok.field_a);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + field_k;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (0 <= var4) {
                    pb.field_e.a(var6, var8, var1_int - -he.field_x, var5, -1);
                    var1_int = var1_int + (ok.field_a + (hn.field_s + field_k));
                    break L15;
                  } else {
                    nb.field_a.a(var6, var8, var1_int - -vk.field_t, var5, -1);
                    var1_int = var1_int + je.field_b;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "en.D(" + param0 + ')');
        }
    }

    en() {
        this.field_f = new cn();
        int var1 = 1;
        this.field_j = new int[var1];
        this.field_b = new int[var1];
        this.field_f = new cn();
        this.field_h = false;
        this.field_c = false;
    }

    final boolean a(int param0, byte param1, int param2) {
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        if (!this.e(127, param2)) {
          return false;
        } else {
          var7 = this.c(param2, (byte) -14);
          var4 = var7;
          if (var7 == null) {
            return false;
          } else {
            L0: {
              var5 = param0 / 32;
              if (param1 <= -124) {
                break L0;
              } else {
                field_d = (hh) null;
                break L0;
              }
            }
            L1: {
              var7 = var4;
              if (0 > var5) {
                break L1;
              } else {
                if (var7.length <= var5) {
                  break L1;
                } else {
                  var6 = param0 % 32;
                  if (var6 >= 0) {
                    return this.a(1, var5, var7, var6);
                  } else {
                    return false;
                  }
                }
              }
            }
            return false;
          }
        }
    }

    final void d(int param0) {
        ci discarded$0 = null;
        qd var2;
        int var3;
        L0: {
          var3 = EscapeVector.field_A;
          if (this.c((byte) -123)) {
            this.e(-19636);
            break L0;
          } else {
            break L0;
          }
        }
        if (this.field_h) {
          L1: while (true) {
            var2 = (qd) ((Object) this.field_f.c(-20245));
            if (var2 != null) {
              sc.a(var2, 4, 1);
              continue L1;
            } else {
              L2: {
                if (param0 == -32464) {
                  break L2;
                } else {
                  discarded$0 = this.b(22, true);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int b(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = 0;
                var4 = param1;
                if (param0 > 106) {
                  break L1;
                } else {
                  this.field_c = false;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4.length) {
                  stackIn_10_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var4[var5];
                  var3_int = var3_int + ej.a(858993459, var6);
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("en.CA(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = "Your email address is used to identify this account";
        field_i = new cn();
        field_e = "Level score: ";
    }
}
