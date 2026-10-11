/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends o {
    static int field_o;
    int field_l;
    static String field_k;
    int field_n;
    static String field_j;
    static String field_m;

    public static void c(byte param0) {
        field_k = null;
        field_j = null;
        field_m = null;
        if (param0 <= 95) {
          field_m = (String) null;
        }
    }

    final static boolean d(byte param0) {
        if (param0 <= -121) {
          return vl.field_A == ci.field_ub ? true : false;
        }
        field_j = (String) null;
        return vl.field_A == ci.field_ub ? true : false;
    }

    final static ve a(int param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Chess.field_G;
        try {
          if (param0 != -15024) {
            hh.d((byte) -52);
          }
          if (null == r.field_Ib) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = ad.a(var6, -2);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (ve) (r.field_Ib.a((long)var2.hashCode(), 3000));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Fb);
            var4 = ad.a(var7, -2);
            if (var4 == null) {
              var4 = var3.field_Fb;
            }
            if (!var4.equals(var2)) {
              var3 = (ve) (r.field_Ib.b(true));
              continue;
            }
            break;
          }
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("hh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private hh() throws Throwable {
        throw new Error();
    }

    static {
        field_o = -1;
        field_k = "Loading music";
        field_m = "Your rating is <%0>";
        field_j = "Loading models";
    }
}
