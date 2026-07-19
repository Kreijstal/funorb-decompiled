/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends java.awt.Canvas {
    private java.awt.Component field_d;
    static dk field_a;
    static char[] field_b;
    static int[] field_e;
    static int field_c;
    static String[] field_f;

    public static void b(byte param0) {
        int discarded$0 = 0;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 61) {
            gh var2 = (gh) null;
            discarded$0 = pi.a((byte) 56, (gh) null, -94, true);
        }
        field_e = null;
    }

    pi(java.awt.Component param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, gh param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var11 = null;
        gh var12 = null;
        int var13 = 0;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        int stackIn_4_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_40_0 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            if (!he.a((byte) 116)) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -17) {
                  break L1;
                } else {
                  field_a = (dk) null;
                  break L1;
                }
              }
              var4_int = qa.field_O;
              var6 = 1;
              var7 = 0;
              L2: while (true) {
                if (var7 >= 8) {
                  stackOut_40_0 = param2;
                  stackIn_41_0 = stackOut_40_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  var9 = 0;
                  L3: while (true) {
                    if (35 <= var9) {
                      var7++;
                      continue L2;
                    } else {
                      if (var7 == pe.field_O[var9]) {
                        L4: {
                          var5 = 2;
                          if (t.a(fe.field_D, var9, -20370)) {
                            var5 = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (!param3) {
                              if (var5 != 0) {
                                if (ad.a(var9, nk.f((byte) -28), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                                  break L6;
                                } else {
                                  var9++;
                                  continue L3;
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              if (var5 == 0) {
                                break L6;
                              } else {
                                var9++;
                                continue L3;
                              }
                            }
                          }
                          L7: {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              if (qf.field_h[var9] <= li.field_v) {
                                var5 = 1;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var6 != 0) {
                              L9: {
                                var6 = 0;
                                var14 = new gh(-1L, (gh) null);
                                var14.field_Pb = gj.field_a;
                                var14.field_Kb = 2;
                                var14.a(0, param2, 18, 0, var4_int);
                                param1.a(var14, 126);
                                if (!param3) {
                                  stackOut_33_0 = he.field_h;
                                  stackIn_34_0 = stackOut_33_0;
                                  break L9;
                                } else {
                                  stackOut_32_0 = qj.field_c;
                                  stackIn_34_0 = stackOut_32_0;
                                  break L9;
                                }
                              }
                              var11 = stackIn_34_0;
                              var12 = new gh(-1L, kh.field_s, var11);
                              var12.field_nb = 0;
                              var12.field_L = (mi) ((Object) pl.field_U);
                              var12.a(0, param2, 18, 0, var4_int);
                              var12.field_Fb = 1;
                              var12.field_sb = 1;
                              var12.field_I = null;
                              var12.field_Kb = 1;
                              param1.a(var12, 125);
                              param2 = param2 + var12.field_Lb;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (var8 != 0) {
                              break L10;
                            } else {
                              var8 = 1;
                              var15 = new gh(-1L, kh.field_s, si.field_D[var7]);
                              var15.field_Kb = 1;
                              var15.field_nb = 11119017;
                              param2 += 2;
                              var15.field_I = lj.field_b;
                              var15.a(0, param2, 15, 0, var4_int);
                              param2 += 15;
                              param1.a(var15, 121);
                              break L10;
                            }
                          }
                          param2 += 2;
                          var16 = lj.a(var4_int, var9, true, param3, var5, 49);
                          var16.a(0, param2, 49, 0, var4_int);
                          param2 += 49;
                          param1.a(var16, 126);
                          break L5;
                        }
                        var9++;
                        continue L3;
                      } else {
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("pi.C(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_41_0;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pi.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static a a(byte param0) {
        try {
            Throwable var1 = null;
            a stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            a stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 > 14) {
                    break L1;
                  } else {
                    field_e = (int[]) null;
                    break L1;
                  }
                }
                stackOut_2_0 = (a) (Class.forName("mk").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pi.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[8192];
        field_b = new char[128];
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_c = 0;
    }
}
