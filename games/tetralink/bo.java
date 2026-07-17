/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hk {
    private ll field_g;
    private byte[] field_z;
    static boolean field_s;
    private ke field_t;
    private byte[] field_f;
    private sk field_r;
    static String field_h;
    private sk field_k;
    static wf field_A;
    static je field_C;
    private int field_i;
    private th field_u;
    private int field_B;
    private dj field_m;
    private int field_j;
    static ah field_e;
    static float field_y;
    private t field_q;
    private je field_v;
    private boolean field_l;
    private je field_w;
    private int field_o;
    private boolean field_p;
    private long field_x;
    private boolean field_n;

    final void b(byte param0) {
        mc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (((bo) this).field_v == null) {
          return;
        } else {
          if (null == ((bo) this).a(0)) {
            return;
          } else {
            var2 = ((bo) this).field_w.c(false);
            var3 = 77 / ((param0 - 66) / 36);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var4 = (int)var2.field_c;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          if (var4 < 0) {
                            break L4;
                          } else {
                            if (((bo) this).field_q.field_i <= var4) {
                              break L4;
                            } else {
                              if (((bo) this).field_q.field_m[var4] == 0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var2.b(false);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (0 != ((bo) this).field_f[var4]) {
                          break L5;
                        } else {
                          ll discarded$2 = this.a(1, var4, 121);
                          break L5;
                        }
                      }
                      L6: {
                        if (-1 == ((bo) this).field_f[var4]) {
                          ll discarded$3 = this.a(2, var4, 120);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (1 != ((bo) this).field_f[var4]) {
                        break L2;
                      } else {
                        var2.b(false);
                        break L2;
                      }
                    }
                    var2 = ((bo) this).field_w.a((byte) -70);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void d(int param0) {
        if (!(null != ((bo) this).field_r)) {
            return;
        }
        ((bo) this).field_p = true;
        if (param0 != 5127) {
            field_C = null;
        }
        if (((bo) this).field_v == null) {
            ((bo) this).field_v = new je();
        }
    }

    final static void c(int param0, int param1) {
        fh.field_a = param0;
        uf.field_c = new int[param1];
        n.field_L = new fj[param0 * 15];
        pl.field_d = 0;
    }

    final int a(int param0, int param1) {
        ll var3 = null;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            t discarded$2 = ((bo) this).a(-82);
            break L0;
          }
        }
        var3 = (ll) (Object) ((bo) this).field_m.a((long)param0, (byte) -43);
        if (var3 != null) {
          return var3.a(false);
        } else {
          return 0;
        }
    }

    public static void c(int param0) {
        field_C = null;
        field_h = null;
    }

    final void e(int param0) {
        int var2_int = 0;
        ll var2 = null;
        mc var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        byte stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        byte stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        byte stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TetraLink.field_J;
                    if (((bo) this).field_v != null) {
                        statePc = 2;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null != ((bo) this).a(0)) {
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
                    if (!((bo) this).field_l) {
                        statePc = 35;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2_int = 1;
                    var3 = ((bo) this).field_v.c(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = (int)var3.field_c;
                    stackOut_7_0 = ((bo) this).field_f[var4];
                    stackIn_18_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ll discarded$5 = this.a(1, var4, 123);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (((bo) this).field_f[var4] == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3.b(false);
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var3 = ((bo) this).field_v.a((byte) -70);
                    statePc = 6;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = ((bo) this).field_o;
                    stackIn_18_0 = stackOut_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= ((bo) this).field_q.field_m.length) {
                        statePc = 32;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = -1;
                    stackOut_19_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                    stackIn_80_0 = stackOut_19_0;
                    stackIn_80_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (var5 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 == stackIn_20_1) {
                        statePc = 31;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-251 > ((bo) this).field_t.field_d) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (((bo) this).field_f[((bo) this).field_o] == 0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ll discarded$6 = this.a(1, ((bo) this).field_o, 124);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((bo) this).field_f[((bo) this).field_o] == 0) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3 = new mc();
                    var3.field_c = (long)((bo) this).field_o;
                    var2_int = 0;
                    ((bo) this).field_v.a(var3, false);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    ((bo) this).field_o = ((bo) this).field_o + 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 32: {
                    if (var2_int == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((bo) this).field_o = 0;
                    ((bo) this).field_l = false;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var5 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (((bo) this).field_p) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((bo) this).field_v = null;
                    if (var5 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var2_int = 1;
                    var3 = ((bo) this).field_v.c(false);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var3 == null) {
                        statePc = 64;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var4 = (int)var3.field_c;
                    stackOut_40_0 = ((bo) this).field_f[var4];
                    stackOut_40_1 = 1;
                    stackIn_49_0 = stackOut_40_0;
                    stackIn_49_1 = stackOut_40_1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    if (var5 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 == stackIn_41_1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ll discarded$7 = this.a(2, var4, 125);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (((bo) this).field_f[var4] != 1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3.b(false);
                    if (var5 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var3 = ((bo) this).field_v.a((byte) -70);
                    statePc = 39;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 <= stackIn_49_1) {
                        statePc = 77;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = 0;
                    stackOut_50_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                    stackIn_80_0 = stackOut_50_0;
                    stackIn_80_1 = stackOut_50_1;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    if (var5 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 == stackIn_51_1) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ((bo) this).field_o = ((bo) this).field_o + 1;
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (!((bo) this).field_u.c(-7614)) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (((bo) this).field_f[((bo) this).field_o] != 1) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ll discarded$8 = this.a(2, ((bo) this).field_o, 126);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (((bo) this).field_f[((bo) this).field_o] == 1) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var3 = new mc();
                    var3.field_c = (long)((bo) this).field_o;
                    ((bo) this).field_v.a(var3, false);
                    var2_int = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    ((bo) this).field_o = ((bo) this).field_o + 1;
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (((bo) this).field_q.field_m.length <= ((bo) this).field_o) {
                        statePc = 77;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = 0;
                    stackOut_65_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                    stackIn_80_0 = stackOut_65_0;
                    stackIn_80_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (var5 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 == stackIn_66_1) {
                        statePc = 76;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!((bo) this).field_u.c(-7614)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (((bo) this).field_f[((bo) this).field_o] != 1) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    ll discarded$9 = this.a(2, ((bo) this).field_o, 126);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (((bo) this).field_f[((bo) this).field_o] == 1) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var3 = new mc();
                    var3.field_c = (long)((bo) this).field_o;
                    ((bo) this).field_v.a(var3, false);
                    var2_int = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    ((bo) this).field_o = ((bo) this).field_o + 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 77: {
                    if (var2_int == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    ((bo) this).field_p = false;
                    ((bo) this).field_o = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackOut_79_0 = param0;
                    stackOut_79_1 = 2;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 == stackIn_80_1) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    ((bo) this).field_v = null;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (((bo) this).field_n) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                case 84: {
                    if (k.a(0) >= ((bo) this).field_x) {
                        statePc = 86;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var2 = (ll) (Object) ((bo) this).field_m.b(44);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (var2 != null) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ((bo) this).field_x = k.a(0) + 1000L;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    return;
                }
                case 90: {
                    if (var5 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    return;
                }
                case 92: {
                    if (var2.field_v) {
                        statePc = 98;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (!var2.field_B) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var2.field_D) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    throw new RuntimeException();
                }
                case 96: {
                    var2.b(false);
                    if (var5 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var2.field_B = true;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var2 = (ll) (Object) ((bo) this).field_m.a(param0 + -3);
                    statePc = 87;
                    continue stateLoop;
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] b(int param0, int param1) {
        ll var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        L0: {
          var3 = this.a(0, param1, 121);
          if (param0 == 20396) {
            break L0;
          } else {
            var5 = null;
            bo.a(62, -68, (java.awt.Canvas) null, 86);
            break L0;
          }
        }
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.c(true);
          var3.b(false);
          return var4;
        }
    }

    final t a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (null == ((bo) this).field_q) {
          L0: {
            if (((bo) this).field_g != null) {
              break L0;
            } else {
              if (!((bo) this).field_u.b((byte) 119)) {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((bo) this).field_g.field_v) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                byte[] discarded$2 = ((bo) this).b(120, 16);
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = ((bo) this).field_g.c(true);
                var2 = var5;
                if (((bo) this).field_g instanceof fd) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((bo) this).field_u.b(0);
                    ((bo) this).field_q = null;
                    if (((bo) this).field_u.b((byte) 119)) {
                      ((bo) this).field_g = null;
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                        return null;
                      }
                    } else {
                      ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                      return null;
                    }
                  }
                  if (((bo) this).field_k != null) {
                    fd discarded$3 = ((bo) this).field_t.a(param0 + -116, ((bo) this).field_i, var5, ((bo) this).field_k);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
                    if (((bo) this).field_j == ((bo) this).field_q.field_f) {
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = decompiledCaughtException;
                ((bo) this).field_q = null;
                if (!((bo) this).field_u.b((byte) 119)) {
                  ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((bo) this).field_g = null;
                    return null;
                  }
                } else {
                  ((bo) this).field_g = null;
                  return null;
                }
              }
              break L2;
            }
            L6: {
              ((bo) this).field_g = null;
              if (null != ((bo) this).field_r) {
                ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                break L6;
              } else {
                break L6;
              }
            }
            return ((bo) this).field_q;
          } else {
            return null;
          }
        } else {
          return ((bo) this).field_q;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                pk.field_O.a(10, param0, param1, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref2;
            stackOut_5_1 = new StringBuilder().append("bo.H(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 86 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              oi.field_a = param14;
              ko.field_u = param5;
              hh.a(param7, param11, param17, param18, -120);
              gj.a(param9, param6, param2, -20140);
              da.a(param15, param3, param8, -120, param13, param12);
              if (param4 == -1) {
                break L1;
              } else {
                bo.c(-91);
                break L1;
              }
            }
            b.a(param0, param1, (byte) -66);
            kb.a(param19, param16, param10, (byte) -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var20;
            stackOut_4_1 = new StringBuilder().append("bo.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param8 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param9 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param12 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param13).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param14 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param15 + 44 + param16 + 44 + param17 + 44 + param18 + 44 + param19 + 41);
        }
    }

    private final ll a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        Object stackIn_93_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        Object stackOut_92_0 = null;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        L0: {
          var10 = TetraLink.field_J;
          var4 = (Object) (Object) (ll) (Object) ((bo) this).field_m.a((long)param1, (byte) -43);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((ll) var4).field_D) {
                break L0;
              } else {
                if (((ll) var4).field_v) {
                  ((ll) var4).b(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param0 != 0) {
                if (1 == param0) {
                  if (((bo) this).field_r == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((bo) this).field_t.a(((bo) this).field_r, param1, 81);
                    break L2;
                  }
                } else {
                  L3: {
                    if (2 != param0) {
                      break L3;
                    } else {
                      if (((bo) this).field_r != null) {
                        if (((bo) this).field_f[param1] == -1) {
                          if (!((bo) this).field_u.c(-7614)) {
                            var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, false);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } else {
                L4: {
                  if (null == ((bo) this).field_r) {
                    break L4;
                  } else {
                    if (((bo) this).field_f[param1] == -1) {
                      break L4;
                    } else {
                      var4 = (Object) (Object) ((bo) this).field_t.a((byte) -120, ((bo) this).field_r, param1);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (!((bo) this).field_u.b((byte) 119)) {
                  var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            ((bo) this).field_m.a((long)param1, -110, (mc) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 > 117) {
          if (!((ll) var4).field_v) {
            var5 = ((ll) var4).c(true);
            if (var4 instanceof fd) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, -2 + var5.length);
                        var6_int = (int)co.field_r.getValue();
                        if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                          L7: {
                            L8: {
                              if (((bo) this).field_q.field_e == null) {
                                break L8;
                              } else {
                                if (((bo) this).field_q.field_e[param1] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                  var8 = qb.a(var5, (byte) -89, var5.length - 2, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_77_0 = ~var7_ref_byte__[var9];
                                      stackOut_77_1 = ~var8[var9];
                                      stackIn_83_0 = stackOut_77_0;
                                      stackIn_83_1 = stackOut_77_1;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_78_0 != stackIn_78_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_82_0 = var5[var5.length - 1] & 255;
                            stackOut_82_1 = 65280 & var5[-2 + var5.length] << 8;
                            stackIn_83_0 = stackOut_82_0;
                            stackIn_83_1 = stackOut_82_1;
                            break L7;
                          }
                          var7 = stackIn_83_0 + stackIn_83_1;
                          if (var7 != (65535 & ((bo) this).field_q.field_k[param1])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((bo) this).field_f[param1] == 1) {
                                break L10;
                              } else {
                                L11: {
                                  if (((bo) this).field_f[param1] == 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((bo) this).field_f[param1] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (((ll) var4).field_D) {
                                break L12;
                              } else {
                                ((ll) var4).b(false);
                                break L12;
                              }
                            }
                            stackOut_92_0 = var4;
                            stackIn_93_0 = stackOut_92_0;
                            break L5;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((bo) this).field_f[param1] = (byte) -1;
                ((ll) var4).b(false);
                if (((ll) var4).field_D) {
                  if (!((bo) this).field_u.b((byte) 119)) {
                    var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                    ((bo) this).field_m.a((long)param1, -76, (mc) var4);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (ll) (Object) stackIn_93_0;
            } else {
              try {
                L13: {
                  L14: {
                    if (var5 == null) {
                      break L14;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, var5.length + -2);
                        var6_int = (int)co.field_r.getValue();
                        if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                          L15: {
                            if (((bo) this).field_q.field_e == null) {
                              break L15;
                            } else {
                              if (null == ((bo) this).field_q.field_e[param1]) {
                                break L15;
                              } else {
                                var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                var8 = qb.a(var5, (byte) -89, -2 + var5.length, 0);
                                var9 = 0;
                                L16: while (true) {
                                  if (64 <= var9) {
                                    break L15;
                                  } else {
                                    stackOut_46_0 = var7_ref_byte__[var9];
                                    stackOut_46_1 = var8[var9];
                                    stackIn_61_0 = stackOut_46_0;
                                    stackIn_61_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L13;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L16;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ((bo) this).field_u.field_h = 0;
                          ((bo) this).field_u.field_d = 0;
                          decompiledRegionSelector0 = 1;
                          break L13;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L17: {
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  ((bo) this).field_u.b(0);
                  ((ll) var4).b(false);
                  if (((ll) var4).field_D) {
                    if (!((bo) this).field_u.b((byte) 119)) {
                      var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                      ((bo) this).field_m.a((long)param1, -118, (mc) var4);
                      break L17;
                    } else {
                      return null;
                    }
                  } else {
                    break L17;
                  }
                }
                return null;
              }
              L18: {
                L19: {
                  if (decompiledRegionSelector0 == 0) {
                    break L19;
                  } else {
                    var5[var5.length - 2] = (byte)(((bo) this).field_q.field_k[param1] >>> 8);
                    var5[var5.length - 1] = (byte)((bo) this).field_q.field_k[param1];
                    if (null != ((bo) this).field_r) {
                      fd discarded$1 = ((bo) this).field_t.a(-49, param1, var5, ((bo) this).field_r);
                      stackOut_60_0 = -2;
                      stackOut_60_1 = ~((bo) this).field_f[param1];
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                if (stackIn_61_0 != stackIn_61_1) {
                  ((bo) this).field_f[param1] = (byte) 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L20: {
                if (((ll) var4).field_D) {
                  break L20;
                } else {
                  ((ll) var4).b(false);
                  break L20;
                }
              }
              return (ll) var4;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    bo(int param0, sk param1, sk param2, th param3, ke param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((bo) this).field_m = new dj(16);
        ((bo) this).field_o = 0;
        ((bo) this).field_w = new je();
        ((bo) this).field_x = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((bo) this).field_i = param0;
                ((bo) this).field_r = param1;
                if (null == ((bo) this).field_r) {
                  break L2;
                } else {
                  ((bo) this).field_l = true;
                  ((bo) this).field_v = new je();
                  if (TetraLink.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bo) this).field_l = false;
              break L1;
            }
            L3: {
              ((bo) this).field_z = param6;
              ((bo) this).field_B = param5;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((bo) this).field_n = stackIn_7_1 != 0;
              ((bo) this).field_j = param7;
              ((bo) this).field_t = param4;
              ((bo) this).field_k = param2;
              ((bo) this).field_u = param3;
              if (null == ((bo) this).field_k) {
                break L4;
              } else {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_t.a((byte) 111, ((bo) this).field_k, ((bo) this).field_i);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("bo.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
