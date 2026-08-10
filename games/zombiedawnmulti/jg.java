/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static String field_b;
    static boolean field_a;

    final static String a(k param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.h((byte) -109);
                  if (var3_int > param1) {
                    var3_int = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4 = new byte[var3_int];
                  param0.field_j = param0.field_j + r.field_a.a(var3_int, param2 + -3574, 0, param0.field_m, var4, param0.field_j);
                  if (param2 == 3460) {
                    break L3;
                  } else {
                    jg.b(43);
                    break L3;
                  }
                }
                var5 = oe.a(var3_int, var4, false, 0);
                stackIn_6_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_8_0 = "Cabbage";
              return stackIn_8_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("jg.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static fc a(int param0, byte[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        fc stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var8 = new byte[24 + param1.length];
            var7 = var8;
            var3 = var7;
            var2_int = 0;
            L1: while (true) {
              if (-5 >= (var2_int ^ -1)) {
                L2: {
                  incrementValue$0 = var2_int;
                  var2_int++;
                  var4 = ql.a(true, incrementValue$0, param1);
                  incrementValue$1 = var2_int;
                  var2_int++;
                  var5 = ql.a(true, incrementValue$1, param1);
                  nn.a(-114, 4, var8, var4);
                  nn.a(-128, 5, var8, var5);
                  nn.a(-111, 6, var8, var4);
                  nn.a(-118, 7, var8, var5);
                  nn.a(-113, 8, var8, var4);
                  nn.a(-106, 9, var8, var5);
                  nn.a(-123, 10, var8, var4);
                  nn.a(-127, 11, var8, var5);
                  var2_int = 6;
                  if (param0 == 30270) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (param1.length / 4 <= var2_int) {
                    stackIn_9_0 = gi.a(var8, -113);
                    break L0;
                  } else {
                    nn.a(param0 ^ -30281, var2_int - -6, var3, ql.a(true, var2_int, param1));
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                nn.a(-128, var2_int, var3, ql.a(true, var2_int, param1));
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("jg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static sm[] a(int param0, go param1) {
        sm[] stackIn_3_0 = null;
        sm[] stackIn_9_0 = null;
        sm[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        sm[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        sm var7 = null;
        int var8 = 0;
        di var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1.a(-36)) {
              var9 = param1.c(0);
              L1: while (true) {
                if (0 != var9.field_f) {
                  if (2 != var9.field_f) {
                    var11 = (int[]) (var9.field_d);
                    var10 = var11;
                    var3 = var10;
                    var5 = 88 % ((27 - param0) / 55);
                    var4 = new sm[var11.length >> 1476197698];
                    var6 = 0;
                    L2: while (true) {
                      if (var4.length <= var6) {
                        stackIn_14_0 = (sm[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var7 = new sm();
                        var4[var6] = var7;
                        var7.field_e = var3[var6 << -1537884766];
                        var7.field_a = var3[(var6 << -1854007262) - -1];
                        var7.field_c = var3[(var6 << -1472796862) + 2];
                        var7.field_d = var3[(var6 << -1820917502) + 3];
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    stackIn_9_0 = new sm[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  vd.a(false, 10L);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new sm[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("jg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0) {
        if (!og.field_N) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(param0 ^ -75, true);
        a.field_b = param0;
    }

    public static void b(int param0) {
        if (param0 != 7) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_a = false;
    }
}
