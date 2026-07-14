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
        param2.field_o = param0;
        param2.field_m = param0.field_m;
        param2.field_o.field_m = param2;
        param2.field_m.field_o = param2;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        qv var4_ref_qv = null;
        int var4 = 0;
        lt var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var10 = ig.field_a;
        if (param0 == -22683) {
          L0: {
            var2 = var10.e(param0 + -8619);
            var3 = var10.e(-31302);
            if (var2 != 0) {
              if (1 == var2) {
                var4 = var10.h(-2858);
                var5 = (lt) (Object) em.field_d.b(-73);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var3 != var5.field_k) {
                          break L3;
                        } else {
                          if (var4 == var5.field_o) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = (lt) (Object) em.field_d.d((byte) 18);
                      continue L1;
                    }
                  }
                  if (var5 != null) {
                    var5.b(false);
                    break L0;
                  } else {
                    kk.a((byte) -114);
                    return;
                  }
                }
              } else {
                ms.a("LR1: " + di.b((byte) 126), (Throwable) null, 0);
                kk.a((byte) -119);
                break L0;
              }
            } else {
              var4_ref_qv = (qv) (Object) ak.field_b.b(-95);
              if (var4_ref_qv == null) {
                kk.a((byte) -127);
                return;
              } else {
                L4: {
                  var5_int = gu.field_d - var10.field_p;
                  var14 = var4_ref_qv.field_m;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var6 = var11;
                  if (var5_int <= var14.length << -622066302) {
                    break L4;
                  } else {
                    var5_int = var14.length << 2066481250;
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_qv.b(false);
                    break L0;
                  } else {
                    var6[var7 >> -746515198] = var6[var7 >> -746515198] + (var10.e(-31302) << eb.a(768, var7 << 1553025448));
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    protected pt() throws Throwable {
        throw new Error();
    }

    final static String a(String param0, ki param1, String param2, boolean param3, String param4) {
        if (!param3) {
            field_c = null;
        }
        if (!(param1.b((byte) 127))) {
            return param2;
        }
        return param4 + " - " + param1.a(param0, (byte) 33) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new java.util.zip.CRC32();
        field_b = "challenge";
        field_a = true;
    }
}
