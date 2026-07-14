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
                if (param2 != null) {
                  param0.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    final static String a(int param0, int param1, byte[] param2, boolean param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var9 = wizardrun.field_H;
        var13 = new char[param1];
        var12 = var13;
        var11 = var12;
        var4 = var11;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param1) {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var10 = null;
                String discarded$1 = bi.a(11, 78, (byte[]) null, true);
                break L1;
              }
            }
            return new String(var13, 0, var5);
          } else {
            var7 = 255 & param2[var6 + param0];
            if (0 != var7) {
              L2: {
                if (-129 < var7) {
                  break L2;
                } else {
                  if (-161 > var7) {
                    L3: {
                      var8 = ki.field_G[var7 + -128];
                      if (var8 == 0) {
                        var8 = 63;
                        break L3;
                      } else {
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
              var5++;
              var11[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
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
