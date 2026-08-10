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
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param2.field_t) {
                  break L2;
                } else {
                  if (!param2.d(-81)) {
                    stackIn_6_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 3249872;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              this.field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_l + "</u>", param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, var6_int, -1, this.field_a, this.field_e, this.field_d.field_H + this.field_d.field_B);
              if (!param2.d(-81)) {
                break L3;
              } else {
                L4: {
                  var7 = this.field_d.a(param2.field_l);
                  var8 = this.field_d.field_H + this.field_d.field_B;
                  var9 = param2.field_s + param1;
                  if (2 == this.field_a) {
                    var9 = var9 + (param2.field_m + -var7);
                    break L4;
                  } else {
                    if (this.field_a != 1) {
                      break L4;
                    } else {
                      var9 = var9 + (-var7 + param2.field_m >> 1332275905);
                      break L4;
                    }
                  }
                }
                L5: {
                  var10 = param2.field_n + param0;
                  if (this.field_e != 2) {
                    if (this.field_e != 1) {
                      break L5;
                    } else {
                      var10 = var10 + (-var8 + param2.field_r >> 1289759553);
                      break L5;
                    }
                  } else {
                    var10 = var10 + (-var8 + param2.field_r);
                    break L5;
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
          L6: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("qc.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            if (param1 == 1) {
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_7_0 = new String(var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[-var4 + var2_int - 1] = param0.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qc.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
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
        String var2;
        field_b = null;
        field_c = null;
        field_g = null;
        if (param0 != 4784) {
          var2 = (String) null;
          qc.a((String) null, 64);
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
