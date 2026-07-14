/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ug {
    private boolean field_P;
    private vb field_R;
    private vb field_O;
    private vb field_M;
    static nc[] field_L;
    static String field_N;
    static vl field_Q;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, param2, (byte) -119, param4);
        var6 = -130 + param4 >> 1701124769;
        if (((na) this).field_P) {
          ((na) this).field_M.a(param0, var6, 0, (byte) -119, 25);
          ((na) this).field_R.a(param0, 45 + var6, 0, (byte) -119, 25);
          ((na) this).field_O.a(param0, 90 + var6, 0, param3, 40);
          return;
        } else {
          ((na) this).field_R.a(param0, var6, 0, (byte) -119, 25);
          ((na) this).field_M.a(param0, var6 - -45, 0, (byte) -119, 25);
          ((na) this).field_O.a(param0, 90 + var6, 0, param3, 40);
          return;
        }
    }

    final String d(int param0) {
        String var2 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackOut_14_0;
        String stackOut_13_0;
        String stackOut_7_0;
        String stackOut_6_0;
        var2 = ((na) this).field_M.d(77);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 > 6) {
            if (!((na) this).field_q) {
              return null;
            } else {
              L0: {
                if (((na) this).field_z != null) {
                  stackOut_14_0 = ((na) this).field_z;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = ((na) this).field_A;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return (String) (Object) stackIn_15_0;
            }
          } else {
            boolean discarded$6 = na.j((byte) -82);
            if (!((na) this).field_q) {
              return null;
            } else {
              L1: {
                if (((na) this).field_z != null) {
                  stackOut_7_0 = ((na) this).field_z;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = ((na) this).field_A;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              return (String) (Object) stackIn_8_0;
            }
          }
        }
    }

    final void a(an param0, byte param1) {
        super.a(param0, param1);
        ((na) this).field_R.field_i = (uh) (Object) param0;
        ((na) this).field_M.field_i = (uh) (Object) param0;
        ((na) this).field_O.field_i = (uh) (Object) param0;
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0;
        L0: {
          if (param0 == 5390) {
            break L0;
          } else {
            ((na) this).field_M = null;
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((na) this).field_O.field_A);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final static jp[] a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        jp var9 = null;
        jp var10 = null;
        jp var11 = null;
        jp var12 = null;
        jp var13 = null;
        jp var14 = null;
        int[] var15 = null;
        jp var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = lb.field_l;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = lb.field_c;
          var8 = lb.field_d;
          var9 = new jp(param2, param4 - param2 * 2);
          var9.g();
          lb.g(0, 0, param2, param4 - param2 * 2, param3, param1);
          var10 = new jp(param2, param2);
          var10.g();
          lb.g(0, 0, param2, param2, param3);
          var11 = new jp(16, param2);
          var11.g();
          lb.g(0, 0, 16, param2, param3);
          var12 = new jp(param2, param2);
          var12.g();
          lb.g(0, 0, param2, param2, param1);
          var13 = new jp(16, param2);
          var13.g();
          lb.g(0, 0, 16, param2, param1);
          var14 = null;
          if (0 >= param5) {
            break L0;
          } else {
            var16 = new jp(16, 16);
            var14 = var16;
            var16.g();
            lb.g(0, 0, 16, 16, param5);
            break L0;
          }
        }
        lb.a(var20, var7, var8);
        if (param0) {
          jp[] discarded$1 = na.a(false, 118, 124, -92, 47, -40);
          return new jp[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
        } else {
          return new jp[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
        }
    }

    private na(ub param0, boolean param1) {
        super(0, 0, 0, 0, (ub) null);
        ((na) this).field_R = (vb) (Object) new sf("", (uh) null, 2);
        ((na) this).field_M = (vb) (Object) new sf("", (uh) null, 2);
        ((na) this).field_O = (vb) (Object) new sf("", (uh) null, 4);
        ((na) this).field_O.field_l = param0;
        ((na) this).field_M.field_l = param0;
        ((na) this).field_R.field_l = param0;
        ((na) this).field_P = param1 ? true : false;
        if (!((na) this).field_P) {
            ((na) this).a((oc) (Object) ((na) this).field_R, true);
            ((na) this).a((oc) (Object) ((na) this).field_M, true);
        } else {
            ((na) this).a((oc) (Object) ((na) this).field_M, true);
            ((na) this).a((oc) (Object) ((na) this).field_R, true);
        }
        ((na) this).a((oc) (Object) ((na) this).field_O, true);
    }

    final static boolean j(byte param0) {
        if (param0 == -60) {
          if (tn.field_m != null) {
            if (!tn.field_m.h(param0 ^ -55)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          jp[] discarded$10 = na.a(true, 76, -125, -71, 104, -123);
          if (tn.field_m != null) {
            if (!tn.field_m.h(param0 ^ -55)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean h(byte param0) {
        if (null == ((na) this).field_R.field_A) {
            return true;
        }
        if (0 == ((na) this).field_R.field_A.length()) {
            return true;
        }
        if (((na) this).field_M.field_A == null) {
            return true;
        }
        if (((na) this).field_M.field_A.length() == 0) {
            return true;
        }
        if (param0 != -124) {
            field_Q = null;
            if (((na) this).field_O.field_A != null) {
                // if_icmpeq L98
            } else {
                return true;
            }
            return false;
        }
        if (((na) this).field_O.field_A != null) {
            // if_icmpeq L129
        } else {
            return true;
        }
        return false;
    }

    private final void a(oc param0, String param1, byte param2, int param3, int param4) {
        og.field_Yb.b(param1, param3 - -param0.field_o + (param0.field_t >> 475251105), param0.field_w + (param4 + -5), 16777215, -1);
        int var6 = -127 % ((-2 - param2) / 59);
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        g.field_n.field_X = param4;
        g.field_n.field_Cb = param1;
        g.field_n.field_Mb = param2;
        g.field_n.field_Ib = g.field_n.field_Ib + ap.field_e.field_Ib;
        ap.field_e.field_P = ap.field_e.field_P + ap.field_e.field_Ib;
        ap.field_e.field_Ib = param3;
        if (param0 >= -72) {
          na.a(true, true, 77, -47);
          g.field_n.field_Ib = g.field_n.field_Ib - ap.field_e.field_Ib;
          ap.field_e.field_P = ap.field_e.field_P - ap.field_e.field_Ib;
          return;
        } else {
          g.field_n.field_Ib = g.field_n.field_Ib - ap.field_e.field_Ib;
          ap.field_e.field_P = ap.field_e.field_P - ap.field_e.field_Ib;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        mh stackIn_2_0 = null;
        mh stackIn_3_0 = null;
        mh stackIn_4_0 = null;
        mh stackIn_5_0 = null;
        mh stackIn_6_0 = null;
        mh stackIn_7_0 = null;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mh stackIn_9_0 = null;
        mh stackIn_10_0 = null;
        mh stackIn_11_0 = null;
        mh stackIn_12_0 = null;
        mh stackIn_13_0 = null;
        mh stackIn_14_0 = null;
        mh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        mh stackIn_16_0 = null;
        mh stackIn_17_0 = null;
        mh stackIn_18_0 = null;
        mh stackIn_19_0 = null;
        mh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mh stackIn_43_0 = null;
        mh stackIn_44_0 = null;
        mh stackIn_45_0 = null;
        mh stackIn_46_0 = null;
        mh stackIn_47_0 = null;
        mh stackIn_48_0 = null;
        mh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        mh stackIn_50_0 = null;
        mh stackIn_51_0 = null;
        mh stackIn_52_0 = null;
        mh stackIn_53_0 = null;
        mh stackIn_54_0 = null;
        mh stackIn_55_0 = null;
        mh stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        mh stackIn_57_0 = null;
        mh stackIn_58_0 = null;
        mh stackIn_59_0 = null;
        mh stackIn_60_0 = null;
        mh stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        mh stackOut_42_0;
        mh stackOut_43_0;
        mh stackOut_44_0;
        mh stackOut_45_0;
        mh stackOut_46_0;
        mh stackOut_47_0;
        int stackOut_47_1;
        mh stackOut_48_0;
        int stackOut_48_1;
        mh stackOut_49_0;
        mh stackOut_50_0;
        mh stackOut_51_0;
        mh stackOut_52_0;
        mh stackOut_53_0;
        mh stackOut_54_0;
        int stackOut_54_1;
        mh stackOut_55_0;
        int stackOut_55_1;
        mh stackOut_56_0;
        mh stackOut_57_0;
        mh stackOut_58_0;
        mh stackOut_59_0;
        int stackOut_59_1;
        mh stackOut_60_0;
        int stackOut_60_1;
        mh stackOut_1_0;
        mh stackOut_2_0;
        mh stackOut_3_0;
        mh stackOut_4_0;
        mh stackOut_5_0;
        mh stackOut_6_0;
        int stackOut_6_1;
        mh stackOut_7_0;
        int stackOut_7_1;
        mh stackOut_8_0;
        mh stackOut_9_0;
        mh stackOut_10_0;
        mh stackOut_11_0;
        mh stackOut_12_0;
        mh stackOut_13_0;
        int stackOut_13_1;
        mh stackOut_14_0;
        int stackOut_14_1;
        mh stackOut_15_0;
        mh stackOut_16_0;
        mh stackOut_17_0;
        mh stackOut_18_0;
        int stackOut_18_1;
        mh stackOut_19_0;
        int stackOut_19_1;
        on.e(-79);
        if ((m.field_h ^ -1) <= -1) {
          L0: {
            L1: {
              dn.field_N.field_Mb = rd.a(rm.field_c, new String[1], (byte) 103);
              var4 = 34 / ((-10 - param2) / 53);
              stackOut_42_0 = fe.field_gb;
              stackIn_48_0 = stackOut_42_0;
              stackIn_43_0 = stackOut_42_0;
              if (!param0) {
                break L1;
              } else {
                stackOut_43_0 = (mh) (Object) stackIn_43_0;
                stackIn_48_0 = stackOut_43_0;
                stackIn_44_0 = stackOut_43_0;
                if (param1) {
                  break L1;
                } else {
                  stackOut_44_0 = (mh) (Object) stackIn_44_0;
                  stackIn_48_0 = stackOut_44_0;
                  stackIn_45_0 = stackOut_44_0;
                  if (sc.field_c) {
                    break L1;
                  } else {
                    stackOut_45_0 = (mh) (Object) stackIn_45_0;
                    stackIn_48_0 = stackOut_45_0;
                    stackIn_46_0 = stackOut_45_0;
                    if (null != o.field_e) {
                      break L1;
                    } else {
                      stackOut_46_0 = (mh) (Object) stackIn_46_0;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_47_0 = stackOut_46_0;
                      if (nl.field_f != null) {
                        break L1;
                      } else {
                        stackOut_47_0 = (mh) (Object) stackIn_47_0;
                        stackOut_47_1 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_48_0 = (mh) (Object) stackIn_48_0;
            stackOut_48_1 = 0;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            break L0;
          }
          L2: {
            L3: {
              ((mh) (Object) stackIn_49_0).a(stackIn_49_1 != 0, -15211);
              stackOut_49_0 = rm.field_a;
              stackIn_55_0 = stackOut_49_0;
              stackIn_50_0 = stackOut_49_0;
              if (!param0) {
                break L3;
              } else {
                stackOut_50_0 = (mh) (Object) stackIn_50_0;
                stackIn_55_0 = stackOut_50_0;
                stackIn_51_0 = stackOut_50_0;
                if (param1) {
                  break L3;
                } else {
                  stackOut_51_0 = (mh) (Object) stackIn_51_0;
                  stackIn_55_0 = stackOut_51_0;
                  stackIn_52_0 = stackOut_51_0;
                  if (sc.field_c) {
                    break L3;
                  } else {
                    stackOut_52_0 = (mh) (Object) stackIn_52_0;
                    stackIn_55_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (o.field_e != null) {
                      break L3;
                    } else {
                      stackOut_53_0 = (mh) (Object) stackIn_53_0;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_54_0 = stackOut_53_0;
                      if (null != nl.field_f) {
                        break L3;
                      } else {
                        stackOut_54_0 = (mh) (Object) stackIn_54_0;
                        stackOut_54_1 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackOut_55_0 = (mh) (Object) stackIn_55_0;
            stackOut_55_1 = 0;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            break L2;
          }
          L4: {
            L5: {
              ((mh) (Object) stackIn_56_0).a(stackIn_56_1 != 0, -15211);
              stackOut_56_0 = qp.field_f;
              stackIn_60_0 = stackOut_56_0;
              stackIn_57_0 = stackOut_56_0;
              if (!param0) {
                break L5;
              } else {
                stackOut_57_0 = (mh) (Object) stackIn_57_0;
                stackIn_60_0 = stackOut_57_0;
                stackIn_58_0 = stackOut_57_0;
                if (param1) {
                  break L5;
                } else {
                  stackOut_58_0 = (mh) (Object) stackIn_58_0;
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_59_0 = stackOut_58_0;
                  if (!sc.field_c) {
                    break L5;
                  } else {
                    stackOut_59_0 = (mh) (Object) stackIn_59_0;
                    stackOut_59_1 = 1;
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    break L4;
                  }
                }
              }
            }
            stackOut_60_0 = (mh) (Object) stackIn_60_0;
            stackOut_60_1 = 0;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L4;
          }
          L6: {
            ((mh) (Object) stackIn_61_0).a(stackIn_61_1 != 0, -15211);
            ap.field_b.field_d.i(0);
            if (-1 == jf.field_k.field_L) {
              break L6;
            } else {
              tq.field_c = true;
              break L6;
            }
          }
          L7: {
            if (gj.field_b.field_L == 0) {
              break L7;
            } else {
              if (ea.field_g) {
                ml.a(param3, -1);
                break L7;
              } else {
                if (-1 < go.field_c) {
                  ml.a(param3, -1);
                  break L7;
                } else {
                  if (kb.field_Yb < 2) {
                    break L7;
                  } else {
                    if (!pe.field_l[12]) {
                      break L7;
                    } else {
                      ml.a(param3, -1);
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L8: {
            if (td.field_v.field_L != 0) {
              if (1 != w.field_n.length) {
                pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                break L8;
              } else {
                if (pf.field_i == w.field_n[0]) {
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L8;
                } else {
                  pf.field_i = w.field_n[0];
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L8;
                }
              }
            } else {
              break L8;
            }
          }
          L9: {
            if (0 == nh.field_a.field_L) {
              break L9;
            } else {
              sc.field_c = false;
              break L9;
            }
          }
          return;
        } else {
          L10: {
            L11: {
              dn.field_N.field_Mb = null;
              var4 = 34 / ((-10 - param2) / 53);
              stackOut_1_0 = fe.field_gb;
              stackIn_7_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
                break L11;
              } else {
                stackOut_2_0 = (mh) (Object) stackIn_2_0;
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (param1) {
                  break L11;
                } else {
                  stackOut_3_0 = (mh) (Object) stackIn_3_0;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (sc.field_c) {
                    break L11;
                  } else {
                    stackOut_4_0 = (mh) (Object) stackIn_4_0;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (null != o.field_e) {
                      break L11;
                    } else {
                      stackOut_5_0 = (mh) (Object) stackIn_5_0;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (nl.field_f != null) {
                        break L11;
                      } else {
                        stackOut_6_0 = (mh) (Object) stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L10;
                      }
                    }
                  }
                }
              }
            }
            stackOut_7_0 = (mh) (Object) stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L10;
          }
          L12: {
            L13: {
              ((mh) (Object) stackIn_8_0).a(stackIn_8_1 != 0, -15211);
              stackOut_8_0 = rm.field_a;
              stackIn_14_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (!param0) {
                break L13;
              } else {
                stackOut_9_0 = (mh) (Object) stackIn_9_0;
                stackIn_14_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param1) {
                  break L13;
                } else {
                  stackOut_10_0 = (mh) (Object) stackIn_10_0;
                  stackIn_14_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (sc.field_c) {
                    break L13;
                  } else {
                    stackOut_11_0 = (mh) (Object) stackIn_11_0;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (o.field_e != null) {
                      break L13;
                    } else {
                      stackOut_12_0 = (mh) (Object) stackIn_12_0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (null != nl.field_f) {
                        break L13;
                      } else {
                        stackOut_13_0 = (mh) (Object) stackIn_13_0;
                        stackOut_13_1 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            stackOut_14_0 = (mh) (Object) stackIn_14_0;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L12;
          }
          L14: {
            L15: {
              ((mh) (Object) stackIn_15_0).a(stackIn_15_1 != 0, -15211);
              stackOut_15_0 = qp.field_f;
              stackIn_19_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!param0) {
                break L15;
              } else {
                stackOut_16_0 = (mh) (Object) stackIn_16_0;
                stackIn_19_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (param1) {
                  break L15;
                } else {
                  stackOut_17_0 = (mh) (Object) stackIn_17_0;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (!sc.field_c) {
                    break L15;
                  } else {
                    stackOut_18_0 = (mh) (Object) stackIn_18_0;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L14;
                  }
                }
              }
            }
            stackOut_19_0 = (mh) (Object) stackIn_19_0;
            stackOut_19_1 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            break L14;
          }
          L16: {
            ((mh) (Object) stackIn_20_0).a(stackIn_20_1 != 0, -15211);
            ap.field_b.field_d.i(0);
            if (-1 == jf.field_k.field_L) {
              break L16;
            } else {
              tq.field_c = true;
              break L16;
            }
          }
          L17: {
            if (gj.field_b.field_L == 0) {
              break L17;
            } else {
              if (ea.field_g) {
                ml.a(param3, -1);
                break L17;
              } else {
                if (-1 < go.field_c) {
                  ml.a(param3, -1);
                  break L17;
                } else {
                  if (kb.field_Yb < 2) {
                    break L17;
                  } else {
                    if (!pe.field_l[12]) {
                      break L17;
                    } else {
                      ml.a(param3, -1);
                      break L17;
                    }
                  }
                }
              }
            }
          }
          L18: {
            if (td.field_v.field_L != 0) {
              if (1 != w.field_n.length) {
                pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                break L18;
              } else {
                if (pf.field_i == w.field_n[0]) {
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L18;
                } else {
                  pf.field_i = w.field_n[0];
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          L19: {
            if (0 == nh.field_a.field_L) {
              break L19;
            } else {
              sc.field_c = false;
              break L19;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          param0 = param0 + ((na) this).field_w;
          param1 = param1 + ((na) this).field_o;
          this.a((oc) (Object) ((na) this).field_R, ej.field_M, (byte) 127, param1, param0);
          this.a((oc) (Object) ((na) this).field_M, rl.field_f, (byte) 123, param1, param0);
          this.a((oc) (Object) ((na) this).field_O, kk.field_f, (byte) -86, param1, param0);
          return;
        }
    }

    na(ub param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((na) this).a(param5, param2, param3, (byte) -119, param4);
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              L0: {
                if (param1 <= 255) {
                  var2 = (byte)param1;
                  break L0;
                } else {
                  if (param1 == 8364) {
                    var2 = -128;
                    if (param0 == -8250) {
                      return (byte) var2;
                    } else {
                      return (byte) 9;
                    }
                  } else {
                    if (8218 != param1) {
                      if (param1 != 402) {
                        if (param1 == 8222) {
                          var2 = -124;
                          if (param0 == -8250) {
                            return (byte) var2;
                          } else {
                            return (byte) 9;
                          }
                        } else {
                          if (param1 != 8230) {
                            if (8224 != param1) {
                              if (8225 != param1) {
                                if (param1 == 710) {
                                  var2 = -120;
                                  if (param0 == -8250) {
                                    return (byte) var2;
                                  } else {
                                    return (byte) 9;
                                  }
                                } else {
                                  if (param1 != 8240) {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      if (param0 == -8250) {
                                        return (byte) var2;
                                      } else {
                                        return (byte) 9;
                                      }
                                    } else {
                                      if (param1 != 8249) {
                                        if (param1 == 338) {
                                          var2 = -116;
                                          if (param0 == -8250) {
                                            return (byte) var2;
                                          } else {
                                            return (byte) 9;
                                          }
                                        } else {
                                          if (381 != param1) {
                                            if (param1 == 8216) {
                                              var2 = -111;
                                              if (param0 == -8250) {
                                                return (byte) var2;
                                              } else {
                                                return (byte) 9;
                                              }
                                            } else {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (param1 != 8221) {
                                                    if (8226 != param1) {
                                                      if (8211 != param1) {
                                                        if (param1 != 8212) {
                                                          if (param1 != 732) {
                                                            if (param1 == 8482) {
                                                              var2 = -103;
                                                              if (param0 == -8250) {
                                                                return (byte) var2;
                                                              } else {
                                                                return (byte) 9;
                                                              }
                                                            } else {
                                                              if (param1 == 353) {
                                                                var2 = -102;
                                                                if (param0 == -8250) {
                                                                  return (byte) var2;
                                                                } else {
                                                                  return (byte) 9;
                                                                }
                                                              } else {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  if (param0 == -8250) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    return (byte) 9;
                                                                  }
                                                                } else {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    if (param0 == -8250) {
                                                                      return (byte) var2;
                                                                    } else {
                                                                      return (byte) 9;
                                                                    }
                                                                  } else {
                                                                    if (param1 != 382) {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        if (param0 == -8250) {
                                                                          return (byte) var2;
                                                                        } else {
                                                                          return (byte) 9;
                                                                        }
                                                                      } else {
                                                                        var2 = 63;
                                                                        if (param0 == -8250) {
                                                                          return (byte) var2;
                                                                        } else {
                                                                          return (byte) 9;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            if (param0 == -8250) {
                                                              return (byte) var2;
                                                            } else {
                                                              return (byte) 9;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          if (param0 == -8250) {
                                                            return (byte) var2;
                                                          } else {
                                                            return (byte) 9;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        if (param0 == -8250) {
                                                          return (byte) var2;
                                                        } else {
                                                          return (byte) 9;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      if (param0 == -8250) {
                                                        return (byte) var2;
                                                      } else {
                                                        return (byte) 9;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    if (param0 == -8250) {
                                                      return (byte) var2;
                                                    } else {
                                                      return (byte) 9;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -114;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -121;
                                break L0;
                              }
                            } else {
                              var2 = -122;
                              break L0;
                            }
                          } else {
                            var2 = -123;
                            break L0;
                          }
                        }
                      } else {
                        var2 = -125;
                        break L0;
                      }
                    } else {
                      var2 = -126;
                      break L0;
                    }
                  }
                }
              }
              if (param0 == -8250) {
                return (byte) var2;
              } else {
                return (byte) 9;
              }
            } else {
              if (param1 == 8364) {
                var2 = -128;
                if (param0 == -8250) {
                  return (byte) var2;
                } else {
                  return (byte) 9;
                }
              } else {
                L1: {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                        if (param0 == -8250) {
                          return (byte) var2;
                        } else {
                          return (byte) 9;
                        }
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                                if (param0 == -8250) {
                                  return (byte) var2;
                                } else {
                                  return (byte) 9;
                                }
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    if (param0 == -8250) {
                                      return (byte) var2;
                                    } else {
                                      return (byte) 9;
                                    }
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                        if (param0 == -8250) {
                                          return (byte) var2;
                                        } else {
                                          return (byte) 9;
                                        }
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            if (param0 == -8250) {
                                              return (byte) var2;
                                            } else {
                                              return (byte) 9;
                                            }
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 != param1) {
                                                    if (8211 != param1) {
                                                      if (param1 != 8212) {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            if (param0 == -8250) {
                                                              return (byte) var2;
                                                            } else {
                                                              return (byte) 9;
                                                            }
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                              if (param0 == -8250) {
                                                                return (byte) var2;
                                                              } else {
                                                                return (byte) 9;
                                                              }
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                if (param0 == -8250) {
                                                                  return (byte) var2;
                                                                } else {
                                                                  return (byte) 9;
                                                                }
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  if (param0 == -8250) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    return (byte) 9;
                                                                  }
                                                                } else {
                                                                  if (param1 != 382) {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    } else {
                                                                      var2 = 63;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              }
                            } else {
                              var2 = -121;
                              break L1;
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        } else {
                          var2 = -123;
                          break L1;
                        }
                      }
                    } else {
                      var2 = -125;
                      break L1;
                    }
                  } else {
                    var2 = -126;
                    break L1;
                  }
                }
                if (param0 == -8250) {
                  return (byte) var2;
                } else {
                  return (byte) 9;
                }
              }
            }
          } else {
            var2 = (byte)param1;
            if (param0 == -8250) {
              return (byte) var2;
            } else {
              return (byte) 9;
            }
          }
        } else {
          if (param1 >= 160) {
            L2: {
              if (param1 <= 255) {
                var2 = (byte)param1;
                break L2;
              } else {
                if (param1 == 8364) {
                  var2 = -128;
                  if (param0 == -8250) {
                    return (byte) var2;
                  } else {
                    return (byte) 9;
                  }
                } else {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                        if (param0 == -8250) {
                          return (byte) var2;
                        } else {
                          return (byte) 9;
                        }
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                                if (param0 == -8250) {
                                  return (byte) var2;
                                } else {
                                  return (byte) 9;
                                }
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    if (param0 == -8250) {
                                      return (byte) var2;
                                    } else {
                                      return (byte) 9;
                                    }
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                        if (param0 == -8250) {
                                          return (byte) var2;
                                        } else {
                                          return (byte) 9;
                                        }
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            if (param0 == -8250) {
                                              return (byte) var2;
                                            } else {
                                              return (byte) 9;
                                            }
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 != param1) {
                                                    if (8211 != param1) {
                                                      if (param1 != 8212) {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            break L2;
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                              break L2;
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                break L2;
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L2;
                                                                } else {
                                                                  if (param1 != 382) {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L2;
                                }
                              }
                            } else {
                              var2 = -121;
                              break L2;
                            }
                          } else {
                            var2 = -122;
                            break L2;
                          }
                        } else {
                          var2 = -123;
                          break L2;
                        }
                      }
                    } else {
                      var2 = -125;
                      break L2;
                    }
                  } else {
                    var2 = -126;
                    break L2;
                  }
                }
              }
            }
            if (param0 == -8250) {
              return (byte) var2;
            } else {
              return (byte) 9;
            }
          } else {
            if (param1 == 8364) {
              var2 = -128;
              if (param0 != -8250) {
                return (byte) 9;
              } else {
                return (byte) var2;
              }
            } else {
              L3: {
                if (8218 != param1) {
                  if (param1 != 402) {
                    if (param1 == 8222) {
                      var2 = -124;
                      if (param0 != -8250) {
                        return (byte) 9;
                      } else {
                        return (byte) var2;
                      }
                    } else {
                      if (param1 != 8230) {
                        if (8224 != param1) {
                          if (8225 != param1) {
                            if (param1 == 710) {
                              var2 = -120;
                              if (param0 != -8250) {
                                return (byte) 9;
                              } else {
                                return (byte) var2;
                              }
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  if (param0 != -8250) {
                                    return (byte) 9;
                                  } else {
                                    return (byte) var2;
                                  }
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                      if (param0 != -8250) {
                                        return (byte) 9;
                                      } else {
                                        return (byte) var2;
                                      }
                                    } else {
                                      if (381 != param1) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                          if (param0 != -8250) {
                                            return (byte) 9;
                                          } else {
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (8226 != param1) {
                                                  if (8211 != param1) {
                                                    if (param1 != 8212) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2 = -103;
                                                          break L3;
                                                        } else {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L3;
                                                          } else {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                              break L3;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                                break L3;
                                                              } else {
                                                                if (param1 != 382) {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                    break L3;
                                                                  } else {
                                                                    var2 = 63;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L3;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L3;
                                                }
                                              } else {
                                                var2 = -108;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L3;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L3;
                                  }
                                }
                              } else {
                                var2 = -119;
                                break L3;
                              }
                            }
                          } else {
                            var2 = -121;
                            break L3;
                          }
                        } else {
                          var2 = -122;
                          break L3;
                        }
                      } else {
                        var2 = -123;
                        break L3;
                      }
                    }
                  } else {
                    var2 = -125;
                    break L3;
                  }
                } else {
                  var2 = -126;
                  break L3;
                }
              }
              if (param0 != -8250) {
                return (byte) 9;
              } else {
                return (byte) var2;
              }
            }
          }
        }
    }

    public static void k(byte param0) {
        int var1 = 13 / ((-32 - param0) / 57);
        field_L = null;
        field_Q = null;
        field_N = null;
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0;
        L0: {
          if (param0 <= -79) {
            break L0;
          } else {
            ((na) this).field_P = true;
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((na) this).field_R.field_A);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final int i(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0;
        try {
          L0: {
            if (param0 == -117) {
              break L0;
            } else {
              field_N = null;
              break L0;
            }
          }
          stackOut_2_0 = Integer.parseInt(((na) this).field_M.field_A) - 1;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Create a free account to start using this feature";
        field_Q = new vl();
    }
}
