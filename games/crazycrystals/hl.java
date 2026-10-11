/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends l {
    static int field_h;
    private r field_f;
    static String field_e;
    static int field_g;

    final l b(byte param0) {
        if (param0 != -90) {
          return (l) null;
        }
        return (l) ((Object) new fe(this.field_f));
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = CrazyCrystals.field_B;
          try {
            if (wg.field_P) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (hi.a(param0, "getcookies", 16));
              var4 = ik.a(var3, (byte) -76, ';');
              if (param1 > -39) {
                hl.a(-13, true);
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("hl.D(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final l a(int param0) {
        jj.field_b = jj.field_b + 16;
        if (!(jj.field_b >= 0)) {
          return (l) (this);
        }
        if (param0 != -2) {
          this.field_f = (r) null;
        }
        jj.field_b = 0;
        return (l) ((Object) new o(30, new fe(this.field_f)));
    }

    final static uf a(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        md var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        java.applet.Applet var8 = null;
        md var9 = null;
        mp var10 = null;
        var7 = CrazyCrystals.field_B;
        var9 = kd.field_n;
        var2 = var9;
        var3 = var9.h(255);
        lj.field_b = var3 & 127;
        stackIn_3_0 = ((128 & var3) != 0);
        om.field_u = stackIn_3_0;
        dd.field_b = var9.h(255);
        vf.field_d = var9.d(true);
        if (lj.field_b == 2) {
          na.field_kb = var9.c((byte) -7);
          ca.field_m = var9.b(false);
        } else {
          na.field_kb = 0;
          ca.field_m = 0;
        }
        stackIn_9_0 = (var9.h(255) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        pc.field_w = var9.i(110);
        if (var4 == 0) {
          md.field_s = pc.field_w;
        } else {
          md.field_s = var9.i(121);
        }
        if (param0 != 16) {
          var8 = (java.applet.Applet) null;
          hl.a((java.applet.Applet) null, 102);
        }
        if (lj.field_b == 1) {
          var9.c((byte) -7);
          var9.i(111);
        } else {
          if (lj.field_b == 4) {
            var9.c((byte) -7);
            var9.i(111);
          }
        }
        if (!param1) {
          fb.field_b = s.a(var9, 116, 80);
          so.field_f = null;
        } else {
          var5 = var9.c((byte) -7);
          try {
            var10 = bn.field_g.a(127, var5);
            fb.field_b = var10.e(60);
            if (md.field_s.equals(je.field_g)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var10.field_o;
            }
            so.field_f = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            wp.a((Throwable) ((Object) var6), "CC1", 21862);
            fb.field_b = null;
            so.field_f = null;
          }
        }
        return new uf(param1);
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 25648) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          hl.a((java.applet.Applet) null, -82);
        }
    }

    hl(r param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "This is a hole.<br><br>Watch out! You can fall<br>into holes - unless they<br>have been filled.";
        field_g = 0;
    }
}
