/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends ia {
    static String[] field_n;
    static int field_w;
    private String field_u;
    private boolean field_r;
    static String field_t;
    static int[] field_s;
    static int[] field_v;
    static boolean field_p;
    static gh field_q;
    private tk field_x;
    static qc field_o;

    final static void a(boolean param0, hk param1) {
        hk var2 = null;
        int var3 = 0;
        hk var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param1.b(4);
              var2 = (hk) ((Object) ci.field_e.e(13058));
              if (param0) {
                break L1;
              } else {
                var4 = (hk) null;
                nm.a(true, (hk) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(param1, (byte) -63)) {
                    break L3;
                  } else {
                    var2 = (hk) ((Object) ci.field_e.a((byte) -101));
                    continue L2;
                  }
                }
              }
              L4: {
                if (var2 != null) {
                  ie.a(var2, 30, param1);
                  break L4;
                } else {
                  ci.field_e.a(3, param1);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("nm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        ql.j(-29713);
        if (param3 != 12) {
            return;
        }
        try {
            ag.field_p.h(param3 + 109);
            jd.field_kb = new pm(cc.field_Xb, (String) null, de.field_d, param1, param2);
            ci.field_a = new bf(ag.field_p, jd.field_kb);
            ag.field_p.a(ci.field_a, 93);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        kj var4 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                var4 = (kj) null;
                nm.a((kj) null, (byte) 97);
                break L1;
              }
            }
            if (this.field_x.a(param1, -1) != fa.field_d) {
              if (this.a(param1, param0 ^ -101) != fa.field_d) {
                stackIn_9_0 = mg.field_lc;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = pl.field_W;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = this.field_x.a(100, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("nm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final static void a(int param0, byte param1) {
        kj var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 109, 1);
        var2.a((byte) 108, 1);
        int var3 = 30 / ((11 - param1) / 51);
    }

    final vd a(String param0, int param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        vd stackIn_2_0 = null;
        vd stackIn_8_0 = null;
        vd stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_x.a(param0, param1) != fa.field_d) {
              L1: {
                if (!param0.equals(this.field_u)) {
                  var3 = ri.a(param0, -98);
                  if (!var3.a((byte) -72)) {
                    stackIn_8_0 = ma.field_Y;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_u = param0;
                    this.field_r = var3.b(200);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_r) {
                  stackIn_13_0 = vf.field_b;
                  break L2;
                } else {
                  stackIn_13_0 = fa.field_d;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = fa.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("nm.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void d(byte param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_v = null;
        field_s = null;
        field_n = null;
        int var1 = -69 / ((param0 - 61) / 55);
    }

    nm(jf param0, jf param1) {
        super(param0);
        this.field_u = "";
        this.field_r = false;
        try {
            this.field_x = new tk(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        qf.field_c.a(0, param1, param4, param3, param5);
        if (param6 <= 81) {
            field_n = (String[]) null;
        }
        if (!(jk.field_i == null)) {
            jk.field_i.a(param2, param4, param0, (byte) 27, -ed.field_i + param0, param4);
        }
    }

    final static jj[] a(kj param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        jj[] var4 = null;
        int var5 = 0;
        jj var6_ref_jj = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jj[] stackIn_6_0 = null;
        jj[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param0.g(-126, 8);
            if (0 >= var2_int) {
              if (param1 > 22) {
                var3 = param0.g(-77, 12);
                var4 = new jj[var3];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var3) {
                    stackIn_14_0 = (jj[]) (var4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!he.a(-1766, param0)) {
                        var6 = param0.g(30, fm.a(-1 + var5, 80));
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_jj = new jj();
                        param0.g(-78, 24);
                        param0.g(80, 24);
                        var6_ref_jj.field_g = param0.g(94, 24);
                        param0.g(62, 9);
                        param0.g(-75, 12);
                        param0.g(122, 12);
                        param0.g(-103, 12);
                        var4[var5] = var6_ref_jj;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (jj[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("nm.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jj[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wk[] var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        wk[] stackIn_16_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= oh.field_f) {
                if (param5 + param1 > oh.field_f) {
                  if (param0 <= pi.field_c) {
                    if (param0 - -param4 > pi.field_c) {
                      stackIn_10_0 = 1;
                      break L1;
                    } else {
                      stackIn_10_0 = 0;
                      break L1;
                    }
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_10_0 = 0;
                  break L1;
                }
              } else {
                stackIn_10_0 = 0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_10_0;
              if (var6_int == 0) {
                stackIn_13_0 = 1146810;
                break L2;
              } else {
                stackIn_13_0 = 0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_13_0;
              if (var6_int == 0) {
                stackIn_16_0 = hk.field_Tb;
                break L3;
              } else {
                stackIn_16_0 = wc.field_d;
                break L3;
              }
            }
            var8 = stackIn_16_0;
            if (param2 >= 115) {
              L4: {
                jm.a(param0, param4, var8, 1, param1, param5);
                if (param3 != null) {
                  pl.field_U.a(param3, param5 / 2 + param1, (1 + (param4 - -pl.field_U.field_U)) / 2 + param0, var7, -1);
                  break L4;
                } else {
                  break L4;
                }
              }
              stackIn_23_0 = var6_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_18_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6);

            stackIn_26_1 = new StringBuilder().append("nm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if ((var2 ^ -1) != -2) {
          if (var2 != 2) {
            if (var2 == 3) {
              return 2;
            } else {
              if (-5 != (var2 ^ -1)) {
                if (-21 == (var2 ^ -1)) {
                  return 4;
                } else {
                  if (11 != var2) {
                    if (-13 != (var2 ^ -1)) {
                      if ((var2 ^ -1) == -14) {
                        return 12;
                      } else {
                        if (14 != var2) {
                          if (6 == var2) {
                            return 5;
                          } else {
                            if (-8 != (var2 ^ -1)) {
                              if (var2 != 8) {
                                if ((var2 ^ -1) == -10) {
                                  return 8;
                                } else {
                                  if ((var2 ^ -1) != -27) {
                                    if (-16 == (var2 ^ -1)) {
                                      return 27;
                                    } else {
                                      L0: {
                                        if (param0 == 8241) {
                                          break L0;
                                        } else {
                                          field_t = (String) null;
                                          break L0;
                                        }
                                      }
                                      return -1;
                                    }
                                  } else {
                                    return 10;
                                  }
                                }
                              } else {
                                return 7;
                              }
                            } else {
                              return 6;
                            }
                          }
                        } else {
                          return 13;
                        }
                      }
                    } else {
                      return 11;
                    }
                  } else {
                    return 10;
                  }
                }
              } else {
                return 3;
              }
            }
          } else {
            return 1;
          }
        } else {
          return 0;
        }
    }

    static {
        field_p = false;
        field_v = new int[]{48, 272, 380, 490, 591};
        field_s = new int[12];
        field_w = -1;
    }
}
