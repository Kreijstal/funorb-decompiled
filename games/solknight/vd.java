/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ie[] field_d;
    private static String field_e;
    static String field_a;
    static int field_b;
    static int field_c;

    final static byte[] a(String param0, int param1) {
        if (param1 != 4) {
            return null;
        }
        return me.field_e.a(4, "", param0);
    }

    final static hf a(int param0, boolean param1) {
        jd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        jd var8 = null;
        ba var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_21_0 = null;
        Object stackOut_20_0 = null;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var8 = te.field_N;
          var2 = var8;
          var3 = var8.j(255);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ml.field_e = stackIn_3_0 != 0;
          qk.field_m = 127 & var3;
          th.field_I = var8.j(255);
          q.field_b = var8.a(10526);
          if (-3 != (qk.field_m ^ -1)) {
            ah.field_c = 0;
            hc.field_b = 0;
            break L1;
          } else {
            hc.field_b = var8.i(-127);
            ah.field_c = var8.b(false);
            break L1;
          }
        }
        L2: {
          if ((var8.j(255) ^ -1) != -2) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          field_e = var8.h(40);
          if (var4 != 0) {
            field_a = var8.h(112);
            break L3;
          } else {
            field_a = field_e;
            break L3;
          }
        }
        L4: {
          if (1 == qk.field_m) {
            int discarded$4 = var8.i(-117);
            String discarded$5 = var8.h(27);
            break L4;
          } else {
            if (4 != qk.field_m) {
              break L4;
            } else {
              int discarded$6 = var8.i(-117);
              String discarded$7 = var8.h(27);
              break L4;
            }
          }
        }
        L5: {
          if (!param1) {
            ek.field_a = a.a((gb) (Object) var8, 80, false);
            qe.field_G = null;
            break L5;
          } else {
            var5 = var8.i(12);
            try {
              L6: {
                L7: {
                  var9 = bf.field_f.a((byte) -109, var5);
                  ek.field_a = var9.a((byte) 100);
                  if (!field_a.equals((Object) (Object) ne.field_g)) {
                    stackOut_21_0 = var9.field_n;
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = null;
                    stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                    break L7;
                  }
                }
                qe.field_G = stackIn_22_0;
                break L6;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                hi.a((Throwable) (Object) var6, "CC1", 1);
                qe.field_G = null;
                ek.field_a = null;
                break L8;
              }
            }
            break L5;
          }
        }
        var5 = -3 / ((-23 - param0) / 57);
        return new hf(param1);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          if (param3 == 160) {
            break L0;
          } else {
            vd.a((byte) 114);
            break L0;
          }
        }
        var10 = new char[param2];
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param2) {
            return new String(var10, 0, var5);
          } else {
            var7 = param0[var6 + param1] & 255;
            if (var7 != 0) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if (var7 < 160) {
                    L3: {
                      var8 = vk.field_e[-128 + var7];
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              int incrementValue$1 = var5;
              var5++;
              var10[incrementValue$1] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 9) {
            field_e = null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ie[10];
    }
}
