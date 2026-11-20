/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    private int field_gb;
    private int field_Z;
    private ge field_db;
    private int field_fb;
    private UiWidget field_X;
    private int field_cb;
    static QuickChatDynamicCommand field_ib;
    static Sprite field_ab;
    static int field_bb;
    private int field_Y;
    private OpacityWidget field_eb;
    static String field_hb;

    final void b(boolean param0) {
        if (null == this.field_db) {
          super.b(param0);
          return;
        }
        if (this.field_db != CurvedRoadSegment.field_G) {
          this.b(537342017, this.field_X.width + 12, 12 - (-this.field_Z - this.field_X.height));
          this.d(this.field_X, -100);
        } else {
          this.field_db = null;
          this.field_eb.opacity = 256;
          super.b(param0);
          return;
        }
        this.field_db = null;
        this.field_eb.opacity = 256;
        super.b(param0);
    }

    boolean g(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 == 39) {
          if (null == this.field_db) {
            return super.g((byte) 39);
          }
          if (this.field_db == dg.field_a) {
            fieldTemp$0 = this.field_gb + 1;
            this.field_gb = this.field_gb + 1;
            if (this.field_fb == fieldTemp$0) {
              this.field_db = DialogLayer.field_M;
              this.b(117, 12 + this.field_X.width, this.field_Y, 12 + (this.field_Z + this.field_X.height));
              this.field_gb = 0;
              this.field_eb.opacity = 0;
              return super.g((byte) 39);
            }
            this.field_eb.opacity = -((this.field_gb << 8) / this.field_fb) + 256;
            return super.g((byte) 39);
          }
          if (CurvedRoadSegment.field_G != this.field_db) {
            return super.g((byte) 39);
          }
          fieldTemp$1 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (this.field_cb != fieldTemp$1) {
            this.field_eb.opacity = (this.field_gb << 8) / this.field_cb;
            return super.g((byte) 39);
          }
          this.field_db = null;
          this.field_eb.opacity = 256;
          return super.g((byte) 39);
        }
        field_hb = (String) null;
        if (null == this.field_db) {
          return super.g((byte) 39);
        }
        if (this.field_db == dg.field_a) {
          fieldTemp$2 = this.field_gb + 1;
          this.field_gb = this.field_gb + 1;
          if (this.field_fb == fieldTemp$2) {
            this.field_db = DialogLayer.field_M;
            this.b(117, 12 + this.field_X.width, this.field_Y, 12 + (this.field_Z + this.field_X.height));
            this.field_gb = 0;
            this.field_eb.opacity = 0;
            return super.g((byte) 39);
          }
          this.field_eb.opacity = -((this.field_gb << 8) / this.field_fb) + 256;
          return super.g((byte) 39);
        }
        if (CurvedRoadSegment.field_G != this.field_db) {
          return super.g((byte) 39);
        }
        int fieldTemp$3 = this.field_gb + 1;
        this.field_gb = this.field_gb + 1;
        if (this.field_cb != fieldTemp$3) {
          this.field_eb.opacity = (this.field_gb << 8) / this.field_cb;
          return super.g((byte) 39);
        }
        this.field_db = null;
        this.field_eb.opacity = 256;
        return super.g((byte) 39);
    }

    void a(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -27 % ((param1 + 38) / 50);
          this.field_X = param0;
          if (this.field_db == DialogLayer.field_M) {
            this.b(67, 12 + this.field_X.width, this.field_Y, this.field_X.height + 12 + this.field_Z);
            this.field_gb = 0;
            return;
          }
          if (this.field_db == dg.field_a) {
            return;
          }
          this.field_gb = 0;
          this.field_db = dg.field_a;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dc.HA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(UiWidget param0, int param1) {
        try {
          if (null != this.field_eb) {
            this.field_eb.unlink(0);
          }
          if (param0 == null) {
            this.field_eb = new OpacityWidget();
          } else {
            param0.setBounds(6, (byte) 122, this.field_Z + 6, param0.height, param0.width);
            this.field_eb = new OpacityWidget(param0);
          }
          this.addChild(true, this.field_eb);
          if (param1 != -100) {
            this.field_gb = -75;
          }
          this.field_X = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dc.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (null != this.field_eb) {
            if (param1 == 98) {
              this.field_eb.requestFocus(param0, -25823);
            }
            if (param1 == 99) {
              this.field_eb.requestFocus(param0, -25823);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dc.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_hb = null;
        field_ib = null;
        field_ab = null;
        if (param0) {
          field_ab = (Sprite) null;
        }
    }

    final static int m(int param0) {
        if (param0 != 29675) {
          ContentTransitionDialog.clearSharedReferences(false);
          return ua.field_a;
        }
        return ua.field_a;
    }

    final boolean a(boolean param0) {
        this.b(false);
        if (!param0) {
          this.field_fb = 23;
          return super.a(param0);
        }
        return super.a(param0);
    }

    final void k(int param0) {
        if (dg.field_a == this.field_db) {
          return;
        }
        this.field_gb = 0;
        this.field_db = CurvedRoadSegment.field_G;
        if (param0 < -100) {
          this.d(this.field_X, -100);
          this.field_X = null;
          this.field_eb.opacity = 0;
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.a((UiWidget) null, (byte) -61);
        this.d(this.field_X, -100);
        this.field_X = null;
        this.field_eb.opacity = 0;
    }

    ContentTransitionDialog(DialogLayer param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.width + 12, param1.height + (param2 + 12));
        try {
          this.field_Y = param4;
          this.field_cb = param3;
          this.field_fb = param3;
          this.field_Z = param2;
          this.d(param1, -100);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static CurvedRoadSegment a(float param0, int param1, float param2, CurvedRoadSegment param3) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        CurvedRoadSegment var6 = null;
        CurvedRoadSegment stackIn_2_0 = null;
        CurvedRoadSegment stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = param3.field_E + (param3.field_I - param3.field_E) * param0;
          var5 = param3.field_E + (-param3.field_E + param3.field_I) * param2;
          var6 = new CurvedRoadSegment(param3.field_U, param3.field_z, var4_float, var5, param3.field_k, param3.field_N, param3.field_B, param3.field_P, param3.field_L, param3.field_F, param3.field_Q, param3.field_H, param3.field_w, param3.field_s, param3.field_m, param3.field_x, param3.field_t, param3.field_q);
          var6.field_A = (param3.field_K - param3.field_A) * param0 + param3.field_A;
          var6.field_o = param3.field_o;
          var6.field_K = (-param3.field_A + param3.field_K) * param2 + param3.field_A;
          if (param1 == -18895) {
            stackIn_4_0 = var6;
            return stackIn_4_0;
          }
          stackIn_2_0 = (CurvedRoadSegment) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_ib = new QuickChatDynamicCommand(12, 0, 1, 0);
        field_hb = "Error connecting to server. Please try using a different server.";
    }
}
