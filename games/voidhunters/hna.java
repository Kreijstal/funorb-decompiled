/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hna extends pca implements ntb {
    int field_q;
    int field_p;
    static int field_s;
    static int field_n;
    tw field_r;
    int field_o;

    public final void b(faa param0, int param1) {
        super.b(param0, -123);
        if (param1 > -109) {
            ((hna) this).field_q = 115;
        }
        param0.a(-632, ((hna) this).field_o, 16);
        param0.a(-632, ((hna) this).field_p, 32);
        param0.a(-632, ((hna) this).field_q, 32);
        if (vq.a(param0, -126, ((hna) this).field_r != null ? true : false)) {
            ((hna) this).field_r.b(param0, -115);
        }
    }

    public final void b(byte param0, tv param1) {
        hna var4 = (hna) (Object) param1;
        hna var3 = var4;
        super.b((byte) 88, param1);
        var4.field_p = var4.field_p;
        if (param0 < 54) {
            field_n = 80;
        }
        var4.field_o = var4.field_o;
        var4.field_q = var4.field_q;
        if (null == var4.field_r) {
            var4.field_r = null;
        } else {
            if (var3.field_r == null) {
                var3.field_r = new tw();
            }
            var4.field_r.b((byte) 127, (tv) (Object) var3.field_r);
        }
    }

    final static void a(pe param0, lta param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lta var13 = null;
        Random var14 = null;
        aja var15 = null;
        lta var16 = null;
        aja var17 = null;
        var12 = VoidHunters.field_G;
        var4 = param0.g((byte) -122) >> 31512513;
        if (param3 == -59) {
          L0: {
            var5 = param0.m(1) >> -1426174623;
            if (hbb.field_z <= 0) {
              break L0;
            } else {
              var14 = new Random(234890L);
              var7 = 0;
              L1: while (true) {
                if (var7 >= hbb.field_z) {
                  break L0;
                } else {
                  L2: {
                    var8 = hob.a(var14, param0.g((byte) -122), 127) - var4;
                    var9 = -var5 + hob.a(var14, param0.m(1), param3 + 175);
                    var10 = hob.a(var14, 800, param3 + 179) - -200;
                    var11 = (int)(param1.field_a * (float)(var10 << -668128952));
                    if ((var11 ^ -1) >= -256) {
                      break L2;
                    } else {
                      var11 = 255;
                      break L2;
                    }
                  }
                  jj.a(8947865, (byte) 7, param1.b(true, var9), (float)(int)((float)var10 * param1.field_a), var11, param1.a(var8, (byte) 121));
                  var7++;
                  continue L1;
                }
              }
            }
          }
          L3: {
            if (!li.field_i) {
              break L3;
            } else {
              if ((via.field_b ^ -1) == -2) {
                L4: {
                  L5: {
                    var13 = new lta();
                    var16 = var13;
                    var16.field_d = param1.field_d;
                    var16.field_e = param1.field_e;
                    if (1 == tkb.field_p) {
                      break L5;
                    } else {
                      if (null != psb.field_b) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var16.field_b = param1.field_b;
                  var16.field_a = param1.field_a / 32.0f + 0.00011081559932790697f;
                  var13.field_c = param1.field_c;
                  var15 = mmb.field_d[7];
                  var8 = 4194304;
                  lo.a(0, var8, var15, var16);
                  break L4;
                }
                if (jnb.field_o != 1) {
                  break L3;
                } else {
                  var16.field_c = param1.field_c;
                  var16.field_a = param1.field_a / 64.0f + 0.00005540779966395348f;
                  var13.field_b = param1.field_b;
                  var17 = mmb.field_d[6];
                  var8 = 4194304;
                  lo.a(0, var8, var17, var16);
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          L6: {
            var6 = param1.a(-var4, (byte) 124) - 1;
            var7 = param1.a(var4, (byte) 123) + 1;
            var8 = -1 + param1.b(true, -var5);
            var9 = param1.b(true, var5) - -1;
            if (li.field_i) {
              if (!ceb.field_p) {
                break L6;
              } else {
                og.field_r.U(var6, var8, var7 + -var6, 16777215, 0);
                og.field_r.U(var6, var9, -var6 + var7, 16777215, 0);
                og.field_r.P(var6, var8, -var8 + var9, 16777215, 0);
                og.field_r.P(var7, var8, -var8 + var9, 16777215, 0);
                break L6;
              }
            } else {
              dma.h(var6, var8, -var6 + var7, 16777215);
              dma.h(var6, var9, -var6 + var7, 16777215);
              dma.d(var6, var8, var9 - var8, 16777215);
              dma.d(var7, var8, var9 - var8, 16777215);
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        hna var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          L1: {
            var3 = (hna) (Object) param1;
            var4 = -118 / ((param0 - 22) / 59);
            if (super.a((byte) 90, param1)) {
              break L1;
            } else {
              if (((hna) this).field_o != var3.field_o) {
                break L1;
              } else {
                if (((hna) this).field_p != var3.field_p) {
                  break L1;
                } else {
                  if (var3.field_q != ((hna) this).field_q) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.field_r != null) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L2;
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                    L3: {
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (((hna) this).field_r != null) {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L3;
                      } else {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L3;
                      }
                    }
                    if ((stackIn_10_0 ^ stackIn_10_1) != 0) {
                      break L1;
                    } else {
                      L4: {
                        if (((hna) this).field_r == null) {
                          break L4;
                        } else {
                          if (!((hna) this).field_r.a((byte) 94, (tv) (Object) var3.field_r)) {
                            break L4;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
          stackOut_14_0 = 1;
          stackIn_16_0 = stackOut_14_0;
          break L0;
        }
        return stackIn_16_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((hna) this).field_o = param0.i(0, 16);
        ((hna) this).field_p = param0.i(0, 32);
        ((hna) this).field_q = param0.i(0, 32);
        if (!kv.a(false, param0)) {
            ((hna) this).field_r = null;
        } else {
            if (((hna) this).field_r == null) {
                ((hna) this).field_r = new tw();
            }
            ((hna) this).field_r.a(param0, false);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ((hna) this).field_r = new tw();
        if (param2 != -30790) {
            ((hna) this).field_r = null;
        }
        ((hna) this).field_r.field_c = new dv(param1, param0);
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        hna var5 = null;
        L0: {
          super.a(param0, -94);
          var5 = (hna) (Object) param0;
          if (null == var5.field_r) {
            break L0;
          } else {
            if (null == var5.field_r) {
              break L0;
            } else {
              var5.field_r.a((tv) (Object) var5.field_r, -51);
              break L0;
            }
          }
        }
        L1: {
          var4 = 0;
          if (var5.field_o == var5.field_o) {
            break L1;
          } else {
            System.out.println("int triggers has changed. before=" + var5.field_o + ", now=" + var5.field_o);
            var4 = 1;
            break L1;
          }
        }
        L2: {
          if (var5.field_p == var5.field_p) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int mousex has changed. before=" + var5.field_p + ", now=" + var5.field_p);
            break L2;
          }
        }
        if (param1 <= -19) {
          L3: {
            if (var5.field_q != var5.field_q) {
              System.out.println("int mousey has changed. before=" + var5.field_q + ", now=" + var5.field_q);
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          tw discarded$1 = var5.field_r;
          L4: {
            if (null == var5.field_r) {
              break L4;
            } else {
              if (!var5.field_r.a((byte) 84, (tv) (Object) var5.field_r)) {
                break L4;
              } else {
                System.out.println("SpecialOrderSubmessage special_order_submessage has changed. before=" + var5.field_r + ", now=" + var5.field_r);
                var4 = 1;
                break L4;
              }
            }
          }
          L5: {
            if (var4 == 0) {
              break L5;
            } else {
              System.out.println("This instance of PlayerAction has changed");
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(mfa param0, int param1, tja param2) {
        tfa var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        rsb var9 = null;
        sg var10 = null;
        sg var11 = null;
        tfa stackIn_24_0 = null;
        tfa stackIn_25_0 = null;
        tfa stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        tfa stackOut_23_0 = null;
        tfa stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        tfa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = VoidHunters.field_G;
                    if (!((hna) this).c(-12)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (param1 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var9 = (rsb) (Object) param2;
                    if (null == ((hna) this).field_r) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == ((hna) this).field_r.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9.field_f.a(param1 ^ 42, ((hna) this).field_r.field_d);
                    statePc = 39;
                    continue stateLoop;
                }
                case 7: {
                    var5 = var9.a(((hna) this).field_k, (byte) 59);
                    if (((hna) this).field_r == null) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (((hna) this).field_r.field_e == null) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5.field_m == ((hna) this).field_r.field_e.field_a) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5.field_m = ((hna) this).field_r.field_e.field_a;
                    statePc = 39;
                    continue stateLoop;
                }
                case 11: {
                    var9.field_g.g(-1, ((hna) this).field_k);
                    statePc = 39;
                    continue stateLoop;
                }
                case 12: {
                    if (((hna) this).field_r == null) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((hna) this).field_r.field_c == null) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (((hna) this).field_r.field_c.field_a) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = var9.field_e.e(8);
                    if (var6 != 1) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var5.a(13, ((hna) this).field_r.field_c.field_e, 30024, 0, sl.field_a);
                    statePc = 39;
                    continue stateLoop;
                }
                case 17: {
                    if (2 != var6) {
                        statePc = 39;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5.a(30, ((hna) this).field_r.field_c.field_e, 30024, 14, ena.field_q);
                    statePc = 39;
                    continue stateLoop;
                }
                case 19: {
                    var5.a(((hna) this).field_r.field_c.field_e, (byte) -66);
                    statePc = 39;
                    continue stateLoop;
                }
                case 20: {
                    if (((hna) this).field_r == null) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (((hna) this).field_r.field_a != null) {
                        statePc = 31;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = (tfa) var5;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (((hna) this).field_r == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = (tfa) (Object) stackIn_24_0;
                    stackOut_24_1 = ((hna) this).field_r.field_b;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = (tfa) (Object) stackIn_25_0;
                    stackOut_25_1 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_26_0.field_b = stackIn_26_1;
                    var5.field_f = ((hna) this).field_o;
                    if (fra.field_a == 0) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (1 != ((hna) this).field_p) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (1 != ((hna) this).field_q) {
                        statePc = 30;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var5.field_e = ((hna) this).field_q;
                    var5.field_d = ((hna) this).field_p;
                    statePc = 39;
                    continue stateLoop;
                }
                case 31: {
                    var11 = var9.field_g.d(((hna) this).field_k, 80);
                    if (var11 != null) {
                        statePc = 38;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (cg.a((byte) -128, var9.field_g.d(false))) {
                        statePc = 34;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var10 = new sg();
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        var10.field_k = qia.a(param1 + 1, ((hna) this).field_r.field_a.field_c);
                        var10.e((byte) 119);
                        var10.field_k.a((byte) 0, (anb) (Object) var10);
                        var5.field_g = var10;
                        var9.field_g.g(param1 + -1, ((hna) this).field_k);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var7 = (Exception) (Object) caughtException;
                    hh.a((Throwable) (Object) var7, true, "Invalid blueprint action from player " + ((hna) this).field_k + " AKA " + param0.a(1, ((hna) this).field_k));
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    var11.a((byte) 34, ((hna) this).field_r.field_a);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        return "Tick=" + ((hna) this).field_e + ", system=" + ((hna) this).field_d + ", playerid=" + ((hna) this).field_k + ",triggers=" + ((hna) this).field_o + ", mousex=" + ((hna) this).field_p + ", mousey=" + ((hna) this).field_q + " specialorder=" + ((hna) this).field_r;
    }

    public hna() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 1;
        field_n = 88;
        qb discarded$0 = new qb();
    }
}
