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

    private final wp g(byte param0) {
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
        if (param0 != -2) {
            return null;
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
        int var2 = 0;
        int var3 = 0;
        cd[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        wp var6 = null;
        int var7_int = 0;
        pk var7 = null;
        cd var8 = null;
        String var10 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_53_0 = null;
        nd stackIn_53_1 = null;
        nd stackIn_53_2 = null;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        nd stackIn_54_1 = null;
        nd stackIn_54_2 = null;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        nd stackIn_55_1 = null;
        nd stackIn_55_2 = null;
        int stackIn_55_3 = 0;
        Object stackIn_56_0 = null;
        nd stackIn_56_1 = null;
        nd stackIn_56_2 = null;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String stackIn_78_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        Object stackOut_52_0 = null;
        nd stackOut_52_1 = null;
        nd stackOut_52_2 = null;
        int stackOut_52_3 = 0;
        Object stackOut_53_0 = null;
        nd stackOut_53_1 = null;
        nd stackOut_53_2 = null;
        int stackOut_53_3 = 0;
        Object stackOut_55_0 = null;
        nd stackOut_55_1 = null;
        nd stackOut_55_2 = null;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        Object stackOut_54_0 = null;
        nd stackOut_54_1 = null;
        nd stackOut_54_2 = null;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_77_0 = null;
        String stackOut_76_0 = null;
        L0: {
          ((dd) this).field_Z = ul.a((byte) -110, lt.field_m);
          if (((dd) this).field_Z.length <= 0) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (((dd) this).field_Z.length <= var2) {
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((dd) this).field_Z.length) {
                    var3_ref_cd__ = ((dd) this).field_Z;
                    ((dd) this).field_Z = new cd[var2];
                    var4 = 0;
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_ref_cd__.length) {
                        cb.a(((dd) this).field_Z, true);
                        break L0;
                      } else {
                        if (null != var3_ref_cd__[var5]) {
                          var4++;
                          ((dd) this).field_Z[var4] = var3_ref_cd__[var5];
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (null != ((dd) this).field_Z[var3]) {
                      var2++;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((dd) this).field_Z[var2] != null) {
                  var3 = var2 - -1;
                  L4: while (true) {
                    if (((dd) this).field_Z.length <= var3) {
                      if (null != vv.field_b) {
                        if (((dd) this).field_Z[var2] != null) {
                          if (!vv.field_b.a(((dd) this).field_Z[var2].field_g, (byte) -54, ((dd) this).field_Z[var2].field_a)) {
                            ((dd) this).field_Z[var2] = null;
                            var2++;
                            continue L1;
                          } else {
                            var2++;
                            continue L1;
                          }
                        } else {
                          var2++;
                          continue L1;
                        }
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      if (((dd) this).field_Z[var3] != null) {
                        if (((dd) this).field_Z[var2].field_a == ((dd) this).field_Z[var3].field_a) {
                          if (((dd) this).field_Z[var2].field_g == ((dd) this).field_Z[var3].field_g) {
                            ((dd) this).field_Z[var3] = null;
                            var3++;
                            continue L4;
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        L5: {
          stackOut_32_0 = this;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if ((((dd) this).field_Z.length ^ -1) >= -1) {
            stackOut_34_0 = this;
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L5;
          } else {
            stackOut_33_0 = this;
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L5;
          }
        }
        L6: {
          ((dd) this).field_R = stackIn_35_1 != 0;
          if (!jt.a((byte) -90)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L6;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_38_0;
          if (var2 == 0) {
            stackOut_40_0 = 2;
            stackIn_41_0 = stackOut_40_0;
            break L7;
          } else {
            stackOut_39_0 = 3;
            stackIn_41_0 = stackOut_39_0;
            break L7;
          }
        }
        L8: {
          var3 = stackIn_41_0;
          stackOut_41_0 = this;
          stackIn_43_0 = stackOut_41_0;
          stackIn_42_0 = stackOut_41_0;
          if (vs.b((byte) 9)) {
            stackOut_43_0 = this;
            stackOut_43_1 = 0;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            break L8;
          } else {
            stackOut_42_0 = this;
            stackOut_42_1 = 1;
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            break L8;
          }
        }
        L9: {
          ((dd) this).field_W = stackIn_44_1 != 0;
          if (var2 == 0) {
            if (vv.field_b != null) {
              if (vv.field_b.f(-1)) {
                stackOut_50_0 = 1;
                stackIn_52_0 = stackOut_50_0;
                break L9;
              } else {
                stackOut_49_0 = 0;
                stackIn_52_0 = stackOut_49_0;
                break L9;
              }
            } else {
              stackOut_47_0 = 0;
              stackIn_52_0 = stackOut_47_0;
              break L9;
            }
          } else {
            stackOut_45_0 = 0;
            stackIn_52_0 = stackOut_45_0;
            break L9;
          }
        }
        L10: {
          L11: {
            var4 = stackIn_52_0;
            stackOut_52_0 = this;
            stackOut_52_1 = null;
            stackOut_52_2 = null;
            stackOut_52_3 = 10;
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_54_2 = stackOut_52_2;
            stackIn_54_3 = stackOut_52_3;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            stackIn_53_2 = stackOut_52_2;
            stackIn_53_3 = stackOut_52_3;
            if (var2 != 0) {
              break L11;
            } else {
              stackOut_53_0 = this;
              stackOut_53_1 = null;
              stackOut_53_2 = null;
              stackOut_53_3 = stackIn_53_3;
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              stackIn_55_3 = stackOut_53_3;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              if (var4 == 0) {
                stackOut_55_0 = this;
                stackOut_55_1 = null;
                stackOut_55_2 = null;
                stackOut_55_3 = stackIn_55_3;
                stackOut_55_4 = 75;
                stackIn_56_0 = stackOut_55_0;
                stackIn_56_1 = stackOut_55_1;
                stackIn_56_2 = stackOut_55_2;
                stackIn_56_3 = stackOut_55_3;
                stackIn_56_4 = stackOut_55_4;
                break L10;
              } else {
                break L11;
              }
            }
          }
          stackOut_54_0 = this;
          stackOut_54_1 = null;
          stackOut_54_2 = null;
          stackOut_54_3 = stackIn_54_3;
          stackOut_54_4 = 58;
          stackIn_56_0 = stackOut_54_0;
          stackIn_56_1 = stackOut_54_1;
          stackIn_56_2 = stackOut_54_2;
          stackIn_56_3 = stackOut_54_3;
          stackIn_56_4 = stackOut_54_4;
          break L10;
        }
        L12: {
          new nd(stackIn_56_3, stackIn_56_4, 410, 105, (mh) null, var3, 1);
          ((dd) this).field_U = stackIn_56_1;
          ((dd) this).field_U.field_K = 83;
          ((dd) this).field_U.c(-1, 5, 5);
          ((dd) this).a((pk) (Object) ((dd) this).field_U, 93);
          ((dd) this).field_X = this.a(sb.field_d, (qm) this, kp.field_b, (byte) -105);
          if (var2 == 0) {
            break L12;
          } else {
            ((dd) this).field_Y = this.a(kn.field_f, (qm) this, hq.field_c, (byte) 122);
            break L12;
          }
        }
        L13: {
          ((dd) this).field_T = this.a(sm.field_c, (qm) this, dj.field_o, (byte) 110);
          stackOut_58_0 = this;
          stackIn_60_0 = stackOut_58_0;
          stackIn_59_0 = stackOut_58_0;
          if (var2 != 0) {
            stackOut_60_0 = this;
            stackOut_60_1 = 3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            break L13;
          } else {
            stackOut_59_0 = this;
            stackOut_59_1 = 2;
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            break L13;
          }
        }
        L14: {
          ((dd) this).field_V = new wp[stackIn_61_1];
          ((dd) this).field_V[0] = ((dd) this).field_X;
          if (var2 == 0) {
            break L14;
          } else {
            ((dd) this).field_V[2] = ((dd) this).field_Y;
            break L14;
          }
        }
        L15: {
          ((dd) this).field_V[1] = ((dd) this).field_T;
          if (!((dd) this).field_R) {
            break L15;
          } else {
            if (var2 == 0) {
              break L15;
            } else {
              var5_ref_String__ = new String[((dd) this).field_Z.length];
              var6_int = var5_ref_String__.length - 1;
              var7_int = 0;
              L16: while (true) {
                if (var7_int >= ((dd) this).field_Z.length) {
                  ((dd) this).field_ab = new ld((Object[]) (Object) var5_ref_String__, var6_int, 150);
                  ((dd) this).field_ab.a(-103, ((dd) this).field_T.field_r + ((dd) this).field_U.field_r, -19 + (((dd) this).field_T.field_p + ((dd) this).field_U.field_v - -((dd) this).field_T.field_v), 18, 126);
                  ((dd) this).field_y.a((ms) (Object) ((dd) this).field_ab, -10295);
                  break L15;
                } else {
                  L17: {
                    var8 = ((dd) this).field_Z[var7_int];
                    if (null == gk.field_o) {
                      break L17;
                    } else {
                      if (var8.field_a != vv.field_b.field_s) {
                        break L17;
                      } else {
                        if (var8.field_g != vv.field_b.field_c) {
                          break L17;
                        } else {
                          var6_int = var7_int;
                          break L17;
                        }
                      }
                    }
                  }
                  var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_g;
                  var7_int++;
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          L19: {
            ((dd) this).field_P = this.a(-73, (qm) this, jh.field_A);
            var5 = ((dd) this).field_P.field_r + ((dd) this).field_P.field_q / 2;
            ((dd) this).field_P.field_q = 150;
            ((dd) this).field_P.field_r = -20 + var5 - ((dd) this).field_P.field_q;
            ((dd) this).field_Q = this.a(-128, (qm) this, dn.field_a);
            ((dd) this).field_Q.field_x = false;
            ((dd) this).field_Q.field_q = ((dd) this).field_P.field_q;
            ((dd) this).field_Q.field_r = var5 - -20;
            if (var2 != 0) {
              break L19;
            } else {
              if (var4 == 0) {
                break L18;
              } else {
                break L19;
              }
            }
          }
          L20: {
            if (var2 == 0) {
              stackOut_77_0 = lw.field_c;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = sl.field_e;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var10 = stackIn_78_0;
          var6 = (wp) (Object) var10;
          var7 = new pk(var10, (qm) null);
          var7.field_r = 0;
          var7.field_q = ((dd) this).field_q;
          var7.field_p = 80;
          var7.field_v = 163;
          var7.field_w = (mh) (Object) new gm(kw.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true);
          ((dd) this).a(var7, 125);
          break L18;
        }
        L21: {
          ((dd) this).field_S = false;
          var6 = this.g((byte) -2);
          if (var6 == null) {
            break L21;
          } else {
            var6.field_C = true;
            break L21;
          }
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == 710) {
          L0: {
            if (param2 != ((dd) this).field_P) {
              if (((dd) this).field_Q != param2) {
                if (param2 == ((dd) this).field_X) {
                  this.a(param2, 0);
                  break L0;
                } else {
                  if (param2 == ((dd) this).field_Y) {
                    this.a(param2, 0);
                    break L0;
                  } else {
                    L1: {
                      if (((dd) this).field_ab != null) {
                        if (((dd) this).field_ab.field_k) {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L1;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_14_0 = stackOut_11_0;
                          break L1;
                        }
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_14_0 = stackOut_9_0;
                        break L1;
                      }
                    }
                    var6 = stackIn_14_0;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      if (param2 != ((dd) this).field_T) {
                        break L0;
                      } else {
                        if (!((dd) this).field_R) {
                          ((dd) this).field_E.a((byte) 98, (pk) (Object) new u(((dd) this).field_E, ku.field_I));
                          break L0;
                        } else {
                          if (ct.field_x > 0) {
                            this.a(param2, param1 + -710);
                            break L0;
                          } else {
                            ((dd) this).field_E.a((byte) 115, (pk) (Object) new kq(((dd) this).field_E));
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                this.h((byte) 103);
                break L0;
              }
            } else {
              this.k(124);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        lt var4 = (lt) (Object) em.field_d.b(-75);
        while (var4 != null) {
            cl.a((byte) -97, var4, param1);
            var4 = (lt) (Object) em.field_d.d((byte) 18);
        }
        qv var5 = (qv) (Object) ak.field_b.b(109);
        while (var5 != null) {
            ss.a(param1, 1000, var5);
            var5 = (qv) (Object) ak.field_b.d((byte) 18);
        }
        if (param0 != 28778) {
            dd.a(-77, -57);
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        wp var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var5 = null;
          if (param2 >= 9) {
            break L0;
          } else {
            var8 = null;
            wp discarded$14 = this.a((ne[]) null, (qm) null, (String) null, (byte) 16);
            break L0;
          }
        }
        L1: {
          if (!((dd) this).field_X.d(-1)) {
            L2: {
              if (null == ((dd) this).field_Y) {
                break L2;
              } else {
                if (((dd) this).field_Y.d(-1)) {
                  var5 = ((dd) this).field_Y;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!((dd) this).field_T.d(-1)) {
              if (((dd) this).field_P.d(-1)) {
                var5 = ((dd) this).field_P;
                break L1;
              } else {
                if (!((dd) this).field_Q.d(-1)) {
                  if (!((dd) this).field_X.field_C) {
                    L3: {
                      if (null == ((dd) this).field_Y) {
                        break L3;
                      } else {
                        if (((dd) this).field_Y.field_C) {
                          var5 = ((dd) this).field_Y;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (!((dd) this).field_T.field_C) {
                      break L1;
                    } else {
                      var5 = ((dd) this).field_T;
                      break L1;
                    }
                  } else {
                    var5 = ((dd) this).field_X;
                    break L1;
                  }
                } else {
                  var5 = ((dd) this).field_Q;
                  break L1;
                }
              }
            } else {
              var5 = ((dd) this).field_T;
              break L1;
            }
          } else {
            var5 = ((dd) this).field_X;
            break L1;
          }
        }
        L4: {
          var6 = param3;
          if (96 == var6) {
            if (((dd) this).field_T == var5) {
              if (null != ((dd) this).field_Y) {
                boolean discarded$15 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                return true;
              } else {
                boolean discarded$16 = ((dd) this).field_X.a((pk) this, (byte) 61);
                return true;
              }
            } else {
              if (var5 == ((dd) this).field_Y) {
                boolean discarded$17 = ((dd) this).field_X.a((pk) this, (byte) 61);
                return true;
              } else {
                if (((dd) this).field_Q != var5) {
                  break L4;
                } else {
                  boolean discarded$18 = ((dd) this).field_P.a((pk) this, (byte) 61);
                  return true;
                }
              }
            }
          } else {
            if (-98 == (var6 ^ -1)) {
              if (((dd) this).field_X == var5) {
                L5: {
                  if (((dd) this).field_Y != null) {
                    boolean discarded$19 = ((dd) this).field_Y.a((pk) this, (byte) 61);
                    break L5;
                  } else {
                    boolean discarded$20 = ((dd) this).field_T.a((pk) this, (byte) 61);
                    break L5;
                  }
                }
                return true;
              } else {
                if (var5 == ((dd) this).field_Y) {
                  boolean discarded$21 = ((dd) this).field_T.a((pk) this, (byte) 61);
                  return true;
                } else {
                  if (var5 != ((dd) this).field_P) {
                    break L4;
                  } else {
                    if (((dd) this).field_Q.field_x) {
                      boolean discarded$22 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                      return true;
                    } else {
                      return super.a(param0, param1, (byte) 98, param3);
                    }
                  }
                }
              }
            } else {
              if (98 == var6) {
                if (var5 == ((dd) this).field_P) {
                  boolean discarded$23 = ((dd) this).field_X.a((pk) this, (byte) 61);
                  return true;
                } else {
                  if (((dd) this).field_Q != var5) {
                    break L4;
                  } else {
                    boolean discarded$24 = ((dd) this).field_T.a((pk) this, (byte) 61);
                    return true;
                  }
                }
              } else {
                if ((var6 ^ -1) != -100) {
                  break L4;
                } else {
                  L6: {
                    if (var5 == ((dd) this).field_X) {
                      break L6;
                    } else {
                      if (var5 == ((dd) this).field_Y) {
                        break L6;
                      } else {
                        if (var5 != ((dd) this).field_T) {
                          break L4;
                        } else {
                          L7: {
                            if (!((dd) this).field_Q.field_x) {
                              boolean discarded$25 = ((dd) this).field_P.a((pk) this, (byte) 61);
                              break L7;
                            } else {
                              boolean discarded$26 = ((dd) this).field_Q.a((pk) this, (byte) 61);
                              break L7;
                            }
                          }
                          return true;
                        }
                      }
                    }
                  }
                  boolean discarded$27 = ((dd) this).field_P.a((pk) this, (byte) 61);
                  return true;
                }
              }
            }
          }
        }
        return super.a(param0, param1, (byte) 98, param3);
    }

    private final wp a(ne[] param0, qm param1, String param2, byte param3) {
        wp var5 = new wp(param2, param1);
        var5.field_w = (mh) (Object) new uv(param0);
        nd var6 = ((dd) this).field_U;
        wp var7 = var5;
        int var8 = -20 % ((56 - param3) / 42);
        var6.a(var6.field_K, 0, (pk) (Object) var7);
        ((dd) this).field_U.c(false);
        return var5;
    }

    private final void e(boolean param0) {
        int var3 = 0;
        wp var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        wp[] var6 = ((dd) this).field_V;
        wp[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.field_C = var4 == ((dd) this).field_O ? true : false;
        }
        if (!param0) {
            ((dd) this).field_Y = null;
        }
    }

    private final void a(wp param0, int param1) {
        int var4 = 0;
        cd var5 = null;
        if (param1 != 0) {
            this.h((byte) 113);
        }
        ((dd) this).field_O = param0;
        boolean discarded$0 = param0.a((pk) this, (byte) 61);
        wp var3 = this.g((byte) -2);
        ((dd) this).field_Q.field_x = param0 != var3 ? true : false;
        if (param0 == ((dd) this).field_T) {
            if (var3 == param0) {
                if (null != ((dd) this).field_ab) {
                    var4 = ((dd) this).field_ab.g(param1 + -126);
                    var5 = ((dd) this).field_Z[var4];
                    if (var5.field_a == vv.field_b.field_s) {
                        // if_icmpeq L141
                    }
                    ((dd) this).field_Q.field_x = true;
                }
            }
        }
        this.e(true);
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((dd) this).field_O == ((dd) this).field_X) {
            ib.d(1);
            um.b(0);
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
              ua.f(-5812);
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
        wp var4 = new wp(param2, param1);
        if (param0 >= -10) {
            return null;
        }
        var4.field_w = (mh) (Object) new ue();
        int var5 = -46 + ((dd) this).field_p;
        var4.a(127, 15, var5, 30, ((dd) this).field_q + -30);
        ((dd) this).a((pk) (Object) var4, 80);
        return var4;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        wp[] var5_ref_wp__ = null;
        int var5 = 0;
        int var6 = 0;
        wp var7 = null;
        int var8 = 0;
        wp[] var9 = null;
        L0: {
          var8 = Sumoblitz.field_L ? 1 : 0;
          super.a(param0, 124, param2, param3);
          if (sl.field_d) {
            param2.c((byte) 120);
            var9 = ((dd) this).field_V;
            var5_ref_wp__ = var9;
            var6 = 0;
            L1: while (true) {
              if (var9.length <= var6) {
                break L0;
              } else {
                var7 = var9[var6];
                if (var7.field_k) {
                  boolean discarded$1 = var7.a((pk) this, (byte) 61);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          var5 = 69 % ((-25 - param1) / 45);
          if (((dd) this).field_W) {
            if (((dd) this).field_ab == null) {
              break L2;
            } else {
              if (((dd) this).field_ab.i(20) == ((dd) this).field_S) {
                break L2;
              } else {
                this.a(((dd) this).field_T, 0);
                ((dd) this).field_S = ((dd) this).field_ab.i(20);
                break L2;
              }
            }
          } else {
            if (((dd) this).field_ab == null) {
              break L2;
            } else {
              if (((dd) this).field_ab.i(20) == ((dd) this).field_S) {
                break L2;
              } else {
                this.a(((dd) this).field_T, 0);
                ((dd) this).field_S = ((dd) this).field_ab.i(20);
                break L2;
              }
            }
          }
        }
    }

    static {
    }
}
