/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends um {
    static RgbSprite[] jungleCentreSprites;
    static tq field_v;
    private be field_B;
    private be[] field_y;
    static String field_x;
    static RgbSprite field_w;
    static int field_z;

    final void a(boolean param0, int param1, RgbSprite[] param2) {
        int var4_int = 0;
        if (!param0) {
          return;
        }
        try {
          var4_int = param1;
          if (null == this.field_y[var4_int]) {
            this.field_y[var4_int] = new be();
          }
          this.field_y[param1].field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "up.FA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, up param1, boolean param2) {
        int var4_int = 0;
        be dupTemp$0 = null;
        be stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        be stackIn_14_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        be var5 = null;
        be var6 = null;
        int var7 = 0;
        RgbSprite var8 = null;
        be var6Lifetime1;
        be var6Lifetime2;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          super.a(-35, param1);
          if (!param0) {
            var8 = (RgbSprite) null;
            this.a(54, (RgbSprite) null);
          }
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_y[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param1.field_y[var4_int];
                stackIn_10_0 = var5;
                stackIn_11_1 = !(param0);
                if (var6Lifetime2 != null) {
                  stackIn_14_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new be();
                  param1.field_y[var4_int] = dupTemp$0;
                  stackIn_14_2 = dupTemp$0;
                }
                ((be) (Object) stackIn_10_0).a(stackIn_11_1, stackIn_14_2);
              } else {
                param1.field_y[var4_int] = null;
              }
            }
            return;
          }
          ArrayOperations.copy(this.field_y, 0, param1.field_y, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("up.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(RgbSprite[] param0, boolean param1) {
        int var4 = 0;
        be[] var3 = null;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1) {
            field_x = (String) null;
          }
          var7 = this.field_y;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_f = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("up.GA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        oc stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        be var7 = null;
        be var9 = null;
        d var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        try {
          if (param1 != -20618) {
            up.b(62);
          }
          if (!(param3 instanceof d)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (oc) (param3);
          }
          var10 = (d) (stackIn_5_0);
          MovingBody.a((byte) 106, param3.field_t + param3.field_o + param2, param2 + param3.field_o, param4 + param3.field_w, param4 + param3.field_w + param3.field_s);
          if (var10 != null) {
            param0 = param0 & var10.field_J;
          }
          var7 = this.field_y[0];
          this.field_B.a(-2147483648);
          var7.a(this.field_B, 2147483647, this, param3, param2, param4);
          if (var10 != null) {
            if (var10.field_F) {
              var11 = this.field_y[1];
              if (var11 != null) {
                var11.a(this.field_B, 2147483647, this, param3, param2, param4);
              }
            }
            if (var10.field_q) {
              var12 = this.field_y[3];
              if (var10.field_n != 0 &&
                var12 != null) {
                var12.a(this.field_B, 2147483647, this, param3, param2, param4);
              } else {
                var9 = this.field_y[2];
                if (var9 != null) {
                  var9.a(this.field_B, 2147483647, this, param3, param2, param4);
                }
              }
            }
          }
          if (param3.f(-76)) {
            var13 = this.field_y[5];
            if (var13 != null) {
              var13.a(this.field_B, 2147483647, this, param3, param2, param4);
            }
          }
          if (!param0) {
            var14 = this.field_y[4];
            if (var14 != null) {
              var14.a(this.field_B, 2147483647, this, param3, param2, param4);
            }
          }
          this.field_B.a(param4, this, param3, (byte) -109, param2);
          sc.popRaster(param1 ^ 20704);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("up.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    up(up param0, boolean param1) {
        this();
        try {
          param0.a(true, this, param1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 != 3) {
          up.b(20);
        }
        field_x = null;
        field_v = null;
        jungleCentreSprites = null;
    }

    final be b(int param0, int param1) {
        if (param1 <= 102) {
          return (be) null;
        }
        be dupTemp$0 = new be();
        this.field_y[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public up() {
        this.field_y = new be[6];
        this.field_B = new be();
        be dupTemp$0 = new be();
        this.field_y[0] = dupTemp$0;
        be var1 = dupTemp$0;
        var1.a(-2147483648);
    }

    final void a(int param0, RgbSprite param1) {
        int var4 = 0;
        be[] var3 = null;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != -1553) {
            field_v = (tq) null;
          }
          var7 = this.field_y;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("up.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_x = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_v = new tq();
    }
}
