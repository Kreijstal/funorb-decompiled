/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static tf field_c;
    static String[] field_d;
    static ta field_b;
    static String field_a;

    final static void a(byte param0) {
        if (!nf.field_u) {
          throw new IllegalStateException();
        }
        c.field_u = true;
        if (param0 == -112) {
          ic.a((byte) -123, false);
          ff.field_e = 0;
          return;
        }
        field_d = (String[]) null;
        ic.a((byte) -123, false);
        ff.field_e = 0;
    }

    final static boolean c(byte param0) {
        fh.field_a = true;
        tg.field_mb = td.b(128) + 15000L;
        if (param0 < -19) {
          return 11 == ff.field_e ? true : false;
        }
        return false;
    }

    final static te b(byte param0) {
        int var2 = 85 % ((param0 + 46) / 39);
        te var1 = new te(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], qe.field_a[0], qk.field_f);
        of.a(false);
        return var1;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(c param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -96) {
            field_b = (ta) null;
          }
          stackIn_5_0 = (param0.j(1, 8) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("da.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new String[]{"redsandstone", "venus", "moon", "alien", "virtual", "tutorial"};
        field_a = "Achievements";
    }
}
