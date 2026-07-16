/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends hn implements fp, ng {
    private nm field_C;
    private rb field_D;
    private lg field_E;

    private final String h(int param0) {
        if (param0 != -29996) {
            Object var3 = null;
            ((sc) this).a((byte) -117, (lg) null, -25, -101, -74);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    sc(nm param0) {
        super(0, 0, 288, 0, (el) null);
        ((sc) this).field_C = param0;
        ((sc) this).field_E = new lg(vd.field_d, (ca) null);
        ((sc) this).field_E.field_q = (el) (Object) new rf();
        String var7 = ff.a(new String[2], 0, md.field_d);
        int var3 = 20;
        pc var4 = new pc(dg.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, dg.field_e.field_x, -1, 2147483647, true);
        ((sc) this).field_D = new rb(var7, (el) (Object) var4);
        ((sc) this).field_D.field_n = "";
        ((sc) this).field_D.a(0, (byte) -115, jp.field_e);
        ((sc) this).field_D.a(1, (byte) -93, jp.field_e);
        ((sc) this).field_D.field_p = -40 + ((sc) this).field_p;
        ((sc) this).field_D.field_t = (ca) this;
        ((sc) this).field_D.a((byte) 46, 26, ((sc) this).field_p - 40, var3);
        var3 = var3 + (15 + ((sc) this).field_D.field_o);
        ((sc) this).a((gm) (Object) ((sc) this).field_D, -6938);
        int var5 = 4;
        int var6 = 200;
        ((sc) this).field_E.a((byte) -97, 300 + -var6 >> -456922623, var3, 40, var6);
        ((sc) this).field_E.field_t = (ca) this;
        ((sc) this).a((gm) (Object) ((sc) this).field_E, -6938);
        ((sc) this).a((byte) -49, 0, 0, var3 - (-55 + -var5), 300);
    }

    final static void a(int param0, java.awt.Color param1, boolean param2, byte param3, String param4) {
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
              var9 = k.field_d.getGraphics();
              if (vb.field_d == null) {
                vb.field_d = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, wk.field_d, ul.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != null) {
                break L3;
              } else {
                param1 = new java.awt.Color(140, 17, 17);
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (of.field_u == null) {
                    of.field_u = k.field_d.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = of.field_u.getGraphics();
                var10.setColor(param1);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, param0 * 3, 30);
                var7 = 19 % ((-41 - param3) / 52);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1, 1, 301, 31);
                var10.fillRect(param0 * 3 + 2, 2, -(param0 * 3) + 300, 30);
                var10.setFont(vb.field_d);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                boolean discarded$1 = var9.drawImage(of.field_u, wk.field_d / 2 + -152, -18 + ul.field_a / 2, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = -152 + wk.field_d / 2;
                var8 = ul.field_a / 2 + -18;
                var9.setColor(param1);
                var9.drawRect(var7, var8, 303, 33);
                var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
                var9.setColor(java.awt.Color.black);
                var9.drawRect(1 + var7, 1 + var8, 301, 31);
                var9.fillRect(2 + (var7 + 3 * param0), var8 - -2, 300 - param0 * 3, 30);
                var9.setFont(vb.field_d);
                var9.setColor(java.awt.Color.white);
                var9.drawString(param4, var7 - -((-(6 * param4.length()) + 304) / 2), var8 - -22);
                break L6;
              }
            }
            if (null == rh.field_a) {
              break L0;
            } else {
              var9.setFont(vb.field_d);
              var9.setColor(java.awt.Color.white);
              var9.drawString(rh.field_a, wk.field_d / 2 - rh.field_a.length() * 6 / 2, ul.field_a / 2 + -26);
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var5 = (Exception) (Object) decompiledCaughtException;
            k.field_d.repaint();
            break L7;
          }
        }
    }

    public final void a(byte param0, int param1, int param2, rb param3) {
        int var6 = 0;
        var6 = Torquing.field_u;
        if (param0 > 106) {
          if (param2 != 0) {
            if (1 != param2) {
              if (2 == param2) {
                d.a("conduct.ws", (byte) 31);
                return;
              } else {
                return;
              }
            } else {
              d.a("privacy.ws", (byte) 31);
              return;
            }
          } else {
            d.a("terms.ws", (byte) 31);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        if (param0 >= -85) {
          L0: {
            ((sc) this).field_C = null;
            if (param1 == ((sc) this).field_E) {
              m.c(-119);
              ((sc) this).field_C.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param1 == ((sc) this).field_E) {
              m.c(-119);
              ((sc) this).field_C.b(true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, 98)) {
          return true;
        } else {
          if (param0 == 98) {
            return ((sc) this).a((byte) 19, param1);
          } else {
            var5 = -40 % ((-33 - param3) / 57);
            if (99 == param0) {
              return ((sc) this).b(param1, -9928);
            } else {
              return false;
            }
          }
        }
    }

    private final String i(int param0) {
        if (param0 <= 117) {
            ((sc) this).field_E = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    static {
    }
}
