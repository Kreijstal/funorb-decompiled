/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qea {
    private int field_a;
    private int field_d;
    private int field_f;
    static int[] field_b;
    private int[] field_g;
    private int[] field_e;
    private int field_c;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(sda.a(param0, -1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param1 > -59) {
                qea.a(22);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
            qea.a(46);
        }
        field_b = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ((qea) this).field_c = ((qea) this).field_c + 1;
        ((qea) this).field_a = ((qea) this).field_a + (((qea) this).field_c + 1);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = ((qea) this).field_e[var2];
              if ((2 & var2) == -1) {
                if (-1 != (1 & var2 ^ -1)) {
                  ((qea) this).field_f = ((qea) this).field_f ^ ((qea) this).field_f >>> 1925605574;
                  break L2;
                } else {
                  ((qea) this).field_f = ((qea) this).field_f ^ ((qea) this).field_f << -2063145235;
                  break L2;
                }
              } else {
                if (-1 != (1 & var2)) {
                  ((qea) this).field_f = ((qea) this).field_f ^ ((qea) this).field_f >>> 221914288;
                  break L2;
                } else {
                  ((qea) this).field_f = ((qea) this).field_f ^ ((qea) this).field_f << 1727166658;
                  break L2;
                }
              }
            }
            ((qea) this).field_f = ((qea) this).field_f + ((qea) this).field_e[128 + var2 & 255];
            var4 = ((qea) this).field_a + (((qea) this).field_f + ((qea) this).field_e[sea.c(255, var3 >> 999114050)]);
            ((qea) this).field_e[var2] = ((qea) this).field_a + (((qea) this).field_f + ((qea) this).field_e[sea.c(255, var3 >> 999114050)]);
            ((qea) this).field_a = ((qea) this).field_e[sea.c(var4, 261352) >> -1720722680 >> -1754288350] - -var3;
            ((qea) this).field_g[var2] = ((qea) this).field_e[sea.c(var4, 261352) >> -1720722680 >> -1754288350] - -var3;
            var2++;
            continue L0;
          }
        }
    }

    final int b(int param0) {
        if (param0 < 89) {
            int discarded$0 = ((qea) this).a(89, 120);
        }
        if (((qea) this).field_d == 0) {
            this.c(2);
            ((qea) this).field_d = 256;
        }
        ((qea) this).field_d = ((qea) this).field_d - 1;
        return ((qea) this).field_g[((qea) this).field_d - 1];
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (!(param1 < param0)) {
            throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param0) + 2147483647;
        while (true) {
            var4 = ((qea) this).b(107);
            if (var3 >= var4) {
                break;
            }
        }
        return oea.a(var4, param0, -66);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var5 = -1640531527;
          var3 = -1640531527;
          var6 = -1640531527;
          var4 = -1640531527;
          var8 = -1640531527;
          var9 = -1640531527;
          var7 = -1640531527;
          var10 = -1640531527;
          if (param0) {
            break L0;
          } else {
            ((qea) this).field_a = -40;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.c(2);
                    ((qea) this).field_d = 256;
                    return;
                  } else {
                    var10 = var10 + ((qea) this).field_e[var2 + 7];
                    var4 = var4 + ((qea) this).field_e[var2 + 1];
                    var8 = var8 + ((qea) this).field_e[var2 - -5];
                    var5 = var5 + ((qea) this).field_e[2 + var2];
                    var7 = var7 + ((qea) this).field_e[var2 - -4];
                    var9 = var9 + ((qea) this).field_e[var2 - -6];
                    var3 = var3 + ((qea) this).field_e[var2];
                    var6 = var6 + ((qea) this).field_e[var2 - -3];
                    var3 = var3 ^ var4 << -1887768693;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1242304734;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 223870632;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1367135824;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1278870570;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 507214756;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -322466488;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -550844919;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((qea) this).field_e[var2] = var3;
                    ((qea) this).field_e[var2 + 1] = var4;
                    ((qea) this).field_e[2 + var2] = var5;
                    ((qea) this).field_e[3 + var2] = var6;
                    ((qea) this).field_e[var2 - -4] = var7;
                    ((qea) this).field_e[var2 + 5] = var8;
                    ((qea) this).field_e[var2 - -6] = var9;
                    ((qea) this).field_e[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var3 = var3 + ((qea) this).field_g[var2];
                var9 = var9 + ((qea) this).field_g[var2 - -6];
                var8 = var8 + ((qea) this).field_g[5 + var2];
                var5 = var5 + ((qea) this).field_g[2 + var2];
                var7 = var7 + ((qea) this).field_g[var2 - -4];
                var6 = var6 + ((qea) this).field_g[var2 - -3];
                var4 = var4 + ((qea) this).field_g[1 + var2];
                var10 = var10 + ((qea) this).field_g[var2 + 7];
                var3 = var3 ^ var4 << 1645684427;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 1490459554;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 423267272;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1881860816;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 542859242;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -479240924;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1357971352;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1854619351;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((qea) this).field_e[var2] = var3;
                ((qea) this).field_e[var2 + 1] = var4;
                ((qea) this).field_e[2 + var2] = var5;
                ((qea) this).field_e[var2 + 3] = var6;
                ((qea) this).field_e[var2 - -4] = var7;
                ((qea) this).field_e[5 + var2] = var8;
                ((qea) this).field_e[6 + var2] = var9;
                ((qea) this).field_e[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 396919051;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1950762274;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -878278552;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1689469392;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1673960438;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1630810268;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -416833112;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1083722071;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, fia param2, int param3, String param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, int param11, int param12, long param13) {
        try {
            vc.field_q = new kh(param6);
            ql.field_k = new kh(param7);
            q.field_r = param9 ? true : false;
            be.field_c = param0;
            csa.field_g = param11;
            nn.field_b = param3;
            du.field_h = param13;
            vh.field_g = param12;
            lr.field_c = param1;
            kqa.field_a = param2;
            rsa.field_x = param4;
            if (param8 != -1367135824) {
                return;
            }
            uq.field_a = param5;
            ft.field_a = param10 ? true : false;
            if (!(kqa.field_a.field_x == null)) {
                try {
                    fua.field_b = new ph(kqa.field_a.field_x, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qea(int[] param0) {
        int var2 = 0;
        ((qea) this).field_g = new int[256];
        ((qea) this).field_e = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((qea) this).field_g[var2] = param0[var2];
        }
        this.a(true);
    }

    static {
    }
}
