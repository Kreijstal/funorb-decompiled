/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateUsernameCredentials extends UsernameCredentials {
    private static long[] field_l;
    static float field_t;
    static PcmStreamMixer field_n;
    static QuickChatDynamicCommand field_m;
    static ResourceArchive field_j;
    static int field_r;
    static MainMenuScreen field_q;
    static String[] field_s;
    static PcmSample field_o;
    static String field_i;
    static String[] field_k;
    static String field_p;

    public static void releaseStatics(int guard) {
        field_q = null;
        field_p = null;
        field_k = null;
        field_n = null;
        field_o = null;
        field_m = null;
        field_i = null;
        if (guard != 256) {
          return;
        }
        field_s = null;
        field_j = null;
        field_l = null;
    }

    final LoginCredentialType type(byte guard) {
        if (guard != 32) {
          return (LoginCredentialType) null;
        }
        return MeshMaterial.field_a;
    }

    AlternateUsernameCredentials(long param0, String param1) {
        super(param0, param1);
    }

    final static int[] d(int param0) {
        if (null != SocketJs5Transport.field_r) {
          return SocketJs5Transport.field_r.c(0);
        }
        int var1 = -48 % ((param0 - 76) / 47);
        return null;
    }

    static {
        field_l = new long[256];
        for (int var2 = 0; var2 < 256; var2++) {
          long var0 = (long)var2;
          for (int var3 = 0; 8 > var3; var3++) {
            var0 = ((var0 & 1L) == 1L) ? (var0 >>> 1 ^ -3932672073523589310L) : (var0 >>> 1);
          }
          field_l[var2] = var0;
        }
        field_s = new String[]{"Retrieval - Normal", "Retrieval - Hard", "Retribution", "Simulator"};
        field_m = new QuickChatDynamicCommand(4, 1, 1, 1);
        field_i = "Type your password again to make sure it's correct";
        field_k = new String[]{"fuel", "crate", "turret", "magnet", "repeller", "tnt", "laser_left", "laser_right", "barrier", "powerup_shield", "powerup_triple_shot", "powerup_thrust", "powerup_one_rockbuster", "powerup_five_rockbusters"};
        field_p = "Simulator objectives";
    }
}
