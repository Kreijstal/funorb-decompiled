/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static gu field_e;
    static int field_d;
    static ClientUiComponent field_a;
    static int field_c;
    static String field_b;

    final static void generateProceduralMap(int obfuscationGuard, Battlefield battlefield) {
        if (obfuscationGuard >= -1) {
          return;
        }
        try {
          MovementPlanner.generateProceduralMap((byte) 96, battlefield);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rn.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    static int bitwiseAnd(int left, int right) {
        return left & right;
    }

    final static String b(boolean param0) {
        if (!param0) {
          rn.a(true);
          if (null != mv.localAccountName) {
            return mv.localAccountName;
          }
          return "";
        }
        if (null != mv.localAccountName) {
          return mv.localAccountName;
        }
        return "";
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
          MapRepository.a(true);
          KingBlackDragonEvent.field_C.j(param0 ^ -124);
          ContextActionMenu.field_Qb = new df(IsaacRandom.field_d, (String) null, fh.field_i, param2, param3);
          if (param0 != 3) {
            field_d = -55;
          }
          lt.field_g = new lw(KingBlackDragonEvent.field_C, ContextActionMenu.field_Qb);
          KingBlackDragonEvent.field_C.a(lt.field_g, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        rn.a(-107, (String) null, true, true);
        field_e = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_e = new gu();
        field_b = "This structure is not captured";
        field_c = 3;
    }
}
