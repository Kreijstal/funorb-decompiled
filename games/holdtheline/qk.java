/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk {
    short field_o;
    short[] field_K;
    byte[] field_r;
    int[] field_C;
    int[] field_M;
    short[] field_O;
    short[] field_t;
    short[] field_c;
    byte field_l;
    int[] field_D;
    int[] field_g;
    private boolean field_B;
    short[] field_w;
    static sd field_j;
    short[] field_k;
    short[] field_q;
    short[] field_Q;
    short[] field_i;
    short[] field_z;
    short[] field_A;
    int[] field_a;
    int field_n;
    static hj[] field_y;
    static mg field_f;
    int[] field_h;
    int field_d;
    int field_L;
    int field_H;
    int field_p;
    short[] field_P;
    int[] field_R;
    short[] field_s;
    short field_J;
    short[] field_m;
    static String field_I;
    short[] field_G;
    int field_F;
    short field_u;
    int[] field_v;
    short[] field_e;
    short[] field_x;
    int[] field_b;
    short[] field_N;
    static hj[] field_E;

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          if (param0 <= param1) {
            return;
          }
          if (1 + param1 >= param4) {
            return;
          }
          if (param4 > param1 + 5 &&
            param5 != param6) {
            var7_int = (param5 & param6 & 1) + (param6 >> 1) + (param5 >> 1);
            var8 = param1;
            var9 = param6;
            var10 = param5;
            for (var11 = param1; param4 > var11; var11++) {
              var12 = im.field_h[var11];
              if (!param3) {
                stackIn_24_0 = oh.field_s[var12];
              } else {
                stackIn_24_0 = va.field_j[var12];
              }
              var13 = stackIn_24_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                im.field_h[var11] = im.field_h[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                im.field_h[incrementValue$0] = var12;
              }
            }
            qk.a(param0, param1, param2, param3, var8, var9, param6);
            qk.a(param0, var8, param2, param3, param4, param5, var10);
            return;
          }
          for (var7_intLifetime1 = param4 - 1; param1 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param1; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = im.field_h[var8Lifetime1];
              var10Lifetime1 = im.field_h[1 + var8Lifetime1];
              if (mf.a(var10Lifetime1, param3, var9Lifetime1, 13234)) {
                im.field_h[var8Lifetime1] = var10Lifetime1;
                im.field_h[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var7), "qk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int[] a(int[] param0, byte param1) {
        int incrementValue$0 = 0;
        int[] stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        pf var8 = null;
        pf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        pf var14 = null;
        int var6Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var11 = HoldTheLine.field_D;
        try {
          var2_int = param0[0];
          var3 = param0[1];
          var4 = param0.length / 2;
          for (var5 = 1; var4 > var5; var5++) {
            if (param0[2 * var5] < var2_int ||
              var2_int == param0[2 * var5] &&
              param0[2 * var5 + 1] < var3) {
              var2_int = param0[2 * var5];
              var3 = param0[2 * var5 + 1];
            }
          }
          if (null == qn.field_l ||
            !(var4 <= qn.field_l.length)) {
            qn.field_l = new pf[var4];
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < var4; var5Lifetime1++) {
            qn.field_l[var5Lifetime1] = new pf();
          }
          for (var5Lifetime2 = 0; var4 > var5Lifetime2; var5Lifetime2++) {
            qn.field_l[var5Lifetime2].field_a = -var2_int + param0[var5Lifetime2 * 2];
            qn.field_l[var5Lifetime2].field_e = param0[var5Lifetime2 * 2 + 1] - var3;
          }
          if (param1 >= -110) {
            qk.a(-8);
          }
          en.a(5433, qn.field_l, var4);
          var5Lifetime3 = 2;
          var6 = 2;
          while (var4 > var6) {
            var14 = qn.field_l[-2 + var5Lifetime3];
            var8 = qn.field_l[var5Lifetime3 - 1];
            var9 = qn.field_l[var6];
            var10 = -((-var14.field_e + var8.field_e) * (var9.field_a - var14.field_a)) + (-var14.field_a + var8.field_a) * (var9.field_e - var14.field_e);
            if (var10 <= 0 &&
              var5Lifetime3 >= 3) {
              var5Lifetime3--;
              continue;
            }
            incrementValue$0 = var5Lifetime3;
            var5Lifetime3++;
            qn.field_l[incrementValue$0] = var9;
            var6++;
          }
          var12 = new int[2 * var5Lifetime3];
          var7 = var12;
          var13 = 0;
          var6Lifetime1 = var13;
          while (var5Lifetime3 > var13) {
            var12[var13 * 2] = var2_int + qn.field_l[var13].field_a;
            var12[2 * var13 + 1] = qn.field_l[var13].field_e + var3;
            var13++;
          }
          stackIn_36_0 = var7;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("qk.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 >= -101) {
          this.a((byte) -87);
        }
        this.field_B = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        if (param3 != 2) {
          return;
        }
        for (var6 = 0; var6 < this.field_u; var6++) {
          this.field_m[var6] = (short)(param2 * this.field_m[var6] / param4);
          this.field_G[var6] = (short)(this.field_G[var6] * param1 / param4);
          this.field_k[var6] = (short)(param0 * this.field_k[var6] / param4);
        }
        this.a((byte) -103);
    }

    final void c(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = HoldTheLine.field_D;
        if (this.field_B) {
          return;
        }
        this.field_B = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = param0; this.field_u > var8; var8++) {
          var9 = this.field_m[var8];
          var10 = this.field_G[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var3 > var10) {
            var3 = var10;
          }
          var11 = this.field_k[var8];
          if (var4 > var11) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        this.field_H = var3;
        this.field_n = var4;
        this.field_p = var7;
        this.field_L = var2;
        this.field_d = var6;
        this.field_F = var5;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (param2 != -26608) {
          qk.a(-35);
        }
        for (var5 = 0; this.field_u > var5; var5++) {
          this.field_m[var5] = (short)(this.field_m[var5] + param1);
          this.field_G[var5] = (short)(this.field_G[var5] + param0);
          this.field_k[var5] = (short)(this.field_k[var5] + param3);
        }
        this.a((byte) -109);
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != -32768) {
          field_I = (String) null;
        }
        field_y = null;
        field_f = null;
        field_j = null;
        field_I = null;
    }

    final static int b(int param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          th var2 = null;
          if (ce.field_n.field_c >= 4) {
            if (ce.field_n.field_f == -1) {
              return 3;
            }
            if (ce.field_n.field_f != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (lc.field_g == 0) {
              tl.field_y = kl.field_v.a(0, lg.field_e, pe.field_c);
              lc.field_g = lc.field_g + 1;
            }
            if (lc.field_g == param0) {
              if (2 == tl.field_y.field_d) {
                stackIn_13_0 = bd.a(-1, 8077);
                return stackIn_13_0;
              }
              if (1 == tl.field_y.field_d) {
                lc.field_g = lc.field_g + 1;
              }
            }
            if (2 == lc.field_g) {
              oc.field_c = new nn((java.net.Socket) (tl.field_y.field_b), kl.field_v);
              var2 = new th(13);
              ui.a(a.field_H, (byte) -95, var2, ee.field_n, wd.field_r);
              var2.f(111, 15);
              var2.a((byte) -58, rd.field_g);
              oc.field_c.a(13, var2.field_i, 0, 1);
              lc.field_g = lc.field_g + 1;
              aj.field_b = 30000L + bb.b(-1);
            }
            if (lc.field_g == 3) {
              if (oc.field_c.b(false) > 0) {
                var1_int = oc.field_c.c(-27418);
                if (var1_int != 0) {
                  stackIn_28_0 = bd.a(var1_int, 8077);
                  return stackIn_28_0;
                }
                lc.field_g = lc.field_g + 1;
              } else {
                if (aj.field_b < bb.b(param0 ^ -2)) {
                  stackIn_24_0 = bd.a(-2, param0 + 8076);
                  return stackIn_24_0;
                }
              }
            }
            if (lc.field_g != 4) {
              stackIn_34_0 = -1;
              return stackIn_34_0;
            }
            ce.field_n.a(oc.field_c, ka.field_d, 20);
            oc.field_c = null;
            tl.field_y = null;
            lc.field_g = 0;
            stackIn_32_0 = 0;
            return stackIn_32_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return bd.a(-3, 8077);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qk() {
        this.field_l = (byte) 0;
        this.field_B = false;
    }

    static {
        field_j = null;
        field_I = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
