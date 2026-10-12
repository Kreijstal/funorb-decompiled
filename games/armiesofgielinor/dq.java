/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] field_h;
    static int field_c;
    private byte[] field_a;
    static RgbSprite[] field_i;
    static ru[] field_e;
    private int[] field_b;

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 76 % ((param0 - 52) / 39);
        var3 = param1;
        var4 = param1;
        if (1 == var4) {
          var3Lifetime1 = 2;
        } else {
          if (var4 != 2) {
            if (var4 != 3) {
              var3Lifetime1 = (var4 == 4) ? 3 : param1;
            } else {
              var3Lifetime1 = 4;
            }
          } else {
            var3Lifetime1 = 1;
          }
        }
        return var3Lifetime1;
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != -1) {
          field_d = (String) null;
        }
        field_i = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        try {
          if (param3) {
            no.field_P.field_y = SoftwareRaster.field_l;
            no.field_P.field_B = SoftwareRaster.field_d;
            no.field_P.field_v = SoftwareRaster.field_g;
            ku.field_J.b();
            SoftwareRaster.b();
            gq.b(bc.field_j[3][0], 0, 0, param1);
            fe.c(DeployRequest.a(param2, (byte) 42), uh.field_e[3][0] >> 1, 20 + (uh.field_e[3][1] >> 1), 2, true);
            no.field_P.b();
            ku.field_J.h(param0, param5);
          } else {
            gq.b(bc.field_j[3][0], param0, param5, param1);
            fe.c(DeployRequest.a(param2, (byte) 42), (uh.field_e[3][0] >> 1) + param0, 20 + (uh.field_e[3][1] >> 1) + param5, 2, true);
          }
          int var6_int = 67 % ((param4 - 48) / 53);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "dq.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 7) {
            stackIn_4_0 = ob.a(10, true, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -59;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, byte param5) {
        int dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
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
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = 0;
          var8 = param4 << 3;
          param2 = param2 + param0;
          if (param5 < 24) {
            stackIn_3_0 = -2;
            return stackIn_3_0;
          }
          while (true) {
            if (param0 >= param2) {
              stackIn_20_0 = (var8 + 7 >> 3) - param4;
              return stackIn_20_0;
            }
            var9 = param1[param0] & 255;
            var10 = this.field_h[var9];
            var11 = this.field_a[var9];
            if (0 == var11) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (var11 + (var13 - 1) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = oe.c(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
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
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("dq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    dq(byte[] param0) {
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
          this.field_h = new int[var2_int];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_b = new int[8];
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_h[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var8 | var7;
                var10 = var6 - 1;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (~var8 != ~var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << -var10 + 32;
                  if ((var11 & var12) != 0) {
                    var3[var10] = var3[-1 + var10];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = oe.c(var11, var12);
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
              for (var10Lifetime1 = 1 + var6; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var8 == ~var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var8 & var12Lifetime1) != 0) {
                  if (0 == this.field_b[var10Lifetime2]) {
                    this.field_b[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_b[var10Lifetime2];
                } else {
                  var10Lifetime2++;
                }
                if (var10Lifetime2 >= this.field_b.length) {
                  var13 = new int[this.field_b.length * 2];
                  for (var14 = 0; var14 < this.field_b.length; var14++) {
                    var13[var14] = this.field_b[var14];
                  }
                  this.field_b = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              if (var4 <= var10Lifetime2) {
                var4 = 1 + var10Lifetime2;
              }
              this.field_b[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("dq.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, boolean param2, int param3, int param4, byte[] param5) {
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
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param2) {
            this.field_a = (byte[]) null;
          }
          param3 = param3 + param4;
          var7_int = 0;
          var8 = param1;
          scanLoop1: while (true) {
            var9 = param0[var8];
            if (0 > var9) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param4;
              param4++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param3 <= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 <= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 <= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((8 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 >= param3) {
                return 1 + (var8 - param1);
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param4 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param4;
              param4++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 1)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = 1 + (var8 - param1);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("dq.F(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}
