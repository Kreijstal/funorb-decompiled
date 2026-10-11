/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wnb extends rqa {
    static phb[] field_o;
    static String field_p;
    static int field_q;
    static String field_r;

    final static void a(ml param0, byte param1) {
        int var3 = 0;
        int[] var2 = null;
        ml var4 = null;
        ml var5 = null;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != -10) {
            return;
          }
          var7 = new int[]{27, 43, 27, 43};
          var2 = var7;
          for (var3 = 0; 4 > var3; var3++) {
            var4 = new ml(29);
            var5 = new ml(32);
            var5.a(param1 ^ -9, 2, new ml(var7[var3]));
            var5.a(1, 3, new ml(var7[var3]));
            var5.a(1, 4, new ml(var7[var3]));
            var4.a(1, 0, var5);
            param0.a(1, var3, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("wnb.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 == 0) {
          field_o = null;
          field_r = null;
          field_p = null;
          return;
        }
        ml var2 = (ml) null;
        wnb.a((ml) null, (byte) 45);
        field_o = null;
        field_r = null;
        field_p = null;
    }

    final static String a(int param0) {
        if (dw.field_c == dn.field_r) {
          return tca.field_o;
        }
        if (lrb.field_b == dw.field_c) {
          return vsa.field_q;
        }
        if (param0 < 54) {
          field_o = (phb[]) null;
          if (!wba.field_p.a(4)) {
            return vsa.field_q;
          }
          return qsb.field_d;
        }
        if (!wba.field_p.a(4)) {
          return vsa.field_q;
        }
        return qsb.field_d;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rma.a(param0[0].a(25), (byte) 47);
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wnb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    wnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Destroy the base with blueprint ships. No respawns.";
        field_q = 0;
        field_r = "Loading sound effects";
    }
}
