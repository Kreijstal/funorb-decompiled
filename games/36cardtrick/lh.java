/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    boolean field_h;
    static li field_d;
    private int field_g;
    private int field_b;
    private int field_e;
    int field_i;
    private int field_j;
    static de field_a;
    int field_k;
    private int field_f;
    static String field_c;

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((lh) this).field_h = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != (((lh) this).field_f ^ -1)) {
              break L2;
            } else {
              if (((lh) this).field_e == 84) {
                break L2;
              } else {
                if (((lh) this).field_e != 83) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void g(int param0) {
        ((lh) this).field_b = 0;
        ((lh) this).field_e = 0;
        if (param0 <= 92) {
            return;
        }
        ((lh) this).field_f = 0;
        if (((lh) this).field_j == 0) {
            ((lh) this).field_e = tb.field_d;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -34) {
            boolean discarded$0 = ((lh) this).d(110);
        }
        return 0 != ((lh) this).field_j ? true : false;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param0 < ((lh) this).field_i) {
          var4 = -73 / ((83 - param1) / 32);
          if (((lh) this).field_i <= param2) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((lh) this).field_b = 0;
              ((lh) this).field_f = 0;
              ((lh) this).field_e = 0;
              if (dl.field_h != 0) {
                ((lh) this).field_g = t.field_k;
                ((lh) this).field_j = dl.field_h;
                ((lh) this).field_h = true;
                ((lh) this).field_k = param2;
                ((lh) this).field_f = dl.field_h;
                ((lh) this).field_b = dl.field_h;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 == ((lh) this).field_j) {
                if (dl.field_h != 0) {
                  break L1;
                } else {
                  if (0 != k.field_c) {
                    break L1;
                  } else {
                    ((lh) this).field_j = 0;
                    break L1;
                  }
                }
              } else {
                if (dl.field_h != 0) {
                  break L1;
                } else {
                  if (0 != k.field_c) {
                    break L1;
                  } else {
                    ((lh) this).field_j = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (0 != ((lh) this).field_j) {
                break L2;
              } else {
                L3: {
                  if (((lh) this).field_h) {
                    break L3;
                  } else {
                    if (d.field_s) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (0 > param0) {
                  if (((lh) this).field_h) {
                    ((lh) this).field_k = -1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L4: {
                    if (((lh) this).field_k != param0) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((lh) this).field_k = param0;
                  ((lh) this).field_h = true;
                  break L2;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void c(byte param0) {
        ((lh) this).field_b = 0;
        ((lh) this).field_f = 0;
        ((lh) this).field_e = 0;
        if (((lh) this).field_j == 0) {
            ((lh) this).field_e = tb.field_d;
        }
        if (((lh) this).field_j == -1) {
            if (-97 == tb.field_d) {
                if (!(((lh) this).field_k > 0)) {
                    ((lh) this).field_k = ((lh) this).field_i;
                }
                ((lh) this).field_k = ((lh) this).field_k - 1;
                ((lh) this).field_h = false;
            }
        }
        if (-1 == (((lh) this).field_j ^ -1)) {
            if (!(97 != tb.field_d)) {
                ((lh) this).field_k = ((lh) this).field_k + 1;
                if (!(((lh) this).field_i > ((lh) this).field_k)) {
                    ((lh) this).field_k = 0;
                }
                ((lh) this).field_h = false;
            }
        }
        if (param0 <= 10) {
            ((lh) this).field_b = 25;
        }
    }

    final boolean b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 2) {
          L0: {
            L1: {
              if ((((lh) this).field_f ^ -1) == -3) {
                break L1;
              } else {
                if ((((lh) this).field_e ^ -1) != -97) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        if (!(0 != ((lh) this).field_j)) {
            ((lh) this).field_h = false;
            ((lh) this).field_k = param1;
        }
        if (param0 != 31973) {
            ((lh) this).field_e = 70;
        }
    }

    final void b(byte param0) {
        ((lh) this).field_e = 0;
        ((lh) this).field_b = 0;
        ((lh) this).field_f = 0;
        if (param0 != 76) {
            return;
        }
        if (((lh) this).field_j == 0) {
            ((lh) this).field_e = tb.field_d;
        }
        if (0 == ((lh) this).field_j) {
            if (!(tb.field_d != 98)) {
                if ((((lh) this).field_k ^ -1) >= -1) {
                    ((lh) this).field_k = ((lh) this).field_i;
                }
                ((lh) this).field_k = ((lh) this).field_k - 1;
                ((lh) this).field_h = false;
            }
        }
        if (((lh) this).field_j == 0) {
            if (!((tb.field_d ^ -1) != -100)) {
                ((lh) this).field_k = ((lh) this).field_k + 1;
                ((lh) this).field_h = false;
                if (((lh) this).field_i <= ((lh) this).field_k) {
                    ((lh) this).field_k = 0;
                }
            }
        }
    }

    final static void a(int param0, vk param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= jh.field_c) {
                ab.field_u[param1.b(2)] = ab.field_u[param1.b(2)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= jh.field_c) {
                    L3: {
                      jh.field_c = var2;
                      jh.field_c = jh.field_c + 1;
                      me.field_b[jh.field_c] = param1;
                      if (param0 == 7743) {
                        break L3;
                      } else {
                        field_a = (de) null;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      if (me.field_b[var3].field_k != ((vk) param1).field_k) {
                        break L4;
                      } else {
                        var4 = me.field_b[var3].b(2);
                        if (mj.field_e >= ab.field_u[var4]) {
                          break L4;
                        } else {
                          ab.field_u[var4] = ab.field_u[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    var2++;
                    me.field_b[var2] = me.field_b[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (((vk) param1).field_k == me.field_b[var2].field_k) {
                  ab.field_u[me.field_b[var2].b(2)] = ab.field_u[me.field_b[var2].b(2)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ab.field_u[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != -12819) {
            boolean discarded$0 = ((lh) this).d((byte) -69);
        }
        return ((lh) this).field_e == 103 ? true : false;
    }

    final boolean d(byte param0) {
        if (param0 != 68) {
            ((lh) this).field_k = 95;
        }
        return ((lh) this).field_e == 102 ? true : false;
    }

    final boolean f(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -85) {
            break L0;
          } else {
            field_a = (de) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((lh) this).field_b != 0) {
              break L2;
            } else {
              if (-85 == (((lh) this).field_e ^ -1)) {
                break L2;
              } else {
                if (83 != ((lh) this).field_e) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    lh(int param0) {
        ((lh) this).field_h = false;
        ((lh) this).field_k = 0;
        ((lh) this).field_i = param0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7865) {
            lh.a(-76);
        }
        field_c = null;
        field_d = null;
    }

    final boolean e(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 14354) {
          L0: {
            L1: {
              if (((lh) this).field_f == 1) {
                break L1;
              } else {
                if (97 == ((lh) this).field_e) {
                  break L1;
                } else {
                  if (-85 == ((lh) this).field_e) {
                    break L1;
                  } else {
                    if (-84 != ((lh) this).field_e) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final static wb a(String param0, qk param1, String param2, int param3) {
        int var4 = param1.a(18659, param2);
        int var5 = 1 % ((param3 - 43) / 62);
        int var6 = param1.a(var4, param0, (byte) 7);
        return oj.a(var4, param1, var6, -8691);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        ((lh) this).field_j = 0;
        int var5 = 124 / ((param0 - 42) / 55);
        ((lh) this).field_h = param3 ? true : false;
        if (((lh) this).field_h) {
            ((lh) this).field_k = param1;
        } else {
            ((lh) this).field_k = param2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new de(11, 0, 1, 2);
    }
}
