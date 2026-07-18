/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends me {
    static int[][] field_k;
    static int[][] field_m;
    static int[][] field_q;
    private int field_n;
    static int[][] field_s;
    private int field_t;
    private int field_j;
    static int[][] field_u;
    private int field_l;
    static String[][] field_o;
    static int[][] field_p;
    static int[][] field_r;

    final static String a(byte param0, char param1) {
        int var2 = 0;
        return String.valueOf(param1);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((no) this).field_t == 0) {
          if (null != rba.field_a) {
            if (null == rba.field_a.field_g) {
              ((no) this).field_t = ((no) this).field_t + 1;
              if (param0 < -107) {
                var2 = aq.field_a[0].c();
                var3 = 60;
                var3 = var2 * (var3 / var2);
                if (((no) this).field_t < 20) {
                  ((no) this).field_l = koa.b(0) + -10 + -(((no) this).field_t * (var3 / 2) / 20);
                  if (((no) this).field_l <= koa.b(0) + 10) {
                    return;
                  } else {
                    ((no) this).field_h = true;
                    ((no) this).p(94);
                    return;
                  }
                } else {
                  if (((no) this).field_t < 100) {
                    ((no) this).field_l = -10 + (koa.b(0) - var3 / 2);
                    if (((no) this).field_l > koa.b(0) + 10) {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((no) this).field_l = ((no) this).field_l + 10;
                    if (((no) this).field_l > koa.b(0) + 10) {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              fla discarded$1 = rba.field_a.field_g[rba.field_a.l(92)].a(new fm(93, 0, 0, 0), -58);
              ((no) this).field_t = ((no) this).field_t + 1;
              if (param0 < -107) {
                var2 = aq.field_a[0].c();
                var3 = 60;
                var3 = var2 * (var3 / var2);
                if (((no) this).field_t >= 20) {
                  if (((no) this).field_t < 100) {
                    L0: {
                      ((no) this).field_l = -10 + (koa.b(0) - var3 / 2);
                      if (((no) this).field_l <= koa.b(0) + 10) {
                        break L0;
                      } else {
                        ((no) this).field_h = true;
                        ((no) this).p(94);
                        break L0;
                      }
                    }
                    return;
                  } else {
                    ((no) this).field_l = ((no) this).field_l + 10;
                    if (((no) this).field_l > koa.b(0) + 10) {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L1: {
                    ((no) this).field_l = koa.b(0) + -10 + -(((no) this).field_t * (var3 / 2) / 20);
                    if (((no) this).field_l <= koa.b(0) + 10) {
                      break L1;
                    } else {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((no) this).field_t = ((no) this).field_t + 1;
            if (param0 < -107) {
              var2 = aq.field_a[0].c();
              var3 = 60;
              var3 = var2 * (var3 / var2);
              if (((no) this).field_t >= 20) {
                if (((no) this).field_t >= 100) {
                  L2: {
                    ((no) this).field_l = ((no) this).field_l + 10;
                    if (((no) this).field_l <= koa.b(0) + 10) {
                      break L2;
                    } else {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      break L2;
                    }
                  }
                  return;
                } else {
                  L3: {
                    ((no) this).field_l = -10 + (koa.b(0) - var3 / 2);
                    if (((no) this).field_l <= koa.b(0) + 10) {
                      break L3;
                    } else {
                      ((no) this).field_h = true;
                      ((no) this).p(94);
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  ((no) this).field_l = koa.b(0) + -10 + -(((no) this).field_t * (var3 / 2) / 20);
                  if (((no) this).field_l <= koa.b(0) + 10) {
                    break L4;
                  } else {
                    ((no) this).field_h = true;
                    ((no) this).p(94);
                    break L4;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((no) this).field_t = ((no) this).field_t + 1;
          if (param0 < -107) {
            var2 = aq.field_a[0].c();
            var3 = 60;
            var3 = var2 * (var3 / var2);
            if (((no) this).field_t >= 20) {
              if (((no) this).field_t >= 100) {
                L5: {
                  ((no) this).field_l = ((no) this).field_l + 10;
                  if (((no) this).field_l <= koa.b(0) + 10) {
                    break L5;
                  } else {
                    ((no) this).field_h = true;
                    ((no) this).p(94);
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  ((no) this).field_l = -10 + (koa.b(0) - var3 / 2);
                  if (((no) this).field_l <= koa.b(0) + 10) {
                    break L6;
                  } else {
                    ((no) this).field_h = true;
                    ((no) this).p(94);
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                ((no) this).field_l = koa.b(0) + -10 + -(((no) this).field_t * (var3 / 2) / 20);
                if (((no) this).field_l <= koa.b(0) + 10) {
                  break L7;
                } else {
                  ((no) this).field_h = true;
                  ((no) this).p(94);
                  break L7;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        String var18 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        var2 = 300;
        var3 = 60;
        var4 = aq.field_a[0].a();
        var2 = var4 * (var2 / var4);
        var5 = aq.field_a[0].c();
        var3 = var3 / var5 * var5;
        var6 = ((no) this).field_j;
        var7 = -(var3 / 2) + ((no) this).field_l;
        var8 = 10;
        if (param0 > -13) {
          field_o = null;
          var9 = 10;
          var10 = 10;
          var11 = -var9 + -var8 + var2;
          var12 = var3 + -(var10 * 2);
          var13 = -var8 + (-var9 + -24 + var11);
          var17 = lq.field_p[((no) this).field_n].toUpperCase();
          var15 = ds.field_n.a(var17, (byte) -117);
          L0: while (true) {
            if (var15 <= var13) {
              qa.a(var3, var2, (byte) 70, var6, aq.field_a, var7);
              int discarded$2 = be.a(var17, 1, eda.field_f, 16777215, 30, var12, 1, var10 + var7, var6 - -30 - -(2 * var8), -1, (byte) 60, var13);
              lva.field_m[((no) this).field_n].a(var8 + var6, var7 - -((-32 + var3) / 2), 32, 32);
              return;
            } else {
              var13 = var13 + var4;
              var11 = var11 + var4;
              var2 = var2 + var4;
              continue L0;
            }
          }
        } else {
          var9 = 10;
          var10 = 10;
          var11 = -var9 + -var8 + var2;
          var12 = var3 + -(var10 * 2);
          var13 = -var8 + (-var9 + -24 + var11);
          var18 = lq.field_p[((no) this).field_n].toUpperCase();
          var15 = ds.field_n.a(var18, (byte) -117);
          L1: while (true) {
            if (var15 <= var13) {
              qa.a(var3, var2, (byte) 70, var6, aq.field_a, var7);
              int discarded$3 = be.a(var18, 1, eda.field_f, 16777215, 30, var12, 1, var10 + var7, var6 - -30 - -(2 * var8), -1, (byte) 60, var13);
              lva.field_m[((no) this).field_n].a(var8 + var6, var7 - -((-32 + var3) / 2), 32, 32);
              return;
            } else {
              var13 = var13 + var4;
              var11 = var11 + var4;
              var2 = var2 + var4;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0, int param1) {
        if (!lf.a(param0, param1, 128)) {
            return false;
        }
        int discarded$10 = 26205;
        if (!(bqa.a(540800, param1, param0) | ((param1 & 36864) == 0 ? true : false) | go.d(param0, param1))) {
            return true;
        }
        int discarded$19 = 0;
        return (((8192 & param1) != 0 ? true : false) | kaa.a(param0, param1) | rg.e(param0, -85, param1)) & (0 == (55 & param0) ? true : false);
    }

    final static void a(String param0, long param1) {
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            wp.field_a = param0;
            bta.field_q = 2;
            var5 = (CharSequence) (Object) param0;
            mn.field_n = jd.a(1, var5);
            ica.field_b = param1;
            ni.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("no.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 120 + ')');
        }
    }

    public static void b() {
        field_o = null;
        field_r = null;
        field_u = null;
        field_m = null;
        field_s = null;
        field_p = null;
        field_k = null;
        field_q = null;
    }

    no(qh param0, int param1) {
        super(param0);
        ((no) this).field_t = 0;
        try {
            ((no) this).field_j = 10;
            ((no) this).field_n = param1;
            ((no) this).field_l = koa.b(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 107 % ((param2 - 29) / 57);
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[11][];
        field_q = new int[11][];
        field_u = new int[11][];
        field_k = new int[11][];
        field_s = new int[11][];
        field_m = new int[11][];
        field_r = new int[11][];
        field_m[0] = new int[7];
        field_u[0] = new int[7];
        field_m[1] = new int[3];
        field_u[1] = new int[3];
        field_q[1] = new int[3];
        field_r[1] = new int[3];
        field_s[1] = new int[3];
        field_k[1] = new int[3];
        field_m[2] = new int[3];
        field_p[1] = new int[3];
        field_u[2] = new int[3];
        field_q[2] = new int[3];
        field_r[2] = new int[3];
        field_s[2] = new int[3];
        field_k[2] = new int[3];
        field_m[3] = new int[3];
        field_p[2] = new int[3];
        field_u[3] = new int[3];
        field_q[3] = new int[3];
        field_r[3] = new int[3];
        field_s[3] = new int[3];
        field_k[3] = new int[3];
        field_m[4] = new int[3];
        field_p[3] = new int[3];
        field_u[4] = new int[3];
        field_q[4] = new int[3];
        field_r[4] = new int[3];
        field_s[4] = new int[3];
        field_k[4] = new int[3];
        field_p[4] = new int[3];
        field_m[5] = new int[3];
        field_u[5] = new int[3];
        field_q[5] = new int[3];
        field_r[5] = new int[3];
        field_s[5] = new int[3];
        field_k[5] = new int[3];
        field_p[5] = new int[3];
        field_m[6] = new int[3];
        field_u[6] = new int[3];
        field_q[6] = new int[3];
        field_r[6] = new int[3];
        field_s[6] = new int[3];
        field_k[6] = new int[3];
        field_m[7] = new int[2];
        field_p[6] = new int[3];
        field_u[7] = new int[2];
        field_q[7] = new int[2];
        field_r[7] = new int[2];
        field_s[7] = new int[2];
        field_k[7] = new int[2];
        field_p[7] = new int[2];
        field_m[8] = new int[3];
        field_u[8] = new int[3];
        field_q[8] = new int[3];
        field_r[8] = new int[3];
        field_s[8] = new int[3];
        field_k[8] = new int[3];
        field_p[8] = new int[3];
        field_m[9] = new int[3];
        field_u[9] = new int[3];
        field_q[9] = new int[3];
        field_r[9] = new int[3];
        field_s[9] = new int[3];
        field_k[9] = new int[3];
        field_p[9] = new int[3];
        field_m[10] = new int[3];
        field_u[10] = new int[3];
        field_q[10] = new int[3];
        field_r[10] = new int[3];
        field_s[10] = new int[3];
        field_k[10] = new int[3];
        field_p[10] = new int[3];
    }
}
