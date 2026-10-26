/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends qm {
    private int field_q;
    private int field_p;
    private Sprite[] field_r;
    static char[] field_o;
    private int field_n;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        boolean stackIn_8_0 = false;
        int stackIn_16_0 = 0;
        String stackIn_24_2 = null;
        try {
          if (param1 != -7592) {
            field_o = (char[]) null;
          }
          if (!param3.field_g) {
            stackIn_8_0 = (param3.e(28660));
          } else {
            stackIn_8_0 = true;
          }
          boolean var6_int = stackIn_8_0;
          if (param3 instanceof mi) {
            param0 = param0 & ((mi) (param3)).field_u;
          }
          if (!param0) {
            stackIn_16_0 = this.field_n;
          } else if (var6_int) {
            stackIn_16_0 = this.field_p;
          } else {
            stackIn_16_0 = this.field_q;
          }
          int var7 = stackIn_16_0;
          kg.a(107, param2 + param3.field_p, var7, (-this.field_r[0].fullHeight + param3.field_n >> 1) + param3.field_h + param4, param3.field_q, this.field_r);
          int stackIn_19_0 = (param0) ? 16777215 : 7105644;
          int var8 = stackIn_19_0;
          this.field_i.drawParagraph(param3.field_f, param2 + param3.field_p, -2 + (param3.field_h + param4), param3.field_q, param3.field_n, var8, -1, 1, 1, this.field_i.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var6;
          StringBuilder stackIn_23_1 = new StringBuilder().append("qb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    public qb() {
        this(2188450, 2591221, 9543);
    }

    private qb(int param0, int param1, int param2) {
        this.field_q = param0;
        this.field_n = param2;
        this.field_r = u.field_i;
        this.field_p = param1;
        this.field_i = b.field_c;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_o = (char[]) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    static {
        field_o = new char[128];
    }
}
