/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb {
    private int field_b;
    private int field_e;
    private int field_a;
    private int[] field_c;
    private int field_d;
    private int[] field_f;
    static uf field_h;
    static bc field_g;

    final int b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (this.field_b == 0) {
          this.a(4094);
          this.field_b = 256;
          if (param0 != 123) {
            this.field_b = 27;
            fieldTemp$0 = this.field_b - 1;
            this.field_b = this.field_b - 1;
            return this.field_f[fieldTemp$0];
          }
          fieldTemp$1 = this.field_b - 1;
          this.field_b = this.field_b - 1;
          return this.field_f[fieldTemp$1];
        }
        if (param0 == 123) {
          fieldTemp$2 = this.field_b - 1;
          this.field_b = this.field_b - 1;
          return this.field_f[fieldTemp$2];
        }
        this.field_b = 27;
        int fieldTemp$3 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_f[fieldTemp$3];
    }

    final static int a(boolean param0) {
        int var1;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Bounce.field_N;
        var1 = (int)(11.0 * Math.random());
        if (var1 == 10) {
          return 5;
        }
        if (param0) {
          var2 = ne.field_w;
          if (var2 == 0) {
            return 0;
          }
          if (var2 == 1) {
            if (6 >= var1) {
              return 0;
            }
            return 1;
          }
          if (var2 == 2) {
            if (var1 > 3 &&
              7 >= var1) {
              return 1;
            }
            if (7 >= var1) {
              return 0;
            }
            return 2;
          }
          if (var2 == 3) {
            if (var1 > 7) {
              return 1;
            }
            if (var1 == 1) {
              return 2;
            }
            if (2 == var1) {
              return 2;
            }
            if (var1 == 3) {
              return 3;
            }
            if (var1 == 4) {
              return 3;
            }
            if (var1 == 5) {
              return 4;
            }
            if (var1 != 6) {
              return 0;
            }
            return 4;
          }
          if (var2 == 4) {
            return var1 % 2 + 3;
          }
          if (var2 == 5) {
            if (var1 > 2) {
              return 2;
            }
            return 0;
          }
          if (var2 == 6) {
            if (var1 <= 3) {
              return 2;
            }
            return 1;
          }
          if (var2 == 7) {
            return 2;
          }
          if (8 == var2) {
            return (int)(Math.random() * 4.0);
          }
          if (var2 != 9) {
            return 0;
          }
          ne.field_w = 0;
          return 0;
        }
        field_g = (bc) null;
        var2Lifetime1 = ne.field_w;
        if (var2Lifetime1 == 0) {
          return 0;
        }
        if (var2Lifetime1 == 1) {
          if (6 < var1) {
            return 1;
          }
          return 0;
        }
        if (var2Lifetime1 == 2) {
          if (var1 > 3 &&
            7 >= var1) {
            return 1;
          }
          if (7 < var1) {
            return 2;
          }
          return 0;
        }
        if (var2Lifetime1 == 3) {
          if (var1 > 7) {
            return 1;
          }
          if (var1 == 1) {
            return 2;
          }
          if (2 == var1) {
            return 2;
          }
          if (var1 == 3) {
            return 3;
          }
          if (var1 == 4) {
            return 3;
          }
          if (var1 == 5) {
            return 4;
          }
          if (var1 != 6) {
            return 0;
          }
          return 4;
        }
        if (var2Lifetime1 == 4) {
          return var1 % 2 + 3;
        }
        if (var2Lifetime1 == 5) {
          if (var1 > 2) {
            return 2;
          }
          return 0;
        }
        if (var2Lifetime1 == 6) {
          if (var1 > 3) {
            return 1;
          }
          return 2;
        }
        if (var2Lifetime1 == 7) {
          return 2;
        }
        if (8 == var2Lifetime1) {
          return (int)(Math.random() * 4.0);
        }
        if (var2Lifetime1 != 9) {
          return 0;
        }
        ne.field_w = 0;
        return 0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 == -1402584374) {
          l.a(param0, false, param1 + 1402584396);
          return;
        }
        field_g = (bc) null;
        l.a(param0, false, param1 + 1402584396);
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param0 <= jc.field_g.field_h) {
            return true;
          }
          if (dh.field_a == null) {
            return false;
          }
          try {
            var2_int = dh.field_a.d(param1 ^ param1);
            if (0 < var2_int) {
              if (-jc.field_g.field_h + param0 < var2_int) {
                var2_int = -jc.field_g.field_h + param0;
              }
              dh.field_a.a(jc.field_g.field_i, true, var2_int, jc.field_g.field_h);
              qe.field_k = fa.a(-96);
              jc.field_g.field_h = jc.field_g.field_h + var2_int;
              if (jc.field_g.field_h < param0) {
                return false;
              }
              jc.field_g.field_h = 0;
              return true;
            }
            if (var2_int < 0) {
              kc.a((byte) 18);
            } else {
              if (ph.a((byte) -111) <= 30000L) {
                return false;
              }
              kc.a((byte) 18);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            kc.a((byte) 18);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nd.a(param1, 60)) {
            return false;
          }
          if (ab.a(param1, (byte) -12)) {
            return false;
          }
          if (hc.b(param1, 0)) {
            return false;
          }
          if (param0 >= -122) {
            qb.a(-112, 114);
          }
          if (param2.length() == 0) {
            return true;
          }
          if (pf.a(128, param1, param2)) {
            return false;
          }
          if (ee.a(-1, param2, param1)) {
            return false;
          }
          if (!ah.a(param1, param2, (byte) 8)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("qb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Bounce.field_N;
        int fieldTemp$0 = this.field_a + 1;
        this.field_a = this.field_a + 1;
        this.field_e = this.field_e + fieldTemp$0;
        var2 = 0;
        if (param0 == 4094) {
          while (var2 < 256) {
            var3 = this.field_c[var2];
            if ((var2 & 2) != 0) {
              if ((var2 & 1) != 0) {
                this.field_d = this.field_d ^ this.field_d >>> 16;
              } else {
                this.field_d = this.field_d ^ this.field_d << 2;
              }
            } else {
              if ((1 & var2) == 0) {
                this.field_d = this.field_d ^ this.field_d << 13;
              } else {
                this.field_d = this.field_d ^ this.field_d >>> 6;
              }
            }
            this.field_d = this.field_d + this.field_c[255 & var2 + 128];
            dupTemp$3 = this.field_e + this.field_c[da.b(1020, var3) >> 2] + this.field_d;
            var4 = dupTemp$3;
            this.field_c[var2] = dupTemp$3;
            dupTemp$4 = this.field_c[da.b(255, var4 >> 8 >> 2)] + var3;
            this.field_e = dupTemp$4;
            this.field_f[var2] = dupTemp$4;
            var2++;
          }
          return;
        }
        var6 = (String) null;
        qb.a(-56, (String) null, (String) null);
        while (var2 < 256) {
          var3Lifetime1 = this.field_c[var2];
          if ((var2 & 2) != 0) {
            if ((var2 & 1) != 0) {
              this.field_d = this.field_d ^ this.field_d >>> 16;
            } else {
              this.field_d = this.field_d ^ this.field_d << 2;
            }
          } else {
            if ((1 & var2) == 0) {
              this.field_d = this.field_d ^ this.field_d << 13;
            } else {
              this.field_d = this.field_d ^ this.field_d >>> 6;
            }
          }
          this.field_d = this.field_d + this.field_c[255 & var2 + 128];
          dupTemp$1 = this.field_e + this.field_c[da.b(1020, var3Lifetime1) >> 2] + this.field_d;
          var4Lifetime1 = dupTemp$1;
          this.field_c[var2] = dupTemp$1;
          dupTemp$2 = this.field_c[da.b(255, var4Lifetime1 >> 8 >> 2)] + var3Lifetime1;
          this.field_e = dupTemp$2;
          this.field_f[var2] = dupTemp$2;
          var2++;
        }
        return;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 == -30) {
          field_g = null;
          return;
        }
        String var2 = (String) null;
        qb.a(-124, (String) null, (String) null);
        field_g = null;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var11 = Bounce.field_N;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var10 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_f[var2Lifetime1];
          var5 = var5 + this.field_f[var2Lifetime1 + 2];
          var7 = var7 + this.field_f[4 + var2Lifetime1];
          var10 = var10 + this.field_f[var2Lifetime1 + 7];
          var8 = var8 + this.field_f[var2Lifetime1 + 5];
          var4 = var4 + this.field_f[1 + var2Lifetime1];
          var9 = var9 + this.field_f[6 + var2Lifetime1];
          var6 = var6 + this.field_f[3 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
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
          this.field_c[var2Lifetime1] = var3;
          this.field_c[1 + var2Lifetime1] = var4;
          this.field_c[var2Lifetime1 + 2] = var5;
          this.field_c[var2Lifetime1 + 3] = var6;
          this.field_c[var2Lifetime1 + 4] = var7;
          this.field_c[5 + var2Lifetime1] = var8;
          this.field_c[var2Lifetime1 + 6] = var9;
          this.field_c[7 + var2Lifetime1] = var10;
        }
        if (param0) {
          qb.a(false, 81);
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var7 = var7 + this.field_c[4 + var2Lifetime2];
          var6 = var6 + this.field_c[3 + var2Lifetime2];
          var4 = var4 + this.field_c[1 + var2Lifetime2];
          var10 = var10 + this.field_c[7 + var2Lifetime2];
          var5 = var5 + this.field_c[var2Lifetime2 + 2];
          var3 = var3 + this.field_c[var2Lifetime2];
          var9 = var9 + this.field_c[6 + var2Lifetime2];
          var8 = var8 + this.field_c[var2Lifetime2 + 5];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
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
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_c[var2Lifetime2] = var3;
          this.field_c[var2Lifetime2 + 1] = var4;
          this.field_c[var2Lifetime2 + 2] = var5;
          this.field_c[var2Lifetime2 + 3] = var6;
          this.field_c[var2Lifetime2 + 4] = var7;
          this.field_c[var2Lifetime2 + 5] = var8;
          this.field_c[var2Lifetime2 + 6] = var9;
          this.field_c[7 + var2Lifetime2] = var10;
        }
        this.a(4094);
        this.field_b = 256;
    }

    qb(int[] param0) {
        int var2_int = 0;
        try {
          this.field_f = new int[256];
          this.field_c = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_f[var2_int] = param0[var2_int];
          }
          this.b(false);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new uf();
        field_g = new bc();
    }
}
