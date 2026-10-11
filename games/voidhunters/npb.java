/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npb {
    private boolean field_b;
    private int field_f;
    private int field_d;
    private int field_e;
    private int field_a;
    private boolean field_g;
    private boolean field_c;

    final void a(int param0, int param1, rsb param2, sg param3) {
        boolean stackIn_15_1 = false;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        boolean stackIn_58_1 = false;
        int stackIn_61_0 = 0;
        boolean stackIn_68_1 = false;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sg[] var9 = null;
        sg[] var10_ref_sg__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg var12_ref_sg = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sg var16 = null;
        int var11Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param1 != 84) {
            var16 = (sg) null;
            this.a(-99, (rsb) null, (byte) -13, (sg) null);
          }
          if (param3 == null) {
            this.field_g = false;
            this.field_d = 0;
            this.field_a = 0;
            this.field_e = 0;
            return;
          }
          var5_int = param3.s((byte) -90) ? 1 : 0;
          if (this.field_g &&
            var5_int == 0) {
            lha.a(-112, fa.field_d[18]);
          } else {
            if (var5_int != 0 &&
              !this.field_g) {
              lha.a(-86, fa.field_d[10]);
            }
          }
          stackIn_15_1 = (var5_int != 0);
          this.field_g = stackIn_15_1;
          var6 = param3.o(-55);
          var7 = 64;
          if (var6 < var7 &&
            var7 < this.field_d &&
            this.field_f <= 0) {
            lha.a(-87, fa.field_d[16]);
            this.field_f = oq.field_l;
          }
          if (this.field_f > 0) {
            this.field_f = this.field_f - 1;
          }
          this.field_d = var6;
          var8 = 0;
          var9 = param2.field_g.d(1000);
          var10_ref_sg__ = var9;
          for (var11 = 0; var10_ref_sg__.length > var11; var11++) {
            var12_ref_sg = var10_ref_sg__[var11];
            if (var12_ref_sg != null) {
              if (!var12_ref_sg.b(2, (byte) -3)) {
                stackIn_32_0 = (!var12_ref_sg.b(1, (byte) 69)) ? 1 : 0;
              } else {
                stackIn_32_0 = 0;
              }
              var13 = stackIn_32_0;
              if (var12_ref_sg.q((byte) 98) == param3.q((byte) 65)) {
                if (!qab.a(param1 ^ 57, param2.field_g.d(false))) {
                  if (var12_ref_sg.o((byte) -117) != param3.o((byte) -117)) {
                    if (null != var12_ref_sg.k((byte) -108)) {
                      stackIn_44_0 = (var12_ref_sg.k((byte) -108).a((byte) 127) != param0) ? 1 : 0;
                    } else {
                      stackIn_44_0 = 1;
                    }
                  } else {
                    stackIn_44_0 = 0;
                  }
                } else {
                  stackIn_44_0 = 0;
                }
              } else {
                stackIn_44_0 = 1;
              }
              var14 = stackIn_44_0;
              if (var13 != 0 &&
                var14 != 0) {
                var8++;
              }
            }
          }
          if (this.field_e < var8) {
            lha.a(param1 - 186, fa.field_d[9]);
          }
          this.field_e = var8;
          var10 = param3.r((byte) -86) ? 1 : 0;
          if (var10 != 0 &&
            !this.field_b) {
            lha.a(-90, fa.field_d[83]);
          }
          stackIn_58_1 = (var10 != 0);
          this.field_b = stackIn_58_1;
          stackIn_61_0 = (!param3.d(9, 47)) ? 0 : 1;
          var11Lifetime1 = stackIn_61_0;
          if (var11Lifetime1 != 0 &&
            !this.field_c) {
            lha.a(-103, fa.field_d[84]);
          }
          stackIn_68_1 = (var11Lifetime1 != 0);
          this.field_c = stackIn_68_1;
          if (var11Lifetime1 == 0) {
            return;
          }
          var12 = param3.y(8) / oq.field_l;
          if (var12 < 0) {
            var12 = 0;
          }
          if (this.field_a > var12) {
            lha.a(-98, fa.field_d[85]);
          }
          this.field_a = var12;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("npb.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final void a(int param0, rsb param1, byte param2, sg param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        sg var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != null) {
            var5_int = param3.t(0);
            if (var5_int < 64) {
              ioa.a(15, 0, (byte) -53);
            }
            if (param1.field_g.b(param3.c(false), -71)) {
              ioa.a(86, 0, (byte) -109);
            }
          }
          if (param2 == 70) {
            return;
          }
          var6 = (sg) null;
          this.a(29, (rsb) null, (byte) -95, (sg) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("npb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
