/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra implements Iterable {
    static String field_b;
    rc field_c;
    static int field_d;
    static tf field_a;

    final void a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_l == null) {
                break L1;
              } else {
                param1.a((byte) 124);
                break L1;
              }
            }
            param1.field_l = this.field_c.field_l;
            param1.field_k = this.field_c;
            param1.field_l.field_k = param1;
            param1.field_k.field_l = param1;
            if (param0 == -1) {
              break L0;
            } else {
              this.iterator();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ra.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, rf param1) {
        if (param1 == null || fe.field_e == param1) {
            return;
        }
        try {
            if (param0 != 0) {
                field_d = -114;
            }
            uh.field_y.d(-9268);
            fj.field_p.a();
            fe.field_e = param1;
            uh.field_y.a(false, fe.field_e, -1706);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ra.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int var3;
        int var4;
        int var5;
        if (el.field_o.field_Y) {
          return;
        } else {
          var3 = 1 << param2;
          if ((vl.field_p & var3) == 0) {
            L0: {
              ug.field_c = ug.field_c | var3;
              el.field_o.field_e = el.field_o.field_e + 1;
              var4 = param2;
              if (-1 == (1 << var4 & dc.field_a ^ -1)) {
                stackIn_8_0 = 0;
                break L0;
              } else {
                stackIn_8_0 = 1;
                break L0;
              }
            }
            var5 = stackIn_8_0;
            if (param1 < -47) {
              if (var5 == 0) {
                L1: {
                  dc.field_a = dc.field_a | 1 << var4;
                  el.field_g = el.field_g - (1 << var4);
                  vl.field_p = vl.field_p | var3;
                  if (!pb.field_t.c(13519)) {
                    stackIn_45_0 = 0;
                    break L1;
                  } else {
                    stackIn_45_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_45_0;
                  pb.field_t.a(-35, new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              } else {
                L4: {
                  vl.field_p = vl.field_p | var3;
                  if (!pb.field_t.c(13519)) {
                    stackIn_35_0 = 0;
                    break L4;
                  } else {
                    stackIn_35_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var4 = stackIn_35_0;
                  pb.field_t.a(-35, new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              field_b = (String) null;
              if (var5 != 0) {
                L7: {
                  vl.field_p = vl.field_p | var3;
                  if (!pb.field_t.c(13519)) {
                    stackIn_23_0 = 0;
                    break L7;
                  } else {
                    stackIn_23_0 = 1;
                    break L7;
                  }
                }
                L8: {
                  var4 = stackIn_23_0;
                  pb.field_t.a(-35, new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              } else {
                L10: {
                  dc.field_a = dc.field_a | 1 << var4;
                  el.field_g = el.field_g - (1 << var4);
                  vl.field_p = vl.field_p | var3;
                  if (!pb.field_t.c(13519)) {
                    stackIn_13_0 = 0;
                    break L10;
                  } else {
                    stackIn_13_0 = 1;
                    break L10;
                  }
                }
                L11: {
                  var4 = stackIn_13_0;
                  pb.field_t.a(-35, new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var2_int = param1.charAt(0);
              if (param0 == 18725) {
                break L1;
              } else {
                var5 = (String) null;
                ra.a(20, (String) null);
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              if (param1.length() <= var3) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int == param1.charAt(var3)) {
                  var3++;
                  continue L2;
                } else {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ra.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ef((ra) (this)));
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -1) {
            field_d = -36;
        }
    }

    final rc a(byte param0) {
        rc var2;
        int var3;
        var2 = this.field_c.field_k;
        var3 = -14 % ((72 - param0) / 46);
        if (this.field_c == var2) {
          return null;
        } else {
          var2.a((byte) 126);
          return var2;
        }
    }

    private ra() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "You have <%0> unread messages!";
        field_a = new tf();
    }
}
