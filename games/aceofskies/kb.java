/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends vq {
    private Sprite field_F;
    static ej field_C;
    private String field_A;
    private int field_E;
    private sp field_B;
    static SpriteData[] scoreDigitSpriteData;

    public static void h(int param0) {
        field_C = null;
        if (param0 != 1927884356) {
          field_C = (ej) null;
          scoreDigitSpriteData = null;
          return;
        }
        scoreDigitSpriteData = null;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        try {
          this.field_E = this.field_E + 1;
          super.a((byte) 42, param1, param2, param3);
          if (param0 < 13) {
            this.field_B = (sp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != -1903710079) {
          return (String) null;
        }
        return rs.field_x;
    }

    kb(sp param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pe.a((byte) -63));
        try {
          this.field_B = param0;
          this.field_A = param1;
          this.a(param5, param2, param3, param4, (byte) 123);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -42) {
            return false;
          }
          this.field_E = -90;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kb.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var17 = null;
        et var30 = null;
        Sprite var19 = null;
        Sprite var20 = null;
        Sprite var21 = null;
        et var31 = null;
        Sprite var23 = null;
        Sprite var24 = null;
        Sprite var25 = null;
        Sprite var27 = null;
        Sprite var28 = null;
        String var5 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        Object var22 = null;
        Object var26 = null;
        int var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        pt var6 = this.field_B.b(true);
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (jc.field_Pc == var6) {
          var17 = uu.field_g;
          if (!var17.equals(this.field_f)) {
            this.field_f = var17;
            this.a((byte) -67);
          }
          super.a((byte) 107, param1, param2, param3);
          var6 = this.field_B.b(true);
          var30 = (et) ((Object) this.field_e);
          var9 = param3 + this.field_p;
          var10 = var30.a(param2, false, (ea) (this)) + (var30.a((byte) 86, (ea) (this)).a(0) >> 1);
          if (param0 <= 64) {
            return;
          }
          if (jc.field_Pc == var6 ||
            var6 == ce.field_t) {
            var19 = gu.field_c[0];
            var11 = var19.fullWidth << 1;
            var12 = var19.fullHeight << 1;
            if (this.field_F == null) {
              this.field_F = new Sprite(var11, var12);
              cm.a(this.field_F, -14492);
              var19.a(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9 - (var19.fullWidth >> 1), -var19.fullHeight + var10, 256);
              return;
            }
            if (this.field_F.width < var11) {
              this.field_F = new Sprite(var11, var12);
              cm.a(this.field_F, -14492);
              var19.a(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9 - (var19.fullWidth >> 1), -var19.fullHeight + var10, 256);
              return;
            }
            if (this.field_F.height >= var12) {
              cm.a(this.field_F, -14492);
              SoftwareRasterizer.clearFramebuffer();
              var19.a(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9 - (var19.fullWidth >> 1), -var19.fullHeight + var10, 256);
              return;
            }
            this.field_F = new Sprite(var11, var12);
            cm.a(this.field_F, -14492);
            var19.a(112, 144, var19.fullWidth << 4, var19.fullHeight << 4, -this.field_E << 10, 4096);
            sl.c(2765);
            this.field_F.d(var9 - (var19.fullWidth >> 1), -var19.fullHeight + var10, 256);
            return;
          }
          if (var6 == bt.field_a) {
            var20 = gu.field_c[2];
            var20.d(var9, -(var20.height >> 1) + var10, 256);
            return;
          }
          if (fd.field_a == var6) {
            var21 = gu.field_c[1];
            var21.d(var9, -(var21.height >> 1) + var10, 256);
            return;
          }
          return;
        }
        if (ce.field_t == var6) {
          var5 = uu.field_g;
        } else {
          var5 = this.field_B.a(true);
          if (var5 == null) {
            var5 = this.field_A;
          }
        }
        if (var5.equals(this.field_f)) {
          super.a((byte) 107, param1, param2, param3);
          var6 = this.field_B.b(true);
          var31 = (et) ((Object) this.field_e);
          var9Lifetime1 = param3 + this.field_p;
          var10Lifetime1 = var31.a(param2, false, (ea) (this)) + (var31.a((byte) 86, (ea) (this)).a(0) >> 1);
          if (param0 <= 64) {
            return;
          }
          if (jc.field_Pc == var6 ||
            var6 == ce.field_t) {
            var23 = gu.field_c[0];
            var11Lifetime1 = var23.fullWidth << 1;
            var12Lifetime1 = var23.fullHeight << 1;
            if (this.field_F == null) {
              this.field_F = new Sprite(var11Lifetime1, var12Lifetime1);
              cm.a(this.field_F, -14492);
              var23.a(112, 144, var23.fullWidth << 4, var23.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9Lifetime1 - (var23.fullWidth >> 1), -var23.fullHeight + var10Lifetime1, 256);
              return;
            }
            if (this.field_F.width < var11Lifetime1) {
              this.field_F = new Sprite(var11Lifetime1, var12Lifetime1);
              cm.a(this.field_F, -14492);
              var23.a(112, 144, var23.fullWidth << 4, var23.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9Lifetime1 - (var23.fullWidth >> 1), -var23.fullHeight + var10Lifetime1, 256);
              return;
            }
            if (this.field_F.height >= var12Lifetime1) {
              cm.a(this.field_F, -14492);
              SoftwareRasterizer.clearFramebuffer();
              var23.a(112, 144, var23.fullWidth << 4, var23.fullHeight << 4, -this.field_E << 10, 4096);
              sl.c(2765);
              this.field_F.d(var9Lifetime1 - (var23.fullWidth >> 1), -var23.fullHeight + var10Lifetime1, 256);
              return;
            }
            this.field_F = new Sprite(var11Lifetime1, var12Lifetime1);
            cm.a(this.field_F, -14492);
            var23.a(112, 144, var23.fullWidth << 4, var23.fullHeight << 4, -this.field_E << 10, 4096);
            sl.c(2765);
            this.field_F.d(var9Lifetime1 - (var23.fullWidth >> 1), -var23.fullHeight + var10Lifetime1, 256);
            return;
          }
          if (var6 == bt.field_a) {
            var24 = gu.field_c[2];
            var24.d(var9Lifetime1, -(var24.height >> 1) + var10Lifetime1, 256);
            return;
          }
          if (fd.field_a == var6) {
            var25 = gu.field_c[1];
            var25.d(var9Lifetime1, -(var25.height >> 1) + var10Lifetime1, 256);
            return;
          }
          return;
        }
        this.field_f = var5;
        this.a((byte) -67);
        super.a((byte) 107, param1, param2, param3);
        var6 = this.field_B.b(true);
        et var32 = (et) ((Object) this.field_e);
        var9Lifetime2 = param3 + this.field_p;
        var10Lifetime2 = var32.a(param2, false, (ea) (this)) + (var32.a((byte) 86, (ea) (this)).a(0) >> 1);
        if (param0 <= 64) {
          return;
        }
        if (jc.field_Pc == var6 ||
          var6 == ce.field_t) {
          var27 = gu.field_c[0];
          var11Lifetime2 = var27.fullWidth << 1;
          var12Lifetime2 = var27.fullHeight << 1;
          if (this.field_F == null) {
            this.field_F = new Sprite(var11Lifetime2, var12Lifetime2);
            cm.a(this.field_F, -14492);
            var27.a(112, 144, var27.fullWidth << 4, var27.fullHeight << 4, -this.field_E << 10, 4096);
            sl.c(2765);
            this.field_F.d(var9Lifetime2 - (var27.fullWidth >> 1), -var27.fullHeight + var10Lifetime2, 256);
            return;
          }
          if (this.field_F.width < var11Lifetime2) {
            this.field_F = new Sprite(var11Lifetime2, var12Lifetime2);
            cm.a(this.field_F, -14492);
            var27.a(112, 144, var27.fullWidth << 4, var27.fullHeight << 4, -this.field_E << 10, 4096);
            sl.c(2765);
            this.field_F.d(var9Lifetime2 - (var27.fullWidth >> 1), -var27.fullHeight + var10Lifetime2, 256);
            return;
          }
          if (this.field_F.height < var12Lifetime2) {
            this.field_F = new Sprite(var11Lifetime2, var12Lifetime2);
            cm.a(this.field_F, -14492);
            var27.a(112, 144, var27.fullWidth << 4, var27.fullHeight << 4, -this.field_E << 10, 4096);
            sl.c(2765);
            this.field_F.d(var9Lifetime2 - (var27.fullWidth >> 1), -var27.fullHeight + var10Lifetime2, 256);
            return;
          }
          cm.a(this.field_F, -14492);
          SoftwareRasterizer.clearFramebuffer();
          var27.a(112, 144, var27.fullWidth << 4, var27.fullHeight << 4, -this.field_E << 10, 4096);
          sl.c(2765);
          this.field_F.d(var9Lifetime2 - (var27.fullWidth >> 1), -var27.fullHeight + var10Lifetime2, 256);
          return;
        }
        if (var6 == bt.field_a) {
          var28 = gu.field_c[2];
          var28.d(var9Lifetime2, -(var28.height >> 1) + var10Lifetime2, 256);
          return;
        }
        if (fd.field_a != var6) {
          return;
        }
        Sprite var29 = gu.field_c[1];
        var29.d(var9Lifetime2, -(var29.height >> 1) + var10Lifetime2, 256);
    }

    final String c(byte param0) {
        if (param0 <= -41) {
          return null;
        }
        kb.a(106);
        return null;
    }

    static {
        field_C = new ej(9, 0, 4, 1);
    }
}
