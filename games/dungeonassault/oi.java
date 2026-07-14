/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class oi extends da {
    private boolean field_I;
    private boolean field_H;
    private int field_L;
    private int field_O;
    private int field_K;
    private int field_N;
    static ec field_J;
    static md field_F;
    static String field_G;
    static String field_M;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        if (((oi) this).a(param1, param0, 87, param2)) {
          L0: {
            ((oi) this).a(param0, param2, param1, 1);
            ((oi) this).a(true, param2, param0, param1);
            StringBuilder discarded$26 = param2.append(" revert=").append(((oi) this).field_I);
            if (-2147483648 == ((oi) this).field_L) {
              break L0;
            } else {
              if (-2147483648 != ((oi) this).field_N) {
                StringBuilder discarded$27 = param2.append(" to ").append(((oi) this).field_L).append(44).append(((oi) this).field_N);
                break L0;
              } else {
                if (param3 > -76) {
                  return null;
                } else {
                  return param2;
                }
              }
            }
          }
          if (param3 > -76) {
            return null;
          } else {
            return param2;
          }
        } else {
          if (param3 > -76) {
            return null;
          } else {
            return param2;
          }
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
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
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        if (((oi) this).field_D instanceof ck) {
          if (((ck) (Object) ((oi) this).field_D).field_B) {
            if (((oi) this).field_y == 1) {
              var5 = -param0 + (-((oi) this).field_K + hj.field_S);
              var6 = -param1 + -((oi) this).field_O + eh.field_h;
              if (((oi) this).field_q != var5) {
                ((oi) this).field_q = var5;
                ((oi) this).field_v = var6;
                if (((oi) this).field_n instanceof vi) {
                  ((vi) (Object) ((oi) this).field_n).a((byte) -49, (oi) this, param1, param0);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((oi) this).field_v) {
                  ((oi) this).field_q = var5;
                  ((oi) this).field_v = var6;
                  if (!(((oi) this).field_n instanceof vi)) {
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    ((vi) (Object) ((oi) this).field_n).a((byte) -49, (oi) this, param1, param0);
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((oi) this).field_I) {
                L0: {
                  if (((oi) this).field_L == ((oi) this).field_q) {
                    break L0;
                  } else {
                    L1: {
                      var5 = ((oi) this).field_L + -((oi) this).field_q;
                      stackOut_58_0 = this;
                      stackOut_58_1 = ((oi) this).field_q;
                      stackIn_60_0 = stackOut_58_0;
                      stackIn_60_1 = stackOut_58_1;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        stackOut_60_0 = this;
                        stackOut_60_1 = stackIn_60_1;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_62_0 = this;
                          stackOut_62_1 = stackIn_62_1;
                          stackOut_62_2 = -1;
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          stackIn_63_2 = stackOut_62_2;
                          break L1;
                        } else {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          stackIn_63_2 = stackOut_61_2;
                          break L1;
                        }
                      } else {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = var5 >> -1326086559;
                        stackIn_63_0 = stackOut_59_0;
                        stackIn_63_1 = stackOut_59_1;
                        stackIn_63_2 = stackOut_59_2;
                        break L1;
                      }
                    }
                    ((oi) this).field_q = stackIn_63_1 + stackIn_63_2;
                    break L0;
                  }
                }
                if (((oi) this).field_N != ((oi) this).field_v) {
                  L2: {
                    var5 = ((oi) this).field_N - ((oi) this).field_v;
                    stackOut_66_0 = this;
                    stackOut_66_1 = ((oi) this).field_v;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (Math.abs(var5) <= 2) {
                      L3: {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        if (0 < var5) {
                          stackOut_70_0 = this;
                          stackOut_70_1 = stackIn_70_1;
                          stackOut_70_2 = 1;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          stackIn_71_2 = stackOut_70_2;
                          break L3;
                        } else {
                          stackOut_69_0 = this;
                          stackOut_69_1 = stackIn_69_1;
                          stackOut_69_2 = -1;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          stackIn_71_2 = stackOut_69_2;
                          break L3;
                        }
                      }
                      ((oi) this).field_v = stackIn_71_1 + stackIn_71_2;
                      break L2;
                    } else {
                      ((oi) this).field_v = stackIn_67_1 + (var5 >> -1050059583);
                      break L2;
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
            }
          } else {
            if (!((oi) this).field_I) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((oi) this).field_L == ((oi) this).field_q) {
                  break L4;
                } else {
                  L5: {
                    var5 = ((oi) this).field_L + -((oi) this).field_q;
                    stackOut_37_0 = this;
                    stackOut_37_1 = ((oi) this).field_q;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_39_0 = this;
                      stackOut_39_1 = stackIn_39_1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = -1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        break L5;
                      } else {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L5;
                      }
                    } else {
                      stackOut_38_0 = this;
                      stackOut_38_1 = stackIn_38_1;
                      stackOut_38_2 = var5 >> -1326086559;
                      stackIn_42_0 = stackOut_38_0;
                      stackIn_42_1 = stackOut_38_1;
                      stackIn_42_2 = stackOut_38_2;
                      break L5;
                    }
                  }
                  ((oi) this).field_q = stackIn_42_1 + stackIn_42_2;
                  break L4;
                }
              }
              if (((oi) this).field_N != ((oi) this).field_v) {
                L6: {
                  var5 = ((oi) this).field_N - ((oi) this).field_v;
                  stackOut_45_0 = this;
                  stackOut_45_1 = ((oi) this).field_v;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  if (Math.abs(var5) <= 2) {
                    L7: {
                      stackOut_47_0 = this;
                      stackOut_47_1 = stackIn_47_1;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (0 < var5) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L7;
                      } else {
                        stackOut_48_0 = this;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = -1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L7;
                      }
                    }
                    ((oi) this).field_v = stackIn_50_1 + stackIn_50_2;
                    break L6;
                  } else {
                    ((oi) this).field_v = stackIn_46_1 + (var5 >> -1050059583);
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
          if (((oi) this).field_y == 1) {
            var5 = -param0 + (-((oi) this).field_K + hj.field_S);
            var6 = -param1 + -((oi) this).field_O + eh.field_h;
            if (((oi) this).field_q != var5) {
              ((oi) this).field_q = var5;
              ((oi) this).field_v = var6;
              if (((oi) this).field_n instanceof vi) {
                ((vi) (Object) ((oi) this).field_n).a((byte) -49, (oi) this, param1, param0);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (var6 != ((oi) this).field_v) {
                ((oi) this).field_q = var5;
                ((oi) this).field_v = var6;
                if (!(((oi) this).field_n instanceof vi)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((vi) (Object) ((oi) this).field_n).a((byte) -49, (oi) this, param1, param0);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((oi) this).field_I) {
              L8: {
                if (((oi) this).field_L == ((oi) this).field_q) {
                  break L8;
                } else {
                  L9: {
                    var5 = ((oi) this).field_L + -((oi) this).field_q;
                    stackOut_5_0 = this;
                    stackOut_5_1 = ((oi) this).field_q;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = -1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L9;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L9;
                      }
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = var5 >> -1326086559;
                      stackIn_10_0 = stackOut_6_0;
                      stackIn_10_1 = stackOut_6_1;
                      stackIn_10_2 = stackOut_6_2;
                      break L9;
                    }
                  }
                  ((oi) this).field_q = stackIn_10_1 + stackIn_10_2;
                  break L8;
                }
              }
              if (((oi) this).field_N != ((oi) this).field_v) {
                L10: {
                  var5 = ((oi) this).field_N - ((oi) this).field_v;
                  stackOut_13_0 = this;
                  stackOut_13_1 = ((oi) this).field_v;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (Math.abs(var5) <= 2) {
                    L11: {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (0 < var5) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L11;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L11;
                      }
                    }
                    ((oi) this).field_v = stackIn_18_1 + stackIn_18_2;
                    break L10;
                  } else {
                    ((oi) this).field_v = stackIn_14_1 + (var5 >> -1050059583);
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
          }
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 0) {
            return 121;
        }
        return uj.a(ld.field_f, param0 ^ 37, param1);
    }

    private oi(int param0, int param1, int param2, int param3, ca param4, pg param5, lm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((oi) this).field_L = 2147483647;
        ((oi) this).field_N = 2147483647;
        ((oi) this).field_D = param6;
        ((oi) this).field_H = param8 ? true : false;
        ((oi) this).field_I = param7 ? true : false;
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, (byte) -2, param6) ? 1 : 0;
        var9 = -65 / ((-80 - param5) / 35);
        if (var8 == 0) {
          if (((oi) this).a(param4, param3, param6, -1, param2)) {
            if (1 == param1) {
              ((oi) this).field_O = param2 + (-((oi) this).field_v + -param6);
              ah.field_b = (oi) this;
              ((oi) this).field_K = -param3 + param4 - ((oi) this).field_q;
              ((oi) this).field_y = param1;
              return true;
            } else {
              ((oi) this).field_y = param1;
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((oi) this).field_H) {
            if (((oi) this).a(param4, param3, param6, -1, param2)) {
              if (1 != param1) {
                ((oi) this).field_y = param1;
                return true;
              } else {
                ((oi) this).field_O = param2 + (-((oi) this).field_v + -param6);
                ah.field_b = (oi) this;
                ((oi) this).field_K = -param3 + param4 - ((oi) this).field_q;
                ((oi) this).field_y = param1;
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

    final void e(byte param0) {
        super.e((byte) -42);
        ((oi) this).field_D.b(0, ((oi) this).field_x, 0, 0, ((oi) this).field_s);
        if (param0 >= -4) {
          return;
        } else {
          ((oi) this).field_L = ((oi) this).field_q;
          ((oi) this).field_N = ((oi) this).field_v;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, nh param3) {
        if (param0 == 0) {
          if (!kk.a(param3, 1, param1, param2)) {
            return null;
          } else {
            return fo.a(0);
          }
        } else {
          field_F = null;
          if (!kk.a(param3, 1, param1, param2)) {
            return null;
          } else {
            return fo.a(0);
          }
        }
    }

    final static void f(byte param0) {
        oh.field_s = 10;
        jn.field_c = false;
        ke.field_b = vd.field_a;
        if (param0 != 100) {
            return;
        }
        jm.a(param0 ^ -17601);
    }

    final static boolean a(int param0, int param1) {
        try {
            if (ra.field_c.field_o >= param1) {
                return true;
            }
            if (!(null != sp.field_c)) {
                return false;
            }
            int var2_int = sp.field_c.a(0);
            if (0 < var2_int) {
                if (-ra.field_c.field_o + param1 < var2_int) {
                    var2_int = -ra.field_c.field_o + param1;
                }
                sp.field_c.a(ra.field_c.field_m, false, var2_int, ra.field_c.field_o);
                qm.field_o = kd.c(param0 ^ 15127);
                ra.field_c.field_o = ra.field_c.field_o + var2_int;
                if (!(param1 <= ra.field_c.field_o)) {
                    return false;
                }
                ra.field_c.field_o = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (param0 != -12929) {
                    field_F = null;
                }
                if ((var2_int ^ -1) <= -1) {
                    if (b.a(124) <= 30000L) {
                        return false;
                    }
                }
                tl.a(-77);
            } catch (IOException iOException) {
                tl.a(param0 + 13056);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        if (!param1) {
          ((oi) this).field_K = 60;
          super.a(param0, param1, param2, param3, param4, param5);
          ((oi) this).field_y = 0;
          return;
        } else {
          super.a(param0, param1, param2, param3, param4, param5);
          ((oi) this).field_y = 0;
          return;
        }
    }

    public static void h(int param0) {
        if (param0 < 108) {
          field_J = null;
          field_M = null;
          field_F = null;
          field_J = null;
          field_G = null;
          return;
        } else {
          field_M = null;
          field_F = null;
          field_J = null;
          field_G = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new ec(1048576);
        field_G = "Connection lost. <%0>";
        field_F = null;
        field_M = "Save and exit";
    }
}
