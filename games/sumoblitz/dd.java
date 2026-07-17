/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dd extends hf implements ai {
    private cd[] field_Z;
    private boolean field_S;
    private wp field_O;
    private wp field_Y;
    private wp field_Q;
    private ld field_ab;
    private boolean field_R;
    private wp[] field_V;
    private wp field_X;
    private wp field_T;
    private boolean field_W;
    private nd field_U;
    private wp field_P;

    private final wp g() {
        if (!(null == gk.field_o)) {
            return ((dd) this).field_T;
        }
        if (vv.field_b != null) {
            if (vv.field_b.field_g) {
                if (!(null == ((dd) this).field_Y)) {
                    return ((dd) this).field_Y;
                }
            }
        }
        return ((dd) this).field_X;
    }

    private final void k(int param0) {
        if (param0 < 3) {
            return;
        }
        if (!(((dd) this).field_D)) {
            return;
        }
        ((dd) this).field_D = false;
    }

    dd(dg param0) {
        super(param0, 430, 254);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        cd[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        wp var6 = null;
        String var6_ref = null;
        int var7_int = 0;
        pk var7 = null;
        cd var8 = null;
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
        nd stackIn_49_1 = null;
        nd stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackIn_50_0 = null;
        nd stackIn_50_1 = null;
        nd stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackIn_51_0 = null;
        nd stackIn_51_1 = null;
        nd stackIn_51_2 = null;
        int stackIn_51_3 = 0;
        Object stackIn_52_0 = null;
        nd stackIn_52_1 = null;
        nd stackIn_52_2 = null;
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
        nd stackOut_48_1 = null;
        nd stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        Object stackOut_49_0 = null;
        nd stackOut_49_1 = null;
        nd stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        Object stackOut_51_0 = null;
        nd stackOut_51_1 = null;
        nd stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        Object stackOut_50_0 = null;
        nd stackOut_50_1 = null;
        nd stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
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
              ((dd) this).field_Z = ul.a((byte) -110, lt.field_m);
              if (((dd) this).field_Z.length <= 0) {
                break L1;
              } else {
                var2_int = 0;
                L2: while (true) {
                  if (((dd) this).field_Z.length <= var2_int) {
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((dd) this).field_Z.length) {
                        var3_ref_cd__ = ((dd) this).field_Z;
                        ((dd) this).field_Z = new cd[var2_int];
                        var4 = 0;
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= var3_ref_cd__.length) {
                            int discarded$4 = 1;
                            cb.a(((dd) this).field_Z);
                            break L1;
                          } else {
                            L5: {
                              if (null == var3_ref_cd__[var5]) {
                                break L5;
                              } else {
                                int incrementValue$5 = var4;
                                var4++;
                                ((dd) this).field_Z[incrementValue$5] = var3_ref_cd__[var5];
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        L6: {
                          if (null == ((dd) this).field_Z[var3]) {
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
                      if (((dd) this).field_Z[var2_int] == null) {
                        break L7;
                      } else {
                        var3 = var2_int - -1;
                        L8: while (true) {
                          if (((dd) this).field_Z.length <= var3) {
                            if (null == vv.field_b) {
                              break L7;
                            } else {
                              if (((dd) this).field_Z[var2_int] == null) {
                                break L7;
                              } else {
                                if (vv.field_b.a(((dd) this).field_Z[var2_int].field_g, (byte) -54, ((dd) this).field_Z[var2_int].field_a)) {
                                  break L7;
                                } else {
                                  ((dd) this).field_Z[var2_int] = null;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            L9: {
                              if (((dd) this).field_Z[var3] == null) {
                                break L9;
                              } else {
                                if (((dd) this).field_Z[var2_int].field_a != ((dd) this).field_Z[var3].field_a) {
                                  break L9;
                                } else {
                                  if (((dd) this).field_Z[var2_int].field_g != ((dd) this).field_Z[var3].field_g) {
                                    break L9;
                                  } else {
                                    ((dd) this).field_Z[var3] = null;
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
              if (((dd) this).field_Z.length <= 0) {
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
              ((dd) this).field_R = stackIn_31_1 != 0;
              if (!jt.a((byte) -90)) {
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
              int discarded$6 = 9;
              stackOut_37_0 = this;
              stackIn_39_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (vs.b()) {
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
              ((dd) this).field_W = stackIn_40_1 != 0;
              if (var2_int == 0) {
                if (vv.field_b != null) {
                  if (vv.field_b.f(-1)) {
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
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_50_2 = stackOut_48_2;
                stackIn_50_3 = stackOut_48_3;
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
                  if (var4 == 0) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = null;
                    stackOut_51_2 = null;
                    stackOut_51_3 = stackIn_51_3;
                    stackOut_51_4 = 75;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    stackIn_52_3 = stackOut_51_3;
                    stackIn_52_4 = stackOut_51_4;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              stackOut_50_0 = this;
              stackOut_50_1 = null;
              stackOut_50_2 = null;
              stackOut_50_3 = stackIn_50_3;
              stackOut_50_4 = 58;
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              stackIn_52_3 = stackOut_50_3;
              stackIn_52_4 = stackOut_50_4;
              break L15;
            }
            L17: {
              ((dd) this).field_U = new nd(stackIn_52_3, stackIn_52_4, 410, 105, (mh) null, var3, 1);
              ((dd) this).field_U.field_K = 83;
              ((dd) this).field_U.c(-1, 5, 5);
              ((dd) this).a((pk) (Object) ((dd) this).field_U, 93);
              ((dd) this).field_X = this.a(sb.field_d, (qm) this, kp.field_b, (byte) -105);
              if (var2_int == 0) {
                break L17;
              } else {
                ((dd) this).field_Y = this.a(kn.field_f, (qm) this, hq.field_c, (byte) 122);
                break L17;
              }
            }
            L18: {
              ((dd) this).field_T = this.a(sm.field_c, (qm) this, dj.field_o, (byte) 110);
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
              ((dd) this).field_V = new wp[stackIn_57_1];
              ((dd) this).field_V[0] = ((dd) this).field_X;
              if (var2_int == 0) {
                break L19;
              } else {
                ((dd) this).field_V[2] = ((dd) this).field_Y;
                break L19;
              }
            }
            L20: {
              ((dd) this).field_V[1] = ((dd) this).field_T;
              if (!((dd) this).field_R) {
                break L20;
              } else {
                if (var2_int == 0) {
                  break L20;
                } else {
                  var5_ref_String__ = new String[((dd) this).field_Z.length];
                  var6_int = var5_ref_String__.length - 1;
                  var7_int = 0;
                  L21: while (true) {
                    if (var7_int >= ((dd) this).field_Z.length) {
                      ((dd) this).field_ab = new ld((Object[]) (Object) var5_ref_String__, var6_int, 150);
                      ((dd) this).field_ab.a(-103, ((dd) this).field_T.field_r + ((dd) this).field_U.field_r, -19 + (((dd) this).field_T.field_p + ((dd) this).field_U.field_v - -((dd) this).field_T.field_v), 18, 126);
                      ((dd) this).field_y.a((ms) (Object) ((dd) this).field_ab, -10295);
                      break L20;
                    } else {
                      L22: {
                        var8 = ((dd) this).field_Z[var7_int];
                        if (null == gk.field_o) {
                          break L22;
                        } else {
                          if (var8.field_a != vv.field_b.field_s) {
                            break L22;
                          } else {
                            if (var8.field_g != vv.field_b.field_c) {
                              break L22;
                            } else {
                              var6_int = var7_int;
                              break L22;
                            }
                          }
                        }
                      }
                      var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_g;
                      var7_int++;
                      continue L21;
                    }
                  }
                }
              }
            }
            L23: {
              L24: {
                ((dd) this).field_P = this.a(-73, (qm) this, jh.field_A);
                var5 = ((dd) this).field_P.field_r + ((dd) this).field_P.field_q / 2;
                ((dd) this).field_P.field_q = 150;
                ((dd) this).field_P.field_r = -20 + var5 - ((dd) this).field_P.field_q;
                ((dd) this).field_Q = this.a(-128, (qm) this, dn.field_a);
                ((dd) this).field_Q.field_x = false;
                ((dd) this).field_Q.field_q = ((dd) this).field_P.field_q;
                ((dd) this).field_Q.field_r = var5 - -20;
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
                if (var2_int == 0) {
                  stackOut_73_0 = lw.field_c;
                  stackIn_74_0 = stackOut_73_0;
                  break L25;
                } else {
                  stackOut_72_0 = sl.field_e;
                  stackIn_74_0 = stackOut_72_0;
                  break L25;
                }
              }
              var10 = stackIn_74_0;
              var6_ref = var10;
              var7 = new pk(var10, (qm) null);
              var7.field_r = 0;
              var7.field_q = ((dd) this).field_q;
              var7.field_p = 80;
              var7.field_v = 163;
              var7.field_w = (mh) (Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
              ((dd) this).a(var7, 125);
              break L23;
            }
            L26: {
              ((dd) this).field_S = false;
              int discarded$7 = -2;
              var6 = this.g();
              if (var6 == null) {
                break L26;
              } else {
                var6.field_C = true;
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
            stackOut_78_1 = new StringBuilder().append("dd.<init>(");
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
          throw qo.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 710) {
              L1: {
                if (param2 != ((dd) this).field_P) {
                  if (((dd) this).field_Q != param2) {
                    if (param2 == ((dd) this).field_X) {
                      this.a(param2, 0);
                      break L1;
                    } else {
                      if (param2 == ((dd) this).field_Y) {
                        this.a(param2, 0);
                        break L1;
                      } else {
                        L2: {
                          if (((dd) this).field_ab != null) {
                            if (((dd) this).field_ab.field_k) {
                              stackOut_13_0 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              break L2;
                            } else {
                              stackOut_12_0 = 0;
                              stackIn_15_0 = stackOut_12_0;
                              break L2;
                            }
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_15_0 = stackOut_10_0;
                            break L2;
                          }
                        }
                        var6_int = stackIn_15_0;
                        if (var6_int != 0) {
                          break L1;
                        } else {
                          if (param2 != ((dd) this).field_T) {
                            break L1;
                          } else {
                            if (!((dd) this).field_R) {
                              ((dd) this).field_E.a((byte) 98, (pk) (Object) new u(((dd) this).field_E, ku.field_I));
                              break L1;
                            } else {
                              if (ct.field_x > 0) {
                                this.a(param2, param1 + -710);
                                break L1;
                              } else {
                                ((dd) this).field_E.a((byte) 115, (pk) (Object) new kq(((dd) this).field_E));
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.h((byte) 103);
                    break L1;
                  }
                } else {
                  this.k(124);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("dd.C(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        lt var4 = null;
        qv var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (lt) (Object) em.field_d.b(-75);
            L1: while (true) {
              if (var4 == null) {
                var5 = (qv) (Object) ak.field_b.b(109);
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param0 == 28778) {
                        break L3;
                      } else {
                        dd.a(-77, -57);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    ss.a(param1, 1000, var5);
                    var5 = (qv) (Object) ak.field_b.d((byte) 18);
                    continue L2;
                  }
                }
              } else {
                cl.a((byte) -97, var4, param1);
                var4 = (lt) (Object) em.field_d.d((byte) 18);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "dd.W(" + param0 + 44 + param1 + 41);
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        boolean stackIn_76_0 = false;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_67_0 = 0;
        boolean stackOut_75_0 = false;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        Object stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        Object stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = null;
              if (param2 >= 9) {
                break L1;
              } else {
                var8 = null;
                wp discarded$14 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
                break L1;
              }
            }
            L2: {
              if (!((dd) this).field_X.d(-1)) {
                L3: {
                  if (null == ((dd) this).field_Y) {
                    break L3;
                  } else {
                    if (((dd) this).field_Y.d(-1)) {
                      var5 = (Object) (Object) ((dd) this).field_Y;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((dd) this).field_T.d(-1)) {
                  if (((dd) this).field_P.d(-1)) {
                    var5 = (Object) (Object) ((dd) this).field_P;
                    break L2;
                  } else {
                    if (!((dd) this).field_Q.d(-1)) {
                      if (!((dd) this).field_X.field_C) {
                        L4: {
                          if (null == ((dd) this).field_Y) {
                            break L4;
                          } else {
                            if (((dd) this).field_Y.field_C) {
                              var5 = (Object) (Object) ((dd) this).field_Y;
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (!((dd) this).field_T.field_C) {
                          break L2;
                        } else {
                          var5 = (Object) (Object) ((dd) this).field_T;
                          break L2;
                        }
                      } else {
                        var5 = (Object) (Object) ((dd) this).field_X;
                        break L2;
                      }
                    } else {
                      var5 = (Object) (Object) ((dd) this).field_Q;
                      break L2;
                    }
                  }
                } else {
                  var5 = (Object) (Object) ((dd) this).field_T;
                  break L2;
                }
              } else {
                var5 = (Object) (Object) ((dd) this).field_X;
                break L2;
              }
            }
            L5: {
              var6 = param3;
              if (96 == var6) {
                if ((Object) (Object) ((dd) this).field_T == var5) {
                  if (null != ((dd) this).field_Y) {
                    boolean discarded$15 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                    stackOut_32_0 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0 != 0;
                  } else {
                    boolean discarded$16 = ((dd) this).field_X.a((pk) this, (byte) 61);
                    return true;
                  }
                } else {
                  if (var5 == (Object) (Object) ((dd) this).field_Y) {
                    boolean discarded$17 = ((dd) this).field_X.a((pk) this, (byte) 61);
                    stackOut_36_0 = 1;
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0 != 0;
                  } else {
                    if ((Object) (Object) ((dd) this).field_Q != var5) {
                      break L5;
                    } else {
                      boolean discarded$18 = ((dd) this).field_P.a((pk) this, (byte) 61);
                      stackOut_39_0 = 1;
                      stackIn_40_0 = stackOut_39_0;
                      return stackIn_40_0 != 0;
                    }
                  }
                }
              } else {
                if (var6 == 97) {
                  if ((Object) (Object) ((dd) this).field_X == var5) {
                    L6: {
                      if (((dd) this).field_Y != null) {
                        boolean discarded$19 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                        break L6;
                      } else {
                        boolean discarded$20 = ((dd) this).field_T.a((pk) this, (byte) 61);
                        break L6;
                      }
                    }
                    stackOut_46_0 = 1;
                    stackIn_47_0 = stackOut_46_0;
                    return stackIn_47_0 != 0;
                  } else {
                    if (var5 == (Object) (Object) ((dd) this).field_Y) {
                      boolean discarded$21 = ((dd) this).field_T.a((pk) this, (byte) 61);
                      stackOut_50_0 = 1;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0 != 0;
                    } else {
                      if (var5 != (Object) (Object) ((dd) this).field_P) {
                        break L5;
                      } else {
                        if (((dd) this).field_Q.field_x) {
                          boolean discarded$22 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                          stackOut_55_0 = 1;
                          stackIn_56_0 = stackOut_55_0;
                          return stackIn_56_0 != 0;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                } else {
                  if (98 == var6) {
                    if (var5 == (Object) (Object) ((dd) this).field_P) {
                      boolean discarded$23 = ((dd) this).field_X.a((pk) this, (byte) 61);
                      stackOut_59_0 = 1;
                      stackIn_60_0 = stackOut_59_0;
                      return stackIn_60_0 != 0;
                    } else {
                      if ((Object) (Object) ((dd) this).field_Q != var5) {
                        break L5;
                      } else {
                        boolean discarded$24 = ((dd) this).field_T.a((pk) this, (byte) 61);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        return stackIn_63_0 != 0;
                      }
                    }
                  } else {
                    if (var6 != 99) {
                      break L5;
                    } else {
                      L7: {
                        if (var5 == (Object) (Object) ((dd) this).field_X) {
                          break L7;
                        } else {
                          if (var5 == (Object) (Object) ((dd) this).field_Y) {
                            break L7;
                          } else {
                            if (var5 != (Object) (Object) ((dd) this).field_T) {
                              break L5;
                            } else {
                              L8: {
                                if (!((dd) this).field_Q.field_x) {
                                  boolean discarded$25 = ((dd) this).field_P.a((pk) this, (byte) 61);
                                  break L8;
                                } else {
                                  boolean discarded$26 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                                  break L8;
                                }
                              }
                              stackOut_73_0 = 1;
                              stackIn_74_0 = stackOut_73_0;
                              return stackIn_74_0 != 0;
                            }
                          }
                        }
                      }
                      boolean discarded$27 = ((dd) this).field_P.a((pk) this, (byte) 61);
                      stackOut_67_0 = 1;
                      stackIn_68_0 = stackOut_67_0;
                      return stackIn_68_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_75_0 = super.a(param0, param1, (byte) 98, param3);
            stackIn_76_0 = stackOut_75_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_77_0 = var5;
            stackOut_77_1 = new StringBuilder().append("dd.KA(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L9;
            } else {
              stackOut_78_0 = stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_76_0;
    }

    private final wp a(ne[] param0, qm param1, String param2, byte param3) {
        wp var5 = null;
        RuntimeException var5_ref = null;
        nd var6 = null;
        wp var7 = null;
        int var8 = 0;
        wp stackIn_1_0 = null;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_0_0 = null;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = new wp(param2, param1);
            var5.field_w = (mh) (Object) new uv(param0);
            var6 = ((dd) this).field_U;
            var7 = var5;
            var8 = -20 % ((56 - param3) / 42);
            var6.a(var6.field_K, 0, (pk) (Object) var7);
            ((dd) this).field_U.c(false);
            stackOut_0_0 = (wp) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("dd.D(");
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
          L3: {
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    private final void e() {
        int var3 = 0;
        wp var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        wp[] var6 = ((dd) this).field_V;
        wp[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_C = var4 == ((dd) this).field_O ? true : false;
        }
    }

    private final void a(wp param0, int param1) {
        RuntimeException runtimeException = null;
        wp var3 = null;
        int var4 = 0;
        cd var5 = null;
        wp stackIn_3_0 = null;
        wp stackIn_4_0 = null;
        wp stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        wp stackOut_2_0 = null;
        wp stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        wp stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.h((byte) 113);
                break L1;
              }
            }
            L2: {
              ((dd) this).field_O = param0;
              boolean discarded$6 = param0.a((pk) this, (byte) 61);
              int discarded$7 = -2;
              var3 = this.g();
              stackOut_2_0 = ((dd) this).field_Q;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param0 == var3) {
                stackOut_4_0 = (wp) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = (wp) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              stackIn_5_0.field_x = stackIn_5_1 != 0;
              if (param0 != ((dd) this).field_T) {
                break L3;
              } else {
                if (var3 != param0) {
                  break L3;
                } else {
                  if (null == ((dd) this).field_ab) {
                    break L3;
                  } else {
                    L4: {
                      var4 = ((dd) this).field_ab.g(param1 + -126);
                      var5 = ((dd) this).field_Z[var4];
                      if (var5.field_a != vv.field_b.field_s) {
                        break L4;
                      } else {
                        if (vv.field_b.field_c == var5.field_g) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((dd) this).field_Q.field_x = true;
                    break L3;
                  }
                }
              }
            }
            int discarded$8 = 1;
            this.e();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("dd.O(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((dd) this).field_O == ((dd) this).field_X) {
            ib.d(1);
            int discarded$38 = 0;
            um.b();
            break L0;
          } else {
            if (((dd) this).field_Y != ((dd) this).field_O) {
              if (((dd) this).field_O != ((dd) this).field_T) {
                break L0;
              } else {
                if (null != ((dd) this).field_ab) {
                  var2 = ((dd) this).field_ab.g(96);
                  if (0 <= var2) {
                    vv.field_b.b(((dd) this).field_Z[var2].field_g, ((dd) this).field_Z[var2].field_a, 67);
                    rj.a(true, false);
                    ((dd) this).field_E.a((byte) 108, (pk) (Object) new qk(((dd) this).field_E));
                    break L0;
                  } else {
                    rj.a(true, false);
                    ((dd) this).field_E.a((byte) 108, (pk) (Object) new qk(((dd) this).field_E));
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            } else {
              ib.d(1);
              int discarded$39 = -5812;
              ua.f();
              break L0;
            }
          }
        }
        if (param0 >= 65) {
          ((dd) this).field_Q.field_x = false;
          return;
        } else {
          return;
        }
    }

    private final wp a(int param0, qm param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        wp stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        wp stackOut_3_0 = null;
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
        try {
          L0: {
            var4 = new wp(param2, param1);
            if (param0 < -10) {
              var4.field_w = (mh) (Object) new ue();
              var5 = -46 + ((dd) this).field_p;
              var4.a(127, 15, var5, 30, ((dd) this).field_q + -30);
              ((dd) this).a((pk) (Object) var4, 80);
              stackOut_3_0 = (wp) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wp) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("dd.AA(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        wp[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        wp var7 = null;
        int var8 = 0;
        wp[] var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, 124, param2, param3);
              if (sl.field_d) {
                param2.c((byte) 120);
                var9 = ((dd) this).field_V;
                var5 = var9;
                var6 = 0;
                L2: while (true) {
                  if (var9.length <= var6) {
                    break L1;
                  } else {
                    L3: {
                      var7 = var9[var6];
                      if (!var7.field_k) {
                        break L3;
                      } else {
                        boolean discarded$9 = var7.a((pk) this, (byte) 61);
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
              var5_int = 69 % ((-25 - param1) / 45);
              if (((dd) this).field_W) {
                break L4;
              } else {
                int discarded$10 = 9;
                if (!vs.b()) {
                  this.k(84);
                  ((dd) this).field_E.a((byte) 124, (pk) (Object) new dd(((dd) this).field_E));
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (((dd) this).field_ab == null) {
                break L5;
              } else {
                if (((dd) this).field_ab.i(20) == ((dd) this).field_S) {
                  break L5;
                } else {
                  this.a(((dd) this).field_T, 0);
                  ((dd) this).field_S = ((dd) this).field_ab.i(20);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5_ref;
            stackOut_16_1 = new StringBuilder().append("dd.U(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
    }

    static {
    }
}
