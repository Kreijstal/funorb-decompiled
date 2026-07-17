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
        RuntimeException var2_ref = null;
        int var3 = 0;
        eh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            var4 = (eh) (Object) qn.field_t.c(false);
            L1: while (true) {
              if (var4 == null) {
                var2 = sf.field_a.c(false);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ei.a((byte) 102, 4);
                    var2 = sf.field_a.a((byte) -70);
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = 0;
                i.a(4, var4);
                var4 = (eh) (Object) qn.field_t.a((byte) -70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2_ref, "ck.C(" + 1 + 44 + 4 + 41);
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
                  ((ck) this).a(~param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = ((ck) this).field_db.c(param0 + -113);
              var29 = (jh) (Object) ((ck) this).field_H;
              var9 = param1 - -((ck) this).field_t;
              var10 = var29.a((na) this, param2, true) + (var29.a((na) this, false).a(true) >> 1);
              if (pm.field_b == var6) {
                var24 = fj.field_q[0];
                var11 = var24.field_t << 1;
                var12 = var24.field_F << 1;
                if (null != ((ck) this).field_cb) {
                  if (((ck) this).field_cb.field_u >= var11) {
                    if (var12 > ((ck) this).field_cb.field_E) {
                      ((ck) this).field_cb = new oh(var11, var12);
                      sk.a((byte) 111, ((ck) this).field_cb);
                      var24.a(112, 144, var24.field_t << 4, var24.field_F << 4, -((ck) this).field_ab << 10, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var24.field_t >> 1), var10 - var24.field_F, 256);
                      return;
                    } else {
                      sk.a((byte) 118, ((ck) this).field_cb);
                      ra.a();
                      var24.a(112, 144, var24.field_t << 4, var24.field_F << 4, -((ck) this).field_ab << 10, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var24.field_t >> 1), var10 - var24.field_F, 256);
                      return;
                    }
                  } else {
                    ((ck) this).field_cb = new oh(var11, var12);
                    sk.a((byte) 111, ((ck) this).field_cb);
                    var24.a(112, 144, var24.field_t << 4, var24.field_F << 4, -((ck) this).field_ab << 10, 4096);
                    dh.a(-581);
                    ((ck) this).field_cb.b(var9 - (var24.field_t >> 1), var10 - var24.field_F, 256);
                    return;
                  }
                } else {
                  ((ck) this).field_cb = new oh(var11, var12);
                  sk.a((byte) 111, ((ck) this).field_cb);
                  var24.a(112, 144, var24.field_t << 4, var24.field_F << 4, -((ck) this).field_ab << 10, 4096);
                  dh.a(-581);
                  ((ck) this).field_cb.b(var9 - (var24.field_t >> 1), var10 - var24.field_F, 256);
                  return;
                }
              } else {
                if (var6 != ug.field_cb) {
                  if (db.field_h == var6) {
                    var26 = fj.field_q[2];
                    var26.b(var9, -(var26.field_E >> 1) + var10, 256);
                    return;
                  } else {
                    L3: {
                      if (pf.field_a != var6) {
                        break L3;
                      } else {
                        var27 = fj.field_q[1];
                        var27.b(var9, -(var27.field_E >> 1) + var10, 256);
                        break L3;
                      }
                    }
                    return;
                  }
                } else {
                  var23 = fj.field_q[0];
                  var11 = var23.field_t << 1;
                  var12 = var23.field_F << 1;
                  if (null != ((ck) this).field_cb) {
                    if (((ck) this).field_cb.field_u >= var11) {
                      if (var12 > ((ck) this).field_cb.field_E) {
                        ((ck) this).field_cb = new oh(var11, var12);
                        sk.a((byte) 111, ((ck) this).field_cb);
                        var23.a(112, 144, var23.field_t << 4, var23.field_F << 4, -((ck) this).field_ab << 10, 4096);
                        dh.a(-581);
                        ((ck) this).field_cb.b(var9 - (var23.field_t >> 1), var10 - var23.field_F, 256);
                        return;
                      } else {
                        sk.a((byte) 118, ((ck) this).field_cb);
                        ra.a();
                        var23.a(112, 144, var23.field_t << 4, var23.field_F << 4, -((ck) this).field_ab << 10, 4096);
                        dh.a(-581);
                        ((ck) this).field_cb.b(var9 - (var23.field_t >> 1), var10 - var23.field_F, 256);
                        return;
                      }
                    } else {
                      ((ck) this).field_cb = new oh(var11, var12);
                      sk.a((byte) 111, ((ck) this).field_cb);
                      var23.a(112, 144, var23.field_t << 4, var23.field_F << 4, -((ck) this).field_ab << 10, 4096);
                      dh.a(-581);
                      ((ck) this).field_cb.b(var9 - (var23.field_t >> 1), var10 - var23.field_F, 256);
                      return;
                    }
                  } else {
                    ((ck) this).field_cb = new oh(var11, var12);
                    sk.a((byte) 111, ((ck) this).field_cb);
                    var23.a(112, 144, var23.field_t << 4, var23.field_F << 4, -((ck) this).field_ab << 10, 4096);
                    dh.a(-581);
                    ((ck) this).field_cb.b(var9 - (var23.field_t >> 1), var10 - var23.field_F, 256);
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
            ((ck) this).a(~param0);
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
            var10 = var28.a((na) this, param2, true) + (var28.a((na) this, false).a(true) >> 1);
            if (pm.field_b == var6) {
              break L6;
            } else {
              if (var6 != ug.field_cb) {
                if (db.field_h != var6) {
                  if (pf.field_a != var6) {
                    break L5;
                  } else {
                    var21 = fj.field_q[1];
                    var21.b(var9, -(var21.field_E >> 1) + var10, 256);
                    break L5;
                  }
                } else {
                  var20 = fj.field_q[2];
                  var20.b(var9, -(var20.field_E >> 1) + var10, 256);
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
              var11 = var19.field_t << 1;
              var12 = var19.field_F << 1;
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
          var19.a(112, 144, var19.field_t << 4, var19.field_F << 4, -((ck) this).field_ab << 10, 4096);
          dh.a(-581);
          ((ck) this).field_cb.b(var9 - (var19.field_t >> 1), var10 - var19.field_F, 256);
          break L5;
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
            ((ck) this).field_ab = ((ck) this).field_ab + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ck.MA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(na param0, int param1) {
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
            if (param1 == -384169950) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_bb = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ck.EB(");
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(byte param0, boolean param1) {
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
        try {
            ((ck) this).field_eb = param1;
            ((ck) this).field_db = param0;
            ((ck) this).a(param5, param3, -122, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
