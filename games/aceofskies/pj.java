/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj {
    static es field_a;
    int[] field_e;
    static eg field_f;
    int field_b;
    int field_c;
    java.awt.Image field_d;

    final static PcmStreamMixer c(byte param0) {
        if (param0 > -61) {
          pj.a((byte) 38);
          return qn.pcmMixer;
        }
        return qn.pcmMixer;
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void a(int param0) {
        SoftwareRasterizer.setRasterTarget(this.field_e, this.field_c, this.field_b);
        if (param0 != -12595) {
          field_f = (eg) null;
        }
    }

    public static void a(byte param0) {
        int var1 = 18 % ((param0 + 44) / 47);
        field_f = null;
        field_a = null;
    }

    final static void b(byte param0) {
        ClientException.field_d.d(new tn(), -30244);
        if (param0 >= -21) {
          s var2 = (s) null;
          pj.a(19, (s) null);
        }
    }

    final static void a(int param0, s param1) {
        int var2_int = 0;
        s var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (null == param1.field_j) {
            return;
          }
          if (param0 != param1.field_a ||
            0 != param1.field_b) {
            for (var2_int = 0; dd.field_a > var2_int; var2_int++) {
              var3 = ve.field_b[var2_int];
              if (2 == var3.field_f &&
                param1.field_a == var3.field_a &&
                var3.field_b == param1.field_b) {
                return;
              }
            }
          }
          if (param1.field_k == null) {
          }
          tr.a(param1, param0 - 96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("pj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    abstract void a(byte param0, int param1, int param2, java.awt.Component param3);

    static {
        field_f = new eg();
    }
}
