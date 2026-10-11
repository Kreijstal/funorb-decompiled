/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_a;
    static pn field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -103) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        int var3 = 0;
        bd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = EscapeVector.field_A;
        try {
          if (param1 != 17205) {
            be.a((byte) 71);
          }
          var4 = (bd) (rd.field_b.a(false));
          while (var4 != null) {
            r.a(-118, var4, param0);
            var4 = (bd) (rd.field_b.b((byte) 70));
          }
          var2 = nf.field_w.a(false);
          while (var2 != null) {
            q.c(param0, (byte) -63);
            var2 = nf.field_w.b((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "be.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Play Tutorial";
        cn discarded$0 = new cn();
    }
}
