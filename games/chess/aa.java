/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ci field_g;
    private int field_d;
    private int field_h;
    static int field_i;
    private int field_c;
    static String field_a;
    private int field_b;
    private of field_e;
    static int field_f;

    private final int d(int param0, int param1) {
        int stackIn_5_0 = 0;
        L0: {
          if (-5 != (this.field_c ^ -1)) {
            break L0;
          } else {
            if (vi.a(-3)) {
              break L0;
            } else {
              L1: {
                if (-3 < (param1 ^ -1)) {
                  stackIn_5_0 = 300 + 240 * param1;
                  break L1;
                } else {
                  stackIn_5_0 = 380;
                  break L1;
                }
              }
              return stackIn_5_0;
            }
          }
        }
        if (-6 == (this.field_c ^ -1)) {
          return this.e(0, param1) - -140;
        } else {
          L2: {
            if (param0 == -3) {
              break L2;
            } else {
              this.field_e = (of) null;
              break L2;
            }
          }
          return ak.field_r[this.field_c];
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_7_0 = false;
        L0: {
          var6 = Chess.field_G;
          if (param1 <= -43) {
            break L0;
          } else {
            this.a(false, -21, 28);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (ak.field_q[this.field_c].length > var4) {
            var5 = this.a(var4, 210);
            stackIn_7_0 = this.a(var4, (byte) 113);

            if (var6 == 0) {
              L2: {
                if (!stackIn_7_0) {
                  break L2;
                } else {
                  if (param0 < this.e(0, var4)) {
                    break L2;
                  } else {
                    if (param0 >= this.d(-3, var4)) {
                      break L2;
                    } else {
                      if (param2 < var5) {
                        break L2;
                      } else {
                        if (var5 - -this.c(32, var4) <= param2) {
                          break L2;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
              }
              var4++;
              if (var6 == 0) {
                continue L1;
              } else {
                return -1;
              }
            } else {
              return stackIn_7_0 ? 1 : 0;
            }
          } else {
            return -1;
          }
        }
    }

    final void d(byte param0) {
        int stackIn_5_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Chess.field_G;
                    var2 = this.c(param0 ^ -40);
                    if (nc.field_T == 0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (16 <= nc.field_T) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = this.field_c;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = qk.field_h;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3 = stackIn_5_0;
                    var4 = 64;
                    var14 = wb.field_d;
                    if (param0 == 59) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(108);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var6 = wb.field_h;
                    var7 = wb.field_c;
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ph.a(-7125);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-3 != (rn.field_b ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (uh.i(23156) == null) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!uh.i(23156).field_g) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (nc.field_T != 0) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == b.field_a) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    b.field_a = new km(wb.field_h, wb.field_c);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    b.field_a.e();
                    nh.a();
                    nh.c(370, 240 - -ec.c((byte) -63));
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var3 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-7 == (var3 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (-5 == (var3 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (5 != var3) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (0 == qk.field_h) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (pg.field_s == 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((var3 ^ -1) != -9) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    qd.field_w.h(param0 ^ -113);
                    var4 = 32;
                    this.a(var4, -var2, 13551);
                    if (var10 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-3 == (var3 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (11 == var3) {
                        statePc = 40;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var3 ^ -1) == -2) {
                        statePc = 40;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-10 == (var3 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (5 != var3) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (0 == qk.field_h) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (pg.field_s != 0) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (3 == var3) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var3 != 10) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.a(17922);
                    var4 = 128;
                    if (var10 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.b(130);
                    var4 = 128;
                    this.a(var4 / 2, -var2, param0 ^ 13524);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    this.f(var2, -7098);
                    if (uh.i(param0 + 23097) == null) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_c >= dc.field_n.length) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (dc.field_n[this.field_c] == null) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    dc.field_n[this.field_c].a(var2, 0);
                    statePc = 49;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_c >= dc.field_n.length) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (dc.field_n[this.field_c] == null) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    dc.field_n[this.field_c].a(var2, 0);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var8 = 0;
                    var9 = ak.field_m[this.field_c];
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var8 >= this.field_e.field_f) {
                        statePc = 56;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_76_0 = this;
                    stackIn_52_0 = stackIn_76_0;
                    stackIn_76_1 = 0;
                    stackIn_52_1 = stackIn_76_1;
                    stackIn_76_2 = var8;
                    stackIn_52_2 = stackIn_76_2;
                    stackIn_76_3 = var9;
                    stackIn_52_3 = stackIn_76_3;
                    if (var10 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_54_0 = this;
                    stackIn_53_0 = stackIn_54_0;
                    stackIn_54_1 = stackIn_52_1;
                    stackIn_53_1 = stackIn_54_1;
                    stackIn_54_2 = stackIn_52_2;
                    stackIn_53_2 = stackIn_54_2;
                    stackIn_54_3 = stackIn_52_3;
                    stackIn_53_3 = stackIn_54_3;
                    if (this.field_e.field_h != var8) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = this;
                    stackIn_55_1 = stackIn_53_1;
                    stackIn_55_2 = stackIn_53_2;
                    stackIn_55_3 = stackIn_53_3;
                    stackIn_55_4 = 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = this;
                    stackIn_55_1 = stackIn_54_1;
                    stackIn_55_2 = stackIn_54_2;
                    stackIn_55_3 = stackIn_54_3;
                    stackIn_55_4 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    this.a(stackIn_55_1 != 0, stackIn_55_2, stackIn_55_3, stackIn_55_4 != 0, var2);
                    var9 = var9 + ak.field_y[this.field_c];
                    var8++;
                    if (var10 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if ((var3 ^ -1) == -4) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (-11 != (var3 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var8 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (5 <= var8) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    ok.field_Ib[var8].c((byte) 56);
                    var8++;
                    if (var10 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var10 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (this.field_c == 4) {
                        statePc = 77;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (5 != this.field_c) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.b(var2, true);
                    if (var10 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_c == 6) {
                        statePc = 75;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (this.field_c != 7) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.a(-18210, true, var2);
                    if (var10 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (this.field_c == 8) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ek.a(16777215, 155, 50 - -var2, 10, ak.field_m[this.field_c] - 30, 0, (byte) 63, var2 + 590);
                    v.field_j.a(ad.field_d, var2 + 50, 155, 540, 480, 16444375, -1, 0, 0, v.field_j.field_q);
                    if (var10 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = this;
                    stackIn_76_1 = -18210;
                    stackIn_76_2 = 0;
                    stackIn_76_3 = var2;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    this.a(stackIn_76_1, stackIn_76_2 != 0, stackIn_76_3);
                    if (var10 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    this.b(-481, var2);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    wb.a(var14, var6, var7);
                    if (null == b.field_a) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (2 != rn.field_b) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (uh.i(23156) == null) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (!uh.i(23156).field_g) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (nc.field_T == 0) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    b.field_a.b(0, 0, var4 << 546974337);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (oc.field_p != null) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    sf.b(16777215);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int c(int param0, int param1) {
        if (param0 != 32) {
            this.a(true, -60, -103, true, -118);
        }
        return 30;
    }

    private final boolean a(int param0, byte param1) {
        if (param1 <= 111) {
            km var4 = (km) null;
            aa.a((km) null, 106);
            return true;
        }
        return true;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        L0: {
          L1: {
            var4 = Chess.field_G;
            if ((vg.field_a ^ -1) == -14) {
              break L1;
            } else {
              L2: {
                L3: {
                  if (-6 != (jc.field_f ^ -1)) {
                    break L3;
                  } else {
                    this.e(-36);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_e.c((byte) 127);
                break L2;
              }
              if (this.field_e.field_h != -1) {
                this.a(false, 2, this.field_e.field_h);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          L4: {
            L5: {
              if (1 == this.field_c) {
                break L5;
              } else {
                if (this.field_c == 2) {
                  break L5;
                } else {
                  if (-4 == (this.field_c ^ -1)) {
                    break L5;
                  } else {
                    if (this.field_c != 11) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (this.field_c != 3) {
                stackIn_16_0 = 0;
                break L6;
              } else {
                stackIn_16_0 = 1;
                break L6;
              }
            }
            L7: {
              var2 = stackIn_16_0;
              if (var2 == 0) {
                stackIn_19_0 = -1;
                break L7;
              } else {
                stackIn_19_0 = -5;
                break L7;
              }
            }
            var3 = stackIn_19_0;
            uk.a(qk.field_h, false, 28333, var3);
            if (var4 == 0) {
              break L0;
            } else {
              break L4;
            }
          }
          if (7 == jc.field_f) {
            break L0;
          } else {
            var2 = pg.field_s;
            uk.a(qk.field_h, false, 28333, var2);
            break L0;
          }
        }
        L8: {
          if (param0 > 89) {
            break L8;
          } else {
            this.a(-113, -38, -3);
            break L8;
          }
        }
    }

    private final void f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var3 = 10;
          var4 = 0;
          var5 = 16777215;
          var6 = param0 + ak.field_k[this.field_c];
          var7 = ak.field_m[this.field_c];
          var8 = param0 + ak.field_r[this.field_c];
          var9 = -5;
          if (param1 == -7098) {
            break L0;
          } else {
            this.field_h = 10;
            break L0;
          }
        }
        L1: {
          L2: {
            var10 = this.field_e.field_f * ak.field_y[this.field_c] + (var7 + var9);
            if (-6 != (this.field_c ^ -1)) {
              break L2;
            } else {
              var10 = var9 + (var7 + ak.field_y[this.field_c] * (-3 + this.field_e.field_f));
              ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
              var7 = 2 * ak.field_y[this.field_c] + var10 + -var9;
              var10 = var7 + (var9 + ak.field_y[this.field_c]);
              ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
              if (Chess.field_G == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
          break L1;
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 210) {
            this.a(124, false, -22);
        }
        if ((this.field_c ^ -1) == -5) {
            if (!(vi.a(-3))) {
                if (!((param0 ^ -1) <= -3)) {
                    return ak.field_m[this.field_c];
                }
                return ak.field_m[this.field_c] - -ak.field_y[this.field_c];
            }
        }
        if (!(this.field_c != 5)) {
            return ak.field_m[this.field_c];
        }
        return param0 * ak.field_y[this.field_c] + ak.field_m[this.field_c];
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                wg.field_p = param2;
                try {
                  L1: {
                    L2: {
                      L3: {
                        var6 = param0.getParameter("cookieprefix");
                        var5 = var6;
                        var5 = var6;
                        var4 = param0.getParameter("cookiehost");
                        var5 = var4;
                        var5 = var4;
                        var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                        var5 = var7;
                        var5 = var7;
                        var5 = var7;
                        if (param1 != (param2.length() ^ -1)) {
                          break L3;
                        } else {
                          var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (Chess.field_G == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + sk.a(5, 94608000000L + ud.a(2)) + "; Max-Age=" + 94608000L;
                      break L2;
                    }
                    u.a((byte) -81, "document.cookie=\"" + var5 + "\"", param0);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    throwable = decompiledCaughtException;
                    break L4;
                  }
                }
                od.a(false, param0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (runtimeException);

                stackIn_11_1 = new StringBuilder().append("aa.EA(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        wg stackIn_38_0 = null;
        int stackIn_52_0 = 0;
        int statePc = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wg var12_ref_wg = null;
        wg var13_ref_wg = null;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Chess.field_G;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_f = -70;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = ak.field_k[this.field_c] - -param4;
                    var7 = ak.field_q[this.field_c][param1];
                    var8 = fm.field_R[var7];
                    if (35 == var7) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (-34 != (var7 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (-20 != (this.field_h ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (-35 != (var7 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((this.field_h ^ -1) == -26) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (12 == var7) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = da.field_C[tk.field_e];
                    var9_ref_String = var8;
                    var9_ref_String = var8;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var7 ^ -1) == -27) {
                        statePc = 17;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == (rn.field_b ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (rn.field_b == 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9_ref_String = pk.field_h;
                    if (var14 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var9_ref_String = sj.field_t;
                    if (var14 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var9_ref_String = dm.field_a;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var8 = var8 + var9_ref_String;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (param3) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = 16444375;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 13732679;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var9 = stackIn_26_0;
                    if (this.field_h == var7) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var8 = "{<col=b0b0b0>" + var8 + "</col>}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var10 = 2043695;
                    v.field_j.a(var8, var6, v.field_j.field_C + param2, var9, var10);
                    if ((var7 ^ -1) == -15) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var7 ^ -1) == -16) {
                        statePc = 32;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11 = 75 + var6;
                    if (-15 == (var7 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = bc.field_b;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = lf.field_S;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var12 = stackIn_35_0;
                    if (-15 != (var7 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = mi.field_q;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = hg.field_b;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var13_ref_wg = stackIn_38_0;
                    var13_ref_wg.field_i = var11;
                    var13_ref_wg.field_k = param2 + 8;
                    var13_ref_wg.field_x = var12;
                    var13_ref_wg.a(110);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var7 != 32) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var11 = 67 + var6;
                    var12_ref_wg = nb.field_Fb;
                    if (var12_ref_wg == null) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var12_ref_wg.field_i = var11;
                    var12_ref_wg.field_k = param2 + 8;
                    var12_ref_wg.a(-116);
                    var13 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (ok.field_Ib.length <= var13) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ok.field_Ib[var13].field_i = var12_ref_wg.field_i + 22 * var13;
                    ok.field_Ib[var13].field_k = v.field_j.field_q + (param2 - -6);
                    var13++;
                    if (var14 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var14 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!param3) {
                        statePc = 61;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((this.field_c ^ -1) == -10) {
                        statePc = 49;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var11 = ak.field_m[this.field_c];
                    var12 = var6 + 160;
                    if (0 != oc.field_p.field_C) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var13 = stackIn_52_0;
                    if (var7 != 29) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    rl.field_d[var13][3].c(var12, var11);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if ((var7 ^ -1) != -29) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    rl.field_d[var13][2].c(var12, var11);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (-31 != (var7 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    rl.field_d[var13][5].c(var12, var11);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var7 != 27) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    rl.field_d[var13][4].c(var12, var11);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, boolean param1) {
        String var3;
        String var4;
        int var5;
        int var6_int;
        rk var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = Chess.field_G;
          if (param1) {
            break L0;
          } else {
            this.field_c = 16;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      var6_int = this.field_h;
                      if ((var6_int ^ -1) == -21) {
                        var5 = 0;
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      } else {
                        L8: {
                          if (-22 != (var6_int ^ -1)) {
                            break L8;
                          } else {
                            if (var9 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if ((var6_int ^ -1) != -23) {
                            break L9;
                          } else {
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (23 == var6_int) {
                          break L5;
                        } else {
                          L10: {
                            if ((var6_int ^ -1) != -25) {
                              break L10;
                            } else {
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if ((var6_int ^ -1) == -26) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var5 = 1;
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                  var5 = 2;
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
                var5 = 3;
                if (var9 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
              var5 = 4;
              if (var9 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
            var5 = 5;
            if (var9 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          var5 = -1;
          break L1;
        }
        L11: {
          L12: {
            if (-1 != var5) {
              break L12;
            } else {
              var3 = wm.field_i;
              var4 = sg.field_a;
              if (var9 == 0) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          var4 = o.field_i[var5];
          var3 = pa.field_j[var5];
          break L11;
        }
        L13: {
          tb.field_a.b(-param0, 0);
          wb.c(tb.field_a.field_s + 1 + -param0, tb.field_a.field_r + 1, tb.field_a.field_w - 1, tb.field_a.field_t - 1, 1);
          v.field_j.a(var4, 15 - param0, v.field_j.field_q + 155, 4096, -1);
          jj.field_d.a(var3, 15 + -param0, 165, 250, 640, 4096, -1, 0, 0, -1 + jj.field_d.field_q);
          if ((var5 ^ -1) != 0) {
            var6 = jd.field_c[var5];
            var7 = 285 - param0;
            var8 = 148;
            var6.b(var7, var8);
            wb.f(var7 - 2, var8 + -2, var6.field_k - -4, 4 + var6.field_h, 2, 1);
            wb.c(-1 + var7, var8 + -1, var6.field_k - -3, var6.field_h - -3, 1);
            break L13;
          } else {
            break L13;
          }
        }
    }

    private final int c(int param0) {
        int var2;
        int var3;
        L0: {
          var2 = 0;
          var3 = 87 % ((param0 - 70) / 52);
          if (nc.field_T == 0) {
            break L0;
          } else {
            L1: {
              if (16 <= nc.field_T) {
                break L1;
              } else {
                var2 = nc.field_T * 640 / 16;
                if (Chess.field_G == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = (-nc.field_T * 640 - -20480) / 16;
            break L0;
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Chess.field_G;
                    var4 = 300 - -param1;
                    var5 = 50 + var4;
                    var6 = var4;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var6 >= var5) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    wb.d(var6, 0, 0, var6, 16777215, param0);
                    var6++;
                    if (var7 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = param1 + 500;
                    var5 = 75 + var4;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var6 = var4;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var6 >= var5) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    wb.d(var6, 0, 0, var6, 16777215, param0);
                    var6++;
                    if (var7 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var7 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = 600 - -param1;
                    var5 = 25 + var4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param2 != 13551) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 = var4;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var5 <= var6) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    wb.d(var6, 0, 0, var6, 16777215, param0);
                    var6++;
                    if (var7 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, um param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        em var5 = null;
        int[] var6 = null;
        int var7 = 0;
        nk var8 = null;
        nk var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8 = new nk(param1.a("logo.fo3d", 30045, ""));
                        var9 = var8;
                        if (param0 == -8428) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_f = 65;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = var9.i(param0 ^ 8372);
                        var9.m(param0 ^ 18713);
                        m.field_e = cl.a(param0 ^ 13190, var9);
                        ei.field_v = new em[var3];
                        ql.field_a = new int[var3][];
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var3) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ei.field_v[var4] = ac.a(var8, true);
                        var4++;
                        if (var7 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9.g((byte) 67);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= var3) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = ei.field_v[var4];
                        var5.a(6, 6, (byte) -70, 6, 1);
                        var5.a(param0 ^ -24341);
                        var6 = new int[]{var5.field_K + var5.field_P >> -1974506943, var5.field_I + var5.field_v >> 607540513, var5.field_x + var5.field_n >> -23409215};
                        ql.field_a[var4] = var6;
                        var5.a(-var6[1], -var6[0], -var6[2], (byte) -81);
                        var4++;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var2);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("aa.V(").append(param0).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param1 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (!(!hj.field_i)) {
            var3 = param1 ? 1 : 0;
            uk.a(qk.field_h, var3 != 0, 28333, -5);
        }
        if (!(!hl.field_h)) {
            la.a(11, (byte) -60, 0);
        }
        if (param0 != 11) {
            this.field_d = -42;
        }
    }

    private final void e(int param0) {
        if (!this.field_e.b(false) && vg.field_a == 98) {
            do {
                this.field_e.field_h = this.field_e.field_h - 1;
                if (0 > this.field_e.field_h) {
                    this.field_e.field_h = -1 + this.field_e.field_f;
                }
            } while (-36 == (ak.field_q[jc.field_f][this.field_e.field_h] ^ -1));
            this.field_e.field_e = false;
        }
        if (!this.field_e.b(false)) {
            if (vg.field_a != 99) {
            } else {
                do {
                    this.field_e.field_h = this.field_e.field_h + 1;
                    if (this.field_e.field_f <= this.field_e.field_h) {
                        this.field_e.field_h = 0;
                    }
                } while ((ak.field_q[jc.field_f][this.field_e.field_h] ^ -1) == -36);
                this.field_e.field_e = false;
            }
        }
        if (param0 != -36) {
            field_i = -71;
        }
        this.field_e.b((byte) -61);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        wg var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = Chess.field_G;
          if (param1 == 2) {
            break L0;
          } else {
            field_f = -103;
            break L0;
          }
        }
        L1: {
          var4 = ak.field_q[this.field_c][param2];
          if (!this.field_e.d((byte) 91)) {
            break L1;
          } else {
            if (var4 == 14) {
              break L1;
            } else {
              if (var4 == 15) {
                break L1;
              } else {
                if (-33 == (var4 ^ -1)) {
                  break L1;
                } else {
                  wf.a(um.field_l[0], 59);
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          L3: {
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    L24: {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            L28: {
                                                              L29: {
                                                                var9 = var4;
                                                                if (var9 == 0) {
                                                                  break L29;
                                                                } else {
                                                                  L30: {
                                                                    if (-2 != (var9 ^ -1)) {
                                                                      break L30;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L31: {
                                                                    if (var9 != 2) {
                                                                      break L31;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L27;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  L32: {
                                                                    if ((var9 ^ -1) != -38) {
                                                                      break L32;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L27;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  L33: {
                                                                    if ((var9 ^ -1) != -7) {
                                                                      break L33;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L26;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                  L34: {
                                                                    if (18 != var9) {
                                                                      break L34;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L25;
                                                                      } else {
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  L35: {
                                                                    if ((var9 ^ -1) != -17) {
                                                                      break L35;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L24;
                                                                      } else {
                                                                        break L35;
                                                                      }
                                                                    }
                                                                  }
                                                                  L36: {
                                                                    if ((var9 ^ -1) != -5) {
                                                                      break L36;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L23;
                                                                      } else {
                                                                        break L36;
                                                                      }
                                                                    }
                                                                  }
                                                                  L37: {
                                                                    if (var9 != 7) {
                                                                      break L37;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L22;
                                                                      } else {
                                                                        break L37;
                                                                      }
                                                                    }
                                                                  }
                                                                  L38: {
                                                                    if ((var9 ^ -1) != -4) {
                                                                      break L38;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L21;
                                                                      } else {
                                                                        break L38;
                                                                      }
                                                                    }
                                                                  }
                                                                  L39: {
                                                                    if ((var9 ^ -1) != -15) {
                                                                      break L39;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L20;
                                                                      } else {
                                                                        break L39;
                                                                      }
                                                                    }
                                                                  }
                                                                  if ((var9 ^ -1) == -16) {
                                                                    break L19;
                                                                  } else {
                                                                    if (var9 == 5) {
                                                                      break L18;
                                                                    } else {
                                                                      L40: {
                                                                        if (var9 != 26) {
                                                                          break L40;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L40;
                                                                          }
                                                                        }
                                                                      }
                                                                      L41: {
                                                                        if (8 != var9) {
                                                                          break L41;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L16;
                                                                          } else {
                                                                            break L41;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (-10 == (var9 ^ -1)) {
                                                                        break L15;
                                                                      } else {
                                                                        if (10 == var9) {
                                                                          break L14;
                                                                        } else {
                                                                          if (11 == var9) {
                                                                            break L13;
                                                                          } else {
                                                                            L42: {
                                                                              if (-13 != (var9 ^ -1)) {
                                                                                break L42;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L12;
                                                                                } else {
                                                                                  break L42;
                                                                                }
                                                                              }
                                                                            }
                                                                            L43: {
                                                                              if (-18 != (var9 ^ -1)) {
                                                                                break L43;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L11;
                                                                                } else {
                                                                                  break L43;
                                                                                }
                                                                              }
                                                                            }
                                                                            L44: {
                                                                              if (-14 != (var9 ^ -1)) {
                                                                                break L44;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L10;
                                                                                } else {
                                                                                  break L44;
                                                                                }
                                                                              }
                                                                            }
                                                                            L45: {
                                                                              if (30 != var9) {
                                                                                break L45;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L9;
                                                                                } else {
                                                                                  break L45;
                                                                                }
                                                                              }
                                                                            }
                                                                            if ((var9 ^ -1) == -28) {
                                                                              break L8;
                                                                            } else {
                                                                              if (28 == var9) {
                                                                                break L7;
                                                                              } else {
                                                                                L46: {
                                                                                  if (29 != var9) {
                                                                                    break L46;
                                                                                  } else {
                                                                                    if (var11 == 0) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      break L46;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var9 == 31) {
                                                                                  break L5;
                                                                                } else {
                                                                                  L47: {
                                                                                    if ((var9 ^ -1) != -20) {
                                                                                      break L47;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L47;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L48: {
                                                                                    if (-21 != (var9 ^ -1)) {
                                                                                      break L48;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L48;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L49: {
                                                                                    if (-22 != (var9 ^ -1)) {
                                                                                      break L49;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L49;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L50: {
                                                                                    if (22 != var9) {
                                                                                      break L50;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L50;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L51: {
                                                                                    if ((var9 ^ -1) != -24) {
                                                                                      break L51;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L51;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L52: {
                                                                                    if (var9 != 24) {
                                                                                      break L52;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L52;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (-26 == (var9 ^ -1)) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (var9 == 33) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      L53: {
                                                                                        if (var9 != 34) {
                                                                                          break L53;
                                                                                        } else {
                                                                                          if (var11 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L54: {
                                                                                        if (var9 != 35) {
                                                                                          break L54;
                                                                                        } else {
                                                                                          if (var11 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (32 != var9) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        if (var11 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L29;
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
                                                              if (this.field_e.d((byte) 34)) {
                                                                qk.field_h = -3;
                                                                ph.a(-7125);
                                                                if (var11 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                            if (!this.field_e.d((byte) 34)) {
                                                              break L2;
                                                            } else {
                                                              L55: {
                                                                if (vi.a(-3)) {
                                                                  break L55;
                                                                } else {
                                                                  var9 = param0 ? 1 : 0;
                                                                  uk.a(qk.field_h, var9 != 0, 28333, -4);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L55;
                                                                  }
                                                                }
                                                              }
                                                              ca.a(0, v.field_j.field_t + (v.field_j.field_H + -2), v.field_j.field_H, gh.field_b, (byte) 113, 320, 240, gh.field_b, an.field_d, 8, 2, v.field_j, param0, 8, true);
                                                              if (var11 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          if (!this.field_e.d((byte) 84)) {
                                                            break L2;
                                                          } else {
                                                            var9 = param0 ? 1 : 0;
                                                            uk.a(qk.field_h, var9 != 0, 28333, -1);
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        if (!this.field_e.d((byte) 35)) {
                                                          break L2;
                                                        } else {
                                                          var9 = param0 ? 1 : 0;
                                                          uk.a(qk.field_h, var9 != 0, 28333, 0);
                                                          ma.field_D = false;
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      if (this.field_e.d((byte) 36)) {
                                                        var9 = param0 ? 1 : 0;
                                                        uk.a(qk.field_h, var9 != 0, 28333, 0);
                                                        mf.field_o = true;
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L24;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                    if (this.field_e.d((byte) 101)) {
                                                      var9 = param0 ? 1 : 0;
                                                      uk.a(qk.field_h, var9 != 0, param1 + 28331, 6);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                  if (this.field_e.d((byte) 64)) {
                                                    var9 = param0 ? 1 : 0;
                                                    uk.a(qk.field_h, var9 != 0, param1 ^ 28335, 5);
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                                if (this.field_e.d((byte) 40)) {
                                                  var9 = pg.field_s;
                                                  var10 = param0 ? 1 : 0;
                                                  uk.a(qk.field_h, var10 != 0, 28333, var9);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              if (!this.field_e.d((byte) 101)) {
                                                break L2;
                                              } else {
                                                var9 = param0 ? 1 : 0;
                                                uk.a(qk.field_h, var9 != 0, 28333, 4);
                                                if (var11 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L56: {
                                              var5 = lf.field_S;
                                              if (!this.field_e.a((byte) 94)) {
                                                break L56;
                                              } else {
                                                an.a(0, (byte) 81);
                                                break L56;
                                              }
                                            }
                                            L57: {
                                              if (this.field_e.a(true)) {
                                                an.a(80, (byte) 84);
                                                break L57;
                                              } else {
                                                break L57;
                                              }
                                            }
                                            L58: {
                                              if (!this.field_e.b(false)) {
                                                break L58;
                                              } else {
                                                L59: {
                                                  mi.field_q.c((byte) 57);
                                                  if (mi.field_q.field_d) {
                                                    break L59;
                                                  } else {
                                                    L60: {
                                                      if (mi.field_q.field_i <= hn.field_k) {
                                                        break L60;
                                                      } else {
                                                        an.a(0, (byte) 87);
                                                        if (var11 == 0) {
                                                          break L58;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                    }
                                                    an.a(80, (byte) 99);
                                                    if (var11 == 0) {
                                                      break L58;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                }
                                                an.a(mi.field_q.field_x, (byte) 95);
                                                break L58;
                                              }
                                            }
                                            L61: {
                                              if (this.field_e.a(-97)) {
                                                dm.a(false);
                                                break L61;
                                              } else {
                                                break L61;
                                              }
                                            }
                                            L62: {
                                              if (this.field_e.b(97)) {
                                                vm.g(1);
                                                break L62;
                                              } else {
                                                break L62;
                                              }
                                            }
                                            if (lf.field_S == var5) {
                                              break L2;
                                            } else {
                                              mi.field_q.field_x = lf.field_S;
                                              wf.a(um.field_l[0], 18);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L63: {
                                            var5 = bc.field_b;
                                            if (this.field_e.a((byte) 94)) {
                                              rf.b(80, 0);
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (this.field_e.a(true)) {
                                              rf.b(80, 80);
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (this.field_e.b(false)) {
                                              L66: {
                                                hg.field_b.c((byte) 90);
                                                if (!hg.field_b.field_d) {
                                                  break L66;
                                                } else {
                                                  rf.b(80, hg.field_b.field_x);
                                                  if (var11 == 0) {
                                                    break L65;
                                                  } else {
                                                    break L66;
                                                  }
                                                }
                                              }
                                              L67: {
                                                if (hg.field_b.field_i <= hn.field_k) {
                                                  break L67;
                                                } else {
                                                  rf.b(param1 ^ 82, 0);
                                                  if (var11 == 0) {
                                                    break L65;
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                              }
                                              rf.b(param1 + 78, 80);
                                              break L65;
                                            } else {
                                              break L65;
                                            }
                                          }
                                          L68: {
                                            if (!this.field_e.a(param1 ^ -99)) {
                                              break L68;
                                            } else {
                                              cm.d((byte) -104);
                                              break L68;
                                            }
                                          }
                                          L69: {
                                            if (this.field_e.b(97)) {
                                              cl.a((byte) 27);
                                              break L69;
                                            } else {
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (var5 == bc.field_b) {
                                              break L70;
                                            } else {
                                              hg.field_b.field_x = bc.field_b;
                                              wf.a(um.field_l[0], -77);
                                              break L70;
                                            }
                                          }
                                          ib.field_a = bc.field_b;
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        if (!this.field_e.d((byte) 111)) {
                                          break L2;
                                        } else {
                                          L71: {
                                            if (rm.field_R == null) {
                                              break L71;
                                            } else {
                                              b.a(true);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          fk.a(param0, 15);
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L72: {
                                        var6 = rn.field_b;
                                        if (this.field_e.c(84)) {
                                          rn.field_b = rn.field_b + 1;
                                          break L72;
                                        } else {
                                          break L72;
                                        }
                                      }
                                      L73: {
                                        if (!this.field_e.e(0)) {
                                          break L73;
                                        } else {
                                          rn.field_b = rn.field_b - 1;
                                          break L73;
                                        }
                                      }
                                      L74: {
                                        if (2 >= rn.field_b) {
                                          break L74;
                                        } else {
                                          rn.field_b = 0;
                                          break L74;
                                        }
                                      }
                                      L75: {
                                        if (0 <= rn.field_b) {
                                          break L75;
                                        } else {
                                          rn.field_b = 2;
                                          break L75;
                                        }
                                      }
                                      if (rn.field_b == var6) {
                                        break L2;
                                      } else {
                                        ph.a(-7125);
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (this.field_e.d((byte) 99)) {
                                      lc.field_q = true;
                                      qk.field_h = 0;
                                      ma.field_D = false;
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                  if (this.field_e.d((byte) 63)) {
                                    oc.field_p.h(28);
                                    qk.field_h = -1;
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (!this.field_e.d((byte) 92)) {
                                  break L2;
                                } else {
                                  oc.field_p.b(true);
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (this.field_e.d((byte) 92)) {
                                this.a(param1 + 9, param0);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L2;
                              }
                            }
                            L76: {
                              if (this.field_e.e(0)) {
                                tk.field_e = tk.field_e - 1;
                                if (tk.field_e >= 0) {
                                  break L76;
                                } else {
                                  tk.field_e = -1 + cm.field_r.length;
                                  break L76;
                                }
                              } else {
                                break L76;
                              }
                            }
                            if (this.field_e.c(84)) {
                              tk.field_e = tk.field_e + 1;
                              if (cm.field_r.length == tk.field_e) {
                                tk.field_e = 0;
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                          if (!this.field_e.d((byte) 68)) {
                            break L2;
                          } else {
                            L77: {
                              if ((this.field_c ^ -1) == -8) {
                                break L77;
                              } else {
                                L78: {
                                  if (-7 == (this.field_c ^ -1)) {
                                    break L78;
                                  } else {
                                    if (4 != jc.field_f) {
                                      break L2;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                                hj.a(this.field_c, this.field_c, false);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L77;
                                }
                              }
                            }
                            hj.a(this.field_c, this.field_c, false);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (!this.field_e.d((byte) 116)) {
                          break L2;
                        } else {
                          L79: {
                            if (rm.field_R != null) {
                              b.a(true);
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          dh.a(bh.i(81), true);
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (!this.field_e.d((byte) 123)) {
                        break L2;
                      } else {
                        this.a((byte) 110, 5);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (this.field_e.d((byte) 119)) {
                      this.a((byte) 125, 4);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (this.field_e.d((byte) 38)) {
                    this.a((byte) 112, 2);
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    break L2;
                  }
                }
                if (!this.field_e.d((byte) 114)) {
                  break L2;
                } else {
                  this.a((byte) 118, 3);
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              if (!this.field_e.d((byte) 43)) {
                break L2;
              } else {
                oc.field_p.field_t.a(-1, false, -1);
                qk.field_h = -1;
                if (var11 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L80: {
              if (!this.field_e.field_e) {
                break L80;
              } else {
                if (!this.field_e.d((byte) 84)) {
                  break L2;
                } else {
                  break L80;
                }
              }
            }
            this.field_h = var4;
            if (var11 == 0) {
              break L2;
            } else {
              break L3;
            }
          }
          L81: {
            var7 = nb.field_Fb;
            if (var7 != null) {
              break L81;
            } else {
              if (var11 == 0) {
                break L2;
              } else {
                break L81;
              }
            }
          }
          L82: {
            var7.c((byte) -119);
            if (null != uh.i(param1 + 23154)) {
              var7.field_y = uh.i(param1 ^ 23158).field_t.a((byte) -113);
              if (var7.field_x != -1) {
                break L82;
              } else {
                var7.field_x = var7.field_y;
                break L82;
              }
            } else {
              break L82;
            }
          }
          L83: {
            var8 = 0;
            if (this.field_e.b(97)) {
              L84: {
                nb.field_Fb.field_x = nb.field_Fb.field_x + 1;
                if (nb.field_Fb.field_y >= nb.field_Fb.field_x) {
                  break L84;
                } else {
                  nb.field_Fb.field_x = nb.field_Fb.field_y;
                  break L84;
                }
              }
              var8 = 1;
              break L83;
            } else {
              break L83;
            }
          }
          L85: {
            if (!this.field_e.a(param1 + -99)) {
              break L85;
            } else {
              L86: {
                nb.field_Fb.field_x = nb.field_Fb.field_x - 1;
                if (0 > nb.field_Fb.field_x) {
                  nb.field_Fb.field_x = 0;
                  break L86;
                } else {
                  break L86;
                }
              }
              var8 = 1;
              break L85;
            }
          }
          L87: {
            if (!var7.field_d) {
              break L87;
            } else {
              if (nb.field_Fb.field_x != uh.i(23156).field_t.field_o) {
                var8 = 1;
                break L87;
              } else {
                break L87;
              }
            }
          }
          if (var8 == 0) {
            break L2;
          } else {
            uh.i(23156).field_t.field_o = nb.field_Fb.field_x;
            wf.a(um.field_l[0], param1 + 122);
            break L2;
          }
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 < 108) {
            this.field_d = 116;
        }
        if (uh.i(23156) != null && param1 != 0) {
            uh.i(23156).field_l = param1;
            qk.field_h = -1;
            uh.i(23156).a(uh.i(23156).field_u, -111);
        }
    }

    final void a(byte param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        wg var4 = null;
        wg var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Chess.field_G;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -6) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ok.field_Ib[var2].b(-108);
                    var2++;
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = nb.field_Fb;
                    var5 = var4;
                    if (var5 != null) {
                        statePc = 5;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (ok.field_Ib[0].field_d) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4.field_x = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (!ok.field_Ib[1].field_d) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5.field_x = var5.field_x - 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (!ok.field_Ib[2].field_u) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_b = 50 + r.field_Eb;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (!ok.field_Ib[2].field_d) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_b <= r.field_Eb) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_b = r.field_Eb - -50;
                    var5.field_x = var5.field_x + 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (!ok.field_Ib[3].field_d) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5.field_x = var5.field_x + 1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (!ok.field_Ib[4].field_d) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var5.field_x = var5.field_y;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var5.c((byte) 73);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (param0 >= -91) {
                        statePc = 37;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_d == 0) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_d = th.field_d;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (r.field_bc) {
                        statePc = 36;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (fi.field_a) {
                        statePc = 36;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!kf.d(18954)) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.b((byte) 101);
                    if (var3 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var3 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_e.a(61, ak.field_k[this.field_c], ak.field_r[this.field_c], ak.field_y[this.field_c], ak.field_m[this.field_c]);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-1 != this.field_e.field_h) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.a(true, 2, this.field_e.field_h);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    qd.field_w.a(-0.1, (double)r.field_Eb / 300.0, true);
                    return;
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        L0: {
          if ((this.field_e.field_h ^ -1) == 0) {
            break L0;
          } else {
            param2 = this.field_e.field_h;
            break L0;
          }
        }
        this.field_e.a(param2, this.a(hn.field_k, (byte) -89, rf.field_b), param1, 0);
        if (param0 < 92) {
          return;
        } else {
          ad.field_a = -1;
          qf.field_e = -1;
          return;
        }
    }

    final void c(byte param0) {
        if (param0 != -57) {
            return;
        }
        if ((this.field_c ^ -1) == -5) {
            ce.field_b = null;
        }
    }

    aa(int param0) {
        this.field_h = 19;
        this.field_d = th.field_d;
        this.field_c = param0;
        this.field_e = new of(ak.field_q[this.field_c].length);
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackOut_27_0;
        int statePc = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        c var19 = null;
        c var21 = null;
        int[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Chess.field_G;
                    var19 = v.field_j;
                    var21 = var19;
                    var5 = param2 + 90;
                    var24 = new int[4];
                    wb.b(var24);
                    wb.b(5 + var5, 135, var5 - -455, 385);
                    var7 = 16772045;
                    wb.c(5 + var5, 135, 450, 250, 13875857, 15987691);
                    var7 = 5189423;
                    var8 = 0;
                    if (param0 == -18210) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c((byte) 94);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = 16;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = -481;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= (var9 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_18_0 = 16;
                    stackIn_6_0 = stackIn_18_0;
                    if (var18 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var10 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (640 <= var10) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_4_0 = var8;
                    stackIn_9_0 = stackIn_4_0;
                    if (var18 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    if (var8 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    wb.b(var10, var9, 44, 44, var7, 16);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var10 += 44;
                    if (var18 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var9 += 44;
                    if (var18 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    wb.a(var24);
                    stackIn_18_0 = param1 ? 1 : 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = wc.field_w;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = vk.field_b;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var9 = stackIn_21_0;
                    var10 = var5 + 10;
                    ad.field_a = -1;
                    var11 = 146;
                    if (-1 != (1024 & var9 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (qm.field_g == 1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var12 = 44;
                    if (var18 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var12 = 40;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var13 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var13 >= da.field_m.length) {
                        statePc = 62;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = qm.field_f[var13];
                    stackIn_63_0 = stackOut_27_0 ? 1 : 0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var18 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (0 == (var9 & 1 << var13)) {
                        statePc = 61;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-1 != ad.field_a) {
                        statePc = 43;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (hn.field_k < var10) {
                        statePc = 43;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var10 - -var12 < hn.field_k) {
                        statePc = 43;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (rf.field_b < var11) {
                        statePc = 43;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (rf.field_b > var11 + 32) {
                        statePc = 43;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ad.field_a = var13;
                    if (1 == this.field_d) {
                        statePc = 38;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (qf.field_e == ad.field_a) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    qf.field_e = ad.field_a;
                    if (var18 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    qf.field_e = -1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    this.field_d = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-1 != (1 << var13 & var9 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (param1) {
                        statePc = 61;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var13 != qf.field_e) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    lj.field_n.c(6 + var10 + param2, var11);
                    if (var18 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var13 == ad.field_a) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    lj.field_n.c(param2 + 6 + var10, var11);
                    if (var18 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    lj.field_n.c(6 + (var10 + param2), var11);
                    if (var18 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    me.field_c[var13].c(6 + var10, var11);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (ad.field_a == var13) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    wb.g(var10 - -6, var11, 32, 32, 3100495, 64);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var13 == qf.field_e) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    wb.d(var10 + 6, var11, 32, 32, 3100495);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    wb.a(-10 + var10, 32 + (var11 + 5), var12 + 20, 1);
                    var10 = var10 + var12;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var13++;
                    if (var18 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var10 = 16 + (var5 + param2);
                    var11 = 210 + var21.field_q;
                    this.field_d = 0;
                    stackIn_63_0 = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0 == (qf.field_e ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = qf.field_e;
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = ad.field_a;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var13 = stackIn_66_0;
                    if (-1 == var13) {
                        statePc = 81;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var21.b("<u=000001>" + da.field_m[var13] + "</u>", param2 + 320, 210, 1, -1);
                    if (!vi.a(param0 + 18207)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    jj.field_b.b(bf.field_N, 320 + param2, var11, 1, -1);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((1 << var13 & var9) == 0) {
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
                    var14_int = stackIn_72_0;
                    var15_ref = null;
                    if (var14_int != 0) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    lj.field_n.a(var10, var11);
                    var15_ref_String = hm.field_d;
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    me.field_c[var13].a(var10, var11);
                    var15_ref_String = ca.field_d;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var21.a(var15_ref_String, var10, lj.field_n.field_h + var11 + var21.field_q, 1, -1);
                    var10 = var10 + (16 + lj.field_n.field_k + 20);
                    var16 = 460 + var5;
                    var19.a(ai.field_a[var13], var10, var11, -var10 + (-10 + var16), 480, 1, -1, 0, 0, var21.field_C);
                    var11 += 7;
                    var21.a(pd.field_Ob + ma.field_J[var13], var10, var11 + 4 * var21.field_q, 1, -1);
                    var11 = var11 + (-(ao.field_e.field_h / 4) + 128);
                    var21.a(hc.field_d, var10, var21.field_C + var11, 1, -1);
                    var17 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var17 >= se.field_ab[var13]) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    ao.field_e.c(var17 * 5 + var21.b(hc.field_d) + (10 + var10), var11);
                    var17++;
                    if (var18 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var18 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var18 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var21.b(gh.field_d, param2 + 320, 210, 1, -1);
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var14 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
                    var15 = 4;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((var15 ^ -1) > -1) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    wb.a(var15 + var5, var15 + 130, 460 - (var15 << 1289375809), 260 + -(var15 << 1574632577), 10 - var15, var14[var15]);
                    wb.a(var15 + var5, var15 + 130, 460 + -(var15 << -1523232735), 260 - (var15 << -125393087), 10 - (var15 << 1479847617), var14[var15]);
                    var15--;
                    if (var18 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var18 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static km[] a(km param0, int param1) {
        km[] var2 = null;
        RuntimeException var2_ref = null;
        km[] var3 = null;
        km[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new km[9];
            var2 = var3;
            var3[param1] = param0;
            stackIn_1_0 = (km[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("aa.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void d(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
            field_g = (ci) null;
        }
    }

    private final void b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_46_0 = null;
        int statePc = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        String var11_ref_String = null;
        int var11 = 0;
        String[] var12_ref_String__ = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        String var22 = null;
        int var23_int = 0;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        int var29 = 0;
        c var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        int[] var37 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = Chess.field_G;
                    var31 = v.field_j;
                    ak.field_y[4] = ak.field_y[6];
                    if (param0 == -481) {
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
                    var4 = 70 + param1;
                    var37 = new int[4];
                    wb.b(var37);
                    wb.b(5 + var4, 135, -10 + var4 - -5 - -500, 385);
                    wb.c(5 + var4, 135, 490, 250, 13875857, 15987691);
                    var6 = 16772045;
                    var6 = 5189423;
                    var7 = 0;
                    var8 = 16;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = -481;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= (var8 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_17_0 = 16;
                    stackIn_6_0 = stackIn_17_0;
                    if (var29 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var9 ^ -1) <= -641) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_4_0 = var7;
                    stackIn_9_0 = stackIn_4_0;
                    if (var29 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var7 = stackIn_12_0;
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    wb.b(var9, var8, 44, 44, var6, 16);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var9 += 44;
                    if (var29 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var8 += 44;
                    if (var29 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    wb.a(var37);
                    var8 = 110 + param1;
                    stackIn_17_0 = 550 - -param1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = stackIn_17_0;
                    if (vi.a(-3)) {
                        statePc = 51;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (ce.field_b != null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ce.field_b = ge.a(true, 7, 0, 10);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var10_int = tk.field_e;
                    if (ce.field_b.field_l) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11_ref_String = m.field_c;
                    if (var29 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (null != ce.field_b.field_t) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var11_ref_String = ii.field_O;
                    if (var29 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var11_ref_String = um.field_h;
                    var12_ref_String__ = ce.field_b.field_t[var10_int];
                    var13 = ce.field_b.field_j[var10_int];
                    var14 = 140 + var31.field_C;
                    var15 = 1;
                    var31.a(ao.field_j, var8, var14, var15, -1);
                    var31.c(tk.field_f, -220 + var9, var14, var15, -1);
                    var31.c(qe.field_y, var9 + -150, var14, var15, -1);
                    var31.b(fm.field_O, -115 + var9, var14, var15, -1);
                    var31.b(mh.field_g, var9 + -65, var14, var15, -1);
                    var31.b(kl.field_a, var9 + -15, var14, var15, -1);
                    wb.e(-35 + var8, 1 - -var14, 50 + var9 - var8, 1, 128);
                    wb.e(var8 + -35, var14 + 1 + 2, -var8 + var9 - -50, 1, 128);
                    var14 += 20;
                    var16 = 0;
                    var17 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var17 ^ -1) <= -11) {
                        statePc = 40;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var29 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (null != var12_ref_String__[var17]) {
                        statePc = 29;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var18 = 1;
                    var19 = var13[4 * var17 + 1];
                    var20 = var13[var17 * 4 + 2];
                    var21 = var13[var17 * 4 + 3];
                    var22_int = var13[4 * var17];
                    var23_int = var19 - (-var20 - var21);
                    var32 = var12_ref_String__[var17];
                    if (qd.a((byte) 13, var32)) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var16 = 1;
                    var18 = 13732679;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var31.c(var17 - -1 + ". ", var8, var14, var18, -1);
                    var31.a(var32, var8, var14, var18, -1);
                    var31.c(Integer.toString(var22_int), -220 + var9, var14, var18, -1);
                    if (-51 > (var23_int ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = Integer.toString(var23_int);
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = "50+";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var33 = stackIn_35_0;
                    var25 = var33;
                    var31.c(var33, var9 + -150, var14, var18, -1);
                    if (var23_int == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var26 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var19 / var23_int)}, (byte) -95);
                    var27 = oc.a(wf.field_S, new String[]{Integer.toString(var21 * 100 / var23_int)}, (byte) -59);
                    var28 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var20 / var23_int)}, (byte) -96);
                    if (var29 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var28 = Chess.field_C;
                    var27 = Chess.field_C;
                    var26 = Chess.field_C;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var31.b(var26, var9 + -115, var14, var18, -1);
                    var31.b(var27, -65 + var9, var14, var18, -1);
                    var31.b(var28, var9 + -15, var14, var18, -1);
                    wb.e(var8 + -35, var14 + 1, var9 + -var8 - -50, 1, 32);
                    wb.a(-278 + var9, -19 + var14, 20, 1, 16);
                    wb.a(-215 + var9, 1 - (-var14 - -20), 20, 1, 16);
                    wb.a(var9 + -140, 1 - -var14 - 20, 20, 1, 16);
                    wb.a(-90 + var9, -20 + (var14 + 1), 20, 1, 16);
                    var11_ref_String = "";
                    wb.a(var9 - 40, var14 + -19, 20, 1, 16);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var14 += 20;
                    var17++;
                    if (var29 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var16 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var11_ref_String.length() == 0) {
                        statePc = 43;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var17 = 13732679;
                    var31.a(ci.field_J, var8, var14, var17, -1);
                    var31.c(Integer.toString(ce.field_b.field_k), var9 - 220, var14, var17, -1);
                    var18 = ce.field_b.field_m;
                    var19 = ce.field_b.field_r;
                    var20 = ce.field_b.field_p;
                    var21 = var20 + var18 + var19;
                    if (50 < var21) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = Integer.toString(var21);
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = "50+";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var34 = stackIn_46_0;
                    var25 = var34;
                    var31.c(var34, -150 + var9, var14, var17, -1);
                    if (0 == var21) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var22 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var18 / var21)}, (byte) -102);
                    var23 = oc.a(wf.field_S, new String[]{Integer.toString(var19 * 100 / var21)}, (byte) -88);
                    var24 = oc.a(wf.field_S, new String[]{Integer.toString(var20 * 100 / var21)}, (byte) -98);
                    if (var29 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var24 = Chess.field_C;
                    var23 = Chess.field_C;
                    var22 = Chess.field_C;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var31.b(var22, var9 + -115, var14, var17, -1);
                    var31.b(var23, -65 + var9, var14, var17, -1);
                    var31.b(var24, var9 + -15, var14, var17, -1);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var12 = 100 + var31.field_C + 140;
                    var31.b(var11_ref_String, param1 + 330, var12, 1, -1);
                    if (var29 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    v.field_j.b(bf.field_N, param1 + 320, 240, 1, -1);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var10 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
                    var11 = 4;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if ((var11 ^ -1) > -1) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    wb.a(var11 + var4, 130 + var11, 500 + -(var11 << -1413404575), 260 + -(var11 << 53236161), -var11 + 10, var10[var11]);
                    wb.a(var11 + var4, var11 + 130, -(var11 << -196184831) + 500, -(var11 << -137978655) + 260, 10 - (var11 << 1342469249), var10[var11]);
                    var11--;
                    if (var29 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var29 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int e(int param0, int param1) {
        if (param0 != 0) {
            this.field_h = -33;
        }
        if (4 == this.field_c && !vi.a(-3)) {
            return 2 > param1 ? 100 + 240 * param1 : 260;
        }
        if (!(-6 != (this.field_c ^ -1))) {
            return 180 * param1 + ak.field_k[this.field_c];
        }
        return ak.field_k[this.field_c];
    }

    private final void a(int param0) {
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        eb stackIn_55_0 = null;
        eb stackIn_56_0 = null;
        eb stackIn_57_0 = null;
        eb stackIn_58_0 = null;
        eb stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int statePc = 0;
        Object var2 = null;
        km var2_ref = null;
        qe var3 = null;
        int var4 = 0;
        int var5_int = 0;
        wg var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        String[] var11_ref_String__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int[] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Chess.field_G;
                    if (uh.i(23156) != null) {
                        statePc = 2;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 2: {
                    uh.i(23156).field_t.f(nb.field_Fb.field_y, -1);
                    var2 = null;
                    var3 = uh.i(param0 + 5234).field_t.field_K;
                    if (var3 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = -1;
                    if (var15 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((uk) ((Object) var3)).a((byte) 61, 4096)) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!((uk) ((Object) var3)).a((byte) 61, 0)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = 1;
                    if (var15 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!uh.i(23156).field_B.field_d) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = eg.a(uh.i(param0 ^ 7286).field_B.field_l, 0, uh.i(23156).field_B.field_k);
                    if (var15 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = -1;
                    if (var15 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5_int = var4;
                    if ((var5_int ^ -1) == -1) {
                        statePc = 19;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var5_int != 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var15 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var5_int == -1) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-3 != var5_int) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var2_ref = jh.field_b;
                    statePc = 23;
                    continue stateLoop;
                }
                case 20: {
                    var2_ref = vn.field_Bb;
                    statePc = 23;
                    continue stateLoop;
                }
                case 21: {
                    var2_ref = fa.field_e;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    var2_ref = fa.field_e;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (16 > nc.field_T) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.b(param0 + -17792);
                    var2_ref.b(0, 0, (-4096 + nc.field_T * 256) / 16);
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var2_ref.d(0, 0);
                    wb.a(15, 16, 210, 2 * ec.c((byte) -63) + 435, 9, 13421772, 96);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var5 = nb.field_Fb;
                    if (var5 == null) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5.field_y = uh.i(23156).field_t.a((byte) -114);
                    if (0 == (var5.field_x ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var5.field_x = var5.field_y;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var6 = ec.c((byte) -63) * 2 + 435;
                    var7 = ak.field_m[3] + this.field_e.field_f * ak.field_y[this.field_c];
                    wb.a(21, 218, 198, var6 - var7, 9, 1, 170);
                    var8 = uh.i(param0 + 5234).field_t.field_L;
                    if (var8 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (0 != var8.length) {
                        statePc = 41;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var9 = v.field_j.field_t + v.field_j.field_C;
                    var10_ref_String = wc.field_F;
                    var11_ref_String__ = new String[50];
                    var20 = new int[50];
                    var13 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (-51 >= (var13 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var20[var13] = 200;
                    var13++;
                    if (var15 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var13 = v.field_j.a(var10_ref_String, var20, var11_ref_String__);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var14 = var13 * var9 - -(var9 / 2);
                    wb.a(331, 191, 218, 18 + var14, 9, 13421772, 96);
                    wb.a(335, 195, 210, var14 + 10, 9, 1, 170);
                    v.field_j.a(var10_ref_String, 340, 200, 200, var14, 16777215, 1, 1, 1, var9);
                    if (var15 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    uh.i(param0 ^ 7286).field_t.a(true, r.field_Eb, nb.field_Fb.field_x);
                    var9 = var8.length;
                    var11 = -1 + var9;
                    var12 = 256;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var11 < 0) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_51_0 = 0;
                    stackIn_44_0 = stackIn_51_0;
                    stackIn_51_1 = var12;
                    stackIn_44_1 = stackIn_51_1;
                    if (var15 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 >= stackIn_44_1) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var10 = (var11 + -var9) * v.field_j.field_q + var6;
                    var12 = 256 * (-var7 + var10) / (var6 - var7);
                    if (var12 < 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    v.field_j.a(var8[var11], ak.field_k[10], var10 + v.field_j.field_C, 16777215, 1, var12);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var11--;
                    if (var15 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (uh.i(23156).field_b) {
                        statePc = 50;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = param0;
                    stackIn_51_1 = 7286;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    uh.i(stackIn_51_0 ^ stackIn_51_1).c(param0 + -17921, true);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (param0 == 17922) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var16 = (String) null;
                    aa.a((java.applet.Applet) null, -125, (String) null);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    nb.b(0, 25);
                    qh.field_b.field_J = (lh) ((Object) jj.field_b);
                    stackIn_57_0 = qh.field_b;
                    stackIn_55_0 = stackIn_57_0;
                    if (hl.field_h) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_58_0 = (eb) ((Object) stackIn_55_0);
                    stackIn_56_0 = stackIn_58_0;
                    if (!pk.field_j) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (eb) ((Object) stackIn_56_0);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = (eb) ((Object) stackIn_57_0);
                    stackIn_59_1 = 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (eb) ((Object) stackIn_58_0);
                    stackIn_59_1 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_59_0.field_C = stackIn_59_1 != 0;
                    qh.field_b.d((byte) -2);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        qe stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        qe stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        if (uh.i(param0 ^ 23286) == null) {
          wb.b(0, 0, 640, 480, 1, 64);
          return;
        } else {
          L0: {
            if (param0 == 130) {
              break L0;
            } else {
              field_a = (String) null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (!uh.i(23156).field_g) {
                break L2;
              } else {
                uh.i(23156).field_t.h(-78);
                if (Chess.field_G == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              stackIn_10_0 = uh.i(23156).field_t;

              stackIn_10_1 = uh.i(23156).b(0);

              if (0 != (jc.field_f ^ -1)) {
                stackIn_11_0 = (qe) ((Object) stackIn_10_0);
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = 0;
                break L3;
              } else {
                stackIn_11_0 = (qe) ((Object) stackIn_10_0);
                stackIn_11_1 = stackIn_10_1;
                stackIn_11_2 = 1;
                break L3;
              }
            }
            ((qe) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2 != 0, qb.field_a, 0, (byte) -104, true);
            break L1;
          }
          return;
        }
    }

    static {
        field_a = "Log in / Create account";
    }
}
