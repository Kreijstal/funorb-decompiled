/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kda {
    private ij field_i;
    private int field_d;
    private boolean field_l;
    private int field_b;
    private int field_n;
    private ij field_c;
    ova field_j;
    private boolean field_o;
    private boolean field_p;
    private boolean field_a;
    private boolean field_e;
    private int[] field_k;
    private int field_h;
    um field_m;
    private boolean field_q;
    private int field_f;
    static String field_g;

    final int b(boolean param0, int param1) {
        if (param1 >= 0) {
            // if_acmpeq L24
            // if_icmpge L24
        } else {
            return -1;
        }
        if (!param0) {
            return 123;
        }
        return ((kda) this).field_k[param1];
    }

    final void a(byte param0) {
        ((kda) this).field_a = false;
        int var2 = -6 % ((param0 - -48) / 43);
    }

    final int a(boolean param0, int param1) {
        ((kda) this).field_a = false;
        ((kda) this).field_o = false;
        ((kda) this).field_c.e(110);
        int var3 = ((kda) this).field_n;
        ((kda) this).field_n = 0;
        ((kda) this).field_i = new ij();
        if (param1 != -13027) {
            ((kda) this).field_m = null;
        }
        iva.a(-6940, "Called Carousel_clientgame.start_game(), resetting any buffered events");
        ((kda) this).field_b = 0;
        ((kda) this).field_h = 2147483647;
        if (!(param0)) {
            ((kda) this).field_k = null;
            ((kda) this).field_d = 0;
        }
        ((kda) this).field_f = 0;
        ((kda) this).field_p = false;
        ((kda) this).field_e = false;
        return var3;
    }

    private final void a(byte param0, int param1) {
        if (param0 != 85) {
            ((kda) this).field_i = null;
        }
        ((kda) this).field_d = param1;
    }

    final byte[] b(faa param0, int param1) {
        ((kda) this).field_m.a((ds) (Object) param0, param1 ^ 900, nia.field_o);
        if (param1 != 1000) {
            boolean discarded$0 = ((kda) this).a(-52);
        }
        ((kda) this).field_a = true;
        byte[] var4 = ((kda) this).field_m.b(-30223);
        byte[] var3 = var4;
        return var4;
    }

    private final void a(mib param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uqb var11 = null;
        tja var11_ref = null;
        int var12 = 0;
        bhb var13 = null;
        lla var14 = null;
        int var16 = 0;
        byte[] var20 = null;
        mib stackIn_18_0 = null;
        mib stackIn_19_0 = null;
        mib stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mib stackOut_17_0 = null;
        mib stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mib stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var16 = VoidHunters.field_G;
          if (param4) {
            param3 = param3 - lla.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        if (((kda) this).field_h < param3) {
          L1: {
            var6 = -param0.field_g + param3;
            var7 = ((kda) this).c(param2 + -1000) / 2;
            var8 = ela.field_p * var7 / param2;
            var9 = foa.field_q / 2 - -(2 * var8);
            if (-var9 > var6) {
              var10 = -var6 + shb.field_k;
              if (var10 >= param0.c((byte) 114)) {
                iva.a(param2 ^ -6388, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back");
                return;
              } else {
                var11 = (uqb) (Object) param0.field_f.d(0);
                L2: while (true) {
                  if (var11 == null) {
                    L3: {
                      var11_ref = param0.a(var10, param2 ^ -949);
                      var12 = tmb.a((tv) (Object) var11_ref, (byte) -70);
                      stackOut_17_0 = (mib) param0;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var12 == param1) {
                        stackOut_19_0 = (mib) (Object) stackIn_19_0;
                        stackOut_19_1 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      } else {
                        stackOut_18_0 = (mib) (Object) stackIn_18_0;
                        stackOut_18_1 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L3;
                      }
                    }
                    stackIn_20_0.field_k = stackIn_20_1 != 0;
                    if (!param0.field_k) {
                      break L1;
                    } else {
                      if (((kda) this).field_e) {
                        break L1;
                      } else {
                        if (lw.field_f) {
                          L4: {
                            ((kda) this).field_e = true;
                            iva.a(-6940, "Carousel_clientgame: Now out of sync for server tick " + param3 + ", which is " + -var6 + " ticks back, so dumping state");
                            if (null == ((kda) this).field_j) {
                              ((kda) this).field_j = new ova(kha.field_v);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (!((kda) this).field_j.a(param2 + -1000)) {
                            break L1;
                          } else {
                            iva.a(-6940, "Carousel_clientgame: Sending the state dump to the server");
                            var13 = new bhb(-var10 + param0.field_g, bk.field_w);
                            var14 = new lla();
                            var14.a(84, 0, var13.field_d, var13.field_d.length);
                            var20 = wi.a((byte) 10, var14.field_f);
                            ((kda) this).field_j.a(var20, 0);
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (var11.a(115)) {
                        break L5;
                      } else {
                        if (-var10 + param0.field_g >= var11.field_e) {
                          iva.a(-6940, "Carousel_clientgame_Info.check_servercrc_against_clientcrc was going to look " + var10 + " steps back when unconfirmed event was back by " + (-var11.field_e + param0.field_g));
                          return;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = (uqb) (Object) param0.field_f.a((byte) 36);
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean a(mib param0, int param1) {
        int var3 = ((kda) this).c(0) * ela.field_p / param1;
        int var4 = wsb.field_f + -var3;
        if (param0.field_c > var4) {
            return true;
        }
        return false;
    }

    final boolean a(byte param0, mib param1, int param2, faa param3) {
        uqb var5 = null;
        if (((kda) this).field_l) {
            if (param2 >= 0) {
                if (!(((kda) this).field_p)) {
                    iva.a(-6940, "Carousel_clientgame: Sending ready packet");
                    var5 = (uqb) (Object) wc.field_a.a((byte) 77);
                    var5.field_e = param1.field_g;
                    var5.a(param2, -125);
                    this.a(var5, param3, 1000);
                    ((kda) this).field_p = true;
                }
            }
        }
        if (param0 != 110) {
            return false;
        }
        return false;
    }

    final void a(int param0, faa param1) {
        if (param0 != -32339) {
            return;
        }
        whb var3 = new whb();
        var3.field_b = (ub) (Object) new mo("<RequestNewestBlackBox>");
        rkb.a(0, (tv) (Object) var3, param1, fk.field_e);
    }

    final void a(boolean param0, uqb param1, mib param2, boolean param3, boolean param4, int param5, faa param6) {
        uqb var8 = null;
        if (param4) {
            // ifeq L26
        }
        if (!(!param2.f(1))) {
            return;
        }
        param1.field_f = !param4 ? true : false;
        if (!param0) {
            Object var9 = null;
            ((kda) this).b((mib) null, 33);
        }
        param1.field_e = -param5 + param2.field_g;
        if ((hna.field_s ^ -1) == -2) {
            if (!(((kda) this).field_f < param1.field_e)) {
                return;
            }
        }
        if (this.a(param2, 1000)) {
            return;
        }
        ((kda) this).field_f = param1.field_e;
        if (!param4) {
        } else {
            if (!param3) {
                this.a(param1, param6, 1000);
            } else {
                var8 = (uqb) (Object) wc.field_a.a((byte) 49);
                param1.b((byte) 75, (tv) (Object) var8);
                ((kda) this).field_i.b(-10258, (ksa) (Object) var8);
            }
        }
        if (!param2.a(1, param1)) {
            tfb.a((byte) -101, "Carousel_clientgame: Added an action off your own carousel! " + param1);
        }
    }

    private final void a(uqb param0, faa param1, int param2) {
        if (param2 != 1000) {
            ((kda) this).field_a = true;
        }
        em.field_o = false;
        rkb.a(0, (tv) (Object) param0, param1, pra.field_o);
        em.field_o = true;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 <= 4) {
            kda.b(-77);
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        return ((kda) this).field_d;
    }

    final boolean a(faa param0, faa param1, boolean param2, byte param3, int param4, mib param5) {
        int var7_int = 0;
        byte[] var7 = null;
        int var8_int = 0;
        faa var8 = null;
        Exception var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        af var15 = null;
        umb var16 = null;
        Object var17 = null;
        uqb var17_ref = null;
        String var18 = null;
        byte[] var19 = null;
        whb var20 = null;
        Object var21 = null;
        mo var21_ref = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        Object stackIn_19_0 = null;
        mib stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        Object stackIn_20_0 = null;
        mib stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        Object stackIn_21_0 = null;
        mib stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        Object stackOut_18_0 = null;
        mib stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        Object stackOut_19_0 = null;
        mib stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        Object stackOut_20_0 = null;
        mib stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var21 = null;
                    var13 = VoidHunters.field_G;
                    if (param4 == vi.field_o) {
                        statePc = 2;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var16 = new umb();
                    param1.p(-23497);
                    var16.a(param1, false);
                    param1.f((byte) -38);
                    if (param5 == null) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!param5.f(1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return true;
                }
                case 5: {
                    if (param5 == null) {
                        statePc = 22;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (((kda) this).field_a) {
                        statePc = 22;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!((kda) this).field_o) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return true;
                }
                case 9: {
                    var8_int = var16.field_f;
                    if (!param2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8_int = var8_int + foa.field_q;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    param5.a(var8_int, var16.field_e, 0);
                    if (!var16.field_e) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    iva.a(param3 ^ -6941, "Carousel_clientgame: Handling catchup packet here, where targettick=" + var8_int + ",(+ " + (-param5.field_g + var8_int) + "), playinggame=" + param2);
                    param5.g(-1);
                    iva.a(-6940, "Carousel_clientgame: Tick is now " + param5.field_g);
                    if (!((kda) this).field_l) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    iva.a(-6940, "Carousel_clientgame: Is ready");
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ((kda) this).field_h = param5.field_g;
                    ((kda) this).field_l = true;
                    statePc = 22;
                    continue stateLoop;
                }
                case 16: {
                    if (((kda) this).field_l) {
                        statePc = 18;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (mib) param5;
                    stackOut_18_2 = var16.field_g;
                    stackOut_18_3 = param3 ^ 1007;
                    stackOut_18_4 = var16.field_f;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    stackIn_20_4 = stackOut_18_4;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    stackIn_19_4 = stackOut_18_4;
                    if (param2) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackOut_19_1 = (mib) (Object) stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = stackIn_19_3;
                    stackOut_19_4 = stackIn_19_4;
                    stackOut_19_5 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    stackIn_21_4 = stackOut_19_4;
                    stackIn_21_5 = stackOut_19_5;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = this;
                    stackOut_20_1 = (mib) (Object) stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = stackIn_20_3;
                    stackOut_20_4 = stackIn_20_4;
                    stackOut_20_5 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    stackIn_21_4 = stackOut_20_4;
                    stackIn_21_5 = stackOut_20_5;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    this.a(stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5 != 0);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return true;
                }
                case 23: {
                    if (pr.field_d == param4) {
                        statePc = 25;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var17_ref = (uqb) (Object) wc.field_a.a((byte) -126);
                    param1.p(-23497);
                    var17_ref.a(param1, false);
                    param1.f((byte) -114);
                    if (param5 == null) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (param5.f(1)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return true;
                }
                case 29: {
                    if (param5 == null) {
                        statePc = 37;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (((kda) this).field_a) {
                        statePc = 37;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (((kda) this).field_o) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (!param5.a(1, var17_ref)) {
                        statePc = 34;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var9_int = -1;
                    if (!(var17_ref instanceof pca)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var9_int = ((pca) (Object) var17_ref).field_k;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var18 = param5.e(param3 + 101).a(param3 ^ 6, var9_int);
                    tfb.a((byte) -92, "I'm " + kca.field_a + ", and an action from " + var18 + " is off carousel so dropping connection");
                    ifb.l(-118);
                    statePc = 41;
                    continue stateLoop;
                }
                case 37: {
                    if (!var17_ref.c(120)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var17_ref.field_d.field_c) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((kda) this).field_c.b(-10258, (ksa) (Object) var17_ref);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    return true;
                }
                case 42: {
                    if (param3 == 7) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var14 = null;
                    boolean discarded$1 = this.a((mib) null, -70);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (ehb.field_g != param4) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var7_int = param1.h(94);
                    if (param5 == null) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (((kda) this).field_a) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (((kda) this).field_o) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    param0.h(24335, pka.field_o);
                    param0.d(var7_int, 332614536);
                    param0.d(param5.field_g, 332614536);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return true;
                }
                case 50: {
                    if (iva.field_o != param4) {
                        statePc = 68;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var7_int = param1.h(98);
                    var8_int = param1.h(74);
                    var9_int = param1.e((byte) -121);
                    var10 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var10 >= var9_int) {
                        statePc = 62;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11 = param1.h(95);
                    var12 = param1.h(95);
                    if (param5 != null) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var10++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 55: {
                    if (!((kda) this).field_a) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var10++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 57: {
                    if (!((kda) this).field_o) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var10++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 59: {
                    if (!param5.f(1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var10++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 61: {
                    this.a(var12, false, var11);
                    var10++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 62: {
                    if (param5 == null) {
                        statePc = 67;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (((kda) this).field_a) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (((kda) this).field_o) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (param5.f(1)) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    param5.a(false, var7_int);
                    this.a((byte) 85, var8_int);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    return true;
                }
                case 68: {
                    if (param4 == qha.field_o) {
                        statePc = 70;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ((kda) this).field_m.a((ds) (Object) param1, 90, nia.field_o);
                    var24 = ((kda) this).field_m.b(param3 ^ -30218);
                    var23 = var24;
                    var22 = var23;
                    var19 = var22;
                    var7 = var19;
                    if (var7 == null) {
                        statePc = 79;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var8 = wl.a(9, var24);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    try {
                        var20 = new whb();
                        var8.p(-23497);
                        var20.a(var8, false);
                        var8.f((byte) -33);
                        if (var20.field_b instanceof af) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var20.field_b instanceof mo) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var21_ref = (mo) (Object) var20.field_b;
                        iva.a(-6940, "The newest black box recording=" + var21_ref.field_i);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        iva.a(param3 + -6947, "Received black box recording");
                        var15 = (af) (Object) var20.field_b;
                        param5.field_d = var15;
                        ((kda) this).b(param5, -125);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    var9 = (Exception) (Object) caughtException;
                    iva.a(param3 + -6947, "Error reading in debug response");
                    var9.printStackTrace();
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    return true;
                }
                case 80: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(byte param0) {
        int var2 = ((kda) this).field_q ? 1 : 0;
        ((kda) this).field_q = false;
        int var3 = -118 / ((-41 - param0) / 55);
        return var2 != 0;
    }

    final void a(int param0, int param1) {
        if (param0 != -29804) {
            return;
        }
        ((kda) this).field_n = param1;
    }

    final void c(byte param0) {
        ((kda) this).field_o = true;
        if (param0 != -94) {
            Object var3 = null;
            ((kda) this).a(-3, (faa) null);
        }
    }

    final void a(boolean param0) {
        if (((kda) this).field_a) {
            ((kda) this).field_q = true;
        }
        if (!param0) {
            ((kda) this).field_k = null;
        }
    }

    final boolean a(int param0) {
        if (param0 != -28208) {
            ((kda) this).field_h = 115;
        }
        return ((kda) this).field_a;
    }

    final void a(int param0, boolean param1, mib param2) {
        int var4 = 0;
        int var5 = 0;
        ksa var6 = null;
        umb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uqb var12 = null;
        uqb var13 = null;
        L0: {
          var10 = VoidHunters.field_G;
          if (!((kda) this).field_l) {
            break L0;
          } else {
            iva.a(-6940, "Carousel_clientgame:Not ready");
            break L0;
          }
        }
        ((kda) this).field_l = false;
        ((kda) this).field_h = 2147483647;
        var4 = 0;
        var5 = 0;
        var6 = ((kda) this).field_c.d(param0);
        L1: while (true) {
          if (var6 == null) {
            iva.a(-6940, "Carousel_clientgame: Adding all the way with " + var4 + " actions, and " + var5 + " server ticks. Tick=" + param2.field_g + ", Ticks behind=" + param2.field_c);
            param2.g(param0 + -1);
            iva.a(-6940, "Carousel_clientgame: Tick is now " + param2.field_g);
            return;
          } else {
            if (!(var6 instanceof uqb)) {
              L2: {
                if (var6 instanceof umb) {
                  L3: {
                    var7 = (umb) (Object) var6;
                    var8 = var7.field_f;
                    var9 = var8;
                    if (param1) {
                      iva.a(-6940, "Carousel_clientgame: Adding the server follow time...");
                      var9 = var9 + foa.field_q;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var7.field_e) {
                      break L4;
                    } else {
                      tfb.a((byte) -122, "Carousel_clientgame: Recieved a client catchup packet which still connecting");
                      break L4;
                    }
                  }
                  var5++;
                  param2.a(var9, false, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              var6 = ((kda) this).field_c.a((byte) 62);
              continue L1;
            } else {
              L5: {
                var12 = (uqb) (Object) var6;
                var13 = var12;
                if (osa.field_e) {
                  var13.field_g = false;
                  break L5;
                } else {
                  break L5;
                }
              }
              var4++;
              boolean discarded$1 = param2.a(param0 ^ 1, (uqb) (Object) var6);
              var6 = ((kda) this).field_c.a((byte) 62);
              continue L1;
            }
          }
        }
    }

    final void a(faa param0, int param1, String param2) {
        whb var4 = new whb();
        var4.field_b = (ub) (Object) new mo("<SetCarouselConstant>" + param2);
        rkb.a(param1 ^ param1, (tv) (Object) var4, param0, fk.field_e);
    }

    private final void a(int param0, boolean param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        var6 = VoidHunters.field_G;
        if (param2 >= 0) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              ((kda) this).field_d = 52;
              break L0;
            }
          }
          L1: {
            if (null == ((kda) this).field_k) {
              ((kda) this).field_k = new int[1 + param2];
              break L1;
            } else {
              if (((kda) this).field_k.length <= param2) {
                var7 = new int[param2 - -1];
                var4 = var7;
                var5 = 0;
                L2: while (true) {
                  if (((kda) this).field_k.length <= var5) {
                    ((kda) this).field_k = var4;
                    break L1;
                  } else {
                    var7[var5] = ((kda) this).field_k[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          ((kda) this).field_k[param2] = param0;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, String param1, faa param2) {
        if (param0 < 63) {
            this.a((byte) -70, -117);
        }
        whb var4 = new whb();
        var4.field_b = (ub) (Object) new mo(param1);
        rkb.a(0, (tv) (Object) var4, param2, fk.field_e);
    }

    final void a(faa param0, int param1) {
        uqb var4 = null;
        int var5 = VoidHunters.field_G;
        if (!(wh.g(-121))) {
            if (!(!((kda) this).field_l)) {
                iva.a(-6940, "Carousel_clientgame: Not ready");
            }
            ((kda) this).field_l = false;
        }
        int var3 = 80 / ((-42 - param1) / 46);
        if (!(!((kda) this).field_a)) {
            if (((kda) this).field_l) {
                iva.a(-6940, "Carousel_clientgame: Not ready");
            }
            ((kda) this).field_l = false;
        }
        if (null != ((kda) this).field_j) {
            ((kda) this).field_j.a(param0, nia.field_o, 126);
            if (!(!((kda) this).field_j.a(0))) {
                ((kda) this).field_j = null;
                iva.a(-6940, "Carousel_clientgame: Finished sending from Carousel_clientgame.dataSender");
            }
        }
        ((kda) this).field_b = (1 + ((kda) this).field_b) % 5;
        if (!(((kda) this).field_i.c(3) >= -1)) {
            if (!(-1 != ((kda) this).field_b)) {
                var4 = (uqb) (Object) ((kda) this).field_i.d(0);
                while (var4 != null) {
                    this.a(var4, param0, 1000);
                    var4.b(-3846);
                    var4 = (uqb) (Object) ((kda) this).field_i.a((byte) 100);
                }
            }
        }
    }

    final void b(mib param0, int param1) {
        if (param1 >= -117) {
            return;
        }
        if (!(param0.field_d == null)) {
            param0.field_d.a(108).b((byte) 96, (tv) (Object) param0);
            param0.c(-64);
            param0.field_h = true;
        }
    }

    public kda() {
        ((kda) this).field_h = 2147483647;
        ((kda) this).field_c = new ij();
        ((kda) this).field_m = new um();
        ((kda) this).field_o = true;
        ((kda) this).field_l = false;
        ((kda) this).field_a = false;
        ((kda) this).field_i = new ij();
        ((kda) this).field_b = 0;
        ((kda) this).field_q = false;
        ((kda) this).field_f = 0;
        ((kda) this).field_p = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Click";
    }
}
