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
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var4 = param0.getCodeBase();
              var3 = ag.a(param0, var4, false).getFile();
              Object discarded$6 = ac.a(true, new Object[2], param0, "updatelinks");
              Object discarded$7 = ac.a(true, new Object[2], param0, "updatelinks");
              Object discarded$8 = ac.a(true, new Object[2], param0, "updatelinks");
              if (param1 == 27477) {
                Object discarded$9 = ac.a(true, new Object[2], param0, "updatelinks");
                Object discarded$10 = ac.a(true, new Object[2], param0, "updatelinks");
                Object discarded$11 = ac.a(true, new Object[2], param0, "updatelinks");
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
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
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Bounce.field_N;
        var1 = new tg[nj.field_p];
        var2 = 0;
        L0: while (true) {
          if (nj.field_p <= var2) {
            if (!param0) {
              field_c = null;
              vb.a((byte) 122);
              return var1;
            } else {
              vb.a((byte) 122);
              return var1;
            }
          } else {
            var3 = ih.field_V[var2] * qh.field_i[var2];
            var23 = ph.field_c[var2];
            if (!lg.field_c[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new tg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var26);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = he.field_k[da.b(255, (int) var23[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var24 = gk.field_g[var2];
              var20 = var24;
              var16 = var20;
              var12 = var16;
              var9 = var12;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (tg) (Object) new bg(se.field_C, fk.field_e, cl.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var25);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ge.a(he.field_k[da.b((int) var23[var7], 255)], da.b(var24[var7] << 77555800, -16777216));
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
            field_d = null;
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
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
          var2 = null;
          kc.a((java.applet.Applet) null, 67);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Achievements";
        field_b = "Please enter your age in years";
    }
}
