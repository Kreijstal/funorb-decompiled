/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_a;
    static long field_b;
    static String field_c;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 > -79) {
          og.a((byte) -45);
        }
        if (ub.field_e == null) {
          return;
        }
        var1 = ub.field_e;
        synchronized (var1) {
          ub.field_e = null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -61) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!mg.b(true)) {
          return;
        }
        cl.a(118, false, 4);
        if (param0 != -5213) {
          field_c = (String) null;
        }
    }

    final static int a(boolean param0) {
        PartInstruction[] var1 = null;
        PartInstruction[] var2 = null;
        PartInstruction[] var1Lifetime1;
        PartInstruction[] var1Lifetime2;
        PartInstruction[] var2Lifetime1;
        PartInstruction[] var1Lifetime3;
        if (param0) {
          var1 = new PartInstruction[]{};
          var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
          var1Lifetime3 = var2;
          return var2.length * 36;
        }
        og.b(124);
        var1Lifetime1 = new PartInstruction[]{};
        var2Lifetime1 = hl.field_v.a(var1Lifetime1, -21636, fg.field_Ob);
        var1Lifetime2 = var2Lifetime1;
        return var2Lifetime1.length * 36;
    }

    static {
        field_a = "Hide game chat";
        field_c = "Waiting for fonts";
    }
}
