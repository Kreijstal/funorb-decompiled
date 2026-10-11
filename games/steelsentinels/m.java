/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static String field_g;
    static SceneWidget field_d;
    private int[] field_f;
    private byte[] field_e;
    private int[] field_c;
    static int[][] field_b;
    static String[] field_j;
    static SceneWidget field_i;
    static boolean[] field_h;
    static int field_a;

    m(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_e = param0;
          this.field_f = new int[var2_int];
          this.field_c = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param0[var5];
            if (0 != var6) {
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_f[var5] = var8;
              if ((var7 & var8) == 0) {
                for (var10 = -1 + var6; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (~var11 == ~var8) {
                    var12 = 1 << 32 - var10;
                    if ((var11 & var12) == 0) {
                      var3[var10] = vn.a(var11, var12);
                      continue;
                    }
                    var3[var10] = var3[var10 - 1];
                  }
                  break;
                }
                var9 = var7 | var8;
              } else {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = 1 + var6; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var17[var10Lifetime1] == ~var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var12Lifetime1 & var8) == 0) {
                  var10Lifetime2++;
                } else {
                  if (this.field_c[var10Lifetime2] == 0) {
                    this.field_c[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_c[var10Lifetime2];
                }
                if (var10Lifetime2 >= this.field_c.length) {
                  var13 = new int[this.field_c.length * 2];
                  for (var14 = 0; var14 < this.field_c.length; var14++) {
                    var13[var14] = this.field_c[var14];
                  }
                  this.field_c = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              this.field_c[var10Lifetime2] = ~var5;
              if (var10Lifetime2 >= var4) {
                var4 = var10Lifetime2 + 1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("m.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = SteelSentinels.obfuscationControl;
        try {
          if (param2 != 7786) {
            field_d = (SceneWidget) null;
          }
          var6_int = 1021128;
          var7 = param1 - 6;
          var8 = param3 + 3;
          var9 = param0 - 6;
          var10 = 3 + param5;
          var11 = var7 * param4 / 12200;
          fk.field_d.c("<img=1>", param3, param5 + param0, 1021128, -1);
          if (param4 > 12200) {
            var6_int = 1044724;
            var11 = var7;
          }
          SoftwareRaster.a(var8, var10, var11, var9, var6_int);
          SoftwareRaster.h(param3, param5, param1, param0, 4408131);
          SoftwareRaster.d(6100 * param1 / 12200 + param3, param5, param0, 4408131);
          var12 = ej.field_C;
          var13 = param3 + param1 / 4;
          var14 = 6100 < param4 ? 4210752 : 1400960;
          for (var15_int = 0; var15_int < 2; var15_int++) {
            SoftwareRaster.d(var13 - var7 / 4, -4 + param5, 3, var14);
            SoftwareRaster.d(var7 / 4 + var13, -4 + param5, 3, var14);
            SoftwareRaster.g(var13 - var7 / 4, -4 + param5, var7 / 2, var14);
            SoftwareRaster.d(var13 - var7 / 4, param5 + (param0 + 1), 2, var14);
            SoftwareRaster.d(var13 + var7 / 4, param5 + param0 + 1, 2, var14);
            SoftwareRaster.g(var13 - var7 / 4, 3 + (param5 + param0), var7 / 2, var14);
            fk.field_d.a(var12, var13, -5 + param5, var14, -1);
            var14 = param4 > 6100 ? 1400960 : 4210752;
            var12 = fi.field_z;
            var13 = var13 + param1 / 2;
          }
          if (oh.field_f >= param3 &&
            oh.field_f < param1 + param3 &&
            param5 <= pi.field_c &&
            pi.field_c < param0 + param5) {
            var15 = 6100 < param4 ? fi.field_z : ej.field_C;
            var16 = db.a(bf.field_zb, param2 - 7846, new String[]{Integer.toString(param4), var15});
            var17 = param3 + param1 / 2;
            var18 = param5 - 18;
            var19 = 8 + fk.field_d.c(var16);
            var20 = 13;
            var17 = var17 - var19 / 2;
            SoftwareRaster.c(var17 - 4, var18, var19, var20, 0, 192);
            SoftwareRaster.h(-4 + var17, var18, var19, var20, 1400960, 192);
            fk.field_d.b(var16, var17, var18 + 10, 41727, -1);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "m.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (param1 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param2 != 4408131) {
            stackIn_6_0 = 15;
            return stackIn_6_0;
          }
          param1 = param1 + param3;
          var7_int = 0;
          var8 = param5;
          scanLoop1: while (true) {
            var9 = param4[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param3;
              param3++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param1 <= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param3;
              param3++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 <= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 != (32 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param3;
              param3++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 >= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param3;
              param3++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param1 <= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((8 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param3;
              param3++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 <= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 4)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (0 > dupTemp$10) {
              incrementValue$11 = param3;
              param3++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param1 <= param3) {
                return -param5 + (var8 + 1);
              }
              var7_int = 0;
            }
            if (0 != (2 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param3;
              param3++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 >= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param3;
              param3++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 >= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = -param5 + (var8 + 1);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("m.D(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        field_b = (int[][]) null;
        if (param0 != 64) {
          return;
        }
        field_d = null;
        field_j = null;
        field_g = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = SteelSentinels.obfuscationControl;
        try {
          var7_int = 0;
          param5 = param5 + param4;
          var8 = param0 << 3;
          while (true) {
            if (param5 <= param4) {
              if (param2 <= 114) {
                var16 = (byte[]) null;
                this.a(-84, (byte[]) null, -104, (byte[]) null, 31, 47);
              }
              stackIn_16_0 = (7 + var8 >> 3) - param0;
              return stackIn_16_0;
            }
            var9 = param3[param4] & 255;
            var10 = this.field_f[var9];
            var11 = this.field_e[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = (-1 + var11 + var13 >> 3) + var12;
            var13 += 24;
            dupTemp$0 = vn.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param1[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var13 -= 8;
              var12++;
              var7_int = var10 >>> var13;
              param1[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param1[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param1[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param1[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            var8 = var8 + var11;
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("m.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 126) {
            field_j = (String[]) null;
          }
          stackIn_3_0 = ne.a((byte) -118, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("m.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Yes";
    }
}
