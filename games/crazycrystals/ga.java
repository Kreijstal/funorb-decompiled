/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ga extends pc {
    static String[] field_Q;
    private int field_D;
    private long field_C;
    private int field_N;
    private int field_O;
    private boolean field_G;
    static db field_L;
    private int field_I;
    private boolean field_M;
    private long field_K;
    static mk field_F;
    static am field_B;
    static int[] field_J;
    static dl field_E;
    static ko field_H;

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 0) {
          if (this.field_N != this.field_D) {
            var2 = this.field_D < this.field_N ? this.field_D : this.field_N;
            var3 = this.field_N <= this.field_D ? this.field_D : this.field_N;
            this.field_D = var2;
            this.field_N = var2;
            this.field_o = this.field_o.substring(0, var2) + this.field_o.substring(var3, this.field_o.length());
            this.h(127);
          }
          return;
        }
        field_L = (db) null;
        if (this.field_N != this.field_D) {
          var2Lifetime1 = this.field_D < this.field_N ? this.field_D : this.field_N;
          var3Lifetime1 = this.field_N <= this.field_D ? this.field_D : this.field_N;
          this.field_D = var2Lifetime1;
          this.field_N = var2Lifetime1;
          this.field_o = this.field_o.substring(0, var2Lifetime1) + this.field_o.substring(var3Lifetime1, this.field_o.length());
          this.h(127);
        }
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = CrazyCrystals.field_B;
        if (param0 == -26622) {
          if (this.field_N == 0) {
            return this.field_N;
          }
          for (var2 = -1 + this.field_N; var2 > 0; var2--) {
            if (this.field_o.charAt(-1 + var2) == 32) {
              return var2;
            }
          }
          return var2;
        }
        this.field_O = -45;
        if (this.field_N == 0) {
          return this.field_N;
        }
        for (var2Lifetime1 = -1 + this.field_N; var2Lifetime1 > 0; var2Lifetime1--) {
          if (this.field_o.charAt(-1 + var2Lifetime1) == 32) {
            return var2Lifetime1;
          }
        }
        return var2Lifetime1;
    }

    private final void n(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            if (param0 < 59) {
              field_F = (mk) null;
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.l(0);
            this.b(var2, -1);
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

    final void a(int param0, byte param1, int param2, int param3) {
        long var6;
        qm var8;
        fi var9;
        qm var8Lifetime1;
        qm var8Lifetime2;
        qm var8Lifetime3;
        qm var8Lifetime4;
        if (null == this.field_i) {
          if (param1 <= -12) {
            return;
          }
          var8 = (qm) null;
          this.a((qm) null, 83, 43, 63);
          return;
        }
        if (param3 != 0) {
          if (param1 <= -12) {
            return;
          }
          var8Lifetime1 = (qm) null;
          this.a((qm) null, 83, 43, 63);
          return;
        }
        this.field_i.a(param0, false, param2, (qm) (this), this.field_x);
        if (!(this.field_i instanceof fi)) {
          if (param1 <= -12) {
            return;
          }
          var8Lifetime2 = (qm) null;
          this.a((qm) null, 83, 43, 63);
          return;
        }
        var9 = (fi) ((Object) this.field_i);
        if (this.field_N != this.field_D) {
          var9.a((byte) 71, (qm) (this), param2, this.field_D, this.field_N, param0);
        }
        var6 = lo.a((byte) -83);
        if ((-this.field_K + var6) % 1000L >= 500L) {
          if (param1 <= -12) {
            return;
          }
          var8Lifetime3 = (qm) null;
          this.a((qm) null, 83, 43, 63);
          return;
        }
        var9.a(this.field_N, 27310, (qm) (this), param2, param0);
        if (param1 <= -12) {
          return;
        }
        var8Lifetime4 = (qm) null;
        this.a((qm) null, 83, 43, 63);
        return;
    }

    public static void o(int param0) {
        field_L = null;
        field_F = null;
        field_E = null;
        field_H = null;
        field_Q = null;
        field_J = null;
        if (param0 != 0) {
          return;
        }
        field_B = null;
    }

    private final int j(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = this.field_o.length();
        if (var2 == this.field_N) {
          return this.field_N;
        }
        var3 = 1 + this.field_N;
        while (true) {
          if (var2 <= var3) {
            if (param0 != 612) {
              return 60;
            }
            return var3;
          }
          if (this.field_o.charAt(var3 - 1) != 32) {
            var3++;
            continue;
          }
          break;
        }
        if (param0 != 612) {
          return 60;
        }
        return var3;
    }

    private final void b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_I != -1) {
            var3_int = this.field_I - this.field_o.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (param1 != -1) {
            field_L = (db) null;
          }
          if (this.field_N != this.field_o.length()) {
            this.field_o = this.field_o.substring(0, this.field_N) + param0 + this.field_o.substring(this.field_N, this.field_o.length());
          } else {
            this.field_o = this.field_o + param0;
          }
          this.field_N = this.field_N + param0.length();
          this.field_D = this.field_N;
          this.h(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ga.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_i instanceof fi)) {
            return false;
          }
          var8_int = ((fi) ((Object) this.field_i)).a(qh.field_i, 58, bm.field_h, param4, param0, (qm) (this));
          if (-1 == var8_int) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.a(stackIn_6_1, true);
          var8_long = lo.a((byte) 77);
          stackIn_9_1 = !(250L <= -this.field_C + var8_long);
          this.field_M = stackIn_9_1;
          if (this.field_M) {
            this.field_D = this.i(-26622);
            this.field_N = this.j(612);
            if (this.field_N > 0 &&
              this.field_o.charAt(this.field_N - 1) == 32) {
              this.field_N = this.field_N - 1;
            }
            this.field_O = this.field_N;
          }
          this.field_C = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ga.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_K = lo.a((byte) -116);
          if (60 != param3 &&
            param3 != 62) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.field_D != this.field_N) {
                this.l(param1 - 19279);
              }
              if (-1 != this.field_I &&
                this.field_o.length() >= this.field_I) {
                return true;
              }
              if (this.field_N < this.field_o.length()) {
                this.field_o = this.field_o.substring(0, this.field_N) + param3 + this.field_o.substring(this.field_N, this.field_o.length());
                this.field_N = this.field_N + 1;
                this.field_D = this.field_N;
              } else {
                this.field_o = this.field_o + param3;
                dupTemp$0 = this.field_o.length();
                this.field_N = dupTemp$0;
                this.field_D = dupTemp$0;
              }
              this.h(127);
              return true;
            }
            if (85 != param0) {
              if (param0 != 101) {
                if (param0 == 13) {
                  this.k(param1 - 19357);
                  return true;
                }
                if (param0 == 96) {
                  if (this.field_N > 0) {
                    if (!cp.field_k[82]) {
                      stackIn_61_1 = -1 + this.field_N;
                    } else {
                      stackIn_61_1 = this.i(-26622);
                    }
                    this.a(stackIn_61_1, true);
                    return true;
                  }
                } else {
                  if (param0 != 97) {
                    if (param0 == 102) {
                      this.a(0, true);
                      return true;
                    }
                    if (103 == param0) {
                      this.a(this.field_o.length(), true);
                      return true;
                    }
                    if (param0 == 84) {
                      this.f((byte) 23);
                      return true;
                    }
                    if (cp.field_k[82] &&
                      param0 == 65) {
                      this.g((byte) -75);
                      return true;
                    }
                    if (cp.field_k[82] &&
                      param0 == 66) {
                      this.e((byte) 68);
                      return true;
                    }
                    if (cp.field_k[82] &&
                      67 == param0) {
                      this.n(param1 ^ 19254);
                      return true;
                    }
                  } else {
                    if (this.field_N < this.field_o.length()) {
                      if (!cp.field_k[82]) {
                        stackIn_32_1 = this.field_N + 1;
                      } else {
                        stackIn_32_1 = this.j(612);
                      }
                      this.a(stackIn_32_1, true);
                      return true;
                    }
                  }
                }
              } else {
                if (this.field_N != this.field_D) {
                  this.l(0);
                  return true;
                }
                if (this.field_N < this.field_o.length()) {
                  this.field_D = this.field_N + 1;
                  this.l(0);
                  return true;
                }
              }
            } else {
              if (this.field_D != this.field_N) {
                this.l(param1 - 19279);
                return true;
              }
              if (this.field_N > 0) {
                this.field_D = this.field_N - 1;
                this.l(param1 ^ 19279);
                return true;
              }
            }
            if (param1 != 19279) {
              this.field_D = 58;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (this.field_l instanceof ho) {
          ((ho) (this.field_l)).a(97, this);
        }
        int var2 = -60 % ((param0 - 77) / 39);
    }

    void h(int param0) {
        if (param0 > 125) {
          if (this.field_l instanceof ho) {
            ((ho) (this.field_l)).a(this, -29513);
          }
          return;
        }
        field_B = (am) null;
        if (this.field_l instanceof ho) {
          ((ho) (this.field_l)).a(this, -29513);
        }
    }

    private final String b(boolean param0) {
        int var2 = this.field_D >= this.field_N ? this.field_N : this.field_D;
        int var3 = this.field_N > this.field_D ? this.field_N : this.field_D;
        if (param0) {
          return this.field_o.substring(var2, var3);
        }
        this.field_K = 92L;
        return this.field_o.substring(var2, var3);
    }

    private final void g(byte param0) {
        this.e((byte) 95);
        this.l(0);
        if (param0 >= -54) {
          this.field_G = true;
        }
    }

    private final void e(byte param0) {
        try {
          String var2 = null;
          if (param0 >= 30) {
            var2 = this.b(true);
            if (!(var2.length() <= 0)) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.b(true))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        fi var7 = null;
        int var6 = 0;
        try {
          super.a(param0, -121, param2, param3);
          this.m(0);
          if (this.field_s == 1) {
            if (this.field_i instanceof fi) {
              var7 = (fi) ((Object) this.field_i);
              var6 = var7.a(qh.field_i, 108, bm.field_h, param2, param3, (qm) (this));
              if (var6 != -1) {
                if (this.field_M && this.field_O > var6 &&
                  var6 > this.field_D) {
                  var6 = this.field_O;
                }
                this.field_N = var6;
              }
            }
            this.field_K = lo.a((byte) 98);
          }
          int var5_int = 26 / ((param1 + 50) / 59);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ga.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int p(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = CrazyCrystals.field_B;
        try {
          qe.field_g.a(ea.field_r, false, true, cn.field_a);
          qe.field_g.b(false);
          while (ge.b(-31)) {
            qe.field_g.a(pj.field_q, false, c.field_p);
          }
          if (pl.field_g != -1) {
            var1_int = pl.field_g;
            rc.a(-25537, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (dj.field_t) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (l.field_b == sg.field_b) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!gk.field_e.b(param0 - 75)) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (l.field_b == lc.field_c) {
            stackIn_21_0 = 2;
            return stackIn_21_0;
          }
          if (param0 != -1) {
            field_J = (int[]) null;
          }
          stackIn_25_0 = -1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "ga.F(" + param0 + ')');
        }
    }

    final void k(int param0) {
        this.field_D = 0;
        this.field_o = "";
        this.field_N = 0;
        if (param0 <= -70) {
          this.h(126);
          return;
        }
        ga.p(-5);
        this.h(126);
    }

    private final void m(int param0) {
        tb var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fi var9;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = CrazyCrystals.field_B;
        if (!this.field_G) {
          this.field_h = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.field_i instanceof fi)) {
          return;
        }
        var9 = (fi) ((Object) this.field_i);
        var3 = var9.a((qm) (this), 1);
        if (param0 == 0) {
          var4 = var3.a(108);
          var5 = var9.a(106, (qm) (this));
          var6 = var9.a(40) >> 1;
          if (var4 < var5 - var6) {
            this.field_k = 0;
            this.field_h = 0;
            return;
          }
          var7 = this.field_h + var3.a(this.field_N, 1);
          if (var5 - var6 < var7) {
            this.field_h = this.field_h - var7 - var6 + var5;
            if (this.field_h > 0) {
              this.field_h = 0;
              return;
            }
            if (this.field_h >= var6 - var5) {
              return;
            }
            this.field_h = -var5 + var6;
            return;
          }
          if (var7 < var6) {
            this.field_h = -var7 + var6 + this.field_h;
          }
          if (this.field_h > 0) {
            this.field_h = 0;
          } else {
            if (this.field_h < var6 - var5) {
              this.field_h = -var5 + var6;
            }
          }
          return;
        }
        this.field_K = -79L;
        var4Lifetime1 = var3.a(108);
        var5Lifetime1 = var9.a(106, (qm) (this));
        var6Lifetime1 = var9.a(40) >> 1;
        if (var4Lifetime1 < var5Lifetime1 - var6Lifetime1) {
          this.field_k = 0;
          this.field_h = 0;
          return;
        }
        var7Lifetime1 = this.field_h + var3.a(this.field_N, 1);
        if (var5Lifetime1 - var6Lifetime1 < var7Lifetime1) {
          this.field_h = this.field_h - var7Lifetime1 - var6Lifetime1 + var5Lifetime1;
        } else {
          if (var7Lifetime1 < var6Lifetime1) {
            this.field_h = -var7Lifetime1 + var6Lifetime1 + this.field_h;
          }
        }
        if (this.field_h > 0) {
          this.field_h = 0;
          return;
        }
        if (this.field_h >= var6Lifetime1 - var5Lifetime1) {
          return;
        }
        this.field_h = -var5Lifetime1 + var6Lifetime1;
        return;
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -54) {
            return;
          }
          if (param2 == null) {
            param2 = "";
          }
          this.field_o = param2;
          var4_int = param2.length();
          if (this.field_I != -1 &&
            this.field_I < var4_int) {
            this.field_o = this.field_o.substring(0, this.field_I);
          }
          dupTemp$1 = this.field_o.length();
          this.field_D = dupTemp$1;
          this.field_N = dupTemp$1;
          if (param0) {
            return;
          }
          this.h(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ga.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        this.field_N = param0;
        if (!cp.field_k[81]) {
          this.field_D = this.field_N;
        }
        if (param1) {
          return;
        }
        this.f((byte) -31);
    }

    ga(String param0, bi param1, int param2) {
        super(param0, param1);
        this.field_C = 0L;
        this.field_O = -1;
        this.field_M = false;
        try {
          this.field_i = pi.field_j.field_q;
          this.field_I = param2;
          this.a(true, -115, param0);
          this.field_G = true;
          this.field_K = lo.a((byte) -91);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Q = new String[]{"All scores", "My scores", "Best each"};
        field_F = new mk();
        field_J = new int[1024];
    }
}
