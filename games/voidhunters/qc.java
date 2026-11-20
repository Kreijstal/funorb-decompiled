/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc implements kd {
    private int field_e;
    String field_c;
    kw field_p;
    private Widget field_m;
    Widget field_o;
    BitmapFont field_n;
    ScrollPaneWidget field_h;
    private IntrusiveDeque field_i;
    static QuickChatDynamicCommand field_g;
    static Widget field_q;
    private String[] field_d;
    private int field_l;
    private boolean field_j;
    private ila field_k;
    private int field_f;
    private String field_a;
    private int field_b;

    private final Widget b(int param0, int param1, String param2) {
        Widget var4 = null;
        RuntimeException var4_ref = null;
        Widget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Widget((long)param1, (Widget) null, param2);
          var4.font = this.field_n;
          var4.field_Y = param0;
          var4.setBounds(5, param1 + 124, this.field_n.getStringWidth(var4.text), 0, this.field_e);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("qc.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        Widget var5 = null;
        int var6 = VoidHunters.field_G;
        try {
          this.field_h.content.addChild(-561, this.b(param1, 0, param2));
          if (!(param0 <= ~this.field_h.content.children.size(3))) {
            this.field_h.content.children.removeFirst(true);
          }
          var4_int = 5;
          var5 = (Widget) (this.field_h.content.children.first(0));
          while (var5 != null) {
            var5.y = var4_int;
            var4_int = var4_int + this.field_e;
            var5 = (Widget) (this.field_h.content.children.next((byte) 30));
          }
          this.field_h.content.height = var4_int;
          this.field_h.content.y = -var4_int + this.field_h.height;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qc.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 13462) {
          this.b((byte) -120);
        }
        return this.field_j;
    }

    final void a(byte param0, String param1) {
        try {
          this.a(param1, false, 13421772);
          if (param0 < 65) {
            String var4 = (String) null;
            this.a((byte) -84, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qc.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final IntrusiveDeque a(int param0, byte param1, String param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        IntrusiveDeque stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveDeque var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          var5 = -120 / ((-80 - param1) / 41);
          var4 = new IntrusiveDeque();
          while (param2 != null) {
            boolean decompiledFrameRemainder0 = true;
            var6 = this.field_n.getStringWidth(param2);
            var7 = param2;
            if (param0 < var6) {
              var8 = -1 + param2.length();
              while (var8 > 0) {
                if (var6 > param0 ||
                  param2.charAt(var8) != 32) {
                  incrementValue$0 = var8;
                  var8--;
                  var6 = var6 - this.field_n.getCharacterAdvance(param2.charAt(incrementValue$0));
                  continue;
                }
                break;
              }
              if (var8 == 0) {
                var6 = this.field_n.getStringWidth(param2);
                var8 = param2.length() - 1;
                while (param0 < var6) {
                  incrementValue$1 = var8;
                  var8--;
                  var6 = var6 - this.field_n.getCharacterAdvance(param2.charAt(incrementValue$1));
                }
              }
              var7 = param2.substring(0, var8);
              param2 = param2.substring(var8 + 1);
              decompiledFrameRemainder0 = false;
            }
            else {
              param2 = null;
            }
            var4.addLast(-10258, new ila(var7));
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("qc.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_q = null;
        if (param0 < 16) {
          return;
        }
        field_g = null;
    }

    abstract String[] d(int param0);

    private final void a(String param0, int param1) {
        ila var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (ila) (this.field_i.first(0));
          var4 = -50 / ((74 - param1) / 41);
          if (var3 == null ||
            !param0.equals(var3.field_d)) {
            this.field_i.addFirst(new ila(param0), (byte) -55);
          }
          if (this.field_i.size(3) > 30) {
            this.field_i.removeLast((byte) -115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qc.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(byte param0) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 59 / ((param0 - 44) / 43);
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.field_m.y + this.field_m.height > 0) {
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_m.screenX, this.field_m.screenY, this.field_h.x, this.field_m.height, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_h.width + this.field_h.screenX, this.field_m.screenY, this.field_h.x, this.field_m.height, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_h.screenX, this.field_m.screenY, this.field_h.width, this.field_h.y, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_h.screenX, this.field_h.height + this.field_h.screenY, this.field_h.width, -this.field_h.height + this.field_p.screenY - this.field_h.screenY, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_h.screenX, this.field_p.height + this.field_p.screenY, this.field_h.width, -this.field_p.height + (this.field_m.height - this.field_p.y), 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_h.screenX, this.field_h.screenY, this.field_h.width, this.field_h.height, 2236962, 240);
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_p.screenX, this.field_p.screenY, this.field_p.width, this.field_p.height, 2236962, 240);
          var3 = this.field_m.y + 256;
          if (0 > var3) {
            var3 = 0;
          }
          SoftwareRasterizer2D.fillRectangleAlpha(this.field_m.screenX, this.field_m.height + this.field_m.screenY, this.field_m.width, -this.field_m.height + SetPointDefenceLaserReload.field_p - this.field_m.screenY, 0, var3 >> 1);
          var4 = 5 + (this.field_m.height + this.field_m.y);
          for (var5 = 0; 6 > var5; var5++) {
            SoftwareRasterizer2D.drawHorizontalLineAlpha(0, var4, GetDebrisSurvives.field_p, 0, var5 << 5);
            var4--;
          }
          this.field_m.draw((8 & this.field_b) == 0 ? true : false, 111);
        }
        if (this.field_d != null &&
          this.field_j) {
          var3Lifetime1 = this.field_m.height + this.field_m.y;
          this.field_o.y = var3Lifetime1;
          this.field_o.draw(false, 43);
          var3Lifetime1 = var3Lifetime1 + (this.field_e + 5);
          for (var4Lifetime1 = 0; this.field_d.length > var4Lifetime1; var4Lifetime1++) {
            this.field_n.draw(this.field_d[var4Lifetime1], this.field_o.screenX + 10, var3Lifetime1, 13421772, -1);
            var3Lifetime1 = var3Lifetime1 + this.field_e;
          }
        }
    }

    private final Widget a(byte param0, int param1, int param2) {
        if (param0 > -57) {
          this.field_d = (String[]) null;
        }
        Widget var4 = new Widget(0L, (Widget) null);
        var4.field_gb = SetBurstFireReload.a(-26998, param1, param2);
        return var4;
    }

    abstract boolean a(int param0, String param1);

    abstract void a(int param0);

    final static ResourceArchive b(int param0) {
        if (param0 != 0) {
          field_q = (Widget) null;
        }
        return SetBoostersCooldown.a((byte) 52, qw.field_e.field_a);
    }

    private final Widget a(int param0, int param1) {
        if (param0 != 4) {
          return (Widget) null;
        }
        Widget var3 = new Widget(0L, (Widget) null);
        var3.field_gb = GetBurstFireRegenerationRate.a(true, param1);
        return var3;
    }

    final void a(boolean param0, byte param1) {
        int var4 = 0;
        int var3;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (param1 <= 73) {
          return;
        }
        if (this.field_j &&
          0 < this.field_f) {
          this.field_f = this.field_f - 1;
          this.field_m.y = this.field_f * -200 * this.field_f / 225;
        } else {
          if (!this.field_j &&
            0 < 200 + this.field_m.y) {
            this.field_m.y = this.field_m.y - 28;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_p.l(-14453).equals(this.field_a)) {
          decompiledFrameRemainder0 = (this.field_p.j(0) != this.field_l);
          if (decompiledFrameRemainder0) {
            this.field_a = this.field_p.l(-14453);
            this.field_l = this.field_p.j(0);
            this.field_d = this.d(-85);
            if (this.field_d != null &&
              this.field_d.length == 0) {
              this.field_d = null;
            }
          }
        } else {
          this.field_a = this.field_p.l(-14453);
          this.field_l = this.field_p.j(0);
          this.field_d = this.d(-85);
          if (this.field_d != null &&
            this.field_d.length == 0) {
            this.field_d = null;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (this.field_d != null)) {
          var3 = 0;
          for (var4 = 0; this.field_d.length > var4; var4++) {
            var5 = this.field_n.getStringWidth(this.field_d[var4]);
            if (var3 < var5) {
              var3 = var5;
            }
          }
          this.field_o.width = 20 + var3;
          this.field_o.height = 15 + this.field_e * this.field_d.length;
        }
        this.field_b = this.field_b + 1;
        this.field_m.updateInput(param0, 1332);
        this.field_h.updateScrolling(2 * (this.field_e * GetPointDefenceLaserPulsetime.field_o), true, this.field_e, 0);
        this.field_p.f((byte) -6);
    }

    private final void a(String param0, boolean param1, int param2) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        IntrusiveDeque var9 = null;
        ila var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = VoidHunters.field_G;
        try {
          var4_int = this.field_h.width - 25;
          var5 = SetFighterBayAimspeed.a((byte) -67, '\n', param0);
          var6 = var5;
          if (param1) {
            return;
          }
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            if (var4_int <= this.field_n.getStringWidth(var8)) {
              var9 = this.a(var4_int, (byte) -128, var8);
              var10 = (ila) (var9.first(0));
              while (var10 != null) {
                this.a(-257, param2, var10.field_d);
                var10 = (ila) (var9.next((byte) 26));
              }
            } else {
              this.a(-257, param2, var8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qc.T(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final Widget a(int param0, byte param1) {
        int var3 = -103 / ((param1 + 68) / 35);
        Widget var4 = new Widget();
        var4.field_gb = SetBurstFireReload.a(-26998, 0, param0);
        return var4;
    }

    private final void a(boolean param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = !(this.field_j);
        this.field_j = stackIn_3_1;
        if (this.field_j) {
          this.field_f = 15;
          if (null != this.field_m) {
            this.field_m.setSelectedWidget(false, this.field_p);
          }
        } else {
          if (null != this.field_m) {
            this.field_m.setSelectedWidget(false, (Widget) null);
          }
        }
        if (!param0) {
          field_g = (QuickChatDynamicCommand) null;
        }
    }

    boolean a(int param0, char param1, int param2) {
        Widget discarded$0 = null;
        IntrusiveNode stackIn_18_1 = null;
        Widget var5;
        int var6;
        String var7;
        var6 = VoidHunters.field_G;
        if (param2 != -40) {
          discarded$0 = this.a(77, (byte) 52);
        }
        if (96 == param1) {
          this.a(true);
          return true;
        }
        if (!this.field_j) {
          return false;
        }
        if (param0 != 84) {
          if (param0 != 98) {
            if (99 != param0) {
              if (param0 != 80) {
                this.field_p.a(param0, -1, param1);
              } else {
                this.a(-35);
              }
            } else {
              if (null != this.field_k &&
                this.field_i.sentinel != this.field_k.previous) {
                this.field_k = (ila) (this.field_k.previous);
                this.field_p.a(this.field_k.field_d, -114);
              }
            }
          } else {
            if (this.field_k == null ||
              this.field_i.sentinel != this.field_k.next) {
              if (null != this.field_k) {
                stackIn_18_1 = this.field_k.next;
              } else {
                stackIn_18_1 = this.field_i.first(param2 + 40);
              }
              this.field_k = (ila) (stackIn_18_1);
              if (null != this.field_k) {
                this.field_p.a(this.field_k.field_d, -121);
              }
            }
          }
        } else {
          var7 = this.field_p.l(-14453);
          if (var7.length() <= 0) {
            return true;
          }
          this.a(this.field_c + var7, false, 5635925);
          var5 = (Widget) (this.field_h.content.children.last((byte) 127));
          if (!this.a(-10278, var7)) {
            var5.field_Y = 16733525;
          }
          this.field_p.a(true);
          this.a(var7, param2 ^ 122);
          this.field_k = null;
        }
        return true;
    }

    final void a(Object param0, int param1) {
        if (param1 >= -16) {
          return;
        }
        try {
          this.a((byte) 115, param0 != null ? param0.toString() : "null");
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qc(BitmapFont param0, eab param1) {
        int var3_int = 0;
        Widget var4 = null;
        Widget var5 = null;
        Widget var6 = null;
        Widget var7 = null;
        Widget var8 = null;
        Widget var9 = null;
        Widget var10 = null;
        Widget var11 = null;
        Widget var12 = null;
        ScrollBarWidget var13 = null;
        Widget var14 = null;
        Widget var15 = null;
        this.field_c = "# ";
        this.field_i = new IntrusiveDeque();
        this.field_d = null;
        this.field_f = 0;
        this.field_j = false;
        this.field_b = 0;
        try {
          this.field_n = param0;
          this.field_e = this.field_n.maxAscent + this.field_n.maxDescent;
          var3_int = this.field_e + 4;
          var4 = this.a(65793, (byte) 79);
          var5 = var4;
          var6 = var4;
          var7 = var4;
          var8 = this.a((byte) -59, 7829367, 2236962);
          var9 = this.a((byte) -91, 65793, 65793);
          var10 = this.a((byte) -63, 3355443, 65793);
          var11 = this.a(4, 2263074);
          var12 = this.a((byte) -105, 2236962, 65793);
          this.field_m = new Widget(0L, var5);
          this.field_m.setBounds(0, 16, GetDebrisSurvives.field_p, -200, 200);
          var13 = new ScrollBarWidget(0L, var8, var8, var9, var10);
          var14 = new Widget();
          var14.children = new IntrusiveDeque();
          this.field_h = new ScrollPaneWidget(0L, var14, var6, var13);
          this.field_h.content.children = new IntrusiveDeque();
          this.field_h.setBoundsAndLayout(this.field_m.width - 10, 0, -1, -var3_int + 185, 5, 5, 15);
          this.field_m.addChild(-561, this.field_h);
          var15 = new Widget();
          var15.field_Y = 13421772;
          var15.field_t = 5;
          var15.font = this.field_n;
          var15.field_v = 2;
          this.field_p = new kw(0L, var7, var11, var15);
          this.field_p.a(this.field_h.width, this.field_h.x, var3_int, this.field_h.height + (this.field_h.y + 5), true);
          this.field_p.a(-20640, param1);
          this.field_m.addChild(-561, this.field_p);
          this.field_o = new Widget(0L, var12);
          this.field_o.x = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new QuickChatDynamicCommand(15, 0, 1, 0);
    }
}
