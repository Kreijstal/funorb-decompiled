/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class vh {
    int field_c;
    int field_C;
    pf field_y;
    pf field_x;
    pf field_g;
    pf field_r;
    int field_p;
    int field_s;
    dj field_q;
    static boolean field_n;
    pf field_u;
    static ql field_f;
    int field_k;
    pf field_l;
    static int field_t;
    int field_d;
    private int field_v;
    int field_z;
    pf field_b;
    private boolean field_i;
    int field_e;
    static String field_A;
    static String field_o;
    static String field_h;
    int field_w;
    int field_j;
    static String field_m;
    static vn field_a;

    final static String a(int param0, int param1, CharSequence[] param2) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 1) {
                var10 = param2[0];
                var4 = var10;
                if (var4 == null) {
                  stackOut_9_0 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  return ((Object) (Object) var10).toString();
                }
              } else {
                var4_int = param0;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_23_0 = var6.toString();
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param2[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param2[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4_ref;
            stackOut_25_1 = new StringBuilder().append("vh.B(").append(param0).append(44).append(0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + 1 + 41);
        }
        return stackIn_24_0;
    }

    final void a(String param0, byte param1, int param2, int param3) {
        try {
            if (((vh) this).field_i) {
                this.b(param2, 106, param0, param3);
            } else {
                this.a(-1, param3, param0, param2);
            }
            int var5_int = 115 % ((8 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vh.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        da.a(param1, param0, 126, param4, param3);
        if (param2 != 3) {
            ((vh) this).a(35, 119, -25, 90, 75, 85, 23);
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var5_int = ((vh) this).field_q.b(param2);
              var6 = ((vh) this).field_q.field_o + ((vh) this).field_q.field_m;
              var7 = param1;
              if (de.field_e >= var5_int + (var7 + 6)) {
                break L1;
              } else {
                var7 = -6 + (de.field_e + -var5_int);
                break L1;
              }
            }
            L2: {
              var8 = -((vh) this).field_q.field_o + (param3 - -32);
              if (de.field_j < var6 + (var8 - -6)) {
                var8 = -6 + (-var6 + de.field_j);
                break L2;
              } else {
                break L2;
              }
            }
            de.a(var7, var8, var5_int - -6, var6 + 6, ((vh) this).field_v);
            de.d(var7 - -1, var8 - -1, var5_int + 4, 4 + var6, ((vh) this).field_c);
            ((vh) this).field_q.a(param2, var7 - -3, 3 + (var8 - -((vh) this).field_q.field_o), ((vh) this).field_v, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("vh.L(").append(-1).append(44).append(param1).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    private final void b(int param0, int param1, String param2, int param3) {
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = ((vh) this).field_s + ((vh) this).field_w;
            var6 = ((vh) this).field_k + ((vh) this).field_e;
            var7 = ((vh) this).field_d;
            L1: {
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((vh) this).field_q.field_C - -((vh) this).field_q.field_m;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = de.field_e >> 2;
                var9 = ((vh) this).field_q.b(param2);
                var10 = ((vh) this).field_q.field_m + ((vh) this).field_q.field_C;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param2.indexOf("<br>") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 + (-1 + (var13 + var9 % var8)) / var13 * 2;
                  break L4;
                }
              }
              L5: {
                if (oj.field_f != null) {
                  break L5;
                } else {
                  oj.field_f = new String[16];
                  break L5;
                }
              }
              var11 = ((vh) this).field_q.a(param2, new int[1], oj.field_f);
              var9 = 0;
              var10 = var10 + (var11 - 1) * var7;
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((vh) this).field_q.b(oj.field_f[var13]);
                    if (var14 <= var9) {
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
              var12 = param3;
              if (de.field_e < var5_int + (var9 + var12)) {
                var12 = -var9 + (de.field_e - var5_int);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + (param0 + -((vh) this).field_q.field_o);
              if (de.field_j >= var10 + var13 + var6) {
                break L9;
              } else {
                var13 = -var6 + (-var10 + param0);
                break L9;
              }
            }
            de.a(var12, var13, var9 + var5_int, var6 + var10, ((vh) this).field_C);
            de.d(var12 + 1, 1 + var13, var9 + (var5_int + -2), -2 + var10 + var6, ((vh) this).field_c);
            int discarded$1 = ((vh) this).field_q.a(param2, ((vh) this).field_w + var12, ((vh) this).field_e + var13, var9, var10, ((vh) this).field_v, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("vh.K(").append(param0).append(44).append(106).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        de.b(param1, param4, param0, param2, param3);
        if (param5 <= 48) {
            vh.b(127);
        }
    }

    final void a(byte param0, dj param1) {
        RuntimeException var3 = null;
        mj var4 = null;
        qb[] var5 = null;
        mj var6 = null;
        int var7_int = 0;
        mj var7 = null;
        mj var8 = null;
        qb[] var9 = null;
        qb[] var10 = null;
        mj var11 = null;
        mj var12 = null;
        qb var13 = null;
        mj var14 = null;
        int var15 = 0;
        od var16 = null;
        jm var17 = null;
        od var18 = null;
        mj var19 = null;
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
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new jm(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_m + param1.field_C));
            ((vh) this).field_r = (pf) (Object) var17;
            var17.field_k = 16777215;
            var4 = new mj();
            var17.a((jm) (Object) var4, 1881);
            ((vh) this).field_s = 3;
            ((vh) this).field_w = 3;
            ((vh) this).field_k = 3;
            var4.field_o = 15658734;
            ((vh) this).field_c = 5592405;
            ((vh) this).field_q = param1;
            ((vh) this).field_v = 15658734;
            ((vh) this).field_e = 3;
            ((vh) this).field_d = -1;
            var4.field_e = 11711154;
            ((vh) this).field_C = 15658734;
            vc discarded$10 = var4.a((byte) -37, 0).b(0, 15658734).a((byte) -71, ff.a((byte) 109, 7829367, 10066329, 8947848));
            vc discarded$11 = var4.a((byte) -121, 1).a((byte) -71, ff.a((byte) 35, 13421772, 10066329, 11184810));
            vc discarded$12 = var4.a((byte) -68, 3).a((byte) -71, ff.a((byte) 53, 10066329, 7829367, 8947848)).c(-1, 1).a(1, (byte) 120);
            var5 = new qb[9];
            var16 = new od(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_A.length) {
                var5[4] = (qb) (Object) var18;
                vc discarded$13 = var4.a((byte) -62, 4).a(true, -5859).a((byte) -71, var5);
                vc discarded$14 = var4.a((byte) -113, 5).a((byte) -71, le.a(0, 0, 1, 0, 65793)).a(true, -5859).b(0, -1);
                ((vh) this).field_u = (pf) (Object) var4;
                var6 = new mj(var4, true);
                var6.field_i = 0;
                var7 = new mj(var4, true);
                var7.field_i = 0;
                var7.a(q.a(8947848, 0), -23165);
                vc discarded$15 = var7.a((byte) -28, 1).a((byte) -71, q.a(11184810, 0)).b(0, 2236962);
                ((vh) this).field_b = (pf) (Object) new si(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                of discarded$16 = new of(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                lh discarded$17 = new lh(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new mj();
                var17.a((jm) (Object) var8, 1881);
                vc discarded$18 = var8.a((byte) -25, 0).a((byte) -71, ff.a((byte) 104, 10066329, 7829367, 15658734)).b(0, 1118481).a(125, -1);
                vc discarded$19 = var8.a((byte) -100, 4).a(true, -5859).a((byte) -71, var5);
                ((vh) this).field_l = (pf) (Object) var8;
                var9 = new qb[9];
                var10 = new qb[9];
                var9[4] = new qb(2, 1);
                var10[4] = new qb(1, 2);
                var9[4].field_A = new int[]{6710886, 7829367};
                var10[4].field_A = new int[]{6710886, 7829367};
                var11 = new mj();
                var12 = new mj();
                var11.a((byte) -122, 0, var9);
                var12.a((byte) 123, 0, var10);
                ((vh) this).field_x = (pf) (Object) var12;
                ((vh) this).field_g = (pf) (Object) var4;
                var13 = new qb(7, 4);
                var13.field_A = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                ((vh) this).field_p = 10;
                if (param0 <= -62) {
                  var14 = new mj(var4, true);
                  var14.a(0, var13.g());
                  var13.c();
                  var14 = new mj(var4, true);
                  var14.a(0, var13.g());
                  var13.c();
                  var14 = new mj(var4, true);
                  var14.a(0, var13.g());
                  var13.c();
                  var19 = new mj(var4, true);
                  var19.a(0, var13);
                  break L0;
                } else {
                  return;
                }
              } else {
                var16.field_A[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vh.A(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_o = null;
        field_f = null;
        field_A = null;
        field_h = null;
        int var1 = -118 % ((44 - param0) / 63);
        field_a = null;
    }

    final static int a(boolean param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 >= 1) {
              if (!param0) {
                stackOut_6_0 = mg.field_C.b(param2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ko.field_j.b(param2);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 72;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vh.G(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static java.awt.Frame a(int param0, dl param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        uj[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        uj[] var10 = null;
        og var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) 46)) {
              L1: {
                if (0 == param5) {
                  var10 = aa.a(param1, (byte) 109);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (param2 != var10[var8].field_g) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param1.a(param2, param5, 112, param3, 0);
              L4: while (true) {
                if (var11.field_e != 0) {
                  var7 = (java.awt.Frame) var11.field_g;
                  if (var7 != null) {
                    if (2 != var11.field_e) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      fh.a(100, param1, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  int discarded$1 = 1;
                  ao.a(10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("vh.F(").append(0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 44 + 10 + 44 + param5 + 41);
        }
        return stackIn_27_0;
    }

    final void a(int param0) {
        oo.c(-15405);
        if (param0 <= 86) {
            Object var3 = null;
            ((vh) this).a((String) null, (byte) -95, 123, -107);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != 1) {
            return;
        }
        de.e(param6, param1, param3, param0, param2, param4);
    }

    public vh() {
        ((vh) this).field_i = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = false;
        field_f = new ql("");
        field_h = "Purchasing a prestige hat will cause you to lose ALL the current wands and spells that you have purchased. Are you sure you wish to do this? If you are certain, hold '<col=ffffff>CTRL</col>' and click the mouse.";
        field_m = "This is your RuneScape clan if you have one.";
    }
}
