/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vg extends pj {
    static int field_N;
    private int field_O;
    static int[] field_I;
    private boolean field_U;
    static int field_M;
    private int field_R;
    private boolean field_S;
    private int field_Q;
    private long field_T;
    private int field_K;
    static i field_J;
    static int field_P;
    private long field_V;

    final static void b(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = SolKnight.field_L ? 1 : 0;
        if (ad.field_h < 0) {
          return;
        }
        var3 = -135 + param1;
        var4 = param0 - 35;
        if (param2 < 15) {
          vg.a((byte) -22);
        }
        var5 = 256;
        if (75 > ad.field_h) {
          var5 = (ad.field_h << 8) / 75;
        }
        if (ad.field_h > 200) {
          var5 = (250 - ad.field_h << 8) / 50;
        }
        cl.a(-118, tg.field_J);
        hk.a();
        mi.a();
        ee.g(95);
        if (256 > var5) {
          mi.a(0, 0, mi.field_a, mi.field_d, 0, -var5 + 256);
        }
        mf.e(4096);
        if (ad.field_h < 150) {
          tg.field_J.f(var3, var4);
        } else {
          gg.field_e.c(15 + var3, var4 + 10, var5);
        }
        var6 = ad.field_h - 125;
        if (0 < var6 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            tg.field_I.a(var3, var4, var7);
          } else {
            if (30 <= var6) {
              var7 = (-(256 * var6) + 12800) / 20;
              tg.field_I.a(var3, var4, var7);
            } else {
              tg.field_I.a(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = -140 + ad.field_h;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          ql.field_p.c(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        eg var8;
        long var6Lifetime1;
        if (null == this.field_w) {
          if (param3 == 0) {
            return;
          }
          this.field_U = false;
          return;
        }
        if (0 != param1) {
          if (param3 == 0) {
            return;
          }
          this.field_U = false;
          return;
        }
        this.field_w.a((byte) 126, param0, this.field_B, param2, (rc) (this));
        if (!(this.field_w instanceof eg)) {
          if (param3 == 0) {
            return;
          }
          this.field_U = false;
          return;
        }
        var8 = (eg) ((Object) this.field_w);
        if (this.field_O == this.field_K) {
          var6 = je.a(param3 + 1);
          if (500L > (-this.field_V + var6) % 1000L) {
            var8.a(this.field_K, param0, 1, (rc) (this), param2);
          }
          if (param3 == 0) {
            return;
          }
          this.field_U = false;
          return;
        }
        var8.a(this.field_O, (rc) (this), this.field_K, 114, param0, param2);
        var6Lifetime1 = je.a(param3 + 1);
        if (500L > (-this.field_V + var6Lifetime1) % 1000L) {
          var8.a(this.field_K, param0, 1, (rc) (this), param2);
        }
        if (param3 == 0) {
          return;
        }
        this.field_U = false;
        return;
    }

    void j(int param0) {
        int var2 = -18 % ((param0 + 67) / 44);
        if (!(this.field_n instanceof pi)) {
          return;
        }
        ((pi) (this.field_n)).a(this, (byte) -79);
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          var4_int = 60 / ((param0 + 30) / 60);
          this.field_i = param2;
          var5 = param2.length();
          if (this.field_Q != -1 &&
            var5 > this.field_Q) {
            this.field_i = this.field_i.substring(0, this.field_Q);
          }
          dupTemp$1 = this.field_i.length();
          this.field_O = dupTemp$1;
          this.field_K = dupTemp$1;
          if (!param1) {
            this.j(30);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("vg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final String q(int param0) {
        int var2 = this.field_K > this.field_O ? this.field_O : this.field_K;
        int var3 = this.field_K <= this.field_O ? this.field_O : this.field_K;
        if (param0 == -33) {
          return this.field_i.substring(var2, var3);
        }
        return (String) null;
    }

    final void l(int param0) {
        this.field_K = 0;
        this.field_O = 0;
        this.field_i = "";
        if (param0 < -79) {
          this.j(-124);
          return;
        }
        this.j(-49);
        this.j(-124);
    }

    private final int n(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 110) {
          if (this.field_K == 0) {
            return this.field_K;
          }
          for (var2 = this.field_K - 1; var2 > 0; var2--) {
            if (this.field_i.charAt(-1 + var2) == 32) {
              return var2;
            }
          }
          return var2;
        }
        this.j(14);
        if (this.field_K == 0) {
          return this.field_K;
        }
        for (var2Lifetime1 = this.field_K - 1; var2Lifetime1 > 0; var2Lifetime1--) {
          if (this.field_i.charAt(-1 + var2Lifetime1) == 32) {
            return var2Lifetime1;
          }
        }
        return var2Lifetime1;
    }

    private final void c(boolean param0) {
        if (!param0) {
          field_N = -95;
          if (this.field_n instanceof pi) {
            ((pi) (this.field_n)).a(this, true);
            return;
          }
          return;
        }
        if (!(this.field_n instanceof pi)) {
          return;
        }
        ((pi) (this.field_n)).a(this, true);
    }

    private final void o(int param0) {
        String var2 = this.q(-33);
        if (!(param0 <= ~var2.length())) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.q(-33))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        eg var5 = null;
        int var6 = 0;
        super.a(param0, param1 + 0, param2, param3);
        if (param1 != 18874) {
          return;
        }
        try {
          this.d((byte) -119);
          if (1 == this.field_u) {
            if (this.field_w instanceof eg) {
              var5 = (eg) ((Object) this.field_w);
              var6 = var5.a((rc) (this), 0, gb.field_j, ad.field_m, param2, param0);
              if (-1 != var6) {
                if (this.field_U &&
                  var6 < this.field_R &&
                  var6 > this.field_O) {
                  var6 = this.field_R;
                }
                this.field_K = var6;
              }
            }
            this.field_V = je.a(param1 ^ 18875);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vg.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        if (!sg.b((byte) -107)) {
          return;
        }
        if (param0 <= 1) {
          return;
        }
        hc.a(false, true, 4);
    }

    private final void d(byte param0) {
        jf var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        eg var10;
        var9 = SolKnight.field_L ? 1 : 0;
        if (!this.field_S) {
          this.field_q = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.field_w instanceof eg)) {
          return;
        }
        var10 = (eg) ((Object) this.field_w);
        var3 = var10.a(-21480, (rc) (this));
        var6 = -33 % ((-72 - param0) / 42);
        var4 = var3.b(62);
        var5 = var10.b(265, (rc) (this));
        var7 = var10.a(3) >> 1;
        if (-var7 + var5 > var4) {
          this.field_q = 0;
          this.field_k = 0;
          return;
        }
        var8 = this.field_k + var3.a(0, this.field_K);
        if (-var7 + var5 < var8) {
          this.field_k = this.field_k - (var8 + var7 - var5);
        } else {
          if (var7 > var8) {
            this.field_k = var7 - var8 + this.field_k;
          }
        }
        if (this.field_k > 0) {
          this.field_k = 0;
          return;
        }
        if (this.field_k >= -var5 + var7) {
          return;
        }
        this.field_k = var7 - var5;
        return;
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int dupTemp$0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_V = je.a(1);
          if (60 == param0) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_O != this.field_K) {
              this.p(11002);
            }
            if (-1 == this.field_Q ||
              !(this.field_i.length() >= this.field_Q)) {
              if (this.field_K >= this.field_i.length()) {
                this.field_i = this.field_i + param0;
                dupTemp$0 = this.field_i.length();
                this.field_K = dupTemp$0;
                this.field_O = dupTemp$0;
              } else {
                this.field_i = this.field_i.substring(0, this.field_K) + param0 + this.field_i.substring(this.field_K, this.field_i.length());
                this.field_K = this.field_K + 1;
                this.field_O = this.field_K;
              }
              this.j(111);
            }
            return true;
          }
          if (85 != param2) {
            if (param2 != 101) {
              if (param2 == 13) {
                this.l(-115);
                return true;
              }
              if (param2 == 96) {
                if (0 < this.field_K) {
                  if (!fh.field_d[82]) {
                    stackIn_61_1 = this.field_K - 1;
                  } else {
                    stackIn_61_1 = this.n(117);
                  }
                  this.b(stackIn_61_1, -6331);
                  return true;
                }
              } else {
                if (param2 != 97) {
                  if (param2 == 102) {
                    this.b(0, -6331);
                    return true;
                  }
                  if (103 == param2) {
                    this.b(this.field_i.length(), -6331);
                    return true;
                  }
                  if (param2 == 84) {
                    this.c(true);
                    return true;
                  }
                  if (fh.field_d[82] &&
                    param2 == 65) {
                    this.m(108);
                    return true;
                  }
                  if (fh.field_d[82] &&
                    param2 == 66) {
                    this.o(-1);
                    return true;
                  }
                  if (fh.field_d[82] &&
                    param2 == 67) {
                    this.e((byte) -78);
                    return true;
                  }
                } else {
                  if (this.field_K < this.field_i.length()) {
                    if (!fh.field_d[82]) {
                      stackIn_33_1 = 1 + this.field_K;
                    } else {
                      stackIn_33_1 = this.k(11365);
                    }
                    this.b(stackIn_33_1, -6331);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_K != this.field_O) {
                this.p(11002);
                return true;
              }
              if (this.field_K < this.field_i.length()) {
                this.field_O = this.field_K + 1;
                this.p(11002);
                return true;
              }
            }
          } else {
            if (this.field_O != this.field_K) {
              this.p(11002);
              return true;
            }
            if (0 < this.field_K) {
              this.field_O = this.field_K - 1;
              this.p(11002);
              return true;
            }
          }
          var5_int = -50 % ((31 - param1) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("vg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_I = null;
        if (param0 <= 96) {
          return;
        }
        field_J = null;
    }

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_O != this.field_K) {
          var2 = this.field_K > this.field_O ? this.field_O : this.field_K;
          var3 = this.field_O >= this.field_K ? this.field_O : this.field_K;
          this.field_O = var2;
          this.field_K = var2;
          this.field_i = this.field_i.substring(0, var2) + this.field_i.substring(var3, this.field_i.length());
          this.j(-125);
        }
        if (param0 == 11002) {
          return;
        }
        this.b(-118, 85);
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          if (this.field_Q != -1) {
            var3_int = this.field_Q - this.field_i.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_K != this.field_i.length()) {
            this.field_i = this.field_i.substring(0, this.field_K) + param1 + this.field_i.substring(this.field_K, this.field_i.length());
          } else {
            this.field_i = this.field_i + param1;
          }
          var3_intLifetime1 = 81 / ((param0 + 40) / 63);
          this.field_K = this.field_K + param1.length();
          this.field_O = this.field_K;
          this.j(-114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, ob param1, int param2) {
        jd var5 = id.field_c;
        jd var3 = var5;
        var5.e(param0, -2147483648);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.c(-104, 1);
        if (null != param1.field_k) {
          var5.c(-126, param1.field_k.length);
          var5.a(8, param1.field_k.length, param1.field_k, 0);
        } else {
          var5.c(126, 0);
        }
        var5.b(true, var4);
        var5.field_m = var5.field_m - 4;
        if (param2 < 113) {
          return;
        }
        try {
          param1.field_i = var5.e(true);
          var5.b(1, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vg.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    vg(String param0, dg param1, int param2) {
        super(param0, param1);
        this.field_R = -1;
        this.field_U = false;
        this.field_T = 0L;
        try {
          this.field_Q = param2;
          this.field_w = ph.field_f.field_h;
          this.a(-90, true, param0);
          this.field_S = true;
          this.field_V = je.a(1);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_w instanceof eg)) {
            return false;
          }
          var8_int = ((eg) ((Object) this.field_w)).a((rc) (this), 0, gb.field_j, ad.field_m, param5, param1);
          if (-1 != var8_int) {
            stackIn_7_1 = var8_int;
          } else {
            stackIn_7_1 = 0;
          }
          this.b(stackIn_7_1, -6331);
          var8_long = je.a(1);
          stackIn_10_1 = !(-this.field_T + var8_long >= 250L);
          this.field_U = stackIn_10_1;
          if (this.field_U) {
            this.field_O = this.n(126);
            this.field_K = this.k(11365);
            if (this.field_K > 0 &&
              this.field_i.charAt(this.field_K - 1) == 32) {
              this.field_K = this.field_K - 1;
            }
            this.field_R = this.field_K;
          }
          this.field_T = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("vg.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void m(int param0) {
        this.o(-1);
        int var2 = 123 % ((50 - param0) / 42);
        this.p(11002);
    }

    private final void b(int param0, int param1) {
        this.field_K = param0;
        if (!fh.field_d[81]) {
          this.field_O = this.field_K;
          if (param1 != -6331) {
            this.c(false);
            return;
          }
          return;
        }
        if (param1 == -6331) {
          return;
        }
        this.c(false);
    }

    private final void e(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 != -78) {
              return;
            }
            this.p(11002);
            this.a(-107, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == 11365) {
          var2 = this.field_i.length();
          if (this.field_K == var2) {
            return this.field_K;
          }
          for (var3 = this.field_K + 1; var2 > var3; var3++) {
            if (this.field_i.charAt(-1 + var3) == 32) {
              return var3;
            }
          }
          return var3;
        }
        field_I = (int[]) null;
        var2Lifetime1 = this.field_i.length();
        if (this.field_K == var2Lifetime1) {
          return this.field_K;
        }
        for (var3Lifetime1 = this.field_K + 1; var2Lifetime1 > var3Lifetime1; var3Lifetime1++) {
          if (this.field_i.charAt(-1 + var3Lifetime1) == 32) {
            return var3Lifetime1;
          }
        }
        return var3Lifetime1;
    }

    static {
        field_M = 200;
    }
}
