/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eg extends na implements nf {
    na[] field_I;
    static je field_J;
    static String field_M;
    static String field_L;
    private static long[] field_O;
    static byte[] field_K;
    static String field_N;

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
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
              if (param3 == -372494750) {
                break L1;
              } else {
                field_J = (je) null;
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param2, 105, param1)) {
                this.a(param3 ^ 372494831, param1, param0, param2);
                this.b(param2, param1, param0, 0);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("eg.WA(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(na param0, int param1) {
        na[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        na var5 = null;
        int var6 = 0;
        na[] var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param1 == -384169950) {
                break L1;
              } else {
                field_M = (String) null;
                break L1;
              }
            }
            var7 = this.field_I;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    if (var5.a(param0, -384169950)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
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
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("eg.EB(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    eg(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
    }

    public static void g(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != -1) {
            return;
        }
        field_O = null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    final int d(int param0) {
        int var2;
        na[] var3;
        int var4;
        na var5;
        int var7;
        int var6;
        var7 = TetraLink.field_J;
        var2 = 0;
        var3 = this.field_I;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            if (param0 <= -114) {
              return var2;
            } else {
              return 30;
            }
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.d(-120);
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

    private final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        int var9 = 0;
        na[] var10 = null;
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
        RuntimeException var5 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            if (null == this.field_I) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var10 = this.field_I;
              var6 = param3;
              L1: while (true) {
                if (var6 >= var10.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var10[var6];
                  discarded$4 = param1.append('\n');
                  var8 = 0;
                  L2: while (true) {
                    if (param0 < var8) {
                      L3: {
                        if (var7 == null) {
                          discarded$5 = param1.append("null");
                          break L3;
                        } else {
                          var7.a(param2, param1, 1 + param0, -372494750);
                          break L3;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      discarded$6 = param1.append(' ');
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("eg.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final na a(int param0) {
        na[] var2;
        int var3;
        na var4;
        int var5;
        na[] var6;
        var5 = TetraLink.field_J;
        if (this.field_I != null) {
          var6 = this.field_I;
          var2 = var6;
          if (param0 == 18305) {
            var3 = 0;
            L0: while (true) {
              if (var6.length > var3) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.c(3)) {
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
            return (na) null;
          }
        } else {
          return null;
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
            return false;
        }
        return this.a(param0 + 18302) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, -128, param3, param4);
        this.d((byte) -127);
        int var6 = -83 % ((param2 - -61) / 51);
    }

    abstract void d(byte param0);

    final String e(int param0) {
        na[] var2;
        int var3;
        na var4;
        int var6;
        String var5;
        var6 = TetraLink.field_J;
        if (this.field_I != null) {
          var2 = this.field_I;
          var3 = param0;
          L0: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.e(0);
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
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        na[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param4 == -32738) {
                break L1;
              } else {
                field_L = (String) null;
                break L1;
              }
            }
            if (this.field_I == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_I;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1 + this.field_t, param2, param3 - -this.field_w, -32738, param5, param6)) {
                        break L3;
                      } else {
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
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
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("eg.PA(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    private final boolean a(int param0, na param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
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
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (this.field_I == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= this.field_I.length) {
                  var4_int = 59 / ((param0 - -32) / 38);
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = this.field_I[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (!var5.c(3)) {
                        break L2;
                      } else {
                        var4_int = var4_int + param2;
                        L3: while (true) {
                          if (this.field_I.length <= var4_int) {
                            break L2;
                          } else {
                            L4: {
                              var6 = this.field_I[var4_int];
                              if (var6 != null) {
                                if (!var6.a(param1, -384169950)) {
                                  break L4;
                                } else {
                                  stackIn_15_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L4;
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

            stackIn_22_1 = new StringBuilder().append("eg.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
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

    private final boolean a(int param0, na param1) {
        RuntimeException var3 = null;
        na var4 = null;
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
              if (param0 == 1) {
                break L1;
              } else {
                var4 = (na) null;
                this.a((na) null, -49);
                break L1;
              }
            }
            stackIn_3_0 = this.a(true, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("eg.K(").append(param0).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        na[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
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
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == -19137) {
                break L1;
              } else {
                this.e(-73);
                break L1;
              }
            }
            if (null != this.field_I) {
              var12 = this.field_I;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.c(3)) {
                        break L3;
                      } else {
                        if (var10.a(-19137, param1, param2, param3, param4, param5, param6)) {
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

            stackIn_19_1 = new StringBuilder().append("eg.NA(").append(param0).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    private final boolean a(boolean param0, int param1, na param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
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
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            if (null == this.field_I) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = -1 + this.field_I.length;
              L2: while (true) {
                if (0 > var4_int) {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var5 = this.field_I[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (!var5.c(3)) {
                        break L3;
                      } else {
                        var4_int = var4_int - param1;
                        L4: while (true) {
                          if (-1 < (var4_int ^ -1)) {
                            break L3;
                          } else {
                            L5: {
                              var6 = this.field_I[var4_int];
                              if (var6 != null) {
                                if (!var6.a(param2, -384169950)) {
                                  break L5;
                                } else {
                                  stackIn_17_0 = 1;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int - param1;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("eg.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5;
        na var6;
        int var7;
        L0: {
          var7 = TetraLink.field_J;
          if (param3 != 0) {
            break L0;
          } else {
            if (this.field_H != null) {
              this.field_H.a((na) (this), param1, param2, true, true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            field_N = (String) null;
            break L1;
          }
        }
        L2: {
          if (this.field_I != null) {
            var5 = -1 + this.field_I.length;
            L3: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L2;
              } else {
                var6 = this.field_I[var5];
                if (var6 != null) {
                  var6.a(0, this.field_t + param1, param2 + this.field_w, param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final void f(int param0) {
        na[] var2;
        int var3;
        na var4;
        int var5;
        na[] var6;
        L0: {
          var5 = TetraLink.field_J;
          if (param0 < -63) {
            break L0;
          } else {
            this.a(80, 112, -68, 77, -76);
            break L0;
          }
        }
        var6 = this.field_I;
        var2 = var6;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.f(-128);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(na param0, byte param1) {
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
            if (param1 == 45) {
              stackIn_4_0 = this.a(-115, param0, 1);
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

            stackIn_7_1 = new StringBuilder().append("eg.E(");

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
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        na[] var5 = null;
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null != this.field_I) {
              var9 = this.field_I;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(param0, this.field_t + param1, this.field_w + param2, param3);
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
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("eg.MA(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        na[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            if (this.field_I == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = this.field_I;
              var5 = var9;
              if (param2 == 1) {
                var6 = 0;
                L1: while (true) {
                  if (var9.length <= var6) {
                    var5_int = param0;
                    if (-81 != (var5_int ^ -1)) {
                      stackIn_23_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L2: {
                        if (sn.field_a[81]) {
                          stackIn_21_0 = this.a(1, param3);
                          break L2;
                        } else {
                          stackIn_21_0 = this.a(param3, (byte) 45);
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (var7 == null) {
                        break L3;
                      } else {
                        if (!var7.c(param2 + 2)) {
                          break L3;
                        } else {
                          if (var7.a(param0, param1, 1, param3)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6++;
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
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5_ref);

            stackIn_26_1 = new StringBuilder().append("eg.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        na[] var7 = null;
        int var8 = 0;
        na var9 = null;
        int var10 = 0;
        na[] var11 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            if (null == this.field_I) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var11 = this.field_I;
              var7 = var11;
              if (!param1) {
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var11.length) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      var9 = var11[var8];
                      if (var9 == null) {
                        break L2;
                      } else {
                        var9.a(param0, false, param2, param3 + this.field_w, param4, this.field_t + param5);
                        break L2;
                      }
                    }
                    var8++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7_ref);

            stackIn_14_1 = new StringBuilder().append("eg.AB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_J = new je();
            field_M = "<%0> has resigned.";
            field_L = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
            field_O = new long[256];
            var2 = 0;
            L0: while (true) {
              if (256 <= var2) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_O[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (-2L == (var0 & 1L ^ -1L)) {
                      var0 = -3932672073523589310L ^ var0 >>> -1022872191;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
