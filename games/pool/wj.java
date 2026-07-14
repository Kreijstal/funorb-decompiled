/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wj extends ud {
    private int field_O;
    private boolean field_W;
    private int field_P;
    static int field_T;
    private int field_Q;
    static String field_U;
    static int field_V;
    private int field_R;
    private boolean field_N;
    static String[] field_S;

    final static void a(int param0, boolean param1) {
        if (-1 > (hb.field_a ^ -1)) {
          if (tf.field_d) {
            L0: {
              qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
              ln.field_q.a((byte) -79, param1);
              if ((uf.field_z ^ -1) < -1) {
                if (nr.field_bb) {
                  qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                  de.field_b.a((byte) -79, param1);
                  break L0;
                } else {
                  if (param0 >= -42) {
                    wj.h(-57);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if ((nj.field_b ^ -1) >= -1) {
                  break L0;
                } else {
                  L1: {
                    if (nr.field_bb) {
                      qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                      de.field_b.a((byte) -79, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param0 >= -42) {
                    wj.h(-57);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 < -42) {
              return;
            } else {
              wj.h(-57);
              return;
            }
          } else {
            L2: {
              if ((uf.field_z ^ -1) < -1) {
                if (nr.field_bb) {
                  qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                  de.field_b.a((byte) -79, param1);
                  break L2;
                } else {
                  if (param0 >= -42) {
                    wj.h(-57);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if ((nj.field_b ^ -1) >= -1) {
                  break L2;
                } else {
                  L3: {
                    if (nr.field_bb) {
                      qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                      de.field_b.a((byte) -79, param1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param0 >= -42) {
                    wj.h(-57);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (param0 >= -42) {
              wj.h(-57);
              return;
            } else {
              return;
            }
          }
        } else {
          L4: {
            if ((uf.field_z ^ -1) < -1) {
              if (nr.field_bb) {
                qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                de.field_b.a((byte) -79, param1);
                break L4;
              } else {
                if (param0 < -42) {
                  return;
                } else {
                  wj.h(-57);
                  return;
                }
              }
            } else {
              if ((nj.field_b ^ -1) >= -1) {
                break L4;
              } else {
                L5: {
                  if (nr.field_bb) {
                    qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
                    de.field_b.a((byte) -79, param1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (param0 < -42) {
                  return;
                } else {
                  wj.h(-57);
                  return;
                }
              }
            }
          }
          if (param0 >= -42) {
            wj.h(-57);
            return;
          } else {
            return;
          }
        }
    }

    final void f(byte param0) {
        super.f(param0);
        ((wj) this).field_L.a(((wj) this).field_l, 0, ((wj) this).field_y, false, 0);
        ((wj) this).field_Q = ((wj) this).field_D;
        ((wj) this).field_P = ((wj) this).field_C;
    }

    final static void a(int param0, int param1) {
        ap.field_E = param0;
        g.field_l = new int[3];
        wb.field_e = new pn[param0 * 15];
        aa.field_e = 0;
        if (param1 > -43) {
            field_V = 16;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (param3 >= 13) {
          if (((wj) this).b(param1, param2, param0, -1)) {
            ((wj) this).a(1, param2, param0, param1);
            ((wj) this).a(param2, 3, param0, param1);
            StringBuilder discarded$4 = param0.append(" revert=").append(((wj) this).field_N);
            if (-2147483648 != (((wj) this).field_P ^ -1)) {
              if (((wj) this).field_Q != 2147483647) {
                StringBuilder discarded$5 = param0.append(" to ").append(((wj) this).field_P).append(44).append(((wj) this).field_Q);
                return param0;
              } else {
                return param0;
              }
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        } else {
          field_U = null;
          if (((wj) this).b(param1, param2, param0, -1)) {
            ((wj) this).a(1, param2, param0, param1);
            ((wj) this).a(param2, 3, param0, param1);
            StringBuilder discarded$6 = param0.append(" revert=").append(((wj) this).field_N);
            if (-2147483648 != (((wj) this).field_P ^ -1)) {
              if (((wj) this).field_Q == 2147483647) {
                return param0;
              } else {
                StringBuilder discarded$7 = param0.append(" to ").append(((wj) this).field_P).append(44).append(((wj) this).field_Q);
                return param0;
              }
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_U = null;
        if (param0 >= -33) {
            Object var2 = null;
            wj.a((di) null, 96, false, (ai) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        if (param4 < 62) {
            return;
        }
        super.a(param0, param1, param2, param3, (byte) 124, param5);
        ((wj) this).field_n = 0;
    }

    private wj(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((wj) this).field_P = 2147483647;
        ((wj) this).field_Q = 2147483647;
        ((wj) this).field_L = param6;
        ((wj) this).field_W = param8 ? true : false;
        ((wj) this).field_N = param7 ? true : false;
    }

    final static void a(di param0, int param1, boolean param2, ai param3) {
        cl.field_h = param1 * up.a(-21282) / 1000;
        if (param2) {
          field_S = null;
          q.a(param0, 102);
          oj.a(param0, (byte) -106);
          dr.a((byte) -65, param0);
          wk.a(-257);
          lm.i(23);
          im.field_fc = 0 + -cl.field_h;
          return;
        } else {
          q.a(param0, 102);
          oj.a(param0, (byte) -106);
          dr.a((byte) -65, param0);
          wk.a(-257);
          lm.i(23);
          im.field_fc = 0 + -cl.field_h;
          return;
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 == 0) {
          if (((wj) this).a(param1, param5, param6, -1, param4)) {
            ((wj) this).field_n = param3;
            if (param3 == 1) {
              ((wj) this).field_O = -param5 + -((wj) this).field_D + param4;
              ((wj) this).field_R = -param1 + (param6 + -((wj) this).field_C);
              uh.field_u = (wj) this;
              return true;
            } else {
              return true;
            }
          } else {
            return var8 != 0;
          }
        } else {
          if (!((wj) this).field_W) {
            if (((wj) this).a(param1, param5, param6, -1, param4)) {
              ((wj) this).field_n = param3;
              if (param3 != 1) {
                return true;
              } else {
                ((wj) this).field_O = -param5 + -((wj) this).field_D + param4;
                ((wj) this).field_R = -param1 + (param6 + -((wj) this).field_C);
                uh.field_u = (wj) this;
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

    final void a(ei param0, int param1, int param2, int param3) {
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
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
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
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
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
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        if (!(((wj) this).field_L instanceof fe)) {
          if ((((wj) this).field_n ^ -1) == -2) {
            var5 = -((wj) this).field_R + wn.field_i + -param2;
            var6 = gg.field_f + -((wj) this).field_O - param3;
            if (var5 == ((wj) this).field_C) {
              if (((wj) this).field_D == var6) {
                if (param1 != 958) {
                  return;
                } else {
                  super.a(param0, param1 + 0, param2, param3);
                  return;
                }
              } else {
                ((wj) this).field_D = var6;
                ((wj) this).field_C = var5;
                if (!(((wj) this).field_t instanceof gb)) {
                  if (param1 != 958) {
                    return;
                  } else {
                    super.a(param0, param1 + 0, param2, param3);
                    return;
                  }
                } else {
                  ((gb) (Object) ((wj) this).field_t).a((wj) this, (byte) 81, param3, param2);
                  if (param1 != 958) {
                    return;
                  } else {
                    super.a(param0, param1 + 0, param2, param3);
                    return;
                  }
                }
              }
            } else {
              ((wj) this).field_D = var6;
              ((wj) this).field_C = var5;
              if (!(((wj) this).field_t instanceof gb)) {
                if (param1 != 958) {
                  return;
                } else {
                  super.a(param0, param1 + 0, param2, param3);
                  return;
                }
              } else {
                ((gb) (Object) ((wj) this).field_t).a((wj) this, (byte) 81, param3, param2);
                if (param1 != 958) {
                  return;
                } else {
                  super.a(param0, param1 + 0, param2, param3);
                  return;
                }
              }
            }
          } else {
            L0: {
              if (((wj) this).field_N) {
                L1: {
                  if (((wj) this).field_P != ((wj) this).field_C) {
                    L2: {
                      var5 = -((wj) this).field_C + ((wj) this).field_P;
                      stackOut_57_0 = this;
                      stackOut_57_1 = ((wj) this).field_C;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        if (0 < var5) {
                          stackOut_61_0 = this;
                          stackOut_61_1 = stackIn_61_1;
                          stackOut_61_2 = 1;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          break L2;
                        } else {
                          stackOut_60_0 = this;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = -1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          stackIn_62_2 = stackOut_60_2;
                          break L2;
                        }
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = stackIn_58_1;
                        stackOut_58_2 = var5 >> -258355295;
                        stackIn_62_0 = stackOut_58_0;
                        stackIn_62_1 = stackOut_58_1;
                        stackIn_62_2 = stackOut_58_2;
                        break L2;
                      }
                    }
                    ((wj) this).field_C = stackIn_62_1 + stackIn_62_2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((wj) this).field_Q != ((wj) this).field_D) {
                  L3: {
                    var5 = -((wj) this).field_D + ((wj) this).field_Q;
                    stackOut_65_0 = this;
                    stackOut_65_1 = ((wj) this).field_D;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (-3 <= (Math.abs(var5) ^ -1)) {
                      stackOut_67_0 = this;
                      stackOut_67_1 = stackIn_67_1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_69_0 = this;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = -1;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        break L3;
                      } else {
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_70_2 = stackOut_68_2;
                        break L3;
                      }
                    } else {
                      stackOut_66_0 = this;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = var5 >> -792362175;
                      stackIn_70_0 = stackOut_66_0;
                      stackIn_70_1 = stackOut_66_1;
                      stackIn_70_2 = stackOut_66_2;
                      break L3;
                    }
                  }
                  ((wj) this).field_D = stackIn_70_1 + stackIn_70_2;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (param1 != 958) {
              return;
            } else {
              super.a(param0, param1 + 0, param2, param3);
              return;
            }
          }
        } else {
          if (((fe) (Object) ((wj) this).field_L).field_I) {
            L4: {
              if ((((wj) this).field_n ^ -1) != -2) {
                if (((wj) this).field_N) {
                  L5: {
                    if (((wj) this).field_P != ((wj) this).field_C) {
                      L6: {
                        var5 = -((wj) this).field_C + ((wj) this).field_P;
                        stackOut_34_0 = this;
                        stackOut_34_1 = ((wj) this).field_C;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if ((Math.abs(var5) ^ -1) >= -3) {
                          stackOut_36_0 = this;
                          stackOut_36_1 = stackIn_36_1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (0 < var5) {
                            stackOut_38_0 = this;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = 1;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L6;
                          } else {
                            stackOut_37_0 = this;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = -1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L6;
                          }
                        } else {
                          stackOut_35_0 = this;
                          stackOut_35_1 = stackIn_35_1;
                          stackOut_35_2 = var5 >> -258355295;
                          stackIn_39_0 = stackOut_35_0;
                          stackIn_39_1 = stackOut_35_1;
                          stackIn_39_2 = stackOut_35_2;
                          break L6;
                        }
                      }
                      ((wj) this).field_C = stackIn_39_1 + stackIn_39_2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((wj) this).field_Q != ((wj) this).field_D) {
                    L7: {
                      var5 = -((wj) this).field_D + ((wj) this).field_Q;
                      stackOut_42_0 = this;
                      stackOut_42_1 = ((wj) this).field_D;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      if (-3 <= (Math.abs(var5) ^ -1)) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = stackIn_44_1;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_46_0 = this;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = -1;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          break L7;
                        } else {
                          stackOut_45_0 = this;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_47_2 = stackOut_45_2;
                          break L7;
                        }
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = var5 >> -792362175;
                        stackIn_47_0 = stackOut_43_0;
                        stackIn_47_1 = stackOut_43_1;
                        stackIn_47_2 = stackOut_43_2;
                        break L7;
                      }
                    }
                    ((wj) this).field_D = stackIn_47_1 + stackIn_47_2;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                L8: {
                  var5 = -((wj) this).field_R + wn.field_i + -param2;
                  var6 = gg.field_f + -((wj) this).field_O - param3;
                  if (var5 != ((wj) this).field_C) {
                    break L8;
                  } else {
                    if (((wj) this).field_D != var6) {
                      break L8;
                    } else {
                      break L4;
                    }
                  }
                }
                ((wj) this).field_D = var6;
                ((wj) this).field_C = var5;
                if (!(((wj) this).field_t instanceof gb)) {
                  break L4;
                } else {
                  ((gb) (Object) ((wj) this).field_t).a((wj) this, (byte) 81, param3, param2);
                  break L4;
                }
              }
            }
            if (param1 != 958) {
              return;
            } else {
              super.a(param0, param1 + 0, param2, param3);
              return;
            }
          } else {
            L9: {
              if (((wj) this).field_N) {
                L10: {
                  if (((wj) this).field_P != ((wj) this).field_C) {
                    L11: {
                      var5 = -((wj) this).field_C + ((wj) this).field_P;
                      stackOut_6_0 = this;
                      stackOut_6_1 = ((wj) this).field_C;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if ((Math.abs(var5) ^ -1) >= -3) {
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
                          break L11;
                        } else {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = -1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          break L11;
                        }
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = var5 >> -258355295;
                        stackIn_11_0 = stackOut_7_0;
                        stackIn_11_1 = stackOut_7_1;
                        stackIn_11_2 = stackOut_7_2;
                        break L11;
                      }
                    }
                    ((wj) this).field_C = stackIn_11_1 + stackIn_11_2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (((wj) this).field_Q != ((wj) this).field_D) {
                  L12: {
                    var5 = -((wj) this).field_D + ((wj) this).field_Q;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((wj) this).field_D;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (-3 <= (Math.abs(var5) ^ -1)) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = -1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L12;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L12;
                      }
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = var5 >> -792362175;
                      stackIn_19_0 = stackOut_15_0;
                      stackIn_19_1 = stackOut_15_1;
                      stackIn_19_2 = stackOut_15_2;
                      break L12;
                    }
                  }
                  ((wj) this).field_D = stackIn_19_1 + stackIn_19_2;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            if (param1 != 958) {
              return;
            } else {
              super.a(param0, param1 + 0, param2, param3);
              return;
            }
          }
        }
    }

    final static boolean i(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (null == sa.field_f) {
            if (fm.field_H) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_S = null;
          if (null != sa.field_f) {
            return true;
          } else {
            L0: {
              if (!fm.field_H) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "You<%0> have all resigned!";
    }
}
