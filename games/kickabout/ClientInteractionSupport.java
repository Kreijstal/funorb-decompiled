/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientInteractionSupport {
    static UiLayoutNode field_c;
    static AnimationClip[] field_b;
    static boolean field_a;
    static int field_d;
    static IndexedSprite[] field_e;

    final static boolean a(byte param0) {
        if (param0 != 10) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          ClientInteractionSupport.readTwoRangeUnsigned(-49, -20, (CipherPacketBuffer) null, 91);
          if (RasterGlowSupport.field_c < 10) {
            return false;
          }
          if (!GameSoundEffect.field_f) {
            return !WorldSpriteDecoration.b(-14954) ? true : false;
          }
          return false;
        }
        if (RasterGlowSupport.field_c < 10) {
          return false;
        }
        if (!GameSoundEffect.field_f) {
          return !WorldSpriteDecoration.b(-14954) ? true : false;
        }
        return false;
    }

    final static int readTwoRangeUnsigned(int param0, int param1, CipherPacketBuffer param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 22531) {
            ClientInteractionSupport.a((byte) -59);
          }
          stackIn_3_0 = FormationAgent.readTwoRangeUnsigned(param1, param2, 1 << param3, param3, 1 << param1, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void dismissQuickChat(byte param0) {
        if (DebugConsole.field_s) {
          PendingRequestAcknowledgement.closeQuickChat(-127);
        }
        if (param0 < 108) {
          ClientInteractionSupport.a((byte) 11);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 123 / ((param0 + 76) / 50);
        field_e = null;
    }

    static {
        field_a = false;
    }
}
