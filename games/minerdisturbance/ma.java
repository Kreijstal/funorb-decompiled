/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ma extends jc {
    private int field_K;
    static ea field_O;
    private int field_N;
    private boolean field_M;
    private int field_P;
    private boolean field_L;
    private int field_J;

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        super.a(param0, param1, param2, param3, param4, 0);
        ((ma) this).field_w = param5;
    }

    final static void a(int param0, int param1) {
        sa var2 = null;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        oc.field_f = param1;
        if (param0 <= -88) {
          var2 = (sa) (Object) hj.field_b.b(61);
          L0: while (true) {
            if (var2 == null) {
              if (m.field_c == null) {
                return;
              } else {
                var2 = (sa) (Object) m.field_c.b(80);
                L1: while (true) {
                  if (var2 == null) {
                    return;
                  } else {
                    L2: {
                      if (!var2.field_p.c(118)) {
                        var2.b(34);
                        break L2;
                      } else {
                        var2.field_n.f(128 + oc.field_f * var2.field_q >> 880272520);
                        break L2;
                      }
                    }
                    var2 = (sa) (Object) m.field_c.b((byte) 56);
                    continue L1;
                  }
                }
              }
            } else {
              L3: {
                if (var2.field_p.c(123)) {
                  var2.field_n.f(oc.field_f * var2.field_q - -128 >> -480413720);
                  break L3;
                } else {
                  var2.b(34);
                  break L3;
                }
              }
              var2 = (sa) (Object) hj.field_b.b((byte) 56);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (!((ma) this).a(param3, true, param2, param1)) {
            if (param0 == -70) {
                return param3;
            }
            ((ma) this).field_M = false;
            return param3;
        }
        ((ma) this).a(param1, param3, 34, param2);
        ((ma) this).a(param1, param2, param3, -125);
        StringBuilder discarded$22 = param3.append(" revert=").append(((ma) this).field_L);
        if ((((ma) this).field_J ^ -1) != -2147483648) {
            if (-2147483648 == (((ma) this).field_P ^ -1)) {
                if (param0 == -70) {
                    return param3;
                }
                ((ma) this).field_M = false;
                return param3;
            }
            StringBuilder discarded$23 = param3.append(" to ").append(((ma) this).field_J).append(44).append(((ma) this).field_P);
        }
        if (param0 != -70) {
            ((ma) this).field_M = false;
            return param3;
        }
        return param3;
    }

    final static int o(int param0) {
        if (param0 != -14933) {
            return 50;
        }
        return -cg.field_o + si.field_d;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2 ^ param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((ma) this).field_M) {
            if (((ma) this).b(param3, param6, param1, param0, -92)) {
              if (-2 == (param4 ^ -1)) {
                j.field_d = (ma) this;
                ((ma) this).field_N = -param6 + (-((ma) this).field_u + param0);
                ((ma) this).field_K = -param1 + (param3 + -((ma) this).field_t);
                ((ma) this).field_w = param4;
                return true;
              } else {
                ((ma) this).field_w = param4;
                return true;
              }
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        } else {
          if (((ma) this).b(param3, param6, param1, param0, -92)) {
            if (-2 == (param4 ^ -1)) {
              j.field_d = (ma) this;
              ((ma) this).field_N = -param6 + (-((ma) this).field_u + param0);
              ((ma) this).field_K = -param1 + (param3 + -((ma) this).field_t);
              ((ma) this).field_w = param4;
              return true;
            } else {
              ((ma) this).field_w = param4;
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
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
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
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
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        L0: {
          if (!(((ma) this).field_I instanceof hc)) {
            if ((((ma) this).field_w ^ -1) == -2) {
              L1: {
                var5 = -param1 + nk.field_w - ((ma) this).field_N;
                var6 = -param0 + (-((ma) this).field_K + gb.field_e);
                if (var5 != ((ma) this).field_u) {
                  break L1;
                } else {
                  if (((ma) this).field_t != var6) {
                    break L1;
                  } else {
                    super.a(param0, param1, (byte) 61, param3);
                    if (param2 < 49) {
                      ((ma) this).field_P = -75;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((ma) this).field_t = var6;
              ((ma) this).field_u = var5;
              if (((ma) this).field_y instanceof uc) {
                ((uc) (Object) ((ma) this).field_y).a(param1, 64, (ma) this, param0);
                break L0;
              } else {
                super.a(param0, param1, (byte) 61, param3);
                if (param2 < 49) {
                  ((ma) this).field_P = -75;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L2: {
                if (!((ma) this).field_L) {
                  break L2;
                } else {
                  L3: {
                    if (((ma) this).field_u != ((ma) this).field_J) {
                      L4: {
                        var5 = -((ma) this).field_u + ((ma) this).field_J;
                        stackOut_46_0 = this;
                        stackOut_46_1 = ((ma) this).field_u;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (2 >= Math.abs(var5)) {
                          stackOut_48_0 = this;
                          stackOut_48_1 = stackIn_48_1;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if ((var5 ^ -1) >= -1) {
                            stackOut_50_0 = this;
                            stackOut_50_1 = stackIn_50_1;
                            stackOut_50_2 = -1;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            break L4;
                          } else {
                            stackOut_49_0 = this;
                            stackOut_49_1 = stackIn_49_1;
                            stackOut_49_2 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            break L4;
                          }
                        } else {
                          stackOut_47_0 = this;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = var5 >> 505098081;
                          stackIn_51_0 = stackOut_47_0;
                          stackIn_51_1 = stackOut_47_1;
                          stackIn_51_2 = stackOut_47_2;
                          break L4;
                        }
                      }
                      ((ma) this).field_u = stackIn_51_1 + stackIn_51_2;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (((ma) this).field_t != ((ma) this).field_P) {
                    var5 = -((ma) this).field_t + ((ma) this).field_P;
                    stackOut_54_0 = this;
                    stackOut_54_1 = ((ma) this).field_t;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    if (Math.abs(var5) <= 2) {
                      L5: {
                        stackOut_56_0 = this;
                        stackOut_56_1 = stackIn_56_1;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if ((var5 ^ -1) < -1) {
                          stackOut_58_0 = this;
                          stackOut_58_1 = stackIn_58_1;
                          stackOut_58_2 = 1;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          break L5;
                        } else {
                          stackOut_57_0 = this;
                          stackOut_57_1 = stackIn_57_1;
                          stackOut_57_2 = -1;
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          break L5;
                        }
                      }
                      ((ma) this).field_t = stackIn_59_1 + stackIn_59_2;
                      break L2;
                    } else {
                      ((ma) this).field_t = stackIn_55_1 + (var5 >> -1233539647);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              super.a(param0, param1, (byte) 61, param3);
              if (param2 < 49) {
                ((ma) this).field_P = -75;
                return;
              } else {
                return;
              }
            }
          } else {
            if (!((hc) (Object) ((ma) this).field_I).field_E) {
              if (!((ma) this).field_L) {
                break L0;
              } else {
                L6: {
                  if (((ma) this).field_u != ((ma) this).field_J) {
                    L7: {
                      var5 = -((ma) this).field_u + ((ma) this).field_J;
                      stackOut_67_0 = this;
                      stackOut_67_1 = ((ma) this).field_u;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if (2 >= Math.abs(var5)) {
                        stackOut_69_0 = this;
                        stackOut_69_1 = stackIn_69_1;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_71_0 = this;
                          stackOut_71_1 = stackIn_71_1;
                          stackOut_71_2 = -1;
                          stackIn_72_0 = stackOut_71_0;
                          stackIn_72_1 = stackOut_71_1;
                          stackIn_72_2 = stackOut_71_2;
                          break L7;
                        } else {
                          stackOut_70_0 = this;
                          stackOut_70_1 = stackIn_70_1;
                          stackOut_70_2 = 1;
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_72_1 = stackOut_70_1;
                          stackIn_72_2 = stackOut_70_2;
                          break L7;
                        }
                      } else {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = var5 >> 505098081;
                        stackIn_72_0 = stackOut_68_0;
                        stackIn_72_1 = stackOut_68_1;
                        stackIn_72_2 = stackOut_68_2;
                        break L7;
                      }
                    }
                    ((ma) this).field_u = stackIn_72_1 + stackIn_72_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((ma) this).field_t != ((ma) this).field_P) {
                  L8: {
                    var5 = -((ma) this).field_t + ((ma) this).field_P;
                    stackOut_78_0 = this;
                    stackOut_78_1 = ((ma) this).field_t;
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_80_1 = stackOut_78_1;
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_80_0 = this;
                      stackOut_80_1 = stackIn_80_1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_81_0 = stackOut_80_0;
                      stackIn_81_1 = stackOut_80_1;
                      if ((var5 ^ -1) < -1) {
                        stackOut_82_0 = this;
                        stackOut_82_1 = stackIn_82_1;
                        stackOut_82_2 = 1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        stackIn_83_2 = stackOut_82_2;
                        break L8;
                      } else {
                        stackOut_81_0 = this;
                        stackOut_81_1 = stackIn_81_1;
                        stackOut_81_2 = -1;
                        stackIn_83_0 = stackOut_81_0;
                        stackIn_83_1 = stackOut_81_1;
                        stackIn_83_2 = stackOut_81_2;
                        break L8;
                      }
                    } else {
                      stackOut_79_0 = this;
                      stackOut_79_1 = stackIn_79_1;
                      stackOut_79_2 = var5 >> -1233539647;
                      stackIn_83_0 = stackOut_79_0;
                      stackIn_83_1 = stackOut_79_1;
                      stackIn_83_2 = stackOut_79_2;
                      break L8;
                    }
                  }
                  ((ma) this).field_t = stackIn_83_1 + stackIn_83_2;
                  super.a(param0, param1, (byte) 61, param3);
                  if (param2 < 49) {
                    ((ma) this).field_P = -75;
                    return;
                  } else {
                    return;
                  }
                } else {
                  super.a(param0, param1, (byte) 61, param3);
                  if (param2 < 49) {
                    ((ma) this).field_P = -75;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if ((((ma) this).field_w ^ -1) == -2) {
                var5 = -param1 + nk.field_w - ((ma) this).field_N;
                var6 = -param0 + (-((ma) this).field_K + gb.field_e);
                if (var5 != ((ma) this).field_u) {
                  L9: {
                    ((ma) this).field_t = var6;
                    ((ma) this).field_u = var5;
                    if (((ma) this).field_y instanceof uc) {
                      ((uc) (Object) ((ma) this).field_y).a(param1, 64, (ma) this, param0);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    super.a(param0, param1, (byte) 61, param3);
                    if (param2 >= 49) {
                      break L10;
                    } else {
                      ((ma) this).field_P = -75;
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    if (((ma) this).field_t != var6) {
                      ((ma) this).field_t = var6;
                      ((ma) this).field_u = var5;
                      if (((ma) this).field_y instanceof uc) {
                        ((uc) (Object) ((ma) this).field_y).a(param1, 64, (ma) this, param0);
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    super.a(param0, param1, (byte) 61, param3);
                    if (param2 >= 49) {
                      break L12;
                    } else {
                      ((ma) this).field_P = -75;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                if (((ma) this).field_L) {
                  L13: {
                    if (((ma) this).field_u != ((ma) this).field_J) {
                      L14: {
                        var5 = -((ma) this).field_u + ((ma) this).field_J;
                        stackOut_9_0 = this;
                        stackOut_9_1 = ((ma) this).field_u;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (2 >= Math.abs(var5)) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if ((var5 ^ -1) >= -1) {
                            stackOut_13_0 = this;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = -1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L14;
                          } else {
                            stackOut_12_0 = this;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            break L14;
                          }
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = var5 >> 505098081;
                          stackIn_14_0 = stackOut_10_0;
                          stackIn_14_1 = stackOut_10_1;
                          stackIn_14_2 = stackOut_10_2;
                          break L14;
                        }
                      }
                      ((ma) this).field_u = stackIn_14_1 + stackIn_14_2;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L15: {
                    if (((ma) this).field_t != ((ma) this).field_P) {
                      var5 = -((ma) this).field_t + ((ma) this).field_P;
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((ma) this).field_t;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (Math.abs(var5) <= 2) {
                        L16: {
                          stackOut_19_0 = this;
                          stackOut_19_1 = stackIn_19_1;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_21_1 = stackOut_19_1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          if ((var5 ^ -1) < -1) {
                            stackOut_21_0 = this;
                            stackOut_21_1 = stackIn_21_1;
                            stackOut_21_2 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            stackIn_22_2 = stackOut_21_2;
                            break L16;
                          } else {
                            stackOut_20_0 = this;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = -1;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            stackIn_22_2 = stackOut_20_2;
                            break L16;
                          }
                        }
                        ((ma) this).field_t = stackIn_22_1 + stackIn_22_2;
                        break L15;
                      } else {
                        ((ma) this).field_t = stackIn_18_1 + (var5 >> -1233539647);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L17: {
                    super.a(param0, param1, (byte) 61, param3);
                    if (param2 >= 49) {
                      break L17;
                    } else {
                      ((ma) this).field_P = -75;
                      break L17;
                    }
                  }
                  return;
                } else {
                  L18: {
                    super.a(param0, param1, (byte) 61, param3);
                    if (param2 >= 49) {
                      break L18;
                    } else {
                      ((ma) this).field_P = -75;
                      break L18;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        super.a(param0, param1, (byte) 61, param3);
        if (param2 < 49) {
          ((ma) this).field_P = -75;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        super.a(param0);
        ((ma) this).field_I.a(((ma) this).field_q, param0 + -111, 0, ((ma) this).field_v, 0);
        ((ma) this).field_P = ((ma) this).field_t;
        ((ma) this).field_J = ((ma) this).field_u;
    }

    public static void n(int param0) {
        if (param0 != 27934) {
            return;
        }
        field_O = null;
    }

    private ma(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ma) this).field_P = 2147483647;
        ((ma) this).field_J = 2147483647;
        ((ma) this).field_L = param7 ? true : false;
        ((ma) this).field_M = param8 ? true : false;
        ((ma) this).field_I = param6;
    }

    static {
    }
}
