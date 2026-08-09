/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fc {
    static String field_a;
    static rc field_b;

    public static void a(int param0) {
        if (param0 != 10) {
            fc.a((byte) 69, -69L);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static ae a(String param0, int param1) {
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        ae stackIn_24_0 = null;
        ae stackIn_38_0 = null;
        ae stackIn_43_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = ok.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (64 >= var2_int) {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var2_int <= var4) {
                      if (param1 != -1) {
                        field_a = (String) null;
                        stackIn_52_0 = null;
                        decompiledRegionSelector0 = 6;
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
                                  break L2;
                                }
                              }
                            }
                          }
                          stackIn_38_0 = tl.field_d;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if ((sc.field_i.indexOf(var5) ^ -1) == 0) {
                            stackIn_43_0 = tl.field_d;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
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
                    stackIn_12_0 = tl.field_d;
                    decompiledRegionSelector0 = 2;
                    break L0;
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
                                  stackIn_24_0 = tl.field_d;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          } else {
                            L7: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L7;
                              } else {
                                stackIn_20_0 = 1;
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
                stackIn_7_0 = kj.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("fc.C(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L8;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_38_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_43_0;
                  } else {
                    return (ae) ((Object) stackIn_52_0);
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        ga.field_a = param1;
        cf.field_i = true;
        aa.field_lb = new mh(u.field_A, va.field_i, param0, wi.field_J, ga.field_a);
        if (param2 > -119) {
            return;
        }
        try {
            u.field_A.b((ub) (aa.field_lb), (byte) 55);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "fc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(byte param0, long param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        hl.field_c.setTime(new Date(param1));
        var3 = hl.field_c.get(7);
        var4 = hl.field_c.get(5);
        var5 = hl.field_c.get(2);
        var6 = hl.field_c.get(1);
        var7 = hl.field_c.get(11);
        if (param0 > -3) {
          return (String) null;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            L0: {
              L1: {
                if (param0 == 80) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              var4 = param2.getGraphics();
              hl.field_b.a(var4, -29402, param1, param3);
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
            stackIn_8_0 = (RuntimeException) (var4_ref2);

            stackIn_8_1 = new StringBuilder().append("fc.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = new rc();
    }
}
