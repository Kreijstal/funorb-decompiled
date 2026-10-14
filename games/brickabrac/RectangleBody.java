/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RectangleBody extends MovingBody {
    int height256;
    static String field_t;
    static RgbSprite field_p;
    int width256;
    static UiComponent field_q;
    static PacketBuffer field_r;

    boolean resolveCircleCollision(CircleBody circle, byte obfuscationGuard) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var6Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var34 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = circle.radius256;
          var4 = var3_int + circle.x256;
          var5 = var3_int + circle.y256;
          var6 = -this.y256 - (this.height256 >> 1) + var5;
          if (var6 < 0) {
            var6 = -var6;
          }
          if (var3_int + (this.height256 >> 1) <= var6) {
            return false;
          }
          var6Lifetime1 = -(this.width256 >> 1) - (this.x256 - var4);
          if (var6Lifetime1 < 0) {
            var6Lifetime1 = -var6Lifetime1;
          }
          if (var6Lifetime1 >= (this.width256 >> 1) + var3_int) {
            return false;
          }
          var7 = var4;
          var8 = var5;
          if (this.y256 <= var5) {
            if (this.height256 + this.y256 < var5) {
              var8 = this.y256 + this.height256;
            }
          } else {
            var8 = this.y256;
          }
          if (var4 < this.x256) {
            var7 = this.x256;
          } else {
            if (var4 > this.x256 + this.width256) {
              var7 = this.width256 + this.x256;
            }
          }
          var9 = (-var4 + var7) * (var7 - var4) + (var8 - var5) * (-var5 + var8);
          if (var9 > var3_int * var3_int) {
            return false;
          }
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = 0;
          var18 = -this.velocityY256 + circle.velocityY256;
          var19 = -var3_int + this.y256 - var5;
          var20 = var19 << 8;
          var21 = -var5 + (this.y256 + var3_int) + this.height256;
          var22 = var21 << 8;
          if (var18 != 0) {
            var22 = var22 / var18;
            var20 = var20 / var18;
          }
          var23 = -3 / ((obfuscationGuard + 29) / 35);
          if (var20 < var22) {
            var14Lifetime1 = var19;
            var17Lifetime1 = 1;
            var12Lifetime1 = var20;
          } else {
            var14Lifetime1 = var21;
            var12Lifetime1 = var22;
            var17Lifetime1 = 2;
          }
          var14Lifetime1 = var14Lifetime1 + var5;
          var24 = -this.velocityX256 + circle.velocityX256;
          var25 = -var3_int + this.x256 - var4;
          var26 = var25 << 8;
          var27 = -var4 + (this.x256 + var3_int + this.width256);
          var28 = var27 << 8;
          if (var24 != 0) {
            var28 = var28 / var24;
            var26 = var26 / var24;
          }
          if (var28 <= var26) {
            var13Lifetime1 = var27;
            var16Lifetime1 = 4;
            var11Lifetime1 = var28;
          } else {
            var16Lifetime1 = 8;
            var11Lifetime1 = var26;
            var13Lifetime1 = var25;
          }
          var13Lifetime1 = var13Lifetime1 + var4;
          var29 = var4 + (var12Lifetime1 * var24 >> 8);
          var30 = (var18 * var11Lifetime1 >> 8) + var5;
          if (var18 != 0 &&
            var29 >= this.x256 - var3_int &&
            var29 <= var3_int + this.width256 + this.x256) {
            if (var24 != 0 &&
              -var3_int + this.y256 <= var30 &&
              var3_int + this.y256 + this.height256 >= var30) {
              if (var12Lifetime1 >= var11Lifetime1) {
                var10Lifetime1 = var11Lifetime1;
                var15Lifetime1 = var16Lifetime1;
                var14Lifetime1 = var5 + (var18 * var10Lifetime1 >> 8);
              } else {
                var15Lifetime1 = var17Lifetime1;
                var10Lifetime1 = var12Lifetime1;
                var13Lifetime1 = (var24 * var10Lifetime1 >> 8) + var4;
              }
            } else {
              var15Lifetime1 = var17Lifetime1;
              var10Lifetime1 = var12Lifetime1;
              var13Lifetime1 = var4 + (var10Lifetime1 * var24 >> 8);
            }
          } else {
            var10Lifetime1 = var11Lifetime1;
            var15Lifetime1 = var16Lifetime1;
            var14Lifetime1 = (var10Lifetime1 * var18 >> 8) + var5;
          }
          var31 = 0;
          var32 = 0;
          if (var15Lifetime1 == 8) {
            var31 = 256;
          }
          if (4 == var15Lifetime1) {
            var31 = -256;
          }
          if (1 == var15Lifetime1) {
            var32 = 256;
          }
          if (2 == var15Lifetime1) {
            var32 = -256;
          }
          var33 = -(var32 * var18 + var31 * var24) >> 8;
          if (var33 > 0) {
            return false;
          }
          if (var10Lifetime1 > ea.field_b) {
            return true;
          }
          UsernameAvailabilityResult.field_f = var13Lifetime1 - circle.radius256;
          ea.field_b = var10Lifetime1;
          SpriteGeometry.field_A = var31;
          DualLinkIterator.field_b = var32;
          GameClock.field_c = this;
          sh.field_a = var15Lifetime1;
          ScrollPane.field_Tb = -circle.radius256 + var14Lifetime1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("bn.F(");
          if (circle == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    RectangleBody(int x256, int y256, int velocityX256, int velocityY256, int width256, int height256, int typeId) {
        super(x256, y256, velocityX256, velocityY256, typeId);
        this.height256 = height256;
        this.width256 = width256;
    }

    final boolean overlapsCircle(CircleBody circle, boolean obfuscationGuard) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        int var17 = 0;
        long var9Lifetime1;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_long = (long)circle.radius256;
          var5 = (long)circle.x256;
          var7 = (long)circle.y256;
          var9 = (long)(-this.y256 - this.height256 / 2) + var7;
          if (var9 < 0L) {
            var9 = -var9;
          }
          if (var9 >= (long)(this.height256 / 2) + var3_long) {
            return false;
          }
          var9Lifetime1 = var5 + (long)(-this.x256 - this.width256 / 2);
          if (var9Lifetime1 < 0L) {
            var9Lifetime1 = -var9Lifetime1;
          }
          if (obfuscationGuard) {
            RectangleBody.c(111);
          }
          if (var3_long + (long)(this.width256 / 2) <= var9Lifetime1) {
            return false;
          }
          var11 = var5;
          var13 = var7;
          if (var5 < (long)this.x256) {
            var11 = (long)this.x256;
          } else {
            if (var5 > (long)(this.x256 + this.width256)) {
              var11 = (long)(this.x256 + this.width256);
            }
          }
          if (var7 >= (long)this.y256) {
            if (var7 > (long)(this.height256 + this.y256)) {
              var13 = (long)(this.y256 + this.height256);
            }
          } else {
            var13 = (long)this.y256;
          }
          var15 = (var11 - var5) * (var11 - var5) + (-var7 + var13) * (var13 - var7);
          if (var15 <= var3_long * var3_long) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("bn.C(");
          if (circle == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void onCircleContact(byte obfuscationGuard, PlayerBoard board, CircleBody circle) {
        try {
          if (obfuscationGuard != 53) {
            CircleBody var5 = (CircleBody) null;
            this.resolveCircleCollision((CircleBody) null, (byte) 44);
          }
          circle.x256 = UsernameAvailabilityResult.field_f;
          circle.y256 = ScrollPane.field_Tb;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bn.E(" + obfuscationGuard + ',' + (board != null ? "{...}" : "null") + ',' + (circle != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 62 / ((25 - param0) / 57);
        if (ej.field_I != null) {
          ej.field_I.m(17);
        }
        MusicPatch.field_o = new PlayerNameChooserPanel();
        rj.field_c.b((byte) 110, MusicPatch.field_o);
    }

    int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 79) {
            this.height256 = 1;
          }
          stackIn_3_0 = (33029 + this.height256 * 37 << 13) + (41 * this.width256 + 29813 << 2) ^ super.computeSyncChecksum(80, diagnostics);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bn.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        int var1 = 51 / ((-46 - param0) / 34);
        field_t = null;
    }

    static {
        field_t = "Offer rematch";
    }
}
