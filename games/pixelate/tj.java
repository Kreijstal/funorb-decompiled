/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ah {
    private Object field_x;
    static String field_w;
    static bb field_z;
    static int field_y;
    static int field_v;

    public static void j(int param0) {
        field_z = null;
        field_w = null;
        if (param0 <= 77) {
          field_z = (bb) null;
        }
    }

    final static boolean a(pc param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -32) {
            stackIn_6_0 = (param0.c(1, (byte) -34) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("tj.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    tj(Object param0, int param1) {
        super(param1);
        try {
          this.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          if (param0 != -128) {
            field_v = -81;
          }
          param1.addMouseListener(fj.field_c);
          param1.addMouseMotionListener(fj.field_c);
          param1.addFocusListener(fj.field_c);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hh b(byte param0) {
        hh var1 = new hh(field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], wo.field_f[0], fl.field_g);
        if (param0 >= -78) {
          return (hh) null;
        }
        re.b(140);
        return var1;
    }

    final static void h(int param0) {
        uj.j(-705633312);
        gj.field_V = true;
        to.field_s = true;
        if (param0 != 20) {
          field_w = (String) null;
        }
        wa.field_c.e((byte) 54);
        ko.a(false, nb.field_b, param0 ^ -26047);
    }

    final static void a(int param0, boolean param1, int param2, int param3, jl param4, tf[] param5, int param6, int param7, tf[] param8, int param9, jl param10, byte param11, int param12, int param13, int param14) {
        try {
          if (param11 != 122) {
            java.awt.Component var16 = (java.awt.Component) null;
            tj.a((byte) 102, (java.awt.Component) null);
          }
          tf[] var17 = (tf[]) null;
          da.a((tf[]) null, param6, param8, 0, param10, 0, ce.field_b, param4, 480, param2, (byte) -100, param14, param3, param0, param12, param13, param5, param9, sl.field_l, qo.field_s, param7);
          ai.a(param1, param11 ^ 124);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final Object a(byte param0) {
        if (param0 != -55) {
          return (Object) null;
        }
        return this.field_x;
    }

    final static int a(int param0, CharSequence param1, boolean param2, boolean param3) {
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
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((0 == var8) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
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
                var10 = param0 * var6 + var9;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (!param2) {
              field_w = (String) null;
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("tj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(boolean param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        if (param1) {
          if (ep.field_c[param3] > ep.field_c[param2]) {
            return true;
          }
          if (ep.field_c[param2] > ep.field_c[param3]) {
            return false;
          }
          if (nb.field_c[param2] < nb.field_c[param3]) {
            return true;
          }
          if (nb.field_c[param3] < nb.field_c[param2]) {
            return false;
          }
        } else {
          if (nb.field_c[param3] > nb.field_c[param2]) {
            return true;
          }
          if (nb.field_c[param2] > nb.field_c[param3]) {
            return false;
          }
          if (ep.field_c[param2] < ep.field_c[param3]) {
            return true;
          }
          if (ep.field_c[param3] < ep.field_c[param2]) {
            return false;
          }
        }
        var4 = gh.field_q[param2] + vp.field_Fb[param2] + uc.field_b[param2];
        var5 = uc.field_b[param3] - (-vp.field_Fb[param3] - gh.field_q[param3]);
        if (var4 < var5) {
          return true;
        }
        if (var4 > var5) {
          return false;
        }
        if (param0) {
          field_w = (String) null;
        }
        return !(param2 >= param3);
    }

    final static void i(int param0) {
        int var1 = 0;
        if (ia.field_h < 224) {
          var1 = ia.field_h % 32;
          nk.a((byte) 93, ia.field_h + 32 - var1);
        } else {
          nk.a((byte) 93, 256);
        }
        if (param0 != 32) {
          tj.j(117);
        }
    }

    static {
        field_w = "This password contains your Player Name, and would be easy to guess";
        field_v = 20;
        field_z = new bb();
    }
}
