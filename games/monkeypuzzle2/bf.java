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
        al stackIn_2_0 = null;
        ia stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new ia();
            ((al) ((Object) var3)).field_a = param2;
            if (param1 < -52) {
              ((al) ((Object) var3)).field_b = param0;
              stackIn_4_0 = (ia) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (al) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("bf.RA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (al) ((Object) stackIn_4_0);
        }
    }

    final void a(int param0) {
        String var3;
        if (null == this.field_e) {
          return;
        } else {
          this.field_e.field_g = this.field_g;
          if (param0 != 7847) {
            var3 = (String) null;
            bf.a((String) null, (byte) 125, 81);
            this.field_g.field_e = this.field_e;
            this.field_g = null;
            this.field_e = null;
            return;
          } else {
            this.field_g.field_e = this.field_e;
            this.field_g = null;
            this.field_e = null;
            return;
          }
        }
    }

    protected bf() {
    }

    static {
    }
}
