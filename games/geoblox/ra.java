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
        if (param1.field_l == null) {
          param1.field_l = ((ra) this).field_c.field_l;
          param1.field_k = ((ra) this).field_c;
          param1.field_l.field_k = param1;
          param1.field_k.field_l = param1;
          if (param0 != -1) {
            Iterator discarded$4 = ((ra) this).iterator();
            return;
          } else {
            return;
          }
        } else {
          param1.a((byte) 124);
          param1.field_l = ((ra) this).field_c.field_l;
          param1.field_k = ((ra) this).field_c;
          param1.field_l.field_k = param1;
          param1.field_k.field_l = param1;
          if (param0 == -1) {
            return;
          } else {
            Iterator discarded$5 = ((ra) this).iterator();
            return;
          }
        }
    }

    final static void a(int param0, rf param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (fe.field_e != param1) {
              if (param0 != 0) {
                field_d = -114;
                uh.field_y.d(-9268);
                fj.field_p.a();
                fe.field_e = param1;
                uh.field_y.a(false, fe.field_e, -1706);
                return;
              } else {
                uh.field_y.d(-9268);
                fj.field_p.a();
                fe.field_e = param1;
                uh.field_y.a(false, fe.field_e, -1706);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
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
                    stackOut_44_0 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    break L1;
                  } else {
                    stackOut_43_0 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_45_0;
                  pb.field_t.a(-35, (hf) (Object) new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, (hf) (Object) new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
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
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    break L4;
                  } else {
                    stackOut_33_0 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    break L4;
                  }
                }
                L5: {
                  var4 = stackIn_35_0;
                  pb.field_t.a(-35, (hf) (Object) new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, (hf) (Object) new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              field_b = null;
              if (var5 != 0) {
                L7: {
                  vl.field_p = vl.field_p | var3;
                  if (!pb.field_t.c(13519)) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L7;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L7;
                  }
                }
                L8: {
                  var4 = stackIn_23_0;
                  pb.field_t.a(-35, (hf) (Object) new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, (hf) (Object) new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
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
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L10;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L10;
                  }
                }
                L11: {
                  var4 = stackIn_13_0;
                  pb.field_t.a(-35, (hf) (Object) new nj(param2));
                  if (var4 != 0) {
                    gf.a((byte) -122);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (!el.field_o.field_K) {
                    ja.field_A.a(-44, (hf) (Object) new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Geoblox.field_C;
        var2 = param1.charAt(0);
        if (param0 == 18725) {
          var3 = 1;
          L0: while (true) {
            if (param1.length() > var3) {
              if (var2 == param1.charAt(var3)) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          var5 = null;
          boolean discarded$5 = ra.a(20, (String) null);
          var3 = 1;
          L1: while (true) {
            if (param1.length() > var3) {
              if (var2 == param1.charAt(var3)) {
                var3++;
                continue L1;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ef((ra) this);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -1) {
            field_d = -36;
        }
    }

    final rc a(byte param0) {
        rc var2 = null;
        int var3 = 0;
        var2 = ((ra) this).field_c.field_k;
        var3 = -14 % ((72 - param0) / 46);
        if (((ra) this).field_c == var2) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have <%0> unread messages!";
        field_a = new tf();
    }
}
