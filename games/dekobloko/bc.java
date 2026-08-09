/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends a {
    static mf field_E;
    static String field_F;
    private sn field_C;
    private sn[] field_A;
    static int[][] field_D;
    static String field_G;
    static int[] field_J;
    static int[] field_I;
    static int field_B;
    static String field_K;

    private final void a(byte param0, bc param1, boolean param2) {
        sn dupTemp$2 = null;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        sn stackIn_11_0 = null;
        sn stackIn_12_0 = null;
        sn stackIn_13_0 = null;
        sn stackIn_13_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(-12253, param1);
                        if (param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        an.a(this.field_A, 0, param1.field_A, 0, 6);
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4_int ^ -1) <= -7) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = this.field_A[var4_int];
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 != null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param1.field_A[var4_int] = null;
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = param1.field_A[var4_int];
                        stackIn_12_0 = (sn) (var5);
                        stackIn_11_0 = stackIn_12_0;
                        if (var6 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = (sn) ((Object) stackIn_11_0);
                        stackIn_13_1 = (sn) (var6);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dupTemp$2 = new sn();
                        param1.field_A[var4_int] = dupTemp$2;
                        stackIn_13_0 = (sn) ((Object) stackIn_12_0);
                        stackIn_13_1 = (sn) (dupTemp$2);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((sn) (Object) stackIn_13_0).a(stackIn_13_1, 1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_int = -82 % ((-68 - param0) / 44);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (runtimeException);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("bc.I(").append(param0).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, ck[] param1, int param2) {
        int var4_int = 0;
        try {
            if (param0 <= 97) {
                ce var5 = (ce) null;
                this.a(true, -54, 87, (byte) -121, (ce) null);
            }
            var4_int = param2;
            if (this.field_A[var4_int] == null) {
                this.field_A[var4_int] = new sn();
            }
            this.field_A[param2].field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    bc(bc param0, boolean param1) {
        this();
        try {
            param0.a((byte) -117, (bc) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bc() {
        this.field_A = new sn[6];
        this.field_C = new sn();
        sn dupTemp$0 = new sn();
        this.field_A[0] = dupTemp$0;
        sn var1 = dupTemp$0;
        var1.b((byte) 68);
    }

    final sn a(int param0, int param1) {
        sn dupTemp$2 = null;
        sn dupTemp$3 = null;
        if (param1 <= 0) {
          field_E = (mf) null;
          dupTemp$2 = new sn();
          this.field_A[param0] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new sn();
          this.field_A[param0] = dupTemp$3;
          return dupTemp$3;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 65) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_K = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = param0.length();
                        if (-21 > (var2_int ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = 20;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = new char[var2_int];
                        var7 = var8;
                        var3 = var7;
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param0.charAt(var4);
                        if (65 > var5) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 > 90) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3[var4] = (char)(-65 + (var5 + 97));
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 < 97) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 <= 122) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5 < 48) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var5 > 57) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3[var4] = (char)var5;
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (char)95;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = new String(var8);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var2);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("bc.E(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        ce stackIn_3_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sn var7 = null;
        sn var9 = null;
        ce var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof ek) {
                stackIn_3_0 = (ce) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var11 = (ek) ((Object) stackIn_3_0);
              gg.a(param4.field_D + param2, 20763, param4.field_t + param4.field_u + param1, param1 - -param4.field_u, param4.field_D + param2 + param4.field_y);
              if (var11 != null) {
                param0 = param0 & var11.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_A[0];
              this.field_C.b((byte) 80);
              var7.a(this.field_C, (bc) (this), 122, param2, param1, param4);
              if (var11 != null) {
                L4: {
                  if (!var11.field_H) {
                    break L4;
                  } else {
                    var12 = this.field_A[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(this.field_C, (bc) (this), 127, param2, param1, param4);
                      break L4;
                    }
                  }
                }
                if (var11.field_q) {
                  L5: {
                    L6: {
                      var13 = this.field_A[3];
                      if (var11.field_o == 0) {
                        break L6;
                      } else {
                        if (var13 != null) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var9 = this.field_A[2];
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                        break L7;
                      }
                    }
                    if (!client.field_A) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var13.a(this.field_C, (bc) (this), 122, param2, param1, param4);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L8: {
              if (param4.a(true)) {
                var14 = this.field_A[5];
                if (var14 != null) {
                  var14.a(this.field_C, (bc) (this), 126, param2, param1, param4);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (!param0) {
                var15 = this.field_A[4];
                if (var15 != null) {
                  var15.a(this.field_C, (bc) (this), 124, param2, param1, param4);
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            this.field_C.a(-2, param4, param1, (bc) (this), param2);
            mk.a((byte) -5);
            if (param3 <= -60) {
              break L0;
            } else {
              var10 = (ce) null;
              this.a(true, -61, 21, (byte) -12, (ce) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6);

            stackIn_35_1 = new StringBuilder().append("bc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void a(ck param0, int param1) {
        RuntimeException runtimeException = null;
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = this.field_A;
              var3 = var7;
              if (param1 == 2) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var7.length) {
                  break L3;
                } else {
                  var5 = var7[var4];
                  if (var6 == 0) {
                    L4: {
                      if (var5 != null) {
                        var5.field_b = param0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("bc.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void a(ck[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = this.field_A;
            var3 = var7;
            var4 = 0;
            if (!param1) {
              L1: while (true) {
                L2: {
                  if (var4 >= var7.length) {
                    break L2;
                  } else {
                    var5 = var7[var4];
                    if (var6 == 0) {
                      L3: {
                        if (var5 == null) {
                          break L3;
                        } else {
                          var5.field_a = param0;
                          break L3;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("bc.A(");

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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_J = null;
        field_D = (int[][]) null;
        field_K = null;
        if (param0 >= -101) {
          field_K = (String) null;
          field_I = null;
          field_G = null;
          field_E = null;
          return;
        } else {
          field_I = null;
          field_G = null;
          field_E = null;
          return;
        }
    }

    static {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
