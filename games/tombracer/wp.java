/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_b;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 <= 60) {
            field_a = (String) null;
        }
    }

    final static mu a(int param0, String param1) {
        String var2 = null;
        mu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        mu stackIn_13_0 = null;
        mu stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (hia.field_s != null) {
              if (param1 != null) {
                if (-1 != (param1.length() ^ -1)) {
                  var6 = (CharSequence) ((Object) param1);
                  var2 = jd.a(1, var6);
                  if (var2 != null) {
                    if (param0 > 85) {
                      var3 = (mu) ((Object) hia.field_s.a(-128, (long)var2.hashCode()));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_tb);
                          var4 = jd.a(1, var7);
                          if (!var4.equals(var2)) {
                            var3 = (mu) ((Object) hia.field_s.b((byte) 47));
                            continue L1;
                          } else {
                            stackIn_19_0 = (mu) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = (mu) null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("wp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mu) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static void a(int param0) {
        String var2;
        L0: {
          if (null == hka.field_b) {
            break L0;
          } else {
            if (null != hka.field_b.field_h) {
              hka.field_b.field_h.field_cb = false;
              break L0;
            } else {
              lu.field_b = null;
              if (param0 == -1) {
                hka.field_b = null;
                return;
              } else {
                var2 = (String) null;
                wp.a(-23, (String) null);
                hka.field_b = null;
                return;
              }
            }
          }
        }
        lu.field_b = null;
        if (param0 != -1) {
          var2 = (String) null;
          wp.a(-23, (String) null);
          hka.field_b = null;
          return;
        } else {
          hka.field_b = null;
          return;
        }
    }

    static {
        field_c = new int[8192];
    }
}
