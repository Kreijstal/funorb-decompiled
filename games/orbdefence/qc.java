/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc implements td {
    private kc field_d;
    private int field_e;
    private int field_a;
    static Calendar field_c;
    static hj[] field_f;
    static kc field_b;
    static va field_g;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2.field_t) {
                  break L2;
                } else {
                  if (!param2.d(-81)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              discarded$1 = this.field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_l + "</u>", param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, var6_int, -1, this.field_a, this.field_e, this.field_d.field_H + this.field_d.field_B);
              if (!param2.d(-81)) {
                break L3;
              } else {
                L4: {
                  L5: {
                    var7 = this.field_d.a(param2.field_l);
                    var8 = this.field_d.field_H + this.field_d.field_B;
                    var9 = param2.field_s + param1;
                    if (2 == this.field_a) {
                      break L5;
                    } else {
                      if (this.field_a != 1) {
                        break L4;
                      } else {
                        var9 = var9 + (-var7 + param2.field_m >> 1332275905);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var9 = var9 + (param2.field_m + -var7);
                  break L4;
                }
                L6: {
                  L7: {
                    var10 = param2.field_n + param0;
                    if (this.field_e != 2) {
                      break L7;
                    } else {
                      var10 = var10 + (-var8 + param2.field_r);
                      if (var11 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (this.field_e != 1) {
                    break L6;
                  } else {
                    var10 = var10 + (-var8 + param2.field_r >> 1289759553);
                    break L6;
                  }
                }
                wh.a(4 + var7, false, var9 - 2, var8, var10 + 2);
                break L3;
              }
            }
            if (param3 == -4394) {
              break L0;
            } else {
              qc.a(-104);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("qc.A(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            if (param1 == 1) {
              L1: while (true) {
                L2: {
                  if (var2_int <= var4) {
                    break L2;
                  } else {
                    var3[-var4 + var2_int - 1] = param0.charAt(var4);
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("qc.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    public qc() {
        this.field_e = 1;
        this.field_d = lm.field_f;
        this.field_a = 1;
    }

    public static void a(int param0) {
        String discarded$2 = null;
        String var2 = null;
        field_b = null;
        field_c = null;
        field_g = null;
        if (param0 != 4784) {
          var2 = (String) null;
          discarded$2 = qc.a((String) null, 64);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    qc(kc param0, int param1, int param2) {
        try {
            this.field_d = param0;
            this.field_a = param1;
            this.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
