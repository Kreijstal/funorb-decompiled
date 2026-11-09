/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class FullscreenMembershipDialog extends ResizingDialog implements WidgetActionListener {
    static SpriteData[] field_S;
    static String tryAgainText;
    static String playerText;
    static SpriteData field_T;
    static String youHave1UnreadText;
    private InteractiveWidget field_U;
    private InteractiveWidget field_P;

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 710) {
            this.field_P = (InteractiveWidget) null;
          }
          if (source == this.field_U) {
            IntIndexHashTable.a(0);
            this.e(false);
            return;
          }
          if (this.field_P != source) {
            return;
          }
          this.e(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("kq.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    FullscreenMembershipDialog(DialogLayer param0) {
        super(param0, 200, 130);
        UiWidget var2 = null;
        try {
          var2 = new UiWidget(IntrusiveNode.fullscreenPlayIsAnText, (WidgetListener) null);
          var2.x = 0;
          var2.y = 50;
          var2.height = 80;
          var2.width = this.width;
          var2.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var2, 60);
          if (vs.isGuestSession((byte) 9)) {
            this.field_U = this.a(25566, (WidgetListener) (this), AudioServiceThread.membersText);
          }
          this.field_P = this.a(25566, (WidgetListener) (this), DraggableWidget.closeText);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        field_S = null;
        tryAgainText = null;
        playerText = null;
        if (param0 == 50) {
          field_T = null;
          youHave1UnreadText = null;
          return;
        }
        File var2 = (File) null;
        FullscreenMembershipDialog.a(85, (File) null, (byte) 19);
        field_T = null;
        youHave1UnreadText = null;
    }

    final static byte[] a(int param0, File param1, byte param2) {
        try {
          byte[] var3 = null;
          IOException var3_ref = null;
          RuntimeException var3_ref2 = null;
          byte[] var4 = null;
          byte[] stackIn_3_0 = null;
          Object stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = new byte[param0];
              var3 = var4;
              TimedSceneEffect.readFileFully(var4, 7039, param1, param0);
              if (param2 <= 41) {
                tryAgainText = (String) null;
              }
              stackIn_3_0 = var4;
              return stackIn_3_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              stackIn_5_0 = null;
              return (byte[]) (stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("kq.V(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(boolean param0) {
        if (!this.open) {
          return;
        }
        this.open = param0 ? true : false;
    }

    private final InteractiveWidget a(int param0, WidgetListener param1, String param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_2_0 = null;
        InteractiveWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param2, param1);
          if (param0 != 25566) {
            stackIn_2_0 = (InteractiveWidget) null;
            return stackIn_2_0;
          }
          var4.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
          var5 = -6 + this.height;
          this.height = this.height + 38;
          var4.setBounds(param0 - 25442, 15, var5, 30, -14 + (this.width - 16));
          this.addChild(var4, 90);
          this.refreshLayout(false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("kq.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void l(int param0) {
        TextLayout.b(param0 ^ param0);
    }

    final static int glTextureCombineSource(int guard, TextureCombineSource source) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (source == jq.TEXTURE) {
            stackIn_12_0 = 5890;
            return stackIn_12_0;
          }
          if (NetworkResourceRequest.PRIMARY_COLOR == source) {
            stackIn_10_0 = 34167;
            return stackIn_10_0;
          }
          if (FontMetrics.PREVIOUS == source) {
            stackIn_4_0 = 34168;
            return stackIn_4_0;
          }
          if (AccountRequestState.CONSTANT == source) {
            stackIn_8_0 = 34166;
            return stackIn_8_0;
          }
          if (guard <= 59) {
            field_S = (SpriteData[]) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("kq.O(").append(guard).append(',');
          if (source == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (keyCode == 98) {
            if (null != this.field_U) {
              this.field_U.requestFocus((UiWidget) (this), (byte) 61);
              return true;
            }
            this.field_P.requestFocus((UiWidget) (this), (byte) 61);
            return true;
          }
          if (guard < 9) {
            return false;
          }
          if (keyCode != 99) {
            stackIn_13_0 = super.onKey(root, character, (byte) 69, keyCode);
            return stackIn_13_0;
          }
          this.field_P.requestFocus((UiWidget) (this), (byte) 61);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("kq.KA(");
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    static {
        youHave1UnreadText = "You have 1 unread message!";
        playerText = "Player";
        tryAgainText = "Try again";
    }
}
