/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ao extends pk implements ug {
    pk[] field_x;
    static ji field_y;
    static String field_z;

    boolean a(pk param0, byte param1) {
        pk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        pk[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_x;
              var3 = var7;
              if (param1 == 61) {
                break L1;
              } else {
                this.field_x = (pk[]) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (!var5.a(param0, (byte) 61)) {
                      break L3;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ao.Q(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(pk param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pk var6 = null;
        pk var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == this.field_x) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 0;
              var5 = -106 / ((28 - param1) / 42);
              L1: while (true) {
                if (var4_int >= this.field_x.length) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var6 = this.field_x[var4_int];
                    if (var6 == null) {
                      break L2;
                    } else {
                      if (!var6.d(-1)) {
                        break L2;
                      } else {
                        var4_int = var4_int + param2;
                        L3: while (true) {
                          if (var4_int >= this.field_x.length) {
                            break L2;
                          } else {
                            L4: {
                              var7 = this.field_x[var4_int];
                              if (var7 == null) {
                                break L4;
                              } else {
                                if (var7.a(param0, (byte) 61)) {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int + param2;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ao.G(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        pk[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        pk[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x != null) {
              L1: {
                if (param2 >= 9) {
                  break L1;
                } else {
                  ao.a(-24);
                  break L1;
                }
              }
              var9 = this.field_x;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param3;
                  if ((var5_int ^ -1) != -81) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L3: {
                      if (!hw.field_b[81]) {
                        stackIn_19_0 = this.a((byte) -17, param0);
                        break L3;
                      } else {
                        stackIn_19_0 = this.b(param0, (byte) 113);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.d(-1)) {
                        break L4;
                      } else {
                        if (var7.a(param0, param1, (byte) 72, param3)) {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6++;
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
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("ao.KA(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    ao(int param0, int param1, int param2, int param3, mh param4) {
        super(param0, param1, param2, param3, param4, (qm) null);
    }

    final boolean a(byte param0, pk param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -17) {
                break L1;
              } else {
                this.d(-97);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, (byte) -49, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ao.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        pk var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                var6 = (pk) null;
                this.b((pk) null, (byte) -86);
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param1, -124, param2)) {
                this.a(param0, (byte) -128, param2, param1);
                this.a(param1, param0, 10, param2);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ao.S(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, pk param2, int param3) {
        pk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        pk var8 = null;
        int var9 = 0;
        pk[] var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            super.a(param0, -118, param2, param3);
            if (null != this.field_x) {
              var10 = this.field_x;
              var5 = var10;
              var6 = 102 % ((-25 - param1) / 45);
              var7 = 0;
              L1: while (true) {
                if (var10.length <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = var10[var7];
                    if (var8 == null) {
                      break L2;
                    } else {
                      var8.a(this.field_r + param0, 95, param2, this.field_v + param3);
                      break L2;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("ao.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2;
        pk[] var3;
        int var4;
        pk var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 2 % ((param0 - 64) / 51);
        var3 = this.field_x;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.c((byte) -68);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract void e(boolean param0);

    final String c(int param0) {
        pk[] var2;
        int var3;
        pk var4;
        int var6;
        String var5;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -6696) {
          if (this.field_x != null) {
            var2 = this.field_x;
            var3 = 0;
            L0: while (true) {
              if (var3 < var2.length) {
                var4 = var2[var3];
                if (var4 != null) {
                  var5 = var4.c(-6696);
                  if (var5 != null) {
                    return var5;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        pk var6;
        int var7;
        pk var8;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (-1 != (param3 ^ -1)) {
            break L0;
          } else {
            if (this.field_w == null) {
              break L0;
            } else {
              this.field_w.a((pk) (this), param1, 5592405, true, param0);
              break L0;
            }
          }
        }
        L1: {
          if (this.field_x == null) {
            break L1;
          } else {
            var5 = -1 + this.field_x.length;
            L2: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L1;
              } else {
                var6 = this.field_x[var5];
                if (var6 != null) {
                  var6.a(this.field_r + param0, this.field_v + param1, (byte) -62, param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param2 <= -35) {
            break L3;
          } else {
            var8 = (pk) null;
            this.a((pk) null, -125, -13, -18, -36, 44, -11);
            break L3;
          }
        }
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        pk[] var7 = null;
        int var8 = 0;
        pk var9 = null;
        int var10 = 0;
        pk[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_x;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var11.length) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      this.d(49);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(param0, false, param2 + this.field_r, param3, param4, param5 + this.field_v);
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7_ref);

            stackIn_14_1 = new StringBuilder().append("ao.T(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        pk var12 = null;
        pk[] var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var12 = (pk) null;
                this.a((pk) null, 'ﾅ', (byte) -58, -49);
                break L1;
              }
            }
            if (this.field_x != null) {
              var13 = this.field_x;
              var8 = var13;
              var9 = 0;
              L2: while (true) {
                if (var13.length <= var9) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var13[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.d(-1)) {
                        break L3;
                      } else {
                        if (var10.a(param0, param1, -1, param3, param4, param5, param6)) {
                          stackIn_13_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("ao.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        pk var7 = null;
        int var8 = 0;
        int var9 = 0;
        pk var10 = null;
        pk[] var11 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x != null) {
              L1: {
                if (param2 == 10) {
                  break L1;
                } else {
                  var10 = (pk) null;
                  this.a((pk) null, (byte) -20);
                  break L1;
                }
              }
              var11 = this.field_x;
              var6 = 0;
              L2: while (true) {
                if (var11.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var11[var6];
                  discarded$6 = param3.append('\n');
                  var8 = 0;
                  L3: while (true) {
                    if (param1 < var8) {
                      L4: {
                        if (var7 != null) {
                          var7.a(1 + param1, param0, param3, 0);
                          break L4;
                        } else {
                          discarded$7 = param3.append("null");
                          break L4;
                        }
                      }
                      var6++;
                      continue L2;
                    } else {
                      discarded$8 = param3.append(' ');
                      var8++;
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
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("ao.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < bn.field_T) {
                  break L1;
                } else {
                  if (param0.length() <= or.field_k) {
                    if (param1 == 30996) {
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ao.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final boolean b(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 113) {
              stackIn_4_0 = this.a((byte) -128, param0, 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ao.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    private final pk d(boolean param0) {
        pk[] var2;
        int var3;
        pk var4;
        int var5;
        pk[] var6;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_x != null) {
          if (param0) {
            var6 = this.field_x;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var3 < var6.length) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.d(-1)) {
                    return var4;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (pk) null;
          }
        } else {
          return null;
        }
    }

    final boolean a(byte param0, pk param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pk var5 = null;
        pk var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_8_0 = null;
        pk stackIn_8_1 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_x == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = -1 + this.field_x.length;
              L1: while (true) {
                if (var4_int < 0) {
                  if (param0 <= -127) {
                    stackIn_22_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.e(-70);
                    return false;
                  }
                } else {
                  var5 = this.field_x[var4_int];
                  stackIn_8_0 = null;
                  stackIn_8_1 = (pk) (var5);
                  L2: {
                    if (stackIn_8_0 == stackIn_8_1) {
                      break L2;
                    } else {
                      if (!var5.d(-1)) {
                        break L2;
                      } else {
                        var4_int = var4_int - param2;
                        L3: while (true) {
                          if ((var4_int ^ -1) > -1) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_x[var4_int];
                              if (null == var6) {
                                break L4;
                              } else {
                                if (var6.a(param1, (byte) 61)) {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int - param2;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("ao.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            field_z = (String) null;
        }
        return this.d(true) != null ? true : false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-51, param1, param2, param3, param4);
        int var6 = 53 / ((28 - param0) / 63);
        this.e(false);
    }

    public static void a(int param0) {
        field_z = null;
        field_y = null;
        if (param0 != 0) {
            String var2 = (String) null;
            ao.a((String) null, -34);
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        pk[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        pk var10 = null;
        int var11 = 0;
        pk[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == this.field_x) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var12 = this.field_x;
                var8 = var12;
                if (param1 <= -42) {
                  break L1;
                } else {
                  field_y = (ji) null;
                  break L1;
                }
              }
              var9 = 0;
              L2: while (true) {
                if (var12.length <= var9) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(param0, -84, param2, param3, this.field_r + param4, param5, param6 - -this.field_v)) {
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("ao.R(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final int e(int param0) {
        int var2;
        pk[] var3;
        int var4;
        pk var5;
        int var7;
        int var6;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = this.field_x;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            var4 = -37 / ((param0 - -10) / 46);
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.e(-117);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        field_y = new ji();
        field_z = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
