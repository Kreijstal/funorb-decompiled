/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends wd {
    private boolean field_H;
    static tj field_E;
    private boolean field_C;
    private long field_L;
    private int field_F;
    private int field_D;
    static boolean field_B;
    private int field_K;
    private long field_J;
    static boolean field_I;
    private int field_G;

    private final void b(int param0, int param1) {
        this.field_G = param0;
        if (!ng.field_a[81]) {
          this.field_K = this.field_G;
        }
        if (param1 != 102) {
          this.field_C = true;
        }
    }

    private final void i(int param0) {
        if (param0 != 30483) {
          this.h(-108);
        }
        if (this.field_n instanceof gl) {
          ((gl) (this.field_n)).a((byte) -51, this);
        }
    }

    private final String j(int param0) {
        int var2 = this.field_G > this.field_K ? this.field_K : this.field_G;
        int var4 = -121 % ((param0 + 61) / 36);
        int var3 = this.field_K >= this.field_G ? this.field_K : this.field_G;
        return this.field_h.substring(var2, var3);
    }

    private final void f(byte param0) {
        int var2 = -116 % ((param0 + 25) / 63);
        this.i((byte) 84);
        this.b(true);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
          return;
        }
        if (this.field_K != this.field_G) {
          var2 = this.field_G > this.field_K ? this.field_K : this.field_G;
          var3 = this.field_G > this.field_K ? this.field_G : this.field_K;
          this.field_K = var2;
          this.field_G = var2;
          this.field_h = this.field_h.substring(0, var2) + this.field_h.substring(var3, this.field_h.length());
          this.h((byte) 88);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (this.field_D != -1) {
          var3_int = this.field_D - this.field_h.length();
          if (var3_int >= 0) {
            return;
          }
          param1 = param1.substring(0, var3_int);
        }
        if (this.field_G == this.field_h.length()) {
          this.field_h = this.field_h + param1;
        } else {
          this.field_h = this.field_h.substring(0, this.field_G) + param1 + this.field_h.substring(this.field_G, this.field_h.length());
        }
        this.field_G = this.field_G + param1.length();
        this.field_K = this.field_G;
        if (param0 != 28383) {
          return;
        }
        try {
          this.h((byte) 88);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ba.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        lk var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          if (!param2) {
            var5 = (lk) null;
            this.a(32, -52, -24, (lk) null);
          }
          this.field_h = param1;
          var4_int = param1.length();
          if (this.field_D != -1 &&
            var4_int > this.field_D) {
            this.field_h = this.field_h.substring(0, this.field_D);
          }
          dupTemp$2 = this.field_h.length();
          this.field_K = dupTemp$2;
          this.field_G = dupTemp$2;
          if (!param0) {
            this.h((byte) 88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ba.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          Exception var2 = null;
          String var3 = null;
          try {
            var2_int = 12 % ((param0 - 66) / 57);
            var3 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.b(true);
            this.a(28383, var3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h(byte param0) {
        if (this.field_n instanceof gl) {
          ((gl) (this.field_n)).a(this, (byte) 98);
        }
        if (param0 != 88) {
          ba.a((byte) -91, 122L);
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        sf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.e((byte) 126);
          if (1 == this.field_u) {
            if (this.field_j instanceof sf) {
              var5 = (sf) ((Object) this.field_j);
              var6 = var5.a((lk) (this), param2, ll.field_y, param1, param0 - 57, uc.field_C);
              if (-1 != var6) {
                if (this.field_C &&
                  this.field_F > var6 &&
                  var6 > this.field_K) {
                  var6 = this.field_F;
                }
                this.field_G = var6;
              }
            }
            this.field_L = fa.a(-55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("ba.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ba(String param0, sk param1, int param2) {
        super(param0, param1);
        this.field_J = 0L;
        this.field_F = -1;
        this.field_C = false;
        try {
          this.field_D = param2;
          this.field_j = ma.field_m.field_e;
          this.a(true, param0, true);
          this.field_H = true;
          this.field_L = fa.a(-96);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Bounce.field_N;
        if (param0 < 44) {
          return -111;
        }
        var2 = this.field_h.length();
        if (var2 == this.field_G) {
          return this.field_G;
        }
        for (var3 = 1 + this.field_G; var3 < var2; var3++) {
          if (32 != this.field_h.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_L = fa.a(param3 + 14452);
          if (param1 != 60 &&
            62 != param1) {
            if (param3 != -14565) {
              this.h((byte) -70);
            }
            if (param1 >= 32 &&
              param1 <= 126) {
              if (this.field_G != this.field_K) {
                this.b(true);
              }
              if (this.field_D == -1 ||
                !(this.field_h.length() >= this.field_D)) {
                if (this.field_G < this.field_h.length()) {
                  this.field_h = this.field_h.substring(0, this.field_G) + param1 + this.field_h.substring(this.field_G, this.field_h.length());
                  this.field_G = this.field_G + 1;
                  this.field_K = this.field_G;
                } else {
                  this.field_h = this.field_h + param1;
                  dupTemp$0 = this.field_h.length();
                  this.field_G = dupTemp$0;
                  this.field_K = dupTemp$0;
                }
                this.h((byte) 88);
              }
              return true;
            }
            if (param2 == 85) {
              if (this.field_K != this.field_G) {
                this.b(true);
                return true;
              }
              if (0 >= this.field_G) {
                return false;
              }
              this.field_K = -1 + this.field_G;
              this.b(true);
              return true;
            }
            if (param2 != 101) {
              if (13 == param2) {
                this.h(123);
                return true;
              }
              if (param2 != 96) {
                if (param2 != 97) {
                  if (102 == param2) {
                    this.b(0, 102);
                    return true;
                  }
                  if (103 == param2) {
                    this.b(this.field_h.length(), 102);
                    return true;
                  }
                  if (param2 == 84) {
                    this.i(30483);
                    return true;
                  }
                  if (ng.field_a[82] &&
                    param2 == 65) {
                    this.f((byte) 107);
                    return true;
                  }
                  if (ng.field_a[82] &&
                    param2 == 66) {
                    this.i((byte) 103);
                    return true;
                  }
                  if (ng.field_a[82] &&
                    param2 == 67) {
                    this.g((byte) -11);
                    return true;
                  }
                } else {
                  if (this.field_G < this.field_h.length()) {
                    if (ng.field_a[82]) {
                      stackIn_51_1 = this.a(param3 + 14657);
                    } else {
                      stackIn_51_1 = this.field_G + 1;
                    }
                    this.b(stackIn_51_1, param3 + 14667);
                    return true;
                  }
                }
              } else {
                if (this.field_G > 0) {
                  if (!ng.field_a[82]) {
                    stackIn_44_1 = -1 + this.field_G;
                  } else {
                    stackIn_44_1 = this.k(param3 ^ -14565);
                  }
                  this.b(stackIn_44_1, param3 ^ -14467);
                  return true;
                }
              }
            } else {
              if (this.field_K != this.field_G) {
                this.b(true);
                return true;
              }
              if (this.field_G < this.field_h.length()) {
                this.field_K = this.field_G + 1;
                this.b(true);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("ba.E(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_G = 0;
        this.field_h = "";
        this.field_K = 0;
        this.h((byte) 88);
        if (param0 <= 107) {
          lk var3 = (lk) null;
          this.a(120, -64, -29, (lk) null);
        }
    }

    private final void e(byte param0) {
        ed var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        sf var9;
        var8 = Bounce.field_N;
        if (!this.field_H) {
          this.field_v = 0;
          this.field_o = 0;
          return;
        }
        if (!(this.field_j instanceof sf)) {
          return;
        }
        var9 = (sf) ((Object) this.field_j);
        if (param0 <= 102) {
          this.field_D = -65;
        }
        var3 = var9.b((lk) (this), 0);
        var4 = var3.b(106);
        var5 = var9.a((lk) (this), (byte) -55);
        var6 = var9.a(68) >> 1;
        if (-var6 + var5 > var4) {
          this.field_o = 0;
          this.field_v = 0;
          return;
        }
        var7 = this.field_v + var3.a(this.field_G, 81);
        if (-var6 + var5 >= var7) {
          if (var6 > var7) {
            this.field_v = this.field_v - (var7 - var6);
          }
        } else {
          this.field_v = this.field_v + (-var7 + (var5 - var6));
        }
        if (0 >= this.field_v) {
          if (-var5 + var6 > this.field_v) {
            this.field_v = var6 - var5;
          }
        } else {
          this.field_v = 0;
        }
        return;
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = Bounce.field_N;
        if (param0 == this.field_G) {
          return this.field_G;
        }
        for (var2 = -1 + this.field_G; var2 > 0; var2--) {
          if (this.field_h.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final static void a(byte param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param1);
            if (param0 > -29) {
              ba.a((byte) 115, 7L);
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
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
          if (!(this.field_j instanceof sf)) {
            return false;
          }
          var8_int = ((sf) ((Object) this.field_j)).a((lk) (this), param6, ll.field_y, param2, -66, uc.field_C);
          if (-1 == var8_int) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.b(stackIn_6_1, param4 ^ 28481);
          var8_long = fa.a(-99);
          stackIn_9_1 = !(var8_long - this.field_J >= 250L);
          this.field_C = stackIn_9_1;
          if (this.field_C) {
            this.field_K = this.k(param4 - 28455);
            this.field_G = this.a(116);
            if (this.field_G > 0 &&
              this.field_h.charAt(-1 + this.field_G) == 32) {
              this.field_G = this.field_G - 1;
            }
            this.field_F = this.field_G;
          }
          this.field_J = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("ba.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 <= 69) {
          return;
        }
        field_E = null;
    }

    private final void i(byte param0) {
        int var2 = 89 % ((-11 - param0) / 49);
        String var3 = this.j(65);
        if (!(var3.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(-116))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        sf var8 = null;
        long var6 = 0L;
        if (null != this.field_j &&
          param0 == 0) {
          this.field_j.a(param1, (lk) (this), (byte) 91, this.field_y, param3);
          if (this.field_j instanceof sf) {
            var8 = (sf) ((Object) this.field_j);
            if (this.field_G != this.field_K) {
              var8.a(param3, (lk) (this), param1, this.field_G, this.field_K, (byte) 87);
            }
            var6 = fa.a(-84);
            if ((-this.field_L + var6) % 1000L < 500L) {
              var8.a((lk) (this), this.field_G, (byte) 65, param1, param3);
            }
          }
        }
        if (param2 <= 33) {
          this.field_H = true;
        }
    }

    static {
    }
}
