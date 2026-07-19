/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf {
    static dq field_i;
    nj field_e;
    nj field_f;
    nj field_l;
    static uc field_d;
    static String[] field_j;
    static int field_n;
    nj field_p;
    int field_o;
    we field_b;
    long field_k;
    byte field_a;
    volatile int field_h;
    volatile int field_m;
    we field_g;
    rj field_c;

    abstract boolean a(boolean param0);

    public static void c(byte param0) {
        fm var2 = null;
        if (param0 != -53) {
          var2 = (fm) null;
          rf.a((po) null, 104, (fm) null);
          field_d = null;
          field_j = null;
          field_i = null;
          return;
        } else {
          field_d = null;
          field_j = null;
          field_i = null;
          return;
        }
    }

    abstract void b(byte param0);

    abstract void a(Object param0, boolean param1, int param2);

    final boolean a(int param0) {
        if (param0 != 20) {
            return false;
        }
        return this.b(127) >= 20 ? true : false;
    }

    final int a(byte param0) {
        if (param0 != 34) {
            return 117;
        }
        return this.field_l.b(param0 + 67) - -this.field_p.b(118);
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 9) {
          L0: {
            this.field_f = (nj) null;
            if (-21 < (this.a((byte) 34) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.a((byte) 34) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final rj a(byte param0, int param1, boolean param2, int param3, byte param4) {
        if (param0 != -31) {
            return (rj) null;
        }
        long var6 = (long)param3 + ((long)param1 << 1468960288);
        rj var8 = new rj();
        var8.field_B = param4;
        var8.field_t = param2 ? true : false;
        var8.field_q = var6;
        if (param2) {
            if (!(this.b(126) < 20)) {
                throw new RuntimeException();
            }
            this.field_e.a(-89, var8);
        } else {
            if ((this.a((byte) 34) ^ -1) > -21) {
                this.field_l.a(-45, var8);
                return var8;
            }
            throw new RuntimeException();
        }
        return var8;
    }

    abstract void e(byte param0);

    final int b(int param0) {
        int var2 = 23 % ((58 - param0) / 55);
        return this.field_e.b(113) + this.field_f.b(102);
    }

    final static void a(po param0, int param1, fm param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              po.field_d = param0;
              if (param1 == 5088) {
                break L1;
              } else {
                field_i = (dq) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (16 <= var3_int) {
                pg.field_f[128] = param0.a(true, "menu_select", "");
                pg.field_f[131] = param0.a(true, "pix_grid_wipe", "");
                pg.field_f[129] = param0.a(true, "pix_time_running_out", "");
                pg.field_f[130] = param0.a(true, "pix_time_up", "");
                break L0;
              } else {
                L3: {
                  var4 = Integer.toString(var3_int - -1);
                  if (-6 == (var3_int ^ -1)) {
                    pg.field_f[0 + var3_int * 8 + 0] = qd.a(param2, "", "pix_skin" + var4 + "_move1").a();
                    pg.field_f[0 + 8 * var3_int - -1] = qd.a(param2, "", "pix_skin" + var4 + "_move2").a();
                    pg.field_f[2 + (0 + var3_int * 8)] = qd.a(param2, "", "pix_skin" + var4 + "_move3").a();
                    pg.field_f[3 + var3_int * 8] = qd.a(param2, "", "pix_skin" + var4 + "_move4").a();
                    break L3;
                  } else {
                    pg.field_f[0 + (8 * var3_int + 0)] = param0.a(true, "pix_skin" + var4 + "_move1", "");
                    pg.field_f[0 + (var3_int * 8 - -1)] = param0.a(true, "pix_skin" + var4 + "_move2", "");
                    pg.field_f[2 + (0 + 8 * var3_int)] = param0.a(true, "pix_skin" + var4 + "_move3", "");
                    pg.field_f[3 + var3_int * 8] = param0.a(true, "pix_skin" + var4 + "_move4", "");
                    break L3;
                  }
                }
                L4: {
                  pg.field_f[5 + var3_int * 8] = param0.a(true, "pix_skin" + var4 + "_landing_normal", "");
                  if (7 != var3_int) {
                    pg.field_f[6 + var3_int * 8] = qd.a(param2, "", "pix_skin" + var4 + "_landing_special").a();
                    pg.field_f[7 + var3_int * 8] = qd.a(param2, "", "pix_skin" + var4 + "_picture_complete").a();
                    break L4;
                  } else {
                    pg.field_f[8 * var3_int + 6] = param0.a(true, "pix_skin" + var4 + "_landing_special", "");
                    pg.field_f[8 * var3_int + 7] = param0.a(true, "pix_skin" + var4 + "_picture_complete", "");
                    break L4;
                  }
                }
                pg.field_f[4 + 8 * var3_int] = param0.a(true, "pix_skin" + var4 + "_tile_rotate", "");
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("rf.M(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    rf() {
        this.field_e = new nj();
        this.field_f = new nj();
        this.field_l = new nj();
        this.field_p = new nj();
        this.field_b = new we(6);
        this.field_h = 0;
        this.field_a = (byte) 0;
        this.field_m = 0;
        this.field_g = new we(10);
    }

    static {
        field_i = new dq();
    }
}
