/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_e;
    static String field_d;
    static int field_c;
    static String field_a;
    static int field_b;

    final static va a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        va var5 = null;
        va stackIn_4_0 = null;
        va stackIn_8_0 = null;
        va stackIn_11_0 = null;
        va stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackIn_8_0 = vf.field_q;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(param0, var2_int);
                    var4 = param1.substring(var2_int + 1);
                    var5 = ll.a(var3, true);
                    if (var5 == null) {
                      stackIn_13_0 = ll.a((byte) 57, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_11_0 = (va) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = pe.field_p;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("nl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        ok var2;
        field_a = null;
        if (param0) {
          var2 = (ok) null;
          nl.a((ok) null, -61, (ok) null, 56);
          field_e = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, nf[] param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if ((param3 ^ -1) >= -1) {
                  break L1;
                } else {
                  L2: {
                    var5_int = param2[0].field_t;
                    var6 = param2[2].field_t;
                    var7 = param2[1].field_t;
                    param2[0].d(param1, param4);
                    param2[2].d(param1 + param3 + -var6, param4);
                    fn.b(hj.field_l);
                    if (param0 > 101) {
                      break L2;
                    } else {
                      field_e = (String) null;
                      break L2;
                    }
                  }
                  fn.f(var5_int + param1, param4, param1 + (param3 - var6), param4 - -param2[1].field_x);
                  var8 = param1 - -var5_int;
                  var9 = -var6 + (param1 + param3);
                  param1 = var8;
                  L3: while (true) {
                    if (param1 >= var9) {
                      fn.a(hj.field_l);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param2[1].d(param1, param4);
                      param1 = param1 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("nl.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(ok param0, int param1, ok param2, int param3) {
        try {
            dn.field_f = param2;
            wg.field_a = param1;
            rn.field_e = param0;
            ud.a(fn.field_g / 2, (byte) -12, fn.field_l / param3);
            ue.a(param0.field_D + param0.field_y, param2.field_y - -param2.field_D, param2.field_y, param0.field_y, 243);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "nl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "Members";
        field_d = "Waiting for extra data";
        field_b = 65;
        field_a = "Play the game without logging in just yet";
    }
}
