/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rj extends t {
    private int field_E;
    private int field_J;
    private long field_K;
    private int field_D;
    static String field_B;
    static le field_H;
    private boolean field_G;
    private int field_I;
    private long field_F;
    private boolean field_C;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
          if (this.field_E != this.field_D) {
            var2 = this.field_E <= this.field_D ? this.field_E : this.field_D;
            var3 = this.field_E <= this.field_D ? this.field_D : this.field_E;
            this.field_E = var2;
            this.field_D = var2;
            this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
            this.m(0);
          }
          return;
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_K = pf.a(0);
          var5_int = 84 / ((param3 - 37) / 50);
          if (param1 != 60 &&
            param1 != 62) {
            if (param1 >= 32 &&
              param1 <= 126) {
              if (this.field_D != this.field_E) {
                this.a(false);
              }
              if (this.field_I != -1 &&
                this.field_s.length() >= this.field_I) {
                return true;
              }
              if (this.field_E >= this.field_s.length()) {
                this.field_s = this.field_s + param1;
                dupTemp$0 = this.field_s.length();
                this.field_E = dupTemp$0;
                this.field_D = dupTemp$0;
              } else {
                this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
                this.field_E = this.field_E + 1;
                this.field_D = this.field_E;
              }
              this.m(0);
              return true;
            }
            if (param2 != 85) {
              if (param2 != 101) {
                if (param2 == 13) {
                  this.f((byte) -108);
                  return true;
                }
                if (param2 == 96) {
                  if (this.field_E > 0) {
                    if (!dl.field_c[82]) {
                      stackIn_68_1 = -1 + this.field_E;
                    } else {
                      stackIn_68_1 = this.l(-1);
                    }
                    this.a(stackIn_68_1, -102);
                    return true;
                  }
                } else {
                  if (param2 != 97) {
                    if (param2 == 102) {
                      this.a(0, -126);
                      return true;
                    }
                    if (103 == param2) {
                      this.a(this.field_s.length(), -105);
                      return true;
                    }
                    if (84 == param2) {
                      this.d((byte) -118);
                      return true;
                    }
                    if (dl.field_c[82] &&
                      param2 == 65) {
                      this.c((byte) -121);
                      return true;
                    }
                    if (dl.field_c[82] &&
                      param2 == 66) {
                      this.b(true);
                      return true;
                    }
                    if (dl.field_c[82] &&
                      param2 == 67) {
                      this.e((byte) 63);
                      return true;
                    }
                  } else {
                    if (this.field_E < this.field_s.length()) {
                      if (dl.field_c[82]) {
                        stackIn_39_1 = this.n(-1033);
                      } else {
                        stackIn_39_1 = 1 + this.field_E;
                      }
                      this.a(stackIn_39_1, -109);
                      return true;
                    }
                  }
                }
              } else {
                if (this.field_D != this.field_E) {
                  this.a(false);
                  return true;
                }
                if (this.field_E < this.field_s.length()) {
                  this.field_D = 1 + this.field_E;
                  this.a(false);
                  return true;
                }
              }
            } else {
              if (this.field_D != this.field_E) {
                this.a(false);
                return true;
              }
              if (this.field_E > 0) {
                this.field_D = this.field_E - 1;
                this.a(false);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("rj.V(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        this.field_E = param0;
        if (!dl.field_c[81]) {
          this.field_D = this.field_E;
        }
        if (param1 < -89) {
          return;
        }
        this.e((byte) 122);
    }

    rj(String param0, of param1, int param2) {
        super(param0, param1);
        this.field_J = -1;
        this.field_C = false;
        this.field_F = 0L;
        try {
          this.field_I = param2;
          this.field_h = hi.field_b.field_o;
          this.a(true, -5905, param0);
          this.field_G = true;
          this.field_K = pf.a(0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        try {
          String var2 = this.p(18587);
          if (param0) {
            if (0 < var2.length()) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(18587))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void o(int param0) {
        field_B = null;
        if (param0 != 0) {
          field_B = (String) null;
          field_H = null;
          return;
        }
        field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var8 = null;
        long var6 = 0L;
        String var8Lifetime1;
        String var8Lifetime2;
        String var8Lifetime3;
        String var8Lifetime4;
        String var8Lifetime5;
        String var8Lifetime3Lifetime1;
        long var6Lifetime1;
        if (null == this.field_h) {
          if (param0 == 30) {
            return;
          }
          var8 = (String) null;
          this.a(false, 120, (String) null);
          return;
        }
        if (0 != param1) {
          if (param0 != 30) {
            var8Lifetime1 = (String) null;
            this.a(false, 120, (String) null);
            return;
          }
          return;
        }
        this.field_h.a(this.field_w, (we) (this), param2, param3, 110);
        if (!(this.field_h instanceof ui)) {
          if (param0 == 30) {
            return;
          }
          var8Lifetime2 = (String) null;
          this.a(false, 120, (String) null);
          return;
        }
        ui var9 = (ui) ((Object) this.field_h);
        if (this.field_D != this.field_E) {
          var9.a(119, (we) (this), this.field_D, param3, this.field_E, param2);
          var6 = pf.a(param0 - 30);
          if ((-this.field_K + var6) % 1000L < 500L) {
            var9.a((we) (this), param3, param2, this.field_E, 0);
            if (param0 == 30) {
              return;
            }
            var8Lifetime3 = (String) null;
            this.a(false, 120, (String) null);
            return;
          }
          if (param0 == 30) {
            return;
          }
          var8Lifetime3Lifetime1 = (String) null;
          this.a(false, 120, (String) null);
          return;
        }
        var6Lifetime1 = pf.a(param0 - 30);
        if ((-this.field_K + var6Lifetime1) % 1000L < 500L) {
          var9.a((we) (this), param3, param2, this.field_E, 0);
          if (param0 == 30) {
            return;
          }
          var8Lifetime4 = (String) null;
          this.a(false, 120, (String) null);
          return;
        }
        if (param0 == 30) {
          return;
        }
        var8Lifetime5 = (String) null;
        this.a(false, 120, (String) null);
    }

    void a(we param0, int param1, int param2, byte param3) {
        ui var7 = null;
        int var6 = 0;
        try {
          if (param3 >= -13) {
            rj.o(59);
          }
          super.a(param0, param1, param2, (byte) -98);
          this.k(95);
          if (this.field_t == 1) {
            if (this.field_h instanceof ui) {
              var7 = (ui) ((Object) this.field_h);
              var6 = var7.a(param2, p.field_a, (we) (this), ei.field_a, true, param1);
              if (-1 != var6) {
                if (this.field_C &&
                  var6 < this.field_J &&
                  var6 > this.field_D) {
                  var6 = this.field_J;
                }
                this.field_E = var6;
              }
            }
            this.field_K = pf.a(0);
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "rj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!bi.a(param1, 20558, param0)) {
            return false;
          }
          for (var3_int = 0; param1.length() > var3_int; var3_int++) {
            if (!vb.a((byte) 115, param1.charAt(var3_int))) {
              return false;
            }
          }
          if (param2 != 20) {
            rj.o(-49);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("rj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1033) {
          var2 = this.field_s.length();
          if (var2 == this.field_E) {
            return this.field_E;
          }
          for (var3 = this.field_E + 1; var2 > var3; var3++) {
            if (this.field_s.charAt(var3 - 1) == 32) {
              return var3;
            }
          }
          return var3;
        }
        field_B = (String) null;
        var2Lifetime1 = this.field_s.length();
        if (var2Lifetime1 == this.field_E) {
          return this.field_E;
        }
        for (var3Lifetime1 = this.field_E + 1; var2Lifetime1 > var3Lifetime1; var3Lifetime1++) {
          if (this.field_s.charAt(var3Lifetime1 - 1) == 32) {
            return var3Lifetime1;
          }
        }
        return var3Lifetime1;
    }

    private final String p(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 18587) {
          if (this.field_D < this.field_E) {
            stackIn_4_0 = this.field_D;
          } else {
            stackIn_4_0 = this.field_E;
          }
          var2 = stackIn_4_0;
          if (this.field_D < this.field_E) {
            stackIn_7_0 = this.field_E;
          } else {
            stackIn_7_0 = this.field_D;
          }
          var3 = stackIn_7_0;
          return this.field_s.substring(var2, var3);
        }
        this.field_F = -108L;
        if (this.field_D < this.field_E) {
          stackIn_11_0 = this.field_D;
        } else {
          stackIn_11_0 = this.field_E;
        }
        var2Lifetime1 = stackIn_11_0;
        if (this.field_D < this.field_E) {
          stackIn_14_0 = this.field_E;
        } else {
          stackIn_14_0 = this.field_D;
        }
        var3Lifetime1 = stackIn_14_0;
        return this.field_s.substring(var2Lifetime1, var3Lifetime1);
    }

    final void f(byte param0) {
        this.field_s = "";
        this.field_E = 0;
        this.field_D = 0;
        this.m(0);
        if (param0 >= -3) {
          this.field_F = 110L;
        }
    }

    final void a(boolean param0, int param1, String param2) {
        String discarded$2 = null;
        int dupTemp$3 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          if (param1 != -5905) {
            discarded$2 = this.p(100);
          }
          this.field_s = param2;
          var4_int = param2.length();
          if (this.field_I != -1 &&
            var4_int > this.field_I) {
            this.field_s = this.field_s.substring(0, this.field_I);
          }
          dupTemp$3 = this.field_s.length();
          this.field_D = dupTemp$3;
          this.field_E = dupTemp$3;
          if (param0) {
            return;
          }
          this.m(param1 ^ -5905);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rj.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 63) {
            this.a(true);
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.a(false);
            this.a(false, var2);
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

    private final void a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_I != -1) {
            var3_int = this.field_I - this.field_s.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_E != this.field_s.length()) {
            this.field_s = this.field_s.substring(0, this.field_E) + param1 + this.field_s.substring(this.field_E, this.field_s.length());
          } else {
            this.field_s = this.field_s + param1;
          }
          this.field_E = this.field_E + param1.length();
          this.field_D = this.field_E;
          this.m(0);
          if (!param0) {
            return;
          }
          this.f((byte) -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("rj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_E == 0) {
          return this.field_E;
        }
        for (var2 = param0 + this.field_E; var2 > 0; var2--) {
          if (this.field_s.charAt(-1 + var2) == 32) {
            return var2;
          }
        }
        return var2;
    }

    private final void c(byte param0) {
        this.b(true);
        int var2 = -6 % ((param0 + 65) / 35);
        this.a(false);
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3 ^ 0, param4, param5, param6) &&
            this.field_h instanceof ui) {
            var8_int = ((ui) ((Object) this.field_h)).a(param6, p.field_a, (we) (this), ei.field_a, true, param0);
            if (var8_int == -1) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = var8_int;
            }
            this.a(stackIn_7_1, -120);
            var8_long = pf.a(0);
            stackIn_10_1 = !(250L <= var8_long - this.field_F);
            this.field_C = stackIn_10_1;
            if (this.field_C) {
              this.field_D = this.l(-1);
              this.field_E = this.n(param3 ^ 592);
              if (this.field_E > 0 &&
                this.field_s.charAt(this.field_E - 1) == 32) {
                this.field_E = this.field_E - 1;
              }
              this.field_J = this.field_E;
            }
            this.field_F = var8_long;
            return true;
          }
          if (param3 == -1625) {
            return false;
          }
          this.field_D = 46;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void d(byte param0) {
        if (this.field_o instanceof vc) {
          ((vc) (this.field_o)).a(-88, this);
          if (param0 > -94) {
            this.field_J = -3;
            return;
          }
          return;
        }
        if (param0 <= -94) {
          return;
        }
        this.field_J = -3;
    }

    private final void k(int param0) {
        aa var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ui var10;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!this.field_G) {
          this.field_i = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.field_h instanceof ui)) {
          return;
        }
        var10 = (ui) ((Object) this.field_h);
        var3 = var10.a(-1, (we) (this));
        var4 = var3.a(true);
        var5 = var10.b((we) (this), true);
        var7 = -85 / ((27 - param0) / 63);
        var6 = var10.a(2) >> 1;
        if (-var6 + var5 > var4) {
          this.field_k = 0;
          this.field_i = 0;
          return;
        }
        var8 = this.field_k + var3.a(115, this.field_E);
        if (var5 - var6 < var8) {
          this.field_k = this.field_k - (-var5 + (var6 + var8));
        } else {
          if (var6 > var8) {
            this.field_k = this.field_k - var8 + var6;
          }
        }
        if (0 < this.field_k) {
          this.field_k = 0;
          return;
        }
        if (-var5 + var6 <= this.field_k) {
          return;
        }
        this.field_k = var6 - var5;
        return;
    }

    void m(int param0) {
        String var3 = null;
        String var3Lifetime1;
        if (this.field_o instanceof vc) {
          ((vc) (this.field_o)).b(16926, this);
          if (param0 != 0) {
            var3 = (String) null;
            this.a(false, -10, (String) null);
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        var3Lifetime1 = (String) null;
        this.a(false, -10, (String) null);
    }

    static {
        field_B = null;
        field_H = new le(540, 140);
    }
}
