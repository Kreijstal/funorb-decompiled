/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    static sh field_a;
    static int[] field_e;
    private int field_g;
    private int field_f;
    static String field_b;
    private int[] field_d;
    private boolean field_c;

    final static nc a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        nc var9 = null;
        RuntimeException var9_ref = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new nc(param1, param0, param4, param2, param6, param8, param7);
              ok.field_b.b(114, var9);
              ga.a(var9, param3, 104);
              if (param5 == 56) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (nc) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1) {
        int var3;
        if (param0 >= 0) {
          if (param0 <= this.field_f) {
            if (param0 != this.field_f) {
              o.a(this.field_d, 1 + param0, this.field_d, param0, -param0 + this.field_f);
              var3 = 36 % ((53 - param1) / 55);
              this.field_f = this.field_f - 1;
              return;
            } else {
              var3 = 36 % ((53 - param1) / 55);
              this.field_f = this.field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final static void a(le param0, int param1, int param2, int param3, int param4, int param5, wh param6, int param7, le param8, wh param9, int param10, int param11, int param12, int param13, int param14, int param15, wh param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              ng.a(param5, param8, (byte) 115, param0);
              if (param12 == 0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            vc.a(-5094, param20, param10, param15, param2);
            Lexicominos.a(param7, param12 ^ 102, param18);
            tg.a(param6, param11, param16, param13, -109, param4);
            ph.a(param14, (byte) 126, param1, param9);
            sc.a(param12 + -72, param3, param17, param19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("gl.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != -110) {
            this.a(34, (byte) 74);
            return this.field_f + 1;
        }
        return this.field_f + 1;
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (this.field_f < param1) {
            this.field_f = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_d.length <= param1) {
            this.a(param1, false);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_d[param1] = param2;
        if (param0 >= -25) {
          this.a(-31, -120, -39);
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, int param1) {
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_3_0;
        boolean stackOut_13_0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    if (param1 != 12359) {
                        statePc = 11;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = this.field_d.length;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param0 < var3) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = this.field_c;
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var3 = var3 + this.field_g;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var3 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = var3 * this.field_g;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = var3;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    this.a(90, true);
                    var3 = this.field_d.length;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param0 < var3) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = this.field_c;
                    stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var4 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3 = var3 + this.field_g;
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var3 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var3 = var3 * this.field_g;
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = var3;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return stackIn_20_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1) {
        this.a(-53, this.field_f + param1, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -90) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final int a(int param0, int param1) {
        if (param0 <= this.field_f) {
          if (param1 > -105) {
            this.field_c = true;
            return this.field_d[param0];
          } else {
            return this.field_d[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var3;
        int[] var4;
        var4 = new int[this.b(param0, 12359)];
        var3 = var4;
        o.a(this.field_d, 0, var4, 0, this.field_d.length);
        this.field_d = var4;
        if (param1) {
          this.c(-2, 38);
          return;
        } else {
          return;
        }
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
    }
}
