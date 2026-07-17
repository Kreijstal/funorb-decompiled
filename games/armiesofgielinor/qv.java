/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qv implements pa {
    private int[] field_h;
    private int field_p;
    private int field_f;
    private int[] field_k;
    private int field_u;
    private int[] field_m;
    private int field_a;
    private int[] field_g;
    private int[] field_c;
    private int[] field_b;
    private int[] field_n;
    private ha field_o;
    private int field_w;
    private int[] field_e;
    private int[] field_d;
    private v field_v;
    private vb field_q;
    static char[] field_i;
    private int field_t;
    static h field_l;
    private int field_s;
    static int[] field_j;
    static String field_r;

    public final boolean b(byte param0) {
        if (param0 >= -25) {
            return true;
        }
        return false;
    }

    private final void h(int param0) {
        if (((qv) this).field_q.field_r.field_m != 7) {
            ((qv) this).field_f = nu.field_z[ek.field_d];
        } else {
            ((qv) this).field_f = 50;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte[] param4, int param5) {
        bv var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = vl.field_n;
            var6.h(32161, param0);
            var6.field_q = var6.field_q + 1;
            var7 = var6.field_q;
            var6.b(1, 4);
            var6.b(1, param1);
            var8 = param2;
            if (param3) {
                var8 += 128;
            }
            var6.b(1, var8);
            var6.a(param4, 0, param4.length, 102);
            var6.e(var6.field_q + -var7, 5930);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "qv.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + 5623 + 41);
        }
    }

    public final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int[] var7 = null;
        kr var8 = null;
        String var9 = null;
        md var10 = null;
        String var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 57) {
                break L1;
              } else {
                ((qv) this).field_u = 46;
                break L1;
              }
            }
            L2: {
              ((qv) this).field_u = 0;
              if (param0.field_m != 0) {
                if (7 != param0.field_m) {
                  break L2;
                } else {
                  var10 = (md) (Object) param0;
                  var4 = var10.field_D + var10.field_B * ((qv) this).field_t;
                  var10.field_w = ((qv) this).field_o.c(var10.field_B, true, var10.field_D);
                  if (null == var10.field_w) {
                    var11 = ha.field_q + ": Can see parasite";
                    ((qv) this).field_o.a(0, var11, param0);
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  } else {
                    L3: {
                      var18 = new int[1];
                      var16 = var18;
                      var14 = var16;
                      var12 = var14;
                      var7 = var12;
                      var19 = var7;
                      if (var10.field_E - var10.field_D == 0) {
                        if (0 < var10.field_z + -var10.field_B) {
                          var19[0] = 2;
                          break L3;
                        } else {
                          var19[0] = 1;
                          break L3;
                        }
                      } else {
                        if (-var10.field_D + var10.field_E > 0) {
                          var19[0] = 0;
                          break L3;
                        } else {
                          var18[0] = 3;
                          break L3;
                        }
                      }
                    }
                    var10.a(var10.field_w, param1 + -45);
                    this.a(var19, true, var4);
                    ((qv) this).b((oj) (Object) var10, (byte) -94);
                    break L2;
                  }
                }
              } else {
                L4: {
                  var8 = (kr) (Object) param0;
                  var4 = ((qv) this).field_t * var8.field_I + var8.field_H;
                  this.a(var8.field_B, true, var4);
                  if (null == var8.field_w) {
                    var8.field_w = ((qv) this).field_o.c(var8.field_I, true, var8.field_H);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var8.field_w == null) {
                  var9 = ha.field_q + ": Can see start";
                  ((qv) this).field_o.a(0, var9, param0);
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  L5: {
                    if (var8.field_w.field_bb) {
                      var8.field_w = var8.field_w.b(false);
                      hs.b(-90, 29);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8.field_w.field_z = 1;
                  var8.a(var8.field_w, 12);
                  ((qv) this).b((oj) (Object) var8, (byte) 58);
                  break L2;
                }
              }
            }
            stackOut_28_0 = 1;
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("qv.E(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 41);
        }
        return stackIn_29_0 != 0;
    }

    final static void c(int param0) {
        String[][][] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        String[][][] var8 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = wh.a(117);
              var1 = var8;
              var2 = var8.length;
              if (sf.field_P.length >= var2) {
                break L1;
              } else {
                var2 = sf.field_P.length;
                break L1;
              }
            }
            var3 = fd.field_n[0].length;
            aw.field_j = new int[var2][var3][];
            if (param0 == -11757) {
              var4 = 0;
              L2: while (true) {
                if (var4 >= var2) {
                  break L0;
                } else {
                  var5 = sf.field_P[var4];
                  var6 = jq.field_I[var5];
                  bd.a(var8[var4], var6, var4, 2378077);
                  var4++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1_ref, "qv.P(" + param0 + 41);
        }
    }

    private final void d(byte param0) {
        ((qv) this).field_e[0] = ((qv) this).field_d[0];
        ((qv) this).field_e[1] = ((qv) this).field_d[1];
        if (0 >= ((qv) this).field_p) {
            return;
        }
        int var2 = ((qv) this).field_h[0];
        ((qv) this).field_k[1] = 0;
        ((qv) this).field_k[0] = 0;
        this.a(var2, 96);
        ((qv) this).field_n[1] = ((qv) this).field_e[1] - -((qv) this).field_k[1];
        ((qv) this).field_n[0] = ((qv) this).field_k[0] + ((qv) this).field_e[0];
    }

    public final void a(byte param0) {
        if (param0 != -52) {
            qv.c(101);
        }
    }

    private final boolean a(boolean param0) {
        int var2 = 0;
        var2 = ((qv) this).field_u / ((qv) this).field_f;
        ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << 8) / ((qv) this).field_f;
        if (var2 == ((qv) this).field_w) {
          return false;
        } else {
          if (((qv) this).field_w + 1 != var2) {
            this.i(-14628);
            ((qv) this).field_w = var2;
            ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << 8) / ((qv) this).field_f;
            return true;
          } else {
            ((qv) this).field_w = var2;
            ((qv) this).field_e[1] = ((qv) this).field_n[1];
            ((qv) this).field_e[0] = ((qv) this).field_n[0];
            ((qv) this).field_k[1] = 0;
            ((qv) this).field_k[0] = 0;
            ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << 8) / ((qv) this).field_f;
            this.a(((qv) this).field_h[((qv) this).field_w], 126);
            ((qv) this).field_n[0] = ((qv) this).field_e[0] + ((qv) this).field_k[0];
            ((qv) this).field_n[1] = ((qv) this).field_k[1] + ((qv) this).field_e[1];
            return true;
          }
        }
    }

    private final void a(int param0, int param1) {
        if (!(param0 != 1)) {
            ((qv) this).field_k[1] = -1;
        }
        if (!(0 != param0)) {
            ((qv) this).field_k[0] = 1;
        }
        int var3 = 86 / ((28 - param1) / 55);
        if (param0 == 2) {
            ((qv) this).field_k[1] = 1;
        }
        if (!(param0 != 3)) {
            ((qv) this).field_k[0] = -1;
        }
    }

    public final void c(byte param0) {
        if (param0 >= -119) {
            ((qv) this).a((byte) 114);
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!(param1 instanceof g)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (g) (Object) param1;
            param1 = var14.field_b;
            var2 = var14.field_g + " | ";
            break L0;
          }
        }
        L1: {
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var15);
          if (param0 == 0) {
            break L1;
          } else {
            field_i = null;
            break L1;
          }
        }
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (var9 != -1) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8;
                break L3;
              }
            }
            L4: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf('\t'));
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (-1 == var9) {
                break L4;
              } else {
                if (var10 == -1) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (0 > var12) {
                    break L4;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L2;
          }
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (((qv) this).field_h == null) {
            break L0;
          } else {
            if (((qv) this).field_h.length >= 1) {
              L1: {
                var2 = ((qv) this).field_h[((qv) this).field_w];
                var3 = 1792;
                if (1 == var2) {
                  var3 -= 1024;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var2 != 0) {
                  break L2;
                } else {
                  var3 -= 512;
                  break L2;
                }
              }
              L3: {
                if (var2 != 2) {
                  break L3;
                } else {
                  var3 += 0;
                  break L3;
                }
              }
              L4: {
                if (var2 != 3) {
                  break L4;
                } else {
                  var3 -= 1536;
                  break L4;
                }
              }
              return var3;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final void e(int param0) {
        int var2 = ((qv) this).field_m[0] - ((qv) this).field_c[0];
        var2 = ((qv) this).field_a * var2 >> 8;
        int var3 = ((qv) this).field_m[1] - ((qv) this).field_c[param0];
        ((qv) this).field_b[0] = var2 + ((qv) this).field_c[0];
        var3 = ((qv) this).field_a * var3 >> 8;
        ((qv) this).field_b[1] = var3 + ((qv) this).field_c[1];
    }

    public final void a(int param0) {
        if (param0 < 94) {
            ((qv) this).field_g = null;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((qv) this).field_n[0] = ((qv) this).field_d[0];
        ((qv) this).field_n[1] = ((qv) this).field_d[1];
        ((qv) this).field_k[0] = 0;
        ((qv) this).field_k[1] = 0;
        for (var2 = 0; var2 <= ((qv) this).field_w; var2++) {
            this.a(((qv) this).field_h[((qv) this).field_w], 104);
            ((qv) this).field_n[0] = ((qv) this).field_n[0] + ((qv) this).field_k[0];
            ((qv) this).field_n[1] = ((qv) this).field_n[1] + ((qv) this).field_k[1];
        }
        ((qv) this).field_e[0] = ((qv) this).field_n[0] - ((qv) this).field_k[0];
        ((qv) this).field_e[1] = -((qv) this).field_k[1] + ((qv) this).field_n[1];
    }

    private final void f(byte param0) {
        ((qv) this).field_w = ((qv) this).field_p - 1;
        this.i(-14628);
        ((qv) this).field_g[0] = ((qv) this).field_n[0];
        ((qv) this).field_g[1] = ((qv) this).field_n[1];
    }

    public static void g(int param0) {
        field_r = null;
        field_l = null;
        field_j = null;
        field_i = null;
    }

    public final boolean b(int param0) {
        if (param0 != 8865) {
            ((qv) this).field_d = null;
        }
        return ((qv) this).field_s <= ((qv) this).field_u ? true : false;
    }

    private final void a(boolean param0, oj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            L1: {
              ((qv) this).field_q.field_x = this.f(-4923);
              if (param0) {
                break L1;
              } else {
                boolean discarded$2 = qv.j(101);
                break L1;
              }
            }
            L2: {
              var3_int = 0;
              var4 = 0;
              if (0 != ((qv) this).field_q.field_x) {
                if (1 != ((qv) this).field_q.field_x) {
                  break L2;
                } else {
                  var3_int = ((qv) this).field_n[0];
                  var4 = ((qv) this).field_n[1];
                  break L2;
                }
              } else {
                var3_int = ((qv) this).field_e[0];
                var4 = ((qv) this).field_e[1];
                break L2;
              }
            }
            ((qv) this).field_q.field_x = var4 * ((qv) this).field_t + var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qv.M(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static boolean j(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -11) {
          L0: {
            L1: {
              if (p.field_b < 10) {
                break L1;
              } else {
                if (bl.field_b) {
                  break L1;
                } else {
                  if (go.a(-103)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    qv(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
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
        try {
          L0: {
            ((qv) this).field_n = new int[2];
            ((qv) this).field_c = new int[2];
            ((qv) this).field_o = param0;
            ((qv) this).field_m = new int[2];
            ((qv) this).field_v = param1;
            ((qv) this).field_t = param0.field_v;
            ((qv) this).field_q = param2;
            ((qv) this).field_b = new int[2];
            ((qv) this).field_g = new int[2];
            ((qv) this).field_e = new int[2];
            ((qv) this).field_d = new int[2];
            ((qv) this).field_k = new int[2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("qv.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    private final void a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
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
            ((qv) this).field_h = param0;
            ((qv) this).field_p = ((qv) this).field_h.length;
            ((qv) this).field_d[1] = param2 / ((qv) this).field_t;
            ((qv) this).field_d[0] = -(((qv) this).field_d[1] * ((qv) this).field_t) + param2;
            this.f((byte) -116);
            this.h(-7432);
            ((qv) this).field_w = 0;
            if (param1) {
              this.d((byte) 56);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qv.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void b(oj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        jd var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (!this.a(false)) {
                break L1;
              } else {
                dh.a(param0.field_w.field_N, 0, 32);
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                this.a(true, param0);
                this.d(22);
                this.e(1);
                ((qv) this).field_q.field_m = ((qv) this).field_b[0];
                ((qv) this).field_q.field_v = ((qv) this).field_b[1];
                var3_int = this.e((byte) -69);
                var4 = param0.field_w;
                if (param0.field_m != 7) {
                  var4.field_z = 1;
                  break L2;
                } else {
                  var4.field_z = 5;
                  break L2;
                }
              }
              boolean discarded$2 = ((qv) this).field_q.field_u.a(1 + ((qv) this).field_q.field_m, -35, ((qv) this).field_q.field_v - 6, var3_int, var4);
              var5 = 115 / ((param1 - -26) / 48);
              ((qv) this).field_u = ((qv) this).field_u + 1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qv.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          if (null == ((qv) this).field_h) {
            break L0;
          } else {
            if (1 > ((qv) this).field_h.length) {
              break L0;
            } else {
              L1: {
                var2 = ((qv) this).field_h[((qv) this).field_w];
                var3 = -1;
                if (var2 == 1) {
                  var3 = -1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var2 != 0) {
                  break L2;
                } else {
                  var3 = -1;
                  break L2;
                }
              }
              L3: {
                if (2 == var2) {
                  var3 = -2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (3 != var2) {
                  break L4;
                } else {
                  var3 = -2;
                  break L4;
                }
              }
              return var3;
            }
          }
        }
        return -1;
    }

    private final void d(int param0) {
        ((qv) this).field_v.field_c[1] = ((qv) this).field_e[1];
        ((qv) this).field_v.field_c[0] = ((qv) this).field_e[0];
        ((qv) this).field_v.f(-88);
        ((qv) this).field_v.i(0);
        ((qv) this).field_c[1] = ((qv) this).field_v.field_e[1];
        ((qv) this).field_c[0] = ((qv) this).field_v.field_e[0];
        ((qv) this).field_v.field_c[1] = ((qv) this).field_n[1];
        ((qv) this).field_v.field_c[0] = ((qv) this).field_n[0];
        ((qv) this).field_v.f(-54);
        ((qv) this).field_v.i(0);
        ((qv) this).field_m[0] = ((qv) this).field_v.field_e[0];
        ((qv) this).field_m[1] = ((qv) this).field_v.field_e[1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new char[]{'[', ']', '#'};
        field_l = new h(0);
        field_r = "This item can only be used on enemy units.";
    }
}
