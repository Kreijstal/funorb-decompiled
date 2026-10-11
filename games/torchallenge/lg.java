/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg {
    static int field_f;
    static int[][] field_d;
    qi[] field_a;
    static int[] field_e;
    static int field_c;
    static String field_b;

    final static void a(uj param0, byte param1, java.awt.Frame param2) {
        mi var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        CharSequence var5 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(-3816, param2);
            while (var3.field_d == 0) {
              c.a(-112, 10L);
            }
            if (1 != var3.field_d) {
              c.a(-108, 100L);
              continue;
            }
            break;
          }
          if (param1 <= 48) {
            var5 = (CharSequence) null;
            lg.a((CharSequence) null, -113);
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("lg.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int b(byte param0, int param1) {
        int[] var2;
        int[] var3;
        if (param0 != 84) {
          return -106;
        }
        var3 = bj.field_d;
        var2 = var3;
        if (var3[4] != param1 &&
          var3[3] != param1) {
          if (var3[2] == param1) {
            return 0;
          }
          if (param1 == var3[1]) {
            return 4;
          }
          if (var3[0] != param1) {
            return -1;
          }
          return 2;
        }
        return 0;
    }

    final int a(String param0, int param1, byte param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param0.charAt(var8);
            if (60 != var9) {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (param2 != 19) {
            field_b = (String) null;
          }
          if (0 >= var5_int) {
            return 0;
          }
          stackIn_22_0 = (-param3 + param1 << 8) / var5_int;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("lg.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 != -63) {
          return 126;
        }
        if (null != this.field_a &&
          this.field_a.length > 0) {
          stackIn_7_0 = this.field_a[this.field_a.length - 1].field_e - this.field_a[0].field_d;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static long a(CharSequence param0, int param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != -1) {
            stackIn_3_0 = 44L;
            return stackIn_3_0;
          }
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-64 + var6);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-96 + var6);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 + 27 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("lg.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = (int[][]) null;
        field_e = null;
        if (param0 != -27840) {
          ej var2 = (ej) null;
          lg.a(true, (byte) -97, (ej) null);
        }
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        qi[] var3;
        qi var5;
        int var7;
        int var6;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 57) {
          return 9;
        }
        var2 = -1;
        if (null != this.field_a) {
          var3 = this.field_a;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b((byte) 104);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        qi var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        qi[] var7 = this.field_a;
        qi[] var3 = var7;
        if (param0 >= -103) {
          lg.a(-125);
        }
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_g.length > param1) {
            return var5.field_g[param1];
          }
          param1 = param1 - (var5.field_g.length - 1);
        }
        return 0;
    }

    final static void a(boolean param0, byte param1, ej param2) {
        try {
          if (param1 != -79) {
            field_e = (int[]) null;
          }
          uc.a(param2, param1 - 3481, param0, 256);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "lg.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1) {
        qi var4 = null;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 != 7) {
          this.field_a = (qi[]) null;
        }
        while (this.field_a.length > var3) {
          var4 = this.field_a[var3];
          if (!(var4.field_g.length <= param1)) {
            return var3;
          }
          param1 = param1 - (var4.field_g.length - 1);
          var3++;
        }
        return this.field_a.length;
    }

    final static hb a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        hb[] var3 = null;
        hb var5 = null;
        int var6 = 0;
        hb stackIn_3_0 = null;
        hb stackIn_9_0 = null;
        hb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = g.a("jagex-last-login-method", (byte) 75, param0);
          if (var2 == null) {
            stackIn_3_0 = ki.field_b;
            return stackIn_3_0;
          }
          var3 = dg.j(1);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, 0)) {
              stackIn_9_0 = var5;
              return stackIn_9_0;
            }
          }
          if (param1 <= 125) {
            field_d = (int[][]) null;
          }
          stackIn_14_0 = ki.field_b;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("lg.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var4;
        qi var6;
        int var7;
        int var8;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (this.field_a != null &&
          this.field_a.length != 0 &&
          param2 >= this.field_a[0].field_d) {
          if (param2 > this.field_a[-1 + this.field_a.length].field_e) {
            return -1;
          }
          if (this.field_a.length == 1) {
            return this.field_a[0].a(0, param0);
          }
          var4 = 0;
          for (var5 = 0; this.field_a.length > var5; var5++) {
            var6 = this.field_a[var5];
            if (var6.field_d <= param2 &&
              var6.field_e >= param2) {
              var7 = var6.a(0, param0);
              if (-1 == var7) {
                return -1;
              }
              return var7 + var4;
            }
            var4 = var4 + (-1 + var6.field_g.length);
          }
          if (param1 != -77) {
            field_b = (String) null;
          }
          return -1;
        }
        return -1;
    }

    static {
        field_d = new int[][]{new int[]{0, 179, 469, 157, 468, 0, 1, 290, 33, 5, 5, 9, 8, 7, 6, 14, 6, 0, 1, 0, -1}, new int[]{0, 41, 311, 160, 368, 0, 2, 270, 33, 5, 5, 9, 8, 7, 6, 14, 6, 1, 1, 0, -1}, new int[]{1, 40, 620, 404, 472, 40, 2, 260, 33, 5, 5, 9, 8, 7, 6, 14, 6, 0, 1, 0, -1}, new int[]{1, 30, 468, 430, 470, 20, 0, 180, 40, 5, 5, 11, 9, 8, 7, 20, 4, 0, 1, 0, -1}, new int[]{1, 59, 579, 434, 474, 40, 0, 240, 40, 5, 5, 11, 9, 8, 7, 20, 4, 0, 1, 0, -1}, new int[]{1, 59, 579, 434, 474, 40, 0, 240, 40, 5, 5, 11, 9, 8, 7, 20, 4, 0, 1, 0, -1}, new int[]{0, 194, 446, 200, 240, 0, 2, 252, 40, 5, 5, 11, 9, 8, 7, 20, 4, 0, -1, 0, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1}, new int[]{1, 48, 578, 224, 264, 67, 0, 132, 40, 5, 5, 11, 9, 8, 7, 20, 4, 0, 1, 0, 9}, new int[]{1, 59, 579, 424, 464, 40, 0, 240, 40, 5, 5, 11, 9, 8, 7, 20, 4, 3, -1, 0, 8}, new int[]{0, 367, 552, 109, 365, 0, 8, 185, 36, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 1, 11}, new int[]{1, 59, 579, 424, 464, 40, 0, 240, 40, 5, 5, 11, 9, 8, 7, 20, 4, 3, -1, 0, 10}, new int[]{0, 519, 619, 13, 46, 0, 0, 100, 33, 5, 5, 9, 8, 7, 6, 14, 6, 2, -1, 0, -1}, new int[]{0, 0, 640, 0, 480, 0, 0, 640, 480, -1, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1}, new int[]{1, 475, 565, 162, 186, 0, 0, 30, 24, -1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1}, new int[]{0, 200, 440, 430, 470, 0, 0, 240, 40, 5, 5, 11, 9, 8, 7, 20, 4, 2, -1, 0, -1}};
        field_c = 500;
    }
}
