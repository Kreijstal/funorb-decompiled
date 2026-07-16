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
        if (param0 != 3) {
            field_c = null;
        }
        if (param2) {
            return lj.field_a.b(param1);
        }
        return pb.field_e.b(param1);
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        if (param1 < 108) {
            return;
        }
        if (em.field_g == null) {
            em.field_g = new nd(nb.field_a, rh.field_e);
            nb.field_a.b((qa) (Object) em.field_g, (byte) -35);
        }
        em.field_g.a(param0, param3, param2, -122);
        gb.c();
        kb.a(0, true);
    }

    final static void a(int param0) {
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
        var8 = fleas.field_A ? 1 : 0;
        var10 = ae.field_a;
        if (param0 <= -94) {
          L0: {
            var2 = var10.e(false);
            var3 = var10.e(false);
            if (-1 != (var2 ^ -1)) {
              if ((var2 ^ -1) != -2) {
                ud.a("LR1: " + ak.a(true), (Throwable) null, 0);
                k.c(-28354);
                break L0;
              } else {
                var4 = var10.a(255);
                var5 = (ql) (Object) sd.field_d.c((byte) 47);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_i != var3) {
                          break L3;
                        } else {
                          if (var5.field_m == var4) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = (ql) (Object) sd.field_d.b((byte) -105);
                      continue L1;
                    }
                  }
                  if (var5 == null) {
                    k.c(-28354);
                    return;
                  } else {
                    var5.c(-1);
                    break L0;
                  }
                }
              }
            } else {
              var4_ref_fi = (fi) (Object) lk.field_O.c((byte) 47);
              if (var4_ref_fi == null) {
                k.c(-28354);
                return;
              } else {
                L4: {
                  var5_int = -var10.field_i + pd.field_l;
                  var14 = var4_ref_fi.field_m;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5_int > var14.length << -935529886) {
                    var5_int = var14.length << -725528670;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_fi.field_p = true;
                    var4_ref_fi.c(-1);
                    break L0;
                  } else {
                    var6[var7 >> 1659577602] = var6[var7 >> 1659577602] + (var10.e(false) << sc.a(768, var7 << 1904173800));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, byte param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = ol.field_e.getGraphics();
              if (null == ic.field_bb) {
                ic.field_bb = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param3) {
                break L2;
              } else {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, ki.field_a, gm.field_nb);
                break L2;
              }
            }
            L3: {
              if (param1 == null) {
                param1 = new java.awt.Color(140, 17, 17);
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (param4 <= -37) {
                    break L5;
                  } else {
                    field_f = null;
                    break L5;
                  }
                }
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
                break L4;
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
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var5 = (Exception) (Object) decompiledCaughtException;
            ol.field_e.repaint();
            break L9;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (!param0) {
            return;
        }
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
