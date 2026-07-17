/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends com.ms.dll.Callback {
    private volatile int field_c;
    private int field_b;
    private volatile boolean field_a;
    private boolean field_d;
    private volatile int field_e;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (~param0 != ~((me) this).field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (var5 == 1) {
              L0: {
                if (((me) this).field_a) {
                  stackOut_25_0 = ((me) this).field_b;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  stackOut_24_0 = 0;
                  stackIn_26_0 = stackOut_24_0;
                  break L0;
                }
              }
              int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_26_0);
              return 0;
            } else {
              if (param1 == 101024) {
                L1: {
                  if (((me) this).field_a) {
                    stackOut_18_0 = ((me) this).field_b;
                    stackIn_19_0 = stackOut_18_0;
                    break L1;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L1;
                  }
                }
                int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_19_0);
                return 0;
              } else {
                if (param1 != 1) {
                  return com.ms.win32.User32.CallWindowProc(((me) this).field_e, param0, param1, param2, param3);
                } else {
                  ((me) this).field_c = 0;
                  ((me) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((me) this).field_e, param0, param1, param2, param3);
                }
              }
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (((me) this).field_a) {
                  stackOut_8_0 = ((me) this).field_b;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (param1 != 1) {
                return com.ms.win32.User32.CallWindowProc(((me) this).field_e, param0, param1, param2, param3);
              } else {
                ((me) this).field_c = 0;
                ((me) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((me) this).field_e, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 90 % ((param1 - -83) / 33);
        boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        if (param2 == 32512) {
          L0: {
            var9 = null;
            var5 = var9.getTopHwnd();
            if (var5 != ((me) this).field_c) {
              break L0;
            } else {
              L1: {
                if (((me) this).field_a) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                stackOut_6_0 = stackIn_6_0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              if (stackIn_9_0 == stackIn_9_1) {
                return;
              } else {
                break L0;
              }
            }
          }
          L3: {
            if (!((me) this).field_d) {
              ((me) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$5 = com.ms.dll.Root.alloc(this);
              ((me) this).field_d = true;
              break L3;
            } else {
              break L3;
            }
          }
          if (var5 != ((me) this).field_c) {
            L4: {
              if (((me) this).field_c != 0) {
                ((me) this).field_a = true;
                int discarded$6 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    int discarded$7 = com.ms.win32.User32.SetWindowLong(((me) this).field_c, -4, ((me) this).field_e);
                    break L5;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            var6 = this;
            synchronized (var6) {
              L6: {
                ((me) this).field_c = var5;
                ((me) this).field_e = com.ms.win32.User32.SetWindowLong(((me) this).field_c, -4, this);
                break L6;
              }
            }
            L7: {
              stackOut_29_0 = this;
              stackIn_31_0 = stackOut_29_0;
              stackIn_30_0 = stackOut_29_0;
              if (!param0) {
                stackOut_31_0 = this;
                stackOut_31_1 = 0;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                break L7;
              } else {
                stackOut_30_0 = this;
                stackOut_30_1 = 1;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                break L7;
              }
            }
            ((me) this).field_a = stackIn_32_1 != 0;
            int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L8: {
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param0) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L8;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L8;
              }
            }
            ((me) this).field_a = stackIn_19_1 != 0;
            int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    me() {
        ((me) this).field_a = true;
    }
}
