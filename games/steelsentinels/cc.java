/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends gh {
    boolean field_Zb;
    int field_dc;
    long field_ec;
    static boolean field_lc;
    int field_qc;
    static String[] field_ic;
    static String field_Xb;
    int field_ac;
    int field_jc;
    String field_Vb;
    static int field_gc;
    boolean field_kc;
    gh field_Yb;
    String field_mc;
    gh field_hc;
    boolean field_nc;
    static String field_Tb;
    static ek[] field_pc;
    gh field_cc;
    gh field_oc;
    long field_fc;
    int field_Ub;
    gh field_Sb;
    static gh field_bc;
    int field_Wb;

    final static void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var3 = -68 / ((-30 - param1) / 54);
        if (!(null == n.field_x)) {
            var4 = n.field_x.a(param2, -95);
            if (!(var4 == -2)) {
                if (!(0 == (var4 ^ -1))) {
                    var5 = n.field_x.d((byte) 63) ? 1 : 0;
                    wc.a(0, var5 != 0, n.field_x.field_hc, var4, n.field_x.b(true), param0);
                }
                n.field_x = null;
                rh.a(false);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        int var3;
        var3 = SteelSentinels.field_G;
        if (param1 == 0) {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                if (null == nf.field_b) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            vb.field_c = false;
            break L0;
          }
          L2: {
            if (!param0) {
              if (null != nf.field_b) {
                if (0 < je.field_t) {
                  je.field_t = je.field_t - 1;
                  break L2;
                } else {
                  if (-1 > (bd.field_c ^ -1)) {
                    bd.field_c = bd.field_c - 1;
                    break L2;
                  } else {
                    if (fj.field_f < an.field_h) {
                      L3: {
                        if (fj.field_f == 0) {
                          nj.a(false, true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      fj.field_f = fj.field_f + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                if (ni.field_a != null) {
                  if ((je.field_t ^ -1) >= -1) {
                    if (0 >= fj.field_f) {
                      if (an.field_h <= bd.field_c) {
                        break L2;
                      } else {
                        L4: {
                          if (0 != bd.field_c) {
                            break L4;
                          } else {
                            nj.a(true, true);
                            break L4;
                          }
                        }
                        bd.field_c = bd.field_c + 1;
                        break L2;
                      }
                    } else {
                      fj.field_f = fj.field_f - 1;
                      break L2;
                    }
                  } else {
                    je.field_t = je.field_t - 1;
                    break L2;
                  }
                } else {
                  vb.field_c = false;
                  if (0 >= bd.field_c) {
                    if (fj.field_f > 0) {
                      fj.field_f = fj.field_f - 1;
                      break L2;
                    } else {
                      if (je.field_t < an.field_h) {
                        L5: {
                          if (je.field_t == 0) {
                            bf.m(854);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        je.field_t = je.field_t + 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    bd.field_c = bd.field_c - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (-1 > (je.field_t ^ -1)) {
                je.field_t = je.field_t - 1;
                break L2;
              } else {
                if (0 < bd.field_c) {
                  bd.field_c = bd.field_c - 1;
                  break L2;
                } else {
                  if (fj.field_f > 0) {
                    fj.field_f = fj.field_f - 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void k(int param0) {
        field_Xb = null;
        field_Tb = null;
        field_ic = null;
        if (param0 < 73) {
            cc.a(24, (byte) -21, true);
        }
        field_bc = null;
        field_pc = null;
    }

    final boolean d(byte param0) {
        if (param0 != -36) {
            cc.a(-73, (byte) -40, false);
        }
        return !this.a((byte) 30) ? true : false;
    }

    cc(String param0, String param1, long param2) {
        super(0L, (gh) null);
        CharSequence var6 = null;
        try {
            this.field_mc = param0;
            this.field_ec = param2;
            this.field_Vb = param1;
            var6 = (CharSequence) ((Object) this.field_mc);
            ui.a(1, var6);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(cc param0, int param1) {
        RuntimeException var3 = null;
        cc var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_kc) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            if (stackIn_3_0 != (this.field_kc ? 1 : 0)) {
              L2: {
                if (param1 < -35) {
                  break L2;
                } else {
                  var4 = (cc) null;
                  this.a((cc) null, 15);
                  break L2;
                }
              }
              if (param0.field_Zb != this.field_Zb) {
                stackIn_11_0 = this.field_Zb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (this.field_fc >= param0.field_fc) {
                    stackIn_15_0 = 0;
                    break L3;
                  } else {
                    stackIn_15_0 = 1;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_kc;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("cc.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = SteelSentinels.field_G;
        try {
            gd.field_qb.c((byte) -118);
            for (var1_int = 0; (var1_int ^ -1) > -33; var1_int++) {
                bm.field_T[var1_int] = 0L;
            }
            for (var1_int = param0; 32 > var1_int; var1_int++) {
                hg.field_c[var1_int] = 0L;
            }
            di.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cc.B(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
            this.field_mc = param1;
            this.field_Vb = param2;
            var5 = (CharSequence) ((Object) this.field_mc);
            ui.a(1, var5);
            int var4_int = -54 / ((54 - param0) / 38);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ic = new String[]{"TRAINING", "ILOLIAN INCIDENT", "SOLARITE WAR"};
        field_Tb = "<%1> was damaged by <%0>";
        field_lc = false;
    }
}
