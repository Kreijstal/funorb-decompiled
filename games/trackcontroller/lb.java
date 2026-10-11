/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends rh {
    static boolean field_M;
    private int field_L;
    private long field_R;
    static rd field_O;
    private boolean field_K;
    private long field_I;
    private boolean field_P;
    private int field_N;
    private int field_Q;
    private int field_J;

    final boolean a(byte param0, char param1, al param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_2 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_I = qg.a(false);
          var5_int = -37 % ((param0 - 17) / 51);
          if (param1 != 60 &&
            62 != param1) {
            if (param1 >= 32 &&
              param1 <= 126) {
              if (this.field_N != this.field_Q) {
                this.j(29388);
              }
              if (this.field_J == -1 ||
                !(this.field_s.length() >= this.field_J)) {
                if (this.field_Q < this.field_s.length()) {
                  this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
                  this.field_Q = this.field_Q + 1;
                  this.field_N = this.field_Q;
                } else {
                  this.field_s = this.field_s + param1;
                  dupTemp$0 = this.field_s.length();
                  this.field_Q = dupTemp$0;
                  this.field_N = dupTemp$0;
                }
                this.b(true);
              }
              return true;
            }
            if (param3 != 85) {
              if (param3 == 101) {
                if (this.field_Q != this.field_N) {
                  this.j(29388);
                  return true;
                }
                if (this.field_Q < this.field_s.length()) {
                  this.field_N = 1 + this.field_Q;
                  this.j(29388);
                  return true;
                }
              } else {
                if (param3 == 13) {
                  this.l(-90);
                  return true;
                }
                if (param3 != 96) {
                  if (97 != param3) {
                    if (param3 == 102) {
                      this.a(-19166, 0);
                      return true;
                    }
                    if (param3 == 103) {
                      this.a(-19166, this.field_s.length());
                      return true;
                    }
                    if (param3 == 84) {
                      this.c(false);
                      return true;
                    }
                    if (ni.field_m[82] &&
                      param3 == 65) {
                      this.d((byte) 13);
                      return true;
                    }
                    if (ni.field_m[82] &&
                      66 == param3) {
                      this.m(118);
                      return true;
                    }
                    if (ni.field_m[82]) {
                      if (param3 != 67) {
                        return false;
                      }
                      this.e((byte) 82);
                      return true;
                    }
                  } else {
                    if (this.field_Q < this.field_s.length()) {
                      stackIn_28_1 = -19166;
                      if (!ni.field_m[82]) {
                        stackIn_29_2 = 1 + this.field_Q;
                      } else {
                        stackIn_29_2 = this.r(0);
                      }
                      this.a(stackIn_28_1, stackIn_29_2);
                      return true;
                    }
                  }
                } else {
                  if (this.field_Q > 0) {
                    stackIn_21_1 = -19166;
                    if (ni.field_m[82]) {
                      stackIn_22_2 = this.k(-1);
                    } else {
                      stackIn_22_2 = -1 + this.field_Q;
                    }
                    this.a(stackIn_21_1, stackIn_22_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_N != this.field_Q) {
                this.j(29388);
                return true;
              }
              if (this.field_Q > 0) {
                this.field_N = -1 + this.field_Q;
                this.j(29388);
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
          stackIn_77_1 = new StringBuilder().append("lb.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void n(int param0) {
        if (param0 != -85) {
          lb.n(-22);
        }
        field_O = null;
    }

    private final void e(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var3 = -49 % ((-7 - param0) / 53);
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.j(29388);
            this.a(0, var2);
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

    private final void c(boolean param0) {
        if (this.field_l instanceof se) {
          ((se) (this.field_l)).b(-28, this);
        }
        if (param0) {
          this.field_N = -68;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
          if (!super.a(param0, param1, param2, param3, param4 + param4, param5, param6)) {
            return false;
          }
          if (!(this.field_y instanceof dl)) {
            return false;
          }
          var8_int = ((dl) ((Object) this.field_y)).a(param6, kf.field_b, 81, fg.field_a, param5, (al) (this));
          stackIn_6_1 = -19166;
          if (var8_int == -1) {
            stackIn_7_2 = 0;
          } else {
            stackIn_7_2 = var8_int;
          }
          this.a(stackIn_6_1, stackIn_7_2);
          var8_long = qg.a(false);
          stackIn_10_1 = !(-this.field_R + var8_long >= 250L);
          this.field_K = stackIn_10_1;
          if (this.field_K) {
            this.field_N = this.k(param4 - 1);
            this.field_Q = this.r(0);
            if (0 < this.field_Q &&
              32 == this.field_s.charAt(-1 + this.field_Q)) {
              this.field_Q = this.field_Q - 1;
            }
            this.field_L = this.field_Q;
          }
          this.field_R = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("lb.R(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        dl var8 = null;
        long var6 = 0L;
        if (param3 != 29221) {
          this.d((byte) 60);
        }
        if (this.field_y != null &&
          param0 == 0) {
          this.field_y.a(-24969, (al) (this), param2, this.field_B, param1);
          if (this.field_y instanceof dl) {
            var8 = (dl) ((Object) this.field_y);
            if (this.field_Q != this.field_N) {
              var8.b(param1, param2, this.field_Q, -84, this.field_N, (al) (this));
            }
            var6 = qg.a(false);
            if (500L > (var6 - this.field_I) % 1000L) {
              var8.a(this.field_Q, (al) (this), param3 ^ -29312, param2, param1);
            }
          }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_s = param1;
          var4_int = -28 % ((param2 - 12) / 39);
          var5 = param1.length();
          if (this.field_J != -1 &&
            this.field_J < var5) {
            this.field_s = this.field_s.substring(0, this.field_J);
          }
          dupTemp$2 = this.field_s.length();
          this.field_N = dupTemp$2;
          this.field_Q = dupTemp$2;
          if (!param0) {
            this.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("lb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -19166) {
          return;
        }
        this.field_Q = param1;
        if (!ni.field_m[81]) {
          this.field_N = this.field_Q;
        }
    }

    private final String p(int param0) {
        if (param0 > -82) {
          this.a(-5, 11);
        }
        int var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
        int var3 = this.field_N < this.field_Q ? this.field_Q : this.field_N;
        return this.field_s.substring(var2, var3);
    }

    private final void d(byte param0) {
        this.m(param0 + 110);
        if (param0 != 13) {
          return;
        }
        this.j(29388);
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (0 == this.field_Q) {
          return this.field_Q;
        }
        for (var2 = param0 + this.field_Q; var2 > 0; var2--) {
          if (this.field_s.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final int r(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = this.field_s.length();
        if (this.field_Q == var2) {
          return this.field_Q;
        }
        if (param0 != 0) {
          lb.o(54);
        }
        for (var3 = 1 + this.field_Q; var3 < var2; var3++) {
          if (32 != this.field_s.charAt(-1 + var3)) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            return;
          }
          if (this.field_J != -1) {
            var3_int = this.field_J - this.field_s.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_Q == this.field_s.length()) {
            this.field_s = this.field_s + param1;
          } else {
            this.field_s = this.field_s.substring(0, this.field_Q) + param1 + this.field_s.substring(this.field_Q, this.field_s.length());
          }
          this.field_Q = this.field_Q + param1.length();
          this.field_N = this.field_Q;
          this.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void q(int param0) {
        int var2;
        dl var3;
        rb var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = TrackController.field_F ? 1 : 0;
        if (!this.field_P) {
          this.field_o = 0;
          this.field_A = 0;
          return;
        }
        var2 = 124 / ((param0 - 28) / 54);
        if (!(this.field_y instanceof dl)) {
          return;
        }
        var3 = (dl) ((Object) this.field_y);
        var4 = var3.a((byte) 110, (al) (this));
        var5 = var4.c(-1);
        var6 = var3.a((al) (this), 121);
        var7 = var3.a((byte) 46) >> 1;
        if (-var7 + var6 > var5) {
          this.field_o = 0;
          this.field_A = 0;
          return;
        }
        var8 = this.field_o + var4.a((byte) 111, this.field_Q);
        if (var6 - var7 < var8) {
          this.field_o = -var7 + var6 - (var8 - this.field_o);
        } else {
          if (var7 > var8) {
            this.field_o = var7 - var8 + this.field_o;
          }
        }
        if (this.field_o > 0) {
          this.field_o = 0;
        } else {
          if (this.field_o < -var6 + var7) {
            this.field_o = var7 - var6;
          }
        }
        return;
    }

    private final void m(int param0) {
        String var2 = this.p(-95);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.p(-87))), (java.awt.datatransfer.ClipboardOwner) null);
        }
        if (param0 <= 115) {
          al var3 = (al) null;
          this.a(-33, -113, (byte) 101, (al) null);
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = ei.field_j;
            return stackIn_3_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = r.a(param0, -11133);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!sf.a(var4.charAt(0), -33) &&
                !sf.a(var4.charAt(var4.length() - 1), -33)) {
                var5 = 0;
                if (param2 != 1236) {
                  stackIn_21_0 = (String) null;
                  return stackIn_21_0;
                }
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (!sf.a((char) var7, param2 ^ -1269)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_31_0 = rb.field_d;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = wd.field_J;
                return stackIn_36_0;
              }
              stackIn_18_0 = wd.field_J;
              return stackIn_18_0;
            }
            stackIn_13_0 = ei.field_j;
            return stackIn_13_0;
          }
          stackIn_8_0 = ei.field_j;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("lb.B(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        int var6 = 0;
        dl var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          this.q(param2 ^ 92);
          if (this.field_r == 1) {
            if (this.field_y instanceof dl) {
              var7 = (dl) ((Object) this.field_y);
              var6 = var7.a(param0, kf.field_b, 119, fg.field_a, param1, (al) (this));
              if (var6 != -1) {
                if (this.field_K &&
                  this.field_L > var6 &&
                  this.field_N < var6) {
                  var6 = this.field_L;
                }
                this.field_Q = var6;
              }
            }
            this.field_I = qg.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    void b(boolean param0) {
        if (this.field_l instanceof se) {
          ((se) (this.field_l)).a(-12230, this);
        }
        if (!param0) {
          this.a(69, -108, 109, -105);
        }
    }

    lb(String param0, tg param1, int param2) {
        super(param0, param1);
        this.field_L = -1;
        this.field_K = false;
        this.field_R = 0L;
        try {
          this.field_y = field_O.field_e;
          this.field_J = param2;
          this.a(true, param0, -74);
          this.field_P = true;
          this.field_I = qg.a(false);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void o(int param0) {
        mc.field_H = new vd();
        re.field_g.b(mc.field_H, -103);
        if (param0 > -78) {
          CharSequence var2 = (CharSequence) null;
          lb.a((CharSequence) null, false, -68);
        }
    }

    final void l(int param0) {
        this.field_s = "";
        this.field_N = 0;
        this.field_Q = 0;
        this.b(true);
        if (param0 > -67) {
          this.field_J = -105;
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_N != this.field_Q) {
          var2 = this.field_Q <= this.field_N ? this.field_Q : this.field_N;
          var3 = this.field_Q <= this.field_N ? this.field_N : this.field_Q;
          this.field_Q = var2;
          this.field_N = var2;
          this.field_s = this.field_s.substring(0, var2) + this.field_s.substring(var3, this.field_s.length());
          this.b(true);
        }
        if (param0 != 29388) {
          this.q(93);
        }
    }

    static {
    }
}
