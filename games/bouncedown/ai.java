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
        if (this.field_f == null) {
          return;
        } else {
          L0: {
            this.field_f.field_c = this.field_c;
            this.field_c.field_f = this.field_f;
            this.field_f = null;
            this.field_c = null;
            if (param0 == 2) {
              break L0;
            } else {
              this.field_d = 120L;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        String var2 = null;
        field_b = null;
        field_a = null;
        if (param0 <= 99) {
          var2 = (String) null;
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
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        int var9 = 0;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
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
                  var10 = ch.field_h.getGraphics();
                  var6 = -107 / ((param2 - 63) / 50);
                  if (pa.field_a != null) {
                    break L2;
                  } else {
                    pa.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param0) {
                    var10.setColor(java.awt.Color.black);
                    var10.fillRect(0, 0, kj.field_i, jc.field_i);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (nb.field_b == null) {
                        nb.field_b = ch.field_h.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
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
                    discarded$1 = var10.drawImage(nb.field_b, -152 + kj.field_i / 2, jc.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
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
                    break L7;
                  }
                }
                if (eb.field_D == null) {
                  break L1;
                } else {
                  var10.setFont(pa.field_a);
                  var10.setColor(java.awt.Color.white);
                  var10.drawString(eb.field_D, kj.field_i / 2 + -(6 * eb.field_D.length() / 2), -26 + jc.field_i / 2);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              ch.field_h.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("ai.QC(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
    }

    static {
    }
}
