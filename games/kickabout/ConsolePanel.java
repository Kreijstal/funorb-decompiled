/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ConsolePanel implements OverlayLayer {
    private IntrusiveDeque field_m;
    TextFieldNode field_k;
    static UiLayoutNode field_q;
    BitmapFont field_d;
    private UiLayoutNode field_l;
    UiLayoutNode field_j;
    private int field_f;
    ScrollPane field_g;
    String field_a;
    static IntrusiveDeque field_i;
    private String[] field_c;
    private boolean field_h;
    private int field_b;
    private int field_n;
    private TextLine field_o;
    private String field_p;
    private int field_e;

    private final void a(int param0, String param1, byte param2) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        IntrusiveDeque var9 = null;
        TextLine var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Kickabout.field_G;
        try {
          var4_int = -15 + (-10 + this.field_g.field_q);
          if (param2 != -122) {
            ConsolePanel.d((byte) 97);
          }
          var5 = FormationAgent.a(param1, 2, '\n');
          var6 = var5;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            if (this.field_d.a(var8) >= var4_int) {
              var9 = this.b(0, var8, var4_int);
              var10 = (TextLine) (var9.g(24009));
              while (var10 != null) {
                this.a(31779, param0, var10.text);
                var10 = (TextLine) (var9.c(33));
              }
            } else {
              this.a(31779, param0, var8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("be.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public void a(int param0) {
        int var6 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.field_l.field_mb + this.field_l.field_J > 0) {
          SoftwareRasterizer.a(this.field_l.field_F, this.field_l.field_T, this.field_g.field_s, this.field_l.field_mb, 5592405, 230);
          SoftwareRasterizer.a(this.field_g.field_F + this.field_g.field_q, this.field_l.field_T, this.field_g.field_s, this.field_l.field_mb, 5592405, 230);
          SoftwareRasterizer.a(this.field_g.field_F, this.field_l.field_T, this.field_g.field_q, this.field_g.field_J, 5592405, 230);
          SoftwareRasterizer.a(this.field_g.field_F, this.field_g.field_mb + this.field_g.field_T, this.field_g.field_q, -this.field_g.field_mb - this.field_g.field_T + this.field_k.field_T, 5592405, 230);
          SoftwareRasterizer.a(this.field_g.field_F, this.field_k.field_mb + this.field_k.field_T, this.field_g.field_q, -this.field_k.field_mb + (this.field_l.field_mb - this.field_k.field_J), 5592405, 230);
          SoftwareRasterizer.a(this.field_g.field_F, this.field_g.field_T, this.field_g.field_q, this.field_g.field_mb, 2236962, 240);
          SoftwareRasterizer.a(this.field_k.field_F, this.field_k.field_T, this.field_k.field_q, this.field_k.field_mb, 2236962, 240);
          var2 = 256 + this.field_l.field_J;
          if (var2 < 0) {
            var2 = 0;
          }
          SoftwareRasterizer.a(this.field_l.field_F, this.field_l.field_T + this.field_l.field_mb, this.field_l.field_q, -this.field_l.field_mb + ReceivedAuctionItem.field_B - this.field_l.field_T, 0, var2 >> 1);
          var3 = 5 + (this.field_l.field_mb + this.field_l.field_J);
          for (var4 = 0; 6 > var4; var4++) {
            SoftwareRasterizer.c(0, var3, f.field_d, 0, var4 << 5);
            var3--;
          }
          this.field_l.a(127, 0 == (this.field_n & 8) ? true : false);
        }
        var2Lifetime1 = 20 / ((50 - param0) / 45);
        if (null != this.field_c &&
          this.field_h) {
          var3Lifetime1 = this.field_l.field_J + this.field_l.field_mb;
          this.field_j.field_J = var3Lifetime1;
          this.field_j.a(78, false);
          var3Lifetime1 = var3Lifetime1 + (5 + this.field_f);
          var6 = 0;
          var4Lifetime1 = var6;
          while (this.field_c.length > var6) {
            this.field_d.a(this.field_c[var6], 10 + this.field_j.field_F, var3Lifetime1, 13421772, -1);
            var3Lifetime1 = var3Lifetime1 + this.field_f;
            var6++;
          }
        }
    }

    private final IntrusiveDeque b(int param0, String param1, int param2) {
        UiLayoutNode discarded$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        IntrusiveDeque stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveDeque var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = Kickabout.field_G;
        try {
          if (param0 != 0) {
            var9 = (String) null;
            discarded$0 = this.a(92, (String) null, -8);
          }
          var4 = new IntrusiveDeque();
          while (param1 != null) {
            boolean decompiledFrameRemainder0 = true;
            var5 = this.field_d.a(param1);
            var6 = param1;
            if (var5 > param2) {
              var7 = param1.length() - 1;
              while (0 < var7) {
                if (param2 < var5 ||
                  param1.charAt(var7) != 32) {
                  incrementValue$1 = var7;
                  var7--;
                  var5 = var5 - this.field_d.charWidth(param1.charAt(incrementValue$1));
                  continue;
                }
                break;
              }
              if (var7 == 0) {
                var5 = this.field_d.a(param1);
                var7 = -1 + param1.length();
                while (param2 < var5) {
                  incrementValue$2 = var7;
                  var7--;
                  var5 = var5 - this.field_d.charWidth(param1.charAt(incrementValue$2));
                }
              }
              var6 = param1.substring(0, var7);
              param1 = param1.substring(var7 + 1);
              decompiledFrameRemainder0 = false;
            }
            else {
              param1 = null;
            }
            var4.a(new TextLine(var6), param0 ^ 3);
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("be.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract boolean a(String param0, boolean param1);

    private final UiLayoutNode a(int param0, int param1) {
        if (param0 != 4) {
          return (UiLayoutNode) null;
        }
        UiLayoutNode var3 = new UiLayoutNode(0L, (UiLayoutNode) null);
        var3.field_R = ShopPlayerSlot.a((byte) 26, param1);
        return var3;
    }

    abstract String[] b(byte param0);

    private final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        UiLayoutNode var5 = null;
        int var6 = Kickabout.field_G;
        try {
          this.field_g.field_Ab.addChild((byte) -109, this.a(param1, param2, -73));
          if (!(256 >= this.field_g.field_Ab.field_jb.a(false))) {
            this.field_g.field_Ab.field_jb.b((byte) 125);
          }
          var4_int = 5;
          var5 = (UiLayoutNode) (this.field_g.field_Ab.field_jb.g(24009));
          while (var5 != null) {
            var5.field_J = var4_int;
            var4_int = var4_int + this.field_f;
            var5 = (UiLayoutNode) (this.field_g.field_Ab.field_jb.c(param0 - 31746));
          }
          if (param0 != 31779) {
            this.field_p = (String) null;
          }
          this.field_g.field_Ab.field_mb = var4_int;
          this.field_g.field_Ab.field_J = -var4_int + this.field_g.field_mb;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "be.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0) {
        UiLayoutNode discarded$0 = null;
        if (param0 < 63) {
          discarded$0 = this.a(40, -60, 5);
        }
        return this.field_h;
    }

    public boolean a(int param0, int param1, char param2) {
        IntrusiveNode stackIn_26_1 = null;
        UiLayoutNode var5;
        int var6;
        String var7;
        var6 = Kickabout.field_G;
        if (param0 != 11516) {
          return true;
        }
        if (param2 == 96) {
          this.c((byte) -23);
          return true;
        }
        if (!this.field_h) {
          return false;
        }
        if (param1 != 84) {
          if (param1 == 98) {
            if (this.field_o == null ||
              this.field_m.field_c != this.field_o.field_d) {
              if (null == this.field_o) {
                stackIn_26_1 = this.field_m.g(param0 ^ 28981);
              } else {
                stackIn_26_1 = this.field_o.field_d;
              }
              this.field_o = (TextLine) (stackIn_26_1);
              if (this.field_o != null) {
                this.field_k.setText(this.field_o.text, param0 ^ -30330);
              }
            }
          } else {
            if (param1 != 99) {
              if (param1 != 80) {
                this.field_k.handleKey(param1, param2, param0 ^ 12183);
              } else {
                this.b(72);
              }
            } else {
              if (this.field_o != null &&
                this.field_m.field_c != this.field_o.field_b) {
                this.field_o = (TextLine) (this.field_o.field_b);
                this.field_k.setText(this.field_o.text, -23174);
              }
            }
          }
        } else {
          var7 = this.field_k.getText((byte) -16);
          if (var7.length() <= 0) {
            return true;
          }
          this.a(5635925, this.field_a + var7, (byte) -122);
          var5 = (UiLayoutNode) (this.field_g.field_Ab.field_jb.last(param0 ^ -4021));
          if (!this.a(var7, true)) {
            var5.field_y = 16733525;
          }
          this.field_k.clear(param0 ^ -26138);
          this.a(var7, 30);
          this.field_o = null;
        }
        return true;
    }

    private final void a(String param0, int param1) {
        TextLine var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (TextLine) (this.field_m.g(24009));
          if (var3 == null ||
            !param0.equals(var3.text)) {
            this.field_m.a(0, new TextLine(param0));
          }
          if (this.field_m.a(false) > param1) {
            this.field_m.h(-124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("be.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final UiLayoutNode a(int param0, String param1, int param2) {
        UiLayoutNode var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        UiLayoutNode stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new UiLayoutNode(0L, (UiLayoutNode) null, param1);
          var4.field_X = this.field_d;
          var4.field_y = param0;
          var4.a(true, this.field_d.a(var4.field_E), 5, 0, this.field_f);
          if (param2 > 0) {
            var5 = (String) null;
            this.a((String) null, (byte) -100);
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("be.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(String param0, byte param1) {
        try {
          this.a(13421772, param0, (byte) -122);
          if (param1 != 94) {
            this.field_e = 33;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "be.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final UiLayoutNode b(int param0, int param1) {
        UiLayoutNode var3 = new UiLayoutNode();
        var3.field_R = ih.a(param0, param1 ^ param1, 0);
        return var3;
    }

    private final UiLayoutNode a(int param0, int param1, int param2) {
        if (param1 != 200) {
          this.field_o = (TextLine) null;
        }
        UiLayoutNode var4 = new UiLayoutNode(0L, (UiLayoutNode) null);
        var4.field_R = ih.a(param0, param1 - 200, param2);
        return var4;
    }

    abstract void b(int param0);

    public static void d(byte param0) {
        field_i = null;
        if (param0 >= -9) {
          return;
        }
        field_q = null;
    }

    final void a(int param0, Object param1) {
        try {
          if (param0 > -49) {
            this.field_b = -72;
          }
          this.a(param1 == null ? "null" : param1.toString(), (byte) 94);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "be.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(byte param0) {
        int var1;
        int var2;
        boolean stackIn_10_0 = false;
        var1 = bk.a(2);
        var2 = qi.a(false);
        if (param0 < 45) {
          field_q = (UiLayoutNode) null;
        }
        stackIn_10_0 = ((var1 == 9 &&
          !(var2 < 28)) ||
          (var1 == 10 &&
          !(var2 > 11)));
        return stackIn_10_0;
    }

    private final void c(byte param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = !(this.field_h);
        this.field_h = stackIn_3_1;
        if (this.field_h) {
          this.field_e = 15;
          if (this.field_l != null) {
            this.field_l.setFocusedNode(-95, this.field_k);
          }
        } else {
          if (null != this.field_l) {
            this.field_l.setFocusedNode(param0 ^ -100, (UiLayoutNode) null);
          }
        }
        if (param0 != -23) {
          this.field_a = (String) null;
        }
    }

    public final void a(int param0, boolean param1) {
        int var4 = 0;
        int var3;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        if (param0 != -25) {
          this.field_p = (String) null;
        }
        if (this.field_h &&
          0 < this.field_e) {
          this.field_e = this.field_e - 1;
          this.field_l.field_J = this.field_e * -200 * this.field_e / 225;
        } else {
          if (!this.field_h &&
            200 + this.field_l.field_J > 0) {
            this.field_l.field_J = this.field_l.field_J - 28;
          }
        }
        if (!this.field_k.getText((byte) -16).equals(this.field_p) ||
          this.field_k.getCaretPosition(-1) != this.field_b) {
          this.field_p = this.field_k.getText((byte) -16);
          this.field_b = this.field_k.getCaretPosition(-1);
          this.field_c = this.b((byte) -86);
          if (null != this.field_c &&
            0 == this.field_c.length) {
            this.field_c = null;
          }
          if (null != this.field_c) {
            var3 = 0;
            for (var4 = 0; var4 < this.field_c.length; var4++) {
              var5 = this.field_d.a(this.field_c[var4]);
              if (var3 < var5) {
                var3 = var5;
              }
            }
            this.field_j.field_q = var3 + 20;
            this.field_j.field_mb = this.field_c.length * this.field_f + 15;
          }
        }
        this.field_n = this.field_n + 1;
        this.field_l.b(0, param1);
        this.field_g.a(this.field_f, StatefulTextPainter.field_v * (this.field_f * 2), true, 0);
        this.field_k.updatePointer(11570);
    }

    ConsolePanel(BitmapFont param0, PlatformTaskDispatcher param1) {
        int var3_int = 0;
        UiLayoutNode var4 = null;
        UiLayoutNode var5 = null;
        UiLayoutNode var6 = null;
        UiLayoutNode var7 = null;
        UiLayoutNode var8 = null;
        UiLayoutNode var9 = null;
        UiLayoutNode var10 = null;
        UiLayoutNode var11 = null;
        UiLayoutNode var12 = null;
        VerticalScrollbar var13 = null;
        UiLayoutNode var14 = null;
        UiLayoutNode var15 = null;
        this.field_a = "# ";
        this.field_m = new IntrusiveDeque();
        this.field_h = false;
        this.field_n = 0;
        this.field_c = null;
        this.field_e = 0;
        try {
          this.field_d = param0;
          this.field_f = this.field_d.field_G + this.field_d.field_p;
          var3_int = this.field_f + 4;
          var4 = this.b(65793, 186);
          var5 = var4;
          var6 = var4;
          var7 = var4;
          var8 = this.a(2236962, 200, 7829367);
          var9 = this.a(65793, 200, 65793);
          var10 = this.a(65793, 200, 3355443);
          var11 = this.a(4, 2263074);
          var12 = this.a(65793, 200, 2236962);
          this.field_l = new UiLayoutNode(0L, var5);
          this.field_l.a(true, f.field_d, 0, -200, 200);
          var13 = new VerticalScrollbar(0L, var8, var8, var9, var10);
          var14 = new UiLayoutNode();
          var14.field_jb = new IntrusiveDeque();
          this.field_g = new ScrollPane(0L, var14, var6, var13);
          this.field_g.field_Ab.field_jb = new IntrusiveDeque();
          this.field_g.a(0, 94, -var3_int + 185, 5, 5, -10 + this.field_l.field_q, 15);
          this.field_l.addChild((byte) -118, (UiLayoutNode) (this.field_g));
          var15 = new UiLayoutNode();
          var15.field_y = 13421772;
          var15.field_D = 5;
          var15.field_B = 2;
          var15.field_X = this.field_d;
          this.field_k = new TextFieldNode(0L, var7, var11, var15);
          this.field_k.a(-630, this.field_g.field_s, 5 + (this.field_g.field_J + this.field_g.field_mb), var3_int, this.field_g.field_q);
          this.field_k.setPlatformDispatcher(param1, -17421);
          this.field_l.addChild((byte) -119, (UiLayoutNode) (this.field_k));
          this.field_j = new UiLayoutNode(0L, var12);
          this.field_j.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
