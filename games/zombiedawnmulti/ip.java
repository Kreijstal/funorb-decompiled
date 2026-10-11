/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static String field_d;
    static String field_b;
    static String field_a;
    static String field_c;
    static int field_f;
    static ri field_e;

    final static void a(int param0, int param1) {
        if (param0 > -119) {
          field_c = (String) null;
          td.field_g = 1000000000L / (long)param1;
          return;
        }
        td.field_g = 1000000000L / (long)param1;
    }

    final static void b(byte param0) {
        rb.field_c = new int[]{};
        me.field_f = new int[]{};
        nm.field_u = new int[]{};
        if (param0 <= 75) {
          field_d = (String) null;
        }
    }

    final static void a(int param0, java.awt.Color param1, boolean param2, String param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = dk.field_Ib.getGraphics();
            if (null == wb.field_hb) {
              wb.field_hb = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, ng.field_d, pi.field_i);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == fq.field_i) {
                fq.field_i = dk.field_Ib.createImage(304, 34);
              }
              var10 = fq.field_i.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param0, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              if (param4 != 34) {
                field_c = (String) null;
              }
              var10.fillRect(param0 * 3 + 2, 2, -(3 * param0) + 300, 30);
              var10.setFont(wb.field_hb);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param3, (-(param3.length() * 6) + 304) / 2, 22);
              var9.drawImage(fq.field_i, ng.field_d / 2 - 152, -18 + pi.field_i / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = ng.field_d / 2 - 152;
              var8 = -18 + pi.field_i / 2;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, var8 + 2, 3 * param0, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, 1 + var8, 301, 31);
              var9.fillRect(2 + (var7 + param0 * 3), var8 + 2, -(3 * param0) + 300, 30);
              var9.setFont(wb.field_hb);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param3, (-(6 * param3.length()) + 304) / 2 + var7, 22 + var8);
            }
            if (gj.field_b == null) {
              return;
            }
            var9.setFont(wb.field_hb);
            var9.setColor(java.awt.Color.white);
            var9.drawString(gj.field_b, ng.field_d / 2 - 6 * gj.field_b.length() / 2, pi.field_i / 2 - 26);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            dk.field_Ib.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("ip.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 >= 118) {
          field_d = null;
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        }
        field_a = (String) null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final boolean a(byte param0) {
        int var2 = 27 % ((param0 - 55) / 62);
        if (this == lc.field_l) {
          return true;
        }
        if (qb.field_e == this) {
          return true;
        }
        if (this != pi.field_a) {
          return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Create";
        field_d = "Your zombies will not be affected by powerups. But you'll not be able to use any except Counter.";
        field_b = "Updates will sent to the email address you've given";
        field_c = "Summary";
        field_f = 3;
    }
}
