/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Widget extends WidgetNode {
    int screenY;
    int field_o;
    int field_v;
    boolean draggable;
    int field_B;
    Sprite field_tb;
    int field_P;
    boolean field_Q;
    int x;
    int field_db;
    int field_r;
    int field_t;
    int y;
    int field_fb;
    Sprite field_ob;
    boolean field_S;
    int field_D;
    int width;
    int height;
    private boolean field_W;
    Sprite[] field_nb;
    private int field_bb;
    boolean field_J;
    int field_X;
    Sprite[] field_gb;
    String text;
    int field_ib;
    Sprite[] field_A;
    Sprite field_q;
    private int field_sb;
    private int field_n;
    int field_w;
    static String field_V;
    boolean field_O;
    static String field_H;
    int field_E;
    private int field_ab;
    int field_I;
    Sprite[] field_mb;
    Sprite[] field_ub;
    Sprite field_cb;
    BitmapFont font;
    int field_U;
    int field_jb;
    boolean enabled;
    String field_s;
    private int field_p;
    int field_rb;
    static String field_kb;
    private int field_x;
    int field_C;
    boolean field_T;
    boolean field_pb;
    int field_Y;
    int field_qb;
    IntrusiveDeque children;
    int field_F;
    int screenX;
    private boolean inheritInteractionState;
    Sprite field_z;

    final void positionBelow(Widget param0, int param1, Widget param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = -5 % ((-59 - param3) / 34);
          if (param0 != null) {
            param2.field_db = param0.field_db + param0.field_E;
            param2.y = param1 + (param0.y + param0.height);
          } else {
            param2.field_db = 0;
            param2.y = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("llb.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        this.field_sb = 0;
        this.y = param3;
        this.field_E = 0;
        this.field_db = 0;
        this.field_x = 0;
        this.width = param2;
        this.height = param4;
        int var6 = -17 / ((param1 - 80) / 36);
        this.x = param0;
    }

    Widget(long param0, Widget param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void applyStyle(int param0, Widget param1) {
        boolean stackIn_88_1 = false;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 18445) {
            this.layoutVerticalChildren(25, 12, -107, false);
          }
          if (param1 != null) {
            if (null != param1.field_s) {
              this.field_s = param1.field_s;
            }
            if (param1.field_D != 0) {
              this.field_D = param1.field_D;
            }
            if (null != param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_I != 256) {
              this.field_I = param1.field_I;
            }
            if (param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.inheritInteractionState) {
              this.inheritInteractionState = param1.inheritInteractionState;
            }
            if (param1.field_T) {
              this.field_T = param1.field_T;
            }
            if (0 <= param1.field_qb) {
              this.field_qb = param1.field_qb;
            }
            if (param1.text != null) {
              this.text = param1.text;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (!param1.enabled) {
              this.enabled = param1.enabled;
            }
            if (param1.field_z != null) {
              this.field_z = param1.field_z;
            }
            if (param1.field_w != 0) {
              this.field_w = param1.field_w;
            }
            if (param1.field_nb != null) {
              this.field_nb = param1.field_nb;
            }
            if (param1.field_U >= 0) {
              this.field_U = param1.field_U;
            }
            if (param1.field_ib >= 0) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_S) {
              this.field_S = param1.field_S;
            }
            if (null != param1.field_ob) {
              this.field_ob = param1.field_ob;
            }
            if (null != param1.field_mb) {
              this.field_mb = param1.field_mb;
            }
            if (null != param1.field_q) {
              this.field_q = param1.field_q;
            }
            if (0 != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_jb >= 0) {
              this.field_jb = param1.field_jb;
            }
            if (null != param1.field_ub) {
              this.field_ub = param1.field_ub;
            }
            if (param1.field_gb != null) {
              this.field_gb = param1.field_gb;
            }
            if (null != param1.font) {
              this.font = param1.font;
            }
            if (null != param1.field_tb) {
              this.field_tb = param1.field_tb;
            }
            if (param1.field_X != -2147483648) {
              this.field_X = param1.field_X;
            }
            if (param1.field_B != 0) {
              this.field_B = param1.field_B;
            }
            if (param1.field_rb != -2147483648) {
              this.field_rb = param1.field_rb;
            }
            if (param1.draggable) {
              this.draggable = param1.draggable;
            }
            if (param1.field_P != -2147483648) {
              this.field_P = param1.field_P;
            }
            if (param1.field_F != 0) {
              this.field_F = param1.field_F;
            }
            this.field_W = param1.field_W;
            if (param1.field_t != 0) {
              this.field_t = param1.field_t;
            }
            stackIn_88_1 = (this.field_T) && (param1.field_pb);
            this.field_pb = stackIn_88_1;
            if (param1.field_fb != -2147483648) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_bb != -2147483648) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_v != 0) {
              this.field_v = param1.field_v;
            }
            if (-2147483648 == param1.field_p) {
              return;
            }
            this.field_p = param1.field_p;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("llb.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    final void draw(boolean param0, int param1) {
        int var3 = -119 % ((param1 + 29) / 40);
        this.drawTree(false, SoftwareRasterizer2D.height, false, SoftwareRasterizer2D.width, true, false, true, param0, false, 0, 0);
    }

    final void inheritInteractionStateInDescendants(int param0) {
        Widget var4 = null;
        int var3 = VoidHunters.field_G;
        if (param0 >= 104) {
          if (null != this.children) {
            var4 = (Widget) (this.children.last((byte) 121));
            while (var4 != null) {
              var4.inheritInteractionState = true;
              var4.inheritInteractionStateInDescendants(127);
              var4 = (Widget) (this.children.previous(-1155566844));
            }
          }
          return;
        }
    }

    Widget(String param0, Widget param1, int param2, int param3, int param4, int param5, String param6) {
        this(ComponentAttachmentPlan.a((CharSequence) ((Object) param0), true), param1, param2, param3, param4, param5, param6);
    }

    private final void updateInputTree(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_35_1 = false;
        boolean stackIn_40_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        Widget var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = VoidHunters.field_G;
        if (this.field_sb > 0) {
          var7 = -(-this.field_sb >> 2);
        } else {
          var7 = this.field_sb >> 2;
        }
        this.x = this.x + var7;
        this.field_sb = this.field_sb - var7;
        if (0 < this.field_db) {
          var7Lifetime1 = -(-this.field_db >> 2);
        } else {
          var7Lifetime1 = this.field_db >> 2;
        }
        this.field_db = this.field_db - var7Lifetime1;
        this.y = this.y + var7Lifetime1;
        if (this.field_x > 0) {
          var7Lifetime2 = -(-this.field_x >> 2);
        } else {
          var7Lifetime2 = this.field_x >> 2;
        }
        this.field_x = this.field_x - var7Lifetime2;
        this.width = this.width + var7Lifetime2;
        if (this.field_E > 0) {
          var7Lifetime3 = -(-this.field_E >> 2);
        } else {
          var7Lifetime3 = this.field_E >> 2;
        }
        this.screenX = param1 + this.x;
        if (!param0) {
          this.field_w = -107;
        }
        this.height = this.height + var7Lifetime3;
        this.screenY = param4 + this.y;
        this.field_E = this.field_E - var7Lifetime3;
        param3 = param3 & this.enabled;
        var8 = SoftwareRasterizer2D.clipLeft;
        var9 = SoftwareRasterizer2D.clipTop;
        var10 = SoftwareRasterizer2D.clipRight;
        var11 = SoftwareRasterizer2D.clipBottom;
        SoftwareRasterizer2D.intersectClip(this.screenX, this.screenY, this.width + this.screenX, this.height + this.screenY);
        var12 = 0;
        if (!GetThrusterBindingMoveAndTurnHasOppositeMove.field_o &&
          param3 &&
          SetDebrisPartitioned.field_o != 0 &&
          Particle.field_H >= SoftwareRasterizer2D.clipLeft &&
          Particle.field_H < SoftwareRasterizer2D.clipRight &&
          qs.field_a >= SoftwareRasterizer2D.clipTop &&
          SoftwareRasterizer2D.clipBottom > qs.field_a) {
          this.field_C = SetDebrisPartitioned.field_o;
          var12 = 1;
          this.field_r = Particle.field_H - this.screenX;
          this.field_n = -this.screenY + qs.field_a;
          this.field_o = SetDebrisPartitioned.field_o;
        } else {
          if (SetDebrisPartitioned.field_o != 0) {
            this.field_C = 0;
          }
          this.field_o = 0;
        }
        if (GpuVertexNormal.field_b == 0) {
          this.field_C = 0;
        }
        stackIn_35_1 = (!GetPlayerRepairAmount.field_p) && (PlayerGameData.field_b >= SoftwareRasterizer2D.clipLeft) && (PlayerGameData.field_b < SoftwareRasterizer2D.clipRight) && (SoftwareRasterizer2D.clipTop <= uia.field_b) && (SoftwareRasterizer2D.clipBottom > uia.field_b);
        this.field_Q = stackIn_35_1;
        stackIn_40_1 = (this.field_Q) && (this.field_C == GpuVertexNormal.field_b) && (param3);
        this.field_O = stackIn_40_1;
        if (this.children != null) {
          var13 = (Widget) (this.children.last((byte) 119));
          while (var13 != null) {
            var13.updateInputTree(true, this.screenX, this.height, param3, this.screenY, this.width);
            var13 = (Widget) (this.children.previous(-1155566844));
          }
        }
        if (this.field_Q) {
          GetPlayerRepairAmount.field_p = true;
        }
        if (var12 != 0) {
          GetThrusterBindingMoveAndTurnHasOppositeMove.field_o = true;
        }
        SoftwareRasterizer2D.setClip(var8, var9, var10, var11);
        if (this.field_C != 0 &&
          this.draggable) {
          this.y = -this.field_n + uia.field_b - param4;
          this.x = -param1 - this.field_r + PlayerGameData.field_b;
          if (this.x < 0) {
            this.x = 0;
          }
          if (this.x > -this.width + param5) {
            this.x = param5 - this.width;
          }
          if (this.y < 0) {
            this.y = 0;
          }
          if (this.y > -this.height + param2) {
            this.y = param2 - this.height;
          }
          this.screenX = this.x + param1;
          this.field_sb = 0;
          this.field_db = 0;
          this.screenY = param4 + this.y;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_kb = null;
        field_H = null;
        field_V = null;
        if (param0 != -2147483648) {
          Widget.clearSharedReferences(97);
        }
    }

    final void layoutVerticalChildren(int param0, int param1, int param2, boolean param3) {
        Widget var10_ref_llb = null;
        int var9 = 0;
        int var11 = VoidHunters.field_G;
        int var5 = -this.y;
        int var9Lifetime1;
        if (param1 > -69) {
          this.setBounds(50, -50, -75, 81, -93);
        }
        int var6 = var5 - this.field_db;
        int var7 = this.height;
        int var8 = this.field_E + var7;
        if (!param3) {
          var9 = 0;
          var10_ref_llb = (Widget) (this.children.first(0));
          while (var10_ref_llb != null) {
            var10_ref_llb.field_db = -var10_ref_llb.y + var9;
            var9 = var9 + (param0 + (var10_ref_llb.height + var10_ref_llb.field_E));
            var10_ref_llb = (Widget) (this.children.next((byte) 72));
          }
          var8 = -param0 + var9;
        }
        var9Lifetime1 = -param2 + var8;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (0 > var6) {
          var6 = 0;
        }
        int var10 = var7 - param2;
        if (var5 > var10) {
          var5 = var10;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        this.height = var7;
        this.field_E = -var7 + var8;
        this.y = -var5;
        this.field_db = -var6 + var5;
    }

    final int getContentWidth(int param0, byte param1) {
        Widget var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = VoidHunters.field_G;
        int var3 = 0;
        int var4_intLifetime1;
        if (null != this.text &&
          null != this.font) {
          var4_int = this.font.getParagraphWidth(this.text, param0);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (null != this.field_tb) {
          var4_intLifetime1 = this.field_tb.paddedWidth;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (param1 != 114) {
          Widget var7 = (Widget) null;
          this.addChild(-75, (Widget) null);
        }
        if (null != this.children) {
          var4 = (Widget) (this.children.first(param1 - 114));
          while (var4 != null) {
            var5 = var4.width + var4.x;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (Widget) (this.children.next((byte) 17));
          }
        }
        return var3;
    }

    final void addChild(int param0, Widget param1) {
        try {
          if (param0 != -561) {
            this.field_I = -90;
          }
          if (this.children == null) {
            this.children = new IntrusiveDeque();
          }
          this.children.addLast(-10258, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "llb.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Widget(long param0, Widget param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void setSelectedWidget(boolean param0, Widget param1) {
        IntrusiveDequeIterator var3 = null;
        Widget var4 = null;
        int var5 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          if (this.children != null) {
            var3 = new IntrusiveDequeIterator(this.children);
            var4 = (Widget) (var3.first(570));
            while (var4 != null) {
              var4.setSelectedWidget(param0, param1);
              var4 = (Widget) (var3.next(19072));
            }
          }
          stackIn_8_1 = (param1 == this);
          this.field_pb = stackIn_8_1;
          if (this.field_W) {
            this.field_J = this.field_pb;
          }
          if (param0) {
            this.field_r = -44;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("llb.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int getPreferredWidth(int param0) {
        if (param0 < 4) {
          this.field_x = -24;
        }
        return this.getContentWidth(2147483647, (byte) 114);
    }

    final void updateInput(boolean param0, int param1) {
        if (param1 == 1332) {
          GetThrusterBindingMoveAndTurnHasOppositeMove.field_o = !param0 ? true : false;
          GetPlayerRepairAmount.field_p = !param0 ? true : false;
          this.updateInputTree(true, 0, SoftwareRasterizer2D.height, true, 0, SoftwareRasterizer2D.width);
          return;
        }
    }

    private final void drawTree(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8, int param9, int param10) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        Sprite[] var16;
        Sprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        Widget var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = VoidHunters.field_G;
        this.screenY = param10 + this.y;
        this.screenX = this.x + param9;
        var12 = SoftwareRasterizer2D.clipLeft;
        var13 = SoftwareRasterizer2D.clipTop;
        var14 = SoftwareRasterizer2D.clipRight;
        var15 = SoftwareRasterizer2D.clipBottom;
        SoftwareRasterizer2D.intersectClip(this.screenX, this.screenY, this.screenX + this.width, this.height + this.screenY);
        if (!this.inheritInteractionState) {
          param0 = this.field_O;
          param2 = this.field_J;
          stackIn_5_0 = (this.field_C != 0);
          param5 = stackIn_5_0;
        }
        param6 = param6 & this.enabled;
        var16 = this.field_gb;
        if (!param4) {
          return;
        }
        var17 = this.field_tb;
        var18 = this.field_Y;
        var19 = 0;
        if (!param6) {
          if (null != this.field_z) {
            var17 = this.field_z;
          }
          if (null != this.field_ub) {
            var16 = this.field_ub;
          }
          if (0 <= this.field_jb) {
            var18 = this.field_jb;
          }
        }
        var20 = 0;
        if (param0) {
          if (this.field_cb != null) {
            var17 = this.field_cb;
          }
          if (this.field_qb >= 0) {
            var18 = this.field_qb;
          }
          if (-2147483648 != this.field_bb) {
            var20 = this.field_bb;
          }
          if (this.field_mb != null) {
            var16 = this.field_mb;
          }
          if (-2147483648 != this.field_p) {
            var19 = this.field_p;
          }
        }
        if (param5) {
          if (this.field_A != null) {
            var16 = this.field_A;
          }
          if (null != this.field_ob) {
            var17 = this.field_ob;
          }
          if (this.field_fb != -2147483648) {
            var19 = this.field_fb;
          }
          if (this.field_ib >= 0) {
            var18 = this.field_ib;
          }
          if (this.field_rb != -2147483648) {
            var20 = this.field_rb;
          }
        }
        if (param2) {
          if (this.field_X != -2147483648) {
            var19 = this.field_X;
          }
          if (this.field_U >= 0) {
            var18 = this.field_U;
          }
          if (-2147483648 != this.field_P) {
            var20 = this.field_P;
          }
          if (null != this.field_q) {
            var17 = this.field_q;
          }
          if (null != this.field_nb) {
            var16 = this.field_nb;
          }
        }
        var21 = var19 + this.field_t;
        var22 = this.field_v + var20;
        if (!this.field_S) {
          NanosecondClock.drawNineSlice(3, this.height, this.width, this.screenY, var16, this.screenX);
        } else {
          NanosecondClock.drawNineSlice(3, param1, param3, param10, var16, param9);
        }
        if (var17 != null) {
          var23_int = var21 + this.screenX;
          if (1 == this.field_F) {
            var23_int = var23_int + (this.width - var17.paddedWidth) / 2;
          }
          var24 = var22 + this.screenY;
          if (2 == this.field_F) {
            var23_int = var23_int + (-var17.paddedWidth + this.width);
          }
          if (this.field_B == 1) {
            var24 = var24 + (-var17.paddedHeight + this.height) / 2;
          }
          if (this.field_B == 2) {
            var24 = var24 + (-var17.paddedHeight + this.height);
          }
          if (256 > this.field_ab) {
            var17.drawAlpha(var23_int, var24, this.field_ab);
          } else {
            var17.draw(var23_int, var24);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.text &&
          null != this.font) {
          var26 = this.text;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param7 &&
            this.field_s != null) {
            var23Lifetime2 = var26 + this.field_s;
          }
          if (this.font.getStringWidth(var23Lifetime2) <= this.width - this.field_w * 2 &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_B != 1) {
              if (2 == this.field_B) {
                var22 = var22 + (-this.font.maxAscent + (this.height - this.font.maxDescent));
              }
            } else {
              var22 = var22 + (-this.font.maxDescent - this.font.maxAscent + this.height) / 2;
            }
            if (0 == this.field_F) {
              this.font.draw(var23Lifetime2, this.screenX + (this.field_w + var21), var22 + (this.screenY + this.font.maxAscent), var18, -1, this.field_I);
            } else {
              if (this.field_F == 1) {
                this.font.drawCentered(var23Lifetime2, var21 + this.field_w + (this.screenX + (-(this.field_w * 2) + this.width) / 2), this.screenY + (var22 + this.font.maxAscent), var18, -1, this.field_I);
              } else {
                if (2 != this.field_F) {
                  this.font.drawParagraph(var23Lifetime2, this.screenX - (-this.field_w - var21), this.screenY + var22, this.width - this.field_w * 2, this.height, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
                } else {
                  this.font.drawRightAligned(var23Lifetime2, this.width - (this.field_w * 2 - this.screenX - this.field_w - var21), this.font.maxAscent + this.screenY + var22, var18, -1, this.field_I);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.drawParagraph(var23Lifetime2, var21 + (this.screenX + this.field_w), var22 + this.screenY, this.width - 2 * this.field_w, this.height, var18, -1, this.field_I, this.field_F, this.field_B, this.field_D);
          }
        }
        if (null != this.children) {
          var23_ref = (Widget) (this.children.first(0));
          while (var23_ref != null) {
            var23_ref.drawTree(param0, this.height, param2, this.width, true, param5, param6, param7, this.field_pb, var19 + this.screenX, this.screenY + var20);
            var23_ref = (Widget) (this.children.next((byte) 109));
          }
        }
        SoftwareRasterizer2D.setClip(var12, var13, var14, var15);
        return;
    }

    public Widget() {
        this.field_W = false;
        this.enabled = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
    }

    Widget(long param0, Widget param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_W = false;
        this.enabled = true;
        this.field_U = -1;
        this.field_X = -2147483648;
        this.field_P = -2147483648;
        this.field_p = -2147483648;
        this.field_I = 256;
        this.field_fb = -2147483648;
        this.field_T = false;
        this.field_ab = 256;
        this.field_qb = -1;
        this.field_rb = -2147483648;
        this.field_jb = -1;
        this.field_ib = -1;
        this.field_pb = false;
        this.field_bb = -2147483648;
        try {
          this.height = param5;
          this.key = param0;
          this.y = param3;
          this.x = param2;
          this.width = param4;
          this.applyStyle(18445, param1);
          if (param6 != null) {
            this.text = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "llb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_V = "Quality";
        field_kb = "Toggle repair mode";
        field_H = "<%0> can no longer respawn";
    }
}
