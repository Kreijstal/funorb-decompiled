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
        ck var2 = new ck(this.field_u);
        we var3 = (we) ((Object) var2.a((byte) -37));
        if (param0 != 13104) {
            this.e(53);
        }
        while (var3 != null) {
            var3.e(13104);
            var3 = (we) ((Object) var2.a(true));
        }
    }

    final int f(int param0) {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = param0;
        ck var3 = new ck(this.field_u);
        we var4 = (we) ((Object) var3.a((byte) -37));
        while (var4 != null) {
            var5 = var4.f(0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (we) ((Object) var3.a(true));
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
        ck stackIn_12_0 = null;
        ck stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new ck(this.field_u);
            if (!param1) {
              var4 = (we) ((Object) var3.a((byte) -37));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_15_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.a(param0, false)) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      stackIn_12_0 = (ck) (var3);

                      if (param1) {
                        stackIn_13_0 = (ck) ((Object) stackIn_12_0);
                        stackIn_13_1 = 0;
                        break L2;
                      } else {
                        stackIn_13_0 = (ck) ((Object) stackIn_12_0);
                        stackIn_13_1 = 1;
                        break L2;
                      }
                    }
                    var4 = (we) ((Object) ((ck) (Object) stackIn_13_0).a(stackIn_13_1 != 0));
                    continue L1;
                  }
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ua.AA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
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
            this.field_u.a(-8212, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ua.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -103);
              var5 = new ck(this.field_u);
              var6 = (we) ((Object) var5.a((byte) -37));
              if (param3 < -13) {
                break L1;
              } else {
                field_v = (pj) null;
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
                    var6.a(param0, param1 + this.field_e, param2 + this.field_r, (byte) -64);
                    var6 = (we) ((Object) var5.a(true));
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

            stackIn_9_1 = new StringBuilder().append("ua.E(");

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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(int param0) {
        if (param0 < 81) {
            field_w = (int[]) null;
        }
        if (hl.field_d != null && !hl.field_d.h()) {
            return;
        }
        hl.field_d = li.a(ke.field_h[6], 100, 96);
        na.a((byte) 35, hl.field_d);
    }

    private final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        ck var5 = null;
        we var6 = null;
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new ck(this.field_u);
            var6 = (we) ((Object) var5.a((byte) -37));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param3 == 13467) {
                    break L2;
                  } else {
                    field_w = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param1) {
                    var6.a(false, param2, param0, 1 + param1);
                    var6 = (we) ((Object) var5.a(true));
                    continue L1;
                  } else {
                    discarded$3 = param2.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("ua.WB(");

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
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        we var7 = null;
        int var8 = 0;
        ck var9 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var9 = new ck(this.field_u);
            var6 = -77 % ((param3 - 37) / 50);
            var7 = (we) ((Object) var9.a((byte) -37));
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
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var7 = (we) ((Object) var9.a(true));
                    continue L1;
                  }
                }
              }
              var6 = param2;
              if (80 != var6) {
                stackIn_16_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L4: {
                  if (!dl.field_c[81]) {
                    stackIn_14_0 = this.b(param0, false);
                    break L4;
                  } else {
                    stackIn_14_0 = this.a((byte) 119, param0);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ua.V(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 0 && this.field_h != null) {
            this.field_h.a(true, (we) (this), param2, param3, 69);
        }
        ck var5 = new ck(this.field_u);
        we var6 = (we) ((Object) var5.b((byte) -102));
        while (var6 != null) {
            var6.a(param0 ^ 0, param1, this.field_e + param2, param3 + this.field_r);
            var6 = (we) ((Object) var5.a(param0 + -3733));
        }
        if (param0 != 30) {
            this.b((byte) 23);
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
        ck var2 = new ck(this.field_u);
        we var3 = (we) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            var4 = var3.a((byte) 54);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (we) ((Object) var2.a(true));
        }
        if (param0 == 54) {
            return null;
        }
        this.a(89, -46, 124, -95);
        return null;
    }

    private final void c(byte param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(this.field_u);
        if (param0 < 80) {
            this.b((byte) -67);
        }
        we var3 = (we) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            var3.g(-1);
            var3 = (we) ((Object) var2.a(true));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        we var9 = null;
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
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ck(this.field_u);
              if (param3 == -1625) {
                break L1;
              } else {
                ua.j(-119);
                break L1;
              }
            }
            var9 = (we) ((Object) var8.a((byte) -37));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.d(-3548)) {
                    break L3;
                  } else {
                    if (!var9.a(param0 - -this.field_e, param1, param2, -1625, param4, param5, param6 + this.field_r)) {
                      var9 = (we) ((Object) var8.a(true));
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

            stackIn_14_1 = new StringBuilder().append("ua.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ck var7 = null;
        we var8 = null;
        int var9 = 0;
        we var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new ck(this.field_u);
            var8 = (we) ((Object) var7.a((byte) -37));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.d(-3548)) {
                    break L2;
                  } else {
                    var8.a(this.field_e + param0, param1, param2, param3, 0, param5 + this.field_r);
                    var8 = (we) ((Object) var7.a(true));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param4 == 0) {
                  break L3;
                } else {
                  var10 = (we) null;
                  this.a(122, 7, (we) null, -60, 25, -69);
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
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            this.a((byte) 92);
        }
        return null != this.a(true) ? true : false;
    }

    we a(boolean param0) {
        ck var2;
        we var3;
        int var4;
        we var5;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = new ck(this.field_u);
          if (param0) {
            break L0;
          } else {
            var5 = (we) null;
            this.a((byte) -39, (we) null);
            break L0;
          }
        }
        var3 = (we) ((Object) var2.a((byte) -37));
        L1: while (true) {
          if (var3 != null) {
            if (var3.b((byte) 40)) {
              return var3;
            } else {
              var3 = (we) ((Object) var2.a(param0));
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 < -109) {
              var8 = new ck(this.field_u);
              var9 = (we) ((Object) var8.a((byte) -37));
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
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (we) ((Object) var8.a(true));
                      continue L1;
                    }
                  }
                }
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
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
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("ua.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              if (this.field_u.e(11253)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = new ck(this.field_u);
                var4 = (we) ((Object) var3.a((byte) -37));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_20_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b((byte) 122)) {
                        break L2;
                      } else {
                        var5 = new ck(this.field_u);
                        var5.a((byte) -127, (ug) (var4));
                        var6 = (we) ((Object) var5.a(true));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.a(param0, false)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var6 = (we) ((Object) var5.a(true));
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    var4 = (we) ((Object) var3.a(true));
                    continue L1;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("ua.TB(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
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
              if (this.a(param2, (byte) -127, param3, param1)) {
                this.a(param2, param3, param1, -113);
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
                this.a(118, 103, -77, 34, 51);
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

            stackIn_9_1 = new StringBuilder().append("ua.T(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    ua(int param0, int param1, int param2, int param3, ml param4) {
        super(param0, param1, param2, param3, param4, (of) null);
        this.field_u = new pj();
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_u.e(11253)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = new ck(this.field_u);
              if (param0 > 54) {
                var4 = (we) ((Object) var3.b((byte) -96));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.b((byte) 116)) {
                        break L2;
                      } else {
                        var5 = new ck(this.field_u);
                        var5.a(-11121, var4);
                        var6 = (we) ((Object) var5.a(-3703));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(param1, false)) {
                              var6 = (we) ((Object) var5.a(-3703));
                              continue L3;
                            } else {
                              stackIn_15_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    var4 = (we) ((Object) var3.a(-3703));
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
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("ua.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            field_y = "to keep fullscreen or";
            field_w = new int[5];
            var0 = 0;
            L0: while (true) {
              if (field_w.length <= var0) {
                field_v = new pj();
                break $cfr$clinit;
              } else {
                L1: {
                  if (0 == var0) {
                    field_w[var0] = var0 * 20 + 20 << 36086632;
                    break L1;
                  } else {
                    field_w[var0] = 51 * var0 - -51 << -284439704;
                    break L1;
                  }
                }
                if (-3 > (var0 ^ -1)) {
                  field_w[var0] = bd.a(field_w[var0], 22 * (-2 + var0) << 1830170768);
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
}
