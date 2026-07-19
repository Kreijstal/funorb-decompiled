/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uk extends IOException {
    static hj field_a;
    static String field_f;
    static e field_g;
    static uf field_b;
    static String field_d;
    static String[] field_c;
    static boolean field_e;

    final static void a(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        hj var7 = null;
        hj var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            tc.a(243, 197, 369, 143, 16777215);
            tc.f(244, 198, 367, 141, 0);
            if (qk.field_y != null) {
              L1: {
                var6 = qk.field_y[va.field_e];
                if (var6 != null) {
                  var6.a(245, 199);
                  break L1;
                } else {
                  if (an.field_e != null) {
                    discarded$3 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == 3979) {
                L2: {
                  if (hk.field_e >= bg.field_g) {
                    break L2;
                  } else {
                    var7 = qk.field_y[hf.field_i];
                    if (var7 == null) {
                      break L2;
                    } else {
                      var2_int = hk.field_e * (60 + var7.field_o) / bg.field_g;
                      var3 = var2_int - 30;
                      if (rg.field_e) {
                        jg.a(199, 256 * (-var3 + var7.field_o) / 30, var7, true, 245, var3 * -256 / 30);
                        break L2;
                      } else {
                        jg.a(199, -256 * var3 / 30, var7, true, 245, (var7.field_o - var3) * 256 / 30);
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  if (an.field_e != null) {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L4: while (true) {
                      if (var5 >= qk.field_y.length) {
                        if (var2 == null) {
                          break L3;
                        } else {
                          discarded$4 = an.field_e.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L3;
                        }
                      } else {
                        var8 = qk.field_y[var5];
                        if (var8 != null) {
                          L5: {
                            L6: {
                              if (var8.field_o != 365) {
                                break L6;
                              } else {
                                if (139 != var8.field_v) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var2 != null) {
                              var2 = (String) (var2) + ", " + var5;
                              break L5;
                            } else {
                              var2 = Integer.toString(var5);
                              break L5;
                            }
                          }
                          var5++;
                          continue L4;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L7: {
                if (null != an.field_e) {
                  discarded$5 = an.field_e.a(ug.field_f, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "uk.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void b(int param0) {
        ci.field_o = false;
        if (param0 >= -41) {
            field_g = (e) null;
        }
        aa.field_k = false;
        go.a(0, -1);
        ak.field_b = gg.field_M;
        bb.field_a = gg.field_M;
    }

    uk(String param0) {
        super(param0);
    }

    public static void a(byte param0) {
        int var1 = 97 / ((-59 - param0) / 57);
        field_c = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static kg a(String param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        kg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4_int = -104 % ((42 - param2) / 54);
            stackOut_0_0 = new kg(param0, param3, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("uk.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_f = "Minor thrust";
        field_d = "Fullscreen";
        field_g = new e(0, 2, 2, 1);
    }
}
