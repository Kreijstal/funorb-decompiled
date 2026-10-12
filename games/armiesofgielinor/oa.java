/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends dr {
    static QuickChatCommandDefinition field_F;
    static String field_G;
    static String field_E;
    static IndexedSprite[] field_H;
    static ij field_I;

    oa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void g(int param0) {
        if (param0 >= -112) {
          return;
        }
        field_I = null;
        field_G = null;
        field_H = null;
        field_E = null;
        field_F = null;
    }

    final static void h(int param0) {
        if (param0 != 2) {
          field_H = (IndexedSprite[]) null;
          ContextActionMenu.a(true, (byte) -113);
          return;
        }
        ContextActionMenu.a(true, (byte) -113);
    }

    final static void a(int param0, MusicTrack param1) {
        try {
          if (param1 != null) {
            TrianglePulse.a(-16147, 50, param1, true);
            ((wn) (lk.musicCrossfadeStream.selectedSequencer)).a((byte) -111, 1, CorpseConditionMarker.field_u);
          }
          int var2_int = 100 / ((-17 - param0) / 33);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -24872) {
            oa.g(-45);
          }
          stackIn_3_0 = new nd(ti.b((byte) -120));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_G = "No";
        field_F = new QuickChatCommandDefinition(2, 4, 4, 0);
        field_E = "Remove <%0> from ignore list";
    }
}
