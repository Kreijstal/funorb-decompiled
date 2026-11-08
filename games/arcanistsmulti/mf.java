/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_g;
    static int[] field_b;
    static kc field_d;
    static int field_c;
    static String field_f;
    static String field_e;
    static int field_a;
    static String field_h;

    final static wa a(int param0, String param1) {
        String var2 = null;
        wa var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        wa stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (uc.field_c == null) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = Js5ArchiveManager.a(var7, -13);
          if (var2 == null) {
            var2 = param1;
          }
          if (param0 != -1) {
            var6 = (String) null;
            mf.a(-34, (String) null);
          }
          var3 = (wa) (uc.field_c.get((long)var2.hashCode(), (byte) -64));
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_Cb);
            var4 = Js5ArchiveManager.a(var8, param0 - 12);
            if (var4 == null) {
              var4 = var3.field_Cb;
            }
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (wa) (uc.field_c.getNextWithSameKey(param0 ^ 82));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("mf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        fk var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        fk var2Lifetime1;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          si.field_l = param0;
          var2 = (fk) (qn.field_mb.first(12623));
          while (var2 != null) {
            if (var2.field_n.isLinked((byte) -119)) {
              var2.field_m.setVolumeQ6(si.field_l * var2.field_l + 128 >> 8);
            } else {
              var2.unlink(true);
            }
            var2 = (fk) (qn.field_mb.next(0));
          }
          if (param1 != 21298) {
            return;
          }
          if (null == he.field_f) {
            return;
          }
          var2Lifetime1 = (fk) (he.field_f.first(12623));
          while (var2Lifetime1 != null) {
            if (!var2Lifetime1.field_n.isLinked((byte) -36)) {
              var2Lifetime1.unlink(true);
            } else {
              var2Lifetime1.field_m.setVolumeQ6(var2Lifetime1.field_l * si.field_l + 128 >> 8);
            }
            var2Lifetime1 = (fk) (he.field_f.next(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2_ref), "mf.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_d = null;
        field_h = null;
        if (param0 == -1) {
          field_b = null;
          field_f = null;
          return;
        }
        mf.releaseStatics(25);
        field_b = null;
        field_f = null;
    }

    static {
        field_b = new int[8192];
        field_e = "Increases your allocated movement time each turn";
        field_f = "You have declined the invitation.";
        field_h = "Inviting <%0>";
        field_c = 480;
        field_a = -1;
    }
}
