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
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
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
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2 == 1) {
                var11 = param3[param1];
                var4_ref = var11;
                if (var4_ref != null) {
                  stackOut_10_0 = ((Object) (Object) var11).toString();
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                var4_int = param2 + param1;
                var5 = 0;
                var6_int = -127 % ((-30 - param0) / 60);
                var7 = param1;
                L1: while (true) {
                  if (var4_int <= var7) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      var10 = param1;
                      var7 = var10;
                      if (var4_int <= var10) {
                        break L2;
                      } else {
                        L3: {
                          var13 = param3[var10];
                          var8 = var13;
                          if (var8 == null) {
                            StringBuilder discarded$2 = var6.append("null");
                            var10++;
                            break L3;
                          } else {
                            StringBuilder discarded$3 = var6.append(var13);
                            var10++;
                            break L3;
                          }
                        }
                        var10++;
                        var10++;
                        break L2;
                      }
                    }
                    stackOut_29_0 = var6.toString();
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    L4: {
                      var12 = param3[var7];
                      var8 = var12;
                      if (var8 == null) {
                        var5 += 4;
                        var7++;
                        break L4;
                      } else {
                        var5 = var5 + var12.length();
                        var7++;
                        var7++;
                        break L4;
                      }
                    }
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("la.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
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
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("la.G(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = bf.b((byte) -37);
        int var2 = vb.a((byte) -76);
        he.field_c.a(false, var1 - -(pg.field_b << 1), -fh.field_b + th.field_J, (fh.field_b << 1) + var2, pk.field_ab - pg.field_b);
        ee.d(-4537);
    }

    final static void a(int param0, java.awt.Color param1, int param2, boolean param3, String param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                        var9 = null;
                        la.a(-68, (java.awt.Color) null, 81, true, (String) null);
                        break L7;
                      }
                    }
                    var11.fillRect(2 + 3 * param0, 2, 300 - param0 * 3, 30);
                    var11.setFont(ce.field_f);
                    var11.setColor(java.awt.Color.white);
                    var11.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                    boolean discarded$1 = var10.drawImage(rc.field_r, ec.field_h / 2 + -152, -18 + cf.field_d / 2, (java.awt.image.ImageObserver) null);
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
            stackOut_20_0 = (RuntimeException) var5_ref;
            stackOut_20_1 = new StringBuilder().append("la.E(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
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
            int discarded$0 = var5.b(true, var4);
            var5.b(1, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "la.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        field_m = null;
        field_l = null;
    }

    la(int param0) {
        ((la) this).field_h = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, mg param4, hi param5, int param6, int param7, int param8, int param9, int param10, int param11, mg param12, int param13, int param14, int param15, hi param16, int param17, hi param18, int param19, int param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            lj.a(param14, (byte) 127, param12, param4);
            rj.a(param17, param10, (byte) 106, param19, param0);
            qk.a(param1, param3, -102);
            ug.a(param18, param8, param20, param6, (byte) 117, param5);
            if (param11 <= -89) {
              lc.a(5292, param13, param7, param16);
              ga.b(param15, param9, false, param2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var21;
            stackOut_4_1 = new StringBuilder().append("la.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param12 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param13).append(44).append(param14).append(44).append(param15).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param16 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param17).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param18 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param19 + 44 + param20 + 41);
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
