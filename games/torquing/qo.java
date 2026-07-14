/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends am {
    private int field_u;
    private int field_s;
    static int field_t;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            field_t = -29;
            break L0;
          }
        }
        L1: {
          var3 = ((qo) this).field_l.a(param1, 25657);
          if (!((qo) this).field_l.field_b) {
            break L1;
          } else {
            var4 = ((qo) this).b(0, 0, param1);
            var5 = 0;
            L2: while (true) {
              if (ci.field_c <= var5) {
                break L1;
              } else {
                var6 = var4[var5];
                if (((qo) this).field_s > var6) {
                  var3[var5] = ((qo) this).field_s;
                  var5++;
                  continue L2;
                } else {
                  if (var6 > ((qo) this).field_u) {
                    var3[var5] = ((qo) this).field_u;
                    var5++;
                    continue L2;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final static void g(byte param0) {
        i.field_R = false;
        me.field_a = null;
        ib.field_c = null;
        qh.field_b = null;
        if (param0 != -68) {
            Object var2 = null;
            lh discarded$0 = qo.a(47, -32, -37, (fi) null, (la) null);
        }
        fd.field_k = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var34 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        var15 = Torquing.field_u;
        var42 = ((qo) this).field_r.a(15142, param1);
        var34 = var42;
        var26 = var34;
        var18 = var26;
        var16 = var18;
        var3 = var16;
        if (param0 == -29116) {
          L0: {
            if (!((qo) this).field_r.field_b) {
              break L0;
            } else {
              var41 = ((qo) this).c(param0 + 53182, param1, 0);
              var43 = var41[0];
              var44 = var41[1];
              var45 = var41[2];
              var46 = var42[0];
              var38 = var46;
              var30 = var38;
              var22 = var30;
              var8 = var22;
              var47 = var42[1];
              var39 = var47;
              var31 = var39;
              var23 = var31;
              var9 = var23;
              var48 = var42[2];
              var40 = var48;
              var32 = var40;
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ci.field_c) {
                  break L0;
                } else {
                  L2: {
                    var12 = var43[var11];
                    var13 = var44[var11];
                    var14 = var45[var11];
                    if (((qo) this).field_s <= var12) {
                      if (((qo) this).field_u < var12) {
                        var8[var11] = ((qo) this).field_u;
                        break L2;
                      } else {
                        var46[var11] = var12;
                        break L2;
                      }
                    } else {
                      var8[var11] = ((qo) this).field_s;
                      break L2;
                    }
                  }
                  L3: {
                    if (((qo) this).field_s <= var13) {
                      if (var13 > ((qo) this).field_u) {
                        var9[var11] = ((qo) this).field_u;
                        break L3;
                      } else {
                        var47[var11] = var13;
                        break L3;
                      }
                    } else {
                      var9[var11] = ((qo) this).field_s;
                      break L3;
                    }
                  }
                  if (var14 >= ((qo) this).field_s) {
                    if (((qo) this).field_u < var14) {
                      var10[var11] = ((qo) this).field_u;
                      var11++;
                      continue L1;
                    } else {
                      var48[var11] = var14;
                      var11++;
                      continue L1;
                    }
                  } else {
                    var10[var11] = ((qo) this).field_s;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (var4 != 0) {
            if (var4 == 1) {
              ((qo) this).field_u = param0.i(7088);
              break L0;
            } else {
              if (2 == var4) {
                L1: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-2 != (param0.i((byte) -101) ^ -1)) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                ((qo) this).field_p = stackIn_10_1 != 0;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ((qo) this).field_s = param0.i(param1 + 7053);
            break L0;
          }
        }
        L2: {
          if (param1 == 35) {
            break L2;
          } else {
            int[] discarded$1 = ((qo) this).a((byte) -121, -73);
            break L2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        L0: {
          if (-param1 + param4 < kn.field_e) {
            v.a(param2, param4, param0, (byte) 77, param1);
            break L0;
          } else {
            if (param1 + param4 > qg.field_z) {
              v.a(param2, param4, param0, (byte) 77, param1);
              break L0;
            } else {
              if (-param1 + param2 < j.field_q) {
                v.a(param2, param4, param0, (byte) 77, param1);
                break L0;
              } else {
                if (param2 - -param1 > qk.field_p) {
                  v.a(param2, param4, param0, (byte) 77, param1);
                  break L0;
                } else {
                  r.a(param4, param1, -121, param0, param2);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param3 == -95) {
            break L1;
          } else {
            qo.g((byte) 86);
            break L1;
          }
        }
    }

    public qo() {
        super(1, false);
        ((qo) this).field_u = 4096;
        ((qo) this).field_s = 0;
    }

    final static lh a(int param0, int param1, int param2, fi param3, la param4) {
        byte[] var6 = param4.a(param0, param2 + 100, param1);
        byte[] var5 = var6;
        if (param2 != 0) {
            return null;
        }
        if (var6 == null) {
            return null;
        }
        return new lh(new fj(var6), param3);
    }

    static {
    }
}
