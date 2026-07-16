/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends com.ms.dll.Callback {
    private volatile int field_d;
    private volatile int field_c;
    private volatile boolean field_b;
    private boolean field_e;
    private int field_a;

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        if (param2 < -19) {
          L0: {
            var9 = null;
            var5 = var9.getTopHwnd();
            if (var5 != ((tb) this).field_c) {
              break L0;
            } else {
              L1: {
                stackOut_3_0 = ((tb) this).field_b;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                return;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!((tb) this).field_e) {
              ((tb) this).field_a = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$14 = com.ms.dll.Root.alloc(this);
              ((tb) this).field_e = true;
              break L2;
            } else {
              break L2;
            }
          }
          if (var5 != ((tb) this).field_c) {
            L3: {
              if (0 != ((tb) this).field_c) {
                ((tb) this).field_b = true;
                int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L4: {
                    int discarded$16 = com.ms.win32.User32.SetWindowLong(((tb) this).field_c, -4, ((tb) this).field_d);
                    break L4;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            var6 = this;
            synchronized (var6) {
              L5: {
                ((tb) this).field_c = var5;
                ((tb) this).field_d = com.ms.win32.User32.SetWindowLong(((tb) this).field_c, -4, this);
                break L5;
              }
            }
            L6: {
              stackOut_26_0 = this;
              stackIn_28_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (!param0) {
                stackOut_28_0 = this;
                stackOut_28_1 = 0;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L6;
              } else {
                stackOut_27_0 = this;
                stackOut_27_1 = 1;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                break L6;
              }
            }
            ((tb) this).field_b = stackIn_29_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L7: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param0) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L7;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L7;
              }
            }
            ((tb) this).field_b = stackIn_16_1 != 0;
            int discarded$18 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param0 != ((tb) this).field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (32 == param1) {
            var5 = 65535 & param3;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (((tb) this).field_b) {
                    stackOut_26_0 = ((tb) this).field_a;
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_27_0 = stackOut_25_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_27_0);
                return 0;
              } else {
                L1: {
                  if (param1 == 1) {
                    ((tb) this).field_c = 0;
                    ((tb) this).field_b = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return com.ms.win32.User32.CallWindowProc(((tb) this).field_d, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((tb) this).field_b) {
                  stackOut_17_0 = ((tb) this).field_a;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L2;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L3: {
                if (((tb) this).field_b) {
                  stackOut_11_0 = ((tb) this).field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_12_0);
              return 0;
            } else {
              L4: {
                if (param1 == 1) {
                  ((tb) this).field_c = 0;
                  ((tb) this).field_b = true;
                  break L4;
                } else {
                  break L4;
                }
              }
              return com.ms.win32.User32.CallWindowProc(((tb) this).field_d, param0, param1, param2, param3);
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 0) {
            Object var5 = null;
            ((tb) this).a(true, (java.awt.Component) null, (byte) 63);
        }
    }

    tb() {
        ((tb) this).field_b = true;
    }
}
