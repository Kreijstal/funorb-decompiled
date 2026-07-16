/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qm {
    static la field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = -65 / ((-66 - param0) / 43);
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var20 = null;
        var15 = Torquing.field_u;
        var8 = param5 + param2;
        var11 = -126 / ((-11 - param1) / 36);
        var9 = param0 + -param5;
        var13 = param2;
        L0: while (true) {
          if (var8 <= var13) {
            var13 = param0;
            L1: while (true) {
              if (var9 >= var13) {
                var12 = -param5 + param4;
                var10 = param5 + param6;
                var13 = var8;
                L2: while (true) {
                  if (var9 >= var13) {
                    var20 = qd.field_a[var13];
                    di.a(param6, (byte) -110, param7, var20, var10);
                    di.a(var10, (byte) -120, param3, var20, var12);
                    di.a(var12, (byte) 57, param7, var20, param4);
                    var13++;
                    continue L2;
                  } else {
                    return;
                  }
                }
              } else {
                di.a(param6, (byte) 75, param7, qd.field_a[var13], param4);
                var13--;
                continue L1;
              }
            }
          } else {
            di.a(param6, (byte) -115, param7, qd.field_a[var13], param4);
            var13++;
            continue L0;
          }
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        if (param0 != -106) {
          field_a = null;
          param1 = param1 | param1 >>> -1964150143;
          param1 = param1 | param1 >>> -1680631582;
          param1 = param1 | param1 >>> 1111157348;
          param1 = param1 | param1 >>> -1434611608;
          param1 = param1 | param1 >>> 683612656;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> -1964150143;
          param1 = param1 | param1 >>> -1680631582;
          param1 = param1 | param1 >>> 1111157348;
          param1 = param1 | param1 >>> -1434611608;
          param1 = param1 | param1 >>> 683612656;
          return 1 + param1;
        }
    }

    final static ae a(String param0, byte param1) {
        String var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Torquing.field_u;
        if (null != sh.field_a) {
          if (param0 != null) {
            if (0 != param0.length()) {
              if (param1 == 45) {
                var6 = (CharSequence) (Object) param0;
                var2 = hf.a(var6, 118);
                if (var2 != null) {
                  var3 = (ae) (Object) sh.field_a.a((long)var2.hashCode(), param1 ^ -8);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ob;
                      var4 = hf.a(var7, param1 + 68);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (ae) (Object) sh.field_a.b(-1);
                        continue L0;
                      } else {
                        return var3;
                      }
                    } else {
                      return null;
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
        } else {
          return null;
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int[] param4, int param5) {
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var6 = param4[5 + param3] * (param5 - param4[param3 + 2]) + (-param4[param3] + param2) * param4[param3 - -3] + (param1 + -param4[param3 + 1]) * param4[param3 + 4];
        if (!param0) {
          return 67;
        } else {
          L0: {
            if (0 < var6) {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              if (-1 != (var6 ^ -1)) {
                stackOut_4_0 = -1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Retry";
    }
}
