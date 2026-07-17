/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vqb extends rqa {
    static llb field_o;

    vqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e() {
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(150, 94));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vqb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void f() {
        egb.field_o = new String[fva.field_o];
        egb.field_o[5] = lr.field_q;
        egb.field_o[21] = bda.field_a;
        egb.field_o[15] = rq.field_G;
        egb.field_o[17] = otb.field_p;
        egb.field_o[9] = vqa.field_j;
        egb.field_o[11] = fk.field_d;
        egb.field_o[7] = gcb.field_o;
        egb.field_o[19] = cfa.field_e;
        egb.field_o[20] = rhb.field_o;
        egb.field_o[4] = hcb.field_q;
        egb.field_o[16] = hoa.field_p;
        egb.field_o[18] = tr.field_b;
        egb.field_o[13] = bjb.field_q;
        egb.field_o[6] = uea.field_p;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = VoidHunters.field_G;
        if (param15 >= param5) {
          if (param15 >= param11) {
            if (param11 > param5) {
              emb.a(param4, param0, param14, param15, dma.field_i, param2, param8, param5, param1, param13, param12, param7, param6, param11, param10, -1, param3);
              return;
            } else {
              emb.a(param1, param2, param8, param15, dma.field_i, param0, param14, param11, param4, param10, param12, param7, param6, param5, param13, -1, param3);
              return;
            }
          } else {
            emb.a(param7, param6, param14, param11, dma.field_i, param2, param12, param5, param1, param13, param8, param4, param0, param15, param3, -1, param10);
            return;
          }
        } else {
          if (param11 <= param5) {
            if (param15 < param11) {
              emb.a(param4, param0, param12, param5, dma.field_i, param6, param8, param15, param7, param3, param14, param1, param2, param11, param10, -1, param13);
              return;
            } else {
              emb.a(param7, param6, param8, param5, dma.field_i, param0, param12, param11, param4, param10, param14, param1, param2, param15, param3, -1, param13);
              return;
            }
          } else {
            emb.a(param1, param2, param12, param11, dma.field_i, param6, param14, param15, param7, param3, param8, param4, param0, param5, param13, -1, param10);
            return;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        klb.field_r.a(0, 0, 0);
        int var2 = 100 % ((-38 - param1) / 39);
    }

    static {
    }
}
