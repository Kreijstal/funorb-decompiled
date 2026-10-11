/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends lj {
    private int field_E;
    static int[] field_D;
    private boolean field_A;
    static int[] field_B;
    private int field_H;
    static oe[] field_L;
    private boolean field_J;
    static String field_I;
    private long field_K;
    private int field_F;
    private int field_M;
    private long field_C;

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_F != this.field_H) {
          var2 = this.field_F < this.field_H ? this.field_F : this.field_H;
          var3 = this.field_F >= this.field_H ? this.field_F : this.field_H;
          this.field_H = var2;
          this.field_F = var2;
          this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
          this.e((byte) 71);
        }
        if (param0 == 1) {
          return;
        }
        this.i(-74);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        long var6Lifetime1;
        if (null == this.field_q) {
          var5 = 55 % ((77 - param3) / 34);
          return;
        }
        if (param2 != 0) {
          var5Lifetime1 = 55 % ((77 - param3) / 34);
          return;
        }
        this.field_q.a(param0, param1, this.field_t, (byte) 107, (qg) (this));
        if (!(this.field_q instanceof m)) {
          var5Lifetime2 = 55 % ((77 - param3) / 34);
          return;
        }
        m var8 = (m) ((Object) this.field_q);
        if (this.field_H != this.field_F) {
          var8.a((qg) (this), param1, param0, this.field_F, (byte) -49, this.field_H);
          var6 = lk.a(0);
          if ((-this.field_C + var6) % 1000L < 500L) {
            var8.a(param0, this.field_H, param1, (qg) (this), true);
          }
          var5Lifetime3 = 55 % ((77 - param3) / 34);
          return;
        }
        var6Lifetime1 = lk.a(0);
        if ((-this.field_C + var6Lifetime1) % 1000L < 500L) {
          var8.a(param0, this.field_H, param1, (qg) (this), true);
          var5Lifetime4 = 55 % ((77 - param3) / 34);
          return;
        }
        var5Lifetime5 = 55 % ((77 - param3) / 34);
    }

    private final int m(int param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = this.field_k.length();
        if (var2 == this.field_H) {
          return this.field_H;
        }
        if (param0 == -7638) {
          for (var3 = this.field_H + 1; var2 > var3; var3++) {
            if (this.field_k.charAt(var3 - 1) == 32) {
              return var3;
            }
          }
          return var3;
        }
        this.field_H = -53;
        for (var3Lifetime1 = this.field_H + 1; var2 > var3Lifetime1; var3Lifetime1++) {
          if (this.field_k.charAt(var3Lifetime1 - 1) == 32) {
            return var3Lifetime1;
          }
        }
        return var3Lifetime1;
    }

    private final void k(int param0) {
        this.d(false);
        this.o(1);
        if (param0 < 53) {
          this.i(-12);
        }
    }

    private final void a(int param0, boolean param1) {
        if (!param1) {
          this.field_H = param0;
          if (!ve.field_B[81]) {
            this.field_F = this.field_H;
          }
          return;
        }
        this.e((byte) -89);
        this.field_H = param0;
        if (!ve.field_B[81]) {
          this.field_F = this.field_H;
        }
    }

    final void a(String param0, boolean param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_k = param0;
          var4_int = param0.length();
          if (this.field_E != -1 &&
            var4_int > this.field_E) {
            this.field_k = this.field_k.substring(0, this.field_E);
          }
          dupTemp$1 = this.field_k.length();
          this.field_F = dupTemp$1;
          this.field_H = dupTemp$1;
          if (!param1) {
            this.e((byte) 108);
          }
          if (param2 == 1) {
            return;
          }
          this.field_M = -100;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rg.HA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void h(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            if (param0 <= 107) {
              this.j(33);
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.o(1);
            this.a(true, var2);
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
        if (this.field_E != -1) {
          var3_int = this.field_E - this.field_k.length();
          if (var3_int >= 0) {
            return;
          }
          param1 = param1.substring(0, var3_int);
        }
        if (this.field_H != this.field_k.length()) {
          this.field_k = this.field_k.substring(0, this.field_H) + param1 + this.field_k.substring(this.field_H, this.field_k.length());
        } else {
          this.field_k = this.field_k + param1;
        }
        if (!param0) {
          return;
        }
        try {
          this.field_H = this.field_H + param1.length();
          this.field_F = this.field_H;
          this.e((byte) 50);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "rg.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        String var4;
        int var2Lifetime1;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -30) {
          if (0 == this.field_H) {
            return this.field_H;
          }
          for (var2 = -1 + this.field_H; 0 < var2; var2--) {
            if (this.field_k.charAt(var2 - 1) == 32) {
              return var2;
            }
          }
          return var2;
        }
        var4 = (String) null;
        this.a((String) null, true, 10);
        if (0 == this.field_H) {
          return this.field_H;
        }
        for (var2Lifetime1 = -1 + this.field_H; 0 < var2Lifetime1; var2Lifetime1--) {
          if (this.field_k.charAt(var2Lifetime1 - 1) == 32) {
            return var2Lifetime1;
          }
        }
        return var2Lifetime1;
    }

    public static void g(byte param0) {
        if (param0 < -40) {
          field_I = null;
          field_B = null;
          field_D = null;
          field_L = null;
          return;
        }
        field_L = (oe[]) null;
        field_I = null;
        field_B = null;
        field_D = null;
        field_L = null;
    }

    rg(String param0, ma param1, int param2) {
        super(param0, param1);
        this.field_K = 0L;
        this.field_M = -1;
        this.field_A = false;
        try {
          this.field_E = param2;
          this.field_q = vi.field_e.field_f;
          this.a(param0, true, 1);
          this.field_J = true;
          this.field_C = lk.a(0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        this.field_H = 0;
        if (param0 != 81) {
          return;
        }
        this.field_k = "";
        this.field_F = 0;
        this.e((byte) 107);
    }

    private final String f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 > 7) {
          var2 = this.field_F < this.field_H ? this.field_F : this.field_H;
          var3 = this.field_H > this.field_F ? this.field_H : this.field_F;
          return this.field_k.substring(var2, var3);
        }
        return (String) null;
    }

    private final void h(int param0) {
        ue var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        m var9;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (!this.field_J) {
          this.field_o = 0;
          this.field_r = 0;
          return;
        }
        if (!(this.field_q instanceof m)) {
          return;
        }
        var9 = (m) ((Object) this.field_q);
        var3 = var9.a((qg) (this), -2);
        var4 = var3.b((byte) 3);
        var5 = var9.b(param0, (qg) (this));
        var6 = var9.a(true) >> 1;
        if (var4 < var5 - var6) {
          this.field_o = 0;
          this.field_r = 0;
          return;
        }
        var7 = this.field_r + var3.c(0, this.field_H);
        if (var7 > var5 - var6) {
          this.field_r = this.field_r - var6 - (-var5 + var7);
        } else {
          if (var6 > var7) {
            this.field_r = this.field_r - var7 + var6;
          }
        }
        if (this.field_r > 0) {
          this.field_r = 0;
          return;
        }
        if (this.field_r >= -var5 + var6) {
          return;
        }
        this.field_r = var6 - var5;
        return;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_q instanceof m)) {
            return false;
          }
          var8_int = ((m) ((Object) this.field_q)).a(param6, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
          if (var8_int == -1) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.a(stackIn_6_1, false);
          var8_long = lk.a(param4 + 30386);
          stackIn_9_1 = !(-this.field_K + var8_long >= 250L);
          this.field_A = stackIn_9_1;
          if (this.field_A) {
            this.field_F = this.l(-119);
            this.field_H = this.m(-7638);
            if (0 < this.field_H &&
              this.field_k.charAt(-1 + this.field_H) == 32) {
              this.field_H = this.field_H - 1;
            }
            this.field_M = this.field_H;
          }
          this.field_K = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("rg.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        m var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.h(0);
          if (this.field_s == 1) {
            if (this.field_q instanceof m) {
              var5 = (m) ((Object) this.field_q);
              var6 = var5.a(param0, (byte) -50, bk.field_a, param3, oa.field_j, (qg) (this));
              if (var6 != -1) {
                if (this.field_A &&
                  var6 < this.field_M &&
                  var6 > this.field_F) {
                  var6 = this.field_M;
                }
                this.field_H = var6;
              }
            }
            this.field_C = lk.a(0);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "rg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_C = lk.a(0);
          if (60 == param3) {
            return false;
          }
          if (param3 == 62) {
            return false;
          }
          var5_int = -98 / ((param2 - 65) / 55);
          if (param3 >= 32 &&
            param3 <= 126) {
            if (this.field_H != this.field_F) {
              this.o(1);
            }
            if (this.field_E == -1 ||
              !(this.field_k.length() >= this.field_E)) {
              if (this.field_H >= this.field_k.length()) {
                this.field_k = this.field_k + param3;
                dupTemp$0 = this.field_k.length();
                this.field_H = dupTemp$0;
                this.field_F = dupTemp$0;
              } else {
                this.field_k = this.field_k.substring(0, this.field_H) + param3 + this.field_k.substring(this.field_H, this.field_k.length());
                this.field_H = this.field_H + 1;
                this.field_F = this.field_H;
              }
              this.e((byte) 53);
            }
            return true;
          }
          if (param0 == 85) {
            if (this.field_F != this.field_H) {
              this.o(1);
              return true;
            }
            if (this.field_H > 0) {
              this.field_F = -1 + this.field_H;
              this.o(1);
              return true;
            }
          } else {
            if (param0 == 101) {
              if (this.field_F != this.field_H) {
                this.o(1);
                return true;
              }
              if (this.field_H < this.field_k.length()) {
                this.field_F = this.field_H + 1;
                this.o(1);
                return true;
              }
            } else {
              if (param0 == 13) {
                this.i(81);
                return true;
              }
              if (param0 != 96) {
                if (param0 == 97) {
                  if (this.field_H < this.field_k.length()) {
                    if (ve.field_B[82]) {
                      stackIn_47_1 = this.m(-7638);
                    } else {
                      stackIn_47_1 = 1 + this.field_H;
                    }
                    this.a(stackIn_47_1, false);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.a(0, false);
                    return true;
                  }
                  if (103 == param0) {
                    this.a(this.field_k.length(), false);
                    return true;
                  }
                  if (84 == param0) {
                    this.j(24349);
                    return true;
                  }
                  if (ve.field_B[82] &&
                    65 == param0) {
                    this.k(62);
                    return true;
                  }
                  if (ve.field_B[82] &&
                    param0 == 66) {
                    this.d(false);
                    return true;
                  }
                  if (ve.field_B[82] &&
                    param0 == 67) {
                    this.h((byte) 115);
                    return true;
                  }
                }
              } else {
                if (this.field_H > 0) {
                  if (ve.field_B[82]) {
                    stackIn_16_1 = this.l(-85);
                  } else {
                    stackIn_16_1 = this.field_H - 1;
                  }
                  this.a(stackIn_16_1, false);
                  return true;
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("rg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void e(byte param0) {
        if (this.field_m instanceof fb) {
          ((fb) (this.field_m)).a(this, -122);
        }
        if (param0 >= 43) {
          return;
        }
        int discarded$0 = this.l(-86);
    }

    final static void n(int param0) {
        ub.field_d = false;
        nf.field_l.d((byte) 29);
        if (param0 < 66) {
          rg.n(74);
        }
    }

    private final void j(int param0) {
        if (this.field_m instanceof fb) {
          ((fb) (this.field_m)).a(1330, this);
        }
        if (param0 == 24349) {
          return;
        }
        this.e((byte) 99);
    }

    private final void d(boolean param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (!param0) {
            var2 = this.f((byte) 77);
            if (!(var2.length() <= 0)) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.h((byte) 92);
          var2Lifetime1 = this.f((byte) 77);
          if (!(var2Lifetime1.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.f((byte) 9))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_B = new int[]{200, 300, 300, 500, 300, 500, 200, 500, 500, 1000, 300, 300, 200, 300, 300, 300};
        field_I = "Email (Login):";
    }
}
