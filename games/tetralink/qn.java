/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends al {
    static je field_t;
    private dg field_u;
    private dg[] field_q;
    static int[] field_s;
    static hl field_r;
    static String field_v;

    final static void a(boolean param0, byte[] param1, byte[] param2, String[][] param3, oh[][] param4, boolean param5, oh[][] param6, String[][] param7, ah param8, ah param9, int[] param10, int param11, int param12, String[] param13, ah param14) {
        Object var17 = null;
        Object var16 = null;
        c.a(param6, param2, param14, (byte) -35, param1, param7, (int[]) null, param12, param3, param10, param13, param9, param8, (kh[]) null, param5, param11, param4);
        if (param0) {
            qn.a(-32);
        }
    }

    private final void a(qn param0, byte param1, boolean param2) {
        int var4 = 0;
        dg var5 = null;
        dg var6 = null;
        int var7 = 0;
        dg stackIn_8_0 = null;
        dg stackIn_9_0 = null;
        dg stackIn_10_0 = null;
        dg stackIn_10_1 = null;
        dg stackOut_7_0 = null;
        dg stackOut_9_0 = null;
        dg stackOut_9_1 = null;
        dg stackOut_8_0 = null;
        dg stackOut_8_1 = null;
        var7 = TetraLink.field_J;
        if (param1 >= 28) {
          L0: {
            super.a(0, (al) (Object) param0);
            if (param2) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= 6) {
                  break L0;
                } else {
                  var5 = ((qn) this).field_q[var4];
                  if (var5 == null) {
                    param0.field_q[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param0.field_q[var4];
                      stackOut_7_0 = (dg) var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 == null) {
                        param0.field_q[var4] = new dg();
                        stackOut_9_0 = (dg) (Object) stackIn_9_0;
                        stackOut_9_1 = new dg();
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_8_0 = (dg) (Object) stackIn_8_0;
                        stackOut_8_1 = (dg) var6;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((dg) (Object) stackIn_10_0).a(stackIn_10_1, -73);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              rd.a((Object[]) (Object) ((qn) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_v = null;
        field_t = null;
        if (param0 != 24468) {
            qn.a(-59);
        }
    }

    final void a(oh[] param0, int param1) {
        dg[] var3 = null;
        int var4 = 0;
        dg var5 = null;
        int var6 = 0;
        Object var7 = null;
        dg[] var8 = null;
        L0: {
          var6 = TetraLink.field_J;
          if (param1 < -31) {
            break L0;
          } else {
            var7 = null;
            this.a((qn) null, (byte) -119, true);
            break L0;
          }
        }
        var8 = ((qn) this).field_q;
        var3 = var8;
        var4 = 0;
        L1: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_k = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, oh[] param2) {
        int var4 = param0;
        if (!(null != ((qn) this).field_q[var4])) {
            ((qn) this).field_q[var4] = new dg();
        }
        if (param1 != -1664329560) {
            return;
        }
        ((qn) this).field_q[param0].field_k = param2;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        dg var7 = null;
        dg var9 = null;
        ae var10 = null;
        dg var11 = null;
        dg var12 = null;
        dg var13 = null;
        dg var14 = null;
        na stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        na stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof ae)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (na) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (na) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (ae) (Object) stackIn_3_0;
          kl.a(param0.field_F + param0.field_t + param1, param2 + (param0.field_w - -param0.field_u), param0.field_w + param2, (byte) -79, param0.field_t + param1);
          if (var10 != null) {
            param4 = param4 & var10.field_K;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = ((qn) this).field_q[0];
        ((qn) this).field_u.a(30033);
        var7.a(param2, param0, ((qn) this).field_u, param3, param1, (qn) this);
        if (param3) {
          L2: {
            if (var10 != null) {
              L3: {
                if (!var10.field_N) {
                  break L3;
                } else {
                  var11 = ((qn) this).field_q[1];
                  if (var11 == null) {
                    break L3;
                  } else {
                    var11.a(param2, param0, ((qn) this).field_u, true, param1, (qn) this);
                    break L3;
                  }
                }
              }
              if (var10.field_r) {
                L4: {
                  var12 = ((qn) this).field_q[3];
                  if (var10.field_x == 0) {
                    break L4;
                  } else {
                    if (var12 != null) {
                      var12.a(param2, param0, ((qn) this).field_u, param3, param1, (qn) this);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var9 = ((qn) this).field_q[2];
                if (var9 != null) {
                  var9.a(param2, param0, ((qn) this).field_u, param3, param1, (qn) this);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (!param0.c(3)) {
              break L5;
            } else {
              var13 = ((qn) this).field_q[5];
              if (var13 != null) {
                var13.a(param2, param0, ((qn) this).field_u, true, param1, (qn) this);
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (param4) {
              break L6;
            } else {
              var14 = ((qn) this).field_q[4];
              if (var14 != null) {
                var14.a(param2, param0, ((qn) this).field_u, param3, param1, (qn) this);
                break L6;
              } else {
                break L6;
              }
            }
          }
          ((qn) this).field_u.a(46, param2, param1, (qn) this, param0);
          dh.a(-581);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = TetraLink.field_J;
        wb.field_c = param0;
        if (param1 != 128) {
            return;
        }
        bf var2 = (bf) (Object) ha.field_b.c(false);
        while (var2 != null) {
            if (!var2.field_q.a((byte) 95)) {
                var2.b(false);
            } else {
                var2.field_t.f(128 + var2.field_u * wb.field_c >> -1664329560);
            }
            var2 = (bf) (Object) ha.field_b.a((byte) -70);
        }
        if (gi.field_d == null) {
        } else {
            var2 = (bf) (Object) gi.field_d.c(false);
            while (var2 != null) {
                if (var2.field_q.a((byte) 95)) {
                    var2.field_t.f(128 + wb.field_c * var2.field_u >> 465027432);
                } else {
                    var2.b(false);
                }
                var2 = (bf) (Object) gi.field_d.a((byte) -70);
            }
        }
    }

    qn(qn param0, boolean param1) {
        this();
        param0.a((qn) this, (byte) 52, param1);
    }

    final void a(oh param0, byte param1) {
        dg[] var3 = null;
        int var4 = 0;
        dg var5 = null;
        int var6 = 0;
        dg[] var7 = null;
        L0: {
          var6 = TetraLink.field_J;
          var7 = ((qn) this).field_q;
          var3 = var7;
          if (param1 == 71) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_n = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public qn() {
        ((qn) this).field_q = new dg[6];
        ((qn) this).field_u = new dg();
        ((qn) this).field_q[0] = new dg();
        dg var1 = new dg();
        var1.a(30033);
    }

    final dg a(byte param0, int param1) {
        if (param0 != -41) {
            return null;
        }
        ((qn) this).field_q[param1] = new dg();
        return new dg();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new je();
        field_s = new int[]{2};
        field_v = "Set up new game";
    }
}
