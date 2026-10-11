/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = 20 % ((param0 + 75) / 40);
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ck.field_v) {
            return;
          }
          sb.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ag.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (ck.field_v != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              eh.a(0, (char) var2_int)) {
              var3 = 1 + bn.field_b & 127;
              if (var3 != ve.field_l) {
                td.field_b[bn.field_b] = -1;
                ek.field_a[bn.field_b] = (char)var2_int;
                bn.field_b = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ag.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void b(int param0) {
        int var1 = 16 % ((param0 - 0) / 63);
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
          if (null == ck.field_v) {
            return;
          }
          ui.field_e = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            jc.field_a.length > var2_int) {
            var2_int = jc.field_a[var2_int];
            if (0 != (128 & var2_int)) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (0 <= sb.field_b &&
            var2_int >= 0) {
            hc.field_C[sb.field_b] = var2_int;
            sb.field_b = 1 + sb.field_b & 127;
            if (m.field_k == sb.field_b) {
              sb.field_b = -1;
            }
          }
          if (0 <= var2_int) {
            var3 = bn.field_b + 1 & 127;
            if (var3 != ve.field_l) {
              td.field_b[bn.field_b] = var2_int;
              ek.field_a[bn.field_b] = (char)0;
              bn.field_b = var3;
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
          stackIn_25_1 = new StringBuilder().append("ag.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ck.field_v != null) {
            ui.field_e = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              var2_int < jc.field_a.length) {
              var2_int = -129 & jc.field_a[var2_int];
            } else {
              var2_int = -1;
            }
            if (sb.field_b >= 0 &&
              var2_int >= 0) {
              hc.field_C[sb.field_b] = ~var2_int;
              sb.field_b = sb.field_b + 1 & 127;
              if (m.field_k == sb.field_b) {
                sb.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("ag.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            oh.field_p = param0;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              if (param1 != 30) {
                return;
              }
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (0 != param0.length()) {
                var5Lifetime6 = var7 + "; Expires=" + bh.a(-106, 94608000000L + td.b(128)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              sd.a((byte) -111, param2, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            gl.a((byte) 15, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("ag.C(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = "Main Menu";
        field_c = "Create";
    }
}
