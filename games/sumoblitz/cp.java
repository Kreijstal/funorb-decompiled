/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    mh field_i;
    int field_l;
    int field_m;
    static String field_k;
    mh field_f;
    int field_u;
    int field_d;
    private int field_t;
    mh field_h;
    int field_s;
    mh field_j;
    int field_g;
    vn field_v;
    static int[] field_c;
    mh field_e;
    int field_a;
    mh field_p;
    int field_b;
    private boolean field_o;
    mh field_n;
    int field_r;
    int field_q;

    final static dk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_7_0 = null;
        dk stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = -62 / ((-57 - param0) / 48);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_9_0 = gs.field_a;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var5 = param1.charAt(var4);
                if (var5 >= 48) {
                  if (var5 <= 57) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (dk) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("cp.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0, int param1, int param2, String param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 13421772) {
                break L1;
              } else {
                ((cp) this).a(104, 13, -85, (byte) 98, -17);
                break L1;
              }
            }
            L2: {
              if (!((cp) this).field_o) {
                this.a(param0, param3, param2, -22699);
                break L2;
              } else {
                this.b(param2, param3, -84, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("cp.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        kw.a(param0, param2, 1, param1, param4);
        if (param3 > -57) {
            Object var7 = null;
            ((cp) this).a(-116, 1, -84, (String) null);
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((cp) this).field_v.a(param1);
              var6 = ((cp) this).field_v.field_y + ((cp) this).field_v.field_I;
              var7 = param2;
              if (var7 - -var5_int - -6 <= lk.field_b) {
                break L1;
              } else {
                var7 = lk.field_b - (var5_int + 6);
                break L1;
              }
            }
            L2: {
              var8 = 32 + -((cp) this).field_v.field_y + param0;
              if (lk.field_c >= 6 + (var8 - -var6)) {
                break L2;
              } else {
                var8 = -6 + lk.field_c + -var6;
                break L2;
              }
            }
            lk.b(var7, var8, var5_int - -6, 6 + var6, ((cp) this).field_t);
            lk.d(var7 + 1, var8 - -1, var5_int + 4, 4 + var6, ((cp) this).field_d);
            ((cp) this).field_v.b(param1, var7 - -3, var8 - -3 - -((cp) this).field_v.field_y, ((cp) this).field_t, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("cp.H(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + -22699 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        lk.e(param3, param5, param1, param4, param0);
        if (param2) {
            ((cp) this).field_f = null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            la.a(param0, param1, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cp.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    private final void b(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((cp) this).field_l + ((cp) this).field_q;
              var6 = ((cp) this).field_s + ((cp) this).field_m;
              var7 = ((cp) this).field_u;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((cp) this).field_v.field_I + ((cp) this).field_v.field_s;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = lk.field_b >> 2;
                var9 = ((cp) this).field_v.a(param1);
                var10 = ((cp) this).field_v.field_s - -((cp) this).field_v.field_I;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param1.indexOf("<br>") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
                  break L4;
                } else {
                  var12 = var8;
                  break L4;
                }
              }
              L5: {
                if (null == qn.field_b) {
                  qn.field_b = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 = ((cp) this).field_v.a(param1, new int[1], qn.field_b);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((cp) this).field_v.a(qn.field_b[var13]);
                    if (var9 >= var14) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param0;
              var13 = 70 / ((74 - param2) / 40);
              if (lk.field_b >= var5_int + var12 - -var9) {
                break L8;
              } else {
                var12 = -var5_int + lk.field_b - var9;
                break L8;
              }
            }
            L9: {
              var14 = 32 + (-((cp) this).field_v.field_y + param3);
              if (lk.field_c < var6 + var14 + var10) {
                var14 = -var10 + param3 - var6;
                break L9;
              } else {
                break L9;
              }
            }
            lk.b(var12, var14, var9 + var5_int, var10 - -var6, ((cp) this).field_r);
            lk.d(var12 - -1, 1 + var14, var5_int + var9 - 2, var6 + var10 + -2, ((cp) this).field_d);
            int discarded$1 = ((cp) this).field_v.a(param1, var12 - -((cp) this).field_l, var14 - -((cp) this).field_s, var9, var10, ((cp) this).field_t, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("cp.E(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(vn param0, byte param1) {
        RuntimeException var3 = null;
        fl var4 = null;
        wb[] var5 = null;
        fl var6 = null;
        int var7_int = 0;
        fl var7 = null;
        fl var8 = null;
        wb[] var9 = null;
        wb[] var10 = null;
        fl var11 = null;
        fl var12 = null;
        wb var13 = null;
        fl var14 = null;
        int var15 = 0;
        mg var16 = null;
        gm var17 = null;
        mg var18 = null;
        fl var19 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var17 = new gm(param0, 2, 2, 2236962, 1, 1, 1, param0.field_I + (param0.field_s + 2));
            ((cp) this).field_e = (mh) (Object) var17;
            var17.field_d = 16777215;
            var4 = new fl();
            var17.a((gm) (Object) var4, -102);
            ((cp) this).field_s = 3;
            ((cp) this).field_m = 3;
            ((cp) this).field_l = 3;
            ((cp) this).field_d = 5592405;
            ((cp) this).field_v = param0;
            var4.field_b = 15658734;
            ((cp) this).field_r = 15658734;
            ((cp) this).field_q = 3;
            ((cp) this).field_t = 15658734;
            ((cp) this).field_u = -1;
            var4.field_l = 11711154;
            sm discarded$10 = var4.a(false, 0).c(15658734, 17818).a(ta.a(8947848, 92, 10066329, 7829367), 2147483647);
            sm discarded$11 = var4.a(false, 1).a(ta.a(11184810, 126, 10066329, 13421772), 2147483647);
            sm discarded$12 = var4.a(false, 3).a(ta.a(8947848, 97, 7829367, 10066329), 2147483647).a(1, -1).b(1, 1);
            var5 = new wb[9];
            var16 = new mg(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var18.field_C.length <= var7_int) {
                L2: {
                  if (param1 < -37) {
                    break L2;
                  } else {
                    ((cp) this).field_i = null;
                    break L2;
                  }
                }
                var5[4] = (wb) (Object) var18;
                sm discarded$13 = var4.a(false, 4).a(true, true).a(var5, 2147483647);
                sm discarded$14 = var4.a(false, 5).a(ks.a((byte) -71, 0, 65793, 0, 0), 2147483647).a(true, true).c(-1, 17818);
                ((cp) this).field_h = (mh) (Object) var4;
                var6 = new fl(var4, true);
                var6.field_f = 0;
                var7 = new fl(var4, true);
                var7.field_f = 0;
                var7.a(ua.a(8947848, -115), 28715);
                sm discarded$15 = var7.a(false, 1).a(ua.a(11184810, -125), 2147483647).c(2236962, 17818);
                ((cp) this).field_i = (mh) (Object) new vg(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                va discarded$16 = new va(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                iu discarded$17 = new iu(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new fl();
                var17.a((gm) (Object) var8, 107);
                sm discarded$18 = var8.a(false, 0).a(ta.a(15658734, 102, 7829367, 10066329), 2147483647).c(1118481, 17818).d(-1, 30149);
                sm discarded$19 = var8.a(false, 4).a(true, true).a(var5, 2147483647);
                ((cp) this).field_j = (mh) (Object) var8;
                var9 = new wb[9];
                var9[4] = new wb(2, 1);
                var10 = new wb[9];
                var10[4] = new wb(1, 2);
                var9[4].field_C = new int[]{6710886, 7829367};
                var10[4].field_C = new int[]{6710886, 7829367};
                var11 = new fl();
                var12 = new fl();
                var11.a((byte) 116, var9, 0);
                var12.a((byte) 115, var10, 0);
                ((cp) this).field_f = (mh) (Object) var12;
                ((cp) this).field_p = (mh) (Object) var4;
                var13 = new wb(7, 4);
                ((cp) this).field_g = 10;
                var13.field_C = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new fl(var4, true);
                var14.a(-84, var13.b());
                var13.c();
                var14 = new fl(var4, true);
                var14.a(30, var13.b());
                var13.c();
                var14 = new fl(var4, true);
                var14.a(111, var13.b());
                var13.c();
                var19 = new fl(var4, true);
                var19.a(-29, var13);
                break L0;
              } else {
                var16.field_C[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cp.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_k = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        lk.b(param4, param6, param5, param2, param3, param0);
        if (param1 != 3) {
            Object var9 = null;
            byte[] discarded$0 = cp.a((byte[]) null, -45);
        }
    }

    final void b(byte param0) {
        su.a((byte) -59);
        if (param0 >= -63) {
            Object var3 = null;
            byte[] discarded$0 = cp.a((byte[]) null, 126);
        }
    }

    public cp() {
        ((cp) this).field_o = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[128];
        field_k = "Instructions";
    }
}
