/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends bj implements qb {
    static ed[][] field_M;
    static hh field_J;
    private int field_H;
    static om field_P;
    private pn field_K;
    static int field_N;
    private String field_G;
    private hc[] field_I;
    private int[] field_O;
    private wl field_L;

    final static void a(int param0, boolean param1) {
        if (!param1) {
            field_M = (ed[][]) null;
        }
        sn.field_d = 1000000000L / (long)param0;
    }

    public static void j(int param0) {
        field_P = null;
        field_J = null;
        if (param0 != 8) {
            return;
        }
        field_M = (ed[][]) null;
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        if (param0) {
            return;
        }
        try {
            var4_int = this.field_H;
            this.a(1 + var4_int, 106);
            this.field_I[var4_int] = this.a((wn) (this), (byte) -67, param1);
            this.field_O[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!(param0 > this.field_H)) {
            return;
        }
        hc[] var7 = new hc[param0];
        hc[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; this.field_H > var5; var5++) {
            var7[var5] = this.field_I[var5];
            var4[var5] = this.field_O[var5];
        }
        this.field_I = var3;
        this.field_O = var4;
        this.field_H = param0;
        if (param1 < 98) {
            field_N = -54;
        }
    }

    final hc a(wn param0, byte param1, String param2) {
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        hc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new hc(param2, param0);
              var4.field_s = (db) ((Object) new ck());
              var5 = this.field_x - 2;
              if (param1 == -67) {
                break L1;
              } else {
                var6 = (byte[]) null;
                qi.a(114, 51, (byte[]) null, (byte) 116);
                break L1;
              }
            }
            this.a(this.field_g, 0, 0, true, this.field_x - -34);
            var4.a(this.field_g + -14, var5, 7, true, 30);
            this.b(var4, false);
            stackIn_3_0 = (hc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("qi.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    qi(pn param0, wl param1, String param2) {
        super(0, 0, 288, 0, (db) null);
        int var4_int = 0;
        this.field_H = 0;
        try {
            this.field_G = param2;
            this.field_L = param1;
            this.field_K = param0;
            var4_int = this.field_G == null ? 0 : this.field_L.b(this.field_G, 260, this.field_L.field_r);
            this.a(288, 0, 0, true, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var6_int = 0;
            if (param3 == 1) {
              L1: while (true) {
                L2: {
                  if (var6_int >= this.field_H) {
                    break L2;
                  } else {
                    if (this.field_I[var6_int] != param0) {
                      var6_int++;
                      continue L1;
                    } else {
                      var7 = this.field_O[var6_int];
                      if ((var7 ^ -1) != 0) {
                        lj.a(this.field_O[var6_int], 57);
                        break L2;
                      } else {
                        this.field_K.o(-18861);
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("qi.K(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param3 >= 0) {
            if (!(-1 != (mh.field_a[param3 * 8] ^ -1))) {
                mh.field_a[param3 * 8] = (int)(Math.random() * (double)(param1 + (10 - param6)) * 0.06) + 2;
                mh.field_a[1 + param3 * 8] = 2 - -(int)((double)(param1 + 10 - param6) * Math.random() * 0.06) + mh.field_a[8 * param3];
                mh.field_a[2 + 8 * param3] = (int)(0.06 * ((double)(param1 + (10 + -param6)) * Math.random())) + 2;
                mh.field_a[3 + param3 * 8] = (int)((double)(-param6 + param1 + 10) * Math.random() * 0.06) + (2 + mh.field_a[8 * param3 - -2]);
                mh.field_a[8 * param3 + 4] = (int)(Math.random() * (double)(-param4 + (param7 + 10)) * 0.06) + 2;
                mh.field_a[8 * param3 + 5] = (int)(Math.random() * (double)(10 - -param7 + -param4) * 0.06) + 2 - -mh.field_a[4 + param3 * 8];
                mh.field_a[6 + param3 * 8] = 2 - -(int)((double)(-param4 + (param7 + 10)) * Math.random() * 0.06);
                mh.field_a[param3 * 8 - -7] = (int)((double)(-param4 + 10 + param7) * Math.random() * 0.06) + (2 - -mh.field_a[6 + 8 * param3]);
            }
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        if (!((param3 ^ -1) > -1)) {
            var15 = mh.field_a[param3 * 8 - -6];
            var13 = mh.field_a[4 + 8 * param3];
            var11 = mh.field_a[8 * param3 - -2];
            var10 = mh.field_a[8 * param3 - -1];
            var9 = mh.field_a[param3 * 8];
            var14 = mh.field_a[param3 * 8 + 5];
            var12 = mh.field_a[3 + param3 * 8];
            var16 = mh.field_a[7 + 8 * param3];
        }
        if (1 == (param3 ^ -1)) {
            var11 = 8;
            var16 = var15 + 6;
            var14 = 3 - -var13;
            var12 = 4 - -var11;
        }
        em.e(-(param8 * 16) + -var9 + param6, param4, var10 + (param1 - param6), param0);
        em.e(16 * param8 + (-var9 + param6), param4, var10 + (param1 - param6), param0);
        int var17 = -30 % ((param5 - 20) / 45);
        em.e(-(16 * param8) + -var11 + param6, -1 + param7, -param6 + (param1 + var12), param0);
        em.e(-var11 + param6 + param8 * 16, param7 + -1, var12 + (-param6 + param1), param0);
        em.g(param6, -(12 * param8) + (-var13 + param4), param7 + (-param4 - -var14), param0);
        em.g(param6, -var13 + (param4 - -(12 * param8)), var14 + -param4 + param7, param0);
        em.g(-1 + param1, -(12 * param8) + (param4 - var15), param7 + (-param4 - -var16), param0);
        em.g(param1 - 1, 12 * param8 + (-var15 + param4), -param4 + (param7 + var16), param0);
        em.e(-var9 + param6 - -(param8 * 16), param4, -param6 + (param1 - -var10) - param8 * 32, param2);
        em.e(-var11 + param6 + param8 * 16, param7 + -1, -(32 * param8) + (var12 + -param6) + param1, param2);
        em.g(param6, param8 * 12 + (param4 - var13), -(24 * param8) + -param4 + (param7 + var14), param2);
        em.g(-1 + param1, 12 * param8 + (param4 + -var15), var16 + (-param4 + (param7 - param8 * 24)), param2);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 85) {
            qi.a(-30, 97, 116, 20, 118, -63, -60, -67, 114);
        }
        super.a(param0, (byte) 103, param2, param3);
        this.field_L.a(this.field_G, 14 + (this.field_k + param3), 10 + param0 + this.field_j, -28 + this.field_g, this.field_x, 16777215, -1, 0, 0, this.field_L.field_r);
    }

    final static String a(int param0, int param1, byte[] param2, byte param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var12 = new char[param0];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var7 = -38 / ((61 - param3) / 36);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0) {
                stackIn_14_0 = new String(var12, 0, var5);
                break L0;
              } else {
                L2: {
                  var8 = param2[param1 + var6] & 255;
                  if (var8 != 0) {
                    L3: {
                      if (-129 < (var8 ^ -1)) {
                        break L3;
                      } else {
                        if (var8 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var9 = cn.field_c[var8 - 128];
                            if (var9 == 0) {
                              var9 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8 = var9;
                          break L3;
                        }
                      }
                    }
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = (char)var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("qi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_N = 0;
        field_P = new om(1, 2, 2, 0);
    }
}
