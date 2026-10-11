/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ee field_b;
    private byte[] field_d;
    private int[] field_c;
    static ee field_a;
    static String field_e;
    private int[] field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
          il.a(56);
        }
        field_b = null;
        field_e = null;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, byte param4, int param5) {
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
        int stackIn_4_0 = 0;
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
        var11 = BachelorFridge.field_y;
        try {
          if (0 == param0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param4 != -69) {
            field_a = (ee) null;
          }
          var7_int = 0;
          param0 = param0 + param2;
          var8 = param5;
          L3: while (true) {
            var9 = param1[var8];
            if (var9 < 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param2;
              param2++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param0) {
                break L3;
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
            if (0 > dupTemp$6) {
              incrementValue$7 = param2;
              param2++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (0 > dupTemp$8) {
              incrementValue$9 = param2;
              param2++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param0) {
                break L3;
              }
              var7_int = 0;
            }
            if ((4 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 2) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 <= param2) {
                return -param5 + 1 + var8;
              }
              var7_int = 0;
            }
            if (0 != (1 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param0 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = -param5 + 1 + var8;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("il.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
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
        var15 = BachelorFridge.field_y;
        try {
          var7_int = 0;
          param1 = param1 + param4;
          var8 = param5 << 3;
          if (param2 != 20857) {
            this.field_f = (int[]) null;
          }
          while (true) {
            if (param1 <= param4) {
              stackIn_16_0 = -param5 + (7 + var8 >> 3);
              return stackIn_16_0;
            }
            var9 = param0[param4] & 255;
            var10 = this.field_f[var9];
            var11 = this.field_d[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = (-1 + (var11 + var13) >> 3) + var12;
            var13 += 24;
            dupTemp$0 = mp.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param3[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 << -var13;
                    param3[var12] = (byte)(var10 << -var13);
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
          stackIn_19_1 = new StringBuilder().append("il.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    il(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
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
          this.field_d = param0;
          this.field_f = new int[var2_int];
          this.field_c = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_f[var5] = var8;
              if ((var8 & var7) == 0) {
                for (var10 = var6 - 1; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (~var8 == ~var11) {
                    var12 = 1 << 32 - var10;
                    if ((var12 & var11) == 0) {
                      var3[var10] = mp.a(var12, var11);
                      continue;
                    }
                    var3[var10] = var3[-1 + var10];
                  }
                  break;
                }
                var9 = var7 | var8;
              } else {
                var9 = var3[var6 - 1];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var8 == ~var17[var10Lifetime1]) {
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
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (var10Lifetime2 >= this.field_c.length) {
                  var13 = new int[this.field_c.length * 2];
                  for (var14 = 0; this.field_c.length > var14; var14++) {
                    var13[var14] = this.field_c[var14];
                  }
                  this.field_c = var13;
                }
              }
              if (var4 <= var10Lifetime2) {
                var4 = var10Lifetime2 + 1;
              }
              this.field_c[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("il.<init>(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    static {
        field_e = "<%0> has joined your game.";
    }
}
