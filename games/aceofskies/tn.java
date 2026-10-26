/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends ab implements dn {
    static String field_t;
    private mi field_v;
    static int[] field_w;
    private mi field_x;
    private mi field_u;

    public static void a(byte param0) {
        int var1 = -30 / ((16 - param0) / 51);
        field_w = null;
        field_t = null;
    }

    final static boolean a(int param0, CipherPacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 110 / ((param0 - 9) / 54);
          stackIn_3_0 = (param1.b((byte) 88, 1) == 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tn.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = this.field_p + param3;
        int var6 = this.field_h + param2;
        qo.field_b.drawParagraph(jc.field_Mc, 20 + var5, var6 + 20, -40 + this.field_q, -50 + this.field_n, 16777215, -1, 1, 0, qo.field_b.maxAscent);
        if (param0 <= 64) {
          this.a((byte) 126, -69, -35, 122);
        }
        super.a((byte) 110, param1, param2, param3);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(33, param1, param2, param3)) {
            return true;
          }
          var5_int = 103 % ((-53 - param0) / 33);
          if (98 == param1) {
            stackIn_6_0 = this.b(param3, -108);
            return stackIn_6_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_9_0 = this.a(80, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("tn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(ResourceArchive param0, byte param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        CipherPacketBuffer var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param0.a(param3, -10470, param2);
          var4 = var6;
          if (param1 != -127) {
            var5 = (CipherPacketBuffer) null;
            tn.a(-9, (CipherPacketBuffer) null);
          }
          if (var6 == null) {
            return false;
          }
          jr.a(var6, param1 + 7275);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("tn.BA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ll a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!param2) {
          return (ll) null;
        }
        ll var6 = new ll(param1, param1);
        ll var3 = var6;
        for (var4 = 0; var4 < var3.field_x.length; var4++) {
          var6.field_x[var4] = param0;
        }
        return var3;
    }

    public tn() {
        super(0, 0, 476, 225, (ir) null);
        this.field_u = new mi(SteeringMode.field_b, (no) null);
        this.field_v = new mi(Aircraft.field_s, (no) null);
        this.field_x = new mi(nu.field_a, (no) null);
        qb var1 = new qb();
        this.field_u.field_e = (ir) ((Object) var1);
        this.field_v.field_e = (ir) ((Object) var1);
        this.field_x.field_e = (ir) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_v.a(30, -var3 + this.field_q >> 1, -48 + (this.field_n - var2), var4, (byte) 127);
        this.field_x.a(30, var4 + (-var3 + this.field_q >> 1) + var2, -var2 - 48 + this.field_n, var4, (byte) 123);
        this.field_u.a(30, this.field_q - var3 >> 1, -(var2 * 2) + (-78 + this.field_n), var3, (byte) 126);
        this.field_v.field_o = (no) (this);
        this.field_u.field_o = (no) (this);
        this.field_x.field_o = (no) (this);
        this.field_u.field_k = cl.field_db;
        this.field_x.field_k = td.field_c;
        this.a(this.field_v, 1);
        this.a(this.field_u, 1);
        this.a(this.field_x, 1);
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        try {
          se.field_a = param3;
          dp.field_i = param2;
          ua.a(ec.field_o, param1, (byte) -101);
          if (param0 != 1) {
            field_w = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tn.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var6_int = 77 % ((param4 + 27) / 61);
          if (param1 != this.field_v) {
            if (this.field_u != param1) {
              if (param1 == this.field_x) {
                of.a(111);
              }
            } else {
              cu.c((byte) 96);
            }
          } else {
            ua.e(4754);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tn.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_w = new int[1];
    }
}
