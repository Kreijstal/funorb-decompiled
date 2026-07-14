/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class se extends ma {
    private int field_N;
    static lm field_S;
    static String field_V;
    static String field_Q;
    private int field_R;
    private boolean field_P;
    private int field_O;
    static w field_U;
    private int field_M;
    private boolean field_T;

    public static void g(int param0) {
        if (param0 != 11344) {
          boolean discarded$2 = se.i(-102);
          field_Q = null;
          field_V = null;
          field_S = null;
          field_U = null;
          return;
        } else {
          field_Q = null;
          field_V = null;
          field_S = null;
          field_U = null;
          return;
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((se) this).field_P) {
            if (!((se) this).a(param1, (byte) -39, param4, param0, param5)) {
              return var8 != 0;
            } else {
              L0: {
                ((se) this).field_o = param3;
                if ((param3 ^ -1) == -2) {
                  ((se) this).field_N = -param5 + (param1 - ((se) this).field_u);
                  lg.field_Y = (se) this;
                  ((se) this).field_R = param0 + -((se) this).field_D + -param4;
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
          if (((se) this).a(param1, (byte) -39, param4, param0, param5)) {
            ((se) this).field_o = param3;
            if ((param3 ^ -1) != -2) {
              return true;
            } else {
              ((se) this).field_N = -param5 + (param1 - ((se) this).field_u);
              lg.field_Y = (se) this;
              ((se) this).field_R = param0 + -((se) this).field_D + -param4;
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    final static java.applet.Applet h(int param0) {
        if (param0 != 25144) {
            boolean discarded$3 = se.i(-107);
            if (kb.field_h != null) {
                return kb.field_h;
            }
            return (java.applet.Applet) (Object) ta.field_i;
        }
        if (kb.field_h != null) {
            return kb.field_h;
        }
        return (java.applet.Applet) (Object) ta.field_i;
    }

    final static boolean i(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (!nm.field_Qb) {
            if (ph.n(param0 + -30145)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!qj.field_k) {
              L0: {
                if (!ph.n(param0 + -30145)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          boolean discarded$5 = se.i(107);
          if (nm.field_Qb) {
            if (qj.field_k) {
              return true;
            } else {
              L1: {
                if (!ph.n(param0 + -30145)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!ph.n(param0 + -30145)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
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
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
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
        L0: {
          if (!(((se) this).field_L instanceof ek)) {
            if (1 == ((se) this).field_o) {
              L1: {
                var5 = bh.field_g - (((se) this).field_N - -param3);
                var6 = pm.field_f - ((se) this).field_R - param2;
                if (((se) this).field_u != var5) {
                  break L1;
                } else {
                  if (var6 != ((se) this).field_D) {
                    break L1;
                  } else {
                    super.a(param0, 113, param2, param3);
                    if (param1 < 38) {
                      se.g(86);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((se) this).field_D = var6;
              ((se) this).field_u = var5;
              if (!(((se) this).field_v instanceof mj)) {
                break L0;
              } else {
                ((mj) (Object) ((se) this).field_v).a(param3, (se) this, -24076, param2);
                super.a(param0, 113, param2, param3);
                if (param1 < 38) {
                  se.g(86);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (((se) this).field_T) {
                L2: {
                  if (((se) this).field_M != ((se) this).field_u) {
                    L3: {
                      var5 = -((se) this).field_u + ((se) this).field_M;
                      stackOut_35_0 = this;
                      stackOut_35_1 = ((se) this).field_u;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      if (Math.abs(var5) <= 2) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = stackIn_37_1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (-1 <= (var5 ^ -1)) {
                          stackOut_39_0 = this;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = -1;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L3;
                        } else {
                          stackOut_38_0 = this;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          break L3;
                        }
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = var5 >> 1623977313;
                        stackIn_40_0 = stackOut_36_0;
                        stackIn_40_1 = stackOut_36_1;
                        stackIn_40_2 = stackOut_36_2;
                        break L3;
                      }
                    }
                    ((se) this).field_u = stackIn_40_1 + stackIn_40_2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((se) this).field_D == ((se) this).field_O) {
                  super.a(param0, 113, param2, param3);
                  if (param1 < 38) {
                    se.g(86);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    var5 = ((se) this).field_O + -((se) this).field_D;
                    stackOut_42_0 = this;
                    stackOut_42_1 = ((se) this).field_D;
                    stackIn_46_0 = stackOut_42_0;
                    stackIn_46_1 = stackOut_42_1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_46_0 = this;
                      stackOut_46_1 = stackIn_46_1;
                      stackOut_46_2 = var5 >> -553011135;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      break L4;
                    } else {
                      stackOut_43_0 = this;
                      stackOut_43_1 = stackIn_43_1;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      if ((var5 ^ -1) < -1) {
                        stackOut_45_0 = this;
                        stackOut_45_1 = stackIn_45_1;
                        stackOut_45_2 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_47_2 = stackOut_45_2;
                        break L4;
                      } else {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = -1;
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_47_2 = stackOut_44_2;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    ((se) this).field_D = stackIn_47_1 + stackIn_47_2;
                    super.a(param0, 113, param2, param3);
                    if (param1 >= 38) {
                      break L5;
                    } else {
                      se.g(86);
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                super.a(param0, 113, param2, param3);
                if (param1 < 38) {
                  se.g(86);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (!((ek) (Object) ((se) this).field_L).field_I) {
              if (!((se) this).field_T) {
                break L0;
              } else {
                L6: {
                  if (((se) this).field_M != ((se) this).field_u) {
                    L7: {
                      var5 = -((se) this).field_u + ((se) this).field_M;
                      stackOut_57_0 = this;
                      stackOut_57_1 = ((se) this).field_u;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      if (Math.abs(var5) <= 2) {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if (-1 <= (var5 ^ -1)) {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = -1;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          break L7;
                        } else {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = 1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          stackIn_62_2 = stackOut_60_2;
                          break L7;
                        }
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = stackIn_58_1;
                        stackOut_58_2 = var5 >> 1623977313;
                        stackIn_62_0 = stackOut_58_0;
                        stackIn_62_1 = stackOut_58_1;
                        stackIn_62_2 = stackOut_58_2;
                        break L7;
                      }
                    }
                    ((se) this).field_u = stackIn_62_1 + stackIn_62_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((se) this).field_D == ((se) this).field_O) {
                  break L0;
                } else {
                  L8: {
                    var5 = ((se) this).field_O + -((se) this).field_D;
                    stackOut_64_0 = this;
                    stackOut_64_1 = ((se) this).field_D;
                    stackIn_68_0 = stackOut_64_0;
                    stackIn_68_1 = stackOut_64_1;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    if ((Math.abs(var5) ^ -1) < -3) {
                      stackOut_68_0 = this;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = var5 >> -553011135;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      break L8;
                    } else {
                      stackOut_65_0 = this;
                      stackOut_65_1 = stackIn_65_1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if ((var5 ^ -1) < -1) {
                        stackOut_67_0 = this;
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = 1;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_69_2 = stackOut_67_2;
                        break L8;
                      } else {
                        stackOut_66_0 = this;
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = -1;
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_69_2 = stackOut_66_2;
                        break L8;
                      }
                    }
                  }
                  ((se) this).field_D = stackIn_69_1 + stackIn_69_2;
                  super.a(param0, 113, param2, param3);
                  if (param1 < 38) {
                    se.g(86);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L9: {
                if (1 == ((se) this).field_o) {
                  L10: {
                    var5 = bh.field_g - (((se) this).field_N - -param3);
                    var6 = pm.field_f - ((se) this).field_R - param2;
                    if (((se) this).field_u != var5) {
                      break L10;
                    } else {
                      if (var6 != ((se) this).field_D) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((se) this).field_D = var6;
                  ((se) this).field_u = var5;
                  if (!(((se) this).field_v instanceof mj)) {
                    break L9;
                  } else {
                    ((mj) (Object) ((se) this).field_v).a(param3, (se) this, -24076, param2);
                    break L9;
                  }
                } else {
                  if (!((se) this).field_T) {
                    break L9;
                  } else {
                    L11: {
                      if (((se) this).field_M != ((se) this).field_u) {
                        L12: {
                          var5 = -((se) this).field_u + ((se) this).field_M;
                          stackOut_6_0 = this;
                          stackOut_6_1 = ((se) this).field_u;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (Math.abs(var5) <= 2) {
                            stackOut_8_0 = this;
                            stackOut_8_1 = stackIn_8_1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (-1 <= (var5 ^ -1)) {
                              stackOut_10_0 = this;
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = -1;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              stackIn_11_2 = stackOut_10_2;
                              break L12;
                            } else {
                              stackOut_9_0 = this;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_11_2 = stackOut_9_2;
                              break L12;
                            }
                          } else {
                            stackOut_7_0 = this;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = var5 >> 1623977313;
                            stackIn_11_0 = stackOut_7_0;
                            stackIn_11_1 = stackOut_7_1;
                            stackIn_11_2 = stackOut_7_2;
                            break L12;
                          }
                        }
                        ((se) this).field_u = stackIn_11_1 + stackIn_11_2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (((se) this).field_D == ((se) this).field_O) {
                      break L9;
                    } else {
                      L13: {
                        var5 = ((se) this).field_O + -((se) this).field_D;
                        stackOut_13_0 = this;
                        stackOut_13_1 = ((se) this).field_D;
                        stackIn_17_0 = stackOut_13_0;
                        stackIn_17_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if ((Math.abs(var5) ^ -1) < -3) {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = var5 >> -553011135;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          stackIn_18_2 = stackOut_17_2;
                          break L13;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if ((var5 ^ -1) < -1) {
                            stackOut_16_0 = this;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L13;
                          } else {
                            ((se) this).field_D = stackIn_15_1 + -1;
                            break L9;
                          }
                        }
                      }
                      ((se) this).field_D = stackIn_18_1 + stackIn_18_2;
                      break L9;
                    }
                  }
                }
              }
              L14: {
                super.a(param0, 113, param2, param3);
                if (param1 >= 38) {
                  break L14;
                } else {
                  se.g(86);
                  break L14;
                }
              }
              return;
            }
          }
        }
        super.a(param0, 113, param2, param3);
        if (param1 < 38) {
          se.g(86);
          return;
        } else {
          return;
        }
    }

    final static void a(ji param0, ji param1, byte param2, boolean param3, ji param4) {
        jj.field_f = ui.a(0, "");
        jj.field_f.a(-21, false);
        fn.a(param0, param1, param4, 0);
        bl.g((byte) -121);
        sh.field_d = uc.field_c;
        if (param2 != 76) {
            Object var6 = null;
            se.a((ji) null, (ji) null, (byte) -98, true, (ji) null);
        }
        ka.field_P = uc.field_c;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        Object var6 = null;
        if (param3) {
          if (((se) this).a(0, param1, param0, param2)) {
            ((se) this).a((byte) 72, param2, param0, param1);
            ((se) this).a((byte) -105, param1, param2, param0);
            StringBuilder discarded$5 = param2.append(" revert=").append(((se) this).field_T);
            if (-2147483648 != (((se) this).field_M ^ -1)) {
              if ((((se) this).field_O ^ -1) == -2147483648) {
                return param2;
              } else {
                StringBuilder discarded$6 = param2.append(" to ").append(((se) this).field_M).append(44).append(((se) this).field_O);
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          var6 = null;
          boolean discarded$7 = ((se) this).a(-91, 66, (ce) null, 112, 104, 72, (byte) -16);
          if (((se) this).a(0, param1, param0, param2)) {
            ((se) this).a((byte) 72, param2, param0, param1);
            ((se) this).a((byte) -105, param1, param2, param0);
            StringBuilder discarded$8 = param2.append(" revert=").append(((se) this).field_T);
            if (-2147483648 == (((se) this).field_M ^ -1)) {
              return param2;
            } else {
              L0: {
                if ((((se) this).field_O ^ -1) != -2147483648) {
                  StringBuilder discarded$9 = param2.append(" to ").append(((se) this).field_M).append(44).append(((se) this).field_O);
                  break L0;
                } else {
                  break L0;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        ((se) this).field_L.b(((se) this).field_y, ((se) this).field_t, 0, 0, -16555);
        ((se) this).field_O = ((se) this).field_D;
        ((se) this).field_M = ((se) this).field_u;
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        super.a(param0, param1 ^ 0, param2, param3, param4, param5);
        ((se) this).field_o = 0;
        if (param1 != 64) {
            field_S = null;
        }
    }

    private se(int param0, int param1, int param2, int param3, gl param4, kg param5, ce param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((se) this).field_O = 2147483647;
        ((se) this).field_M = 2147483647;
        ((se) this).field_T = param7 ? true : false;
        ((se) this).field_P = param8 ? true : false;
        ((se) this).field_L = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Create";
        field_V = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
