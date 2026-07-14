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
        ((l) this).field_h = wb.a(((l) this).field_e, 0);
        if (param0 != 80) {
            Object var3 = null;
            ((l) this).a((byte) 42, (fs[]) null, (ob) null);
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
            ((l) this).field_j = null;
        }
        ((l) this).field_c = mb.a(((l) this).field_e, false);
    }

    private final void a(fs param0, vr param1, int param2, ln param3) {
        if (param2 != 32447) {
            ((l) this).field_e = null;
        }
        param3.field_t = param0;
        param3.field_y = param0;
        sd var5 = new sd(param0, param3);
        var5.a(param2 ^ -11190, param3);
        param3.field_R = var5;
        lo var6 = new lo(param0, param3);
        var6.a(-21771, param3);
        param0.field_i.a((byte) -113, (oh) (Object) var5);
        param0.field_m = var6;
        kd.a(param1, false, param3, (byte) -2);
    }

    final void a(ob param0, fs[] param1, int param2) {
        int var4 = 0;
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
        ln[] var15 = null;
        ln var16 = null;
        ln var16_ref = null;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          param0.e(11135, ((l) this).field_l);
          param0.d(((l) this).field_k, 255);
          param0.d(((l) this).field_b, 255);
          var4 = ((l) this).field_e.length;
          param0.d(var4, 255);
          var5 = ((l) this).field_e;
          if (param2 > 126) {
            break L0;
          } else {
            ((l) this).field_j = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var5.length <= var6) {
            return;
          } else {
            var7 = var5[var6];
            var16 = var7;
            var16 = var7;
            var8 = 0;
            var13 = var7.field_D;
            var9_ref_ln__ = var13;
            var10 = 0;
            L2: while (true) {
              if (var10 >= var13.length) {
                param0.c(var8, (byte) -116);
                var15 = var7.field_D;
                var10 = 0;
                L3: while (true) {
                  if (var10 >= var15.length) {
                    var9 = 0;
                    L4: while (true) {
                      if (4 <= var9) {
                        L5: {
                          var9 = var7.field_x;
                          if (!var7.field_u) {
                            break L5;
                          } else {
                            var9 = var9 | 32768;
                            break L5;
                          }
                        }
                        param0.d(var9, 255);
                        param0.c(var7.field_L << 2090858182 | var7.field_B, (byte) -121);
                        var6++;
                        continue L1;
                      } else {
                        L6: {
                          var10 = var7.field_G[var9];
                          if (0 <= var10) {
                            break L6;
                          } else {
                            var10 = -var10;
                            break L6;
                          }
                        }
                        L7: {
                          var9++;
                          if (var9 >= 4) {
                            break L7;
                          } else {
                            L8: {
                              var11 = var7.field_G[var9];
                              if ((var11 ^ -1) <= -1) {
                                break L8;
                              } else {
                                var11 = -var11;
                                break L8;
                              }
                            }
                            var10 = var10 | var11 << -2091555132;
                            break L7;
                          }
                        }
                        param0.c(var10, (byte) -77);
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    var16_ref = var15[var10];
                    if (var7.field_p < var16_ref.field_p) {
                      di.a(var16_ref, false, param0);
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              } else {
                var14 = var13[var10];
                var16 = var14;
                var16 = var14;
                if (var14.field_p > var7.field_p) {
                  var8++;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(fs[] param0, vr param1, int param2) {
        int var4 = 0;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 0;
        var5 = ((l) this).field_e;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (var5.length <= var6) {
              break L1;
            } else {
              var7 = var5[var6];
              if (-4 == (var7.field_L ^ -1)) {
                this.a(param0[var4], param1, param2 ^ 32443, var7);
                var4++;
                if (var4 == param0.length) {
                  break L1;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
          L2: {
            if (param2 == 4) {
              break L2;
            } else {
              field_g = null;
              break L2;
            }
          }
          ((l) this).b((byte) 80);
          return;
        }
    }

    final void a(byte param0, fs[] param1, ob param2) {
        int var4 = 0;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        param2.d(((l) this).field_k, param0 ^ -170);
        param2.d(((l) this).field_b, param0 ^ -170);
        var4 = ((l) this).field_e.length;
        param2.d(var4, 255);
        if (param0 == -87) {
          var5 = ((l) this).field_e;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5.length) {
              return;
            } else {
              var7 = var5[var6];
              b.a(2232, param2, var7.field_I);
              param2.d(var7.field_A, param0 ^ -170);
              param2.d(var7.field_S, 255);
              param2.c(var7.field_z, (byte) -92);
              var8 = var7.field_D.length;
              param2.c(var8, (byte) -122);
              var9 = 0;
              L1: while (true) {
                if (var9 >= var8) {
                  var9 = 0;
                  L2: while (true) {
                    if (4 <= var9) {
                      L3: {
                        var9 = var7.field_x;
                        if (var7.field_u) {
                          var9 = var9 | 32768;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      param2.d(var9, param0 ^ -170);
                      param2.c(var7.field_B | var7.field_L << 1114423462, (byte) -82);
                      var6++;
                      continue L0;
                    } else {
                      L4: {
                        var10 = var7.field_G[var9];
                        if (0 <= var10) {
                          break L4;
                        } else {
                          var10 = -var10;
                          break L4;
                        }
                      }
                      L5: {
                        var9++;
                        if (var9 < 4) {
                          L6: {
                            var11 = var7.field_G[var9];
                            if (0 > var11) {
                              var11 = -var11;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var10 = var10 | var11 << 572642308;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      param2.c(var10, (byte) -110);
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  di.a(var7.field_D[var9], false, param2);
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, ob param1, fs[] param2) {
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 10529) {
            return;
        }
        ln[] var8 = ((l) this).field_e;
        ln[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            im.a(var6.field_t, param1, 9555);
        }
    }

    l(int param0, int param1, int param2, int param3) {
        ((l) this).field_k = param0;
        ((l) this).field_l = param2;
        ((l) this).field_b = param1;
        ((l) this).field_j = (Random) (Object) new ea((long)((l) this).field_l);
        ((l) this).field_e = new ln[param3];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your request to join has been declined.";
        field_i = "Location";
    }
}
