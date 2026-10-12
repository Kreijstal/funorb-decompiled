/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pt extends sf {
    private int field_Z;
    static String[] field_W;
    static ClientUiComponent field_X;
    private int field_ib;
    private int field_hb;
    private bh field_cb;
    private tv field_bb;
    static h field_db;
    private int field_ab;
    private Widget field_jb;
    private int field_fb;
    static uv field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
          field_db = (h) null;
          InstructionsPanel.field_B = param0;
          QuickChatPhrase.field_C = param1;
          return;
        }
        InstructionsPanel.field_B = param0;
        QuickChatPhrase.field_C = param1;
    }

    final void m(int param0) {
        if (this.field_bb == TeleportAction.field_v) {
          return;
        }
        this.field_bb = ki.field_e;
        int var2 = 113 % ((param0 - 69) / 50);
        this.field_hb = 0;
        this.b(72, this.field_jb);
        this.field_jb = null;
        this.field_cb.field_K = 0;
    }

    boolean a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.field_bb) {
          if (param0 == -1) {
            return super.a((byte) -1);
          }
          this.k(117);
          return super.a((byte) -1);
        }
        if (TeleportAction.field_v == this.field_bb) {
          fieldTemp$2 = this.field_hb + 1;
          this.field_hb = this.field_hb + 1;
          if (this.field_ib != fieldTemp$2) {
            this.field_cb.field_K = 256 - (this.field_hb << 8) / this.field_ib;
          } else {
            this.field_bb = ContextualRuntimeException.field_c;
            this.a(this.field_Z, false, this.field_jb.height + 12 + this.field_ab, this.field_jb.width + 12);
            this.field_hb = 0;
            this.field_cb.field_K = 0;
          }
          if (param0 == -1) {
            return super.a((byte) -1);
          }
          this.k(117);
          return super.a((byte) -1);
        }
        if (ki.field_e != this.field_bb) {
          if (param0 == -1) {
            return super.a((byte) -1);
          }
          this.k(117);
          return super.a((byte) -1);
        }
        fieldTemp$3 = this.field_hb + 1;
        this.field_hb = this.field_hb + 1;
        if (this.field_fb != fieldTemp$3) {
          this.field_cb.field_K = (this.field_hb << 8) / this.field_fb;
        } else {
          this.field_bb = null;
          this.field_cb.field_K = 256;
        }
        if (param0 == -1) {
          return super.a((byte) -1);
        }
        this.k(117);
        return super.a((byte) -1);
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
          return;
        }
        field_X = null;
    }

    final void l(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_bb == null) {
          super.l(81);
          var2 = 71 % ((param0 + 25) / 57);
          return;
        }
        if (ki.field_e != this.field_bb) {
          this.a(this.field_jb.width + 12, (byte) 98, 12 + (this.field_ab + this.field_jb.height));
          this.b(107, this.field_jb);
        } else {
          this.field_bb = null;
          this.field_cb.field_K = 256;
          super.l(81);
          var2Lifetime1 = 71 % ((param0 + 25) / 57);
          return;
        }
        this.field_bb = null;
        this.field_cb.field_K = 256;
        super.l(81);
        var2Lifetime2 = 71 % ((param0 + 25) / 57);
    }

    void a(Widget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 116 % ((-27 - param1) / 44);
          this.field_jb = param0;
          if (this.field_bb == ContextualRuntimeException.field_c) {
            this.a(this.field_Z, false, this.field_jb.height + (12 + this.field_ab), 12 + this.field_jb.width);
            this.field_hb = 0;
            return;
          }
          if (this.field_bb == TeleportAction.field_v) {
            return;
          }
          this.field_bb = TeleportAction.field_v;
          this.field_hb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pt.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(Widget param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.field_cb) {
            return false;
          }
          if (98 == param1) {
            this.field_cb.a(param3 ^ -12222, param0);
          }
          if (param1 == 99) {
            this.field_cb.a(11, param0);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("pt.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean k(int param0) {
        int var2 = 115 / ((param0 + 1) / 44);
        this.l(121);
        return super.k(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param2.getGraphics();
            if (param1 != 12) {
              field_Y = (String) null;
            }
            so.field_b.a(255, var4, param0, param3);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("pt.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0, Widget param1) {
        try {
          if (this.field_cb != null) {
            this.field_cb.unlink(92);
          }
          if (param1 != null) {
            param1.setBounds(6, param1.width, 6 + this.field_ab, 8192, param1.height);
            this.field_cb = new bh(param1);
          } else {
            this.field_cb = new bh();
          }
          int var3_int = 29 % ((param0 - 24) / 42);
          this.a((byte) 10, (Widget) (this.field_cb));
          this.field_jb = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pt.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pt(gk param0, Widget param1, int param2, int param3, int param4) {
        super(param0, param1.width + 12, 12 + param2 + param1.height);
        try {
          this.field_Z = param4;
          this.field_ab = param2;
          this.field_fb = param3;
          this.field_ib = param3;
          this.b(-36, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
