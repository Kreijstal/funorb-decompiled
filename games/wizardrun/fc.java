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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = wizardrun.field_H;
        var2 = param0.length();
        if (var2 == 0) {
          return ok.field_f;
        } else {
          if (64 >= var2) {
            if (param0.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var2 <= var4) {
                  if (param1 == -1) {
                    return null;
                  } else {
                    field_a = null;
                    return null;
                  }
                } else {
                  var5 = param0.charAt(var4);
                  if (46 == var5) {
                    L1: {
                      if (var4 == 0) {
                        break L1;
                      } else {
                        if (var4 == -1 + var2) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            var3 = 1;
                            var4++;
                            var4++;
                            continue L0;
                          }
                        }
                      }
                    }
                    return tl.field_d;
                  } else {
                    if ((sc.field_i.indexOf(var5) ^ -1) == 0) {
                      return tl.field_d;
                    } else {
                      var3 = 0;
                      var4++;
                      var4++;
                      continue L0;
                    }
                  }
                }
              }
            } else {
              if (34 != param0.charAt(var2 - 1)) {
                return tl.field_d;
              } else {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (92 != var5) {
                      L3: {
                        if (var5 != 34) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            return tl.field_d;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L4;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            return kj.field_c;
          }
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ga.field_a = stackIn_3_0 != 0;
        cf.field_i = true;
        aa.field_lb = new mh(u.field_A, va.field_i, param0, wi.field_J, ga.field_a);
        if (param2 > -119) {
          return;
        } else {
          u.field_A.b((ub) (Object) aa.field_lb, (byte) 55);
          return;
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
        try {
            if (param0 != 80) {
                field_a = null;
            }
            var4 = param2.getGraphics();
            hl.field_b.a(var4, -29402, param1, param3);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
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
