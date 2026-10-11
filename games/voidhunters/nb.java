/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends rqa {
    static String field_o;

    nb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(195, 62, param0[0].a(23));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return false;
        }
        stackIn_7_0 = (qmb.field_q >= 10) && (!cgb.field_a) && (!wh.g(-115));
        return stackIn_7_0;
    }

    final static void e(byte param0) {
        int var5 = 0;
        int stackIn_31_0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1 = null;
        lta var2 = null;
        int var3 = 0;
        wfb var3_ref_wfb = null;
        int var4 = 0;
        Exception var4_ref_Exception = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        String var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        String var20 = null;
        wfb var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var14 = VoidHunters.field_G;
        try {
          og.field_r.GA(0);
          if (param0 != 102) {
            return;
          }
          var16 = "Component editor";
          pm.a(ip.field_p.width / 2 - (tea.a(1, var16, param0 ^ 13905) >> 1), -1, 30, var16, 1, 16756480, (byte) -94);
          var2 = new lta();
          var2.field_b = de.field_o;
          var2.field_c = gt.field_p;
          var2.field_a = ql.field_o;
          if (fe.field_p == -1) {
            var3 = 4 * -fnb.field_b;
            var4 = fnb.field_b / 2;
            var30 = uca.a(var4, (byte) 9, new int[]{3, 4, 6, 8, 6, 4, 6, 8, 6, 4, 6, 8, 9, 10, 0, 2, 0, 10, 0, 2, 0, 10, 0}, var3);
            var22 = new wfb(var30, 0, 0);
            ta.a(var30, param0 + 12, var22);
            var22.a(102, 15);
            fr.a(var2, var22, false);
          } else {
            var3_ref_wfb = hab.field_g[fe.field_p];
            if (var3_ref_wfb != null) {
              fr.a(var2, var3_ref_wfb, false);
              try {
                if (au.field_c == 1) {
                  for (var4 = 0; var4 < hw.field_d.length; var4++) {
                    var29 = hw.field_d[var4];
                    if (var29.length > 0) {
                      var15 = new int[var29.length << 1];
                      var24 = var15;
                      var18 = var24;
                      var6 = var18;
                      for (var7 = 0; var7 < var29.length; var7++) {
                        var15[var7 << 1] = var2.a(var3_ref_wfb.field_v[var29[var7] << 1], (byte) 119);
                        var15[(var7 << 1) + 1] = var2.b(true, var3_ref_wfb.field_v[1 + (var29[var7] << 1)]);
                      }
                      for (var7 = 0; var7 < var24.length; var7 += 2) {
                        var8 = var24[var7];
                        var9 = var6[var7 + 1];
                        var10 = var6[(var7 + 2) % var24.length];
                        var11 = var6[(3 + var7) % var24.length];
                        c.a(var11, var10, var8, var9, -16777216, 16711935);
                      }
                      rj.a(og.field_r, var24, -16777216 | (1 + var4) * 16436957);
                    }
                  }
                } else {
                  if (au.field_c == 2) {
                    var4 = 0;
                    if (var3_ref_wfb.field_k) {
                      var4 = -2;
                    }
                    for (var5 = 0; uob.field_g.length > var5; var5++) {
                      var25 = uob.field_g[var5];
                      var19 = var25;
                      var6 = var19;
                      stackIn_31_0 = (var5 != uob.field_g.length - 1) ? 0 : 1;
                      var7 = stackIn_31_0;
                      var8 = 16777215;
                      if (var7 == 0) {
                        var8 = 11184810;
                      }
                      for (var9 = 0; var9 < var4 + var25.length; var9 += 2) {
                        var10 = var25[var9];
                        var11 = var6[var9 + 1];
                        var12 = var6[(var9 + 2) % var25.length];
                        var13 = var6[(3 + var9) % var25.length];
                        c.a(var2.b(true, var13), var2.a(var12, (byte) 121), var2.a(var10, (byte) 121), var2.b(true, var11), -16777216, var8);
                        if (var3_ref_wfb.field_k) {
                          c.a(var2.b(true, -var13), var2.a(var12, (byte) 123), var2.a(var10, (byte) 126), var2.b(true, -var11), -16777216, var8);
                        }
                      }
                      if (var7 != 0) {
                        for (var9 = 0; var9 < var25.length; var9 += 2) {
                          var10 = var25[var9];
                          var11 = var6[var9 + 1];
                          kq.a(2.0f, (byte) 64, var2.b(true, var11), 16711935, var2.a(var10, (byte) 126));
                        }
                      }
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref_Exception = (Exception) (Object) decompiledCaughtException;
                var4_ref_Exception.printStackTrace();
              }
            }
            var20 = obb.field_o[fe.field_p];
            cka.a(-1, var20, 16763904, 80, 320 - kga.a(120, var20) / 2, param0 + 4164);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "nb.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          nb.e((byte) 14);
        }
        field_o = null;
    }

    static {
        field_o = "CHAT";
    }
}
