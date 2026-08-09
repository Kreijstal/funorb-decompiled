/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hj extends IOException {
    static String field_e;
    static int[] field_a;
    static volatile boolean field_d;
    static String field_c;
    static int field_b;

    final static void a(dj param0, eg param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        oo var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        dj var12 = null;
        int[] var16 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = gm.field_f;
            co.field_f = new kc(0L, (kc) null);
            if (param1 != null) {
              param1.field_h = false;
              param1.field_f = 0;
              bg.field_d = new kg(var3_int, param1, param1);
              th.field_d = new gn(var3_int, param1, param1, new la());
              var4 = gj.b(param2 ^ -20419);
              if (var4 == null) {
                var11 = (Throwable) null;
                jh.a((Throwable) null, "QC2", (byte) 20);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ff.a((byte) 91, var4);
                var12 = (dj) null;
                mj.field_z = ck.a(65793, 5138823, 65793, 8947848, 1513239, 4020342, 65793, (dj) null, 97, 0, 2245737, 1513239, 1127256);
                if (param2 == 3896) {
                  gl.field_c = ck.a(0, 0, 0, 0, 0, 0, 0, param0, 112, 16764006, 0, 0, 0);
                  ab.field_p = ck.a(0, 0, 0, 0, 0, 0, 0, param0, 81, 16777215, 0, 0, 0);
                  var5 = de.field_e;
                  var6 = de.field_j;
                  var16 = de.field_l;
                  ql.field_c = new qb(10, 14);
                  ql.field_c.a();
                  var8 = 2;
                  L1: while (true) {
                    if ((var8 ^ -1) <= -8) {
                      de.a(var16, var5, var6);
                      ag.field_C = bl.a(true, gl.field_c, ab.field_p, var4, mj.field_z);
                      co.field_f.field_G = new vn();
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      de.d(var8, 1 + var8, -(var8 << 886051649) + 14, 16777215);
                      var8++;
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              var10 = (Throwable) null;
              jh.a((Throwable) null, "QC1", (byte) 20);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("hj.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        nf stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        int stackIn_14_6;
        int stackIn_14_7;
        int stackIn_14_8;
        nf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_15_5 = 0;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        int stackIn_15_9 = 0;
        nf stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        int stackIn_17_8;
        nf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        int stackIn_18_9 = 0;
        nf stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        int stackIn_20_5;
        int stackIn_20_6;
        int stackIn_20_7;
        int stackIn_20_8;
        nf stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_21_6;
        int stackIn_21_7;
        int stackIn_21_8;
        int stackIn_21_9;
        nf stackIn_24_0;
        int stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_24_8;
        nf stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        int stackIn_25_9 = 0;
        nf stackIn_27_0;
        int stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_27_8;
        nf stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int stackIn_28_7 = 0;
        int stackIn_28_8 = 0;
        int stackIn_28_9 = 0;
        nf stackIn_30_0;
        int stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_30_5;
        int stackIn_30_6;
        int stackIn_30_7;
        int stackIn_30_8;
        nf stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_31_5;
        int stackIn_31_6;
        int stackIn_31_7;
        int stackIn_31_8;
        int stackIn_31_9;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Object var2 = null;
        ml var3 = null;
        ml var4 = null;
        int var5 = 0;
        vn var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = rk.field_O.g((byte) 101);
              var2 = null;
              var3 = (ml) ((Object) var6.b(param0 + 33225));
              if (param0 == -20602) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                L3: {
                  var4 = rk.field_O.a(0, true);
                  if (var2 == null) {
                    break L3;
                  } else {
                    L4: {
                      rk.field_O.c(-4207, ((ml) (var2)).field_T);
                      rk.field_O.a(((ml) (var2)).field_T, 157, (byte) 0, 0, 0, 0, 0, ((ml) (var2)).field_T, 0);
                      if (100 >= Math.abs(var4.field_lb + -((ml) (var2)).field_lb)) {
                        L5: {
                          stackIn_24_0 = rk.field_O;

                          stackIn_24_1 = ((ml) (var2)).field_T;

                          stackIn_24_2 = 158;

                          stackIn_24_3 = -115;

                          stackIn_24_4 = 32;

                          stackIn_24_5 = var4.field_lb;

                          stackIn_24_6 = var4.field_db;

                          stackIn_24_7 = 0;

                          stackIn_24_8 = ((ml) (var2)).field_T;

                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackIn_25_0 = (nf) ((Object) stackIn_24_0);
                            stackIn_25_1 = stackIn_24_1;
                            stackIn_25_2 = stackIn_24_2;
                            stackIn_25_3 = stackIn_24_3;
                            stackIn_25_4 = stackIn_24_4;
                            stackIn_25_5 = stackIn_24_5;
                            stackIn_25_6 = stackIn_24_6;
                            stackIn_25_7 = stackIn_24_7;
                            stackIn_25_8 = stackIn_24_8;
                            stackIn_25_9 = 0;
                            break L5;
                          } else {
                            stackIn_25_0 = (nf) ((Object) stackIn_24_0);
                            stackIn_25_1 = stackIn_24_1;
                            stackIn_25_2 = stackIn_24_2;
                            stackIn_25_3 = stackIn_24_3;
                            stackIn_25_4 = stackIn_24_4;
                            stackIn_25_5 = stackIn_24_5;
                            stackIn_25_6 = stackIn_24_6;
                            stackIn_25_7 = stackIn_24_7;
                            stackIn_25_8 = stackIn_24_8;
                            stackIn_25_9 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          ((nf) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, (byte) stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, stackIn_25_9);
                          stackIn_27_0 = rk.field_O;

                          stackIn_27_1 = ((ml) (var2)).field_T;

                          stackIn_27_2 = 158;

                          stackIn_27_3 = 34;

                          stackIn_27_4 = 0;

                          stackIn_27_5 = var4.field_lb;

                          stackIn_27_6 = var4.field_db;

                          stackIn_27_7 = 0;

                          stackIn_27_8 = ((ml) (var2)).field_T;

                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackIn_28_0 = (nf) ((Object) stackIn_27_0);
                            stackIn_28_1 = stackIn_27_1;
                            stackIn_28_2 = stackIn_27_2;
                            stackIn_28_3 = stackIn_27_3;
                            stackIn_28_4 = stackIn_27_4;
                            stackIn_28_5 = stackIn_27_5;
                            stackIn_28_6 = stackIn_27_6;
                            stackIn_28_7 = stackIn_27_7;
                            stackIn_28_8 = stackIn_27_8;
                            stackIn_28_9 = 5;
                            break L6;
                          } else {
                            stackIn_28_0 = (nf) ((Object) stackIn_27_0);
                            stackIn_28_1 = stackIn_27_1;
                            stackIn_28_2 = stackIn_27_2;
                            stackIn_28_3 = stackIn_27_3;
                            stackIn_28_4 = stackIn_27_4;
                            stackIn_28_5 = stackIn_27_5;
                            stackIn_28_6 = stackIn_27_6;
                            stackIn_28_7 = stackIn_27_7;
                            stackIn_28_8 = stackIn_27_8;
                            stackIn_28_9 = 3;
                            break L6;
                          }
                        }
                        L7: {
                          ((nf) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, (byte) stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, stackIn_28_9);
                          stackIn_30_0 = rk.field_O;

                          stackIn_30_1 = ((ml) (var2)).field_T;

                          stackIn_30_2 = 158;

                          stackIn_30_3 = -88;

                          stackIn_30_4 = 0;

                          stackIn_30_5 = var4.field_lb;

                          stackIn_30_6 = var4.field_db;

                          stackIn_30_7 = 0;

                          stackIn_30_8 = ((ml) (var2)).field_T;

                          if (var4.field_lb < ((ml) (var2)).field_lb) {
                            stackIn_31_0 = (nf) ((Object) stackIn_30_0);
                            stackIn_31_1 = stackIn_30_1;
                            stackIn_31_2 = stackIn_30_2;
                            stackIn_31_3 = stackIn_30_3;
                            stackIn_31_4 = stackIn_30_4;
                            stackIn_31_5 = stackIn_30_5;
                            stackIn_31_6 = stackIn_30_6;
                            stackIn_31_7 = stackIn_30_7;
                            stackIn_31_8 = stackIn_30_8;
                            stackIn_31_9 = 2;
                            break L7;
                          } else {
                            stackIn_31_0 = (nf) ((Object) stackIn_30_0);
                            stackIn_31_1 = stackIn_30_1;
                            stackIn_31_2 = stackIn_30_2;
                            stackIn_31_3 = stackIn_30_3;
                            stackIn_31_4 = stackIn_30_4;
                            stackIn_31_5 = stackIn_30_5;
                            stackIn_31_6 = stackIn_30_6;
                            stackIn_31_7 = stackIn_30_7;
                            stackIn_31_8 = stackIn_30_8;
                            stackIn_31_9 = 4;
                            break L7;
                          }
                        }
                        ((nf) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, (byte) stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_31_7, stackIn_31_8, stackIn_31_9);
                        rk.field_O.a(((ml) (var2)).field_T, 37, (byte) -100, 32, var4.field_lb, var4.field_db, var4.field_db, ((ml) (var2)).field_T, var4.field_lb);
                        break L4;
                      } else {
                        L8: {
                          stackIn_14_0 = rk.field_O;

                          stackIn_14_1 = ((ml) (var2)).field_T;

                          stackIn_14_2 = 158;

                          stackIn_14_3 = -92;

                          stackIn_14_4 = 0;

                          stackIn_14_5 = var4.field_lb;

                          stackIn_14_6 = var4.field_db;

                          stackIn_14_7 = 0;

                          stackIn_14_8 = ((ml) (var2)).field_T;

                          if (((ml) (var2)).field_lb <= var4.field_lb) {
                            stackIn_15_0 = (nf) ((Object) stackIn_14_0);
                            stackIn_15_1 = stackIn_14_1;
                            stackIn_15_2 = stackIn_14_2;
                            stackIn_15_3 = stackIn_14_3;
                            stackIn_15_4 = stackIn_14_4;
                            stackIn_15_5 = stackIn_14_5;
                            stackIn_15_6 = stackIn_14_6;
                            stackIn_15_7 = stackIn_14_7;
                            stackIn_15_8 = stackIn_14_8;
                            stackIn_15_9 = 4;
                            break L8;
                          } else {
                            stackIn_15_0 = (nf) ((Object) stackIn_14_0);
                            stackIn_15_1 = stackIn_14_1;
                            stackIn_15_2 = stackIn_14_2;
                            stackIn_15_3 = stackIn_14_3;
                            stackIn_15_4 = stackIn_14_4;
                            stackIn_15_5 = stackIn_14_5;
                            stackIn_15_6 = stackIn_14_6;
                            stackIn_15_7 = stackIn_14_7;
                            stackIn_15_8 = stackIn_14_8;
                            stackIn_15_9 = 2;
                            break L8;
                          }
                        }
                        L9: {
                          ((nf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, (byte) stackIn_15_3, stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7, stackIn_15_8, stackIn_15_9);
                          stackIn_17_0 = rk.field_O;

                          stackIn_17_1 = ((ml) (var2)).field_T;

                          stackIn_17_2 = 158;

                          stackIn_17_3 = 83;

                          stackIn_17_4 = 32;

                          stackIn_17_5 = var4.field_lb;

                          stackIn_17_6 = var4.field_db;

                          stackIn_17_7 = 0;

                          stackIn_17_8 = ((ml) (var2)).field_T;

                          if (var4.field_lb >= ((ml) (var2)).field_lb) {
                            stackIn_18_0 = (nf) ((Object) stackIn_17_0);
                            stackIn_18_1 = stackIn_17_1;
                            stackIn_18_2 = stackIn_17_2;
                            stackIn_18_3 = stackIn_17_3;
                            stackIn_18_4 = stackIn_17_4;
                            stackIn_18_5 = stackIn_17_5;
                            stackIn_18_6 = stackIn_17_6;
                            stackIn_18_7 = stackIn_17_7;
                            stackIn_18_8 = stackIn_17_8;
                            stackIn_18_9 = 1;
                            break L9;
                          } else {
                            stackIn_18_0 = (nf) ((Object) stackIn_17_0);
                            stackIn_18_1 = stackIn_17_1;
                            stackIn_18_2 = stackIn_17_2;
                            stackIn_18_3 = stackIn_17_3;
                            stackIn_18_4 = stackIn_17_4;
                            stackIn_18_5 = stackIn_17_5;
                            stackIn_18_6 = stackIn_17_6;
                            stackIn_18_7 = stackIn_17_7;
                            stackIn_18_8 = stackIn_17_8;
                            stackIn_18_9 = 0;
                            break L9;
                          }
                        }
                        L10: {
                          ((nf) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, (byte) stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, stackIn_18_9);
                          stackIn_20_0 = rk.field_O;

                          stackIn_20_1 = ((ml) (var2)).field_T;

                          stackIn_20_2 = 158;

                          stackIn_20_3 = -117;

                          stackIn_20_4 = 0;

                          stackIn_20_5 = var4.field_lb;

                          stackIn_20_6 = var4.field_db;

                          stackIn_20_7 = 0;

                          stackIn_20_8 = ((ml) (var2)).field_T;

                          if (((ml) (var2)).field_lb <= var4.field_lb) {
                            stackIn_21_0 = (nf) ((Object) stackIn_20_0);
                            stackIn_21_1 = stackIn_20_1;
                            stackIn_21_2 = stackIn_20_2;
                            stackIn_21_3 = stackIn_20_3;
                            stackIn_21_4 = stackIn_20_4;
                            stackIn_21_5 = stackIn_20_5;
                            stackIn_21_6 = stackIn_20_6;
                            stackIn_21_7 = stackIn_20_7;
                            stackIn_21_8 = stackIn_20_8;
                            stackIn_21_9 = 5;
                            break L10;
                          } else {
                            stackIn_21_0 = (nf) ((Object) stackIn_20_0);
                            stackIn_21_1 = stackIn_20_1;
                            stackIn_21_2 = stackIn_20_2;
                            stackIn_21_3 = stackIn_20_3;
                            stackIn_21_4 = stackIn_20_4;
                            stackIn_21_5 = stackIn_20_5;
                            stackIn_21_6 = stackIn_20_6;
                            stackIn_21_7 = stackIn_20_7;
                            stackIn_21_8 = stackIn_20_8;
                            stackIn_21_9 = 3;
                            break L10;
                          }
                        }
                        ((nf) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, (byte) stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, stackIn_21_7, stackIn_21_8, stackIn_21_9);
                        rk.field_O.a(((ml) (var2)).field_T, 36, (byte) 96, 64, var4.field_lb, var4.field_db, var4.field_db, ((ml) (var2)).field_T, var4.field_lb);
                        break L4;
                      }
                    }
                    rk.field_O.a(((ml) (var2)).field_T, 157, (byte) 27, 0, 0, 0, 0, ((ml) (var2)).field_T, 0);
                    break L3;
                  }
                }
                rk.field_O.e(true);
                rk.field_O.c(-4207, 3);
                break L0;
              } else {
                L11: {
                  if (-1 == (var3.y(17571) ^ -1)) {
                    break L11;
                  } else {
                    L12: {
                      if (Math.random() < 0.3) {
                        break L12;
                      } else {
                        if (var2 == null) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var2 = var3;
                    break L11;
                  }
                }
                var3 = (ml) ((Object) var6.a(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "hj.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 93) {
            nf var2 = (nf) null;
            hj.a((ll) null, -60, 88, (nf) null, (byte) -107, -114, 54);
        }
        field_c = null;
        field_e = null;
    }

    final static void a(ll param0, int param1, int param2, nf param3, byte param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param2 = param2 >> 1;
            param1 = param1 >> 1;
            param5 = param5 >> 1;
            if (param1 == 0) {
              L1: {
                if ((param5 ^ -1) > -1) {
                  break L1;
                } else {
                  if (0 > param2) {
                    break L1;
                  } else {
                    if (param5 >= param3.field_hb) {
                      break L1;
                    } else {
                      if (param2 < param3.field_Hb) {
                        var7_int = param5 - -(param3.field_hb * param2);
                        param0.field_m[var7_int] = (byte)param4;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((param1 ^ -1) > -1) {
                  param1 = -param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var7_int = param2 + -param1;
                if (0 > var7_int) {
                  var7_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8 = 1 + param2 - -param1;
                if (param3.field_Hb - 1 < var8) {
                  var8 = param3.field_Hb - 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              var9 = var7_int;
              var10 = param1 * param1;
              if (param6 <= -75) {
                L5: {
                  var11 = 0;
                  var12 = param2 + -var9;
                  var13 = var12 * var12;
                  var14 = var13 + -var12;
                  if (param2 > var8) {
                    param2 = var8;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: while (true) {
                  if (var9 >= param2) {
                    var11 = param1;
                    var12 = var9 - param2;
                    var14 = var12 * var12 + var10;
                    var13 = var14 + -var11;
                    var14 = var14 - var12;
                    L7: while (true) {
                      if (var8 <= var9) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L8: while (true) {
                          L9: {
                            if (var14 <= var10) {
                              break L9;
                            } else {
                              if ((var10 ^ -1) <= (var13 ^ -1)) {
                                break L9;
                              } else {
                                incrementValue$0 = var11;
                                var11--;
                                var14 = var14 - (incrementValue$0 + var11);
                                var13 = var13 - (var11 + var11);
                                continue L8;
                              }
                            }
                          }
                          L10: {
                            var15 = -var11 + param5;
                            if (var15 < 0) {
                              var15 = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var16 = param5 - -var11;
                            if (var16 > param3.field_hb + -1) {
                              var16 = param3.field_hb - 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var17 = var15 + var9 * param3.field_hb;
                          var18 = var15;
                          L12: while (true) {
                            if (var16 < var18) {
                              var14 = var14 + (var12 - -var12);
                              var9++;
                              incrementValue$1 = var12;
                              var12++;
                              var13 = var13 + (incrementValue$1 + var12);
                              continue L7;
                            } else {
                              incrementValue$2 = var17;
                              var17++;
                              param0.field_m[incrementValue$2] = (byte)param4;
                              var18++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L13: while (true) {
                      L14: {
                        if (var10 >= var14) {
                          break L14;
                        } else {
                          if ((var10 ^ -1) > (var13 ^ -1)) {
                            L15: {
                              var15 = param5 + (-var11 - -1);
                              if (var15 < 0) {
                                var15 = 0;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              var16 = var11 + param5;
                              if (var16 > -1 + param3.field_hb) {
                                var16 = -1 + param3.field_hb;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var17 = var15 - -(param3.field_hb * var9);
                            var9++;
                            var18 = var15;
                            L17: while (true) {
                              if (var16 <= var18) {
                                incrementValue$3 = var12;
                                var12--;
                                var13 = var13 - (incrementValue$3 + var12);
                                var14 = var14 - (var12 + var12);
                                continue L6;
                              } else {
                                incrementValue$4 = var17;
                                var17++;
                                param0.field_m[incrementValue$4] = (byte)param4;
                                var18++;
                                continue L17;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      var13 = var13 + (var11 + var11);
                      incrementValue$5 = var11;
                      var11++;
                      var14 = var14 + (incrementValue$5 + var11);
                      continue L13;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var7);

            stackIn_57_1 = new StringBuilder().append("hj.C(");

            if (param0 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L18;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L19;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L19;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_58_0), stackIn_61_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    hj(String param0) {
        super(param0);
    }

    final static qb a(int param0, eg param1, int param2, byte param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -10) {
                break L1;
              } else {
                field_b = -93;
                break L1;
              }
            }
            if (fc.a(-124, param1, param0, param2)) {
              stackIn_6_0 = i.a(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("hj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_e = "Apply";
        field_a = new int[4];
        field_d = true;
        field_c = "Play the game without logging in just yet";
    }
}
