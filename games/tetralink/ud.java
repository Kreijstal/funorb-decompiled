/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hl {
    hl field_Wb;
    static ei field_Qb;
    static int field_Ob;
    String field_Ub;
    static String field_Pb;
    hl field_Tb;
    hl field_Kb;
    String field_Vb;
    String field_Lb;
    static int field_Nb;
    static int field_Sb;
    int field_Rb;
    String field_Mb;

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        byte[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -36) {
            var3 = (byte[]) null;
            ud.a((byte[]) null, -110);
          }
          stackIn_3_0 = cl.a(-1095, param0.length, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ud.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ud() {
        super(0L, (hl) null);
    }

    public static void h(int param0) {
        field_Qb = null;
        if (param0 != 0) {
          return;
        }
        field_Pb = null;
    }

    final static boolean c(boolean param0) {
        if (param0) {
          ud.c(false);
          return ai.a((byte) 105);
        }
        return ai.a((byte) 105);
    }

    final static void d(byte param0) {
        om.a(true, false, ek.field_s, pl.field_e);
        int var1 = -70 / ((-60 - param0) / 40);
        sn.field_b = true;
    }

    static {
        field_Ob = 0;
        field_Pb = "Concluded";
    }
}
