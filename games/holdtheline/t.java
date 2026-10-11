/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends hl {
    static String field_k;
    static int field_n;
    static int[] field_j;
    static int field_l;
    int[] field_m;
    static uf field_i;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          for (var2_int = param0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!oe.a((char) var3, -125) &&
              !ii.a(48, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("t.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 >= -21) {
            t.a(10);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "t.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(gn param0, gn param1, byte param2, gn param3) {
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (!param0.a((byte) 78)) {
            return false;
          }
          if (!param1.b("font", -121)) {
            return false;
          }
          if (!param1.b("font12", -97)) {
            return false;
          }
          if (!param1.b("logo", 51)) {
            return false;
          }
          if (!param1.b("logo_large", param2 ^ 30)) {
            return false;
          }
          if (!param1.b("flag", 64)) {
            return false;
          }
          if (!param1.b("menubar", -109)) {
            return false;
          }
          if (!param1.b("titlebar", 95)) {
            return false;
          }
          if (!param1.b("titlebar_divleft", param2 ^ 26)) {
            return false;
          }
          if (!param1.b("titlebar_divright", param2 ^ 91)) {
            return false;
          }
          if (!param1.b("courseselect_bar", 115)) {
            return false;
          }
          if (!param1.b("locked", -119)) {
            return false;
          }
          if (!param1.b("loading", param2 - 227)) {
            return false;
          }
          if (!param3.b("basic", -83)) {
            return false;
          }
          if (param2 != 111) {
            field_i = (uf) null;
          }
          if (param1.b("keyboard_space", -98) &&
            param1.b("keyboard_esc", param2 ^ 31) &&
            param1.b("keyboard_right", 81) &&
            param1.b("keyboard_left", param2 ^ 56) &&
            param1.b("keyboard_down", -92) &&
            param1.b("keyboard_up", -103) &&
            param1.b("keyboard_enter", 53) &&
            param1.b("keyboard_ctrl", param2 + 2) &&
            param1.b("keyboard_alt", -109) &&
            param1.b("keyboard_tab", -119) &&
            param1.b("keyboard_q", 51) &&
            param1.b("keyboard_a", -95) &&
            param1.b("keyboard_x", 86) &&
            param1.b("keyboard_c", param2 - 226)) {
            if (!param1.b("frame", param2 - 191)) {
              return false;
            }
            if (!param1.b("frame_textured", -111)) {
              return false;
            }
            if (!param1.b("tarmac", -95)) {
              return false;
            }
            if (!kb.a(16616, 0)) {
              return true;
            }
            if (!param1.b("halloween_zombie", param2 - 70)) {
              return false;
            }
            if (param1.b("halloween_blood", 85)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_88_0 = var4;
          stackIn_88_1 = new StringBuilder().append("t.A(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param1 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(')').toString());
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_k = null;
        field_i = null;
        field_j = null;
        if (param0 != 0) {
          field_k = (String) null;
        }
    }

    static {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
