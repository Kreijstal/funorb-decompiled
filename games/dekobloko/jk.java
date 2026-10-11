/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static String field_a;
    static int field_e;
    private int[] field_d;
    static String field_g;
    static int field_c;
    private int[] field_f;
    private byte[] field_b;

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (eh.field_a > 0) {
          if (li.field_b == null) {
            cl.field_v = sg.a(640, lf.field_e, 0, 0, 82, 480);
          } else {
            cl.field_v = li.field_b.c(27134);
            p.a(2, (byte) -30);
          }
          if (null == cl.field_v) {
            var2 = 3;
          } else {
            hl.a(cl.field_v, (byte) -42);
            var2 = 2;
          }
        } else {
          var2 = (ph.n(-30146)) ? 0 : 1;
        }
        if (param0 != 2) {
          field_e = -30;
        }
        if (li.field_b == null &&
          ij.field_e) {
          bl.a(param0 - 73, var2, param1);
        }
    }

    public static void a(byte param0) {
        int var1 = -5 % ((-29 - param0) / 55);
        field_g = null;
        field_a = null;
    }

    final int a(int param0, byte param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        var11 = client.field_A ? 1 : 0;
        try {
          if (param5 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param1 <= 86) {
            jk.a(-83, true);
          }
          param5 = param5 + param2;
          var7_int = 0;
          var8 = param0;
          L3: while (true) {
            var9 = param4[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$0 = this.field_f[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param5 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_f[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_f[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param5 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$6 = this.field_f[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param5 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (8 & var9)) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_f[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param5 <= param2) {
                return var8 - (-1 + param0);
              }
              var7_int = 0;
            }
            if ((4 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$10 = this.field_f[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param5 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$12 = this.field_f[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param2;
              param2++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_f[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param5 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = var8 - (-1 + param0);
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("jk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
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
        var15 = client.field_A ? 1 : 0;
        try {
          if (param5 != 8) {
            field_c = -58;
          }
          var7_int = 0;
          var8 = param3 << 3;
          param2 = param2 + param4;
          while (true) {
            if (param2 <= param4) {
              stackIn_17_0 = -param3 + (var8 + 7 >> 3);
              return stackIn_17_0;
            }
            var9 = 255 & param1[param4];
            var10 = this.field_d[var9];
            var11 = this.field_b[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (var13 + (var11 - 1) >> 3);
            var13 += 24;
            dupTemp$0 = de.b(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param0[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param0[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param0[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param0[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 << -var13;
                    param0[var12] = (byte)(var10 << -var13);
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
          stackIn_20_0 = var7;
          stackIn_20_1 = new StringBuilder().append("jk.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    jk(byte[] param0) {
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
          this.field_b = param0;
          this.field_d = new int[var2_int];
          this.field_f = new int[8];
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
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_d[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var8 | var7;
                var10 = -1 + var6;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (~var8 != ~var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var12 & var11) != 0) {
                    var3[var10] = var3[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = de.b(var11, var12);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[var6 - 1];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (var8 == var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var12Lifetime1 & var8) == 0) {
                  var10Lifetime2++;
                } else {
                  if (this.field_f[var10Lifetime2] == 0) {
                    this.field_f[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_f[var10Lifetime2];
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (this.field_f.length <= var10Lifetime2) {
                  var13 = new int[2 * this.field_f.length];
                  for (var14 = 0; var14 < this.field_f.length; var14++) {
                    var13[var14] = this.field_f[var14];
                  }
                  this.field_f = var13;
                }
              }
              if (var10Lifetime2 >= var4) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_f[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("jk.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
        field_g = "Names can only contain letters, numbers, spaces and underscores";
    }
}
