/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private int field_b;
    private boolean field_d;
    private volatile int field_e;

    final void a(java.awt.Component param0, byte param1, boolean param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (var5 != ((pq) this).field_e) {
            break L0;
          } else {
            L1: {
              if (param2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = stackIn_4_0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((pq) this).field_c) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            if (stackIn_7_0 != stackIn_7_1) {
              break L0;
            } else {
              return;
            }
          }
        }
        L3: {
          if (((pq) this).field_d) {
            break L3;
          } else {
            ((pq) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$6 = com.ms.dll.Root.alloc(this);
            ((pq) this).field_d = true;
            break L3;
          }
        }
        L4: {
          if (param1 < -23) {
            break L4;
          } else {
            int discarded$7 = ((pq) this).callback(-85, 14, 75, 9);
            break L4;
          }
        }
        if (((pq) this).field_e != var5) {
          L5: {
            if (((pq) this).field_e != 0) {
              ((pq) this).field_c = true;
              int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$9 = com.ms.win32.User32.SetWindowLong(((pq) this).field_e, -4, ((pq) this).field_a);
                  break L6;
                }
              }
              break L5;
            } else {
              break L5;
            }
          }
          var6 = this;
          synchronized (var6) {
            L7: {
              ((pq) this).field_e = var5;
              ((pq) this).field_a = com.ms.win32.User32.SetWindowLong(((pq) this).field_e, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = this;
            stackIn_29_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (!param2) {
              stackOut_29_0 = this;
              stackOut_29_1 = 0;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              break L8;
            } else {
              stackOut_28_0 = this;
              stackOut_28_1 = 1;
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              break L8;
            }
          }
          ((pq) this).field_c = stackIn_30_1 != 0;
          int discarded$10 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L9: {
            stackOut_14_0 = this;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param2) {
              stackOut_16_0 = this;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L9;
            } else {
              stackOut_15_0 = this;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L9;
            }
          }
          ((pq) this).field_c = stackIn_17_1 != 0;
          int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 9537) {
            ((pq) this).field_e = 62;
            boolean discarded$0 = com.ms.win32.User32.SetCursorPos(param1, param0);
            return;
        }
        boolean discarded$1 = com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (((pq) this).field_e == param0) {
          if (param1 != 32) {
            if (101024 != param1) {
              if (1 == param1) {
                ((pq) this).field_e = 0;
                ((pq) this).field_c = true;
                return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
              }
            } else {
              L0: {
                if (!((pq) this).field_c) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = ((pq) this).field_b;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_21_0);
              return 0;
            }
          } else {
            var5 = param3 & 65535;
            if (var5 != 1) {
              if (101024 != param1) {
                if (1 == param1) {
                  ((pq) this).field_e = 0;
                  ((pq) this).field_c = true;
                  return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((pq) this).field_a, param0, param1, param2, param3);
                }
              } else {
                L1: {
                  if (!((pq) this).field_c) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  } else {
                    stackOut_10_0 = ((pq) this).field_b;
                    stackIn_12_0 = stackOut_10_0;
                    break L1;
                  }
                }
                int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_12_0);
                return 0;
              }
            } else {
              L2: {
                if (!((pq) this).field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ((pq) this).field_b;
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

    pq() {
        ((pq) this).field_c = true;
    }
}
