/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends ik {
    static String field_m;
    static String[] field_h;
    static ko field_j;
    static String field_l;
    String field_i;
    static String field_k;
    static String field_n;

    void a(boolean param0, int param1, int param2) {
        if (param2 != 1) {
          this.a(true, 102, -32);
          go.field_l.a(this.field_i, this.field_a, 15 + this.field_d, param1, -1);
          return;
        } else {
          go.field_l.a(this.field_i, this.field_a, 15 + this.field_d, param1, -1);
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_l = null;
        field_j = null;
        if (param0 != -2) {
          field_j = (ko) null;
          field_h = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_h = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var3 = sm.a((byte) 127, param0, param2);
            if (var3 != null) {
              stackOut_3_0 = (String) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 66) {
                  break L1;
                } else {
                  field_m = (String) null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (param2.length() > var4) {
                  if (oh.a(param2.charAt(var4), (byte) 108)) {
                    var4++;
                    continue L2;
                  } else {
                    stackOut_11_0 = vg.field_c;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_12_0;
        }
    }

    nk(int param0, int param1, String param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              this.field_i = param2;
              this.field_a = param0;
              this.field_d = param1;
              this.field_b = go.field_l.a(param2);
              if (-2 == (param3 ^ -1)) {
                this.field_a = this.field_a - this.field_b;
                break L1;
              } else {
                if ((param3 ^ -1) != -3) {
                  break L1;
                } else {
                  this.field_a = this.field_a - this.field_b / 2;
                  break L1;
                }
              }
            }
            this.field_c = 20;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    static {
        field_m = "This is a log.<br><br>You can break it by<br>dropping a rock on it.";
        field_n = "Achievements";
        field_l = "(Including <%0>)";
        field_k = "Change display name";
    }
}
