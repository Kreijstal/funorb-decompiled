/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends qt {
    static qp[][][] field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param1 > -11) {
          L0: {
            field_c = 52;
            if (544 != (param0 & 544)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            stackOut_11_0 = stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((param0 & 24) == 0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L1;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L1;
            }
          }
          return (stackIn_14_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (544 != (param0 & 544)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((param0 & 24) == 0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L3;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L3;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    public lg() {
    }

    final void a(ha param0, int param1) {
        ha var5 = null;
        int var6 = 0;
        hr[] var7 = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        wo.a(up.field_c, 360, -5, -16777216, 3, param0, 650, 50, 1, true);
        hc.field_e.a(vq.field_D, -1, -16777216, 150, 320, 0);
        if (param1 != 22707) {
            boolean discarded$0 = lg.a(73, 17, -78);
        }
        int var3 = 70;
        int var4 = 0;
        while (600 > var3) {
            var5 = param0;
            var6 = var3;
            var7 = up.field_c;
            wo.a(var7, 100, var6, 0, 1, var5, 200, 200, 1, true);
            if (var4 == ((lg) this).field_a) {
                be.field_t.a(lb.field_c[var4], -1, -16777216, 258, -4 + (var3 - -100), param1 ^ 22707);
            } else {
                hc.field_e.a(lb.field_c[var4], -1, -16777216, 260, 100 + var3, 0);
            }
            // wide iinc 3 300
            var4++;
        }
    }

    public static void b(int param0) {
        if (param0 != 544) {
            field_c = 80;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = (-70 + ko.field_p) / 300;
        if (param0 > 0) {
          var3 = (pi.field_e - 200) / 100;
          ((lg) this).field_a = var2 + var3 * 2;
          if (((-70 + ko.field_p) % 300 ^ -1) >= -201) {
            if (2 > ((lg) this).field_a) {
              if (hk.field_c != 1) {
                return;
              } else {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((lg) this).field_a = -1;
              if (hk.field_c != 1) {
                return;
              } else {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((lg) this).field_a = -1;
            if (2 > ((lg) this).field_a) {
              if (hk.field_c != 1) {
                return;
              } else {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((lg) this).field_a = -1;
              if (hk.field_c != 1) {
                return;
              } else {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          field_d = null;
          var3 = (pi.field_e - 200) / 100;
          ((lg) this).field_a = var2 + var3 * 2;
          if ((-70 + ko.field_p) % 300 < -201) {
            ((lg) this).field_a = -1;
            if (2 <= ((lg) this).field_a) {
              ((lg) this).field_a = -1;
              if (hk.field_c != 1) {
                return;
              } else {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (hk.field_c == 1) {
                if (0 != (((lg) this).field_a ^ -1)) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (2 > ((lg) this).field_a) {
              if (hk.field_c == 1) {
                if (0 != ((lg) this).field_a) {
                  if (0 != ((lg) this).field_a) {
                    ((lg) this).b((byte) -128);
                    return;
                  } else {
                    ll.c(89);
                    pk.d((byte) -83);
                    ((lg) this).b((byte) -127);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L0: {
                ((lg) this).field_a = -1;
                if (hk.field_c != 1) {
                  break L0;
                } else {
                  if (0 != ((lg) this).field_a) {
                    if (0 != ((lg) this).field_a) {
                      ((lg) this).b((byte) -128);
                      break L0;
                    } else {
                      ll.c(89);
                      pk.d((byte) -83);
                      ((lg) this).b((byte) -127);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qp[6][3][];
        field_c = 0;
    }
}
