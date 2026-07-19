/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends gh {
    private int field_ic;
    static String field_fc;
    static String field_Ub;
    private gh field_ec;
    static String field_cc;
    static gk[] field_Zb;
    private gh field_bc;
    static int field_ac;
    static int field_Tb;
    private gh field_dc;
    static String field_hc;
    static String field_kc;
    private gh field_jc;
    static byte[][][] field_Wb;
    static String field_Yb;
    static String field_Vb;
    private gh field_Sb;
    private gh field_Xb;
    static int field_gc;

    public static void j(int param0) {
        field_Vb = null;
        field_fc = null;
        field_Wb = (byte[][][]) null;
        field_kc = null;
        field_Zb = null;
        field_Ub = null;
        field_cc = null;
        if (param0 != 0) {
          return;
        } else {
          field_Yb = null;
          field_hc = null;
          return;
        }
    }

    final static void a(byte param0, cm param1) {
        RuntimeException var2 = null;
        gh var3 = null;
        gh var5 = null;
        gh var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ce.field_p = rl.a(param1, "basic", "display_name_changed", false);
              km.field_j = new ql(0L, l.field_e, qg.field_i, cb.field_d);
              vi.field_W = new ql(0L, l.field_e, ge.field_k, sa.field_a);
              ig.field_m = new gh(0L, (gh) null);
              vc.field_h = new gh(0L, bd.field_f);
              vc.field_h.field_Kb = 1;
              mm.field_a = new gh(0L, sj.field_J, uj.field_g);
              dh.field_E = new gh(0L, kb.field_b, rm.field_i);
              si.field_v = new gh(0L, qb.field_K);
              ig.field_m.a(vc.field_h, 121);
              ig.field_m.a(mm.field_a, 123);
              ig.field_m.a(dh.field_E, 121);
              if (param0 == 109) {
                break L1;
              } else {
                lb.j(-84);
                break L1;
              }
            }
            ig.field_m.a(km.field_j, 118);
            ig.field_m.a(si.field_v, 120);
            km.field_j.field_Xb.field_Tb.b(bd.field_f, 6402);
            var5 = km.field_j.field_Xb.field_Tb;
            var6 = var5;
            km.field_j.field_Xb.field_Tb.field_Fb = 1;
            var6.field_Kb = 1;
            vi.field_W.field_Xb.field_Tb.b(bd.field_f, 6402);
            var3 = vi.field_W.field_Xb.field_Tb;
            vi.field_W.field_Xb.field_Tb.field_Fb = 1;
            var3.field_Kb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("lb.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if (this.field_bc.field_Eb != 0) {
            this.field_ic = 20;
            return true;
          } else {
            if (-1 != (this.field_bc.field_W ^ -1)) {
              if (this.field_ic <= 0) {
                if (0 != this.field_ic) {
                  return false;
                } else {
                  this.field_ic = 3;
                  return true;
                }
              } else {
                this.field_ic = this.field_ic - 1;
                if (0 == this.field_ic) {
                  this.field_ic = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          this.field_jc = (gh) null;
          if (this.field_bc.field_Eb != 0) {
            this.field_ic = 20;
            return true;
          } else {
            if (-1 != (this.field_bc.field_W ^ -1)) {
              if (this.field_ic > 0) {
                this.field_ic = this.field_ic - 1;
                if (0 != this.field_ic) {
                  return false;
                } else {
                  this.field_ic = 3;
                  return true;
                }
              } else {
                if (0 == this.field_ic) {
                  this.field_ic = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final int a(int param0, boolean param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var7 = 69 % ((param3 - -9) / 34);
          var5 = 0;
          var6 = this.field_Sb.field_Lb + -this.field_ec.field_Lb;
          if (-1 > (var6 ^ -1)) {
            var8 = this.field_ec.field_eb;
            var9 = -param0 + param2;
            var5 = (var6 / 2 + var9 * var8) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L1: {
            if (0 <= var5) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
          if (var5 <= -param0 + param2) {
            return var5;
          } else {
            var5 = param2 - param0;
            return var5;
          }
        } else {
          L2: {
            if (-param0 + param2 < var5) {
              var5 = param2 + -param0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var5 >= 0) {
              break L3;
            } else {
              var5 = 0;
              break L3;
            }
          }
          return var5;
        }
    }

    lb(long param0, lb param1) {
        this(param0, param1.field_bc, param1.field_jc, param1.field_dc, param1.field_ec);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_zb = param5;
        this.field_eb = param4;
        this.field_Lb = param6;
        if (param7 != 4454) {
          return;
        } else {
          this.field_Y = param3;
          this.a(param0, param1, param2, -1);
          return;
        }
    }

    final boolean k(int param0) {
        if (param0 >= -87) {
            return false;
        }
        return -1 != (this.field_ec.field_W ^ -1) ? true : false;
    }

    lb(long param0, gh param1, gh param2, gh param3, gh param4) {
        super(param0, (gh) null);
        RuntimeException var7 = null;
        gh var9 = null;
        gh var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            this.field_bc = new gh(0L, param1);
            this.field_jc = new gh(0L, param2);
            this.a(this.field_bc, 121);
            this.a(this.field_jc, 121);
            this.field_Sb = new gh(0L, (gh) null);
            this.a(this.field_Sb, 126);
            this.field_dc = new gh(0L, param3);
            this.field_Xb = new gh(0L, param3);
            var9 = this.field_dc;
            var10 = var9;
            this.field_Xb.field_P = true;
            var10.field_P = true;
            this.field_Sb.a(this.field_dc, 122);
            this.field_Sb.a(this.field_Xb, 123);
            this.field_ec = new gh(0L, param4);
            this.field_ec.field_U = true;
            this.field_Sb.a(this.field_ec, 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("lb.<init>(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 == 29) {
          if (0 != this.field_dc.field_Eb) {
            this.field_ic = 20;
            return true;
          } else {
            if (-1 != (this.field_dc.field_W ^ -1)) {
              if (0 >= this.field_ic) {
                if (-1 == (this.field_ic ^ -1)) {
                  if (this.field_ec.field_gb + this.field_ec.field_cb <= pi.field_c) {
                    return false;
                  } else {
                    this.field_ic = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_ic = this.field_ic - 1;
                if (-1 == (this.field_ic ^ -1)) {
                  if (this.field_ec.field_gb + this.field_ec.field_cb <= pi.field_c) {
                    return false;
                  } else {
                    this.field_ic = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final boolean f(byte param0) {
        int var2 = 0;
        var2 = -114 / ((-39 - param0) / 39);
        if (this.field_Xb.field_Eb != 0) {
          this.field_ic = 20;
          return true;
        } else {
          if (0 != this.field_Xb.field_W) {
            L0: {
              if (this.field_ic > 0) {
                this.field_ic = this.field_ic - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_ic == 0) {
              if (pi.field_c < this.field_ec.field_lb + this.field_ec.field_Lb + (this.field_ec.field_cb - -this.field_ec.field_gb)) {
                return false;
              } else {
                this.field_ic = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean e(byte param0) {
        if (this.field_jc.field_Eb != 0) {
          this.field_ic = 20;
          return true;
        } else {
          if (param0 > 56) {
            if (-1 != (this.field_jc.field_W ^ -1)) {
              L0: {
                if ((this.field_ic ^ -1) < -1) {
                  this.field_ic = this.field_ic - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-1 != (this.field_ic ^ -1)) {
                return false;
              } else {
                this.field_ic = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            this.field_jc = (gh) null;
            if (-1 != (this.field_jc.field_W ^ -1)) {
              L1: {
                if ((this.field_ic ^ -1) < -1) {
                  this.field_ic = this.field_ic - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-1 != (this.field_ic ^ -1)) {
                return false;
              } else {
                this.field_ic = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    lb(String param0, gh param1, gh param2, gh param3, gh param4) {
        this(ke.a((CharSequence) ((Object) param0), (byte) -48), param1, param2, param3, param4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        gh var17 = null;
        gh var18 = null;
        gh var19 = null;
        gh stackIn_12_0 = null;
        gh stackIn_12_1 = null;
        gh stackIn_12_2 = null;
        gh stackIn_13_0 = null;
        gh stackIn_13_1 = null;
        gh stackIn_13_2 = null;
        gh stackIn_14_0 = null;
        gh stackIn_14_1 = null;
        gh stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        gh stackIn_20_0 = null;
        gh stackIn_20_1 = null;
        gh stackIn_20_2 = null;
        gh stackIn_21_0 = null;
        gh stackIn_21_1 = null;
        gh stackIn_21_2 = null;
        gh stackIn_22_0 = null;
        gh stackIn_22_1 = null;
        gh stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        gh stackOut_11_0 = null;
        gh stackOut_11_1 = null;
        gh stackOut_11_2 = null;
        gh stackOut_13_0 = null;
        gh stackOut_13_1 = null;
        gh stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        gh stackOut_12_0 = null;
        gh stackOut_12_1 = null;
        gh stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        gh stackOut_19_0 = null;
        gh stackOut_19_1 = null;
        gh stackOut_19_2 = null;
        gh stackOut_21_0 = null;
        gh stackOut_21_1 = null;
        gh stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        gh stackOut_20_0 = null;
        gh stackOut_20_1 = null;
        gh stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        L0: {
          if (this.field_zb * 2 <= this.field_Lb) {
            var6 = this.field_Lb + -this.field_zb;
            var5 = this.field_zb;
            break L0;
          } else {
            var6 = this.field_Lb / 2;
            var5 = this.field_Lb / 2;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (param3 <= (param2 ^ -1)) {
            break L1;
          } else {
            L2: {
              var8 = var8 * param0 / param2;
              if (this.field_zb > var8) {
                var8 = this.field_zb;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 < var8) {
              var8 = var7;
              break L1;
            } else {
              L3: {
                var9 = param2 + -param0;
                var10 = var7 - var8;
                var11 = 0;
                if (0 < var9) {
                  var11 = (var9 / 2 + param1 * var10) / var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var12 = var8 / 2 + var11;
                var14 = this.field_bc;
                var14.field_Lb = var5;
                var14.field_eb = 0;
                var14.field_Y = 0;
                var14.field_zb = this.field_zb;
                var15 = this.field_jc;
                var15.field_Lb = -var6 + this.field_Lb;
                var15.field_zb = this.field_zb;
                var15.field_Y = 0;
                var15.field_eb = var6;
                var16 = this.field_Sb;
                var16.field_eb = var5;
                var16.field_Y = 0;
                var16.field_Lb = var7;
                var16.field_zb = this.field_zb;
                var17 = this.field_dc;
                var17.field_eb = 0;
                var17.field_zb = this.field_zb;
                var17.field_Y = 0;
                var17.field_Lb = var12;
                var18 = this.field_Xb;
                var18.field_eb = var12;
                var18.field_zb = this.field_zb;
                var18.field_Lb = var7 - var12;
                var18.field_Y = 0;
                var19 = this.field_ec;
                var19.field_eb = var11;
                var19.field_zb = this.field_zb;
                stackOut_11_0 = this.field_bc;
                stackOut_11_1 = this.field_jc;
                stackOut_11_2 = this.field_Sb;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                if (param0 >= param2) {
                  stackOut_13_0 = (gh) ((Object) stackIn_13_0);
                  stackOut_13_1 = (gh) ((Object) stackIn_13_1);
                  stackOut_13_2 = (gh) ((Object) stackIn_13_2);
                  stackOut_13_3 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  break L4;
                } else {
                  stackOut_12_0 = (gh) ((Object) stackIn_12_0);
                  stackOut_12_1 = (gh) ((Object) stackIn_12_1);
                  stackOut_12_2 = (gh) ((Object) stackIn_12_2);
                  stackOut_12_3 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  break L4;
                }
              }
              stackIn_14_2.field_T = stackIn_14_3 != 0;
              stackIn_14_1.field_T = stackIn_14_3 != 0;
              stackIn_14_0.field_T = stackIn_14_3 != 0;
              var19.field_Y = 0;
              var19.field_Lb = var8;
              return;
            }
          }
        }
        L5: {
          var9 = param2 + -param0;
          var10 = var7 - var8;
          var11 = 0;
          if (0 < var9) {
            var11 = (var9 / 2 + param1 * var10) / var9;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var12 = var8 / 2 + var11;
          var14 = this.field_bc;
          var14.field_Lb = var5;
          var14.field_eb = 0;
          var14.field_Y = 0;
          var14.field_zb = this.field_zb;
          var15 = this.field_jc;
          var15.field_Lb = -var6 + this.field_Lb;
          var15.field_zb = this.field_zb;
          var15.field_Y = 0;
          var15.field_eb = var6;
          var16 = this.field_Sb;
          var16.field_eb = var5;
          var16.field_Y = 0;
          var16.field_Lb = var7;
          var16.field_zb = this.field_zb;
          var17 = this.field_dc;
          var17.field_eb = 0;
          var17.field_zb = this.field_zb;
          var17.field_Y = 0;
          var17.field_Lb = var12;
          var18 = this.field_Xb;
          var18.field_eb = var12;
          var18.field_zb = this.field_zb;
          var18.field_Lb = var7 - var12;
          var18.field_Y = 0;
          var19 = this.field_ec;
          var19.field_eb = var11;
          var19.field_zb = this.field_zb;
          stackOut_19_0 = this.field_bc;
          stackOut_19_1 = this.field_jc;
          stackOut_19_2 = this.field_Sb;
          stackIn_21_0 = stackOut_19_0;
          stackIn_21_1 = stackOut_19_1;
          stackIn_21_2 = stackOut_19_2;
          stackIn_20_0 = stackOut_19_0;
          stackIn_20_1 = stackOut_19_1;
          stackIn_20_2 = stackOut_19_2;
          if (param0 >= param2) {
            stackOut_21_0 = (gh) ((Object) stackIn_21_0);
            stackOut_21_1 = (gh) ((Object) stackIn_21_1);
            stackOut_21_2 = (gh) ((Object) stackIn_21_2);
            stackOut_21_3 = 0;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            stackIn_22_2 = stackOut_21_2;
            stackIn_22_3 = stackOut_21_3;
            break L6;
          } else {
            stackOut_20_0 = (gh) ((Object) stackIn_20_0);
            stackOut_20_1 = (gh) ((Object) stackIn_20_1);
            stackOut_20_2 = (gh) ((Object) stackIn_20_2);
            stackOut_20_3 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_22_2 = stackOut_20_2;
            stackIn_22_3 = stackOut_20_3;
            break L6;
          }
        }
        stackIn_22_2.field_T = stackIn_22_3 != 0;
        stackIn_22_1.field_T = stackIn_22_3 != 0;
        stackIn_22_0.field_T = stackIn_22_3 != 0;
        var19.field_Y = 0;
        var19.field_Lb = var8;
    }

    static {
        field_Ub = "<%0> has declined the invitation.";
        field_fc = "Leave test field";
        field_cc = "Log in";
        field_kc = "You have declined the invitation.";
        field_gc = 0;
        field_hc = "Create a free account to start using this feature";
        field_Vb = "<%1> was obliterated in <%0>'s nuclear fireball";
        field_ac = 256;
        field_Yb = "Become a member to get this expansion and...";
    }
}
