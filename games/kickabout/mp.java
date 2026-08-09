/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends gn {
    static String field_k;
    static jg field_g;
    static int[] field_j;
    static int[] field_p;
    byte[] field_o;
    static long field_i;
    static String field_e;
    static String field_n;
    static qe field_h;
    static String field_l;
    int field_m;
    static hd field_f;

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            sm var6 = null;
            String var7 = null;
            String var8 = null;
            try {
              L0: {
                wk.field_b = param2;
                try {
                  L1: {
                    L2: {
                      var7 = param0.getParameter("cookieprefix");
                      var5 = var7;
                      var5 = var7;
                      var4 = param0.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      if (param1) {
                        break L2;
                      } else {
                        var6 = (sm) null;
                        mp.a(-99, 111, (sm) null);
                        break L2;
                      }
                    }
                    L3: {
                      var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                      var5 = var8;
                      var5 = var8;
                      if (0 != param2.length()) {
                        var5 = var8 + "; Expires=" + rj.a(nj.a(118) - -94608000000L, -128) + "; Max-Age=" + 94608000L;
                        break L3;
                      } else {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    mm.a("document.cookie=\"" + var5 + "\"", param0, (byte) 115);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                nt.a(param0, (byte) 103);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("mp.C(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        ml var2;
        var2 = or.field_d;
        var2.b(param0, (byte) 109);
        var2.a(127, 1);
        var2.a(103, 3);
        if (param1 < 76) {
          field_i = 81L;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_h = null;
        if (param0 != 1) {
          field_e = (String) null;
          field_j = null;
          field_e = null;
          field_f = null;
          field_g = null;
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_j = null;
          field_e = null;
          field_f = null;
          field_g = null;
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
    }

    final static void a(int param0, int param1, sm param2) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        ml var7 = or.field_d;
        ml var8 = var7;
        var8.b(param1, (byte) -58);
        var8.field_n = var8.field_n + 1;
        int var4 = var8.field_n;
        if (param0 < 40) {
            return;
        }
        try {
            var8.a(125, 1);
            var8.g(-1207444472, param2.field_k);
            var8.g(-1207444472, param2.field_g);
            var8.g(-1207444472, param2.field_h);
            var8.b(-79, param2.field_n);
            var8.b(-81, param2.field_e);
            var8.b(-120, param2.field_i);
            var8.b(-49, param2.field_f);
            var8.a(124, param2.field_r.length);
            for (var5 = 0; param2.field_r.length > var5; var5++) {
                var7.b(-61, param2.field_r[var5]);
            }
            var8.a(var4, false);
            var8.c(62, var8.field_n - var4);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mp.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private mp() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new int[128];
        field_k = "Trinkets";
        field_e = "Breaking real-world laws";
        field_p = new int[]{0, 1, 2};
        field_l = "(in auction)";
        field_n = "<col=ff0000>Warning:</col> This player's trinket slots are part of the member's expansion for Kickabout - subscribe to FunOrb to make use of them. Any trinkets this player has equipped will have no effect in the game.";
    }
}
