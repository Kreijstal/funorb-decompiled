/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SkeletonLimitMarker extends PreparedAction {
    static RgbSprite[] field_s;
    static String field_t;

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != 64) {
            SkeletonLimitMarker.a(true, -124);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kj.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        GameClock.field_d = new UiSelectionState(2);
        GameClock.field_d.restoreSelection(-1, param0, TileableNoiseGenerator.hitTestPairedSprites(AiPlanningStrategy.pointerX, -1, ko.pointerY), param1);
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          if (param1 != 31732) {
            SkeletonLimitMarker.printCurrentCoat((byte) -52);
          }
          var3 = new byte[var2_int];
          vm.a(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    SkeletonLimitMarker(int actingPlayer, int playerCount) {
        this.actingPlayer = actingPlayer;
        this.playerFlags = new int[playerCount];
        this.playerFlags[this.actingPlayer] = 8192;
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
          SkeletonLimitMarker.printCurrentCoat((byte) 66);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final static String printCurrentCoat(byte obfuscationGuard) {
        String query = null;
        String guardedQuery;
        if (obfuscationGuard > 26) {
          query = ah.localCoat.toQueryString((byte) -109);
          System.out.println(query);
          return query;
        }
        byte[] unusedPackedCoat = (byte[]) null;
        SkeletonLimitMarker.a((byte[]) null, -39);
        guardedQuery = ah.localCoat.toQueryString((byte) -109);
        System.out.println(guardedQuery);
        return guardedQuery;
    }

    static {
        field_t = "Hide objective";
    }
}
