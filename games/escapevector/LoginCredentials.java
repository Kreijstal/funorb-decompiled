/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static IntrusiveDeque field_d;
    static String[] field_c;
    static volatile int heldMouseButton;
    static int field_a;

    public static void releaseStatics(int guard) {
        if (guard > -99) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void sortRatingIndices(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int stackIn_25_0 = 0;
        int var14 = EscapeVector.obfuscationControl;
        try {
          if (param6 >= param2) {
            return;
          }
          if (param1 <= param6 + 1) {
            return;
          }
          if (param1 > param6 + 5 &&
            param3 != param5) {
            int var7_int = (param3 >> 1) + (param5 >> 1) + (1 & (param5 & param3));
            int var8 = param6;
            int var9 = param3;
            int var10 = param5;
            if (param0 >= -87) {
              return;
            }
            for (int var11 = param6; var11 < param1; var11++) {
              int var12 = LegacyStyleNode.field_q[var11];
              if (param4) {
                stackIn_25_0 = DualLinkNode.field_k[var12];
              } else {
                stackIn_25_0 = Bzip2State.field_v[var12];
              }
              int var13 = stackIn_25_0;
              if (var7_int < var13) {
                LegacyStyleNode.field_q[var11] = LegacyStyleNode.field_q[var8];
                if (var9 > var13) {
                  var9 = var13;
                }
                int incrementValue$0 = var8;
                var8++;
                LegacyStyleNode.field_q[incrementValue$0] = var12;
              } else if (var13 > var10) {
                var10 = var13;
              }
            }
            LoginCredentials.sortRatingIndices((byte) -109, var8, param2, param3, param4, var9, param6);
            LoginCredentials.sortRatingIndices((byte) -96, param1, param2, var10, param4, param5, var8);
            return;
          }
          for (int var7_intLifetime1 = -1 + param1; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (int var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              int var9Lifetime1 = LegacyStyleNode.field_q[var8Lifetime1];
              int var10Lifetime1 = LegacyStyleNode.field_q[var8Lifetime1 + 1];
              if (LegacyMenuFontSupport.isRatingRowAfter(var9Lifetime1, 2, var10Lifetime1, param4)) {
                LegacyStyleNode.field_q[var8Lifetime1] = var10Lifetime1;
                LegacyStyleNode.field_q[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var7), "vj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void advanceSessionCounters(int guard) {
        if (guard < 82) {
          return;
        }
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.advanceCounters((byte) -121);
        }
    }

    abstract void writeTo(PacketBuffer buffer, byte guard);

    abstract LoginCredentialType type(byte guard);

    static {
        field_d = new IntrusiveDeque();
        heldMouseButton = 0;
        field_c = new String[]{"An explosive new campaign, with a compelling storyline", "Destroy the aliens' military infrastructure", "Challenge your piloting skills in Simulator mode"};
        field_a = 0;
    }
}
