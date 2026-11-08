/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    int field_N;
    static int[] field_K;
    SectorCacheStore field_R;
    byte[] field_Q;
    static String menuRestartGame;
    static byte[] field_S;
    static LoginPayloadKind field_L;
    static UiComponent field_J;
    static int[] field_T;
    static String statusPlaying;

    public static void releaseStatics(byte param0) {
        field_T = null;
        menuRestartGame = null;
        field_L = null;
        field_K = null;
        field_S = null;
        if (param0 == -80) {
          field_J = null;
          statusPlaying = null;
          return;
        }
        String var2 = (String) null;
        DiskArchiveRequest.replaceAll(83, (String) null, (String) null, (String) null);
        field_J = null;
        statusPlaying = null;
    }

    final byte[] getBytes(boolean param0) {
        if (this.pending) {
          throw new RuntimeException();
        }
        if (!param0) {
          return this.field_Q;
        }
        DiskArchiveRequest.floorDividePositiveDivisor((byte) -47, -118, 74);
        return this.field_Q;
    }

    final static int[] getBallGlowPalette(int obfuscationGuard, int ballIndex) {
        if (obfuscationGuard == -9) {
          return ballIndex != 0 ? ballIndex == 8 ? CollisionContact.field_q : 8 <= ballIndex ? TextInputPainter.field_r : PotEvent.field_p : MembershipBenefitsLoader.field_e;
        }
        return (int[]) null;
    }

    final static int floorDividePositiveDivisor(byte obfuscationGuard, int divisor, int value) {
        int var3 = value >>> 31;
        if (obfuscationGuard == 44) {
          return -var3 + (value + var3) / divisor;
        }
        menuRestartGame = (String) null;
        return -var3 + (value + var3) / divisor;
    }

    DiskArchiveRequest() {
    }

    final static String replaceAll(int param0, String param1, String param2, String param3) {
        int var4 = param2.indexOf(param3);
        while (-1 != var4) {
          param2 = param2.substring(0, var4) + param1 + param2.substring(param3.length() + var4);
          var4 = param2.indexOf(param3, param1.length() + var4);
        }
        int var5 = -105 % ((param0 - 87) / 35);
        return param2;
    }

    final int getProgress(int param0) {
        if (this.pending) {
          return 0;
        }
        if (param0 <= 6) {
          field_S = (byte[]) null;
          return 100;
        }
        return 100;
    }

    static {
        menuRestartGame = "Restart";
        field_S = new byte[520];
        field_L = new LoginPayloadKind(3);
        statusPlaying = "Playing";
    }
}
