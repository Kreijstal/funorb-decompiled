/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends com.ms.dll.Callback {
    private volatile int field_c;
    private volatile int field_a;
    private int field_d;
    private boolean field_b;
    private volatile boolean field_e;

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
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var9 = null;
          var5 = var9.getTopHwnd();
          if (var5 != ((uk) this).field_a) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = param2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((uk) this).field_e) {
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
        L2: {
          if (((uk) this).field_b) {
            break L2;
          } else {
            ((uk) this).field_d = com.ms.win32.User32.LoadCursor(0, 32512);
            int discarded$13 = com.ms.dll.Root.alloc(this);
            ((uk) this).field_b = true;
            break L2;
          }
        }
        if (var5 != ((uk) this).field_a) {
          L3: {
            if (0 == ((uk) this).field_a) {
              break L3;
            } else {
              ((uk) this).field_e = true;
              int discarded$14 = com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
              var6 = this;
              synchronized (var6) {
                L4: {
                  int discarded$15 = com.ms.win32.User32.SetWindowLong(((uk) this).field_a, -4, ((uk) this).field_c);
                  break L4;
                }
              }
              break L3;
            }
          }
          var6 = this;
          synchronized (var6) {
            L5: {
              ((uk) this).field_a = var5;
              ((uk) this).field_c = com.ms.win32.User32.SetWindowLong(((uk) this).field_a, -4, this);
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = this;
            stackIn_23_0 = stackOut_21_0;
            stackIn_22_0 = stackOut_21_0;
            if (!param2) {
              stackOut_23_0 = this;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L6;
            } else {
              stackOut_22_0 = this;
              stackOut_22_1 = 1;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              break L6;
            }
          }
          ((uk) this).field_e = stackIn_24_1 != 0;
          int discarded$16 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
          return;
        } else {
          L7: {
            stackOut_9_0 = this;
            stackIn_11_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (!param2) {
              stackOut_11_0 = this;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L7;
            } else {
              stackOut_10_0 = this;
              stackOut_10_1 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              break L7;
            }
          }
          ((uk) this).field_e = stackIn_12_1 != 0;
          int discarded$17 = com.ms.win32.User32.SendMessage(var5, 101024, 0, param1);
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
        if (param0 != ((uk) this).field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        } else {
          if (param1 == 32) {
            var5 = 65535 & param3;
            if (1 != var5) {
              if (101024 == param1) {
                L0: {
                  if (!((uk) this).field_e) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    stackOut_22_0 = ((uk) this).field_d;
                    stackIn_24_0 = stackOut_22_0;
                    break L0;
                  }
                }
                int discarded$3 = com.ms.win32.User32.SetCursor(stackIn_24_0);
                return 0;
              } else {
                if (param1 == 1) {
                  ((uk) this).field_a = 0;
                  ((uk) this).field_e = true;
                  return com.ms.win32.User32.CallWindowProc(((uk) this).field_c, param0, param1, param2, param3);
                } else {
                  return com.ms.win32.User32.CallWindowProc(((uk) this).field_c, param0, param1, param2, param3);
                }
              }
            } else {
              L1: {
                if (((uk) this).field_e) {
                  stackOut_17_0 = ((uk) this).field_d;
                  stackIn_18_0 = stackOut_17_0;
                  break L1;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L1;
                }
              }
              int discarded$4 = com.ms.win32.User32.SetCursor(stackIn_18_0);
              return 0;
            }
          } else {
            if (101024 == param1) {
              L2: {
                if (!((uk) this).field_e) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ((uk) this).field_d;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              int discarded$5 = com.ms.win32.User32.SetCursor(stackIn_9_0);
              return 0;
            } else {
              if (param1 == 1) {
                ((uk) this).field_a = 0;
                ((uk) this).field_e = true;
                return com.ms.win32.User32.CallWindowProc(((uk) this).field_c, param0, param1, param2, param3);
              } else {
                return com.ms.win32.User32.CallWindowProc(((uk) this).field_c, param0, param1, param2, param3);
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$5 = com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -4) {
            ((uk) this).field_b = true;
        }
    }

    uk() {
        ((uk) this).field_e = true;
    }
}
