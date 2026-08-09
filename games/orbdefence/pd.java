/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ca {
    int field_z;
    private int field_A;
    int field_B;
    private int field_g;
    int field_f;
    int field_h;
    double field_v;
    static li field_w;
    private int field_j;
    private int field_x;
    int field_l;
    int field_y;
    int field_m;
    static int field_C;
    int field_i;
    int field_o;
    private int field_k;
    static ki field_r;
    int field_E;
    private int field_q;
    int field_t;
    int field_u;
    private f field_s;
    kb field_p;
    boolean field_n;

    public static void a(byte param0) {
        field_r = null;
        field_w = null;
        if (param0 != -19) {
            pd.a((byte) -62);
        }
    }

    final void a(int param0, byte param1, int param2) {
        int stackIn_17_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_68_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var13_ref_hj = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        hj var28 = null;
        hj var29 = null;
        hj var30 = null;
        hj var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = OrbDefence.field_D ? 1 : 0;
                    var4 = 320 + -param0 + ol.field_e * this.field_u;
                    var5 = 240 + (-param2 + this.field_z * ol.field_e);
                    this.field_v = 320.0 / (double)(Math.abs(-320 + var4) - -320);
                    var6 = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
                    if (0 >= var6) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 != (this.field_k ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5 = var5 + ol.field_e * this.field_g / var6;
                    if (var27 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (1 == this.field_k) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_k ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (3 != this.field_k) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = var4 - ol.field_e * this.field_g / var6;
                    if (var27 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = var5 - ol.field_e * this.field_g / var6;
                    if (var27 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = var4 + this.field_g * ol.field_e / var6;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-1 <= (this.field_h ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!this.field_n) {
                        statePc = 11;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (12 != this.field_y) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ul.a(var4 << -1578338300, var5 << -403862332, 64, 255, ki.field_f);
                    return;
                }
                case 13: {
                    if (1 == this.field_y) {
                        statePc = 14;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (this.field_n) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = 700;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 1400;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var7 = stackIn_17_0;
                    if (3 != this.field_y) {
                        statePc = 18;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (2 == this.field_y) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7 += 200;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (5 == this.field_y) {
                        statePc = 22;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (4 != this.field_y) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 += 400;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (6 == this.field_y) {
                        statePc = 25;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (-8 != (this.field_y ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var7 += 200;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (this.field_y == 9) {
                        statePc = 28;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((this.field_y ^ -1) == -9) {
                        statePc = 29;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_y == 10) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var7 += 400;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (11 != this.field_y) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var7 += 100;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var8 = mg.a(this.field_y, (byte) -86);
                    var9 = wh.field_a[var8];
                    var10 = 12 * var8;
                    var11 = var10 + this.field_A / 2 % var9;
                    var5 = var5 - (-2 + ab.field_g[var10].field_k / 2 * var7 / 4096);
                    if (this.field_i <= 0) {
                        statePc = 42;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var28 = ab.field_g[var11].f();
                    var30 = var28;
                    var13 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var13 >= var30.field_v.length) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var30.field_v[var13] = ((vi.a(65280, var28.field_v[var13]) >> -968000856) + (vi.a(16711680, var28.field_v[var13]) >> 1390619376)) / 8 * 65793 + vi.a(255, var28.field_v[var13]) / 2 * 257;
                    var13++;
                    if (var27 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var27 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var30.a(var4, var5, 0, var7);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (var27 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-10 != (this.field_y ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-1 != (this.field_E ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (!this.field_n) {
                        statePc = 65;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var29 = ab.field_g[var11];
                    var31 = var29;
                    var13_ref_hj = new hj(var31.field_o, var31.field_k);
                    var16 = 0;
                    var22 = -(var13_ref_hj.field_o * var7 >> -804419475) + var4;
                    var15 = -var13_ref_hj.field_k >> -766118175;
                    var23 = -(var7 * var13_ref_hj.field_k >> -2061203059) + var5;
                    var24 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = var13_ref_hj.field_k;
                    stackIn_47_1 = var24;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 <= stackIn_47_1) {
                        statePc = 64;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var14 = -var13_ref_hj.field_o >> -1547001439;
                    stackIn_68_0 = 0;
                    stackIn_49_0 = stackIn_68_0;
                    if (var27 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var25 = stackIn_49_0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var25 >= var13_ref_hj.field_o) {
                        statePc = 63;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_47_0 = var29.field_v[var16] ^ -1;
                    stackIn_52_0 = stackIn_47_0;
                    stackIn_47_1 = -1;
                    stackIn_52_1 = stackIn_47_1;
                    if (var27 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 != stackIn_52_1) {
                        statePc = 54;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var17 = ((var25 - -var14) * var7 >> -1490416948) + var22;
                    var18 = var23 + (var7 * (var15 + var24) >> 1870302572);
                    if ((var17 ^ -1) > -1) {
                        statePc = 62;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (ul.field_f <= var17) {
                        statePc = 62;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (-1 < (var18 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (ul.field_l > var18) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var27 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var21 = (255 & var29.field_v[var16]) >> 1664585602;
                    var19 = (16711680 & var29.field_v[var16]) >> -86195566;
                    var20 = (65280 & var29.field_v[var16]) >> 1230889898;
                    var26 = ul.field_b[ul.field_f * var18 - -var17];
                    var21 = var21 + ((var26 & 255) >> 493112961);
                    var20 = var20 + (var26 >> 928694569 & 127);
                    var19 = var19 + (127 & var26 >> 1219781617);
                    var13_ref_hj.field_v[var16] = var21 + ((var19 << -1194711248) - -(var20 << 299403272));
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var16++;
                    var14++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var25++;
                    if (var27 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var15++;
                    var24++;
                    if (var27 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var13_ref_hj.a(var4, var5, 0, var7);
                    if (var27 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var12 = ab.field_g[var11].field_o * var7 >> 337673036;
                    var13 = var7 * ab.field_g[var11].field_k >> -1109665780;
                    ab.field_g[var11].d(-(var12 >> 482090337) + var4, -(var13 >> -1675148895) + var5, var12, var13, 100);
                    if (var27 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ab.field_g[var11].a(var4, var5, 0, var7);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = this.field_f ^ -1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 >= -1) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var12 = var7 * ab.field_g[var11].field_o >> -929737652;
                    var13 = ab.field_g[var11].field_k * var7 >> 2092728876;
                    var14 = this.field_s.field_i % 9000;
                    var15 = var4 - (var12 >> 622610337) + (this.field_u * this.field_u + var14) % var12;
                    var16 = -(var13 >> -321093343) - -var5 + (this.field_z * this.field_u + var14) % var13;
                    var17 = var14 * var14 % var12 - ((var12 >> -805721791) + -var4);
                    var18 = var5 + -(var13 >> 719545281) + var14 * var14 % var13;
                    ul.f(var15, var16, var17, var18, 16777215, 200);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (param1 > 73) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.a(68, (byte) 10, -119);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0) {
        int fieldTemp$0 = 0;
        L0: {
          fieldTemp$0 = this.field_q - 1;
          this.field_q = this.field_q - 1;
          if (-1 < (fieldTemp$0 ^ -1)) {
            this.field_q = 5;
            this.field_x = this.field_x + 1;
            if (2 < this.field_x) {
              this.field_x = this.field_x - 3;
              if (0 != (this.field_i & 1)) {
                break L0;
              } else {
                this.field_A = this.field_A + 1;
                if ((this.field_A ^ -1) >= -257) {
                  break L0;
                } else {
                  this.field_A = this.field_A - 256;
                  break L0;
                }
              }
            } else {
              if (0 != (this.field_i & 1)) {
                break L0;
              } else {
                this.field_A = this.field_A + 1;
                if ((this.field_A ^ -1) >= -257) {
                  break L0;
                } else {
                  this.field_A = this.field_A - 256;
                  break L0;
                }
              }
            }
          } else {
            if (0 != (this.field_i & 1)) {
              break L0;
            } else {
              this.field_A = this.field_A + 1;
              if ((this.field_A ^ -1) >= -257) {
                break L0;
              } else {
                this.field_A = this.field_A - 256;
                break L0;
              }
            }
          }
        }
        if (param0 != 2) {
          return;
        } else {
          L1: {
            if ((this.field_h ^ -1) < -1) {
              this.field_q = 5;
              this.field_x = 3;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_104_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = OrbDefence.field_D ? 1 : 0;
          if (0 < this.field_m) {
            break L0;
          } else {
            this.field_m = this.field_m - 1;
            if (var8 == 0) {
              L1: {
                if ((this.field_E ^ -1) < -1) {
                  this.field_E = this.field_E - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.field_i <= 0) {
                  break L2;
                } else {
                  L3: {
                    this.field_i = this.field_i - 1;
                    if (8 == this.field_y) {
                      break L3;
                    } else {
                      if (-8 != (this.field_y ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_i = 0;
                  break L2;
                }
              }
              L4: {
                if ((this.field_y ^ -1) == -7) {
                  if (null == this.field_p) {
                    break L4;
                  } else {
                    L5: {
                      this.field_s.field_h.a(param0 ^ -113, new me((double)this.field_p.field_g, (double)this.field_p.field_h, 0.04 * (-0.5 + Math.random()), 0.04 * (-0.5 + Math.random()), 1));
                      this.field_B = this.field_B + 1;
                      if (!this.field_n) {
                        break L5;
                      } else {
                        this.field_B = this.field_B + 1;
                        break L5;
                      }
                    }
                    L6: {
                      if ((this.field_B ^ -1) < -201) {
                        break L6;
                      } else {
                        if (!this.field_p.b(true)) {
                          this.field_p = null;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_B = 0;
                    this.field_p.d(9);
                    this.field_p = null;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                L8: {
                  this.d(param0 + param0);
                  var2 = this.field_g;
                  if (this.field_h > 0) {
                    break L8;
                  } else {
                    this.field_g = this.field_g - 1;
                    if (var8 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  this.field_o = this.field_o - (1 + this.field_h / 10);
                  if ((this.field_y ^ -1) == -10) {
                    this.field_E = 50;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  this.field_h = this.field_h - (1 + this.field_h / 10);
                  if (-1 <= (this.field_o ^ -1)) {
                    this.field_s.field_f.field_g[this.field_u - -(this.field_z * this.field_s.field_f.field_c)] = this.field_s.field_f.field_g[this.field_u - -(this.field_z * this.field_s.field_f.field_c)] + 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if ((1 & this.field_s.field_i) == 0) {
                  this.field_g = this.field_g - 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L11: {
                if (-1 == (this.field_i ^ -1)) {
                  this.field_g = this.field_g - 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if ((this.field_y ^ -1) == -13) {
                  break L12;
                } else {
                  if (this.field_s.field_f.field_e[this.field_t]) {
                    L13: {
                      if (this.field_f != 0) {
                        break L13;
                      } else {
                        ea.a(param0 ^ 11, mh.field_a[57], (int)(this.field_v * 96.0));
                        break L13;
                      }
                    }
                    gd.field_c = gd.field_c + 1;
                    this.field_f = 2;
                    this.field_s.field_f.field_m[this.field_t] = true;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L14: {
                if (0 >= this.field_f) {
                  break L14;
                } else {
                  L15: {
                    this.field_f = this.field_f - 1;
                    if (this.field_y != 9) {
                      break L15;
                    } else {
                      this.field_E = 100;
                      break L15;
                    }
                  }
                  this.field_g = var2;
                  break L14;
                }
              }
              L16: {
                if (he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]] >= this.field_g) {
                  break L16;
                } else {
                  this.field_g = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
                  break L16;
                }
              }
              L17: {
                if (0 > this.field_g) {
                  L18: {
                    L19: {
                      var3 = this.field_u;
                      var4 = this.field_z;
                      var5 = this.field_z * this.field_s.field_f.field_c + this.field_u;
                      if (this.field_y == 12) {
                        break L19;
                      } else {
                        this.field_s.field_f.field_m[var5] = false;
                        if (var8 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    this.field_j = 150;
                    break L18;
                  }
                  L20: {
                    var6 = this.field_s.field_f.field_l[var5] - -1000;
                    if (-4 == (this.field_k ^ -1)) {
                      break L20;
                    } else {
                      if (var5 <= 0) {
                        break L20;
                      } else {
                        if (this.field_s.field_f.field_l[-1 + var5] >= var6) {
                          break L20;
                        } else {
                          L21: {
                            if (this.field_s.field_f.field_m[-1 + var5]) {
                              stackIn_61_0 = 0;
                              break L21;
                            } else {
                              stackIn_61_0 = 1;
                              break L21;
                            }
                          }
                          if (stackIn_61_0 != 1) {
                            break L20;
                          } else {
                            var3 = -1 + this.field_u;
                            var4 = this.field_z;
                            var6 = this.field_s.field_f.field_l[var5 + -1];
                            break L20;
                          }
                        }
                      }
                    }
                  }
                  L22: {
                    if ((this.field_k ^ -1) == -3) {
                      break L22;
                    } else {
                      if (this.field_s.field_f.field_c >= var5) {
                        break L22;
                      } else {
                        if (this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5] >= var6) {
                          break L22;
                        } else {
                          L23: {
                            if (this.field_s.field_f.field_m[var5 - this.field_s.field_f.field_c]) {
                              stackIn_69_0 = 0;
                              break L23;
                            } else {
                              stackIn_69_0 = 1;
                              break L23;
                            }
                          }
                          if (stackIn_69_0 != 0) {
                            var4 = this.field_z - 1;
                            var6 = this.field_s.field_f.field_l[var5 + -this.field_s.field_f.field_c];
                            var3 = this.field_u;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    if (this.field_k == 1) {
                      break L24;
                    } else {
                      if (var5 >= this.field_s.field_f.field_i - 2) {
                        break L24;
                      } else {
                        if (this.field_s.field_f.field_l[1 + var5] >= var6) {
                          break L24;
                        } else {
                          if (!this.field_s.field_f.field_m[1 + var5]) {
                            var4 = this.field_z;
                            var3 = this.field_u - -1;
                            var6 = this.field_s.field_f.field_l[var5 + 1];
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  L25: {
                    if (-1 == (this.field_k ^ -1)) {
                      break L25;
                    } else {
                      if (var5 >= this.field_s.field_f.field_i - this.field_s.field_f.field_c + -1) {
                        break L25;
                      } else {
                        if (this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5] >= var6) {
                          break L25;
                        } else {
                          if (!this.field_s.field_f.field_m[var5 - -this.field_s.field_f.field_c]) {
                            var6 = this.field_s.field_f.field_l[var5 + this.field_s.field_f.field_c];
                            var4 = this.field_z + 1;
                            var3 = this.field_u;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  L26: {
                    if (var6 != this.field_s.field_f.field_l[var5] - -1000) {
                      break L26;
                    } else {
                      L27: {
                        var6 = this.field_s.field_f.field_l[var5];
                        if ((var5 ^ -1) >= -1) {
                          break L27;
                        } else {
                          if (var6 <= this.field_s.field_f.field_l[-1 + var5]) {
                            break L27;
                          } else {
                            if (!this.field_s.field_f.field_m[-1 + var5]) {
                              var6 = this.field_s.field_f.field_l[-1 + var5];
                              var3 = this.field_u + -1;
                              var4 = this.field_z;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      L28: {
                        if (this.field_s.field_f.field_c >= var5) {
                          break L28;
                        } else {
                          if (this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5] >= var6) {
                            break L28;
                          } else {
                            if (this.field_s.field_f.field_m[var5 + -this.field_s.field_f.field_c]) {
                              break L28;
                            } else {
                              var6 = this.field_s.field_f.field_l[var5 - this.field_s.field_f.field_c];
                              var4 = this.field_z + -1;
                              var3 = this.field_u;
                              break L28;
                            }
                          }
                        }
                      }
                      L29: {
                        if (var5 >= -2 + this.field_s.field_f.field_i) {
                          break L29;
                        } else {
                          if (var6 <= this.field_s.field_f.field_l[var5 + 1]) {
                            break L29;
                          } else {
                            if (!this.field_s.field_f.field_m[var5 - -1]) {
                              var4 = this.field_z;
                              var6 = this.field_s.field_f.field_l[var5 + 1];
                              var3 = this.field_u + 1;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      if (-1 + -this.field_s.field_f.field_c + this.field_s.field_f.field_i <= var5) {
                        break L26;
                      } else {
                        if (var6 <= this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5]) {
                          break L26;
                        } else {
                          L30: {
                            if (this.field_s.field_f.field_m[this.field_s.field_f.field_c + var5]) {
                              stackIn_104_0 = 0;
                              break L30;
                            } else {
                              stackIn_104_0 = 1;
                              break L30;
                            }
                          }
                          if (stackIn_104_0 == 1) {
                            var4 = 1 + this.field_z;
                            var3 = this.field_u;
                            var6 = this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5];
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  L31: {
                    L32: {
                      if (var6 > this.field_s.field_f.field_l[var5]) {
                        break L32;
                      } else {
                        this.field_j = this.field_j - 1;
                        if (var8 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    this.field_j = this.field_j + 10;
                    break L31;
                  }
                  L33: {
                    if ((this.field_j ^ -1) < -101) {
                      L34: {
                        if ((var5 ^ -1) >= -1) {
                          break L34;
                        } else {
                          if (var6 > this.field_s.field_f.field_l[var5 + -1]) {
                            var3 = -1 + this.field_u;
                            var6 = this.field_s.field_f.field_l[var5 - 1];
                            var4 = this.field_z;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (var5 <= this.field_s.field_f.field_c) {
                          break L35;
                        } else {
                          if (var6 > this.field_s.field_f.field_l[-this.field_s.field_f.field_c + var5]) {
                            var6 = this.field_s.field_f.field_l[var5 - this.field_s.field_f.field_c];
                            var3 = this.field_u;
                            var4 = this.field_z - 1;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L36: {
                        if (this.field_s.field_f.field_i + -2 <= var5) {
                          break L36;
                        } else {
                          if (var6 > this.field_s.field_f.field_l[1 + var5]) {
                            var3 = 1 + this.field_u;
                            var6 = this.field_s.field_f.field_l[var5 + 1];
                            var4 = this.field_z;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (var5 >= -this.field_s.field_f.field_c + (this.field_s.field_f.field_i - 1)) {
                        break L33;
                      } else {
                        if (var6 <= this.field_s.field_f.field_l[this.field_s.field_f.field_c + var5]) {
                          break L33;
                        } else {
                          var4 = this.field_z - -1;
                          var3 = this.field_u;
                          var6 = this.field_s.field_f.field_l[var5 + this.field_s.field_f.field_c];
                          break L33;
                        }
                      }
                    } else {
                      break L33;
                    }
                  }
                  L37: {
                    var7 = 0;
                    if (var4 < this.field_z) {
                      this.field_k = 0;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      if (this.field_u != var3) {
                        break L39;
                      } else {
                        if (var4 == this.field_z) {
                          break L38;
                        } else {
                          break L39;
                        }
                      }
                    }
                    var7 = 1;
                    break L38;
                  }
                  L40: {
                    if (this.field_u > var3) {
                      this.field_k = 1;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    if (this.field_z < var4) {
                      this.field_k = 2;
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                  L42: {
                    if (this.field_u < var3) {
                      this.field_k = 3;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    this.field_z = var4;
                    this.field_u = var3;
                    if (0 <= this.field_u) {
                      break L43;
                    } else {
                      this.field_u = this.field_u + this.field_s.field_f.field_c;
                      break L43;
                    }
                  }
                  L44: {
                    if (this.field_s.field_f.field_c > this.field_u) {
                      break L44;
                    } else {
                      this.field_u = this.field_u - this.field_s.field_f.field_c;
                      break L44;
                    }
                  }
                  L45: {
                    this.field_t = this.field_z * this.field_s.field_f.field_c + this.field_u;
                    if (this.field_y != 12) {
                      this.field_s.field_f.field_m[this.field_t] = true;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  L46: {
                    if (var7 != 0) {
                      break L46;
                    } else {
                      this.field_g = 0;
                      if (var8 == 0) {
                        break L17;
                      } else {
                        break L46;
                      }
                    }
                  }
                  this.field_g = he.field_u[this.field_y] + qh.field_c[this.field_s.field_f.field_o[this.field_t]];
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        this.field_m = this.field_m - 1;
    }

    pd(int param0, int param1, f param2, int param3, int param4) {
        try {
            this.field_z = param1;
            this.field_y = param3;
            this.field_g = 0;
            this.field_s = param2;
            this.field_u = param0;
            this.field_o = param4 * he.field_o[this.field_y] >> 1627641572;
            this.field_l = this.field_o;
            this.field_j = 0;
            this.field_B = 0;
            this.field_t = this.field_u - -(this.field_z * this.field_s.field_f.field_c);
            this.field_n = false;
            this.field_p = null;
            this.field_h = 0;
            this.field_A = (int)(256.0 * Math.random());
            this.field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_C = 0;
        field_w = new li();
    }
}
