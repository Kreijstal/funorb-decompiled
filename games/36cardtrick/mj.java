/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mj {
    static int field_e;
    di[] field_d;
    static String[] field_c;
    static int[] field_b;
    static String field_a;

    final int a(boolean param0, int param1) {
        int var4 = 0;
        di var5 = null;
        int var6 = Main.field_T;
        if (!param0) {
          return 120;
        }
        di[] var7 = this.field_d;
        di[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_a.length > param1) {
            return var5.field_a[param1];
          }
          param1 = param1 - (-1 + var5.field_a.length);
        }
        return 0;
    }

    final static String a(int param0) {
        if (!(g.field_A >= 2)) {
          return ti.field_c;
        }
        if (param0 != -1) {
          mj.a(30);
        }
        if (lb.field_a != null) {
          if (!lb.field_a.b(4)) {
            return oe.field_d;
          }
          return fg.field_j;
        }
        if (!jk.field_c.b(4)) {
          return kf.field_j;
        }
        if (!jk.field_c.b(4, "commonui")) {
          return bk.field_f + " - " + jk.field_c.a("commonui", 0) + "%";
        }
        if (!aa.field_db.b(4)) {
          return ak.field_L;
        }
        if (!aa.field_db.b(4, "commonui")) {
          return nc.field_b + " - " + aa.field_db.a("commonui", 0) + "%";
        }
        if (!sg.field_a.b(4)) {
          return tb.field_e;
        }
        if (!sg.field_a.a((byte) 88)) {
          return rj.field_w + " - " + sg.field_a.a(2) + "%";
        }
        return tj.field_H;
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        di[] var3;
        di var5;
        int var7;
        int var6;
        var7 = Main.field_T;
        if (param0 != -5) {
          return -56;
        }
        var2 = -1;
        if (null != this.field_d) {
          var3 = this.field_d;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 117);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        di var6;
        int var7;
        int var8;
        var8 = Main.field_T;
        if (null != this.field_d &&
          this.field_d.length != 0 &&
          param0 >= this.field_d[0].field_b) {
          if (param0 > this.field_d[this.field_d.length - 1].field_c) {
            return -1;
          }
          if (this.field_d.length == 1) {
            return this.field_d[0].a(1, param1);
          }
          if (param2 > -26) {
            mj.a(42, 19, true, true);
          }
          var4 = 0;
          for (var5 = 0; this.field_d.length > var5; var5++) {
            var6 = this.field_d[var5];
            if (var6.field_b <= param0 &&
              param0 <= var6.field_c) {
              var7 = var6.a(1, param1);
              if (-1 != var7) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.field_a.length);
          }
          return -1;
        }
        return -1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 109) {
          mj.a(9, 26, false, false);
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          this.field_d = (di[]) null;
        }
        if (this.field_d != null &&
          this.field_d.length > 0) {
          stackIn_6_0 = this.field_d[this.field_d.length - 1].field_c - this.field_d[0].field_b;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Main.field_T;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            }
          }
          if (param3 != -53) {
            field_c = (String[]) null;
          }
          if (var5_int <= 0) {
            stackIn_23_0 = 0;
            return stackIn_23_0;
          }
          stackIn_21_0 = (-param1 + param0 << 8) / var5_int;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (!param3) {
          return -86;
        }
        return vf.b((byte) 103);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        di var4;
        int var5;
        var5 = Main.field_T;
        for (var3 = 0; this.field_d.length > var3; var3++) {
          var4 = this.field_d[var3];
          if (param1 < var4.field_a.length) {
            return var3;
          }
          param1 = param1 - (var4.field_a.length - 1);
        }
        if (param0 != -13453) {
          field_a = (String) null;
        }
        return this.field_d.length;
    }

    static {
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
        field_a = "Player Name: ";
    }
}
