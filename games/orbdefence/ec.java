/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec extends ta implements ai {
    static int field_K;
    static String field_J;
    static int[] field_E;
    static String field_H;
    private kc field_I;
    private String field_A;
    private int field_D;
    private int[] field_C;
    private s[] field_B;
    static String field_F;
    private dh field_G;

    private final void a(int param0, int param1) {
        int statePc = 0;
        s[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        s[] var7 = null;
        s[] var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    if (this.field_D >= param0) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var7 = new s[param0];
                    var8 = var7;
                    var3 = var8;
                    var4 = new int[param0];
                    if (param1 == 11339) {
                        statePc = 14;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.a(44, 28, 45, 89);
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_D > var5) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_B = var8;
                    this.field_C = var4;
                    this.field_D = param0;
                    return;
                }
                case 7: {
                    var7[var5] = this.field_B[var5];
                    var4[var5] = this.field_C[var5];
                    var5++;
                    if (var6 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_B = var8;
                    this.field_C = var4;
                    this.field_D = param0;
                    return;
                }
                case 14: {
                    var5 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_D > var5) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_B = var8;
                    this.field_C = var4;
                    this.field_D = param0;
                    return;
                }
                case 17: {
                    var7[var5] = this.field_B[var5];
                    var4[var5] = this.field_C[var5];
                    var5++;
                    if (var6 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_B = var8;
                    this.field_C = var4;
                    this.field_D = param0;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ec(dh param0, kc param1, String param2) {
        super(0, 0, 288, 0, (td) null);
        int var4_int = 0;
        this.field_D = 0;
        try {
            this.field_G = param0;
            this.field_A = param2;
            this.field_I = param1;
            var4_int = null != this.field_A ? this.field_I.a(this.field_A, 260, this.field_I.field_H) : 0;
            this.a(0, 0, var4_int + 22, (byte) -90, 288);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final s a(String param0, int param1, ag param2) {
        s var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        s stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new s(param0, param2);
            var4.field_j = (td) ((Object) new vk());
            var5 = -2 + this.field_r;
            this.a(0, 0, this.field_r - param1, (byte) -90, this.field_m);
            var4.a(7, var5, 30, (byte) -90, -14 + this.field_m);
            this.a(var4, (byte) 74);
            stackIn_1_0 = (s) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ec.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_D <= var6_int) {
                    break L3;
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param3 != this.field_B[var6_int]) {
                          break L4;
                        } else {
                          L5: {
                            var7 = this.field_C[var6_int];
                            if (-1 == var7) {
                              break L5;
                            } else {
                              il.a(this.field_C[var6_int], 0);
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.field_G.q(4210752);
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        var6_int = -66 / ((param0 - -3) / 62);
                        return;
                      }
                    }
                  }
                }
                var6_int = -66 / ((param0 - -3) / 62);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("ec.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = this.field_D;
            this.a(1 + var4_int, 11339);
            this.field_B[var4_int] = this.a(param0, gi.a(param2, 15824), (ag) (this));
            this.field_C[var4_int] = param1;
            if (param2 == -15858) {
              break L0;
            } else {
              ec.k(23);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("ec.Q(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, long param9, int param10, be param11, int param12, int param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                cd.field_t = new se(param1);
                uk.field_b = new se(param7);
                gi.field_a = param12;
                j.field_e = param3;
                eg.field_v = param6;
                jl.field_e = param0;
                dk.field_a = param10;
                el.field_G = param9;
                ti.field_eb = param5;
                sj.field_x = param8;
                if (param13 > 23) {
                  L1: {
                    ef.field_i = param11;
                    if (!param4) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    mg.field_g = stackIn_5_0 != 0;
                    if (!param2) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  jc.field_b = stackIn_8_0 != 0;
                  if (null != ef.field_i.field_v) {
                    try {
                      L3: {
                        s.field_y = new dj(ef.field_i.field_v, 64, 0);
                        break L3;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("ec.O(");

                if (param0 == null) {
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


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

                if (param11 == null) {
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
              throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = ji.field_a;
                        var1 = var6;
                        var2 = 0;
                        var3 = -114 / ((4 - param0) / 42);
                        var4 = var6.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= var4) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var6[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var6[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var6[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var6[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var6[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var6[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var6[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var6[incrementValue$15] = 0;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1_ref), "ec.H(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_F = null;
        field_H = null;
        field_J = null;
        if (param0 != 122) {
            ec.l(20);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_I.a(this.field_A, param3 - -this.field_s + 14, param0 + this.field_n + 10, -28 + this.field_m, this.field_r, 16777215, -1, 0, 0, this.field_I.field_H);
    }

    final static boolean k(int param0) {
        int stackIn_4_0 = 0;
        if (param0 != 783) {
          return false;
        } else {
          L0: {
            pc.field_Y = true;
            lm.field_c = ji.b(114) + 15000L;
            if (hi.field_k != 11) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_H = "Passwords can only contain letters and numbers";
        field_J = "Create your own free Jagex account";
        field_F = "Player";
    }
}
