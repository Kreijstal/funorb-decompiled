/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends bj {
    private OpacityWidget field_mb;
    private int field_cb;
    static int field_ob;
    private int field_fb;
    static UiComponent field_gb;
    static ResourceArchive field_jb;
    static String field_ib;
    private Widget field_eb;
    static QuickChatMenu field_kb;
    private int field_db;
    private int field_bb;
    static int field_pb;
    static String field_hb;
    private mi field_nb;
    private int field_lb;

    void b(byte param0, Widget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_eb = param1;
          if (MouseInput.field_e != this.field_nb) {
            if (this.field_nb != bh.field_qb) {
              this.field_nb = bh.field_qb;
              this.field_fb = 0;
            }
          } else {
            this.a((byte) -116, this.field_lb, this.field_db + (12 + this.field_eb.height), this.field_eb.width + 12);
            this.field_fb = 0;
          }
          if (param0 > 105) {
            return;
          }
          field_hb = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void j(int param0) {
        if (this.field_nb == null) {
          super.j(param0);
          return;
        }
        if (this.field_nb != NameEntryPopup.field_Xb) {
          this.a(true, this.field_db + 12 + this.field_eb.height, 12 + this.field_eb.width);
          this.a((byte) 56, this.field_eb);
        } else {
          this.field_nb = null;
          this.field_mb.opacity256 = 256;
          super.j(param0);
          return;
        }
        this.field_nb = null;
        this.field_mb.opacity256 = 256;
        super.j(param0);
    }

    boolean h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 0) {
          Widget var4 = (Widget) null;
          this.handleWidgetKey(-125, (byte) 123, (Widget) null, 'ﾈ');
          if (this.field_nb == null) {
            return super.h(0);
          }
          if (this.field_nb != bh.field_qb) {
            if (this.field_nb != NameEntryPopup.field_Xb) {
              return super.h(0);
            }
            fieldTemp$0 = this.field_fb + 1;
            this.field_fb = this.field_fb + 1;
            if (this.field_bb == fieldTemp$0) {
              this.field_nb = null;
              this.field_mb.opacity256 = 256;
              return super.h(0);
            }
            this.field_mb.opacity256 = (this.field_fb << 8) / this.field_bb;
            return super.h(0);
          }
          fieldTemp$1 = this.field_fb + 1;
          this.field_fb = this.field_fb + 1;
          if (fieldTemp$1 != this.field_cb) {
            this.field_mb.opacity256 = 256 - (this.field_fb << 8) / this.field_cb;
            return super.h(0);
          }
          this.field_nb = MouseInput.field_e;
          this.a((byte) -116, this.field_lb, this.field_eb.height + (this.field_db + 12), 12 + this.field_eb.width);
          this.field_mb.opacity256 = 0;
          this.field_fb = 0;
          return super.h(0);
        }
        if (this.field_nb == null) {
          return super.h(0);
        }
        if (this.field_nb != bh.field_qb) {
          if (this.field_nb != NameEntryPopup.field_Xb) {
            return super.h(0);
          }
          fieldTemp$2 = this.field_fb + 1;
          this.field_fb = this.field_fb + 1;
          if (this.field_bb == fieldTemp$2) {
            this.field_nb = null;
            this.field_mb.opacity256 = 256;
            return super.h(0);
          }
          this.field_mb.opacity256 = (this.field_fb << 8) / this.field_bb;
          return super.h(0);
        }
        int fieldTemp$3 = this.field_fb + 1;
        this.field_fb = this.field_fb + 1;
        if (fieldTemp$3 != this.field_cb) {
          this.field_mb.opacity256 = 256 - (this.field_fb << 8) / this.field_cb;
          return super.h(0);
        }
        this.field_nb = MouseInput.field_e;
        this.a((byte) -116, this.field_lb, this.field_eb.height + (this.field_db + 12), 12 + this.field_eb.width);
        this.field_mb.opacity256 = 0;
        this.field_fb = 0;
        return super.h(0);
    }

    private final void a(byte param0, Widget param1) {
        if (null != this.field_mb) {
          this.field_mb.unlink((byte) 111);
        }
        if (param1 == null) {
          this.field_mb = new OpacityWidget();
        } else {
          param1.setBounds(param1.height, 6, this.field_db + 6, (byte) -119, param1.width);
          this.field_mb = new OpacityWidget(param1);
        }
        this.addChild(this.field_mb, true);
        if (param0 != 56) {
          return;
        }
        try {
          this.field_eb = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fe.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        if (this.field_nb == bh.field_qb) {
          return;
        }
        this.field_fb = 0;
        this.field_nb = NameEntryPopup.field_Xb;
        this.a((byte) 56, this.field_eb);
        this.field_eb = null;
        this.field_mb.opacity256 = 0;
        if (param0 != -13717) {
          this.field_nb = (mi) null;
        }
    }

    boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (null == this.field_mb) {
            return false;
          }
          if (98 == keyCode) {
            this.field_mb.tryFocus(true, focusRoot);
          }
          if (keyCode == 99) {
            this.field_mb.tryFocus(true, focusRoot);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fe.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(character).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_ib = null;
        field_hb = null;
        field_jb = null;
        field_kb = null;
        if (param0 <= 78) {
          return;
        }
        field_gb = null;
    }

    fe(WidgetLayerStack param0, Widget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.width, 12 + param2 + param1.height);
        try {
          this.field_lb = param4;
          this.field_db = param2;
          this.field_bb = param3;
          this.field_cb = param3;
          this.a((byte) 56, param1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean updateOpacityAndCheckHidden(int obfuscationGuard) {
        if (obfuscationGuard < -22) {
          this.j(20);
          return super.updateOpacityAndCheckHidden(-119);
        }
        this.field_cb = -1;
        this.j(20);
        return super.updateOpacityAndCheckHidden(-119);
    }

    static {
        field_ib = "This game option is not available in rated games.";
        field_hb = "Private";
    }
}
