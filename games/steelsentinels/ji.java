/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;
    private int field_k;
    static int field_i;
    private rm field_g;
    private int field_h;
    static int[] field_d;
    static String field_l;
    static String[] field_b;
    static String[] field_f;
    static int field_e;
    private int field_c;
    static volatile int field_j;

    private final void e(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -108) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (this.e(0, param0 + 128)) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var2_int = stackIn_8_0;
              if (this.e(2, 20)) {
                stackIn_12_0 = 2;
                break L3;
              } else {
                stackIn_12_0 = 1;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_12_0;
              if (this.field_g.a(0)) {
                break L4;
              } else {
                L5: {
                  if (ei.field_q != 96) {
                    break L5;
                  } else {
                    L6: {
                      if ((this.field_g.field_e ^ -1) >= (var2_int ^ -1)) {
                        break L6;
                      } else {
                        this.field_g.a(0, this.field_g.field_e - 1);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_g.a(0, var3);
                    break L5;
                  }
                }
                if (97 != ei.field_q) {
                  break L4;
                } else {
                  L7: {
                    L8: {
                      if (-1 < (this.field_g.field_e ^ -1)) {
                        break L8;
                      } else {
                        if ((var3 ^ -1) < (this.field_g.field_e ^ -1)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_g.a(0, var2_int);
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                  this.field_g.a(0, this.field_g.field_e + 1);
                  break L4;
                }
              }
            }
            L9: {
              if (nf.field_a == null) {
                break L9;
              } else {
                if (null != nf.field_a.field_Ub) {
                  L10: {
                    L11: {
                      var4 = ei.field_q;
                      if (var4 != 105) {
                        break L11;
                      } else {
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (104 != var4) {
                        break L12;
                      } else {
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (-99 == (var4 ^ -1)) {
                      break L10;
                    } else {
                      if (var4 != 99) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ef.field_c = ei.field_q;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.V(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_c == 14) {
                  break L2;
                } else {
                  if (13 == this.field_c) {
                    break L2;
                  } else {
                    if ((this.field_c ^ -1) == -8) {
                      break L2;
                    } else {
                      if ((this.field_c ^ -1) == -18) {
                        break L2;
                      } else {
                        if ((this.field_c ^ -1) == -7) {
                          break L2;
                        } else {
                          if (-6 == (this.field_c ^ -1)) {
                            break L2;
                          } else {
                            if ((this.field_c ^ -1) == -9) {
                              break L2;
                            } else {
                              if (19 == this.field_c) {
                                break L2;
                              } else {
                                if (20 != this.field_c) {
                                  break L1;
                                } else {
                                  break L2;
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
              if ((-4 + uc.field_e[this.field_c].length ^ -1) >= (param1 ^ -1)) {
                stackIn_31_0 = param1 - uc.field_e[this.field_c].length + 4;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 < -59) {
                break L3;
              } else {
                this.i(-28);
                break L3;
              }
            }
            stackIn_36_0 = -1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.DB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_31_0;
        } else {
          return stackIn_36_0;
        }
    }

    private final void i(int param0) {
        if (!(va.field_c != null)) {
            return;
        }
        try {
            va.field_c.a(60);
            if (param0 != 21003) {
                this.a((byte) -45, -31, true);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.RA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_248_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_290_1 = 0;
        int stackIn_387_0 = 0;
        int stackIn_387_1 = 0;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        Object var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((nk.field_J ^ -1) < -1) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    nk.field_J = nk.field_J - 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (!gh.field_J) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (ni.b(11)) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    gh.field_J = false;
                    km.field_a = null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((this.field_c ^ -1) != -22) {
                        statePc = 43;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = eh.field_c;
                    stackIn_18_0 = var2;
                    stackIn_13_0 = stackIn_18_0;
                    stackIn_18_1 = 4540749;
                    stackIn_13_1 = stackIn_18_1;
                    if (mm.a(false)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_18_0 = stackIn_13_0;
                    stackIn_14_0 = stackIn_18_0;
                    stackIn_18_1 = stackIn_13_1;
                    stackIn_14_1 = stackIn_18_1;
                    if ((this.field_c ^ -1) != (vb.field_g ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = stackIn_14_0;
                    stackIn_16_1 = stackIn_14_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = stackIn_16_0;
                    stackIn_19_1 = stackIn_16_1;
                    stackIn_19_2 = 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var3_int = ((ng) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2 != 0);
                    if ((var3_int ^ -1) == -4) {
                        statePc = 43;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var3_int == 1) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 != var3_int) {
                        statePc = 43;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((var3_int ^ -1) != -3) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var4 = stackIn_32_0;
                    var5 = vb.field_g;
                    if ((var5 ^ -1) == -6) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (6 == var5) {
                        statePc = 41;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((var5 ^ -1) == -9) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var5 = gh.field_Jb;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    q.a(0, var4 != 0, -1, var5);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (this.a(-2)) {
                        statePc = 190;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((sn.field_q ^ -1) == 0) {
                        statePc = 78;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (lb.field_gc == 1) {
                        statePc = 52;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-1 != (jl.field_p ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (ni.b(47)) {
                        statePc = 74;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (128 <= sn.field_q) {
                        statePc = 67;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    mm.field_g.a(66, (byte) -117);
                    mm.field_g.a((byte) 111, 1);
                    mm.field_g.a((byte) 124, sn.field_q);
                    var2_int = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var2_int >= va.field_k.length) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    va.field_k[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var6 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    vn.d(-65);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var6 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    mm.field_g.a(66, (byte) -117);
                    mm.field_g.a((byte) 108, 0);
                    mm.field_g.a((byte) 119, sn.field_q - 128);
                    var2_int = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if ((va.field_k.length ^ -1) >= (var2_int ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    va.field_k[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var6 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    vn.d(-78);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (jl.field_p >= 0) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    ee.c(-2483, 95);
                    lg.field_l = true;
                    kf.field_s = true;
                    sn.field_q = -1;
                    lb.field_gc = 0;
                    jl.field_p = -1;
                    ln.field_c = null;
                    km.field_a = null;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (!gh.field_J) {
                        statePc = 137;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((lb.field_gc ^ -1) == -2) {
                        statePc = 84;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var2_int = ln.field_g;
                    if (0 != var2_int) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var6 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (-2 != (var2_int ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (var6 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((var2_int ^ -1) != -3) {
                        statePc = 137;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var6 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    ee.c(-2483, 95);
                    var2_int = vb.field_g;
                    if (-6 == (var2_int ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var2_int == 6) {
                        statePc = 109;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (-9 == (var2_int ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var2_int = gh.field_Jb;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    q.a(0, true, -1, var2_int);
                    km.field_a = null;
                    gh.field_J = false;
                    lg.field_l = true;
                    kf.field_s = true;
                    var2_int = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (3 <= var2_int) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    fm.field_f[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var6 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    jc.field_f = 0;
                    jb.field_P = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var2_int = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((var2_int ^ -1) <= (rn.field_D.length ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    rn.field_D[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var6 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var2_int = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((fe.field_D.length ^ -1) >= (var2_int ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    fe.field_D[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var6 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (var6 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    ee.c(-2483, 95);
                    v.a(20, (String) null, 10);
                    if (var6 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    ee.c(-2483, 95);
                    gh.field_J = false;
                    kf.field_s = true;
                    km.field_a = null;
                    lg.field_l = true;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (!gd.field_ub) {
                        statePc = 144;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (null == km.field_a) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    gd.field_ub = false;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (!gd.field_ub) {
                        statePc = 151;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (lb.field_gc == 1) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    lb.field_gc = 0;
                    km.field_a = null;
                    kf.field_s = true;
                    ln.field_c = null;
                    lg.field_l = true;
                    gd.field_ub = false;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (km.field_a == td.field_ac) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (km.field_a != ra.field_b) {
                        statePc = 161;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (!ni.b(11)) {
                        statePc = 160;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 160: {
                    km.field_a = null;
                    lg.field_l = true;
                    kf.field_s = true;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (km.field_a == td.field_ac) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (ra.field_b != km.field_a) {
                        statePc = 174;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if ((lb.field_gc ^ -1) != -2) {
                        statePc = 174;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if ((ln.field_g ^ -1) == -1) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    ee.c(-2483, 95);
                    v.a(20, (String) null, 10);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (null == km.field_a) {
                        statePc = 190;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (!dl.f(22759)) {
                        statePc = 188;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (-14 == (ei.field_q ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (ei.field_q == 84) {
                        statePc = 185;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (ei.field_q != 83) {
                        statePc = 175;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    km.field_a = null;
                    lg.field_l = true;
                    ln.field_c = null;
                    kf.field_s = true;
                    if (var6 != 0) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (null == km.field_a) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    return;
                }
                case 190: {
                    var2 = null;
                    if (-1 < (dc.field_g ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var2 = pa.field_d[dc.field_g];
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (null != var2) {
                        statePc = 195;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!dl.f(22759)) {
                        statePc = 218;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (13 == ei.field_q) {
                        statePc = 209;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (ei.field_q != 84) {
                        statePc = 195;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    stackIn_219_0 = 7;
                    stackIn_201_0 = stackIn_219_0;
                    stackIn_219_1 = this.field_g.field_e;
                    stackIn_201_1 = stackIn_219_1;
                    if (var6 != 0) {
                        statePc = 219;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (stackIn_201_0 == stackIn_201_1) {
                        statePc = 209;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (8 == this.field_g.field_e) {
                        statePc = 209;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 209: {
                    dc.field_g = -1;
                    ((sf) (var2)).a((byte) 92);
                    var3_int = vb.field_g;
                    if ((var3_int ^ -1) == -6) {
                        statePc = 216;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (var3_int == 6) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (8 != var3_int) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var3_int = gh.field_Jb;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    q.a(0, false, -1, var3_int);
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    stackIn_219_0 = lb.field_gc ^ -1;
                    stackIn_219_1 = -3;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if (stackIn_219_0 != stackIn_219_1) {
                        statePc = 226;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (!((sf) (var2)).c(21)) {
                        statePc = 225;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 225: {
                    lb.field_gc = 0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (lb.field_gc != 1) {
                        statePc = 232;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (((sf) (var2)).a(this.field_g, 23123)) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    lb.field_gc = 0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (wb.field_c == null) {
                        statePc = 236;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    wb.field_c.setCursor((java.awt.Cursor) null);
                    if (var6 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    sl.field_n.setCursor((java.awt.Cursor) null);
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (param0) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    field_a = -33;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (12 == this.field_c) {
                        statePc = 244;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (mm.a(false)) {
                        statePc = 247;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    stackIn_248_0 = 1;
                    statePc = 248;
                    continue stateLoop;
                }
                case 247: {
                    stackIn_248_0 = 0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    var3_int = c.a(stackIn_248_0 != 0, 269);
                    if ((var3_int ^ -1) == -4) {
                        statePc = 251;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (null == wb.field_c) {
                        statePc = 254;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    ub.c(0);
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    re.a(wl.d((byte) -21), 9268);
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if ((var3_int ^ -1) != -2) {
                        statePc = 267;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var4 = vb.field_g;
                    if (5 == var4) {
                        statePc = 265;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if ((var4 ^ -1) == -7) {
                        statePc = 265;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if ((var4 ^ -1) == -9) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var4 = gh.field_Jb;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    q.a(0, false, -1, var4);
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var3_int == 2) {
                        statePc = 270;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var4 = vb.field_g;
                    if (5 == var4) {
                        statePc = 279;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (-7 == (var4 ^ -1)) {
                        statePc = 279;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (8 == var4) {
                        statePc = 279;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var4 = gh.field_Jb;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    q.a(0, true, -1, var4);
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    return;
                }
                case 282: {
                    if (rc.field_n) {
                        statePc = 390;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (!da.field_d) {
                        statePc = 288;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (!dl.f(22759)) {
                        statePc = 386;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    stackIn_387_0 = 13;
                    stackIn_290_0 = stackIn_387_0;
                    stackIn_387_1 = ei.field_q;
                    stackIn_290_1 = stackIn_387_1;
                    if (var6 != 0) {
                        statePc = 387;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (stackIn_290_0 == stackIn_290_1) {
                        statePc = 299;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    this.a((byte) -120);
                    if (0 != (this.field_g.field_e ^ -1)) {
                        statePc = 298;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 298: {
                    this.a((byte) -32, this.field_g.field_e, false);
                    if (var6 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if ((this.field_c ^ -1) != -8) {
                        statePc = 306;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if ((gh.field_Jb ^ -1) != -1) {
                        statePc = 305;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 305: {
                    ea.field_k = true;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (-21 != (this.field_c ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (-1 <= (fm.field_f[0] ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (ni.b(49)) {
                        statePc = 385;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if ((this.field_c ^ -1) == -19) {
                        statePc = 367;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (-2 == (this.field_c ^ -1)) {
                        statePc = 366;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (-3 == (this.field_c ^ -1)) {
                        statePc = 366;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (-4 == (this.field_c ^ -1)) {
                        statePc = 366;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if ((this.field_c ^ -1) == -5) {
                        statePc = 366;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if ((pm.field_T ^ -1) == -11) {
                        statePc = 288;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (pm.field_T == 0) {
                        statePc = 288;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (-15 != (pm.field_T ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    gh.field_Jb = 0;
                    if (var6 == 0) {
                        statePc = 362;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if (pm.field_T == 20) {
                        statePc = 351;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if ((gh.field_Jb ^ -1) != (this.field_c ^ -1)) {
                        statePc = 362;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if (-15 == (this.field_c ^ -1)) {
                        statePc = 348;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (13 != this.field_c) {
                        statePc = 362;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    gh.field_Jb = 0;
                    if (var6 == 0) {
                        statePc = 362;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    if (10 > fm.field_f[0]) {
                        statePc = 357;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    if (!ni.b(36)) {
                        statePc = 360;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    gh.field_Jb = 0;
                    if (var6 == 0) {
                        statePc = 362;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    gh.field_Jb = 19;
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if ((pm.field_T ^ -1) != -20) {
                        statePc = 365;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    gh.field_Jb = 0;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    q.a(gh.field_Jb, false, -1, gh.field_Jb);
                    if (var6 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    ee.c(-2483, 85);
                    q.a(-1, false, -1, 0);
                    if (var6 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var3_int = 0;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (var3_int >= va.field_k.length) {
                        statePc = 373;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    va.field_k[var3_int] = 0;
                    var3_int++;
                    if (var6 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (var6 == 0) {
                        statePc = 368;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    vn.d(-66);
                    var3_int = vb.field_g;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (-6 == (var3_int ^ -1)) {
                        statePc = 383;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (var3_int == 6) {
                        statePc = 383;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    if (var3_int == 8) {
                        statePc = 383;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var3_int = gh.field_Jb;
                    statePc = 384;
                    continue stateLoop;
                }
                case 384: {
                    q.a(0, false, -1, var3_int);
                    if (var6 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    gh.field_J = true;
                    ln.field_g = -1;
                    if (var6 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    this.field_g.a(124, this.a(oh.field_f, pi.field_c, 70), this.a(oa.field_S, rj.field_j, 125));
                    stackIn_387_0 = this.field_g.field_e;
                    stackIn_387_1 = -1;
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    if ((stackIn_387_0 ^ stackIn_387_1) == 0) {
                        statePc = 390;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    this.a((byte) -110, this.field_g.field_e, true);
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if (0 != this.field_c) {
                        statePc = 406;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (!hg.field_h) {
                        statePc = 406;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (-2 != (lb.field_gc ^ -1)) {
                        statePc = 406;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    ee.c(-2483, 95);
                    var3_int = vb.field_g;
                    if ((var3_int ^ -1) == -6) {
                        statePc = 404;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    if (var3_int == 6) {
                        statePc = 404;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    if ((var3_int ^ -1) != -9) {
                        statePc = 405;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    var3_int = gh.field_Jb;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    q.a(18, true, -1, var3_int);
                    if (var6 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if ((this.field_c ^ -1) == -19) {
                        statePc = 452;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (this.field_c != 8) {
                        statePc = 415;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    this.a(true, false);
                    if (var6 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (9 == this.field_c) {
                        statePc = 421;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if (-11 != (pm.field_T ^ -1)) {
                        statePc = 424;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    this.a(true, true);
                    if (var6 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    if ((this.field_c ^ -1) != -15) {
                        statePc = 437;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    rj.d(6993661);
                    statePc = 456;
                    continue stateLoop;
                }
                case 437: {
                    if (this.field_c == 13) {
                        statePc = 456;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    if (this.field_c != 7) {
                        statePc = 446;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    this.g((byte) -40);
                    if (var6 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (-17 != (this.field_c ^ -1)) {
                        statePc = 456;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    this.i(21003);
                    if (var6 == 0) {
                        statePc = 456;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    this.o(-29628);
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int g(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          L0: {
            var3_int = this.b(-106, param1);
            if (-1 >= (var3_int ^ -1)) {
              stackIn_4_0 = 159 * var3_int + 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_c != 5) {
                  break L1;
                } else {
                  if (!ni.b(52)) {
                    L2: {
                      if ((param1 ^ -1) <= -4) {
                        stackIn_15_0 = 260;
                        break L2;
                      } else {
                        stackIn_15_0 = 100 - -(param1 * 150);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-18 != (this.field_c ^ -1)) {
                if (!this.a(-2)) {
                  L3: {
                    if (-7 != (this.field_c ^ -1)) {
                      break L3;
                    } else {
                      if (!ni.b(54)) {
                        L4: {
                          if (2 <= param1) {
                            stackIn_32_0 = 260;
                            break L4;
                          } else {
                            stackIn_32_0 = 170 * param1 + 155;
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-8 == (this.field_c ^ -1)) {
                    stackIn_37_0 = uc.field_k[this.field_c] + 180 * param1;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    if (this.field_c != 13) {
                      if (this.field_c == 14) {
                        if (ni.b(114)) {
                          stackIn_53_0 = 240 + (-1200 + 800 * param1) / 5;
                          decompiledRegionSelector0 = 9;
                          break L0;
                        } else {
                          stackIn_51_0 = (param1 * 800 + -800) / 5 - -240;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        }
                      } else {
                        if (-1 == (this.field_c ^ -1)) {
                          var4 = uc.field_e[this.field_c][param1];
                          if (-35 == (var4 ^ -1)) {
                            stackIn_61_0 = 19;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          } else {
                            stackIn_63_0 = 190;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          }
                        } else {
                          if (this.field_c != 15) {
                            if (param0 > 123) {
                              L5: {
                                if ((this.field_c ^ -1) != -20) {
                                  break L5;
                                } else {
                                  if (fa.field_c == uc.field_e[this.field_c]) {
                                    L6: {
                                      if ((param1 ^ -1) > -1) {
                                        break L6;
                                      } else {
                                        if (-11 < (param1 ^ -1)) {
                                          stackIn_95_0 = 30;
                                          decompiledRegionSelector0 = 16;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (10 > param1) {
                                        break L7;
                                      } else {
                                        if ((param1 ^ -1) > -21) {
                                          stackIn_103_0 = 230;
                                          decompiledRegionSelector0 = 17;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    if (-21 < (param1 ^ -1)) {
                                      break L5;
                                    } else {
                                      if ((param1 ^ -1) > -31) {
                                        stackIn_111_0 = 430;
                                        decompiledRegionSelector0 = 18;
                                        break L0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    L8: {
                                      if (-1 < (param1 ^ -1)) {
                                        break L8;
                                      } else {
                                        if (param1 >= 10) {
                                          break L8;
                                        } else {
                                          stackIn_81_0 = 50;
                                          decompiledRegionSelector0 = 14;
                                          break L0;
                                        }
                                      }
                                    }
                                    if ((param1 ^ -1) > -11) {
                                      break L5;
                                    } else {
                                      if (param1 >= 20) {
                                        break L5;
                                      } else {
                                        stackIn_87_0 = 330;
                                        decompiledRegionSelector0 = 15;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (20 != this.field_c) {
                                  break L9;
                                } else {
                                  L10: {
                                    var4 = uc.field_e[this.field_c][param1];
                                    if (25 == var4) {
                                      break L10;
                                    } else {
                                      if (26 == var4) {
                                        stackIn_126_0 = 540;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        if ((var4 ^ -1) != -40) {
                                          break L9;
                                        } else {
                                          if (SteelSentinels.field_G == 0) {
                                            stackIn_128_0 = 196;
                                            decompiledRegionSelector0 = 21;
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackIn_124_0 = 40;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                }
                              }
                              stackIn_130_0 = uc.field_k[this.field_c];
                              decompiledRegionSelector0 = 22;
                              break L0;
                            } else {
                              stackIn_69_0 = -50;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            }
                          } else {
                            stackIn_66_0 = 350;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (ni.b(82)) {
                        stackIn_45_0 = 320 + (800 * param1 + -1200) / 5;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_43_0 = (-800 + 800 * param1) / 5 + 320;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_21_0 = 195;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_18_0 = 195;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.JB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_43_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_45_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_51_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_53_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_61_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_63_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_66_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_69_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_81_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_87_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_95_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_103_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_111_0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_124_0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_126_0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_128_0;
                                                  } else {
                                                    return stackIn_130_0;
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

    private final int c(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (-18 != (this.field_c ^ -1)) {
                break L1;
              } else {
                if ((param1 ^ -1) > (uc.field_e[this.field_c].length + -4 ^ -1)) {
                  stackIn_7_0 = 25;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(-2)) {
              stackIn_12_0 = 25;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (this.field_c != 0) {
                  break L2;
                } else {
                  if ((uc.field_e[this.field_c][param1] ^ -1) != -35) {
                    break L2;
                  } else {
                    stackIn_18_0 = 65;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              L3: {
                if (param0 == 25) {
                  break L3;
                } else {
                  ji.h((byte) -119);
                  break L3;
                }
              }
              L4: {
                if (this.field_c != 19) {
                  break L4;
                } else {
                  if ((uc.field_e[this.field_c][param1] ^ -1) != -39) {
                    break L4;
                  } else {
                    stackIn_27_0 = 24;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              L5: {
                if (this.field_c != 20) {
                  break L5;
                } else {
                  L6: {
                    var3_int = uc.field_e[this.field_c][param1];
                    if (25 == var3_int) {
                      break L6;
                    } else {
                      L7: {
                        if (var3_int != 26) {
                          break L7;
                        } else {
                          if (SteelSentinels.field_G == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var3_int == 39) {
                        stackIn_44_0 = 26;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackIn_42_0 = 24;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
              L8: {
                if (this.field_c != 5) {
                  break L8;
                } else {
                  if (ni.b(87)) {
                    break L8;
                  } else {
                    if ((param1 ^ -1) > -4) {
                      stackIn_55_0 = 25;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (this.field_c != 6) {
                  break L9;
                } else {
                  if (ni.b(param0 ^ 127)) {
                    break L9;
                  } else {
                    if (param1 < 2) {
                      stackIn_66_0 = 25;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              stackIn_68_0 = 30;
              decompiledRegionSelector0 = 8;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_44_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_55_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_66_0;
                      } else {
                        return stackIn_68_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static nk a(int[] param0, byte param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 54 % ((49 - param1) / 47);
            stackIn_1_0 = hj.a(-24809, true, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("ji.WA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, boolean param1) {
        int[] stackIn_50_0 = null;
        int stackIn_53_0 = 0;
        boolean stackIn_56_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_226_0 = 0;
        String stackIn_233_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_55_0;
        boolean stackOut_74_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[][] var11_ref_int____ = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var12_ref_int____ = null;
        int[] var13 = null;
        int var13_int = 0;
        wk var13_ref = null;
        int var14_int = 0;
        int[] var14 = null;
        wk var14_ref = null;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        String var16_ref_String = null;
        int var17 = 0;
        int[] var17_ref_int__ = null;
        int var18 = 0;
        int var19_int = 0;
        String var19 = null;
        Object var20_ref = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    pb.h(30, 70, 580, 350, 5789784);
                    pb.h(34, 74, 60, 342, 930889);
                    pb.h(546, 74, 60, 342, 930889);
                    pb.h(98, 74, 61, 23, 930889);
                    pb.h(481, 74, 61, 23, 930889);
                    var3_int = 930889;
                    var4 = q.field_i;
                    q.field_i = 0;
                    if (hd.field_i > 0) {
                        statePc = 4;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (oh.field_f < 98) {
                        statePc = 15;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((oh.field_f ^ -1) <= -160) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (74 > pi.field_c) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((pi.field_c ^ -1) <= -98) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3_int = 0;
                    jm.a(73, 24, wc.field_d, 1, 98, 61);
                    q.field_i = -1;
                    if (var24 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3_int = 1146810;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var5 = 930889;
                    if (hd.field_i >= -1 + dh.field_C.length) {
                        statePc = 31;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (oh.field_f < 481) {
                        statePc = 30;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (542 <= oh.field_f) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (74 > pi.field_c) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (97 <= pi.field_c) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = 0;
                    jm.a(73, 24, wc.field_d, param0 + -47, 481, 61);
                    q.field_i = 1;
                    if (var24 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var5 = 1146810;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var4 == q.field_i) {
                        statePc = 37;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((q.field_i ^ -1) == -1) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ee.c(-2483, 97);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    el.field_Ub.c((61 - el.field_Ub.field_A) / 2 + 98, 74 - -((-el.field_Ub.field_F + 23) / 2), var3_int);
                    gm.field_b.c(481 + (-gm.field_b.field_A + 61) / 2, 74 + (-gm.field_b.field_F + 23) / 2, var5);
                    if (param0 == 48) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    pb.h(163, 74, 314, 23, 930889);
                    pl.field_U.a(db.a(am.field_e, -63, new String[]{Integer.toString(1 + hd.field_i), Integer.toString(dh.field_C.length)}), 320, 74 - -((pl.field_U.field_U + 23) / 2), 1021128, -1);
                    pb.h(98, 101, 444, 154, 5789784);
                    pb.d(262, 259, 157, 930889);
                    pb.h(98, 259, 444, 157, 1130327);
                    pb.h(266, 263, 272, 23, 1130327);
                    pb.h(266, 290, 272, 122, 2697513);
                    var6 = 78;
                    var7 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (-17 >= (var7 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    pb.h(37, var6, 54, 18, 2697513);
                    pb.h(549, var6, 54, 18, 2697513);
                    var6 += 21;
                    var7++;
                    if (var24 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var24 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var7 = 120;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var8 = 106;
                    ao.field_C = -1;
                    if (param1) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = ge.field_m;
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = ce.field_t;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var9 = stackIn_50_0;
                    var10 = 0;
                    var11_ref_int____ = dh.field_C[hd.field_i];
                    var12 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var11_ref_int____.length <= var12) {
                        statePc = 68;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var13 = var11_ref_int____[var12];
                    var14_int = 0;
                    var15_ref_int__ = var13;
                    stackIn_69_0 = 0;
                    stackIn_53_0 = stackIn_69_0;
                    if (var24 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var16 = stackIn_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if ((var15_ref_int__.length ^ -1) >= (var16 ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var17 = var15_ref_int__[var16];
                    stackOut_55_0 = this.f(var17, 111);
                    stackIn_64_0 = stackOut_55_0 ? 1 : 0;
                    stackIn_56_0 = stackOut_55_0;
                    if (var24 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (!stackIn_56_0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var14_int = 1;
                    if (var24 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var16++;
                    if (var24 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = var14_int;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var10++;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var12++;
                    if (var24 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (-(var10 * 30) + 154) / (1 + var10) - -30;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var11 = stackIn_69_0;
                    var8 = var11 + 101 - 30;
                    var12_ref_int____ = dh.field_C[hd.field_i];
                    var13_int = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var13_int >= var12_ref_int____.length) {
                        statePc = 137;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var14 = var12_ref_int____[var13_int];
                    var15 = 0;
                    var16_ref_int__ = var14;
                    stackIn_138_0 = 0;
                    stackIn_72_0 = stackIn_138_0;
                    if (var24 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var17 = stackIn_72_0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if ((var16_ref_int__.length ^ -1) >= (var17 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var18 = var16_ref_int__[var17];
                    stackOut_74_0 = this.f(var18, 111);
                    stackIn_82_0 = stackOut_74_0 ? 1 : 0;
                    stackIn_75_0 = stackOut_74_0;
                    if (var24 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (stackIn_75_0) {
                        statePc = 79;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var15++;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var17++;
                    if (var24 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0 == var15) {
                        statePc = 136;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var16 = (-(var15 * 30) + 444) / (var15 + 1) - -30;
                    var7 = var16 + 98 + -30;
                    var17_ref_int__ = var14;
                    var18 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var17_ref_int__.length <= var18) {
                        statePc = 134;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var19_int = var17_ref_int__[var18];
                    stackIn_135_0 = oh.field_f ^ -1;
                    stackIn_86_0 = stackIn_135_0;
                    stackIn_135_1 = var7 ^ -1;
                    stackIn_86_1 = stackIn_135_1;
                    if (var24 != 0) {
                        statePc = 135;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 > stackIn_86_1) {
                        statePc = 101;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((30 + var7 ^ -1) >= (oh.field_f ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((pi.field_c ^ -1) > (var8 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((pi.field_c ^ -1) > (30 + var8 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    ao.field_C = var19_int;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var20_ref = ff.field_tb;
                    if (!ve.a(var9, 1, var19_int)) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var20_ref = od.field_c[var19_int];
                    if (var24 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (ve.a(ao.field_A, 1, var19_int)) {
                        statePc = 116;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (!ve.a(ao.field_E, param0 ^ 49, var19_int)) {
                        statePc = 117;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (ni.b(72)) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (rd.field_b > 0) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var20_ref = null;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    var20_ref = null;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var20_ref != null) {
                        statePc = 124;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((ao.field_C ^ -1) == (var19_int ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 123: {
                    ao.field_C = -1;
                    if (var24 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var21 = 0;
                    if (in.field_k == var19_int) {
                        statePc = 131;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((var19_int ^ -1) == (ao.field_C ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var21 = 2;
                    if (var24 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var21 = 4;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    ((wk) (var20_ref)).d(var7 - -var21, var8 - var21);
                    var7 = var7 + var16;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    var18++;
                    if (var24 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = var8;
                    stackIn_135_1 = var11;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var8 = stackIn_135_0 + stackIn_135_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var13_int++;
                    if (var24 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = in.field_k;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 != -1) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackIn_142_0 = ao.field_C;
                    statePc = 142;
                    continue stateLoop;
                }
                case 141: {
                    stackIn_142_0 = in.field_k;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var12 = stackIn_142_0;
                    if ((var12 ^ -1) == 0) {
                        statePc = 191;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var13_int = 402;
                    var14_int = (23 - -ui.field_U.field_U) / 2 + 263;
                    ui.field_U.a(ke.a(42, jg.field_t[var12]), var13_int, var14_int, 1021128, -1);
                    var14_int = 306;
                    var15 = ve.a(var9, param0 + -47, var12) ? 1 : 0;
                    if (var15 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    pl.field_U.a(ol.field_Zb, var13_int, var14_int, 8421504, -1);
                    if (var24 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    pl.field_U.a(sf.field_p, var13_int, var14_int, 16777215, -1);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var15 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    od.field_c[var12].a(120, 277);
                    if (var24 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    ff.field_tb.a(120, 277);
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (var15 != 0) {
                        statePc = 159;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (ve.a(ao.field_B, param0 + -47, var12)) {
                        statePc = 188;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var16_ref_String = oe.field_a[var12].toUpperCase();
                    var17 = 330;
                    var18 = var17 + fk.field_d.a(var16_ref_String, 252, 0);
                    if ((var18 ^ -1) < -383) {
                        statePc = 166;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (362 >= var18) {
                        statePc = 168;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var17 -= 8;
                    if (var24 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var17 -= 18;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var13_int = 276;
                    var14_int = 392;
                    fk.field_d.a(var16_ref_String, 276, var17, 252, 122, 1021128, -1, 1, 0, 0);
                    if (-383 > (var18 ^ -1)) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var14_int += 10;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    fk.field_d.b(ke.a(param0 + -6, sh.field_c + "<col=ffffff>" + 100 * wb.field_h[var12] + "</col>"), 276, var14_int, 1021128, -1);
                    var13_int += 130;
                    var19_int = 528 - bc.field_sb.field_A;
                    var20 = -bc.field_sb.field_F + 10 + var14_int;
                    if (-11 != (wb.field_h[var12] ^ -1)) {
                        statePc = 180;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var20 -= 10;
                    var21 = 0;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (5 <= var21) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    bc.field_sb.a(var19_int, var20);
                    bc.field_sb.a(var19_int, var20 - -20);
                    var19_int = var19_int - bc.field_sb.field_A / 3;
                    var21++;
                    if (var24 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (var24 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var24 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var21 = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if ((var21 ^ -1) <= (wb.field_h[var12] ^ -1)) {
                        statePc = 186;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    bc.field_sb.a(var19_int, var20);
                    var19_int = var19_int - bc.field_sb.field_A / 3;
                    var21++;
                    if (var24 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var24 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    fk.field_d.c(ke.a(42, v.field_d), bc.field_sb.field_A / 3 + var19_int, var14_int, 1021128, -1);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (var24 == 0) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    pl.field_U.a(gj.field_c, 276, 345, 252, 122, 1021128, -1, 1, 0, 0);
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (var24 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    pl.field_U.a(na.field_q, 276, 300, 252, 102, 1021128, -1, 1, 1, 0);
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (ee.field_S != null) {
                        statePc = 196;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var13_ref = uh.field_k;
                    var14_ref = var13_ref.a();
                    var15 = 38;
                    var6 = 79;
                    var16 = 0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (32 <= var16) {
                        statePc = 252;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (var24 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if ((var16 ^ -1) <= (ee.field_S.length ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (-1 > (ee.field_S[var16] ^ -1)) {
                        statePc = 207;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (-321 >= (var15 ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var14_ref.a(-1 + var15, -1 + var6);
                    if (var24 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var13_ref.a(var15, var6 - 1);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    pd.field_Z[var16].a(var15, var6 - 1);
                    if ((var15 ^ -1) < (oh.field_f ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if ((28 + var15 ^ -1) >= (oh.field_f ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if ((pi.field_c ^ -1) > (var6 ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (18 + var6 <= pi.field_c) {
                        statePc = 225;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackIn_226_0 = 1;
                    statePc = 226;
                    continue stateLoop;
                }
                case 225: {
                    stackIn_226_0 = 0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var17 = stackIn_226_0;
                    var18 = ee.field_S[var16];
                    if (-1 <= (var18 ^ -1)) {
                        statePc = 241;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (var18 < 250) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    stackIn_233_0 = ll.field_m;
                    statePc = 233;
                    continue stateLoop;
                }
                case 232: {
                    stackIn_233_0 = Integer.toString(var18);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    var19 = stackIn_233_0;
                    var20 = 24736 + Math.min(var18, 255) / 6 * 262657;
                    if ((var18 ^ -1) > -251) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var20 = 16777215;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var15 >= 320) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    fk.field_d.c(var19, 88, var6 - -12, var20, -1);
                    if (var24 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    fk.field_d.b(var19, 553, 12 + var6, var20, -1);
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (var17 == 0) {
                        statePc = 246;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var19 = bj.field_l[var16 * 2];
                    var20 = 8 + fk.field_d.c(var19);
                    var21 = -(var20 / 2) + var15 + 8;
                    if ((var15 ^ -1) > -321) {
                        statePc = 244;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var21 = Math.min(var21, -var20 + 630);
                    if (var24 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var21 = Math.max(var21, 10);
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    var22 = 15;
                    var23 = var6 + -var22;
                    pb.h(var21, var23, var20, var22, 16777215, 192);
                    pb.c(var21, var23, var20, var22, 0, 192);
                    fk.field_d.b(var19, 4 + var21, 11 + var23, 16777215, -1);
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (-321 >= (var15 ^ -1)) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var15 = 575;
                    if (var24 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var6 += 21;
                    var15 = 38;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var16++;
                    if (var24 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((uc.field_e[this.field_c].length ^ -1) >= (var4_int ^ -1)) {
                    break L3;
                  } else {
                    var5 = this.b(var4_int, (byte) -106);
                    stackOut_3_0 = this.e(var4_int, 20);
                    stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          if ((param0 ^ -1) > (this.g(126, var4_int) ^ -1)) {
                            break L4;
                          } else {
                            if ((param0 ^ -1) <= (this.a(var4_int, (byte) 121) ^ -1)) {
                              break L4;
                            } else {
                              if ((var5 ^ -1) < (param1 ^ -1)) {
                                break L4;
                              } else {
                                if (param1 >= this.c(25, var4_int) + var5) {
                                  break L4;
                                } else {
                                  stackIn_20_0 = var4_int;
                                  decompiledRegionSelector0 = 0;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_23_0 = param2;
                break L2;
              }
              L5: {
                if (stackIn_23_0 > 68) {
                  break L5;
                } else {
                  ji.a((String) null, -71);
                  break L5;
                }
              }
              stackIn_27_0 = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_27_0;
        }
    }

    private final int g(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (7 != this.field_c) {
              L1: {
                var3 = 76 % ((80 - param0) / 42);
                var2_int = this.field_g.field_e;
                var4 = this.b(-78, var2_int);
                if ((var2_int ^ -1) > -1) {
                  break L1;
                } else {
                  if (uc.field_e[this.field_c].length <= var2_int) {
                    break L1;
                  } else {
                    if (0 != (uc.field_e[this.field_c][var2_int] ^ -1)) {
                      L2: {
                        if (this.field_c == 20) {
                          L3: {
                            if (0 > var2_int) {
                              break L3;
                            } else {
                              if (2 <= var2_int) {
                                break L3;
                              } else {
                                stackIn_34_0 = 2;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          if (-1 < (var4 ^ -1)) {
                            break L2;
                          } else {
                            if (!this.a(117, 0)) {
                              stackIn_42_0 = 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              stackIn_40_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (this.field_c == 0) {
                        if ((uc.field_e[this.field_c][var2_int] ^ -1) == -35) {
                          stackIn_50_0 = var2_int;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L4: {
                            if (uc.field_e[this.field_c][var2_int] == 19) {
                              break L4;
                            } else {
                              if ((var2_int - -1 ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                                break L4;
                              } else {
                                stackIn_60_0 = 1 + var2_int;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              }
                            }
                          }
                          stackIn_58_0 = 0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        if (-18 == (this.field_c ^ -1)) {
                          if (var2_int != -5 + uc.field_e[this.field_c].length) {
                            if (-5 + uc.field_e[this.field_c].length > var2_int) {
                              stackIn_71_0 = 1 + var2_int;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              stackIn_73_0 = 0;
                              decompiledRegionSelector0 = 11;
                              break L0;
                            }
                          } else {
                            stackIn_66_0 = -1 + uc.field_e[this.field_c].length;
                            decompiledRegionSelector0 = 9;
                            break L0;
                          }
                        } else {
                          L5: {
                            if (this.field_c != 5) {
                              break L5;
                            } else {
                              if (0 != (var4 ^ -1)) {
                                break L5;
                              } else {
                                if (0 == var2_int) {
                                  stackIn_84_0 = 3;
                                  decompiledRegionSelector0 = 12;
                                  break L0;
                                } else {
                                  if ((var2_int ^ -1) != -2) {
                                    if ((var2_int ^ -1) == -3) {
                                      stackIn_92_0 = 6;
                                      decompiledRegionSelector0 = 14;
                                      break L0;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    stackIn_87_0 = 4;
                                    decompiledRegionSelector0 = 13;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          L6: {
                            if ((this.field_c ^ -1) != -7) {
                              break L6;
                            } else {
                              if (0 != (var4 ^ -1)) {
                                break L6;
                              } else {
                                if (-1 == (var2_int ^ -1)) {
                                  stackIn_103_0 = 2;
                                  decompiledRegionSelector0 = 15;
                                  break L0;
                                } else {
                                  if (-2 != (var2_int ^ -1)) {
                                    break L6;
                                  } else {
                                    stackIn_106_0 = 5;
                                    decompiledRegionSelector0 = 16;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          L7: {
                            if (19 == this.field_c) {
                              if ((var4 ^ -1) > -1) {
                                L8: {
                                  if (fa.field_c != uc.field_e[this.field_c]) {
                                    stackIn_117_0 = 20;
                                    break L8;
                                  } else {
                                    stackIn_117_0 = 30;
                                    break L8;
                                  }
                                }
                                var5 = stackIn_117_0;
                                if ((var2_int ^ -1) == (var5 + -1 ^ -1)) {
                                  stackIn_121_0 = -1 + uc.field_e[this.field_c].length;
                                  decompiledRegionSelector0 = 18;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              } else {
                                stackIn_112_0 = 0;
                                decompiledRegionSelector0 = 17;
                                break L0;
                              }
                            } else {
                              break L7;
                            }
                          }
                          stackIn_123_0 = -1;
                          decompiledRegionSelector0 = 19;
                          break L0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var2_int >= uc.field_e[this.field_c].length) {
                      break L11;
                    } else {
                      stackIn_21_0 = 0;

                      stackIn_21_1 = uc.field_e[this.field_c][var2_int] ^ -1;

                      if (var6 != 0) {
                        break L10;
                      } else {
                        if (stackIn_21_0 != stackIn_21_1) {
                          break L11;
                        } else {
                          var2_int++;
                          if (var6 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  stackIn_21_0 = uc.field_e[this.field_c].length;
                  stackIn_21_1 = var2_int;
                  break L10;
                }
                if (stackIn_21_0 != stackIn_21_1) {
                  stackIn_25_0 = var2_int;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_23_0 = -1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_34_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_50_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_58_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_60_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_66_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_71_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_73_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_84_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_87_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_92_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_103_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_106_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_112_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_121_0;
                                            } else {
                                              return stackIn_123_0;
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
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void m(int param0) {
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_46_0 = false;
        int stackIn_53_0 = 0;
        String stackIn_106_0 = null;
        String stackIn_110_0 = null;
        boolean stackIn_124_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        boolean stackOut_25_0;
        boolean stackOut_45_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = va.field_d;
            va.field_d = -1;
            pb.a(0, 50, 640, 430, 0);
            if (param0 > 112) {
              var3 = 100;
              var4 = 55;
              var5 = 200;
              var6 = 30;
              var7 = ff.field_lb;
              var8 = "";
              var9_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var9_int ^ -1) <= -4) {
                      break L3;
                    } else {
                      stackOut_5_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                      stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_6_0) {
                            break L4;
                          } else {
                            var8 = var8 + ", " + cd.field_c[var9_int];
                            break L4;
                          }
                        }
                        var9_int++;
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_12_0 = var8.length();
                  break L2;
                }
                L5: {
                  L6: {
                    if (stackIn_12_0 != 0) {
                      break L6;
                    } else {
                      var8 = "none";
                      if (var12 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var8 = var8.substring(2);
                  break L5;
                }
                L7: {
                  var4 = var4 + ((mi) ((Object) var7)).field_G;
                  var8 = "Currently unlocked: " + var8;
                  ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                  var4 += 5;
                  if (nm.a(var4, var3, 126, "Lock mechs 1,2,3", var6, var5)) {
                    va.field_d = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var3 = var3 + (var5 - -20);
                  if (nm.a(var4, var3, 124, "Unlock mechs 1,2,3", var6, var5)) {
                    va.field_d = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var3 = var3 - (20 + var5);
                var8 = "";
                var4 = var4 + (var6 - -5);
                var9_int = 3;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var9_int >= 6) {
                        break L11;
                      } else {
                        stackOut_25_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                        stackIn_32_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var12 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (!stackIn_26_0) {
                              break L12;
                            } else {
                              var8 = var8 + ", " + cd.field_c[var9_int];
                              break L12;
                            }
                          }
                          var9_int++;
                          if (var12 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackIn_32_0 = -1;
                    break L10;
                  }
                  L13: {
                    L14: {
                      if (stackIn_32_0 != (var8.length() ^ -1)) {
                        break L14;
                      } else {
                        var8 = "none";
                        if (var12 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var8 = var8.substring(2);
                    break L13;
                  }
                  L15: {
                    var8 = "Currently unlocked: " + var8;
                    var4 = var4 + ((mi) ((Object) var7)).field_G;
                    ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                    var4 += 5;
                    if (nm.a(var4, var3, 116, "Lock mechs 4,5,6", var6, var5)) {
                      va.field_d = 2;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    var3 = var3 + (var5 - -20);
                    if (nm.a(var4, var3, 118, "Unlock mechs 4,5,6", var6, var5)) {
                      va.field_d = 3;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var4 = var4 + (5 + var6);
                  var8 = "";
                  var3 = var3 - (20 + var5);
                  var9_int = 6;
                  L17: while (true) {
                    L18: {
                      L19: {
                        if (-13 >= (var9_int ^ -1)) {
                          break L19;
                        } else {
                          stackOut_45_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
                          stackIn_53_0 = stackOut_45_0 ? 1 : 0;
                          stackIn_46_0 = stackOut_45_0;
                          if (var12 != 0) {
                            break L18;
                          } else {
                            L20: {
                              if (stackIn_46_0) {
                                var8 = var8 + ", " + cd.field_c[var9_int];
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            var9_int++;
                            if (var12 == 0) {
                              continue L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      stackIn_53_0 = 0;
                      break L18;
                    }
                    L21: {
                      L22: {
                        if (stackIn_53_0 == var8.length()) {
                          break L22;
                        } else {
                          var8 = var8.substring(2);
                          if (var12 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var8 = "none";
                      break L21;
                    }
                    L23: {
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      var8 = "Currently unlocked: " + var8;
                      ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
                      var4 += 5;
                      if (!nm.a(var4, var3, 116, "Lock mechs 7-12", var6, var5)) {
                        break L23;
                      } else {
                        va.field_d = 4;
                        break L23;
                      }
                    }
                    L24: {
                      var3 = var3 + (20 + var5);
                      if (!nm.a(var4, var3, 123, "Unlock mechs 7-12", var6, var5)) {
                        break L24;
                      } else {
                        va.field_d = 5;
                        break L24;
                      }
                    }
                    L25: {
                      var4 = var4 + (var6 + 5);
                      var3 = var3 - (20 + var5);
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      ((mi) ((Object) var7)).a("Solarite: " + li.field_v, 320, var4, 16777215, -1);
                      var4 += 5;
                      if (nm.a(var4, var3, 127, "Revoke 100 Solarite", var6, var5)) {
                        va.field_d = 6;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      var3 = var3 + (var5 - -20);
                      if (!nm.a(var4, var3, 119, "Get 100 Solarite", var6, var5)) {
                        break L26;
                      } else {
                        va.field_d = 7;
                        break L26;
                      }
                    }
                    L27: {
                      var4 = var4 + (10 + var6);
                      var3 = var3 - (var5 - -20);
                      var4 = var4 + ((mi) ((Object) var7)).field_G;
                      ((mi) ((Object) var7)).a("Total items engineered: " + pc.e(126), 320, var4, 16777215, -1);
                      var4 += 5;
                      if (nm.a(var4, var3, 127, "Unengineer all", var6, var5)) {
                        va.field_d = 8;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      var3 = var3 + (20 + var5);
                      if (nm.a(var4, var3, 127, "Engineer all", var6, var5)) {
                        va.field_d = 9;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      var4 = var4 + (10 + var6);
                      var3 = 200;
                      var4 += 10;
                      var5 = 80;
                      var6 = 30;
                      ((mi) ((Object) var7)).b("COMPLETE CAMPAIGN:", 50, 20 + var4, 1021128, -1);
                      if (!nm.a(var4, var3, 124, "Training", var6, var5)) {
                        break L29;
                      } else {
                        va.field_d = 24;
                        break L29;
                      }
                    }
                    L30: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[0]), var5 / 2 + var3, var4 + -2, 16777215, -1);
                      var3 = var3 + (10 + var5);
                      if (!nm.a(var4, var3, 124, "Free", var6, var5)) {
                        break L30;
                      } else {
                        va.field_d = 25;
                        break L30;
                      }
                    }
                    L31: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[1]), var5 / 2 + var3, var4 - 2, 16777215, -1);
                      var3 = var3 + (10 + var5);
                      if (!nm.a(var4, var3, 117, "Member", var6, var5)) {
                        break L31;
                      } else {
                        va.field_d = 26;
                        break L31;
                      }
                    }
                    L32: {
                      ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[2]), var5 / 2 + var3, -2 + var4, 16777215, -1);
                      var3 = 170;
                      var6 = 30;
                      var4 += 34;
                      var3 = 30;
                      var4 = var4 + (((mi) ((Object) var7)).field_G + 5);
                      ((mi) ((Object) var7)).b("SET STATE:", var3, 20 + var4, 1021128, -1);
                      var5 = 60;
                      var3 += 70;
                      if (nm.a(var4, var3, 120, "Noob", var6, var5)) {
                        va.field_d = 10;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      var3 = var3 + (10 + var5);
                      if (nm.a(var4, var3, 124, "Basic", var6, var5)) {
                        va.field_d = 11;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      var3 = var3 + (var5 - -10);
                      var5 = 90;
                      if (nm.a(var4, var3, 118, "Advanced", var6, var5)) {
                        va.field_d = 12;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      var3 = var3 + (var5 + 10);
                      var5 = 90;
                      if (nm.a(var4, var3, 122, "Mighty God", var6, var5)) {
                        va.field_d = 13;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      var3 = var3 + (40 + var5);
                      var5 = 100;
                      if ((8 & dm.field_a) == 0) {
                        stackIn_106_0 = "Config tutorial <col=00ff00>pending</col>";
                        break L36;
                      } else {
                        stackIn_106_0 = "Config tutorial viewed";
                        break L36;
                      }
                    }
                    L37: {
                      var9 = stackIn_106_0;
                      ((mi) ((Object) var7)).b(var9, -10 + var3, -3 + var4, 16777215, -1);
                      if ((dm.field_a & 8 ^ -1) == -1) {
                        stackIn_110_0 = "Skip";
                        break L37;
                      } else {
                        stackIn_110_0 = "Reset";
                        break L37;
                      }
                    }
                    L38: {
                      var10 = stackIn_110_0;
                      if (nm.a(var4, var3, 125, var10, var6, var5)) {
                        va.field_d = 16;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    var4 += 46;
                    ((mi) ((Object) var7)).a("MUSIC", 122, -3 + var4, 1021128, -1);
                    var3 = 20;
                    var5 = 30;
                    var11 = 0;
                    L39: while (true) {
                      L40: {
                        L41: {
                          if (-6 > (var11 ^ -1)) {
                            break L41;
                          } else {
                            stackIn_124_0 = nm.a(var4, var3, 127, "" + var11, var6, var5);

                            if (var12 != 0) {
                              break L40;
                            } else {
                              L42: {
                                if (stackIn_124_0) {
                                  va.field_d = var11 + 17;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              var3 = var3 + (5 + var5);
                              var11++;
                              if (var12 == 0) {
                                continue L39;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                        var6 = 30;
                        var5 = 100;
                        var3 = (-var5 + 640) / 2;
                        stackIn_124_0 = nm.a(var4, var3, 118, "MAIN MENU", var6, var5);
                        break L40;
                      }
                      L43: {
                        if (!stackIn_124_0) {
                          break L43;
                        } else {
                          va.field_d = 14;
                          break L43;
                        }
                      }
                      L44: {
                        L45: {
                          var3 = var3 + (var5 + 40);
                          var5 = 140;
                          if (!nm.a(var4, var3, 116, "Update server", var6, var5)) {
                            break L45;
                          } else {
                            va.field_d = 15;
                            if (var12 == 0) {
                              break L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (!jg.field_j) {
                          break L44;
                        } else {
                          if (0 != (a.field_c & 16)) {
                            break L44;
                          } else {
                            pb.h(var3, var4, var5, var6, 32896);
                            break L44;
                          }
                        }
                      }
                      L46: {
                        if (va.field_d == -1) {
                          break L46;
                        } else {
                          if ((var2_int ^ -1) == (va.field_d ^ -1)) {
                            break L46;
                          } else {
                            ee.c(-2483, 97);
                            break L46;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean b(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (-1 < (param2 ^ -1)) {
                break L2;
              } else {
                if (param2 < 10) {
                  L3: {
                    if (0 > param1) {
                      break L3;
                    } else {
                      if (param1 < 3) {
                        L4: {
                          if (-3 != (param1 ^ -1)) {
                            break L4;
                          } else {
                            if (-1 <= (rd.field_b ^ -1)) {
                              stackIn_22_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if ((param1 ^ -1) >= -1) {
                            break L5;
                          } else {
                            if (3 > fm.field_f[0]) {
                              stackIn_30_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if ((fm.field_f[param1] ^ -1) <= (param2 ^ -1)) {
                          stackIn_35_0 = 1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_33_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            stackIn_8_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0 != 0;
                } else {
                  return stackIn_35_0 != 0;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int stackIn_243_0 = 0;
        String[] stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        String[] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        String[] stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        String stackIn_247_2 = null;
        int stackIn_737_0 = 0;
        int stackIn_856_0 = 0;
        String[] stackIn_857_0 = null;
        int stackIn_857_1 = 0;
        String[] stackIn_859_0 = null;
        int stackIn_859_1 = 0;
        String[] stackIn_860_0 = null;
        int stackIn_860_1 = 0;
        String stackIn_860_2 = null;
        int stackIn_876_0 = 0;
        String[] stackIn_877_0 = null;
        int stackIn_877_1 = 0;
        String[] stackIn_879_0 = null;
        int stackIn_879_1 = 0;
        String[] stackIn_880_0 = null;
        int stackIn_880_1 = 0;
        String stackIn_880_2 = null;
        int stackIn_897_0 = 0;
        String[] stackIn_898_0 = null;
        int stackIn_898_1 = 0;
        String[] stackIn_900_0 = null;
        int stackIn_900_1 = 0;
        String[] stackIn_901_0 = null;
        int stackIn_901_1 = 0;
        String stackIn_901_2 = null;
        int stackIn_919_0 = 0;
        String[] stackIn_920_0 = null;
        int stackIn_920_1 = 0;
        String[] stackIn_922_0 = null;
        int stackIn_922_1 = 0;
        String[] stackIn_923_0 = null;
        int stackIn_923_1 = 0;
        String stackIn_923_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_c == 18) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var4_int = this.field_g.c(0) ? 1 : 0;
                    var5 = uc.field_e[this.field_c][param1];
                    if (param0 < -1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if ((var5 ^ -1) == 0) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!this.field_g.field_c) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.a(121, param1)) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ee.c(-2483, 97);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var6 = var5;
                    if (-1 != var6) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var10 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var6 == 38) {
                        statePc = 221;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-40 == (var6 ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((var6 ^ -1) != -38) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var10 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-42 == (var6 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (0 == var6) {
                        statePc = 260;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var6 != 46) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var10 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (-34 == (var6 ^ -1)) {
                        statePc = 295;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((var6 ^ -1) == -2) {
                        statePc = 311;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var6 != 2) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var10 == 0) {
                        statePc = 337;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if ((var6 ^ -1) != -8) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var10 == 0) {
                        statePc = 343;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var6 != 24) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var10 == 0) {
                        statePc = 372;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (22 != var6) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var10 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if ((var6 ^ -1) == -28) {
                        statePc = 398;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (28 != var6) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var10 == 0) {
                        statePc = 413;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-6 == (var6 ^ -1)) {
                        statePc = 442;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (8 == var6) {
                        statePc = 454;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var6 == 4) {
                        statePc = 478;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var6 != 3) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var10 == 0) {
                        statePc = 492;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if ((var6 ^ -1) != -21) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var10 == 0) {
                        statePc = 508;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (-22 != (var6 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var10 == 0) {
                        statePc = 560;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (6 == var6) {
                        statePc = 591;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (-10 != (var6 ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var10 == 0) {
                        statePc = 601;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (10 != var6) {
                        statePc = 125;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var10 == 0) {
                        statePc = 661;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (-12 == (var6 ^ -1)) {
                        statePc = 665;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if ((var6 ^ -1) != -13) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (var10 == 0) {
                        statePc = 669;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-14 != (var6 ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var10 == 0) {
                        statePc = 673;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (14 != var6) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var10 == 0) {
                        statePc = 692;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if ((var6 ^ -1) != -16) {
                        statePc = 152;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (var10 == 0) {
                        statePc = 698;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (16 != var6) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (var10 == 0) {
                        statePc = 704;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (17 != var6) {
                        statePc = 164;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (var10 == 0) {
                        statePc = 710;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (-19 == (var6 ^ -1)) {
                        statePc = 716;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (23 != var6) {
                        statePc = 173;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var10 == 0) {
                        statePc = 722;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if ((var6 ^ -1) == -26) {
                        statePc = 759;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if ((var6 ^ -1) != -27) {
                        statePc = 182;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var10 == 0) {
                        statePc = 769;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var6 != 19) {
                        statePc = 188;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (var10 == 0) {
                        statePc = 779;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (-35 != (var6 ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var10 == 0) {
                        statePc = 785;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (-41 == (var6 ^ -1)) {
                        statePc = 804;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var6 == 35) {
                        statePc = 815;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((var6 ^ -1) == -46) {
                        statePc = 831;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (var6 == 42) {
                        statePc = 847;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (43 == var6) {
                        statePc = 864;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (44 != var6) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (var10 == 0) {
                        statePc = 885;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (-48 == (var6 ^ -1)) {
                        statePc = 906;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (this.field_g.c(0)) {
                        statePc = 226;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (this.field_c != 19) {
                        statePc = 229;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    ge.field_j = param1 / 10;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (!this.b(false, ge.field_j, param1 % 10)) {
                        statePc = 926;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    nk.field_J = 500;
                    ol.field_Ub = param1 % 10;
                    var6 = param2 ? 1 : 0;
                    q.a(20, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    sh.a(-23, param2, this.field_g.c(0));
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (ka.field_V) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    stackIn_243_0 = 1;
                    statePc = 243;
                    continue stateLoop;
                }
                case 242: {
                    stackIn_243_0 = 0;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    ka.field_V = stackIn_243_0 != 0;
                    stackIn_246_0 = ti.field_A;
                    stackIn_244_0 = stackIn_246_0;
                    stackIn_246_1 = 37;
                    stackIn_244_1 = stackIn_246_1;
                    if (!ka.field_V) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_247_0 = (String[]) ((Object) stackIn_244_0);
                    stackIn_247_1 = stackIn_244_1;
                    stackIn_247_2 = ge.field_i;
                    statePc = 247;
                    continue stateLoop;
                }
                case 246: {
                    stackIn_247_0 = (String[]) ((Object) stackIn_246_0);
                    stackIn_247_1 = stackIn_246_1;
                    stackIn_247_2 = fg.field_Vb;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    stackIn_247_0[stackIn_247_1] = stackIn_247_2;
                    if (!ni.b(22)) {
                        statePc = 250;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 250: {
                    um.f((byte) 3);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    bg.c((byte) 120);
                    if (!ni.b(51)) {
                        statePc = 259;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 259: {
                    um.f((byte) 3);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (!this.a(124, param1)) {
                        statePc = 284;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (this.b(false, 1, 0)) {
                        statePc = 272;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (-21 != (this.field_c ^ -1)) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var6 = param2 ? 1 : 0;
                    q.a(19, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    ol.field_Ub = fm.field_f[0];
                    ge.field_j = 0;
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (5 == var7) {
                        statePc = 282;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var7 == 6) {
                        statePc = 282;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (var7 == 8) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var7 = gh.field_Jb;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    q.a(20, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (this.a(118, param1)) {
                        statePc = 289;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    nl.g(127);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (this.field_g.c(0)) {
                        statePc = 300;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 300: {
                    dc.field_g = -1;
                    if (ib.a(-99)) {
                        statePc = 304;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    km.field_a = dg.field_e;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    qh.field_Yb = 0;
                    di.field_g = 4;
                    if (-15 == (this.field_c ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 309: {
                    uc.field_b = cj.a(-107, di.field_c, hl.field_v);
                    hl.field_v = ji.a(uc.field_b, (byte) -25, di.field_c);
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    var6 = param2 ? 1 : 0;
                    q.a(-3, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (!ni.b(111)) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    si.field_y = false;
                    var6 = 0;
                    oc.a(99, var6, ql.field_dc, param2, true);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (!this.a(127, param1)) {
                        statePc = 336;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (!ib.a(-47)) {
                        statePc = 333;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (-6 == (var7 ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (-7 == (var7 ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if ((var7 ^ -1) != -9) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var7 = gh.field_Jb;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    q.a(-4, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    km.field_a = dg.field_e;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var4_int = 0;
                    km.field_a = b.field_l;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (this.field_g.c(0)) {
                        statePc = 342;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 342: {
                    var6 = param2 ? 1 : 0;
                    q.a(-1, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    ub.a(false, -1);
                    if (this.field_g.c(0)) {
                        statePc = 348;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (14 != pm.field_T) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    uc.field_b = cj.a(-109, di.field_c, hl.field_v);
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if ((pm.field_T ^ -1) != -21) {
                        statePc = 361;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if (!ni.b(28)) {
                        statePc = 361;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (0 >= fm.field_f[0]) {
                        statePc = 361;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    ln.field_g = -1;
                    gh.field_J = true;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (-6 == (var7 ^ -1)) {
                        statePc = 370;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (var7 == 6) {
                        statePc = 370;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if (8 == var7) {
                        statePc = 370;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var7 = gh.field_Jb;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    q.a(0, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (5 == var7) {
                        statePc = 382;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (6 == var7) {
                        statePc = 382;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (8 != var7) {
                        statePc = 383;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var7 = gh.field_Jb;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    q.a(12, var6 != 0, -1, var7);
                    td.field_Sb = true;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (this.field_g.c(0)) {
                        statePc = 389;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if ((var7 ^ -1) == -6) {
                        statePc = 396;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    if (6 == var7) {
                        statePc = 396;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if ((var7 ^ -1) != -9) {
                        statePc = 397;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    var7 = gh.field_Jb;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    q.a(8, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (-6 == (var7 ^ -1)) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    if (var7 == 6) {
                        statePc = 408;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (8 != var7) {
                        statePc = 409;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    var7 = gh.field_Jb;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    q.a(13, var6 != 0, -1, var7);
                    if (pm.field_T != 14) {
                        statePc = 926;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    uc.field_b = cj.a(-100, di.field_c, hl.field_v);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    if (this.field_g.c(0)) {
                        statePc = 418;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if (this.a(124, param1)) {
                        statePc = 420;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    var4_int = 0;
                    km.field_a = sj.field_C + "<br>" + b.field_l;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (!gi.h((byte) -79)) {
                        statePc = 431;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    ij.field_Y = -1;
                    fg.field_Ob = 1;
                    f.field_A = null;
                    ti.field_B = null;
                    vn.d(-52);
                    var6 = 0;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if ((var6 ^ -1) <= (va.field_k.length ^ -1)) {
                        statePc = 429;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    va.field_k[var6] = 0;
                    var6++;
                    if (var10 != 0) {
                        statePc = 430;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    if (var10 == 0) {
                        statePc = 424;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    param2 = true;
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    dc.field_g = 0;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    re.field_eb = -1;
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (5 == var7) {
                        statePc = 440;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    if (var7 == 6) {
                        statePc = 440;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if (-9 == (var7 ^ -1)) {
                        statePc = 440;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 440: {
                    var7 = gh.field_Jb;
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    q.a(14, var6 != 0, -1, var7);
                    hl.field_v = ji.a(uc.field_b, (byte) -67, di.field_c);
                    hl.field_v.b(6993661, -110);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    ea.field_k = false;
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (var7 == 5) {
                        statePc = 452;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if ((var7 ^ -1) == -7) {
                        statePc = 452;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    if ((var7 ^ -1) != -9) {
                        statePc = 453;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    var7 = gh.field_Jb;
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    q.a(7, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if (this.field_c != 19) {
                        statePc = 459;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    gh.field_Jb = 0;
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (this.field_g.c(0)) {
                        statePc = 462;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 462: {
                    if (-8 != (this.field_c ^ -1)) {
                        statePc = 469;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    if ((gh.field_Jb ^ -1) != -1) {
                        statePc = 468;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 468: {
                    ea.field_k = true;
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    var6 = gh.field_Jb;
                    var7 = param2 ? 1 : 0;
                    var8 = vb.field_g;
                    if (var8 == 5) {
                        statePc = 476;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    if (-7 == (var8 ^ -1)) {
                        statePc = 476;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (var8 != 8) {
                        statePc = 477;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    var8 = gh.field_Jb;
                    statePc = 477;
                    continue stateLoop;
                }
                case 477: {
                    q.a(var6, var7 != 0, -1, var8);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if ((var7 ^ -1) == -6) {
                        statePc = 490;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    if (-7 == (var7 ^ -1)) {
                        statePc = 490;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    if ((var7 ^ -1) == -9) {
                        statePc = 490;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 490: {
                    var7 = gh.field_Jb;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    q.a(6, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    if (-10 != (this.field_c ^ -1)) {
                        statePc = 499;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    var6 = param2 ? 1 : 0;
                    q.a(5, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (-6 == (var7 ^ -1)) {
                        statePc = 506;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    if (6 == var7) {
                        statePc = 506;
                    } else {
                        statePc = 503;
                    }
                    continue stateLoop;
                }
                case 503: {
                    if (8 != var7) {
                        statePc = 507;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 506: {
                    var7 = gh.field_Jb;
                    statePc = 507;
                    continue stateLoop;
                }
                case 507: {
                    q.a(5, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 508: {
                    var4_int = 0;
                    var6 = 0;
                    if (!this.field_g.b(117)) {
                        statePc = 515;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 509: {
                    if ((lb.field_ac ^ -1) < -1) {
                        statePc = 514;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 514: {
                    bb.a(0, (byte) 64);
                    var6 = 1;
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    if (!this.field_g.a((byte) 105)) {
                        statePc = 522;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if ((lb.field_ac ^ -1) > -257) {
                        statePc = 521;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 521: {
                    var6 = 1;
                    bb.a(256, (byte) 64);
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    if (this.field_g.a(0)) {
                        statePc = 525;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var7 = this.g(125, param1) - -this.a(param1, (byte) 118) + le.field_K - 170 >> -1107747103;
                    var8 = oh.field_f - var7 - -2;
                    var9 = 256 * var8 / 170;
                    if (0 < var9) {
                        statePc = 529;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    bb.a(0, (byte) 64);
                    if (var10 == 0) {
                        statePc = 537;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if ((var9 ^ -1) <= -257) {
                        statePc = 535;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    bb.a(var9, (byte) 64);
                    if (var10 == 0) {
                        statePc = 537;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    bb.a(256, (byte) 64);
                    statePc = 537;
                    continue stateLoop;
                }
                case 537: {
                    var6 = 1;
                    statePc = 538;
                    continue stateLoop;
                }
                case 538: {
                    if (!this.field_g.d(-97)) {
                        statePc = 543;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 539: {
                    if (lb.field_ac <= 0) {
                        statePc = 543;
                    } else {
                        statePc = 542;
                    }
                    continue stateLoop;
                }
                case 542: {
                    var6 = 1;
                    ij.k(-44);
                    statePc = 543;
                    continue stateLoop;
                }
                case 543: {
                    if (!this.field_g.c((byte) 51)) {
                        statePc = 550;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    if ((lb.field_ac ^ -1) > -257) {
                        statePc = 549;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 549: {
                    r.b((byte) 46);
                    var6 = 1;
                    statePc = 550;
                    continue stateLoop;
                }
                case 550: {
                    if (var6 == 0) {
                        statePc = 559;
                    } else {
                        statePc = 551;
                    }
                    continue stateLoop;
                }
                case 551: {
                    if (!this.field_g.a(0)) {
                        statePc = 557;
                    } else {
                        statePc = 554;
                    }
                    continue stateLoop;
                }
                case 554: {
                    if ((a.field_c ^ -1) >= (gb.field_a ^ -1)) {
                        statePc = 559;
                    } else {
                        statePc = 557;
                    }
                    continue stateLoop;
                }
                case 557: {
                    ee.c(-2483, 0);
                    gb.field_a = a.field_c + 20;
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    if (!this.field_g.b(126)) {
                        statePc = 565;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 563: {
                    ef.a(1, 0);
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    var4_int = 0;
                    if (!this.field_g.a((byte) -120)) {
                        statePc = 568;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    ef.a(1, 256);
                    statePc = 568;
                    continue stateLoop;
                }
                case 568: {
                    if (this.field_g.a(0)) {
                        statePc = 571;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var6 = -170 + (this.g(125, param1) + this.a(param1, (byte) 110)) - -le.field_K >> 423421089;
                    var7 = -var6 + oh.field_f - -2;
                    var8 = var7 * 256 / 170;
                    if (-1 > (var8 ^ -1)) {
                        statePc = 575;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    ef.a(1, 0);
                    if (var10 == 0) {
                        statePc = 583;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    if ((var8 ^ -1) <= -257) {
                        statePc = 581;
                    } else {
                        statePc = 578;
                    }
                    continue stateLoop;
                }
                case 578: {
                    ef.a(1, var8);
                    if (var10 == 0) {
                        statePc = 583;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 581: {
                    ef.a(1, 256);
                    statePc = 583;
                    continue stateLoop;
                }
                case 583: {
                    if (this.field_g.d(-97)) {
                        statePc = 586;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 586: {
                    s.b(125);
                    statePc = 587;
                    continue stateLoop;
                }
                case 587: {
                    if (!this.field_g.c((byte) 51)) {
                        statePc = 926;
                    } else {
                        statePc = 588;
                    }
                    continue stateLoop;
                }
                case 588: {
                    un.a((byte) 125);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 591;
                    }
                    continue stateLoop;
                }
                case 591: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    if (wb.field_c == null) {
                        statePc = 600;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    ub.c(0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 600;
                    }
                    continue stateLoop;
                }
                case 600: {
                    var6 = param2 ? 1 : 0;
                    si.field_y = false;
                    ag.a(-4, var6 != 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    if (this.field_g.c(0)) {
                        statePc = 606;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 606: {
                    var6 = 0;
                    var7 = di.field_g;
                    if (0 == var7) {
                        statePc = 639;
                    } else {
                        statePc = 607;
                    }
                    continue stateLoop;
                }
                case 607: {
                    if (var7 != 1) {
                        statePc = 613;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 610: {
                    if (var10 == 0) {
                        statePc = 639;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 613: {
                    if (7 != var7) {
                        statePc = 619;
                    } else {
                        statePc = 616;
                    }
                    continue stateLoop;
                }
                case 616: {
                    if (var10 == 0) {
                        statePc = 639;
                    } else {
                        statePc = 619;
                    }
                    continue stateLoop;
                }
                case 619: {
                    if ((var7 ^ -1) != -4) {
                        statePc = 625;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 622: {
                    if (var10 == 0) {
                        statePc = 639;
                    } else {
                        statePc = 625;
                    }
                    continue stateLoop;
                }
                case 625: {
                    if ((var7 ^ -1) == -6) {
                        statePc = 639;
                    } else {
                        statePc = 628;
                    }
                    continue stateLoop;
                }
                case 628: {
                    if (9 != var7) {
                        statePc = 634;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 631: {
                    if (var10 == 0) {
                        statePc = 639;
                    } else {
                        statePc = 634;
                    }
                    continue stateLoop;
                }
                case 634: {
                    if (-11 != (var7 ^ -1)) {
                        statePc = 640;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 639: {
                    var6 = 1;
                    statePc = 640;
                    continue stateLoop;
                }
                case 640: {
                    if (var6 == 0) {
                        statePc = 644;
                    } else {
                        statePc = 641;
                    }
                    continue stateLoop;
                }
                case 641: {
                    fk.field_i.i(77);
                    if (var10 == 0) {
                        statePc = 660;
                    } else {
                        statePc = 644;
                    }
                    continue stateLoop;
                }
                case 644: {
                    if (di.field_g != 4) {
                        statePc = 658;
                    } else {
                        statePc = 647;
                    }
                    continue stateLoop;
                }
                case 647: {
                    hl.field_v = ji.a(uc.field_b, (byte) 109, di.field_c);
                    lc.field_e = true;
                    ea.field_k = false;
                    var7 = vb.field_g;
                    if ((var7 ^ -1) == -6) {
                        statePc = 656;
                    } else {
                        statePc = 648;
                    }
                    continue stateLoop;
                }
                case 648: {
                    if (-7 == (var7 ^ -1)) {
                        statePc = 656;
                    } else {
                        statePc = 651;
                    }
                    continue stateLoop;
                }
                case 651: {
                    if (-9 == (var7 ^ -1)) {
                        statePc = 656;
                    } else {
                        statePc = 657;
                    }
                    continue stateLoop;
                }
                case 656: {
                    var7 = gh.field_Jb;
                    statePc = 657;
                    continue stateLoop;
                }
                case 657: {
                    q.a(14, false, -1, var7);
                    if (var10 == 0) {
                        statePc = 660;
                    } else {
                        statePc = 658;
                    }
                    continue stateLoop;
                }
                case 658: {
                    fk.field_i.a((byte) 30, param2);
                    ea.field_k = false;
                    lc.field_e = true;
                    statePc = 660;
                    continue stateLoop;
                }
                case 660: {
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 661;
                    }
                    continue stateLoop;
                }
                case 661: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 664;
                    }
                    continue stateLoop;
                }
                case 664: {
                    fk.field_i.m(1125);
                    var6 = param2 ? 1 : 0;
                    q.a(-1, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 665;
                    }
                    continue stateLoop;
                }
                case 665: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 668;
                    }
                    continue stateLoop;
                }
                case 668: {
                    fk.field_i.c(126);
                    var6 = param2 ? 1 : 0;
                    q.a(-1, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 672;
                    }
                    continue stateLoop;
                }
                case 672: {
                    fk.field_i.a(false);
                    var6 = param2 ? 1 : 0;
                    q.a(-1, var6 != 0, -1, 0);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 673;
                    }
                    continue stateLoop;
                }
                case 673: {
                    if (this.field_g.c(0)) {
                        statePc = 678;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 678: {
                    if (!ob.field_y) {
                        statePc = 688;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if ((var7 ^ -1) == -6) {
                        statePc = 686;
                    } else {
                        statePc = 680;
                    }
                    continue stateLoop;
                }
                case 680: {
                    if (6 == var7) {
                        statePc = 686;
                    } else {
                        statePc = 683;
                    }
                    continue stateLoop;
                }
                case 683: {
                    if ((var7 ^ -1) != -9) {
                        statePc = 687;
                    } else {
                        statePc = 686;
                    }
                    continue stateLoop;
                }
                case 686: {
                    var7 = gh.field_Jb;
                    statePc = 687;
                    continue stateLoop;
                }
                case 687: {
                    q.a(-5, var6 != 0, -1, var7);
                    statePc = 688;
                    continue stateLoop;
                }
                case 688: {
                    if (!ee.field_G) {
                        statePc = 926;
                    } else {
                        statePc = 689;
                    }
                    continue stateLoop;
                }
                case 689: {
                    ei.a(0, (byte) -23, 11);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 692;
                    }
                    continue stateLoop;
                }
                case 692: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 695: {
                    d.field_R = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 698;
                    }
                    continue stateLoop;
                }
                case 698: {
                    if (this.field_g.c(0)) {
                        statePc = 703;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 703: {
                    d.field_R = 1;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 704;
                    }
                    continue stateLoop;
                }
                case 704: {
                    if (this.field_g.c(0)) {
                        statePc = 709;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 709: {
                    d.field_R = 2;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 710: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 713;
                    }
                    continue stateLoop;
                }
                case 713: {
                    on.field_j = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 716;
                    }
                    continue stateLoop;
                }
                case 716: {
                    if (this.field_g.c(0)) {
                        statePc = 721;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 721: {
                    on.field_j = 1;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 722;
                    }
                    continue stateLoop;
                }
                case 722: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 725: {
                    si.field_y = false;
                    if (20 == this.field_c) {
                        statePc = 731;
                    } else {
                        statePc = 728;
                    }
                    continue stateLoop;
                }
                case 728: {
                    if (-20 != (this.field_c ^ -1)) {
                        statePc = 738;
                    } else {
                        statePc = 731;
                    }
                    continue stateLoop;
                }
                case 731: {
                    if (-4 < (fm.field_f[0] ^ -1)) {
                        statePc = 736;
                    } else {
                        statePc = 734;
                    }
                    continue stateLoop;
                }
                case 734: {
                    stackIn_737_0 = 19;
                    statePc = 737;
                    continue stateLoop;
                }
                case 736: {
                    stackIn_737_0 = 20;
                    statePc = 737;
                    continue stateLoop;
                }
                case 737: {
                    v.a(stackIn_737_0, (String) null, 10);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    if (this.field_c != 10) {
                        statePc = 744;
                    } else {
                        statePc = 741;
                    }
                    continue stateLoop;
                }
                case 741: {
                    v.a(9, (String) null, 10);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 744;
                    }
                    continue stateLoop;
                }
                case 744: {
                    if (8 == this.field_c) {
                        statePc = 756;
                    } else {
                        statePc = 747;
                    }
                    continue stateLoop;
                }
                case 747: {
                    if (5 == pm.field_T) {
                        statePc = 756;
                    } else {
                        statePc = 750;
                    }
                    continue stateLoop;
                }
                case 750: {
                    if (pm.field_T == 6) {
                        statePc = 756;
                    } else {
                        statePc = 753;
                    }
                    continue stateLoop;
                }
                case 753: {
                    if (14 != pm.field_T) {
                        statePc = 926;
                    } else {
                        statePc = 756;
                    }
                    continue stateLoop;
                }
                case 756: {
                    v.a(this.field_c, pl.field_Q, 10);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 759;
                    }
                    continue stateLoop;
                }
                case 759: {
                    if (!this.field_g.c(0)) {
                        statePc = 768;
                    } else {
                        statePc = 762;
                    }
                    continue stateLoop;
                }
                case 762: {
                    if (!this.a(121, param1)) {
                        statePc = 768;
                    } else {
                        statePc = 765;
                    }
                    continue stateLoop;
                }
                case 765: {
                    nk.field_J = 500;
                    ol.field_Ub = ol.field_Ub - 1;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 768;
                    }
                    continue stateLoop;
                }
                case 768: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    if (!this.field_g.c(0)) {
                        statePc = 778;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    if (!this.a(126, param1)) {
                        statePc = 778;
                    } else {
                        statePc = 775;
                    }
                    continue stateLoop;
                }
                case 775: {
                    ol.field_Ub = ol.field_Ub + 1;
                    nk.field_J = 500;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 778;
                    }
                    continue stateLoop;
                }
                case 778: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 779;
                    }
                    continue stateLoop;
                }
                case 779: {
                    if (this.field_g.c(0)) {
                        statePc = 784;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 784: {
                    t.a(true, wl.d((byte) -21));
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 785;
                    }
                    continue stateLoop;
                }
                case 785: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 788;
                    }
                    continue stateLoop;
                }
                case 788: {
                    if (!nk.f((byte) -28)) {
                        statePc = 793;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 793: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (-6 == (var7 ^ -1)) {
                        statePc = 802;
                    } else {
                        statePc = 794;
                    }
                    continue stateLoop;
                }
                case 794: {
                    if (6 == var7) {
                        statePc = 802;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 797: {
                    if (8 == var7) {
                        statePc = 802;
                    } else {
                        statePc = 803;
                    }
                    continue stateLoop;
                }
                case 802: {
                    var7 = gh.field_Jb;
                    statePc = 803;
                    continue stateLoop;
                }
                case 803: {
                    q.a(21, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 804;
                    }
                    continue stateLoop;
                }
                case 804: {
                    if (!this.field_g.c(0)) {
                        statePc = 926;
                    } else {
                        statePc = 807;
                    }
                    continue stateLoop;
                }
                case 807: {
                    ve.a((byte) 122);
                    ij.field_Y = -1;
                    f.field_A = null;
                    ti.field_B = null;
                    fg.field_Ob = 1;
                    vn.d(-68);
                    var6 = 0;
                    statePc = 808;
                    continue stateLoop;
                }
                case 808: {
                    if (var6 >= va.field_k.length) {
                        statePc = 813;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 809: {
                    va.field_k[var6] = 0;
                    var6++;
                    if (var10 != 0) {
                        statePc = 814;
                    } else {
                        statePc = 810;
                    }
                    continue stateLoop;
                }
                case 810: {
                    if (var10 == 0) {
                        statePc = 808;
                    } else {
                        statePc = 813;
                    }
                    continue stateLoop;
                }
                case 813: {
                    dc.field_g = 0;
                    statePc = 814;
                    continue stateLoop;
                }
                case 814: {
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 815;
                    }
                    continue stateLoop;
                }
                case 815: {
                    if (this.field_g.c(0)) {
                        statePc = 820;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 820: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if (5 == var7) {
                        statePc = 829;
                    } else {
                        statePc = 821;
                    }
                    continue stateLoop;
                }
                case 821: {
                    if ((var7 ^ -1) == -7) {
                        statePc = 829;
                    } else {
                        statePc = 824;
                    }
                    continue stateLoop;
                }
                case 824: {
                    if (8 == var7) {
                        statePc = 829;
                    } else {
                        statePc = 830;
                    }
                    continue stateLoop;
                }
                case 829: {
                    var7 = gh.field_Jb;
                    statePc = 830;
                    continue stateLoop;
                }
                case 830: {
                    q.a(17, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 831;
                    }
                    continue stateLoop;
                }
                case 831: {
                    if (this.field_g.c(0)) {
                        statePc = 836;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 836: {
                    var6 = param2 ? 1 : 0;
                    var7 = vb.field_g;
                    if ((var7 ^ -1) == -6) {
                        statePc = 845;
                    } else {
                        statePc = 837;
                    }
                    continue stateLoop;
                }
                case 837: {
                    if (var7 == 6) {
                        statePc = 845;
                    } else {
                        statePc = 840;
                    }
                    continue stateLoop;
                }
                case 840: {
                    if ((var7 ^ -1) == -9) {
                        statePc = 845;
                    } else {
                        statePc = 846;
                    }
                    continue stateLoop;
                }
                case 845: {
                    var7 = gh.field_Jb;
                    statePc = 846;
                    continue stateLoop;
                }
                case 846: {
                    q.a(22, var6 != 0, -1, var7);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 847;
                    }
                    continue stateLoop;
                }
                case 847: {
                    if (this.field_g.c(0)) {
                        statePc = 852;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 852: {
                    if (dm.field_c) {
                        statePc = 855;
                    } else {
                        statePc = 853;
                    }
                    continue stateLoop;
                }
                case 853: {
                    stackIn_856_0 = 1;
                    statePc = 856;
                    continue stateLoop;
                }
                case 855: {
                    stackIn_856_0 = 0;
                    statePc = 856;
                    continue stateLoop;
                }
                case 856: {
                    dm.field_c = stackIn_856_0 != 0;
                    gd.field_sb = null;
                    stackIn_859_0 = ti.field_A;
                    stackIn_857_0 = stackIn_859_0;
                    stackIn_859_1 = 42;
                    stackIn_857_1 = stackIn_859_1;
                    if (!dm.field_c) {
                        statePc = 859;
                    } else {
                        statePc = 857;
                    }
                    continue stateLoop;
                }
                case 857: {
                    stackIn_860_0 = (String[]) ((Object) stackIn_857_0);
                    stackIn_860_1 = stackIn_857_1;
                    stackIn_860_2 = qm.field_c;
                    statePc = 860;
                    continue stateLoop;
                }
                case 859: {
                    stackIn_860_0 = (String[]) ((Object) stackIn_859_0);
                    stackIn_860_1 = stackIn_859_1;
                    stackIn_860_2 = od.field_j;
                    statePc = 860;
                    continue stateLoop;
                }
                case 860: {
                    stackIn_860_0[stackIn_860_1] = stackIn_860_2;
                    if (ni.b(81)) {
                        statePc = 926;
                    } else {
                        statePc = 861;
                    }
                    continue stateLoop;
                }
                case 861: {
                    um.f((byte) 3);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 864;
                    }
                    continue stateLoop;
                }
                case 864: {
                    if (!this.a(125, param1)) {
                        statePc = 884;
                    } else {
                        statePc = 867;
                    }
                    continue stateLoop;
                }
                case 867: {
                    if (!this.field_g.c(0)) {
                        statePc = 884;
                    } else {
                        statePc = 870;
                    }
                    continue stateLoop;
                }
                case 870: {
                    if (ui.field_G) {
                        statePc = 875;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 873: {
                    stackIn_876_0 = 1;
                    statePc = 876;
                    continue stateLoop;
                }
                case 875: {
                    stackIn_876_0 = 0;
                    statePc = 876;
                    continue stateLoop;
                }
                case 876: {
                    ui.field_G = stackIn_876_0 != 0;
                    stackIn_879_0 = ti.field_A;
                    stackIn_877_0 = stackIn_879_0;
                    stackIn_879_1 = 43;
                    stackIn_877_1 = stackIn_879_1;
                    if (!ui.field_G) {
                        statePc = 879;
                    } else {
                        statePc = 877;
                    }
                    continue stateLoop;
                }
                case 877: {
                    stackIn_880_0 = (String[]) ((Object) stackIn_877_0);
                    stackIn_880_1 = stackIn_877_1;
                    stackIn_880_2 = tm.field_f;
                    statePc = 880;
                    continue stateLoop;
                }
                case 879: {
                    stackIn_880_0 = (String[]) ((Object) stackIn_879_0);
                    stackIn_880_1 = stackIn_879_1;
                    stackIn_880_2 = fj.field_i;
                    statePc = 880;
                    continue stateLoop;
                }
                case 880: {
                    stackIn_880_0[stackIn_880_1] = stackIn_880_2;
                    if (ni.b(45)) {
                        statePc = 926;
                    } else {
                        statePc = 881;
                    }
                    continue stateLoop;
                }
                case 881: {
                    um.f((byte) 3);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 884;
                    }
                    continue stateLoop;
                }
                case 884: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 885;
                    }
                    continue stateLoop;
                }
                case 885: {
                    if (!this.a(125, param1)) {
                        statePc = 905;
                    } else {
                        statePc = 888;
                    }
                    continue stateLoop;
                }
                case 888: {
                    if (!this.field_g.c(0)) {
                        statePc = 905;
                    } else {
                        statePc = 891;
                    }
                    continue stateLoop;
                }
                case 891: {
                    if (ik.field_h) {
                        statePc = 896;
                    } else {
                        statePc = 894;
                    }
                    continue stateLoop;
                }
                case 894: {
                    stackIn_897_0 = 1;
                    statePc = 897;
                    continue stateLoop;
                }
                case 896: {
                    stackIn_897_0 = 0;
                    statePc = 897;
                    continue stateLoop;
                }
                case 897: {
                    ik.field_h = stackIn_897_0 != 0;
                    stackIn_900_0 = ti.field_A;
                    stackIn_898_0 = stackIn_900_0;
                    stackIn_900_1 = 44;
                    stackIn_898_1 = stackIn_900_1;
                    if (!ik.field_h) {
                        statePc = 900;
                    } else {
                        statePc = 898;
                    }
                    continue stateLoop;
                }
                case 898: {
                    stackIn_901_0 = (String[]) ((Object) stackIn_898_0);
                    stackIn_901_1 = stackIn_898_1;
                    stackIn_901_2 = o.field_a;
                    statePc = 901;
                    continue stateLoop;
                }
                case 900: {
                    stackIn_901_0 = (String[]) ((Object) stackIn_900_0);
                    stackIn_901_1 = stackIn_900_1;
                    stackIn_901_2 = sa.field_b;
                    statePc = 901;
                    continue stateLoop;
                }
                case 901: {
                    stackIn_901_0[stackIn_901_1] = stackIn_901_2;
                    if (ni.b(12)) {
                        statePc = 926;
                    } else {
                        statePc = 902;
                    }
                    continue stateLoop;
                }
                case 902: {
                    um.f((byte) 3);
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 905;
                    }
                    continue stateLoop;
                }
                case 905: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 906;
                    }
                    continue stateLoop;
                }
                case 906: {
                    if (!this.a(127, param1)) {
                        statePc = 912;
                    } else {
                        statePc = 909;
                    }
                    continue stateLoop;
                }
                case 909: {
                    if (this.field_g.c(0)) {
                        statePc = 913;
                    } else {
                        statePc = 912;
                    }
                    continue stateLoop;
                }
                case 912: {
                    var4_int = 0;
                    if (var10 == 0) {
                        statePc = 926;
                    } else {
                        statePc = 913;
                    }
                    continue stateLoop;
                }
                case 913: {
                    gd.field_sb = null;
                    if (tj.field_a) {
                        statePc = 918;
                    } else {
                        statePc = 916;
                    }
                    continue stateLoop;
                }
                case 916: {
                    stackIn_919_0 = 1;
                    statePc = 919;
                    continue stateLoop;
                }
                case 918: {
                    stackIn_919_0 = 0;
                    statePc = 919;
                    continue stateLoop;
                }
                case 919: {
                    tj.field_a = stackIn_919_0 != 0;
                    stackIn_922_0 = ti.field_A;
                    stackIn_920_0 = stackIn_922_0;
                    stackIn_922_1 = 47;
                    stackIn_920_1 = stackIn_922_1;
                    if (!tj.field_a) {
                        statePc = 922;
                    } else {
                        statePc = 920;
                    }
                    continue stateLoop;
                }
                case 920: {
                    stackIn_923_0 = (String[]) ((Object) stackIn_920_0);
                    stackIn_923_1 = stackIn_920_1;
                    stackIn_923_2 = qj.field_u;
                    statePc = 923;
                    continue stateLoop;
                }
                case 922: {
                    stackIn_923_0 = (String[]) ((Object) stackIn_922_0);
                    stackIn_923_1 = stackIn_922_1;
                    stackIn_923_2 = he.field_d;
                    statePc = 923;
                    continue stateLoop;
                }
                case 923: {
                    stackIn_923_0[stackIn_923_1] = stackIn_923_2;
                    if (ni.b(75)) {
                        statePc = 926;
                    } else {
                        statePc = 924;
                    }
                    continue stateLoop;
                }
                case 924: {
                    um.f((byte) 3);
                    statePc = 926;
                    continue stateLoop;
                }
                case 926: {
                    if (var4_int == 0) {
                        statePc = 931;
                    } else {
                        statePc = 927;
                    }
                    continue stateLoop;
                }
                case 927: {
                    ee.c(-2483, 95);
                    statePc = 931;
                    continue stateLoop;
                }
                case 931: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = -1;
              if (param0 == -120) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var3 = ei.field_q;
                      if (96 != var3) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          var2_int = this.b((byte) -20);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (-98 != (var3 ^ -1)) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if ((var3 ^ -1) != -100) {
                        break L8;
                      } else {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (-99 == (var3 ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  var2_int = this.f((byte) 32);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                var2_int = this.g(param0 + 83);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var2_int = this.d(-119);
              break L2;
            }
            if ((var2_int ^ -1) != 0) {
              this.field_g.a(param0 ^ -120, var2_int);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L9: {
                L10: {
                  if (7 == pm.field_T) {
                    break L10;
                  } else {
                    L11: {
                      if (5 != pm.field_T) {
                        break L11;
                      } else {
                        if (ni.b(param0 ^ -100)) {
                          break L11;
                        } else {
                          this.l(-1);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      if (6 != pm.field_T) {
                        break L12;
                      } else {
                        if (ni.b(86)) {
                          break L12;
                        } else {
                          this.c((byte) 116);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      if ((pm.field_T ^ -1) == -15) {
                        break L13;
                      } else {
                        L14: {
                          if (pm.field_T == 13) {
                            break L14;
                          } else {
                            L15: {
                              if (16 == pm.field_T) {
                                break L15;
                              } else {
                                L16: {
                                  if (0 != pm.field_T) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (-1 < (this.field_g.field_e ^ -1)) {
                                        break L17;
                                      } else {
                                        if (uc.field_e[pm.field_T].length <= this.field_g.field_e) {
                                          break L17;
                                        } else {
                                          if (uc.field_e[pm.field_T][this.field_g.field_e] == 34) {
                                            break L17;
                                          } else {
                                            dh.field_F = this.field_g.field_e;
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      L19: {
                                        if (ei.field_q != 96) {
                                          break L19;
                                        } else {
                                          if (0 < rd.field_b) {
                                            break L19;
                                          } else {
                                            var3 = 0;
                                            L20: while (true) {
                                              if (uc.field_e[pm.field_T].length <= var3) {
                                                break L19;
                                              } else {
                                                stackIn_90_0 = -35;

                                                stackIn_90_1 = uc.field_e[pm.field_T][var3] ^ -1;

                                                if (var4 != 0) {
                                                  break L18;
                                                } else {
                                                  if (stackIn_90_0 != stackIn_90_1) {
                                                    var3++;
                                                    if (var4 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L19;
                                                    }
                                                  } else {
                                                    dh.field_F = this.field_g.field_e;
                                                    this.field_g.field_e = var3;
                                                    decompiledRegionSelector0 = 1;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackIn_90_0 = ei.field_q;
                                      stackIn_90_1 = 97;
                                      break L18;
                                    }
                                    L21: {
                                      if (stackIn_90_0 != stackIn_90_1) {
                                        break L21;
                                      } else {
                                        var3 = this.field_g.field_e;
                                        if ((var3 ^ -1) > -1) {
                                          break L21;
                                        } else {
                                          if (var3 >= uc.field_e[pm.field_T].length) {
                                            break L21;
                                          } else {
                                            if (34 == uc.field_e[pm.field_T][var3]) {
                                              this.field_g.field_e = dh.field_F;
                                              decompiledRegionSelector0 = 2;
                                              break L0;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.field_g.a(true);
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                this.field_g.a(true);
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            this.q(param0 + -30628);
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.k(-112);
                        if (var4 == 0) {
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.b(16383);
                    if (var4 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                this.e((byte) -108);
                break L9;
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(String param0, int param1) {
        try {
            System.out.println("Error: " + ee.a("%0a", param0, "\n", param1 ^ -29743));
            if (param1 != -29771) {
                field_e = -33;
            }
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    private final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                this.a((byte) -79);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-2 == (this.field_c ^ -1)) {
                  break L3;
                } else {
                  if (2 == this.field_c) {
                    break L3;
                  } else {
                    if ((this.field_c ^ -1) == -4) {
                      break L3;
                    } else {
                      if (-5 == (this.field_c ^ -1)) {
                        break L3;
                      } else {
                        if ((this.field_c ^ -1) != -23) {
                          stackIn_19_0 = 0;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_19_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.E(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void j(int param0) {
        u var3 = null;
        String var4 = null;
        try {
            int var2_int = 73 % ((param0 - -34) / 34);
            var3 = pl.field_U;
            var4 = lb.field_hc;
            ((mi) ((Object) var3)).a(var4, 320, 240, 1021128, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.OA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        if (!(null != va.field_c)) {
            return;
        }
        try {
            va.field_c.d(-1);
            if (param0 != 7165) {
                this.h(-118);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.B(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 < -55) {
              L1: {
                L2: {
                  pb.h(40, 80, 560, 330, 3487029);
                  pb.h(41, 81, 558, 328, 3487029);
                  if (!ni.b(25)) {
                    break L2;
                  } else {
                    this.j(60);
                    if (SteelSentinels.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.j((byte) 127);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.HA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (gd.field_sb != null) {
                L2: {
                  L3: {
                    if (!dm.field_c) {
                      break L3;
                    } else {
                      ff.field_lb.a(lc.field_a, pg.field_w);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ff.field_lb.a(ub.field_a, pg.field_w);
                  break L2;
                }
                L4: {
                  if (od.field_e) {
                    break L4;
                  } else {
                    if ((pm.field_U ^ -1) != -1) {
                      break L4;
                    } else {
                      pb.a(jj.field_a.field_Rb, jj.field_a.field_cb, jj.field_a.field_zb, jj.field_a.field_Lb, 0);
                      jj.field_a.a(true, (byte) 127);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                gd.field_sb.a(true, (byte) 126);
                ff.field_lb.a(jc.field_c, bb.field_X);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = -33 % ((-71 - param0) / 55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.BB(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int[] stackIn_30_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (-2 != (lb.field_gc ^ -1)) {
                  break L2;
                } else {
                  if (-1 <= (q.field_i ^ -1)) {
                    break L2;
                  } else {
                    if ((hd.field_i ^ -1) <= (dh.field_C.length - 1 ^ -1)) {
                      break L2;
                    } else {
                      ee.c(-2483, 95);
                      hd.field_i = hd.field_i + 1;
                      in.field_k = -1;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (lb.field_gc != 1) {
                break L1;
              } else {
                if (-1 >= (q.field_i ^ -1)) {
                  break L1;
                } else {
                  if (0 < hd.field_i) {
                    ee.c(-2483, 95);
                    in.field_k = -1;
                    hd.field_i = hd.field_i - 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                this.field_g = (rm) null;
                break L3;
              }
            }
            L4: {
              vn.field_o = 4;
              if (param1) {
                stackIn_30_0 = ce.field_t;
                break L4;
              } else {
                stackIn_30_0 = ge.field_m;
                break L4;
              }
            }
            L5: {
              var3 = stackIn_30_0;
              if (0 > ao.field_C) {
                break L5;
              } else {
                if (!ol.a(var3, ao.field_C, 31)) {
                  break L5;
                } else {
                  if (!ve.a(ao.field_A, 1, ao.field_C)) {
                    break L5;
                  } else {
                    ao.field_C = -1;
                    break L5;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (-2 == (lb.field_gc ^ -1)) {
                  break L7;
                } else {
                  if (ao.field_C < 0) {
                    break L6;
                  } else {
                    if ((ao.field_C ^ -1) == (un.field_i ^ -1)) {
                      break L6;
                    } else {
                      if (ao.field_C != in.field_k) {
                        ee.c(-2483, 97);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L8: {
                if (0 == (ao.field_C ^ -1)) {
                  break L8;
                } else {
                  ee.c(-2483, 0);
                  break L8;
                }
              }
              L9: {
                if ((ao.field_C ^ -1) != (in.field_k ^ -1)) {
                  break L9;
                } else {
                  in.field_k = -1;
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L9;
                  }
                }
              }
              if (-1 != ao.field_C) {
                in.field_k = ao.field_C;
                break L6;
              } else {
                break L6;
              }
            }
            un.field_i = ao.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ji.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_14_0 = 0;
        String stackIn_40_0 = null;
        u stackIn_179_0 = null;
        int stackIn_233_0 = 0;
        wk[] stackIn_275_0 = null;
        int stackIn_279_0 = 0;
        wk stackIn_351_0 = null;
        int stackIn_351_1 = 0;
        int stackIn_351_2 = 0;
        wk stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        int stackIn_352_2 = 0;
        int stackIn_352_3 = 0;
        wk stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        int stackIn_355_2 = 0;
        wk stackIn_356_0;
        int stackIn_356_1;
        int stackIn_356_2;
        int stackIn_356_3;
        int stackIn_367_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        u var10 = null;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        wk[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = uc.field_e[this.field_c][param0];
                var5 = 0;
                var6 = 0;
                if (1 == var4_int) {
                  break L2;
                } else {
                  if (-34 == (var4_int ^ -1)) {
                    break L2;
                  } else {
                    if (39 != var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (ib.a(param2 ^ -30230)) {
                  stackIn_14_0 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = 1;
                  break L3;
                }
              }
              var6 = stackIn_14_0;
              break L1;
            }
            L4: {
              if (var4_int != 28) {
                break L4;
              } else {
                if (!gi.h((byte) -72)) {
                  break L4;
                } else {
                  if (0 == (32 & a.field_c)) {
                    break L4;
                  } else {
                    var5 = 13548069;
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (var6 != 0) {
                break L5;
              } else {
                if (var4_int != 0) {
                  break L5;
                } else {
                  if (!vb.b(106)) {
                    if (-1 == (a.field_c & 32 ^ -1)) {
                      var5 = 13696896;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (-1 < (var4_int ^ -1)) {
                stackIn_40_0 = null;
                break L6;
              } else {
                stackIn_40_0 = ti.field_A[var4_int];
                break L6;
              }
            }
            var7 = stackIn_40_0;
            var8 = 0;
            if (param2 == 30241) {
              L7: {
                L8: {
                  var9 = di.field_g;
                  if ((var9 ^ -1) == -1) {
                    break L8;
                  } else {
                    if ((var9 ^ -1) == -2) {
                      break L8;
                    } else {
                      if (var9 == 7) {
                        break L8;
                      } else {
                        L9: {
                          if (-4 != (var9 ^ -1)) {
                            break L9;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (5 != var9) {
                            break L10;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var9 != 9) {
                            break L11;
                          } else {
                            if (var24 == 0) {
                              break L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (-11 != (var9 ^ -1)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                var8 = 1;
                break L7;
              }
              L12: {
                L13: {
                  if ((var4_int ^ -1) != -10) {
                    break L13;
                  } else {
                    if (var8 == 0) {
                      break L13;
                    } else {
                      var7 = ec.field_f;
                      if (var24 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                if (-10 != (var4_int ^ -1)) {
                  break L12;
                } else {
                  if ((di.field_g ^ -1) == -5) {
                    var7 = lb.field_fc;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (var6 == 0) {
                  break L14;
                } else {
                  var7 = var7 + " " + (33 * al.field_g / ua.field_r - -(33 * cb.field_l)) + "%";
                  break L14;
                }
              }
              L15: {
                if (var4_int != 8) {
                  break L15;
                } else {
                  L16: {
                    if (gh.field_Jb == 0) {
                      break L16;
                    } else {
                      if (vb.field_g == 0) {
                        break L16;
                      } else {
                        if (gh.field_Jb == 12) {
                          break L16;
                        } else {
                          if (-13 == (vb.field_g ^ -1)) {
                            break L16;
                          } else {
                            L17: {
                              L18: {
                                if (-2 == (gh.field_Jb ^ -1)) {
                                  break L18;
                                } else {
                                  if (vb.field_g != 1) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var7 = un.field_d;
                              if (var24 == 0) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                            L19: {
                              if (gh.field_Jb == 2) {
                                break L19;
                              } else {
                                if (2 == vb.field_g) {
                                  break L19;
                                } else {
                                  if (3 == gh.field_Jb) {
                                    break L19;
                                  } else {
                                    if (vb.field_g == 3) {
                                      break L19;
                                    } else {
                                      if (4 == gh.field_Jb) {
                                        break L19;
                                      } else {
                                        if (4 != vb.field_g) {
                                          break L15;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var7 = fb.field_k;
                            if (var24 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  var7 = ti.field_A[7];
                  break L15;
                }
              }
              L20: {
                var9 = -1;
                if (-39 == (var4_int ^ -1)) {
                  L21: {
                    var7 = oe.field_j;
                    var10_int = param0 / 10;
                    var11 = param0 % 10;
                    var12_ref = null;
                    var13_ref_String = "0f94c8";
                    var14_ref_String = var13_ref_String;
                    var15 = 0;
                    var16 = -1;
                    var5 = 0;
                    if (var11 < fm.field_f[var10_int]) {
                      L22: {
                        L23: {
                          var17 = var10_int;
                          if ((var17 ^ -1) != -1) {
                            break L23;
                          } else {
                            if (var24 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (1 == var17) {
                          var12_ref = qa.a(-1, jh.field_a[var11]);
                          var16 = ed.field_c[1][var11];
                          var15 = jh.field_a[var11];
                          break L21;
                        } else {
                          if ((var17 ^ -1) != -3) {
                            break L21;
                          } else {
                            if (var24 == 0) {
                              var12_ref = qa.a(param2 ^ -30242, jh.field_a[10 + var11]);
                              var15 = jh.field_a[var11 - -10];
                              var16 = ed.field_c[2][var11];
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      var12_ref = gh.field_jb[5];
                      break L21;
                    } else {
                      if (this.b(false, var10_int, var11)) {
                        var14_ref_String = "8fdfff";
                        var12_ref = gh.field_jb[6];
                        break L21;
                      } else {
                        var14_ref_String = "194761";
                        var12_ref = gh.field_jb[4];
                        break L21;
                      }
                    }
                  }
                  L24: {
                    if (!param1) {
                      break L24;
                    } else {
                      var13_ref_String = "000000";
                      var14_ref_String = var13_ref_String;
                      break L24;
                    }
                  }
                  L25: {
                    var7 = db.a(var7, -27, new String[]{Integer.toString(var11 + 1), (String) (var12_ref), var13_ref_String, var14_ref_String});
                    if (-1 != var16) {
                      L26: {
                        if (var15 > var16) {
                          break L26;
                        } else {
                          var9 = 8;
                          if (var24 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      if ((3 * var16 / 2 ^ -1) > (var15 ^ -1)) {
                        break L25;
                      } else {
                        var9 = 25;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  if (!param1) {
                    break L20;
                  } else {
                    if (var11 > fm.field_f[var10_int]) {
                      break L20;
                    } else {
                      var9 = -1;
                      var7 = um.field_cb[var11 + var10_int * 10];
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              L27: {
                var7 = ke.a(42, var7);
                var10 = pl.field_U;
                var11 = 0;
                if (-1 != (this.field_c ^ -1)) {
                  break L27;
                } else {
                  var10 = ui.field_U;
                  break L27;
                }
              }
              L28: {
                if (-40 == (var4_int ^ -1)) {
                  L29: {
                    var11 = 1;
                    if (var6 == 0) {
                      stackIn_179_0 = ui.field_U;
                      break L29;
                    } else {
                      stackIn_179_0 = pl.field_U;
                      break L29;
                    }
                  }
                  var10 = stackIn_179_0;
                  break L28;
                } else {
                  break L28;
                }
              }
              L30: {
                L31: {
                  var12 = ((mi) ((Object) var10)).c(var7);
                  var13 = this.g(127, param0);
                  var14 = this.a(param0, (byte) 109);
                  var15 = this.b(param0, (byte) 27);
                  if (-21 == (var4_int ^ -1)) {
                    break L31;
                  } else {
                    if (var4_int == 21) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                var12 = 170 + le.field_K;
                break L30;
              }
              L32: {
                var16 = var14 - (-var13 - -var12) >> 1590460993;
                var17 = this.c(25, param0);
                var18 = var14 - var13;
                var19 = this.c(25, param0);
                var20 = ag.field_o;
                if (!param1) {
                  break L32;
                } else {
                  var20 = vk.field_l;
                  break L32;
                }
              }
              L33: {
                L34: {
                  L35: {
                    if (-15 != (var4_int ^ -1)) {
                      break L35;
                    } else {
                      if (-1 == (d.field_R ^ -1)) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (-16 != (var4_int ^ -1)) {
                      break L36;
                    } else {
                      if (1 == d.field_R) {
                        break L34;
                      } else {
                        break L36;
                      }
                    }
                  }
                  L37: {
                    if (var4_int != 16) {
                      break L37;
                    } else {
                      if (-1 == (d.field_R ^ -1)) {
                        break L34;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: {
                    if (var4_int != 17) {
                      break L38;
                    } else {
                      if (on.field_j == 0) {
                        break L34;
                      } else {
                        break L38;
                      }
                    }
                  }
                  if (-19 != (var4_int ^ -1)) {
                    break L33;
                  } else {
                    if (on.field_j != 1) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                var20 = ja.field_e;
                break L33;
              }
              L39: {
                L40: {
                  var20 = pl.field_T;
                  if (-39 == (var4_int ^ -1)) {
                    break L40;
                  } else {
                    if ((var4_int ^ -1) == -26) {
                      break L40;
                    } else {
                      if (var4_int == 26) {
                        break L40;
                      } else {
                        if (var4_int != 39) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                }
                var20 = sa.field_e;
                break L39;
              }
              L41: {
                if (param1) {
                  stackIn_233_0 = 1044724;
                  break L41;
                } else {
                  stackIn_233_0 = 1021128;
                  break L41;
                }
              }
              L42: {
                L43: {
                  var21 = stackIn_233_0;
                  if (-39 == (var4_int ^ -1)) {
                    break L43;
                  } else {
                    if (25 == var4_int) {
                      break L43;
                    } else {
                      if ((var4_int ^ -1) != -27) {
                        break L42;
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                if (!this.a(param2 + -30122, param0)) {
                  break L42;
                } else {
                  if (!param1) {
                    break L42;
                  } else {
                    var20 = wc.field_d;
                    var21 = 0;
                    break L42;
                  }
                }
              }
              L44: {
                L45: {
                  if (this.a(-2)) {
                    break L45;
                  } else {
                    L46: {
                      if ((this.field_c ^ -1) != -18) {
                        break L46;
                      } else {
                        if (0 > this.b(-125, param0)) {
                          break L45;
                        } else {
                          break L46;
                        }
                      }
                    }
                    if ((var4_int ^ -1) == -40) {
                      break L45;
                    } else {
                      L47: {
                        if (-6 != (this.field_c ^ -1)) {
                          break L47;
                        } else {
                          if ((this.b(-73, param0) ^ -1) > -1) {
                            break L45;
                          } else {
                            break L47;
                          }
                        }
                      }
                      if ((this.field_c ^ -1) != -7) {
                        break L44;
                      } else {
                        if (-1 >= (this.b(-81, param0) ^ -1)) {
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                }
                L48: {
                  if (param1) {
                    stackIn_275_0 = wc.field_d;
                    break L48;
                  } else {
                    stackIn_275_0 = hk.field_Tb;
                    break L48;
                  }
                }
                L49: {
                  var20 = stackIn_275_0;
                  if (param1) {
                    stackIn_279_0 = 0;
                    break L49;
                  } else {
                    stackIn_279_0 = 1146810;
                    break L49;
                  }
                }
                var21 = stackIn_279_0;
                break L44;
              }
              L50: {
                if (var5 == 0) {
                  break L50;
                } else {
                  var21 = var5;
                  if (!param1) {
                    break L50;
                  } else {
                    var21 = var21 | 8978312;
                    break L50;
                  }
                }
              }
              L51: {
                L52: {
                  L53: {
                    if (var4_int == 20) {
                      break L53;
                    } else {
                      if ((var4_int ^ -1) != -22) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  jm.a(var15, var19, var20, 1, -3 + le.field_K + var13, 176);
                  if (var24 == 0) {
                    break L51;
                  } else {
                    break L52;
                  }
                }
                jm.a(var15, var19, var20, 1, var13, var18);
                break L51;
              }
              L54: {
                if (this.a(param2 ^ 30292, param0)) {
                  break L54;
                } else {
                  var21 = 7829367;
                  if (!param1) {
                    break L54;
                  } else {
                    if (25 == var4_int) {
                      break L54;
                    } else {
                      if ((var4_int ^ -1) == -27) {
                        break L54;
                      } else {
                        var21 = 11184895;
                        break L54;
                      }
                    }
                  }
                }
              }
              L55: {
                L56: {
                  if (25 != var4_int) {
                    break L56;
                  } else {
                    L57: {
                      var22 = var13 + (-el.field_Ub.field_A + (var14 + -var13)) / 2;
                      var23 = var15 + (-el.field_Ub.field_F + var19) / 2;
                      var7 = "";
                      if (var21 != 1021128) {
                        break L57;
                      } else {
                        var21 = 2061990;
                        break L57;
                      }
                    }
                    L58: {
                      if ((var21 ^ -1) == -7829368) {
                        var21 = 930889;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    el.field_Ub.c(var22, var23, var21);
                    if (var24 == 0) {
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                L59: {
                  if ((var4_int ^ -1) != -27) {
                    break L59;
                  } else {
                    L60: {
                      var22 = (var14 + -var13 + -gm.field_b.field_A) / 2 + var13;
                      if (1021128 != var21) {
                        break L60;
                      } else {
                        var21 = 2061990;
                        break L60;
                      }
                    }
                    L61: {
                      var23 = var15 - -((var19 - gm.field_b.field_F) / 2);
                      var7 = "";
                      if (-7829368 != (var21 ^ -1)) {
                        break L61;
                      } else {
                        var21 = 930889;
                        break L61;
                      }
                    }
                    gm.field_b.c(var22, var23, var21);
                    if (var24 == 0) {
                      break L55;
                    } else {
                      break L59;
                    }
                  }
                }
                L62: {
                  L63: {
                    if (-21 == (var4_int ^ -1)) {
                      break L63;
                    } else {
                      if (21 != var4_int) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  ((mi) ((Object) var10)).b(var7, 14 + var13, var17 / 5 + var15 + ((mi) ((Object) var10)).field_G, 1146810, -1);
                  if (var24 == 0) {
                    break L55;
                  } else {
                    break L62;
                  }
                }
                L64: {
                  L65: {
                    if ((var12 ^ -1) < (-var13 + var14 ^ -1)) {
                      break L65;
                    } else {
                      if (var11 == 0) {
                        break L64;
                      } else {
                        break L65;
                      }
                    }
                  }
                  L66: {
                    if (var6 != 0) {
                      var21 = 11417637;
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                  ((mi) ((Object) var10)).a(var7, var13, var15, var18, var17, var21, -1, 1, 1, 0);
                  if (var24 == 0) {
                    break L55;
                  } else {
                    break L64;
                  }
                }
                L67: {
                  if (var6 != 0) {
                    var21 = 11417637;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                ((mi) ((Object) var10)).b(var7, var16, ((mi) ((Object) var10)).field_G + (var15 + var17 / 5), var21, -1);
                if (var9 == -1) {
                  break L55;
                } else {
                  L68: {
                    pb.a(var13 + 2, 0, var14 + -2, 480);
                    stackIn_351_0 = pd.field_Z[var9];

                    stackIn_351_1 = var16 - -var12;

                    stackIn_351_2 = var15 - -2;

                    if (-9 != (var9 ^ -1)) {
                      stackIn_352_0 = (wk) ((Object) stackIn_351_0);
                      stackIn_352_1 = stackIn_351_1;
                      stackIn_352_2 = stackIn_351_2;
                      stackIn_352_3 = 150;
                      break L68;
                    } else {



                      stackIn_352_0 = (wk) ((Object) stackIn_351_0);
                      stackIn_352_1 = stackIn_351_1;
                      stackIn_352_2 = stackIn_351_2;
                      stackIn_352_3 = 192;
                      break L68;
                    }
                  }
                  L69: {
                    ((wk) (Object) stackIn_352_0).a(stackIn_352_1, stackIn_352_2, stackIn_352_3);
                    stackIn_355_0 = pd.field_Z[var9];

                    stackIn_355_1 = -28 + var16;

                    stackIn_355_2 = var15 - -2;

                    if (8 == var9) {
                      stackIn_356_0 = (wk) ((Object) stackIn_355_0);
                      stackIn_356_1 = stackIn_355_1;
                      stackIn_356_2 = stackIn_355_2;
                      stackIn_356_3 = 192;
                      break L69;
                    } else {
                      stackIn_356_0 = (wk) ((Object) stackIn_355_0);
                      stackIn_356_1 = stackIn_355_1;
                      stackIn_356_2 = stackIn_355_2;
                      stackIn_356_3 = 150;
                      break L69;
                    }
                  }
                  ((wk) (Object) stackIn_356_0).a(stackIn_356_1, stackIn_356_2, stackIn_356_3);
                  pb.c();
                  break L55;
                }
              }
              L70: {
                L71: {
                  if (-21 == (var4_int ^ -1)) {
                    break L71;
                  } else {
                    if (-22 == (var4_int ^ -1)) {
                      break L71;
                    } else {
                      break L70;
                    }
                  }
                }
                L72: {
                  var16 = var16 + le.field_K;
                  if (-21 != (var4_int ^ -1)) {
                    stackIn_367_0 = 170 * ll.field_q / 256;
                    break L72;
                  } else {
                    stackIn_367_0 = lb.field_ac * 170 / 256;
                    break L72;
                  }
                }
                var22 = stackIn_367_0;
                pb.a(-1 + (var22 + var16), 3 + var15, 170 + (-var22 - -1), -6 + var17, 0);
                break L70;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void q(int param0) {
        if (va.field_c == null) {
            return;
        }
        if (param0 != -30748) {
            return;
        }
        try {
            va.field_c.b(-12986);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.FB(" + param0 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        u var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var10 = pl.field_U;
              var11 = 1021128;
              var12 = param7 + (param4 + param6);
              if (-1 == (var12 ^ -1)) {
                break L1;
              } else {
                param6 = (var12 + param6 * 200) / (var12 * 2);
                param4 = (200 * param4 + var12) / (var12 * 2);
                param7 = (200 * param7 + var12) / (var12 * 2);
                break L1;
              }
            }
            L2: {
              if (!param3) {
                break L2;
              } else {
                var13_int = -11 + param2;
                var14 = 13;
                var15 = 0;
                L3: while (true) {
                  if (var15 >= oe.field_h.length + -1) {
                    break L2;
                  } else {
                    var16 = oe.field_h[var15];
                    var17 = oe.field_h[var15 + 1];
                    pb.a(var16 + 3, var13_int, var17 - (var16 + 5), var14, 12105);
                    var15++;
                    if (var18 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              var13 = param0;
              ((mi) ((Object) var10)).b(var13, 5 + oe.field_h[0], param2, var11, -1);
              var13 = Integer.toString(param5);
              ((mi) ((Object) var10)).c(var13, -1 + oe.field_h[2] - 5, param2, var11, -1);
              var13 = Integer.toString(var12);
              ((mi) ((Object) var10)).c(var13, oe.field_h[3] + -5 - 1, param2, var11, -1);
              var13 = param7 + "%";
              ((mi) ((Object) var10)).c(var13, -6 + oe.field_h[4], param2, var11, -1);
              var13 = param6 + "%";
              if (param8 <= -125) {
                break L4;
              } else {
                this.a(-34, false, -5);
                break L4;
              }
            }
            ((mi) ((Object) var10)).c(var13, -6 + oe.field_h[5], param2, var11, -1);
            var13 = param4 + "%";
            ((mi) ((Object) var10)).c(var13, oe.field_h[6] + -5 + -1, param2, var11, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ji.CB(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = ql.a(ce.field_t, 18286) ? 1 : 0;
              if (param0 > 63) {
                break L1;
              } else {
                this.field_k = -30;
                break L1;
              }
            }
            L2: {
              if (lc.field_c == null) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            var4 = na.field_v;
            var4 = var4 + " " + hk.a('#', "<br><br>", true, db.a(ag.a(var2_int != 0, true, var3 != 0, false), -48, new String[]{sn.field_h}));
            va.field_j.a(var4, 10, 70, 620, 180, 1021128, -1, 1, 0, 18);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ji.IA(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        u var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11_int = 0;
        String var11 = null;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 49) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = pl.field_U;
                        var3 = 1;
                        if (qi.field_d == null) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((qi.field_d.field_C ^ -1) != (var3 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qi.field_d = bf.a((byte) 122, 1, var3, 3, 10);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = d.field_R;
                        var5 = ib.a(lc.field_c, 7047, var4, qi.field_d);
                        if (null == lc.field_c) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((lc.field_c.field_y ^ -1) == (var3 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = 100;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (lc.field_c == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 <= var5) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (qi.field_d.field_q) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = lg.field_a;
                        if (var16 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null == qi.field_d.field_x) {
                            statePc = 56;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == qi.field_d.field_z) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = 1021128;
                        var9 = qi.field_d.field_x[var4];
                        var10 = qi.field_d.field_z[var4];
                        pb.h(48, 88, 544, 286, 1130327);
                        var11_int = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var11_int ^ -1) <= (nm.field_v.length ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_34_0 = nm.field_v[var11_int];
                        stackIn_30_0 = stackIn_34_0;
                        stackIn_34_1 = 88;
                        stackIn_30_1 = stackIn_34_1;
                        if (var16 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        pb.d(stackIn_30_0, stackIn_30_1, 265, 1130327);
                        var11_int++;
                        if (var16 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = (21 + ((mi) ((Object) var2)).field_G) / 2;
                        stackIn_34_1 = 88;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = stackIn_34_0 + stackIn_34_1;
                        ((mi) ((Object) var2)).b(k.field_Ib[0], nm.field_v[0] - -5, var7, var8, -1);
                        ((mi) ((Object) var2)).b(k.field_Ib[1], 5 + nm.field_v[1], var7, var8, -1);
                        ((mi) ((Object) var2)).c(k.field_Ib[2], -1 + nm.field_v[3] - 5, var7, var8, -1);
                        ((mi) ((Object) var2)).c(k.field_Ib[3], -5 + nm.field_v[4] + -1, var7, var8, -1);
                        pb.g(48, 109, 544, 1130327);
                        pb.g(48, 353, 544, 1130327);
                        var7 = 126;
                        var6 = im.field_d;
                        var11_int = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var11_int ^ -1) <= -11) {
                            statePc = 50;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var16 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == var9[var11_int]) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12_ref_String = var9[var11_int];
                        var8 = 1021128;
                        if (var5 == var11_int) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = 1044724;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var13 = uh.a(false, var10[var11_int], 12);
                        var14 = uh.a(false, ad.a(119, var10[var11_int], 12), 43);
                        var15 = ad.a(122, var10[var11_int], 516);
                        stackIn_47_0 = this;
                        stackIn_45_0 = stackIn_47_0;
                        if ((var5 ^ -1) != (var11_int ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = this;
                        stackIn_48_1 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = this;
                        stackIn_48_1 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.a(stackIn_48_1 != 0, false, var7, var14, var12_ref_String, var13, var15, 1 + var11_int);
                        var6 = k.field_Fb;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7 += 17;
                        var11_int++;
                        if (var16 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (lc.field_c == null) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1 >= (var5 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7 = 345;
                        var10 = lc.field_c.field_q;
                        var11 = g.field_l;
                        var12 = 0;
                        var13 = uh.a(false, var10[var12], 12);
                        var14 = uh.a(false, ad.a(126, var10[var12], 12), 43);
                        var15 = ad.a(113, var10[var12], 516);
                        this.a(true, false, var7, var14, var11, var13, var15, 0);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var16 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6 = dj.field_h;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var7 = 368;
                        pl.field_U.b(var6, 5 + nm.field_v[0], var7, 1130327, -1);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var2_ref), "ji.MA(" + param0 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_18_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var4_int = uc.field_e[this.field_c][param1];
              if (-1 == var4_int) {
                param2 = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = 0;
                if ((var4_int ^ -1) == -2) {
                  break L3;
                } else {
                  if (var4_int == 33) {
                    break L3;
                  } else {
                    if ((var4_int ^ -1) == -40) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (ib.a(-107)) {
                  stackIn_18_0 = 0;
                  break L4;
                } else {
                  stackIn_18_0 = 1;
                  break L4;
                }
              }
              var5 = stackIn_18_0;
              break L2;
            }
            L5: {
              L6: {
                var6 = -107 % ((-50 - param0) / 53);
                var7 = pl.field_T;
                var8 = this.g(127, param1);
                var9 = this.b(param1, (byte) 95);
                var10 = this.a(param1, (byte) 108) + -var8;
                var11 = this.c(25, param1);
                jm.a(var9, var11, var7, 1, var8, var10);
                if ((var4_int ^ -1) <= -1) {
                  break L6;
                } else {
                  ac.field_bb.a(3 + var8, 2 + var9);
                  if (var15 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var12 = ti.field_A[var4_int];
                if (8 == var4_int) {
                  L8: {
                    L9: {
                      if ((gh.field_Jb ^ -1) == -1) {
                        break L9;
                      } else {
                        if (-1 == (vb.field_g ^ -1)) {
                          break L9;
                        } else {
                          if (-13 == (gh.field_Jb ^ -1)) {
                            break L9;
                          } else {
                            if (12 != vb.field_g) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    var12 = ti.field_A[7];
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    L11: {
                      if (gh.field_Jb == 1) {
                        break L11;
                      } else {
                        if (-2 != (vb.field_g ^ -1)) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var12 = un.field_d;
                    if (var15 == 0) {
                      break L7;
                    } else {
                      break L10;
                    }
                  }
                  L12: {
                    if (gh.field_Jb == 2) {
                      break L12;
                    } else {
                      if (-3 == (vb.field_g ^ -1)) {
                        break L12;
                      } else {
                        if (-4 == (gh.field_Jb ^ -1)) {
                          break L12;
                        } else {
                          if (vb.field_g == 3) {
                            break L12;
                          } else {
                            if (4 == gh.field_Jb) {
                              break L12;
                            } else {
                              if ((vb.field_g ^ -1) == -5) {
                                break L12;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var12 = fb.field_k;
                  break L7;
                } else {
                  break L7;
                }
              }
              L13: {
                if (var4_int != 0) {
                  break L13;
                } else {
                  if (-21 == (this.field_c ^ -1)) {
                    var12 = fk.field_f;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                var12 = ke.a(42, var12);
                if (var5 != 0) {
                  var12 = var12 + " " + (al.field_g * 33 / ua.field_r + cb.field_l * 33) + "%";
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param2) {
                  stackIn_80_0 = 1044724;
                  break L15;
                } else {
                  stackIn_80_0 = 1021128;
                  break L15;
                }
              }
              L16: {
                var13 = stackIn_80_0;
                if (!this.a(119, param1)) {
                  L17: {
                    L18: {
                      if (!param2) {
                        break L18;
                      } else {
                        if ((var4_int ^ -1) == -27) {
                          break L18;
                        } else {
                          if (var4_int != 25) {
                            stackIn_93_0 = 11184895;
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    stackIn_93_0 = 7829367;
                    break L17;
                  }
                  var13 = stackIn_93_0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L19: {
                var14 = pl.field_U.c(var12);
                if (var5 == 0) {
                  break L19;
                } else {
                  var13 = 11417637;
                  break L19;
                }
              }
              L20: {
                if (var7[0] != null) {
                  var8 = var8 + var7[0].field_z;
                  var10 = var10 - 2 * var7[0].field_z;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                L22: {
                  if (var4_int == 33) {
                    break L22;
                  } else {
                    if (-41 != (var4_int ^ -1)) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                if (dc.field_g != 16) {
                  break L21;
                } else {
                  if (param2) {
                    break L21;
                  } else {
                    if (0 != (32 & a.field_c)) {
                      break L21;
                    } else {
                      var13 = 13696896;
                      break L21;
                    }
                  }
                }
              }
              L23: {
                if (var14 > var10) {
                  break L23;
                } else {
                  pl.field_U.a(var12, var8 - -(var10 / 2), var9 - -(var11 / 2) + 4, var13, -1);
                  if (var15 == 0) {
                    break L5;
                  } else {
                    break L23;
                  }
                }
              }
              pl.field_U.a(var12, var8, -pl.field_U.field_G + var11 / 2 + var9, var10, var11, var13, -1, 1, 0, 10);
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void n(int param0) {
        String stackIn_24_0 = null;
        wk[] stackIn_34_0 = null;
        wk[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        String stackIn_70_0 = null;
        int stackIn_75_0 = 0;
        fh stackIn_78_0;
        String stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_78_5;
        int stackIn_78_6;
        int stackIn_78_7;
        int stackIn_78_8;
        int stackIn_78_9;
        fh stackIn_79_0 = null;
        String stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        int stackIn_79_6 = 0;
        int stackIn_79_7 = 0;
        int stackIn_79_8 = 0;
        int stackIn_79_9 = 0;
        int stackIn_79_10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wk var17_ref_wk = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var24_ref_String = null;
        int var25_int = 0;
        wk[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        wk var28 = null;
        int var29 = 0;
        var29 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.b(0, (byte) 29);
                var3 = this.g(126, 0);
                var4 = this.a(1, (byte) 114);
                var5 = this.b(2, (byte) -103) - -this.c(25, 2);
                var2_int -= 8;
                var3 -= 8;
                var4 += 8;
                var5 += 8;
                pb.h(var3, var2_int, -var3 + var4, -var2_int + var5, 6316128);
                var6 = this.a(0, (byte) 108) - -4;
                var7 = -var6 + (-4 + this.g(127, 1));
                var8 = this.b(0, (byte) -125);
                var9 = this.c(25, 0);
                var10 = 1064792;
                var11 = gh.field_jb[0];
                if (ol.field_Ub < fm.field_f[ge.field_j]) {
                  break L2;
                } else {
                  if (this.b(false, ge.field_j, ol.field_Ub)) {
                    var11 = gh.field_jb[3];
                    if (var29 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                L4: {
                  var12_int = ge.field_j;
                  if (0 == var12_int) {
                    var11 = gh.field_jb[1];
                    if (var29 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  } else {
                    if ((var12_int ^ -1) == -2) {
                      break L4;
                    } else {
                      if ((var12_int ^ -1) == -3) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var11 = db.a(gh.field_jb[2], -45, new String[]{qa.a(param0 ^ -21346, jh.field_a[ol.field_Ub])});
                if (var29 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              var11 = db.a(gh.field_jb[2], -84, new String[]{qa.a(param0 ^ -21346, jh.field_a[10 + ol.field_Ub])});
              break L1;
            }
            L5: {
              if ((ge.field_j ^ -1) != -1) {
                stackIn_24_0 = v.field_f;
                break L5;
              } else {
                stackIn_24_0 = ul.field_h;
                break L5;
              }
            }
            L6: {
              var12 = db.a(stackIn_24_0, -88, new String[]{Integer.toString(ol.field_Ub + 1), var11});
              pl.field_U.a(var12, var7 / 2 + var6, var8 - -16, 1021128, -1);
              if (0 >= ge.field_j) {
                break L6;
              } else {
                if ((ol.field_Ub ^ -1) > (fm.field_f[ge.field_j] ^ -1)) {
                  var13 = ed.field_c[ge.field_j][ol.field_Ub];
                  var14 = 3 * var13 / 2;
                  var15 = jh.field_a[(-1 + ge.field_j) * 10 - -ol.field_Ub];
                  if ((var14 ^ -1) > (var15 ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      var16 = 20 + pl.field_U.c(var12) / 2;
                      stackIn_34_0 = pd.field_Z;

                      if (var13 >= var15) {
                        stackIn_35_0 = (wk[]) ((Object) stackIn_34_0);
                        stackIn_35_1 = 8;
                        break L7;
                      } else {
                        stackIn_35_0 = (wk[]) ((Object) stackIn_34_0);
                        stackIn_35_1 = 25;
                        break L7;
                      }
                    }
                    L8: {
                      var17_ref_wk = stackIn_35_0[stackIn_35_1];
                      if (var15 > var13) {
                        stackIn_39_0 = 150;
                        break L8;
                      } else {
                        stackIn_39_0 = 192;
                        break L8;
                      }
                    }
                    var18 = stackIn_39_0;
                    var19 = var7 / 2 + var6;
                    var20 = var8 + 2;
                    var17_ref_wk.a(var19 - -var16, var20, var18);
                    var17_ref_wk.a(-var16 + (var19 - var17_ref_wk.field_z), var20, var18);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
            }
            var3 += 8;
            var2_int = 6 + (var8 - -var9);
            var4 -= 8;
            pb.h(var6, var8, var7, var9, var10);
            var5 = -8 + this.b(2, (byte) -109);
            pb.h(var3, var2_int, var4 + -var3, -var2_int + var5, 2061990);
            var13 = 100;
            var14 = 110;
            var15 = var2_int + 20;
            var16 = 10 + var3;
            pb.h(var16, var15, var13, var14, var10);
            var17 = var13 + var16 + 10;
            if (param0 == 21345) {
              var18 = var15 - 10;
              var19 = var4 - 10 - var17;
              var20 = -var18 + var5;
              var21 = 0;
              var22 = n.field_z;
              var23 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var22.length <= var23) {
                      break L11;
                    } else {
                      var24 = var22[var23];
                      var25_int = nl.a(var24, param0 ^ 21371);
                      stackIn_55_0 = 0;

                      stackIn_55_1 = var25_int;

                      if (var29 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (stackIn_55_0 > stackIn_55_1) {
                            break L12;
                          } else {
                            if ((fm.field_f[var25_int / 10] ^ -1) >= (var25_int % 10 ^ -1)) {
                              break L12;
                            } else {
                              var21++;
                              break L12;
                            }
                          }
                        }
                        var23++;
                        if (var29 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  stackIn_55_0 = fm.field_f[2];
                  stackIn_55_1 = 10;
                  break L10;
                }
                L13: {
                  if (stackIn_55_0 != stackIn_55_1) {
                    break L13;
                  } else {
                    var21++;
                    break L13;
                  }
                }
                L14: {
                  if (!ba.a((byte) -57)) {
                    break L14;
                  } else {
                    var21++;
                    break L14;
                  }
                }
                L15: {
                  var22_ref = db.a(c.field_s[10 * ge.field_j - -ol.field_Ub], param0 ^ -21265, new String[]{qf.field_a[var21], id.a(qf.field_a[var21], 0)});
                  var23 = this.a((byte) -128, ol.field_Ub, ge.field_j);
                  if ((15 & fm.field_f[0]) >= var23) {
                    break L15;
                  } else {
                    if ((fm.field_f[ge.field_j] ^ -1) >= (ol.field_Ub ^ -1)) {
                      L16: {
                        if (var23 == 10) {
                          stackIn_70_0 = uj.field_l;
                          break L16;
                        } else {
                          stackIn_70_0 = db.a(lg.field_b, -26, new String[]{Integer.toString(var23), um.field_cb[var23 - 1]});
                          break L16;
                        }
                      }
                      var24_ref_String = stackIn_70_0;
                      var22_ref = var22_ref + "<br><br><col=ff0000>" + var24_ref_String + "</col>";
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if ((30 + var18 + ff.field_lb.a(var22_ref, var19, 16) ^ -1) > (var5 ^ -1)) {
                    stackIn_75_0 = 0;
                    break L17;
                  } else {
                    stackIn_75_0 = 1;
                    break L17;
                  }
                }
                L18: {
                  var24 = stackIn_75_0;
                  pl.field_U.b(um.field_cb[ol.field_Ub + ge.field_j * 10].toUpperCase(), var17, var18 + 20, 16777215, -1);
                  stackIn_78_0 = ff.field_lb;

                  stackIn_78_1 = (String) (var22_ref);

                  stackIn_78_2 = var17;

                  stackIn_78_3 = 30 + var18;

                  stackIn_78_4 = var19;

                  stackIn_78_5 = var20;

                  stackIn_78_6 = 1021128;

                  stackIn_78_7 = -1;

                  stackIn_78_8 = 0;

                  stackIn_78_9 = 0;

                  if (var24 != 0) {
                    stackIn_79_0 = (fh) ((Object) stackIn_78_0);
                    stackIn_79_1 = (String) ((Object) stackIn_78_1);
                    stackIn_79_2 = stackIn_78_2;
                    stackIn_79_3 = stackIn_78_3;
                    stackIn_79_4 = stackIn_78_4;
                    stackIn_79_5 = stackIn_78_5;
                    stackIn_79_6 = stackIn_78_6;
                    stackIn_79_7 = stackIn_78_7;
                    stackIn_79_8 = stackIn_78_8;
                    stackIn_79_9 = stackIn_78_9;
                    stackIn_79_10 = 15;
                    break L18;
                  } else {
                    stackIn_79_0 = (fh) ((Object) stackIn_78_0);
                    stackIn_79_1 = (String) ((Object) stackIn_78_1);
                    stackIn_79_2 = stackIn_78_2;
                    stackIn_79_3 = stackIn_78_3;
                    stackIn_79_4 = stackIn_78_4;
                    stackIn_79_5 = stackIn_78_5;
                    stackIn_79_6 = stackIn_78_6;
                    stackIn_79_7 = stackIn_78_7;
                    stackIn_79_8 = stackIn_78_8;
                    stackIn_79_9 = stackIn_78_9;
                    stackIn_79_10 = 16;
                    break L18;
                  }
                }
                L19: {
                  ((fh) (Object) stackIn_79_0).a(stackIn_79_1, stackIn_79_2, stackIn_79_3, stackIn_79_4, stackIn_79_5, stackIn_79_6, stackIn_79_7, stackIn_79_8, stackIn_79_9, stackIn_79_10);
                  var25 = bg.field_C;
                  if (0 == nk.field_J) {
                    var25 = pd.field_Q;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var26 = 8;
                var27 = a.field_c * var26 / 50 % var25.length;
                var28 = var25[var27];
                var15 = var15 + (-2 + (var14 - var28.field_B));
                var25[var27].f(var16 + 2, var15);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = this.b(-117, param0);
            if (0 > var3_int) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            var3_int = 0;
                            var5 = this.field_c;
                            if (var5 == 5) {
                              break L7;
                            } else {
                              L8: {
                                if (var5 != 6) {
                                  break L8;
                                } else {
                                  if (var6 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if ((var5 ^ -1) == -9) {
                                break L6;
                              } else {
                                if (7 == var5) {
                                  break L5;
                                } else {
                                  L9: {
                                    if (14 != var5) {
                                      break L9;
                                    } else {
                                      if (var6 == 0) {
                                        break L5;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (var5 == 13) {
                                    break L5;
                                  } else {
                                    if (var5 == 0) {
                                      break L4;
                                    } else {
                                      if (var5 == 17) {
                                        break L3;
                                      } else {
                                        L10: {
                                          if (19 != var5) {
                                            break L10;
                                          } else {
                                            if (var6 == 0) {
                                              break L2;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if ((var5 ^ -1) == -21) {
                                            L12: {
                                              L13: {
                                                L14: {
                                                  var5 = uc.field_e[this.field_c][param0];
                                                  if ((var5 ^ -1) != -26) {
                                                    break L14;
                                                  } else {
                                                    if (var6 == 0) {
                                                      break L13;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L15: {
                                                  if (-27 != (var5 ^ -1)) {
                                                    break L15;
                                                  } else {
                                                    if (var6 == 0) {
                                                      break L13;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                if ((var5 ^ -1) != -40) {
                                                  break L1;
                                                } else {
                                                  if (var6 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              var3_int = 95;
                                              if (var6 == 0) {
                                                break L1;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            var3_int = 376;
                                            if (var6 == 0) {
                                              break L1;
                                            } else {
                                              break L11;
                                            }
                                          } else {
                                            if (var5 != 22) {
                                              break L1;
                                            } else {
                                              if (var6 == 0) {
                                                break L11;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                        stackIn_92_0 = param0 * 30 + 150;
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (ni.b(99)) {
                            break L1;
                          } else {
                            var3_int = 379;
                            if (var6 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (ni.b(92)) {
                          break L1;
                        } else {
                          var3_int = 448;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3_int = 448;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                    L16: {
                      var3_int = uc.field_f[this.field_c] * param0 + 175;
                      if (!nk.f((byte) -15)) {
                        var3_int = var3_int + 4 * param0;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var4 = uc.field_e[this.field_c][param0];
                    if (34 == var4) {
                      var3_int = 350;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L1;
                    }
                  }
                  var3_int = 130;
                  if (-1 <= (param0 ^ -1)) {
                    break L1;
                  } else {
                    if (param0 < uc.field_e[this.field_c].length - 4) {
                      var3_int = var3_int + 30 * param0;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_72_0 = 29 * (param0 % 10) + 111;
                decompiledRegionSelector0 = 1;
                break L0;
              }
              if (this.a(-2)) {
                if (uc.field_e[this.field_c].length < 8) {
                  stackIn_100_0 = 120 + param0 * 30;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_98_0 = 30 * param0 + 90;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                L17: {
                  if (var3_int != 0) {
                    break L17;
                  } else {
                    var3_int = param0 * uc.field_f[this.field_c] + uc.field_c[this.field_c];
                    break L17;
                  }
                }
                var4 = 23 / ((-41 - param1) / 62);
                stackIn_104_0 = this.field_k + var3_int;
                decompiledRegionSelector0 = 5;
                break L0;
              }
            } else {
              stackIn_3_0 = 448;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_92_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_98_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_100_0;
                } else {
                  return stackIn_104_0;
                }
              }
            }
          }
        }
    }

    private final int f(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_c == 16) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 32) {
                L1: {
                  var2_int = this.field_g.field_e;
                  var3 = this.b(-107, var2_int);
                  if (0 > var2_int) {
                    break L1;
                  } else {
                    if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                      break L1;
                    } else {
                      if (uc.field_e[this.field_c][var2_int] != -1) {
                        L2: {
                          if (this.field_c != 20) {
                            break L2;
                          } else {
                            if ((var2_int ^ -1) > -1) {
                              break L2;
                            } else {
                              if ((var2_int ^ -1) <= -4) {
                                break L2;
                              } else {
                                stackIn_39_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        if (this.field_c != 0) {
                          if ((var3 ^ -1) > -1) {
                            L3: {
                              if (-6 != (this.field_c ^ -1)) {
                                break L3;
                              } else {
                                if (-4 >= (var2_int ^ -1)) {
                                  break L3;
                                } else {
                                  L4: {
                                    var2_int++;
                                    if (3 <= var2_int) {
                                      var2_int -= 3;
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  stackIn_77_0 = var2_int;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                            L5: {
                              if (6 != this.field_c) {
                                break L5;
                              } else {
                                if (var2_int >= 2) {
                                  break L5;
                                } else {
                                  L6: {
                                    var2_int++;
                                    if (2 > var2_int) {
                                      break L6;
                                    } else {
                                      var2_int -= 2;
                                      break L6;
                                    }
                                  }
                                  stackIn_88_0 = var2_int;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            }
                            L7: {
                              if (-20 == (this.field_c ^ -1)) {
                                if (19 != this.field_c) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (uc.field_e[this.field_c] != fa.field_c) {
                                      stackIn_99_0 = 20;
                                      break L8;
                                    } else {
                                      stackIn_99_0 = 30;
                                      break L8;
                                    }
                                  }
                                  var4 = stackIn_99_0;
                                  if (-1 < (var2_int ^ -1)) {
                                    break L7;
                                  } else {
                                    if (var2_int >= -10 + var4) {
                                      break L7;
                                    } else {
                                      stackIn_104_0 = 10 + var2_int;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            stackIn_106_0 = -1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          } else {
                            L9: {
                              var3++;
                              var2_int++;
                              if (4 == var3) {
                                var2_int -= 4;
                                var3 = 0;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: while (true) {
                              if (0 != (uc.field_e[this.field_c][var2_int] ^ -1)) {
                                stackIn_65_0 = var2_int;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                L11: {
                                  var3++;
                                  var2_int++;
                                  if (-5 != (var3 ^ -1)) {
                                    break L11;
                                  } else {
                                    var2_int -= 4;
                                    var3 = 0;
                                    break L11;
                                  }
                                }
                                if ((this.field_g.field_e ^ -1) != (var2_int ^ -1)) {
                                  continue L10;
                                } else {
                                  stackIn_62_0 = var2_int;
                                  decompiledRegionSelector0 = 7;
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          if (34 == uc.field_e[this.field_c][var2_int]) {
                            stackIn_47_0 = dh.field_F;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            stackIn_49_0 = var2_int;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var2_int = 0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if ((uc.field_e[this.field_c].length ^ -1) >= (var2_int ^ -1)) {
                        break L14;
                      } else {
                        stackIn_26_0 = -1;

                        stackIn_26_1 = uc.field_e[this.field_c][var2_int];

                        if (var5 != 0) {
                          break L13;
                        } else {
                          if (stackIn_26_0 != stackIn_26_1) {
                            break L14;
                          } else {
                            var2_int++;
                            if (var5 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackIn_26_0 = uc.field_e[this.field_c].length;
                    stackIn_26_1 = var2_int;
                    break L13;
                  }
                  if (stackIn_26_0 != stackIn_26_1) {
                    stackIn_30_0 = var2_int;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_28_0 = -1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_8_0 = 18;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_47_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_49_0;
                    } else {
                      L15: {
                        if (decompiledRegionSelector0 == 7) {
                          stackIn_65_0 = stackIn_62_0;

                          if (var5 != 0) {
                            break L15;
                          } else {
                            return stackIn_62_0;
                          }
                        } else {
                          if (decompiledRegionSelector0 == 8) {
                            break L15;
                          } else {
                            if (decompiledRegionSelector0 == 9) {
                              return stackIn_77_0;
                            } else {
                              if (decompiledRegionSelector0 == 10) {
                                return stackIn_88_0;
                              } else {
                                if (decompiledRegionSelector0 == 11) {
                                  return stackIn_104_0;
                                } else {
                                  return stackIn_106_0;
                                }
                              }
                            }
                          }
                        }
                      }
                      return stackIn_65_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 114) {
              if (-1 != (this.field_c ^ -1)) {
                stackIn_7_0 = 37;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ob.field_z.field_B;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -69;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final int d(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (7 != this.field_c) {
              L1: {
                var2_int = this.field_g.field_e;
                if (param0 < -41) {
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              L2: {
                var3 = this.b(-102, var2_int);
                if ((var2_int ^ -1) > -1) {
                  break L2;
                } else {
                  if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                    break L2;
                  } else {
                    if (uc.field_e[this.field_c][var2_int] == -1) {
                      break L2;
                    } else {
                      L3: {
                        if ((this.field_c ^ -1) == -20) {
                          if (0 <= var3) {
                            L4: {
                              if (uc.field_e[this.field_c] != fa.field_c) {
                                stackIn_45_0 = 19;
                                break L4;
                              } else {
                                stackIn_45_0 = 29;
                                break L4;
                              }
                            }
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if ((this.field_c ^ -1) == -21) {
                          if ((var3 ^ -1) > -1) {
                            if (-2 != (var2_int ^ -1)) {
                              break L5;
                            } else {
                              if (!this.a(117, 0)) {
                                stackIn_59_0 = -1 + uc.field_e[this.field_c].length;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            stackIn_51_0 = 2;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_c != 5) {
                          break L6;
                        } else {
                          if (var2_int > var3) {
                            if (0 == var3) {
                              stackIn_70_0 = 0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              L7: {
                                if (-2 == (var3 ^ -1)) {
                                  break L7;
                                } else {
                                  if (2 != var3) {
                                    if (-4 == (var3 ^ -1)) {
                                      stackIn_81_0 = 2;
                                      decompiledRegionSelector0 = 7;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              stackIn_76_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if ((this.field_c ^ -1) != -7) {
                          break L8;
                        } else {
                          if ((var2_int ^ -1) >= (var3 ^ -1)) {
                            break L8;
                          } else {
                            L9: {
                              if ((var3 ^ -1) == -1) {
                                break L9;
                              } else {
                                if (var3 == 1) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (2 == var3) {
                                      break L10;
                                    } else {
                                      if ((var3 ^ -1) != -4) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  stackIn_101_0 = 1;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                            stackIn_95_0 = 0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        }
                      }
                      if (-1 != (this.field_c ^ -1)) {
                        if ((this.field_c ^ -1) == -18) {
                          if (-1 != (var2_int ^ -1)) {
                            if ((var2_int ^ -1) > (uc.field_e[this.field_c].length - 4 ^ -1)) {
                              stackIn_126_0 = var2_int - 1;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              stackIn_128_0 = uc.field_e[this.field_c].length + -5;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            }
                          } else {
                            stackIn_121_0 = uc.field_e[this.field_c].length - 1;
                            decompiledRegionSelector0 = 12;
                            break L0;
                          }
                        } else {
                          stackIn_130_0 = -1;
                          decompiledRegionSelector0 = 15;
                          break L0;
                        }
                      } else {
                        L11: {
                          if (uc.field_e[this.field_c][var2_int] != 34) {
                            var2_int--;
                            if (-1 < (var2_int ^ -1)) {
                              var2_int = var2_int + uc.field_e[this.field_c].length;
                              if (34 != uc.field_e[this.field_c][var2_int]) {
                                break L11;
                              } else {
                                var2_int--;
                                break L11;
                              }
                            } else {
                              stackIn_110_0 = var2_int;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            }
                          } else {
                            break L11;
                          }
                        }
                        stackIn_115_0 = var2_int;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      }
                    }
                  }
                }
              }
              var2_int = uc.field_e[this.field_c].length + -1;
              L12: while (true) {
                L13: {
                  L14: {
                    if (-1 < (var2_int ^ -1)) {
                      break L14;
                    } else {
                      stackIn_26_0 = 0;

                      stackIn_26_1 = uc.field_e[this.field_c][var2_int] ^ -1;

                      if (var4 != 0) {
                        break L13;
                      } else {
                        if (stackIn_26_0 != stackIn_26_1) {
                          break L14;
                        } else {
                          var2_int--;
                          if (var4 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  stackIn_26_0 = 0;
                  stackIn_26_1 = var2_int;
                  break L13;
                }
                L15: {
                  if (stackIn_26_0 > stackIn_26_1) {
                    break L15;
                  } else {
                    if ((uc.field_e[this.field_c][var2_int] ^ -1) == -35) {
                      var2_int--;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                stackIn_34_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.AB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_45_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_51_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_59_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_70_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_76_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_81_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_95_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_101_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_110_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_115_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_121_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_126_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_128_0;
                                    } else {
                                      return stackIn_130_0;
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
            }
          }
        }
    }

    private final void p(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        u var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String[] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = pl.field_U;
                        pb.h(40, 80, 560, 330, 3487029);
                        pb.h(41, 81, 558, 328, 3487029);
                        if (ni.b(25)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.e(1021128);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (qi.field_j != null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qi.field_j = ol.a(7, true, 0, 10);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 <= -87) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var3 = 1021128;
                        if (-1 == (oe.field_h[5] ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = ((mi) ((Object) var2)).c("10000%");
                        var6_int = 5;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var6_int ^ -1) >= -1) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7_int = ((mi) ((Object) var2)).c(pe.field_h[var6_int]) - -8;
                        stackIn_19_0 = Math.max(var7_int, var5_int);
                        stackIn_17_0 = stackIn_19_0;
                        if (var12 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7_int = stackIn_17_0;
                        oe.field_h[var6_int] = -var7_int + oe.field_h[var6_int - -1];
                        var6_int--;
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 105;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = stackIn_19_0;
                        if (!qi.field_j.field_r) {
                            statePc = 50;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null != qi.field_j.field_z) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = dj.field_h;
                        if (var12 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = wb.field_d;
                        var6 = qi.field_j.field_z[on.field_j];
                        var7 = qi.field_j.field_x[on.field_j];
                        pb.h(48, 88, 544, 286, 1130327);
                        pb.g(48, 109, 544, 1130327);
                        var8 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (oe.field_h.length - 1 <= var8) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        pb.d(oe.field_h[var8], 88, 286, 1130327);
                        var8++;
                        if (var12 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((mi) ((Object) var2)).b(pe.field_h[0], 2 + oe.field_h[0], var4, var3, -1);
                        ((mi) ((Object) var2)).c(pe.field_h[1], -2 + (oe.field_h[2] + -1), var4, var3, -1);
                        ((mi) ((Object) var2)).c(pe.field_h[2], -1 + oe.field_h[3] - 2, var4, var3, -1);
                        ((mi) ((Object) var2)).c(pe.field_h[3], -1 + (-2 + oe.field_h[4]), var4, var3, -1);
                        ((mi) ((Object) var2)).c(pe.field_h[4], -2 + (oe.field_h[5] - 1), var4, var3, -1);
                        ((mi) ((Object) var2)).c(pe.field_h[5], -1 + (-2 + oe.field_h[6]), var4, var3, -1);
                        var4 = 126;
                        var8 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (10 <= var9) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var6[var9] != null) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3 = 1021128;
                        var10 = var6[var9];
                        var11 = wl.a(50, var10) ? 1 : 0;
                        var5 = "";
                        this.a(var10, var9, var4, var11 != 0, var7[3 + var9 * 4], var7[var9 * 4], var7[4 * var9 + 2], var7[4 * var9 - -1], -128);
                        if (var11 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3 = 1044724;
                        var8 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var4 += 17;
                        var9++;
                        if (var12 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var8 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = 369;
                        var3 = 1021128;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.a(g.field_l, -1, var4, true, qi.field_j.field_B, qi.field_j.field_p, qi.field_j.field_o, qi.field_j.field_s, -126);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var12 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5 = lg.field_a;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var4 = 231;
                        ((mi) ((Object) var2)).a(var5, 320, var4, 1021128, -1);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var2_ref), "ji.QA(" + param0 + ')');
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = this.b(-72, param0);
            if (0 > var3_int) {
              L1: {
                if ((this.field_c ^ -1) != -6) {
                  break L1;
                } else {
                  if (!ni.b(79)) {
                    L2: {
                      if (3 > param0) {
                        stackIn_14_0 = this.g(126, param0) - -144;
                        break L2;
                      } else {
                        stackIn_14_0 = 380;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param1 > 107) {
                L3: {
                  if (-7 != (this.field_c ^ -1)) {
                    break L3;
                  } else {
                    if (!ni.b(30)) {
                      L4: {
                        if (-3 < (param0 ^ -1)) {
                          stackIn_28_0 = this.g(127, param0) + 160;
                          break L4;
                        } else {
                          stackIn_28_0 = 380;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-8 == (this.field_c ^ -1)) {
                  stackIn_33_0 = 140 + this.g(125, param0);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  L5: {
                    if (-15 == (this.field_c ^ -1)) {
                      break L5;
                    } else {
                      if (this.field_c != 13) {
                        if (0 == this.field_c) {
                          var4 = uc.field_e[this.field_c][param0];
                          if (34 != var4) {
                            stackIn_47_0 = 450;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackIn_45_0 = 150;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        } else {
                          if (-18 == (this.field_c ^ -1)) {
                            stackIn_52_0 = -this.g(127, param0) + 640;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            if (!this.a(-2)) {
                              if (15 == this.field_c) {
                                stackIn_60_0 = 600;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                if (this.field_c != 19) {
                                  L6: {
                                    if (-21 == (this.field_c ^ -1)) {
                                      L7: {
                                        L8: {
                                          var4 = uc.field_e[this.field_c][param0];
                                          if (25 != var4) {
                                            break L8;
                                          } else {
                                            if (var5 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        if ((var4 ^ -1) == -27) {
                                          break L7;
                                        } else {
                                          if (39 != var4) {
                                            break L6;
                                          } else {
                                            if (var5 == 0) {
                                              stackIn_89_0 = -this.g(125, param0) + 640;
                                              decompiledRegionSelector0 = 13;
                                              break L0;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      stackIn_87_0 = 60 + this.g(127, param0);
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  stackIn_91_0 = uc.field_d[this.field_c];
                                  decompiledRegionSelector0 = 14;
                                  break L0;
                                } else {
                                  L9: {
                                    stackIn_67_0 = this.g(126, param0);

                                    if (uc.field_e[this.field_c] != fa.field_c) {
                                      stackIn_68_0 = stackIn_67_0;
                                      stackIn_68_1 = 260;
                                      break L9;
                                    } else {

                                      stackIn_68_0 = stackIn_67_0;
                                      stackIn_68_1 = 180;
                                      break L9;
                                    }
                                  }
                                  stackIn_69_0 = stackIn_68_0 - -stackIn_68_1;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                }
                              }
                            } else {
                              stackIn_55_0 = 640 + -this.g(126, param0);
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackIn_39_0 = 160 + this.g(125, param0);
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              } else {
                stackIn_17_0 = 79;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = var3_int * 159 - -159;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.KA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_45_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_47_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_52_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_55_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_60_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_69_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_87_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_89_0;
                                  } else {
                                    return stackIn_91_0;
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
          }
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 50) {
                break L1;
              } else {
                ji.a(-98, (CharSequence) null);
                break L1;
              }
            }
            stackIn_4_0 = sj.field_y.a(param1, -742, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ji.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 111) {
                break L1;
              } else {
                this.a(18, false);
                break L1;
              }
            }
            if (ve.a(ge.field_m, 1, param0)) {
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!ve.a(ao.field_A, param1 + -110, param0)) {
                L2: {
                  if (!ve.a(ao.field_E, 1, param0)) {
                    break L2;
                  } else {
                    L3: {
                      if (ni.b(param1 ^ 54)) {
                        break L3;
                      } else {
                        if (0 >= rd.field_b) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
                stackIn_23_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.W(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    private final void e(int param0) {
        u var2 = null;
        String var3 = null;
        try {
            var2 = pl.field_U;
            var3 = lb.field_hc;
            ((mi) ((Object) var2)).a(var3, 320, 240, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.CA(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_385_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        nk var11_ref_nk = null;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == -29628) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_f = (String[]) null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (lb.field_gc != 1) {
                        statePc = 388;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2_int = -17 + va.field_d;
                    if (-1 < (var2_int ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (5 < var2_int) {
                        statePc = 11;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2_int = va.field_d - 24;
                    if ((var2_int ^ -1) > -1) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var2_int >= 3) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var2_int = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var3 = 0;
                    var4 = 0;
                    var5 = va.field_d;
                    if (0 != var5) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var12 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (2 != var5) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var12 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (4 != var5) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var12 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (1 == var5) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-4 == (var5 ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (5 == var5) {
                        statePc = 57;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (9 == var5) {
                        statePc = 58;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((var5 ^ -1) != -14) {
                        statePc = 59;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var12 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var2_int = 0;
                    var3 = 0;
                    var4 = 3;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var4 = 6;
                    var2_int = 2;
                    var3 = 3;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var3 = 6;
                    var4 = 12;
                    var2_int = 4;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var4 = 3;
                    var3 = 0;
                    var2_int = 0;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var4 = 6;
                    var3 = 3;
                    var2_int = 2;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var3 = 6;
                    var2_int = 4;
                    var4 = 12;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var4 = 12;
                    var2_int = -1 + va.field_d;
                    fe.field_D[0] = vn.a(fe.field_D[0], 67108864);
                    var3 = 0;
                    fe.field_D[1] = vn.a(fe.field_D[1], 1);
                    fe.field_D[0] = vn.a(fe.field_D[0], 1073741824);
                    rn.field_D[1] = vn.a(rn.field_D[1], 131072);
                    fe.field_D[0] = vn.a(fe.field_D[0], 16777216);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (va.field_d != 13) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    jc.field_f = 2;
                    li.field_v = 1000;
                    fm.field_f[0] = 10;
                    dm.field_a = 8;
                    h.field_G = 1000;
                    fm.field_f[1] = 10;
                    fm.field_f[2] = 10;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var5 = va.field_d - var2_int;
                    if (var5 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var12 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (1 == var5) {
                        statePc = 132;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var5 == 8) {
                        statePc = 151;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (-8 != (var5 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var12 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (6 != var5) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var12 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (10 != var5) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var12 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (11 != var5) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var12 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((var5 ^ -1) == -13) {
                        statePc = 218;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var5 == 16) {
                        statePc = 252;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (-16 != (var5 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var12 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (14 == var5) {
                        statePc = 294;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var5 == 17) {
                        statePc = 312;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var5 == 24) {
                        statePc = 364;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 119: {
                    jg.field_j = true;
                    var5 = var3;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    stackIn_121_0 = var4 ^ -1;
                    stackIn_121_1 = var5 ^ -1;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 >= stackIn_121_1) {
                        statePc = 131;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var6 = n.field_z[var5];
                    rn.field_D[var6 >> -1478273563] = ec.a(rn.field_D[var6 >> -1478273563], 1 << ec.a(var6, 31) ^ -1);
                    var7 = ne.a(var6, (byte) 28);
                    var8 = var7;
                    stackIn_385_0 = 0;
                    stackIn_123_0 = stackIn_385_0;
                    if (var12 != 0) {
                        statePc = 385;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var9_int = stackIn_123_0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var8.length <= var9_int) {
                        statePc = 130;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var10 = var8[var9_int];
                    var11_ref_nk = ul.a(var10, (byte) 67);
                    stackIn_121_0 = -1;
                    stackIn_126_0 = stackIn_121_0;
                    stackIn_121_1 = var11_ref_nk.field_Q & 2055 ^ -1;
                    stackIn_126_1 = stackIn_121_1;
                    if (var12 != 0) {
                        statePc = 121;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0 != stackIn_126_1) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    rn.field_D[var10 >> 962260645] = ec.a(rn.field_D[var10 >> 962260645], 1 << ec.a(var10, 31) ^ -1);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    var9_int++;
                    if (var12 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    jg.field_j = true;
                    var5 = var3;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var6 = n.field_z[var5];
                    rn.field_D[var6 >> 1567333829] = vn.a(rn.field_D[var6 >> 1567333829], 1 << ec.a(var6, 31));
                    var7 = ne.a(var6, (byte) 28);
                    var8 = var7;
                    stackIn_385_0 = 0;
                    stackIn_135_0 = stackIn_385_0;
                    if (var12 != 0) {
                        statePc = 385;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var9_int = stackIn_135_0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var10 = var8[var9_int];
                    rn.field_D[var10 >> -996687099] = vn.a(rn.field_D[var10 >> -996687099], 1 << ec.a(31, var10));
                    var9_int++;
                    if (var12 != 0) {
                        statePc = 142;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (var12 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var8 = ki.b(var6, (byte) -110);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var9 = var8;
                    var10 = 0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (var9.length <= var10) {
                        statePc = 148;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var11 = var9[var10];
                    fe.field_D[var11 >> -1104142747] = vn.a(fe.field_D[var11 >> -1104142747], 1 << ec.a(var11, 31));
                    var10++;
                    if (var12 != 0) {
                        statePc = 149;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var12 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var5++;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var12 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    jg.field_j = true;
                    var5 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if ((var5 ^ -1) <= (rn.field_D.length ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    rn.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var12 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var5 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((fe.field_D.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 165;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    fe.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 384;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (var12 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    jg.field_j = true;
                    li.field_v = Math.min(100 + li.field_v, 1000);
                    h.field_G = h.field_G + 100;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    jg.field_j = true;
                    li.field_v = Math.max(li.field_v - 100, 0);
                    h.field_G = Math.max(h.field_G - 100, 0);
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    jg.field_j = true;
                    jc.field_f = 0;
                    var5 = 0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (rn.field_D.length <= var5) {
                        statePc = 178;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    rn.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (var12 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var5 = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((var5 ^ -1) <= (fe.field_D.length ^ -1)) {
                        statePc = 186;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    fe.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var12 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    dm.field_a = 0;
                    fm.field_f[0] = 0;
                    li.field_v = 0;
                    h.field_G = 0;
                    fm.field_f[1] = 0;
                    fm.field_f[2] = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    dm.field_a = 0;
                    jg.field_j = true;
                    jc.field_f = 1;
                    var5 = 0;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if ((rn.field_D.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    rn.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 195;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var12 == 0) {
                        statePc = 189;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var5 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (var5 >= fe.field_D.length) {
                        statePc = 202;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    fe.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var12 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    h.field_G = 0;
                    li.field_v = 0;
                    var5 = 55;
                    rn.field_D[var5 >> -1389619515] = vn.a(rn.field_D[var5 >> -1389619515], 1 << ec.a(var5, 31));
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var6_ref_int__ = ne.a(var5, (byte) 28);
                    var7 = var6_ref_int__;
                    var8_int = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var8_int >= var7.length) {
                        statePc = 209;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var9_int = var7[var8_int];
                    rn.field_D[var9_int >> 1384330725] = vn.a(rn.field_D[var9_int >> 1384330725], 1 << ec.a(31, var9_int));
                    h.field_G = h.field_G + sj.field_v[var9_int];
                    var8_int++;
                    if (var12 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var12 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var7 = ki.b(var5, (byte) -103);
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    var8 = var7;
                    var9_int = 0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var10 = var8[var9_int];
                    fe.field_D[var10 >> -1446709019] = vn.a(fe.field_D[var10 >> -1446709019], 1 << ec.a(31, var10));
                    h.field_G = h.field_G + qf.field_h[var10];
                    var9_int++;
                    if (var12 != 0) {
                        statePc = 217;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (var12 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    fm.field_f[0] = 3;
                    fm.field_f[1] = 0;
                    fm.field_f[2] = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    jc.field_f = 2;
                    dm.field_a = 8;
                    jg.field_j = true;
                    var5 = 0;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if ((rn.field_D.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    rn.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 225;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (var12 == 0) {
                        statePc = 219;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var5 = 0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (var5 >= fe.field_D.length) {
                        statePc = 232;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    fe.field_D[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (var12 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    h.field_G = 0;
                    li.field_v = 0;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    var5 = 0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if ((var5 ^ -1) <= -4) {
                        statePc = 251;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var6 = n.field_z[var5];
                    rn.field_D[var6 >> 1948565669] = vn.a(rn.field_D[var6 >> 1948565669], 1 << ec.a(31, var6));
                    var7 = ne.a(var6, (byte) 28);
                    var8 = var7;
                    stackIn_385_0 = 0;
                    stackIn_236_0 = stackIn_385_0;
                    if (var12 != 0) {
                        statePc = 385;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var9_int = stackIn_236_0;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if ((var9_int ^ -1) <= (var8.length ^ -1)) {
                        statePc = 242;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    var10 = var8[var9_int];
                    rn.field_D[var10 >> 993871525] = vn.a(rn.field_D[var10 >> 993871525], 1 << ec.a(31, var10));
                    h.field_G = h.field_G + sj.field_v[var10];
                    var9_int++;
                    if (var12 != 0) {
                        statePc = 243;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var12 == 0) {
                        statePc = 237;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var8 = ki.b(var6, (byte) -93);
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    var9 = var8;
                    var10 = 0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if ((var9.length ^ -1) >= (var10 ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var11 = var9[var10];
                    fe.field_D[var11 >> 274612869] = vn.a(fe.field_D[var11 >> 274612869], 1 << ec.a(31, var11));
                    h.field_G = h.field_G + qf.field_h[var11];
                    var10++;
                    if (var12 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var12 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var5++;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (var12 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    fm.field_f[2] = 0;
                    fm.field_f[0] = 10;
                    fm.field_f[1] = 0;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if ((8 & dm.field_a ^ -1) == -1) {
                        statePc = 258;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    dm.field_a = dm.field_a & -9;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    dm.field_a = dm.field_a | 8;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (!ni.b(46)) {
                        statePc = 267;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    km.field_a = "Not logged in.";
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    jg.field_j = false;
                    mm.field_g.a(69, (byte) -117);
                    mm.field_g.b(true, li.field_v);
                    mm.field_g.b(true, h.field_G);
                    var5 = 0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (-5 >= (var5 ^ -1)) {
                        statePc = 273;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    mm.field_g.b(true, rn.field_D[var5]);
                    var5++;
                    if (var12 != 0) {
                        statePc = 274;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (var12 == 0) {
                        statePc = 268;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var5 = 0;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if ((var5 ^ -1) <= -3) {
                        statePc = 281;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    mm.field_g.b(true, fe.field_D[var5]);
                    var5++;
                    if (var12 != 0) {
                        statePc = 282;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (var12 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var5 = 0;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (var5 >= 3) {
                        statePc = 289;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    mm.field_g.a((byte) 115, fm.field_f[var5]);
                    var5++;
                    if (var12 != 0) {
                        statePc = 290;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (var12 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    mm.field_g.a((byte) 126, jc.field_f);
                    km.field_a = "Data sent.";
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (ul.field_d < 2) {
                        statePc = 293;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 293: {
                    km.field_a = km.field_a + " (Expect it to be ignored.)";
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    vn.d(-57);
                    var5 = 0;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (va.field_k.length <= var5) {
                        statePc = 300;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    va.field_k[var5] = 0;
                    var5++;
                    if (var12 != 0) {
                        statePc = 301;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (var12 == 0) {
                        statePc = 295;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var5 = vb.field_g;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if ((var5 ^ -1) == -6) {
                        statePc = 310;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (-7 == (var5 ^ -1)) {
                        statePc = 310;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (-9 == (var5 ^ -1)) {
                        statePc = 310;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var5 = gh.field_Jb;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    q.a(0, true, param0 + 29627, var5);
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var5 = var2_int;
                    if (var5 != 0) {
                        statePc = 316;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (var12 == 0) {
                        statePc = 346;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (var5 != 1) {
                        statePc = 322;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (var12 == 0) {
                        statePc = 349;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (-3 != (var5 ^ -1)) {
                        statePc = 328;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (var12 == 0) {
                        statePc = 352;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (-4 != (var5 ^ -1)) {
                        statePc = 334;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (var12 == 0) {
                        statePc = 355;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (var5 != 4) {
                        statePc = 340;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (var12 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (var5 != 5) {
                        statePc = 363;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (var12 == 0) {
                        statePc = 361;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    jn.a(true, (byte) 114, 200, me.field_f);
                    if (var12 == 0) {
                        statePc = 363;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    jn.a(true, (byte) 108, 200, l.field_i);
                    if (var12 == 0) {
                        statePc = 363;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    jn.a(true, (byte) 77, 200, gb.field_e);
                    if (var12 == 0) {
                        statePc = 363;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    jn.a(true, (byte) 91, 200, kj.field_z);
                    if (var12 == 0) {
                        statePc = 363;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    jn.a(true, (byte) 96, 200, ue.field_e);
                    if (var12 == 0) {
                        statePc = 363;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    jn.a(true, (byte) 122, 200, db.field_a);
                    statePc = 363;
                    continue stateLoop;
                }
                case 363: {
                    return;
                }
                case 364: {
                    jg.field_j = true;
                    if ((fm.field_f[var2_int] ^ -1) == -11) {
                        statePc = 374;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    fm.field_f[var2_int] = 10;
                    if ((var2_int ^ -1) != -1) {
                        statePc = 384;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (jc.field_f == 0) {
                        statePc = 373;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 373: {
                    jc.field_f = 1;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    fm.field_f[var2_int] = 0;
                    if (0 != var2_int) {
                        statePc = 384;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (jc.field_f <= 0) {
                        statePc = 384;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    jc.field_f = 0;
                    if (var12 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    return;
                }
                case 384: {
                    stackIn_385_0 = param0 ^ 31241;
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    ee.c(stackIn_385_0, 95);
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((ei.field_q ^ -1) != -97) {
                break L1;
              } else {
                L2: {
                  if (-1 <= (this.field_g.field_e ^ -1)) {
                    break L2;
                  } else {
                    if (-4 == (this.field_g.field_e ^ -1)) {
                      break L1;
                    } else {
                      this.field_g.a(0, -1 + this.field_g.field_e);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_g.a(0, 2);
                break L1;
              }
            }
            L3: {
              if (97 == ei.field_q) {
                L4: {
                  if (2 > this.field_g.field_e) {
                    break L4;
                  } else {
                    if (2 != this.field_g.field_e) {
                      break L3;
                    } else {
                      this.field_g.a(0, 0);
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_g.a(0, 1 + this.field_g.field_e);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              if (99 != ei.field_q) {
                break L5;
              } else {
                L6: {
                  L7: {
                    if ((this.field_g.field_e ^ -1) > -1) {
                      break L7;
                    } else {
                      if (-3 <= (this.field_g.field_e ^ -1)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_g.a(0, d.field_R);
                  if (var3 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
                this.field_g.a(param0 + 1, 3);
                break L5;
              }
            }
            L8: {
              if (98 != ei.field_q) {
                break L8;
              } else {
                L9: {
                  if (this.field_g.field_e == 3) {
                    break L9;
                  } else {
                    this.field_g.a(0, 3);
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_g.a(0, d.field_R);
                break L8;
              }
            }
            L10: {
              if (param0 == -1) {
                break L10;
              } else {
                ji.a(12, (String) null);
                break L10;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.P(" + param0 + ')');
        }
    }

    final void r(int param0) {
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_93_0 = 0;
        boolean stackIn_275_0 = false;
        Object stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        int stackIn_281_2 = 0;
        Object stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        int stackIn_283_2 = 0;
        Object stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        int stackIn_285_2 = 0;
        Object stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        int stackIn_286_2 = 0;
        int stackIn_286_3 = 0;
        Object stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        Object stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        Object stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        Object stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        int stackIn_293_2 = 0;
        int stackIn_296_0 = 0;
        int stackIn_406_0 = 0;
        int stackIn_406_1 = 0;
        int stackIn_408_0 = 0;
        int stackIn_408_1 = 0;
        int stackIn_417_0 = 0;
        int stackIn_419_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_426_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_451_0 = 0;
        int stackIn_451_1 = 0;
        int stackIn_460_0 = 0;
        int stackIn_465_0 = 0;
        int stackIn_465_1 = 0;
        int stackIn_469_0 = 0;
        int stackIn_551_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_274_0;
        int statePc = 0;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var5_array = null;
        fh var5_ref = null;
        String var5_ref2 = null;
        int var6_int = 0;
        gh var6 = null;
        fh var6_ref = null;
        int var7 = 0;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-4 >= (fm.field_f[0] ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ti.field_A[0] = qg.field_p;
                    if (var19 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ti.field_A[0] = fk.field_f;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.a(false);
                    if (12 != this.field_c) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (ej.f(-127)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    la.a(35);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    if ((this.field_c ^ -1) != -22) {
                        statePc = 53;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (tm.field_h) {
                        statePc = 48;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (tm.field_d == null) {
                        statePc = 48;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (!tm.field_d.a(true)) {
                        statePc = 48;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (!tm.field_d.a("members_expansion_screen", (byte) 90)) {
                        statePc = 48;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!tm.field_d.a("arialish12", (byte) 90)) {
                        statePc = 48;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (!tm.field_d.a("pump32", (byte) 90)) {
                        statePc = 48;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (ej.field_t == null) {
                        statePc = 48;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (!ej.field_t.a(true)) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!ej.field_t.a("arialish12", (byte) 90)) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!ej.field_t.a("pump32", (byte) 90)) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    tm.field_h = true;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (tm.field_h) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    eh.field_c.a(true);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                case 53: {
                    if (this.field_c == param0) {
                        statePc = 56;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 56: {
                    ma.field_eb.a(0, -this.field_h + 0);
                    ob.field_z.a(0, 60 + this.field_k);
                    var2_int = 0;
                    var2_int = var2_int + pc.e(param0 + 127);
                    var2_int = var2_int + 10 * (fm.field_f[2] + fm.field_f[0] + fm.field_f[1]);
                    var2_int = var2_int + uf.a(param0 ^ 118, ge.field_m) * 10;
                    stackIn_59_0 = var2_int;
                    stackIn_57_0 = stackIn_59_0;
                    if (ve.a(ge.field_m, param0 + 1, 25)) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = stackIn_57_0;
                    stackIn_60_1 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = stackIn_59_0;
                    stackIn_60_1 = 10;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var2_int = stackIn_60_0 + stackIn_60_1;
                    var3 = 811;
                    var4 = -1 + 10 * var2_int / var3;
                    if (var4 > 9) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var4 = 9;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var5_int = 2 + (var3 + -var2_int) * 30 / var3;
                    if (var2_int != var3) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_68_0 = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var6_int = stackIn_68_0;
                    var2_int = var2_int * 279 / var3;
                    if (var6_int == 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var5_int = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var7 = 14419;
                    var8 = -var2_int + (450 - -this.field_k);
                    pb.a(550, this.field_k + 171, 560, 450 + this.field_k);
                    ta.a(10, var7, 0, 0, var7, 192, 550, var8, var5_int);
                    if (var8 - -var5_int < 450 + this.field_k) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    pb.c(550, var8 - -var5_int, 10, this.field_k + 450 - (var8 - -var5_int), var7, 192);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    pb.c();
                    fa.field_b.a((-fa.field_b.field_z + 640) / 2, -this.field_h + 15);
                    if (ni.b(param0 + 98)) {
                        statePc = 101;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((ul.field_d ^ -1) <= -3) {
                        statePc = 80;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var9 = 520;
                    var10 = this.field_k + 100;
                    var11_int = 100;
                    var12 = 34;
                    if (var9 > oh.field_f) {
                        statePc = 92;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((oh.field_f ^ -1) <= (var9 + var11_int ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var10 > pi.field_c) {
                        statePc = 92;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var12 + var10 <= pi.field_c) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_93_0 = 1;
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var13 = stackIn_93_0;
                    fb.a(var12, var10, "TESTING", var11_int, var9, param0 + 12490);
                    if (var13 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (!hg.field_h) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    ee.c(-2483, 97);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    hg.field_h = var13 != 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var2 = null;
                    var3 = 0;
                    var4 = 0;
                    var5_int = this.field_c;
                    if (-1 == (var5_int ^ -1)) {
                        statePc = 189;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if ((var5_int ^ -1) == -15) {
                        statePc = 177;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var5_int == 13) {
                        statePc = 178;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (-8 != (var5_int ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var19 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (6 != var5_int) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (var19 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (-6 != (var5_int ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var19 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var5_int != 8) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var19 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if ((var5_int ^ -1) != -20) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var19 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (20 == var5_int) {
                        statePc = 184;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if ((var5_int ^ -1) == -2) {
                        statePc = 185;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (var5_int != 2) {
                        statePc = 150;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var19 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (-4 != (var5_int ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var19 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (4 != var5_int) {
                        statePc = 162;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (var19 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if ((var5_int ^ -1) != -23) {
                        statePc = 168;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if ((var5_int ^ -1) == -18) {
                        statePc = 187;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (-19 != (var5_int ^ -1)) {
                        statePc = 189;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var19 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var2 = ti.field_A[28];
                    statePc = 189;
                    continue stateLoop;
                }
                case 178: {
                    var2 = ti.field_A[27];
                    statePc = 189;
                    continue stateLoop;
                }
                case 179: {
                    var2 = ti.field_A[5];
                    statePc = 189;
                    continue stateLoop;
                }
                case 180: {
                    var2 = ti.field_A[4];
                    statePc = 189;
                    continue stateLoop;
                }
                case 181: {
                    var2 = pa.field_j;
                    statePc = 189;
                    continue stateLoop;
                }
                case 182: {
                    var2 = ti.field_A[22];
                    statePc = 189;
                    continue stateLoop;
                }
                case 183: {
                    var2 = ti.field_A[0];
                    statePc = 189;
                    continue stateLoop;
                }
                case 184: {
                    var2 = cc.field_ic[ge.field_j];
                    statePc = 189;
                    continue stateLoop;
                }
                case 185: {
                    var4 = 1;
                    var2 = un.field_d;
                    var3 = 1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 186: {
                    var4 = 1;
                    var2 = un.field_e;
                    var3 = 1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 187: {
                    var2 = jd.field_pb;
                    statePc = 189;
                    continue stateLoop;
                }
                case 188: {
                    var2 = "TESTING ONLY";
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (var4 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var5_int = 60;
                    var5_int = var5_int + 30 * uc.field_e[this.field_c].length;
                    var6_int = -30 + this.b(0, (byte) 126);
                    var7 = -25 + this.g(param0 + 125, 0);
                    var8 = 640 - var7 * 2;
                    jm.a(var6_int, var5_int, eb.field_p, 1, var7, var8);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (-1 != (this.field_c ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var5_int = this.d((byte) 114);
                    fi.field_j.a(0, -5, 80, 7);
                    fi.field_j.a(0, 474 - var5_int, 80, 2 + var5_int / 8);
                    si.c(103);
                    if (var3 != 0) {
                        statePc = 216;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (this.field_c != 7) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (od.field_e) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (pm.field_U == 0) {
                        statePc = 216;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (-15 != (this.field_c ^ -1)) {
                        statePc = 263;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (0 != pm.field_U) {
                        statePc = 263;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (!kf.field_s) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (lg.field_l) {
                        statePc = 263;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (14 == this.field_c) {
                        statePc = 221;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var6 = bl.field_c;
                    var7_ref = kk.field_a;
                    if (-2 == (fg.field_Ob ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var7_ref = null;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (null == var6) {
                        statePc = 241;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    pb.a(0, 50, var6.field_Rb, -var5_int + 430, 0);
                    if (var6.field_cb <= 50) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    pb.a(var6.field_Rb, 50, var6.field_zb, var6.field_cb + -50, 0);
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if ((var6.field_Lb + var6.field_cb ^ -1) > (430 + -var5_int ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 234: {
                    pb.a(var6.field_Rb, var6.field_cb + var6.field_Lb, var6.field_zb, 430 + (-var5_int - var6.field_cb) + -var6.field_Lb, 0);
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (null != var7_ref) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    pb.a(var6.field_zb + var6.field_Rb, 50, -var6.field_zb + -var6.field_Rb + 640, -var5_int + 430, 0);
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    pb.a(var6.field_zb + var6.field_Rb, 50, -var6.field_Rb + (((gh) (var7_ref)).field_Rb - var6.field_zb), 430 - var5_int, 0);
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (null != var7_ref) {
                        statePc = 244;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (null == var6) {
                        statePc = 247;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 247: {
                    pb.a(0, 50, ((gh) (var7_ref)).field_Rb, 430 + -var5_int, 0);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (((gh) (var7_ref)).field_cb <= 50) {
                        statePc = 251;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    pb.a(((gh) (var7_ref)).field_Rb, 0, ((gh) (var7_ref)).field_zb, ((gh) (var7_ref)).field_cb, 0);
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (((gh) (var7_ref)).field_Lb + ((gh) (var7_ref)).field_cb < -var5_int + 430) {
                        statePc = 254;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 254: {
                    pb.a(((gh) (var7_ref)).field_Rb, ((gh) (var7_ref)).field_Lb + ((gh) (var7_ref)).field_cb, ((gh) (var7_ref)).field_zb, -((gh) (var7_ref)).field_cb + 480 + -((gh) (var7_ref)).field_Lb, 0);
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    pb.a(((gh) (var7_ref)).field_zb + ((gh) (var7_ref)).field_Rb, 50, 640 + -((gh) (var7_ref)).field_Rb + -((gh) (var7_ref)).field_zb, -var5_int + 430, 0);
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (var6 != null) {
                        statePc = 262;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (null != var7_ref) {
                        statePc = 262;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    pb.a(0, 50, 640, 630 + -var5_int, 0);
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (var19 == 0) {
                        statePc = 265;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    pb.a(0, 50, 640, -var5_int + 430, 0);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    hb.a((byte) -95, oa.field_U, 640, 49, 0, 431 + -var5_int);
                    var6_int = 50 + -ic.field_db.field_B;
                    ic.field_db.a(0, var6_int + -this.field_h);
                    pb.c(0, -this.field_h + 49, 640, 0, 128);
                    sh.a(-16088, 640, var5_int, 480 + -var5_int + this.field_k, 0);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (this.field_c != 17) {
                        statePc = 268;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var5_int = this.b(0, (byte) 87) + -30;
                    var6_int = 30 + this.b(uc.field_e[this.field_c].length + -5, (byte) -113) - -this.c(25, -5 + uc.field_e[this.field_c].length);
                    jm.a(var5_int, var6_int + -var5_int, eb.field_p, 1, 170, 300);
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (null != var2) {
                        statePc = 271;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 271: {
                    ql.field_Tb.a(ke.a(42, (String) (var2)), 320, 18 + (ql.field_Tb.field_G / 2 + -this.field_h), 0, -1);
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    var5_int = 0;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if ((var5_int ^ -1) <= (this.field_g.field_m ^ -1)) {
                        statePc = 295;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    stackOut_274_0 = this.e(var5_int, param0 + 20);
                    stackIn_296_0 = stackOut_274_0 ? 1 : 0;
                    stackIn_275_0 = stackOut_274_0;
                    if (var19 != 0) {
                        statePc = 296;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (stackIn_275_0) {
                        statePc = 279;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if ((this.b(param0 + -103, var5_int) ^ -1) > -1) {
                        statePc = 287;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    stackIn_285_0 = this;
                    stackIn_281_0 = stackIn_285_0;
                    stackIn_285_1 = -124;
                    stackIn_281_1 = stackIn_285_1;
                    stackIn_285_2 = var5_int;
                    stackIn_281_2 = stackIn_285_2;
                    if ((var5_int ^ -1) != (this.field_g.field_e ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackIn_283_0 = this;
                    stackIn_283_1 = stackIn_281_1;
                    stackIn_283_2 = stackIn_281_2;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    stackIn_286_0 = this;
                    stackIn_286_1 = stackIn_283_1;
                    stackIn_286_2 = stackIn_283_2;
                    stackIn_286_3 = 1;
                    statePc = 286;
                    continue stateLoop;
                }
                case 285: {
                    stackIn_286_0 = this;
                    stackIn_286_1 = stackIn_285_1;
                    stackIn_286_2 = stackIn_285_2;
                    stackIn_286_3 = 0;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    this.a(stackIn_286_1, stackIn_286_2, stackIn_286_3 != 0);
                    if (var19 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackIn_292_0 = this;
                    stackIn_288_0 = stackIn_292_0;
                    stackIn_292_1 = var5_int;
                    stackIn_288_1 = stackIn_292_1;
                    if (this.field_g.field_e != var5_int) {
                        statePc = 292;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    stackIn_290_0 = this;
                    stackIn_290_1 = stackIn_288_1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackIn_293_0 = this;
                    stackIn_293_1 = stackIn_290_1;
                    stackIn_293_2 = 1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 292: {
                    stackIn_293_0 = this;
                    stackIn_293_1 = stackIn_292_1;
                    stackIn_293_2 = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    this.a(stackIn_293_1, stackIn_293_2 != 0, 30241);
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var5_int++;
                    if (var19 == 0) {
                        statePc = 273;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    var5_int = this.field_c;
                    stackIn_296_0 = var5_int;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (stackIn_296_0 != 5) {
                        statePc = 300;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (var19 == 0) {
                        statePc = 368;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if (-7 != (var5_int ^ -1)) {
                        statePc = 306;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (var19 == 0) {
                        statePc = 369;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (7 == var5_int) {
                        statePc = 372;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if ((var5_int ^ -1) != -9) {
                        statePc = 315;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (var19 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if ((var5_int ^ -1) != -10) {
                        statePc = 321;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (var19 == 0) {
                        statePc = 378;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (10 == var5_int) {
                        statePc = 381;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (var5_int != 13) {
                        statePc = 330;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if ((var5_int ^ -1) != -15) {
                        statePc = 336;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    if (var19 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if (11 != var5_int) {
                        statePc = 342;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (var19 == 0) {
                        statePc = 387;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if (var5_int != 16) {
                        statePc = 348;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (var19 == 0) {
                        statePc = 388;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (-18 != (var5_int ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    if (18 != var5_int) {
                        statePc = 360;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (var19 == 0) {
                        statePc = 391;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (19 == var5_int) {
                        statePc = 394;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (20 == var5_int) {
                        statePc = 477;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 368: {
                    this.c(-87);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    this.p(-119);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    this.i((byte) -127);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    this.a(48, false);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    this.a(48, true);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    this.f(param0 ^ 126);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    ff.g((byte) 35);
                    statePc = 479;
                    continue stateLoop;
                }
                case 387: {
                    va.field_j.a(ll.field_s, 40, 150, 600, 1000, 1021128, -1, 0, 0, 0);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    this.h(7165);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    this.m(param0 + 126);
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    if (uc.field_e[this.field_c] != fa.field_c) {
                        statePc = 448;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    var5_array = new int[3];
                    var6_int = 0;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if ((var6_int ^ -1) <= -4) {
                        statePc = 403;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var5_array[var6_int] = (this.g(127, var6_int * 10) + this.a(10 * var6_int, (byte) 110)) / 2;
                    ui.field_U.a(ke.a(42, cc.field_ic[var6_int]), var5_array[var6_int], 98, 1021128, -1);
                    var6_int++;
                    if (var19 != 0) {
                        statePc = 404;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (var19 == 0) {
                        statePc = 398;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    var6_int = 0;
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    if (30 <= var6_int) {
                        statePc = 418;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    stackIn_419_0 = var6_int ^ -1;
                    stackIn_406_0 = stackIn_419_0;
                    stackIn_419_1 = -11;
                    stackIn_406_1 = stackIn_419_1;
                    if (var19 != 0) {
                        statePc = 419;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    stackIn_408_0 = stackIn_406_0;
                    stackIn_408_1 = stackIn_406_1;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (stackIn_408_0 > stackIn_408_1) {
                        statePc = 414;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if (0 < fm.field_f[var6_int / 10]) {
                        statePc = 416;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    stackIn_417_0 = 0;
                    statePc = 417;
                    continue stateLoop;
                }
                case 416: {
                    stackIn_417_0 = 21;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    var7 = stackIn_417_0;
                    var8 = 74;
                    pb.h(this.g(126, var6_int + 0) - 4, var8, this.a(0 + var6_int, (byte) 112) - (this.g(126, 0 + var6_int) - 8), this.b(9 + var6_int, (byte) 32) - (-this.c(25, 9 + var6_int) - 4) + (-var8 + var7), 3158064);
                    var6_int += 10;
                    if (var19 == 0) {
                        statePc = 404;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    stackIn_419_0 = 0;
                    stackIn_419_1 = fm.field_f[1];
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if (stackIn_419_0 >= stackIn_419_1) {
                        statePc = 433;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (-11 == (fm.field_f[1] ^ -1)) {
                        statePc = 425;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    stackIn_426_0 = 1656673;
                    statePc = 426;
                    continue stateLoop;
                }
                case 425: {
                    stackIn_426_0 = 1021128;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    var6_int = stackIn_426_0;
                    var7 = 0;
                    var8 = 0;
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if ((var8 ^ -1) <= (fm.field_f[1] ^ -1)) {
                        statePc = 432;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    var7 = var7 + jh.field_a[var8];
                    var8++;
                    if (var19 != 0) {
                        statePc = 433;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (var19 == 0) {
                        statePc = 427;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    pl.field_U.a(ic.field_E + qa.a(-1, var7), var5_array[1], this.b(19, (byte) -125) + (this.c(param0 + 25, 19) - -17), var6_int, -1);
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if (0 < fm.field_f[2]) {
                        statePc = 436;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 436: {
                    if (fm.field_f[2] == 10) {
                        statePc = 439;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    stackIn_440_0 = 1656673;
                    statePc = 440;
                    continue stateLoop;
                }
                case 439: {
                    stackIn_440_0 = 1021128;
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    var6_int = stackIn_440_0;
                    var7 = 0;
                    var8 = 0;
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    if ((var8 ^ -1) <= (fm.field_f[2] ^ -1)) {
                        statePc = 446;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    var7 = var7 + jh.field_a[var8 + 10];
                    var8++;
                    if (var19 != 0) {
                        statePc = 479;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    if (var19 == 0) {
                        statePc = 441;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    pl.field_U.a(ic.field_E + qa.a(param0 ^ -1, var7), var5_array[2], 17 + (this.b(29, (byte) 108) - -this.c(25, 29)), var6_int, -1);
                    statePc = 479;
                    continue stateLoop;
                }
                case 448: {
                    ui.field_U.a(ke.a(42, cc.field_ic[0]), 180, 98, 1021128, -1);
                    ui.field_U.a(ke.a(42, cc.field_ic[1]), 460, 98, 1021128, -1);
                    var5_int = 0;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    if (var5_int >= 20) {
                        statePc = 461;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    stackIn_465_0 = var5_int;
                    stackIn_451_0 = stackIn_465_0;
                    stackIn_465_1 = 10;
                    stackIn_451_1 = stackIn_465_1;
                    if (var19 != 0) {
                        statePc = 465;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if (stackIn_451_0 < stackIn_451_1) {
                        statePc = 457;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if (-1 > (fm.field_f[var5_int / 10] ^ -1)) {
                        statePc = 459;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 457: {
                    stackIn_460_0 = 0;
                    statePc = 460;
                    continue stateLoop;
                }
                case 459: {
                    stackIn_460_0 = 21;
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    var6_int = stackIn_460_0;
                    var7 = 74;
                    pb.h(-4 + this.g(127, var5_int + 0), var7, this.a(var5_int - 0, (byte) 115) - (this.g(126, 0 + var5_int) - 8), -var7 + (4 + this.b(9 + var5_int, (byte) -103)) + (this.c(25, var5_int - -9) - -var6_int), 3158064);
                    var5_int += 10;
                    if (var19 == 0) {
                        statePc = 449;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    if (fm.field_f[1] > 0) {
                        statePc = 464;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 464: {
                    stackIn_465_0 = fm.field_f[1] ^ -1;
                    stackIn_465_1 = -11;
                    statePc = 465;
                    continue stateLoop;
                }
                case 465: {
                    if (stackIn_465_0 != stackIn_465_1) {
                        statePc = 468;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    stackIn_469_0 = 1021128;
                    statePc = 469;
                    continue stateLoop;
                }
                case 468: {
                    stackIn_469_0 = 1656673;
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    var5_int = stackIn_469_0;
                    var6_int = 0;
                    var7 = 0;
                    statePc = 470;
                    continue stateLoop;
                }
                case 470: {
                    if ((fm.field_f[1] ^ -1) >= (var7 ^ -1)) {
                        statePc = 475;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    var6_int = var6_int + jh.field_a[var7];
                    var7++;
                    if (var19 != 0) {
                        statePc = 476;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 472: {
                    if (var19 == 0) {
                        statePc = 470;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    pl.field_U.a(ic.field_E + qa.a(param0 + -1, var6_int), (this.g(127, 19) - -this.a(19, (byte) 120)) / 2, this.b(19, (byte) 76) - (-this.c(25, 19) - 17), var5_int, -1);
                    statePc = 476;
                    continue stateLoop;
                }
                case 476: {
                    if (var19 == 0) {
                        statePc = 479;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    this.n(21345);
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    if (14 != this.field_c) {
                        statePc = 482;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 482: {
                    sn.field_q = -1;
                    statePc = 483;
                    continue stateLoop;
                }
                case 483: {
                    if (-1 < (sn.field_q ^ -1)) {
                        statePc = 487;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    if (var4 == 0) {
                        statePc = 565;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    if (!gh.field_J) {
                        statePc = 512;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    if (var4 != 0) {
                        statePc = 512;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    km.field_a = ee.field_I;
                    pb.c(0, 0, 640, 480, 0, 128);
                    var5_ref = ff.field_lb;
                    var6_int = ((mi) ((Object) var5_ref)).a(ee.field_I, 424, 0);
                    var6_int += 54;
                    var7 = (480 - var6_int) / 2;
                    ak.a((wk) null, var7, km.field_a, 440, 100, -2, var6_int, 1071146, (String[]) null, true);
                    var8 = 30;
                    var9 = 100;
                    var10 = 110;
                    var11_int = -var8 + -8 + (var7 + var6_int);
                    var12 = ln.field_g;
                    ln.field_g = -1;
                    if (nm.a(var11_int, var10, 123, sn.field_h, var8, var9)) {
                        statePc = 496;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 496: {
                    ln.field_g = 0;
                    statePc = 497;
                    continue stateLoop;
                }
                case 497: {
                    var10 = var10 + (var9 - -10);
                    var9 = 200;
                    if (!nm.a(var11_int, var10, 126, cf.field_v, var8, var9)) {
                        statePc = 500;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    ln.field_g = 1;
                    statePc = 500;
                    continue stateLoop;
                }
                case 500: {
                    var10 = var10 + (var9 - -10);
                    var9 = 100;
                    if (nm.a(var11_int, var10, 116, tj.field_b, var8, var9)) {
                        statePc = 503;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 503: {
                    ln.field_g = 2;
                    statePc = 504;
                    continue stateLoop;
                }
                case 504: {
                    if (ln.field_g == var12) {
                        statePc = 511;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    if ((ln.field_g ^ -1) != 0) {
                        statePc = 510;
                    } else {
                        statePc = 511;
                    }
                    continue stateLoop;
                }
                case 510: {
                    ee.c(-2483, 97);
                    statePc = 511;
                    continue stateLoop;
                }
                case 511: {
                    if (var19 == 0) {
                        statePc = 583;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 512: {
                    if (null == km.field_a) {
                        statePc = 583;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 515: {
                    if (var4 != 0) {
                        statePc = 583;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 518: {
                    var5_int = 300;
                    if (km.field_a == td.field_ac) {
                        statePc = 524;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    if (ra.field_b == km.field_a) {
                        statePc = 524;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 524: {
                    var5_int = 330;
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    var6_int = (-var5_int + 640) / 2;
                    pb.c(0, 0, 640, 480, 0, 128);
                    var7_ref = ff.field_lb;
                    var8 = ((mi) (var7_ref)).a(km.field_a, var5_int + -16, 0);
                    var9 = 0;
                    if (null == ln.field_c) {
                        statePc = 527;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    var9 = ln.field_c.field_F - -4;
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    var8 = var8 + (var9 + 52);
                    var10 = (-var8 + 480) / 2;
                    var11 = al.field_f;
                    if (td.field_ac == km.field_a) {
                        statePc = 533;
                    } else {
                        statePc = 528;
                    }
                    continue stateLoop;
                }
                case 528: {
                    if (km.field_a == ra.field_b) {
                        statePc = 533;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var11 = null;
                    statePc = 534;
                    continue stateLoop;
                }
                case 534: {
                    var12 = ak.a(ln.field_c, var10, km.field_a, var5_int, var6_int, param0 + -2, var8, 1071146, var11, true);
                    var13 = 30;
                    var14 = 100;
                    var15 = (-var14 + 640) / 2;
                    var16 = -8 + (var8 + var10) - var13;
                    if (td.field_ac == km.field_a) {
                        statePc = 552;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    if (ra.field_b == km.field_a) {
                        statePc = 552;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 538: {
                    if ((var12 ^ -1) > -1) {
                        statePc = 547;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (!gd.field_ub) {
                        statePc = 546;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 546: {
                    ee.c(-2483, 97);
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    if (var12 < 0) {
                        statePc = 550;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    stackIn_551_0 = 1;
                    statePc = 551;
                    continue stateLoop;
                }
                case 550: {
                    stackIn_551_0 = 0;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    gd.field_ub = stackIn_551_0 != 0;
                    if (var19 == 0) {
                        statePc = 564;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    var17 = ln.field_g;
                    var14 = 100;
                    ln.field_g = -1;
                    var15 = 165;
                    var18 = nm.a(var16, var15, 124, ma.field_Z, var13, var14) ? 1 : 0;
                    if (var18 == 0) {
                        statePc = 558;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    if (gd.field_ub) {
                        statePc = 558;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    ee.c(-2483, 97);
                    statePc = 558;
                    continue stateLoop;
                }
                case 558: {
                    var15 = var15 + (10 + var14);
                    gd.field_ub = var18 != 0;
                    var14 = 200;
                    var18 = nm.a(var16, var15, 121, cf.field_v, var13, var14) ? 1 : 0;
                    if (var18 == 0) {
                        statePc = 564;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    ln.field_g = 0;
                    if ((var17 ^ -1) == -1) {
                        statePc = 564;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    ee.c(param0 + -2483, 97);
                    statePc = 564;
                    continue stateLoop;
                }
                case 564: {
                    if (var19 == 0) {
                        statePc = 583;
                    } else {
                        statePc = 565;
                    }
                    continue stateLoop;
                }
                case 565: {
                    ln.field_c = b.field_q[1];
                    km.field_a = pg.field_y;
                    var5_array = null;
                    if ((sn.field_q & 128) != 0) {
                        statePc = 573;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    if (sn.field_q == 34) {
                        statePc = 571;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var5_ref2 = "GODULE";
                    statePc = 572;
                    continue stateLoop;
                }
                case 572: {
                    var5_ref2 = rj.field_m[sn.field_q];
                    statePc = 574;
                    continue stateLoop;
                }
                case 573: {
                    var5_ref2 = t.field_e[-128 + sn.field_q];
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    km.field_a = db.a(km.field_a, -22, new String[]{var5_ref2, Integer.toString(f.field_v), Integer.toString(li.field_v)});
                    pb.c(0, 0, 640, 480, 0, 128);
                    var6_ref = ff.field_lb;
                    var7 = ln.field_c.field_F;
                    var8 = ((mi) ((Object) var6_ref)).a(km.field_a, 284, 16);
                    var8 = var8 + (50 + var7);
                    var9 = (-var8 + 480) / 2;
                    var10 = ak.a(ln.field_c, var9, km.field_a, 300, 170, -2, var8, 1071146, el.field_Vb, true);
                    if (0 > var10) {
                        statePc = 580;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    if (jl.field_p == var10) {
                        statePc = 580;
                    } else {
                        statePc = 578;
                    }
                    continue stateLoop;
                }
                case 578: {
                    ee.c(-2483, 97);
                    statePc = 580;
                    continue stateLoop;
                }
                case 580: {
                    jl.field_p = var10;
                    statePc = 583;
                    continue stateLoop;
                }
                case 583: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (-1 != this.field_g.field_e) {
            param1 = this.field_g.field_e;
        }
        this.field_g.a(param0, param1, 0, this.a(oh.field_f, pi.field_c, 77));
        gb.field_a = a.field_c;
        if (param2 >= -56) {
            return;
        }
        try {
            in.field_k = -1;
            ao.field_C = -1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    if (1 == param2) {
                      L3: {
                        var4_int = param1;
                        if (-1 != (var4_int ^ -1)) {
                          break L3;
                        } else {
                          if (var5 == 0) {
                            stackIn_126_0 = 3;
                            decompiledRegionSelector0 = 11;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (-2 == (var4_int ^ -1)) {
                        stackIn_128_0 = 6;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      } else {
                        L4: {
                          if ((var4_int ^ -1) != -3) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              stackIn_130_0 = 9;
                              decompiledRegionSelector0 = 13;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if ((var4_int ^ -1) != -4) {
                            break L5;
                          } else {
                            if (var5 == 0) {
                              stackIn_132_0 = 9;
                              decompiledRegionSelector0 = 14;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-5 != (var4_int ^ -1)) {
                            break L6;
                          } else {
                            if (var5 == 0) {
                              stackIn_134_0 = 3;
                              decompiledRegionSelector0 = 15;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if ((var4_int ^ -1) == -6) {
                          stackIn_136_0 = 5;
                          decompiledRegionSelector0 = 16;
                          break L0;
                        } else {
                          if (-7 == (var4_int ^ -1)) {
                            stackIn_138_0 = 5;
                            decompiledRegionSelector0 = 17;
                            break L0;
                          } else {
                            L7: {
                              if (var4_int != 7) {
                                break L7;
                              } else {
                                if (var5 == 0) {
                                  stackIn_140_0 = 9;
                                  decompiledRegionSelector0 = 18;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var4_int != 8) {
                                break L8;
                              } else {
                                if (var5 == 0) {
                                  stackIn_142_0 = 5;
                                  decompiledRegionSelector0 = 19;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (9 == var4_int) {
                              stackIn_144_0 = 7;
                              decompiledRegionSelector0 = 20;
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      L9: {
                        L10: {
                          var4_int = param1;
                          if ((var4_int ^ -1) != -1) {
                            break L10;
                          } else {
                            if (var5 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var4_int != 1) {
                            break L11;
                          } else {
                            if (var5 == 0) {
                              stackIn_60_0 = 7;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (2 != var4_int) {
                            break L12;
                          } else {
                            if (var5 == 0) {
                              stackIn_62_0 = 7;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (3 == var4_int) {
                          stackIn_64_0 = 7;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L13: {
                            if (var4_int != 4) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                stackIn_66_0 = 7;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (var4_int == 5) {
                            stackIn_68_0 = 7;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (var4_int == 6) {
                              stackIn_70_0 = 10;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              L14: {
                                if (7 != var4_int) {
                                  break L14;
                                } else {
                                  if (var5 == 0) {
                                    stackIn_72_0 = 7;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                if ((var4_int ^ -1) != -9) {
                                  break L15;
                                } else {
                                  if (var5 == 0) {
                                    stackIn_74_0 = 10;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if ((var4_int ^ -1) != -10) {
                                break L2;
                              } else {
                                if (var5 == 0) {
                                  stackIn_76_0 = 7;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_58_0 = 5;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  if (param0 < -66) {
                    stackIn_149_0 = 0;
                    decompiledRegionSelector0 = 22;
                    break L0;
                  } else {
                    stackIn_147_0 = -100;
                    decompiledRegionSelector0 = 21;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_6_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_58_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_60_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_62_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_64_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_66_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_68_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_70_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_72_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_74_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_76_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_126_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_128_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_130_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_132_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_134_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_136_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_138_0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_140_0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_142_0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_144_0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_147_0;
                                                  } else {
                                                    return stackIn_149_0;
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

    private final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 16383) {
                break L1;
              } else {
                this.a(53, false);
                break L1;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.Q(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        boolean stackIn_113_0 = false;
        boolean stackIn_135_0 = false;
        int stackIn_241_0 = 0;
        gh stackIn_252_0 = null;
        gh stackIn_304_0 = null;
        int stackIn_305_0 = 0;
        gh stackIn_308_0 = null;
        int stackIn_312_0 = 0;
        gh stackIn_314_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_112_0;
        boolean stackOut_134_0;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        kg var3 = null;
        gh var3_ref = null;
        int var4_int = 0;
        gh var4 = null;
        int var5_int = 0;
        gh var5 = null;
        int var6_int = 0;
        gh var6 = null;
        Object var7 = null;
        int var7_int = 0;
        int var8_int = 0;
        gh var8 = null;
        int var9_int = 0;
        gh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gh var13 = null;
        String[] var14 = null;
        gh var14_ref = null;
        int var15_int = 0;
        gh var15 = null;
        int var16_int = 0;
        gh var16 = null;
        int var17_int = 0;
        lb var17 = null;
        gh[] var18 = null;
        kg var18_ref = null;
        int var19_int = 0;
        gh var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        gh var22 = null;
        int var23 = 0;
        int var24 = 0;
        String var25_ref_String = null;
        int var25 = 0;
        int var26 = 0;
        gh var26_ref_gh = null;
        gh var27 = null;
        int var27_int = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var31 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= -28) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.q(-72);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var2_int = ha.field_V;
                    ha.field_V = -1;
                    od.field_e = false;
                    if (0 == pm.field_U) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    od.field_e = true;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (null != gd.field_sb) {
                        statePc = 10;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = nf.field_a;
                    var4_int = var3.field_Ub.field_eb;
                    var5_int = ef.field_c;
                    if ((var5_int ^ -1) != -105) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var31 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var5_int ^ -1) == -106) {
                        statePc = 20;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3.field_Ub.field_gb = var3.field_Ub.field_gb + Math.min(-20 + var3.field_Lb, -var3.field_Ub.field_eb);
                    if (var31 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3.field_Ub.field_gb = var3.field_Ub.field_gb - Math.min(var3.field_Lb - 20, var3.field_Ub.field_Lb + -var3.field_Lb + var3.field_Ub.field_eb);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    gd.field_sb.a((byte) -44, true);
                    var5_int = -1;
                    if (null == var3) {
                        statePc = 58;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var3.a((byte) 96, jj.field_d * 32, 128, false, 32);
                    var6_int = var3.field_Ub.field_eb;
                    var7 = null;
                    var8_int = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var8_int >= 32) {
                        statePc = 54;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (null == ck.field_f[var8_int]) {
                        statePc = 54;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var9_int = hc.field_R[var8_int] + (10 - -(ff.field_lb.field_W / 2));
                    if ((var9_int ^ -1) <= (-var6_int ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = ck.field_f[var8_int];
                    if (98 != ef.field_c) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5_int = var8_int;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ck.field_f[var8_int].field_nb = 2061990;
                    if (ck.field_f[var8_int].field_kb) {
                        statePc = 32;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ck.field_f[var8_int].field_nb = 0;
                    if (var31 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-var6_int + var3.field_Tb.field_Lb > var9_int) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ck.field_f[var8_int].field_nb = 2061990;
                    if (!ck.field_f[var8_int].field_kb) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ck.field_f[var8_int].field_nb = 0;
                    if (var31 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var7 = null;
                    ck.field_f[var8_int].field_nb = 10526880;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((ef.field_c ^ -1) != -100) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var5_int ^ -1) <= -1) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var9_int > -var6_int + 20) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var5_int = var8_int;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var8_int++;
                    if (var31 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var7 != null) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ((gh) (var7)).field_nb = 10526880;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    ef.field_c = 0;
                    if (0 > var5_int) {
                        statePc = 68;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var3.field_Ub.field_gb = -4 + (-var3.field_Ub.field_eb + -hc.field_R[var5_int]);
                    if (-var3.field_Ub.field_eb >= var3.field_Ub.field_gb) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (-var3.field_Ub.field_Lb - (var3.field_Ub.field_lb + (-var3.field_Tb.field_Lb + var3.field_Ub.field_eb)) > var3.field_Ub.field_gb) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + -var3.field_Ub.field_Lb - -var3.field_Tb.field_Lb);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var6 = gd.field_sb.a("HeadingsPane", false);
                    if (null == var6) {
                        statePc = 104;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (null == var3) {
                        statePc = 104;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var6.field_kb) {
                        statePc = 77;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var7_int = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var7_int >= 32) {
                        statePc = 104;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (null == ck.field_f[var7_int]) {
                        statePc = 104;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (ck.field_f[var7_int].field_kb) {
                        statePc = 85;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ha.field_V = var7_int;
                    if (-2 == (lb.field_gc ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var2_int != var7_int) {
                        statePc = 91;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var2_int = var7_int;
                    ee.c(-2483, 97);
                    if (var31 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    ee.c(-2483, 95);
                    var3.field_Ub.field_gb = -hc.field_R[var7_int] - var3.field_Ub.field_eb + -4;
                    if (var3.field_Ub.field_gb <= -var3.field_Ub.field_eb) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (-var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + -var3.field_Ub.field_Lb + var3.field_Tb.field_Lb) > var3.field_Ub.field_gb) {
                        statePc = 100;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + (-var3.field_Ub.field_Lb - -var3.field_Tb.field_Lb));
                    if (var31 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var7_int++;
                    if (var31 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var3.field_Ub.field_eb != var4_int) {
                        statePc = 107;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 107: {
                    od.field_e = true;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (gd.field_sb == null) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                case 110: {
                    od.field_e = true;
                    gd.field_sb = new gh();
                    gd.field_sb.a(0, 0, 480, 0, 640);
                    var3_ref = new gh("DataView", (gh) null);
                    pf.field_n = 4;
                    bg.field_y = 4;
                    bi.field_d = 15;
                    var4 = new gh();
                    var4.field_nb = 10526880;
                    var4.field_L = (mi) ((Object) ff.field_lb);
                    var5 = new gh(-1L, var4);
                    var5.field_I = gf.field_c;
                    var5.field_nb = 0;
                    var6 = new gh();
                    var6.field_Kb = 1;
                    var6.field_Fb = 1;
                    var6.field_I = pd.field_T;
                    var7 = new gh(-1L, var5);
                    ((gh) (var7)).field_ub = 3;
                    ((gh) (var7)).field_Ib = 10;
                    ((gh) (var7)).field_I = sa.field_e;
                    ((gh) (var7)).field_nb = 2061990;
                    ((gh) (var7)).field_Ab = wc.field_d;
                    ((gh) (var7)).field_Kb = 1;
                    ((gh) (var7)).field_L = (mi) ((Object) fk.field_d);
                    ((gh) (var7)).field_sb = 0;
                    var5.field_Kb = 1;
                    var5.field_L = (mi) ((Object) pl.field_U);
                    var8 = new gh();
                    var8.field_I = tk.field_t;
                    var4.field_Fb = 1;
                    var9 = new gh("HeadingsPane", (gh) null);
                    jj.field_a = var9;
                    var9.a(0, 60, 370, 16, 106);
                    var10 = 4;
                    var11 = 0;
                    var12 = -5;
                    var13_int = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if ((var13_int ^ -1) <= (wc.field_g.length ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var14 = wc.field_g[var13_int];
                    var15_int = 0;
                    stackOut_112_0 = nk.f((byte) -96);
                    stackIn_305_0 = stackOut_112_0 ? 1 : 0;
                    stackIn_113_0 = stackOut_112_0;
                    if (var31 != 0) {
                        statePc = 305;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (stackIn_113_0) {
                        statePc = 128;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var13_int < 62) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (63 >= var13_int) {
                        statePc = 301;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (65 > var13_int) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var13_int <= 67) {
                        statePc = 301;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16_int = 0;
                    if (var14 == null) {
                        statePc = 301;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (0 == var14.length) {
                        statePc = 301;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var17_int = 0;
                    var18 = new gh[var14.length];
                    var19_int = 0;
                    var20 = 0;
                    var21 = 0;
                    var22_int = 0;
                    var23 = 0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var23 >= var14.length) {
                        statePc = 240;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var24 = -1;
                    var25_ref_String = var14[var23];
                    var26 = 0;
                    stackOut_134_0 = var25_ref_String.startsWith("<lock>");
                    stackIn_241_0 = stackOut_134_0 ? 1 : 0;
                    stackIn_135_0 = stackOut_134_0;
                    if (var31 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (stackIn_135_0) {
                        statePc = 139;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var25_ref_String = var25_ref_String.substring(6);
                    if (nk.f((byte) -20)) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var26 = 1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var25_ref_String.startsWith("<top>")) {
                        statePc = 150;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (!var25_ref_String.startsWith("<centre>")) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var25_ref_String = var25_ref_String.substring(8);
                    var24 = 1;
                    if (var31 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (!var25_ref_String.startsWith("<bottom>")) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var25_ref_String = var25_ref_String.substring(8);
                    var24 = 2;
                    if (var31 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var24 = 0;
                    var25_ref_String = var25_ref_String.substring(5);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var25_ref_String.equals("<lockpic>")) {
                        statePc = 227;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (!var25_ref_String.startsWith("<pic")) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (var14[var23].endsWith(">")) {
                        statePc = 189;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (!var25_ref_String.startsWith("<h>")) {
                        statePc = 168;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var18[var23] = new gh((long)var11, var5);
                    if (var16_int == 0) {
                        statePc = 166;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var16_int = 1;
                    var12 += 10;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var18[var23].field_S = var25_ref_String.substring(3);
                    var27 = new gh((long)var11, (gh) (var7));
                    var27.field_S = ke.a(42, var18[var23].field_S);
                    var28 = var27.field_L.a(var27.field_S, -(var27.field_ub * 2) + 106, var27.field_Ib) + 3;
                    var27.a(0, var10, var28, 0, 106);
                    var10 = var10 + (var28 - -4);
                    var9.a(var27, 125);
                    ck.field_f[var11] = var27;
                    hc.field_R[var11] = -10 + var12;
                    var11++;
                    var21++;
                    if (var31 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (dm.field_c) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var25_ref_String = ln.a(" <img=13> <img=14> <img=15>", (byte) 11, "", var25_ref_String);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (!tj.field_a) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, bc.field_yb, var25_ref_String);
                    if (var31 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, i.field_a, var25_ref_String);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    var18[var23] = new gh(-1L, var4);
                    var18[var23].field_S = var25_ref_String;
                    if (var19_int != 0) {
                        statePc = 180;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var18[var23].field_Ib = 19;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var15_int != 0) {
                        statePc = 184;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var18[var23].field_I = pd.field_T;
                    var18[var23].field_ub = 8;
                    var18[var23].field_sb = 6;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    var21++;
                    if (var26 != 0) {
                        statePc = 188;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var18[var23].field_Pb = sj.field_F;
                    if (var31 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var18[var23] = new gh(-1L, var6);
                    var27_int = Integer.parseInt(var25_ref_String.substring(4, var25_ref_String.length() + -1));
                    var18[var23].field_Pb = ja.b(var27_int, true);
                    var28 = 0;
                    if (-101 < (var27_int ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (-201 >= (var27_int ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var18[var23].field_I = null;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    var29 = 4;
                    if (200 <= var27_int) {
                        statePc = 211;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (5 == var27_int) {
                        statePc = 211;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (7 == var27_int) {
                        statePc = 211;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (9 > var27_int) {
                        statePc = 208;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (12 >= var27_int) {
                        statePc = 211;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var27_int != 22) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var29 = 12;
                    var20 = var20 | 1 << var23;
                    var28 = 48;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (3 == var27_int) {
                        statePc = 215;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var19_int = 1;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (var18[var23].field_Pb == null) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var18[var23].field_Pb = g.field_d;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (var26 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var18[var23].field_Pb = ug.field_P;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (var28 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var28 = var29 + var18[var23].field_Pb.field_A;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var22_int = var22_int + var28;
                    if (var31 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (nk.f((byte) -87)) {
                        statePc = 231;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var18[var23] = new gh(-1L, var6);
                    var18[var23].field_Pb = sj.field_F;
                    var22_int = var22_int + (var18[var23].field_Pb.field_A + 4);
                    if (var31 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var17_int++;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (-1 == var24) {
                        statePc = 239;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var18[var23] == null) {
                        statePc = 239;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var18[var23].field_Fb = var24;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var23++;
                    if (var31 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var22_int = var22_int + (var14.length + (1 + -var17_int)) * 8;
                    var23 = 0;
                    stackIn_241_0 = -1;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (stackIn_241_0 > (var21 ^ -1)) {
                        statePc = 244;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var23 = (470 + -var22_int) / var21;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (var16_int != 0) {
                        statePc = 248;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var23 = 464;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var24 = 0;
                    var25 = 0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (var25 >= var18.length) {
                        statePc = 273;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var26_ref_gh = var18[var25];
                    stackIn_304_0 = (gh) (var26_ref_gh);
                    stackIn_252_0 = stackIn_304_0;
                    if (var31 != 0) {
                        statePc = 304;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (stackIn_252_0 == null) {
                        statePc = 272;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var27_int = 0;
                    if (var26_ref_gh.field_Pb != null) {
                        statePc = 265;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var28 = var23;
                    if (var15_int != 0) {
                        statePc = 259;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var28 -= 16;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    var27_int = var26_ref_gh.field_L.a(var26_ref_gh.field_S, var28, var26_ref_gh.field_Ib);
                    if (var15_int != 0) {
                        statePc = 263;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var27_int += 16;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (var31 == 0) {
                        statePc = 270;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (-1 != (1 << var25 & var20 ^ -1)) {
                        statePc = 269;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var27_int = var26_ref_gh.field_Pb.field_F + 4;
                    if (var31 == 0) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var27_int = 12 + var26_ref_gh.field_Pb.field_F;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (var27_int <= var24) {
                        statePc = 272;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var24 = var27_int;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    var25++;
                    if (var31 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var25 = 8;
                    if (var16_int == 0) {
                        statePc = 276;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var25 += 4;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if (var18.length != 1) {
                        statePc = 285;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (var18[0] == null) {
                        statePc = 285;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (var18[0].field_Pb == null) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var25 = (-var18[0].field_Pb.field_A + 480) / 2;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    var26 = 0;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if ((var26 ^ -1) <= (var18.length ^ -1)) {
                        statePc = 300;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var27 = var18[var26];
                    if (var31 != 0) {
                        statePc = 302;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (null != var27) {
                        statePc = 293;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var28 = var23;
                    var29 = var24;
                    if (var27.field_Pb == null) {
                        statePc = 298;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var30 = 4;
                    var29 = var30 + var27.field_Pb.field_F;
                    var28 = var27.field_Pb.field_A + var30;
                    if (0 != (1 << var26 & var20)) {
                        statePc = 297;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var28 = 48;
                    var29 = 48;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    var27.a(0, (-var29 + var24) / 2 + var12, var29, var25, var28);
                    var3_ref.a(var27, 124);
                    var25 = var25 + (8 + var28);
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    var26++;
                    if (var31 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var12 = var12 + (4 + var24);
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    var13_int++;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (var31 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackIn_304_0 = (gh) (var3_ref);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    ((gh) (Object) stackIn_304_0).a(0, 0, var12, 0, 480);
                    stackIn_305_0 = 0;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    var13_int = stackIn_305_0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (var11 <= var13_int) {
                        statePc = 313;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    stackIn_314_0 = new gh(-1L, var8);
                    stackIn_308_0 = stackIn_314_0;
                    if (var31 != 0) {
                        statePc = 314;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var14_ref = stackIn_308_0;
                    var15_int = -10 + (5 + (hc.field_R[var13_int] - -10));
                    if ((var11 ^ -1) >= (1 + var13_int ^ -1)) {
                        statePc = 311;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    stackIn_312_0 = hc.field_R[1 + var13_int];
                    statePc = 312;
                    continue stateLoop;
                }
                case 311: {
                    stackIn_312_0 = var12;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    var16_int = stackIn_312_0;
                    var14_ref.a(0, var15_int, -var15_int + var16_int, 4, 472);
                    var3_ref.a(var14_ref, 121);
                    var13_int++;
                    if (var31 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    stackIn_314_0 = new gh();
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    var13 = stackIn_314_0;
                    var13.field_db = sj.field_x[1];
                    var13.field_Pb = sj.field_x[0];
                    var14_ref = new gh();
                    var14_ref.field_Pb = ah.field_Zb[0];
                    var14_ref.field_db = ah.field_Zb[1];
                    var15 = new gh();
                    var15.field_I = qi.field_a;
                    var16 = new gh();
                    var16.field_I = jn.field_f;
                    var17 = new lb("", var13, var14_ref, var15, var16);
                    var18_ref = new kg("Scrollingview", var3_ref, (gh) null, var17);
                    nf.field_a = var18_ref;
                    var18_ref.a(bi.field_d + 480, -2048, bi.field_d, 358, bg.field_y, 0, 4);
                    var18_ref.field_I = null;
                    var19 = new gh(-1L, (gh) null);
                    var19.field_I = pd.field_T;
                    var19.a(var18_ref, 119);
                    var19.a(0, 64, 366, 126, 4 + bi.field_d + 480);
                    gd.field_sb.a(var19, 125);
                    gd.field_sb.a(var9, 119);
                    var20 = -2 + var11 + (var9.field_Lb - var10);
                    if (var11 > 1) {
                        statePc = 317;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var20 = var20 / (-1 + var11);
                    var21 = 0;
                    var22 = (gh) ((Object) var9.field_M.e(13058));
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (null == var22) {
                        statePc = 325;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var22.a(0, var21 + var22.field_eb, var22.field_Lb, var22.field_Y, var22.field_zb);
                    var21 = var21 + var20;
                    var22 = (gh) ((Object) var9.field_M.a((byte) -55));
                    if (var31 != 0) {
                        statePc = 325;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (var31 == 0) {
                        statePc = 318;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 != pm.field_U) {
                break L1;
              } else {
                if (this.field_c != pm.field_T) {
                  break L1;
                } else {
                  this.field_h = 0;
                  this.field_k = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_c == 0) {
                break L2;
              } else {
                L3: {
                  if (0 == pm.field_T) {
                    break L3;
                  } else {
                    if ((vb.field_g ^ -1) != -1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_h = 0;
                this.field_k = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            L4: {
              L5: {
                this.field_k = 480;
                this.field_h = 480;
                var2_int = 0;
                if ((2 * pm.field_U ^ -1) <= -21) {
                  break L5;
                } else {
                  L6: {
                    if ((this.field_c ^ -1) == -1) {
                      break L6;
                    } else {
                      if (this.field_c != pm.field_T) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2_int = pm.field_U;
                  if (var5 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if ((this.field_c ^ -1) == -1) {
                  break L7;
                } else {
                  if ((this.field_c ^ -1) == (vb.field_g ^ -1)) {
                    break L7;
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              var2_int = -pm.field_U + 20;
              break L4;
            }
            L8: {
              L9: {
                L10: {
                  var3 = 0;
                  if ((this.field_c ^ -1) == -2) {
                    break L10;
                  } else {
                    if ((this.field_c ^ -1) == -3) {
                      break L10;
                    } else {
                      if (this.field_c == 3) {
                        break L10;
                      } else {
                        if (-5 != (this.field_c ^ -1)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                var3 = 200;
                if (var5 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              var3 = this.d((byte) 114);
              break L8;
            }
            L11: {
              var4 = 50;
              if (this.field_c == 0) {
                var4 = ma.field_eb.field_B;
                break L11;
              } else {
                break L11;
              }
            }
            if (!param0) {
              this.field_h = var4 * var2_int / 10;
              if (this.field_c != 0) {
                L12: {
                  L13: {
                    if (-1 != (this.field_c ^ -1)) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if (2 * pm.field_U < 20) {
                            break L15;
                          } else {
                            if ((vb.field_g ^ -1) == (this.field_c ^ -1)) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (-10 >= (var2_int ^ -1)) {
                            break L16;
                          } else {
                            this.field_k = var2_int * (var3 + -60) / 9;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.field_k = (var2_int * 37 + -333) / 1 + var3 + -60;
                        if (var5 == 0) {
                          break L12;
                        } else {
                          break L14;
                        }
                      }
                      L17: {
                        if (var2_int >= 1) {
                          break L17;
                        } else {
                          this.field_k = var2_int * 60 / 1;
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_k = 60 - -((9 + (var2_int - 10)) * (var3 + -60) / 9);
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_k = 0;
                  break L12;
                }
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                L18: {
                  L19: {
                    if ((pm.field_U ^ -1) <= -11) {
                      break L19;
                    } else {
                      this.field_k = pm.field_U * (-50 + var3) / 10;
                      if (var5 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  this.field_k = -50 + (var3 + (pm.field_U * 50 + -500) / 10);
                  break L18;
                }
                L20: {
                  this.field_h = pm.field_U * var4 / 20;
                  if (this.field_c == pm.field_T) {
                    break L20;
                  } else {
                    this.field_k = var3 + -this.field_k;
                    this.field_h = -this.field_h + var4;
                    break L20;
                  }
                }
                decompiledRegionSelector0 = 5;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-7 != (this.field_c ^ -1)) {
                break L1;
              } else {
                qi.field_j = null;
                break L1;
              }
            }
            L2: {
              if ((this.field_c ^ -1) == -6) {
                qi.field_d = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > 125) {
                break L3;
              } else {
                this.a(false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.LA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 44) {
                break L1;
              } else {
                ji.d(-110, -20);
                break L1;
              }
            }
            da.a(param0, 25104);
            r.a(false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 20) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            stackIn_4_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.PA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    ji(int param0) {
        this.field_k = 0;
        this.field_h = 0;
        try {
            this.field_c = param0;
            this.field_g = new rm(uc.field_e[this.field_c].length);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        u var10 = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = -81;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9_int = 1021128;
                        var10 = pl.field_U;
                        if (param0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var11_int = -11 + param2;
                        var12 = 13;
                        var13 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var13 >= 4) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = nm.field_v[var13];
                        var15 = nm.field_v[1 + var13];
                        pb.a(var14 + 3, var11_int, -var14 + var15 + -5, var12, 12105);
                        var13++;
                        if (var16 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var16 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((mi) ((Object) var10)).b(param4, nm.field_v[0] + 5, param2, var9_int, -1);
                        param3++;
                        ((mi) ((Object) var10)).b(cd.field_c[param5], 5 + nm.field_v[1], param2, var9_int, -1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-44 != (param3 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_24_0 = of.field_a;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param3 != 42) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_24_0 = ob.field_x;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param3 != 41) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_24_0 = "40+";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = Integer.toString(param3);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = stackIn_24_0;
                        ((mi) ((Object) var10)).c(var11, -1 + nm.field_v[3] - 5, param2, var9_int, -1);
                        ((mi) ((Object) var10)).c(Integer.toString(param6), nm.field_v[4] + -6, param2, var9_int, -1);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var9 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var9);
                    stackIn_27_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("ji.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_27_1 = stackIn_29_1;
                    if (param4 == null) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(byte param0) {
        try {
            field_d = null;
            field_l = null;
            field_f = null;
            field_b = null;
            if (param0 != -104) {
                field_f = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.S(" + param0 + ')');
        }
    }

    final static void d(int param0, int param1) {
        try {
            nb.b(param1, false);
            if (param0 != 0) {
                ji.a(true, (byte) 17);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ji.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (-17 == (this.field_c ^ -1)) {
              stackIn_5_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = this.field_g.field_e;
                if (var2_int < 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= (uc.field_e[this.field_c].length ^ -1)) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var3 = this.b(param0 ^ 105, var2_int);
                if (-1 < (var2_int ^ -1)) {
                  break L2;
                } else {
                  if (uc.field_e[this.field_c].length <= var2_int) {
                    break L2;
                  } else {
                    if ((uc.field_e[this.field_c][var2_int] ^ -1) == 0) {
                      break L2;
                    } else {
                      if (0 == this.field_c) {
                        L3: {
                          if (uc.field_e[this.field_c][var2_int] == 34) {
                            break L3;
                          } else {
                            if (uc.field_e[this.field_c][-1 + uc.field_e[this.field_c].length] != 34) {
                              break L3;
                            } else {
                              dh.field_F = var2_int;
                              stackIn_38_0 = -1 + uc.field_e[this.field_c].length;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        stackIn_40_0 = var2_int;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          if (this.field_c != 20) {
                            break L4;
                          } else {
                            if (var2_int < 0) {
                              break L4;
                            } else {
                              if (3 <= var2_int) {
                                break L4;
                              } else {
                                stackIn_49_0 = 0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        if (var3 < 0) {
                          L5: {
                            if (5 != this.field_c) {
                              break L5;
                            } else {
                              if (var2_int < 3) {
                                L6: {
                                  var2_int--;
                                  if (0 <= var2_int) {
                                    break L6;
                                  } else {
                                    var2_int += 3;
                                    break L6;
                                  }
                                }
                                stackIn_83_0 = var2_int;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (-7 != (this.field_c ^ -1)) {
                              break L7;
                            } else {
                              if (2 > var2_int) {
                                L8: {
                                  var2_int--;
                                  if (0 > var2_int) {
                                    var2_int += 2;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                stackIn_95_0 = var2_int;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L9: {
                            if ((this.field_c ^ -1) == -20) {
                              L10: {
                                if (uc.field_e[this.field_c] == fa.field_c) {
                                  stackIn_103_0 = 30;
                                  break L10;
                                } else {
                                  stackIn_103_0 = 20;
                                  break L10;
                                }
                              }
                              var4 = stackIn_103_0;
                              if ((var2_int ^ -1) > -11) {
                                break L9;
                              } else {
                                if (var2_int < var4) {
                                  stackIn_110_0 = var2_int - 10;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            if (param0 == -20) {
                              break L11;
                            } else {
                              this.r(1);
                              break L11;
                            }
                          }
                          stackIn_115_0 = -1;
                          decompiledRegionSelector0 = 10;
                          break L0;
                        } else {
                          L12: {
                            var3--;
                            var2_int--;
                            if (0 > var3) {
                              var3 += 4;
                              var2_int += 4;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: while (true) {
                            L14: {
                              if (-1 != uc.field_e[this.field_c][var2_int]) {
                                stackIn_72_0 = var2_int;
                                break L14;
                              } else {
                                var2_int--;
                                var3--;
                                stackIn_72_0 = var3;

                                if (var5 != 0) {
                                  break L14;
                                } else {

                                  L15: {
                                    if (stackIn_72_0 < 0) {
                                      var2_int += 4;
                                      var3 += 4;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  if ((var2_int ^ -1) == (this.field_g.field_e ^ -1)) {
                                    stackIn_70_0 = var2_int;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    continue L13;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var2_int = uc.field_e[this.field_c].length - 1;
              L16: while (true) {
                L17: {
                  L18: {
                    if (var2_int < 0) {
                      break L18;
                    } else {
                      stackIn_29_0 = -1;

                      if (var5 != 0) {
                        break L17;
                      } else {
                        if (stackIn_29_0 != uc.field_e[this.field_c][var2_int]) {
                          break L18;
                        } else {
                          var2_int--;
                          if (var5 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  stackIn_29_0 = var2_int;
                  break L17;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_72_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_70_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_83_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_95_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_110_0;
                          } else {
                            return stackIn_115_0;
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

    final static long a(int param0, CharSequence param1) {
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        long stackIn_40_0 = 0L;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var5 ^ -1) <= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var2_long = var2_long * 37L;
                    var6 = param1.charAt(var5);
                    stackIn_30_0 = var6;

                    stackIn_30_1 = 65;

                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_30_0 < stackIn_30_1) {
                            break L5;
                          } else {
                            if (90 < var6) {
                              break L5;
                            } else {
                              var2_long = var2_long + (long)(var6 + 1 - 65);
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (-98 < (var6 ^ -1)) {
                            break L6;
                          } else {
                            if ((var6 ^ -1) < -123) {
                              break L6;
                            } else {
                              var2_long = var2_long + (long)(-97 + var6 + 1);
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (var6 < 48) {
                          break L4;
                        } else {
                          if (57 < var6) {
                            break L4;
                          } else {
                            var2_long = var2_long + (long)(-48 + var6 + 27);
                            break L4;
                          }
                        }
                      }
                      if (-177917621779460414L >= (var2_long ^ -1L)) {
                        break L3;
                      } else {
                        var5++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_30_0 = param0;
                stackIn_30_1 = -53;
                break L2;
              }
              L7: {
                if (stackIn_30_0 < stackIn_30_1) {
                  break L7;
                } else {
                  ji.h((byte) -101);
                  break L7;
                }
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if (-1L != (var2_long % 37L ^ -1L)) {
                      break L10;
                    } else {
                      stackIn_40_0 = var2_long;

                      if (var7 != 0) {
                        break L9;
                      } else {
                        if (stackIn_40_0 == 0L) {
                          break L10;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackIn_40_0 = var2_long;
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("ji.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        return stackIn_40_0;
    }

    private final boolean a(int param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 116) {
                break L1;
              } else {
                this.p(-101);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = uc.field_e[this.field_c][param1];
                if (43 == var3_int) {
                  break L3;
                } else {
                  if (-45 != (var3_int ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (dm.field_c) {
                break L2;
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              if (-41 != (var3_int ^ -1)) {
                break L4;
              } else {
                if (-1 >= (dc.field_g ^ -1)) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            if (-1 != var3_int) {
              L5: {
                if (28 != var3_int) {
                  break L5;
                } else {
                  if (vb.b(116)) {
                    break L5;
                  } else {
                    stackIn_28_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              L6: {
                if (-2 != (var3_int ^ -1)) {
                  break L6;
                } else {
                  if (!vb.b(122)) {
                    stackIn_36_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if ((var3_int ^ -1) != -26) {
                  break L7;
                } else {
                  if (20 == this.field_c) {
                    L8: {
                      if (-1 <= (ol.field_Ub ^ -1)) {
                        stackIn_47_0 = 0;
                        break L8;
                      } else {
                        stackIn_47_0 = 1;
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (-27 != (var3_int ^ -1)) {
                  break L9;
                } else {
                  if ((this.field_c ^ -1) == -21) {
                    L10: {
                      L11: {
                        if ((ol.field_Ub ^ -1) <= -10) {
                          break L11;
                        } else {
                          if (ol.field_Ub >= fm.field_f[ge.field_j]) {
                            break L11;
                          } else {
                            stackIn_61_0 = 1;
                            break L10;
                          }
                        }
                      }
                      stackIn_61_0 = 0;
                      break L10;
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    break L9;
                  }
                }
              }
              L12: {
                if (-1 != (var3_int ^ -1)) {
                  break L12;
                } else {
                  if (-21 != (this.field_c ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (!vb.b(114)) {
                          break L14;
                        } else {
                          if (ni.b(111)) {
                            break L14;
                          } else {
                            stackIn_75_0 = 1;
                            break L13;
                          }
                        }
                      }
                      stackIn_75_0 = 0;
                      break L13;
                    }
                    decompiledRegionSelector0 = 7;
                    break L0;
                  }
                }
              }
              L15: {
                if (14 != this.field_c) {
                  break L15;
                } else {
                  if (var3_int != 46) {
                    break L15;
                  } else {
                    if (0 > dc.field_g) {
                      break L15;
                    } else {
                      stackIn_84_0 = 0;
                      decompiledRegionSelector0 = 8;
                      break L0;
                    }
                  }
                }
              }
              stackIn_86_0 = 1;
              decompiledRegionSelector0 = 9;
              break L0;
            } else {
              stackIn_22_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.HB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_47_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_61_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_75_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_84_0 != 0;
                        } else {
                          return stackIn_86_0 != 0;
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

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -90) {
                break L1;
              } else {
                this.a((String) null, -9, 98, true, 4, -58, 114, -36, 75);
                break L1;
              }
            }
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.G(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (96 != ei.field_q) {
                break L1;
              } else {
                L2: {
                  if (0 >= this.field_g.field_e) {
                    break L2;
                  } else {
                    if (2 == this.field_g.field_e) {
                      break L1;
                    } else {
                      this.field_g.a(0, 0);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_g.a(0, 1);
                break L1;
              }
            }
            L3: {
              if (ei.field_q == 97) {
                L4: {
                  if (-2 != (this.field_g.field_e ^ -1)) {
                    break L4;
                  } else {
                    this.field_g.a(0, 0);
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 != (this.field_g.field_e ^ -1)) {
                  this.field_g.a(0, 1);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (-100 == (ei.field_q ^ -1)) {
                L6: {
                  L7: {
                    if (this.field_g.field_e < 0) {
                      break L7;
                    } else {
                      if ((this.field_g.field_e ^ -1) >= -2) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_g.a(0, on.field_j);
                  if (var3 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
                this.field_g.a(0, 2);
                break L5;
              } else {
                break L5;
              }
            }
            L8: {
              if (-99 != (ei.field_q ^ -1)) {
                break L8;
              } else {
                L9: {
                  if (-3 == (this.field_g.field_e ^ -1)) {
                    break L9;
                  } else {
                    this.field_g.a(0, 2);
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_g.a(0, on.field_j);
                break L8;
              }
            }
            var2_int = -16 / ((44 - param0) / 62);
            this.field_g.e((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.H(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        field_f = new String[]{"More sentinels and weapons", "More battlefields", "More missions"};
        field_b = new String[]{"<col=ff0000>This sentinel has no weapons.</col>", "Having multiple <%0> modules is redundant.", "The energised armour only works in combination with energy shields.", "The gravity pods are of no use on a sentinel that cannot jump.", "The air stabilisers are of no use on a sentinel that cannot thrust.", "This sentinel has no weapons compatible with AMARDS.", "This sentinel has no weapons compatible with its targeting system.", "The speed-loader only works with rockets or missiles.", "The coolant array only works with plasma weapons.", "The high-energy amplifier only works with laser weapons.", "The emergency displacement deployment requires 5<nbsp>TJ of energy capacity.", "The fusion blade close-combat attack requires 10<nbsp>TJ of energy capacity."};
        field_l = "Username: ";
        field_j = -1;
        field_d = new int[]{3, 4, -1, 8};
    }
}
