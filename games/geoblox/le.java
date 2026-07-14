/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_b;
    static int field_a;

    final static void a(byte param0) {
        ji.field_r.a(ra.field_a, (byte) -70);
        a.field_d.a(ra.field_a, (byte) -70);
        wd.field_e.a(ra.field_a, (byte) -70);
        bh.field_c.a(ra.field_a, (byte) -70);
        kc.field_a = 0;
        vf.field_L.e();
        vb.c();
        wd.field_b.e();
        vb.c();
        sh.field_y.a(255);
        jl.field_t = false;
        rb.field_b = 0;
        ab.field_f = false;
        fa.field_a = false;
        w.field_f = false;
        wb.field_b = 0;
        pf.field_D = false;
        re.field_j = false;
        if (param0 != -39) {
            le.a((byte) 97);
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (pg.field_c != null) {
            gh.field_P = 0;
            lj.field_b = param0.getX();
            eg.field_h = param0.getY();
            fc.field_f = true;
        }
    }

    final static void a(hf param0, int param1, hf param2) {
        L0: {
          if (null != param2.field_c) {
            param2.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 80) {
          field_b = null;
          param2.field_c = param0.field_c;
          param2.field_b = param0;
          param2.field_c.field_b = param2;
          param2.field_b.field_c = param2;
          return;
        } else {
          param2.field_c = param0.field_c;
          param2.field_b = param0;
          param2.field_c.field_b = param2;
          param2.field_b.field_c = param2;
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        L0: {
          if (null == pg.field_c) {
            break L0;
          } else {
            L1: {
              gh.field_P = 0;
              s.field_I = 0;
              fc.field_f = true;
              var2 = param0.getModifiers();
              if (0 == (var2 & 4)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((16 & var2) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            if (0 == (8 & var2)) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param0.isPopupTrigger()) {
          param0.consume();
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -29313) {
            return;
        }
        field_b = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != pg.field_c) {
            gh.field_P = 0;
            lj.field_b = param0.getX();
            eg.field_h = param0.getY();
            fc.field_f = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == pg.field_c)) {
            gh.field_P = 0;
            lj.field_b = -1;
            eg.field_h = -1;
            fc.field_f = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (pg.field_c != null) {
          gh.field_P = 0;
          ah.field_e = param0.getX();
          hi.field_C = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              vd.field_a = 1;
              s.field_I = 1;
              var2 = param0.getModifiers();
              if ((8 & var2) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 != (16 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != (var2 & 4)) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              fc.field_f = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              vd.field_a = 2;
              s.field_I = 2;
              var2 = param0.getModifiers();
              if ((8 & var2) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (16 & var2)) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 != (var2 & 4)) {
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              fc.field_f = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          L8: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L8;
            } else {
              break L8;
            }
          }
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == pg.field_c)) {
            s.field_I = 0;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == pg.field_c)) {
            gh.field_P = 0;
            lj.field_b = param0.getX();
            eg.field_h = param0.getY();
            fc.field_f = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = 1;
    }
}
