/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ca extends bd {
    private int field_cb;
    static he[] field_Y;
    private int field_U;
    private int field_ab;
    private int field_X;
    static nh[] field_W;
    private int field_Z;
    private int field_eb;
    static he[] field_V;
    static int field_db;
    static he[] field_bb;

    boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        this.g((byte) -125);
        return super.j(param0 ^ 0);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = -87 % ((-2 - param3) / 59);
        if (param0 <= 0) {
          this.b(param2, 1688990433, param1);
          return;
        }
        this.field_U = this.field_w;
        this.field_ab = param1;
        this.field_eb = param0;
        this.field_cb = this.field_k;
        this.field_X = param2;
        this.field_Z = 0;
    }

    ca(k param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_eb = 0;
        this.field_Z = 0;
    }

    void l(int param0) {
        if (param0 != -24626) {
          this.g((byte) 40);
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        gl var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
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
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 instanceof gl) {
          var14 = (gl) ((Object) param0);
          var2 = var14.field_d + " | ";
          var11 = var2;
          param0 = var14.field_a;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        if (param1 != -36) {
          field_bb = (he[]) null;
        }
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var16 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var16;
          var2Lifetime3Lifetime5 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(var17.lastIndexOf('\t') + 1);
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (var9 != -1) {
            if (-1 == var10) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(5 + var12, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static String b(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return dh.field_N.b((byte) -102);
    }

    public static void m(int param0) {
        field_V = null;
        field_bb = null;
        field_Y = null;
        if (param0 != -2110416344) {
          ca.b(false);
        }
        field_W = null;
    }

    void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        wj.f(param2 + 6, 35 + param0, this.field_w - 12, -40 + this.field_k, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (wj.field_e <= var8 &&
            wj.field_j > var8) {
            var9 = var5 + (var6 - var5) * var7 / var4;
            var10 = 0;
            var11 = this.field_w;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  wj.field_l[param2 + wj.field_k * var8 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    wj.field_l[var11 + (param2 + wj.field_k * var8)] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            wj.g(param2 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          wj.g(param2, var8Lifetime1, 6, var9Lifetime1);
          wj.g(this.field_w + param2 - 6, var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        if (param1 < 26) {
          return;
        }
        ck.field_l.d(-90 + (param2 + this.field_w), 10 + param0);
        pe.a(ob.field_f, 110, 5 + param2, this.field_w - 10, param0 + 35);
        pe.a(kc.field_i, 90, param2, this.field_w, -22 + (this.field_k + param0));
        var4Lifetime2 = -79 + this.field_k;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          wj.g(param2, var8Lifetime2, 6, var9Lifetime2);
          wj.g(-6 + this.field_w + param2, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_eb <= 0) {
        } else {
          var2 = this.field_X;
          var3 = this.field_ab;
          fieldTemp$0 = this.field_Z + 1;
          this.field_Z = this.field_Z + 1;
          if (this.field_eb <= fieldTemp$0) {
            this.field_eb = 0;
            this.l(param0 ^ -27562);
          } else {
            var4 = (this.field_eb * 2 - this.field_Z) * this.field_Z;
            var5 = this.field_eb * this.field_eb;
            var2 = var4 * (-this.field_U + this.field_X) / var5 + this.field_U;
            var3 = var4 * (this.field_ab - this.field_cb) / var5 + this.field_cb;
          }
          this.b(var2, 1688990433, var3);
        }
        if (param0 != 2968) {
          this.k(-35);
        }
        return super.k(2968);
    }

    void g(byte param0) {
        if (this.field_eb <= 0) {
          return;
        }
        if (param0 > -111) {
          return;
        }
        this.b(this.field_X, 1688990433, this.field_ab);
        this.field_eb = 0;
        this.l(-24626);
    }

    static {
    }
}
