/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uqa extends osa {
    static String field_y;
    private int field_u;
    static String field_t;
    static String field_A;
    static String field_v;
    static char field_w;
    static int[] field_x;
    static String field_z;
    private boolean field_s;

    final void b(int param0) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var2 = this.f(10);
        int var3 = this.g((byte) 30);
        int var4 = this.field_n.s(25745) - var2 >> 16;
        int var5 = this.field_n.e(false) - var3 >> 16;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var8Lifetime3;
        int var9Lifetime3;
        int var10Lifetime3;
        int var11Lifetime3;
        int var12Lifetime3;
        if (param0 != 1) {
          field_z = (String) null;
          var6 = this.field_u >> 16;
          var7 = var5 * var5 + var4 * var4;
          if (this.field_s) {
            if (var4 == 0 &&
              var5 == 0) {
              var5 = 1;
            }
            var8 = qva.a((byte) -41, var5 << 16, var4 << 16);
            var9 = hua.a((byte) 110, var8 >> 2);
            var10 = bua.a(0, var8 >> 2);
            var11 = gqa.a(var9, (byte) 24, this.field_u >> 8) << 8;
            var12 = gqa.a(var10, (byte) 24, this.field_u >> 8) << 8;
            this.field_n.a((byte) -105, var2 + (var11 - this.field_n.s(25745)), -this.field_n.e(false) + (var3 + var12));
            return;
          }
          if (var7 <= var6 * var6) {
            return;
          }
          if (var4 == 0 &&
            var5 == 0) {
            var5 = 1;
          }
          var8Lifetime3 = qva.a((byte) -41, var5 << 16, var4 << 16);
          var9Lifetime3 = hua.a((byte) 110, var8Lifetime3 >> 2);
          var10Lifetime3 = bua.a(0, var8Lifetime3 >> 2);
          var11Lifetime3 = gqa.a(var9Lifetime3, (byte) 24, this.field_u >> 8) << 8;
          var12Lifetime3 = gqa.a(var10Lifetime3, (byte) 24, this.field_u >> 8) << 8;
          this.field_n.a((byte) -105, var2 + (var11Lifetime3 - this.field_n.s(25745)), -this.field_n.e(false) + (var3 + var12Lifetime3));
          return;
        }
        var6Lifetime1 = this.field_u >> 16;
        var7Lifetime1 = var5 * var5 + var4 * var4;
        if (this.field_s) {
          if (var4 == 0 &&
            var5 == 0) {
            var5 = 1;
          }
          var8Lifetime1 = qva.a((byte) -41, var5 << 16, var4 << 16);
          var9Lifetime1 = hua.a((byte) 110, var8Lifetime1 >> 2);
          var10Lifetime1 = bua.a(0, var8Lifetime1 >> 2);
          var11Lifetime1 = gqa.a(var9Lifetime1, (byte) 24, this.field_u >> 8) << 8;
          var12Lifetime1 = gqa.a(var10Lifetime1, (byte) 24, this.field_u >> 8) << 8;
          this.field_n.a((byte) -105, var2 + (var11Lifetime1 - this.field_n.s(25745)), -this.field_n.e(false) + (var3 + var12Lifetime1));
          return;
        }
        if (var7Lifetime1 <= var6Lifetime1 * var6Lifetime1) {
          return;
        }
        if (var4 == 0 &&
          var5 == 0) {
          var5 = 1;
        }
        var8Lifetime2 = qva.a((byte) -41, var5 << 16, var4 << 16);
        var9Lifetime2 = hua.a((byte) 110, var8Lifetime2 >> 2);
        var10Lifetime2 = bua.a(0, var8Lifetime2 >> 2);
        var11Lifetime2 = gqa.a(var9Lifetime2, (byte) 24, this.field_u >> 8) << 8;
        var12Lifetime2 = gqa.a(var10Lifetime2, (byte) 24, this.field_u >> 8) << 8;
        this.field_n.a((byte) -105, var2 + (var11Lifetime2 - this.field_n.s(25745)), -this.field_n.e(false) + (var3 + var12Lifetime2));
    }

    final void b(byte param0) {
        int var2 = -27 / ((param0 + 69) / 42);
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 30, param1, this.field_u);
        if (param0 != 0) {
          this.b(-37);
          return param1;
        }
        return param1;
    }

    final void a(int param0, fsa param1) {
        try {
          super.a(114, param1);
          if (param0 < 35) {
            fsa var4 = (fsa) null;
            this.a(73, (fsa) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uqa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    uqa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_u = param1.b((byte) 44, 10) << 16;
          this.field_s = param1.b((byte) 44, 1) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
          this.c(51);
          return 8;
        }
        return 8;
    }

    final void a(kh param0, byte param1) {
        try {
          super.a(param0, (byte) -88);
          if (param1 > -78) {
            this.c(-25);
          }
          param0.a((byte) -5, this.field_u >> 16, 10);
          param0.a((byte) 78, !this.field_s ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uqa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(byte param0) {
        field_x = null;
        if (param0 >= -74) {
          return;
        }
        field_y = null;
        field_t = null;
        field_z = null;
        field_v = null;
        field_A = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        if (0 != param0) {
          var3 = -38 / ((-50 - param2) / 59);
          var4 = ua.a(param0, -108);
          var5 = ua.a(param1, 45);
          if (var5 * 2 < var4) {
            if (param0 > 0) {
              return 2;
            }
            return 6;
          }
          if (2 * var4 < var5) {
            if (param1 <= 0) {
              return 0;
            }
            return 4;
          }
          if (param0 < 0) {
            if (param1 >= 0) {
              return 5;
            }
            return 7;
          }
          if (param1 >= 0) {
            return 3;
          }
          return 1;
        }
        if (param1 == 0) {
          return 0;
        }
        var3Lifetime1 = -38 / ((-50 - param2) / 59);
        var4Lifetime1 = ua.a(param0, -108);
        var5Lifetime1 = ua.a(param1, 45);
        if (var5Lifetime1 * 2 < var4Lifetime1) {
          if (param0 <= 0) {
            return 6;
          }
          return 2;
        }
        if (2 * var4Lifetime1 < var5Lifetime1) {
          if (param1 <= 0) {
            return 0;
          }
          return 4;
        }
        if (param0 < 0) {
          if (param1 >= 0) {
            return 5;
          }
          return 7;
        }
        if (param1 >= 0) {
          return 3;
        }
        return 1;
    }

    static {
        field_t = "Pressure pads";
        field_v = "Locks and keys";
        field_y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_w = '"';
        field_z = "Round";
        field_A = "<%0> is not on your ignore list.";
        field_x = new int[1];
    }
}
