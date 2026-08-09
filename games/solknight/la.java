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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = "";
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if ((param2 ^ -1) == -2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = param3[param1];
                        var4 = var10;
                        if (var4 != null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = "null";
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        stackIn_11_0 = var10.toString();
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var4_int = param2 + param1;
                        var5 = 0;
                        var6_int = -127 % ((-30 - param0) / 60);
                        var7 = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = param3[var7];
                        var8 = var11;
                        if (var8 != null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 += 4;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = var5 + var11.length();
                        if (var9 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 += 4;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = new StringBuilder(var5);
                        var7 = param1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4_int <= var7) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = param3[var7];
                        var8 = var12;
                        if (var8 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        discarded$0 = var6.append(var12);
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        discarded$1 = var6.append("null");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        discarded$2 = var6.append("null");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var6.toString();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var4_ref);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("la.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param3 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw fc.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param0.getCodeBase();
                    var3 = kk.a(127, var4, param0).getFile();
                    fd.a(-4476, param0, "updatelinks", new Object[]{"home", var3 + "home.ws"});
                    fd.a(-4476, param0, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"});
                    fd.a(-4476, param0, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    fd.a(-4476, param0, "updatelinks", new Object[]{"options", var3 + "options.ws"});
                    fd.a(-4476, param0, "updatelinks", new Object[]{"terms", var3 + "terms.ws"});
                    if (param1) {
                      fd.a(-4476, param0, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"});
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
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("la.G(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        java.applet.Applet var3;
        var1 = bf.b((byte) -37);
        var2 = vb.a((byte) -76);
        he.field_c.a(false, var1 - -(pg.field_b << 345008161), -fh.field_b + th.field_J, (fh.field_b << -1550261855) + var2, pk.field_ab - pg.field_b);
        ee.d(-4537);
        if (param0 < 14) {
          var3 = (java.applet.Applet) null;
          la.a((java.applet.Applet) null, false);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Color param1, int param2, boolean param3, String param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var10 = dc.field_q.getGraphics();
                  if (ce.field_f != null) {
                    break L2;
                  } else {
                    ce.field_f = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param3) {
                    var10.setColor(java.awt.Color.black);
                    var10.fillRect(0, 0, ec.field_h, cf.field_d);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (rc.field_r == null) {
                        rc.field_r = dc.field_q.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var11 = rc.field_r.getGraphics();
                      var11.setColor(param1);
                      var11.drawRect(0, 0, 303, 33);
                      var11.fillRect(2, 2, param0 * 3, 30);
                      var11.setColor(java.awt.Color.black);
                      var11.drawRect(1, 1, 301, 31);
                      if (param2 > 12) {
                        break L7;
                      } else {
                        var9 = (String) null;
                        la.a(-68, (java.awt.Color) null, 81, true, (String) null);
                        break L7;
                      }
                    }
                    var11.fillRect(2 + 3 * param0, 2, 300 - param0 * 3, 30);
                    var11.setFont(ce.field_f);
                    var11.setColor(java.awt.Color.white);
                    var11.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                    var10.drawImage(rc.field_r, ec.field_h / 2 + -152, -18 + cf.field_d / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
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
                    break L8;
                  }
                }
                if (null == ba.field_o) {
                  break L1;
                } else {
                  var10.setFont(ce.field_f);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(ba.field_o, ec.field_h / 2 - ba.field_o.length() * 6 / 2, -26 + cf.field_d / 2);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              dc.field_q.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("la.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    final static void a(int param0, int param1, bl param2) {
        jd var5 = id.field_c;
        var5.e(param1, -2147483648);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.c(20, 1);
        var5.c(31, param2.field_n);
        var5.c(param0 ^ -104, param2.field_j);
        var5.b(param2.field_q, false);
        var5.b(param2.field_h, false);
        if (param0 != 0) {
            return;
        }
        try {
            var5.b(param2.field_o, false);
            var5.b(param2.field_l, false);
            var5.b(true, var4);
            var5.b(1, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "la.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        this.field_h = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, mg param4, hi param5, int param6, int param7, int param8, int param9, int param10, int param11, mg param12, int param13, int param14, int param15, hi param16, int param17, hi param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            lj.a(param14, (byte) 127, param12, param4);
            rj.a(param17, param10, (byte) 106, param19, param0);
            qk.a(param1, param3, -102);
            ug.a(param18, param8, param20, param6, (byte) 117, param5);
            if (param11 <= -89) {
              lc.a(5292, param13, param7, param16);
              ga.b(param15, param9, false, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param19 + ',' + param20 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_j = null;
        field_m = "This password contains your Player Name, and would be easy to guess";
        field_k = 256;
        field_l = new ff(15, 0, 1, 0);
    }
}
