/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua extends java.awt.Canvas {
    static vj field_b;
    private java.awt.Component field_a;
    static nh field_c;

    final static int a(int param0, int param1, int param2) {
        if (uh.field_r == null) {
          return -1;
        } else {
          if (param2 >= ka.field_o) {
            if (param2 < ka.field_o + uh.field_r.field_y) {
              L0: {
                if (tb.field_c > param0) {
                  break L0;
                } else {
                  if (uh.field_r.field_w + tb.field_c <= param0) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
              L1: {
                if (param2 < ch.field_A) {
                  break L1;
                } else {
                  if (param2 >= ch.field_A + uh.field_r.field_y) {
                    break L1;
                  } else {
                    if (param0 < v.field_N) {
                      break L1;
                    } else {
                      if (v.field_N + uh.field_r.field_w <= param0) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              if (param1 != -13412) {
                return 39;
              } else {
                return -1;
              }
            } else {
              L2: {
                if (param2 < ch.field_A) {
                  break L2;
                } else {
                  if (param2 >= ch.field_A + uh.field_r.field_y) {
                    break L2;
                  } else {
                    if (param0 < v.field_N) {
                      break L2;
                    } else {
                      if (v.field_N + uh.field_r.field_w <= param0) {
                        break L2;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              if (param1 != -13412) {
                return 39;
              } else {
                return -1;
              }
            }
          } else {
            if (param2 >= ch.field_A) {
              if (param2 < ch.field_A + uh.field_r.field_y) {
                L3: {
                  if (param0 < v.field_N) {
                    break L3;
                  } else {
                    if (v.field_N + uh.field_r.field_w <= param0) {
                      break L3;
                    } else {
                      return 1;
                    }
                  }
                }
                if (param1 != -13412) {
                  return 39;
                } else {
                  return -1;
                }
              } else {
                if (param1 != -13412) {
                  return 39;
                } else {
                  return -1;
                }
              }
            } else {
              if (param1 != -13412) {
                return 39;
              } else {
                return -1;
              }
            }
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((ua) this).field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ua.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
    }

    ua(java.awt.Component param0) {
        try {
            ((ua) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((ua) this).field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ua.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3, int param4, bl param5, int param6, int param7, String param8, int param9, int param10, boolean param11, long param12, int param13) {
        try {
            int var15_int = 0;
            RuntimeException var15 = null;
            IOException var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                dh.field_N = new lh(param7);
                nj.field_p = new lh(param4);
                ci.field_W = param13;
                ei.field_o = param3;
                lb.field_v = param1;
                ia.field_c = param10;
                var15_int = 42 % ((param2 - -70) / 44);
                if (!param0) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                bd.field_N = stackIn_3_0 != 0;
                if (!param11) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              wg.field_d = stackIn_6_0 != 0;
              ml.field_n = param8;
              n.field_i = param12;
              nf.field_t = param9;
              dc.field_e = param6;
              pi.field_I = param5;
              if (null != pi.field_I.field_m) {
                {
                  L2: {
                    mi.field_f = new ge(pi.field_I.field_m, 64, 0);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var15;
                stackOut_12_1 = new StringBuilder().append("ua.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param5 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              L4: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param6).append(44).append(param7).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param8 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L4;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L4;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
