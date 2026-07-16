/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ce extends ec {
    private int field_J;
    static volatile boolean field_K;
    static int field_E;
    private boolean field_F;
    private int field_B;
    private boolean field_G;
    static int field_I;
    private int field_M;
    static String field_H;
    private int field_L;

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (!param2) {
          var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((ce) this).field_G) {
              if (!((ce) this).a(param5, param6, param4, (byte) 94, param3)) {
                return var8 != 0;
              } else {
                L0: {
                  ((ce) this).field_i = param1;
                  if ((param1 ^ -1) == -2) {
                    ra.field_b = (ce) this;
                    ((ce) this).field_B = -((ce) this).field_u + param4 - param5;
                    ((ce) this).field_L = -((ce) this).field_l + param6 + -param3;
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
            if (!((ce) this).a(param5, param6, param4, (byte) 94, param3)) {
              return var8 != 0;
            } else {
              L1: {
                ((ce) this).field_i = param1;
                if ((param1 ^ -1) == -2) {
                  ra.field_b = (ce) this;
                  ((ce) this).field_B = -((ce) this).field_u + param4 - param5;
                  ((ce) this).field_L = -((ce) this).field_l + param6 + -param3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return true;
            }
          }
        } else {
          ce.f(-45);
          var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((ce) this).field_G) {
              if (!((ce) this).a(param5, param6, param4, (byte) 94, param3)) {
                return var8 != 0;
              } else {
                L2: {
                  ((ce) this).field_i = param1;
                  if ((param1 ^ -1) == -2) {
                    ra.field_b = (ce) this;
                    ((ce) this).field_B = -((ce) this).field_u + param4 - param5;
                    ((ce) this).field_L = -((ce) this).field_l + param6 + -param3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (((ce) this).a(param5, param6, param4, (byte) 94, param3)) {
              ((ce) this).field_i = param1;
              if ((param1 ^ -1) != -2) {
                return true;
              } else {
                ra.field_b = (ce) this;
                ((ce) this).field_B = -((ce) this).field_u + param4 - param5;
                ((ce) this).field_L = -((ce) this).field_l + param6 + -param3;
                return true;
              }
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
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
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
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
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
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
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        if (!(((ce) this).field_x instanceof tg)) {
          if ((((ce) this).field_i ^ -1) == -2) {
            L0: {
              var5 = -param0 + (nl.field_u + -((ce) this).field_L);
              var6 = -param3 + hk.field_Jb - ((ce) this).field_B;
              if (var5 != ((ce) this).field_l) {
                ((ce) this).field_u = var6;
                ((ce) this).field_l = var5;
                if (((ce) this).field_o instanceof pf) {
                  ((pf) (Object) ((ce) this).field_o).a(param0, param3, (ce) this, 104);
                  break L0;
                } else {
                  if (param1 > 113) {
                    super.a(param0, 122, param2, param3);
                    return;
                  } else {
                    ((ce) this).e(33);
                    super.a(param0, 122, param2, param3);
                    return;
                  }
                }
              } else {
                if (var6 == ((ce) this).field_u) {
                  break L0;
                } else {
                  L1: {
                    ((ce) this).field_u = var6;
                    ((ce) this).field_l = var5;
                    if (((ce) this).field_o instanceof pf) {
                      ((pf) (Object) ((ce) this).field_o).a(param0, param3, (ce) this, 104);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param1 > 113) {
                    super.a(param0, 122, param2, param3);
                    return;
                  } else {
                    ((ce) this).e(33);
                    super.a(param0, 122, param2, param3);
                    return;
                  }
                }
              }
            }
            if (param1 > 113) {
              super.a(param0, 122, param2, param3);
              return;
            } else {
              ((ce) this).e(33);
              super.a(param0, 122, param2, param3);
              return;
            }
          } else {
            L2: {
              if (((ce) this).field_F) {
                L3: {
                  if (((ce) this).field_M != ((ce) this).field_l) {
                    L4: {
                      var5 = -((ce) this).field_l + ((ce) this).field_M;
                      stackOut_58_0 = this;
                      stackOut_58_1 = ((ce) this).field_l;
                      stackIn_62_0 = stackOut_58_0;
                      stackIn_62_1 = stackOut_58_1;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      if (Math.abs(var5) < -3) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = var5 >> -1416068863;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        break L4;
                      } else {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if (-1 >= var5) {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = -1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          stackIn_63_2 = stackOut_61_2;
                          break L4;
                        } else {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = 1;
                          stackIn_63_0 = stackOut_60_0;
                          stackIn_63_1 = stackOut_60_1;
                          stackIn_63_2 = stackOut_60_2;
                          break L4;
                        }
                      }
                    }
                    ((ce) this).field_l = stackIn_63_1 + stackIn_63_2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (((ce) this).field_J != ((ce) this).field_u) {
                  L5: {
                    var5 = ((ce) this).field_J + -((ce) this).field_u;
                    stackOut_66_0 = this;
                    stackOut_66_1 = ((ce) this).field_u;
                    stackIn_70_0 = stackOut_66_0;
                    stackIn_70_1 = stackOut_66_1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_70_0 = this;
                      stackOut_70_1 = stackIn_70_1;
                      stackOut_70_2 = var5 >> -350442879;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      stackIn_71_2 = stackOut_70_2;
                      break L5;
                    } else {
                      stackOut_67_0 = this;
                      stackOut_67_1 = stackIn_67_1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if (0 >= var5) {
                        stackOut_69_0 = this;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = -1;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackIn_71_2 = stackOut_69_2;
                        break L5;
                      } else {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = 1;
                        stackIn_71_0 = stackOut_68_0;
                        stackIn_71_1 = stackOut_68_1;
                        stackIn_71_2 = stackOut_68_2;
                        break L5;
                      }
                    }
                  }
                  ((ce) this).field_u = stackIn_71_1 + stackIn_71_2;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (param1 > 113) {
              super.a(param0, 122, param2, param3);
              return;
            } else {
              ((ce) this).e(33);
              super.a(param0, 122, param2, param3);
              return;
            }
          }
        } else {
          if (((tg) (Object) ((ce) this).field_x).field_C) {
            L6: {
              if ((((ce) this).field_i ^ -1) != -2) {
                if (((ce) this).field_F) {
                  L7: {
                    if (((ce) this).field_M != ((ce) this).field_l) {
                      L8: {
                        var5 = -((ce) this).field_l + ((ce) this).field_M;
                        stackOut_35_0 = this;
                        stackOut_35_1 = ((ce) this).field_l;
                        stackIn_39_0 = stackOut_35_0;
                        stackIn_39_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (Math.abs(var5) < -3) {
                          stackOut_39_0 = this;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = var5 >> -1416068863;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L8;
                        } else {
                          stackOut_36_0 = this;
                          stackOut_36_1 = stackIn_36_1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (-1 >= var5) {
                            stackOut_38_0 = this;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = -1;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_40_2 = stackOut_38_2;
                            break L8;
                          } else {
                            stackOut_37_0 = this;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = 1;
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_40_1 = stackOut_37_1;
                            stackIn_40_2 = stackOut_37_2;
                            break L8;
                          }
                        }
                      }
                      ((ce) this).field_l = stackIn_40_1 + stackIn_40_2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (((ce) this).field_J != ((ce) this).field_u) {
                    L9: {
                      var5 = ((ce) this).field_J + -((ce) this).field_u;
                      stackOut_43_0 = this;
                      stackOut_43_1 = ((ce) this).field_u;
                      stackIn_47_0 = stackOut_43_0;
                      stackIn_47_1 = stackOut_43_1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_47_0 = this;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = var5 >> -350442879;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        break L9;
                      } else {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (0 >= var5) {
                          stackOut_46_0 = this;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = -1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          break L9;
                        } else {
                          stackOut_45_0 = this;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = 1;
                          stackIn_48_0 = stackOut_45_0;
                          stackIn_48_1 = stackOut_45_1;
                          stackIn_48_2 = stackOut_45_2;
                          break L9;
                        }
                      }
                    }
                    ((ce) this).field_u = stackIn_48_1 + stackIn_48_2;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              } else {
                L10: {
                  var5 = -param0 + (nl.field_u + -((ce) this).field_L);
                  var6 = -param3 + hk.field_Jb - ((ce) this).field_B;
                  if (var5 != ((ce) this).field_l) {
                    break L10;
                  } else {
                    if (var6 == ((ce) this).field_u) {
                      break L6;
                    } else {
                      break L10;
                    }
                  }
                }
                ((ce) this).field_u = var6;
                ((ce) this).field_l = var5;
                if (((ce) this).field_o instanceof pf) {
                  ((pf) (Object) ((ce) this).field_o).a(param0, param3, (ce) this, 104);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            if (param1 > 113) {
              super.a(param0, 122, param2, param3);
              return;
            } else {
              ((ce) this).e(33);
              super.a(param0, 122, param2, param3);
              return;
            }
          } else {
            L11: {
              if (((ce) this).field_F) {
                L12: {
                  if (((ce) this).field_M != ((ce) this).field_l) {
                    L13: {
                      var5 = -((ce) this).field_l + ((ce) this).field_M;
                      stackOut_6_0 = this;
                      stackOut_6_1 = ((ce) this).field_l;
                      stackIn_10_0 = stackOut_6_0;
                      stackIn_10_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (Math.abs(var5) < -3) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = var5 >> -1416068863;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L13;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (-1 >= var5) {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = -1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L13;
                        } else {
                          stackOut_8_0 = this;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = 1;
                          stackIn_11_0 = stackOut_8_0;
                          stackIn_11_1 = stackOut_8_1;
                          stackIn_11_2 = stackOut_8_2;
                          break L13;
                        }
                      }
                    }
                    ((ce) this).field_l = stackIn_11_1 + stackIn_11_2;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (((ce) this).field_J != ((ce) this).field_u) {
                  L14: {
                    var5 = ((ce) this).field_J + -((ce) this).field_u;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((ce) this).field_u;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> -350442879;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L14;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (0 >= var5) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L14;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        break L14;
                      }
                    }
                  }
                  ((ce) this).field_u = stackIn_19_1 + stackIn_19_2;
                  break L11;
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            if (param1 > 113) {
              super.a(param0, 122, param2, param3);
              return;
            } else {
              ((ce) this).e(33);
              super.a(param0, 122, param2, param3);
              return;
            }
          }
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            Object var3 = null;
            hg var5 = null;
            hg var6 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (param0 < -35) {
                break L0;
              } else {
                var3 = null;
                rm[] discarded$4 = ce.a(47, -49, (eh) null, -99);
                break L0;
              }
            }
            L1: {
              if (td.field_b == null) {
                td.field_b = qc.field_f.a(uh.field_b, 27402, fj.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            if (td.field_b.field_a == 0) {
              return false;
            } else {
              long dupTemp$5 = hc.a(-9986);
              ud.field_a = dupTemp$5;
              fa.field_l = dupTemp$5;
              if (td.field_b.field_a == 1) {
                try {
                  L2: {
                    L3: {
                      oj.field_Ub = new el((java.net.Socket) td.field_b.field_f, qc.field_f);
                      var5 = sh.field_qb;
                      var6 = var5;
                      gk.field_g.field_l = 0;
                      if (param1) {
                        stackOut_12_0 = -2;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = -1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    ah.field_e = stackIn_13_0;
                    pl.field_c = stackIn_13_0;
                    md.field_b = stackIn_13_0;
                    ug.field_a = ul.field_c;
                    var6.field_l = 0;
                    hj.a(m.field_m, (jc) (Object) gk.field_g, wc.field_m, oj.field_Yb, 12);
                    al.b(-1, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ug.field_a = bd.field_d;
                  td.field_b = null;
                  return true;
                }
                td.field_b = null;
                return true;
              } else {
                ug.field_a = bd.field_d;
                td.field_b = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 < 97) {
            return;
        }
        field_H = null;
    }

    final static rm[] a(int param0, int param1, eh param2, int param3) {
        if (param0 != -1979) {
            return null;
        }
        if (!hn.a(param2, param3, param1, (byte) 109)) {
            return null;
        }
        return um.e((byte) 71);
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (((ce) this).a(param0, param2, 34, param3)) {
          ((ce) this).a(param2, param0, (byte) 126, param3);
          ((ce) this).a(param0, param3, 8651, param2);
          StringBuilder discarded$35 = param3.append(" revert=").append(((ce) this).field_F);
          if (((ce) this).field_M != 2147483647) {
            if (-2147483648 == (((ce) this).field_J ^ -1)) {
              if (param1 <= 118) {
                field_K = true;
                return param3;
              } else {
                return param3;
              }
            } else {
              L0: {
                StringBuilder discarded$36 = param3.append(" to ").append(((ce) this).field_M).append(44).append(((ce) this).field_J);
                if (param1 > 118) {
                  break L0;
                } else {
                  field_K = true;
                  break L0;
                }
              }
              return param3;
            }
          } else {
            if (param1 <= 118) {
              field_K = true;
              return param3;
            } else {
              return param3;
            }
          }
        } else {
          if (param1 <= 118) {
            field_K = true;
            return param3;
          } else {
            return param3;
          }
        }
    }

    private ce(int param0, int param1, int param2, int param3, ol param4, cd param5, fi param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ce) this).field_J = 2147483647;
        ((ce) this).field_M = 2147483647;
        ((ce) this).field_x = param6;
        ((ce) this).field_G = param8 ? true : false;
        ((ce) this).field_F = param7 ? true : false;
    }

    final static String a(int param0, CharSequence param1) {
        if (param0 != -1) {
            ce.a((byte) -87);
            return co.a(false, param1, (byte) -101);
        }
        return co.a(false, param1, (byte) -101);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        gg.field_D.field_l = 0;
        if (param2 != -2) {
          field_H = null;
          gg.field_D.a(12, 108);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(param0, 112);
          gg.field_D.a(param1, param2 ^ -82);
          gg.field_D.a((byte) 65, param3);
          gg.field_D.a(on.field_a, ch.field_i, (byte) 86);
          gk.field_g.g(18, 8);
          int fieldTemp$2 = gk.field_g.field_l + 1;
          gk.field_g.field_l = gk.field_g.field_l + 1;
          var4 = fieldTemp$2;
          gk.field_g.a(gg.field_D.field_g, gg.field_D.field_l, 0, (byte) -123);
          gk.field_g.b(-var4 + gk.field_g.field_l, -1);
          return;
        } else {
          gg.field_D.a(12, 108);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
          gg.field_D.a(param0, 112);
          gg.field_D.a(param1, param2 ^ -82);
          gg.field_D.a((byte) 65, param3);
          gg.field_D.a(on.field_a, ch.field_i, (byte) 86);
          gk.field_g.g(18, 8);
          int fieldTemp$3 = gk.field_g.field_l + 1;
          gk.field_g.field_l = gk.field_g.field_l + 1;
          var4 = fieldTemp$3;
          gk.field_g.a(gg.field_D.field_g, gg.field_D.field_l, 0, (byte) -123);
          gk.field_g.b(-var4 + gk.field_g.field_l, -1);
          return;
        }
    }

    final void e(int param0) {
        super.e(-78);
        ((ce) this).field_x.a(((ce) this).field_m, true, 0, 0, ((ce) this).field_g);
        if (param0 > -2) {
          return;
        } else {
          ((ce) this).field_J = ((ce) this).field_u;
          ((ce) this).field_M = ((ce) this).field_l;
          return;
        }
    }

    final static void f(int param0) {
        L0: {
          am.a((byte) -16);
          if (fi.field_v != null) {
            af.a((byte) -103, fi.field_v);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          nm.d(param0 ^ 13628);
          lh.a(true);
          kh.a(0);
          if (bg.f((byte) 121)) {
            gk.field_g.g(1, 8);
            al.b(-1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 13633) {
          return;
        } else {
          tn.a(false);
          return;
        }
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, 108);
        if (param5 < 73) {
            return;
        }
        ((ce) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Connecting to<br>friend server...";
        field_I = 1;
        field_K = true;
    }
}
