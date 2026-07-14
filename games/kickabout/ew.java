/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ew {
    private long field_e;
    static String field_d;
    private byte[] field_k;
    private long field_c;
    private long field_m;
    private ao field_j;
    private long field_l;
    private int field_g;
    private int field_b;
    private byte[] field_h;
    private long field_f;
    private long field_i;
    static int field_a;

    final void a(byte param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          if (param0 != 4) {
            return;
          } else {
            ((ew) this).field_m = param1;
            return;
          }
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) lw.field_e;
                    // monitorenter lw.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nl.field_p = ao.field_d;
                        lb.field_M = lb.field_M + 1;
                        el.field_A = vf.field_G;
                        n.field_m = gf.field_b;
                        el.field_C = rp.field_A;
                        rp.field_A = false;
                        wj.field_A = vu.field_Fb;
                        sm.field_q = fp.field_w;
                        vc.field_y = fd.field_l;
                        vu.field_Fb = 0;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    if (param0 == 58) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_d = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        CharSequence var3 = null;
        var2 = -11 / ((67 - param0) / 50);
        if (vg.field_Wb) {
          if (-3 == (ov.field_b ^ -1)) {
            if (null != qi.field_o) {
              var3 = (CharSequence) (Object) param1;
              if (!qi.field_o.equals((Object) (Object) mo.a(0, var3))) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, hu param2, hu param3) {
        vp.field_k = param1;
        sf.field_F = param3;
        cv.field_f = param2;
        int var4 = 82 / ((60 - param0) / 61);
        bs.a(on.field_f / 2, 0, on.field_g / 2);
        sb.a(param3.field_L, param3.field_p + param3.field_L, param2.field_L, param2.field_p + param2.field_L, (byte) 5);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ((ew) this).field_b = param0;
        if (!((((ew) this).field_c ^ -1L) == (((ew) this).field_m ^ -1L))) {
            ((ew) this).field_j.a(param0 ^ 15557, ((ew) this).field_m);
            ((ew) this).field_c = ((ew) this).field_m;
        }
        ((ew) this).field_e = ((ew) this).field_m;
        while (((ew) this).field_h.length > ((ew) this).field_b) {
            var2 = ((ew) this).field_h.length + -((ew) this).field_b;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((ew) this).field_j.a(33, var2, ((ew) this).field_h, ((ew) this).field_b);
            // ifeq L147
            ((ew) this).field_c = ((ew) this).field_c + (long)var3;
            ((ew) this).field_b = ((ew) this).field_b + var3;
        }
    }

    public static void d(int param0) {
        if (param0 <= 68) {
            field_d = null;
        }
        field_d = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 <= 57) {
            ((ew) this).field_c = -73L;
        }
        ((ew) this).a(param1.length, 0, (byte) 115, param1);
    }

    final void c(int param0) throws IOException {
        this.e(121);
        ((ew) this).field_j.a(param0 ^ -111);
        if (param0 != 1) {
            Object var3 = null;
            boolean discarded$0 = ew.a(60, (String) null);
        }
    }

    final long a(int param0) {
        int var2 = 97 % ((-25 - param0) / 45);
        return ((ew) this).field_f;
    }

    final static void a(boolean param0, sj param1, sj param2, int param3) {
        el.a((hu) (Object) jw.field_Ab, kr.field_b, kn.field_F, uk.field_b, nj.field_d, param0, r.field_c, jf.field_B, ul.field_c, dw.field_e, 5, ip.field_c);
        il.field_d = se.a(param1, -127, "lobby", "chatfilter");
        tf.field_h[2] = pa.field_j;
        tf.field_h[param3] = gr.field_Q;
        tf.field_h[1] = lk.field_n;
        at.a((hu) (Object) rq.field_E, param2, (byte) -32);
    }

    final static int a(byte param0, int param1, ml param2, int param3, int param4, int param5) {
        if (param0 != 125) {
            field_a = -16;
        }
        return fs.a(-128, param3 == -1 ? 0 : 1 << -1 + param3, -1 == param1 ? 0 : 1 << -1 + param1, param4, param1, 0 != param5 ? 1 << param5 - 1 : 0, 0 == param4 ? 0 : 1 << param4 + -1, param2, param5, param3);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3.length >= param0 + param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param0 + (param1 - param3.length));
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ew) this).field_l == -1L) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ew) this).field_m ^ -1L) > (((ew) this).field_l ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ew) this).field_m + (long)param0 ^ -1L) >= (((ew) this).field_l - -(long)((ew) this).field_g ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        dv.a(((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param3, param1, param0);
                        ((ew) this).field_m = ((ew) this).field_m + (long)param0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = ((ew) this).field_m;
                        var7 = param1;
                        var8 = param0;
                        if (param2 >= 89) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (((ew) this).field_m < ((ew) this).field_e) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((ew) this).field_e - -(long)((ew) this).field_b <= ((ew) this).field_m) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)((ew) this).field_b + (((ew) this).field_e + -((ew) this).field_m));
                        if (var9_int > param0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        dv.a(((ew) this).field_h, (int)(((ew) this).field_m + -((ew) this).field_e), param3, param1, var9_int);
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (((ew) this).field_h.length < param0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 >= param0) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.b(0);
                        var9_int = param0;
                        if (((ew) this).field_b < var9_int) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = ((ew) this).field_b;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        dv.a(((ew) this).field_h, 0, param3, param1, var9_int);
                        ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                        param1 = param1 + var9_int;
                        param0 = param0 - var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((ew) this).field_j.a(15557, ((ew) this).field_m);
                        ((ew) this).field_c = ((ew) this).field_m;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param0 <= 0) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = ((ew) this).field_j.a(33, param0, param3, param1);
                        if (-1 != var9_int) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                        ((ew) this).field_c = ((ew) this).field_c + (long)var9_int;
                        param0 = param0 - var9_int;
                        param1 = param1 + var9_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((ew) this).field_l == -1L) {
                            statePc = 56;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((ew) this).field_m ^ -1L) <= (((ew) this).field_l ^ -1L)) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 < param0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = (int)(((ew) this).field_l - ((ew) this).field_m) + param1;
                        if (var9_int <= param0 + param1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = param1 + param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var9_int <= param1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param1++;
                        param3[param1] = (byte) 0;
                        param0--;
                        ((ew) this).field_m = ((ew) this).field_m + 1L;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((ew) this).field_l ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((long)var8 + var5_long > ((ew) this).field_l) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_long < ((ew) this).field_l) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5_long < (long)((ew) this).field_g + ((ew) this).field_l) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = var5_long;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9 = ((ew) this).field_l;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var5_long ^ -1L) <= (((ew) this).field_l - -(long)((ew) this).field_g ^ -1L)) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var5_long + (long)var8 < (long)((ew) this).field_g + ((ew) this).field_l) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = ((ew) this).field_l + (long)((ew) this).field_g;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((((ew) this).field_l ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var5_long - -(long)var8 > (long)((ew) this).field_g + ((ew) this).field_l) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-1L >= var9) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var13 = (int)(var11 + -var9);
                        dv.a(((ew) this).field_k, (int)(-((ew) this).field_l + var9), param3, (int)(-var5_long + var9) + var7, var13);
                        if (((ew) this).field_m >= var11) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param0 = (int)((long)param0 - (var11 - ((ew) this).field_m));
                        ((ew) this).field_m = var11;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5 = (IOException) (Object) caughtException;
                    ((ew) this).field_c = -1L;
                    throw var5;
                }
                case 56: {
                    if (0 < param0) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    throw new EOFException();
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((ew) this).field_f ^ -1L) > (((ew) this).field_m + (long)param2 ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((ew) this).field_f = (long)param2 + ((ew) this).field_m;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ew) this).field_l ^ -1L) == 0L) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ew) this).field_m ^ -1L) <= (((ew) this).field_l ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.e(102);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((ew) this).field_l - -(long)((ew) this).field_g ^ -1L) <= (((ew) this).field_m ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.e(102);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 > 37) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (0L == (((ew) this).field_l ^ -1L)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((long)((ew) this).field_k.length + ((ew) this).field_l ^ -1L) > (((ew) this).field_m - -(long)param2 ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5_int = (int)((long)((ew) this).field_k.length - (-((ew) this).field_l + ((ew) this).field_m));
                        dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m + -((ew) this).field_l), var5_int);
                        param2 = param2 - var5_int;
                        ((ew) this).field_m = ((ew) this).field_m + (long)var5_int;
                        param0 = param0 + var5_int;
                        ((ew) this).field_g = ((ew) this).field_k.length;
                        this.e(109);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((ew) this).field_k.length < param2) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((((ew) this).field_c ^ -1L) != (((ew) this).field_m ^ -1L)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((ew) this).field_j.a(15557, ((ew) this).field_m);
                        ((ew) this).field_c = ((ew) this).field_m;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((ew) this).field_j.a(1, param3, param0, param2);
                        ((ew) this).field_c = ((ew) this).field_c + (long)param2;
                        if (((ew) this).field_c > ((ew) this).field_i) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((ew) this).field_i = ((ew) this).field_c;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((ew) this).field_e ^ -1L) < (((ew) this).field_m ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((long)((ew) this).field_b + ((ew) this).field_e > ((ew) this).field_m) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((ew) this).field_e ^ -1L) > (((ew) this).field_m ^ -1L)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((ew) this).field_e < (long)param2 + ((ew) this).field_m) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5_long = ((ew) this).field_e;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5_long = ((ew) this).field_m;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((ew) this).field_m - -(long)param2 <= ((ew) this).field_e) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((((ew) this).field_m - -(long)param2 ^ -1L) < (((ew) this).field_e - -(long)((ew) this).field_b ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = (long)param2 + ((ew) this).field_m;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((ew) this).field_m >= ((ew) this).field_e - -(long)((ew) this).field_b) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((ew) this).field_e + (long)((ew) this).field_b <= ((ew) this).field_m + (long)param2) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7 = ((ew) this).field_e - -(long)((ew) this).field_b;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var5_long ^ -1L) >= 0L) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var7 <= var5_long) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        dv.a(param3, (int)((long)param0 - (-var5_long - -((ew) this).field_m)), ((ew) this).field_h, (int)(-((ew) this).field_e + var5_long), var9);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((ew) this).field_l != -1L) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((ew) this).field_l = ((ew) this).field_m;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param2);
                        ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                        if ((long)((ew) this).field_g >= ((ew) this).field_m - ((ew) this).field_l) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ew) this).field_g = (int)(-((ew) this).field_l + ((ew) this).field_m);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return;
                }
                case 50: {
                    var5 = (IOException) (Object) caughtException;
                    ((ew) this).field_c = -1L;
                    throw var5;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 > 92) {
            break L0;
          } else {
            ((ew) this).field_f = 70L;
            break L0;
          }
        }
        L1: {
          if (-1L != ((ew) this).field_l) {
            L2: {
              if (((ew) this).field_c == ((ew) this).field_l) {
                break L2;
              } else {
                ((ew) this).field_j.a(15557, ((ew) this).field_l);
                ((ew) this).field_c = ((ew) this).field_l;
                break L2;
              }
            }
            L3: {
              ((ew) this).field_j.a(1, ((ew) this).field_k, 0, ((ew) this).field_g);
              ((ew) this).field_c = ((ew) this).field_c + (long)((ew) this).field_g;
              if (((ew) this).field_i >= ((ew) this).field_c) {
                break L3;
              } else {
                ((ew) this).field_i = ((ew) this).field_c;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((((ew) this).field_l ^ -1L) > (((ew) this).field_e ^ -1L)) {
                  break L5;
                } else {
                  if ((((ew) this).field_l ^ -1L) <= (((ew) this).field_e + (long)((ew) this).field_b ^ -1L)) {
                    break L5;
                  } else {
                    var2 = ((ew) this).field_l;
                    break L4;
                  }
                }
              }
              if (((ew) this).field_e < ((ew) this).field_l) {
                break L4;
              } else {
                if (((long)((ew) this).field_g + ((ew) this).field_l ^ -1L) >= (((ew) this).field_e ^ -1L)) {
                  break L4;
                } else {
                  var2 = ((ew) this).field_e;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((ew) this).field_l - -(long)((ew) this).field_g <= ((ew) this).field_e) {
                  break L7;
                } else {
                  if ((long)((ew) this).field_b + ((ew) this).field_e >= ((ew) this).field_l + (long)((ew) this).field_g) {
                    var4 = ((ew) this).field_l + (long)((ew) this).field_g;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (((long)((ew) this).field_b + ((ew) this).field_e ^ -1L) >= (((ew) this).field_l ^ -1L)) {
                break L6;
              } else {
                if ((((ew) this).field_l - -(long)((ew) this).field_g ^ -1L) > ((long)((ew) this).field_b + ((ew) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  var4 = (long)((ew) this).field_b + ((ew) this).field_e;
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  dv.a(((ew) this).field_k, (int)(var2 + -((ew) this).field_l), ((ew) this).field_h, (int)(-((ew) this).field_e + var2), var6);
                  break L8;
                }
              }
            }
            ((ew) this).field_g = 0;
            ((ew) this).field_l = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ew(ao param0, int param1, int param2) throws IOException {
        ((ew) this).field_e = -1L;
        ((ew) this).field_l = -1L;
        ((ew) this).field_g = 0;
        ((ew) this).field_j = param0;
        ((ew) this).field_i = param0.c(31114);
        ((ew) this).field_f = param0.c(31114);
        ((ew) this).field_k = new byte[param2];
        ((ew) this).field_h = new byte[param1];
        ((ew) this).field_m = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The auction system is currently offline.";
    }
}
