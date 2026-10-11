/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bm extends mi {
    static Object field_C;
    private int field_H;
    private int field_A;
    private long field_E;
    private boolean field_G;
    static ia field_x;
    private int field_B;
    private boolean field_y;
    private int field_D;
    private long field_F;
    static rk field_I;
    static int field_z;
    static int[] field_w;

    final boolean a(int param0, int param1, char param2, ea param3) {
        int dupTemp$0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_58_1 = 0;
        int stackIn_59_2 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          var5_int = 127 / ((param0 + 53) / 33);
          this.field_F = kh.a(-97);
          if (60 != param2 &&
            param2 != 62) {
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_B != this.field_D) {
                this.a((byte) -127);
              }
              if (this.field_H == -1 ||
                !(this.field_f.length() >= this.field_H)) {
                if (this.field_B >= this.field_f.length()) {
                  this.field_f = this.field_f + param2;
                  dupTemp$0 = this.field_f.length();
                  this.field_B = dupTemp$0;
                  this.field_D = dupTemp$0;
                } else {
                  this.field_f = this.field_f.substring(0, this.field_B) + param2 + this.field_f.substring(this.field_B, this.field_f.length());
                  this.field_B = this.field_B + 1;
                  this.field_D = this.field_B;
                }
                this.g((byte) -75);
              }
              return true;
            }
            if (param1 != 85) {
              if (param1 == 101) {
                if (this.field_D != this.field_B) {
                  this.a((byte) -87);
                  return true;
                }
                if (this.field_B >= this.field_f.length()) {
                  return false;
                }
                this.field_D = 1 + this.field_B;
                this.a((byte) 43);
                return true;
              }
              if (param1 == 13) {
                this.f((byte) -2);
                return true;
              }
              if (param1 == 96) {
                if (this.field_B > 0) {
                  stackIn_58_1 = 120;
                  if (lp.field_a[82]) {
                    stackIn_59_2 = this.e((byte) 76);
                  } else {
                    stackIn_59_2 = -1 + this.field_B;
                  }
                  this.a((byte) stackIn_58_1, stackIn_59_2);
                  return true;
                }
              } else {
                if (param1 == 97) {
                  if (this.field_B < this.field_f.length()) {
                    stackIn_52_1 = 53;
                    if (!lp.field_a[82]) {
                      stackIn_53_2 = 1 + this.field_B;
                    } else {
                      stackIn_53_2 = this.k(0);
                    }
                    this.a((byte) stackIn_52_1, stackIn_53_2);
                    return true;
                  }
                } else {
                  if (102 == param1) {
                    this.a((byte) 69, 0);
                    return true;
                  }
                  if (param1 == 103) {
                    this.a((byte) 59, this.field_f.length());
                    return true;
                  }
                  if (param1 == 84) {
                    this.j(-1);
                    return true;
                  }
                  if (lp.field_a[82] &&
                    param1 == 65) {
                    this.b(true);
                    return true;
                  }
                  if (lp.field_a[82] &&
                    param1 == 66) {
                    this.i(-116);
                    return true;
                  }
                  if (lp.field_a[82] &&
                    67 == param1) {
                    this.l(-1);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_D != this.field_B) {
                this.a((byte) -118);
                return true;
              }
              if (this.field_B > 0) {
                this.field_D = this.field_B - 1;
                this.a((byte) 14);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_78_0 = var5;
          stackIn_78_1 = new StringBuilder().append("bm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        try {
          String var2 = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.a((byte) -81);
            this.a(var2, (byte) 126);
          } catch (Exception exception) {
          }
          if (param0 == -1) {
            return;
          }
          field_I = (rk) null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet m(int param0) {
        if (param0 < 106) {
          al var2 = (al) null;
          bm.a((byte) -67, (al) null);
          if (hu.field_a != null) {
            return hu.field_a;
          }
          return (java.applet.Applet) ((Object) gh.field_f);
        }
        if (hu.field_a != null) {
          return hu.field_a;
        }
        return (java.applet.Applet) ((Object) gh.field_f);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_B == 0) {
          return this.field_B;
        }
        var3 = 85 % ((param0 - 13) / 39);
        for (var2 = -1 + this.field_B; var2 > 0; var2--) {
          if (this.field_f.charAt(-1 + var2) == 32) {
            return var2;
          }
        }
        return var2;
    }

    final void a(int param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_f = param1;
          if (param0 != -20975) {
            return;
          }
          var4_int = param1.length();
          if (this.field_H != -1 &&
            this.field_H < var4_int) {
            this.field_f = this.field_f.substring(0, this.field_H);
          }
          dupTemp$1 = this.field_f.length();
          this.field_D = dupTemp$1;
          this.field_B = dupTemp$1;
          if (param2) {
            return;
          }
          this.g((byte) -75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("bm.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static rh a(byte param0, al param1) {
        RuntimeException var2 = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -70) {
            stackIn_4_0 = am.a(param1, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (rh) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bm.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$6 = 0;
        int discarded$5 = 0;
        int discarded$4 = 0;
        int discarded$1 = 0;
        int discarded$0 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        long var6;
        et var8;
        long var6Lifetime1;
        if (null == this.field_e) {
          if (param0 > 64) {
            return;
          }
          discarded$6 = this.k(125);
          return;
        }
        if (param1 != 0) {
          if (param0 > 64) {
            return;
          }
          discarded$5 = this.k(125);
          return;
        }
        this.field_e.a(this.field_u, -7592, param3, (ea) (this), param2);
        if (!(this.field_e instanceof et)) {
          if (param0 > 64) {
            return;
          }
          discarded$4 = this.k(125);
          return;
        }
        var8 = (et) ((Object) this.field_e);
        if (this.field_D == this.field_B) {
          var6 = kh.a(-62);
          if ((-this.field_F + var6) % 1000L >= 500L) {
            if (param0 > 64) {
              return;
            }
            discarded$1 = this.k(125);
            return;
          }
          var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
          if (param0 > 64) {
            return;
          }
          discarded$0 = this.k(125);
          return;
        }
        var8.a(this.field_D, this.field_B, param2, param3, (ea) (this), (byte) -123);
        var6Lifetime1 = kh.a(-62);
        if ((-this.field_F + var6Lifetime1) % 1000L >= 500L) {
          if (param0 > 64) {
            return;
          }
          discarded$2 = this.k(125);
          return;
        }
        var8.a((byte) 71, param3, param2, this.field_B, (ea) (this));
        if (param0 > 64) {
          return;
        }
        discarded$3 = this.k(125);
        return;
    }

    void g(byte param0) {
        if (this.field_o instanceof dr) {
          ((dr) (this.field_o)).a(this, -6525);
        }
        if (param0 == -75) {
          return;
        }
        field_I = (rk) null;
    }

    bm(String param0, no param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_A = -1;
        this.field_G = false;
        try {
          this.field_H = param2;
          this.field_e = ag.field_n.field_n;
          this.a(-20975, param0, true);
          this.field_y = true;
          this.field_F = kh.a(-88);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        this.i(-120);
        if (param0) {
          this.a((byte) -85);
          return;
        }
        ea var3 = (ea) null;
        this.a(9, 25, 35, 10, 41, (ea) null, -23);
        this.a((byte) -85);
    }

    private final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -51 / ((-40 - param0) / 32);
        if (this.field_B != this.field_D) {
          var3 = this.field_B <= this.field_D ? this.field_B : this.field_D;
          var4 = this.field_B > this.field_D ? this.field_B : this.field_D;
          this.field_D = var3;
          this.field_B = var3;
          this.field_f = this.field_f.substring(0, var3) + this.field_f.substring(var4, this.field_f.length());
          this.g((byte) -75);
        }
    }

    private final void h(int param0) {
        pp var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        et var9;
        var8 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_y) {
          this.field_j = 0;
          this.field_l = 0;
          return;
        }
        if (!(this.field_e instanceof et)) {
          return;
        }
        var9 = (et) ((Object) this.field_e);
        var3 = var9.a((byte) 96, (ea) (this));
        var4 = var3.a((byte) 24);
        var5 = var9.b((ea) (this), -64);
        var6 = var9.a(-4) >> 1;
        if (var4 < -var6 + var5) {
          this.field_l = 0;
          this.field_j = 0;
          return;
        }
        var7 = this.field_j + var3.b(this.field_B, -127);
        if (var5 - var6 < var7) {
          this.field_j = -var7 - var6 + (var5 + this.field_j);
        } else {
          if (var6 > var7) {
            this.field_j = this.field_j + var6 - var7;
          }
        }
        if (param0 < this.field_j) {
          this.field_j = 0;
          return;
        }
        if (-var5 + var6 <= this.field_j) {
          return;
        }
        this.field_j = -var5 + var6;
        return;
    }

    private final void a(byte param0, int param1) {
        this.field_B = param1;
        if (param0 > 30) {
          if (!lp.field_a[81]) {
            this.field_D = this.field_B;
          }
          return;
        }
        this.field_F = 35L;
        if (!lp.field_a[81]) {
          this.field_D = this.field_B;
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        et var7 = null;
        int var6 = 0;
        try {
          super.a((byte) 126, param1, param2, param3);
          if (param0 <= 13) {
            this.field_B = -1;
          }
          this.h(0);
          if (this.field_i == 1) {
            if (this.field_e instanceof et) {
              var7 = (et) ((Object) this.field_e);
              var6 = var7.a((ea) (this), param3, param2, cf.field_g, 3, ic.field_b);
              if (-1 != var6) {
                if (this.field_G && var6 < this.field_A &&
                  var6 > this.field_D) {
                  var6 = this.field_A;
                }
                this.field_B = var6;
              }
            }
            this.field_F = kh.a(-60);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bm.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 < -33) {
          field_x = null;
          field_I = null;
          field_C = null;
          field_w = null;
          return;
        }
        al var2 = (al) null;
        bm.a((byte) -72, (al) null);
        field_x = null;
        field_I = null;
        field_C = null;
        field_w = null;
    }

    private final void j(int param0) {
        if (param0 == -1) {
          if (this.field_o instanceof dr) {
            ((dr) (this.field_o)).b(this, -40);
          }
          return;
        }
        this.field_A = 14;
        if (this.field_o instanceof dr) {
          ((dr) (this.field_o)).b(this, -40);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = this.field_f.length();
        if (param0 != 0) {
          return -109;
        }
        if (var2 == this.field_B) {
          return this.field_B;
        }
        for (var3 = 1 + this.field_B; var2 > var3; var3++) {
          if (this.field_f.charAt(-1 + var3) == 32) {
            return var3;
          }
        }
        return var3;
    }

    final void f(byte param0) {
        this.field_f = "";
        this.field_B = 0;
        this.field_D = 0;
        this.g((byte) -75);
        if (param0 != -2) {
          this.field_y = false;
        }
    }

    private final void i(int param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (param0 > -98) {
            this.field_D = -50;
            var2 = this.h((byte) 97);
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          var2Lifetime1 = this.h((byte) 97);
          if (var2Lifetime1.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 109))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (this.field_H != -1) {
          var3_int = this.field_H - this.field_f.length();
          if (var3_int >= 0) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_B == this.field_f.length()) {
          this.field_f = this.field_f + param0;
        } else {
          this.field_f = this.field_f.substring(0, this.field_B) + param0 + this.field_f.substring(this.field_B, this.field_f.length());
        }
        if (param1 <= 120) {
          return;
        }
        try {
          this.field_B = this.field_B + param0.length();
          this.field_D = this.field_B;
          this.g((byte) -75);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "bm.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String h(byte param0) {
        int var3 = 0;
        int var2 = this.field_D < this.field_B ? this.field_D : this.field_B;
        int var3Lifetime1;
        if (param0 > 80) {
          var3 = this.field_D < this.field_B ? this.field_B : this.field_D;
          return this.field_f.substring(var2, var3);
        }
        this.a((byte) 107, -41, -122, -11);
        var3Lifetime1 = this.field_D < this.field_B ? this.field_B : this.field_D;
        return this.field_f.substring(var2, var3Lifetime1);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_e instanceof et)) {
            return false;
          }
          var8_int = ((et) ((Object) this.field_e)).a((ea) (this), param1, param4, cf.field_g, param0 - 31, ic.field_b);
          stackIn_6_1 = 82;
          if (var8_int == -1) {
            stackIn_7_2 = 0;
          } else {
            stackIn_7_2 = var8_int;
          }
          this.a((byte) stackIn_6_1, stackIn_7_2);
          var8_long = kh.a(param0 - 125);
          stackIn_10_1 = !(var8_long - this.field_E >= 250L);
          this.field_G = stackIn_10_1;
          if (this.field_G) {
            this.field_D = this.e((byte) 97);
            this.field_B = this.k(0);
            if (this.field_B > 0 &&
              this.field_f.charAt(this.field_B - 1) == 32) {
              this.field_B = this.field_B - 1;
            }
            this.field_A = this.field_B;
          }
          this.field_E = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("bm.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_x = new ia();
        field_w = new int[4];
    }
}
