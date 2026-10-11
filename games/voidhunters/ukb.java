/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ukb extends rqa {
    static String field_q;
    static llb field_o;
    static String field_p;

    final static String a(String param0, int param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!mn.a(var6, (byte) -122)) {
            stackIn_3_0 = tjb.field_Cb;
            return stackIn_3_0;
          }
          if (iwa.field_b != 2) {
            stackIn_7_0 = oha.field_p;
            return stackIn_7_0;
          }
          if (qja.a((byte) -75, param0)) {
            stackIn_11_0 = oja.field_o;
            return stackIn_11_0;
          }
          if (uaa.a(param0, (byte) -23)) {
            stackIn_15_0 = isa.a(dfa.field_b, new String[]{param0}, 73);
            return stackIn_15_0;
          }
          if (vob.field_p >= 100 &&
            hcb.field_o <= 0) {
            stackIn_20_0 = haa.field_o;
            return stackIn_20_0;
          }
          if (vob.field_p >= 200) {
            stackIn_24_0 = haa.field_o;
            return stackIn_24_0;
          }
          if (ltb.a((byte) -94, param0)) {
            stackIn_28_0 = isa.a(mn.field_a, new String[]{param0}, 111);
            return stackIn_28_0;
          }
          var5 = dpa.field_p;
          var5.h(24335, param1);
          var5.field_e = var5.field_e + 1;
          var4 = var5.field_e;
          var5.c(0, 0);
          var5.a(true, param0);
          if (param2 != 9602) {
            field_p = (String) null;
          }
          var5.e(-var4 + var5.field_e, -129);
          stackIn_32_0 = null;
          return (String) (stackIn_32_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("ukb.C(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = kc.field_b;
          var3 = uia.field_b;
          var4 = qc.field_q.field_eb.c(param0, 500);
          var5 = 6 + qc.field_q.field_eb.b(param0, 500);
          var6 = 2 + nna.field_w * var4;
          var7 = jv.a((byte) -109, var2_int, 12, var5);
          var8 = lma.a(20, var3, var6, (byte) -16);
          dma.b(var7, var8, var5, var6, 0);
          if (param1 <= 9) {
            ukb.e((byte) 26);
          }
          dma.d(1 + var7, 1 + var8, var5 - 2, -2 + var6, 16777088);
          qc.field_q.field_eb.a(param0, 3 + var7, var8 + 1 + atb.field_d - qc.field_q.field_eb.field_k, 500, 1000, 0, -1, 0, 0, nna.field_w);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ukb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 < -36) {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
        field_p = (String) null;
        field_q = null;
        field_o = null;
        field_p = null;
    }

    ukb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -36);
          }
          si.a(186, 62, param0[0].a(15));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ukb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Sandbox mode";
        field_q = "Game full";
    }
}
