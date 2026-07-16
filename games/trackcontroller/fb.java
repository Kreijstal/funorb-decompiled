/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_a;
    static kk field_b;

    final static void a(boolean param0, int param1, java.awt.Color param2, String param3, byte param4) {
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
              var9 = ki.field_f.getGraphics();
              if (dc.field_s != null) {
                break L1;
              } else {
                dc.field_s = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              }
            }
            if (param4 <= -43) {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  var9.setColor(java.awt.Color.black);
                  var9.fillRect(0, 0, og.field_pb, wf.field_b);
                  break L2;
                }
              }
              L3: {
                if (param2 != null) {
                  break L3;
                } else {
                  param2 = new java.awt.Color(140, 17, 17);
                  break L3;
                }
              }
              try {
                L4: {
                  L5: {
                    if (hb.field_i != null) {
                      break L5;
                    } else {
                      hb.field_i = ki.field_f.createImage(304, 34);
                      break L5;
                    }
                  }
                  var10 = hb.field_i.getGraphics();
                  var10.setColor(param2);
                  var10.drawRect(0, 0, 303, 33);
                  var10.fillRect(2, 2, 3 * param1, 30);
                  var10.setColor(java.awt.Color.black);
                  var10.drawRect(1, 1, 301, 31);
                  var10.fillRect(2 - -(3 * param1), 2, -(3 * param1) + 300, 30);
                  var10.setFont(dc.field_s);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(param3, (304 + -(param3.length() * 6)) / 2, 22);
                  boolean discarded$1 = var9.drawImage(hb.field_i, og.field_pb / 2 - 152, wf.field_b / 2 - 18, (java.awt.image.ImageObserver) null);
                  break L4;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L6: {
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var7 = -152 + og.field_pb / 2;
                  var8 = wf.field_b / 2 + -18;
                  var9.setColor(param2);
                  var9.drawRect(var7, var8, 303, 33);
                  var9.fillRect(var7 + 2, var8 - -2, param1 * 3, 30);
                  var9.setColor(java.awt.Color.black);
                  var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                  var9.fillRect(var7 - -2 + param1 * 3, 2 + var8, -(3 * param1) + 300, 30);
                  var9.setFont(dc.field_s);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(param3, var7 + (304 - param3.length() * 6) / 2, 22 + var8);
                  break L6;
                }
              }
              if (null != fk.field_c) {
                var9.setFont(dc.field_s);
                var9.setColor(java.awt.Color.white);
                var9.drawString(fk.field_c, og.field_pb / 2 + -(6 * fk.field_c.length() / 2), wf.field_b / 2 + -26);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (Exception) (Object) decompiledCaughtException;
          ki.field_f.repaint();
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) hd.field_p);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hd.field_p);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) hd.field_p);
        if (param0 >= -99) {
          fb.a(-114);
          db.field_bb = 0;
          return;
        } else {
          db.field_bb = 0;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 30580) {
            field_a = -63;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
    }
}
