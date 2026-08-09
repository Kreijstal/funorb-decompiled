/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends f {
    static String field_e;
    private java.nio.ByteBuffer field_d;
    static java.awt.Canvas field_h;
    static String field_c;
    static int field_i;
    static boolean field_f;
    static rk field_g;

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_g = null;
              if (param0 == -115) {
                break L1;
              } else {
                field_g = (rk) null;
                break L1;
              }
            }
            field_e = null;
            field_h = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "ja.H(" + param0 + ')');
        }
    }

    final static void a(um param0, int param1) {
        RuntimeException runtimeException = null;
        ci var2 = null;
        ci var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            wk.field_g = wk.a(param0, 1, "display_name_changed", "basic");
            ea.field_bb = new ok(0L, cn.field_b, tn.field_l, ef.field_m);
            fg.field_d = new ok(0L, cn.field_b, d.field_Lb, vc.field_b);
            hb.field_a = new ci(0L, (ci) null);
            oj.field_c = new ci(0L, qn.field_P);
            oj.field_c.field_fb = param1;
            le.field_e = new ci(0L, bo.field_e, ei.field_s);
            kf.field_t = new ci(0L, l.field_j, hm.field_b);
            dk.field_h = new ci(0L, sj.field_k);
            hb.field_a.a((byte) 123, oj.field_c);
            hb.field_a.a((byte) 124, le.field_e);
            hb.field_a.a((byte) 123, kf.field_t);
            hb.field_a.a((byte) 125, ea.field_bb);
            hb.field_a.a((byte) 127, dk.field_h);
            ea.field_bb.field_Kb.field_Jb.a(qn.field_P, param1 + 2147483647);
            var2 = ea.field_bb.field_Kb.field_Jb;
            ea.field_bb.field_Kb.field_Jb.field_cb = 1;
            var2.field_fb = 1;
            fg.field_d.field_Kb.field_Jb.a(qn.field_P, -2147483648);
            var3 = fg.field_d.field_Kb.field_Jb;
            fg.field_d.field_Kb.field_Jb.field_cb = 1;
            var3.field_fb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ja.E(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new byte[this.field_d.capacity()];
              this.field_d.position(0);
              if (param0 == 438) {
                break L1;
              } else {
                this.field_d = (java.nio.ByteBuffer) null;
                break L1;
              }
            }
            this.field_d.get(var2);
            stackIn_4_0 = (byte[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2_ref), "ja.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ja() {
    }

    final void a(byte[] param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 199) {
                break L1;
              } else {
                ja.a((em) null, -70, (byte) -122, -75, true);
                break L1;
              }
            }
            this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_d.position(0);
            this.field_d.put(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ja.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(em param0, int param1, byte param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ql.a(-116, 3 * (-param3 + param1));
                        var6 = 3 * param3;
                        ki.a(0);
                        var7 = var5_int + -10;
                        if ((param0.field_j ^ -1) >= -1) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param0.field_y) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        dh.a((byte) 95);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        um.field_a = 0;
                        if (param2 < -67) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_f = false;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((param0.field_e ^ -1) >= (var8 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = param0.field_g[var8];
                        var10 = param0.field_A[var8];
                        var11 = param0.field_J[var8];
                        stackOut_13_0 = param4;
                        stackIn_55_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var19 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = qm.field_c[var9];
                        var13 = tc.field_w[var9];
                        var14 = qm.field_c[var10] - var12;
                        var15 = -var12 + qm.field_c[var11];
                        var16 = tc.field_w[var10] - var13;
                        var17 = -var13 + tc.field_w[var11];
                        if ((-(var16 * var15) + var14 * var17 ^ -1) > -1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = jd.field_i[var9];
                        if (-2147483648 == var12) {
                            statePc = 53;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = jd.field_i[var10];
                        if (2147483647 != (var13 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = jd.field_i[var11];
                        if (var14 != -2147483648) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = -var6 + (var12 - -var13 - -var14);
                        if (0 <= var7) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = var15 << -var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var15 >> var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var16 = -stackIn_34_0 + ge.field_eb.length + -1;
                        var17 = ge.field_eb[var16];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 == (var17 >> -936290236 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var16--;
                        stackIn_45_0 = 0;
                        stackIn_37_0 = stackIn_45_0;
                        stackIn_45_1 = var16;
                        stackIn_37_1 = stackIn_45_1;
                        if (var19 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 <= stackIn_37_1) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var17 = ge.field_eb[var16];
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = var17;
                        stackIn_45_1 = var16 << 375334340;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var18 = stackIn_45_0 + stackIn_45_1;
                        ve.field_Hb[var18] = var8;
                        ge.field_eb[var16] = var17 + 1;
                        if ((param0.field_j ^ -1) >= -1) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null != param0.field_y) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        dupTemp$0 = param0.field_y[var8];
                        lc.field_n[dupTemp$0] = lc.field_n[dupTemp$0] + 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        um.field_a = um.field_a + 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = param0.field_j;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 <= 0) {
                            statePc = 73;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param0.field_y != null) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((lc.field_n.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10 = lc.field_n[var9];
                        lc.field_n[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var19 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var5);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("ja.I(");
                    stackIn_69_1 = stackIn_71_1;
                    if (param0 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    throw fk.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jd a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jd[] var3 = null;
        int var4 = 0;
        jd var5 = null;
        int var6 = 0;
        jd stackIn_3_0 = null;
        jd stackIn_14_0 = null;
        jd stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var2 = kb.a(-2147483648, param1, "jagex-last-login-method");
            if (var2 != null) {
              L1: {
                if (param0 >= 126) {
                  break L1;
                } else {
                  ja.a((byte) 47, (java.applet.Applet) null);
                  break L1;
                }
              }
              var3 = hb.a(2);
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var4 ^ -1) <= (var3.length ^ -1)) {
                      break L4;
                    } else {
                      var5 = var3[var4];
                      stackIn_17_0 = (jd) (var5);

                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (!((jd) (Object) stackIn_17_0).a((byte) 111, var2)) {
                          var4++;
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_14_0 = (jd) (var5);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_17_0 = dn.field_f;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = dn.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("ja.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(long param0, String param1, byte param2, nb param3, int param4, ci param5, int[] param6, int param7, String param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ud.field_d = param3;
            pi.field_d = new dh(param5, param0, param8, param1, param7, param4, param6);
            var10_int = -39 % ((param2 - -30) / 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ja.F(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_22_2 + ')');
        }
    }

    static {
        field_e = "You must be a member to play with the current options.";
        field_c = "Lobby";
    }
}
