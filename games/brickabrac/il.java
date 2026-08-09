/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends no {
    static int[] field_D;
    private int field_C;
    int field_w;
    int field_E;
    static int field_z;
    static String field_A;
    static int[] field_B;
    private int field_x;
    int field_y;
    int field_v;

    final static void a(nm param0, int param1, nm param2) {
        try {
            if (!(null == param0.field_b)) {
                param0.b((byte) 111);
            }
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            int var3_int = 73 / ((-34 - param1) / 43);
            param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "il.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, wq param1) {
        try {
            super.a(123, param1);
            this.field_u = param1.l(255) << 629775560;
            this.field_C = param1.l(255);
            this.field_E = param1.i(65280);
            if (param0 <= 89) {
                nm var4 = (nm) null;
                il.a((nm) null, 19, (nm) null);
            }
            this.field_w = param1.i(65280);
            this.field_y = param1.i(65280);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "il.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        this.field_m = this.field_m + this.field_o;
        if (param0 == -2081170685) {
            this.field_j = this.field_j + this.field_k;
            if (-6144 > this.field_m) {
                this.field_m = this.field_m + 129024;
            }
            if (this.field_C == 0) {
                if ((this.field_l ^ -1) == -33) {
                    this.field_C = 1;
                }
                this.field_v = this.field_v + 500;
                this.field_l = this.field_l + 1;
                return;
            }
            if (this.field_C != 1) {
                if (this.field_C != 2) {
                    this.field_l = this.field_l + 1;
                    return;
                }
                if (this.field_x < this.field_v) {
                    this.field_v = this.field_v - this.field_x;
                    if (-565 == (this.field_l ^ -1)) {
                        this.b((byte) 111);
                    }
                    this.field_l = this.field_l + 1;
                    return;
                }
                if (this.field_x / 2 < this.field_v) {
                    this.field_v = this.field_v * 4 / 5;
                    if (-565 == (this.field_l ^ -1)) {
                        this.b((byte) 111);
                    }
                    this.field_l = this.field_l + 1;
                    return;
                }
                if (-565 == (this.field_l ^ -1)) {
                    this.b((byte) 111);
                }
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_v = (this.field_y * sa.a(this.field_E + this.field_l * this.field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
            if (-533 == (this.field_l ^ -1)) {
                this.field_C = 2;
                this.field_x = this.field_v / 32;
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_l = this.field_l + 1;
            return;
        }
        this.field_C = 106;
        this.field_j = this.field_j + this.field_k;
        if (-6144 <= this.field_m) {
            if (this.field_C == 0) {
                if ((this.field_l ^ -1) == -33) {
                    this.field_C = 1;
                }
                this.field_v = this.field_v + 500;
                this.field_l = this.field_l + 1;
                return;
            }
            if (this.field_C != 1) {
                if (this.field_C != 2) {
                    this.field_l = this.field_l + 1;
                    return;
                }
                if (this.field_x >= this.field_v) {
                    if (this.field_x / 2 >= this.field_v) {
                        if (-565 == (this.field_l ^ -1)) {
                            this.b((byte) 111);
                        }
                        this.field_l = this.field_l + 1;
                        return;
                    }
                    this.field_v = this.field_v * 4 / 5;
                    if (-565 != (this.field_l ^ -1)) {
                        this.field_l = this.field_l + 1;
                        return;
                    }
                    this.b((byte) 111);
                    this.field_l = this.field_l + 1;
                    return;
                }
                this.field_v = this.field_v - this.field_x;
                if (-565 != (this.field_l ^ -1)) {
                    this.field_l = this.field_l + 1;
                    return;
                }
                this.b((byte) 111);
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_v = (this.field_y * sa.a(this.field_E + this.field_l * this.field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
            if (-533 == (this.field_l ^ -1)) {
                this.field_C = 2;
                this.field_x = this.field_v / 32;
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_l = this.field_l + 1;
            return;
        }
        this.field_m = this.field_m + 129024;
        if (this.field_C == 0) {
            if ((this.field_l ^ -1) != -33) {
                this.field_v = this.field_v + 500;
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_C = 1;
            this.field_v = this.field_v + 500;
            this.field_l = this.field_l + 1;
            return;
        }
        if (this.field_C != 1) {
            if (this.field_C != 2) {
                this.field_l = this.field_l + 1;
                return;
            }
            if (this.field_x >= this.field_v) {
                if (this.field_x / 2 >= this.field_v) {
                    if (-565 != (this.field_l ^ -1)) {
                        this.field_l = this.field_l + 1;
                        return;
                    }
                    this.b((byte) 111);
                    this.field_l = this.field_l + 1;
                    return;
                }
                this.field_v = this.field_v * 4 / 5;
                if (-565 == (this.field_l ^ -1)) {
                    this.b((byte) 111);
                    this.field_l = this.field_l + 1;
                    return;
                }
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_v = this.field_v - this.field_x;
            if (-565 == (this.field_l ^ -1)) {
                this.b((byte) 111);
                this.field_l = this.field_l + 1;
                return;
            }
            this.field_l = this.field_l + 1;
            return;
        }
        this.field_v = (this.field_y * sa.a(this.field_E + this.field_l * this.field_w, param0 ^ 2081174780) >> -1849271312) + 16000;
        if (-533 != (this.field_l ^ -1)) {
            this.field_l = this.field_l + 1;
            return;
        }
        this.field_C = 2;
        this.field_x = this.field_v / 32;
        this.field_l = this.field_l + 1;
    }

    final static void a(ie param0, tg param1, int param2, int param3, int param4, int param5, java.awt.Component param6, boolean param7) {
        try {
            tj.a(param2, param7, 10);
            eo.field_f = tj.a(param1, param6, 0, param4);
            jk.field_w = tj.a(param1, param6, 1, param3);
            ob.field_J = new ra();
            af.field_u = param5 * param3 / param2;
            jk.field_w.b(ob.field_J);
            m.field_f = param0;
            m.field_f.a(ul.field_p, false);
            eo.field_f.b(m.field_f);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "il.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 <= 122) {
            return;
        }
        field_A = null;
        field_D = null;
        field_B = null;
    }

    il(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final static void a(byte param0, int param1) {
        if (param0 != 86) {
            il.e((byte) -105);
            wp.a(param0 ^ 87, param1);
            return;
        }
        wp.a(param0 ^ 87, param1);
    }

    final static void a(int param0, jp param1, jp param2, int param3, int param4, jp param5, int param6, int param7, int param8, int param9, jp param10, int param11) {
        try {
            param2.d(param9 + ((-param2.field_x + param11) / 2 + (param0 * 5 >> -146611824)), param8);
            param5.c((10 * param0 >> 920868816) + ((-param5.field_x + param11) / 2 + param9 + -(87 / param3)), -(80 / param3) + (-param5.field_z + 480 + (param6 + param8)));
            param1.c(-(5 / param3) + ((param0 * 20 >> 752742192) + ((param11 - param1.field_x) / 2 + param9)), -param1.field_z + (480 + param6 + param8));
            og.a(-121, 16, 0, param10, 16777215, -(5 / param3) + ((param0 * 2 >> 647611568) + ((param11 + -param10.field_x) / param4 + param9)), 480 + (param8 + param6 - param10.field_z));
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "il.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    final int a(int param0, StringBuilder param1) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Component var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                var4 = (java.awt.Component) null;
                il.a((ie) null, (tg) null, 83, 59, 15, -106, (java.awt.Component) null, true);
                break L1;
              }
            }
            L2: {
              var3_int = super.a(120, param1) ^ -72674834;
              if (param1 != null) {
                discarded$3 = param1.append(this.field_j + " " + this.field_m + " ");
                discarded$4 = param1.append(this.field_E + " " + this.field_l + " ");
                discarded$5 = param1.append("\n");
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = var3_int ^ 97 * this.field_C - -9269 << -2081170685;
            var3_int = var3_int ^ 39185 + 47 * this.field_v << -1030865523;
            var3_int = var3_int ^ this.field_E * 17 + 31 << -1064075646;
            var3_int = var3_int ^ 30 + 19 * this.field_w << 1199390358;
            var3_int = var3_int ^ 27 * this.field_y + 21554 << 102788970;
            stackIn_6_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("il.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean e(byte param0) {
        jp var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -77) {
          L0: {
            var2 = (jp) null;
            il.a(-62, (jp) null, (jp) null, 105, -38, (jp) null, 49, -61, 61, -69, (jp) null, 126);
            if (-251 <= (ld.field_t ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-251 <= (ld.field_t ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_D = new int[8192];
        field_z = -1;
        field_A = "Show chat";
    }
}
