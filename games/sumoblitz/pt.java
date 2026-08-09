/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pt {
    static java.util.zip.CRC32 field_c;
    static volatile boolean field_a;
    static String field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
            Sumoblitz.field_H = Sumoblitz.field_H - 1;
            if (0 == Sumoblitz.field_H) {
                jg.field_b = null;
            }
        }
        if (param2 != -1) {
            return;
        }
        if (param1) {
            jj.field_d = jj.field_d - 1;
            if (-1 == (jj.field_d ^ -1)) {
                bb.field_i = null;
            }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 12) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(pj param0, int param1, pj param2) {
        if (!(null == param2.field_o)) {
            param2.c(-5106);
        }
        if (param1 != 2066481250) {
            return;
        }
        try {
            param2.field_o = param0;
            param2.field_m = param0.field_m;
            param2.field_o.field_m = param2;
            param2.field_m.field_o = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pt.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qv var4_ref_qv = null;
        lt var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var10 = ig.field_a;
            if (param0 == -22683) {
              L1: {
                var2 = var10.e(param0 + -8619);
                var3 = var10.e(-31302);
                if (var2 != 0) {
                  if (1 == var2) {
                    var4 = var10.h(-2858);
                    var5 = (lt) ((Object) em.field_d.b(-73));
                    L2: while (true) {
                      L3: {
                        if (var5 == null) {
                          break L3;
                        } else {
                          L4: {
                            if (var3 != var5.field_k) {
                              break L4;
                            } else {
                              if (var4 == var5.field_o) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5 = (lt) ((Object) em.field_d.d((byte) 18));
                          continue L2;
                        }
                      }
                      if (var5 != null) {
                        var5.b(false);
                        break L1;
                      } else {
                        kk.a((byte) -114);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    ms.a("LR1: " + di.b((byte) 126), (Throwable) null, 0);
                    kk.a((byte) -119);
                    break L1;
                  }
                } else {
                  var4_ref_qv = (qv) ((Object) ak.field_b.b(-95));
                  if (var4_ref_qv == null) {
                    kk.a((byte) -127);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L5: {
                      var5_int = gu.field_d - var10.field_p;
                      var12 = var4_ref_qv.field_m;
                      var11 = var12;
                      var6 = var11;
                      if (var5_int <= var12.length << -622066302) {
                        break L5;
                      } else {
                        var5_int = var12.length << 2066481250;
                        break L5;
                      }
                    }
                    var7 = 0;
                    L6: while (true) {
                      if (var7 >= var5_int) {
                        var4_ref_qv.b(false);
                        break L1;
                      } else {
                        var6[var7 >> -746515198] = var6[var7 >> -746515198] + (var10.e(-31302) << eb.a(768, var7 << 1553025448));
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "pt.I(" + param0 + ')');
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

    protected pt() throws Throwable {
        throw new Error();
    }

    final static String a(String param0, ki param1, String param2, boolean param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_c = (java.util.zip.CRC32) null;
                break L1;
              }
            }
            if (!param1.b((byte) 127)) {
              stackIn_5_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param4 + " - " + param1.a(param0, (byte) 33) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("pt.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_c = new java.util.zip.CRC32();
        field_b = "challenge";
        field_a = true;
    }
}
