/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rg extends tj {
    private int field_N;
    static int field_R;
    private int field_T;
    private int field_O;
    static String field_S;
    private int field_M;
    private int field_Q;
    static int field_P;
    private int field_L;

    void j(int param0) {
        if (param0 != -8144) {
          rg.i(49);
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
          vh stackIn_16_0;
          java.net.URL stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          StringBuilder stackIn_16_4;
          java.net.URL stackIn_17_1;
          java.net.URL stackIn_17_2;
          String stackIn_17_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          jh var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = wizardrun.field_H;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = mj.a(param0, (byte) -91);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            ve.a(118, var3);
            var7 = md.a(":", var3, param2 + 29396, "%3a");
            var8 = md.a("@", var7, 28834, "%40");
            var9 = md.a("&", var8, 28834, "%26");
            var10 = md.a("#", var9, param2 + 29396, "%23");
            if (param2 != -562) {
              field_R = -121;
            }
            if (null == ej.field_a) {
              return;
            }
            stackIn_16_0 = qf.field_m;
            stackIn_16_1 = null;
            stackIn_16_2 = null;
            stackIn_16_3 = ej.field_a.getCodeBase();
            stackIn_16_4 = new StringBuilder().append("clienterror.ws?c=").append(fi.field_A).append("&u=");
            if (null != gf.field_Y) {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = gf.field_Y;
            } else {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = "" + h.field_m;
            }
            var4 = ((vh) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, ((StringBuilder) (Object) stackIn_16_4).append(stackIn_17_5).append("&v1=").append(vh.field_p).append("&v2=").append(vh.field_b).append("&e=").append(var10).toString()), 123);
            while (var4.field_a == 0) {
              tg.a(1L, false);
            }
            if (var4.field_a == 1) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void g(byte param0) {
        if (this.field_O <= 0) {
          return;
        }
        this.a(6154, this.field_M, this.field_N);
        if (param0 == -3) {
          this.field_O = 0;
          this.j(-8144);
          return;
        }
    }

    rg(wi param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_O = 0;
        this.field_T = 0;
    }

    public static void i(int param0) {
        field_S = null;
        if (param0 != -6) {
          String var2 = (String) null;
          rg.a((Throwable) null, (String) null, -82);
        }
    }

    void b(int param0, int param1, int param2) {
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
        var16 = wizardrun.field_H;
        ed.e(param0 + 6, param2 + 35, this.field_r - 12, this.field_n - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (var8 >= ed.field_i &&
            ed.field_b > var8) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_r;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  ed.field_k[var8 * ed.field_h + param0 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    ed.field_k[var11 + ed.field_h * var8 + param0] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            ed.f(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          ed.f(param0, var8Lifetime1, 6, var9Lifetime1);
          ed.f(this.field_r + (param0 - 6), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        hg.field_d.e(-90 + (this.field_r + param0), param2 + 10);
        nf.a(5 + param0, param2 + 35, -10 + this.field_r, (byte) -106, ok.field_a);
        nf.a(param0, param2 - (-this.field_n + 22), this.field_r, (byte) -114, ia.field_i);
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var4Lifetime2 = this.field_n - 79;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        if (param1 != -1) {
          rg.i(61);
        }
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          ed.f(param0, var8Lifetime2, 6, var9Lifetime2);
          ed.f(-6 + (param0 + this.field_r), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean a(int param0) {
        this.g((byte) -3);
        if (param0 != 16) {
          rg.i(-88);
        }
        return super.a(param0 + 0);
    }

    boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_O > 0) {
          var2 = this.field_N;
          var3 = this.field_M;
          fieldTemp$0 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (this.field_O > fieldTemp$0) {
            var4 = this.field_T * (-this.field_T + 2 * this.field_O);
            var5 = this.field_O * this.field_O;
            var2 = var4 * (this.field_N - this.field_L) / var5 + this.field_L;
            var3 = this.field_Q + var4 * (this.field_M - this.field_Q) / var5;
          } else {
            this.field_O = 0;
            this.j(-8144);
          }
          this.a(6154, var3, var2);
        }
        if (param0 != 1) {
          String var6 = (String) null;
          rg.a((Throwable) null, (String) null, 94);
        }
        return super.g(1);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 >= param3) {
          this.a(6154, param1, param0);
          return;
        }
        this.field_T = 0;
        this.field_Q = this.field_n;
        this.field_M = param1;
        this.field_O = param3;
        this.field_L = this.field_r;
        this.field_N = param0;
    }

    static {
    }
}
