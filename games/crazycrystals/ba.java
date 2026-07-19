/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ln {
    static dl field_j;
    static String field_l;
    static vc field_i;
    static dl[] field_g;
    static db field_k;
    static java.awt.Image field_h;

    final int a(int param0, byte param1) {
        int var3 = 75 / ((param1 - 55) / 50);
        return -1 != (1 << param0 & qg.field_q ^ -1) ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = 4 / ((84 - param0) / 42);
        ab.f((byte) -49);
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_5_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if ((var2_int ^ -1) >= -21) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            if (param0 == 48) {
              L2: while (true) {
                if (var2_int <= var4) {
                  stackOut_21_0 = new String(var8);
                  stackIn_22_0 = stackOut_21_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      var5 = param1.charAt(var4);
                      if (var5 < 65) {
                        break L4;
                      } else {
                        if (var5 <= 90) {
                          var3[var4] = (char)(var5 + 32);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var5 < 97) {
                          break L6;
                        } else {
                          if (122 >= var5) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (48 > var5) {
                          break L7;
                        } else {
                          if (57 < var5) {
                            break L7;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3[var4] = (char)95;
                      break L3;
                    }
                    var3[var4] = (char)var5;
                    break L3;
                  }
                  var4++;
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = (String) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("ba.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static void a(byte param0, String param1) {
        try {
            ng.a(param1, 21815);
            ke.a(no.field_i, false, -13);
            int var2_int = 119 % ((param0 - 6) / 49);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ba.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        jm.field_d.a((qm) (new ae()), (byte) -50);
        if (param0 == 93) {
            return;
        }
        field_h = (java.awt.Image) null;
    }

    final static tj a(int param0) {
        if (param0 != -29513) {
            return (tj) null;
        }
        return hb.field_l;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_l = null;
        if (param0 != 48) {
          ba.c((byte) -100);
          field_h = null;
          field_k = null;
          field_j = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_j = null;
          return;
        }
    }

    final static void a(int param0, int param1, hp param2) {
        try {
            if (param1 <= 37) {
                field_h = (java.awt.Image) null;
            }
            cf.field_c.b(0, param2);
            tb.a(param0, param2, (byte) -123);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ba.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ba(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_l = "Retry";
    }
}
