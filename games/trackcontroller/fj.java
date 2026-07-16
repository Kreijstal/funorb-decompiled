/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj extends ok {
    private boolean field_L;
    private int field_K;
    private int field_E;
    private int field_Q;
    static java.math.BigInteger field_N;
    private int field_I;
    static ng[] field_M;
    static ja field_H;
    private boolean field_J;
    static nb field_P;
    static String field_O;
    static int field_S;
    static String field_R;
    static int field_U;
    static int field_T;

    private fj(int param0, int param1, int param2, int param3, t param4, tg param5, al param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((fj) this).field_E = 2147483647;
        ((fj) this).field_Q = 2147483647;
        ((fj) this).field_B = param6;
        ((fj) this).field_J = param8 ? true : false;
        ((fj) this).field_L = param7 ? true : false;
    }

    final void a(byte param0) {
        super.a((byte) 107);
        int var2 = 95 / ((48 - param0) / 40);
        ((fj) this).field_B.a(((fj) this).field_u, -3050, 0, ((fj) this).field_x, 0);
        ((fj) this).field_Q = ((fj) this).field_p;
        ((fj) this).field_E = ((fj) this).field_m;
    }

    public static void e(byte param0) {
        if (param0 != 118) {
          fj.e((byte) 71);
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        } else {
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        }
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((fj) this).field_r = 0;
    }

    final static int b(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -48) {
          L0: {
            if ((param1 ^ -1) > -49) {
              break L0;
            } else {
              if (57 < param1) {
                break L0;
              } else {
                return -48 + param1;
              }
            }
          }
          L1: {
            if (-98 < (param1 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) < -123) {
                break L1;
              } else {
                return -87 - -param1;
              }
            }
          }
          L2: {
            if (65 > param1) {
              break L2;
            } else {
              if ((param1 ^ -1) < -91) {
                break L2;
              } else {
                return 36 - (65 + -param1);
              }
            }
          }
          L3: {
            if (param1 != 43) {
              stackOut_46_0 = 63;
              stackIn_47_0 = stackOut_46_0;
              break L3;
            } else {
              stackOut_45_0 = 62;
              stackIn_47_0 = stackOut_45_0;
              break L3;
            }
          }
          return stackIn_47_0;
        } else {
          fj.e((byte) -76);
          if ((param1 ^ -1) <= -49) {
            if (57 >= param1) {
              return -48 + param1;
            } else {
              L4: {
                if (-98 < (param1 ^ -1)) {
                  break L4;
                } else {
                  if ((param1 ^ -1) < -123) {
                    break L4;
                  } else {
                    return -87 - -param1;
                  }
                }
              }
              L5: {
                if (65 > param1) {
                  break L5;
                } else {
                  if ((param1 ^ -1) < -91) {
                    break L5;
                  } else {
                    return 36 - (65 + -param1);
                  }
                }
              }
              L6: {
                if (param1 != 43) {
                  stackOut_32_0 = 63;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = 62;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              return stackIn_33_0;
            }
          } else {
            if (-98 >= (param1 ^ -1)) {
              if ((param1 ^ -1) >= -123) {
                return -87 - -param1;
              } else {
                L7: {
                  if (65 > param1) {
                    break L7;
                  } else {
                    if ((param1 ^ -1) < -91) {
                      break L7;
                    } else {
                      return 36 - (65 + -param1);
                    }
                  }
                }
                L8: {
                  if (param1 != 43) {
                    stackOut_20_0 = 63;
                    stackIn_21_0 = stackOut_20_0;
                    break L8;
                  } else {
                    stackOut_19_0 = 62;
                    stackIn_21_0 = stackOut_19_0;
                    break L8;
                  }
                }
                return stackIn_21_0;
              }
            } else {
              if (65 <= param1) {
                if ((param1 ^ -1) >= -91) {
                  return 36 - (65 + -param1);
                } else {
                  L9: {
                    if (param1 != 43) {
                      stackOut_11_0 = 63;
                      stackIn_12_0 = stackOut_11_0;
                      break L9;
                    } else {
                      stackOut_10_0 = 62;
                      stackIn_12_0 = stackOut_10_0;
                      break L9;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                L10: {
                  if (param1 != 43) {
                    stackOut_6_0 = 63;
                    stackIn_7_0 = stackOut_6_0;
                    break L10;
                  } else {
                    stackOut_5_0 = 62;
                    stackIn_7_0 = stackOut_5_0;
                    break L10;
                  }
                }
                return stackIn_7_0;
              }
            }
          }
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((fj) this).a(param5, param6, param2, false, param1)) {
            if (-2 == (param3 ^ -1)) {
              rf.field_e = (fj) this;
              ((fj) this).field_I = param1 + (-((fj) this).field_m + -param6);
              ((fj) this).field_K = -param5 + -((fj) this).field_p + param2;
              ((fj) this).field_r = param3;
              return true;
            } else {
              ((fj) this).field_r = param3;
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((fj) this).field_J) {
            if (((fj) this).a(param5, param6, param2, false, param1)) {
              if (-2 != (param3 ^ -1)) {
                ((fj) this).field_r = param3;
                return true;
              } else {
                rf.field_e = (fj) this;
                ((fj) this).field_I = param1 + (-((fj) this).field_m + -param6);
                ((fj) this).field_K = -param5 + -((fj) this).field_p + param2;
                ((fj) this).field_r = param3;
                return true;
              }
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        if (((fj) this).a((byte) 116, param3, param2, param1)) {
          ((fj) this).a(34, param2, param3, param1);
          ((fj) this).a(-51, param1, param2, param3);
          StringBuilder discarded$35 = param2.append(" revert=").append(((fj) this).field_L);
          if (((fj) this).field_Q != 2147483647) {
            if ((((fj) this).field_E ^ -1) != -2147483648) {
              StringBuilder discarded$36 = param2.append(" to ").append(((fj) this).field_Q).append(44).append(((fj) this).field_E);
              if (param0) {
                ((fj) this).a((byte) -42);
                return param2;
              } else {
                return param2;
              }
            } else {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  ((fj) this).a((byte) -42);
                  break L0;
                }
              }
              return param2;
            }
          } else {
            if (param0) {
              ((fj) this).a((byte) -42);
              return param2;
            } else {
              return param2;
            }
          }
        } else {
          if (param0) {
            ((fj) this).a((byte) -42);
            return param2;
          } else {
            return param2;
          }
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        if (((fj) this).field_B instanceof rh) {
          if (((rh) (Object) ((fj) this).field_B).field_B) {
            if (1 == ((fj) this).field_r) {
              var5 = -((fj) this).field_K + (kf.field_b - param1);
              var6 = -param0 + (-((fj) this).field_I + fg.field_a);
              if (((fj) this).field_p != var5) {
                ((fj) this).field_m = var6;
                ((fj) this).field_p = var5;
                if (((fj) this).field_l instanceof ek) {
                  ((ek) (Object) ((fj) this).field_l).a((fj) this, param0, param1, param2 + -21487);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (((fj) this).field_m != var6) {
                  ((fj) this).field_m = var6;
                  ((fj) this).field_p = var5;
                  if (((fj) this).field_l instanceof ek) {
                    ((ek) (Object) ((fj) this).field_l).a((fj) this, param0, param1, param2 + -21487);
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((fj) this).field_L) {
                L0: {
                  if (((fj) this).field_Q != ((fj) this).field_p) {
                    L1: {
                      var5 = -((fj) this).field_p + ((fj) this).field_Q;
                      stackOut_62_0 = this;
                      stackOut_62_1 = ((fj) this).field_p;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      if (2 >= Math.abs(var5)) {
                        stackOut_64_0 = this;
                        stackOut_64_1 = stackIn_64_1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (var5 <= 0) {
                          stackOut_66_0 = this;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = -1;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          stackIn_67_2 = stackOut_66_2;
                          break L1;
                        } else {
                          stackOut_65_0 = this;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = 1;
                          stackIn_67_0 = stackOut_65_0;
                          stackIn_67_1 = stackOut_65_1;
                          stackIn_67_2 = stackOut_65_2;
                          break L1;
                        }
                      } else {
                        stackOut_63_0 = this;
                        stackOut_63_1 = stackIn_63_1;
                        stackOut_63_2 = var5 >> 181225441;
                        stackIn_67_0 = stackOut_63_0;
                        stackIn_67_1 = stackOut_63_1;
                        stackIn_67_2 = stackOut_63_2;
                        break L1;
                      }
                    }
                    ((fj) this).field_p = stackIn_67_1 + stackIn_67_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((fj) this).field_E != ((fj) this).field_m) {
                  L2: {
                    L3: {
                      var5 = -((fj) this).field_m + ((fj) this).field_E;
                      stackOut_70_0 = this;
                      stackOut_70_1 = ((fj) this).field_m;
                      stackIn_74_0 = stackOut_70_0;
                      stackIn_74_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (-3 > Math.abs(var5)) {
                        stackOut_74_0 = this;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = var5 >> -1210419711;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        stackIn_75_2 = stackOut_74_2;
                        break L3;
                      } else {
                        stackOut_71_0 = this;
                        stackOut_71_1 = stackIn_71_1;
                        stackIn_73_0 = stackOut_71_0;
                        stackIn_73_1 = stackOut_71_1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        if (-1 < var5) {
                          stackOut_73_0 = this;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = 1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          break L3;
                        } else {
                          ((fj) this).field_m = stackIn_72_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((fj) this).field_m = stackIn_75_1 + stackIn_75_2;
                    break L2;
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((fj) this).field_L) {
              L4: {
                if (((fj) this).field_Q != ((fj) this).field_p) {
                  L5: {
                    var5 = -((fj) this).field_p + ((fj) this).field_Q;
                    stackOut_41_0 = this;
                    stackOut_41_1 = ((fj) this).field_p;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if (2 >= Math.abs(var5)) {
                      stackOut_43_0 = this;
                      stackOut_43_1 = stackIn_43_1;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      if (var5 <= 0) {
                        stackOut_45_0 = this;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = -1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        break L5;
                      } else {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        break L5;
                      }
                    } else {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = var5 >> 181225441;
                      stackIn_46_0 = stackOut_42_0;
                      stackIn_46_1 = stackOut_42_1;
                      stackIn_46_2 = stackOut_42_2;
                      break L5;
                    }
                  }
                  ((fj) this).field_p = stackIn_46_1 + stackIn_46_2;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((fj) this).field_E != ((fj) this).field_m) {
                L6: {
                  L7: {
                    var5 = -((fj) this).field_m + ((fj) this).field_E;
                    stackOut_49_0 = this;
                    stackOut_49_1 = ((fj) this).field_m;
                    stackIn_53_0 = stackOut_49_0;
                    stackIn_53_1 = stackOut_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_53_0 = this;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = var5 >> -1210419711;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      stackIn_54_2 = stackOut_53_2;
                      break L7;
                    } else {
                      stackOut_50_0 = this;
                      stackOut_50_1 = stackIn_50_1;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (-1 < var5) {
                        stackOut_52_0 = this;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        stackIn_54_2 = stackOut_52_2;
                        break L7;
                      } else {
                        ((fj) this).field_m = stackIn_51_1 + -1;
                        break L6;
                      }
                    }
                  }
                  ((fj) this).field_m = stackIn_54_1 + stackIn_54_2;
                  break L6;
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          }
        } else {
          if (1 == ((fj) this).field_r) {
            var5 = -((fj) this).field_K + (kf.field_b - param1);
            var6 = -param0 + (-((fj) this).field_I + fg.field_a);
            if (((fj) this).field_p != var5) {
              ((fj) this).field_m = var6;
              ((fj) this).field_p = var5;
              if (((fj) this).field_l instanceof ek) {
                ((ek) (Object) ((fj) this).field_l).a((fj) this, param0, param1, param2 + -21487);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (((fj) this).field_m != var6) {
                ((fj) this).field_m = var6;
                ((fj) this).field_p = var5;
                if (((fj) this).field_l instanceof ek) {
                  ((ek) (Object) ((fj) this).field_l).a((fj) this, param0, param1, param2 + -21487);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((fj) this).field_L) {
              L8: {
                if (((fj) this).field_Q != ((fj) this).field_p) {
                  L9: {
                    var5 = -((fj) this).field_p + ((fj) this).field_Q;
                    stackOut_6_0 = this;
                    stackOut_6_1 = ((fj) this).field_p;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (2 >= Math.abs(var5)) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = stackIn_8_1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 <= 0) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L9;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L9;
                      }
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = var5 >> 181225441;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_11_2 = stackOut_7_2;
                      break L9;
                    }
                  }
                  ((fj) this).field_p = stackIn_11_1 + stackIn_11_2;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (((fj) this).field_E != ((fj) this).field_m) {
                L10: {
                  L11: {
                    var5 = -((fj) this).field_m + ((fj) this).field_E;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((fj) this).field_m;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> -1210419711;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L11;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (-1 < var5) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L11;
                      } else {
                        ((fj) this).field_m = stackIn_16_1 + -1;
                        break L10;
                      }
                    }
                  }
                  ((fj) this).field_m = stackIn_19_1 + stackIn_19_2;
                  break L10;
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 != 1) {
          return -24;
        } else {
          var3 = 0;
          L0: while (true) {
            if ((param0 ^ -1) >= -1) {
              return var3;
            } else {
              var3 = var3 << -1863695327 | param2 & 1;
              param2 = param2 >>> 1;
              param0--;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new java.math.BigInteger("65537");
        field_H = new ja();
        field_O = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "Resume Game";
        field_S = 2;
    }
}
