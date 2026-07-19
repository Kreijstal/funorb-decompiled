/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hg {
    static int[] field_h;
    static qh[] field_k;
    static String[] field_j;
    String field_g;
    int field_i;

    public static void a(byte param0) {
        if (param0 != -85) {
            return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (pg.field_c != null) {
            if (al.field_d != ck.field_t) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          rb.a((byte) -76);
          if (pg.field_c != null) {
            if (al.field_d != ck.field_t) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(dk[] param0, int param1, int param2, byte param3) {
        dk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dk[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              var11 = param0;
              var4 = var11;
              var5 = 0;
              L1: while (true) {
                if (var11.length <= var5) {
                  L2: {
                    if (param3 <= -5) {
                      break L2;
                    } else {
                      field_k = (qh[]) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var6 = var11[var5];
                    if (var6 == null) {
                      break L3;
                    } else {
                      L4: {
                        var7 = var6.field_c;
                        if (param2 != var7) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          break L4;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_9_0;
                        if (var7 != param1) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L5;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L5;
                        }
                      }
                      var9 = stackIn_12_0;
                      var6.a(var8 != 0, var9 != 0, (byte) 81);
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4_ref);
            stackOut_18_1 = new StringBuilder().append("rb.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rb(String param0, int param1) {
        try {
            this.field_g = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = new String[]{"Congratulations on your success in the asteroid belt. Given your success thus far, we are extending your mission. You must now cripple the alien's mining operations.", "Target and eliminate their ore extraction machinery."};
    }
}
