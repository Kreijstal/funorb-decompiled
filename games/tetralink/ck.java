/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends fk {
    static hl field_bb;
    private int field_ab;
    static fh field_Z;
    private String field_eb;
    private vm field_db;
    private oh field_cb;

    public static void f(byte param0) {
        field_bb = null;
        if (param0 < 119) {
            ck.f((byte) -66);
            field_Z = null;
            return;
        }
        field_Z = null;
    }

    final static void a(boolean param0, int param1) {
        mc var2 = null;
        int var3 = 0;
        eh var4 = null;
        je stackIn_4_0 = null;
        je stackIn_5_0 = null;
        je stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        je stackIn_16_0 = null;
        je stackIn_17_0 = null;
        je stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        je stackOut_15_0 = null;
        je stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        je stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        je stackOut_3_0 = null;
        je stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        je stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var3 = TetraLink.field_J;
        if (param0) {
          var4 = (eh) (Object) qn.field_t.c(false);
          L0: while (true) {
            if (var4 != null) {
              i.a(param1, var4, 0);
              var4 = (eh) (Object) qn.field_t.a((byte) -70);
              continue L0;
            } else {
              L1: {
                stackOut_15_0 = sf.field_a;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (param0) {
                  stackOut_17_0 = (je) (Object) stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L1;
                } else {
                  stackOut_16_0 = (je) (Object) stackIn_16_0;
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L1;
                }
              }
              var2 = ((je) (Object) stackIn_18_0).c(stackIn_18_1 != 0);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  ei.a((byte) 102, param1);
                  var2 = sf.field_a.a((byte) -70);
                  continue L2;
                }
              }
            }
          }
        } else {
          field_Z = null;
          var4 = (eh) (Object) qn.field_t.c(false);
          L3: while (true) {
            if (var4 != null) {
              i.a(param1, var4, 0);
              var4 = (eh) (Object) qn.field_t.a((byte) -70);
              continue L3;
            } else {
              L4: {
                stackOut_3_0 = sf.field_a;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0) {
                  stackOut_5_0 = (je) (Object) stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L4;
                } else {
                  stackOut_4_0 = (je) (Object) stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L4;
                }
              }
              var2 = ((je) (Object) stackIn_6_0).c(stackIn_6_1 != 0);
              L5: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  ei.a((byte) 102, param1);
                  var2 = sf.field_a.a((byte) -70);
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        jk var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        oh var19 = null;
        oh var20 = null;
        oh var21 = null;
        Object var22 = null;
        oh var23 = null;
        oh var24 = null;
        oh var26 = null;
        oh var27 = null;
        jh var28 = null;
        jh var29 = null;
        L0: {
          var18 = null;
          var22 = null;
          var13 = TetraLink.field_J;
          var6 = ((ck) this).field_db.c(param0 + -57);
          if (pm.field_b == var6) {
            break L0;
          } else {
            if (ug.field_cb != var6) {
              L1: {
                var5 = ((ck) this).field_db.a((byte) -73);
                if (var5 != null) {
                  break L1;
                } else {
                  var5 = ((ck) this).field_eb;
                  break L1;
                }
              }
              L2: {
                if (!var5.equals((Object) (Object) ((ck) this).field_A)) {
                  ((ck) this).field_A = var5;
                  ((ck) this).a(param0 ^ -1);
                  break L2;
                } else {
                  break L2;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = ((ck) this).field_db.c(param0 + -113);
              var29 = (jh) (Object) ((ck) this).field_H;
              var9 = param1 - -((ck) this).field_t;
              var10 = var29.a((na) this, param2, true) + (var29.a((na) this, false).a(true) >> -453111615);
              if (pm.field_b == var6) {
                var24 = fj.field_q[0];
                var11 = var24.field_t << 514006337;
                var12 = var24.field_F << 1226850081;
                if (null != ((ck) this).field_cb) {
                  if (((ck) this).field_cb.field_u >= var11) {
                    if (var12 > ((ck) this).field_cb.field_E) {
                      ((ck) this).field_cb = new oh(var11, var12);
                      sk.a((byte) 111, ((ck) this).field_cb);
                      var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                      return;
                    } else {
                      sk.a((byte) 118, ((ck) this).field_cb);
                      ra.a();
                      var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                      return;
                    }
                  } else {
                    ((ck) this).field_cb = new oh(var11, var12);
                    sk.a((byte) 111, ((ck) this).field_cb);
                    var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                    dh.a(-581);
                    ((ck) this).field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                    return;
                  }
                } else {
                  ((ck) this).field_cb = new oh(var11, var12);
                  sk.a((byte) 111, ((ck) this).field_cb);
                  var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                  dh.a(-581);
                  ((ck) this).field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                  return;
                }
              } else {
                if (var6 != ug.field_cb) {
                  if (db.field_h == var6) {
                    var26 = fj.field_q[2];
                    var26.b(var9, -(var26.field_E >> -955698719) + var10, 256);
                    return;
                  } else {
                    L3: {
                      if (pf.field_a != var6) {
                        break L3;
                      } else {
                        var27 = fj.field_q[1];
                        var27.b(var9, -(var27.field_E >> 1188696801) + var10, 256);
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  var23 = fj.field_q[0];
                  var11 = var23.field_t << 514006337;
                  var12 = var23.field_F << 1226850081;
                  if (null != ((ck) this).field_cb) {
                    if (((ck) this).field_cb.field_u >= var11) {
                      if (var12 > ((ck) this).field_cb.field_E) {
                        ((ck) this).field_cb = new oh(var11, var12);
                        sk.a((byte) 111, ((ck) this).field_cb);
                        var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                        dh.a(-581);
                        ((ck) this).field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                        return;
                      } else {
                        sk.a((byte) 118, ((ck) this).field_cb);
                        ra.a();
                        var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                        dh.a(-581);
                        ((ck) this).field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                        return;
                      }
                    } else {
                      ((ck) this).field_cb = new oh(var11, var12);
                      sk.a((byte) 111, ((ck) this).field_cb);
                      var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                      return;
                    }
                  } else {
                    ((ck) this).field_cb = new oh(var11, var12);
                    sk.a((byte) 111, ((ck) this).field_cb);
                    var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
                    dh.a(-581);
                    ((ck) this).field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L4: {
          var17 = df.field_a;
          if (!var17.equals((Object) (Object) ((ck) this).field_A)) {
            ((ck) this).field_A = var17;
            ((ck) this).a(param0 ^ -1);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            super.a(param0, param1, param2, param3);
            var6 = ((ck) this).field_db.c(param0 + -113);
            var28 = (jh) (Object) ((ck) this).field_H;
            var9 = param1 - -((ck) this).field_t;
            var10 = var28.a((na) this, param2, true) + (var28.a((na) this, false).a(true) >> -453111615);
            if (pm.field_b == var6) {
              break L6;
            } else {
              if (var6 != ug.field_cb) {
                if (db.field_h != var6) {
                  if (pf.field_a != var6) {
                    break L5;
                  } else {
                    var21 = fj.field_q[1];
                    var21.b(var9, -(var21.field_E >> 1188696801) + var10, 256);
                    break L5;
                  }
                } else {
                  var20 = fj.field_q[2];
                  var20.b(var9, -(var20.field_E >> -955698719) + var10, 256);
                  break L5;
                }
              } else {
                break L6;
              }
            }
          }
          L7: {
            L8: {
              var19 = fj.field_q[0];
              var11 = var19.field_t << 514006337;
              var12 = var19.field_F << 1226850081;
              if (null == ((ck) this).field_cb) {
                break L8;
              } else {
                if (((ck) this).field_cb.field_u < var11) {
                  break L8;
                } else {
                  if (var12 <= ((ck) this).field_cb.field_E) {
                    sk.a((byte) 118, ((ck) this).field_cb);
                    ra.a();
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            ((ck) this).field_cb = new oh(var11, var12);
            sk.a((byte) 111, ((ck) this).field_cb);
            break L7;
          }
          var19.a(112, 144, var19.field_t << -306759068, var19.field_F << -406597212, -((ck) this).field_ab << -2142941174, 4096);
          dh.a(-581);
          ((ck) this).field_cb.b(var9 - (var19.field_t >> 2097210433), var10 - var19.field_F, 256);
          break L5;
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        ((ck) this).field_ab = ((ck) this).field_ab + 1;
        super.a(param0, param1, param2, param3);
    }

    final boolean a(na param0, int param1) {
        if (param1 != -384169950) {
            field_bb = null;
            return false;
        }
        return false;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 126) {
            return;
        }
        jd.a((byte) -55, param1, false);
    }

    final String e(int param0) {
        if (param0 == 0) {
            return null;
        }
        ((ck) this).field_eb = null;
        return null;
    }

    ck(vm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (kg) (Object) fd.g(-1));
        ((ck) this).field_eb = param1;
        ((ck) this).field_db = param0;
        ((ck) this).a(param5, param3, -122, param2, param4);
    }

    static {
    }
}
