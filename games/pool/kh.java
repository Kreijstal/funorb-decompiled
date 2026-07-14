/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends vh {
    int field_Fc;
    boolean field_wc;
    int field_mc;
    vh field_hc;
    int field_Yb;
    byte[] field_tc;
    String[] field_bc;
    vh field_Lb;
    int field_ac;
    vh field_jc;
    vh field_cc;
    vh field_xc;
    static boolean field_Ac;
    boolean field_Dc;
    vh field_Rb;
    vh field_nc;
    boolean field_ic;
    static int field_yc;
    vh field_Sb;
    long field_Zb;
    String field_Ob;
    static int field_Pb;
    vh field_Bc;
    static int field_vc;
    int field_Mb;
    vh field_kc;
    boolean field_Xb;
    static int field_oc;
    int field_pc;
    vh field_Tb;
    vh field_Ec;
    vh field_zc;
    static oo field_gc;
    static boolean[] field_rc;
    boolean field_Qb;
    vh field_lc;
    boolean field_ec;
    long field_sc;
    boolean field_fc;
    vh[] field_Ub;
    vh field_Cc;
    int field_Nb;
    static int field_Gc;
    vh field_dc;
    int field_qc;
    static vh field_Vb;
    static int field_Wb;
    static int field_uc;

    final static short[] a(int param0, short[] param1, byte param2, oq param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          if (param2 > 88) {
            break L0;
          } else {
            var8 = null;
            short[] discarded$2 = kh.a(8, (short[]) null, (byte) 40, (oq) null);
            break L0;
          }
        }
        var4 = param3.e(param0, 89);
        if (var4 != 0) {
          L1: {
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length == var4) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param1 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param3.e(4, 45);
            var6 = (short)param3.e(16, 18);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param1[var7] = (short)(var6 + param3.e(var5, 103));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final static void f(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          ep.field_z = false;
          oa.field_d = null;
          var1 = -42 % ((-1 - param0) / 38);
          if (!ro.field_e) {
            var2 = no.field_l;
            if ((var2 ^ -1) < -1) {
              if (1 == var2) {
                oa.field_d = vd.field_m;
                oa.field_d = aq.a(-54, new CharSequence[3]);
                d.field_d.k(17);
                ci.d((byte) -126);
                break L0;
              } else {
                oa.field_d = nr.a(new String[1], -1, sa.field_d);
                oa.field_d = aq.a(-54, new CharSequence[3]);
                d.field_d.k(17);
                ci.d((byte) -126);
                break L0;
              }
            } else {
              d.field_d.k(17);
              ci.d((byte) -126);
              break L0;
            }
          } else {
            d.field_d.m((byte) -33);
            break L0;
          }
        }
    }

    final boolean f(int param0) {
        if (param0 != -14144) {
            field_Gc = -5;
        }
        return !((kh) this).d(param0 ^ -14186) ? true : false;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 > 18) {
          L0: {
            L1: {
              if (param0 < 48) {
                break L1;
              } else {
                if (57 < param0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    kh(int param0) {
        super(0L, (vh) null);
        ((kh) this).field_tc = new byte[param0];
    }

    public static void g(byte param0) {
        field_rc = null;
        field_gc = null;
        field_Vb = null;
        if (param0 != -124) {
            field_Vb = null;
        }
    }

    final static boolean a(int param0, eg param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var3 = 0;
        if (param0 == -3) {
          L0: while (true) {
            if (param1.field_K <= var3) {
              return false;
            } else {
              L1: {
                if (param1.field_Q == null) {
                  break L1;
                } else {
                  if ((param1.field_Q[var3] ^ -1) != -3) {
                    break L1;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              L2: {
                if (param2 == param1.field_N[var3]) {
                  break L2;
                } else {
                  if (param2 == param1.field_v[var3]) {
                    break L2;
                  } else {
                    if (param2 == param1.field_X[var3]) {
                      return true;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
              }
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static qb a(int param0, int param1, byte param2, di param3) {
        int var4 = -89 / ((-33 - param2) / 51);
        if (!vj.a(param1, param3, param0, (byte) 121)) {
            return null;
        }
        return fo.a((byte) -23);
    }

    final int g(int param0) {
        if (param0 != 20872) {
            ((kh) this).field_Dc = true;
        }
        return (int)((kh) this).a(-127);
    }

    final boolean a(kh param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            ((kh) this).field_Zb = 52L;
            break L0;
          }
        }
        L1: {
          if (!((kh) this).field_Xb) {
            if (6 == ((kh) this).field_Fc) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_8_0;
          if (!param0.field_Xb) {
            if (param0.field_Fc == 6) {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L2;
            } else {
              stackOut_11_0 = 0;
              stackIn_14_0 = stackOut_11_0;
              break L2;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_14_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_14_0;
          if (var4 != 0) {
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            break L3;
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            break L3;
          }
        }
        if (stackIn_17_0 != var3) {
          L4: {
            if (var3 == 0) {
              if (((kh) this).field_ic != param0.field_ic) {
                return ((kh) this).field_ic;
              } else {
                if (!((kh) this).field_ic) {
                  break L4;
                } else {
                  if (((kh) this).field_ac != param0.field_ac) {
                    L5: {
                      if (((kh) this).field_ac >= param0.field_ac) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L5;
                      }
                    }
                    return stackIn_30_0 != 0;
                  } else {
                    break L4;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          L6: {
            if (param0.field_ec) {
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              break L6;
            } else {
              stackOut_32_0 = 1;
              stackIn_34_0 = stackOut_32_0;
              break L6;
            }
          }
          L7: {
            stackOut_34_0 = stackIn_34_0;
            stackIn_36_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (((kh) this).field_ec) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = 0;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              break L7;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = 1;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              break L7;
            }
          }
          if (stackIn_37_0 != stackIn_37_1) {
            L8: {
              if (((kh) this).field_ec) {
                stackOut_41_0 = 0;
                stackIn_42_0 = stackOut_41_0;
                break L8;
              } else {
                stackOut_40_0 = 1;
                stackIn_42_0 = stackOut_40_0;
                break L8;
              }
            }
            return stackIn_42_0 != 0;
          } else {
            if (!((kh) this).field_ec) {
              L9: {
                if ((((kh) this).field_sc ^ -1L) <= (param0.field_sc ^ -1L)) {
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  break L9;
                } else {
                  stackOut_66_0 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  break L9;
                }
              }
              return stackIn_68_0 != 0;
            } else {
              L10: {
                if (((kh) this).field_Dc) {
                  stackOut_48_0 = 1;
                  stackIn_50_0 = stackOut_48_0;
                  break L10;
                } else {
                  if (2 == ((kh) this).field_Yb) {
                    stackOut_47_0 = 1;
                    stackIn_50_0 = stackOut_47_0;
                    break L10;
                  } else {
                    stackOut_46_0 = 0;
                    stackIn_50_0 = stackOut_46_0;
                    break L10;
                  }
                }
              }
              L11: {
                var5 = stackIn_50_0;
                if (!param0.field_Dc) {
                  if (2 == param0.field_Yb) {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L11;
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_56_0 = stackOut_53_0;
                    break L11;
                  }
                } else {
                  stackOut_51_0 = 1;
                  stackIn_56_0 = stackOut_51_0;
                  break L11;
                }
              }
              L12: {
                var6 = stackIn_56_0;
                if (var6 != 0) {
                  stackOut_58_0 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  break L12;
                } else {
                  stackOut_57_0 = 1;
                  stackIn_59_0 = stackOut_57_0;
                  break L12;
                }
              }
              if (stackIn_59_0 != var5) {
                L13: {
                  if (((kh) this).field_sc <= param0.field_sc) {
                    stackOut_63_0 = 0;
                    stackIn_64_0 = stackOut_63_0;
                    break L13;
                  } else {
                    stackOut_62_0 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    break L13;
                  }
                }
                return stackIn_64_0 != 0;
              } else {
                return var5 != 0;
              }
            }
          }
        } else {
          return var3 != 0;
        }
    }

    final static void a(String param0, vj param1, int param2, int param3, lr param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Pool.field_O;
          var5 = 0;
          if (param2 == 6110) {
            break L0;
          } else {
            kh.g((byte) -86);
            break L0;
          }
        }
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param0.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param0.charAt(var7);
              if (var8 == 60) {
                var6 = (var5 >> 541678536) + param1.field_h[0] - -param4.b(param0.substring(0, var7));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var6 == -1) {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param3;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param1.field_h[var7] = param1.field_h[0] + (var5 >> 1924636424) - -param4.b(param0.substring(0, 1 + var7)) - param4.a((char) var8);
                break L3;
              } else {
                param1.field_h[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vc = 450;
        field_oc = 4;
        field_Pb = 200;
        field_Gc = -1;
        field_Vb = null;
    }
}
