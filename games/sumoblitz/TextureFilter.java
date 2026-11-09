/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TextureFilter {
    static String abcdefghijklmnopqrstuvwxyzabcdefghijText;
    static String useThisAlternativeAsText;

    final static int a(boolean param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (4 <= jk.field_b.failureCount) {
            if (jk.field_b.failureCode == -1) {
              return 3;
            }
            if (jk.field_b.failureCode == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (FullscreenDisplayMode.field_d == 0) {
              BufferedSocket.field_p = CompactMeshGeometry.field_u.a((byte) 51, Js5Client.field_a, SingleChildWidget.field_x);
              FullscreenDisplayMode.field_d = FullscreenDisplayMode.field_d + 1;
            }
            if (!param0) {
              useThisAlternativeAsText = (String) null;
            }
            if (FullscreenDisplayMode.field_d == 1) {
              if (BufferedSocket.field_p.status == 2) {
                stackIn_16_0 = EmptyWidgetRenderer.a(-1, -84);
                return stackIn_16_0;
              }
              if (BufferedSocket.field_p.status == 1) {
                FullscreenDisplayMode.field_d = FullscreenDisplayMode.field_d + 1;
              }
            }
            if (FullscreenDisplayMode.field_d == 2) {
              InstrumentNoteMask.field_n = new BufferedSocket((java.net.Socket) (BufferedSocket.field_p.result), CompactMeshGeometry.field_u);
              var2 = new PacketBuffer(13);
              sb.a(HuffmanDecoder.field_e, 127, bt.field_d, ReflectionCheck.field_l, var2);
              var2.writeByte((byte) 127, 15);
              var2.writeInt(48, ValidatedTextInputWidget.field_P);
              InstrumentNoteMask.field_n.write(0, -2, var2.payload, 13);
              FullscreenDisplayMode.field_d = FullscreenDisplayMode.field_d + 1;
              ShrinkingRingEffect.field_s = wq.monotonicTimeMillis(-109) + 30000L;
            }
            if (FullscreenDisplayMode.field_d == 3) {
              if (InstrumentNoteMask.field_n.available(-91) > 0) {
                var1_int = InstrumentNoteMask.field_n.readByte(-106);
                if (var1_int != 0) {
                  stackIn_30_0 = EmptyWidgetRenderer.a(var1_int, -93);
                  return stackIn_30_0;
                }
                FullscreenDisplayMode.field_d = FullscreenDisplayMode.field_d + 1;
              } else {
                if (wq.monotonicTimeMillis(-52) > ShrinkingRingEffect.field_s) {
                  stackIn_27_0 = EmptyWidgetRenderer.a(-2, -89);
                  return stackIn_27_0;
                }
              }
            }
            if (FullscreenDisplayMode.field_d != 4) {
              return -1;
            }
            jk.field_b.attachConnection(LegacyOpenGlAssemblyProgram.field_e, (byte) 114, InstrumentNoteMask.field_n);
            BufferedSocket.field_p = null;
            InstrumentNoteMask.field_n = null;
            FullscreenDisplayMode.field_d = 0;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return EmptyWidgetRenderer.a(-3, -94);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_8_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Sumoblitz.field_L ? 1 : 0;
          try {
            try {
              var3 = (String) (BrowserScriptBridge.call(param0, -32, "getcookies"));
              var4 = SocialContact.split(';', var3, -27224);
              if (param1 != -57) {
                TextureFilter.releaseStatics(-92);
              }
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("ji.B(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
          }
          if (param1 <= 61) {
            useThisAlternativeAsText = (String) null;
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        abcdefghijklmnopqrstuvwxyzabcdefghijText = null;
        if (param0 != 0) {
          return;
        }
        useThisAlternativeAsText = null;
    }

    static {
        useThisAlternativeAsText = "Use this alternative as your account name";
        abcdefghijklmnopqrstuvwxyzabcdefghijText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
