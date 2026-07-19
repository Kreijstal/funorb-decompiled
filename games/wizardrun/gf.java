/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends rg {
    static String field_X;
    static int field_W;
    static String[] field_eb;
    private kd field_db;
    private int field_Z;
    private jc field_ab;
    private int field_fb;
    private int field_hb;
    private int field_U;
    private ub field_cb;
    private int field_gb;
    static rc field_ib;
    static String field_Y;
    static o field_bb;
    static ok field_V;

    boolean a(char param0, int param1, byte param2, ub param3) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -96) {
                break L1;
              } else {
                discarded$6 = this.g(13);
                break L1;
              }
            }
            if (super.a(param0, param1, (byte) -120, param3)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_ab) {
                L2: {
                  if ((param1 ^ -1) == -99) {
                    discarded$7 = this.field_ab.a(param3, 8);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((param1 ^ -1) == -100) {
                    discarded$8 = this.field_ab.a(param3, 8);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("gf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    public static void i(byte param0) {
        field_V = null;
        field_ib = null;
        field_bb = null;
        field_X = null;
        field_eb = null;
        field_Y = null;
        if (param0 != -68) {
            field_V = (ok) null;
        }
    }

    final boolean a(int param0) {
        this.g((byte) -3);
        if (param0 != 16) {
            ub var3 = (ub) null;
            this.c((ub) null, -46);
        }
        return super.a(16);
    }

    final void j(int param0) {
        boolean discarded$0 = false;
        if (this.field_db == sa.field_g) {
            return;
        }
        this.field_fb = 0;
        this.field_db = lj.field_c;
        this.a(this.field_cb, true);
        if (param0 != -8144) {
            ub var3 = (ub) null;
            discarded$0 = this.a('ﾭ', 97, (byte) -70, (ub) null);
        }
        this.field_ab.field_G = 0;
        this.field_cb = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void g(byte param0) {
        if (!(null == this.field_db)) {
            if (this.field_db != lj.field_c) {
                this.a(6154, this.field_cb.field_n + 12 + this.field_hb, 12 + this.field_cb.field_r);
                this.a(this.field_cb, true);
            }
            this.field_ab.field_G = 256;
            this.field_db = null;
        }
        super.g(param0);
    }

    private final void a(ub param0, boolean param1) {
        try {
            if (!(this.field_ab == null)) {
                this.field_ab.a(false);
            }
            if (param0 != null) {
                param0.a(127, this.field_hb + 6, param0.field_n, param0.field_r, 6);
                this.field_ab = new jc(param0);
            } else {
                this.field_ab = new jc();
            }
            this.a((ub) (this.field_ab), (byte) 109);
            if (!param1) {
                gf.k(74);
            }
            this.field_cb = null;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "gf.RB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h(byte param0) {
        if (!(qb.field_p)) {
            throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(11579568, false);
        if (param0 < 53) {
            gf.k(90);
        }
        ml.field_t = 0;
    }

    gf(wi param0, ub param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, param1.field_n + 12 + param2);
        try {
            this.field_U = param3;
            this.field_gb = param3;
            this.field_hb = param2;
            this.field_Z = param4;
            this.a(param1, true);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        le var4_ref_le = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        le var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var19 = wizardrun.field_H;
        try {
          L0: {
            ci.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ia.field_f.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = ci.field_a[9] >> -1923399416;
                  var4 = ci.field_a[10] >> -67892184;
                  var5 = ci.field_a[11] >> -1494998296;
                  var6 = jd.field_f << -1801561788;
                  var7 = 0;
                  var8 = qj.a(-2942, var6) >> -1582451256;
                  var9 = wizardrun.a((byte) -39, var6) >> -151156792;
                  if (-1 == pg.field_n) {
                    break L2;
                  } else {
                    if ((fi.field_B ^ -1) == 0) {
                      break L2;
                    } else {
                      var8 = 240 + -fi.field_B;
                      var9 = -128;
                      var7 = pg.field_n - 320;
                      break L2;
                    }
                  }
                }
                if (param0 < -113) {
                  var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 - -(var9 * var9))));
                  var7 = (int)((double)var7 * var10);
                  var8 = (int)((double)var8 * var10);
                  var9 = (int)((double)var9 * var10);
                  var12 = var7 + -var3;
                  var13 = var8 + -var4;
                  var14 = -var5 + var9;
                  var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13 * var13 + var12 * var12)));
                  var14 = (int)((double)var14 * var10);
                  var13 = (int)((double)var13 * var10);
                  var12 = (int)((double)var12 * var10);
                  var15 = 0;
                  L3: while (true) {
                    if (var15 >= ia.field_f.length) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var16 = 0;
                      var17_int = 1;
                      L4: while (true) {
                        if (var17_int >= ia.field_f.length) {
                          var2[var16] = -2147483648;
                          var17 = ia.field_f[var16];
                          gj.a((byte) 115, var16);
                          var18 = 0;
                          L5: while (true) {
                            if (-4 >= (var18 ^ -1)) {
                              ae.a(false, (byte) 106, var17, true, cg.field_m, false, ci.field_a);
                              pi.a(var14, var12, var8, false, var9, var17, var7, var13);
                              var15++;
                              continue L3;
                            } else {
                              cg.field_m[var18] = cg.field_m[var18] + cb.field_d[var15][var18];
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            var17_int++;
                            continue L4;
                          } else {
                            var17_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4_ref_le = ia.field_f[var3];
                var4_ref_le.b(-119);
                gj.a((byte) 115, var3);
                var5 = var4_ref_le.field_r + var4_ref_le.field_g >> 1892493121;
                var6 = var4_ref_le.field_D + var4_ref_le.field_K >> 2055966657;
                var7 = var4_ref_le.field_E + var4_ref_le.field_M >> -1606423839;
                var8 = ci.field_a[9] >> 654062370;
                var9 = ci.field_a[10] >> -2010258782;
                var10_int = ci.field_a[11] >> -1332976030;
                var11 = var10_int * cg.field_m[5] + (var9 * cg.field_m[4] + var8 * cg.field_m[3]) >> -432330866;
                var12 = var9 * cg.field_m[7] + (var8 * cg.field_m[6] + var10_int * cg.field_m[8]) >> -276157554;
                var13 = var10_int * cg.field_m[11] + cg.field_m[9] * var8 + var9 * cg.field_m[10] >> 1888872302;
                var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 469200592;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "gf.QB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0, String param1) {
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
              if (param0 == 9) {
                break L1;
              } else {
                field_V = (ok) null;
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
            stackOut_3_1 = new StringBuilder().append("gf.TB(").append(param0).append(',');
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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    void c(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            this.field_cb = param0;
            if (param1 <= -109) {
              L1: {
                if (vg.field_W != this.field_db) {
                  if (this.field_db != sa.field_g) {
                    this.field_db = sa.field_g;
                    this.field_fb = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.b(this.field_cb.field_r + 12, 12 - -this.field_hb + this.field_cb.field_n, 0, this.field_Z);
                  this.field_fb = 0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("gf.VB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean g(int param0) {
        int fieldTemp$47 = 0;
        int fieldTemp$48 = 0;
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          if (null == this.field_db) {
            break L0;
          } else {
            if (this.field_db == sa.field_g) {
              fieldTemp$47 = this.field_fb + 1;
              this.field_fb = this.field_fb + 1;
              if (fieldTemp$47 != this.field_gb) {
                this.field_ab.field_G = -((this.field_fb << -142616376) / this.field_gb) + 256;
                break L0;
              } else {
                this.field_db = vg.field_W;
                this.b(12 + this.field_cb.field_r, 12 - (-this.field_hb + -this.field_cb.field_n), 0, this.field_Z);
                this.field_ab.field_G = 0;
                this.field_fb = 0;
                break L0;
              }
            } else {
              if (this.field_db != lj.field_c) {
                break L0;
              } else {
                fieldTemp$48 = this.field_fb + 1;
                this.field_fb = this.field_fb + 1;
                if (fieldTemp$48 != this.field_U) {
                  this.field_ab.field_G = (this.field_fb << 860043240) / this.field_U;
                  break L0;
                } else {
                  this.field_db = null;
                  this.field_ab.field_G = 256;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            field_bb = (o) null;
            break L1;
          }
        }
        return super.g(param0 ^ 0);
    }

    static {
        field_eb = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = "Discard";
        field_ib = new rc();
        field_V = new ok();
    }
}
