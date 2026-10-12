/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextCursor {
    static String field_g;
    static boolean field_f;
    private int length;
    static PcmPlayer field_e;
    static int field_d;
    private String text;
    int position;

    public final String toString() {
        return this.text.substring(0, this.position) + "|" + this.text.substring(this.position);
    }

    final char readCharacter(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          this.text = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.text.charAt(fieldTemp$0);
    }

    final boolean isAtEnd(byte obfuscationGuard) {
        if (obfuscationGuard != 16) {
          return true;
        }
        return this.position >= this.length ? true : false;
    }

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 > -116) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          TextCursor.readTagName((CipherPacketBuffer) null, false);
        }
    }

    final static String readTagName(CipherPacketBuffer packet, boolean obfuscationGuard) {
        int var4_int = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = packet.readBits(61, 2) + 1;
          var3 = new byte[var2_int];
          for (var4_int = 0; var4_int < var2_int; var4_int++) {
            var3[var4_int] = (byte)(int)ClientConnectionState.readTagCharacter(packet, -1, -15329);
          }
          if (!obfuscationGuard) {
            field_g = (String) null;
          }
          var4 = new String(var3);
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mt.D(");
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    TextCursor(String text) {
        this.position = 0;
        try {
          this.text = text;
          this.length = this.text.length();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mt.<init>(" + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_g = "You can only use Fortify on a village.";
    }
}
