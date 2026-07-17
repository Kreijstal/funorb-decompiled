/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class tj extends kb implements gw {
    static na field_C;
    at field_D;

    final int g(int param0) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        bb var3 = new bb(((tj) this).field_D);
        if (param0 != -31989) {
            boolean discarded$0 = ((tj) this).a(false);
        }
        kb var4 = (kb) (Object) var3.c(param0 ^ -31943);
        while (var4 != null) {
            var5 = var4.g(-31989);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (kb) (Object) var3.b(50);
        }
        return var2;
    }

    final boolean b(byte param0, kb param1) {
        bb var3 = null;
        RuntimeException var3_ref = null;
        kb var4 = null;
        bb var5 = null;
        kb var6 = null;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!((tj) this).field_D.a(false)) {
              L1: {
                var3 = new bb(((tj) this).field_D);
                if (param0 < -121) {
                  break L1;
                } else {
                  tj.d((byte) 127);
                  break L1;
                }
              }
              var4 = (kb) (Object) var3.c(50);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (var4.a(false)) {
                      var5 = new bb(((tj) this).field_D);
                      tc discarded$2 = var5.a((tc) (Object) var4, true);
                      var6 = (kb) (Object) var5.b(50);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(11, param1)) {
                            var6 = (kb) (Object) var5.b(50);
                            continue L4;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (kb) (Object) var3.b(50);
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
            stackOut_19_1 = new StringBuilder().append("tj.BC(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    void f(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        if (param0 != 1) {
            field_C = null;
        }
        kb var3 = (kb) (Object) var2.c(50);
        while (var3 != null) {
            var3.f(param0);
            var3 = (kb) (Object) var2.b(50);
        }
    }

    kb e(byte param0) {
        bb var2 = null;
        kb var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new bb(((tj) this).field_D);
          if (param0 >= 24) {
            break L0;
          } else {
            ((tj) this).field_D = null;
            break L0;
          }
        }
        var3 = (kb) (Object) var2.c(50);
        L1: while (true) {
          if (var3 != null) {
            if (var3.a(false)) {
              return var3;
            } else {
              var3 = (kb) (Object) var2.b(50);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, kb param1) {
        bb var3 = null;
        RuntimeException var3_ref = null;
        kb var4 = null;
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
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = new bb(((tj) this).field_D);
            if (param0 == 11) {
              var4 = (kb) (Object) var3.c(param0 + 39);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (!var4.a(param0, param1)) {
                    var4 = (kb) (Object) var3.b(param0 + 39);
                    continue L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("tj.M(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final boolean a(boolean param0, kb param1) {
        RuntimeException var3 = null;
        kb var4 = null;
        bb var5 = null;
        kb var6 = null;
        int var7 = 0;
        Object var8 = null;
        bb var9 = null;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$4 = ((tj) this).a((kb) null, 21, '￘', -49);
                break L1;
              }
            }
            if (!((tj) this).field_D.a(param0)) {
              var9 = new bb(((tj) this).field_D);
              var4 = (kb) (Object) var9.a(50);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.a(false)) {
                      break L3;
                    } else {
                      var5 = new bb(((tj) this).field_D);
                      tc discarded$5 = var5.a(false, (tc) (Object) var4);
                      var6 = (kb) (Object) var5.b((byte) -112);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(11, param1)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            return stackIn_14_0 != 0;
                          } else {
                            var6 = (kb) (Object) var5.b((byte) -112);
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (kb) (Object) var9.b((byte) -112);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("tj.WB(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        bb var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = new bb(((tj) this).field_D);
            var9 = (kb) (Object) var8.c(50);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(65280)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.a(false)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, 94, param6)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var9 = (kb) (Object) var8.b(50);
                    continue L1;
                  }
                }
              }
              if (param5 > 93) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                int discarded$2 = ((tj) this).g(116);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8_ref;
            stackOut_13_1 = new StringBuilder().append("tj.RA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param6 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(byte param0, kb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((tj) this).field_D.a((byte) -119, (tc) (Object) param1);
              if (param0 == 10) {
                break L1;
              } else {
                ((tj) this).f(-101);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tj.CC(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    String h(int param0) {
        String var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        kb var3 = (kb) (Object) var2.c(param0 ^ 21434);
        while (var3 != null) {
            var4 = var3.h(21384);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (kb) (Object) var2.b(50);
        }
        if (param0 == 21384) {
            return null;
        }
        ((tj) this).field_D = null;
        return null;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        bb var8 = null;
        RuntimeException var8_ref = null;
        kb var9 = null;
        int var10 = 0;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = new bb(((tj) this).field_D);
            var9 = (kb) (Object) var8.c(50);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(65280)) {
                    break L2;
                  } else {
                    if (var9.a(param0, ((tj) this).field_B + param1, ((tj) this).field_p + param2, 107, param4, param5, param6)) {
                      stackOut_6_0 = 1;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      var9 = (kb) (Object) var8.b(50);
                      continue L1;
                    }
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
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8_ref;
            stackOut_11_1 = new StringBuilder().append("tj.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(107).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    boolean a(boolean param0) {
        if (param0) {
            ((tj) this).field_D = null;
        }
        return null != ((tj) this).e((byte) 94) ? true : false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
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
        Object stackOut_1_0 = null;
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
            if (param2 == 26477) {
              L1: {
                if (!((tj) this).a(param3, param0, (byte) 96, param1)) {
                  break L1;
                } else {
                  ((tj) this).a(param0, param3, true, param1);
                  this.a(param3, 81, param1, param0);
                  break L1;
                }
              }
              stackOut_5_0 = (StringBuilder) param1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("tj.OA(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        if (param3 != 8192) {
            field_C = null;
        }
        this.i(0);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        bb var5 = null;
        RuntimeException var5_ref = null;
        kb var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5 = new bb(((tj) this).field_D);
            var6 = (kb) (Object) var5.c(50);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param2.append(10);
                var7 = 0;
                L2: while (true) {
                  if (param3 < var7) {
                    StringBuilder discarded$13 = var6.a(1 + param3, param2, 26477, param0);
                    var6 = (kb) (Object) var5.b(50);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = param2.append(32);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("tj.UB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(81).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        bb var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        kb var9 = null;
        int var10 = 0;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = new bb(((tj) this).field_D);
            var8 = -73 / ((-58 - param3) / 53);
            var9 = (kb) (Object) var7.c(50);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.c(65280)) {
                    break L2;
                  } else {
                    var9.a(((tj) this).field_p + param0, param1, param2, (byte) -112, param4, param5 - -((tj) this).field_B);
                    var9 = (kb) (Object) var7.b(50);
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
            var7_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7_ref;
            stackOut_6_1 = new StringBuilder().append("tj.JA(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        kb var8 = null;
        bb var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_13_0 = false;
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
        boolean stackOut_12_0 = false;
        boolean stackOut_11_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var9 = new bb(((tj) this).field_D);
            var8 = (kb) (Object) var9.c(50);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.c(65280)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.a(false)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, param1, param2, -12215)) {
                          break L3;
                        } else {
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        }
                      }
                    }
                    var8 = (kb) (Object) var9.b(50);
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (var6 != 80) {
                if (param3 == -12215) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  ((tj) this).field_D = null;
                  return false;
                }
              } else {
                L4: {
                  if (!br.field_f[81]) {
                    stackOut_12_0 = ((tj) this).b((byte) -123, param0);
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    stackOut_11_0 = ((tj) this).a(false, param0);
                    stackIn_13_0 = stackOut_11_0;
                    break L4;
                  }
                }
                return stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("tj.F(");
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
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_17_0 != 0;
    }

    void a(int param0, int param1, int param2, kb param3) {
        bb var5 = null;
        RuntimeException var5_ref = null;
        kb var6 = null;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new bb(((tj) this).field_D);
            var6 = (kb) (Object) var5.c(50);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.c(param0 + 32558)) {
                    break L2;
                  } else {
                    var6.a(32722, ((tj) this).field_B + param1, param2 - -((tj) this).field_p, param3);
                    var6 = (kb) (Object) var5.b(50);
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
            stackOut_6_1 = new StringBuilder().append("tj.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void i(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        kb var3 = (kb) (Object) var2.c(50);
        if (param0 != 0) {
            return;
        }
        while (var3 != null) {
            var3.e(0);
            var3 = (kb) (Object) var2.b(50);
        }
    }

    tj(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
        ((tj) this).field_D = new at();
    }

    public static void d(byte param0) {
        if (param0 != -89) {
            tj.j(114);
        }
        field_C = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == param3) {
            if (!(null == ((tj) this).field_k)) {
                ((tj) this).field_k.a((kb) this, param0, -94, true, param1);
            }
        }
        bb var5 = new bb(((tj) this).field_D);
        kb var6 = (kb) (Object) var5.a(50);
        while (var6 != null) {
            var6.a(param0 + ((tj) this).field_B, ((tj) this).field_p + param1, (byte) -101, param3);
            var6 = (kb) (Object) var5.b((byte) -112);
        }
        if (param2 >= -82) {
            this.i(108);
        }
    }

    final static void j(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ai.field_T != null) {
                    ai.field_T.c(-5758);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ou.field_h != null) {
                    ou.field_h.a((byte) -117);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == rg.field_b) {
                    break L3;
                  } else {
                    {
                      L4: {
                        rg.field_b.c((byte) 81);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  var1_int = -99 % ((param0 - -48) / 58);
                  if (null == mu.field_b) {
                    break L6;
                  } else {
                    var2 = 0;
                    L7: while (true) {
                      if (var2 >= mu.field_b.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null == mu.field_b[var2]) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var2++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ig.a((Throwable) (Object) var1, "tj.AC(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
