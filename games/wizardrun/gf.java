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
                boolean discarded$6 = ((gf) this).g(13);
                break L1;
              }
            }
            if (super.a(param0, param1, (byte) -120, param3)) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null != ((gf) this).field_ab) {
                L2: {
                  if (param1 == 98) {
                    boolean discarded$7 = ((gf) this).field_ab.a(param3, 8);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1 == 99) {
                    boolean discarded$8 = ((gf) this).field_ab.a(param3, 8);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
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
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("gf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public static void i() {
        field_V = null;
        field_ib = null;
        field_bb = null;
        field_X = null;
        field_eb = null;
        field_Y = null;
    }

    final boolean a(int param0) {
        ((gf) this).g((byte) -3);
        if (param0 != 16) {
            Object var3 = null;
            ((gf) this).c((ub) null, -46);
        }
        return super.a(16);
    }

    final void j(int param0) {
        if (((gf) this).field_db == sa.field_g) {
            return;
        }
        ((gf) this).field_fb = 0;
        ((gf) this).field_db = lj.field_c;
        int discarded$0 = 1;
        this.a(((gf) this).field_cb);
        if (param0 != -8144) {
            Object var3 = null;
            boolean discarded$1 = ((gf) this).a('ﾭ', 97, (byte) -70, (ub) null);
        }
        ((gf) this).field_ab.field_G = 0;
        ((gf) this).field_cb = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void g(byte param0) {
        if (!(null == ((gf) this).field_db)) {
            if (((gf) this).field_db != lj.field_c) {
                ((gf) this).a(6154, ((gf) this).field_cb.field_n + 12 + ((gf) this).field_hb, 12 + ((gf) this).field_cb.field_r);
                int discarded$0 = 1;
                this.a(((gf) this).field_cb);
            }
            ((gf) this).field_ab.field_G = 256;
            ((gf) this).field_db = null;
        }
        super.g(param0);
    }

    private final void a(ub param0) {
        try {
            if (!(((gf) this).field_ab == null)) {
                ((gf) this).field_ab.a(false);
            }
            if (param0 != null) {
                param0.a(127, ((gf) this).field_hb + 6, param0.field_n, param0.field_r, 6);
                ((gf) this).field_ab = new jc(param0);
            } else {
                ((gf) this).field_ab = new jc();
            }
            ((gf) this).a((ub) (Object) ((gf) this).field_ab, (byte) 109);
            ((gf) this).field_cb = null;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "gf.RB(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    final static void h() {
        if (!(qb.field_p)) {
            throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(11579568, false);
        ml.field_t = 0;
    }

    gf(wi param0, ub param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, param1.field_n + 12 + param2);
        try {
            ((gf) this).field_U = param3;
            ((gf) this).field_gb = param3;
            ((gf) this).field_hb = param2;
            ((gf) this).field_Z = param4;
            int discarded$0 = 1;
            this.a(param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = wizardrun.field_H;
        try {
          L0: {
            ci.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ia.field_f.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = ci.field_a[9] >> 8;
                  var4 = ci.field_a[10] >> 8;
                  var5 = ci.field_a[11] >> 8;
                  var6 = jd.field_f << 4;
                  var7 = 0;
                  var8 = qj.a(-2942, var6) >> 8;
                  var9 = wizardrun.a((byte) -39, var6) >> 8;
                  if (-1 == pg.field_n) {
                    break L2;
                  } else {
                    if (fi.field_B == -1) {
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
                            if (var18 >= 3) {
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
                          L6: {
                            if (var23[var17_int] <= var23[var16]) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var17_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                var4_ref_le = ia.field_f[var3];
                var4_ref_le.b(-119);
                gj.a((byte) 115, var3);
                var5 = var4_ref_le.field_r + var4_ref_le.field_g >> 1;
                var6 = var4_ref_le.field_D + var4_ref_le.field_K >> 1;
                var7 = var4_ref_le.field_E + var4_ref_le.field_M >> 1;
                var8 = ci.field_a[9] >> 2;
                var9 = ci.field_a[10] >> 2;
                var10_int = ci.field_a[11] >> 2;
                var11 = var10_int * cg.field_m[5] + (var9 * cg.field_m[4] + var8 * cg.field_m[3]) >> 14;
                var12 = var9 * cg.field_m[7] + (var8 * cg.field_m[6] + var10_int * cg.field_m[8]) >> 14;
                var13 = var10_int * cg.field_m[11] + cg.field_m[9] * var8 + var9 * cg.field_m[10] >> 14;
                var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "gf.QB(" + param0 + ')');
        }
    }

    final static void b(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gf.TB(").append(9).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
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
            ((gf) this).field_cb = param0;
            if (param1 <= -109) {
              L1: {
                if (vg.field_W != ((gf) this).field_db) {
                  if (((gf) this).field_db != sa.field_g) {
                    ((gf) this).field_db = sa.field_g;
                    ((gf) this).field_fb = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((gf) this).b(((gf) this).field_cb.field_r + 12, 12 - -((gf) this).field_hb + ((gf) this).field_cb.field_n, 0, ((gf) this).field_Z);
                  ((gf) this).field_fb = 0;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("gf.VB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    boolean g(int param0) {
        int var3 = 0;
        L0: {
          var3 = wizardrun.field_H;
          if (null == ((gf) this).field_db) {
            break L0;
          } else {
            if (((gf) this).field_db == sa.field_g) {
              int fieldTemp$47 = ((gf) this).field_fb + 1;
              ((gf) this).field_fb = ((gf) this).field_fb + 1;
              if (fieldTemp$47 != ((gf) this).field_gb) {
                ((gf) this).field_ab.field_G = -((((gf) this).field_fb << 8) / ((gf) this).field_gb) + 256;
                break L0;
              } else {
                ((gf) this).field_db = vg.field_W;
                ((gf) this).b(12 + ((gf) this).field_cb.field_r, 12 - (-((gf) this).field_hb + -((gf) this).field_cb.field_n), 0, ((gf) this).field_Z);
                ((gf) this).field_ab.field_G = 0;
                ((gf) this).field_fb = 0;
                break L0;
              }
            } else {
              if (((gf) this).field_db != lj.field_c) {
                break L0;
              } else {
                int fieldTemp$48 = ((gf) this).field_fb + 1;
                ((gf) this).field_fb = ((gf) this).field_fb + 1;
                if (fieldTemp$48 != ((gf) this).field_U) {
                  ((gf) this).field_ab.field_G = (((gf) this).field_fb << 8) / ((gf) this).field_U;
                  break L0;
                } else {
                  ((gf) this).field_db = null;
                  ((gf) this).field_ab.field_G = 256;
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
            field_bb = null;
            break L1;
          }
        }
        return super.g(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = "Discard";
        field_ib = new rc();
        field_V = new ok();
    }
}
