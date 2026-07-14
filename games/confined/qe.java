/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends am {
    private boolean field_L;
    private boolean field_P;
    private int field_K;
    static nf[] field_O;
    private int field_R;
    private int field_M;
    static nf field_J;
    static int field_Q;
    private int field_N;

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        if (param0 > -18) {
          field_O = null;
          super.a(-26, param1, param2, param3, param4, param5);
          ((qe) this).field_o = 0;
          return;
        } else {
          super.a(-26, param1, param2, param3, param4, param5);
          ((qe) this).field_o = 0;
          return;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        if (!param3) {
          if (((qe) this).a((byte) -13, param1, param2, param0)) {
            ((qe) this).a(param0, param2, (byte) -63, param1);
            ((qe) this).a(param2, 3803, param0, param1);
            StringBuilder discarded$4 = param0.append(" revert=").append(((qe) this).field_L);
            if (((qe) this).field_M != 2147483647) {
              if (-2147483648 == (((qe) this).field_K ^ -1)) {
                return param0;
              } else {
                StringBuilder discarded$5 = param0.append(" to ").append(((qe) this).field_M).append(44).append(((qe) this).field_K);
                return param0;
              }
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        } else {
          ((qe) this).field_K = 39;
          if (((qe) this).a((byte) -13, param1, param2, param0)) {
            ((qe) this).a(param0, param2, (byte) -63, param1);
            ((qe) this).a(param2, 3803, param0, param1);
            StringBuilder discarded$6 = param0.append(" revert=").append(((qe) this).field_L);
            if (((qe) this).field_M == 2147483647) {
              return param0;
            } else {
              L0: {
                if (-2147483648 != (((qe) this).field_K ^ -1)) {
                  StringBuilder discarded$7 = param0.append(" to ").append(((qe) this).field_M).append(44).append(((qe) this).field_K);
                  break L0;
                } else {
                  break L0;
                }
              }
              return param0;
            }
          } else {
            return param0;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((qe) this).field_P) {
            if (!((qe) this).a(param1, (byte) 125, param0, param5, param3)) {
              return var8 != 0;
            } else {
              L0: {
                ((qe) this).field_o = param6;
                if ((param6 ^ -1) == -2) {
                  ((qe) this).field_N = param1 + -((qe) this).field_q + -param0;
                  ((qe) this).field_R = -param3 + (-((qe) this).field_m + param5);
                  rk.field_k = (qe) this;
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
          if (((qe) this).a(param1, (byte) 125, param0, param5, param3)) {
            ((qe) this).field_o = param6;
            if ((param6 ^ -1) != -2) {
              return true;
            } else {
              ((qe) this).field_N = param1 + -((qe) this).field_q + -param0;
              ((qe) this).field_R = -param3 + (-((qe) this).field_m + param5);
              rk.field_k = (qe) this;
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != 44) {
            return;
        }
        field_J = null;
        field_O = null;
    }

    private qe(int param0, int param1, int param2, int param3, fe param4, uk param5, fj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((qe) this).field_M = 2147483647;
        ((qe) this).field_K = 2147483647;
        ((qe) this).field_H = param6;
        ((qe) this).field_P = param8 ? true : false;
        ((qe) this).field_L = param7 ? true : false;
    }

    final void a(fj param0, int param1, int param2, int param3) {
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
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
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
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        L0: {
          if (!(((qe) this).field_H instanceof rg)) {
            if (1 == ((qe) this).field_o) {
              var5 = ld.field_l + (-((qe) this).field_N + -param2);
              var6 = -param3 + -((qe) this).field_R + jh.field_R;
              if (((qe) this).field_q != var5) {
                ((qe) this).field_q = var5;
                ((qe) this).field_m = var6;
                if (((qe) this).field_t instanceof wk) {
                  ((wk) (Object) ((qe) this).field_t).a((qe) this, param3, -5428, param2);
                  break L0;
                } else {
                  super.a(param0, param1 + 0, param2, param3);
                  if (param1 != 11579568) {
                    field_J = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (var6 == ((qe) this).field_m) {
                  break L0;
                } else {
                  L1: {
                    ((qe) this).field_q = var5;
                    ((qe) this).field_m = var6;
                    if (((qe) this).field_t instanceof wk) {
                      ((wk) (Object) ((qe) this).field_t).a((qe) this, param3, -5428, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  super.a(param0, param1 + 0, param2, param3);
                  if (param1 != 11579568) {
                    field_J = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L2: {
                if (((qe) this).field_L) {
                  L3: {
                    if (((qe) this).field_M == ((qe) this).field_q) {
                      break L3;
                    } else {
                      L4: {
                        var5 = -((qe) this).field_q + ((qe) this).field_M;
                        stackOut_44_0 = this;
                        stackOut_44_1 = ((qe) this).field_q;
                        stackIn_48_0 = stackOut_44_0;
                        stackIn_48_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (2 < Math.abs(var5)) {
                          stackOut_48_0 = this;
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = var5 >> -98282719;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          break L4;
                        } else {
                          stackOut_45_0 = this;
                          stackOut_45_1 = stackIn_45_1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          if (-1 <= (var5 ^ -1)) {
                            stackOut_47_0 = this;
                            stackOut_47_1 = stackIn_47_1;
                            stackOut_47_2 = -1;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_49_2 = stackOut_47_2;
                            break L4;
                          } else {
                            stackOut_46_0 = this;
                            stackOut_46_1 = stackIn_46_1;
                            stackOut_46_2 = 1;
                            stackIn_49_0 = stackOut_46_0;
                            stackIn_49_1 = stackOut_46_1;
                            stackIn_49_2 = stackOut_46_2;
                            break L4;
                          }
                        }
                      }
                      ((qe) this).field_q = stackIn_49_1 + stackIn_49_2;
                      break L3;
                    }
                  }
                  if (((qe) this).field_K == ((qe) this).field_m) {
                    break L2;
                  } else {
                    var5 = -((qe) this).field_m + ((qe) this).field_K;
                    stackOut_51_0 = this;
                    stackOut_51_1 = ((qe) this).field_m;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      L5: {
                        stackOut_53_0 = this;
                        stackOut_53_1 = stackIn_53_1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (0 < var5) {
                          stackOut_55_0 = this;
                          stackOut_55_1 = stackIn_55_1;
                          stackOut_55_2 = 1;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          stackIn_56_2 = stackOut_55_2;
                          break L5;
                        } else {
                          stackOut_54_0 = this;
                          stackOut_54_1 = stackIn_54_1;
                          stackOut_54_2 = -1;
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_56_2 = stackOut_54_2;
                          break L5;
                        }
                      }
                      ((qe) this).field_m = stackIn_56_1 + stackIn_56_2;
                      break L2;
                    } else {
                      ((qe) this).field_m = stackIn_52_1 + (var5 >> -1516882879);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              super.a(param0, param1 + 0, param2, param3);
              if (param1 != 11579568) {
                field_J = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (!((rg) (Object) ((qe) this).field_H).field_L) {
              if (((qe) this).field_L) {
                L6: {
                  if (((qe) this).field_M == ((qe) this).field_q) {
                    break L6;
                  } else {
                    L7: {
                      var5 = -((qe) this).field_q + ((qe) this).field_M;
                      stackOut_67_0 = this;
                      stackOut_67_1 = ((qe) this).field_q;
                      stackIn_71_0 = stackOut_67_0;
                      stackIn_71_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_71_0 = this;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = var5 >> -98282719;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        stackIn_72_2 = stackOut_71_2;
                        break L7;
                      } else {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        if (-1 <= (var5 ^ -1)) {
                          stackOut_70_0 = this;
                          stackOut_70_1 = stackIn_70_1;
                          stackOut_70_2 = -1;
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_72_1 = stackOut_70_1;
                          stackIn_72_2 = stackOut_70_2;
                          break L7;
                        } else {
                          stackOut_69_0 = this;
                          stackOut_69_1 = stackIn_69_1;
                          stackOut_69_2 = 1;
                          stackIn_72_0 = stackOut_69_0;
                          stackIn_72_1 = stackOut_69_1;
                          stackIn_72_2 = stackOut_69_2;
                          break L7;
                        }
                      }
                    }
                    ((qe) this).field_q = stackIn_72_1 + stackIn_72_2;
                    break L6;
                  }
                }
                if (((qe) this).field_K == ((qe) this).field_m) {
                  break L0;
                } else {
                  L8: {
                    var5 = -((qe) this).field_m + ((qe) this).field_K;
                    stackOut_74_0 = this;
                    stackOut_74_1 = ((qe) this).field_m;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_76_0 = this;
                      stackOut_76_1 = stackIn_76_1;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_77_0 = stackOut_76_0;
                      stackIn_77_1 = stackOut_76_1;
                      if (0 < var5) {
                        stackOut_78_0 = this;
                        stackOut_78_1 = stackIn_78_1;
                        stackOut_78_2 = 1;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        stackIn_79_2 = stackOut_78_2;
                        break L8;
                      } else {
                        stackOut_77_0 = this;
                        stackOut_77_1 = stackIn_77_1;
                        stackOut_77_2 = -1;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        stackIn_79_2 = stackOut_77_2;
                        break L8;
                      }
                    } else {
                      stackOut_75_0 = this;
                      stackOut_75_1 = stackIn_75_1;
                      stackOut_75_2 = var5 >> -1516882879;
                      stackIn_79_0 = stackOut_75_0;
                      stackIn_79_1 = stackOut_75_1;
                      stackIn_79_2 = stackOut_75_2;
                      break L8;
                    }
                  }
                  ((qe) this).field_m = stackIn_79_1 + stackIn_79_2;
                  super.a(param0, param1 + 0, param2, param3);
                  if (param1 != 11579568) {
                    field_J = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                super.a(param0, param1 + 0, param2, param3);
                if (param1 != 11579568) {
                  field_J = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (1 == ((qe) this).field_o) {
                var5 = ld.field_l + (-((qe) this).field_N + -param2);
                var6 = -param3 + -((qe) this).field_R + jh.field_R;
                if (((qe) this).field_q != var5) {
                  L9: {
                    ((qe) this).field_q = var5;
                    ((qe) this).field_m = var6;
                    if (((qe) this).field_t instanceof wk) {
                      ((wk) (Object) ((qe) this).field_t).a((qe) this, param3, -5428, param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    super.a(param0, param1 + 0, param2, param3);
                    if (param1 == 11579568) {
                      break L10;
                    } else {
                      field_J = null;
                      break L10;
                    }
                  }
                  return;
                } else {
                  L11: {
                    if (var6 == ((qe) this).field_m) {
                      break L11;
                    } else {
                      ((qe) this).field_q = var5;
                      ((qe) this).field_m = var6;
                      if (((qe) this).field_t instanceof wk) {
                        ((wk) (Object) ((qe) this).field_t).a((qe) this, param3, -5428, param2);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    super.a(param0, param1 + 0, param2, param3);
                    if (param1 == 11579568) {
                      break L12;
                    } else {
                      field_J = null;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (((qe) this).field_L) {
                    L14: {
                      if (((qe) this).field_M == ((qe) this).field_q) {
                        break L14;
                      } else {
                        L15: {
                          var5 = -((qe) this).field_q + ((qe) this).field_M;
                          stackOut_6_0 = this;
                          stackOut_6_1 = ((qe) this).field_q;
                          stackIn_10_0 = stackOut_6_0;
                          stackIn_10_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (2 < Math.abs(var5)) {
                            stackOut_10_0 = this;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = var5 >> -98282719;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L15;
                          } else {
                            stackOut_7_0 = this;
                            stackOut_7_1 = stackIn_7_1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (-1 <= (var5 ^ -1)) {
                              stackOut_9_0 = this;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = -1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_11_2 = stackOut_9_2;
                              break L15;
                            } else {
                              stackOut_8_0 = this;
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = 1;
                              stackIn_11_0 = stackOut_8_0;
                              stackIn_11_1 = stackOut_8_1;
                              stackIn_11_2 = stackOut_8_2;
                              break L15;
                            }
                          }
                        }
                        ((qe) this).field_q = stackIn_11_1 + stackIn_11_2;
                        break L14;
                      }
                    }
                    if (((qe) this).field_K != ((qe) this).field_m) {
                      var5 = -((qe) this).field_m + ((qe) this).field_K;
                      stackOut_16_0 = this;
                      stackOut_16_1 = ((qe) this).field_m;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        L16: {
                          stackOut_18_0 = this;
                          stackOut_18_1 = stackIn_18_1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          if (0 < var5) {
                            stackOut_20_0 = this;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            break L16;
                          } else {
                            stackOut_19_0 = this;
                            stackOut_19_1 = stackIn_19_1;
                            stackOut_19_2 = -1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            break L16;
                          }
                        }
                        ((qe) this).field_m = stackIn_21_1 + stackIn_21_2;
                        break L13;
                      } else {
                        ((qe) this).field_m = stackIn_17_1 + (var5 >> -1516882879);
                        break L13;
                      }
                    } else {
                      L17: {
                        super.a(param0, param1 + 0, param2, param3);
                        if (param1 == 11579568) {
                          break L17;
                        } else {
                          field_J = null;
                          break L17;
                        }
                      }
                      return;
                    }
                  } else {
                    break L13;
                  }
                }
                L18: {
                  super.a(param0, param1 + 0, param2, param3);
                  if (param1 == 11579568) {
                    break L18;
                  } else {
                    field_J = null;
                    break L18;
                  }
                }
                return;
              }
            }
          }
        }
        super.a(param0, param1 + 0, param2, param3);
        if (param1 != 11579568) {
          field_J = null;
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        Object var3 = null;
        super.f(-79);
        ((qe) this).field_H.a(-110, ((qe) this).field_F, 0, ((qe) this).field_z, 0);
        if (param0 >= -49) {
          var3 = null;
          StringBuilder discarded$2 = ((qe) this).a((StringBuilder) null, 56, (Hashtable) null, true);
          ((qe) this).field_M = ((qe) this).field_q;
          ((qe) this).field_K = ((qe) this).field_m;
          return;
        } else {
          ((qe) this).field_M = ((qe) this).field_q;
          ((qe) this).field_K = ((qe) this).field_m;
          return;
        }
    }

    final static boolean a(byte param0, kg param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param1.c(param0 + 105);
        if (param0 != -73) {
          return false;
        } else {
          L0: {
            if ((var2 ^ -1) == -2) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    static {
    }
}
