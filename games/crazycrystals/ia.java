/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends ln {
    static int field_i;
    static String field_h;
    static int field_g;

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var6 = CrazyCrystals.field_B;
        if (((ia) this).field_c > 1) {
          if (((ia) this).field_b <= 0) {
            return 0;
          } else {
            var3 = 105 / ((55 - param1) / 50);
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              if (2 <= var5) {
                L1: {
                  if (var4 == ((ia) this).field_b) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                return stackIn_10_0;
              } else {
                var4 = var4 + q.field_a[param0].field_e[var5];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (pe.field_i != -1) {
                break L1;
              } else {
                if (ce.field_gb == -1) {
                  ce.field_gb = bm.field_h;
                  pe.field_i = qh.field_i;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                cl.field_o = cl.field_o + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) kf.field_f)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (kf.field_f != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!co.field_F) {
                  if (cl.field_o >= ih.field_a) {
                    if (cl.field_o < ih.field_a - -u.field_a) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L4;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_18_0;
                if (param1 == null) {
                  cl.field_o = 0;
                  break L5;
                } else {
                  if (co.field_F) {
                    cl.field_o = ih.field_a;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      cl.field_o = ih.field_a;
                      break L5;
                    } else {
                      cl.field_o = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param1 != null) {
                  co.field_F = false;
                  break L6;
                } else {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    co.field_F = true;
                    break L6;
                  }
                }
              }
              rf.field_G = ce.field_gb;
              ni.field_b = pe.field_i;
              break L2;
            }
            L7: {
              kf.field_f = param1;
              if (co.field_F) {
                break L7;
              } else {
                if (cl.field_o >= ih.field_a) {
                  break L7;
                } else {
                  if (ij.field_h) {
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    cl.field_o = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              pe.field_i = -1;
              if (!co.field_F) {
                break L8;
              } else {
                if (cl.field_o == lc.field_e) {
                  cl.field_o = 0;
                  co.field_F = false;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ce.field_gb = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var2;
            stackOut_42_1 = new StringBuilder().append("ia.B(").append(-47).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (0 > param1) {
          param1 = 0;
          fq.field_x.e(-20562, param1 * lc.field_d >> 6);
          qd.field_r = param1;
          return;
        } else {
          L0: {
            if (param1 <= 64) {
              break L0;
            } else {
              param1 = 64;
              break L0;
            }
          }
          fq.field_x.e(-20562, param1 * lc.field_d >> 6);
          qd.field_r = param1;
          return;
        }
    }

    ia(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void a(boolean param0) {
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Try again";
    }
}
