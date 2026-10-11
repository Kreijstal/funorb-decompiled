/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static String field_b;
    static String field_f;
    private byte[] field_a;
    private int[] field_c;
    static int field_e;
    static String field_g;
    private int[] field_d;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 != 0) {
          field_g = (String) null;
        }
    }

    ks(byte[] param0) {
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
          this.field_a = param0;
          this.field_d = new int[var2_int];
          this.field_c = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (0 != var6) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_d[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var7 | var8;
                var10 = -1 + var6;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (var8 != var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var11 & var12) != 0) {
                    var3[var10] = var3[-1 + var10];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = hf.a(var11, var12);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var17[var10Lifetime1] == ~var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var8 & var12Lifetime1) == 0) {
                  var10Lifetime2++;
                } else {
                  if (0 == this.field_c[var10Lifetime2]) {
                    this.field_c[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_c[var10Lifetime2];
                }
                if (this.field_c.length <= var10Lifetime2) {
                  var13 = new int[2 * this.field_c.length];
                  for (var14 = 0; this.field_c.length > var14; var14++) {
                    var13[var14] = this.field_c[var14];
                  }
                  this.field_c = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              if (var10Lifetime2 >= var4) {
                var4 = var10Lifetime2 + 1;
              }
              this.field_c[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("ks.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
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
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var11 = Kickabout.field_G;
        try {
          if (param2 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          param2 = param2 + param4;
          if (param5) {
            this.field_a = (byte[]) null;
          }
          var8 = param0;
          L3: while (true) {
            var9 = param3[var8];
            if (var9 < 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param4;
              param4++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param2 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 <= param4) {
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
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 >= param2) {
                break L3;
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
            if (0 > dupTemp$8) {
              incrementValue$9 = param4;
              param4++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 4)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 <= param4) {
                return var8 + 1 - param0;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 2)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 <= param4) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = var8 + 1 - param0;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("ks.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static short a(int param0, int param1, int param2, int param3) {
        int var4 = -3 / ((param2 - 23) / 41);
        return (short)(param0 | (param1 << 10 | param3 << 7));
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var15 = Kickabout.field_G;
        try {
          var7_int = 0;
          var8 = param2 << 3;
          param1 = param1 + param5;
          while (true) {
            if (param1 <= param5) {
              if (param0 == -1) {
                stackIn_22_0 = -param2 + (var8 + 7 >> 3);
                return stackIn_22_0;
              }
              stackIn_20_0 = -15;
              return stackIn_20_0;
            }
            var9 = param4[param5] & 255;
            var10 = this.field_d[var9];
            var11 = this.field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = (var13 - (-var11 + 1) >> 3) + var12;
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = hf.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var13 -= 8;
              var12++;
              var7_int = var10 >>> var13;
              param3[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var13 -= 8;
                var12++;
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
                    var7_int = var10 << -var13;
                    param3[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ks.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = "+";
        field_f = "(next round starts in <%0> seconds)";
    }
}
