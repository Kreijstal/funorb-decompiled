/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static wd field_e;
    static pa field_i;
    static String field_f;
    static int field_g;
    private wt field_b;
    static vd[] field_a;
    private er field_d;
    private int field_c;
    private ph field_h;

    final static void a(String param0, boolean param1) {
        try {
            rs.field_x = param0;
            oi.a(12, 20665);
            if (param1) {
                field_g = 25;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "qk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ll[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int statePc = 0;
        int var9 = 0;
        ll[] var10 = null;
        ll[] var11_ref_ll__ = null;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = AceOfSkies.field_G ? 1 : 0;
                    var9 = param4 + (param1 + param5);
                    var10 = new ll[]{new ll(var9, var9), new ll(param0, var9), new ll(var9, var9), new ll(var9, param0), new ll(64, 64), new ll(var9, param0), new ll(var9, var9), new ll(param0, var9), new ll(var9, var9)};
                    var11_ref_ll__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_ll__.length) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_ll__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var14 >= var13.field_x.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_x[var14] = param8;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param4) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var12 >= var9) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_x[var9 * (-var11 + (var9 + -1)) + var12] = param2;
                    var10[8].field_x[(-var11 + (var9 - 1)) * var9 + var12] = param2;
                    var10[2].field_x[-var11 - -var9 + (-1 + var12 * var9)] = param2;
                    var10[8].field_x[-var11 - (-var9 + 1) + var12 * var9] = param2;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var11;
                    stackIn_24_1 = param4;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= stackIn_24_1) {
                        statePc = 34;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_35_0 = 0;
                    stackIn_26_0 = stackIn_35_0;
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_x[var11 * var9 + var12] = param3;
                    var10[0].field_x[var11 + var12 * var9] = param3;
                    stackIn_24_0 = var9 + -var11 ^ -1;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12 ^ -1;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 < stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10[2].field_x[var11 * var9 + var12] = param3;
                    var10[6].field_x[var11 + var9 * var12] = param3;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (param0 <= var11) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_46_0 = 0;
                    stackIn_38_0 = stackIn_46_0;
                    if (var15 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param4 <= var12) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10[7].field_x[(-1 + -var12 + var9) * param0 + var11] = param2;
                    var10[5].field_x[-var12 - (-var9 + 1 - var11 * var9)] = param2;
                    var10[1].field_x[var12 * param0 - -var11] = param3;
                    var10[3].field_x[var9 * var11 + var12] = param3;
                    var12++;
                    if (var15 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var15 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var15 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var11 = 0;
                    stackIn_46_0 = param7;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 <= -89) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    qk.a(-50, 101, 116, 1, 33, 12, 71, 24, -27);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param0 >> -1258547807 <= var11) {
                        statePc = 56;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var12 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (param5 <= var12) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10[1].field_x[var11 + (-1 + (-var12 + var9)) * param0] = param6;
                    var10[3].field_x[var9 * var11 + -1 + (var9 - var12)] = param6;
                    var10[7].field_x[var12 * param0 - -var11] = param6;
                    var10[5].field_x[var9 * var11 + var12] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var15 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_f = null;
        field_i = null;
    }

    final void a(wt param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        wt var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_c == 0) {
                  break L2;
                } else {
                  this.field_c = this.field_c - 1;
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = this.field_d.b(param1 + -18522);
              var5.c(-126);
              var5.d(-119);
              if (this.field_b != var5) {
                break L1;
              } else {
                var5 = this.field_d.b(param1 + -18522);
                var5.c(-128);
                var5.d(param1 + -125);
                break L1;
              }
            }
            this.field_h.a(125, param2, param0);
            this.field_d.a(param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("qk.A(");

            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        wo var1 = (wo) ((Object) pu.field_b.b(param0 + 4187));
        if (var1 == null) {
            var1 = new wo();
        }
        var1.a(vp.field_i, 251, vp.field_c, vp.field_f, vp.field_b, vp.field_d, vp.field_j, vp.field_k);
        bo.field_i.a(104, var1);
        if (param0 != -92) {
            field_e = (wd) null;
        }
    }

    final wt a(byte param0, long param1) {
        if (param0 != -27) {
            field_g = 50;
        }
        wt var4 = (wt) ((Object) this.field_h.a((byte) 106, param1));
        if (!(var4 == null)) {
            this.field_d.a(2, var4);
        }
        return var4;
    }

    qk(int param0) {
        int var2 = 0;
        this.field_b = new wt();
        this.field_d = new er();
        this.field_c = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_h = new ph(var2);
    }

    static {
        field_f = "You have 1 unread message!";
    }
}
