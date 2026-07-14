/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wl {
    static String field_d;
    wl field_b;
    long field_e;
    static String field_a;
    wl field_c;
    static byte[][] field_g;
    static jd field_f;
    static String[] field_h;

    final boolean c(byte param0) {
        int var2 = 124 % ((18 - param0) / 36);
        if (null != ((wl) this).field_c) {
            return true;
        }
        return false;
    }

    final static md b(int param0) {
        if (param0 != 250) {
            md discarded$0 = wl.b(58);
            return (md) (Object) new ia();
        }
        return (md) (Object) new ia();
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            nk.field_M = param0;
            String var3 = param1.getParameter("cookieprefix");
            String var4 = param1.getParameter("cookiehost");
            String var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
            if (!(0 != param0.length())) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            if (param2 >= -89) {
                return;
            }
            try {
                cl.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -102);
            } catch (Throwable throwable) {
            }
            jf.a((byte) 121, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        if (((wl) this).field_c == null) {
          return;
        } else {
          ((wl) this).field_c.field_b = ((wl) this).field_b;
          ((wl) this).field_b.field_c = ((wl) this).field_c;
          ((wl) this).field_b = null;
          if (param0) {
            field_a = null;
            ((wl) this).field_c = null;
            return;
          } else {
            ((wl) this).field_c = null;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_h = null;
        if (param0 != 81) {
          md discarded$2 = wl.b(-85);
          field_a = null;
          field_d = null;
          field_g = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Email address is unavailable";
        field_g = new byte[250][];
        field_h = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
