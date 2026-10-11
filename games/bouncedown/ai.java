/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ai {
    static java.awt.Frame field_b;
    static gk field_e;
    long field_d;
    ai field_c;
    ai field_f;
    static String[] field_a;

    final void c(int param0) {
        if (this.field_f != null) {
          this.field_f.field_c = this.field_c;
          this.field_c.field_f = this.field_f;
          this.field_f = null;
          this.field_c = null;
          if (param0 != 2) {
            this.field_d = 120L;
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 > 99) {
          field_e = null;
          return;
        }
        String var2 = (String) null;
        ai.a(false, (java.awt.Color) null, 3, (String) null, 98);
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wa.a(true);
        na.c(param3, param2, param0, param1);
        if (param4 != -19852) {
          field_a = (String[]) null;
        }
    }

    final boolean b(int param0) {
        if (null == this.field_f) {
          return false;
        }
        if (param0 < 108) {
          return false;
        }
        return true;
    }

    final static void a(boolean param0, java.awt.Color param1, int param2, String param3, int param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var10 = ch.field_h.getGraphics();
            var6 = -107 / ((param2 - 63) / 50);
            if (pa.field_a == null) {
              pa.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param0) {
              var10.setColor(java.awt.Color.black);
              var10.fillRect(0, 0, kj.field_i, jc.field_i);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (nb.field_b == null) {
                nb.field_b = ch.field_h.createImage(304, 34);
              }
              var11 = nb.field_b.getGraphics();
              var11.setColor(param1);
              var11.drawRect(0, 0, 303, 33);
              var11.fillRect(2, 2, param4 * 3, 30);
              var11.setColor(java.awt.Color.black);
              var11.drawRect(1, 1, 301, 31);
              var11.fillRect(3 * param4 + 2, 2, -(param4 * 3) + 300, 30);
              var11.setFont(pa.field_a);
              var11.setColor(java.awt.Color.white);
              var11.drawString(param3, (-(param3.length() * 6) + 304) / 2, 22);
              var10.drawImage(nb.field_b, -152 + kj.field_i / 2, jc.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var8 = -152 + kj.field_i / 2;
              var9 = jc.field_i / 2 - 18;
              var10.setColor(param1);
              var10.drawRect(var8, var9, 303, 33);
              var10.fillRect(2 + var8, 2 + var9, 3 * param4, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1 + var8, var9 + 1, 301, 31);
              var10.fillRect(2 + (var8 + 3 * param4), var9 + 2, 300 - param4 * 3, 30);
              var10.setFont(pa.field_a);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param3, var8 + (304 - param3.length() * 6) / 2, 22 + var9);
            }
            if (eb.field_D == null) {
              return;
            }
            var10.setFont(pa.field_a);
            var10.setColor(java.awt.Color.white);
            var10.drawString(eb.field_D, kj.field_i / 2 - 6 * eb.field_D.length() / 2, -26 + jc.field_i / 2);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ch.field_h.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("ai.QC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
