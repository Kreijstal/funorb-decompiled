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
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param0.getCodeBase();
                    var3 = ag.a(param0, var4, false).getFile();
                    discarded$6 = ac.a(true, new Object[]{"home", var3 + "home.ws"}, param0, "updatelinks");
                    discarded$7 = ac.a(true, new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, "updatelinks");
                    discarded$8 = ac.a(true, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, "updatelinks");
                    if (param1 == 27477) {
                      discarded$9 = ac.a(true, new Object[]{"options", var3 + "options.ws"}, param0, "updatelinks");
                      discarded$10 = ac.a(true, new Object[]{"terms", var3 + "terms.ws"}, param0, "updatelinks");
                      discarded$11 = ac.a(true, new Object[]{"privacy", var3 + "privacy.ws"}, param0, "updatelinks");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("kc.B(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static tg[] a(boolean param0) {
        tg[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var12 = null;
        int[] var13 = null;
        byte[] var16 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var22 = null;
        var8 = Bounce.field_N;
        var1 = new tg[nj.field_p];
        var2 = 0;
        L0: while (true) {
          if (nj.field_p <= var2) {
            if (!param0) {
              field_c = (tg) null;
              vb.a((byte) 122);
              return var1;
            } else {
              vb.a((byte) 122);
              return var1;
            }
          } else {
            var3 = ih.field_V[var2] * qh.field_i[var2];
            var21 = ph.field_c[var2];
            if (!lg.field_c[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new tg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = he.field_k[da.b(255, (int) var21[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var16 = gk.field_g[var2];
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (tg) ((Object) new bg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var17));
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ge.a(he.field_k[da.b((int) var21[var7], 255)], da.b(var16[var7] << 77555800, -16777216));
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
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
        java.applet.Applet var2 = null;
        L0: {
          if (dh.field_a != null) {
            dh.field_a.a((byte) -70);
            dh.field_a = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 18) {
          var2 = (java.applet.Applet) null;
          kc.a((java.applet.Applet) null, 67);
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "Achievements";
        field_b = "Please enter your age in years";
    }
}
