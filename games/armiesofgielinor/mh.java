/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static ClientConnectionState field_a;
    static String field_d;
    static wm field_b;
    static int field_c;

    final static void a(int param0, byte param1) {
        te var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        te var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ResourceProtocolClient.field_e = param0;
          var2 = (te) (bl.field_h.first((byte) 110));
          while (var2 != null) {
            if (!var2.field_k.c(65280)) {
              var2.unlink(-110);
            } else {
              var2.field_q.i(var2.field_o * ResourceProtocolClient.field_e + 128 >> 8);
            }
            var2 = (te) (bl.field_h.next((byte) 123));
          }
          if (ts.field_e != null) {
            var2Lifetime1 = (te) (ts.field_e.first((byte) 95));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_k.c(65280)) {
                var2Lifetime1.unlink(47);
              } else {
                var2Lifetime1.field_q.i(128 + ResourceProtocolClient.field_e * var2Lifetime1.field_o >> 8);
              }
              var2Lifetime1 = (te) (ts.field_e.next((byte) 123));
            }
          }
          if (param1 < -26) {
            return;
          }
          field_d = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "mh.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static int getProfileMissionScore(int campaignIndex, int obfuscationGuard, int missionIndex) {
        if (pg.playerProfile == null) {
          return 0;
        }
        if (null == pg.playerProfile.campaignProgress) {
          return 0;
        }
        if (obfuscationGuard < -111) {
          return pg.playerProfile.campaignProgress.getMissionScore(campaignIndex, 127, missionIndex);
        }
        field_b = (wm) null;
        return pg.playerProfile.campaignProgress.getMissionScore(campaignIndex, 127, missionIndex);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 >= -83) {
          mh.a((byte) 62);
        }
    }

    static {
        field_a = new ClientConnectionState();
        field_d = "Guthix Awakens Highscores";
        field_c = 0;
    }
}
