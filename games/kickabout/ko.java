/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static int[] field_f;
    private boolean field_g;
    static String field_j;
    private int field_i;
    private int field_b;
    private int field_h;
    private int field_d;
    int field_e;
    int field_a;
    static String field_k;
    static int field_c;

    public static void a(byte param0) {
        field_k = null;
        field_j = null;
        field_f = null;
    }

    final static void a(int param0, int param1, long param2) {
        if (param0 < 57) {
            field_f = null;
        }
        ml var4 = or.field_d;
        var4.b(param1, (byte) 120);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.a(126, 7);
        var4.a(param2, -1781890008);
        var4.c(62, -var5 + var4.field_n);
    }

    final void a(int param0, int param1, int param2) {
        if (((ko) this).field_a > param1) {
          if (((ko) this).field_a > param2) {
            L0: {
              if (param0 == -21174) {
                break L0;
              } else {
                ((ko) this).field_b = -2;
                break L0;
              }
            }
            L1: {
              ((ko) this).field_b = 0;
              ((ko) this).field_h = 0;
              if (0 != wj.field_A) {
                ((ko) this).field_g = true;
                ((ko) this).field_i = wj.field_A;
                ((ko) this).field_h = wj.field_A;
                ((ko) this).field_e = param2;
                ((ko) this).field_d = rl.field_q;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ko) this).field_i == 0) {
                break L2;
              } else {
                if (nl.field_p != 0) {
                  L3: {
                    if (0 < ((ko) this).field_d) {
                      break L3;
                    } else {
                      ((ko) this).field_d = vj.field_b;
                      break L3;
                    }
                  }
                  ((ko) this).field_d = ((ko) this).field_d - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (wj.field_A != 0) {
                break L4;
              } else {
                if (nl.field_p != 0) {
                  break L4;
                } else {
                  ((ko) this).field_i = 0;
                  break L4;
                }
              }
            }
            L5: {
              if (((ko) this).field_i != 0) {
                break L5;
              } else {
                L6: {
                  if (((ko) this).field_g) {
                    break L6;
                  } else {
                    if (el.field_C) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                if (param1 < 0) {
                  if (!((ko) this).field_g) {
                    break L5;
                  } else {
                    ((ko) this).field_e = -1;
                    break L5;
                  }
                } else {
                  L7: {
                    if (~param1 != ~((ko) this).field_e) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((ko) this).field_g = true;
                  ((ko) this).field_e = param1;
                  break L5;
                }
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((ko) this).field_i != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        ((ko) this).field_g = param3 ? true : false;
        ((ko) this).field_i = param1;
        if (!((ko) this).field_g) {
            ((ko) this).field_e = param2;
        } else {
            ((ko) this).field_e = param0;
        }
    }

    final void a(int param0, boolean param1) {
        L0: {
          ((ko) this).field_b = 0;
          ((ko) this).field_h = 0;
          if (0 != ((ko) this).field_i) {
            break L0;
          } else {
            if (cc.field_e == 96) {
              L1: {
                if (0 < ((ko) this).field_e) {
                  break L1;
                } else {
                  ((ko) this).field_e = ((ko) this).field_a;
                  break L1;
                }
              }
              ((ko) this).field_g = false;
              ((ko) this).field_e = ((ko) this).field_e - 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            ((ko) this).b(-93);
            break L2;
          }
        }
        L3: {
          if (0 != ((ko) this).field_i) {
            break L3;
          } else {
            ((ko) this).field_b = cc.field_e;
            break L3;
          }
        }
        L4: {
          if (((ko) this).field_i != 0) {
            break L4;
          } else {
            if (97 == cc.field_e) {
              L5: {
                ((ko) this).field_e = ((ko) this).field_e + 1;
                if (((ko) this).field_e >= ((ko) this).field_a) {
                  ((ko) this).field_e = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              ((ko) this).field_g = false;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (((ko) this).field_i != 0) {
            break L6;
          } else {
            L7: {
              if (98 == cc.field_e) {
                break L7;
              } else {
                if (99 == cc.field_e) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (((ko) this).field_e < 0) {
                ((ko) this).field_e = param0;
                break L8;
              } else {
                break L8;
              }
            }
            ((ko) this).field_g = false;
            break L6;
          }
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != 68) {
            return;
        }
        if (((ko) this).field_i == 0) {
            ((ko) this).field_g = false;
            ((ko) this).field_e = param1;
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (((ko) this).field_h != 0) {
                break L1;
              } else {
                if (((ko) this).field_b == 84) {
                  break L1;
                } else {
                  if (((ko) this).field_b != 83) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void d(int param0) {
        ((ko) this).field_b = 0;
        ((ko) this).field_h = 0;
        if (!(((ko) this).field_i != 0)) {
            ((ko) this).field_b = cc.field_e;
        }
        if (0 == ((ko) this).field_i) {
            if (cc.field_e == 98) {
                if (!(((ko) this).field_e > 0)) {
                    ((ko) this).field_e = ((ko) this).field_a;
                }
                ((ko) this).field_e = ((ko) this).field_e - 1;
                ((ko) this).field_g = false;
            }
        }
        if (param0 < 89) {
            return;
        }
        if (0 == ((ko) this).field_i) {
            if (cc.field_e == 99) {
                ((ko) this).field_e = ((ko) this).field_e + 1;
                ((ko) this).field_g = false;
                if (((ko) this).field_a <= ((ko) this).field_e) {
                    ((ko) this).field_e = 0;
                }
            }
        }
    }

    final void b(int param0) {
        ((ko) this).field_h = 0;
        ((ko) this).field_b = 0;
        if (param0 != -99) {
            ((ko) this).field_h = 117;
        }
        if (!(0 != ((ko) this).field_i)) {
            ((ko) this).field_b = cc.field_e;
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        if (param2 != -127) {
            ((ko) this).a(-68, true);
        }
        ((ko) this).field_g = param0 ? true : false;
        ((ko) this).field_i = 0;
        if (!(!((ko) this).field_g)) {
            ((ko) this).field_e = param1;
        }
    }

    ko(int param0) {
        ((ko) this).field_g = false;
        ((ko) this).field_e = 0;
        ((ko) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_k = "Search Results";
        field_f = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)((var0 << 1) + -1);
            var6 = (long)(1 + (var0 << 1));
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            if (var3 >= field_f.length) {
                var3 = field_f.length + -1;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
                field_f[var1] = var0;
            }
        }
        field_c = 20;
    }
}
