/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra extends ik {
    static int field_j;
    static String field_i;
    static String field_l;
    private mn field_g;
    static String field_k;
    private bd field_h;
    static String field_f;
    static fj field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                if (param1 < -68) {
                  try {
                    L1: {
                      var3 = new java.net.URL(param0.getCodeBase(), param2);
                      var3 = ck.a(-3780, var3, param0);
                      ua.a(param0, -109, var3.toString(), true);
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    return;
                  }
                  return;
                } else {
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("ra.J(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, om param2, boolean param3, int param4, int param5) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bv stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        bv stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        bv stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bv stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        bv stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        bv stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (nw.g(117)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var6_int = param2.field_G.field_r;
                  var7 = param2.field_v;
                  kr.field_C.a(var7, (byte) 33, param4);
                  if (pg.field_d.field_g.a(var6_int, -63, var7) < param4) {
                    break L2;
                  } else {
                    if (param4 == 1) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (1 >= param4) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    hc.field_b = hc.field_b + 1;
                                    hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                                    hc.field_b = Math.abs(hc.field_b);
                                    var8 = hc.field_b % 8;
                                    var9 = var8;
                                    if (0 == var9) {
                                      cg.field_j = cg.field_j + 1;
                                      kw.field_R = kw.field_R - wr.field_L;
                                      if (var10 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      if (1 == var9) {
                                        break L11;
                                      } else {
                                        if (var9 == 2) {
                                          break L10;
                                        } else {
                                          L12: {
                                            if (-4 != (var9 ^ -1)) {
                                              break L12;
                                            } else {
                                              if (var10 == 0) {
                                                break L9;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (var9 != 4) {
                                              break L13;
                                            } else {
                                              if (var10 == 0) {
                                                break L8;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (5 != var9) {
                                              break L14;
                                            } else {
                                              if (var10 == 0) {
                                                break L7;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (var9 != 6) {
                                              break L15;
                                            } else {
                                              if (var10 == 0) {
                                                break L6;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (7 == var9) {
                                            break L5;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  wr.field_L = wr.field_L + 1;
                                  ii.field_b = ii.field_b + cg.field_j;
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L10;
                                  }
                                }
                                ii.field_b = ii.field_b + 1;
                                kw.field_R = kw.field_R + 1;
                                if (var10 == 0) {
                                  break L3;
                                } else {
                                  break L9;
                                }
                              }
                              kw.field_R = kw.field_R + iu.field_t;
                              ii.field_b = ii.field_b + iu.field_t;
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L8;
                              }
                            }
                            ii.field_b = ii.field_b + cg.field_j;
                            wr.field_L = wr.field_L + 1;
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                          cg.field_j = cg.field_j + 1;
                          kw.field_R = kw.field_R - wr.field_L;
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                        kw.field_R = kw.field_R + wr.field_L;
                        cg.field_j = cg.field_j - 1;
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                      ii.field_b = ii.field_b - cg.field_j;
                      wr.field_L = wr.field_L - 1;
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    throw new IllegalStateException("");
                  }
                }
                L16: {
                  pg.field_d.field_g.a(65535, var7, param5, var6_int, param1);
                  vl.field_n.h(32161, 79);
                  vl.field_n.b(param0 + -3, var6_int);
                  vl.field_n.b(1, var7);
                  vl.field_n.b(true, param4);
                  vl.field_n.b(true, param5);
                  vl.field_n.b(true, param1);
                  stackOut_41_0 = vl.field_n;
                  stackOut_41_1 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  if (!param3) {
                    stackOut_43_0 = (bv) ((Object) stackIn_43_0);
                    stackOut_43_1 = stackIn_43_1;
                    stackOut_43_2 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    break L16;
                  } else {
                    stackOut_42_0 = (bv) ((Object) stackIn_42_0);
                    stackOut_42_1 = stackIn_42_1;
                    stackOut_42_2 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    stackIn_44_2 = stackOut_42_2;
                    break L16;
                  }
                }
                ((bv) (Object) stackIn_44_0).b(stackIn_44_1, stackIn_44_2);
                vl.field_n.a((byte) -108, km.a(-59));
                vl.field_n.a((byte) -124, oq.a(false));
                vl.field_n.a((byte) -59, jr.a(false));
                vl.field_n.a((byte) -50, rt.g(0));
                break L1;
              }
              qh.b((byte) 27);
              if (param0 == 4) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                discarded$1 = ra.b(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var6 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var6);
            stackOut_48_1 = new StringBuilder().append("ra.N(").append(param0).append(',').append(param1).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L17;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int[] var4 = null;
        bn.field_b = param0;
        ce.field_N = param0;
        dt.field_a = param2;
        dm.field_D = param2;
        tq.field_a = true;
        so.field_b = null;
        var4 = (int[]) null;
        qn.a((int[]) null, 0, 0);
        so.field_b = rj.a(param0, param2, 1423111778, (java.awt.Component) ((Object) si.field_b));
        so.field_b.a(param1 + -17900);
        g.a((byte) -85, param0 / 2, param2 / 2);
        if (param1 != 23505) {
          ra.a(-106, -34, -122);
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        } else {
          ni.a(-8994, param0, param2);
          om.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        }
    }

    ra(int param0, mn param1) {
        super(param0);
        try {
            this.field_g = param1;
            if ((this.field_c ^ -1) == -37) {
                this.field_g.field_u = true;
            }
            this.field_g.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ra.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException runtimeException = null;
        ha var5 = null;
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
              if (param2 == 26123) {
                break L1;
              } else {
                var5 = (ha) null;
                this.a((ha) null, 42);
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
            stackOut_3_1 = new StringBuilder().append("ra.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            vh var3 = (vh) null;
            this.a(-112, (vh) null);
            return 2;
        }
        return 2;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        om var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == this.field_h) {
                break L1;
              } else {
                this.field_h.a(64, param0);
                this.field_h = null;
                break L1;
              }
            }
            if (param1 == -1700635440) {
              break L0;
            } else {
              var4 = (om) null;
              ra.a(112, -111, (om) null, true, 116, 78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ra.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, ha param1) {
        RuntimeException runtimeException = null;
        ha var4 = null;
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
              this.field_h = this.field_g.a(param0 ^ -26, param1);
              if (param0 == -37) {
                break L1;
              } else {
                var4 = (ha) null;
                this.a((ha) null, -62);
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
            stackOut_3_1 = new StringBuilder().append("ra.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, vh param1) {
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
              param1.b(true, this.field_c);
              if (param0 == -11637) {
                break L1;
              } else {
                field_i = (String) null;
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
            stackOut_3_1 = new StringBuilder().append("ra.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        bv var4 = vl.field_n;
        var4.h(32161, param1);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(1, param2);
        var4.a(param0, param2 ^ 38359638);
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static int b(boolean param0) {
        int discarded$2 = 0;
        if (!param0) {
          discarded$2 = ra.b(false);
          return 1900 + new Date().getYear();
        } else {
          return 1900 + new Date().getYear();
        }
    }

    static {
        field_j = 0;
        field_i = "All players have left <%0>'s game.";
        field_k = "You must capture a village before you can use Fortify on it.";
        field_f = "This is your RuneScape clan if you have one.";
        field_l = "You have been removed from <%0>'s game.";
        field_e = null;
    }
}
