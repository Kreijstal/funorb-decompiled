/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class d {
    static String field_c;
    static am field_a;
    static bi[] field_b;
    static ln field_d;

    final static boolean a(ve param0, ve param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var5 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.field_zb - param0.field_zb;
              if (param2 == -81) {
                break L1;
              } else {
                var5 = (Random) null;
                d.a((byte) -70, 114, 120, (Random) null);
                break L1;
              }
            }
            L2: {
              if (jo.field_d == param1.field_xb) {
                var3_int -= 200;
                break L2;
              } else {
                if (null != param1.field_xb) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              }
            }
            L3: {
              if (param0.field_xb == jo.field_d) {
                var3_int += 200;
                break L3;
              } else {
                if (param0.field_xb != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackIn_14_0 = 0;
                break L4;
              } else {
                stackIn_14_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("d.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -28065) {
            ve var2 = (ve) null;
            d.a((ve) null, (ve) null, (byte) -8);
        }
    }

    final static void a(int param0, byte param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (wg.field_f == null) {
                break L0;
              } else {
                L1: {
                  if ((param0 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (ih.field_f != cs.field_j) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param1 == 82) {
                  L2: {
                    if (js.field_f.field_j != 0) {
                      break L2;
                    } else {
                      if ((mj.field_Pb - -10000L ^ -1L) <= (pr.a(param1 + 14192) ^ -1L)) {
                        break L2;
                      } else {
                        js.field_f.h(param0, param1 ^ 173);
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if ((js.field_f.field_j ^ -1) < -1) {
                      try {
                        L4: {
                          wg.field_f.a(js.field_f.field_j, 0, js.field_f.field_h, param1 ^ -14022);
                          mj.field_Pb = pr.a(14274);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          q.g(-119);
                          break L5;
                        }
                      }
                      js.field_f.field_j = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
            js.field_f.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1, int param2, Random param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -12) {
                break L1;
              } else {
                d.a(-116);
                break L1;
              }
            }
            stackIn_3_0 = param1 + hi.a(1 + -param1 + param2, param3, -11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("d.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_c = "<%0> fleets remaining.";
    }
}
