/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends wf {
    int field_n;
    int field_i;
    int field_g;
    static int field_o;
    int field_k;
    int field_h;
    int field_m;
    static ti field_l;
    static int field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.awt.Component var11 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.d(param0, param1, 1 + param3, 10000536);
              sb.d(param0, param1 - -param4, 1 + param3, 12105912);
              var5_int = 1;
              if (param2 == 13612) {
                break L1;
              } else {
                var11 = (java.awt.Component) null;
                jl.a((java.awt.Component) null, 106);
                break L1;
              }
            }
            L2: {
              var6 = param4;
              if (sb.field_e > param1 - -var5_int) {
                var5_int = -param1 + sb.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (sb.field_f >= param1 + var6) {
                break L3;
              } else {
                var6 = -param1 + sb.field_f;
                break L3;
              }
            }
            var7 = var5_int;
            L4: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param4);
                var9 = var8 | (var8 << -812904752 | var8 << -1594782456);
                sb.field_h[param0 + (param1 - -var7) * sb.field_c] = var9;
                sb.field_h[sb.field_c * (var7 + param1) + param0 - -param3] = var9;
                var7++;
                if (var10 == 0) {
                  continue L4;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var5), "jl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        oi var4_ref_oi = null;
        int var4 = 0;
        jl var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var9 = nf.field_l;
                    var2 = var9.d((byte) 78);
                    var3 = var9.d((byte) 106);
                    if (var2 != 0) {
                      break L4;
                    } else {
                      var4_ref_oi = (oi) ((Object) qd.field_d.a((byte) -95));
                      if (var4_ref_oi == null) {
                        pc.a(1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L5: {
                          var5_int = -var9.field_h + tg.field_a;
                          var11 = var4_ref_oi.field_m;
                          var10 = var11;
                          var6 = var10;
                          if (var5_int <= var11.length << -1167402782) {
                            break L5;
                          } else {
                            var5_int = var11.length << -569242526;
                            break L5;
                          }
                        }
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (var7 >= var5_int) {
                              var4_ref_oi.c(5);
                              break L7;
                            } else {
                              var6[var7 >> -1485960510] = var6[var7 >> -1485960510] + (var9.d((byte) 126) << (vg.c(var7, 3) << 1355147144));
                              var7++;
                              if (var8 != 0) {
                                break L7;
                              } else {
                                continue L6;
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (-2 != (var2 ^ -1)) {
                      break L8;
                    } else {
                      var4 = var9.k(128);
                      var5 = (jl) ((Object) ll.field_T.a((byte) -95));
                      L9: while (true) {
                        L10: {
                          if (var5 == null) {
                            break L10;
                          } else {
                            var13 = var3 ^ -1;
                            var12 = var5.field_m ^ -1;
                            if (var8 != 0) {
                              if (var12 == var13) {
                                break L1;
                              } else {
                                break L2;
                              }
                            } else {
                              L11: {
                                if (var12 != var13) {
                                  break L11;
                                } else {
                                  if (var4 == var5.field_i) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var5 = (jl) ((Object) ll.field_T.a(true));
                              if (var8 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        if (var5 == null) {
                          pc.a(1);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var5.c(5);
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  d.a((Throwable) null, 46, "LR1: " + ik.q(48));
                  pc.a(1);
                  break L3;
                }
                if (param0 == 1) {
                  break L1;
                } else {
                  break L2;
                }
              }
              field_j = -22;
              return;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "jl.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 < 9) {
            field_l = (ti) null;
        }
    }

    private jl() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.addMouseListener(hi.field_e);
              param0.addMouseMotionListener(hi.field_e);
              param0.addFocusListener(hi.field_e);
              if (param1 == 0) {
                break L1;
              } else {
                jl.d(-37);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("jl.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_j = 0;
    }
}
