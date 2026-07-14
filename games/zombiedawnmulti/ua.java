/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ua extends rg {
    private boolean field_O;
    static re field_I;
    private boolean field_H;
    private int field_G;
    private int field_M;
    private int field_L;
    private int field_F;
    static String field_K;
    static cj field_E;
    static int field_N;

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (param0 == 7) {
          if (((ua) this).a(param1, param0 ^ 126, param3, param2)) {
            ((ua) this).a(param2, param3, (byte) 26, param1);
            ((ua) this).a(param1, true, param3, param2);
            StringBuilder discarded$23 = param3.append(" revert=").append(((ua) this).field_H);
            if (((ua) this).field_G != 2147483647) {
              if ((((ua) this).field_M ^ -1) == -2147483648) {
                return param3;
              } else {
                StringBuilder discarded$24 = param3.append(" to ").append(((ua) this).field_G).append(44).append(((ua) this).field_M);
                return param3;
              }
            } else {
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          return null;
        }
    }

    final static int h(int param0) {
        int var1 = 0;
        var1 = -104 % ((59 - param0) / 49);
        tj.field_a.b(0);
        if (!i.field_a.b((byte) 99)) {
          return ch.b(19352);
        } else {
          return 0;
        }
    }

    public static void g(byte param0) {
        field_E = null;
        field_I = null;
        field_K = null;
        if (param0 >= -12) {
            field_K = null;
        }
    }

    final void a(int param0) {
        super.a(param0);
        ((ua) this).field_B.b(0, 0, 28972, ((ua) this).field_n, ((ua) this).field_w);
        ((ua) this).field_G = ((ua) this).field_y;
        ((ua) this).field_M = ((ua) this).field_i;
    }

    final static String a(byte param0, int param1, String param2) {
        Object var4 = null;
        if ((param1 ^ -1) != -2) {
          if (param1 != -3) {
            if (-4 != param1) {
              if (param0 == -61) {
                if (4 == param1) {
                  return vl.a(fh.field_f, new String[1], 2);
                } else {
                  if ((param1 ^ -1) != -6) {
                    if ((param1 ^ -1) == -7) {
                      return vl.a(ik.field_e, new String[1], 2);
                    } else {
                      if ((param1 ^ -1) == -8) {
                        return vl.a(sf.field_c, new String[1], 2);
                      } else {
                        if (8 != param1) {
                          if ((param1 ^ -1) != -12) {
                            if (param1 != 12) {
                              if (13 != param1) {
                                return null;
                              } else {
                                return vl.a(qk.field_i, new String[1], param0 + 63);
                              }
                            } else {
                              return vl.a(oa.field_b, new String[1], param0 + 63);
                            }
                          } else {
                            return vl.a(qh.field_b, new String[1], 2);
                          }
                        } else {
                          return vl.a(tq.field_Fb, new String[1], 2);
                        }
                      }
                    }
                  } else {
                    return vl.a(un.field_l, new String[1], 2);
                  }
                }
              } else {
                var4 = null;
                ua.a((ul) null, (ul) null, (byte) 0);
                if (4 == param1) {
                  return vl.a(fh.field_f, new String[1], 2);
                } else {
                  if ((param1 ^ -1) != -6) {
                    if ((param1 ^ -1) == -7) {
                      return vl.a(ik.field_e, new String[1], 2);
                    } else {
                      if ((param1 ^ -1) == -8) {
                        return vl.a(sf.field_c, new String[1], 2);
                      } else {
                        if (8 != param1) {
                          if ((param1 ^ -1) != -12) {
                            if (param1 != 12) {
                              if (13 != param1) {
                                return null;
                              } else {
                                return vl.a(qk.field_i, new String[1], param0 + 63);
                              }
                            } else {
                              return vl.a(oa.field_b, new String[1], param0 + 63);
                            }
                          } else {
                            return vl.a(qh.field_b, new String[1], 2);
                          }
                        } else {
                          return vl.a(tq.field_Fb, new String[1], 2);
                        }
                      }
                    }
                  } else {
                    return vl.a(un.field_l, new String[1], 2);
                  }
                }
              }
            } else {
              return vl.a(ki.field_l, new String[1], 2);
            }
          } else {
            return vl.a(qb.field_o, new String[1], 2);
          }
        } else {
          return vl.a(oe.field_e, new String[1], 2);
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((ua) this).field_O) {
            if (((ua) this).a(-94, param5, param1, param0, param6)) {
              ((ua) this).field_u = param2;
              if (1 == param2) {
                qi.field_a = (ua) this;
                ((ua) this).field_F = -param6 + (-((ua) this).field_i + param0);
                ((ua) this).field_L = -param5 + (-((ua) this).field_y + param1);
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
          if (((ua) this).a(-94, param5, param1, param0, param6)) {
            ((ua) this).field_u = param2;
            if (1 == param2) {
              qi.field_a = (ua) this;
              ((ua) this).field_F = -param6 + (-((ua) this).field_i + param0);
              ((ua) this).field_L = -param5 + (-((ua) this).field_y + param1);
              return true;
            } else {
              return true;
            }
          } else {
            return var8 != 0;
          }
        }
    }

    final static void i(int param0) {
        L0: {
          if (h.field_L != null) {
            h.field_L.m(-7435);
            break L0;
          } else {
            break L0;
          }
        }
        qe.field_e = new cp();
        if (param0 != -2) {
          int discarded$2 = ua.h(-84);
          wj.field_i.a((cf) (Object) qe.field_e, (byte) 123);
          return;
        } else {
          wj.field_i.a((cf) (Object) qe.field_e, (byte) 123);
          return;
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((ua) this).field_u = 0;
    }

    private ua(int param0, int param1, int param2, int param3, nl param4, bj param5, cf param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((ua) this).field_M = 2147483647;
        ((ua) this).field_G = 2147483647;
        ((ua) this).field_H = param7 ? true : false;
        ((ua) this).field_B = param6;
        ((ua) this).field_O = param8 ? true : false;
    }

    final static void a(ul param0, ul param1, byte param2) {
        if (param2 != 23) {
            field_N = 91;
            lb.field_d = param0;
            pl.field_C = param1;
            return;
        }
        lb.field_d = param0;
        pl.field_C = param1;
    }

    final void a(int param0, cf param1, int param2, int param3) {
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
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
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
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
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
        if (((ua) this).field_B instanceof gn) {
          if (((gn) (Object) ((ua) this).field_B).field_F) {
            if ((((ua) this).field_u ^ -1) == -2) {
              var5 = -((ua) this).field_L + (bd.field_g + -param2);
              var6 = -param3 + (-((ua) this).field_F + bo.field_d);
              if (((ua) this).field_y != var5) {
                ((ua) this).field_i = var6;
                ((ua) this).field_y = var5;
                if (((ua) this).field_A instanceof ad) {
                  ((ad) (Object) ((ua) this).field_A).a(param2, false, (ua) this, param3);
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                if (((ua) this).field_i != var6) {
                  ((ua) this).field_i = var6;
                  ((ua) this).field_y = var5;
                  if (!(((ua) this).field_A instanceof ad)) {
                    super.a(param0, param1, param2, param3);
                    return;
                  } else {
                    ((ad) (Object) ((ua) this).field_A).a(param2, false, (ua) this, param3);
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              }
            } else {
              if (((ua) this).field_H) {
                L0: {
                  if (((ua) this).field_G != ((ua) this).field_y) {
                    L1: {
                      var5 = ((ua) this).field_G + -((ua) this).field_y;
                      stackOut_61_0 = this;
                      stackOut_61_1 = ((ua) this).field_y;
                      stackIn_63_0 = stackOut_61_0;
                      stackIn_63_1 = stackOut_61_1;
                      stackIn_62_0 = stackOut_61_0;
                      stackIn_62_1 = stackOut_61_1;
                      if (Math.abs(var5) <= 2) {
                        stackOut_63_0 = this;
                        stackOut_63_1 = stackIn_63_1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (0 < var5) {
                          stackOut_65_0 = this;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = 1;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          stackIn_66_2 = stackOut_65_2;
                          break L1;
                        } else {
                          stackOut_64_0 = this;
                          stackOut_64_1 = stackIn_64_1;
                          stackOut_64_2 = -1;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          stackIn_66_2 = stackOut_64_2;
                          break L1;
                        }
                      } else {
                        stackOut_62_0 = this;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = var5 >> 2135042977;
                        stackIn_66_0 = stackOut_62_0;
                        stackIn_66_1 = stackOut_62_1;
                        stackIn_66_2 = stackOut_62_2;
                        break L1;
                      }
                    }
                    ((ua) this).field_y = stackIn_66_1 + stackIn_66_2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((ua) this).field_M != ((ua) this).field_i) {
                  L2: {
                    L3: {
                      var5 = ((ua) this).field_M + -((ua) this).field_i;
                      stackOut_69_0 = this;
                      stackOut_69_1 = ((ua) this).field_i;
                      stackIn_73_0 = stackOut_69_0;
                      stackIn_73_1 = stackOut_69_1;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      if (2 < Math.abs(var5)) {
                        stackOut_73_0 = this;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = var5 >> -1034321183;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        break L3;
                      } else {
                        stackOut_70_0 = this;
                        stackOut_70_1 = stackIn_70_1;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        if ((var5 ^ -1) < -1) {
                          stackOut_72_0 = this;
                          stackOut_72_1 = stackIn_72_1;
                          stackOut_72_2 = 1;
                          stackIn_74_0 = stackOut_72_0;
                          stackIn_74_1 = stackOut_72_1;
                          stackIn_74_2 = stackOut_72_2;
                          break L3;
                        } else {
                          ((ua) this).field_i = stackIn_71_1 + -1;
                          break L2;
                        }
                      }
                    }
                    ((ua) this).field_i = stackIn_74_1 + stackIn_74_2;
                    break L2;
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
            if (((ua) this).field_H) {
              L4: {
                if (((ua) this).field_G != ((ua) this).field_y) {
                  L5: {
                    var5 = ((ua) this).field_G + -((ua) this).field_y;
                    stackOut_40_0 = this;
                    stackOut_40_1 = ((ua) this).field_y;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (0 < var5) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackOut_44_2 = 1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        break L5;
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = -1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        stackIn_45_2 = stackOut_43_2;
                        break L5;
                      }
                    } else {
                      stackOut_41_0 = this;
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = var5 >> 2135042977;
                      stackIn_45_0 = stackOut_41_0;
                      stackIn_45_1 = stackOut_41_1;
                      stackIn_45_2 = stackOut_41_2;
                      break L5;
                    }
                  }
                  ((ua) this).field_y = stackIn_45_1 + stackIn_45_2;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((ua) this).field_M == ((ua) this).field_i) {
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L6: {
                  L7: {
                    var5 = ((ua) this).field_M + -((ua) this).field_i;
                    stackOut_47_0 = this;
                    stackOut_47_1 = ((ua) this).field_i;
                    stackIn_51_0 = stackOut_47_0;
                    stackIn_51_1 = stackOut_47_1;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_51_0 = this;
                      stackOut_51_1 = stackIn_51_1;
                      stackOut_51_2 = var5 >> -1034321183;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      stackIn_52_2 = stackOut_51_2;
                      break L7;
                    } else {
                      stackOut_48_0 = this;
                      stackOut_48_1 = stackIn_48_1;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      if ((var5 ^ -1) < -1) {
                        stackOut_50_0 = this;
                        stackOut_50_1 = stackIn_50_1;
                        stackOut_50_2 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_52_2 = stackOut_50_2;
                        break L7;
                      } else {
                        ((ua) this).field_i = stackIn_49_1 + -1;
                        break L6;
                      }
                    }
                  }
                  ((ua) this).field_i = stackIn_52_1 + stackIn_52_2;
                  break L6;
                }
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          }
        } else {
          if ((((ua) this).field_u ^ -1) == -2) {
            var5 = -((ua) this).field_L + (bd.field_g + -param2);
            var6 = -param3 + (-((ua) this).field_F + bo.field_d);
            if (((ua) this).field_y != var5) {
              ((ua) this).field_i = var6;
              ((ua) this).field_y = var5;
              if (((ua) this).field_A instanceof ad) {
                ((ad) (Object) ((ua) this).field_A).a(param2, false, (ua) this, param3);
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              if (((ua) this).field_i != var6) {
                ((ua) this).field_i = var6;
                ((ua) this).field_y = var5;
                if (!(((ua) this).field_A instanceof ad)) {
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  ((ad) (Object) ((ua) this).field_A).a(param2, false, (ua) this, param3);
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          } else {
            if (((ua) this).field_H) {
              L8: {
                if (((ua) this).field_G != ((ua) this).field_y) {
                  L9: {
                    var5 = ((ua) this).field_G + -((ua) this).field_y;
                    stackOut_6_0 = this;
                    stackOut_6_1 = ((ua) this).field_y;
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
                      if (0 < var5) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L9;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = -1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L9;
                      }
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = var5 >> 2135042977;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_11_2 = stackOut_7_2;
                      break L9;
                    }
                  }
                  ((ua) this).field_y = stackIn_11_1 + stackIn_11_2;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (((ua) this).field_M != ((ua) this).field_i) {
                L10: {
                  L11: {
                    var5 = ((ua) this).field_M + -((ua) this).field_i;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((ua) this).field_i;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> -1034321183;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L11;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if ((var5 ^ -1) < -1) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L11;
                      } else {
                        ((ua) this).field_i = stackIn_16_1 + -1;
                        break L10;
                      }
                    }
                  }
                  ((ua) this).field_i = stackIn_19_1 + stackIn_19_2;
                  break L10;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Resume Game";
        field_I = new re();
    }
}
