/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends qa {
    char[] field_D;
    int[] field_x;
    boolean field_y;
    char[] field_r;
    static String field_v;
    static String field_C;
    static String field_z;
    static String field_w;
    static String field_u;
    int[] field_B;
    static String field_t;
    static String field_q;
    String field_s;
    static String field_A;

    final static String e(int param0) {
        String var1 = "";
        if (param0 != -24093) {
          return (String) null;
        }
        if (null != b.field_c) {
          var1 = b.field_c.h(6728);
        }
        if (var1.length() == 0) {
          var1 = ki.a((byte) -127);
        }
        if (var1.length() == 0) {
          var1 = hg.field_vb;
        }
        return var1;
    }

    private final void a(int param0, k param1, int param2) {
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 >= -9) {
            ob.c((byte) 74);
          }
          if (1 != param2) {
            if (param2 == 2) {
              var4_int = param1.g(31365);
              this.field_r = new char[var4_int];
              this.field_x = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_x[var5] = param1.d((byte) 69);
                var6 = param1.d(-249699580);
                stackIn_20_0 = this.field_r;
                stackIn_20_1 = var5;
                if (var6 != 0) {
                  stackIn_21_2 = ob.a((byte) var6, -1);
                } else {
                  stackIn_21_2 = 0;
                }
                stackIn_20_0[stackIn_20_1] = (char) stackIn_21_2;
              }
            } else {
              if (param2 != 3) {
                if (param2 != 4) {
                  return;
                }
                this.field_y = true;
                return;
              }
              var4_int = param1.g(31365);
              this.field_D = new char[var4_int];
              this.field_B = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_B[var5] = param1.d((byte) 69);
                var6 = param1.d(-249699580);
                stackIn_14_0 = this.field_D;
                stackIn_14_1 = var5;
                if (0 != var6) {
                  stackIn_15_2 = ob.a((byte) var6, -1);
                } else {
                  stackIn_15_2 = 0;
                }
                stackIn_14_0[stackIn_14_1] = (char) stackIn_15_2;
              }
            }
          } else {
            this.field_s = param1.f((byte) -93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ob.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final void e(byte param0) {
        int var2;
        int var3;
        int var4;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_B) {
          if (this.field_x != null) {
            var4 = 0;
            var2 = var4;
            while (this.field_x.length > var4) {
              this.field_x[var4] = cr.b(this.field_x[var4], 32768);
              var4++;
            }
            if (param0 != -72) {
              ob.a((byte) -85, -72);
            }
            return;
          }
        } else {
          for (var2 = 0; this.field_B.length > var2; var2++) {
            this.field_B[var2] = cr.b(this.field_B[var2], 32768);
          }
          if (this.field_x != null) {
            var4 = 0;
            var2 = var4;
            while (this.field_x.length > var4) {
              this.field_x[var4] = cr.b(this.field_x[var4], 32768);
              var4++;
            }
          }
        }
        if (param0 == -72) {
          return;
        }
        ob.a((byte) -85, -72);
    }

    final static boolean d(byte param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        long var1Lifetime1;
        long var3Lifetime1;
        int var5Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 3) {
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if (var3 > 30000L) {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
          var5 = 3000;
          if (vd.field_c >= 7) {
            var5 = 12000;
          } else {
            if (vd.field_c >= 5) {
              var5 = 9000;
            } else {
              if (vd.field_c >= 3) {
                var5 = 6000;
              }
            }
          }
          if ((long)var5 >= var3) {
            return false;
          }
          wn.field_r = var1;
          vd.field_c = vd.field_c + 1;
          return true;
        }
        ob.e(52);
        var1Lifetime1 = bl.a((byte) 55);
        var3Lifetime1 = -wn.field_r + var1Lifetime1;
        if (var3Lifetime1 > 30000L) {
          vd.field_c = 0;
          wn.field_r = var1Lifetime1;
          return true;
        }
        var5Lifetime1 = 3000;
        if (vd.field_c >= 7) {
          var5Lifetime1 = 12000;
        } else {
          if (vd.field_c >= 5) {
            var5Lifetime1 = 9000;
          } else {
            if (vd.field_c >= 3) {
              var5Lifetime1 = 6000;
            }
          }
        }
        if ((long)var5Lifetime1 >= var3Lifetime1) {
          return false;
        }
        wn.field_r = var1Lifetime1;
        vd.field_c = vd.field_c + 1;
        return true;
    }

    final void a(int param0, k param1) {
        int var3_int = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3_intLifetime1;
        try {
          while (true) {
            var3_int = param1.g(31365);
            if (0 == var3_int) {
              break;
            }
            this.a(-56, param1, var3_int);
          }
          var3_intLifetime1 = -23 / ((param0 - 19) / 42);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ob.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (param1 == ~var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
          if (var2 >= 160) {
            return (char)var2;
          }
          var3 = vg.field_s[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        field_t = null;
        if (param0 != -52) {
          ob.c((byte) -29);
          field_q = null;
          field_z = null;
          field_w = null;
          field_u = null;
          field_v = null;
          return;
        }
        field_q = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final static void a(cj param0, int param1) {
        cj var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4 = (cj) (param0.field_Cb.c(87));
          if (param1 < 30) {
            ob.e(34);
          }
          while (var4 != null) {
            var4.field_mb = 0;
            var4.field_z = 0;
            var4.field_I = 0;
            var4.field_Q = 0;
            var4 = (cj) (param0.field_Cb.b(6));
          }
          param0.field_I = 0;
          param0.field_Q = 0;
          param0.field_z = 0;
          param0.field_mb = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ob.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ob() {
        this.field_y = false;
    }

    static {
        field_v = "Your rating is <%0>";
        field_z = "Please enter your age in years";
        field_u = "Teleport";
        field_t = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_C = "??? points ";
        field_w = "to over <%0> great games";
        field_q = "x<%0>";
        field_A = "(Click or press 'SPACE' to close)";
    }
}
