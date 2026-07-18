/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hp extends ga implements jf {
    vo field_x;
    static af field_z;
    static dk field_A;
    static mf field_B;
    static String field_y;
    static li field_E;
    static int field_D;
    static boolean field_C;

    private final void a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        cj var5 = null;
        RuntimeException var5_ref = null;
        ga var6 = null;
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
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1) {
              var5 = new cj(((hp) this).field_x);
              var6 = (ga) (Object) var5.c((byte) -128);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  StringBuilder discarded$12 = param0.append('\n');
                  var7 = 0;
                  L2: while (true) {
                    if (param2 < var7) {
                      StringBuilder discarded$13 = var6.a(param3, param0, param1, 1 + param2);
                      var6 = (ga) (Object) var5.a((byte) 61);
                      continue L1;
                    } else {
                      StringBuilder discarded$14 = param0.append(' ');
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("hp.KB(");
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    void c(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != 57) {
            return;
        }
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -115);
        while (var3 != null) {
            var3.c((byte) 57);
            var3 = (ga) (Object) var2.a((byte) 61);
        }
    }

    final boolean b(byte param0, ga param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ga var5 = null;
        cj var6 = null;
        ga var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (!((hp) this).field_x.a((byte) -123)) {
              var4 = 2 / ((66 - param0) / 53);
              var3 = new cj(((hp) this).field_x);
              var5 = (ga) (Object) var3.b((byte) -21);
              L1: while (true) {
                if (var5 == null) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (var5.e(-17741)) {
                      var6 = new cj(((hp) this).field_x);
                      le discarded$2 = var6.a((le) (Object) var5, (byte) -128);
                      var7 = (ga) (Object) var6.a(17);
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (!var7.a((byte) 90, param1)) {
                            var7 = (ga) (Object) var6.a(17);
                            continue L3;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            return stackIn_12_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5 = (ga) (Object) var3.a(17);
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
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("hp.HB(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        cj var8 = null;
        RuntimeException var8_ref = null;
        ga var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            var8 = new cj(((hp) this).field_x);
            var9 = (ga) (Object) var8.c((byte) -127);
            if (param1 == 1) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.a((byte) 73)) {
                      break L2;
                    } else {
                      if (var9.a(param0, 1, ((hp) this).field_j + param2, param3, ((hp) this).field_k + param4, param5, param6)) {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        var9 = (ga) (Object) var8.a((byte) 61);
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8_ref;
            stackOut_13_1 = new StringBuilder().append("hp.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
        cj var9 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_13_0 = false;
        boolean stackOut_12_0 = false;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var9 = new cj(((hp) this).field_x);
            var6 = 65 % ((param0 - -83) / 32);
            var7 = (ga) (Object) var9.c((byte) -118);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.a((byte) 73)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var7.e(-17741)) {
                        break L3;
                      } else {
                        if (var7.a(43, param1, param2, param3)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var7 = (ga) (Object) var9.a((byte) 61);
                    continue L1;
                  }
                }
              }
              var6 = param1;
              if (var6 != 80) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L4: {
                  if (!bo.field_p[81]) {
                    stackOut_13_0 = ((hp) this).a(1, param2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = ((hp) this).b((byte) 119, param2);
                    stackIn_14_0 = stackOut_12_0;
                    break L4;
                  }
                }
                return stackIn_14_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("hp.I(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_16_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (param1 == 0) {
            if (((hp) this).field_h != null) {
                ((hp) this).field_h.a(param3 + 16777215, true, param0, (ga) this, param2);
            }
        }
        cj var9 = new cj(((hp) this).field_x);
        if (param3 != 0) {
            Object var8 = null;
            boolean discarded$0 = ((hp) this).a(108, 83, -6, 30, 111, -93, (ga) null);
        }
        ga var6 = (ga) (Object) var9.b((byte) -21);
        while (var6 != null) {
            var6.a(param0 + ((hp) this).field_j, param1, param2 + ((hp) this).field_k, param3);
            var6 = (ga) (Object) var9.a(17);
        }
    }

    String d(int param0) {
        String var4_ref_String = null;
        int var5 = ZombieDawn.field_J;
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -123);
        while (var3 != null) {
            var4_ref_String = var3.d(100);
            if (var4_ref_String != null) {
                return var4_ref_String;
            }
            var3 = (ga) (Object) var2.a((byte) 61);
        }
        int var4 = -5;
        return null;
    }

    final boolean a(int param0, ga param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        ga var4 = null;
        cj var5 = null;
        ga var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (!((hp) this).field_x.a((byte) -121)) {
              L1: {
                var3 = new cj(((hp) this).field_x);
                var4 = (ga) (Object) var3.c((byte) -118);
                if (param0 == 1) {
                  break L1;
                } else {
                  field_y = null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 == null) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L3: {
                    if (var4.e(-17741)) {
                      var5 = new cj(((hp) this).field_x);
                      le discarded$2 = var5.a(-3549, (le) (Object) var4);
                      var6 = (ga) (Object) var5.a((byte) 61);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a((byte) 96, param1)) {
                            var6 = (ga) (Object) var5.a((byte) 61);
                            continue L4;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ga) (Object) var3.a((byte) 61);
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
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("hp.FB(").append(param0).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        cj var8 = null;
        RuntimeException var8_ref = null;
        ga var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            var8 = new cj(((hp) this).field_x);
            var9 = (ga) (Object) var8.c((byte) -122);
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a((byte) 73)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.e(-17741)) {
                        break L3;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (ga) (Object) var8.a((byte) 61);
                    continue L1;
                  }
                }
              }
              if (param5) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8_ref;
            stackOut_15_1 = new StringBuilder().append("hp.OA(");
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
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
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
        Object stackOut_3_0 = null;
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
              if (!((hp) this).a(param0, param1, 11098, param3)) {
                break L1;
              } else {
                ((hp) this).a(param0, param3, 69, param1);
                this.a(param1, param2, param3, param0);
                break L1;
              }
            }
            if (param2) {
              stackOut_5_0 = (StringBuilder) param1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (StringBuilder) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hp.NA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(ga param0, byte param1, int param2, int param3) {
        cj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ga var7 = null;
        int var8 = 0;
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
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            super.a(param0, (byte) -116, param2, param3);
            var5 = new cj(((hp) this).field_x);
            var6 = -6 % ((param1 - 46) / 42);
            var7 = (ga) (Object) var5.c((byte) -128);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.a((byte) 73)) {
                    break L2;
                  } else {
                    var7.a(param0, (byte) -75, param2 + ((hp) this).field_j, param3 - -((hp) this).field_k);
                    var7 = (ga) (Object) var5.a((byte) 61);
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
            stackOut_6_1 = new StringBuilder().append("hp.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ga d(byte param0) {
        cj var2 = null;
        ga var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          var2 = new cj(((hp) this).field_x);
          if (param0 == 35) {
            break L0;
          } else {
            ((hp) this).field_x = null;
            break L0;
          }
        }
        var3 = (ga) (Object) var2.c((byte) -126);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e(-17741)) {
              var3 = (ga) (Object) var2.a((byte) 61);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 38 / ((param0 - -23) / 48);
        super.a(85, param1, param2, param3, param4);
        int discarded$0 = -115;
        this.g();
    }

    public static void f(int param0) {
        field_B = null;
        if (param0 < 82) {
            hp.f(-94);
        }
        field_y = null;
        field_A = null;
        field_z = null;
        field_E = null;
    }

    boolean a(byte param0, ga param1) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        ga var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var3 = new cj(((hp) this).field_x);
            if (param0 >= 67) {
              var4 = (ga) (Object) var3.c((byte) -126);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (var4.a((byte) 100, param1)) {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var4 = (ga) (Object) var3.a((byte) 61);
                    continue L1;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("hp.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        cj var7 = null;
        RuntimeException var7_ref = null;
        ga var8 = null;
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
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            var7 = new cj(((hp) this).field_x);
            var8 = (ga) (Object) var7.c((byte) -121);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a((byte) 73)) {
                    break L2;
                  } else {
                    var8.a(((hp) this).field_k + param0, 21, param2, param3, ((hp) this).field_j + param4, param5);
                    var8 = (ga) (Object) var7.a((byte) 61);
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 >= 1) {
                  break L3;
                } else {
                  ((hp) this).field_x = null;
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
            stackOut_8_1 = new StringBuilder().append("hp.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = param0;
        cj var3 = new cj(((hp) this).field_x);
        ga var4 = (ga) (Object) var3.c((byte) -119);
        while (var4 != null) {
            var5 = var4.c(param0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (ga) (Object) var3.a((byte) 61);
        }
        return var2;
    }

    boolean e(int param0) {
        return null != ((hp) this).d((byte) 35);
    }

    final void a(ga param0, int param1) {
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
              ((hp) this).field_x.a(0, (le) (Object) param0);
              if (param1 == 10) {
                break L1;
              } else {
                int discarded$2 = ((hp) this).c(30);
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
            stackOut_3_1 = new StringBuilder().append("hp.JB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void g() {
        int var4 = ZombieDawn.field_J;
        cj var2 = new cj(((hp) this).field_x);
        ga var3 = (ga) (Object) var2.c((byte) -122);
        while (var3 != null) {
            var3.a(true);
            var3 = (ga) (Object) var2.a((byte) 61);
        }
    }

    hp(int param0, int param1, int param2, int param3, io param4) {
        super(param0, param1, param2, param3, param4, (sk) null);
        ((hp) this).field_x = new vo();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new af();
        field_y = "Time remaining: ";
        field_C = false;
        field_D = 0;
    }
}
