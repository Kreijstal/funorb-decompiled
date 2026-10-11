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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          try {
            var10 = qn.field_f.getGraphics();
            if (null == f.field_s) {
              f.field_s = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var10.setColor(java.awt.Color.black);
              var10.fillRect(0, 0, gi.field_h, wq.field_b);
            }
            if (param2 == null) {
              param2 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == gf.field_a) {
                gf.field_a = qn.field_f.createImage(304, 34);
              }
              var11 = gf.field_a.getGraphics();
              var11.setColor(param2);
              var11.drawRect(0, 0, 303, 33);
              var11.fillRect(2, 2, param1 * 3, 30);
              var11.setColor(java.awt.Color.black);
              var11.drawRect(1, 1, 301, 31);
              var11.fillRect(param1 * 3 + 2, 2, 300 - 3 * param1, 30);
              var11.setFont(f.field_s);
              if (!param0) {
                var9 = (String) null;
                hh.a(true, -9, (java.awt.Color) null, true, (String) null);
              }
              var11.setColor(java.awt.Color.white);
              var11.drawString(param4, (-(param4.length() * 6) + 304) / 2, 22);
              var10.drawImage(gf.field_a, gi.field_h / 2 - 152, -18 + wq.field_b / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + gi.field_h / 2;
              var8 = wq.field_b / 2 - 18;
              var10.setColor(param2);
              var10.drawRect(var7, var8, 303, 33);
              var10.fillRect(2 + var7, var8 + 2, 3 * param1, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(var7 + 1, 1 + var8, 301, 31);
              var10.fillRect(param1 * 3 + (var7 + 2), var8 + 2, 300 - param1 * 3, 30);
              var10.setFont(f.field_s);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param4, var7 + (304 - param4.length() * 6) / 2, 22 + var8);
            }
            if (vk.field_d == null) {
              return;
            }
            var10.setFont(f.field_s);
            var10.setColor(java.awt.Color.white);
            var10.drawString(vk.field_d, gi.field_h / 2 - vk.field_d.length() * 6 / 2, wq.field_b / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            qn.field_f.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("hh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    hh(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        int var1 = -11 % ((param0 - 24) / 60);
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new nb(2);
        field_b = "Connection lost. <%0>";
    }
}
