/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jc extends fe implements rk {
    static int field_E;
    static ea field_G;
    fe field_I;
    static int[] field_F;
    static int field_H;
    static String field_D;

    final static void a(boolean param0, int param1, int param2) {
        df.a(param2, 5494, oj.field_J);
        if (param1 >= -104) {
            field_F = (int[]) null;
        }
    }

    final boolean k(int param0) {
        int var2 = -5 % ((param0 - -33) / 45);
        return null != this.m(-21923) ? true : false;
    }

    jc(int param0, int param1, int param2, int param3, ad param4, rm param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int b(byte param0) {
        if (param0 >= -88) {
            field_H = 87;
        }
        return null != this.field_I ? this.field_I.b((byte) -124) : 0;
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_I) {
                break L1;
              } else {
                if (!this.field_I.k(-82)) {
                  break L1;
                } else {
                  if (this.field_I.a(param0, param1, (byte) -79, param3)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param2 == -79) {
              var5_int = param3;
              if (var5_int == 80) {
                L2: {
                  if (!qd.field_O[81]) {
                    stackIn_14_0 = this.a(param1, (byte) 77);
                    break L2;
                  } else {
                    stackIn_14_0 = this.a(-13, param1);
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("jc.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 49) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, (byte) 101, param3);
              if (null == this.field_I) {
                break L2;
              } else {
                this.field_I.a(this.field_t + param0, this.field_u + param1, (byte) 113, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("jc.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, -48, param2, param3, param4);
        this.a((byte) -12);
        if (param1 > -33) {
            field_D = (String) null;
        }
    }

    String h(int param0) {
        String var3 = null;
        String var2 = super.h(param0);
        if (null != this.field_I) {
            var3 = this.field_I.h(-27867);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    private final boolean a(fe param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 77) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_I == null) {
                  break L3;
                } else {
                  if (this.field_I.k(53)) {
                    break L3;
                  } else {
                    if (!this.field_I.a(param0, 124)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jc.FB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static int a(byte param0, we param1, String[] param2, int param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5_int = param1.a(param4);
              if (var5_int > param3) {
                break L1;
              } else {
                if (-1 != param4.indexOf("<br>")) {
                  break L1;
                } else {
                  param2[0] = param4;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (-1 + (var5_int + param3)) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            if (param0 == 106) {
              var8 = param4.length();
              var9 = 0;
              L2: while (true) {
                if (var8 <= var9) {
                  L3: {
                    if (var7 < var8) {
                      incrementValue$0 = var6;
                      var6++;
                      param2[incrementValue$0] = param4.substring(var7, var8).trim();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackIn_26_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param4.charAt(var9);
                      if (-33 == (var10 ^ -1)) {
                        break L5;
                      } else {
                        if (var10 != 45) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param4.substring(var7, 1 + var9).trim();
                    var12 = param1.a(var11);
                    if (var12 < param3) {
                      break L4;
                    } else {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param2[incrementValue$1] = var11;
                      break L4;
                    }
                  }
                  if (62 == var10) {
                    if (param4.regionMatches(var9 + -3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param2[incrementValue$2] = param4.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_7_0 = 62;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("jc.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    final boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 119) {
                break L1;
              } else {
                var4 = (fe) null;
                this.a('ﾻ', (fe) null, (byte) -61, 127);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_I) {
                  break L3;
                } else {
                  if (!this.field_I.a(param0, 126)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("jc.UA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    fe m(int param0) {
        fe var2 = this.field_I;
        if (var2 != null) {
            if (!(!var2.k(-95))) {
                return var2;
            }
        }
        if (param0 == -21923) {
            return null;
        }
        field_G = (ea) null;
        return null;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        fe var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -53) {
                break L1;
              } else {
                var9 = (fe) null;
                discarded$1 = this.a((fe) null, (byte) 0);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_I == null) {
                  break L3;
                } else {
                  if (!this.field_I.k(73)) {
                    break L3;
                  } else {
                    if (!this.field_I.a(param0, param1, param2, param3, (byte) -119, param5, param6)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("jc.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, boolean param1) {
        wm.field_f.a(false, param1);
        int var2 = -20 / ((param0 - -33) / 35);
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              discarded$27 = param2.append('\n');
              if (param3 <= -24) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int > param1) {
                L3: {
                  if (null != this.field_I) {
                    this.field_I.a((byte) -70, param0, 1 + param1, param2);
                    break L3;
                  } else {
                    discarded$28 = param2.append("null");
                    break L3;
                  }
                }
                break L0;
              } else {
                discarded$29 = param2.append(' ');
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("jc.S(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final void g(int param0) {
        if (!(this.field_I == null)) {
            this.field_I.g(param0 ^ 0);
        }
        if (param0 != 4966) {
            field_E = 81;
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_F = null;
        field_G = null;
        if (param0 != 0) {
            field_E = 103;
        }
    }

    void a(byte param0) {
        if (this.field_I != null) {
            this.field_I.i(-5257);
        }
        if (param0 != -12) {
            fe var3 = (fe) null;
            this.a(-6, -98, -123, 122, (byte) 54, (fe) null, 2);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_H = -37;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_I == null) {
                  break L3;
                } else {
                  if (!this.field_I.a(param0, param1 + this.field_t, 0, param3, param4, param5, this.field_u + param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("jc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
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
              if (param0 == -70) {
                break L1;
              } else {
                jc.a(50, -27, 49, 55, true, 1, 91);
                break L1;
              }
            }
            L2: {
              if (this.a(param3, true, param2, param1)) {
                this.a(param1, param3, 34, param2);
                this.a(param1, param2, param3, -33);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("jc.SA(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 < param6) {
              if (1 + param0 >= param2) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 <= 5 + param0) {
                    break L1;
                  } else {
                    if (param1 != param5) {
                      var7_int = (param5 & param1 & 1) + ((param1 >> -1140025855) + (param5 >> -406524703));
                      var8 = param0;
                      var9 = param1;
                      var10 = param5;
                      var11 = -63 / ((-74 - param3) / 45);
                      var12 = param0;
                      L2: while (true) {
                        if (var12 >= param2) {
                          jc.a(param0, param1, var8, 87, param4, var9, param6);
                          jc.a(var8, var10, param2, -123, param4, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var13 = an.field_a[var12];
                            if (!param4) {
                              stackIn_24_0 = cc.field_L[var13];
                              break L3;
                            } else {
                              stackIn_24_0 = pi.field_h[var13];
                              break L3;
                            }
                          }
                          L4: {
                            var14 = stackIn_24_0;
                            if (var14 <= var7_int) {
                              if (var14 > var10) {
                                var10 = var14;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              an.field_a[var12] = an.field_a[var8];
                              incrementValue$0 = var8;
                              var8++;
                              an.field_a[incrementValue$0] = var13;
                              if (var14 < var9) {
                                var9 = var14;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var12++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L5: while (true) {
                  if (var7_int <= param0) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param0;
                    L6: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = an.field_a[var8];
                          var10 = an.field_a[1 + var8];
                          if (ri.a(20021, param4, var9, var10)) {
                            an.field_a[var8] = var10;
                            an.field_a[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
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
          var7 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var7), "jc.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 4) {
            field_D = (String) null;
        }
        if (-1 == (param3 ^ -1) && this.field_A != null) {
            this.field_A.a(12088, param1, (fe) (this), param2, true);
        }
        if (null != this.field_I) {
            this.field_I.a((byte) 4, param1 - -this.field_u, param2 + this.field_t, param3);
        }
    }

    private final boolean a(int param0, fe param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -5) {
                break L1;
              } else {
                this.g(103);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_I == null) {
                  break L3;
                } else {
                  if (this.field_I.k(-88)) {
                    break L3;
                  } else {
                    if (!this.field_I.a(param1, 120)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jc.GB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_I) {
                this.field_I.a(param0 + this.field_u, param1, param2, this.field_t + param3, param4, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 == 0) {
                break L2;
              } else {
                jc.a(false, 113, 39);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("jc.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ')');
        }
    }

    static {
        field_F = new int[8192];
        field_H = 0;
        field_D = "Options";
    }
}
