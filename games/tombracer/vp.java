/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vp extends qr {
    private boolean field_z;
    private int field_A;
    private int field_D;
    static String field_B;
    private int field_E;
    private boolean field_C;
    private int field_y;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (((vp) this).a((byte) -127, param0, param1, param2)) {
          L0: {
            ((vp) this).a(1, param2, param1, param0);
            ((vp) this).a(param1, param0, param2, 0);
            StringBuilder discarded$2 = param2.append(" revert=").append(((vp) this).field_C);
            if (-2147483648 == ((vp) this).field_y) {
              break L0;
            } else {
              if (-2147483648 != ((vp) this).field_E) {
                StringBuilder discarded$3 = param2.append(" to ").append(((vp) this).field_y).append(44).append(((vp) this).field_E);
                break L0;
              } else {
                if (param3 == 0) {
                  return param2;
                } else {
                  var6 = null;
                  ((vp) this).a(-39, 47, (ae) null, -72);
                  return param2;
                }
              }
            }
          }
          if (param3 != 0) {
            var6 = null;
            ((vp) this).a(-39, 47, (ae) null, -72);
            return param2;
          } else {
            return param2;
          }
        } else {
          if (param3 == 0) {
            return param2;
          } else {
            var6 = null;
            ((vp) this).a(-39, 47, (ae) null, -72);
            return param2;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var8 = 0;
        if (param0 > 70) {
          var8 = super.a(109, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 == 0) {
            if (!((vp) this).a(param6, param1, 18, param3, param2)) {
              return var8 != 0;
            } else {
              L0: {
                if ((param4 ^ -1) == -2) {
                  ((vp) this).field_D = param3 + -((vp) this).field_n - param2;
                  ((vp) this).field_A = -((vp) this).field_i + (param6 - param1);
                  ava.field_f = (vp) this;
                  break L0;
                } else {
                  break L0;
                }
              }
              ((vp) this).field_s = param4;
              return true;
            }
          } else {
            if (!((vp) this).field_z) {
              if (!((vp) this).a(param6, param1, 18, param3, param2)) {
                return var8 != 0;
              } else {
                L1: {
                  if ((param4 ^ -1) == -2) {
                    ((vp) this).field_D = param3 + -((vp) this).field_n - param2;
                    ((vp) this).field_A = -((vp) this).field_i + (param6 - param1);
                    ava.field_f = (vp) this;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((vp) this).field_s = param4;
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          ((vp) this).field_y = -96;
          var8 = super.a(109, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((vp) this).field_z) {
              if (!((vp) this).a(param6, param1, 18, param3, param2)) {
                return var8 != 0;
              } else {
                L2: {
                  if ((param4 ^ -1) == -2) {
                    ((vp) this).field_D = param3 + -((vp) this).field_n - param2;
                    ((vp) this).field_A = -((vp) this).field_i + (param6 - param1);
                    ava.field_f = (vp) this;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((vp) this).field_s = param4;
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (!((vp) this).a(param6, param1, 18, param3, param2)) {
              return var8 != 0;
            } else {
              L3: {
                if ((param4 ^ -1) == -2) {
                  ((vp) this).field_D = param3 + -((vp) this).field_n - param2;
                  ((vp) this).field_A = -((vp) this).field_i + (param6 - param1);
                  ava.field_f = (vp) this;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((vp) this).field_s = param4;
              return true;
            }
          }
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((vp) this).field_s = 0;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
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
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
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
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        if (((vp) this).field_x instanceof rj) {
          if (((rj) (Object) ((vp) this).field_x).field_y) {
            if (-2 == (((vp) this).field_s ^ -1)) {
              var5 = -param0 + jba.field_j + -((vp) this).field_A;
              var6 = -((vp) this).field_D + (sta.field_B + -param3);
              if (((vp) this).field_i != var5) {
                ((vp) this).field_i = var5;
                ((vp) this).field_n = var6;
                if (((vp) this).field_h instanceof jka) {
                  ((jka) (Object) ((vp) this).field_h).a(param0, (vp) this, (byte) -49, param3);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((vp) this).field_n) {
                  ((vp) this).field_i = var5;
                  ((vp) this).field_n = var6;
                  if (!(((vp) this).field_h instanceof jka)) {
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    ((jka) (Object) ((vp) this).field_h).a(param0, (vp) this, (byte) -49, param3);
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (!((vp) this).field_C) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L0: {
                  if (((vp) this).field_y == ((vp) this).field_i) {
                    break L0;
                  } else {
                    L1: {
                      var5 = -((vp) this).field_i + ((vp) this).field_y;
                      stackOut_57_0 = this;
                      stackOut_57_1 = ((vp) this).field_i;
                      stackIn_61_0 = stackOut_57_0;
                      stackIn_61_1 = stackOut_57_1;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = var5 >> 164054337;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        break L1;
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = stackIn_58_1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        if (0 >= var5) {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = -1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          stackIn_62_2 = stackOut_60_2;
                          break L1;
                        } else {
                          stackOut_59_0 = this;
                          stackOut_59_1 = stackIn_59_1;
                          stackOut_59_2 = 1;
                          stackIn_62_0 = stackOut_59_0;
                          stackIn_62_1 = stackOut_59_1;
                          stackIn_62_2 = stackOut_59_2;
                          break L1;
                        }
                      }
                    }
                    ((vp) this).field_i = stackIn_62_1 + stackIn_62_2;
                    break L0;
                  }
                }
                if (((vp) this).field_E != ((vp) this).field_n) {
                  L2: {
                    L3: {
                      var5 = ((vp) this).field_E - ((vp) this).field_n;
                      stackOut_65_0 = this;
                      stackOut_65_1 = ((vp) this).field_n;
                      stackIn_69_0 = stackOut_65_0;
                      stackIn_69_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if (-3 > Math.abs(var5)) {
                        stackOut_69_0 = this;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = var5 >> -459791199;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        break L3;
                      } else {
                        stackOut_66_0 = this;
                        stackOut_66_1 = stackIn_66_1;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        if (-1 < var5) {
                          stackOut_68_0 = this;
                          stackOut_68_1 = stackIn_68_1;
                          stackOut_68_2 = 1;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          stackIn_70_2 = stackOut_68_2;
                          break L3;
                        } else {
                          ((vp) this).field_n = stackIn_67_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((vp) this).field_n = stackIn_70_1 + stackIn_70_2;
                    break L2;
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
            if (!((vp) this).field_C) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L4: {
                if (((vp) this).field_y == ((vp) this).field_i) {
                  break L4;
                } else {
                  L5: {
                    var5 = -((vp) this).field_i + ((vp) this).field_y;
                    stackOut_37_0 = this;
                    stackOut_37_1 = ((vp) this).field_i;
                    stackIn_41_0 = stackOut_37_0;
                    stackIn_41_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = var5 >> 164054337;
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
                      if (0 >= var5) {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = -1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L5;
                      } else {
                        stackOut_39_0 = this;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        break L5;
                      }
                    }
                  }
                  ((vp) this).field_i = stackIn_42_1 + stackIn_42_2;
                  break L4;
                }
              }
              if (((vp) this).field_E == ((vp) this).field_n) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L6: {
                  L7: {
                    var5 = ((vp) this).field_E - ((vp) this).field_n;
                    stackOut_44_0 = this;
                    stackOut_44_1 = ((vp) this).field_n;
                    stackIn_48_0 = stackOut_44_0;
                    stackIn_48_1 = stackOut_44_1;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_48_0 = this;
                      stackOut_48_1 = stackIn_48_1;
                      stackOut_48_2 = var5 >> -459791199;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      stackIn_49_2 = stackOut_48_2;
                      break L7;
                    } else {
                      stackOut_45_0 = this;
                      stackOut_45_1 = stackIn_45_1;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      if (-1 < var5) {
                        stackOut_47_0 = this;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        break L7;
                      } else {
                        ((vp) this).field_n = stackIn_46_1 + -1;
                        break L6;
                      }
                    }
                  }
                  ((vp) this).field_n = stackIn_49_1 + stackIn_49_2;
                  break L6;
                }
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        } else {
          if (-2 == (((vp) this).field_s ^ -1)) {
            var5 = -param0 + jba.field_j + -((vp) this).field_A;
            var6 = -((vp) this).field_D + (sta.field_B + -param3);
            if (((vp) this).field_i != var5) {
              ((vp) this).field_i = var5;
              ((vp) this).field_n = var6;
              if (((vp) this).field_h instanceof jka) {
                ((jka) (Object) ((vp) this).field_h).a(param0, (vp) this, (byte) -49, param3);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (var6 != ((vp) this).field_n) {
                ((vp) this).field_i = var5;
                ((vp) this).field_n = var6;
                if (!(((vp) this).field_h instanceof jka)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((jka) (Object) ((vp) this).field_h).a(param0, (vp) this, (byte) -49, param3);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (!((vp) this).field_C) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L8: {
                if (((vp) this).field_y == ((vp) this).field_i) {
                  break L8;
                } else {
                  L9: {
                    var5 = -((vp) this).field_i + ((vp) this).field_y;
                    stackOut_4_0 = this;
                    stackOut_4_1 = ((vp) this).field_i;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_8_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = var5 >> 164054337;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L9;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (0 >= var5) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = -1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L9;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        break L9;
                      }
                    }
                  }
                  ((vp) this).field_i = stackIn_9_1 + stackIn_9_2;
                  break L8;
                }
              }
              if (((vp) this).field_E != ((vp) this).field_n) {
                L10: {
                  L11: {
                    var5 = ((vp) this).field_E - ((vp) this).field_n;
                    stackOut_12_0 = this;
                    stackOut_12_1 = ((vp) this).field_n;
                    stackIn_16_0 = stackOut_12_0;
                    stackIn_16_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (-3 > Math.abs(var5)) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = var5 >> -459791199;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      break L11;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (-1 < var5) {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L11;
                      } else {
                        ((vp) this).field_n = stackIn_14_1 + -1;
                        break L10;
                      }
                    }
                  }
                  ((vp) this).field_n = stackIn_17_1 + stackIn_17_2;
                  break L10;
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

    public static void e(int param0) {
        field_B = null;
        if (param0 != 63) {
            field_B = null;
        }
    }

    final static void a(int param0, br param1) {
        param1.field_l = new int[]{param0};
        param1.field_o = new char[]{(char)63};
    }

    vp(int param0, int param1, int param2, int param3, isa param4, qc param5, ae param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((vp) this).field_y = 2147483647;
        ((vp) this).field_E = 2147483647;
        ((vp) this).field_x = param6;
        ((vp) this).field_z = param8 ? true : false;
        ((vp) this).field_C = param7 ? true : false;
    }

    final void c(int param0) {
        Object var3 = null;
        super.c(95);
        if (param0 < 91) {
          var3 = null;
          boolean discarded$1 = ((vp) this).a(-99, 92, -20, -84, 98, (ae) null, 112);
          ((vp) this).field_x.a((byte) -31, ((vp) this).field_m, ((vp) this).field_p, 0, 0);
          ((vp) this).field_E = ((vp) this).field_n;
          ((vp) this).field_y = ((vp) this).field_i;
          return;
        } else {
          ((vp) this).field_x.a((byte) -31, ((vp) this).field_m, ((vp) this).field_p, 0, 0);
          ((vp) this).field_E = ((vp) this).field_n;
          ((vp) this).field_y = ((vp) this).field_i;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          if ((1 & param0) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if ((param0 & 2) == 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if ((4 & param0) == 0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          if ((8 & param0) == 0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var5 = stackIn_12_0;
          if (-1 == (16 & param0 ^ -1)) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_15_0;
          if ((param0 & 32) == 0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_18_0;
          if (0 == (64 & param0)) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L6;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L6;
          }
        }
        var8 = stackIn_21_0;
        if (var2 != 0) {
          if (var3 != 0) {
            if (var4 != 0) {
              if (var5 != 0) {
                var16 = var7;
                var11 = 0;
                var10 = 0;
                var15 = var6;
                var9 = 0;
                var14 = 0;
                var13 = 0;
                var17 = 0;
                var12 = 0;
                if (param1 != -6487) {
                  return 12;
                } else {
                  L7: {
                    var18 = 0;
                    if (var11 == 0) {
                      break L7;
                    } else {
                      var18 = var18 | 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (var12 == 0) {
                      break L8;
                    } else {
                      var18 = var18 | 2;
                      break L8;
                    }
                  }
                  L9: {
                    if (var9 == 0) {
                      break L9;
                    } else {
                      var18 = var18 | 4;
                      break L9;
                    }
                  }
                  L10: {
                    if (var10 == 0) {
                      break L10;
                    } else {
                      var18 = var18 | 8;
                      break L10;
                    }
                  }
                  L11: {
                    if (var13 == 0) {
                      break L11;
                    } else {
                      var18 = var18 | 16;
                      break L11;
                    }
                  }
                  L12: {
                    if (var14 != 0) {
                      var18 = var18 | 32;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var15 == 0) {
                      break L13;
                    } else {
                      var18 = var18 | 128;
                      break L13;
                    }
                  }
                  L14: {
                    if (var16 != 0) {
                      var18 = var18 | 256;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var17 == 0) {
                      break L15;
                    } else {
                      var18 = var18 | 64;
                      break L15;
                    }
                  }
                  return var18;
                }
              } else {
                var14 = var7;
                var10 = var5;
                var9 = var4;
                var12 = var3;
                var17 = var8;
                var13 = var6;
                var16 = 0;
                var15 = 0;
                var11 = var2;
                if (param1 != -6487) {
                  return 12;
                } else {
                  L16: {
                    var18 = 0;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      var18 = var18 | 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (var12 == 0) {
                      break L17;
                    } else {
                      var18 = var18 | 2;
                      break L17;
                    }
                  }
                  L18: {
                    if (var9 == 0) {
                      break L18;
                    } else {
                      var18 = var18 | 4;
                      break L18;
                    }
                  }
                  L19: {
                    if (var10 == 0) {
                      break L19;
                    } else {
                      var18 = var18 | 8;
                      break L19;
                    }
                  }
                  L20: {
                    if (var13 == 0) {
                      break L20;
                    } else {
                      var18 = var18 | 16;
                      break L20;
                    }
                  }
                  L21: {
                    if (var14 != 0) {
                      var18 = var18 | 32;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var15 == 0) {
                      break L22;
                    } else {
                      var18 = var18 | 128;
                      break L22;
                    }
                  }
                  L23: {
                    if (var16 != 0) {
                      var18 = var18 | 256;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var17 == 0) {
                      break L24;
                    } else {
                      var18 = var18 | 64;
                      break L24;
                    }
                  }
                  return var18;
                }
              }
            } else {
              var14 = var7;
              var10 = var5;
              var9 = var4;
              var12 = var3;
              var17 = var8;
              var13 = var6;
              var16 = 0;
              var15 = 0;
              var11 = var2;
              if (param1 != -6487) {
                return 12;
              } else {
                L25: {
                  var18 = 0;
                  if (var11 == 0) {
                    break L25;
                  } else {
                    var18 = var18 | 1;
                    break L25;
                  }
                }
                L26: {
                  if (var12 == 0) {
                    break L26;
                  } else {
                    var18 = var18 | 2;
                    break L26;
                  }
                }
                L27: {
                  if (var9 == 0) {
                    break L27;
                  } else {
                    var18 = var18 | 4;
                    break L27;
                  }
                }
                L28: {
                  if (var10 == 0) {
                    break L28;
                  } else {
                    var18 = var18 | 8;
                    break L28;
                  }
                }
                L29: {
                  if (var13 == 0) {
                    break L29;
                  } else {
                    var18 = var18 | 16;
                    break L29;
                  }
                }
                L30: {
                  if (var14 != 0) {
                    var18 = var18 | 32;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var15 == 0) {
                    break L31;
                  } else {
                    var18 = var18 | 128;
                    break L31;
                  }
                }
                L32: {
                  if (var16 != 0) {
                    var18 = var18 | 256;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var17 == 0) {
                    break L33;
                  } else {
                    var18 = var18 | 64;
                    break L33;
                  }
                }
                return var18;
              }
            }
          } else {
            var14 = var7;
            var10 = var5;
            var9 = var4;
            var12 = var3;
            var17 = var8;
            var13 = var6;
            var16 = 0;
            var15 = 0;
            var11 = var2;
            if (param1 != -6487) {
              return 12;
            } else {
              L34: {
                var18 = 0;
                if (var11 == 0) {
                  break L34;
                } else {
                  var18 = var18 | 1;
                  break L34;
                }
              }
              L35: {
                if (var12 == 0) {
                  break L35;
                } else {
                  var18 = var18 | 2;
                  break L35;
                }
              }
              L36: {
                if (var9 == 0) {
                  break L36;
                } else {
                  var18 = var18 | 4;
                  break L36;
                }
              }
              L37: {
                if (var10 == 0) {
                  break L37;
                } else {
                  var18 = var18 | 8;
                  break L37;
                }
              }
              L38: {
                if (var13 == 0) {
                  break L38;
                } else {
                  var18 = var18 | 16;
                  break L38;
                }
              }
              L39: {
                if (var14 != 0) {
                  var18 = var18 | 32;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (var15 == 0) {
                  break L40;
                } else {
                  var18 = var18 | 128;
                  break L40;
                }
              }
              L41: {
                if (var16 != 0) {
                  var18 = var18 | 256;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (var17 == 0) {
                  break L42;
                } else {
                  var18 = var18 | 64;
                  break L42;
                }
              }
              return var18;
            }
          }
        } else {
          var14 = var7;
          var10 = var5;
          var9 = var4;
          var12 = var3;
          var17 = var8;
          var13 = var6;
          var16 = 0;
          var15 = 0;
          var11 = var2;
          if (param1 != -6487) {
            return 12;
          } else {
            L43: {
              var18 = 0;
              if (var11 == 0) {
                break L43;
              } else {
                var18 = var18 | 1;
                break L43;
              }
            }
            L44: {
              if (var12 == 0) {
                break L44;
              } else {
                var18 = var18 | 2;
                break L44;
              }
            }
            L45: {
              if (var9 == 0) {
                break L45;
              } else {
                var18 = var18 | 4;
                break L45;
              }
            }
            L46: {
              if (var10 == 0) {
                break L46;
              } else {
                var18 = var18 | 8;
                break L46;
              }
            }
            L47: {
              if (var13 == 0) {
                break L47;
              } else {
                var18 = var18 | 16;
                break L47;
              }
            }
            L48: {
              if (var14 != 0) {
                var18 = var18 | 32;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (var15 == 0) {
                break L49;
              } else {
                var18 = var18 | 128;
                break L49;
              }
            }
            L50: {
              if (var16 != 0) {
                var18 = var18 | 256;
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              if (var17 == 0) {
                break L51;
              } else {
                var18 = var18 | 64;
                break L51;
              }
            }
            return var18;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Dartgun";
    }
}
