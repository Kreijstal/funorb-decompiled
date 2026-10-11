/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends in {
    static nd field_e;
    static int[] field_g;
    private long field_i;
    private long field_j;
    private int field_o;
    static bd field_k;
    private int field_p;
    private long[] field_r;
    private long field_q;
    static int field_m;
    static int field_f;
    static String field_h;
    static String[] field_n;
    static String field_l;

    final long a(byte param0) {
        this.field_j = this.field_j + this.b(1);
        if (this.field_j < this.field_q) {
          return (this.field_q - this.field_j) / 1000000L;
        }
        if (param0 > -21) {
          field_m = -113;
        }
        return 0L;
    }

    final static void c(boolean param0) {
        ig.field_N.field_k = 0;
        ig.field_N.field_e = 0;
        if (!param0) {
          lg.c(true);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bd stackIn_17_0 = null;
        bd stackIn_26_0 = null;
        bd stackIn_95_0 = null;
        bd stackIn_104_0 = null;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var8_double = 0.0;
        Exception var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qm var13 = null;
        oj var14 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          for (var4_int = param1; var4_int < dk.field_o; var4_int++) {
            var13 = vj.field_w[var4_int];
            if (var13 != null &&
              var13.c(0) == param2) {
              try {
                var6 = (int)(((double)var13.field_j.field_g + 0.5 + var13.field_l.field_a) * 24.0) - param0;
                var5 = (int)(24.0 * (-0.5 + (double)var13.field_j.field_e + var13.field_l.field_f)) - param3;
                if (var5 >= -96 &&
                  var6 >= -96 &&
                  var5 <= 736 &&
                  576 >= var6) {
                  if (9 != var13.field_i) {
                    if (22 != var13.field_i) {
                      if (var13.field_i == 5) {
                        if (var13.field_I <= 0) {
                          stackIn_26_0 = rl.field_d;
                        } else {
                          stackIn_26_0 = ia.field_l[12];
                        }
                        ((bd) (Object) stackIn_26_0).a(true, 128, (int)var13.field_c, var5 - 8, -8 + var6);
                      } else {
                        if (var13.field_i != 30) {
                          if (var13.field_i == 230) {
                            qm.field_P.a(true, 128, (int)var13.field_c, -8 + var5, -8 + var6);
                          }
                        } else {
                          c.field_f[em.field_c / 2 % c.field_f.length].a(true, 128, (int)var13.field_c, var5, var6);
                        }
                      }
                    } else {
                      if (var13.field_I <= 0) {
                        stackIn_17_0 = v.field_j;
                      } else {
                        stackIn_17_0 = ci.field_b;
                      }
                      ((bd) (Object) stackIn_17_0).a(true, 128, (int)var13.field_c, var5 - 8, var6 - 8);
                    }
                  }
                  if (ue.field_d == 0) {
                    if (6 != var13.field_i) {
                      if (var13.field_u != null &&
                        var13.field_i != 128 &&
                        var13.field_i != 129 &&
                        var13.field_i != 130 &&
                        var13.field_i != 131 &&
                        var13.field_i != 132 &&
                        133 != var13.field_i) {
                        var13.field_u.a(true, 128, (int)var13.field_c, var5, var6);
                      }
                    } else {
                      ia.field_l[13].a((double)var6, (double)var5, false, var13.field_c, 128);
                    }
                  }
                  if (246 == var13.field_i) {
                    boolean decompiledFrameRemainder1 = true;
                    var8_double = var13.field_c % 256.0;
                    if (var13.field_u == vb.field_Kb[13]) {
                      if (64.0 != var8_double &&
                        192.0 != var8_double) {
                        if (var8_double == 0.0) {
                          var5 -= 2;
                        } else {
                          if ((var8_double == 128.0)) {
                            var5 += 2;
                          }
                        }
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        var8_double = 256.0 - var8_double;
                      }
                    }
                    if (0.0 != var8_double) {
                      if (64.0 == var8_double) {
                        var10 = ng.field_u / 2 % 3;
                        ie.field_b[var10].c(var5 - 16, -56 + var6);
                        var10++;
                        if (var10 >= ie.field_b.length) {
                          var10 = 0;
                        }
                        ie.field_b[var10].c(var5 - 16, 23 + var6);
                      } else {
                        if (128.0 == var8_double) {
                          var10 = ng.field_u / 2 % 3;
                          ie.field_b[var10].c(-56 + var5, -16 + var6);
                          var10++;
                          if (ie.field_b.length <= var10) {
                            var10 = 0;
                          }
                          ie.field_b[var10].c(23 + var5, -16 + var6);
                        } else {
                          if (192.0 == var8_double) {
                            var10 = ng.field_u / 2 % 3;
                            ie.field_b[var10].c(var5 - 16, -55 + var6);
                            var10++;
                            if (var10 >= ie.field_b.length) {
                              var10 = 0;
                            }
                            ie.field_b[var10].c(-16 + var5, 24 + var6);
                          }
                        }
                      }
                    } else {
                      var10 = ng.field_u / 2 % 3;
                      ie.field_b[var10].c(-54 + var5, var6 - 16);
                      var10++;
                      if (var10 >= ie.field_b.length) {
                        var10 = 0;
                      }
                      ie.field_b[var10].c(25 + var5, var6 - 16);
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8 = (Exception) (Object) decompiledCaughtException;
              }
            }
          }
          if (param2 == 1) {
            var12 = 0;
            var4_int = var12;
            while (rc.field_e > var12) {
              boolean decompiledFrameRemainder0 = true;
              var14 = re.field_n[var12];
              if (var14.field_i == 22) {
                var5 = -param3 + (int)(24.0 * (var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)));
                var6 = -param0 + (int)(24.0 * (var14.field_l.field_a + ((double)var14.field_j.field_g + 0.5)));
                decompiledFrameRemainder0 = !(-96 > var5);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(var6 < -96)) &&
                  (decompiledFrameRemainder0 = !(736 < var5)) &&
                  (decompiledFrameRemainder0 = !(var6 > 576))) {
                  if (var14.field_I <= 0) {
                    stackIn_104_0 = v.field_j;
                  } else {
                    stackIn_104_0 = ci.field_b;
                  }
                  ((bd) (Object) stackIn_104_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                }
              } else {
                if (var14.field_i == 5) {
                  var6 = -param0 + (int)(24.0 * (0.5 + (double)var14.field_j.field_g + var14.field_l.field_a));
                  var5 = -param3 + (int)((var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)) * 24.0);
                  decompiledFrameRemainder0 = !(-96 > var5);
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = !(var6 < -96)) &&
                    (decompiledFrameRemainder0 = !(var5 > 736)) &&
                    (decompiledFrameRemainder0 = !(576 < var6))) {
                    if (0 < var14.field_I) {
                      stackIn_95_0 = ia.field_l[12];
                    } else {
                      stackIn_95_0 = rl.field_d;
                    }
                    ((bd) (Object) stackIn_95_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                  }
                } else {
                  if (var14.field_i == 24 ||
                    var14.field_i == 4) {
                    var6 = (int)(24.0 * (var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g))) - param0;
                    var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) - param3;
                    decompiledFrameRemainder0 = !(-96 > var5);
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameRemainder0 = !(var6 < -96)) &&
                      (decompiledFrameRemainder0 = !(var5 > 736)) &&
                      (decompiledFrameRemainder0 = !(var6 > 576))) {
                      ia.field_l[10].a(true, 128, (int)var14.field_c, var5, var6);
                    }
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (0 == ue.field_d)) {
                if (var14.field_i == 6) {
                  var6 = -param0 + (int)((var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g)) * 24.0);
                  var5 = (int)(24.0 * (var14.field_l.field_f + ((double)var14.field_j.field_e + -0.5))) - param3;
                  if (var5 >= -96 &&
                    -96 <= var6 &&
                    var5 <= 736 &&
                    var6 <= 576) {
                    ia.field_l[13].a(true, 128, 0, var5, var6);
                  }
                } else {
                  if (var14.field_u != null &&
                    128 != var14.field_i &&
                    var14.field_i != 129 &&
                    130 != var14.field_i &&
                    var14.field_i != 131 &&
                    var14.field_i != 132 &&
                    133 != var14.field_i) {
                    var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) - param3;
                    var6 = (int)(((double)var14.field_j.field_g + 0.5 + var14.field_l.field_a) * 24.0) - param0;
                    if (var5 >= -96 &&
                      var6 >= -96 &&
                      var5 <= 736 &&
                      var6 <= 576) {
                      var14.field_u.a((double)var6, (double)var5, false, var14.field_c, 128);
                    }
                  }
                }
              }
              var12++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var4), "lg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -122) {
          lg.a(-6, 9, -15, -117);
        }
        if (this.field_q > this.field_j) {
          this.field_i = this.field_i + (-this.field_j + this.field_q);
          this.field_j = this.field_j + (-this.field_j + this.field_q);
          this.field_q = this.field_q + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_q = this.field_q + param1;
          var4++;
        } while (var4 < 10 &&
          this.field_q < this.field_j);
        if (this.field_j > this.field_q) {
          this.field_q = this.field_j;
        }
        return var4;
    }

    final void b(boolean param0) {
        if (param0) {
          lg.a(-37, 17, 11, -80);
        }
        this.field_i = 0L;
        if (this.field_j < this.field_q) {
          this.field_j = this.field_j + (this.field_q - this.field_j);
        }
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = HostileSpawn.field_I ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_i;
        this.field_i = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_r[this.field_o] = var4;
          if (1 > this.field_p) {
            this.field_p = this.field_p + 1;
          }
          this.field_o = (this.field_o + 1) % 10;
        }
        long var6 = 0L;
        if (param0 != 1) {
          return -82L;
        }
        for (var8 = 1; this.field_p >= var8; var8++) {
          var6 = var6 + this.field_r[(10 - var8 + this.field_o) % 10];
        }
        return var6 / (long)this.field_p;
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -111) {
          field_f = -60;
        }
        field_l = null;
        field_h = null;
        field_n = null;
        field_k = null;
    }

    lg() {
        this.field_i = 0L;
        this.field_j = 0L;
        this.field_r = new long[10];
        this.field_p = 1;
        this.field_q = 0L;
        this.field_o = 0;
        this.field_j = System.nanoTime();
        this.field_q = System.nanoTime();
    }

    static {
        field_f = 0;
        field_e = new nd(10, 2, 2, 0);
        field_h = "Highscores";
        field_n = new String[]{"Ammo", "Fuel", "Cells", "Rockets"};
        field_l = "Start Game";
    }
}
