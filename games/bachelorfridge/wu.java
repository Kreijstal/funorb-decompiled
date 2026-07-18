/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wu extends hf {
    private qu field_A;
    private int field_D;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        jg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kv var13 = null;
        kv var14 = null;
        kv var16 = null;
        kv var17 = null;
        var12 = BachelorFridge.field_y;
        super.a((byte) -82, param1, param2, param3);
        if (0 != param2) {
          return;
        } else {
          var5 = (((wu) this).field_p >> 1) + param3 + ((wu) this).field_s;
          var6 = ((wu) this).field_v + (param1 - -(((wu) this).field_q >> 1));
          var9 = -121 % ((-20 - param0) / 54);
          var8 = ((wu) this).field_A.b(-19704);
          if (var8 != cq.field_g) {
            if (var8 != ji.field_f) {
              if (var8 != jt.field_f) {
                if (var8 != cm.field_u) {
                  return;
                } else {
                  var13 = fr.field_q[1];
                  var13.d(var5 + -(var13.field_q >> 1), var6 + -(var13.field_p >> 1), 256);
                  return;
                }
              } else {
                var14 = fr.field_q[2];
                var14.d(-(var14.field_q >> 1) + var5, var6 - (var14.field_p >> 1), 256);
                return;
              }
            } else {
              var17 = fr.field_q[0];
              var10 = var17.field_n << 1;
              var11 = var17.field_o << 1;
              if (null != rs.field_f) {
                if (var10 <= rs.field_f.field_q) {
                  if (rs.field_f.field_p >= var11) {
                    bu.a(0, rs.field_f);
                    dg.d();
                    var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -((wu) this).field_D << 10, 4096);
                    db.b(89);
                    rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                    return;
                  } else {
                    rs.field_f = new kv(var10, var11);
                    bu.a(0, rs.field_f);
                    var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -((wu) this).field_D << 10, 4096);
                    db.b(89);
                    rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                    return;
                  }
                } else {
                  rs.field_f = new kv(var10, var11);
                  bu.a(0, rs.field_f);
                  var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -((wu) this).field_D << 10, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                  return;
                }
              } else {
                rs.field_f = new kv(var10, var11);
                bu.a(0, rs.field_f);
                var17.b(112, 144, var17.field_n << 4, var17.field_o << 4, -((wu) this).field_D << 10, 4096);
                db.b(89);
                rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                return;
              }
            }
          } else {
            var16 = fr.field_q[0];
            var10 = var16.field_n << 1;
            var11 = var16.field_o << 1;
            if (null != rs.field_f) {
              if (var10 <= rs.field_f.field_q) {
                if (rs.field_f.field_p >= var11) {
                  bu.a(0, rs.field_f);
                  dg.d();
                  var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -((wu) this).field_D << 10, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                  return;
                } else {
                  rs.field_f = new kv(var10, var11);
                  bu.a(0, rs.field_f);
                  var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -((wu) this).field_D << 10, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                  return;
                }
              } else {
                rs.field_f = new kv(var10, var11);
                bu.a(0, rs.field_f);
                var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -((wu) this).field_D << 10, 4096);
                db.b(89);
                rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                return;
              }
            } else {
              rs.field_f = new kv(var10, var11);
              bu.a(0, rs.field_f);
              var16.b(112, 144, var16.field_n << 4, var16.field_o << 4, -((wu) this).field_D << 10, 4096);
              db.b(89);
              rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
              return;
            }
          }
        }
    }

    wu(qu param0) {
        try {
            ((wu) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
            ((wu) this).field_D = ((wu) this).field_D + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wu.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String c(byte param0) {
        Object var3 = null;
        if (((wu) this).field_t) {
          return ((wu) this).field_A.a((byte) 71);
        } else {
          if (param0 == 16) {
            return null;
          } else {
            var3 = null;
            ((wu) this).a(-94, 42, (wj) null, -101);
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            var6 = param2;
            var7 = -param2;
            var8 = -1;
            var9 = cr.a(eo.field_l, param3 + param2, pw.field_x, 0);
            var10 = cr.a(eo.field_l, param3 - param2, pw.field_x, 0);
            hba.a(param0, var10, tj.field_b[param1], 7, var9);
            L1: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L2: {
                  var8 += 2;
                  var7 = var7 + var8;
                  if (0 >= var7) {
                    break L2;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var11 = param1 - var6;
                    var12 = param1 + var6;
                    if (an.field_q > var12) {
                      break L2;
                    } else {
                      if (var11 > ha.field_n) {
                        break L2;
                      } else {
                        L3: {
                          var13 = cr.a(eo.field_l, param3 - -var5_int, pw.field_x, 0);
                          var14 = cr.a(eo.field_l, -var5_int + param3, pw.field_x, 0);
                          if (var12 <= ha.field_n) {
                            hba.a(param0, var14, tj.field_b[var12], 7, var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (var11 < an.field_q) {
                          break L2;
                        } else {
                          hba.a(param0, var14, tj.field_b[var11], 7, var13);
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5_int++;
                var11 = param1 - var5_int;
                var12 = param1 - -var5_int;
                if (an.field_q > var12) {
                  continue L1;
                } else {
                  if (var11 <= ha.field_n) {
                    L4: {
                      var13 = cr.a(eo.field_l, var6 + param3, pw.field_x, 0);
                      var14 = cr.a(eo.field_l, param3 - var6, pw.field_x, 0);
                      if (var12 <= ha.field_n) {
                        hba.a(param0, var14, tj.field_b[var12], 7, var13);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (an.field_q > var11) {
                      continue L1;
                    } else {
                      hba.a(param0, var14, tj.field_b[var11], 7, var13);
                      continue L1;
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var5, "wu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + -23 + ')');
        }
    }

    final static eq a(int param0, byte param1, String param2) {
        eq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        eq stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        eq stackOut_0_0 = null;
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
            var3 = new eq(false);
            var4 = -117 / ((35 - param1) / 41);
            var3.field_d = param0;
            var3.field_g = param2;
            stackOut_0_0 = (eq) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("wu.C(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 < -78) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((wu) this).field_D = -13;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wu.W(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
    }
}
