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

    final static void a() {
        sn.field_d = 20000000L;
    }

    public static void j() {
        field_P = null;
        field_J = null;
        field_M = null;
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        if (param0) {
            return;
        }
        try {
            var4_int = ((qi) this).field_H;
            this.a(1 + var4_int, 106);
            ((qi) this).field_I[var4_int] = ((qi) this).a((wn) this, (byte) -67, param1);
            ((qi) this).field_O[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qi.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!(param0 > ((qi) this).field_H)) {
            return;
        }
        hc[] var7 = new hc[param0];
        hc[] var8 = var7;
        hc[] var3 = var8;
        int[] var4 = new int[param0];
        for (var5 = 0; ((qi) this).field_H > var5; var5++) {
            var7[var5] = ((qi) this).field_I[var5];
            var4[var5] = ((qi) this).field_O[var5];
        }
        ((qi) this).field_I = var8;
        ((qi) this).field_O = var4;
        ((qi) this).field_H = param0;
    }

    final hc a(wn param0, byte param1, String param2) {
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        hc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new hc(param2, param0);
              var4.field_s = (db) (Object) new ck();
              var5 = ((qi) this).field_x - 2;
              if (param1 == -67) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = qi.a(114, 51, (byte[]) null, (byte) 116);
                break L1;
              }
            }
            ((qi) this).a(((qi) this).field_g, 0, 0, true, ((qi) this).field_x - -34);
            var4.a(((qi) this).field_g + -14, var5, 7, true, 30);
            ((qi) this).b((hm) (Object) var4, false);
            stackOut_2_0 = (hc) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("qi.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    qi(pn param0, wl param1, String param2) {
        super(0, 0, 288, 0, (db) null);
        int var4_int = 0;
        ((qi) this).field_H = 0;
        try {
            ((qi) this).field_G = param2;
            ((qi) this).field_L = param1;
            ((qi) this).field_K = param0;
            var4_int = ((qi) this).field_G == null ? 0 : ((qi) this).field_L.b(((qi) this).field_G, 260, ((qi) this).field_L.field_r);
            ((qi) this).a(288, 0, 0, true, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var6_int = 0;
            if (param3 == 1) {
              L1: while (true) {
                L2: {
                  if (var6_int >= ((qi) this).field_H) {
                    break L2;
                  } else {
                    if (((qi) this).field_I[var6_int] != param0) {
                      var6_int++;
                      continue L1;
                    } else {
                      var7 = ((qi) this).field_O[var6_int];
                      if (var7 != -1) {
                        lj.a(((qi) this).field_O[var6_int], 57);
                        break L2;
                      } else {
                        ((qi) this).field_K.o(-18861);
                        break L2;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("qi.K(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          if (param3 < 0) {
            break L0;
          } else {
            if (mh.field_a[param3 * 8] == 0) {
              mh.field_a[param3 * 8] = (int)(Math.random() * (double)(param1 + (10 - param6)) * 0.06) + 2;
              mh.field_a[1 + param3 * 8] = 2 - -(int)((double)(param1 + 10 - param6) * Math.random() * 0.06) + mh.field_a[8 * param3];
              mh.field_a[2 + 8 * param3] = (int)(0.06 * ((double)(param1 + (10 + -param6)) * Math.random())) + 2;
              mh.field_a[3 + param3 * 8] = (int)((double)(-param6 + param1 + 10) * Math.random() * 0.06) + (2 + mh.field_a[8 * param3 - -2]);
              mh.field_a[8 * param3 + 4] = (int)(Math.random() * (double)(-param4 + (param7 + 10)) * 0.06) + 2;
              mh.field_a[8 * param3 + 5] = (int)(Math.random() * (double)(10 - -param7 + -param4) * 0.06) + 2 - -mh.field_a[4 + param3 * 8];
              mh.field_a[6 + param3 * 8] = 2 - -(int)((double)(-param4 + (param7 + 10)) * Math.random() * 0.06);
              mh.field_a[param3 * 8 - -7] = (int)((double)(-param4 + 10 + param7) * Math.random() * 0.06) + (2 - -mh.field_a[6 + 8 * param3]);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          if (param3 >= 0) {
            var15 = mh.field_a[param3 * 8 - -6];
            var13 = mh.field_a[4 + 8 * param3];
            var11 = mh.field_a[8 * param3 - -2];
            var10 = mh.field_a[8 * param3 - -1];
            var9 = mh.field_a[param3 * 8];
            var14 = mh.field_a[param3 * 8 + 5];
            var12 = mh.field_a[3 + param3 * 8];
            var16 = mh.field_a[7 + 8 * param3];
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param3 != -2) {
            break L2;
          } else {
            var11 = 8;
            var16 = var15 + 6;
            var14 = 3 - -var13;
            var12 = 4 - -var11;
            break L2;
          }
        }
        em.e(-(param8 * 16) + -var9 + param6, param4, var10 + (param1 - param6), param0);
        em.e(16 * param8 + (-var9 + param6), param4, var10 + (param1 - param6), param0);
        var17 = -30 % ((param5 - 20) / 45);
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
        int discarded$0 = ((qi) this).field_L.a(((qi) this).field_G, 14 + (((qi) this).field_k + param3), 10 + param0 + ((qi) this).field_j, -28 + ((qi) this).field_g, ((qi) this).field_x, 16777215, -1, 0, 0, ((qi) this).field_L.field_r);
    }

    final static String a(int param0, int param1, byte[] param2, byte param3) {
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
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var14 = new char[param0];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var7 = -38 / ((61 - param3) / 36);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0) {
                stackOut_13_0 = new String(var14, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var8 = param2[param1 + var6] & 255;
                  if (var8 != 0) {
                    L3: {
                      if (var8 < 128) {
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
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var8;
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
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("qi.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_P = new om(1, 2, 2, 0);
    }
}
