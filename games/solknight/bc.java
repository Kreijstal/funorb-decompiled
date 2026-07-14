/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bc extends si {
    private boolean field_O;
    private int field_L;
    private int field_N;
    private boolean field_I;
    static nc field_J;
    private int field_M;
    private int field_H;
    static sf field_K;

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((bc) this).field_O) {
            if (((bc) this).a(param4, param3, param1, param5, -118)) {
              L0: {
                if (1 == param0) {
                  jf.field_a = (bc) this;
                  ((bc) this).field_N = param3 - ((bc) this).field_m - param1;
                  ((bc) this).field_L = param4 + (-((bc) this).field_j - param5);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((bc) this).field_u = param0;
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            return true;
          }
        } else {
          if (((bc) this).a(param4, param3, param1, param5, -118)) {
            L1: {
              if (1 == param0) {
                jf.field_a = (bc) this;
                ((bc) this).field_N = param3 - ((bc) this).field_m - param1;
                ((bc) this).field_L = param4 + (-((bc) this).field_j - param5);
                break L1;
              } else {
                break L1;
              }
            }
            ((bc) this).field_u = param0;
            return true;
          } else {
            return var8 != 0;
          }
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((bc) this).field_u = 0;
    }

    private bc(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((bc) this).field_M = 2147483647;
        ((bc) this).field_H = 2147483647;
        ((bc) this).field_I = param7 ? true : false;
        ((bc) this).field_O = param8 ? true : false;
        ((bc) this).field_G = param6;
    }

    final void a(int param0, int param1, int param2, rc param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        if (((bc) this).field_G instanceof pj) {
          if (((pj) (Object) ((bc) this).field_G).field_B) {
            if (-2 == (((bc) this).field_u ^ -1)) {
              var5 = -((bc) this).field_N + (gb.field_j - param0);
              var6 = -((bc) this).field_L + (ad.field_m - param2);
              if (var5 != ((bc) this).field_m) {
                ((bc) this).field_m = var5;
                ((bc) this).field_j = var6;
                if (((bc) this).field_n instanceof t) {
                  ((t) (Object) ((bc) this).field_n).a(param0, (byte) 40, param2, (bc) this);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((bc) this).field_j) {
                  ((bc) this).field_m = var5;
                  ((bc) this).field_j = var6;
                  if (!(((bc) this).field_n instanceof t)) {
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    ((t) (Object) ((bc) this).field_n).a(param0, (byte) 40, param2, (bc) this);
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((bc) this).field_I) {
                L0: {
                  if (((bc) this).field_H == ((bc) this).field_m) {
                    break L0;
                  } else {
                    L1: {
                      var5 = -((bc) this).field_m + ((bc) this).field_H;
                      stackOut_58_0 = this;
                      stackOut_58_1 = ((bc) this).field_m;
                      stackIn_62_0 = stackOut_58_0;
                      stackIn_62_1 = stackOut_58_1;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      if (-3 > Math.abs(var5)) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = var5 >> -358334527;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        break L1;
                      } else {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if (-1 < var5) {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          stackIn_63_2 = stackOut_61_2;
                          break L1;
                        } else {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = -1;
                          stackIn_63_0 = stackOut_60_0;
                          stackIn_63_1 = stackOut_60_1;
                          stackIn_63_2 = stackOut_60_2;
                          break L1;
                        }
                      }
                    }
                    ((bc) this).field_m = stackIn_63_1 + stackIn_63_2;
                    break L0;
                  }
                }
                if (((bc) this).field_M != ((bc) this).field_j) {
                  L2: {
                    L3: {
                      var5 = -((bc) this).field_j + ((bc) this).field_M;
                      stackOut_66_0 = this;
                      stackOut_66_1 = ((bc) this).field_j;
                      stackIn_70_0 = stackOut_66_0;
                      stackIn_70_1 = stackOut_66_1;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      if ((Math.abs(var5) ^ -1) < -3) {
                        stackOut_70_0 = this;
                        stackOut_70_1 = stackIn_70_1;
                        stackOut_70_2 = var5 >> 944363521;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        break L3;
                      } else {
                        stackOut_67_0 = this;
                        stackOut_67_1 = stackIn_67_1;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        if (var5 > 0) {
                          stackOut_69_0 = this;
                          stackOut_69_1 = stackIn_69_1;
                          stackOut_69_2 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          stackIn_71_2 = stackOut_69_2;
                          break L3;
                        } else {
                          ((bc) this).field_j = stackIn_68_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((bc) this).field_j = stackIn_71_1 + stackIn_71_2;
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
            if (!((bc) this).field_I) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((bc) this).field_H == ((bc) this).field_m) {
                  break L4;
                } else {
                  L5: {
                    var5 = -((bc) this).field_m + ((bc) this).field_H;
                    stackOut_37_0 = this;
                    stackOut_37_1 = ((bc) this).field_m;
                    stackIn_41_0 = stackOut_37_0;
                    stackIn_41_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = var5 >> -358334527;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L5;
                    } else {
                      stackOut_38_0 = this;
                      stackOut_38_1 = stackIn_38_1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (-1 < var5) {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L5;
                      } else {
                        stackOut_39_0 = this;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = -1;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        break L5;
                      }
                    }
                  }
                  ((bc) this).field_m = stackIn_42_1 + stackIn_42_2;
                  break L4;
                }
              }
              if (((bc) this).field_M != ((bc) this).field_j) {
                L6: {
                  L7: {
                    var5 = -((bc) this).field_j + ((bc) this).field_M;
                    stackOut_45_0 = this;
                    stackOut_45_1 = ((bc) this).field_j;
                    stackIn_49_0 = stackOut_45_0;
                    stackIn_49_1 = stackOut_45_1;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_49_0 = this;
                      stackOut_49_1 = stackIn_49_1;
                      stackOut_49_2 = var5 >> 944363521;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      stackIn_50_2 = stackOut_49_2;
                      break L7;
                    } else {
                      stackOut_46_0 = this;
                      stackOut_46_1 = stackIn_46_1;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (var5 > 0) {
                        stackOut_48_0 = this;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L7;
                      } else {
                        ((bc) this).field_j = stackIn_47_1 + -1;
                        break L6;
                      }
                    }
                  }
                  ((bc) this).field_j = stackIn_50_1 + stackIn_50_2;
                  break L6;
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
          if (-2 == (((bc) this).field_u ^ -1)) {
            var5 = -((bc) this).field_N + (gb.field_j - param0);
            var6 = -((bc) this).field_L + (ad.field_m - param2);
            if (var5 != ((bc) this).field_m) {
              ((bc) this).field_m = var5;
              ((bc) this).field_j = var6;
              if (((bc) this).field_n instanceof t) {
                ((t) (Object) ((bc) this).field_n).a(param0, (byte) 40, param2, (bc) this);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (var6 != ((bc) this).field_j) {
                ((bc) this).field_m = var5;
                ((bc) this).field_j = var6;
                if (!(((bc) this).field_n instanceof t)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((t) (Object) ((bc) this).field_n).a(param0, (byte) 40, param2, (bc) this);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((bc) this).field_I) {
              L8: {
                if (((bc) this).field_H == ((bc) this).field_m) {
                  break L8;
                } else {
                  L9: {
                    var5 = -((bc) this).field_m + ((bc) this).field_H;
                    stackOut_5_0 = this;
                    stackOut_5_1 = ((bc) this).field_m;
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_9_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = var5 >> -358334527;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L9;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = stackIn_6_1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (-1 < var5) {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L9;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = -1;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        break L9;
                      }
                    }
                  }
                  ((bc) this).field_m = stackIn_10_1 + stackIn_10_2;
                  break L8;
                }
              }
              if (((bc) this).field_M != ((bc) this).field_j) {
                L10: {
                  L11: {
                    var5 = -((bc) this).field_j + ((bc) this).field_M;
                    stackOut_13_0 = this;
                    stackOut_13_1 = ((bc) this).field_j;
                    stackIn_17_0 = stackOut_13_0;
                    stackIn_17_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = var5 >> 944363521;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      break L11;
                    } else {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var5 > 0) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L11;
                      } else {
                        ((bc) this).field_j = stackIn_15_1 + -1;
                        break L10;
                      }
                    }
                  }
                  ((bc) this).field_j = stackIn_18_1 + stackIn_18_2;
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

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_K = null;
        field_J = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 < -41) {
          if (((bc) this).a(param2, -1, param1, param3)) {
            ((bc) this).b(param2, -119, param1, param3);
            ((bc) this).a(param1, param2, param3, -19156);
            StringBuilder discarded$23 = param2.append(" revert=").append(((bc) this).field_I);
            if (2147483647 != ((bc) this).field_H) {
              if ((((bc) this).field_M ^ -1) == -2147483648) {
                return param2;
              } else {
                StringBuilder discarded$24 = param2.append(" to ").append(((bc) this).field_H).append(44).append(((bc) this).field_M);
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0) {
        super.a(-123);
        ((bc) this).field_G.b(((bc) this).field_x, ((bc) this).field_t, 0, 0, 0);
        ((bc) this).field_H = ((bc) this).field_m;
        if (param0 >= -102) {
          return;
        } else {
          ((bc) this).field_M = ((bc) this).field_j;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new nc();
        field_K = new sf(1);
    }
}
