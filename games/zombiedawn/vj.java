/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vj extends al {
    static String field_s;
    static int[] field_t;
    static byte[][] field_m;
    static String[] field_p;
    static int field_q;
    static long field_n;
    private vn field_r;
    static int field_o;
    private vn field_u;

    final void a(int param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 != -31645) {
          field_s = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (kg.field_i == 98) {
          if (this.field_b.field_d >= 2) {
            this.field_b.b(1, 64);
          } else {
            if (0 < this.field_b.field_d) {
              this.field_b.b(this.field_b.field_d - 1, param0 ^ 31727);
            }
          }
        } else {
          if (99 == kg.field_i) {
            if (!(this.field_b.field_d >= 2)) {
              this.field_b.b(this.field_b.field_d + 1, param0 + 31551);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (kg.field_i == 96) {
              if (!(this.field_b.field_d < 3)) {
                super.a(-31645);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (97 != kg.field_i) {
                super.a(-31645);
              } else {
                if (this.field_b.field_d >= 2 &&
                  !(-1 + this.field_b.field_h <= this.field_b.field_d)) {
                  super.a(-31645);
                }
              }
            }
          }
        }

    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        int var7;
        String var8;
        String var9;
        int var10;
        int var11;
        String var12;
        int var14;
        aj var15;
        StringWriter var16;
        String var17;
        String var18;
        String var19;
        String var20;
        int var13;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
        String var12Lifetime4;
        String var12Lifetime5;
        String var12Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var12Lifetime5Lifetime1;
        String var12Lifetime5Lifetime2;
        var14 = ZombieDawn.field_J;
        if (param0 instanceof aj) {
          var15 = (aj) ((Object) param0);
          var2 = var15.field_b + " | ";
          var12 = var2;
          var2 = var12;
          var12Lifetime6 = var2;
          param0 = var15.field_c;
        } else {
          var2 = "";
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var16));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var12Lifetime1 = var5;
        var2Lifetime1 = var12Lifetime1;
        var12Lifetime2 = var5;
        var7 = 25 % ((13 - param1) / 47);
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var8 = var6.readLine();
        var12Lifetime3 = var8;
        var2Lifetime2 = var12Lifetime3;
        var12Lifetime4 = var8;
        while (true) {
          var9 = var6.readLine();
          var12Lifetime5 = var9;
          var2Lifetime3 = var12Lifetime5;
          var12Lifetime5Lifetime1 = var9;
          if (var9 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var8;
            return var2Lifetime3;
          }
          var10 = var9.indexOf('(');
          var11 = var9.indexOf(')', 1 + var10);
          if (var10 == -1) {
            var12Lifetime5Lifetime2 = var9;
            var2Lifetime3Lifetime1 = var12Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var12Lifetime5Lifetime2;
          } else {
            var12Lifetime5Lifetime2 = var9.substring(0, var10);
          }
          var17 = var12Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var17;
          var2Lifetime3Lifetime3 = var17;
          var18 = var17.substring(var17.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime4 = var18;
          var2Lifetime3Lifetime5 = var18;
          var19 = var18.substring(1 + var18.lastIndexOf('\t'));
          var2Lifetime3Lifetime6 = var19;
          var2Lifetime3Lifetime7 = var19;
          var20 = var2Lifetime3Lifetime7 + var19;
          var2Lifetime3Lifetime8 = var20;
          var2Lifetime3Lifetime9 = var20;
          var2Lifetime3Lifetime10 = var20;
          if (var10 != -1) {
            if (-1 == var11) {
              var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
              continue;
            }
            var13 = var9.indexOf(".java:", var10);
            if (var13 >= 0) {
              var2Lifetime3Lifetime10 = var20 + var9.substring(5 + var13, var11);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          return -21;
        }
        if (po.w(13296)) {
          if (param1 != 0) {
            return this.c(param1, 6) + 100;
          }
          return 350 + this.c(param1, 6);
        }
        if (param1 < 2) {
          return jb.field_a[1].field_w + (vh.field_b + 30);
        }
        return 180 + this.c(param1, 6);
    }

    final static void d(int param0) {
        ng.field_a = new fk();
        bm.field_d.b(20, ng.field_a);
        int var1 = 54 / ((-28 - param0) / 39);
    }

    final int b(int param0, boolean param1) {
        if (!param1) {
          String var4 = (String) null;
          vj.a((dj) null, (String) null, (String) null, -46);
        }
        if (!po.w(13296) &&
          param0 < 2) {
          return jb.field_a[1].field_t;
        }
        return super.b(param0, true);
    }

    public static void e(byte param0) {
        field_m = (byte[][]) null;
        if (param0 != 112) {
          field_t = (int[]) null;
        }
        field_s = null;
        field_p = null;
        field_t = null;
    }

    vj(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void a(byte param0) {
        int var5_int = 0;
        int stackIn_35_0 = 0;
        String stackIn_54_0 = null;
        String var2;
        int var3;
        int var4;
        tj var5;
        jc var6;
        String[] var7;
        int var9;
        int var10;
        int var11;
        int var12;
        String var13;
        int var14;
        int[] var18;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var10Lifetime1;
        int var3Lifetime1Lifetime1;
        String var2Lifetime1;
        var14 = ZombieDawn.field_J;
        super.a((byte) -51);
        li.a(false);
        if (this.field_r == null) {
          this.field_r = new vn(100, 100);
          ki.a((byte) -92, this.field_r);
          bi.d();
          jb.field_a[1].b(25, 25);
          for (var3 = 0; var3 < 5; var3++) {
            so.a(4424743);
          }
          bi.h(2, 2, 0, 0, 100, 100);
          pa.a(-21189);
          this.field_u = new vn(100, 100);
          ki.a((byte) -94, this.field_u);
          bi.d();
          jb.field_a[1].b(25, 25);
          for (var3Lifetime3 = 0; var3Lifetime3 < 2; var3Lifetime3++) {
            so.a(16777215);
          }
          pa.a(-21189);
        }
        if (!po.w(13296)) {
          var3Lifetime1 = nh.field_G - 45;
          var4 = vh.field_b + 30;
          for (var5_int = 0; 2 > var5_int; var5_int++) {
            if (qm.field_b == var5_int) {
              if (var5_int == this.field_b.field_d) {
                this.field_u.b(var4 - 25, var3Lifetime1 - 25);
              }
              this.field_r.b(var4 - 25, var3Lifetime1 - 25, 240);
              jb.field_a[var5_int + 1].b(var4, var3Lifetime1);
            } else {
              if (this.field_b.field_d == var5_int) {
                this.field_u.b(-25 + var4, -25 + var3Lifetime1);
                jb.field_a[1 + var5_int].d(var4, var3Lifetime1, 240);
              } else {
                jb.field_a[1 + var5_int].d(var4, var3Lifetime1, 192);
              }
            }
            var3Lifetime1 += 90;
          }
          if (null == bd.field_m) {
            bd.field_m = fg.a(3, 10, 1, qm.field_b + 42, 1);
          }
          var5 = sg.field_jb;
          var6 = bd.field_m;
          if (!var6.field_j) {
            var2 = jh.field_l;
          } else if (null != var6.field_m &&
            var6.field_k != null) {
            var2 = r.field_I;
            var7 = var6.field_m[ad.field_e];
            var18 = var6.field_k[ad.field_e];
            var9 = ph.a(wi.field_b, (byte) -93, ad.field_e, var6);
            var3Lifetime1Lifetime1 = var5.field_I + (89 + id.field_M);
            var5.a(q.field_G[qm.field_b], bd.field_d, var3Lifetime1Lifetime1, 10, 0);
            var3Lifetime1Lifetime1 = var3Lifetime1Lifetime1 + (var5.field_I + 10);
            var5.b(og.field_z, 220 + (vh.field_b - 30), var3Lifetime1Lifetime1, 2, 0);
            var5.c(lo.field_r, -10 + (220 + vh.field_b), var3Lifetime1Lifetime1, 2, 0);
            var5.b(ZombieDawn.field_D, 20 + (440 + vh.field_b), var3Lifetime1Lifetime1, 2, 0);
            var3Lifetime1Lifetime1 += 25;
            for (var10 = 0; 10 > var10; var10++) {
              stackIn_35_0 = (~var9 == ~var10) ? 16776960 : 16777215;
              var11 = stackIn_35_0;
              if (null != var7[var10]) {
                var12 = var18[var10];
                var13 = var7[var10];
                if (var9 == var10) {
                  var11 = 16776960;
                }
                bj.field_q.b(var10 + 1 + ". ", -40 + (220 + vh.field_b), var3Lifetime1Lifetime1, var11, 0);
                bj.field_q.c(var13, vh.field_b + 220, var3Lifetime1Lifetime1, var11, 0);
                var2 = "";
                bj.field_q.b(qi.a(true, 0, jp.field_a, (long)var12, (byte) 113), vh.field_b + 440, var3Lifetime1Lifetime1, var11, 0);
              }
              var3Lifetime1Lifetime1 += 20;
            }
            if (vl.field_b != null &&
              var9 == -1 &&
              qm.field_b == vl.field_b.field_bb) {
              var10Lifetime1 = 16776960;
              bj.field_q.c(ce.field_r, 220 + vh.field_b, var3Lifetime1Lifetime1, var10Lifetime1, 0);
              bj.field_q.b(Integer.toString(vl.field_b.field_G), vh.field_b + 440, var3Lifetime1Lifetime1, var10Lifetime1, 0);
            }
          } else {
            var2 = oj.field_g;
          }
        } else {
          var2 = r.field_I;
        }
        var3Lifetime2 = 6 + id.field_M + 89 + sg.field_jb.field_I + 100;
        sg.field_jb.a(var2, vh.field_b + 330, var3Lifetime2, 0, 0);
        if (param0 > -35) {
          this.field_u = (vn) null;
        }
        if (po.w(13296)) {
          stackIn_54_0 = rn.field_a;
        } else {
          stackIn_54_0 = k.field_r;
        }
        var2Lifetime1 = stackIn_54_0;
        bj.field_q.a(var2Lifetime1, bd.field_d, id.field_M + 412, 14540253, 3355443);
    }

    final int a(int param0, int param1) {
        if (po.w(13296)) {
          return id.field_M + this.field_k;
        }
        if (2 > param0) {
          return 90 * param0 + (-90 + nh.field_G + 45);
        }
        if (param1 != -1) {
          vj.d(63);
        }
        return id.field_M + this.field_k;
    }

    final static void c(int param0) {
        le var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ZombieDawn.field_J;
        try {
          var1 = kn.field_L.b((byte) 26);
          while (var1 instanceof tm) {
            aa.a(119, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          var1 = se.field_m.b((byte) 26);
          while (var1 instanceof tm) {
            aa.a(10, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          var1 = rm.field_e.b((byte) 26);
          if (param0 < 8) {
            vj.d(4);
          }
          while (var1 instanceof tm) {
            aa.a(48, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "vj.D(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (qm.field_b != this.field_b.field_d) {
          qm.field_b = this.field_b.field_d;
          bd.field_m = null;
        }
        int var2 = -113 % ((param0 + 78) / 35);
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        if (param1 != 6) {
          field_q = -82;
        }
        if (!po.w(13296)) {
          if (param0 < 2) {
            return 30 + vh.field_b;
          }
          param0 -= 2;
          var3 = vh.field_b - (-this.field_g - param0 * 176);
          return param0 != 3 ? var3 : -32 + var3;
        }
        return (param0 == 0 ? 50 : 470) + vh.field_b;
    }

    final static v a(dj param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        v stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param2, (byte) 8);
          var5 = param0.a(var4_int, param1, true);
          if (param3 != 4424743) {
            field_t = (int[]) null;
          }
          stackIn_3_0 = wg.a(var5, param0, -28490, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vj.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_t = new int[4];
        field_p = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_s = "Retry (<%0> Left)";
    }
}
