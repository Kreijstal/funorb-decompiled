/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni extends r {
    private int field_J;
    static hh field_M;
    private int field_L;
    static int[] field_D;
    static o field_N;
    private int field_I;
    private boolean field_P;
    static String field_K;
    static int field_O;
    private int field_H;
    static boolean field_F;
    static String field_G;
    private boolean field_E;

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        super.a(param0, param1, param2, param3, param4, (byte) -96);
        ((ni) this).field_t = 0;
        int var7 = 58 % ((-39 - param5) / 45);
    }

    public static void l(int param0) {
        if (param0 >= -90) {
          field_F = false;
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        } else {
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        }
    }

    private ni(int param0, int param1, int param2, int param3, db param4, wn param5, hm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ni) this).field_H = 2147483647;
        ((ni) this).field_I = 2147483647;
        ((ni) this).field_P = param8 ? true : false;
        ((ni) this).field_C = param6;
        ((ni) this).field_E = param7 ? true : false;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 == 0) {
          if (((ni) this).a(param3, param1, param2, false)) {
            ((ni) this).a(param1, param2, param3, 1);
            ((ni) this).a(param3, (byte) 95, param1, param2);
            StringBuilder discarded$4 = param2.append(" revert=").append(((ni) this).field_E);
            if (-2147483648 != (((ni) this).field_H ^ -1)) {
              if (2147483647 == ((ni) this).field_I) {
                return param2;
              } else {
                StringBuilder discarded$5 = param2.append(" to ").append(((ni) this).field_H).append(44).append(((ni) this).field_I);
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          field_O = 81;
          if (((ni) this).a(param3, param1, param2, false)) {
            ((ni) this).a(param1, param2, param3, 1);
            ((ni) this).a(param3, (byte) 95, param1, param2);
            StringBuilder discarded$6 = param2.append(" revert=").append(((ni) this).field_E);
            if (-2147483648 == (((ni) this).field_H ^ -1)) {
              return param2;
            } else {
              L0: {
                if (2147483647 != ((ni) this).field_I) {
                  StringBuilder discarded$7 = param2.append(" to ").append(((ni) this).field_H).append(44).append(((ni) this).field_I);
                  break L0;
                } else {
                  break L0;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    final void k(int param0) {
        if (param0 != -6844) {
          return;
        } else {
          super.k(param0 + 0);
          ((ni) this).field_C.a(((ni) this).field_g, 0, 0, true, ((ni) this).field_x);
          ((ni) this).field_I = ((ni) this).field_j;
          ((ni) this).field_H = ((ni) this).field_k;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((ni) this).field_P) {
            if (!((ni) this).a(param1, param3, param4, (byte) 97, param0)) {
              return var8 != 0;
            } else {
              L0: {
                ((ni) this).field_t = param6;
                if (param6 == 1) {
                  ((ni) this).field_J = -((ni) this).field_k + (param1 - param4);
                  ((ni) this).field_L = -((ni) this).field_j + (param3 + -param0);
                  gf.field_b = (ni) this;
                  break L0;
                } else {
                  break L0;
                }
              }
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (((ni) this).a(param1, param3, param4, (byte) 97, param0)) {
            ((ni) this).field_t = param6;
            if (param6 != 1) {
              return true;
            } else {
              ((ni) this).field_J = -((ni) this).field_k + (param1 - param4);
              ((ni) this).field_L = -((ni) this).field_j + (param3 + -param0);
              gf.field_b = (ni) this;
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        if (((ni) this).field_C instanceof hc) {
          if (((hc) (Object) ((ni) this).field_C).field_y) {
            if ((((ni) this).field_t ^ -1) != -2) {
              if (!((ni) this).field_E) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L0: {
                  if (((ni) this).field_k == ((ni) this).field_H) {
                    break L0;
                  } else {
                    L1: {
                      var5 = -((ni) this).field_k + ((ni) this).field_H;
                      stackOut_63_0 = this;
                      stackOut_63_1 = ((ni) this).field_k;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      if (Math.abs(var5) <= 2) {
                        stackOut_65_0 = this;
                        stackOut_65_1 = stackIn_65_1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (var5 <= 0) {
                          stackOut_67_0 = this;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = -1;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L1;
                        } else {
                          stackOut_66_0 = this;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = 1;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          break L1;
                        }
                      } else {
                        stackOut_64_0 = this;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = var5 >> 1161508993;
                        stackIn_68_0 = stackOut_64_0;
                        stackIn_68_1 = stackOut_64_1;
                        stackIn_68_2 = stackOut_64_2;
                        break L1;
                      }
                    }
                    ((ni) this).field_k = stackIn_68_1 + stackIn_68_2;
                    break L0;
                  }
                }
                if (((ni) this).field_j != ((ni) this).field_I) {
                  L2: {
                    var5 = -((ni) this).field_j + ((ni) this).field_I;
                    stackOut_71_0 = this;
                    stackOut_71_1 = ((ni) this).field_j;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (Math.abs(var5) >= -3) {
                      L3: {
                        stackOut_73_0 = this;
                        stackOut_73_1 = stackIn_73_1;
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        if (-1 >= var5) {
                          stackOut_75_0 = this;
                          stackOut_75_1 = stackIn_75_1;
                          stackOut_75_2 = -1;
                          stackIn_76_0 = stackOut_75_0;
                          stackIn_76_1 = stackOut_75_1;
                          stackIn_76_2 = stackOut_75_2;
                          break L3;
                        } else {
                          stackOut_74_0 = this;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = 1;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_76_1 = stackOut_74_1;
                          stackIn_76_2 = stackOut_74_2;
                          break L3;
                        }
                      }
                      ((ni) this).field_j = stackIn_76_1 + stackIn_76_2;
                      break L2;
                    } else {
                      ((ni) this).field_j = stackIn_72_1 + (var5 >> 799813793);
                      break L2;
                    }
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              var5 = -((ni) this).field_J + dh.field_d - param2;
              var6 = -param1 + -((ni) this).field_L + bj.field_y;
              if (var5 == ((ni) this).field_k) {
                if (((ni) this).field_j != var6) {
                  ((ni) this).field_j = var6;
                  ((ni) this).field_k = var5;
                  if (((ni) this).field_q instanceof nd) {
                    ((nd) (Object) ((ni) this).field_q).a((ni) this, param1, param2, 32468);
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
              } else {
                ((ni) this).field_j = var6;
                ((ni) this).field_k = var5;
                if (((ni) this).field_q instanceof nd) {
                  ((nd) (Object) ((ni) this).field_q).a((ni) this, param1, param2, 32468);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
          } else {
            if (!((ni) this).field_E) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((ni) this).field_k == ((ni) this).field_H) {
                  break L4;
                } else {
                  L5: {
                    var5 = -((ni) this).field_k + ((ni) this).field_H;
                    stackOut_32_0 = this;
                    stackOut_32_1 = ((ni) this).field_k;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_34_0 = this;
                      stackOut_34_1 = stackIn_34_1;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (var5 <= 0) {
                        stackOut_36_0 = this;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = -1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        break L5;
                      } else {
                        stackOut_35_0 = this;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_37_2 = stackOut_35_2;
                        break L5;
                      }
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = stackIn_33_1;
                      stackOut_33_2 = var5 >> 1161508993;
                      stackIn_37_0 = stackOut_33_0;
                      stackIn_37_1 = stackOut_33_1;
                      stackIn_37_2 = stackOut_33_2;
                      break L5;
                    }
                  }
                  ((ni) this).field_k = stackIn_37_1 + stackIn_37_2;
                  break L4;
                }
              }
              if (((ni) this).field_j != ((ni) this).field_I) {
                L6: {
                  var5 = -((ni) this).field_j + ((ni) this).field_I;
                  stackOut_40_0 = this;
                  stackOut_40_1 = ((ni) this).field_j;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  if (Math.abs(var5) >= -3) {
                    L7: {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (-1 >= var5) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = -1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        break L7;
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        stackIn_45_2 = stackOut_43_2;
                        break L7;
                      }
                    }
                    ((ni) this).field_j = stackIn_45_1 + stackIn_45_2;
                    break L6;
                  } else {
                    ((ni) this).field_j = stackIn_41_1 + (var5 >> 799813793);
                    break L6;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        } else {
          if ((((ni) this).field_t ^ -1) != -2) {
            if (((ni) this).field_E) {
              L8: {
                if (((ni) this).field_k == ((ni) this).field_H) {
                  break L8;
                } else {
                  L9: {
                    var5 = -((ni) this).field_k + ((ni) this).field_H;
                    stackOut_12_0 = this;
                    stackOut_12_1 = ((ni) this).field_k;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var5 <= 0) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L9;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L9;
                      }
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = var5 >> 1161508993;
                      stackIn_17_0 = stackOut_13_0;
                      stackIn_17_1 = stackOut_13_1;
                      stackIn_17_2 = stackOut_13_2;
                      break L9;
                    }
                  }
                  ((ni) this).field_k = stackIn_17_1 + stackIn_17_2;
                  break L8;
                }
              }
              if (((ni) this).field_j != ((ni) this).field_I) {
                L10: {
                  var5 = -((ni) this).field_j + ((ni) this).field_I;
                  stackOut_20_0 = this;
                  stackOut_20_1 = ((ni) this).field_j;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  if (Math.abs(var5) >= -3) {
                    L11: {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      if (-1 >= var5) {
                        stackOut_24_0 = this;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L11;
                      } else {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L11;
                      }
                    }
                    ((ni) this).field_j = stackIn_25_1 + stackIn_25_2;
                    break L10;
                  } else {
                    ((ni) this).field_j = stackIn_21_1 + (var5 >> 799813793);
                    break L10;
                  }
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
          } else {
            L12: {
              var5 = -((ni) this).field_J + dh.field_d - param2;
              var6 = -param1 + -((ni) this).field_L + bj.field_y;
              if (var5 != ((ni) this).field_k) {
                break L12;
              } else {
                if (((ni) this).field_j != var6) {
                  break L12;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
            ((ni) this).field_j = var6;
            ((ni) this).field_k = var5;
            if (((ni) this).field_q instanceof nd) {
              ((nd) (Object) ((ni) this).field_q).a((ni) this, param1, param2, 32468);
              super.a(param0, param1, param2, param3);
              return;
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          }
        }
    }

    final static int a(int param0, int param1, boolean param2, int[] param3) {
        int var4 = 0;
        if (!(0 <= param1)) {
            return 0;
        }
        if (param2) {
            field_O = 75;
            if (!(param3.length > param1)) {
                return 0;
            }
            var4 = param3[param1];
            return ul.a(var4, param0, 112);
        }
        if (!(param3.length > param1)) {
            return 0;
        }
        var4 = param3[param1];
        return ul.a(var4, param0, 112);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Connection restored.";
        field_O = -1;
        field_D = new int[8192];
        field_G = "Account created successfully!";
    }
}
