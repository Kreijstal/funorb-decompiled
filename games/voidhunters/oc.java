/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends rqa {
    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
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
            if (param1 == 0) {
              stackOut_3_0 = ve.a(false, (byte) 100, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("oc.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        int var2 = 0;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("oc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
