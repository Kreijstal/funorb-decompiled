/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static bi[] field_b;
    private int field_i;
    private int[] field_e;
    private int field_g;
    static String field_a;
    private int field_c;
    private int field_f;
    static pf field_d;
    private int[] field_j;
    static String[] field_h;

    final static int b(byte param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          ob var2 = null;
          if (param0 < 15) {
            field_a = (String) null;
          }
          if (vp.field_o.field_a >= 4) {
            if (vp.field_o.field_p == -1) {
              return 3;
            }
            if (vp.field_o.field_p != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (gb.field_i == 0) {
              oj.field_Gb = dh.field_a.a(65535, hn.field_i, rd.field_d);
              gb.field_i = gb.field_i + 1;
            }
            if (gb.field_i == 1) {
              if (2 == oj.field_Gb.field_d) {
                stackIn_14_0 = is.a((byte) -94, -1);
                return stackIn_14_0;
              }
              if (oj.field_Gb.field_d == 1) {
                gb.field_i = gb.field_i + 1;
              }
            }
            if (gb.field_i == 2) {
              js.field_a = new ke((java.net.Socket) (oj.field_Gb.field_e), dh.field_a);
              var2 = new ob(13);
              hq.a(ae.field_h, si.field_u, var2, (byte) 20, sr.field_q);
              var2.c(15, (byte) -69);
              var2.e(11135, sg.field_Cb);
              js.field_a.a(13, 0, var2.field_h, -13976);
              gb.field_i = gb.field_i + 1;
              am.field_Cb = 30000L + pr.a(14274);
            }
            if (gb.field_i == 3) {
              if (js.field_a.a(-1) <= 0) {
                if (am.field_Cb < pr.a(14274)) {
                  stackIn_31_0 = is.a((byte) -94, -2);
                  return stackIn_31_0;
                }
              } else {
                var1_int = js.field_a.a((byte) 127);
                if (0 != var1_int) {
                  stackIn_26_0 = is.a((byte) -94, var1_int);
                  return stackIn_26_0;
                }
                gb.field_i = gb.field_i + 1;
              }
            }
            if (4 != gb.field_i) {
              return -1;
            }
            vp.field_o.a((byte) 90, hq.field_c, js.field_a);
            js.field_a = null;
            gb.field_i = 0;
            oj.field_Gb = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return is.a((byte) -94, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) {
        if (this.field_c == 0) {
          this.c(5);
          this.field_c = 256;
        }
        if (param0 != 13) {
          field_b = (bi[]) null;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_j[fieldTemp$0];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var11 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 75) {
          return;
        }
        int var8 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var9 = -1640531527;
        int var7 = -1640531527;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var7 = var7 + this.field_j[var2Lifetime1 + 4];
          var8 = var8 + this.field_j[5 + var2Lifetime1];
          var3 = var3 + this.field_j[var2Lifetime1];
          var9 = var9 + this.field_j[var2Lifetime1 + 6];
          var6 = var6 + this.field_j[3 + var2Lifetime1];
          var5 = var5 + this.field_j[2 + var2Lifetime1];
          var4 = var4 + this.field_j[var2Lifetime1 + 1];
          var10 = var10 + this.field_j[var2Lifetime1 + 7];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[var2Lifetime1 + 1] = var4;
          this.field_e[var2Lifetime1 + 2] = var5;
          this.field_e[var2Lifetime1 + 3] = var6;
          this.field_e[4 + var2Lifetime1] = var7;
          this.field_e[5 + var2Lifetime1] = var8;
          this.field_e[6 + var2Lifetime1] = var9;
          this.field_e[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_e[var2Lifetime2 + 7];
          var5 = var5 + this.field_e[var2Lifetime2 + 2];
          var4 = var4 + this.field_e[1 + var2Lifetime2];
          var6 = var6 + this.field_e[3 + var2Lifetime2];
          var3 = var3 + this.field_e[var2Lifetime2];
          var9 = var9 + this.field_e[6 + var2Lifetime2];
          var7 = var7 + this.field_e[4 + var2Lifetime2];
          var8 = var8 + this.field_e[5 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[var2Lifetime2 + 1] = var4;
          this.field_e[var2Lifetime2 + 2] = var5;
          this.field_e[3 + var2Lifetime2] = var6;
          this.field_e[4 + var2Lifetime2] = var7;
          this.field_e[var2Lifetime2 + 5] = var8;
          this.field_e[var2Lifetime2 + 6] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.c(5);
        this.field_c = 256;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (gf.field_i <= param1 &&
            param1 < gf.field_l) {
            if (gf.field_a > param2) {
              param0 = param0 + (param2 - gf.field_a);
              param2 = gf.field_a;
            }
            if (gf.field_f < param0 + param2) {
              param0 = -param2 + gf.field_f;
            }
            var6 = param1 + gf.field_b * param2;
            if (param4) {
              field_b = (bi[]) null;
            }
            while (param0 > 0) {
              param1 = gf.field_h[var6];
              var5_int = param3;
              param2 = var5_int + param1;
              var5_int = (var5_int & 16711935) + (param1 & 16711935);
              param1 = (var5_int & 16777472) + (65536 & param2 - var5_int);
              gf.field_h[var6] = ee.a(-(param1 >>> 8) + param1, -param1 + param2);
              var6 = var6 + gf.field_b;
              param0--;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "mh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(int param0) {
        p.field_A = new int[600];
        sd.field_p = 0;
        if (param0 != 1674225316) {
          mh.b((byte) -95);
        }
        np.field_f = new int[600];
    }

    private final void c(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_i = this.field_i + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_e[var2];
          if ((2 & var2) == 0) {
            if (0 == (1 & var2)) {
              this.field_g = this.field_g ^ this.field_g << 13;
            } else {
              this.field_g = this.field_g ^ this.field_g >>> 6;
            }
          } else {
            if (0 == (1 & var2)) {
              this.field_g = this.field_g ^ this.field_g << 2;
            } else {
              this.field_g = this.field_g ^ this.field_g >>> 16;
            }
          }
          this.field_g = this.field_g + this.field_e[255 & var2 + 128];
          dupTemp$1 = this.field_g + (this.field_e[we.a(var3 >> 2, 255)] + this.field_i);
          var4 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_e[we.a(255, var4 >> 8 >> 2)];
          this.field_i = dupTemp$2;
          this.field_j[var2] = dupTemp$2;
        }
        if (param0 != 5) {
          this.a((byte) 6);
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 >= -25) {
          field_h = (String[]) null;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    mh(int[] param0) {
        int var2_int = 0;
        try {
          this.field_e = new int[256];
          this.field_j = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_j[var2_int] = param0[var2_int];
          }
          this.a((byte) 75);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "This entry doesn't match";
        field_d = new pf();
    }
}
