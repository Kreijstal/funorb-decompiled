/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String field_b;
    static int field_e;
    static int[] field_f;
    static int[] field_c;
    static boolean field_a;
    static int field_d;

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        if (param0 >= -39) {
            Object var2 = null;
            ni.a((ej) null, (Object) null, 118);
        }
        field_c = null;
    }

    final static boolean a(pf param0, pf param1, pf param2, byte param3) {
        L0: {
          if (!param2.a((byte) -36)) {
            break L0;
          } else {
            if (!param2.a("commonui", (byte) -109)) {
              break L0;
            } else {
              L1: {
                if (!param0.a((byte) -36)) {
                  break L1;
                } else {
                  if (!param0.a("commonui", (byte) -109)) {
                    break L1;
                  } else {
                    L2: {
                      if (!param1.a((byte) -36)) {
                        break L2;
                      } else {
                        if (!param1.a("button.gif", (byte) -109)) {
                          break L2;
                        } else {
                          if (param3 == -104) {
                            return true;
                          } else {
                            field_a = true;
                            return true;
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    final static String a(boolean param0, int param1, ka param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                var3_int = param2.d((byte) 113);
                if (param1 < var3_int) {
                  var3_int = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = new byte[var3_int];
              param2.field_k = param2.field_k + fl.field_b.a(param2.field_r, param2.field_k, 0, var4, var3_int, true);
              var5 = kk.a(var3_int, (byte) 122, 0, var4);
              stackOut_6_0 = (String) var5;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_7_0;
    }

    final static void a(ej param0, Object param1, int param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        if (param0.field_s != null) {
          var4 = -47 % ((param2 - -70) / 41);
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (50 <= var3_int) {
                break L1;
              } else {
                if (param0.field_s.peekEvent() == null) {
                  break L1;
                } else {
                  jj.a((byte) -115, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                L3: {
                  if (param1 != null) {
                    param0.field_s.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        double var1 = 0.0;
        field_b = "Open in popup window";
        field_f = new int[65536];
        field_c = new int[65536];
        field_a = true;
        field_e = 0;
        for (var0 = 0; var0 < 65536; var0++) {
            var1 = -Math.sqrt((double)var0) + 256.0;
            field_f[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0 = 0; -65537 < (var0 ^ -1); var0++) {
            var1 = Math.sqrt((double)var0);
            field_c[var0] = (int)Math.floor(-(9.0 * var1) + 768.5 + (double)var0 * 0.0234375);
        }
    }
}
