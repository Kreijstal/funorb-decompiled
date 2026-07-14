/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ef extends mc {
    private int field_C;
    static String field_A;
    private int field_D;
    static int field_z;
    private boolean field_B;
    private int field_x;
    static boolean field_E;
    static arb field_y;
    private int field_w;
    private boolean field_v;

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((ef) this).a(param1, param2, (byte) 115, param3)) {
          ((ef) this).a(124, param2, param1, param3);
          ((ef) this).a(param2, 13, param3, param1);
          StringBuilder discarded$36 = param3.append(" revert=").append(((ef) this).field_B);
          if (-2147483648 != (((ef) this).field_w ^ -1)) {
            if (2147483647 == ((ef) this).field_C) {
              if (param0) {
                ((ef) this).field_x = 60;
                return param3;
              } else {
                return param3;
              }
            } else {
              L0: {
                StringBuilder discarded$37 = param3.append(" to ").append(((ef) this).field_w).append(44).append(((ef) this).field_C);
                if (!param0) {
                  break L0;
                } else {
                  ((ef) this).field_x = 60;
                  break L0;
                }
              }
              return param3;
            }
          } else {
            if (param0) {
              ((ef) this).field_x = 60;
              return param3;
            } else {
              return param3;
            }
          }
        } else {
          if (param0) {
            ((ef) this).field_x = 60;
            return param3;
          } else {
            return param3;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        super.a((byte) 124, param1, param2, param3, param4, param5);
        int var7 = -8 / ((param0 - 52) / 52);
        ((ef) this).field_n = 0;
    }

    ef(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ef) this).field_C = 2147483647;
        ((ef) this).field_w = 2147483647;
        ((ef) this).field_B = param7 ? true : false;
        ((ef) this).field_v = param8 ? true : false;
        ((ef) this).field_t = param6;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var8 = 0;
        if (param6 < -17) {
          var8 = super.a(param0, param1, param2, param3, param4, param5, (byte) -100) ? 1 : 0;
          if (var8 != 0) {
            if (!((ef) this).field_v) {
              if (((ef) this).a(param2, param1, param0, param5, (byte) 22)) {
                L0: {
                  ((ef) this).field_n = param3;
                  if ((param3 ^ -1) == -2) {
                    ((ef) this).field_D = -((ef) this).field_g + (param0 + -param1);
                    ((ef) this).field_x = -((ef) this).field_r + param2 + -param5;
                    lb.field_p = (ef) this;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((ef) this).a(param2, param1, param0, param5, (byte) 22)) {
              L1: {
                ((ef) this).field_n = param3;
                if ((param3 ^ -1) == -2) {
                  ((ef) this).field_D = -((ef) this).field_g + (param0 + -param1);
                  ((ef) this).field_x = -((ef) this).field_r + param2 + -param5;
                  lb.field_p = (ef) this;
                  break L1;
                } else {
                  break L1;
                }
              }
              return true;
            } else {
              return var8 != 0;
            }
          }
        } else {
          ((ef) this).field_B = false;
          var8 = super.a(param0, param1, param2, param3, param4, param5, (byte) -100) ? 1 : 0;
          if (var8 != 0) {
            if (!((ef) this).field_v) {
              if (((ef) this).a(param2, param1, param0, param5, (byte) 22)) {
                L2: {
                  ((ef) this).field_n = param3;
                  if ((param3 ^ -1) == -2) {
                    ((ef) this).field_D = -((ef) this).field_g + (param0 + -param1);
                    ((ef) this).field_x = -((ef) this).field_r + param2 + -param5;
                    lb.field_p = (ef) this;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((ef) this).a(param2, param1, param0, param5, (byte) 22)) {
              ((ef) this).field_n = param3;
              if ((param3 ^ -1) != -2) {
                return true;
              } else {
                ((ef) this).field_D = -((ef) this).field_g + (param0 + -param1);
                ((ef) this).field_x = -((ef) this).field_r + param2 + -param5;
                lb.field_p = (ef) this;
                return true;
              }
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
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
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
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
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
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
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
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
        if (((ef) this).field_t instanceof htb) {
          if (((htb) (Object) ((ef) this).field_t).field_x) {
            if (-2 != (((ef) this).field_n ^ -1)) {
              if (!((ef) this).field_B) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L0: {
                  if (((ef) this).field_w != ((ef) this).field_g) {
                    L1: {
                      var5 = -((ef) this).field_g + ((ef) this).field_w;
                      stackOut_70_0 = this;
                      stackOut_70_1 = ((ef) this).field_g;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (-3 <= Math.abs(var5)) {
                        stackOut_72_0 = this;
                        stackOut_72_1 = stackIn_72_1;
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_74_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (-1 >= var5) {
                          stackOut_74_0 = this;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = -1;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          stackIn_75_2 = stackOut_74_2;
                          break L1;
                        } else {
                          stackOut_73_0 = this;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = 1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_75_2 = stackOut_73_2;
                          break L1;
                        }
                      } else {
                        stackOut_71_0 = this;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = var5 >> -891170431;
                        stackIn_75_0 = stackOut_71_0;
                        stackIn_75_1 = stackOut_71_1;
                        stackIn_75_2 = stackOut_71_2;
                        break L1;
                      }
                    }
                    ((ef) this).field_g = stackIn_75_1 + stackIn_75_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((ef) this).field_C != ((ef) this).field_r) {
                  L2: {
                    L3: {
                      var5 = -((ef) this).field_r + ((ef) this).field_C;
                      stackOut_78_0 = this;
                      stackOut_78_1 = ((ef) this).field_r;
                      stackIn_82_0 = stackOut_78_0;
                      stackIn_82_1 = stackOut_78_1;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_82_0 = this;
                        stackOut_82_1 = stackIn_82_1;
                        stackOut_82_2 = var5 >> -698883775;
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
                        if (var5 <= 0) {
                          stackOut_81_0 = this;
                          stackOut_81_1 = stackIn_81_1;
                          stackOut_81_2 = -1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          stackIn_83_2 = stackOut_81_2;
                          break L3;
                        } else {
                          ((ef) this).field_r = stackIn_80_1 + 1;
                          break L2;
                        }
                      }
                    }
                    ((ef) this).field_r = stackIn_83_1 + stackIn_83_2;
                    break L2;
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              var5 = -((ef) this).field_D + (kc.field_b + -param1);
              var6 = -((ef) this).field_x + uia.field_b - param0;
              if (((ef) this).field_g != var5) {
                ((ef) this).field_g = var5;
                ((ef) this).field_r = var6;
                if (!(((ef) this).field_l instanceof l)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((l) (Object) ((ef) this).field_l).a(false, param1, param0, (ef) this);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (((ef) this).field_r == var6) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  L4: {
                    ((ef) this).field_g = var5;
                    ((ef) this).field_r = var6;
                    if (!(((ef) this).field_l instanceof l)) {
                      break L4;
                    } else {
                      ((l) (Object) ((ef) this).field_l).a(false, param1, param0, (ef) this);
                      break L4;
                    }
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            }
          } else {
            if (!((ef) this).field_B) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L5: {
                if (((ef) this).field_w != ((ef) this).field_g) {
                  L6: {
                    var5 = -((ef) this).field_g + ((ef) this).field_w;
                    stackOut_38_0 = this;
                    stackOut_38_1 = ((ef) this).field_g;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (-3 <= Math.abs(var5)) {
                      stackOut_40_0 = this;
                      stackOut_40_1 = stackIn_40_1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      if (-1 >= var5) {
                        stackOut_42_0 = this;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = -1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        stackIn_43_2 = stackOut_42_2;
                        break L6;
                      } else {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        break L6;
                      }
                    } else {
                      stackOut_39_0 = this;
                      stackOut_39_1 = stackIn_39_1;
                      stackOut_39_2 = var5 >> -891170431;
                      stackIn_43_0 = stackOut_39_0;
                      stackIn_43_1 = stackOut_39_1;
                      stackIn_43_2 = stackOut_39_2;
                      break L6;
                    }
                  }
                  ((ef) this).field_g = stackIn_43_1 + stackIn_43_2;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (((ef) this).field_C != ((ef) this).field_r) {
                L7: {
                  L8: {
                    var5 = -((ef) this).field_r + ((ef) this).field_C;
                    stackOut_46_0 = this;
                    stackOut_46_1 = ((ef) this).field_r;
                    stackIn_50_0 = stackOut_46_0;
                    stackIn_50_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_50_0 = this;
                      stackOut_50_1 = stackIn_50_1;
                      stackOut_50_2 = var5 >> -698883775;
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
                      if (var5 <= 0) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = -1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        stackIn_51_2 = stackOut_49_2;
                        break L8;
                      } else {
                        ((ef) this).field_r = stackIn_48_1 + 1;
                        break L7;
                      }
                    }
                  }
                  ((ef) this).field_r = stackIn_51_1 + stackIn_51_2;
                  break L7;
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
          if (-2 != (((ef) this).field_n ^ -1)) {
            if (((ef) this).field_B) {
              L9: {
                if (((ef) this).field_w != ((ef) this).field_g) {
                  L10: {
                    var5 = -((ef) this).field_g + ((ef) this).field_w;
                    stackOut_17_0 = this;
                    stackOut_17_1 = ((ef) this).field_g;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (-3 <= Math.abs(var5)) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (-1 >= var5) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = -1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        break L10;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L10;
                      }
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> -891170431;
                      stackIn_22_0 = stackOut_18_0;
                      stackIn_22_1 = stackOut_18_1;
                      stackIn_22_2 = stackOut_18_2;
                      break L10;
                    }
                  }
                  ((ef) this).field_g = stackIn_22_1 + stackIn_22_2;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (((ef) this).field_C != ((ef) this).field_r) {
                L11: {
                  L12: {
                    var5 = -((ef) this).field_r + ((ef) this).field_C;
                    stackOut_25_0 = this;
                    stackOut_25_1 = ((ef) this).field_r;
                    stackIn_29_0 = stackOut_25_0;
                    stackIn_29_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = stackIn_29_1;
                      stackOut_29_2 = var5 >> -698883775;
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
                      if (var5 <= 0) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = -1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        break L12;
                      } else {
                        ((ef) this).field_r = stackIn_27_1 + 1;
                        break L11;
                      }
                    }
                  }
                  ((ef) this).field_r = stackIn_30_1 + stackIn_30_2;
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
            var5 = -((ef) this).field_D + (kc.field_b + -param1);
            var6 = -((ef) this).field_x + uia.field_b - param0;
            if (((ef) this).field_g != var5) {
              ((ef) this).field_g = var5;
              ((ef) this).field_r = var6;
              if (((ef) this).field_l instanceof l) {
                ((l) (Object) ((ef) this).field_l).a(false, param1, param0, (ef) this);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (((ef) this).field_r != var6) {
                L13: {
                  ((ef) this).field_g = var5;
                  ((ef) this).field_r = var6;
                  if (!(((ef) this).field_l instanceof l)) {
                    break L13;
                  } else {
                    ((l) (Object) ((ef) this).field_l).a(false, param1, param0, (ef) this);
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

    final void a(int param0) {
        super.a(120);
        ((ef) this).field_t.a(0, ((ef) this).field_h, ((ef) this).field_f, 1, 0);
        ((ef) this).field_w = ((ef) this).field_g;
        int var2 = -102 / ((param0 - -80) / 42);
        ((ef) this).field_C = ((ef) this).field_r;
    }

    public static void e(int param0) {
        field_y = null;
        field_A = null;
        int var1 = 124 % ((-23 - param0) / 44);
    }

    final static caa a(String param0, String param1, int param2, asb param3) {
        if (param2 >= -47) {
            Object var6 = null;
            caa discarded$0 = ef.a((String) null, (String) null, 4, (asb) null);
        }
        int var4 = param3.b(param1, -97);
        int var5 = param3.a(true, var4, param0);
        return rr.a(-32431, param3, var4, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = false;
        field_A = "You do not have a suitable number of players for the current options.";
    }
}
