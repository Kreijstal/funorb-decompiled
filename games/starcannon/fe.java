/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fe extends dk {
    private int field_B;
    private boolean field_I;
    private int field_D;
    static hl field_H;
    private long field_E;
    private long field_F;
    private int field_A;
    private boolean field_G;
    private int field_C;
    static td[] field_J;

    private final void h(boolean param0) {
        uj var3 = null;
        uj var3Lifetime1;
        if (this.field_g instanceof si) {
          ((si) (this.field_g)).a(false, this);
          if (param0) {
            var3 = (uj) null;
            this.a((uj) null, 'z', (byte) -18, -33);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        var3Lifetime1 = (uj) null;
        this.a((uj) null, 'z', (byte) -18, -33);
    }

    private final void e(boolean param0) {
        if (!param0) {
          this.g(true);
          this.e((byte) -113);
          return;
        }
        this.field_C = 3;
        this.g(true);
        this.e((byte) -113);
    }

    private final void e(int param0) {
        bd var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        lg var9;
        var8 = StarCannon.field_A;
        if (!this.field_I) {
          this.field_n = 0;
          this.field_q = 0;
          return;
        }
        if (!(this.field_o instanceof lg)) {
          return;
        }
        var9 = (lg) ((Object) this.field_o);
        var3 = var9.a((uj) (this), (byte) -106);
        var4 = var3.c(param0 + 101);
        var5 = var9.b(91, (uj) (this));
        var6 = var9.a(param0 + param0) >> 1;
        if (var5 - var6 > var4) {
          this.field_n = 0;
          this.field_q = 0;
          return;
        }
        var7 = this.field_n + var3.a((byte) -30, this.field_B);
        if (var7 > -var6 + var5) {
          this.field_n = this.field_n - var7 - (var6 - var5);
        } else {
          if (var7 < var6) {
            this.field_n = -var7 + (var6 + this.field_n);
          }
        }
        if (this.field_n > 0) {
          this.field_n = 0;
          return;
        }
        if (var6 - var5 <= this.field_n) {
          return;
        }
        this.field_n = var6 - var5;
        return;
    }

    private final int g(byte param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = StarCannon.field_A;
        if (this.field_B == 0) {
          return this.field_B;
        }
        var2 = -1 + this.field_B;
        while (true) {
          if (0 >= var2) {
            var3 = -16 / ((54 - param0) / 61);
            return var2;
          }
          if (32 != this.field_k.charAt(var2 - 1)) {
            var2--;
            continue;
          }
          break;
        }
        var3Lifetime1 = -16 / ((54 - param0) / 61);
        return var2;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6;
        uj var8;
        lg var9;
        lg var11;
        lg var12;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        if (param2 == 49) {
          if (null == this.field_o) {
            return;
          }
          if (0 != param0) {
            return;
          }
          this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (uj) (this));
          if (!(this.field_o instanceof lg)) {
            return;
          }
          var12 = (lg) ((Object) this.field_o);
          if (this.field_B == this.field_D) {
            var6 = dd.b(74);
            if (500L <= (-this.field_F + var6) % 1000L) {
              return;
            }
            var12.a(-3, (uj) (this), param1, param3, this.field_B);
            return;
          }
          var12.a(param3, param1, this.field_B, (uj) (this), (byte) 104, this.field_D);
          var6Lifetime3 = dd.b(74);
          if (500L > (-this.field_F + var6Lifetime3) % 1000L) {
            var12.a(-3, (uj) (this), param1, param3, this.field_B);
          }
          return;
        }
        var8 = (uj) null;
        this.a((uj) null, '￑', (byte) 109, -100);
        if (null == this.field_o) {
          return;
        }
        if (0 != param0) {
          return;
        }
        this.field_o.a(param1, this.field_u, param2 ^ -102, param3, (uj) (this));
        if (!(this.field_o instanceof lg)) {
          return;
        }
        var11 = (lg) ((Object) this.field_o);
        var9 = var11;
        if (this.field_B == this.field_D) {
          var6Lifetime1 = dd.b(74);
          if (500L <= (-this.field_F + var6Lifetime1) % 1000L) {
            return;
          }
          var11.a(-3, (uj) (this), param1, param3, this.field_B);
          return;
        }
        var11.a(param3, param1, this.field_B, (uj) (this), (byte) 104, this.field_D);
        var6Lifetime2 = dd.b(74);
        if (500L > (-this.field_F + var6Lifetime2) % 1000L) {
          var11.a(-3, (uj) (this), param1, param3, this.field_B);
        }
        return;
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_F = dd.b(param2 ^ -2);
          if (param2 != -90) {
            this.f(true);
          }
          if (param1 == 60) {
            return false;
          }
          if (param1 == 62) {
            return false;
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_B != this.field_D) {
              this.e((byte) -106);
            }
            if (this.field_A == -1 ||
              !(this.field_k.length() >= this.field_A)) {
              if (this.field_B >= this.field_k.length()) {
                this.field_k = this.field_k + param1;
                dupTemp$0 = this.field_k.length();
                this.field_B = dupTemp$0;
                this.field_D = dupTemp$0;
              } else {
                this.field_k = this.field_k.substring(0, this.field_B) + param1 + this.field_k.substring(this.field_B, this.field_k.length());
                this.field_B = this.field_B + 1;
                this.field_D = this.field_B;
              }
              this.f(true);
            }
            return true;
          }
          if (param3 != 85) {
            if (101 == param3) {
              if (this.field_D != this.field_B) {
                this.e((byte) -97);
                return true;
              }
              if (this.field_B < this.field_k.length()) {
                this.field_D = 1 + this.field_B;
                this.e((byte) -109);
                return true;
              }
            } else {
              if (param3 == 13) {
                this.i(19293);
                return true;
              }
              if (param3 == 96) {
                if (0 < this.field_B) {
                  if (!wc.field_c[82]) {
                    stackIn_53_1 = -1 + this.field_B;
                  } else {
                    stackIn_53_1 = this.g((byte) 122);
                  }
                  this.a(stackIn_53_1, 101);
                  return true;
                }
              } else {
                if (param3 != 97) {
                  if (param3 == 102) {
                    this.a(0, 101);
                    return true;
                  }
                  if (param3 == 103) {
                    this.a(this.field_k.length(), param2 + 191);
                    return true;
                  }
                  if (param3 == 84) {
                    this.h(false);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 65) {
                    this.e(false);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 66) {
                    this.g(true);
                    return true;
                  }
                  if (wc.field_c[82] &&
                    param3 == 67) {
                    this.g(param2 + 89);
                    return true;
                  }
                } else {
                  if (this.field_B < this.field_k.length()) {
                    if (!wc.field_c[82]) {
                      stackIn_25_1 = this.field_B + 1;
                    } else {
                      stackIn_25_1 = this.f(param2 ^ 89);
                    }
                    this.a(stackIn_25_1, 101);
                    return true;
                  }
                }
              }
            }
          } else {
            if (this.field_D != this.field_B) {
              this.e((byte) -94);
              return true;
            }
            if (this.field_B > 0) {
              this.field_D = this.field_B - 1;
              this.e((byte) -123);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("fe.EA(");
          if (param0 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void f(boolean param0) {
        if (this.field_g instanceof si) {
          ((si) (this.field_g)).a(-4312, this);
        }
        if (param0) {
          return;
        }
        field_H = (hl) null;
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 < -73) {
          if (this.field_D != this.field_B) {
            var2 = this.field_B > this.field_D ? this.field_D : this.field_B;
            var3 = this.field_B <= this.field_D ? this.field_D : this.field_B;
            this.field_D = var2;
            this.field_B = var2;
            this.field_k = this.field_k.substring(0, var2) + this.field_k.substring(var3, this.field_k.length());
            this.f(true);
          }
          return;
        }
        this.a(-88, 64, (byte) -102, 68);
        if (this.field_D != this.field_B) {
          var2Lifetime1 = this.field_B > this.field_D ? this.field_D : this.field_B;
          var3Lifetime1 = this.field_B <= this.field_D ? this.field_D : this.field_B;
          this.field_D = var2Lifetime1;
          this.field_B = var2Lifetime1;
          this.field_k = this.field_k.substring(0, var2Lifetime1) + this.field_k.substring(var3Lifetime1, this.field_k.length());
          this.f(true);
        }
    }

    final static void a(rf param0, rf param1, boolean param2) {
        try {
          if (param1.field_d != null) {
            param1.b(4);
          }
          param1.field_d = param0.field_d;
          param1.field_a = param0;
          if (param2) {
            field_J = (td[]) null;
          }
          param1.field_d.field_a = param1;
          param1.field_a.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fe.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = StarCannon.field_A;
        var2 = this.field_k.length();
        if (var2 == this.field_B) {
          return this.field_B;
        }
        for (var3 = this.field_B - param0; var2 > var3; var3++) {
          if (this.field_k.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    private final void g(boolean param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (param0) {
            var2 = this.h(-107);
            if (!(0 >= var2.length())) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(-110))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.h(false);
          var2Lifetime1 = this.h(-107);
          if (!(0 >= var2Lifetime1.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h(-110))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    fe(String param0, qg param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_E = 0L;
        this.field_C = -1;
        try {
          this.field_A = param2;
          this.field_o = eh.field_j.field_c;
          this.a((byte) -91, true, param0);
          this.field_I = true;
          this.field_F = dd.b(84);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        this.field_B = 0;
        if (param0 != 19293) {
          return;
        }
        this.field_D = 0;
        this.field_k = "";
        this.f(true);
    }

    private final String h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= -102) {
          var2 = this.field_B <= this.field_D ? this.field_B : this.field_D;
          var3 = this.field_D >= this.field_B ? this.field_D : this.field_B;
          return this.field_k.substring(var2, var3);
        }
        return (String) null;
    }

    private final void a(int param0, int param1) {
        this.field_B = param0;
        if (!wc.field_c[81]) {
          this.field_D = this.field_B;
        }
        if (param1 == 101) {
          return;
        }
        this.field_C = -124;
    }

    private final void g(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.e((byte) -106);
            if (param0 != -1) {
              return;
            }
            this.a(var2, 4);
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

    private final void a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          if (this.field_A != -1) {
            var3_int = this.field_A - this.field_k.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          var3_intLifetime1 = 67 % ((-58 - param1) / 50);
          if (this.field_B != this.field_k.length()) {
            this.field_k = this.field_k.substring(0, this.field_B) + param0 + this.field_k.substring(this.field_B, this.field_k.length());
          } else {
            this.field_k = this.field_k + param0;
          }
          this.field_B = this.field_B + param0.length();
          this.field_D = this.field_B;
          this.f(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        lg var7 = null;
        int var6 = 0;
        super.a(60, param1, param2, param3);
        this.e(0);
        if (param0 < 27) {
          return;
        }
        try {
          if (this.field_l == 1) {
            if (this.field_o instanceof lg) {
              var7 = (lg) ((Object) this.field_o);
              var6 = var7.a(pe.field_d, la.field_c, (uj) (this), param1, param3, true);
              if (var6 != -1) {
                if (this.field_G && var6 < this.field_C &&
                  this.field_D < var6) {
                  var6 = this.field_C;
                }
                this.field_B = var6;
              }
            }
            this.field_F = dd.b(122);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fe.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_7_1 = 0;
        boolean stackIn_10_1 = false;
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
          if (!(this.field_o instanceof lg)) {
            return false;
          }
          var8_int = ((lg) ((Object) this.field_o)).a(pe.field_d, la.field_c, (uj) (this), param2, param3, true);
          if (var8_int == -1) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = var8_int;
          }
          this.a(stackIn_7_1, 101);
          var8_long = dd.b(param4 + 137);
          stackIn_10_1 = !(var8_long - this.field_E >= 250L);
          this.field_G = stackIn_10_1;
          if (this.field_G) {
            this.field_D = this.g((byte) 124);
            this.field_B = this.f(-1);
            if (0 < this.field_B &&
              this.field_k.charAt(-1 + this.field_B) == 32) {
              this.field_B = this.field_B - 1;
            }
            this.field_C = this.field_B;
          }
          this.field_E = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("fe.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_k = param2;
          var4_int = param2.length();
          if (this.field_A != -1 &&
            this.field_A < var4_int) {
            this.field_k = this.field_k.substring(0, this.field_A);
          }
          if (param0 != -91) {
            var5 = (String) null;
            this.a((byte) 3, true, (String) null);
          }
          dupTemp$1 = this.field_k.length();
          this.field_D = dupTemp$1;
          this.field_B = dupTemp$1;
          if (param1) {
            return;
          }
          this.f(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("fe.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_H = null;
        if (param0 != 73) {
          field_H = (hl) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    static {
    }
}
