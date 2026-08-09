/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private int field_a;
    private int field_g;
    private int field_e;
    private int[] field_d;
    private int field_f;
    static int field_b;
    private int[] field_c;

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Main.field_T;
          fieldTemp$0 = this.field_f + 1;
          this.field_f = this.field_f + 1;
          this.field_e = this.field_e + fieldTemp$0;
          if (param0 <= -76) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = this.field_c[var2];
              if (0 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  this.field_g = this.field_g ^ this.field_g >>> 1064320486;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g << -1080037299;
                  break L2;
                }
              } else {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_g = this.field_g ^ this.field_g >>> -1056164048;
                  break L2;
                } else {
                  this.field_g = this.field_g ^ this.field_g << 27756322;
                  break L2;
                }
              }
            }
            this.field_g = this.field_g + this.field_c[var2 - -128 & 255];
            dupTemp$1 = this.field_g + (this.field_c[bc.a(var3 >> 1001785282, 255)] + this.field_e);
            var4 = dupTemp$1;
            this.field_c[var2] = dupTemp$1;
            dupTemp$2 = this.field_c[bc.a(var4 >> -296385240 >> -1804145406, 255)] + var3;
            this.field_e = dupTemp$2;
            this.field_d[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var11 = Main.field_T;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        if (param0) {
            CharSequence var12 = (CharSequence) null;
            hg.a((CharSequence) null, (byte) 30);
        }
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        for (var2 = 0; -5 < (var2 ^ -1); var2++) {
            var3 = var3 ^ var4 << 485334923;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1130996610;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 1793033672;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 714375760;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -908194422;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 233456324;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1914839960;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 1725704297;
            var5 = var5 + var10;
            var3 = var3 + var4;
        }
        for (var2 = 0; var2 < 256; var2 += 8) {
            var9 = var9 + this.field_d[var2 + 6];
            var3 = var3 + this.field_d[var2];
            var10 = var10 + this.field_d[7 + var2];
            var7 = var7 + this.field_d[var2 + 4];
            var6 = var6 + this.field_d[3 + var2];
            var8 = var8 + this.field_d[5 + var2];
            var5 = var5 + this.field_d[var2 - -2];
            var4 = var4 + this.field_d[var2 + 1];
            var3 = var3 ^ var4 << 674971627;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -193223934;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1858988056;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1113936880;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1187276470;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -309164604;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -1538162424;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -965987383;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_c[var2] = var3;
            this.field_c[1 + var2] = var4;
            this.field_c[2 + var2] = var5;
            this.field_c[3 + var2] = var6;
            this.field_c[4 + var2] = var7;
            this.field_c[5 + var2] = var8;
            this.field_c[6 + var2] = var9;
            this.field_c[7 + var2] = var10;
        }
        for (var2 = 0; 256 > var2; var2 += 8) {
            var10 = var10 + this.field_c[var2 - -7];
            var3 = var3 + this.field_c[var2];
            var8 = var8 + this.field_c[var2 + 5];
            var7 = var7 + this.field_c[var2 - -4];
            var6 = var6 + this.field_c[3 + var2];
            var5 = var5 + this.field_c[var2 - -2];
            var4 = var4 + this.field_c[var2 + 1];
            var9 = var9 + this.field_c[var2 - -6];
            var3 = var3 ^ var4 << -1610128405;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1683203202;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -437895064;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -364366032;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1258605878;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -290187516;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 43741352;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 2030219529;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_c[var2] = var3;
            this.field_c[var2 + 1] = var4;
            this.field_c[2 + var2] = var5;
            this.field_c[var2 - -3] = var6;
            this.field_c[4 + var2] = var7;
            this.field_c[5 + var2] = var8;
            this.field_c[6 + var2] = var9;
            this.field_c[7 + var2] = var10;
        }
        this.a(-119);
        this.field_a = 256;
    }

    final static lb a(String param0, byte param1) {
        RuntimeException var2 = null;
        lb stackIn_2_0 = null;
        lb stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -43) {
              L1: {
                if (!wh.field_a.a(640)) {
                  break L1;
                } else {
                  if (!param0.equals(wh.field_a.d(640))) {
                    wh.field_a = nk.a(false, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_8_0 = wh.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (lb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("hg.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final int b(int param0) {
        if (!(-1 != (this.field_a ^ -1))) {
            this.a(-80);
            this.field_a = 256;
        }
        if (param0 != -1427) {
            this.a(61);
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_d[fieldTemp$0];
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = eh.a(0, fe.a(param0, 75));
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 99 / ((param1 - 36) / 57);
            stackIn_4_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("hg.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    hg(int[] param0) {
        int var2_int = 0;
        try {
            this.field_c = new int[256];
            this.field_d = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                this.field_d[var2_int] = param0[var2_int];
            }
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
