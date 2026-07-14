/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_a;

    final static boolean a(int[] param0, byte param1) {
        long var2 = 0L;
        q var4_ref_q = null;
        int var4 = 0;
        int var5_int = 0;
        q var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = StarCannon.field_A;
        if (pb.field_a != r.field_c) {
          return false;
        } else {
          L0: {
            var2 = dd.b(param1 + 198);
            if (jl.field_h == 0) {
              break L0;
            } else {
              if (0 > t.field_C) {
                var4_ref_q = (q) (Object) le.field_e.c(-3905);
                if (var4_ref_q == null) {
                  break L0;
                } else {
                  if (var2 <= var4_ref_q.field_g) {
                    break L0;
                  } else {
                    var4_ref_q.b(4);
                    il.field_g = var4_ref_q.field_k.length;
                    se.field_p.field_g = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= il.field_g) {
                        wc.field_i = hh.field_a;
                        hh.field_a = bh.field_d;
                        bh.field_d = vh.field_t;
                        vh.field_t = var4_ref_q.field_f;
                        return true;
                      } else {
                        se.field_p.field_f[var5_int] = var4_ref_q.field_k[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (param1 == -99) {
              break L2;
            } else {
              field_a = null;
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if (t.field_C < 0) {
                se.field_p.field_g = 0;
                if (ag.a(125, 1)) {
                  t.field_C = se.field_p.m(255);
                  se.field_p.field_g = 0;
                  il.field_g = param0[t.field_C];
                  break L4;
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
            if (!fk.a(false)) {
              return false;
            } else {
              if (jl.field_h != 0) {
                L5: {
                  var4 = jl.field_h;
                  if (fc.field_b == 0.0) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + di.field_l.nextGaussian() * fc.field_b);
                    if (0 > var4) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = new q(var2 + (long)var4, t.field_C, new byte[il.field_g]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= il.field_g) {
                    le.field_e.b(80, (rf) (Object) var5);
                    t.field_C = -1;
                    continue L3;
                  } else {
                    var5.field_k[var6] = se.field_p.field_f[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                wc.field_i = hh.field_a;
                hh.field_a = bh.field_d;
                bh.field_d = vh.field_t;
                vh.field_t = t.field_C;
                t.field_C = -1;
                return true;
              }
            }
          }
        }
    }

    final static java.applet.Applet b(int param0) {
        if (oj.field_f != null) {
            return oj.field_f;
        }
        if (param0 < 67) {
            java.applet.Applet discarded$0 = ll.b(8);
        }
        return (java.applet.Applet) (Object) ic.field_b;
    }

    final static hh a(boolean param0, byte param1, String param2, String param3) {
        CharSequence var7 = null;
        long var4 = 0L;
        if (param1 != -49) {
            field_a = null;
        }
        String var6 = null;
        if (-1 != param2.indexOf('@')) {
            var6 = param2;
        } else {
            var7 = (CharSequence) (Object) param2;
            var4 = ik.a(var7, (byte) -83);
        }
        return ik.a(param3, -66, var4, var6, param0);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Name is available";
    }
}
