/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class se extends cf implements dh {
    th field_B;
    static re field_F;
    static int field_E;
    static String field_D;
    static int field_C;

    final boolean a(cf param0, int param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        cf var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new ch(this.field_B);
              if (param1 == 0) {
                break L1;
              } else {
                this.c((byte) -102);
                break L1;
              }
            }
            var4 = (cf) ((Object) var3.c(-3));
            L2: while (true) {
              if (var4 == null) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a(param0, param1 ^ 0)) {
                  var4 = (cf) ((Object) var3.a((byte) -89));
                  continue L2;
                } else {
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("se.S(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            return false;
        }
        return this.g(121) != null ? true : false;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cf var8 = null;
        cf var9 = null;
        ch var10 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = new ch(this.field_B);
            var9 = (cf) ((Object) var10.c(-3));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(4)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.c(127)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, -6208)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (cf) ((Object) var10.a((byte) -126));
                    continue L1;
                  }
                }
              }
              L4: {
                if (param3 == -6208) {
                  break L4;
                } else {
                  var8 = (cf) null;
                  this.b((byte) 124, (cf) null);
                  break L4;
                }
              }
              var6 = param0;
              if ((var6 ^ -1) != -81) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (!lc.field_m[81]) {
                    stackIn_15_0 = this.a(param3 + 6319, param2);
                    break L5;
                  } else {
                    stackIn_15_0 = this.a((byte) -1, param2);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("se.CA(").append(param0).append(',').append(param1).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        ch var7 = null;
        cf var8 = null;
        int var9 = 0;
        cf var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                var10 = (cf) null;
                this.a(64, (cf) null, 84, 126);
                break L1;
              }
            }
            var7 = new ch(this.field_B);
            var8 = (cf) ((Object) var7.c(-3));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(4)) {
                    break L3;
                  } else {
                    var8.a(param0, param1, param2 + this.field_i, param3, true, param5 + this.field_y);
                    var8 = (cf) ((Object) var7.a((byte) -80));
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
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("se.NA(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        ch var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!this.field_B.f(28113)) {
              if (param0 > 20) {
                var8 = new ch(this.field_B);
                var4 = (cf) ((Object) var8.c(-3));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (var4.c(126)) {
                        var5 = new ch(this.field_B);
                        var5.a(2680, var4);
                        var6 = (cf) ((Object) var5.a((byte) -36));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param1, 0)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (cf) ((Object) var5.a((byte) -58));
                              continue L3;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (cf) ((Object) var8.a((byte) -126));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
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
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("se.AB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    String d(byte param0) {
        ch var2;
        int var3;
        cf var4;
        String var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(this.field_B);
        var3 = -21 / ((53 - param0) / 57);
        var4 = (cf) ((Object) var2.c(-3));
        L0: while (true) {
          if (var4 != null) {
            var5 = var4.d((byte) 112);
            if (var5 == null) {
              var4 = (cf) ((Object) var2.a((byte) -46));
              continue L0;
            } else {
              return var5;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 == 0 && this.field_h != null) {
            this.field_h.a(true, param1, -15112, param3, (cf) (this));
        }
        if (param0 != -2) {
            field_D = (String) null;
        }
        ch var5 = new ch(this.field_B);
        cf var6 = (cf) ((Object) var5.a(32397));
        while (var6 != null) {
            var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
            var6 = (cf) ((Object) var5.e(param0 ^ 3));
        }
    }

    private final void f(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_B);
        int var4 = -105 % ((param0 - 36) / 61);
        cf var3 = (cf) ((Object) var2.c(-3));
        while (var3 != null) {
            var3.e(-1);
            var3 = (cf) ((Object) var2.a((byte) -34));
        }
    }

    final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        cf var8 = null;
        ch var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_B.f(28113)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = new ch(this.field_B);
                if (param0 == -1) {
                  break L1;
                } else {
                  var8 = (cf) null;
                  this.a((cf) null, 48);
                  break L1;
                }
              }
              var4 = (cf) ((Object) var9.a(32397));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.c(125)) {
                      break L3;
                    } else {
                      var5 = new ch(this.field_B);
                      var5.b(-4, var4);
                      var6 = (cf) ((Object) var5.e(-3));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param1, 0)) {
                            var6 = (cf) ((Object) var5.e(param0 ^ 2));
                            continue L4;
                          } else {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (cf) ((Object) var9.e(-3));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("se.IB(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
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
              if (this.a(param1, -81, param3, param2)) {
                this.a(param2, param3, (byte) 26, param1);
                this.a(param1, param2, -92, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 7) {
                break L2;
              } else {
                field_E = 118;
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

            stackIn_9_1 = new StringBuilder().append("se.GA(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = new ch(this.field_B);
            var6 = (cf) ((Object) var5.c(-3));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param2 < -79) {
                    break L2;
                  } else {
                    field_D = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param3.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param1 < var7) {
                    var6.a(7, param0, 1 + param1, param3);
                    var6 = (cf) ((Object) var5.a((byte) -94));
                    continue L1;
                  } else {
                    discarded$3 = param3.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("se.KB(");

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
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ch(this.field_B);
            var6 = (cf) ((Object) var5.c(-3));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(4)) {
                    break L2;
                  } else {
                    var6.a(-5407, param1, param2 - -this.field_y, param3 + this.field_i);
                    var6 = (cf) ((Object) var5.a((byte) -59));
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

            stackIn_8_1 = new StringBuilder().append("se.T(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        cf var10 = null;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var9 = -59 / ((48 - param0) / 37);
            var8 = new ch(this.field_B);
            var10 = (cf) ((Object) var8.c(-3));
            L1: while (true) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  if (!var10.b(4)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var10.c(126)) {
                        break L3;
                      } else {
                        if (!var10.a((byte) 105, param1, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var10 = (cf) ((Object) var8.a((byte) -50));
                    continue L1;
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8_ref);

            stackIn_13_1 = new StringBuilder().append("se.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_F = null;
        field_D = null;
    }

    final void b(byte param0, cf param1) {
        try {
            if (param0 <= 38) {
                field_D = (String) null;
            }
            this.field_B.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "se.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int var2;
        ch var3;
        cf var4;
        int var5;
        int var6;
        StringBuilder var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = new ch(this.field_B);
        var4 = (cf) ((Object) var3.c(param0 + -47));
        L0: while (true) {
          if (var4 == null) {
            L1: {
              if (param0 == 44) {
                break L1;
              } else {
                var7 = (StringBuilder) null;
                this.a((Hashtable) null, 57, 123, (StringBuilder) null);
                break L1;
              }
            }
            return var2;
          } else {
            L2: {
              var5 = var4.f((byte) 44);
              if ((var5 ^ -1) < (var2 ^ -1)) {
                var2 = var5;
                break L2;
              } else {
                break L2;
              }
            }
            var4 = (cf) ((Object) var3.a((byte) -74));
            continue L0;
          }
        }
    }

    final void c(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 32) {
            this.field_B = (th) null;
        }
        ch var2 = new ch(this.field_B);
        cf var3 = (cf) ((Object) var2.c(-3));
        while (var3 != null) {
            var3.c((byte) 32);
            var3 = (cf) ((Object) var2.a((byte) -50));
        }
    }

    se(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
        this.field_B = new th();
    }

    cf g(int param0) {
        ch var2;
        cf var3;
        int var4;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 >= 88) {
            break L0;
          } else {
            field_F = (re) null;
            break L0;
          }
        }
        var2 = new ch(this.field_B);
        var3 = (cf) ((Object) var2.c(-3));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.c(125)) {
              var3 = (cf) ((Object) var2.a((byte) -40));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        cf var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ch(this.field_B);
              if (param4 == -24) {
                break L1;
              } else {
                field_C = 84;
                break L1;
              }
            }
            var9 = (cf) ((Object) var8.c(-3));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(4)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, param2, param3, -24, param5 - -this.field_y, param6 - -this.field_i)) {
                      var9 = (cf) ((Object) var8.a((byte) -81));
                      continue L2;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("se.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(param2 + -29048);
    }

    static {
        field_F = new re();
        field_D = "Return to the Laboratory";
        field_E = 0;
    }
}
