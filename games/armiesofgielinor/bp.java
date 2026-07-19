/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bp {
    static String field_m;
    static wk[] field_d;
    static je[] field_j;
    static int field_e;
    static String field_k;
    ui field_b;
    static int field_c;
    ui field_n;
    ui field_f;
    ui field_g;
    vh field_o;
    int field_l;
    long field_r;
    vh field_h;
    volatile int field_q;
    volatile int field_p;
    byte field_i;
    jf field_a;

    final boolean a(byte param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 51) {
          L0: {
            discarded$10 = this.d(100);
            if (-21 < (this.b(param0 + -179) ^ -1)) {
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
            if (-21 < (this.b(param0 + -179) ^ -1)) {
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

    final jf a(int param0, boolean param1, int param2, byte param3, boolean param4) {
        long var6 = 0L;
        jf var8 = null;
        jf stackIn_2_0 = null;
        jf stackIn_3_0 = null;
        jf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jf stackIn_15_0 = null;
        jf stackIn_16_0 = null;
        jf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jf stackOut_14_0 = null;
        jf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        jf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        jf stackOut_1_0 = null;
        jf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jf stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = ((long)param2 << 1222594912) - -(long)param0;
        var8 = new jf();
        var8.field_q = var6;
        var8.field_B = param3;
        if (!param1) {
          L0: {
            stackOut_14_0 = (jf) (var8);
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!param4) {
              stackOut_16_0 = (jf) ((Object) stackIn_16_0);
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = (jf) ((Object) stackIn_15_0);
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          L1: {
            stackIn_17_0.field_z = stackIn_17_1 != 0;
            if (param4) {
              break L1;
            } else {
              if (-21 >= (this.b(-120) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_f.a(var8, false);
                if (ArmiesOfGielinor.field_M) {
                  break L1;
                } else {
                  return var8;
                }
              }
            }
          }
          if (this.a(116) >= 20) {
            throw new RuntimeException();
          } else {
            this.field_b.a(var8, false);
            return var8;
          }
        } else {
          L2: {
            field_c = 46;
            stackOut_1_0 = (jf) (var8);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param4) {
              stackOut_3_0 = (jf) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (jf) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          L3: {
            stackIn_4_0.field_z = stackIn_4_1 != 0;
            if (param4) {
              break L3;
            } else {
              if (-21 >= (this.b(-120) ^ -1)) {
                throw new RuntimeException();
              } else {
                this.field_f.a(var8, false);
                if (ArmiesOfGielinor.field_M) {
                  break L3;
                } else {
                  return var8;
                }
              }
            }
          }
          if (this.a(116) >= 20) {
            throw new RuntimeException();
          } else {
            this.field_b.a(var8, false);
            return var8;
          }
        }
    }

    abstract boolean a(boolean param0);

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 14) {
          L0: {
            field_m = (String) null;
            if (this.a(88) < 20) {
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
            if (this.a(88) < 20) {
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

    public static void c(byte param0) {
        if (param0 != 35) {
            return;
        }
        field_d = null;
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final int b(int param0) {
        if (param0 >= -105) {
            return -114;
        }
        return this.field_f.a(30578) - -this.field_g.a(30578);
    }

    final int a(int param0) {
        if (param0 < 84) {
            return 64;
        }
        return this.field_b.a(30578) - -this.field_n.a(30578);
    }

    final static void a(int param0, int param1, int param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -96) {
                break L1;
              } else {
                bp.a(-87, 28, 102);
                break L1;
              }
            }
            var11 = dr.field_v[param0];
            var10 = var11;
            var9 = var10;
            var3 = var9;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var11.length) {
                break L0;
              } else {
                var11[var4] = param1;
                var5 = gq.a(var11[var4]);
                var6 = (524092 & var5) >> 1249207336;
                var6 = var6 + 5 * var4 / var11.length;
                var7 = 255 & var5;
                if (var8 == 0) {
                  L3: {
                    if ((var7 ^ -1) >= -7) {
                      break L3;
                    } else {
                      var7 = 6;
                      break L3;
                    }
                  }
                  var5 = var6 << -594979000 | -524033 & var5;
                  var5 = -256 & var5 | var7;
                  var9[var4] = gq.b(var5);
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "bp.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(byte param0);

    abstract void c(int param0);

    abstract void a(Object param0, boolean param1, int param2);

    bp() {
        this.field_b = new ui();
        this.field_n = new ui();
        this.field_f = new ui();
        this.field_g = new ui();
        this.field_o = new vh(6);
        this.field_q = 0;
        this.field_p = 0;
        this.field_i = (byte) 0;
        this.field_h = new vh(10);
    }

    static {
        field_e = 256;
        field_m = "Unfortunately you are not eligible to create an account.";
        field_k = "Waiting for sound effects";
        field_c = -1;
    }
}
