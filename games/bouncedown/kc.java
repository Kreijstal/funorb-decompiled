/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static String field_d;
    static tg field_c;
    static String field_b;
    static int field_a;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = ag.a(param0, var4, false).getFile();
              ac.a(true, new Object[]{"home", var3 + "home.ws"}, param0, "updatelinks");
              ac.a(true, new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, "updatelinks");
              ac.a(true, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, "updatelinks");
              if (param1 != 27477) {
                return;
              }
              ac.a(true, new Object[]{"options", var3 + "options.ws"}, param0, "updatelinks");
              ac.a(true, new Object[]{"terms", var3 + "terms.ws"}, param0, "updatelinks");
              ac.a(true, new Object[]{"privacy", var3 + "privacy.ws"}, param0, "updatelinks");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("kc.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static tg[] a(boolean param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        tg[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        byte[] var12;
        int[] var13;
        byte[] var16;
        int[] var17;
        byte[] var21;
        int[] var10;
        int[] var22;
        var8 = Bounce.field_N;
        var1 = new tg[nj.field_p];
        for (var2 = 0; nj.field_p > var2; var2++) {
          var3 = ih.field_V[var2] * qh.field_i[var2];
          var21 = ph.field_c[var2];
          if (!lg.field_c[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = he.field_k[da.b(255, (int) var21[var6])];
            }
            var1[var2] = new tg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var22);
          } else {
            var16 = gk.field_g[var2];
            var12 = var16;
            var9 = var12;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = ge.a(he.field_k[da.b((int) var21[var7], 255)], da.b(var16[var7] << 24, -16777216));
            }
            var1[var2] = (tg) ((Object) new bg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var17));
          }
        }
        if (!param0) {
          field_c = (tg) null;
        }
        vb.a((byte) 122);
        return var1;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != 17345) {
          field_d = (String) null;
        }
    }

    final static void a(byte param0) {
        if (dh.field_a != null) {
          dh.field_a.a((byte) -70);
          dh.field_a = null;
        }
        if (param0 == 18) {
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        kc.a((java.applet.Applet) null, 67);
    }

    static {
        field_d = "Achievements";
        field_b = "Please enter your age in years";
    }
}
