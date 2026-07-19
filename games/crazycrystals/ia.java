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
        if (-2 > (this.field_c ^ -1)) {
          if (this.field_b <= 0) {
            return 0;
          } else {
            var3 = 105 / ((55 - param1) / 50);
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              if (2 <= var5) {
                L1: {
                  if (var4 == this.field_b) {
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
        int stackIn_20_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -47) {
                break L1;
              } else {
                field_g = -56;
                break L1;
              }
            }
            L2: {
              if ((pe.field_i ^ -1) != 0) {
                break L2;
              } else {
                if (ce.field_gb == -1) {
                  ce.field_gb = bm.field_h;
                  pe.field_i = qh.field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                cl.field_o = cl.field_o + 1;
                if (param1 != null) {
                  if (!param1.equals(kf.field_f)) {
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  if (kf.field_f != null) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!co.field_F) {
                  if (cl.field_o >= ih.field_a) {
                    if (cl.field_o < ih.field_a - -u.field_a) {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_20_0 = stackOut_17_0;
                      break L5;
                    }
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_20_0 = stackOut_15_0;
                    break L5;
                  }
                } else {
                  stackOut_13_0 = 0;
                  stackIn_20_0 = stackOut_13_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_20_0;
                if (param1 == null) {
                  cl.field_o = 0;
                  break L6;
                } else {
                  if (co.field_F) {
                    cl.field_o = ih.field_a;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      cl.field_o = ih.field_a;
                      break L6;
                    } else {
                      cl.field_o = 0;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                if (param1 != null) {
                  co.field_F = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    co.field_F = true;
                    break L7;
                  }
                }
              }
              rf.field_G = ce.field_gb;
              ni.field_b = pe.field_i;
              break L3;
            }
            L8: {
              kf.field_f = param1;
              if (co.field_F) {
                break L8;
              } else {
                if (cl.field_o >= ih.field_a) {
                  break L8;
                } else {
                  if (ij.field_h) {
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    cl.field_o = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              pe.field_i = -1;
              if (!co.field_F) {
                break L9;
              } else {
                if (cl.field_o == lc.field_e) {
                  cl.field_o = 0;
                  co.field_F = false;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            ce.field_gb = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var2);
            stackOut_44_1 = new StringBuilder().append("ia.B(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (0 <= param1) {
          L0: {
            if (-65 <= (param1 ^ -1)) {
              break L0;
            } else {
              param1 = 64;
              break L0;
            }
          }
          if (param0 != -658435066) {
            return;
          } else {
            fq.field_x.e(-20562, param1 * lc.field_d >> -658435066);
            qd.field_r = param1;
            return;
          }
        } else {
          param1 = 0;
          if (param0 != -658435066) {
            return;
          } else {
            fq.field_x.e(-20562, param1 * lc.field_d >> -658435066);
            qd.field_r = param1;
            return;
          }
        }
    }

    ia(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            String var2 = (String) null;
            ia.a((byte) -77, (String) null);
        }
    }

    static {
        field_h = "Try again";
    }
}
