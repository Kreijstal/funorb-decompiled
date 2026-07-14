/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class df extends qm implements a {
    static String field_A;
    vn field_B;
    static int field_y;
    static String field_x;
    static ab field_z;

    final boolean b(int param0, qm param1) {
        oc var5 = null;
        qm var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(!((df) this).field_B.b(true))) {
            return false;
        }
        oc var8 = new oc(((df) this).field_B);
        qm var4 = (qm) (Object) var8.b(-73);
        if (param0 != 2) {
            ((df) this).field_B = null;
        }
        while (var4 != null) {
            if (!(!var4.d(-2116))) {
                var5 = new oc(((df) this).field_B);
                pg discarded$0 = var5.a(false, (pg) (Object) var4);
                var6 = (qm) (Object) var5.d(-18502);
                while (var6 != null) {
                    if (!(!var6.a(0, param1))) {
                        return true;
                    }
                    var6 = (qm) (Object) var5.d(param0 ^ -18504);
                }
            }
            var4 = (qm) (Object) var8.d(-18502);
        }
        return false;
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        oc var9 = new oc(((df) this).field_B);
        qm var8 = (qm) (Object) var9.b(-127);
        while (var8 != null) {
            // ifeq L88
            if (var8.d(-2116)) {
                if (var8.a(param0, (byte) -122, param2, param3)) {
                    return true;
                }
            }
            var8 = (qm) (Object) var9.d(-18502);
        }
        int var6 = param3;
        if (!((var6 ^ -1) != -81)) {
            return !ri.field_b[81] ? ((df) this).b(2, param0) : ((df) this).a(param0, 9555);
        }
        if (param1 >= -120) {
            field_x = null;
            return false;
        }
        return false;
    }

    void d(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((df) this).field_B);
        if (param0 != 29) {
            return;
        }
        qm var3 = (qm) (Object) var2.b(-34);
        while (var3 != null) {
            var3.d((byte) 29);
            var3 = (qm) (Object) var2.d(-18502);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        cb.field_a = true;
        if (param0 != 1) {
            df.c(true);
        }
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        sm.a(var4, var2, param1, param0 + -15368, var3);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        oc var10 = new oc(((df) this).field_B);
        if (!param3) {
            Object var9 = null;
            ((df) this).a((qm) null, 121, -97, 14);
        }
        qm var6 = (qm) (Object) var10.b(-51);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param1 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param2, param1 - -1, param0, (byte) 113);
            var6 = (qm) (Object) var10.d(-18502);
        }
    }

    qm e(int param0) {
        oc var2 = null;
        qm var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 852710177) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        var2 = new oc(((df) this).field_B);
        var3 = (qm) (Object) var2.b(-70);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.d(param0 + -852712293)) {
              var3 = (qm) (Object) var2.d(-18502);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, qm param1) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        oc var3 = new oc(((df) this).field_B);
        qm var4 = (qm) (Object) var3.b(-74);
        while (var4 != null) {
            if (!(!var4.a(0, param1))) {
                return true;
            }
            var4 = (qm) (Object) var3.d(param0 ^ -18502);
        }
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    df(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
        ((df) this).field_B = new vn();
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > -52) {
            field_A = null;
        }
        if (param2 == 0) {
            if (!(null == ((df) this).field_r)) {
                ((df) this).field_r.a((qm) this, 5592405, param1, param3, true);
            }
        }
        oc var5 = new oc(((df) this).field_B);
        qm var6 = (qm) (Object) var5.c(-116);
        while (var6 != null) {
            var6.a((byte) -64, ((df) this).field_n + param1, param2, param3 + ((df) this).field_j);
            var6 = (qm) (Object) var5.c(true);
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 2 / ((-54 - param0) / 54);
        mj.field_p = param1;
        pn.field_c = null;
        co.c(112);
    }

    final void c(int param0, qm param1) {
        if (param0 >= -63) {
            return;
        }
        ((df) this).field_B.b((pg) (Object) param1, -1);
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var11 = ArcanistsMulti.field_G ? 1 : 0;
        int var9 = 67 / ((-42 - param4) / 35);
        oc var8 = new oc(((df) this).field_B);
        qm var10 = (qm) (Object) var8.b(-46);
        while (var10 != null) {
            // ifeq L109
            if (!(!var10.a(param0, param1, param2, param3 - -((df) this).field_j, 89, param5, ((df) this).field_n + param6))) {
                return true;
            }
            var10 = (qm) (Object) var8.d(-18502);
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, -125);
        this.f(-28475);
        if (param4 >= -49) {
            Object var7 = null;
            StringBuilder discarded$0 = ((df) this).a((StringBuilder) null, 92, (Hashtable) null, (byte) 58);
        }
    }

    final static void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        rf var4 = null;
        fj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ab var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        fj stackIn_53_0 = null;
        fj stackIn_54_0 = null;
        fj stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        fj stackOut_52_0 = null;
        fj stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        fj stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        var27 = field_z;
        var2 = var27.e((byte) -127);
        if (!param0) {
          L0: {
            if (var2 != 0) {
              if (-2 != (var2 ^ -1)) {
                jh.a((Throwable) null, "HS1: " + nn.g((byte) -25), (byte) 20);
                ka.b(false);
                break L0;
              } else {
                var3 = var27.n(-98);
                var4_ref = (fj) (Object) me.field_O.b(12623);
                L1: while (true) {
                  L2: {
                    if (var4_ref == null) {
                      break L2;
                    } else {
                      if (var3 == var4_ref.field_k) {
                        break L2;
                      } else {
                        var4_ref = (fj) (Object) me.field_O.a(0);
                        continue L1;
                      }
                    }
                  }
                  if (var4_ref == null) {
                    ka.b(false);
                    return;
                  } else {
                    L3: {
                      stackOut_52_0 = (fj) var4_ref;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_53_0 = stackOut_52_0;
                      if (param0) {
                        stackOut_54_0 = (fj) (Object) stackIn_54_0;
                        stackOut_54_1 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        break L3;
                      } else {
                        stackOut_53_0 = (fj) (Object) stackIn_53_0;
                        stackOut_53_1 = 1;
                        stackIn_55_0 = stackOut_53_0;
                        stackIn_55_1 = stackOut_53_1;
                        break L3;
                      }
                    }
                    ((fj) (Object) stackIn_55_0).a(stackIn_55_1 != 0);
                    break L0;
                  }
                }
              }
            } else {
              var3 = var27.n(-98);
              var4 = (rf) (Object) ef.field_u.b(12623);
              L4: while (true) {
                L5: {
                  if (var4 == null) {
                    break L5;
                  } else {
                    if (var3 == var4.field_i) {
                      break L5;
                    } else {
                      var4 = (rf) (Object) ef.field_u.a(0);
                      continue L4;
                    }
                  }
                }
                if (var4 == null) {
                  ka.b(false);
                  return;
                } else {
                  var5 = var27.e((byte) 112);
                  if (var5 != 0) {
                    var6 = var4.field_m;
                    lc.field_q[0].field_e = ah.field_b;
                    var7 = var4.field_h;
                    lc.field_q[0].field_j = false;
                    lc.field_q[0].field_f = null;
                    var8_int = 1;
                    L6: while (true) {
                      if (var5 <= var8_int) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var34 = new long[3][var6];
                        var35 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.e((byte) 97);
                        if (var18 > 0) {
                          var19 = 0;
                          L7: while (true) {
                            if (var19 < var18) {
                              L8: {
                                var20 = var27.e((byte) 107);
                                var21 = lc.field_q[var20].field_e;
                                var22 = var27.c(-943038560);
                                var24 = var27.field_g;
                                if (var6 > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = lc.field_q[var20].field_f;
                                  var34[0][var12] = var22;
                                  var25 = 0;
                                  L9: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L8;
                                    } else {
                                      var15++;
                                      var35[0][var15] = var27.d(-10674);
                                      var25++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              L10: {
                                if (var21 == null) {
                                  break L10;
                                } else {
                                  if (!je.a(16, var21)) {
                                    break L10;
                                  } else {
                                    var8[1][var13] = ah.field_b;
                                    var9[1][var13] = null;
                                    var34[1][var13] = var22;
                                    var27.field_g = var24;
                                    var13++;
                                    var25 = 0;
                                    L11: while (true) {
                                      if (var7 <= var25) {
                                        break L10;
                                      } else {
                                        var16++;
                                        var35[1][var16] = var27.d(-10674);
                                        var25++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!lc.field_q[var20].field_j) {
                                  lc.field_q[var20].field_j = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = lc.field_q[var20].field_f;
                                  var34[2][var14] = var22;
                                  var27.field_g = var24;
                                  var14++;
                                  var25 = 0;
                                  L12: while (true) {
                                    if (var25 < var7) {
                                      var17++;
                                      var35[2][var17] = var27.d(-10674);
                                      var25++;
                                      continue L12;
                                    } else {
                                      var19++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L7;
                                }
                              } else {
                                var19++;
                                continue L7;
                              }
                            } else {
                              var4.a(true);
                              break L0;
                            }
                          }
                        } else {
                          var4.a(true);
                          break L0;
                        }
                      } else {
                        lc.field_q[var8_int].field_e = var27.l(-1);
                        lc.field_q[var8_int].field_j = false;
                        if (var27.e((byte) 35) == 1) {
                          lc.field_q[var8_int].field_f = var27.l(-1);
                          var8_int++;
                          continue L6;
                        } else {
                          lc.field_q[var8_int].field_f = null;
                          var8_int++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var4.a(true);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    String b(boolean param0) {
        oc var2 = null;
        qm var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_y = 66;
            break L0;
          }
        }
        var2 = new oc(((df) this).field_B);
        var3 = (qm) (Object) var2.b(-53);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(param0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (qm) (Object) var2.d(-18502);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void f(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((df) this).field_B);
        qm var3 = (qm) (Object) var2.b(-97);
        while (var3 != null) {
            var3.e((byte) 112);
            var3 = (qm) (Object) var2.d(-18502);
        }
        if (param0 != -28475) {
            field_x = null;
        }
    }

    boolean d(int param0) {
        if (param0 != -2116) {
            ((df) this).field_B = null;
        }
        return ((df) this).e(852710177) != null ? true : false;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(param0, param1, param2, param3);
        oc var5 = new oc(((df) this).field_B);
        qm var6 = (qm) (Object) var5.b(-83);
        while (var6 != null) {
            // ifeq L93
            var6.a(param0, param1 + ((df) this).field_n, 170, param3 - -((df) this).field_j);
            var6 = (qm) (Object) var5.d(-18502);
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param0;
        oc var3 = new oc(((df) this).field_B);
        qm var4 = (qm) (Object) var3.b(param0 + -46);
        while (var4 != null) {
            var5 = var4.c(0);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (qm) (Object) var3.d(-18502);
        }
        return var2;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5 = -70 / ((param3 - 50) / 60);
        if (((df) this).a(param0, (byte) -90, param2, param1)) {
            ((df) this).a(param0, param1, param2, 1);
            this.a(param2, param1, param0, true);
        }
        return param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        int var9 = ArcanistsMulti.field_G ? 1 : 0;
        oc var7 = new oc(((df) this).field_B);
        qm var8 = (qm) (Object) var7.b(-78);
        while (var8 != null) {
            // ifeq L87
            var8.a(param0, -20592, param2, ((df) this).field_j + param3, ((df) this).field_n + param4, param5);
            var8 = (qm) (Object) var7.d(-18502);
        }
        if (param1 != -20592) {
            ((df) this).a(102, 115, 115, -112, 24);
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            df.a((byte) -32, -73);
        }
        field_x = null;
        field_A = null;
        field_z = null;
    }

    final boolean a(qm param0, int param1) {
        oc var5 = null;
        qm var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(!((df) this).field_B.b(true))) {
            return false;
        }
        if (param1 != 9555) {
            field_A = null;
        }
        oc var8 = new oc(((df) this).field_B);
        qm var4 = (qm) (Object) var8.c(114);
        while (var4 != null) {
            if (!(!var4.d(param1 + -11671))) {
                var5 = new oc(((df) this).field_B);
                pg discarded$0 = var5.a(402, (pg) (Object) var4);
                var6 = (qm) (Object) var5.c(true);
                while (var6 != null) {
                    if (!(!var6.a(param1 + -9555, param0))) {
                        return true;
                    }
                    var6 = (qm) (Object) var5.c(true);
                }
            }
            var4 = (qm) (Object) var8.c(true);
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (param5 != 0) {
            qm discarded$0 = ((df) this).e(117);
        }
        oc var8 = new oc(((df) this).field_B);
        qm var9 = (qm) (Object) var8.b(-113);
        while (var9 != null) {
            // ifeq L107
            if (var9.d(-2116)) {
                if (var9.a(param0, param1, param2, param3, param4, 0, param6)) {
                    return true;
                }
            }
            var9 = (qm) (Object) var8.d(-18502);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "You must play <%1> more rated games before playing with the current options.";
        field_x = "Book of Storm";
    }
}
