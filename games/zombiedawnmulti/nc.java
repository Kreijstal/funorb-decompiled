/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nc {
    static cj field_e;
    int[] field_j;
    hh field_g;
    int field_i;
    private int field_b;
    private boolean field_f;
    static String field_c;
    static int field_h;
    int field_a;
    int field_d;
    int field_k;

    final void c(int param0) {
        int var3;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            if (this.field_d == 2) {
              break L1;
            } else {
              L2: {
                if (3 == this.field_d) {
                  break L2;
                } else {
                  if ((this.field_d ^ -1) != -6) {
                    break L0;
                  } else {
                    this.field_j = new int[]{5};
                    this.field_g = new hh(this.field_j.length);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_j = new int[]{48, 5};
              this.field_g = new hh(this.field_j.length);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_b = this.field_b - ah.field_e.field_C / 2;
          this.field_j = new int[]{1, 12, 13, 34, 47, 4, 50, 3, 7};
          this.field_g = new hh(this.field_j.length);
          break L0;
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            nc.a((byte) -25);
            break L3;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!cp.field_K) {
              break L1;
            } else {
              bi.field_e = true;
              kk.a(-97, 0, 11);
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (!df.field_I) {
            break L0;
          } else {
            L2: {
              if (!pp.field_n) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var3 = stackIn_7_0;
              wb.l((byte) 124);
              if (var3 != 0) {
                break L3;
              } else {
                var4 = param0 ? 1 : 0;
                bm.a(var4 != 0, 15, 127, sp.field_g);
                if (var5 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            var4 = param0 ? 1 : 0;
            bm.a(var4 != 0, 1, 125, sp.field_g);
            break L0;
          }
        }
        L4: {
          if (param1 == 200) {
            break L4;
          } else {
            this.field_b = 82;
            break L4;
          }
        }
        var3 = param0 ? 1 : 0;
        bm.a(var3 != 0, -5, 126, sp.field_g);
    }

    public static void b(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    boolean c(int param0, int param1) {
        if ((this.field_j[param0] ^ -1) == -40) {
          return false;
        } else {
          L0: {
            if (-22 != (this.field_j[param0] ^ -1)) {
              break L0;
            } else {
              if (fb.field_e.g(param1 + -16777149) != 0) {
                break L0;
              } else {
                return false;
              }
            }
          }
          if (param1 != 16777215) {
            this.field_a = -71;
            return true;
          } else {
            return true;
          }
        }
    }

    final static boolean a(byte param0) {
        int var1;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var1 = 91 % ((param0 - 33) / 35);
            if (ki.field_e != null) {
              break L1;
            } else {
              if (!ee.field_b) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 1;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    int a(byte param0, int param1) {
        L0: {
          if (param0 == -118) {
            break L0;
          } else {
            this.b((byte) -12);
            break L0;
          }
        }
        if (!this.field_f) {
          return this.field_i + this.field_k * param1;
        } else {
          return this.field_i;
        }
    }

    final void b(int param0) {
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.field_d = -56;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 != (this.field_d ^ -1)) {
              break L2;
            } else {
              of.field_e[0].c(0, 0);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              if (this.field_d == 2) {
                break L4;
              } else {
                if (13 != this.field_d) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            of.field_e[0].c(0, 0);
            if (var3 == 0) {
              break L1;
            } else {
              break L3;
            }
          }
          L5: {
            L6: {
              if (-4 == (this.field_d ^ -1)) {
                break L6;
              } else {
                if (this.field_d == 5) {
                  break L6;
                } else {
                  if (6 == this.field_d) {
                    break L6;
                  } else {
                    if (this.field_d == 7) {
                      break L6;
                    } else {
                      if (14 == this.field_d) {
                        break L6;
                      } else {
                        if (8 != this.field_d) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
            dd.field_g.d(0, 0);
            v.field_e.d(0, -v.field_e.field_b + -pi.field_f.field_b + 480);
            pi.field_f.d(0, 480 + -pi.field_f.field_b);
            if (var3 == 0) {
              break L1;
            } else {
              break L5;
            }
          }
          L7: {
            if ((this.field_d ^ -1) == -16) {
              break L7;
            } else {
              L8: {
                if (4 == this.field_d) {
                  break L8;
                } else {
                  L9: {
                    if (-11 != (this.field_d ^ -1)) {
                      break L9;
                    } else {
                      dd.field_g.d(0, 0);
                      v.field_e.d(0, -v.field_e.field_b + (-pi.field_f.field_b + 480));
                      pi.field_f.d(0, -pi.field_f.field_b + 480);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (9 == this.field_d) {
                      break L10;
                    } else {
                      L11: {
                        if (-12 == (this.field_d ^ -1)) {
                          break L11;
                        } else {
                          if (this.field_d != 12) {
                            break L1;
                          } else {
                            oo.e(0, 0, 640, 480, 65793);
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      oo.e(0, 0, 640, 480, 65793);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L10;
                      }
                    }
                  }
                  of.field_e[4].c(0, 0);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
              }
              dd.field_g.d(0, 0);
              v.field_e.d(0, -v.field_e.field_b + (480 - pi.field_f.field_b));
              pi.field_f.d(0, -pi.field_f.field_b + 480);
              if (var3 == 0) {
                break L1;
              } else {
                break L7;
              }
            }
          }
          oo.e(0, 0, 640, 480, 16777215);
          oo.h(0, 0, 640, 5);
          dd.field_g.d(0, 0);
          oo.h(0, 5, 640, 480);
          dd.field_g.d(0, -32);
          v.field_e.d(0, 448 - (pi.field_f.field_b + v.field_e.field_b));
          oo.h(4, 330, 636, 335);
          dd.field_g.d(0, 330);
          oo.h(0, 335, 640, 419);
          v.field_e.d(0, 300);
          oo.c();
          pi.field_f.d(0, 480 + -pi.field_f.field_b);
          break L1;
        }
    }

    final void d(int param0) {
        if (null != ao.field_b[this.field_d]) {
            ao.field_b[this.field_d].g(0, (this.field_d ^ -1) == -16 ? 6 : 13);
        }
        if (param0 != 4) {
            this.field_f = false;
        }
    }

    void b(int param0, boolean param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = this.field_j[param2];
                    var6 = var4;
                    if ((var6 ^ -1) == -41) {
                        statePc = 52;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (41 != var6) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var9 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((var6 ^ -1) != -47) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var9 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-46 == (var6 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var6 != 1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var9 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (5 == var6) {
                        statePc = 69;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var6 != 16) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var9 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((var6 ^ -1) == -15) {
                        statePc = 85;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var6 != 44) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var9 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (3 == var6) {
                        statePc = 90;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (6 == var6) {
                        statePc = 93;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (2 == var6) {
                        statePc = 95;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (12 == var6) {
                        statePc = 97;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-14 == (var6 ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-5 == (var6 ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var6 != 7) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var9 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((var6 ^ -1) != -49) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var9 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (49 == var6) {
                        statePc = 170;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var6 != 15) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var9 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-18 != (var6 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var9 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var6 == 18) {
                        statePc = 187;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (11 == var6) {
                        statePc = 191;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var6 == 50) {
                        statePc = 195;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-35 == (var6 ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var6 == 47) {
                        statePc = 208;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (35 == var6) {
                        statePc = 211;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var6 != 36) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var9 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var6 != 38) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var9 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((var6 ^ -1) == -40) {
                        statePc = 213;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_g.c(-85)) {
                        statePc = 54;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 54: {
                    df.field_I = false;
                    if (!wc.j(127)) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    rj.a(-4, (byte) -37, af.field_a);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -4, 126, sp.field_g);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (this.field_g.c(-85)) {
                        statePc = 60;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 14, 127, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (this.field_g.c(-85)) {
                        statePc = 63;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 63: {
                    tg.a((byte) 27, true);
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -7, 127, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (this.field_g.c(-85)) {
                        statePc = 66;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.b((byte) 69);
                    tg.a((byte) 25, false);
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -7, 125, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -7, 127, sp.field_g);
                    vd.field_d = 1;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 1, 126, sp.field_g);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (this.field_g.c(-85)) {
                        statePc = 73;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var6 = 1;
                    var7 = var6;
                    var8 = param1 ? 1 : 0;
                    bm.a(var8 != 0, var7, 126, sp.field_g);
                    var12 = k.field_n;
                    var11 = var12;
                    var10 = var11;
                    var7_ref_int__ = var10;
                    var8 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var8 >= 8) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var12[var8] = 0;
                    var8++;
                    if (var9 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var9 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var7_ref_int__ = fc.field_m;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var8 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if ((var8 ^ -1) <= -9) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var7_ref_int__[var8] = 0;
                    var8++;
                    if (var9 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var9 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 5, 127, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (this.field_g.c(-85)) {
                        statePc = 89;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 89: {
                    mj.field_Hb[15].a(0, param1, 0);
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 15, 126, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (this.field_g.c(-85)) {
                        statePc = 92;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 92: {
                    ((ol) ((Object) mj.field_Hb[4])).e(113);
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 4, 125, sp.field_g);
                    vd.field_d = this.field_d;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var6 = vd.field_d;
                    var7 = param1 ? 1 : 0;
                    bm.a(var7 != 0, var6, 126, sp.field_g);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, 3, 126, sp.field_g);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var5 = db.field_c;
                    if (!this.field_g.g(8)) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    tj.a(3273, 0);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (this.field_g.f(-23954)) {
                        statePc = 101;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 101: {
                    tj.a(3273, 224);
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (this.field_g.b(false)) {
                        statePc = 104;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var6 = ok.field_l + 137;
                    var7 = 8 + (-var6 + this.a((byte) -118, param2) - -this.d(-110, param2) >> -238944543) - -ok.field_l;
                    var8 = -var7 + bd.field_g << -466855071;
                    var8 = var8 * 224 >> 957894024;
                    if (0 >= var8) {
                        statePc = 110;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (-225 >= (var8 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    tj.a(3273, var8);
                    if (var9 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    tj.a(3273, 224);
                    if (var9 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    tj.a(3273, 0);
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (!this.field_g.e(96)) {
                        statePc = 118;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (db.field_c > 28) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    tj.a(3273, 0);
                    if (var9 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var6 = db.field_c % 28;
                    if (var6 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var6 = 28;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    tj.a(3273, -var6 + db.field_c);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (this.field_g.a(97)) {
                        statePc = 120;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (-197 < (db.field_c ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    tj.a(3273, 224);
                    if (var9 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var6 = db.field_c % 28;
                    tj.a(3273, -var6 + (db.field_c - -28));
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var5 == db.field_c) {
                        statePc = 213;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (jq.field_d == null) {
                        statePc = 128;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (!jq.field_d.k()) {
                        statePc = 213;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    jq.field_d = nm.b(-128, 47);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (this.field_g.g(127)) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    ff.a(0, -127);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (this.field_g.f(-23954)) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    ff.a(200, 92);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (this.field_g.b(false)) {
                        statePc = 138;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var6 = 137 + ok.field_l;
                    var7 = 8 + (this.a((byte) -118, param2) + this.d(-93, param2) - var6 >> -1385877951) + ok.field_l;
                    var8 = bd.field_g + -var7 << 71088705;
                    var8 = var8 * 200 >> 739838728;
                    if (var8 <= 0) {
                        statePc = 144;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (200 <= var8) {
                        statePc = 142;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    ff.a(var8, 81);
                    if (var9 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    ff.a(200, 24);
                    if (var9 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    ff.a(0, 61);
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (this.field_g.e(96)) {
                        statePc = 147;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var6 = uk.field_S;
                    if (-26 <= (var6 ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var7 = var6 % 25;
                    if (-1 != (var7 ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var7 = 25;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    ff.a(var6 + -var7, -103);
                    if (var9 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    ff.a(0, -88);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (!this.field_g.a(97)) {
                        statePc = 213;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var6 = uk.field_S;
                    if ((var6 ^ -1) <= -176) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var7 = var6 % 25;
                    ff.a(-var7 + var6 + 25, -89);
                    if (var9 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    ff.a(200, -118);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (this.field_g.c(-85)) {
                        statePc = 159;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (rn.field_f != null) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var6 = param1 ? 1 : 0;
                    bd.field_f = false;
                    lp.a((byte) -60, var6 != 0);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    rn.a(-69);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (this.field_g.c(-85)) {
                        statePc = 165;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (2 == this.field_d) {
                        statePc = 166;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    this.a(param1, 200);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    mj.field_Hb[pl.field_I].field_j[param2] = 49;
                    sd.field_F = 0;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (this.field_g.c(-85)) {
                        statePc = 172;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 172: {
                    mj.field_Hb[pl.field_I].field_j[param2] = 48;
                    sd.field_F = 1;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (this.field_g.c(-85)) {
                        statePc = 175;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (this.field_d == 5) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (-4 != (this.field_d ^ -1)) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    rj.a(this.field_d, (byte) 101, af.field_a);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (this.field_d != 7) {
                        statePc = 213;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    rj.a(6, (byte) 125, af.field_a);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (!this.c(param2, 16777215)) {
                        statePc = 213;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    ((ol) ((Object) mj.field_Hb[4])).a(param1, (byte) -119);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (!this.c(param2, 16777215)) {
                        statePc = 213;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    ((ol) ((Object) mj.field_Hb[4])).b(1, param1);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (rn.field_f == null) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    rn.a(-128);
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    cq.a(jl.b(0), false);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!this.field_g.a((byte) -106)) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    ll.field_k.field_k = ll.field_k.field_k - 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (!this.field_g.b((byte) -66)) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    ll.field_k.field_k = ll.field_k.field_k + 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (0 > ll.field_k.field_k) {
                        statePc = 201;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 201: {
                    ll.field_k.field_k = 2;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (2 < ll.field_k.field_k) {
                        statePc = 204;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 204: {
                    ll.field_k.field_k = 0;
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (this.field_g.c(-85)) {
                        statePc = 207;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 207: {
                    oq.c((byte) 127);
                    we.field_g[34] = df.a(-128);
                    ll.field_k.field_i = ll.field_k.field_i ^ 2;
                    th.b((byte) -61);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (this.field_g.c(-85)) {
                        statePc = 210;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 210: {
                    ll.field_k.e(-110);
                    th.b((byte) -61);
                    if (var9 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (!this.field_g.c(-85)) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    this.b((byte) 69);
                    this.a(param1, 200);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (param0 < -64) {
                        statePc = 215;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    this.a(-94);
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1) {
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            this.field_a = 104;
            break L0;
          }
        }
        if (-1 >= (param1 ^ -1)) {
          if (this.field_j.length <= param1) {
            return;
          } else {
            L1: {
              param1 = this.field_j[param1];
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (12 == param1) {
                  break L1;
                } else {
                  if ((param1 ^ -1) == -14) {
                    break L1;
                  } else {
                    if (this.field_g.c(-85)) {
                      ib.a((byte) 112, ei.field_a[68]);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    int d(int param0, int param1) {
        ug var4;
        L0: {
          if (param0 <= -65) {
            break L0;
          } else {
            var4 = (ug) null;
            nc.a(true, -108, -32, (ug) null);
            break L0;
          }
        }
        if (!this.field_f) {
          return this.a((byte) -118, param1) + this.field_k;
        } else {
          return this.field_a;
        }
    }

    final static void a(int param0, boolean param1) {
        tm.a(param1, false);
        br.a(param1, 2);
        int var2 = 31 % ((param0 - -57) / 56);
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_9_0 = false;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 < this.field_j.length) {
            var5 = this.a(var4, 23697);
            stackIn_9_0 = this.c(var4, 16777215);

            if (var6 == 0) {
              L1: {
                if (!stackIn_9_0) {
                  break L1;
                } else {
                  if (this.a((byte) -118, var4) > param2) {
                    break L1;
                  } else {
                    if (this.d(param0 ^ 5912, var4) <= param2) {
                      break L1;
                    } else {
                      if (var5 > param1) {
                        break L1;
                      } else {
                        if (param1 < var5 - -this.b((byte) 68, var4)) {
                          return var4;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              var4++;
              if (var6 == 0) {
                continue L0;
              } else {
                L2: {
                  if (param0 == -6003) {
                    break L2;
                  } else {
                    this.a(13);
                    break L2;
                  }
                }
                return -1;
              }
            } else {
              L3: {
                if ((stackIn_9_0 ? 1 : 0) == -6003) {
                  break L3;
                } else {
                  this.a(13);
                  break L3;
                }
              }
              return -1;
            }
          } else {
            L4: {
              if (param0 == -6003) {
                break L4;
              } else {
                this.a(13);
                break L4;
              }
            }
            return -1;
          }
        }
    }

    private final int b(byte param0, int param1) {
        if ((param1 ^ -1) == (param1 ^ -1)) {
        }
        if (param0 != 68) {
            this.a(-84, -17, true);
        }
        return 38;
    }

    void a(boolean param0) {
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (6 != (this.field_d ^ -1)) {
          if (-12 != (this.field_d ^ -1)) {
            L0: {
              if (this.field_d != 7) {
                break L0;
              } else {
                nn.a(false);
                var2 = 100 - -ah.field_e.field_C;
                var3 = 4 + ah.field_e.field_r + ah.field_e.field_J;
                var4 = 16777215;
                pb.field_e.b(af.field_a, 320, var2, var4, -1);
                pb.field_e.b(jm.a(vh.field_Mb, false, 118, gg.field_k), 320, var3 + var2, var4, -1);
                pb.field_e.b(on.a(true, gg.field_k, vh.field_Mb, false), 320, var2 + (3 * var3 - -38), var4, -1);
                pb.field_e.b(op.a(vh.field_Mb, gg.field_k, 4, false), 320, 76 + (var2 + var3 * 4), var4, -1);
                if (var5 != 0) {
                  break L0;
                } else {
                  L1: {
                    if (param0) {
                      break L1;
                    } else {
                      this.a(-45);
                      break L1;
                    }
                  }
                  var6 = 0;
                  var2 = var6;
                  L2: while (true) {
                    L3: {
                      if (var6 >= this.field_g.field_c) {
                        break L3;
                      } else {
                        if (var5 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (this.c(var6, 16777215)) {
                                break L5;
                              } else {
                                if (-22 == (this.field_j[var6] ^ -1)) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              stackIn_16_0 = this;

                              stackIn_16_1 = var6;

                              if (var6 != this.field_g.field_d) {
                                stackIn_17_0 = this;
                                stackIn_17_1 = stackIn_16_1;
                                stackIn_17_2 = 0;
                                break L6;
                              } else {
                                stackIn_17_0 = this;
                                stackIn_17_1 = stackIn_16_1;
                                stackIn_17_2 = 1;
                                break L6;
                              }
                            }
                            this.a(stackIn_17_1, stackIn_17_2 != 0, (byte) -81);
                            break L4;
                          }
                          var6++;
                          if (var5 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (-9 != (this.field_d ^ -1)) {
              if (2 == this.field_d) {
                L7: {
                  wp.field_h.b(true, 1);
                  oo.f(0, 0, 640, 480);
                  if (param0) {
                    stackIn_42_0 = 0;
                    break L7;
                  } else {
                    stackIn_42_0 = 1;
                    break L7;
                  }
                }
                nn.a(stackIn_42_0 != 0);
                if (var5 != 0) {
                  ok.a(true);
                  return;
                } else {
                  L8: {
                    if (param0) {
                      break L8;
                    } else {
                      this.a(-45);
                      break L8;
                    }
                  }
                  var6 = 0;
                  var2 = var6;
                  L9: while (true) {
                    L10: {
                      if (var6 >= this.field_g.field_c) {
                        break L10;
                      } else {
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L11: {
                            L12: {
                              if (this.c(var6, 16777215)) {
                                break L12;
                              } else {
                                if (-22 == (this.field_j[var6] ^ -1)) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L13: {
                              stackIn_53_0 = this;

                              stackIn_53_1 = var6;

                              if (var6 != this.field_g.field_d) {
                                stackIn_54_0 = this;
                                stackIn_54_1 = stackIn_53_1;
                                stackIn_54_2 = 0;
                                break L13;
                              } else {
                                stackIn_54_0 = this;
                                stackIn_54_1 = stackIn_53_1;
                                stackIn_54_2 = 1;
                                break L13;
                              }
                            }
                            this.a(stackIn_54_1, stackIn_54_2 != 0, (byte) -81);
                            break L11;
                          }
                          var6++;
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L14: {
                  if (param0) {
                    break L14;
                  } else {
                    this.a(-45);
                    break L14;
                  }
                }
                var6 = 0;
                var2 = var6;
                L15: while (true) {
                  L16: {
                    if (var6 >= this.field_g.field_c) {
                      break L16;
                    } else {
                      if (var5 != 0) {
                        break L16;
                      } else {
                        L17: {
                          L18: {
                            if (this.c(var6, 16777215)) {
                              break L18;
                            } else {
                              if (-22 == (this.field_j[var6] ^ -1)) {
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L19: {
                            stackIn_34_0 = this;

                            stackIn_34_1 = var6;

                            if (var6 != this.field_g.field_d) {
                              stackIn_35_0 = this;
                              stackIn_35_1 = stackIn_34_1;
                              stackIn_35_2 = 0;
                              break L19;
                            } else {
                              stackIn_35_0 = this;
                              stackIn_35_1 = stackIn_34_1;
                              stackIn_35_2 = 1;
                              break L19;
                            }
                          }
                          this.a(stackIn_35_1, stackIn_35_2 != 0, (byte) -81);
                          break L17;
                        }
                        var6++;
                        if (var5 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              ok.a(true);
              return;
            }
          } else {
            return;
          }
        } else {
          wp.field_h.b(true, 1);
          return;
        }
    }

    void c(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            this.field_d = 39;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_f) {
              break L2;
            } else {
              this.field_g.d(99);
              if (!ZombieDawnMulti.field_E) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.field_g.a(0, false);
          break L1;
        }
        if (0 > this.field_g.field_d) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_3_0 = 0;
        L0: {
          var4 = 2 * param1;
          if (param1 >= 128) {
            stackIn_3_0 = -256 + 2 * param1;
            break L0;
          } else {
            stackIn_3_0 = 0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param2) {
            var6 = var4;
            var4 = var5;
            var5 = var6;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = this.field_d;
          if (param0 <= -104) {
            break L2;
          } else {
            this.b(81);
            break L2;
          }
        }
        L3: {
          if ((var6 ^ -1) != -3) {
            break L3;
          } else {
            var6 = -7;
            break L3;
          }
        }
        L4: {
          if (-2 == var6) {
            var6 = 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          fn.field_e.a();
          if (11 == var6) {
            var6 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if ((var6 ^ -1) == 6) {
              break L7;
            } else {
              mj.field_Hb[var6].b(0);
              if (!ZombieDawnMulti.field_E) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          wp.field_h.b(true, 1);
          oo.f(0, 0, 640, 480);
          fn.field_e.h();
          break L6;
        }
        dl.field_h.b((byte) 99);
        fn.field_e.a(0, 0, var4, var5);
    }

    void b(byte param0) {
        if (param0 != 69) {
            this.field_k = 57;
        }
    }

    int a(int param0, int param1) {
        ug var4;
        L0: {
          if (param1 == 23697) {
            break L0;
          } else {
            var4 = (ug) null;
            nc.a(true, 65, 23, (ug) null);
            break L0;
          }
        }
        if (this.field_f) {
          return this.field_b - -(param0 * this.field_k);
        } else {
          return this.field_b;
        }
    }

    void a(int param0, boolean param1, int param2) {
        if (!((this.field_g.field_d ^ -1) == param0)) {
            param2 = this.field_g.field_d;
        }
        this.field_g.a(param2, param1, -31458, this.a(param0 + -6003, bo.field_d, bd.field_g));
        if ((this.field_d ^ -1) == -9) {
            fc.a((byte) 124, param1);
        }
    }

    final static void a(boolean param0, int param1, int param2, ug param3) {
        int var4_int = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (ra.field_m != null) {
                fq.a(param0, 1048576, param3, 124, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = -64 % ((param2 - 42) / 38);
              if (wd.field_L != null) {
                var5 = rm.field_b;
                synchronized (var5) {
                  L3: {
                    wd.field_L.a(param1, -1, false);
                    if (param3 == bb.field_g) {
                      return;
                    } else {
                      L4: {
                        wd.field_L.g(2);
                        rm.field_b.e();
                        bb.field_g = param3;
                        if (bb.field_g != null) {
                          wd.field_L.a(bb.field_g, param0, 8361407);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("nc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    void a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        qd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        qd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        qd stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackOut_33_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = this.field_g.field_d;
                    if ((this.field_d ^ -1) != -12) {
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
                    if (this.field_d == -7) {
                        statePc = 25;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (2 == this.field_d) {
                        statePc = 25;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_d == 8) {
                        statePc = 6;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (cq.a(15000)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3 = ai.a(stackIn_9_0 != 0, (byte) 110);
                    if (-4 != (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (rn.field_f == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    rn.a(-36);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    uq.a(param0 + 3, jl.b(0));
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var3 ^ -1) != -2) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (ec.field_c) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 15;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var4 = stackIn_17_0;
                    bm.a(false, var4, param0 ^ 127, sp.field_g);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (-3 == (var3 ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    if (!ec.field_c) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = 15;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var4 = stackIn_23_0;
                    bm.a(true, var4, 126, sp.field_g);
                    return;
                }
                case 25: {
                    stackIn_27_0 = wp.field_h;
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = 122;
                    stackIn_26_1 = stackIn_27_1;
                    if (-3 == (this.field_d ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (qd) ((Object) stackIn_26_0);
                    stackIn_28_1 = stackIn_26_1;
                    stackIn_28_2 = 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (qd) ((Object) stackIn_27_0);
                    stackIn_28_1 = stackIn_27_1;
                    stackIn_28_2 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    ((qd) (Object) stackIn_28_0).a((byte) stackIn_28_1, stackIn_28_2 != 0);
                    if (-7 == this.field_d) {
                        statePc = 30;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 32: {
                    if (!ba.c(-1)) {
                        statePc = 64;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = am.a(param0 ^ -118);
                    stackIn_65_0 = stackOut_33_0 ? 1 : 0;
                    stackIn_34_0 = stackOut_33_0;
                    if (var5 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0) {
                        statePc = 36;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!iq.field_f) {
                        statePc = 46;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (!re.field_b) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!hh.field_b) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (va.a((byte) -59, 13, 15, 12)) {
                        statePc = 32;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (w.a(13, 15, 12, 18663)) {
                        statePc = 32;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (13 == sj.field_p) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (sj.field_p == 80) {
                        statePc = 45;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 45: {
                    iq.field_f = false;
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (sj.field_p != 80) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    iq.field_f = true;
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((sj.field_p ^ -1) == -14) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.c(false);
                    if (-1 == this.field_g.field_d) {
                        statePc = 32;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.b(param0 + 12, this.field_g.field_d);
                    this.b(-96, false, this.field_g.field_d);
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_d == 2) {
                        statePc = 63;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (-11 != (this.field_d ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((this.field_d ^ -1) != -8) {
                        statePc = 57;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if ((this.field_d ^ -1) != -2) {
                        statePc = 59;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (this.field_d != 15) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    bm.a(false, 1, param0 ^ 125, sp.field_g);
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3 = vd.field_d;
                    bm.a(false, var3, param0 + 125, sp.field_g);
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    bm.a(false, -7, param0 ^ 126, sp.field_g);
                    vd.field_d = 1;
                    if (var5 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var3 = stackIn_65_0;
                    if (!am.a(param0 ^ -112)) {
                        statePc = 74;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (fb.field_e == null) {
                        statePc = 74;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (!df.field_I) {
                        statePc = 69;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (fb.field_e.a(true, 15978)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_72_0 = 1;
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var3 = stackIn_72_0;
                    if (!re.field_b) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    w.a(320, 180, true, 81);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (param0 != (this.a(-6003, bo.field_d, bd.field_g) ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    en.a(-1, 4);
                    if (var5 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    en.a(-1, 1);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var3 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    this.field_g.a(this.a(-6003, bo.field_d, bd.field_g), 42, this.a(-6003, ka.field_t, vb.field_f));
                    if (this.field_g.field_d == -1) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.b(12, this.field_g.field_d);
                    this.b(-74, true, this.field_g.field_d);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (this.field_g.field_d == var2) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (0 != (this.field_g.field_d ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    nm.b(-128, 69);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, byte param2) {
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12_ref_String;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.a(param0, 23697);
        var5 = this.a((byte) -118, param0);
        var6 = this.field_j[param0];
        if (var6 != 22) {
          L0: {
            if ((var6 ^ -1) == -24) {
              break L0;
            } else {
              if (-25 == (var6 ^ -1)) {
                break L0;
              } else {
                if (-26 == (var6 ^ -1)) {
                  break L0;
                } else {
                  if ((var6 ^ -1) == -28) {
                    break L0;
                  } else {
                    if (var6 == 28) {
                      break L0;
                    } else {
                      if (var6 == 29) {
                        break L0;
                      } else {
                        if (var6 == 30) {
                          break L0;
                        } else {
                          if (var6 == 31) {
                            break L0;
                          } else {
                            if (32 == var6) {
                              break L0;
                            } else {
                              if (-34 == (var6 ^ -1)) {
                                break L0;
                              } else {
                                if (-27 == (var6 ^ -1)) {
                                  break L0;
                                } else {
                                  L1: {
                                    var7 = we.field_g[var6];
                                    var8 = -var5 + this.d(-69, param0);
                                    var9 = this.b((byte) 68, param0);
                                    if (param1) {
                                      stackIn_18_0 = 1;
                                      break L1;
                                    } else {
                                      stackIn_18_0 = 10;
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = stackIn_18_0;
                                    if (4 != var6) {
                                      break L2;
                                    } else {
                                      if (rn.field_f != null) {
                                        break L2;
                                      } else {
                                        L3: {
                                          if (0 >= vl.field_h) {
                                            break L3;
                                          } else {
                                            if (pn.a(-9, pl.field_J)) {
                                              break L2;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        L4: {
                                          if (param1) {
                                            stackIn_26_0 = 7;
                                            break L4;
                                          } else {
                                            stackIn_26_0 = 6;
                                            break L4;
                                          }
                                        }
                                        var10 = stackIn_26_0;
                                        break L2;
                                      }
                                    }
                                  }
                                  L5: {
                                    if (-41 != (var6 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (!wc.j(127)) {
                                        break L5;
                                      } else {
                                        L6: {
                                          if (!param1) {
                                            stackIn_32_0 = 6;
                                            break L6;
                                          } else {
                                            stackIn_32_0 = 7;
                                            break L6;
                                          }
                                        }
                                        var10 = stackIn_32_0;
                                        break L5;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (null != fb.field_e) {
                                      stackIn_36_0 = fb.field_e.g(-127);
                                      break L7;
                                    } else {
                                      stackIn_36_0 = 0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    L9: {
                                      var11 = stackIn_36_0;
                                      if (var7 != null) {
                                        break L9;
                                      } else {
                                        var7 = "ERROR: missing text";
                                        if (var17 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var6 == 20) {
                                        break L10;
                                      } else {
                                        if (var6 == 21) {
                                          var7 = vl.a(var7, new String[]{Integer.toString(var11)}, 2);
                                          if (-1 != (var11 ^ -1)) {
                                            break L8;
                                          } else {
                                            var10 = 6;
                                            if (var17 == 0) {
                                              break L8;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var7 = vl.a(var7, new String[]{Integer.toString(var11)}, 2);
                                    var12_ref_String = var7;
                                    var12_ref_String = var7;
                                    break L8;
                                  }
                                  L11: {
                                    if ((var6 ^ -1) == -51) {
                                      L12: {
                                        L13: {
                                          if ((ll.field_k.field_k ^ -1) != -2) {
                                            break L13;
                                          } else {
                                            var12_ref_String = da.field_f;
                                            if (var17 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (-1 == (ll.field_k.field_k ^ -1)) {
                                            break L14;
                                          } else {
                                            var12_ref_String = jp.field_a;
                                            if (var17 == 0) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        var12_ref_String = jm.field_l;
                                        break L12;
                                      }
                                      var7 = var7 + var12_ref_String;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L15: {
                                    if (param2 <= -32) {
                                      break L15;
                                    } else {
                                      this.field_f = false;
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      var12 = -ah.field_e.field_r + (-ZombieDawnMulti.field_I[0].field_u + var9) + (-ZombieDawnMulti.field_I[6].field_u + -ah.field_e.field_C);
                                      if (-13 == (var6 ^ -1)) {
                                        break L17;
                                      } else {
                                        if (13 == var6) {
                                          break L17;
                                        } else {
                                          ah.field_e.b(var7, var5 + (var8 >> -160418751), ZombieDawnMulti.field_I[0].field_u + var4 - -ah.field_e.field_C + (var12 >> -1038888159), var10, 0);
                                          if (var17 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      if (-13 != (var6 ^ -1)) {
                                        stackIn_61_0 = 200;
                                        break L18;
                                      } else {
                                        stackIn_61_0 = 224;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      var13 = stackIn_61_0;
                                      var14 = 137 + ok.field_l;
                                      var15 = var5 - -(-var14 + var8 >> 903453857);
                                      ah.field_e.c(var7, var15, (var12 >> 1755571617) + ah.field_e.field_C + var4 + ZombieDawnMulti.field_I[0].field_u, var10, 0);
                                      var15 = var15 + (8 + ok.field_l);
                                      oo.a(var15, var9 / 2 + var4 - 1, 129, 2, var10);
                                      if (12 != var6) {
                                        stackIn_64_0 = uk.field_S;
                                        break L19;
                                      } else {
                                        stackIn_64_0 = db.field_c;
                                        break L19;
                                      }
                                    }
                                    var16 = stackIn_64_0;
                                    var16 = (var16 << -1915660504) / var13;
                                    lm.field_eb.g((var16 >> 2027224065) + (var15 + -1), var4);
                                    break L16;
                                  }
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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

    nc(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            this.field_k = param5;
            this.field_d = param0;
            this.field_a = param3;
            this.field_j = param6;
            this.field_f = param1 ? true : false;
            this.field_b = param4;
            this.field_i = param2;
            this.field_g = new hh(this.field_j.length);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Send private message";
    }
}
