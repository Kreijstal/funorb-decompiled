/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private nc field_b;
    private gg field_a;

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param1 == 66) {
          if (0 >= ob.field_l) {
            if (!il.b(507)) {
              var2 = 1;
              if (null == fc.field_l) {
                if (!sf.field_j) {
                  return;
                } else {
                  hc.a(param0, true, var2);
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 0;
              if (null == fc.field_l) {
                if (!sf.field_j) {
                  return;
                } else {
                  hc.a(param0, true, var2);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null == fc.field_l) {
              int discarded$2 = 0;
              int discarded$3 = -81;
              dj.field_k = g.a(480, 0, wh.field_c, 640);
              if (null != dj.field_k) {
                var2 = 2;
                th.a((byte) -50, (java.awt.Canvas) (Object) dj.field_k);
                if (null != fc.field_l) {
                  return;
                } else {
                  L0: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (null != fc.field_l) {
                  return;
                } else {
                  L1: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                }
              }
            } else {
              dj.field_k = fc.field_l.b(false);
              jh.a(2, param1 + 1);
              if (null != dj.field_k) {
                var2 = 2;
                th.a((byte) -50, (java.awt.Canvas) (Object) dj.field_k);
                if (null != fc.field_l) {
                  return;
                } else {
                  L2: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (null != fc.field_l) {
                  return;
                } else {
                  L3: {
                    if (sf.field_j) {
                      hc.a(param0, true, var2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final gg a(gg param0, int param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        gg stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 108) {
                break L1;
              } else {
                ck.a(false, (byte) -115);
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = ((ck) this).field_b.field_e.field_a;
                break L2;
              }
            }
            if (((ck) this).field_b.field_e == var3) {
              ((ck) this).field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (gg) (Object) stackIn_8_0;
            } else {
              ((ck) this).field_a = var3.field_a;
              stackOut_9_0 = (gg) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ck.A(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final gg a(byte param0) {
        int var2 = 0;
        gg var3 = null;
        var2 = -121 % ((param0 - 30) / 44);
        var3 = ((ck) this).field_b.field_e.field_d;
        if (var3 == ((ck) this).field_b.field_e) {
          ((ck) this).field_a = null;
          return null;
        } else {
          ((ck) this).field_a = var3.field_d;
          return var3;
        }
    }

    final gg b(int param0) {
        gg var2 = null;
        var2 = ((ck) this).field_a;
        if (var2 != ((ck) this).field_b.field_e) {
          ((ck) this).field_a = var2.field_a;
          if (param0 != 640) {
            gg discarded$2 = ((ck) this).c(19);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ck) this).field_a = null;
          return null;
        }
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        gg stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                var3 = ((ck) this).field_b.field_e.field_d;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (var3 == ((ck) this).field_b.field_e) {
              ((ck) this).field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (gg) (Object) stackIn_6_0;
            } else {
              L2: {
                ((ck) this).field_a = var3.field_d;
                if (param0 == 26229) {
                  break L2;
                } else {
                  ((ck) this).field_a = null;
                  break L2;
                }
              }
              stackOut_9_0 = (gg) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("ck.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final gg a(int param0) {
        gg var2 = null;
        if (param0 != -25119) {
            ((ck) this).field_b = null;
            var2 = ((ck) this).field_b.field_e.field_a;
            if (!(((ck) this).field_b.field_e != var2)) {
                ((ck) this).field_a = null;
                return null;
            }
            ((ck) this).field_a = var2.field_a;
            return var2;
        }
        var2 = ((ck) this).field_b.field_e.field_a;
        if (!(((ck) this).field_b.field_e != var2)) {
            ((ck) this).field_a = null;
            return null;
        }
        ((ck) this).field_a = var2.field_a;
        return var2;
    }

    final static boolean a(char param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        if (160 != param0) {
          if (param0 != 32) {
            if (param0 != 95) {
              if (param0 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    ck(nc param0) {
        try {
            ((ck) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final gg c(int param0) {
        gg var2 = null;
        var2 = ((ck) this).field_a;
        if (((ck) this).field_b.field_e == var2) {
          ((ck) this).field_a = null;
          return null;
        } else {
          if (param0 <= 111) {
            return null;
          } else {
            ((ck) this).field_a = var2.field_d;
            return var2;
          }
        }
    }

    static {
    }
}
