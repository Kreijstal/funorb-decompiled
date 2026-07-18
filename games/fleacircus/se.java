/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static dd[] field_a;
    static mg field_c;
    static String field_e;
    static String field_f;
    static boolean[] field_d;
    static int field_b;

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param2) {
              stackOut_3_0 = pb.field_e.b(param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = lj.field_a.b(param1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("se.A(").append(3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        try {
            if (em.field_g == null) {
                em.field_g = new nd(nb.field_a, rh.field_e);
                nb.field_a.b((qa) (Object) em.field_g, (byte) -35);
            }
            em.field_g.a(param0, param3, param2, -122);
            gb.c();
            kb.a(0, true);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "se.B(" + (param0 != null ? "{...}" : "null") + ',' + 121 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fi var4_ref_fi = null;
        int var4 = 0;
        ql var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ih var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var10 = ae.field_a;
            if (param0 <= -94) {
              L1: {
                var2 = var10.e(false);
                var3 = var10.e(false);
                if (var2 != 0) {
                  if (var2 != 1) {
                    ud.a("LR1: " + ak.a(true), (Throwable) null, 0);
                    k.c(-28354);
                    break L1;
                  } else {
                    var4 = var10.a(255);
                    var5 = (ql) (Object) sd.field_d.c((byte) 47);
                    L2: while (true) {
                      L3: {
                        if (var5 == null) {
                          break L3;
                        } else {
                          L4: {
                            if (var5.field_i != var3) {
                              break L4;
                            } else {
                              if (var5.field_m == var4) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5 = (ql) (Object) sd.field_d.b((byte) -105);
                          continue L2;
                        }
                      }
                      if (var5 == null) {
                        k.c(-28354);
                        return;
                      } else {
                        var5.c(-1);
                        break L1;
                      }
                    }
                  }
                } else {
                  var4_ref_fi = (fi) (Object) lk.field_O.c((byte) 47);
                  if (var4_ref_fi == null) {
                    k.c(-28354);
                    return;
                  } else {
                    L5: {
                      var5_int = -var10.field_i + pd.field_l;
                      var14 = var4_ref_fi.field_m;
                      var13 = var14;
                      var12 = var13;
                      var11 = var12;
                      var6 = var11;
                      if (var5_int > var14.length << 2) {
                        var5_int = var14.length << 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var7 = 0;
                    L6: while (true) {
                      if (var7 >= var5_int) {
                        var4_ref_fi.field_p = true;
                        var4_ref_fi.c(-1);
                        break L1;
                      } else {
                        var6[var7 >> 2] = var6[var7 >> 2] + (var10.e(false) << sc.a(768, var7 << 8));
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "se.E(" + param0 + ')');
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, byte param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ol.field_e.getGraphics();
                  if (null == ic.field_bb) {
                    ic.field_bb = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param3) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, ki.field_a, gm.field_nb);
                    break L3;
                  }
                }
                L4: {
                  if (param1 == null) {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (bd.field_kb != null) {
                        break L6;
                      } else {
                        bd.field_kb = ol.field_e.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = bd.field_kb.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param0, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(3 * param0 + 2, 2, 300 - param0 * 3, 30);
                    var10.setFont(ic.field_bb);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (304 + -(6 * param2.length())) / 2, 22);
                    boolean discarded$1 = var9.drawImage(bd.field_kb, -152 + ki.field_a / 2, -18 + gm.field_nb / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = ki.field_a / 2 + -152;
                    var8 = gm.field_nb / 2 - 18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, 1 + var8, 301, 31);
                    var9.fillRect(2 + (var7 - -(param0 * 3)), var8 - -2, 300 - param0 * 3, 30);
                    var9.setFont(ic.field_bb);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, var7 - -((304 + -(6 * param2.length())) / 2), var8 - -22);
                    break L7;
                  }
                }
                L8: {
                  if (null == vi.field_b) {
                    break L8;
                  } else {
                    var9.setFont(ic.field_bb);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(vi.field_b, ki.field_a / 2 - 6 * vi.field_b.length() / 2, -26 + gm.field_nb / 2);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ol.field_e.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("se.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L10;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L10;
            }
          }
          L11: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L11;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L11;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ',' + -81 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_e = "Login: ";
        field_c = new mg();
        field_b = 16822275;
    }
}
