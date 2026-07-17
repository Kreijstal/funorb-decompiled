/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends pp {
    static jd field_i;

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 73 % ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ic.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(aga param0, op param1, int param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              param1.field_R = false;
              if (param2 == 12) {
                break L1;
              } else {
                var5 = null;
                cq discarded$2 = ic.a(-10, (be) null, -60);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ic.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    ic() {
    }

    final static void a(int param0) {
        if (null != mn.field_l) {
          if (ua.field_b) {
            L0: {
              mn.field_l.a(-47);
              if (bf.field_h[wca.field_n].field_i) {
                break L0;
              } else {
                uka.field_h.field_c.a(19842, true);
                if (uka.field_h.field_c.field_R == 1) {
                  fla.b(23621);
                  if (wca.field_n == 10) {
                    dj.field_c.field_h.a(true, 0);
                    dj.field_c.e(-114);
                    break L0;
                  } else {
                    if (param0 < 28) {
                      ic.b(true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 < 28) {
                    ic.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 >= 28) {
              return;
            } else {
              ic.b(true);
              return;
            }
          } else {
            L1: {
              if (bf.field_h[wca.field_n].field_i) {
                break L1;
              } else {
                uka.field_h.field_c.a(19842, true);
                if (uka.field_h.field_c.field_R == 1) {
                  fla.b(23621);
                  if (wca.field_n == 10) {
                    dj.field_c.field_h.a(true, 0);
                    dj.field_c.e(-114);
                    break L1;
                  } else {
                    if (param0 < 28) {
                      ic.b(true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 < 28) {
                    ic.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 < 28) {
              ic.b(true);
              return;
            } else {
              return;
            }
          }
        } else {
          L2: {
            if (bf.field_h[wca.field_n].field_i) {
              break L2;
            } else {
              uka.field_h.field_c.a(19842, true);
              if (uka.field_h.field_c.field_R == 1) {
                fla.b(23621);
                if (wca.field_n == 10) {
                  dj.field_c.field_h.a(true, 0);
                  dj.field_c.e(-114);
                  break L2;
                } else {
                  if (param0 >= 28) {
                    return;
                  } else {
                    ic.b(true);
                    return;
                  }
                }
              } else {
                if (param0 >= 28) {
                  return;
                } else {
                  ic.b(true);
                  return;
                }
              }
            }
          }
          if (param0 < 28) {
            ic.b(true);
            return;
          } else {
            return;
          }
        }
    }

    final static cq a(int param0, be param1, int param2) {
        RuntimeException var3 = null;
        cq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -31855) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            int discarded$2 = -36;
            stackOut_2_0 = tw.a(je.b(param1, 100, param0));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ic.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        if (param0) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
    }
}
