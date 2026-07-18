/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_h;
    static int field_e;
    private fc[] field_c;
    private fc field_d;
    static String field_a;
    private int field_f;
    static int field_g;
    private int field_b;
    private fc field_j;
    static int[] field_k;
    static String field_i;

    final fc a(int param0, long param1) {
        fc var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        if (param0 != 8434) {
            return null;
        }
        fc var4 = ((id) this).field_c[(int)((long)(((id) this).field_b - 1) & param1)];
        ((id) this).field_j = var4.field_h;
        while (var4 != ((id) this).field_j) {
            if (~param1 == ~((id) this).field_j.field_b) {
                var5 = ((id) this).field_j;
                ((id) this).field_j = ((id) this).field_j.field_h;
                return var5;
            }
            ((id) this).field_j = ((id) this).field_j.field_h;
        }
        ((id) this).field_j = null;
        return null;
    }

    final static void a(byte param0, int param1, oh param2, String param3, va param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            if (param0 <= -111) {
              var6 = -1;
              var7 = 1;
              L1: while (true) {
                if (var7 >= param3.length()) {
                  break L0;
                } else {
                  L2: {
                    var8 = param3.charAt(var7);
                    if (var8 == 60) {
                      var6 = param4.field_b[0] + ((var5_int >> 8) + param2.a(param3.substring(0, var7)));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var6 != -1) {
                      param4.field_b[var7] = var6;
                      break L3;
                    } else {
                      L4: {
                        if (var8 == 32) {
                          var5_int = var5_int + param1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      param4.field_b[var7] = param4.field_b[0] + ((var5_int >> 8) + param2.a(param3.substring(0, 1 + var7)) + -param2.a((char) var8));
                      break L3;
                    }
                  }
                  L5: {
                    if (var8 != 62) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final fc a(byte param0) {
        fc var2 = null;
        int var3 = 0;
        L0: {
          var3 = TrackController.field_F ? 1 : 0;
          if (((id) this).field_f <= 0) {
            break L0;
          } else {
            if (((id) this).field_c[((id) this).field_f - 1] == ((id) this).field_d) {
              break L0;
            } else {
              var2 = ((id) this).field_d;
              ((id) this).field_d = var2.field_h;
              return var2;
            }
          }
        }
        L1: while (true) {
          if (((id) this).field_b <= ((id) this).field_f) {
            if (param0 != 91) {
              field_e = -86;
              return null;
            } else {
              return null;
            }
          } else {
            int fieldTemp$7 = ((id) this).field_f;
            ((id) this).field_f = ((id) this).field_f + 1;
            var2 = ((id) this).field_c[fieldTemp$7].field_h;
            if (((id) this).field_c[-1 + ((id) this).field_f] != var2) {
              ((id) this).field_d = var2.field_h;
              return var2;
            } else {
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, long param1, fc param2) {
        fc var5 = null;
        try {
            if (!(null == param2.field_e)) {
                param2.a(-38);
            }
            var5 = ((id) this).field_c[(int)((long)(((id) this).field_b - 1) & param1)];
            param2.field_h = var5;
            if (param0) {
                ((id) this).field_f = 37;
            }
            param2.field_e = var5.field_e;
            param2.field_e.field_h = param2;
            param2.field_h.field_e = param2;
            param2.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "id.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final fc b(int param0) {
        if (param0 > -34) {
            fc discarded$0 = ((id) this).b(16);
        }
        ((id) this).field_f = 0;
        return ((id) this).a((byte) 91);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_k = null;
    }

    id(int param0) {
        int var2 = 0;
        fc var3 = null;
        ((id) this).field_f = 0;
        ((id) this).field_c = new fc[param0];
        ((id) this).field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
            fc dupTemp$0 = new fc();
            var3 = dupTemp$0;
            ((id) this).field_c[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_e = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 200;
        field_a = "Mouse over an icon for details";
        field_k = new int[8192];
    }
}
