/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends fc {
    static oh field_k;
    static bc field_i;
    static int field_j;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -1) {
          r.f(84);
        }
        field_k = null;
    }

    final static void f(int param0) {
        gl.field_E.l(24910);
        if (param0 != -635) {
          return;
        }
        if (ib.field_e == null) {
          ib.field_e = new rk(gl.field_E, tk.field_r);
        }
        gl.field_E.d((byte) -63, ib.field_e);
    }

    private r() throws Throwable {
        throw new Error();
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          r.e(-40);
        }
        return !sa.field_Q.b((byte) 92) ? true : false;
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        String stackIn_10_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (sf.a(param0.charAt(var2_int), -33)) {
              var2_int++;
              continue;
            }
            break;
          }
          if (param1 != -11133) {
            stackIn_10_0 = (String) null;
            return stackIn_10_0;
          }
          while (var2_int < var3) {
            if (sf.a(param0.charAt(var3 - 1), param1 ^ 11100)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (1 > var4) {
            return null;
          }
          if (var4 > 12) {
            stackIn_18_0 = null;
            return (String) (stackIn_18_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (ui.a(-19050, (char) var7)) {
              var8 = vh.a(true, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("r.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          j.a((java.awt.Component) ((Object) param1), 103);
          fb.a(param0 + 32539, (java.awt.Component) ((Object) param1));
          if (param0 != -32652) {
            field_i = (bc) null;
          }
          if (null != rd.field_l) {
            rd.field_l.a((java.awt.Component) ((Object) param1), 23817);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("r.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int e(int param0) {
        if (param0 != -12364) {
          return -34;
        }
        return kk.field_h;
    }

    static {
        field_j = -1;
    }
}
