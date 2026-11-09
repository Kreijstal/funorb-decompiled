/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class StrongCacheReference extends CacheReferenceNode {
    private Object value;
    static BlendMode NO_BLEND;
    static int[] field_C;

    final static void a(PacketBuffer param0, boolean param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = Sumoblitz.field_L ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (null != NameSuggestionsPanel.field_E) {
              try {
                NameSuggestionsPanel.field_E.seek(-7564, 0L);
                NameSuggestionsPanel.field_E.readFully(var6, (byte) 124);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; 24 > var4; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            if (!param1) {
              field_C = (int[]) null;
            }
            param0.writeBytes(var2, (byte) -123, 24, 0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = runtimeException;
            stackIn_20_1 = new StringBuilder().append("av.H(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isSoftReference(int param0) {
        int var2 = -48 % ((14 - param0) / 51);
        return false;
    }

    final static void switchMenuScreen(int param0, boolean param1, int param2) {
        MenuFadeState.transitionTicks = 0;
        OpenGlCubeTexture.field_k = param2;
        if (param0 != -7753) {
          field_C = (int[]) null;
        }
        if (!(0 > OpenGlCubeTexture.field_k)) {
          LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].resetSelection(param0 - 875, param1);
        }
        if (0 == OpenGlCubeTexture.field_k &&
          7 != RendererPreference.field_b) {
          TextLayout.a(0, 0);
        }
    }

    StrongCacheReference(Object param0, int param1) {
        super(param1);
        try {
          this.value = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "av.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_C = null;
        NO_BLEND = null;
        if (param0 != 24) {
          StrongCacheReference.releaseStatics(30);
        }
    }

    final Object getValue(byte param0) {
        int var2 = -15 % ((37 - param0) / 58);
        return this.value;
    }

    static {
        NO_BLEND = new BlendMode();
    }
}
