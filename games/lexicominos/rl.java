/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rl extends kf {
    private int field_L;
    private long field_M;
    private boolean field_N;
    private long field_J;
    static int field_E;
    private int field_F;
    private int field_G;
    private boolean field_K;
    private int field_I;
    static rb field_H;
    static volatile boolean field_O;

    final static int b(int param0, int param1, int param2) {
        int var3 = param1 >>> 31;
        if (param2 != 25668) {
          field_H = (rb) null;
        }
        return (var3 + param1) / param0 - var3;
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_F != this.field_I) {
          var2 = this.field_I < this.field_F ? this.field_I : this.field_F;
          var3 = this.field_F > this.field_I ? this.field_F : this.field_I;
          this.field_I = var2;
          this.field_F = var2;
          this.field_u = this.field_u.substring(0, var2) + this.field_u.substring(var3, this.field_u.length());
          this.f(false);
        }
        if (param0 != -1) {
          this.m(-24);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        w var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_G != -1) {
            var3_int = this.field_G - this.field_u.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_F == this.field_u.length()) {
            this.field_u = this.field_u + param0;
          } else {
            this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
          }
          this.field_F = this.field_F + param0.length();
          if (param1 < 85) {
            var4 = (w) null;
            this.a(10, -121, (w) null, 67, -118, 113, -122);
          }
          this.field_I = this.field_F;
          this.f(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rl.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int dupTemp$0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_J = rf.c(0);
          var5_int = 32 / ((param3 + 13) / 55);
          if (param0 == 60) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_F != this.field_I) {
              this.l(-1);
            }
            if (this.field_G == -1 ||
              !(this.field_u.length() >= this.field_G)) {
              if (this.field_F < this.field_u.length()) {
                this.field_u = this.field_u.substring(0, this.field_F) + param0 + this.field_u.substring(this.field_F, this.field_u.length());
                this.field_F = this.field_F + 1;
                this.field_I = this.field_F;
              } else {
                this.field_u = this.field_u + param0;
                dupTemp$0 = this.field_u.length();
                this.field_F = dupTemp$0;
                this.field_I = dupTemp$0;
              }
              this.f(false);
            }
            return true;
          }
          if (param1 == 85) {
            if (this.field_I != this.field_F) {
              this.l(-1);
              return true;
            }
            if (this.field_F > 0) {
              this.field_I = this.field_F - 1;
              this.l(-1);
              return true;
            }
          } else {
            if (101 == param1) {
              if (this.field_F != this.field_I) {
                this.l(-1);
                return true;
              }
              if (this.field_F < this.field_u.length()) {
                this.field_I = this.field_F + 1;
                this.l(-1);
                return true;
              }
            } else {
              if (param1 == 13) {
                this.j(0);
                return true;
              }
              if (param1 == 96) {
                if (this.field_F > 0) {
                  if (!wa.field_j[82]) {
                    stackIn_47_1 = -1 + this.field_F;
                  } else {
                    stackIn_47_1 = this.n(-1);
                  }
                  this.a(stackIn_47_1, 10);
                  return true;
                }
              } else {
                if (97 != param1) {
                  if (param1 == 102) {
                    this.a(0, -124);
                    return true;
                  }
                  if (param1 == 103) {
                    this.a(this.field_u.length(), -115);
                    return true;
                  }
                  if (param1 == 84) {
                    this.e(false);
                    return true;
                  }
                  if (wa.field_j[82] &&
                    param1 == 65) {
                    this.m(67);
                    return true;
                  }
                  if (wa.field_j[82] &&
                    param1 == 66) {
                    this.k(-1);
                    return true;
                  }
                  if (wa.field_j[82] &&
                    param1 == 67) {
                    this.f((byte) 113);
                    return true;
                  }
                } else {
                  if (this.field_F < this.field_u.length()) {
                    if (!wa.field_j[82]) {
                      stackIn_20_1 = 1 + this.field_F;
                    } else {
                      stackIn_20_1 = this.i(32);
                    }
                    this.a(stackIn_20_1, 5);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("rl.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
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
          if (!(this.field_i instanceof ub)) {
            return false;
          }
          var8_int = ((ub) ((Object) this.field_i)).a((w) (this), param4, 9, param5, bk.field_b, sh.field_e);
          if (-1 != var8_int) {
            stackIn_6_1 = var8_int;
          } else {
            stackIn_6_1 = 0;
          }
          this.a(stackIn_6_1, -124);
          var8_long = rf.c(0);
          stackIn_9_1 = !(250L <= -this.field_M + var8_long);
          this.field_K = stackIn_9_1;
          if (this.field_K) {
            this.field_I = this.n(param0 ^ 4807);
            this.field_F = this.i(32);
            if (0 < this.field_F &&
              this.field_u.charAt(-1 + this.field_F) == 32) {
              this.field_F = this.field_F - 1;
            }
            this.field_L = this.field_F;
          }
          this.field_M = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("rl.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void e(byte param0) {
        ve var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ub var10;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (!this.field_N) {
          this.field_l = 0;
          this.field_p = 0;
          return;
        }
        if (!(this.field_i instanceof ub)) {
          return;
        }
        var10 = (ub) ((Object) this.field_i);
        var3 = var10.a((w) (this), (byte) 122);
        var4 = var3.a((byte) 94);
        var5 = var10.a((w) (this), 227);
        var6 = var10.a(2) >> 1;
        if (var4 < var5 - var6) {
          this.field_l = 0;
          this.field_p = 0;
          return;
        }
        var7 = this.field_p + var3.a((byte) -116, this.field_F);
        if (-var6 + var5 < var7) {
          this.field_p = -var7 - var6 - (-var5 - this.field_p);
        } else {
          if (var7 < var6) {
            this.field_p = this.field_p + var6 - var7;
          }
        }
        if (this.field_p > 0) {
          this.field_p = 0;
        } else {
          if (-var5 + var6 > this.field_p) {
            this.field_p = -var5 + var6;
          }
        }
        var8 = 62 / ((param0 - 30) / 38);
        return;
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (~this.field_F == param0) {
          return this.field_F;
        }
        for (var2 = this.field_F - 1; var2 > 0; var2--) {
          if (32 != this.field_u.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        return var2;
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          if (param1 != -1) {
            this.f((byte) 39);
          }
          this.field_u = param0;
          var4_int = param0.length();
          if (this.field_G != -1 &&
            this.field_G < var4_int) {
            this.field_u = this.field_u.substring(0, this.field_G);
          }
          dupTemp$2 = this.field_u.length();
          this.field_I = dupTemp$2;
          this.field_F = dupTemp$2;
          if (!param2) {
            this.f(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rl.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ub var8 = null;
        long var6 = 0L;
        if (this.field_i != null &&
          param3 == 0) {
          this.field_i.a(param1, param2, this.field_D, (w) (this), -3284);
          if (this.field_i instanceof ub) {
            var8 = (ub) ((Object) this.field_i);
            if (this.field_F != this.field_I) {
              var8.a(param1, param2, (w) (this), (byte) 31, this.field_I, this.field_F);
            }
            var6 = rf.c(0);
            if ((var6 - this.field_J) % 1000L < 500L) {
              var8.a(this.field_F, param2, param1, (w) (this), true);
            }
          }
        }
        if (param0 != -115) {
          field_O = false;
        }
    }

    final void j(int param0) {
        this.field_u = "";
        this.field_F = param0;
        this.field_I = 0;
        this.f(false);
    }

    public static void g(byte param0) {
        field_H = null;
        int var1 = -50 / ((param0 - 16) / 52);
    }

    private final void a(int param0, int param1) {
        this.field_F = param0;
        if (!wa.field_j[81]) {
          this.field_I = this.field_F;
        }
        int var3 = 79 % ((-75 - param1) / 40);
    }

    void f(boolean param0) {
        if (this.field_r instanceof nf) {
          ((nf) (this.field_r)).a((byte) 10, this);
        }
        if (param0) {
          this.field_N = true;
        }
    }

    private final void m(int param0) {
        if (param0 < 40) {
          return;
        }
        this.k(-1);
        this.l(-1);
    }

    void a(byte param0, w param1, int param2, int param3) {
        ub var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.e((byte) 94);
          if (this.field_h == 1) {
            if (this.field_i instanceof ub) {
              var5 = (ub) ((Object) this.field_i);
              var6 = var5.a((w) (this), param2, 9, param3, bk.field_b, sh.field_e);
              if (var6 != -1) {
                if (this.field_K &&
                  var6 < this.field_L &&
                  this.field_I < var6) {
                  var6 = this.field_L;
                }
                this.field_F = var6;
              }
            }
            this.field_J = rf.c(param0 ^ -119);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "rl.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(boolean param0) {
        if (this.field_r instanceof nf) {
          ((nf) (this.field_r)).a(this, true);
        }
        if (param0) {
          this.m(-20);
        }
    }

    private final void f(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.l(-1);
            var3 = -67 % ((19 - param0) / 35);
            this.a(var2, (byte) 100);
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

    private final void k(int param0) {
        String var2 = this.d((byte) -83);
        if (!(~var2.length() >= param0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.d((byte) -41))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String d(byte param0) {
        int var2 = this.field_F > this.field_I ? this.field_I : this.field_F;
        int var3 = this.field_F <= this.field_I ? this.field_I : this.field_F;
        if (param0 > -27) {
          return (String) null;
        }
        return this.field_u.substring(var2, var3);
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = this.field_u.length();
        if (var2 == this.field_F) {
          return this.field_F;
        }
        if (param0 != 32) {
          this.field_F = 55;
        }
        for (var3 = 1 + this.field_F; var3 < var2; var3++) {
          if (this.field_u.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    rl(String param0, vd param1, int param2) {
        super(param0, param1);
        this.field_M = 0L;
        this.field_L = -1;
        this.field_K = false;
        try {
          this.field_i = nb.field_z.field_a;
          this.field_G = param2;
          this.a(param0, -1, true);
          this.field_N = true;
          this.field_J = rf.c(0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = new rb();
        field_O = false;
    }
}
