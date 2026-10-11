/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class no {
    wo field_j;
    static na field_k;
    static int[] field_s;
    static nl field_h;
    wo field_f;
    static dd field_q;
    wo field_t;
    static int[] field_n;
    static hj field_g;
    wo field_o;
    ge field_r;
    long field_d;
    int field_m;
    static String field_b;
    static int field_l;
    ge field_p;
    volatile int field_a;
    byte field_c;
    volatile int field_e;
    sp field_i;

    final boolean b(byte param0) {
        if (param0 == -125) {
          return 20 <= this.c(param0 + 4734) ? true : false;
        }
        this.d(-57);
        return 20 <= this.c(param0 + 4734) ? true : false;
    }

    abstract boolean d(int param0);

    abstract void a(int param0, boolean param1, Object param2);

    final boolean a(int param0) {
        if (param0 == 20) {
          return 20 <= this.a(false) ? true : false;
        }
        this.c(-49);
        return 20 <= this.a(false) ? true : false;
    }

    abstract void a(byte param0);

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        long var18;
        long var20;
        long var22;
        long var24;
        int var26;
        int var27;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        long var18Lifetime1;
        long var18Lifetime2;
        long var20Lifetime1;
        long var20Lifetime2;
        long var22Lifetime1;
        long var22Lifetime2;
        long var24Lifetime1;
        long var24Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        var12 = param2 - param4;
        var13 = param0 - param6;
        if (param11 == ~var12 &&
          var13 == 0) {
          return -1;
        }
        var14 = -param9 + param7;
        var15 = -param10 + param5;
        if (aj.a(var14, false, var12) + aj.a(var15, false, var13) > 0) {
          return -1;
        }
        if (param3 > param1) {
          param9 = param9 + aj.a(-param1 + param3, false, param4);
          param10 = param10 + aj.a(param3 - param1, false, param6);
          param1 = param3;
          var15 = param5 - param10;
          var14 = param7 - param9;
          var16 = param8 * param8 * 4;
          var17 = aj.a(var12, false, var12) + aj.a(var13, false, var13);
          if (var17 == 0) {
            return -1;
          }
          var18 = 2L * (od.a((long)var14, (long)var12, false) + od.a((long)var15, (long)var13, false));
          if (var18 <= 2147483647L &&
            -2147483648L <= var18) {
            if ((var14 >> 16) * (var14 >> 16) <= 2147483647 &&
              2147483647 >= (var15 >> 16) * (var15 >> 16)) {
              var20 = od.a((long)var14, (long)var14, false) + od.a((long)var15, (long)var15, false) - (long)(var16 << 16);
              var22 = od.a(var18, var18, false) - 4L * od.a((long)var17, var20, false);
              if (0L > var22) {
                return -1;
              }
              var24 = bm.a(param11 ^ 106, var22);
              if (var24 > 2147483647L) {
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
              }
              if (var24 < -2147483648L) {
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
              }
              var26 = (int)((-var18 + var24 << 15) / (long)var17);
              var27 = (int)((-var18 - var24 << 15) / (long)var17);
              if (var26 > 0 &&
                65536 - param1 >= var26 &&
                var26 <= var27) {
                return var26 + param1;
              }
              if (var27 > 0 &&
                65536 - param1 >= var27) {
                return param1 + var27;
              }
              if (var26 <= 0 &&
                0 < var27) {
                return 1 + param1;
              }
              if (var27 <= 0 &&
                var26 > 0) {
                return 1 + param1;
              }
              return -1;
            }
            return -1;
          }
          return -1;
        }
        if (param1 <= param3) {
          var16Lifetime1 = param8 * param8 * 4;
          var17Lifetime1 = aj.a(var12, false, var12) + aj.a(var13, false, var13);
          if (var17Lifetime1 == 0) {
            return -1;
          }
          var18Lifetime1 = 2L * (od.a((long)var14, (long)var12, false) + od.a((long)var15, (long)var13, false));
          if (var18Lifetime1 <= 2147483647L &&
            -2147483648L <= var18Lifetime1) {
            if ((var14 >> 16) * (var14 >> 16) <= 2147483647 &&
              2147483647 >= (var15 >> 16) * (var15 >> 16)) {
              var20Lifetime1 = od.a((long)var14, (long)var14, false) + od.a((long)var15, (long)var15, false) - (long)(var16Lifetime1 << 16);
              var22Lifetime1 = od.a(var18Lifetime1, var18Lifetime1, false) - 4L * od.a((long)var17Lifetime1, var20Lifetime1, false);
              if (0L > var22Lifetime1) {
                return -1;
              }
              var24Lifetime1 = bm.a(param11 ^ 106, var22Lifetime1);
              if (var24Lifetime1 <= 2147483647L &&
                var24Lifetime1 >= -2147483648L) {
                var26Lifetime1 = (int)((-var18Lifetime1 + var24Lifetime1 << 15) / (long)var17Lifetime1);
                var27Lifetime1 = (int)((-var18Lifetime1 - var24Lifetime1 << 15) / (long)var17Lifetime1);
                if (var26Lifetime1 > 0 &&
                  65536 - param1 >= var26Lifetime1 &&
                  var26Lifetime1 <= var27Lifetime1) {
                  return var26Lifetime1 + param1;
                }
                if (var27Lifetime1 > 0 &&
                  65536 - param1 >= var27Lifetime1) {
                  return param1 + var27Lifetime1;
                }
                if (var26Lifetime1 <= 0 &&
                  0 < var27Lifetime1) {
                  return 1 + param1;
                }
                if (var27Lifetime1 > 0) {
                  return -1;
                }
                if (var26Lifetime1 > 0) {
                  return 1 + param1;
                }
                return -1;
              }
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime1, 16));
            }
            return -1;
          }
          return -1;
        }
        param7 = param7 + aj.a(-param3 + param1, false, param2);
        param5 = param5 + aj.a(-param3 + param1, false, param0);
        param3 = param1;
        var14Lifetime1 = param7 - param9;
        var15Lifetime1 = param5 - param10;
        var16Lifetime2 = param8 * param8 * 4;
        var17Lifetime2 = aj.a(var12, false, var12) + aj.a(var13, false, var13);
        if (var17Lifetime2 == 0) {
          return -1;
        }
        var18Lifetime2 = 2L * (od.a((long)var14Lifetime1, (long)var12, false) + od.a((long)var15Lifetime1, (long)var13, false));
        if (var18Lifetime2 <= 2147483647L &&
          -2147483648L <= var18Lifetime2) {
          if ((var14Lifetime1 >> 16) * (var14Lifetime1 >> 16) <= 2147483647 &&
            2147483647 >= (var15Lifetime1 >> 16) * (var15Lifetime1 >> 16)) {
            var20Lifetime2 = od.a((long)var14Lifetime1, (long)var14Lifetime1, false) + od.a((long)var15Lifetime1, (long)var15Lifetime1, false) - (long)(var16Lifetime2 << 16);
            var22Lifetime2 = od.a(var18Lifetime2, var18Lifetime2, false) - 4L * od.a((long)var17Lifetime2, var20Lifetime2, false);
            if (0L > var22Lifetime2) {
              return -1;
            }
            var24Lifetime2 = bm.a(param11 ^ 106, var22Lifetime2);
            if (var24Lifetime2 > 2147483647L) {
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime2, 16));
            }
            if (var24Lifetime2 < -2147483648L) {
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime2, 16));
            }
            var26Lifetime2 = (int)((-var18Lifetime2 + var24Lifetime2 << 15) / (long)var17Lifetime2);
            var27Lifetime2 = (int)((-var18Lifetime2 - var24Lifetime2 << 15) / (long)var17Lifetime2);
            if (var26Lifetime2 > 0 &&
              65536 - param1 >= var26Lifetime2 &&
              var26Lifetime2 <= var27Lifetime2) {
              return var26Lifetime2 + param1;
            }
            if (var27Lifetime2 > 0 &&
              65536 - param1 >= var27Lifetime2) {
              return param1 + var27Lifetime2;
            }
            if (var26Lifetime2 <= 0 &&
              0 < var27Lifetime2) {
              return 1 + param1;
            }
            if (var27Lifetime2 > 0) {
              return -1;
            }
            if (var26Lifetime2 > 0) {
              return 1 + param1;
            }
            return -1;
          }
          return -1;
        }
        return -1;
    }

    final int a(boolean param0) {
        if (!param0) {
          return this.field_t.b(0) + this.field_o.b(0);
        }
        this.field_m = -3;
        return this.field_t.b(0) + this.field_o.b(0);
    }

    public static void b(int param0) {
        field_s = null;
        field_b = null;
        field_k = null;
        field_q = null;
        field_n = null;
        field_h = null;
        if (param0 > 116) {
          field_g = null;
          return;
        }
    }

    abstract void c(byte param0);

    final sp a(int param0, int param1, byte param2, boolean param3, int param4) {
        if (param4 != -154018400) {
          return (sp) null;
        }
        long var6 = (long)param0 + ((long)param1 << 32);
        sp var8 = new sp();
        var8.field_x = param3 ? true : false;
        var8.field_L = param2;
        var8.field_m = var6;
        if (!param3) {
          if (20 <= this.a(false)) {
            throw new RuntimeException();
          }
          this.field_t.a(var8, false);
        } else {
          if (!(this.c(4609) < 20)) {
            throw new RuntimeException();
          }
          this.field_j.a(var8, false);
        }
        return var8;
    }

    final int c(int param0) {
        if (param0 != 4609) {
          return 86;
        }
        return this.field_j.b(0) + this.field_f.b(0);
    }

    no() {
        this.field_j = new wo();
        this.field_f = new wo();
        this.field_t = new wo();
        this.field_o = new wo();
        this.field_r = new ge(6);
        this.field_e = 0;
        this.field_a = 0;
        this.field_c = (byte) 0;
        this.field_p = new ge(10);
    }

    static {
        field_k = new na();
        field_s = new int[16];
        field_h = new nl();
        field_n = new int[16];
        field_g = new hj(8, 0, 4, 1);
        field_b = "Game drawn";
    }
}
