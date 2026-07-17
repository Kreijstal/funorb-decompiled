/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kn extends ob implements vb {
    static long[] field_tb;
    private boolean field_nb;
    private ag[] field_vb;
    private uj[] field_V;
    private ag field_kb;
    private ti field_zb;
    static String field_sb;
    private ag field_ub;
    static String field_rb;
    private boolean field_wb;
    private ag field_lb;
    private boolean field_yb;
    private ag field_mb;
    static String field_pb;
    private ag field_xb;
    private ag field_jb;
    static mo field_qb;
    private ua field_ob;

    final void a(qm param0, int param1, int param2, int param3) {
        ag[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ag var7 = null;
        int var8 = 0;
        ag[] var9 = null;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (tl.field_d) {
                param0.d((byte) 29);
                var9 = ((kn) this).field_vb;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_w) {
                        break L3;
                      } else {
                        boolean discarded$2 = var7.a(0, (qm) this);
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (((kn) this).field_wb) {
                break L4;
              } else {
                if (lc.a((byte) 112)) {
                  break L4;
                } else {
                  this.g(param2 + -171);
                  ((kn) this).field_H.b((qm) (Object) new kn(((kn) this).field_H), 15637);
                  break L4;
                }
              }
            }
            L5: {
              if (null == ((kn) this).field_zb) {
                break L5;
              } else {
                L6: {
                  stackOut_12_0 = ((kn) this).field_zb.j(2);
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (((kn) this).field_nb) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L6;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L6;
                  }
                }
                if ((stackIn_15_0 ? 1 : 0) != stackIn_15_1) {
                  break L5;
                } else {
                  this.a(((kn) this).field_lb, 0);
                  ((kn) this).field_nb = ((kn) this).field_zb.j(2);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("kn.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static lg a(eg param0, int param1, boolean param2, int param3, eg param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        lg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        lg stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                kn.h(-104);
                break L1;
              }
            }
            if (fc.a(-123, param0, param1, param3)) {
              stackOut_5_0 = ge.a(param4.b(param3, 26219, param1), 3417);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (lg) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("kn.J(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    kn(h param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        uj[] var3_ref_uj__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        ag var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        qm var7 = null;
        uj var8 = null;
        String var10 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_49_0 = null;
        ua stackIn_49_1 = null;
        ua stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackIn_50_0 = null;
        ua stackIn_50_1 = null;
        ua stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackIn_51_0 = null;
        ua stackIn_51_1 = null;
        ua stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        Object stackIn_52_0 = null;
        ua stackIn_52_1 = null;
        ua stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_48_0 = null;
        ua stackOut_48_1 = null;
        ua stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        Object stackOut_49_0 = null;
        ua stackOut_49_1 = null;
        ua stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        Object stackOut_50_0 = null;
        ua stackOut_50_1 = null;
        ua stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        Object stackOut_51_0 = null;
        ua stackOut_51_1 = null;
        ua stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        String stackOut_73_0 = null;
        String stackOut_72_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            L1: {
              ((kn) this).field_V = aa.a(fi.field_d, (byte) 77);
              if (((kn) this).field_V.length <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ((kn) this).field_V.length) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (((kn) this).field_V.length <= var3) {
                        var3_ref_uj__ = ((kn) this).field_V;
                        ((kn) this).field_V = new uj[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_uj__.length) {
                            pm.a(((kn) this).field_V, -1);
                            break L1;
                          } else {
                            L5: {
                              if (var3_ref_uj__[var5] == null) {
                                break L5;
                              } else {
                                int incrementValue$1 = var4;
                                var4++;
                                ((kn) this).field_V[incrementValue$1] = var3_ref_uj__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (((kn) this).field_V[var3] == null) {
                            break L6;
                          } else {
                            var2_int++;
                            break L6;
                          }
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (null == ((kn) this).field_V[var2_int]) {
                        break L7;
                      } else {
                        var3 = 1 + var2_int;
                        L8: while (true) {
                          if (((kn) this).field_V.length <= var3) {
                            if (ob.field_Y == null) {
                              break L7;
                            } else {
                              if (null == ((kn) this).field_V[var2_int]) {
                                break L7;
                              } else {
                                if (ob.field_Y.a(((kn) this).field_V[var2_int].field_g, ((kn) this).field_V[var2_int].field_e, -17969)) {
                                  break L7;
                                } else {
                                  ((kn) this).field_V[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (((kn) this).field_V[var3] == null) {
                                break L9;
                              } else {
                                if (((kn) this).field_V[var2_int].field_g != ((kn) this).field_V[var3].field_g) {
                                  break L9;
                                } else {
                                  if (((kn) this).field_V[var2_int].field_e != ((kn) this).field_V[var3].field_e) {
                                    break L9;
                                  } else {
                                    ((kn) this).field_V[var3] = null;
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
            L10: {
              stackOut_28_0 = this;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (0 >= ((kn) this).field_V.length) {
                stackOut_30_0 = this;
                stackOut_30_1 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L10;
              } else {
                stackOut_29_0 = this;
                stackOut_29_1 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L10;
              }
            }
            L11: {
              ((kn) this).field_yb = stackIn_31_1 != 0;
              if (!ne.b(-22768)) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L11;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L11;
              }
            }
            L12: {
              var2_int = stackIn_34_0;
              if (var2_int == 0) {
                stackOut_36_0 = 2;
                stackIn_37_0 = stackOut_36_0;
                break L12;
              } else {
                stackOut_35_0 = 3;
                stackIn_37_0 = stackOut_35_0;
                break L12;
              }
            }
            L13: {
              var3 = stackIn_37_0;
              stackOut_37_0 = this;
              stackIn_39_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (lc.a((byte) 112)) {
                stackOut_39_0 = this;
                stackOut_39_1 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L13;
              } else {
                stackOut_38_0 = this;
                stackOut_38_1 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                break L13;
              }
            }
            L14: {
              ((kn) this).field_wb = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (null != ob.field_Y) {
                  if (ob.field_Y.b(false)) {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L14;
                  } else {
                    stackOut_45_0 = 0;
                    stackIn_48_0 = stackOut_45_0;
                    break L14;
                  }
                } else {
                  stackOut_43_0 = 0;
                  stackIn_48_0 = stackOut_43_0;
                  break L14;
                }
              } else {
                stackOut_41_0 = 0;
                stackIn_48_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              L16: {
                var4 = stackIn_48_0;
                stackOut_48_0 = this;
                stackOut_48_1 = null;
                stackOut_48_2 = null;
                stackOut_48_3 = 10;
                stackIn_51_0 = stackOut_48_0;
                stackIn_51_1 = stackOut_48_1;
                stackIn_51_2 = stackOut_48_2;
                stackIn_51_3 = stackOut_48_3;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                stackIn_49_2 = stackOut_48_2;
                stackIn_49_3 = stackOut_48_3;
                if (var2_int != 0) {
                  break L16;
                } else {
                  stackOut_49_0 = this;
                  stackOut_49_1 = null;
                  stackOut_49_2 = null;
                  stackOut_49_3 = stackIn_49_3;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  stackIn_51_3 = stackOut_49_3;
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  stackIn_50_3 = stackOut_49_3;
                  if (var4 != 0) {
                    break L16;
                  } else {
                    stackOut_50_0 = this;
                    stackOut_50_1 = null;
                    stackOut_50_2 = null;
                    stackOut_50_3 = stackIn_50_3;
                    stackOut_50_4 = 75;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    stackIn_52_2 = stackOut_50_2;
                    stackIn_52_3 = stackOut_50_3;
                    stackIn_52_4 = stackOut_50_4;
                    break L15;
                  }
                }
              }
              stackOut_51_0 = this;
              stackOut_51_1 = null;
              stackOut_51_2 = null;
              stackOut_51_3 = stackIn_51_3;
              stackOut_51_4 = 58;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              stackIn_52_3 = stackOut_51_3;
              stackIn_52_4 = stackOut_51_4;
              break L15;
            }
            L17: {
              ((kn) this).field_ob = new ua(stackIn_52_3, stackIn_52_4, 410, 105, (pf) null, var3, 1);
              ((kn) this).field_ob.field_R = 83;
              ((kn) this).field_ob.d(0, 5, 5);
              ((kn) this).c(-123, (qm) (Object) ((kn) this).field_ob);
              ((kn) this).field_jb = this.a(-1, ci.field_b, oa.field_d, (wc) this);
              if (var2_int == 0) {
                break L17;
              } else {
                ((kn) this).field_mb = this.a(-1, fo.field_f, fg.field_k, (wc) this);
                break L17;
              }
            }
            L18: {
              ((kn) this).field_lb = this.a(-1, oj.field_g, qj.field_j, (wc) this);
              stackOut_54_0 = this;
              stackIn_56_0 = stackOut_54_0;
              stackIn_55_0 = stackOut_54_0;
              if (var2_int != 0) {
                stackOut_56_0 = this;
                stackOut_56_1 = 3;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                break L18;
              } else {
                stackOut_55_0 = this;
                stackOut_55_1 = 2;
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                break L18;
              }
            }
            L19: {
              ((kn) this).field_vb = new ag[stackIn_57_1];
              ((kn) this).field_vb[1] = ((kn) this).field_lb;
              if (var2_int == 0) {
                break L19;
              } else {
                ((kn) this).field_vb[2] = ((kn) this).field_mb;
                break L19;
              }
            }
            L20: {
              ((kn) this).field_vb[0] = ((kn) this).field_jb;
              if (!((kn) this).field_yb) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[((kn) this).field_V.length];
                  var6_int = -1 + var5_ref_String__.length;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= ((kn) this).field_V.length) {
                      ((kn) this).field_zb = new ti((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((kn) this).field_zb.a(18, ((kn) this).field_lb.field_k + (((kn) this).field_lb.field_j + (((kn) this).field_ob.field_j - 19)), 126, ((kn) this).field_ob.field_n - -((kn) this).field_lb.field_n, -54);
                      ((kn) this).field_B.a((pg) (Object) ((kn) this).field_zb, (byte) -58);
                      break L20;
                    } else {
                      L22: {
                        var8 = ((kn) this).field_V[var7_int];
                        if (null == ka.field_m) {
                          break L22;
                        } else {
                          if (ob.field_Y.field_m != var8.field_g) {
                            break L22;
                          } else {
                            if (ob.field_Y.field_c != var8.field_e) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_g + "<times>" + var8.field_e;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                ((kn) this).field_kb = this.a((wc) this, lm.field_a, 410);
                var5 = ((kn) this).field_kb.field_v / 2 + ((kn) this).field_kb.field_n;
                ((kn) this).field_kb.field_v = 150;
                ((kn) this).field_kb.field_n = var5 - (20 + ((kn) this).field_kb.field_v);
                ((kn) this).field_ub = this.a((wc) this, hj.field_e, 410);
                ((kn) this).field_ub.field_B = false;
                ((kn) this).field_ub.field_v = ((kn) this).field_kb.field_v;
                ((kn) this).field_ub.field_n = var5 - -20;
                if (var2_int != 0) {
                  break L24;
                } else {
                  if (var4 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              L25: {
                if (var2_int != 0) {
                  stackOut_73_0 = on.field_b;
                  stackIn_74_0 = stackOut_73_0;
                  break L25;
                } else {
                  stackOut_72_0 = tm.field_c;
                  stackIn_74_0 = stackOut_72_0;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6_ref = var10;
              var7 = new qm(var10, (wc) null);
              var7.field_j = 163;
              var7.field_k = 80;
              var7.field_v = ((kn) this).field_v;
              var7.field_n = 0;
              var7.field_r = (pf) (Object) new jm(ia.field_c, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((kn) this).c(-96, var7);
              break L23;
            }
            L26: {
              ((kn) this).field_nb = false;
              var6 = this.j(2);
              if (var6 == null) {
                break L26;
              } else {
                var6.field_z = true;
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var2 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var2;
            stackOut_78_1 = new StringBuilder().append("kn.<init>(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        ql.field_a = param2;
        pn.field_d = param0;
        wm.field_I = param1;
    }

    public static void h(int param0) {
        if (param0 != 3) {
            return;
        }
        field_tb = null;
        field_qb = null;
        field_sb = null;
        field_rb = null;
        field_pb = null;
    }

    final static void a(java.awt.Canvas param0, byte param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param0.getGraphics();
                ce.field_m.a(0, var4, 0, param2);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param0.repaint();
                break L2;
              }
            }
            L3: {
              if (param1 < -87) {
                break L3;
              } else {
                field_pb = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("kn.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
    }

    private final ag a(wc param0, String param1, int param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new ag(param1, param0);
            var4.field_r = (pf) (Object) new mm();
            var5 = -46 + ((kn) this).field_k;
            var4.a(30, var5, -30 + ((kn) this).field_v, 15, -92);
            ((kn) this).c(-116, (qm) (Object) var4);
            stackOut_0_0 = (ag) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("kn.T(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 410 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        kc var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        jg var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (jo.field_e >= ea.field_F) {
                break L1;
              } else {
                jo.field_e = jo.field_e + 1;
                break L1;
              }
            }
            L2: {
              if (vd.field_k == ce.field_m.field_m) {
                break L2;
              } else {
                ma.field_N = ma.field_N + (ce.field_m.field_m + -vd.field_k);
                vd.field_k = ce.field_m.field_m;
                break L2;
              }
            }
            if (jo.field_e > 0) {
              L3: {
                ed.j(120);
                n.field_g.b(param3, (byte) 60);
                if (!param2) {
                  break L3;
                } else {
                  field_tb = null;
                  break L3;
                }
              }
              L4: {
                if (null == ln.field_U) {
                  break L4;
                } else {
                  if (!wh.field_g) {
                    ln.field_U = null;
                    break L4;
                  } else {
                    boolean discarded$1 = ln.field_U.a(n.field_g.field_V, n.field_g.field_nb, param3, (byte) -104);
                    break L4;
                  }
                }
              }
              var4_int = 0;
              L5: while (true) {
                if (var4_int >= 5) {
                  L6: {
                    if (g.field_g.field_U != 0) {
                      db.field_a = new w(g.field_g.field_V, g.field_g.field_nb, g.field_g.field_x, g.field_g.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, (String) null, 0L);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = f.a(16711422, param1, ga.field_r, dh.field_Gb);
                    if (var9 == null) {
                      break L7;
                    } else {
                      eb.a(0, var9);
                      break L7;
                    }
                  }
                  L8: {
                    var8 = jl.b(0);
                    if (var8 == null) {
                      break L8;
                    } else {
                      kh.field_c = var8;
                      break L8;
                    }
                  }
                  break L0;
                } else {
                  L9: {
                    var5 = mn.field_s[var4_int];
                    if (var5 != null) {
                      L10: {
                        if (var5.field_U == 0) {
                          break L10;
                        } else {
                          ko.a(var4_int, var5, (byte) -86);
                          break L10;
                        }
                      }
                      var6 = oh.a((byte) 119, var4_int);
                      ia.field_b[var4_int].field_W = tl.field_a[var6];
                      oc.field_f[var4_int].field_rb = cf.field_b[var6];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var4_int++;
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "kn.R(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            if (((kn) this).field_jb == ((kn) this).field_xb) {
              u.b(6);
              tl.a(-30267);
              break L1;
            } else {
              if (((kn) this).field_xb != ((kn) this).field_mb) {
                if (((kn) this).field_xb == ((kn) this).field_lb) {
                  L2: {
                    if (((kn) this).field_zb == null) {
                      break L2;
                    } else {
                      var2 = ((kn) this).field_zb.g((byte) 37);
                      if (var2 < 0) {
                        break L2;
                      } else {
                        ob.field_Y.a(((kn) this).field_V[var2].field_e, ((kn) this).field_V[var2].field_g, (byte) -64);
                        break L2;
                      }
                    }
                  }
                  nb.a(true, 5);
                  ((kn) this).field_H.b((qm) (Object) new bj(((kn) this).field_H), 15637);
                  break L1;
                } else {
                  ((kn) this).field_ub.field_B = false;
                  var2 = 0;
                  break L0;
                }
              } else {
                u.b(6);
                gm.a((byte) -127);
                break L1;
              }
            }
          }
          ((kn) this).field_ub.field_B = false;
          var2 = 0;
          break L0;
        }
    }

    final static void g(boolean param0) {
        k.field_o = 0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != ((kn) this).field_kb) {
                if (param4 == ((kn) this).field_ub) {
                  this.k(46);
                  break L1;
                } else {
                  if (param4 == ((kn) this).field_jb) {
                    this.a(param4, 0);
                    break L1;
                  } else {
                    if (((kn) this).field_mb == param4) {
                      this.a(param4, 0);
                      break L1;
                    } else {
                      L2: {
                        if (null != ((kn) this).field_zb) {
                          if (((kn) this).field_zb.field_w) {
                            stackOut_10_0 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            break L2;
                          } else {
                            stackOut_9_0 = 0;
                            stackIn_12_0 = stackOut_9_0;
                            break L2;
                          }
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_12_0 = stackOut_7_0;
                          break L2;
                        }
                      }
                      var6_int = stackIn_12_0;
                      if (var6_int != 0) {
                        break L1;
                      } else {
                        if (param4 == ((kn) this).field_lb) {
                          if (!((kn) this).field_yb) {
                            ((kn) this).field_H.b((qm) (Object) new qn(((kn) this).field_H, oo.field_C), 15637);
                            break L1;
                          } else {
                            if (ah.field_c > 0) {
                              this.a(param4, 0);
                              break L1;
                            } else {
                              ((kn) this).field_H.b((qm) (Object) new gf(((kn) this).field_H), 15637);
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                this.g(-1);
                break L1;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                ((kn) this).field_xb = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("kn.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        ag var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        ag[] var6 = ((kn) this).field_vb;
        ag[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_z = ((kn) this).field_xb == var4 ? true : false;
        }
    }

    private final ag a(int param0, String param1, ll[] param2, wc param3) {
        ag var5 = null;
        RuntimeException var5_ref = null;
        ua var6 = null;
        ag var7 = null;
        Object stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5 = new ag(param1, param3);
            var5.field_r = (pf) (Object) new cd(param2);
            if (param0 == -1) {
              var6 = ((kn) this).field_ob;
              var7 = var5;
              var6.a((qm) (Object) var7, param0 ^ -123, var6.field_R);
              ((kn) this).field_ob.e((byte) 64);
              stackOut_3_0 = (ag) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ag) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("kn.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    private final ag j(int param0) {
        if (param0 != 2) {
            return null;
        }
        if (null != ka.field_m) {
            return ((kn) this).field_lb;
        }
        if (null != ob.field_Y) {
            if (ob.field_Y.field_l) {
                if (((kn) this).field_mb != null) {
                    return ((kn) this).field_mb;
                }
            }
        }
        return ((kn) this).field_jb;
    }

    private final void g(int param0) {
        if (!((kn) this).field_G) {
            return;
        }
        ((kn) this).field_G = false;
        if (param0 != -1) {
            ((kn) this).field_zb = null;
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_74_0 = false;
        Object stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        boolean stackOut_73_0 = false;
        Object stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        Object stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (((kn) this).field_jb.d(-2116)) {
                var5 = (Object) (Object) ((kn) this).field_jb;
                break L1;
              } else {
                L2: {
                  if (((kn) this).field_mb == null) {
                    break L2;
                  } else {
                    if (((kn) this).field_mb.d(-2116)) {
                      var5 = (Object) (Object) ((kn) this).field_mb;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((kn) this).field_lb.d(-2116)) {
                  var5 = (Object) (Object) ((kn) this).field_lb;
                  break L1;
                } else {
                  if (!((kn) this).field_kb.d(-2116)) {
                    if (((kn) this).field_ub.d(-2116)) {
                      var5 = (Object) (Object) ((kn) this).field_ub;
                      break L1;
                    } else {
                      if (((kn) this).field_jb.field_z) {
                        var5 = (Object) (Object) ((kn) this).field_jb;
                        break L1;
                      } else {
                        L3: {
                          if (null == ((kn) this).field_mb) {
                            break L3;
                          } else {
                            if (!((kn) this).field_mb.field_z) {
                              break L3;
                            } else {
                              var5 = (Object) (Object) ((kn) this).field_mb;
                              break L1;
                            }
                          }
                        }
                        if (((kn) this).field_lb.field_z) {
                          var5 = (Object) (Object) ((kn) this).field_lb;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var5 = (Object) (Object) ((kn) this).field_kb;
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (param1 < -120) {
                break L4;
              } else {
                ((kn) this).field_xb = null;
                break L4;
              }
            }
            L5: {
              var6 = param3;
              if (var6 != 96) {
                if (97 == var6) {
                  if ((Object) (Object) ((kn) this).field_jb != var5) {
                    if ((Object) (Object) ((kn) this).field_mb == var5) {
                      boolean discarded$13 = ((kn) this).field_lb.a(0, (qm) this);
                      stackOut_48_0 = 1;
                      stackIn_49_0 = stackOut_48_0;
                      return stackIn_49_0 != 0;
                    } else {
                      if ((Object) (Object) ((kn) this).field_kb != var5) {
                        break L5;
                      } else {
                        if (!((kn) this).field_ub.field_B) {
                          break L5;
                        } else {
                          boolean discarded$14 = ((kn) this).field_ub.a(0, (qm) this);
                          stackOut_52_0 = 1;
                          stackIn_53_0 = stackOut_52_0;
                          return stackIn_53_0 != 0;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (null == ((kn) this).field_mb) {
                        boolean discarded$15 = ((kn) this).field_lb.a(0, (qm) this);
                        break L6;
                      } else {
                        boolean discarded$16 = ((kn) this).field_mb.a(0, (qm) this);
                        break L6;
                      }
                    }
                    stackOut_44_0 = 1;
                    stackIn_45_0 = stackOut_44_0;
                    return stackIn_45_0 != 0;
                  }
                } else {
                  if (98 == var6) {
                    if ((Object) (Object) ((kn) this).field_kb == var5) {
                      boolean discarded$17 = ((kn) this).field_jb.a(0, (qm) this);
                      stackOut_56_0 = 1;
                      stackIn_57_0 = stackOut_56_0;
                      return stackIn_57_0 != 0;
                    } else {
                      if ((Object) (Object) ((kn) this).field_ub != var5) {
                        break L5;
                      } else {
                        boolean discarded$18 = ((kn) this).field_lb.a(0, (qm) this);
                        stackOut_59_0 = 1;
                        stackIn_60_0 = stackOut_59_0;
                        return stackIn_60_0 != 0;
                      }
                    }
                  } else {
                    if (var6 != 99) {
                      break L5;
                    } else {
                      L7: {
                        if ((Object) (Object) ((kn) this).field_jb == var5) {
                          break L7;
                        } else {
                          if (var5 == (Object) (Object) ((kn) this).field_mb) {
                            break L7;
                          } else {
                            if ((Object) (Object) ((kn) this).field_lb == var5) {
                              L8: {
                                if (!((kn) this).field_ub.field_B) {
                                  boolean discarded$19 = ((kn) this).field_kb.a(0, (qm) this);
                                  break L8;
                                } else {
                                  boolean discarded$20 = ((kn) this).field_ub.a(0, (qm) this);
                                  break L8;
                                }
                              }
                              stackOut_71_0 = 1;
                              stackIn_72_0 = stackOut_71_0;
                              return stackIn_72_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      boolean discarded$21 = ((kn) this).field_kb.a(0, (qm) this);
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      return stackIn_65_0 != 0;
                    }
                  }
                }
              } else {
                if (var5 != (Object) (Object) ((kn) this).field_lb) {
                  if (var5 != (Object) (Object) ((kn) this).field_mb) {
                    if ((Object) (Object) ((kn) this).field_ub != var5) {
                      break L5;
                    } else {
                      boolean discarded$22 = ((kn) this).field_kb.a(0, (qm) this);
                      stackOut_38_0 = 1;
                      stackIn_39_0 = stackOut_38_0;
                      return stackIn_39_0 != 0;
                    }
                  } else {
                    boolean discarded$23 = ((kn) this).field_jb.a(0, (qm) this);
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                } else {
                  if (((kn) this).field_mb == null) {
                    boolean discarded$24 = ((kn) this).field_jb.a(0, (qm) this);
                    stackOut_32_0 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0 != 0;
                  } else {
                    boolean discarded$25 = ((kn) this).field_mb.a(0, (qm) this);
                    return true;
                  }
                }
              }
            }
            stackOut_73_0 = super.a(param0, (byte) -122, param2, param3);
            stackIn_74_0 = stackOut_73_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_75_0 = var5;
            stackOut_75_1 = new StringBuilder().append("kn.N(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L9;
            } else {
              stackOut_76_0 = stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_74_0;
    }

    private final void a(ag param0, int param1) {
        ag var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        uj var5 = null;
        ag stackIn_1_0 = null;
        ag stackIn_2_0 = null;
        ag stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_0_0 = null;
        ag stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ag stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((kn) this).field_xb = param0;
              boolean discarded$3 = param0.a(0, (qm) this);
              var3 = this.j(2);
              stackOut_0_0 = ((kn) this).field_ub;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (var3 == param0) {
                stackOut_2_0 = (ag) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (ag) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              stackIn_3_0.field_B = stackIn_3_1 != 0;
              if (param0 == ((kn) this).field_lb) {
                if (param0 == var3) {
                  if (((kn) this).field_zb != null) {
                    L3: {
                      var4 = ((kn) this).field_zb.g((byte) 37);
                      var5 = ((kn) this).field_V[var4];
                      if (var5.field_g != ob.field_Y.field_m) {
                        break L3;
                      } else {
                        if (var5.field_e != ob.field_Y.field_c) {
                          break L3;
                        } else {
                          this.i(-121);
                          break L2;
                        }
                      }
                    }
                    ((kn) this).field_ub.field_B = true;
                    this.i(-121);
                    break L2;
                  } else {
                    this.i(-121);
                    break L2;
                  }
                } else {
                  this.i(-121);
                  break L2;
                }
              } else {
                this.i(-121);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("kn.V(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "Seriously offensive language";
        field_rb = "Go Back";
        field_tb = new long[32];
        field_pb = "Steep slopes and rugged terrain. Stay here too long and the volcanoes will erupt!";
    }
}
