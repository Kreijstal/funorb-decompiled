/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntList {
    static String field_h;
    private int field_g;
    static String field_b;
    private boolean field_e;
    static LoginMethod field_j;
    static SpriteWidget field_a;
    private int[] field_f;
    private int field_i;
    static long field_c;
    static Sprite field_d;

    final void add(int param0, int param1) {
        this.set(-113, param1, this.field_i + 1);
        if (param0 != -1) {
          field_b = (String) null;
        }
    }

    private final void set(int param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (this.field_i < param2) {
          this.field_i = param2;
          if (this.field_f.length <= param2) {
            this.ensureCapacity((byte) -50, param2);
            this.field_f[param2] = param1;
            var4 = -90 / ((param0 + 39) / 56);
            return;
          }
          this.field_f[param2] = param1;
          var4Lifetime3 = -90 / ((param0 + 39) / 56);
          return;
        }
        if (this.field_f.length > param2) {
          this.field_f[param2] = param1;
          var4Lifetime1 = -90 / ((param0 + 39) / 56);
          return;
        }
        this.ensureCapacity((byte) -50, param2);
        this.field_f[param2] = param1;
        var4Lifetime2 = -90 / ((param0 + 39) / 56);
    }

    private final void ensureCapacity(byte param0, int param1) {
        int[] var4 = new int[this.nextCapacity(0, param1)];
        int[] var3 = var4;
        if (param0 == -50) {
          ArraySupport.copy(this.field_f, 0, var4, 0, this.field_f.length);
          this.field_f = var4;
          return;
        }
        field_a = (SpriteWidget) null;
        ArraySupport.copy(this.field_f, 0, var4, 0, this.field_f.length);
        this.field_f = var4;
    }

    final static void openLoginPanelWithMessage(byte param0, String param1, String param2) {
        try {
          if (null != ThreeSliceButtonPainter.field_w) {
            ThreeSliceButtonPainter.field_w.closeDialog(true);
          }
          int var3_int = 94 / ((param0 + 93) / 33);
          QuickChatHelpHelpers.field_a = new LoginPanel(param1, param2, false, true, true);
          UiWidget.field_t.transitionToContent(QuickChatHelpHelpers.field_a, (byte) -53);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "nd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void removeAt(byte param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 <= this.field_i) {
          if (param1 != this.field_i) {
            ArraySupport.copy(this.field_f, 1 + param1, this.field_f, param1, -param1 + this.field_i);
          }
          this.field_i = this.field_i - 1;
          int var3 = -30 / ((31 - param0) / 58);
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final int get(int param0, byte param1) {
        int var3 = 68 % ((param1 - 41) / 39);
        if (param0 > this.field_i) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_f[param0];
    }

    final static boolean pollKeyEvent(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = ValidationIndicator.field_L;
        synchronized (var1_ref) {
          if (ProxySocketConnector.field_h == LongAndTextLoginPayload.field_l) {
            return false;
          }
          ScrollPane.field_Gb = ChatMessage.field_o[ProxySocketConnector.field_h];
          PopupMenuHelpers.field_d = CipherPacketBuffer.field_q[ProxySocketConnector.field_h];
          ProxySocketConnector.field_h = ProxySocketConnector.field_h + 1 & 127;
          if (param0 >= -95) {
            GrowableIntList.releaseStatics((byte) -122);
          }
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final int size(boolean param0) {
        if (param0) {
          this.get(71, (byte) 14);
          return 1 + this.field_i;
        }
        return 1 + this.field_i;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_j = null;
        field_b = null;
        field_h = null;
        field_a = null;
        if (param0 < 108) {
          field_h = (String) null;
        }
    }

    private final int nextCapacity(int param0, int param1) {
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var3 = this.field_f.length;
        while (var3 <= param1) {
          if (!this.field_e) {
            var3 = var3 + this.field_g;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_g;
        }
        if (param0 != 0) {
          return 14;
        }
        return var3;
    }

    private GrowableIntList() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "You have resigned and are offering a rematch.";
        field_h = "Connection restored.";
        field_j = new LoginMethod("");
    }
}
