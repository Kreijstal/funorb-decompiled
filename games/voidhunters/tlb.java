/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tlb extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private boolean field_d;
    private int field_e;
    private volatile int field_b;
    private volatile int field_a;

    final void a(int param0, int param1, byte param2) {
        boolean discarded$4 = com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2 >= -30) {
            ((tlb) this).field_d = true;
        }
    }

    final void a(java.awt.Component param0, int param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
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
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (var5 != ((tlb) this).field_b) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = ((tlb) this).field_c;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param2) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        if (param1 == -4) {
          L2: {
            if (((tlb) this).field_d) {
              break L2;
            } else {
              ((tlb) this).field_e = com.ms.win32.User32.LoadCursor(0, 32512);
              int discarded$13 = com.ms.dll.Root.alloc(this);
              ((tlb) this).field_d = true;
              break L2;
            }
          }
          if (var5 == ((tlb) this).field_b) {
            L3: {
              stackOut_25_0 = this;
              stackIn_27_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (!param2) {
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
            ((tlb) this).field_c = stackIn_28_1 != 0;
            int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          } else {
            L4: {
              if (((tlb) this).field_b == 0) {
                break L4;
              } else {
                ((tlb) this).field_c = true;
                int discarded$15 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
                var6 = this;
                synchronized (var6) {
                  L5: {
                    int discarded$16 = com.ms.win32.User32.SetWindowLong(((tlb) this).field_b, -4, ((tlb) this).field_a);
                    break L5;
                  }
                }
                break L4;
              }
            }
            var6 = this;
            synchronized (var6) {
              L6: {
                ((tlb) this).field_b = var5;
                ((tlb) this).field_a = com.ms.win32.User32.SetWindowLong(((tlb) this).field_b, -4, this);
                break L6;
              }
            }
            L7: {
              stackOut_19_0 = this;
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param2) {
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
            ((tlb) this).field_c = stackIn_22_1 != 0;
            int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 != ((tlb) this).field_b) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (var5 != 1) {
              if (param1 == 101024) {
                L0: {
                  if (!((tlb) this).field_c) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((tlb) this).field_e;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (1 == param1) {
                  ((tlb) this).field_b = 0;
                  ((tlb) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((tlb) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((tlb) this).field_a, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!((tlb) this).field_c) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = ((tlb) this).field_e;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (!((tlb) this).field_c) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((tlb) this).field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (1 == param1) {
                ((tlb) this).field_b = 0;
                ((tlb) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((tlb) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((tlb) this).field_a, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    tlb() {
        ((tlb) this).field_c = true;
    }
}
