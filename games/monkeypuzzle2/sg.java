/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_a;
    static String field_h;
    private int field_g;
    private int field_c;
    private int field_d;
    int field_i;
    private int field_e;
    boolean field_b;
    private int field_f;

    final static void a(String param0, byte param1) {
        try {
            if (param1 != -120) {
                int discarded$0 = 0;
                boolean discarded$1 = sg.a((String) null);
            }
            ld.a(param0, (byte) -13);
            vi.a(k.field_k, 12345, false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        ((sg) this).field_d = 0;
        if (param0 < 60) {
            ((sg) this).field_a = -93;
        }
        ((sg) this).field_g = 0;
        ((sg) this).field_c = 0;
        if (0 == ((sg) this).field_f) {
            ((sg) this).field_g = oa.field_H;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0 / ((param1 - 25) / 40);
        if (!(((sg) this).field_f != 0)) {
            ((sg) this).field_b = false;
            ((sg) this).field_a = param0;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 10) {
            ((sg) this).e(-63);
        }
        return 0 != ((sg) this).field_f ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 0) {
            ((sg) this).a(-79, -5, -113, false);
        }
        return 96 == ((sg) this).field_g ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        ((sg) this).field_f = param2;
        ((sg) this).field_b = param3 ? true : false;
        if (((sg) this).field_b) {
            ((sg) this).field_a = param1;
        } else {
            ((sg) this).field_a = param0;
        }
    }

    final boolean d(int param0) {
        if (param0 != 25149) {
            ((sg) this).a(-106, -108, false);
        }
        return ((sg) this).field_g == 97 ? true : false;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        int var4 = -19;
        return ec.a(1);
    }

    final void e(int param0) {
        ((sg) this).field_g = 0;
        ((sg) this).field_c = 0;
        ((sg) this).field_d = 0;
        if (!(((sg) this).field_f != 0)) {
            ((sg) this).field_g = oa.field_H;
        }
        if (param0 == ((sg) this).field_f) {
            if (oa.field_H == 98) {
                if (0 >= ((sg) this).field_a) {
                    ((sg) this).field_a = ((sg) this).field_i;
                }
                ((sg) this).field_b = false;
                ((sg) this).field_a = ((sg) this).field_a - 1;
            }
        }
        if (((sg) this).field_f == 0) {
            if (oa.field_H == 99) {
                ((sg) this).field_a = ((sg) this).field_a + 1;
                if (!(((sg) this).field_i > ((sg) this).field_a)) {
                    ((sg) this).field_a = 0;
                }
                ((sg) this).field_b = false;
            }
        }
    }

    final boolean c(int param0) {
        if (param0 != 102) {
            ((sg) this).field_d = 74;
        }
        return ((sg) this).field_g == 102 ? true : false;
    }

    final boolean c(byte param0) {
        Object var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 <= -76) {
            break L0;
          } else {
            var3 = null;
            sg.a((String) null, (byte) 84);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sg) this).field_d != 0) {
              break L2;
            } else {
              if (84 == ((sg) this).field_g) {
                break L2;
              } else {
                if (((sg) this).field_g != 83) {
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

    final void a(byte param0, int param1, boolean param2) {
        ((sg) this).field_f = 0;
        ((sg) this).field_b = param2 ? true : false;
        if (param0 != 60) {
            field_h = null;
        }
        if (!(!((sg) this).field_b)) {
            ((sg) this).field_a = param1;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (((sg) this).field_i <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (param1 >= ((sg) this).field_i) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((sg) this).field_g = 0;
              if (param2) {
                break L0;
              } else {
                boolean discarded$1 = ((sg) this).d(47);
                break L0;
              }
            }
            L1: {
              ((sg) this).field_d = 0;
              ((sg) this).field_c = 0;
              if (kc.field_d != 0) {
                ((sg) this).field_e = kb.field_b;
                ((sg) this).field_f = kc.field_d;
                ((sg) this).field_b = true;
                ((sg) this).field_c = kc.field_d;
                ((sg) this).field_d = kc.field_d;
                ((sg) this).field_a = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((sg) this).field_f == 0) {
                break L2;
              } else {
                if (ni.field_a != 0) {
                  L3: {
                    if (((sg) this).field_e > 0) {
                      break L3;
                    } else {
                      ((sg) this).field_e = aj.field_f;
                      ((sg) this).field_c = ((sg) this).field_f;
                      break L3;
                    }
                  }
                  ((sg) this).field_e = ((sg) this).field_e - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (kc.field_d != 0) {
                break L4;
              } else {
                if (ni.field_a == 0) {
                  ((sg) this).field_f = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (((sg) this).field_f != 0) {
                break L5;
              } else {
                L6: {
                  if (((sg) this).field_b) {
                    break L6;
                  } else {
                    if (!oe.field_d) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (0 > param0) {
                  if (!((sg) this).field_b) {
                    break L5;
                  } else {
                    ((sg) this).field_a = -1;
                    break L5;
                  }
                } else {
                  L7: {
                    if (param0 == ((sg) this).field_a) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((sg) this).field_a = param0;
                  ((sg) this).field_b = true;
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    public static void a() {
        field_h = null;
    }

    final boolean g(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sg) this).field_c != 0) {
              break L2;
            } else {
              if (84 == ((sg) this).field_g) {
                break L2;
              } else {
                if (83 != ((sg) this).field_g) {
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

    final static boolean a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("sg.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + false + ')');
        }
        return stackIn_10_0 != 0;
    }

    final boolean b(int param0) {
        if (param0 != -29996) {
            ((sg) this).field_b = true;
        }
        return 103 == ((sg) this).field_g ? true : false;
    }

    sg(int param0) {
        ((sg) this).field_a = 0;
        ((sg) this).field_b = false;
        ((sg) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Connection restored.";
    }
}
