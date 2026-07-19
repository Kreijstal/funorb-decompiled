/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na {
    private int field_f;
    static pb field_e;
    static int field_a;
    static ij field_j;
    private int field_c;
    private int field_b;
    private int field_i;
    private int[] field_h;
    static ei field_d;
    private int[] field_g;

    final static void a(int param0, int param1, int param2, pb[] param3) {
        pf discarded$0 = null;
        try {
            eh.field_a = new qc(param3);
            sa.field_h = param2;
            if (param1 != 256) {
                discarded$0 = na.a(67, 84, 117, false, true, true);
            }
            ka.field_q = param0;
            tf.a(0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "na.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = stellarshard.field_B;
          fieldTemp$3 = this.field_c + 1;
          this.field_c = this.field_c + 1;
          this.field_i = this.field_i + fieldTemp$3;
          var2 = 0;
          if (param0 >= 113) {
            break L0;
          } else {
            this.d(20);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = this.field_g[var2];
              if (0 != (2 & var2)) {
                if (-1 == (var2 & 1 ^ -1)) {
                  this.field_f = this.field_f ^ this.field_f << -1564717726;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f >>> 442674960;
                  break L2;
                }
              } else {
                if (0 == (1 & var2)) {
                  this.field_f = this.field_f ^ this.field_f << 101641421;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f >>> -1451562234;
                  break L2;
                }
              }
            }
            this.field_f = this.field_f + this.field_g[128 + var2 & 255];
            dupTemp$4 = this.field_f + this.field_g[sa.a(var3 >> 937937890, 255)] + this.field_i;
            var4 = dupTemp$4;
            this.field_g[var2] = dupTemp$4;
            dupTemp$5 = var3 + this.field_g[sa.a(1020, var4 >> 415082504) >> -1184775454];
            this.field_i = dupTemp$5;
            this.field_h[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = stellarshard.field_B;
          var4 = -1640531527;
          var10 = -1640531527;
          var3 = -1640531527;
          var5 = -1640531527;
          var9 = -1640531527;
          var8 = -1640531527;
          if (param0 == 1301311304) {
            break L0;
          } else {
            field_a = -6;
            break L0;
          }
        }
        var6 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L2: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 256) {
                    this.d(116);
                    this.field_b = 256;
                    return;
                  } else {
                    var7 = var7 + this.field_g[4 + var2];
                    var10 = var10 + this.field_g[var2 + 7];
                    var4 = var4 + this.field_g[var2 + 1];
                    var8 = var8 + this.field_g[5 + var2];
                    var3 = var3 + this.field_g[var2];
                    var9 = var9 + this.field_g[var2 + 6];
                    var5 = var5 + this.field_g[var2 + 2];
                    var6 = var6 + this.field_g[3 + var2];
                    var3 = var3 ^ var4 << -525578229;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1569970690;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 265629384;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1979210352;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -174994422;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1700292252;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1301311304;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 1164307913;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_g[var2] = var3;
                    this.field_g[1 + var2] = var4;
                    this.field_g[2 + var2] = var5;
                    this.field_g[3 + var2] = var6;
                    this.field_g[var2 - -4] = var7;
                    this.field_g[5 + var2] = var8;
                    this.field_g[6 + var2] = var9;
                    this.field_g[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var4 = var4 + this.field_h[var2 - -1];
                var7 = var7 + this.field_h[var2 + 4];
                var10 = var10 + this.field_h[var2 + 7];
                var8 = var8 + this.field_h[5 + var2];
                var6 = var6 + this.field_h[var2 - -3];
                var9 = var9 + this.field_h[6 + var2];
                var5 = var5 + this.field_h[2 + var2];
                var3 = var3 + this.field_h[var2];
                var3 = var3 ^ var4 << -228956501;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -609265118;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1934787544;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1479679568;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -24668310;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> 111720900;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1927956344;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -2007241687;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_g[var2] = var3;
                this.field_g[1 + var2] = var4;
                this.field_g[var2 + 2] = var5;
                this.field_g[3 + var2] = var6;
                this.field_g[4 + var2] = var7;
                this.field_g[var2 + 5] = var8;
                this.field_g[6 + var2] = var9;
                this.field_g[var2 + 7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 687389163;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1940095134;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -609392408;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 1151468944;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 249775722;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 1177742628;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -933280216;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -284536311;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    final static pf a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            wc var8 = null;
            pf stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            pf stackOut_15_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null != fa.field_p.field_f) {
                    ma.field_s = new pc(fa.field_p.field_f, 5200, 0);
                    fa.field_p.field_f = null;
                    var6 = new gi(255, ma.field_s, new pc(fa.field_p.field_d, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (null == ma.field_s) {
                    break L2;
                  } else {
                    L3: {
                      if (df.field_d != null) {
                        break L3;
                      } else {
                        df.field_d = new pc[fa.field_p.field_l.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (null == df.field_d[param2]) {
                        df.field_d[param2] = new pc(fa.field_p.field_l[param2], 12000, 0);
                        fa.field_p.field_l[param2] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = new gi(param2, ma.field_s, df.field_d[param2], 2097152);
                    break L2;
                  }
                }
                L5: {
                  if (param1 == 255) {
                    break L5;
                  } else {
                    field_e = (pb) null;
                    break L5;
                  }
                }
                L6: {
                  var8 = mc.field_c.a(64, (gi) (var7), (gi) (var6), param4, param2);
                  if (param3) {
                    var8.d(2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                stackOut_15_0 = new pf(var8, param5, param0);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        if (param0 != -609392408) {
            this.c(22);
        }
        if (this.field_b == 0) {
            this.d(120);
            this.field_b = 256;
        }
        int fieldTemp$0 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_h[fieldTemp$0];
    }

    public static void b(int param0) {
        field_j = null;
        field_d = null;
        field_e = null;
        int var1 = -42 / ((61 - param0) / 60);
    }

    na(int[] param0) {
        int var2_int = 0;
        try {
            this.field_g = new int[256];
            this.field_h = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_h[var2_int] = param0[var2_int];
            }
            this.c(1301311304);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
