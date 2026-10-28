/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static String field_c;
    static LoginStage field_h;
    static String field_b;
    static String field_d;
    static String field_g;
    static int[] frameOffsets;
    static int field_e;
    static int legacyMenuHeight;

    public static void releaseStatics(boolean guard) {
        field_b = null;
        field_g = null;
        frameOffsets = null;
        if (!guard) {
          mh.b((byte) 81);
        }
        field_d = null;
        field_h = null;
        field_c = null;
    }

    final static String b(byte param0) {
        String var1 = "";
        if (null != PcmResampler.field_d) {
          var1 = PcmResampler.field_d.identifier(35);
        }
        if (var1.length() == 0) {
          var1 = ContactEntry.i(0);
        }
        if (param0 <= 50) {
          field_d = (String) null;
        }
        if (var1.length() == 0) {
          var1 = IndexedSpriteState.field_e;
        }
        return var1;
    }

    final static void a(byte param0, boolean param1) {
        MenuInputState.drawAccountOverlay(param1, 1983, true);
        if (param0 >= -68) {
          mh.b((byte) 6);
        }
    }

    final static int a(int param0, CharSequence param1) {
        String stackIn_9_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param1.length();
          int var3 = 0;
          for (int var4 = param0; var4 < var2_int; var4++) {
            var3 = LoginStage.encodeCp1252Character(78, param1.charAt(var4)) + (-var3 + (var3 << 5));
          }
          int stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var2;
          StringBuilder stackIn_8_1 = new StringBuilder().append("mh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.a((byte) -109);
        }
        if (param0 != 119) {
          field_c = (String) null;
        }
    }

    static {
        field_c = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_h = new LoginStage();
        field_b = "PER MONTH";
        field_d = "Confirm Password: ";
        frameOffsets = new int[48];
        field_g = "Seek out and destroy all the alien military infrastructure.<br>Some levels are booby trapped with auto-destruct systems.<br>Escape before the timer counts down to zero.";
    }
}
