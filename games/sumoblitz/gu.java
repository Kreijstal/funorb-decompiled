/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends ka {
    private lm field_g;
    private int field_e;
    static String field_h;
    static int field_d;
    private int field_c;
    static int field_j;
    private lr field_i;
    private lr field_k;
    private lr field_f;
    private lr field_l;

    final void b(byte param0) {
        int var2;
        int var2Lifetime1;
        if (null != this.field_i) {
          this.field_i.b(16711680);
        }
        if (this.field_k == null) {
          if (this.field_l == null) {
            var2 = -105 % ((-65 - param0) / 56);
            if (this.field_f != null) {
              this.field_f.b(16711680);
            }
            if (this.field_g == null) {
              return;
            }
            this.field_g.a(-1);
            return;
          }
          this.field_l.b(16711680);
        } else {
          this.field_k.b(16711680);
          if (this.field_l != null) {
            this.field_l.b(16711680);
          }
        }
        var2Lifetime1 = -105 % ((-65 - param0) / 56);
        if (this.field_f != null) {
          this.field_f.b(16711680);
        }
        if (this.field_g == null) {
          return;
        }
        this.field_g.a(-1);
    }

    gu(aw param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.field_c = param2;
          this.field_e = param1;
          if (param3 ||
            jf.a(this.field_e, (byte) -97, this.field_c)) {
            this.field_i = new lr(te.a(false, this.field_e, this.field_c));
          }
          if (param3 ||
            sg.a(this.field_c, this.field_e, 37)) {
            this.field_k = new lr(om.a(this.field_c, this.field_e, (byte) -50));
          }
          if (param3 ||
            oj.a(this.field_e, 13836, this.field_c)) {
            this.field_l = new lr(se.a(31, this.field_e, this.field_c));
          }
          if (param3 ||
            bj.a(this.field_e, (byte) -113, this.field_c)) {
            this.field_f = new lr(mo.a(this.field_c, this.field_e, 30643));
          }
          if (!param3 &&
            !tf.a(this.field_c, -2626, this.field_e)) {
            return;
          }
          this.field_g = new lm(qq.b(this.field_e, this.field_c, -126));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("gu.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          gu.a(true);
        }
    }

    static {
        field_h = "Music: ";
    }
}
