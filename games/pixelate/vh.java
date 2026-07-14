/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh {
    private java.util.zip.Inflater field_a;
    static co field_c;
    static String field_b;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        sb stackIn_17_0 = null;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        sb stackOut_16_0 = null;
        sb stackOut_15_0 = null;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          var1 = ia.field_e + -qn.field_o;
          qn.field_o = -(var1 >> 1803476321) + bq.field_d;
          ia.field_e = var1 + qn.field_o;
          if (param0 >= 16) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        ce.field_c = -(nf.field_c >> -871972255) + qh.field_b;
        var2 = ce.field_c;
        var3 = 0;
        L1: while (true) {
          if (var3 >= pl.field_J.length) {
            return;
          } else {
            L2: {
              var4 = uf.field_e[var3];
              if (var4 < 0) {
                var5 = hd.field_n;
                break L2;
              } else {
                if (var4 == vp.field_Gb.field_j) {
                  var5 = mj.field_k;
                  break L2;
                } else {
                  var5 = mh.field_a;
                  break L2;
                }
              }
            }
            L3: {
              var6 = pl.field_J[var3];
              stackOut_9_0 = (String) var6;
              stackOut_9_1 = 8192;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (-1 < var4) {
                stackOut_11_0 = (String) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L3;
              } else {
                stackOut_10_0 = (String) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L3;
              }
            }
            L4: {
              var7 = jp.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0);
              var8 = bq.field_d - (var7 >> -1874173151);
              if (-1 <= var4) {
                L5: {
                  if (vp.field_Gb.field_j != var4) {
                    stackOut_16_0 = uo.field_m;
                    stackIn_17_0 = stackOut_16_0;
                    break L5;
                  } else {
                    stackOut_15_0 = wg.field_d;
                    stackIn_17_0 = stackOut_15_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_17_0;
                  var2 = var2 + ki.field_e;
                  if (var9 != null) {
                    var9.a(var2, dk.field_d - -(lf.field_b << -463917887), -1, (uf.field_a << 787155649) + var7, var8 + -uf.field_a);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2 = var2 + lf.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            if ((var4 ^ -1) <= -1) {
              ie.field_G.a(var6, var8, var2 + w.field_q, var5, -1);
              var2 = var2 + (dk.field_d + lf.field_b - -ki.field_e);
              var3++;
              continue L1;
            } else {
              lm.field_o.a(var6, var8, ab.field_b + var2, var5, -1);
              var2 = var2 + da.field_m;
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, byte[] param1, we param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (31 != param2.field_k[param2.field_m]) {
                break L0;
              } else {
                if (116 == (param2.field_k[param2.field_m - -1] ^ -1)) {
                  L1: {
                    if (null != ((vh) this).field_a) {
                      break L1;
                    } else {
                      ((vh) this).field_a = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    ((vh) this).field_a.setInput(param2.field_k, param2.field_m + 10, param0 - param2.field_m - (10 - param2.field_k.length));
                    int discarded$2 = ((vh) this).field_a.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((vh) this).field_a.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != -8) {
            vh.a(-33);
        }
        field_b = null;
        field_c = null;
    }

    private vh(int param0, int param1, int param2) {
    }

    public vh() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_b = "Acid Sunset";
    }
}
