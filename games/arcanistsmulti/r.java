/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static le field_b;
    private static long[] field_d;
    static String field_a;
    static String field_c;
    static String field_e;

    final static void a(boolean param0) {
        ed.j(120);
        if (param0) {
            eg var2 = (eg) null;
            r.a(51, -102, 48, (eg) null);
        }
        oc.a(112, nn.field_p, tl.field_a[0].field_n, dh.field_Gb, ga.field_r, ra.field_h);
    }

    final static qb a(int param0, int param1, int param2, eg param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fc.a(-126, param3, param2, param1)) {
              L1: {
                if (param0 == -17928) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = wh.a(-112);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qb) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != 8) {
            String var2 = (String) null;
            r.a((String) null, 56);
        }
    }

    final static ho a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        ho stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 256) {
                break L1;
              } else {
                r.a(121);
                break L1;
              }
            }
            if (sk.field_a != hb.field_Gb) {
              L2: {
                if (pa.field_g != hb.field_Gb) {
                  break L2;
                } else {
                  if (param0.equals(ji.field_j)) {
                    hb.field_Gb = uj.field_h;
                    stackIn_11_0 = fh.field_i;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              hb.field_Gb = sk.field_a;
              ji.field_j = param0;
              fh.field_i = null;
              stackIn_9_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("r.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ho) ((Object) stackIn_9_0);
        } else {
          return stackIn_11_0;
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_d = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_a = "Please remove <%0> from your ignore list first.";
                field_c = "You just fell into the water. Try not to do this in future, as outside of this training area it will result in injury.";
                field_e = "Return to game";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (8 <= var3) {
                    field_d[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) == 1L) {
                      var0 = var0 >>> 1284508929 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
