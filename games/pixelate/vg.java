/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class vg {
    private int field_h;
    private int field_d;
    private lm[] field_a;
    static String field_e;
    private lm field_g;
    private lm field_c;
    private long field_b;
    static String field_f;

    final lm b(byte param0) {
        lm var2;
        lm var3;
        int var4;
        lm var3Lifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        if (this.field_g == null) {
          return null;
        }
        var2 = this.field_a[(int)((long)(-1 + this.field_h) & this.field_b)];
        if (param0 == 47) {
          while (true) {
            if (this.field_g == var2) {
              this.field_g = null;
              return null;
            }
            if (this.field_g.field_q != this.field_b) {
              this.field_g = this.field_g.field_p;
              continue;
            }
            break;
          }
          var3 = this.field_g;
          this.field_g = this.field_g.field_p;
          return var3;
        }
        this.a((byte) -113);
        while (true) {
          if (this.field_g == var2) {
            this.field_g = null;
            return null;
          }
          if (this.field_g.field_q != this.field_b) {
            this.field_g = this.field_g.field_p;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_g;
        this.field_g = this.field_g.field_p;
        return var3Lifetime1;
    }

    final void a(boolean param0, lm param1, long param2) {
        lm var5 = null;
        try {
          if (param1.field_r != null) {
            param1.e(17);
          }
          var5 = this.field_a[(int)((long)(this.field_h - 1) & param2)];
          param1.field_r = var5.field_r;
          param1.field_p = var5;
          param1.field_r.field_p = param1;
          if (param0) {
            vg.b(-98, -4);
          }
          param1.field_p.field_r = param1;
          param1.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(long param0, byte param1) {
        if (param1 != 23) {
          return;
        }
        if (param0 <= 0L) {
          return;
        }
        if (0L != param0 % 10L) {
          ma.a((byte) 37, param0);
        } else {
          ma.a((byte) 37, -1L + param0);
          ma.a((byte) 37, 1L);
          return;
        }
    }

    final static ib a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        if (param0 < 84) {
          return (ib) null;
        }
        if (param1 < 10) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = ue.a(param1, (byte) 118);
        }
        var2 = stackIn_5_0;
        if (var2 == 0) {
          if (ok.a(tg.field_f, -128, 2) != 1) {
            return new ib(4, 3);
          }
          return new ib(3, 4);
        }
        if (var2 != 1) {
          if (2 == var2) {
            if (ok.a(tg.field_f, -103, 2) == 1) {
              return new ib(4, 5);
            }
            return new ib(5, 4);
          }
          if (3 != var2) {
            return new ib(4, 4);
          }
          return new ib(5, 5);
        }
        var3 = ok.a(tg.field_f, -121, 3);
        if (var3 == 0) {
          return new ib(3, 5);
        }
        if (var3 == 1) {
          return new ib(4, 4);
        }
        if (var3 == 2) {
          return new ib(5, 3);
        }
        return new ib(4, 4);
    }

    final lm a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        lm var4;
        lm var5;
        lm var29;
        lm var57;
        lm var58;
        lm var59;
        var3 = Pixelate.field_H ? 1 : 0;
        if (0 >= this.field_d) {
          if (param0 == 50) {
            do {
              if (this.field_d >= this.field_h) {
                return null;
              }
              fieldTemp$1 = this.field_d;
              this.field_d = this.field_d + 1;
              var4 = this.field_a[fieldTemp$1].field_p;
              var58 = var4;
            } while (var4 == this.field_a[this.field_d - 1]);
            this.field_c = var58.field_p;
            return var58;
          }
          vg.a(-20, -121);
          do {
            if (this.field_d >= this.field_h) {
              return null;
            }
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_a[fieldTemp$0].field_p;
            var59 = var4;
          } while (var4 == this.field_a[this.field_d - 1]);
          this.field_c = var59.field_p;
          return var59;
        }
        if (this.field_c != this.field_a[this.field_d - 1]) {
          var57 = this.field_c;
          this.field_c = var57.field_p;
          return var57;
        }
        if (param0 == 50) {
          do {
            if (this.field_d >= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_a[fieldTemp$3].field_p;
            var5 = var4;
          } while (var4 == this.field_a[this.field_d - 1]);
          this.field_c = var5.field_p;
          return var5;
        }
        vg.a(-20, -121);
        do {
          if (this.field_d >= this.field_h) {
            return null;
          }
          fieldTemp$2 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_a[fieldTemp$2].field_p;
          var29 = var4;
        } while (var4 == this.field_a[this.field_d - 1]);
        this.field_c = var29.field_p;
        return var29;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 == ~param0) {
          return 0;
        }
        if (param0 < 0) {
          throw new IllegalArgumentException("");
        }
        if (param0 < 32768) {
          if (param0 < 128) {
            if (param0 < 8) {
              if (param0 < 2) {
                return 256;
              }
              var2 = 7;
            } else {
              var2 = (32 > param0) ? 6 : 5;
            }
          } else {
            if (param0 < 2048) {
              var2 = (512 > param0) ? 4 : 3;
            } else {
              var2 = (param0 < 8192) ? 2 : 1;
            }
          }
          param0 = param0 << (var2 << 1);
          return bl.field_a[-32768 + param0] >> var2;
        }
        if (131072 > param0) {
          return bl.field_a[-32768 + param0];
        }
        if (33554432 <= param0) {
          if (param0 >= 536870912) {
            var2Lifetime1 = 7;
          } else {
            var2Lifetime1 = (param0 < 134217728) ? 5 : 6;
          }
        } else {
          if (2097152 <= param0) {
            var2Lifetime1 = (param0 >= 8388608) ? 4 : 3;
          } else {
            var2Lifetime1 = (param0 >= 524288) ? 2 : 1;
          }
        }
        param0 = param0 >> (var2Lifetime1 << 1);
        return bl.field_a[param0 - 32768] << var2Lifetime1;
    }

    final lm a(int param0, long param1) {
        lm var4;
        lm var5;
        int var6;
        lm var4Lifetime1;
        lm var5Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -11434) {
          this.field_b = param1;
          var4 = this.field_a[(int)(param1 & (long)(this.field_h - 1))];
          this.field_g = var4.field_p;
          while (true) {
            if (this.field_g == var4) {
              this.field_g = null;
              return null;
            }
            if (~param1 != ~this.field_g.field_q) {
              this.field_g = this.field_g.field_p;
              continue;
            }
            break;
          }
          var5 = this.field_g;
          this.field_g = this.field_g.field_p;
          return var5;
        }
        this.field_c = (lm) null;
        this.field_b = param1;
        var4Lifetime1 = this.field_a[(int)(param1 & (long)(this.field_h - 1))];
        this.field_g = var4Lifetime1.field_p;
        while (true) {
          if (this.field_g == var4Lifetime1) {
            this.field_g = null;
            return null;
          }
          if (~param1 != ~this.field_g.field_q) {
            this.field_g = this.field_g.field_p;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_g;
        this.field_g = this.field_g.field_p;
        return var5Lifetime1;
    }

    final lm a(int param0) {
        this.field_d = 0;
        if (param0 > -21) {
          this.field_d = -64;
          return this.a((byte) 50);
        }
        return this.a((byte) 50);
    }

    final static void b(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != sh.field_e) {
            if (param0 >= 0) {
              decompiledFrameRemainder0 = (Pixelate.field_G == uk.field_s);
              if ((decompiledFrameRemainder0) && (aa.field_f.field_m == 0 &&
                hm.a(64) > (aj.field_m + 10000L))) {
                aa.field_f.g(param0, 15514);
              }
            } else {
              if (aa.field_f.field_m == 0 &&
                hm.a(64) > (aj.field_m + 10000L)) {
                aa.field_f.g(param0, 15514);
              }
            }
            if (decompiledFrameRemainder0) {
              if (aa.field_f.field_m > 0) {
                try {
                  sh.field_e.a(aa.field_f.field_m, -98, 0, aa.field_f.field_k);
                  aj.field_m = hm.a(64);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  na.a(true);
                }
                aa.field_f.field_m = 0;
              }
              if (param1 == 10000) {
                return;
              }
              vg.a(true);
              return;
            }
          }
          aa.field_f.field_m = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vg(int param0) {
        int var2 = 0;
        lm dupTemp$1 = null;
        lm var3;
        this.field_d = 0;
        this.field_a = new lm[param0];
        this.field_h = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new lm();
          var3 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          var3.field_r = var3;
          var3.field_p = var3;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          vg.a(-87L, (byte) 117);
          field_e = null;
          field_f = null;
          return;
        }
        field_e = null;
        field_f = null;
    }

    static {
        field_e = "<%0> has withdrawn the request to join.";
        field_f = "Join <%0>'s game";
    }
}
