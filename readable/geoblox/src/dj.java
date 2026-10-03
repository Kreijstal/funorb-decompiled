/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends ButtonWidget {
    static byte[] diskSectorBuffer;
    private int field_H;
    private int field_L;
    private int field_J;
    private boolean field_G;
    private boolean field_E;
    private long field_P;
    static byte[][] field_I;
    private int field_M;
    private long field_O;
    static int[] projectedMeshVertexY;

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 0) {
            this.field_J = -7;
        }
        if (this.field_L != this.field_H) {
            var2 = this.field_L >= this.field_H ? this.field_H : this.field_L;
            var3 = this.field_H > this.field_L ? this.field_H : this.field_L;
            this.field_H = var2;
            this.field_L = var2;
            this.widgetText = this.widgetText.substring(0, var2) + this.widgetText.substring(var3, this.widgetText.length());
            this.g((byte) -117);
        }
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        int var6 = 0;
        cc var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
          this.j(-115);
          if (this.pressedPointerButton == 1) {
            if (this.renderer instanceof cc) {
              var7 = (cc) ((Object) this.renderer);
              var6 = var7.a((UiWidget) (this), PrefixCodeDecoder.pointerXSnapshot, -15539, parentY, ue.pointerYSnapshot, parentX);
              if (-1 != var6) {
                if ((this.field_G) &&
                    (this.field_J > var6) &&
                    (this.field_L < var6)) {
                  var6 = this.field_J;
                }
                this.field_H = var6;
              }
            }
            this.field_O = oa.a(-12520);
          }
          if (hoverGuard) {
            field_I = (byte[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var5);
          stackIn_16_1 = new StringBuilder().append("dj.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(parentX).append(')').toString());
        }
    }

    private final int h(byte param0) {
        String discarded$1 = null;
        int var2;
        int var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        var2 = this.widgetText.length();
        if (var2 == this.field_H) {
          return this.field_H;
        }
        var3 = 1 + this.field_H;
        if (param0 != -57) {
          discarded$1 = this.k((byte) -79);
        }
        while (var3 < var2) {
          if (32 != this.widgetText.charAt(-1 + var3)) {
            var3++;
            continue;
          }
          break;
        }
        return var3;
    }

    private final String k(byte param0) {
        int var2 = 33 % ((-77 - param0) / 39);
        int var3 = this.field_L >= this.field_H ? this.field_H : this.field_L;
        int var4 = this.field_L < this.field_H ? this.field_H : this.field_L;
        return this.widgetText.substring(var3, var4);
    }

    final static Sprite[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != -70) {
            diskSectorBuffer = (byte[]) null;
        }
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        Sprite dupTemp$0 = ef.a(0, param0, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = ef.a(0, param2, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param3 == 0)) {
            var6[4] = ef.a(0, param3, 64);
        }
        return var5;
    }

    dj(String param0, WidgetListener param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_P = 0L;
        this.field_J = -1;
        try {
            this.field_M = param2;
            this.renderer = hb.field_j.field_g;
            this.a(-128, param0, true);
            this.field_E = true;
            this.field_O = oa.a(-12520);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        this.i(-23161);
        if (param0 <= 29) {
            this.field_G = false;
        }
        this.g(0);
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -6 / ((param1 - 63) / 50);
          if (this.field_M != -1) {
            var4 = this.field_M - this.widgetText.length();
            if (var4 >= 0) {
              return;
            }
            param0 = param0.substring(0, var4);
          }
          if (this.field_H != this.widgetText.length()) {
            this.widgetText = this.widgetText.substring(0, this.field_H) + param0 + this.widgetText.substring(this.field_H, this.widgetText.length());
          } else {
            this.widgetText = this.widgetText + param0;
          }
          this.field_H = this.field_H + param0.length();
          this.field_L = this.field_H;
          this.g((byte) -36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);
          stackIn_12_1 = new StringBuilder().append("dj.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        this.field_H = param0;
        if (param1 >= -114) {
            this.j(-114);
        }
        if (!(kj.heldInternalKeys[81])) {
            this.field_L = this.field_H;
        }
    }

    public static void l(byte param0) {
        diskSectorBuffer = null;
        if (param0 != -15) {
            return;
        }
        projectedMeshVertexY = null;
        field_I = (byte[][]) null;
    }

    final boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int stackIn_5_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if ((super.handlePointerPress(parentY, 104, parentX, pointerButton, pointerX, pointerY, eventContext)) &&
              (this.renderer instanceof cc)) {
            var8_int = ((cc) ((Object) this.renderer)).a((UiWidget) (this), PrefixCodeDecoder.pointerXSnapshot, -15539, parentY, ue.pointerYSnapshot, parentX);
            if (var8_int != -1) {
              stackIn_5_1 = var8_int;
            } else {
              stackIn_5_1 = 0;
            }
            this.a(stackIn_5_1, (byte) -123);
            var8_long = oa.a(-12520);
            if (var8_long - this.field_P >= 250L) {
              stackIn_8_1 = false;
            } else {
              stackIn_8_1 = true;
            }
            ((dj) (this)).field_G = stackIn_8_1;
            if (this.field_G) {
              this.field_L = this.j((byte) 77);
              this.field_H = this.h((byte) -57);
              if ((0 < this.field_H) &&
                  (this.widgetText.charAt(this.field_H - 1) == 32)) {
                this.field_H = this.field_H - 1;
              }
              this.field_J = this.field_H;
            }
            this.field_P = var8_long;
            return true;
          }
          var8_int = 70 / ((methodGuard + 3) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var8);
          stackIn_20_1 = new StringBuilder().append("dj.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            String var2 = null;
            Exception var2_ref = null;
            try {
              var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.g(param0 ^ param0);
              this.a(var2, param0 ^ 43);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5;
        cc var6;
        long var7;
        var5 = -124 % ((methodGuard - 1) / 43);
        if ((this.renderer != null) &&
            (renderPass == 0)) {
          this.renderer.a(parentX, -8, parentY, this.enabled, (UiWidget) (this));
          if (this.renderer instanceof cc) {
            var6 = (cc) ((Object) this.renderer);
            if (this.field_H != this.field_L) {
              var6.a(this.field_L, 0, parentY, parentX, this.field_H, (UiWidget) (this));
            }
            var7 = oa.a(-12520);
            if ((-this.field_O + var7) % 1000L < 500L) {
              var6.a(parentX, this.field_H, -2, (UiWidget) (this), parentY);
            }
          }
        }
    }

    private final void m(byte param0) {
        if (this.listener instanceof ga) {
            ((ga) ((Object) this.listener)).a((dj) (this), -18649);
        }
        if (param0 < 107) {
            this.field_G = true;
        }
    }

    private final int j(byte param0) {
        int var2;
        int var3;
        var3 = Geoblox.clientControlFlowFlag;
        if (0 == this.field_H) {
          return this.field_H;
        }
        if (param0 != 77) {
          return 108;
        }
        for (var2 = this.field_H - 1; var2 > 0; var2--) {
          if (this.widgetText.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void i(int param0) {
        if (param0 != -23161) {
            return;
        }
        String var2 = this.k((byte) -128);
        if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k((byte) -117))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void i(byte param0) {
        this.field_L = 0;
        this.field_H = 0;
        this.widgetText = "";
        this.g((byte) -78);
        if (param0 <= 20) {
            this.field_E = true;
        }
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        int dupTemp$0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 13) {
            return false;
          }
          this.field_O = oa.a(-12520);
          if (60 == param2) {
            return false;
          }
          if (param2 == 62) {
            return false;
          }
          if ((32 <= param2) &&
              (param2 <= 126)) {
            if (this.field_H != this.field_L) {
              this.g(0);
            }
            if (!((-1 != this.field_M) &&
                  (this.widgetText.length() >= this.field_M))) {
              if (this.field_H >= this.widgetText.length()) {
                this.widgetText = this.widgetText + param2;
                dupTemp$0 = this.widgetText.length();
                this.field_H = dupTemp$0;
                this.field_L = dupTemp$0;
              } else {
                this.widgetText = this.widgetText.substring(0, this.field_H) + param2 + this.widgetText.substring(this.field_H, this.widgetText.length());
                this.field_H = this.field_H + 1;
                this.field_L = this.field_H;
              }
              this.g((byte) -36);
            }
            return true;
          }
          if (param0 == 85) {
            if (this.field_H != this.field_L) {
              this.g(0);
              return true;
            }
            if (0 < this.field_H) {
              this.field_L = this.field_H - 1;
              this.g(param1 ^ 13);
              return true;
            }
          } else {
            if (101 != param0) {
              if (param0 == 13) {
                this.i((byte) 76);
                return true;
              }
              if (param0 == 96) {
                if (0 < this.field_H) {
                  if (!kj.heldInternalKeys[82]) {
                    stackIn_55_1 = this.field_H - 1;
                  } else {
                    stackIn_55_1 = this.j((byte) 77);
                  }
                  this.a(stackIn_55_1, (byte) -126);
                  return true;
                }
              } else {
                if (param0 == 97) {
                  if (this.field_H < this.widgetText.length()) {
                    if (!kj.heldInternalKeys[82]) {
                      stackIn_48_1 = this.field_H + 1;
                    } else {
                      stackIn_48_1 = this.h((byte) -57);
                    }
                    this.a(stackIn_48_1, (byte) -125);
                    return true;
                  }
                } else {
                  if (102 == param0) {
                    this.a(0, (byte) -118);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.widgetText.length(), (byte) -126);
                    return true;
                  }
                  if (param0 == 84) {
                    this.m((byte) 111);
                    return true;
                  }
                  if ((kj.heldInternalKeys[82]) &&
                      (param0 == 65)) {
                    this.h(112);
                    return true;
                  }
                  if ((kj.heldInternalKeys[82]) &&
                      (param0 == 66)) {
                    this.i(-23161);
                    return true;
                  }
                  if ((kj.heldInternalKeys[82]) &&
                      (67 == param0)) {
                    this.f(82);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_L != this.field_H) {
                this.g(0);
                return true;
              }
              if (this.field_H < this.widgetText.length()) {
                this.field_L = this.field_H + 1;
                this.g(0);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = (RuntimeException) (var5);
          stackIn_81_1 = new StringBuilder().append("dj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    private final void j(int param0) {
        dk var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        cc var9;
        var8 = Geoblox.clientControlFlowFlag;
        if (!this.field_E) {
          this.field_n = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.renderer instanceof cc)) {
          return;
        }
        var9 = (cc) ((Object) this.renderer);
        if (param0 > -66) {
          return;
        }
        var3 = var9.a((byte) 119, (UiWidget) (this));
        var4 = var3.a(96);
        var5 = var9.a((UiWidget) (this), -1);
        var6 = var9.a(1) >> 1;
        if (var4 < var5 - var6) {
          this.field_k = 0;
          this.field_n = 0;
        } else {
          var7 = this.field_k + var3.a(this.field_H, 120);
          if (var7 > var5 - var6) {
            this.field_k = this.field_k - (var7 + var6 - var5);
          } else {
            if (var7 < var6) {
              this.field_k = this.field_k - (-var6 + var7);
            }
          }
          if (this.field_k <= 0) {
            if (var6 - var5 > this.field_k) {
              this.field_k = var6 - var5;
            }
          } else {
            this.field_k = 0;
          }
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = 8 / ((param0 + 65) / 44);
          if (param1 == null) {
            param1 = "";
          }
          this.widgetText = param1;
          var5 = param1.length();
          if ((this.field_M != -1) &&
              (this.field_M < var5)) {
            this.widgetText = this.widgetText.substring(0, this.field_M);
          }
          dupTemp$1 = this.widgetText.length();
          this.field_L = dupTemp$1;
          this.field_H = dupTemp$1;
          if (!param2) {
            this.g((byte) -58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var4);
          stackIn_11_1 = new StringBuilder().append("dj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    void g(byte param0) {
        if (param0 >= -16) {
            return;
        }
        if (!(!(this.listener instanceof ga))) {
            ((ga) ((Object) this.listener)).a((dj) (this), (byte) 74);
        }
    }

    static {
        diskSectorBuffer = new byte[520];
        field_I = new byte[1000][];
        projectedMeshVertexY = new int[8192];
    }
}
