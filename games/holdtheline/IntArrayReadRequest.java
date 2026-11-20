/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntArrayReadRequest extends IntrusiveNode {
    static String field_k;
    static int field_n;
    static int[] field_j;
    static int field_l;
    int[] values;
    static SpriteAsset field_i;

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
            if (!QuadraticPointPath.isAsciiLetter((char) var3, -125) &&
              !ClientException.a(48, (char) var3)) {
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 >= -21) {
            IntArrayReadRequest.clearSharedReferences(10);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "t.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3) {
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
          if (!param0.tryLoadAllGroups((byte) 78)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("font", -121)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("font12", -97)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("logo", 51)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("logo_large", param2 ^ 30)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("flag", 64)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("menubar", -109)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("titlebar", 95)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("titlebar_divleft", param2 ^ 26)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("titlebar_divright", param2 ^ 91)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("courseselect_bar", 115)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("locked", -119)) {
            return false;
          }
          if (!param1.tryLoadNamedGroup("loading", param2 - 227)) {
            return false;
          }
          if (!param3.tryLoadNamedGroup("basic", -83)) {
            return false;
          }
          if (param2 != 111) {
            field_i = (SpriteAsset) null;
          }
          if (param1.tryLoadNamedGroup("keyboard_space", -98) &&
            param1.tryLoadNamedGroup("keyboard_esc", param2 ^ 31) &&
            param1.tryLoadNamedGroup("keyboard_right", 81) &&
            param1.tryLoadNamedGroup("keyboard_left", param2 ^ 56) &&
            param1.tryLoadNamedGroup("keyboard_down", -92) &&
            param1.tryLoadNamedGroup("keyboard_up", -103) &&
            param1.tryLoadNamedGroup("keyboard_enter", 53) &&
            param1.tryLoadNamedGroup("keyboard_ctrl", param2 + 2) &&
            param1.tryLoadNamedGroup("keyboard_alt", -109) &&
            param1.tryLoadNamedGroup("keyboard_tab", -119) &&
            param1.tryLoadNamedGroup("keyboard_q", 51) &&
            param1.tryLoadNamedGroup("keyboard_a", -95) &&
            param1.tryLoadNamedGroup("keyboard_x", 86) &&
            param1.tryLoadNamedGroup("keyboard_c", param2 - 226)) {
            if (!param1.tryLoadNamedGroup("frame", param2 - 191)) {
              return false;
            }
            if (!param1.tryLoadNamedGroup("frame_textured", -111)) {
              return false;
            }
            if (!param1.tryLoadNamedGroup("tarmac", -95)) {
              return false;
            }
            if (!LoginCredentialType.isFeatureEnabled(16616, 0)) {
              return true;
            }
            if (!param1.tryLoadNamedGroup("halloween_zombie", param2 - 70)) {
              return false;
            }
            if (param1.tryLoadNamedGroup("halloween_blood", 85)) {
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(')').toString());
        }
    }

    private IntArrayReadRequest() throws Throwable {
        throw new Error();
    }

    public static void clearSharedReferences(int param0) {
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
