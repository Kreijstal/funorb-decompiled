/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qe {
    int field_j;
    static int field_e;
    int field_m;
    int field_i;
    int field_n;
    double field_l;
    private pb[] field_f;
    int field_h;
    static boolean field_o;
    double field_d;
    int field_c;
    private int field_b;
    double field_k;
    int field_g;
    double field_a;

    final static int a(String param0, boolean param1, boolean param2, String param3, int param4, String param5, int param6) {
        am var7 = null;
        RuntimeException var7_ref = null;
        am var8 = null;
        Throwable var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new am(param0);
          if (!param2) {
            var9 = (Throwable) null;
            qe.a(-90, (String) null, (Throwable) null);
          }
          var8 = new am(param3);
          stackIn_3_0 = gk.a(param4, param1, var7, param5, param6, var8, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("qe.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = ni.field_f[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = ti.field_a[var23 * 640 + var22];
            var25 = 64 + (ni.field_c[var20] * param10 >> 17);
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            ti.field_a[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ni.field_f[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 < 0) {
            var23Lifetime1 = 0;
          }
          var24Lifetime1 = ti.field_a[var23Lifetime1 * 640 + var22Lifetime1];
          var25Lifetime1 = 64 + (ni.field_c[var20Lifetime1] * param10 >> 17);
          if (var25Lifetime1 < 0) {
            var25Lifetime1 = -var25Lifetime1;
          }
          var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
          var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
          var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
          var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
          var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
          var15Lifetime1--;
          ti.field_a[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
        }
    }

    final qe a(int param0) {
        Object stackIn_195_0 = null;
        qe stackIn_195_1 = null;
        double var2_double;
        int var2;
        int var3_int;
        vl var3;
        double var4;
        int var4_int;
        int var6;
        double var6_double;
        double var7;
        double var8;
        vl var9;
        int var10;
        qe var11;
        vl var12;
        vl var13;
        vl var14;
        vl var15;
        vl var16;
        double var2_doubleLifetime1;
        double var2_doubleLifetime2;
        double var2_doubleLifetime3;
        double var2_doubleLifetime4;
        double var2_doubleLifetime5;
        int var2Lifetime1;
        double var4Lifetime1;
        double var4Lifetime2;
        double var4Lifetime3;
        double var4Lifetime4;
        double var4Lifetime5;
        double var4Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        double var6_doubleLifetime1;
        double var2_doubleLifetime6;
        int var2Lifetime2;
        int var3_intLifetime1;
        double var4Lifetime7;
        int var6Lifetime6;
        double var6_doubleLifetime2;
        double var8Lifetime1;
        double var2_doubleLifetime4Lifetime1;
        double var2_doubleLifetime5Lifetime1;
        double var4Lifetime3Lifetime1;
        double var4Lifetime3Lifetime2;
        double var4Lifetime4Lifetime1;
        double var4Lifetime5Lifetime1;
        int var6Lifetime5Lifetime1;
        double var2_doubleLifetime6Lifetime1;
        double var4Lifetime7Lifetime1;
        var10 = stellarshard.field_B;
        this.b((byte) 124);
        if (this.field_m == 11) {
          this.field_k = this.field_k * 0.99;
          this.field_d = this.field_d * 0.99;
        }
        if (this.field_m == -1) {
          ff.field_k = ff.field_k + 16;
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
          }
          if (ff.field_k > 256) {
            ff.field_k = 0;
          }
          if (el.field_I > 0) {
            el.field_I = el.field_I - 1;
          }
          if (0 > this.field_j) {
            this.field_j = this.field_j + 1;
          }
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
          }
          if (this.field_j < 0) {
            this.field_j = this.field_j + 1;
          }
          if (this.field_j > 0) {
            this.field_j = this.field_j - 1;
          }
          if (0 > this.field_j) {
            this.field_j = this.field_j + 1;
          }
          if (nc.field_H != 0) {
          }
          if (3 != nc.field_H) {
          }
          if (0 < this.field_i) {
            this.field_i = this.field_i - 1;
          }
          if (nc.field_H == 1) {
          }
        }
        if (12 == this.field_m &&
          a.field_h[0] != null) {
          this.field_i = this.field_i + 1;
          this.field_j = 0;
          if (this.field_i > 50) {
            var2_double = a.field_h[0].field_a - this.field_a;
            var4 = a.field_h[0].field_l - this.field_l;
            var6 = (int)(Math.atan2(var4, -var2_double) * 128.0 / 3.141592653589793);
            var6 = var6 - this.field_h;
            if (var6 < -128) {
              var6 += 256;
            }
            if (var6 > 128) {
              var6 -= 256;
            }
            this.field_h = this.field_h + var6 / 10;
          } else {
            if (this.field_h > 128) {
              this.field_h = this.field_h - 256;
            }
            this.field_h = this.field_h * 9 / 10;
            if (this.field_h < 0) {
              this.field_h = this.field_h + 256;
            }
          }
          if (this.field_i > 100 &&
            null != a.field_h[0]) {
            var2_doubleLifetime6 = this.field_a - a.field_h[0].field_a;
            var4Lifetime7 = -a.field_h[0].field_l + this.field_l;
            var6Lifetime6 = 128;
            if (var2_doubleLifetime6 != 0.0 ||
              var4Lifetime7 != 0.0) {
              var6Lifetime6 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime6 * var2_doubleLifetime6 + var4Lifetime7 * var4Lifetime7));
            }
            if (var6Lifetime6 > 128) {
              var6Lifetime6 = 128;
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[8], 100, var6Lifetime6 * pk.field_h / 78);
            }
            this.field_i = 0;
            var4Lifetime7Lifetime1 = a.field_h[0].field_l - this.field_l;
            var2_doubleLifetime6Lifetime1 = a.field_h[0].field_a - this.field_a;
            var7 = Math.sqrt(var4Lifetime7Lifetime1 * var4Lifetime7Lifetime1 + var2_doubleLifetime6Lifetime1 * var2_doubleLifetime6Lifetime1);
            var9 = new vl(3, this);
            var9.field_a = var4Lifetime7Lifetime1 * 4.0 / var7;
            var9.field_j = var2_doubleLifetime6Lifetime1 * 4.0 / var7;
            var9.field_c = this.field_a + 8.0 * var9.field_j;
            var9.field_k = this.field_l + var9.field_a * 8.0;
            wk.field_b[eg.a(-79)] = var9;
          }
        }
        if (this.field_m == 7 &&
          a.field_h[0] != null) {
          this.field_j = 5;
          this.field_i = this.field_i + 1;
          if (this.field_i > 100) {
            this.field_i = this.field_i - 100;
          }
          if (0 == this.field_i % 10) {
            var2_doubleLifetime1 = -a.field_h[0].field_a + this.field_a;
            var4Lifetime1 = -a.field_h[0].field_l + this.field_l;
            var6Lifetime1 = 128;
            if (var2_doubleLifetime1 != 0.0 ||
              var4Lifetime1 != 0.0) {
              var6Lifetime1 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime1 * var2_doubleLifetime1 + var4Lifetime1 * var4Lifetime1));
            }
            if (var6Lifetime1 > 128) {
              var6Lifetime1 = 128;
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[5], 100, var6Lifetime1 * pk.field_h / 78);
            }
          }
        }
        if (this.field_m == 6 &&
          a.field_h[0] != null) {
          this.field_j = 5;
          this.field_i = this.field_i + 1;
          if (100 < this.field_i) {
            this.field_i = this.field_i - 100;
          }
          if (this.field_i % 10 == 0) {
            var2_doubleLifetime2 = this.field_a - a.field_h[0].field_a;
            var4Lifetime2 = -a.field_h[0].field_l + this.field_l;
            var6Lifetime2 = 128;
            if (0.0 != var2_doubleLifetime2 ||
              0.0 != var4Lifetime2) {
              var6Lifetime2 = (int)(2560.0 / Math.sqrt(var4Lifetime2 * var4Lifetime2 + var2_doubleLifetime2 * var2_doubleLifetime2));
            }
            if (var6Lifetime2 > 128) {
              var6Lifetime2 = 128;
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[6], 100, var6Lifetime2 * pk.field_h / 78);
            }
          }
        }
        if (this.field_m == 14 &&
          null != a.field_h[0]) {
          this.field_k = this.field_k * 0.99;
          this.field_d = this.field_d * 0.99;
          this.field_j = this.field_i / 50;
          for (var2 = 0; var2 < 1000; var2++) {
            if (null != a.field_h[var2] &&
              a.field_h[var2].field_m != 14) {
              var11 = a.field_h[var2];
              var4Lifetime3 = this.field_a - var11.field_a;
              if (480.0 < var4Lifetime3) {
                var4Lifetime3 = var4Lifetime3 - 960.0;
              }
              var6_double = this.field_l - var11.field_l;
              if (-480.0 > var4Lifetime3) {
                var4Lifetime3 = var4Lifetime3 + 960.0;
              }
              if (var6_double > 480.0) {
                var6_double = var6_double - 960.0;
              }
              if (var6_double < -480.0) {
                var6_double = var6_double + 960.0;
              }
              if (var4Lifetime3 != 0.0 ||
                var6_double != 0.0) {
                var8 = Math.sqrt(var6_double * var6_double + var4Lifetime3 * var4Lifetime3);
                var11.field_k = var11.field_k + 1.28 * ((double)this.field_i * var6_double) / (var8 * var8) / 1000.0;
                var11.field_d = var11.field_d + 1.28 * (var4Lifetime3 * (double)this.field_i) / (var8 * var8) / 1000.0;
              }
            }
          }
          for (var2Lifetime2 = 0; var2Lifetime2 < 3000; var2Lifetime2++) {
            if (null != wk.field_b[var2Lifetime2]) {
              var12 = wk.field_b[var2Lifetime2];
              var4Lifetime3Lifetime1 = -var12.field_c + this.field_a;
              if (480.0 < var4Lifetime3Lifetime1) {
                var4Lifetime3Lifetime1 = var4Lifetime3Lifetime1 - 960.0;
              }
              var6_doubleLifetime2 = -var12.field_k + this.field_l;
              if (-480.0 > var4Lifetime3Lifetime1) {
                var4Lifetime3Lifetime1 = var4Lifetime3Lifetime1 + 960.0;
              }
              if (var6_doubleLifetime2 > 480.0) {
                var6_doubleLifetime2 = var6_doubleLifetime2 - 960.0;
              }
              if (-480.0 > var6_doubleLifetime2) {
                var6_doubleLifetime2 = var6_doubleLifetime2 + 960.0;
              }
              if (var4Lifetime3Lifetime1 != 0.0 ||
                var6_doubleLifetime2 != 0.0) {
                var8Lifetime1 = Math.sqrt(var6_doubleLifetime2 * var6_doubleLifetime2 + var4Lifetime3Lifetime1 * var4Lifetime3Lifetime1);
                var12.field_j = var12.field_j + (double)this.field_i * var4Lifetime3Lifetime1 * 1.28 / (var8Lifetime1 * var8Lifetime1) / 1000.0;
                var12.field_a = var12.field_a + var6_doubleLifetime2 * (double)this.field_i * 1.28 / (var8Lifetime1 * var8Lifetime1) / 1000.0;
              }
            }
          }
          this.field_i = this.field_i + 1;
          if (200.0 * Math.random() * 60.0 < (double)this.field_i) {
            var13 = new vl(1, this);
            var13.field_q = 16711680;
            var13.field_c = this.field_a + 64.0 * Math.random() - 32.0;
            var13.field_k = this.field_l + Math.random() * 64.0 - 32.0;
            var13.field_a = (-var13.field_c + this.field_a) / 100.0;
            var13.field_j = (this.field_l - var13.field_k) / 100.0;
            var3_int = eg.a(-88);
            if (-1 != var3_int) {
              wk.field_b[var3_int] = var13;
            }
          }
          if (this.field_i < 3000 &&
            50 > this.field_g) {
            this.field_i = this.field_i + (250 - this.field_g * 5);
            this.field_g = 50;
          }
          if (this.field_i > 12000) {
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[28], 100, 2 * pk.field_h);
            }
            for (var3_intLifetime1 = 0; var3_intLifetime1 < 256; var3_intLifetime1++) {
              var14 = new vl(3, this);
              var14.field_j = var14.field_j - Math.sin(2.0 * (3.141592653589793 * (double)var3_intLifetime1) / 256.0) * 4.0;
              var14.field_a = var14.field_a - Math.cos(2.0 * (3.141592653589793 * (double)var3_intLifetime1) / 256.0) * 4.0;
              var14.field_c = 2.0 * var14.field_j + this.field_a;
              var14.field_k = 2.0 * var14.field_a + this.field_l;
              var4_int = eg.a(-101);
              if (var4_int != -1) {
                wk.field_b[var4_int] = var14;
              }
            }
            return null;
          }
          if (this.field_i % 10 != 0) {
            if ((this.field_i % 5 == 0) &&
              (!(7500 >= this.field_i))) {
              var2_doubleLifetime3 = -a.field_h[0].field_a + this.field_a;
              var4Lifetime3Lifetime2 = this.field_l - a.field_h[0].field_l;
              var6Lifetime3 = 128;
              if (var2_doubleLifetime3 != 0.0 ||
                var4Lifetime3Lifetime2 != 0.0) {
                var6Lifetime3 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime3 * var2_doubleLifetime3 + var4Lifetime3Lifetime2 * var4Lifetime3Lifetime2));
              }
              if (var6Lifetime3 > 128) {
                var6Lifetime3 = 128;
              }
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[26], 100, pk.field_h * var6Lifetime3 / 78);
              }
            }
          } else {
            var2_doubleLifetime3 = -a.field_h[0].field_a + this.field_a;
            var4Lifetime3Lifetime2 = this.field_l - a.field_h[0].field_l;
            var6Lifetime3 = 128;
            if (var2_doubleLifetime3 != 0.0 ||
              var4Lifetime3Lifetime2 != 0.0) {
              var6Lifetime3 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime3 * var2_doubleLifetime3 + var4Lifetime3Lifetime2 * var4Lifetime3Lifetime2));
            }
            if (var6Lifetime3 > 128) {
              var6Lifetime3 = 128;
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[26], 100, pk.field_h * var6Lifetime3 / 78);
            }
          }
        }
        if (this.field_m == 13 &&
          a.field_h[0] != null) {
          this.field_i = this.field_i + 1;
          this.field_j = 16;
          if (0 == this.field_i % 10) {
            var2_doubleLifetime4 = -a.field_h[0].field_a + this.field_a;
            var4Lifetime4 = this.field_l - a.field_h[0].field_l;
            var6Lifetime4 = 128;
            if (0.0 != var2_doubleLifetime4 ||
              0.0 != var4Lifetime4) {
              var6Lifetime4 = (int)(2560.0 / Math.sqrt(var4Lifetime4 * var4Lifetime4 + var2_doubleLifetime4 * var2_doubleLifetime4));
            }
            if (128 < var6Lifetime4) {
              var6Lifetime4 = 128;
            }
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[23], 100, pk.field_h * var6Lifetime4 / 78);
            }
          }
          if (this.field_i > 100) {
            var2_doubleLifetime4Lifetime1 = -this.field_a + a.field_h[0].field_a;
            var4Lifetime4Lifetime1 = a.field_h[0].field_l - this.field_l;
            var6_doubleLifetime1 = Math.sqrt(var4Lifetime4Lifetime1 * var4Lifetime4Lifetime1 + var2_doubleLifetime4Lifetime1 * var2_doubleLifetime4Lifetime1);
            this.field_k = this.field_k + var4Lifetime4Lifetime1 * 0.1 / var6_doubleLifetime1;
            if (this.field_i > 150) {
              this.field_i = 0;
            }
            this.field_d = this.field_d + var2_doubleLifetime4Lifetime1 * 0.1 / var6_doubleLifetime1;
          }
        }
        if (15 == this.field_m) {
          this.field_i = this.field_i + 1;
          if (this.field_i > 100) {
            this.field_j = this.field_j + 1;
            if (this.field_i % 10 == 0) {
              stackIn_195_0 = null;
              stackIn_195_1 = a.field_h[0];
              if (stackIn_195_0 != stackIn_195_1) {
                var2_doubleLifetime5 = this.field_a - a.field_h[0].field_a;
                var4Lifetime5 = this.field_l - a.field_h[0].field_l;
                var6Lifetime5 = 128;
                if (0.0 != var2_doubleLifetime5 ||
                  var4Lifetime5 != 0.0) {
                  var6Lifetime5 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime5 * var2_doubleLifetime5 + var4Lifetime5 * var4Lifetime5));
                }
                if (var6Lifetime5 > 128) {
                  var6Lifetime5 = 128;
                }
                if (fe.field_e) {
                  ll.field_c.a(sb.field_e[8], 100, pk.field_h * var6Lifetime5 / 78);
                }
                var15 = new vl(3, this);
                var15.field_j = 4.0 * Math.cos(2.0 * (3.141592653589793 * (double)this.field_h) / 256.0);
                var15.field_a = 4.0 * -Math.sin((double)this.field_h * 3.141592653589793 * 2.0 / 256.0);
                var15.field_k = this.field_l + var15.field_a * 4.0 - 4.0 * var15.field_j;
                var15.field_c = var15.field_a * 4.0 + (var15.field_j * 4.0 + this.field_a);
                var15.field_j = var15.field_j + this.field_d;
                var15.field_a = var15.field_a + this.field_k;
                wk.field_b[eg.a(-88)] = var15;
              }
            }
            if (this.field_i % 10 == 5 &&
              a.field_h[0] != null) {
              var2_doubleLifetime5Lifetime1 = this.field_a - a.field_h[0].field_a;
              var4Lifetime5Lifetime1 = -a.field_h[0].field_l + this.field_l;
              var6Lifetime5Lifetime1 = 128;
              if (var2_doubleLifetime5Lifetime1 != 0.0 ||
                var4Lifetime5Lifetime1 != 0.0) {
                var6Lifetime5Lifetime1 = (int)(2560.0 / Math.sqrt(var2_doubleLifetime5Lifetime1 * var2_doubleLifetime5Lifetime1 + var4Lifetime5Lifetime1 * var4Lifetime5Lifetime1));
              }
              if (var6Lifetime5Lifetime1 > 128) {
                var6Lifetime5Lifetime1 = 128;
              }
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[8], 100, var6Lifetime5Lifetime1 * pk.field_h / 78);
              }
              var16 = new vl(3, this);
              var16.field_j = 4.0 * Math.cos((double)(this.field_h + 128) * 3.141592653589793 * 2.0 / 256.0);
              var16.field_a = 4.0 * -Math.sin(3.141592653589793 * (double)(this.field_h + 128) * 2.0 / 256.0);
              var16.field_k = -(var16.field_j * 4.0) + (var16.field_a * 4.0 + this.field_l);
              var16.field_c = var16.field_a * 4.0 + (4.0 * var16.field_j + this.field_a);
              var16.field_a = var16.field_a + this.field_k;
              var16.field_j = var16.field_j + this.field_d;
              wk.field_b[eg.a(-56)] = var16;
            }
            if (200 < this.field_i) {
              this.field_i = 0;
            }
          } else {
            if (0 < this.field_j) {
              this.field_j = this.field_j - 1;
            }
            if (this.field_j < 0) {
              this.field_j = this.field_j + 1;
            }
          }
        }
        if (param0 >= -81) {
          this.field_g = 109;
        }
        if (-1 == this.field_m &&
          nc.field_H == 3) {
          this.field_g = 1;
        }
        if (this.field_m == -1 &&
          nc.field_H == 4) {
          this.field_g = 1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_g <= 0) {
          if ((this.field_m == -1) &&
            (decompiledFrameRemainder0 = (nc.field_H != 1)) &&
            (decompiledFrameRemainder0 = (nc.field_H != 2)) &&
            (decompiledFrameRemainder0 = (nc.field_H != 3))) {
            decompiledFrameRemainder0 = (nc.field_H != 4);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_m != -1) {
              this.c(8);
              return null;
            }
            this.field_k = this.field_k - Math.cos(3.141592653589793 * (double)this.field_h * 2.0 / 256.0) * 0.1;
            this.field_d = this.field_d - Math.sin(2.0 * ((double)this.field_h * 3.141592653589793) / 256.0) * 0.1;
            if (fe.field_e &&
              og.field_a <= 0) {
              ll.field_c.a(sb.field_e[35], 100, pk.field_h);
              og.field_a = 7;
            }
            for (var2Lifetime1 = 0; var2Lifetime1 > this.field_g; var2Lifetime1 -= 10) {
              var3 = new vl(1, this);
              var3.field_a = 0.0;
              var3.field_q = 16711680;
              var3.field_j = 0.0;
              var4Lifetime6 = 6.28 * Math.random();
              var3.field_c = this.field_a + (double)(int)(16.0 * Math.random() * Math.sin(var4Lifetime6));
              var3.field_k = this.field_l + (double)(int)(16.0 * Math.random() * Math.cos(var4Lifetime6));
              wk.field_b[eg.a(-90)] = var3;
            }
            this.field_g = this.field_g - 1;
            if (this.field_g < -200 &&
              o.field_j == 0) {
              this.c(-107);
              return null;
            }
          }
        }
        if (this.field_m != -1 &&
          this.field_m != 11 ||
          2 != nc.field_H &&
          nc.field_H != 4) {
          this.d(-22);
        }
        return this;
    }

    final static void a(int param0, String param1, Throwable param2) {
        try {
          ej stackIn_13_0;
          int stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          java.net.URL stackIn_13_4;
          StringBuilder stackIn_13_5;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          String stackIn_14_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          re var4 = null;
          int var5 = 0;
          DataInputStream var6 = null;
          int var7 = 0;
          String var8 = null;
          var7 = stellarshard.field_B;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = o.a(1, param2);
            }
            if (param1 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            pf.a(17651, var3);
            var3 = gg.a(var3, "%3a", ":", 85);
            var3 = gg.a(var3, "%40", "@", 85);
            var3 = gg.a(var3, "%26", "&", 71);
            var8 = gg.a(var3, "%23", "#", 63);
            if (tc.field_u == null) {
              return;
            }
            stackIn_13_0 = fb.field_d;
            stackIn_13_1 = 5284;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = tc.field_u.getCodeBase();
            stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(lg.field_d).append("&u=");
            if (kb.field_c != null) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = kb.field_c;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = "" + al.field_b;
            }
            var4 = ((ej) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(ej.field_g).append("&v2=").append(ej.field_r).append("&e=").append(var8).toString()));
            var5 = -92 / ((param0 + 65) / 38);
            while (var4.field_f == 0) {
              jj.a((byte) -120, 1L);
            }
            if (1 == var4.field_f) {
              var6 = (DataInputStream) (var4.field_b);
              var6.read();
              var6.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        fg.field_M = param0;
        mc.field_a = param3;
        if (param1 != -29770) {
          String var6 = (String) null;
          qe.$cfr$intArgs$a$590e95718a07(-45, (String) null, false);
        }
        l.field_e = param2;
        na.field_a = param4;
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = ni.field_f[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 > 479) {
              var23 = 479;
            }
            var24 = ti.field_a[var23 * 640 + var22];
            var25 = 64 + (ni.field_c[var20] * param10 >> 17);
            if (var25 < 0) {
              throw new Error();
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            ti.field_a[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ni.field_f[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 > 479) {
            var23Lifetime1 = 479;
          }
          var24Lifetime1 = ti.field_a[var23Lifetime1 * 640 + var22Lifetime1];
          var25Lifetime1 = 64 + (ni.field_c[var20Lifetime1] * param10 >> 17);
          if (var25Lifetime1 < 0) {
            var25Lifetime1 = -var25Lifetime1;
          }
          var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
          var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
          var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
          var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
          var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
          var15Lifetime1--;
          ti.field_a[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
        }
    }

    final void e(int param0) {
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        ub stackIn_176_0;
        String stackIn_176_1;
        int stackIn_176_2;
        int stackIn_176_3;
        int stackIn_177_4;
        ub stackIn_184_0;
        String stackIn_184_1;
        int stackIn_184_2;
        int stackIn_184_3;
        int stackIn_185_4;
        ub stackIn_197_0;
        String stackIn_197_1;
        int stackIn_197_2;
        int stackIn_197_3;
        int stackIn_198_4;
        ub stackIn_206_0;
        String stackIn_206_1;
        int stackIn_206_2;
        int stackIn_206_3;
        int stackIn_207_4;
        ub stackIn_215_0;
        String stackIn_215_1;
        int stackIn_215_2;
        int stackIn_215_3;
        int stackIn_216_4;
        ub stackIn_223_0;
        String stackIn_223_1;
        int stackIn_223_2;
        int stackIn_223_3;
        int stackIn_224_4;
        ub stackIn_230_0;
        String stackIn_230_1;
        int stackIn_230_2;
        int stackIn_230_3;
        int stackIn_231_4;
        int var2;
        int var3;
        int var4;
        pb var4_ref_pb;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        bj var9_ref_bj;
        int var10;
        int var11;
        int var12;
        int var13_int;
        int[] var13;
        int var14_int;
        int[] var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        pb var34;
        pb var35;
        pb var36;
        int[] var37;
        int[] var38;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var29Lifetime2;
        int var30Lifetime2;
        int var31Lifetime2;
        int var32Lifetime2;
        int var29Lifetime1Lifetime1;
        int var30Lifetime1Lifetime1;
        int var31Lifetime1Lifetime1;
        int var32Lifetime1Lifetime1;
        var33 = stellarshard.field_B;
        var2 = (int)(this.field_a + 320.0 - 48.0);
        var3 = (int)(this.field_l + 240.0 - 48.0);
        if (this.field_m != -1) {
          if (this.field_m == 14) {
            var4 = var2 + 48 << 4;
            var5 = var3 + 48 << 4;
            var6 = 2048;
            var7 = this.field_i;
            if (1000 > var7) {
              var7 = 1000;
            }
            var8 = var6 * var6;
            var9 = var4 - var6 >> 4;
            var10 = 15 + var4 >> 4;
            var11 = var4 + (var6 + 15) >> 4;
            var12 = -var6 + var5 >> 4;
            var13_int = 15 + var5 >> 4;
            var14_int = 15 + var5 + var6 >> 4;
            if (640 < var11) {
              var11 = 640;
            }
            if (var9 < 0) {
              var9 = 0;
            }
            if (var12 < 0) {
              var12 = 0;
            }
            if (var14_int > 480) {
              var14_int = 480;
            }
            if (var10 < 0) {
              var10 = 0;
            }
            if (var13_int < 0) {
              var13_int = 0;
            }
            if (var10 > 640) {
              var10 = 640;
            }
            if (var13_int > 480) {
              var13_int = 480;
            }
            var15 = -var4 + (var10 << 4);
            var15 = var15 * var15;
            var16 = -var4 + (var10 + 1 << 4);
            var16 = var16 * var16;
            var17 = (var10 + 2 << 4) - var4;
            var17 = var17 * var17;
            var18 = -var15 + var16;
            var19 = var17 - var16;
            var20 = var19 - var18;
            var21 = -var5 + (var13_int << 4);
            var21 = var21 * var21;
            var22 = -var5 + (1 + var13_int << 4);
            var22 = var22 * var22;
            var23 = (2 + var13_int << 4) - var5;
            var23 = var23 * var23;
            var24 = var22 - var21;
            var25 = var23 - var22;
            var26 = var25 - var24;
            var27 = 16;
            var28 = var8;
            while (var8 > 2147483647 >>> var27) {
              var27--;
              var28 = 1 + var28 >>> 1;
            }
            var29 = var10 + 640 * var13_int;
            var30 = var15 + var21;
            var31 = var24;
            for (var32 = var13_int; var14_int > var32; var32++) {
              qe.b(var32, var30, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29, var4, var5);
              var30 = var30 + var31;
              var31 = var31 + var26;
              var29 += 640;
            }
            var31Lifetime2 = var24;
            var29Lifetime2 = var10 + 640 * var13_int;
            var30Lifetime2 = var21 + var15;
            for (var32Lifetime2 = var13_int - 1; var12 <= var32Lifetime2; var32Lifetime2--) {
              var31Lifetime2 = var31Lifetime2 - var26;
              var30Lifetime2 = var30Lifetime2 - var31Lifetime2;
              var29Lifetime2 -= 640;
              qe.a(var32Lifetime2, var30Lifetime2, var18, var20, var27, var8, var28, var9, var10, var11, var7, var29Lifetime2, var4, var5);
            }
          }
          if (4 != this.field_m &&
            10 != this.field_m &&
            this.field_m != 5) {
            if (!this.a((byte) -51)) {
              this.b(640).e(var2, var3);
            } else {
              var4 = 48 + var2 << 4;
              var5 = 48 + var3 << 4;
              var6 = 512;
              var7 = 10000;
              var8 = var6 * var6;
              var9 = -var6 + var4 >> 4;
              var10 = 15 + var4 >> 4;
              var11 = 15 + (var6 + var4) >> 4;
              var12 = -var6 + var5 >> 4;
              var13_int = var5 + 15 >> 4;
              if (var12 < 0) {
                var12 = 0;
              }
              var14_int = 15 + var6 + var5 >> 4;
              if (0 > var9) {
                var9 = 0;
              }
              if (var11 > 640) {
                var11 = 640;
              }
              if (var10 < 0) {
                var10 = 0;
              }
              if (var14_int > 480) {
                var14_int = 480;
              }
              if (0 > var13_int) {
                var13_int = 0;
              }
              if (var10 > 640) {
                var10 = 640;
              }
              if (var13_int > 480) {
                var13_int = 480;
              }
              var15 = (var10 << 4) - var4;
              var15 = var15 * var15;
              var16 = -var4 + (1 + var10 << 4);
              var16 = var16 * var16;
              var17 = -var4 + (2 + var10 << 4);
              var17 = var17 * var17;
              var18 = var16 - var15;
              var19 = var17 - var16;
              var20Lifetime1 = var19 - var18;
              var21Lifetime1 = -var5 + (var13_int << 4);
              var21Lifetime1 = var21Lifetime1 * var21Lifetime1;
              var22Lifetime1 = -var5 + (1 + var13_int << 4);
              var22Lifetime1 = var22Lifetime1 * var22Lifetime1;
              var23Lifetime1 = -var5 + (var13_int + 2 << 4);
              var23Lifetime1 = var23Lifetime1 * var23Lifetime1;
              var24Lifetime1 = var22Lifetime1 - var21Lifetime1;
              var25Lifetime1 = -var22Lifetime1 + var23Lifetime1;
              var26Lifetime1 = -var24Lifetime1 + var25Lifetime1;
              var27Lifetime1 = 16;
              var28Lifetime1 = var8;
              while (var8 > 2147483647 >>> var27Lifetime1) {
                var28Lifetime1 = var28Lifetime1 + 1 >>> 1;
                var27Lifetime1--;
              }
              var29Lifetime1 = var10 + 640 * var13_int;
              var30Lifetime1 = var15 + var21Lifetime1;
              var31Lifetime1 = var24Lifetime1;
              for (var32Lifetime1 = var13_int; var32Lifetime1 < var14_int; var32Lifetime1++) {
                qe.b(var32Lifetime1, var30Lifetime1, var18, var20Lifetime1, var27Lifetime1, var8, var28Lifetime1, var9, var10, var11, var7, var29Lifetime1, var4, var5);
                var30Lifetime1 = var30Lifetime1 + var31Lifetime1;
                var29Lifetime1 += 640;
                var31Lifetime1 = var31Lifetime1 + var26Lifetime1;
              }
              var29Lifetime1Lifetime1 = var10 + var13_int * 640;
              var30Lifetime1Lifetime1 = var21Lifetime1 + var15;
              var31Lifetime1Lifetime1 = var24Lifetime1;
              for (var32Lifetime1Lifetime1 = var13_int - 1; var12 <= var32Lifetime1Lifetime1; var32Lifetime1Lifetime1--) {
                var31Lifetime1Lifetime1 = var31Lifetime1Lifetime1 - var26Lifetime1;
                var30Lifetime1Lifetime1 = var30Lifetime1Lifetime1 - var31Lifetime1Lifetime1;
                var29Lifetime1Lifetime1 -= 640;
                qe.a(var32Lifetime1Lifetime1, var30Lifetime1Lifetime1, var18, var20Lifetime1, var27Lifetime1, var8, var28Lifetime1, var9, var10, var11, var7, var29Lifetime1Lifetime1, var4, var5);
              }
            }
          } else {
            var4_ref_pb = this.b(640);
            var5 = var2;
            var5 = var5 + var4_ref_pb.field_t;
            var6 = var3;
            var6 = var6 + var4_ref_pb.field_s;
            var7 = var5 + ti.field_i * var6;
            var8 = 0;
            var9 = var4_ref_pb.field_y;
            var10 = var4_ref_pb.field_v;
            var11 = ti.field_i - var10;
            var12 = 0;
            if (var6 < ti.field_f) {
              var13_int = -var6 + ti.field_f;
              var9 = var9 - var13_int;
              var7 = var7 + ti.field_i * var13_int;
              var8 = var8 + var13_int * var10;
              var6 = ti.field_f;
            }
            if (ti.field_l < var9 + var6) {
              var9 = var9 - (-ti.field_l + var6 + var9);
            }
            if (var5 < ti.field_e) {
              var13_int = -var5 + ti.field_e;
              var7 = var7 + var13_int;
              var12 = var12 + var13_int;
              var8 = var8 + var13_int;
              var11 = var11 + var13_int;
              var10 = var10 - var13_int;
              var5 = ti.field_e;
            }
            if (ti.field_c < var10 + var5) {
              var13_int = var10 + (var5 - ti.field_c);
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              var10 = var10 - var13_int;
            }
            if (var10 > 0 &&
              0 < var9) {
              var38 = ti.field_a;
              var37 = var38;
              var13 = var37;
              var14 = var4_ref_pb.field_z;
              var17 = -(var10 >> 2);
              var10 = -(3 & var10);
              for (var21Lifetime1 = -var9; var21Lifetime1 < 0; var21Lifetime1++) {
                for (var22Lifetime1 = var17 * 4 + var10; 0 > var22Lifetime1; var22Lifetime1++) {
                  var16 = var14[var8++];
                  var15 = var16 & 255;
                  if (var15 != 0) {
                    var18 = (var38[var7] & 16711680) >> 16;
                    var19 = (var38[var7] & 65280) >> 8;
                    var20Lifetime1 = 255 & var38[var7];
                    var20Lifetime1 = (256 - var15) * var20Lifetime1 + var15 * 255 >> 9;
                    var18 = (-var15 + 256) * var18 >> 9;
                    var19 = var19 * (256 - var15) + var15 * 255 >> 9;
                    var13[var7] = var20Lifetime1 + ((var19 << 8) + (var18 << 16)) + sa.a(var16 >> 1, 8355711);
                  }
                  var7++;
                }
                var8 = var8 + var12;
                var7 = var7 + var11;
              }
            }
          }
          if (this.field_m == 11 &&
            16 != this.field_c &&
            qi.field_a == 1 &&
            null == na.field_j) {
            ti.b(24 + var2 - ki.field_s / 2, -(ki.field_s / 2) + var3 + 24, ki.field_s + 48, 48 + ki.field_s, 65535);
            stackIn_176_0 = qj.field_a;
            stackIn_176_1 = cd.field_P;
            stackIn_176_2 = 48 + var2;
            stackIn_176_3 = 24 + var3;
            stackIn_177_4 = (ki.field_s >= 5) ? 65535 : 16777215;
            ((ub) (Object) stackIn_176_0).c(stackIn_176_1, stackIn_176_2, stackIn_176_3, stackIn_177_4, 0);
          }
          if (this.field_m == 13 &&
            4 == qi.field_a &&
            na.field_j == null) {
            ti.b(24 + (var2 - ki.field_s / 2), -(ki.field_s / 2) + 24 + var3, 48 + ki.field_s, ki.field_s + 48, 16711680);
            stackIn_184_0 = qj.field_a;
            stackIn_184_1 = ci.field_d;
            stackIn_184_2 = 48 + var2;
            stackIn_184_3 = 24 + var3;
            stackIn_185_4 = (ki.field_s >= 5) ? 16711680 : 16777215;
            ((ub) (Object) stackIn_184_0).c(stackIn_184_1, stackIn_184_2, stackIn_184_3, stackIn_185_4, 0);
          }
          if (this.field_m == 12 &&
            null == na.field_j) {
            if (50 < this.field_i) {
              var4 = -(int)(8.0 * (Math.cos(3.141592653589793 * (double)this.field_h / 128.0) * (double)(-50 + this.field_i)) / 25.0);
              var5 = (int)(8.0 * (Math.sin(3.141592653589793 * (double)this.field_h / 128.0) * (double)(-50 + this.field_i)) / 25.0);
              ti.a(var4 + 48 + var2 << 4, var5 + var3 + 48 << 4, (this.field_i - 50) / 10 + 5 << 4, 255, ml.field_c);
            }
            if (qi.field_a == 5 &&
              null == na.field_j) {
              ti.b(var2 - (-24 + ki.field_s / 2), -(ki.field_s / 2) + (24 + var3), 48 + ki.field_s, 48 + ki.field_s, 16711680);
              stackIn_197_0 = qj.field_a;
              stackIn_197_1 = mc.field_b;
              stackIn_197_2 = var2 + 48;
              stackIn_197_3 = var3 + 24;
              stackIn_198_4 = (5 > ki.field_s) ? 16777215 : 16711680;
              ((ub) (Object) stackIn_197_0).c(stackIn_197_1, stackIn_197_2, stackIn_197_3, stackIn_198_4, 0);
            }
          }
          if (this.field_m == 15 &&
            7 == qi.field_a &&
            null == na.field_j) {
            ti.b(var2 + 24 - ki.field_s / 2, -(ki.field_s / 2) + var3 + 24, 48 + ki.field_s, 48 + ki.field_s, 16711680);
            stackIn_206_0 = qj.field_a;
            stackIn_206_1 = he.field_k;
            stackIn_206_2 = 48 + var2;
            stackIn_206_3 = var3 + 24;
            stackIn_207_4 = (ki.field_s < 5) ? 16777215 : 16711680;
            ((ub) (Object) stackIn_206_0).c(stackIn_206_1, stackIn_206_2, stackIn_206_3, stackIn_207_4, 0);
          }
          if (this.field_m == 7 &&
            qi.field_a == 8 &&
            null == na.field_j) {
            ti.b(-(ki.field_s / 2) + var2, var3 - ki.field_s / 2, 96 + ki.field_s, 96 + ki.field_s, 16711680);
            stackIn_215_0 = qj.field_a;
            stackIn_215_1 = hc.field_h;
            stackIn_215_2 = var2 + 48;
            stackIn_215_3 = var3;
            stackIn_216_4 = (5 <= ki.field_s) ? 16711680 : 16777215;
            ((ub) (Object) stackIn_215_0).c(stackIn_215_1, stackIn_215_2, stackIn_215_3, stackIn_216_4, 0);
          }
          if (this.field_m == 6 &&
            qi.field_a == 9 &&
            na.field_j == null) {
            ti.b(-(ki.field_s / 2) + var2, var3 - ki.field_s / 2, 96 + ki.field_s, 96 + ki.field_s, 16711680);
            stackIn_223_0 = qj.field_a;
            stackIn_223_1 = hc.field_h;
            stackIn_223_2 = var2 + 48;
            stackIn_223_3 = var3;
            stackIn_224_4 = (ki.field_s < 5) ? 16777215 : 16711680;
            ((ub) (Object) stackIn_223_0).c(stackIn_223_1, stackIn_223_2, stackIn_223_3, stackIn_224_4, 0);
          }
          if (this.field_m == 14 &&
            qi.field_a == 10 &&
            null == na.field_j) {
            ti.b(-(ki.field_s / 2) + var2, var3 - ki.field_s / 2, ki.field_s + 96, 96 + ki.field_s, 16711680);
            stackIn_230_0 = qj.field_a;
            stackIn_230_1 = jf.field_l;
            stackIn_230_2 = 48 + var2;
            stackIn_230_3 = var3;
            stackIn_231_4 = (ki.field_s < 5) ? 16777215 : 16711680;
            ((ub) (Object) stackIn_230_0).c(stackIn_230_1, stackIn_230_2, stackIn_230_3, stackIn_231_4, 0);
          }
        } else {
          if (aj.field_c == null) {
            aj.field_c = new pa[7];
            vl.field_r = new bj[7];
            for (var4 = 0; var4 < 7; var4++) {
              aj.field_c[var4] = new pa(rh.field_b, false, false, false, false);
              aj.field_c[var4].a(new int[]{0, 0, 0, -65536, 0, 0, 0, -65536, 0, 0, 0, 65536});
              aj.field_c[var4].a(new int[]{0, 0, 0, 65536, 0, 0, 0, 0, -65536, 0, 65536, 0});
              var5 = (int)(65536.0 * Math.cos(3.141592653589793 * (double)(16 * (-3 + var4)) / 256.0));
              var6 = (int)(Math.sin(3.141592653589793 * (double)((-3 + var4) * 16) / 256.0) * 65536.0);
              aj.field_c[var4].a(new int[]{0, 0, 0, var5, 0, -var6, 0, 65536, 0, var6, 0, var5});
              var7 = 50;
              var8 = 50;
              var9 = -50;
              vl.field_r[var4] = aj.field_c[var4].a(32, 346, var7, var8, var9);
              aj.field_c[var4] = null;
            }
          }
          var4 = 0;
          var5 = 0;
          var6 = this.field_h << 3 & 2045;
          var7 = 0;
          var8 = 3;
          if (this.field_j < -5) {
            var8 = 2;
          }
          if (this.field_j < -20) {
            var8 = 1;
          }
          if (-50 > this.field_j) {
            var8 = 0;
          }
          if (5 < this.field_j) {
            var8 = 4;
          }
          if (this.field_j > 20) {
            var8 = 5;
          }
          if (this.field_j > 50) {
            var8 = 6;
          }
          var9_ref_bj = vl.field_r[var8];
          this.b(640).e();
          ti.f(0, 0, 96, 96, 0);
          cc.a();
          var9_ref_bj.a(var4, var5, var6, var7, 0, 0, 3000, -1L);
          pd.field_h.a((byte) -107);
          if (0 == nc.field_H) {
            if (el.field_I > 0 &&
              (15 & el.field_I) >= 7) {
              this.b(640).b(var2, var3, 16777215);
            } else {
              this.b(640).e(var2, var3);
            }
          } else {
            if (nc.field_H == 1) {
              var10 = 16777215;
              if (5 < gh.field_b) {
                gh.field_b = 5;
              }
              if (gh.field_b == 4) {
                var10 = 8454143;
              }
              if (gh.field_b == 3) {
                var10 = 8421631;
              }
              if (gh.field_b == 2) {
                var10 = 16744703;
              }
              if (gh.field_b == 1) {
                var10 = 16744576;
              }
              nd.a(128, var3 + 48, var10, 48 + var2, (byte) -54, 32);
              if (el.field_I > 0 &&
                7 <= (el.field_I & 15)) {
                this.b(640).b(var2, var3, 16777215);
              } else {
                this.b(640).e(var2, var3);
              }
            } else {
              if (nc.field_H == 2) {
                if (gh.field_b <= 50 &&
                  gh.field_b % 10 >= 5) {
                  this.b(640).e(var2, var3);
                } else {
                  var35 = this.b(640);
                  var35.e();
                  for (var11 = -(3 & gh.field_b); var11 < var35.field_x; var11 += 3) {
                    ti.g(0, var11, var35.field_w, 0);
                  }
                  pd.field_h.a((byte) -107);
                  if ((gh.field_b & 48) <= 0) {
                    var35.e(var2, var3);
                  } else {
                    var35.d(-(int)(Math.random() * 5.0) + var2, -(int)(5.0 * Math.random()) + var3, var35.field_w + (int)(Math.random() * 10.0), var35.field_x + (int)(10.0 * Math.random()));
                  }
                }
              }
            }
          }
          if (nc.field_H == 3) {
            nd.a(128, var3 + 48, 16777215, 48 + var2, (byte) -79, 32);
            if (!(gh.field_b <= 50) ||
              !(5 <= gh.field_b % 10)) {
              var34 = this.b(640);
              var36 = var34;
              var11 = var2;
              var11 = var11 + var36.field_t;
              var12 = var3;
              var12 = var12 + var36.field_s;
              for (var13_int = 0; var13_int < var36.field_y; var13_int++) {
                var14_int = var11;
                var15 = var13_int * var36.field_v;
                var16 = 640 * (var13_int + var12) + var14_int;
                if (var14_int >= 0) {
                  stackIn_66_0 = 0;
                } else {
                  stackIn_66_0 = -var14_int;
                }
                var17 = stackIn_66_0;
                if (var36.field_v + var14_int > 640) {
                  stackIn_69_0 = -var14_int + 640;
                } else {
                  stackIn_69_0 = var36.field_v;
                }
                var18 = stackIn_69_0;
                for (var19 = var17; var19 < var18; var19++) {
                  if (var34.field_z[var19 + var15] != 0) {
                    ti.field_a[var19 + var16 - 1] = 16777215;
                    ti.field_a[1 + var19 + var16] = 16777215;
                    ti.field_a[-640 + (var19 + var16)] = 16777215;
                    ti.field_a[640 + (var19 + var16)] = 16777215;
                    ti.field_a[var19 + var16 - 640 - 1] = 16777215;
                    ti.field_a[var19 + (var16 + 639)] = 16777215;
                    ti.field_a[var16 + var19 - 640 + 1] = 16777215;
                    ti.field_a[var16 - (-var19 - 640 - 1)] = 16777215;
                  }
                }
              }
            }
            this.b(640).e(var2, var3, 128);
          }
          if (4 == nc.field_H) {
            this.b(640).e(var2, var3);
          }
        }
        if (ph.field_D >= 2 &&
          this.field_m != -1 &&
          !this.a((byte) -59)) {
          qj.field_a.c("" + this.field_g, var2 + 30, 34 + var3, 16711680, -1);
        }
        if (param0 <= 96) {
          return;
        }
        if (ph.field_D >= 2 &&
          this.field_m == 14) {
          qj.field_a.c("" + this.field_i, var2 + 30, 50 + var3, 255, -1);
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        boolean decompiledFrameRemainder0 = true;
        var4 = stellarshard.field_B;
        var2 = 1 + 64 * (int)(this.field_a + 256.0 + 320.0) / 496;
        var3 = 352 + (int)(this.field_l + 256.0 + 240.0) * 64 / 496;
        if (-1 == this.field_m) {
          ti.e(var2, var3, 4, 16777215);
          ti.b(var2, var3, 4, 0);
        } else {
          if (this.field_m == 0) {
            ti.c(var2, var3, 4, 65280, 64);
            ti.b(var2, var3, 4, 0);
          } else {
            if (this.field_m != 1) {
              if (2 != this.field_m) {
                if (3 == this.field_m) {
                  ti.c(var2, var3, 5, 65280, 64);
                  ti.b(var2, var3, 5, 0);
                } else {
                  if (4 != this.field_m) {
                    if (this.field_m != 5) {
                      if (6 != this.field_m &&
                        this.field_m != 14 &&
                        this.field_m != 7) {
                        if (8 == this.field_m) {
                          ti.c(var2, var3, 3, 65280, 64);
                          ti.b(var2, var3, 3, 0);
                        } else {
                          if (this.field_m == 9) {
                            ti.c(var2, var3, 3, 65280, 64);
                            ti.b(var2, var3, 3, 0);
                          } else {
                            if (this.field_m == 10) {
                              ti.c(var2, var3, 2, 65280, 64);
                              ti.b(var2, var3, 2, 0);
                            } else {
                              if (this.field_m == 11 &&
                                16 != this.field_c) {
                                ti.c(var2, var3, 3, 16777215, 192);
                                ti.b(var2, var3, 3, 0);
                              } else {
                                if ((this.field_m == 12 ||
                                  this.field_m == 13 ||
                                  this.field_m == 15)) {
                                  ti.c(var2, var3, 4, 16711680, 192);
                                  ti.b(var2, var3, 4, 0);
                                }
                              }
                            }
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        ti.c(var2, var3, 5, 16711680, 192);
                        ti.b(var2, var3, 5, 0);
                      }
                    } else {
                      ti.c(var2, var3, 5, 65280, 64);
                      ti.b(var2, var3, 5, 0);
                    }
                  } else {
                    ti.c(var2, var3, 4, 65280, 64);
                    ti.b(var2, var3, 4, 0);
                  }
                }
              } else {
                ti.c(var2, var3, 4, 65280, 64);
                ti.b(var2, var3, 4, 0);
              }
            } else {
              ti.c(var2, var3, 5, 65280, 64);
              ti.b(var2, var3, 5, 0);
            }
          }
        }
        if (param0) {
          this.a((byte) -62);
        }
    }

    final boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -36) {
          return true;
        }
        stackIn_6_0 = (this.field_m == 11) && (this.field_c == 16);
        return stackIn_6_0;
    }

    private final void d(int param0) {
        int var2 = 0;
        qe var3;
        double var4;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        double var26;
        double var28;
        int var30;
        double var26Lifetime1;
        double var28Lifetime1;
        var30 = stellarshard.field_B;
        for (var2 = 0; var2 < 1000; var2++) {
          boolean decompiledFrameRemainder0 = true;
          if (a.field_h[var2] != null && (!a.field_h[var2].a((byte) -109) ||
            this.field_m == -1) && (!this.a((byte) -48) ||
            a.field_h[var2].field_m == -1) && gj.a(a.field_h[var2], 0, false, this)) {
            if ((a.field_h[var2].field_m == -1) &&
              (decompiledFrameRemainder0 = !(a.field_h[var2].field_g <= 0)) &&
              (decompiledFrameRemainder0 = (nc.field_H != 2))) {
              decompiledFrameRemainder0 = (4 != nc.field_H);
            }
            if (decompiledFrameRemainder0) {
              var3 = a.field_h[var2];
              var4 = -var3.field_a + this.field_a;
              var6 = -var3.field_l + this.field_l;
              if (var4 != 0.0 ||
                0.0 != var6) {
                var8 = Math.sqrt(var4 * var4 + var6 * var6);
                var10 = var4 / var8;
                var12 = var6 / var8;
                var14 = -(var10 * this.field_k) + var12 * this.field_d;
                var16 = -(var3.field_k * var10) + var12 * var3.field_d;
                var18 = var12 * this.field_k + var10 * this.field_d;
                var20 = var3.field_k * var12 + var3.field_d * var10;
                if (var20 > var18) {
                  if (!this.a((byte) -113) &&
                    !a.field_h[var2].a((byte) -41)) {
                    this.a(100, this.field_m);
                    this.a(100, a.field_h[var2].field_m);
                    var22 = (double)var3.field_n * var20 + (double)this.field_n * var18;
                    var24 = var18 + -var20;
                    var26 = 0.0;
                    var26Lifetime1 = (-(var24 * (double)var3.field_n) + var22) / (double)(this.field_n + var3.field_n);
                    var28 = 0.0;
                    var28Lifetime1 = var26Lifetime1 + var24;
                    if (0.0 == var12) {
                      var12 = 0.00001;
                    }
                    if (0.0 == var10) {
                      var10 = 0.00001;
                    }
                    this.field_k = (-var14 + var26Lifetime1 / var10 * var12) / (var12 * var12 / var10 + var10);
                    this.field_d = (-(var12 * this.field_k) + var26Lifetime1) / var10;
                    var3.field_k = (var28Lifetime1 / var10 * var12 - var16) / (var12 * var12 / var10 + var10);
                    var3.field_d = (-(var3.field_k * var12) + var28Lifetime1) / var10;
                    if (var3.field_m != 11 && (this.field_m == -1 ||
                      var3.field_m == 14)) {
                      if (14 == var3.field_m) {
                        var3.field_i = var3.field_i + 50;
                      }
                      if (this.field_m != -1 ||
                        !(0 < el.field_I)) {
                        this.field_g = this.field_g - 1;
                        if (this.field_m == -1) {
                          el.field_I = 50;
                        }
                      }
                    }
                    if (this.field_m != 11 && (var3.field_m == -1 ||
                      this.field_m == 14)) {
                      if (this.field_m == 14) {
                        this.field_i = this.field_i + 50;
                      }
                      if (var3.field_m != -1 ||
                        !(0 < el.field_I)) {
                        var3.field_g = var3.field_g - 1;
                        if (var3.field_m == -1) {
                          el.field_I = 50;
                        }
                      }
                    }
                  }
                  if (11 == this.field_m &&
                    -1 == var3.field_m &&
                    var3.field_g >= 0) {
                    o.a(this, false);
                  }
                  if (-1 == this.field_m &&
                    var3.field_m == 11 &&
                    0 <= this.field_g) {
                    o.a(var3, false);
                  }
                  if (!this.a((byte) -85) &&
                    !a.field_h[var2].a((byte) -105)) {
                    if (0.0 < var14) {
                      this.field_j = this.field_j - 1;
                    }
                    if (0.0 > var14) {
                      this.field_j = this.field_j + 1;
                    }
                    if (0.0 < var16) {
                      var3.field_j = var3.field_j - 1;
                    }
                    if (0.0 > var16) {
                      var3.field_j = var3.field_j + 1;
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 > -18) {
          this.c((byte) 74);
        }
    }

    final pb b(int param0) {
        int var2 = 0;
        if (this.field_m == 11) {
          var2 = this.field_c;
          if (var2 >= e.field_g.length) {
            var2 = -1 + e.field_g.length;
          }
          return e.field_g[var2];
        }
        if (this.field_h < 0) {
          this.field_h = this.field_h + 256;
        }
        if (256 <= this.field_h) {
          this.field_h = this.field_h - 256;
        }
        if (this.field_m == -1) {
          return this.field_f[this.field_h / 4];
        }
        if (this.c((byte) 84) == 32) {
          return this.field_f[this.field_h / 8];
        }
        if (this.c((byte) 65) == 48) {
          return this.field_f[this.field_h / 2];
        }
        if (param0 != 640) {
          return (pb) null;
        }
        return this.field_f[0];
    }

    private final void b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = stellarshard.field_B;
        this.field_l = this.field_l + this.field_k;
        this.field_a = this.field_a + this.field_d;
        this.field_b = this.field_b + this.field_j;
        while (true) {
          if (this.field_b > 20) {
            stackIn_5_0 = ~this.field_b;
            stackIn_5_1 = -21;
            if (stackIn_5_0 < stackIn_5_1) {
              this.field_h = this.field_h + 1;
              this.field_b = this.field_b - 20;
              if (256 <= this.field_h) {
                this.field_h = this.field_h - 256;
              }
            }
            if (-20 <= this.field_b) {
              continue;
            }
            this.field_b = this.field_b + 20;
            this.field_h = this.field_h - 1;
            if (this.field_h >= 0) {
              continue;
            }
            this.field_h = this.field_h + 256;
            continue;
          }
          if (-20 > this.field_b) {
            stackIn_13_0 = ~this.field_b;
            stackIn_13_1 = -21;
            if (stackIn_13_0 < stackIn_13_1) {
              this.field_h = this.field_h + 1;
              this.field_b = this.field_b - 20;
              if (256 <= this.field_h) {
                this.field_h = this.field_h - 256;
              }
            }
            if (-20 <= this.field_b) {
              continue;
            }
            this.field_b = this.field_b + 20;
            this.field_h = this.field_h - 1;
            if (this.field_h >= 0) {
              continue;
            }
            this.field_h = this.field_h + 256;
            continue;
          }
          break;
        }
        var2 = 64;
        if (this.field_m == 14) {
          var2Lifetime1 = 128;
        }
        var2Lifetime2 = 256;
        if (this.field_a < (double)(-var2Lifetime2 - 320)) {
          this.field_a = this.field_a + (double)(640 + 2 * var2Lifetime2);
        }
        if (param0 != 124) {
          return;
        }
        if (this.field_a > (double)(var2Lifetime2 + 320)) {
          this.field_a = this.field_a - (double)(640 + 2 * var2Lifetime2);
        }
        if ((double)(-var2Lifetime2 - 240) > this.field_l) {
          this.field_l = this.field_l + (double)(480 + 2 * var2Lifetime2);
        }
        if ((double)(240 + var2Lifetime2) < this.field_l) {
          this.field_l = this.field_l - (double)(2 * var2Lifetime2 + 480);
        }
        return;
    }

    private final void c(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        sd dupTemp$4 = null;
        int var10_int = 0;
        int var11 = 0;
        qe stackIn_147_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        vl var7_ref_vl;
        sd var7_ref_sd;
        int var7_int;
        double var7;
        int var8;
        qe var8_ref_qe;
        int var9_int;
        double var9;
        qe var10;
        qe var12;
        int var13;
        vl var14;
        sd var15;
        var13 = stellarshard.field_B;
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 16777215;
        if (1 == this.field_m) {
          var5 = 8947848;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[9], 100, pk.field_h * 2);
          }
          var4 = 80;
          stellarshard.field_U[0] = stellarshard.field_U[0] + 1;
        }
        if (this.field_m == 3) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[16], 100, 2 * pk.field_h);
          }
          var5 = 16777215;
          var4 = 100;
          stellarshard.field_U[1] = stellarshard.field_U[1] + 1;
        }
        if (this.field_m == 5) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[13], 100, pk.field_h * 2);
          }
          var4 = 150;
          var5 = 8947967;
          stellarshard.field_U[3] = stellarshard.field_U[3] + 1;
        }
        if (0 == this.field_m) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[10], 100, pk.field_h * 2);
          }
          var5 = 8947848;
          var4 = 50;
        }
        if (this.field_m == 2) {
          var4 = 50;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[17], 100, 2 * pk.field_h);
          }
          var5 = 16777215;
        }
        if (this.field_m == 4) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[14], 100, 2 * pk.field_h);
          }
          var5 = 8947967;
          var4 = 50;
        }
        if (this.field_m == 8) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[11], 100, pk.field_h * 2);
          }
          var5 = 8947848;
          var4 = 10;
        }
        if (9 == this.field_m) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[18], 100, pk.field_h * 2);
          }
          var5 = 16777215;
          var4 = 10;
        }
        if (this.field_m == 10) {
          var4 = 10;
          var5 = 8947967;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[15], 100, pk.field_h * 2);
          }
        }
        if (this.field_m == 13) {
          fieldTemp$0 = ta.field_p;
          ta.field_p = ta.field_p + 1;
          if (fieldTemp$0 == 20) {
            hj.a(244, 11, 1);
          }
          var5 = 16711680;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
          }
          var4 = 100;
          stellarshard.field_U[4] = stellarshard.field_U[4] + 1;
        }
        if (this.field_m == 12) {
          fieldTemp$1 = ta.field_p;
          ta.field_p = ta.field_p + 1;
          if (fieldTemp$1 == 20) {
            hj.a(244, 11, 1);
          }
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
          }
          var4 = 100;
          var5 = 16711680;
          stellarshard.field_U[5] = stellarshard.field_U[5] + 1;
        }
        if (14 == this.field_m) {
          fieldTemp$2 = ta.field_p;
          ta.field_p = ta.field_p + 1;
          if (fieldTemp$2 == 20) {
            hj.a(244, 11, 1);
          }
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
          }
          var4 = 1000;
          var5 = 16711680;
          stellarshard.field_U[9] = stellarshard.field_U[9] + 1;
        }
        var6 = -40 / ((param0 - 63) / 34);
        if (this.field_m == 15) {
          fieldTemp$3 = sd.field_b;
          sd.field_b = sd.field_b + 1;
          if (fieldTemp$3 == 10) {
            hj.a(243, 12, 1);
          }
          var4 = 250;
          var5 = 16711680;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
          }
          stellarshard.field_U[9] = stellarshard.field_U[9] + 1;
        }
        if (this.field_m == 7) {
          var4 = 250;
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, 2 * pk.field_h);
          }
          var5 = 16711680;
        }
        if (6 == this.field_m) {
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[12], 100, pk.field_h * 2);
          }
          var4 = 250;
          var5 = 16711680;
        }
        if (this.field_m == 1) {
          var3 = 3;
          var2 = 0;
        }
        if (this.field_m == 0) {
          var2 = 8;
          var3 = 4;
        }
        if (this.field_m == 3) {
          var3 = 2;
          var2 = 2;
        }
        if (2 == this.field_m) {
          var3 = 2;
          var2 = 9;
        }
        if (this.field_m == 5) {
          var2 = 4;
          var3 = 2;
        }
        if (4 == this.field_m) {
          var3 = 10;
          var2 = 10;
        }
        if (this.field_m >= 0 &&
          8 >= this.field_m &&
          7 == this.field_m) {
          var3 = 4;
          var2 = 13;
        }
        if (this.field_m == 6) {
          var2 = 12;
          var3 = 4;
        }
        if (!this.a((byte) -91)) {
          var14 = new vl(2, this);
          var7_ref_vl = var14;
          var7_ref_vl.field_j = 0.0;
          var7_ref_vl.field_k = this.field_l;
          var7_ref_vl.field_a = 0.0;
          var7_ref_vl.field_c = this.field_a;
          var14.field_q = 16711680;
          wk.field_b[eg.a(-71)] = var14;
        }
        if (var4 > 0) {
          dupTemp$4 = new sd(var4, this, var5);
          var15 = dupTemp$4;
          var7_ref_sd = dupTemp$4;
          hf.field_e[ha.k(-1001)] = var15;
          if (4 == nc.field_H &&
            tb.field_K < 1000) {
            tb.field_K = tb.field_K + var4;
            if (tb.field_K >= 1000) {
              hj.a(254, 1, 1);
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m != 11 &&
          this.field_m != -1 &&
          nc.field_H != 4) {
          var7_int = dc.a(-118);
          if (var7_int <= -1) {
            if (pk.a(-12663, 0)) {
              if ((qi.field_a < q.field_a) &&
                (decompiledFrameRemainder0 = !(ph.field_D < 2))) {
                decompiledFrameRemainder0 = !(!si.field_jb[52]);
              }
              if (decompiledFrameRemainder0) {
                var8 = 1;
                var9_int = 0;
                for (var10_int = 0; var10_int < 1000; var10_int++) {
                  if (a.field_h[var10_int] != null) {
                    var9_int++;
                    if (a.field_h[var10_int].a((byte) -55)) {
                      var8 = 0;
                    }
                  }
                }
                if (var8 != 0) {
                  if (var9_int <= 30) {
                    if ((!(ph.field_D < 2)) &&
                      (si.field_jb[52])) {
                      q.field_a = q.field_a + 1;
                      stackIn_147_0 = new qe(11);
                      var10 = stackIn_147_0;
                      var10.field_c = 16;
                      var10.field_l = this.field_l;
                      var10.field_a = this.field_a;
                      a.field_h[pl.e((byte) 63)] = var10;
                    }
                  } else {
                    q.field_a = q.field_a + 1;
                    stackIn_147_0 = new qe(11);
                    var10 = stackIn_147_0;
                    var10.field_c = 16;
                    var10.field_l = this.field_l;
                    var10.field_a = this.field_a;
                    a.field_h[pl.e((byte) 63)] = var10;
                  }
                }
              }
            }
          } else {
            var8_ref_qe = new qe(11);
            var8_ref_qe.field_c = var7_int;
            var8_ref_qe.field_l = this.field_l;
            var8_ref_qe.field_a = this.field_a;
            if (var8_ref_qe.field_c == e.field_e) {
              b.a(var8_ref_qe.field_c, 6);
              var8_ref_qe.field_c = 8;
            }
            a.field_h[pl.e((byte) 63)] = var8_ref_qe;
          }
        }
        if (var3 > 0) {
          var7 = 0.0;
          var9 = 0.0;
          for (var11 = 0; var11 < var3; var11++) {
            var12 = new qe(var2);
            var12.field_l = this.field_l;
            var12.field_a = this.field_a;
            if (var3 - 1 <= var11 &&
              var2 != 10) {
              var12.field_d = -var7;
              var12.field_k = -var9;
            } else {
              var9 = var9 + var12.field_k;
              var7 = var7 + var12.field_d;
            }
            var12.field_d = var12.field_d + (double)this.field_n * this.field_d / (double)(var3 * var12.field_n);
            var12.field_k = var12.field_k + this.field_k * (double)this.field_n / (double)(var3 * var12.field_n);
            a.field_h[pl.e((byte) 63)] = var12;
          }
        }
    }

    private final void a(int param0, int param1) {
        double var3;
        double var5;
        int var7;
        if (param0 != 100) {
          this.field_d = 0.12426570427502562;
        }
        if (fe.field_e &&
          a.field_h[0] != null) {
          var3 = this.field_a - a.field_h[0].field_a;
          var5 = -a.field_h[0].field_l + this.field_l;
          var7 = 128;
          if (var3 != 0.0 ||
            var5 != 0.0) {
            var7 = (int)(2560.0 / Math.sqrt(var5 * var5 + var3 * var3));
          }
          if (var7 > 128) {
            var7 = 128;
          }
          if (param1 == 0 ||
            param1 == 1 ||
            param1 == 8) {
            ll.field_c.a(sb.field_e[2], 100, var7 * pk.field_h / 50);
          }
          if (param1 == 2 ||
            param1 == 3 ||
            param1 == 9) {
            ll.field_c.a(sb.field_e[4], 100, var7 * pk.field_h / 50);
          }
          if (param1 == 4 ||
            5 == param1 ||
            10 == param1) {
            ll.field_c.a(sb.field_e[3], 100, pk.field_h * var7 / 50);
          }
          if (param1 == -1) {
            ll.field_c.a(sb.field_e[40], 100, pk.field_h);
          }
        }
    }

    final int c(byte param0) {
        if (param0 <= 34) {
          this.field_j = 36;
        }
        if (this.field_m >= 0 &&
          this.field_m < 8) {
          return 48;
        }
        return 32;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_l = this.field_l - (double)param2;
        this.field_a = this.field_a - (double)param1;
        if (param0 > -102) {
          this.field_l = 1.4581035574663785;
        }
    }

    final static int a(byte param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -10) {
            stackIn_2_0 = -37;
            return stackIn_2_0;
          }
          if (!param2) {
            stackIn_7_0 = pe.field_c.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = mj.field_E.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qe.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          String var3 = null;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param1 <= ae.field_N.field_k) {
            return true;
          }
          if (null == ob.field_b) {
            return false;
          }
          try {
            var2_int = ob.field_b.b(-111);
            if (param0 != 64) {
              var3 = (String) null;
              qe.$cfr$intArgs$a$590e95718a07(101, (String) null, false);
            }
            if (var2_int > 0) {
              if (-ae.field_N.field_k + param1 < var2_int) {
                var2_int = -ae.field_N.field_k + param1;
              }
              ob.field_b.a(ae.field_N.field_k, (byte) -64, ae.field_N.field_r, var2_int);
              ka.field_o = ih.a((byte) -98);
              ae.field_N.field_k = ae.field_N.field_k + var2_int;
              if (ae.field_N.field_k < param1) {
                return false;
              }
              ae.field_N.field_k = 0;
              return true;
            }
            if (var2_int >= 0 &&
              tk.b(param0 + 61) <= 30000L) {
              return false;
            }
            oj.c(-2290);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            oj.c(-2290);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qe(int param0) {
        int stackIn_3_1 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_1 = 0;
        int stackIn_39_1 = 0;
        double var2;
        double var4;
        this.field_j = 0;
        this.field_m = param0;
        this.field_i = 0;
        this.field_b = 0;
        this.field_c = 0;
        this.field_h = (int)(Math.random() * 256.0);
        this.field_l = 0.0;
        this.field_d = 0.0;
        this.field_a = 0.0;
        this.field_n = 100;
        this.field_k = 0.0;
        var2 = 2.0 * (3.141592653589793 * Math.random());
        var4 = 100.0 * (Math.random() * 0.5 + 0.5);
        if (qi.field_a >= 2) {
          stackIn_3_1 = 2;
        } else {
          stackIn_3_1 = qi.field_a;
        }
        this.field_g = stackIn_3_1;
        if (param0 == -1) {
          this.field_g = 1;
        }
        if (param0 == 0) {
          if (qi.field_a >= 6) {
            stackIn_9_1 = 6;
          } else {
            stackIn_9_1 = qi.field_a;
          }
          this.field_g = stackIn_9_1;
        }
        if (2 == param0) {
          if (qi.field_a < 8) {
            stackIn_14_1 = qi.field_a;
          } else {
            stackIn_14_1 = 8;
          }
          this.field_g = stackIn_14_1;
        }
        if (4 == param0) {
          if (4 > qi.field_a) {
            stackIn_19_1 = qi.field_a;
          } else {
            stackIn_19_1 = 4;
          }
          this.field_g = stackIn_19_1;
        }
        if (param0 == 1) {
          if (qi.field_a >= 8) {
            stackIn_24_1 = 8;
          } else {
            stackIn_24_1 = qi.field_a;
          }
          this.field_g = stackIn_24_1;
        }
        if (param0 == 3) {
          if (8 <= qi.field_a) {
            stackIn_29_1 = 16;
          } else {
            stackIn_29_1 = 2 * qi.field_a;
          }
          this.field_g = stackIn_29_1;
        }
        if (param0 == 5) {
          if (6 <= qi.field_a) {
            stackIn_34_1 = 6;
          } else {
            stackIn_34_1 = qi.field_a;
          }
          this.field_g = stackIn_34_1;
        }
        if (param0 == 9) {
          if (qi.field_a >= 4) {
            stackIn_39_1 = 4;
          } else {
            stackIn_39_1 = qi.field_a;
          }
          this.field_g = stackIn_39_1;
        }
        if (param0 == 10) {
          this.field_g = 1;
        }
        if (param0 == 11) {
          this.field_g = 50;
        }
        if (param0 == 14) {
          this.field_g = 50;
          this.field_n = 1000;
        }
        if (param0 == 12) {
          this.field_n = 200;
          this.field_g = 1 + qi.field_a / 6;
          this.field_h = (int)(Math.random() * 256.0);
        }
        if (param0 == 13) {
          this.field_n = 200;
          this.field_g = qi.field_a / 6 + 1;
          this.field_h = (int)(Math.random() * 256.0);
        }
        if (param0 == 15) {
          this.field_g = qi.field_a / 6 + 3;
          this.field_n = 100;
          this.field_h = (int)(256.0 * Math.random());
        }
        if (param0 == 6) {
          this.field_g = 10 + qi.field_a / 5;
          this.field_n = 150;
          this.field_h = (int)(256.0 * Math.random());
        }
        if (param0 == 7) {
          this.field_g = 10 + qi.field_a / 5;
          this.field_n = 150;
          this.field_h = (int)(Math.random() * 256.0);
        }
        if (param0 < 0) {
          this.field_f = cm.field_d;
        }
        if (0 <= param0 &&
          param0 < 8) {
          this.field_f = fe.field_d[param0];
        }
        if (8 <= param0) {
          this.field_f = rd.field_a[-8 + param0];
        }
        if (param0 == 0 ||
          param0 == 2 ||
          4 == param0) {
          this.field_j = 5;
          this.field_h = (int)(Math.random() * 256.0);
          this.field_n = 100;
        }
        if (param0 == 8 ||
          9 == param0) {
          this.field_j = 7;
          this.field_h = (int)(256.0 * Math.random());
          this.field_n = 50;
        }
        if (param0 == 1 ||
          param0 == 3 ||
          param0 == 5) {
          this.field_j = 3;
          this.field_h = (int)(256.0 * Math.random());
          this.field_n = 200;
        }
        if (param0 == 10) {
          this.field_j = 10;
          this.field_h = (int)(Math.random() * 256.0);
          this.field_n = 25;
        }
        if (param0 < 0) {
          this.field_k = 0.0;
          this.field_a = 0.0;
          this.field_d = 0.0;
          this.field_l = 0.0;
        } else {
          this.field_d = var4 * Math.sin(var2) / (double)this.field_n;
          this.field_k = Math.cos(var2) * var4 / (double)this.field_n;
          if (!(Math.random() < 0.5)) {
            this.field_l = 0.0;
            this.field_a = Math.random() * 1152.0;
          } else {
            this.field_a = 0.0;
            this.field_l = Math.random() * 992.0;
          }
          this.field_a = this.field_a + (double)(1152 * (int)(2.0 * Math.random()) - 576);
          this.field_l = this.field_l + (double)(-496 + 992 * (int)(Math.random() * 2.0));
        }
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$590e95718a07(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -10) {
            stackIn_2_0 = -37;
            return stackIn_2_0;
          }
          if (!param2) {
            stackIn_7_0 = pe.field_c.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = mj.field_E.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qe.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }
}
