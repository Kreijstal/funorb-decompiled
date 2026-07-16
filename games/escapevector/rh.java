/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends bj implements qb {
    static int field_N;
    private hc[] field_K;
    static pj field_I;
    static String field_J;
    private qn field_L;
    private String[] field_M;
    static int[] field_O;
    static volatile boolean field_H;

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 102, param2, param3);
        if (param1 < 85) {
            return;
        }
        if (param2 != 0) {
            return;
        }
        wl var5 = sb.field_a;
        if (((rh) this).field_M != null) {
            int discarded$0 = var5.a(hm.field_m, param3 - -((rh) this).field_k, param0 - -((rh) this).field_j, ((rh) this).field_g, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_x);
        }
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        ha var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = EscapeVector.field_A;
          ((rh) this).field_A.a((byte) 127);
          if (param0 == null) {
            break L0;
          } else {
            if (0 == param0.length) {
              break L0;
            } else {
              var3 = param0.length;
              ((rh) this).field_M = new String[var3];
              if (param1 == -103) {
                var4_int = 0;
                L1: while (true) {
                  if (var4_int >= var3) {
                    var4 = new ha(sb.field_a, 0, 1);
                    ((rh) this).field_K = new hc[1 + var3];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((rh) this).field_K[var3] = new hc(uj.field_c, (wn) this);
                        ((rh) this).field_K[var3].field_s = (db) (Object) var4;
                        ((rh) this).field_K[var3].a(100, 16 * (1 + var3) + 20, 0, true, 15);
                        ((rh) this).b((hm) (Object) ((rh) this).field_K[var3], false);
                        return;
                      } else {
                        ((rh) this).field_K[var5] = new hc(((rh) this).field_M[var5], (wn) this);
                        ((rh) this).field_K[var5].field_s = (db) (Object) var4;
                        ((rh) this).field_K[var5].field_i = ei.field_n;
                        ((rh) this).field_K[var5].a(80, 16 * var5 + 20, 0, true, 15);
                        ((rh) this).b((hm) (Object) ((rh) this).field_K[var5], false);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    ((rh) this).field_M[var4_int] = pc.a(param1 + 103, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        ((rh) this).field_M = null;
    }

    rh(qn param0) {
        super(0, 0, 0, 0, (db) null);
        ((rh) this).field_L = param0;
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2, 91))) {
            return true;
        }
        if (param2 == 98) {
            return ((rh) this).a((byte) 22, param0);
        }
        if (param3 < 0) {
            field_N = -69;
        }
        if (99 != param2) {
            return false;
        }
        return ((rh) this).a(param0, true);
    }

    public static void j(int param0) {
        field_O = null;
        field_I = null;
        field_J = null;
        if (param0 != -24896) {
            field_J = null;
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Color param2, int param3, String param4) {
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
              var9 = of.field_d.getGraphics();
              if (null == cg.field_l) {
                cg.field_l = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, pd.field_b, ad.field_d);
                break L2;
              }
            }
            L3: {
              if (param2 == null) {
                param2 = new java.awt.Color(140, 17, 17);
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (null == bj.field_z) {
                    bj.field_z = of.field_d.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = bj.field_z.getGraphics();
                var10.setColor(param2);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, 3 * param3, 30);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1, 1, 301, 31);
                var10.fillRect(3 * param3 + 2, 2, -(3 * param3) + 300, 30);
                var10.setFont(cg.field_l);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                boolean discarded$1 = var9.drawImage(bj.field_z, -152 + pd.field_b / 2, -18 + ad.field_d / 2, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = -152 + pd.field_b / 2;
                var8 = ad.field_d / 2 + -18;
                var9.setColor(param2);
                var9.drawRect(var7, var8, 303, 33);
                var9.fillRect(var7 - -2, 2 + var8, param3 * 3, 30);
                var9.setColor(java.awt.Color.black);
                var9.drawRect(1 + var7, var8 - -1, 301, 31);
                var9.fillRect(2 + (var7 - -(3 * param3)), 2 + var8, -(3 * param3) + 300, 30);
                var9.setFont(cg.field_l);
                var9.setColor(java.awt.Color.white);
                var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
                break L6;
              }
            }
            L7: {
              if (pg.field_e != null) {
                var9.setFont(cg.field_l);
                var9.setColor(java.awt.Color.white);
                var9.drawString(pg.field_e, pd.field_b / 2 - 6 * pg.field_e.length() / 2, ad.field_d / 2 - 26);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            of.field_d.repaint();
            break L8;
          }
        }
        L9: {
          if (param0 == 9) {
            break L9;
          } else {
            field_O = null;
            break L9;
          }
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (param3 == 1) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((rh) this).field_M.length) {
            L2: {
              if (param0 != ((rh) this).field_K[((rh) this).field_M.length]) {
                break L2;
              } else {
                ((rh) this).field_L.a((byte) -61);
                break L2;
              }
            }
            return;
          } else {
            if (((rh) this).field_K[var6] == param0) {
              ((rh) this).field_L.a((byte) -98, ((rh) this).field_M[var6]);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "ON";
        field_O = new int[4];
        field_H = true;
    }
}
