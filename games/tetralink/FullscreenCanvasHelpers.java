/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class FullscreenCanvasHelpers extends IntrusiveNode {
    static int field_q;
    int field_t;
    static String field_s;
    int field_r;
    static int field_n;
    static int field_p;
    static String field_o;

    public static void releaseStatics(byte param0) {
        if (param0 < 57) {
          return;
        }
        field_s = null;
        field_o = null;
    }

    final static FullscreenFocusCanvas createFullscreenCanvas(int param0, int param1, int param2, int param3, int param4, PlatformTaskDispatcher param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        java.awt.Frame var8 = null;
        FullscreenFocusCanvas stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = SectorCacheStore.openFullscreenFrame(param2, param5, 10, param3, param4, param0);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var7.field_d = var8;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, param1, param3, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private FullscreenCanvasHelpers() throws Throwable {
        throw new Error();
    }

    final static void closeArchiveConnections(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          IOException var2_ref = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          var3 = TetraLink.field_J;
          try {
            if (null != Renderable.field_e) {
              Renderable.field_e.closeConnection((byte) 80);
            }
            if (null != FullscreenErrorDialog.field_X) {
              FullscreenErrorDialog.field_X.shutdown(-23641);
            }
            if (null != PatchNoteUsage.field_r) {
              try {
                PatchNoteUsage.field_r.close(param0 ^ 25675);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (param0 != -25676) {
              field_s = (String) null;
            }
            if (null != TransitionPhase.field_b) {
              for (var1_int = 0; var1_int < TransitionPhase.field_b.length; var1_int++) {
                if (TransitionPhase.field_b[var1_int] != null) {
                  try {
                    TransitionPhase.field_b[var1_int].close(-1);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "bm.D(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void checkComplementGuard(int param0, int param1) {
        if (~param1 != param0) {
          throw new IllegalArgumentException();
        }
    }

    static {
        field_o = "Name";
    }
}
