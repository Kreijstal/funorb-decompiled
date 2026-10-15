/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHuffmanHelpers {
    static AccountContentTransitionLayer accountContentLayer;
    static String field_a;
    static int field_b;

    final static void b(int param0) {
        if (param0 >= -78) {
          field_a = (String) null;
        }
    }

    final static void a(byte param0, PcmStream param1) {
        if (param0 != 80) {
          return;
        }
        try {
          PasswordFieldRenderer.soundMixer.removeStream(param1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "rj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void installTextHuffman(HuffmanCodec codec, boolean obfuscationGuard) {
        try {
          QuickChatCategoryRegistry.textHuffman = codec;
          if (obfuscationGuard) {
            TextHuffmanHelpers.b(-94);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "rj.C(" + (codec != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == 24311) {
          accountContentLayer = null;
          field_a = null;
          return;
        }
        HuffmanCodec var2 = (HuffmanCodec) null;
        TextHuffmanHelpers.installTextHuffman((HuffmanCodec) null, true);
        accountContentLayer = null;
        field_a = null;
    }

    static {
        field_a = "You cannot add yourself!";
    }
}
