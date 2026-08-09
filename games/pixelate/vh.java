/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh {
    private java.util.zip.Inflater field_a;
    static co field_c;
    static String field_b;

    final static void a(int param0) {
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        sb stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        sb var9 = null;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = ia.field_e + -qn.field_o;
              qn.field_o = -(var1_int >> 1803476321) + bq.field_d;
              ia.field_e = var1_int + qn.field_o;
              if (param0 >= 16) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            ce.field_c = -(nf.field_c >> -871972255) + qh.field_b;
            var2 = ce.field_c;
            var3 = 0;
            L2: while (true) {
              if (var3 >= pl.field_J.length) {
                break L0;
              } else {
                L3: {
                  var4 = uf.field_e[var3];
                  if (var4 < 0) {
                    var5 = hd.field_n;
                    break L3;
                  } else {
                    if (var4 == vp.field_Gb.field_j) {
                      var5 = mj.field_k;
                      break L3;
                    } else {
                      var5 = mh.field_a;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = pl.field_J[var3];
                  stackIn_12_0 = (String) (var6);

                  stackIn_12_1 = 8192;

                  if (-1 < (var4 ^ -1)) {
                    stackIn_13_0 = (String) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = 0;
                    break L4;
                  } else {
                    stackIn_13_0 = (String) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = jp.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0);
                  var8 = bq.field_d - (var7 >> -1874173151);
                  if (-1 >= (var4 ^ -1)) {
                    L6: {
                      if (vp.field_Gb.field_j != var4) {
                        stackIn_18_0 = uo.field_m;
                        break L6;
                      } else {
                        stackIn_18_0 = wg.field_d;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_18_0;
                      var2 = var2 + ki.field_e;
                      if (var9 != null) {
                        var9.a(var2, dk.field_d - -(lf.field_b << -463917887), -1, (uf.field_a << 787155649) + var7, var8 + -uf.field_a);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2 = var2 + lf.field_b;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if ((var4 ^ -1) <= -1) {
                    ie.field_G.a(var6, var8, var2 + w.field_q, var5, -1);
                    var2 = var2 + (dk.field_d + lf.field_b - -ki.field_e);
                    break L8;
                  } else {
                    lm.field_o.a(var6, var8, ab.field_b + var2, var5, -1);
                    var2 = var2 + da.field_m;
                    break L8;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "vh.B(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1, we param2) {
        try {
            try {
                if (31 != param2.field_k[param2.field_m] || 116 != (param2.field_k[param2.field_m - -1] ^ -1)) {
                    throw new RuntimeException("");
                }
                if (null == this.field_a) {
                    this.field_a = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_a.setInput(param2.field_k, param2.field_m + 10, param0 - param2.field_m - (10 - param2.field_k.length));
                    this.field_a.inflate(param1);
                } catch (Exception exception) {
                    this.field_a.reset();
                    throw new RuntimeException("");
                }
                this.field_a.reset();
            } catch (RuntimeException runtimeException) {
                throw aa.a((Throwable) ((Object) runtimeException), "vh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
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
        field_c = null;
        field_b = "Acid Sunset";
    }
}
