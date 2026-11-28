/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandardContentDialog extends ContentTransitionDialog {
    static int field_sb;
    static int field_rb;
    static int field_tb;

    final static boolean j(byte param0) {
        if (!SingleChildWidgetContainer.field_L) {
          return false;
        }
        if (param0 != 78) {
          field_sb = 57;
          if (vk.field_g == 0) {
            return true;
          }
          return false;
        }
        if (vk.field_g == 0) {
          return true;
        }
        return false;
    }

    final static AccountServiceResult pollAccountNameCheck(String param0, boolean param1) {
        RuntimeException var2 = null;
        AccountServiceResult stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_sb = 58;
          }
          if (ci.field_ub == MidiPcmStream.field_A) {
            return null;
          }
          if (MidiPcmStream.field_A == SingleChildWidgetContainer.field_D &&
            param0.equals(BufferedRandomAccessFile.field_e)) {
            MidiPcmStream.field_A = DropTargetWidgetContainer.field_T;
            stackIn_8_0 = MusicPatch.field_j;
            return stackIn_8_0;
          }
          BufferedRandomAccessFile.field_e = param0;
          MusicPatch.field_j = null;
          MidiPcmStream.field_A = ci.field_ub;
          stackIn_10_0 = null;
          return (AccountServiceResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("sb.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        var3 = Chess.field_G;
        try {
          if (-1 == ac.field_k &&
            kj.field_c == -1) {
            ac.field_k = BufferedSocket.field_k;
            kj.field_c = rf.field_b;
          }
          ei.field_u = ei.field_u + 1;
          if (!param1) {
            var4 = (String) null;
            StandardContentDialog.pollAccountNameCheck((String) null, true);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(BoundedRandomAccessFile.field_j));
          } else {
            decompiledFrameRemainder0 = (BoundedRandomAccessFile.field_j == null);
          }
          if (decompiledFrameRemainder0) {
            if (!ChessBoardState.field_e) {
              if (ei.field_u >= be.field_f) {
                stackIn_19_0 = (ei.field_u < sj.field_n + be.field_f) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param0 == null) {
              ei.field_u = 0;
            } else {
              if (ChessBoardState.field_e) {
                ei.field_u = be.field_f;
              } else {
                if (var2_int != 0) {
                  ei.field_u = be.field_f;
                } else {
                  ei.field_u = 0;
                }
              }
            }
            ProgressMessageDialog.field_Db = kj.field_c;
            if (param0 != null) {
              ChessBoardState.field_e = false;
            } else {
              if (var2_int != 0) {
                ChessBoardState.field_e = true;
              }
            }
            ModalDialogHost.field_S = ac.field_k;
          }
          if (!ChessBoardState.field_e &&
            ei.field_u < be.field_f &&
            AlphaWidgetContainer.field_O) {
            ModalDialogHost.field_S = ac.field_k;
            ei.field_u = 0;
            ProgressMessageDialog.field_Db = kj.field_c;
          }
          BoundedRandomAccessFile.field_j = param0;
          if (ChessBoardState.field_e &&
            ei.field_u == ae.field_k) {
            ChessBoardState.field_e = false;
            ei.field_u = 0;
          }
          kj.field_c = -1;
          ac.field_k = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("sb.H(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final void replaceContent(UiWidget param0, int param1) {
        try {
          super.replaceContent(param0, 117);
          if (param1 < 45) {
            field_sb = -34;
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "sb.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0, int param1, int param2) {
        ac.field_k = param2;
        kj.field_c = param1;
        if (param0 != 33) {
          String var4 = (String) null;
          StandardContentDialog.a((String) null, true);
        }
    }

    StandardContentDialog(ModalDialogHost param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_tb = 360;
    }
}
