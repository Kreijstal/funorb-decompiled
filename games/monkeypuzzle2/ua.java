/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ua extends we implements ga {
    static int[] field_w;
    static String field_y;
    pj field_u;
    static pj field_v;
    static sj[] field_x;

    final void e(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        we var3 = (we) (Object) var2.a((byte) -37);
        if (param0 != 13104) {
            ((ua) this).e(53);
        }
        while (var3 != null) {
            var3.e(13104);
            var3 = (we) (Object) var2.a(true);
        }
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = param0;
        ck var3 = new ck(((ua) this).field_u);
        we var4 = (we) (Object) var3.a((byte) -37);
        while (var4 != null) {
            var5 = var4.f(0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (we) (Object) var3.a(true);
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        we var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        ck stackIn_11_0 = null;
        ck stackIn_12_0 = null;
        ck stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        ck stackOut_10_0 = null;
        ck stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ck stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new ck(((ua) this).field_u);
            if (!param1) {
              var4 = (we) (Object) var3.a((byte) -37);
              L1: while (true) {
                if (var4 == null) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  if (var4.a(param0, false)) {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    L2: {
                      stackOut_10_0 = (ck) var3;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (param1) {
                        stackOut_12_0 = (ck) (Object) stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L2;
                      } else {
                        stackOut_11_0 = (ck) (Object) stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L2;
                      }
                    }
                    var4 = (we) (Object) ((ck) (Object) stackIn_13_0).a(stackIn_13_1 != 0);
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ua.AA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c((byte) 96);
    }

    final void b(byte param0, we param1) {
        if (param0 >= -17) {
            return;
        }
        try {
            ((ua) this).field_u.a(-8212, (ug) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ua.SB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        ck var5 = null;
        RuntimeException var5_ref = null;
        we var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -103);
              var5 = new ck(((ua) this).field_u);
              var6 = (we) (Object) var5.a((byte) -37);
              if (param3 < -13) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.d(-3548)) {
                    break L3;
                  } else {
                    var6.a(param0, param1 + ((ua) this).field_e, param2 + ((ua) this).field_r, (byte) -64);
                    var6 = (we) (Object) var5.a(true);
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
            var5_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5_ref;
            stackOut_7_1 = new StringBuilder().append("ua.E(");
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void i(int param0) {
        if (hl.field_d != null) {
            if (!hl.field_d.h()) {
                return;
            }
        }
        hl.field_d = li.a(ke.field_h[6], 100, 96);
        na.a((byte) 35, hl.field_d);
    }

    private final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        ck var5 = null;
        RuntimeException var5_ref = null;
        we var6 = null;
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new ck(((ua) this).field_u);
            var6 = (we) (Object) var5.a((byte) -37);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$6 = param2.append(10);
                var7 = 0;
                L2: while (true) {
                  if (var7 > param1) {
                    StringBuilder discarded$7 = var6.a(false, param2, param0, 1 + param1);
                    var6 = (we) (Object) var5.a(true);
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = param2.append(32);
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
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("ua.WB(");
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 13467 + 41);
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        ck var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        we var7 = null;
        int var8 = 0;
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new ck(((ua) this).field_u);
            var6 = -77 % ((param3 - 37) / 50);
            var7 = (we) (Object) var5.a((byte) -37);
            L1: while (true) {
              L2: {
                if (var7 == null) {
                  break L2;
                } else {
                  if (!var7.d(-3548)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var7.b((byte) 103)) {
                        break L3;
                      } else {
                        if (var7.a(param0, param1, param2, 124)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var7 = (we) (Object) var5.a(true);
                    continue L1;
                  }
                }
              }
              var6 = param2;
              if (80 != var6) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L4: {
                  if (!dl.field_c[81]) {
                    stackOut_13_0 = ((ua) this).b(param0, false);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = ((ua) this).a((byte) 119, param0);
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
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref;
            stackOut_17_1 = new StringBuilder().append("ua.V(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_16_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 0) {
            if (((ua) this).field_h != null) {
                ((ua) this).field_h.a(true, (we) this, param2, param3, 69);
            }
        }
        ck var5 = new ck(((ua) this).field_u);
        we var6 = (we) (Object) var5.b((byte) -102);
        while (var6 != null) {
            var6.a(param0, param1, ((ua) this).field_e + param2, param3 + ((ua) this).field_r);
            var6 = (we) (Object) var5.a(param0 + -3733);
        }
        if (param0 != 30) {
            boolean discarded$0 = ((ua) this).b((byte) 23);
        }
    }

    public static void j(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            return;
        }
        field_x = null;
    }

    final String a(byte param0) {
        String var4 = null;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        we var3 = (we) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var4 = var3.a((byte) 54);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (we) (Object) var2.a(true);
        }
        if (param0 == 54) {
            return null;
        }
        ((ua) this).a(89, -46, 124, -95);
        return null;
    }

    private final void c(byte param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((ua) this).field_u);
        we var3 = (we) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var3.g(-1);
            var3 = (we) (Object) var2.a(true);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        we var9 = null;
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
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ck(((ua) this).field_u);
              if (param3 == -1625) {
                break L1;
              } else {
                ua.j(-119);
                break L1;
              }
            }
            var9 = (we) (Object) var8.a((byte) -37);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.d(-3548)) {
                    break L3;
                  } else {
                    if (!var9.a(param0 - -((ua) this).field_e, param1, param2, -1625, param4, param5, param6 + ((ua) this).field_r)) {
                      var9 = (we) (Object) var8.a(true);
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
            stackOut_12_1 = new StringBuilder().append("ua.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ck var7 = null;
        RuntimeException var7_ref = null;
        we var8 = null;
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
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new ck(((ua) this).field_u);
            var8 = (we) (Object) var7.a((byte) -37);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.d(-3548)) {
                    break L2;
                  } else {
                    var8.a(((ua) this).field_e + param0, param1, param2, param3, 0, param5 + ((ua) this).field_r);
                    var8 = (we) (Object) var7.a(true);
                    continue L1;
                  }
                }
              }
              L3: {
                if (param4 == 0) {
                  break L3;
                } else {
                  var10 = null;
                  ((ua) this).a(122, 7, (we) null, -60, 25, -69);
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
            stackOut_8_1 = new StringBuilder().append("ua.I(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            String discarded$0 = ((ua) this).a((byte) 92);
        }
        return null != ((ua) this).a(true) ? true : false;
    }

    we a(boolean param0) {
        ck var2 = null;
        we var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = new ck(((ua) this).field_u);
          if (param0) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ((ua) this).a((byte) -39, (we) null);
            break L0;
          }
        }
        var3 = (we) (Object) var2.a((byte) -37);
        L1: while (true) {
          if (var3 != null) {
            if (var3.b((byte) 40)) {
              return var3;
            } else {
              var3 = (we) (Object) var2.a(param0);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        we var9 = null;
        int var10 = 0;
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
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 < -109) {
              var8 = new ck(((ua) this).field_u);
              var9 = (we) (Object) var8.a((byte) -37);
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.d(-3548)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.b((byte) 87)) {
                          break L3;
                        } else {
                          if (var9.a(param0, param1, param2, param3, param4, param5, -119)) {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0 != 0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (we) (Object) var8.a(true);
                      continue L1;
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
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
            stackOut_15_1 = new StringBuilder().append("ua.F(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw la.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final boolean b(we param0, boolean param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        we var4 = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              if (((ua) this).field_u.e(11253)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3 = new ck(((ua) this).field_u);
                var4 = (we) (Object) var3.a((byte) -37);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b((byte) 122)) {
                        break L2;
                      } else {
                        var5 = new ck(((ua) this).field_u);
                        ug discarded$2 = var5.a((byte) -127, (ug) (Object) var4);
                        var6 = (we) (Object) var5.a(true);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, false)) {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0 != 0;
                            } else {
                              var6 = (we) (Object) var5.a(true);
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (we) (Object) var3.a(true);
                    continue L1;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("ua.TB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
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
          throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
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
              if (((ua) this).a(param2, (byte) -127, param3, param1)) {
                ((ua) this).a(param2, param3, param1, -113);
                this.b(param2, param3, param1, 13467);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((ua) this).a(118, 103, -77, 34, 51);
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) param1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ua.T(").append(param0).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    ua(int param0, int param1, int param2, int param3, ml param4) {
        super(param0, param1, param2, param3, param4, (of) null);
        ((ua) this).field_u = new pj();
    }

    final boolean a(byte param0, we param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        we var4 = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (((ua) this).field_u.e(11253)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3 = new ck(((ua) this).field_u);
              if (param0 > 54) {
                var4 = (we) (Object) var3.b((byte) -96);
                L1: while (true) {
                  if (var4 == null) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b((byte) 116)) {
                        break L2;
                      } else {
                        var5 = new ck(((ua) this).field_u);
                        ug discarded$2 = var5.a(-11121, (ug) (Object) var4);
                        var6 = (we) (Object) var5.a(-3703);
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param1, false)) {
                              var6 = (we) (Object) var5.a(-3703);
                              continue L3;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_15_0 = stackOut_14_0;
                              return stackIn_15_0 != 0;
                            }
                          }
                        }
                      }
                    }
                    var4 = (we) (Object) var3.a(-3703);
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("ua.RB(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_y = "to keep fullscreen or";
        field_w = new int[5];
        var0 = 0;
        L0: while (true) {
          if (field_w.length <= var0) {
            field_v = new pj();
            return;
          } else {
            L1: {
              if (0 == var0) {
                field_w[var0] = var0 * 20 + 20 << 8;
                break L1;
              } else {
                field_w[var0] = 51 * var0 - -51 << 8;
                break L1;
              }
            }
            if (var0 > 2) {
              field_w[var0] = bd.a(field_w[var0], 22 * (-2 + var0) << 16);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
