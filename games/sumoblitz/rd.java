/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ms {
    static String field_m;
    int[] field_k;
    static int field_q;
    byte[][][] field_u;
    jr[] field_o;
    int[] field_n;
    int field_p;
    int field_t;
    jr[] field_s;
    static int field_l;
    int[] field_r;

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var4 = -1;
        if (param3 != 1001) {
            return 108;
        }
        for (var5 = param1; var5 < param2; var5++) {
            var4 = as.field_y[255 & (var4 ^ param0[var5])] ^ var4 >>> 1287138568;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(Object param0, wi param1, int param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null == param1.field_g) {
          return;
        } else {
          L0: {
            if (param2 == -11030) {
              break L0;
            } else {
              field_l = 34;
              break L0;
            }
          }
          var3_int = 0;
          L1: while (true) {
            L2: {
              if (50 <= var3_int) {
                break L2;
              } else {
                if (null == param1.field_g.peekEvent()) {
                  break L2;
                } else {
                  tg.a(1L, (byte) 99);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                if (param0 == null) {
                  break L3;
                } else {
                  param1.field_g.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 > -10) {
            rd.c(true);
        }
        iu.field_e = param0;
    }

    final static boolean a(ki param0, byte param1, ki param2, ki param3) {
        Object var5 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          if (!param3.b((byte) 127)) {
            break L0;
          } else {
            if (!param3.a("commonui", 100)) {
              break L0;
            } else {
              L1: {
                if (param1 >= 120) {
                  break L1;
                } else {
                  var5 = null;
                  rd.a((Object) null, (wi) null, 63);
                  break L1;
                }
              }
              if (!param0.b((byte) 127)) {
                return false;
              } else {
                if (param0.a("commonui", 100)) {
                  L2: {
                    L3: {
                      if (!param2.b((byte) 127)) {
                        break L3;
                      } else {
                        if (!param2.a("button.gif", 100)) {
                          break L3;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    rd() {
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Loading extra data";
    }
}
