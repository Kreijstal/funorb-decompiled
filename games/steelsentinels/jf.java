/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jf extends oa {
    static String field_W;
    static int field_hb;
    static String field_cb;
    static int field_ib;
    private boolean field_jb;
    private boolean field_ab;
    static String field_eb;
    private int field_lb;
    private int field_X;
    private int field_fb;
    private int field_bb;
    static String field_db;
    static int field_Z;
    static RgbSprite field_kb;
    static String field_gb;
    private long field_V;
    private long field_Y;

    private final String j(int param0) {
        int var2 = this.field_fb <= this.field_bb ? this.field_fb : this.field_bb;
        if (param0 <= 9) {
          return (String) null;
        }
        int var3 = this.field_bb >= this.field_fb ? this.field_bb : this.field_fb;
        return this.field_y.substring(var2, var3);
    }

    private final void a(int param0, int param1) {
        this.field_fb = param0;
        if (!fc.field_e[81]) {
          this.field_bb = this.field_fb;
        }
        int var3 = 24 / ((param1 + 31) / 55);
    }

    private final void l(int param0) {
        if (param0 != 67) {
          return;
        }
        if (this.field_A instanceof fd) {
          ((fd) (this.field_A)).a(true, this);
        }
    }

    final static void n(int param0) {
        String var2 = (String) null;
        nc.a(kf.field_o, (String) null, -80);
        if (param0 != 0) {
          jf.d(true);
        }
    }

    private final void h(int param0) {
        this.f((byte) -93);
        if (param0 != 97) {
          field_db = (String) null;
        }
        this.h((byte) 121);
    }

    jf(String param0, tn param1, int param2) {
        super(param0, param1);
        this.field_X = -1;
        this.field_V = 0L;
        this.field_jb = false;
        try {
          this.field_lb = param2;
          this.field_p = ad.field_j.field_c;
          this.a(param0, 29597, true);
          this.field_ab = true;
          this.field_Y = mm.a(-122);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void d(boolean param0) {
        field_kb = null;
        field_gb = null;
        field_eb = null;
        field_cb = null;
        if (!param0) {
          jf.d(false);
        }
        field_W = null;
        field_db = null;
    }

    private final void g(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          Exception var2 = null;
          String var3 = null;
          try {
            var2_int = 24 / ((param0 + 70) / 45);
            var3 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.h((byte) 127);
            this.a(var3, true);
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

    final void a(int param0, byte param1, int param2, int param3) {
        eg var8 = null;
        long var6 = 0L;
        if (param1 >= -99) {
          this.l(-2);
        }
        if (this.field_p != null &&
          param3 == 0) {
          this.field_p.a(param2, (lh) (this), (byte) -30, this.field_K, param0);
          if (this.field_p instanceof eg) {
            var8 = (eg) ((Object) this.field_p);
            if (this.field_bb != this.field_fb) {
              var8.a(param0, param2, false, this.field_bb, (lh) (this), this.field_fb);
            }
            var6 = mm.a(-127);
            if ((var6 - this.field_Y) % 1000L < 500L) {
              var8.a((lh) (this), this.field_fb, param0, param2, (byte) 80);
            }
          }
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (-1 != this.field_lb) {
            var3_int = this.field_lb - this.field_y.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_fb == this.field_y.length()) {
            this.field_y = this.field_y + param0;
          } else {
            this.field_y = this.field_y.substring(0, this.field_fb) + param0 + this.field_y.substring(this.field_fb, this.field_y.length());
          }
          this.field_fb = this.field_fb + param0.length();
          if (!param1) {
            this.a(-72, (byte) -73, 73, 72);
          }
          this.field_bb = this.field_fb;
          this.k(110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("jf.HB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        int var6 = 0;
        eg var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, 88, param2, param3);
          this.e(true);
          if (this.field_w == 1) {
            if (this.field_p instanceof eg) {
              var7 = (eg) ((Object) this.field_p);
              var6 = var7.a(param0, oh.field_f, (lh) (this), (byte) 115, param3, pi.field_c);
              if (var6 != -1) {
                if (this.field_jb &&
                  this.field_X > var6 &&
                  var6 > this.field_bb) {
                  var6 = this.field_X;
                }
                this.field_fb = var6;
              }
            }
            this.field_Y = mm.a(42);
          }
          if (param1 < 56) {
            this.g((byte) -9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("jf.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void f(byte param0) {
        if (param0 >= -74) {
          jf.d(true);
        }
        String var2 = this.j(49);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(62))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static void c(boolean param0) {
        eb.a(0, jk.field_h, an.field_a, bd.field_f, od.field_g);
        if (!param0) {
          field_kb = (RgbSprite) null;
        }
    }

    private final int g(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        var2 = this.field_y.length();
        if (this.field_fb == var2) {
          return this.field_fb;
        }
        if (param0 >= -118) {
          return 71;
        }
        for (var3 = this.field_fb + 1; var3 < var2; var3++) {
          if (this.field_y.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        int dupTemp$0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_59_1 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Y = mm.a(-59);
          if (60 != param2 &&
            62 != param2) {
            if (param0 != 30373) {
              return true;
            }
            if (32 <= param2 &&
              126 >= param2) {
              if (this.field_bb != this.field_fb) {
                this.h((byte) 117);
              }
              if (this.field_lb == -1 ||
                !(this.field_y.length() >= this.field_lb)) {
                if (this.field_fb < this.field_y.length()) {
                  this.field_y = this.field_y.substring(0, this.field_fb) + param2 + this.field_y.substring(this.field_fb, this.field_y.length());
                  this.field_fb = this.field_fb + 1;
                  this.field_bb = this.field_fb;
                } else {
                  this.field_y = this.field_y + param2;
                  dupTemp$0 = this.field_y.length();
                  this.field_fb = dupTemp$0;
                  this.field_bb = dupTemp$0;
                }
                this.k(-119);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.field_fb != this.field_bb) {
                this.h((byte) 125);
                return true;
              }
              if (0 < this.field_fb) {
                this.field_bb = -1 + this.field_fb;
                this.h((byte) 127);
                return true;
              }
            } else {
              if (param1 == 101) {
                if (this.field_fb != this.field_bb) {
                  this.h((byte) 114);
                  return true;
                }
                if (this.field_fb >= this.field_y.length()) {
                  return false;
                }
                this.field_bb = this.field_fb + 1;
                this.h((byte) 110);
                return true;
              }
              if (param1 == 13) {
                this.i(-8521);
                return true;
              }
              if (param1 != 96) {
                if (97 == param1) {
                  if (this.field_fb < this.field_y.length()) {
                    if (fc.field_e[82]) {
                      stackIn_59_1 = this.g(param0 ^ -30419);
                    } else {
                      stackIn_59_1 = 1 + this.field_fb;
                    }
                    this.a(stackIn_59_1, -105);
                    return true;
                  }
                } else {
                  if (param1 == 102) {
                    this.a(0, param0 - 30327);
                    return true;
                  }
                  if (param1 == 103) {
                    this.a(this.field_y.length(), 52);
                    return true;
                  }
                  if (param1 == 84) {
                    this.l(param0 - 30306);
                    return true;
                  }
                  if (fc.field_e[82] &&
                    param1 == 65) {
                    this.h(97);
                    return true;
                  }
                  if (fc.field_e[82] &&
                    param1 == 66) {
                    this.f((byte) -113);
                    return true;
                  }
                  if (fc.field_e[82] &&
                    67 == param1) {
                    this.g((byte) 107);
                    return true;
                  }
                }
              } else {
                if (this.field_fb > 0) {
                  if (!fc.field_e[82]) {
                    stackIn_29_1 = -1 + this.field_fb;
                  } else {
                    stackIn_29_1 = this.m(0);
                  }
                  this.a(stackIn_29_1, -95);
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
          stackIn_84_0 = var5;
          stackIn_84_1 = new StringBuilder().append("jf.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 < 109) {
          return;
        }
        if (this.field_fb != this.field_bb) {
          var2 = this.field_fb <= this.field_bb ? this.field_fb : this.field_bb;
          var3 = this.field_fb <= this.field_bb ? this.field_bb : this.field_fb;
          this.field_bb = var2;
          this.field_fb = var2;
          this.field_y = this.field_y.substring(0, var2) + this.field_y.substring(var3, this.field_y.length());
          this.k(-125);
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param0 == this.field_fb) {
          return this.field_fb;
        }
        for (var2 = -1 + this.field_fb; var2 > 0; var2--) {
          if (this.field_y.charAt(var2 - 1) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    void k(int param0) {
        int var2 = -78 / ((-37 - param0) / 43);
        if (this.field_A instanceof fd) {
          ((fd) (this.field_A)).a(this, (byte) 89);
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 29597) {
            this.field_fb = -23;
          }
          if (param0 == null) {
            param0 = "";
          }
          this.field_y = param0;
          var4_int = param0.length();
          if (this.field_lb != -1 &&
            this.field_lb < var4_int) {
            this.field_y = this.field_y.substring(0, this.field_lb);
          }
          dupTemp$1 = this.field_y.length();
          this.field_bb = dupTemp$1;
          this.field_fb = dupTemp$1;
          if (!param2) {
            this.k(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("jf.EB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
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
          if (!(this.field_p instanceof eg)) {
            return false;
          }
          var8_int = ((eg) ((Object) this.field_p)).a(param2, oh.field_f, (lh) (this), (byte) 115, param4, pi.field_c);
          if (var8_int != -1) {
            stackIn_6_1 = var8_int;
          } else {
            stackIn_6_1 = 0;
          }
          this.a(stackIn_6_1, 62);
          var8_long = mm.a(107);
          stackIn_9_1 = !(-this.field_V + var8_long >= 250L);
          this.field_jb = stackIn_9_1;
          if (this.field_jb) {
            this.field_bb = this.m(0);
            this.field_fb = this.g(-122);
            if (0 < this.field_fb &&
              this.field_y.charAt(-1 + this.field_fb) == 32) {
              this.field_fb = this.field_fb - 1;
            }
            this.field_X = this.field_fb;
          }
          this.field_V = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("jf.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void i(int param0) {
        if (param0 != -8521) {
          return;
        }
        this.field_bb = 0;
        this.field_fb = 0;
        this.field_y = "";
        this.k(-127);
    }

    private final void e(boolean param0) {
        da var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        eg var9;
        var8 = SteelSentinels.obfuscationControl;
        if (!this.field_ab) {
          this.field_u = 0;
          this.field_F = 0;
          return;
        }
        if (!(this.field_p instanceof eg)) {
          return;
        }
        var9 = (eg) ((Object) this.field_p);
        var3 = var9.b(-1, (lh) (this));
        var4 = var3.b((byte) -100);
        var5 = var9.a(5546, (lh) (this));
        var6 = var9.a(118) >> 1;
        if (-var6 + var5 > var4) {
          this.field_u = 0;
          this.field_F = 0;
          return;
        }
        var7 = this.field_u + var3.a(1, this.field_fb);
        if (!param0) {
          return;
        }
        if (-var6 + var5 < var7) {
          this.field_u = this.field_u - var6 + (var5 - var7);
        } else {
          if (var6 > var7) {
            this.field_u = -var7 - (-var6 - this.field_u);
          }
        }
        if (this.field_u <= 0) {
          if (this.field_u < -var5 + var6) {
            this.field_u = var6 - var5;
          }
        } else {
          this.field_u = 0;
        }
        return;
    }

    static {
        field_W = "Wave: <%0>";
        field_hb = 64;
        field_eb = "F";
        field_cb = "Close";
        field_db = "You can spectate this game";
        field_Z = 2;
        field_gb = "The game options are not all set.";
    }
}
