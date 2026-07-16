/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int field_a;

    final static void a(vh param0, byte param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        if (null != param0.field_a) {
          L0: {
            if (param1 <= -41) {
              break L0;
            } else {
              var5 = null;
              int discarded$1 = bi.a((byte[]) null, -74, -99);
              break L0;
            }
          }
          var3_int = 0;
          L1: while (true) {
            L2: {
              if (-51 >= (var3_int ^ -1)) {
                break L2;
              } else {
                if (param0.field_a.peekEvent() == null) {
                  break L2;
                } else {
                  tg.a(1L, false);
                  var3_int++;
                  continue L1;
                }
              }
            }
            try {
              L3: {
                L4: {
                  if (param2 != null) {
                    param0.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static String a(int param0, int param1, byte[] param2, boolean param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = wizardrun.field_H;
        char[] var13 = new char[param1];
        char[] var12 = var13;
        char[] var11 = var12;
        char[] var4 = var11;
        int var5 = 0;
        for (var6 = 0; var6 < param1; var6++) {
            var7 = 255 & param2[var6 + param0];
            if (0 != var7) {
                if (-129 >= (var7 ^ -1)) {
                    if (!(-161 >= (var7 ^ -1))) {
                        var8 = ki.field_G[var7 + -128];
                        if (!(var8 != 0)) {
                            var8 = 63;
                        }
                        var7 = var8;
                    }
                }
                int incrementValue$0 = var5;
                var5++;
                var11[incrementValue$0] = (char)var7;
            }
        }
        if (param3) {
            Object var10 = null;
            String discarded$1 = bi.a(11, 78, (byte[]) null, true);
        }
        return new String(var13, 0, var5);
    }

    final static int a(byte[] param0, int param1, int param2) {
        if (param1 != 10510) {
            return 0;
        }
        return gh.a(param0, 113, 0, param2);
    }

    static {
    }
}
