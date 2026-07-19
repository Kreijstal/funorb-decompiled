/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends vg {
    boolean field_h;
    qh field_i;
    static String field_f;
    ff field_g;

    abstract boolean a(int param0, char param1, byte param2);

    abstract void a(byte param0);

    abstract boolean a(boolean param0);

    final boolean c(byte param0) {
        if (param0 > -109) {
            me.a(109);
            return this.field_h;
        }
        return this.field_h;
    }

    public static void a(int param0) {
        if (param0 != 17355) {
            field_f = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    void b(int param0) {
        boolean discarded$0 = false;
        if (param0 != -10968) {
            discarded$0 = this.c((byte) -2);
            this.field_h = true;
            return;
        }
        this.field_h = true;
    }

    abstract void b(byte param0);

    me(qh param0) {
        try {
            this.field_i = param0;
            this.field_g = param0.field_k;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static short[] a(byte param0, int param1, kh param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_22_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param2.b((byte) 44, param1);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    var5 = param2.b((byte) 44, 4);
                    var6 = (short)param2.b((byte) 44, 16);
                    if (-1 > (var5 ^ -1)) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        if (var7 >= var4_int) {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          param3[var7] = (short)var6;
                          var7++;
                          if (var8 != 0) {
                            break L4;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)(param2.b((byte) 44, var5) + var6);
                      var7++;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        continue L7;
                      }
                    }
                  }
                }
                if (param0 > 64) {
                  break L3;
                } else {
                  field_f = (String) null;
                  break L3;
                }
              }
              stackOut_22_0 = (short[]) (param3);
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("me.N(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_23_0;
        }
    }

    static {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
