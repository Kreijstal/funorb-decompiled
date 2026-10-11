/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends td {
    static String field_r;
    static String field_q;
    static eaa field_s;
    static boolean field_p;

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != 0) {
          field_s = (eaa) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    ja(int param0, aga param1) {
        super(param0, param1);
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 >= -4) {
          field_q = (String) null;
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param2) {
            var4 += 2;
          }
          if (param1) {
            var4++;
            return ql.field_r[var4];
          }
          return ql.field_r[var4];
        }
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param2) {
          var4Lifetime1 += 2;
        }
        if (!param1) {
          return ql.field_r[var4Lifetime1];
        }
        var4Lifetime1++;
        return ql.field_r[var4Lifetime1];
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        vba var4 = null;
        vba stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.a(10, param0);
          var4 = new vba(this.field_g, new nq(var3));
          if (param1 != 3) {
            field_q = (String) null;
          }
          stackIn_3_0 = var4;
          return (ii) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_q = "Win %";
        field_s = new eaa();
        field_p = true;
    }
}
