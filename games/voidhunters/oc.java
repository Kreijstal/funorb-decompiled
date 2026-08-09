/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rqa {
    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = ve.a(false, (byte) 100, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("oc.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        int var2;
        var2 = VoidHunters.field_G;
        if (0 < lia.field_b) {
          lia.field_b = lia.field_b - 1;
          if ((lia.field_b ^ -1) >= param0) {
            if ((nf.field_a ^ -1) >= -1) {
              if (-1 <= (tba.field_p ^ -1)) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (-1 <= (tba.field_p ^ -1)) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            }
          } else {
            moa.a(true);
            if ((nf.field_a ^ -1) >= -1) {
              if (-1 <= (tba.field_p ^ -1)) {
                return;
              } else {
                lkb.a(tba.field_p, (byte) -124);
                return;
              }
            } else {
              lkb.a(nf.field_a, (byte) -107);
              if (-1 > (tba.field_p ^ -1)) {
                lkb.a(tba.field_p, (byte) -124);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if ((nf.field_a ^ -1) < -1) {
            nf.field_a = nf.field_a - 1;
            if ((lia.field_b ^ -1) >= param0) {
              if ((nf.field_a ^ -1) >= -1) {
                if (-1 <= (tba.field_p ^ -1)) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (-1 <= (tba.field_p ^ -1)) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              }
            } else {
              moa.a(true);
              if ((nf.field_a ^ -1) >= -1) {
                if (-1 <= (tba.field_p ^ -1)) {
                  return;
                } else {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                }
              } else {
                lkb.a(nf.field_a, (byte) -107);
                if (-1 > (tba.field_p ^ -1)) {
                  lkb.a(tba.field_p, (byte) -124);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (tba.field_p <= 0) {
              if ((lia.field_b ^ -1) >= param0) {
                if ((nf.field_a ^ -1) >= -1) {
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              } else {
                moa.a(true);
                if ((nf.field_a ^ -1) >= -1) {
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 <= (tba.field_p ^ -1)) {
                    return;
                  } else {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  }
                }
              }
            } else {
              tba.field_p = tba.field_p - 1;
              if ((lia.field_b ^ -1) < param0) {
                moa.a(true);
                if ((nf.field_a ^ -1) < -1) {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 > (tba.field_p ^ -1)) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-1 > (tba.field_p ^ -1)) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if ((nf.field_a ^ -1) >= -1) {
                  if (-1 > (tba.field_p ^ -1)) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
                    return;
                  }
                } else {
                  lkb.a(nf.field_a, (byte) -107);
                  if (-1 > (tba.field_p ^ -1)) {
                    lkb.a(tba.field_p, (byte) -124);
                    return;
                  } else {
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
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(via.field_b);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    oc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
