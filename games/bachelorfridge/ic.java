/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends pp {
    static jd field_i;

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 73 % ((param1 - 34) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ic.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
            param1.field_R = false;
            if (param2 != 12) {
                be var5 = (be) null;
                ic.a(-10, (be) null, -60);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ic.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
                  if ((wca.field_n ^ -1) == -11) {
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
                  if ((wca.field_n ^ -1) == -11) {
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
                if ((wca.field_n ^ -1) == -11) {
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -31855) {
                break L1;
              } else {
                field_i = (jd) null;
                break L1;
              }
            }
            stackIn_3_0 = tw.a(je.b(param1, 100, param0), (byte) -36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ic.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        if (param0) {
            field_i = (jd) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
    }
}
