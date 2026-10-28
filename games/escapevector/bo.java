/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bo extends TextButton {
    static tb field_F;
    static int field_E;
    static String field_D;
    static int[] field_H;
    static byte[] field_G;

    final void notifyAction(int guard, int localY, int localX, int buttonCode) {
        this.field_z = !this.field_z ? true : false;
        if (guard == -19646) {
          super.notifyAction(guard ^ 0, localY, localX, buttonCode);
          return;
        }
        java.awt.Canvas var6 = (java.awt.Canvas) null;
        bo.a((java.awt.Canvas) null, (byte) 126);
        super.notifyAction(guard ^ 0, localY, localX, buttonCode);
    }

    private bo(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.painter = mb.field_g.field_k;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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

    private bo(String param0, UiListener param1) {
        this(param0, mb.field_g.field_o, param1);
        try {
          this.painter = mb.field_g.field_k;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static vj a(String param0, boolean param1, int param2, String param3) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          long var4_long = 0L;
          if (param2 != 24564) {
            field_F = (tb) null;
          }
          Object var6 = null;
          if (param0.indexOf('@') == -1) {
            CharSequence var7 = (CharSequence) ((Object) param0);
            var4_long = RasterBuffer.a((byte) 88, var7);
          } else {
            var6 = param0;
          }
          vj stackIn_6_0 = ei.a(0, param1, var4_long, (String) (var6), param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bo.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        String stackIn_6_2 = null;
        try {
          DialWidgetPainter.detachKeyboardInput((byte) -58, (java.awt.Component) ((Object) param0));
          int var2_int = 120 / ((param1 - 54) / 57);
          SelfDestructEffects.a((java.awt.Component) ((Object) param0), (byte) 9);
          if (null == ji.field_b) {
            return;
          }
          ji.field_b.detach(-5070, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var2;
          StringBuilder stackIn_5_1 = new StringBuilder().append("bo.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    bo(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          if (param0 != 30000) {
            return false;
          }
          if (param1 <= QuickChatDynamicCommand.incomingPackets.position) {
            return true;
          }
          if (null == TextLayout.field_c) {
            return false;
          }
          try {
            int var2_int = TextLayout.field_c.b(-124);
            if (var2_int <= 0) {
              if (0 > var2_int) {
                nm.a(16);
                return false;
              }
              if (un.e(param0 + 34655) <= 30000L) {
                return false;
              }
              nm.a(16);
              return false;
            }
            if (var2_int > param1 - QuickChatDynamicCommand.incomingPackets.position) {
              var2_int = param1 - QuickChatDynamicCommand.incomingPackets.position;
            }
            TextLayout.field_c.a(QuickChatDynamicCommand.incomingPackets.position, var2_int, QuickChatDynamicCommand.incomingPackets.payload, (byte) -49);
            sl.field_a = td.b(128);
            QuickChatDynamicCommand.incomingPackets.position = QuickChatDynamicCommand.incomingPackets.position + var2_int;
            if (param1 > QuickChatDynamicCommand.incomingPackets.position) {
              return false;
            }
            QuickChatDynamicCommand.incomingPackets.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            IOException var2 = (IOException) (Object) decompiledCaughtException;
            nm.a(16);
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
