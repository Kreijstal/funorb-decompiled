/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static bu field_c;
    static String field_f;
    static String field_e;
    static ut field_g;
    static String field_b;
    static boolean field_d;
    private String field_a;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -49) {
            var4 = (CharSequence) null;
            vl.a(56, true, true, (CharSequence) null);
          }
          stackIn_3_0 = this.field_a.equals(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vl.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (!param2) {
              field_d = false;
            }
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param0) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var10 / param0 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("vl.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 111) {
          vl.a(-36, -71, -68, 100, 65);
        }
        field_g = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          tj.a(this.field_a, param1, (byte) -5, 31536000L, "jagex-last-login-method");
          if (param0 > -110) {
            vl.a(78, 31, 85, 37, 61);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(nu param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var2_int = param0.field_V.a(true);
          var3 = param0.field_V.c(879306160);
          if (param1 >= -39) {
            vl.a(127);
          }
          var4 = var2_int - 448;
          var5 = -672 + var3;
          var6 = var4 * var4 + var5 * var5;
          if (var6 > 202500) {
            var7 = de.a(var6, (byte) -118);
            var3 = 450 * var5 / var7 + 672;
            var2_int = 448 + var4 * 450 / var7;
          }
          ql.field_a[1] = var3;
          ql.field_a[0] = var2_int;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ut a(int param0, int param1, boolean param2, int param3) {
        int var4 = (param1 << 1) + 1;
        ut var5 = new ut(var4, var4);
        iw.a(56, var5);
        on.d(param1, param1, param1, param3);
        on.d(param1, param1, param1 - param0, 0);
        ta.e(120);
        if (!param2) {
          vl.a(8);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param2, -109, param1, param3 / param0, param3 % 3);
        on.a(param2, param1, 156, 225, 10, 16777215, param4);
        ta.e(126);
    }

    final static boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          vl.a(12, -70, true, -119);
        }
        stackIn_6_0 = (fp.field_e == -1) && (nq.g(0) < 10);
        return stackIn_6_0;
    }

    vl(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          vl.a(-68, -48, 74, 38, -61);
        }
        stackIn_6_0 = (il.b((byte) 100)) && (c.field_g);
        return stackIn_6_0;
    }

    static {
        field_f = "Offensive account name";
        field_d = true;
        field_b = "-";
    }
}
