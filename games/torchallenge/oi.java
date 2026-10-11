/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends of {
    static boolean field_g;
    static int field_j;
    private java.nio.ByteBuffer field_i;
    static String field_h;

    final byte[] c(int param0) {
        byte[] var3 = new byte[this.field_i.capacity()];
        byte[] var2 = var3;
        if (param0 != 2) {
          this.c(-92);
        }
        this.field_i.position(0);
        this.field_i.get(var3);
        return var3;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int var15 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!gh.field_x) {
            pi.field_d[vj.field_c][ea.field_e] = p.a(pi.field_d[vj.field_c][ea.field_e], vi.field_a);
          }
          if (!gh.field_x &&
            !param0) {
            k.field_b[vj.field_c] = p.a(k.field_b[vj.field_c], 1 << ea.field_e);
            qi.a(false);
          }
          if (gh.field_x &&
            !param0) {
            hk.field_c[vj.field_c] = p.a(hk.field_c[vj.field_c], 1 << -6 + ea.field_e);
            qi.a(false);
          }
          var3_int = 28;
          if (null == hf.field_d ||
            !(var3_int <= hf.field_d.length)) {
            hf.field_d = null;
            hf.field_d = new byte[var3_int];
          }
          var4 = vj.field_c;
          var5 = 8 * var4;
          var6 = 0;
          if (!param1) {
            oi.a((byte) -108, 92);
          }
          var7 = 0;
          for (var10 = 0; 4 > var10; var10++) {
            L30: {
              var8 = 0;
              var9 = 0;
              if (var10 == 0) {
                var9 = 255;
              } else {
                switch (var10) {
                  case 2:
                    var9 = 16711680;
                    break;
                  default:
                    var8 = var8 | hf.field_d[var5 + var10];
                    var6 = var6 | (255 & var8) << 8 * var10 & var9;
                    break L30;
                  case 3:
                    var9 = -16777216;
                    break;
                  case 1:
                    var9 = 65280;
                    break;
                }
              }
              var8 = var8 | hf.field_d[var5 + var10];
              var6 = var6 | (255 & var8) << 8 * var10 & var9;
            }
          }
          for (var10 = 0; var10 < 4; var10++) {
            var8 = 0;
            var9 = 0;
            var8 = var8 | hf.field_d[var10 + var5 + 4];
            if (0 == var10) {
              var9 = 255;
            } else {
              if (var10 != 1) {
                if (var10 == 2) {
                  var9 = 16711680;
                } else {
                  if (var10 == 3) {
                    var9 = -16777216;
                  }
                }
              } else {
                var9 = 65280;
              }
            }
            var7 = var7 | (255 & var8) << var10 * 8 & var9;
          }
          var11 = 0;
          var13 = ea.field_e - 6;
          if (!gh.field_x) {
            for (var14 = 0; wl.field_l[ea.field_e] > var14; var14++) {
              var12 = pi.field_d[var4][ea.field_e];
              if (ra.field_p[ea.field_e][var14] < 0) {
                var12 = var12 >> -ra.field_p[ea.field_e][var14];
              } else {
                var12 = var12 << ra.field_p[ea.field_e][var14];
              }
              var12 = al.field_A[ea.field_e][var14] & var12;
              var10 = (0 != lc.field_p[ea.field_e][var14]) ? var7 : var6;
              var10 = var10 & al.field_A[ea.field_e][var14];
              if ((var12 ^ var10) != 0) {
                var11 = 1;
              }
              if (var11 != 0) {
                var5 = var4 * 8 + 4 * lc.field_p[ea.field_e][var14];
                hf.field_d[var5 + 0] = (byte)p.a((int) hf.field_d[var5 + 0], jh.a(var12, 255));
                hf.field_d[var5 + 1] = (byte)p.a((int) hf.field_d[var5 + 1], jh.a(jh.a(65280, var12) >> 8, 255));
                hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(16741916, jh.a(16711680, var12)) >> 16);
                hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(255, jh.a(var12 >> 24, -1)));
              }
              var11 = 0;
            }
            if (!param0) {
              var11 = 0;
              var12 = k.field_b[var4];
              if (uk.field_U[ea.field_e] >= 0) {
                var12 = var12 << uk.field_U[ea.field_e];
              } else {
                var12 = var12 >> -uk.field_U[ea.field_e];
              }
              var10 = (b.field_N[ea.field_e] == 0) ? var6 : var7;
              var12 = var12 & nd.field_h[ea.field_e];
              var10 = var10 & nd.field_h[ea.field_e];
              if (0 != (var12 ^ var10)) {
                var11 = 1;
              }
              if ((ea.field_e + 1) % 2 == 0) {
                var11 = 0;
              }
              if (var11 != 0) {
                var5 = 8 * var4 + b.field_N[ea.field_e] * 4;
                hf.field_d[0 + var5] = (byte)p.a((int) hf.field_d[0 + var5], jh.a(var12, 255));
                hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(255, jh.a(65280, var12) >> 8));
                hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(16711680, var12), 16759179) >> 16);
                hf.field_d[var5 + 3] = (byte)p.a((int) hf.field_d[var5 + 3], jh.a(255, jh.a(-16777216, var12) >> 24));
              }
              var11 = 0;
            }
          }
          if (gh.field_x &&
            !param0) {
            var12 = hk.field_c[var4];
            var11 = 0;
            if (gb.field_c[var13] >= 0) {
              var12 = var12 << gb.field_c[var13];
            } else {
              var12 = var12 >> -gb.field_c[var13];
            }
            var10 = (pd.field_f[var13] == 0) ? var6 : var7;
            var12 = var12 & rf.field_jb[var13];
            var10 = var10 & rf.field_jb[var13];
            if (0 != (var12 ^ var10)) {
              var11 = 1;
            }
            if (var11 != 0) {
              var5 = pd.field_f[var13] * 4 + 8 * var4;
              hf.field_d[var5 + 0] = (byte)p.a((int) hf.field_d[var5 + 0], jh.a(255, var12));
              hf.field_d[var5 + 1] = (byte)p.a((int) hf.field_d[var5 + 1], jh.a(jh.a(var12, 65280), 65479) >> 8);
              hf.field_d[var5 + 2] = (byte)p.a((int) hf.field_d[var5 + 2], jh.a(16744105, jh.a(16711680, var12)) >> 16);
              hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(jh.a(-16777216, var12) >> 24, 255));
            }
            var11 = 0;
          }
          var11 = 0;
          var5 = 24;
          var6 = hf.field_d[var5] + ((hf.field_d[var5 + 1] << 8) + ((hf.field_d[var5 + 2] << 16) + (hf.field_d[3 + var5] << 24)));
          if (!gh.field_x) {
            var12 = hd.field_c[var4];
            if (bj.field_a[var4] < 0) {
              var12 = var12 >> -bj.field_a[var4];
            } else {
              var12 = var12 << bj.field_a[var4];
            }
            var10 = var6;
            var12 = oe.field_b[var4] & var12;
            var10 = oe.field_b[var4] & var10;
            if ((var12 ^ var10) != 0) {
              var11 = 1;
            }
            if (var11 != 0) {
              var5 = 4 * oe.field_a[var4] + 24;
              hf.field_d[0 + var5] = (byte)p.a((int) hf.field_d[0 + var5], jh.a(var12, 255));
              hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(65506, jh.a(65280, var12)) >> 8);
              hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(var12 >> 16, 255), 255));
              hf.field_d[var5 + 3] = (byte)p.a((int) hf.field_d[var5 + 3], jh.a(255, jh.a(-16777216, var12) >> 24));
            }
            var11 = 0;
          }
          if (param2 &&
            !bh.field_p &&
            !d.p(-113)) {
            wj.field_b.a(new eh(hf.field_d), -50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "oi.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          oi.a(true, true, true);
        }
        qa.field_f = param1;
        ai.field_d = param0;
        lg.field_f = param3;
    }

    final static int a(byte param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][][] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = ra.field_j[0];
          if (param1 == var2_int) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var3 = pa.field_v;
          var4 = -1;
          var4Lifetime1 = 0;
          if (param0 >= -31) {
            oi.a((byte) 8, -19);
          }
          while (var4Lifetime1 <= 2) {
            var7 = var3[var4Lifetime1][0][3];
            var6 = var3[var4Lifetime1][0][2];
            for (var5 = var6; var5 <= var7; var5++) {
              if (~param1 == ~var5) {
                stackIn_13_0 = var4Lifetime1;
                return stackIn_13_0;
              }
            }
            var4Lifetime1++;
          }
          stackIn_17_0 = -1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "oi.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte[] param1) {
        try {
          this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_i.position(0);
          this.field_i.put(param1);
          if (param0 != 50) {
            oi.d(-112);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "oi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 10166) {
          field_g = true;
        }
    }

    oi() {
    }

    static {
        field_h = "Score: ";
        field_g = false;
    }
}
