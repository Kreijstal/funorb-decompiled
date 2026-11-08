/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ScoreMarkerDemo {
    private int[] field_a;
    static String field_i;
    private ScoreMarkerBar field_f;
    static int field_b;
    static MenuInputState field_c;
    static int field_j;
    private int field_d;
    static int field_k;
    static String field_g;
    static String field_h;
    static String field_e;

    final void draw(byte param0) {
        this.field_f.draw(2);
        if (param0 != -8) {
          field_i = (String) null;
        }
    }

    final void tick(int param0) {
        this.field_f.tickMarker(12804, false);
        int fieldTemp$0 = this.field_d;
        this.field_d = this.field_d + 1;
        if (fieldTemp$0 != 60) {
          if (120 >= this.field_d) {
            if (param0 != 300) {
              ScoreMarkerDemo.showAccountChoicePanel(43);
              return;
            }
            return;
          }
          this.field_a[0] = 0;
          this.field_a[1] = 300 + JavaRandomHelpers.randomBelow(ea.field_b, DraggableWidget.intXor(param0, -327), 300);
          this.field_d = 0;
          if (param0 != 300) {
            ScoreMarkerDemo.showAccountChoicePanel(43);
            return;
          }
          return;
        }
        this.field_a[0] = JavaRandomHelpers.randomBelow(ea.field_b, -100, 300) + 300;
        this.field_a[1] = 0;
        if (param0 == 300) {
          return;
        }
        ScoreMarkerDemo.showAccountChoicePanel(43);
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 == 21651) {
          field_i = null;
          return;
        }
        ScoreMarkerDemo.showAccountChoicePanel(-11);
        field_i = null;
    }

    final static void setButtonFrames(int param0, sb param1, int param2, int param3, int param4, sb param5) {
        try {
          BufferedRandomAccessFile.field_m = param1;
          ProxyAuthenticationException.field_a = param2;
          WidgetStyleLayer.field_b = param4;
          Matrix3.field_d = param5;
          if (param3 != 300) {
            sb var7 = (sb) null;
            ScoreMarkerDemo.setButtonFrames(-68, (sb) null, -42, 67, -94, (sb) null);
          }
          KiteTailSegment.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static String formatPageNumber(int param0, int param1) {
        if (param0 == 4067) {
          return param1 + 1 + "/" + SoundVoice.field_m.length;
        }
        sb var3 = (sb) null;
        ScoreMarkerDemo.setButtonFrames(112, (sb) null, -11, -57, 97, (sb) null);
        return param1 + 1 + "/" + SoundVoice.field_m.length;
    }

    final static String requestAddIgnore(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        CipherPacketBuffer var6 = null;
        CharSequence var7 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          if (!Bzip2State.isValidPlayerName((byte) -128, var7)) {
            stackIn_3_0 = qn.field_n;
            return stackIn_3_0;
          }
          if (sm.isLocalPlayerName(param1, -1)) {
            stackIn_6_0 = GrowableIntList.field_h;
            return stackIn_6_0;
          }
          if (ValidatedTextWidget.field_db != 2) {
            stackIn_9_0 = WeightedLruCache.field_d;
            return stackIn_9_0;
          }
          if (ImageProducerRasterBuffer.isFriend(-640, param1)) {
            stackIn_13_0 = AlphaContainer.formatTemplate(SpriteState.field_H, 45, new String[]{param1});
            return stackIn_13_0;
          }
          if (ReflectionCheckRequest.field_t >= 100) {
            stackIn_17_0 = ViewportController.field_k;
            return stackIn_17_0;
          }
          if (CanvasRasterBuffer.isFriendName(param1, (byte) 37)) {
            stackIn_20_0 = AlphaContainer.formatTemplate(ArchiveProvider.field_b, 89, new String[]{param1});
            return stackIn_20_0;
          }
          var6 = ChatMessage.field_f;
          var6.writeOpcode(param2, 15514);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(160, 2);
          var6.writeString((byte) -41, param1);
          var6.backpatchByteLength(var6.position - var4, -1);
          var5 = 55 / ((param0 - 16) / 45);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("mj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    public ScoreMarkerDemo() {
        this.field_a = new int[2];
        this.field_a[0] = 0;
        this.field_a[1] = 0;
        this.field_f = new ScoreMarkerBar(this.field_a, false, 500, 330);
        this.field_f.setScrollSpeed(196608, -115);
    }

    final static void showAccountChoicePanel(int param0) {
        ph.field_l.transitionToContent(new AccountChoicePanel(), -115);
        if (param0 != 24496) {
          String var2 = (String) null;
          ScoreMarkerDemo.requestAddIgnore(-69, (String) null, 1);
        }
    }

    final static void closeQuickChatMenu(boolean param0) {
        un.field_l = param0 ? true : false;
        if (null == bo.field_h) {
          if (0 != ce.field_d) {
            nd.clearChatInput((byte) -124);
          }
          di.field_a = 0;
          return;
        }
        bo.field_h.resetSelection(17872);
        if (0 != ce.field_d) {
          nd.clearChatInput((byte) -124);
        }
        di.field_a = 0;
    }

    static {
        field_i = "Discard";
        field_h = "Create a free account to start using this feature";
        field_g = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_c = new MenuInputState(1);
        field_e = "Music: ";
    }
}
