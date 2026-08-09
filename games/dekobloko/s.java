/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends w {
    w field_Ob;
    static ck[] field_Qb;
    static int field_Pb;
    w field_Nb;
    nm field_Rb;
    w field_Sb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_Ib = param3;
        this.field_mb = param6;
        this.field_vb = param0;
        this.field_N = param2;
        if (param1 != 1) {
          this.field_Nb = (w) null;
          this.a(param4, param7, param5, 16);
          return;
        } else {
          this.a(param4, param7, param5, 16);
          return;
        }
    }

    final static int a(boolean param0, int param1, int param2, CharSequence param3) {
        int stackIn_10_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (2 > param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-37 > (param2 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param2);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        if (param1 == 4) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        s.b(true);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = param3.length();
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 <= var8) {
                            statePc = 40;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param3.charAt(var8);
                        stackIn_41_0 = var8;
                        stackIn_10_0 = stackIn_41_0;
                        if (var11 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (45 == var9) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 != 43) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0) {
                            statePc = 39;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var9 < 48) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (57 < var9) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 < 65) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var9 > 90) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (97 > var9) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var9 <= 122) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var9 < param2) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4_int == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = -var9;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10 = param2 * var6 - -var9;
                        if (var6 != var10 / param2) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = var10;
                        var5 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = var5;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = var6;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return stackIn_45_0;
                }
                case 46: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_48_0 = (RuntimeException) (var4);
                    stackIn_47_0 = stackIn_48_0;
                    stackIn_48_1 = new StringBuilder().append("s.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_47_1 = stackIn_48_1;
                    if (param3 == null) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw dh.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        a.field_k = param3;
        nd.field_b = param0;
        if (param2 != -91) {
          s.b((byte) 18, 119);
          ke.field_d = param4;
          cc.field_a = param1;
          return;
        } else {
          ke.field_d = param4;
          cc.field_a = param1;
          return;
        }
    }

    final static void h(byte param0) {
        ji var2;
        sn.a(false);
        if (null == jh.field_b) {
          L0: {
            wf.d(90);
            rf.a((byte) 0);
            fc.a((byte) 67);
            if (di.a(false)) {
              we.field_b.f(1, -4);
              wj.c(4792, 0);
              break L0;
            } else {
              break L0;
            }
          }
          si.a(80);
          if (param0 <= 69) {
            var2 = (ji) null;
            s.a(-57, -79, (ck[][]) null, (byte[]) null, (ck[][]) null, -19, false, (String[][]) null, (int[]) null, (byte[]) null, (ji) null, (int[]) null, (ji) null, (pi[]) null, (String[]) null, (String[][]) null, (ji) null);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            tj.a(false, jh.field_b);
            wf.d(90);
            rf.a((byte) 0);
            fc.a((byte) 67);
            if (di.a(false)) {
              we.field_b.f(1, -4);
              wj.c(4792, 0);
              break L1;
            } else {
              break L1;
            }
          }
          si.a(80);
          if (param0 > 69) {
            return;
          } else {
            var2 = (ji) null;
            s.a(-57, -79, (ck[][]) null, (byte[]) null, (ck[][]) null, -19, false, (String[][]) null, (int[]) null, (byte[]) null, (ji) null, (int[]) null, (ji) null, (pi[]) null, (String[]) null, (String[][]) null, (ji) null);
            return;
          }
        }
    }

    public static void i(byte param0) {
        int var1 = 8 % ((param0 - -32) / 55);
        field_Qb = null;
    }

    s(long param0, w param1, w param2, jd param3, w param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_Sb = new w(0L, (w) null);
            this.field_Rb = new nm(0L, this.field_Sb, param2, param3);
            this.field_Ob = new w(0L, param4);
            this.field_Nb = new w(0L, param4);
            this.field_Ob.field_Y = param5;
            this.field_Nb.field_Y = param6;
            this.a(this.field_Rb, -16834);
            this.a(this.field_Ob, -16834);
            this.a(this.field_Nb, -16834);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "s.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        var5 = (this.field_mb - -param2) / 2;
        var6 = this.field_N - param1;
        this.field_Rb.a(6, 0, param0, 0, -param2 + var6, this.field_mb, param2);
        this.field_Ob.field_Ib = var6;
        if (param3 != 16) {
          field_Qb = (ck[]) null;
          this.field_Ob.field_N = param1;
          this.field_Ob.field_mb = var5 - param2;
          this.field_Ob.field_vb = 0;
          this.field_Nb.field_mb = this.field_mb - var5;
          this.field_Nb.field_vb = var5;
          this.field_Nb.field_Ib = var6;
          this.field_Nb.field_N = param1;
          return;
        } else {
          this.field_Ob.field_N = param1;
          this.field_Ob.field_mb = var5 - param2;
          this.field_Ob.field_vb = 0;
          this.field_Nb.field_mb = this.field_mb - var5;
          this.field_Nb.field_vb = var5;
          this.field_Nb.field_Ib = var6;
          this.field_Nb.field_N = param1;
          return;
        }
    }

    final static void g(byte param0) {
        int var1;
        if (ah.field_c != null) {
          L0: {
            ah.field_c.f((byte) -66);
            if (null != pk.field_v) {
              pk.field_v.m((byte) 114);
              break L0;
            } else {
              break L0;
            }
          }
          sh.a(0);
          var1 = 62 % ((-55 - param0) / 60);
          return;
        } else {
          L1: {
            if (null != pk.field_v) {
              pk.field_v.m((byte) 114);
              break L1;
            } else {
              break L1;
            }
          }
          sh.a(0);
          var1 = 62 % ((-55 - param0) / 60);
          return;
        }
    }

    final static int b(byte param0, int param1) {
        int var2;
        int var3;
        var2 = 0;
        if (param1 >= 0) {
          if ((param1 ^ -1) <= -65537) {
            L0: {
              param1 = param1 >>> 16;
              var2 += 16;
              if (256 > param1) {
                break L0;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L0;
              }
            }
            L1: {
              if (-17 >= (param1 ^ -1)) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (4 > param1) {
                break L2;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              }
            }
            L3: {
              if (param1 >= 1) {
                param1 = param1 >>> 1;
                var2++;
                break L3;
              } else {
                break L3;
              }
            }
            var3 = -60 % ((param0 - 69) / 45);
            return var2 - -param1;
          } else {
            L4: {
              if (256 > param1) {
                break L4;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L4;
              }
            }
            L5: {
              if (-17 >= (param1 ^ -1)) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (4 > param1) {
                break L6;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L6;
              }
            }
            L7: {
              if (param1 >= 1) {
                param1 = param1 >>> 1;
                var2++;
                break L7;
              } else {
                break L7;
              }
            }
            var3 = -60 % ((param0 - 69) / 45);
            return var2 - -param1;
          }
        } else {
          L8: {
            param1 = param1 >>> 16;
            var2 += 16;
            if (256 > param1) {
              break L8;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L8;
            }
          }
          L9: {
            if (-17 >= (param1 ^ -1)) {
              param1 = param1 >>> 4;
              var2 += 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (4 > param1) {
              break L10;
            } else {
              var2 += 2;
              param1 = param1 >>> 2;
              break L10;
            }
          }
          L11: {
            if (param1 >= 1) {
              param1 = param1 >>> 1;
              var2++;
              break L11;
            } else {
              break L11;
            }
          }
          var3 = -60 % ((param0 - 69) / 45);
          return var2 - -param1;
        }
    }

    s(long param0, s param1, String param2, String param3) {
        this(param0, param1, param1.field_Rb.field_Rb, param1.field_Rb.field_Sb, param1.field_Ob, param2, param3);
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        CharSequence var4 = null;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gh.field_e = null;
                        ge.field_c = false;
                        he.field_db = false;
                        gn.field_b = false;
                        si.field_e = new vj();
                        if (param0) {
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
                        var4 = (CharSequence) null;
                        s.a(true, -23, -56, (CharSequence) null);
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
                        jm.field_r = new vj();
                        var5 = o.field_g;
                        var1 = var5;
                        var2 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) <= -9) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5[var2] = 0;
                        var2++;
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
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
                        var1 = j.field_d;
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
                        var2 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2 >= 8) {
                            statePc = 14;
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
                        var1[var2] = 0;
                        var2++;
                        if (var3 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        id.field_P = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) runtimeException), "s.A(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, ck[][] param2, byte[] param3, ck[][] param4, int param5, boolean param6, String[][] param7, int[] param8, byte[] param9, ji param10, int[] param11, ji param12, pi[] param13, String[] param14, String[][] param15, ji param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          L0: {
            L1: {
              var18 = (String[]) null;
              sg.a(param15, param6, param9, param16, param11, (byte) -57, param7, param14, 1, param3, param13, param8, param1, param12, (String[]) null, param10, param4, param2, param5);
              if (param0 >= 66) {
                break L1;
              } else {
                field_Pb = 77;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var17);

            stackIn_5_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param16 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_42_2 + ')');
        }
    }

    static {
        field_Qb = new ck[8];
    }
}
