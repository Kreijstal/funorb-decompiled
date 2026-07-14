/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk extends dk {
    private boolean field_E;
    static int[] field_J;
    private int field_L;
    static String field_G;
    private int field_I;
    private int field_F;
    private int field_H;
    private boolean field_K;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        Object var6 = null;
        if (param3 < -47) {
          if (((pk) this).a(param1, -103, param0, param2)) {
            ((pk) this).a(param2, -70, param0, param1);
            ((pk) this).a(param0, param1, (byte) 103, param2);
            StringBuilder discarded$4 = param0.append(" revert=").append(((pk) this).field_K);
            if (((pk) this).field_I != 2147483647) {
              if (-2147483648 != (((pk) this).field_H ^ -1)) {
                StringBuilder discarded$5 = param0.append(" to ").append(((pk) this).field_I).append(44).append(((pk) this).field_H);
                return param0;
              } else {
                return param0;
              }
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        } else {
          var6 = null;
          ((pk) this).a((byte) 36, (qa) null, 37, -90, -110, -10);
          if (((pk) this).a(param1, -103, param0, param2)) {
            ((pk) this).a(param2, -70, param0, param1);
            ((pk) this).a(param0, param1, (byte) 103, param2);
            StringBuilder discarded$6 = param0.append(" revert=").append(((pk) this).field_K);
            if (((pk) this).field_I != 2147483647) {
              if (-2147483648 == (((pk) this).field_H ^ -1)) {
                return param0;
              } else {
                StringBuilder discarded$7 = param0.append(" to ").append(((pk) this).field_I).append(44).append(((pk) this).field_H);
                return param0;
              }
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((pk) this).field_v = 0;
    }

    private pk(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((pk) this).field_I = 2147483647;
        ((pk) this).field_H = 2147483647;
        ((pk) this).field_E = param8 ? true : false;
        ((pk) this).field_K = param7 ? true : false;
        ((pk) this).field_A = param6;
    }

    final void c(boolean param0) {
        super.c(param0);
        ((pk) this).field_A.a(0, ((pk) this).field_u, 0, ((pk) this).field_j, 80);
        ((pk) this).field_H = ((pk) this).field_z;
        ((pk) this).field_I = ((pk) this).field_y;
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        Object stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        Object stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        if (param3 >= -85) {
          var7 = null;
          ((pk) this).a((byte) -72, (qa) null, 106, 108, -8, 125);
          if (((pk) this).field_A instanceof bb) {
            if (!((bb) (Object) ((pk) this).field_A).field_D) {
              if (((pk) this).field_K) {
                L0: {
                  if (((pk) this).field_y != ((pk) this).field_I) {
                    L1: {
                      var5 = -((pk) this).field_y + ((pk) this).field_I;
                      stackOut_98_0 = this;
                      stackOut_98_1 = ((pk) this).field_y;
                      stackIn_100_0 = stackOut_98_0;
                      stackIn_100_1 = stackOut_98_1;
                      stackIn_99_0 = stackOut_98_0;
                      stackIn_99_1 = stackOut_98_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_100_0 = this;
                        stackOut_100_1 = stackIn_100_1;
                        stackIn_102_0 = stackOut_100_0;
                        stackIn_102_1 = stackOut_100_1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        if ((var5 ^ -1) < -1) {
                          stackOut_102_0 = this;
                          stackOut_102_1 = stackIn_102_1;
                          stackOut_102_2 = 1;
                          stackIn_103_0 = stackOut_102_0;
                          stackIn_103_1 = stackOut_102_1;
                          stackIn_103_2 = stackOut_102_2;
                          break L1;
                        } else {
                          stackOut_101_0 = this;
                          stackOut_101_1 = stackIn_101_1;
                          stackOut_101_2 = -1;
                          stackIn_103_0 = stackOut_101_0;
                          stackIn_103_1 = stackOut_101_1;
                          stackIn_103_2 = stackOut_101_2;
                          break L1;
                        }
                      } else {
                        stackOut_99_0 = this;
                        stackOut_99_1 = stackIn_99_1;
                        stackOut_99_2 = var5 >> -1246868255;
                        stackIn_103_0 = stackOut_99_0;
                        stackIn_103_1 = stackOut_99_1;
                        stackIn_103_2 = stackOut_99_2;
                        break L1;
                      }
                    }
                    ((pk) this).field_y = stackIn_103_1 + stackIn_103_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((pk) this).field_H != ((pk) this).field_z) {
                  L2: {
                    var5 = ((pk) this).field_H - ((pk) this).field_z;
                    stackOut_106_0 = this;
                    stackOut_106_1 = ((pk) this).field_z;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    if (-3 <= (Math.abs(var5) ^ -1)) {
                      L3: {
                        stackOut_108_0 = this;
                        stackOut_108_1 = stackIn_108_1;
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_110_1 = stackOut_108_1;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        if (0 >= var5) {
                          stackOut_110_0 = this;
                          stackOut_110_1 = stackIn_110_1;
                          stackOut_110_2 = -1;
                          stackIn_111_0 = stackOut_110_0;
                          stackIn_111_1 = stackOut_110_1;
                          stackIn_111_2 = stackOut_110_2;
                          break L3;
                        } else {
                          stackOut_109_0 = this;
                          stackOut_109_1 = stackIn_109_1;
                          stackOut_109_2 = 1;
                          stackIn_111_0 = stackOut_109_0;
                          stackIn_111_1 = stackOut_109_1;
                          stackIn_111_2 = stackOut_109_2;
                          break L3;
                        }
                      }
                      ((pk) this).field_z = stackIn_111_1 + stackIn_111_2;
                      break L2;
                    } else {
                      ((pk) this).field_z = stackIn_107_1 + (var5 >> 231527361);
                      break L2;
                    }
                  }
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              } else {
                super.a(param0, param1, param2, (byte) -91);
                return;
              }
            } else {
              if (-2 == (((pk) this).field_v ^ -1)) {
                var5 = -param1 + (ag.field_f - ((pk) this).field_F);
                var6 = -param0 + -((pk) this).field_L + kc.field_b;
                if (((pk) this).field_y != var5) {
                  ((pk) this).field_z = var6;
                  ((pk) this).field_y = var5;
                  if (((pk) this).field_s instanceof qd) {
                    ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  } else {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                } else {
                  if (((pk) this).field_z != var6) {
                    ((pk) this).field_z = var6;
                    ((pk) this).field_y = var5;
                    if (!(((pk) this).field_s instanceof qd)) {
                      super.a(param0, param1, param2, (byte) -91);
                      return;
                    } else {
                      ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                      super.a(param0, param1, param2, (byte) -91);
                      return;
                    }
                  } else {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                }
              } else {
                if (((pk) this).field_K) {
                  L4: {
                    if (((pk) this).field_y != ((pk) this).field_I) {
                      L5: {
                        var5 = -((pk) this).field_y + ((pk) this).field_I;
                        stackOut_77_0 = this;
                        stackOut_77_1 = ((pk) this).field_y;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        if (-3 <= (Math.abs(var5) ^ -1)) {
                          stackOut_79_0 = this;
                          stackOut_79_1 = stackIn_79_1;
                          stackIn_81_0 = stackOut_79_0;
                          stackIn_81_1 = stackOut_79_1;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          if ((var5 ^ -1) < -1) {
                            stackOut_81_0 = this;
                            stackOut_81_1 = stackIn_81_1;
                            stackOut_81_2 = 1;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            stackIn_82_2 = stackOut_81_2;
                            break L5;
                          } else {
                            stackOut_80_0 = this;
                            stackOut_80_1 = stackIn_80_1;
                            stackOut_80_2 = -1;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_82_1 = stackOut_80_1;
                            stackIn_82_2 = stackOut_80_2;
                            break L5;
                          }
                        } else {
                          stackOut_78_0 = this;
                          stackOut_78_1 = stackIn_78_1;
                          stackOut_78_2 = var5 >> -1246868255;
                          stackIn_82_0 = stackOut_78_0;
                          stackIn_82_1 = stackOut_78_1;
                          stackIn_82_2 = stackOut_78_2;
                          break L5;
                        }
                      }
                      ((pk) this).field_y = stackIn_82_1 + stackIn_82_2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (((pk) this).field_H != ((pk) this).field_z) {
                    L6: {
                      var5 = ((pk) this).field_H - ((pk) this).field_z;
                      stackOut_85_0 = this;
                      stackOut_85_1 = ((pk) this).field_z;
                      stackIn_87_0 = stackOut_85_0;
                      stackIn_87_1 = stackOut_85_1;
                      stackIn_86_0 = stackOut_85_0;
                      stackIn_86_1 = stackOut_85_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        L7: {
                          stackOut_87_0 = this;
                          stackOut_87_1 = stackIn_87_1;
                          stackIn_89_0 = stackOut_87_0;
                          stackIn_89_1 = stackOut_87_1;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          if (0 >= var5) {
                            stackOut_89_0 = this;
                            stackOut_89_1 = stackIn_89_1;
                            stackOut_89_2 = -1;
                            stackIn_90_0 = stackOut_89_0;
                            stackIn_90_1 = stackOut_89_1;
                            stackIn_90_2 = stackOut_89_2;
                            break L7;
                          } else {
                            stackOut_88_0 = this;
                            stackOut_88_1 = stackIn_88_1;
                            stackOut_88_2 = 1;
                            stackIn_90_0 = stackOut_88_0;
                            stackIn_90_1 = stackOut_88_1;
                            stackIn_90_2 = stackOut_88_2;
                            break L7;
                          }
                        }
                        ((pk) this).field_z = stackIn_90_1 + stackIn_90_2;
                        break L6;
                      } else {
                        ((pk) this).field_z = stackIn_86_1 + (var5 >> 231527361);
                        break L6;
                      }
                    }
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  } else {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              }
            }
          } else {
            if (-2 == (((pk) this).field_v ^ -1)) {
              var5 = -param1 + (ag.field_f - ((pk) this).field_F);
              var6 = -param0 + -((pk) this).field_L + kc.field_b;
              if (((pk) this).field_y != var5) {
                ((pk) this).field_z = var6;
                ((pk) this).field_y = var5;
                if (((pk) this).field_s instanceof qd) {
                  ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              } else {
                if (((pk) this).field_z != var6) {
                  ((pk) this).field_z = var6;
                  ((pk) this).field_y = var5;
                  if (!(((pk) this).field_s instanceof qd)) {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  } else {
                    ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              }
            } else {
              if (((pk) this).field_K) {
                L8: {
                  if (((pk) this).field_y != ((pk) this).field_I) {
                    L9: {
                      var5 = -((pk) this).field_y + ((pk) this).field_I;
                      stackOut_42_0 = this;
                      stackOut_42_1 = ((pk) this).field_y;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if ((var5 ^ -1) < -1) {
                          stackOut_46_0 = this;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = 1;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          break L9;
                        } else {
                          stackOut_45_0 = this;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = -1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_47_2 = stackOut_45_2;
                          break L9;
                        }
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = var5 >> -1246868255;
                        stackIn_47_0 = stackOut_43_0;
                        stackIn_47_1 = stackOut_43_1;
                        stackIn_47_2 = stackOut_43_2;
                        break L9;
                      }
                    }
                    ((pk) this).field_y = stackIn_47_1 + stackIn_47_2;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (((pk) this).field_H != ((pk) this).field_z) {
                  L10: {
                    var5 = ((pk) this).field_H - ((pk) this).field_z;
                    stackOut_50_0 = this;
                    stackOut_50_1 = ((pk) this).field_z;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    if (-3 <= (Math.abs(var5) ^ -1)) {
                      L11: {
                        stackOut_52_0 = this;
                        stackOut_52_1 = stackIn_52_1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (0 >= var5) {
                          stackOut_54_0 = this;
                          stackOut_54_1 = stackIn_54_1;
                          stackOut_54_2 = -1;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          stackIn_55_2 = stackOut_54_2;
                          break L11;
                        } else {
                          stackOut_53_0 = this;
                          stackOut_53_1 = stackIn_53_1;
                          stackOut_53_2 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          stackIn_55_2 = stackOut_53_2;
                          break L11;
                        }
                      }
                      ((pk) this).field_z = stackIn_55_1 + stackIn_55_2;
                      break L10;
                    } else {
                      ((pk) this).field_z = stackIn_51_1 + (var5 >> 231527361);
                      break L10;
                    }
                  }
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                } else {
                  super.a(param0, param1, param2, (byte) -91);
                  return;
                }
              } else {
                super.a(param0, param1, param2, (byte) -91);
                return;
              }
            }
          }
        } else {
          L12: {
            L13: {
              if (!(((pk) this).field_A instanceof bb)) {
                break L13;
              } else {
                if (!((bb) (Object) ((pk) this).field_A).field_D) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (-2 == (((pk) this).field_v ^ -1)) {
              L14: {
                var5 = -param1 + (ag.field_f - ((pk) this).field_F);
                var6 = -param0 + -((pk) this).field_L + kc.field_b;
                if (((pk) this).field_y != var5) {
                  break L14;
                } else {
                  if (((pk) this).field_z != var6) {
                    break L14;
                  } else {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                }
              }
              ((pk) this).field_z = var6;
              ((pk) this).field_y = var5;
              if (((pk) this).field_s instanceof qd) {
                ((qd) (Object) ((pk) this).field_s).a(-30781, param1, (pk) this, param0);
                super.a(param0, param1, param2, (byte) -91);
                return;
              } else {
                super.a(param0, param1, param2, (byte) -91);
                return;
              }
            } else {
              break L12;
            }
          }
          if (((pk) this).field_K) {
            L15: {
              if (((pk) this).field_y != ((pk) this).field_I) {
                L16: {
                  var5 = -((pk) this).field_y + ((pk) this).field_I;
                  stackOut_10_0 = this;
                  stackOut_10_1 = ((pk) this).field_y;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (-3 <= (Math.abs(var5) ^ -1)) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = stackIn_12_1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if ((var5 ^ -1) < -1) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L16;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = -1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      break L16;
                    }
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = var5 >> -1246868255;
                    stackIn_15_0 = stackOut_11_0;
                    stackIn_15_1 = stackOut_11_1;
                    stackIn_15_2 = stackOut_11_2;
                    break L16;
                  }
                }
                ((pk) this).field_y = stackIn_15_1 + stackIn_15_2;
                break L15;
              } else {
                break L15;
              }
            }
            if (((pk) this).field_H != ((pk) this).field_z) {
              L17: {
                var5 = ((pk) this).field_H - ((pk) this).field_z;
                stackOut_18_0 = this;
                stackOut_18_1 = ((pk) this).field_z;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (-3 <= (Math.abs(var5) ^ -1)) {
                  L18: {
                    stackOut_20_0 = this;
                    stackOut_20_1 = stackIn_20_1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (0 >= var5) {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = -1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      break L18;
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      break L18;
                    }
                  }
                  ((pk) this).field_z = stackIn_23_1 + stackIn_23_2;
                  break L17;
                } else {
                  ((pk) this).field_z = stackIn_19_1 + (var5 >> 231527361);
                  break L17;
                }
              }
              super.a(param0, param1, param2, (byte) -91);
              return;
            } else {
              super.a(param0, param1, param2, (byte) -91);
              return;
            }
          } else {
            super.a(param0, param1, param2, (byte) -91);
            return;
          }
        }
    }

    final static ve a(byte param0, String param1) {
        if (param0 != 68) {
            field_G = null;
            return new ve(param1);
        }
        return new ve(param1);
    }

    public static void d(byte param0) {
        field_G = null;
        if (param0 < 50) {
            pk.d((byte) 21);
            field_J = null;
            return;
        }
        field_J = null;
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((pk) this).b(param0, param6, 0, param4, param2)) {
            ((pk) this).field_v = param5;
            if (1 == param5) {
              ((pk) this).field_F = -param6 + -((pk) this).field_y + param4;
              ((pk) this).field_L = -param0 + (-((pk) this).field_z + param2);
              wi.field_e = (pk) this;
              return true;
            } else {
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((pk) this).field_E) {
            if (((pk) this).b(param0, param6, 0, param4, param2)) {
              ((pk) this).field_v = param5;
              if (1 != param5) {
                return true;
              } else {
                ((pk) this).field_F = -param6 + -((pk) this).field_y + param4;
                ((pk) this).field_L = -param0 + (-((pk) this).field_z + param2);
                wi.field_e = (pk) this;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[16384];
        field_G = "Level: <%0>";
    }
}
