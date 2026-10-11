/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends pg {
    static int field_o;
    static int field_n;
    static String field_l;
    static String field_j;
    static String[] field_g;
    static fe field_i;
    static dk field_m;
    static int field_h;
    static int field_k;

    private ce() throws Throwable {
        throw new Error();
    }

    public static void b(boolean param0) {
        field_i = null;
        field_l = null;
        field_g = null;
        field_j = null;
        if (param0) {
          return;
        }
        field_m = null;
    }

    final static qb b(int param0, int param1, int param2) {
        qb var6 = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        qb var6Lifetime1;
        qb var3Lifetime1;
        int var4Lifetime1;
        if (param2 != 21385) {
          ce.b(true);
        } else {
          var6 = new qb(param0, param0);
          var3 = var6;
          for (var4 = 0; var3.field_A.length > var4; var4++) {
            var6.field_A[var4] = param1;
          }
          return var3;
        }
        var6Lifetime1 = new qb(param0, param0);
        var3Lifetime1 = var6Lifetime1;
        for (var4Lifetime1 = 0; var3Lifetime1.field_A.length > var4Lifetime1; var4Lifetime1++) {
          var6Lifetime1.field_A[var4Lifetime1] = param1;
        }
        return var3Lifetime1;
    }

    final static void a(int param0, int param1, int param2) {
        na var7 = null;
        ab var9 = null;
        ab var10 = null;
        ab var11 = null;
        na var6 = null;
        na var6Lifetime1;
        na var6Lifetime2;
        if (param2 >= -65) {
          field_n = 98;
          if (param0 == ki.field_q) {
            return;
          }
          var6 = (na) (nk.field_q.a((long)ki.field_q, (byte) -109));
          var7 = var6;
          var6Lifetime2 = var7;
          ki.field_q = param0;
          if (var7 != null) {
            var7.field_Qb = null;
          } else {
            var9 = he.field_e;
            var9.b((byte) -23, param1);
            var9.f(3, (byte) -99);
            var9.f(11, (byte) -90);
            var9.c(param0, (byte) -104);
            return;
          }
          var10 = he.field_e;
          var10.b((byte) -23, param1);
          var10.f(3, (byte) -99);
          var10.f(11, (byte) -90);
          var10.c(param0, (byte) -104);
          return;
        }
        if (param0 == ki.field_q) {
          return;
        }
        var6Lifetime1 = (na) (nk.field_q.a((long)ki.field_q, (byte) -109));
        na var8 = var6Lifetime1;
        ki.field_q = param0;
        if (var8 != null) {
          var8.field_Qb = null;
        } else {
          var11 = he.field_e;
          var11.b((byte) -23, param1);
          var11.f(3, (byte) -99);
          var11.f(11, (byte) -90);
          var11.c(param0, (byte) -104);
          return;
        }
        ab var12 = he.field_e;
        var12.b((byte) -23, param1);
        var12.f(3, (byte) -99);
        var12.f(11, (byte) -90);
        var12.c(param0, (byte) -104);
    }

    static {
        field_l = "Updates will sent to the email address you've given";
        field_j = "Secondary";
    }
}
