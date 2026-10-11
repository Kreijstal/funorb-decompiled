/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int[] field_a;
    static String field_b;

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 48) {
          field_b = (String) null;
        }
        stackIn_8_0 = (this == lb.field_o) || (ge.field_m == this) || (this == la.field_O);
        return stackIn_8_0;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        ai.a(param1, -1, (String) null, param0);
        if (param2 != 4) {
          th.a(false, true, -6);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = stellarshard.field_B;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param2 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param2 * var6 + var9;
                if (var10 / param2 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (param0 != -123) {
              field_a = (int[]) null;
            }
            stackIn_44_0 = var5;
            return stackIn_44_0 != 0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_47_0 = var4;
          stackIn_47_1 = new StringBuilder().append("th.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    final static void a(bd param0, bd param1, int param2, int param3) {
        try {
          pe.field_c = param1;
          mj.field_E = param0;
          if (param3 >= -99) {
            CharSequence var5 = (CharSequence) null;
            th.a(-70, false, 43, (CharSequence) null);
          }
          gg.field_d = param2;
          ki.a(ti.field_i / 2, ti.field_b / 2, -116);
          qe.a(param0.field_x, -29770, param1.field_r + param1.field_x, param1.field_x, param0.field_r + param0.field_x);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "th.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -22) {
          field_a = (int[]) null;
        }
    }

    final static void a(int param0, fk param1, int param2) {
        ha var5 = null;
        int var4 = 0;
        try {
          var5 = pg.field_fb;
          var5.f(param0, 950);
          var5.field_k = var5.field_k + 1;
          var4 = var5.field_k;
          var5.a(false, param2);
          var5.a(false, param1.field_l);
          var5.a((byte) 67, param1.field_p);
          var5.b(0, param1.field_m);
          var5.b(0, param1.field_s);
          var5.b(0, param1.field_o);
          var5.b(0, param1.field_n);
          var5.c(var4, (byte) -3);
          var5.a(-var4 + var5.field_k, (byte) 80);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "th.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        pb var1 = null;
        pb var3 = null;
        int var4 = 0;
        int var5 = stellarshard.field_B;
        try {
          var1 = new pb(540, 140);
          hj.a(var1, 1);
          cc.a();
          int var2 = 104 / ((param0 + 41) / 39);
          ti.d();
          ni.field_d = 0;
          ja.a(4);
          var3 = var1.a();
          for (var4 = 0; var4 < 15; var4++) {
            var3.b(-2, -2, 16777215);
            ti.d(4, 4, 0, 0, 540, 140);
          }
          pd.field_s.e();
          var1.b(0, 0);
          id.b((byte) -58);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "th.C(" + param0 + ')');
        }
    }

    static {
        field_b = "Password: ";
        field_a = new int[]{1, 4, 0, 1, 2, 3};
    }
}
