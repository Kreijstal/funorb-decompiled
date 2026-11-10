/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletHostHelpers {
    static String field_a;
    static WidgetTheme field_b;
    static String field_c;

    final static java.applet.Applet getHostApplet(int param0) {
        if (param0 != 0) {
          AppletHostHelpers.releaseStatics((byte) -61);
          if (null != MidiNoteMask.field_i) {
            return MidiNoteMask.field_i;
          }
          return (java.applet.Applet) ((Object) DropdownList.field_J);
        }
        if (null != MidiNoteMask.field_i) {
          return MidiNoteMask.field_i;
        }
        return (java.applet.Applet) ((Object) DropdownList.field_J);
    }

    final static String getTipToggleLabel(boolean param0) {
        if (!param0) {
          field_c = (String) null;
          if (!PendingFlagRequest.field_h) {
            return AccountCreationDialog.field_qb[1];
          }
          return AccountCreationDialog.field_qb[0];
        }
        if (!PendingFlagRequest.field_h) {
          return AccountCreationDialog.field_qb[1];
        }
        return AccountCreationDialog.field_qb[0];
    }

    final static byte[] readPackedByteArray(int param0, BitPacketBuffer param1, byte param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawn.field_J;
        try {
          var4_int = param1.readBits(80, param0);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new byte[var4_int];
          }
          var5 = param1.readBits(95, 3);
          if (param2 > -24) {
            field_c = (String) null;
          }
          var6 = (byte)param1.readBits(85, 8);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)(param1.readBits(56, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("hc.D(").append(param0).append(',');
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 > -114) {
          field_a = (String) null;
        }
    }

    static {
        field_a = "Click anywhere to activate!";
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
