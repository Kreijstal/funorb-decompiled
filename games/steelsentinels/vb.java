/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vb {
    static gh[] field_a;
    static boolean field_e;
    static boolean field_c;
    static String field_h;
    static int field_g;
    static String field_d;
    static int[] field_b;
    private java.util.zip.Inflater field_f;

    final static void a(gh param0, byte param1) {
        gh stackIn_13_0 = null;
        gh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gh stackIn_16_0 = null;
        gh stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        gh stackIn_42_0 = null;
        gk[] stackIn_42_1 = null;
        gh stackIn_43_0 = null;
        gk[] stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gh var5 = null;
        int var6 = 0;
        gh var7 = null;
        int var8 = 0;
        gh var9_ref_gh = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gh var13 = null;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var14 = new gh();
              var14.field_nb = 0;
              var14.field_ub = 4;
              var14.field_I = pa.field_g;
              var14.field_L = (mi) ((Object) fk.field_d);
              var14.field_Fb = 0;
              var14.field_Ib = 15;
              var14.field_Kb = 1;
              var3 = 0;
              var4 = 20;
              if (null != param0.field_M) {
                param0.field_M.g(param1 + -13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = new gh("", var14);
              var5.field_S = vf.field_c;
              var5.a(0, 0, 18, 0, 110);
              param0.a(var5, 120);
              var6 = hl.field_v.i(param1 ^ -97);
              var7 = new gh(-1L, (gh) null);
              var7.field_I = tk.field_t;
              var8 = (var6 - -1) / 2 * 51 + 32;
              if (param1 == 19) {
                break L2;
              } else {
                field_a = (gh[]) null;
                break L2;
              }
            }
            var7.a(0, var4, var8, 0, 110);
            param0.a(var7, 121);
            var4 += 3;
            var9_ref_gh = new gh("", ei.field_n);
            var10 = 0;
            var11 = 0;
            L3: while (true) {
              L4: {
                if (var6 <= var11) {
                  break L4;
                } else {
                  if (dn.field_bc[var11] == di.field_c[var11]) {
                    var11++;
                    continue L3;
                  } else {
                    var10 = 1;
                    break L4;
                  }
                }
              }
              L5: {
                stackIn_13_0 = (gh) (var9_ref_gh);

                if (var10 == 0) {
                  stackIn_14_0 = (gh) ((Object) stackIn_13_0);
                  stackIn_14_1 = 9211020;
                  break L5;
                } else {
                  stackIn_14_0 = (gh) ((Object) stackIn_13_0);
                  stackIn_14_1 = 1021128;
                  break L5;
                }
              }
              L6: {
                stackIn_14_0.field_nb = stackIn_14_1;
                stackIn_16_0 = (gh) (var9_ref_gh);

                if (var10 == 0) {
                  stackIn_17_0 = (gh) ((Object) stackIn_16_0);
                  stackIn_17_1 = cb.field_a;
                  break L6;
                } else {
                  stackIn_17_0 = (gh) ((Object) stackIn_16_0);
                  stackIn_17_1 = td.field_Vb;
                  break L6;
                }
              }
              L7: {
                stackIn_17_0.field_S = stackIn_17_1;
                if (var10 != 0) {
                  break L7;
                } else {
                  var9_ref_gh.field_I = lj.field_b;
                  break L7;
                }
              }
              L8: {
                var9_ref_gh.a(0, var4, 18, 3, 104);
                var9_ref_gh.field_Kb = 1;
                param0.a(var9_ref_gh, 118);
                if (var10 == 0) {
                  break L8;
                } else {
                  stackIn_21_0 = param0.field_Rb;
                  stackIn_21_1 = oh.field_f;
                  if (stackIn_21_0 > stackIn_21_1) {
                    break L8;
                  } else {
                    if (oh.field_f >= param0.field_Rb - -110) {
                      break L8;
                    } else {
                      if (pi.field_c < param0.field_cb + var4) {
                        break L8;
                      } else {
                        if (18 + (var4 + param0.field_cb) <= pi.field_c) {
                          break L8;
                        } else {
                          pa.field_e = -2;
                          var9_ref_gh.field_I = tk.field_t;
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
              var4 += 22;
              var3 = 6;
              var4 += 4;
              var9 = 0;
              L9: while (true) {
                if (var6 <= var9) {
                  break L0;
                } else {
                  L10: {
                    if (-2 != (var9 ^ -1)) {
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var15 = new gh("", ei.field_n);
                      var15.a(0, var4, 47, var3, 47);
                      param0.a(var15, param1 ^ 101);
                      if (oh.field_f < var3 + param0.field_Rb) {
                        break L12;
                      } else {
                        if (oh.field_f >= 47 + param0.field_Rb - -var3) {
                          break L12;
                        } else {
                          if (pi.field_c < param0.field_cb + var4) {
                            break L12;
                          } else {
                            if (param0.field_cb - (-var4 + -47) <= pi.field_c) {
                              break L12;
                            } else {
                              pa.field_e = var9;
                              var15.field_I = be.field_f;
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if ((ij.field_Y ^ -1) <= -1) {
                        break L13;
                      } else {
                        if ((t.field_h ^ -1) > -1) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var15.field_I = be.field_f;
                    break L11;
                  }
                  L14: {
                    if ((di.field_c[var9] ^ -1) == 0) {
                      break L14;
                    } else {
                      L15: {
                        var13 = new gh();
                        var16 = var13;
                        stackIn_42_0 = (gh) (var13);

                        stackIn_42_1 = ie.field_d;

                        if (t.a(fe.field_D, di.field_c[var9], -20370)) {
                          stackIn_43_0 = (gh) ((Object) stackIn_42_0);
                          stackIn_43_1 = (gk[]) ((Object) stackIn_42_1);
                          stackIn_43_2 = di.field_c[var9];
                          break L15;
                        } else {
                          stackIn_43_0 = (gh) ((Object) stackIn_42_0);
                          stackIn_43_1 = (gk[]) ((Object) stackIn_42_1);
                          stackIn_43_2 = di.field_c[var9] - -64;
                          break L15;
                        }
                      }
                      stackIn_43_0.field_Pb = ((gk) (Object) stackIn_43_1[stackIn_43_2]).a();
                      var16.a(0, var4 + 3, 40, var3 + 3, 40);
                      param0.a(var16, 118);
                      break L14;
                    }
                  }
                  L16: {
                    var3 = 63 - var3;
                    if (var3 == 6) {
                      var4 += 51;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var9++;
                  continue L9;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("vb.A(");

            if (param0 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L17;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L17;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ')');
        }
    }

    final void a(gi param0, byte[] param1, boolean param2) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (param0.field_t[param0.field_p] != 31) {
                    break L1;
                  } else {
                    if (-117 != param0.field_t[param0.field_p - -1]) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_f != null) {
                          break L2;
                        } else {
                          this.field_f = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_f.setInput(param0.field_t, param0.field_p + 10, param0.field_t.length + (-10 + -param0.field_p) + -8);
                          if (param2) {
                            this.field_f.inflate(param1);
                            decompiledRegionSelector0 = 1;
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        this.field_f.reset();
                        throw new RuntimeException("");
                      }
                      if (decompiledRegionSelector0 == 0) {
                        decompiledRegionSelector1 = 0;
                        break L0;
                      } else {
                        this.field_f.reset();
                        decompiledRegionSelector1 = 1;
                        break L0;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var4_ref);

                stackIn_15_1 = new StringBuilder().append("vb.F(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        byte[] var5;
        var2 = (-640 + re.field_Z) / 2;
        var3 = an.field_h * an.field_h;
        var4 = -(param1 * param1) + var3;
        ql.field_ec.a(0, 90, -210 + (pb.field_j - 4), -(var4 * 199 / var3) + var2, 199);
        gl.field_y.a(0, 0, -120 + pb.field_j - 4, var4 * 438 / var3 + (var2 + 202), 438);
        if (param0 <= 8) {
          var5 = (byte[]) null;
          vb.a(-9, (byte[]) null, (byte) 24);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            return;
        }
        field_h = null;
    }

    public vb() {
        this(-1, 1000000, 1000000);
    }

    final static boolean b(int param0) {
        int var1 = 61 % ((24 - param0) / 62);
        return t.a(rn.field_D, 55, -20370);
    }

    final static rh a(int param0, byte[] param1, byte param2) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -30) {
                break L1;
              } else {
                var4 = (byte[]) null;
                vb.a(-34, (byte[]) null, (byte) 32);
                break L1;
              }
            }
            var3 = new rh(param1);
            ol.field_Vb.a(3, var3);
            vm.a(param0, param2 + -39, var3);
            stackIn_3_0 = (rh) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("vb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private vb(int param0, int param1, int param2) {
    }

    static {
        field_a = new gh[4];
        field_e = false;
        field_h = "<%1> couldn't find cover in time";
        field_b = new int[]{2, 20, 21, 6, 37, 45, 5, 12, 13};
    }
}
