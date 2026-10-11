/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static le field_b;
    private static long[] field_d;
    static String field_a;
    static String field_c;
    static String field_e;

    final static void a(boolean param0) {
        ed.j(120);
        if (param0) {
          eg var2 = (eg) null;
          r.a(51, -102, 48, (eg) null);
        }
        oc.a(112, nn.field_p, tl.field_a[0].field_n, dh.field_Gb, ga.field_r, ra.field_h);
    }

    final static qb a(int param0, int param1, int param2, eg param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!fc.a(-126, param3, param2, param1)) {
            stackIn_2_0 = null;
            return (qb) (stackIn_2_0);
          }
          if (param0 != -17928) {
            field_a = (String) null;
          }
          stackIn_6_0 = wh.a(-112);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != 8) {
          String var2 = (String) null;
          r.a((String) null, 56);
        }
    }

    final static ho a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        ho stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 256) {
            r.a(121);
          }
          if (sk.field_a == hb.field_Gb) {
            return null;
          }
          if (pa.field_g == hb.field_Gb &&
            param0.equals(ji.field_j)) {
            hb.field_Gb = uj.field_h;
            stackIn_11_0 = fh.field_i;
            return stackIn_11_0;
          }
          hb.field_Gb = sk.field_a;
          ji.field_j = param0;
          fh.field_i = null;
          stackIn_9_0 = null;
          return (ho) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("r.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_d = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if ((1L & var0) == 1L) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_d[var2] = var0;
        }
        field_a = "Please remove <%0> from your ignore list first.";
        field_c = "You just fell into the water. Try not to do this in future, as outside of this training area it will result in injury.";
        field_e = "Return to game";
    }
}
