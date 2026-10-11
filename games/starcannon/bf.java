/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends rf {
    int field_j;
    bf field_h;
    int field_k;
    int field_o;
    int field_l;
    boolean field_p;
    private int field_g;
    static int field_w;
    int field_u;
    int field_r;
    int field_n;
    int field_z;
    static p field_x;
    private int field_t;
    int field_i;
    private int field_v;
    int field_q;
    private int field_m;
    static int field_s;
    static ue field_y;
    int field_f;

    private final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, d[] param6) {
        int var11 = 0;
        int fieldTemp$0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        d var10 = null;
        int var12 = 0;
        var12 = StarCannon.field_A;
        try {
          var8_int = 0;
          if (param1 < 102) {
            field_x = (p) null;
          }
          if (this.field_k > 0) {
            for (var9 = 0; var9 < 4000; var9++) {
              var10 = param6[var9];
              if (var10 != null && (var10.field_h == 1 ||
                var10.field_h == 10 ||
                var10.field_h == 11 ||
                var10.field_h == 12) && (this.field_k > 0 &&
                param3 > Math.abs(this.field_f - var10.field_d) &&
                param2 > Math.abs(-var10.field_q + this.field_u))) {
                if (var10.field_i == 3) {
                  for (var11 = 0; var11 < 20; var11++) {
                    v.a(new d(var10.field_d, var10.field_q, sa.field_a[var11], sa.field_a[(var11 + 5) % 20], 65535, 1), -4001);
                  }
                }
                if (var10.field_h == 1 &&
                  var10.field_o == 65280) {
                  var10.field_i = this.field_k;
                }
                na.field_d = na.field_d + 1;
                fc.field_e = fc.field_e + ((param4 << 1) - jl.field_d);
                var10.field_o = 0;
                this.field_k = this.field_k - var10.field_i;
                ia.field_k = ia.field_k + param4;
                var10.field_h = 5;
                var10.field_i = 16;
                var10.field_p = 0;
                if (this.field_k <= 0) {
                  if (2 == this.field_q) {
                    wg.field_e = wg.field_e + 1;
                    if (wg.field_e == 50) {
                      ph.a(246, false, 9);
                    }
                    if (wg.field_e == 150) {
                      ph.a(245, false, 10);
                    }
                  }
                  if (this.field_q == 12) {
                    qf.field_h = qf.field_h + 1;
                    if (qf.field_h == 10) {
                      ph.a(248, false, 7);
                    }
                    if (qf.field_h != 30) {
                      return true;
                    }
                    ph.a(247, false, 8);
                  }
                  return true;
                }
                var8_int = 1;
              }
            }
          } else {
            fieldTemp$0 = this.field_r;
            this.field_r = this.field_r + 1;
            if (param5 > fieldTemp$0 &&
              this.field_r % (-qc.field_d + 3) == 0) {
              for (var9 = 0; param0 > var9; var9++) {
                v.a(new d(-16 + this.field_f + sh.b(-126, 32), this.field_u + sh.b(64, 32) - 16, sh.b(-126, 64) + 64, 6), -4001);
              }
            }
          }
          stackIn_55_0 = var8_int;
          return stackIn_55_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_58_0 = var8;
          stackIn_58_1 = new StringBuilder().append("bf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int var3;
        var3 = StarCannon.field_A;
        this.field_g = this.field_g + Math.abs(this.field_n);
        this.field_t = this.field_t + Math.abs(this.field_z);
        if (32 < this.field_g) {
          if (this.field_n < 0) {
            this.field_f = this.field_f - (this.field_g >> 5);
          }
          if (0 < this.field_n) {
            this.field_f = this.field_f + (this.field_g >> 5);
          }
          this.field_g = this.field_g & 31;
        }
        if (this.field_t > 32) {
          if (this.field_z < 0) {
            this.field_u = this.field_u - (this.field_t >> 5);
          }
          if (0 < this.field_z) {
            this.field_u = this.field_u + (this.field_t >> 5);
          }
          this.field_t = 31 & this.field_t;
        }
        if (param0 != -24) {
          return;
        }
        if (this.field_n < 0) {
          this.field_n = this.field_n + 1;
        }
        if (this.field_z < 0) {
          this.field_z = this.field_z + 1;
        }
        if (0 < this.field_n) {
          this.field_n = this.field_n - 1;
        }
        if (0 != this.field_q) {
          this.field_v = 2;
          if (this.field_n < -32) {
            this.field_v = this.field_v - 1;
          }
          if (this.field_n < -16) {
            this.field_v = this.field_v - 1;
          }
          if (this.field_n > 16) {
            this.field_v = this.field_v + 1;
          }
          if (this.field_n > 32) {
            this.field_v = this.field_v + 1;
          }
        } else {
          this.field_v = 4;
          if (this.field_n >= -160) {
            if (-100 > this.field_n) {
              this.field_v = 1;
            } else {
              if (this.field_n >= -40) {
                if (this.field_n < -16) {
                  this.field_v = 3;
                } else {
                  if (this.field_n > 160) {
                    this.field_v = 8;
                  } else {
                    if (this.field_n > 100) {
                      this.field_v = 7;
                    } else {
                      if (this.field_n > 40) {
                        this.field_v = 6;
                      } else {
                        if (16 < this.field_n) {
                          this.field_v = 5;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_v = 2;
              }
            }
          } else {
            this.field_v = 0;
          }
        }
        if (this.field_z > 0) {
          this.field_z = this.field_z - 1;
        }
    }

    private final void d(int param0) {
        if (param0 == ui.field_p &&
          ha.field_d > 0) {
          fi.field_e.field_k = fi.field_e.field_k - 1;
        } else {
          ha.field_d = 512;
          if (0 == ui.field_p) {
            ui.field_p = 16;
          }
          mj.a(96, 12, 0, 27, 100);
        }
    }

    final static int e(int param0) {
        bl.field_b.a((byte) -71);
        if (!jh.field_b.d((byte) -62)) {
          return ck.a((byte) 125);
        }
        if (param0 != 0) {
          return -127;
        }
        return 0;
    }

    private final void a(vi param0, d[] param1, boolean param2, StarCannon param3) {
        int stackIn_28_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        d var7 = null;
        int var8 = 0;
        int var6Lifetime1;
        var8 = StarCannon.field_A;
        try {
          if (!param2) {
            return;
          }
          var5_int = 0;
          if (0 == this.field_v) {
            var5_int = 2;
          }
          if (this.field_v == 1) {
            var5_int = 1;
          }
          if (this.field_v == 3) {
            var5_int = 1;
          }
          if (4 == this.field_v) {
            var5_int = 2;
          }
          tj.field_w = this.field_f;
          if (this.field_k > 0) {
            for (var6 = 0; var6 < 4000; var6++) {
              var7 = param1[var6];
              if (var7 != null &&
                var7.field_h == 2 &&
                16 > Math.abs(-var7.field_d + this.field_f) &&
                16 > Math.abs(-var7.field_q + this.field_u)) {
                param1[var6].field_h = 0;
                param1[var6].field_p = 256;
                if (ha.field_d > 0 &&
                  ui.field_p == 0) {
                  this.field_k = this.field_k - param1[var6].field_i;
                } else {
                  param1[var6].field_p = 16;
                  ui.field_p = 16;
                  ha.field_d = 512;
                  mj.a(96, 12, 0, 27, 100);
                }
              }
            }
            this.field_m = (this.field_m + 1) % 8;
            if (this.field_j > 0) {
              this.field_j = this.field_j + 1;
              var6Lifetime1 = qb.field_e;
              if (var6Lifetime1 != 0) {
                if (var6Lifetime1 == 1) {
                  this.a(param1, -70, param3, var5_int, param0);
                } else {
                  if (var6Lifetime1 == 2) {
                    this.a(-76, param1, param0, param3);
                  }
                }
              } else {
                this.a(param3, var5_int, param1, (byte) -52, param0);
              }
            }
            this.field_r = 0;
          } else {
            this.field_j = 0;
            if (this.field_r == 1) {
              mj.a(128, 12, 0, 19, 100);
            }
            this.field_r = this.field_r + 1;
            if (this.field_r < 128) {
              v.a(new d(-16 + this.field_f + sh.b(65, 32), -16 + this.field_u + sh.b(50, 32), sh.b(-127, 64) + 64), -4001);
              v.a(new d(-24 + this.field_f + sh.b(-126, 48), this.field_u + sh.b(29, 48) - 24, sh.b(47, 64) + 64), -4001);
              v.a(new d(this.field_f + sh.b(117, 64) - 32, this.field_u + sh.b(29, 64) - 32, sh.b(-30, 64) + 64), -4001);
              v.a(new d(-16 + this.field_f + sh.b(91, 32), 16 + this.field_u + sh.b(17, 32), 64 + sh.b(25, 64)), -4001);
              v.a(new d(-24 + (this.field_f + sh.b(-128, 48)), -40 + this.field_u + sh.b(-127, 48), 64 + sh.b(96, 64)), -4001);
              v.a(new d(-16 + (this.field_f + sh.b(119, 32)), this.field_u + sh.b(-126, 32) + 32, sh.b(19, 64) + 64), -4001);
            }
            if (this.field_r > 192) {
              this.field_u = 480;
              this.field_f = 256;
              if (gj.field_c >= 0) {
                gj.field_c = gj.field_c - 1;
                if (gj.field_c < 0) {
                  hh.field_c = 0;
                  dg.field_l = 0;
                  field_w = 0;
                  ha.field_c = 0;
                  mj.a(255, 12, 0, 32, 100);
                  jl.field_j = 5;
                  vb.field_m = 2;
                  this.field_r = 256;
                  if (!wk.a(119)) {
                    pg.a(true, (byte) -98);
                    sa.a(nf.field_l + 3 * na.field_a, 23820);
                    fc.field_e = fc.field_e - (ia.field_k << 1);
                    ia.field_k = 0;
                  } else {
                    stackIn_28_0 = -104;
                    if (0 >= ia.field_k &&
                      0 == jg.field_H) {
                      stackIn_30_1 = 0;
                    } else {
                      stackIn_30_1 = 6;
                    }
                    od.a(stackIn_28_0, stackIn_30_1, false);
                  }
                } else {
                  dg.field_l = 0;
                  mj.a(96, 12, 0, 22, 100);
                  mj.a(255, 12, 0, 44, 100);
                  this.field_f = 320;
                  tj.field_G = 150;
                  this.field_r = 0;
                  this.field_u = 580;
                  ha.field_d = 512;
                  this.field_k = 1;
                  ui.field_p = 16;
                }
              }
            }
            if (ah.field_a != null) {
              ah.field_a.h(6000);
              ah.field_a = null;
            }
            if (null != ok.field_tb) {
              param0.a(ok.field_tb);
              ok.field_tb = null;
            }
            this.field_z = this.field_z + 10;
          }
          this.b((byte) -24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("bf.P(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final boolean a(d[] param0, StarCannon param1, int param2) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        int var9 = 0;
        int var14 = 0;
        vi var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = jk.field_k;
                        if (param2 > 60) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b((byte) 102);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        statePc = ((Object) stateCaught_2 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_2);
                        }
                        caughtException = stateCaught_2;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = this.field_q;
                        if (0 != var9) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        statePc = ((Object) stateCaught_3 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_3);
                        }
                        caughtException = stateCaught_3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalStateException("control fell off non-void method");
                    } catch (Throwable stateCaught_4) {
                        statePc = ((Object) stateCaught_4 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_4);
                        }
                        caughtException = stateCaught_4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var9 != 22) {
                            /* Inlined CFG state: 7. */
                            {
                                if (var9 == 17) {
                                    statePc = -1;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 8. */
                                    {
                                        if (var9 == 18) {
                                            statePc = -1;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 9. */
                                            {
                                                if (var9 != 19) {
                                                    /* Inlined CFG state: 11. */
                                                    {
                                                        switch (var9) {
                                                            case 1: statePc = -1; break;
                                                            case 2: statePc = -1; break;
                                                            case 3: statePc = -1; break;
                                                            case 4: statePc = -1; break;
                                                            case 5: statePc = -1; break;
                                                            case 6: statePc = -1; break;
                                                            case 7: statePc = -1; break;
                                                            case 8: statePc = -1; break;
                                                            case 9: statePc = -1; break;
                                                            case 10: statePc = -1; break;
                                                            case 11: statePc = -1; break;
                                                            case 12: statePc = -1; break;
                                                            case 21: statePc = -1; break;
                                                            case 13: statePc = -1; break;
                                                            case 14: statePc = -1; break;
                                                            case 15: statePc = -1; break;
                                                            case 16: statePc = -1; break;
                                                            default: statePc = 12; break;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 10. */
                                                    {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 6. */
                            {
                                throw new IllegalStateException("control fell off non-void method");
                            }
                        }
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 14 : -1);
                        if (statePc == -1) {
                            throw bf.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var4);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("bf.J(");
                    stackIn_15_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = stackIn_15_0;
                    stackIn_17_1 = stackIn_15_1;
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = stackIn_16_0;
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = stackIn_17_0;
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
                        /* Inlined CFG state: 19. */
                        {
                            stackIn_20_0 = stackIn_19_0;
                            stackIn_20_1 = stackIn_19_1;
                            stackIn_20_2 = "null";
                            statePc = 20;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 18. */
                        {
                            stackIn_20_0 = stackIn_18_0;
                            stackIn_20_1 = stackIn_18_1;
                            stackIn_20_2 = "{...}";
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                }
                case 20: {
                    throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(StarCannon param0, int param1, d[] param2, byte param3, vi param4) {
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        vi var8 = null;
        var7 = StarCannon.field_A;
        try {
          var6_int = sd.field_c;
          if (0 != var6_int) {
            if (var6_int != 1) {
              if (var6_int != 2) {
                if (var6_int != 3) {
                  if (4 == var6_int) {
                    if (this.field_j >= 5) {
                      this.a(65535, -13, -256, -16 + param1, -48, 1, param2, -116);
                      this.a(65535, -13, -256, 8 - param1, 48, 1, param2, -120);
                      this.a(65535, -18, -256, param1 - 11, 8, 1, param2, -59);
                      this.a(65535, -18, -256, -param1 + 3, -8, 1, param2, param3 - 15);
                      mj.a(dg.field_l * 3 / 5, 12, 0, 12, 67);
                      this.field_j = 0;
                    }
                  } else {
                    if (var6_int == 5) {
                      if (this.field_j >= 5) {
                        this.a(65535, -7, -256, -16 + param1, -48, 1, param2, -62);
                        this.a(-26, 65535, param2, -107, 8, -384, 2, 1, -12 + param1);
                        this.a(-26, 65535, param2, -119, -8, -384, 2, 1, 3 - param1);
                        this.a(65535, -7, -256, -param1 + 8, 48, 1, param2, param3 - 38);
                        mj.a(7 * dg.field_l / 10, param3 ^ -64, 0, 11, 67);
                        this.field_j = 0;
                      }
                    } else {
                      if (6 == var6_int) {
                        if (5 <= this.field_j) {
                          this.a(65535, -7, -256, param1 - 20, -48, 1, param2, -123);
                          this.a(-26, 65535, param2, param3 - 65, 8, -384, 2, 1, -12 + param1);
                          this.a(65535, -22, -256, -6, -24, 1, param2, -108);
                          this.a(65535, -22, -256, -2, 24, 1, param2, -118);
                          this.a(-26, 65535, param2, param3 ^ 74, -8, -384, 2, 1, -param1 + 3);
                          this.a(65535, -7, -256, -param1 + 12, 48, 1, param2, param3 - 30);
                          mj.a(7 * dg.field_l / 10, 12, 0, 12, 67);
                          this.field_j = 0;
                        }
                      } else {
                        if (var6_int != 7) {
                          if (var6_int != 8) {
                            if (var6_int != 9) {
                              if (var6_int != 10) {
                                if (11 != var6_int) {
                                  if (var6_int != 12) {
                                    if (var6_int == 13) {
                                      if (3 == this.field_j) {
                                        this.a(-22, 65535, param2, -119, -16, -384, 2, 1, -7);
                                        this.a(-22, 65535, param2, -105, 16, -384, 2, 1, -2);
                                      }
                                      if (this.field_j >= 5) {
                                        this.field_j = 0;
                                        this.a(-6, 65535, param2, -108, -80, -384, 2, 1, param1 - 22);
                                        this.a(-7, 65535, param2, -114, -64, -384, 2, 1, -20 + param1);
                                        this.a(-18, 65535, param2, -119, 8, -384, 2, 1, -12 + param1);
                                        this.a(-22, 16776960, param2, -104, -32, -384, 4, 1, -7);
                                        this.a(-22, 16776960, param2, -117, 32, -384, 4, 1, -2);
                                        this.a(-18, 65535, param2, -112, -8, -384, 2, 1, 3 - param1);
                                        this.a(-7, 65535, param2, -124, 64, -384, 2, 1, 12 - param1);
                                        this.a(-6, 65535, param2, -113, 80, -384, 2, 1, -param1 + 14);
                                        mj.a(dg.field_l, 12, 0, 11, 50);
                                      }
                                    } else {
                                      if (var6_int != 14) {
                                        if (var6_int != 15) {
                                          if (16 == var6_int) {
                                            if (3 == this.field_j) {
                                              this.a(-18, 16776960, param2, -115, 4, -384, 1, 1, -12 + param1);
                                              this.a(-22, 16776960, param2, -126, -16, -384, 4, 1, -7);
                                              this.a(-22, 16776960, param2, -122, 16, -384, 4, 1, -2);
                                              this.a(-18, 16776960, param2, -122, -4, -384, 1, 1, -param1 + 3);
                                              mj.a(dg.field_l >> 1, param3 + 64, 0, 12, 50);
                                            }
                                            if (this.field_j >= 5) {
                                              this.field_j = 0;
                                              this.a(-6, 65535, param2, param3 - 69, -80, -384, 2, 1, param1 - 22);
                                              this.a(-7, 16776960, param2, param3 - 71, -64, -384, 4, 1, -20 + param1);
                                              this.a(-18, 16776960, param2, -122, 8, -384, 4, 1, -12 + param1);
                                              this.a(-22, 16776960, param2, param3 ^ 75, -32, -384, 4, 1, -7);
                                              this.a(-22, 16776960, param2, -113, 32, -384, 4, 1, -2);
                                              this.a(-18, 16776960, param2, param3 ^ 64, -8, -384, 4, 1, 3 - param1);
                                              this.a(-7, 16776960, param2, -116, 64, -384, 4, 1, 12 - param1);
                                              this.a(-6, 65535, param2, -126, 80, -384, 2, 1, 14 - param1);
                                              mj.a(dg.field_l, 12, 0, 11, 50);
                                            }
                                          } else {
                                            if (var6_int == 17) {
                                              if (this.field_j == 3) {
                                                this.a(-22, 16777215, param2, -121, -16, -384, 8, 1, -7);
                                                this.a(-22, 16777215, param2, -110, 16, -384, 8, 1, -2);
                                                mj.a(dg.field_l >> 1, param3 ^ -64, 0, 12, 50);
                                              }
                                              if (this.field_j >= 5) {
                                                this.field_j = 0;
                                                this.a(-6, 65535, param2, -123, -80, -384, 2, 1, param1 - 22);
                                                this.a(-7, 16776960, param2, param3 ^ 76, -64, -384, 4, 1, param1 - 20);
                                                this.a(-18, 16777215, param2, -126, 8, -384, 8, 1, param1 - 12);
                                                this.a(-22, 16777215, param2, -126, -32, -384, 8, 1, -7);
                                                this.a(-22, 16777215, param2, param3 - 72, 32, -384, 8, 1, -2);
                                                this.a(-18, 16777215, param2, -113, -8, -384, 8, 1, 3 - param1);
                                                this.a(-7, 16776960, param2, -120, 64, -384, 4, 1, 12 - param1);
                                                this.a(-6, 65535, param2, -104, 80, -384, 2, 1, 14 - param1);
                                                mj.a(dg.field_l, 12, 0, 11, 50);
                                              }
                                            }
                                          }
                                        } else {
                                          if (3 == this.field_j) {
                                            this.a(-22, 65535, param2, -114, -16, -384, 2, 1, -7);
                                            this.a(-22, 65535, param2, -122, 16, -384, 2, 1, -2);
                                            mj.a(2 * dg.field_l / 5, 12, 0, 11, 50);
                                          }
                                          if (this.field_j >= 5) {
                                            this.field_j = 0;
                                            this.a(-6, 65535, param2, -121, -80, -384, 1, 1, -22 + param1);
                                            this.a(-7, 16776960, param2, -124, -64, -384, 4, 1, -20 + param1);
                                            this.a(-18, 16776960, param2, -112, 8, -384, 4, 1, param1 - 12);
                                            this.a(-22, 16776960, param2, -109, -32, -384, 4, 1, -7);
                                            this.a(-22, 16776960, param2, -123, 32, -384, 4, 1, -2);
                                            this.a(-18, 16776960, param2, -121, -8, -384, 4, 1, 3 - param1);
                                            this.a(-7, 16776960, param2, param3 ^ 88, 64, -384, 4, 1, -param1 + 12);
                                            this.a(-6, 65535, param2, -105, 80, -384, 1, 1, -param1 + 14);
                                            mj.a(dg.field_l * 4 / 5, 12, 0, 12, 50);
                                          }
                                        }
                                      } else {
                                        if (this.field_j == 3) {
                                          this.a(-22, 65535, param2, -122, -16, -384, 2, 1, -7);
                                          this.a(-22, 65535, param2, -107, 16, -384, 2, 1, -2);
                                          mj.a(2 * dg.field_l / 5, 12, 0, 12, 50);
                                        }
                                        if (this.field_j >= 5) {
                                          this.field_j = 0;
                                          this.a(-6, 65535, param2, param3 ^ 75, -80, -384, 1, 1, param1 - 22);
                                          this.a(-7, 65535, param2, -106, -64, -384, 2, 1, -20 + param1);
                                          this.a(-18, 16776960, param2, param3 - 65, 8, -384, 4, 1, -12 + param1);
                                          this.a(-22, 16776960, param2, param3 ^ 68, -32, -384, 4, 1, -7);
                                          this.a(-22, 16776960, param2, -122, 32, -384, 4, 1, -2);
                                          this.a(-18, 16776960, param2, param3 - 55, -8, -384, 4, 1, 3 - param1);
                                          this.a(-7, 65535, param2, -109, 64, -384, 2, 1, -param1 + 12);
                                          this.a(-6, 65535, param2, -119, 80, -384, 1, 1, 14 - param1);
                                          mj.a(4 * dg.field_l / 5, param3 + 64, 0, 11, 50);
                                        }
                                      }
                                    }
                                  } else {
                                    if (this.field_j == 3) {
                                      this.a(-22, 65535, param2, -125, -16, -384, 2, 1, -7);
                                      this.a(-22, 65535, param2, -109, 16, -384, 2, 1, -2);
                                    }
                                    if (this.field_j >= 5) {
                                      this.a(-6, 65535, param2, param3 - 54, -80, -384, 2, 1, param1 - 22);
                                      this.a(-7, 65535, param2, -111, -64, -384, 2, 1, param1 - 20);
                                      this.a(-18, 65535, param2, param3 - 63, 8, -384, 2, 1, param1 - 12);
                                      this.a(-22, 65535, param2, -104, -32, -384, 2, 1, -7);
                                      this.a(-22, 65535, param2, param3 ^ 91, 32, -384, 2, 1, -2);
                                      this.a(-18, 65535, param2, -121, -8, -384, 2, 1, 3 - param1);
                                      this.a(-7, 65535, param2, -126, 64, -384, 2, 1, -param1 + 12);
                                      this.a(-6, 65535, param2, param3 ^ 67, 80, -384, 2, 1, -param1 + 14);
                                      mj.a(9 * dg.field_l / 10, param3 ^ -64, 0, 12, 50);
                                      this.field_j = 0;
                                    }
                                  }
                                } else {
                                  if (5 <= this.field_j) {
                                    this.a(-6, 65535, param2, -128, -80, -384, 2, 1, -22 + param1);
                                    this.a(-7, 65535, param2, param3 - 76, -64, -384, 2, 1, param1 - 20);
                                    this.a(-18, 65535, param2, -125, 8, -384, 2, 1, -12 + param1);
                                    this.a(-22, 65535, param2, -118, -32, -384, 2, 1, -7);
                                    this.a(-22, 65535, param2, -105, 32, -384, 2, 1, -2);
                                    this.a(-18, 65535, param2, -123, -8, -384, 2, 1, -param1 + 3);
                                    this.a(-7, 65535, param2, -124, 64, -384, 2, 1, -param1 + 12);
                                    this.a(-6, 65535, param2, param3 - 56, 80, -384, 2, 1, -param1 + 14);
                                    mj.a(9 * dg.field_l / 10, 12, 0, 11, 50);
                                    this.field_j = 0;
                                  }
                                }
                              } else {
                                if (5 <= this.field_j) {
                                  this.a(-6, 65535, param2, -109, -80, -384, 1, 1, -22 + param1);
                                  this.a(-7, 65535, param2, param3 - 60, -64, -384, 2, 1, param1 - 20);
                                  this.a(-18, 65535, param2, -116, 8, -384, 2, 1, param1 - 12);
                                  this.a(-22, 65535, param2, -122, -32, -384, 2, 1, -7);
                                  this.a(-22, 65535, param2, -113, 32, -384, 2, 1, -2);
                                  this.a(-18, 65535, param2, -104, -8, -384, 2, 1, 3 - param1);
                                  this.a(-7, 65535, param2, -119, 64, -384, 2, 1, -param1 + 12);
                                  this.a(-6, 65535, param2, -106, 80, -384, 1, 1, 14 - param1);
                                  mj.a(4 * dg.field_l / 5, 12, 0, 12, 50);
                                  this.field_j = 0;
                                }
                              }
                            } else {
                              if (5 <= this.field_j) {
                                this.a(-6, 65535, param2, -125, -80, -384, 1, 1, -22 + param1);
                                this.a(-7, 65535, param2, -124, -64, -384, 1, 1, -20 + param1);
                                this.a(-18, 65535, param2, -112, 8, -384, 2, 1, param1 - 12);
                                this.a(-22, 65535, param2, param3 - 53, -32, -384, 2, 1, -7);
                                this.a(-22, 65535, param2, -120, 32, -384, 2, 1, -2);
                                this.a(-18, 65535, param2, -124, -8, -384, 2, 1, 3 - param1);
                                this.a(-7, 65535, param2, -128, 64, -384, 1, 1, -param1 + 12);
                                this.a(-6, 65535, param2, param3 - 54, 80, -384, 1, 1, -param1 + 14);
                                mj.a(4 * dg.field_l / 5, 12, 0, 11, 50);
                                this.field_j = 0;
                              }
                            }
                          } else {
                            if (5 <= this.field_j) {
                              this.a(-7, 65535, param2, -115, -64, -384, 2, 1, -20 + param1);
                              this.a(-18, 65535, param2, -110, 8, -384, 2, 1, param1 - 12);
                              this.a(-22, 65535, param2, param3 - 58, -32, -384, 2, 1, -7);
                              this.a(-22, 65535, param2, -121, 32, -384, 2, 1, -2);
                              this.a(-18, 65535, param2, -127, -8, -384, 2, 1, -param1 + 3);
                              this.a(-7, 65535, param2, -110, 64, -384, 2, 1, 12 - param1);
                              mj.a(7 * dg.field_l / 10, 12, 0, 12, 50);
                              this.field_j = 0;
                            }
                          }
                        } else {
                          if (this.field_j >= 5) {
                            this.a(65535, -7, -256, -20 + param1, -64, 1, param2, param3 ^ 72);
                            this.a(-18, 65535, param2, -109, 8, -384, 2, 1, param1 - 12);
                            this.a(-22, 65535, param2, -125, -32, -384, 2, 1, -7);
                            this.a(-22, 65535, param2, -114, 32, -384, 2, 1, -2);
                            this.a(-18, 65535, param2, -125, -8, -384, 2, 1, -param1 + 3);
                            this.a(65535, -7, -256, 12 - param1, 64, 1, param2, -66);
                            mj.a(dg.field_l * 7 / 10, param3 ^ -64, 0, 11, 50);
                            this.field_j = 0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (5 <= this.field_j) {
                    this.a(65535, -13, -256, -16 + param1, -32, 1, param2, -66);
                    this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -113);
                    this.a(65535, -22, -256, -4, 0, 1, param2, param3 - 22);
                    mj.a(dg.field_l * 3 / 5, 12, 0, 11, 67);
                    this.field_j = 0;
                  }
                }
              } else {
                if (5 <= this.field_j) {
                  this.a(65535, -13, -256, param1 - 16, -16, 1, param2, -84);
                  this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -109);
                  mj.a(3 * dg.field_l / 5, 12, 0, 12, 75);
                  this.field_j = 0;
                }
              }
            } else {
              if (this.field_j == 5) {
                this.a(65535, -13, -256, -16 + param1, -32, 1, param2, -122);
                this.a(65535, -13, -256, -param1 + 8, 32, 1, param2, -112);
              }
              if (this.field_j == 10) {
                this.a(65535, -22, -256, -4, 0, 1, param2, -106);
              }
              if (this.field_j % 5 == 0) {
                mj.a(3 * dg.field_l / 5, param3 + 64, 0, 11, 75);
              }
              if (this.field_j >= 10) {
                this.field_j = 0;
              }
            }
          } else {
            if (this.field_j == 4) {
              this.a(65535, -13, -256, param1 - 16, -16, 1, param2, -99);
            }
            if (this.field_j == 8) {
              this.a(65535, -13, -256, -param1 + 8, 16, 1, param2, -118);
            }
            if ((3 & this.field_j) == 0) {
              mj.a(dg.field_l >> 1, 12, 0, 12, 75);
            }
            if (8 <= this.field_j) {
              this.field_j = 0;
            }
          }
          if (param3 != -52) {
            var8 = (vi) null;
            this.a((d[]) null, -4, (StarCannon) null, -30, (vi) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_108_0 = var6;
          stackIn_108_1 = new StringBuilder().append("bf.C(");
          if (param0 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          stackIn_111_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, d[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        d var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        try {
          if (param3 > -103) {
            this.field_g = -91;
          }
          var10 = new d(this.field_f + param8, param0 + this.field_u, param4, param5, param1, param7, param6, 0);
          if (v.a(var10, -4001)) {
            var10.field_a = this.field_f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("bf.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          kl.a(param1, 8192);
          int var2_int = -81 / ((-14 - param0) / 60);
          sc.a(false, (byte) 106, bl.field_c);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, d[] param5, int param6, int param7, int param8, int param9) {
        d[] var12 = null;
        d var13 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          var13 = new d(param9 + param4, param1 + this.field_u, param3, param0, param6, param2, param8, 0);
          if (v.a(var13, -4001)) {
            var13.field_a = param9;
          }
          if (param7 != -11) {
            var12 = (d[]) null;
            this.a(-54, 82, -43, 39, 0, -17, (d[]) null, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_7_0 = var11;
          stackIn_7_1 = new StringBuilder().append("bf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(int param0, d[] param1, vi param2, StarCannon param3) {
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_177_2 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_180_2 = null;
        StringBuilder stackIn_182_1 = null;
        String stackIn_183_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = StarCannon.field_A;
        try {
          var5_int = this.field_f;
          if (param0 >= -1) {
            return;
          }
          var6 = sd.field_c;
          if (0 != var6) {
            if (var6 != 1) {
              if (var6 == 2) {
                if (this.field_j == 4 ||
                  this.field_j == 8) {
                  this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                }
                if (this.field_j == 4) {
                  mj.a(dg.field_l * 4 / 7, 12, 0, 18, 80);
                }
                if (this.field_j >= 8) {
                  this.field_j = 0;
                }
              } else {
                if (var6 != 3) {
                  if (var6 != 4) {
                    if (var6 == 5) {
                      if (3 == this.field_j ||
                        this.field_j == 6) {
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                        this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                      }
                      if (3 == this.field_j) {
                        mj.a(4 * dg.field_l / 7, 12, 0, 18, 80);
                      }
                      if (this.field_j >= 6) {
                        this.field_j = 0;
                      }
                    } else {
                      if (var6 != 6) {
                        if (var6 != 7) {
                          if (var6 == 8) {
                            if (this.field_j == 2) {
                              this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                              this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                              mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                            }
                            if (5 == this.field_j) {
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                              this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                            }
                            if (this.field_j >= 5) {
                              this.field_j = 0;
                            }
                          } else {
                            if (var6 == 9) {
                              if (2 == this.field_j) {
                                this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 0);
                                mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                              }
                              if (this.field_j == 4) {
                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                              }
                              if (this.field_j >= 4) {
                                this.field_j = 0;
                              }
                            } else {
                              if (var6 != 10) {
                                if (11 == var6) {
                                  if (this.field_j == 2) {
                                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -8);
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 8);
                                    mj.a(dg.field_l, 12, 0, 18, 100);
                                  }
                                  if (this.field_j == 4) {
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                    this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                  }
                                  if (this.field_j >= 4) {
                                    this.field_j = 0;
                                  }
                                } else {
                                  if (var6 == 12) {
                                    if (this.field_j == 2) {
                                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -8);
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 8);
                                      mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
                                    }
                                    if (4 == this.field_j) {
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                      this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                    }
                                    if (this.field_j >= 4) {
                                      this.field_j = 0;
                                    }
                                  } else {
                                    if (var6 == 13) {
                                      if (this.field_j == 2) {
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                        mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                      }
                                      if (4 == this.field_j) {
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                        this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                      }
                                      if (this.field_j >= 4) {
                                        this.field_j = 0;
                                      }
                                    } else {
                                      if (var6 != 14) {
                                        if (var6 != 15) {
                                          if (var6 == 16) {
                                            if (this.field_j == 2) {
                                              this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                              this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                              mj.a(4 * dg.field_l / 7, 12, 0, 17, 50);
                                            }
                                            if (this.field_j == 4) {
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -12);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                              this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 12);
                                            }
                                            if (this.field_j >= 4) {
                                              this.field_j = 0;
                                            }
                                          } else {
                                            if (17 == var6) {
                                              if (2 == this.field_j) {
                                                this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, -12);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                                this.a(-512, -22, 12, 0, 0, param1, 65535, -11, 2, 12);
                                                mj.a(dg.field_l * 3 / 7, 12, 0, 16, 100);
                                              }
                                              if (this.field_j == 4) {
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -12);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -10);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -6);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, -2);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 2);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 6);
                                                this.a(-512, -22, 12, 0, 0, param1, 8454143, -11, 4, 10);
                                                this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 12);
                                                mj.a(3 * dg.field_l / 7, 12, 0, 16, 50);
                                              }
                                              if (this.field_j >= 4) {
                                                this.field_j = 0;
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_j == 2) {
                                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                            mj.a(4 * dg.field_l / 7, 12, 0, 16, 50);
                                          }
                                          if (this.field_j == 4) {
                                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -12);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                            this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 12);
                                          }
                                          if (this.field_j >= 4) {
                                            this.field_j = 0;
                                          }
                                        }
                                      } else {
                                        if (2 == this.field_j) {
                                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -8);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 8);
                                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                          mj.a(dg.field_l * 4 / 7, 12, 0, 18, 50);
                                        }
                                        if (4 == this.field_j) {
                                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -12);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                          this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                          this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 12);
                                        }
                                        if (4 <= this.field_j) {
                                          this.field_j = 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (this.field_j == 2) {
                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 0);
                                  mj.a(dg.field_l * 4 / 7, 12, 0, 17, 50);
                                }
                                if (4 == this.field_j) {
                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, -4);
                                  this.a(-512, -22, 12, 0, 0, param1, 16777215, -11, 4, 4);
                                }
                                if (4 <= this.field_j) {
                                  this.field_j = 0;
                                }
                              }
                            }
                          }
                        } else {
                          if (2 == this.field_j) {
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                            mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
                          }
                          if (this.field_j == 4) {
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                            this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                          }
                          if (this.field_j >= 4) {
                            this.field_j = 0;
                          }
                        }
                      } else {
                        if (this.field_j == 2) {
                          this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                          this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                          mj.a(dg.field_l * 4 / 7, 12, 0, 16, 75);
                        }
                        if (this.field_j == 5) {
                          this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                          this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                        }
                        if (this.field_j >= 5) {
                          this.field_j = 0;
                        }
                      }
                    }
                  } else {
                    if (this.field_j == 2) {
                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, 4);
                      mj.a(dg.field_l * 3 / 7, 12, 0, 17, 80);
                    }
                    if (4 == this.field_j) {
                      this.a(-512, -22, 12, 0, 0, param1, 16776960, -11, 2, -4);
                    }
                    if (this.field_j >= 4) {
                      this.field_j = 0;
                    }
                  }
                } else {
                  if (2 == this.field_j) {
                    mj.a(4 * dg.field_l / 7, 12, 0, 16, 80);
                  }
                  if (3 == this.field_j ||
                    this.field_j == 6) {
                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, -4);
                    this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 4);
                  }
                  if (this.field_j >= 6) {
                    this.field_j = 0;
                  }
                }
              }
            } else {
              if (this.field_j == 3 ||
                this.field_j == 6) {
                this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
              }
              if (this.field_j == 3) {
                mj.a(dg.field_l * 4 / 7, 12, 0, 17, 80);
              }
              if (this.field_j >= 6) {
                this.field_j = 0;
              }
            }
          } else {
            if (this.field_j == 4 ||
              this.field_j == 8) {
              this.a(-512, -22, 12, 0, 0, param1, 16711680, -11, 1, 0);
            }
            if (this.field_j == 4) {
              mj.a(dg.field_l * 4 / 7, 12, 0, 16, 50);
            }
            if (this.field_j >= 8) {
              this.field_j = 0;
            }
          }
          this.field_f = var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_176_0 = var5;
          stackIn_176_1 = new StringBuilder().append("bf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_177_2 = "null";
          } else {
            stackIn_177_2 = "{...}";
          }
          stackIn_179_1 = ((StringBuilder) (Object) stackIn_176_1).append(stackIn_177_2).append(',');
          if (param2 == null) {
            stackIn_180_2 = "null";
          } else {
            stackIn_180_2 = "{...}";
          }
          stackIn_182_1 = ((StringBuilder) (Object) stackIn_179_1).append(stackIn_180_2).append(',');
          if (param3 == null) {
            stackIn_183_2 = "null";
          } else {
            stackIn_183_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_176_0), ((StringBuilder) (Object) stackIn_182_1).append(stackIn_183_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, d[] param6, int param7) {
        try {
          this.a(param1, param0, param6, -108, param4, param2, 1, param5, param3);
          if (param7 > -54) {
            this.field_t = -2;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bf.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static int a(int param0, boolean param1, String param2, byte param3, ma param4, ma param5, int param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        rb stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        String stackIn_10_2 = null;
        rb stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        String stackIn_13_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        String var13 = null;
        CharSequence var14 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        try {
          var13 = param5.b(123);
          var8 = param4.b(123);
          if (m.field_b == null &&
            !jh.a((byte) -68, false)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (r.field_c == ua.field_b) {
            d.field_b.field_g = 0;
            oj.field_g = null;
            if (param2 != null) {
              var9 = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              ck.field_g.field_g = 0;
              ck.field_g.c((byte) -113, di.field_l.nextInt());
              ck.field_g.c((byte) -125, di.field_l.nextInt());
              ck.field_g.a(false, var13);
              ck.field_g.a(false, var8);
              var14 = (CharSequence) ((Object) param2);
              ck.field_g.a(false, cc.a(20755, var14));
              ck.field_g.c(param6, -306);
              ck.field_g.a(param0, param3 - 133);
              ck.field_g.a(var9, -107);
              d.field_b.a(18, -116);
              d.field_b.field_g = d.field_b.field_g + 2;
              var10 = d.field_b.field_g;
              var11_ref_String = uj.a(ll.b(112), 61);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              d.field_b.b(false, var11_ref_String);
              fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
              d.field_b.a((byte) 88, -var10 + d.field_b.field_g);
            } else {
              ck.field_g.field_g = 0;
              ck.field_g.c((byte) -86, di.field_l.nextInt());
              ck.field_g.c((byte) -95, di.field_l.nextInt());
              stackIn_9_0 = ck.field_g;
              stackIn_9_1 = false;
              if (param5.c(param3 ^ 6)) {
                stackIn_10_2 = var13;
              } else {
                stackIn_10_2 = "";
              }
              ((rb) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
              stackIn_12_0 = ck.field_g;
              stackIn_12_1 = false;
              if (param4.c(0)) {
                stackIn_13_2 = var8;
              } else {
                stackIn_13_2 = "";
              }
              ((rb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2);
              d.field_b.a(16, param3 ^ -64);
              d.field_b.field_g = d.field_b.field_g + 1;
              var9 = d.field_b.field_g;
              fc.a(ck.field_g, d.field_b, ed.field_j, gg.field_e, 0);
              d.field_b.b(d.field_b.field_g - var9, 31700);
            }
            nf.a(-1, (byte) 95);
            r.field_c = eb.field_a;
          }
          if (eb.field_a == r.field_c &&
            ag.a(param3 ^ 122, 1)) {
            var9Lifetime1 = se.field_p.j(param3 ^ 7907);
            se.field_p.field_g = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              r.field_c = dh.field_a;
              ph.field_nb = new String[var9Lifetime1 - 100];
            } else {
              if (var9Lifetime1 == 248) {
                mi.a(param3 ^ 1048582, ll.b(param3 ^ 109));
                uj.field_r = vk.field_x;
                ec.a((byte) 27);
                eb.field_f = false;
                stackIn_31_0 = var9Lifetime1;
                return stackIn_31_0;
              }
              if (var9Lifetime1 != 99) {
                r.field_c = ab.field_F;
                il.field_g = -1;
                vh.field_t = var9Lifetime1;
              } else {
                ag.a(124, gd.a(true));
                oj.field_g = new Boolean(vf.a(se.field_p, param3 - 6));
                se.field_p.field_g = 0;
              }
            }
          }
          if (dh.field_a == r.field_c) {
            var9Lifetime2 = 2;
            if (ag.a(125, var9Lifetime2)) {
              var10Lifetime1 = se.field_p.i(param3 ^ -1174051986);
              se.field_p.field_g = 0;
              if (ag.a(126, var10Lifetime1)) {
                var11 = ph.field_nb.length;
                for (var12 = 0; var12 < var11; var12++) {
                  ph.field_nb[var12] = se.field_p.h(-12287);
                }
                ec.a((byte) 27);
                eb.field_f = false;
                stackIn_41_0 = var11 + 100;
                return stackIn_41_0;
              }
            }
          }
          if (param3 != 6) {
            bf.a(-76);
          }
          if (r.field_c == ab.field_F &&
            fk.a(false)) {
            if (255 == vh.field_t) {
              var9_ref_String = se.field_p.b((byte) -86);
              if (var9_ref_String != null) {
                lj.a(var9_ref_String, param3 ^ 121, ll.b(111));
              }
            } else {
              uj.field_r = se.field_p.a(-125);
            }
            ec.a((byte) 27);
            eb.field_f = false;
            stackIn_52_0 = vh.field_t;
            return stackIn_52_0;
          }
          if (null == m.field_b) {
            if (eb.field_f) {
              if (30000L >= kg.b((byte) -71)) {
                uj.field_r = va.field_o;
              } else {
                uj.field_r = ti.field_g;
              }
              eb.field_f = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = sj.field_I;
            sj.field_I = pe.field_c;
            eb.field_f = true;
            pe.field_c = var9Lifetime3;
          }
          stackIn_63_0 = -1;
          return stackIn_63_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_66_0 = var7;
          stackIn_66_1 = new StringBuilder().append("bf.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != 15415) {
          field_w = 4;
        }
        field_y = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        ma var9 = null;
        CharSequence var10 = null;
        try {
          if (0 == param0) {
            stackIn_2_0 = "";
            return stackIn_2_0;
          }
          if (1 == param0) {
            var10 = param3[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_9_0 = var10.toString();
              return stackIn_9_0;
            }
            stackIn_7_0 = "null";
            return stackIn_7_0;
          }
          if (param2 != 4) {
            var9 = (ma) null;
            bf.a(62, false, (String) null, (byte) 43, (ma) null, (ma) null, -127);
          }
          var4_int = param1 + param0;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param3[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_25_0 = var6.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("bf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(d[] param0, int param1, StarCannon param2, int param3, vi param4) {
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        String stackIn_375_2 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_378_2 = null;
        StringBuilder stackIn_380_1 = null;
        String stackIn_381_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = StarCannon.field_A;
        try {
          var6_int = sd.field_c;
          if (var6_int != 0) {
            if (var6_int != 1) {
              if (var6_int == 2) {
                if (this.field_j == 4) {
                  this.a(-11, 65280, param0, -128, -32, -64, 2, 11, -param3 - 12);
                }
                if (6 == this.field_j) {
                  this.a(-11, 65280, param0, -113, 32, -64, 2, 11, 4 - param3);
                }
                if (this.field_j == 4 ||
                  6 == this.field_j) {
                  mj.a(dg.field_l * 3 / 10, 12, 0, 13, 40);
                }
                if (this.field_j >= 10) {
                  this.field_j = 0;
                }
              } else {
                if (var6_int == 3) {
                  if (this.field_j == 8) {
                    this.a(-11, 65280, param0, -104, -32, -64, 2, 11, -12 - param3);
                  }
                  if (this.field_j == 12) {
                    this.a(-11, 65280, param0, -106, 32, -64, 2, 11, -param3 + 4);
                  }
                  if (10 == this.field_j) {
                    this.a(-9, 65280, param0, -109, -128, -16, 2, 11, -param3 - 16);
                  }
                  if (this.field_j == 14) {
                    this.a(-9, 65280, param0, -112, 128, -16, 2, 11, -param3 + 8);
                  }
                  if (this.field_j == 16) {
                    this.a(-10, 65280, param0, -128, -96, -32, 2, 11, -14 - param3);
                  }
                  if (20 == this.field_j) {
                    this.a(-10, 65280, param0, -107, 96, -32, 2, 11, -param3 + 6);
                  }
                  if (0 == (3 & this.field_j) &&
                    this.field_j > 4) {
                    mj.a(2 * dg.field_l / 5, 12, 0, 14, 50);
                  }
                  if (this.field_j >= 20) {
                    this.field_j = 0;
                  }
                } else {
                  if (var6_int != 4) {
                    if (var6_int == 5) {
                      if (this.field_j == 4) {
                        this.a(-11, 65280, param0, -120, -32, -64, 2, 11, -param3 - 12);
                      }
                      if (this.field_j == 5) {
                        this.a(-9, 65280, param0, -112, -128, -16, 2, 11, -16 - param3);
                      }
                      if (this.field_j == 6) {
                        this.a(-11, 65280, param0, -118, 32, -64, 2, 11, -param3 + 4);
                      }
                      if (this.field_j == 7) {
                        this.a(-9, 65280, param0, -104, 128, -16, 2, 11, 8 - param3);
                      }
                      if (this.field_j == 8) {
                        this.a(-10, 65280, param0, -122, -96, -32, 2, 11, -param3 - 14);
                      }
                      if (10 == this.field_j) {
                        this.a(-10, 65280, param0, -127, 96, -32, 2, 11, 6 - param3);
                      }
                      if (this.field_j == 5 ||
                        10 == this.field_j) {
                        mj.a(2 * dg.field_l / 5, 12, 0, 13, 40);
                      }
                      if (this.field_j >= 10) {
                        this.field_j = 0;
                      }
                    } else {
                      if (var6_int != 6) {
                        if (var6_int == 7) {
                          if (this.field_j == 4) {
                            this.a(-11, 16776960, param0, -114, -32, -64, 4, 11, -param3 - 12);
                          }
                          if (6 == this.field_j) {
                            this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 - param3);
                          }
                          if (this.field_j == 8) {
                            this.a(-10, 16776960, param0, -115, -96, -32, 4, 11, -14 - param3);
                          }
                          if (this.field_j == 10) {
                            this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 - param3);
                          }
                          if (5 == this.field_j) {
                            this.a(-9, 65280, param0, -121, -128, -16, 2, 11, -param3 - 16);
                          }
                          if (this.field_j == 7) {
                            this.a(-9, 65280, param0, -117, 128, -16, 2, 11, 8 - param3);
                          }
                          if (this.field_j == 5 ||
                            this.field_j == 10) {
                            mj.a(2 * dg.field_l / 5, 12, 0, 15, 60);
                          }
                          if (this.field_j >= 10) {
                            this.field_j = 0;
                          }
                        } else {
                          if (var6_int != 8) {
                            if (var6_int != 9) {
                              if (10 != var6_int) {
                                if (var6_int == 11) {
                                  if (this.field_j == 4) {
                                    this.a(-11, 16776960, param0, -125, -32, -64, 4, 11, -param3 - 12);
                                    this.a(-9, 16776960, param0, -116, -128, -16, 4, 11, -16 - param3);
                                    this.a(-7, 65280, param0, -115, -256, 0, 2, 11, -20 - param3);
                                  }
                                  if (this.field_j == 6) {
                                    this.a(-11, 16776960, param0, -106, 32, -64, 4, 11, 4 - param3);
                                    this.a(-9, 16776960, param0, -105, 128, -16, 4, 11, -param3 + 8);
                                    this.a(-7, 65280, param0, -120, 256, 0, 2, 11, -param3 + 12);
                                  }
                                  if (this.field_j == 8) {
                                    this.a(-10, 16776960, param0, -111, -96, -32, 4, 11, -14 - param3);
                                    this.a(-8, 16776960, param0, -124, -192, -8, 4, 11, -param3 - 18);
                                  }
                                  if (10 == this.field_j) {
                                    this.a(-10, 16776960, param0, -127, 96, -32, 4, 11, 6 - param3);
                                    this.a(-8, 16776960, param0, -123, 192, -8, 4, 11, -param3 + 10);
                                  }
                                  if (this.field_j == 5 ||
                                    this.field_j == 10) {
                                    mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                  }
                                  if (this.field_j >= 10) {
                                    this.field_j = 0;
                                  }
                                } else {
                                  if (var6_int != 12) {
                                    if (var6_int != 13) {
                                      if (var6_int != 14) {
                                        if (var6_int == 15) {
                                          if (2 == this.field_j) {
                                            this.a(-11, 16776960, param0, -127, -32, -64, 4, 11, -12 - param3);
                                            this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, -param3 + 4);
                                            this.a(-9, 65280, param0, -119, -128, -16, 2, 11, -param3 - 16);
                                            this.a(-9, 65280, param0, -110, 128, -16, 2, 11, 8 - param3);
                                          }
                                          if (3 == this.field_j) {
                                            this.a(-10, 65280, param0, -108, -96, -32, 2, 11, -param3 - 14);
                                            this.a(-10, 65280, param0, -104, 96, -32, 2, 11, 6 - param3);
                                            this.a(-11, 65280, param0, -123, -32, -64, 2, 11, -12 - param3);
                                            this.a(-9, 65280, param0, -125, -256, 0, 2, 11, -param3 - 16);
                                          }
                                          if (4 == this.field_j) {
                                            this.a(-11, 65280, param0, -104, 32, -64, 2, 11, -param3 + 4);
                                            this.a(-10, 65280, param0, -106, -192, -8, 2, 11, -14 - param3);
                                            this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 - param3);
                                          }
                                          if (this.field_j == 5) {
                                            this.a(-10, 65280, param0, -104, 192, -8, 2, 11, -param3 + 6);
                                            this.a(-11, 65280, param0, -105, -64, -48, 1, 11, -param3 - 13);
                                            this.a(-11, 65280, param0, -112, 64, -48, 1, 11, 5 - param3);
                                          }
                                          if (this.field_j == 5) {
                                            mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                                          }
                                          if (5 <= this.field_j) {
                                            this.field_j = 0;
                                          }
                                        } else {
                                          if (var6_int == 16) {
                                            if (this.field_j == 2) {
                                              this.a(-11, 16776960, param0, -104, -32, -64, 4, 11, -param3 - 12);
                                              this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, -param3 + 4);
                                              this.a(-9, 65280, param0, -110, -128, -16, 2, 11, -param3 - 16);
                                              this.a(-9, 65280, param0, -122, 128, -16, 2, 11, 8 - param3);
                                            }
                                            if (3 == this.field_j) {
                                              this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -param3 - 14);
                                              this.a(-10, 16776960, param0, -104, 96, -32, 4, 11, 6 - param3);
                                              this.a(-11, 65280, param0, -124, -32, -64, 2, 11, -param3 - 12);
                                              this.a(-9, 65280, param0, -115, -256, 0, 2, 11, -16 - param3);
                                            }
                                            if (this.field_j == 4) {
                                              this.a(-11, 65280, param0, -114, 32, -64, 2, 11, 4 - param3);
                                              this.a(-10, 65280, param0, -115, -192, -8, 2, 11, -14 - param3);
                                              this.a(-9, 65280, param0, -119, 256, 0, 2, 11, -param3 + 8);
                                            }
                                            if (this.field_j == 5) {
                                              this.a(-10, 65280, param0, -104, 192, -8, 2, 11, 6 - param3);
                                              this.a(-11, 65280, param0, -114, -64, -48, 1, 11, -13 - param3);
                                              this.a(-11, 65280, param0, -105, 64, -48, 1, 11, 5 - param3);
                                            }
                                            if (5 == this.field_j) {
                                              mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                            }
                                            if (this.field_j >= 5) {
                                              this.field_j = 0;
                                            }
                                          } else {
                                            if (var6_int == 17) {
                                              if (this.field_j == 2) {
                                                this.a(-11, 16777215, param0, -106, -32, -64, 8, 11, -param3 - 12);
                                              }
                                              if (this.field_j == 2) {
                                                this.a(-11, 16777215, param0, -108, 32, -64, 8, 11, 4 - param3);
                                              }
                                              if (this.field_j == 3) {
                                                this.a(-10, 16777215, param0, -110, -96, -32, 8, 11, -param3 - 14);
                                              }
                                              if (this.field_j == 3) {
                                                this.a(-10, 16777215, param0, -123, 96, -32, 8, 11, -param3 + 6);
                                              }
                                              if (this.field_j == 2) {
                                                this.a(-9, 16776960, param0, -124, -128, -16, 4, 11, -16 - param3);
                                              }
                                              if (this.field_j == 2) {
                                                this.a(-9, 16776960, param0, -113, 128, -16, 4, 11, 8 - param3);
                                              }
                                              if (3 == this.field_j) {
                                                this.a(-11, 16776960, param0, -109, -32, -64, 4, 11, -param3 - 12);
                                              }
                                              if (this.field_j == 4) {
                                                this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, 4 - param3);
                                              }
                                              if (this.field_j == 4) {
                                                this.a(-10, 65280, param0, -113, -192, -8, 2, 11, -param3 - 14);
                                              }
                                              if (this.field_j == 5) {
                                                this.a(-10, 65280, param0, -117, 192, -8, 2, 11, -param3 + 6);
                                              }
                                              if (this.field_j == 3) {
                                                this.a(-9, 65280, param0, -110, -256, 0, 2, 11, -param3 - 16);
                                              }
                                              if (4 == this.field_j) {
                                                this.a(-9, 65280, param0, -121, 256, 0, 2, 11, 8 - param3);
                                              }
                                              if (5 == this.field_j) {
                                                mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                              }
                                              if (this.field_j >= 5) {
                                                this.field_j = 0;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (this.field_j == 2) {
                                          this.a(-11, 65280, param0, -115, -32, -64, 2, 11, -param3 - 12);
                                          this.a(-11, 65280, param0, -119, 32, -64, 2, 11, -param3 + 4);
                                          this.a(-9, 65280, param0, -108, -128, -16, 2, 11, -param3 - 16);
                                          this.a(-9, 65280, param0, -110, 128, -16, 2, 11, 8 - param3);
                                        }
                                        if (this.field_j == 3) {
                                          this.a(-10, 65280, param0, -127, -96, -32, 2, 11, -param3 - 14);
                                          this.a(-10, 65280, param0, -119, 96, -32, 2, 11, 6 - param3);
                                          this.a(-11, 65280, param0, -105, -32, -64, 2, 11, -param3 - 12);
                                          this.a(-9, 65280, param0, -122, -256, 0, 2, 11, -param3 - 16);
                                        }
                                        if (this.field_j == 4) {
                                          this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                                          this.a(-10, 65280, param0, -108, -192, -8, 2, 11, -14 - param3);
                                          this.a(-9, 65280, param0, -118, 256, 0, 2, 11, 8 - param3);
                                        }
                                        if (this.field_j == 5) {
                                          this.a(-10, 65280, param0, -127, 192, -8, 2, 11, -param3 + 6);
                                          this.a(-11, 65280, param0, -120, -64, -48, 1, 11, -param3 - 13);
                                          this.a(-11, 65280, param0, -106, 64, -48, 1, 11, 5 - param3);
                                        }
                                        if (this.field_j == 5) {
                                          mj.a(dg.field_l >> 1, 12, 0, 13, 30);
                                        }
                                        if (this.field_j >= 5) {
                                          this.field_j = 0;
                                        }
                                      }
                                    } else {
                                      if (this.field_j == 2) {
                                        this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -param3 - 12);
                                        this.a(-9, 16776960, param0, -108, -128, -16, 4, 11, -param3 - 16);
                                      }
                                      if (3 == this.field_j) {
                                        this.a(-11, 16776960, param0, -116, 32, -64, 4, 11, 4 - param3);
                                        this.a(-9, 16776960, param0, -123, 128, -16, 4, 11, 8 - param3);
                                      }
                                      if (4 == this.field_j) {
                                        this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 - param3);
                                      }
                                      if (5 == this.field_j) {
                                        this.a(-10, 16776960, param0, -119, 96, -32, 4, 11, 6 - param3);
                                      }
                                      if (this.field_j == 7) {
                                        this.a(-11, 16776960, param0, -120, -32, -64, 4, 11, -12 - param3);
                                        this.a(-9, 16776960, param0, -119, -256, 0, 4, 11, -param3 - 16);
                                      }
                                      if (this.field_j == 8) {
                                        this.a(-11, 16776960, param0, -128, 32, -64, 4, 11, 4 - param3);
                                        this.a(-9, 16776960, param0, -122, 256, 0, 4, 11, -param3 + 8);
                                      }
                                      if (9 == this.field_j) {
                                        this.a(-10, 16776960, param0, -109, -192, -8, 4, 11, -param3 - 14);
                                      }
                                      if (this.field_j == 10) {
                                        this.a(-10, 16776960, param0, -122, 192, -8, 4, 11, -param3 + 6);
                                      }
                                      if (this.field_j == 5 ||
                                        this.field_j == 10) {
                                        mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                      }
                                      if (this.field_j >= 10) {
                                        this.field_j = 0;
                                      }
                                    }
                                  } else {
                                    if (this.field_j == 2) {
                                      this.a(-11, 16776960, param0, -115, -32, -64, 4, 11, -12 - param3);
                                      this.a(-9, 65280, param0, -118, -128, -16, 2, 11, -param3 - 16);
                                    }
                                    if (this.field_j == 3) {
                                      this.a(-11, 16776960, param0, -107, 32, -64, 4, 11, -param3 + 4);
                                      this.a(-9, 65280, param0, -110, 128, -16, 2, 11, -param3 + 8);
                                    }
                                    if (this.field_j == 4) {
                                      this.a(-10, 16776960, param0, -112, -96, -32, 4, 11, -14 - param3);
                                    }
                                    if (this.field_j == 5) {
                                      this.a(-10, 16776960, param0, -125, 96, -32, 4, 11, 6 - param3);
                                    }
                                    if (this.field_j == 7) {
                                      this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 - 12);
                                      this.a(-9, 65280, param0, -125, -256, 0, 2, 11, -param3 - 16);
                                    }
                                    if (this.field_j == 8) {
                                      this.a(-11, 16776960, param0, -118, 32, -64, 4, 11, -param3 + 4);
                                      this.a(-9, 65280, param0, -120, 256, 0, 2, 11, -param3 + 8);
                                    }
                                    if (this.field_j == 9) {
                                      this.a(-10, 16776960, param0, -123, -192, -8, 4, 11, -param3 - 14);
                                    }
                                    if (this.field_j == 10) {
                                      this.a(-10, 16776960, param0, -104, 192, -8, 4, 11, 6 - param3);
                                    }
                                    if (this.field_j == 5 ||
                                      this.field_j == 10) {
                                      mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                                    }
                                    if (this.field_j >= 10) {
                                      this.field_j = 0;
                                    }
                                  }
                                }
                              } else {
                                if (this.field_j == 4) {
                                  this.a(-11, 16776960, param0, -124, -32, -64, 4, 11, -param3 - 12);
                                  this.a(-9, 16776960, param0, -115, -128, -16, 4, 11, -param3 - 16);
                                }
                                if (6 == this.field_j) {
                                  this.a(-11, 16776960, param0, -125, 32, -64, 4, 11, -param3 + 4);
                                  this.a(-9, 16776960, param0, -109, 128, -16, 4, 11, -param3 + 8);
                                }
                                if (this.field_j == 8) {
                                  this.a(-10, 16776960, param0, -109, -96, -32, 4, 11, -14 - param3);
                                  this.a(-8, 65280, param0, -108, -192, -8, 2, 11, -18 - param3);
                                }
                                if (this.field_j == 10) {
                                  this.a(-10, 16776960, param0, -111, 96, -32, 4, 11, -param3 + 6);
                                  this.a(-8, 65280, param0, -128, 192, -8, 2, 11, -param3 + 10);
                                }
                                if (this.field_j == 5 ||
                                  this.field_j == 10) {
                                  mj.a(dg.field_l >> 1, 12, 0, 15, 60);
                                }
                                if (10 <= this.field_j) {
                                  this.field_j = 0;
                                }
                              }
                            } else {
                              if (this.field_j == 4) {
                                this.a(-11, 16776960, param0, -112, -32, -64, 4, 11, -12 - param3);
                                this.a(-9, 65280, param0, -108, -128, -16, 2, 11, -16 - param3);
                              }
                              if (6 == this.field_j) {
                                this.a(-11, 16776960, param0, -110, 32, -64, 4, 11, 4 - param3);
                                this.a(-9, 65280, param0, -108, 128, -16, 2, 11, -param3 + 8);
                              }
                              if (this.field_j == 8) {
                                this.a(-10, 16776960, param0, -122, -96, -32, 4, 11, -14 - param3);
                                this.a(-8, 65280, param0, -105, -192, -8, 2, 11, -18 - param3);
                              }
                              if (this.field_j == 10) {
                                this.a(-10, 16776960, param0, -108, 96, -32, 4, 11, 6 - param3);
                                this.a(-8, 65280, param0, -123, 192, -8, 2, 11, -param3 + 10);
                              }
                              if (this.field_j == 5 ||
                                this.field_j == 10) {
                                mj.a(dg.field_l >> 1, 12, 0, 14, 40);
                              }
                              if (this.field_j >= 10) {
                                this.field_j = 0;
                              }
                            }
                          } else {
                            if (this.field_j == 2) {
                              this.a(-11, 65280, param0, -126, -32, -64, 2, 11, -12 - param3);
                              this.a(-9, 65280, param0, -114, -128, -16, 2, 11, -param3 - 16);
                            }
                            if (this.field_j == 3) {
                              this.a(-11, 65280, param0, -126, 32, -64, 2, 11, 4 - param3);
                              this.a(-9, 65280, param0, -105, 128, -16, 2, 11, 8 - param3);
                            }
                            if (4 == this.field_j) {
                              this.a(-10, 65280, param0, -110, -96, -32, 2, 11, -param3 - 14);
                            }
                            if (this.field_j == 5) {
                              this.a(-10, 65280, param0, -111, 96, -32, 2, 11, -param3 + 6);
                            }
                            if (5 == this.field_j) {
                              mj.a(2 * dg.field_l / 5, 12, 0, 13, 30);
                            }
                            if (this.field_j >= 5) {
                              this.field_j = 0;
                            }
                          }
                        }
                      } else {
                        if (this.field_j == 4) {
                          this.a(-11, 16776960, param0, -113, -32, -64, 4, 11, -12 - param3);
                        }
                        if (this.field_j == 6) {
                          this.a(-11, 16776960, param0, -113, 32, -64, 4, 11, -param3 + 4);
                        }
                        if (8 == this.field_j) {
                          this.a(-10, 65280, param0, -119, -96, -32, 2, 11, -14 - param3);
                        }
                        if (10 == this.field_j) {
                          this.a(-10, 65280, param0, -109, 96, -32, 2, 11, -param3 + 6);
                        }
                        if (this.field_j == 5) {
                          this.a(-9, 65280, param0, -120, -128, -16, 2, 11, -16 - param3);
                        }
                        if (this.field_j == 7) {
                          this.a(-9, 65280, param0, -127, 128, -16, 2, 11, 8 - param3);
                        }
                        if (5 == this.field_j ||
                          this.field_j == 10) {
                          mj.a(dg.field_l * 2 / 5, 12, 0, 14, 40);
                        }
                        if (this.field_j >= 10) {
                          this.field_j = 0;
                        }
                      }
                    }
                  } else {
                    if (this.field_j == 4) {
                      this.a(-11, 65280, param0, -115, -32, -64, 2, 11, -param3 - 12);
                    }
                    if (this.field_j == 6) {
                      this.a(-11, 65280, param0, -125, 32, -64, 2, 11, -param3 + 4);
                    }
                    if (this.field_j == 8) {
                      this.a(-10, 65280, param0, -113, -96, -32, 2, 11, -param3 - 14);
                    }
                    if (this.field_j == 10) {
                      this.a(-10, 65280, param0, -111, 96, -32, 2, 11, 6 - param3);
                    }
                    if (this.field_j == 5 ||
                      this.field_j == 10) {
                      mj.a(2 * dg.field_l / 5, 12, 0, 15, 75);
                    }
                    if (10 <= this.field_j) {
                      this.field_j = 0;
                    }
                  }
                }
              }
            } else {
              if (this.field_j == 5) {
                this.a(-13, 16776960, param0, -119, -64, -64, 4, 11, -16 + param3);
              }
              if (this.field_j == 15) {
                this.a(-13, 65280, param0, -112, 64, -64, 2, 11, -param3 + 8);
              }
              if (this.field_j == 25) {
                this.a(-13, 65280, param0, -106, -64, -64, 2, 11, param3 - 16);
              }
              if (this.field_j == 35) {
                this.a(-13, 16776960, param0, -109, 64, -64, 4, 11, -param3 + 8);
              }
              if (this.field_j % 6 == 0) {
                mj.a(3 * dg.field_l / 10, 12, 0, 15, 75);
              }
              if (this.field_j >= 40) {
                this.field_j = 0;
              }
            }
          } else {
            if (this.field_j == 4) {
              this.a(-13, 65280, param0, -125, -64, -64, 2, 11, param3 - 16);
            }
            if (this.field_j == 12) {
              this.a(-13, 65280, param0, -128, 64, -64, 2, 11, 8 - param3);
            }
            if (this.field_j == 4 ||
              this.field_j == 12) {
              mj.a(dg.field_l * 3 / 10, 12, 0, 14, 50);
            }
            if (this.field_j >= 16) {
              this.field_j = 0;
            }
          }
          if (param1 > -33) {
            this.field_m = -64;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_374_0 = var6;
          stackIn_374_1 = new StringBuilder().append("bf.E(");
          if (param0 == null) {
            stackIn_375_2 = "null";
          } else {
            stackIn_375_2 = "{...}";
          }
          stackIn_377_1 = ((StringBuilder) (Object) stackIn_374_1).append(stackIn_375_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_378_2 = "null";
          } else {
            stackIn_378_2 = "{...}";
          }
          stackIn_380_1 = ((StringBuilder) (Object) stackIn_377_1).append(stackIn_378_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_381_2 = "null";
          } else {
            stackIn_381_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_374_0), ((StringBuilder) (Object) stackIn_380_1).append(stackIn_381_2).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int stackIn_107_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = StarCannon.field_A;
        var3 = 512;
        if (param0 != 65535) {
          this.field_l = 44;
        }
        L1: {
          if (0 < this.field_k) {
            var4 = (param1 >> 4) + this.field_f;
            var9 = this.field_q;
            if (0 != var9) {
              if (1 == var9) {
                if (rj.field_h == 1) {
                  gg.field_f[5 + this.field_v].d(-16 + var4, this.field_u - 16, 256);
                } else {
                  gg.field_f[this.field_v].d(-16 + var4, this.field_u - 16, var3);
                }
              } else {
                if (var9 != 2) {
                  if (3 != var9) {
                    if (var9 == 4) {
                      gg.field_f[this.field_v + 25].d(var4 - 16, -16 + this.field_u, var3);
                    } else {
                      if (var9 == 5) {
                        gg.field_f[this.field_v + 20].d(var4 - 16, this.field_u - 16, var3);
                      } else {
                        if (var9 != 6 &&
                          var9 != 14) {
                          if (var9 == 7) {
                            if (!(fi.field_e.field_k <= 0)) {
                              vc.field_m[1].e(var4 - 16, this.field_u - 16);
                            }
                          } else {
                            if (var9 != 8 &&
                              var9 != 9) {
                              if (var9 == 10) {
                                if ((af.field_w != null)) {
                                  if (3 > this.field_l) {
                                    if (this.field_l == 0) {
                                      var9 = 257;
                                    } else {
                                      var9 = (this.field_l != 1) ? 256 : 256;
                                    }
                                    stackIn_107_0 = (2 != this.field_l) ? 0 : 16711680;
                                    var10 = stackIn_107_0;
                                    var11 = ~var10 & 65793 - var9;
                                    ki.c(var4, this.field_u, 20 + this.field_o, var10 | var9 * 96, 32);
                                    ki.c(var4, this.field_u, this.field_o + 19, var9 * 160 | var10, 32);
                                    var10 = 255 * var9 | var10;
                                    ki.c(var4, this.field_u, 18 + this.field_o, var10, 32);
                                    ki.c(var4, this.field_u, this.field_o + 17, var10 | var11 * 32, 32);
                                    ki.c(var4, this.field_u, 16 + this.field_o, var11 * 96 | var10, 32);
                                    ki.c(var4, this.field_u, 14 + this.field_o, 160 * var11 | var10, 32);
                                    ki.c(var4, this.field_u, 12 + this.field_o, var10 | var11 * 240, 32);
                                  }
                                  af.field_w[this.field_v * 8 + this.field_l].c(var4 - 16, -16 + this.field_u);
                                }
                                break L1;
                              }
                              switch (var9) {
                                case 11:
                                  sj.field_E[this.field_v].d(-64 + var4, this.field_u - 64, 256);
                                  break L1;
                                case 12:
                                  nd.field_j[this.field_v].d(var4 - 16, -16 + (this.field_u - 32), var3);
                                  break L1;
                                case 21:
                                  qc.field_e[this.field_v].d(-48 + var4, -32 + this.field_u, 256);
                                  break L1;
                                case 13:
                                  if (0 >= fi.field_e.field_k) {
                                    break L1;
                                  }
                                  vc.field_m[2].e(var4 - 16, -16 + this.field_u);
                                  ie.field_A[this.field_o % 14].f(-8 + var4, this.field_u - 16, 3 * this.field_o);
                                  if (StarCannon.field_z != -1) {
                                    break L1;
                                  }
                                  if (-1 != pa.field_L) {
                                    break L1;
                                  }
                                  ie.field_A[this.field_o % 14].f(-12 + var4 + sh.b(-128, 8), this.field_u - (20 - sh.b(-2, 8)), 2 * this.field_o);
                                  ie.field_A[this.field_o % 14].f(-14 + (var4 + sh.b(param0 - 65437, 12)), -22 + (this.field_u + sh.b(34, 12)), this.field_o);
                                  break L1;
                                case 15:
                                  if (this.field_v > 4) {
                                    this.field_v = 4;
                                  }
                                  fg.field_c[this.field_v].d(var4 - 128, -128 + this.field_u, 256);
                                  break L1;
                                case 16:
                                  if (this.field_v > 4) {
                                    this.field_v = 4;
                                  }
                                  v.field_d[this.field_v].d(var4 - 128, -128 + this.field_u, 256);
                                  break L1;
                                case 17:
                                  el.field_H[this.field_v].d(-16 + var4, this.field_u - 16, var3);
                                  break L1;
                                case 18:
                                  var7 = (int)(16.0 * Math.sin(0.1 * (double)this.field_u));
                                  var8 = (int)(Math.cos(0.1 * (double)this.field_u) * 16.0);
                                  gg.field_f[25 + this.field_v].d(-var7 + (-16 + var4), -16 + (this.field_u - var8), var3);
                                  gg.field_f[25 + this.field_v].d(var7 + (var4 - 16), var8 - 16 + this.field_u, var3);
                                  gg.field_f[25 + this.field_v].d(-16 + (var4 - var8), -16 + this.field_u + var7, var3);
                                  gg.field_f[this.field_v + 25].d(var8 + (-16 + var4), this.field_u - 16 - var7, var3);
                                  break L1;
                                case 19:
                                  gg.field_f[this.field_v + 25].d(-16 + var4, -16 + this.field_u, var3);
                                  break L1;
                                default:
                                  break L1;
                                case 22:
                                  fl.field_f[this.field_l].e(-64 + var4, -64 + this.field_u);
                                  break L1;
                              }
                            }
                            if (!(0 >= fi.field_e.field_k)) {
                              vc.field_m[3 + this.field_v].e(-16 + var4, this.field_u - 16);
                            }
                          }
                          break L1;
                        }
                        if (fi.field_e.field_k > 0) {
                          vc.field_m[0].e(var4 - 16, -16 + this.field_u);
                        }
                      }
                    }
                  } else {
                    gf.field_a[this.field_v].d(var4 - 32, this.field_u - 16, var3);
                  }
                } else {
                  if (1 != rj.field_h) {
                    gg.field_f[10 + this.field_v].d(-16 + var4, this.field_u - 16, var3);
                  } else {
                    gg.field_f[this.field_v + 15].d(var4 - 16, this.field_u - 16, 256);
                  }
                }
              }
            } else {
              var5 = this.field_m >> 2;
              var6 = Math.abs(-this.field_v + 2);
              if (this.field_z == 0) {
                var5++;
              }
              if (0 > this.field_z) {
                var5 += 2;
              }
              if (0 < ui.field_p &&
                !ti.field_d) {
                ki.c(var4, this.field_u, ui.field_p, 65535, -(ui.field_p * 255 / eg.field_l) + 256);
              } else if (0 < ha.field_d &&
                !ti.field_d) {
                for (var9 = 0; 314 > var9; var9 += 16) {
                  var10 = var4 + (int)(Math.cos((double)(var9 + ha.field_d) / 50.1) * (double)ha.field_d);
                  var11 = (int)(Math.sin((double)(var9 + ha.field_d) / 50.1) * (double)ha.field_d) + this.field_u;
                  ki.c(var10, var11, 3, 65535, 128);
                }
              } else {
                ki.c(4 + (var4 - this.field_v), this.field_u, 20, 24831, 32);
                ki.c(var4 + (4 - this.field_v), this.field_u, 19, 41215, 32);
                ki.c(var4 + 4 - this.field_v, this.field_u, 18, 65535, 32);
                ki.c(var4 - (-4 + this.field_v), this.field_u, 17, 2162687, 32);
                ki.c(-this.field_v + var4 + 4, this.field_u, 16, 6356991, 32);
                ki.c(var4 + (4 - this.field_v), this.field_u, 14, 10551295, 32);
                ki.c(-this.field_v + (var4 + 4), this.field_u, 12, 15794175, 32);
              }
              var9 = jl.field_j;
              switch (var9) {
                case 5:
                  if (tj.field_G % 2 == 0 ||
                    ti.field_d) {
                    dl.field_c[this.field_v].e(-16 + var4, this.field_u - 16);
                  }
                  jg.field_C[var5].a(-4 + var4, 7 + this.field_u, 16711680);
                  break;
                case 20:
                  if (tj.field_G % 2 == 0 ||
                    ti.field_d) {
                    dl.field_c[this.field_v].e(var4 - 16, -16 + this.field_u);
                  }
                  jg.field_C[var5].a(var4 - var6, 3 + this.field_u, 16711680);
                  jg.field_C[var5].a(var4 - (-4 + var6), this.field_u + 3, 16711680);
                  jg.field_C[var5].a(var6 + (var4 - 8), 3 + this.field_u, 16711680);
                  jg.field_C[var5].a(-12 + (var4 + var6), this.field_u + 3, 16711680);
                  break;
                case 15:
                  jg.field_C[var5].a(-var6 + 2 + var4, this.field_u + 3, 16711680);
                  jg.field_C[var5].a(var6 + (var4 - 10), this.field_u + 3, 16711680);
                  if (0 == tj.field_G % 2 ||
                    ti.field_d) {
                    dl.field_c[this.field_v].e(-16 + var4, -16 + this.field_u);
                  }
                  jg.field_C[var5].a(var4 - 4, 7 + this.field_u, 16711680);
                  break;
                case 10:
                  jg.field_C[var5].a(-var6 + (2 + var4), 3 + this.field_u, 16711680);
                  jg.field_C[var5].a(var6 + (-10 + var4), 3 + this.field_u, 16711680);
                  if (tj.field_G % 2 != 0 &&
                    !ti.field_d) {
                    break;
                  }
                  dl.field_c[this.field_v].e(-16 + var4, this.field_u - 16);
                  break;
                default:
                  break;
              }
            }
          }
        }
    }

    bf(int param0, int param1, int param2, int param3) {
        int stackIn_3_1 = 0;
        if (param3 != 0) {
          stackIn_3_1 = 2;
        } else {
          stackIn_3_1 = 4;
        }
        this.field_v = stackIn_3_1;
        this.field_g = 0;
        this.field_u = param1;
        this.field_t = 0;
        this.field_j = 0;
        this.field_p = false;
        this.field_m = 0;
        this.field_l = 0;
        this.field_k = 1;
        this.field_h = null;
        this.field_q = param3;
        this.field_f = param0;
        this.field_i = param2;
        this.field_z = 0;
        this.field_n = 0;
        this.field_o = 0;
        this.field_r = 0;
        if (this.field_q == 0) {
          this.field_k = 1;
        }
        if (this.field_q == 1) {
          this.field_k = pf.field_d * 2 / 3 + 1;
        }
        if (this.field_q == 2) {
          this.field_k = pf.field_d + 1;
        }
        if (this.field_q == 3) {
          this.field_k = 51 + 4 * pf.field_d;
        }
        if (this.field_q == 4) {
          this.field_k = 2 * pf.field_d + 2;
        }
        if (this.field_q == 5) {
          this.field_k = 3 + pf.field_d;
        }
        if (this.field_q == 10) {
          if (sh.b(-2, 2) == 0) {
            this.field_l = sh.b(-128, 3);
            if (0 == rj.field_h &&
              sd.field_c >= 6) {
              this.field_l = sh.b(-127, 7);
            }
            if (rj.field_h == 1 &&
              10 <= sd.field_c) {
              this.field_l = sh.b(53, 7);
            }
            if (rj.field_h == 2 &&
              sd.field_c >= 16) {
              this.field_l = sh.b(7, 7);
            }
            if (rj.field_h == 3 &&
              sd.field_c >= 17) {
              this.field_l = sh.b(99, 7);
            }
          } else {
            this.field_l = sh.b(-127, 4) + 3;
          }
          if (this.field_l == 5) {
            this.field_l = 7;
          }
        }
        if (this.field_q == 12) {
          this.field_k = 100 + pf.field_d * 3;
        }
        if (this.field_q == 21) {
          this.field_k = 100 + 20 * pf.field_d;
        }
        if (11 == this.field_q) {
          this.field_k = 50 * pf.field_d + 200 << 2;
          if (rj.field_h == 3) {
            this.field_k = this.field_k >> 2;
          }
        }
        if (this.field_q == 15) {
          this.field_k = 50 * pf.field_d + 500 << 2;
          if (nf.field_l == 2) {
            this.field_k = pf.field_d * 50 + 750 << 2;
          }
          if (rj.field_h == 3) {
            this.field_k = this.field_k >> 2;
          }
        }
        if (this.field_q == 16) {
          this.field_k = 50 * pf.field_d + 2000 << 2;
          if (rj.field_h == 3) {
            this.field_k = this.field_k >> 2;
          }
        }
        if (this.field_q == 17) {
          this.field_k = 2 * pf.field_d + 1;
        }
        if (this.field_q == 18) {
          this.field_k = 30 + pf.field_d * 5;
        }
        if (this.field_q == 19) {
          this.field_k = 20 + 4 * pf.field_d;
        }
        if (this.field_q == 22) {
          this.field_k = 1;
        }
    }

    static {
        field_x = new p();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
