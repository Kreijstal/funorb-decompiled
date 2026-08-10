/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    static int[] field_d;
    private byte[][] field_i;
    private byte[][] field_e;
    static String field_a;
    static ti field_b;
    private byte[][] field_h;
    static ng field_f;
    int field_g;
    String[][] field_c;

    final void a(wf param0, byte param1) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        byte[] array$2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_e = new byte[param0.g((byte) -122)][];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= this.field_e.length) {
                L2: {
                  this.field_i = new byte[param0.g((byte) -104)][];
                  if (param1 >= 26) {
                    break L2;
                  } else {
                    this.field_g = 72;
                    break L2;
                  }
                }
                var3_int = 0;
                L3: while (true) {
                  if (this.field_i.length <= var3_int) {
                    var3_int = 0;
                    L4: while (true) {
                      if (this.field_h.length <= var3_int) {
                        break L0;
                      } else {
                        array$0 = new byte[param0.d((byte) 19)];
                        this.field_h[var3_int] = array$0;
                        var4 = array$0;
                        param0.a(96, var4.length, 0, var4);
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var4_int = (byte)param0.d(true);
                    var5 = param0.d((byte) 19);
                    array$1 = new byte[1 + var5];
                    this.field_i[var3_int] = array$1;
                    this.field_i[var3_int][0] = (byte)var4_int;
                    o.a(param0.field_j, param0.field_h, this.field_i[var3_int], 1, var5);
                    param0.field_h = param0.field_h + var5;
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                var4_int = (byte)param0.d(true);
                var5 = param0.d((byte) 19);
                array$2 = new byte[var5 - -1];
                this.field_e[var3_int] = array$2;
                this.field_e[var3_int][0] = (byte)var4_int;
                o.a(param0.field_j, param0.field_h, this.field_e[var3_int], 1, var5);
                param0.field_h = param0.field_h + var5;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("eb.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static String c(byte param0) {
        if (param0 <= 72) {
            eb.a((byte) -10);
        }
        if (af.field_b) {
            return null;
        }
        if (dj.field_b > ug.field_m) {
            return null;
        }
        if (!(ik.field_j + dj.field_b <= ug.field_m)) {
            return nc.field_p;
        }
        return null;
    }

    private final boolean a(int param0, byte[][] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = -18 % ((51 - param2) / 49);
              if (param1[param0][0] != -1) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("eb.A(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static db a(byte param0) {
        int var4_int = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var1 = bd.field_m[0] * pb.field_h[0];
        byte[] var2 = be.field_f[0];
        int[] var3 = new int[var1];
        int var5 = -59 % ((param0 - -55) / 54);
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ci.field_b[vg.a(255, (int) var2[var4_int])];
        }
        db var4 = new db(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], var3);
        gk.a(12428);
        return var4;
    }

    private final int a(byte[][] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param2) {
                break L1;
              } else {
                if (param0.length == 1) {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ne.field_a.field_j = param0[param2];
            ne.field_a.field_h = param1;
            var5_int = 255 & param3;
            var6 = -1;
            var7 = -1;
            L2: while (true) {
              if (var6 >= var5_int) {
                stackIn_12_0 = var7;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = ne.field_a.g((byte) -109);
                if (var7 != 0) {
                  var6++;
                  continue L2;
                } else {
                  var6 = var6 + (1 + ne.field_a.g((byte) -93));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("eb.D(");

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
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        boolean discarded$1 = false;
        int var8 = 0;
        int stackIn_8_0 = 0;
        byte[][] stackIn_11_0 = null;
        byte[][] stackIn_12_0 = null;
        byte[][] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 256) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        discarded$1 = this.a(20, (byte[][]) null, (byte) -51);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0.length == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    stackIn_8_0 = 256;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackIn_8_0 = 256;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5_int = stackIn_8_0;
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0.length <= var6) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = this.field_h;
                        stackIn_11_0 = stackIn_12_0;
                        if (!param2) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = (byte[][]) ((Object) stackIn_11_0);
                        stackIn_13_1 = 256;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = (byte[][]) ((Object) stackIn_12_0);
                        stackIn_13_1 = var5_int;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0[stackIn_13_1];
                        var5_int = 255 & var7[rh.a(param3 + 14561, param1, var7.length)];
                        param0[var6] = el.a((byte)var5_int, (byte) 26);
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!this.a(param0, 28)) {
                            statePc = 7;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var5);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("eb.G(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, oj param1, int param2, db param3, char param4, int param5, int param6) {
        try {
            cg.a(param1.field_f, param3, param2, param5, (byte) -72, param1.field_b, param6, param4);
            if (param0 <= 3) {
                db var8 = (db) null;
                eb.a(121, (oj) null, 17, (db) null, 'ﾍ', 59, 10);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -100) {
            db var2 = (db) null;
            eb.a(-23, (oj) null, -39, (db) null, 'ﾡ', 117, 22);
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    private final boolean a(char[] param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= -2 + param0.length) {
                var3_int = -1 + param0.length;
                L2: while (true) {
                  if (var3_int < 2) {
                    var3_int = -16 % ((-46 - param1) / 46);
                    stackIn_23_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = 1;
                    var5 = var3_int;
                    L3: while (true) {
                      L4: {
                        if (-1 < (var5 ^ -1)) {
                          break L4;
                        } else {
                          var4 = this.a(this.field_i, 1, var4, ua.a(true, param0[var5]));
                          if (var4 == 0) {
                            break L4;
                          } else {
                            if (this.a(var4, this.field_i, (byte) -35)) {
                              stackIn_19_0 = 0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              var5--;
                              continue L3;
                            }
                          }
                        }
                      }
                      var3_int--;
                      continue L2;
                    }
                  }
                }
              } else {
                var4 = 1;
                var5 = var3_int;
                L5: while (true) {
                  L6: {
                    if (param0.length <= var5) {
                      break L6;
                    } else {
                      var4 = this.a(this.field_i, 1, var4, ua.a(true, param0[var5]));
                      if ((var4 ^ -1) == -1) {
                        break L6;
                      } else {
                        if (!this.a(var4, this.field_i, (byte) -61)) {
                          var5++;
                          continue L5;
                        } else {
                          stackIn_8_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("eb.I(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            return stackIn_23_0 != 0;
          }
        }
    }

    final int a(char[] param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 1;
            var6 = param2;
            L1: while (true) {
              L2: {
                if (var6 >= param0.length) {
                  break L2;
                } else {
                  L3: {
                    var7 = 0;
                    if (param0[var6] != 0) {
                      var7 = ua.a(true, param0[var6]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = this.a(this.field_e, 1, var5, (byte) var7);
                  if (-1 != (var5 ^ -1)) {
                    L4: {
                      if (this.a(var5, this.field_e, (byte) -113)) {
                        var4_int = 1 + (-param2 + var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7 = 25 % ((60 - param1) / 44);
              stackIn_13_0 = var4_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("eb.K(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    eb(int param0, int param1) {
        this.field_h = new byte[257][];
        this.field_c = new String[param1][2];
        this.field_g = param0;
    }

    final static int d(byte param0) {
        if (param0 != -6) {
            return 81;
        }
        return ph.field_b;
    }

    static {
        field_a = "OF";
    }
}
