/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static int field_b;
    private int field_a;
    static String field_m;
    static String[] field_f;
    static int field_j;
    private int[] field_e;
    private int[] field_l;
    private int field_c;
    static byte[][][] field_h;
    static int[] field_i;
    private int field_g;
    private int field_k;

    final static void a(boolean param0, String param1, String param2) {
        try {
            af.a(param2, param0, param1, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          fieldTemp$0 = this.field_a + 1;
          this.field_a = this.field_a + 1;
          this.field_k = this.field_k + fieldTemp$0;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_e = (int[]) null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L2: {
              var3 = this.field_l[var2];
              if ((2 & var2) == 0) {
                if (0 != (1 & var2)) {
                  this.field_g = this.field_g ^ this.field_g >>> -341989914;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g << -1837300083;
                  break L2;
                }
              } else {
                if (0 != (var2 & 1)) {
                  this.field_g = this.field_g ^ this.field_g >>> -532527344;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g << -1391240510;
                  break L2;
                }
              }
            }
            this.field_g = this.field_g + this.field_l[255 & var2 + 128];
            dupTemp$1 = this.field_k + (this.field_l[sc.a(var3 >> 1698005762, 255)] + this.field_g);
            var4 = dupTemp$1;
            this.field_l[var2] = dupTemp$1;
            dupTemp$2 = this.field_l[sc.a(var4 >> 1267318600 >> -587620766, 255)] + var3;
            this.field_k = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var11 = fleas.field_A ? 1 : 0;
        int var4 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var9 = -1640531527;
        int var6 = -1640531527;
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        for (var2 = 0; -5 < (var2 ^ -1); var2++) {
            var3 = var3 ^ var4 << -2015297717;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 668902946;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -436004888;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 13382000;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1448364374;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -834576252;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 407289352;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1797963831;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var10 = var10 + this.field_e[var2 - -7];
            var3 = var3 + this.field_e[var2];
            var5 = var5 + this.field_e[var2 - -2];
            var9 = var9 + this.field_e[var2 + 6];
            var8 = var8 + this.field_e[var2 + 5];
            var6 = var6 + this.field_e[3 + var2];
            var7 = var7 + this.field_e[var2 - -4];
            var4 = var4 + this.field_e[var2 + 1];
            var3 = var3 ^ var4 << 752481515;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1252690018;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 378258120;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 995108848;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 1868451370;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -124228988;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1914765640;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1948714423;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_l[var2] = var3;
            this.field_l[var2 + 1] = var4;
            this.field_l[2 + var2] = var5;
            this.field_l[var2 - -3] = var6;
            this.field_l[4 + var2] = var7;
            this.field_l[5 + var2] = var8;
            this.field_l[6 + var2] = var9;
            this.field_l[var2 - -7] = var10;
        }
        for (var2 = 0; 256 > var2; var2 += 8) {
            var10 = var10 + this.field_l[7 + var2];
            var6 = var6 + this.field_l[var2 - -3];
            var9 = var9 + this.field_l[var2 + 6];
            var8 = var8 + this.field_l[5 + var2];
            var4 = var4 + this.field_l[1 + var2];
            var3 = var3 + this.field_l[var2];
            var5 = var5 + this.field_l[var2 + 2];
            var7 = var7 + this.field_l[var2 + 4];
            var3 = var3 ^ var4 << -1800222357;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -1119398814;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -2078926168;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -471242704;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -272567606;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -1705790300;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1200075448;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1831714679;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_l[var2] = var3;
            this.field_l[1 + var2] = var4;
            this.field_l[var2 - -2] = var5;
            this.field_l[3 + var2] = var6;
            this.field_l[var2 + 4] = var7;
            this.field_l[var2 - -5] = var8;
            this.field_l[6 + var2] = var9;
            this.field_l[7 + var2] = var10;
        }
        this.b(2);
        this.field_c = 256;
        if (param0 != -125) {
            this.a(-54);
        }
    }

    final static boolean a(boolean param0) {
        String var2;
        int stackIn_9_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            var2 = (String) null;
            pc.a(false, (String) null, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (wi.field_b != 0) {
              break L2;
            } else {
              if (-1 != (fleas.field_L ^ -1)) {
                break L2;
              } else {
                if (hj.field_a[1] != 0) {
                  break L2;
                } else {
                  if (-1 == (hj.field_a[0] ^ -1)) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void c(int param0) {
        field_d = null;
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = (byte[][][]) null;
        int var1 = -53 / ((-72 - param0) / 43);
    }

    final int a(int param0) {
        if (param0 != 995108848) {
            field_m = (String) null;
        }
        if (this.field_c == 0) {
            this.b(2);
            this.field_c = 256;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_e[fieldTemp$0];
    }

    pc(int[] param0) {
        int var2_int = 0;
        try {
            this.field_e = new int[256];
            this.field_l = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_e[var2_int] = param0[var2_int];
            }
            this.a((byte) -125);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Create a free account to store your progress.";
        field_i = new int[8192];
        field_d = "Achievements";
    }
}
