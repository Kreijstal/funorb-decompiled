/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qp extends we {
    static String field_v;
    static boolean field_s;
    private int[][] field_u;
    private String[][] field_t;
    private int field_x;
    private int field_w;
    static qla field_r;

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -13 / ((24 - param1) / 57);
        return (param0 & 16) != 0 ? true : false;
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            field_v = null;
            return koa.b(0) + -30;
        }
        return koa.b(0) + -30;
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
            return null;
        }
        if (!(param0 != 0)) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 112);
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        da var12 = null;
        String var13 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var10_int = param5 + param2 + param3;
              if (var10_int == 0) {
                break L1;
              } else {
                param2 = (200 * param2 + var10_int) / (var10_int * 2);
                param5 = (var10_int + 200 * param5) / (var10_int * 2);
                break L1;
              }
            }
            if (param1 == 127) {
              L2: {
                if (500 <= var10_int) {
                  stackOut_6_0 = kha.field_a;
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = Integer.toString(var10_int);
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              L3: {
                var11 = stackIn_7_0;
                var13 = var11;
                var13 = var11;
                var12 = kn.field_p;
                if (param0 < 10) {
                  stackOut_9_0 = "0" + (char)(48 - -param0);
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = Integer.toString(param0);
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              L4: {
                var13 = stackIn_10_0;
                if (param0 != -1) {
                  break L4;
                } else {
                  var13 = "";
                  break L4;
                }
              }
              var12.a(-1, -1, es.field_h[0], param7, param4, var13);
              var12.a(param4, false, param8, es.field_h[1], param7, -1);
              var12.a(param4, false, Integer.toString(param6), es.field_h[2], param7, -1);
              var12.a(param4, false, var11, es.field_h[3], param7, -1);
              var12.a(param4, false, param2 + "%", es.field_h[4], param7, -1);
              var12.a(param4, false, param5 + "%", es.field_h[5], param7, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var10;
            stackOut_14_1 = new StringBuilder().append("qp.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param8 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 > 116) {
          param1 = (127 & param0) * param1 >> 7;
          if (2 <= param1) {
            if (param1 <= 126) {
              return (65408 & param0) - -param1;
            } else {
              param1 = 126;
              return (65408 & param0) - -param1;
            }
          } else {
            param1 = 2;
            return (65408 & param0) - -param1;
          }
        } else {
          return -119;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          return 100;
        } else {
          return -80 + (aaa.a(false) >> 1) - ((((qp) this).field_m[0].e(-163) >> 1) * ((qp) this).field_m.length - param1 * ((qp) this).field_m[0].e(-163));
        }
    }

    final void h(int param0, int param1) {
        ((qp) this).field_x = param1;
        if (param0 != 18608) {
            int discarded$0 = ((qp) this).g(-85, -41);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            return 88;
        }
        return ((qp) this).a((byte) 116, param0) + ((qp) this).field_m[param0].e(-163);
    }

    qp(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((qp) this).field_x = 0;
        ((qp) this).field_w = 0;
        try {
            ((qp) this).field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qp.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        String[] var4 = null;
        int[] var5 = null;
        upa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        String[] var15 = null;
        int stackIn_3_0 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        int stackIn_17_8 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_14_5 = 0;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        int stackOut_15_8 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var15 = ((qp) this).field_t[param1];
          var4 = var15;
          var5 = ((qp) this).field_u[param1];
          var6 = sb.field_a;
          var7 = 0;
          if (var6 != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        if (param0 <= 39) {
          return true;
        } else {
          var9 = 140 + param2;
          var10 = 0;
          var11 = 140 + param2;
          L1: while (true) {
            if (var10 >= 10) {
              L2: {
                if (var8 != 0) {
                  break L2;
                } else {
                  var7 = 1;
                  this.a(-1, (byte) 127, var6.field_f, var6.field_g, var9 + 20, var6.field_j, var6.field_l, -5818367, fna.field_k);
                  break L2;
                }
              }
              return var7 != 0;
            } else {
              var12 = var15[var10];
              if (var12 != null) {
                if (0 != var12.length()) {
                  L3: {
                    var13 = 0;
                    if (var8 == 0) {
                      if (!ue.a(var12, 0)) {
                        break L3;
                      } else {
                        var8 = 1;
                        var13 = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_14_0 = this;
                    stackOut_14_1 = var10 - -1;
                    stackOut_14_2 = 127;
                    stackOut_14_3 = var5[1 + 4 * var10];
                    stackOut_14_4 = var5[4 * var10 - -2];
                    stackOut_14_5 = var11;
                    stackOut_14_6 = var5[3 + var10 * 4];
                    stackOut_14_7 = var5[4 * var10];
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_16_5 = stackOut_14_5;
                    stackIn_16_6 = stackOut_14_6;
                    stackIn_16_7 = stackOut_14_7;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    stackIn_15_5 = stackOut_14_5;
                    stackIn_15_6 = stackOut_14_6;
                    stackIn_15_7 = stackOut_14_7;
                    if (var13 != 0) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = stackIn_16_2;
                      stackOut_16_3 = stackIn_16_3;
                      stackOut_16_4 = stackIn_16_4;
                      stackOut_16_5 = stackIn_16_5;
                      stackOut_16_6 = stackIn_16_6;
                      stackOut_16_7 = stackIn_16_7;
                      stackOut_16_8 = 10309393;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      stackIn_17_6 = stackOut_16_6;
                      stackIn_17_7 = stackOut_16_7;
                      stackIn_17_8 = stackOut_16_8;
                      break L4;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = stackIn_15_2;
                      stackOut_15_3 = stackIn_15_3;
                      stackOut_15_4 = stackIn_15_4;
                      stackOut_15_5 = stackIn_15_5;
                      stackOut_15_6 = stackIn_15_6;
                      stackOut_15_7 = stackIn_15_7;
                      stackOut_15_8 = 2431750;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      stackIn_17_6 = stackOut_15_6;
                      stackIn_17_7 = stackOut_15_7;
                      stackIn_17_8 = stackOut_15_8;
                      break L4;
                    }
                  }
                  this.a(stackIn_17_1, (byte) stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, stackIn_17_6, stackIn_17_7, stackIn_17_8 | -16777216, var12);
                  var7 = 1;
                  var9 = var11;
                  var10++;
                  var11 += 20;
                  continue L1;
                } else {
                  var10++;
                  var11 += 20;
                  continue L1;
                }
              } else {
                var10++;
                var11 += 20;
                continue L1;
              }
            }
          }
        }
    }

    public static void d() {
        field_r = null;
        field_v = null;
    }

    final void a(boolean param0, int param1, byte param2) {
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        String var9 = null;
        L0: {
          es.field_h = new int[]{85, 130, 260, 365, 470, 540};
          if (param2 <= -9) {
            break L0;
          } else {
            ((qp) this).a(false, -74, (byte) 102);
            break L0;
          }
        }
        qr.field_v.a(param1 + 63, false, b.field_v.toUpperCase() + " - " + wg.field_m[((qp) this).field_x].toUpperCase(), 65, -14279929, -1);
        var4 = 120 + param1;
        eda.field_f.a(-1, -1, es.field_h[0], -14671840, var4, hl.field_a);
        eda.field_f.a(var4, false, pta.field_g.toUpperCase(), es.field_h[1], -14671840, -1);
        eda.field_f.a(var4, false, nj.field_o.toUpperCase(), es.field_h[2], -14671840, -1);
        eda.field_f.a(var4, false, rb.field_q.toUpperCase(), es.field_h[3], -14671840, -1);
        eda.field_f.a(var4, false, ufa.field_u.toUpperCase(), es.field_h[4], -14671840, -1);
        eda.field_f.a(var4, false, ida.field_a.toUpperCase(), es.field_h[5], -14671840, -1);
        var7 = null;
        var5 = var7;
        var6 = ((qp) this).field_w;
        if (0 == var6) {
          var8 = dt.field_n;
          if (var8 != null) {
            oka.a(var8.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
            return;
          } else {
            boolean discarded$3 = this.a((byte) 106, ((qp) this).field_x, param1);
            return;
          }
        } else {
          if (var6 == 1) {
            var9 = kt.field_H;
            if (var9 != null) {
              oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
              return;
            } else {
              boolean discarded$4 = this.a((byte) 106, ((qp) this).field_x, param1);
              return;
            }
          } else {
            if (var5 != null) {
              oka.a(((String) var7).toUpperCase(), 65793, eda.field_f, -1, param1 + 240, aaa.a(false) >> 1, -1);
              return;
            } else {
              boolean discarded$5 = this.a((byte) 106, ((qp) this).field_x, param1);
              return;
            }
          }
        }
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
            int discarded$0 = ((qp) this).a(-73, (byte) -31);
            return super.c(param0, 0);
        }
        return super.c(param0, 0);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        upa var7 = null;
        upa var8 = null;
        upa var9 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        if (param2 == 15283) {
          if (param0) {
            if (!vpa.a(111)) {
              var9 = sb.field_a;
              if (var9 != null) {
                if (var9.field_i) {
                  if (null == var9.field_h) {
                    ((qp) this).field_w = 1;
                    return;
                  } else {
                    ((qp) this).field_w = 2;
                    ((qp) this).field_u = var9.field_m;
                    ((qp) this).field_t = var9.field_h;
                    return;
                  }
                } else {
                  ((qp) this).field_w = 0;
                  return;
                }
              } else {
                sb.field_a = pt.a(22578, 7, 10, 0);
                ((qp) this).field_w = 0;
                return;
              }
            } else {
              ((qp) this).field_w = 1;
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          this.a(38, (byte) 100, -54, 60, 55, -54, -22, -27, (String) null);
          if (param0) {
            if (!vpa.a(111)) {
              var8 = sb.field_a;
              var7 = var8;
              if (var8 != null) {
                if (var8.field_i) {
                  if (null == var8.field_h) {
                    ((qp) this).field_w = 1;
                    return;
                  } else {
                    ((qp) this).field_w = 2;
                    ((qp) this).field_u = var8.field_m;
                    ((qp) this).field_t = var8.field_h;
                    return;
                  }
                } else {
                  ((qp) this).field_w = 0;
                  return;
                }
              } else {
                sb.field_a = pt.a(22578, 7, 10, 0);
                ((qp) this).field_w = 0;
                return;
              }
            } else {
              ((qp) this).field_w = 1;
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -13) {
          L0: {
            boolean discarded$4 = this.a((byte) 118, -37, -116);
            if (((qp) this).field_x != -1 + param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((qp) this).field_x != -1 + param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Unfortunately you are not eligible to create an account.";
    }
}
