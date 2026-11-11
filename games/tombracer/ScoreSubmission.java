/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreSubmission extends IntrusiveNode {
    int field_j;
    int submissionId;
    long serverResult;
    int[] scores;
    private static String[] field_m;
    static float field_p;
    int courseId;
    int field_k;
    int courseIdComplement;
    int field_i;
    int field_g;

    final static ToolkitModel getModelForCategory(int param0, boolean param1, boolean param2, int param3, int param4) {
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param3 != 2) {
          ScoreSubmission.a(-126, -35, (byte) 96);
        }
        var5 = param4;
        if (0 == var5) {
          return HelloCommand.a(param2, param0, param1, (byte) 124);
        }
        if (var5 == 1) {
          return RevolverItemComponent.field_J[param0];
        }
        if (var5 == 2) {
          return LabelledRow.field_ub[param0];
        }
        if (var5 == 3) {
          return PowerUpItemBehaviour.field_t[param0];
        }
        if (var5 == 4) {
          return GameApplet.field_j[param0];
        }
        if (5 == var5) {
          return gca.field_g[param0];
        }
        if (var5 == 6) {
          return DoorwayComponent.field_F[param0];
        }
        if (var5 == 7) {
          return SwitchLinkList.field_b[param0];
        }
        if (var5 == 8) {
          return hh.field_b[param0];
        }
        throw new IllegalArgumentException("Model category not recognised");
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != 17) {
          field_m = (String[]) null;
          if ((param1 & 2048) == 0) {
            return false;
          }
          if (0 != (55 & param0)) {
            return true;
          }
          return false;
        }
        if ((param1 & 2048) == 0) {
          return false;
        }
        if (0 != (55 & param0)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        int var1 = -64 % ((param0 + 32) / 32);
    }

    ScoreSubmission(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_j = param5;
          this.courseIdComplement = param1;
          this.field_k = param4;
          this.field_i = param2;
          this.field_g = param3;
          fieldTemp$0 = MovingSawComponent.field_N;
          MovingSawComponent.field_N = MovingSawComponent.field_N + 1;
          this.submissionId = 65535 & fieldTemp$0;
          this.scores = param6;
          this.courseId = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        DefaultRoomObjectRenderer.field_b.complete(-63, param1);
        if (param0 != 2753) {
          field_p = 0.6975499391555786f;
        }
    }

    static {
        field_m = new String[4];
        field_m[2] = "Coin Bag";
        field_m[0] = "Key";
        field_m[3] = "Idol";
        field_m[1] = "Coin";
    }
}
