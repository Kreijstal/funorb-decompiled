/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ig extends ph {
    private int field_P;
    private boolean field_G;
    static ej field_N;
    private int field_J;
    static String field_H;
    private int field_O;
    private long field_Q;
    static bd field_S;
    static bd field_R;
    static int field_L;
    private long field_M;
    private int field_K;
    private boolean field_I;

    private final void f(byte param0) {
        if (param0 < 47) {
          return;
        }
        this.l(-6200);
        this.b(true);
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_J == 0) {
          return this.field_J;
        }
        if (param0 != 10747) {
          this.k(-75);
        }
        for (var2 = -1 + this.field_J; var2 > 0; var2--) {
          if (32 != this.field_n.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        if (-1 != this.field_P) {
          var3_int = this.field_P - this.field_n.length();
          if (var3_int >= 0) {
            return;
          }
          param1 = param1.substring(0, var3_int);
        }
        if (param0 != 0) {
          return;
        }
        try {
          if (this.field_J == this.field_n.length()) {
            this.field_n = this.field_n + param1;
          } else {
            this.field_n = this.field_n.substring(0, this.field_J) + param1 + this.field_n.substring(this.field_J, this.field_n.length());
          }
          this.field_J = this.field_J + param1.length();
          this.field_K = this.field_J;
          this.e((byte) 125);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ig.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_n = param2;
          var4_int = param2.length();
          if (this.field_P != -1 &&
            this.field_P < var4_int) {
            this.field_n = this.field_n.substring(0, this.field_P);
          }
          dupTemp$2 = this.field_n.length();
          this.field_K = dupTemp$2;
          this.field_J = dupTemp$2;
          if (param0 < 18) {
            this.field_I = true;
          }
          if (!param1) {
            this.e((byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ig.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param2 + param3;
          var5 = 0;
          if (param0 != 28) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ig.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        mi var8 = null;
        long var6 = 0L;
        if (null != this.field_h &&
          0 == param3) {
          this.field_h.a(param0, param1, 15430, (ag) (this), this.field_D);
          if (this.field_h instanceof mi) {
            var8 = (mi) ((Object) this.field_h);
            if (this.field_J != this.field_K) {
              var8.a(param1, (byte) 41, this.field_K, (ag) (this), param0, this.field_J);
            }
            var6 = hn.a((byte) 80);
            if ((-this.field_M + var6) % 1000L < 500L) {
              var8.a(param0, (ag) (this), this.field_J, 0, param1);
            }
          }
        }
        if (param2 <= 42) {
          field_R = (bd) null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
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
          if (!(this.field_h instanceof mi)) {
            return false;
          }
          var8_int = ((mi) ((Object) this.field_h)).a(param1, j.field_c, param4 - 226, (ag) (this), param2, rb.field_m);
          if (var8_int == -1) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = var8_int;
          }
          this.a(stackIn_6_1, param4 ^ 12);
          var8_long = hn.a((byte) 80);
          stackIn_9_1 = !(250L <= -this.field_Q + var8_long);
          this.field_I = stackIn_9_1;
          if (this.field_I) {
            this.field_K = this.j(10747);
            this.field_J = this.a(true);
            if (0 < this.field_J &&
              this.field_n.charAt(this.field_J - 1) == 32) {
              this.field_J = this.field_J - 1;
            }
            this.field_O = this.field_J;
          }
          this.field_Q = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("ig.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param6).append(')').toString());
        }
    }

    private final String g(byte param0) {
        int var2 = this.field_J <= this.field_K ? this.field_J : this.field_K;
        int var4 = 102 % ((-29 - param0) / 57);
        int var3 = this.field_J > this.field_K ? this.field_J : this.field_K;
        return this.field_n.substring(var2, var3);
    }

    private final void l(int param0) {
        if (param0 != -6200) {
          return;
        }
        String var2 = this.g((byte) 77);
        if (!(0 >= var2.length())) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.g((byte) 93))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static boolean c(boolean param0) {
        String var2;
        boolean stackIn_7_0 = false;
        if (param0) {
          var2 = (String) null;
          ig.a(false, (java.net.URL) null, (String) null, 120, (String) null);
        }
        stackIn_7_0 = (fa.field_c >= 10) && (!md.field_k) && (!kl.b(50));
        return stackIn_7_0;
    }

    private final void k(int param0) {
        if (param0 != -1) {
          this.field_O = 45;
        }
        if (this.field_p instanceof cd) {
          ((cd) (this.field_p)).a(this, -97);
        }
    }

    private final void h(byte param0) {
        ce var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        mi var9;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (!this.field_G) {
          this.field_q = 0;
          this.field_o = 0;
          return;
        }
        if (!(this.field_h instanceof mi)) {
          return;
        }
        var9 = (mi) ((Object) this.field_h);
        if (param0 != -121) {
          return;
        }
        var3 = var9.a((ag) (this), 1);
        var4 = var3.a(3915);
        var5 = var9.a((ag) (this), (byte) 15);
        var6 = var9.a(true) >> 1;
        if (var4 < -var6 + var5) {
          this.field_q = 0;
          this.field_o = 0;
          return;
        }
        var7 = this.field_q + var3.b(this.field_J, 0);
        if (-var6 + var5 >= var7) {
          if (var6 > var7) {
            this.field_q = -var7 + var6 + this.field_q;
          }
        } else {
          this.field_q = -var7 - (-var5 + var6 - this.field_q);
        }
        if (0 >= this.field_q) {
          if (var6 - var5 > this.field_q) {
            this.field_q = var6 - var5;
          }
        } else {
          this.field_q = 0;
        }
        return;
    }

    final void o(int param0) {
        if (param0 > -121) {
          return;
        }
        this.field_J = 0;
        this.field_K = 0;
        this.field_n = "";
        this.e((byte) 125);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_K != this.field_J) {
          var2 = this.field_J > this.field_K ? this.field_K : this.field_J;
          var3 = this.field_J > this.field_K ? this.field_J : this.field_K;
          this.field_J = var2;
          this.field_K = var2;
          this.field_n = this.field_n.substring(0, var2) + this.field_n.substring(var3, this.field_n.length());
          this.e((byte) 125);
        }
        if (!param0) {
          ig.m(83);
        }
    }

    private final int a(boolean param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
          return 83;
        }
        var2 = this.field_n.length();
        if (var2 == this.field_J) {
          return this.field_J;
        }
        for (var3 = 1 + this.field_J; var3 < var2; var3++) {
          if (this.field_n.charAt(var3 - 1) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void n(int param0) {
        try {
          String var2 = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.b(true);
            this.a(0, var2);
          } catch (Exception exception) {
          }
          if (param0 <= 90) {
            this.n(-125);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1) {
        this.field_J = param0;
        if (param1 < 92) {
          this.field_G = false;
        }
        if (!qh.field_m[81]) {
          this.field_K = this.field_J;
        }
    }

    void e(byte param0) {
        if (param0 != 125) {
          return;
        }
        if (this.field_p instanceof cd) {
          ((cd) (this.field_p)).a(this, (byte) -125);
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        field_H = null;
        field_S = null;
        if (param0 <= 5) {
          field_L = 78;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_M = hn.a((byte) 80);
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.field_J != this.field_K) {
                this.b(true);
              }
              if (this.field_P == -1 ||
                !(this.field_n.length() >= this.field_P)) {
                if (this.field_J >= this.field_n.length()) {
                  this.field_n = this.field_n + param3;
                  dupTemp$0 = this.field_n.length();
                  this.field_J = dupTemp$0;
                  this.field_K = dupTemp$0;
                } else {
                  this.field_n = this.field_n.substring(0, this.field_J) + param3 + this.field_n.substring(this.field_J, this.field_n.length());
                  this.field_J = this.field_J + 1;
                  this.field_K = this.field_J;
                }
                this.e((byte) 125);
              }
              return true;
            }
            if (param2 != 85) {
              if (param2 != 101) {
                if (13 == param2) {
                  this.o(-122);
                  return true;
                }
                if (param2 != 96) {
                  if (97 == param2) {
                    if (this.field_J < this.field_n.length()) {
                      if (!qh.field_m[82]) {
                        stackIn_71_1 = this.field_J + 1;
                      } else {
                        stackIn_71_1 = this.a(true);
                      }
                      this.a(stackIn_71_1, 124);
                      return true;
                    }
                  } else {
                    if (param2 == 102) {
                      this.a(0, 115);
                      return true;
                    }
                    if (param2 == 103) {
                      this.a(this.field_n.length(), 98);
                      return true;
                    }
                    if (param2 == 84) {
                      this.k(-1);
                      return true;
                    }
                    if (qh.field_m[82] &&
                      param2 == 65) {
                      this.f((byte) 93);
                      return true;
                    }
                    if (qh.field_m[82] &&
                      param2 == 66) {
                      this.l(-6200);
                      return true;
                    }
                    if (qh.field_m[82] &&
                      67 == param2) {
                      this.n(param0 - 158);
                      return true;
                    }
                  }
                } else {
                  if (this.field_J > 0) {
                    if (!qh.field_m[82]) {
                      stackIn_43_1 = this.field_J - 1;
                    } else {
                      stackIn_43_1 = this.j(10747);
                    }
                    this.a(stackIn_43_1, 114);
                    return true;
                  }
                }
              } else {
                if (this.field_K != this.field_J) {
                  this.b(true);
                  return true;
                }
                if (this.field_J < this.field_n.length()) {
                  this.field_K = this.field_J + 1;
                  this.b(true);
                  return true;
                }
              }
            } else {
              if (this.field_K != this.field_J) {
                this.b(true);
                return true;
              }
              if (0 < this.field_J) {
                this.field_K = -1 + this.field_J;
                this.b(true);
                return true;
              }
            }
            if (param0 == 274) {
              return false;
            }
            this.field_Q = 124L;
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("ig.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static java.net.URL a(boolean param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_39_0 = null;
          java.net.URL stackIn_41_0 = null;
          RuntimeException stackIn_44_0 = null;
          StringBuilder stackIn_44_1 = null;
          String stackIn_45_2 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = HostileSpawn.field_I ? 1 : 0;
          try {
            var5 = param1.getFile();
            if (!param0) {
              field_S = (bd) null;
            }
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((0 <= var7_int) &&
                  (decompiledFrameRemainder0 = !(param3 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(var7_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 <= var7_int) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((0 <= var7_int) &&
                      (decompiledFrameRemainder0 = (param4 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param3 > 0) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param3));
                    }
                    if (param2 != null &&
                      param2.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param2);
                    }
                    if (param4 != null &&
                      0 < param4.length()) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param4);
                    }
                    if (var5.length() > var6) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                    } else {
                      discarded$8 = var7.append('/');
                    }
                    try {
                      stackIn_39_0 = new java.net.URL(param1, var7.toString());
                      return stackIn_39_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_41_0 = (java.net.URL) (param1);
                      return stackIn_41_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_44_0 = var5_ref;
            stackIn_44_1 = new StringBuilder().append("ig.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_45_2 = "null";
            } else {
              stackIn_45_2 = "{...}";
            }
            stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
            if (param2 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        mi var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.h((byte) -121);
          if (this.field_r == 1) {
            if (this.field_h instanceof mi) {
              var5 = (mi) ((Object) this.field_h);
              var6 = var5.a(param3, j.field_c, -115, (ag) (this), param1, rb.field_m);
              if (-1 != var6) {
                if (this.field_I &&
                  var6 < this.field_O &&
                  var6 > this.field_K) {
                  var6 = this.field_O;
                }
                this.field_J = var6;
              }
            }
            this.field_M = hn.a((byte) 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("ig.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ig(String param0, mh param1, int param2) {
        super(param0, param1);
        this.field_Q = 0L;
        this.field_I = false;
        this.field_O = -1;
        try {
          this.field_h = gf.field_e.field_j;
          this.field_P = param2;
          this.a((byte) 57, true, param0);
          this.field_G = true;
          this.field_M = hn.a((byte) 80);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = "Unpacking graphics";
        field_L = 0;
    }
}
