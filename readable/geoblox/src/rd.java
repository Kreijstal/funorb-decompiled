/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ff {
    static byte[][] field_s;
    static int field_u;
    static di field_r;
    static int field_v;
    static String field_w;
    private si field_t;
    private si[] field_x;

    final si a(int param0, int param1) {
        if (param0 >= -93) {
            return (si) null;
        }
        si dupTemp$0 = new si();
        this.field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, Sprite[] param1) {
        int var4 = 0;
        si[] var3 = null;
        si var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        si[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != 124) {
            var7 = (UiWidget) null;
            this.a(-125, -66, 53, true, (UiWidget) null);
          }
          var8 = this.field_x;
          var3 = var8;
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_a = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3_ref);
          stackIn_12_1 = new StringBuilder().append("rd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(boolean param0, rd param1, boolean param2) {
        int var4_int = 0;
        si dupTemp$0 = null;
        si stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        si stackIn_9_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        si var5 = null;
        si var6 = null;
        int var7 = 0;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          super.a(param1, param0);
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_x[var4_int];
              if (var5 == null) {
                param1.field_x[var4_int] = null;
              } else {
                var6 = param1.field_x[var4_int];
                stackIn_8_0 = (si) (var5);
                stackIn_8_1 = 2;
                if (var6 == null) {
                  dupTemp$0 = new si();
                  param1.field_x[var4_int] = dupTemp$0;
                  stackIn_9_2 = (si) (dupTemp$0);
                } else {
                  stackIn_9_2 = (si) (var6);
                }
                ((si) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              }
            }
            return;
          }
          sf.a(this.field_x, 0, param1.field_x, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var4);
          stackIn_15_1 = new StringBuilder().append("rd.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, Sprite param1) {
        int var4 = 0;
        si[] var3 = null;
        si var5 = null;
        int var6 = 0;
        si[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          var7 = this.field_x;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_l = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3_ref);
          stackIn_10_1 = new StringBuilder().append("rd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != 520) {
            String var2 = (String) null;
            rd.a(38, (String) null);
        }
        kd.field_e.hideAllDialogs(10936);
        if (!(null != vg.field_i)) {
            vg.field_i = new rl(kd.field_e, ff.field_d);
        }
        kd.field_e.showDialog(false, vg.field_i);
    }

    final static void b(int param0) {
        ResizableDialog.awtKeyCodeToInternalCode[45] = 26;
        ResizableDialog.awtKeyCodeToInternalCode[44] = 71;
        ResizableDialog.awtKeyCodeToInternalCode[520] = 59;
        ResizableDialog.awtKeyCodeToInternalCode[222] = 58;
        ResizableDialog.awtKeyCodeToInternalCode[192] = param0;
        ResizableDialog.awtKeyCodeToInternalCode[46] = 72;
        ResizableDialog.awtKeyCodeToInternalCode[47] = 73;
        ResizableDialog.awtKeyCodeToInternalCode[92] = 74;
        ResizableDialog.awtKeyCodeToInternalCode[91] = 42;
        ResizableDialog.awtKeyCodeToInternalCode[93] = 43;
        ResizableDialog.awtKeyCodeToInternalCode[61] = 27;
        ResizableDialog.awtKeyCodeToInternalCode[59] = 57;
    }

    public rd() {
        this.field_x = new si[6];
        this.field_t = new si();
        si dupTemp$0 = new si();
        this.field_x[0] = dupTemp$0;
        si var1 = dupTemp$0;
        var1.a((byte) -3);
    }

    public static void a(byte param0) {
        int var1 = -71 / ((32 - param0) / 50);
        field_r = null;
        field_s = (byte[][]) null;
        field_w = null;
    }

    final void a(Sprite[] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1;
          if (this.field_x[var4_int] == null) {
            this.field_x[var4_int] = new si();
          }
          this.field_x[param1].field_a = param0;
          if (param2 <= 38) {
            field_r = (di) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var4);
          stackIn_8_1 = new StringBuilder().append("rd.GA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, UiWidget param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        si var7 = null;
        si var9 = null;
        ButtonWidget var10 = null;
        si var11 = null;
        si var12 = null;
        si var13 = null;
        si var14 = null;
        try {
          if (!(param4 instanceof ButtonWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (param4);
          }
          var10 = (ButtonWidget) ((Object) stackIn_3_0);
          uh.a(param4.widgetY + param2, param4.widgetX + param0, -14045, param4.widgetHeight + (param2 + param4.widgetY), param4.widgetWidth + (param0 + param4.widgetX));
          if (var10 != null) {
            param3 = param3 & var10.enabled;
          }
          var7 = this.field_x[0];
          if (param1 >= -5) {
            field_s = (byte[][]) null;
          }
          L3: {
            this.field_t.a((byte) -28);
            var7.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
            if (var10 != null) {
              if (var10.field_y) {
                var11 = this.field_x[1];
                if (var11 != null) {
                  var11.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                }
              }
              if (var10.pointerInside) {
                var12 = this.field_x[3];
                if ((var10.pressedPointerButton != 0) &&
                    (var12 != null)) {
                  var12.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                  break L3;
                }
                var9 = this.field_x[2];
                if (var9 != null) {
                  var9.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
                }
              }
            }
          }
          if (param4.hasKeyboardFocus((byte) 54)) {
            var13 = this.field_x[5];
            if (var13 != null) {
              var13.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
            }
          }
          if (!param3) {
            var14 = this.field_x[4];
            if (var14 != null) {
              var14.a(param0, param2, this.field_t, (rd) (this), -16566, param4);
            }
          }
          this.field_t.a((rd) (this), param0, param2, param4, 0);
          id.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = (RuntimeException) (var6);
          stackIn_31_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -116) {
            return;
        }
        try {
            fl.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "rd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rd(rd param0, boolean param1) {
        this();
        try {
            param0.a(true, (rd) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -61) {
            field_s = (byte[][]) null;
          }
          if (mf.decodeSpritesFromArchive(param2, param0, 114, param3)) {
            return hj.buildSpritesWithDecodedAlpha(104);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var4);
          stackIn_8_1 = new StringBuilder().append("rd.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_s = new byte[250][];
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
