/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    String field_b;
    static RgbSprite[][] field_e;
    boolean field_d;
    static String field_g;
    static RgbSprite field_a;
    static RgbSprite field_f;
    static mh field_h;
    String field_c;

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 >= -51) {
          return;
        }
        field_e = (RgbSprite[][]) null;
        field_f = null;
        field_a = null;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 < 24) {
            return;
          }
          if (qg.field_A < 10) {
            var3_int = 0;
            if (GameplayAudioEvent.field_i) {
              var3_int = 1;
              GameplayAudioEvent.field_i = false;
            }
            po.a(da.d((byte) 103), sb.field_f, oj.b(false), var3_int != 0, 0);
            return;
          }
          if (!il.e((byte) -94)) {
            Rasterizer2D.clear();
            dg.a(false, 240, 320);
            ck.a(param1, 0, 14209, 0);
            return;
          }
          if (AchievementIcon.field_j != 0) {
            kn.a(true, param1);
            return;
          }
          RankingsScreen.a(param2, -71, false);
          ck.a(param1, 0, 14209, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
