/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rqa {
    final static boolean a(CharSequence param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
            stackOut_2_0 = ve.a(false, (byte) 100, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("oc.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
        return stackIn_3_0;
    }

    final static void a() {
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (0 < lia.field_b) {
          lia.field_b = lia.field_b - 1;
          if (lia.field_b <= 0) {
            if (nf.field_a <= 0) {
              if (tba.field_p <= 0) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (tba.field_p <= 0) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            }
          } else {
            int discarded$4 = 1;
            moa.a();
            if (nf.field_a <= 0) {
              if (tba.field_p <= 0) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (tba.field_p > 0) {
                lkb.a(tba.field_p, (byte) -124);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (nf.field_a > 0) {
            nf.field_a = nf.field_a - 1;
            if (lia.field_b <= 0) {
              if (nf.field_a <= 0) {
                if (tba.field_p <= 0) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (tba.field_p <= 0) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              }
            } else {
              int discarded$5 = 1;
              moa.a();
              if (nf.field_a <= 0) {
                if (tba.field_p <= 0) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (tba.field_p <= 0) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              }
            }
          } else {
            if (tba.field_p <= 0) {
              if (lia.field_b <= 0) {
                if (nf.field_a <= 0) {
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              } else {
                int discarded$6 = 1;
                moa.a();
                if (nf.field_a <= 0) {
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              }
            } else {
              tba.field_p = tba.field_p - 1;
              if (lia.field_b > 0) {
                int discarded$7 = 1;
                moa.a();
                if (nf.field_a > 0) {
                  lkb.a(nf.field_a, (byte) -107);
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  if (tba.field_p > 0) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (nf.field_a <= 0) {
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (tba.field_p <= 0) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackOut_3_0 = new nc(via.field_b);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    oc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
