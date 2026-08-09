/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg extends pj {
    byte[] field_s;
    static ki field_r;
    static qr field_t;

    final static boolean a(String param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (me.a(false, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!hp.a(param0, true)) {
                if (ao.a(param0, 30996)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3_int = 11 / ((param2 - 63) / 59);
                  if (param1.length() == 0) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!gt.a(param0, param1, 106)) {
                      if (jd.a(param0, (byte) 111, param1)) {
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!wv.a(false, param0, param1)) {
                          stackIn_26_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("gg.C(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L1;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L2;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0 != 0;
                    } else {
                      return stackIn_26_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_r = (ki) null;
        }
        field_t = null;
        field_r = null;
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ig.field_b.e(122);
              aa.field_a = new ah[100];
              ds.a(85);
              if (param0 > 81) {
                break L1;
              } else {
                field_t = (qr) null;
                break L1;
              }
            }
            L2: {
              bj.field_b = new jn();
              is.field_c = new jn();
              if (oh.field_e == -1) {
                break L2;
              } else {
                is.field_c = dr.field_S[oh.field_e].field_d;
                break L2;
              }
            }
            L3: {
              he.field_o = new Random();
              db.field_l = 1;
              nd.field_F = 3;
              an.field_a = 0;
              ku.field_J = new wc[6];
              var1_int = 0;
              if (-1 != oh.field_e) {
                if (!rh.field_r[oh.field_e]) {
                  var2 = cj.field_e[oh.field_e];
                  L4: while (true) {
                    if (var2 >= 6 + cj.field_e[oh.field_e]) {
                      break L3;
                    } else {
                      ku.field_J[var1_int] = cb.field_a[var2];
                      var1_int++;
                      var2++;
                      continue L4;
                    }
                  }
                } else {
                  ku.field_J = ((om) ((Object) ab.field_a.a(107, (long)oh.field_e))).a(-120);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              in.field_z = 0;
              if (5 >= gj.a((byte) -84, 10)) {
                fb.field_a = fb.field_a + iw.field_b;
                break L5;
              } else {
                ha.field_f = ha.field_f + iw.field_b;
                break L5;
              }
            }
            iw.field_b = 0;
            td.field_m = false;
            ke.a(false);
            oc.field_e = 1000;
            ag.a(0, oh.field_e % 5 + 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "gg.B(" + param0 + ')');
        }
    }

    gg(byte[] param0) {
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new qr();
    }
}
