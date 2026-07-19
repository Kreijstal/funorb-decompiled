/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends hd {
    int field_Sb;
    static String field_Kb;
    static rv field_yb;
    hd field_Hb;
    boolean field_Gb;
    static String field_Ub;
    String field_Rb;
    long field_Ab;
    String field_Nb;
    int field_Qb;
    hd field_zb;
    static String field_Eb;
    int field_Mb;
    boolean field_Fb;
    long field_Ib;
    hd field_Tb;
    hd field_Lb;
    boolean field_Cb;
    int field_Db;
    hd field_Ob;
    int field_Jb;
    int field_Pb;
    static String field_Bb;

    public static void b(int param0) {
        field_yb = null;
        field_Bb = null;
        field_Eb = null;
        if (param0 != 240) {
            field_Bb = (String) null;
        }
        field_Kb = null;
        field_Ub = null;
    }

    final static int a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            var3_ref_int__ = param1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_ref_int__.length) {
                var3 = -10 / ((param0 - 40) / 37);
                stackOut_4_0 = var2_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var5 = var3_ref_int__[var4];
                var2_int = var2_int + var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("he.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(he param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this.field_Fb;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0.field_Fb) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
              stackOut_5_0 = this.field_Fb;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_Gb) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              if (stackIn_10_0 == (param0.field_Gb ? 1 : 0)) {
                stackOut_12_0 = this.field_Gb;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == -82) {
                  L3: {
                    if (this.field_Ib >= param0.field_Ib) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L3;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("he.I(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final static String a(int param0) {
        if (!(nr.field_f != wk.field_f)) {
            return ld.field_a;
        }
        if (param0 != 320) {
            vm var2 = (vm) null;
            he.a((vm) null, false);
        }
        if (!lc.field_e.a((byte) -80)) {
            return lc.field_e.a(3);
        }
        if (mj.field_a == nr.field_f) {
            return lc.field_e.a(param0 ^ 323);
        }
        return ep.field_b;
    }

    final static void i(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dt[] var4 = null;
        int var5 = 0;
        dt var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gm var10 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (null == af.field_a) {
                break L1;
              } else {
                if (nw.field_b.field_R[ek.field_G].d(3511)) {
                  L2: {
                    var10 = (gm) ((Object) nw.field_b.a((byte) -76, ek.field_G));
                    var2 = ug.a(param0, var10.field_kb >> -806464464);
                    var3 = lf.a((byte) -119, var10.field_bb >> -130399952);
                    if (!lb.a(var2, var3, param0 ^ 480)) {
                      var2 = 320;
                      var3 = 240;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4 = af.field_a;
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var4.length) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = -1;
                      var8 = 0;
                      L4: while (true) {
                        if (nw.field_b.field_I <= var8) {
                          var5++;
                          continue L3;
                        } else {
                          L5: {
                            if (nw.field_b.field_g[ek.field_G].field_p != nw.field_b.field_g[var8].field_p) {
                              break L5;
                            } else {
                              if (var6.field_h != nw.field_b.field_R[var8].field_g) {
                                break L5;
                              } else {
                                var7 = var8;
                                break L5;
                              }
                            }
                          }
                          var6.a(var2, var3, var7, -113);
                          var8++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "he.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    he(String param0, String param1, long param2) {
        super(0L, (hd) null);
        CharSequence var6 = null;
        String discarded$0 = null;
        try {
            this.field_Ab = param2;
            this.field_Rb = param0;
            this.field_Nb = param1;
            var6 = (CharSequence) ((Object) this.field_Rb);
            discarded$0 = mo.a(0, var6);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean h(int param0) {
        if (param0 != -13356) {
            this.field_Db = -100;
        }
        return !this.a((byte) -60) ? true : false;
    }

    final static wh a(int param0, boolean param1, int param2, int param3, int param4) {
        if (param2 != 240) {
            field_Ub = (String) null;
        }
        return wt.a(param3, ga.field_O[param4], em.field_e ? !param1 ? true : false : param1, param4, param0, -121);
    }

    final static void a(vm param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != vg.field_Bb) {
                vg.field_Bb.b(param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                he.i(10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("he.D(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        String discarded$0 = null;
        this.field_Rb = param2;
        if (param0 != -2) {
            return;
        }
        try {
            this.field_Nb = param1;
            var5 = (CharSequence) ((Object) this.field_Rb);
            discarded$0 = mo.a(param0 ^ -2, var5);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "he.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Ub = "home";
        field_Kb = "Visit the Account Management section on the main site to view.";
        field_Eb = "Bid";
        field_Bb = "MANAGEMENT";
        field_yb = new rv();
    }
}
