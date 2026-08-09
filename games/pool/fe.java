/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fe extends ei {
    static sj field_M;
    boolean field_G;
    private boolean field_F;
    static boolean field_J;
    static boolean[] field_H;
    static int[] field_L;
    boolean field_I;
    private boolean field_K;

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param3.getGraphics();
                sh.field_P.a(var4, param0, param1, -23820);
                var5 = 107 % ((-1 - param2) / 57);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref2);

            stackIn_6_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 16) {
            return;
        }
        if (null != this.field_t && this.field_t instanceof tb) {
            ((tb) ((Object) this.field_t)).a(true, param2, param3, (fe) (this), param1);
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        boolean stackIn_131_0 = false;
        int stackIn_150_0 = 0;
        vh stackIn_170_0 = null;
        vh stackIn_171_0 = null;
        vh stackIn_172_0 = null;
        vh stackIn_173_0 = null;
        vh stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        vh stackIn_175_0 = null;
        vh stackIn_176_0 = null;
        vh stackIn_177_0 = null;
        vh stackIn_178_0 = null;
        vh stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        vh stackIn_180_0 = null;
        vh stackIn_181_0 = null;
        vh stackIn_182_0 = null;
        vh stackIn_183_0 = null;
        vh stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        boolean stackOut_75_0;
        boolean stackOut_130_0;
        int statePc = 0;
        Throwable caughtException = null;
        vh var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        vh var6 = null;
        vh var7 = null;
        vh var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ko var17 = null;
        Object var18 = null;
        int var18_int = 0;
        im var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var23 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fr.a((byte) -58, nj.field_b);
                        if (null != em.field_L) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ok.field_ob.field_pb = true;
                        kc.field_b.field_Db = 0;
                        var5 = kc.field_b;
                        var5.field_gb = 0;
                        d.field_c.field_Db = 0;
                        var6 = d.field_c;
                        var6.field_gb = 0;
                        gi.field_o.field_Db = 0;
                        var7 = gi.field_o;
                        var7.field_gb = 0;
                        if (!cj.e((byte) 85)) {
                            statePc = 163;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ii.field_e.field_nb = rf.field_b.toUpperCase();
                        var9 = (2 + uq.field_f.field_gb) / 2;
                        kc.field_b.b(uq.field_f.field_Db + -40, 2147483647, 0, var9 - 2, 40);
                        if ((em.field_L.field_mc ^ -1) <= (em.field_L.field_Nb ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        kc.field_b.field_nb = v.field_d.toUpperCase();
                        kc.field_b.field_pb = true;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kc.field_b.field_nb = ro.field_p.toUpperCase();
                        kc.field_b.field_pb = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        kc.field_b.field_F = mg.field_c.field_F;
                        if (uf.field_jb > 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((uf.field_jb ^ -1) != -2) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_ref_String = lo.field_b;
                        if (var19 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_ref_String = nr.a(new String[]{Integer.toString(uf.field_jb)}, -1, hq.field_f);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 != (va.field_V & 16 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (nr.field_bb) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kc.field_b.field_F = mg.field_c.field_Gb;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref_String;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        d.field_c.b(uq.field_f.field_Db - 40, 2147483647, var9, -var9 + uq.field_f.field_gb, 40);
                        d.field_c.field_nb = ua.field_s.toUpperCase();
                        var8 = d.field_c;
                        stackIn_20_0 = d.field_c;
                        stackIn_18_0 = stackIn_20_0;
                        if (!param0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (vh) ((Object) stackIn_18_0);
                        stackIn_19_0 = stackIn_20_0;
                        if (fd.field_K != 0L) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = (vh) ((Object) stackIn_19_0);
                        stackIn_21_1 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (vh) ((Object) stackIn_20_0);
                        stackIn_21_1 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_21_0.field_pb = stackIn_21_1 != 0;
                        var10 = 2;
                        if (we.field_m != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null != dk.field_j) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        dk.field_j = new byte[dr.field_c];
                        gf.field_b = new boolean[dr.field_c];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var11 ^ -1) <= (dr.field_c ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        gf.field_b[var11] = false;
                        var11++;
                        if (var19 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var19 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var10 ^ -1) <= -3) {
                            statePc = 66;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = 0;
                        stackIn_67_0 = 0;
                        stackIn_34_0 = stackIn_67_0;
                        if (var19 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = stackIn_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var12;
                        stackIn_36_1 = we.field_m.length;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 >= stackIn_36_1) {
                            statePc = 62;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var23 = we.field_m[var12];
                        var21 = var23;
                        var20 = var21;
                        var13_ref_int__ = var20;
                        stackIn_63_0 = 0;
                        stackIn_38_0 = stackIn_63_0;
                        if (var19 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var14 = stackIn_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var23.length <= var14) {
                            statePc = 52;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var15 = var23[var14];
                        var16 = var20[1 + var14];
                        stackIn_53_0 = var15 ^ -1;
                        stackIn_41_0 = stackIn_53_0;
                        if (var19 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (0 == var10) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_45_0 = em.field_L.field_mc;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = em.field_L.field_Nb;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var17_int = stackIn_45_0;
                        if ((var17_int ^ -1) != (var16 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var16 != (em.field_L.field_tc[var15] & 255)) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var14 += 2;
                        if (var19 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = 1;
                        var14 = -1;
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = stackIn_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var23.length <= var15) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var16 = var23[var15];
                        stackIn_36_0 = var16 ^ -1;
                        stackIn_56_0 = stackIn_36_0;
                        stackIn_36_1 = var14 ^ -1;
                        stackIn_56_1 = stackIn_36_1;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 < stackIn_56_1) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var14 = var16;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var15 += 2;
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        gf.field_b[var14] = true;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12++;
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = var11;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10++;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = hq.field_i ^ -1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 > -3) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (!vj.field_c[12]) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var10 = 2;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var10 >= 2) {
                            statePc = 91;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        d.field_c.field_pb = false;
                        if (d.field_c.field_db) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var13 >= dr.field_c) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = gf.field_b[var13];
                        stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                        stackIn_76_0 = stackOut_75_0;
                        if (var19 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var22 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                        if (var11_ref != null) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var11_ref = var22;
                        if (var19 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var11_ref = (String) (var11_ref) + ", " + var22;
                        var12 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = -1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 != (var10 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var13_ref_String = ah.field_g;
                        if (var12 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var14_ref_String = nr.a(new String[]{(String) (var11_ref)}, -1, fm.field_J);
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var14_ref_String = ud.field_M + (String) (var11_ref);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var13_ref_String = aj.field_Rb;
                        if (var12 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var14_ref_String = ab.field_d + (String) (var11_ref);
                        if (var19 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var14_ref_String = nr.a(new String[]{(String) (var11_ref)}, -1, me.field_u);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        kk.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                        if (var19 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null != dl.field_j) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (null != ci.field_d) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (w.field_j != null) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (null != op.field_a) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((dr.field_c ^ -1) >= (var16 ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var17_int = em.field_L.field_tc[var16] & 255;
                        if (var19 != 0) {
                            statePc = 128;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (dl.field_j == null) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null != dl.field_j[var16]) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (dl.field_j[var16][var17_int]) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var11 = 1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (ci.field_d == null) {
                            statePc = 115;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (null != ci.field_d[var16]) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var18_int = ci.field_d[var16][var17_int];
                        if (var18_int > var13) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var13 = var18_int;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var18_int == 0) {
                            statePc = 115;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (!rg.field_s) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var11 = 1;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (op.field_a == null) {
                            statePc = 119;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (op.field_a[var16] != null) {
                            statePc = 118;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var15 = var15 | op.field_a[var16][var17_int];
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (null == w.field_j) {
                            statePc = 126;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (w.field_j[var16] == null) {
                            statePc = 126;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var18_int = w.field_j[var16][var17_int];
                        if (var18_int <= var14) {
                            statePc = 123;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var14 = var18_int;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (0 == var18_int) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (rg.field_s) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var11 = 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var16 = 0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var17 = wo.field_f.field_Rb.field_T;
                        var18_ref = (im) ((Object) var17.c((byte) 96));
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var18_ref == null) {
                            statePc = 149;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackOut_130_0 = var18_ref.c(true);
                        stackIn_150_0 = stackOut_130_0 ? 1 : 0;
                        stackIn_131_0 = stackOut_130_0;
                        if (var19 != 0) {
                            statePc = 150;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (!stackIn_131_0) {
                            statePc = 134;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var19 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var11 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var18_ref.field_Pb) {
                            statePc = 137;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if ((var13 ^ -1) < (var18_ref.field_Rb ^ -1)) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if ((var18_ref.field_Xb ^ -1) > (var14 ^ -1)) {
                            statePc = 142;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (0 < (var15 & (var18_ref.field_Nb ^ -1))) {
                            statePc = 145;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var12 == 0) {
                            statePc = 148;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var18_ref = (im) ((Object) var17.f((byte) -5));
                        if (var19 == 0) {
                            statePc = 129;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackIn_150_0 = hq.field_i;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (stackIn_150_0 < 2) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (vj.field_c[12]) {
                            statePc = 153;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var16 = 0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (var16 != 0) {
                            statePc = 156;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        d.field_c.field_pb = false;
                        if (d.field_c.field_db) {
                            statePc = 158;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if ((na.field_e.field_i.field_Mb ^ -1) == -1) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        kk.field_B = nr.a(new String[]{mm.field_l}, -1, t.field_c);
                        if (var19 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        kk.field_B = fn.field_Mb;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (var19 == 0) {
                            statePc = 164;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var9_ref_String = em.field_L.field_Ob;
                        ii.field_e.field_nb = nr.a(new String[]{var9_ref_String}, -1, th.field_c).toUpperCase();
                        gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
                        gi.field_o.field_nb = nr.a(new String[]{var9_ref_String}, -1, uh.field_s);
                        var8 = gi.field_o;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (-1L == (fd.field_K ^ -1L)) {
                            statePc = 168;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var9 = (int)(-rl.a((byte) -94) + fd.field_K);
                        var9 = (999 + var9) / 1000;
                        if ((var9 ^ -1) <= -2) {
                            statePc = 167;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var9 = 1;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var8.field_nb = nr.a(new String[]{Integer.toString(var9)}, -1, bl.field_v);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        nd.field_c.field_nb = nr.a(new String[]{Integer.toString(em.field_L.field_mc), Integer.toString(em.field_L.field_Nb)}, -1, qa.field_o);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackIn_173_0 = so.field_k;
                        stackIn_170_0 = stackIn_173_0;
                        if (!param2) {
                            statePc = 173;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackIn_173_0 = (vh) ((Object) stackIn_170_0);
                        stackIn_171_0 = stackIn_173_0;
                        if (param1) {
                            statePc = 173;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        stackIn_173_0 = (vh) ((Object) stackIn_171_0);
                        stackIn_172_0 = stackIn_173_0;
                        if (nr.field_bb) {
                            statePc = 173;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_174_0 = (vh) ((Object) stackIn_172_0);
                        stackIn_174_1 = 1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_174_0 = (vh) ((Object) stackIn_173_0);
                        stackIn_174_1 = 0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        ((vh) (Object) stackIn_174_0).a(stackIn_174_1 != 0, false);
                        stackIn_178_0 = uq.field_f;
                        stackIn_175_0 = stackIn_178_0;
                        if (!param2) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackIn_178_0 = (vh) ((Object) stackIn_175_0);
                        stackIn_176_0 = stackIn_178_0;
                        if (param1) {
                            statePc = 178;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackIn_178_0 = (vh) ((Object) stackIn_176_0);
                        stackIn_177_0 = stackIn_178_0;
                        if (nr.field_bb) {
                            statePc = 178;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackIn_179_0 = (vh) ((Object) stackIn_177_0);
                        stackIn_179_1 = 1;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackIn_179_0 = (vh) ((Object) stackIn_178_0);
                        stackIn_179_1 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        ((vh) (Object) stackIn_179_0).a(stackIn_179_1 != 0, false);
                        var5_int = 92 / ((0 - param3) / 63);
                        stackIn_183_0 = de.field_b;
                        stackIn_180_0 = stackIn_183_0;
                        if (!param2) {
                            statePc = 183;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackIn_183_0 = (vh) ((Object) stackIn_180_0);
                        stackIn_181_0 = stackIn_183_0;
                        if (param1) {
                            statePc = 183;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackIn_183_0 = (vh) ((Object) stackIn_181_0);
                        stackIn_182_0 = stackIn_183_0;
                        if (!nr.field_bb) {
                            statePc = 183;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackIn_184_0 = (vh) ((Object) stackIn_182_0);
                        stackIn_184_1 = 1;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_184_0 = (vh) ((Object) stackIn_183_0);
                        stackIn_184_1 = 0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        ((vh) (Object) stackIn_184_0).a(stackIn_184_1 != 0, false);
                        na.field_e.field_i.c(true);
                        if (null != em.field_L) {
                            statePc = 186;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (ok.field_ob.field_R == 0) {
                            statePc = 188;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        nf.a(em.field_L.g(20872), true, param4);
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (kc.field_b.field_R != 0) {
                            statePc = 190;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        nr.field_bb = true;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if ((d.field_c.field_R ^ -1) != -1) {
                            statePc = 193;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        em.field_N = true;
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (ba.field_vb.field_R != 0) {
                            statePc = 196;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        nr.field_bb = false;
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        tl.a(param4, em.field_L, 0, false);
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 199: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    throw wm.a((Throwable) ((Object) var5_ref), "fe.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 200: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -13671) {
                break L1;
              } else {
                fe.a((int[]) null, 103, 77);
                break L1;
              }
            }
            L2: {
              if (-1 == (param0[param2 >> 56584869] & 1 << (param2 & 31) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fe.BA(");

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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void d(byte param0) {
        if (param0 != 99) {
            field_J = true;
        }
        if (!(!this.field_K)) {
            this.field_K = false;
            if (this.field_t != null) {
                if (!(!(this.field_t instanceof ik))) {
                    ((ik) ((Object) this.field_t)).a(param0 ^ 17634, this.field_K, (ei) (this));
                }
            }
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (this.field_n == 0) {
                  break L2;
                } else {
                  if ((cd.field_b ^ -1) != (this.field_n ^ -1)) {
                    L3: {
                      if (!this.a(param2, param3, wn.field_i, -1, gg.field_f)) {
                        break L3;
                      } else {
                        if ((cd.field_b ^ -1) == -1) {
                          this.a(16, -param2 + wn.field_i, -param3 + gg.field_f, this.field_n);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("fe.S(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              if (!this.d(73)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (-85 == (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (-84 == (param1 ^ -1)) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                this.a(16, -1, -1, 1);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("fe.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final boolean d(int param0) {
        int var2 = 81 % ((param0 - 7) / 48);
        return this.field_K;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              L1: {
                if (!this.field_I) {
                  break L1;
                } else {
                  if (!this.a(param1, param5, param6, -1, param4)) {
                    break L1;
                  } else {
                    L2: {
                      this.a(param0, (byte) 122);
                      this.field_n = param3;
                      if (this.field_t == null) {
                        break L2;
                      } else {
                        if (!(this.field_t instanceof bn)) {
                          break L2;
                        } else {
                          ((bn) ((Object) this.field_t)).a((byte) -123, param5, (fe) (this), param1, param3, param6, param4);
                          break L2;
                        }
                      }
                    }
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("fe.AA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        boolean stackIn_8_0 = false;
        String stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        var5 = Pool.field_O;
        try {
          L0: {
            var3 = up.a(param0, param2, (byte) 117);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param2.length() <= var4) {
                      break L3;
                    } else {
                      stackOut_7_0 = uc.a(param2.charAt(var4), (byte) -51);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_8_0) {
                          stackIn_11_0 = iq.field_g;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = param1;
                  break L2;
                }
                if (stackIn_14_0 <= 66) {
                  fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("fe.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return (String) ((Object) stackIn_17_0);
          }
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.b(param1, param2, param0, -1)) {
                break L1;
              } else {
                L2: {
                  this.a(1, param2, param0, param1);
                  if (this.field_G) {
                    discarded$2 = param0.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (this.field_I) {
                  break L1;
                } else {
                  discarded$3 = param0.append(" disabled");
                  break L1;
                }
              }
            }
            if (param3 > 13) {
              stackIn_10_0 = (StringBuilder) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("fe.EA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        if (param0 != 72) {
            field_J = false;
        }
        field_H = null;
        field_M = null;
    }

    fe(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_I) {
                break L1;
              } else {
                if (!this.field_F) {
                  break L1;
                } else {
                  L2: {
                    param0.d((byte) 99);
                    this.field_K = true;
                    if (this.field_t == null) {
                      break L2;
                    } else {
                      if (!(this.field_t instanceof ik)) {
                        break L2;
                      } else {
                        ((ik) ((Object) this.field_t)).a(17537, this.field_K, (ei) (this));
                        break L2;
                      }
                    }
                  }
                  var3_int = 113 % ((param1 - -43) / 47);
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fe.M(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    fe(String param0, fp param1, cc param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_F = true;
        this.field_K = false;
    }

    protected fe() {
        this.field_I = true;
        this.field_F = true;
        this.field_K = false;
        this.field_z = db.field_Sb.field_k;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
            if (null != this.field_t) {
                if (!(!(this.field_t instanceof bn))) {
                    ((bn) ((Object) this.field_t)).a(param3, (fe) (this), param2, param0, -116, param1);
                }
            }
            if (param4 <= 62) {
                this.a((ei) null, -88, true, 21, -27, 5, -59);
            }
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "fe.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new boolean[64];
        field_L = new int[8192];
        field_J = true;
    }
}
