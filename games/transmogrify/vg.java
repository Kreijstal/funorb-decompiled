/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    private int field_c;
    private int field_d;
    static String field_g;
    static String field_a;
    al field_j;
    static ea field_b;
    private int field_e;
    private int field_h;
    private int field_f;
    private int field_i;

    private final int f(int param0, int param1) {
        boolean stackIn_18_0 = false;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param1 == 206) {
            break L0;
          } else {
            this.field_i = 39;
            break L0;
          }
        }
        L1: {
          if (-3 != (this.field_i ^ -1)) {
            break L1;
          } else {
            if (qj.b((byte) 112)) {
              break L1;
            } else {
              if (-4 < (param0 ^ -1)) {
                return fd.field_a[this.field_i];
              } else {
                return fd.field_b[this.field_i] + fd.field_a[this.field_i];
              }
            }
          }
        }
        if ((this.field_i ^ -1) != -4) {
          L2: {
            if (this.field_i == 1) {
              break L2;
            } else {
              if (this.field_i == 7) {
                break L2;
              } else {
                return fd.field_a[this.field_i] - -(param0 * fd.field_b[this.field_i]);
              }
            }
          }
          var3 = fd.field_a[this.field_i];
          var4 = 0;
          L3: while (true) {
            if (var4 < param0) {
              stackIn_18_0 = this.a(var4, false);

              if (var5 == 0) {
                L4: {
                  if (!stackIn_18_0) {
                    break L4;
                  } else {
                    var3 = var3 + fd.field_b[this.field_i];
                    break L4;
                  }
                }
                var4++;
                if (var5 == 0) {
                  continue L3;
                } else {
                  return var3;
                }
              } else {
                return stackIn_18_0 ? 1 : 0;
              }
            } else {
              return var3;
            }
          }
        } else {
          return fd.field_a[this.field_i];
        }
    }

    private final void e(int param0, int param1) {
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    var8 = new String[16];
                    var3 = var8;
                    var4 = wf.field_d.a(db.field_b[ra.field_a], lk.field_e, var3);
                    var5 = 0;
                    var6 = 156 + param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 <= var5) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    wf.field_d.b(var8[var5], 54, var6, 119, -1);
                    var5++;
                    var6 += 22;
                    if (var7 != 0) {
                        statePc = 8;
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
                    if (param1 < -25) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(true, -9, -1, 116);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    wf.field_d.a(rh.a((byte) 117, 1 + ra.field_a), 548, param0 + 142, 0, -1);
                    se.field_t.c(166, param0);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, boolean param1) {
        if (!param1) {
          L0: {
            if (3 == this.field_i) {
              L1: {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (ra.field_a == 0) {
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (2 != param0) {
                  break L2;
                } else {
                  if (ra.field_a == -1 + db.field_b.length) {
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((param0 ^ -1) != -4) {
                  break L3;
                } else {
                  if (-1 + db.field_b.length != ra.field_a) {
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              if (-4 != (param0 ^ -1)) {
                break L0;
              } else {
                if (wc.field_d != 1) {
                  if (-8 != (wc.field_d ^ -1)) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L4: {
            if ((this.field_i ^ -1) == -2) {
              break L4;
            } else {
              if (-8 == (this.field_i ^ -1)) {
                break L4;
              } else {
                return true;
              }
            }
          }
          if ((fd.field_h[this.field_i][param0] ^ -1) == -5) {
            if (wj.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, byte param1) {
        L0: {
          if ((this.field_i ^ -1) != -3) {
            break L0;
          } else {
            if (qj.b((byte) 80)) {
              break L0;
            } else {
              if (param0 < 3) {
                return fd.field_e[this.field_i] - -(param0 * 200);
              } else {
                return 200 + fd.field_e[this.field_i];
              }
            }
          }
        }
        if ((this.field_i ^ -1) != -4) {
          if (param1 != 123) {
            return -90;
          } else {
            return fd.field_e[this.field_i];
          }
        } else {
          if (param0 == 3) {
            return fd.field_e[this.field_i] + 400;
          } else {
            return param0 * 200 + fd.field_e[this.field_i];
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_39_0 = 0;
        int stackIn_50_0 = 0;
        boolean stackOut_5_0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Transmogrify.field_A ? 1 : 0;
                    var4 = 283;
                    var5 = 112;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = hc.field_u;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = rh.field_n;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    var7 = 0;
                    var8 = -1;
                    var9 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (qj.field_a.length <= var9) {
                        statePc = 38;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = wl.a(false, 0);
                    stackIn_39_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var15 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var9 ^ -1) != -16) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-1 != (32768 & var6 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1 != (1 << var9 & var6 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (!param0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var15 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ff.field_z.e(var4, var5 + param2);
                    if (var15 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    fc.field_h[var9].e(var4, param2 + var5);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var4 > oa.field_j) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (32 + var4 < oa.field_j) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (param2 + var5 > bk.field_a) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (bk.field_a > param2 + (var5 - -32)) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    sb.b(-2 + var4, -2 + var5, 36, 36, 6, 8421504);
                    var8 = var9;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var4 > this.field_d) {
                        statePc = 31;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_d > 32 + var4) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (param2 + var5 > this.field_h) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (32 + (var5 - -param2) < this.field_h) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_d = -1;
                    if (var9 != this.field_e) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_e = -1;
                    if (var15 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_e = var9;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (this.field_e != var9) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    sb.b(var4 - 2, var5 - 2, 36, 36, 6, 1579032);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    incrementValue$0 = var7;
                    var7++;
                    if (-8 == (incrementValue$0 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var4 += 40;
                    statePc = 37;
                    continue stateLoop;
                }
                case 35: {
                    var4 = 283;
                    var5 += 40;
                    if (var15 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var4 += 40;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var9++;
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = -1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 >= this.field_e) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var8 = this.field_e;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (param1 == -2) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    if ((var8 ^ -1) != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var5 = param2 + 206 - wf.field_d.field_y;
                    var9 = wf.field_d.field_t + wf.field_d.field_y;
                    var5 = var5 + var9 * wf.field_d.a(aj.field_v, 283, var5, 310, 1000, 0, -1, 1, 0, var9);
                    var5 = var5 + var9;
                    if (!qj.b((byte) 95)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    wf.field_d.a(tj.field_t, 283, var5, 310, 1000, 0, -1, 1, 0, var9);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var15 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var9 = wf.field_d.field_t + (wf.field_d.field_D + 2);
                    wf.field_d.c(qj.field_a[var8], 438, param2 + 206, 0, -1);
                    if (-1 == (var6 & 1 << var8 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var10 = stackIn_50_0;
                    if (var10 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    wf.field_d.c(ff.field_x, 438, var9 + 206 + param2, 16711680, -1);
                    if (var15 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    wf.field_d.c(rl.field_i, 438, 206 + (var9 - -param2), 0, -1);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var10 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    fc.field_h[var8].c(263, param2 + (206 - -var9));
                    if (var15 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ff.field_z.c(263, 206 - -var9 + param2);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var11 = 4 + (wf.field_d.field_y * 2 + (206 - -param2));
                    var12 = new String[16];
                    var13 = wf.field_d.a(bl.field_b[var8], new int[]{219}, var12);
                    var11 = var11 + ((-var13 + 4) * var9 >> -2038598975);
                    var14 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (var14 >= var13) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    wf.field_d.b(var12[var14], 394, var11, 0, -1);
                    var11 = var11 + var9;
                    var14++;
                    if (var15 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var15 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((var13 ^ -1) > -4) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var11 = var11 + var9;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    wf.field_d.b(gj.field_f + rg.field_B[var8], 394, var11, 0, -1);
                    var4 = 394;
                    var11 = var11 + var9;
                    wf.field_d.b(ck.field_F, var4, var11, 0, -1);
                    var4 = var4 + wf.field_d.a(ck.field_F);
                    var14 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (wd.field_k[var8] <= var14) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    og.field_b.c(var4, -wf.field_d.field_y + var11);
                    var4 = var4 + og.field_b.field_n / 3;
                    var14++;
                    if (var15 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var15 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 256) {
            field_g = (String) null;
        }
        int var3 = 0;
        if (this.field_i == 0 && 0 != (this.field_j.field_d ^ -1)) {
            var3 = this.field_j.field_d;
        }
        if ((this.field_i ^ -1) == -2 && (this.field_j.field_d ^ -1) != 0) {
            if (!((be.field_q ^ -1) == 0)) {
                var3 = this.field_j.field_d;
            }
        }
        if (!(-4 != (this.field_i ^ -1))) {
            var3 = 2;
        }
        this.field_j.a(this.a(oa.field_j, param1 + 1192, bk.field_a), var3, (byte) 61, param0);
        this.field_e = -1;
        this.field_f = 0;
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_222_0 = 0;
        boolean stackIn_225_0 = false;
        boolean stackIn_235_0 = false;
        int stackIn_238_0 = 0;
        boolean stackOut_224_0;
        boolean stackOut_234_0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Transmogrify.field_A ? 1 : 0;
                    if (!rj.field_b) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var4 = stackIn_3_0;
                    if (null == ub.field_c) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!ub.field_c.field_c) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = fd.field_h[this.field_i][param1];
                    if (param2) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (uc.field_d) {
                        statePc = 12;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (qj.b((byte) 120)) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null != sh.field_c) {
                        statePc = 14;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    uc.field_d = false;
                    statePc = 18;
                    continue stateLoop;
                }
                case 16: {
                    var5 = 20;
                    if (var10 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    uc.field_d = false;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var9 = var5;
                    if (0 != var9) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var10 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var9 ^ -1) == -21) {
                        statePc = 72;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var9 == 1) {
                        statePc = 77;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var9 != 21) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var10 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-6 == (var9 ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (16 != var9) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var10 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var9 ^ -1) != -15) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var10 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-4 != (var9 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var10 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (-7 != (var9 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var10 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((var9 ^ -1) != -3) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var10 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (12 == var9) {
                        statePc = 102;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (13 != var9) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var10 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (-5 == (var9 ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((var9 ^ -1) == -8) {
                        statePc = 159;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-23 != (var9 ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var10 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (8 != var9) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var10 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var9 == 9) {
                        statePc = 180;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (-11 == (var9 ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (-16 != (var9 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var10 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var9 == 18) {
                        statePc = 195;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var9 == 19) {
                        statePc = 201;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (-12 != (var9 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var10 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (17 != var9) {
                        statePc = 232;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var10 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (this.field_j.f(-9112)) {
                        statePc = 69;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var4 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    vk.a((byte) 91, dg.field_d[0]);
                    sh.field_c = null;
                    rh.field_t = null;
                    rc.a(false, (byte) -13);
                    wc.field_d = 0;
                    qf.field_d = -1;
                    wd.a(17099, true, bd.field_u[1]);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (this.field_j.f(-9112)) {
                        statePc = 74;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var4 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    vk.a((byte) 105, dg.field_d[0]);
                    sh.field_c = null;
                    rh.field_t = null;
                    rc.a(true, (byte) -13);
                    wc.field_d = 0;
                    qf.field_d = -1;
                    uc.field_d = false;
                    wd.a(17099, true, bd.field_u[1]);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (this.field_j.f(-9112)) {
                        statePc = 79;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var4 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    vk.a((byte) 112, dg.field_d[0]);
                    wc.field_d = 0;
                    qf.field_d = -1;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (!this.field_j.f(-9112)) {
                        statePc = 232;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    vk.a((byte) 127, dg.field_d[0]);
                    qf.field_d = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (this.field_j.f(-9112)) {
                        statePc = 89;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 89: {
                    vk.a((byte) 89, dg.field_d[0]);
                    qf.field_d = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (this.field_j.f(-9112)) {
                        statePc = 92;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 92: {
                    vk.a((byte) 120, dg.field_d[0]);
                    qf.field_d = 4;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (this.field_j.f(-9112)) {
                        statePc = 95;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 95: {
                    vk.a((byte) 110, dg.field_d[0]);
                    wc.field_d = this.field_i;
                    qf.field_d = 3;
                    ra.field_a = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (this.field_j.f(-9112)) {
                        statePc = 98;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 98: {
                    vk.a((byte) 125, dg.field_d[0]);
                    qf.field_d = wc.field_d;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (this.field_j.f(-9112)) {
                        statePc = 101;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 101: {
                    vk.a((byte) 91, dg.field_d[0]);
                    qf.field_d = 2;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var6 = kc.field_g;
                    var7 = 0;
                    if (this.field_j.e(0)) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    ec.a(0, 9956);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (!this.field_j.c(-4135)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var7 = 1;
                    ec.a(256, 9956);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (this.field_j.b((byte) 78)) {
                        statePc = 109;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var9 = 256 * (oa.field_j + -this.field_c) / 80;
                    if (-1 <= (var9 ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var9 >= 256) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    ec.a(var9, 9956);
                    if (var10 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    ec.a(256, 9956);
                    if (var10 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    ec.a(0, 9956);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (!this.field_j.c(param2)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    qj.e(-127);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (this.field_j.c((byte) -72)) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    lf.a((byte) -125);
                    var7 = 1;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (kc.field_g != var6) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var7 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (!lj.field_u.b(8)) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (lj.field_u.l()) {
                        statePc = 127;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 127: {
                    lj.field_u.j(0);
                    lj.field_u.k(255);
                    ic.a(lj.field_u, 4);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (this.field_j.e(0)) {
                        statePc = 130;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 130: {
                    uc.a(0, (byte) -118);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var8 = 128;
                    if (this.field_j.c(-4135)) {
                        statePc = 133;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 133: {
                    uc.a(var8, (byte) -121);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (!this.field_j.b((byte) 83)) {
                        statePc = 142;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var9 = 256 * (oa.field_j + -this.field_c) / 80;
                    if (-1 <= (var9 ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var9 >= 256) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    uc.a(128 * var9 >> 798121384, (byte) -122);
                    if (var10 == 0) {
                        statePc = 142;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    uc.a(var8, (byte) -127);
                    if (var10 == 0) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    uc.a(0, (byte) -117);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (this.field_j.c(param2)) {
                        statePc = 144;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (lb.field_a <= var8 >> 1595812227) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    uc.a(-(var8 >> -758142493) + lb.field_a, (byte) -124);
                    if (var10 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    uc.a(0, (byte) -125);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (!this.field_j.c((byte) -72)) {
                        statePc = 232;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (var8 * 7 >> 776980515 <= lb.field_a) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    uc.a((var8 >> 1690858499) + lb.field_a, (byte) -123);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    uc.a(var8, (byte) -127);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (!this.field_j.f(-9112)) {
                        statePc = 232;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    vk.a((byte) 83, dg.field_d[0]);
                    if (null == ub.field_c) {
                        statePc = 158;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    qd.b(5);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var9 = param0 ? 1 : 0;
                    dj.a(param2, var9 != 0);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (this.field_j.f(-9112)) {
                        statePc = 161;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 161: {
                    vk.a((byte) 120, dg.field_d[0]);
                    if (-1 != (hc.field_u ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (pf.field_g == 0) {
                        statePc = 172;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (qj.b((byte) 82)) {
                        statePc = 170;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    ug.b(true);
                    if (-1 != (hc.field_u ^ -1)) {
                        statePc = 168;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    qf.field_d = 2;
                    if (var10 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    qf.field_d = 6;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    sh.field_c = null;
                    if (var10 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    qf.field_d = 5;
                    if (var10 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    qf.field_d = 0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    wc.field_d = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (this.field_j.f(-9112)) {
                        statePc = 176;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 176: {
                    vk.a((byte) 127, dg.field_d[0]);
                    wc.field_d = 0;
                    qf.field_d = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (this.field_j.f(-9112)) {
                        statePc = 179;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 179: {
                    vk.a((byte) 92, dg.field_d[0]);
                    ck.field_y = 0;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (this.field_j.f(-9112)) {
                        statePc = 182;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 182: {
                    vk.a((byte) 88, dg.field_d[0]);
                    ck.field_y = 1;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (this.field_j.f(-9112)) {
                        statePc = 185;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 185: {
                    vk.a((byte) 105, dg.field_d[0]);
                    ck.field_y = 2;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (this.field_j.f(-9112)) {
                        statePc = 188;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 188: {
                    vk.a((byte) 92, dg.field_d[0]);
                    if (4 == this.field_i) {
                        statePc = 193;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_i ^ -1) == -3) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (-6 == (this.field_i ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 192: {
                    vb.a(5, 6, (byte) 99);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    vb.a(this.field_i, this.field_i, (byte) 121);
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!this.field_j.f(-9112)) {
                        statePc = 232;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (this.a(param1, false)) {
                        statePc = 198;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 198: {
                    vk.a((byte) 105, dg.field_d[0]);
                    ra.field_a = ra.field_a - 1;
                    if (-1 == (ra.field_a ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 200: {
                    this.field_j.field_d = 2;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (!this.field_j.f(-9112)) {
                        statePc = 232;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (this.a(param1, false)) {
                        statePc = 204;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 204: {
                    vk.a((byte) 127, dg.field_d[0]);
                    ra.field_a = ra.field_a + 1;
                    if (-1 + db.field_b.length == ra.field_a) {
                        statePc = 206;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if ((wc.field_d ^ -1) == -2) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (wc.field_d != 7) {
                        statePc = 211;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    this.field_j.field_d = 1;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_j.field_d = 3;
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (this.field_j.f(-9112)) {
                        statePc = 215;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 215: {
                    vk.a((byte) 106, dg.field_d[0]);
                    vl.a((byte) 93, ha.b(125));
                    if (var10 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (this.field_j.d(104)) {
                        statePc = 218;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 218: {
                    vk.a((byte) 120, dg.field_d[0]);
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    fieldTemp$0 = am.field_n + 1;
                    am.field_n = am.field_n + 1;
                    if (fieldTemp$0 == we.field_l.length) {
                        statePc = 221;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 221: {
                    stackIn_222_0 = 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    am.field_n = stackIn_222_0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (we.field_l[am.field_n].field_g) {
                        statePc = 219;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackOut_224_0 = this.field_j.a((byte) -112);
                    stackIn_222_0 = stackOut_224_0 ? 1 : 0;
                    stackIn_225_0 = stackOut_224_0;
                    if (var10 != 0) {
                        statePc = 222;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (stackIn_225_0) {
                        statePc = 227;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 227: {
                    vk.a((byte) 113, dg.field_d[0]);
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    fieldTemp$1 = am.field_n - 1;
                    am.field_n = am.field_n - 1;
                    if ((fieldTemp$1 ^ -1) <= -1) {
                        statePc = 230;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    am.field_n = -1 + we.field_l.length;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (we.field_l[am.field_n].field_g) {
                        statePc = 228;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    return;
                }
                case 234: {
                    stackOut_234_0 = this.field_j.a((byte) -112);
                    stackIn_238_0 = stackOut_234_0 ? 1 : 0;
                    stackIn_235_0 = stackOut_234_0;
                    if (var10 != 0) {
                        statePc = 238;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    stackIn_225_0 = stackIn_235_0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 236: {
                    if (we.field_l[am.field_n].field_g) {
                        statePc = 240;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 238: {
                    am.field_n = stackIn_238_0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 239: {
                    stackIn_238_0 = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 240: {
                    fieldTemp$2 = am.field_n + 1;
                    am.field_n = am.field_n + 1;
                    if (fieldTemp$2 == we.field_l.length) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0, int param1) {
        if (param0 <= 100) {
            this.field_d = 62;
        }
        if (!(!ci.field_g[this.field_i])) {
            return jk.field_x.a(true);
        }
        return fd.field_b[this.field_i];
    }

    final void c(byte param0) {
        int statePc = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    this.field_f = this.field_f + 1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!pc.b(-128)) {
                        statePc = 13;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (13 != ch.field_d) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_i == 1) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-8 == (this.field_i ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_i != 5) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 7: {
                    qf.field_d = wc.field_d;
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    qf.field_d = -1;
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.b((byte) -120);
                    if (this.field_j.field_d == -1) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a(false, this.field_j.field_d, true);
                    if (var3 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (3 != this.field_i) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ob.a(1, 2, sg.field_p, this.field_f);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_i == 2) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((this.field_i ^ -1) != -7) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (null == d.field_e) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    wd.a(17099, true, bd.field_u[6]);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (param0 == 122) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.g(-27, -43);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    this.field_j.a(-107, this.a(ol.field_b, 1448, nk.field_c), this.a(oa.field_j, 1448, bk.field_a));
                    if (-1 == this.field_j.field_d) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.a(true, this.field_j.field_d, true);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (-1 == (tg.field_d ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_h = nk.field_c;
                    this.field_d = ol.field_b;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var3_int ^ -1) >= -13) {
                  L1: {
                    var4 = hj.a((byte) -125, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (uf.a(var4.charAt(0), (byte) -56)) {
                            break L2;
                          } else {
                            if (uf.a(var4.charAt(-1 + var4.length()), (byte) -104)) {
                              break L2;
                            } else {
                              L3: {
                                if (param2 == 26) {
                                  break L3;
                                } else {
                                  vg.a((byte) -35);
                                  break L3;
                                }
                              }
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                L5: {
                                  L6: {
                                    if (var6 >= param1.length()) {
                                      break L6;
                                    } else {
                                      var7 = param1.charAt(var6);
                                      stackOut_23_0 = uf.a((char) var7, (byte) -121);
                                      stackIn_35_0 = stackOut_23_0 ? 1 : 0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (var8 != 0) {
                                        break L5;
                                      } else {
                                        L7: {
                                          if (!stackIn_24_0) {
                                            var5 = 0;
                                            if (var8 == 0) {
                                              break L7;
                                            } else {
                                              var5++;
                                              break L7;
                                            }
                                          } else {
                                            var5++;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if (-3 < (var5 ^ -1)) {
                                            break L8;
                                          } else {
                                            if (!param0) {
                                              stackIn_32_0 = 0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var8 == 0) {
                                          continue L4;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  stackIn_35_0 = var5;
                                  break L5;
                                }
                                if (stackIn_35_0 <= 0) {
                                  stackIn_39_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  stackIn_37_0 = 0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("vg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_37_0 != 0;
                  } else {
                    return stackIn_39_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -60) {
            return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    private final int a(int param0, int param1) {
        if ((this.field_i ^ -1) == -3) {
            if (!(qj.b((byte) 94))) {
                return 180 + this.a(param0, (byte) 123);
            }
        }
        if (!(-4 != (this.field_i ^ -1))) {
            return this.a(param0, (byte) 123) + 180;
        }
        if (param1 != 180) {
            vg.a(127, 64, false, true, 96, 2, 81);
        }
        return fd.field_c[this.field_i];
    }

    private final void g(int param0, int param1) {
        String var3;
        int var4;
        mi var5_ref_mi;
        int var5;
        o var6;
        int var7;
        int var8;
        String[] var9;
        int var12;
        int var13_int;
        ti var13;
        int var14;
        int var15;
        int var16;
        String var17;
        ti var18;
        int var19;
        int[] var26;
        long[] var27;
        L0: {
          L1: {
            var19 = Transmogrify.field_A ? 1 : 0;
            var4 = -66 / ((param0 - 41) / 60);
            if (qj.b((byte) 93)) {
              break L1;
            } else {
              L2: {
                if (sh.field_c != null) {
                  break L2;
                } else {
                  sh.field_c = pj.a(29, (byte) -10, 3, 10, 1);
                  break L2;
                }
              }
              L3: {
                L4: {
                  var5_ref_mi = wf.field_d;
                  var6 = sh.field_c;
                  var7 = ck.field_y;
                  if (var6.field_k) {
                    break L4;
                  } else {
                    var3 = mh.field_d;
                    if (var19 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6.field_m != null) {
                    break L5;
                  } else {
                    var3 = wg.field_e;
                    if (var19 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                var3 = th.field_e;
                var8 = 0;
                var9 = var6.field_m[var7];
                var27 = var6.field_g[var7];
                var26 = var6.field_l[var7];
                var12 = param1 + var5_ref_mi.field_y + 23;
                var13_int = 0;
                L6: while (true) {
                  L7: {
                    if (var13_int >= 10) {
                      break L7;
                    } else {
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L8: {
                          if (var9[var13_int] != null) {
                            L9: {
                              var14 = 119;
                              var15 = var26[var13_int] >> -692037434;
                              var16 = 63 & var26[var13_int];
                              var17 = var9[var13_int];
                              var3 = var17;
                              var3 = var17;
                              if (!qg.a(var17, (byte) 106)) {
                                break L9;
                              } else {
                                if (var8 != 0) {
                                  break L9;
                                } else {
                                  if (rh.field_t == null) {
                                    break L9;
                                  } else {
                                    if (var27[var13_int] != rh.field_t.field_o) {
                                      break L9;
                                    } else {
                                      if (pf.field_g != var15) {
                                        break L9;
                                      } else {
                                        if (qi.field_c.field_o == var16) {
                                          var8 = 1;
                                          var14 = 255;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5_ref_mi.a(var13_int + 1 + ". ", 268, var12, var14, -1);
                            var5_ref_mi.b(var17, 268, var12, var14, -1);
                            var5_ref_mi.a(Integer.toString(var15), 520, var12, var14, -1);
                            var18 = we.field_l[var16].field_a;
                            var18.f(528, -1 + (-var5_ref_mi.field_y + (var12 + var5_ref_mi.field_C)) - (24 + -((-var18.field_m + 24) / 2)));
                            var3 = "";
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12 += 28;
                        var13_int++;
                        if (var19 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (-2147483648 == pf.field_g) {
                    break L3;
                  } else {
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (pf.field_g == 0) {
                        break L3;
                      } else {
                        var5_ref_mi.b(w.field_a, 268, var12, 255, -1);
                        var5_ref_mi.a(Integer.toString(pf.field_g), 520, var12, 255, -1);
                        var13 = qi.field_c.field_a;
                        var13.f(528, (24 + -var13.field_m) / 2 + (-1 + var5_ref_mi.field_C + -var5_ref_mi.field_y) + (var12 - 24));
                        break L3;
                      }
                    }
                  }
                }
              }
              if (var19 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = tj.field_t;
          break L0;
        }
        L10: {
          var5 = param1 + 163;
          wf.field_d.a(var3, 224, var5, 346, 1000, 119, -1, 1, 0, -4 + (wf.field_d.field_t + wf.field_d.field_y));
          if (0 == var3.length()) {
            var5 = 331 + param1;
            og.field_a.a(sg.field_o, 224, var5, 346, 1000, 119, -1, 1, 0, og.field_a.field_y - (-og.field_a.field_t - -4));
            break L10;
          } else {
            break L10;
          }
        }
    }

    final void d(int param0, int param1) {
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        String var8;
        String var9;
        String var10;
        L0: {
          L1: {
            var7 = Transmogrify.field_A ? 1 : 0;
            rk.field_r[this.field_i].f(0, param1);
            if ((this.field_i ^ -1) != -3) {
              break L1;
            } else {
              this.g(param0 + -20002, param1);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (3 != this.field_i) {
            L2: {
              if (4 == this.field_i) {
                break L2;
              } else {
                L3: {
                  if ((this.field_i ^ -1) != -7) {
                    break L3;
                  } else {
                    this.a(true, -2, param1);
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-6 == (this.field_i ^ -1)) {
                  L4: {
                    var3 = 130 + param1;
                    var4 = 4 + wf.field_d.field_t + wf.field_d.field_D;
                    var5 = var4 * wf.field_d.b(sd.field_Q, 341);
                    wf.field_d.a(sd.field_Q, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                    var3 = var3 + var5;
                    stackIn_13_0 = 1;

                    if (-1 == (hc.field_u ^ -1)) {
                      stackIn_14_0 = stackIn_13_0;
                      stackIn_14_1 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = stackIn_13_0;
                      stackIn_14_1 = 1;
                      break L4;
                    }
                  }
                  L5: {




                    stackIn_16_2 = 0;

                    if (pf.field_g == 0) {


                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = 0;
                      break L5;
                    } else {


                      stackIn_17_2 = stackIn_16_2;
                      stackIn_17_3 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = aj.a(stackIn_14_0 != 0, stackIn_14_1 != 0, stackIn_17_2 != 0, stackIn_17_3 != 0);
                    var5 = var4 * wf.field_d.b(var8, 341);
                    wf.field_d.a(var8, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                    var3 = var3 + var5;
                    var3 = var3 + (jk.field_x.a(true) + var4);
                    stackIn_19_0 = -85;

                    stackIn_19_1 = 0;

                    if (-1 == (pf.field_g ^ -1)) {
                      stackIn_20_0 = stackIn_19_0;
                      stackIn_20_1 = stackIn_19_1;
                      stackIn_20_2 = 0;
                      break L6;
                    } else {
                      stackIn_20_0 = stackIn_19_0;
                      stackIn_20_1 = stackIn_19_1;
                      stackIn_20_2 = 1;
                      break L6;
                    }
                  }
                  L7: {






                    if (hc.field_u == 0) {



                      stackIn_23_3 = 0;
                      break L7;
                    } else {



                      stackIn_23_3 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    var9 = gd.a((byte) stackIn_20_0, stackIn_20_1 != 0, stackIn_20_2 != 0, stackIn_23_3 != 0);
                    var5 = var4 * wf.field_d.b(var9, 341);
                    wf.field_d.a(var9, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                    var3 = var3 + var5;
                    var3 = var3 + jk.field_x.a(true);
                    stackIn_25_0 = 0;

                    if (-1 == (hc.field_u ^ -1)) {
                      stackIn_26_0 = stackIn_25_0;
                      stackIn_26_1 = 0;
                      break L8;
                    } else {
                      stackIn_26_0 = stackIn_25_0;
                      stackIn_26_1 = 1;
                      break L8;
                    }
                  }
                  L9: {




                    stackIn_28_2 = -106;

                    if (-1 == (pf.field_g ^ -1)) {


                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = 0;
                      break L9;
                    } else {


                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = 1;
                      break L9;
                    }
                  }
                  var10 = we.a(stackIn_26_0 != 0, stackIn_26_1 != 0, stackIn_29_2, stackIn_29_3 != 0);
                  var5 = wf.field_d.b(var10, 341) * var4;
                  wf.field_d.a(var10, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L0;
                }
              }
            }
            this.a(false, -2, param1);
            if (var7 == 0) {
              break L0;
            } else {
              this.e(param1, -92);
              break L0;
            }
          } else {
            this.e(param1, -92);
            break L0;
          }
        }
        if (param0 != 20104) {
          return;
        } else {
          var3 = 0;
          L10: while (true) {
            L11: {
              if (this.field_j.field_a <= var3) {
                break L11;
              } else {
                if (var7 != 0) {
                  break L11;
                } else {
                  L12: {
                    if (!this.a(var3, false)) {
                      break L12;
                    } else {
                      L13: {
                        stackIn_40_0 = this;

                        if (var3 != this.field_j.field_d) {
                          stackIn_41_0 = this;
                          stackIn_41_1 = 0;
                          break L13;
                        } else {
                          stackIn_41_0 = this;
                          stackIn_41_1 = 1;
                          break L13;
                        }
                      }
                      this.a(stackIn_41_1 != 0, -118, param1, var3);
                      break L12;
                    }
                  }
                  var3++;
                  if (var7 == 0) {
                    continue L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void b(byte param0) {
        int statePc = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    if (2 != this.field_i) {
                        statePc = 32;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (qj.b((byte) 114)) {
                        statePc = 32;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_j.b((byte) 117)) {
                        statePc = 30;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-97 == (ch.field_d ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_j.field_f = false;
                    if ((this.field_j.field_d ^ -1) < -1) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_j.field_d = 2;
                    if (var3 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_j.field_d != 3) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_j.field_d = this.field_j.field_d - 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (-98 != (ch.field_d ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (2 <= this.field_j.field_d) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_j.field_d = this.field_j.field_d + 1;
                    if (var3 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-3 != (this.field_j.field_d ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_j.field_d = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    this.field_j.field_f = false;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (ch.field_d != 99) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_j.field_f = false;
                    if (0 > this.field_j.field_d) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_j.field_d > 2) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_j.field_d = 3;
                    if (var3 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_j.field_d = ck.field_y;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (98 != ch.field_d) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_j.field_f = false;
                    if (this.field_j.field_d != 3) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_j.field_d = ck.field_y;
                    if (var3 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_j.field_d = 3;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.field_j.a(false);
                    return;
                }
                case 30: {
                    this.field_j.a(false);
                    return;
                }
                case 32: {
                    if (-4 == (this.field_i ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_j.b(false);
                    if ((ch.field_d ^ -1) != -97) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (this.a(this.field_j.field_d, false)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_j.b(false);
                    if (var3 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                case 38: {
                    if ((ch.field_d ^ -1) == -98) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                case 40: {
                    if (this.a(this.field_j.field_d, false)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_j.b(false);
                    if (var3 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 44: {
                    this.field_j.d((byte) -6);
                    if (-99 == (ch.field_d ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (-100 == (ch.field_d ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (this.a(this.field_j.field_d, false)) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_j.d((byte) -6);
                    if (var3 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var3 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (param0 == -120) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_i = 51;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vg(int param0) {
        this.field_c = -1;
        this.field_d = -1;
        this.field_e = -1;
        this.field_i = param0;
        this.field_j = new al(fd.field_h[param0].length);
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_3_0 = false;
        int stackIn_12_0 = 0;
        boolean stackOut_2_0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (fd.field_h[this.field_i].length <= var4) {
                break L2;
              } else {
                var5 = this.f(var4, 206);
                stackOut_2_0 = this.a(var4, false);
                stackIn_12_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_3_0) {
                      break L3;
                    } else {
                      if (param0 < this.a(var4, (byte) 123)) {
                        break L3;
                      } else {
                        if (param0 >= this.a(var4, 180)) {
                          break L3;
                        } else {
                          if (var5 > param2) {
                            break L3;
                          } else {
                            if (var5 + this.b(param1 ^ 1476, var4) > param2) {
                              return var4;
                            } else {
                              break L3;
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
                    break L2;
                  }
                }
              }
            }
            stackIn_12_0 = param1;
            break L1;
          }
          if (stackIn_12_0 != 1448) {
            return 99;
          } else {
            return -1;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_15_0;
        boolean stackOut_23_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= param5) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (1 + param5 >= param1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (5 + param5 >= param1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param4 == param6) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7_int = -1 + param1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = var7_int ^ -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 >= (param5 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = param5;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 >= var7_int) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = lk.field_d[var8];
                        var10 = lk.field_d[1 + var8];
                        stackOut_15_0 = h.a(var9, var10, -7079, param3);
                        stackIn_12_0 = stackOut_15_0 ? 1 : 0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var14 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!stackIn_16_0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        lk.field_d[var8] = var10;
                        lk.field_d[1 + var8] = var9;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var7_int = (param6 >> -1136079583) + ((param4 >> -755486367) - -(1 & (param4 & param6)));
                        var8 = param5;
                        var9 = param6;
                        var10 = param4;
                        var11 = param5;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var11 >= param1) {
                            statePc = 34;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = lk.field_d[var11];
                        stackOut_23_0 = param3;
                        stackIn_35_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var14 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = tb.field_d[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = dk.field_k[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = stackIn_27_0;
                        if (var13 > var7_int) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var13 <= var10) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = var13;
                        if (var14 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        lk.field_d[var11] = lk.field_d[var8];
                        if (var9 <= var13) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        incrementValue$0 = var8;
                        var8++;
                        lk.field_d[incrementValue$0] = var12;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        vg.a(param0, var8, true, param3, var9, param5, param6);
                        stackIn_35_0 = param0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        vg.a(stackIn_35_0, param1, param2, param3, param4, var8, var10);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var7), "vg.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_44_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var10;
        mi var11;
        ti var12_ref_ti;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        L0: {
          var16 = Transmogrify.field_A ? 1 : 0;
          var5 = param2 + this.f(param3, 206);
          var6 = this.a(param3, (byte) 123);
          var7 = this.a(param3, 180);
          var8 = fd.field_h[this.field_i][param3];
          var9 = de.field_c[var8];
          if (mg.field_d) {
            L1: {
              if (1 != var8) {
                break L1;
              } else {
                var9 = re.field_m;
                break L1;
              }
            }
            if (var8 != 7) {
              break L0;
            } else {
              var9 = ca.field_a;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (var9 == null) {
            var9 = "ERROR: missing text";
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0) {
            stackIn_12_0 = 0;
            break L3;
          } else {
            stackIn_12_0 = 119;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param1 <= -116) {
          L4: {
            L5: {
              var11 = wf.field_d;
              if ((var8 ^ -1) == -13) {
                break L5;
              } else {
                if ((var8 ^ -1) == -14) {
                  break L5;
                } else {
                  L6: {
                    if (-18 != (var8 ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        L8: {
                          var12_ref_ti = we.field_l[am.field_n].field_a;
                          var13 = var11.a(var9);
                          var14 = 36 + var13;
                          var15 = var6 - -var7 + -var14 >> 53219777;
                          var12_ref_ti.c(var13 + (var15 - -((36 + -var12_ref_ti.field_n) / 2)), -24 + var5 + (var11.field_C + -1) + (-var12_ref_ti.field_m + 24) / 2);
                          if (!param0) {
                            break L8;
                          } else {
                            le.field_A.b(var9, var15, var11.field_y + var5, var10, -1);
                            if (var16 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var11.b(var9, var15, var11.field_y + var5, var10, -1);
                        break L7;
                      }
                      if (var16 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (!ci.field_g[this.field_i]) {
                      break L9;
                    } else {
                      L10: {
                        var12 = 16710412;
                        if ((var8 ^ -1) > -9) {
                          break L10;
                        } else {
                          if ((var8 ^ -1) < -11) {
                            break L10;
                          } else {
                            if (param3 == ck.field_y) {
                              var12 = 9240408;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      L11: {
                        if (!param0) {
                          break L11;
                        } else {
                          var12 = 16776867;
                          break L11;
                        }
                      }
                      pa.a(var5, var9, 39935, var12, -var6 + var7, var12, var6, -10, 39935);
                      if (var16 == 0) {
                        break L4;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L12: {
                    if (!param0) {
                      break L12;
                    } else {
                      le.field_A.c(var9, var6 + var7 >> 1649790593, var5 + var11.field_y, var10, -1);
                      if (var16 == 0) {
                        break L4;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var11.c(var9, var7 + var6 >> 1908823713, var11.field_y + var5, var10, -1);
                  if (var16 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L13: {
              if (0 == (this.field_c ^ -1)) {
                L14: {
                  var12 = var11.a(de.field_c[12]);
                  var13 = var11.a(de.field_c[13]);
                  if (var13 <= var12) {
                    break L14;
                  } else {
                    var12 = var13;
                    break L14;
                  }
                }
                this.field_c = var6 + var7 - (-var12 + 81) >> 1021307777;
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              sb.d(this.field_c, fd.field_b[this.field_i] / 2 + var5 - 1, 81, 2, var10);
              if (var8 != 12) {
                stackIn_44_0 = (lb.field_a << -101618136) / 128;
                break L15;
              } else {
                stackIn_44_0 = kc.field_g;
                break L15;
              }
            }
            L16: {
              var12 = stackIn_44_0;
              var12 = 80 * var12 / 256;
              sb.d(var12 + (this.field_c + -1), 3 + var5, 3, -6 + fd.field_b[this.field_i], var10);
              if (param0) {
                break L16;
              } else {
                var11.a(var9, this.field_c, var5 + var11.field_y, var10, -1);
                if (var16 == 0) {
                  break L4;
                } else {
                  break L16;
                }
              }
            }
            le.field_A.a(var9, this.field_c, var5 - -var11.field_y, var10, -1);
            break L4;
          }
          return;
        } else {
          return;
        }
    }

    static {
        field_g = "Members";
        field_a = "Waiting for graphics";
        field_b = null;
    }
}
