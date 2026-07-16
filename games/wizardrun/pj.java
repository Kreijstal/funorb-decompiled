/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj extends mi {
    private int field_I;
    private int field_J;
    static rc field_P;
    static ji field_G;
    private int field_N;
    static kl field_M;
    private boolean field_O;
    static String field_L;
    private boolean field_K;
    private int field_H;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = wizardrun.field_H;
        if (param7 < param0) {
          if (param0 < param4) {
            a.a(param6, param5, param0, param2, ed.field_k, param3, param4, -20476, param7);
            if (param1 != 0) {
              pj.g(24);
              return;
            } else {
              return;
            }
          } else {
            if (param4 <= param7) {
              a.a(param3, param5, param7, param6, ed.field_k, param2, param0, -20476, param4);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            } else {
              a.a(param3, param5, param4, param2, ed.field_k, param6, param0, -20476, param7);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param7 < param4) {
            a.a(param6, param5, param7, param3, ed.field_k, param2, param4, -20476, param0);
            if (param1 == 0) {
              return;
            } else {
              pj.g(24);
              return;
            }
          } else {
            if (param4 > param0) {
              a.a(param2, param5, param4, param3, ed.field_k, param6, param7, -20476, param0);
              if (param1 == 0) {
                return;
              } else {
                pj.g(24);
                return;
              }
            } else {
              a.a(param2, param5, param0, param6, ed.field_k, param3, param7, -20476, param4);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (param1 == 102) {
          if (((pj) this).a(param3, param0, param2, true)) {
            ((pj) this).a(109, param2, param0, param3);
            ((pj) this).a(param3, param2, param0, (byte) -101);
            StringBuilder discarded$23 = param3.append(" revert=").append(((pj) this).field_K);
            if (-2147483648 != (((pj) this).field_N ^ -1)) {
              if (((pj) this).field_J == 2147483647) {
                return param3;
              } else {
                StringBuilder discarded$24 = param3.append(" to ").append(((pj) this).field_N).append(44).append(((pj) this).field_J);
                return param3;
              }
            } else {
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          return null;
        }
    }

    public static void g(int param0) {
        field_L = null;
        field_M = null;
        field_G = null;
        field_P = null;
        if (param0 < 103) {
            pj.g(-92);
        }
    }

    final void e(int param0) {
        super.e(param0);
        ((pj) this).field_F.a(110, 0, ((pj) this).field_n, ((pj) this).field_r, 0);
        ((pj) this).field_N = ((pj) this).field_o;
        ((pj) this).field_J = ((pj) this).field_l;
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((pj) this).field_q = 0;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
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
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
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
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        if (((pj) this).field_F instanceof pl) {
          if (((pl) (Object) ((pj) this).field_F).field_B) {
            if (-2 != (((pj) this).field_q ^ -1)) {
              if (((pj) this).field_K) {
                L0: {
                  if (((pj) this).field_N != ((pj) this).field_o) {
                    L1: {
                      var5 = -((pj) this).field_o + ((pj) this).field_N;
                      stackOut_70_0 = this;
                      stackOut_70_1 = ((pj) this).field_o;
                      stackIn_74_0 = stackOut_70_0;
                      stackIn_74_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_74_0 = this;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = var5 >> 1034026305;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        stackIn_75_2 = stackOut_74_2;
                        break L1;
                      } else {
                        stackOut_71_0 = this;
                        stackOut_71_1 = stackIn_71_1;
                        stackIn_73_0 = stackOut_71_0;
                        stackIn_73_1 = stackOut_71_1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        if (var5 > 0) {
                          stackOut_73_0 = this;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = 1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          break L1;
                        } else {
                          stackOut_72_0 = this;
                          stackOut_72_1 = stackIn_72_1;
                          stackOut_72_2 = -1;
                          stackIn_75_0 = stackOut_72_0;
                          stackIn_75_1 = stackOut_72_1;
                          stackIn_75_2 = stackOut_72_2;
                          break L1;
                        }
                      }
                    }
                    ((pj) this).field_o = stackIn_75_1 + stackIn_75_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((pj) this).field_J != ((pj) this).field_l) {
                  L2: {
                    L3: {
                      var5 = ((pj) this).field_J + -((pj) this).field_l;
                      stackOut_78_0 = this;
                      stackOut_78_1 = ((pj) this).field_l;
                      stackIn_82_0 = stackOut_78_0;
                      stackIn_82_1 = stackOut_78_1;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_82_0 = this;
                        stackOut_82_1 = stackIn_82_1;
                        stackOut_82_2 = var5 >> -639331295;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        stackIn_83_2 = stackOut_82_2;
                        break L3;
                      } else {
                        stackOut_79_0 = this;
                        stackOut_79_1 = stackIn_79_1;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_81_1 = stackOut_79_1;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
                        if (var5 > 0) {
                          stackOut_81_0 = this;
                          stackOut_81_1 = stackIn_81_1;
                          stackOut_81_2 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          stackIn_83_2 = stackOut_81_2;
                          break L3;
                        } else {
                          ((pj) this).field_l = stackIn_80_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((pj) this).field_l = stackIn_83_1 + stackIn_83_2;
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
            } else {
              var5 = -((pj) this).field_H + (pg.field_n - param2);
              var6 = -((pj) this).field_I + (fi.field_B + -param1);
              if (((pj) this).field_o != var5) {
                ((pj) this).field_l = var6;
                ((pj) this).field_o = var5;
                if (!(((pj) this).field_s instanceof ah)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((ah) (Object) ((pj) this).field_s).a(param2, (pj) this, param1, param0 ^ 10000622);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (((pj) this).field_l == var6) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  L4: {
                    ((pj) this).field_l = var6;
                    ((pj) this).field_o = var5;
                    if (!(((pj) this).field_s instanceof ah)) {
                      break L4;
                    } else {
                      ((ah) (Object) ((pj) this).field_s).a(param2, (pj) this, param1, param0 ^ 10000622);
                      break L4;
                    }
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
          } else {
            if (((pj) this).field_K) {
              L5: {
                if (((pj) this).field_N != ((pj) this).field_o) {
                  L6: {
                    var5 = -((pj) this).field_o + ((pj) this).field_N;
                    stackOut_38_0 = this;
                    stackOut_38_1 = ((pj) this).field_o;
                    stackIn_42_0 = stackOut_38_0;
                    stackIn_42_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = var5 >> 1034026305;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      stackIn_43_2 = stackOut_42_2;
                      break L6;
                    } else {
                      stackOut_39_0 = this;
                      stackOut_39_1 = stackIn_39_1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      if (var5 > 0) {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        break L6;
                      } else {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = -1;
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_43_1 = stackOut_40_1;
                        stackIn_43_2 = stackOut_40_2;
                        break L6;
                      }
                    }
                  }
                  ((pj) this).field_o = stackIn_43_1 + stackIn_43_2;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (((pj) this).field_J != ((pj) this).field_l) {
                L7: {
                  L8: {
                    var5 = ((pj) this).field_J + -((pj) this).field_l;
                    stackOut_46_0 = this;
                    stackOut_46_1 = ((pj) this).field_l;
                    stackIn_50_0 = stackOut_46_0;
                    stackIn_50_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_50_0 = this;
                      stackOut_50_1 = stackIn_50_1;
                      stackOut_50_2 = var5 >> -639331295;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      stackIn_51_2 = stackOut_50_2;
                      break L8;
                    } else {
                      stackOut_47_0 = this;
                      stackOut_47_1 = stackIn_47_1;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (var5 > 0) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        stackIn_51_2 = stackOut_49_2;
                        break L8;
                      } else {
                        ((pj) this).field_l = stackIn_48_1 + -1;
                        break L7;
                      }
                    }
                  }
                  ((pj) this).field_l = stackIn_51_1 + stackIn_51_2;
                  break L7;
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
          if (-2 != (((pj) this).field_q ^ -1)) {
            if (((pj) this).field_K) {
              L9: {
                if (((pj) this).field_N != ((pj) this).field_o) {
                  L10: {
                    var5 = -((pj) this).field_o + ((pj) this).field_N;
                    stackOut_17_0 = this;
                    stackOut_17_1 = ((pj) this).field_o;
                    stackIn_21_0 = stackOut_17_0;
                    stackIn_21_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = var5 >> 1034026305;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      break L10;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (var5 > 0) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L10;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = -1;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        break L10;
                      }
                    }
                  }
                  ((pj) this).field_o = stackIn_22_1 + stackIn_22_2;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (((pj) this).field_J != ((pj) this).field_l) {
                L11: {
                  L12: {
                    var5 = ((pj) this).field_J + -((pj) this).field_l;
                    stackOut_25_0 = this;
                    stackOut_25_1 = ((pj) this).field_l;
                    stackIn_29_0 = stackOut_25_0;
                    stackIn_29_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = var5 >> -639331295;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      break L12;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (var5 > 0) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        break L12;
                      } else {
                        ((pj) this).field_l = stackIn_27_1 + -1;
                        break L11;
                      }
                    }
                  }
                  ((pj) this).field_l = stackIn_30_1 + stackIn_30_2;
                  break L11;
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
            var5 = -((pj) this).field_H + (pg.field_n - param2);
            var6 = -((pj) this).field_I + (fi.field_B + -param1);
            if (((pj) this).field_o != var5) {
              ((pj) this).field_l = var6;
              ((pj) this).field_o = var5;
              if (((pj) this).field_s instanceof ah) {
                ((ah) (Object) ((pj) this).field_s).a(param2, (pj) this, param1, param0 ^ 10000622);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (((pj) this).field_l != var6) {
                L13: {
                  ((pj) this).field_l = var6;
                  ((pj) this).field_o = var5;
                  if (!(((pj) this).field_s instanceof ah)) {
                    break L13;
                  } else {
                    ((ah) (Object) ((pj) this).field_s).a(param2, (pj) this, param1, param0 ^ 10000622);
                    break L13;
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
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8 = 0;
        int var9 = 0;
        var8 = super.a(param0, (byte) 48, param2, param3, param4, param5, param6) ? 1 : 0;
        var9 = -58 % ((12 - param1) / 36);
        if (var8 == 0) {
          if (((pj) this).b(param5, param2, 0, param0, param3)) {
            L0: {
              if (param4 == 1) {
                tg.field_h = (pj) this;
                ((pj) this).field_H = param2 - ((pj) this).field_o - param0;
                ((pj) this).field_I = -((pj) this).field_l + param5 + -param3;
                break L0;
              } else {
                break L0;
              }
            }
            ((pj) this).field_q = param4;
            return true;
          } else {
            return var8 != 0;
          }
        } else {
          if (!((pj) this).field_O) {
            if (((pj) this).b(param5, param2, 0, param0, param3)) {
              L1: {
                if (param4 == 1) {
                  tg.field_h = (pj) this;
                  ((pj) this).field_H = param2 - ((pj) this).field_o - param0;
                  ((pj) this).field_I = -((pj) this).field_l + param5 + -param3;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((pj) this).field_q = param4;
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5_ref = null;
        dc var5_ref_dc = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        Object var20 = null;
        Object var25 = null;
        sc var25_ref = null;
        int[] var26 = null;
        Object var27 = null;
        sc var27_ref = null;
        int[] var28 = null;
        int[] var32 = null;
        int[] var33 = null;
        var5_ref = null;
        var20 = null;
        var25 = null;
        var27 = null;
        var8 = wizardrun.field_H;
        var9 = nk.field_N;
        if (param0 == -17144) {
          var2 = var9.f(255);
          var3 = var9.f(255);
          if ((var2 ^ -1) == -1) {
            var27_ref = (sc) (Object) tg.field_c.b((byte) 110);
            if (var27_ref != null) {
              L0: {
                var5 = -var9.field_m + gd.field_c;
                var33 = var27_ref.field_n;
                var28 = var33;
                var11 = var28;
                var10 = var11;
                var6 = var10;
                if (var5 <= var33.length << 1073019202) {
                  break L0;
                } else {
                  var5 = var33.length << -1448914270;
                  break L0;
                }
              }
              var7 = 0;
              L1: while (true) {
                if (var5 <= var7) {
                  var27_ref.field_j = true;
                  var27_ref.a(false);
                  return;
                } else {
                  var6[var7 >> -1124254142] = var6[var7 >> -1124254142] + (var9.f(255) << kl.b(768, var7 << 140535304));
                  var7++;
                  continue L1;
                }
              }
            } else {
              ql.a(-64);
              return;
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              rg.a((Throwable) null, "LR1: " + ni.c(6), -562);
              ql.a(-66);
              return;
            } else {
              var4 = var9.a(param0 + 37623);
              var5_ref_dc = (dc) (Object) v.field_d.b((byte) 100);
              L2: while (true) {
                L3: {
                  if (var5_ref_dc == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var5_ref_dc.field_k != var3) {
                        break L4;
                      } else {
                        if (var4 == var5_ref_dc.field_m) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5_ref_dc = (dc) (Object) v.field_d.d(param0 ^ -25336);
                    continue L2;
                  }
                }
                if (var5_ref_dc != null) {
                  var5_ref_dc.a(false);
                  return;
                } else {
                  ql.a(-100);
                  return;
                }
              }
            }
          }
        } else {
          pj.f(16);
          var2 = var9.f(255);
          var3 = var9.f(255);
          if ((var2 ^ -1) == -1) {
            var25_ref = (sc) (Object) tg.field_c.b((byte) 110);
            if (var25_ref != null) {
              L5: {
                var5 = -var9.field_m + gd.field_c;
                var32 = var25_ref.field_n;
                var26 = var32;
                var11 = var26;
                var10 = var11;
                var6 = var10;
                if (var5 <= var32.length << 1073019202) {
                  break L5;
                } else {
                  var5 = var32.length << -1448914270;
                  break L5;
                }
              }
              var7 = 0;
              L6: while (true) {
                if (var5 <= var7) {
                  var25_ref.field_j = true;
                  var25_ref.a(false);
                  return;
                } else {
                  var6[var7 >> -1124254142] = var6[var7 >> -1124254142] + (var9.f(255) << kl.b(768, var7 << 140535304));
                  var7++;
                  continue L6;
                }
              }
            } else {
              ql.a(-64);
              return;
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              rg.a((Throwable) null, "LR1: " + ni.c(6), -562);
              ql.a(-66);
              return;
            } else {
              var4 = var9.a(param0 + 37623);
              var5_ref_dc = (dc) (Object) v.field_d.b((byte) 100);
              L7: while (true) {
                if (var5_ref_dc != null) {
                  L8: {
                    if (var5_ref_dc.field_k != var3) {
                      break L8;
                    } else {
                      if (var4 != var5_ref_dc.field_m) {
                        break L8;
                      } else {
                        if (var5_ref_dc != null) {
                          var5_ref_dc.a(false);
                          return;
                        } else {
                          ql.a(-100);
                          return;
                        }
                      }
                    }
                  }
                  var5_ref_dc = (dc) (Object) v.field_d.d(param0 ^ -25336);
                  continue L7;
                } else {
                  if (var5_ref_dc != null) {
                    var5_ref_dc.a(false);
                    return;
                  } else {
                    ql.a(-100);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private pj(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((pj) this).field_J = 2147483647;
        ((pj) this).field_N = 2147483647;
        ((pj) this).field_K = param7 ? true : false;
        ((pj) this).field_O = param8 ? true : false;
        ((pj) this).field_F = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new rc();
        field_L = "This password contains repeated characters, and would be easy to guess";
    }
}
