/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends IntrusiveNode {
    static String field_f;
    int field_g;
    static Sprite widgetSprite;
    static ResourceArchive field_i;
    static boolean connectivityDirty;
    int field_k;

    public static void b(int param0) {
        if (param0 != 127) {
            return;
        }
        field_f = null;
        widgetSprite = null;
        field_i = null;
    }

    final static void b(int param0, int param1) {
        PacketBuffer var2 = fj.field_q;
        var2.writeCipherByte(param1, (byte) -66);
        var2.writeByte((byte) 124, 1);
        var2.writeByte((byte) 127, 2);
        if (param0 >= -65) {
            re.b(116, -127);
        }
    }

    final static void updateKeyboardStateForFrame(boolean methodGuard) {
        Object keyboardMonitor = null;
        int keyStateChangeOrResetIndex = 0;
        int clientControlFlowGuard = 0;
        Throwable caughtKeyboardFrameFailure = null;
        RuntimeException keyboardFrameFailureForContext = null;
        int resetKeyIndex = 0;
        clientControlFlowGuard = Geoblox.field_C;
        try {
          keyboardMonitor = je.keyboardListener;
          synchronized (keyboardMonitor) {
            if (!methodGuard) {
              field_f = (String) null;
            }
            L2: {
              vd.keyboardEventReadIndex = pc.keyboardEventFrameEndIndex;
              nk.keyboardIdleTicks = nk.keyboardIdleTicks + 1;
              if (ii.keyStateWriteIndexOrResetSentinel < 0) {
                resetKeyIndex = 0;
                keyStateChangeOrResetIndex = resetKeyIndex;
                while (resetKeyIndex < 112) {
                  kj.heldInternalKeys[resetKeyIndex] = false;
                  resetKeyIndex++;
                }
                ii.keyStateWriteIndexOrResetSentinel = gk.keyStateReadIndex;
                break L2;
              }
              while (gk.keyStateReadIndex != ii.keyStateWriteIndexOrResetSentinel) {
                keyStateChangeOrResetIndex = gf.queuedKeyStateChanges[gk.keyStateReadIndex];
                gk.keyStateReadIndex = 1 + gk.keyStateReadIndex & 127;
                if (keyStateChangeOrResetIndex < 0) {
                  kj.heldInternalKeys[~keyStateChangeOrResetIndex] = false;
                  continue;
                }
                kj.heldInternalKeys[keyStateChangeOrResetIndex] = true;
              }
              break L2;
            }
            pc.keyboardEventFrameEndIndex = BufferedSocket.keyEventWriteIndex;
          }
          return;
        } catch (java.lang.RuntimeException keyboardFrameFailure) {
          caughtKeyboardFrameFailure = keyboardFrameFailure;
          keyboardFrameFailureForContext = (RuntimeException) (Object) caughtKeyboardFrameFailure;
          throw t.a((Throwable) ((Object) keyboardFrameFailureForContext), "re.C(" + methodGuard + ')');
        }
    }

    private re() throws Throwable {
        throw new Error();
    }

    static {
    }
}
