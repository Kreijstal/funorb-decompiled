/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class h extends ug {
    static de field_Y;
    private int field_R;
    private int field_Z;
    static wk field_T;
    private boolean field_W;
    private boolean field_S;
    static int field_U;
    private int field_ab;
    static int field_G;
    static String[] field_X;
    private int field_V;

    final static void i(int param0) {
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        if (param0 == -1) {
          if (null != fk.field_i) {
            if (fk.field_i.field_J) {
              if (0 == (fk.field_i.field_X.field_X & 1 << ed.field_j)) {
                if (0 == fk.field_i.field_X.field_X) {
                  if ((fk.field_i.field_N | 1 << ed.field_j) != -1 + (1 << fk.field_i.field_X.field_kb)) {
                    ti.field_A[12] = cl.field_i;
                    return;
                  } else {
                    ti.field_A[12] = jh.field_g;
                    return;
                  }
                } else {
                  ti.field_A[12] = nl.field_Z;
                  return;
                }
              } else {
                ti.field_A[12] = ch.field_H;
                return;
              }
            } else {
              if (-1 == (1 << ed.field_j & fk.field_i.field_X.field_X ^ -1)) {
                if (0 == fk.field_i.field_X.field_X) {
                  if ((1 << fk.field_i.field_X.field_kb) + -1 != (1 << ed.field_j | fk.field_i.field_N)) {
                    ti.field_A[12] = dg.field_a;
                    return;
                  } else {
                    ti.field_A[12] = hm.field_d;
                    return;
                  }
                } else {
                  ti.field_A[12] = ih.field_p;
                  return;
                }
              } else {
                ti.field_A[12] = ig.field_d;
                return;
              }
            }
          } else {
            if (-1 == (1 << ed.field_j & fk.field_i.field_X.field_X ^ -1)) {
              if (0 == fk.field_i.field_X.field_X) {
                if ((1 << fk.field_i.field_X.field_kb) + -1 != (1 << ed.field_j | fk.field_i.field_N)) {
                  ti.field_A[12] = dg.field_a;
                  return;
                } else {
                  ti.field_A[12] = hm.field_d;
                  return;
                }
              } else {
                ti.field_A[12] = ih.field_p;
                return;
              }
            } else {
              ti.field_A[12] = ig.field_d;
              return;
            }
          }
        } else {
          return;
        }
    }

    private h(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((h) this).field_ab = 2147483647;
        ((h) this).field_V = 2147483647;
        ((h) this).field_J = param6;
        ((h) this).field_W = param8 ? true : false;
        ((h) this).field_S = param7 ? true : false;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (!((h) this).a(param0, param4, (byte) 81, param3, param2)) {
            return var8 != 0;
          } else {
            L0: {
              if (-2 == (param6 ^ -1)) {
                ((h) this).field_R = param0 - (((h) this).field_z - -param4);
                ((h) this).field_Z = -param2 + (param3 - ((h) this).field_o);
                nc.field_e = (h) this;
                break L0;
              } else {
                break L0;
              }
            }
            ((h) this).field_w = param6;
            return true;
          }
        } else {
          if (!((h) this).field_W) {
            if (!((h) this).a(param0, param4, (byte) 81, param3, param2)) {
              return var8 != 0;
            } else {
              L1: {
                if (-2 == (param6 ^ -1)) {
                  ((h) this).field_R = param0 - (((h) this).field_z - -param4);
                  ((h) this).field_Z = -param2 + (param3 - ((h) this).field_o);
                  nc.field_e = (h) this;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((h) this).field_w = param6;
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void f(int param0) {
        super.f(-128);
        ((h) this).field_J.a(0, (byte) -95, 0, ((h) this).field_x, ((h) this).field_E);
        ((h) this).field_V = ((h) this).field_z;
        if (param0 >= -120) {
          field_Y = null;
          ((h) this).field_ab = ((h) this).field_o;
          return;
        } else {
          ((h) this).field_ab = ((h) this).field_o;
          return;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        Object var6 = null;
        if (((h) this).a(param1, (byte) -91, param3, param0)) {
          ((h) this).a(param3, param0, false, param1);
          ((h) this).a(param0, (byte) 75, param3, param1);
          StringBuilder discarded$6 = param1.append(" revert=").append(((h) this).field_S);
          if (-2147483648 != (((h) this).field_ab ^ -1)) {
            if (-2147483648 != (((h) this).field_V ^ -1)) {
              StringBuilder discarded$7 = param1.append(" to ").append(((h) this).field_ab).append(44).append(((h) this).field_V);
              if (param2 >= -104) {
                var6 = null;
                boolean discarded$8 = ((h) this).a(-29, (lh) null, 114, -68, 100, true, 18);
                return param1;
              } else {
                return param1;
              }
            } else {
              L0: {
                if (param2 < -104) {
                  break L0;
                } else {
                  var6 = null;
                  boolean discarded$9 = ((h) this).a(-29, (lh) null, 114, -68, 100, true, 18);
                  break L0;
                }
              }
              return param1;
            }
          } else {
            if (param2 >= -104) {
              var6 = null;
              boolean discarded$10 = ((h) this).a(-29, (lh) null, 114, -68, 100, true, 18);
              return param1;
            } else {
              return param1;
            }
          }
        } else {
          if (param2 >= -104) {
            var6 = null;
            boolean discarded$11 = ((h) this).a(-29, (lh) null, 114, -68, 100, true, 18);
            return param1;
          } else {
            return param1;
          }
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
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
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
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
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
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
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
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
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
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
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
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
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        if (!(((h) this).field_J instanceof oa)) {
          if (1 == ((h) this).field_w) {
            var5 = -((h) this).field_Z + oh.field_f - param0;
            var6 = -param3 + (pi.field_c - ((h) this).field_R);
            if (var5 == ((h) this).field_o) {
              if (var6 != ((h) this).field_z) {
                ((h) this).field_z = var6;
                ((h) this).field_o = var5;
                if (((h) this).field_A instanceof bn) {
                  L0: {
                    ((bn) (Object) ((h) this).field_A).a(-107, param0, (h) this, param3);
                    super.a(param0, 78, param2, param3);
                    if (param1 > 56) {
                      break L0;
                    } else {
                      ((h) this).field_ab = -32;
                      break L0;
                    }
                  }
                  return;
                } else {
                  L1: {
                    super.a(param0, 78, param2, param3);
                    if (param1 > 56) {
                      break L1;
                    } else {
                      ((h) this).field_ab = -32;
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                L2: {
                  super.a(param0, 78, param2, param3);
                  if (param1 > 56) {
                    break L2;
                  } else {
                    ((h) this).field_ab = -32;
                    break L2;
                  }
                }
                return;
              }
            } else {
              ((h) this).field_z = var6;
              ((h) this).field_o = var5;
              if (((h) this).field_A instanceof bn) {
                L3: {
                  ((bn) (Object) ((h) this).field_A).a(-107, param0, (h) this, param3);
                  super.a(param0, 78, param2, param3);
                  if (param1 > 56) {
                    break L3;
                  } else {
                    ((h) this).field_ab = -32;
                    break L3;
                  }
                }
                return;
              } else {
                L4: {
                  super.a(param0, 78, param2, param3);
                  if (param1 > 56) {
                    break L4;
                  } else {
                    ((h) this).field_ab = -32;
                    break L4;
                  }
                }
                return;
              }
            }
          } else {
            L5: {
              if (!((h) this).field_S) {
                break L5;
              } else {
                L6: {
                  if (((h) this).field_ab != ((h) this).field_o) {
                    L7: {
                      var5 = -((h) this).field_o + ((h) this).field_ab;
                      stackOut_51_0 = this;
                      stackOut_51_1 = ((h) this).field_o;
                      stackIn_55_0 = stackOut_51_0;
                      stackIn_55_1 = stackOut_51_1;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_55_0 = this;
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = var5 >> -1702565375;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        stackIn_56_2 = stackOut_55_2;
                        break L7;
                      } else {
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
                          stackIn_56_0 = stackOut_54_0;
                          stackIn_56_1 = stackOut_54_1;
                          stackIn_56_2 = stackOut_54_2;
                          break L7;
                        } else {
                          stackOut_53_0 = this;
                          stackOut_53_1 = stackIn_53_1;
                          stackOut_53_2 = 1;
                          stackIn_56_0 = stackOut_53_0;
                          stackIn_56_1 = stackOut_53_1;
                          stackIn_56_2 = stackOut_53_2;
                          break L7;
                        }
                      }
                    }
                    ((h) this).field_o = stackIn_56_1 + stackIn_56_2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((h) this).field_z == ((h) this).field_V) {
                  break L5;
                } else {
                  L8: {
                    var5 = ((h) this).field_V - ((h) this).field_z;
                    stackOut_58_0 = this;
                    stackOut_58_1 = ((h) this).field_z;
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
                        break L8;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = stackIn_61_1;
                        stackOut_61_2 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        break L8;
                      }
                    } else {
                      stackOut_59_0 = this;
                      stackOut_59_1 = stackIn_59_1;
                      stackOut_59_2 = var5 >> -1272534719;
                      stackIn_63_0 = stackOut_59_0;
                      stackIn_63_1 = stackOut_59_1;
                      stackIn_63_2 = stackOut_59_2;
                      break L8;
                    }
                  }
                  ((h) this).field_z = stackIn_63_1 + stackIn_63_2;
                  break L5;
                }
              }
            }
            L9: {
              super.a(param0, 78, param2, param3);
              if (param1 > 56) {
                break L9;
              } else {
                ((h) this).field_ab = -32;
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((oa) (Object) ((h) this).field_J).field_K) {
            L10: {
              if (!((h) this).field_S) {
                break L10;
              } else {
                L11: {
                  if (((h) this).field_ab != ((h) this).field_o) {
                    L12: {
                      var5 = -((h) this).field_o + ((h) this).field_ab;
                      stackOut_30_0 = this;
                      stackOut_30_1 = ((h) this).field_o;
                      stackIn_34_0 = stackOut_30_0;
                      stackIn_34_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_34_0 = this;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = var5 >> -1702565375;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        break L12;
                      } else {
                        stackOut_31_0 = this;
                        stackOut_31_1 = stackIn_31_1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (0 >= var5) {
                          stackOut_33_0 = this;
                          stackOut_33_1 = stackIn_33_1;
                          stackOut_33_2 = -1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L12;
                        } else {
                          stackOut_32_0 = this;
                          stackOut_32_1 = stackIn_32_1;
                          stackOut_32_2 = 1;
                          stackIn_35_0 = stackOut_32_0;
                          stackIn_35_1 = stackOut_32_1;
                          stackIn_35_2 = stackOut_32_2;
                          break L12;
                        }
                      }
                    }
                    ((h) this).field_o = stackIn_35_1 + stackIn_35_2;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (((h) this).field_z == ((h) this).field_V) {
                  break L10;
                } else {
                  L13: {
                    var5 = ((h) this).field_V - ((h) this).field_z;
                    stackOut_37_0 = this;
                    stackOut_37_1 = ((h) this).field_z;
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
                        break L13;
                      } else {
                        stackOut_40_0 = this;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L13;
                      }
                    } else {
                      stackOut_38_0 = this;
                      stackOut_38_1 = stackIn_38_1;
                      stackOut_38_2 = var5 >> -1272534719;
                      stackIn_42_0 = stackOut_38_0;
                      stackIn_42_1 = stackOut_38_1;
                      stackIn_42_2 = stackOut_38_2;
                      break L13;
                    }
                  }
                  ((h) this).field_z = stackIn_42_1 + stackIn_42_2;
                  break L10;
                }
              }
            }
            L14: {
              super.a(param0, 78, param2, param3);
              if (param1 > 56) {
                break L14;
              } else {
                ((h) this).field_ab = -32;
                break L14;
              }
            }
            return;
          } else {
            L15: {
              if (1 != ((h) this).field_w) {
                if (!((h) this).field_S) {
                  break L15;
                } else {
                  L16: {
                    if (((h) this).field_ab != ((h) this).field_o) {
                      L17: {
                        var5 = -((h) this).field_o + ((h) this).field_ab;
                        stackOut_11_0 = this;
                        stackOut_11_1 = ((h) this).field_o;
                        stackIn_15_0 = stackOut_11_0;
                        stackIn_15_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (2 < Math.abs(var5)) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = var5 >> -1702565375;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L17;
                        } else {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (0 >= var5) {
                            stackOut_14_0 = this;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = -1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            break L17;
                          } else {
                            stackOut_13_0 = this;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 1;
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_16_1 = stackOut_13_1;
                            stackIn_16_2 = stackOut_13_2;
                            break L17;
                          }
                        }
                      }
                      ((h) this).field_o = stackIn_16_1 + stackIn_16_2;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (((h) this).field_z == ((h) this).field_V) {
                    break L15;
                  } else {
                    L18: {
                      var5 = ((h) this).field_V - ((h) this).field_z;
                      stackOut_18_0 = this;
                      stackOut_18_1 = ((h) this).field_z;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if ((var5 ^ -1) >= -1) {
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
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = var5 >> -1272534719;
                        stackIn_23_0 = stackOut_19_0;
                        stackIn_23_1 = stackOut_19_1;
                        stackIn_23_2 = stackOut_19_2;
                        break L18;
                      }
                    }
                    ((h) this).field_z = stackIn_23_1 + stackIn_23_2;
                    break L15;
                  }
                }
              } else {
                L19: {
                  var5 = -((h) this).field_Z + oh.field_f - param0;
                  var6 = -param3 + (pi.field_c - ((h) this).field_R);
                  if (var5 != ((h) this).field_o) {
                    break L19;
                  } else {
                    if (var6 != ((h) this).field_z) {
                      break L19;
                    } else {
                      break L15;
                    }
                  }
                }
                ((h) this).field_z = var6;
                ((h) this).field_o = var5;
                if (!(((h) this).field_A instanceof bn)) {
                  break L15;
                } else {
                  ((bn) (Object) ((h) this).field_A).a(-107, param0, (h) this, param3);
                  break L15;
                }
              }
            }
            L20: {
              super.a(param0, 78, param2, param3);
              if (param1 > 56) {
                break L20;
              } else {
                ((h) this).field_ab = -32;
                break L20;
              }
            }
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        super.a((byte) 75, param1, param2, param3, param4, param5);
        int var7 = -101 / ((param0 - 36) / 32);
        ((h) this).field_w = 0;
    }

    public static void h(int param0) {
        if (param0 != 0) {
            return;
        }
        field_T = null;
        field_Y = null;
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new de("");
        field_X = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
