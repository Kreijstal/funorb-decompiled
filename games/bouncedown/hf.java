/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_a;
    static boolean field_b;
    static String field_c;

    final static fb a(String param0, boolean param1) {
        String var2 = null;
        fb var3 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        CharSequence var23 = null;
        CharSequence var24 = null;
        CharSequence var25 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var5 = Bounce.field_N;
        if (lf.field_q != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var23 = (CharSequence) (Object) param0;
              var2 = ce.a(var23, 0);
              if (var2 != null) {
                var3 = (fb) (Object) lf.field_q.a((long)var2.hashCode(), 0);
                if (!param1) {
                  field_b = false;
                  L0: while (true) {
                    if (var3 != null) {
                      var25 = (CharSequence) (Object) var3.field_ob;
                      var7 = ce.a(var25, 0);
                      if (var7.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (fb) (Object) lf.field_q.b(0);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  L1: while (true) {
                    if (var3 != null) {
                      var24 = (CharSequence) (Object) var3.field_ob;
                      var6 = ce.a(var24, 0);
                      if (var6.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (fb) (Object) lf.field_q.b(0);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int b(boolean param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wi var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if (4 <= tb.field_p.field_l) {
              if (-1 != tb.field_p.field_d) {
                if (1 == (tb.field_p.field_d ^ -1)) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if ((ih.field_X ^ -1) == -1) {
                      md.field_q = vc.field_G.a(bd.field_l, a.field_a, 0);
                      ih.field_X = ih.field_X + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ih.field_X ^ -1)) {
                      break L2;
                    } else {
                      if (md.field_q.field_f != 2) {
                        if ((md.field_q.field_f ^ -1) != -2) {
                          break L2;
                        } else {
                          ih.field_X = ih.field_X + 1;
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = qg.a(-23888, -1);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  L3: {
                    if (param0) {
                      break L3;
                    } else {
                      int discarded$1 = hf.a(true);
                      break L3;
                    }
                  }
                  L4: {
                    if ((ih.field_X ^ -1) == -3) {
                      mf.field_a = new pc((java.net.Socket) md.field_q.field_e, vc.field_G);
                      var2 = new wi(13);
                      fj.a(pe.field_c, 6, mf.field_e, var2, fi.field_c);
                      var2.a(15, (byte) 98);
                      var2.b(uj.field_s, (byte) 40);
                      mf.field_a.a(13, var2.field_i, 0, 0);
                      ih.field_X = ih.field_X + 1;
                      kk.field_B = 30000L + fa.a(76);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-4 == (ih.field_X ^ -1)) {
                      if (-1 <= (mf.field_a.d(0) ^ -1)) {
                        if ((kk.field_B ^ -1L) <= (fa.a(125) ^ -1L)) {
                          break L5;
                        } else {
                          stackOut_29_0 = qg.a(-23888, -2);
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        }
                      } else {
                        var1_int = mf.field_a.b(0);
                        if (var1_int == 0) {
                          ih.field_X = ih.field_X + 1;
                          break L5;
                        } else {
                          stackOut_25_0 = qg.a(-23888, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if ((ih.field_X ^ -1) != -5) {
                    stackOut_34_0 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    tb.field_p.a((byte) -114, (Object) (Object) mf.field_a, ke.field_p);
                    ih.field_X = 0;
                    md.field_q = null;
                    mf.field_a = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return qg.a(-23888, -3);
              }
              return stackIn_35_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = Bounce.field_N;
        boolean discarded$4 = q.field_N.a(dk.field_c, !param0 ? true : false, true, ee.field_b);
        q.field_N.d((byte) 111);
        while (q.g((byte) -15)) {
            boolean discarded$5 = q.field_N.a((byte) -109, lh.field_f, gk.field_d);
        }
        if (0 != (m.field_g ^ -1)) {
            var1 = m.field_g;
            oh.a(-101, -1);
            return var1;
        }
        if (param0) {
            return 81;
        }
        if (ng.field_b) {
            return 3;
        }
        if (qg.field_g == vc.field_F) {
            return 1;
        }
        if (!pb.field_k.a(1000)) {
            return 1;
        }
        if (!(qg.field_g != fh.field_B)) {
            return 2;
        }
        return -1;
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 111 % ((17 - param0) / 40);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Press ESCAPE to quit";
    }
}
