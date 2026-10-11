/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends java.awt.Canvas {
    private java.awt.Component field_c;
    static int field_b;
    static rk field_f;
    static String field_e;
    static int[] field_d;
    static String field_a;

    hi(java.awt.Component param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        rb var16 = null;
        rb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = StarCannon.field_A;
        try {
          var16 = new rb(param0);
          var17 = var16;
          var17.field_g = -2 + param0.length;
          bj.field_b = var17.i(-1174051992);
          hc.field_a = new boolean[bj.field_b];
          gh.field_C = new int[bj.field_b];
          gg.field_d = new int[bj.field_b];
          ac.field_d = new byte[bj.field_b][];
          og.field_c = new byte[bj.field_b][];
          qd.field_H = new int[bj.field_b];
          fc.field_d = new int[bj.field_b];
          var17.field_g = -(bj.field_b * 8) + (-7 + param0.length);
          td.field_m = var17.i(-1174051992);
          gb.field_w = var17.i(-1174051992);
          var3 = 1 + (255 & var17.j(7909));
          for (var4 = 0; bj.field_b > var4; var4++) {
            fc.field_d[var4] = var16.i(param1 - 1174051992);
          }
          for (var4Lifetime1 = 0; bj.field_b > var4Lifetime1; var4Lifetime1++) {
            qd.field_H[var4Lifetime1] = var17.i(-1174051992);
          }
          for (var4Lifetime2 = 0; bj.field_b > var4Lifetime2; var4Lifetime2++) {
            gg.field_d[var4Lifetime2] = var17.i(-1174051992);
          }
          for (var4Lifetime3 = 0; bj.field_b > var4Lifetime3; var4Lifetime3++) {
            gh.field_C[var4Lifetime3] = var17.i(-1174051992);
          }
          var17.field_g = -((-1 + var3) * 3) + (-7 + param0.length) - 8 * bj.field_b;
          of.field_g = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            of.field_g[var4Lifetime4] = var17.g(-115);
            if (of.field_g[var4Lifetime4] == 0) {
              of.field_g[var4Lifetime4] = 1;
            }
          }
          var17.field_g = 0;
          for (var4Lifetime5 = param1; var4Lifetime5 < bj.field_b; var4Lifetime5++) {
            var5 = gg.field_d[var4Lifetime5];
            var6 = gh.field_C[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            og.field_c[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ac.field_d[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.j(7909);
            if ((1 & var11) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.a(false);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.a(false);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_30_0 = var10;
                  if (var13 == -1) {
                    stackIn_31_1 = 0;
                  } else {
                    stackIn_31_1 = 1;
                  }
                  var10 = stackIn_30_0 | stackIn_31_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var17.a(false);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.a(false);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_46_0 = var10;
                    if (var14 == -1) {
                      stackIn_47_1 = 0;
                    } else {
                      stackIn_47_1 = 1;
                    }
                    var10 = stackIn_46_0 | stackIn_47_1;
                  }
                }
              }
            }
            hc.field_a[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("hi.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != 56) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hi.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hi.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            vk.field_v = param1;
            try {
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param0 == param1.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              mb.a("document.cookie=\"" + var5 + "\"", param2, 790);
            } catch (Throwable throwable) {
            }
            lj.a(816415832, param2);
          } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = new rk();
        field_e = "Email address is unavailable";
        field_d = new int[8192];
        field_a = null;
    }
}
