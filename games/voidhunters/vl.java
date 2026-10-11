/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends rqa {
    static mma field_p;
    static String field_q;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            vl.a(-21);
          }
          stackIn_3_0 = new nc(frb.a(98, 125));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vl.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          var1 = gha.field_q;
          synchronized (var1) {
            if (param0 != -101) {
              return;
            }
            baa.field_q = baa.field_q + 1;
            bva.field_c = nwa.field_a;
            if (dh.field_p < 0) {
              for (var2 = 0; 112 > var2; var2++) {
                si.field_o[var2] = false;
              }
              dh.field_p = wlb.field_p;
            } else {
              while (dh.field_p != wlb.field_p) {
                var2 = kq.field_o[wlb.field_p];
                wlb.field_p = 127 & 1 + wlb.field_p;
                if (var2 >= 0) {
                  si.field_o[var2] = true;
                  continue;
                }
                si.field_o[~var2] = false;
              }
            }
            nwa.field_a = tna.field_o;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "vl.C(" + param0 + ')');
        }
    }

    vl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 127) {
          field_p = (mma) null;
          field_p = null;
          field_q = null;
          return;
        }
        field_p = null;
        field_q = null;
    }

    static {
        field_p = new mma();
        field_q = "You need a rating of <%1> to play with the current options.";
    }
}
