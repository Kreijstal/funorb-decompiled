/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends com.ms.dll.Callback {
    private volatile boolean field_a;
    private int field_d;
    private volatile int field_e;
    private volatile int field_b;
    private boolean field_c;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (~param0 == ~((cp) this).field_b) {
          if (param1 == 32) {
            var5 = param3 & 65535;
            if (1 != var5) {
              if (param1 != 101024) {
                if (param1 != 1) {
                  return com.ms.win32.User32.CallWindowProc(((cp) this).field_e, param0, param1, param2, param3);
                } else {
                  ((cp) this).field_b = 0;
                  ((cp) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((cp) this).field_e, param0, param1, param2, param3);
                }
              } else {
                L0: {
                  if (((cp) this).field_a) {
                    stackOut_19_0 = ((cp) this).field_d;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_20_0 = stackOut_18_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_20_0);
                return 0;
              }
            } else {
              L1: {
                if (((cp) this).field_a) {
                  stackOut_14_0 = ((cp) this).field_d;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_15_0);
              return 0;
            }
          } else {
            if (param1 != 101024) {
              if (param1 != 1) {
                return com.ms.win32.User32.CallWindowProc(((cp) this).field_e, param0, param1, param2, param3);
              } else {
                ((cp) this).field_b = 0;
                ((cp) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((cp) this).field_e, param0, param1, param2, param3);
              }
            } else {
              L2: {
                if (((cp) this).field_a) {
                  stackOut_6_0 = ((cp) this).field_d;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_7_0);
              return 0;
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        if (!param2) {
          L0: {
            var9 = null;
            var5 = var9.getTopHwnd();
            if (var5 != ((cp) this).field_b) {
              break L0;
            } else {
              L1: {
                stackOut_3_0 = ((cp) this).field_a;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1) {
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
              if ((stackIn_6_0 ? 1 : 0) == stackIn_6_1) {
                break L0;
              } else {
                return;
              }
            }
          }
          L2: {
            if (((cp) this).field_c) {
              break L2;
            } else {
              ((cp) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$13 = com.ms.dll.Root.alloc(this);
              ((cp) this).field_c = true;
              break L2;
            }
          }
          if (((cp) this).field_b == var5) {
            L3: {
              stackOut_25_0 = this;
              stackIn_27_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param1) {
                stackOut_27_0 = this;
                stackOut_27_1 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                break L3;
              } else {
                stackOut_26_0 = this;
                stackOut_26_1 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                break L3;
              }
            }
            ((cp) this).field_a = stackIn_28_1 != 0;
            int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L4: {
              if (((cp) this).field_b == 0) {
                break L4;
              } else {
                ((cp) this).field_a = true;
                int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    int discarded$16 = com.ms.win32.User32.SetWindowLong(((cp) this).field_b, -4, ((cp) this).field_e);
                    break L5;
                  }
                }
                break L4;
              }
            }
            var6 = this;
            synchronized (var6) {
              L6: {
                ((cp) this).field_b = var5;
                ((cp) this).field_e = com.ms.win32.User32.SetWindowLong(((cp) this).field_b, -4, this);
                break L6;
              }
            }
            L7: {
              stackOut_19_0 = this;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param1) {
                stackOut_21_0 = this;
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L7;
              } else {
                stackOut_20_0 = this;
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L7;
              }
            }
            ((cp) this).field_a = stackIn_22_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    cp() {
        ((cp) this).field_a = true;
    }

    final void a(int param0, int param1, byte param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 <= 98) {
            int discarded$5 = ((cp) this).callback(-91, 12, 96, -5);
        }
    }
}
