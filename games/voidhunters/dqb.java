/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dqb {
    private int[] field_d;
    private byte[] field_a;
    static String field_c;
    private int[] field_b;

    final int b(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
        var15 = VoidHunters.field_G;
        try {
          var7_int = 0;
          if (param3 <= 1) {
            var16 = (byte[]) null;
            this.a(15, (byte[]) null, (byte[]) null, 34, 99, 31);
          }
          param0 = param0 + param5;
          var8 = param4 << 3;
          while (true) {
            if (param5 >= param0) {
              stackIn_21_0 = (7 + var8 >> 3) - param4;
              return stackIn_21_0;
            }
            var9 = 255 & param1[param5];
            var10 = this.field_d[var9];
            var11 = this.field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (var11 + (var13 - 1) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = knb.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param2[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var13 -= 8;
              var12++;
              var7_int = var10 >>> var13;
              param2[var12] = (byte)(var10 >>> var13);
              if (var14 > var12) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param2[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 << -var13;
                    param2[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("dqb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -1) {
            var3 = (String) null;
            dqb.a((byte) 2, (String) null);
          }
          stackIn_3_0 = cja.field_j.a(param1, true, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    dqb(byte[] param0) {
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
          this.field_a = param0;
          this.field_d = new int[var2_int];
          this.field_b = new int[8];
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
              if (0 == (var8 & var7)) {
                var9 = var8 | var7;
                var10 = -1 + var6;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (~var11 != ~var8) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << -var10 + 32;
                  if ((var11 & var12) != 0) {
                    var3[var10] = var3[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = knb.a(var11, var12);
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
              for (var10Lifetime1 = 1 + var6; 32 >= var10Lifetime1; var10Lifetime1++) {
                if (~var8 == ~var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 == (var12Lifetime1 & var8)) {
                  var10Lifetime2++;
                } else {
                  if (this.field_b[var10Lifetime2] == 0) {
                    this.field_b[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_b[var10Lifetime2];
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (this.field_b.length <= var10Lifetime2) {
                  var13 = new int[this.field_b.length * 2];
                  for (var14 = 0; this.field_b.length > var14; var14++) {
                    var13[var14] = this.field_b[var14];
                  }
                  this.field_b = var13;
                }
              }
              if (var10Lifetime2 >= var4) {
                var4 = var10Lifetime2 + 1;
              }
              this.field_b[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("dqb.<init>(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 15060) {
          String var2 = (String) null;
          dqb.a((byte) 32, (String) null);
        }
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
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
        var11 = VoidHunters.field_G;
        try {
          if (param3 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = param4;
          param3 = param3 + param0;
          var8 = param5;
          L2: while (true) {
            var9 = param1[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param0;
              param0++;
              param2[incrementValue$1] = (byte)(~var10);
              if (param3 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param0;
              param0++;
              param2[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param3 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param0;
              param0++;
              param2[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param0;
              param0++;
              param2[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (8 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param0;
              param0++;
              param2[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param0 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param0;
              param0++;
              param2[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 2) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param0;
              param0++;
              param2[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 <= param0) {
                return var8 + 1 - param5;
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param0;
              param0++;
              param2[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param0 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = var8 + 1 - param5;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("dqb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_c = "Grappling hook launcher";
    }
}
