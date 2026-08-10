/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends t {
    private ef field_ub;
    private int field_nb;
    private int field_tb;
    static int field_vb;
    static ke field_wb;
    private int field_lb;
    private ce field_sb;
    private i field_pb;
    private int field_rb;
    private int field_mb;
    static ck field_qb;
    static int field_kb;
    static String field_ob;

    final void j(byte param0) {
        int var2;
        if (this.field_pb == da.field_b) {
          return;
        } else {
          var2 = -119 % ((param0 - 30) / 39);
          this.field_rb = 0;
          this.field_pb = rb.field_c;
          this.a(this.field_sb, -29870);
          this.field_ub.field_Q = 0;
          this.field_sb = null;
          return;
        }
    }

    private final void a(ce param0, int param1) {
        ce var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_ub == null) {
                break L1;
              } else {
                this.field_ub.b((byte) 111);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  break L3;
                } else {
                  this.field_ub = new ef();
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.b(param0.field_y, param0.field_t, 6, this.field_nb + 6, -16555);
              this.field_ub = new ef(param0);
              break L2;
            }
            L4: {
              this.b(this.field_ub, (byte) -55);
              this.field_sb = null;
              if (param1 == -29870) {
                break L4;
              } else {
                var4 = (ce) null;
                this.c((ce) null, (byte) -56);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ca.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, String param1, String param2, byte param3, int param4, int param5) {
        hl var6 = null;
        try {
            var6 = new hl(param4, param0, param5, param1, param2);
            rb.a(var6, -3);
            int var7 = 121 % ((20 - param3) / 42);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ca.W(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        int statePc = 0;
        int var9 = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    var9 = param1 + (param3 + param4);
                    var10 = new ck[]{new ck(var9, var9), new ck(param8, var9), new ck(var9, var9), new ck(var9, param8), new ck(64, 64), new ck(var9, param8), new ck(var9, var9), new ck(param8, var9), new ck(var9, var9)};
                    var11_ref_ck__ = var10;
                    if (!param5) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_kb = -21;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var12 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var11_ref_ck__.length <= var12) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var13 = var11_ref_ck__[var12];
                    stackIn_13_0 = 0;
                    stackIn_5_0 = stackIn_13_0;
                    if (var15 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var14 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var14 >= var13.field_D.length) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13.field_D[var14] = param0;
                    var14++;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var15 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var15 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var11 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var11 >= param3) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_24_0 = 0;
                    stackIn_16_0 = stackIn_24_0;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var12 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9 <= var12) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10[6].field_D[var12 + (var9 + -var11 - 1) * var9] = param2;
                    var10[8].field_D[(-1 + (var9 + -var11)) * var9 + var12] = param2;
                    var10[2].field_D[-var11 - 1 - -var9 + var12 * var9] = param2;
                    var10[8].field_D[var12 * var9 + (-var11 + (-1 + var9))] = param2;
                    var12++;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var15 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11 = stackIn_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = var11;
                    stackIn_26_1 = param3;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 >= stackIn_26_1) {
                        statePc = 36;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_37_0 = 0;
                    stackIn_28_0 = stackIn_37_0;
                    if (var15 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var9 <= var12) {
                        statePc = 35;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[0].field_D[var12 - -(var9 * var11)] = param7;
                    var10[0].field_D[var9 * var12 + var11] = param7;
                    stackIn_26_0 = -var11 + var9 ^ -1;
                    stackIn_31_0 = stackIn_26_0;
                    stackIn_26_1 = var12 ^ -1;
                    stackIn_31_1 = stackIn_26_1;
                    if (var15 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 < stackIn_31_1) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var10[2].field_D[var12 - -(var11 * var9)] = param7;
                    var10[6].field_D[var12 * var9 + var11] = param7;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var11 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param8 <= var11) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_48_0 = 0;
                    stackIn_40_0 = stackIn_48_0;
                    if (var15 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var12 = stackIn_40_0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (var12 >= param3) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var10[7].field_D[(-1 + var9 - var12) * param8 + var11] = param2;
                    var10[5].field_D[-var12 - (1 + -var9 - var11 * var9)] = param2;
                    var10[1].field_D[var12 * param8 + var11] = param7;
                    var10[3].field_D[var9 * var11 - -var12] = param7;
                    var12++;
                    if (var15 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var11++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var11 = stackIn_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (param8 >> 949160769 <= var11) {
                        statePc = 57;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var12 >= param4) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var10[1].field_D[var11 + param8 * (-1 + -var12 + var9)] = param6;
                    var10[3].field_D[-var12 - (1 + -var9 - var9 * var11)] = param6;
                    var10[7].field_D[var12 * param8 - -var11] = param6;
                    var10[5].field_D[var12 + var9 * var11] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var15 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11++;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void c(ce param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 10) {
                break L1;
              } else {
                field_kb = -79;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  this.field_sb = param0;
                  if (fh.field_e != this.field_pb) {
                    break L4;
                  } else {
                    this.b(this.field_sb.field_t + 12, this.field_tb, this.field_sb.field_y + this.field_nb + 12, 194);
                    this.field_rb = 0;
                    if (!client.field_A) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (da.field_b == this.field_pb) {
                  break L3;
                } else {
                  this.field_pb = da.field_b;
                  this.field_rb = 0;
                  break L2;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ca.T(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static ck[] m(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    var1 = new ck[ec.field_g];
                    var2 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= ec.field_g) {
                        statePc = 19;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = hc.field_c[var2] * tm.field_a[var2];
                    var17 = tc.field_Nb[var2];
                    stackOut_2_0 = da.field_d[var2];
                    stackIn_20_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var8 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var9 = new int[var3];
                    var6_int = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 <= var6_int) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9[var6_int] = mb.field_d[lb.a(255, (int) var17[var6_int])];
                    var6_int++;
                    if (var8 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var8 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var9);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var18 = pd.field_e[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6 = var12;
                    var7 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var3 <= var7) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6[var7] = de.b(lb.a((int) var18[var7], 255) << -1019066312, mb.field_d[lb.a((int) var17[var7], 255)]);
                    var7++;
                    if (var8 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var8 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var1[var2] = (ck) ((Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var14));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var2++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var8 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 126;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    oa.a(stackIn_20_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void l(int param0) {
        if (param0 <= 72) {
            return;
        }
        field_wb = null;
        field_ob = null;
        field_qb = null;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(82, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5_int = 54 % ((param0 - -22) / 49);
                if (this.field_ub == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 == param1) {
                      this.field_ub.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if ((param1 ^ -1) == -100) {
                    this.field_ub.a(false, param2);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ca.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void j(int param0) {
        if (!(null == this.field_pb)) {
            if (this.field_pb != rb.field_c) {
                this.a(108, this.field_sb.field_t + 12, this.field_nb + 12 - -this.field_sb.field_y);
                this.a(this.field_sb, -29870);
            }
            this.field_ub.field_Q = 256;
            this.field_pb = null;
        }
        super.j(92);
        int var2 = 11 % ((-15 - param0) / 49);
    }

    boolean h(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 > 15) {
            break L0;
          } else {
            field_kb = -126;
            break L0;
          }
        }
        L1: {
          if (this.field_pb == null) {
            break L1;
          } else {
            L2: {
              if (da.field_b == this.field_pb) {
                break L2;
              } else {
                if (this.field_pb != rb.field_c) {
                  break L1;
                } else {
                  L3: {
                    fieldTemp$2 = this.field_rb + 1;
                    this.field_rb = this.field_rb + 1;
                    if (fieldTemp$2 == this.field_mb) {
                      break L3;
                    } else {
                      this.field_ub.field_Q = (this.field_rb << -1699061016) / this.field_mb;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_ub.field_Q = 256;
                  this.field_pb = null;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              fieldTemp$3 = this.field_rb + 1;
              this.field_rb = this.field_rb + 1;
              if (fieldTemp$3 == this.field_lb) {
                break L4;
              } else {
                this.field_ub.field_Q = -((this.field_rb << 1615067112) / this.field_lb) + 256;
                if (var3 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            this.field_pb = fh.field_e;
            this.b(12 + this.field_sb.field_t, this.field_tb, this.field_nb + 12 - -this.field_sb.field_y, 194);
            this.field_ub.field_Q = 0;
            this.field_rb = 0;
            break L1;
          }
        }
        return super.h((byte) 47);
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 - -param1.field_y));
        try {
            this.field_mb = param3;
            this.field_lb = param3;
            this.field_nb = param2;
            this.field_tb = param4;
            this.a(param1, -29870);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 77) {
            this.field_pb = (i) null;
        }
        this.j(-109);
        return super.f((byte) 116);
    }

    static {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
