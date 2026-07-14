/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends wk implements ec {
    private la field_m;
    private la field_p;
    private boolean field_o;
    static int field_k;
    private cf field_l;
    private int field_n;
    static int field_q;
    static int field_j;
    static int field_i;

    public final int[] a(int param0, float param1) {
        vm var3 = null;
        vm stackIn_2_0 = null;
        Object stackIn_2_1 = null;
        la stackIn_2_2 = null;
        float stackIn_2_3 = 0.0f;
        vm stackIn_3_0 = null;
        Object stackIn_3_1 = null;
        la stackIn_3_2 = null;
        float stackIn_3_3 = 0.0f;
        vm stackIn_4_0 = null;
        Object stackIn_4_1 = null;
        la stackIn_4_2 = null;
        float stackIn_4_3 = 0.0f;
        vm stackIn_5_0 = null;
        Object stackIn_5_1 = null;
        la stackIn_5_2 = null;
        float stackIn_5_3 = 0.0f;
        vm stackIn_6_0 = null;
        Object stackIn_6_1 = null;
        la stackIn_6_2 = null;
        float stackIn_6_3 = 0.0f;
        int stackIn_6_4 = 0;
        vm stackOut_1_0 = null;
        Object stackOut_1_1 = null;
        la stackOut_1_2 = null;
        float stackOut_1_3 = 0.0f;
        vm stackOut_2_0 = null;
        Object stackOut_2_1 = null;
        la stackOut_2_2 = null;
        float stackOut_2_3 = 0.0f;
        vm stackOut_5_0 = null;
        Object stackOut_5_1 = null;
        la stackOut_5_2 = null;
        float stackOut_5_3 = 0.0f;
        int stackOut_5_4 = 0;
        vm stackOut_3_0 = null;
        Object stackOut_3_1 = null;
        la stackOut_3_2 = null;
        float stackOut_3_3 = 0.0f;
        vm stackOut_4_0 = null;
        Object stackOut_4_1 = null;
        la stackOut_4_2 = null;
        float stackOut_4_3 = 0.0f;
        int stackOut_4_4 = 0;
        var3 = this.b(param0, (byte) -61);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            L1: {
              stackOut_1_0 = (vm) var3;
              stackOut_1_1 = this;
              stackOut_1_2 = ((op) this).field_p;
              stackOut_1_3 = param1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (((op) this).field_o) {
                break L1;
              } else {
                stackOut_2_0 = (vm) (Object) stackIn_2_0;
                stackOut_2_1 = this;
                stackOut_2_2 = (la) (Object) stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                if (!((op) this).a(param0, (byte) 98).field_h) {
                  stackOut_5_0 = (vm) (Object) stackIn_5_0;
                  stackOut_5_1 = this;
                  stackOut_5_2 = (la) (Object) stackIn_5_2;
                  stackOut_5_3 = stackIn_5_3;
                  stackOut_5_4 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  break L0;
                } else {
                  stackOut_3_0 = (vm) (Object) stackIn_3_0;
                  stackOut_3_1 = this;
                  stackOut_3_2 = (la) (Object) stackIn_3_2;
                  stackOut_3_3 = stackIn_3_3;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  break L1;
                }
              }
            }
            stackOut_4_0 = (vm) (Object) stackIn_4_0;
            stackOut_4_1 = this;
            stackOut_4_2 = (la) (Object) stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L0;
          }
          return ((vm) (Object) stackIn_6_0).a((si) this, stackIn_6_2, stackIn_6_3, stackIn_6_4 != 0);
        }
    }

    final static void a(byte param0, fj param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4, byte[] param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Torquing.field_u;
          var7 = ed.a((byte) 72, param4);
          if (mo.field_y == null) {
            mo.field_y = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              if (param0 == 20) {
                break L2;
              } else {
                op.a(-68L, 80);
                break L2;
              }
            }
            if (hc.field_c == null) {
              hc.field_c = new fj(var7);
              hc.field_c.field_n = 0;
              hc.field_c.a(param4, param6, param5, (byte) -53);
              hc.field_c.d(var7, 114);
              hc.field_c.a(5479, var15);
              if (null != vg.field_k) {
                if (vg.field_k.field_j.length >= 100) {
                  vg.field_k.field_n = 0;
                  vg.field_k.b(90, 10);
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    if (4 <= var11) {
                      vg.field_k.a(param4, param0 + 52);
                      vg.field_k.a(param2, param3, -64);
                      param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                      param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                      return;
                    } else {
                      vg.field_k.b((byte) 60, var15[var11]);
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  vg.field_k = new fj(100);
                  vg.field_k.field_n = 0;
                  vg.field_k.b(90, 10);
                  var11 = 0;
                  var9 = var11;
                  L4: while (true) {
                    if (4 <= var11) {
                      vg.field_k.a(param4, param0 + 52);
                      vg.field_k.a(param2, param3, -64);
                      param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                      param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                      return;
                    } else {
                      vg.field_k.b((byte) 60, var15[var11]);
                      var11++;
                      continue L4;
                    }
                  }
                }
              } else {
                vg.field_k = new fj(100);
                vg.field_k.field_n = 0;
                vg.field_k.b(90, 10);
                var11 = 0;
                var9 = var11;
                L5: while (true) {
                  if (4 <= var11) {
                    vg.field_k.a(param4, param0 + 52);
                    vg.field_k.a(param2, param3, -64);
                    param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                    param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                    return;
                  } else {
                    vg.field_k.b((byte) 60, var15[var11]);
                    var11++;
                    continue L5;
                  }
                }
              }
            } else {
              if (var7 > hc.field_c.field_j.length) {
                hc.field_c = new fj(var7);
                hc.field_c.field_n = 0;
                hc.field_c.a(param4, param6, param5, (byte) -53);
                hc.field_c.d(var7, 114);
                hc.field_c.a(5479, var15);
                if (null == vg.field_k) {
                  vg.field_k = new fj(100);
                  vg.field_k.field_n = 0;
                  vg.field_k.b(90, 10);
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    if (4 <= var11) {
                      vg.field_k.a(param4, param0 + 52);
                      vg.field_k.a(param2, param3, -64);
                      param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                      param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                      return;
                    } else {
                      vg.field_k.b((byte) 60, var15[var11]);
                      var11++;
                      continue L6;
                    }
                  }
                } else {
                  if (vg.field_k.field_j.length < 100) {
                    vg.field_k = new fj(100);
                    vg.field_k.field_n = 0;
                    vg.field_k.b(90, 10);
                    var11 = 0;
                    var9 = var11;
                    L7: while (true) {
                      if (4 <= var11) {
                        vg.field_k.a(param4, param0 + 52);
                        vg.field_k.a(param2, param3, -64);
                        param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                        param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                        return;
                      } else {
                        vg.field_k.b((byte) 60, var15[var11]);
                        var11++;
                        continue L7;
                      }
                    }
                  } else {
                    vg.field_k.field_n = 0;
                    vg.field_k.b(90, 10);
                    var11 = 0;
                    var9 = var11;
                    L8: while (true) {
                      if (4 <= var11) {
                        vg.field_k.a(param4, param0 + 52);
                        vg.field_k.a(param2, param3, -64);
                        param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                        param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                        return;
                      } else {
                        vg.field_k.b((byte) 60, var15[var11]);
                        var11++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                hc.field_c.field_n = 0;
                hc.field_c.a(param4, param6, param5, (byte) -53);
                hc.field_c.d(var7, 114);
                hc.field_c.a(5479, var15);
                if (null == vg.field_k) {
                  vg.field_k = new fj(100);
                  vg.field_k.field_n = 0;
                  vg.field_k.b(90, 10);
                  var11 = 0;
                  var9 = var11;
                  L9: while (true) {
                    if (4 <= var11) {
                      vg.field_k.a(param4, param0 + 52);
                      vg.field_k.a(param2, param3, -64);
                      param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                      param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                      return;
                    } else {
                      vg.field_k.b((byte) 60, var15[var11]);
                      var11++;
                      continue L9;
                    }
                  }
                } else {
                  L10: {
                    if (vg.field_k.field_j.length >= 100) {
                      vg.field_k.field_n = 0;
                      vg.field_k.b(90, 10);
                      var11 = 0;
                      var9 = var11;
                      break L10;
                    } else {
                      vg.field_k = new fj(100);
                      vg.field_k.field_n = 0;
                      vg.field_k.b(90, 10);
                      var11 = 0;
                      var9 = var11;
                      break L10;
                    }
                  }
                  L11: while (true) {
                    if (4 <= var11) {
                      vg.field_k.a(param4, param0 + 52);
                      vg.field_k.a(param2, param3, -64);
                      param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                      param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                      return;
                    } else {
                      vg.field_k.b((byte) 60, var15[var11]);
                      var11++;
                      continue L11;
                    }
                  }
                }
              }
            }
          } else {
            var8[var9] = mo.field_y.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    private final vm b(int param0, byte param1) {
        vm var3 = null;
        vm var3_ref = null;
        byte[] var4 = null;
        var3 = (vm) (Object) ((op) this).field_l.a((long)param0, 4604);
        if (var3 != null) {
          return var3;
        } else {
          if (param1 == -61) {
            var4 = ((op) this).field_m.a(param0, param1 + 161, 0);
            if (var4 == null) {
              return null;
            } else {
              var3_ref = new vm(new fj(var4));
              ((op) this).field_l.a((long)param0, (ta) (Object) var3_ref, 0);
              return var3_ref;
            }
          } else {
            field_k = -28;
            var4 = ((op) this).field_m.a(param0, param1 + 161, 0);
            if (var4 == null) {
              return null;
            } else {
              var3_ref = new vm(new fj(var4));
              ((op) this).field_l.a((long)param0, (ta) (Object) var3_ref, 0);
              return var3_ref;
            }
          }
        }
    }

    final static void a(long param0, int param1) {
        InterruptedException var3 = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param0);
                        if (param1 >= 75) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var4 = null;
                        op.a((byte) -95, (fj) null, (java.math.BigInteger) null, (java.math.BigInteger) null, 124, (byte[]) null, -48);
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean d(int param0) {
        return !((op) this).a(param0, (byte) 98).field_g;
    }

    public final int c(int param0) {
        return ((op) this).a(param0, (byte) 98).field_j;
    }

    final wd a(byte param0, int param1) {
        vm var3 = null;
        if (param0 > 19) {
          var3 = this.b(param1, (byte) -61);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_u;
          }
        } else {
          field_j = 49;
          var3 = this.b(param1, (byte) -61);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_u;
          }
        }
    }

    op(la param0, la param1, la param2, int param3, boolean param4) {
        super(param1, param0, param2);
        ((op) this).field_o = false;
        ((op) this).field_n = 50;
        ((op) this).field_m = param0;
        ((op) this).field_n = param3;
        ((op) this).field_p = param2;
        ((op) this).field_o = param4 ? true : false;
        ((op) this).field_l = new cf(((op) this).field_n);
    }

    public final int b(int param0) {
        return ((op) this).a(param0, (byte) 98).field_d & 65535;
    }

    public final boolean a(int param0) {
        if (((op) this).field_o) {
          return true;
        } else {
          if (!((op) this).a(param0, (byte) 98).field_h) {
            return false;
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        tb.a(50, -128);
    }
}
