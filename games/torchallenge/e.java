/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e extends da {
    nc field_n;
    int field_l;
    static int[][] field_p;
    da field_k;
    static int field_m;
    static String field_i;
    static volatile int field_o;
    static String field_j;

    final static int b(byte param0, int param1) {
        if (param0 != 57) {
            e.b((byte) -85);
        }
        return oa.a((byte) -126, param1, pl.field_d);
    }

    final static ka a(int param0, int param1, byte param2) {
        int discarded$0 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        ka var3 = new ka(param1, param1);
        int var4 = 0;
        if (param2 > -44) {
            discarded$0 = e.b((byte) -104, 50);
        }
        while (var4 < var3.field_y.length) {
            var3.field_y[var4] = param0;
            var4++;
        }
        return var3;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              vj.field_d = new ka[3];
              if (param0 <= -20) {
                break L1;
              } else {
                e.b((byte) 64);
                break L1;
              }
            }
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 3) {
                cg.field_g = new ka(var2_int, var3);
                break L0;
              } else {
                L3: {
                  vj.field_d[var4] = new ka(we.field_m[1 + var4].field_q - -(param1 * 2), 2 * param1 + we.field_m[var4 + 1].field_v);
                  if (we.field_m[1 + var4].field_q > var2_int) {
                    var2_int = we.field_m[var4 - -1].field_q;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var3 < we.field_m[var4 - -1].field_v) {
                    var3 = we.field_m[1 + var4].field_v;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  vj.field_d[var4].d();
                  if (0 != var4) {
                    break L5;
                  } else {
                    qg.a(ui.field_f);
                    qg.a(0, 0, -(2 * param1) + qg.field_g, qg.field_f);
                    break L5;
                  }
                }
                L6: {
                  we.field_m[1 + var4].a(param1, param1, 16777215);
                  if (var4 != 0) {
                    break L6;
                  } else {
                    qg.b(ui.field_f);
                    break L6;
                  }
                }
                qg.d(param1, param1, 0, 0, qg.field_g, qg.field_f);
                la.field_f.a(-32);
                vj.field_d[var4].h();
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "e.C(" + param0 + ',' + param1 + ')');
        }
    }

    e(nc param0, da param1) {
        try {
            this.field_n = param0;
            this.field_l = param0.f();
            this.field_k = param1;
            this.field_n.f(128 + this.field_l * sh.field_r >> -947562936);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ue var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var4 = (ue) ((Object) wl.field_b.c((byte) -29));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                ji.a((byte) 92, param1, var4);
                var4 = (ue) ((Object) wl.field_b.c(-270));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "e.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static ka[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ka[] discarded$1 = null;
        int var9 = 0;
        ka[] var10 = null;
        ka[] var11_ref_ka__ = null;
        int var11 = 0;
        int var12 = 0;
        ka var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        var9 = param4 + param2 + param8;
        var10 = new ka[]{new ka(var9, var9), new ka(param0, var9), new ka(var9, var9), new ka(var9, param0), new ka(64, 64), new ka(var9, param0), new ka(var9, var9), new ka(param0, var9), new ka(var9, var9)};
        var11_ref_ka__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_ka__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param2) {
                var11 = 0;
                L2: while (true) {
                  if (param2 <= var11) {
                    L3: {
                      if (param3 == 1065) {
                        break L3;
                      } else {
                        discarded$1 = e.a(32, -20, -114, -96, -32, 54, -99, -97, 73);
                        break L3;
                      }
                    }
                    var11 = 0;
                    L4: while (true) {
                      if (param0 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (param0 >> -106731839 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param8) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_y[var11 + (-1 + var9 + -var12) * param0] = param7;
                                var10[3].field_y[var9 * var11 + (-1 + (var9 + -var12))] = param7;
                                var10[7].field_y[param0 * var12 - -var11] = param7;
                                var10[5].field_y[var9 * var11 + var12] = param7;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 >= param2) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_y[var11 + param0 * (-1 + (-var12 + var9))] = param6;
                            var10[5].field_y[-1 + (var9 - (var12 - var11 * var9))] = param6;
                            var10[1].field_y[param0 * var12 + var11] = param1;
                            var10[3].field_y[var11 * var9 + var12] = param1;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_y[var12 + var9 * var11] = param1;
                        var10[0].field_y[var11 + var9 * var12] = param1;
                        if (var9 - var11 > var12) {
                          var10[2].field_y[var12 + var9 * var11] = param1;
                          var10[6].field_y[var11 + var12 * var9] = param1;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_y[var12 + (-1 + var9 + -var11) * var9] = param6;
                    var10[8].field_y[var12 + (-var11 + (var9 - 1)) * var9] = param6;
                    var10[2].field_y[-var11 + (var9 + (-1 + var12 * var9))] = param6;
                    var10[8].field_y[var9 * var12 - (var11 + 1 + -var9)] = param6;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ka__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_y.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_y[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        ka[] discarded$0 = null;
        field_p = (int[][]) null;
        if (param0 != -83) {
            discarded$0 = e.a(-61, 114, -62, 9, 74, -72, 46, -127, -48);
        }
        field_j = null;
        field_i = null;
    }

    static {
        field_j = "Friends can be added in multiplayer<nbsp>games";
        field_o = 0;
    }
}
