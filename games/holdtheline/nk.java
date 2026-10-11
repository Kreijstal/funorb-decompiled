/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends rm {
    private boolean field_I;
    static String field_M;
    private boolean field_G;
    private int field_N;
    private long field_P;
    static int[] field_K;
    private int field_L;
    static int[] field_J;
    private int field_O;
    private long field_H;
    static boolean field_R;
    private int field_Q;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_O != this.field_L) {
          var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
          var3 = this.field_L < this.field_O ? this.field_O : this.field_L;
          this.field_O = var2;
          this.field_L = var2;
          this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
          this.f((byte) 100);
        }
        if (!param0) {
          return;
        }
        this.field_G = false;
    }

    private final void a(int param0, int param1) {
        if (param0 != -31523) {
          this.a(-33, -31, 0, 101);
          this.field_O = param1;
          if (!lk.field_g[81]) {
            this.field_L = this.field_O;
            return;
          }
          return;
        }
        this.field_O = param1;
        if (lk.field_g[81]) {
          return;
        }
        this.field_L = this.field_O;
    }

    private final void m(int param0) {
        this.j(-117);
        if (param0 <= 93) {
          nk.n(-47);
          this.a(false);
          return;
        }
        this.a(false);
    }

    private final void b(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.a(false);
            if (!param0) {
              return;
            }
            this.a(-127, var2);
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

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
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
          if (!(this.field_l instanceof vc)) {
            return false;
          }
          var8_int = ((vc) ((Object) this.field_l)).a(param2, (byte) 76, nc.field_g, param0, (n) (this), rf.field_X);
          stackIn_6_1 = -31523;
          if (var8_int != -1) {
            stackIn_7_2 = var8_int;
          } else {
            stackIn_7_2 = 0;
          }
          this.a(stackIn_6_1, stackIn_7_2);
          var8_long = bb.b(-1);
          stackIn_10_1 = !(-this.field_H + var8_long >= 250L);
          this.field_G = stackIn_10_1;
          if (this.field_G) {
            this.field_L = this.a((byte) 70);
            this.field_O = this.e((byte) -88);
            if (this.field_O > 0 &&
              32 == this.field_q.charAt(this.field_O - 1)) {
              this.field_O = this.field_O - 1;
            }
            this.field_Q = this.field_O;
          }
          this.field_H = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("nk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, n param1, int param2, byte param3) {
        vc var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.k(-62);
          if (this.field_v == 1) {
            if (this.field_l instanceof vc) {
              var5 = (vc) ((Object) this.field_l);
              var6 = var5.a(param2, (byte) 110, nc.field_g, param0, (n) (this), rf.field_X);
              if (var6 != -1) {
                if (this.field_G &&
                  var6 < this.field_Q &&
                  var6 > this.field_L) {
                  var6 = this.field_Q;
                }
                this.field_O = var6;
              }
            }
            this.field_P = bb.b(-1);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "nk.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        vc var8 = null;
        long var6 = 0L;
        if (this.field_l == null) {
          if (param0 == -9532) {
            return;
          }
          this.k(-36);
          return;
        }
        if (param3 != 0) {
          if (param0 == -9532) {
            return;
          }
          this.k(-36);
          return;
        }
        this.field_l.a(this.field_D, param2, -101, (n) (this), param1);
        if (this.field_l instanceof vc) {
          var8 = (vc) ((Object) this.field_l);
          if (this.field_O != this.field_L) {
            var8.a(-108, param1, param2, this.field_O, this.field_L, (n) (this));
          }
          var6 = bb.b(-1);
          if ((var6 - this.field_P) % 1000L >= 500L) {
            if (param0 == -9532) {
              return;
            }
            this.k(-36);
            return;
          }
          var8.a(param2, (n) (this), this.field_O, (byte) -98, param1);
        }
        if (param0 == -9532) {
          return;
        }
        this.k(-36);
    }

    private final String g(byte param0) {
        int var3 = -83 / ((-74 - param0) / 45);
        int var2 = this.field_L >= this.field_O ? this.field_O : this.field_L;
        int var4 = this.field_L >= this.field_O ? this.field_L : this.field_O;
        return this.field_q.substring(var2, var4);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = this.field_q.length();
        if (this.field_O == var2) {
          return this.field_O;
        }
        if (param0 != -88) {
          return -8;
        }
        for (var3 = 1 + this.field_O; var2 > var3; var3++) {
          if (this.field_q.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    nk(String param0, tb param1, int param2) {
        super(param0, param1);
        this.field_G = false;
        this.field_Q = -1;
        this.field_H = 0L;
        try {
          this.field_N = param2;
          this.field_l = pc.field_b.field_s;
          this.a(true, param0, 1471);
          this.field_I = true;
          this.field_P = bb.b(-1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_N != -1) {
            var3_int = this.field_N - this.field_q.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (param0 >= -117) {
            this.field_L = -34;
          }
          if (this.field_O != this.field_q.length()) {
            this.field_q = this.field_q.substring(0, this.field_O) + param1 + this.field_q.substring(this.field_O, this.field_q.length());
          } else {
            this.field_q = this.field_q + param1;
          }
          this.field_O = this.field_O + param1.length();
          this.field_L = this.field_O;
          this.f((byte) -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("nk.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int a(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (this.field_O == 0) {
          return this.field_O;
        }
        var2 = -1 + this.field_O;
        var3 = 56 / ((5 - param0) / 42);
        while (var2 > 0) {
          if (32 == this.field_q.charAt(-1 + var2)) {
            return var2;
          }
          var2--;
        }
        return var2;
    }

    private final void l(int param0) {
        int discarded$0 = 0;
        if (this.field_t instanceof ed) {
          ((ed) (this.field_t)).a((byte) 19, this);
          if (param0 <= 83) {
            discarded$0 = this.e((byte) -112);
            return;
          }
          return;
        }
        if (param0 > 83) {
          return;
        }
        int discarded$1 = this.e((byte) -112);
    }

    void f(byte param0) {
        if (this.field_t instanceof ed) {
          ((ed) (this.field_t)).a(this, -110);
        }
        int var2 = 81 % ((param0 + 44) / 59);
    }

    private final void k(int param0) {
        int var9 = HoldTheLine.field_D;
        if (!this.field_I) {
          this.field_m = 0;
          this.field_y = 0;
          return;
        }
        if (!(this.field_l instanceof vc)) {
          return;
        }
        vc var10 = (vc) ((Object) this.field_l);
        int var3 = 14 / ((70 - param0) / 49);
        lm var4 = var10.a((byte) 20, (n) (this));
        int var5 = var4.a((byte) 98);
        int var6 = var10.a(9, (n) (this));
        int var7 = var10.a(true) >> 1;
        if (var6 - var7 > var5) {
          this.field_y = 0;
          this.field_m = 0;
          return;
        }
        int var8 = this.field_m + var4.a(16777215, this.field_O);
        if (-var7 + var6 < var8) {
          this.field_m = this.field_m - (var8 + var7) + var6;
          if (0 < this.field_m) {
            this.field_m = 0;
            return;
          }
          if (this.field_m < -var6 + var7) {
            this.field_m = -var6 + var7;
            return;
          }
          return;
        }
        if (var8 < var7) {
          this.field_m = this.field_m + var7 - var8;
          if (0 < this.field_m) {
            this.field_m = 0;
            return;
          }
          if (this.field_m < -var6 + var7) {
            this.field_m = -var6 + var7;
            return;
          }
          return;
        }
        if (0 < this.field_m) {
          this.field_m = 0;
          return;
        }
        if (this.field_m >= -var6 + var7) {
          return;
        }
        this.field_m = -var6 + var7;
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_P = bb.b(-1);
          if (param2 != -78) {
            return false;
          }
          if (param3 != 60 &&
            param3 != 62) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.field_L != this.field_O) {
                this.a(false);
              }
              if (this.field_N == -1 ||
                !(this.field_q.length() >= this.field_N)) {
                if (this.field_O < this.field_q.length()) {
                  this.field_q = this.field_q.substring(0, this.field_O) + param3 + this.field_q.substring(this.field_O, this.field_q.length());
                  this.field_O = this.field_O + 1;
                  this.field_L = this.field_O;
                } else {
                  this.field_q = this.field_q + param3;
                  dupTemp$0 = this.field_q.length();
                  this.field_O = dupTemp$0;
                  this.field_L = dupTemp$0;
                }
                this.f((byte) 126);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.field_L != this.field_O) {
                this.a(false);
                return true;
              }
              if (this.field_O > 0) {
                this.field_L = -1 + this.field_O;
                this.a(false);
                return true;
              }
            } else {
              if (param1 == 101) {
                if (this.field_L != this.field_O) {
                  this.a(false);
                  return true;
                }
                if (this.field_O < this.field_q.length()) {
                  this.field_L = 1 + this.field_O;
                  this.a(false);
                  return true;
                }
              } else {
                if (13 == param1) {
                  this.o(1);
                  return true;
                }
                if (param1 == 96) {
                  if (0 < this.field_O) {
                    stackIn_48_1 = -31523;
                    if (lk.field_g[82]) {
                      stackIn_49_2 = this.a((byte) -37);
                    } else {
                      stackIn_49_2 = -1 + this.field_O;
                    }
                    this.a(stackIn_48_1, stackIn_49_2);
                    return true;
                  }
                } else {
                  if (param1 == 97) {
                    if (this.field_O < this.field_q.length()) {
                      stackIn_42_1 = -31523;
                      if (!lk.field_g[82]) {
                        stackIn_43_2 = 1 + this.field_O;
                      } else {
                        stackIn_43_2 = this.e((byte) -88);
                      }
                      this.a(stackIn_42_1, stackIn_43_2);
                      return true;
                    }
                  } else {
                    if (param1 == 102) {
                      this.a(-31523, 0);
                      return true;
                    }
                    if (103 == param1) {
                      this.a(-31523, this.field_q.length());
                      return true;
                    }
                    if (84 == param1) {
                      this.l(93);
                      return true;
                    }
                    if (lk.field_g[82] &&
                      param1 == 65) {
                      this.m(103);
                      return true;
                    }
                    if (lk.field_g[82] &&
                      param1 == 66) {
                      this.j(-73);
                      return true;
                    }
                    if (lk.field_g[82] &&
                      67 == param1) {
                      this.b(true);
                      return true;
                    }
                  }
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("nk.T(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(int param0) {
        try {
          String var2 = this.g((byte) -126);
          if (param0 > -37) {
            this.field_I = false;
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          if (var2.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) -20))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          if (param2 != 1471) {
            this.o(114);
          }
          this.field_q = param1;
          var4_int = param1.length();
          if (this.field_N != -1 &&
            this.field_N < var4_int) {
            this.field_q = this.field_q.substring(0, this.field_N);
          }
          dupTemp$1 = this.field_q.length();
          this.field_L = dupTemp$1;
          this.field_O = dupTemp$1;
          if (param0) {
            return;
          }
          this.f((byte) 19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final void o(int param0) {
        this.field_O = 0;
        this.field_q = "";
        this.field_L = 0;
        this.f((byte) 105);
        if (param0 != 1) {
          this.b(true);
        }
    }

    public static void n(int param0) {
        field_M = null;
        field_J = null;
        if (param0 != 3875) {
          return;
        }
        field_K = null;
    }

    static {
        field_M = "Create a free account to";
    }
}
