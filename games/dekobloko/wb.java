/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends w {
    String field_Pb;
    w field_Sb;
    static int field_Rb;
    w field_Wb;
    String field_Vb;
    static int[] field_Zb;
    int field_Xb;
    static Boolean field_Ub;
    static fm field_Nb;
    w field_Yb;
    String field_Tb;
    String field_Ob;
    static String[] field_Qb;

    final static void a(kc param0, int param1, int param2) {
        uf var3 = null;
        var3 = we.field_b;
        var3.f(param1, param2 + -64);
        if (param2 != 60) {
          field_Nb = null;
          var3.a(true, 5);
          var3.a(true, 0);
          var3.d(param2 ^ -61, param0.field_n);
          var3.a(true, param0.field_o);
          var3.a(true, param0.field_v);
          return;
        } else {
          var3.a(true, 5);
          var3.a(true, 0);
          var3.d(param2 ^ -61, param0.field_n);
          var3.a(true, param0.field_o);
          var3.a(true, param0.field_v);
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                if (param1 != 30307) {
                    field_Rb = 64;
                }
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (0 <= var3) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(gn.a(var5, -1, param0), "_self");
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
        L0: {
          var12 = client.field_A ? 1 : 0;
          if (hk.field_c <= param1) {
            break L0;
          } else {
            param5 = param5 - (-param1 + hk.field_c);
            param1 = hk.field_c;
            break L0;
          }
        }
        L1: {
          if (param1 + param5 > hk.field_g) {
            param5 = hk.field_g + -param1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (hk.field_h <= param3) {
            break L2;
          } else {
            param2 = param2 - (-param3 + hk.field_h);
            param3 = hk.field_h;
            break L2;
          }
        }
        L3: {
          if (param3 + param2 <= hk.field_b) {
            break L3;
          } else {
            param2 = -param3 + hk.field_b;
            break L3;
          }
        }
        if (0 < param5) {
          if (param2 > 0) {
            var6 = param3 * hk.field_j + param1;
            if (param0 != 31) {
              field_Qb = null;
              var7 = -param5 + hk.field_j;
              param3 = -param2;
              L4: while (true) {
                if (-1 >= param3) {
                  return;
                } else {
                  param1 = -param5;
                  L5: while (true) {
                    if (-1 <= param1) {
                      var6 = var6 + var7;
                      param3++;
                      continue L4;
                    } else {
                      var8 = hk.field_l[var6];
                      if ((65280 & var8) >> 1753310408 > param4) {
                        if ((255 & var8 >> 459642768) <= (var8 >> -1566086360 & 255)) {
                          L6: {
                            var9 = ((16711680 & var8) >> -1904407857) - 60;
                            if (-256 > (var9 ^ -1)) {
                              var9 = 255;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = (var10 >> -14574239) + -(var10 >> -1326998683) & 65280;
                          var11 = 31 & var8 >> 44010979;
                          hk.field_l[var6] = de.b(var11, de.b(var9 << -1621456400, var10));
                          var6++;
                          param1++;
                          continue L5;
                        } else {
                          var6++;
                          param1++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        param1++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              var7 = -param5 + hk.field_j;
              param3 = -param2;
              L7: while (true) {
                if (-1 >= param3) {
                  return;
                } else {
                  param1 = -param5;
                  L8: while (true) {
                    if (-1 <= param1) {
                      var6 = var6 + var7;
                      param3++;
                      continue L7;
                    } else {
                      var8 = hk.field_l[var6];
                      if ((65280 & var8) >> 1753310408 > param4) {
                        if ((255 & var8 >> 459642768) <= (var8 >> -1566086360 & 255)) {
                          L9: {
                            var9 = ((16711680 & var8) >> -1904407857) - 60;
                            if (-256 > (var9 ^ -1)) {
                              var9 = 255;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = (var10 >> -14574239) + -(var10 >> -1326998683) & 65280;
                          var11 = 31 & var8 >> 44010979;
                          hk.field_l[var6] = de.b(var11, de.b(var9 << -1621456400, var10));
                          var6++;
                          param1++;
                          continue L8;
                        } else {
                          var6++;
                          param1++;
                          continue L8;
                        }
                      } else {
                        var6++;
                        param1++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        if (param0 >= -73) {
          field_Zb = null;
          field_Qb = null;
          field_Zb = null;
          field_Nb = null;
          field_Ub = null;
          return;
        } else {
          field_Qb = null;
          field_Zb = null;
          field_Nb = null;
          field_Ub = null;
          return;
        }
    }

    final static int b(byte param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        var2 = param1 >>> -691332351;
        var2 = var2 | var2 >>> 285134945;
        if (param0 > -77) {
          var3 = null;
          wb.a((kc) null, -48, 106);
          var2 = var2 | var2 >>> 2037729058;
          var2 = var2 | var2 >>> -501559868;
          var2 = var2 | var2 >>> -1143914328;
          var2 = var2 | var2 >>> -1995022320;
          return param1 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> 2037729058;
          var2 = var2 | var2 >>> -501559868;
          var2 = var2 | var2 >>> -1143914328;
          var2 = var2 | var2 >>> -1995022320;
          return param1 & (var2 ^ -1);
        }
    }

    wb() {
        super(0L, (w) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = null;
    }
}
