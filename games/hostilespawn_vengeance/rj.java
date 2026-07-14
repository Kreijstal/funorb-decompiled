/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends fc {
    private int field_D;
    static bd field_N;
    static int[] field_M;
    private int field_I;
    static vl field_G;
    static ln[] field_J;
    private int field_L;
    private boolean field_B;
    private boolean field_E;
    static boolean field_K;
    private int field_F;
    static int field_H;

    final static void a(p param0, int param1) {
        if (param1 != -2312) {
          return;
        } else {
          L0: {
            param0.field_e = param0.field_e + 1;
            if (param0.field_e < 8) {
              break L0;
            } else {
              param0.field_i = -1;
              break L0;
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((rj) this).b(param3, param0, param4 ^ 145, param2, param1)) {
            if (param6 == 1) {
              ((rj) this).field_L = -((rj) this).field_v + param0 - param1;
              rh.field_D = (rj) this;
              ((rj) this).field_I = -param2 + (param3 + -((rj) this).field_m);
              ((rj) this).field_r = param6;
              return true;
            } else {
              ((rj) this).field_r = param6;
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((rj) this).field_B) {
            if (((rj) this).b(param3, param0, param4 ^ 145, param2, param1)) {
              if (param6 != 1) {
                ((rj) this).field_r = param6;
                return true;
              } else {
                ((rj) this).field_L = -((rj) this).field_v + param0 - param1;
                rh.field_D = (rj) this;
                ((rj) this).field_I = -param2 + (param3 + -((rj) this).field_m);
                ((rj) this).field_r = param6;
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

    private rj(int param0, int param1, int param2, int param3, nn param4, mh param5, ag param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((rj) this).field_D = 2147483647;
        ((rj) this).field_F = 2147483647;
        ((rj) this).field_E = param7 ? true : false;
        ((rj) this).field_B = param8 ? true : false;
        ((rj) this).field_A = param6;
    }

    final void a(ag param0, int param1, int param2, int param3) {
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
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
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
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        if (((rj) this).field_A instanceof ph) {
          if (((ph) (Object) ((rj) this).field_A).field_D) {
            if (((rj) this).field_r == 1) {
              L0: {
                var5 = -param3 + (-((rj) this).field_L + j.field_c);
                var6 = -((rj) this).field_I + (rb.field_m - param1);
                if (var5 != ((rj) this).field_v) {
                  break L0;
                } else {
                  if (((rj) this).field_m != var6) {
                    break L0;
                  } else {
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                }
              }
              ((rj) this).field_m = var6;
              ((rj) this).field_v = var5;
              if (((rj) this).field_p instanceof jl) {
                ((jl) (Object) ((rj) this).field_p).a((rj) this, param1, param3, (byte) 98);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (((rj) this).field_E) {
                L1: {
                  if (((rj) this).field_v == ((rj) this).field_D) {
                    break L1;
                  } else {
                    L2: {
                      var5 = -((rj) this).field_v + ((rj) this).field_D;
                      stackOut_57_0 = this;
                      stackOut_57_1 = ((rj) this).field_v;
                      stackIn_61_0 = stackOut_57_0;
                      stackIn_61_1 = stackOut_57_1;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      if ((Math.abs(var5) ^ -1) < -3) {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = var5 >> 1581977089;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        break L2;
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = stackIn_58_1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = -1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          stackIn_62_2 = stackOut_60_2;
                          break L2;
                        } else {
                          stackOut_59_0 = this;
                          stackOut_59_1 = stackIn_59_1;
                          stackOut_59_2 = 1;
                          stackIn_62_0 = stackOut_59_0;
                          stackIn_62_1 = stackOut_59_1;
                          stackIn_62_2 = stackOut_59_2;
                          break L2;
                        }
                      }
                    }
                    ((rj) this).field_v = stackIn_62_1 + stackIn_62_2;
                    break L1;
                  }
                }
                if (((rj) this).field_F != ((rj) this).field_m) {
                  L3: {
                    var5 = -((rj) this).field_m + ((rj) this).field_F;
                    stackOut_65_0 = this;
                    stackOut_65_1 = ((rj) this).field_m;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (Math.abs(var5) >= -3) {
                      L4: {
                        stackOut_67_0 = this;
                        stackOut_67_1 = stackIn_67_1;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        if (-1 < var5) {
                          stackOut_69_0 = this;
                          stackOut_69_1 = stackIn_69_1;
                          stackOut_69_2 = 1;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          stackIn_70_2 = stackOut_69_2;
                          break L4;
                        } else {
                          stackOut_68_0 = this;
                          stackOut_68_1 = stackIn_68_1;
                          stackOut_68_2 = -1;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          stackIn_70_2 = stackOut_68_2;
                          break L4;
                        }
                      }
                      ((rj) this).field_m = stackIn_70_1 + stackIn_70_2;
                      break L3;
                    } else {
                      ((rj) this).field_m = stackIn_66_1 + (var5 >> 878198145);
                      break L3;
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
            if (((rj) this).field_E) {
              L5: {
                if (((rj) this).field_v == ((rj) this).field_D) {
                  break L5;
                } else {
                  L6: {
                    var5 = -((rj) this).field_v + ((rj) this).field_D;
                    stackOut_37_0 = this;
                    stackOut_37_1 = ((rj) this).field_v;
                    stackIn_41_0 = stackOut_37_0;
                    stackIn_41_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = var5 >> 1581977089;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      break L6;
                    } else {
                      stackOut_38_0 = this;
                      stackOut_38_1 = stackIn_38_1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = -1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L6;
                      } else {
                        stackOut_39_0 = this;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        break L6;
                      }
                    }
                  }
                  ((rj) this).field_v = stackIn_42_1 + stackIn_42_2;
                  break L5;
                }
              }
              if (((rj) this).field_F != ((rj) this).field_m) {
                L7: {
                  var5 = -((rj) this).field_m + ((rj) this).field_F;
                  stackOut_45_0 = this;
                  stackOut_45_1 = ((rj) this).field_m;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  if (Math.abs(var5) >= -3) {
                    L8: {
                      stackOut_47_0 = this;
                      stackOut_47_1 = stackIn_47_1;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (-1 < var5) {
                        stackOut_49_0 = this;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L8;
                      } else {
                        stackOut_48_0 = this;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = -1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L8;
                      }
                    }
                    ((rj) this).field_m = stackIn_50_1 + stackIn_50_2;
                    break L7;
                  } else {
                    ((rj) this).field_m = stackIn_46_1 + (var5 >> 878198145);
                    break L7;
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
          if (((rj) this).field_r == 1) {
            var5 = -param3 + (-((rj) this).field_L + j.field_c);
            var6 = -((rj) this).field_I + (rb.field_m - param1);
            if (var5 == ((rj) this).field_v) {
              if (((rj) this).field_m == var6) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                ((rj) this).field_m = var6;
                ((rj) this).field_v = var5;
                if (!(((rj) this).field_p instanceof jl)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((jl) (Object) ((rj) this).field_p).a((rj) this, param1, param3, (byte) 98);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              ((rj) this).field_m = var6;
              ((rj) this).field_v = var5;
              if (!(((rj) this).field_p instanceof jl)) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                ((jl) (Object) ((rj) this).field_p).a((rj) this, param1, param3, (byte) 98);
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((rj) this).field_E) {
              L9: {
                if (((rj) this).field_v == ((rj) this).field_D) {
                  break L9;
                } else {
                  L10: {
                    var5 = -((rj) this).field_v + ((rj) this).field_D;
                    stackOut_5_0 = this;
                    stackOut_5_1 = ((rj) this).field_v;
                    stackIn_9_0 = stackOut_5_0;
                    stackIn_9_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_9_0 = this;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = var5 >> 1581977089;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L10;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = stackIn_6_1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = -1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L10;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 1;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        break L10;
                      }
                    }
                  }
                  ((rj) this).field_v = stackIn_10_1 + stackIn_10_2;
                  break L9;
                }
              }
              if (((rj) this).field_F != ((rj) this).field_m) {
                L11: {
                  var5 = -((rj) this).field_m + ((rj) this).field_F;
                  stackOut_13_0 = this;
                  stackOut_13_1 = ((rj) this).field_m;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (Math.abs(var5) >= -3) {
                    L12: {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (-1 < var5) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L12;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L12;
                      }
                    }
                    ((rj) this).field_m = stackIn_18_1 + stackIn_18_2;
                    break L11;
                  } else {
                    ((rj) this).field_m = stackIn_14_1 + (var5 >> 878198145);
                    break L11;
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

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (param0 >= 73) {
          if (((rj) this).a(param3, param2, false, param1)) {
            ((rj) this).a(param2, param1, param3, 76);
            ((rj) this).a(-85, param2, param1, param3);
            StringBuilder discarded$4 = param3.append(" revert=").append(((rj) this).field_E);
            if (((rj) this).field_D != -2147483648) {
              if (-2147483648 != ((rj) this).field_F) {
                StringBuilder discarded$5 = param3.append(" to ").append(((rj) this).field_D).append(44).append(((rj) this).field_F);
                return param3;
              } else {
                return param3;
              }
            } else {
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          ((rj) this).field_L = 46;
          if (((rj) this).a(param3, param2, false, param1)) {
            ((rj) this).a(param2, param1, param3, 76);
            ((rj) this).a(-85, param2, param1, param3);
            StringBuilder discarded$6 = param3.append(" revert=").append(((rj) this).field_E);
            if (((rj) this).field_D == -2147483648) {
              return param3;
            } else {
              L0: {
                if (-2147483648 == ((rj) this).field_F) {
                  break L0;
                } else {
                  StringBuilder discarded$7 = param3.append(" to ").append(((rj) this).field_D).append(44).append(((rj) this).field_F);
                  break L0;
                }
              }
              return param3;
            }
          } else {
            return param3;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 > -96) {
          field_J = null;
          field_N = null;
          field_G = null;
          field_M = null;
          field_J = null;
          return;
        } else {
          field_N = null;
          field_G = null;
          field_M = null;
          field_J = null;
          return;
        }
    }

    final void j(int param0) {
        super.j(param0);
        ((rj) this).field_A.a(((rj) this).field_s, 0, 0, 0, ((rj) this).field_x);
        ((rj) this).field_D = ((rj) this).field_v;
        ((rj) this).field_F = ((rj) this).field_m;
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        super.a(param0, param1, param2, param3, param4, 0);
        ((rj) this).field_r = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[4];
        field_G = new vl();
    }
}
