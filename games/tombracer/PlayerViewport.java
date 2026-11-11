/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerViewport {
    private boolean field_q;
    private int left;
    private int targetRight;
    static boolean field_o;
    private int field_e;
    private int targetTop;
    private boolean snapNextUpdate;
    private RoomViewRenderer field_n;
    private int targetLeft;
    private int top;
    static int field_b;
    private int moveDivisor;
    private int bottom;
    private dta field_d;
    private int right;
    private int targetBottom;
    private MatchScreen field_a;

    final boolean c(int param0) {
        if (param0 != 1727002282) {
          return true;
        }
        return this.field_q;
    }

    final static int a(boolean param0, ConsoleToken[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          while (true) {
            if (param1.length - 1 <= var3_int) {
              if (!param0) {
                field_b = -62;
              }
              stackIn_12_0 = param1.length - 1;
              return stackIn_12_0;
            }
            if (param1[var3_int + 1].field_h <= param2 - 1) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("qa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int approach(int param0, int param1, int param2) {
        int var6 = 0;
        if (param2 == param0) {
          return param0;
        }
        int var4 = -param2 + param0;
        int var5 = S2CNextRoundPacket.abs(var4, 14);
        if (var4 > param1) {
          var6 = 1;
        } else {
          var6 = -1;
        }
        if (this.moveDivisor <= var5) {
          return var4 / this.moveDivisor + param2;
        }
        return var6 + param2;
    }

    final void scrollBy(int param0, byte param1, int param2) {
        if (param1 >= 26) {
          this.targetLeft = this.targetLeft + param2;
          this.targetRight = this.targetRight + param2;
          this.targetBottom = this.targetBottom + param0;
          this.targetTop = this.targetTop + param0;
          this.moveDivisor = 16;
          return;
        }
        this.update((byte) -94);
        this.targetLeft = this.targetLeft + param2;
        this.targetRight = this.targetRight + param2;
        this.targetBottom = this.targetBottom + param0;
        this.targetTop = this.targetTop + param0;
        this.moveDivisor = 16;
    }

    final void b(int param0) {
        if (!this.isOnScreen(0)) {
          return;
        }
        this.field_n.render(this.field_e, this.left, this.right, this.top, this.bottom, this.field_a, 51);
        if (param0 != 23479) {
          ConsoleToken[] var3 = (ConsoleToken[]) null;
          PlayerViewport.a(true, (ConsoleToken[]) null, 44);
          if (this.field_a.f((byte) 33)) {
            return;
          }
          if (this.field_a.field_A) {
            return;
          }
          this.field_d.a(this.left, this.right, this.field_e, -88, this.field_a, this.top, this.bottom);
          if (this.field_a.field_D) {
            TextInputWidget.a(0, bm.field_f, (byte) -72, this.left, tga.field_a, this.right - this.left, 1, -this.top + this.bottom, this.top, -16777216 | wga.field_a[this.field_e]);
            return;
          }
          return;
        }
        if (this.field_a.f((byte) 33)) {
          return;
        }
        if (this.field_a.field_A) {
          return;
        }
        this.field_d.a(this.left, this.right, this.field_e, -88, this.field_a, this.top, this.bottom);
        if (!this.field_a.field_D) {
          return;
        }
        TextInputWidget.a(0, bm.field_f, (byte) -72, this.left, tga.field_a, this.right - this.left, 1, -this.top + this.bottom, this.top, -16777216 | wga.field_a[this.field_e]);
    }

    final void applyLayout(int param0, wm param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != -20186) {
            return;
          }
          var4_int = aaa.a(false) - SwitchLinkList.b(0) / 2;
          var5 = SwitchLinkList.b(0) / 2;
          if (mf.field_d == param1) {
            this.setEdges(0, 0, 8, aaa.a(false), SwitchLinkList.b(0));
            return;
          }
          if (param1 == OpenGlEnvironmentWaterEffect.field_j) {
            this.setEdges(0, 0, param2 + 20194, var4_int, SwitchLinkList.b(param2 ^ -20186));
            return;
          }
          if (ByteStorage.field_e == param1) {
            this.setEdges(var4_int, 0, 8, aaa.a(false), var5 << 1);
            return;
          }
          if (param1 != mma.field_c) {
            return;
          }
          this.setEdges(var4_int, param0 * var5, 8, aaa.a(false), (param0 + 1) * var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean intersectsArea(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 59) {
          this.targetLeft = -31;
          if (param0 < this.left) {
            return false;
          }
          if (param2 < this.top) {
            return false;
          }
          if (param3 > this.right) {
            return false;
          }
          if (this.bottom >= param4) {
            return true;
          }
          return false;
        }
        if (param0 < this.left) {
          return false;
        }
        if (param2 < this.top) {
          return false;
        }
        if (param3 > this.right) {
          return false;
        }
        if (this.bottom >= param4) {
          return true;
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        this.field_q = param1 ? true : false;
        if (param0 > 26) {
          return;
        }
        this.left = -104;
    }

    final void update(byte param0) {
        if (this.snapNextUpdate) {
          this.snapNextUpdate = false;
          this.left = this.targetLeft;
          this.bottom = this.targetBottom;
          this.right = this.targetRight;
          this.top = this.targetTop;
          return;
        }
        this.left = this.approach(this.targetLeft, 0, this.left);
        this.top = this.approach(this.targetTop, 0, this.top);
        this.right = this.approach(this.targetRight, 0, this.right);
        this.bottom = this.approach(this.targetBottom, 0, this.bottom);
        this.field_n.a(-8);
        if (param0 >= 77) {
          this.field_d.a((byte) -21);
          return;
        }
    }

    private final boolean isOnScreen(int param0) {
        if (param0 == 0) {
          return this.intersectsArea(aaa.a(false), (byte) 59, SwitchLinkList.b(param0 ^ 0), 0, 0);
        }
        this.targetTop = 126;
        return this.intersectsArea(aaa.a(false), (byte) 59, SwitchLinkList.b(param0 ^ 0), 0, 0);
    }

    private final void setEdges(int param0, int param1, int param2, int param3, int param4) {
        this.targetTop = param1;
        this.top = param1;
        this.targetLeft = param0;
        this.targetBottom = param4;
        this.targetRight = param3;
        this.moveDivisor = param2;
        this.left = param0;
        this.right = param3;
        this.bottom = param4;
    }

    final void a(byte param0, int param1) {
        int var3 = 81 % ((-76 - param0) / 39);
        this.field_n.a(0, param1);
    }

    final static void drawTiledFrame(int param0, int param1, byte param2, int param3, ToolkitSprite[] param4, int param5) {
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        ToolkitSprite[] var11 = null;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = aq.field_a[0].width();
          param1 = (var6_int / 2 + param1) / var6_int * var6_int;
          var7 = aq.field_a[0].height();
          param4[0].a(param3, param5);
          param0 = (param0 + var7 / 2) / var7 * var7;
          param4[2].a(-var6_int + param1 + param3, param5);
          param4[6].a(param3, -var7 + param0 + param5);
          param4[8].a(-var6_int + (param3 + param1), param5 + param0 - var7);
          for (var8 = var6_int + param3; param3 - (-param1 + var6_int * 2) >= var8; var8 = var8 + var6_int) {
            param4[1].a(var8, param5);
            param4[7].a(var8, param0 + (param5 - var7));
          }
          for (var8Lifetime1 = param5 + var7; var8Lifetime1 <= -(var7 * 2) + param0 + param5; var8Lifetime1 = var8Lifetime1 + var7) {
            param4[3].a(param3, var8Lifetime1);
            param4[5].a(param1 + (param3 - var6_int), var8Lifetime1);
          }
          for (var8Lifetime2 = var6_int + param3; var8Lifetime2 <= param1 + param3 - 2 * var6_int; var8Lifetime2 = var8Lifetime2 + var6_int) {
            for (var9 = param5 + var7; param5 + (param0 - var7 * 2) >= var9; var9 = var9 + var7) {
              param4[4].a(var8Lifetime2, var9);
            }
          }
          if (param2 > 64) {
            return;
          }
          var11 = (ToolkitSprite[]) null;
          PlayerViewport.drawTiledFrame(110, 85, (byte) -45, -18, (ToolkitSprite[]) null, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("qa.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(')').toString());
        }
    }

    PlayerViewport(MatchScreen param0, int param1) {
        this.snapNextUpdate = true;
        this.moveDivisor = 8;
        try {
          this.field_a = param0;
          this.field_e = param1;
          this.field_n = new RoomViewRenderer();
          this.field_d = new dta();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = 1727002282;
    }
}
