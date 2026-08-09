/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static volatile int field_e;
    static qb[] field_a;
    static int field_d;
    static boolean field_c;
    static String field_b;

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ab var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            if (!vn.a(var6, 0)) {
              stackIn_3_0 = fn.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 == (jb.field_t ^ -1)) {
                if (!je.a(16, param0)) {
                  if (kl.a(param0, 1)) {
                    stackIn_13_0 = tj.a(-30, new String[]{param0}, gj.field_e);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (-101 < (rc.field_m ^ -1)) {
                        break L1;
                      } else {
                        if (-1 > (ah.field_c ^ -1)) {
                          break L1;
                        } else {
                          stackIn_17_0 = rg.field_e;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (200 <= rc.field_m) {
                      stackIn_21_0 = rg.field_e;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L2: {
                        if (param1 == -26) {
                          break L2;
                        } else {
                          bo.a(9);
                          break L2;
                        }
                      }
                      if (!sa.a(param0, 320)) {
                        var5 = he.field_e;
                        var5.b((byte) -63, param2);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.f(0, (byte) -80);
                        var5.a(param0, param1 ^ -23357);
                        var5.b(-var4 + var5.field_g, (byte) 43);
                        stackIn_28_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_26_0 = tj.a(125, new String[]{param0}, r.field_a);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = sd.field_l;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = nm.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("bo.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L3;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return (String) ((Object) stackIn_28_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_58_0 = 0;
        int var4;
        int var5;
        if (param0) {
          if (nf.field_z[param1] < nf.field_z[param3]) {
            return true;
          } else {
            if (nf.field_z[param1] > nf.field_z[param3]) {
              return false;
            } else {
              if (lm.field_i[param3] <= lm.field_i[param1]) {
                if (lm.field_i[param3] >= lm.field_i[param1]) {
                  if (param2 >= -32) {
                    bo.a(true, 73, (byte) 32, -114);
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param3 <= param1) {
                            stackIn_58_0 = 0;
                            break L0;
                          } else {
                            stackIn_58_0 = 1;
                            break L0;
                          }
                        }
                        return stackIn_58_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param3 <= param1) {
                            stackIn_49_0 = 0;
                            break L1;
                          } else {
                            stackIn_49_0 = 1;
                            break L1;
                          }
                        }
                        return stackIn_49_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (lm.field_i[param1] < lm.field_i[param3]) {
            return true;
          } else {
            if (lm.field_i[param3] >= lm.field_i[param1]) {
              if (nf.field_z[param3] <= nf.field_z[param1]) {
                if (nf.field_z[param1] <= nf.field_z[param3]) {
                  if (param2 >= -32) {
                    bo.a(true, 73, (byte) 32, -114);
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param3 <= param1) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param3 <= param1) {
                            stackIn_20_0 = 0;
                            break L2;
                          } else {
                            stackIn_20_0 = 1;
                            break L2;
                          }
                        }
                        return stackIn_20_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = -126 % ((-64 - param0) / 53);
    }

    static {
        field_d = 100;
        field_e = 0;
        field_c = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
