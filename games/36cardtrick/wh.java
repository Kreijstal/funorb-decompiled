/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static lb field_a;

    final static boolean a(String param0, boolean param1) {
        if (param1) {
            String var3 = (String) null;
            boolean discarded$0 = wh.a((String) null, false);
        }
        return null != jf.a(0, param0) ? true : false;
    }

    final static int a(uh param0, int param1, int param2, ad param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Main.field_T;
          if (param0 == null) {
            break L0;
          } else {
            if (((uh) param0).field_q == null) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (((ad) param3).field_r == ((uh) param0).field_g) {
                  L1: {
                    var4 = ((ad) param3).field_o.length;
                    if (param2 <= -12) {
                      break L1;
                    } else {
                      field_a = (lb) null;
                      break L1;
                    }
                  }
                  var5 = ((uh) param0).field_q[param1].length / var4;
                  var6 = 0;
                  L2: while (true) {
                    if (var5 <= var6) {
                      return -1;
                    } else {
                      if ((((ad) param3).field_h ^ -1L) == (((uh) param0).field_j[param1][var6] ^ -1L)) {
                        if (rc.a(true, ((uh) param0).field_m[param1][var6])) {
                          var7 = 0;
                          L3: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (((uh) param0).field_q[param1][var6 * var4 - -var7] == ((ad) param3).field_o[var7]) {
                                var6 = var6;
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(String[] args, int param1) {
        if (null != db.field_a) {
            db.field_a.field_L.a(param1 ^ -84, args);
        }
        if (param1 != 61) {
            field_a = (lb) null;
        }
        if (ti.field_e != null) {
            ti.field_e.field_I.a(-102, args);
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
                var3 = var2.indexOf((int) (char)param1);
                var4 = "reload.ws";
                if (-1 >= (var3 ^ -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(fh.a(param0, var5, -1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        mi.field_c[91] = 42;
        mi.field_c[45] = 26;
        mi.field_c[47] = 73;
        mi.field_c[61] = 27;
        mi.field_c[92] = 74;
        mi.field_c[44] = 71;
        mi.field_c[59] = 57;
        mi.field_c[93] = 43;
        mi.field_c[46] = 72;
        mi.field_c[520] = 59;
        mi.field_c[param0] = 28;
        mi.field_c[222] = 58;
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Main.field_T;
        if (param4 <= 1) {
            java.applet.Applet var8 = (java.applet.Applet) null;
            wh.a((java.applet.Applet) null, -28);
        }
        for (var5 = 0; mb.field_c.length > var5; var5++) {
            param2 = mb.field_c[var5];
            var6 = var5 << -893323420;
            while (true) {
                param2--;
                if (0 == param2) {
                    break;
                }
                var6++;
                param1 = lf.field_a[var6];
                param3[param0[param1]] = param3[param0[param1]] + 1;
                lf.field_a[param3[param0[param1]]] = param1;
            }
        }
    }

    public static void b(int param0) {
        if (param0 <= 115) {
            field_a = (lb) null;
        }
        field_a = null;
    }

    final static String a(byte param0) {
        if (param0 != -108) {
            String discarded$0 = wh.a((byte) -115);
        }
        if (k.field_b) {
            return null;
        }
        if (Main.field_G < ek.field_e) {
            return null;
        }
        if (Main.field_G >= ek.field_e + ra.field_e) {
            return null;
        }
        return t.field_e;
    }

    static {
    }
}
