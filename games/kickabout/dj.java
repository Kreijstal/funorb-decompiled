/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj extends qt {
    static int field_A;
    static hd field_D;
    int field_C;
    static String field_B;

    final void h(byte param0) {
        if (param0 > -76) {
          this.field_C = 32;
        }
        this.field_C = this.field_C - 1;
        if (this.field_C < 0) {
          this.field_C = 0;
        }
        kj.a((byte) -103);
    }

    final boolean a(int param0, byte param1) {
        if (this.field_i[param0].field_m == 21 &&
          !this.g((byte) -122)) {
          return false;
        }
        if (param1 != -95) {
          return true;
        }
        if (this.field_i[param0].field_m == 22 &&
          !this.b(false)) {
          return false;
        }
        return super.a(param0, (byte) -95);
    }

    boolean a(int param0, int param1, char param2) {
        this.field_x.a(1, true);
        if (this.field_x.field_e >= 0 &&
          this.field_x.c(-1)) {
          this.field_i[this.field_x.field_e].a(-1, false);
          return true;
        }
        if (param1 >= -5) {
          field_D = (hd) null;
        }
        return super.a(param0, -53, param2);
    }

    void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4_int = 0;
        int var5_int = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        super.a(param0, param1);
        if (!this.g((byte) -120)) {
          var3_int = this.field_i[0].field_d;
          var4_int = this.field_i[0].field_h;
          var5_int = this.b(0, -22667) + (this.field_j - (var3_int >> 1));
          var6 = this.a(-124, 0) - (var4_int >> 1);
          on.a(var5_int - 4, -4 + var6, 8 + var3_int, var4_int + 8, 10, 0, 128);
          eo.field_r[0][3].c(var5_int, var6);
        }
        if (!this.b(false)) {
          var3_intLifetime1 = this.field_i[2].field_d;
          var4_intLifetime1 = this.field_i[2].field_h;
          var5_intLifetime1 = -(var3_intLifetime1 >> 1) + (this.b(2, param0 ^ 22670) + this.field_j);
          var6Lifetime1 = -(var4_intLifetime1 >> 1) + this.a(101, 2);
          on.a(-4 + var5_intLifetime1, -4 + var6Lifetime1, 8 + var3_intLifetime1, var4_intLifetime1 + 8, 10, 0, 128);
          eo.field_c[0][3].c(var5_intLifetime1, var6Lifetime1);
        }
        on.a(this.field_j + 15, 60, 610, 355, 10, 0, 128);
        String[] var7 = this.a(true);
        String[] var3 = var7;
        String var4 = var7[this.field_C].toUpperCase();
        on.a(this.field_j + 40, 76, 560, 36, 10, 65793, 140);
        un.field_d.d(var4, this.field_j + 320, 101, 16777215, -1);
        String var5 = this.field_C + 1 + " / " + var7.length;
        un.field_d.c(var5, 580 + this.field_j, 101, 16777215, -1);
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var4_int = param3.length();
          param3.setLength(param0);
          if (param2 != -11407) {
            field_B = (String) null;
          }
          for (var5 = var4_int; var5 < param0; var5++) {
            param3.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("dj.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(byte param0, boolean param1) {
        super.a((byte) 98, param1);
        int var3 = -34 / ((param0 - 38) / 60);
        if (this.field_x.field_e == 0 &&
          !this.g((byte) -93)) {
          this.field_x.a((byte) 68, 1);
        }
        if (this.field_x.field_e == 2 &&
          !this.b(false)) {
          this.field_x.a((byte) 68, 1);
        }
    }

    private final String[] a(boolean param0) {
        if (this.field_c == 19) {
          return iq.field_a;
        }
        if (20 == this.field_c) {
          return uv.field_d;
        }
        if (!param0) {
          return (String[]) null;
        }
        if (this.field_c == 21) {
          return ue.field_g;
        }
        if (this.field_c == 22) {
          return pt.field_l;
        }
        return null;
    }

    final void f(int param0) {
        this.field_C = this.field_C + 1;
        int var2 = this.a(true).length;
        if (this.field_C >= var2) {
          this.field_C = var2 - 1;
        }
        kj.a((byte) 58);
        if (param0 != 21) {
          this.field_C = 21;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.field_C = 0;
    }

    private final boolean b(boolean param0) {
        if (this.field_C == -1 + this.a(true).length) {
          return false;
        }
        if (param0) {
          this.a((byte) -54, true);
        }
        return true;
    }

    final int b(int param0, int param1) {
        boolean discarded$0 = false;
        if (param1 != -22667) {
          discarded$0 = this.g((byte) 91);
        }
        return 320 + 70 * (-1 + param0);
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 != -29104) {
          StringBuilder var2 = (StringBuilder) null;
          dj.a(40, 'ﾄ', 84, (StringBuilder) null);
        }
    }

    private final boolean g(byte param0) {
        if (param0 > -70) {
          this.field_C = -4;
        }
        if (0 == this.field_C) {
          return false;
        }
        return true;
    }

    dj() {
    }

    final int a(int param0, int param1) {
        int var3 = -127 / ((param0 + 49) / 52);
        return 457;
    }

    static {
        field_A = -1;
        field_B = "You cannot join this game - it is in progress";
    }
}
