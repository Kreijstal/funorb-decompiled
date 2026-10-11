/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_d;
    static boolean field_c;
    static ea[] field_a;
    static ta field_b;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var5;
        var5 = MinerDisturbance.field_ab;
        if (!th.field_b[param1][cm.field_o]) {
          return;
        }
        if (!param0) {
          return;
        }
        if (!ke.field_X[param1] &&
          ke.field_V &&
          sc.field_b &&
          !d.a(param1, cm.field_o, (byte) 68)) {
          boolean decompiledFrameRemainder0 = true;
          if (0 <= param3 &&
            param2 >= 0 &&
            li.field_c > 0 &&
            db.field_d > 0) {
            if ((-li.field_c + param3 >= 0 &&
              608 >= -li.field_c + param3) &&
              (decompiledFrameRemainder0 = (!(-db.field_d + param2 >= 0) ||
              !(-db.field_d + param2 <= 448)))) {
              return;
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          ke.field_X[param1] = true;
          if (!fi.field_a[param1]) {
            if (ok.field_b.e((byte) 119) &&
              bl.g(0) &&
              ja.field_u > 150) {
              ok.field_b.a((byte) -93, new tm(param1, param3, param2, false));
              ra.a(param1, (byte) -59);
              ja.field_u = 0;
            } else {
              ke.field_X[param1] = false;
            }
          } else {
            ec.field_c.a((byte) -93, new tm(param1, param3, param2, true));
            ra.a(param1, (byte) -59);
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ag.a((java.applet.Applet) null, false);
        }
    }

    final static void a(hf param0, int param1, int param2) {
        ld var6 = null;
        int var4 = 0;
        try {
          var6 = sn.field_c;
          if (param2 >= -107) {
            java.applet.Applet var5 = (java.applet.Applet) null;
            ag.a((java.applet.Applet) null, false);
          }
          var6.d((byte) -46, param1);
          var6.field_o = var6.field_o + 1;
          var4 = var6.field_o;
          var6.c(1, 25564);
          if (null == param0.field_n) {
            var6.c(0, 25564);
          } else {
            var6.c(param0.field_n.length, 25564);
            var6.a(0, param0.field_n.length, true, param0.field_n);
          }
          var6.e(74, var4);
          var6.field_o = var6.field_o - 4;
          param0.field_o = var6.b((byte) 51);
          var6.g(-1, -var4 + var6.field_o);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ag.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, boolean param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_7_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = MinerDisturbance.field_ab;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (lk.a((byte) 18, "getcookies", param0));
              var5 = h.a(';', param1, var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == nj.field_a) {
              return param0.getParameter("settings");
            }
            stackIn_14_0 = nj.field_a;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("ag.A(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = false;
        field_b = new ta();
    }
}
