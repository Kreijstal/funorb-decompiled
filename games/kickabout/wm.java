/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ow {
    private qh field_q;
    static ut[] field_m;
    static int field_E;
    private int field_D;
    private kc field_v;
    private bi field_l;
    static String field_p;
    private int field_h;
    static ae field_u;
    private byte[] field_x;
    private eb field_w;
    private byte[] field_r;
    static int field_s;
    static double field_C;
    private qh field_k;
    private vv field_B;
    private int field_j;
    static String[] field_o;
    private kl field_z;
    private tf field_t;
    private boolean field_g;
    private boolean field_n;
    private int field_i;
    private tf field_F;
    private long field_y;
    private boolean field_A;

    final int a(int param0, int param1) {
        vv var3 = null;
        var3 = (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
        if (var3 == null) {
          if (param0 != 6999) {
            byte[] discarded$2 = ((wm) this).b(-39, 41);
            return 0;
          } else {
            return 0;
          }
        } else {
          return var3.a(0);
        }
    }

    final void d(int param0) {
        gn var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param0 == 18137) {
          if (null != ((wm) this).field_t) {
            if (((wm) this).a(param0 + -42991) == null) {
              return;
            } else {
              var2 = ((wm) this).field_F.g(24009);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_a;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (var3 < 0) {
                              break L4;
                            } else {
                              if (((wm) this).field_z.field_d <= var3) {
                                break L4;
                              } else {
                                if (((wm) this).field_z.field_i[var3] != 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.c((byte) -109);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((wm) this).field_r[var3] == 0) {
                            vv discarded$2 = this.a(1, var3, (byte) -30);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 != ((wm) this).field_r[var3]) {
                            break L6;
                          } else {
                            vv discarded$3 = this.a(2, var3, (byte) -30);
                            break L6;
                          }
                        }
                        if (((wm) this).field_r[var3] == 1) {
                          var2.c((byte) -109);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = ((wm) this).field_F.c(33);
                      if (var4 == 0) {
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
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean c(byte param0) {
        if (!vg.field_Wb) {
            return false;
        }
        int var1 = 1;
        if (0 == ov.field_b) {
            return true;
        }
        return false;
    }

    final static void c(int param0) {
        if (param0 != 1) {
            field_u = null;
        }
    }

    final void b(byte param0) {
        if (!(((wm) this).field_k != null)) {
            return;
        }
        ((wm) this).field_g = true;
        if (!(((wm) this).field_t != null)) {
            ((wm) this).field_t = new tf();
        }
        if (param0 < 28) {
            ((wm) this).field_n = true;
        }
    }

    final kl a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        if (((wm) this).field_z != null) {
          return ((wm) this).field_z;
        } else {
          L0: {
            if (null == ((wm) this).field_B) {
              if (!((wm) this).field_l.a(25533)) {
                ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((wm) this).field_B.field_p) {
            L1: {
              L2: {
                var5 = ((wm) this).field_B.b(12802);
                var2 = var5;
                if (((wm) this).field_B instanceof hi) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 != null) {
                        ((wm) this).field_z = new kl(var5, ((wm) this).field_D, ((wm) this).field_x);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((wm) this).field_l.c(-65);
                    ((wm) this).field_z = null;
                    if (((wm) this).field_l.a(param0 + 50387)) {
                      ((wm) this).field_B = null;
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                        return null;
                      }
                    } else {
                      ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                      return null;
                    }
                  }
                  if (((wm) this).field_q != null) {
                    hi discarded$1 = ((wm) this).field_w.a(((wm) this).field_h, ((wm) this).field_q, var5, (byte) 11);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              try {
                L4: {
                  if (var5 != null) {
                    ((wm) this).field_z = new kl(var5, ((wm) this).field_D, ((wm) this).field_x);
                    if (((wm) this).field_z.field_p == ((wm) this).field_j) {
                      break L4;
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
                ((wm) this).field_z = null;
                if (!((wm) this).field_l.a(param0 + 50387)) {
                  ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((wm) this).field_B = null;
                    return null;
                  }
                } else {
                  ((wm) this).field_B = null;
                  return null;
                }
              }
              break L1;
            }
            L5: {
              if (param0 == -24854) {
                break L5;
              } else {
                ((wm) this).b(113);
                break L5;
              }
            }
            L6: {
              if (null != ((wm) this).field_k) {
                ((wm) this).field_r = new byte[((wm) this).field_z.field_d];
                break L6;
              } else {
                break L6;
              }
            }
            ((wm) this).field_B = null;
            return ((wm) this).field_z;
          } else {
            return null;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Kickabout.field_G;
                    if (((wm) this).field_t != null) {
                        statePc = 2;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null != ((wm) this).a(-24854)) {
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
                    if (!((wm) this).field_n) {
                        statePc = 35;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = 1;
                    var3 = ((wm) this).field_t.g(24009);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var3 == null) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = (int)var3.field_a;
                    stackOut_7_0 = ((wm) this).field_r[var4];
                    stackIn_17_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vv discarded$5 = this.a(1, var4, (byte) -30);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (((wm) this).field_r[var4] == 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3.c((byte) -109);
                    if (var5 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3 = ((wm) this).field_t.c(33);
                    statePc = 6;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = ((wm) this).field_z.field_i.length;
                    stackIn_17_0 = stackOut_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 <= ((wm) this).field_i) {
                        statePc = 31;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = ((wm) this).field_z.field_i[((wm) this).field_i];
                    stackIn_32_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 22: {
                    if (((wm) this).field_w.field_e >= 250) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var2 = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (0 != ((wm) this).field_r[((wm) this).field_i]) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    vv discarded$6 = this.a(1, ((wm) this).field_i, (byte) -30);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (0 == ((wm) this).field_r[((wm) this).field_i]) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var3 = new gn();
                    var3.field_a = (long)((wm) this).field_i;
                    var2 = 0;
                    ((wm) this).field_t.a(var3, 3);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = var2;
                    stackIn_32_0 = stackOut_31_0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((wm) this).field_i = 0;
                    ((wm) this).field_n = false;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var5 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (!((wm) this).field_g) {
                        statePc = 81;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var2 = 1;
                    var3 = ((wm) this).field_t.g(24009);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var3 == null) {
                        statePc = 63;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = (int)var3.field_a;
                    stackOut_38_0 = -2;
                    stackOut_38_1 = ~((wm) this).field_r[var4];
                    stackIn_47_0 = stackOut_38_0;
                    stackIn_47_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (var5 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 == stackIn_39_1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    vv discarded$7 = this.a(2, var4, (byte) -30);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (1 != ((wm) this).field_r[var4]) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var3.c((byte) -109);
                    if (var5 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var2 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3 = ((wm) this).field_t.c(33);
                    statePc = 37;
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 >= stackIn_47_1) {
                        statePc = 77;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = -1;
                    stackOut_48_1 = ~((wm) this).field_z.field_i[((wm) this).field_i];
                    stackIn_83_0 = stackOut_48_0;
                    stackIn_83_1 = stackOut_48_1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    if (var5 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 != stackIn_49_1) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    if (var5 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (((wm) this).field_l.d(10770)) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var2 = 0;
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (((wm) this).field_r[((wm) this).field_i] == 1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    vv discarded$8 = this.a(2, ((wm) this).field_i, (byte) -30);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (((wm) this).field_r[((wm) this).field_i] != 1) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var3 = new gn();
                    var3.field_a = (long)((wm) this).field_i;
                    var2 = 0;
                    ((wm) this).field_t.a(var3, 3);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    if (var5 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (((wm) this).field_i >= ((wm) this).field_z.field_i.length) {
                        statePc = 77;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = -1;
                    stackOut_64_1 = ~((wm) this).field_z.field_i[((wm) this).field_i];
                    stackIn_83_0 = stackOut_64_0;
                    stackIn_83_1 = stackOut_64_1;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    if (var5 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 != stackIn_65_1) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 68: {
                    if (((wm) this).field_l.d(10770)) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2 = 0;
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (((wm) this).field_r[((wm) this).field_i] == 1) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    vv discarded$9 = this.a(2, ((wm) this).field_i, (byte) -30);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (((wm) this).field_r[((wm) this).field_i] != 1) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var3 = new gn();
                    var3.field_a = (long)((wm) this).field_i;
                    var2 = 0;
                    ((wm) this).field_t.a(var3, 3);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    ((wm) this).field_i = ((wm) this).field_i + 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 77: {
                    if (var2 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 79: {
                    ((wm) this).field_g = false;
                    ((wm) this).field_i = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var5 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    ((wm) this).field_t = null;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = 15;
                    stackOut_82_1 = (-84 - param0) / 37;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var2 = stackIn_83_0 % stackIn_83_1;
                    if (((wm) this).field_A) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    return;
                }
                case 85: {
                    if (~nj.a(-58) <= ~((wm) this).field_y) {
                        statePc = 87;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var3_ref = (vv) (Object) ((wm) this).field_v.b(0);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var3_ref != null) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ((wm) this).field_y = 1000L + nj.a(116);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    return;
                }
                case 91: {
                    if (var5 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    return;
                }
                case 93: {
                    if (var3_ref.field_p) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (!var3_ref.field_n) {
                        statePc = 99;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (!var3_ref.field_q) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    throw new RuntimeException();
                }
                case 98: {
                    var3_ref.c((byte) -109);
                    if (var5 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var3_ref.field_n = true;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var3_ref = (vv) (Object) ((wm) this).field_v.a(-1);
                    statePc = 88;
                    continue stateLoop;
                }
                case 102: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
            return;
        }
        field_m = null;
        field_u = null;
        field_o = null;
    }

    private final vv a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_60_0 = null;
        L0: {
          var10 = Kickabout.field_G;
          var4 = (Object) (Object) (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((vv) var4).field_q) {
                break L0;
              } else {
                if (!((vv) var4).field_p) {
                  break L0;
                } else {
                  ((vv) var4).c((byte) -109);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  if (param0 == 1) {
                    if (null != ((wm) this).field_k) {
                      var4 = (Object) (Object) ((wm) this).field_w.a(8947, param1, ((wm) this).field_k);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (param0 == -3) {
                      if (((wm) this).field_k == null) {
                        throw new RuntimeException();
                      } else {
                        if (0 != ((wm) this).field_r[param1]) {
                          throw new RuntimeException();
                        } else {
                          if (!((wm) this).field_l.d(10770)) {
                            var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, false);
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
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (null == ((wm) this).field_k) {
                    break L5;
                  } else {
                    if (-1 != ((wm) this).field_r[param1]) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!((wm) this).field_l.a(25533)) {
                  var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                } else {
                  return null;
                }
              }
              var4 = (Object) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_k, param1);
              break L2;
            }
            ((wm) this).field_v.a((gn) var4, -73, (long)param1);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((vv) var4).field_p) {
          var5 = ((vv) var4).b(12802);
          if (!(var4 instanceof hi)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var5.length <= 2) {
                      break L7;
                    } else {
                      dg.field_b.reset();
                      dg.field_b.update(var5, 0, var5.length - 2);
                      var6_int = (int)dg.field_b.getValue();
                      if (var6_int == ((wm) this).field_z.field_c[param1]) {
                        L8: {
                          if (null == ((wm) this).field_z.field_k) {
                            break L8;
                          } else {
                            if (null == ((wm) this).field_z.field_k[param1]) {
                              break L8;
                            } else {
                              var7 = ((wm) this).field_z.field_k[param1];
                              var8 = jj.a(-2 + var5.length, var5, (byte) 80, 0);
                              var9 = 0;
                              L9: while (true) {
                                if (var9 >= 64) {
                                  break L8;
                                } else {
                                  stackOut_79_0 = ~var7[var9];
                                  stackOut_79_1 = ~var8[var9];
                                  stackIn_94_0 = stackOut_79_0;
                                  stackIn_94_1 = stackOut_79_1;
                                  stackIn_80_0 = stackOut_79_0;
                                  stackIn_80_1 = stackOut_79_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L6;
                                  } else {
                                    if (stackIn_80_0 != stackIn_80_1) {
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
                        ((wm) this).field_l.field_o = 0;
                        ((wm) this).field_l.field_l = 0;
                        decompiledRegionSelector0 = 1;
                        break L6;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((wm) this).field_l.c(5);
              ((vv) var4).c((byte) -109);
              if (((vv) var4).field_q) {
                if (((wm) this).field_l.a(25533)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                  ((wm) this).field_v.a((gn) var4, 98, (long)param1);
                  return null;
                }
              } else {
                return null;
              }
            }
            L10: {
              L11: {
                if (decompiledRegionSelector0 == 0) {
                  break L11;
                } else {
                  var5[-2 + var5.length] = (byte)(((wm) this).field_z.field_f[param1] >>> 8);
                  var5[-1 + var5.length] = (byte)((wm) this).field_z.field_f[param1];
                  if (null == ((wm) this).field_k) {
                    break L10;
                  } else {
                    hi discarded$1 = ((wm) this).field_w.a(param1, ((wm) this).field_k, var5, (byte) 66);
                    stackOut_93_0 = ~((wm) this).field_r[param1];
                    stackOut_93_1 = -2;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    break L11;
                  }
                }
              }
              if (stackIn_94_0 != stackIn_94_1) {
                ((wm) this).field_r[param1] = (byte) 1;
                break L10;
              } else {
                break L10;
              }
            }
            L12: {
              if (!((vv) var4).field_q) {
                ((vv) var4).c((byte) -109);
                break L12;
              } else {
                break L12;
              }
            }
            return (vv) var4;
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (var5.length > 2) {
                      dg.field_b.reset();
                      dg.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)dg.field_b.getValue();
                      if (((wm) this).field_z.field_c[param1] == var6_int) {
                        L15: {
                          L16: {
                            if (null == ((wm) this).field_z.field_k) {
                              break L16;
                            } else {
                              if (((wm) this).field_z.field_k[param1] == null) {
                                break L16;
                              } else {
                                var7 = ((wm) this).field_z.field_k[param1];
                                var8 = jj.a(var5.length - 2, var5, (byte) 69, 0);
                                var9 = 0;
                                L17: while (true) {
                                  if (var9 >= 64) {
                                    break L16;
                                  } else {
                                    stackOut_46_0 = var8[var9];
                                    stackOut_46_1 = var7[var9];
                                    stackIn_52_0 = stackOut_46_0;
                                    stackIn_52_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L15;
                                    } else {
                                      if (stackIn_47_0 != stackIn_47_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L17;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_51_0 = var5[var5.length - 1] & 255;
                          stackOut_51_1 = (var5[var5.length - 2] & 255) << 8;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L15;
                        }
                        var7_int = stackIn_52_0 + stackIn_52_1;
                        if (var7_int == (((wm) this).field_z.field_f[param1] & 65535)) {
                          L18: {
                            if (((wm) this).field_r[param1] != 1) {
                              L19: {
                                if (((wm) this).field_r[param1] == 0) {
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((wm) this).field_r[param1] = (byte) 1;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L20: {
                            if (((vv) var4).field_q) {
                              break L20;
                            } else {
                              ((vv) var4).c((byte) -109);
                              break L20;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L13;
                        } else {
                          throw new RuntimeException();
                        }
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
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((wm) this).field_r[param1] = (byte) -1;
              ((vv) var4).c((byte) -109);
              if (((vv) var4).field_q) {
                if (((wm) this).field_l.a(25533)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                  ((wm) this).field_v.a((gn) var4, -50, (long)param1);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (vv) (Object) stackIn_61_0;
          }
        } else {
          return null;
        }
    }

    final static ut a(byte param0, ut param1, int param2) {
        ut var3 = null;
        RuntimeException var3_ref = null;
        ut stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_2_0 = null;
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
            L1: {
              var3 = new ut(param2, param1.field_v);
              iw.a(-59, var3);
              param1.c(0, 0);
              pt.a(on.field_g, -22914, on.field_g >> 1, on.field_f, 0);
              if (param0 < -20) {
                break L1;
              } else {
                boolean discarded$2 = wm.c((byte) 52);
                break L1;
              }
            }
            param1.c(-param1.field_o + on.field_g, 0);
            ta.e(122);
            ta.e(125);
            stackOut_2_0 = (ut) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("wm.H(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final byte[] b(int param0, int param1) {
        vv var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, param0, (byte) -30);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.b(12802);
            if (param1 == 4) {
              break L0;
            } else {
              kl discarded$2 = ((wm) this).a(21);
              break L0;
            }
          }
          var3.c((byte) -109);
          return var4;
        }
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((wm) this).field_v = new kc(16);
        ((wm) this).field_i = 0;
        ((wm) this).field_F = new tf();
        ((wm) this).field_y = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((wm) this).field_h = param0;
                ((wm) this).field_k = param1;
                if (((wm) this).field_k == null) {
                  break L2;
                } else {
                  ((wm) this).field_n = true;
                  ((wm) this).field_t = new tf();
                  if (Kickabout.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((wm) this).field_n = false;
              break L1;
            }
            L3: {
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
              ((wm) this).field_A = stackIn_7_1 != 0;
              ((wm) this).field_j = param7;
              ((wm) this).field_D = param5;
              ((wm) this).field_w = param4;
              ((wm) this).field_x = param6;
              ((wm) this).field_l = param3;
              ((wm) this).field_q = param2;
              if (null == ((wm) this).field_q) {
                break L4;
              } else {
                ((wm) this).field_B = (vv) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_q, ((wm) this).field_h);
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
            stackOut_10_1 = new StringBuilder().append("wm.<init>(").append(param0).append(44);
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
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Rating";
        field_s = 1;
    }
}
