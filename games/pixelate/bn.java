/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bn extends ie {
    private boolean field_R;
    private boolean field_O;
    static tf[] field_P;
    static String field_L;
    private int field_T;
    private int field_N;
    static int field_Q;
    static eq field_S;
    private int field_M;
    static ak field_I;
    private int field_K;

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((bn) this).a(param0 ^ -86, param5, param3, param6, param4)) {
            L0: {
              if (1 == param2) {
                ((bn) this).field_N = param4 - ((bn) this).field_z - param5;
                ((bn) this).field_K = -param3 + -((bn) this).field_p + param6;
                qf.field_a = (bn) this;
                break L0;
              } else {
                break L0;
              }
            }
            ((bn) this).field_k = param2;
            return true;
          } else {
            return var8 != 0;
          }
        } else {
          if (!((bn) this).field_O) {
            if (((bn) this).a(param0 ^ -86, param5, param3, param6, param4)) {
              L1: {
                if (1 == param2) {
                  ((bn) this).field_N = param4 - ((bn) this).field_z - param5;
                  ((bn) this).field_K = -param3 + -((bn) this).field_p + param6;
                  qf.field_a = (bn) this;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((bn) this).field_k = param2;
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        Object var6 = null;
        if (((bn) this).a(-119, param2, param0, param3)) {
          ((bn) this).a(param2, (byte) -2, param3, param0);
          ((bn) this).a(param3, (byte) -91, param0, param2);
          StringBuilder discarded$6 = param0.append(" revert=").append(((bn) this).field_R);
          if (((bn) this).field_T != 2147483647) {
            if (2147483647 != ((bn) this).field_M) {
              StringBuilder discarded$7 = param0.append(" to ").append(((bn) this).field_T).append(44).append(((bn) this).field_M);
              if (param1) {
                var6 = null;
                StringBuilder discarded$8 = ((bn) this).a((StringBuilder) null, false, 63, (Hashtable) null);
                return param0;
              } else {
                return param0;
              }
            } else {
              L0: {
                if (!param1) {
                  break L0;
                } else {
                  var6 = null;
                  StringBuilder discarded$9 = ((bn) this).a((StringBuilder) null, false, 63, (Hashtable) null);
                  break L0;
                }
              }
              return param0;
            }
          } else {
            if (param1) {
              var6 = null;
              StringBuilder discarded$10 = ((bn) this).a((StringBuilder) null, false, 63, (Hashtable) null);
              return param0;
            } else {
              return param0;
            }
          }
        } else {
          if (param1) {
            var6 = null;
            StringBuilder discarded$11 = ((bn) this).a((StringBuilder) null, false, 63, (Hashtable) null);
            return param0;
          } else {
            return param0;
          }
        }
    }

    public static void m(int param0) {
        field_S = null;
        field_L = null;
        if (param0 >= -10) {
          bn.n(-45);
          field_I = null;
          field_P = null;
          return;
        } else {
          field_I = null;
          field_P = null;
          return;
        }
    }

    private bn(int param0, int param1, int param2, int param3, eb param4, fn param5, ng param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((bn) this).field_T = 2147483647;
        ((bn) this).field_M = 2147483647;
        ((bn) this).field_R = param7 ? true : false;
        ((bn) this).field_H = param6;
        ((bn) this).field_O = param8 ? true : false;
    }

    final static void n(int param0) {
        if (param0 != 2147483647) {
            field_P = null;
            te.a(17, -2671);
            return;
        }
        te.a(17, -2671);
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3 + param3, param4, param5);
        ((bn) this).field_k = 0;
    }

    final void a(int param0, int param1, int param2, ng param3) {
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
        if (((bn) this).field_H instanceof qm) {
          if (((qm) (Object) ((bn) this).field_H).field_H) {
            if (1 == ((bn) this).field_k) {
              var5 = -((bn) this).field_N + uf.field_d + -param2;
              var6 = -param1 + -((bn) this).field_K + bg.field_k;
              if (var5 != ((bn) this).field_z) {
                ((bn) this).field_p = var6;
                ((bn) this).field_z = var5;
                if (((bn) this).field_n instanceof eo) {
                  ((eo) (Object) ((bn) this).field_n).a(param2, (bn) this, param1, 31);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((bn) this).field_p) {
                  ((bn) this).field_p = var6;
                  ((bn) this).field_z = var5;
                  if (((bn) this).field_n instanceof eo) {
                    ((eo) (Object) ((bn) this).field_n).a(param2, (bn) this, param1, 31);
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
              if (((bn) this).field_R) {
                L0: {
                  if (((bn) this).field_T != ((bn) this).field_z) {
                    L1: {
                      var5 = ((bn) this).field_T + -((bn) this).field_z;
                      stackOut_62_0 = this;
                      stackOut_62_1 = ((bn) this).field_z;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        stackOut_64_0 = this;
                        stackOut_64_1 = stackIn_64_1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (var5 > 0) {
                          stackOut_66_0 = this;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = 1;
                          stackIn_67_0 = stackOut_66_0;
                          stackIn_67_1 = stackOut_66_1;
                          stackIn_67_2 = stackOut_66_2;
                          break L1;
                        } else {
                          stackOut_65_0 = this;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = -1;
                          stackIn_67_0 = stackOut_65_0;
                          stackIn_67_1 = stackOut_65_1;
                          stackIn_67_2 = stackOut_65_2;
                          break L1;
                        }
                      } else {
                        stackOut_63_0 = this;
                        stackOut_63_1 = stackIn_63_1;
                        stackOut_63_2 = var5 >> -1387103807;
                        stackIn_67_0 = stackOut_63_0;
                        stackIn_67_1 = stackOut_63_1;
                        stackIn_67_2 = stackOut_63_2;
                        break L1;
                      }
                    }
                    ((bn) this).field_z = stackIn_67_1 + stackIn_67_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((bn) this).field_p != ((bn) this).field_M) {
                  L2: {
                    L3: {
                      var5 = ((bn) this).field_M + -((bn) this).field_p;
                      stackOut_70_0 = this;
                      stackOut_70_1 = ((bn) this).field_p;
                      stackIn_74_0 = stackOut_70_0;
                      stackIn_74_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (Math.abs(var5) > 2) {
                        stackOut_74_0 = this;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = var5 >> 2002693313;
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
                        if (-1 <= (var5 ^ -1)) {
                          stackOut_73_0 = this;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = -1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          break L3;
                        } else {
                          ((bn) this).field_p = stackIn_72_1 + 1;
                          break L2;
                        }
                      }
                    }
                    ((bn) this).field_p = stackIn_75_1 + stackIn_75_2;
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
            if (((bn) this).field_R) {
              L4: {
                if (((bn) this).field_T != ((bn) this).field_z) {
                  L5: {
                    var5 = ((bn) this).field_T + -((bn) this).field_z;
                    stackOut_41_0 = this;
                    stackOut_41_1 = ((bn) this).field_z;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_43_0 = this;
                      stackOut_43_1 = stackIn_43_1;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      if (var5 > 0) {
                        stackOut_45_0 = this;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = 1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        break L5;
                      } else {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = -1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_46_2 = stackOut_44_2;
                        break L5;
                      }
                    } else {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = var5 >> -1387103807;
                      stackIn_46_0 = stackOut_42_0;
                      stackIn_46_1 = stackOut_42_1;
                      stackIn_46_2 = stackOut_42_2;
                      break L5;
                    }
                  }
                  ((bn) this).field_z = stackIn_46_1 + stackIn_46_2;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((bn) this).field_p != ((bn) this).field_M) {
                L6: {
                  L7: {
                    var5 = ((bn) this).field_M + -((bn) this).field_p;
                    stackOut_49_0 = this;
                    stackOut_49_1 = ((bn) this).field_p;
                    stackIn_53_0 = stackOut_49_0;
                    stackIn_53_1 = stackOut_49_1;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    if (Math.abs(var5) > 2) {
                      stackOut_53_0 = this;
                      stackOut_53_1 = stackIn_53_1;
                      stackOut_53_2 = var5 >> 2002693313;
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
                      if (-1 <= (var5 ^ -1)) {
                        stackOut_52_0 = this;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = -1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        stackIn_54_2 = stackOut_52_2;
                        break L7;
                      } else {
                        ((bn) this).field_p = stackIn_51_1 + 1;
                        break L6;
                      }
                    }
                  }
                  ((bn) this).field_p = stackIn_54_1 + stackIn_54_2;
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
          if (1 == ((bn) this).field_k) {
            var5 = -((bn) this).field_N + uf.field_d + -param2;
            var6 = -param1 + -((bn) this).field_K + bg.field_k;
            if (var5 != ((bn) this).field_z) {
              ((bn) this).field_p = var6;
              ((bn) this).field_z = var5;
              if (((bn) this).field_n instanceof eo) {
                ((eo) (Object) ((bn) this).field_n).a(param2, (bn) this, param1, 31);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (var6 != ((bn) this).field_p) {
                ((bn) this).field_p = var6;
                ((bn) this).field_z = var5;
                if (((bn) this).field_n instanceof eo) {
                  ((eo) (Object) ((bn) this).field_n).a(param2, (bn) this, param1, 31);
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
            if (((bn) this).field_R) {
              L8: {
                if (((bn) this).field_T != ((bn) this).field_z) {
                  L9: {
                    var5 = ((bn) this).field_T + -((bn) this).field_z;
                    stackOut_6_0 = this;
                    stackOut_6_1 = ((bn) this).field_z;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = stackIn_8_1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 > 0) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L9;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = -1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L9;
                      }
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = var5 >> -1387103807;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_11_2 = stackOut_7_2;
                      break L9;
                    }
                  }
                  ((bn) this).field_z = stackIn_11_1 + stackIn_11_2;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (((bn) this).field_p != ((bn) this).field_M) {
                L10: {
                  L11: {
                    var5 = ((bn) this).field_M + -((bn) this).field_p;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((bn) this).field_p;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (Math.abs(var5) > 2) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> 2002693313;
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
                      if (-1 <= (var5 ^ -1)) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L11;
                      } else {
                        ((bn) this).field_p = stackIn_16_1 + 1;
                        break L10;
                      }
                    }
                  }
                  ((bn) this).field_p = stackIn_19_1 + stackIn_19_2;
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

    final void j(int param0) {
        super.j(0);
        ((bn) this).field_H.a(((bn) this).field_E, (byte) 67, param0, 0, ((bn) this).field_C);
        ((bn) this).field_T = ((bn) this).field_z;
        ((bn) this).field_M = ((bn) this).field_p;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Green Grow The Rushes O";
    }
}
