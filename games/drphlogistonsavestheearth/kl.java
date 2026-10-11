/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl extends hf {
    private long field_O;
    private int field_T;
    private boolean field_N;
    private boolean field_M;
    static nh[] field_R;
    static boolean field_S;
    private int field_Q;
    private int field_L;
    private long field_K;
    private int field_P;
    static int field_J;

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = this.field_p.length();
        if (this.field_L == var2) {
          return this.field_L;
        }
        if (param0 > -121) {
          return -45;
        }
        for (var3 = this.field_L + 1; var2 > var3; var3++) {
          if (32 == this.field_p.charAt(-1 + var3)) {
            return var3;
          }
        }
        return var3;
    }

    private final void k(byte param0) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        vg var9;
        va var11;
        em var12;
        va var13;
        em var14;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!this.field_N) {
          this.field_t = 0;
          this.field_q = 0;
          return;
        }
        if (!(this.field_l instanceof va)) {
          return;
        }
        if (param0 <= -41) {
          var13 = (va) ((Object) this.field_l);
          var14 = var13.a((vg) (this), true);
          var4 = var14.a(-17287);
          var5 = var13.a((vg) (this), -120);
          var6 = var13.a((byte) -120) >> 1;
          if (var4 < -var6 + var5) {
            this.field_q = 0;
            this.field_t = 0;
            return;
          }
          var7 = this.field_t + var14.a(103, this.field_L);
          if (-var6 + var5 < var7) {
            this.field_t = -var6 + (var5 + (-var7 + this.field_t));
          } else {
            if (var6 > var7) {
              this.field_t = this.field_t - (var7 - var6);
            }
          }
          if (this.field_t > 0) {
            this.field_t = 0;
            return;
          }
          if (this.field_t >= -var5 + var6) {
            return;
          }
          this.field_t = var6 - var5;
          return;
        }
        var9 = (vg) null;
        this.a(63, (vg) null, -100, (byte) -115, 14, 55, 25);
        var11 = (va) ((Object) this.field_l);
        var12 = var11.a((vg) (this), true);
        var4Lifetime1 = var12.a(-17287);
        var5Lifetime1 = var11.a((vg) (this), -120);
        var6Lifetime1 = var11.a((byte) -120) >> 1;
        if (var4Lifetime1 < -var6Lifetime1 + var5Lifetime1) {
          this.field_q = 0;
          this.field_t = 0;
          return;
        }
        var7Lifetime1 = this.field_t + var12.a(103, this.field_L);
        if (-var6Lifetime1 + var5Lifetime1 < var7Lifetime1) {
          this.field_t = -var6Lifetime1 + (var5Lifetime1 + (-var7Lifetime1 + this.field_t));
        } else {
          if (var6Lifetime1 > var7Lifetime1) {
            this.field_t = this.field_t - (var7Lifetime1 - var6Lifetime1);
          }
        }
        if (this.field_t > 0) {
          this.field_t = 0;
          return;
        }
        if (this.field_t >= -var5Lifetime1 + var6Lifetime1) {
          return;
        }
        this.field_t = var6Lifetime1 - var5Lifetime1;
        return;
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
          if (param2 != -19116) {
            return;
          }
          this.field_p = param1;
          var4_int = param1.length();
          if (-1 != this.field_P &&
            var4_int > this.field_P) {
            this.field_p = this.field_p.substring(0, this.field_P);
          }
          dupTemp$1 = this.field_p.length();
          this.field_Q = dupTemp$1;
          this.field_L = dupTemp$1;
          if (param0) {
            return;
          }
          this.m((byte) -9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("kl.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final void h(byte param0) {
        this.field_p = "";
        if (param0 != 88) {
          return;
        }
        this.field_L = 0;
        this.field_Q = 0;
        this.m((byte) -76);
    }

    void m(byte param0) {
        if (this.field_u instanceof kd) {
          ((kd) (this.field_u)).a(true, this);
        }
        int var2 = 84 % ((35 - param0) / 33);
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 < 63) {
            this.field_P = 111;
          }
          this.field_K = la.a(false);
          if (param1 == 60) {
            return false;
          }
          if (param1 == 62) {
            return false;
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_Q != this.field_L) {
              this.i(63);
            }
            if (this.field_P == -1 ||
              !(this.field_p.length() >= this.field_P)) {
              if (this.field_L >= this.field_p.length()) {
                this.field_p = this.field_p + param1;
                dupTemp$0 = this.field_p.length();
                this.field_L = dupTemp$0;
                this.field_Q = dupTemp$0;
              } else {
                this.field_p = this.field_p.substring(0, this.field_L) + param1 + this.field_p.substring(this.field_L, this.field_p.length());
                this.field_L = this.field_L + 1;
                this.field_Q = this.field_L;
              }
              this.m((byte) -102);
            }
            return true;
          }
          if (85 != param0) {
            if (param0 != 101) {
              if (param0 == 13) {
                this.h((byte) 88);
                return true;
              }
              if (param0 == 96) {
                if (this.field_L > 0) {
                  if (ck.field_f[82]) {
                    stackIn_73_1 = this.l((byte) 75);
                  } else {
                    stackIn_73_1 = -1 + this.field_L;
                  }
                  this.a(stackIn_73_1, (byte) -59);
                  return true;
                }
              } else {
                if (param0 == 97) {
                  if (this.field_L < this.field_p.length()) {
                    if (ck.field_f[82]) {
                      stackIn_67_1 = this.k(-125);
                    } else {
                      stackIn_67_1 = this.field_L + 1;
                    }
                    this.a(stackIn_67_1, (byte) -59);
                    return true;
                  }
                } else {
                  if (param0 == 102) {
                    this.a(0, (byte) -59);
                    return true;
                  }
                  if (param0 == 103) {
                    this.a(this.field_p.length(), (byte) -59);
                    return true;
                  }
                  if (param0 == 84) {
                    this.j(0);
                    return true;
                  }
                  if (ck.field_f[82] &&
                    param0 == 65) {
                    this.h(-1);
                    return true;
                  }
                  if (ck.field_f[82] &&
                    param0 == 66) {
                    this.i((byte) 124);
                    return true;
                  }
                  if (ck.field_f[82] &&
                    param0 == 67) {
                    this.g((byte) -53);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_Q != this.field_L) {
                this.i(-79);
                return true;
              }
              if (this.field_L < this.field_p.length()) {
                this.field_Q = 1 + this.field_L;
                this.i(-108);
                return true;
              }
            }
          } else {
            if (this.field_Q != this.field_L) {
              this.i(-48);
              return true;
            }
            if (this.field_L > 0) {
              this.field_Q = this.field_L - 1;
              this.i(-117);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("kl.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    kl(String param0, fd param1, int param2) {
        super(param0, param1);
        this.field_O = 0L;
        this.field_M = false;
        this.field_T = -1;
        try {
          this.field_P = param2;
          this.field_l = ja.field_Q.field_f;
          this.a(true, param0, -19116);
          this.field_N = true;
          this.field_K = la.a(false);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_L != this.field_Q) {
          var2 = this.field_Q >= this.field_L ? this.field_L : this.field_Q;
          var3 = this.field_L <= this.field_Q ? this.field_Q : this.field_L;
          this.field_L = var2;
          this.field_Q = var2;
          this.field_p = this.field_p.substring(0, var2) + this.field_p.substring(var3, this.field_p.length());
          this.m((byte) -45);
        }
        var2Lifetime1 = -42 % ((param0 + 1) / 39);
    }

    private final int l(byte param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_L == 0) {
          return this.field_L;
        }
        if (param0 != 75) {
          return 119;
        }
        for (var2 = -1 + this.field_L; 0 < var2; var2--) {
          if (this.field_p.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        va var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, (byte) -128);
          this.k((byte) -101);
          if (this.field_y == 1) {
            if (this.field_l instanceof va) {
              var7 = (va) ((Object) this.field_l);
              var6 = var7.a((vg) (this), param1, param2, ob.field_g, 3, ck.field_c);
              if (var6 != -1) {
                if (this.field_M &&
                  this.field_T > var6 &&
                  var6 > this.field_Q) {
                  var6 = this.field_T;
                }
                this.field_L = var6;
              }
            }
            this.field_K = la.a(false);
          }
          if (param3 <= -127) {
            return;
          }
          this.g((byte) 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("kl.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        this.field_L = param0;
        if (!ck.field_f[81]) {
          this.field_Q = this.field_L;
        }
        if (param1 == -59) {
          return;
        }
        this.field_K = -78L;
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a(param0, param1, param2, (byte) 115, param4, param5, param6) &&
            this.field_l instanceof va) {
            var8_int = ((va) ((Object) this.field_l)).a((vg) (this), param5, param6, ob.field_g, 3, ck.field_c);
            if (var8_int != -1) {
              stackIn_5_1 = var8_int;
            } else {
              stackIn_5_1 = 0;
            }
            this.a(stackIn_5_1, (byte) -59);
            var8_long = la.a(false);
            stackIn_8_1 = !(250L <= -this.field_O + var8_long);
            this.field_M = stackIn_8_1;
            if (this.field_M) {
              this.field_Q = this.l((byte) 75);
              this.field_L = this.k(-124);
              if (this.field_L > 0 &&
                32 == this.field_p.charAt(this.field_L - 1)) {
                this.field_L = this.field_L - 1;
              }
              this.field_T = this.field_L;
            }
            this.field_O = var8_long;
            return true;
          }
          if (param3 > 113) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("kl.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(String param0, vj param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a(0)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          if (param2 != 27867) {
            field_R = (nh[]) null;
          }
          stackIn_6_0 = param3 + " - " + param1.d((byte) 95) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kl.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_R = null;
        int var1 = 94 % ((25 - param0) / 49);
    }

    private final void j(int param0) {
        if (param0 == 0) {
          if (this.field_u instanceof kd) {
            ((kd) (this.field_u)).a(this, (byte) 83);
          }
          return;
        }
        field_J = 68;
        if (this.field_u instanceof kd) {
          ((kd) (this.field_u)).a(this, (byte) 83);
        }
    }

    private final void i(byte param0) {
        try {
          vg var3 = null;
          String var2 = this.b(false);
          vg var3Lifetime1;
          if (var2.length() > 0) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.b(false))), (java.awt.datatransfer.ClipboardOwner) null);
            if (param0 <= 54) {
              var3 = (vg) null;
              this.a((vg) null, 116, 13, (byte) 24);
              return;
            }
            return;
          }
          if (param0 > 54) {
            return;
          }
          var3Lifetime1 = (vg) null;
          this.a((vg) null, 116, 13, (byte) 24);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String b(boolean param0) {
        int var3 = 0;
        int var2 = this.field_L <= this.field_Q ? this.field_L : this.field_Q;
        if (!param0) {
          var3 = this.field_Q >= this.field_L ? this.field_Q : this.field_L;
          return this.field_p.substring(var2, var3);
        }
        return (String) null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6 = 0L;
        long var6Lifetime1;
        if (param2 != -21) {
          return;
        }
        if (null == this.field_l) {
          return;
        }
        if (0 != param1) {
          return;
        }
        this.field_l.a(this.field_E, 102, (vg) (this), param3, param0);
        if (!(this.field_l instanceof va)) {
          return;
        }
        va var8 = (va) ((Object) this.field_l);
        if (this.field_Q != this.field_L) {
          var8.a(this.field_L, param3, -128, (vg) (this), param0, this.field_Q);
          var6 = la.a(false);
          if ((-this.field_K + var6) % 1000L < 500L) {
            var8.a(param3, param0, (vg) (this), this.field_L, (byte) -90);
          }
          return;
        }
        var6Lifetime1 = la.a(false);
        if ((-this.field_K + var6Lifetime1) % 1000L < 500L) {
          var8.a(param3, param0, (vg) (this), this.field_L, (byte) -90);
          return;
        }
    }

    private final void g(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            var3 = 108 / ((64 - param0) / 44);
            this.i(-122);
            this.a(5, var2);
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

    private final void h(int param0) {
        this.i((byte) 59);
        if (param0 != -1) {
          this.g((byte) 55);
          this.i(-45);
          return;
        }
        this.i(-45);
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (this.field_P != -1) {
          var3_int = this.field_P - this.field_p.length();
          if (var3_int >= 0) {
            return;
          }
          param1 = param1.substring(0, var3_int);
        }
        if (this.field_L == this.field_p.length()) {
          this.field_p = this.field_p + param1;
        } else {
          this.field_p = this.field_p.substring(0, this.field_L) + param1 + this.field_p.substring(this.field_L, this.field_p.length());
        }
        if (param0 != 5) {
          return;
        }
        try {
          this.field_L = this.field_L + param1.length();
          this.field_Q = this.field_L;
          this.m((byte) 122);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "kl.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = new nh[5];
    }
}
