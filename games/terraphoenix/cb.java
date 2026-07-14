/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cb extends jc {
    private int field_K;
    private int field_N;
    private boolean field_H;
    private boolean field_L;
    static o field_J;
    private int field_A;
    private int field_M;
    static int field_I;

    final static void a(boolean param0, int param1) {
        wl stackIn_2_0 = null;
        wl stackIn_3_0 = null;
        wl stackIn_4_0 = null;
        wl stackIn_5_0 = null;
        wl stackIn_6_0 = null;
        wl stackIn_7_0 = null;
        wl stackIn_10_0 = null;
        wl stackIn_11_0 = null;
        wl stackIn_12_0 = null;
        wl stackIn_13_0 = null;
        wl stackIn_14_0 = null;
        wl stackIn_15_0 = null;
        wl stackOut_9_0 = null;
        wl stackOut_11_0 = null;
        wl stackOut_13_0 = null;
        wl stackOut_1_0 = null;
        wl stackOut_3_0 = null;
        wl stackOut_5_0 = null;
        if (!param0) {
          stackOut_9_0 = uk.field_b;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (param1 != -7) {
            stackOut_11_0 = (wl) (Object) stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (-5 != param1) {
              stackOut_13_0 = (wl) (Object) stackIn_13_0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((param1 ^ -1) == -6) {
                ((wl) (Object) stackIn_15_0).a(false, (byte) 127, ca.field_a[param1]);
                return;
              } else {
                ((wl) (Object) stackIn_14_0).a(true, (byte) 127, ca.field_a[param1]);
                return;
              }
            } else {
              ((wl) (Object) stackIn_12_0).a(false, (byte) 127, ca.field_a[param1]);
              return;
            }
          } else {
            ((wl) (Object) stackIn_10_0).a(false, (byte) 127, ca.field_a[param1]);
            return;
          }
        } else {
          field_I = -26;
          stackOut_1_0 = uk.field_b;
          stackIn_3_0 = stackOut_1_0;
          stackIn_2_0 = stackOut_1_0;
          if (param1 != -7) {
            stackOut_3_0 = (wl) (Object) stackIn_3_0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (-5 != param1) {
              stackOut_5_0 = (wl) (Object) stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if ((param1 ^ -1) == -6) {
                ((wl) (Object) stackIn_7_0).a(false, (byte) 127, ca.field_a[param1]);
                return;
              } else {
                ((wl) (Object) stackIn_6_0).a(true, (byte) 127, ca.field_a[param1]);
                return;
              }
            } else {
              ((wl) (Object) stackIn_4_0).a(false, (byte) 127, ca.field_a[param1]);
              return;
            }
          } else {
            ((wl) (Object) stackIn_2_0).a(false, (byte) 127, ca.field_a[param1]);
            return;
          }
        }
    }

    final void a(gl param0, int param1, int param2, int param3) {
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
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
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
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
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
        L0: {
          if (!(((cb) this).field_F instanceof eb)) {
            if (-2 == (((cb) this).field_j ^ -1)) {
              var5 = -param2 + (ef.field_j + -((cb) this).field_A);
              var6 = -param1 + (jb.field_b + -((cb) this).field_K);
              if (var5 != ((cb) this).field_w) {
                ((cb) this).field_w = var5;
                ((cb) this).field_u = var6;
                if (((cb) this).field_r instanceof hc) {
                  ((hc) (Object) ((cb) this).field_r).a(-29856, param2, (cb) this, param1);
                  break L0;
                } else {
                  if (param3 >= 25) {
                    super.a(param0, param1, param2, 66);
                    return;
                  } else {
                    ((cb) this).field_A = -17;
                    super.a(param0, param1, param2, 66);
                    return;
                  }
                }
              } else {
                if (((cb) this).field_u == var6) {
                  break L0;
                } else {
                  L1: {
                    ((cb) this).field_w = var5;
                    ((cb) this).field_u = var6;
                    if (((cb) this).field_r instanceof hc) {
                      ((hc) (Object) ((cb) this).field_r).a(-29856, param2, (cb) this, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param3 >= 25) {
                    super.a(param0, param1, param2, 66);
                    return;
                  } else {
                    ((cb) this).field_A = -17;
                    super.a(param0, param1, param2, 66);
                    return;
                  }
                }
              }
            } else {
              if (((cb) this).field_L) {
                L2: {
                  if (((cb) this).field_N != ((cb) this).field_w) {
                    L3: {
                      var5 = ((cb) this).field_N - ((cb) this).field_w;
                      stackOut_37_0 = this;
                      stackOut_37_1 = ((cb) this).field_w;
                      stackIn_41_0 = stackOut_37_0;
                      stackIn_41_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = var5 >> 447536033;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        break L3;
                      } else {
                        stackOut_38_0 = this;
                        stackOut_38_1 = stackIn_38_1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (0 < var5) {
                          stackOut_40_0 = this;
                          stackOut_40_1 = stackIn_40_1;
                          stackOut_40_2 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          break L3;
                        } else {
                          stackOut_39_0 = this;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = -1;
                          stackIn_42_0 = stackOut_39_0;
                          stackIn_42_1 = stackOut_39_1;
                          stackIn_42_2 = stackOut_39_2;
                          break L3;
                        }
                      }
                    }
                    ((cb) this).field_w = stackIn_42_1 + stackIn_42_2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((cb) this).field_u != ((cb) this).field_M) {
                  L4: {
                    var5 = ((cb) this).field_M - ((cb) this).field_u;
                    stackOut_48_0 = this;
                    stackOut_48_1 = ((cb) this).field_u;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_50_0 = this;
                      stackOut_50_1 = stackIn_50_1;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_52_0 = this;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = 1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        break L4;
                      } else {
                        stackOut_51_0 = this;
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = -1;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        break L4;
                      }
                    } else {
                      stackOut_49_0 = this;
                      stackOut_49_1 = stackIn_49_1;
                      stackOut_49_2 = var5 >> -1383333791;
                      stackIn_53_0 = stackOut_49_0;
                      stackIn_53_1 = stackOut_49_1;
                      stackIn_53_2 = stackOut_49_2;
                      break L4;
                    }
                  }
                  ((cb) this).field_u = stackIn_53_1 + stackIn_53_2;
                  if (param3 >= 25) {
                    super.a(param0, param1, param2, 66);
                    return;
                  } else {
                    ((cb) this).field_A = -17;
                    super.a(param0, param1, param2, 66);
                    return;
                  }
                } else {
                  if (param3 >= 25) {
                    super.a(param0, param1, param2, 66);
                    return;
                  } else {
                    ((cb) this).field_A = -17;
                    super.a(param0, param1, param2, 66);
                    return;
                  }
                }
              } else {
                if (param3 >= 25) {
                  super.a(param0, param1, param2, 66);
                  return;
                } else {
                  ((cb) this).field_A = -17;
                  super.a(param0, param1, param2, 66);
                  return;
                }
              }
            }
          } else {
            if (!((eb) (Object) ((cb) this).field_F).field_A) {
              if (!((cb) this).field_L) {
                break L0;
              } else {
                L5: {
                  if (((cb) this).field_N != ((cb) this).field_w) {
                    L6: {
                      var5 = ((cb) this).field_N - ((cb) this).field_w;
                      stackOut_60_0 = this;
                      stackOut_60_1 = ((cb) this).field_w;
                      stackIn_64_0 = stackOut_60_0;
                      stackIn_64_1 = stackOut_60_1;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_64_0 = this;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = var5 >> 447536033;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        stackIn_65_2 = stackOut_64_2;
                        break L6;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        if (0 < var5) {
                          stackOut_63_0 = this;
                          stackOut_63_1 = stackIn_63_1;
                          stackOut_63_2 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          stackIn_65_1 = stackOut_63_1;
                          stackIn_65_2 = stackOut_63_2;
                          break L6;
                        } else {
                          stackOut_62_0 = this;
                          stackOut_62_1 = stackIn_62_1;
                          stackOut_62_2 = -1;
                          stackIn_65_0 = stackOut_62_0;
                          stackIn_65_1 = stackOut_62_1;
                          stackIn_65_2 = stackOut_62_2;
                          break L6;
                        }
                      }
                    }
                    ((cb) this).field_w = stackIn_65_1 + stackIn_65_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((cb) this).field_u == ((cb) this).field_M) {
                  break L0;
                } else {
                  L7: {
                    var5 = ((cb) this).field_M - ((cb) this).field_u;
                    stackOut_67_0 = this;
                    stackOut_67_1 = ((cb) this).field_u;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_69_0 = this;
                      stackOut_69_1 = stackIn_69_1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_71_0 = this;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        stackIn_72_2 = stackOut_71_2;
                        break L7;
                      } else {
                        stackOut_70_0 = this;
                        stackOut_70_1 = stackIn_70_1;
                        stackOut_70_2 = -1;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_72_2 = stackOut_70_2;
                        break L7;
                      }
                    } else {
                      stackOut_68_0 = this;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = var5 >> -1383333791;
                      stackIn_72_0 = stackOut_68_0;
                      stackIn_72_1 = stackOut_68_1;
                      stackIn_72_2 = stackOut_68_2;
                      break L7;
                    }
                  }
                  ((cb) this).field_u = stackIn_72_1 + stackIn_72_2;
                  if (param3 >= 25) {
                    super.a(param0, param1, param2, 66);
                    return;
                  } else {
                    ((cb) this).field_A = -17;
                    super.a(param0, param1, param2, 66);
                    return;
                  }
                }
              }
            } else {
              L8: {
                if (-2 == (((cb) this).field_j ^ -1)) {
                  L9: {
                    var5 = -param2 + (ef.field_j + -((cb) this).field_A);
                    var6 = -param1 + (jb.field_b + -((cb) this).field_K);
                    if (var5 != ((cb) this).field_w) {
                      break L9;
                    } else {
                      if (((cb) this).field_u == var6) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((cb) this).field_w = var5;
                  ((cb) this).field_u = var6;
                  if (((cb) this).field_r instanceof hc) {
                    ((hc) (Object) ((cb) this).field_r).a(-29856, param2, (cb) this, param1);
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  if (!((cb) this).field_L) {
                    break L8;
                  } else {
                    L10: {
                      if (((cb) this).field_N != ((cb) this).field_w) {
                        L11: {
                          var5 = ((cb) this).field_N - ((cb) this).field_w;
                          stackOut_6_0 = this;
                          stackOut_6_1 = ((cb) this).field_w;
                          stackIn_10_0 = stackOut_6_0;
                          stackIn_10_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (-3 > (Math.abs(var5) ^ -1)) {
                            stackOut_10_0 = this;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = var5 >> 447536033;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L11;
                          } else {
                            stackOut_7_0 = this;
                            stackOut_7_1 = stackIn_7_1;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (0 < var5) {
                              stackOut_9_0 = this;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_11_2 = stackOut_9_2;
                              break L11;
                            } else {
                              stackOut_8_0 = this;
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = -1;
                              stackIn_11_0 = stackOut_8_0;
                              stackIn_11_1 = stackOut_8_1;
                              stackIn_11_2 = stackOut_8_2;
                              break L11;
                            }
                          }
                        }
                        ((cb) this).field_w = stackIn_11_1 + stackIn_11_2;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (((cb) this).field_u == ((cb) this).field_M) {
                      break L8;
                    } else {
                      var5 = ((cb) this).field_M - ((cb) this).field_u;
                      stackOut_13_0 = this;
                      stackOut_13_1 = ((cb) this).field_u;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (Math.abs(var5) <= 2) {
                        L12: {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (-1 > (var5 ^ -1)) {
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
                        ((cb) this).field_u = stackIn_18_1 + stackIn_18_2;
                        break L8;
                      } else {
                        ((cb) this).field_u = stackIn_14_1 + (var5 >> -1383333791);
                        break L8;
                      }
                    }
                  }
                }
              }
              if (param3 >= 25) {
                super.a(param0, param1, param2, 66);
                return;
              } else {
                ((cb) this).field_A = -17;
                super.a(param0, param1, param2, 66);
                return;
              }
            }
          }
        }
        if (param3 >= 25) {
          super.a(param0, param1, param2, 66);
          return;
        } else {
          ((cb) this).field_A = -17;
          super.a(param0, param1, param2, 66);
          return;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((cb) this).field_H) {
            if (((cb) this).a(param3, param2, false, param6, param1)) {
              L0: {
                ((cb) this).field_j = param4;
                if (-2 == (param4 ^ -1)) {
                  ((cb) this).field_K = param6 + (-((cb) this).field_u + -param2);
                  oj.field_w = (cb) this;
                  ((cb) this).field_A = -param3 + (param1 + -((cb) this).field_w);
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
          if (((cb) this).a(param3, param2, false, param6, param1)) {
            ((cb) this).field_j = param4;
            if (-2 != (param4 ^ -1)) {
              return true;
            } else {
              ((cb) this).field_K = param6 + (-((cb) this).field_u + -param2);
              oj.field_w = (cb) this;
              ((cb) this).field_A = -param3 + (param1 + -((cb) this).field_w);
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    final static boolean a(dh param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param0.a(-16384);
        if (param1 < 72) {
          return true;
        } else {
          L0: {
            if ((var2 ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    public static void b(boolean param0) {
        field_J = null;
        if (!param0) {
            field_J = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        super.a(77, param1, param2, param3, param4, param5);
        if (param0 < 36) {
            return;
        }
        ((cb) this).field_j = 0;
    }

    final void a(int param0) {
        super.a(param0 ^ param0);
        ((cb) this).field_F.a(0, (byte) 85, ((cb) this).field_p, 0, ((cb) this).field_n);
        ((cb) this).field_N = ((cb) this).field_w;
        ((cb) this).field_M = ((cb) this).field_u;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (param0 == 34) {
          if (((cb) this).a(param1, param3, param0 ^ -10, param2)) {
            ((cb) this).a(param3, param2, (byte) 27, param1);
            ((cb) this).b(param1, param3, param2, 0);
            StringBuilder discarded$23 = param1.append(" revert=").append(((cb) this).field_L);
            if (-2147483648 != ((cb) this).field_N) {
              if (-2147483648 == ((cb) this).field_M) {
                return param1;
              } else {
                StringBuilder discarded$24 = param1.append(" to ").append(((cb) this).field_N).append(44).append(((cb) this).field_M);
                return param1;
              }
            } else {
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          return null;
        }
    }

    private cb(int param0, int param1, int param2, int param3, cj param4, sc param5, gl param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((cb) this).field_N = 2147483647;
        ((cb) this).field_M = 2147483647;
        ((cb) this).field_H = param8 ? true : false;
        ((cb) this).field_F = param6;
        ((cb) this).field_L = param7 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new o();
    }
}
