/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements dja {
    static String field_a;

    public final tv a(byte param0) {
        int var2 = -55 / ((-64 - param0) / 50);
        return (tv) ((Object) new vp());
    }

    final static boolean a(int param0, fm param1, fm param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.field_c < param1.field_c) {
            return true;
          }
          if (param1.field_c == param2.field_c &&
            param2.field_a < param1.field_a) {
            return true;
          }
          if (param0 == -27544) {
            return false;
          }
          field_a = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_a = null;
        if (param0 < 27) {
          uk.c((byte) -7);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          this.a((byte) 15);
          return (tv[]) ((Object) new vp[param1]);
        }
        return (tv[]) ((Object) new vp[param1]);
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        var2 = VoidHunters.field_G;
        rg.field_b = false;
        hab.field_j = null;
        if (tla.field_c) {
          hwa.field_o.g(-123);
          if (param0 > 30) {
            return;
          }
          uk.c((byte) 6);
          return;
        }
        var1 = jl.field_p;
        if (var1 > 0) {
          if (var1 == 1) {
            hab.field_j = nnb.field_d;
          } else {
            hab.field_j = isa.a(bva.field_g, new String[]{Integer.toString(var1)}, 119);
          }
          hab.field_j = geb.a(0, new CharSequence[]{(CharSequence) ((Object) hab.field_j), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) vo.field_o)});
        }
        hwa.field_o.l((byte) -106);
        gib.a((byte) -89);
        if (param0 > 30) {
          return;
        }
        uk.c((byte) 6);
        return;
    }

    static {
        field_a = "<%0> wants to join";
    }
}
