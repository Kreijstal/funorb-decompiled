/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    short[] field_P;
    int field_D;
    short[] field_y;
    short[] field_K;
    private boolean field_A;
    short[] field_w;
    short[] field_b;
    short[] field_g;
    int field_d;
    static int[] field_j;
    int[] field_F;
    int field_a;
    int[] field_p;
    short[] field_z;
    int field_C;
    short[] field_m;
    short field_c;
    int[] field_Q;
    short[] field_n;
    int[] field_e;
    static int field_o;
    byte field_f;
    int[] field_l;
    int field_J;
    short[] field_i;
    short[] field_s;
    byte[] field_x;
    int[] field_v;
    static String field_I;
    short[] field_q;
    int[] field_h;
    int field_t;
    short[] field_E;
    short[] field_u;
    short[] field_G;
    short[] field_r;
    short[] field_O;
    short[] field_H;
    short field_k;
    static String field_N;
    int[] field_B;
    short field_L;
    int[] field_M;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        for (var6 = 0; var6 < this.field_c; var6++) {
            this.field_n[var6] = (short)(this.field_n[var6] * param1 / param3);
            this.field_E[var6] = (short)(param0 * this.field_E[var6] / param3);
            this.field_H[var6] = (short)(this.field_H[var6] * param4 / param3);
        }
        if (param2 != 40) {
            this.field_n = (short[]) null;
        }
        this.a((byte) -59);
    }

    final static void b(int param0) {
        hk var1 = (hk) ((Object) ij.field_J.b(-27493));
        if (!(var1 != null)) {
            var1 = new hk();
        }
        if (param0 != 511) {
            pf.b((byte) 22);
        }
        var1.a(si.field_e, si.field_i, si.field_a, -12131, si.field_j, si.field_l, si.field_b, si.field_k);
        ak.field_i.a(var1, 114);
    }

    final static void a(int param0, boolean param1, p param2, int param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (31 == param2.field_i) {
                  break L2;
                } else {
                  if (-36 == (param2.field_i ^ -1)) {
                    break L2;
                  } else {
                    if (param2.field_i != 17) {
                      var4_int = param2.field_e / 2;
                      break L1;
                    } else {
                      if (-1 == (1 & param2.field_e ^ -1)) {
                        var4_int = param2.field_e / 4;
                        break L1;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
              }
              var4_int = param2.field_e / 7;
              break L1;
            }
            L3: {
              if (0 > var4_int) {
                var4_int = 0;
                break L3;
              } else {
                break L3;
              }
            }
            if (param1) {
              L4: {
                if (me.field_ib.length > var4_int) {
                  break L4;
                } else {
                  var4_int = -1 + me.field_ib.length;
                  break L4;
                }
              }
              L5: {
                if (!kd.field_t) {
                  me.field_ib[var4_int].a(true, 128, (int)param2.field_c, param3, param0);
                  break L5;
                } else {
                  nj.a(param3, 128, param0, 22173, me.field_ib[var4_int], (int)param2.field_c);
                  break L5;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int[] param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    field_N = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                param0[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("pf.H(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        de.c(-1);
        rj.field_K = true;
        li.field_o = true;
        if (param0 != -64) {
            return;
        }
        im.field_e.f((byte) 32);
        qa.a(false, (byte) -37, uj.field_h);
    }

    public static void a(boolean param0) {
        field_j = null;
        field_I = null;
        if (!param0) {
            return;
        }
        field_N = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (pl.a(param2, 12864, param0)) {
              var3_int = 48 / ((20 - param1) / 39);
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!aa.a(param0.charAt(var4), (byte) 108)) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("pf.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bd var11 = null;
        bd var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var11 = di.field_b[param3];
            var12 = var11;
            var6 = 0;
            var7 = param2;
            L1: while (true) {
              if (var12.field_r <= var7) {
                break L0;
              } else {
                var8 = 0;
                L2: while (true) {
                  if (var12.field_u <= var8) {
                    var6 = var6 + var12.field_u;
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      var9 = var11.field_D[var6 + var8];
                      if (-1 != (var9 ^ -1)) {
                        L4: {
                          if (param4 == 16728128) {
                            var9 = 262401 * (((16713802 & var9) >> -532904720) / 4);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        si.a(-1 + param0 + (var12.field_u + -var8), var7 + param1, var9);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "pf.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = HostileSpawn.field_I ? 1 : 0;
        int var5 = 0;
        if (param1 >= -15) {
            field_o = -32;
        }
        while (this.field_c > var5) {
            this.field_n[var5] = (short)(this.field_n[var5] + param0);
            this.field_E[var5] = (short)(this.field_E[var5] + param2);
            this.field_H[var5] = (short)(this.field_H[var5] + param3);
            var5++;
        }
        this.a((byte) 94);
    }

    final static boolean a(int param0) {
        if (param0 >= -109) {
            field_j = (int[]) null;
        }
        na.field_b = true;
        dh.field_c = 15000L + hn.a((byte) 80);
        return 11 == fa.field_c ? true : false;
    }

    private final void a(byte param0) {
        int var2 = 126 % ((28 - param0) / 56);
        this.field_A = false;
    }

    final void c(int param0) {
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
        CharSequence var13;
        var12 = HostileSpawn.field_I ? 1 : 0;
        if (!this.field_A) {
          L0: {
            this.field_A = true;
            if (param0 < -71) {
              break L0;
            } else {
              var13 = (CharSequence) null;
              pf.a((CharSequence) null, -79, true);
              break L0;
            }
          }
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= this.field_c) {
              this.field_d = var2;
              this.field_D = var4;
              this.field_C = var6;
              this.field_t = var7;
              this.field_a = var3;
              this.field_J = var5;
              return;
            } else {
              L2: {
                var9 = this.field_n[var8];
                var10 = this.field_E[var8];
                if (var3 <= var10) {
                  break L2;
                } else {
                  var3 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 < var2) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = this.field_H[var8];
                if (var5 >= var9) {
                  break L4;
                } else {
                  var5 = var9;
                  break L4;
                }
              }
              L5: {
                if (var6 >= var10) {
                  break L5;
                } else {
                  var6 = var10;
                  break L5;
                }
              }
              L6: {
                if (var4 > var11) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    pf() {
        this.field_A = false;
        this.field_f = (byte) 0;
    }

    static {
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_o = 0;
        field_I = null;
        field_N = "To server list";
    }
}
