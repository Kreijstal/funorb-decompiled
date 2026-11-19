/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingStatsRequest extends IntrusiveNode {
    int field_i;
    int field_k;
    static Sprite[] field_j;

    final static AccountFormText getEmailPrefill(byte param0) {
        int var1 = 61 / ((param0 - 19) / 39);
        return new AccountFormText(ArchiveContainerHelpers.a(-21), NameSuggestionsPanel.isEmailCheckPending((byte) -115));
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          RankingStatsRequest.buildSpecularTable(99);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final static void buildSpecularTable(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = wizardrun.field_H;
        try {
          TriangleRasterState.useRasterClip();
          MenuOverlayHelpers.field_b = 11;
          WhirlpoolHasher.field_f = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            WhirlpoolHasher.field_f[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = param0;
          var1_intLifetime1 = var5;
          while (WhirlpoolHasher.field_f.length > var5) {
            WhirlpoolHasher.field_f[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "vf.A(" + param0 + ')');
        }
    }

    private RankingStatsRequest() throws Throwable {
        throw new Error();
    }

    static {
    }
}
