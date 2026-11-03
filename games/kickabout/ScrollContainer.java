/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollContainer extends UiLayoutNode {
    private ScrollBar field_Kb;
    UiLayoutNode field_Gb;
    UiLayoutNode field_Db;
    ScrollBar field_Eb;
    static IntrusiveDeque field_Ab;
    static String field_yb;
    static String field_Hb;
    static String field_Lb;
    static int field_zb;
    static String field_Jb;
    static String field_Cb;
    static String field_Bb;
    static int field_Ib;
    static ArgbSprite[][] field_Fb;

    final void setLayout(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        this.field_mb = param4;
        this.field_q = param5;
        int var8 = 78 / ((param3 + 62) / 37);
        this.field_J = param6;
        this.field_s = param1;
        this.layoutScrollbars(param0, param2, 0);
    }

    ScrollContainer(String param0, UiLayoutNode param1, UiLayoutNode param2, ScrollBar param3) {
        this(vb.a(0, (CharSequence) ((Object) param0)), param1, param2, param3);
    }

    final void advanceScroll(int param0, boolean param1, byte param2, int param3) {
        this.applyScrollInput(param1, param0, param3, this.field_Gb.field_mb, -71, this.field_Gb.field_q);
        if (param2 > -76) {
          field_Ib = 29;
        }
    }

    final void layoutScrollbars(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        var6 = Kickabout.field_G;
        this.field_Db.field_s = param2;
        this.field_Gb.field_q = this.field_q;
        this.field_Db.field_J = 0;
        this.field_Gb.field_mb = this.field_mb;
        this.field_Eb.c((byte) -109);
        this.field_Kb.c((byte) -109);
        stackIn_3_0 = (this.field_Gb.field_q >= this.field_Db.field_q) ? 0 : 1;
        var4 = stackIn_3_0;
        stackIn_6_0 = (this.field_Gb.field_mb >= this.field_Db.field_mb) ? 0 : 1;
        var5 = stackIn_6_0;
        if (var4 != 0 &&
          var5 != 0) {
          this.addChild((byte) -113, (UiLayoutNode) (this.field_Kb));
          this.addChild((byte) -125, (UiLayoutNode) (this.field_Eb));
          this.field_Gb.field_mb = this.field_Gb.field_mb - (param0 + param1);
          this.field_Gb.field_q = this.field_Gb.field_q - (param1 + param0);
          this.field_Kb.setBounds(true, -param0 + this.field_q, 0, this.field_mb - param0, param0);
          this.field_Kb.layoutThumb(-this.field_Db.field_s, this.field_Db.field_q, param2 + 112, this.field_Gb.field_q);
          this.field_Eb.setBounds(true, param0, this.field_q - param0, 0, this.field_mb - param0);
          this.field_Eb.layoutThumb(-this.field_Db.field_J, this.field_Db.field_mb, 20, this.field_Gb.field_mb);
        } else {
          if (var4 == 0) {
            if (var5 != 0) {
              this.addChild((byte) -124, (UiLayoutNode) (this.field_Eb));
              this.field_Gb.field_q = this.field_Gb.field_q - (param1 + param0);
              this.field_Eb.setBounds(true, param0, this.field_q - param0, 0, this.field_mb);
              this.field_Eb.layoutThumb(-this.field_Db.field_J, this.field_Db.field_mb, 65, this.field_Gb.field_mb);
            }
          } else {
            this.addChild((byte) -120, (UiLayoutNode) (this.field_Kb));
            this.field_Gb.field_mb = this.field_Gb.field_mb - (param0 + param1);
            this.field_Kb.setBounds(true, this.field_q, 0, -param0 + this.field_mb, param0);
            this.field_Kb.layoutThumb(-this.field_Db.field_s, this.field_Db.field_q, 77, this.field_Gb.field_q);
          }
        }
    }

    final static void h(byte param0) {
        MouseInputHandler.field_c = null;
        lt.field_a = null;
        SquadPickerDialog.field_O = (byte[][]) null;
        IsaacRandom.field_f = null;
        fc.field_g = null;
        PasswordValidator.field_j = null;
        if (param0 >= -69) {
          ScrollContainer.i((byte) 118);
        }
    }

    private final void applyScrollInput(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8;
        var8 = Kickabout.field_G;
        if (this.field_Eb.pollScrollBackward(-74)) {
          this.field_Db.field_v = this.field_Db.field_v + param2;
        }
        if (this.field_Eb.pollScrollForward(0)) {
          this.field_Db.field_v = this.field_Db.field_v - param2;
        }
        if (this.field_Eb.pollPageBackward(true)) {
          this.field_Db.field_v = this.field_Db.field_v + param5;
        }
        if (this.field_Eb.pollPageForward(-59)) {
          this.field_Db.field_v = this.field_Db.field_v - param5;
        }
        if (this.field_Kb.pollScrollBackward(-52)) {
          this.field_Db.field_fb = this.field_Db.field_fb + param2;
        }
        if (this.field_Kb.pollScrollForward(0)) {
          this.field_Db.field_fb = this.field_Db.field_fb - param2;
        }
        if (param4 >= -61) {
          this.layoutScrollbars(84, -119, -123);
        }
        if (this.field_Kb.pollPageBackward(true)) {
          this.field_Db.field_fb = this.field_Db.field_fb + param3;
        }
        if (this.field_Kb.pollPageForward(-74)) {
          this.field_Db.field_fb = this.field_Db.field_fb - param3;
        }
        if (this.field_gb) {
          if (this.field_Db.field_mb >= this.field_Gb.field_mb) {
            this.field_Db.field_v = this.field_Db.field_v - param1;
          } else {
            this.field_Db.field_fb = this.field_Db.field_fb - param1;
          }
        }
        if (param0) {
          if (-(this.field_Db.field_v + this.field_Db.field_J) < 0) {
            this.field_Db.field_v = -this.field_Db.field_J;
          }
          if (-(this.field_Db.field_fb + this.field_Db.field_s) < 0) {
            this.field_Db.field_fb = -this.field_Db.field_s;
          }
          if (this.field_Db.field_mb + this.field_Db.field_L - this.field_Gb.field_mb < -(this.field_Db.field_J + this.field_Db.field_v)) {
            this.field_Db.field_v = -this.field_Db.field_J - (-this.field_Gb.field_mb + this.field_Db.field_mb + this.field_Db.field_L);
          }
          if (-this.field_Gb.field_q + (this.field_Db.field_G + this.field_Db.field_q) < -(this.field_Db.field_fb + this.field_Db.field_s)) {
            this.field_Db.field_fb = -(this.field_Db.field_q - (-this.field_Db.field_G + this.field_Gb.field_q)) - this.field_Db.field_s;
          }
        } else {
          if (-(this.field_Db.field_v + this.field_Db.field_J) > this.field_Db.field_L + (this.field_Db.field_mb - this.field_Gb.field_mb)) {
            this.field_Db.field_v = -(-this.field_Gb.field_mb + this.field_Db.field_L + this.field_Db.field_mb) - this.field_Db.field_J;
          }
          if (-(this.field_Db.field_v + this.field_Db.field_J) < 0) {
            this.field_Db.field_v = -this.field_Db.field_J;
          }
          if (-(this.field_Db.field_fb + this.field_Db.field_s) > -this.field_Gb.field_q + this.field_Db.field_q + this.field_Db.field_G) {
            this.field_Db.field_fb = -(this.field_Db.field_G + (this.field_Db.field_q - this.field_Gb.field_q)) - this.field_Db.field_s;
          }
          if (-(this.field_Db.field_fb + this.field_Db.field_s) < 0) {
            this.field_Db.field_fb = -this.field_Db.field_s;
          }
        }
        if (this.field_Eb.isThumbHeld(0)) {
          this.field_Db.field_J = -this.field_Eb.getDraggedOffsetVertical(this.field_Db.field_mb, param0, (byte) -95, this.field_Gb.field_mb);
          this.field_Db.field_v = 0;
        }
        if (this.field_Kb.isThumbHeld(0)) {
          this.field_Db.field_s = -this.field_Kb.getDraggedOffsetHorizontal(this.field_Db.field_q, 0, param0, this.field_Gb.field_q);
          this.field_Db.field_fb = 0;
        }
        this.field_Eb.layoutThumb(-this.field_Db.field_J, this.field_Db.field_mb, 126, this.field_Gb.field_mb);
        this.field_Kb.layoutThumb(-this.field_Db.field_s, this.field_Db.field_q, 54, this.field_Gb.field_q);
    }

    ScrollContainer(long param0, UiLayoutNode param1, UiLayoutNode param2, ScrollBar param3) {
        super(param0, (UiLayoutNode) null);
        try {
          this.field_Gb = new UiLayoutNode(0L, param2);
          this.field_Eb = new ScrollBar(0L, param3, true);
          this.field_Kb = new ScrollBar(0L, param3, false);
          this.addChild((byte) -126, this.field_Gb);
          this.addChild((byte) -115, (UiLayoutNode) (this.field_Eb));
          this.addChild((byte) -128, (UiLayoutNode) (this.field_Kb));
          this.field_Db = param1;
          this.field_Gb.addChild((byte) -117, param1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ScrollContainer(long param0, UiLayoutNode param1, UiLayoutNode param2, ScrollBar param3, ScrollBar param4) {
        super(param0, (UiLayoutNode) null);
        try {
          this.field_Gb = new UiLayoutNode(0L, param2);
          this.field_Eb = new ScrollBar(0L, param3, true);
          this.field_Kb = new ScrollBar(0L, param4, false);
          this.addChild((byte) -115, this.field_Gb);
          this.addChild((byte) -105, (UiLayoutNode) (this.field_Eb));
          this.addChild((byte) -117, (UiLayoutNode) (this.field_Kb));
          this.field_Db = param1;
          this.field_Gb.addChild((byte) -110, param1);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(byte param0) {
        field_Jb = null;
        field_Bb = null;
        field_Hb = null;
        field_Ab = null;
        field_Cb = null;
        field_Fb = (ArgbSprite[][]) null;
        field_yb = null;
        field_Lb = null;
        if (param0 != -69) {
          field_Ab = (IntrusiveDeque) null;
        }
    }

    static {
        field_Ab = new IntrusiveDeque();
        field_Jb = "Members";
        field_Cb = "Please check if address is correct";
        field_Lb = "You have <%0> unread messages!";
        field_Hb = "Security";
        field_Bb = "View Leagues";
    }
}
