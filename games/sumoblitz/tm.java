/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tm implements mh {
    static String field_b;
    static int field_d;
    static jr field_a;
    static int[] field_c;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        if (param2 != 5592405) {
            field_a = null;
        }
    }

    final static void a(boolean param0, byte param1, wi param2, int param3, int param4, int param5, int param6, int param7, int param8, String param9, boolean param10, int param11, int param12, long param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              ig.field_a = new pl(param3);
              as.field_v = new pl(param8);
              ql.field_v = param5;
              vp.field_a = param7;
              jm.field_b = param13;
              mc.field_C = param9;
              jt.field_t = param2;
              if (!param10) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            qn.field_a = stackIn_3_0 != 0;
            if (param1 == 84) {
              L1: {
                s.field_o = param12;
                rh.field_p = param6;
                if (!param0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              gn.field_d = stackIn_8_0 != 0;
              nb.field_b = param4;
              jt.field_r = param11;
              if (null != jt.field_t.field_n) {
                try {
                  pe.field_E = new gj(jt.field_t.field_n, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
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

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        dt.field_p = null;
        tj.field_n = null;
        cd.field_d = 0;
        var2 = ie.field_x;
        ie.field_x = rl.field_q;
        rl.field_q = var2;
        if ((param0 ^ -1) != -52) {
          if ((param0 ^ -1) == -51) {
            L0: {
              jk.field_b.field_j = 5;
              jk.field_b.field_d = jk.field_b.field_d + 1;
              if ((jk.field_b.field_d ^ -1) > -3) {
                break L0;
              } else {
                if ((param0 ^ -1) != -52) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (jk.field_b.field_d < 2) {
              if (jk.field_b.field_d < 4) {
                if (param1 < -80) {
                  return -1;
                } else {
                  return 65;
                }
              } else {
                return 1;
              }
            } else {
              if (50 == param0) {
                return 5;
              } else {
                if (jk.field_b.field_d < 4) {
                  if (param1 < -80) {
                    return -1;
                  } else {
                    return 65;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            L1: {
              jk.field_b.field_j = 1;
              jk.field_b.field_d = jk.field_b.field_d + 1;
              if ((jk.field_b.field_d ^ -1) > -3) {
                break L1;
              } else {
                if ((param0 ^ -1) != -52) {
                  break L1;
                } else {
                  return 2;
                }
              }
            }
            if (jk.field_b.field_d < 2) {
              if (jk.field_b.field_d < 4) {
                if (param1 < -80) {
                  return -1;
                } else {
                  return 65;
                }
              } else {
                return 1;
              }
            } else {
              if (50 == param0) {
                return 5;
              } else {
                if (jk.field_b.field_d < 4) {
                  if (param1 < -80) {
                    return -1;
                  } else {
                    return 65;
                  }
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          jk.field_b.field_j = 2;
          jk.field_b.field_d = jk.field_b.field_d + 1;
          if ((jk.field_b.field_d ^ -1) <= -3) {
            if ((param0 ^ -1) == -52) {
              return 2;
            } else {
              if (jk.field_b.field_d < 2) {
                if (jk.field_b.field_d < 4) {
                  if (param1 < -80) {
                    return -1;
                  } else {
                    return 65;
                  }
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (jk.field_b.field_d < 4) {
                    if (param1 < -80) {
                      return -1;
                    } else {
                      return 65;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            if (jk.field_b.field_d < 2) {
              if (jk.field_b.field_d < 4) {
                if (param1 < -80) {
                  return -1;
                } else {
                  return 65;
                }
              } else {
                return 1;
              }
            } else {
              if (50 != param0) {
                if (jk.field_b.field_d < 4) {
                  if (param1 >= -80) {
                    return 65;
                  } else {
                    return -1;
                  }
                } else {
                  return 1;
                }
              } else {
                return 5;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Just play";
        field_d = -1;
    }
}
