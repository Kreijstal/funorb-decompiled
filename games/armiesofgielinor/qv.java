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
        if (-8 != (((qv) this).field_q.field_r.field_m ^ -1)) {
            ((qv) this).field_f = nu.field_z[ek.field_d];
        } else {
            ((qv) this).field_f = 50;
        }
        if (param0 != -7432) {
            return;
        }
        ((qv) this).field_s = ((qv) this).field_p * ((qv) this).field_f;
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte[] param4, int param5) {
        bv var6 = vl.field_n;
        var6.h(32161, param0);
        var6.field_q = var6.field_q + 1;
        if (param5 != 5623) {
            field_i = null;
        }
        int var7 = var6.field_q;
        var6.b(1, 4);
        var6.b(1, param1);
        int var8 = param2;
        if (param3) {
            // wide iinc 8 128
        }
        var6.b(1, var8);
        var6.a(param4, 0, param4.length, 102);
        var6.e(var6.field_q + -var7, 5930);
    }

    public final boolean a(oj param0, byte param1) {
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
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 57) {
            break L0;
          } else {
            ((qv) this).field_u = 46;
            break L0;
          }
        }
        L1: {
          ((qv) this).field_u = 0;
          if (-1 != (param0.field_m ^ -1)) {
            if (7 != param0.field_m) {
              break L1;
            } else {
              var10 = (md) (Object) param0;
              var4 = var10.field_D + var10.field_B * ((qv) this).field_t;
              var10.field_w = ((qv) this).field_o.c(var10.field_B, true, var10.field_D);
              if (null == var10.field_w) {
                var11 = ha.field_q + ": Can see parasite";
                ((qv) this).field_o.a(0, var11, param0);
                return false;
              } else {
                L2: {
                  var18 = new int[1];
                  var16 = var18;
                  var14 = var16;
                  var12 = var14;
                  var7 = var12;
                  var19 = var7;
                  if (var10.field_E - var10.field_D == 0) {
                    if (0 < var10.field_z + -var10.field_B) {
                      var19[0] = 2;
                      break L2;
                    } else {
                      var19[0] = 1;
                      break L2;
                    }
                  } else {
                    if ((-var10.field_D + var10.field_E ^ -1) < -1) {
                      var19[0] = 0;
                      break L2;
                    } else {
                      var18[0] = 3;
                      break L2;
                    }
                  }
                }
                var10.a(var10.field_w, param1 + -45);
                this.a(var19, true, var4);
                ((qv) this).b((oj) (Object) var10, (byte) -94);
                break L1;
              }
            }
          } else {
            L3: {
              var8 = (kr) (Object) param0;
              var4 = ((qv) this).field_t * var8.field_I + var8.field_H;
              this.a(var8.field_B, true, var4);
              if (null == var8.field_w) {
                var8.field_w = ((qv) this).field_o.c(var8.field_I, true, var8.field_H);
                break L3;
              } else {
                break L3;
              }
            }
            if (var8.field_w == null) {
              var9 = ha.field_q + ": Can see start";
              ((qv) this).field_o.a(0, var9, param0);
              return false;
            } else {
              L4: {
                if (var8.field_w.field_bb) {
                  var8.field_w = var8.field_w.b(false);
                  hs.b(-90, 29);
                  break L4;
                } else {
                  break L4;
                }
              }
              var8.field_w.field_z = 1;
              var8.a(var8.field_w, 12);
              ((qv) this).b((oj) (Object) var8, (byte) 58);
              break L1;
            }
          }
        }
        return true;
    }

    final static void c(int param0) {
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        String[][][] var8 = wh.a(117);
        String[][][] var1 = var8;
        int var2 = var8.length;
        if (sf.field_P.length < var2) {
            var2 = sf.field_P.length;
        }
        int var3 = fd.field_n[0].length;
        aw.field_j = new int[var2][var3][];
        if (param0 != -11757) {
            return;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var5 = sf.field_P[var4];
            var6 = jq.field_I[var5];
            bd.a(var8[var4], var6, var4, 2378077);
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
        if (param0 <= 24) {
            return;
        }
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
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((qv) this).field_b = null;
            break L0;
          }
        }
        var2 = ((qv) this).field_u / ((qv) this).field_f;
        ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << -409834360) / ((qv) this).field_f;
        if (var2 == ((qv) this).field_w) {
          return false;
        } else {
          if (((qv) this).field_w + 1 != var2) {
            this.i(-14628);
            ((qv) this).field_w = var2;
            ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << 117933000) / ((qv) this).field_f;
            return true;
          } else {
            ((qv) this).field_w = var2;
            ((qv) this).field_e[1] = ((qv) this).field_n[1];
            ((qv) this).field_e[0] = ((qv) this).field_n[0];
            ((qv) this).field_k[1] = 0;
            ((qv) this).field_k[0] = 0;
            ((qv) this).field_a = (-(((qv) this).field_f * ((qv) this).field_w) + ((qv) this).field_u << -1630569304) / ((qv) this).field_f;
            this.a(((qv) this).field_h[((qv) this).field_w], 126);
            ((qv) this).field_n[0] = ((qv) this).field_e[0] + ((qv) this).field_k[0];
            ((qv) this).field_n[1] = ((qv) this).field_k[1] + ((qv) this).field_e[1];
            return true;
          }
        }
    }

    private final void a(int param0, int param1) {
        if (!(-2 != (param0 ^ -1))) {
            ((qv) this).field_k[1] = -1;
        }
        if (!(0 != param0)) {
            ((qv) this).field_k[0] = 1;
        }
        int var3 = 86 / ((28 - param1) / 55);
        if (param0 == 2) {
            ((qv) this).field_k[1] = 1;
        }
        if (!(-4 != (param0 ^ -1))) {
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
                if (0 == (var10 ^ -1)) {
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
            if ((((qv) this).field_h.length ^ -1) <= -2) {
              L1: {
                var2 = ((qv) this).field_h[((qv) this).field_w];
                var3 = 1792;
                if (1 == var2) {
                  // wide iinc 3 -1024
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == -69) {
                  break L2;
                } else {
                  ((qv) this).field_d = null;
                  break L2;
                }
              }
              L3: {
                if (var2 != 0) {
                  break L3;
                } else {
                  // wide iinc 3 -512
                  break L3;
                }
              }
              L4: {
                if (var2 != -3) {
                  break L4;
                } else {
                  var3 += 0;
                  break L4;
                }
              }
              L5: {
                if (-4 != var2) {
                  break L5;
                } else {
                  // wide iinc 3 -1536
                  break L5;
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
        var2 = ((qv) this).field_a * var2 >> 2001831496;
        int var3 = ((qv) this).field_m[1] - ((qv) this).field_c[param0];
        ((qv) this).field_b[0] = var2 + ((qv) this).field_c[0];
        var3 = ((qv) this).field_a * var3 >> -1772175000;
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
        if (param0 != -14628) {
            this.e(87);
        }
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
        if (param0 > -79) {
            ((qv) this).field_k = null;
        }
        ((qv) this).field_g[0] = ((qv) this).field_n[0];
        ((qv) this).field_g[1] = ((qv) this).field_n[1];
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 <= 3) {
            return;
        }
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
        ((qv) this).field_q.field_x = this.f(-4923);
        if (!param0) {
            boolean discarded$0 = qv.j(101);
        }
        int var3 = 0;
        int var4 = 0;
        if (0 == ((qv) this).field_q.field_x) {
            var3 = ((qv) this).field_e[0];
            var4 = ((qv) this).field_e[1];
        } else {
            if (1 == ((qv) this).field_q.field_x) {
                var3 = ((qv) this).field_n[0];
                var4 = ((qv) this).field_n[1];
            }
        }
        ((qv) this).field_q.field_x = var4 * ((qv) this).field_t + var3;
    }

    final static boolean j(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -11) {
          L0: {
            L1: {
              if (-11 < (p.field_b ^ -1)) {
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
    }

    private final void a(int[] param0, boolean param1, int param2) {
        ((qv) this).field_h = param0;
        ((qv) this).field_p = ((qv) this).field_h.length;
        ((qv) this).field_d[1] = param2 / ((qv) this).field_t;
        ((qv) this).field_d[0] = -(((qv) this).field_d[1] * ((qv) this).field_t) + param2;
        this.f((byte) -116);
        this.h(-7432);
        ((qv) this).field_w = 0;
        if (!param1) {
            return;
        }
        this.d((byte) 56);
    }

    public final void b(oj param0, byte param1) {
        if (this.a(false)) {
            dh.a(param0.field_w.field_N, 0, 32);
        }
        if (param0 == null) {
            return;
        }
        this.a(true, param0);
        this.d(22);
        this.e(1);
        ((qv) this).field_q.field_m = ((qv) this).field_b[0];
        ((qv) this).field_q.field_v = ((qv) this).field_b[1];
        int var3 = this.e((byte) -69);
        jd var4 = param0.field_w;
        if (param0.field_m == 7) {
            var4.field_z = 5;
        } else {
            var4.field_z = 1;
        }
        boolean discarded$0 = ((qv) this).field_q.field_u.a(1 + ((qv) this).field_q.field_m, -35, ((qv) this).field_q.field_v - 6, var3, var4);
        int var5 = 115 / ((param1 - -26) / 48);
        ((qv) this).field_u = ((qv) this).field_u + 1;
    }

    private final int f(int param0) {
        if (null != ((qv) this).field_h) {
            // if_icmpgt L20
        } else {
            return -1;
        }
        int var2 = ((qv) this).field_h[((qv) this).field_w];
        if (param0 != -4923) {
            return -113;
        }
        int var3 = -1;
        if (!((var2 ^ -1) != -2)) {
            var3 = -1;
        }
        if (var2 == 0) {
            var3 = -1;
        }
        if (!(2 != var2)) {
            var3 = -2;
        }
        if (3 == var2) {
            var3 = -2;
        }
        return var3;
    }

    private final void d(int param0) {
        if (param0 <= 12) {
            ((qv) this).field_q = null;
        }
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
        field_i = new char[]{(char)91, (char)93, (char)35};
        field_l = new h(0);
        field_r = "This item can only be used on enemy units.";
    }
}
