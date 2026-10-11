/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends htb {
    private int field_B;
    private boolean field_I;
    private long field_D;
    private long field_J;
    private boolean field_G;
    private int field_H;
    static java.awt.Frame field_E;
    private int field_C;
    static String field_F;
    private int field_K;

    private final void k(byte param0) {
        if (this.field_l instanceof en) {
          ((en) (this.field_l)).a(-12409, this);
          if (param0 < 40) {
            field_E = (java.awt.Frame) null;
            return;
          }
          return;
        }
        if (param0 >= 40) {
          return;
        }
        field_E = (java.awt.Frame) null;
    }

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          od.field_a = od.field_a + 1;
          if (ela.field_o == -1 &&
            -1 == gi.field_b) {
            gi.field_b = uia.field_b;
            ela.field_o = kc.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(rfa.field_o));
          } else {
            decompiledFrameRemainder0 = (null == rfa.field_o);
          }
          if (decompiledFrameRemainder0) {
            if (!jib.field_o) {
              if (fra.field_b <= od.field_a) {
                stackIn_17_0 = (od.field_a < fra.field_b + k.field_r) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              od.field_a = 0;
            } else {
              if (jib.field_o) {
                od.field_a = fra.field_b;
              } else {
                if (var2_int != 0) {
                  od.field_a = fra.field_b;
                } else {
                  od.field_a = 0;
                }
              }
            }
            if (param0 == null) {
              if (var2_int != 0) {
                jib.field_o = true;
              }
            } else {
              jib.field_o = false;
            }
            js.field_r = ela.field_o;
            tmb.field_o = gi.field_b;
          }
          rfa.field_o = param0;
          if (!jib.field_o &&
            od.field_a < fra.field_b &&
            upb.field_c) {
            od.field_a = 0;
            js.field_r = ela.field_o;
            tmb.field_o = gi.field_b;
          }
          if (jib.field_o &&
            ioa.field_o == od.field_a) {
            jib.field_o = false;
            od.field_a = 0;
          }
          gi.field_b = -1;
          ela.field_o = -1;
          if (param1 == 5757) {
            return;
          }
          field_F = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("uf.P(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = this.field_j.length();
        if (var2 == this.field_K) {
          return this.field_K;
        }
        var3 = this.field_K + 1;
        while (true) {
          if (var2 <= var3) {
            if (param0 != 62) {
              return 60;
            }
            return var3;
          }
          if (this.field_j.charAt(var3 - 1) != 32) {
            var3++;
            continue;
          }
          break;
        }
        if (param0 != 62) {
          return 60;
        }
        return var3;
    }

    private final void g(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_K != this.field_H) {
          var2 = this.field_H < this.field_K ? this.field_H : this.field_K;
          var3 = this.field_H < this.field_K ? this.field_K : this.field_H;
          this.field_H = var2;
          this.field_K = var2;
          this.field_j = this.field_j.substring(0, var2) + this.field_j.substring(var3, this.field_j.length());
          this.i((byte) -55);
        }
        var2Lifetime1 = -86 / ((62 - param0) / 48);
    }

    private final void h(int param0) {
        ar var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        at var9;
        var8 = VoidHunters.field_G;
        if (!this.field_G) {
          this.field_s = 0;
          this.field_i = 0;
          return;
        }
        if (!(this.field_q instanceof at)) {
          return;
        }
        var9 = (at) ((Object) this.field_q);
        var3 = var9.a((shb) (this), 3);
        var4 = var3.c(-18877);
        var5 = var9.b((shb) (this), (byte) 114);
        var6 = var9.a(35) >> 1;
        if (-var6 + var5 > var4) {
          this.field_i = 0;
          this.field_s = 0;
          return;
        }
        if (param0 != 27151) {
          return;
        }
        var7 = this.field_s + var3.a(this.field_K, param0 ^ -27235);
        if (var7 > var5 - var6) {
          this.field_s = var5 - (var6 + (var7 - this.field_s));
        } else {
          if (var6 > var7) {
            this.field_s = this.field_s + var6 - var7;
          }
        }
        if (this.field_s > 0) {
          this.field_s = 0;
          return;
        }
        if (this.field_s >= var6 - var5) {
          return;
        }
        this.field_s = -var5 + var6;
        return;
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_J = wt.a(false);
          if (param0 != -15834) {
            this.field_H = 81;
          }
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.field_K != this.field_H) {
                this.g((byte) 120);
              }
              if (-1 == this.field_C ||
                !(this.field_j.length() >= this.field_C)) {
                if (this.field_K < this.field_j.length()) {
                  this.field_j = this.field_j.substring(0, this.field_K) + param3 + this.field_j.substring(this.field_K, this.field_j.length());
                  this.field_K = this.field_K + 1;
                  this.field_H = this.field_K;
                } else {
                  this.field_j = this.field_j + param3;
                  dupTemp$0 = this.field_j.length();
                  this.field_K = dupTemp$0;
                  this.field_H = dupTemp$0;
                }
                this.i((byte) -55);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.field_K != this.field_H) {
                this.g((byte) 120);
                return true;
              }
              if (0 < this.field_K) {
                this.field_H = this.field_K - 1;
                this.g((byte) 110);
                return true;
              }
            } else {
              if (param1 != 101) {
                if (param1 == 13) {
                  this.e(82);
                  return true;
                }
                if (param1 == 96) {
                  if (0 < this.field_K) {
                    if (si.field_o[82]) {
                      stackIn_56_1 = this.g(param0 + 15834);
                    } else {
                      stackIn_56_1 = -1 + this.field_K;
                    }
                    this.a(stackIn_56_1, (byte) -74);
                    return true;
                  }
                } else {
                  if (param1 != 97) {
                    if (param1 == 102) {
                      this.a(0, (byte) -96);
                      return true;
                    }
                    if (param1 == 103) {
                      this.a(this.field_j.length(), (byte) -100);
                      return true;
                    }
                    if (param1 == 84) {
                      this.k((byte) 68);
                      return true;
                    }
                    if (si.field_o[82] &&
                      param1 == 65) {
                      this.b(true);
                      return true;
                    }
                    if (si.field_o[82] &&
                      param1 == 66) {
                      this.l((byte) 24);
                      return true;
                    }
                    if (si.field_o[82]) {
                      if (param1 != 67) {
                        return false;
                      }
                      this.f(7328);
                      return true;
                    }
                  } else {
                    if (this.field_K < this.field_j.length()) {
                      if (!si.field_o[82]) {
                        stackIn_27_1 = this.field_K + 1;
                      } else {
                        stackIn_27_1 = this.i(62);
                      }
                      this.a(stackIn_27_1, (byte) -58);
                      return true;
                    }
                  }
                }
              } else {
                if (this.field_H != this.field_K) {
                  this.g((byte) 112);
                  return true;
                }
                if (this.field_K < this.field_j.length()) {
                  this.field_H = 1 + this.field_K;
                  this.g((byte) -38);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("uf.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_j = param2;
          var4_int = param2.length();
          if (~this.field_C != param1 &&
            this.field_C < var4_int) {
            this.field_j = this.field_j.substring(0, this.field_C);
          }
          dupTemp$1 = this.field_j.length();
          this.field_H = dupTemp$1;
          this.field_K = dupTemp$1;
          if (param0) {
            return;
          }
          this.i((byte) -55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("uf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
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
          if (this.field_C != -1) {
            var3_int = this.field_C - this.field_j.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_K != this.field_j.length()) {
            this.field_j = this.field_j.substring(0, this.field_K) + param1 + this.field_j.substring(this.field_K, this.field_j.length());
          } else {
            this.field_j = this.field_j + param1;
          }
          this.field_K = this.field_K + param1.length();
          var3_intLifetime1 = -69 % ((34 - param0) / 56);
          this.field_H = this.field_K;
          this.i((byte) -55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        long var6;
        at var8;
        at var10;
        at var11;
        long var6Lifetime1;
        if (param2 > 47) {
          if (this.field_q == null) {
            return;
          }
          if (param1 != 0) {
            return;
          }
          this.field_q.a(29, (shb) (this), param0, param3, this.field_x);
          if (!(this.field_q instanceof at)) {
            return;
          }
          var11 = (at) ((Object) this.field_q);
          if (this.field_H != this.field_K) {
            var11.b(this.field_H, param3, -24184, param0, (shb) (this), this.field_K);
          }
          var6 = wt.a(false);
          if ((var6 - this.field_J) % 1000L >= 500L) {
            return;
          }
          var11.a((shb) (this), param3, (byte) 99, param0, this.field_K);
          return;
        }
        this.g((byte) 89);
        if (this.field_q == null) {
          return;
        }
        if (param1 != 0) {
          return;
        }
        this.field_q.a(29, (shb) (this), param0, param3, this.field_x);
        if (!(this.field_q instanceof at)) {
          return;
        }
        var10 = (at) ((Object) this.field_q);
        var8 = var10;
        if (this.field_H != this.field_K) {
          var10.b(this.field_H, param3, -24184, param0, (shb) (this), this.field_K);
        }
        var6Lifetime1 = wt.a(false);
        if ((var6Lifetime1 - this.field_J) % 1000L >= 500L) {
          return;
        }
        var10.a((shb) (this), param3, (byte) 99, param0, this.field_K);
        return;
    }

    uf(String param0, sba param1, int param2) {
        super(param0, param1);
        this.field_I = false;
        this.field_B = -1;
        this.field_D = 0L;
        try {
          this.field_C = param2;
          this.field_q = msa.field_s.field_o;
          this.a(true, 0, param0);
          this.field_G = true;
          this.field_J = wt.a(false);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) -61) &&
            this.field_q instanceof at) {
            var8_int = ((at) ((Object) this.field_q)).a(kc.field_b, uia.field_b, param5, param1, (shb) (this), -1);
            if (var8_int == -1) {
              stackIn_6_1 = 0;
            } else {
              stackIn_6_1 = var8_int;
            }
            this.a(stackIn_6_1, (byte) -84);
            var8_long = wt.a(false);
            stackIn_9_1 = !(var8_long - this.field_D >= 250L);
            this.field_I = stackIn_9_1;
            if (this.field_I) {
              this.field_H = this.g(0);
              this.field_K = this.i(62);
              if (this.field_K > 0 &&
                this.field_j.charAt(this.field_K - 1) == 32) {
                this.field_K = this.field_K - 1;
              }
              this.field_B = this.field_K;
            }
            this.field_D = var8_long;
            return true;
          }
          if (param6 >= -17) {
            this.k((byte) 59);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("uf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int g(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 == this.field_K) {
          return this.field_K;
        }
        for (var2 = -1 + this.field_K; var2 > 0; var2--) {
          if (this.field_j.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    void a(int param0, int param1, int param2, shb param3) {
        at var7 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2 ^ 0, param3);
          this.h(param2 ^ -27100);
          if (param2 != -981) {
            this.field_J = -63L;
          }
          if (this.field_n == 1) {
            if (this.field_q instanceof at) {
              var7 = (at) ((Object) this.field_q);
              var6 = var7.a(kc.field_b, uia.field_b, param0, param1, (shb) (this), param2 + 980);
              if (var6 != -1) {
                if (this.field_I && var6 < this.field_B &&
                  this.field_H < var6) {
                  var6 = this.field_B;
                }
                this.field_K = var6;
              }
            }
            this.field_J = wt.a(false);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.g((byte) -121);
            if (param0 != 7328) {
              return;
            }
            this.a(96, var2);
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

    public static void h(byte param0) {
        field_F = null;
        int var1 = -24 % ((-63 - param0) / 45);
        field_E = null;
    }

    private final void l(byte param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (param0 != 24) {
            this.b(true);
            var2 = this.j((byte) -96);
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          var2Lifetime1 = this.j((byte) -96);
          if (var2Lifetime1.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_K = param0;
        if (param1 <= -35) {
          if (!si.field_o[81]) {
            this.field_H = this.field_K;
          }
          return;
        }
        this.b(false);
        if (!si.field_o[81]) {
          this.field_H = this.field_K;
        }
    }

    final void e(int param0) {
        this.field_K = 0;
        if (param0 == 82) {
          this.field_H = 0;
          this.field_j = "";
          this.i((byte) -55);
          return;
        }
        String var3 = (String) null;
        this.a(32, (String) null);
        this.field_H = 0;
        this.field_j = "";
        this.i((byte) -55);
    }

    private final String j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == -96) {
          var2 = this.field_H < this.field_K ? this.field_H : this.field_K;
          var3 = this.field_H < this.field_K ? this.field_K : this.field_H;
          return this.field_j.substring(var2, var3);
        }
        return (String) null;
    }

    void i(byte param0) {
        if (this.field_l instanceof en) {
          ((en) (this.field_l)).a(this, (byte) 100);
        }
        if (param0 == -55) {
          return;
        }
        this.field_H = -20;
    }

    private final void b(boolean param0) {
        this.l((byte) 24);
        this.g((byte) 116);
        if (!param0) {
          field_F = (String) null;
        }
    }

    static {
        ns discarded$0 = new ns();
        field_F = "Weapon";
    }
}
