/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

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
        int var3 = 0;
        int var4 = 0;
        gh var5 = null;
        int var6 = 0;
        gh var7 = null;
        int var8 = 0;
        gh var9_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gh var13 = null;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        gh stackIn_12_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gh stackIn_15_0 = null;
        gh stackIn_16_0 = null;
        gh stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        gh stackIn_43_0 = null;
        gk[] stackIn_43_1 = null;
        gh stackIn_44_0 = null;
        gk[] stackIn_44_1 = null;
        gh stackIn_45_0 = null;
        gk[] stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        gh stackOut_11_0 = null;
        gh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        gh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        gh stackOut_14_0 = null;
        gh stackOut_16_0 = null;
        String stackOut_16_1 = null;
        gh stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        gh stackOut_42_0 = null;
        gk[] stackOut_42_1 = null;
        gh stackOut_44_0 = null;
        gk[] stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        gh stackOut_43_0 = null;
        gk[] stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        L0: {
          var12 = SteelSentinels.field_G;
          var14 = new gh();
          var14.field_nb = 0;
          var14.field_ub = 4;
          var14.field_I = pa.field_g;
          var14.field_L = (mi) (Object) fk.field_d;
          var14.field_Fb = 0;
          var14.field_Ib = 15;
          var14.field_Kb = 1;
          var3 = 0;
          var4 = 20;
          if (null != param0.field_M) {
            param0.field_M.g(param1 + -13);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5 = new gh("", var14);
          var5.field_S = vf.field_c;
          var5.a(0, 0, 18, 0, 110);
          param0.a(var5, 120);
          var6 = hl.field_v.i(param1 ^ -97);
          var7 = new gh(-1L, (gh) null);
          var7.field_I = tk.field_t;
          var8 = (var6 - -1) / 2 * 51 + 32;
          if (param1 == 19) {
            break L1;
          } else {
            field_a = null;
            break L1;
          }
        }
        var7.a(0, var4, var8, 0, 110);
        param0.a(var7, 121);
        var4 += 3;
        var9_ref = new gh("", ei.field_n);
        var10 = 0;
        var11 = 0;
        L2: while (true) {
          L3: {
            if (var6 <= var11) {
              break L3;
            } else {
              if (dn.field_bc[var11] == di.field_c[var11]) {
                var11++;
                continue L2;
              } else {
                var10 = 1;
                break L3;
              }
            }
          }
          L4: {
            stackOut_11_0 = (gh) var9_ref;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var10 == 0) {
              stackOut_13_0 = (gh) (Object) stackIn_13_0;
              stackOut_13_1 = 9211020;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L4;
            } else {
              stackOut_12_0 = (gh) (Object) stackIn_12_0;
              stackOut_12_1 = 1021128;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L4;
            }
          }
          L5: {
            stackIn_14_0.field_nb = stackIn_14_1;
            stackOut_14_0 = (gh) var9_ref;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (var10 == 0) {
              stackOut_16_0 = (gh) (Object) stackIn_16_0;
              stackOut_16_1 = cb.field_a;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L5;
            } else {
              stackOut_15_0 = (gh) (Object) stackIn_15_0;
              stackOut_15_1 = td.field_Vb;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L5;
            }
          }
          L6: {
            stackIn_17_0.field_S = stackIn_17_1;
            if (var10 != 0) {
              break L6;
            } else {
              var9_ref.field_I = lj.field_b;
              break L6;
            }
          }
          L7: {
            var9_ref.a(0, var4, 18, 3, 104);
            var9_ref.field_Kb = 1;
            param0.a(var9_ref, 118);
            if (var10 == 0) {
              break L7;
            } else {
              stackOut_20_0 = param0.field_Rb;
              stackOut_20_1 = oh.field_f;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              if (stackIn_21_0 > stackIn_21_1) {
                break L7;
              } else {
                if (oh.field_f >= param0.field_Rb - -110) {
                  break L7;
                } else {
                  if (pi.field_c < param0.field_cb + var4) {
                    break L7;
                  } else {
                    if (18 + (var4 + param0.field_cb) <= pi.field_c) {
                      break L7;
                    } else {
                      pa.field_e = -2;
                      var9_ref.field_I = tk.field_t;
                      break L7;
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
          L8: while (true) {
            if (var6 > var9) {
              L9: {
                if (-2 != (var9 ^ -1)) {
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var15 = new gh("", ei.field_n);
                  var15.a(0, var4, 47, var3, 47);
                  param0.a(var15, param1 ^ 101);
                  if (oh.field_f < var3 + param0.field_Rb) {
                    break L11;
                  } else {
                    if (oh.field_f >= 47 + param0.field_Rb - -var3) {
                      break L11;
                    } else {
                      if (pi.field_c < param0.field_cb + var4) {
                        break L11;
                      } else {
                        if (param0.field_cb - (-var4 + -47) <= pi.field_c) {
                          break L11;
                        } else {
                          pa.field_e = var9;
                          var15.field_I = be.field_f;
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if ((ij.field_Y ^ -1) <= -1) {
                    break L12;
                  } else {
                    if ((t.field_h ^ -1) > -1) {
                      break L10;
                    } else {
                      break L12;
                    }
                  }
                }
                var15.field_I = be.field_f;
                break L10;
              }
              L13: {
                if ((di.field_c[var9] ^ -1) == 0) {
                  break L13;
                } else {
                  L14: {
                    var13 = new gh();
                    var16 = var13;
                    stackOut_42_0 = (gh) var13;
                    stackOut_42_1 = ie.field_d;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    if (t.a(fe.field_D, di.field_c[var9], -20370)) {
                      stackOut_44_0 = (gh) (Object) stackIn_44_0;
                      stackOut_44_1 = (gk[]) (Object) stackIn_44_1;
                      stackOut_44_2 = di.field_c[var9];
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      stackIn_45_2 = stackOut_44_2;
                      break L14;
                    } else {
                      stackOut_43_0 = (gh) (Object) stackIn_43_0;
                      stackOut_43_1 = (gk[]) (Object) stackIn_43_1;
                      stackOut_43_2 = di.field_c[var9] - -64;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      stackIn_45_2 = stackOut_43_2;
                      break L14;
                    }
                  }
                  stackIn_45_0.field_Pb = ((gk) (Object) stackIn_45_1[stackIn_45_2]).a();
                  var16.a(0, var4 + 3, 40, var3 + 3, 40);
                  param0.a(var16, 118);
                  break L13;
                }
              }
              var3 = 63 - var3;
              if (var3 == 6) {
                var4 += 51;
                var9++;
                continue L8;
              } else {
                var9++;
                continue L8;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(gi param0, byte[] param1, boolean param2) {
        try {
            if (param0.field_t[param0.field_p] == 31) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (((vb) this).field_f == null) {
                ((vb) this).field_f = new java.util.zip.Inflater(true);
            }
            ((vb) this).field_f.setInput(param0.field_t, param0.field_p + 10, param0.field_t.length + (-10 + -param0.field_p) + -8);
            if (!param2) {
                return;
            }
            try {
                int discarded$0 = ((vb) this).field_f.inflate(param1);
            } catch (Exception exception) {
                ((vb) this).field_f.reset();
                throw new RuntimeException("");
            }
            ((vb) this).field_f.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = (-640 + re.field_Z) / 2;
        int var3 = an.field_h * an.field_h;
        int var4 = -(param1 * param1) + var3;
        ql.field_ec.a(0, 90, -210 + (pb.field_j - 4), -(var4 * 199 / var3) + var2, 199);
        gl.field_y.a(0, 0, -120 + pb.field_j - 4, var4 * 438 / var3 + (var2 + 202), 438);
        if (param0 > 8) {
            return;
        }
        Object var5 = null;
        rh discarded$0 = vb.a(-9, (byte[]) null, (byte) 24);
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
        Object var4 = null;
        L0: {
          if (param2 == -30) {
            break L0;
          } else {
            var4 = null;
            rh discarded$2 = vb.a(-34, (byte[]) null, (byte) 32);
            break L0;
          }
        }
        var3 = new rh(param1);
        ol.field_Vb.a(3, (ck) (Object) var3);
        vm.a(param0, param2 + -39, var3);
        return var3;
    }

    private vb(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gh[4];
        field_e = false;
        field_h = "<%1> couldn't find cover in time";
        field_b = new int[]{2, 20, 21, 6, 37, 45, 5, 12, 13};
    }
}
