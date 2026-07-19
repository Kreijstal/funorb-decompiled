/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qs {
    static Calendar field_a;
    static int field_b;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            L1: {
              ok.field_o = ok.field_o + 1;
              if (ik.field_k != -1) {
                break L1;
              } else {
                if (0 == (rs.field_v ^ -1)) {
                  ik.field_k = ic.field_b;
                  rs.field_v = cf.field_g;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (qj.field_s == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param1.equals(qj.field_s)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ht.field_g) {
                  if (ok.field_o >= jp.field_b) {
                    if (ok.field_o < jp.field_b - -ct.field_B) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  ok.field_o = 0;
                  break L5;
                } else {
                  L6: {
                    if (ht.field_g) {
                      break L6;
                    } else {
                      if (var2_int != 0) {
                        break L6;
                      } else {
                        ok.field_o = 0;
                        break L5;
                      }
                    }
                  }
                  ok.field_o = jp.field_b;
                  break L5;
                }
              }
              we.field_c = ik.field_k;
              nl.field_o = rs.field_v;
              if (param1 != null) {
                ht.field_g = false;
                break L2;
              } else {
                if (var2_int != 0) {
                  ht.field_g = true;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              if (ht.field_g) {
                break L7;
              } else {
                if (ok.field_o >= jp.field_b) {
                  break L7;
                } else {
                  if (!uu.field_e) {
                    break L7;
                  } else {
                    we.field_c = ik.field_k;
                    nl.field_o = rs.field_v;
                    ok.field_o = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              qj.field_s = param1;
              if (param0 == -6939) {
                break L8;
              } else {
                field_a = (Calendar) null;
                break L8;
              }
            }
            L9: {
              if (!ht.field_g) {
                break L9;
              } else {
                if (wm.field_j == ok.field_o) {
                  ok.field_o = 0;
                  ht.field_g = false;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            ik.field_k = -1;
            rs.field_v = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("qs.A(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 42 / ((66 - param0) / 59);
        av.field_c = new kp();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 10) {
            field_b = 125;
        }
    }

    static {
        field_b = -1;
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
