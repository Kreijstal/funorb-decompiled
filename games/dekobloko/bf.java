/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf extends bh {
    static w field_v;
    byte[] field_n;
    static c field_x;
    static Random field_y;
    int field_s;
    long field_p;
    static int field_r;
    static String field_q;
    static ud field_w;
    static int field_o;
    static w field_t;
    static ud field_u;

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
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
              var9 = jh.field_b.getGraphics();
              if (wf.field_s == null) {
                wf.field_s = new java.awt.Font("Helvetica", 1, 13);
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
                var9.fillRect(0, 0, de.field_M, ob.field_g);
                break L2;
              }
            }
            L3: {
              if (param4 != null) {
                break L3;
              } else {
                param4 = new java.awt.Color(140, 17, 17);
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (null == lj.field_a) {
                    lj.field_a = jh.field_b.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = lj.field_a.getGraphics();
                var10.setColor(param4);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, 3 * param0, 30);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1, 1, 301, 31);
                var10.fillRect(param0 * 3 + 2, 2, 300 + -(param0 * 3), 30);
                var10.setFont(wf.field_s);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param3, (-(param2 * param3.length()) + 304) / 2, 22);
                boolean discarded$1 = var9.drawImage(lj.field_a, de.field_M / 2 - 152, ob.field_g / 2 + -18, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = -152 + de.field_M / 2;
                var8 = ob.field_g / 2 - 18;
                var9.setColor(param4);
                var9.drawRect(var7, var8, 303, 33);
                var9.fillRect(2 + var7, var8 - -2, param0 * 3, 30);
                var9.setColor(java.awt.Color.black);
                var9.drawRect(1 + var7, var8 + 1, 301, 31);
                var9.fillRect(2 + (var7 - -(3 * param0)), 2 + var8, 300 + -(param0 * 3), 30);
                var9.setFont(wf.field_s);
                var9.setColor(java.awt.Color.white);
                var9.drawString(param3, var7 - -((304 - 6 * param3.length()) / 2), 22 + var8);
                break L6;
              }
            }
            L7: {
              if (null == te.field_t) {
                break L7;
              } else {
                var9.setFont(wf.field_s);
                var9.setColor(java.awt.Color.white);
                var9.drawString(te.field_t, de.field_M / 2 - 6 * te.field_t.length() / 2, ob.field_g / 2 - 26);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            jh.field_b.repaint();
            break L8;
          }
        }
    }

    final static int a(byte param0, kn param1, int param2, kc param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          if (param3 == null) {
            break L0;
          } else {
            if (null == param3.field_u) {
              break L0;
            } else {
              if (param1 == null) {
                break L0;
              } else {
                if (param1.field_x == param3.field_n) {
                  var4 = param1.field_s.length;
                  if (param0 == 107) {
                    var5 = param3.field_u[param2].length / var4;
                    var6 = 0;
                    L1: while (true) {
                      if (var5 <= var6) {
                        return -1;
                      } else {
                        if (param3.field_t[param2][var6] == param1.field_o) {
                          if (k.a(param3.field_r[param2][var6], true)) {
                            var7 = 0;
                            L2: while (true) {
                              if (var7 >= var4) {
                                return var6;
                              } else {
                                if (param3.field_u[param2][var4 * var6 + var7] == param1.field_s[var7]) {
                                  var6 = var6;
                                  var7++;
                                  continue L2;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          } else {
                            var6++;
                            continue L1;
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return -88;
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

    public static void a(int param0) {
        field_u = null;
        field_q = null;
        field_t = null;
        field_y = null;
        field_v = null;
        if (param0 >= -38) {
            return;
        }
        field_x = null;
        field_w = null;
    }

    final static void c(byte param0) {
        gh.field_b.a(gg.field_y.field_mb - (!pd.field_a ? 0 : 44 + vh.field_e), 0, 0, 18, 0);
        int var1 = 44 / ((-28 - param0) / 43);
        kn.field_r.a(vh.field_e + 42, 0, 0, 18, -2 + gg.field_y.field_mb + -vh.field_e - 40);
        ec.field_k.a(6, 20, vh.field_e, 0, -20 + gg.field_y.field_N, gg.field_y.field_mb, 2);
    }

    final static void b(int param0, int param1) {
        if (param0 != -20861) {
            return;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 1);
        var2.a(true, 0);
    }

    final static void a(boolean param0) {
        dh.field_b = null;
        fj.field_e = param0 ? true : false;
        vb.field_U = null;
        wb.field_Qb = null;
        tg.field_g = null;
    }

    bf(long param0, int param1, byte[] param2) {
        ((bf) this).field_n = param2;
        ((bf) this).field_s = param1;
        ((bf) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new Random();
        field_q = "Invalid date";
    }
}
