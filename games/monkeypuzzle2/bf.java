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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ia();
          ((al) ((Object) var3)).field_a = param2;
          if (param1 >= -52) {
            stackIn_2_0 = (al) null;
            return stackIn_2_0;
          }
          ((al) ((Object) var3)).field_b = param0;
          stackIn_4_0 = var3;
          return (al) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("bf.RA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (null == this.field_e) {
          return;
        }
        this.field_e.field_g = this.field_g;
        if (param0 == 7847) {
          this.field_g.field_e = this.field_e;
          this.field_g = null;
          this.field_e = null;
          return;
        }
        String var3 = (String) null;
        bf.a((String) null, (byte) 125, 81);
        this.field_g.field_e = this.field_e;
        this.field_g = null;
        this.field_e = null;
    }

    protected bf() {
    }

    static {
    }
}
