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
            if (((lh) this).field_f != 0) {
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
        if (((lh) this).field_j == 0) {
            if (tb.field_d == 96) {
                if (!(((lh) this).field_k > 0)) {
                    ((lh) this).field_k = ((lh) this).field_i;
                }
                ((lh) this).field_k = ((lh) this).field_k - 1;
                ((lh) this).field_h = false;
            }
        }
        if (((lh) this).field_j == 0) {
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
              if (((lh) this).field_f == 2) {
                break L1;
              } else {
                if (((lh) this).field_e != 96) {
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
                if (((lh) this).field_k <= 0) {
                    ((lh) this).field_k = ((lh) this).field_i;
                }
                ((lh) this).field_k = ((lh) this).field_k - 1;
                ((lh) this).field_h = false;
            }
        }
        if (((lh) this).field_j == 0) {
            if (!(tb.field_d != 99)) {
                ((lh) this).field_k = ((lh) this).field_k + 1;
                ((lh) this).field_h = false;
                if (((lh) this).field_i <= ((lh) this).field_k) {
                    ((lh) this).field_k = 0;
                }
            }
        }
    }

    final static void a(int param0, vk param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= jh.field_c) {
                    int dupTemp$4 = param1.b(2);
                    ab.field_u[dupTemp$4] = ab.field_u[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= jh.field_c) {
                        L4: {
                          jh.field_c = var2_int;
                          int fieldTemp$5 = jh.field_c;
                          jh.field_c = jh.field_c + 1;
                          me.field_b[fieldTemp$5] = param1;
                          if (param0 == 7743) {
                            break L4;
                          } else {
                            field_a = null;
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (me.field_b[var3].field_k != param1.field_k) {
                              break L6;
                            } else {
                              var4 = me.field_b[var3].b(2);
                              if (mj.field_e >= ab.field_u[var4]) {
                                break L6;
                              } else {
                                ab.field_u[var4] = ab.field_u[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          me.field_b[incrementValue$6] = me.field_b[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_k == me.field_b[var2_int].field_k) {
                        int dupTemp$7 = me.field_b[var2_int].b(2);
                        ab.field_u[dupTemp$7] = ab.field_u[dupTemp$7] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ab.field_u[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("lh.L(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
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
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((lh) this).field_b != 0) {
              break L2;
            } else {
              if (((lh) this).field_e == 84) {
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param1.a(18659, param2);
            var5 = 1 % ((param3 - 43) / 62);
            var6 = param1.a(var4_int, param0, (byte) 7);
            stackOut_0_0 = oj.a(var4_int, param1, var6, -8691);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("lh.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
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
