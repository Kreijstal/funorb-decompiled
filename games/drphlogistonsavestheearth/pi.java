/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends si {
    static vh field_P;
    private int field_K;
    private boolean field_H;
    private int field_L;
    private int field_U;
    private boolean field_T;
    private int field_M;
    static String field_W;
    static String field_J;
    static sa field_N;
    static bl field_I;
    static wg field_V;
    static int field_Q;
    static he[] field_S;
    static wa field_O;
    static String field_R;

    final static void a(boolean param0, String[] param1) {
        if (param0) {
          L0: {
            if (null != ug.field_I) {
              ug.field_I.field_V.a(2, param1);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != dd.field_g) {
            dd.field_g.field_O.a(2, param1);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            field_W = null;
            if (null != ug.field_I) {
              ug.field_I.field_V.a(2, param1);
              break L1;
            } else {
              break L1;
            }
          }
          if (null == dd.field_g) {
            return;
          } else {
            dd.field_g.field_O.a(2, param1);
            return;
          }
        }
    }

    private pi(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((pi) this).field_K = 2147483647;
        ((pi) this).field_M = 2147483647;
        ((pi) this).field_T = param7 ? true : false;
        ((pi) this).field_z = param6;
        ((pi) this).field_H = param8 ? true : false;
    }

    final void i(int param0) {
        super.i(0);
        ((pi) this).field_z.a(param0, ((pi) this).field_k, 0, 16535, ((pi) this).field_w);
        ((pi) this).field_M = ((pi) this).field_o;
        ((pi) this).field_K = ((pi) this).field_m;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) pj.field_G);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pj.field_G);
        if (param1 != 1) {
            return;
        }
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) pj.field_G);
        tf.field_mb = 0;
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = 0;
        Object var9 = null;
        if (param3 >= 113) {
          var8 = super.a(param0, param1, param2, (byte) 126, param4, param5, param6) ? 1 : 0;
          if (var8 == 0) {
            if (((pi) this).a(param6, param5, false, param4, param0)) {
              L0: {
                if (1 == param2) {
                  ((pi) this).field_L = -param5 + (-((pi) this).field_o + param4);
                  ((pi) this).field_U = -((pi) this).field_m + (param0 - param6);
                  oh.field_b = (pi) this;
                  break L0;
                } else {
                  break L0;
                }
              }
              ((pi) this).field_y = param2;
              return true;
            } else {
              return var8 != 0;
            }
          } else {
            if (!((pi) this).field_H) {
              if (((pi) this).a(param6, param5, false, param4, param0)) {
                L1: {
                  if (1 == param2) {
                    ((pi) this).field_L = -param5 + (-((pi) this).field_o + param4);
                    ((pi) this).field_U = -((pi) this).field_m + (param0 - param6);
                    oh.field_b = (pi) this;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((pi) this).field_y = param2;
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          var9 = null;
          ((pi) this).a((vg) null, -121, -33, (byte) 86);
          var8 = super.a(param0, param1, param2, (byte) 126, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((pi) this).field_H) {
              if (((pi) this).a(param6, param5, false, param4, param0)) {
                L2: {
                  if (1 == param2) {
                    ((pi) this).field_L = -param5 + (-((pi) this).field_o + param4);
                    ((pi) this).field_U = -((pi) this).field_m + (param0 - param6);
                    oh.field_b = (pi) this;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((pi) this).field_y = param2;
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((pi) this).a(param6, param5, false, param4, param0)) {
              L3: {
                if (1 == param2) {
                  ((pi) this).field_L = -param5 + (-((pi) this).field_o + param4);
                  ((pi) this).field_U = -((pi) this).field_m + (param0 - param6);
                  oh.field_b = (pi) this;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((pi) this).field_y = param2;
              return true;
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final static void a(nh param0, int param1) {
        sa.field_e = param0;
        if (param1 != 21914) {
            field_S = null;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (((pi) this).a(param1, param2, param0, -98)) {
          L0: {
            ((pi) this).a(param2, (byte) 89, param0, param1);
            ((pi) this).a(10, param2, param0, param1);
            StringBuilder discarded$26 = param2.append(" revert=").append(((pi) this).field_T);
            if (-2147483648 == (((pi) this).field_M ^ -1)) {
              break L0;
            } else {
              if ((((pi) this).field_K ^ -1) != -2147483648) {
                StringBuilder discarded$27 = param2.append(" to ").append(((pi) this).field_M).append(44).append(((pi) this).field_K);
                break L0;
              } else {
                if (param3 == -10612) {
                  return param2;
                } else {
                  ((pi) this).i(-7);
                  return param2;
                }
              }
            }
          }
          if (param3 != -10612) {
            ((pi) this).i(-7);
            return param2;
          } else {
            return param2;
          }
        } else {
          if (param3 == -10612) {
            return param2;
          } else {
            ((pi) this).i(-7);
            return param2;
          }
        }
    }

    public static void j(int param0) {
        field_I = null;
        field_V = null;
        field_J = null;
        if (param0 != 2147483647) {
          return;
        } else {
          field_P = null;
          field_R = null;
          field_O = null;
          field_W = null;
          field_S = null;
          field_N = null;
          return;
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
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
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
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
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
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
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        if (!(((pi) this).field_z instanceof hf)) {
          if (((pi) this).field_y == 1) {
            var5 = -param1 + (-((pi) this).field_L + ck.field_c);
            var6 = ob.field_g - ((pi) this).field_U - param2;
            if (var5 != ((pi) this).field_o) {
              ((pi) this).field_m = var6;
              ((pi) this).field_o = var5;
              if (!(((pi) this).field_u instanceof te)) {
                L0: {
                  super.a(param0, param1, param2, (byte) -128);
                  if (param3 < -127) {
                    break L0;
                  } else {
                    field_N = null;
                    break L0;
                  }
                }
                return;
              } else {
                L1: {
                  ((te) (Object) ((pi) this).field_u).a((pi) this, -31124, param1, param2);
                  super.a(param0, param1, param2, (byte) -128);
                  if (param3 < -127) {
                    break L1;
                  } else {
                    field_N = null;
                    break L1;
                  }
                }
                return;
              }
            } else {
              if (((pi) this).field_m != var6) {
                ((pi) this).field_m = var6;
                ((pi) this).field_o = var5;
                if (((pi) this).field_u instanceof te) {
                  L2: {
                    ((te) (Object) ((pi) this).field_u).a((pi) this, -31124, param1, param2);
                    super.a(param0, param1, param2, (byte) -128);
                    if (param3 < -127) {
                      break L2;
                    } else {
                      field_N = null;
                      break L2;
                    }
                  }
                  return;
                } else {
                  L3: {
                    super.a(param0, param1, param2, (byte) -128);
                    if (param3 < -127) {
                      break L3;
                    } else {
                      field_N = null;
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  super.a(param0, param1, param2, (byte) -128);
                  if (param3 < -127) {
                    break L4;
                  } else {
                    field_N = null;
                    break L4;
                  }
                }
                return;
              }
            }
          } else {
            L5: {
              if (((pi) this).field_T) {
                L6: {
                  if (((pi) this).field_o == ((pi) this).field_M) {
                    break L6;
                  } else {
                    L7: {
                      var5 = -((pi) this).field_o + ((pi) this).field_M;
                      stackOut_52_0 = this;
                      stackOut_52_1 = ((pi) this).field_o;
                      stackIn_56_0 = stackOut_52_0;
                      stackIn_56_1 = stackOut_52_1;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      if (Math.abs(var5) > 2) {
                        stackOut_56_0 = this;
                        stackOut_56_1 = stackIn_56_1;
                        stackOut_56_2 = var5 >> 1841527681;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        break L7;
                      } else {
                        stackOut_53_0 = this;
                        stackOut_53_1 = stackIn_53_1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (var5 <= 0) {
                          stackOut_55_0 = this;
                          stackOut_55_1 = stackIn_55_1;
                          stackOut_55_2 = -1;
                          stackIn_57_0 = stackOut_55_0;
                          stackIn_57_1 = stackOut_55_1;
                          stackIn_57_2 = stackOut_55_2;
                          break L7;
                        } else {
                          stackOut_54_0 = this;
                          stackOut_54_1 = stackIn_54_1;
                          stackOut_54_2 = 1;
                          stackIn_57_0 = stackOut_54_0;
                          stackIn_57_1 = stackOut_54_1;
                          stackIn_57_2 = stackOut_54_2;
                          break L7;
                        }
                      }
                    }
                    ((pi) this).field_o = stackIn_57_1 + stackIn_57_2;
                    break L6;
                  }
                }
                if (((pi) this).field_m == ((pi) this).field_K) {
                  break L5;
                } else {
                  L8: {
                    var5 = ((pi) this).field_K + -((pi) this).field_m;
                    stackOut_59_0 = this;
                    stackOut_59_1 = ((pi) this).field_m;
                    stackIn_63_0 = stackOut_59_0;
                    stackIn_63_1 = stackOut_59_1;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_63_0 = this;
                      stackOut_63_1 = stackIn_63_1;
                      stackOut_63_2 = var5 >> -1711997215;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      stackIn_64_2 = stackOut_63_2;
                      break L8;
                    } else {
                      stackOut_60_0 = this;
                      stackOut_60_1 = stackIn_60_1;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_62_1 = stackOut_60_1;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if (var5 <= 0) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = -1;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        stackIn_64_2 = stackOut_62_2;
                        break L8;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = 1;
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_64_1 = stackOut_61_1;
                        stackIn_64_2 = stackOut_61_2;
                        break L8;
                      }
                    }
                  }
                  ((pi) this).field_m = stackIn_64_1 + stackIn_64_2;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L9: {
              super.a(param0, param1, param2, (byte) -128);
              if (param3 < -127) {
                break L9;
              } else {
                field_N = null;
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((hf) (Object) ((pi) this).field_z).field_E) {
            L10: {
              if (((pi) this).field_T) {
                L11: {
                  if (((pi) this).field_o == ((pi) this).field_M) {
                    break L11;
                  } else {
                    L12: {
                      var5 = -((pi) this).field_o + ((pi) this).field_M;
                      stackOut_31_0 = this;
                      stackOut_31_1 = ((pi) this).field_o;
                      stackIn_35_0 = stackOut_31_0;
                      stackIn_35_1 = stackOut_31_1;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      if (Math.abs(var5) > 2) {
                        stackOut_35_0 = this;
                        stackOut_35_1 = stackIn_35_1;
                        stackOut_35_2 = var5 >> 1841527681;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        stackIn_36_2 = stackOut_35_2;
                        break L12;
                      } else {
                        stackOut_32_0 = this;
                        stackOut_32_1 = stackIn_32_1;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (var5 <= 0) {
                          stackOut_34_0 = this;
                          stackOut_34_1 = stackIn_34_1;
                          stackOut_34_2 = -1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L12;
                        } else {
                          stackOut_33_0 = this;
                          stackOut_33_1 = stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_36_0 = stackOut_33_0;
                          stackIn_36_1 = stackOut_33_1;
                          stackIn_36_2 = stackOut_33_2;
                          break L12;
                        }
                      }
                    }
                    ((pi) this).field_o = stackIn_36_1 + stackIn_36_2;
                    break L11;
                  }
                }
                if (((pi) this).field_m == ((pi) this).field_K) {
                  break L10;
                } else {
                  L13: {
                    var5 = ((pi) this).field_K + -((pi) this).field_m;
                    stackOut_38_0 = this;
                    stackOut_38_1 = ((pi) this).field_m;
                    stackIn_42_0 = stackOut_38_0;
                    stackIn_42_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (-3 > (Math.abs(var5) ^ -1)) {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = var5 >> -1711997215;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      stackIn_43_2 = stackOut_42_2;
                      break L13;
                    } else {
                      stackOut_39_0 = this;
                      stackOut_39_1 = stackIn_39_1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      if (var5 <= 0) {
                        stackOut_41_0 = this;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = -1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        break L13;
                      } else {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 1;
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_43_1 = stackOut_40_1;
                        stackIn_43_2 = stackOut_40_2;
                        break L13;
                      }
                    }
                  }
                  ((pi) this).field_m = stackIn_43_1 + stackIn_43_2;
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L14: {
              super.a(param0, param1, param2, (byte) -128);
              if (param3 < -127) {
                break L14;
              } else {
                field_N = null;
                break L14;
              }
            }
            return;
          } else {
            L15: {
              if (((pi) this).field_y != 1) {
                if (((pi) this).field_T) {
                  L16: {
                    if (((pi) this).field_o == ((pi) this).field_M) {
                      break L16;
                    } else {
                      L17: {
                        var5 = -((pi) this).field_o + ((pi) this).field_M;
                        stackOut_12_0 = this;
                        stackOut_12_1 = ((pi) this).field_o;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (Math.abs(var5) > 2) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = var5 >> 1841527681;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L17;
                        } else {
                          stackOut_13_0 = this;
                          stackOut_13_1 = stackIn_13_1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          if (var5 <= 0) {
                            stackOut_15_0 = this;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = -1;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            break L17;
                          } else {
                            stackOut_14_0 = this;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = 1;
                            stackIn_17_0 = stackOut_14_0;
                            stackIn_17_1 = stackOut_14_1;
                            stackIn_17_2 = stackOut_14_2;
                            break L17;
                          }
                        }
                      }
                      ((pi) this).field_o = stackIn_17_1 + stackIn_17_2;
                      break L16;
                    }
                  }
                  if (((pi) this).field_m == ((pi) this).field_K) {
                    break L15;
                  } else {
                    L18: {
                      var5 = ((pi) this).field_K + -((pi) this).field_m;
                      stackOut_19_0 = this;
                      stackOut_19_1 = ((pi) this).field_m;
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_23_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = var5 >> -1711997215;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L18;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (var5 <= 0) {
                          stackOut_22_0 = this;
                          stackOut_22_1 = stackIn_22_1;
                          stackOut_22_2 = -1;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          stackIn_24_2 = stackOut_22_2;
                          break L18;
                        } else {
                          stackOut_21_0 = this;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = 1;
                          stackIn_24_0 = stackOut_21_0;
                          stackIn_24_1 = stackOut_21_1;
                          stackIn_24_2 = stackOut_21_2;
                          break L18;
                        }
                      }
                    }
                    ((pi) this).field_m = stackIn_24_1 + stackIn_24_2;
                    break L15;
                  }
                } else {
                  break L15;
                }
              } else {
                L19: {
                  var5 = -param1 + (-((pi) this).field_L + ck.field_c);
                  var6 = ob.field_g - ((pi) this).field_U - param2;
                  if (var5 != ((pi) this).field_o) {
                    break L19;
                  } else {
                    if (((pi) this).field_m == var6) {
                      break L15;
                    } else {
                      break L19;
                    }
                  }
                }
                ((pi) this).field_m = var6;
                ((pi) this).field_o = var5;
                if (!(((pi) this).field_u instanceof te)) {
                  break L15;
                } else {
                  ((te) (Object) ((pi) this).field_u).a((pi) this, -31124, param1, param2);
                  break L15;
                }
              }
            }
            L20: {
              super.a(param0, param1, param2, (byte) -128);
              if (param3 < -127) {
                break L20;
              } else {
                field_N = null;
                break L20;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((pi) this).field_y = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new vh();
        field_W = "Achievements";
        field_J = null;
        field_V = null;
        field_Q = -1;
        field_N = new sa(4, 1, 1, 1);
        field_R = "Names cannot contain consecutive spaces";
    }
}
