/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pl extends cf implements dh {
    cf[] field_E;
    static pi field_G;
    static go field_J;
    static int field_F;
    static String field_D;
    static ul field_C;
    static cj field_L;
    static int field_I;
    static String field_K;

    void a(int param0, cf param1, int param2, int param3) {
        cf[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        cf[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (((pl) this).field_E == null) {
              return;
            } else {
              var9 = ((pl) this).field_E;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var9.length <= var6) {
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var7.a(-5407, param1, ((pl) this).field_y + param2, param3 + ((pl) this).field_i);
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("pl.T(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int f(byte param0) {
        int var2 = 0;
        cf[] var3 = null;
        int var4 = 0;
        cf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = ((pl) this).field_E;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 == 44) {
                break L1;
              } else {
                ((pl) this).g(-103);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.f((byte) 44);
              if (var6 > var2) {
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

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        cf[] var9 = null;
        int var10 = 0;
        cf var11 = null;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((pl) this).field_E != null) {
              var8_int = -34 % ((48 - param0) / 37);
              var9 = ((pl) this).field_E;
              var10 = 0;
              L1: while (true) {
                if (var9.length <= var10) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L2: {
                    var11 = var9[var10];
                    if (var11 == null) {
                      break L2;
                    } else {
                      if (!var11.c(127)) {
                        break L2;
                      } else {
                        if (!var11.a((byte) -14, param1, param2, param3, param4, param5, param6)) {
                          break L2;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      }
                    }
                  }
                  var10++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("pl.DB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            field_L = null;
        }
        return null != this.a(8464) ? true : false;
    }

    final boolean a(cf param0, int param1) {
        cf[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cf var5 = null;
        int var6 = 0;
        cf[] var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = ((pl) this).field_E;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var7.length <= var4) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (var5.a(param0, 0)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      break L2;
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
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("pl.S(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        cf[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((pl) this).field_E != null) {
              var5 = ((pl) this).field_E;
              if (param2 == 1) {
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    break L0;
                  } else {
                    var7 = var5[var6];
                    StringBuilder discarded$29 = param3.append(10);
                    var8 = 0;
                    L2: while (true) {
                      if (param1 < var8) {
                        L3: {
                          if (var7 == null) {
                            StringBuilder discarded$30 = param3.append("null");
                            break L3;
                          } else {
                            StringBuilder discarded$31 = var7.a(7, param0, param1 - -1, param3);
                            break L3;
                          }
                        }
                        var6++;
                        continue L1;
                      } else {
                        StringBuilder discarded$32 = param3.append(32);
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5_ref;
            stackOut_15_1 = new StringBuilder().append("pl.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    abstract void g(int param0);

    final String d(byte param0) {
        int var2 = 0;
        cf[] var3 = null;
        int var4 = 0;
        cf var5 = null;
        String var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = -83 / ((param0 - 53) / 57);
        if (((pl) this).field_E != null) {
          var3 = ((pl) this).field_E;
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.d((byte) 123);
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

    private final cf a(int param0) {
        cf[] var2 = null;
        int var3 = 0;
        cf var4 = null;
        int var5 = 0;
        cf[] var6 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((pl) this).field_E) {
          var6 = ((pl) this).field_E;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              return null;
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.c(126)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        cf[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        cf var9 = null;
        int var10 = 0;
        cf[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                ((pl) this).field_E = null;
                break L1;
              }
            }
            if (((pl) this).field_E == null) {
              return;
            } else {
              var11 = ((pl) this).field_E;
              var7 = var11;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var11.length) {
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(param0, param1, param2 + ((pl) this).field_i, param3, true, param5 + ((pl) this).field_y);
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
            stackOut_12_0 = (RuntimeException) var7_ref;
            stackOut_12_1 = new StringBuilder().append("pl.NA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param0);
        var3.a(112, 3);
        var3.a(117, 8);
        if (param1 <= 89) {
            return;
        }
        var3.a(param2, (byte) -69);
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        cf[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        cf var10 = null;
        int var11 = 0;
        cf[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null != ((pl) this).field_E) {
              L1: {
                if (param4 == -24) {
                  break L1;
                } else {
                  field_G = null;
                  break L1;
                }
              }
              var12 = ((pl) this).field_E;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var12.length <= var9) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(param0, param1, param2, param3, param4, param5 - -((pl) this).field_y, ((pl) this).field_i + param6)) {
                        break L3;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("pl.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_14_0 != 0;
    }

    private final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -20) {
              stackOut_3_0 = this.a(param1, false, 1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pl.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((pl) this).g(140);
    }

    public static void f(int param0) {
        field_C = null;
        field_J = null;
        field_L = null;
        field_K = null;
        field_G = null;
        field_D = null;
    }

    pl(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
    }

    private final boolean a(cf param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cf var5 = null;
        cf var6 = null;
        int var7 = 0;
        Object var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((pl) this).field_E == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= ((pl) this).field_E.length) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      var8 = null;
                      ((pl) this).a(127, (cf) null, -44, -22, false, 122);
                      break L2;
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  L3: {
                    var5 = ((pl) this).field_E[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.c(127)) {
                        var4_int = var4_int + 1;
                        L4: while (true) {
                          if (var4_int >= ((pl) this).field_E.length) {
                            break L3;
                          } else {
                            L5: {
                              var6 = ((pl) this).field_E[var4_int];
                              if (var6 != null) {
                                if (var6.a(param0, 0)) {
                                  stackOut_16_0 = 1;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0 != 0;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
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
          L6: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("pl.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!((pl) this).a(param1, -116, param3, param2)) {
                break L1;
              } else {
                ((pl) this).a(param2, param3, (byte) 26, param1);
                this.a(param1, param2, 1, param3);
                break L1;
              }
            }
            L2: {
              if (param0 == 7) {
                break L2;
              } else {
                var6 = null;
                boolean discarded$2 = ((pl) this).a(-120, 113, 5, (cf) null, -93, 86, 64);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param3;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("pl.GA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0;
    }

    private final boolean a(cf param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = this.a(param0, 32, 1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pl.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -80 + 41);
        }
        return stackIn_1_0;
    }

    final void c(byte param0) {
        cf[] var2 = null;
        int var3 = 0;
        cf var4 = null;
        int var5 = 0;
        Object var6 = null;
        cf[] var7 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = ((pl) this).field_E;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var7.length <= var3) {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((pl) this).a((byte) 74, 95, -68, -35, 42, 88, (cf) null);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c((byte) 32);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(cf param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        cf var5 = null;
        cf var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((pl) this).field_E == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var4_int = -1 + ((pl) this).field_E.length;
                if (param1 == 32) {
                  break L1;
                } else {
                  field_C = null;
                  break L1;
                }
              }
              L2: while (true) {
                if (0 > var4_int) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L3: {
                    var5 = ((pl) this).field_E[var4_int];
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.c(param1 + 93)) {
                        var4_int = var4_int - 1;
                        L4: while (true) {
                          if (var4_int < 0) {
                            break L3;
                          } else {
                            L5: {
                              var6 = ((pl) this).field_E[var4_int];
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (var6.a(param0, param1 ^ 32)) {
                                  stackOut_16_0 = 1;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0 != 0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
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
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("pl.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        cf var6 = null;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (0 != param2) {
            break L0;
          } else {
            if (((pl) this).field_h == null) {
              break L0;
            } else {
              ((pl) this).field_h.a(true, param1, -15112, param3, (cf) this);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -2) {
            break L1;
          } else {
            boolean discarded$2 = ((pl) this).c(31);
            break L1;
          }
        }
        L2: {
          if (null == ((pl) this).field_E) {
            break L2;
          } else {
            var5 = -1 + ((pl) this).field_E.length;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = ((pl) this).field_E[var5];
                if (var6 != null) {
                  var6.a(-2, param1 + ((pl) this).field_i, param2, ((pl) this).field_y + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        cf[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        cf var7 = null;
        int var8 = 0;
        Object var9 = null;
        cf[] var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((pl) this).field_E == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var10 = ((pl) this).field_E;
              var5 = var10;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var10.length) {
                  L2: {
                    if (param3 == -6208) {
                      break L2;
                    } else {
                      var9 = null;
                      boolean discarded$2 = ((pl) this).a((cf) null, -34);
                      break L2;
                    }
                  }
                  var5_int = param0;
                  if (var5_int != 80) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    L3: {
                      if (lc.field_m[81]) {
                        stackOut_18_0 = this.a(param2, (byte) -80);
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_17_0 = this.a((byte) -20, param2);
                        stackIn_19_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    return stackIn_19_0;
                  }
                } else {
                  L4: {
                    var7 = var10[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.c(125)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, param1, param2, -6208)) {
                          break L4;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0 != 0;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5_ref;
            stackOut_22_1 = new StringBuilder().append("pl.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        return stackIn_21_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new pi(2);
        field_D = "Make one of your zombies quite appealing, charming humans into following it...to their doom!";
        field_K = "Enter name of player to add to list";
    }
}
