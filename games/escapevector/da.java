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
        } else {
          c.field_u = true;
          if (param0 != -112) {
            field_d = (String[]) null;
            ic.a((byte) -123, false);
            ff.field_e = 0;
            return;
          } else {
            ic.a((byte) -123, false);
            ff.field_e = 0;
            return;
          }
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        fh.field_a = true;
        tg.field_mb = td.b(128) - -15000L;
        if (param0 >= -19) {
          return false;
        } else {
          L0: {
            if (11 != ff.field_e) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static te b(byte param0) {
        int var2 = 85 % ((param0 - -46) / 39);
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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -96) {
                break L1;
              } else {
                field_b = (ta) null;
                break L1;
              }
            }
            L2: {
              if ((param0.j(1, 8) ^ -1) != -2) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("da.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_d = new String[]{"redsandstone", "venus", "moon", "alien", "virtual", "tutorial"};
        field_a = "Achievements";
    }
}
