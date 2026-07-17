/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

final class bf extends bj implements sg, qb, qn {
    private gd field_R;
    static rk[] field_M;
    private bo field_J;
    private ue field_H;
    rh field_G;
    static String field_O;
    private hc field_P;
    static om field_L;
    private gd field_I;
    private hc field_K;
    private gd field_N;
    static ed field_T;
    private gd field_Q;
    private gd field_U;
    private gd field_S;

    private final int a(int param0, hm param1, String param2, int param3, int param4) {
        ki var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6 = new ki(20, param3, param0 + 120, 25, param1, false, 120, 3, sb.field_a, 16777215, param2);
            ((bf) this).b((hm) (Object) var6, false);
            stackOut_0_0 = var6.field_x;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("bf.D(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + 100 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != ((bf) this).field_P) {
                if (((bf) this).field_K != param0) {
                  break L1;
                } else {
                  boolean discarded$2 = this.h((byte) 123);
                  break L1;
                }
              } else {
                qe.a(true);
                break L1;
              }
            }
            if (param3 == 1) {
              break L0;
            } else {
              ((bf) this).field_N = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("bf.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(int param0, String param1, int param2, hm param3, String param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 170) {
                break L1;
              } else {
                field_T = null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(35, param3, 170, param1, param0 + -145, param4, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("bf.H(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 170 + 41);
        }
        return stackIn_3_0;
    }

    public final void a(byte param0, String param1) {
        gd var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = ((bf) this).field_S;
            var4 = param1;
            ((ul) (Object) var3).a(var4, false, -33);
            if (param0 < -49) {
              break L0;
            } else {
              ((bf) this).field_U = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("bf.J(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, int param1, DataInputStream param2, int param3, int param4, int[] param5, int param6) throws IOException {
        int var7_int = param4 + param3 >> 1;
        int var8 = param0 - -param1 >> 1;
        int var9 = param2.readUnsignedByte();
        ka.a(param3, 3 & var9, var8, var7_int, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        ka.a(var7_int, var9 & 3, var8, param4, param2, param5, (byte) -74, param0);
        var9 = var9 >>> 2;
        try {
            ka.a(param3, var9 & 3, param1, var7_int, param2, param5, (byte) -74, var8);
            var9 = var9 >>> 2;
            ka.a(var7_int, var9, param1, param4, param2, param5, (byte) -74, var8);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bf.L(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + 2147483647 + 41);
        }
    }

    public static void l(int param0) {
        field_T = null;
        field_L = null;
        field_O = null;
        field_M = null;
    }

    public bf() {
        super(0, 0, 496, 0, (db) null);
        ((bf) this).field_S = new gd("", (wn) null, 12);
        ((bf) this).field_I = new gd("", (wn) null, 100);
        ((bf) this).field_R = new gd("", (wn) null, 100);
        ((bf) this).field_Q = new gd("", (wn) null, 20);
        ((bf) this).field_U = new gd("", (wn) null, 20);
        ((bf) this).field_N = new gd("", (wn) null, 3);
        int var1 = 1;
        ((bf) this).field_J = new bo("", (wn) null, var1 != 0);
        ((bf) this).field_K = new hc(ag.field_c, (wn) null);
        ((bf) this).field_P = new hc(c.field_p, (wn) null);
        ((bf) this).field_S.field_i = bb.field_K;
        ((bf) this).field_I.field_i = en.field_a;
        ((bf) this).field_R.field_i = co.field_f;
        ((bf) this).field_Q.field_i = aa.field_b;
        ((bf) this).field_U.field_i = pl.field_i;
        ((bf) this).field_N.field_i = ta.field_k;
        ((bf) this).field_J.field_i = ad.field_h;
        ((bf) this).field_S.a((el) (Object) new kf((ul) (Object) ((bf) this).field_S), (byte) 63);
        ((bf) this).field_I.a((el) (Object) new hi((ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_R.a((el) (Object) new dg((ul) (Object) ((bf) this).field_R, (ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_Q.a((el) (Object) new nk((ul) (Object) ((bf) this).field_Q, (ul) (Object) ((bf) this).field_S, (ul) (Object) ((bf) this).field_I), (byte) 63);
        ((bf) this).field_U.a((el) (Object) new lb((ul) (Object) ((bf) this).field_U, (ul) (Object) ((bf) this).field_Q), (byte) 63);
        ((bf) this).field_N.a((el) (Object) new kl((ul) (Object) ((bf) this).field_N), (byte) 63);
        ((bf) this).field_K.field_y = false;
        ((bf) this).field_K.field_s = (db) (Object) new ck();
        ((bf) this).field_P.field_s = (db) (Object) new ha();
        ((bf) this).field_S.field_s = (db) (Object) new re(10000536);
        re dupTemp$0 = new re(10000536);
        ((bf) this).field_R.field_s = (db) (Object) dupTemp$0;
        ((bf) this).field_I.field_s = (db) (Object) dupTemp$0;
        ((bf) this).field_N.field_s = (db) (Object) new re(10000536);
        ((bf) this).field_J.field_s = (db) (Object) new ae();
        un dupTemp$1 = new un(10000536);
        ((bf) this).field_U.field_s = (db) (Object) dupTemp$1;
        ((bf) this).field_Q.field_s = (db) (Object) dupTemp$1;
        String var2 = r.a(aj.field_b, -63, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(170, (hm) (Object) ((bf) this).field_I, tm.field_Z, var3, 100);
        var3 = var3 + (this.a(20, (hm) (Object) ((bf) this).field_R, 170, ri.field_a, 25, "", var3) - -5);
        var3 = var3 + this.a(170, (hm) (Object) ((bf) this).field_Q, qc.field_vb, var3, 100);
        var3 = var3 + (this.a(170, mh.field_d, var3, (hm) (Object) ((bf) this).field_U, rm.field_a, 170) + 5);
        var3 = var3 + (5 + this.a(170, lf.field_J, var3, (hm) (Object) ((bf) this).field_S, ig.field_i, 170));
        var3 = var3 + this.a(qm.field_a, (byte) 123, var3, (hm) (Object) ((bf) this).field_N, 170);
        ki var4 = new ki(46, var3, -90 + ((bf) this).field_g, 25, (hm) (Object) ((bf) this).field_J, true, -120 + ((bf) this).field_g, 5, ke.field_c, 11579568, ii.field_b);
        ((bf) this).b((hm) (Object) var4, false);
        var3 = var3 + var4.field_x;
        k var5 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, sb.field_a.field_r, -1, 2147483647, true);
        ((bf) this).field_H = new ue(var2, (db) (Object) var5);
        ((bf) this).field_H.field_i = "";
        ((bf) this).field_H.a(ah.field_m, (byte) 65, 0);
        ((bf) this).field_H.a(ah.field_m, (byte) 97, 1);
        ((bf) this).field_H.field_q = (wn) this;
        ((bf) this).field_H.b(2463, 46, ((bf) this).field_g - 90, var3);
        var3 = var3 + (15 + ((bf) this).field_H.field_x);
        ((bf) this).b((hm) (Object) ((bf) this).field_H, false);
        int var6 = 4;
        int var7 = 200;
        ((bf) this).field_K.a(var7, var3, -var7 + 496 >> 1, true, 40);
        ((bf) this).field_P.a(60, 15 + var3, var6 + 3, true, 40);
        ((bf) this).field_P.field_q = (wn) this;
        ((bf) this).field_K.field_q = (wn) this;
        ((bf) this).b((hm) (Object) ((bf) this).field_K, false);
        ((bf) this).b((hm) (Object) ((bf) this).field_P, false);
        ((bf) this).field_G = new rh((qn) this);
        ((bf) this).field_G.a(-60 + -((bf) this).field_S.field_k + (((bf) this).field_g + -((bf) this).field_S.field_g), 20 + ((bf) this).field_S.field_j, 60 + ((bf) this).field_S.field_k - -((bf) this).field_S.field_g, true, 150);
        ((bf) this).b((hm) (Object) ((bf) this).field_G, false);
        ((bf) this).a(496, 0, 0, true, var6 + (var3 - -55));
    }

    private final String k(int param0) {
        return "</col></u>";
    }

    public final void a(byte param0) {
        ((kf) (Object) ((bf) this).field_S.a((byte) -89)).g(22186);
        if (param0 != -61) {
            field_T = null;
        }
    }

    private final boolean a(boolean param0, og param1) {
        el var3 = null;
        RuntimeException var3_ref = null;
        rf var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (!param0) {
              var3 = param1.a((byte) -89);
              if (var3 != null) {
                var4 = var3.a(17124);
                if (var4 == ob.field_a) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                } else {
                  if (var4 != of.field_f) {
                    if (var4 != re.field_s) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  }
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("bf.F(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final static te a(mf param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        te stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(-1, param3);
              if (param1 > 48) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            var5 = param0.a(var4_int, param2, true);
            stackOut_2_0 = he.a(param0, -18109, var5, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("bf.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    private final int a(String param0, byte param1, int param2, hm param3, int param4) {
        RuntimeException var6 = null;
        oj var7 = null;
        ki var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var8 = new ki(20, param2, 290, 25, param3, false, 120, 3, sb.field_a, 16777215, param0);
              ((bf) this).b((hm) (Object) var8, false);
              if (param1 == 123) {
                break L1;
              } else {
                ((bf) this).field_J = null;
                break L1;
              }
            }
            var7 = new oj(((og) (Object) param3).a((byte) -89));
            ((bf) this).b((hm) (Object) var7, false);
            var7.a(15, (-15 + var8.field_x >> 1) + var8.field_j, 3 + var8.field_g + var8.field_k, true, 15);
            stackOut_2_0 = var8.field_x;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("bf.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 170 + 41);
        }
        return stackIn_3_0;
    }

    final static java.awt.Canvas i(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        af stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        af stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 != 10) {
          L0: {
            field_M = null;
            if (null != df.field_d) {
              stackOut_7_0 = df.field_d;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = of.field_d;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != df.field_d) {
              stackOut_3_0 = df.field_d;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = of.field_d;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((bf) this).field_K.field_y = this.b(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bf.Q(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final boolean b(boolean param0) {
        if (this.a(false, (og) (Object) ((bf) this).field_S)) {
          if (this.a(false, (og) (Object) ((bf) this).field_I)) {
            if (this.a(false, (og) (Object) ((bf) this).field_R)) {
              if (this.a(false, (og) (Object) ((bf) this).field_Q)) {
                if (this.a(false, (og) (Object) ((bf) this).field_U)) {
                  if (!this.a(false, (og) (Object) ((bf) this).field_N)) {
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
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final String j(int param0) {
        int var2 = 0;
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_11_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 20)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((bf) this).a((byte) 22, param0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param3 > 0) {
                    break L1;
                  } else {
                    ((bf) this).field_I = null;
                    break L1;
                  }
                }
                if (param2 != 99) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = ((bf) this).a(param0, true);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("bf.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0 != 0;
    }

    private final int a(int param0, hm param1, int param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        lf var9 = null;
        ki var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new ki(20, param6, 120 - -param2, param4, param1, false, 120, 3, sb.field_a, 16777215, param3);
            ((bf) this).b((hm) (Object) var10, false);
            var9 = new lf(((og) (Object) param1).a((byte) -89), param5, 126, var10.field_x + param6, param2 - -50, param0);
            var9.field_q = (wn) this;
            ((bf) this).b((hm) (Object) var9, false);
            stackOut_0_0 = var9.field_x + var10.field_x;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("bf.B(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean h(byte param0) {
        if (!(this.b(true))) {
            return false;
        }
        int var2 = -1;
        int var3 = 0;
        try {
            var2 = Integer.parseInt(((bf) this).field_N.field_l);
        } catch (NumberFormatException numberFormatException) {
        }
        return e.a((bf) this, false, ((bf) this).field_I.field_l, var2, ((bf) this).field_Q.field_l, ((bf) this).field_J.field_z, ((bf) this).field_S.field_l);
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 == -2861) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            if (0 != param2) {
              if (1 == param2) {
                qd.a(12, "privacy.ws");
                return;
              } else {
                if (2 != param2) {
                  break L0;
                } else {
                  qd.a(12, "conduct.ws");
                  return;
                }
              }
            } else {
              qd.a(12, "terms.ws");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("bf.A(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1) {
        if (!(null == bk.field_r)) {
            bk.field_r.b(-1, param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Complete the tutorial by following<br>the instructions at the top of the screen.";
        field_L = new om(11, 0, 1, 2);
    }
}
