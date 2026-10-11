/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ed {
    static ec field_c;
    static int field_b;
    static int field_d;
    bh[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 19599) {
          field_d = 21;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        bh var5 = null;
        int var6 = Bounce.field_N;
        bh[] var7 = this.field_a;
        bh[] var3 = var7;
        if (param1 <= 69) {
          ed.a((byte) 121);
        }
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_a.length > param0) {
            return var5.field_a[param0];
          }
          param0 = param0 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 60) {
          ed.a(7);
        }
        return kg.a(param1, 1, param3, -2147483648, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = Bounce.field_N;
        for (var3 = param1; this.field_a.length > var3; var3++) {
          var4 = this.field_a[var3];
          if (!(var4.field_a.length <= param0)) {
            return var3;
          }
          param0 = param0 - (var4.field_a.length - 1);
        }
        return this.field_a.length;
    }

    final int b(int param0) {
        int var4 = 0;
        int var2;
        bh[] var3;
        bh var5;
        int var7;
        int var6;
        var7 = Bounce.field_N;
        var2 = -1;
        if (param0 <= 73) {
          return 107;
        }
        if (this.field_a != null) {
          var3 = this.field_a;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) -62);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final static void a(byte param0) {
        il.a(6);
        if (param0 != -127) {
          field_b = -84;
        }
    }

    final int b(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        var2 = -59 % ((param0 + 51) / 35);
        if (this.field_a != null &&
          this.field_a.length > 0) {
          stackIn_5_0 = -this.field_a[0].field_f + this.field_a[this.field_a.length - 1].field_b;
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    private final static lb[] a(int param0, si param1) {
        int var5 = 0;
        lb[] stackIn_3_0 = null;
        lb[] stackIn_10_0 = null;
        lb[] stackIn_13_0 = null;
        lb[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        lb[] var4 = null;
        lb var6 = null;
        int var7 = 0;
        mk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Bounce.field_N;
        try {
          if (!param1.a((byte) 53)) {
            stackIn_3_0 = new lb[]{};
            return stackIn_3_0;
          }
          var8 = param1.c((byte) 5);
          while (var8.field_f == 0) {
            wh.a(10L, param0 + 19396);
          }
          if (var8.field_f == 2) {
            stackIn_10_0 = new lb[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          if (param0 != 10) {
            stackIn_13_0 = (lb[]) null;
            return stackIn_13_0;
          }
          var4 = new lb[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new lb();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_e = var3[1 + (var5 << 2)];
            var6.field_a = var3[(var5 << 2) + 2];
            var6.field_f = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ed.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static java.awt.Frame a(int param0, si param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        lb[] var10 = null;
        mk var11 = null;
        var9 = Bounce.field_N;
        try {
          if (!param1.a((byte) 53)) {
            return null;
          }
          if (param2 == 0) {
            var10 = ed.a(10, param1);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (param4 == var10[var8].field_d &&
                var10[var8].field_e == param5 && ((param3 == 0 ||
                var10[var8].field_f == param3) &&
                (var7_int == 0 ||
                !(var10[var8].field_a <= param2)))) {
                param2 = var10[var8].field_a;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_28_0 = null;
              return (java.awt.Frame) (stackIn_28_0);
            }
          }
          var11 = param1.a(param2, param4, param3, param5, 314572800);
          while (0 == var11.field_f) {
            wh.a(10L, 19406);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            stackIn_34_0 = null;
            return (java.awt.Frame) (stackIn_34_0);
          }
          if (var11.field_f == 2) {
            ib.a(param1, var7, (byte) 115);
            stackIn_37_0 = null;
            return (java.awt.Frame) (stackIn_37_0);
          }
          if (param0 != 4147) {
            field_c = (ec) null;
          }
          stackIn_41_0 = var7;
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("ed.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        bh var6 = null;
        int var7 = 0;
        int var8 = Bounce.field_N;
        if (null == this.field_a ||
          0 == this.field_a.length ||
          this.field_a[0].field_f > param2) {
          return -1;
        }
        if (!(param2 <= this.field_a[this.field_a.length - 1].field_b)) {
          return -1;
        }
        if (this.field_a.length == 1) {
          return this.field_a[0].a(param0, (byte) 110);
        }
        if (param1 >= -92) {
          ed.a(-47, (byte) 83, -109);
        }
        int var4 = 0;
        for (var5 = 0; this.field_a.length > var5; var5++) {
          var6 = this.field_a[var5];
          if (param2 >= var6.field_f &&
            param2 <= var6.field_b) {
            var7 = var6.a(param0, (byte) 91);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        try {
          var5_int = 0;
          while (true) {
            if (var5_int >= ja.field_c.length) {
              if (param2 >= -45) {
                ed.a(85, -86, -63, -63);
              }
              return;
            }
            param3 = ja.field_c[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = lb.field_c[incrementValue$1];
              dupTemp$2 = param4[param1];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              lb.field_c[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ed.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = Bounce.field_N;
        try {
          if (param1 >= -50) {
            stackIn_3_0 = 106;
            return stackIn_3_0;
          }
          if (param0 < param2) {
            var3_int = param0;
            param0 = param2;
            param2 = var3_int;
          }
          while (0 != param2) {
            var3_intLifetime1 = param0 % param2;
            param0 = param2;
            param2 = var3_intLifetime1;
          }
          stackIn_10_0 = param0;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "ed.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Bounce.field_N;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          var8 = 0;
          if (param2 >= -122) {
            field_b = 40;
          }
          while (var7 > var8) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            }
            var8++;
          }
          if (var5_int > 0) {
            stackIn_21_0 = (-param0 + param1 << 8) / var5_int;
            return stackIn_21_0;
          }
          stackIn_23_0 = 0;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ed.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
    }
}
