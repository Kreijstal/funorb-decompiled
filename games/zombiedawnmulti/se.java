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
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new ch(((se) this).field_B);
              if (param1 == 0) {
                break L1;
              } else {
                ((se) this).c((byte) -102);
                break L1;
              }
            }
            var4 = (cf) (Object) var3.c(-3);
            L2: while (true) {
              if (var4 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!var4.a(param0, param1)) {
                  var4 = (cf) (Object) var3.a((byte) -89);
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("se.S(");
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

    final boolean c(int param0) {
        if (param0 < 123) {
            return false;
        }
        return ((se) this).g(121) != null ? true : false;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        cf var9 = null;
        ch var10 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = new ch(((se) this).field_B);
            var9 = (cf) (Object) var10.c(-3);
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
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (cf) (Object) var10.a((byte) -126);
                    continue L1;
                  }
                }
              }
              L4: {
                if (param3 == -6208) {
                  break L4;
                } else {
                  var8 = null;
                  ((se) this).b((byte) 124, (cf) null);
                  break L4;
                }
              }
              var6 = param0;
              if (var6 != 80) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L5: {
                  if (!lc.field_m[81]) {
                    stackOut_14_0 = ((se) this).a(param3 + 6319, param2);
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = ((se) this).a((byte) -1, param2);
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("se.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        ch var7 = null;
        RuntimeException var7_ref = null;
        cf var8 = null;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                var10 = null;
                ((se) this).a(64, (cf) null, 84, 126);
                break L1;
              }
            }
            var7 = new ch(((se) this).field_B);
            var8 = (cf) (Object) var7.c(-3);
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(4)) {
                    break L3;
                  } else {
                    var8.a(param0, param1, param2 + ((se) this).field_i, param3, true, param5 + ((se) this).field_y);
                    var8 = (cf) (Object) var7.a((byte) -80);
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
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("se.NA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean a(int param0, cf param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!((se) this).field_B.f(28113)) {
              if (param0 > 20) {
                var3 = new ch(((se) this).field_B);
                var4 = (cf) (Object) var3.c(-3);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    L2: {
                      if (var4.c(126)) {
                        var5 = new ch(((se) this).field_B);
                        br discarded$2 = var5.a(2680, (br) (Object) var4);
                        var6 = (cf) (Object) var5.a((byte) -36);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param1, 0)) {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            } else {
                              var6 = (cf) (Object) var5.a((byte) -58);
                              continue L3;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    var4 = (cf) (Object) var3.a((byte) -126);
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
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
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("se.AB(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    String d(byte param0) {
        ch var2 = null;
        int var3 = 0;
        cf var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(((se) this).field_B);
        var3 = -21 / ((53 - param0) / 57);
        var4 = (cf) (Object) var2.c(-3);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4.d((byte) 112);
            if (var5 == null) {
              var4 = (cf) (Object) var2.a((byte) -46);
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
        if (param2 == 0) {
            if (((se) this).field_h != null) {
                ((se) this).field_h.a(true, param1, -15112, param3, (cf) this);
            }
        }
        if (param0 != -2) {
            field_D = null;
        }
        ch var5 = new ch(((se) this).field_B);
        cf var6 = (cf) (Object) var5.a(32397);
        while (var6 != null) {
            var6.a(-2, param1 - -((se) this).field_i, param2, ((se) this).field_y + param3);
            var6 = (cf) (Object) var5.e(param0 ^ 3);
        }
    }

    private final void f(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((se) this).field_B);
        int var4 = -105 % ((param0 - 36) / 61);
        cf var3 = (cf) (Object) var2.c(-3);
        while (var3 != null) {
            var3.e(-1);
            var3 = (cf) (Object) var2.a((byte) -34);
        }
    }

    final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        Object var8 = null;
        ch var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((se) this).field_B.f(28113)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var9 = new ch(((se) this).field_B);
                if (param0 == -1) {
                  break L1;
                } else {
                  var8 = null;
                  boolean discarded$4 = ((se) this).a((cf) null, 48);
                  break L1;
                }
              }
              var4 = (cf) (Object) var9.a(32397);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.c(125)) {
                      break L3;
                    } else {
                      var5 = new ch(((se) this).field_B);
                      br discarded$5 = var5.b(-4, (br) (Object) var4);
                      var6 = (cf) (Object) var5.e(-3);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param1, 0)) {
                            var6 = (cf) (Object) var5.e(param0 ^ 2);
                            continue L4;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (cf) (Object) var9.e(-3);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("se.IB(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((se) this).a(param1, -81, param3, param2)) {
                ((se) this).a(param2, param3, (byte) 26, param1);
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
            stackOut_5_0 = (StringBuilder) param3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("se.GA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        ch var5 = null;
        RuntimeException var5_ref = null;
        cf var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = new ch(((se) this).field_B);
            var6 = (cf) (Object) var5.c(-3);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param2 < -79) {
                    break L2;
                  } else {
                    field_D = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                StringBuilder discarded$6 = param3.append(10);
                var7 = 0;
                L3: while (true) {
                  if (param1 < var7) {
                    StringBuilder discarded$7 = var6.a(7, param0, 1 + param1, param3);
                    var6 = (cf) (Object) var5.a((byte) -94);
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = param3.append(32);
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
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("se.KB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        ch var5 = null;
        RuntimeException var5_ref = null;
        cf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ch(((se) this).field_B);
            var6 = (cf) (Object) var5.c(-3);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(4)) {
                    break L2;
                  } else {
                    var6.a(-5407, param1, param2 - -((se) this).field_y, param3 + ((se) this).field_i);
                    var6 = (cf) (Object) var5.a((byte) -59);
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
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("se.T(").append(param0).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var9 = -59 / ((48 - param0) / 37);
            var8 = new ch(((se) this).field_B);
            var10 = (cf) (Object) var8.c(-3);
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
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var10 = (cf) (Object) var8.a((byte) -50);
                    continue L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8_ref;
            stackOut_11_1 = new StringBuilder().append("se.DB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param6 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public static void b(boolean param0) {
        field_F = null;
        field_D = null;
    }

    final void b(byte param0, cf param1) {
        try {
            if (param0 <= 38) {
                field_D = null;
            }
            ((se) this).field_B.a((br) (Object) param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "se.EB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int f(byte param0) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        ch var3 = new ch(((se) this).field_B);
        cf var4 = (cf) (Object) var3.c(param0 + -47);
        while (var4 != null) {
            var5 = var4.f((byte) 44);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (cf) (Object) var3.a((byte) -74);
        }
        if (param0 != 44) {
            Object var7 = null;
            this.a((Hashtable) null, 57, 123, (StringBuilder) null);
        }
        return var2;
    }

    final void c(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 32) {
            ((se) this).field_B = null;
        }
        ch var2 = new ch(((se) this).field_B);
        cf var3 = (cf) (Object) var2.c(-3);
        while (var3 != null) {
            var3.c((byte) 32);
            var3 = (cf) (Object) var2.a((byte) -50);
        }
    }

    se(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
        ((se) this).field_B = new th();
    }

    cf g(int param0) {
        ch var2 = null;
        cf var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 >= 88) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        var2 = new ch(((se) this).field_B);
        var3 = (cf) (Object) var2.c(-3);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.c(125)) {
              var3 = (cf) (Object) var2.a((byte) -40);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
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
              var8 = new ch(((se) this).field_B);
              if (param4 == -24) {
                break L1;
              } else {
                field_C = 84;
                break L1;
              }
            }
            var9 = (cf) (Object) var8.c(-3);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(4)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, param2, param3, -24, param5 - -((se) this).field_y, param6 - -((se) this).field_i)) {
                      var9 = (cf) (Object) var8.a((byte) -81);
                      continue L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("se.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(param2 + -29048);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new re();
        field_D = "Return to the Laboratory";
        field_E = 0;
    }
}
