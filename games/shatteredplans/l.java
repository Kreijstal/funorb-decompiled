/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l {
    private int field_l;
    int field_k;
    static String field_i;
    static String field_d;
    static qr field_a;
    ln[] field_e;
    int[][] field_h;
    int field_b;
    static bc field_g;
    int[][] field_c;
    Random field_j;
    static int field_f;

    final void b(byte param0) {
        this.field_h = wb.a(this.field_e, 0);
        if (param0 != 80) {
            ob var3 = (ob) null;
            this.a((byte) 42, (fs[]) null, (ob) null);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -94) {
            l.a((byte) -50);
        }
        field_i = null;
        field_a = null;
        field_g = null;
    }

    final void a(int param0) {
        if (param0 != 26253) {
            this.field_j = (Random) null;
        }
        this.field_c = mb.a(this.field_e, false);
    }

    private final void a(fs param0, vr param1, int param2, ln param3) {
        sd var5 = null;
        lo var6 = null;
        try {
            if (param2 != 32447) {
                this.field_e = (ln[]) null;
            }
            param3.field_t = param0;
            param3.field_y = param0;
            var5 = new sd(param0, param3);
            var5.a(param2 ^ -11190, param3);
            param3.field_R = var5;
            var6 = new lo(param0, param3);
            var6.a(-21771, param3);
            param0.field_i.a((byte) -113, var5);
            param0.field_m = var6;
            kd.a(param1, false, param3, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "l.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ob param0, fs[] param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ln[] var13 = null;
        ln var14 = null;
        ln var15 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.e(11135, this.field_l);
              param0.d(this.field_k, 255);
              param0.d(this.field_b, 255);
              var4_int = this.field_e.length;
              param0.d(var4_int, 255);
              var5 = this.field_e;
              if (param2 > 126) {
                break L1;
              } else {
                this.field_j = (Random) null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var5.length <= var6) {
                break L0;
              } else {
                var7 = var5[var6];
                var15 = var7;
                var15 = var7;
                var8 = 0;
                var13 = var7.field_D;
                var9_ref_ln__ = var13;
                var10 = 0;
                L3: while (true) {
                  if (var10 >= var13.length) {
                    param0.c(var8, (byte) -116);
                    var9_ref_ln__ = var7.field_D;
                    var10 = 0;
                    L4: while (true) {
                      if (var10 >= var9_ref_ln__.length) {
                        var9 = 0;
                        L5: while (true) {
                          if (4 <= var9) {
                            L6: {
                              var9 = var7.field_x;
                              if (!var7.field_u) {
                                break L6;
                              } else {
                                var9 = var9 | 32768;
                                break L6;
                              }
                            }
                            param0.d(var9, 255);
                            param0.c(var7.field_L << 2090858182 | var7.field_B, (byte) -121);
                            var6++;
                            continue L2;
                          } else {
                            L7: {
                              var10 = var7.field_G[var9];
                              if (0 <= var10) {
                                break L7;
                              } else {
                                var10 = -var10;
                                break L7;
                              }
                            }
                            L8: {
                              var9++;
                              if (var9 >= 4) {
                                break L8;
                              } else {
                                L9: {
                                  var11 = var7.field_G[var9];
                                  if ((var11 ^ -1) <= -1) {
                                    break L9;
                                  } else {
                                    var11 = -var11;
                                    break L9;
                                  }
                                }
                                var10 = var10 | var11 << -2091555132;
                                break L8;
                              }
                            }
                            param0.c(var10, (byte) -77);
                            var9++;
                            continue L5;
                          }
                        }
                      } else {
                        L10: {
                          var15 = var9_ref_ln__[var10];
                          if (var7.field_p < var15.field_p) {
                            di.a(var15, false, param0);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                  } else {
                    var14 = var13[var10];
                    var15 = var14;
                    var15 = var14;
                    if (var14.field_p > var7.field_p) {
                      var8++;
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4);

            stackIn_32_1 = new StringBuilder().append("l.D(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ')');
        }
    }

    final void a(fs[] param0, vr param1, int param2) {
        int var4_int = 0;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = this.field_e;
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var5.length <= var6) {
                  break L2;
                } else {
                  L3: {
                    var7 = var5[var6];
                    if (-4 != (var7.field_L ^ -1)) {
                      break L3;
                    } else {
                      this.a(param0[var4_int], param1, param2 ^ 32443, var7);
                      var4_int++;
                      if (var4_int != param0.length) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
              L4: {
                if (param2 != 4) {
                  field_g = (bc) null;
                  this.b((byte) 80);
                  break L4;
                } else {
                  this.b((byte) 80);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("l.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, fs[] param1, ob param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param2.d(this.field_k, param0 ^ -170);
            param2.d(this.field_b, param0 ^ -170);
            var4_int = this.field_e.length;
            param2.d(var4_int, 255);
            if (param0 == -87) {
              var5 = this.field_e;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var5[var6];
                  b.a(2232, param2, var7.field_I);
                  param2.d(var7.field_A, param0 ^ -170);
                  param2.d(var7.field_S, 255);
                  param2.c(var7.field_z, (byte) -92);
                  var8 = var7.field_D.length;
                  param2.c(var8, (byte) -122);
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      var9 = 0;
                      L3: while (true) {
                        if (4 <= var9) {
                          L4: {
                            var9 = var7.field_x;
                            if (var7.field_u) {
                              var9 = var9 | 32768;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          param2.d(var9, param0 ^ -170);
                          param2.c(var7.field_B | var7.field_L << 1114423462, (byte) -82);
                          var6++;
                          continue L1;
                        } else {
                          L5: {
                            var10 = var7.field_G[var9];
                            if (0 <= var10) {
                              break L5;
                            } else {
                              var10 = -var10;
                              break L5;
                            }
                          }
                          L6: {
                            var9++;
                            if (var9 < 4) {
                              L7: {
                                var11 = var7.field_G[var9];
                                if (0 > var11) {
                                  var11 = -var11;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var10 = var10 | var11 << 572642308;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          param2.c(var10, (byte) -110);
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      di.a(var7.field_D[var9], false, param2);
                      var9++;
                      continue L2;
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
          L8: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("l.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, ob param1, fs[] param2) {
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 10529) {
              var8 = this.field_e;
              var4 = var8;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var8.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var8[var5];
                  im.a(var6.field_t, param1, 9555);
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("l.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    l(int param0, int param1, int param2, int param3) {
        this.field_k = param0;
        this.field_l = param2;
        this.field_b = param1;
        this.field_j = (Random) ((Object) new ea((long)this.field_l));
        this.field_e = new ln[param3];
    }

    static {
        field_d = "Your request to join has been declined.";
        field_i = "Location";
    }
}
