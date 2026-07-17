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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 5592405) {
                break L1;
              } else {
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("tm.A(");
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0, byte param1, wi param2, int param3, int param4, int param5, int param6, int param7, int param8, String param9, boolean param10, int param11, int param12, long param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
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
                  {
                    L2: {
                      pe.field_E = new gj(jt.field_t.field_n, 64, 0);
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) var15_ref;
                stackOut_14_1 = new StringBuilder().append("tm.D(").append(param0).append(44).append(param1).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L3;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L3;
                }
              }
              L4: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param9 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L4;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L4;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 41);
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
        if (param0 != 51) {
          if (param0 == 50) {
            L0: {
              jk.field_b.field_j = 5;
              jk.field_b.field_d = jk.field_b.field_d + 1;
              if (jk.field_b.field_d < 2) {
                break L0;
              } else {
                if (param0 != 51) {
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
              if (jk.field_b.field_d < 2) {
                break L1;
              } else {
                if (param0 != 51) {
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
          if (jk.field_b.field_d >= 2) {
            if (param0 == 51) {
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
