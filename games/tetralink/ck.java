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
        je stackIn_8_0 = null;
        je stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_Z = (fh) null;
                break L1;
              }
            }
            var4 = (eh) ((Object) qn.field_t.c(false));
            L2: while (true) {
              if (var4 == null) {
                L3: {
                  stackIn_8_0 = sf.field_a;

                  if (param0) {
                    stackIn_9_0 = (je) ((Object) stackIn_8_0);
                    stackIn_9_1 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = (je) ((Object) stackIn_8_0);
                    stackIn_9_1 = 1;
                    break L3;
                  }
                }
                var2 = ((je) (Object) stackIn_9_0).c(stackIn_9_1 != 0);
                L4: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    ei.a((byte) 102, param1);
                    var2 = sf.field_a.a((byte) -70);
                    continue L4;
                  }
                }
              } else {
                i.a(param1, var4, 0);
                var4 = (eh) ((Object) qn.field_t.a((byte) -70));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "ck.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jk var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        oh var19;
        Object var22;
        jh var28;
        String var5;
        oh var20;
        oh var21;
        oh var23;
        oh var24;
        oh var26;
        oh var27;
        jh var29;
        L0: {
          var18 = null;
          var22 = null;
          var13 = TetraLink.field_J;
          var6 = this.field_db.c(param0 + -57);
          if (pm.field_b == var6) {
            break L0;
          } else {
            if (ug.field_cb != var6) {
              L1: {
                var5 = this.field_db.a((byte) -73);
                if (var5 != null) {
                  break L1;
                } else {
                  var5 = this.field_eb;
                  break L1;
                }
              }
              L2: {
                if (!var5.equals(this.field_A)) {
                  this.field_A = var5;
                  this.a(param0 ^ -1);
                  break L2;
                } else {
                  break L2;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = this.field_db.c(param0 + -113);
              var29 = (jh) ((Object) this.field_H);
              var9 = param1 - -this.field_t;
              var10 = var29.a((na) (this), param2, true) + (var29.a((na) (this), false).a(true) >> -453111615);
              if (pm.field_b == var6) {
                var24 = fj.field_q[0];
                var11 = var24.field_t << 514006337;
                var12 = var24.field_F << 1226850081;
                if (null != this.field_cb) {
                  if (this.field_cb.field_u >= var11) {
                    if (var12 > this.field_cb.field_E) {
                      this.field_cb = new oh(var11, var12);
                      sk.a((byte) 111, this.field_cb);
                      var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                      dh.a(-581);
                      this.field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                      return;
                    } else {
                      sk.a((byte) 118, this.field_cb);
                      ra.a();
                      var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                      dh.a(-581);
                      this.field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                      return;
                    }
                  } else {
                    this.field_cb = new oh(var11, var12);
                    sk.a((byte) 111, this.field_cb);
                    var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                    dh.a(-581);
                    this.field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
                    return;
                  }
                } else {
                  this.field_cb = new oh(var11, var12);
                  sk.a((byte) 111, this.field_cb);
                  var24.a(112, 144, var24.field_t << -306759068, var24.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                  dh.a(-581);
                  this.field_cb.b(var9 - (var24.field_t >> 2097210433), var10 - var24.field_F, 256);
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
                  if (null != this.field_cb) {
                    if (this.field_cb.field_u >= var11) {
                      if (var12 > this.field_cb.field_E) {
                        this.field_cb = new oh(var11, var12);
                        sk.a((byte) 111, this.field_cb);
                        var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                        dh.a(-581);
                        this.field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                        return;
                      } else {
                        sk.a((byte) 118, this.field_cb);
                        ra.a();
                        var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                        dh.a(-581);
                        this.field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                        return;
                      }
                    } else {
                      this.field_cb = new oh(var11, var12);
                      sk.a((byte) 111, this.field_cb);
                      var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                      dh.a(-581);
                      this.field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
                      return;
                    }
                  } else {
                    this.field_cb = new oh(var11, var12);
                    sk.a((byte) 111, this.field_cb);
                    var23.a(112, 144, var23.field_t << -306759068, var23.field_F << -406597212, -this.field_ab << -2142941174, 4096);
                    dh.a(-581);
                    this.field_cb.b(var9 - (var23.field_t >> 2097210433), var10 - var23.field_F, 256);
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
          if (!var17.equals(this.field_A)) {
            this.field_A = var17;
            this.a(param0 ^ -1);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_db.c(param0 + -113);
            var28 = (jh) ((Object) this.field_H);
            var9 = param1 - -this.field_t;
            var10 = var28.a((na) (this), param2, true) + (var28.a((na) (this), false).a(true) >> -453111615);
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
              if (null == this.field_cb) {
                break L8;
              } else {
                if (this.field_cb.field_u < var11) {
                  break L8;
                } else {
                  if (var12 <= this.field_cb.field_E) {
                    sk.a((byte) 118, this.field_cb);
                    ra.a();
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            this.field_cb = new oh(var11, var12);
            sk.a((byte) 111, this.field_cb);
            break L7;
          }
          var19.a(112, 144, var19.field_t << -306759068, var19.field_F << -406597212, -this.field_ab << -2142941174, 4096);
          dh.a(-581);
          this.field_cb.b(var9 - (var19.field_t >> 2097210433), var10 - var19.field_F, 256);
          break L5;
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
            this.field_ab = this.field_ab + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ck.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -384169950) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_bb = (hl) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ck.EB(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
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
        this.field_eb = (String) null;
        return null;
    }

    ck(vm param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, fd.g(-1));
        try {
            this.field_eb = param1;
            this.field_db = param0;
            this.a(param5, param3, -122, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
