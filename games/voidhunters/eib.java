/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eib extends rqa {
    static long field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          eib.a(-97, 123, -112);
          return new nc((Object) (Object) frb.a(2, 124));
        } else {
          return new nc((Object) (Object) frb.a(2, 124));
        }
    }

    final static void a(int param0, int param1, int param2) {
        qw var3_ref_qw = null;
        int var3 = 0;
        ana var4 = null;
        qw var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (ms.field_y != null) {
          if (null != kba.field_a) {
            var3_ref_qw = (qw) (Object) ms.field_y.d(0);
            L0: while (true) {
              if (var3_ref_qw == null) {
                L1: {
                  var3 = param1;
                  if ((fbb.field_j[param1] ^ -1) < -2) {
                    var3 = hob.a(jp.field_Jc, fbb.field_j[param1], 117) + param1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var4 = lha.a(param0 ^ -6902, fa.field_d[var3]);
                var5 = new qw();
                var5.field_k = var4;
                var5.field_m = false;
                var5.field_i = jia.field_o;
                var5.field_f = param1;
                ms.field_y.b(-10258, (ksa) (Object) var5);
                if (param0 != 6811) {
                  field_o = 48;
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  if (param1 != var3_ref_qw.field_f) {
                    break L2;
                  } else {
                    if (var3_ref_qw.field_m) {
                      break L2;
                    } else {
                      if (Math.abs(var3_ref_qw.field_i - jia.field_o) < param2) {
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var3_ref_qw = (qw) (Object) ms.field_y.a((byte) 92);
                continue L0;
              }
            }
          } else {
            if (param0 != 6811) {
              field_o = 48;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 6811) {
            field_o = 48;
            return;
          } else {
            return;
          }
        }
    }

    final static phb[] a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        phb var9 = null;
        phb var10 = null;
        phb var11 = null;
        int[] var12 = null;
        phb var13 = null;
        phb var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var18 = dma.field_i;
        var17 = var18;
        var16 = var17;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = dma.field_g;
        var8 = dma.field_j;
        var9 = new phb(16, param5);
        var9.b();
        dma.c(0, 0, 16, param5, param4, param2);
        if (param3 != 24436) {
          return null;
        } else {
          L0: {
            var10 = null;
            var11 = null;
            if (!param0) {
              break L0;
            } else {
              var13 = var9.d();
              var10 = var13;
              var13.b();
              dma.h(0, 0, 5, 0);
              dma.h(0, 1, 3, 0);
              dma.h(0, 2, 2, 0);
              dma.h(0, 3, 1, 0);
              dma.h(0, 4, 1, 0);
              break L0;
            }
          }
          L1: {
            if (!param1) {
              break L1;
            } else {
              var14 = var9.d();
              var11 = var14;
              var14.b();
              dma.h(11, 0, 5, 0);
              dma.h(13, 1, 3, 0);
              dma.h(14, 2, 2, 0);
              dma.h(15, 3, 1, 0);
              dma.h(15, 4, 1, 0);
              break L1;
            }
          }
          dma.a(var18, var7, var8);
          return new phb[]{null, null, null, var10, var9, var11, null, null, null};
        }
    }

    eib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 3;
    }
}
