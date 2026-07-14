/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    static String field_c;
    static java.math.BigInteger field_a;
    static String field_d;
    static int[] field_e;
    static String field_f;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 5) {
          field_e = null;
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= 0) {
                    var4 = var4 + var2.substring(var3);
                }
                if (param1 > -83) {
                    Object var6 = null;
                    hr.a((java.applet.Applet) null, (byte) -44);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(jg.a(param0, false, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = param4 + 2 + 485 + 8 + param2 + 8;
        ad.field_c.a(var6 + -6, -6 + tg.field_c.field_mb, (byte) 82, 3, 3);
        var7 = ad.field_c.field_mb - 5;
        hi.field_o.a(487 + (param2 - -param4), param1, (byte) 69, -param1 + var7, 5);
        uq.field_j.a(-cg.field_C.field_K + -param2 + hi.field_o.field_K, param1, (byte) 116, 0, param2);
        var7 = var7 - (param1 + 2);
        cg.field_C.a(cg.field_C.field_K, param1, (byte) 95, 0, param2 + uq.field_j.field_K);
        ji.field_I.a(485 + param2 - (-2 - param4), 5, 5, 2, -123, -5 + var7, param4);
        if (wi.field_c == null) {
          var8 = -var6 + -param2 + tg.field_c.field_K;
          var9 = var8 / 2;
          if (param3 <= 19) {
            return;
          } else {
            var10 = param2 + (param0 + var9);
            var11 = 0;
            var12 = 0;
            L0: while (true) {
              if (-7 >= (var12 ^ -1)) {
                return;
              } else {
                L1: {
                  if (var12 >= 5) {
                    break L1;
                  } else {
                    if (null != oq.field_b[var12]) {
                      break L1;
                    } else {
                      var12++;
                      var12++;
                      continue L0;
                    }
                  }
                }
                var13 = (-4 + tg.field_c.field_mb) * var11 / (gq.field_d + 1) + 3;
                var11++;
                var7 = -var13 + var11 * (-4 + tg.field_c.field_mb) / (1 + gq.field_d) + 3 - 2;
                if (5 <= var12) {
                  pr.field_c.a(var8, var7, (byte) 46, var13, var6);
                  var12++;
                  continue L0;
                } else {
                  oq.field_b[var12].a(var8, var7, (byte) 115, var13, var6);
                  tb.field_a[var12].a(var9 - param2, var7, (byte) 118, 0, param2);
                  mr.field_d[var12].a(param0, -param5 + var7 - param5, (byte) 122, param5, var9);
                  n.field_n[var12].a(var8 - param2 + -var10, var7 + -param5 - param5, (byte) 52, param5, var10);
                  var12++;
                  continue L0;
                }
              }
            }
          }
        } else {
          wi.field_c.a(ji.field_I.field_db, ji.field_I.field_mb, (byte) 117, ji.field_I.field_hb, ji.field_I.field_K);
          var8 = -var6 + -param2 + tg.field_c.field_K;
          var9 = var8 / 2;
          if (param3 > 19) {
            var10 = param2 + (param0 + var9);
            var11 = 0;
            var12 = 0;
            if (-7 < (var12 ^ -1)) {
              if (var12 < 5) {
                if (null != oq.field_b[var12]) {
                  L2: {
                    var13 = (-4 + tg.field_c.field_mb) * var11 / (gq.field_d + 1) + 3;
                    var11++;
                    var7 = -var13 + var11 * (-4 + tg.field_c.field_mb) / (1 + gq.field_d) + 3 - 2;
                    if (5 <= var12) {
                      pr.field_c.a(var8, var7, (byte) 46, var13, var6);
                      break L2;
                    } else {
                      oq.field_b[var12].a(var8, var7, (byte) 115, var13, var6);
                      tb.field_a[var12].a(var9 - param2, var7, (byte) 118, 0, param2);
                      mr.field_d[var12].a(param0, -param5 + var7 - param5, (byte) 122, param5, var9);
                      n.field_n[var12].a(var8 - param2 + -var10, var7 + -param5 - param5, (byte) 52, param5, var10);
                      var12++;
                      break L2;
                    }
                  }
                  var12++;
                  var12++;
                  var12++;
                  var12++;
                  var12++;
                  return;
                } else {
                  var12++;
                  var12++;
                  var12++;
                  var12++;
                  var12++;
                  return;
                }
              } else {
                L3: {
                  var13 = (-4 + tg.field_c.field_mb) * var11 / (gq.field_d + 1) + 3;
                  var11++;
                  var7 = -var13 + var11 * (-4 + tg.field_c.field_mb) / (1 + gq.field_d) + 3 - 2;
                  if (5 <= var12) {
                    pr.field_c.a(var8, var7, (byte) 46, var13, var6);
                    break L3;
                  } else {
                    oq.field_b[var12].a(var8, var7, (byte) 115, var13, var6);
                    tb.field_a[var12].a(var9 - param2, var7, (byte) 118, 0, param2);
                    mr.field_d[var12].a(param0, -param5 + var7 - param5, (byte) 122, param5, var9);
                    n.field_n[var12].a(var8 - param2 + -var10, var7 + -param5 - param5, (byte) 52, param5, var10);
                    var12++;
                    break L3;
                  }
                }
                var12++;
                var12++;
                var12++;
                var12++;
                var12++;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = new java.math.BigInteger("65537");
        field_d = "Turns remaining: <%0>";
        field_f = "Please enter your age in years";
        field_e = new int[]{2, 21, 22, 7, 6, 13, 14};
    }
}
