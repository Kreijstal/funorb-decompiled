/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends qm {
    private boolean field_P;
    private int field_N;
    private long field_U;
    private int field_ab;
    private boolean field_Q;
    private int field_V;
    static bd field_Z;
    private long field_W;
    private int field_S;
    static boolean field_T;
    static volatile int field_X;
    static String field_O;
    static ha field_R;
    static tc field_Y;

    private final void d(boolean param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.l(121);
            if (!param0) {
              field_X = 86;
            }
            this.a(var2, 32240);
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

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -5782) {
          field_O = (String) null;
        }
        var2 = this.field_q.length();
        if (var2 == this.field_ab) {
          return this.field_ab;
        }
        for (var3 = this.field_ab + 1; var3 < var2; var3++) {
          if (32 != this.field_q.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    c(String param0, fn param1, int param2) {
        super(param0, param1);
        this.field_U = 0L;
        this.field_V = -1;
        this.field_P = false;
        try {
          this.field_y = h.field_X.field_i;
          this.field_N = param2;
          this.a(true, (byte) 87, param0);
          this.field_Q = true;
          this.field_W = hm.a(64);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_N != -1) {
            var3_int = this.field_N - this.field_q.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_ab == this.field_q.length()) {
            this.field_q = this.field_q + param0;
          } else {
            this.field_q = this.field_q.substring(0, this.field_ab) + param0 + this.field_q.substring(this.field_ab, this.field_q.length());
          }
          this.field_ab = this.field_ab + param0.length();
          if (param1 != 32240) {
            field_R = (ha) null;
          }
          this.field_S = this.field_ab;
          this.n(param1 + 1392121585);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("c.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void r(int param0) {
        this.e(false);
        if (param0 != -1) {
          return;
        }
        this.l(126);
    }

    public static void o(int param0) {
        field_Z = null;
        field_Y = null;
        field_O = null;
        if (param0 != 12669) {
          return;
        }
        field_R = null;
    }

    final static void m(int param0) {
        int var1 = (ni.field_q - 640) / 2;
        if (param0 < 18) {
          field_Y = (tc) null;
        }
        int var2 = qh.field_c * qh.field_c;
        int var3 = var2 - oo.field_b * oo.field_b;
        ql.field_n.a(90, -210 + t.field_d - 4, -(var3 * 199 / var2) + var1, 256, 199);
        ti.field_E.a(0, -120 + t.field_d - 4, 438 * var3 / var2 + var1 + 202, 256, 438);
    }

    private final String a(byte param0) {
        if (param0 != 11) {
          this.field_V = -69;
        }
        int var2 = this.field_S >= this.field_ab ? this.field_ab : this.field_S;
        int var3 = this.field_ab <= this.field_S ? this.field_S : this.field_ab;
        return this.field_q.substring(var2, var3);
    }

    private final void a(int param0, int param1) {
        this.field_ab = param0;
        if (!bc.field_m[param1]) {
          this.field_S = this.field_ab;
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 3) {
            this.field_P = true;
          }
          this.field_W = hm.a(64);
          if (60 == param3) {
            return false;
          }
          if (param3 == 62) {
            return false;
          }
          if (param3 >= 32 &&
            param3 <= 126) {
            if (this.field_S != this.field_ab) {
              this.l(-114);
            }
            if (this.field_N == -1 ||
              !(this.field_q.length() >= this.field_N)) {
              if (this.field_ab < this.field_q.length()) {
                this.field_q = this.field_q.substring(0, this.field_ab) + param3 + this.field_q.substring(this.field_ab, this.field_q.length());
                this.field_ab = this.field_ab + 1;
                this.field_S = this.field_ab;
              } else {
                this.field_q = this.field_q + param3;
                dupTemp$0 = this.field_q.length();
                this.field_ab = dupTemp$0;
                this.field_S = dupTemp$0;
              }
              this.n(1392153825);
            }
            return true;
          }
          if (param0 == 85) {
            if (this.field_ab != this.field_S) {
              this.l(-14);
              return true;
            }
            if (this.field_ab > 0) {
              this.field_S = this.field_ab - 1;
              this.l(-78);
              return true;
            }
          } else {
            if (param0 != 101) {
              if (param0 == 13) {
                this.p(127);
                return true;
              }
              if (param0 != 96) {
                if (97 == param0) {
                  if (this.field_ab < this.field_q.length()) {
                    if (!bc.field_m[82]) {
                      stackIn_57_1 = 1 + this.field_ab;
                    } else {
                      stackIn_57_1 = this.k(-5782);
                    }
                    this.a(stackIn_57_1, 81);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.a(0, param1 + 78);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.field_q.length(), param1 + 78);
                    return true;
                  }
                  if (param0 == 84) {
                    this.d((byte) -126);
                    return true;
                  }
                  if (bc.field_m[82] &&
                    param0 == 65) {
                    this.r(-1);
                    return true;
                  }
                  if (bc.field_m[82] &&
                    param0 == 66) {
                    this.e(false);
                    return true;
                  }
                  if (bc.field_m[82] &&
                    67 == param0) {
                    this.d(true);
                    return true;
                  }
                }
              } else {
                if (0 < this.field_ab) {
                  if (!bc.field_m[82]) {
                    stackIn_28_1 = this.field_ab - 1;
                  } else {
                    stackIn_28_1 = this.c(false);
                  }
                  this.a(stackIn_28_1, 81);
                  return true;
                }
              }
            } else {
              if (this.field_ab != this.field_S) {
                this.l(param1 - 12);
                return true;
              }
              if (this.field_ab < this.field_q.length()) {
                this.field_S = 1 + this.field_ab;
                this.l(18);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("c.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(')').toString());
        }
    }

    void n(int param0) {
        if (this.field_n instanceof hi) {
          ((hi) (this.field_n)).a(-107, this);
        }
        if (param0 != 1392153825) {
          this.n(103);
        }
    }

    final void p(int param0) {
        this.field_ab = 0;
        this.field_S = 0;
        int var2 = 19 % ((52 - param0) / 55);
        this.field_q = "";
        this.n(1392153825);
    }

    private final void q(int param0) {
        kd var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        af var9;
        var8 = Pixelate.field_H ? 1 : 0;
        if (!this.field_Q) {
          this.field_B = 0;
          this.field_x = 0;
          return;
        }
        if (!(this.field_y instanceof af)) {
          return;
        }
        var9 = (af) ((Object) this.field_y);
        var3 = var9.b(-88, (ng) (this));
        var4 = var3.a(0);
        var5 = var9.a(true, (ng) (this));
        var6 = var9.a(-3) >> 1;
        if (-var6 + var5 > var4) {
          this.field_B = 0;
          this.field_x = 0;
          return;
        }
        var7 = this.field_B + var3.b(true, this.field_ab);
        if (var5 - var6 < var7) {
          this.field_B = -var6 + var5 + (-var7 + this.field_B);
        } else {
          if (var6 > var7) {
            this.field_B = -var7 + var6 + this.field_B;
          }
        }
        if (param0 >= -60) {
          return;
        }
        if (this.field_B <= 0) {
          if (var6 - var5 > this.field_B) {
            this.field_B = -var5 + var6;
          }
        } else {
          this.field_B = 0;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        af var6 = null;
        long var7 = 0L;
        int var5 = 118 % ((param3 - 70) / 49);
        if (null != this.field_y &&
          param1 == 0) {
          this.field_y.a((ng) (this), (byte) -124, param0, param2, this.field_H);
          if (this.field_y instanceof af) {
            var6 = (af) ((Object) this.field_y);
            if (this.field_S != this.field_ab) {
              var6.a(this.field_S, (ng) (this), -1, this.field_ab, param0, param2);
            }
            var7 = hm.a(64);
            if ((var7 - this.field_W) % 1000L < 500L) {
              var6.a(param2, param0, (byte) -91, (ng) (this), this.field_ab);
            }
          }
        }
    }

    private final void l(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_S != this.field_ab) {
          var2 = this.field_ab > this.field_S ? this.field_S : this.field_ab;
          var3 = this.field_ab > this.field_S ? this.field_ab : this.field_S;
          this.field_ab = var2;
          this.field_S = var2;
          this.field_q = this.field_q.substring(0, var2) + this.field_q.substring(var3, this.field_q.length());
          this.n(1392153825);
        }
        var2Lifetime1 = 96 / ((param0 - 64) / 46);
    }

    private final void d(byte param0) {
        if (this.field_n instanceof hi) {
          ((hi) (this.field_n)).a(this, 4);
        }
        int var2 = -72 / ((-78 - param0) / 32);
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
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
          if (!(this.field_y instanceof af)) {
            return false;
          }
          var8_int = ((af) ((Object) this.field_y)).a(param3, param5, 0, uf.field_d, bg.field_k, (ng) (this));
          if (var8_int == -1) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.a(stackIn_6_1, 81);
          var8_long = hm.a(64);
          stackIn_9_1 = !(-this.field_U + var8_long >= 250L);
          this.field_P = stackIn_9_1;
          if (this.field_P) {
            this.field_S = this.c(false);
            this.field_ab = this.k(-5782);
            if (this.field_ab > 0 &&
              32 == this.field_q.charAt(-1 + this.field_ab)) {
              this.field_ab = this.field_ab - 1;
            }
            this.field_V = this.field_ab;
          }
          this.field_U = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("c.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          return;
        }
        String var2 = this.a((byte) 11);
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.a((byte) 11))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_q = param2;
          var4_int = param2.length();
          if (this.field_N != -1 &&
            this.field_N < var4_int) {
            this.field_q = this.field_q.substring(0, this.field_N);
          }
          dupTemp$1 = this.field_q.length();
          this.field_S = dupTemp$1;
          this.field_ab = dupTemp$1;
          if (param1 != 87) {
            c.o(97);
          }
          if (!param0) {
            this.n(1392153825);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        af var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.q(-117);
          if (this.field_k == 1) {
            if (this.field_y instanceof af) {
              var5 = (af) ((Object) this.field_y);
              var6 = var5.a(param1, param2, param0 ^ 40, uf.field_d, bg.field_k, (ng) (this));
              if (var6 != -1) {
                if (this.field_P &&
                  var6 < this.field_V &&
                  var6 > this.field_S) {
                  var6 = this.field_V;
                }
                this.field_ab = var6;
              }
            }
            this.field_W = hm.a(64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("c.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int c(boolean param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (this.field_ab == 0) {
          return this.field_ab;
        }
        for (var2 = -1 + this.field_ab; var2 > 0; var2--) {
          if (this.field_q.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0) {
          this.field_N = -56;
        }
        return var2;
    }

    static {
        field_Z = new bd();
        field_O = "Your request to join has been declined.";
        field_X = 0;
    }
}
