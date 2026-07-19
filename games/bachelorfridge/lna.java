/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lna {
    int field_b;
    private int field_d;
    private int field_B;
    private int field_t;
    private int field_g;
    boolean field_i;
    private int field_k;
    int field_s;
    private kv[] field_D;
    private int field_p;
    static sna field_C;
    private int field_m;
    private kv field_a;
    static String field_h;
    static boolean field_q;
    private int field_c;
    private int field_z;
    private boolean field_o;
    private int field_n;
    bba field_u;
    private kja[] field_j;
    boolean field_x;
    private int field_w;
    boolean field_v;
    private int field_e;
    private int[] field_l;
    boolean field_A;
    static boolean field_f;
    static String[][] field_y;
    private int field_r;

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nla var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = BachelorFridge.field_y;
        bd.field_i.b();
        dg.d();
        var12 = this.field_u.a(-113);
        var13 = 0;
        L0: while (true) {
          if (6 <= var13) {
            var14 = 32 / ((-77 - param5) / 45);
            hga.field_U.a((byte) 123);
            this.a(param2, param0, param3, (byte) 121, param4, param1, 0);
            return;
          } else {
            if ((cma.field_v[var13] ^ -1) != -12) {
              L1: {
                L2: {
                  L3: {
                    var10 = -this.field_D[vt.field_l[var13]].field_o + this.field_D[vt.field_l[var13]].field_p + var12.field_g[vt.field_l[var13]].field_l + (this.field_j[vt.field_l[var13]].field_b + (var12.field_g[vt.field_l[var13]].field_e >> 1956247681));
                    var7 = (int)((double)var12.field_g[vt.field_l[var13]].field_d * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_n));
                    var11 = 0;
                    var9 = (var12.field_g[vt.field_l[var13]].field_d >> -1908188031) + (var12.field_g[vt.field_l[var13]].field_h + this.field_j[vt.field_l[var13]].field_a + (-this.field_D[vt.field_l[var13]].field_n - -this.field_D[vt.field_l[var13]].field_q));
                    var8 = (int)((double)var12.field_g[vt.field_l[var13]].field_e * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_o));
                    if (this.field_l[8] != 0) {
                      break L3;
                    } else {
                      if (0 == this.field_l[1]) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (this.field_l[8] != 20) {
                      break L4;
                    } else {
                      if (-21 == (this.field_l[1] ^ -1)) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if ((this.field_l[8] ^ -1) != -6) {
                    break L1;
                  } else {
                    if (this.field_l[1] == 5) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var11 = var12.field_g[vt.field_l[var13]].field_j;
                break L1;
              }
              L5: {
                if (vt.field_l[var13] == 1) {
                  break L5;
                } else {
                  if ((vt.field_l[var13] ^ -1) == -3) {
                    break L5;
                  } else {
                    var11 = var12.field_g[vt.field_l[var13]].field_j;
                    break L5;
                  }
                }
              }
              L6: {
                if (1 == vt.field_l[var13]) {
                  break L6;
                } else {
                  if ((vt.field_l[var13] ^ -1) == -3) {
                    break L6;
                  } else {
                    if (3 != vt.field_l[var13]) {
                      gna.a(var7, -101, var9 << -1984650044, this.field_D[vt.field_l[var13]].field_o << -461709693, this.field_D[vt.field_l[var13]].field_n << -1794524957, var10 << 310173636, this.field_D[vt.field_l[var13]], var11, var8);
                      var13++;
                      continue L0;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              vg.a(this.field_D[vt.field_l[var13]], var9 << -2034366460, 22997, var11, var7, var10 << 357309284, var8, this.field_D[vt.field_l[var13]].field_o << 1444960419, this.field_D[vt.field_l[var13]].field_n << 236508963);
              var13++;
              continue L0;
            } else {
              L7: {
                L8: {
                  L9: {
                    var8 = (int)((double)var12.field_g[8].field_e * (4096.0 / (double)this.field_D[vt.field_l[var13]].field_o));
                    var7 = (int)(4096.0 / (double)this.field_D[vt.field_l[var13]].field_n * (double)var12.field_g[8].field_d);
                    var8 += 256;
                    var11 = 0;
                    var9 = this.field_D[8].field_q - this.field_D[8].field_n + var12.field_g[8].field_h + (this.field_j[8].field_a + (var12.field_g[8].field_d >> -1327314719));
                    var10 = this.field_D[8].field_p + (-this.field_D[8].field_o + (var12.field_g[8].field_e >> 2139753697) + (this.field_j[8].field_b + var12.field_g[8].field_l));
                    var7 += 256;
                    if (this.field_l[8] != 0) {
                      break L9;
                    } else {
                      if (-1 == (this.field_l[1] ^ -1)) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-21 != (this.field_l[8] ^ -1)) {
                      break L10;
                    } else {
                      if (20 == this.field_l[1]) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if ((this.field_l[8] ^ -1) != -6) {
                    break L7;
                  } else {
                    if (this.field_l[1] != 5) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var11 = var12.field_g[8].field_j;
                break L7;
              }
              L11: {
                if (-2 == (cma.field_v[var13] ^ -1)) {
                  break L11;
                } else {
                  if ((cma.field_v[var13] ^ -1) != -3) {
                    var11 = var12.field_g[8].field_j;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              gna.a(var7, -114, var9 << -1919252252, this.field_D[8].field_o << 160450403, this.field_D[8].field_n << -2119897565, var10 << -996779164, this.field_D[vt.field_l[var13]], var11, var8);
              var13++;
              continue L0;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param4 == -1) {
            this.field_u = null;
            return;
        }
        this.field_u = new bba(aca.a((byte) -100, param1, param4), param0);
        this.field_u.field_c = param2;
        if (!param3) {
            this.field_l = (int[]) null;
        }
        if (0 == param4) {
            this.field_u.field_d = this.field_u.field_d + kla.a(100, m.field_a, -2147483648);
        }
    }

    final void a(int param0) {
        if (this.field_A) {
            return;
        }
        this.field_D = wj.a(-863, this.field_l);
        kv[] discarded$0 = ek.a((byte) -25, this.field_l);
        this.field_A = true;
        if (param0 != 8) {
            this.a(-65);
        }
    }

    final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (param7 > dg.field_h) {
            break L0;
          } else {
            if (param8 > dg.field_k) {
              break L0;
            } else {
              if (dg.field_f > bd.field_i.field_q + param7) {
                break L0;
              } else {
                if (param8 + bd.field_i.field_p < dg.field_j) {
                  break L0;
                } else {
                  param4 = param4 & 65535;
                  if (null != this.field_u) {
                    L1: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (!param0) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L1;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L1;
                      }
                    }
                    L2: {
                      ((lna) (this)).field_x = stackIn_11_1 != 0;
                      this.b(9);
                      hga.field_U.a((byte) -105);
                      if (!this.field_x) {
                        break L2;
                      } else {
                        bd.field_i.e();
                        break L2;
                      }
                    }
                    L3: {
                      this.a(param4, param3, param2, (byte) 110, param1, param6, param8, param7);
                      if (param5 < -8) {
                        break L3;
                      } else {
                        this.field_g = 117;
                        break L3;
                      }
                    }
                    return;
                  } else {
                    this.a(param4, param2, param3, 0, param7, param6, param8, param1, param0);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        if (!this.field_o) {
          L0: {
            this.field_a = new kv(160, 140);
            if (param3 == 8) {
              break L0;
            } else {
              this.b((byte) -93);
              break L0;
            }
          }
          this.field_a.b();
          dg.d();
          var12 = 0;
          L1: while (true) {
            if (var12 >= 6) {
              hga.field_U.a((byte) -8);
              this.field_o = true;
              this.a(param1, param4, 0, param2, param3 ^ 16624, param5, param0);
              return;
            } else {
              if (11 == cma.field_v[var12]) {
                var8 = (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_p) * this.field_j[vt.field_l[var12]].field_d;
                var7 = this.field_j[vt.field_l[var12]].field_c * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_q);
                var7 += 128;
                var8 += 128;
                var10 = this.field_j[8].field_b + (this.field_D[8].field_o >> -1439436159) - (this.field_D[8].field_o + -this.field_D[8].field_p);
                var9 = -this.field_D[8].field_n + this.field_D[8].field_q + ((this.field_D[8].field_n >> -203395039) + this.field_j[8].field_a);
                var10 -= 20;
                var11 = 0;
                gna.a(var7, -117, var9 << 50392708, this.field_D[8].field_o << -1054738237, this.field_D[8].field_n << -1484634941, var10 << 1322470148, this.field_D[vt.field_l[var12]], var11, var8);
                var12++;
                continue L1;
              } else {
                L2: {
                  var9 = (this.field_D[vt.field_l[var12]].field_n >> 1441673921) + (this.field_j[vt.field_l[var12]].field_a + -this.field_D[vt.field_l[var12]].field_n) - -this.field_D[vt.field_l[var12]].field_q;
                  var7 = this.field_j[vt.field_l[var12]].field_c * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_q);
                  var8 = this.field_j[vt.field_l[var12]].field_d * (int)(4096.0 / (double)this.field_D[vt.field_l[var12]].field_p);
                  var10 = (this.field_D[vt.field_l[var12]].field_o >> -1049497343) + this.field_j[vt.field_l[var12]].field_b + -this.field_D[vt.field_l[var12]].field_o - -this.field_D[vt.field_l[var12]].field_p;
                  var11 = 0;
                  var10 -= 20;
                  if (-2 == (vt.field_l[var12] ^ -1)) {
                    break L2;
                  } else {
                    if ((vt.field_l[var12] ^ -1) == -3) {
                      break L2;
                    } else {
                      if ((vt.field_l[var12] ^ -1) != -4) {
                        gna.a(var7, param3 ^ -107, var9 << -2095071900, this.field_D[vt.field_l[var12]].field_o << -1192129597, this.field_D[vt.field_l[var12]].field_n << -639338333, var10 << 1064685924, this.field_D[vt.field_l[var12]], var11, var8);
                        var12++;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                vg.a(this.field_D[vt.field_l[var12]], var9 << -2085831644, param3 ^ 23005, var11, var7, var10 << -1784996060, var8, this.field_D[vt.field_l[var12]].field_o << 492079811, this.field_D[vt.field_l[var12]].field_n << -725534909);
                var12++;
                continue L1;
              }
            }
          }
        } else {
          this.a(param1, param4, 0, param2, 16632, param5, param0);
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        this.field_j = new kja[14];
        var2 = 0;
        L0: while (true) {
          if (-15 >= (var2 ^ -1)) {
            this.field_j[6].field_c = this.field_D[6].field_q;
            this.field_j[6].field_d = this.field_D[6].field_p;
            this.field_j[6].field_a = 200;
            this.field_j[6].field_b = 290;
            this.field_j[10].field_d = this.field_D[10].field_p;
            this.field_j[10].field_c = this.field_D[10].field_q;
            this.field_j[10].field_b = this.field_e + (190 - -this.field_k);
            this.field_j[10].field_a = this.field_g + (this.field_w + 230);
            this.field_j[13].field_a = this.field_g + this.field_w + 230;
            this.field_j[13].field_c = this.field_D[13].field_q;
            this.field_j[13].field_d = this.field_D[13].field_p;
            this.field_j[13].field_b = this.field_k + (190 + this.field_e);
            this.field_j[9].field_a = this.field_g + 230;
            this.field_j[9].field_d = this.field_D[9].field_p;
            this.field_j[9].field_b = 190 + this.field_e;
            this.field_j[9].field_c = this.field_D[9].field_q;
            this.field_j[12].field_d = this.field_D[12].field_p;
            this.field_j[12].field_a = this.field_g + 230;
            this.field_j[12].field_b = this.field_e + 190;
            this.field_j[12].field_c = this.field_D[12].field_q;
            this.field_j[8].field_b = 190;
            this.field_j[8].field_a = 230;
            this.field_j[8].field_c = this.field_D[8].field_q;
            this.field_j[8].field_d = this.field_D[8].field_p;
            this.field_j[11].field_b = 190;
            this.field_j[11].field_c = this.field_D[11].field_q;
            this.field_j[11].field_d = this.field_D[11].field_p;
            this.field_j[11].field_a = 230;
            this.field_j[7].field_c = this.field_D[7].field_q;
            this.field_j[7].field_d = this.field_D[7].field_p;
            this.field_j[7].field_a = 260;
            this.field_j[7].field_b = 297;
            this.field_j[3].field_c = this.field_D[3].field_q;
            this.field_j[3].field_d = this.field_D[3].field_p;
            this.field_j[3].field_a = 230 + this.field_r;
            this.field_j[3].field_b = this.field_d + 190;
            this.field_j[5].field_d = this.field_D[5].field_p;
            this.field_j[5].field_a = 200;
            this.field_j[5].field_c = this.field_D[5].field_q;
            this.field_j[5].field_b = 235;
            this.field_j[4].field_a = 275;
            this.field_j[4].field_c = this.field_D[4].field_q;
            this.field_j[4].field_d = this.field_D[4].field_p;
            this.field_j[4].field_b = 235;
            this.field_j[1].field_c = this.field_D[1].field_q;
            this.field_j[1].field_a = this.field_c + 230;
            this.field_j[1].field_b = this.field_p + 190;
            this.field_j[1].field_d = this.field_D[1].field_p;
            this.field_j[2].field_b = 190 + this.field_z;
            this.field_j[2].field_c = this.field_D[2].field_q;
            this.field_j[2].field_d = this.field_D[2].field_p;
            var2 = -16 % ((param0 - -3) / 53);
            this.field_j[2].field_a = this.field_B + 230;
            this.field_j[0].field_d = this.field_D[0].field_p;
            this.field_j[0].field_b = this.field_n + 190;
            this.field_j[0].field_a = 230 - -this.field_m;
            this.field_j[0].field_c = this.field_D[0].field_q;
            var3 = 0;
            L1: while (true) {
              if (14 <= var3) {
                return;
              } else {
                this.field_j[var3].field_a = this.field_j[var3].field_a - (this.field_D[var3].field_q >> 1022420193);
                this.field_j[var3].field_a = this.field_j[var3].field_a - 116;
                this.field_j[var3].field_b = this.field_j[var3].field_b - (this.field_D[var3].field_p >> 1705737793);
                this.field_j[var3].field_b = this.field_j[var3].field_b - 50;
                var3++;
                continue L1;
              }
            }
          } else {
            this.field_j[var2] = new kja();
            var2++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = param2 * bd.field_i.field_n / 4096;
        int var9 = bd.field_i.field_o * param5 / 4096;
        int var10 = 42 * param2 / 4096;
        int var11 = param5 / 4096;
        if (!(!this.field_i)) {
            bd.field_i.b(var10 + param0, var11 + param1, var8, var9, 7837199);
            param4 = 192;
        }
        int var12 = 26 % ((param3 - 35) / 56);
        if (this.field_v) {
            bd.field_i.b(var10 + param0, var11 + param1, var8, var9, 16736256);
            param4 = 192;
        }
        if (-257 < (param4 ^ -1)) {
            bd.field_i.c(var10 + param0, param1 - -var11, var8, var9, param4);
        } else {
            bd.field_i.c(param0 + var10, var11 + param1, var8, var9);
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nla var10 = null;
        var9 = BachelorFridge.field_y;
        bd.field_i.b();
        dg.d();
        var10 = this.field_u.a(param0 ^ -125);
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        if (param0 == 9) {
          var7 = 0;
          var8 = 0;
          L0: while (true) {
            if (-15 >= (var8 ^ -1)) {
              return;
            } else {
              if (cma.field_v[var8] != 13) {
                if (12 == cma.field_v[var8]) {
                  L1: {
                    L2: {
                      L3: {
                        var4 = (int)((double)var10.field_g[9].field_e * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_o));
                        var3 = (int)((double)var10.field_g[9].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
                        var6 = (var10.field_g[9].field_e >> 1165564129) + (this.field_j[9].field_b - (-var10.field_g[9].field_l - -this.field_D[9].field_o)) + this.field_D[9].field_p;
                        var5 = -this.field_D[9].field_n + (this.field_D[9].field_q + ((var10.field_g[9].field_d >> 584566433) + this.field_j[9].field_a)) - -var10.field_g[9].field_h;
                        var3 += 256;
                        var7 = 0;
                        var4 += 256;
                        if (0 != this.field_l[8]) {
                          break L3;
                        } else {
                          if (0 == this.field_l[1]) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (-21 != (this.field_l[8] ^ -1)) {
                          break L4;
                        } else {
                          if (-21 == (this.field_l[1] ^ -1)) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (-6 != (this.field_l[8] ^ -1)) {
                        break L1;
                      } else {
                        if (-6 == (this.field_l[1] ^ -1)) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    var7 = var10.field_g[9].field_j;
                    break L1;
                  }
                  L5: {
                    if (cma.field_v[var8] == 1) {
                      break L5;
                    } else {
                      if (2 == cma.field_v[var8]) {
                        break L5;
                      } else {
                        var7 = var10.field_g[9].field_j;
                        break L5;
                      }
                    }
                  }
                  gna.a(var3, -108, var5 << 811641636, this.field_D[9].field_o << 1303928803, this.field_D[9].field_n << -1612239261, var6 << -591803484, this.field_D[cma.field_v[var8]], var7, var4);
                  var8++;
                  continue L0;
                } else {
                  if (cma.field_v[var8] != 11) {
                    L6: {
                      L7: {
                        L8: {
                          var4 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_o * (double)var10.field_g[cma.field_v[var8]].field_e);
                          var3 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_n * (double)var10.field_g[cma.field_v[var8]].field_d);
                          var5 = this.field_D[cma.field_v[var8]].field_q - this.field_D[cma.field_v[var8]].field_n + this.field_j[cma.field_v[var8]].field_a - (-var10.field_g[cma.field_v[var8]].field_h - (var10.field_g[cma.field_v[var8]].field_d >> 1944846049));
                          var7 = 0;
                          var6 = (var10.field_g[cma.field_v[var8]].field_e >> 1354903425) + (var10.field_g[cma.field_v[var8]].field_l + this.field_j[cma.field_v[var8]].field_b + -this.field_D[cma.field_v[var8]].field_o - -this.field_D[cma.field_v[var8]].field_p);
                          if (this.field_l[8] != 0) {
                            break L8;
                          } else {
                            if (this.field_l[1] == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (20 != this.field_l[8]) {
                            break L9;
                          } else {
                            if (-21 == (this.field_l[1] ^ -1)) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (5 != this.field_l[8]) {
                          break L6;
                        } else {
                          if ((this.field_l[1] ^ -1) == -6) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7 = var10.field_g[cma.field_v[var8]].field_j;
                      break L6;
                    }
                    L10: {
                      if (cma.field_v[var8] == 1) {
                        break L10;
                      } else {
                        if (cma.field_v[var8] == 2) {
                          break L10;
                        } else {
                          var7 = var10.field_g[cma.field_v[var8]].field_j;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (cma.field_v[var8] == 1) {
                        break L11;
                      } else {
                        if (2 == cma.field_v[var8]) {
                          break L11;
                        } else {
                          if (cma.field_v[var8] == 3) {
                            break L11;
                          } else {
                            gna.a(var3, param0 + -103, var5 << -1558990556, this.field_D[cma.field_v[var8]].field_o << -823616957, this.field_D[cma.field_v[var8]].field_n << 1560855267, var6 << -1859441468, this.field_D[cma.field_v[var8]], var7, var4);
                            var8++;
                            continue L0;
                          }
                        }
                      }
                    }
                    vg.a(this.field_D[cma.field_v[var8]], var5 << 82017508, param0 + 22988, var7, var3, var6 << -1350433692, var4, this.field_D[cma.field_v[var8]].field_o << -1976633725, this.field_D[cma.field_v[var8]].field_n << 1460991683);
                    var8++;
                    continue L0;
                  } else {
                    L12: {
                      L13: {
                        L14: {
                          var3 = (int)((double)var10.field_g[8].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
                          var4 = (int)((double)var10.field_g[8].field_e * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_o));
                          var7 = 0;
                          var3 += 256;
                          var6 = var10.field_g[8].field_l + (this.field_j[8].field_b + ((var10.field_g[8].field_e >> 1148577825) + (-this.field_D[8].field_o - -this.field_D[8].field_p)));
                          var4 += 256;
                          var5 = (var10.field_g[8].field_d >> -1251842527) + (this.field_j[8].field_a - (-var10.field_g[8].field_h - (-this.field_D[8].field_n + this.field_D[8].field_q)));
                          if (this.field_l[8] != 0) {
                            break L14;
                          } else {
                            if (this.field_l[1] == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (this.field_l[8] != 20) {
                            break L15;
                          } else {
                            if ((this.field_l[1] ^ -1) == -21) {
                              break L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (-6 != (this.field_l[8] ^ -1)) {
                          break L12;
                        } else {
                          if ((this.field_l[1] ^ -1) == -6) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7 = var10.field_g[8].field_j;
                      break L12;
                    }
                    L16: {
                      if ((cma.field_v[var8] ^ -1) == -2) {
                        break L16;
                      } else {
                        if (-3 == (cma.field_v[var8] ^ -1)) {
                          break L16;
                        } else {
                          var7 = var10.field_g[8].field_j;
                          break L16;
                        }
                      }
                    }
                    gna.a(var3, -101, var5 << -69808892, this.field_D[8].field_o << 765892963, this.field_D[8].field_n << 1220782883, var6 << -869217116, this.field_D[cma.field_v[var8]], var7, var4);
                    var8++;
                    continue L0;
                  }
                }
              } else {
                L17: {
                  L18: {
                    L19: {
                      var3 = (int)((double)var10.field_g[10].field_d * (4096.0 / (double)this.field_D[cma.field_v[var8]].field_n));
                      var4 = (int)(4096.0 / (double)this.field_D[cma.field_v[var8]].field_o * (double)var10.field_g[10].field_e);
                      var4 += 256;
                      var3 += 256;
                      var5 = (var10.field_g[10].field_d >> -2017376575) + (var10.field_g[10].field_h + (this.field_j[10].field_a + (-this.field_D[10].field_n + this.field_D[10].field_q)));
                      var7 = 0;
                      var6 = var10.field_g[10].field_l + (this.field_j[10].field_b + (var10.field_g[10].field_e >> -1083722143)) + (-this.field_D[10].field_o + this.field_D[10].field_p);
                      if (this.field_l[8] != 0) {
                        break L19;
                      } else {
                        if (-1 == (this.field_l[1] ^ -1)) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (20 != this.field_l[8]) {
                        break L20;
                      } else {
                        if (-21 == (this.field_l[1] ^ -1)) {
                          break L18;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (5 != this.field_l[8]) {
                      break L17;
                    } else {
                      if (5 == this.field_l[1]) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var7 = var10.field_g[10].field_j;
                  break L17;
                }
                L21: {
                  if (cma.field_v[var8] == 1) {
                    break L21;
                  } else {
                    if (-3 != (cma.field_v[var8] ^ -1)) {
                      var7 = var10.field_g[10].field_j;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                gna.a(var3, -97, var5 << 702083844, this.field_D[10].field_o << 1399326179, this.field_D[10].field_n << 502234435, var6 << -631621660, this.field_D[cma.field_v[var8]], var7, var4);
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int[] discarded$0 = null;
        if (param2 != 256) {
            kv var6 = (kv) null;
            discarded$0 = this.a(2, -126, (kv) null, -110, false, 51, 115, (kv) null);
        }
        bd.field_i.e(-50 + param3, param0 - 50);
    }

    private final void d(int param0) {
        int[] var15 = this.a(16777215, 16711680, this.field_D[0], 16777215, true, param0 + 34, 16711680, this.field_D[8]);
        int[] var9 = var15;
        int[] var3 = var9;
        int[] var2 = var3;
        this.field_m = var15[0];
        this.field_n = var15[1];
        int[] var16 = this.a(-1, 16776960, this.field_D[1], 16777215, true, param0 ^ 88, -256, this.field_D[8]);
        int[] var10 = var16;
        int[] var4 = var10;
        var2 = var4;
        this.field_c = var16[0];
        this.field_p = var16[1];
        int[] var17 = this.a(-1, 16776960, this.field_D[2], 16777215, false, 35, -256, this.field_D[8]);
        int[] var11 = var17;
        int[] var5 = var11;
        var2 = var5;
        this.field_z = var17[param0];
        this.field_B = var17[0];
        int[] var18 = this.a(-1, 61440, this.field_D[3], 15790320, false, param0 ^ 113, -16711936, this.field_D[8]);
        int[] var12 = var18;
        int[] var6 = var12;
        var2 = var6;
        this.field_r = var18[0];
        this.field_d = var18[1];
        int[] var19 = this.a(16777215, 65535, this.field_D[9], 16777215, false, 80, 65535, this.field_D[8]);
        int[] var13 = var19;
        int[] var7 = var13;
        var2 = var7;
        this.field_e = var19[1];
        this.field_g = var19[0];
        int[] var20 = this.a(16777215, 255, this.field_D[10], 16777215, false, 82, 255, this.field_D[9]);
        int[] var14 = var20;
        int[] var8 = var14;
        var2 = var8;
        this.field_w = var20[0];
        this.field_k = var20[1];
        this.b((byte) -128);
    }

    final void c(int param0) {
        if (param0 != 11) {
            this.a(-127, 96, -98, 71, 60, -114, 102, true, false);
        }
        if (!(this.field_u == null)) {
            this.field_u.b(param0 ^ 1);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6, int param7) {
        int var10 = 0;
        L0: {
          var10 = BachelorFridge.field_y;
          if (param3 > 107) {
            break L0;
          } else {
            this.a(4, 73, -8, (byte) 101, true, 21, -30, -80);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 != 0) {
              break L2;
            } else {
              if (-4097 != (param1 ^ -1)) {
                break L2;
              } else {
                if (param2 == 4096) {
                  this.a(param6, false, 256, param7);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          if (!param4) {
            this.a(param7, param6, param1, (byte) -24, param5, param2, param0);
            break L1;
          } else {
            this.a(param7, (byte) -23, param6);
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 >= 5) {
            break L0;
          } else {
            this.a(-81, true, 63, 27);
            break L0;
          }
        }
        L1: {
          this.field_b = param1;
          this.field_t = param2;
          if (this.field_t == -1) {
            this.a(false, this.field_b, 1, true, -1);
            break L1;
          } else {
            if (this.field_t != 0) {
              if (1 != this.field_t) {
                if (3 != this.field_t) {
                  if (2 == this.field_t) {
                    this.a(false, this.field_b, 1, true, 2);
                    break L1;
                  } else {
                    if (-5 == (this.field_t ^ -1)) {
                      this.a(false, this.field_b, 1, true, 4);
                      break L1;
                    } else {
                      if (this.field_t != 13) {
                        if (this.field_t != 6) {
                          if (7 == this.field_t) {
                            this.a(false, this.field_b, 1, true, 3);
                            break L1;
                          } else {
                            if (15 != this.field_t) {
                              if (this.field_t != 9) {
                                if ((this.field_t ^ -1) == -9) {
                                  this.a(false, this.field_b, 1, true, 7);
                                  break L1;
                                } else {
                                  if ((this.field_t ^ -1) != -11) {
                                    if (16 == this.field_t) {
                                      this.a(false, this.field_b, 2, true, 3);
                                      break L1;
                                    } else {
                                      if (17 != this.field_t) {
                                        if (-19 != (this.field_t ^ -1)) {
                                          if (19 != this.field_t) {
                                            if (-21 != (this.field_t ^ -1)) {
                                              if (this.field_t != 5) {
                                                break L1;
                                              } else {
                                                this.a(false, this.field_b, 1, true, 6);
                                                break L1;
                                              }
                                            } else {
                                              this.a(false, 7, 1, true, 10);
                                              break L1;
                                            }
                                          } else {
                                            this.a(true, this.field_b, 1, true, 6);
                                            break L1;
                                          }
                                        } else {
                                          this.a(false, this.field_b, 1, true, 11);
                                          break L1;
                                        }
                                      } else {
                                        this.a(false, this.field_b, 1, true, 10);
                                        break L1;
                                      }
                                    }
                                  } else {
                                    this.a(false, this.field_b, 1, true, 9);
                                    break L1;
                                  }
                                }
                              } else {
                                this.a(false, this.field_b, 1, true, 8);
                                break L1;
                              }
                            } else {
                              this.a(false, this.field_b, 1, true, 1);
                              break L1;
                            }
                          }
                        } else {
                          this.a(false, this.field_b, 1, true, 5);
                          break L1;
                        }
                      } else {
                        this.a(false, this.field_b, 1, true, 3);
                        break L1;
                      }
                    }
                  }
                } else {
                  this.a(false, this.field_b, 2, true, 1);
                  break L1;
                }
              } else {
                this.a(false, this.field_b, 2, true, 1);
                break L1;
              }
            } else {
              this.a(false, this.field_b, 1, true, 0);
              break L1;
            }
          }
        }
    }

    final kv e(int param0) {
        this.b(9);
        int var2 = 29 % ((-16 - param0) / 42);
        return bd.field_i;
    }

    private final void a(int param0, byte param1, int param2) {
        vg.a(bd.field_i, param0 << -1479933852, 22997, 0, 8192, param2 << 1292302756, 8192, bd.field_i.field_o << -586375773, bd.field_i.field_n << 95940899);
        if (param1 != -23) {
            this.field_v = false;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var16 = BachelorFridge.field_y;
          if (param4 > dg.field_h) {
            break L0;
          } else {
            if (dg.field_k < param6) {
              break L0;
            } else {
              if (bd.field_i.field_q + param4 < dg.field_f) {
                break L0;
              } else {
                if (param6 + bd.field_i.field_p < dg.field_j) {
                  break L0;
                } else {
                  L1: {
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param8) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L1;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L1;
                    }
                  }
                  ((lna) (this)).field_x = stackIn_9_1 != 0;
                  bd.field_i.b();
                  dg.d();
                  var10 = param3;
                  L2: while (true) {
                    if (var10 >= 14) {
                      L3: {
                        hga.field_U.a((byte) 121);
                        if (this.field_x) {
                          bd.field_i.e();
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          L6: {
                            if (-1 == (param0 ^ -1)) {
                              break L6;
                            } else {
                              if (param0 != 65536) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (4096 == param2) {
                            this.a(param6, false, 256, param4);
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        if (param7) {
                          this.a(param4, (byte) -23, param6);
                          break L4;
                        } else {
                          this.a(param4, param6, param2, (byte) -73, param5, param1, param0);
                          break L4;
                        }
                      }
                      return;
                    } else {
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (cma.field_v[var10] == 13) {
                        var11 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q) * this.field_j[cma.field_v[var10]].field_c;
                        var12 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
                        var11 += 128;
                        var12 += 128;
                        var14 = this.field_j[10].field_b - (-(this.field_D[10].field_o >> -101609663) + -this.field_D[10].field_p + this.field_D[10].field_o);
                        var15 = 0;
                        var13 = (this.field_D[10].field_n >> -124669055) + this.field_j[10].field_a + (-this.field_D[10].field_n + this.field_D[10].field_q);
                        gna.a(var11, param3 + -122, var13 << 82970660, this.field_D[10].field_o << -692216029, this.field_D[10].field_n << 1245427907, var14 << -539014844, this.field_D[cma.field_v[var10]], var15, var12);
                        var10++;
                        continue L2;
                      } else {
                        if (cma.field_v[var10] == 12) {
                          var11 = this.field_j[cma.field_v[var10]].field_c * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q);
                          var12 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
                          var14 = this.field_D[9].field_p + -this.field_D[9].field_o + (this.field_j[9].field_b - -(this.field_D[9].field_o >> 447670177));
                          var13 = this.field_j[9].field_a - -(this.field_D[9].field_n >> 297255745) - (this.field_D[9].field_n - this.field_D[9].field_q);
                          var11 += 128;
                          var12 += 128;
                          gna.a(var11, -109, var13 << -1299265980, this.field_D[9].field_o << -518949597, this.field_D[9].field_n << 1826482019, var14 << -923431292, this.field_D[cma.field_v[var10]], var15, var12);
                          var10++;
                          continue L2;
                        } else {
                          if (cma.field_v[var10] != 11) {
                            L7: {
                              var15 = 0;
                              var11 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q) * this.field_j[cma.field_v[var10]].field_c;
                              var12 = (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p) * this.field_j[cma.field_v[var10]].field_d;
                              var13 = this.field_D[cma.field_v[var10]].field_q - this.field_D[cma.field_v[var10]].field_n + (this.field_j[cma.field_v[var10]].field_a - -(this.field_D[cma.field_v[var10]].field_n >> -1430785759));
                              var14 = this.field_D[cma.field_v[var10]].field_p - this.field_D[cma.field_v[var10]].field_o + this.field_j[cma.field_v[var10]].field_b + (this.field_D[cma.field_v[var10]].field_o >> 232661057);
                              if (-2 == (cma.field_v[var10] ^ -1)) {
                                break L7;
                              } else {
                                if ((cma.field_v[var10] ^ -1) == -3) {
                                  break L7;
                                } else {
                                  if ((cma.field_v[var10] ^ -1) == -4) {
                                    break L7;
                                  } else {
                                    gna.a(var11, param3 + -94, var13 << -2125939932, this.field_D[cma.field_v[var10]].field_o << -1626077341, this.field_D[cma.field_v[var10]].field_n << 1007955523, var14 << -1454384252, this.field_D[cma.field_v[var10]], var15, var12);
                                    var10++;
                                    continue L2;
                                  }
                                }
                              }
                            }
                            vg.a(this.field_D[cma.field_v[var10]], var13 << -307313756, 22997, var15, var11, var14 << -786496028, var12, this.field_D[cma.field_v[var10]].field_o << 307397667, this.field_D[cma.field_v[var10]].field_n << -1766616093);
                            var10++;
                            continue L2;
                          } else {
                            var12 = this.field_j[cma.field_v[var10]].field_d * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_p);
                            var11 = this.field_j[cma.field_v[var10]].field_c * (int)(4096.0 / (double)this.field_D[cma.field_v[var10]].field_q);
                            var14 = (this.field_D[8].field_o >> 850988289) + (this.field_j[8].field_b + (this.field_D[8].field_p + -this.field_D[8].field_o));
                            var13 = this.field_j[8].field_a - (-(this.field_D[8].field_n >> -1643321855) - -this.field_D[8].field_n + -this.field_D[8].field_q);
                            var11 += 128;
                            var12 += 128;
                            var15 = 0;
                            gna.a(var11, -106, var13 << -602653084, this.field_D[8].field_o << -1354252189, this.field_D[8].field_n << -1491209789, var14 << 1633539268, this.field_D[cma.field_v[var10]], var15, var12);
                            var10++;
                            continue L2;
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

    private final int[] a(int param0, int param1, kv param2, int param3, boolean param4, int param5, int param6, kv param7) {
        RuntimeException var9 = null;
        int[] var9_array = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var9_array = new int[2];
            var26 = param2.field_v;
            var25 = param7.field_v;
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            L1: while (true) {
              L2: {
                if (var16 >= var25.length) {
                  break L2;
                } else {
                  L3: {
                    if (param1 == (var25[var16] & param3)) {
                      var15 = var16 / param7.field_q;
                      var14 = var16 % param7.field_q;
                      if (!param4) {
                        break L3;
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var16++;
                  continue L1;
                }
              }
              var16 = -81 / ((param5 - -20) / 52);
              var17 = 0;
              L4: while (true) {
                if (var17 >= var26.length) {
                  var9_array[0] = var14 + -var12;
                  var9_array[1] = -var13 + var15;
                  stackOut_13_0 = (int[]) (var9_array);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  if (param6 == (var26[var17] & param0)) {
                    var13 = var17 / param2.field_q;
                    var12 = var17 % param2.field_q;
                    var17++;
                    continue L4;
                  } else {
                    var17++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var9);
            stackOut_15_1 = new StringBuilder().append("lna.F(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = param1 * this.field_a.field_n / 4096;
        if (param4 != 16632) {
            return;
        }
        int var9 = param6 * this.field_a.field_o / 4096;
        int var10 = 40 * param1 / 4096;
        int var11 = 20 * param6 / 4096;
        if (-257 < (param3 ^ -1)) {
            this.field_a.c(var10 + param5, var11 + param0, var8, var9, param3);
        } else {
            this.field_a.c(var10 + param5, param0 - -var11, var8, var9);
        }
    }

    public static void a(byte param0) {
        int var1 = -44 / ((-7 - param0) / 56);
        field_h = null;
        field_y = (String[][]) null;
        field_C = null;
    }

    lna(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        this.field_l = new int[14];
        this.field_l[6] = param6;
        this.field_l[7] = param7;
        this.field_l[10] = param10;
        this.field_l[8] = param8;
        this.field_l[5] = param5;
        this.field_l[9] = param9;
        this.field_l[2] = param2;
        this.field_l[3] = param3;
        this.field_l[4] = param4;
        this.field_l[13] = param10;
        this.field_l[12] = param9;
        this.field_l[1] = param1;
        this.field_l[0] = param0;
        this.field_l[11] = param8;
        while (!this.field_A) {
            this.a(8);
        }
        bd.field_i = new kv(220, 300);
        this.field_s = 0;
        this.d(1);
        this.b((byte) -69);
        jha.field_g.c("?", 0, jha.field_g.field_u, 16777215, 65793);
        hga.field_U.a((byte) 121);
        this.a(false, 0, 1, true, -1);
    }

    static {
        field_h = "Play the game without logging in just yet";
        field_q = true;
        field_y = new String[][]{new String[]{"120", "90", "60", "45", "30"}, new String[]{"Pizza", "Dessert", "Curry"}, new String[]{"3", "4", "5", "6"}, new String[]{"Annihilation", "Take the Grub", "Capture the fly"}, new String[]{"Short (10 turns)", "Medium (15 turns)", "Long (25 turns)", "Extra long (50 turns)"}};
    }
}
