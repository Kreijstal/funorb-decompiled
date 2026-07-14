/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vm extends hf {
    static bi field_cb;
    static String field_ab;
    private int field_db;
    private static long[] field_fb;
    private oi field_eb;
    static String field_bb;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 >= -5) {
            field_ab = null;
        }
        ((vm) this).a(89, qe.field_O[(15 & ((vm) this).field_db) >> 1857108482], param1, param3);
    }

    final static void a(nf param0, int param1) {
        mk.b(128);
        if (param1 != -8409) {
            oc discarded$0 = vm.a(72, false);
        }
        fn.a(param0.field_z, param0.field_t, param0.field_x);
    }

    final void g(int param0) {
        if (param0 != 26402) {
            Object var3 = null;
            ((vm) this).a((mn) null, -0.40409225463452153, 117, (vg) null, (oi) null);
        }
        ka discarded$0 = ((vm) this).a((byte) -120, jg.field_e, 3.0);
    }

    final void a(int param0, int param1) {
        ((vm) this).field_db = ((vm) this).field_db + 1;
        super.a(param0, param1);
        if (((vm) this).field_A.field_x.field_r[((vm) this).field_A.field_x.field_a + -1] <= ((vm) this).field_D) {
            ((vm) this).field_z = true;
            ((vm) this).field_s = 2;
        }
    }

    final void a(mn param0, byte param1) {
        int var3 = 68 % ((-2 - param1) / 62);
        ((vm) this).field_eb.field_p = ((vm) this).field_D;
        ((vm) this).field_eb.field_u = 0.5;
        ((vm) this).field_eb.field_t = ((vm) this).field_E;
        ((vm) this).field_eb.field_o = ((vm) this).field_t;
        param0.a((rk) (Object) ((vm) this).field_eb, (byte) -93);
    }

    final static void h(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Confined.field_J ? 1 : 0;
                        if (om.field_s == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        om.field_s.d(-121);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != oc.field_l) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        oc.field_l.a((byte) -104);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == gd.field_q) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            gd.field_q.c(-102);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (vh.field_e == null) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var1 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (vh.field_e.length <= var1) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (vh.field_e[var1] != null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            vh.field_e[var1].c(-96);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 17: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param0 == 37) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        field_cb = null;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vm(hn param0, ee param1, double[] param2, double param3, double param4, double param5, double param6, boolean param7) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.1, 0.01, param1, 4.0, 0.004);
        double[] var13 = null;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double[] var39 = null;
        double[] var40 = null;
        double[] var42 = null;
        double[] var44 = null;
        double[] var46 = null;
        double[] var47 = null;
        L0: {
          ((vm) this).field_db = 0;
          ((vm) this).field_eb = new oi((pm) this);
          ((vm) this).field_t = ((vm) this).field_t + (param5 * param2[10] + (param4 * param2[7] + param3 * param2[4]));
          ((vm) this).field_D = ((vm) this).field_D + (param2[11] * param5 + (param3 * param2[5] + param2[8] * param4));
          ((vm) this).field_E = ((vm) this).field_E + (param5 * param2[9] + (param4 * param2[6] + param3 * param2[3]));
          var46 = param0.field_B.e(3008);
          var44 = var46;
          var42 = var44;
          var40 = var42;
          var39 = var40;
          var13 = var39;
          var14 = -((vm) this).field_E + var46[0];
          var16 = var46[1] - ((vm) this).field_t;
          var18 = var46[2] - ((vm) this).field_D;
          var20 = var46[3];
          var22 = var46[4];
          var24 = var46[5];
          var47 = new double[12];
          param0.field_B.field_jb.a((byte) 55, var47);
          var27 = var47[9] * var20 + var22 * var47[10] + var24 * var47[11];
          var22 = var22 - var47[10] * var27;
          var24 = var24 - var47[11] * var27;
          var20 = var20 - var47[9] * var27;
          var20 = var20 * param6;
          var24 = var24 * param6;
          var22 = var22 * param6;
          var20 = var20 + var27 * var47[9];
          var24 = var24 + var47[11] * var27;
          var22 = var22 + var47[10] * var27;
          var29 = -0.05 + (var24 * var24 + (var22 * var22 + var20 * var20));
          var31 = var18 * var24 + (var20 * var14 + var22 * var16);
          var33 = var18 * var18 + (var14 * var14 + var16 * var16);
          var35 = -(var33 * var29) + var31 * var31;
          if (0.0 <= var35) {
            var35 = Math.sqrt(var35);
            break L0;
          } else {
            var35 = 0.0;
            break L0;
          }
        }
        L1: {
          var37 = (-var31 - var35) / var29;
          if (0.0 <= var37) {
            break L1;
          } else {
            var37 = (-var31 + var35) / var29;
            break L1;
          }
        }
        L2: {
          ((vm) this).field_Y = 0.004;
          ((vm) this).field_G = var22 + var16 / var37;
          if (!param7) {
            break L2;
          } else {
            ((vm) this).field_W = (pm) (Object) param0.field_B;
            break L2;
          }
        }
        ((vm) this).field_L = var24 + var18 / var37;
        ((vm) this).field_K = var14 / var37 + var20;
        kj.a(ih.field_e, 96, (pm) (Object) param1);
        new gk((pm) this, kh.field_fb).field_w = 0.1;
    }

    final static oc a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        lb var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_20_0 = null;
        int[] stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Confined.field_J ? 1 : 0;
                    var8 = e.field_c;
                    var3 = var8.c(32);
                    if ((128 & var3) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    im.field_c = stackIn_3_0 != 0;
                    cc.field_m = var3 & 127;
                    ve.field_h = var8.c(32);
                    rl.field_x = var8.h((byte) -68);
                    if (cc.field_m == 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    qd.field_d = 0;
                    ha.field_e = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    ha.field_e = var8.a((byte) 25);
                    qd.field_d = var8.f(-112);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 != var8.c(32)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    hb.field_v = var8.d(true);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ej.field_d = hb.field_v;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    ej.field_d = var8.d(true);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (cc.field_m == 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (4 == cc.field_m) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$2 = var8.a((byte) 25);
                    String discarded$3 = var8.d(true);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (param1) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    q.field_j = tb.a(80, (kg) (Object) var8, param0 + -119);
                    lk.field_b = null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.a((byte) 25);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = wc.field_Ub.b(1, var5);
                        q.field_j = var9.e((byte) -114);
                        if (!ej.field_d.equals((Object) (Object) qc.field_m)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = var9.field_s;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        lk.field_b = stackIn_22_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    mb.a("CC1", true, (Throwable) (Object) var6);
                    q.field_j = null;
                    lk.field_b = null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    return new oc(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_ab = null;
        }
        field_bb = null;
        field_fb = null;
        field_cb = null;
        field_ab = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_ab = "Shield upgrade";
        field_fb = new long[256];
        field_bb = "Passwords must be between 5 and 20 characters long";
        var2 = 0;
        L0: while (true) {
          if (var2 <= -257) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_fb[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0 ^ -1L) == -2L) {
                  var0 = var0 >>> -5284927 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
