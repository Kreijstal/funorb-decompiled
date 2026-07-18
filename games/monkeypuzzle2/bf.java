/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bf extends ug {
    bf field_g;
    static int field_h;
    bf field_e;
    long field_f;

    final static al a(String param0, byte param1, int param2) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ia stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ia stackOut_3_0 = null;
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
            var3 = new ia();
            ((al) (Object) var3).field_a = param2;
            if (param1 < -52) {
              ((al) (Object) var3).field_b = param0;
              stackOut_3_0 = (ia) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (al) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("bf.RA(");
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
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (al) (Object) stackIn_4_0;
    }

    final void a(int param0) {
        Object var3 = null;
        if (null == ((bf) this).field_e) {
          return;
        } else {
          ((bf) this).field_e.field_g = ((bf) this).field_g;
          if (param0 != 7847) {
            var3 = null;
            al discarded$2 = bf.a((String) null, (byte) 125, 81);
            ((bf) this).field_g.field_e = ((bf) this).field_e;
            ((bf) this).field_g = null;
            ((bf) this).field_e = null;
            return;
          } else {
            ((bf) this).field_g.field_e = ((bf) this).field_e;
            ((bf) this).field_g = null;
            ((bf) this).field_e = null;
            return;
          }
        }
    }

    protected bf() {
    }

    static {
    }
}
