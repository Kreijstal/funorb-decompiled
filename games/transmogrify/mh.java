/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static int[] field_b;
    static qj field_e;
    static String field_c;
    static String field_d;
    static qj field_a;

    final static void a(int param0, String param1) {
        ql.field_a = param1;
        if (param0 != 11207) {
            field_e = null;
        }
        ba.a(108, 12);
    }

    final static q a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        q var7 = null;
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var2 = param0.length();
        if (var2 == 0) {
            return ai.field_a;
        }
        if (!(255 >= var2)) {
            return rd.field_d;
        }
        String[] var3 = vi.a((char)param1, param0, 0);
        if (var3.length < 2) {
            return ai.field_a;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = gj.a(param1 + -46, var6);
            if (var7 != null) {
                return var7;
            }
        }
        return uf.a(false, var3[var3.length - 1]);
    }

    final static void a(int param0, sg param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (q.field_b <= var2) {
                L2: {
                  if (param0 == -27968) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                ol.field_d[param1.a(true)] = ol.field_d[param1.a(true)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (q.field_b <= var3) {
                    q.field_b = var2;
                    q.field_b = q.field_b + 1;
                    eg.field_a[q.field_b] = param1;
                    return;
                  } else {
                    L4: {
                      if (eg.field_a[var3].field_i != param1.field_i) {
                        break L4;
                      } else {
                        var4 = eg.field_a[var3].a(true);
                        if (ol.field_d[var4] > kh.field_d) {
                          ol.field_d[var4] = ol.field_d[var4] - 1;
                          var3++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2++;
                    eg.field_a[var2] = eg.field_a[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (eg.field_a[var2].field_i == param1.field_i) {
                  ol.field_d[eg.field_a[var2].a(true)] = ol.field_d[eg.field_a[var2].a(true)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ol.field_d[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static String b(int param0) {
        if (!((bi.field_L ^ -1) <= -3)) {
            return vj.field_a;
        }
        if (null != hg.field_a) {
            if (!(hg.field_a.a((byte) -118))) {
                return dj.field_c;
            }
            return od.field_h;
        }
        if (!(cj.field_c.a((byte) -124))) {
            return vg.field_a;
        }
        if (!cj.field_c.a((byte) 120, "commonui")) {
            return aa.field_f + " - " + cj.field_c.a(0, "commonui") + "%";
        }
        if (param0 <= 75) {
            return null;
        }
        if (!(wi.field_e.a((byte) -121))) {
            return dj.field_a;
        }
        if (!wi.field_e.a((byte) 120, "commonui")) {
            return i.field_c + " - " + wi.field_e.a(0, "commonui") + "%";
        }
        if (!(nd.field_n.a((byte) -123))) {
            return gk.field_a;
        }
        if (!(nd.field_n.c(32031))) {
            return fj.field_b + " - " + nd.field_n.b(-22884) + "%";
        }
        return field_d;
    }

    final static ci a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            ak var6 = null;
            IOException var6_ref = null;
            ak var7 = null;
            be var8 = null;
            ci stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ci stackOut_14_0 = null;
            if (param0 == -26159) {
              try {
                L0: {
                  var6 = null;
                  if (null != qi.field_a.field_b) {
                    kk.field_b = new we(qi.field_a.field_b, 5200, 0);
                    qi.field_a.field_b = null;
                    var6 = new ak(255, kk.field_b, new we(qi.field_a.field_h, 12000, 0), 2097152);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  var7 = null;
                  if (kk.field_b == null) {
                    break L1;
                  } else {
                    L2: {
                      if (null != oa.field_m) {
                        break L2;
                      } else {
                        oa.field_m = new we[qi.field_a.field_s.length];
                        break L2;
                      }
                    }
                    L3: {
                      if (oa.field_m[param5] != null) {
                        break L3;
                      } else {
                        oa.field_m[param5] = new we(qi.field_a.field_s[param5], 12000, 0);
                        qi.field_a.field_s[param5] = null;
                        break L3;
                      }
                    }
                    var7 = new ak(param5, kk.field_b, oa.field_m[param5], 2097152);
                    break L1;
                  }
                }
                L4: {
                  var8 = we.field_j.a(param5, param3, 24108, var6, var7);
                  if (param1) {
                    var8.a(true);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_14_0 = new ci((ih) (Object) var8, param2, param4);
                stackIn_15_0 = stackOut_14_0;
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_15_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            mh.a(1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1024];
        field_e = new qj();
        field_d = "Please wait...";
        field_a = new qj();
    }
}
