/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ag[] field_c;
    static String field_e;
    static aa field_b;
    static String field_a;
    static aa field_d;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var3 = rb.a(22479, param0);
          if (-1 != param1.indexOf(param0)) {
            break L0;
          } else {
            if (-1 != param1.indexOf(var3)) {
              break L0;
            } else {
              L1: {
                L2: {
                  var4 = -12 % ((param2 - 62) / 33);
                  if (param1.startsWith(param0)) {
                    break L2;
                  } else {
                    if (param1.startsWith(var3)) {
                      break L2;
                    } else {
                      if (param1.endsWith(param0)) {
                        break L2;
                      } else {
                        if (!param1.endsWith(var3)) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
              return stackIn_11_0 != 0;
            }
          }
        }
        return true;
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != hd.field_p) {
            pa.field_a = 0;
            la.field_s = param0.getX();
            wi.field_a = param0.getY();
            hd.field_q = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == hd.field_p)) {
            db.field_bb = 0;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 <= 13) {
            Object var2 = null;
            cb.a(-60, (byte) -87, 63, -125, (qj[]) null, -25);
        }
        field_c = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, qj[] param4, int param5) {
        int var11 = TrackController.field_F ? 1 : 0;
        if (param4 != null) {
            // ifle L17
        } else {
            return;
        }
        if (param1 >= -101) {
            return;
        }
        int var6 = param4[0].field_s;
        int var7 = param4[2].field_s;
        int var8 = param4[1].field_s;
        param4[0].e(param5, param0, param2);
        param4[2].e(-var7 + (param3 + param5), param0, param2);
        ll.a(kk.field_g);
        ll.b(param5 - -var6, param0, -var7 + param5 - -param3, param4[1].field_v + param0);
        int var9 = param5 - -var6;
        int var10 = param5 + (param3 - var7);
        param5 = var9;
        while (param5 < var10) {
            param4[1].e(param5, param0, param2);
            param5 = param5 + var8;
        }
        ll.b(kk.field_g);
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == hd.field_p)) {
            pa.field_a = 0;
            la.field_s = param0.getX();
            wi.field_a = param0.getY();
            hd.field_q = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (hd.field_p != null) {
            pa.field_a = 0;
            la.field_s = param0.getX();
            wi.field_a = param0.getY();
            hd.field_q = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != hd.field_p) {
            pa.field_a = 0;
            sa.field_M = param0.getX();
            ch.field_x = param0.getY();
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                wf.field_d = 1;
                db.field_bb = 1;
            } else {
                wf.field_d = 2;
                db.field_bb = 2;
            }
            var2 = param0.getModifiers();
            hd.field_q = true;
            if (0 != (8 & var2)) {
            }
            if (0 != (4 & var2)) {
            }
            if ((var2 & 16) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == hd.field_p)) {
            pa.field_a = 0;
            la.field_s = -1;
            wi.field_a = -1;
            hd.field_q = true;
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ei var5_ref_ei = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        r var9 = null;
        la var10 = null;
        byte[] var14 = null;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var2 = -37 / ((-10 - param0) / 56);
          var10 = ne.field_a;
          var3 = var10.h(16383);
          if (var3 == -1) {
            var9 = (r) (Object) ne.field_b.b(2);
            if (var9 == null) {
              lj.a((byte) 113);
              return;
            } else {
              L1: {
                var5 = var10.h(16383);
                if (0 != var5) {
                  var14 = new byte[var5];
                  var10.a(100, var14, 0, var5);
                  break L1;
                } else {
                  var6 = null;
                  break L1;
                }
              }
              var10.field_k = var10.field_k + 4;
              if (var10.b(false)) {
                var9.a(-110);
                break L0;
              } else {
                lj.a((byte) 118);
                return;
              }
            }
          } else {
            if (-2 == var3) {
              var4 = var10.e((byte) 113);
              var5_ref_ei = (ei) (Object) fj.field_H.b(2);
              L2: while (true) {
                L3: {
                  if (var5_ref_ei == null) {
                    break L3;
                  } else {
                    if (var4 != var5_ref_ei.field_n) {
                      var5_ref_ei = (ei) (Object) fj.field_H.a(10);
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var5_ref_ei != null) {
                  var5_ref_ei.a(-119);
                  break L0;
                } else {
                  lj.a((byte) 121);
                  return;
                }
              }
            } else {
              hb.a((Throwable) null, 0, "A1: " + jc.b(84));
              lj.a((byte) 123);
              break L0;
            }
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(hd.field_p == null)) {
            pa.field_a = 0;
            db.field_bb = 0;
            hd.field_q = true;
            var2 = param0.getModifiers();
            if ((8 & var2) == 0) {
            }
            if (-1 == (16 & var2 ^ -1)) {
            }
            if (0 != (4 & var2)) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new ag[255];
        for (var0 = 0; var0 < field_c.length; var0++) {
            field_c[var0] = new ag();
        }
        field_e = "Visit the Account Management section on the main site to view.";
        field_a = "Please try again in a few minutes.";
        field_b = new aa(4, 1, 1, 1);
        field_d = new aa(10, 2, 2, 0);
    }
}
