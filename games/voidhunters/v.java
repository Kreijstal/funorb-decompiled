/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends htb {
    private int field_E;
    int field_F;
    private hma field_G;
    int field_C;

    final int a(int param0) {
        if (param0 != 0) {
          this.a(-12);
          return this.field_G.a((byte) -118);
        }
        return this.field_G.a((byte) -118);
    }

    final static phb[] b(boolean param0) {
        phb[] var1;
        int var2;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var7;
        int var8;
        byte[] var9;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var25;
        int var6;
        int[] var10;
        byte[] var23;
        int[] var24;
        int[] var26;
        var8 = VoidHunters.field_G;
        var1 = new phb[mma.field_a];
        if (!param0) {
          for (var2 = 0; mma.field_a > var2; var2++) {
            var3 = hla.field_a[var2] * nhb.field_o[var2];
            var25 = sh.field_a[var2];
            if (!mk.field_o[var2]) {
              var10 = new int[var3];
              var26 = var10;
              for (var6 = 0; var3 > var6; var6++) {
                var10[var6] = rlb.field_d[dla.a((int) var25[var6], 255)];
              }
              var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var26);
            } else {
              var15 = hja.field_o[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              for (var7 = 0; var3 > var7; var7++) {
                var6_ref_int__[var7] = knb.a(dla.a(var15[var7] << 24, -16777216), rlb.field_d[dla.a((int) var25[var7], 255)]);
              }
              var1[var2] = (phb) ((Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var17));
            }
          }
        } else {
          v.b(true);
          for (var2 = 0; mma.field_a > var2; var2++) {
            var3 = hla.field_a[var2] * nhb.field_o[var2];
            var23 = sh.field_a[var2];
            if (!mk.field_o[var2]) {
              var10 = new int[var3];
              var24 = var10;
              for (var6 = 0; var3 > var6; var6++) {
                var10[var6] = rlb.field_d[dla.a((int) var23[var6], 255)];
              }
              var1[var2] = new phb(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var24);
            } else {
              var15 = hja.field_o[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              for (var7 = 0; var3 > var7; var7++) {
                var6_ref_int__[var7] = knb.a(dla.a(var15[var7] << 24, -16777216), rlb.field_d[dla.a((int) var23[var7], 255)]);
              }
              var1[var2] = (phb) ((Object) new jva(fbb.field_i, sg.field_H, iib.field_e[var2], so.field_f[var2], nhb.field_o[var2], hla.field_a[var2], var17));
            }
          }
        }
        qqb.a(105);
        return var1;
    }

    final int a(int param0, int param1) {
        if (param0 > -89) {
          v.b(false);
          if (0 > param1) {
            return -1;
          }
          if (param1 < this.field_G.a((byte) 108)) {
            return this.field_G.b(param1, (byte) 106);
          }
          return -1;
        }
        if (0 > param1) {
          return -1;
        }
        if (param1 < this.field_G.a((byte) 108)) {
          return this.field_G.b(param1, (byte) 106);
        }
        return -1;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var12 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = VoidHunters.field_G;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -67)) {
            if (param6 >= -17) {
              this.e(-69);
            }
            return false;
          }
          var8_int = -this.field_C + (-param1 + param0);
          var9 = -(this.field_C * 2) + this.field_h;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.field_E * var8_int / var9;
          if (1 == param3) {
            this.field_G.a((byte) -73, var8_int);
          } else {
            if (param3 == 2) {
              var10 = 2147483647;
              var11 = -1;
              for (var12 = 0; this.field_G.a((byte) -102) > var12; var12++) {
                var13 = this.field_G.b(var12, (byte) 106) - var8_int;
                var13 = var13 * var13;
                if (var13 < var10) {
                  var11 = var12;
                  var10 = var13;
                }
              }
              if (0 > var11) {
                return true;
              }
              this.field_G.a(var11, (byte) 70);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_31_0 = var8;
          stackIn_31_1 = new StringBuilder().append("v.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int e(int param0) {
        int var2 = -42 / ((param0 + 44) / 52);
        return this.field_E;
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
    }
}
