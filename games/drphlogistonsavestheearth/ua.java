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
        ((ua) this).field_a.paint(param0);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 50) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    ua(java.awt.Component param0) {
        ((ua) this).field_a = param0;
    }

    public final void update(java.awt.Graphics param0) {
        ((ua) this).field_a.update(param0);
    }

    final static void a(boolean param0, int param1, byte param2, int param3, int param4, bl param5, int param6, int param7, String param8, int param9, int param10, boolean param11, long param12, int param13) {
        try {
            int var15 = 0;
            IOException var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              dh.field_N = new lh(param7);
              nj.field_p = new lh(param4);
              ci.field_W = param13;
              ei.field_o = param3;
              lb.field_v = param1;
              ia.field_c = param10;
              var15 = 42 % ((param2 - -70) / 44);
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
              try {
                mi.field_f = new ge(pi.field_I.field_m, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
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
