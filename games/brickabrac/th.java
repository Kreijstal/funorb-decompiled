/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static RgbSprite field_j;
    int field_g;
    static String field_f;
    static String[] field_a;
    static boolean field_d;
    static RgbSprite field_i;
    static boolean field_h;
    static RgbSprite field_c;
    int field_e;
    static boolean field_b;

    public static void a(int param0) {
        int var1 = -115 % ((83 - param0) / 41);
        field_f = null;
        field_a = null;
        field_i = null;
        field_c = null;
        field_j = null;
    }

    final static boolean a(int[] param0, long param1, int param2, boolean param3, String param4) {
        og var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kb.a(param1, -3, param4, param0, param2)) {
            return false;
          }
          if (param2 == 1) {
            param2 = 0;
          }
          DualLinkNode.field_p = param4;
          ng.field_b = param2;
          var7 = (CharSequence) ((Object) param4);
          kb.field_Qb = gb.a(var7, 64);
          qn.field_n = param1;
          var6 = SaveResultsPromptScreen.a(param0, cp.field_K, ArchiveIndex.field_j, nb.field_e, (byte) -78);
          if (param3) {
            field_f = (String) null;
          }
          fk.a(105, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("th.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 == -63) {
          ri.c(true);
          return;
        }
        String var2 = (String) null;
        th.a((int[]) null, 43L, -67, true, (String) null);
        ri.c(true);
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -81) {
            th.a((byte) -77);
          }
          stackIn_3_0 = AchievementsScreen.a(0, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("th.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 1) {
          th.a((byte) 83);
          if (!TooltipSprite.field_p) {
            return;
          }
          rd.a(-1);
          return;
        }
        if (TooltipSprite.field_p) {
          rd.a(-1);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    th(int param0, int param1, int param2, int param3) {
        this.field_g = param3;
        this.field_e = param0;
    }

    static {
        field_h = false;
        field_f = "Players: ";
    }
}
