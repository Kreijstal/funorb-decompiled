/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends ms {
    static int field_n;
    private String field_l;
    static String[] field_o;
    static int field_j;
    static int field_i;
    private long field_p;
    static int[] field_k;
    static bi field_m;

    public static void b(byte param0) {
        field_o = null;
        field_k = null;
        if (param0 > -44) {
            return;
        }
        field_m = null;
    }

    final static boolean a(byte param0, ln param1, ln param2, int param3, ln param4) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        Object var11 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        if (param1.field_A + -param3 <= param4.field_A) {
          if (param4.field_A <= param3 + param1.field_A) {
            var5 = param2.field_A - param4.field_A;
            var6 = param2.field_S + -param4.field_S;
            if (var5 == 0) {
              L0: {
                if (-param4.field_A + param1.field_A <= param3) {
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  break L0;
                } else {
                  stackOut_57_0 = 1;
                  stackIn_59_0 = stackOut_57_0;
                  break L0;
                }
              }
              return stackIn_59_0 != 0;
            } else {
              if (0 == var6) {
                L1: {
                  if (param3 >= param1.field_S - param4.field_S) {
                    stackOut_64_0 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    break L1;
                  } else {
                    stackOut_63_0 = 1;
                    stackIn_65_0 = stackOut_63_0;
                    break L1;
                  }
                }
                return stackIn_65_0 != 0;
              } else {
                if (param0 < 88) {
                  L2: {
                    var11 = null;
                    boolean discarded$3 = kp.a((byte) 115, (ln) null, (ln) null, -109, (ln) null);
                    var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                    var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                    if (param3 >= (int)var9) {
                      stackOut_73_0 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      break L2;
                    } else {
                      stackOut_72_0 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      break L2;
                    }
                  }
                  return stackIn_74_0 != 0;
                } else {
                  L3: {
                    var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                    var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                    if (param3 >= (int)var9) {
                      stackOut_69_0 = 0;
                      stackIn_70_0 = stackOut_69_0;
                      break L3;
                    } else {
                      stackOut_68_0 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      break L3;
                    }
                  }
                  return stackIn_70_0 != 0;
                }
              }
            }
          } else {
            if (param1.field_A + param3 >= param2.field_A) {
              var5 = param2.field_A - param4.field_A;
              var6 = param2.field_S + -param4.field_S;
              if (var5 == 0) {
                L4: {
                  if (-param4.field_A + param1.field_A <= param3) {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L4;
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L4;
                  }
                }
                return stackIn_37_0 != 0;
              } else {
                if (0 == var6) {
                  L5: {
                    if (param3 >= param1.field_S - param4.field_S) {
                      stackOut_42_0 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      break L5;
                    } else {
                      stackOut_41_0 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L5;
                    }
                  }
                  return stackIn_43_0 != 0;
                } else {
                  if (param0 < 88) {
                    L6: {
                      var11 = null;
                      boolean discarded$4 = kp.a((byte) 115, (ln) null, (ln) null, -109, (ln) null);
                      var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                      var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                      if (param3 >= (int)var9) {
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        break L6;
                      } else {
                        stackOut_50_0 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        break L6;
                      }
                    }
                    return stackIn_52_0 != 0;
                  } else {
                    L7: {
                      var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                      var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                      if (param3 >= (int)var9) {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L7;
                      } else {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        break L7;
                      }
                    }
                    return stackIn_48_0 != 0;
                  }
                }
              }
            } else {
              return true;
            }
          }
        } else {
          if (param2.field_A >= param1.field_A + -param3) {
            L8: {
              if (param4.field_A <= param3 + param1.field_A) {
                break L8;
              } else {
                if (param1.field_A + param3 < param2.field_A) {
                  return true;
                } else {
                  break L8;
                }
              }
            }
            var5 = param2.field_A - param4.field_A;
            var6 = param2.field_S + -param4.field_S;
            if (var5 == 0) {
              L9: {
                if (-param4.field_A + param1.field_A <= param3) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L9;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L9;
                }
              }
              return stackIn_12_0 != 0;
            } else {
              if (0 == var6) {
                L10: {
                  if (param3 >= param1.field_S - param4.field_S) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L10;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L10;
                  }
                }
                return stackIn_18_0 != 0;
              } else {
                if (param0 >= 88) {
                  L11: {
                    var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                    var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                    if (param3 >= (int)var9) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L11;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L11;
                    }
                  }
                  return stackIn_27_0 != 0;
                } else {
                  L12: {
                    var11 = null;
                    boolean discarded$5 = kp.a((byte) 115, (ln) null, (ln) null, -109, (ln) null);
                    var7 = Math.sqrt((double)(var6 * var6 + var5 * var5));
                    var9 = (double)(-((param1.field_S - param4.field_S) * var5) + (param1.field_A + -param4.field_A) * var6) / var7;
                    if (param3 >= (int)var9) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L12;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L12;
                    }
                  }
                  return stackIn_23_0 != 0;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void c(int param0) {
        ce.a(kq.f((byte) 126), true);
        if (param0 != -1) {
            field_n = 16;
        }
    }

    ds a(byte param0) {
        int var2 = 46 % ((param0 - -7) / 41);
        return oi.field_b;
    }

    final void a(ob param0, byte param1) {
        param0.b(-16426, ((kp) this).field_p);
        param0.b((byte) -120, ((kp) this).field_l);
        if (param1 <= 67) {
            kp.b((byte) -120);
        }
    }

    kp(long param0, String param1) {
        ((kp) this).field_l = param1;
        ((kp) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
    }
}
