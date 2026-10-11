/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends og implements vd {
    static String field_D;
    static int field_F;
    private pc field_z;
    private pc field_B;
    static String field_G;
    private pc field_E;
    static String field_C;

    public ae() {
        super(0, 0, 476, 225, (wo) null);
        this.field_E = new pc(mj.field_d, (bi) null);
        this.field_B = new pc(dp.field_i, (bi) null);
        this.field_z = new pc(ip.field_b, (bi) null);
        ve var1 = new ve();
        this.field_E.field_i = (wo) ((Object) var1);
        this.field_B.field_i = (wo) ((Object) var1);
        this.field_z.field_i = (wo) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_B.a(30, this.field_g - var3 >> 1, -48 + this.field_f - var2, var4, (byte) -52);
        this.field_z.a(30, var4 + ((-var3 + this.field_g >> 1) + var2), this.field_f - 48 - var2, var4, (byte) -52);
        this.field_E.a(30, this.field_g - var3 >> 1, -(var2 * 2) - 78 + this.field_f, var3, (byte) -52);
        this.field_B.field_l = (bi) (this);
        this.field_E.field_l = (bi) (this);
        this.field_z.field_l = (bi) (this);
        this.field_E.field_t = pg.field_c;
        this.field_z.field_t = md.field_o;
        this.b(this.field_B, 1);
        this.b(this.field_E, -5);
        this.b(this.field_z, -115);
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -124, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param2, -25911);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ae.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 20) {
          return;
        }
        field_D = null;
        field_C = null;
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = CrazyCrystals.field_B;
        try {
          if (this.field_B == param4) {
            gl.b(53);
          } else {
            if (this.field_E == param4) {
              ih.a((byte) 63);
            } else {
              if (this.field_z != param4) {
                var6_int = -40 % ((param0 - 83) / 36);
                return;
              }
              hf.a(4);
            }
          }
          var6_intLifetime1 = -40 % ((param0 - 83) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ae.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 < -12) {
          var5 = this.field_r + param2;
          var6 = this.field_j + param0;
          ai.field_h.a(j.field_h, 20 + var5, 20 + var6, -40 + this.field_g, this.field_f - 50, 16777215, -1, 1, 0, ai.field_h.field_o);
          super.a(param0, (byte) -20, param2, param3);
          return;
        }
    }

    static {
        field_D = "Playing Wizard Run";
        field_G = "Name";
        field_C = "There is spider web here.<br>Are there any spiders<br>nearby?";
    }
}
