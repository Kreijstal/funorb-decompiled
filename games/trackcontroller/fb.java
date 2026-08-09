/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_a;
    static kk field_b;

    final static void a(boolean param0, int param1, java.awt.Color param2, String param3, byte param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ki.field_f.getGraphics();
                  if (dc.field_s != null) {
                    break L2;
                  } else {
                    dc.field_s = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                if (param4 <= -43) {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      var9.setColor(java.awt.Color.black);
                      var9.fillRect(0, 0, og.field_pb, wf.field_b);
                      break L3;
                    }
                  }
                  L4: {
                    if (param2 != null) {
                      break L4;
                    } else {
                      param2 = new java.awt.Color(140, 17, 17);
                      break L4;
                    }
                  }
                  try {
                    L5: {
                      L6: {
                        if (hb.field_i != null) {
                          break L6;
                        } else {
                          hb.field_i = ki.field_f.createImage(304, 34);
                          break L6;
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
                      var9.drawImage(hb.field_i, og.field_pb / 2 - 152, wf.field_b / 2 - 18, (java.awt.image.ImageObserver) null);
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      exception = (Exception) (Object) decompiledCaughtException;
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
                      break L7;
                    }
                  }
                  if (null != fk.field_c) {
                    var9.setFont(dc.field_s);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(fk.field_c, og.field_pb / 2 + -(6 * fk.field_c.length() / 2), wf.field_b / 2 + -26);
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    return;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              ki.field_f.repaint();
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(hd.field_p);
            param1.removeMouseMotionListener(hd.field_p);
            param1.removeFocusListener(hd.field_p);
            if (param0 >= -99) {
                fb.a(-114);
            }
            db.field_bb = 0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "fb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
