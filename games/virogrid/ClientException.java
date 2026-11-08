/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    Throwable field_a;
    static ScoreSubmissionHelpers field_b;
    static StateToken field_d;
    String field_c;

    public static void releaseStatics(int param0) {
        field_d = null;
        field_b = null;
        int var1 = -64 / ((param0 - 11) / 45);
    }

    final static String describePacketHistory(boolean param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var1Lifetime1;
        var5 = Virogrid.field_F ? 1 : 0;
        if (!param0) {
          return (String) null;
        }
        var6 = "(" + IndexedSpriteState.field_e + " " + CredentialHelpers.field_c + " " + IntKeyLookup.field_b + ") " + PasswordConfirmationValidator.field_q;
        var1 = var6;
        if (ArchiveProvider.field_a <= 0) {
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; ArchiveProvider.field_a > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var3 = ProgressMessageDialog.field_qb.payload[var2] & 255;
          var4 = var3 >> 4;
          var3 = var3 & 15;
          if (var4 < 10) {
            var4 += 48;
          } else {
            var4 += 55;
          }
          if (10 <= var3) {
            var3 += 55;
          } else {
            var3 += 48;
          }
          var8 = var7 + (char)var4;
          var1Lifetime1 = var8 + (char)var3;
        }
        return var1Lifetime1;
    }

    ClientException(Throwable param0, String param1) {
        this.field_a = param0;
        this.field_c = param1;
    }

    static {
        field_b = new ScoreSubmissionHelpers();
        field_d = new StateToken();
    }
}
