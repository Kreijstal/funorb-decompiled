/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private int[] field_c;
    static ak field_b;
    private int field_d;
    private int[] field_h;
    private int field_i;
    static boolean field_g;
    static String field_j;
    private int field_f;
    private int field_e;
    static String field_a;

    final static hh a(int param0, fm param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 114) {
              break L0;
            } else {
              field_a = (String) null;
              break L0;
            }
          }
          if (rk.a(param2, false, param1, param0)) {
            return tj.b((byte) -103);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("lh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var12 = Pixelate.field_H ? 1 : 0;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var11 = -48 % ((param0 - 36) / 44);
        int var8 = -1640531527;
        int var10 = -1640531527;
        for (var2 = 0; (var2 ^ -1) > -5; var2++) {
            var3 = var3 ^ var4 << 740219659;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -2086660606;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1822721272;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -436350416;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1509384726;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1141496604;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 1814196936;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 511832073;
            var5 = var5 + var10;
            var3 = var3 + var4;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var3 = var3 + this.field_h[var2];
            var7 = var7 + this.field_h[4 + var2];
            var4 = var4 + this.field_h[var2 - -1];
            var8 = var8 + this.field_h[var2 + 5];
            var10 = var10 + this.field_h[var2 + 7];
            var5 = var5 + this.field_h[2 + var2];
            var6 = var6 + this.field_h[3 + var2];
            var9 = var9 + this.field_h[6 + var2];
            var3 = var3 ^ var4 << -760426997;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1898855906;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -865169976;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 369800400;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -187975830;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 78339940;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1055121144;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1801031639;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_c[var2] = var3;
            this.field_c[var2 - -1] = var4;
            this.field_c[var2 - -2] = var5;
            this.field_c[3 + var2] = var6;
            this.field_c[4 + var2] = var7;
            this.field_c[5 + var2] = var8;
            this.field_c[6 + var2] = var9;
            this.field_c[7 + var2] = var10;
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var3 = var3 + this.field_c[var2];
            var10 = var10 + this.field_c[7 + var2];
            var4 = var4 + this.field_c[var2 + 1];
            var9 = var9 + this.field_c[6 + var2];
            var5 = var5 + this.field_c[var2 - -2];
            var7 = var7 + this.field_c[var2 + 4];
            var6 = var6 + this.field_c[3 + var2];
            var8 = var8 + this.field_c[5 + var2];
            var3 = var3 ^ var4 << -721909685;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1390876766;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -981150264;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 1293273328;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -310902678;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 48077700;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -535351224;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 249680393;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_c[var2] = var3;
            this.field_c[1 + var2] = var4;
            this.field_c[var2 + 2] = var5;
            this.field_c[3 + var2] = var6;
            this.field_c[4 + var2] = var7;
            this.field_c[5 + var2] = var8;
            this.field_c[6 + var2] = var9;
            this.field_c[var2 + 7] = var10;
        }
        this.a(false);
        this.field_e = 256;
    }

    final int a(int param0) {
        if (!(0 != this.field_e)) {
            this.a(false);
            this.field_e = 256;
        }
        if (param0 != 256) {
            this.field_f = -113;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_h[fieldTemp$0];
    }

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          fieldTemp$0 = this.field_d + 1;
          this.field_d = this.field_d + 1;
          this.field_i = this.field_i + fieldTemp$0;
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.field_f = 19;
            break L0;
          }
        }
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = this.field_c[var2];
              if ((2 & var2) == 0) {
                if (0 != (var2 & 1)) {
                  this.field_f = this.field_f ^ this.field_f >>> -2048654522;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f << 2100437549;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  this.field_f = this.field_f ^ this.field_f >>> -58926992;
                  break L2;
                } else {
                  this.field_f = this.field_f ^ this.field_f << -1472161086;
                  break L2;
                }
              }
            }
            this.field_f = this.field_f + this.field_c[255 & var2 + 128];
            dupTemp$1 = this.field_i + this.field_f + this.field_c[cm.a(255, var3 >> 1480786466)];
            var4 = dupTemp$1;
            this.field_c[var2] = dupTemp$1;
            dupTemp$2 = this.field_c[cm.a(255, var4 >> 1153342376 >> -743386238)] + var3;
            this.field_i = dupTemp$2;
            this.field_h[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 7) {
            return;
        }
        field_j = null;
    }

    final static ld a(fm param0, int param1, int param2, fm param3, int param4) {
        RuntimeException var5 = null;
        ld stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rk.a(param4, false, param0, param1)) {
              L1: {
                if (param2 == 48077700) {
                  break L1;
                } else {
                  field_j = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = on.a(param3.a(param1, param4, true), param2 ^ 48077726);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lh.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    lh(int[] param0) {
        int var2_int = 0;
        try {
            this.field_h = new int[256];
            this.field_c = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                this.field_h[var2_int] = param0[var2_int];
            }
            this.b(-60);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Security";
        field_a = "Please try again in a few minutes.";
    }
}
