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
        this.a((byte) -82, param1, param2, param3);
        if (0 != param2) {
          return;
        } else {
          var5 = (((wu) this).field_p >> 1299837825) + param3 + ((wu) this).field_s;
          var6 = ((wu) this).field_v + (param1 - -(((wu) this).field_q >> 149441377));
          var9 = -121 % ((-20 - param0) / 54);
          var8 = ((wu) this).field_A.b(-19704);
          if (var8 != cq.field_g) {
            if (var8 != ji.field_f) {
              if (var8 != jt.field_f) {
                if (var8 != cm.field_u) {
                  return;
                } else {
                  var13 = fr.field_q[1];
                  var13.d(var5 + -(var13.field_q >> 1018448801), var6 + -(var13.field_p >> 324031585), 256);
                  return;
                }
              } else {
                var14 = fr.field_q[2];
                var14.d(-(var14.field_q >> 1783523041) + var5, var6 - (var14.field_p >> -1368626783), 256);
                return;
              }
            } else {
              var17 = fr.field_q[0];
              var10 = var17.field_n << 1927387681;
              var11 = var17.field_o << 804563233;
              if (null != rs.field_f) {
                if (var10 <= rs.field_f.field_q) {
                  if (rs.field_f.field_p >= var11) {
                    bu.a(0, rs.field_f);
                    dg.d();
                    var17.b(112, 144, var17.field_n << 96016100, var17.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                    db.b(89);
                    rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                    return;
                  } else {
                    rs.field_f = new kv(var10, var11);
                    bu.a(0, rs.field_f);
                    var17.b(112, 144, var17.field_n << 96016100, var17.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                    db.b(89);
                    rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                    return;
                  }
                } else {
                  rs.field_f = new kv(var10, var11);
                  bu.a(0, rs.field_f);
                  var17.b(112, 144, var17.field_n << 96016100, var17.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                  return;
                }
              } else {
                rs.field_f = new kv(var10, var11);
                bu.a(0, rs.field_f);
                var17.b(112, 144, var17.field_n << 96016100, var17.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                db.b(89);
                rs.field_f.d(var5 - var17.field_n, var6 + -var17.field_o, 256);
                return;
              }
            }
          } else {
            var16 = fr.field_q[0];
            var10 = var16.field_n << 1927387681;
            var11 = var16.field_o << 804563233;
            if (null != rs.field_f) {
              if (var10 <= rs.field_f.field_q) {
                if (rs.field_f.field_p >= var11) {
                  bu.a(0, rs.field_f);
                  dg.d();
                  var16.b(112, 144, var16.field_n << 96016100, var16.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                  return;
                } else {
                  rs.field_f = new kv(var10, var11);
                  bu.a(0, rs.field_f);
                  var16.b(112, 144, var16.field_n << 96016100, var16.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                  db.b(89);
                  rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                  return;
                }
              } else {
                rs.field_f = new kv(var10, var11);
                bu.a(0, rs.field_f);
                var16.b(112, 144, var16.field_n << 96016100, var16.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
                db.b(89);
                rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
                return;
              }
            } else {
              rs.field_f = new kv(var10, var11);
              bu.a(0, rs.field_f);
              var16.b(112, 144, var16.field_n << 96016100, var16.field_o << -1476124060, -((wu) this).field_D << 177657610, 4096);
              db.b(89);
              rs.field_f.d(var5 - var16.field_n, var6 + -var16.field_o, 256);
              return;
            }
          }
        }
    }

    wu(qu param0) {
        ((wu) this).field_A = param0;
    }

    final void a(int param0, int param1, wj param2, int param3) {
        ((wu) this).field_D = ((wu) this).field_D + 1;
        this.a(param0, param1, param2, param3);
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

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
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
        var15 = BachelorFridge.field_y;
        if (param4 != -23) {
          return;
        } else {
          var5 = 0;
          var6 = param2;
          var7 = -param2;
          var8 = -1;
          var9 = cr.a(eo.field_l, param3 + param2, pw.field_x, 0);
          var10 = cr.a(eo.field_l, param3 - param2, pw.field_x, 0);
          hba.a(param0, var10, tj.field_b[param1], 7, var9);
          L0: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L1: {
                var8 += 2;
                var7 = var7 + var8;
                if (0 >= var7) {
                  break L1;
                } else {
                  var6--;
                  var7 = var7 - (var6 << -172645119);
                  var11 = param1 - var6;
                  var12 = param1 + var6;
                  if (an.field_q > var12) {
                    break L1;
                  } else {
                    if (var11 > ha.field_n) {
                      break L1;
                    } else {
                      L2: {
                        var13 = cr.a(eo.field_l, param3 - -var5, pw.field_x, 0);
                        var14 = cr.a(eo.field_l, -var5 + param3, pw.field_x, 0);
                        if (var12 <= ha.field_n) {
                          hba.a(param0, var14, tj.field_b[var12], 7, var13);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (var11 < an.field_q) {
                        break L1;
                      } else {
                        hba.a(param0, var14, tj.field_b[var11], 7, var13);
                        break L1;
                      }
                    }
                  }
                }
              }
              var5++;
              var11 = param1 - var5;
              var12 = param1 - -var5;
              if (an.field_q > var12) {
                continue L0;
              } else {
                if (var11 <= ha.field_n) {
                  L3: {
                    var13 = cr.a(eo.field_l, var6 + param3, pw.field_x, 0);
                    var14 = cr.a(eo.field_l, param3 - var6, pw.field_x, param4 + 23);
                    if (var12 <= ha.field_n) {
                      hba.a(param0, var14, tj.field_b[var12], 7, var13);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (an.field_q > var11) {
                    continue L0;
                  } else {
                    hba.a(param0, var14, tj.field_b[var11], param4 + 30, var13);
                    continue L0;
                  }
                } else {
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static eq a(int param0, byte param1, String param2) {
        eq var3 = new eq(false);
        int var4 = -117 / ((35 - param1) / 41);
        var3.field_d = param0;
        var3.field_g = param2;
        return var3;
    }

    final boolean a(wj param0, int param1) {
        if (param1 >= -78) {
            ((wu) this).field_D = -13;
            return false;
        }
        return false;
    }

    static {
    }
}
