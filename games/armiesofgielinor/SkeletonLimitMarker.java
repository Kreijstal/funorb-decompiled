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
          throw ig.a((Throwable) ((Object) runtimeException), "kj.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        qc.field_d = new UiSelectionState(2);
        qc.field_d.restoreSelection(-1, param0, vf.a(AiPlanningStrategy.field_d, -1, ko.field_b), param1);
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
            SkeletonLimitMarker.a((byte) -52);
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
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
          SkeletonLimitMarker.a((byte) 66);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final static String a(byte param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 > 26) {
          var1 = ah.field_a.a((byte) -109);
          System.out.println(var1);
          return var1;
        }
        byte[] var2 = (byte[]) null;
        SkeletonLimitMarker.a((byte[]) null, -39);
        var1Lifetime1 = ah.field_a.a((byte) -109);
        System.out.println(var1Lifetime1);
        return var1Lifetime1;
    }

    static {
        field_t = "Hide objective";
    }
}
