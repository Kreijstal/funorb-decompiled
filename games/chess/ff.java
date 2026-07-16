/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_c;
    private volatile int field_e;
    private volatile boolean field_a;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (((ff) this).field_e == param0) {
          if (32 == param1) {
            var5 = param3 & 65535;
            if (-2 != (var5 ^ -1)) {
              if (param1 == 101024) {
                L0: {
                  if (((ff) this).field_a) {
                    stackOut_22_0 = ((ff) this).field_b;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_23_0);
                return 0;
              } else {
                if (1 == param1) {
                  ((ff) this).field_e = 0;
                  ((ff) this).field_a = true;
                  return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (!((ff) this).field_a) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L1;
                } else {
                  stackOut_15_0 = ((ff) this).field_b;
                  stackIn_17_0 = stackOut_15_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_17_0);
              return 0;
            }
          } else {
            if (param1 == 101024) {
              L2: {
                if (((ff) this).field_a) {
                  stackOut_7_0 = ((ff) this).field_b;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_8_0);
              return 0;
            } else {
              if (1 == param1) {
                ((ff) this).field_e = 0;
                ((ff) this).field_a = true;
                return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((ff) this).field_d, param0, param1, param2, param3);
              }
            }
          }
        } else {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (var5 != ((ff) this).field_e) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((ff) this).field_a) {
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
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param0 == 29783) {
            break L2;
          } else {
            int discarded$6 = ((ff) this).callback(-4, -87, -50, -103);
            break L2;
          }
        }
        L3: {
          if (((ff) this).field_c) {
            break L3;
          } else {
            ((ff) this).field_b = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$7 = com.ms.dll.Root.alloc(this);
            ((ff) this).field_c = true;
            break L3;
          }
        }
        if (var5 == ((ff) this).field_e) {
          L4: {
            stackOut_27_0 = this;
            stackIn_29_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (!param1) {
              stackOut_29_0 = this;
              stackOut_29_1 = 0;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              break L4;
            } else {
              stackOut_28_0 = this;
              stackOut_28_1 = 1;
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              break L4;
            }
          }
          ((ff) this).field_a = stackIn_30_1 != 0;
          int discarded$8 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        } else {
          L5: {
            if (((ff) this).field_e != 0) {
              ((ff) this).field_a = true;
              int discarded$9 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L6: {
                  int discarded$10 = com.ms.win32.User32.SetWindowLong(((ff) this).field_e, -4, ((ff) this).field_d);
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
              ((ff) this).field_e = var5;
              ((ff) this).field_d = com.ms.win32.User32.SetWindowLong(((ff) this).field_e, -4, this);
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = this;
            stackIn_23_0 = stackOut_21_0;
            stackIn_22_0 = stackOut_21_0;
            if (!param1) {
              stackOut_23_0 = this;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L8;
            } else {
              stackOut_22_0 = this;
              stackOut_22_1 = 1;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              break L8;
            }
          }
          ((ff) this).field_a = stackIn_24_1 != 0;
          int discarded$11 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != 0) {
            Object var5 = null;
            ((ff) this).a(-91, false, (java.awt.Component) null);
        }
    }

    ff() {
        ((ff) this).field_a = true;
    }
}
