/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ek {
    private oc field_p;
    private oc[] field_q;

    final void a(kc param0, byte param1) {
        oc[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        oc[] var8 = null;
        var7 = Main.field_T;
        var8 = ((nd) this).field_q;
        var3 = var8;
        var4 = 0;
        var5 = 43 % ((-3 - param1) / 34);
        L0: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(kc[] param0, int param1) {
        oc[] var3 = null;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        L0: {
          var6 = Main.field_T;
          var3 = ((nd) this).field_q;
          var4 = 0;
          if (param1 <= -118) {
            break L0;
          } else {
            ((nd) this).field_q = (oc[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_f = (kc[]) param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final oc a(byte param0, int param1) {
        if (param0 != -1) {
            lk var4 = (lk) null;
            ((nd) this).a(8, (lk) null, 72, -15, true);
        }
        ((nd) this).field_q[param1] = new oc();
        return new oc();
    }

    final void a(boolean param0, int param1, kc[] param2) {
        int var4 = param1;
        if (((nd) this).field_q[var4] == null) {
            ((nd) this).field_q[var4] = new oc();
        }
        if (!param0) {
            return;
        }
        ((nd) this).field_q[param1].field_f = (kc[]) param2;
    }

    private final void a(boolean param0, boolean param1, nd param2) {
        int var4 = 0;
        oc var5 = null;
        oc var6 = null;
        int var7 = 0;
        oc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        oc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        oc stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        oc stackIn_9_2 = null;
        oc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        oc stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        oc stackOut_8_2 = null;
        oc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        oc stackOut_7_2 = null;
        var7 = Main.field_T;
        this.a((ek) (Object) param2, (byte) -80);
        if (!param1) {
          L0: {
            if (!param0) {
              og.a((Object[]) (Object) ((nd) this).field_q, 0, (Object[]) (Object) ((nd) param2).field_q, 0, 6);
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -7) {
                  break L0;
                } else {
                  var5 = ((nd) this).field_q[var4];
                  if (var5 == null) {
                    ((nd) param2).field_q[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = ((nd) param2).field_q[var4];
                      stackOut_6_0 = (oc) var5;
                      stackOut_6_1 = -59;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var6 == null) {
                        ((nd) param2).field_q[var4] = new oc();
                        stackOut_8_0 = (oc) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = new oc();
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L2;
                      } else {
                        stackOut_7_0 = (oc) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = (oc) var6;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L2;
                      }
                    }
                    ((oc) (Object) stackIn_9_0).a(stackIn_9_1, (oc) (Object) stackIn_9_2);
                    var4++;
                    continue L1;
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

    public nd() {
        ((nd) this).field_q = new oc[6];
        ((nd) this).field_p = new oc();
        ((nd) this).field_q[0] = new oc();
        oc var1 = new oc();
        var1.a((byte) 44);
    }

    nd(nd param0, boolean param1) {
        this();
        param0.a(param1, false, (nd) this);
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        oc var7 = null;
        oc var9 = null;
        hl var10 = null;
        oc var11 = null;
        oc var12 = null;
        oc var13 = null;
        oc var14 = null;
        lk stackIn_3_0 = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof hl) {
            stackOut_2_0 = (lk) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (hl) (hl) stackIn_3_0;
          ek.a(((lk) param1).field_i + param3, ((lk) param1).field_h + ((lk) param1).field_o + param0, param0 - -((lk) param1).field_o, (byte) 43, ((lk) param1).field_q + (((lk) param1).field_i + param3));
          if (var10 != null) {
            param4 = param4 & ((hl) var10).field_B;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = ((nd) this).field_q[0];
        ((nd) this).field_p.a((byte) 117);
        var7.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -10);
        if (param2 == 11447) {
          L2: {
            if (var10 == null) {
              break L2;
            } else {
              L3: {
                if (((hl) var10).field_D) {
                  var11 = ((nd) this).field_q[1];
                  if (var11 != null) {
                    var11.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -105);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (((hl) var10).field_j) {
                L4: {
                  var12 = ((nd) this).field_q[3];
                  if (((hl) var10).field_x == 0) {
                    break L4;
                  } else {
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -61);
                      break L2;
                    }
                  }
                }
                var9 = ((nd) this).field_q[2];
                if (var9 == null) {
                  break L2;
                } else {
                  var9.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -19);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (param1.d(88)) {
              var13 = ((nd) this).field_q[5];
              if (var13 == null) {
                break L5;
              } else {
                var13.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -120);
                break L5;
              }
            } else {
              break L5;
            }
          }
          L6: {
            if (param4) {
              break L6;
            } else {
              var14 = ((nd) this).field_q[4];
              if (var14 == null) {
                break L6;
              } else {
                var14.a(param3, param1, param0, (nd) this, ((nd) this).field_p, (byte) -85);
                break L6;
              }
            }
          }
          ((nd) this).field_p.a(param0, param1, param3, (byte) 88, (nd) this);
          gg.a(14756);
          return;
        } else {
          return;
        }
    }

    static {
    }
}
