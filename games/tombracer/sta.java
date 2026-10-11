/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sta extends rva {
    private int[] field_F;
    private int field_x;
    int field_E;
    private int field_D;
    static String field_G;
    static String field_A;
    private int[] field_C;
    private int[] field_I;
    static nh[] field_y;
    static String field_H;
    static int field_B;
    private int field_z;

    final void a(byte param0) {
        int incrementValue$0 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        ae var5;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < this.field_w.length) {
          if (var3 < this.field_F.length) {
            var4 = 0;
            while (var2 < this.field_w.length) {
              if (this.field_C.length > var4) {
                incrementValue$0 = var2;
                var2++;
                var5 = this.field_w[incrementValue$0];
                if (var5 != null) {
                  this.a(var3, var5, var4, (byte) 85);
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
        if (param0 != 88) {
          this.field_F = (int[]) null;
        }
    }

    private final void a(int param0, ae param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
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
        int[] var21 = null;
        int var14Lifetime1;
        int var15Lifetime1;
        var20 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = this.field_C[this.field_C.length - 1];
          var6 = this.field_F[this.field_F.length - 1];
          if (param2 <= 0) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = this.field_C[-1 + param2];
          }
          var7 = stackIn_4_0 * this.field_m / var5_int;
          if (param0 > 0) {
            stackIn_7_0 = this.field_F[param0 - 1];
          } else {
            stackIn_7_0 = 0;
          }
          var8 = stackIn_7_0 * this.field_p / var6;
          var9 = this.field_m * this.field_C[param2] / var5_int;
          var10 = this.field_F[param0] * this.field_p / var6;
          var11 = param2 + param0 * this.field_C.length;
          var12 = this.field_I[var11] & 48;
          var13 = 192 & this.field_I[var11];
          if (param3 != 85) {
            var21 = (int[]) null;
            this.a((int[]) null, -46);
          }
          var14 = param1.field_i;
          var15 = param1.field_n;
          var16 = param1.field_m;
          if (var9 - var7 > var16 &&
            0 != (1 & this.field_I[var11])) {
            var14Lifetime1 = var7;
            var16 = var9 - var7;
          } else if (var16 > var9 - var7 &&
            (4 & this.field_I[var11]) != 0) {
            var14Lifetime1 = var7;
            var16 = -var7 + var9;
          } else {
            if (var12 != 16) {
              if (var12 != 32) {
                var14Lifetime1 = var7;
              } else {
                var14Lifetime1 = -var16 + var9;
              }
            } else {
              var14Lifetime1 = -var16 + var7 + var9 >> 1;
            }
          }
          var17 = param1.field_p;
          if (-var8 + var10 > var17 &&
            0 != (2 & this.field_I[var11])) {
            var15Lifetime1 = var8;
            var17 = var10 - var8;
          } else if (var17 > -var8 + var10 &&
            (this.field_I[var11] & 8) != 0) {
            var17 = -var8 + var10;
            var15Lifetime1 = var8;
          } else {
            if (var13 != 64) {
              if (128 != var13) {
                var15Lifetime1 = var8;
              } else {
                var15Lifetime1 = -var17 + var10;
              }
            } else {
              var15Lifetime1 = var10 + (var8 - var17) >> 1;
            }
          }
          var18 = this.field_z;
          var19 = this.field_x;
          param1.a((byte) -31, var16 - var18 * 2, -(2 * var19) + var17, var14Lifetime1 + var18, var15Lifetime1 + var19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("sta.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        if (param0 >= -35) {
          return;
        }
        field_A = null;
        field_G = null;
        field_H = null;
        field_y = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = null != this.field_F ? this.field_F.length : 0;
        int[] var5 = new int[param2 * var4];
        if (null != this.field_I &&
          this.field_I.length > 0 &&
          var5.length > 0 &&
          param0 > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            lua.a(this.field_I, var6 * param0, var5, var6 * param2, Math.min(param0, param2));
          }
        }
        this.field_I = var5;
        if (param1 >= -100) {
          field_H = (String) null;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 97) {
          return;
        }
        this.field_z = param1;
        this.field_x = param0;
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = this.field_C != null ? this.field_C.length : 0;
        if (param0 != 28705) {
          ae var6 = (ae) null;
          this.b(9, (ae) null, 31);
        }
        int[] var5 = new int[var4 * param2];
        if (this.field_I != null &&
          0 < this.field_I.length &&
          var5.length > 0 &&
          param1 > 0) {
          lua.a(this.field_I, 0, var5, 0, Math.min(param1, param2) * var4);
        }
        this.field_I = var5;
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = null == this.field_C ? 0 : this.field_C.length;
        ae[] var5 = new ae[var4 * param0];
        if (null != this.field_w && this.field_w.length > 0 && var5.length > 0 &&
          param1 > 0) {
          lua.a(this.field_w, 0, var5, 0, var4 * Math.min(param1, param0));
        }
        if (param2 != 0) {
          return;
        }
        this.field_w = var5;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          var5_int = param2;
          if (var5_int == 98) {
            stackIn_12_0 = this.a(param1, (byte) -14, this.field_C.length);
            return stackIn_12_0;
          }
          if (var5_int == 99) {
            stackIn_14_0 = this.a(this.field_C.length, param1, 0);
            return stackIn_14_0;
          }
          if (96 == var5_int) {
            stackIn_16_0 = this.a(param1, 1);
            return stackIn_16_0;
          }
          if (var5_int != 97) {
            return false;
          }
          stackIn_18_0 = this.a((byte) 43, param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("sta.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, ae param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
          if (param0 != 0) {
            this.field_E = 89;
          }
          var4_int = this.field_D % this.field_C.length;
          var5 = this.field_D / this.field_C.length;
          this.field_I[this.field_D] = param2;
          this.field_w[this.field_D] = param1;
          if (param1 != null) {
            this.a(var5, param1, var4_int, (byte) 85);
          }
          this.field_D = this.field_D + 1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sta.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 70) {
            field_B = -13;
          }
          stackIn_3_0 = super.a(89, param1, param2, param3, param4, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("sta.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean g(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 97) {
          field_G = (String) null;
        }
        stackIn_6_0 = (wba.field_o != null) && (wba.field_o.a((byte) -127));
        return stackIn_6_0;
    }

    private final void e(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = this.field_F != null ? this.field_F.length : 0;
        ae[] var5 = new ae[param0 * var4];
        if (param2 != 192) {
          this.field_F = (int[]) null;
        }
        if (null != this.field_w && this.field_w.length > 0 && var5.length > 0 &&
          param1 > 0) {
          for (var6 = 0; var4 > var6; var6++) {
            lua.a(this.field_w, param1 * var6, var5, param0 * var6, Math.min(param1, param0));
          }
        }
        this.field_w = var5;
    }

    sta(int param0, int param1, int param2, int param3, isa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        this.field_D = 0;
        this.field_E = 92;
        try {
          var10 = new int[param5];
          int[] var8 = var10;
          lua.a(var10, 0, param5, 1);
          var9 = new int[param6];
          lua.a(var9, 0, param6, 1);
          this.a(var10, (byte) -97);
          this.a(var9, 48);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sta.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int[] param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        int var6Lifetime1;
        try {
          var3_int = this.field_C == null ? 0 : this.field_C.length;
          var4 = param0.length;
          this.field_C = param0;
          var5 = param0;
          var6 = 0;
          var7 = 0;
          while (var6 < var5.length) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          var6Lifetime1 = -21 / ((-43 - param1) / 50);
          this.e(var4, var3_int, 192);
          this.d(var3_int, -110, var4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sta.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int dupTemp$0 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = null == this.field_F ? 0 : this.field_F.length;
          var4 = param0.length;
          this.field_F = param0;
          var5 = param0;
          if (param1 != 48) {
            field_G = (String) null;
          }
          var6 = 0;
          var7 = 0;
          while (var6 < var5.length) {
            dupTemp$0 = var7 + var5[var6];
            var7 = dupTemp$0;
            var5[var6] = dupTemp$0;
            var6++;
          }
          this.c(var4, var3_int, 0);
          this.f(param1 + 28657, var3_int, var4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sta.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    static {
        field_G = "This option cannot be combined with the current settings for:  ";
        field_B = 0;
        field_A = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "Mazes";
    }
}
