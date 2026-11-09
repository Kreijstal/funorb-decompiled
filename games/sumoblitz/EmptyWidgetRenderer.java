/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class EmptyWidgetRenderer implements WidgetRenderer {
    static String field_b;
    static int field_d;
    static PlatformTask field_a;
    static int[] field_c;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        try {
          if (guard != 5592405) {
            field_a = (PlatformTask) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tm.A(" + (widget != null ? "{...}" : "null") + ',' + parentY + ',' + guard + ',' + isEnabled + ',' + parentX + ')');
        }
    }

    final static void a(boolean param0, byte param1, PlatformTaskDispatcher param2, int param3, int param4, int param5, int param6, int param7, int param8, String param9, boolean param10, int param11, int param12, long param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ig.field_a = new IsaacPacketBuffer(param3);
            InwardSparkParticle.field_v = new IsaacPacketBuffer(param8);
            CacheIoRequest.field_v = param5;
            vp.field_a = param7;
            jm.field_b = param13;
            ScrollPane.field_C = param9;
            CacheReferenceNode.field_t = param2;
            qn.field_a = param10;
            if (param1 != 84) {
              return;
            }
            TextHotspot.field_o = param12;
            MidiNoteMixer.field_p = param6;
            gn.field_d = param0;
            LoginCredentialType.field_b = param4;
            CacheReferenceNode.field_r = param11;
            if (null == CacheReferenceNode.field_t.field_n) {
              return;
            }
            try {
              NameSuggestionsPanel.field_E = new BufferedCacheFile(CacheReferenceNode.field_t.field_n, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("tm.D(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        BufferedSocket.field_p = null;
        InstrumentNoteMask.field_n = null;
        cd.field_d = 0;
        int var2 = SingleChildWidget.field_x;
        SingleChildWidget.field_x = RasterStateFrame.field_q;
        RasterStateFrame.field_q = var2;
        if (param0 == 51) {
          jk.field_b.failureCode = 2;
          jk.field_b.failureCount = jk.field_b.failureCount + 1;
          if (jk.field_b.failureCount < 2) {
            if (jk.field_b.failureCount >= 2) {
              if (50 == param0) {
                return 5;
              }
              if (jk.field_b.failureCount >= 4) {
                return 1;
              }
              if (param1 < -80) {
                return -1;
              }
              return 65;
            }
            if (jk.field_b.failureCount >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          if (param0 != 51) {
            if (jk.field_b.failureCount >= 2) {
              if (50 != param0) {
                if (jk.field_b.failureCount >= 4) {
                  return 1;
                }
                if (param1 >= -80) {
                  return 65;
                }
                return -1;
              }
              return 5;
            }
            if (jk.field_b.failureCount >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          return 2;
        }
        if (param0 != 50) {
          jk.field_b.failureCode = 1;
          jk.field_b.failureCount = jk.field_b.failureCount + 1;
          if (jk.field_b.failureCount >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (jk.field_b.failureCount >= 2) {
            if (50 != param0) {
              if (jk.field_b.failureCount >= 4) {
                return 1;
              }
              if (param1 >= -80) {
                return 65;
              }
              return -1;
            }
            return 5;
          }
          if (jk.field_b.failureCount >= 4) {
            return 1;
          }
          if (param1 >= -80) {
            return 65;
          }
          return -1;
        }
        jk.field_b.failureCode = 5;
        jk.field_b.failureCount = jk.field_b.failureCount + 1;
        if (jk.field_b.failureCount >= 2 &&
          param0 == 51) {
          return 2;
        }
        if (jk.field_b.failureCount >= 2) {
          if (50 != param0) {
            if (jk.field_b.failureCount >= 4) {
              return 1;
            }
            if (param1 >= -80) {
              return 65;
            }
            return -1;
          }
          return 5;
        }
        if (jk.field_b.failureCount >= 4) {
          return 1;
        }
        if (param1 >= -80) {
          return 65;
        }
        return -1;
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Just play";
        field_d = -1;
    }
}
