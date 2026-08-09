/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ib extends oc implements sd {
    static int[] field_D;
    static jp field_E;
    static String field_F;
    static String field_C;
    vl field_G;

    final boolean a(oc param0, byte param1) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        oc var4 = null;
        kh var5 = null;
        oc var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!this.field_G.a(false)) {
              var3 = new kh(this.field_G);
              if (param1 <= -115) {
                var4 = (oc) ((Object) var3.a(240));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.f(-128)) {
                        break L2;
                      } else {
                        var5 = new kh(this.field_G);
                        var5.a(122, var4);
                        var6 = (oc) ((Object) var5.b(7));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(true, param0)) {
                              var6 = (oc) ((Object) var5.b(7));
                              continue L3;
                            } else {
                              stackIn_14_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    var4 = (oc) ((Object) var3.b(7));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
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
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("ib.FB(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final boolean b(oc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kh var4 = null;
        oc var5 = null;
        kh var6 = null;
        oc var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = -60 % ((param1 - 51) / 34);
            if (!this.field_G.a(false)) {
              var4 = new kh(this.field_G);
              var5 = (oc) ((Object) var4.a(true));
              L1: while (true) {
                if (var5 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var5.f(-57)) {
                      var6 = new kh(this.field_G);
                      var6.b(16802, var5);
                      var7 = (oc) ((Object) var6.d(-24706));
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a(true, param0)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var7 = (oc) ((Object) var6.d(-24706));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5 = (oc) ((Object) var4.d(-24706));
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
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ib.JB(");

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
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 == 0 && this.field_l != null) {
            this.field_l.a(true, param3 + -20607, param1, (oc) (this), param0);
        }
        kh var5 = new kh(this.field_G);
        if (param3 != -11) {
            this.field_G = (vl) null;
        }
        oc var6 = (oc) ((Object) var5.a(true));
        while (var6 != null) {
            var6.a(this.field_w + param0, this.field_o + param1, param2, (byte) -11);
            var6 = (oc) ((Object) var5.d(param3 + -24695));
        }
    }

    final void a(oc param0, boolean param1) {
        try {
            this.field_G.a(param0, (byte) 3);
            if (!param1) {
                field_F = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ib.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(this.field_G);
        int var3 = -77 % ((param0 - 69) / 46);
        oc var4 = (oc) ((Object) var2.a(240));
        while (var4 != null) {
            var4.e(1);
            var4 = (oc) ((Object) var2.b(7));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        kh var8 = null;
        RuntimeException var8_ref = null;
        oc var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var8 = new kh(this.field_G);
            var9 = (oc) ((Object) var8.a(240));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(0)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.f(-65)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, -126, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (oc) ((Object) var8.b(7));
                    continue L1;
                  }
                }
              }
              if (param3 < -125) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_G = (vl) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("ib.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_F = null;
        int var1 = -92 / ((param0 - -2) / 38);
        field_D = null;
        field_C = null;
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        kh var8 = null;
        RuntimeException var8_ref = null;
        oc var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var8 = new kh(this.field_G);
            if (param6 == 0) {
              var9 = (oc) ((Object) var8.a(240));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(param6 ^ 0)) {
                      break L2;
                    } else {
                      if (!var9.a(param0, param1, param2 + this.field_o, this.field_w + param3, param4, param5, 0)) {
                        var9 = (oc) ((Object) var8.b(7));
                        continue L1;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
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
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("ib.MA(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        kh var7 = null;
        oc var8 = null;
        int var9 = 0;
        StringBuilder var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = new kh(this.field_G);
              var8 = (oc) ((Object) var7.a(240));
              if (param4 == 19223) {
                break L1;
              } else {
                var10 = (StringBuilder) null;
                this.a(-102, (Hashtable) null, 23, (StringBuilder) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(0)) {
                    break L3;
                  } else {
                    var8.a(param0, param1, param2 + this.field_w, param3, 19223, param5 + this.field_o);
                    var8 = (oc) ((Object) var7.b(7));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("ib.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 8) {
                L2: {
                  if (param1 == -1) {
                    break L2;
                  } else {
                    ib.a(89, false, 71, 122, false, 9, -88);
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                break L0;
              } else {
                if ((param0[var2_int] ^ -1) == -1) {
                  var2_int++;
                  continue L1;
                } else {
                  return true;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ib.KB(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void a(StringBuilder param0, int param1, byte param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        kh var5 = null;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        oc var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = new kh(this.field_G);
            var6 = (oc) ((Object) var5.a(240));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param2 > 52) {
                    break L2;
                  } else {
                    var9 = (oc) null;
                    this.a((oc) null, (byte) -19);
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param0.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param1 < var7) {
                    var6.a(param1 + 1, param3, 24, param0);
                    var6 = (oc) ((Object) var5.b(7));
                    continue L1;
                  } else {
                    discarded$3 = param0.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("ib.MB(");

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7;
        int var8;
        int var9_int;
        jp var9;
        L0: {
          var7 = 0;
          param3 = (1414 + param3) % 1414;
          var8 = 0;
          if (284 >= param3) {
            var8 = 5;
            var7 = 11 - -param3;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param3 -= 284;
          if (-1 <= (param3 ^ -1)) {
            break L1;
          } else {
            if ((param3 ^ -1) < -6) {
              break L1;
            } else {
              var9_int = 2048 * param3 / 5;
              var7 = 295 - -(3 * sa.a(var9_int, -4097) >> 1756993296);
              var8 = -(3 * BrickABrac.c(2048, var9_int) >> 1229388688) + 8;
              break L1;
            }
          }
        }
        if (!param1) {
          L2: {
            param3 -= 5;
            if ((param3 ^ -1) >= -1) {
              break L2;
            } else {
              if ((param3 ^ -1) >= -414) {
                var7 = 298;
                var8 = param3 + 8;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            param3 -= 413;
            if ((param3 ^ -1) >= -1) {
              break L3;
            } else {
              if ((param3 ^ -1) < -6) {
                break L3;
              } else {
                var9_int = param3 * 2048 / 5;
                var7 = 295 - -(3 * BrickABrac.c(2048, var9_int) >> -733614416);
                var8 = (sa.a(var9_int, -4097) * 3 >> -414234160) + 421;
                break L3;
              }
            }
          }
          L4: {
            param3 -= 5;
            if (0 >= param3) {
              break L4;
            } else {
              if ((param3 ^ -1) < -285) {
                break L4;
              } else {
                var7 = 295 + -param3;
                var8 = 424;
                break L4;
              }
            }
          }
          L5: {
            param3 -= 284;
            if (0 >= param3) {
              break L5;
            } else {
              if (-6 > (param3 ^ -1)) {
                break L5;
              } else {
                var9_int = param3 * 2048 / 5;
                var7 = -(3 * sa.a(var9_int, -4097) >> 809700368) + 11;
                var8 = 421 + (BrickABrac.c(2048, var9_int) * 3 >> 1505538672);
                break L5;
              }
            }
          }
          L6: {
            param3 -= 5;
            if ((param3 ^ -1) >= -1) {
              break L6;
            } else {
              if (-414 <= (param3 ^ -1)) {
                var7 = 8;
                var8 = 421 - param3;
                break L6;
              } else {
                break L6;
              }
            }
          }
          L7: {
            param3 -= 413;
            if (-1 > (param3 ^ -1)) {
              var9_int = 2048 * param3 / 5;
              var7 = 11 - (3 * BrickABrac.c(2048, var9_int) >> -1294203408);
              var8 = 8 + -(sa.a(var9_int, -4097) * 3 >> -1874338384);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var9 = tf.field_g[param0];
            param6 = param6 + (-(var9.field_x / 2) + var7);
            param5 = param5 + (-(var9.field_z / 2) + var8);
            if (param4) {
              nb.a(-111, param5, param6, lk.field_n[param0]);
              rn.field_a[param0].f(param6, param5, 256);
              break L8;
            } else {
              break L8;
            }
          }
          var9.c(param6, param5);
          return;
        } else {
          return;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (this.a(param3, param2 + 1595637968, param0, param1)) {
                this.a(param1, param0, 0, param3);
                this.a(param3, param0, (byte) 104, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 24) {
                break L2;
              } else {
                this.field_G = (vl) null;
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

            stackIn_9_1 = new StringBuilder().append("ib.UA(").append(param0).append(',');

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
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean f(int param0) {
        if (param0 > -49) {
            this.g(4);
        }
        return this.g((byte) -3) != null ? true : false;
    }

    ib(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
        this.field_G = new vl();
    }

    oc g(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        kh var2 = new kh(this.field_G);
        oc var3 = (oc) ((Object) var2.a(240));
        while (var3 != null) {
            if (!(!var3.f(-83))) {
                return var3;
            }
            var3 = (oc) ((Object) var2.b(7));
        }
        if (param0 == -3) {
            return null;
        }
        oc var5 = (oc) null;
        this.a((oc) null, (byte) -16, -70, 95);
        return null;
    }

    String d(int param0) {
        kh var2;
        oc var3;
        String var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = new kh(this.field_G);
        if (param0 >= 6) {
          var3 = (oc) ((Object) var2.a(240));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.d(37);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (oc) ((Object) var2.b(7));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        oc var9 = null;
        kh var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var10 = new kh(this.field_G);
            var9 = (oc) ((Object) var10.a(param1 + 130));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(0)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.f(-118)) {
                        break L3;
                      } else {
                        if (var9.a(param0, (byte) 110, param2, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (oc) ((Object) var10.b(param1 ^ 105));
                    continue L1;
                  }
                }
              }
              L4: {
                if (param1 == 110) {
                  break L4;
                } else {
                  var8 = (StringBuilder) null;
                  this.a(87, (Hashtable) null, -4, (StringBuilder) null);
                  break L4;
                }
              }
              var6 = param0;
              if (var6 == 80) {
                L5: {
                  if (pe.field_l[81]) {
                    stackIn_17_0 = this.b(param2, (byte) -118);
                    break L5;
                  } else {
                    stackIn_17_0 = this.a(param2, (byte) -128);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ib.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_17_0;
        }
    }

    final void b(boolean param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
            ib.f((byte) 29);
        }
        kh var2 = new kh(this.field_G);
        oc var3 = (oc) ((Object) var2.a(240));
        while (var3 != null) {
            var3.b(false);
            var3 = (oc) ((Object) var2.b(7));
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(116);
    }

    final int e(byte param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = -70 % ((-17 - param0) / 43);
        int var2 = 0;
        kh var4 = new kh(this.field_G);
        oc var5 = (oc) ((Object) var4.a(240));
        while (var5 != null) {
            var6 = var5.e((byte) -86);
            if (var6 > var2) {
                var2 = var6;
            }
            var5 = (oc) ((Object) var4.b(7));
        }
        return var2;
    }

    final boolean a(boolean param0, oc param1) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        oc var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3 = new kh(this.field_G);
            if (param0) {
              var4 = (oc) ((Object) var3.a(240));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!var4.a(param0, param1)) {
                    var4 = (oc) ((Object) var3.b(7));
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ib.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        kh var5 = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new kh(this.field_G);
            var6 = (oc) ((Object) var5.a(240));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(param1 + 0)) {
                    break L2;
                  } else {
                    var6.a(param0, (byte) 0, this.field_o + param2, this.field_w + param3);
                    var6 = (oc) ((Object) var5.b(7));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ib.WA(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_C = "You have 1 unread message!";
        field_F = "Loading graphics";
    }
}
