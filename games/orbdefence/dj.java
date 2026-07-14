/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj {
    private gl field_f;
    private int field_d;
    private long field_n;
    private long field_l;
    private long field_i;
    private byte[] field_g;
    private byte[] field_m;
    private long field_h;
    private long field_a;
    private long field_k;
    static String field_j;
    private int field_c;
    private static int[] field_b;
    static String field_e;

    final long b(int param0) {
        int var2 = -3 % ((49 - param0) / 57);
        return ((dj) this).field_k;
    }

    private final void b(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 68) {
          return;
        } else {
          L0: {
            if (-1L == ((dj) this).field_h) {
              break L0;
            } else {
              L1: {
                if (((dj) this).field_i != ((dj) this).field_h) {
                  ((dj) this).field_f.a(param0 ^ -8965, ((dj) this).field_h);
                  ((dj) this).field_i = ((dj) this).field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((dj) this).field_f.a(0, (byte) 127, ((dj) this).field_d, ((dj) this).field_m);
                ((dj) this).field_i = ((dj) this).field_i + (long)((dj) this).field_d;
                if ((((dj) this).field_l ^ -1L) > (((dj) this).field_i ^ -1L)) {
                  ((dj) this).field_l = ((dj) this).field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if ((((dj) this).field_n ^ -1L) < (((dj) this).field_h ^ -1L)) {
                    break L4;
                  } else {
                    if ((((dj) this).field_h ^ -1L) > (((dj) this).field_n + (long)((dj) this).field_c ^ -1L)) {
                      var2 = ((dj) this).field_h;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((dj) this).field_n < ((dj) this).field_h) {
                  break L3;
                } else {
                  if (((dj) this).field_n < (long)((dj) this).field_d + ((dj) this).field_h) {
                    var2 = ((dj) this).field_n;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((long)((dj) this).field_d + ((dj) this).field_h ^ -1L) >= (((dj) this).field_n ^ -1L)) {
                    break L6;
                  } else {
                    if (((dj) this).field_n - -(long)((dj) this).field_c >= (long)((dj) this).field_d + ((dj) this).field_h) {
                      var4 = ((dj) this).field_h + (long)((dj) this).field_d;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((long)((dj) this).field_c + ((dj) this).field_n <= ((dj) this).field_h) {
                  break L5;
                } else {
                  if (((dj) this).field_n + (long)((dj) this).field_c > ((dj) this).field_h - -(long)((dj) this).field_d) {
                    break L5;
                  } else {
                    var4 = (long)((dj) this).field_c + ((dj) this).field_n;
                    break L5;
                  }
                }
              }
              L7: {
                if (-1L >= var2) {
                  break L7;
                } else {
                  if (var4 > var2) {
                    var6 = (int)(-var2 + var4);
                    mk.a(((dj) this).field_m, (int)(var2 - ((dj) this).field_h), ((dj) this).field_g, (int)(-((dj) this).field_n + var2), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              ((dj) this).field_h = -1L;
              ((dj) this).field_d = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((dj) this).field_a = param0;
        if (param1 != -1) {
            ((dj) this).field_h = -49L;
        }
    }

    final static void a(ki param0, byte param1, ki param2, ki param3) {
        int var8 = 0;
        int var9 = 0;
        qg[] var15 = null;
        int var11_int = 0;
        int var13 = OrbDefence.field_D ? 1 : 0;
        sd.field_f = p.a(13863, "commonui", param2, "frame_top");
        he.field_y = p.a(13863, "commonui", param2, "frame_bottom");
        qe.field_c = fk.a(param2, "jagex_logo_grey", 91, "commonui");
        ea.field_b = p.a(13863, "commonui", param2, "button");
        wd.field_C = t.a("commonui", param2, "validation", -69);
        pc.field_bb = (kc) (Object) wl.a("arezzo12", (byte) -124, "commonui", param2, param3);
        lm.field_f = (kc) (Object) wl.a("arezzo14", (byte) -111, "commonui", param2, param3);
        if (param1 <= 91) {
            Object var14 = null;
            dj.a((ki) null, (byte) 9, (ki) null, (ki) null);
        }
        qc.field_b = (kc) (Object) wl.a("arezzo14bold", (byte) -120, "commonui", param2, param3);
        hj var18 = new hj(param0.a("", 1, "button.gif"), (java.awt.Component) (Object) tf.field_f);
        qg discarded$0 = uc.a(false, "commonui", param2, "dropdown");
        qg[] var5 = fl.a(-9945, param2, "commonui", "screen_options");
        kk.field_P = new qg[4];
        dc.field_h = new qg[4];
        ck.field_n = new qg[4];
        qg[][] var6 = new qg[][]{dc.field_h, kk.field_P, ck.field_n};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_k;
        for (var8 = 1; var22.length > var8; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_l[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var15 = var6[var9];
            qg[] var10 = var15;
            for (var11_int = 0; var15.length > var11_int; var11_int++) {
                var15[var11_int] = h.a(var5[var9], (byte) 37, var22[var11_int]);
            }
        }
        var9 = var18.field_k;
        h.k(126);
        var18.d();
        ul.h(0, 0, ul.field_f, ul.field_l);
        hj var16 = new hj(var9, var9);
        hj var19 = var16;
        var19.d();
        var18.b(0, 0);
        hj var11 = new hj(var9, var9);
        var11.d();
        var18.b(-var18.field_o + var9, 0);
        hj var12 = new hj(-(2 * var9) + var18.field_o, var9);
        var12.d();
        var18.b(-var9, 0);
        oc.g((byte) -105);
        ea.field_b = new hj[]{var16, var12, var11};
    }

    final void a(byte param0) throws IOException {
        this.b((byte) 68);
        ((dj) this).field_f.d(26);
        int var2 = 0 / ((param0 - -41) / 51);
    }

    public static void c(byte param0) {
        field_j = null;
        field_e = null;
        field_b = null;
        if (param0 <= 72) {
            Object var2 = null;
            dj.a((ki) null, (byte) 47, (ki) null, (ki) null);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        ((dj) this).field_c = 0;
        if (!(((dj) this).field_a == ((dj) this).field_i)) {
            ((dj) this).field_f.a(-9025, ((dj) this).field_a);
            ((dj) this).field_i = ((dj) this).field_a;
        }
        ((dj) this).field_n = ((dj) this).field_a;
        while (((dj) this).field_g.length > ((dj) this).field_c) {
            var2 = -((dj) this).field_c + ((dj) this).field_g.length;
            if ((var2 ^ -1) < -200000001) {
                var2 = 200000000;
            }
            var3 = ((dj) this).field_f.a(((dj) this).field_c, var2, -4837, ((dj) this).field_g);
            // if_icmpeq L141
            ((dj) this).field_i = ((dj) this).field_i + (long)var3;
            ((dj) this).field_c = ((dj) this).field_c + var3;
        }
        if (param0 != 200000000) {
            field_e = null;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3.length < param2 + param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param3.length + param0 + param2);
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((dj) this).field_h == -1L) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((dj) this).field_a ^ -1L) > (((dj) this).field_h ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((dj) this).field_h + (long)((dj) this).field_d >= (long)param2 + ((dj) this).field_a) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mk.a(((dj) this).field_m, (int)(-((dj) this).field_h + ((dj) this).field_a), param3, param0, param2);
                        ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var7 = -113 / ((param1 - -65) / 40);
                        var5_long = ((dj) this).field_a;
                        var8 = param0;
                        var9 = param2;
                        if (((dj) this).field_n > ((dj) this).field_a) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((dj) this).field_a < (long)((dj) this).field_c + ((dj) this).field_n) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10_int = (int)((long)((dj) this).field_c + (((dj) this).field_n + -((dj) this).field_a));
                        if (var10_int <= param2) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10_int = param2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        mk.a(((dj) this).field_g, (int)(-((dj) this).field_n + ((dj) this).field_a), param3, param0, var10_int);
                        ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        param0 = param0 + var10_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 > ((dj) this).field_g.length) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 > 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(200000000);
                        var10_int = param2;
                        if (var10_int <= ((dj) this).field_c) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10_int = ((dj) this).field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        mk.a(((dj) this).field_g, 0, param3, param0, var10_int);
                        param0 = param0 + var10_int;
                        ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((dj) this).field_f.a(-9025, ((dj) this).field_a);
                        ((dj) this).field_i = ((dj) this).field_a;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((param2 ^ -1) >= -1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10_int = ((dj) this).field_f.a(param0, param2, -4837, param3);
                        if (-1 == var10_int) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((dj) this).field_i = ((dj) this).field_i + (long)var10_int;
                        param0 = param0 + var10_int;
                        ((dj) this).field_a = ((dj) this).field_a + (long)var10_int;
                        param2 = param2 - var10_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1L == ((dj) this).field_h) {
                            statePc = 55;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((((dj) this).field_h ^ -1L) >= (((dj) this).field_a ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (0 >= param2) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10_int = param0 - -(int)(-((dj) this).field_a + ((dj) this).field_h);
                        if (var10_int <= param0 + param2) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10_int = param0 + param2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var10_int <= param0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param2--;
                        param0++;
                        param3[param0] = (byte) 0;
                        ((dj) this).field_a = ((dj) this).field_a + 1L;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10 = -1L;
                        var12 = -1L;
                        if (var5_long > ((dj) this).field_h) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((long)var9 + var5_long > ((dj) this).field_h) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var5_long ^ -1L) > (((dj) this).field_h ^ -1L)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var5_long ^ -1L) > (((dj) this).field_h - -(long)((dj) this).field_d ^ -1L)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = var5_long;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = ((dj) this).field_h;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_long >= ((dj) this).field_h - -(long)((dj) this).field_d) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((long)var9 + var5_long >= ((dj) this).field_h - -(long)((dj) this).field_d) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((long)var9 + var5_long <= ((dj) this).field_h) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((dj) this).field_h - -(long)((dj) this).field_d ^ -1L) > (var5_long + (long)var9 ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var12 = var5_long + (long)var9;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var12 = (long)((dj) this).field_d + ((dj) this).field_h;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1L >= var10) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var12 <= var10) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var14 = (int)(-var10 + var12);
                        mk.a(((dj) this).field_m, (int)(var10 + -((dj) this).field_h), param3, var8 + (int)(-var5_long + var10), var14);
                        if (var12 > ((dj) this).field_a) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param2 = (int)((long)param2 - (var12 + -((dj) this).field_a));
                        ((dj) this).field_a = var12;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5 = (IOException) (Object) caughtException;
                    ((dj) this).field_i = -1L;
                    throw var5;
                }
                case 55: {
                    if ((param2 ^ -1) < -1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return;
                }
                case 57: {
                    throw new EOFException();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 4) {
            return;
        }
        ((dj) this).a(0, (byte) -126, param0.length, param0);
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
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
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
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
                    return;
                }
                case 3: {
                    try {
                        if (((long)param2 + ((dj) this).field_a ^ -1L) >= (((dj) this).field_k ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((dj) this).field_k = ((dj) this).field_a + (long)param2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0L == (((dj) this).field_h ^ -1L)) {
                            statePc = 11;
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
                        if ((((dj) this).field_a ^ -1L) <= (((dj) this).field_h ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b((byte) 68);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((((dj) this).field_a ^ -1L) >= (((dj) this).field_h + (long)((dj) this).field_d ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
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
                        this.b((byte) 68);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0L == (((dj) this).field_h ^ -1L)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((long)((dj) this).field_m.length + ((dj) this).field_h ^ -1L) > (((dj) this).field_a - -(long)param2 ^ -1L)) {
                            statePc = 14;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = (int)((long)((dj) this).field_m.length + ((dj) this).field_h + -((dj) this).field_a);
                        mk.a(param1, param3, ((dj) this).field_m, (int)(((dj) this).field_a + -((dj) this).field_h), var5_int);
                        param3 = param3 + var5_int;
                        ((dj) this).field_a = ((dj) this).field_a + (long)var5_int;
                        param2 = param2 - var5_int;
                        ((dj) this).field_d = ((dj) this).field_m.length;
                        this.b((byte) 68);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((dj) this).field_m.length < param2) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (((dj) this).field_i == ((dj) this).field_a) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((dj) this).field_f.a(-9025, ((dj) this).field_a);
                        ((dj) this).field_i = ((dj) this).field_a;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((dj) this).field_f.a(param3, (byte) 0, param2, param1);
                        ((dj) this).field_i = ((dj) this).field_i + (long)param2;
                        if ((((dj) this).field_i ^ -1L) < (((dj) this).field_l ^ -1L)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((dj) this).field_l = ((dj) this).field_i;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        if ((((dj) this).field_a ^ -1L) > (((dj) this).field_n ^ -1L)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((dj) this).field_n + (long)((dj) this).field_c > ((dj) this).field_a) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((dj) this).field_a > ((dj) this).field_n) {
                            statePc = 30;
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
                        if ((((dj) this).field_n ^ -1L) > ((long)param2 + ((dj) this).field_a ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5_long = ((dj) this).field_n;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_long = ((dj) this).field_a;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((((dj) this).field_n ^ -1L) <= (((dj) this).field_a - -(long)param2 ^ -1L)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((long)param2 + ((dj) this).field_a <= (long)((dj) this).field_c + ((dj) this).field_n) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((dj) this).field_n - -(long)((dj) this).field_c <= ((dj) this).field_a) {
                            statePc = 37;
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
                        if ((((dj) this).field_a + (long)param2 ^ -1L) > ((long)((dj) this).field_c + ((dj) this).field_n ^ -1L)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var7 = (long)((dj) this).field_c + ((dj) this).field_n;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = (long)param2 + ((dj) this).field_a;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var7 <= var5_long) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = (int)(var7 + -var5_long);
                        mk.a(param1, (int)((long)param3 - -var5_long - ((dj) this).field_a), ((dj) this).field_g, (int)(-((dj) this).field_n + var5_long), var9);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return;
                }
                case 42: {
                    try {
                        if (-1 > (param2 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-1L == ((dj) this).field_h) {
                            statePc = 46;
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
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((dj) this).field_h = ((dj) this).field_a;
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
                        mk.a(param1, param3, ((dj) this).field_m, (int)(((dj) this).field_a - ((dj) this).field_h), param2);
                        ((dj) this).field_a = ((dj) this).field_a + (long)param2;
                        if (((long)((dj) this).field_d ^ -1L) <= (-((dj) this).field_h + ((dj) this).field_a ^ -1L)) {
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
                        ((dj) this).field_d = (int)(-((dj) this).field_h + ((dj) this).field_a);
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
                    ((dj) this).field_i = -1L;
                    throw var5;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    dj(gl param0, int param1, int param2) throws IOException {
        ((dj) this).field_d = 0;
        ((dj) this).field_h = -1L;
        ((dj) this).field_n = -1L;
        ((dj) this).field_f = param0;
        ((dj) this).field_l = param0.a(1);
        ((dj) this).field_k = param0.a(1);
        ((dj) this).field_g = new byte[param1];
        ((dj) this).field_a = 0L;
        ((dj) this).field_m = new byte[param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Error connecting to server. Please try using a different server.";
        field_b = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var6 = (long)(1 + (var0 << 2098107521));
            var4 = (long)((var0 << 815378913) + -1);
            var2 = (int)(-32768L + (var4 * var4 >> 2135928146));
            var3 = (int)(-32768L + (var6 * var6 >> -1039789486));
            if (field_b.length <= var3) {
                var3 = field_b.length + -1;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_b[var1] = var0;
            }
        }
        field_e = "Orb Points";
    }
}
