/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends ab implements ue, dn {
    static int rendererStrikethroughColor;
    static int[] field_B;
    private jq field_y;
    private vq field_A;
    static int field_v;
    static int[] field_w;
    static String field_x;
    static boolean field_C;
    private mi field_z;
    static RenderSprite[] medalSprites;

    public final void a(byte param0, int param1, vq param2, int param3) {
        String stackIn_14_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param3 == 0) {
            qk.a("terms.ws", false);
          } else if (1 == param3) {
            qk.a("privacy.ws", false);
          } else if (param3 == 2) {
            qk.a("conduct.ws", false);
          }
          if (param0 < -59) {
            return;
          }
          rs.d((byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("rs.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        String stackIn_16_2 = null;
        try {
          if (super.a(-117, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            boolean stackIn_7_0 = this.b(param3, -87);
            return stackIn_7_0;
          }
          int var5_int = 11 / ((param0 + 53) / 33);
          if (param1 != 99) {
            return false;
          }
          boolean stackIn_10_0 = this.a(80, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rs.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_B = null;
        field_w = null;
        field_x = null;
        medalSprites = null;
        if (param0 != 105) {
          rs.d((byte) -82);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        String stackIn_7_2 = null;
        try {
          int var6_int = 36 / ((-27 - param4) / 61);
          if (this.field_z != param1) {
            return;
          }
          fg.b(true);
          this.field_y.h((byte) 119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rs.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    rs(jq param0) {
        super(0, 0, 288, 0, (ir) null);
        try {
          this.field_y = param0;
          this.field_z = new mi(mq.field_i, (no) null);
          this.field_z.field_e = (ir) ((Object) new qb());
          String var7 = sn.a(cd.field_c, 122, new String[]{this.a((byte) 127), this.e((byte) 101)});
          int var3 = 20;
          qm var4 = new qm(qo.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.maxAscent, -1, 2147483647, true);
          this.field_A = new vq(var7, var4);
          this.field_A.field_k = "";
          this.field_A.a(-57, m.field_g, 0);
          this.field_A.a(72, m.field_g, 1);
          this.field_A.field_q = this.field_q - 40;
          this.field_A.field_o = (no) (this);
          this.field_A.a(26, var3, -40 + this.field_q, (byte) 110);
          var3 = var3 + (15 + this.field_A.field_n);
          this.a(this.field_A, 1);
          int var5 = 4;
          int var6 = 200;
          this.field_z.a(40, -var6 + 300 >> 1, var3, var6, (byte) 127);
          this.field_z.field_o = (no) (this);
          this.a(this.field_z, 1);
          this.a(var3 + (55 + var5), 0, 0, 300, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String e(byte param0) {
        if (param0 <= 87) {
          rendererStrikethroughColor = 19;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_w = new int[1];
        rendererStrikethroughColor = -1;
        field_x = null;
        field_B = new int[8192];
        field_v = -1;
    }
}
