/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class Checkbox extends TextButton {
    static ModalStack field_F;
    static int field_E;
    static String field_D;
    static int[] field_H;
    static byte[] field_G;

    final void notifyAction(int guard, int localY, int localX, int buttonCode) {
        this.selected = !this.selected ? true : false;
        if (guard == -19646) {
          super.notifyAction(guard ^ 0, localY, localX, buttonCode);
          return;
        }
        java.awt.Canvas var6 = (java.awt.Canvas) null;
        Checkbox.detachCanvasInput((java.awt.Canvas) null, (byte) 126);
        super.notifyAction(guard ^ 0, localY, localX, buttonCode);
    }

    private Checkbox(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.painter = AchievementThresholdRule.field_g.checkboxPainter;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_H = null;
        field_F = null;
        field_D = null;
        if (guard <= 17) {
          return;
        }
        field_G = null;
    }

    private Checkbox(String param0, UiListener param1) {
        this(param0, AchievementThresholdRule.field_g.buttonPainter, param1);
        try {
          this.painter = AchievementThresholdRule.field_g.checkboxPainter;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static LoginCredentials createLoginCredentials(String identifier, boolean alternateType, int guard, String password) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          long var4_long = 0L;
          if (guard != 24564) {
            field_F = (ModalStack) null;
          }
          Object var6 = null;
          if (identifier.indexOf('@') == -1) {
            CharSequence var7 = (CharSequence) ((Object) identifier);
            var4_long = RasterBuffer.encodeBase37Name((byte) 88, var7);
          } else {
            var6 = identifier;
          }
          LoginCredentials stackIn_6_0 = SavedDataQuery.createCredentials(0, alternateType, var4_long, (String) (var6), password);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bo.C(");
          if (identifier == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(alternateType).append(',').append(guard).append(',');
          if (password == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void detachCanvasInput(java.awt.Canvas canvas, byte guard) {
        String stackIn_6_2 = null;
        try {
          DialWidgetPainter.detachKeyboardInput((byte) -58, (java.awt.Component) ((Object) canvas));
          int var2_int = 120 / ((guard - 54) / 57);
          SelfDestructEffects.detachMouseInput((java.awt.Component) ((Object) canvas), (byte) 9);
          if (null == ArchiveFactorySupport.field_b) {
            return;
          }
          ArchiveFactorySupport.field_b.detach(-5070, (java.awt.Component) ((Object) canvas));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var2;
          StringBuilder stackIn_5_1 = new StringBuilder().append("bo.D(");
          if (canvas == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(guard).append(')').toString());
        }
    }

    Checkbox(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.selected = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean readIncomingBytes(int guard, int requiredBytes) {
        try {
          if (guard != 30000) {
            return false;
          }
          if (requiredBytes <= QuickChatDynamicCommand.incomingPackets.position) {
            return true;
          }
          if (null == TextLayout.field_c) {
            return false;
          }
          try {
            int var2_int = TextLayout.field_c.available(-124);
            if (var2_int <= 0) {
              if (0 > var2_int) {
                ConnectionSupport.closeTransport(16);
                return false;
              }
              if (PasswordFieldPainter.millisecondsSinceLastReceive(guard + 34655) <= 30000L) {
                return false;
              }
              ConnectionSupport.closeTransport(16);
              return false;
            }
            if (var2_int > requiredBytes - QuickChatDynamicCommand.incomingPackets.position) {
              var2_int = requiredBytes - QuickChatDynamicCommand.incomingPackets.position;
            }
            TextLayout.field_c.readFully(QuickChatDynamicCommand.incomingPackets.position, var2_int, QuickChatDynamicCommand.incomingPackets.payload, (byte) -49);
            ChatMessageDecoder.field_a = MonotonicClockSupport.monotonicMillis(128);
            QuickChatDynamicCommand.incomingPackets.position = QuickChatDynamicCommand.incomingPackets.position + var2_int;
            if (requiredBytes > QuickChatDynamicCommand.incomingPackets.position) {
              return false;
            }
            QuickChatDynamicCommand.incomingPackets.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
            ConnectionSupport.closeTransport(16);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = 1;
        field_D = "From Level";
        field_G = new byte[520];
    }
}
