/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    boolean field_lb;
    int field_g;
    int field_N;
    boolean field_fb;
    ie field_D;
    boolean field_W;
    int field_eb;
    int field_Q;
    ul field_T;
    private int[] field_Z;
    hd field_ab;
    int field_kb;
    boolean field_j;
    private t field_U;
    static boolean field_G;
    static gh field_H;
    boolean field_h;
    private int[] field_E;
    int field_c;
    int field_a;
    int field_M;
    int field_A;
    ul field_K;
    static String field_I;
    int field_R;
    mb field_y;
    private int field_t;
    int field_gb;
    boolean field_p;
    int field_v;
    int field_d;
    static String field_k;
    int field_f;
    int field_r;
    int field_q;
    private int field_m;
    ul field_o;
    int field_X;
    ul field_O;
    int field_Y;
    int field_n;
    ul field_u;
    int field_P;
    ul field_db;
    int field_s;
    String[] field_bb;
    int field_B;
    private int field_w;
    private int field_F;
    int field_b;
    private int field_ib;
    int field_hb;
    int field_V;
    int field_cb;
    static String field_L;
    ul field_e;
    int field_l;
    static int[] field_S;
    private int field_i;
    ul field_C;
    static String[] field_jb;
    ra field_J;
    static String field_x;
    int field_z;

    private final void a(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        wl var6 = null;
        try {
          var3_int = (this.field_ab.field_o[param1] << 4) - 75000 + 150000 * param1;
          var4 = this.field_ab.field_o[-param1 + param0] << 4;
          var5 = -30000;
          var6 = new wl(var3_int, var5, -1 + 2 * param1, 0, 50, 1, 17, this, (mb) null, 1000 + this.field_R, var4, 30);
          this.field_T.a(param0 ^ 2, var6);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ee.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          if (this.field_ab.b(98) != 2) {
            return false;
          }
          if (this.field_ab.a(false, param1) > 3000) {
            return false;
          }
          if (!this.b(true, param1)) {
            return false;
          }
          if (param0 > -26) {
            return true;
          }
          param1++;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(this.field_ab.field_n > param1)))) {
            stackIn_32_0 = this.field_ab.a(false, param1);
            if (var4 == 0) {
              if (stackIn_32_0 > 3000) {
                return true;
              }
              if (!this.b(true, param1)) {
                return false;
              }
              param1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_32_0 = 0;
          }
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        int stackIn_27_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        mb stackIn_358_0 = null;
        int stackIn_358_1 = 0;
        int stackIn_359_2 = 0;
        int stackIn_396_0 = 0;
        int stackIn_721_0 = 0;
        int stackIn_721_1 = 0;
        int stackIn_775_0 = 0;
        int stackIn_775_1 = 0;
        int stackIn_802_0 = 0;
        int stackIn_849_0 = 0;
        int stackIn_849_1 = 0;
        int stackIn_988_0 = 0;
        boolean stackIn_1036_0 = false;
        int stackIn_1043_0 = 0;
        Object stackIn_1133_0 = null;
        Object stackIn_1133_1 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_1035_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3_ref_int____ = null;
        int var3 = 0;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int[] var5_ref_int__ = null;
        jc var5_ref_jc = null;
        int var5 = 0;
        mb var5_ref_mb = null;
        wl var5_ref_wl = null;
        int var6_int = 0;
        ne var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        Object var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        mb var10_ref_mb = null;
        int var11_int = 0;
        mb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = SteelSentinels.field_G;
        try {
          this.field_N = this.field_N + 2 * oh.field_f;
          if ((this.field_v & 32) != 0) {
            if (this.field_ab.field_h[1] != 6000) {
            }
            if (50 == this.field_b) {
              this.field_ab.field_h[1] = -10000;
            }
          }
          if ((16 & this.field_v) != 0) {
            if (this.field_ab.field_h[0] == 6000) {
            }
            if (this.field_b == 50) {
              this.field_ab.field_h[0] = -10000;
            }
          }
          this.field_q = this.field_q + pi.field_c;
          this.field_f = this.field_f - oh.field_f;
          this.field_a = this.field_a - pi.field_c;
          if (this.field_j &&
            this.field_h) {
            return;
          }
          stackIn_27_0 = (di.field_g < 0) ? 0 : 1;
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameCompleted3 = true;
          var2_int = stackIn_27_0;
          if (!this.field_j &&
            10 == di.field_g &&
            qh.field_Yb > 0 &&
            this.f(param0 ^ -114)) {
            var3_ref_int____ = ua.field_I[ol.field_Ub + 10 * ge.field_j];
            if (1 + this.field_cb < var3_ref_int____.length) {
              this.field_cb = this.field_cb + 1;
              if (this.field_cb > 0 &&
                0 < ge.field_j) {
                stackIn_47_0 = 1;
              } else {
                stackIn_47_0 = 0;
              }
              var4 = stackIn_47_0;
              var5_ref_int__ = var3_ref_int____[this.field_cb];
              var6_int = var5_ref_int__.length;
              var7 = 0;
              while (true) {
                stackIn_49_0 = ~var6_int;
                stackIn_49_1 = ~var7;
                if (stackIn_49_0 < stackIn_49_1) {
                  var8 = null;
                  stackIn_396_0 = var5_ref_int__[var7];
                  if (var15 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (stackIn_396_0 == 0) {
                    var8 = nn.field_c;
                  }
                  if (var5_ref_int__[var7] == 1) {
                    var8 = va.field_f;
                  }
                  if (var5_ref_int__[var7] == 2) {
                    var8 = qm.field_d;
                  }
                  if (var5_ref_int__[var7] == 3) {
                    var8 = kj.field_D;
                  }
                  if (var5_ref_int__[var7] == 4) {
                    var8 = rn.field_o;
                  }
                  if (var5_ref_int__[var7] == 5) {
                    var8 = oc.field_f;
                  }
                  if (var5_ref_int__[var7] == 6) {
                    var8 = hk.field_Vb;
                  }
                  if (var5_ref_int__[var7] == 7) {
                    var8 = ua.field_v;
                  }
                  if (var5_ref_int__[var7] == 8) {
                    var8 = ua.field_x;
                  }
                  if (var5_ref_int__[var7] == 9) {
                    var8 = ua.field_P;
                  }
                  if (10 == var5_ref_int__[var7]) {
                    var8 = ua.field_z;
                  }
                  if (var5_ref_int__[var7] == 11) {
                    var8 = ua.field_N;
                  }
                  if (var5_ref_int__[var7] == 12) {
                    var8 = ua.field_O;
                  }
                  if (var5_ref_int__[var7] == 13) {
                    var8 = ua.field_D;
                  }
                  if (var5_ref_int__[var7] == 14) {
                    var8 = ua.field_J;
                  }
                  if (var5_ref_int__[var7] == 15) {
                    var8 = ua.field_E;
                  }
                  if (var5_ref_int__[var7] == 16) {
                    var8 = vk.field_s;
                  }
                  if (17 == var5_ref_int__[var7]) {
                    var8 = jm.field_p;
                  }
                  if (var5_ref_int__[var7] == 18) {
                    var8 = si.field_k;
                  }
                  if (var5_ref_int__[var7] == 20) {
                    var8 = eb.field_o;
                  }
                  if (21 == var5_ref_int__[var7]) {
                    var8 = bb.field_S;
                  }
                  if (var5_ref_int__[var7] == 22) {
                    var8 = ff.field_ob;
                  }
                  if (var5_ref_int__[var7] == 23) {
                    var8 = uj.field_i;
                  }
                  if (var5_ref_int__[var7] == 24) {
                    var8 = pg.field_z;
                  }
                  L38: {
                    var9_int = -1;
                    if (ge.field_j == 1 &&
                      ol.field_Ub == 9) {
                      L39: {
                        L40: {
                          L41: {
                            var10 = this.field_cb;
                            if (var10 != 0) {
                              if (1 != var10 ||
                                var15 != 0) {
                                switch (var10) {
                                  case 2:
                                    break L41;
                                  case 3:
                                    break L40;
                                  default:
                                    break L38;
                                  case 4:
                                    break L39;
                                }
                              }
                            } else {
                              if ((0 == var7)) {
                                var9_int = 36;
                              }
                              break L38;
                            }
                            if ((var7 == 0)) {
                              var9_int = 15;
                            }
                            break L38;
                          }
                          if ((var7 == 0)) {
                            var9_int = 35;
                          }
                          break L38;
                        }
                        if ((var7 == 0)) {
                          var9_int = 45;
                        }
                        break L38;
                      }
                      var9_int = 41;
                    }
                  }
                  if (ge.field_j == 1 &&
                    ol.field_Ub == 6 &&
                    var7 == 0) {
                    var10 = this.field_cb;
                    if (var10 == 0 &&
                      var15 == 0 ||
                      2 == var10 &&
                      var15 == 0 ||
                      var10 == 4) {
                      var9_int = 33;
                    }
                  }
                  if (1 == ge.field_j &&
                    ol.field_Ub == 1) {
                    if (this.field_cb == 2 &&
                      0 == var7) {
                      var9_int = 45;
                    }
                    if (this.field_cb == 4 &&
                      var7 == 0) {
                      var9_int = 45;
                    }
                  }
                  if (ge.field_j == 2 &&
                    ol.field_Ub == 3 &&
                    this.field_cb == 3 &&
                    var7 == 0) {
                    var9_int = 45;
                  }
                  if (ge.field_j == 2 &&
                    ol.field_Ub == 1 &&
                    var5_ref_int__[var7] == 9) {
                    var9_int = 36;
                  }
                  if (ge.field_j == 2 &&
                    ol.field_Ub == 2 &&
                    var7 == 0 &&
                    this.field_cb == 2) {
                    var9_int = 18;
                  }
                  var10 = 36;
                  if (ge.field_j == 2 &&
                    ol.field_Ub == 9) {
                    if (var7 == 0 && (this.field_cb == 1 ||
                      this.field_cb == 3)) {
                      var9_int = 45;
                    }
                    L57: {
                      if (-1 + var3_ref_int____.length == this.field_cb) {
                        boolean decompiledFrameRemainder7 = true;
                        var11_int = var7;
                        if (var11_int != 0) {
                          if (var11_int != 1 ||
                            var15 != 0) {
                            if (var11_int != 2) {
                              break L57;
                            }
                            decompiledFrameRemainder7 = false;
                          }
                        } else {
                          var9_int = 37;
                          break L57;
                        }
                        if (decompiledFrameRemainder7) {
                          var9_int = 14;
                          break L57;
                        }
                        var9_int = 15;
                      }
                    }
                    var10 = 38;
                  }
                  if (ge.field_j == 1 &&
                    ol.field_Ub == 8) {
                    if (2 == this.field_cb &&
                      0 == var7) {
                      var9_int = 15;
                    }
                    if (this.field_cb == 3 &&
                      0 == var7) {
                      var9_int = 9;
                    }
                  }
                  if (ge.field_j == 1 &&
                    ol.field_Ub == 7) {
                    if (this.field_cb == 3 &&
                      var7 == 0) {
                      var9_int = 39;
                    }
                    if (5 == this.field_cb &&
                      var5_ref_int__[var7] == 9) {
                      var9_int = 22;
                    }
                  }
                  if (ge.field_j == 2 &&
                    5 == ol.field_Ub) {
                    if (var7 == 0 &&
                      this.field_cb == 0) {
                      var9_int = 36;
                    }
                    if (var7 == 0 &&
                      2 == this.field_cb) {
                      var9_int = 37;
                    }
                    if (var7 == 0 &&
                      this.field_cb == 3) {
                      var9_int = 42;
                    }
                  }
                  if (ge.field_j == 2 &&
                    ol.field_Ub == 7 &&
                    1 == var7 &&
                    this.field_cb == 2) {
                    var9_int = 33;
                  }
                  if (var8 != null) {
                    if (0 == var5_ref_int__[var7]) {
                      var11 = new mb(0, 0, this);
                      var11.a(-1, 3, (int[]) (var8), 1);
                      var11.field_Nb = 7;
                      var11.j(param0 - 32);
                      var12 = var11.field_Bb;
                      var13 = var11.field_hc;
                      var11.field_Gb = -320000;
                      var11.field_K = 0;
                      var11.field_ab = 1000;
                      var11.field_Qb = 150;
                      var11.field_fc = var11.field_Gb;
                      this.field_K.a(3, var11);
                      var11.field_W = var12;
                      var14 = -4;
                      while (var14 <= 4) {
                        stackIn_49_0 = ~var14;
                        stackIn_49_1 = -1;
                        if (stackIn_49_0 != stackIn_49_1) {
                          var11 = new mb(0, 0, this);
                          var11.a(-1, 3, (int[]) (var8), 1);
                          var11.field_Nb = 7;
                          this.field_K.a(param0 ^ 24, var11);
                          var11.field_W = var12;
                          var11.field_C = 3000 * var14;
                          var11.field_hc = var13;
                          var11.field_Gb = -320000;
                          var11.field_fc = var11.field_Gb;
                          var11.field_K = 0;
                          stackIn_358_0 = var11;
                          stackIn_358_1 = 1000 * Math.abs(var14);
                          if (var14 <= 0) {
                            stackIn_359_2 = 0;
                          } else {
                            stackIn_359_2 = 500;
                          }
                          stackIn_358_0.field_ab = stackIn_358_1 + stackIn_359_2;
                          var11.field_Qb = 150;
                        }
                        var14++;
                      }
                    } else {
                      var11 = new mb(0, 0, this);
                      var11.a((int[]) (var8), true, false, -1, 1);
                      var11.field_Nb = 7;
                      if (-1 != var9_int) {
                        var11.field_hb = var9_int;
                      } else {
                        if (var4 != 0) {
                          var11.field_hb = var10;
                          var4 = 0;
                        }
                      }
                      this.field_K.a(3, var11);
                      var11.j(-5);
                      var11.field_Gb = -320000;
                      var11.field_K = 0;
                      var11.field_fc = var11.field_Gb;
                      var11.field_Qb = 150;
                      var11.field_ab = 8000;
                    }
                  }
                  var7++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted4) {
                decompiledFrameRemainder4 = (var15 != 0);
              }
            }
            if ((decompiledFrameRemainder4) &&
              (decompiledFrameCompleted4) &&
              (!this.field_j)) {
              this.field_j = true;
              nc.field_a = this.field_r / 50;
              if (b.field_f) {
                nc.field_a = nc.field_a + 600;
              }
              var4 = 0;
              var5_ref_jc = new jc(this.field_e);
              var6 = (ne) (var5_ref_jc.b(2));
              while (var6 != null) {
                var4 = var4 + var6.field_O;
                var6 = (ne) (var5_ref_jc.d(2));
                if (var15 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                var6_int = 0;
                var7 = 0;
                var8_int = 0;
                var9_int = 0;
                var10_ref_mb = this.f(0, -127);
                if (var10_ref_mb != null) {
                  var8_int = var10_ref_mb.field_Tb;
                  var7 = var10_ref_mb.field_Eb;
                  var6_int = var10_ref_mb.field_rb;
                  var9_int = var10_ref_mb.field_x - ag.a(91, var10_ref_mb.field_rc);
                }
                mj.a(ge.field_j, -(var9_int * 50000) + (this.field_M + this.field_f), nc.field_a, ol.field_Ub, -(var7 * 60000) + (-(var6_int * 128) + this.field_a), -(var8_int * 256) + (-(var4 * 100) + this.field_N), this.field_q, (byte) -65);
              }
            }
          }
          if (decompiledFrameCompleted4) {
            stackIn_396_0 = this.field_lb ? 1 : 0;
          }
          if (stackIn_396_0 != 0) {
            var3 = this.field_bb.length;
            if (this.field_ib > 0 &&
              this.field_K.b((byte) -128) < 30 &&
              41 > this.field_cb) {
              this.field_ib = this.field_ib - 1;
            }
            if (!this.field_j && (!(var3 < this.field_K.b((byte) -128)) ||
              this.field_ib <= 0)) {
              boolean decompiledFrameCompleted2 = true;
              this.field_ib = 3000;
              if (ef.field_d.length > this.field_cb &&
                this.field_cb >= 0) {
                var4_ref_int__ = ef.field_d[this.field_cb];
                var5 = var4_ref_int__.length;
                var6_int = 0;
                while (var6_int < var5) {
                  var7 = this.field_ab.a(-11) * (var6_int + 1) / (var5 + 1) << 4;
                  var8_int = -100000;
                  var9 = null;
                  stackIn_721_0 = -1;
                  stackIn_721_1 = ~var4_ref_int__[var6_int];
                  if (var15 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  if (stackIn_721_0 == stackIn_721_1) {
                    var9 = nn.field_c;
                  }
                  if (var4_ref_int__[var6_int] == 1) {
                    var9 = va.field_f;
                  }
                  if (2 == var4_ref_int__[var6_int]) {
                    var9 = qm.field_d;
                  }
                  if (3 == var4_ref_int__[var6_int]) {
                    var9 = kj.field_D;
                  }
                  if (var4_ref_int__[var6_int] == 4) {
                    var9 = rn.field_o;
                  }
                  if (var4_ref_int__[var6_int] == 5) {
                    var9 = oc.field_f;
                  }
                  if (var4_ref_int__[var6_int] == 6) {
                    var9 = hk.field_Vb;
                  }
                  if (var4_ref_int__[var6_int] == 7) {
                    var9 = ua.field_v;
                  }
                  if (var4_ref_int__[var6_int] == 8) {
                    var9 = ua.field_x;
                  }
                  if (var4_ref_int__[var6_int] == 9) {
                    var9 = ua.field_P;
                  }
                  if (var4_ref_int__[var6_int] == 10) {
                    var9 = ua.field_z;
                  }
                  if (11 == var4_ref_int__[var6_int]) {
                    var9 = ua.field_N;
                  }
                  if (var4_ref_int__[var6_int] == 12) {
                    var9 = ua.field_O;
                  }
                  if (var4_ref_int__[var6_int] == 13) {
                    var9 = ua.field_D;
                  }
                  if (var4_ref_int__[var6_int] == 14) {
                    var9 = ua.field_J;
                  }
                  if (var4_ref_int__[var6_int] == 15) {
                    var9 = ua.field_E;
                  }
                  if (var4_ref_int__[var6_int] == 16) {
                    var9 = vk.field_s;
                  }
                  if (var4_ref_int__[var6_int] == 17) {
                    var9 = jm.field_p;
                  }
                  if (var4_ref_int__[var6_int] == 18) {
                    var9 = si.field_k;
                  }
                  if (null != var9) {
                    if (var4_ref_int__[var6_int] != 0) {
                      var10_ref_mb = new mb(var7, var8_int, this);
                      var11_int = var4_ref_int__[var6_int];
                      switch ((var15 == 0
                        || var11_int == 1
                        || var11_int == 3
                        || var11_int == 6
                        || var11_int == 7
                        || var11_int == 11
                        || var11_int == 13
                        || var11_int == 14
                        ) ? var11_int : -1) {
                        case 7:
                          if ((1 & this.field_t) != 0) {
                            break;
                          }
                          var10_ref_mb.field_hb = 21;
                          this.field_t = this.field_t | 1;
                          {
                            break;
                          }
                        case 8:
                          if ((2 & this.field_t) != 0) {
                            break;
                          }
                          var10_ref_mb.field_hb = 28;
                          this.field_t = this.field_t | 2;
                          {
                            break;
                          }
                        case 9:
                          if ((8 & this.field_t) != 0) {
                            break;
                          }
                          var10_ref_mb.field_hb = 14;
                          this.field_t = this.field_t | 8;
                          {
                            break;
                          }
                        case 11:
                          if ((16 & this.field_t) != 0) {
                            break;
                          }
                          var10_ref_mb.field_hb = 39;
                          this.field_t = this.field_t | 16;
                          {
                            break;
                          }
                        case 10:
                          if (0 != (this.field_t & 32)) {
                            break;
                          }
                          this.field_t = this.field_t | 32;
                          var10_ref_mb.field_hb = 24;
                          {
                            break;
                          }
                        case 12:
                          if (0 != (this.field_t & 64)) {
                            break;
                          }
                          var10_ref_mb.field_hb = 35;
                          this.field_t = this.field_t | 64;
                          {
                            break;
                          }
                        case 13:
                          if ((128 & this.field_t) != 0) {
                            break;
                          }
                          this.field_t = this.field_t | 128;
                          var10_ref_mb.field_hb = 44;
                          {
                            break;
                          }
                        case 14:
                          if ((this.field_t & 256) != 0) {
                            break;
                          }
                          this.field_t = this.field_t | 256;
                          var10_ref_mb.field_hb = 15;
                          {
                            break;
                          }
                        case 15:
                          if (0 != (this.field_t & 512)) {
                            break;
                          }
                          this.field_t = this.field_t | 512;
                          var10_ref_mb.field_hb = 38;
                          {
                            break;
                          }
                        case 16:
                          if ((1024 & this.field_t) != 0) {
                            break;
                          }
                          this.field_t = this.field_t | 1024;
                          var10_ref_mb.field_hb = 37;
                          {
                            break;
                          }
                        case 17:
                          if ((this.field_t & 2048) != 0) {
                            break;
                          }
                          var10_ref_mb.field_hb = 30;
                          this.field_t = this.field_t | 2048;
                          {
                            break;
                          }
                        case 1:
                        case 3:
                        case 5:
                          if ((this.field_m & 1 << this.field_cb / 2) != 0) {
                            break;
                          }
                          {
                            boolean decompiledFrameRemainder6 = true;
                            boolean decompiledFrameRemainder3 = true;
                            boolean decompiledFrameRemainder2 = true;
                            this.field_m = this.field_m | 1 << this.field_cb / 2;
                            var11_int = this.field_cb / 8;
                            if (var11_int != 0) {
                              if ((var11_int != 1 ||
                                var15 != 0) &&
                                (decompiledFrameRemainder2 = (var11_int != 2)) &&
                                (decompiledFrameRemainder3 = (var11_int != 3 ||
                                var15 != 0))) {
                                if (var11_int != 4) {
                                  break;
                                }
                                decompiledFrameRemainder6 = false;
                              }
                            } else {
                              var10_ref_mb.field_hb = 5;
                              break;
                            }
                            if ((decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2)) {
                              var10_ref_mb.field_hb = 6;
                              break;
                            }
                            if ((decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder3)) {
                              var10_ref_mb.field_hb = 7;
                              break;
                            }
                            if (decompiledFrameRemainder6) {
                              var10_ref_mb.field_hb = 8;
                              break;
                            }
                          }
                          var10_ref_mb.field_hb = 9;
                          {
                            break;
                          }
                        case 2:
                        case 4:
                        case 6:
                          if ((1 << this.field_cb / 2 & this.field_i) == 0) {
                            boolean decompiledFrameRemainder5 = true;
                            boolean decompiledFrameRemainder1 = true;
                            boolean decompiledFrameRemainder0 = true;
                            this.field_i = this.field_i | 1 << this.field_cb / 2;
                            var11_int = this.field_cb / 8;
                            if (var11_int != 0 ||
                              var15 != 0) {
                              if ((var11_int != 1) &&
                                (decompiledFrameRemainder0 = (2 != var11_int)) &&
                                (decompiledFrameRemainder1 = (var11_int != 3))) {
                                if (var11_int != 4) {
                                  break;
                                }
                                decompiledFrameRemainder5 = false;
                              }
                            } else {
                              var10_ref_mb.field_hb = 0;
                              break;
                            }
                            if ((decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              var10_ref_mb.field_hb = 1;
                              break;
                            }
                            if ((decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder1)) {
                              var10_ref_mb.field_hb = 2;
                              break;
                            }
                            if (decompiledFrameRemainder5) {
                              var10_ref_mb.field_hb = 3;
                              break;
                            }
                            var10_ref_mb.field_hb = 4;
                          }
                        default:
                          break;
                      }
                      var10_ref_mb.a((int[]) (var9), true, false, -1, 1);
                      var10_ref_mb.field_Nb = 7;
                      this.field_K.a(param0 ^ 24, var10_ref_mb);
                    } else {
                      var10 = -4;
                      while (var10 <= 4) {
                        var11 = new mb(var7 + 3000 * var10, var8_int, this);
                        var11.a((int[]) (var9), true, false, -1, 1);
                        var11.field_Nb = 7;
                        var11.field_ab = 5 * var10;
                        this.field_K.a(3, var11);
                        var10++;
                      }
                    }
                  }
                  var6_int++;
                }
              }
              if (decompiledFrameCompleted2) {
                stackIn_721_0 = this.field_cb;
                stackIn_721_1 = 42;
              }
              if (stackIn_721_0 >= stackIn_721_1 ||
                this.field_cb >= 40 &&
                this.field_kb <= 1) {
                if (!this.field_j &&
                  !(var3 < this.field_K.b((byte) -128))) {
                  this.field_j = true;
                  this.field_cb = 43;
                  if (var15 != 0) {
                    this.field_cb = this.field_cb + 1;
                    this.field_l = this.field_cb;
                    if (41 == this.field_cb) {
                      this.field_l = 50;
                    }
                    if (this.field_cb == 42) {
                      this.field_l = 100;
                    }
                  }
                }
              } else {
                this.field_cb = this.field_cb + 1;
                this.field_l = this.field_cb;
                if (41 == this.field_cb) {
                  this.field_l = 50;
                }
                if (this.field_cb == 42) {
                  this.field_l = 100;
                }
              }
            }
          }
          this.a((byte) 20);
          this.field_r = this.field_r + 1;
          if (this.field_j &&
            0 != (7 & this.field_r)) {
            return;
          }
          if (4 == this.field_ab.b(68)) {
            this.a(-27309);
          }
          if (this.field_ab.b(49) == 1 &&
            -1 == di.field_g) {
            var3 = 1;
            var4 = 0;
            var5_ref_mb = (mb) (this.field_K.e(param0 + 13031));
            while (true) {
              if (null != var5_ref_mb) {
                stackIn_775_0 = -1;
                stackIn_775_1 = ~var5_ref_mb.field_jc;
                if (var15 == 0) {
                  if (stackIn_775_0 == stackIn_775_1) {
                    var4 = var4 + var5_ref_mb.field_vb;
                  }
                  if (var5_ref_mb.field_jc == 1) {
                    var4 = var4 - var5_ref_mb.field_vb;
                  }
                  var5_ref_mb = (mb) (this.field_K.a((byte) -60));
                  continue;
                }
              } else {
                stackIn_775_0 = ~var4;
                stackIn_775_1 = -1;
              }
              if (stackIn_775_0 > stackIn_775_1) {
                var3 = -1;
              }
              if (this.field_r == 12000) {
                var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, this, (mb) null, 0, 0, 0);
                this.field_T.a(3, var5_ref_wl);
              }
              if (this.field_r == 18000) {
                var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, this, (mb) null, 0, 0, 0);
                this.field_T.a(param0 ^ 24, var5_ref_wl);
              }
              if (this.field_r == 24000) {
                var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 14, this, (mb) null, 0, 0, 0);
                this.field_T.a(param0 ^ 24, var5_ref_wl);
              }
              if (29750 != this.field_r) {
                break;
              }
              this.field_R = 1;
              var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 16, this, (mb) null, 0, 0, 0);
              ri.field_b = var5_ref_wl;
              this.field_T.a(param0 ^ 24, var5_ref_wl);
              break;
            }
          }
          if (this.field_b > 0) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 550) {
              this.field_b = 0;
            }
          }
          var3 = -1;
          var4 = 0;
          stackIn_802_0 = (1 != this.field_ab.b(125)) ? 0 : 1;
          var5 = stackIn_802_0;
          if (param0 != 27) {
            return;
          }
          var6_array = new int[this.field_kb + this.field_Q];
          var7 = 0;
          var8 = (mb) (this.field_K.e(13058));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var8))) {
            ((mb) (var8)).c(1, this.field_r);
            stackIn_849_0 = ~((mb) (var8)).field_Bb;
            stackIn_849_1 = -1;
            if (var15 == 0) {
              boolean decompiledFrameRemainder8 = true;
              if (stackIn_849_0 <= stackIn_849_1 &&
                ((mb) (var8)).field_Bb >= 0 &&
                ((mb) (var8)).field_Bb < this.field_kb + this.field_Q &&
                !((mb) (var8)).field_V) {
                if (!((mb) (var8)).field_Hb) {
                  var7 = var7 | 1 << ((mb) (var8)).field_jc;
                }
                var6_array[((mb) (var8)).field_Bb] = ((mb) (var8)).field_vb;
                if (var6_array[((mb) (var8)).field_Bb] <= 0) {
                  var6_array[((mb) (var8)).field_Bb] = 1;
                }
                if (!(this.field_l * 100000 <= ((mb) (var8)).field_vb) ||
                  var5 != 0) {
                  if (!(((mb) (var8)).field_vb <= var4)) {
                    var4 = ((mb) (var8)).field_vb;
                  }
                  decompiledFrameRemainder8 = false;
                }
                else {
                  if (~((mb) (var8)).field_vb == ~var4) {
                    var3 = -1;
                  } else {
                    if (((mb) (var8)).field_vb > var4) {
                      var3 = ((mb) (var8)).field_Bb;
                      var4 = ((mb) (var8)).field_vb;
                    }
                  }
                }
              }
              var8 = (mb) (this.field_K.a((byte) -98));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_849_0 = 0;
            stackIn_849_1 = this.field_R;
          }
          if (stackIn_849_0 == stackIn_849_1 &&
            0 > var3 &&
            this.field_A > 0 &&
            null != this.field_y &&
            this.field_y.field_vb >= 200000) {
            this.field_R = 1;
          }
          if ((50000 * this.field_l) <= var4 &&
            this.field_W) {
            this.field_W = false;
            var8_int = this.field_ab.a(-116) << 3;
            var9_int = -500000;
            var10_ref_mb = new mb(var8_int, var9_int, this);
            var10_ref_mb.field_ib = true;
            var10_ref_mb.a(oh.field_h, true, false, -1, this.field_kb + this.field_Q);
            var10_ref_mb.field_Nb = 11;
            this.field_A = var10_ref_mb.field_Bb;
            this.field_y = var10_ref_mb;
            var10_ref_mb.d(param0 - 28060);
            var10_ref_mb.field_ic = 131585;
            var10_ref_mb.field_Qb = 250;
            var10_ref_mb.field_ab = 1000;
            this.field_K.a(3, var10_ref_mb);
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          L177: {
            if (!this.field_fb ||
              this.field_lb ||
              0 != this.field_r % 1200 &&
              (this.field_R <= 150 ||
              this.field_j) ||
              !(this.field_K.b((byte) -128) < 16)) {
              if (this.field_lb) {
                break L177;
              }
              if (this.field_fb) {
                break L177;
              }
              if (var2_int != 0) {
                break L177;
              }
              if (this.field_ab.b(54) != 0) {
                break L177;
              }
              if (this.field_F <= 0) {
                break L177;
              }
              if (this.field_R != 0) {
                break L177;
              }
              if (this.field_r <= 0) {
                break L177;
              }
              if (this.field_r % 3000 != 0) {
                break L177;
              }
              if (this.h(126) >= 2) {
                break L177;
              }
              var8 = null;
              var9_int = this.field_r / 3000 - 1;
              if (1 < this.field_F) {
                if (!(5 >= var9_int)) {
                  var9_int = this.field_D.a(-123, 2) + 4;
                  if ((var15 != 0) &&
                    (var9_int > 3)) {
                    var9_int = this.field_D.a(-120, 2) + 2;
                  }
                }
              } else {
                if (var9_int > 3) {
                  var9_int = this.field_D.a(-120, 2) + 2;
                }
              }
              L183: {
                var10 = var9_int;
                if (0 != var10 ||
                  var15 != 0) {
                  switch (var10) {
                    case 1:
                      var8 = kj.field_D;
                      break L183;
                    case 2:
                      var8 = qm.field_d;
                      break L183;
                    case 3:
                      var8 = rn.field_o;
                      break L183;
                    case 4:
                      var8 = oc.field_f;
                      break L183;
                    default:
                      break L183;
                    case 5:
                      if (var15 == 0) {
                        var8 = hk.field_Vb;
                        break L183;
                      }
                      break;
                  }
                }
                var8 = va.field_f;
              }
              var10 = 0;
              while (var10 < 2) {
                var11 = new mb(0, 0, this);
                var11.a((int[]) (var8), true, false, -1, 12);
                var11.field_hb = this.a(false, var9_int);
                var11.field_Nb = 8;
                this.field_K.a(param0 - 24, var11);
                var11.field_hc = -128;
                stackIn_988_0 = var10 & 1;
                if (var15 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_988_0 == 0) {
                  var11.field_hc = (this.field_ab.a(-126) << 4) - var11.field_hc;
                }
                var11.field_Gb = 1;
                var11.field_pc = false;
                var10++;
              }
              if ((decompiledFrameCompleted1) &&
                (var15 == 0)) {
                break L177;
              }
            }
            if (decompiledFrameCompleted1) {
              var8 = null;
              var9_int = -1 + this.field_r / 1200;
              if (var9_int > 2) {
                var9_int = this.field_D.a(param0 ^ 77, 1 + this.field_F);
              }
              var10 = var9_int;
              if (0 == var10) {
                var8 = qm.field_d;
              } else {
                if (1 == var10 &&
                  var15 == 0) {
                  var8 = rn.field_o;
                } else {
                  if (2 == var10) {
                    var8 = hk.field_Vb;
                  }
                }
              }
              var10 = 0;
              while (var10 < 2) {
                var11 = new mb(0, 0, this);
                var11.a((int[]) (var8), true, false, -1, 12);
                var11.field_hb = this.a(false, var9_int);
                var11.field_Nb = 8;
                this.field_K.a(3, var11);
                var11.field_hc = this.field_D.a(83, this.field_ab.a(124)) << 4;
                var11.field_pc = false;
                var11.field_Gb = this.field_ab.a(false, var11.field_hc >> 4) - 16000 << 4;
                var10++;
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_988_0 = this.field_lb ? 1 : 0;
          }
          if ((decompiledFrameCompleted0) && (stackIn_988_0 == 0 &&
            var2_int == 0 && (this.field_ab.b(51) == 3 ||
            1 == this.field_ab.b(53)) && (0 == this.field_R &&
            0 == this.field_r % 1500))) {
            var8_int = this.field_r / 3000;
            if (0 < this.field_F) {
              if (!(var8_int <= 5)) {
                var8_int = 4 + this.field_D.a(param0 - 146, 2);
                if ((var15 != 0) &&
                  (var8_int > 4)) {
                  var8_int = this.field_D.a(60, 5);
                }
              }
            } else {
              if (var8_int > 4) {
                var8_int = this.field_D.a(60, 5);
              }
            }
            var9 = new ne(this, this.a(false, var8_int));
            ((ne) (var9)).field_z = this.field_D.a(80, this.field_ab.a(param0 ^ 68) << 4);
            ((ne) (var9)).field_I = -180000;
            this.field_e.a(3, (ck) (var9));
          }
          var8 = (ne) (this.field_e.e(13058));
          L198: while (true) {
            if (var8 != null) {
              ((ne) (var8)).c((byte) 87);
              stackIn_1133_0 = null;
              stackIn_1133_1 = var8;
              if (var15 != 0) {
                if (stackIn_1133_0 != stackIn_1133_1) {
                  ((kd) (var8)).b(4);
                  var8 = this.field_J.a(false);
                  return;
                }
                break L198;
              }
              if (stackIn_1133_0 != ((ne) (stackIn_1133_1)).field_T ||
                !(((ne) (var8)).field_K > 0)) {
                ((ne) (var8)).b(4);
                this.field_f = this.field_f - ((ne) (var8)).field_O * 50;
              }
              var8 = (ne) (this.field_e.a((byte) -40));
              continue;
            }
            var8 = (mb) (this.field_K.e(param0 + 13031));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var8 == null))) {
              stackOut_1035_0 = ((mb) (var8)).field_gc;
              stackIn_1043_0 = stackOut_1035_0 ? 1 : 0;
              stackIn_1036_0 = stackOut_1035_0;
              if (var15 == 0) {
                if (stackIn_1036_0) {
                  ((mb) (var8)).b(4);
                }
                var8 = (mb) (this.field_K.a((byte) -77));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_1043_0 = var2_int;
            }
            if (stackIn_1043_0 != 0 &&
              4 == this.field_ab.b(98) &&
              this.field_R > 0) {
              this.field_R = this.field_R + 1;
              this.field_l = Math.max(1 + this.field_F, 2);
            }
            if (!this.field_lb &&
              var2_int == 0) {
              if (-1 != var3 &&
                this.field_ab.b(47) != 4 ||
                this.field_R > 0) {
                this.field_R = this.field_R + 1;
                this.field_l = Math.max(1 + this.field_F, 2);
              }
              if (var5 != 0 &&
                this.field_R == 0 &&
                this.field_r > 29850) {
                this.field_R = 1;
              }
              if (this.field_R == 1 &&
                this.field_bb.length == 2) {
                var8_int = 0;
                var9 = this.f(0, -128);
                if (var9 != null &&
                  0 < ((mb) (var9)).field_vb) {
                  var8_int = ((mb) (var9)).field_vb;
                }
                var9 = this.f(1, -128);
                if (var9 != null &&
                  ((mb) (var9)).field_vb < var8_int) {
                  if (~var8_int != ~((mb) (var9)).field_vb) {
                  }
                  var8_int = ((mb) (var9)).field_vb;
                }
              }
              if (1650 != this.field_R ||
                4 == this.field_ab.b(57)) {
                if (!(1 < mm.a((byte) 119, var7))) {
                  this.a(var6_array, (byte) -114);
                  if (var15 != 0) {
                    this.a(var6_array, (byte) -128);
                  }
                }
              } else {
                this.a(var6_array, (byte) -128);
              }
            }
            var8 = (wl) (this.field_db.e(13058));
            do {
              if (null == var8) {
                this.field_u.a(param0 - 2, this.field_C);
                break;
              }
              ((wl) (var8)).i(-1);
              var8 = (wl) (this.field_db.a((byte) -60));
            } while (var15 == 0);
            var8 = (jb) (this.field_C.e(param0 ^ 13081));
            L223: while (true) {
              if (var8 != null) {
                ((jb) (var8)).a(false);
                var8 = (jb) (this.field_C.a((byte) -30));
                if (var15 == 0) {
                  continue;
                }
              } else {
                if (this.field_o != null) {
                  this.field_O.a(35, this.field_o);
                  var8 = (qb) (this.field_o.e(13058));
                  while (null != var8) {
                    ((qb) (var8)).c((byte) 60);
                    var8 = (qb) (this.field_o.a((byte) -13));
                    if (var15 != 0) {
                      break L223;
                    }
                  }
                }
              }
              var8 = this.field_J.b(22);
              break;
            }
            while (true) {
              stackIn_1133_0 = null;
              stackIn_1133_1 = var8;
              if (stackIn_1133_0 == stackIn_1133_1) {
                break L198;
              }
              ((kd) (var8)).b(4);
              var8 = this.field_J.a(false);
              if (var15 != 0) {
                return;
              }
            }

          }
          this.field_J.a(8150);
          this.field_T.a(114, this.field_db);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.MA(" + param0 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != ~this.field_ab.b(param1 ^ -103)) {
            return true;
          }
          if (this.field_ab.field_o[0] - 5000 >= param0 >> 4 &&
            this.field_ab.field_o[1] + 5000 <= param0 >> 4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        wk var1 = null;
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          var1 = new wk(540, 140);
          q.a(var1, (byte) -82);
          lf.a();
          pb.b();
          vn.field_h = 0;
          pm.a(param0);
          var2 = var1.g();
          var3 = 0;
          while (var3 < 15) {
            var2.e(-2, -2, 16777215);
            pb.d(4, 4, 0, 0, 540, 140);
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          gb.field_d.d();
          var1.b(0, 0);
          tk.$cfr$intArgs$f$20d51497949f(122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ee.N(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        ck stackIn_8_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_46_1 = null;
        mb stackIn_57_0 = null;
        Object stackIn_128_0 = null;
        mb stackIn_128_1 = null;
        mb stackIn_146_1 = null;
        int stackIn_211_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_222_0 = 0;
        int stackIn_226_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_318_1 = 0;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_145_1;
        mb stackOut_56_0;
        mb var2 = null;
        RuntimeException var2_ref = null;
        mb var3 = null;
        mb var4_ref_mb = null;
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        Object var7 = null;
        int var8 = 0;
        je var8_ref_je = null;
        jc var9_ref_jc = null;
        int var9 = 0;
        mb var10_ref_mb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object stackIn_46_0Lifetime1;
        Object stackIn_46_1Lifetime1;
        Object stackIn_128_0Lifetime1;
        mb stackIn_128_1Lifetime1;
        je var8_ref_jeLifetime1;
        jc var9_ref_jcLifetime1;
        mb var10_ref_mbLifetime1;
        int var8Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var8Lifetime1Lifetime1;
        var13 = SteelSentinels.field_G;
        try {
          if (param0 <= 5) {
            this.field_e = (ul) null;
          }
          var2 = (mb) (this.field_K.e(13058));
          if (null != var2) {
            stackIn_8_0 = this.field_K.a((byte) -68);
          } else {
            stackIn_8_0 = null;
          }
          var3 = (mb) (stackIn_8_0);
          if (null != var3 &&
            ~var2.field_jc == ~var3.field_jc) {
            if (var3.field_rb > var2.field_rb) {
              var4_ref_mb = var3;
              var3 = var2;
              var2 = var4_ref_mb;
            }
            if (var3.field_pc) {
              var3 = var2;
              if (var13 != 0) {
                var3 = var2;
              }
            }
          } else {
            var3 = var2;
          }
          if ((var2 == null ||
            var2.i(99)) &&
            (var3 == null ||
            var3.i(68))) {
            this.field_w = this.field_w + 1;
            if (var13 != 0) {
              this.field_w = 0;
            }
          } else {
            this.field_w = 0;
          }
          var4 = 0;
          var6 = (mb) (this.field_K.e(13058));
          while (var6 != null) {
            var7 = var2;
            if (var13 != 0) {
              return;
            }
            L12: {
              boolean decompiledFrameCompleted2 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              if (var6.field_Nb != 8 &&
                var6.field_Nb != 11) {
                while (true) {
                  if (var6.field_Nb == 10) {
                    while (true) {
                      var7 = null;
                      var8 = 2147483647;
                      var9_ref_jc = new jc(this.field_K);
                      var10_ref_mb = (mb) (var9_ref_jc.b(2));
                      while (var10_ref_mb != null) {
                        stackIn_46_0 = null;
                        stackOut_145_1 = var10_ref_mb;
                        stackIn_46_1 = stackOut_145_1;
                        stackIn_146_1 = stackOut_145_1;
                        if (stackIn_46_0 != stackIn_146_1 &&
                          !var10_ref_mb.field_Hb &&
                          0 != var10_ref_mb.field_Nb && (var6.field_jc != var10_ref_mb.field_jc ||
                          var13 != 0)) {
                          var11 = var10_ref_mb.field_hc - var6.field_hc;
                          var12 = -var6.field_Gb + var10_ref_mb.field_Gb;
                          var12 = var12 * var12 + var11 * var11;
                          if (var8 > var12) {
                            var8 = var12;
                            var7 = var10_ref_mb;
                          }
                        }
                        var10_ref_mb = (mb) (var9_ref_jc.d(2));
                      }
                      break L12;
                    }
                  }
                  var4++;
                  if (null == var2 ||
                    var2 == var6.field_Vb ||
                    !var2.i(84) ||
                    var3.i(104)) {
                    if (null != var3 &&
                      var4 >= 3 &&
                      !var3.i(83)) {
                      var4 = 0;
                      var7 = var3;
                    }
                  } else {
                    var7 = var3;
                  }
                  if (null != var7) {
                    stackIn_128_0 = var7;
                    stackIn_128_1 = var6.field_Vb;
                    while (true) {
                      if (stackIn_128_0 != stackIn_128_1 &&
                        ((mb) (var7)).i(78) &&
                        200 * var6.field_Bb > this.field_w) {
                        var7 = null;
                      }
                      if (((var6.field_Vb != null)) &&
                        (!(var6.field_Vb.field_Hb))) {
                        var7 = var6.field_Vb;
                      }
                      break L12;
                    }
                  }
                  if (var6.field_Vb == null) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  if (var6.field_Vb.field_Hb) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var7 = var6.field_Vb;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var8Lifetime2 = 2147483647;
                var7 = var6.field_Vb;
                stackIn_46_0Lifetime1 = null;
                stackIn_46_1Lifetime1 = var7;
                while (true) {
                  if (stackIn_46_0Lifetime1 != stackIn_46_1Lifetime1 && (((mb) (var7)).field_pc ||
                    ((mb) (var7)).field_Hb)) {
                    var7 = null;
                  }
                  if (var7 == null) {
                    var9_ref_jcLifetime1 = new jc(this.field_K);
                    var10_ref_mbLifetime1 = (mb) (var9_ref_jcLifetime1.b(2));
                    while (var10_ref_mbLifetime1 != null) {
                      stackOut_56_0 = var10_ref_mbLifetime1;
                      stackIn_128_0Lifetime1 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_128_1Lifetime1 = this.field_y;
                      if (stackIn_57_0 != stackIn_128_1Lifetime1 &&
                        null != var10_ref_mbLifetime1 &&
                        !var10_ref_mbLifetime1.field_Hb &&
                        !var10_ref_mbLifetime1.field_pc &&
                        !var10_ref_mbLifetime1.i(75) &&
                        ~var6.field_jc != ~var10_ref_mbLifetime1.field_jc && (var7 == null ||
                        !(((mb) (var7)).field_Bb < this.field_kb) ||
                        !(var10_ref_mbLifetime1.field_Bb >= this.field_kb))) {
                        var11Lifetime1 = var10_ref_mbLifetime1.field_hc - var6.field_hc >> 4;
                        var12Lifetime1 = -var6.field_Gb + var10_ref_mbLifetime1.field_Gb >> 4;
                        var12Lifetime1 = var12Lifetime1 * var12Lifetime1 + var11Lifetime1 * var11Lifetime1;
                        if (var12Lifetime1 >= var8Lifetime2) {
                          if ((null != var7) &&
                            (!(this.field_kb > ((mb) (var7)).field_Bb)) &&
                            (!(this.field_kb <= var10_ref_mbLifetime1.field_Bb))) {
                            var8Lifetime2 = var12Lifetime1;
                            var7 = var10_ref_mbLifetime1;
                          }
                        } else {
                          var8Lifetime2 = var12Lifetime1;
                          var7 = var10_ref_mbLifetime1;
                        }
                      }
                      var10_ref_mbLifetime1 = (mb) (var9_ref_jcLifetime1.d(2));
                    }
                  }
                  break;
                }
              }
            }
            if ((var6.field_Nb == 7 ||
              8 == var6.field_Nb ||
              var6.field_Nb == 11 ||
              var6.field_Nb == 10) &&
              (var7 != null &&
              !var6.field_pc)) {
              boolean decompiledFrameRemainder2 = true;
              if (var6.field_pb >= 750) {
                boolean decompiledFrameRemainder0 = true;
                var6.field_t = 0;
                var6.field_pb = 0;
                var8Lifetime1 = this.field_ab.b(81);
                if (var8Lifetime1 == 3 &&
                  var13 == 0) {
                  boolean decompiledFrameRemainder1 = true;
                  var8Lifetime1 = this.field_ab.a(-121) / 2;
                  if (!var6.field_Cb &&
                    !((mb) (var7)).field_Cb) {
                    stackIn_211_0 = (var8Lifetime1 <= (var6.field_hc >> 4)) ? 0 : 1;
                    if (var8Lifetime1 <= (((mb) (var7)).field_hc >> 4)) {
                      stackIn_215_1 = 0;
                    } else {
                      stackIn_215_1 = 1;
                    }
                    if (stackIn_211_0 == stackIn_215_1) {
                      stackIn_222_0 = (var6.field_u) ? 0 : 1;
                      if (((mb) (var7)).field_u) {
                        stackIn_226_1 = 0;
                      } else {
                        stackIn_226_1 = 1;
                      }
                      if (stackIn_222_0 == stackIn_226_1) {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      } else {
                        if (var6.field_u) {
                          if (!this.a((byte) 91, ((mb) (var7)).field_hc >> 4, var6.field_hc >> 4)) {
                            var6.field_t = ((mb) (var7)).field_hc >> 4;
                          } else {
                            var6.field_t = this.a((byte) 69, var6.field_hc >> 4);
                          }
                        } else {
                          if (!this.a((byte) 127, var6.field_hc >> 4, ((mb) (var7)).field_hc >> 4)) {
                            var6.field_t = ((mb) (var7)).field_hc >> 4;
                          } else {
                            var6.field_t = this.a((byte) -81, var6.field_hc >> 4);
                          }
                        }
                      }
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (!var6.field_Cb) {
                      var6.field_t = var8Lifetime1;
                    } else {
                      if (!((mb) (var7)).field_Cb) {
                        if (((mb) (var7)).field_hc < var6.field_hc) {
                          var6.field_t = -100 + (-5120 + var8Lifetime1);
                        } else {
                          var6.field_t = var8Lifetime1 + 5220;
                        }
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      }
                    }
                  }
                  decompiledFrameRemainder2 = false;
                } else {
                  if (var8Lifetime1 != 2) {
                    decompiledFrameRemainder0 = (var8Lifetime1 != 0 ||
                      var13 != 0);
                    decompiledFrameRemainder2 = ((!(decompiledFrameRemainder0)) ||
                      (!(decompiledFrameRemainder0 = (var8Lifetime1 != 1))));
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder0)) {
                  if (!var6.field_u &&
                    this.b(true, var6.field_hc >> 4)) {
                    if (var6.field_hc > ((mb) (var7)).field_hc) {
                      if (this.a(var6.field_hc >> 4, false)) {
                        var6.field_t = (var6.field_hc >> 4) + 1500;
                      } else {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      }
                    } else {
                      if (!this.e(-44, var6.field_hc >> 4)) {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      } else {
                        var6.field_t = -1500 + (var6.field_hc >> 4);
                      }
                    }
                  } else {
                    if ((!(!var6.field_u)) &&
                      (!(!this.a((byte) 61, ((mb) (var7)).field_hc >> 4, var6.field_hc >> 4)))) {
                      var6.field_t = this.a((byte) 50, var6.field_hc >> 4);
                    }
                  }
                  decompiledFrameRemainder2 = false;
                }
                if (decompiledFrameRemainder2) {
                  stackIn_314_0 = (var6.field_u) ? 0 : 1;
                  if (((mb) (var7)).field_u) {
                    stackIn_318_1 = 0;
                  } else {
                    stackIn_318_1 = 1;
                  }
                  if (stackIn_314_0 == stackIn_318_1) {
                    var6.field_t = ((mb) (var7)).field_hc >> 4;
                  } else {
                    if (!var6.field_u) {
                      if (this.a((byte) 39, var6.field_hc >> 4, ((mb) (var7)).field_hc >> 4)) {
                        var6.field_t = this.a((byte) 124, var6.field_hc >> 4);
                      } else {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      }
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      if (!this.a((byte) 95, ((mb) (var7)).field_hc >> 4, var6.field_hc >> 4)) {
                        var6.field_t = ((mb) (var7)).field_hc >> 4;
                      } else {
                        var6.field_t = this.a((byte) 93, var6.field_hc >> 4);
                      }
                    }
                  }
                }
              }
              if (var6.field_t > 0 &&
                200 > Math.abs((var6.field_hc >> 4) - var6.field_t)) {
                var6.field_pb = 0;
                var6.field_t = 0;
              }
              if (var6.field_t > 0 &&
                ((mb) (var7)).field_pc) {
                var6.field_pb = 0;
                var6.field_t = 0;
              }
              if (var6.field_t > 0 &&
                var6.field_rc == 24) {
                var6.field_pb = 0;
                var6.field_t = 0;
                var8_ref_je = new je(11, 0, this.field_r + 2);
                var8_ref_je.field_p = true;
                var6.field_B.a(3, var8_ref_je);
              }
              if (var6.field_t > 0 &&
                15 == var6.field_rc) {
                var6.field_pb = 0;
                var6.field_t = 0;
                var8_ref_jeLifetime1 = new je(8, 0, 2 + this.field_r);
                var8_ref_jeLifetime1.field_p = true;
                var6.field_B.a(3, var8_ref_jeLifetime1);
              }
              var8Lifetime1Lifetime1 = var6.field_Zb.field_N;
              var9 = ((mb) (var7)).field_hc - var6.field_hc;
              var10 = -var6.field_Gb + ((mb) (var7)).field_Gb;
              if (var9 >= 0) {
                var5 = 1;
              } else {
                var5 = -1;
              }
              if (var6.field_Ec.f(7) &&
                var6.field_B.f(7)) {
                if (109 == var8Lifetime1Lifetime1) {
                  this.a(var9, (mb) (var7), 16384, var10, var5, var6);
                }
                if (107 == var8Lifetime1Lifetime1) {
                  this.a(var6, var5, var10, (mb) (var7), 0, var9);
                }
                if (var8Lifetime1Lifetime1 == 108) {
                  var10 = this.a((mb) (var7), var9, (byte) -64, var10, var6, var5);
                }
                if (var8Lifetime1Lifetime1 == 0) {
                  this.a(var10, var5, (byte) 21, (mb) (var7), var6, var9);
                }
                if (var8Lifetime1Lifetime1 == 55) {
                  this.a((byte) 68, var5, var10, var9, var6, (mb) (var7));
                }
                if (57 == var8Lifetime1Lifetime1) {
                  this.a(var9, 2714, var10, var5, var6, (mb) (var7));
                }
                if (var8Lifetime1Lifetime1 == 62) {
                  this.a(var10, var5, var6, var9, (mb) (var7), (byte) 88);
                }
                if (var8Lifetime1Lifetime1 == 65) {
                  this.a(var5, var9, var10, var6, (mb) (var7), false);
                }
                if (var8Lifetime1Lifetime1 == 69) {
                  this.a(var6, (byte) -35, (mb) (var7), var9, var5);
                }
                if (var8Lifetime1Lifetime1 == 72) {
                  this.a(var9, (mb) (var7), var6, 20063, var5);
                }
                if (var8Lifetime1Lifetime1 == 75) {
                  this.a((byte) -121, var10, (mb) (var7), var9, var6, var5);
                }
                if (var8Lifetime1Lifetime1 == 79) {
                  this.a((byte) 57, var9, (mb) (var7), var6, var5, var10);
                }
                if (84 == var8Lifetime1Lifetime1) {
                  this.a(var10, var6, var9, (mb) (var7), var5, 14432);
                }
                if (var8Lifetime1Lifetime1 == 88) {
                  this.a((mb) (var7), var9, -128, var5, var6, var10);
                }
                if (var8Lifetime1Lifetime1 == 92) {
                  this.a(-103, var5, (mb) (var7), var9, var6);
                }
              }
            }
            var6 = (mb) (this.field_K.a((byte) -48));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ee.IA(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = SteelSentinels.field_G;
        try {
          ba.field_f = null;
          if (param0 != 11828) {
            field_k = (String) null;
          }
          kc.field_A = false;
          if (de.field_d) {
            ch.field_O.m((byte) 127);
            if (var2 == 0) {
              return;
            }
          }
          var1_int = ua.field_o;
          if (var1_int > 0) {
            if (var1_int != 1) {
              ba.field_f = db.a(df.field_J, -120, new String[]{Integer.toString(var1_int)});
            }
            if (var1_int == 1 ||
              var2 != 0) {
              ba.field_f = vk.field_k;
            }
            ba.field_f = ue.a(new CharSequence[]{(CharSequence) ((Object) ba.field_f), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) in.field_f)}, param0 - 11828);
          }
          ch.field_O.m(105);
          tc.a((byte) 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ee.J(" + param0 + ')');
        }
    }

    final void g(int param0, int param1) {
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        mb var7 = null;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          if (this.field_b != 0) {
            if (this.field_b >= 50) {
              this.field_b = 49;
              if (var8 != 0) {
                this.field_b = 1;
              }
            }
          } else {
            this.field_b = 1;
          }
          var3_int = this.field_ab.field_o[param1];
          var4 = kc.field_x[4][0].field_z << 4;
          var5 = -(var4 / 2) + var3_int;
          var6 = var3_int + var4 / 2;
          var7_int = var5;
          while (var6 > var7_int) {
            this.field_ab.field_m[var7_int] = 0;
            this.field_ab.field_e[var7_int] = 0;
            if (var8 == 0) {
              this.field_ab.field_f[var7_int] = 0;
              var7_int++;
              continue;
            }
            break;
          }
          var7 = (mb) (this.field_K.e(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var7))) {
            stackIn_43_0 = ~param1;
            stackIn_43_1 = ~var7.field_jc;
            if (var8 == 0) {
              if (stackIn_43_0 == stackIn_43_1 &&
                0 < var7.field_z) {
                var7.field_z = 0;
                var7.field_pc = false;
                var7.field_rb = 0;
              }
              if (var7.field_jc == param1 ||
                var7.field_Hb) {
                if (!var7.field_Hb) {
                  var7.field_Cb = false;
                }
              } else {
                var7.field_vb = var7.field_vb + 100000;
                var7.field_Fc = 50;
                var7.field_Ab = var7.field_Ab + 100000;
              }
              var7 = (mb) (this.field_K.a((byte) -111));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_43_0 = param0;
            stackIn_43_1 = -108;
          }
          if (stackIn_43_0 > stackIn_43_1) {
            ee.g(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, mb param4, mb param5) {
        je stackIn_25_0 = null;
        je stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        je stackIn_26_0 = null;
        je stackIn_26_1 = null;
        int stackIn_26_3 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        int var8_int = 0;
        je var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        je var7Lifetime3;
        var11 = SteelSentinels.field_G;
        try {
          if (~param5.field_hc == ~param4.field_hc &&
            param4.field_U == 0 &&
            param4.field_t <= 0 &&
            !param4.field_Lb) {
            if (param4.field_hc < 4096) {
              param4.field_t = 1024 + param4.field_hc;
              if (var11 != 0) {
                param4.field_t = param4.field_hc - 1024;
              }
            } else {
              param4.field_t = param4.field_hc - 1024;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4.field_t > 0) {
            stackIn_25_0 = null;
            stackIn_25_1 = null;
            stackIn_25_2 = 6;
            if (param4.field_hc >> 4 < param4.field_t) {
              stackIn_26_0 = null;
              stackIn_26_1 = null;
              stackIn_26_3 = 1;
            } else {
              stackIn_26_0 = null;
              stackIn_26_1 = null;
              stackIn_26_3 = -1;
            }
            var7 = new je(stackIn_25_2, stackIn_26_3, 2 + this.field_r);
            var7.field_p = true;
            param4.field_B.a(3, var7);
            decompiledFrameRemainder0 = (var11 != 0);
          }
          if (decompiledFrameRemainder0) {
            if ((Math.abs(param3) < 30000) &&
              (decompiledFrameRemainder0 = !(Math.abs(param3) >= 30000))) {
              var7Lifetime1 = new je(6, -param1, this.field_r + 2);
              var7Lifetime1.field_p = true;
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              var7Lifetime2 = new je(6, param1, this.field_r + 2);
              var7Lifetime2.field_p = true;
              param4.field_B.a(3, var7Lifetime2);
              var7Lifetime3 = new je(3, 0, 100 + this.field_r + (4 + (param5.field_hc + this.field_r + param4.field_hc) % 100));
              var7Lifetime3.field_u = param5.field_hc;
              var7Lifetime3.field_p = true;
              var7Lifetime3.field_y = param4.field_Gb - 20000;
              param4.field_B.a(3, var7Lifetime3);
              param4.field_Tb = param4.field_x;
            }
          }
          var7_int = -1;
          if (param0 <= 53) {
            return;
          }
          var8_int = 0;
          L8: while (true) {
            if (param4.field_Xb.length > var8_int) {
              stackIn_55_0 = ~param4.field_Xb[var8_int];
              stackIn_55_1 = -14;
              if (var11 != 0) {
                break L8;
              }
              if (stackIn_55_0 == stackIn_55_1) {
                var7_int = var8_int;
              } else {
                var8_int++;
                continue;
              }
            }
            if (var7_int >= 0 &&
              this.a(this.field_z, (byte) -95, var7_int, param4, param5, 2600, 5 + this.field_r + (param4.field_hc + (param5.field_hc + this.field_r)) % 100)) {
              return;
            }
            stackIn_55_0 = 40000;
            stackIn_55_1 = Math.abs(param3);
            break;
          }
          if (stackIn_55_0 > stackIn_55_1) {
            var8 = new je(0, 0, 5 + (this.field_r + (param5.field_hc + (this.field_r + param4.field_hc)) % 100));
            var8.field_y = param5.field_Gb;
            var8.field_u = param5.field_hc;
            var9 = Math.atan2((double)param3, (double)(-param2));
            var8.field_B = (int)(var9 * 65536.0 / 6.283185307179586);
            if (param1 < 0) {
              if (!(var8.field_B <= 16384)) {
                var8.field_B = var8.field_B - 65536;
                if ((var11 != 0) &&
                  (var8.field_B < -16384)) {
                  var8.field_B = var8.field_B + 65536;
                }
              }
            } else {
              if (var8.field_B < -16384) {
                var8.field_B = var8.field_B + 65536;
              }
            }
            var8.field_p = true;
            param4.field_B.a(3, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_74_0 = var7_ref;
          stackIn_74_1 = new StringBuilder().append("ee.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param5 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final void a(mb[] param0, int[] param1, int[] param2, int param3, int[] param4, int[] param5) {
        mb stackIn_5_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int[] stackIn_199_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_205_2 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_209_2 = null;
        StringBuilder stackIn_212_1 = null;
        String stackIn_213_2 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        StringBuilder stackIn_220_1 = null;
        String stackIn_221_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        mb[] var9_ref_mb__ = null;
        int var10 = 0;
        mb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mb var11Lifetime1;
        int stackIn_97_0Lifetime1;
        int stackIn_97_1Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int stackIn_97_0Lifetime1Lifetime1;
        int stackIn_97_1Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var14 = SteelSentinels.field_G;
        try {
          param5[8] = 1;
          if (this.field_A >= 0) {
            stackIn_5_0 = this.field_y;
          } else {
            stackIn_5_0 = null;
          }
          var7 = stackIn_5_0;
          param5[0] = 2;
          param5[9] = 1;
          param5[10] = 2;
          if (null != var7) {
            param5[8] = var7.field_vb / 100;
          }
          param5[4] = 2147483647;
          param5[1] = 2000;
          param5[2] = 2;
          param5[7] = 10;
          var8 = 0;
          param5[11] = 1;
          var9 = 0;
          do {
            if (var9 > 7) {
              if (param3 >= -105) {
                return;
              }
              param5[21] = 1;
              param5[3] = 1;
              param5[30] = 1;
              param5[26] = 1;
              param5[31] = 1;
              param5[27] = 50;
              param5[29] = 1;
              param5[23] = 1;
              param5[20] = 1;
              param5[22] = 1;
              param5[19] = 1;
              param5[24] = 1;
              param5[28] = 1;
              break;
            }
            param5[var9 + 12] = 1;
            var9++;
          } while (var14 == 0);
          var9_ref_mb__ = param0;
          var10 = 0;
          while (true) {
            stackIn_20_0 = var10;
            stackIn_20_1 = var9_ref_mb__.length;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_20_0 < stackIn_20_1) {
              var11 = var9_ref_mb__[var10];
              if (var14 == 0) {
                if (var7 != var11) {
                  var13 = 0;
                  while (32 > var13) {
                    stackIn_20_0 = -4;
                    stackIn_20_1 = ~var13;
                    boolean decompiledFrameRemainder2 = true;
                    if (stackIn_20_0 != stackIn_20_1 &&
                      var13 != 20 &&
                      var13 != 22 &&
                      6 != var13 &&
                      var13 != 5 &&
                      var13 != 25) {
                      var12 = var11.b(true, var13);
                      if (4 == var13) {
                        if (!(param5[var13] <= var12)) {
                          param5[var13] = var12;
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        if (var12 > param5[var13]) {
                          param5[var13] = var12;
                        }
                      }
                    }
                    var13++;
                  }
                  if (null != param1) {
                    param1[var11.field_jc] = param1[var11.field_jc] + var11.field_vb;
                  }
                  if (!var11.field_Hb) {
                    var8++;
                  }
                }
                var10++;
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (null != var7 ||
                var8 != 1 ||
                !(1 < this.field_kb));
              if (decompiledFrameRemainder0) {
                param5[6] = 2;
              }
            }
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder1 = (var14 != 0);
            }
            if (decompiledFrameRemainder1) {
              param5[6] = 1;
            }
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted0 = true;
            L21: {
              boolean decompiledFrameCompleted1 = true;
              if (param1 != null &&
                (param0.length - 1) > param1.length) {
                param5[25] = 1;
                var9 = 0;
                while (var9 < param1.length) {
                  param1[var9] = param1[var9] / 100;
                  stackIn_97_0 = param1[var9];
                  stackIn_97_1 = param5[25];
                  if (var14 != 0) {
                    if (stackIn_97_0 > stackIn_97_1) {
                      stackIn_199_0 = (int[]) (param2);
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_97_0 > stackIn_97_1) {
                    param5[25] = param1[var9];
                  }
                  var9++;
                }
              } else {
                param5[25] = 0;
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var9 = 0;
                while (true) {
                  stackIn_97_0Lifetime1 = param4.length;
                  stackIn_97_1Lifetime1 = var9;
                  if (stackIn_97_0Lifetime1 <= stackIn_97_1Lifetime1) {
                    break;
                  }
                  stackIn_199_0 = (int[]) (param2);
                  if (var14 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_199_0 != null) {
                    param2[var9] = param0[var9].field_vb;
                  }
                  var10 = 0;
                  var11Lifetime1 = param0[var9];
                  if (var11Lifetime1 != var7 ||
                    var14 != 0) {
                    if ((1 << var11Lifetime1.field_Bb & this.field_hb) != 0) {
                      param4[var9] = -1;
                    } else {
                      var13Lifetime1 = 0;
                      while (var13Lifetime1 < 32) {
                        stackIn_97_0Lifetime1Lifetime1 = var13Lifetime1;
                        stackIn_97_1Lifetime1Lifetime1 = 4;
                        boolean decompiledFrameRemainder3 = true;
                        if (stackIn_97_0Lifetime1Lifetime1 == stackIn_97_1Lifetime1Lifetime1) {
                          var12Lifetime1 = var11Lifetime1.b(true, var13Lifetime1);
                          if (var12Lifetime1 == 0 &&
                            var11Lifetime1.field_w > 0 &&
                            var11Lifetime1.field_kb == 0 && (0 != this.field_R ||
                            this.field_lb)) {
                            var10 = var10 | 32;
                          } else {
                            if ((!(this.field_kb <= 1)) &&
                              ((param5[var13Lifetime1] == var12Lifetime1))) {
                              var10 = var10 | 16;
                            }
                          }
                          decompiledFrameRemainder3 = false;
                        }
                        else {
                          if (25 != var13Lifetime1) {
                            if ((var13Lifetime1 != 5)) {
                              var12Lifetime1Lifetime1 = var11Lifetime1.b(true, var13Lifetime1);
                              if ((~param5[var13Lifetime1] == ~var12Lifetime1Lifetime1)) {
                                var10 = var10 | 1 << var13Lifetime1;
                              }
                            }
                            decompiledFrameRemainder3 = false;
                          }
                          else {
                            if (0 < param5[25] &&
                              param1 != null &&
                              param5[var13Lifetime1] == param1[var11Lifetime1.field_jc]) {
                              var10 = var10 | 1 << var13Lifetime1;
                            }
                          }
                        }
                        var13Lifetime1++;
                      }
                      param4[var9] = var10;
                    }
                  }
                  var9++;
                }
              }
            }
            if ((decompiledFrameCompleted2) &&
              (decompiledFrameCompleted0)) {
              if (!this.field_lb) {
                var9 = 0;
                var10 = 0;
                while (true) {
                  if (param4.length > var10) {
                    stackIn_179_0 = 0;
                    stackIn_179_1 = ~param4[var10];
                    if (var14 == 0) {
                      if (stackIn_179_0 != stackIn_179_1 &&
                        0 != (param4[var10] & 32)) {
                        var9++;
                      }
                      var10++;
                      continue;
                    }
                  } else {
                    stackIn_179_0 = ~param4.length;
                    stackIn_179_1 = ~var9;
                  }
                  if (stackIn_179_0 != stackIn_179_1) {
                    if (2 >= param4.length) {
                      break;
                    }
                    if (param4.length > 2 * var9) {
                      break;
                    }
                  }
                  var10 = 0;
                  while (param4.length > var10) {
                    if (var14 != 0) {
                      return;
                    }
                    if (-1 != param4[var10] &&
                      (param4[var10] & 32) != 0) {
                      param4[var10] = ec.a(param4[var10], -33);
                      param4[var10] = vn.a(param4[var10], 16);
                    }
                    var10++;
                  }
                  break;
                }
              }
              stackIn_199_0 = (int[]) (param5);
            }
            stackIn_199_0[5] = param5[4];
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_204_0 = var7_ref;
          stackIn_204_1 = new StringBuilder().append("ee.BB(");
          if (param0 == null) {
            stackIn_205_2 = "null";
          } else {
            stackIn_205_2 = "{...}";
          }
          stackIn_208_1 = ((StringBuilder) (Object) stackIn_204_1).append(stackIn_205_2).append(',');
          if (param1 == null) {
            stackIn_209_2 = "null";
          } else {
            stackIn_209_2 = "{...}";
          }
          stackIn_212_1 = ((StringBuilder) (Object) stackIn_208_1).append(stackIn_209_2).append(',');
          if (param2 == null) {
            stackIn_213_2 = "null";
          } else {
            stackIn_213_2 = "{...}";
          }
          stackIn_216_1 = ((StringBuilder) (Object) stackIn_212_1).append(stackIn_213_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          stackIn_220_1 = ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',');
          if (param5 == null) {
            stackIn_221_2 = "null";
          } else {
            stackIn_221_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_204_0), ((StringBuilder) (Object) stackIn_220_1).append(stackIn_221_2).append(')').toString());
        }
    }

    private final void a(mb param0, int param1, int param2, int param3, mb param4, int param5) {
        je stackIn_19_0 = null;
        je stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        je stackIn_20_0 = null;
        je stackIn_20_1 = null;
        int stackIn_20_3 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        je var7Lifetime1;
        var8 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param4.field_Yb == 0 &&
            param0.field_mc <= 0 &&
            param0.field_S > 0 &&
            Math.abs(param1) < 30000) {
            param4.field_Tb = 10;
            var7 = new je(8, param3, this.field_r + 2);
            var7.field_p = true;
            param4.field_B.a(3, var7);
            var7 = new je(6, param3, 4 + this.field_r);
            var7.field_p = true;
            param4.field_B.a(3, var7);
            var7 = new je(3, 0, this.field_r + 100);
            var7.field_u = param4.field_hc + param3 * 20000;
            var7.field_y = -20000 + param4.field_Gb;
            var7.field_p = true;
            param4.field_B.a(3, var7);
            param4.field_Tb = param4.field_x;
          } else {
            if (0 < param4.field_t) {
              stackIn_19_0 = null;
              stackIn_19_1 = null;
              stackIn_19_2 = 6;
              if (param4.field_hc >> 4 >= param4.field_t) {
                stackIn_20_0 = null;
                stackIn_20_1 = null;
                stackIn_20_3 = -1;
              } else {
                stackIn_20_0 = null;
                stackIn_20_1 = null;
                stackIn_20_3 = 1;
              }
              var7 = new je(stackIn_19_2, stackIn_20_3, 2 + this.field_r);
              var7.field_p = true;
              param4.field_B.a(3, var7);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (Math.abs(param1) >= 15000 && (!(param4.field_Tb < 5) ||
                !(Math.abs(param1) < 30000))) {
                var7 = new je(6, param3, 2 + this.field_r);
                var7.field_p = true;
                param4.field_B.a(3, var7);
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if (decompiledFrameRemainder0) {
                if ((!(Math.abs(param1) < 15000) ||
                  !(Math.abs(param5) < 10000)) &&
                  (decompiledFrameRemainder0 = !(10000 <= Math.abs(param1)))) {
                  var7 = new je(6, -param3, 2 + this.field_r);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if (decompiledFrameRemainder0) {
                  param4.field_Tb = 10;
                  var7 = new je(6, param3, this.field_r + 2);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  var7 = new je(7, param3, 4 + this.field_r);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  var7 = new je(6, -param3, 25 + this.field_r + 4);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  var7 = new je(6, 0, 254 + this.field_r);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  return;
                }
              }
            }
          }
          if (Math.abs(param1) > 50000 &&
            this.a(this.field_z, (byte) -119, 3, param4, param0, 2600, this.field_r + 15)) {
          }
          if (!this.a(this.field_z, (byte) -72, 2, param4, param0, 2600, 15 + this.field_r)) {
            if (param4.field_Tb <= 1) {
              if (80000 < Math.abs(param1) &&
                param4.field_Tb > 0) {
                var7Lifetime1 = new je(3, 0, this.field_r + 30);
                var7Lifetime1.field_u = param4.field_hc + 20000 * param3;
                var7Lifetime1.field_y = -20000 + param4.field_Gb;
                var7Lifetime1.field_p = true;
                param4.field_B.a(3, var7Lifetime1);
                param4.field_Tb = param4.field_x;
              }
            } else {
              if (!this.a(this.field_z, (byte) -67, 1, param4, param0, 1728, 25 + this.field_r) &&
                !this.a(this.field_z, (byte) -49, 0, param4, param0, 4608, 25 + this.field_r)) {
              }
            }
          }
          if (param2 > -127) {
            this.field_O = (ul) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_72_0 = var7_ref;
          stackIn_72_1 = new StringBuilder().append("ee.O(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, mb param2, int param3, mb param4, byte param5) {
        boolean discarded$0 = false;
        je stackIn_18_0 = null;
        je stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        je stackIn_19_0;
        je stackIn_19_1;
        int stackIn_19_3;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        int var8 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        var8 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder1 = true;
          if (param2.field_t <= 0) {
            if (40000 <= Math.abs(param3) &&
              param2.field_U != param1) {
              var7 = new je(6, param1, this.field_r + 2);
              var7.field_p = true;
              param2.field_B.a(3, var7);
              decompiledFrameRemainder1 = (var8 != 0);
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder1 = !(30000 <= Math.abs(param3)))) {
              var7Lifetime2 = new je(6, -param1, 2 + this.field_r);
              var7Lifetime2.field_p = true;
              param2.field_B.a(3, var7Lifetime2);
              decompiledFrameRemainder1 = (var8 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            stackIn_18_0 = null;
            stackIn_18_1 = null;
            stackIn_18_2 = 6;
            if (param2.field_t <= (param2.field_hc >> 4)) {
              stackIn_19_0 = null;
              stackIn_19_1 = null;
              stackIn_19_3 = -1;
            } else {
              stackIn_19_0 = null;
              stackIn_19_1 = null;
              stackIn_19_3 = 1;
            }
            var7Lifetime1 = new je(stackIn_18_2, stackIn_19_3, 2 + this.field_r);
            var7Lifetime1.field_p = true;
            param2.field_B.a(3, var7Lifetime1);
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.a(this.field_z, (byte) -78, 3, param2, param4, 2600, this.field_r + 15) &&
            !this.a(this.field_z, (byte) -64, 2, param2, param4, 2600, 15 + this.field_r)) {
            if (80000 > Math.abs(param3) &&
              param2.field_Tb > 0 &&
              this.a(this.field_z, (byte) -29, 1, param2, param4, 4608, this.field_r + 25)) {
              discarded$0 = this.a(this.field_z, (byte) -98, 0, param2, param4, 2304, this.field_r + 75);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (this.a(this.field_z, (byte) -105, 0, param2, param4, 3072, 50 + this.field_r))) {
            }
          }
          var7_int = 112 % ((param5 + 66) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_44_0 = var7_ref;
          stackIn_44_1 = new StringBuilder().append("ee.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(')').toString());
        }
    }

    final int d(int param0) {
        boolean[] var2 = null;
        int var3 = 0;
        mb var4_ref_mb = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0;
        RuntimeException var2_ref = null;
        var5 = SteelSentinels.field_G;
        try {
          var2 = new boolean[200];
          if (param0 != -3905) {
            stackIn_3_0 = 66;
            return stackIn_3_0;
          }
          var4_ref_mb = (mb) (this.field_K.e(13058));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var4_ref_mb))) {
            var3 = var4_ref_mb.field_Bb - this.field_kb;
            stackIn_17_0 = ~var3;
            if (var5 == 0) {
              if (stackIn_17_0 <= -1 &&
                var2.length > var3) {
                var2[var3] = true;
              }
              var4_ref_mb = (mb) (this.field_K.a((byte) -102));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_17_0 = 0;
          }
          var4 = stackIn_17_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var2.length))) {
            stackOut_19_0 = var2[var4];
            stackIn_28_0 = stackOut_19_0 ? 1 : 0;
            stackIn_20_0 = stackOut_19_0;
            if (var5 == 0) {
              if (!stackIn_20_0) {
                stackIn_25_0 = var4 + this.field_kb;
                return stackIn_25_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_28_0 = -1;
          }
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ee.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, mb param1, mb param2, int param3, int param4) {
        je stackIn_14_0 = null;
        je stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        je stackIn_15_0 = null;
        je stackIn_15_1 = null;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        je var6Lifetime1;
        je var6Lifetime2;
        je var6Lifetime3;
        je var6Lifetime4;
        var7 = SteelSentinels.field_G;
        try {
          if (param2.field_Vb == null &&
            0 < param2.field_Tb) {
            var6 = new je(5, param1.field_Bb, 1 + this.field_r);
            var6.field_p = true;
            param2.field_B.a(3, var6);
          }
          if (param2.field_t > 0) {
            stackIn_14_0 = null;
            stackIn_14_1 = null;
            stackIn_14_2 = 6;
            if (param2.field_t > param2.field_hc >> 4) {
              stackIn_15_0 = null;
              stackIn_15_1 = null;
              stackIn_15_3 = 1;
            } else {
              stackIn_15_0 = null;
              stackIn_15_1 = null;
              stackIn_15_3 = -1;
            }
            var6Lifetime1 = new je(stackIn_14_2, stackIn_15_3, this.field_r + 2);
            var6Lifetime1.field_p = true;
            param2.field_B.a(param3 - 20060, var6Lifetime1);
            if ((var7 != 0) &&
              (Math.abs(param0) > 80000)) {
              var6Lifetime1 = new je(6, param4, 2 + this.field_r);
              var6Lifetime1.field_p = true;
              param2.field_B.a(param3 - 20060, var6Lifetime1);
            }
          } else {
            if (Math.abs(param0) > 80000) {
              var6Lifetime1 = new je(6, param4, 2 + this.field_r);
              var6Lifetime1.field_p = true;
              param2.field_B.a(param3 - 20060, var6Lifetime1);
            }
          }
          if (param3 != 20063) {
            return;
          }
          var6Lifetime2 = new je(0, param2.field_Xb[2], 3 + this.field_r);
          var6Lifetime2.field_B = 13384 * param2.field_E;
          var6Lifetime2.field_p = true;
          var6Lifetime2.field_y = param1.field_Gb;
          var6Lifetime2.field_u = param1.field_hc;
          param2.field_B.a(param3 - 20060, var6Lifetime2);
          if (param2.field_Tb > 0 &&
            param2.field_Gb > param1.field_Gb) {
            if (null == param2.field_Vb) {
              return;
            }
            var6Lifetime3 = new je(0, param2.field_Xb[1], (param1.field_hc + this.field_r + param2.field_hc) % 100 + this.field_r + 29);
            var6Lifetime3.field_u = param1.field_hc;
            var6Lifetime3.field_B = param4 * 15384;
            var6Lifetime3.field_y = param1.field_Gb;
            var6Lifetime3.field_p = true;
            param2.field_B.a(3, var6Lifetime3);
            if (var7 == 0) {
              return;
            }
          }
          if (param2.field_Vb != null) {
            var6Lifetime4 = new je(0, param2.field_Xb[0], (param1.field_hc + (this.field_r + param2.field_hc)) % 100 + 4 + (this.field_r + 50));
            var6Lifetime4.field_B = 16384 * param4;
            var6Lifetime4.field_p = true;
            var6Lifetime4.field_y = param1.field_Gb;
            var6Lifetime4.field_u = param1.field_hc;
            param2.field_B.a(param3 - 20060, var6Lifetime4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("ee.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, mb param1, int param2, int param3, int param4, mb param5) {
        je stackIn_33_0 = null;
        je stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        je stackIn_34_0 = null;
        je stackIn_34_1 = null;
        int stackIn_34_3 = 0;
        je stackIn_65_0 = null;
        je stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        je stackIn_66_0 = null;
        je stackIn_66_1 = null;
        int stackIn_66_3 = 0;
        je stackIn_84_0 = null;
        je stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        je stackIn_85_0 = null;
        je stackIn_85_1 = null;
        int stackIn_85_3 = 0;
        je stackIn_99_0 = null;
        je stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        je stackIn_100_0;
        je stackIn_100_1;
        int stackIn_100_3;
        je stackIn_129_0 = null;
        je stackIn_129_1 = null;
        int stackIn_129_2 = 0;
        je stackIn_130_0 = null;
        je stackIn_130_1 = null;
        int stackIn_130_3 = 0;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        String stackIn_163_2 = null;
        StringBuilder stackIn_166_1 = null;
        String stackIn_167_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        Object var8 = null;
        je var9 = null;
        int var9_int = 0;
        double var10 = 0.0;
        je var10_ref_je = null;
        double var11 = 0.0;
        int var13 = 0;
        je var9Lifetime1;
        je var9Lifetime2;
        je var9Lifetime3;
        je var9Lifetime4;
        je var10_ref_jeLifetime1;
        je var9Lifetime5;
        je var9Lifetime6;
        je var9Lifetime1Lifetime1;
        je var9Lifetime1Lifetime2;
        double var10Lifetime1;
        var13 = SteelSentinels.field_G;
        try {
          var7_int = 0;
          if (param2 != 16384) {
            this.field_d = -12;
          }
          if (param4 < 0) {
            var7_int = (this.field_ab.a(122) << 4) - 128 - param1.field_hc;
          }
          if (param4 >= 0 ||
            var13 != 0) {
            var7_int = -128 + param1.field_hc;
          }
          var8 = null;
          if (0 <= param5.field_W) {
            var8 = this.f(param5.field_W, -127);
            if (var8 == null ||
              ((mb) (var8)).field_Hb) {
              var8 = null;
              param5.field_W = -1;
            }
          }
          if (var8 == null) {
            if (null == param5.field_Vb ||
              !(Math.abs(param0) >= 90000)) {
              if (param5.field_Vb == null) {
                boolean decompiledFrameRemainder1 = true;
                if (param5.field_t > 0) {
                  stackIn_33_0 = null;
                  stackIn_33_1 = null;
                  stackIn_33_2 = 6;
                  if ((param5.field_hc >> 4) >= param5.field_t) {
                    stackIn_34_0 = null;
                    stackIn_34_1 = null;
                    stackIn_34_3 = -1;
                  } else {
                    stackIn_34_0 = null;
                    stackIn_34_1 = null;
                    stackIn_34_3 = 1;
                  }
                  var9 = new je(stackIn_33_2, stackIn_34_3, 2 + this.field_r);
                  var9.field_p = true;
                  param5.field_B.a(param2 ^ 16387, var9);
                  decompiledFrameRemainder1 = (var13 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (!(Math.abs(param0) < 30000) ||
                    var7_int <= 50000) {
                    if (!(Math.abs(param0) <= 60000) ||
                      param5.field_U == 0) {
                      var9 = new je(6, param4, this.field_r + 2);
                      var9.field_p = true;
                      param5.field_B.a(3, var9);
                      if (var13 != 0) {
                        var9 = new je(6, -param4, 2 + this.field_r);
                        var9.field_p = true;
                        param5.field_B.a(3, var9);
                      }
                    }
                  } else {
                    var9 = new je(6, -param4, 2 + this.field_r);
                    var9.field_p = true;
                    param5.field_B.a(3, var9);
                  }
                }
                if (param5.field_Tb >= 1) {
                  var9 = new je(5, param1.field_Bb, 4 + (this.field_r + (param5.field_hc + (param1.field_hc + this.field_r)) % 500));
                  var9.field_p = true;
                  param5.field_B.a(3, var9);
                  if (var13 == 0) {
                    return;
                  }
                }
                if (Math.abs(param0) >= 60000) {
                  return;
                }
                var9 = new je(0, param5.field_Xb[0], (param5.field_hc + param1.field_hc + this.field_r) % 100 + (4 + this.field_r));
                var9.field_y = param1.field_Gb;
                var9.field_u = param1.field_hc;
                var10 = Math.atan2((double)param0, (double)(-param3));
                var9.field_p = true;
                var9.field_B = (int)(var10 * 65536.0 / 6.283185307179586);
                param5.field_B.a(3, var9);
                if (var13 == 0) {
                  return;
                }
              }
              var9_int = -param4;
              if (var7_int < 90000) {
                var9_int = param4;
              }
              boolean decompiledSharedTail0 = !(0 < param5.field_t);
              if (!decompiledSharedTail0) {
                stackIn_65_0 = null;
                stackIn_65_1 = null;
                stackIn_65_2 = 6;
                if (param5.field_t <= param5.field_hc >> 4) {
                  stackIn_66_0 = null;
                  stackIn_66_1 = null;
                  stackIn_66_3 = -1;
                } else {
                  stackIn_66_0 = null;
                  stackIn_66_1 = null;
                  stackIn_66_3 = 1;
                }
                var10_ref_je = new je(stackIn_65_2, stackIn_66_3, 2 + this.field_r);
                var10_ref_je.field_p = true;
                param5.field_B.a(3, var10_ref_je);
                decompiledSharedTail0 = (var13 != 0);
              }
              if ((decompiledSharedTail0) &&
                (~var9_int != ~param5.field_U)) {
                var10_ref_je = new je(6, var9_int, this.field_r + 2);
                var10_ref_je.field_p = true;
                param5.field_B.a(3, var10_ref_je);
              }
              if (Math.abs(param0) < 30000) {
                var10_ref_jeLifetime1 = new je(0, param5.field_Xb[0], (param5.field_hc + (param1.field_hc + this.field_r)) % 100 + 4 + this.field_r);
                var10_ref_jeLifetime1.field_u = param1.field_hc;
                var10_ref_jeLifetime1.field_y = param1.field_Gb;
                var11 = Math.atan2((double)param0, (double)(-param3));
                var10_ref_jeLifetime1.field_p = true;
                var10_ref_jeLifetime1.field_B = (int)(65536.0 * var11 / 6.283185307179586);
                param5.field_B.a(3, var10_ref_jeLifetime1);
              }
              if (var13 == 0) {
                return;
              }
            }
            if (param5.field_t > 0) {
              stackIn_84_0 = null;
              stackIn_84_1 = null;
              stackIn_84_2 = 6;
              if (param5.field_t > (param5.field_hc >> 4)) {
                stackIn_85_0 = null;
                stackIn_85_1 = null;
                stackIn_85_3 = 1;
              } else {
                stackIn_85_0 = null;
                stackIn_85_1 = null;
                stackIn_85_3 = -1;
              }
              var9Lifetime5 = new je(stackIn_84_2, stackIn_85_3, this.field_r + 2);
              if (var13 != 0) {
                var9Lifetime5 = new je(6, param4, this.field_r + 2);
              }
            } else {
              var9Lifetime5 = new je(6, param4, this.field_r + 2);
            }
            var9Lifetime5.field_p = true;
            param5.field_B.a(3, var9Lifetime5);
            var9Lifetime6 = new je(0, param5.field_Xb[1], 4 + this.field_r + (this.field_r + param1.field_hc + param5.field_hc) % 500);
            var9Lifetime6.field_p = true;
            var9Lifetime6.field_u = param4 * 25000 + param5.field_hc;
            var9Lifetime6.field_y = -25000 + param5.field_Gb;
            var9Lifetime6.field_B = param4 * 4096;
            param5.field_B.a(param2 - 16381, var9Lifetime6);
            if (var13 == 0) {
              return;
            }
          }
          if (param5 == var8) {
            if (param5.field_t > 0) {
              stackIn_99_0 = null;
              stackIn_99_1 = null;
              stackIn_99_2 = 6;
              if (param5.field_t <= (param5.field_hc >> 4)) {
                stackIn_100_0 = null;
                stackIn_100_1 = null;
                stackIn_100_3 = -1;
              } else {
                stackIn_100_0 = null;
                stackIn_100_1 = null;
                stackIn_100_3 = 1;
              }
              var9Lifetime1 = new je(stackIn_99_2, stackIn_100_3, this.field_r + 2);
              var9Lifetime1.field_p = true;
              param5.field_B.a(param2 ^ 16387, var9Lifetime1);
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != param5.field_Vb &&
              Math.abs(param0) >= 90000) {
              if (param5.field_t == 0) {
                var9Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
                var9Lifetime1Lifetime1.field_p = true;
                param5.field_B.a(3, var9Lifetime1Lifetime1);
              }
              var9Lifetime1Lifetime1 = new je(0, param5.field_Xb[1], (param1.field_hc + this.field_r + param5.field_hc) % 500 + (4 + this.field_r));
              var9Lifetime1Lifetime1.field_u = param4 * 25000 + param5.field_hc;
              var9Lifetime1Lifetime1.field_p = true;
              var9Lifetime1Lifetime1.field_y = -25000 + param5.field_Gb;
              var9Lifetime1Lifetime1.field_B = param4 * 4096;
              param5.field_B.a(3, var9Lifetime1Lifetime1);
              decompiledFrameRemainder0 = (var13 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (param5.field_t <= 0)) {
              if (120000 >= Math.abs(param0)) {
                if (!(Math.abs(param0) >= 60000) ||
                  param5.field_U == 0) {
                  stackIn_129_0 = null;
                  stackIn_129_1 = null;
                  stackIn_129_2 = 6;
                  if (120000 > var7_int) {
                    stackIn_130_0 = null;
                    stackIn_130_1 = null;
                    stackIn_130_3 = param4;
                  } else {
                    stackIn_130_0 = null;
                    stackIn_130_1 = null;
                    stackIn_130_3 = -param4;
                  }
                  var9Lifetime1Lifetime1 = new je(stackIn_129_2, stackIn_130_3, 2 + this.field_r);
                  var9Lifetime1Lifetime1.field_p = true;
                  param5.field_B.a(3, var9Lifetime1Lifetime1);
                  if (var13 != 0) {
                    var9Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
                    var9Lifetime1Lifetime1.field_p = true;
                    param5.field_B.a(3, var9Lifetime1Lifetime1);
                  }
                }
              } else {
                var9Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
                var9Lifetime1Lifetime1.field_p = true;
                param5.field_B.a(3, var9Lifetime1Lifetime1);
              }
            }
            if (param5.field_Tb < 1) {
              return;
            }
            if (null != param5.field_Vb) {
              return;
            }
            var9Lifetime1Lifetime2 = new je(5, param1.field_Bb, this.field_r + 4 + (param5.field_hc + (this.field_r + param1.field_hc)) % 500);
            var9Lifetime1Lifetime2.field_p = true;
            param5.field_B.a(3, var9Lifetime1Lifetime2);
            if (var13 == 0) {
              return;
            }
          }
          if (param5.field_hc >= param5.field_C + ((mb) (var8)).field_hc - 1000) {
            if (param5.field_hc <= (param5.field_C + ((mb) (var8)).field_hc + 1000)) {
              if (~((mb) (var8)).field_U != ~param5.field_U) {
                var9Lifetime2 = new je(6, ((mb) (var8)).field_U, 2 + this.field_r);
                var9Lifetime2.field_p = true;
                param5.field_B.a(param2 - 16381, var9Lifetime2);
                if (var13 != 0) {
                  var9Lifetime2 = new je(6, -1, 2 + this.field_r);
                  var9Lifetime2.field_p = true;
                  param5.field_B.a(3, var9Lifetime2);
                  var9Lifetime2 = new je(6, 1, this.field_r + 2);
                  var9Lifetime2.field_p = true;
                  param5.field_B.a(3, var9Lifetime2);
                }
              }
            } else {
              var9Lifetime2 = new je(6, -1, 2 + this.field_r);
              var9Lifetime2.field_p = true;
              param5.field_B.a(3, var9Lifetime2);
              if (var13 != 0) {
                var9Lifetime2 = new je(6, 1, this.field_r + 2);
                var9Lifetime2.field_p = true;
                param5.field_B.a(3, var9Lifetime2);
              }
            }
          } else {
            var9Lifetime2 = new je(6, 1, this.field_r + 2);
            var9Lifetime2.field_p = true;
            param5.field_B.a(3, var9Lifetime2);
          }
          param5.field_Vb = ((mb) (var8)).field_Vb;
          param5.field_ec = ((mb) (var8)).field_ec;
          if (param5.field_Vb != null &&
            Math.abs(param0) >= 90000) {
            var9Lifetime3 = new je(0, param5.field_Xb[1], 4 + (this.field_r + (param5.field_hc + this.field_r + param1.field_hc) % 500));
            var9Lifetime3.field_y = -25000 + param5.field_Gb;
            var9Lifetime3.field_u = param5.field_hc + param4 * 25000;
            var9Lifetime3.field_B = 4096 * param4;
            var9Lifetime3.field_p = true;
            param5.field_B.a(3, var9Lifetime3);
          }
          if (10000 > Math.abs(param0)) {
            var9Lifetime4 = new je(0, param5.field_Xb[0], (param1.field_hc + (this.field_r + param5.field_hc)) % 100 + (4 + this.field_r));
            var9Lifetime4.field_y = param1.field_Gb;
            var9Lifetime4.field_u = param1.field_hc;
            var10Lifetime1 = Math.atan2((double)param0, (double)(-param3));
            var9Lifetime4.field_B = (int)(var10Lifetime1 * 65536.0 / 6.283185307179586);
            var9Lifetime4.field_p = true;
            param5.field_B.a(3, var9Lifetime4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_162_0 = var7;
          stackIn_162_1 = new StringBuilder().append("ee.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_163_2 = "null";
          } else {
            stackIn_163_2 = "{...}";
          }
          stackIn_166_1 = ((StringBuilder) (Object) stackIn_162_1).append(stackIn_163_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_167_2 = "null";
          } else {
            stackIn_167_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_162_0), ((StringBuilder) (Object) stackIn_166_1).append(stackIn_167_2).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (qj.field_q != null &&
            qj.field_q[param1] != null) {
            fl.a((byte) 28, qj.field_q[param1], cm.field_e[param1]);
          }
          if (param0 != -2483) {
            ee.a((String) null, (String) null, (String) null, -92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 74) {
            field_x = (String) null;
          }
          stackIn_4_0 = na.a(wl.d((byte) -21), 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ee.KA(" + param0 + ')');
        }
    }

    private final int[] a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int[] stackIn_16_0 = null;
        int[] stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        int var9_int = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var7_doubleLifetime1;
        var20 = SteelSentinels.field_G;
        try {
          if (0 == param3) {
            var7_double = Math.atan2((double)param2, (double)(-param5));
            var9_int = (int)(65536.0 * var7_double / 6.283185307179586);
            if (0 > param0) {
              if (var9_int > 16384) {
                var9_int = var9_int - 65536;
                if (var20 != 0 &&
                  var9_int < -16384) {
                  var9_int = var9_int + 65536;
                }
              }
            } else {
              if (var9_int < -16384) {
                var9_int = var9_int + 65536;
              }
            }
            stackIn_16_0 = new int[]{var9_int, var9_int};
            return stackIn_16_0;
          }
          var7_doubleLifetime1 = 0.0;
          var9 = 0.0;
          var11 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4) - (double)param5;
          var13 = (double)param2;
          if (param1 > -72) {
            this.f(-42, -3);
          }
          var15 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4);
          if (var13 * var13 - var15 * (4.0 * var11) > 0.0 && (0.0 != var11 ||
            param4 != 0)) {
            var7_doubleLifetime1 = Math.atan2(Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13, 2.0 * var11);
            var9 = Math.atan2(-Math.sqrt(var13 * var13 - var15 * (var11 * 4.0)) + -var13, 2.0 * var11);
          }
          var17 = 0;
          var18 = 0;
          var17 = (int)(var7_doubleLifetime1 * 65536.0 / 6.283185307179586);
          if (var17 != 0) {
            var17 = var17 + (16 * (this.field_r & 31) - 256);
          }
          var18 = (int)(var9 * 65536.0 / 6.283185307179586);
          if (var17 < -32768) {
            var17 = var17 + 65536;
          }
          if (var18 != 0) {
            var18 = var18 + (-256 + (31 & this.field_r) * 16);
          }
          if (var18 < -32768) {
            var18 = var18 + 65536;
          }
          if (32768 < var17) {
            var17 = var17 - 65536;
          }
          if (var18 > 32768) {
            var18 = var18 - 65536;
          }
          if (0 <= param0) {
            if (var18 < 0) {
              var18 = -var18;
            }
            if (var17 < 0) {
              var17 = -var17;
              if (var20 != 0) {
                if (0 < var18) {
                  var18 = -var18;
                }
                if (0 < var17) {
                  var17 = -var17;
                }
              }
            }
          } else {
            if (0 < var18) {
              var18 = -var18;
            }
            if (0 < var17) {
              var17 = -var17;
            }
          }
          if (var17 * param0 > var18 * param0) {
            var19 = var18;
            var18 = var17;
            var17 = var19;
          }
          stackIn_60_0 = new int[]{var17, var18};
          return stackIn_60_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var7), "ee.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, mb param1, int param2, mb param3, int param4, int param5) {
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        je var7Lifetime3;
        je var7Lifetime4;
        double var8Lifetime1;
        var10 = SteelSentinels.field_G;
        try {
          if (null == param1.field_Vb &&
            0 < param1.field_Tb) {
            var7 = new je(5, param3.field_Bb, 1 + this.field_r);
            var7.field_p = true;
            param1.field_B.a(3, var7);
          }
          if ((param1.field_Lb ||
            !(param1.field_Tb < 5)) && param1.field_Tb >= 1) {
            if (Math.abs(param2) <= 50000) {
              var7Lifetime1 = new je(3, 0, 5 + ((param1.field_hc + (this.field_r + param3.field_hc)) % 100 + this.field_r + 4));
              var7Lifetime1.field_y = -20000 + param1.field_Gb;
              var7Lifetime1.field_u = -(param4 * 20000) + param1.field_hc;
              var7Lifetime1.field_p = true;
              param1.field_B.a(param5 ^ 14435, var7Lifetime1);
              if (var10 != 0) {
                var7Lifetime1 = new je(3, 0, 4 + (this.field_r + ((param3.field_hc + this.field_r + param1.field_hc) % 100 + 50)));
                var7Lifetime1.field_u = param3.field_hc;
                if (var7Lifetime1.field_u > param1.field_hc + 10000) {
                  var7Lifetime1.field_u = param1.field_hc + 10000;
                }
                var7Lifetime1.field_p = true;
                var7Lifetime1.field_y = -20000 + param1.field_Gb;
                if ((param1.field_hc - 10000) > var7Lifetime1.field_u) {
                  var7Lifetime1.field_u = param1.field_hc - 10000;
                }
                param1.field_B.a(3, var7Lifetime1);
              }
            } else {
              var7Lifetime1 = new je(3, 0, 4 + (this.field_r + ((param3.field_hc + this.field_r + param1.field_hc) % 100 + 50)));
              var7Lifetime1.field_u = param3.field_hc;
              if (var7Lifetime1.field_u > param1.field_hc + 10000) {
                var7Lifetime1.field_u = param1.field_hc + 10000;
              }
              var7Lifetime1.field_p = true;
              var7Lifetime1.field_y = -20000 + param1.field_Gb;
              if ((param1.field_hc - 10000) > var7Lifetime1.field_u) {
                var7Lifetime1.field_u = param1.field_hc - 10000;
              }
              param1.field_B.a(3, var7Lifetime1);
            }
          }
          if (param5 != 14432) {
            this.field_db = (ul) null;
          }
          if (Math.abs(param2) <= 50000 &&
            Math.abs(param0) <= 30000 ||
            !(param1.field_Tb >= 1)) {
            if (param1.i(30, -27)) {
              return;
            }
            var7Lifetime2 = new je(0, 0, 4 + (this.field_r + (param3.field_hc + this.field_r + param1.field_hc) % 100 + 60));
            var7Lifetime2.field_y = param3.field_Gb;
            var7Lifetime2.field_u = param3.field_hc;
            var8 = Math.atan2((double)param2, (double)(-param0));
            var7Lifetime2.field_B = (int)(var8 * 65536.0 / 6.283185307179586);
            if (0 > param4) {
              if (!(var7Lifetime2.field_B <= 16384)) {
                var7Lifetime2.field_B = var7Lifetime2.field_B - 65536;
                if ((var10 != 0) &&
                  (var7Lifetime2.field_B < -16384)) {
                  var7Lifetime2.field_B = var7Lifetime2.field_B + 65536;
                }
              }
            } else {
              if (var7Lifetime2.field_B < -16384) {
                var7Lifetime2.field_B = var7Lifetime2.field_B + 65536;
              }
            }
            var7Lifetime2.field_p = true;
            param1.field_B.a(3, var7Lifetime2);
            if (var10 == 0) {
              return;
            }
          }
          var7Lifetime3 = new je(0, 8, 60 + (param3.field_hc + this.field_r + param1.field_hc) % 100 + this.field_r + 4);
          var7Lifetime3.field_y = param3.field_Gb;
          var7Lifetime3.field_u = param3.field_hc;
          var8Lifetime1 = Math.atan2((double)param2, (double)(-param0));
          var7Lifetime3.field_B = (int)(var8Lifetime1 * 65536.0 / 6.283185307179586);
          if (param4 < 0) {
            if (!(16384 >= var7Lifetime3.field_B)) {
              var7Lifetime3.field_B = var7Lifetime3.field_B - 65536;
              if ((var10 != 0) &&
                (-16384 > var7Lifetime3.field_B)) {
                var7Lifetime3.field_B = var7Lifetime3.field_B + 65536;
              }
            }
          } else {
            if (-16384 > var7Lifetime3.field_B) {
              var7Lifetime3.field_B = var7Lifetime3.field_B + 65536;
            }
          }
          var7Lifetime3.field_p = true;
          param1.field_B.a(param5 - 14429, var7Lifetime3);
          var7Lifetime4 = new je(3, 0, 5 + (4 + this.field_r) + (param1.field_hc + (param3.field_hc + this.field_r)) % 100);
          var7Lifetime4.field_y = param1.field_Gb - 20000;
          var7Lifetime4.field_u = 5000 * param4 + param1.field_hc;
          var7Lifetime4.field_p = true;
          param1.field_Ec.a(3, var7Lifetime4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_73_0 = var7_ref;
          stackIn_73_1 = new StringBuilder().append("ee.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean b(boolean param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a((int[]) null, (byte) 42);
          }
          stackIn_7_0 = (this.field_ab.b((byte) 125, param1) != this.field_ab.a((byte) -100, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2, mb param3, mb param4, int param5, int param6) {
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_125_0 = 0;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        String stackIn_168_2 = null;
        StringBuilder stackIn_171_1 = null;
        String stackIn_172_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_108_0;
        je var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        long[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        nk var15 = null;
        int var16 = 0;
        int var17 = 0;
        long var18 = 0L;
        bh var20 = null;
        int var21 = 0;
        int var22 = 0;
        wl var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var17Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        var30 = SteelSentinels.field_G;
        try {
          if ((11 == param3.field_Nb ||
            di.field_g == 10 &&
            ge.field_j == 1 &&
            !(ol.field_Ub > 2)) && 0 < param3.field_Mb[param2]) {
            return false;
          }
          var8 = new je(0, param3.field_Xb[param2], param6);
          var8.field_y = param4.field_Gb;
          var8.field_u = param4.field_hc;
          stackIn_22_0 = (param4.field_hc <= param3.field_hc) ? -1 : 1;
          var9 = stackIn_22_0;
          if (!param3.field_u &&
            !param4.field_u) {
            stackIn_29_0 = 0;
          } else {
            stackIn_29_0 = 1;
          }
          var10 = stackIn_29_0;
          if ((param3.field_Bb & 1) * 256 + (256 & this.field_r + 15 * param3.field_Bb) == 0) {
            stackIn_36_0 = (var10 != 0) ? 0 : 1;
            var10 = stackIn_36_0;
          }
          var11 = this.a(var9, (byte) -88, param4.field_hc - param3.field_hc, param0, param5, -param3.field_Gb + param4.field_Gb);
          if (param3.field_Xb[param2] == 6) {
            var10 = 1;
          }
          var12 = new long[]{0L, 0L};
          var13 = 0;
          var14 = param3.field_gb.length;
          if (param3.field_Lb &&
            !param3.i(31, -27)) {
            stackIn_46_0 = 0;
          } else {
            stackIn_46_0 = 1;
          }
          var16 = stackIn_46_0;
          var17 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var14 <= var17))) {
            var15 = param3.field_gb[var17];
            stackIn_85_0 = ~ja.a(var15.field_N, false);
            if (var30 == 0) {
              if (stackIn_85_0 == ~var8.field_A &&
                var15.field_C <= 0) {
                if (Math.abs(var11[0]) >= var15.field_K &&
                  Math.abs(var11[0]) <= var15.field_W && (var16 != 0 ||
                  !bi.b(105, var15.field_N))) {
                  var12[0] = mc.a(var12[0], 1L << var17);
                }
                if (Math.abs(var11[1]) >= var15.field_K &&
                  Math.abs(var11[1]) <= var15.field_W && (var16 != 0 ||
                  !bi.b(-75, var15.field_N))) {
                  var12[1] = mc.a(var12[1], 1L << var17);
                }
                var13 = var15.field_N;
              }
              var17++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_85_0 = var10;
          }
          stackIn_89_0 = (stackIn_85_0 != 0) ? 1 : 0;
          var17Lifetime1 = stackIn_89_0;
          var18 = var12[var17Lifetime1];
          if (param1 >= -16) {
            this.field_J = (ra) null;
          }
          var8.field_B = var11[var17Lifetime1];
          if (var18 == 0L ||
            var8.field_B == 0) {
            var17Lifetime1 = -var17Lifetime1 + 1;
            var8.field_B = var11[var17Lifetime1];
            var18 = var12[var17Lifetime1];
          }
          if (var18 != 0L &&
            var8.field_B != 0) {
            var20 = new bh(param3);
            var20.field_b = var9;
            var21 = param3.field_hc;
            var22 = -(param3.field_Db << 3) + param3.field_Gb;
            var23 = var20.a(var13, (byte) 121, var8.field_u, var8.field_B, var22, var21, var8.field_y);
            var23.field_I = true;
            if (null != var23) {
              var24 = 0;
              var25 = 0;
              var28 = 0;
              var29 = 0;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var29 < 50) {
                  stackOut_108_0 = var23.field_T;
                  stackIn_125_0 = stackOut_108_0 ? 1 : 0;
                  stackIn_109_0 = stackOut_108_0;
                  decompiledFrameRemainder0 = (var30 == 0);
                  if ((decompiledFrameRemainder0) &&
                    (!stackIn_109_0)) {
                    var23.i(-1);
                    var26 = Math.abs(var23.field_U - param4.field_hc) >> 4;
                    var27 = Math.abs(var23.field_A - param4.field_Gb) >> 4;
                    var24Lifetime1 = var27 * var27 + var26 * var26;
                    var26Lifetime1 = Math.abs(-var20.field_g + var23.field_U) >> 4;
                    if (var24Lifetime1 < 0) {
                      var24Lifetime1 = 2147483647;
                    }
                    var27Lifetime1 = Math.abs(-var20.field_q + var23.field_A) >> 4;
                    var25Lifetime1 = var26Lifetime1 * var26Lifetime1 + var27Lifetime1 * var27Lifetime1;
                    if (var25Lifetime1 < 0 ||
                      var24Lifetime1 < var25Lifetime1) {
                      var28 = 1;
                    } else {
                      var29++;
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_125_0 = var28;
                }
                if (stackIn_125_0 != 0) {
                  break;
                }
                if (var29 >= 50) {
                  break;
                }
                return false;
              }
            }
            if (var18 > 0L) {
              if (param3.field_Xb[param2] != 13 &&
                11 != param3.field_Xb[param2] &&
                param3.field_Xb[param2] != 12 &&
                param3.field_Xb[param2] != 15 &&
                param3.field_Xb[param2] != 17 &&
                18 != param3.field_Xb[param2] &&
                14 != param3.field_Xb[param2] &&
                param3.field_Xb[param2] != 16) {
                param3.field_Mb[param2] = param3.field_Mb[param2] + (-var8.field_x + var8.field_r);
              }
              var8.field_p = true;
              param3.field_B.a(3, var8);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_167_0 = var8_ref;
          stackIn_167_1 = new StringBuilder().append("ee.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_168_2 = "null";
          } else {
            stackIn_168_2 = "{...}";
          }
          stackIn_171_1 = ((StringBuilder) (Object) stackIn_167_1).append(stackIn_168_2).append(',');
          if (param4 == null) {
            stackIn_172_2 = "null";
          } else {
            stackIn_172_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_167_0), ((StringBuilder) (Object) stackIn_171_1).append(stackIn_172_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == this.field_kb) {
            return;
          }
          this.field_j = true;
          if (param1 > -106) {
            return;
          }
          this.field_E = param0;
          if (0 <= this.field_A) {
            this.i(-22017);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("ee.PA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String d(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 > param1) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (param0 != -1661904765) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (param1 < this.field_kb) {
            stackIn_8_0 = this.field_bb[param1];
            return stackIn_8_0;
          }
          if (this.field_Q <= (param1 - this.field_kb)) {
            stackIn_13_0 = dc.field_a;
            return stackIn_13_0;
          }
          stackIn_11_0 = re.field_W + (-this.field_kb + param1 + 1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.B(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, mb param2, int param3, mb param4, int param5) {
        int stackIn_34_0 = 0;
        int stackIn_38_1 = 0;
        je stackIn_48_0 = null;
        je stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        je stackIn_49_0;
        je stackIn_49_1;
        int stackIn_49_3;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        var8 = SteelSentinels.field_G;
        try {
          if (param0 >= -103) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4.field_t <= 0) {
            boolean decompiledFrameRemainder1 = true;
            if (!(40000 <= Math.abs(param3)) ||
              !(Math.abs(param3) < 50000) ||
              !(param4.field_Tb > 0)) {
              if (Math.abs(param3) >= 10000 && (!param2.field_Lb ||
                !(Math.abs(param3) < 40000))) {
                var7 = new je(6, param5, 2 + this.field_r);
                var7.field_p = true;
                param4.field_B.a(3, var7);
                decompiledFrameRemainder0 = (var8 != 0);
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
              if ((decompiledFrameRemainder1) && ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(10000 <= Math.abs(param3))) &&
                (decompiledFrameRemainder0 = !(param2.field_Lb)))) {
                stackIn_34_0 = (param2.field_u) ? 0 : 1;
                if (param4.field_u) {
                  stackIn_38_1 = 0;
                } else {
                  stackIn_38_1 = 1;
                }
                decompiledFrameRemainder0 = (stackIn_34_0 == stackIn_38_1);
                if (decompiledFrameRemainder0) {
                  param4.field_Tb = param4.field_Tb + 2;
                  var7 = new je(6, param5, this.field_r + 2);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  var7 = new je(7, param5, this.field_r + 4);
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  var7 = new je(6, param5, 25 + (this.field_r + 4));
                  var7.field_p = true;
                  param4.field_B.a(3, var7);
                  return;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var7Lifetime2 = new je(3, 0, this.field_r + 15);
              var7Lifetime2.field_p = true;
              var7Lifetime2.field_y = param4.field_Gb - 20000;
              var7Lifetime2.field_u = -(20000 * param5) + param4.field_hc;
              param4.field_B.a(3, var7Lifetime2);
              decompiledFrameRemainder0 = (var8 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_48_0 = null;
            stackIn_48_1 = null;
            stackIn_48_2 = 6;
            if (param4.field_t > (param4.field_hc >> 4)) {
              stackIn_49_0 = null;
              stackIn_49_1 = null;
              stackIn_49_3 = 1;
            } else {
              stackIn_49_0 = null;
              stackIn_49_1 = null;
              stackIn_49_3 = -1;
            }
            var7Lifetime1 = new je(stackIn_48_2, stackIn_49_3, 2 + this.field_r);
            var7Lifetime1.field_p = true;
            param4.field_B.a(3, var7Lifetime1);
          }
          if (!this.a(this.field_z, (byte) -73, 3, param4, param2, 2600, this.field_r + 15)) {
            if (param4.field_Tb > 0 &&
              param2.field_S > 50) {
              if (this.a(this.field_z * 4, (byte) -63, 2, param4, param2, 8448, 25 + this.field_r)) {
                return;
              }
              if (!this.a(this.field_z, (byte) -114, 1, param4, param2, 3072, 50 + this.field_r)) {
                return;
              }
              return;
            }
            if (!this.a(this.field_z, (byte) -57, 1, param4, param2, 3072, 50 + this.field_r) &&
              param4.field_Tb > 0 &&
              !this.a(this.field_z, (byte) -24, 2, param4, param2, 8448, 25 + this.field_r)) {
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_76_0 = var7_ref;
          stackIn_76_1 = new StringBuilder().append("ee.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param5).append(')').toString());
        }
    }

    final mb f(int param0, int param1) {
        boolean discarded$1 = false;
        jc var3 = null;
        RuntimeException var3_ref = null;
        mb var4 = null;
        int var5 = 0;
        mb stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          if (param1 >= -126) {
            discarded$1 = this.a(-73, false);
          }
          var3 = new jc(this.field_K);
          var4 = (mb) (var3.b(2));
          while (var4 != null) {
            if (~var4.field_Bb == ~param0) {
              stackIn_10_0 = var4;
              return stackIn_10_0;
            }
            var4 = (mb) (var3.d(2));
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_13_0 = null;
          return (mb) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ee.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        var6 = SteelSentinels.field_G;
        var4_int = -125 % ((param3 - 51) / 32);
        var5 = param1.indexOf(param0);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5 == -1))) {
          param1 = param1.substring(0, var5) + param2 + param1.substring(param0.length() + var5);
          stackIn_5_0 = (String) (param1);
          if (var6 == 0) {
            var5 = ((String) (Object) stackIn_5_0).indexOf(param0, var5 + param2.length());
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_5_0 = (String) (param1);
        }
        return stackIn_5_0;
    }

    private final void a(mb param0, int param1, int param2, mb param3, int param4, int param5) {
        je stackIn_10_0 = null;
        je stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        je stackIn_11_0 = null;
        je stackIn_11_1 = null;
        int stackIn_11_3 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        double var8_double = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        je var7Lifetime1Lifetime1;
        var12 = SteelSentinels.field_G;
        try {
          if (param4 != 0) {
            this.i(-54);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0.field_t > 0) {
            stackIn_10_0 = null;
            stackIn_10_1 = null;
            stackIn_10_2 = 6;
            if (param0.field_hc >> 4 < param0.field_t) {
              stackIn_11_0 = null;
              stackIn_11_1 = null;
              stackIn_11_3 = 1;
            } else {
              stackIn_11_0 = null;
              stackIn_11_1 = null;
              stackIn_11_3 = -1;
            }
            var7 = new je(stackIn_10_2, stackIn_11_3, this.field_r + 2);
            var7.field_p = true;
            param0.field_B.a(3, var7);
            decompiledFrameRemainder0 = (var12 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (Math.abs(param5) > 80000) {
              var7Lifetime2 = new je(6, param1, 2 + this.field_r);
              var7Lifetime2.field_p = true;
              param0.field_B.a(3, var7Lifetime2);
              if ((var12 != 0) &&
                (Math.abs(param5) < 30000)) {
                var7Lifetime2 = new je(6, -param1, 2 + this.field_r);
                var7Lifetime2.field_p = true;
                param0.field_B.a(3, var7Lifetime2);
              }
            } else {
              if (Math.abs(param5) < 30000) {
                var7Lifetime2 = new je(6, -param1, 2 + this.field_r);
                var7Lifetime2.field_p = true;
                param0.field_B.a(3, var7Lifetime2);
              }
            }
          }
          if (60000 > Math.abs(param5)) {
            if (param0.field_Xb[0] != 9) {
              var7Lifetime1 = new je(0, param0.field_Xb[0], (param0.field_hc + (param3.field_hc + this.field_r)) % 100 + this.field_r + 4);
              var7Lifetime1.field_y = param3.field_Gb;
              var7Lifetime1.field_u = param3.field_hc;
              var8_double = Math.atan2((double)param5, (double)(-param2));
              var7Lifetime1.field_B = (int)(var8_double * 65536.0 / 6.283185307179586);
              var7Lifetime1.field_p = true;
              if (param1 >= 0) {
                if (!(var7Lifetime1.field_B >= -16384)) {
                  var7Lifetime1.field_B = var7Lifetime1.field_B + 65536;
                  if ((var12 != 0) &&
                    (16384 < var7Lifetime1.field_B)) {
                    var7Lifetime1.field_B = var7Lifetime1.field_B - 65536;
                  }
                }
              } else {
                if (16384 < var7Lifetime1.field_B) {
                  var7Lifetime1.field_B = var7Lifetime1.field_B - 65536;
                }
              }
              param0.field_B.a(param4 ^ 3, var7Lifetime1);
              if (var12 == 0) {
                return;
              }
            }
            var7Lifetime1Lifetime1 = new je(0, param0.field_Xb[0], this.field_r - (-4 - (param3.field_hc + (this.field_r + param0.field_hc)) % 100));
            var7Lifetime1Lifetime1.field_u = param3.field_hc;
            var7Lifetime1Lifetime1.field_y = param3.field_Gb;
            var8 = 900;
            var9 = this.field_z;
            var10 = 0;
            var11 = 10922;
            this.a(param1, param2, param5, var8, var10, var7Lifetime1Lifetime1, var9, var11, -1);
            var7Lifetime1Lifetime1.field_p = true;
            param0.field_B.a(3, var7Lifetime1Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_44_0 = var7_ref;
          stackIn_44_1 = new StringBuilder().append("ee.H(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0) {
        int stackIn_66_0 = 0;
        boolean stackIn_103_0 = false;
        int stackIn_119_0 = 0;
        boolean stackIn_163_0 = false;
        int stackIn_180_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_102_0;
        boolean stackOut_162_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        mb var4_ref_mb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mb var7_ref_mb = null;
        wl var8 = null;
        jb var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        mb var7_ref_mbLifetime1;
        wl var8Lifetime1;
        jb var9Lifetime1;
        int[] var11Lifetime1;
        int[] var13Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var2_intLifetime2;
        int var7Lifetime2;
        int var7Lifetime1Lifetime1;
        var15 = SteelSentinels.field_G;
        try {
          if (this.field_R == 0 &&
            (this.field_v & 48) != 0) {
            this.field_R = 1;
          }
          if (param0 != -27309) {
            return;
          }
          if (this.field_R > 0) {
            if (this.field_R % 1000 != 0) {
              if (this.field_R % 1000 != 500) {
                return;
              }
              var2_int = 1;
              if ((1 << var2_int + 4 & this.field_v) == 0) {
                if ((1 << 5 - var2_int & this.field_v) == 0) {
                  this.a(var2_int, (byte) 8, (mb) null);
                  if (var15 != 0) {
                    this.a(1, var2_int);
                  }
                } else {
                  this.a(1, var2_int);
                }
              }
              if (var15 == 0) {
                return;
              }
            }
            var2_intLifetime2 = 0;
            if ((this.field_v & 1 << 4 + var2_intLifetime2) == 0) {
              if ((1 << -var2_intLifetime2 + 1 + 4 & this.field_v) == 0) {
                this.a(var2_intLifetime2, (byte) 100, (mb) null);
                if (var15 != 0) {
                  this.a(1, var2_intLifetime2);
                }
              } else {
                this.a(1, var2_intLifetime2);
              }
            }
            if (var15 == 0) {
              return;
            }
          }
          if (this.field_R == 0) {
            var2_intLifetime1 = -this.field_ab.field_o[1] + this.field_ab.field_o[0];
            if (kc.field_x[4][0].field_z << 5 > var2_intLifetime1) {
              var3 = 0;
              var4_ref_mb = (mb) (this.field_K.e(13058));
              while (true) {
                if (null != var4_ref_mb) {
                  stackIn_66_0 = var4_ref_mb.field_jc;
                  if (var15 == 0) {
                    if (stackIn_66_0 == 0 &&
                      var4_ref_mb.field_vb > 0) {
                      var3 = var3 + var4_ref_mb.field_vb;
                    }
                    if (var4_ref_mb.field_jc == 1 &&
                      0 < var4_ref_mb.field_vb) {
                      var3 = var3 - var4_ref_mb.field_vb;
                    }
                    var4_ref_mb = (mb) (this.field_K.a((byte) -42));
                    continue;
                  }
                } else {
                  stackIn_66_0 = -1;
                }
                break;
              }
              var4 = stackIn_66_0;
              this.field_R = 1;
              if (var3 > 0) {
                var4 = 0;
              }
              if (var3 <= 0 ||
                var15 != 0) {
                var4 = 1;
              }
              if (1 == var4) {
                this.field_R = 501;
              }
              if (var4 != -1 &&
                0 == (this.field_v & 1 << 4 + var4)) {
                this.a(var4, (byte) -95, (mb) null);
              }
              if (var15 == 0) {
                return;
              }
            }
            if ((3 & this.field_r) == 0) {
              var3Lifetime1 = this.field_ab.field_o[0];
              var4Lifetime1 = kc.field_x[4][0].field_z << 4;
              var5 = -(var4Lifetime1 / 2) + var3Lifetime1;
              var6 = var3Lifetime1 + var4Lifetime1 / 2;
              var7 = var5;
              L21: while (true) {
                if (var7 < var6) {
                  this.field_ab.field_m[var7] = this.field_ab.field_m[var7 + 1];
                  this.field_ab.field_e[var7] = this.field_ab.field_e[1 + var7];
                  this.field_ab.field_f[var7] = this.field_ab.field_f[var7 + 1];
                  var7++;
                  if (var15 == 0) {
                    continue;
                  }
                } else {
                  if (4 == this.field_r) {
                    var7 = var6;
                    while (var7 < this.field_ab.field_m.length) {
                      this.field_ab.field_m[var7] = 0;
                      this.field_ab.field_e[var7] = 0;
                      this.field_ab.field_f[var7] = 0;
                      var7++;
                      if (var15 != 0) {
                        break L21;
                      }
                    }
                    if (var15 == 0) {
                      break L21;
                    }
                  }
                }
                if (var6 < this.field_ab.field_m.length) {
                  this.field_ab.field_m[var6] = 0;
                  this.field_ab.field_e[var6] = 0;
                  this.field_ab.field_f[var6] = 0;
                }
                break;
              }
              var7_ref_mb = (mb) (this.field_K.e(param0 ^ -22959));
              boolean decompiledNaturalLoopExit1 = false;
              while (!(decompiledNaturalLoopExit1 = (var7_ref_mb == null))) {
                stackOut_102_0 = var7_ref_mb.field_Lb;
                stackIn_119_0 = stackOut_102_0 ? 1 : 0;
                stackIn_103_0 = stackOut_102_0;
                if (var15 == 0) {
                  if ((!stackIn_103_0 ||
                    var7_ref_mb.field_pc) &&
                    (var5 <= (var7_ref_mb.field_hc >> 4) &&
                    var7_ref_mb.field_hc >> 4 <= var6)) {
                    var7_ref_mb.field_hc = var7_ref_mb.field_hc - 16;
                  }
                  var7_ref_mb = (mb) (this.field_K.a((byte) -100));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit1) {
                this.field_ab.field_o[0] = this.field_ab.field_o[0] - 1;
                stackIn_119_0 = 2;
              }
              var7Lifetime2 = stackIn_119_0;
              while (this.field_ab.field_c > var7Lifetime2) {
                if (var15 != 0) {
                  return;
                }
                if (this.field_ab.field_j[var7Lifetime2] != -1 &&
                  this.field_ab.field_o[var7Lifetime2] + 6000 > var3Lifetime1) {
                  var8 = new wl(this.field_ab.field_o[var7Lifetime2] << 4, -this.field_ab.field_e[this.field_ab.field_o[var7Lifetime2]] << 4, 0, 0, 0, 0, 0, this, (mb) null, 500, 0, -1);
                  var8.field_O = 500;
                  var8.field_ob = false;
                  var9 = new jb(var8.field_U, var8.field_A, 0, 0, 20, this, var8.field_fb, var8);
                  var9.field_U = 1500;
                  var9.field_G = 100;
                  var9.field_K = 0;
                  this.field_u.a(3, var9);
                  this.field_ab.field_j[var7Lifetime2] = -1;
                  var10 = this.field_ab.field_o[var7Lifetime2] - 1075;
                  while (!((this.field_ab.field_o[var7Lifetime2] + 1075) <= var10)) {
                    var11 = this.field_ab.field_m;
                    var12 = var10;
                    var13 = this.field_ab.field_e;
                    this.field_ab.field_f[var10] = 0;
                    var14 = var10;
                    var13[var14] = 0;
                    var11[var12] = 0;
                    var10++;
                  }
                }
                var7Lifetime2++;
              }
              if (var15 == 0) {
                return;
              }
            }
            if ((3 & this.field_r) == 2) {
              var3Lifetime2 = this.field_ab.field_o[1];
              var4Lifetime2 = kc.field_x[4][0].field_z << 4;
              var5Lifetime1 = var3Lifetime2 - var4Lifetime2 / 2;
              var6Lifetime1 = var4Lifetime2 / 2 + var3Lifetime2;
              var7Lifetime1 = var6Lifetime1;
              L37: while (true) {
                if (var7Lifetime1 > var5Lifetime1) {
                  this.field_ab.field_m[var7Lifetime1] = this.field_ab.field_m[var7Lifetime1 - 1];
                  this.field_ab.field_e[var7Lifetime1] = this.field_ab.field_e[-1 + var7Lifetime1];
                  this.field_ab.field_f[var7Lifetime1] = this.field_ab.field_f[var7Lifetime1 - 1];
                  var7Lifetime1--;
                  if (var15 == 0) {
                    continue;
                  }
                } else {
                  if (this.field_r == 6) {
                    var7Lifetime1 = var5Lifetime1;
                    while (var7Lifetime1 >= 0) {
                      this.field_ab.field_m[var7Lifetime1] = 0;
                      this.field_ab.field_e[var7Lifetime1] = 0;
                      this.field_ab.field_f[var7Lifetime1] = 0;
                      var7Lifetime1--;
                      if (var15 != 0) {
                        break L37;
                      }
                    }
                    if (var15 == 0) {
                      break L37;
                    }
                  }
                }
                if (var5Lifetime1 >= 0) {
                  this.field_ab.field_m[var5Lifetime1] = 0;
                  this.field_ab.field_e[var5Lifetime1] = 0;
                  this.field_ab.field_f[var5Lifetime1] = 0;
                }
                break;
              }
              var7_ref_mbLifetime1 = (mb) (this.field_K.e(13058));
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var7_ref_mbLifetime1 == null))) {
                stackOut_162_0 = var7_ref_mbLifetime1.field_Lb;
                stackIn_180_0 = stackOut_162_0 ? 1 : 0;
                stackIn_163_0 = stackOut_162_0;
                if (var15 == 0) {
                  if ((!stackIn_163_0 ||
                    var7_ref_mbLifetime1.field_pc) &&
                    ((var7_ref_mbLifetime1.field_hc >> 4) >= var5Lifetime1 &&
                    var7_ref_mbLifetime1.field_hc >> 4 <= var6Lifetime1)) {
                    var7_ref_mbLifetime1.field_hc = var7_ref_mbLifetime1.field_hc + 16;
                  }
                  var7_ref_mbLifetime1 = (mb) (this.field_K.a((byte) -22));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                this.field_ab.field_o[1] = this.field_ab.field_o[1] + 1;
                stackIn_180_0 = 2;
              }
              var7Lifetime1Lifetime1 = stackIn_180_0;
              while (true) {
                if (this.field_ab.field_c <= var7Lifetime1Lifetime1) {
                  return;
                }
                if (var15 != 0) {
                  return;
                }
                if (-1 != this.field_ab.field_j[var7Lifetime1Lifetime1] &&
                  var3Lifetime2 > (-6000 + this.field_ab.field_o[var7Lifetime1Lifetime1])) {
                  var8Lifetime1 = new wl(this.field_ab.field_o[var7Lifetime1Lifetime1] << 4, -this.field_ab.field_e[this.field_ab.field_o[var7Lifetime1Lifetime1]] << 4, 0, 0, 0, 0, 0, this, (mb) null, 500, 0, -1);
                  var8Lifetime1.field_ob = false;
                  var8Lifetime1.field_O = 500;
                  var9Lifetime1 = new jb(var8Lifetime1.field_U, var8Lifetime1.field_A, 0, 0, 20, this, var8Lifetime1.field_fb, var8Lifetime1);
                  var9Lifetime1.field_U = 1500;
                  var9Lifetime1.field_K = 0;
                  var9Lifetime1.field_G = 100;
                  this.field_u.a(3, var9Lifetime1);
                  this.field_ab.field_j[var7Lifetime1Lifetime1] = -1;
                  var10Lifetime1 = -1075 + this.field_ab.field_o[var7Lifetime1Lifetime1];
                  while (!(1075 + this.field_ab.field_o[var7Lifetime1Lifetime1] <= var10Lifetime1)) {
                    var11Lifetime1 = this.field_ab.field_m;
                    var12Lifetime1 = var10Lifetime1;
                    var13Lifetime1 = this.field_ab.field_e;
                    var14Lifetime1 = var10Lifetime1;
                    this.field_ab.field_f[var10Lifetime1] = 0;
                    var13Lifetime1[var14Lifetime1] = 0;
                    var11Lifetime1[var12Lifetime1] = 0;
                    var10Lifetime1++;
                  }
                }
                var7Lifetime1Lifetime1++;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.RA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, je param5, int param6, int param7, int param8) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = SteelSentinels.field_G;
        try {
          param5.field_B = param4;
          var10_int = param8;
          var11 = param4;
          while (param7 > var11) {
            var12 = jh.a(param0 * (var11 >> 3), 4096) * param3 >> 16;
            var13 = kg.a((var11 >> 3) * param0, (byte) -87) * -param3 >> 16;
            if (var17 != 0) {
              return;
            }
            if (var12 != 0 &&
              0 != var13) {
              var14 = param2 / var12;
              if (param6 != 0) {
                stackIn_16_0 = -(param1 / var13) + -var13 / param6;
              } else {
                stackIn_16_0 = param1 / var13;
              }
              var15 = stackIn_16_0;
              var16 = Math.abs(-var15 + var14);
              if (!(Math.abs(var16) >= var10_int) ||
                var10_int == -1) {
                var10_int = Math.abs(var16);
                param5.field_B = param0 * var11;
              }
            }
            var11 += 128;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_28_0 = var10;
          stackIn_28_1 = new StringBuilder().append("ee.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, mb param4, mb param5) {
        je stackIn_21_0 = null;
        je stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        je stackIn_22_0;
        je stackIn_22_1;
        int stackIn_22_3;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        je var7Lifetime1Lifetime1;
        var10 = SteelSentinels.field_G;
        try {
          if (param1 != 2714) {
            return;
          }
          if (param4.field_Vb == null &&
            0 < param4.field_Tb) {
            var7 = new je(5, param5.field_Bb, this.field_r + 1);
            var7.field_p = true;
            param4.field_B.a(3, var7);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4.field_t <= 0) {
            if (Math.abs(param0) > 80000) {
              var7Lifetime1 = new je(6, param3, 2 + this.field_r);
              var7Lifetime1.field_p = true;
              param4.field_B.a(3, var7Lifetime1);
              var7Lifetime1 = new je(3, 0, (param4.field_hc + this.field_r + param5.field_hc) % 100 + 4 + (this.field_r + 100));
              var7Lifetime1.field_u = param5.field_hc;
              var7Lifetime1.field_p = true;
              var7Lifetime1.field_y = -20000 + param4.field_Gb;
              param4.field_B.a(3, var7Lifetime1);
              param4.field_Tb = param4.field_x;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              var7Lifetime1 = new je(3, 0, 100 + ((param4.field_hc + param5.field_hc + this.field_r) % 100 + (this.field_r + 4)));
              var7Lifetime1.field_y = param4.field_Gb - 20000;
              var7Lifetime1.field_u = param4.field_hc - param3 * 20000;
              var7Lifetime1.field_p = true;
              param4.field_B.a(3, var7Lifetime1);
              param4.field_Tb = param4.field_x;
              if (null != param4.field_Vb) {
                var7Lifetime1 = new je(0, 11, 150 + ((param5.field_hc + this.field_r + param4.field_hc) % 100 + (4 + this.field_r)));
                var7Lifetime1.field_u = param5.field_hc;
                var7Lifetime1.field_y = param5.field_Gb;
                var7Lifetime1.field_p = true;
                var7Lifetime1.field_B = 16384 * param3;
                param4.field_B.a(3, var7Lifetime1);
              }
              decompiledFrameRemainder0 = (var10 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_21_0 = null;
            stackIn_21_1 = null;
            stackIn_21_2 = 6;
            if (param4.field_t <= (param4.field_hc >> 4)) {
              stackIn_22_0 = null;
              stackIn_22_1 = null;
              stackIn_22_3 = -1;
            } else {
              stackIn_22_0 = null;
              stackIn_22_1 = null;
              stackIn_22_3 = 1;
            }
            var7Lifetime1Lifetime1 = new je(stackIn_21_2, stackIn_22_3, 2 + this.field_r);
            var7Lifetime1Lifetime1.field_p = true;
            param4.field_B.a(3, var7Lifetime1Lifetime1);
          }
          if (Math.abs(param0) < 100000 &&
            1 <= param4.field_Tb) {
            var7Lifetime2 = new je(0, 7, 4 + (this.field_r - (-((param4.field_hc + this.field_r + param5.field_hc) % 100) - 175)));
            var7Lifetime2.field_u = param5.field_hc;
            var7Lifetime2.field_y = param5.field_Gb;
            var8 = Math.atan2((double)param0, (double)(-param2));
            var7Lifetime2.field_B = (int)(65536.0 * var8 / 6.283185307179586);
            if (0 <= param3) {
              if (!(var7Lifetime2.field_B >= -16384)) {
                var7Lifetime2.field_B = var7Lifetime2.field_B + 65536;
                if ((var10 != 0) &&
                  (16384 < var7Lifetime2.field_B)) {
                  var7Lifetime2.field_B = var7Lifetime2.field_B - 65536;
                }
              }
            } else {
              if (16384 < var7Lifetime2.field_B) {
                var7Lifetime2.field_B = var7Lifetime2.field_B - 65536;
              }
            }
            var7Lifetime2.field_p = true;
            param4.field_B.a(3, var7Lifetime2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_45_0 = var7_ref;
          stackIn_45_1 = new StringBuilder().append("ee.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param5 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, mb param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wl var7 = null;
        int var8 = 0;
        jc var9 = null;
        mb var10 = null;
        int var11 = 0;
        var11 = SteelSentinels.field_G;
        try {
          var4_int = (this.field_ab.field_o[param0] << 4) + (-75000 + param0 * 150000);
          var5 = this.field_ab.field_o[-param0 + 1] << 4;
          var6 = -30000;
          var7 = new wl(var4_int, var6, -1 + param0 * 2, 0, 50, 1, 11, this, param2, 1000, var5, 30);
          this.field_T.a(3, var7);
          var8 = -114 % ((param1 + 59) / 32);
          var9 = new jc(this.field_K);
          var10 = (mb) (var9.b(2));
          while (null != var10) {
            if (var11 != 0) {
              return;
            }
            if (param0 == var10.field_jc &&
              var10.field_Cb) {
              var10.field_Cb = false;
            }
            var10 = (mb) (var9.d(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ee.DB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, mb param4, boolean param5) {
        je stackIn_36_0 = null;
        je stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        je stackIn_37_0;
        je stackIn_37_1;
        int stackIn_37_3;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        var8 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0 >= param3.field_t) {
            if (15000 <= Math.abs(param1) && (!(param4.field_mc > 0) ||
              !(Math.abs(param1) < 40000))) {
              var7 = new je(6, param0, this.field_r + 2);
              var7.field_p = true;
              param3.field_B.a(3, var7);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (15000 > Math.abs(param1) &&
                10000 > Math.abs(param2) &&
                param3.field_Tb > 1) {
                var7 = new je(6, param0, 2 + this.field_r);
                var7.field_p = true;
                param3.field_B.a(3, var7);
                var7 = new je(7, param0, 4 + this.field_r);
                var7.field_p = true;
                param3.field_B.a(3, var7);
                var7 = new je(6, param0, 4 + this.field_r + 25);
                var7.field_p = true;
                param3.field_B.a(3, var7);
                return;
              }
              decompiledFrameRemainder0 = !(Math.abs(param1) >= 20000);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (!(param4.field_mc <= 1) ||
                !(Math.abs(param1) >= 10000)))) {
                var7 = new je(6, -param0, this.field_r + 2);
                var7.field_p = true;
                param3.field_B.a(3, var7);
                decompiledFrameRemainder0 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_36_0 = null;
            stackIn_36_1 = null;
            stackIn_36_2 = 6;
            if ((param3.field_hc >> 4) >= param3.field_t) {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_3 = -1;
            } else {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_3 = 1;
            }
            var7Lifetime2 = new je(stackIn_36_2, stackIn_37_3, 2 + this.field_r);
            var7Lifetime2.field_p = true;
            param3.field_B.a(3, var7Lifetime2);
          }
          if (param5) {
            return;
          }
          if (50000 < Math.abs(param1) &&
            this.a(this.field_z, (byte) -89, 2, param3, param4, 2600, this.field_r + 15)) {
            return;
          }
          if (param3.field_Tb <= 1) {
            if (this.a(this.field_z, (byte) -88, 0, param3, param4, 4352, this.field_r + 25) &&
              Math.abs(param1) > 80000 &&
              param3.field_Tb > 0) {
              var7Lifetime1 = new je(3, 0, this.field_r + 30);
              var7Lifetime1.field_p = true;
              var7Lifetime1.field_y = param3.field_Gb - 20000;
              var7Lifetime1.field_u = param0 * 20000 + param3.field_hc;
              param3.field_B.a(3, var7Lifetime1);
            }
          } else {
            if (!this.a(this.field_z, (byte) -126, 1, param3, param4, 1728, 25 + this.field_r) &&
              !this.a(this.field_z, (byte) -63, 0, param3, param4, 4352, 25 + this.field_r)) {
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_69_0 = var7_ref;
          stackIn_69_1 = new StringBuilder().append("ee.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_22_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_14_0;
        var5 = SteelSentinels.field_G;
        try {
          if (this.b(true, param1) &&
            this.b(true, param2)) {
            if (param0 < 34) {
              return true;
            }
            if (param2 < param1) {
              var4_int = param1;
              param1 = param2;
              param2 = var4_int;
            }
            param1++;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (param2 <= param1))) {
              stackOut_14_0 = this.b(true, param1);
              stackIn_22_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var5 == 0) {
                if (!stackIn_15_0) {
                  return false;
                }
                param1++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_22_0 = true;
            }
            return stackIn_22_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ee.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        try {
          field_L = null;
          field_jb = null;
          field_k = null;
          field_H = null;
          field_x = null;
          field_I = null;
          field_S = null;
          if (param0 != 0) {
            ee.c(-128);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ee.L(" + param0 + ')');
        }
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mb var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          var2_int = 0;
          if (param0) {
            this.field_lb = false;
          }
          var3 = (mb) (this.field_K.e(13058));
          do {
            if (null == var3) {
              var2_int = var2_int + this.field_r;
              var2_int = var2_int + ((65535 & this.field_d + this.field_M + this.field_gb) << 16);
              break;
            }
            var2_int = var2_int + (3 * var3.field_Gb + var3.field_hc * 2 & 65535);
            var2_int = var2_int + (var3.field_K & 65535);
            var2_int = var2_int + ((65535 & var3.field_ab) << 16);
            var2_int = var2_int + (11 * var3.field_ub + 7 * var3.field_Tb & 65535);
            var2_int = var2_int + ((65535 & var3.field_vb) << 16);
            var2_int = var2_int + (65535 & var3.field_rb * 5);
            var3 = (mb) (this.field_K.a((byte) -44));
          } while (var4 == 0);
          stackIn_12_0 = var2_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.V(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, mb param2, mb param3, int param4, int param5) {
        je stackIn_17_0 = null;
        je stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        je stackIn_18_0 = null;
        je stackIn_18_1 = null;
        int stackIn_18_3 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        je var7Lifetime1;
        je var7Lifetime2;
        je var7Lifetime1Lifetime1;
        var8 = SteelSentinels.field_G;
        try {
          if (param3.field_Vb == null &&
            0 < param3.field_Tb &&
            !param2.i(18, -27)) {
            var7 = new je(5, param2.field_Bb, 1 + this.field_r);
            var7.field_p = true;
            param3.field_B.a(param0 ^ 58, var7);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3.field_t > 0) {
            stackIn_17_0 = null;
            stackIn_17_1 = null;
            stackIn_17_2 = 6;
            if (param3.field_hc >> 4 < param3.field_t) {
              stackIn_18_0 = null;
              stackIn_18_1 = null;
              stackIn_18_3 = 1;
            } else {
              stackIn_18_0 = null;
              stackIn_18_1 = null;
              stackIn_18_3 = -1;
            }
            var7Lifetime1 = new je(stackIn_17_2, stackIn_18_3, this.field_r + 2);
            var7Lifetime1.field_p = true;
            param3.field_B.a(3, var7Lifetime1);
            decompiledFrameRemainder0 = (var8 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (Math.abs(param1) < 70000 &&
              param3.field_U != 0) {
              if (Math.abs(param1) >= 20000) {
                if (!(Math.abs(param1) >= 50000)) {
                  var7Lifetime1Lifetime1 = new je(6, 0, this.field_r + 2);
                  var7Lifetime1Lifetime1.field_p = true;
                  param3.field_B.a(3, var7Lifetime1Lifetime1);
                  if (var8 != 0) {
                    var7Lifetime1Lifetime1 = new je(6, -param4, 2 + this.field_r);
                    var7Lifetime1Lifetime1.field_p = true;
                    param3.field_B.a(3, var7Lifetime1Lifetime1);
                    var7Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
                    var7Lifetime1Lifetime1.field_p = true;
                    param3.field_B.a(param0 ^ 58, var7Lifetime1Lifetime1);
                  }
                }
              } else {
                var7Lifetime1Lifetime1 = new je(6, -param4, 2 + this.field_r);
                var7Lifetime1Lifetime1.field_p = true;
                param3.field_B.a(3, var7Lifetime1Lifetime1);
                if (var8 != 0) {
                  var7Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
                  var7Lifetime1Lifetime1.field_p = true;
                  param3.field_B.a(param0 ^ 58, var7Lifetime1Lifetime1);
                }
              }
            } else {
              var7Lifetime1Lifetime1 = new je(6, param4, this.field_r + 2);
              var7Lifetime1Lifetime1.field_p = true;
              param3.field_B.a(param0 ^ 58, var7Lifetime1Lifetime1);
            }
          }
          if (null != param3.field_Vb) {
            var7Lifetime2 = new je(0, param3.field_Xb[2], 5 + this.field_r);
            var7Lifetime2.field_B = 7192 * param4;
            var7Lifetime2.field_p = true;
            var7Lifetime2.field_y = param2.field_Gb;
            var7Lifetime2.field_u = param2.field_hc;
            param3.field_B.a(3, var7Lifetime2);
          }
          if (param0 != 57) {
            this.field_hb = -92;
          }
          if (!this.a(this.field_z, (byte) -57, 4, param3, param2, 2600, this.field_r + 15) &&
            !this.a(this.field_z, (byte) -61, 3, param3, param2, 2600, this.field_r + 15)) {
            if (param3.field_Tb > 0 &&
              param2.field_S > 50) {
              if (this.a(this.field_z * 4, (byte) -88, 1, param3, param2, 8448, 15 + this.field_r)) {
                return;
              }
              if (!this.a(this.field_z, (byte) -29, 0, param3, param2, 2304, this.field_r + 25)) {
                return;
              }
              return;
            }
            if (!this.a(this.field_z, (byte) -88, 0, param3, param2, 2304, this.field_r + 25) &&
              param3.field_Tb > 0 &&
              this.a(this.field_z, (byte) -91, 1, param3, param2, 1728, 15 + this.field_r)) {
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_70_0 = var7_ref;
          stackIn_70_1 = new StringBuilder().append("ee.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param3 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_24_1 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          if (this.field_ab.b(88) != 2) {
            return false;
          }
          if (this.field_ab.a(param1, param0) > 3000) {
            return false;
          }
          if (!this.b(true, param0)) {
            return false;
          }
          param0--;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param0 <= 0))) {
            stackIn_29_0 = 3000;
            if (var4 == 0) {
              if (stackIn_29_0 < this.field_ab.a(false, param0)) {
                return true;
              }
              stackIn_24_1 = !(param1);
              if (!this.b(stackIn_24_1, param0)) {
                return false;
              }
              param0--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = 0;
          }
          return stackIn_29_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.A(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -36) {
            this.b(-114, 97);
          }
          stackIn_7_0 = (this.field_K.field_e.field_k == this.field_K.field_e.field_i);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.I(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0;
        boolean stackOut_13_0;
        var5 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          var4 = -114 / ((param0 + 15) / 60);
          var3_int = 0;
          if (this.field_ab.a(65) / 2 <= param1) {
            var3_int = this.field_ab.a(108);
            while (param1 > 0) {
              stackOut_4_0 = this.b(true, param1);
              stackIn_22_0 = stackOut_4_0 ? 1 : 0;
              stackIn_5_0 = stackOut_4_0;
              if (var5 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (!stackIn_5_0) {
                var3_int = -800 + param1;
                decompiledFrameCompleted1 = false;
                break;
              }
              param1--;
            }
            if (decompiledFrameCompleted2) {
              decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            while (!(this.field_ab.a(-128) <= param1)) {
              stackOut_13_0 = this.b(true, param1);
              stackIn_22_0 = stackOut_13_0 ? 1 : 0;
              stackIn_14_0 = stackOut_13_0;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!stackIn_14_0) {
                var3_int = 800 + param1;
                break;
              }
              param1++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted0)) {
            stackIn_22_0 = Math.max(128, Math.min(this.field_ab.a(109) - 128, var3_int));
          }
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ee.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, mb param2, int param3, mb param4) {
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        je var6 = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
        je var6Lifetime1;
        var7 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param4.field_t <= 0) {
            if (Math.abs(param3) >= 30000 &&
              param4.field_Tb > 5) {
              var6 = new je(6, param1, this.field_r + 2);
              var6.field_p = true;
              param4.field_B.a(3, var6);
              decompiledFrameRemainder0 = (var7 != 0);
            }
            if ((decompiledFrameRemainder0) && (0 == param4.field_U ||
              !(param4.field_Tb > 1))) {
              var6 = new je(6, -param1, this.field_r + 2);
              var6.field_p = true;
              param4.field_B.a(3, var6);
              if (var7 != 0) {
                var6_ref = null;
                if (param4.field_hc >> 4 <= param4.field_t) {
                  var6 = new je(6, 1, 2 + this.field_r);
                } else {
                  var6 = new je(6, -1, 2 + this.field_r);
                }
                var6.field_p = true;
                param4.field_B.a(3, var6);
              }
            }
          } else {
            var6_ref = null;
            if (param4.field_hc >> 4 <= param4.field_t) {
              var6 = new je(6, 1, 2 + this.field_r);
            } else {
              var6 = new je(6, -1, 2 + this.field_r);
            }
            var6.field_p = true;
            param4.field_B.a(3, var6);
          }
          if (param0 >= -77) {
            this.field_X = 4;
          }
          param2.field_Gb = param2.field_Gb + (param4.field_Db << 3);
          if ((param4.field_Lb ||
            !(param4.field_oc <= 0)) && !this.a(this.field_z, (byte) -128, 3, param4, param2, 2600, this.field_r + 15)) {
          }
          if (!this.a(this.field_z, (byte) -97, 2, param4, param2, 2600, 15 + this.field_r)) {
            if (param4.field_Tb > 1) {
              if ((!this.a(this.field_z, (byte) -109, 1, param4, param2, 1728, 25 + this.field_r)) &&
                (this.a(0, (byte) -69, 0, param4, param2, 4608, 25 + this.field_r)) &&
                (param4.field_t == 0)) {
                var6Lifetime1 = new je(3, 0, 3 + this.field_r);
                var6Lifetime1.field_y = param4.field_Gb - 20000;
                var6Lifetime1.field_u = param4.field_hc + 10000 * param1;
                var6Lifetime1.field_p = true;
                param4.field_B.a(3, var6Lifetime1);
                param4.g(5);
                if ((var7 != 0) && (param4.field_t == 0 &&
                  param4.field_Tb > 0)) {
                  var6Lifetime1 = new je(3, 0, 30 + this.field_r);
                  var6Lifetime1.field_y = param4.field_Gb - 20000;
                  var6Lifetime1.field_p = true;
                  var6Lifetime1.field_u = param4.field_hc - 20000 * param1;
                  param4.field_B.a(3, var6Lifetime1);
                  param4.g(5);
                }
              }
            } else {
              if (param4.field_t == 0 &&
                param4.field_Tb > 0) {
                var6Lifetime1 = new je(3, 0, 30 + this.field_r);
                var6Lifetime1.field_y = param4.field_Gb - 20000;
                var6Lifetime1.field_p = true;
                var6Lifetime1.field_u = param4.field_hc - 20000 * param1;
                param4.field_B.a(3, var6Lifetime1);
                param4.g(5);
              }
            }
          }
          param2.field_Gb = param2.field_Gb - (param4.field_Db << 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = decompiledCaughtException;
          stackIn_62_0 = var6_ref2;
          stackIn_62_1 = new StringBuilder().append("ee.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    final void e(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        mb var7 = null;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          stackIn_5_0 = (param0 < ~di.field_g) ? 0 : 1;
          var2_int = stackIn_5_0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = new int[this.field_Q + this.field_kb];
          var7 = (mb) (this.field_K.e(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 == null))) {
            stackIn_29_0 = var7.field_Bb;
            if (var8 == 0) {
              if (stackIn_29_0 >= 0 &&
                var7.field_Bb < this.field_Q + this.field_kb &&
                !var7.field_V) {
                if (!var7.field_Hb) {
                  var4 = var4 | 1 << var7.field_Bb;
                  var3 = var3 | 1 << var7.field_jc;
                  if (this.field_kb > var7.field_Bb) {
                    var5 = var5 | 1 << var7.field_Bb;
                  }
                }
                var6[var7.field_Bb] = var7.field_vb;
                if (var6[var7.field_Bb] <= 0) {
                  var6[var7.field_Bb] = 1;
                }
              }
              var7 = (mb) (this.field_K.a((byte) -55));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = this.field_lb ? 1 : 0;
          }
          if (stackIn_29_0 != 0 ||
            var2_int != 0) {
            if (0 < mm.a((byte) 123, var4)) {
              return;
            }
            this.a(var6, (byte) -109);
            if (var8 == 0) {
              return;
            }
          }
          if (mm.a((byte) 127, var3) > 1 &&
            var5 != 0) {
            return;
          }
          this.a(var6, (byte) -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.K(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        boolean stackIn_8_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_50_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        boolean stackOut_18_0;
        boolean stackOut_31_0;
        boolean stackOut_41_0;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var9Lifetime2;
        int var10Lifetime2;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        var11 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var8_int = 60 / ((param5 + 8) / 59);
          if (Math.abs(param1) >= Math.abs(param2)) {
            if (param0 > param3) {
              var9 = param3;
              while (var9 < param0) {
                var10 = param2 * (-param3 + var9) / param1 + param4;
                stackOut_7_0 = this.a(true, var10, var9);
                stackIn_50_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var11 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
                if (stackIn_8_0) {
                  return true;
                }
                var9 += 8;
              }
              if (decompiledFrameCompleted3) {
                decompiledFrameRemainder0 = (var11 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted3)) {
              var9Lifetime2 = param3;
              while (param0 < var9Lifetime2) {
                var10Lifetime2 = (var9Lifetime2 - param3) * param2 / param1 + param4;
                stackOut_18_0 = this.a(true, var10Lifetime2, var9Lifetime2);
                stackIn_50_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var11 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_19_0) {
                  return true;
                }
                var9Lifetime2 -= 8;
              }
              if (decompiledFrameCompleted2) {
                decompiledFrameRemainder0 = (var11 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            if (param6 > param4) {
              var9Lifetime1 = param4;
              while (param6 > var9Lifetime1) {
                var10Lifetime1 = param3 + (-param4 + var9Lifetime1) * param1 / param2;
                stackOut_31_0 = this.a(true, var9Lifetime1, var10Lifetime1);
                stackIn_50_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (var11 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_32_0) {
                  return true;
                }
                var9Lifetime1 += 8;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (!(param6 > param4) ||
              var11 != 0)) {
              var9Lifetime1Lifetime1 = param4;
              while (param6 < var9Lifetime1Lifetime1) {
                var10Lifetime1Lifetime1 = (var9Lifetime1Lifetime1 - param4) * param1 / param2 + param3;
                stackOut_41_0 = this.a(true, var9Lifetime1Lifetime1, var10Lifetime1Lifetime1);
                stackIn_50_0 = stackOut_41_0;
                stackIn_42_0 = stackOut_41_0;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_42_0) {
                  return true;
                }
                var9Lifetime1Lifetime1 -= 8;
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_50_0 = false;
          }
          return stackIn_50_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var8), "ee.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          if (param0 <= 45) {
            stackIn_3_0 = 53;
            return stackIn_3_0;
          }
          var2_int = 0;
          var3 = (mb) (this.field_K.e(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            stackIn_14_0 = 8;
            if (var4 == 0) {
              if (stackIn_14_0 == var3.field_Nb) {
                var2_int++;
              }
              var3 = (mb) (this.field_K.a((byte) -81));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = var2_int;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.AB(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.field_G;
        try {
          if (null == this.field_y) {
            this.field_p = false;
            return;
          }
          this.field_p = true;
          if (param0 != -22017) {
            this.a((byte) 105, -38, 41, -10, (mb) null, (mb) null);
          }
          var2_int = 0;
          while (var2_int < this.field_E.length) {
            if (this.field_p) {
              if (this.field_y.field_vb <= this.field_E[var2_int]) {
                this.field_p = false;
              }
              var2_int++;
              if (var3 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ee.CA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          param2 = -param2;
          if (!param0) {
            this.field_T = (ul) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_ab.a(false, param1) > param2 && (!(this.field_ab.a((byte) -102, param1) <= param2) ||
            !(this.field_ab.b((byte) 120, param1) >= param2))) {
            stackIn_13_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = false;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ee.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        mb var4 = null;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        mb stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int stackIn_18_0Lifetime1;
        int stackIn_18_1Lifetime1;
        var5 = SteelSentinels.field_G;
        try {
          var4 = this.f(param2, -128);
          if (param1 != 28669) {
            return;
          }
          if (var4 != null) {
            L2: while (true) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (!var4.field_Ec.f(7)) {
                stackIn_18_0 = param0;
                stackIn_18_1 = ((je) (var4.field_Ec.b(1063677678))).field_x;
                if (var5 != 0) {
                  if (stackIn_18_0 >= stackIn_18_1) {
                    var4.field_B.b(param1 + 1063649009).b(4);
                    decompiledFrameRemainder0 = false;
                  }
                  decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0) &&
                  (stackIn_18_0 <= stackIn_18_1)) {
                  var4.field_Ec.b(1063677678).b(4);
                  continue;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                while (!var4.field_B.f(7)) {
                  stackIn_23_0 = var4;
                  if (var5 != 0) {
                    break L2;
                  }
                  stackIn_18_0Lifetime1 = ((je) (((ul) (Object) stackIn_23_0.field_B).b(param1 + 1063649009))).field_x;
                  stackIn_18_1Lifetime1 = param0;
                  if (stackIn_18_0Lifetime1 < stackIn_18_1Lifetime1) {
                    break;
                  }
                  var4.field_B.b(param1 + 1063649009).b(4);
                }
              }
              stackIn_23_0 = var4;
              break;
            }
            ((mb) (Object) stackIn_23_0).d((byte) 85, new je(10, 0, param0));
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4_ref), "ee.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(mb param0, byte param1, mb param2, int param3, int param4) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        je stackIn_11_0 = null;
        je stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        je stackIn_12_0 = null;
        je stackIn_12_1 = null;
        int stackIn_12_3 = 0;
        je stackIn_22_0;
        je stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        je stackIn_23_0;
        je stackIn_23_1;
        int stackIn_23_5;
        je stackIn_32_0;
        je stackIn_32_1;
        int stackIn_32_2;
        int stackIn_32_3;
        je stackIn_33_0;
        je stackIn_33_1;
        int stackIn_33_4;
        je stackIn_42_0;
        je stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        je stackIn_43_0;
        je stackIn_43_1;
        int stackIn_43_4;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var6 = null;
        int var7 = 0;
        je var8_ref_je = null;
        int var8 = 0;
        je var9 = null;
        int var10 = 0;
        je var8_ref_jeLifetime1;
        var10 = SteelSentinels.field_G;
        try {
          var6 = null;
          stackIn_5_0 = (param0.field_Zb.a(0, param0, new nk[]{}, 32768, param0.field_Xb[2]).length <= 0) ? 0 : 1;
          boolean decompiledFrameRemainder1 = true;
          var7 = stackIn_5_0;
          if (param0.field_t > 0) {
            stackIn_11_0 = null;
            stackIn_11_1 = null;
            stackIn_11_2 = 6;
            if (param0.field_hc >> 4 < param0.field_t) {
              stackIn_12_0 = null;
              stackIn_12_1 = null;
              stackIn_12_3 = 1;
            } else {
              stackIn_12_0 = null;
              stackIn_12_1 = null;
              stackIn_12_3 = -1;
            }
            var8_ref_je = new je(stackIn_11_2, stackIn_12_3, 2 + this.field_r);
            var8_ref_je.field_p = true;
            param0.field_B.a(3, var8_ref_je);
            decompiledFrameRemainder1 = (var10 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (Math.abs(param3) <= 80000) {
              if (Math.abs(param3) >= 60000) {
                if (param0.field_U == 0) {
                  var8_ref_jeLifetime1 = new je(6, param4, 2 + this.field_r);
                  var8_ref_jeLifetime1.field_p = true;
                  param0.field_B.a(3, var8_ref_jeLifetime1);
                  decompiledFrameRemainder1 = (var10 != 0);
                }
                if (decompiledFrameRemainder1) {
                  stackIn_42_0 = null;
                  stackIn_42_1 = null;
                  stackIn_42_2 = 3;
                  stackIn_42_3 = 0;
                  if (!param0.field_Lb) {
                    stackIn_43_0 = null;
                    stackIn_43_1 = null;
                    stackIn_43_4 = 60;
                  } else {
                    stackIn_43_0 = null;
                    stackIn_43_1 = null;
                    stackIn_43_4 = 32;
                  }
                  var6 = new je(stackIn_42_2, stackIn_42_3, stackIn_43_4 + this.field_r);
                  ((je) (var6)).field_p = true;
                  ((je) (var6)).field_u = 5000 * param4 + param0.field_hc;
                  ((je) (var6)).field_y = -20000 + param0.field_Gb;
                }
              } else {
                var8_ref_jeLifetime1 = new je(6, -param4, 2 + this.field_r);
                var8_ref_jeLifetime1.field_p = true;
                param0.field_B.a(3, var8_ref_jeLifetime1);
                if (var7 != 0) {
                  stackIn_32_0 = null;
                  stackIn_32_1 = null;
                  stackIn_32_2 = 3;
                  stackIn_32_3 = 0;
                  if (param0.field_Lb) {
                    stackIn_33_0 = null;
                    stackIn_33_1 = null;
                    stackIn_33_4 = 32;
                  } else {
                    stackIn_33_0 = null;
                    stackIn_33_1 = null;
                    stackIn_33_4 = 60;
                  }
                  var6 = new je(stackIn_32_2, stackIn_32_3, stackIn_33_4 + this.field_r);
                  ((je) (var6)).field_y = -20000 + param0.field_Gb;
                  ((je) (var6)).field_u = param0.field_hc - 20000 * param4;
                  ((je) (var6)).field_p = true;
                }
              }
            } else {
              var8_ref_jeLifetime1 = new je(6, param4, 2 + this.field_r);
              var8_ref_jeLifetime1.field_p = true;
              param0.field_B.a(3, var8_ref_jeLifetime1);
              if (var7 != 0) {
                stackIn_22_0 = null;
                stackIn_22_1 = null;
                stackIn_22_2 = 3;
                stackIn_22_3 = 0;
                stackIn_22_4 = this.field_r;
                if (param0.field_Lb) {
                  stackIn_23_0 = null;
                  stackIn_23_1 = null;
                  stackIn_23_5 = 32;
                } else {
                  stackIn_23_0 = null;
                  stackIn_23_1 = null;
                  stackIn_23_5 = 60;
                }
                var6 = new je(stackIn_22_2, stackIn_22_3, stackIn_22_4 + stackIn_23_5);
                ((je) (var6)).field_u = param2.field_hc;
                ((je) (var6)).field_y = -20000 + param0.field_Gb;
                ((je) (var6)).field_p = true;
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var8 = 41 % ((param1 - 31) / 61);
          if (!param0.field_Lb ||
            !this.a(this.field_z, (byte) -92, 2, param0, param2, 2600, 3 + this.field_r)) {
            if (param0.field_Tb > 1) {
              if ((!this.a(this.field_z, (byte) -75, 1, param0, param2, 4608, this.field_r + 3)) &&
                (decompiledFrameRemainder0 = !(!this.a(this.field_z, (byte) -26, 0, param0, param2, 1280, this.field_r + 3)))) {
                var9 = new je(6, -param4, this.field_r + 50);
                var9.field_p = true;
                param0.field_B.a(3, var9);
                decompiledFrameRemainder0 = (var10 != 0);
              }
              if (decompiledFrameRemainder0) {
                var9 = new je(6, -param4, this.field_r + 25);
                var9.field_p = true;
                param0.field_B.a(3, var9);
                decompiledFrameRemainder0 = (var10 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (this.a(this.field_z, (byte) -30, 0, param0, param2, 1280, this.field_r + 3))) {
              var9 = new je(6, -param4, this.field_r + 50);
              var9.field_p = true;
              param0.field_B.a(3, var9);
              if (var10 != 0) {
                discarded$0 = this.a(this.field_z, (byte) -87, 2, param0, param2, 2600, this.field_r + 15);
                var9 = new je(6, -param4, 30 + this.field_r);
                var9.field_p = true;
                param0.field_B.a(3, var9);
              }
            }
          } else {
            discarded$0 = this.a(this.field_z, (byte) -87, 2, param0, param2, 2600, this.field_r + 15);
            var9 = new je(6, -param4, 30 + this.field_r);
            var9.field_p = true;
            param0.field_B.a(3, var9);
          }
          if (var6 != null &&
            param0.field_Tb > 0) {
            param0.field_B.a(3, (ck) (var6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("ee.DA(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_77_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(boolean param0, int param1) {
        boolean discarded$1 = false;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            discarded$1 = this.a(-35, (byte) 87, -74, (mb) null, (mb) null, -128, 75);
          }
          var3 = new int[]{0, 6, 12, 18, 23, 29, fg.field_Xb.length};
          var4 = var3[param1] + this.field_D.a(115, var3[1 + param1] - var3[param1]);
          stackIn_4_0 = fg.field_Xb[var4];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ee.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(mb param0, int param1, byte param2, int param3, mb param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_131_2 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        je var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11_double = 0.0;
        int var11 = 0;
        int var12 = 0;
        nk[] var13_ref_nk__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var9Lifetime1;
        double var11_doubleLifetime1;
        int var14Lifetime1;
        var16 = SteelSentinels.field_G;
        try {
          if (10 == di.field_g &&
            ge.field_j == 0) {
            stackIn_8_0 = 1;
          } else {
            stackIn_8_0 = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          var7_int = stackIn_8_0;
          if ((param4.field_Gb <= -55000) &&
            (decompiledFrameRemainder1 = (this.field_fb)) &&
            (decompiledFrameRemainder1 = (this.field_j)) &&
            (decompiledFrameRemainder1 = !(param4.field_Gb <= -200000))) {
            decompiledFrameRemainder1 = (0 == (this.field_r & 15));
          }
          if ((decompiledFrameRemainder1) &&
            (param4.field_B.f(7))) {
            boolean decompiledFrameRemainder0 = true;
            var8 = new je(3, 0, 10 + this.field_r);
            var8.field_u = (this.field_r * 77 % (this.field_ab.a(-123) / 4) - this.field_ab.a(1) / 8 << 4) + param0.field_hc;
            var9 = 5000;
            var10 = 1;
            if (var7_int == 0) {
              if (param4.field_Xb.length != 0 ||
                param4.field_Xb[0] != 1) {
                if (var8.field_u < (param4.field_hc - var9)) {
                  var8.field_u = -var9 + param4.field_hc;
                }
                var8.field_y = -30000 + param0.field_Gb;
                if (var8.field_u > (param4.field_hc + var9)) {
                  var8.field_u = var9 + param4.field_hc;
                }
                decompiledFrameRemainder0 = !(Math.abs(param1) <= 80000);
                if (decompiledFrameRemainder0) {
                  var10 = 0;
                  decompiledFrameRemainder0 = (var16 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                var9 = 100000;
                if (param4.field_hc < param0.field_hc) {
                  if (var8.field_u > param0.field_hc - var9) {
                    var8.field_u = param0.field_hc - var9;
                  }
                  if (!(var8.field_u >= 0)) {
                    var8.field_u = param0.field_hc + var9;
                    if (var16 != 0) {
                      if (var8.field_u < (var9 + param0.field_hc)) {
                        var8.field_u = param0.field_hc + var9;
                      }
                      if (var8.field_u > this.field_ab.a(param2 ^ 68) << 4) {
                        var8.field_u = param0.field_hc - var9;
                      }
                    }
                  }
                } else {
                  if (var8.field_u < (var9 + param0.field_hc)) {
                    var8.field_u = param0.field_hc + var9;
                  }
                  if (var8.field_u > this.field_ab.a(param2 ^ 68) << 4) {
                    var8.field_u = param0.field_hc - var9;
                  }
                }
                var8.field_y = -60000;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var7_int != 0 ||
              var16 != 0)) {
              var9Lifetime1 = 50000;
              if (param4.field_hc >= param0.field_hc) {
                if (param0.field_hc + var9Lifetime1 > var8.field_u) {
                  var8.field_u = param0.field_hc + var9Lifetime1;
                }
                if (!(var8.field_u <= this.field_ab.a(29) << 4)) {
                  var8.field_u = param0.field_hc - var9Lifetime1;
                  if (var16 != 0) {
                    if (var8.field_u > -var9Lifetime1 + param0.field_hc) {
                      var8.field_u = param0.field_hc - var9Lifetime1;
                    }
                    if (var8.field_u < 0) {
                      var8.field_u = var9Lifetime1 + param0.field_hc;
                    }
                  }
                }
              } else {
                if (var8.field_u > -var9Lifetime1 + param0.field_hc) {
                  var8.field_u = param0.field_hc - var9Lifetime1;
                }
                if (var8.field_u < 0) {
                  var8.field_u = var9Lifetime1 + param0.field_hc;
                }
              }
              var8.field_y = -60000;
            }
            if (this.field_fb &&
              this.field_j) {
              var8.field_y = -5000 + param4.field_Gb;
              if (-199000 > param4.field_Gb) {
                param4.field_Hb = true;
                param4.b(param2 ^ -60);
                System.out.println(param4.field_Bb + " unlinked");
              }
            }
            var8.field_p = true;
            param4.field_B.a(3, var8);
            param4.field_Tb = param4.field_x;
            if (param4.field_Xb.length <= 0) {
              var10 = 0;
              if (var16 != 0) {
                var8 = new je(0, param4.field_Xb[0], this.field_r + 20);
              }
            } else {
              var8 = new je(0, param4.field_Xb[0], this.field_r + 20);
            }
            if (var10 != 0) {
              if (param4.field_Xb[0] != 1) {
                var11_double = Math.atan2((double)param1, (double)(-param3));
                var8.field_B = (int)(65536.0 * var11_double / 6.283185307179586);
                var13_ref_nk__ = param4.field_Zb.a(0, param4, new nk[]{}, var8.field_B * param5, param4.field_Xb[0]);
                param4.field_Zb.b((byte) -128, 0, param5, 0);
                var14 = 0;
                var15 = 0;
                L23: while (true) {
                  if (var13_ref_nk__.length > var15) {
                    var14 = var14 + var13_ref_nk__[var15].field_V;
                    var15++;
                    if (var16 == 0) {
                      continue;
                    }
                  } else {
                    if (var13_ref_nk__.length <= 0) {
                      break L23;
                    }
                  }
                  param3 = param3 - var14 / var13_ref_nk__.length;
                  break;
                }
                var11_doubleLifetime1 = Math.atan2((double)param1, (double)(-param3));
                var8.field_B = (int)(var11_doubleLifetime1 * 65536.0 / 6.283185307179586);
                var8.field_u = param0.field_hc;
                var8.field_y = param0.field_Gb;
                if (0 <= param5) {
                  if (!(var8.field_B >= -16384)) {
                    var8.field_B = var8.field_B + 65536;
                    if ((var16 != 0) &&
                      (var8.field_B > 16384)) {
                      var8.field_B = var8.field_B - 65536;
                    }
                  }
                } else {
                  if (var8.field_B > 16384) {
                    var8.field_B = var8.field_B - 65536;
                  }
                }
                var8.field_p = true;
                param4.field_B.a(param2 ^ -61, var8);
                decompiledFrameRemainder1 = (var16 != 0);
              }
              if (decompiledFrameRemainder1) {
                var8 = new je(0, param4.field_Xb[1], (this.field_r + param0.field_hc + param4.field_hc) % 50 + this.field_r + 4 + 25);
                var8.field_y = param0.field_Gb;
                var8.field_u = param0.field_hc;
                var11 = 2500;
                var12 = 0;
                var13 = 8192;
                var14Lifetime1 = 32768;
                this.a(param5, param3, param1, var11, var13, var8, var12, var14Lifetime1, -1);
                var8.field_p = true;
                param4.field_B.a(3, var8);
              }
            }
          }
          if (param2 != -64) {
            this.field_c = -58;
          }
          stackIn_126_0 = param3;
          return stackIn_126_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_130_0 = var7;
          stackIn_130_1 = new StringBuilder().append("ee.T(");
          if (param0 == null) {
            stackIn_131_2 = "null";
          } else {
            stackIn_131_2 = "{...}";
          }
          stackIn_134_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_131_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_130_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, mb param3, mb param4, int param5) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        je stackIn_48_0 = null;
        je stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        je stackIn_49_0 = null;
        je stackIn_49_1 = null;
        int stackIn_49_3 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        je var9 = null;
        int var10 = 0;
        je var9Lifetime1;
        je var9Lifetime2;
        var10 = SteelSentinels.field_G;
        try {
          var7_int = 1;
          var8 = 0;
          if (param2 != 21) {
            this.b(false);
          }
          if (var7_int == 0) {
            return;
          }
          if (param4.field_Xb[4] == 19) {
            if (!param4.field_u) {
              discarded$0 = this.a(this.field_z / 2, (byte) -76, 4, param4, param3, 2600, this.field_r + 5);
              if ((var10 != 0) &&
                (!param4.field_u)) {
                discarded$1 = this.a(this.field_z, (byte) -85, 4, param4, param3, 2600, 5 + this.field_r);
              }
            }
          } else {
            if (!param4.field_u) {
              discarded$1 = this.a(this.field_z, (byte) -85, 4, param4, param3, 2600, 5 + this.field_r);
            }
          }
          if (var8 == 0 &&
            this.a(this.field_z, (byte) -36, 2, param4, param3, 2304, 25 + this.field_r)) {
            if ((param4.field_t == 0) &&
              (!(30000 > Math.abs(param5)))) {
              var9 = new je(6, param1, this.field_r + 27);
              var9.field_p = true;
              param4.field_B.a(3, var9);
              if (var10 != 0) {
                if (!(60000 >= Math.abs(param5)) ||
                  param4.field_U == 0) {
                  var9 = new je(6, param1, this.field_r + 2);
                  var9.field_p = true;
                  param4.field_B.a(3, var9);
                }
                if (Math.abs(param5) < 100000) {
                  discarded$2 = this.a(0, (byte) -80, 0, param4, param3, 2304, 25 + this.field_r);
                }
              }
            }
          } else {
            if (!(60000 >= Math.abs(param5)) ||
              param4.field_U == 0) {
              var9 = new je(6, param1, this.field_r + 2);
              var9.field_p = true;
              param4.field_B.a(3, var9);
            }
            if (Math.abs(param5) < 100000) {
              discarded$2 = this.a(0, (byte) -80, 0, param4, param3, 2304, 25 + this.field_r);
            }
          }
          if (param4.field_t > 0) {
            stackIn_48_0 = null;
            stackIn_48_1 = null;
            stackIn_48_2 = 6;
            if (param4.field_t > (param4.field_hc >> 4)) {
              stackIn_49_0 = null;
              stackIn_49_1 = null;
              stackIn_49_3 = 1;
            } else {
              stackIn_49_0 = null;
              stackIn_49_1 = null;
              stackIn_49_3 = -1;
            }
            var9Lifetime1 = new je(stackIn_48_2, stackIn_49_3, 2 + this.field_r);
            var9Lifetime1.field_p = true;
            param4.field_B.a(param2 ^ 22, var9Lifetime1);
            if (var10 == 0) {
              return;
            }
          }
          if (Math.abs(param5) < 30000) {
            var9Lifetime2 = new je(6, -param1, this.field_r + 29);
            var9Lifetime2.field_p = true;
            param4.field_B.a(3, var9Lifetime2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_60_0 = var7;
          stackIn_60_1 = new StringBuilder().append("ee.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param4 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param5).append(')').toString());
        }
    }

    ee(int param0, int param1, String[] param2, int[][] param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9) {
        boolean stackIn_8_1 = false;
        mb stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb var11 = null;
        RuntimeException var11_ref = null;
        int[][] var12 = null;
        int var13_int = 0;
        ne var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = SteelSentinels.field_G;
        this.field_g = -1;
        this.field_n = -1;
        this.field_t = 0;
        this.field_w = 0;
        this.field_D = null;
        this.field_m = 0;
        this.field_A = -1;
        this.field_p = false;
        this.field_i = 0;
        this.field_B = -1;
        try {
          this.field_c = param1;
          this.field_Y = param0;
          this.field_P = param5;
          this.field_F = param7;
          this.field_h = param4;
          this.field_D = new ie(new int[]{this.field_Y});
          this.field_kb = param2.length;
          this.field_q = 0;
          this.field_bb = param2;
          this.field_a = 0;
          if (this.field_Y % 8 != 0 &&
            this.field_Y != -1) {
            param6 = 0;
          }
          this.field_N = 621164641;
          this.field_f = 269488144;
          this.field_Q = param6;
          this.field_ab = new hd(this.field_Y, this.field_kb + param6);
          this.field_l = Math.max(this.field_F, 1);
          this.field_ib = 0;
          this.field_eb = 0;
          this.field_s = 0;
          this.field_r = 0;
          this.field_K = new ul();
          this.field_Z = new int[param6 + this.field_kb];
          var12 = new int[][]{ua.field_v, ua.field_x, ua.field_P, ua.field_z, ua.field_N, ua.field_O, ua.field_D, ua.field_J, ua.field_E};
          this.field_W = param8;
          this.field_fb = param9;
          stackIn_8_1 = (this.field_P == 3);
          this.field_lb = stackIn_8_1;
          var13_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var13_int >= (param6 + this.field_kb)))) {
            var11 = new mb((this.field_ab.a(-119) << 4) * (var13_int + 1) / (this.field_kb - (-1 - param6)), -320000, this);
            var14 = var13_int;
            stackIn_101_0 = -1;
            stackIn_101_1 = ~param6;
            if (var19 == 0) {
              if (stackIn_101_0 > stackIn_101_1) {
                if (this.field_kb / 2 > var13_int ||
                  var13_int >= param6 + this.field_kb / 2) {
                  if (var13_int < param6 + this.field_kb / 2) {
                    var14 = -var14 + this.field_kb - 1;
                  } else {
                    var14 = var14 - param6;
                    var14 = -var14 - 1 + this.field_kb;
                  }
                } else {
                  var14 = this.field_kb - (this.field_kb / 2 - var13_int);
                }
              } else {
                var14 = this.field_kb - (1 + var14);
              }
              var15 = var14;
              if (this.field_ab.b(73) == 1 ||
                4 == this.field_ab.b(118)) {
                var15 = var14 * 2 / this.field_kb;
                if (1 == var15) {
                  var11.field_ic = 65793;
                }
              }
              if (3 == this.field_P) {
                var15 = 0;
              }
              if (var14 >= this.field_kb) {
                var16 = 0;
                var17 = 3;
                if (this.field_F >= 1) {
                  var17 = 6;
                }
                if (this.field_F >= 2) {
                  var16 = 3;
                  var17 = 9;
                }
                var18 = var16 + this.field_D.a(-126, -var16 + var17);
                var11.a(var12[var18], true, false, var14, var15);
                var11.field_Nb = 11;
                this.field_K.a(3, var11);
              } else {
                if (param3[var14] != null) {
                  if (0 == this.field_F) {
                    var16 = -1;
                    var17 = param3[var14][0];
                    switch ((var19 == 0
                      || var17 == 55
                      || var17 == 57
                      ) ? var17 : -1) {
                      case 0:
                        var16 = 0;
                        {
                          break;
                        }
                      case 55:
                        var16 = 1;
                        {
                          break;
                        }
                      case 57:
                        var16 = 2;
                        {
                          break;
                        }
                      default:
                        var16 = 1;
                    }
                    param3[var14] = var12[var16];
                  }
                  stackIn_83_0 = var11;
                  stackIn_84_1 = (null != this.field_bb) && (var14 >= 0) && (this.field_bb.length > var14) && (null != this.field_bb[var14]) && (this.field_bb[var14].toLowerCase().startsWith("mod"));
                  stackIn_83_0.field_ib = stackIn_84_1;
                  var11.a(param3[var14], true, false, var14, var15);
                  if (this.field_F == 1 &&
                    6100 < hm.a((byte) 126, var11.field_nb, var11.field_Zb)) {
                    var11.a(ua.field_x, true, false, var14, var15);
                  }
                  if (this.field_U != null) {
                    this.field_U.a(0, (byte) 123, var14, Integer.toString(var11.field_lb));
                  }
                  this.field_K.a(var11, -21459);
                }
              }
              if (this.field_ab.b(115) == 4) {
                var11.j(-5);
                var11.field_Gb = -320000;
                var11.field_Lb = true;
                var11.field_K = 0;
                var11.field_u = true;
                var11.field_ab = 1000;
                var11.field_fc = var11.field_Gb;
                var11.field_Gb = -(this.field_ab.a((byte) -115, var11.field_hc >> 4) << 4) - 500;
                var11.field_z = 500;
                var11.field_fc = var11.field_Gb;
              }
              var11.d(-28033);
              this.field_Z[var13_int] = 50;
              var13_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_z = 4;
            stackIn_101_0 = this.field_ab.b(109);
            stackIn_101_1 = 4;
          }
          if (stackIn_101_0 == stackIn_101_1) {
            this.field_z = 2;
          }
          if (this.field_ab.b(98) == 3) {
            this.field_z = 3;
          }
          this.field_C = new ul();
          this.field_u = new ul();
          this.field_db = new ul();
          this.field_T = new ul();
          if (this.field_h) {
            this.field_O = null;
            this.field_o = null;
            if (var19 != 0) {
              this.field_o = new ul();
              this.field_O = new ul();
            }
          } else {
            this.field_o = new ul();
            this.field_O = new ul();
          }
          this.field_e = new ul();
          this.field_J = new ra();
          this.field_cb = -1;
          if (this.field_lb) {
            this.field_d = 100000;
            this.field_M = 3;
            this.field_gb = 0;
          }
          if (2 == this.field_ab.b(72) &&
            this.field_kb > 1) {
            var13 = new ne(this, 43);
            var13.field_z = (this.field_ab.a(-119) << 4) / 2;
            this.field_e.a(3, var13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_128_0 = var11_ref;
          stackIn_128_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          stackIn_132_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',');
          if (param3 == null) {
            stackIn_133_2 = "null";
          } else {
            stackIn_133_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_I = "If you leave now, your progress will be lost.<br>Log in or create a free account to save your progress.";
        field_k = "Sentinel configuration is now unlocked.<br>Go to the '<col=00ffff>Configuration</col>' screen to choose your sentinel.";
        field_L = "Age:";
        field_jb = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_x = "From only <%0>/month";
    }
}
