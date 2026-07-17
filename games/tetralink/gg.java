/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends hm {
    private String field_g;
    private String field_h;
    static mk field_j;
    static hl field_i;
    static java.awt.Font field_k;

    final df a(byte param0) {
        if (param0 > -77) {
            return null;
        }
        return t.field_h;
    }

    final static void c(int param0) {
        if (!(qa.field_v)) {
            throw new IllegalStateException();
        }
    }

    final static void d() {
        bf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ch.field_q.f();
              hc.field_v.f();
              ok.field_a = ok.field_a - 1;
              if (ok.field_a == 0) {
                ok.field_a = 200;
                var1 = (bf) (Object) ha.field_b.c(false);
                L2: while (true) {
                  if (var1 == null) {
                    if (gi.field_d == null) {
                      break L1;
                    } else {
                      var1 = (bf) (Object) gi.field_d.c(false);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_q.a((byte) 95)) {
                              var1.b(false);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (bf) (Object) gi.field_d.a((byte) -70);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (!var1.field_q.a((byte) 95)) {
                        var1.b(false);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (bf) (Object) ha.field_b.a((byte) -70);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (null == ic.field_b) {
                break L6;
              } else {
                if (ic.field_b.d((byte) 127)) {
                  break L6;
                } else {
                  oa.field_B = null;
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1_ref, "gg.G(" + -106 + 41);
        }
    }

    final static void c() {
        if (null != hd.field_s) {
            if (!(null == hd.field_s.field_h)) {
                hd.field_s.field_h.field_zb = false;
            }
        }
        hd.field_s = null;
        bi.field_d = null;
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            vn.b();
            da.field_g = new int[260];
            mh.field_a = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= da.field_g.length) {
                    break L0;
                  } else {
                    da.field_g[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                da.field_g[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "gg.D(" + 120 + 41);
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 87) {
            boolean discarded$0 = gg.b((byte) 24);
        }
        return al.field_i != null ? true : false;
    }

    final void a(int param0, bh param1) {
        try {
            if (param0 != -22017) {
                df discarded$0 = ((gg) this).a((byte) 84);
            }
            param1.a(((gg) this).field_g, (byte) 103);
            param1.a((byte) 124, ((gg) this).field_h);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gg.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a() {
        bc var2 = nd.field_Lb;
        var2.f(11, (byte) -92);
        var2.a(1, false);
        var2.a(0, false);
    }

    public static void a(boolean param0) {
        field_k = null;
        field_j = null;
        field_i = null;
    }

    gg(String param0, String param1) {
        try {
            ((gg) this).field_h = param1;
            ((gg) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
