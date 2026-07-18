/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hh extends IOException {
    static int field_f;
    static nb field_c;
    static ri[] field_a;
    static hr[] field_e;
    static String field_b;
    static al field_d;

    final static void a(boolean param0, int param1, java.awt.Color param2, boolean param3, String param4) {
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
                  var9 = qn.field_f.getGraphics();
                  if (null == f.field_s) {
                    f.field_s = new java.awt.Font("Helvetica", 1, 13);
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
                    var9.fillRect(0, 0, gi.field_h, wq.field_b);
                    break L3;
                  }
                }
                L4: {
                  if (param2 == null) {
                    param2 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null != gf.field_a) {
                        break L6;
                      } else {
                        gf.field_a = qn.field_f.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = gf.field_a.getGraphics();
                    var10.setColor(param2);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param1 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param1 * 3 + 2, 2, 300 + -(3 * param1), 30);
                    var10.setFont(f.field_s);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (-(param4.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(gf.field_a, gi.field_h / 2 + -152, -18 + wq.field_b / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + gi.field_h / 2;
                    var8 = wq.field_b / 2 + -18;
                    var9.setColor(param2);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, 3 * param1, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(param1 * 3 + (var7 + 2), var8 - -2, 300 - param1 * 3, 30);
                    var9.setFont(f.field_s);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, var7 + (304 + -(param4.length() * 6)) / 2, 22 + var8);
                    break L7;
                  }
                }
                if (vk.field_d == null) {
                  break L1;
                } else {
                  var9.setFont(f.field_s);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(vk.field_d, gi.field_h / 2 - vk.field_d.length() * 6 / 2, wq.field_b / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              qn.field_f.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("hh.B(").append(true).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    hh(String param0) {
        super(param0);
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = 0;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new nb(2);
        field_b = "Connection lost. <%0>";
    }
}
