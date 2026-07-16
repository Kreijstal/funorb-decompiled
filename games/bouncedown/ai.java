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
        if (((ai) this).field_f == null) {
          return;
        } else {
          L0: {
            ((ai) this).field_f.field_c = ((ai) this).field_c;
            ((ai) this).field_c.field_f = ((ai) this).field_f;
            ((ai) this).field_f = null;
            ((ai) this).field_c = null;
            if (param0 == 2) {
              break L0;
            } else {
              ((ai) this).field_d = 120L;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_b = null;
        field_a = null;
        if (param0 <= 99) {
          var2 = null;
          ai.a(false, (java.awt.Color) null, 3, (String) null, 98);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wa.a(true);
        na.c(param3, param2, param0, param1);
        if (param4 != -19852) {
            field_a = null;
        }
    }

    final boolean b(int param0) {
        if (null == ((ai) this).field_f) {
            return false;
        }
        if (param0 < 108) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0, java.awt.Color param1, int param2, String param3, int param4) {
        Exception var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        int var9 = 0;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = ch.field_h.getGraphics();
              var6 = -107 / ((param2 - 63) / 50);
              if (pa.field_a != null) {
                break L1;
              } else {
                pa.field_a = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              }
            }
            L2: {
              if (param0) {
                var10.setColor(java.awt.Color.black);
                var10.fillRect(0, 0, kj.field_i, jc.field_i);
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
                  if (nb.field_b == null) {
                    nb.field_b = ch.field_h.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
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
                boolean discarded$1 = var10.drawImage(nb.field_b, -152 + kj.field_i / 2, jc.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var7 = (Exception) (Object) decompiledCaughtException;
                var8 = -152 + kj.field_i / 2;
                var9 = jc.field_i / 2 - 18;
                var10.setColor(param1);
                var10.drawRect(var8, var9, 303, 33);
                var10.fillRect(2 + var8, 2 + var9, 3 * param4, 30);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1 + var8, var9 + 1, 301, 31);
                var10.fillRect(2 + (var8 - -(3 * param4)), var9 + 2, 300 - param4 * 3, 30);
                var10.setFont(pa.field_a);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param3, var8 - -((304 - param3.length() * 6) / 2), 22 + var9);
                break L6;
              }
            }
            if (eb.field_D == null) {
              break L0;
            } else {
              var10.setFont(pa.field_a);
              var10.setColor(java.awt.Color.white);
              var10.drawString(eb.field_D, kj.field_i / 2 + -(6 * eb.field_D.length() / 2), -26 + jc.field_i / 2);
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var5 = (Exception) (Object) decompiledCaughtException;
            ch.field_h.repaint();
            break L7;
          }
        }
    }

    static {
    }
}
