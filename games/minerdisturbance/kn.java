/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kn extends fe implements rk {
    static String[][] field_D;
    static int field_E;
    static ln[] field_F;
    static ql[][] field_H;
    ta field_G;

    boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        fe var8 = null;
        hh var9 = null;
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
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var9 = new hh(((kn) this).field_G);
            var8 = (fe) (Object) var9.d(param2 + -19785);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.c(123)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.k(param2 + -5)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, param1, (byte) -79, param3)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var8 = (fe) (Object) var9.a(12537);
                    continue L1;
                  }
                }
              }
              L4: {
                if (param2 == -79) {
                  break L4;
                } else {
                  ((kn) this).field_G = null;
                  break L4;
                }
              }
              var6 = param3;
              if (var6 != 80) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L5: {
                  if (qd.field_O[81]) {
                    stackOut_14_0 = ((kn) this).b(param1, param2 ^ -79);
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = ((kn) this).a(param1, (byte) 12);
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
            stackOut_18_1 = new StringBuilder().append("kn.K(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final static String a(int param0) {
        return pm.field_b;
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (param3 == 0) {
            if (null != ((kn) this).field_A) {
                ((kn) this).field_A.a(param0 + 12084, param1, (fe) this, param2, true);
            }
        }
        hh var9 = new hh(((kn) this).field_G);
        if (param0 != 4) {
            Object var8 = null;
            boolean discarded$0 = ((kn) this).a(53, -89, 49, -8, (byte) -101, (fe) null, 25);
        }
        fe var6 = (fe) (Object) var9.a(true);
        while (var6 != null) {
            var6.a((byte) 4, ((kn) this).field_u + param1, ((kn) this).field_t + param2, param3);
            var6 = (fe) (Object) var9.c(-119);
        }
    }

    final String h(int param0) {
        hh var2 = null;
        fe var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        var2 = new hh(((kn) this).field_G);
        if (param0 == -27867) {
          var3 = (fe) (Object) var2.d(-19864);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.h(-27867);
              if (var4 == null) {
                var3 = (fe) (Object) var2.a(12537);
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        hh var7 = null;
        RuntimeException var7_ref = null;
        fe var8 = null;
        int var9 = 0;
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
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            var7 = new hh(((kn) this).field_G);
            var8 = (fe) (Object) var7.d(-19864);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.c(param5 + 127)) {
                    break L2;
                  } else {
                    var8.a(param0 + ((kn) this).field_u, param1, param2, param3 - -((kn) this).field_t, param4, param5);
                    var8 = (fe) (Object) var7.a(12537);
                    continue L1;
                  }
                }
              }
              L3: {
                if (param5 == 0) {
                  break L3;
                } else {
                  field_D = null;
                  break L3;
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
            stackOut_8_1 = new StringBuilder().append("kn.LA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
    }

    final boolean a(fe param0, byte param1) {
        hh var3 = null;
        RuntimeException var3_ref = null;
        fe var4 = null;
        hh var5 = null;
        fe var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!((kn) this).field_G.e((byte) 108)) {
              L1: {
                var3 = new hh(((kn) this).field_G);
                if (param1 == 12) {
                  break L1;
                } else {
                  field_F = null;
                  break L1;
                }
              }
              var4 = (fe) (Object) var3.d(-19864);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.k(45)) {
                      break L3;
                    } else {
                      var5 = new hh(((kn) this).field_G);
                      pi discarded$2 = var5.a((pi) (Object) var4, (byte) 92);
                      var6 = (fe) (Object) var5.a(12537);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, 121)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var6 = (fe) (Object) var5.a(param1 + 12525);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (fe) (Object) var3.a(12537);
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
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("kn.VB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(fe param0, int param1) {
        hh var3 = null;
        RuntimeException var3_ref = null;
        fe var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var3 = new hh(((kn) this).field_G);
            if (param1 >= 119) {
              var4 = (fe) (Object) var3.d(-19864);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (!var4.a(param0, 126)) {
                    var4 = (fe) (Object) var3.a(12537);
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("kn.UA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    void a(int param0, int param1, byte param2, fe param3) {
        hh var5 = null;
        RuntimeException var5_ref = null;
        fe var6 = null;
        int var7 = 0;
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
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            super.a(param0, param1, (byte) 110, param3);
            if (param2 > 49) {
              var5 = new hh(((kn) this).field_G);
              var6 = (fe) (Object) var5.d(-19864);
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.c(123)) {
                      break L2;
                    } else {
                      var6.a(((kn) this).field_t + param0, ((kn) this).field_u + param1, (byte) 90, param3);
                      var6 = (fe) (Object) var5.a(12537);
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("kn.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private final void b(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        fe var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        hh var10 = null;
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
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var10 = new hh(((kn) this).field_G);
              if (param0 == -84) {
                break L1;
              } else {
                var9 = null;
                String discarded$14 = kn.a((String) null, (byte) -102, (java.applet.Applet) null);
                break L1;
              }
            }
            var6 = (fe) (Object) var10.d(-19864);
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$15 = param3.append(10);
                var7 = 0;
                L3: while (true) {
                  if (var7 > param2) {
                    StringBuilder discarded$16 = var6.a((byte) -70, param1, 1 + param2, param3);
                    var6 = (fe) (Object) var10.a(12537);
                    continue L2;
                  } else {
                    StringBuilder discarded$17 = param3.append(32);
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
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("kn.PB(").append(param0).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
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
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static void a(id param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        id var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (null == param0.field_e) {
              return;
            } else {
              L1: {
                L2: {
                  if (-1 != param0.field_f) {
                    break L2;
                  } else {
                    if (-1 != param0.field_d) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= sb.field_p) {
                    break L1;
                  } else {
                    L4: {
                      var3 = im.field_a[var2_int];
                      if (var3.field_g != 2) {
                        break L4;
                      } else {
                        if (param0.field_f != var3.field_f) {
                          break L4;
                        } else {
                          if (param0.field_d != var3.field_d) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null != param0.field_a) {
                  break L5;
                } else {
                  break L5;
                }
              }
              kh.a(param0, 14288);
              var2_int = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("kn.WB(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -51 + 41);
        }
    }

    final int b(byte param0) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        int var2 = 0;
        hh var3 = new hh(((kn) this).field_G);
        if (param0 > -88) {
            field_E = -9;
        }
        fe var4 = (fe) (Object) var3.d(-19864);
        while (var4 != null) {
            var5 = var4.b((byte) -120);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (fe) (Object) var3.a(12537);
        }
        return var2;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        hh var8 = null;
        RuntimeException var8_ref = null;
        fe var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            var8 = new hh(((kn) this).field_G);
            var9 = (fe) (Object) var8.d(-19864);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(126)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.k(35)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, (byte) -100, param5, param6)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (fe) (Object) var8.a(12537);
                    continue L1;
                  }
                }
              }
              if (param4 <= -53) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                ((kn) this).field_G = null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8_ref;
            stackOut_13_1 = new StringBuilder().append("kn.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param6 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void g(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(((kn) this).field_G);
        if (param0 != 4966) {
            Object var5 = null;
            StringBuilder discarded$0 = ((kn) this).a((byte) 55, (Hashtable) null, -74, (StringBuilder) null);
        }
        fe var3 = (fe) (Object) var2.d(-19864);
        while (var3 != null) {
            var3.g(4966);
            var3 = (fe) (Object) var2.a(12537);
        }
    }

    kn(int param0, int param1, int param2, int param3, ad param4) {
        super(param0, param1, param2, param3, param4, (rm) null);
        ((kn) this).field_G = new ta();
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 13569) {
            return;
        }
        try {
            tk.a("", param1, (byte) -3);
            ne.a(param1, 30433);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "kn.SB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        hh var8 = null;
        RuntimeException var8_ref = null;
        fe var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            var8 = new hh(((kn) this).field_G);
            var9 = (fe) (Object) var8.d(-19864);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(param2 + 124)) {
                    break L2;
                  } else {
                    if (!var9.a(param0, param1 - -((kn) this).field_t, 0, param3, param4, param5, ((kn) this).field_u + param6)) {
                      var9 = (fe) (Object) var8.a(12537);
                      continue L1;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
              }
              if (param2 == 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                field_D = null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("kn.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
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
            String stackOut_8_0 = null;
            Object stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = MinerDisturbance.field_ab;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) lk.a((byte) 18, "getcookies", param2);
                            var4 = h.a(';', true, var3);
                            if (param1 == 114) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_D = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = null;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return (String) (Object) stackIn_14_0;
                    }
                    case 15: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_15_0 = (RuntimeException) var3_ref2;
                        stackOut_15_1 = new StringBuilder().append("kn.NB(");
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param0 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param2 == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 >= -33) {
            Object var7 = null;
            boolean discarded$0 = ((kn) this).a(62, -126, -100, 75, (byte) -107, (fe) null, 81);
        }
        super.a(param0, -49, param2, param3, param4);
        this.c((byte) -48);
    }

    final boolean b(fe param0, int param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        hh var5 = null;
        fe var6 = null;
        int var7 = 0;
        Object var8 = null;
        hh var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!((kn) this).field_G.e((byte) 125)) {
              var9 = new hh(((kn) this).field_G);
              var4 = (fe) (Object) var9.a(true);
              L1: while (true) {
                if (var4 == null) {
                  if (param1 == 0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    var8 = null;
                    boolean discarded$4 = ((kn) this).a((fe) null, -17);
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.k(-118)) {
                      break L2;
                    } else {
                      var5 = new hh(((kn) this).field_G);
                      pi discarded$5 = var5.a(false, (pi) (Object) var4);
                      var6 = (fe) (Object) var5.c(-126);
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param0, 122)) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            return stackIn_12_0 != 0;
                          } else {
                            var6 = (fe) (Object) var5.c(-120);
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4 = (fe) (Object) var9.c(param1 ^ -122);
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("kn.OB(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    public static void d(byte param0) {
        field_H = null;
        field_F = null;
        field_D = null;
    }

    fe m(int param0) {
        hh var2 = null;
        fe var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = new hh(((kn) this).field_G);
          if (param0 > 107) {
            break L0;
          } else {
            var5 = null;
            StringBuilder discarded$2 = ((kn) this).a((byte) 113, (Hashtable) null, 33, (StringBuilder) null);
            break L0;
          }
        }
        var3 = (fe) (Object) var2.d(-19864);
        L1: while (true) {
          if (var3 != null) {
            if (var3.k(-98)) {
              return var3;
            } else {
              var3 = (fe) (Object) var2.a(12537);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
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
              if (!((kn) this).a(param3, true, param2, param1)) {
                break L1;
              } else {
                ((kn) this).a(param1, param3, 34, param2);
                this.b((byte) -84, param1, param2, param3);
                break L1;
              }
            }
            L2: {
              if (param0 == -70) {
                break L2;
              } else {
                ((kn) this).a(28, -25, -97, -63, -17);
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
            stackOut_6_1 = new StringBuilder().append("kn.SA(").append(param0).append(44);
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
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0;
    }

    final boolean k(int param0) {
        int var2 = 65 % ((-33 - param0) / 45);
        return null != ((kn) this).m(127) ? true : false;
    }

    private final void c(byte param0) {
        int var5 = MinerDisturbance.field_ab;
        hh var2 = new hh(((kn) this).field_G);
        fe var3 = (fe) (Object) var2.d(-19864);
        int var4 = -72;
        while (var3 != null) {
            var3.i(-5257);
            var3 = (fe) (Object) var2.a(12537);
        }
    }

    final void a(int param0, fe param1) {
        if (param0 != -1) {
            return;
        }
        try {
            ((kn) this).field_G.a((byte) -126, (pi) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "kn.TB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ql[2][];
        field_D = new String[][]{new String[1]};
    }
}
