/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j extends li {
    static String field_s;
    static vi field_n;
    static String field_o;
    static String field_p;
    static Random field_r;
    static cr field_q;

    private j() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_p = null;
        field_s = null;
        field_n = null;
        field_q = null;
        field_r = null;
        field_o = null;
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        hl var4_ref_hl = null;
        int var4 = 0;
        int var5_int = 0;
        hl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (bm.field_I == rg.field_d) {
            if (param0 == 0) {
              L0: {
                var2_long = gk.a(109);
                if (ir.field_d == 0) {
                  break L0;
                } else {
                  if (m.field_A >= 0) {
                    break L0;
                  } else {
                    var4_ref_hl = (hl) (Object) s.field_t.a((byte) 100);
                    if (var4_ref_hl == null) {
                      break L0;
                    } else {
                      if (~var2_long < ~var4_ref_hl.field_p) {
                        var4_ref_hl.c(2);
                        ca.field_b = var4_ref_hl.field_n.length;
                        id.field_f.field_u = 0;
                        var5_int = 0;
                        L1: while (true) {
                          if (ca.field_b <= var5_int) {
                            gf.field_d = jb.field_G;
                            jb.field_G = cp.field_c;
                            cp.field_c = lc.field_f;
                            lc.field_f = var4_ref_hl.field_r;
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            return stackIn_16_0 != 0;
                          } else {
                            id.field_f.field_p[var5_int] = var4_ref_hl.field_n[var5_int];
                            var5_int++;
                            continue L1;
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (0 <= m.field_A) {
                    break L3;
                  } else {
                    id.field_f.field_u = 0;
                    if (!c.a(1, (byte) -104)) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0 != 0;
                    } else {
                      m.field_A = id.field_f.c((byte) 35);
                      id.field_f.field_u = 0;
                      ca.field_b = param1[m.field_A];
                      break L3;
                    }
                  }
                }
                if (dl.b((byte) 113)) {
                  if (ir.field_d != 0) {
                    L4: {
                      var4 = ir.field_d;
                      if (0.0 != il.field_e) {
                        var4 = (int)((double)var4 + field_r.nextGaussian() * il.field_e);
                        if (var4 >= 0) {
                          break L4;
                        } else {
                          var4 = 0;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var5 = new hl((long)var4 + var2_long, m.field_A, new byte[ca.field_b]);
                    var6 = 0;
                    L5: while (true) {
                      if (ca.field_b <= var6) {
                        s.field_t.a((li) (Object) var5, false);
                        m.field_A = -1;
                        continue L2;
                      } else {
                        var5.field_n[var6] = id.field_f.field_p[var6];
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    gf.field_d = jb.field_G;
                    jb.field_G = cp.field_c;
                    cp.field_c = lc.field_f;
                    lc.field_f = m.field_A;
                    m.field_A = -1;
                    stackOut_28_0 = 1;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  }
                } else {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  return stackIn_26_0 != 0;
                }
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("j.C(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L6;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Starting game...";
        field_n = null;
        field_s = "You have entered another game.";
        field_r = new Random();
    }
}
