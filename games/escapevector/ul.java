/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends hc {
    private boolean field_J;
    static Sprite[] field_E;
    private int field_N;
    private long field_G;
    private boolean field_M;
    static int[] field_I;
    static ce field_O;
    private long field_D;
    private int field_H;
    private int field_P;
    private int field_L;

    final boolean a(hm param0, char param1, int param2, int param3) {
        int stackIn_49_1 = 0;
        int stackIn_55_1 = 0;
        String stackIn_81_2 = null;
        try {
          this.field_G = td.b(128);
          if (param3 < 0) {
            this.g((byte) 21);
          }
          if (param1 != 60 &&
            62 != param1) {
            if (param1 >= 32 &&
              126 >= param1) {
              if (this.field_L != this.field_P) {
                this.k(0);
              }
              if (this.field_H == -1 ||
                !(this.field_l.length() >= this.field_H)) {
                if (this.field_L >= this.field_l.length()) {
                  this.field_l = this.field_l + param1;
                  int dupTemp$0 = this.field_l.length();
                  this.field_L = dupTemp$0;
                  this.field_P = dupTemp$0;
                } else {
                  this.field_l = this.field_l.substring(0, this.field_L) + param1 + this.field_l.substring(this.field_L, this.field_l.length());
                  this.field_L = this.field_L + 1;
                  this.field_P = this.field_L;
                }
                this.a(false);
              }
              return true;
            }
            if (param2 == 85) {
              if (this.field_P != this.field_L) {
                this.k(0);
                return true;
              }
              if (this.field_L > 0) {
                this.field_P = this.field_L - 1;
                this.k(0);
                return true;
              }
            } else if (param2 != 101) {
              if (param2 == 13) {
                this.h((byte) -29);
                return true;
              }
              if (param2 != 96) {
                if (97 == param2) {
                  if (this.field_L >= this.field_l.length()) {
                    return false;
                  }
                  if (ik.field_h[82]) {
                    stackIn_49_1 = this.o(1);
                  } else {
                    stackIn_49_1 = this.field_L + 1;
                  }
                  this.b(stackIn_49_1, 121);
                  return true;
                }
                if (102 == param2) {
                  this.b(0, 33);
                  return true;
                }
                if (param2 == 103) {
                  this.b(this.field_l.length(), 115);
                  return true;
                }
                if (param2 == 84) {
                  this.n(0);
                  return true;
                }
                if (ik.field_h[82] &&
                  param2 == 65) {
                  this.g((byte) 8);
                  return true;
                }
                if (ik.field_h[82] &&
                  66 == param2) {
                  this.e((byte) 104);
                  return true;
                }
                if (ik.field_h[82] &&
                  param2 == 67) {
                  this.q(87);
                  return true;
                }
              } else if (this.field_L > 0) {
                if (!ik.field_h[82]) {
                  stackIn_55_1 = -1 + this.field_L;
                } else {
                  stackIn_55_1 = this.p(-94);
                }
                this.b(stackIn_55_1, 22);
                return true;
              }
            } else {
              if (this.field_P != this.field_L) {
                this.k(0);
                return true;
              }
              if (this.field_L < this.field_l.length()) {
                this.field_P = this.field_L + 1;
                this.k(0);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_80_0 = var5;
          StringBuilder stackIn_80_1 = new StringBuilder().append("ul.G(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String l(int param0) {
        int var2 = this.field_P < this.field_L ? this.field_P : this.field_L;
        if (param0 == 100) {
          int var3 = this.field_L > this.field_P ? this.field_L : this.field_P;
          return this.field_l.substring(var2, var3);
        }
        return (String) null;
    }

    void a(boolean param0) {
        if (this.field_q instanceof rj) {
          ((rj) (this.field_q)).a(this, 0);
          if (param0) {
            field_O = (ce) null;
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        field_O = (ce) null;
    }

    private final int o(int param0) {
        int var3;
        int var4 = EscapeVector.obfuscationControl;
        int var2 = this.field_l.length();
        if (var2 == this.field_L) {
          return this.field_L;
        }
        for (var3 = param0 + this.field_L; var2 > var3; var3++) {
          if (this.field_l.charAt(var3 - 1) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -124) {
          if (param1 < 4096) {
            if (param1 >= 2048) {
              stackIn_19_0 = -un.field_t[-2048 + param1];
            } else {
              stackIn_19_0 = un.field_t[-param1 + 2048];
            }
            return stackIn_19_0;
          }
          if (param1 < 6144) {
            stackIn_15_0 = -un.field_t[6144 - param1];
          } else {
            stackIn_15_0 = un.field_t[-6144 + param1];
          }
          return stackIn_15_0;
        }
        ul.a(-64, 14);
        if (param1 < 4096) {
          if (param1 >= 2048) {
            stackIn_9_0 = -un.field_t[-2048 + param1];
          } else {
            stackIn_9_0 = un.field_t[-param1 + 2048];
          }
          return stackIn_9_0;
        }
        if (param1 < 6144) {
          stackIn_5_0 = -un.field_t[6144 - param1];
        } else {
          stackIn_5_0 = un.field_t[-6144 + param1];
        }
        return stackIn_5_0;
    }

    private final void n(int param0) {
        if (this.field_q instanceof rj) {
          ((rj) (this.field_q)).a(true, this);
          if (param0 != 0) {
            ul.a(-65, 47, 47);
            return;
          }
          return;
        }
        if (param0 == 0) {
          return;
        }
        ul.a(-65, 47, 47);
    }

    final void a(String param0, boolean param1, int param2) {
        String stackIn_15_2 = null;
        try {
          if (param2 != -33) {
            this.h((byte) 111);
          }
          if (param0 == null) {
            param0 = "";
          }
          this.field_l = param0;
          int var4_int = param0.length();
          if (this.field_H != -1 &&
            var4_int > this.field_H) {
            this.field_l = this.field_l.substring(0, this.field_H);
          }
          int dupTemp$1 = this.field_l.length();
          this.field_P = dupTemp$1;
          this.field_L = dupTemp$1;
          if (param1) {
            return;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ul.DA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, String param1) {
        String stackIn_15_2 = null;
        try {
          if (this.field_H != -1) {
            int var3_int = this.field_H - this.field_l.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (param0 != -120) {
            this.field_J = false;
          }
          if (this.field_L != this.field_l.length()) {
            this.field_l = this.field_l.substring(0, this.field_L) + param1 + this.field_l.substring(this.field_L, this.field_l.length());
          } else {
            this.field_l = this.field_l + param1;
          }
          this.field_L = this.field_L + param1.length();
          this.field_P = this.field_L;
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var3;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ul.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int stackIn_6_1 = 0;
        String stackIn_22_2 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_s instanceof ao)) {
            return false;
          }
          int var8_int = ((ao) ((Object) this.field_s)).a(param4, param0, bj.field_y, dh.field_d, 118, (hm) (this));
          stackIn_6_1 = (var8_int == -1) ? (0) : (var8_int);
          this.b(stackIn_6_1, 61);
          long var8_long = td.b(param2 + 125);
          boolean stackIn_9_1 = !(-this.field_D + var8_long >= 250L);
          this.field_M = stackIn_9_1;
          if (this.field_M) {
            this.field_P = this.p(-121);
            this.field_L = this.o(1);
            if (this.field_L > 0 &&
              this.field_l.charAt(-1 + this.field_L) == 32) {
              this.field_L = this.field_L - 1;
            }
            this.field_N = this.field_L;
          }
          this.field_D = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var8;
          StringBuilder stackIn_21_1 = new StringBuilder().append("ul.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    final static Sprite a(int param0, int param1, mf param2, byte param3) {
        String stackIn_9_2 = null;
        try {
          if (param3 <= 3) {
            ul.f((byte) -115);
          }
          if (uc.a(param2, 105, param0, param1)) {
            return al.a((byte) 108);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ul.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int p(int param0) {
        int var2;
        int var4 = EscapeVector.obfuscationControl;
        if (this.field_L == 0) {
          return this.field_L;
        }
        int var3 = -8 % ((param0 - 6) / 38);
        for (var2 = this.field_L - 1; var2 > 0; var2--) {
          if (this.field_l.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    public static void f(byte param0) {
        field_O = null;
        if (param0 > -52) {
          field_O = (ce) null;
          field_E = null;
          field_I = null;
          return;
        }
        field_E = null;
        field_I = null;
    }

    private final void b(int param0, int param1) {
        if (param1 < 17) {
          ul.f((byte) -102);
          this.field_L = param0;
          if (!ik.field_h[81]) {
            this.field_P = this.field_L;
            return;
          }
          return;
        }
        this.field_L = param0;
        if (ik.field_h[81]) {
          return;
        }
        this.field_P = this.field_L;
    }

    private final void m(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        if (!this.field_J) {
          this.field_n = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.field_s instanceof ao)) {
          return;
        }
        ao var9 = (ao) ((Object) this.field_s);
        pg var3 = var9.b((hm) (this), 90);
        int var4 = var3.a((byte) -112);
        int var5 = var9.a((hm) (this), -25033);
        int var6 = var9.a(115) >> 1;
        if (var5 - var6 > var4) {
          this.field_n = 0;
          this.field_v = 0;
          return;
        }
        if (param0 != -22686) {
          return;
        }
        int var7 = this.field_n + var3.a((byte) -79, this.field_L);
        if (var5 - var6 < var7) {
          this.field_n = this.field_n - (var7 + (-var5 + var6));
        } else if (var7 < var6) {
          this.field_n = -var7 + var6 + this.field_n;
        }
        if (this.field_n > 0) {
          this.field_n = 0;
          return;
        }
        if (-var5 + var6 <= this.field_n) {
          return;
        }
        this.field_n = -var5 + var6;
        return;
    }

    private final void q(int param0) {
        try {
          try {
            String var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.k(0);
            this.a((byte) -120, var2);
          } catch (Exception exception) {
          }
          if (param0 >= 34) {
            return;
          }
          ul.f((byte) 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(byte param0) {
        if (param0 == 8) {
          this.e((byte) 90);
          this.k(0);
          return;
        }
        this.a(-32, (byte) 101, 85, 10);
        this.e((byte) 90);
        this.k(0);
    }

    private final void k(int param0) {
        if (this.field_L != this.field_P) {
          int var2 = this.field_L > this.field_P ? this.field_P : this.field_L;
          int var3 = this.field_P < this.field_L ? this.field_L : this.field_P;
          this.field_L = var2;
          this.field_P = var2;
          this.field_l = this.field_l.substring(0, var2) + this.field_l.substring(var3, this.field_l.length());
          this.a(false);
        }
        if (param0 == 0) {
          return;
        }
        this.field_P = 46;
    }

    final static int a(int param0, int param1, int param2) {
        if (0 == param1) {
          return param0;
        }
        if (param1 == 1) {
          return param0 / 2;
        }
        if (param1 == 2) {
          param0 = dc.a(-110, 100, param0) * 100;
          return param0;
        }
        if (param2 < 24) {
          return 31;
        }
        if (3 == param1) {
          param0 = dc.a(-74, 100, param0) * 100;
          return param0;
        }
        return 0;
    }

    ul(String param0, wn param1, int param2) {
        super(param0, param1);
        this.field_N = -1;
        this.field_M = false;
        this.field_D = 0L;
        try {
          this.field_s = mb.field_g.field_p;
          this.field_H = param2;
          this.a(param0, true, -33);
          this.field_J = true;
          this.field_G = td.b(128);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        try {
          super.a(param0 + 0, param1, param2, param3);
          if (param0 != -14472) {
            field_I = (int[]) null;
          }
          this.m(-22686);
          if (this.field_t == 1) {
            if (this.field_s instanceof ao) {
              ao var7 = (ao) ((Object) this.field_s);
              int var6 = var7.a(param2, param1, bj.field_y, dh.field_d, param0 + 14560, (hm) (this));
              if (var6 != -1) {
                if (this.field_M && this.field_N > var6 &&
                  var6 > this.field_P) {
                  var6 = this.field_N;
                }
                this.field_L = var6;
              }
            }
            this.field_G = td.b(128);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ul.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(byte param0) {
        this.field_l = "";
        this.field_P = 0;
        this.field_L = 0;
        if (param0 == -29) {
          this.a(false);
          return;
        }
        hm var3 = (hm) null;
        this.a(-33, 14, (byte) 69, 46, -80, (hm) null, 28);
        this.a(false);
    }

    private final void e(byte param0) {
        try {
          if (param0 > 86) {
            String var2 = this.l(100);
            if (!(var2.length() <= 0)) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.l(100))), (java.awt.datatransfer.ClipboardOwner) null);
            }
            return;
          }
          this.field_L = -80;
          String var2Lifetime1 = this.l(100);
          if (!(var2Lifetime1.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.l(100))), (java.awt.datatransfer.ClipboardOwner) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 > 85) {
          if (this.field_s == null) {
            return;
          }
          if (param2 != 0) {
            return;
          }
          this.field_s.a(param3, param0, -21, (hm) (this), this.field_y);
          if (!(this.field_s instanceof ao)) {
            return;
          }
          ao var10 = (ao) ((Object) this.field_s);
          if (this.field_P != this.field_L) {
            var10.a(param3, this.field_L, (hm) (this), this.field_P, -613528456, param0);
          }
          long var6 = td.b(128);
          if (500L <= (-this.field_G + var6) % 1000L) {
            return;
          }
          var10.a((hm) (this), this.field_L, param3, param0, true);
          return;
        }
        this.field_H = -76;
        if (this.field_s == null) {
          return;
        }
        if (param2 != 0) {
          return;
        }
        this.field_s.a(param3, param0, -21, (hm) (this), this.field_y);
        if (!(this.field_s instanceof ao)) {
          return;
        }
        ao var9 = (ao) ((Object) this.field_s);
        ao var8 = var9;
        if (this.field_P != this.field_L) {
          var9.a(param3, this.field_L, (hm) (this), this.field_P, -613528456, param0);
        }
        long var6Lifetime1 = td.b(128);
        if (500L <= (-this.field_G + var6Lifetime1) % 1000L) {
          return;
        }
        var9.a((hm) (this), this.field_L, param3, param0, true);
        return;
    }

    static {
        field_I = new int[128];
    }
}
