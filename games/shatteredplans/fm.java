/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_f;
    private int[] field_a;
    static bi[] field_d;
    static bi field_e;
    static bi field_b;
    static int[] field_c;
    private byte[] field_h;
    private int[] field_g;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > ~es.field_m) {
          if (null == bh.field_p) {
            bj.field_K = si.a(640, fa.field_W, 0, (byte) 98, 0, 480);
          } else {
            bj.field_K = bh.field_p.a(0);
            vr.a(param1 - 15468, 2);
          }
          if (null == bj.field_K) {
            var2 = 3;
          } else {
            re.a(bj.field_K, false);
            var2 = 2;
          }
        } else {
          var2 = (w.d(true)) ? 0 : 1;
        }
        if (null == bh.field_p &&
          cp.field_u) {
          gm.a(param0, 125, var2);
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 == param2) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param3 != 7) {
            field_b = (bi) null;
          }
          var7_int = 0;
          param2 = param2 + param5;
          var8 = param4;
          L3: while (true) {
            var9 = param1[var8];
            if (var9 < 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_g[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param5 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((64 & var9) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_g[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param5;
              param5++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 <= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$4 = this.field_g[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param5;
              param5++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 <= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 16)) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_g[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param5;
              param5++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param5 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_g[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param5;
              param5++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param5 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_g[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param5;
              param5++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 <= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_g[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_g[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param5;
              param5++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 <= param5) {
                return 1 + var8 - param4;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 1)) {
              var7_int++;
            } else {
              var7_int = this.field_g[var7_int];
            }
            dupTemp$14 = this.field_g[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param5;
              param5++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param5 >= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_69_0 = 1 + var8 - param4;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("fm.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var7_int = 0;
          var8 = param1 << 3;
          param5 = param5 + param4;
          while (true) {
            if (param4 >= param5) {
              if (param2 == -6309) {
                stackIn_23_0 = (var8 + 7 >> 3) - param1;
                return stackIn_23_0;
              }
              stackIn_21_0 = 112;
              return stackIn_21_0;
            }
            var9 = param0[param4] & 255;
            var10 = this.field_a[var9];
            var11 = this.field_h[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (-1 + (var11 + var13) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = ee.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
            if (var12 < var14) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param3[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var14 > var12) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param3[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("fm.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 < 58) {
          field_c = (int[]) null;
        }
        field_b = null;
    }

    fm(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
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
          this.field_a = new int[var2_int];
          this.field_h = param0;
          this.field_g = new int[8];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << 32 - var6;
              var8 = var17[var6];
              this.field_a[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var8 | var7;
                var10 = -1 + var6;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (var8 != var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << -var10 + 32;
                  if (0 != (var11 & var12)) {
                    var3[var10] = var3[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = ee.a(var12, var11);
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
                if (0 != (var12Lifetime1 & var8)) {
                  if (this.field_g[var10Lifetime2] == 0) {
                    this.field_g[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_g[var10Lifetime2];
                } else {
                  var10Lifetime2++;
                }
                if (var10Lifetime2 >= this.field_g.length) {
                  var13 = new int[this.field_g.length * 2];
                  for (var14 = 0; this.field_g.length > var14; var14++) {
                    var13[var14] = this.field_g[var14];
                  }
                  this.field_g = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              if (var10Lifetime2 >= var4) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_g[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("fm.<init>(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
    }
}
