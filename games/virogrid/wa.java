/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wa extends tg {
    private int field_N;
    private long field_O;
    private boolean field_T;
    private long field_Q;
    private int field_R;
    private int field_J;
    private boolean field_P;
    static Random field_M;
    private int field_G;
    static int field_F;
    static String field_H;
    static int field_K;
    static String field_S;
    static String field_L;
    static km field_I;

    final void a(String param0, int param1, boolean param2) {
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
          this.field_n = param0;
          var4_int = param0.length();
          if (this.field_N != -1 &&
            var4_int > this.field_N) {
            this.field_n = this.field_n.substring(0, this.field_N);
          }
          if (param1 != 81) {
            this.field_G = -11;
          }
          dupTemp$1 = this.field_n.length();
          this.field_R = dupTemp$1;
          this.field_J = dupTemp$1;
          if (param2) {
            return;
          }
          this.e(param1 ^ -29445);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wa.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        try {
          String var2 = this.i(-15816);
          if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.i(-15816))), (java.awt.datatransfer.ClipboardOwner) null);
          }
          if (param0 == -27135) {
            return;
          }
          String var3 = (String) null;
          this.a((String) null, (byte) 114);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fi var9;
        gm var11;
        ie var12;
        gm var13;
        ie var14;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        if (!this.field_T) {
          this.field_q = 0;
          this.field_k = 0;
          return;
        }
        if (!(this.field_w instanceof gm)) {
          return;
        }
        if (param0 > 63) {
          var13 = (gm) ((Object) this.field_w);
          var14 = var13.a((fi) (this), (byte) -124);
          var4 = var14.a(3209);
          var5 = var13.b((fi) (this), true);
          var6 = var13.a(0) >> 1;
          if (var5 - var6 > var4) {
            this.field_k = 0;
            this.field_q = 0;
            return;
          }
          var7 = this.field_k + var14.a(this.field_J, -1);
          if (-var6 + var5 < var7) {
            this.field_k = -var7 + (var5 - var6 + this.field_k);
          } else {
            if (var6 > var7) {
              this.field_k = -var7 + (var6 + this.field_k);
            }
          }
          if (this.field_k > 0) {
            this.field_k = 0;
            return;
          }
          if (-var5 + var6 <= this.field_k) {
            return;
          }
          this.field_k = -var5 + var6;
          return;
        }
        var9 = (fi) null;
        this.a((fi) null, '*', 68, -11);
        var11 = (gm) ((Object) this.field_w);
        var12 = var11.a((fi) (this), (byte) -124);
        var4Lifetime1 = var12.a(3209);
        var5Lifetime1 = var11.b((fi) (this), true);
        var6Lifetime1 = var11.a(0) >> 1;
        if (var5Lifetime1 - var6Lifetime1 > var4Lifetime1) {
          this.field_k = 0;
          this.field_q = 0;
          return;
        }
        var7Lifetime1 = this.field_k + var12.a(this.field_J, -1);
        if (-var6Lifetime1 + var5Lifetime1 < var7Lifetime1) {
          this.field_k = -var7Lifetime1 + (var5Lifetime1 - var6Lifetime1 + this.field_k);
        } else {
          if (var6Lifetime1 > var7Lifetime1) {
            this.field_k = -var7Lifetime1 + (var6Lifetime1 + this.field_k);
          }
        }
        if (this.field_k > 0) {
          this.field_k = 0;
          return;
        }
        if (-var5Lifetime1 + var6Lifetime1 <= this.field_k) {
          return;
        }
        this.field_k = -var5Lifetime1 + var6Lifetime1;
        return;
    }

    private final void h(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.k(0);
            if (param0 != 500) {
              this.j(11);
            }
            this.a(var2, (byte) -124);
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

    void a(int param0, int param1, fi param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        gm var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, 127, param2, param3);
          this.d((byte) 103);
          if (this.field_i == 1) {
            if (this.field_w instanceof gm) {
              var7 = (gm) ((Object) this.field_w);
              var6 = var7.a(param0, param3, hk.field_Jb, (fi) (this), true, nl.field_u);
              if (var6 != -1) {
                if (this.field_P &&
                  this.field_G > var6 &&
                  this.field_R < var6) {
                  var6 = this.field_G;
                }
                this.field_J = var6;
              }
            }
            this.field_Q = hc.a(-9986);
          }
          if (param1 > 113) {
            return;
          }
          this.field_T = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 <= -101) {
          this.field_J = param0;
          if (!dc.field_Y[81]) {
            this.field_R = this.field_J;
          }
          return;
        }
        field_L = (String) null;
        this.field_J = param0;
        if (!dc.field_Y[81]) {
          this.field_R = this.field_J;
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          if (this.field_N != -1) {
            var3_int = this.field_N - this.field_n.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          var3_intLifetime1 = -96 % ((52 - param1) / 49);
          if (this.field_J == this.field_n.length()) {
            this.field_n = this.field_n + param0;
          } else {
            this.field_n = this.field_n.substring(0, this.field_J) + param0 + this.field_n.substring(this.field_J, this.field_n.length());
          }
          this.field_J = this.field_J + param0.length();
          this.field_R = this.field_J;
          this.e(-29526);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wa.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int c(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (this.field_J == 0) {
          return this.field_J;
        }
        var2 = -108 / ((-10 - param0) / 58);
        for (var3 = -1 + this.field_J; var3 > 0; var3--) {
          if (this.field_n.charAt(-1 + var3) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, param6) &&
            this.field_w instanceof gm) {
            var8_int = ((gm) ((Object) this.field_w)).a(param3, param5, hk.field_Jb, (fi) (this), true, nl.field_u);
            if (-1 != var8_int) {
              stackIn_5_1 = var8_int;
            } else {
              stackIn_5_1 = 0;
            }
            this.a(stackIn_5_1, (byte) -119);
            var8_long = hc.a(-9986);
            stackIn_8_1 = !(250L <= var8_long - this.field_O);
            this.field_P = stackIn_8_1;
            if (this.field_P) {
              this.field_R = this.c((byte) -117);
              this.field_J = this.e((byte) -80);
              if (this.field_J > 0 &&
                this.field_n.charAt(this.field_J - 1) == 32) {
                this.field_J = this.field_J - 1;
              }
              this.field_G = this.field_J;
            }
            this.field_O = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("wa.NA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_R != this.field_J) {
          var2 = this.field_J > this.field_R ? this.field_R : this.field_J;
          var3 = this.field_J <= this.field_R ? this.field_R : this.field_J;
          this.field_R = var2;
          this.field_J = var2;
          this.field_n = this.field_n.substring(0, var2) + this.field_n.substring(var3, this.field_n.length());
          this.e(param0 - 29526);
        }
        if (param0 == 0) {
          return;
        }
        int discarded$0 = this.c((byte) -120);
    }

    private final String i(int param0) {
        int var3 = 0;
        int var2 = this.field_J > this.field_R ? this.field_R : this.field_J;
        if (param0 == -15816) {
          var3 = this.field_J > this.field_R ? this.field_J : this.field_R;
          return this.field_n.substring(var2, var3);
        }
        return (String) null;
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_Q = hc.a(-9986);
          if (param1 == 60) {
            return false;
          }
          if (param1 == 62) {
            return false;
          }
          if (32 <= param1 &&
            param1 <= 126) {
            if (this.field_R != this.field_J) {
              this.k(0);
            }
            if (this.field_N == -1 ||
              !(this.field_n.length() >= this.field_N)) {
              if (this.field_J < this.field_n.length()) {
                this.field_n = this.field_n.substring(0, this.field_J) + param1 + this.field_n.substring(this.field_J, this.field_n.length());
                this.field_J = this.field_J + 1;
                this.field_R = this.field_J;
              } else {
                this.field_n = this.field_n + param1;
                dupTemp$0 = this.field_n.length();
                this.field_J = dupTemp$0;
                this.field_R = dupTemp$0;
              }
              this.e(-29526);
            }
            return true;
          }
          if (param2 != 85) {
            if (param2 != 101) {
              if (param2 == 13) {
                this.g(0);
                return true;
              }
              if (param2 == 96) {
                if (this.field_J > 0) {
                  if (dc.field_Y[82]) {
                    stackIn_62_1 = this.c((byte) 97);
                  } else {
                    stackIn_62_1 = -1 + this.field_J;
                  }
                  this.a(stackIn_62_1, (byte) -120);
                  return true;
                }
              } else {
                if (param2 == 97) {
                  if (this.field_J < this.field_n.length()) {
                    if (!dc.field_Y[82]) {
                      stackIn_55_1 = 1 + this.field_J;
                    } else {
                      stackIn_55_1 = this.e((byte) 47);
                    }
                    this.a(stackIn_55_1, (byte) -125);
                    return true;
                  }
                } else {
                  if (param2 == 102) {
                    this.a(0, (byte) -122);
                    return true;
                  }
                  if (param2 == 103) {
                    this.a(this.field_n.length(), (byte) -112);
                    return true;
                  }
                  if (param2 == 84) {
                    this.j(0);
                    return true;
                  }
                  if (dc.field_Y[82] &&
                    param2 == 65) {
                    this.g((byte) 67);
                    return true;
                  }
                  if (dc.field_Y[82] &&
                    param2 == 66) {
                    this.f(-27135);
                    return true;
                  }
                  if (dc.field_Y[82] &&
                    param2 == 67) {
                    this.h(500);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_J != this.field_R) {
                this.k(0);
                return true;
              }
              if (this.field_J < this.field_n.length()) {
                this.field_R = 1 + this.field_J;
                this.k(0);
                return true;
              }
            }
          } else {
            if (this.field_J != this.field_R) {
              this.k(0);
              return true;
            }
            if (this.field_J > 0) {
              this.field_R = this.field_J - 1;
              this.k(0);
              return true;
            }
          }
          var5_int = -52 / ((param3 + 75) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("wa.AA(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(int param0) {
        if (param0 == 0) {
          if (this.field_o instanceof bo) {
            ((bo) (this.field_o)).a(false, this);
          }
          return;
        }
        this.field_N = -42;
        if (this.field_o instanceof bo) {
          ((bo) (this.field_o)).a(false, this);
        }
    }

    public static void f(byte param0) {
        field_M = null;
        field_L = null;
        field_S = null;
        if (param0 != 39) {
          return;
        }
        field_I = null;
        field_H = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 37) {
          return;
        }
        if (this.field_w == null) {
          return;
        }
        if (param3 != 0) {
          return;
        }
        this.field_w.a(param1, (fi) (this), this.field_C, param2, -23294);
        if (!(this.field_w instanceof gm)) {
          return;
        }
        gm var8 = (gm) ((Object) this.field_w);
        if (this.field_J != this.field_R) {
          var8.a((byte) -49, this.field_J, param1, (fi) (this), this.field_R, param2);
        }
        long var6 = hc.a(-9986);
        if ((-this.field_Q + var6) % 1000L < 500L) {
          var8.a(param1, this.field_J, true, (fi) (this), param2);
          return;
        }
    }

    private final void g(byte param0) {
        int discarded$0 = 0;
        this.f(-27135);
        this.k(0);
        if (param0 <= 61) {
          discarded$0 = this.e((byte) -3);
        }
    }

    final static mg[] a(byte param0, int param1, int param2) {
        int var3 = -45 / ((param0 + 20) / 33);
        return ak.a(param1, param2, 1, (byte) 121);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = this.field_n.length();
        if (this.field_J == var2) {
          return this.field_J;
        }
        var3 = 1 + this.field_J;
        var4 = -2 % ((-8 - param0) / 53);
        while (var2 > var3) {
          if (32 == this.field_n.charAt(-1 + var3)) {
            return var3;
          }
          var3++;
        }
        return var3;
    }

    wa(String param0, cd param1, int param2) {
        super(param0, param1);
        this.field_O = 0L;
        this.field_P = false;
        this.field_G = -1;
        try {
          this.field_w = vi.field_g.field_h;
          this.field_N = param2;
          this.a(param0, 81, true);
          this.field_T = true;
          this.field_Q = hc.a(-9986);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void g(int param0) {
        this.field_J = 0;
        this.field_n = "";
        this.field_R = param0;
        this.e(-29526);
    }

    void e(int param0) {
        if (this.field_o instanceof bo) {
          ((bo) (this.field_o)).a(this, 13);
          if (param0 != -29526) {
            this.j(117);
            return;
          }
          return;
        }
        if (param0 == -29526) {
          return;
        }
        this.j(117);
    }

    static {
        field_M = new Random();
        field_F = 0;
        field_L = "Connection timed out. Please try using a different server.";
        field_S = "<%0> wants to draw.";
        field_K = 0;
        field_H = "Names cannot start or end with space or underscore";
    }
}
