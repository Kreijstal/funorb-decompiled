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
        RuntimeException var3 = null;
        qm var4 = null;
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        oc var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_B.b(true)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new oc(this.field_B);
                var4 = (qm) ((Object) var8.b(-73));
                if (param0 == 2) {
                  break L1;
                } else {
                  this.field_B = (vn) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(-2116)) {
                      var5 = new oc(this.field_B);
                      var5.a(false, var4);
                      var6 = (qm) ((Object) var5.d(-18502));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(0, param1)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (qm) ((Object) var5.d(param0 ^ -18504));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (qm) ((Object) var8.d(-18502));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("df.TB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        qm var8 = null;
        oc var9 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var9 = new oc(this.field_B);
            var8 = (qm) ((Object) var9.b(-127));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -66)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.d(-2116)) {
                        break L3;
                      } else {
                        if (!var8.a(param0, (byte) -122, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var8 = (qm) ((Object) var9.d(-18502));
                    continue L1;
                  }
                }
              }
              var6 = param3;
              if ((var6 ^ -1) == -81) {
                L4: {
                  if (ri.field_b[81]) {
                    stackIn_14_0 = this.a(param0, 9555);
                    break L4;
                  } else {
                    stackIn_14_0 = this.b(2, param0);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 < -120) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  field_x = (String) null;
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("df.N(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    void d(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(this.field_B);
        if (param0 != 29) {
            return;
        }
        qm var3 = (qm) ((Object) var2.b(-34));
        while (var3 != null) {
            var3.d((byte) 29);
            var3 = (qm) ((Object) var2.d(-18502));
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            cb.field_a = true;
            if (param0 != 1) {
                df.c(true);
            }
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            sm.a(var4, var2, param1, param0 + -15368, var3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "df.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        qm var6 = null;
        int var7 = 0;
        int var8 = 0;
        qm var9 = null;
        oc var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new oc(this.field_B);
              if (param3) {
                break L1;
              } else {
                var9 = (qm) null;
                this.a((qm) null, 121, -97, 14);
                break L1;
              }
            }
            var6 = (qm) ((Object) var10.b(-51));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param1 < var7) {
                    var6.a(param2, param1 - -1, param0, (byte) 113);
                    var6 = (qm) ((Object) var10.d(-18502));
                    continue L2;
                  } else {
                    discarded$4 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("df.LB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    qm e(int param0) {
        oc var2;
        qm var3;
        int var4;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 852710177) {
            break L0;
          } else {
            field_x = (String) null;
            break L0;
          }
        }
        var2 = new oc(this.field_B);
        var3 = (qm) ((Object) var2.b(-70));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.d(param0 + -852712293)) {
              var3 = (qm) ((Object) var2.d(-18502));
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
        oc var3 = null;
        RuntimeException var3_ref = null;
        qm var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3 = new oc(this.field_B);
            var4 = (qm) ((Object) var3.b(-74));
            L1: while (true) {
              if (var4 == null) {
                if (param0 == 0) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (var4.a(0, param1)) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (qm) ((Object) var3.d(param0 ^ -18502));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("df.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    df(int param0, int param1, int param2, int param3, pf param4) {
        super(param0, param1, param2, param3, param4, (wc) null);
        this.field_B = new vn();
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > -52) {
            field_A = (String) null;
        }
        if (param2 == 0) {
            if (!(null == this.field_r)) {
                this.field_r.a((qm) (this), 5592405, param1, param3, true);
            }
        }
        oc var5 = new oc(this.field_B);
        qm var6 = (qm) ((Object) var5.c(-116));
        while (var6 != null) {
            var6.a((byte) -64, this.field_n + param1, param2, param3 + this.field_j);
            var6 = (qm) ((Object) var5.c(true));
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
        try {
            this.field_B.b(param1, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "df.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        qm var10 = null;
        int var11 = 0;
        oc var12 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var9 = 67 / ((-42 - param4) / 35);
            var12 = new oc(this.field_B);
            var10 = (qm) ((Object) var12.b(-46));
            L1: while (true) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  if (!var10.b((byte) -105)) {
                    break L2;
                  } else {
                    if (var10.a(param0, param1, param2, param3 - -this.field_j, 89, param5, this.field_n + param6)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var10 = (qm) ((Object) var12.d(-18502));
                      continue L1;
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("df.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, -125);
        this.f(-28475);
        if (param4 >= -49) {
            Hashtable var7 = (Hashtable) null;
            this.a((StringBuilder) null, 92, (Hashtable) null, (byte) 58);
        }
    }

    final static void d(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        fj stackIn_54_0 = null;
        fj stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fj var4 = null;
        rf var4_ref = null;
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
        var26 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var27 = field_z;
            var2 = var27.e((byte) -127);
            if (!param0) {
              L1: {
                if (var2 != 0) {
                  if (-2 != (var2 ^ -1)) {
                    jh.a((Throwable) null, "HS1: " + nn.g((byte) -25), (byte) 20);
                    ka.b(false);
                    break L1;
                  } else {
                    var3 = var27.n(-98);
                    var27.c(-943038560);
                    var4 = (fj) ((Object) me.field_O.b(12623));
                    L2: while (true) {
                      L3: {
                        if (var4 == null) {
                          break L3;
                        } else {
                          if (var3 == var4.field_k) {
                            break L3;
                          } else {
                            var4 = (fj) ((Object) me.field_O.a(0));
                            continue L2;
                          }
                        }
                      }
                      if (var4 == null) {
                        ka.b(false);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          stackIn_54_0 = (fj) (var4);

                          if (param0) {
                            stackIn_55_0 = (fj) ((Object) stackIn_54_0);
                            stackIn_55_1 = 0;
                            break L4;
                          } else {
                            stackIn_55_0 = (fj) ((Object) stackIn_54_0);
                            stackIn_55_1 = 1;
                            break L4;
                          }
                        }
                        ((fj) (Object) stackIn_55_0).a(stackIn_55_1 != 0);
                        break L1;
                      }
                    }
                  }
                } else {
                  var3 = var27.n(-98);
                  var4_ref = (rf) ((Object) ef.field_u.b(12623));
                  L5: while (true) {
                    L6: {
                      if (var4_ref == null) {
                        break L6;
                      } else {
                        if (var3 == var4_ref.field_i) {
                          break L6;
                        } else {
                          var4_ref = (rf) ((Object) ef.field_u.a(0));
                          continue L5;
                        }
                      }
                    }
                    if (var4_ref == null) {
                      ka.b(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = var27.e((byte) 112);
                      if (var5 != 0) {
                        var6 = var4_ref.field_m;
                        lc.field_q[0].field_e = ah.field_b;
                        var7 = var4_ref.field_h;
                        lc.field_q[0].field_j = false;
                        lc.field_q[0].field_f = null;
                        var8_int = 1;
                        L7: while (true) {
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
                              L8: while (true) {
                                if (var19 < var18) {
                                  L9: {
                                    var20 = var27.e((byte) 107);
                                    var21 = lc.field_q[var20].field_e;
                                    var22 = var27.c(-943038560);
                                    var24 = var27.field_g;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = lc.field_q[var20].field_f;
                                      var34[0][var12] = var22;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L9;
                                        } else {
                                          incrementValue$0 = var15;
                                          var15++;
                                          var35[0][incrementValue$0] = var27.d(-10674);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L11: {
                                    if (var21 == null) {
                                      break L11;
                                    } else {
                                      if (!je.a(16, var21)) {
                                        break L11;
                                      } else {
                                        var8[1][var13] = ah.field_b;
                                        var9[1][var13] = null;
                                        var34[1][var13] = var22;
                                        var27.field_g = var24;
                                        var13++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            incrementValue$1 = var16;
                                            var16++;
                                            var35[1][incrementValue$1] = var27.d(-10674);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var6 <= var14) {
                                      break L13;
                                    } else {
                                      if (lc.field_q[var20].field_j) {
                                        break L13;
                                      } else {
                                        lc.field_q[var20].field_j = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = lc.field_q[var20].field_f;
                                        var34[2][var14] = var22;
                                        var27.field_g = var24;
                                        var14++;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var25 >= var7) {
                                            break L13;
                                          } else {
                                            incrementValue$2 = var17;
                                            var17++;
                                            var35[2][incrementValue$2] = var27.d(-10674);
                                            var25++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L8;
                                } else {
                                  var4_ref.a(true);
                                  break L1;
                                }
                              }
                            } else {
                              var4_ref.a(true);
                              break L1;
                            }
                          } else {
                            L15: {
                              lc.field_q[var8_int].field_e = var27.l(-1);
                              lc.field_q[var8_int].field_j = false;
                              if (var27.e((byte) 35) == 1) {
                                lc.field_q[var8_int].field_f = var27.l(-1);
                                break L15;
                              } else {
                                lc.field_q[var8_int].field_f = null;
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      } else {
                        var4_ref.a(true);
                        break L1;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "df.NB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    String b(boolean param0) {
        oc var2;
        qm var3;
        String var4;
        int var5;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_y = 66;
            break L0;
          }
        }
        var2 = new oc(this.field_B);
        var3 = (qm) ((Object) var2.b(-53));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(param0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (qm) ((Object) var2.d(-18502));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    private final void f(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(this.field_B);
        qm var3 = (qm) ((Object) var2.b(-97));
        while (var3 != null) {
            var3.e((byte) 112);
            var3 = (qm) ((Object) var2.d(-18502));
        }
        if (param0 != -28475) {
            field_x = (String) null;
        }
    }

    boolean d(int param0) {
        if (param0 != -2116) {
            this.field_B = (vn) null;
        }
        return this.e(852710177) != null ? true : false;
    }

    void a(qm param0, int param1, int param2, int param3) {
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new oc(this.field_B);
            var6 = (qm) ((Object) var5.b(-83));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b((byte) -121)) {
                    break L2;
                  } else {
                    var6.a(param0, param1 + this.field_n, 170, param3 - -this.field_j);
                    var6 = (qm) ((Object) var5.d(-18502));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("df.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param0;
        oc var3 = new oc(this.field_B);
        qm var4 = (qm) ((Object) var3.b(param0 + -46));
        while (var4 != null) {
            var5 = var4.c(0);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (qm) ((Object) var3.d(-18502));
        }
        return var2;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = -70 / ((param3 - 50) / 60);
              if (!this.a(param0, (byte) -90, param2, param1)) {
                break L1;
              } else {
                this.a(param0, param1, param2, 1);
                this.a(param2, param1, param0, true);
                break L1;
              }
            }
            stackIn_3_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("df.FA(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        oc var7 = null;
        qm var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new oc(this.field_B);
            var8 = (qm) ((Object) var7.b(-78));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -99)) {
                    break L2;
                  } else {
                    var8.a(param0, -20592, param2, this.field_j + param3, this.field_n + param4, param5);
                    var8 = (qm) ((Object) var7.d(-18502));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 == -20592) {
                  break L3;
                } else {
                  this.a(102, 115, 115, -112, 24);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("df.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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
        RuntimeException var3 = null;
        qm var4 = null;
        oc var5 = null;
        qm var6 = null;
        int var7 = 0;
        oc var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_B.b(true)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 9555) {
                  break L1;
                } else {
                  field_A = (String) null;
                  break L1;
                }
              }
              var8 = new oc(this.field_B);
              var4 = (qm) ((Object) var8.c(114));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(param1 + -11671)) {
                      var5 = new oc(this.field_B);
                      var5.a(402, var4);
                      var6 = (qm) ((Object) var5.c(true));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param1 + -9555, param0)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (qm) ((Object) var5.c(true));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (qm) ((Object) var8.c(true));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("df.PB(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        oc var8 = null;
        RuntimeException var8_ref = null;
        qm var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                this.e(117);
                break L1;
              }
            }
            var8 = new oc(this.field_B);
            var9 = (qm) ((Object) var8.b(-113));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -80)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(-2116)) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, param4, 0, param6)) {
                          break L4;
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (qm) ((Object) var8.d(-18502));
                    continue L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("df.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_A = "You must play <%1> more rated games before playing with the current options.";
        field_x = "Book of Storm";
    }
}
