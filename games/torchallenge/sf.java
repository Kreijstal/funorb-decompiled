/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private lj field_g;
    private je field_e;
    static int[] field_b;
    private lj field_f;
    static int field_c;
    static lj field_a;
    static ka[][][] field_d;

    final lh a(int param0, byte param1) {
        lh var3 = null;
        byte[] var4 = null;
        lh stackIn_2_0 = null;
        lh stackIn_14_0 = null;
        lh stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        lh var3Lifetime1;
        try {
          var3 = (lh) (this.field_e.a((long)param0, 0));
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (param0 >= 32768) {
            var4 = this.field_g.c(1, param0 & 32767, 0);
          } else {
            var4 = this.field_f.c(1, param0, 0);
          }
          var3Lifetime1 = new lh();
          if (var4 != null) {
            var3Lifetime1.a(new uf(var4), (byte) -113);
          }
          if (param0 >= 32768) {
            var3Lifetime1.d(0);
          }
          if (param1 > -8) {
            stackIn_14_0 = (lh) null;
            return stackIn_14_0;
          }
          this.field_e.a(var3Lifetime1, (byte) 96, (long)param0);
          stackIn_16_0 = var3Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "sf.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(ka param0, ka[] param1, int param2, int param3, int param4, int param5, byte param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = param4 + (param5 - 1);
          var8 = -1 + (param3 + param2);
          var9 = param1[0].field_q;
          var10 = param1[0].field_v;
          param0.d();
          param1[0].g(param4, param2);
          param1[2].g(-var9 + var7_int, param2);
          param1[6].g(param4, var8 - var10);
          param1[8].g(var7_int - var9, -var10 + var8);
          param1[1].d(var9 + param4, param2, -(2 * var9) + param5, var10);
          param1[7].d(param4 + var9, var8 - var10, param5 - var9 * 2, var10);
          param1[3].d(param4, param2 + var10, var9, param3 - var10 * 2);
          if (param6 != -55) {
            field_a = (lj) null;
          }
          param1[5].d(var7_int - var9, param2 + var10, var9, param3 - var10 * 2);
          param1[4].d(param4 + var9, param2 + var10, -(var9 * 2) + param5, -(2 * var10) + param3);
          la.field_f.a(-47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("sf.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2 = 99 / ((72 - param0) / 41);
          var1_int = -1;
          var3 = rj.field_g;
          var4 = cj.field_b ? 1 : 0;
          if (pg.field_q > 0) {
            pg.field_q = pg.field_q - 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (bc.field_o != 1 && (bc.field_o != 3 ||
            !ad.field_j)) {
            if (bc.field_o == -1 &&
              var4 == 0 &&
              ea.field_e >= 0 &&
              wb.field_p != null &&
              gl.field_k > 0) {
              if (0 == ea.field_e) {
                var1_int = 0;
              } else {
                if (ea.field_e == 1) {
                  var1_int = 1;
                } else {
                  if (ea.field_e == 2) {
                    var1_int = 2;
                  } else {
                    if (ea.field_e == 3) {
                      var1_int = 3;
                    } else {
                      if (ea.field_e == 4) {
                        var1_int = 4;
                      } else {
                        if (ea.field_e == 5) {
                          var1_int = 5;
                        } else {
                          if (ea.field_e == 6) {
                            var1_int = 6;
                          } else {
                            if (ea.field_e == 7) {
                              var1_int = 6;
                            } else {
                              if ((8 == ea.field_e)) {
                                var1_int = 6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (13 == bc.field_o && (var3 == 2 ||
                var3 == 1 ||
                3 == var3)) {
                var1_int = 9;
              } else {
                if (bc.field_o == 13 &&
                  var3 == 4) {
                  var1_int = -1;
                } else {
                  if (13 == bc.field_o &&
                    var3 == 5) {
                    if (gh.field_x) {
                      var1_int = 11;
                    } else {
                      var1_int = 10;
                    }
                  } else {
                    if ((13 != bc.field_o ||
                      var3 != 7) &&
                      bc.field_o != 15) {
                      if (13 == bc.field_o &&
                        6 == var3) {
                        var1_int = 12;
                      } else {
                        if (bc.field_o != 0 &&
                          12 != bc.field_o &&
                          3 != bc.field_o &&
                          2 != bc.field_o &&
                          bc.field_o != 4) {
                          if ((-1 != bc.field_o)) {
                            var1_int = 8;
                          }
                        } else {
                          var1_int = 7;
                        }
                      }
                    } else {
                      var1_int = 13;
                    }
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var1_int = ag.field_d;
          }
          if (~ag.field_d != ~var1_int) {
            bd.d(1);
            if (var1_int != -1) {
              pg.field_q = 10;
            }
            ag.field_d = var1_int;
          } else {
            if (pg.field_q == 0) {
              pg.field_q = -1;
              if (ag.field_d != -1) {
                var5 = dd.field_n[var1_int] ? 1 : 0;
                lg.a(var5 != 0, (byte) -79, al.field_x[var1_int]);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "sf.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
          if (param0) {
            field_c = 84;
          }
          field_d = (ka[][][]) null;
          field_b = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ')');
        }
    }

    private sf() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "sf.<init>()");
        }
    }

    static {
        field_c = 0;
        field_b = new int[12];
        field_d = new ka[4][2][2];
    }
}
