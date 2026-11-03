/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuList extends MenuComponent implements gj {
    static Sprite[] field_w;
    static AnimatedPanel field_v;
    static String field_A;
    static String field_u;
    int field_y;
    private int field_x;
    static String field_z;

    final void unlinkChildren(int param0) {
        super.unlinkChildren(param0 + param0);
        this.field_x = 0;
        this.field_y = 0;
    }

    public final void a(int param0, int param1) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_x == param1) {
          return;
        }
        int var3 = -this.field_i + this.field_y;
        int var4 = var3 * param1 / 65536;
        int var5 = var3 * this.field_x / 65536;
        MenuComponent var6 = (MenuComponent) (this.field_l.startForward(0));
        while (var6 != null) {
          var6.translate(-var4 + var5, 0, 0);
          var6 = (MenuComponent) (this.field_l.nextForward((byte) -71));
        }
        if (param0 != 13280) {
          field_A = (String) null;
        } else {
          this.field_x = param1;
          return;
        }
        this.field_x = param1;
    }

    public static void clearStatics(int param0) {
        field_v = null;
        field_A = null;
        field_w = null;
        field_u = null;
        field_z = null;
        if (param0 != 1546006977) {
          field_v = (AnimatedPanel) null;
        }
    }

    MenuList(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_y = 0;
        this.field_x = 0;
    }

    final void addChild(MenuComponent param0, int param1) {
        try {
          super.addChild(param0, param1);
          if (param0 instanceof MenuList) {
            this.field_y = this.field_y + param0.field_i;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "lp.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, sq param1) {
        int var9 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        lm[] var8 = null;
        lm var10 = null;
        int var11 = 0;
        PacketBuffer var12 = null;
        sq var13 = null;
        String var6Lifetime1;
        int var7Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (is.field_b) {
            return;
          }
          PanelNode.field_q = param1;
          if (param1 == null) {
            SliderPainter.field_b = DerelictMapGenerator.field_q;
            jb.field_d = TargetedChatMessage.field_j + ArchiveRequest.field_r >> 1;
            MenuButton.field_B = TargetedChatMessage.field_j + ArchiveRequest.field_r >> 1;
            oi.field_a = be.field_h;
            var13 = (sq) null;
            qj.a((sq) null, -1);
            return;
          }
          sj.a(-31560);
          var2_int = param1.field_t;
          var3 = param1.field_b;
          var4 = param1.field_j;
          var5 = param1.field_q;
          if (param0 != 1546006977) {
            var12 = (PacketBuffer) null;
            MenuList.writeFleetMove((FleetMove) null, (byte) -74, (PacketBuffer) null);
          }
          if (param1.field_q == -1) {
            var6 = uq.field_m.a(5607, param1.field_c);
            var7 = wk.a(-9615, var6, rs.field_Cb, new int[]{-6 + var4 - 20});
            var5 = 34 + (rs.field_Cb.field_q + var7 * 13);
            eh.field_L = new Sprite[var7];
            if (param1.field_f != null) {
              var8 = param1.field_f;
              for (var9 = 0; var8.length > var9; var9++) {
                var10 = var8[var9];
                var6Lifetime1 = uq.field_m.a(5607, var10.field_b);
                var7Lifetime1 = wk.a(-9615, var6Lifetime1, rs.field_Cb, new int[]{-20 + (-6 + var4)});
                var5 = var5 + (13 * var7Lifetime1 + rs.field_Cb.field_q);
              }
            }
          }
          if ((1 & param1.field_n) == 0) {
            var2_int = var2_int + 3;
          } else {
            var2_int = 637 - var2_int;
          }
          if ((param1.field_n & 2) != 0) {
            var3 = 477 - var3;
          } else {
            var3 = 55 + var3;
          }
          if ((2 & param1.field_n) != 0) {
            var3 = var3 - var5;
          }
          if ((param1.field_n & 1) != 0) {
            var2_int = var2_int - var4;
          }
          jb.field_d = var4 + var2_int;
          SliderPainter.field_b = var3 + var5;
          oi.field_a = var3;
          MenuButton.field_B = var2_int;
          qj.a(param1, param0 ^ -1546006978);
          if (param1.field_c.indexOf("<%tabresizehint>") != -1) {
            uq.field_m.a("", 27275, "tabresizehint");
          }
          if (WeightedLruCache.field_g != null) {
            return;
          }
          DerelictMapGenerator.field_q = SliderPainter.field_b;
          be.field_h = oi.field_a;
          TargetedChatMessage.field_j = jb.field_d + MenuButton.field_B >> 1;
          ArchiveRequest.field_r = jb.field_d + MenuButton.field_B >> 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("lp.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void writeFleetMove(FleetMove param0, byte param1, PacketBuffer param2) {
        try {
          di.writeStar(param0.field_y, false, param2);
          di.writeStar(param0.field_B, false, param2);
          param2.writeShort(param0.field_z, 255);
          if (param1 > -67) {
            field_A = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "lp.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final MenuComponent findComponentAt(byte param0, int param1, int param2) {
        MenuComponent var4 = null;
        MenuComponent var4Lifetime1;
        if (param0 <= 51) {
          field_u = (String) null;
          if (!this.field_s) {
            return null;
          }
          if (!this.containsPoint(param1, param2, 0)) {
            return null;
          }
          var4 = FleetVisual.a(this.field_l, param1, (byte) 117, param2);
          if (var4 == null) {
            return super.findComponentAt((byte) 127, param1, param2);
          }
          return var4;
        }
        if (!this.field_s) {
          return null;
        }
        if (!this.containsPoint(param1, param2, 0)) {
          return null;
        }
        var4Lifetime1 = FleetVisual.a(this.field_l, param1, (byte) 117, param2);
        if (var4Lifetime1 == null) {
          return super.findComponentAt((byte) 127, param1, param2);
        }
        return var4Lifetime1;
    }

    final void a(int param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 64 / ((param0 - 67) / 47);
        if (!this.field_s) {
          return;
        }
        int[] var3 = new int[4];
        SoftwareRasterizer.saveClip(var3);
        SoftwareRasterizer.intersectClip(this.field_k, this.field_t, this.field_m + this.field_k, this.field_t + this.field_i);
        MenuComponent var4 = (MenuComponent) (this.field_l.startReverse(3725));
        while (var4 != null) {
          var4.a(116);
          var4 = (MenuComponent) (this.field_l.nextReverse(-124));
        }
        SoftwareRasterizer.restoreClip(var3);
    }

    static {
        field_z = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_u = "Start Game";
        field_A = "You have been defeated";
    }
}
