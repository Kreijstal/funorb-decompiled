/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sm[] field_a;
    static String field_b;
    static int[] field_d;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != ha.field_b) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && var2_int != 65535 &&
              fm.a((byte) 32, (char) var2_int)) {
              var3 = 127 & 1 + gn.field_d;
              if (q.field_g != var3) {
                ol.field_c[gn.field_d] = -1;
                pe.field_H[gn.field_d] = (char)var2_int;
                gn.field_d = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ml.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -3) {
          return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ha.field_b == null) {
            return;
          }
          hb.field_y = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ml.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (ha.field_b == null) {
            return;
          }
          po.field_w = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            var2_int < vo.field_a.length) {
            var2_int = vo.field_a[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (hb.field_y >= 0 &&
            var2_int >= 0) {
            no.field_i[hb.field_y] = var2_int;
            hb.field_y = hb.field_y + 1 & 127;
            if (n.field_w == hb.field_y) {
              hb.field_y = -1;
            }
          }
          if (0 <= var2_int) {
            var3 = gn.field_d + 1 & 127;
            if (q.field_g != var3) {
              ol.field_c[gn.field_d] = var2_int;
              pe.field_H[gn.field_d] = (char)0;
              gn.field_d = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((var3Lifetime1 & 10) == 0 &&
            var2_int != 85 &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ml.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ha.field_b != null) {
            po.field_w = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < vo.field_a.length) {
              var2_int = -129 & vo.field_a[var2_int];
            } else {
              var2_int = -1;
            }
            if (hb.field_y >= 0 &&
              var2_int >= 0) {
              no.field_i[hb.field_y] = ~var2_int;
              hb.field_y = 127 & 1 + hb.field_y;
              if (hb.field_y == n.field_w) {
                hb.field_y = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ml.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_b = "Names should contain a maximum of 12 characters";
        field_d = new int[3];
        field_c = "Change display name";
    }
}
