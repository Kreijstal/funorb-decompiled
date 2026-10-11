/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends gg {
    static String field_Z;
    static oj field_V;
    private int field_W;
    static int field_P;
    private int field_X;
    private int field_ab;
    static int field_O;
    private int field_T;
    static km field_R;
    private int field_U;
    private int field_S;
    static boolean[] field_Y;
    static int[] field_Q;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              if (param0 != -11670) {
                field_V = (oj) null;
              }
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (0 <= var3) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(og.a(param0 ^ 11669, param1, var5), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("dc.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_R = null;
        int var1 = -67 % ((-62 - param0) / 53);
        field_V = null;
        field_Z = null;
        field_Q = null;
        field_Y = null;
    }

    final static void f(byte param0) {
        wb var1 = null;
        int var3 = Virogrid.field_F ? 1 : 0;
        wb var1Lifetime1;
        try {
          sg.field_j = 0;
          mj.field_z = 0;
          wl.field_a = null;
          co.field_f.a(false);
          bd.field_c.a(false);
          var1 = oa.field_h.a(true);
          int var2 = 57 / ((35 - param0) / 36);
          while (var1 != null) {
            var1.c(100);
            var1 = oa.field_h.b(-1);
          }
          var1Lifetime1 = ie.field_a.a(true);
          while (var1Lifetime1 != null) {
            var1Lifetime1.c(91);
            var1Lifetime1 = ie.field_a.b(-1);
          }
          oa.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "dc.N(" + param0 + ')');
        }
    }

    dc(je param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_ab = 0;
        this.field_T = 0;
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Virogrid.field_F ? 1 : 0;
        df.a(6 + param2, param0 + 35, this.field_g - 12, this.field_m - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        if (param1 <= 8) {
          this.a((byte) -48);
        }
        while (var4 > var7) {
          if (var8 >= df.field_g &&
            var8 < df.field_h) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_g;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (20 - var7) + (-var10 + 20) * (20 - var10);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  df.field_d[param2 + df.field_e * var8 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (462 >= var14) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    df.field_d[var8 * df.field_e + param2 + var11] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            df.b(param2 + var10, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          df.b(param2, var8Lifetime1, 6, var9Lifetime1);
          df.b(this.field_g + (param2 - 6), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        ed.field_d.d(-90 + this.field_g + param2, param0 + 10);
        mb.a(-10 + this.field_g, (byte) -117, qm.field_Kb, param2 + 5, 35 + param0);
        mb.a(this.field_g, (byte) -117, qg.field_j, param2, param0 + this.field_m - 22);
        var4Lifetime2 = this.field_m - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          df.b(param2, var8Lifetime2, 6, var9Lifetime2);
          df.b(this.field_g + param2 - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean a(byte param0) {
        this.j(-4236);
        int var2 = -82 / ((50 - param0) / 33);
        return super.a((byte) 102);
    }

    void i(int param0) {
        if (param0 < 43) {
          field_Z = (String) null;
        }
    }

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (this.field_T > 0) {
          var2 = this.field_X;
          var3 = this.field_S;
          fieldTemp$0 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$0 < this.field_T) {
            var4 = this.field_ab * (2 * this.field_T - this.field_ab);
            var5 = this.field_T * this.field_T;
            var3 = this.field_W + (-this.field_W + this.field_S) * var4 / var5;
            var2 = this.field_U + (this.field_X - this.field_U) * var4 / var5;
          } else {
            this.field_T = 0;
            this.i(90);
          }
          this.c(var3, 109, var2);
        }
        if (param0 != 3) {
          java.applet.Applet var6 = (java.applet.Applet) null;
          dc.a(119, (java.applet.Applet) null);
        }
        return super.f(3);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 >= param2) {
          this.c(param0, 108, param3);
          return;
        }
        this.field_S = param0;
        this.field_W = this.field_m;
        this.field_U = this.field_g;
        this.field_ab = param1;
        this.field_X = param3;
        this.field_T = param2;
    }

    void j(int param0) {
        if (this.field_T <= 0) {
          return;
        }
        this.c(this.field_S, 124, this.field_X);
        if (param0 != -4236) {
          return;
        }
        this.field_T = 0;
        this.i(77);
    }

    static {
        field_Z = "Add friend";
        field_Y = new boolean[112];
        field_Q = new int[8192];
    }
}
