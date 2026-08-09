/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    private ai field_d;
    private java.math.BigInteger field_e;
    static ri field_c;
    private qb field_i;
    static int field_g;
    private tn field_h;
    private k field_b;
    private cn[] field_f;
    private java.math.BigInteger field_a;

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener(um.field_c);
            param0.removeFocusListener(um.field_c);
            qf.field_f = -1;
            int var2_int = -120 % ((param1 - 66) / 53);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "eq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    eq(qb param0, ai param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final cn a(int param0, bq param1, int param2, bq param3, boolean param4) {
        cn stackIn_11_0 = null;
        cn stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        cn var9 = null;
        CharSequence[] var10 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              if (param2 == -15893) {
                break L1;
              } else {
                var10 = (CharSequence[]) null;
                eq.a((CharSequence[]) null, 8, 88, 1);
                break L1;
              }
            }
            if (null == this.field_b) {
              throw new RuntimeException();
            } else {
              L2: {
                if ((param0 ^ -1) > -1) {
                  break L2;
                } else {
                  if (this.field_f.length <= param0) {
                    break L2;
                  } else {
                    if (null == this.field_f[param0]) {
                      this.field_b.field_j = 6 + 72 * param0;
                      var6_int = this.field_b.i(-1478490344);
                      var7 = this.field_b.i(param2 + -1478474451);
                      var14 = new byte[64];
                      this.field_b.a(0, param2 ^ 9946, 64, var14);
                      var9 = new cn(param0, param3, param1, this.field_i, this.field_d, var6_int, var14, var7, param4);
                      this.field_f[param0] = var9;
                      stackIn_13_0 = (cn) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_11_0 = this.field_f[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("eq.F(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = "";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (-2 == (param3 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = param0[param1];
                        var4 = var10;
                        if (var4 != null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = "null";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackIn_10_0 = var10.toString();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var4_int = param3 - -param1;
                        var5 = 0;
                        var6_int = param1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4_int <= var6_int) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 += 4;
                        if (var9 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = var5 + var7_ref_CharSequence.length();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = new StringBuilder(var5);
                        var7 = param1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = param0[var7];
                        if (var9 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        discarded$0 = var6.append(var8);
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        discarded$1 = var6.append("null");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        discarded$2 = var6.append("null");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param2 == 4) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (String) null;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    try {
                        stackIn_31_0 = var6.toString();
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var4_ref);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("eq.A(");
                    stackIn_33_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            eq.a(-117);
        }
    }

    private eq(qb param0, ai param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_d = param1;
            this.field_i = param0;
            this.field_e = param3;
            this.field_a = param2;
            if (!this.field_i.e(82)) {
              this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("eq.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
    }

    final boolean c(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        k var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        int var16;
        int var17;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_b) {
          return true;
        } else {
          L0: {
            if (null == this.field_h) {
              if (!this.field_i.e(54)) {
                this.field_h = this.field_i.a(487989472, 255, true, 255, (byte) 0);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (this.field_h.field_t) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new k(this.field_h.e(0));
                var10.field_j = 5;
                var3 = var10.g(31365);
                var10.field_j = var10.field_j + var3 * 72;
                var13 = new byte[var10.field_m.length - var10.field_j];
                var11 = var13;
                var4 = var11;
                var10.a(0, -6351, var13.length, var13);
                if (null == this.field_a) {
                  break L2;
                } else {
                  if (null == this.field_e) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var13);
                    var7_ref_java_math_BigInteger = var12.modPow(this.field_a, this.field_e);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var15 = ho.a(4246, 5, var10.field_m, -var13.length + (var10.field_j + -5));
              var7 = 0;
              L3: while (true) {
                L4: {
                  if (64 <= var7) {
                    break L4;
                  } else {
                    var17 = var5[var7 - -1];
                    var16 = var15[var7];
                    if (var8 != 0) {
                      if (var16 > var17) {
                        this.field_h = (tn) null;
                        this.field_b = var10;
                        this.field_f = new cn[var3];
                        return true;
                      } else {
                        this.field_b = var10;
                        this.field_f = new cn[var3];
                        return true;
                      }
                    } else {
                      if (var16 == var17) {
                        var7++;
                        if (var8 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                if (param0 > -113) {
                  this.field_h = (tn) null;
                  this.field_b = var10;
                  this.field_f = new cn[var3];
                  return true;
                } else {
                  this.field_b = var10;
                  this.field_f = new cn[var3];
                  return true;
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        cn stackIn_14_0 = null;
        cn stackIn_21_0 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_f != null) {
          var2 = param0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (this.field_f.length <= var2) {
                      break L4;
                    } else {
                      stackIn_21_0 = this.field_f[var2];

                      if (var3 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_21_0 == null) {
                              break L6;
                            } else {
                              this.field_f[var2].b(-2);
                              break L6;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            if (this.field_f.length > var2) {
                              if (var3 == 0) {
                                stackIn_21_0 = this.field_f[var2];
                                continue L5;
                              } else {
                                break L2;
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_21_0 == null) {
                            break L7;
                          } else {
                            this.field_f[var2].c(90);
                            break L7;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var2 = 0;
                  L8: while (true) {
                    if (this.field_f.length > var2) {
                      if (var3 == 0) {
                        stackIn_14_0 = this.field_f[var2];
                        L9: {
                          if (stackIn_14_0 == null) {
                            break L9;
                          } else {
                            this.field_f[var2].b(-2);
                            break L9;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L8;
                        } else {
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
              return;
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_g = 9;
    }
}
