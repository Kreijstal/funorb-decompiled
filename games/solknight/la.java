/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends gg {
    static af field_i;
    static String field_m;
    static nc field_j;
    static boolean field_n;
    int field_h;
    static ff field_l;
    static int field_k;

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param2 == 0) {
          return "";
        } else {
          if ((param2 ^ -1) == -2) {
            var11 = param3[param1];
            var4_ref = var11;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var11).toString();
            }
          } else {
            var4 = param2 + param1;
            var5 = 0;
            var6_int = -127 % ((-30 - param0) / 60);
            var7 = param1;
            L0: while (true) {
              if (var4 <= var7) {
                L1: {
                  var6 = new StringBuilder(var5);
                  var10 = param1;
                  var7 = var10;
                  if (var4 <= var10) {
                    break L1;
                  } else {
                    L2: {
                      var13 = param3[var10];
                      var8 = var13;
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var10++;
                        break L2;
                      } else {
                        StringBuilder discarded$3 = var6.append(var13);
                        var10++;
                        break L2;
                      }
                    }
                    var10++;
                    var10++;
                    break L1;
                  }
                }
                return var6.toString();
              } else {
                var12 = param3[var7];
                var8 = var12;
                if (var8 == null) {
                  var5 += 4;
                  var7++;
                  var7++;
                  continue L0;
                } else {
                  var5 = var5 + var12.length();
                  var7++;
                  var7++;
                  var7++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var4 = param0.getCodeBase();
              var3 = kk.a(127, var4, param0).getFile();
              Object discarded$6 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              Object discarded$7 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              Object discarded$8 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              Object discarded$9 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              Object discarded$10 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              if (param1) {
                Object discarded$11 = fd.a(-4476, param0, "updatelinks", new Object[2]);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        var1 = bf.b((byte) -37);
        var2 = vb.a((byte) -76);
        he.field_c.a(false, var1 - -(pg.field_b << 345008161), -fh.field_b + th.field_J, (fh.field_b << -1550261855) + var2, pk.field_ab - pg.field_b);
        ee.d(-4537);
        if (param0 < 14) {
          var3 = null;
          la.a((java.applet.Applet) null, false);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Color param1, int param2, boolean param3, String param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var10 = dc.field_q.getGraphics();
                        if (ce.field_f != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ce.field_f = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var10.setColor(java.awt.Color.black);
                        var10.fillRect(0, 0, ec.field_h, cf.field_d);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param1 = new java.awt.Color(140, 17, 17);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (rc.field_r == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        rc.field_r = dc.field_q.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = rc.field_r.getGraphics();
                        var11.setColor(param1);
                        var11.drawRect(0, 0, 303, 33);
                        var11.fillRect(2, 2, param0 * 3, 30);
                        var11.setColor(java.awt.Color.black);
                        var11.drawRect(1, 1, 301, 31);
                        if (param2 > 12) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = null;
                        la.a(-68, (java.awt.Color) null, 81, true, (String) null);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11.fillRect(2 + 3 * param0, 2, 300 - param0 * 3, 30);
                        var11.setFont(ce.field_f);
                        var11.setColor(java.awt.Color.white);
                        var11.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                        boolean discarded$1 = var10.drawImage(rc.field_r, ec.field_h / 2 + -152, -18 + cf.field_d / 2, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = ec.field_h / 2 + -152;
                        var8 = -18 + cf.field_d / 2;
                        var10.setColor(param1);
                        var10.drawRect(var7, var8, 303, 33);
                        var10.fillRect(var7 + 2, var8 + 2, 3 * param0, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(var7 - -1, var8 + 1, 301, 31);
                        var10.fillRect(var7 + 2 - -(param0 * 3), var8 - -2, -(3 * param0) + 300, 30);
                        var10.setFont(ce.field_f);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param4, var7 - -((304 + -(6 * param4.length())) / 2), 22 + var8);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == ba.field_o) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10.setFont(ce.field_f);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(ba.field_o, ec.field_h / 2 - ba.field_o.length() * 6 / 2, -26 + cf.field_d / 2);
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    dc.field_q.repaint();
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, bl param2) {
        int var4 = 0;
        jd var5 = null;
        var5 = id.field_c;
        var5.e(param1, -2147483648);
        var5.field_m = var5.field_m + 1;
        var4 = var5.field_m;
        var5.c(20, 1);
        var5.c(31, param2.field_n);
        var5.c(param0 ^ -104, param2.field_j);
        var5.b(param2.field_q, false);
        var5.b(param2.field_h, false);
        if (param0 != 0) {
          return;
        } else {
          var5.b(param2.field_o, false);
          var5.b(param2.field_l, false);
          int discarded$1 = var5.b(true, var4);
          var5.b(1, -var4 + var5.field_m);
          return;
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        if (param0 != 74) {
          field_k = 85;
          field_m = null;
          field_l = null;
          return;
        } else {
          field_m = null;
          field_l = null;
          return;
        }
    }

    la(int param0) {
        ((la) this).field_h = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, mg param4, hi param5, int param6, int param7, int param8, int param9, int param10, int param11, mg param12, int param13, int param14, int param15, hi param16, int param17, hi param18, int param19, int param20) {
        lj.a(param14, (byte) 127, param12, param4);
        rj.a(param17, param10, (byte) 106, param19, param0);
        qk.a(param1, param3, -102);
        ug.a(param18, param8, param20, param6, (byte) 117, param5);
        if (param11 > -89) {
          return;
        } else {
          lc.a(5292, param13, param7, param16);
          ga.b(param15, param9, false, param2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_m = "This password contains your Player Name, and would be easy to guess";
        field_k = 256;
        field_l = new ff(15, 0, 1, 0);
    }
}
