/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jk extends we implements ga {
    static int field_B;
    static int field_A;
    static gk field_z;
    static li[] field_C;
    static a field_x;
    static String[] field_y;
    static int field_u;
    we field_v;
    static int field_w;

    String a(byte param0) {
        String var3 = null;
        String var2 = super.a(param0);
        if (this.field_v != null) {
            var3 = this.field_v.a((byte) 54);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.e(109);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (!this.field_v.a(param0, param1)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("jk.AA(");

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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    we a(int param0) {
        we var2 = this.field_v;
        if (var2 != null && var2.b((byte) 72)) {
            return var2;
        }
        if (param0 == -1) {
            return null;
        }
        field_x = (a) null;
        return null;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            field_C = (li[]) null;
        }
        return null != this.a(-1) ? true : false;
    }

    void i(int param0) {
        if (param0 != -2) {
            field_u = 112;
        }
        if (this.field_v != null) {
            this.field_v.g(-1);
        }
    }

    private final boolean a(byte param0, we param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -18) {
                break L1;
              } else {
                field_C = (li[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v == null) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 74)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jk.G(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param2, (byte) -122, param3, param1)) {
                break L1;
              } else {
                this.a(param2, param3, param1, -37);
                this.b(param2, -25844, param1, param3);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                jk.a(44, true, 113);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jk.T(").append(param0).append(',');

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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, we param1) {
        RuntimeException var3 = null;
        we var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -11) {
                break L1;
              } else {
                var4 = (we) null;
                this.a(-19, -80, (we) null, 5, 102, 80);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (this.field_v.b((byte) 79)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param1, false)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jk.K(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    jk(int param0, int param1, int param2, int param3, ml param4, of param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -1625) {
                break L1;
              } else {
                field_B = -20;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.a(this.field_e + param0, param1, param2, -1625, param4, param5, param6 - -this.field_r)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("jk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1) && null != this.field_h) {
            this.field_h.a(true, (we) (this), param2, param3, 20);
        }
        if (param0 != 30) {
            return;
        }
        if (this.field_v != null) {
            this.field_v.a(30, param1, this.field_e + param2, this.field_r + param3);
        }
    }

    final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        discarded$12 = param2.append('\n');
                        if (param1 == -25844) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_A = 50;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var5_int ^ -1) < (param3 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        discarded$13 = param2.append(' ');
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == this.field_v) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_v.a(false, param2, param0, param3 + 1);
                        if (var6 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        discarded$14 = param2.append("null");
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("jk.J(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 != 77) {
            return;
        }
        field_z = null;
        field_x = null;
        field_C = null;
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -14);
              if (param3 <= -13) {
                break L1;
              } else {
                this.a(24);
                break L1;
              }
            }
            L2: {
              if (this.field_v != null) {
                this.field_v.a(param0, param1 - -this.field_e, this.field_r + param2, (byte) -86);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jk.E(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return -59;
        }
        return this.field_v == null ? 0 : this.field_v.f(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-2);
    }

    final void e(int param0) {
        if (param0 != 13104) {
            this.a(49, -102, 107, 123);
        }
        if (null != this.field_v) {
            this.field_v.e(param0 ^ 0);
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_v == null) {
                break L1;
              } else {
                if (!this.field_v.b((byte) 126)) {
                  break L1;
                } else {
                  if (this.field_v.a(param0, param1, param2, 124)) {
                    stackIn_5_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var5_int = param2;
            if (80 == var5_int) {
              L2: {
                if (dl.field_c[81]) {
                  stackIn_11_0 = this.a((byte) -94, param0);
                  break L2;
                } else {
                  stackIn_11_0 = this.a(-12, param0);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5_int = 9 % ((37 - param3) / 50);
              stackIn_13_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("jk.V(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        boolean discarded$1 = false;
        we var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_v) {
                break L1;
              } else {
                this.field_v.a(param0 + this.field_e, param1, param2, param3, 0, this.field_r + param5);
                break L1;
              }
            }
            L2: {
              if (param4 == 0) {
                break L2;
              } else {
                var8 = (we) null;
                discarded$1 = this.a((byte) -34, (we) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("jk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        boolean stackIn_79_0 = false;
        int stackIn_85_0 = 0;
        boolean stackIn_91_0 = false;
        int stackIn_97_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        String[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        String[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        String[] stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        String[] stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        String stackIn_118_2 = null;
        String[] stackIn_122_0 = null;
        String[] stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        String[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        String[] stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        String[] stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        String stackIn_126_2 = null;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        String stackIn_132_1 = null;
        int stackIn_133_0 = 0;
        String stackIn_133_1 = null;
        int stackIn_134_0 = 0;
        String stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        String[] stackIn_157_0 = null;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_172_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_78_0;
        boolean stackOut_90_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    wd.field_g = true;
                    ud.field_b = param2;
                    if (0 != ud.field_b) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                    var4 = 3 - -var3_int;
                    gh.field_a = new int[var4];
                    pl.field_k = new String[var4];
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 <= var5) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    gh.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    bi.field_B = new int[2];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var5 >= var3_int) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var9 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    pl.field_k[-3 + var4] = "";
                    pl.field_k[var4 - 2] = qd.field_d;
                    gh.field_a[-2 + var4] = 0;
                    bi.field_B[0] = 4;
                    pl.field_k[-1 + var4] = db.field_e;
                    gh.field_a[-1 + var4] = 1;
                    bi.field_B[1] = 5;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var9 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-2 != (ud.field_b ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3_int = aa.a(fe.field_a, rk.field_h, pc.field_P, true, vi.field_b);
                    var4 = var3_int + 2;
                    pl.field_k = new String[var4];
                    gh.field_a = new int[var4];
                    var5 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var4 <= var5) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    gh.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    bi.field_B = new int[1];
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    pl.field_k[-2 + var4] = "";
                    pl.field_k[-1 + var4] = db.field_e;
                    gh.field_a[var4 + -1] = 0;
                    bi.field_B[0] = 5;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var9 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((ud.field_b ^ -1) == -3) {
                        statePc = 76;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (ud.field_b != 3) {
                        statePc = 47;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (rc.field_k.field_q) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var3_int = aa.a(fe.field_a, rk.field_h, ld.field_b, true, vi.field_b);
                    if (var9 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3_int = aa.a(fe.field_a, rk.field_h, uc.field_d, true, vi.field_b);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var4 = 2 - -var3_int;
                    gh.field_a = new int[var4];
                    pl.field_k = new String[var4];
                    var5 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var5 >= var4) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    gh.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    bi.field_B = new int[1];
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var5 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var9 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    pl.field_k[var4 + -2] = "";
                    pl.field_k[var4 + -1] = db.field_e;
                    gh.field_a[-1 + var4] = 0;
                    bi.field_B[0] = 5;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var9 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((ud.field_b ^ -1) != -5) {
                        statePc = 61;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var3_int = aa.a(fe.field_a, rk.field_h, pd.field_e, true, vi.field_b);
                    var4 = var3_int + 2;
                    pl.field_k = new String[var4];
                    gh.field_a = new int[var4];
                    var5 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    gh.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var9 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    bi.field_B = new int[1];
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var5 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var3_int <= var5) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    pl.field_k[-2 + var4] = "";
                    pl.field_k[-1 + var4] = db.field_e;
                    gh.field_a[-1 + var4] = 0;
                    bi.field_B[0] = 5;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var9 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (ud.field_b == 5) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    throw new IllegalArgumentException();
                }
                case 63: {
                    var3_int = aa.a(fe.field_a, rk.field_h, mg.field_r, true, vi.field_b);
                    var4 = 3 + var3_int;
                    gh.field_a = new int[var4];
                    pl.field_k = new String[var4];
                    var5 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var4 <= var5) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    gh.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var9 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    bi.field_B = new int[2];
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var5 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var5 >= var3_int) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    pl.field_k[var5] = vi.field_b[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var9 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    pl.field_k[var4 - 3] = "";
                    pl.field_k[var4 + -2] = j.field_b;
                    gh.field_a[var4 + -2] = 0;
                    bi.field_B[0] = 3;
                    pl.field_k[var4 - 1] = db.field_e;
                    gh.field_a[-1 + var4] = 1;
                    bi.field_B[1] = 5;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var9 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, pd.field_h, true), true, vi.field_b);
                    var4 = -1;
                    var5 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackOut_78_0 = "<%0>".equals(vi.field_b[var5]);
                    stackIn_85_0 = stackOut_78_0 ? 1 : 0;
                    stackIn_79_0 = stackOut_78_0;
                    if (var9 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (stackIn_79_0) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = var4 ^ -1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (stackIn_85_0 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    throw new IllegalStateException();
                }
                case 88: {
                    wi.field_b = new String[var4];
                    gl.a(vi.field_b, 0, wi.field_b, 0, var4);
                    ud.field_e = new String[-1 + var3_int + -var4];
                    gl.a(vi.field_b, 1 + var4, ud.field_e, 0, var3_int + -var4 - 1);
                    var3_int = aa.a(fe.field_a, rk.field_h, gg.a(new String[]{"<br><%0><br>"}, wa.field_d, true), true, vi.field_b);
                    var4 = -1;
                    var5 = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (var3_int <= var5) {
                        statePc = 96;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = "<%0>".equals(vi.field_b[var5]);
                    stackIn_97_0 = stackOut_90_0 ? 1 : 0;
                    stackIn_91_0 = stackOut_90_0;
                    if (var9 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_97_0 = 0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 == (var4 ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    throw new IllegalStateException();
                }
                case 100: {
                    uj.field_c = new String[var4];
                    gl.a(vi.field_b, 0, uj.field_c, 0, var4);
                    re.field_a = new String[var3_int - (var4 - -1)];
                    gl.a(vi.field_b, 1 + var4, re.field_a, 0, -1 + var3_int + -var4);
                    if (uj.field_c.length > wi.field_b.length) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = wi.field_b.length;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = uj.field_c.length;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var5 = stackIn_103_0;
                    if ((ud.field_e.length ^ -1) <= (re.field_a.length ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = re.field_a.length;
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = ud.field_e.length;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var6 = stackIn_106_0;
                    var7 = var6 + (var5 + 7);
                    gh.field_a = new int[var7];
                    pl.field_k = new String[var7];
                    var8 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (var8 >= var7) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    gh.field_a[var8] = -1;
                    var8++;
                    if (var9 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var9 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    bi.field_B = new int[2];
                    pl.field_k[0] = qb.field_d;
                    gh.field_a[1] = 0;
                    pl.field_k[1] = jf.field_p;
                    gh.field_a[3] = 1;
                    pl.field_k[4] = sk.field_F;
                    bi.field_B[1] = 2;
                    pl.field_k[2] = ua.field_y;
                    bi.field_B[0] = 5;
                    pl.field_k[3] = uf.field_c;
                    pl.field_k[5] = "";
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var8 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_123_0 = pl.field_k;
                    stackIn_115_0 = stackIn_123_0;
                    stackIn_123_1 = var8 + 6;
                    stackIn_115_1 = stackIn_123_1;
                    stackIn_123_2 = 0;
                    stackIn_115_2 = stackIn_123_2;
                    stackIn_123_3 = -var5 + var8 + uj.field_c.length;
                    stackIn_115_3 = stackIn_123_3;
                    if (var9 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_117_0 = (String[]) ((Object) stackIn_115_0);
                    stackIn_116_0 = stackIn_117_0;
                    stackIn_117_1 = stackIn_115_1;
                    stackIn_116_1 = stackIn_117_1;
                    if (stackIn_115_2 <= stackIn_115_3) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_118_0 = (String[]) ((Object) stackIn_116_0);
                    stackIn_118_1 = stackIn_116_1;
                    stackIn_118_2 = "";
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = (String[]) ((Object) stackIn_117_0);
                    stackIn_118_1 = stackIn_117_1;
                    stackIn_118_2 = uj.field_c[uj.field_c.length + var8 - var5];
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_118_0[stackIn_118_1] = stackIn_118_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    pl.field_k[6 - -var5] = null;
                    gh.field_a[var5 + 6] = -2;
                    var8 = 0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if ((var6 ^ -1) >= (var8 ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackIn_157_0 = pl.field_k;
                    stackIn_122_0 = stackIn_157_0;
                    if (var9 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = (String[]) ((Object) stackIn_122_0);
                    stackIn_123_1 = var8 + 7 + var5;
                    stackIn_123_2 = re.field_a.length;
                    stackIn_123_3 = var8;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_125_0 = (String[]) ((Object) stackIn_123_0);
                    stackIn_124_0 = stackIn_125_0;
                    stackIn_125_1 = stackIn_123_1;
                    stackIn_124_1 = stackIn_125_1;
                    if (stackIn_123_2 <= stackIn_123_3) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = (String[]) ((Object) stackIn_124_0);
                    stackIn_126_1 = stackIn_124_1;
                    stackIn_126_2 = re.field_a[var8];
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = (String[]) ((Object) stackIn_125_0);
                    stackIn_126_1 = stackIn_125_1;
                    stackIn_126_2 = "";
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_126_0[stackIn_126_1] = stackIn_126_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    fb.field_n = pf.a(0);
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    sj.field_f.field_i = bi.field_B.length;
                    var3_int = 0;
                    var4 = 0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if ((var4 ^ -1) <= (pl.field_k.length ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_138_0 = -108;
                    stackIn_131_0 = stackIn_138_0;
                    if (var9 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_133_0 = stackIn_131_0;
                    stackIn_132_0 = stackIn_133_0;
                    stackIn_133_1 = pl.field_k[var4];
                    stackIn_132_1 = stackIn_133_1;
                    if (gh.field_a[var4] < 0) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_134_0 = stackIn_132_0;
                    stackIn_134_1 = (String) ((Object) stackIn_132_1);
                    stackIn_134_2 = 1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_134_0 = stackIn_133_0;
                    stackIn_134_1 = (String) ((Object) stackIn_133_1);
                    stackIn_134_2 = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var5 = hh.a((byte) stackIn_134_0, stackIn_134_1, stackIn_134_2 != 0);
                    if (var3_int >= var5) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var3_int = var5;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = ud.field_b ^ -1;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 != -3) {
                        statePc = 152;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var10 = wi.field_b;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var10.length <= var5) {
                        statePc = 145;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var11 = var10[var5];
                    var7 = hh.a((byte) -109, var11, false);
                    stackIn_147_0 = var7 ^ -1;
                    stackIn_142_0 = stackIn_147_0;
                    stackIn_147_1 = var3_int ^ -1;
                    stackIn_142_1 = stackIn_147_1;
                    if (var9 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 >= stackIn_142_1) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var3_int = var7;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var4_ref_String__ = ud.field_e;
                    var5 = 0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    stackIn_147_0 = var5 ^ -1;
                    stackIn_147_1 = var4_ref_String__.length ^ -1;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (stackIn_147_0 <= stackIn_147_1) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var12 = var4_ref_String__[var5];
                    var7 = hh.a((byte) -126, var12, false);
                    stackIn_153_0 = var3_int ^ -1;
                    stackIn_149_0 = stackIn_153_0;
                    stackIn_153_1 = var7 ^ -1;
                    stackIn_149_1 = stackIn_153_1;
                    if (var9 != 0) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 <= stackIn_149_1) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var3_int = var7;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    h.field_b = -(var3_int >> 47297697) + (jc.field_b - -var3_int);
                    sc.field_g = jc.field_b + -(var3_int >> -1788205887);
                    fd.field_s = (ud.field_a + vf.field_b << -144221503) * sj.field_f.field_i;
                    stackIn_153_0 = param0;
                    stackIn_153_1 = -92;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (stackIn_153_0 < stackIn_153_1) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    return;
                }
                case 155: {
                    var4 = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_157_0 = pl.field_k;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (stackIn_157_0.length <= var4) {
                        statePc = 163;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackIn_164_0 = fd.field_s;
                    stackIn_159_0 = stackIn_164_0;
                    stackIn_164_1 = gh.field_a[var4] ^ -1;
                    stackIn_159_1 = stackIn_164_1;
                    if (var9 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackIn_161_0 = stackIn_159_0;
                    stackIn_160_0 = stackIn_161_0;
                    if (stackIn_159_1 <= -1) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackIn_162_0 = stackIn_160_0;
                    stackIn_162_1 = gi.field_a;
                    statePc = 162;
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = stackIn_161_0;
                    stackIn_162_1 = hb.field_n;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    fd.field_s = stackIn_162_0 + stackIn_162_1;
                    var4++;
                    if (var9 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = -(fd.field_s >> 1811966177);
                    stackIn_164_1 = fl.field_b;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    fb.field_k = stackIn_164_0 + stackIn_164_1;
                    ja.field_A = new int[pl.field_k.length][];
                    var4 = 0;
                    var5 = fb.field_k;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (pl.field_k.length <= var4) {
                        statePc = 171;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var6 = gh.field_a[var4];
                    stackIn_172_0 = var6;
                    stackIn_167_0 = stackIn_172_0;
                    if (var9 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (stackIn_167_0 < 0) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var7 = hh.a((byte) -115, pl.field_k[var4], true);
                    var8 = jc.field_b - (var7 >> 1881197345);
                    var5 = var5 + ud.field_a;
                    ja.field_A[var4] = new int[4];
                    ja.field_A[var4][0] = -pl.field_h + var8;
                    ja.field_A[var4][1] = var5;
                    ja.field_A[var4][2] = (pl.field_h << 387895873) + var7;
                    var5 = var5 + ((vf.field_b << 369803937) + (ud.field_a + hb.field_n));
                    ja.field_A[var4][3] = hb.field_n - -(vf.field_b << 1498607393);
                    if (var9 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var5 = var5 + gi.field_a;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    stackIn_172_0 = ud.field_b ^ -1;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (stackIn_172_0 == -3) {
                        statePc = 175;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    sj.field_f.a(0, q.a(p.field_a, (byte) -36, ei.field_a), 0, param1);
                    if (var9 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    sj.field_f.a(-1, -1, 0, param1);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        we var9 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 < -109) {
                break L1;
              } else {
                var9 = (we) null;
                discarded$1 = this.a((byte) -23, (we) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_v) {
                  break L3;
                } else {
                  if (!this.field_v.b((byte) 43)) {
                    break L3;
                  } else {
                    if (!this.field_v.a(param0, param1, param2, param3, param4, param5, -127)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("jk.F(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_B = 0;
        field_A = 3;
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_C = new li[field_A];
        field_u = 0;
        field_w = 0;
    }
}
