/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj implements dja {
    static pfa field_a;

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (-1 == (param1 ^ -1)) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != param0) {
                var4_int = param1 - -param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_23_0 = var6.toString();
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L3: {
                          var8 = param3[var7];
                          if (var8 == null) {
                            discarded$3 = var6.append("null");
                            break L3;
                          } else {
                            discarded$4 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param3[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      } else {
                        var5 += 4;
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              } else {
                var10 = param3[param2];
                var4 = var10;
                if (var4 == null) {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4_ref);

            stackIn_26_1 = new StringBuilder().append("nj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            CharSequence[] var4 = (CharSequence[]) null;
            nj.a(-62, 119, 20, (CharSequence[]) null);
        }
        return (tv[]) ((Object) new af[param1]);
    }

    public static void a(boolean param0) {
        if (param0) {
            CharSequence[] var2 = (CharSequence[]) null;
            nj.a(1, 39, 107, (CharSequence[]) null);
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 69 % ((-64 - param0) / 50);
        return (tv) ((Object) new af());
    }

    static {
    }
}
