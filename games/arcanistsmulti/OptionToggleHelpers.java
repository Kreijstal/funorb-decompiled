/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OptionToggleHelpers {
    static String field_a;
    static int field_b;
    static IntrusiveNodeHashTable field_c;

    final static void sendToggleOption(int param0, int param1) {
        CipherPacketBuffer var2 = StatusMessageHelpers.field_e;
        var2.writeOpcode((byte) -106, param0);
        var2.writeByte(1, (byte) -74);
        if (param1 == -14431) {
          var2.writeByte(1, (byte) -118);
          return;
        }
        field_c = (IntrusiveNodeHashTable) null;
        var2.writeByte(1, (byte) -118);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static void resetChatFilter(byte param0) {
        IconButtonPainter.resetNameValidation(param0 + 16777265);
        if (param0 != -50) {
          String var2 = (String) null;
          OptionToggleHelpers.sendDefaultToggle((String) null, true);
        }
    }

    final static void sendDefaultToggle(String param0, boolean param1) {
        try {
          if (!param1) {
            OptionToggleHelpers.sendToggleOption(4, -83);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "bc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "You have fallen into the water! Choose a location to teleport to. If you fail to do this within the time limit, you will forfeit the game!";
        field_b = -1;
    }
}
