/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fc {
    static String field_a;
    static rc field_b;

    public static void a(int param0) {
        if (param0 != 10) {
            String discarded$0 = fc.a((byte) 69, -69L);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static ae a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        ae stackIn_24_0 = null;
        ae stackIn_37_0 = null;
        ae stackIn_42_0 = null;
        Object stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_3_0 = null;
        Object stackOut_50_0 = null;
        ae stackOut_36_0 = null;
        ae stackOut_41_0 = null;
        ae stackOut_11_0 = null;
        ae stackOut_23_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ae stackOut_6_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = ok.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (64 >= var2_int) {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int <= var4) {
                      if (param1 != -1) {
                        field_a = null;
                        stackOut_50_0 = null;
                        stackIn_51_0 = stackOut_50_0;
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (46 == var5) {
                          L3: {
                            if (var4 == 0) {
                              break L3;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  var3 = 1;
                                  var4++;
                                  break L2;
                                }
                              }
                            }
                          }
                          stackOut_36_0 = tl.field_d;
                          stackIn_37_0 = stackOut_36_0;
                          return stackIn_37_0;
                        } else {
                          if (sc.field_i.indexOf(var5) == -1) {
                            stackOut_41_0 = tl.field_d;
                            stackIn_42_0 = stackOut_41_0;
                            return stackIn_42_0;
                          } else {
                            var3 = 0;
                            var4++;
                            break L2;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  if (34 != param0.charAt(var2_int - 1)) {
                    stackOut_11_0 = tl.field_d;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (-1 + var2_int > var4) {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (92 != var5) {
                            L6: {
                              if (var5 != 34) {
                                break L6;
                              } else {
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  stackOut_23_0 = tl.field_d;
                                  stackIn_24_0 = stackOut_23_0;
                                  return stackIn_24_0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          } else {
                            L7: {
                              if (var3 != 0) {
                                stackOut_19_0 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                break L7;
                              } else {
                                stackOut_18_0 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                break L7;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = kj.field_c;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("fc.C(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L8;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param1 + 41);
        }
        return (ae) (Object) stackIn_51_0;
    }

    final static void a(String param0, boolean param1, int param2) {
        ga.field_a = param1;
        cf.field_i = true;
        aa.field_lb = new mh(u.field_A, va.field_i, param0, wi.field_J, ga.field_a);
        if (param2 > -119) {
            return;
        }
        try {
            u.field_A.b((ub) (Object) aa.field_lb, (byte) 55);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fc.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static String a(byte param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hl.field_c.setTime(new Date(param1));
        var3 = hl.field_c.get(7);
        var4 = hl.field_c.get(5);
        var5 = hl.field_c.get(2);
        var6 = hl.field_c.get(1);
        var7 = hl.field_c.get(11);
        if (param0 > -3) {
          return null;
        } else {
          var8 = hl.field_c.get(12);
          var9 = hl.field_c.get(13);
          return of.field_k[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + rj.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static void a(byte param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              L1: {
                if (param0 == 80) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var4 = param2.getGraphics();
              hl.field_b.a(var4, -29402, param1, 0);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("fc.E(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = new rc();
    }
}
