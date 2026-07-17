/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sq {
    static ao field_W;
    private j field_Y;
    static boolean[] field_ab;
    private String field_bb;
    private ja field_Z;
    private int field_X;
    static int field_cb;

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        re var6 = null;
        rk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ja var15 = null;
        ja var16 = null;
        ja var17 = null;
        ja var18 = null;
        L0: {
          L1: {
            var13 = ZombieDawnMulti.field_E ? 1 : 0;
            var6 = ((km) this).field_Y.d(102);
            if (var6 == h.field_H) {
              break L1;
            } else {
              if (var6 != ua.field_I) {
                var5 = ((km) this).field_Y.c(-120);
                if (var5 == null) {
                  var5 = ((km) this).field_bb;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = ki.field_n;
          break L0;
        }
        L2: {
          if (!var5.equals((Object) (Object) ((km) this).field_j)) {
            ((km) this).field_j = var5;
            ((km) this).a((byte) 94);
            break L2;
          } else {
            break L2;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = ((km) this).field_Y.d(97);
        var8 = (rk) (Object) ((km) this).field_h;
        var9 = ((km) this).field_y + param3;
        var10 = var8.a((cf) this, 0, param1) + (var8.a((cf) this, param0 + -99).a((byte) -111) >> 1);
        if (h.field_H == var6) {
          var18 = rj.field_I[0];
          var11 = var18.field_z << 1;
          var12 = var18.field_u << 1;
          if (((km) this).field_Z != null) {
            if (((km) this).field_Z.field_x >= var11) {
              if (((km) this).field_Z.field_w < var12) {
                ((km) this).field_Z = new ja(var11, var12);
                r.a(0, ((km) this).field_Z);
                var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((km) this).field_X << 10, 4096);
                int discarded$8 = 1;
                ql.a();
                ((km) this).field_Z.e(var9 - (var18.field_z >> 1), var10 + -var18.field_u, 256);
                return;
              } else {
                r.a(0, ((km) this).field_Z);
                oo.b();
                var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((km) this).field_X << 10, 4096);
                int discarded$9 = 1;
                ql.a();
                ((km) this).field_Z.e(var9 - (var18.field_z >> 1), var10 + -var18.field_u, 256);
                return;
              }
            } else {
              ((km) this).field_Z = new ja(var11, var12);
              r.a(0, ((km) this).field_Z);
              var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((km) this).field_X << 10, 4096);
              int discarded$10 = 1;
              ql.a();
              ((km) this).field_Z.e(var9 - (var18.field_z >> 1), var10 + -var18.field_u, 256);
              return;
            }
          } else {
            ((km) this).field_Z = new ja(var11, var12);
            r.a(0, ((km) this).field_Z);
            var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((km) this).field_X << 10, 4096);
            int discarded$11 = 1;
            ql.a();
            ((km) this).field_Z.e(var9 - (var18.field_z >> 1), var10 + -var18.field_u, 256);
            return;
          }
        } else {
          if (ua.field_I != var6) {
            if (jq.field_b == var6) {
              var15 = rj.field_I[2];
              var15.e(var9, var10 + -(var15.field_w >> 1), 256);
              return;
            } else {
              L3: {
                if (var6 != db.field_b) {
                  break L3;
                } else {
                  var16 = rj.field_I[1];
                  var16.e(var9, -(var16.field_w >> 1) + var10, 256);
                  break L3;
                }
              }
              return;
            }
          } else {
            var17 = rj.field_I[0];
            var11 = var17.field_z << 1;
            var12 = var17.field_u << 1;
            if (((km) this).field_Z != null) {
              if (((km) this).field_Z.field_x >= var11) {
                if (((km) this).field_Z.field_w < var12) {
                  ((km) this).field_Z = new ja(var11, var12);
                  r.a(0, ((km) this).field_Z);
                  var17.a(112, 144, var17.field_z << 4, var17.field_u << 4, -((km) this).field_X << 10, 4096);
                  int discarded$12 = 1;
                  ql.a();
                  ((km) this).field_Z.e(var9 - (var17.field_z >> 1), var10 + -var17.field_u, 256);
                  return;
                } else {
                  r.a(0, ((km) this).field_Z);
                  oo.b();
                  var17.a(112, 144, var17.field_z << 4, var17.field_u << 4, -((km) this).field_X << 10, 4096);
                  int discarded$13 = 1;
                  ql.a();
                  ((km) this).field_Z.e(var9 - (var17.field_z >> 1), var10 + -var17.field_u, 256);
                  return;
                }
              } else {
                ((km) this).field_Z = new ja(var11, var12);
                r.a(0, ((km) this).field_Z);
                var17.a(112, 144, var17.field_z << 4, var17.field_u << 4, -((km) this).field_X << 10, 4096);
                int discarded$14 = 1;
                ql.a();
                ((km) this).field_Z.e(var9 - (var17.field_z >> 1), var10 + -var17.field_u, 256);
                return;
              }
            } else {
              ((km) this).field_Z = new ja(var11, var12);
              r.a(0, ((km) this).field_Z);
              var17.a(112, 144, var17.field_z << 4, var17.field_u << 4, -((km) this).field_X << 10, 4096);
              int discarded$15 = 1;
              ql.a();
              ((km) this).field_Z.e(var9 - (var17.field_z >> 1), var10 + -var17.field_u, 256);
              return;
            }
          }
        }
    }

    final static void a() {
        int var2_int = 0;
        RuntimeException var2 = null;
        br var3 = null;
        int var4 = 0;
        ab var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = (ab) (Object) ig.field_a.c(92);
            L1: while (true) {
              if (var5 == null) {
                var2_int = 18;
                var3 = so.field_j.c(48);
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    qo.b(true, 4);
                    var3 = so.field_j.b(6);
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = 4;
                ih.a((byte) 99, var5);
                var5 = (ab) (Object) ig.field_a.b(6);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "km.D(" + 4 + 44 + 73 + 41);
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            ((km) this).field_X = ((km) this).field_X + 1;
            if (param0 != -5407) {
                km.i(56);
            }
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "km.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_W = null;
        field_ab = null;
    }

    final static void a(ul param0) {
        RuntimeException var2 = null;
        cj var3 = null;
        cj var5 = null;
        cj var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            pa.field_T = fl.a("basic", "display_name_changed", param0, 11091);
            eg.field_B = new cd(0L, oj.field_Q, iq.field_a, dg.field_I);
            gl.field_L = new cd(0L, oj.field_Q, kg.field_i, qh.field_d);
            pa.field_O = new cj(0L, (cj) null);
            dp.field_b = new cj(0L, vo.field_m);
            dp.field_b.field_R = 1;
            bi.field_f = new cj(0L, vd.field_a, qd.field_r);
            jb.field_c = new cj(0L, pn.field_g, ko.field_h);
            lk.field_J = new cj(0L, cm.field_b);
            pa.field_O.a((byte) 50, dp.field_b);
            pa.field_O.a((byte) 50, bi.field_f);
            pa.field_O.a((byte) 50, jb.field_c);
            pa.field_O.a((byte) 50, (cj) (Object) eg.field_B);
            pa.field_O.a((byte) 50, lk.field_J);
            eg.field_B.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            eg.field_B.field_Jb.field_Jb.field_lb = 1;
            var5 = eg.field_B.field_Jb.field_Jb;
            var6 = var5;
            var6.field_R = 1;
            gl.field_L.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            gl.field_L.field_Jb.field_Jb.field_lb = 1;
            var3 = gl.field_L.field_Jb.field_Jb;
            var3.field_R = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("km.C(");
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
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -125 + 41);
        }
    }

    final String d(byte param0) {
        int var2 = 82 / ((param0 - 53) / 57);
        return null;
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("km.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void h() {
        if (!(og.field_N)) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(-86, false);
        a.field_b = 0;
    }

    final static ka b(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka var8_ref_ka = null;
        int var9 = 0;
        ka var9_ref_ka = null;
        int var10 = 0;
        String var10_ref_String = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = null;
        tn.field_A.field_Gb.field_Cb.e(-30986);
        var5 = 0;
        var6 = 0;
        var7 = -1 + uf.field_g;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (uf.field_g <= var8) {
                L2: {
                  var8 = -var7 - (-var6 - (tn.field_A.field_Gb.field_z + tn.field_A.field_Gb.field_I));
                  tn.field_A.field_Gb.field_Q = tn.field_A.field_Gb.field_Q + var8;
                  var9 = 121;
                  tn.field_A.field_Gb.field_z = tn.field_A.field_Gb.field_z - var8;
                  if (bn.field_b) {
                    tn.field_A.field_Gb.field_z = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                tn.field_A.field_Gb.field_I = var7 - tn.field_A.field_Gb.field_z;
                if (!bn.field_b) {
                  L3: {
                    if (!sq.field_N) {
                      break L3;
                    } else {
                      if (null != lj.field_v) {
                        sp.field_h = true;
                        break L3;
                      } else {
                        var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                        if (sp.field_h) {
                          L4: {
                            tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                            if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L4;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L4;
                            }
                          }
                          sp.field_h = stackIn_65_0 != 0;
                          return (ka) var4;
                        } else {
                          L5: {
                            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                            if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                              stackOut_60_0 = 0;
                              stackIn_61_0 = stackOut_60_0;
                              break L5;
                            } else {
                              stackOut_59_0 = 1;
                              stackIn_61_0 = stackOut_59_0;
                              break L5;
                            }
                          }
                          sp.field_h = stackIn_61_0 != 0;
                          return (ka) var4;
                        }
                      }
                    }
                  }
                  var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                  if (sp.field_h) {
                    L6: {
                      tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                      tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                      if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        stackOut_75_0 = 0;
                        stackIn_76_0 = stackOut_75_0;
                        break L6;
                      } else {
                        stackOut_74_0 = 1;
                        stackIn_76_0 = stackOut_74_0;
                        break L6;
                      }
                    }
                    sp.field_h = stackIn_76_0 != 0;
                    return (ka) var4;
                  } else {
                    L7: {
                      tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                      if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        stackOut_71_0 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        break L7;
                      } else {
                        stackOut_70_0 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        break L7;
                      }
                    }
                    sp.field_h = stackIn_72_0 != 0;
                    return (ka) var4;
                  }
                } else {
                  tn.field_A.field_Gb.field_mb = 0;
                  bn.field_b = false;
                  tn.field_A.field_Gb.field_Q = -tn.field_A.field_Gb.field_z + tn.field_A.field_Jb.field_z;
                  sp.field_h = true;
                  if (sq.field_N) {
                    L8: {
                      if (null != lj.field_v) {
                        sp.field_h = true;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (!sp.field_h) {
                      L9: {
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L9;
                        } else {
                          stackOut_51_0 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L9;
                        }
                      }
                      sp.field_h = stackIn_53_0 != 0;
                      return (ka) var4;
                    } else {
                      L10: {
                        tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_48_0 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          break L10;
                        } else {
                          stackOut_47_0 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L10;
                        }
                      }
                      sp.field_h = stackIn_49_0 != 0;
                      return (ka) var4;
                    }
                  } else {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                      L11: {
                        tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L11;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L11;
                        }
                      }
                      sp.field_h = stackIn_40_0 != 0;
                      return (ka) var4;
                    } else {
                      L12: {
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L12;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L12;
                        }
                      }
                      sp.field_h = stackIn_36_0 != 0;
                      return (ka) var4;
                    }
                  }
                }
              } else {
                var9_ref_ka = uk.field_M[var8];
                if (var9_ref_ka.field_q != null) {
                  tn.field_A.field_Gb.a((byte) 50, var9_ref_ka.field_q);
                  var9_ref_ka.field_q.a(param2, var7, var9_ref_ka.field_q.e(0), param3, -3344);
                  var7 = var7 + param2;
                  if (0 != var9_ref_ka.field_q.field_T) {
                    var4 = (Object) (Object) var9_ref_ka;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L13: {
              var8_ref_ka = uk.field_M[var7];
              var9 = 0;
              if (nh.field_m) {
                break L13;
              } else {
                if (var5 >= sj.field_m) {
                  break L13;
                } else {
                  var10 = ga.a(var8_ref_ka.field_l, true);
                  if (var8_ref_ka.a(true) >= var10) {
                    L14: {
                      if (var8_ref_ka.field_k) {
                        break L14;
                      } else {
                        if (hp.a(var8_ref_ka.field_e, 1020)) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var9 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var9 != 0) {
              L15: {
                if (var8_ref_ka.field_q == null) {
                  break L15;
                } else {
                  if (bn.field_b) {
                    break L15;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L16: {
                if (null != var8_ref_ka.field_q) {
                  break L16;
                } else {
                  id.field_D = id.field_D + 1;
                  break L16;
                }
              }
              var10_ref_String = bh.a(-126, var8_ref_ka);
              var11 = var10_ref_String + fm.c(var8_ref_ka.field_d);
              int discarded$1 = -63;
              var12 = cj.a(var8_ref_ka);
              var8_ref_ka.field_q = new cj(0L, qq.field_f, var11);
              var6 = var6 + param2;
              var8_ref_ka.field_q.field_xb = (8355711 & qq.field_f.field_xb >> 1) + var12 + -((var12 & 16711422) >> 1);
              var8_ref_ka.field_q.field_ob = (8355711 & qq.field_f.field_ob >> 1) + (var12 - ((var12 & 16711422) >> 1));
              var8_ref_ka.field_q.field_yb = w.field_A;
              var8_ref_ka.field_q.field_M = var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_ka.field_q = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    km(j param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (nl) (Object) pa.g());
        int discarded$0 = 120;
        try {
            ((km) this).field_bb = param1;
            ((km) this).field_Y = param0;
            ((km) this).b(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "km.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new ao(4, 1, 1, 1);
        field_cb = 480;
    }
}
