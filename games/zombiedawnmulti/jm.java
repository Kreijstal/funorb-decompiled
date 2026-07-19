/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends ae {
    private int field_r;
    static float[] field_k;
    private int field_o;
    private int field_i;
    static float[] field_n;
    private int field_j;
    private int field_m;
    static String field_l;
    private int field_q;
    static String field_p;

    final static void d(byte param0) {
        if (param0 != -18) {
            return;
        }
        oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
    }

    final void a(byte param0) {
        super.a((byte) -54);
        if (param0 > -47) {
            jm.c((byte) 116);
        }
        mf.field_b.a((br) (this), false);
    }

    final void a(int param0, qd param1) {
        if (param0 != 0) {
            return;
        }
        try {
            param1.a(this.field_q, this.field_r, this.field_m, this.field_i, this.field_o, false, this.field_j);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        jh var6 = null;
        jh var7 = null;
        ga var4 = null;
        if (ao.field_e != param0) {
            var6 = (jh) ((Object) af.field_h.a((long)ao.field_e, -22877));
            var7 = var6;
            if (var7 != null) {
                var7.field_bc = null;
            }
            ao.field_e = param0;
            var4 = ma.field_a;
            var4.b((byte) -35, param1);
            var4.a(-39, 3);
            var4.a(125, 11);
            var4.a(param0, (byte) -43);
        }
        if (param2 >= -20) {
            field_n = (float[]) null;
        }
    }

    public static void c(byte param0) {
        field_k = null;
        field_n = null;
        field_l = null;
        if (param0 < 27) {
            return;
        }
        field_p = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super.a(0, param2);
        this.field_q = param6;
        this.field_i = param3;
        this.field_o = param7;
        this.field_m = param1;
        this.field_r = param0;
        if (param4 != 27658) {
            field_l = (String) null;
        }
        this.field_j = param5;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == -23936) {
            break L0;
          } else {
            field_p = (String) null;
            break L0;
          }
        }
        L1: {
          if (null == ki.field_e) {
            break L1;
          } else {
            if ((sj.field_p ^ -1) == -14) {
              ki.field_e = null;
              return true;
            } else {
              break L1;
            }
          }
        }
        if (!sq.field_N) {
          L2: {
            if (ee.field_b) {
              break L2;
            } else {
              if (sj.field_p == 9) {
                break L2;
              } else {
                if (sj.field_p == 10) {
                  break L2;
                } else {
                  if (11 == sj.field_p) {
                    break L2;
                  } else {
                    L3: {
                      if ((sj.field_p ^ -1) != -81) {
                        break L3;
                      } else {
                        if (!uk.a((byte) -111)) {
                          break L3;
                        } else {
                          sq.field_N = true;
                          return true;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
          }
          return ai.a(false, param0, param2);
        } else {
          if (uk.a((byte) -120)) {
            L4: {
              if (!wl.a(param3, 60, param0)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            L5: {
              L6: {
                var4 = stackIn_11_0;
                if (-81 == (sj.field_p ^ -1)) {
                  break L6;
                } else {
                  if (sj.field_p != 84) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 1;
              sq.field_N = false;
              break L5;
            }
            L7: {
              if (sj.field_p == 13) {
                pf.a(-77);
                var4 = 1;
                sq.field_N = false;
                break L7;
              } else {
                break L7;
              }
            }
            return var4 != 0;
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, ja[] param3, int param4, int param5) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                discarded$1 = jm.a(-68, -96, -28, 88);
                break L1;
              }
            }
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (0 < param5) {
                  var6_int = param3[0].field_z;
                  var7 = param3[2].field_z;
                  var8 = param3[1].field_z;
                  param3[0].g(param2, param4, param0);
                  param3[2].g(-var7 + (param2 - -param5), param4, param0);
                  oo.a(ki.field_d);
                  oo.e(var6_int + param2, param4, param2 + (param5 + -var7), param4 - -param3[1].field_u);
                  var9 = param2 + var6_int;
                  var10 = param5 + param2 - var7;
                  param2 = var9;
                  L3: while (true) {
                    L4: {
                      if (param2 >= var10) {
                        oo.b(ki.field_d);
                        break L4;
                      } else {
                        param3[1].g(param2, param4, param0);
                        param2 = param2 + var8;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("jm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (param0) {
            var4 += 2;
        }
        if (param1) {
            var4++;
        }
        int var5 = 127 / ((param2 - 28) / 38);
        return pg.field_d[var4];
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            this.a(123, -52, -122, -36, 97, -37, 99, 33);
        }
    }

    jm() {
    }

    static {
        int var2 = 0;
        field_k = new float[75];
        field_n = new float[75];
        double var0 = 0.08377580409572781;
        for (var2 = 0; (var2 ^ -1) > -76; var2++) {
            field_n[var2] = (float)Math.cos((double)var2 * var0);
            field_k[var2] = (float)Math.sin((double)var2 * var0);
        }
        field_l = "Balanced";
        field_p = "Achievements";
    }
}
