/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends ud {
    static byte[][] field_p;
    private short[] field_k;
    int field_s;
    private short[] field_l;
    private int field_m;
    int field_j;
    int field_h;
    static int[] field_o;
    static HighscoreQuery activeHighscoreQuery;
    int field_q;
    boolean field_n;
    private byte[] field_i;

    public static void a(byte param0) {
        activeHighscoreQuery = null;
        field_p = (byte[][]) null;
        if (param0 >= -11) {
          field_o = (int[]) null;
        }
        field_o = null;
    }

    final void a(boolean param0, int[] param1, int param2) {
        String stackIn_48_2 = null;
        int var4_intLifetime2;
        int var6Lifetime2;
        int var10Lifetime2;
        int var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          int var5 = mo.field_c[param2] * this.field_h;
          if (this.field_s == 1) {
            int var9 = this.field_k[0];
            int var8 = this.field_l[0] << 12;
            int var11 = var5 * var8 >> 12;
            int var13 = var8 * this.field_h >> 12;
            int var12 = var8 * this.field_q >> 12;
            int var15 = var11 >> 12;
            int var16 = var15 + 1;
            var11 = var11 & 4095;
            if (var13 <= var16) {
              var16 = 0;
            }
            int var18 = 255 & this.field_i[var16 & 255];
            int var14 = ua.field_h[var11];
            int var17 = this.field_i[var15 & 255] & 255;
            if (!this.field_n) {
              for (int var10 = 0; ms.field_d > var10; var10++) {
                int var4_int = this.field_q * NetworkGameClient.field_v[var10];
                int var6 = this.a(false, var4_int * var8 >> 12, var17, var18, var11, var14, var12);
                param1[var10] = var6 * var9 >> 12;
              }
              return;
            }
            for (int var10Lifetime3 = 0; var10Lifetime3 < ms.field_d; var10Lifetime3++) {
              int var4_intLifetime3 = this.field_q * NetworkGameClient.field_v[var10Lifetime3];
              int var6Lifetime3 = this.a(false, var4_intLifetime3 * var8 >> 12, var17, var18, var11, var14, var12);
              var6Lifetime3 = var6Lifetime3 * var9 >> 12;
              param1[var10Lifetime3] = 2048 + (var6Lifetime3 >> 1);
            }
            return;
          }
          int var9Lifetime1 = this.field_k[0];
          if (var9Lifetime1 > 8 ||
            var9Lifetime1 < -8) {
            int var8Lifetime1 = this.field_l[0] << 12;
            int var13Lifetime1 = this.field_h * var8Lifetime1 >> 12;
            int var11Lifetime1 = var5 * var8Lifetime1 >> 12;
            int var12Lifetime1 = var8Lifetime1 * this.field_q >> 12;
            int var15Lifetime1 = var11Lifetime1 >> 12;
            int var16Lifetime1 = 1 + var15Lifetime1;
            var11Lifetime1 = var11Lifetime1 & 4095;
            if (var16Lifetime1 >= var13Lifetime1) {
              var16Lifetime1 = 0;
            }
            int var17Lifetime1 = this.field_i[var15Lifetime1 & 255] & 255;
            int var18Lifetime1 = 255 & this.field_i[255 & var16Lifetime1];
            int var14Lifetime1 = ua.field_h[var11Lifetime1];
            for (int var10Lifetime1 = 0; var10Lifetime1 < ms.field_d; var10Lifetime1++) {
              int var4_intLifetime1 = this.field_q * NetworkGameClient.field_v[var10Lifetime1];
              int var6Lifetime1 = this.a(false, var4_intLifetime1 * var8Lifetime1 >> 12, var17Lifetime1, var18Lifetime1, var11Lifetime1, var14Lifetime1, var12Lifetime1);
              param1[var10Lifetime1] = var6Lifetime1 * var9Lifetime1 >> 12;
            }
          }
          for (int var7 = 1; this.field_s > var7; var7++) {
            int var9Lifetime2 = this.field_k[var7];
            if (8 < var9Lifetime2 ||
              var9Lifetime2 < -8) {
              int var8Lifetime2 = this.field_l[var7] << 12;
              int var11Lifetime2 = var5 * var8Lifetime2 >> 12;
              int var12Lifetime2 = this.field_q * var8Lifetime2 >> 12;
              int var13Lifetime2 = var8Lifetime2 * this.field_h >> 12;
              int var15Lifetime2 = var11Lifetime2 >> 12;
              int var16Lifetime2 = var15Lifetime2 + 1;
              if (var13Lifetime2 <= var16Lifetime2) {
                var16Lifetime2 = 0;
              }
              var11Lifetime2 = var11Lifetime2 & 4095;
              int var17Lifetime2 = this.field_i[255 & var15Lifetime2] & 255;
              int var18Lifetime2 = this.field_i[var16Lifetime2 & 255] & 255;
              int var14Lifetime2 = ua.field_h[var11Lifetime2];
              if (this.field_n &&
                var7 == -1 + this.field_s) {
                for (var10Lifetime2 = 0; var10Lifetime2 < ms.field_d; var10Lifetime2++) {
                  var4_intLifetime2 = NetworkGameClient.field_v[var10Lifetime2] * this.field_q;
                  boolean stackIn_27_1 = !(param0);
                  var6Lifetime2 = this.a(stackIn_27_1, var8Lifetime2 * var4_intLifetime2 >> 12, var17Lifetime2, var18Lifetime2, var11Lifetime2, var14Lifetime2, var12Lifetime2);
                  var6Lifetime2 = param1[var10Lifetime2] + (var6Lifetime2 * var9Lifetime2 >> 12);
                  param1[var10Lifetime2] = 2048 + (var6Lifetime2 >> 1);
                }
              } else {
                for (var10Lifetime2 = 0; ms.field_d > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = this.field_q * NetworkGameClient.field_v[var10Lifetime2];
                  boolean stackIn_33_1 = !(param0);
                  var6Lifetime2 = this.a(stackIn_33_1, var4_intLifetime2 * var8Lifetime2 >> 12, var17Lifetime2, var18Lifetime2, var11Lifetime2, var14Lifetime2, var12Lifetime2);
                  param1[var10Lifetime2] = param1[var10Lifetime2] + (var9Lifetime2 * var6Lifetime2 >> 12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_47_0 = var4;
          StringBuilder stackIn_47_1 = new StringBuilder().append("ql.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_i = ro.b(-3992, this.field_m);
        this.a(98);
        if (param0 != 1) {
          this.field_i = (byte[]) null;
        }
        for (int var2 = this.field_s - 1; var2 >= 1; var2--) {
          int var3 = this.field_k[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.field_s = this.field_s - 1;
            continue;
          }
          break;
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 > -72) {
          field_p = (byte[][]) null;
        }
        if (0 >= qr.field_a) {
          var2 = (!cn.b(true)) ? 1 : 0;
        } else {
          if (aj.field_s != null) {
            jf.field_a = aj.field_s.b((byte) -111);
            te.a(2, 64);
          } else {
            jf.field_a = uj.a(pt.field_b, 0, 640, 0, 0, 480);
          }
          if (jf.field_a != null) {
            cd.a(jf.field_a, 74);
            var2 = 2;
          } else {
            var2 = 3;
          }
        }
        if (null == aj.field_s &&
          ta.field_h) {
          MenuScreen.a((byte) -119, var2, param1);
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int var8;
        int var9;
        int var8Lifetime1;
        int var9Lifetime1;
        int var18 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0) {
          ql.a(40, -122, 38, 74);
        }
        int var13 = param1 >> 12;
        int var12 = var13 + 1;
        if (var12 >= param6) {
          var12 = 0;
        }
        param1 = param1 & 4095;
        var13 = var13 & 255;
        int var11 = param1 - 4096;
        var12 = var12 & 255;
        int var10 = -4096 + param4;
        int var15 = ua.field_h[param1];
        int var14 = this.field_i[var13 + param2] & 3;
        if (var14 <= 1) {
          if (var14 != 0) {
            stackIn_13_0 = param4 - param1;
          } else {
            stackIn_13_0 = param4 + param1;
          }
          var8 = stackIn_13_0;
        } else {
          if (var14 == 2) {
            stackIn_9_0 = param1 - param4;
          } else {
            stackIn_9_0 = -param1 - param4;
          }
          var8 = stackIn_9_0;
        }
        int var14Lifetime1 = 3 & this.field_i[var12 + param2];
        if (var14Lifetime1 > 1) {
          if (var14Lifetime1 != 2) {
            stackIn_22_0 = -param4 - var11;
          } else {
            stackIn_22_0 = -param4 + var11;
          }
          var9 = stackIn_22_0;
        } else {
          if (var14Lifetime1 == 0) {
            stackIn_18_0 = var11 + param4;
          } else {
            stackIn_18_0 = param4 - var11;
          }
          var9 = stackIn_18_0;
        }
        int var16 = var8 + (var15 * (-var8 + var9) >> 12);
        int var14Lifetime2 = this.field_i[param3 + var13] & 3;
        if (1 >= var14Lifetime2) {
          if (var14Lifetime2 != 0) {
            stackIn_31_0 = var10 - param1;
          } else {
            stackIn_31_0 = var10 + param1;
          }
          var8Lifetime1 = stackIn_31_0;
        } else {
          if (var14Lifetime2 != 2) {
            stackIn_27_0 = -var10 - param1;
          } else {
            stackIn_27_0 = param1 - var10;
          }
          var8Lifetime1 = stackIn_27_0;
        }
        int var14Lifetime3 = this.field_i[param3 + var12] & 3;
        if (var14Lifetime3 > 1) {
          stackIn_40_0 = (2 != var14Lifetime3) ? (-var11 - var10) : (-var10 + var11);
          var9Lifetime1 = stackIn_40_0;
        } else {
          stackIn_36_0 = (var14Lifetime3 == 0) ? (var10 + var11) : (-var11 + var10);
          var9Lifetime1 = stackIn_36_0;
        }
        int var17 = ((-var8Lifetime1 + var9Lifetime1) * var15 >> 12) + var8Lifetime1;
        return var16 + (param5 * (var17 - var16) >> 12);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        so.field_b = param2;
        if (param1 != 2048) {
          return;
        }
        SpriteState.field_t = param0;
        hn.field_a = param3;
    }

    ql() {
        super(0, true);
        this.field_m = 0;
        this.field_s = 4;
        this.field_q = 4;
        this.field_j = 1638;
        this.field_h = 4;
        this.field_i = new byte[512];
        this.field_n = true;
    }

    private final void a(int param0) {
        int var2;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 < 23) {
          ql.a((byte) 58);
        }
        if (this.field_j > 0) {
          this.field_l = new short[this.field_s];
          this.field_k = new short[this.field_s];
          for (var2 = 0; var2 < this.field_s; var2++) {
            this.field_k[var2] = (short)(int)(4096.0 * Math.pow((double)((float)this.field_j / 4096.0f), (double)var2));
            this.field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else if (this.field_k != null &&
          this.field_s == this.field_k.length) {
          this.field_l = new short[this.field_s];
          for (var2 = 0; this.field_s > var2; var2++) {
            this.field_l[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        }
    }

    static {
        field_o = new int[8192];
        activeHighscoreQuery = null;
    }
}
