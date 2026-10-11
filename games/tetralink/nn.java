/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nn extends ae {
    private int field_P;
    private long field_bb;
    static int[] field_S;
    static boolean field_X;
    static boolean field_R;
    private boolean field_Z;
    static ah field_T;
    private int field_ab;
    static int field_cb;
    private boolean field_W;
    private int field_Q;
    static byte[] field_Y;
    private int field_V;
    private long field_U;

    private final void m(int param0) {
        if (this.field_s instanceof ih) {
          ((ih) (this.field_s)).a(this, (byte) 101);
        }
        if (param0 != 82) {
          String var3 = (String) null;
          this.a((String) null, false);
        }
    }

    nn(String param0, dn param1, int param2) {
        super(param0, param1);
        this.field_Z = false;
        this.field_ab = -1;
        this.field_U = 0L;
        try {
          this.field_P = param2;
          this.field_H = dh.field_q.field_r;
          this.a(true, 103, param0);
          this.field_W = true;
          this.field_bb = k.a(0);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, param3, param4 + 0, param5, param6) &&
            this.field_H instanceof jh) {
            var8_int = ((jh) ((Object) this.field_H)).a(param3, param1, a.field_a, aa.field_Nb, (na) (this), (byte) -34);
            stackIn_5_1 = 81;
            if (var8_int == -1) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = var8_int;
            }
            this.c(stackIn_5_1, stackIn_6_2);
            var8_long = k.a(0);
            stackIn_9_1 = !(-this.field_U + var8_long >= 250L);
            this.field_Z = stackIn_9_1;
            if (this.field_Z) {
              this.field_Q = this.n(-33);
              this.field_V = this.d(false);
              if (0 < this.field_V &&
                this.field_A.charAt(-1 + this.field_V) == 32) {
                this.field_V = this.field_V - 1;
              }
              this.field_ab = this.field_V;
            }
            this.field_U = var8_long;
            return true;
          }
          if (param4 == -32738) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("nn.PA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        this.field_V = param1;
        if (!sn.field_a[param0]) {
          this.field_Q = this.field_V;
        }
    }

    public static void e(boolean param0) {
        field_T = null;
        field_S = null;
        field_Y = null;
        if (!param0) {
          nn.g((byte) 45);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 <= 11) {
            nn.g((byte) -70);
          }
          if (param2 == null) {
            param2 = "";
          }
          this.field_A = param2;
          var4_int = param2.length();
          if (this.field_P != -1 &&
            this.field_P < var4_int) {
            this.field_A = this.field_A.substring(0, this.field_P);
          }
          dupTemp$2 = this.field_A.length();
          this.field_Q = dupTemp$2;
          this.field_V = dupTemp$2;
          if (!param0) {
            this.j(-12956);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var3 = wg.a(param0, -3, param1);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param0.length()) {
              if (param2 == 82) {
                return null;
              }
              field_X = true;
              stackIn_14_0 = null;
              return (String) (stackIn_14_0);
            }
            if (om.a(param0.charAt(var4), false)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = tc.field_t;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("nn.R(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        jh var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.h((byte) -85);
          if (this.field_x == 1) {
            if (this.field_H instanceof jh) {
              var5 = (jh) ((Object) this.field_H);
              var6 = var5.a(param2, param1, a.field_a, aa.field_Nb, (na) (this), (byte) -34);
              if (var6 != -1) {
                if (this.field_Z &&
                  var6 < this.field_ab &&
                  var6 > this.field_Q) {
                  var6 = this.field_ab;
                }
                this.field_V = var6;
              }
            }
            this.field_bb = k.a(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("nn.MA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(int param0) {
        int var2 = this.field_V <= this.field_Q ? this.field_V : this.field_Q;
        if (param0 < 43) {
          return (String) null;
        }
        int var3 = this.field_Q >= this.field_V ? this.field_Q : this.field_V;
        return this.field_A.substring(var2, var3);
    }

    final void k(int param0) {
        this.field_A = "";
        this.field_Q = 0;
        this.field_V = param0;
        this.j(-12956);
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_V != this.field_Q) {
          var2 = this.field_V > this.field_Q ? this.field_Q : this.field_V;
          var3 = this.field_Q >= this.field_V ? this.field_Q : this.field_V;
          this.field_Q = var2;
          this.field_V = var2;
          this.field_A = this.field_A.substring(0, var2) + this.field_A.substring(var3, this.field_A.length());
          this.j(-12956);
        }
        if (param0 != 1) {
          String var4 = (String) null;
          this.a(false, -8, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        jh var8;
        if (param0 != 0) {
          return;
        }
        if (this.field_H != null &&
          0 == param3) {
          this.field_H.a((na) (this), param1, param2, true, this.field_K);
          if (this.field_H instanceof jh) {
            var8 = (jh) ((Object) this.field_H);
            if (this.field_Q != this.field_V) {
              var8.a(this.field_Q, 18985, this.field_V, param1, param2, (na) (this));
            }
            var6 = k.a(param0 ^ 0);
            if ((var6 - this.field_bb) % 1000L < 500L) {
              var8.a((na) (this), param2, this.field_V, 0, param1);
            }
          }
        }
    }

    final static int f(byte param0) {
        if (param0 >= -43) {
          nn.f((byte) -110);
        }
        return -ja.field_j + hd.field_q;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        int dupTemp$0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_2 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_bb = k.a(param2 - 1);
          if (param2 != 1) {
            nn.i(88);
          }
          if (param1 != 60 &&
            param1 != 62) {
            if (param1 >= 32 &&
              126 >= param1) {
              if (this.field_V != this.field_Q) {
                this.h(param2 ^ 0);
              }
              if (this.field_P != -1 &&
                this.field_A.length() >= this.field_P) {
                return true;
              }
              if (this.field_V >= this.field_A.length()) {
                this.field_A = this.field_A + param1;
                dupTemp$0 = this.field_A.length();
                this.field_V = dupTemp$0;
                this.field_Q = dupTemp$0;
              } else {
                this.field_A = this.field_A.substring(0, this.field_V) + param1 + this.field_A.substring(this.field_V, this.field_A.length());
                this.field_V = this.field_V + 1;
                this.field_Q = this.field_V;
              }
              this.j(param2 - 12957);
              return true;
            }
            if (param0 != 85) {
              if (101 != param0) {
                if (param0 == 13) {
                  this.k(0);
                  return true;
                }
                if (96 == param0) {
                  if (this.field_V > 0) {
                    stackIn_68_1 = 81;
                    if (!sn.field_a[82]) {
                      stackIn_69_2 = this.field_V - 1;
                    } else {
                      stackIn_69_2 = this.n(param2 ^ -34);
                    }
                    this.c(stackIn_68_1, stackIn_69_2);
                    return true;
                  }
                } else {
                  if (param0 == 97) {
                    if (this.field_V < this.field_A.length()) {
                      stackIn_62_1 = 81;
                      if (!sn.field_a[82]) {
                        stackIn_63_2 = this.field_V + 1;
                      } else {
                        stackIn_63_2 = this.d(false);
                      }
                      this.c(stackIn_62_1, stackIn_63_2);
                      return true;
                    }
                  } else {
                    if (param0 == 102) {
                      this.c(81, 0);
                      return true;
                    }
                    if (param0 == 103) {
                      this.c(param2 + 80, this.field_A.length());
                      return true;
                    }
                    if (param0 == 84) {
                      this.m(param2 ^ 83);
                      return true;
                    }
                    if (sn.field_a[82] &&
                      param0 == 65) {
                      this.f(true);
                      return true;
                    }
                    if (sn.field_a[82] &&
                      param0 == 66) {
                      this.l(83);
                      return true;
                    }
                    if (sn.field_a[82] &&
                      67 == param0) {
                      this.e((byte) 77);
                      return true;
                    }
                  }
                }
              } else {
                if (this.field_V != this.field_Q) {
                  this.h(1);
                  return true;
                }
                if (this.field_V < this.field_A.length()) {
                  this.field_Q = 1 + this.field_V;
                  this.h(1);
                  return true;
                }
              }
            } else {
              if (this.field_V != this.field_Q) {
                this.h(1);
                return true;
              }
              if (this.field_V > 0) {
                this.field_Q = this.field_V - 1;
                this.h(1);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_77_0 = var5;
          stackIn_77_1 = new StringBuilder().append("nn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    private final void f(boolean param0) {
        this.l(93);
        if (!param0) {
          this.j(95);
        }
        this.h(1);
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        if (this.field_V == 0) {
          return this.field_V;
        }
        if (param0 != -33) {
          field_Y = (byte[]) null;
        }
        for (var2 = this.field_V - 1; var2 > 0; var2--) {
          if (this.field_A.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = TetraLink.field_J;
        try {
          var1_int = 0;
          if (param0 >= -73) {
            CharSequence var3 = (CharSequence) null;
            nn.a((CharSequence) null, true, 124);
          }
          while (pl.field_d > var1_int) {
            n.field_L[var1_int] = null;
            var1_int++;
          }
          pl.field_d = 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nn.O(" + param0 + ')');
        }
    }

    void j(int param0) {
        if (this.field_s instanceof ih) {
          ((ih) (this.field_s)).a((byte) 73, this);
        }
        if (param0 != -12956) {
          this.e((byte) 22);
        }
    }

    final static int i(int param0) {
        if (param0 < 66) {
          field_T = (ah) null;
        }
        return ea.field_a;
    }

    private final void h(byte param0) {
        hi var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        jh var10;
        var9 = TetraLink.field_J;
        if (!this.field_W) {
          this.field_o = 0;
          this.field_E = 0;
          return;
        }
        if (!(this.field_H instanceof jh)) {
          return;
        }
        var10 = (jh) ((Object) this.field_H);
        var5 = -2 % ((72 - param0) / 39);
        var3 = var10.a((na) (this), false);
        var4 = var3.b((byte) 66);
        var6 = var10.b((na) (this), 92);
        var7 = var10.a(true) >> 1;
        if (var4 < var6 - var7) {
          this.field_o = 0;
          this.field_E = 0;
          return;
        }
        var8 = this.field_E + var3.a(this.field_V, true);
        if (var8 > -var7 + var6) {
          this.field_E = -var7 + var6 - (var8 - this.field_E);
        } else {
          if (var7 > var8) {
            this.field_E = this.field_E + (-var8 + var7);
          }
        }
        if (this.field_E > 0) {
          this.field_E = 0;
        } else {
          if (-var6 + var7 > this.field_E) {
            this.field_E = -var6 + var7;
          }
        }
        return;
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        if (this.field_P != -1) {
          var3_int = this.field_P - this.field_A.length();
          if (0 <= var3_int) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (!param1) {
          return;
        }
        try {
          if (this.field_V == this.field_A.length()) {
            this.field_A = this.field_A + param0;
          } else {
            this.field_A = this.field_A.substring(0, this.field_V) + param0 + this.field_A.substring(this.field_V, this.field_A.length());
          }
          this.field_V = this.field_V + param0.length();
          this.field_Q = this.field_V;
          this.j(-12956);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nn.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.h(1);
            this.a(var2, true);
            if (param0 < 29) {
              this.field_P = -31;
            }
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

    private final void l(int param0) {
        String var2 = this.g(46);
        if (param0 <= 26) {
          return;
        }
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g(71))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final int d(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        if (param0) {
          field_cb = -17;
        }
        var2 = this.field_A.length();
        if (this.field_V == var2) {
          return this.field_V;
        }
        for (var3 = 1 + this.field_V; var2 > var3; var3++) {
          if (this.field_A.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    final static void a(String param0, float param1, int param2, boolean param3) {
        try {
          if (nl.field_a == null) {
            nl.field_a = new ug(mf.field_s, wg.field_b);
            mf.field_s.a(nl.field_a, false);
          }
          nl.field_a.a(param0, (byte) -122, param1, param3);
          ra.a();
          i.b(true, 122);
          int var4_int = -4 % ((param2 + 53) / 62);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_cb = 0;
    }
}
