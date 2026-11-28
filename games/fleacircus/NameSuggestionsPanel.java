/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NameSuggestionsPanel extends DequeWidgetContainer implements WidgetActivationListener {
    static int[] field_H;
    private String[] field_K;
    static String[] field_J;
    static int field_I;
    static int field_L;
    private InteractiveWidget[] field_M;
    static si[] field_F;
    private NameSuggestionListener field_G;

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param2, -28533);
            return stackIn_7_0;
          }
          if (param0 != -2) {
            return true;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_13_0 = this.focusNextChild(32, param2);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ij.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (ComponentLayout) null);
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (BufferedSocket.field_k.field_c >= 4) {
            if (BufferedSocket.field_k.field_b == -1) {
              return 3;
            }
            if (BufferedSocket.field_k.field_b == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (lc.field_r == 0) {
              nj.field_a = mh.field_x.requestDirectSocket(il.field_g, (byte) 32, fh.field_g);
              lc.field_r = lc.field_r + 1;
            }
            if (lc.field_r == 1) {
              if (2 == nj.field_a.status) {
                stackIn_14_0 = NetworkGameClient.a(-1, 5);
                return stackIn_14_0;
              }
              if (nj.field_a.status == 1) {
                lc.field_r = lc.field_r + 1;
              }
            }
            if (lc.field_r == 2) {
              ResizableModalDialog.field_M = new BufferedSocket((java.net.Socket) (nj.field_a.result), mh.field_x);
              var2 = new PacketBuffer(13);
              ob.a(FrameTimer.field_d, of.field_b, (byte) -19, b.field_a, var2);
              var2.writeByte(-11, 15);
              var2.writeInt(tj.field_c, (byte) -28);
              ResizableModalDialog.field_M.a((byte) -92, 13, 0, var2.payload);
              lc.field_r = lc.field_r + 1;
              AccountServiceResult.field_e = 30000L + lj.correctedCurrentTimeMillis((byte) -80);
            }
            if (3 == lc.field_r) {
              if (0 >= ResizableModalDialog.field_M.e(-110)) {
                if (lj.correctedCurrentTimeMillis((byte) -25) > AccountServiceResult.field_e) {
                  stackIn_29_0 = NetworkGameClient.a(-2, 5);
                  return stackIn_29_0;
                }
              } else {
                var1_int = ResizableModalDialog.field_M.f(1605772320);
                if (var1_int != 0) {
                  stackIn_24_0 = NetworkGameClient.a(var1_int, 5);
                  return stackIn_24_0;
                }
                lc.field_r = lc.field_r + 1;
              }
            }
            if (param0 <= 94) {
              stackIn_32_0 = -52;
              return stackIn_32_0;
            }
            if (lc.field_r != 4) {
              return -1;
            }
            BufferedSocket.field_k.a(ResizableModalDialog.field_M, md.field_S, (byte) 105);
            lc.field_r = 0;
            ResizableModalDialog.field_M = null;
            nj.field_a = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return NetworkGameClient.a(-3, 5);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String param1, String param2) {
        try {
          if (param0 != -1) {
            NameSuggestionsPanel.clearDeclaredStaticReferences((byte) 47);
          }
          if (ok.field_x != null) {
            ok.field_x.closeDialog(-22645);
          }
          lg.field_b = new LoginPanel(param1, param2, false, true, true);
          ak.field_a.replaceContent(lg.field_b, 26034);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ij.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_H = null;
        field_F = null;
        if (param0 != -20) {
          NameSuggestionsPanel.clearDeclaredStaticReferences((byte) -66);
        }
        field_J = null;
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_K.length; var6_int++) {
            if (this.field_M[var6_int] == param4) {
              this.field_G.onNameSuggestionSelected(this.field_K[var6_int], (byte) -96);
            }
          }
          if (param4 == this.field_M[this.field_K.length]) {
            this.field_G.onNameSuggestionsRefreshRequested(-92);
          }
          if (param3 != 248) {
            NameSuggestionsPanel.clearDeclaredStaticReferences((byte) -83);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ij.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void drawWidget(int param0, int param1, boolean param2, int param3) {
        super.drawWidget(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        BitmapFont var5 = ug.field_e;
        if (this.field_K != null) {
          var5.drawParagraph(lc.field_s, param1 + this.field_y, this.field_z + param0, this.field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
        }
    }

    final void setNameSuggestions(String[] param0, int param1) {
        int var4_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = fleas.field_A ? 1 : 0;
        try {
          this.field_C.clear(1);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_K = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_K[var4_int] = al.a((CharSequence) ((Object) param0[var4_int]), (byte) 111).replace(' ', ' ');
            }
            var4 = new me(ug.field_e, 0, 1);
            this.field_M = new InteractiveWidget[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_M[var5] = new InteractiveWidget(this.field_K[var5], (WidgetEventListener) (this));
              this.field_M[var5].field_p = (ComponentLayout) ((Object) var4);
              this.field_M[var5].field_m = IntrusiveNode.field_d;
              this.field_M[var5].setBounds(0, 80, 20 + var5 * 16, 15, 80);
              this.addChild((UiComponent) (this.field_M[var5]), (byte) -89);
            }
            this.field_M[var3_int] = new InteractiveWidget(ue.field_b, (WidgetEventListener) (this));
            var5Lifetime1 = -104 / ((param1 - 15) / 54);
            this.field_M[var3_int].field_p = (ComponentLayout) ((Object) var4);
            this.field_M[var3_int].setBounds(0, 100, (var3_int + 1) * 16 + 20, 15, 80);
            this.addChild((UiComponent) (this.field_M[var3_int]), (byte) -112);
            return;
          }
          this.field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ij.BA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_L = 10;
        field_J = new String[]{"Complete first five levels of either set", "Complete first ten levels of either set", "Complete first twenty levels of either set", "Complete all levels of both sets", "Destroy the golden walls on level 'Golden Fleas'", "Save all fleas on level 1 of the Classic set", "Save all fleas on level 2 of the Classic set", "Save all fleas on level 3 of the Classic set", "Save all fleas on level 4 of the Classic set", "Save all fleas on level 5 of the Classic set", "Complete level 12 of the New set without any fleas drowning", "Get all fleas in the air at the same time on any level", "Complete the first five levels (of either set) without restarting", "Complete the first ten levels (of either set) without restarting", "Complete the first twenty levels (of either set) without restarting", "Complete all levels (of either set) without restarting"};
    }
}
