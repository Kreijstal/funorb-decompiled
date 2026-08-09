/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wj {
    private kv field_N;
    private kv field_H;
    static int field_E;
    static kv[] field_A;
    int field_M;
    private int field_y;
    private int field_L;
    static String field_K;
    static ee field_F;
    private int field_J;
    private int field_O;
    private int field_C;
    boolean field_P;
    private int field_G;
    private kv field_z;
    static int field_I;
    private kv[] field_D;

    de(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 830858529, (16711422 & param6) >> -452272255);
    }

    private final void a(int param0, int param1, int param2, kv param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param1 + this.field_p;
              ah.a(-this.field_N.field_q + var5_int, (byte) -99, param0, param1 + this.field_N.field_q, this.field_q + param0);
              var6 = param1 + -this.field_C;
              if (param2 == 2) {
                break L1;
              } else {
                de.d(12, 87, 19);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  db.b(74);
                  if (param1 + this.field_N.field_q >= dg.field_f) {
                    bu.a(0, this.field_H);
                    param3.e(-this.field_C, 0);
                    param3.e(-this.field_C + this.field_J * 2, 0);
                    this.field_z.a(0, 0);
                    db.b(121);
                    this.field_H.e(param1, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (dg.field_h >= var5_int - this.field_N.field_q) {
                    bu.a(0, this.field_H);
                    var7 = -this.field_N.field_q + this.field_p + this.field_C;
                    L5: while (true) {
                      if (var7 <= this.field_J * 2) {
                        param3.e(-var7, 0);
                        param3.e(this.field_J * 2 + -var7, 0);
                        this.field_N.a(0, 0);
                        db.b(param2 + 107);
                        this.field_H.e(-this.field_N.field_q + var5_int, param0);
                        break L4;
                      } else {
                        var7 = var7 - this.field_J * 2;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param3.e(var6, param0);
                var6 = var6 + param3.field_q;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("de.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_G = 8355711 & param1 >> -383506687;
        this.field_L = 8355711 & param2 >> 1705304705;
        this.field_O = param1;
        this.field_y = param2;
        this.h(param0 ^ 1705304811);
        if (param0 != 1705304705) {
            de.d(49, -4, 45);
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_I = -48;
        }
        field_K = null;
        field_F = null;
        field_A = null;
    }

    final void a(int param0, int param1, wj param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_P) {
                break L1;
              } else {
                this.field_C = this.field_C + 1;
                if (2 * this.field_J >= this.field_C) {
                  break L1;
                } else {
                  this.field_C = this.field_C - 2 * this.field_J;
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 20) {
                break L2;
              } else {
                de.d(13, 12, 21);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("de.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final kv g(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (param0 != 5) {
            return (kv) null;
        }
        int var2 = this.field_q >> -1667938687;
        kv var3 = new kv(var2, this.field_q);
        bu.a(param0 + -5, var3);
        for (var4 = 0; this.field_q > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_q + -var4));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                dg.a(var5, var4, var8 << -1735154168 | var8 | var8 << 1981766768);
            }
        }
        db.b(param0 ^ 124);
        return var3;
    }

    private final kv b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = BachelorFridge.field_y;
        kv var14 = new kv(2 * this.field_J, this.field_q);
        bu.a(0, var14);
        int var5 = this.field_q >> -189066559;
        if (param2 > -13) {
            de.d(117, -107, -102);
        }
        for (var6 = 0; var6 < this.field_q; var6++) {
            var7 = (var6 >> -1708043071) * (-1 + this.field_J * 2) % (2 * this.field_J);
            var8 = 16711935 & param1;
            var9 = param1 & 65280;
            var10 = -var5 + var6;
            var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
            var12 = -257 < (var11 ^ -1) ? (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 499385608 : var9 | var8;
            dg.e(var7, var6, this.field_J, var12);
            dg.e(var7 - this.field_J * 2, var6, this.field_J, var12);
            var8 = 16711935 & param0;
            var9 = 65280 & param0;
            var12 = (var11 ^ -1) > -257 ? (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 778012328 : var8 | var9;
            dg.e(this.field_J + var7, var6, this.field_J, var12);
            dg.e(-this.field_J + var7, var6, this.field_J, var12);
        }
        db.b(108);
        return var14;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(117);
    }

    private final void h(int param0) {
        this.field_D = new kv[]{this.b(this.field_y, this.field_O, -47), this.b(this.field_L, this.field_G, -126)};
        this.field_N = this.g(5);
        if (param0 <= 92) {
            de.d(84, 78, 72);
        }
        this.field_z = this.field_N.h();
        this.field_H = new kv(this.field_q >> -1965937311, this.field_q);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        int var5 = param3 - -this.field_s;
        int var6 = this.field_v + param1;
        int var7 = 102 % ((-20 - param0) / 54);
        this.a(var6, var5, 2, this.field_D[0]);
        if (this.field_M < 65536) {
            ah.a(var5 - -this.field_p, (byte) 97, var6, var5 + (this.field_p * this.field_M >> 244391664), this.field_q + var6);
            this.a(var6, var5, 2, this.field_D[1]);
            db.b(70);
        }
    }

    private de(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param8;
        this.field_O = param5;
        this.field_J = param4;
        this.field_G = param7;
        this.field_y = param6;
        this.a(param0, param3, (byte) 59, param2, param1);
    }

    final static int d(int param0, int param1, int param2) {
        if (param1 != -257) {
            field_A = (kv[]) null;
        }
        if ((param2 ^ -1) > -3) {
            if (param0 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        field_I = 555;
        field_K = "Friends";
    }
}
