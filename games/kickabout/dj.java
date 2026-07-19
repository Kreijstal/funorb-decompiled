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
        if (!(this.field_C >= 0)) {
            this.field_C = 0;
        }
        kj.a((byte) -103);
    }

    final boolean a(int param0, byte param1) {
        if (this.field_i[param0].field_m == 21) {
            if (!this.g((byte) -122)) {
                return false;
            }
        }
        if (param1 != -95) {
            return true;
        }
        if ((this.field_i[param0].field_m ^ -1) == -23) {
            if (!this.b(false)) {
                return false;
            }
        }
        return super.a(param0, (byte) -95);
    }

    boolean a(int param0, int param1, char param2) {
        this.field_x.a(1, true);
        if (this.field_x.field_e >= 0) {
            if (!(!this.field_x.c(-1))) {
                this.field_i[this.field_x.field_e].a(-1, false);
                return true;
            }
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
        super.a(param0, param1);
        if (!(this.g((byte) -120))) {
            var3_int = this.field_i[0].field_d;
            var4_int = this.field_i[0].field_h;
            var5_int = this.b(0, -22667) + (this.field_j + -(var3_int >> -1522629823));
            var6 = this.a(-124, 0) - (var4_int >> 758989121);
            on.a(var5_int - 4, -4 + var6, 8 + var3_int, var4_int + 8, 10, 0, 128);
            eo.field_r[0][3].c(var5_int, var6);
        }
        if (!(this.b(false))) {
            var3_int = this.field_i[2].field_d;
            var4_int = this.field_i[2].field_h;
            var5_int = -(var3_int >> 1468389729) + (this.b(2, param0 ^ 22670) - -this.field_j);
            var6 = -(var4_int >> 1779281729) + this.a(101, 2);
            on.a(-4 + var5_int, -4 + var6, 8 + var3_int, var4_int - -8, 10, 0, 128);
            eo.field_c[0][3].c(var5_int, var6);
        }
        on.a(this.field_j + 15, 60, 610, 355, 10, 0, 128);
        String[] var7 = this.a(true);
        String[] var3 = var7;
        String var4 = var7[this.field_C].toUpperCase();
        on.a(this.field_j + 40, 76, 560, 36, 10, 65793, 140);
        un.field_d.d(var4, this.field_j + 320, 101, 16777215, -1);
        String var5 = this.field_C - -1 + " / " + var7.length;
        un.field_d.c(var5, 580 - -this.field_j, 101, 16777215, -1);
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              param3.setLength(param0);
              if (param2 == -11407) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param0) {
                stackOut_6_0 = (StringBuilder) (param3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param3.setCharAt(var5, param1);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("dj.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    void a(byte param0, boolean param1) {
        super.a((byte) 98, param1);
        int var3 = -34 / ((param0 - 38) / 60);
        if (this.field_x.field_e == 0) {
            if (!this.g((byte) -93)) {
                this.field_x.a((byte) 68, 1);
            }
        }
        if ((this.field_x.field_e ^ -1) == -3) {
            if (!(this.b(false))) {
                this.field_x.a((byte) 68, 1);
            }
        }
    }

    private final String[] a(boolean param0) {
        if (this.field_c == 19) {
            return iq.field_a;
        }
        if (!(20 != this.field_c)) {
            return uv.field_d;
        }
        if (!param0) {
            return (String[]) null;
        }
        if (this.field_c == 21) {
            return ue.field_g;
        }
        if (!((this.field_c ^ -1) != -23)) {
            return pt.field_l;
        }
        return null;
    }

    final void f(int param0) {
        this.field_C = this.field_C + 1;
        int var2 = this.a(true).length;
        if (!(this.field_C < var2)) {
            this.field_C = var2 + -1;
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
        if (!(this.field_C != -1 + this.a(true).length)) {
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
        return 320 - -(70 * (-1 + param0));
    }

    public static void e(int param0) {
        StringBuilder discarded$0 = null;
        field_B = null;
        field_D = null;
        if (param0 != -29104) {
            StringBuilder var2 = (StringBuilder) null;
            discarded$0 = dj.a(40, 'ﾄ', 84, (StringBuilder) null);
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
        int var3 = -127 / ((param0 - -49) / 52);
        return 457;
    }

    static {
        field_A = -1;
        field_B = "You cannot join this game - it is in progress";
    }
}
