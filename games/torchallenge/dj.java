/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dj extends ng {
    private int field_bb;
    private int field_R;
    private long field_T;
    private int field_U;
    private long field_X;
    private boolean field_Y;
    private boolean field_ab;
    private int field_S;
    static ka field_O;
    static vi field_W;
    static ge[] field_V;
    static ll field_P;
    static lj field_cb;
    static int field_Q;
    static boolean field_Z;

    private final void d(byte param0) {
        lg var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        gd var9;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (!this.field_ab) {
          this.field_u = 0;
          this.field_j = 0;
          return;
        }
        if (!(this.field_q instanceof gd)) {
          return;
        }
        var9 = (gd) ((Object) this.field_q);
        var3 = var9.a(-96, (ee) (this));
        var4 = var3.b((byte) 57);
        var5 = var9.a((ee) (this), (byte) -1);
        var6 = var9.a(param0 ^ -6) >> 1;
        if (var4 < -var6 + var5) {
          this.field_j = 0;
          this.field_u = 0;
          return;
        }
        if (param0 != 5) {
          return;
        }
        var7 = this.field_u + var3.a(-109, this.field_R);
        if (var5 - var6 < var7) {
          this.field_u = this.field_u + (-var7 + var5 - var6);
        } else {
          if (var7 < var6) {
            this.field_u = -var7 + (var6 + this.field_u);
          }
        }
        if (this.field_u <= 0) {
          if (-var5 + var6 > this.field_u) {
            this.field_u = var6 - var5;
          }
        } else {
          this.field_u = 0;
        }
        return;
    }

    dj(String param0, gg param1, int param2) {
        super(param0, param1);
        this.field_Y = false;
        this.field_S = -1;
        this.field_T = 0L;
        try {
          this.field_q = kl.field_e.field_m;
          this.field_bb = param2;
          this.a(param0, true, (byte) -21);
          this.field_ab = true;
          this.field_X = ol.a(256);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int h(int param0) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 < 101) {
          return -48;
        }
        if (this.field_R == 0) {
          return this.field_R;
        }
        for (var2 = -1 + this.field_R; var2 > 0; var2--) {
          if (this.field_v.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    void a(ee param0, int param1, byte param2, int param3) {
        int var6 = 0;
        gd var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 > -97) {
            dj.c((byte) -78);
          }
          super.a(param0, param1, (byte) -99, param3);
          this.d((byte) 5);
          if (this.field_z == 1) {
            if (this.field_q instanceof gd) {
              var7 = (gd) ((Object) this.field_q);
              var6 = var7.a(ph.field_d, kc.field_u, (ee) (this), (byte) -41, param3, param1);
              if (var6 != -1) {
                if (this.field_Y &&
                  var6 < this.field_S &&
                  this.field_U < var6) {
                  var6 = this.field_S;
                }
                this.field_R = var6;
              }
            }
            this.field_X = ol.a(256);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("dj.U(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != 65) {
          return;
        }
        field_W = null;
        field_O = null;
        field_P = null;
        field_V = null;
        field_cb = null;
    }

    private final void e(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 <= 11) {
            return;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.d(true);
            this.a(var2, 1);
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

    final void i(int param0) {
        this.field_v = "";
        if (param0 != -22617) {
          this.field_S = 38;
        }
        this.field_R = 0;
        this.field_U = 0;
        this.k(-105);
    }

    private final void a(int param0, int param1) {
        if (param1 != -1) {
          this.field_ab = true;
        }
        this.field_R = param0;
        if (!nj.field_c[81]) {
          this.field_U = this.field_R;
        }
    }

    void k(int param0) {
        if (param0 >= -79) {
          return;
        }
        if (this.field_k instanceof cc) {
          ((cc) (this.field_k)).b(this, 3);
        }
    }

    private final String j(int param0) {
        if (param0 != -12349) {
          this.k(-78);
        }
        int var2 = this.field_R > this.field_U ? this.field_U : this.field_R;
        int var3 = this.field_U >= this.field_R ? this.field_U : this.field_R;
        return this.field_v.substring(var2, var3);
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -47 % ((-34 - param1) / 32);
          if (this.field_bb != -1) {
            var4 = this.field_bb - this.field_v.length();
            if (var4 >= 0) {
              return;
            }
            param0 = param0.substring(0, var4);
          }
          if (this.field_R == this.field_v.length()) {
            this.field_v = this.field_v + param0;
          } else {
            this.field_v = this.field_v.substring(0, this.field_R) + param0 + this.field_v.substring(this.field_R, this.field_v.length());
          }
          this.field_R = this.field_R + param0.length();
          this.field_U = this.field_R;
          this.k(-115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dj.P(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 < 74) {
          return;
        }
        this.g(0);
        this.d(true);
    }

    final static void f(byte param0) {
        if (!lj.field_q) {
          throw new IllegalStateException();
        }
        fh.field_g = true;
        wb.a(true, (byte) -73);
        if (param0 > -51) {
          dj.c((byte) -1);
        }
        gj.field_c = 0;
    }

    final void a(String param0, boolean param1, byte param2) {
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
          this.field_v = param0;
          var4_int = param0.length();
          if (this.field_bb != -1 &&
            var4_int > this.field_bb) {
            this.field_v = this.field_v.substring(0, this.field_bb);
          }
          if (param2 != -21) {
            return;
          }
          dupTemp$2 = this.field_v.length();
          this.field_U = dupTemp$2;
          this.field_R = dupTemp$2;
          if (!param1) {
            this.k(-93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("dj.T(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        int discarded$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_45_1 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_X = ol.a(256);
          if (param2 < 9) {
            discarded$0 = this.h(110);
          }
          if (param1 == 60) {
            return false;
          }
          if (param1 == 62) {
            return false;
          }
          if (32 <= param1 &&
            param1 <= 126) {
            if (this.field_R != this.field_U) {
              this.d(true);
            }
            if (this.field_bb == -1 ||
              !(this.field_v.length() >= this.field_bb)) {
              if (this.field_R >= this.field_v.length()) {
                this.field_v = this.field_v + param1;
                dupTemp$1 = this.field_v.length();
                this.field_R = dupTemp$1;
                this.field_U = dupTemp$1;
              } else {
                this.field_v = this.field_v.substring(0, this.field_R) + param1 + this.field_v.substring(this.field_R, this.field_v.length());
                this.field_R = this.field_R + 1;
                this.field_U = this.field_R;
              }
              this.k(-105);
            }
            return true;
          }
          if (param0 != 85) {
            if (101 != param0) {
              if (param0 == 13) {
                this.i(-22617);
                return true;
              }
              if (param0 != 96) {
                if (97 != param0) {
                  if (param0 == 102) {
                    this.a(0, -1);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.field_v.length(), -1);
                    return true;
                  }
                  if (param0 == 84) {
                    this.h((byte) -108);
                    return true;
                  }
                  if (nj.field_c[82] &&
                    65 == param0) {
                    this.g((byte) 79);
                    return true;
                  }
                  if (nj.field_c[82] &&
                    param0 == 66) {
                    this.g(0);
                    return true;
                  }
                  if (nj.field_c[82] &&
                    param0 == 67) {
                    this.e((byte) 65);
                    return true;
                  }
                } else {
                  if (this.field_R < this.field_v.length()) {
                    if (nj.field_c[82]) {
                      stackIn_52_1 = this.e(true);
                    } else {
                      stackIn_52_1 = 1 + this.field_R;
                    }
                    this.a(stackIn_52_1, -1);
                    return true;
                  }
                }
              } else {
                if (this.field_R > 0) {
                  if (nj.field_c[82]) {
                    stackIn_45_1 = this.h(121);
                  } else {
                    stackIn_45_1 = this.field_R - 1;
                  }
                  this.a(stackIn_45_1, -1);
                  return true;
                }
              }
            } else {
              if (this.field_U != this.field_R) {
                this.d(true);
                return true;
              }
              if (this.field_R < this.field_v.length()) {
                this.field_U = 1 + this.field_R;
                this.d(true);
                return true;
              }
            }
          } else {
            if (this.field_R != this.field_U) {
              this.d(true);
              return true;
            }
            if (this.field_R > 0) {
              this.field_U = -1 + this.field_R;
              this.d(true);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("dj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final static og c(byte param0) {
        try {
          Throwable var1 = null;
          og stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 <= 66) {
              field_P = (ll) null;
            }
            stackIn_3_0 = (og) (Class.forName("sc").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!param0) {
          field_P = (ll) null;
        }
        if (this.field_U != this.field_R) {
          var2 = this.field_R > this.field_U ? this.field_U : this.field_R;
          var3 = this.field_U < this.field_R ? this.field_R : this.field_U;
          this.field_R = var2;
          this.field_U = var2;
          this.field_v = this.field_v.substring(0, var2) + this.field_v.substring(var3, this.field_v.length());
          this.k(-100);
        }
    }

    private final int e(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          return -110;
        }
        var2 = this.field_v.length();
        if (this.field_R == var2) {
          return this.field_R;
        }
        for (var3 = this.field_R + 1; var3 < var2; var3++) {
          if (this.field_v.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        gd var8 = null;
        long var6 = 0L;
        if (param2) {
          return;
        }
        if (this.field_q != null &&
          param3 == 0) {
          this.field_q.a((ee) (this), param0, param1, (byte) 97, this.field_F);
          if (this.field_q instanceof gd) {
            var8 = (gd) ((Object) this.field_q);
            if (this.field_R != this.field_U) {
              var8.a((byte) 3, param0, this.field_U, this.field_R, param1, (ee) (this));
            }
            var6 = ol.a(256);
            if (500L > (-this.field_X + var6) % 1000L) {
              var8.a(param1, param0, (ee) (this), this.field_R, (byte) 77);
            }
          }
        }
    }

    private final void g(int param0) {
        String var2 = this.j(-12349);
        if (!(param0 >= var2.length())) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(param0 - 12349))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void h(byte param0) {
        int var2 = -76 / ((param0 + 21) / 61);
        if (this.field_k instanceof cc) {
          ((cc) (this.field_k)).a(this, 5);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
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
            this.field_q instanceof gd) {
            var8_int = ((gd) ((Object) this.field_q)).a(ph.field_d, kc.field_u, (ee) (this), (byte) 72, param3, param4);
            if (var8_int != -1) {
              stackIn_5_1 = var8_int;
            } else {
              stackIn_5_1 = 0;
            }
            this.a(stackIn_5_1, param2 ^ 80);
            var8_long = ol.a(param2 + 337);
            stackIn_8_1 = !(var8_long - this.field_T >= 250L);
            this.field_Y = stackIn_8_1;
            if (this.field_Y) {
              this.field_U = this.h(param2 ^ -41);
              this.field_R = this.e(true);
              if (0 < this.field_R &&
                this.field_v.charAt(this.field_R - 1) == 32) {
                this.field_R = this.field_R - 1;
              }
              this.field_S = this.field_R;
            }
            this.field_T = var8_long;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("dj.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_W = new vi();
        field_Q = -1;
        field_P = new ll();
    }
}
