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
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
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
          if (param0 >= -33) {
            var9 = (java.awt.Color) null;
            hc.a((byte) -33, true, (String) null, -40, (java.awt.Color) null);
          }
          try {
            var10 = tf.field_f.getGraphics();
            if (null == e.field_a) {
              e.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param1) {
              var10.setColor(java.awt.Color.black);
              var10.fillRect(0, 0, bd.field_k, th.field_e);
            }
            if (param4 == null) {
              param4 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (gj.field_f == null) {
                gj.field_f = tf.field_f.createImage(304, 34);
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
              var10.drawImage(gj.field_f, bd.field_k / 2 - 152, -18 + th.field_e / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
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
              var10.drawString(param2, var7 + (304 - 6 * param2.length()) / 2, var8 + 22);
            }
            if (null == nl.field_a) {
              return;
            }
            var10.setFont(e.field_a);
            var10.setColor(java.awt.Color.white);
            var10.drawString(nl.field_a, bd.field_k / 2 - nl.field_a.length() * 6 / 2, th.field_e / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            tf.field_f.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("hc.A(").append(param0).append(',').append(param1).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
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
