/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends hs {
    private int[] field_L;
    private int field_T;
    static String field_P;
    private int field_R;
    private int[] field_S;
    private int[] field_K;
    private int field_N;
    int field_Q;
    static volatile int field_J;
    static String[] field_M;
    static String field_O;

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        if (obfuscationGuard != 8192) {
          field_J = 99;
        }
        super.setBounds(x, width, y, obfuscationGuard + 0, height);
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 0) {
          return;
        }
        int var4 = null != this.field_K ? this.field_K.length : 0;
        int[] var5 = new int[param0 * var4];
        if (this.field_L != null &&
          0 < this.field_L.length &&
          0 < var5.length &&
          param1 > 0) {
          vm.a(this.field_L, 0, var5, 0, var4 * Math.min(param1, param0));
        }
        this.field_L = var5;
    }

    private final void a(int param0, byte param1, Widget param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var15Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = this.field_K[-1 + this.field_K.length];
          var6 = this.field_S[this.field_S.length - 1];
          stackIn_3_0 = this.width;
          if (param3 > 0) {
            stackIn_4_1 = this.field_K[param3 - 1];
          } else {
            stackIn_4_1 = 0;
          }
          var7 = stackIn_3_0 * stackIn_4_1 / var5_int;
          if (param0 <= 0) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_S[-1 + param0];
          }
          var8 = stackIn_7_0 * this.height / var6;
          var9 = this.field_K[param3] * this.width / var5_int;
          var10 = this.height * this.field_S[param0] / var6;
          var11 = param0 * this.field_K.length + param3;
          var12 = 48 & this.field_L[var11];
          var13 = 192 & this.field_L[var11];
          var14 = param2.x;
          if (param1 != 65) {
            return;
          }
          var15 = param2.y;
          var16 = param2.width;
          var17 = param2.height;
          if (var9 - var7 > var16 &&
            (this.field_L[var11] & 1) != 0) {
            var16 = -var7 + var9;
            var14Lifetime1 = var7;
          } else if (var16 > -var7 + var9 &&
            0 != (this.field_L[var11] & 4)) {
            var14Lifetime1 = var7;
            var16 = -var7 + var9;
          } else {
            if (var12 != 16) {
              if (32 != var12) {
                var14Lifetime1 = var7;
              } else {
                var14Lifetime1 = var9 - var16;
              }
            } else {
              var14Lifetime1 = var7 - (-var9 + var16) >> 1;
            }
          }
          if (var17 < var10 - var8 &&
            (this.field_L[var11] & 2) != 0) {
            var15Lifetime1 = var8;
            var17 = var10 - var8;
          } else if (var17 > -var8 + var10 &&
            (8 & this.field_L[var11]) != 0) {
            var17 = var10 - var8;
            var15Lifetime1 = var8;
          } else {
            if (64 == var13) {
              var15Lifetime1 = -var17 + var8 + var10 >> 1;
            } else {
              if (var13 == 128) {
                var15Lifetime1 = var10 - var17;
              } else {
                var15Lifetime1 = var8;
              }
            }
          }
          var18 = this.field_T;
          var19 = this.field_R;
          param2.setBounds(var14Lifetime1 + var18, var16 - var18 * 2, var15Lifetime1 + var19, 8192, -(2 * var19) + var17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_38_0 = var5;
          stackIn_38_1 = new StringBuilder().append("ob.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(Widget param0, int param1, int param2) {
        int var4_int = this.field_N % this.field_K.length;
        int var5 = this.field_N / this.field_K.length;
        this.field_L[this.field_N] = param1;
        this.field_C[this.field_N] = param0;
        if (param0 != null) {
          this.a(var5, (byte) 65, param0, var4_int);
        }
        if (param2 != 0) {
          return;
        }
        try {
          this.field_N = this.field_N + 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ob.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, Widget param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > 103) {
            stackIn_4_0 = super.a(param0, param1, param2, 123, param4, param5, param6);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ob.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = param3;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (43 != var9 ||
                !param1))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param0) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param0 * var6;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_38_0 = var6;
            return stackIn_38_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("ob.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 23) {
          field_J = -52;
        }
        int var4 = this.field_K == null ? 0 : this.field_K.length;
        Widget[] var5 = new Widget[param2 * var4];
        if (this.field_C != null &&
          this.field_C.length > 0 &&
          var5.length > 0 &&
          param1 > 0) {
          vm.a(this.field_C, 0, var5, 0, Math.min(param1, param2) * var4);
        }
        this.field_C = var5;
    }

    final boolean a(Widget param0, int param1, char param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int[] var7 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (super.a(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          var5_int = param1;
          if (98 == var5_int) {
            stackIn_12_0 = this.a((byte) 106, param0, this.field_K.length);
            return stackIn_12_0;
          }
          if (99 == var5_int) {
            stackIn_14_0 = this.a(param0, this.field_K.length, true);
            return stackIn_14_0;
          }
          if (96 == var5_int) {
            stackIn_16_0 = this.a((byte) 88, param0);
            return stackIn_16_0;
          }
          if (var5_int == 97) {
            stackIn_18_0 = this.b(param3 ^ -12286, param0);
            return stackIn_18_0;
          }
          if (param3 != -12215) {
            var7 = (int[]) null;
            this.a(14, (int[]) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ob.F(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 <= 50) {
          field_O = (String) null;
        }
        field_P = null;
        field_M = null;
        field_O = null;
    }

    final void d(byte param0) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        Widget var5;
        Widget var7;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < this.field_C.length) {
          if (this.field_S.length > var3) {
            var4 = 0;
            while (this.field_C.length > var2) {
              if (var4 < this.field_K.length) {
                incrementValue$0 = var2;
                var2++;
                var5 = this.field_C[incrementValue$0];
                if (var5 != null) {
                  this.a(var3, (byte) 65, var5, var4);
                }
                var4++;
                continue;
              }
              break;
            }
            var3++;
            continue;
          }
          break;
        }
        if (param0 < 84) {
          var7 = (Widget) null;
          this.a(-86, 103, -38, 9, (Widget) null, 3, 102);
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = null == this.field_S ? 0 : this.field_S.length;
        Widget[] var5 = new Widget[param1 * var4];
        if (null != this.field_C && this.field_C.length > 0 && var5.length > 0 &&
          param0 > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            vm.a(this.field_C, var6 * param0, var5, var6 * param1, Math.min(param0, param1));
          }
        }
        if (param2 != -20410) {
          return;
        }
        this.field_C = var5;
    }

    ob(int param0, int param1, int param2, int param3, WidgetPainter param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_Q = 92;
        this.field_N = 0;
        try {
          var10 = new int[param5];
          int[] var8 = var10;
          vm.a(var10, 0, param5, 1);
          var9 = new int[param6];
          vm.a(var9, 0, param6, 1);
          this.a((byte) 78, var10);
          this.a(0, var9);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ob.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4 = this.field_S != null ? this.field_S.length : 0;
        int[] var5 = new int[param2 * var4];
        if (this.field_L != null && 0 < this.field_L.length && var5.length > 0 &&
          param1 > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            vm.a(this.field_L, var6 * param1, var5, param2 * var6, Math.min(param1, param2));
          }
        }
        if (!param0) {
          return;
        }
        this.field_L = var5;
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = null != this.field_S ? this.field_S.length : 0;
          var4 = param1.length;
          this.field_S = param1;
          var5 = param1;
          var6 = 0;
          var7 = param0;
          while (var5.length > var6) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          this.a((byte) 65, var3_int, var4);
          this.c(var4, var3_int, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ob.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0, int param1, int param2) {
        if (param1 != 57) {
          this.field_N = 28;
        }
        this.field_R = param0;
        this.field_T = param2;
    }

    private final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int dupTemp$0 = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          int var3_int = 85 % ((-2 - param0) / 62);
          var4 = this.field_K != null ? this.field_K.length : 0;
          var5 = param1.length;
          this.field_K = param1;
          var6 = param1;
          var7 = 0;
          var8 = 0;
          while (var6.length > var7) {
            dupTemp$0 = var8 + var6[var7];
            var8 = dupTemp$0;
            var6[var7] = dupTemp$0;
            var7++;
          }
          this.b(var4, var5, -20410);
          this.a(true, var4, var5);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ob.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String j(int param0) {
        if (param0 != -129) {
          field_J = -78;
        }
        return mk.field_f;
    }

    static {
        field_P = "Holding your chosen god's standard high, order your forces into battle. For here, upon these bloodstained battlefields, will the armies of Gielinor wage war.";
        field_J = 0;
        field_O = "Game";
    }
}
