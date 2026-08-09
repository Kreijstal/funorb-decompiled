/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends en {
    static int field_S;
    static int[] field_T;
    static hl field_Q;
    static String field_O;
    static int field_R;
    int field_N;
    static String field_P;

    final static rj a(String param0, int param1) {
        RuntimeException var2 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 14781) {
                break L1;
              } else {
                field_Q = (hl) null;
                break L1;
              }
            }
            stackIn_3_0 = new rj(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("il.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static long a(int param0, CharSequence param1) {
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param1.length();
              if (param0 == -23718) {
                break L1;
              } else {
                field_Q = (hl) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (90 >= var6) {
                          var2_long = var2_long + (long)(1 - (-var6 + 65));
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 > 122) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(-48 + var6 + 27);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-177917621779460414L < (var2_long ^ -1L)) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (-1L != (var2_long % 37L ^ -1L)) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_23_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("il.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    public il() {
        super(0, 0, 0, 0, (kg) null, (dn) null);
        this.field_N = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(null != this.field_J)) {
            return;
        }
        if (!(0 != this.field_N)) {
            return;
        }
        if (!(this.field_N != 256)) {
            this.field_J.a(0, this.field_t + param1, param2 - -this.field_w, param3);
            return;
        }
        oh var6 = new oh(this.field_J.field_F, this.field_J.field_u);
        sk.a((byte) 105, var6);
        this.field_J.a(param0, 0, 0, param3);
        dh.a(-581);
        var6.a(this.field_t + param1, param2 + this.field_w, this.field_N);
    }

    il(na param0) {
        super(param0.field_t, param0.field_w, param0.field_F, param0.field_u, (kg) null, (dn) null);
        try {
            param0.a(this.field_u, 0, -118, 0, this.field_F);
            this.field_J = param0;
            this.field_N = 256;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_T = null;
        field_Q = null;
        int var1 = -86 % ((-82 - param0) / 43);
        field_O = null;
        field_P = null;
    }

    static {
        field_T = new int[]{8};
        field_S = 0;
        field_P = "Kick <%0> from this game";
        field_O = "Previous";
    }
}
