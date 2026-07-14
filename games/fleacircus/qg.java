/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int[] field_a;
    static int field_c;
    static qc field_b;
    static String[] field_d;
    static ke field_f;
    static oc field_e;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 < -38) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == param0) {
              break L2;
            } else {
              if (param0 != 18) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            java.net.URL var3 = null;
            if (param2 != 0) {
                Object var4 = null;
                short[] discarded$0 = qg.a((byte) 102, (short[]) null, -60, (ih) null);
            }
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = ib.a(param1, var3, -5441);
                me.a(param1, param2 + -126, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, ih param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var4 = param3.b(param2, (byte) -87);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.b(4, (byte) -87);
            if (param0 == 125) {
              break L2;
            } else {
              field_a = null;
              break L2;
            }
          }
          L3: {
            var6 = (short)param3.b(16, (byte) -87);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)(param3.b(var5, (byte) -87) + var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[40];
    }
}
