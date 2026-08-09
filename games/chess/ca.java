/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ca {
    static int[] field_i;
    static km field_a;
    static int field_j;
    static um field_b;
    static tk field_h;
    static String field_e;
    static String field_f;
    static String field_c;
    static ci field_g;
    static String field_d;

    final static void a(int param0, byte param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              qb.field_b = param2;
              if (param1 == 107) {
                break L1;
              } else {
                ca.a(-24);
                break L1;
              }
            }
            ni.field_d = param0;
            cm.field_w = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "ca.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            a.a(102, (java.awt.Component) ((Object) param1));
            if (param0 == 13369344) {
              L1: {
                he.a(-108, (java.awt.Component) ((Object) param1));
                if (null == ii.field_L) {
                  break L1;
                } else {
                  ii.field_L.a((byte) 123, (java.awt.Component) ((Object) param1));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ca.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13421568) {
                break L1;
              } else {
                field_j = 38;
                break L1;
              }
            }
            stackIn_4_0 = 1900 + new Date().getYear();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "ca.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            field_f = null;
            int var1_int = -48 % ((param0 - -33) / 52);
            field_a = null;
            field_i = null;
            field_e = null;
            field_g = null;
            field_d = null;
            field_h = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ca.F(" + param0 + ')');
        }
    }

    final static ve a(boolean param0, int param1, int param2) {
        nb stackIn_2_0 = null;
        nb stackIn_4_0 = null;
        nb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ci stackIn_44_0 = null;
        ci stackIn_46_0 = null;
        ci stackIn_47_0 = null;
        String stackIn_47_1 = null;
        ci stackIn_48_0 = null;
        ci stackIn_50_0 = null;
        ci stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_104_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jc var4 = null;
        Object var5 = null;
        Object var6 = null;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dh var17 = null;
        String var18 = null;
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
                        stackIn_4_0 = ea.field_bb.field_Kb;
                        stackIn_2_0 = stackIn_4_0;
                        if (ud.field_d != ea.field_bb.field_Kb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (nb) ((Object) stackIn_2_0);
                        stackIn_5_1 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (nb) ((Object) stackIn_4_0);
                        stackIn_5_1 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((nb) (Object) stackIn_5_0).a(stackIn_5_1 != 0, param0, 2, param1 * (fe.field_g - -2) * 3, 2 + fe.field_g, 0) ? 1 : 0;
                        var4 = ea.field_bb.field_Fb.field_I;
                        var5 = null;
                        if (param2 <= -94) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_c = (String) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (2 == ld.field_g) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        hb.field_a.field_tb = false;
                        oj.field_c.field_db = m.field_c;
                        if (ld.field_g != 1) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ea.field_bb.field_Kb.field_Jb.field_db = ch.field_db;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ea.field_bb.field_Kb.field_Jb.field_db = field_c;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        fm.a(ea.field_bb.field_Fb, -123);
                        if (var19 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        hb.field_a.field_tb = true;
                        oj.field_c.field_db = oc.a(gf.field_g, new String[]{f.field_a}, (byte) -59);
                        ea.field_bb.field_Kb.field_Jb.field_db = null;
                        var6 = null;
                        var7 = (ve) ((Object) var4.g(-18110));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
                            statePc = 94;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null != var7.field_I) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7.field_Mb = new ci(0L, hg.field_f);
                        var7.a((byte) 127, var7.field_Mb);
                        var7.field_Jb = new ci(0L, sk.field_v);
                        var7.a((byte) 127, var7.field_Jb);
                        var7.field_Eb = new ci(0L, hg.field_f);
                        var7.a((byte) 123, var7.field_Eb);
                        var7.field_Jb.field_fb = 2;
                        var7.h(0);
                        var8 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7.field_M = ea.field_bb.field_Fb.field_M;
                        var9 = 0;
                        if (null == var7.field_Lb) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (f.field_a == var7.field_Lb) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 16737894;
                        var10 = 13369344;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = 0;
                        if (null == var7.field_Ob) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var7.field_Ob.equals("")) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_Eb.field_jb = wk.field_g;
                        var7.field_Eb.field_O = var11;
                        var12 = 1;
                        var7.field_Eb.a(0, 3 + wk.field_g.field_v, -2147483648, fe.field_g, var9);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7.field_Jb.field_ib = var10;
                        var7.field_Mb.field_ib = var10;
                        var7.field_Jb.field_T = var11;
                        var7.field_Mb.field_T = var11;
                        var7.field_Jb.field_P = var11;
                        var7.field_Mb.field_P = var11;
                        var7.field_Jb.field_O = var11;
                        var7.field_Mb.field_O = var11;
                        var13 = 0;
                        var14 = var7.field_M - 82;
                        if (var12 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var13 = 3 + wk.field_g.field_v;
                        var14 = var14 - var13;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = var7.field_Mb;
                        stackIn_44_0 = stackIn_46_0;
                        if (-1 > (var14 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_47_0 = (ci) ((Object) stackIn_44_0);
                        stackIn_47_1 = var7.field_Fb;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = (ci) ((Object) stackIn_46_0);
                        stackIn_47_1 = lh.a(var7.field_Mb.field_xb, var7.field_Fb, var14);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_47_0.field_db = stackIn_47_1;
                        var7.field_Mb.a(var13, var14, -2147483648, fe.field_g, var9);
                        stackIn_50_0 = var7.field_Jb;
                        stackIn_48_0 = stackIn_50_0;
                        if (var7.field_Lb == null) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_51_0 = (ci) ((Object) stackIn_48_0);
                        stackIn_51_1 = var7.field_Lb;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = (ci) ((Object) stackIn_50_0);
                        stackIn_51_1 = ba.field_M;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_51_0.field_db = stackIn_51_1;
                        var7.field_Jb.a(var7.field_M + -80, 80, -2147483648, fe.field_g, var9);
                        if (var7.field_Mb.field_db.equals(var7.field_Fb)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_55_0 = 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var15 = stackIn_55_0;
                        var9 = var9 + fe.field_g;
                        if (var3_int != 0) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7.field_N = var9 - var7.field_pb;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ea.field_bb.field_Fb.a(true, (ci) (var6), 2, var7);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var7.field_Eb == null) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var7.field_Eb.field_F) {
                            statePc = 91;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var7.field_L ^ -1) == -1) {
                            statePc = 82;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var16 = var7.field_Fb;
                        ja.a(0L, (String) null, (byte) 68, ea.field_bb.field_Kb, -1, var7, (int[]) null, -1, var16);
                        if (var7.field_Lb == null) {
                            statePc = 81;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (am.a(false, pi.field_d.field_i)) {
                            statePc = 81;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!qf.field_b) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (kh.field_o) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var17 = pi.field_d;
                        var18 = oc.a(bc.field_c, new String[]{var16}, (byte) -97);
                        var17.field_b.a((byte) -12, var18, 8);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var17 = pi.field_d;
                        var18 = oc.a(nd.field_b, new String[]{var16}, (byte) -107);
                        var17.field_b.a((byte) -12, var18, 18);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var5 = var7;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (!var7.field_Mb.field_F) {
                            statePc = 93;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var15 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        pc.field_Mb = var7.field_Fb;
                        if (var19 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        pc.field_Mb = var7.field_Ob;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var6 = var7;
                        var7 = (ve) ((Object) var4.a((byte) -120));
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (0 != ea.field_bb.field_Hb.field_L) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        me.field_a = new kd(ea.field_bb.field_Hb.field_U, ea.field_bb.field_Hb.field_wb, ea.field_bb.field_Hb.field_M, ea.field_bb.field_Hb.field_pb, oc.field_r, od.field_V, qn.field_P, qn.field_P);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        pk.field_b = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (ea.field_bb.field_Mb.field_L != 0) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        me.field_a = new kd(ea.field_bb.field_Mb.field_U, ea.field_bb.field_Mb.field_wb, ea.field_bb.field_Mb.field_M, ea.field_bb.field_Mb.field_pb, a.field_i, od.field_V, qn.field_P, qn.field_P);
                        pk.field_b = 1;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackIn_104_0 = var5;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    return (ve) ((Object) stackIn_104_0);
                }
                case 105: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fk.a((Throwable) ((Object) var3), "ca.A(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, km[] param3, byte param4, int param5, int param6, km[] param7, String param8, int param9, int param10, lh param11, boolean param12, int param13, boolean param14) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          L0: {
            L1: {
              if (param4 == 113) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            rh.a(cm.field_w, param9, param11, param1, param13, param1, param6, o.field_f, new le(param7), param2, de.field_c, new le(param3), param10, param2, qb.field_b, param11, ni.field_d, (byte) -123, param5, bb.field_b);
            cg.a((byte) -25, param8, param0, param14, param12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var15);

            stackIn_8_1 = new StringBuilder().append("ca.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param8 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
        field_e = "Next";
        field_c = "Loading...";
        field_f = "Try changing the following settings:  ";
        field_h = new tk();
        field_d = "Achieved";
    }
}
