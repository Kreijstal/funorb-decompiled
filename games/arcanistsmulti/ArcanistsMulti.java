/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class ArcanistsMulti extends ud {
    static String field_H;
    static String field_F;
    public static boolean field_G;

    final static boolean i(byte param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -45) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              L3: {
                int discarded$2 = 112;
                if (lc.a()) {
                  break L3;
                } else {
                  if (ah.field_c > 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ArcanistsMulti.PA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 115 / ((param0 - -83) / 41);
              sb.a(8000);
              if (null == ka.field_m) {
                break L1;
              } else {
                int discarded$4 = 6;
                u.b();
                break L1;
              }
            }
            int discarded$5 = 0;
            hg.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.G(" + param0 + ')');
        }
    }

    private final void e() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == va.field_c) {
                break L1;
              } else {
                int discarded$2 = 22;
                rg.a(va.field_c);
                va.field_c = null;
                bk.a(2);
                break L1;
              }
            }
            hb.field_Fb = sd.a(6, (byte) 62);
            ue.field_d = sd.a(1, (byte) 23);
            so.field_k = sd.a(7, (byte) 11);
            vg.field_l = sd.a(2, (byte) 55);
            mg.field_E = sd.a(3, (byte) 36);
            ki.field_s = sd.a(4, (byte) 123);
            tc.field_x = sd.a(5, (byte) 121);
            ck.field_b = sd.a(10, (byte) 6);
            wh.field_l = sd.a(12, (byte) 49);
            ua.field_K = sd.a(13, (byte) 27);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.LA(" + true + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var2 = param0.getParameter("username");
              if (null == var2) {
                break L1;
              } else {
                int discarded$3 = 0;
                if (be.a((CharSequence) (Object) var2) == 0L) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == -1) {
                      break L2;
                    } else {
                      field_F = null;
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("ArcanistsMulti.VA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        int[][] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        le var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_99_0 = false;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        boolean stackIn_139_0 = false;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_180_0 = 0;
        int[] stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_183_2 = 0;
        int stackIn_183_3 = 0;
        int[] stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        int[] stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int[] stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        int[] stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        boolean[] stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        boolean[] stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        boolean[] stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        int stackIn_197_2 = 0;
        int stackIn_209_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        Throwable caughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_98_0 = false;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        boolean stackOut_138_0 = false;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_170_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_179_0 = 0;
        int[] stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        int stackOut_182_2 = 0;
        int stackOut_182_3 = 0;
        int[] stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        int[] stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int[] stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_189_2 = 0;
        int[] stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        boolean[] stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        boolean[] stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        int stackOut_194_2 = 0;
        boolean[] stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        int stackOut_196_2 = 0;
        int stackOut_208_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_262_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    int discarded$38 = be.a(1497225488);
                    hk.field_o = ao.a(true);
                    int discarded$39 = 200;
                    mo.e();
                    if (null == ka.field_m) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!ka.field_m.field_e) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    int discarded$40 = 6;
                    u.b();
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (null == ka.field_m) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = this;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 1;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_11_2 = stackOut_8_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = this;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    ((ArcanistsMulti) this).a(stackIn_11_1 != 0, stackIn_11_2 != 0);
                    an.field_j = ce.field_m.field_m;
                    an.field_f = ce.field_m.field_e;
                    bi.field_I = (an.field_f + -640) / 2;
                    uc.field_a = (-480 + an.field_j) / 2;
                    if (ja.field_y) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$41 = 1;
                    this.e();
                    ja.field_y = false;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    jb.field_v = jb.field_v + 1;
                    if (!oc.a(-15576)) {
                        statePc = 26;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((ArcanistsMulti) this).d(-107);
                    if (!oc.a(-15576)) {
                        statePc = 26;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (ue.a(123)) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    boolean discarded$42 = this.a(123, false);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    if (!ue.field_e) {
                        statePc = 82;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (!hn.a((byte) -52)) {
                        statePc = 79;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (rc.b(-1)) {
                        statePc = 53;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    int discarded$43 = -5;
                    if (!um.a()) {
                        statePc = 50;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (~ii.field_c != ~ii.field_a) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    int discarded$44 = -3;
                    var2_int = we.b();
                    if (1 != var2_int) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (si.field_g != 0) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    pi.field_c = true;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    ul.a(ud.field_o, (byte) -98, 0);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    this.a((byte) -89, true);
                    if (var27 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.a((byte) -89, false);
                    if (var27 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.a((byte) -89, false);
                    if (var27 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (ka.field_m == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = 1;
                    stackIn_59_0 = stackOut_56_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = 0;
                    stackIn_59_0 = stackOut_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var2_int = ka.a(stackIn_59_0 != 0, (byte) 22, (ud) this);
                    if (2364824 == var2_int) {
                        statePc = 76;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (1 == var2_int) {
                        statePc = 68;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (2 == var2_int) {
                        statePc = 68;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (ka.field_m != null) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    int discarded$45 = 6;
                    u.b();
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (2 == var2_int) {
                        statePc = 75;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 75: {
                    im.a((byte) 75, cd.e(123));
                    if (var27 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    int discarded$46 = 5623;
                    ao.a();
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    this.a((byte) -89, true);
                    if (var27 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    int discarded$47 = 0;
                    rn.m();
                    if (var27 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ia.a(-14296, wn.field_y);
                    if (!this.a(-109, true)) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ue.field_e = true;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    int discarded$48 = 112;
                    if (!lc.a()) {
                        statePc = 90;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var2 = (Object) (Object) (cm) (Object) wh.field_h.c(true);
                    if (null != var2) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (var27 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    int discarded$49 = 4;
                    int discarded$50 = 118;
                    ld.a((cm) var2);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var27 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = am.a((byte) 26, di.field_n);
                    stackIn_99_0 = stackOut_98_0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (!stackIn_99_0) {
                        statePc = 262;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = ~on.field_g;
                    stackOut_100_1 = -78;
                    stackIn_263_0 = stackOut_100_0;
                    stackIn_263_1 = stackOut_100_1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    if (var27 != 0) {
                        statePc = 263;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 != stackIn_101_1) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    dg.field_s = true;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (79 == on.field_g) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    bc.field_b = df.field_z.e((byte) 100);
                    mf.field_a = df.field_z.e((byte) 50);
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (on.field_g == 9) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    int discarded$51 = 80;
                    lf.a();
                    kh.field_b = false;
                    mn.field_r = 9;
                    jm.field_b = df.field_z.l(-1);
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (on.field_g == 14) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    int discarded$52 = 80;
                    lf.a();
                    int discarded$53 = -125;
                    jn.a(150, dn.f((byte) -112), -13173, ql.a(1), li.field_E, wk.f(), 1024, wh.a(1000, 678231216), wh.a(6, 678231216), jk.field_a.length);
                    int discarded$54 = 115;
                    ra.a(v.b(), 64, pa.c((byte) -122));
                    mn.field_r = -2;
                    wa.field_Ob = true;
                    kh.field_b = false;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (15 != on.field_g) {
                        statePc = 127;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (wa.field_Ob) {
                        statePc = 125;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 125: {
                    int discarded$55 = 80;
                    lf.a();
                    ho.a(0);
                    int discarded$56 = 1;
                    cn.c();
                    hi.field_a = false;
                    wa.field_Ob = false;
                    mj.field_w = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    io.field_A = false;
                    mn.field_r = 0;
                    int discarded$57 = -50;
                    bc.a();
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    kh.field_b = false;
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (on.field_g != 10) {
                        statePc = 134;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (!wa.field_Ob) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    int discarded$58 = -108;
                    u.a();
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (73 != on.field_g) {
                        statePc = 153;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var2_int = df.field_z.e((byte) -122);
                    var3_ref_int__ = new int[var2_int];
                    var4 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackOut_136_0 = var2_int;
                    stackOut_136_1 = var4;
                    stackIn_137_0 = stackOut_136_0;
                    stackIn_137_1 = stackOut_136_1;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (stackIn_137_0 <= stackIn_137_1) {
                        statePc = 152;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var3_ref_int__[var4] = df.field_z.d(-10674);
                    var3_ref_int__[var4] = dg.a(var3_ref_int__[var4], ~ad.field_f[var4]);
                    stackOut_138_0 = pe.field_Jb;
                    stackIn_99_0 = stackOut_138_0;
                    stackIn_139_0 = stackOut_138_0;
                    if (var27 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (!stackIn_139_0) {
                        statePc = 151;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var5 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var5 >= 32) {
                        statePc = 151;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var6 = 1 << var5;
                    stackOut_142_0 = -96;
                    stackOut_142_1 = ~(var5 - -(32 * var4));
                    stackIn_137_0 = stackOut_142_0;
                    stackIn_137_1 = stackOut_142_1;
                    stackIn_143_0 = stackOut_142_0;
                    stackIn_143_1 = stackOut_142_1;
                    if (var27 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 >= stackIn_143_1) {
                        statePc = 150;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((var6 & var3_ref_int__[var4]) != 0) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    b.field_a.b((pg) (Object) new qa(32 * var4 + var5), -1);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var5++;
                    if (var27 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    ad.field_f[var4] = fj.b(ad.field_f[var4], var3_ref_int__[var4]);
                    var4++;
                    if (var27 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (on.field_g == 74) {
                        statePc = 156;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 156: {
                    int discarded$59 = 1;
                    if (td.e()) {
                        statePc = 160;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    jf.field_j = df.field_z.n(-98);
                    cb.field_e = df.field_z.c(-943038560);
                    ad.field_d = df.field_z.e((byte) -100);
                    if (var27 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var2_int = df.field_z.n(-98);
                    var3_long = df.field_z.c(-943038560);
                    ad.field_d = df.field_z.e((byte) 62);
                    if (~var2_int >= ~jf.field_j) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    jf.field_j = var2_int;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    cb.field_e = cb.field_e | var3_long;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    ua.field_P = md.a(false, cb.field_e);
                    nm.field_h = -1;
                    la.field_a = true;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (on.field_g == 57) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (on.field_g != 58) {
                        statePc = 234;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    int discarded$60 = 80;
                    lf.a();
                    var2_int = df.field_z.e((byte) -124);
                    var3 = df.field_z.e((byte) -101);
                    if (0 == df.field_z.e((byte) 106)) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackOut_170_0 = 1;
                    stackIn_173_0 = stackOut_170_0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 172: {
                    stackOut_172_0 = 0;
                    stackIn_173_0 = stackOut_172_0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    var4 = stackIn_173_0;
                    if (df.field_z.e((byte) 111) == 0) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = 1;
                    stackIn_177_0 = stackOut_174_0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackOut_176_0 = 0;
                    stackIn_177_0 = stackOut_176_0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    var5 = stackIn_177_0;
                    var6 = df.field_z.n(-98);
                    var7 = new String[df.field_z.e((byte) 115)];
                    var8 = -2;
                    var8 = df.field_z.o(6);
                    var9 = new int[var7.length][18];
                    var10 = new int[var7.length][16];
                    var11 = new int[var7.length];
                    var12 = new boolean[var7.length];
                    var13 = 0;
                    var14 = 0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (var7.length <= var14) {
                        statePc = 208;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var7[var14] = df.field_z.e(-32461);
                    stackOut_179_0 = 0;
                    stackIn_209_0 = stackOut_179_0;
                    stackIn_180_0 = stackOut_179_0;
                    if (var27 != 0) {
                        statePc = 209;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var15 = stackIn_180_0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var15 >= 18) {
                        statePc = 185;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackOut_182_0 = var9[var14];
                    stackOut_182_1 = var15;
                    stackOut_182_2 = df.field_z.e((byte) -88);
                    stackOut_182_3 = 255;
                    stackIn_183_0 = stackOut_182_0;
                    stackIn_183_1 = stackOut_182_1;
                    stackIn_183_2 = stackOut_182_2;
                    stackIn_183_3 = stackOut_182_3;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    stackIn_183_0[stackIn_183_1] = dg.a(stackIn_183_2, stackIn_183_3);
                    var15++;
                    if (var27 != 0) {
                        statePc = 186;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var27 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var15 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var15 >= 16) {
                        statePc = 193;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var16 = df.field_z.e((byte) 109) & 255;
                    stackOut_187_0 = var10[var14];
                    stackOut_187_1 = var15;
                    stackOut_187_2 = -256;
                    stackOut_187_3 = ~var16;
                    stackIn_183_0 = stackOut_187_0;
                    stackIn_183_1 = stackOut_187_1;
                    stackIn_183_2 = stackOut_187_2;
                    stackIn_183_3 = stackOut_187_3;
                    stackIn_188_0 = stackOut_187_0;
                    stackIn_188_1 = stackOut_187_1;
                    stackIn_188_2 = stackOut_187_2;
                    stackIn_188_3 = stackOut_187_3;
                    if (var27 != 0) {
                        statePc = 183;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackOut_188_0 = (int[]) (Object) stackIn_188_0;
                    stackOut_188_1 = stackIn_188_1;
                    stackIn_191_0 = stackOut_188_0;
                    stackIn_191_1 = stackOut_188_1;
                    stackIn_189_0 = stackOut_188_0;
                    stackIn_189_1 = stackOut_188_1;
                    if (stackIn_188_2 == stackIn_188_3) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackOut_189_0 = (int[]) (Object) stackIn_189_0;
                    stackOut_189_1 = stackIn_189_1;
                    stackOut_189_2 = var16;
                    stackIn_192_0 = stackOut_189_0;
                    stackIn_192_1 = stackOut_189_1;
                    stackIn_192_2 = stackOut_189_2;
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    stackOut_191_0 = (int[]) (Object) stackIn_191_0;
                    stackOut_191_1 = stackIn_191_1;
                    stackOut_191_2 = -1;
                    stackIn_192_0 = stackOut_191_0;
                    stackIn_192_1 = stackOut_191_1;
                    stackIn_192_2 = stackOut_191_2;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_192_0[stackIn_192_1] = stackIn_192_2;
                    var15++;
                    if (var27 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var11[var14] = df.field_z.e((byte) 76);
                    stackOut_193_0 = (boolean[]) var12;
                    stackOut_193_1 = var14;
                    stackIn_196_0 = stackOut_193_0;
                    stackIn_196_1 = stackOut_193_1;
                    stackIn_194_0 = stackOut_193_0;
                    stackIn_194_1 = stackOut_193_1;
                    if (df.field_z.e((byte) 123) != 1) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    stackOut_194_0 = (boolean[]) (Object) stackIn_194_0;
                    stackOut_194_1 = stackIn_194_1;
                    stackOut_194_2 = 1;
                    stackIn_197_0 = stackOut_194_0;
                    stackIn_197_1 = stackOut_194_1;
                    stackIn_197_2 = stackOut_194_2;
                    statePc = 197;
                    continue stateLoop;
                }
                case 196: {
                    stackOut_196_0 = (boolean[]) (Object) stackIn_196_0;
                    stackOut_196_1 = stackIn_196_1;
                    stackOut_196_2 = 0;
                    stackIn_197_0 = stackOut_196_0;
                    stackIn_197_1 = stackOut_196_1;
                    stackIn_197_2 = stackOut_196_2;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    stackIn_197_0[stackIn_197_1] = stackIn_197_2 != 0;
                    if (var12[var14]) {
                        statePc = 200;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (0 != var10[var14][0]) {
                        statePc = 207;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var10[var14][11] == 11) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var9[var14][12] = 28;
                    var9[var14][13] = 0;
                    var9[var14][14] = 29;
                    var9[var14][15] = 33;
                    var9[var14][16] = 47;
                    var9[var14][17] = 50;
                    var9[var14][0] = 204;
                    var9[var14][1] = 170;
                    var9[var14][2] = 238;
                    var9[var14][3] = 255;
                    var9[var14][4] = 192;
                    var9[var14][5] = 255;
                    var9[var14][6] = 32;
                    var9[var14][7] = 32;
                    var9[var14][8] = 32;
                    var9[var14][9] = 128;
                    var9[var14][10] = 64;
                    var9[var14][11] = 128;
                    var13 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    var14++;
                    if (var27 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var14 = df.field_z.d(-10674);
                    stackOut_208_0 = df.field_z.e((byte) -118);
                    stackIn_209_0 = stackOut_208_0;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    var15 = stackIn_209_0;
                    if ((var15 & 128) == 0) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = 1;
                    stackIn_213_0 = stackOut_210_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 212: {
                    stackOut_212_0 = 0;
                    stackIn_213_0 = stackOut_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    var16 = stackIn_213_0;
                    r.field_b = null;
                    var15 = var15 & 127;
                    jb.field_z = null;
                    System.gc();
                    var17 = new le(true, var2_int, var3, var4 != 0, var7, var8, var9, var10, var11, var14, var15, var5 != 0, var6, var12);
                    int discarded$61 = 3;
                    mi.a(jh.field_c[var17.field_V.a(-31497) + 1]);
                    var17.m(413355681);
                    if (var13 != 0) {
                        statePc = 216;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var18 = ij.field_Tb.field_A.length;
                    var19 = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (var19 >= var18) {
                        statePc = 222;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var20 = ij.field_Tb.field_A[var19];
                    var21 = (var20 & 16711680) >> 16;
                    var22 = var20 >> 8 & 255;
                    var23 = 255 & var20;
                    var24 = (var21 + var22) / 2;
                    var25 = (var23 + var21) / 2;
                    var26 = (var22 - -var23) / 2;
                    ij.field_Tb.field_A[var19] = (var25 << 8) + ((var24 << 16) + var26);
                    var19++;
                    if (var27 != 0) {
                        statePc = 228;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (var27 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (on.field_g == 57) {
                        statePc = 226;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    r.field_b = var17;
                    mj.field_w = true;
                    if (var27 == 0) {
                        statePc = 229;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    jb.field_z = var17;
                    hi.field_a = true;
                    int discarded$62 = -3;
                    jg.a();
                    int discarded$63 = 121;
                    jk.a();
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    int discarded$64 = -53;
                    sc.i();
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (var16 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    stackOut_230_0 = -1;
                    stackIn_233_0 = stackOut_230_0;
                    statePc = 233;
                    continue stateLoop;
                }
                case 232: {
                    stackOut_232_0 = 5;
                    stackIn_233_0 = stackOut_232_0;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    mn.field_r = stackIn_233_0;
                    io.field_A = true;
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (on.field_g == 59) {
                        statePc = 237;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (hi.field_a) {
                        statePc = 241;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (!mj.field_w) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    int discarded$65 = 80;
                    lf.a();
                    if (!hi.field_a) {
                        statePc = 249;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (jb.field_z == null) {
                        statePc = 249;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    jb.field_z.a(-112, false);
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    fi.field_h = true;
                    hi.field_a = false;
                    mj.field_w = false;
                    io.field_A = false;
                    mn.field_r = -2;
                    ao.field_d = true;
                    vh.field_t = 0;
                    int discarded$66 = -50;
                    bc.a();
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    oc.field_g = false;
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var2 = null;
                    if (!hi.field_a) {
                        statePc = 253;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var2 = (Object) (Object) jb.field_z;
                    statePc = 257;
                    continue stateLoop;
                }
                case 253: {
                    if (mj.field_w) {
                        statePc = 256;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var2 = (Object) (Object) r.field_b;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (null == var2) {
                        statePc = 261;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (((le) var2).e((byte) -78)) {
                        statePc = 98;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    ((ArcanistsMulti) this).g(-24);
                    if (var27 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    stackOut_262_0 = -27;
                    stackOut_262_1 = (0 - param0) / 36;
                    stackIn_263_0 = stackOut_262_0;
                    stackIn_263_1 = stackOut_262_1;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    var2_int = stackIn_263_0 % stackIn_263_1;
                    we.a(0, (byte) 121);
                    if (-2 != si.field_g) {
                        statePc = 266;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    ao.field_d = true;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (ao.field_d) {
                        statePc = 269;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 269: {
                    vh.field_t = 0;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    int discarded$67 = -44;
                    if (!ka.c()) {
                        statePc = 322;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var3 = ((ArcanistsMulti) this).e(118);
                    if (var3 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (var3 == 1) {
                        statePc = 277;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 277: {
                    int discarded$68 = 4;
                    int discarded$69 = 127;
                    ub.a();
                    jn.a((byte) -64, 6);
                    int discarded$70 = 16;
                    int discarded$71 = 7;
                    of.b();
                    ta.field_b = false;
                    if (nm.field_h != -1) {
                        statePc = 280;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 280: {
                    bg.a(2, nm.field_h);
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    pi.a(true);
                    if (var3 != 1) {
                        statePc = 285;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    kh.field_b = true;
                    oc.field_g = true;
                    if (var27 == 0) {
                        statePc = 298;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (wa.field_Ob) {
                        statePc = 290;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 290: {
                    io.field_A = false;
                    fi.field_h = true;
                    wa.field_Kb = true;
                    if (!hi.field_a) {
                        statePc = 294;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    jm.field_b = we.field_e;
                    gj.a(false, true, 9, mn.field_r);
                    if (var27 == 0) {
                        statePc = 296;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    gj.a(false, true, 0, mn.field_r);
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    int discarded$72 = 80;
                    lf.a();
                    tl.field_f[si.field_g].a(false, 0, (byte) -123);
                    mj.field_w = false;
                    wa.field_Ob = false;
                    hi.field_a = false;
                    int discarded$73 = -50;
                    bc.a();
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    oc.field_g = false;
                    kh.field_b = false;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    var4 = 0;
                    if (var3 == 2) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var4 = 1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (wa.field_Ob) {
                        statePc = 309;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (kh.field_b) {
                        statePc = 309;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (!oc.field_g) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var4 = 1;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    int discarded$74 = -44;
                    if (!ka.c()) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var4 = 0;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (var4 == 0) {
                        statePc = 322;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (null == tj.field_t) {
                        statePc = 322;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    int discarded$75 = -97;
                    ah.a(ve.field_t, tj.field_t.field_o, 8, 8, wd.field_h, (dj) (Object) tj.field_t, an.field_f / 2, an.field_j / 2, 2, tj.field_t.field_m + tj.field_t.field_o);
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, wf param2, int[] param3, boolean param4, wf[] param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            param5[param1] = param2;
            param3[param1] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("ArcanistsMulti.NA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(false).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3_int = 0;
        int var4_int = 0;
        ll[] var4 = null;
        qb[][] var5 = null;
        qb[][] var6 = null;
        qb var7 = null;
        ll[] var8 = null;
        int var9 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_125_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_124_0 = 0;
        L0: {
          var9 = field_G ? 1 : 0;
          if (ec.field_c == null) {
            L1: {
              mb.field_bb = (int)(Math.random() * 8.0);
              var3_int = mb.field_bb;
              if (var3_int == 0) {
                ec.field_c = "flame";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var3_int == 1) {
                ec.field_c = "frost";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3_int == 2) {
                ec.field_c = "rock";
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var3_int == 3) {
                ec.field_c = "overlight";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var3_int != 4) {
                break L5;
              } else {
                ec.field_c = "storm";
                break L5;
              }
            }
            L6: {
              if (var3_int != 5) {
                break L6;
              } else {
                ec.field_c = "underdark";
                break L6;
              }
            }
            L7: {
              if (var3_int != 6) {
                break L7;
              } else {
                ec.field_c = "nature";
                break L7;
              }
            }
            L8: {
              if (7 != var3_int) {
                break L8;
              } else {
                ec.field_c = "water";
                break L8;
              }
            }
            if (var3_int == 8) {
              ec.field_c = "clockwork";
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        int discarded$5 = -90;
        ti.a();
        if (null != vg.field_l) {
          L9: {
            if (!rc.field_a.c(-10923)) {
              break L9;
            } else {
              if (!rc.field_a.a("basic", -24417)) {
                break L9;
              } else {
                L10: {
                  if (!rc.field_a.c(-10923)) {
                    break L10;
                  } else {
                    if (!rc.field_a.a("roman20", -24417)) {
                      break L10;
                    } else {
                      L11: {
                        if (!ud.field_D.c(-10923)) {
                          break L11;
                        } else {
                          if (ud.field_D.a("roman20", -24417)) {
                            L12: {
                              if (!rc.field_a.c(-10923)) {
                                break L12;
                              } else {
                                if (!rc.field_a.a("lobby", -24417)) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (!ud.field_D.c(-10923)) {
                                      break L13;
                                    } else {
                                      if (ud.field_D.a("lobby", -24417)) {
                                        L14: {
                                          if (!vg.field_l.c(-10923)) {
                                            break L14;
                                          } else {
                                            if (!vg.field_l.a(106)) {
                                              break L14;
                                            } else {
                                              L15: {
                                                if (!mg.field_E.c(-10923)) {
                                                  break L15;
                                                } else {
                                                  if (mg.field_E.a(-15)) {
                                                    L16: {
                                                      if (!ki.field_s.c(-10923)) {
                                                        break L16;
                                                      } else {
                                                        if (!ki.field_s.a(125)) {
                                                          break L16;
                                                        } else {
                                                          L17: {
                                                            if (!tc.field_x.c(-10923)) {
                                                              break L17;
                                                            } else {
                                                              if (!tc.field_x.a(true, "arcanists_titlescreen", "")) {
                                                                break L17;
                                                              } else {
                                                                if (!tc.field_x.a(true, "arcanists_grassland", "")) {
                                                                  break L17;
                                                                } else {
                                                                  L18: {
                                                                    if (!ue.field_d.c(-10923)) {
                                                                      break L18;
                                                                    } else {
                                                                      if (!ue.field_d.a("", -24417)) {
                                                                        break L18;
                                                                      } else {
                                                                        if (ue.field_d.a(ec.field_c, -24417)) {
                                                                          L19: {
                                                                            if (!so.field_k.c(-10923)) {
                                                                              break L19;
                                                                            } else {
                                                                              if (so.field_k.a(109)) {
                                                                                L20: {
                                                                                  if (!hb.field_Fb.c(-10923)) {
                                                                                    break L20;
                                                                                  } else {
                                                                                    if (!hb.field_Fb.a(-33)) {
                                                                                      break L20;
                                                                                    } else {
                                                                                      L21: {
                                                                                        if (!ua.field_K.c(-10923)) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          if (!ua.field_K.a(-121)) {
                                                                                            break L21;
                                                                                          } else {
                                                                                            wm.g(0);
                                                                                            rb.a(sn.field_N, false, 60.0f);
                                                                                            ((ArcanistsMulti) this).c((byte) -89);
                                                                                            if (param1) {
                                                                                              lo.field_w = new gi(vg.field_l, mg.field_E);
                                                                                              vg.field_l = null;
                                                                                              mg.field_E = null;
                                                                                              bk.a(2);
                                                                                              return false;
                                                                                            } else {
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      rb.a(qe.a(mm.field_t, 74, ua.field_K, di.field_c), false, 55.0f);
                                                                                      return false;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                rb.a(qe.a(mm.field_t, 115, hb.field_Fb, di.field_c), false, 50.0f);
                                                                                return false;
                                                                              } else {
                                                                                break L19;
                                                                              }
                                                                            }
                                                                          }
                                                                          rb.a(qe.a(gd.field_nb, 113, so.field_k, sc.field_Z), false, 45.0f);
                                                                          return false;
                                                                        } else {
                                                                          rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ec.field_c), false, 40.0f);
                                                                          return false;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  rb.a(nm.a(17153, gd.field_nb, ue.field_d, sc.field_Z, ""), false, 35.0f);
                                                                  return false;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          rb.a(qe.a(ii.field_e, 96, tc.field_x, kh.field_e), false, 32.0f);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    rb.a(qe.a(ii.field_e, 76, ki.field_s, kh.field_e), false, 29.0f);
                                                    return false;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              rb.a(qe.a(mj.field_v, 76, mg.field_E, fn.field_a), false, 23.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        rb.a(qe.a(mj.field_v, 122, vg.field_l, fn.field_a), false, 20.0f);
                                        return false;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "lobby"), false, 17.0f);
                                  return false;
                                }
                              }
                            }
                            rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "lobby"), false, 14.0f);
                            return false;
                          } else {
                            break L11;
                          }
                        }
                      }
                      rb.a(nm.a(17153, ra.field_d, ud.field_D, wh.field_a, "roman20"), false, 11.0f);
                      return false;
                    }
                  }
                }
                rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "roman20"), false, 8.0f);
                return false;
              }
            }
          }
          rb.a(nm.a(17153, gd.field_nb, rc.field_a, sc.field_Z, "basic"), false, 5.0f);
          return false;
        } else {
          L22: {
            if (tc.field_x == null) {
              break L22;
            } else {
              if (jh.field_c != null) {
                break L22;
              } else {
                rb.a(vi.field_J, false, 85.0f);
                ((ArcanistsMulti) this).c((byte) -89);
                jh.field_c = new ha[10];
                bk.a(2);
                return false;
              }
            }
          }
          L23: {
            var3_int = -84 / ((14 - param0) / 56);
            if (null != so.field_k) {
              if (hf.field_o == null) {
                rb.a(hi.field_c, false, 90.0f);
                ((ArcanistsMulti) this).c((byte) -89);
                hf.field_o = fj.a("", -22612, ue.field_d, "funorblogo");
                vn.field_b = fj.a("", -22612, ue.field_d, "newlogo");
                g.field_a = fj.a("", -22612, ue.field_d, "newlogostars");
                sm.field_d = fj.a("", -22612, ue.field_d, "newlogostars2");
                vi.field_I = fj.a("", -22612, ue.field_d, "arrowbuttonsmall");
                to.field_q = fj.a("", -22612, ue.field_d, "arrowbutton");
                km.field_e = fj.a("", -22612, ue.field_d, "border_corner");
                wk.field_l = fj.a("", -22612, ue.field_d, "border_bar_h");
                hk.field_k = fj.a("", -22612, ue.field_d, "border_bar_v");
                mc.field_a = qe.a(ue.field_d, "charactericons", "", 55);
                rb.field_o = qe.a(ue.field_d, "bonushats", "", 63);
                bk.a(2);
                return false;
              } else {
                if (e.field_M == null) {
                  rb.a(hi.field_c, false, 91.0f);
                  ((ArcanistsMulti) this).c((byte) -89);
                  wm.field_H = qe.a(ue.field_d, "menu_overlays", "", 41);
                  e.field_M = new ll[9];
                  oo.field_t = fj.a("", -22612, ue.field_d, "logo_arcanists");
                  wm.field_H[13].a();
                  vn.field_b.field_x = -(vn.field_b.field_n / 2) + 320;
                  vn.field_b.field_o = 16;
                  int discarded$6 = 491697968;
                  rk.g();
                  kf.field_b = qe.a(ue.field_d, "frame2", "", 83);
                  uj.field_f = fj.a("", -22612, ue.field_d, "gamespell");
                  fe.field_g = fj.a("", -22612, ue.field_d, "gamebars");
                  pm.field_a = fj.a("", -22612, ue.field_d, "cldgame");
                  rg.field_a = fj.a("", -22612, ue.field_d, "cldtr");
                  o.field_F = fj.a("", -22612, ue.field_d, "cldbl");
                  pe.field_Ib = fj.a("", -22612, ue.field_d, "cldtl");
                  j.field_a = fj.a("", -22612, ue.field_d, "cldbr");
                  gd.field_mb = fj.a("", -22612, ue.field_d, "cldflat");
                  fe.field_o = fj.a("", -22612, ue.field_d, "spell_book");
                  bk.a(2);
                  return false;
                } else {
                  if (null != ea.field_E) {
                    if (mb.field_ab == null) {
                      rb.a(hi.field_c, false, 93.0f);
                      ((ArcanistsMulti) this).c((byte) -89);
                      mb.field_ab = pk.a("", 0, "spellclasses", ue.field_d);
                      vd.field_b = fj.a("basic", -22612, rc.field_a, "unachieved");
                      ii.field_d = fj.a("basic", -22612, rc.field_a, "locked");
                      di.field_d = fj.a("basic", -22612, rc.field_a, "orbcoin");
                      kc.field_kb = qe.a(ue.field_d, "heads", "", 95);
                      jd.field_j = qe.a(ue.field_d, "bodies", "", 67);
                      ea.field_u = qe.a(ue.field_d, "phands", "", 58);
                      qe.field_i = qe.a(ue.field_d, "mhands", "", 57);
                      hn.field_d = qe.a(ue.field_d, "beards", "", 106);
                      tj.field_A = qe.a(ue.field_d, "hats", "", 124);
                      bo.field_a = qe.a(ue.field_d, "mouths", "", 42);
                      h.field_I = qe.a(ue.field_d, "pfeet", "", 58);
                      fn.field_b = qe.a(ue.field_d, "mfeet", "", 113);
                      bk.a(2);
                      return false;
                    } else {
                      if (null != ij.field_Pb) {
                        if (null == nm.field_i) {
                          rb.a(hi.field_c, false, 95.0f);
                          ((ArcanistsMulti) this).c((byte) -89);
                          bb.field_g = qe.a(ue.field_d, "spellicons", "", 75);
                          nm.field_i = qe.a(ue.field_d, "frame", "", 51);
                          nm.field_i[1].field_n = nm.field_i[1].field_q;
                          nm.field_i[4] = null;
                          nm.field_i[3].field_w = nm.field_i[3].field_y;
                          nm.field_i[7].field_n = nm.field_i[7].field_q;
                          nm.field_i[5].field_w = nm.field_i[5].field_y;
                          wd.field_h = qe.a(ue.field_d, "button_frame", "", 69);
                          bk.a(2);
                          return false;
                        } else {
                          if (null == ve.field_t) {
                            rb.a(hi.field_c, false, 96.0f);
                            ((ArcanistsMulti) this).c((byte) -89);
                            ve.field_t = qe.a(ue.field_d, "button_frame_r", "", 94);
                            qb[] discarded$7 = qe.a(ue.field_d, "button_frame_d", "", 44);
                            mo.field_a = qe.a(ue.field_d, "achievements_large", "", 98);
                            var4_int = 95;
                            L24: while (true) {
                              L25: {
                                L26: {
                                  if (~var4_int <= ~mo.field_a.length) {
                                    break L26;
                                  } else {
                                    mo.field_a[var4_int] = null;
                                    var4_int++;
                                    if (var9 != 0) {
                                      break L25;
                                    } else {
                                      if (var9 == 0) {
                                        continue L24;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                ih.field_e = new qb(32, 32);
                                ih.field_e.a();
                                di.field_d.d(0, 0, 32, 32);
                                ce.field_m.a(true);
                                bk.a(2);
                                break L25;
                              }
                              return false;
                            }
                          } else {
                            if (so.field_k != null) {
                              L27: {
                                L28: {
                                  rb.a(hi.field_c, false, 97.0f);
                                  ((ArcanistsMulti) this).c((byte) -89);
                                  rc.field_a.field_f = 0;
                                  ud.field_D.field_f = 0;
                                  wn.a((byte) 111, (dj) (Object) rc.a(ud.field_D, -24755, "lobby", "chatfont", rc.field_a));
                                  rc.field_a.field_f = 1;
                                  ud.field_D.field_f = 1;
                                  var4 = pk.a("", 0, "minibonushats", ue.field_d);
                                  var5 = new qb[3][];
                                  var6 = new qb[3][];
                                  var5[0] = qe.a(ue.field_d, "turntime_icons", "", 76);
                                  var5[1] = qe.a(ue.field_d, "levelstyle_iconssmall", "", 56);
                                  var5[2] = qe.a(ue.field_d, "team_iconssmall", "", 76);
                                  var6[0] = null;
                                  var6[1] = qe.a(ue.field_d, "levelstyle_icons", "", 121);
                                  var6[2] = null;
                                  var7 = var5[1][3];
                                  var5[1][3] = var5[1][2];
                                  var5[1][2] = var5[1][1];
                                  var5[1][1] = var5[1][0];
                                  var5[1][0] = var7;
                                  var7 = var6[1][3];
                                  var6[1][3] = var6[1][2];
                                  var6[1][2] = var6[1][1];
                                  var6[1][1] = var6[1][0];
                                  var6[1][0] = var7;
                                  rb.a(li.field_E, ua.field_K, var4, var5, true, jh.field_d, rm.field_l, 6, ud.field_D, (int[]) null, var6, cn.field_O, (byte) -67, jk.field_a, 3, aj.field_a, rc.field_a);
                                  fn.a(200, (byte) -106);
                                  um.field_a = qf.field_c;
                                  gm.field_c = false;
                                  dh.field_Hb = co.field_a;
                                  qn.a(-24539, rc.field_a, ud.field_D);
                                  ud.field_D = null;
                                  so.field_k = null;
                                  int discarded$8 = 112;
                                  if (lc.a()) {
                                    break L28;
                                  } else {
                                    if (0 >= ah.field_c) {
                                      break L28;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var8 = pk.a("", 0, "expansion_screens", ue.field_d);
                                to.field_s = new hf((java.applet.Applet) this, be.field_i, var8, dh.field_Kb);
                                break L27;
                              }
                              bk.a(2);
                              return false;
                            } else {
                              break L23;
                            }
                          }
                        }
                      } else {
                        rb.a(hi.field_c, false, 94.0f);
                        ((ArcanistsMulti) this).c((byte) -89);
                        ij.field_Pb = qe.a(ue.field_d, "conductororb", "", 60);
                        fc.field_e = qe.a(ue.field_d, "phylactery", "", 92);
                        tf.field_j = qe.a(ue.field_d, "stonemonster", "", 64);
                        fo.field_g = qe.a(ue.field_d, "frostsprite", "", 56);
                        rc.field_k = qe.a(ue.field_d, "fungus", "", 102);
                        lf.field_c = qe.a(ue.field_d, "flamesprite", "", 69);
                        eo.field_a = qe.a(ue.field_d, "watersprite", "", 58);
                        ji.field_h = qe.a(ue.field_d, "gaurdianangel", "", 69);
                        ae.field_a = qe.a(ue.field_d, "clockwork", "", 93);
                        wg.field_J = qe.a(ue.field_d, "aura", "", 124);
                        kl.field_E = qe.a(ue.field_d, "clockworkaura", "", 75);
                        jg.field_c = pk.a("", 0, "runes", ue.field_d);
                        rm.field_o = qe.a(ue.field_d, "spellbooks", "", 93);
                        bk.a(2);
                        return false;
                      }
                    }
                  } else {
                    rb.a(hi.field_c, false, 92.0f);
                    ((ArcanistsMulti) this).c((byte) -89);
                    ea.field_E = new qb[15];
                    var4_int = 0;
                    L29: while (true) {
                      L30: {
                        L31: {
                          if (var4_int >= 15) {
                            break L31;
                          } else {
                            ea.field_E[var4_int] = wm.field_H[var4_int].g();
                            var4_int++;
                            if (var9 != 0) {
                              break L30;
                            } else {
                              if (var9 == 0) {
                                continue L29;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                        var4_int = 0;
                        break L30;
                      }
                      L32: while (true) {
                        L33: {
                          L34: {
                            if (15 <= var4_int) {
                              break L34;
                            } else {
                              lj.a(true, var4_int);
                              stackOut_115_0 = 0;
                              stackIn_125_0 = stackOut_115_0;
                              stackIn_116_0 = stackOut_115_0;
                              if (var9 != 0) {
                                break L33;
                              } else {
                                stackOut_116_0 = stackIn_116_0;
                                stackIn_117_0 = stackOut_116_0;
                                L35: {
                                  if (stackIn_117_0 >= var4_int) {
                                    break L35;
                                  } else {
                                    if (var4_int < 13) {
                                      wm.field_H[var4_int] = null;
                                      break L35;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var4_int++;
                                if (var9 == 0) {
                                  continue L32;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          ea.field_E[0] = null;
                          vn.field_b = null;
                          ce.field_m.a(true);
                          int discarded$9 = -66;
                          dh.a(ue.field_d);
                          tj.field_t = rc.a(so.field_k, -24755, "", "font", ue.field_d);
                          mi.field_B = rc.a(so.field_k, -24755, "", "smallfont", ue.field_d);
                          bk.a(2);
                          stackOut_124_0 = 0;
                          stackIn_125_0 = stackOut_124_0;
                          break L33;
                        }
                        return stackIn_125_0 != 0;
                      }
                    }
                  }
                }
              }
            } else {
              break L23;
            }
          }
          if (hb.field_Fb != null) {
            gh.a(-92, new u(hb.field_Fb.a("huffman", "", -1)));
            hb.field_Fb = null;
            bk.a(2);
            return false;
          } else {
            wk.d((byte) -98);
            return true;
          }
        }
    }

    final static void j(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              u.field_k = false;
              if (param0 == 48) {
                break L1;
              } else {
                ArcanistsMulti.h((byte) -33);
                break L1;
              }
            }
            L2: {
              L3: {
                fg.field_o = null;
                if (hk.field_s) {
                  break L3;
                } else {
                  L4: {
                    var1_int = dd.field_j;
                    if (var1_int > 0) {
                      L5: {
                        L6: {
                          if (var1_int != 1) {
                            break L6;
                          } else {
                            fg.field_o = re.field_k;
                            if (var2 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        fg.field_o = tj.a(param0 ^ -80, new String[1], sk.field_g);
                        break L5;
                      }
                      int discarded$5 = -93;
                      fg.field_o = ua.a(new CharSequence[3]);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  vf.field_k.h(77);
                  int discarded$6 = 0;
                  ba.c();
                  if (var2 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              vf.field_k.g(true);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ArcanistsMulti.UA(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, dn param2, String param3, long param4, int param5, int param6, String param7, kc param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              dd.field_h = param2;
              eo.field_c = new ne(param8, param4, param3, param7, param6, param5, param1);
              if (param0 == -26335) {
                break L1;
              } else {
                boolean discarded$3 = ArcanistsMulti.i((byte) 116);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ArcanistsMulti.SA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param7 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param8 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              ArcanistsMulti.h((byte) -91);
              int discarded$206 = -60;
              fn.a();
              int discarded$207 = 92;
              qa.a();
              int discarded$208 = 1;
              vn.e();
              cb.a((byte) 44);
              ik.a(0);
              int discarded$209 = 30;
              c.a();
              int discarded$210 = 0;
              to.c();
              kc.d(-21224);
              int discarded$211 = -733;
              ji.a();
              int discarded$212 = -97;
              bh.a();
              bc.a(1);
              ci.a(0);
              int discarded$213 = -81;
              uf.a();
              int discarded$214 = 1;
              ud.d();
              int discarded$215 = -46;
              p.a();
              dc.a(false);
              int discarded$216 = 66;
              hn.a();
              int discarded$217 = -10338;
              je.a();
              int discarded$218 = 1;
              hh.b();
              de.c();
              eg.a(false);
              dj.a();
              rg.a(35);
              int discarded$219 = 1;
              wk.b();
              int discarded$220 = -13019;
              qj.c();
              int discarded$221 = 64;
              ra.b();
              int discarded$222 = 1;
              oj.a();
              int discarded$223 = -58;
              uc.a();
              int discarded$224 = 85;
              ck.b();
              int discarded$225 = 124;
              hm.a();
              ub.a(-70);
              um.a(0);
              int discarded$226 = 96;
              ad.a();
              int discarded$227 = -25776;
              jg.c();
              mf.a(-1);
              int discarded$228 = 115;
              md.a();
              int discarded$229 = -105;
              hg.b();
              int discarded$230 = 0;
              dk.b();
              int discarded$231 = -1;
              rc.a();
              int discarded$232 = 115;
              uk.a();
              v.b(-18033);
              int discarded$233 = 59;
              gi.a();
              lc.c(true);
              int discarded$234 = 95;
              le.f();
              int discarded$235 = 0;
              pm.a();
              int discarded$236 = -121;
              kf.a();
              hf.a(false);
              lk.d(11959);
              int discarded$237 = 32336;
              pa.a();
              int discarded$238 = -90;
              gk.a();
              int discarded$239 = -1;
              sd.b();
              int discarded$240 = 11138;
              k.c();
              nf.r(0);
              pg.c((byte) -115);
              int discarded$241 = 122;
              pn.b();
              int discarded$242 = 107;
              cc.a();
              so.a(param0);
              gh.d((byte) 115);
              int discarded$243 = 13;
              di.b();
              int discarded$244 = 1;
              o.c();
              en.b();
              if (param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              hk.b(stackIn_4_0 != 0);
              lb.c();
              io.c(118);
              fo.a(0);
              int discarded$245 = 0;
              ec.b();
              kj.a(true);
              lf.a(-15);
              jk.a(0);
              int discarded$246 = -79;
              nb.a();
              int discarded$247 = -51;
              tl.a();
              ml.h(false);
              int discarded$248 = 54;
              qc.a();
              tf.a(49);
              mi.g(2);
              int discarded$249 = 0;
              oc.b();
              int discarded$250 = 60;
              hi.a();
              jd.d((byte) -109);
              ai.b();
              ni.a();
              jj.a();
              int discarded$251 = 0;
              ah.a();
              r.a(8);
              int discarded$252 = 103;
              oi.a();
              vi.h((byte) 62);
              int discarded$253 = 1;
              h.h();
              ie.m((byte) 25);
              int discarded$254 = 103;
              gd.g();
              int discarded$255 = -11;
              no.l();
              ed.i(-29222);
              int discarded$256 = 10;
              ln.g();
              td.a((byte) 115);
              e.a(-1);
              int discarded$257 = 127;
              sn.g();
              hc.a((byte) -60);
              vh.b(-60);
              if (param0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              fb.a(stackIn_8_0 != 0);
              int discarded$258 = 0;
              pc.a();
              dd.a(-5451);
              int discarded$259 = 62;
              ue.a();
              g.a(30586);
              int discarded$260 = -79;
              tm.b();
              int discarded$261 = 83;
              cf.a();
              int discarded$262 = -10765;
              nl.e();
              dn.e(1);
              int discarded$263 = 93;
              af.e();
              int discarded$264 = -120;
              in.g();
              int discarded$265 = 0;
              pe.g();
              int discarded$266 = 0;
              hb.e();
              int discarded$267 = -14;
              ne.c();
              int discarded$268 = 126;
              w.g();
              cg.e(param0);
              int discarded$269 = 6;
              i.a();
              int discarded$270 = 120;
              na.g();
              jb.c(122);
              int discarded$271 = 120;
              we.c();
              int discarded$272 = 0;
              wj.a();
              int discarded$273 = 0;
              mo.c();
              int discarded$274 = -92;
              tg.c();
              mc.a(73);
              ao.b(0);
              int discarded$275 = -1;
              sb.c();
              s.a((byte) -109);
              bm.a(false);
              int discarded$276 = -71;
              fc.a();
              int discarded$277 = -1;
              nm.a();
              ph.a((byte) -42);
              fi.a((byte) 5);
              gj.a(false);
              int discarded$278 = 0;
              ch.a();
              bd.b(0);
              ab.q(21657);
              da.a(-121);
              u.a(1);
              int discarded$279 = -75;
              vm.a();
              ug.a(109);
              ic.a(0);
              int discarded$280 = -117;
              ge.a();
              int discarded$281 = 112;
              cn.g();
              int discarded$282 = 1;
              qn.h();
              cj.a(param0);
              int discarded$283 = 26820;
              sa.e();
              int discarded$284 = -99;
              jn.a();
              rj.a((byte) -94);
              int discarded$285 = -791;
              oh.a();
              int discarded$286 = 255;
              kb.d();
              int discarded$287 = 46;
              ff.a();
              int discarded$288 = 36;
              si.b();
              int discarded$289 = -95;
              mj.a();
              int discarded$290 = -56;
              of.a();
              int discarded$291 = 2;
              lh.a();
              int discarded$292 = 63;
              jm.c();
              qm.f((byte) -17);
              int discarded$293 = 23123;
              wn.e();
              int discarded$294 = 6481;
              kh.a();
              int discarded$295 = 3;
              kn.h();
              int discarded$296 = 1;
              uj.a();
              int discarded$297 = 6;
              qo.a();
              ob.f(false);
              int discarded$298 = 0;
              ti.k();
              int discarded$299 = -125;
              ag.e();
              ua.f(-1);
              int discarded$300 = 1;
              df.c();
              int discarded$301 = -90;
              kl.a();
              int discarded$302 = -125;
              ae.a();
              int discarded$303 = 92;
              qf.a();
              ef.g(-1);
              int discarded$304 = 20;
              vk.f();
              int discarded$305 = -60;
              be.a();
              int discarded$306 = 78;
              ea.f();
              tj.b(107);
              int discarded$307 = 0;
              jo.a();
              int discarded$308 = 2039583;
              ve.d();
              int discarded$309 = 67;
              b.a();
              id.c();
              gl.a((byte) 15);
              vg.a(40);
              int discarded$310 = 120;
              bo.a();
              int discarded$311 = -31399;
              he.a();
              int discarded$312 = 98;
              oa.a();
              int discarded$313 = 0;
              wd.a();
              int discarded$314 = 0;
              rd.a();
              int discarded$315 = -888;
              lm.a();
              int discarded$316 = -68;
              pi.a();
              int discarded$317 = 87;
              jh.a();
              int discarded$318 = -14449;
              eo.a();
              int discarded$319 = 8577;
              n.a();
              int discarded$320 = -79;
              bg.a();
              bf.a();
              int discarded$321 = 4;
              ul.a();
              int discarded$322 = -127;
              bb.a();
              fl.a(true);
              int discarded$323 = -118;
              wh.a();
              int discarded$324 = 121;
              sk.b();
              int discarded$325 = 49;
              la.a();
              int discarded$326 = 107;
              hd.a();
              int discarded$327 = 12;
              ij.g();
              int discarded$328 = 0;
              kg.a();
              int discarded$329 = -122;
              gn.a();
              int discarded$330 = 31908;
              oo.e();
              int discarded$331 = -1016755547;
              tk.c();
              int discarded$332 = 0;
              ig.a();
              int discarded$333 = 0;
              go.a();
              int discarded$334 = 111;
              hj.a();
              lj.c(-80);
              ga.a((byte) -109);
              int discarded$335 = 27494;
              vf.a();
              if (param0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            ia.a(stackIn_12_0 != 0);
            int discarded$336 = 37;
            rb.a();
            int discarded$337 = 120;
            oe.a();
            int discarded$338 = -6566;
            rm.a();
            fg.b(param0);
            ba.a((byte) 94);
            jc.a();
            ke.f(2);
            int discarded$339 = 0;
            bi.o();
            int discarded$340 = 1;
            rn.n();
            int discarded$341 = 0;
            qk.g();
            int discarded$342 = -127;
            om.a();
            li.a(1313);
            int discarded$343 = 20445;
            ej.f();
            int discarded$344 = -125;
            mk.g();
            sc.g(15428);
            int discarded$345 = 0;
            bk.f();
            int discarded$346 = -114;
            rl.c();
            int discarded$347 = 28;
            gg.b();
            int discarded$348 = 40;
            ng.a();
            int discarded$349 = -116;
            rk.h();
            wg.d(param0);
            tn.f((byte) -97);
            dh.f((byte) 77);
            int discarded$350 = -1;
            fd.a();
            int discarded$351 = -79;
            bl.c();
            wl.k(0);
            int discarded$352 = -72;
            nj.a();
            int discarded$353 = 42;
            mg.i();
            sl.g(123);
            int discarded$354 = -125;
            jl.c();
            int discarded$355 = 0;
            re.b();
            int discarded$356 = -114;
            se.f();
            int discarded$357 = -1764031359;
            q.f();
            int discarded$358 = -46;
            bj.l();
            int discarded$359 = -108;
            gf.k();
            int discarded$360 = -5903;
            wm.f();
            int discarded$361 = 54;
            ma.g();
            wi.a(92);
            pk.a(-14987);
            int discarded$362 = 33;
            gb.b();
            int discarded$363 = 63;
            nn.c();
            int discarded$364 = 20028;
            aj.a();
            int discarded$365 = -102;
            nh.h();
            ka.a(-1);
            sm.a(false);
            int discarded$366 = -120;
            jf.a();
            int discarded$367 = 88;
            fh.a();
            fk.a(-1333592895);
            nk.a(30025);
            ce.b(false);
            int discarded$368 = 2188450;
            mm.d();
            gm.a(-9922);
            int discarded$369 = 1;
            ib.a();
            int discarded$370 = 25;
            tc.b();
            int discarded$371 = 106;
            ii.b();
            int discarded$372 = 1;
            dm.c();
            int discarded$373 = 99;
            cd.a();
            int discarded$374 = 85;
            rf.a();
            int discarded$375 = 90;
            fj.a();
            on.a(3);
            int discarded$376 = -121;
            wa.f();
            int discarded$377 = 5;
            ta.a();
            int discarded$378 = -23971;
            ol.b();
            int discarded$379 = -1513388336;
            hl.a();
            int discarded$380 = 32369;
            fe.a();
            int discarded$381 = 49;
            cm.a();
            int discarded$382 = 126;
            pb.a();
            int discarded$383 = -1;
            f.a();
            int discarded$384 = 83;
            qg.b();
            int discarded$385 = -62;
            co.b();
            ho.b(0);
            int discarded$386 = 400;
            km.b();
            am.a(false);
            int discarded$387 = -100;
            qe.c();
            int discarded$388 = 115;
            me.a();
            int discarded$389 = -69;
            uh.a();
            int discarded$390 = 0;
            fm.a();
            int discarded$391 = -113;
            th.a();
            int discarded$392 = -107;
            ql.a();
            im.a((byte) -14);
            int discarded$393 = 13;
            ld.b();
            int discarded$394 = -104;
            an.a();
            int discarded$395 = 48;
            ih.a();
            vc.b(202);
            vd.a(0);
            int discarded$396 = 121;
            va.a();
            int discarded$397 = 49;
            eb.a();
            int discarded$398 = -122;
            j.a();
            int discarded$399 = 114;
            mh.h();
            int discarded$400 = 122;
            mb.a();
            int discarded$401 = 0;
            aa.b();
            int discarded$402 = 32;
            ko.a();
            dg.d(-1);
            int discarded$403 = 70;
            ui.d();
            int discarded$404 = 90;
            ki.d();
            int discarded$405 = 0;
            ja.d();
            int discarded$406 = 15672;
            lo.d();
            int discarded$407 = -119;
            mn.d();
            int discarded$408 = 255;
            db.a();
            int discarded$409 = -76;
            vl.a();
            int discarded$410 = 121;
            eh.a();
            ee.c(true);
            int discarded$411 = 76;
            ri.a();
            ((ArcanistsMulti) this).field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.N(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        le var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6_int = 0;
        int[][] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_132_0 = false;
        boolean stackIn_152_0 = false;
        boolean[] stackIn_177_0 = null;
        boolean[] stackIn_177_1 = null;
        int stackIn_177_2 = 0;
        boolean[] stackIn_179_0 = null;
        boolean[] stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        boolean[] stackIn_180_0 = null;
        boolean[] stackIn_180_1 = null;
        int stackIn_180_2 = 0;
        int stackIn_180_3 = 0;
        int stackIn_183_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_131_0 = false;
        boolean stackOut_151_0 = false;
        boolean[] stackOut_176_0 = null;
        boolean[] stackOut_176_1 = null;
        int stackOut_176_2 = 0;
        boolean[] stackOut_179_0 = null;
        boolean[] stackOut_179_1 = null;
        int stackOut_179_2 = 0;
        int stackOut_179_3 = 0;
        boolean[] stackOut_177_0 = null;
        boolean[] stackOut_177_1 = null;
        int stackOut_177_2 = 0;
        int stackOut_177_3 = 0;
        int stackOut_182_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_234_0 = 0;
        var13 = field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$19 = 0;
              if (bj.g()) {
                param1 = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (b.field_a.b(12623) == null) {
                break L2;
              } else {
                int fieldTemp$20 = wi.field_h + 1;
                wi.field_h = wi.field_h + 1;
                if (fieldTemp$20 != 335) {
                  break L2;
                } else {
                  wi.field_h = 0;
                  pg discarded$21 = b.field_a.c(true);
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (~ii.field_c == ~ii.field_a) {
                  break L4;
                } else {
                  L5: {
                    if (ie.field_Vb == ii.field_a) {
                      break L5;
                    } else {
                      L6: {
                        if (ii.field_a == sl.field_I) {
                          break L6;
                        } else {
                          u.field_i = u.field_i - 1;
                          if (u.field_i != 0) {
                            break L3;
                          } else {
                            ii.field_a = ii.field_c;
                            if (var13 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        int discarded$22 = 112;
                        if (lc.a()) {
                          break L7;
                        } else {
                          L8: {
                            mn.field_r = cj.field_b;
                            int discarded$23 = 0;
                            vk.c();
                            if (w.field_Cb) {
                              w.field_Cb = false;
                              km.a(1, 10, 240, 16, (dj) (Object) mi.field_B, 320, (byte) 40, mi.field_B.field_o, false, wd.field_h, mi.field_B.field_m + mi.field_B.field_o, ve.field_t);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (!pi.field_c) {
                              break L9;
                            } else {
                              pi.field_c = false;
                              gj.a(false, true, -4, mn.field_r);
                              break L9;
                            }
                          }
                          if (!ij.b(mn.field_r, 10)) {
                            break L7;
                          } else {
                            int discarded$24 = 80;
                            lf.a();
                            break L7;
                          }
                        }
                      }
                      ii.field_a = ub.field_h;
                      if (var13 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  u.field_i = u.field_i + 1;
                  if (u.field_i != 16) {
                    break L3;
                  } else {
                    L10: {
                      L11: {
                        if (w.field_Cb) {
                          break L11;
                        } else {
                          int discarded$25 = 4;
                          vn.a();
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      int discarded$26 = 3020;
                      am.a();
                      break L10;
                    }
                    ii.field_a = sl.field_I;
                    if (var13 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L12: {
                L13: {
                  var3_int = 0;
                  var4 = 0;
                  if (param1) {
                    break L13;
                  } else {
                    L14: {
                      if (~si.field_g == ~mn.field_r) {
                        break L14;
                      } else {
                        km.field_c = km.field_c + 1;
                        if (km.field_c == 32) {
                          int discarded$27 = 80;
                          lf.a();
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      var5 = jb.field_z;
                      if (null != var5) {
                        break L15;
                      } else {
                        var5 = r.field_b;
                        break L15;
                      }
                    }
                    L16: {
                      if (-1 == si.field_g) {
                        break L16;
                      } else {
                        L17: {
                          if (14 == si.field_g) {
                            break L17;
                          } else {
                            if (si.field_g == 2) {
                              break L17;
                            } else {
                              if (si.field_g == 4) {
                                break L17;
                              } else {
                                L18: {
                                  if (si.field_g == -2) {
                                    break L18;
                                  } else {
                                    if (!ij.b(si.field_g, 10)) {
                                      break L13;
                                    } else {
                                      tl.field_f[si.field_g].b(91);
                                      if (var13 == 0) {
                                        break L13;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                var3_int = 1;
                                if (var13 == 0) {
                                  break L13;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        L19: {
                          if (var5.field_ab) {
                            break L19;
                          } else {
                            var5.a(true, false);
                            break L19;
                          }
                        }
                        tl.field_f[si.field_g].b(89);
                        if (var13 == 0) {
                          break L13;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L20: {
                      if (!wa.field_Ob) {
                        break L20;
                      } else {
                        var4 = 1;
                        var3_int = 1;
                        if (var13 == 0) {
                          break L13;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (var5.field_ab) {
                        break L21;
                      } else {
                        var5.a(true, true);
                        break L21;
                      }
                    }
                    L22: while (true) {
                      if (!ib.b(false)) {
                        break L13;
                      } else {
                        var5.k(1);
                        if (var13 != 0) {
                          break L12;
                        } else {
                          if (var13 == 0) {
                            continue L22;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                if (!wa.field_Ob) {
                  break L12;
                } else {
                  if (kh.field_b) {
                    break L12;
                  } else {
                    if (!oc.field_g) {
                      L23: {
                        var5_int = var4;
                        if (!hi.field_a) {
                          break L23;
                        } else {
                          if (ef.field_r) {
                            var3_int = 0;
                            var4 = 0;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        int discarded$28 = 13;
                        ae.a(var3_int != 0);
                        if (mj.field_w) {
                          r.field_b.a(true, var4 != 0);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (!hi.field_a) {
                          break L25;
                        } else {
                          if (null == jb.field_z) {
                            break L25;
                          } else {
                            nh.a((byte) -66, 320, 180, var5_int != 0);
                            jb.field_z.a(true, var4 != 0);
                            break L25;
                          }
                        }
                      }
                      L26: while (true) {
                        L27: {
                          L28: {
                            if (!ib.b(false)) {
                              break L28;
                            } else {
                              stackOut_131_0 = ao.field_d;
                              stackIn_152_0 = stackOut_131_0;
                              stackIn_132_0 = stackOut_131_0;
                              if (var13 != 0) {
                                break L27;
                              } else {
                                L29: {
                                  if (stackIn_132_0) {
                                    L30: {
                                      if (!hi.field_a) {
                                        break L30;
                                      } else {
                                        int discarded$29 = 13;
                                        int discarded$30 = 15;
                                        int discarded$31 = 27;
                                        int discarded$32 = 12;
                                        if (!tg.a()) {
                                          break L29;
                                        } else {
                                          jb.field_z.field_O = true;
                                          if (var13 == 0) {
                                            continue L26;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    boolean discarded$33 = pe.a(15, 12, (byte) 32, 13);
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L31: {
                                  if (!mj.field_w) {
                                    break L31;
                                  } else {
                                    r.field_b.k(1);
                                    break L31;
                                  }
                                }
                                if (hi.field_a) {
                                  jb.field_z.k(1);
                                  if (var13 == 0) {
                                    continue L26;
                                  } else {
                                    break L28;
                                  }
                                } else {
                                  continue L26;
                                }
                              }
                            }
                          }
                          stackOut_151_0 = ao.field_d;
                          stackIn_152_0 = stackOut_151_0;
                          break L27;
                        }
                        if (!stackIn_152_0) {
                          ef.field_r = false;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L32: {
                if (wa.field_Ob) {
                  break L32;
                } else {
                  int discarded$34 = -4;
                  lf.b();
                  break L32;
                }
              }
              L33: {
                L34: {
                  if (ao.field_d) {
                    break L34;
                  } else {
                    if (rd.field_b > 0) {
                      rd.field_b = rd.field_b - 1;
                      if (var13 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    } else {
                      break L33;
                    }
                  }
                }
                if (~rd.field_b <= ~ea.field_F) {
                  break L33;
                } else {
                  rd.field_b = rd.field_b + 1;
                  break L33;
                }
              }
              var5_int = ea.field_F * ea.field_F;
              var6_int = -(rd.field_b * rd.field_b) + var5_int;
              var7_int = an.field_j - 120 - -(120 * var6_int / var5_int);
              rc.a(var7_int, -30218);
              break L3;
            }
            L35: {
              if (mn.field_r != -3) {
                break L35;
              } else {
                L36: {
                  var3_ref = ah.field_b;
                  if (var3_ref == null) {
                    var3_ref = k.field_p;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  var4_ref_String__ = new String[]{var3_ref, ga.field_n, rf.field_l, rg.field_c};
                  var5_array = new int[6][18];
                  var6 = new int[6][16];
                  var7 = new int[]{ad.field_d, 0, 0, 0, 0, 0};
                  stackOut_176_0 = new boolean[6];
                  stackOut_176_1 = new boolean[6];
                  stackOut_176_2 = 0;
                  stackIn_179_0 = stackOut_176_0;
                  stackIn_179_1 = stackOut_176_1;
                  stackIn_179_2 = stackOut_176_2;
                  stackIn_177_0 = stackOut_176_0;
                  stackIn_177_1 = stackOut_176_1;
                  stackIn_177_2 = stackOut_176_2;
                  if (qf.field_d < 2) {
                    stackOut_179_0 = (boolean[]) (Object) stackIn_179_0;
                    stackOut_179_1 = (boolean[]) (Object) stackIn_179_1;
                    stackOut_179_2 = stackIn_179_2;
                    stackOut_179_3 = 0;
                    stackIn_180_0 = stackOut_179_0;
                    stackIn_180_1 = stackOut_179_1;
                    stackIn_180_2 = stackOut_179_2;
                    stackIn_180_3 = stackOut_179_3;
                    break L37;
                  } else {
                    stackOut_177_0 = (boolean[]) (Object) stackIn_177_0;
                    stackOut_177_1 = (boolean[]) (Object) stackIn_177_1;
                    stackOut_177_2 = stackIn_177_2;
                    stackOut_177_3 = 1;
                    stackIn_180_0 = stackOut_177_0;
                    stackIn_180_1 = stackOut_177_1;
                    stackIn_180_2 = stackOut_177_2;
                    stackIn_180_3 = stackOut_177_3;
                    break L37;
                  }
                }
                stackIn_180_1[stackIn_180_2] = stackIn_180_3 != 0;
                stackIn_180_0[1] = false;
                stackIn_180_0[2] = false;
                stackIn_180_0[3] = false;
                stackIn_180_0[4] = false;
                stackIn_180_0[5] = false;
                var8 = stackIn_180_0;
                var9 = 0;
                L38: while (true) {
                  L39: {
                    L40: {
                      if (var9 >= 6) {
                        break L40;
                      } else {
                        var10 = 0;
                        stackOut_182_0 = 0;
                        stackIn_212_0 = stackOut_182_0;
                        stackIn_183_0 = stackOut_182_0;
                        if (var13 != 0) {
                          break L39;
                        } else {
                          var11 = stackIn_183_0;
                          L41: while (true) {
                            L42: {
                              L43: {
                                if (var11 >= 4) {
                                  break L43;
                                } else {
                                  stackOut_185_0 = 0;
                                  stackIn_195_0 = stackOut_185_0;
                                  stackIn_186_0 = stackOut_185_0;
                                  if (var13 != 0) {
                                    break L42;
                                  } else {
                                    var12 = stackIn_186_0;
                                    L44: while (true) {
                                      L45: {
                                        L46: {
                                          if (var12 >= 3) {
                                            break L46;
                                          } else {
                                            int incrementValue$35 = var10;
                                            var10++;
                                            var5_array[var9][incrementValue$35] = kg.field_d[var11][var12];
                                            var12++;
                                            if (var13 != 0) {
                                              break L45;
                                            } else {
                                              if (var13 == 0) {
                                                continue L44;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                        var11++;
                                        break L45;
                                      }
                                      if (var13 == 0) {
                                        continue L41;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_194_0 = 0;
                              stackIn_195_0 = stackOut_194_0;
                              break L42;
                            }
                            var11 = stackIn_195_0;
                            L47: while (true) {
                              L48: {
                                L49: {
                                  if (var11 >= 6) {
                                    break L49;
                                  } else {
                                    int incrementValue$36 = var10;
                                    var10++;
                                    var5_array[var9][incrementValue$36] = so.field_c[var11];
                                    var11++;
                                    if (var13 != 0) {
                                      break L48;
                                    } else {
                                      if (var13 == 0) {
                                        continue L47;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                }
                                var11 = 0;
                                break L48;
                              }
                              L50: while (true) {
                                L51: {
                                  L52: {
                                    if (var11 >= 16) {
                                      break L52;
                                    } else {
                                      var6[var9][var11] = b.field_f[var11];
                                      var11++;
                                      if (var13 != 0) {
                                        break L51;
                                      } else {
                                        if (var13 == 0) {
                                          continue L50;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  break L51;
                                }
                                if (var13 == 0) {
                                  continue L38;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    jb.field_z = new le(false, 0, 3, false, var4_ref_String__, 0, var5_array, var6, var7, 0, 0, false, 0, var8);
                    gj.a(ta.field_d, true, 14, -1);
                    stackOut_211_0 = 1;
                    stackIn_212_0 = stackOut_211_0;
                    break L39;
                  }
                  io.field_A = stackIn_212_0 != 0;
                  break L35;
                }
              }
            }
            L53: {
              if (-4 == mn.field_r) {
                L54: {
                  if (jh.field_c[0] == f.field_g) {
                    int discarded$37 = 3;
                    mi.a(jh.field_c[0]);
                    break L54;
                  } else {
                    break L54;
                  }
                }
                he.field_e.b((byte) -59, 64);
                var3_int = 0;
                L55: while (true) {
                  L56: {
                    L57: {
                      if (var3_int >= 4) {
                        break L57;
                      } else {
                        stackOut_225_0 = 0;
                        stackIn_235_0 = stackOut_225_0;
                        stackIn_226_0 = stackOut_225_0;
                        if (var13 != 0) {
                          break L56;
                        } else {
                          var4 = stackIn_226_0;
                          L58: while (true) {
                            L59: {
                              L60: {
                                if (var4 >= 3) {
                                  break L60;
                                } else {
                                  he.field_e.f(kg.field_d[var3_int][var4], (byte) -60);
                                  var4++;
                                  if (var13 != 0) {
                                    break L59;
                                  } else {
                                    if (var13 == 0) {
                                      continue L58;
                                    } else {
                                      break L60;
                                    }
                                  }
                                }
                              }
                              var3_int++;
                              break L59;
                            }
                            if (var13 == 0) {
                              continue L55;
                            } else {
                              break L57;
                            }
                          }
                        }
                      }
                    }
                    stackOut_234_0 = 0;
                    stackIn_235_0 = stackOut_234_0;
                    break L56;
                  }
                  var3_int = stackIn_235_0;
                  L61: while (true) {
                    L62: {
                      L63: {
                        if (var3_int >= 6) {
                          break L63;
                        } else {
                          he.field_e.f(so.field_c[var3_int], (byte) -81);
                          var3_int++;
                          if (var13 != 0) {
                            break L62;
                          } else {
                            if (var13 == 0) {
                              continue L61;
                            } else {
                              break L63;
                            }
                          }
                        }
                      }
                      var3_int = 0;
                      break L62;
                    }
                    L64: while (true) {
                      L65: {
                        L66: {
                          if (var3_int >= 16) {
                            break L66;
                          } else {
                            he.field_e.f(b.field_f[var3_int], (byte) -47);
                            var3_int++;
                            if (var13 != 0) {
                              break L65;
                            } else {
                              if (var13 == 0) {
                                continue L64;
                              } else {
                                break L66;
                              }
                            }
                          }
                        }
                        he.field_e.b((byte) -127, 9);
                        mn.field_r = si.field_g;
                        break L65;
                      }
                      kh.field_b = true;
                      break L53;
                    }
                  }
                }
              } else {
                break L53;
              }
            }
            L67: {
              if (mn.field_r == -5) {
                qc.a(false, wi.field_f.h((byte) 72), 11);
                oc.field_g = true;
                mn.field_r = si.field_g;
                break L67;
              } else {
                break L67;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ArcanistsMulti.RA(" + -89 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        gh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_G ? 1 : 0;
        try {
          L0: {
            ((ArcanistsMulti) this).a(true, 14, 19, 0, 5000, 9, 11, 8);
            ri.field_f = false;
            int discarded$3 = -9;
            gb.a();
            la.field_a = false;
            nm.field_h = -1;
            jf.field_j = 0;
            ua.field_P = 0;
            kg.field_a = false;
            cb.field_e = 0L;
            ta.field_b = false;
            var2_ref = new gh();
            var2_ref.b(128, 68, 9);
            int discarded$4 = 1;
            int discarded$5 = -22836;
            im.a(22050, var2_ref, fi.field_d, (java.awt.Component) (Object) on.field_c);
            pn.field_d = 16728128;
            wm.field_I = 16777215;
            ql.field_a = 0;
            ((ArcanistsMulti) this).a(false, true, false, true, true, (byte) -128, false);
            di.field_n[69] = 1;
            di.field_n[63] = 16;
            di.field_n[60] = 1;
            di.field_n[61] = 0;
            kg.field_d[0] = ld.field_n[0];
            di.field_n[62] = 2;
            di.field_n[57] = -2;
            di.field_n[70] = 1;
            di.field_n[79] = 2;
            di.field_n[66] = 4;
            di.field_n[77] = 0;
            di.field_n[64] = 0;
            di.field_n[65] = 1;
            di.field_n[68] = 1;
            di.field_n[71] = 1;
            di.field_n[73] = -1;
            di.field_n[78] = 4;
            di.field_n[67] = 2;
            di.field_n[74] = 11;
            di.field_n[58] = -2;
            he.field_a = new int[256];
            cj.field_g = new int[256];
            kg.field_d[3] = hi.field_b[0];
            kg.field_d[2] = ug.field_d[0];
            var3 = -120 % ((-68 - param0) / 33);
            kg.field_d[1] = ud.field_z[0];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (256 <= var4) {
                    break L3;
                  } else {
                    he.field_a[var4] = (var4 << 16) + var4;
                    cj.field_g[var4] = (var4 << 16) - (-(var4 / 2 << 8) - var4 / 4);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "ArcanistsMulti.E(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((ArcanistsMulti) this).a(an.field_f, "arcanistsmulti", an.field_j, (byte) -92, 15);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.init()");
        }
    }

    final void c(byte param0) {
        Object var2 = null;
        int var3_int = 0;
        qa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        qb var15 = null;
        kc var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object stackIn_3_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_92_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        uk stackOut_1_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_91_0 = 0;
        boolean stackOut_90_0 = false;
        L0: {
          var20 = field_G ? 1 : 0;
          if (null == ka.field_m) {
            stackOut_2_0 = on.field_c;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ka.field_m;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          ce.field_m.a(true);
          if (param0 == -89) {
            break L1;
          } else {
            ArcanistsMulti.a(66, (int[]) null, (dn) null, (String) null, 78L, -15, 110, (String) null, (kc) null);
            break L1;
          }
        }
        if (!oc.a(-15576)) {
          if (ue.field_e) {
            if (!hn.a((byte) 87)) {
              rb.a(mm.field_t, false, 100.0f);
              eg.a((java.awt.Canvas) var2, (byte) -62);
              return;
            } else {
              L2: {
                L3: {
                  this.m(param0 + 15522);
                  if (mn.field_r == si.field_g) {
                    break L3;
                  } else {
                    L4: {
                      if (-2 == si.field_g) {
                        break L4;
                      } else {
                        if (mn.field_r == -2) {
                          break L4;
                        } else {
                          L5: {
                            if (16 <= km.field_c) {
                              break L5;
                            } else {
                              ji.a(-2, false, si.field_g, cb.field_b);
                              tn.field_Fb = 256 * km.field_c / 16;
                              de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb / 2);
                              gn.a(256, (byte) 108, tn.field_Fb / 2, 0, pm.field_c);
                              gn.a(256, (byte) 97, tn.field_Fb / 2, an.field_f, an.field_j + -pm.field_c);
                              if (var20 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ji.a(-2, false, mn.field_r, io.field_A);
                          tn.field_Fb = (-(km.field_c * 256) + 8192) / 16;
                          gn.a(256, (byte) 86, tn.field_Fb, 0, pm.field_c);
                          gn.a(256, (byte) 78, tn.field_Fb, an.field_f, an.field_j + -pm.field_c);
                          gn.a(256, (byte) 97, tn.field_Fb, an.field_f / 2, an.field_j / 2);
                          if (var20 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L6: {
                      if (16 > km.field_c) {
                        break L6;
                      } else {
                        ji.a(-2, false, mn.field_r, io.field_A);
                        tn.field_Fb = (8192 + -(256 * km.field_c)) / 16;
                        de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                        if (var20 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ji.a(-2, false, si.field_g, cb.field_b);
                    tn.field_Fb = km.field_c * 256 / 16;
                    de.e(0, 0, an.field_f, an.field_j, 0, tn.field_Fb);
                    if (var20 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ji.a(-2, true, si.field_g, cb.field_b);
                break L2;
              }
              L7: {
                if (-2 == si.field_g) {
                  break L7;
                } else {
                  if (-2 == mn.field_r) {
                    break L7;
                  } else {
                    int discarded$9 = 99;
                    li.a();
                    break L7;
                  }
                }
              }
              L8: {
                L9: {
                  if (!cb.field_b) {
                    break L9;
                  } else {
                    if (!io.field_A) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  var3_int = ea.field_F * ea.field_F;
                  var4 = -(rd.field_b * rd.field_b) + var3_int;
                  var5 = -120 + (an.field_j - -(120 * var4 / var3_int));
                  rc.a(var5, -30218);
                  int discarded$10 = 29372;
                  to.a(gj.a(), (byte) 119);
                  if (si.field_g != -2) {
                    break L10;
                  } else {
                    L11: {
                      var3_int = (int)(Math.sin((double)jb.field_v * 0.2) * 8.0);
                      var4 = -(int)(Math.cos((double)jb.field_v * 0.2) * 5.0);
                      if (var4 <= 0) {
                        break L11;
                      } else {
                        var4 = 0;
                        break L11;
                      }
                    }
                    L12: {
                      var5 = -var3_int;
                      var6 = (int)(Math.cos(0.2 * (double)jb.field_v) * 5.0);
                      if (var6 <= 0) {
                        break L12;
                      } else {
                        var6 = 0;
                        break L12;
                      }
                    }
                    L13: {
                      var7 = (int)(Math.sin((double)jb.field_v * 0.1) * 8.0) + 16;
                      var8 = 0;
                      var9 = -(int)(8.0 * Math.sin(-0.1 + (double)jb.field_v * 0.1)) + -16;
                      var10 = 0;
                      var11 = (jb.field_v >> 9) % 24;
                      var12 = 32;
                      var13 = 160;
                      if (so.field_c[5] + so.field_c[2] + (so.field_c[0] - -so.field_c[1]) - (-so.field_c[3] - so.field_c[4]) != 0) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var14 = stackIn_46_0;
                        if ((jb.field_v & 1024) <= 0) {
                          break L15;
                        } else {
                          if ((1023 & -jb.field_v + 1024) < 512) {
                            break L14;
                          } else {
                            if (var14 == 0) {
                              break L14;
                            } else {
                              var10 = 0;
                              var6 = 0;
                              var11 = (jb.field_v >> 3) % 2;
                              var3_int = 0;
                              var5 = 0;
                              var8 = 0;
                              var9 = -16;
                              var4 = 0;
                              var7 = 16;
                              if (var20 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      if ((1023 & jb.field_v) < 512) {
                        break L14;
                      } else {
                        if (var14 == 0) {
                          break L14;
                        } else {
                          var3_int = 0;
                          var10 = 0;
                          var9 = -16;
                          var5 = 0;
                          var11 = (jb.field_v >> 3) % 2;
                          var4 = 0;
                          var7 = 16;
                          var6 = 0;
                          var8 = 0;
                          break L14;
                        }
                      }
                    }
                    L16: {
                      var15 = new qb(128, 256);
                      var15.a();
                      pc.a(kg.field_d[2], var8 + var13, kg.field_d[3], kg.field_d[0], (byte) 116, kg.field_d[1], qe.field_i[so.field_c[3]], var12 + var7);
                      pc.a(kg.field_d[2], var13 - -var4, kg.field_d[3], kg.field_d[0], (byte) -87, kg.field_d[1], fn.field_b[0], var3_int + var12);
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) 80, kg.field_d[1], jd.field_j[so.field_c[0]], var12);
                      var13 -= 8;
                      var13 -= 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -87, kg.field_d[1], kc.field_kb[so.field_c[1]], var12);
                      var13 += 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -90, kg.field_d[1], hn.field_d[so.field_c[5]], var12);
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -117, kg.field_d[1], bo.field_a[var11], var12);
                      var13 -= 16;
                      pc.a(kg.field_d[2], var13, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], tj.field_A[so.field_c[4]], var12);
                      var13 += 8;
                      var13 += 16;
                      pc.a(kg.field_d[2], var6 + var13, kg.field_d[3], kg.field_d[0], (byte) -113, kg.field_d[1], h.field_I[0], var12 - -var5);
                      pc.a(kg.field_d[2], var10 + var13, kg.field_d[3], kg.field_d[0], (byte) 122, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var12);
                      ce.field_m.a(true);
                      var16 = db.a(false);
                      if (null != var16) {
                        L17: {
                          var17 = var16.field_V - 202;
                          de.h(4 + var16.field_V, var16.field_nb - -4, -4 + (var16.field_x - -var16.field_V), var16.field_nb + (var16.field_I - 4));
                          var18 = -480 + an.field_j;
                          if (qf.field_d >= 2) {
                            break L17;
                          } else {
                            L18: {
                              L19: {
                                var19 = var18 + 87;
                                if (0 < (1024 & jb.field_v)) {
                                  break L19;
                                } else {
                                  L20: {
                                    L21: {
                                      var12 = 1023 & jb.field_v;
                                      if (512 > var12) {
                                        break L21;
                                      } else {
                                        if (var14 != 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    var15.c(var12 + var17, var19);
                                    if (var20 == 0) {
                                      break L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var12 = 512;
                                  de.e(-4 + (-300 + var12) + var17, 78 + var13 + var18, 308, 64, 0, 192);
                                  int discarded$11 = mi.field_B.a(io.field_x, var17 + (-300 + var12), var13 + (80 - -var18), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                                  var15.e(var12 + var17, var19);
                                  if (var20 == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L22: {
                                var12 = -(1023 & jb.field_v) + 1024;
                                if (var12 < 512) {
                                  break L22;
                                } else {
                                  if (var14 == 0) {
                                    break L22;
                                  } else {
                                    var12 = 512;
                                    de.e(var17 + var12 - 304, var18 + 78 + var13, 308, 64, 0, 192);
                                    int discarded$12 = mi.field_B.a(io.field_x, var17 + var12 - 300, var18 + (var13 - -80), 300, 64, 16777215, -1, 1, 1, mi.field_B.field_C);
                                    break L22;
                                  }
                                }
                              }
                              var15.e(var17 + var12, var19);
                              break L18;
                            }
                            if (var20 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L23: {
                          var12 = 512;
                          de.e(var12 - (300 - var17), 78 + var13 + 20 + var18, 424, 64, 0, 128);
                          var19 = 16737792;
                          if ((jb.field_v & 64) <= 0) {
                            break L23;
                          } else {
                            var19 = 16777215;
                            break L23;
                          }
                        }
                        int discarded$13 = mi.field_B.a("If you are playing with super mod powers, remember that the 'Mark of Fame' achievement is meant to be a CHALLENGE. Do not create games of over 3 players if you are not competent at the game. Never play with more than 4 players as you CANNOT win! Kill Seas and Nature players at ALL costs. Most of all, good luck!", -300 + var12 - -var17, 91 + var13 + var18, 424, 64, var19, -1, 1, 1, -2 + mi.field_B.field_C);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    de.a();
                    break L10;
                  }
                }
                int discarded$14 = 29372;
                uh.a(gj.a(), 115);
                int discarded$15 = 29372;
                le.c(1, gj.a());
                break L8;
              }
              L24: {
                var3 = (qa) (Object) b.field_a.b(12623);
                if (var3 != null) {
                  L25: {
                    L26: {
                      var5 = wi.field_h;
                      if (80 > var5) {
                        break L26;
                      } else {
                        L27: {
                          if (230 > var5) {
                            break L27;
                          } else {
                            var4 = -(var5 / 2) + 123;
                            if (var20 == 0) {
                              break L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var4 = 8;
                        if (var20 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    var4 = -32 + var5 / 2;
                    break L25;
                  }
                  de.a(4, -4 + var4, tj.field_t.b(rb.field_n[var3.field_n]) + 56, 40, 0);
                  de.a(5, var4 + -3, 54 + tj.field_t.b(rb.field_n[var3.field_n]), 38, 16741888);
                  de.a(6, var4 - 2, tj.field_t.b(rb.field_n[var3.field_n]) + 52, 36, 0);
                  mo.field_a[var3.field_n].c(8, var4, 32, 32);
                  tj.field_t.a(rb.field_n[var3.field_n], 47, tj.field_t.field_C + var4, 0, 0);
                  tj.field_t.a(rb.field_n[var3.field_n], 48, -1 + (var4 + tj.field_t.field_C), 0, 0);
                  tj.field_t.a(rb.field_n[var3.field_n], 48, tj.field_t.field_C + var4, 16746496, -1);
                  break L24;
                } else {
                  break L24;
                }
              }
              L28: {
                L29: {
                  if (!rc.b(param0 ^ 88)) {
                    break L29;
                  } else {
                    L30: {
                      if (null != ka.field_m) {
                        stackOut_91_0 = 1;
                        stackIn_92_0 = stackOut_91_0;
                        break L30;
                      } else {
                        stackOut_90_0 = ie.field_Pb;
                        stackIn_92_0 = stackOut_90_0 ? 1 : 0;
                        break L30;
                      }
                    }
                    ke.a(stackIn_92_0 != 0, 4474111);
                    if (var20 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                int discarded$16 = -5;
                if (!um.a()) {
                  break L28;
                } else {
                  de.b(0, 0, de.field_e, de.field_j);
                  eb.a(kf.field_b, kf.field_b[0].field_y, -117, kf.field_b[0].field_q);
                  break L28;
                }
              }
              L31: {
                if (ii.field_c != ii.field_a) {
                  var4 = u.field_i * 256 / 16;
                  if (var4 > 0) {
                    de.e(0, 0, de.field_e, de.field_j, 0, var4);
                    break L31;
                  } else {
                    break L31;
                  }
                } else {
                  break L31;
                }
              }
              int discarded$17 = 91;
              ma.i();
              kn.a((java.awt.Canvas) var2, (byte) -126, 0, 0);
              return;
            }
          } else {
            eg.a((java.awt.Canvas) var2, (byte) -29);
            return;
          }
        } else {
          kh.a((byte) 14, (java.awt.Canvas) var2, hk.c(0));
          return;
        }
    }

    final static void a(eg param0, byte param1) {
        RuntimeException var2 = null;
        ab var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = new ab(param0.a("", "logo.fo3d", -1));
            var3 = var2_ref.e((byte) -121);
            var2_ref.p(param1 + 166);
            ph.field_e = ma.a((byte) -101, var2_ref);
            gn.field_g = new int[var3][];
            oo.field_u = new vg[var3];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3 >= ~var4) {
                    break L3;
                  } else {
                    oo.field_u[var4] = rn.a(true, var2_ref);
                    var4++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_ref.r(param1 + 80);
                break L2;
              }
              var4 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (~var3 >= ~var4) {
                      break L6;
                    } else {
                      var5 = oo.field_u[var4];
                      var5.a(6, 0, 1, 6, 6);
                      var5.b((byte) 62);
                      var6 = new int[]{var5.field_k - -var5.field_i >> 1, var5.field_v + var5.field_R >> 1, var5.field_N + var5.field_P >> 1};
                      gn.field_g[var4] = var6;
                      var5.a(-var6[1], (byte) -124, -var6[2], -var6[0]);
                      var4++;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param1 == -80) {
                    break L5;
                  } else {
                    field_H = null;
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ArcanistsMulti.WA(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    public ArcanistsMulti() {
    }

    final static void a(int param0, byte param1) {
        try {
            int var2_int = 84 % ((param1 - 57) / 54);
            gl.a(28 - -(sc.field_U[param0] * wl.field_L[param0].length), -8 + lm.field_e[param0], -27327, 14 - (-eo.field_b[param0] - -lm.field_e[param0]), kf.field_b, tg.field_f[param0] - 16);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(byte param0) {
        try {
            field_H = null;
            field_F = null;
            if (param0 != -91) {
                ArcanistsMulti.j((byte) 24);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ArcanistsMulti.MA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var3 = 0;
        L0: {
          var3 = field_G ? 1 : 0;
          if (param0 == 15433) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        if (0 == jo.field_c) {
          L1: {
            pi.field_e = ee.field_a;
            if (null != jh.field_c[0]) {
              break L1;
            } else {
              if (tc.field_x.a(true, "arcanists_titlescreen", "")) {
                jh.field_c[0] = ha.a(tc.field_x, "", "arcanists_titlescreen");
                jo.field_c = 1;
                boolean discarded$11 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[0], -123);
                int discarded$12 = 3;
                mi.a(jh.field_c[0]);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          if (wn.field_C < 52) {
            L2: {
              L3: {
                L4: {
                  if (wn.field_C != 0) {
                    break L4;
                  } else {
                    if (ue.field_d.a(true, "imp", "streamed")) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (wn.field_C != 1) {
                    break L5;
                  } else {
                    if (!ue.field_d.a(true, "arcaneexplosion", "streamed")) {
                      break L5;
                    } else {
                      cn.field_N = pk.a("streamed", param0 ^ 15433, "arcaneexplosion", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (wn.field_C != 2) {
                    break L6;
                  } else {
                    if (!ue.field_d.a(true, "flameexplosion", "streamed")) {
                      break L6;
                    } else {
                      sn.field_E = pk.a("streamed", 0, "flameexplosion", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (wn.field_C != 3) {
                      break L8;
                    } else {
                      if (ue.field_d.a(true, "smokeexplosion", "streamed")) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (wn.field_C != 4) {
                      break L9;
                    } else {
                      if (!ue.field_d.a(true, "flamepuff", "streamed")) {
                        break L9;
                      } else {
                        ee.field_b = pk.a("streamed", param0 + -15433, "flamepuff", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    if (wn.field_C != 5) {
                      break L10;
                    } else {
                      if (!ue.field_d.a(true, "smokepuff", "streamed")) {
                        break L10;
                      } else {
                        vi.field_M = pk.a("streamed", 0, "smokepuff", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (wn.field_C != 6) {
                        break L12;
                      } else {
                        if (ue.field_d.a(true, "stormpuff", "streamed")) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (wn.field_C != 7) {
                        break L13;
                      } else {
                        if (!ue.field_d.a(true, "stormexplosion", "streamed")) {
                          break L13;
                        } else {
                          u.field_j = pk.a("streamed", param0 + -15433, "stormexplosion", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      if (wn.field_C != 8) {
                        break L14;
                      } else {
                        if (!ue.field_d.a(true, "cyclopstest", "streamed")) {
                          break L14;
                        } else {
                          gb.field_c = pk.a("streamed", 0, "cyclopstest", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        if (wn.field_C != 9) {
                          break L16;
                        } else {
                          if (ue.field_d.a(true, "sylph", "streamed")) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (wn.field_C != 10) {
                          break L17;
                        } else {
                          if (!ue.field_d.a(true, "frostgiant", "streamed")) {
                            break L17;
                          } else {
                            ea.field_v = pk.a("streamed", 0, "frostgiant", ue.field_d);
                            wn.field_C = wn.field_C + 1;
                            pi.field_e = vm.field_f;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L18: {
                        L19: {
                          if (wn.field_C != 11) {
                            break L19;
                          } else {
                            if (ue.field_d.a(true, "dwarf", "streamed")) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          L21: {
                            if (12 != wn.field_C) {
                              break L21;
                            } else {
                              if (ue.field_d.a(true, "clockworkrecallsoldier", "streamed")) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          L22: {
                            L23: {
                              if (wn.field_C != 13) {
                                break L23;
                              } else {
                                if (ue.field_d.a(true, "golem", "streamed")) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              L25: {
                                if (wn.field_C != 14) {
                                  break L25;
                                } else {
                                  if (ue.field_d.a(true, "flamedragon", "streamed")) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              L26: {
                                L27: {
                                  if (15 != wn.field_C) {
                                    break L27;
                                  } else {
                                    if (ue.field_d.a(true, "frostdragon", "streamed")) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                L28: {
                                  if (wn.field_C != 16) {
                                    break L28;
                                  } else {
                                    if (!ue.field_d.a(true, "stormdragon", "streamed")) {
                                      break L28;
                                    } else {
                                      jk.field_m = pk.a("streamed", 0, "stormdragon", ue.field_d);
                                      wn.field_C = wn.field_C + 1;
                                      if (var3 == 0) {
                                        break L2;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                L29: {
                                  L30: {
                                    if (wn.field_C != 17) {
                                      break L30;
                                    } else {
                                      if (ue.field_d.a(true, "zombiedragon", "streamed")) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (wn.field_C != 18) {
                                      break L31;
                                    } else {
                                      if (!ue.field_d.a(true, "clockworkdragon", "streamed")) {
                                        break L31;
                                      } else {
                                        ub.field_e = pk.a("streamed", 0, "clockworkdragon", ue.field_d);
                                        wn.field_C = wn.field_C + 1;
                                        if (var3 == 0) {
                                          break L2;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                  L32: {
                                    L33: {
                                      if (wn.field_C != 19) {
                                        break L33;
                                      } else {
                                        if (ue.field_d.a(true, "brinegoblin", "streamed")) {
                                          break L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (20 != wn.field_C) {
                                          break L35;
                                        } else {
                                          if (ue.field_d.a(true, "ent", "streamed")) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      L36: {
                                        L37: {
                                          if (wn.field_C != 21) {
                                            break L37;
                                          } else {
                                            if (ue.field_d.a(true, "elf", "streamed")) {
                                              break L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        L38: {
                                          L39: {
                                            if (wn.field_C != 22) {
                                              break L39;
                                            } else {
                                              if (ue.field_d.a(true, "monkey", "streamed")) {
                                                break L38;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          L40: {
                                            L41: {
                                              if (wn.field_C != 23) {
                                                break L41;
                                              } else {
                                                if (ue.field_d.a(true, "darkknight", "streamed")) {
                                                  break L40;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                            L42: {
                                              if (wn.field_C != 24) {
                                                break L42;
                                              } else {
                                                if (!ue.field_d.a(true, "wraith", "streamed")) {
                                                  break L42;
                                                } else {
                                                  pm.field_d = pk.a("streamed", 0, "wraith", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                            }
                                            L43: {
                                              L44: {
                                                if (wn.field_C != 25) {
                                                  break L44;
                                                } else {
                                                  if (ue.field_d.a(true, "swarm", "streamed")) {
                                                    break L43;
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              L45: {
                                                L46: {
                                                  if (26 != wn.field_C) {
                                                    break L46;
                                                  } else {
                                                    if (ue.field_d.a(true, "pixies", "streamed")) {
                                                      break L45;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                L47: {
                                                  if (27 != wn.field_C) {
                                                    break L47;
                                                  } else {
                                                    if (!ue.field_d.a(true, "paladin", "streamed")) {
                                                      break L47;
                                                    } else {
                                                      qj.field_d = pk.a("streamed", 0, "paladin", ue.field_d);
                                                      wn.field_C = wn.field_C + 1;
                                                      if (var3 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                }
                                                L48: {
                                                  L49: {
                                                    if (wn.field_C != 28) {
                                                      break L49;
                                                    } else {
                                                      if (ue.field_d.a(true, "pegasus", "streamed")) {
                                                        break L48;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                  }
                                                  L50: {
                                                    if (29 != wn.field_C) {
                                                      break L50;
                                                    } else {
                                                      if (!ue.field_d.a(true, "phoenix", "streamed")) {
                                                        break L50;
                                                      } else {
                                                        gi.field_m = pk.a("streamed", param0 + -15433, "phoenix", ue.field_d);
                                                        wn.field_C = wn.field_C + 1;
                                                        if (var3 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L50;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L51: {
                                                    L52: {
                                                      if (wn.field_C != 30) {
                                                        break L52;
                                                      } else {
                                                        if (ue.field_d.a(true, "watertroll", "streamed")) {
                                                          break L51;
                                                        } else {
                                                          break L52;
                                                        }
                                                      }
                                                    }
                                                    L53: {
                                                      if (wn.field_C != 31) {
                                                        break L53;
                                                      } else {
                                                        if (!ue.field_d.a(true, "freshwatertroll", "streamed")) {
                                                          break L53;
                                                        } else {
                                                          c.field_a = pk.a("streamed", 0, "freshwatertroll", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L53;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L54: {
                                                      if (wn.field_C != 32) {
                                                        break L54;
                                                      } else {
                                                        if (!ue.field_d.a(true, "hardwatertroll", "streamed")) {
                                                          break L54;
                                                        } else {
                                                          vm.field_g = pk.a("streamed", 0, "hardwatertroll", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L54;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L55: {
                                                      L56: {
                                                        if (wn.field_C != 33) {
                                                          break L56;
                                                        } else {
                                                          if (ue.field_d.a(true, "waterlord", "streamed")) {
                                                            break L55;
                                                          } else {
                                                            break L56;
                                                          }
                                                        }
                                                      }
                                                      L57: {
                                                        L58: {
                                                          if (wn.field_C != 34) {
                                                            break L58;
                                                          } else {
                                                            if (ue.field_d.a(true, "flameshield", "streamed")) {
                                                              break L57;
                                                            } else {
                                                              break L58;
                                                            }
                                                          }
                                                        }
                                                        L59: {
                                                          L60: {
                                                            if (wn.field_C != 35) {
                                                              break L60;
                                                            } else {
                                                              if (ue.field_d.a(true, "clockworkexplosion", "streamed")) {
                                                                break L59;
                                                              } else {
                                                                break L60;
                                                              }
                                                            }
                                                          }
                                                          L61: {
                                                            if (wn.field_C != 36) {
                                                              break L61;
                                                            } else {
                                                              if (!ue.field_d.a(true, "clockworkpuff", "streamed")) {
                                                                break L61;
                                                              } else {
                                                                wh.field_k = pk.a("streamed", param0 ^ 15433, "clockworkpuff", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L61;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L62: {
                                                            if (wn.field_C != 37) {
                                                              break L62;
                                                            } else {
                                                              if (!ue.field_d.a(true, "windshield", "streamed")) {
                                                                break L62;
                                                              } else {
                                                                pk.field_a = pk.a("streamed", 0, "windshield", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L62;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L63: {
                                                            if (wn.field_C != 38) {
                                                              break L63;
                                                            } else {
                                                              if (!ue.field_d.a(true, "stormshield", "streamed")) {
                                                                break L63;
                                                              } else {
                                                                i.field_a = pk.a("streamed", 0, "stormshield", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L63;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L64: {
                                                            if (wn.field_C != 39) {
                                                              break L64;
                                                            } else {
                                                              if (!ue.field_d.a(true, "flamewall", "streamed")) {
                                                                break L64;
                                                              } else {
                                                                cj.field_f = pk.a("streamed", param0 + -15433, "flamewall", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L64;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L65: {
                                                            if (40 != wn.field_C) {
                                                              break L65;
                                                            } else {
                                                              if (!ue.field_d.a(true, "stonepuff", "streamed")) {
                                                                break L65;
                                                              } else {
                                                                nm.field_c = pk.a("streamed", 0, "stonepuff", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L65;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L66: {
                                                            L67: {
                                                              if (41 != wn.field_C) {
                                                                break L67;
                                                              } else {
                                                                if (ue.field_d.a(true, "frostpuff", "streamed")) {
                                                                  break L66;
                                                                } else {
                                                                  break L67;
                                                                }
                                                              }
                                                            }
                                                            L68: {
                                                              L69: {
                                                                if (wn.field_C != 42) {
                                                                  break L69;
                                                                } else {
                                                                  if (ue.field_d.a(true, "underexplosion", "streamed")) {
                                                                    break L68;
                                                                  } else {
                                                                    break L69;
                                                                  }
                                                                }
                                                              }
                                                              L70: {
                                                                if (43 != wn.field_C) {
                                                                  break L70;
                                                                } else {
                                                                  if (!ue.field_d.a(true, "skullexplosion", "streamed")) {
                                                                    break L70;
                                                                  } else {
                                                                    o.field_E = pk.a("streamed", 0, "skullexplosion", ue.field_d);
                                                                    wn.field_C = wn.field_C + 1;
                                                                    if (var3 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L70;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L71: {
                                                                if (wn.field_C != 44) {
                                                                  break L71;
                                                                } else {
                                                                  if (!ue.field_d.a(true, "thornexplosion", "streamed")) {
                                                                    break L71;
                                                                  } else {
                                                                    si.field_p = pk.a("streamed", 0, "thornexplosion", ue.field_d);
                                                                    wn.field_C = wn.field_C + 1;
                                                                    if (var3 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L71;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L72: {
                                                                L73: {
                                                                  if (wn.field_C != 45) {
                                                                    break L73;
                                                                  } else {
                                                                    if (ue.field_d.a(true, "vineexplosion", "streamed")) {
                                                                      break L72;
                                                                    } else {
                                                                      break L73;
                                                                    }
                                                                  }
                                                                }
                                                                L74: {
                                                                  if (wn.field_C != 46) {
                                                                    break L74;
                                                                  } else {
                                                                    if (!ue.field_d.a(true, "vinepuff", "streamed")) {
                                                                      break L74;
                                                                    } else {
                                                                      vl.field_i = pk.a("streamed", param0 ^ 15433, "vinepuff", ue.field_d);
                                                                      wn.field_C = wn.field_C + 1;
                                                                      if (var3 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L74;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                L75: {
                                                                  L76: {
                                                                    if (47 != wn.field_C) {
                                                                      break L76;
                                                                    } else {
                                                                      if (ue.field_d.a(true, "waterexplosion", "streamed")) {
                                                                        break L75;
                                                                      } else {
                                                                        break L76;
                                                                      }
                                                                    }
                                                                  }
                                                                  L77: {
                                                                    if (48 != wn.field_C) {
                                                                      break L77;
                                                                    } else {
                                                                      if (!ue.field_d.a(true, "brineexplosion", "streamed")) {
                                                                        break L77;
                                                                      } else {
                                                                        ea.field_H = pk.a("streamed", 0, "brineexplosion", ue.field_d);
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L77;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  L78: {
                                                                    if (49 != wn.field_C) {
                                                                      break L78;
                                                                    } else {
                                                                      if (!ue.field_d.a(true, "stoneexplosion", "streamed")) {
                                                                        break L78;
                                                                      } else {
                                                                        ie.field_Tb = pk.a("streamed", 0, "stoneexplosion", ue.field_d);
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L78;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  L79: {
                                                                    L80: {
                                                                      if (wn.field_C != 50) {
                                                                        break L80;
                                                                      } else {
                                                                        if (ue.field_d.a(true, "frostexplosion", "streamed")) {
                                                                          break L79;
                                                                        } else {
                                                                          break L80;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (wn.field_C != 51) {
                                                                      break L2;
                                                                    } else {
                                                                      if (ue.field_d.a(true, "watersplash", "streamed")) {
                                                                        ob.field_db = pk.a("streamed", 0, "watersplash", ue.field_d);
                                                                        pi.field_e = vi.field_Q;
                                                                        wn.field_C = wn.field_C + 1;
                                                                        if (var3 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L79;
                                                                        }
                                                                      } else {
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                  lf.field_e = pk.a("streamed", 0, "frostexplosion", ue.field_d);
                                                                  wn.field_C = wn.field_C + 1;
                                                                  if (var3 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L75;
                                                                  }
                                                                }
                                                                mb.field_cb = pk.a("streamed", param0 + -15433, "waterexplosion", ue.field_d);
                                                                wn.field_C = wn.field_C + 1;
                                                                if (var3 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L72;
                                                                }
                                                              }
                                                              rf.field_j = pk.a("streamed", param0 + -15433, "vineexplosion", ue.field_d);
                                                              wn.field_C = wn.field_C + 1;
                                                              if (var3 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L68;
                                                              }
                                                            }
                                                            jg.field_l = pk.a("streamed", 0, "underexplosion", ue.field_d);
                                                            wn.field_C = wn.field_C + 1;
                                                            if (var3 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L66;
                                                            }
                                                          }
                                                          kl.field_G = pk.a("streamed", 0, "frostpuff", ue.field_d);
                                                          wn.field_C = wn.field_C + 1;
                                                          if (var3 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L59;
                                                          }
                                                        }
                                                        je.field_a = pk.a("streamed", 0, "clockworkexplosion", ue.field_d);
                                                        wn.field_C = wn.field_C + 1;
                                                        if (var3 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L57;
                                                        }
                                                      }
                                                      cn.field_S = pk.a("streamed", param0 ^ 15433, "flameshield", ue.field_d);
                                                      wn.field_C = wn.field_C + 1;
                                                      if (var3 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L55;
                                                      }
                                                    }
                                                    nj.field_k = pk.a("streamed", param0 + -15433, "waterlord", ue.field_d);
                                                    wn.field_C = wn.field_C + 1;
                                                    if (var3 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                  g.field_f = pk.a("streamed", param0 ^ 15433, "watertroll", ue.field_d);
                                                  wn.field_C = wn.field_C + 1;
                                                  if (var3 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L48;
                                                  }
                                                }
                                                ra.field_c = pk.a("streamed", 0, "pegasus", ue.field_d);
                                                wn.field_C = wn.field_C + 1;
                                                if (var3 == 0) {
                                                  break L2;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                              oe.field_d = pk.a("streamed", 0, "pixies", ue.field_d);
                                              wn.field_C = wn.field_C + 1;
                                              if (var3 == 0) {
                                                break L2;
                                              } else {
                                                break L43;
                                              }
                                            }
                                            wl.field_U = pk.a("streamed", 0, "swarm", ue.field_d);
                                            wn.field_C = wn.field_C + 1;
                                            if (var3 == 0) {
                                              break L2;
                                            } else {
                                              break L40;
                                            }
                                          }
                                          ra.field_j = pk.a("streamed", param0 + -15433, "darkknight", ue.field_d);
                                          wn.field_C = wn.field_C + 1;
                                          if (var3 == 0) {
                                            break L2;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        e.field_I = pk.a("streamed", 0, "monkey", ue.field_d);
                                        wn.field_C = wn.field_C + 1;
                                        if (var3 == 0) {
                                          break L2;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      jk.field_n = pk.a("streamed", 0, "elf", ue.field_d);
                                      wn.field_C = wn.field_C + 1;
                                      if (var3 == 0) {
                                        break L2;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    vk.field_w = pk.a("streamed", 0, "ent", ue.field_d);
                                    wn.field_C = wn.field_C + 1;
                                    if (var3 == 0) {
                                      break L2;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  ml.field_v = pk.a("streamed", 0, "brinegoblin", ue.field_d);
                                  wn.field_C = wn.field_C + 1;
                                  if (var3 == 0) {
                                    break L2;
                                  } else {
                                    break L29;
                                  }
                                }
                                ff.field_b = pk.a("streamed", 0, "zombiedragon", ue.field_d);
                                wn.field_C = wn.field_C + 1;
                                if (var3 == 0) {
                                  break L2;
                                } else {
                                  break L26;
                                }
                              }
                              bk.field_L = pk.a("streamed", param0 ^ 15433, "frostdragon", ue.field_d);
                              wn.field_C = wn.field_C + 1;
                              if (var3 == 0) {
                                break L2;
                              } else {
                                break L24;
                              }
                            }
                            rc.field_d = pk.a("streamed", 0, "flamedragon", ue.field_d);
                            wn.field_C = wn.field_C + 1;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L22;
                            }
                          }
                          i.field_g = pk.a("streamed", param0 ^ 15433, "golem", ue.field_d);
                          wn.field_C = wn.field_C + 1;
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L20;
                          }
                        }
                        fe.field_h = pk.a("streamed", 0, "clockworkrecallsoldier", ue.field_d);
                        wn.field_C = wn.field_C + 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L18;
                        }
                      }
                      dh.field_Jb = pk.a("streamed", 0, "dwarf", ue.field_d);
                      wn.field_C = wn.field_C + 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L15;
                      }
                    }
                    bj.field_ob = pk.a("streamed", 0, "sylph", ue.field_d);
                    wn.field_C = wn.field_C + 1;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L11;
                    }
                  }
                  fd.field_j = pk.a("streamed", 0, "stormpuff", ue.field_d);
                  wn.field_C = wn.field_C + 1;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
                pa.field_a = pk.a("streamed", 0, "smokeexplosion", ue.field_d);
                wn.field_C = wn.field_C + 1;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              fb.field_a = pk.a("streamed", 0, "imp", ue.field_d);
              wn.field_C = wn.field_C + 1;
              break L2;
            }
            return;
          } else {
            if (be.field_f < 56) {
              if (ck.field_b.c(-10923)) {
                if (!wh.field_l.c(-10923)) {
                  return;
                } else {
                  L81: {
                    if (null == ck.field_b) {
                      break L81;
                    } else {
                      if (be.field_f < 18) {
                        L82: {
                          if (be.field_f != 0) {
                            break L82;
                          } else {
                            L83: {
                              if (!ck.field_b.a("spell_select", -24417)) {
                                break L83;
                              } else {
                                if (!wh.field_l.a("spell_select", -24417)) {
                                  break L83;
                                } else {
                                  break L82;
                                }
                              }
                            }
                            return;
                          }
                        }
                        L84: {
                          L85: {
                            pi.field_e = vi.field_Q;
                            if (0 == be.field_f) {
                              break L85;
                            } else {
                              L86: {
                                if (1 == be.field_f) {
                                  break L86;
                                } else {
                                  L87: {
                                    if (be.field_f == 2) {
                                      break L87;
                                    } else {
                                      L88: {
                                        if (be.field_f == 3) {
                                          break L88;
                                        } else {
                                          L89: {
                                            if (be.field_f != 4) {
                                              break L89;
                                            } else {
                                              be.field_f = 5;
                                              this.a(92, th.field_g[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_overlight").c(), to.field_r, false, cf.field_h);
                                              if (var3 == 0) {
                                                break L84;
                                              } else {
                                                break L89;
                                              }
                                            }
                                          }
                                          L90: {
                                            if (be.field_f == 5) {
                                              break L90;
                                            } else {
                                              L91: {
                                                if (be.field_f != 6) {
                                                  break L91;
                                                } else {
                                                  be.field_f = 7;
                                                  this.a(255, th.field_g[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_sea").a(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L91;
                                                  }
                                                }
                                              }
                                              L92: {
                                                if (be.field_f != 7) {
                                                  break L92;
                                                } else {
                                                  be.field_f = 8;
                                                  this.a(255, th.field_g[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_nature").a(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L92;
                                                  }
                                                }
                                              }
                                              L93: {
                                                if (be.field_f == 8) {
                                                  break L93;
                                                } else {
                                                  L94: {
                                                    if (9 == be.field_f) {
                                                      break L94;
                                                    } else {
                                                      L95: {
                                                        if (be.field_f == 10) {
                                                          break L95;
                                                        } else {
                                                          L96: {
                                                            if (11 != be.field_f) {
                                                              break L96;
                                                            } else {
                                                              be.field_f = 12;
                                                              this.a(89, qo.field_a[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_storm").c(), to.field_r, false, cf.field_h);
                                                              if (var3 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L96;
                                                              }
                                                            }
                                                          }
                                                          L97: {
                                                            if (be.field_f == 12) {
                                                              break L97;
                                                            } else {
                                                              L98: {
                                                                if (be.field_f == 13) {
                                                                  break L98;
                                                                } else {
                                                                  L99: {
                                                                    if (be.field_f != 14) {
                                                                      break L99;
                                                                    } else {
                                                                      be.field_f = 15;
                                                                      this.a(59, qo.field_a[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_underdark").c(), to.field_r, false, cf.field_h);
                                                                      if (var3 == 0) {
                                                                        break L84;
                                                                      } else {
                                                                        break L99;
                                                                      }
                                                                    }
                                                                  }
                                                                  L100: {
                                                                    if (be.field_f == 15) {
                                                                      break L100;
                                                                    } else {
                                                                      L101: {
                                                                        if (be.field_f != 16) {
                                                                          break L101;
                                                                        } else {
                                                                          be.field_f = 17;
                                                                          this.a(255, qo.field_a[6], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_nature").a(), to.field_r, false, cf.field_h);
                                                                          if (var3 == 0) {
                                                                            break L84;
                                                                          } else {
                                                                            break L101;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (be.field_f == 17) {
                                                                        be.field_f = 18;
                                                                        this.a(255, qo.field_a[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_cog").a(), to.field_r, false, cf.field_h);
                                                                        if (var3 == 0) {
                                                                          break L84;
                                                                        } else {
                                                                          break L100;
                                                                        }
                                                                      } else {
                                                                        break L84;
                                                                      }
                                                                    }
                                                                  }
                                                                  be.field_f = 16;
                                                                  this.a(255, qo.field_a[7], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_sea").a(), to.field_r, false, cf.field_h);
                                                                  if (var3 == 0) {
                                                                    break L84;
                                                                  } else {
                                                                    break L98;
                                                                  }
                                                                }
                                                              }
                                                              be.field_f = 14;
                                                              this.a(95, qo.field_a[5], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_overlight").c(), to.field_r, false, cf.field_h);
                                                              if (var3 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L97;
                                                              }
                                                            }
                                                          }
                                                          be.field_f = 13;
                                                          this.a(103, qo.field_a[1], pl.a(wh.field_l, "spell_select", "arcanists_select_spellbook_rock").a(), to.field_r, false, cf.field_h);
                                                          if (var3 == 0) {
                                                            break L84;
                                                          } else {
                                                            break L95;
                                                          }
                                                        }
                                                      }
                                                      be.field_f = 11;
                                                      this.a(98, qo.field_a[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_frost").c(), to.field_r, false, cf.field_h);
                                                      if (var3 == 0) {
                                                        break L84;
                                                      } else {
                                                        break L94;
                                                      }
                                                    }
                                                  }
                                                  be.field_f = 10;
                                                  this.a(87, qo.field_a[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spellbook_flame").c(), to.field_r, false, cf.field_h);
                                                  if (var3 == 0) {
                                                    break L84;
                                                  } else {
                                                    break L93;
                                                  }
                                                }
                                              }
                                              be.field_f = 9;
                                              this.a(255, th.field_g[8], pl.a(wh.field_l, "spell_select", "arcanists_select_spell_cog").a(), to.field_r, false, cf.field_h);
                                              if (var3 == 0) {
                                                break L84;
                                              } else {
                                                break L90;
                                              }
                                            }
                                          }
                                          be.field_f = 6;
                                          this.a(75, th.field_g[4], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_underdark").c(), to.field_r, false, cf.field_h);
                                          if (var3 == 0) {
                                            break L84;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                      be.field_f = 4;
                                      this.a(105, th.field_g[1], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_rock").c(), to.field_r, false, cf.field_h);
                                      if (var3 == 0) {
                                        break L84;
                                      } else {
                                        break L87;
                                      }
                                    }
                                  }
                                  be.field_f = 3;
                                  this.a(125, th.field_g[2], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_storm").c(), to.field_r, false, cf.field_h);
                                  if (var3 == 0) {
                                    break L84;
                                  } else {
                                    break L86;
                                  }
                                }
                              }
                              be.field_f = 2;
                              this.a(182, th.field_g[3], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_frost").c(), to.field_r, false, cf.field_h);
                              if (var3 == 0) {
                                break L84;
                              } else {
                                break L85;
                              }
                            }
                          }
                          be.field_f = 1;
                          this.a(54, th.field_g[0], ai.a(ck.field_b, "spell_select", "arcanists_select_spell_flame").c(), to.field_r, false, cf.field_h);
                          break L84;
                        }
                        return;
                      } else {
                        if (be.field_f < 44) {
                          L102: {
                            if (18 != be.field_f) {
                              break L102;
                            } else {
                              L103: {
                                if (!ck.field_b.a("spell_impact", -24417)) {
                                  break L103;
                                } else {
                                  if (!wh.field_l.a("spell_impact", param0 + -39850)) {
                                    break L103;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                              return;
                            }
                          }
                          L104: {
                            L105: {
                              pi.field_e = ee.field_a;
                              if (be.field_f == 18) {
                                break L105;
                              } else {
                                L106: {
                                  if (be.field_f != 19) {
                                    break L106;
                                  } else {
                                    be.field_f = 20;
                                    this.a(148, nn.field_n[0][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_2").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L106;
                                    }
                                  }
                                }
                                L107: {
                                  if (be.field_f != 20) {
                                    break L107;
                                  } else {
                                    be.field_f = 21;
                                    this.a(55, nn.field_n[0][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_flame_impact_3").a(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                                L108: {
                                  if (be.field_f == 21) {
                                    break L108;
                                  } else {
                                    L109: {
                                      if (be.field_f == 22) {
                                        break L109;
                                      } else {
                                        L110: {
                                          if (be.field_f != 23) {
                                            break L110;
                                          } else {
                                            be.field_f = 24;
                                            this.a(232, nn.field_n[3][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_3").a(), to.field_r, false, cf.field_h);
                                            if (var3 == 0) {
                                              break L104;
                                            } else {
                                              break L110;
                                            }
                                          }
                                        }
                                        L111: {
                                          if (be.field_f == 24) {
                                            break L111;
                                          } else {
                                            L112: {
                                              if (be.field_f == 25) {
                                                break L112;
                                              } else {
                                                L113: {
                                                  if (be.field_f != 26) {
                                                    break L113;
                                                  } else {
                                                    be.field_f = 27;
                                                    this.a(166, nn.field_n[2][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_3").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L113;
                                                    }
                                                  }
                                                }
                                                L114: {
                                                  if (be.field_f != 27) {
                                                    break L114;
                                                  } else {
                                                    be.field_f = 28;
                                                    this.a(67, nn.field_n[1][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_1").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L114;
                                                    }
                                                  }
                                                }
                                                L115: {
                                                  if (be.field_f != 28) {
                                                    break L115;
                                                  } else {
                                                    be.field_f = 29;
                                                    this.a(83, nn.field_n[1][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_2").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L115;
                                                    }
                                                  }
                                                }
                                                L116: {
                                                  if (29 != be.field_f) {
                                                    break L116;
                                                  } else {
                                                    be.field_f = 30;
                                                    this.a(85, nn.field_n[1][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_rock_impact_3").a(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L116;
                                                    }
                                                  }
                                                }
                                                L117: {
                                                  if (30 == be.field_f) {
                                                    break L117;
                                                  } else {
                                                    L118: {
                                                      if (be.field_f == 31) {
                                                        break L118;
                                                      } else {
                                                        L119: {
                                                          if (be.field_f != 32) {
                                                            break L119;
                                                          } else {
                                                            be.field_f = 33;
                                                            this.a(136, nn.field_n[5][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_3").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L119;
                                                            }
                                                          }
                                                        }
                                                        L120: {
                                                          if (be.field_f != 33) {
                                                            break L120;
                                                          } else {
                                                            be.field_f = 34;
                                                            this.a(59, nn.field_n[4][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_1").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L120;
                                                            }
                                                          }
                                                        }
                                                        L121: {
                                                          if (be.field_f == 34) {
                                                            break L121;
                                                          } else {
                                                            L122: {
                                                              if (be.field_f == 35) {
                                                                break L122;
                                                              } else {
                                                                L123: {
                                                                  if (be.field_f != 36) {
                                                                    break L123;
                                                                  } else {
                                                                    be.field_f = 37;
                                                                    this.a(255, nn.field_n[7][2], pl.a(wh.field_l, "spell_impact", "arcanists_clam_impact_individual").a(), to.field_r, false, cf.field_h);
                                                                    if (var3 == 0) {
                                                                      break L104;
                                                                    } else {
                                                                      break L123;
                                                                    }
                                                                  }
                                                                }
                                                                L124: {
                                                                  if (be.field_f == 37) {
                                                                    break L124;
                                                                  } else {
                                                                    L125: {
                                                                      if (be.field_f == 38) {
                                                                        break L125;
                                                                      } else {
                                                                        L126: {
                                                                          if (be.field_f == 39) {
                                                                            break L126;
                                                                          } else {
                                                                            L127: {
                                                                              if (40 != be.field_f) {
                                                                                break L127;
                                                                              } else {
                                                                                be.field_f = 41;
                                                                                this.a(255, nn.field_n[6][1], pl.a(wh.field_l, "spell_impact", "arcanists_impact_nature_vinebomb").a(), to.field_r, false, cf.field_h);
                                                                                if (var3 == 0) {
                                                                                  break L104;
                                                                                } else {
                                                                                  break L127;
                                                                                }
                                                                              }
                                                                            }
                                                                            L128: {
                                                                              if (be.field_f != 41) {
                                                                                break L128;
                                                                              } else {
                                                                                be.field_f = 42;
                                                                                this.a(255, nn.field_n[6][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
                                                                                if (var3 == 0) {
                                                                                  break L104;
                                                                                } else {
                                                                                  break L128;
                                                                                }
                                                                              }
                                                                            }
                                                                            L129: {
                                                                              if (be.field_f == 42) {
                                                                                break L129;
                                                                              } else {
                                                                                if (be.field_f != 43) {
                                                                                  break L104;
                                                                                } else {
                                                                                  be.field_f = 44;
                                                                                  this.a(255, nn.field_n[8][0], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_hit").a(), to.field_r, false, cf.field_h);
                                                                                  if (var3 == 0) {
                                                                                    break L104;
                                                                                  } else {
                                                                                    break L129;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            be.field_f = 43;
                                                                            this.a(255, nn.field_n[8][2], pl.a(wh.field_l, "spell_impact", "arcanists_cog_calling_bell_does_nothing").a(), to.field_r, false, cf.field_h);
                                                                            if (var3 == 0) {
                                                                              break L104;
                                                                            } else {
                                                                              break L126;
                                                                            }
                                                                          }
                                                                        }
                                                                        be.field_f = 40;
                                                                        this.a(255, nn.field_n[6][2], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_nature_impact_thornball").a(), to.field_r, false, cf.field_h);
                                                                        if (var3 == 0) {
                                                                          break L104;
                                                                        } else {
                                                                          break L125;
                                                                        }
                                                                      }
                                                                    }
                                                                    be.field_f = 39;
                                                                    this.a(255, nn.field_n[7][0], pl.a(wh.field_l, "spell_impact", "arcanists_brine_bomb_explode").a(), to.field_r, false, cf.field_h);
                                                                    if (var3 == 0) {
                                                                      break L104;
                                                                    } else {
                                                                      break L124;
                                                                    }
                                                                  }
                                                                }
                                                                be.field_f = 38;
                                                                this.a(255, nn.field_n[7][1], pl.a(wh.field_l, "spell_impact", "arcanists_waterball_pop").a(), to.field_r, false, cf.field_h);
                                                                if (var3 == 0) {
                                                                  break L104;
                                                                } else {
                                                                  break L122;
                                                                }
                                                              }
                                                            }
                                                            be.field_f = 36;
                                                            this.a(104, nn.field_n[4][2], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_3").c(), to.field_r, false, cf.field_h);
                                                            if (var3 == 0) {
                                                              break L104;
                                                            } else {
                                                              break L121;
                                                            }
                                                          }
                                                        }
                                                        be.field_f = 35;
                                                        this.a(136, nn.field_n[4][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_underdark_impact_2").c(), to.field_r, false, cf.field_h);
                                                        if (var3 == 0) {
                                                          break L104;
                                                        } else {
                                                          break L118;
                                                        }
                                                      }
                                                    }
                                                    be.field_f = 32;
                                                    this.a(65, nn.field_n[5][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_2").c(), to.field_r, false, cf.field_h);
                                                    if (var3 == 0) {
                                                      break L104;
                                                    } else {
                                                      break L117;
                                                    }
                                                  }
                                                }
                                                be.field_f = 31;
                                                this.a(80, nn.field_n[5][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_overlight_impact_1").c(), to.field_r, false, cf.field_h);
                                                if (var3 == 0) {
                                                  break L104;
                                                } else {
                                                  break L112;
                                                }
                                              }
                                            }
                                            be.field_f = 26;
                                            this.a(90, nn.field_n[2][1], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_2").a(), to.field_r, false, cf.field_h);
                                            if (var3 == 0) {
                                              break L104;
                                            } else {
                                              break L111;
                                            }
                                          }
                                        }
                                        be.field_f = 25;
                                        this.a(107, nn.field_n[2][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_storm_impact_1").a(), to.field_r, false, cf.field_h);
                                        if (var3 == 0) {
                                          break L104;
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                    be.field_f = 23;
                                    this.a(130, nn.field_n[3][1], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_frost_impact_2").c(), to.field_r, false, cf.field_h);
                                    if (var3 == 0) {
                                      break L104;
                                    } else {
                                      break L108;
                                    }
                                  }
                                }
                                be.field_f = 22;
                                this.a(76, nn.field_n[3][0], pl.a(wh.field_l, "spell_impact", "arcanists_spellbook_frost_impact_1").a(), to.field_r, false, cf.field_h);
                                if (var3 == 0) {
                                  break L104;
                                } else {
                                  break L105;
                                }
                              }
                            }
                            be.field_f = 19;
                            this.a(61, nn.field_n[0][0], ai.a(ck.field_b, "spell_impact", "arcanists_spellbook_flame_impact_1").c(), to.field_r, false, cf.field_h);
                            break L104;
                          }
                          return;
                        } else {
                          L130: {
                            if (44 != be.field_f) {
                              break L130;
                            } else {
                              if (!ck.field_b.a("spell_charge", -24417)) {
                                break L130;
                              } else {
                                if (wh.field_l.a("spell_charge", param0 ^ -25386)) {
                                  be.field_f = 45;
                                  pi.field_e = vm.field_f;
                                  this.a(98, wh.field_i[0], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_flame").c(), to.field_r, false, cf.field_h);
                                  this.a(148, ah.field_f[0], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_flame").c(), to.field_r, false, cf.field_h);
                                  this.a(115, wh.field_i[3], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_frost").c(), to.field_r, false, cf.field_h);
                                  this.a(172, ah.field_f[3], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_frost").c(), to.field_r, false, cf.field_h);
                                  this.a(111, wh.field_i[2], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_storm").c(), to.field_r, false, cf.field_h);
                                  this.a(128, ah.field_f[2], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_storm").c(), to.field_r, false, cf.field_h);
                                  this.a(73, wh.field_i[1], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_rock").a(), to.field_r, false, cf.field_h);
                                  this.a(131, ah.field_f[1], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_rock").c(), to.field_r, false, cf.field_h);
                                  this.a(101, wh.field_i[5], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_overlight").c(), to.field_r, false, cf.field_h);
                                  this.a(161, ah.field_f[5], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_overlight").c(), to.field_r, false, cf.field_h);
                                  this.a(118, wh.field_i[4], ai.a(ck.field_b, "spell_charge", "arcanists_chargeup_underdark").c(), to.field_r, false, cf.field_h);
                                  this.a(118, ah.field_f[4], ai.a(ck.field_b, "spell_charge", "arcanists_discharge_underdark").c(), to.field_r, false, cf.field_h);
                                  this.a(255, wh.field_i[7], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_sea").a(), to.field_r, false, cf.field_h);
                                  this.a(255, ah.field_f[7], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_sea").a(), to.field_r, false, cf.field_h);
                                  this.a(255, wh.field_i[8], pl.a(wh.field_l, "spell_charge", "arcanists_chargeup_cog").a(), to.field_r, false, cf.field_h);
                                  this.a(255, ah.field_f[8], pl.a(wh.field_l, "spell_charge", "arcanists_discharge_cog").a(), to.field_r, false, cf.field_h);
                                  cf.field_h[wh.field_i[6]] = cf.field_h[qo.field_a[6]];
                                  to.field_r[wh.field_i[6]] = to.field_r[qo.field_a[6]];
                                  cf.field_h[ah.field_f[6]] = cf.field_h[qo.field_a[6]];
                                  to.field_r[ah.field_f[6]] = to.field_r[qo.field_a[6]];
                                  return;
                                } else {
                                  break L130;
                                }
                              }
                            }
                          }
                          L131: {
                            if (be.field_f != 45) {
                              break L131;
                            } else {
                              if (!ck.field_b.a("spell_cast_universal", -24417)) {
                                break L131;
                              } else {
                                if (wh.field_l.a("spell_cast_universal", -24417)) {
                                  pi.field_e = go.field_h;
                                  be.field_f = 46;
                                  this.a(120, 64, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_01_arcane_arrow").c(), to.field_r, false, cf.field_h);
                                  this.a(110, 72, ai.a(ck.field_b, "spell_cast_universal", "arcanists_cast_06_arcane_glyph").c(), to.field_r, false, cf.field_h);
                                  this.a(119, 66, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_02_arcane_tower").a(), to.field_r, false, cf.field_h);
                                  this.a(141, 68, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_03_arcane_gate").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 74, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_05_arcane_flash").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 69, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_bomb").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 65, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_portal").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 71, ai.a(ck.field_b, "spell_cast_universal", "arcanists_imp_destruction").c(), to.field_r, false, cf.field_h);
                                  this.a(111, 67, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_armour").a(), to.field_r, false, cf.field_h);
                                  this.a(111, 73, pl.a(wh.field_l, "spell_cast_universal", "arcanists_cast_arcane_sigil").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L131;
                                }
                              }
                            }
                          }
                          L132: {
                            if (46 != be.field_f) {
                              break L132;
                            } else {
                              if (!ck.field_b.a("spell_cast_flame", -24417)) {
                                break L132;
                              } else {
                                if (!wh.field_l.a("spell_cast_flame", -24417)) {
                                  break L132;
                                } else {
                                  pi.field_e = ba.field_b;
                                  be.field_f = 47;
                                  this.a(73, 76, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_07_fire_ball").c(), to.field_r, false, cf.field_h);
                                  this.a(118, 77, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_08_fire_arrow").c(), to.field_r, false, cf.field_h);
                                  this.a(129, 78, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_09_lava_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(113, 79, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_10_magma_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 80, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_11_flame_shield").a(), to.field_r, false, cf.field_h);
                                  this.a(120, 81, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_12_flame_wall").a(), to.field_r, false, cf.field_h);
                                  this.a(107, 82, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_13_napalm").a(), to.field_r, false, cf.field_h);
                                  this.a(96, 83, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_14_napalm_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(75, 84, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_15_rain_of_fire").c(), to.field_r, false, cf.field_h);
                                  this.a(117, 85, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_16_fire_of_arrows").c(), to.field_r, false, cf.field_h);
                                  this.a(122, 86, pl.a(wh.field_l, "spell_cast_flame", "arcanists_cast_17_volcano").a(), to.field_r, false, cf.field_h);
                                  this.a(117, 87, ai.a(ck.field_b, "spell_cast_flame", "arcanists_cast_18_flame_dragon").c(), to.field_r, false, cf.field_h);
                                  return;
                                }
                              }
                            }
                          }
                          L133: {
                            if (be.field_f != 47) {
                              break L133;
                            } else {
                              if (ck.field_b.a("spell_cast_frost", -24417)) {
                                pi.field_e = wh.field_j;
                                be.field_f = 48;
                                this.a(63, 112, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_43_ice_ball").c(), to.field_r, false, cf.field_h);
                                this.a(94, 113, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_44_ice_bomb").c(), to.field_r, false, cf.field_h);
                                this.a(102, 114, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_45_shards").c(), to.field_r, false, cf.field_h);
                                this.a(111, 115, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_46_frost_arrow").c(), to.field_r, false, cf.field_h);
                                this.a(117, 116, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_47_snow_ball").c(), to.field_r, false, cf.field_h);
                                this.a(95, 117, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_48_blizzard").c(), to.field_r, false, cf.field_h);
                                this.a(128, 118, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_49_ice_shield").c(), to.field_r, false, cf.field_h);
                                this.a(100, 119, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_50_ice_castle").c(), to.field_r, false, cf.field_h);
                                this.a(89, 120, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_51_sylph").c(), to.field_r, false, cf.field_h);
                                this.a(108, 121, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_52_frost_giant").c(), to.field_r, false, cf.field_h);
                                this.a(177, 122, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_53_comet").c(), to.field_r, false, cf.field_h);
                                this.a(184, 123, ai.a(ck.field_b, "spell_cast_frost", "arcanists_cast_54_frost_dragon").c(), to.field_r, false, cf.field_h);
                                return;
                              } else {
                                break L133;
                              }
                            }
                          }
                          L134: {
                            if (be.field_f != 48) {
                              break L134;
                            } else {
                              if (!ck.field_b.a("spell_cast_rock", -24417)) {
                                break L134;
                              } else {
                                if (wh.field_l.a("spell_cast_rock", -24417)) {
                                  pi.field_e = fe.field_m;
                                  be.field_f = 49;
                                  this.a(134, 88, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_19_pebble_shot").a(), to.field_r, false, cf.field_h);
                                  this.a(58, 89, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_20_scatter_rock").a(), to.field_r, false, cf.field_h);
                                  this.a(110, 90, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_21_quake").a(), to.field_r, false, cf.field_h);
                                  this.a(196, 91, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_22_disruption").c(), to.field_r, false, cf.field_h);
                                  this.a(151, 92, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_23_mud_bomb").a(), to.field_r, false, cf.field_h);
                                  this.a(110, 93, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_24_mega_boulder").c(), to.field_r, false, cf.field_h);
                                  this.a(85, 94, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_25_rock_slab").a(), to.field_r, false, cf.field_h);
                                  this.a(116, 95, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_26_fortress").a(), to.field_r, false, cf.field_h);
                                  this.a(120, 96, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_27_dwarves").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 97, ai.a(ck.field_b, "spell_cast_rock", "arcanists_cast_28_rock_golem").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 98, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_29_meteor").a(), to.field_r, false, cf.field_h);
                                  this.a(65, 99, pl.a(wh.field_l, "spell_cast_rock", "arcanists_cast_30_fissure").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L134;
                                }
                              }
                            }
                          }
                          L135: {
                            if (49 != be.field_f) {
                              break L135;
                            } else {
                              if (!ck.field_b.a("spell_cast_storm", -24417)) {
                                break L135;
                              } else {
                                if (wh.field_l.a("spell_cast_storm", -24417)) {
                                  pi.field_e = ld.field_j;
                                  be.field_f = 50;
                                  this.a(107, 100, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_31_thunder_shock").c(), to.field_r, false, cf.field_h);
                                  this.a(136, 101, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_32_chain_lightning").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 102, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_33_wind_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(129, 103, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_34_hurricane").a(), to.field_r, false, cf.field_h);
                                  this.a(103, 104, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_35_shock_bomb").c(), to.field_r, false, cf.field_h);
                                  this.a(161, 105, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_36_storm_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(127, 106, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_37_cyclops").c(), to.field_r, false, cf.field_h);
                                  this.a(123, 107, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_38_conductor_rod").c(), to.field_r, false, cf.field_h);
                                  this.a(92, 108, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_39_thrust").a(), to.field_r, false, cf.field_h);
                                  this.a(108, 109, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_40_flight").a(), to.field_r, false, cf.field_h);
                                  this.a(139, 110, pl.a(wh.field_l, "spell_cast_storm", "arcanists_cast_41_storm").a(), to.field_r, false, cf.field_h);
                                  this.a(184, 111, ai.a(ck.field_b, "spell_cast_storm", "arcanists_cast_42_storm_dragon").c(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L135;
                                }
                              }
                            }
                          }
                          L136: {
                            if (be.field_f != 50) {
                              break L136;
                            } else {
                              if (!ck.field_b.a("spell_cast_overlight", param0 + -39850)) {
                                break L136;
                              } else {
                                if (wh.field_l.a("spell_cast_overlight", -24417)) {
                                  be.field_f = 51;
                                  pi.field_e = fl.field_c;
                                  this.a(123, 145, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_67_castle_of_light").c(), to.field_r, false, cf.field_h);
                                  this.a(110, 137, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_68_sky_ray").c(), to.field_r, false, cf.field_h);
                                  this.a(139, 138, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_69_shining_bolt").c(), to.field_r, false, cf.field_h);
                                  this.a(107, 139, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_70_rising_star").a(), to.field_r, false, cf.field_h);
                                  this.a(109, 140, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_71_pegasus").c(), to.field_r, false, cf.field_h);
                                  this.a(131, 141, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_72_paladin").c(), to.field_r, false, cf.field_h);
                                  this.a(140, 142, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_73_forest_seed").c(), to.field_r, false, cf.field_h);
                                  this.a(113, 143, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_74_pixies").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 144, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_75_sphere_of_healing").a(), to.field_r, false, cf.field_h);
                                  this.a(87, 136, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_76_protection_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(123, 146, ai.a(ck.field_b, "spell_cast_overlight", "arcanists_cast_77_invulnerability_shield").c(), to.field_r, false, cf.field_h);
                                  this.a(128, 147, pl.a(wh.field_l, "spell_cast_overlight", "arcanists_cast_78_shining_power").a(), to.field_r, false, cf.field_h);
                                  return;
                                } else {
                                  break L136;
                                }
                              }
                            }
                          }
                          L137: {
                            if (be.field_f != 51) {
                              break L137;
                            } else {
                              if (!ck.field_b.a("spell_cast_underdark", -24417)) {
                                break L137;
                              } else {
                                pi.field_e = mn.field_v;
                                be.field_f = 52;
                                this.a(156, 124, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_55_den_of_darkness").c(), to.field_r, false, cf.field_h);
                                this.a(154, 125, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_56_rain_of_chaos").c(), to.field_r, false, cf.field_h);
                                this.a(256, 126, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_57_drain_bolt").c(), to.field_r, false, cf.field_h);
                                this.a(177, 127, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_58_death_bomb").c(), to.field_r, false, cf.field_h);
                                this.a(145, 128, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_59_swarm").c(), to.field_r, false, cf.field_h);
                                this.a(136, 129, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_60_dark_knight").c(), to.field_r, false, cf.field_h);
                                this.a(142, 130, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_61_raise_dead").c(), to.field_r, false, cf.field_h);
                                this.a(135, 131, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_62_wraith_minion").c(), to.field_r, false, cf.field_h);
                                this.a(104, 132, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_63_aura_of_decay").c(), to.field_r, false, cf.field_h);
                                this.a(122, 133, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_64_dark_defences").c(), to.field_r, false, cf.field_h);
                                this.a(160, 134, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_65_swallowing_pit").c(), to.field_r, false, cf.field_h);
                                this.a(159, 135, ai.a(ck.field_b, "spell_cast_underdark", "arcanists_cast_66_lichdom").c(), to.field_r, false, cf.field_h);
                                return;
                              }
                            }
                          }
                          L138: {
                            if (52 != be.field_f) {
                              break L138;
                            } else {
                              if (!wh.field_l.a("spell_cast_ocean", -24417)) {
                                break L138;
                              } else {
                                be.field_f = 53;
                                pi.field_e = lo.field_s;
                                this.a(255, 160, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_waterball").a(), to.field_r, false, cf.field_h);
                                this.a(255, 161, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_maelstrom").a(), to.field_r, false, cf.field_h);
                                this.a(256, 162, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_minions").a(), to.field_r, false, cf.field_h);
                                this.a(255, 164, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_deluge").a(), to.field_r, false, cf.field_h);
                                this.a(255, 165, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_english_summer").a(), to.field_r, false, cf.field_h);
                                this.a(255, 166, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bolt_individual").a(), to.field_r, false, cf.field_h);
                                this.a(255, 167, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_brine_bomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 169, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_rain_of_clams").a(), to.field_r, false, cf.field_h);
                                this.a(255, 170, pl.a(wh.field_l, "spell_cast_ocean", "arcanists_cast_tsunami").a(), to.field_r, false, cf.field_h);
                                return;
                              }
                            }
                          }
                          L139: {
                            if (be.field_f != 53) {
                              break L139;
                            } else {
                              if (wh.field_l.a("spell_cast_nature", -24417)) {
                                pi.field_e = tl.field_g;
                                be.field_f = 54;
                                this.a(255, 148, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_79_thornball").a(), to.field_r, false, cf.field_h);
                                this.a(255, 149, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_80_thornbomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 150, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_whip").a(), to.field_r, false, cf.field_h);
                                this.a(255, 151, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebridge2").a(), to.field_r, false, cf.field_h);
                                this.a(255, 152, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_vinebomb").a(), to.field_r, false, cf.field_h);
                                this.a(255, 153, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_entangle").a(), to.field_r, false, cf.field_h);
                                this.a(255, 155, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_86_sanctuary").a(), to.field_r, false, cf.field_h);
                                this.a(255, 157, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_88_flurry_of_arrows").a(), to.field_r, false, cf.field_h);
                                this.a(255, 158, pl.a(wh.field_l, "spell_cast_nature", "arcanists_cast_nature_natureswrath").a(), to.field_r, false, cf.field_h);
                                this.a(255, 159, pl.a(wh.field_l, "spell_cast_nature", "arcanists_impact_nature_vinebloom_build").a(), to.field_r, false, cf.field_h);
                                return;
                              } else {
                                break L139;
                              }
                            }
                          }
                          L140: {
                            if (54 != be.field_f) {
                              break L140;
                            } else {
                              if (!ck.field_b.a("spell_cast_cogs", -24417)) {
                                break L140;
                              } else {
                                if (!wh.field_l.a("spell_cast_cogs", -24417)) {
                                  break L140;
                                } else {
                                  be.field_f = 55;
                                  pi.field_e = ma.field_I;
                                  this.a(255, 172, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_static_ball_shield_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 173, cf.field_h[172], to.field_r, false, cf.field_h);
                                  this.a(255, 174, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_mech_arrow_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 175, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_fall_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 176, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_recall_device_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 177, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_calling_bell_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 178, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_clock_tower_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 179, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_cuckoo_clock_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 180, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_blast_from_past_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 181, pl.a(wh.field_l, "spell_cast_cogs", "arcanists_cog_clockwork_bomb_loop_cast").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 182, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_steam_dragon_cast").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 183, ai.a(ck.field_b, "spell_cast_cogs", "arcanists_cog_redo_cast").c(), to.field_r, false, cf.field_h);
                                  cf.field_h[218] = cf.field_h[nn.field_n[8][0]];
                                  to.field_r[218] = to.field_r[nn.field_n[8][0]];
                                  return;
                                }
                              }
                            }
                          }
                          if (be.field_f == 55) {
                            L141: {
                              pi.field_e = md.field_d;
                              if (!ck.field_b.a(117)) {
                                break L141;
                              } else {
                                if (!wh.field_l.a(113)) {
                                  break L141;
                                } else {
                                  be.field_f = 56;
                                  this.a(255, 154, ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 156, ai.a(ck.field_b, "elves", "arcanists_elf_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(125, 70, ai.a(ck.field_b, "footmen", "arcanists_imp_for_the_arcanist").c(), to.field_r, false, cf.field_h);
                                  this.a(159, 171, ai.a(ck.field_b, "default", "arcanists_water_lord_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(104, 168, ai.a(ck.field_b, "default", "arcanists_brine_goblin_summon").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 163, pl.a(wh.field_l, "spell_impact", "arcanists_hydration_impact").a(), to.field_r, false, cf.field_h);
                                  this.a(255, 220, ai.a(ck.field_b, "trajectile", "natural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                                  this.a(255, 226, ai.a(ck.field_b, "trajectile", "unnatural_trajectile_loop").c(), to.field_r, false, cf.field_h);
                                  this.a(64, 227, ai.a(ck.field_b, "trajectile", "bounce").c(), to.field_r, false, cf.field_h);
                                  this.a(198, 221, pl.a(wh.field_l, "other_buttons", "arcanists_menu_transition").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 222, pl.a(wh.field_l, "other_buttons", "arcanists_units_click_on_map").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 223, ai.a(ck.field_b, "other_buttons", "arcanists_units_drag_unit").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 224, pl.a(wh.field_l, "other_buttons", "arcanists_units_select_next_unit").a(), to.field_r, false, cf.field_h);
                                  this.a(256, 225, ai.a(ck.field_b, "other_buttons", "arcanists_units_zoom_in").c(), to.field_r, false, cf.field_h);
                                  this.a(256, 48, pl.a(wh.field_l, "player", "arcanists_pl_01_footsteps").a(), tm.field_a, false, uk.field_g);
                                  this.a(171, 49, pl.a(wh.field_l, "player", "arcanists_pl_02_jump_fowards").a(), tm.field_a, false, uk.field_g);
                                  this.a(173, 50, pl.a(wh.field_l, "player", "arcanists_pl_03_jump_upwards").a(), tm.field_a, false, uk.field_g);
                                  this.a(255, 51, pl.a(wh.field_l, "player", "arcanists_pl_04_landing").a(), tm.field_a, false, uk.field_g);
                                  this.a(158, 52, ai.a(ck.field_b, "player", "arcanists_pl_05_damage").c(), tm.field_a, false, uk.field_g);
                                  this.a(153, 53, ai.a(ck.field_b, "player", "arcanists_pl_06_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(155, 54, pl.a(wh.field_l, "player", "arcanists_pl_07_splash").a(), tm.field_a, false, uk.field_g);
                                  this.a(190, dm.field_G[0], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(191, dm.field_G[2], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(178, dm.field_G[1], ai.a(ck.field_b, "cyclops", "arcanists_cyclops_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(165, hi.field_f[0], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(203, hi.field_f[2], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(152, hi.field_f[1], ai.a(ck.field_b, "dark_knight", "arcanists_dark_knight_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(149, 194, pl.a(wh.field_l, "dark_knight", "arcanists_dark_knight_charge_attack").a(), to.field_r, false, cf.field_h);
                                  this.a(151, fb.field_b[0], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(142, fb.field_b[2], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(153, fb.field_b[1], ai.a(ck.field_b, "dwarf", "arcanists_dwarf_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(173, 188, pl.a(wh.field_l, "dwarf", "arcanists_dwarf_mining").a(), to.field_r, false, cf.field_h);
                                  this.a(103, 189, ai.a(ck.field_b, "dwarf", "arcanists_dwarf_self_destruct").c(), to.field_r, false, cf.field_h);
                                  this.a(118, ed.field_Ib[0], ai.a(ck.field_b, "paladin", "arcanists_paladin_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(79, ed.field_Ib[2], ai.a(ck.field_b, "paladin", "arcanists_paladin_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(84, ed.field_Ib[1], ai.a(ck.field_b, "paladin", "arcanists_paladin_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(91, 202, pl.a(wh.field_l, "paladin", "arcanists_paladin_smash").a(), to.field_r, false, cf.field_h);
                                  this.a(147, tc.field_B[0], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(128, tc.field_B[2], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(148, tc.field_B[1], ai.a(ck.field_b, "rock_golem", "arcanists_rock_golem_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(125, in.field_Fb[0], ai.a(ck.field_b, "slyph", "arcanists_slyph_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(159, in.field_Fb[2], ai.a(ck.field_b, "slyph", "arcanists_slyph_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(181, in.field_Fb[1], ai.a(ck.field_b, "slyph", "arcanists_slyph_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(161, 185, ai.a(ck.field_b, "slyph", "arcanists_slyph_arrow_attack").c(), to.field_r, false, cf.field_h);
                                  this.a(138, s.field_i[0], ai.a(ck.field_b, "wraith", "arcanists_wraith_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(178, s.field_i[2], ai.a(ck.field_b, "wraith", "arcanists_wraith_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(166, s.field_i[1], ai.a(ck.field_b, "wraith", "arcanists_wraith_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, 219, ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_attack").c(), to.field_r, false, cf.field_h);
                                  this.a(79, lj.field_g[0], ai.a(ck.field_b, "footmen", "arcanists_imp_yes_master").c(), tm.field_a, false, uk.field_g);
                                  uk.field_g[lj.field_g[2]] = null;
                                  this.a(115, 184, ai.a(ck.field_b, "footmen", "arcanists_imp_im_gonna_go_boom").c(), to.field_r, false, cf.field_h);
                                  this.a(167, mb.field_U[0], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(149, mb.field_U[2], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, mb.field_U[1], ai.a(ck.field_b, "frost_giant", "arcanists_frost_giant_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(109, 187, pl.a(wh.field_l, "frost_giant", "arcanists_frost_giant_smash_attack").a(), to.field_r, false, cf.field_h);
                                  cf.field_h[197] = cf.field_h[102];
                                  to.field_r[198] = to.field_r[105];
                                  to.field_r[197] = to.field_r[102];
                                  cf.field_h[198] = cf.field_h[105];
                                  to.field_r[103] = to.field_r[103];
                                  to.field_r[199] = to.field_r[136];
                                  cf.field_h[199] = cf.field_h[136];
                                  to.field_r[201] = to.field_r[187];
                                  cf.field_h[201] = cf.field_h[187];
                                  cf.field_h[103] = cf.field_h[103];
                                  this.a(176, lj.field_n[0], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(182, lj.field_n[2], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(202, lj.field_n[1], ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(154, 193, ai.a(ck.field_b, "storm_dragon", "arcanists_storm_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(190, gd.field_pb[0], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, gd.field_pb[2], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(148, gd.field_pb[1], ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, 192, ai.a(ck.field_b, "frost_dragon", "arcanists_frost_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(181, fi.field_c[0], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(108, fi.field_c[2], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(172, fi.field_c[1], ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(167, 191, ai.a(ck.field_b, "flame_dragon", "arcanists_flame_dragon_breath").c(), to.field_r, false, cf.field_h);
                                  this.a(158, cj.field_a[0], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(229, cj.field_a[2], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(183, cj.field_a[1], ai.a(ck.field_b, "pegasus", "arcanists_pegasus_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[0], ai.a(ck.field_b, "swarm", "arcanists_swarm_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[2], ai.a(ck.field_b, "swarm", "arcanists_swarm_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, vg.field_c[1], ai.a(ck.field_b, "swarm", "arcanists_swarm_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(256, uj.field_c[0], ai.a(ck.field_b, "cyclops", "arcanists_storm_spirit_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, gg.field_j[0], ai.a(ck.field_b, "pixie", "arcanists_pixie_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, gg.field_j[2], ai.a(ck.field_b, "pixie", "arcanists_pixie_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, gg.field_j[1], ai.a(ck.field_b, "pixie", "arcanists_pixie_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(235, 196, ai.a(ck.field_b, "pixie", "arcanists_pixie_fairyring").c(), to.field_r, false, cf.field_h);
                                  this.a(85, cf.field_a[0], ai.a(ck.field_b, "default", "arcanists_brine_goblin_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, cf.field_a[2], pl.a(wh.field_l, "default", "arcanists_brine_goblin_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, cf.field_a[1], pl.a(wh.field_l, "default", "arcanists_brine_goblin_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fk.field_h[0], ai.a(ck.field_b, "elves", "arcanists_elf_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, fk.field_h[2], ai.a(ck.field_b, "elves", "arcanists_elf_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, fk.field_h[1], ai.a(ck.field_b, "elves", "arcanists_elf_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, jn.field_a[0], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, jn.field_a[2], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, jn.field_a[1], ai.a(ck.field_b, "plant_minion", "arcanists_plant_minion_death").c(), tm.field_a, false, uk.field_g);
                                  this.a(85, cd.field_p[0], ai.a(ck.field_b, "default", "arcanists_water_troll_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(83, cd.field_p[2], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, cd.field_p[1], pl.a(wh.field_l, "default", "arcanists_sea_watertroll_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fd.field_h[0], pl.a(wh.field_l, "spell_cast_ocean", "arcanists_summon_sea_minion").a(), tm.field_a, false, uk.field_g);
                                  this.a(83, fd.field_h[2], pl.a(wh.field_l, "default", "arcanists_water_lord_hit").a(), tm.field_a, false, uk.field_g);
                                  this.a(85, fd.field_h[1], pl.a(wh.field_l, "default", "arcanists_water_lord_death").a(), tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[0], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[2], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, om.field_B[1], cf.field_h[176], tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[0], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_select").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[2], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_hit").c(), tm.field_a, false, uk.field_g);
                                  this.a(255, u.field_h[1], ai.a(ck.field_b, "steam_dragon", "arcanists_cog_steam_dragon_death").c(), tm.field_a, false, uk.field_g);
                                  ck.field_b = null;
                                  wh.field_l = null;
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            break L81;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              if (jo.field_c < 19) {
                L142: {
                  L143: {
                    if (jh.field_c[4] != null) {
                      break L143;
                    } else {
                      if (!tc.field_x.a(true, "arcanists_grassland", "")) {
                        break L143;
                      } else {
                        jh.field_c[4] = ha.a(tc.field_x, "", "arcanists_grassland");
                        jo.field_c = 2;
                        if (var3 == 0) {
                          break L142;
                        } else {
                          break L143;
                        }
                      }
                    }
                  }
                  L144: {
                    if (jo.field_c != 2) {
                      break L144;
                    } else {
                      boolean discarded$13 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[4], -105);
                      jo.field_c = 3;
                      if (var3 == 0) {
                        break L142;
                      } else {
                        break L144;
                      }
                    }
                  }
                  L145: {
                    if (null != jh.field_c[1]) {
                      break L145;
                    } else {
                      if (!tc.field_x.a(true, "arcanists_giant_mountains", "")) {
                        break L145;
                      } else {
                        jh.field_c[1] = ha.a(tc.field_x, "", "arcanists_giant_mountains");
                        jo.field_c = 4;
                        if (var3 == 0) {
                          break L142;
                        } else {
                          break L145;
                        }
                      }
                    }
                  }
                  L146: {
                    if (jo.field_c == 4) {
                      break L146;
                    } else {
                      L147: {
                        if (null != jh.field_c[2]) {
                          break L147;
                        } else {
                          if (!tc.field_x.a(true, "arcanists_elven", "")) {
                            break L147;
                          } else {
                            jh.field_c[2] = ha.a(tc.field_x, "", "arcanists_elven");
                            jo.field_c = 6;
                            if (var3 == 0) {
                              break L142;
                            } else {
                              break L147;
                            }
                          }
                        }
                      }
                      L148: {
                        if (jo.field_c == 6) {
                          break L148;
                        } else {
                          L149: {
                            L150: {
                              if (jh.field_c[3] != null) {
                                break L150;
                              } else {
                                if (tc.field_x.a(true, "arcanists_goblin_caves", "")) {
                                  break L149;
                                } else {
                                  break L150;
                                }
                              }
                            }
                            L151: {
                              if (jo.field_c == 8) {
                                break L151;
                              } else {
                                L152: {
                                  L153: {
                                    if (null != jh.field_c[5]) {
                                      break L153;
                                    } else {
                                      if (tc.field_x.a(true, "arcanists_swamp", "")) {
                                        break L152;
                                      } else {
                                        break L153;
                                      }
                                    }
                                  }
                                  L154: {
                                    if (jo.field_c == 10) {
                                      break L154;
                                    } else {
                                      L155: {
                                        L156: {
                                          if (null != jh.field_c[6]) {
                                            break L156;
                                          } else {
                                            if (tc.field_x.a(true, "arcanists_graveyard", "")) {
                                              break L155;
                                            } else {
                                              break L156;
                                            }
                                          }
                                        }
                                        L157: {
                                          if (jo.field_c != 12) {
                                            break L157;
                                          } else {
                                            jo.field_c = 13;
                                            boolean discarded$14 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[6], param0 ^ -15414);
                                            if (var3 == 0) {
                                              break L142;
                                            } else {
                                              break L157;
                                            }
                                          }
                                        }
                                        L158: {
                                          L159: {
                                            if (jh.field_c[7] != null) {
                                              break L159;
                                            } else {
                                              if (tc.field_x.a(true, "arcanists_skycastles", "")) {
                                                break L158;
                                              } else {
                                                break L159;
                                              }
                                            }
                                          }
                                          L160: {
                                            if (jo.field_c == 14) {
                                              break L160;
                                            } else {
                                              L161: {
                                                L162: {
                                                  if (null != jh.field_c[8]) {
                                                    break L162;
                                                  } else {
                                                    if (tc.field_x.a(true, "arcanists_beach_cove", "")) {
                                                      break L161;
                                                    } else {
                                                      break L162;
                                                    }
                                                  }
                                                }
                                                L163: {
                                                  if (jo.field_c != 16) {
                                                    break L163;
                                                  } else {
                                                    jo.field_c = 17;
                                                    boolean discarded$15 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[8], 50);
                                                    if (var3 == 0) {
                                                      break L142;
                                                    } else {
                                                      break L163;
                                                    }
                                                  }
                                                }
                                                L164: {
                                                  L165: {
                                                    if (null != jh.field_c[9]) {
                                                      break L165;
                                                    } else {
                                                      if (tc.field_x.a(true, "arcanists_arcane_crystal_cavern", "")) {
                                                        break L164;
                                                      } else {
                                                        break L165;
                                                      }
                                                    }
                                                  }
                                                  if (jo.field_c == 18) {
                                                    jo.field_c = 19;
                                                    boolean discarded$16 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[9], param0 + -15554);
                                                    jl.field_h.c(125);
                                                    ki.field_s = null;
                                                    tc.field_x = null;
                                                    lo.field_w = null;
                                                    if (var3 == 0) {
                                                      break L142;
                                                    } else {
                                                      break L164;
                                                    }
                                                  } else {
                                                    break L142;
                                                  }
                                                }
                                                jh.field_c[9] = ha.a(tc.field_x, "", "arcanists_arcane_crystal_cavern");
                                                jo.field_c = 18;
                                                if (var3 == 0) {
                                                  break L142;
                                                } else {
                                                  break L161;
                                                }
                                              }
                                              jh.field_c[8] = ha.a(tc.field_x, "", "arcanists_beach_cove");
                                              jo.field_c = 16;
                                              if (var3 == 0) {
                                                break L142;
                                              } else {
                                                break L160;
                                              }
                                            }
                                          }
                                          jo.field_c = 15;
                                          boolean discarded$17 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[7], -116);
                                          if (var3 == 0) {
                                            break L142;
                                          } else {
                                            break L158;
                                          }
                                        }
                                        jh.field_c[7] = ha.a(tc.field_x, "", "arcanists_skycastles");
                                        jo.field_c = 14;
                                        if (var3 == 0) {
                                          break L142;
                                        } else {
                                          break L155;
                                        }
                                      }
                                      jh.field_c[6] = ha.a(tc.field_x, "", "arcanists_graveyard");
                                      jo.field_c = 12;
                                      if (var3 == 0) {
                                        break L142;
                                      } else {
                                        break L154;
                                      }
                                    }
                                  }
                                  jo.field_c = 11;
                                  boolean discarded$18 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[5], -109);
                                  if (var3 == 0) {
                                    break L142;
                                  } else {
                                    break L152;
                                  }
                                }
                                jh.field_c[5] = ha.a(tc.field_x, "", "arcanists_swamp");
                                jo.field_c = 10;
                                if (var3 == 0) {
                                  break L142;
                                } else {
                                  break L151;
                                }
                              }
                            }
                            jo.field_c = 9;
                            boolean discarded$19 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[3], 52);
                            if (var3 == 0) {
                              break L142;
                            } else {
                              break L149;
                            }
                          }
                          jh.field_c[3] = ha.a(tc.field_x, "", "arcanists_goblin_caves");
                          jo.field_c = 8;
                          if (var3 == 0) {
                            break L142;
                          } else {
                            break L148;
                          }
                        }
                      }
                      jo.field_c = 7;
                      boolean discarded$20 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[2], -115);
                      if (var3 == 0) {
                        break L142;
                      } else {
                        break L146;
                      }
                    }
                  }
                  jo.field_c = 5;
                  boolean discarded$21 = jl.field_h.a(0, lo.field_w, ki.field_s, jh.field_c[1], param0 + -15553);
                  break L142;
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Log in / Create account";
        field_F = "Add <%0> to friend list";
    }
}
