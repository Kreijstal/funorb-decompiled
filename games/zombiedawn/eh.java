/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eh extends ga implements jf {
    static boolean field_z;
    static boolean field_x;
    static int field_y;
    static int field_A;
    ga[] field_B;

    void a(ga param0, byte param1, int param2, int param3) {
        ga[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            super.a(param0, (byte) -1, param2, param3);
            if (this.field_B != null) {
              var10 = this.field_B;
              var5 = var10;
              var7 = 43 % ((param1 - 46) / 42);
              var6 = 0;
              L1: while (true) {
                if (var10.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = var10[var6];
                    if (var8 != null) {
                      var8.a(param0, (byte) -22, param2 - -this.field_j, this.field_k + param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
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
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("eh.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        ga[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (null == this.field_B) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param5) {
                var12 = this.field_B;
                var8 = var12;
                var9 = 0;
                L1: while (true) {
                  if (var9 >= var12.length) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L2;
                      } else {
                        if (!var10.e(-17741)) {
                          break L2;
                        } else {
                          if (var10.a(param0, param1, param2, param3, param4, true, param6)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8_ref);

            stackIn_21_1 = new StringBuilder().append("eh.OA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        ga[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ga var10 = null;
        int var11 = 0;
        ga[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.field_B == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_B;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  if (param1 == 1) {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.a(param0, 1, param2 - -this.field_j, param3, param4 - -this.field_k, param5, param6)) {
                        break L2;
                      } else {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("eh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        StringBuilder stackIn_5_2 = null;
        Object stackIn_6_0;
        int stackIn_6_1;
        StringBuilder stackIn_6_2;
        int stackIn_6_3;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.e((byte) -8);
                break L1;
              }
            }
            L2: {
              if (!this.a(param0, param1, 11098, param3)) {
                break L2;
              } else {
                L3: {
                  this.a(param0, param3, 87, param1);
                  stackIn_5_0 = this;

                  stackIn_5_1 = param3;

                  stackIn_5_2 = (StringBuilder) (param1);

                  if (param2) {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = (StringBuilder) ((Object) stackIn_5_2);
                    stackIn_6_3 = 0;
                    break L3;
                  } else {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = (StringBuilder) ((Object) stackIn_5_2);
                    stackIn_6_3 = 1;
                    break L3;
                  }
                }
                this.a(stackIn_6_1, stackIn_6_2, stackIn_6_3 != 0, param0);
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("eh.NA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final boolean a(ga param0, boolean param1) {
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
              if (!param1) {
                break L1;
              } else {
                this.e((byte) 88);
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) -102, 1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eh.CA(");

            if (param0 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract void e(byte param0);

    private final ga d(byte param0) {
        ga[] var2;
        int var3;
        ga var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (null != this.field_B) {
          L0: {
            var2 = this.field_B;
            var3 = 0;
            if (param0 > 87) {
              break L0;
            } else {
              this.field_B = (ga[]) null;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              if (var4 != null) {
                if (var4.e(-17741)) {
                  return var4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, ga param1) {
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
              if (param0 == 12139) {
                break L1;
              } else {
                field_A = -64;
                break L1;
              }
            }
            stackIn_3_0 = this.a(true, param1, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eh.JA(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final String d(int param0) {
        int var2;
        ga[] var3;
        int var4;
        ga var5;
        int var7;
        String var6;
        var7 = ZombieDawn.field_J;
        var2 = -37 % ((param0 - 10) / 58);
        if (this.field_B != null) {
          var3 = this.field_B;
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.d(-58);
                if (var6 != null) {
                  return var6;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(oh param0, oh param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.field_kb + -param1.field_kb;
              if (oo.field_T != param0.field_ib) {
                if (null == param0.field_ib) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            if (param2 == 20) {
              L2: {
                if (oo.field_T != param1.field_ib) {
                  if (null == param1.field_ib) {
                    var3_int -= 200;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
              L3: {
                if (0 >= var3_int) {
                  stackIn_17_0 = 0;
                  break L3;
                } else {
                  stackIn_17_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("eh.FA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final static boolean a(boolean param0, dj param1) {
        RuntimeException var2 = null;
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
            if (!param0) {
              stackIn_4_0 = param1.c(9001);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("eh.KA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 19 / ((param0 - -23) / 48);
        super.a(102, param1, param2, param3, param4);
        this.e((byte) 99);
    }

    final static void a(String param0, float param1, int param2) {
        try {
            ka.field_a = param0;
            if (param2 != -1) {
                field_x = true;
            }
            mm.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "eh.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        ga var6;
        int var7;
        L0: {
          var7 = ZombieDawn.field_J;
          if (param1 != param3) {
            break L0;
          } else {
            if (this.field_h == null) {
              break L0;
            } else {
              this.field_h.a(16777215, true, param0, (ga) (this), param2);
              break L0;
            }
          }
        }
        L1: {
          if (null == this.field_B) {
            break L1;
          } else {
            var5 = -1 + this.field_B.length;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = this.field_B[var5];
                if (var6 != null) {
                  var6.a(this.field_j + param0, param1, param2 - -this.field_k, 0);
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
    }

    private final void a(int param0, StringBuilder param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
        int var9 = 0;
        ga[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (!param2) {
              if (this.field_B == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = this.field_B;
                var6 = 0;
                L1: while (true) {
                  if (var10.length <= var6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var7 = var10[var6];
                    discarded$6 = param1.append('\n');
                    var8 = 0;
                    L2: while (true) {
                      if (var8 > param0) {
                        L3: {
                          if (var7 != null) {
                            var7.a(param3, param1, true, 1 + param0);
                            break L3;
                          } else {
                            discarded$7 = param1.append("null");
                            break L3;
                          }
                        }
                        var6++;
                        continue L1;
                      } else {
                        discarded$8 = param1.append(' ');
                        var8++;
                        continue L2;
                      }
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
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("eh.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
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

    final void c(byte param0) {
        ga[] var2;
        int var3;
        ga var4;
        int var5;
        ga[] var7;
        ga var6;
        var5 = ZombieDawn.field_J;
        var7 = this.field_B;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 57) {
                break L1;
              } else {
                var6 = (ga) null;
                this.a((byte) 99, -77, (ga) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c((byte) 57);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    boolean a(byte param0, ga param1) {
        ga[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ga var5 = null;
        int var6 = 0;
        ga[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var7 = this.field_B;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param0 > 67) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (!var5.a((byte) 88, param1)) {
                      break L2;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("eh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean a(byte param0, int param1, ga param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 == -102) {
              if (null != this.field_B) {
                var4_int = -1 + this.field_B.length;
                L1: while (true) {
                  if (0 > var4_int) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_B[var4_int];
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (!var5.e(-17741)) {
                          break L2;
                        } else {
                          var4_int = var4_int - param1;
                          L3: while (true) {
                            if (-1 < (var4_int ^ -1)) {
                              break L2;
                            } else {
                              L4: {
                                var6 = this.field_B[var4_int];
                                if (var6 == null) {
                                  break L4;
                                } else {
                                  if (var6.a((byte) 109, param2)) {
                                    stackIn_17_0 = 1;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var4_int = var4_int - param1;
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
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("eh.EA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    eh(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ga[] var7 = null;
        int var8 = 0;
        ga var9 = null;
        int var10 = 0;
        ga[] var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                field_z = false;
                break L1;
              }
            }
            if (this.field_B == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_B;
              var7 = var11;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var11.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 != null) {
                      var9.a(this.field_k + param0, 107, param2, param3, this.field_j + param4, param5);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("eh.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c(int param0) {
        int var2;
        ga[] var3;
        int var4;
        ga var5;
        int var7;
        int var6;
        var7 = ZombieDawn.field_J;
        var2 = 0;
        var3 = this.field_B;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c(0);
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

    final boolean a(boolean param0, ga param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ga var5 = null;
        ga var6 = null;
        int var7 = 0;
        oh var8 = null;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        ga stackIn_7_1 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (null != this.field_B) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= this.field_B.length) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      var8 = (oh) null;
                      eh.a((oh) null, (oh) null, (byte) -8);
                      break L2;
                    }
                  }
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = this.field_B[var4_int];
                  stackIn_7_0 = null;
                  stackIn_7_1 = (ga) (var5);
                  L3: {
                    if (stackIn_7_0 == stackIn_7_1) {
                      break L3;
                    } else {
                      if (!var5.e(-17741)) {
                        break L3;
                      } else {
                        var4_int = var4_int + param2;
                        L4: while (true) {
                          if (this.field_B.length <= var4_int) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_B[var4_int];
                              if (null != var6) {
                                if (var6.a((byte) 106, param1)) {
                                  stackIn_16_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + param2;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("eh.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            field_A = 103;
        }
        return null != this.d((byte) 100) ? true : false;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        ga[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        ga var8 = null;
        int var9 = 0;
        ga[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (null != this.field_B) {
              var10 = this.field_B;
              var5 = var10;
              var6 = -81 % ((-83 - param0) / 32);
              var7 = 0;
              L1: while (true) {
                if (var10.length <= var7) {
                  var5_int = param1;
                  if (var5_int != 80) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (bo.field_p[81]) {
                        stackIn_17_0 = this.a(param2, false);
                        break L2;
                      } else {
                        stackIn_17_0 = this.a(12139, param2);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L3: {
                    var8 = var10[var7];
                    if (var8 == null) {
                      break L3;
                    } else {
                      if (!var8.e(-17741)) {
                        break L3;
                      } else {
                        if (var8.a(-123, param1, param2, param3)) {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var7++;
                  continue L1;
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
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("eh.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    static {
        field_z = false;
        field_x = false;
        field_A = 0;
    }
}
