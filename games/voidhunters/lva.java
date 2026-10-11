/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends rqa {
    static float[] field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_p = -18;
          }
          stackIn_3_0 = new nc(frb.a(102, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lva.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          al.field_a = kda.field_g + " <b>" + amb.field_b + "</b> " + vda.field_p + " <b>" + fja.field_r + "</b> " + inb.field_p + "<br>" + "<br>" + msa.field_r;
          return;
        }
        field_p = -73;
        al.field_a = kda.field_g + " <b>" + amb.field_b + "</b> " + vda.field_p + " <b>" + fja.field_r + "</b> " + inb.field_p + "<br>" + "<br>" + msa.field_r;
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 - 1 & param0 >> 31;
        int var4 = 125 % ((param2 + 6) / 41);
        return var3 + (param0 + (param0 >>> 31)) % param1;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 617169759) {
          lva.a(-84);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 8 / ((-49 - param1) / 47);
        dmb.field_c = param2;
        wua.field_k = param0;
    }

    final static void e(byte param0) {
        if (param0 != 117) {
          return;
        }
        qn.field_h.g((byte) -17);
        qn.field_h.a(false, new hnb(qn.field_h));
    }

    lva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new float[4];
    }
}
