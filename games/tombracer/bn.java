/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends nv {
    static String field_o;
    private boolean field_q;
    private boolean field_s;
    static String field_u;
    static boolean field_n;
    private int field_r;
    static jea field_t;
    private int field_p;

    final void k(int param0) {
        int var19 = 0;
        ffa stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_30_3;
        ffa stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        boolean stackIn_34_2 = false;
        int stackIn_35_3;
        int var2;
        int var3;
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
        int var16;
        int var17_int;
        ffa[] var17;
        ffa[] var18;
        ffa var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        hr var27;
        hr var28;
        var26 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_g.d(3);
        if (param0 != 5418) {
          field_u = (String) null;
        }
        var3 = this.field_g.e(param0 + 4230);
        var4 = this.field_g.c(param0 - 5487);
        var5 = this.field_g.a((byte) 55);
        var7 = this.field_p << 16;
        var8 = this.field_r << 16;
        var9 = var4 >> 17;
        var10 = var5 >> 17;
        var11 = et.b(var10, var9, -1);
        var12 = this.o((byte) 46).a(8192, 0);
        var13 = hua.a((byte) 98, var12 >> 2);
        var14 = bua.a(0, var12 >> 2);
        var16 = this.field_g.P(0);
        if (this.field_q) {
          var17_int = 1 + this.o((byte) 46).a(5, 0);
          var28 = this.b(true).a(var13 * var11 / var17_int + var2, var3 + var11 * var14 / var17_int, (byte) 100, var16);
          var28.a(false, 2, 3, 4, 20);
          var28.b(param0 ^ 5392, -(var14 * (this.field_p + this.field_r)), -(var13 * (this.field_p + this.field_r)) / var17_int);
        } else {
          var17_int = 1 + this.o((byte) 46).a(5, 0);
          var27 = this.b(true).a(var2, var3, (byte) 100, var16);
          var27.a(false, 2, 3, 4, 25);
          var27.b(param0 - 5361, var14 * this.field_r / var17_int, this.field_r * var13 / var17_int);
        }
        var17 = this.b(true).field_u.b(var3, -1, var2, var4, var5);
        var18 = var17;
        for (var19 = 0; var19 < var18.length; var19++) {
          var20 = var18[var19];
          if (this.field_g != var20 &&
            !this.field_g.a(var20, true)) {
            var21 = var20.d(3);
            var22 = var20.e(9648);
            if (this.field_g.a((byte) 110, var22, var21, var20.a((byte) 55), var20.c(-40))) {
              var23 = var21 - var2 >> 16;
              var24 = -var3 + var22 >> 16;
              var25 = ira.a(var24, var23, 124);
              if (var25 <= var11 &&
                var25 != 0) {
                var6 = (var25 << 16) / var11;
                var6 = -gqa.a(var6, (byte) 24, var8 - var7) + var8;
                var6 = za.$cfr$intArgs$a$c604db63f465(var7, 74, var8, var6);
                if (this.field_q) {
                  var6 = -var6;
                }
                if (this.field_q &&
                  ua.a(var6, param0 ^ -5442) > var25 << 16) {
                  stackIn_34_0 = var20;
                  stackIn_34_1 = param0 - 5313;
                  stackIn_34_2 = false;
                  if (this.field_s) {
                    stackIn_35_3 = 2;
                  } else {
                    stackIn_35_3 = 1;
                  }
                  ((ffa) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_35_3, -var24 << 16, -var23 << 16, 0);
                } else {
                  stackIn_29_0 = var20;
                  stackIn_29_1 = 114;
                  stackIn_29_2 = false;
                  if (!this.field_s) {
                    stackIn_30_3 = 1;
                  } else {
                    stackIn_30_3 = 2;
                  }
                  ((ffa) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, stackIn_30_3, var24 * var6 / var25, var6 * var23 / var25, 0);
                }
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_u = null;
        field_o = null;
        field_t = null;
        if (param0) {
          field_u = (String) null;
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return 61;
        }
        return 27;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) 72, this.field_q ? 1 : 0, 1);
          param1.a((byte) 32, this.field_r, 4);
          param1.a((byte) -127, this.field_p, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          return true;
        }
        return true;
    }

    bn(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = 2;
        this.field_q = true;
        this.field_p = 1;
        try {
          this.field_q = param1.b((byte) 44, 1) == 1 ? true : false;
          this.field_r = param1.b((byte) 44, 4);
          this.field_p = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          return 77;
        }
        return param0;
    }

    static {
        field_u = "Quit";
        field_o = "Pistols";
    }
}
