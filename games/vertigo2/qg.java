/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends oh {
    private boolean field_M;
    private boolean field_N;
    private int field_H;
    private int field_J;
    static int field_I;
    private int field_K;
    static int field_G;
    private int field_L;

    final void a(byte param0) {
        super.a((byte) 119);
        ((qg) this).field_C.a(false, 0, 0, ((qg) this).field_s, ((qg) this).field_n);
        if (param0 <= 93) {
          return;
        } else {
          ((qg) this).field_K = ((qg) this).field_t;
          ((qg) this).field_L = ((qg) this).field_o;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gg discarded$10 = pf.a((byte) -88, on.field_b[param2][param3], param1);
        if (param0 != 1) {
            qg.a(105, 55, -99, true, (String) null, 34L);
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, (byte) -120, param6) ? 1 : 0;
        if (param5 <= -107) {
          L0: {
            if (var8 == 0) {
              break L0;
            } else {
              if (!((qg) this).field_M) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (((qg) this).a(0, param2, param1, param0, param6)) {
            ((qg) this).field_A = param4;
            if ((param4 ^ -1) == -2) {
              um.field_E = (qg) this;
              ((qg) this).field_J = -param2 + -((qg) this).field_t + param6;
              ((qg) this).field_H = -param1 + (param0 - ((qg) this).field_o);
              return true;
            } else {
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          ((qg) this).field_H = -3;
          if (var8 != 0) {
            if (!((qg) this).field_M) {
              if (((qg) this).a(0, param2, param1, param0, param6)) {
                ((qg) this).field_A = param4;
                if ((param4 ^ -1) == -2) {
                  um.field_E = (qg) this;
                  ((qg) this).field_J = -param2 + -((qg) this).field_t + param6;
                  ((qg) this).field_H = -param1 + (param0 - ((qg) this).field_o);
                  return true;
                } else {
                  return true;
                }
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((qg) this).a(0, param2, param1, param0, param6)) {
              ((qg) this).field_A = param4;
              if ((param4 ^ -1) == -2) {
                um.field_E = (qg) this;
                ((qg) this).field_J = -param2 + -((qg) this).field_t + param6;
                ((qg) this).field_H = -param1 + (param0 - ((qg) this).field_o);
                return true;
              } else {
                return true;
              }
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (((qg) this).a(param3, -1, param1, param0)) {
          ((qg) this).a(param0, param3, true, param1);
          ((qg) this).a(1000, param0, param1, param3);
          StringBuilder discarded$35 = param3.append(" revert=").append(((qg) this).field_N);
          if (-2147483648 != (((qg) this).field_L ^ -1)) {
            if ((((qg) this).field_K ^ -1) != -2147483648) {
              StringBuilder discarded$36 = param3.append(" to ").append(((qg) this).field_L).append(44).append(((qg) this).field_K);
              if (param2 != -79) {
                ((qg) this).field_J = -46;
                return param3;
              } else {
                return param3;
              }
            } else {
              L0: {
                if (param2 == -79) {
                  break L0;
                } else {
                  ((qg) this).field_J = -46;
                  break L0;
                }
              }
              return param3;
            }
          } else {
            if (param2 != -79) {
              ((qg) this).field_J = -46;
              return param3;
            } else {
              return param3;
            }
          }
        } else {
          if (param2 != -79) {
            ((qg) this).field_J = -46;
            return param3;
          } else {
            return param3;
          }
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        if (param0 > 6) {
          if (((qg) this).field_C instanceof d) {
            if (((d) (Object) ((qg) this).field_C).field_F) {
              if (-2 == (((qg) this).field_A ^ -1)) {
                var5 = -((qg) this).field_H + (ed.field_n + -param1);
                var6 = -((qg) this).field_J + (gb.field_d - param2);
                if (var5 != ((qg) this).field_o) {
                  ((qg) this).field_o = var5;
                  ((qg) this).field_t = var6;
                  if (((qg) this).field_v instanceof ai) {
                    ((ai) (Object) ((qg) this).field_v).a(-17589, param1, (qg) this, param2);
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  } else {
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  }
                } else {
                  if (var6 != ((qg) this).field_t) {
                    ((qg) this).field_o = var5;
                    ((qg) this).field_t = var6;
                    if (!(((qg) this).field_v instanceof ai)) {
                      super.a((byte) 64, param1, param2, param3);
                      return;
                    } else {
                      ((ai) (Object) ((qg) this).field_v).a(-17589, param1, (qg) this, param2);
                      super.a((byte) 64, param1, param2, param3);
                      return;
                    }
                  } else {
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  }
                }
              } else {
                if (((qg) this).field_N) {
                  L0: {
                    if (((qg) this).field_L == ((qg) this).field_o) {
                      break L0;
                    } else {
                      L1: {
                        var5 = ((qg) this).field_L + -((qg) this).field_o;
                        stackOut_60_0 = this;
                        stackOut_60_1 = ((qg) this).field_o;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if (-3 <= (Math.abs(var5) ^ -1)) {
                          stackOut_62_0 = this;
                          stackOut_62_1 = stackIn_62_1;
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_64_1 = stackOut_62_1;
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          if (0 >= var5) {
                            stackOut_64_0 = this;
                            stackOut_64_1 = stackIn_64_1;
                            stackOut_64_2 = -1;
                            stackIn_65_0 = stackOut_64_0;
                            stackIn_65_1 = stackOut_64_1;
                            stackIn_65_2 = stackOut_64_2;
                            break L1;
                          } else {
                            stackOut_63_0 = this;
                            stackOut_63_1 = stackIn_63_1;
                            stackOut_63_2 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            stackIn_65_2 = stackOut_63_2;
                            break L1;
                          }
                        } else {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = var5 >> 1924953025;
                          stackIn_65_0 = stackOut_61_0;
                          stackIn_65_1 = stackOut_61_1;
                          stackIn_65_2 = stackOut_61_2;
                          break L1;
                        }
                      }
                      ((qg) this).field_o = stackIn_65_1 + stackIn_65_2;
                      break L0;
                    }
                  }
                  if (((qg) this).field_t != ((qg) this).field_K) {
                    L2: {
                      var5 = -((qg) this).field_t + ((qg) this).field_K;
                      stackOut_68_0 = this;
                      stackOut_68_1 = ((qg) this).field_t;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      if (Math.abs(var5) >= -3) {
                        L3: {
                          stackOut_70_0 = this;
                          stackOut_70_1 = stackIn_70_1;
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_72_1 = stackOut_70_1;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (-1 < var5) {
                            stackOut_72_0 = this;
                            stackOut_72_1 = stackIn_72_1;
                            stackOut_72_2 = 1;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            stackIn_73_2 = stackOut_72_2;
                            break L3;
                          } else {
                            stackOut_71_0 = this;
                            stackOut_71_1 = stackIn_71_1;
                            stackOut_71_2 = -1;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            stackIn_73_2 = stackOut_71_2;
                            break L3;
                          }
                        }
                        ((qg) this).field_t = stackIn_73_1 + stackIn_73_2;
                        break L2;
                      } else {
                        ((qg) this).field_t = stackIn_69_1 + (var5 >> -33855231);
                        break L2;
                      }
                    }
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  } else {
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((qg) this).field_N) {
                L4: {
                  if (((qg) this).field_L == ((qg) this).field_o) {
                    break L4;
                  } else {
                    L5: {
                      var5 = ((qg) this).field_L + -((qg) this).field_o;
                      stackOut_40_0 = this;
                      stackOut_40_1 = ((qg) this).field_o;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_42_0 = this;
                        stackOut_42_1 = stackIn_42_1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (0 >= var5) {
                          stackOut_44_0 = this;
                          stackOut_44_1 = stackIn_44_1;
                          stackOut_44_2 = -1;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          stackIn_45_2 = stackOut_44_2;
                          break L5;
                        } else {
                          stackOut_43_0 = this;
                          stackOut_43_1 = stackIn_43_1;
                          stackOut_43_2 = 1;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_45_2 = stackOut_43_2;
                          break L5;
                        }
                      } else {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = var5 >> 1924953025;
                        stackIn_45_0 = stackOut_41_0;
                        stackIn_45_1 = stackOut_41_1;
                        stackIn_45_2 = stackOut_41_2;
                        break L5;
                      }
                    }
                    ((qg) this).field_o = stackIn_45_1 + stackIn_45_2;
                    break L4;
                  }
                }
                if (((qg) this).field_t == ((qg) this).field_K) {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                } else {
                  L6: {
                    var5 = -((qg) this).field_t + ((qg) this).field_K;
                    stackOut_47_0 = this;
                    stackOut_47_1 = ((qg) this).field_t;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_49_1 = stackOut_47_1;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    if (Math.abs(var5) >= -3) {
                      L7: {
                        stackOut_49_0 = this;
                        stackOut_49_1 = stackIn_49_1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        if (-1 < var5) {
                          stackOut_51_0 = this;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = 1;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          stackIn_52_2 = stackOut_51_2;
                          break L7;
                        } else {
                          stackOut_50_0 = this;
                          stackOut_50_1 = stackIn_50_1;
                          stackOut_50_2 = -1;
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          stackIn_52_2 = stackOut_50_2;
                          break L7;
                        }
                      }
                      ((qg) this).field_t = stackIn_52_1 + stackIn_52_2;
                      break L6;
                    } else {
                      ((qg) this).field_t = stackIn_48_1 + (var5 >> -33855231);
                      break L6;
                    }
                  }
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              } else {
                super.a((byte) 64, param1, param2, param3);
                return;
              }
            }
          } else {
            if (-2 == (((qg) this).field_A ^ -1)) {
              var5 = -((qg) this).field_H + (ed.field_n + -param1);
              var6 = -((qg) this).field_J + (gb.field_d - param2);
              if (var5 != ((qg) this).field_o) {
                ((qg) this).field_o = var5;
                ((qg) this).field_t = var6;
                if (((qg) this).field_v instanceof ai) {
                  ((ai) (Object) ((qg) this).field_v).a(-17589, param1, (qg) this, param2);
                  super.a((byte) 64, param1, param2, param3);
                  return;
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              } else {
                if (var6 != ((qg) this).field_t) {
                  ((qg) this).field_o = var5;
                  ((qg) this).field_t = var6;
                  if (!(((qg) this).field_v instanceof ai)) {
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  } else {
                    ((ai) (Object) ((qg) this).field_v).a(-17589, param1, (qg) this, param2);
                    super.a((byte) 64, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((qg) this).field_N) {
                L8: {
                  if (((qg) this).field_L == ((qg) this).field_o) {
                    break L8;
                  } else {
                    L9: {
                      var5 = ((qg) this).field_L + -((qg) this).field_o;
                      stackOut_7_0 = this;
                      stackOut_7_1 = ((qg) this).field_o;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (0 >= var5) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = -1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          break L9;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L9;
                        }
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = var5 >> 1924953025;
                        stackIn_12_0 = stackOut_8_0;
                        stackIn_12_1 = stackOut_8_1;
                        stackIn_12_2 = stackOut_8_2;
                        break L9;
                      }
                    }
                    ((qg) this).field_o = stackIn_12_1 + stackIn_12_2;
                    break L8;
                  }
                }
                if (((qg) this).field_t != ((qg) this).field_K) {
                  L10: {
                    var5 = -((qg) this).field_t + ((qg) this).field_K;
                    stackOut_15_0 = this;
                    stackOut_15_1 = ((qg) this).field_t;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (Math.abs(var5) >= -3) {
                      L11: {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (-1 < var5) {
                          stackOut_19_0 = this;
                          stackOut_19_1 = stackIn_19_1;
                          stackOut_19_2 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          stackIn_20_2 = stackOut_19_2;
                          break L11;
                        } else {
                          stackOut_18_0 = this;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = -1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          break L11;
                        }
                      }
                      ((qg) this).field_t = stackIn_20_1 + stackIn_20_2;
                      break L10;
                    } else {
                      ((qg) this).field_t = stackIn_16_1 + (var5 >> -33855231);
                      break L10;
                    }
                  }
                  super.a((byte) 64, param1, param2, param3);
                  return;
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              } else {
                super.a((byte) 64, param1, param2, param3);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((qg) this).field_A = 0;
    }

    final static long b(boolean param0) {
        if (param0) {
            return 5L;
        }
        return gk.a(57) - gn.field_b;
    }

    final static void a(int param0, int param1, int param2, boolean param3, String param4, long param5) {
        int var7 = 0;
        mi stackIn_2_0 = null;
        mi stackIn_3_0 = null;
        mi stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        mi stackIn_6_0 = null;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mi stackOut_5_0 = null;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        mi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mi stackOut_1_0 = null;
        mi stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        mi stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        uh.field_Wb.j(param0, 127);
        uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
        var7 = uh.field_Wb.field_u;
        if (param2 != 0) {
          L0: {
            qg.a(-61, -1, -60, -41);
            uh.field_Wb.a((byte) -119, param5);
            uh.field_Wb.a((byte) 0, param4);
            uh.field_Wb.f(param1, -75);
            stackOut_5_0 = uh.field_Wb;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param3) {
              stackOut_7_0 = (mi) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (mi) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((mi) (Object) stackIn_8_0).f(stackIn_8_1, 112);
          uh.field_Wb.b((byte) -125, uh.field_Wb.field_u + -var7);
          return;
        } else {
          L1: {
            uh.field_Wb.a((byte) -119, param5);
            uh.field_Wb.a((byte) 0, param4);
            uh.field_Wb.f(param1, -75);
            stackOut_1_0 = uh.field_Wb;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param3) {
              stackOut_3_0 = (mi) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (mi) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((mi) (Object) stackIn_4_0).f(stackIn_4_1, 112);
          uh.field_Wb.b((byte) -125, uh.field_Wb.field_u + -var7);
          return;
        }
    }

    private qg(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((qg) this).field_K = 2147483647;
        ((qg) this).field_L = 2147483647;
        ((qg) this).field_N = param7 ? true : false;
        ((qg) this).field_C = param6;
        ((qg) this).field_M = param8 ? true : false;
    }

    static {
    }
}
