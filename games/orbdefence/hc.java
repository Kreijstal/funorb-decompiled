/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ca {
    static int field_j;
    static hj field_i;
    static int field_f;
    byte[] field_m;
    int field_g;
    long field_h;
    static hj field_l;
    static String field_k;

    final static void a(byte param0, boolean param1, String param2, int param3, java.awt.Color param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Color var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          L0: {
            L1: {
              if (param0 < -33) {
                break L1;
              } else {
                var9 = (java.awt.Color) null;
                hc.a((byte) -33, true, (String) null, -40, (java.awt.Color) null);
                break L1;
              }
            }
            try {
              L2: {
                L3: {
                  var10 = tf.field_f.getGraphics();
                  if (null != e.field_a) {
                    break L3;
                  } else {
                    e.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L3;
                  }
                }
                L4: {
                  if (param1) {
                    var10.setColor(java.awt.Color.black);
                    var10.fillRect(0, 0, bd.field_k, th.field_e);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param4 != null) {
                    break L5;
                  } else {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L5;
                  }
                }
                try {
                  L6: {
                    L7: {
                      if (gj.field_f == null) {
                        gj.field_f = tf.field_f.createImage(304, 34);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = gj.field_f.getGraphics();
                    var11.setColor(param4);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, 3 * param3, 30);
                    var11.setColor(java.awt.Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(2 + 3 * param3, 2, 300 - 3 * param3, 30);
                    var11.setFont(e.field_a);
                    var11.setColor(java.awt.Color.white);
                    var11.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
                    var10.drawImage(gj.field_f, bd.field_k / 2 + -152, -18 + th.field_e / 2, (java.awt.image.ImageObserver) null);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = bd.field_k / 2 - 152;
                    var8 = -18 + th.field_e / 2;
                    var10.setColor(param4);
                    var10.drawRect(var7, var8, 303, 33);
                    var10.fillRect(2 + var7, 2 + var8, 3 * param3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var10.fillRect(3 * param3 + (2 + var7), 2 + var8, 300 - param3 * 3, 30);
                    var10.setFont(e.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, var7 - -((304 - 6 * param2.length()) / 2), var8 + 22);
                    break L8;
                  }
                }
                if (null == nl.field_a) {
                  break L2;
                } else {
                  var10.setFont(e.field_a);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(nl.field_a, bd.field_k / 2 + -(nl.field_a.length() * 6 / 2), th.field_e / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              tf.field_f.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5_ref);

            stackIn_22_1 = new StringBuilder().append("hc.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        if (param0 != 31) {
            java.awt.Color var2 = (java.awt.Color) null;
            hc.a((byte) -112, true, (String) null, 45, (java.awt.Color) null);
        }
    }

    hc(long param0, int param1, byte[] param2) {
        try {
            this.field_m = param2;
            this.field_h = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Not yet achieved";
    }
}
