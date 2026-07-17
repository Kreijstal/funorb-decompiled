/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg {
    static ag field_d;
    static Calendar field_h;
    static String field_e;
    String field_f;
    static int field_b;
    String field_a;
    boolean field_g;
    static ea[] field_c;

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param0 == -1975005818) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 >= param1) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (97 > param1) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param1) {
                  L2: {
                    L3: {
                      if (97 > param1) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          var3 = null;
          fg.a((byte) -41, (sb) null);
          if (param1 >= 48) {
            if (param1 > 57) {
              if (param1 < 65) {
                if (97 <= param1) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (90 < param1) {
                  L4: {
                    L5: {
                      if (97 > param1) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (90 < param1) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static void a(byte param0, sl param1, int param2) {
        int var4 = 0;
        ld var5 = sn.field_c;
        if (param0 != 5) {
            return;
        }
        try {
            var5.d((byte) -81, param2);
            var5.field_o = var5.field_o + 1;
            var4 = var5.field_o;
            var5.c(1, param0 ^ 25561);
            var5.c(param1.field_n, 25564);
            var5.c(param1.field_p, param0 ^ 25561);
            var5.a((byte) 122, param1.field_t);
            var5.a((byte) 120, param1.field_s);
            var5.a((byte) 117, param1.field_r);
            var5.a((byte) 94, param1.field_o);
            int discarded$0 = var5.e(86, var4);
            var5.g(-1, var5.field_o - var4);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fg.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static String[][] a(int param0, sb param1) {
        ta var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[][] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[][] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 == 65) {
                break L1;
              } else {
                fg.a(-58);
                break L1;
              }
            }
            var2 = new ta();
            L2: while (true) {
              if (param1.field_u.length <= param1.field_o) {
                var3 = new String[var2.c((byte) -119)][];
                var4 = 0;
                L3: while (true) {
                  if (var3.length <= var4) {
                    stackOut_9_0 = (String[][]) var3;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    var3[var4] = ((fn) (Object) var2.e(eg.a(param0, 63791))).field_n;
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var2.a((byte) -124, (pi) (Object) new fn(lm.a(param1, (byte) -101)));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("fg.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(byte param0, sb param1) {
        int var2_int = 0;
        try {
            ah.field_b = param1.e(-25) << 5;
            var2_int = param1.d((byte) -54);
            vb.field_b = (var2_int & 7) << 18;
            ah.field_b = ah.field_b + (var2_int >> 3);
            vb.field_b = vb.field_b + (param1.e(param0 ^ 41) << 2);
            var2_int = param1.d((byte) -54);
            tk.field_h = var2_int << 15 & 2064384;
            vb.field_b = vb.field_b + (var2_int >> 6);
            tk.field_h = tk.field_h + (param1.d((byte) -54) << 7);
            if (param0 != -86) {
                field_e = null;
            }
            var2_int = param1.d((byte) -54);
            tk.field_h = tk.field_h + (var2_int >> 1);
            fl.field_c = var2_int << 16 & 65536;
            fl.field_c = fl.field_c + param1.e(param0 + 40);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fg.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 > -99) {
          var2 = null;
          fg.a((byte) 10, (sl) null, 95);
          field_c = null;
          field_d = null;
          field_h = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ag();
        field_e = "Hydraulic fist: Gives strength to push rock.";
        field_h = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
