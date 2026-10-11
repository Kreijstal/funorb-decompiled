/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static ak field_c;
    static tf[] field_d;
    static String[] field_b;
    static int field_a;

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param2) {
            stackIn_3_0 = ko.field_ib;
            return stackIn_3_0;
          }
          if (param2 == 6) {
            stackIn_7_0 = nh.field_c;
            return stackIn_7_0;
          }
          if (param2 == 7) {
            stackIn_10_0 = gq.field_l;
            return stackIn_10_0;
          }
          if (param2 == 8) {
            stackIn_14_0 = fb.field_Eb;
            return stackIn_14_0;
          }
          if (param2 == 9) {
            stackIn_18_0 = jb.field_c;
            return stackIn_18_0;
          }
          if (10 == param2) {
            stackIn_22_0 = c.field_O;
            return stackIn_22_0;
          }
          if (param2 == 11) {
            stackIn_26_0 = ve.field_Gb;
            return stackIn_26_0;
          }
          if (param2 == 14) {
            stackIn_29_0 = sd.a(dd.field_m, 28, new String[]{param1});
            return stackIn_29_0;
          }
          if (param0 > 113) {
            return null;
          }
          field_b = (String[]) null;
          stackIn_33_0 = null;
          return (String) (stackIn_33_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("lg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        fm var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_4_0 = em.field_b;
            return stackIn_4_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = dh.a(param2, (byte) 97);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ii.a((byte) 122, var4.charAt(0)) &&
                !ii.a((byte) 126, var4.charAt(-1 + var4.length()))) {
                if (param0 != 11) {
                  var9 = (fm) null;
                  lg.a(55, (fm) null);
                }
                var5 = 0;
                for (var6 = 0; param2.length() > var6; var6++) {
                  var7 = param2.charAt(var6);
                  if (!ii.a((byte) 118, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (2 <= var5 &&
                    !param1) {
                    stackIn_31_0 = fl.field_f;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = ii.field_k;
                return stackIn_36_0;
              }
              stackIn_19_0 = ii.field_k;
              return stackIn_19_0;
            }
            stackIn_14_0 = em.field_b;
            return stackIn_14_0;
          }
          stackIn_9_0 = em.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("lg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final static io a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        io[] var3 = null;
        io var5 = null;
        int var6 = 0;
        sb var7 = null;
        io stackIn_6_0 = null;
        io stackIn_12_0 = null;
        io stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != -18992) {
            var7 = (sb) null;
            lg.a((sb) null, -23, -37, (sb) null, 119, 116);
          }
          var2 = qn.a(param0, "jagex-last-login-method", (byte) -85);
          if (var2 == null) {
            stackIn_6_0 = cd.field_c;
            return stackIn_6_0;
          }
          var3 = h.a((byte) -8);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, -66)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = cd.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("lg.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = -115 / ((param0 + 84) / 35);
    }

    final static void a(int param0, fm param1) {
        try {
          bj.field_c[0] = ua.a(param1, "", "pix_title");
          bj.field_c[1] = ua.a(param1, "", "pix_end_game");
          bj.field_c[2] = ua.a(param1, "", "skin1");
          bj.field_c[param0] = ua.a(param1, "", "skin8");
          bj.field_c[4] = ua.a(param1, "", "skin2");
          bj.field_c[5] = ua.a(param1, "", "skin9");
          bj.field_c[6] = ua.a(param1, "", "skin3");
          bj.field_c[7] = ua.a(param1, "", "skin16");
          bj.field_c[8] = ua.a(param1, "", "skin4");
          bj.field_c[9] = ua.a(param1, "", "skin11");
          bj.field_c[10] = ua.a(param1, "", "skin12");
          bj.field_c[11] = ua.a(param1, "", "skin7");
          bj.field_c[12] = ua.a(param1, "", "skin5");
          bj.field_c[13] = ua.a(param1, "", "skin6");
          bj.field_c[14] = ua.a(param1, "", "skin13");
          bj.field_c[15] = ua.a(param1, "", "skin14");
          bj.field_c[16] = ua.a(param1, "", "skin15");
          bj.field_c[17] = ua.a(param1, "", "skin10");
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(sb param0, int param1, int param2, sb param3, int param4, int param5) {
        try {
          bd.field_c = param5;
          tm.field_N = param3;
          if (param2 >= -114) {
            lg.a((byte) 57);
          }
          ko.field_fb = param4;
          hc.field_J = param1;
          ao.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static java.net.URL a(boolean param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var5 = (CharSequence) null;
            lg.a(-66, true, (CharSequence) null);
          }
          var3 = null;
          var4 = null;
          if (null != jp.field_c &&
            !jp.field_c.equals(param1.getParameter("settings"))) {
            var3 = jp.field_c;
            var4 = var3;
            var4 = var3;
          }
          if (null != bh.field_n &&
            !bh.field_n.equals(param1.getParameter("session"))) {
            var4 = bh.field_n;
          }
          stackIn_10_0 = ub.a(-102, param2, (String) (var3), (String) (var4), -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("lg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = new String[255];
        field_d = new tf[2];
    }
}
