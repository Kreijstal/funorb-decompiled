/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk extends ek {
    static qk field_L;
    private int field_Q;
    static String field_N;
    static int field_cb;
    static String[] field_P;
    private long field_Z;
    static String field_bb;
    static String[] field_O;
    private boolean field_T;
    private int field_M;
    static String field_U;
    static java.security.SecureRandom field_K;
    private long field_ab;
    static mm field_R;
    static String field_Y;
    private int field_S;
    private int field_X;
    private boolean field_W;
    static int field_V;

    void l(int param0) {
        if (param0 != 18929) {
          field_K = (java.security.SecureRandom) null;
        }
        if (this.field_v instanceof qh) {
          ((qh) (this.field_v)).a(16737894, this);
        }
    }

    final void a(String param0, byte param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == null) {
            param0 = "";
          }
          this.field_E = param0;
          var4_int = param0.length();
          if (this.field_X != -1 &&
            this.field_X < var4_int) {
            this.field_E = this.field_E.substring(0, this.field_X);
          }
          dupTemp$2 = this.field_E.length();
          this.field_M = dupTemp$2;
          this.field_S = dupTemp$2;
          if (param1 != 114) {
            field_U = (String) null;
          }
          if (!param2) {
            this.l(18929);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rk.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void k(int param0) {
        cf var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        nl var9;
        var8 = client.field_A ? 1 : 0;
        if (!this.field_T) {
          this.field_x = 0;
          this.field_F = 0;
          return;
        }
        if (!(this.field_p instanceof nl)) {
          return;
        }
        var9 = (nl) ((Object) this.field_p);
        var3 = var9.a((ce) (this), (byte) 118);
        var4 = var3.a(false);
        if (param0 != -17122) {
          this.field_M = -109;
        }
        var5 = var9.a(false, (ce) (this));
        var6 = var9.a((byte) -106) >> 1;
        if (var4 < var5 - var6) {
          this.field_F = 0;
          this.field_x = 0;
          return;
        }
        var7 = this.field_x + var3.a((byte) -94, this.field_S);
        if (var5 - var6 < var7) {
          this.field_x = this.field_x + (-var6 + var5) - var7;
        } else {
          if (var6 > var7) {
            this.field_x = this.field_x - (-var6 + var7);
          }
        }
        if (0 < this.field_x) {
          this.field_x = 0;
        } else {
          if (-var5 + var6 > this.field_x) {
            this.field_x = -var5 + var6;
          }
        }
        return;
    }

    private final void f(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_S != this.field_M) {
          var2 = this.field_S <= this.field_M ? this.field_S : this.field_M;
          var3 = this.field_S <= this.field_M ? this.field_M : this.field_S;
          this.field_M = var2;
          this.field_S = var2;
          this.field_E = this.field_E.substring(0, var2) + this.field_E.substring(var3, this.field_E.length());
          this.l(18929);
        }
        var2Lifetime1 = -30 / ((param0 - 40) / 59);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = this.field_E.length();
        if (var2 == this.field_S) {
          return this.field_S;
        }
        for (var3 = 1 + this.field_S; var3 < var2; var3++) {
          if (this.field_E.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        if (param0 != -30) {
          this.field_X = 46;
        }
        return var3;
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
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
          if (!(this.field_p instanceof nl)) {
            return false;
          }
          var8_int = ((nl) ((Object) this.field_p)).a(param5, -257, (ce) (this), param4, pm.field_f, bh.field_g);
          stackIn_5_1 = param6 ^ 30294;
          if (var8_int == -1) {
            stackIn_6_2 = 0;
          } else {
            stackIn_6_2 = var8_int;
          }
          this.b(stackIn_5_1, stackIn_6_2);
          var8_long = ik.a(4);
          stackIn_9_1 = !(250L <= -this.field_ab + var8_long);
          this.field_W = stackIn_9_1;
          if (this.field_W) {
            this.field_M = this.n(0);
            this.field_S = this.e((byte) -30);
            if (this.field_S > 0 &&
              this.field_E.charAt(-1 + this.field_S) == 32) {
              this.field_S = this.field_S - 1;
            }
            this.field_Q = this.field_S;
          }
          this.field_ab = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("rk.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 != -76) {
          return;
        }
        this.h((byte) -113);
        this.f((byte) -95);
    }

    private final void b(boolean param0) {
        if (this.field_v instanceof qh) {
          ((qh) (this.field_v)).b(-2569, this);
        }
        if (param0) {
          this.field_ab = 15L;
        }
    }

    rk(String param0, kg param1, int param2) {
        super(param0, param1);
        this.field_ab = 0L;
        this.field_Q = -1;
        this.field_W = false;
        try {
          this.field_X = param2;
          this.field_p = bf.field_x.field_l;
          this.a(param0, (byte) 114, true);
          this.field_T = true;
          this.field_Z = ik.a(4);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void c(boolean param0) {
        em.a(-1199770620);
        if (param0) {
          return;
        }
        hm.a(4, (byte) -104);
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            return;
          }
          if (this.field_X != -1) {
            var3_int = this.field_X - this.field_E.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_S == this.field_E.length()) {
            this.field_E = this.field_E + param0;
          } else {
            this.field_E = this.field_E.substring(0, this.field_S) + param0 + this.field_E.substring(this.field_S, this.field_E.length());
          }
          this.field_S = this.field_S + param0.length();
          this.field_M = this.field_S;
          this.l(18929);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rk.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void h(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 < 112) {
            field_R = (mm) null;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.f((byte) -92);
            this.a(var2, true);
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

    final void a(int param0, int param1, int param2, int param3) {
        nl var9 = null;
        long var6 = 0L;
        if (param1 > -103) {
          ce var8 = (ce) null;
          this.a(-88, -47, (ce) null, '%');
        }
        if (null != this.field_p &&
          param2 == 0) {
          this.field_p.a(this.field_I, param0, param3, (byte) -110, (ce) (this));
          if (this.field_p instanceof nl) {
            var9 = (nl) ((Object) this.field_p);
            if (this.field_M != this.field_S) {
              var9.a(this.field_M, this.field_S, param3, param0, -123, (ce) (this));
            }
            var6 = ik.a(4);
            if ((var6 - this.field_Z) % 1000L < 500L) {
              var9.a((ce) (this), this.field_S, 1, param0, param3);
            }
          }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        nl var7 = null;
        int var6 = 0;
        try {
          super.a(param0, 94, param2, param3);
          if (param1 < 38) {
            this.field_X = 63;
          }
          this.k(-17122);
          if (this.field_o == 1) {
            if (this.field_p instanceof nl) {
              var7 = (nl) ((Object) this.field_p);
              var6 = var7.a(param3, -257, (ce) (this), param2, pm.field_f, bh.field_g);
              if (var6 != -1) {
                if (this.field_W && this.field_Q > var6 &&
                  this.field_M < var6) {
                  var6 = this.field_Q;
                }
                this.field_S = var6;
              }
            }
            this.field_Z = ik.a(4);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "rk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void m(int param0) {
        this.field_M = param0;
        this.field_E = "";
        this.field_S = 0;
        this.l(18929);
    }

    private final String i(int param0) {
        int var2 = this.field_S > this.field_M ? this.field_M : this.field_S;
        if (param0 <= 102) {
          return (String) null;
        }
        int var3 = this.field_M >= this.field_S ? this.field_M : this.field_S;
        return this.field_E.substring(var2, var3);
    }

    public static void j(int param0) {
        field_N = null;
        field_R = null;
        field_L = null;
        field_Y = null;
        field_P = null;
        field_U = null;
        field_bb = null;
        field_O = null;
        field_K = null;
        if (param0 != 81) {
          rk.c(true);
        }
    }

    private final void b(int param0, int param1) {
        this.field_S = param1;
        if (!bj.field_d[81]) {
          this.field_M = this.field_S;
        }
        if (param0 != -30305) {
          this.field_Z = 4L;
        }
    }

    private final void h(byte param0) {
        String var2 = this.i(127);
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.i(103))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 > -96) {
          String var3 = (String) null;
          this.a((String) null, true);
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_55_1 = 0;
        int stackIn_56_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_Z = ik.a(4);
          if (60 != param3 &&
            param3 != 62) {
            if (32 <= param3 &&
              param3 <= 126) {
              if (this.field_S != this.field_M) {
                this.f((byte) -94);
              }
              if (this.field_X == -1 ||
                !(this.field_E.length() >= this.field_X)) {
                if (this.field_S < this.field_E.length()) {
                  this.field_E = this.field_E.substring(0, this.field_S) + param3 + this.field_E.substring(this.field_S, this.field_E.length());
                  this.field_S = this.field_S + 1;
                  this.field_M = this.field_S;
                } else {
                  this.field_E = this.field_E + param3;
                  dupTemp$0 = this.field_E.length();
                  this.field_S = dupTemp$0;
                  this.field_M = dupTemp$0;
                }
                this.l(18929);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.field_M != this.field_S) {
                this.f((byte) -94);
                return true;
              }
              if (this.field_S > 0) {
                this.field_M = -1 + this.field_S;
                this.f((byte) 113);
                return true;
              }
            } else {
              if (param1 != 101) {
                if (param1 == 13) {
                  this.m(0);
                  return true;
                }
                if (param1 != 96) {
                  if (param1 == 97) {
                    if (this.field_S < this.field_E.length()) {
                      stackIn_55_1 = -30305;
                      if (bj.field_d[82]) {
                        stackIn_56_2 = this.e((byte) -30);
                      } else {
                        stackIn_56_2 = 1 + this.field_S;
                      }
                      this.b(stackIn_55_1, stackIn_56_2);
                      return true;
                    }
                  } else {
                    if (102 == param1) {
                      this.b(-30305, 0);
                      return true;
                    }
                    if (param1 == 103) {
                      this.b(-30305, this.field_E.length());
                      return true;
                    }
                    if (param1 == 84) {
                      this.b(false);
                      return true;
                    }
                    if (bj.field_d[82] &&
                      param1 == 65) {
                      this.g((byte) -76);
                      return true;
                    }
                    if (bj.field_d[82] &&
                      66 == param1) {
                      this.h((byte) -101);
                      return true;
                    }
                    if (bj.field_d[82] &&
                      param1 == 67) {
                      this.h(118);
                      return true;
                    }
                  }
                } else {
                  if (0 < this.field_S) {
                    stackIn_25_1 = -30305;
                    if (bj.field_d[82]) {
                      stackIn_26_2 = this.n(0);
                    } else {
                      stackIn_26_2 = -1 + this.field_S;
                    }
                    this.b(stackIn_25_1, stackIn_26_2);
                    return true;
                  }
                }
              } else {
                if (this.field_S != this.field_M) {
                  this.f((byte) -65);
                  return true;
                }
                if (this.field_S < this.field_E.length()) {
                  this.field_M = 1 + this.field_S;
                  this.f((byte) -50);
                  return true;
                }
              }
            }
            var5_int = -114 / ((-22 - param0) / 49);
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("rk.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int n(int param0) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param0 == this.field_S) {
          return this.field_S;
        }
        for (var2 = this.field_S - 1; 0 < var2; var2--) {
          if (this.field_E.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    static {
        field_O = new String[]{"Get four of the same colour touching!", "The wildcard special item (multicoloured star) can be used in place of any other colour!", "Watch out! All shapes you match will now come back as solid shapes. Match four loose pieces of the same colour against the solid shape to get rid of it again.", "Did you know that if you get two or more matches at the same time, you get a special item?"};
        field_bb = "Suggest muting this player";
        field_U = "You have entered another game.";
        field_N = "To clear a solid shape, make another shape of the same colour against it.";
        field_V = -1;
    }
}
