/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ci {
    ci field_gc;
    long field_Fb;
    ci field_Ib;
    int field_Mb;
    ci field_fc;
    ci field_Nb;
    int field_ic;
    int field_Xb;
    boolean field_dc;
    byte[] field_sc;
    boolean field_Vb;
    long field_Jb;
    boolean field_Yb;
    ci field_Qb;
    ci field_uc;
    ci field_Lb;
    int field_Hb;
    ci field_nc;
    int field_jc;
    ci field_Sb;
    int field_hc;
    static int field_rc;
    boolean field_Tb;
    ci field_tc;
    static ci field_cc;
    ci[] field_Ob;
    boolean field_lc;
    static ci field_vc;
    ci field_Rb;
    static String field_bc;
    static String[][] field_qc;
    ci field_mc;
    String field_Gb;
    int field_Ub;
    static int field_oc;
    boolean field_Pb;
    ci field_Zb;
    String[] field_ec;
    boolean field_ac;
    ci field_Wb;
    ci field_kc;
    int field_pc;
    static boolean field_Kb;
    ci field_Eb;

    final static hg[] l(int param0) {
        if (param0 != 2) {
          return (hg[]) null;
        } else {
          return new hg[]{ej.field_c, ig.field_d, ah.field_g, ka.field_j, an.field_b, ql.field_g, wg.field_r, me.field_b, ob.field_v, mf.field_m, ag.field_g, nj.field_v, ua.field_a, dm.field_c};
        }
    }

    final int g(byte param0) {
        if (param0 >= -74) {
            return 25;
        }
        return (int)this.a(0);
    }

    public static void k(int param0) {
        field_cc = null;
        field_vc = null;
        if (param0 != 0) {
          field_cc = (ci) null;
          field_qc = (String[][]) null;
          field_bc = null;
          return;
        } else {
          field_qc = (String[][]) null;
          field_bc = null;
          return;
        }
    }

    ln(int param0) {
        super(0L, (ci) null);
        this.field_sc = new byte[param0];
    }

    final boolean a(int param0, ln param1) {
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_39_0 = false;
        boolean stackIn_40_0 = false;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            if (param0 == -7) {
              L1: {
                if (!this.field_dc) {
                  if (6 == this.field_jc) {
                    stackIn_9_0 = 1;
                    break L1;
                  } else {
                    stackIn_9_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_9_0 = 1;
                  break L1;
                }
              }
              L2: {
                var3_int = stackIn_9_0;
                if (!param1.field_dc) {
                  if (-7 == (param1.field_jc ^ -1)) {
                    stackIn_15_0 = 1;
                    break L2;
                  } else {
                    stackIn_15_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_15_0 = 1;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_15_0;
                if (var4 != 0) {
                  stackIn_18_0 = 0;
                  break L3;
                } else {
                  stackIn_18_0 = 1;
                  break L3;
                }
              }
              if (stackIn_18_0 == var3_int) {
                stackIn_21_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (var3_int != 0) {
                    break L4;
                  } else {
                    L5: {
                      if (param1.field_Pb) {
                        stackIn_26_0 = 0;
                        break L5;
                      } else {
                        stackIn_26_0 = 1;
                        break L5;
                      }
                    }
                    if (stackIn_26_0 == (this.field_Pb ? 1 : 0)) {
                      stackIn_29_0 = this.field_Pb;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (!this.field_Pb) {
                        break L4;
                      } else {
                        if (param1.field_ic != this.field_ic) {
                          L6: {
                            if (param1.field_ic <= this.field_ic) {
                              stackIn_36_0 = 0;
                              break L6;
                            } else {
                              stackIn_36_0 = 1;
                              break L6;
                            }
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L7: {
                  stackIn_39_0 = this.field_Vb;

                  if (param1.field_Vb) {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = 0;
                    break L7;
                  } else {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = 1;
                    break L7;
                  }
                }
                if ((stackIn_40_0 ? 1 : 0) != stackIn_40_1) {
                  if (this.field_Vb) {
                    L8: {
                      if (this.field_ac) {
                        stackIn_56_0 = 1;
                        break L8;
                      } else {
                        if (2 == this.field_Mb) {
                          stackIn_56_0 = 1;
                          break L8;
                        } else {
                          stackIn_56_0 = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var5 = stackIn_56_0;
                      if (!param1.field_ac) {
                        if (param1.field_Mb == 2) {
                          stackIn_62_0 = 1;
                          break L9;
                        } else {
                          stackIn_62_0 = 0;
                          break L9;
                        }
                      } else {
                        stackIn_62_0 = 1;
                        break L9;
                      }
                    }
                    var6 = stackIn_62_0;
                    if (var6 == var5) {
                      L10: {
                        if ((this.field_Jb ^ -1L) >= (param1.field_Jb ^ -1L)) {
                          stackIn_68_0 = 0;
                          break L10;
                        } else {
                          stackIn_68_0 = 1;
                          break L10;
                        }
                      }
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      stackIn_64_0 = var5;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    L11: {
                      if (this.field_Jb >= param1.field_Jb) {
                        stackIn_49_0 = 0;
                        break L11;
                      } else {
                        stackIn_49_0 = 1;
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  L12: {
                    if (this.field_Vb) {
                      stackIn_44_0 = 0;
                      break L12;
                    } else {
                      stackIn_44_0 = 1;
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var3);

            stackIn_71_1 = new StringBuilder().append("ln.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L13;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L13;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_36_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_44_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_49_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_64_0 != 0;
                    } else {
                      return stackIn_68_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void f(byte param0) {
        if (param0 != -74) {
            ln.k(-24);
            bo.a(bh.i(81), (byte) -12);
            return;
        }
        bo.a(bh.i(81), (byte) -12);
    }

    final boolean m(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -23901) {
          L0: {
            this.field_gc = (ci) null;
            if (this.e(-4)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.e(-4)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_rc = 0;
        field_bc = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
