/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreQuery extends IntrusiveNode {
    boolean completed;
    int[][] valuesByView;
    static qr field_l;
    int queryId;
    int entryLimit;
    static Sprite[] field_k;
    String[][] namesByView;
    static SpriteData unachievedSpriteData;
    static RenderSprite[] powerBulbSprites;
    int valuesPerEntry;
    long[][] submissionTokensByView;

    public static void a(byte param0) {
        powerBulbSprites = null;
        unachievedSpriteData = null;
        field_k = null;
        field_l = null;
        if (param0 != 35) {
          unachievedSpriteData = (SpriteData) null;
        }
    }

    final static CoverageBitmapFont a(int param0, ResourceArchive param1, int param2, ResourceArchive param3, int param4) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          if (!tn.a(param3, (byte) -127, param2, param4)) {
            Object stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          int var5_int = -15 / ((param0 - 65) / 51);
          CoverageBitmapFont stackIn_4_0 = te.a(param1.a(param4, -10470, param2), -80);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("uc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(mg param0, int param1, int param2, int param3) {
        if (param1 != 25345) {
          return;
        }
        try {
          qg.field_d = param0;
          po.field_j = param2;
          ku.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "uc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    HighscoreQuery() {
    }

    static {
        field_l = new qr();
    }
}
