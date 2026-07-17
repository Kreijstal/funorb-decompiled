/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_I;
    byte[] field_g;
    int[][] field_K;
    byte[] field_x;
    int field_e;
    int[] field_B;
    int[][] field_q;
    int field_t;
    int field_j;
    static String field_n;
    int[] field_w;
    int[][] field_h;
    static String field_A;
    int field_b;
    byte[] field_i;
    int[] field_z;
    int field_r;
    boolean[] field_E;
    byte field_N;
    int field_v;
    int field_y;
    int field_M;
    int field_G;
    int field_L;
    int field_a;
    static vd field_J;
    int[] field_D;
    byte[] field_C;
    int field_m;
    int field_l;
    byte[] field_s;
    int field_c;
    byte[][] field_p;
    boolean[] field_H;
    static double field_f;
    byte[] field_k;
    static java.lang.reflect.Method field_u;
    static String field_F;
    static fh field_d;
    static String[] field_o;

    public static void a() {
        field_u = null;
        field_n = null;
        field_d = null;
        field_o = null;
        field_F = null;
        field_J = null;
        field_A = null;
    }

    final static void a(boolean param0, mb param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.field_rc;
              if (var2_int == 10) {
                param1.field_Q = param1.field_Q - 100;
                break L1;
              } else {
                if (var2_int != 11) {
                  if (var2_int == 12) {
                    param1.field_Q = param1.field_Q - 300;
                    break L1;
                  } else {
                    if (var2_int != 13) {
                      if (14 == var2_int) {
                        param1.field_Q = param1.field_Q - 500;
                        break L1;
                      } else {
                        if (var2_int == 0) {
                          param1.field_wb = param1.field_wb - 1;
                          break L1;
                        } else {
                          if (var2_int == 1) {
                            param1.field_wb = param1.field_wb - 2;
                            break L1;
                          } else {
                            if (2 != var2_int) {
                              if (var2_int != 3) {
                                if (var2_int != 4) {
                                  if (var2_int == 20) {
                                    param1.field_wb = param1.field_wb - 10;
                                    break L1;
                                  } else {
                                    L2: {
                                      if (5 == var2_int) {
                                        break L2;
                                      } else {
                                        if (var2_int != 6) {
                                          if (var2_int == 7) {
                                            break L2;
                                          } else {
                                            if (var2_int == 8) {
                                              break L2;
                                            } else {
                                              if (var2_int != 9) {
                                                if (var2_int != 29) {
                                                  if (28 != var2_int) {
                                                    break L1;
                                                  } else {
                                                    param1.field_Fb = param1.field_Fb / 2;
                                                    break L1;
                                                  }
                                                } else {
                                                  param1.field_cb = param1.field_cb / 2;
                                                  break L1;
                                                }
                                              } else {
                                                param1.field_x = param1.field_x - ag.a(48, param1.field_rc);
                                                break L1;
                                              }
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    param1.field_x = param1.field_x - ag.a(48, param1.field_rc);
                                    break L1;
                                  }
                                } else {
                                  param1.field_wb = param1.field_wb - 5;
                                  break L1;
                                }
                              } else {
                                param1.field_wb = param1.field_wb - 4;
                                break L1;
                              }
                            } else {
                              param1.field_wb = param1.field_wb - 3;
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      param1.field_Q = param1.field_Q - 400;
                      break L1;
                    }
                  }
                } else {
                  param1.field_Q = param1.field_Q - 200;
                  break L1;
                }
              }
            }
            L3: {
              if (~param1.field_S < ~param1.field_Q) {
                param1.field_S = param1.field_Q;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~param1.field_Tb >= ~param1.field_x) {
                break L4;
              } else {
                param1.g(5);
                break L4;
              }
            }
            param1.field_rc = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("nh.B(").append(1).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L5;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
        }
    }

    final static void a(byte param0, gh param1, gh param2) {
        try {
            if (!(null != param1.field_M)) {
                param1.field_M = new ul();
            }
            if (!(param2.field_M != null)) {
                param2.field_M = new ul();
            }
            if (null == pi.field_a) {
                pi.field_a = new dk(64);
            }
            if (!(null != db.field_h)) {
                db.field_h = new dk(64);
            }
            ea.field_c = param1.field_M;
            if (param0 > -97) {
                field_o = null;
            }
            am.field_c = param2.field_M;
            int discarded$0 = 1;
            ub.a();
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nh.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    nh() {
        ((nh) this).field_g = new byte[18002];
        ((nh) this).field_h = new int[6][258];
        ((nh) this).field_x = new byte[256];
        ((nh) this).field_K = new int[6][258];
        ((nh) this).field_q = new int[6][258];
        ((nh) this).field_i = new byte[4096];
        ((nh) this).field_E = new boolean[256];
        ((nh) this).field_B = new int[16];
        ((nh) this).field_D = new int[6];
        ((nh) this).field_p = new byte[6][258];
        ((nh) this).field_H = new boolean[16];
        ((nh) this).field_s = new byte[18002];
        ((nh) this).field_w = new int[257];
        ((nh) this).field_a = 0;
        ((nh) this).field_z = new int[256];
        ((nh) this).field_I = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "SUDDEN DEATH!";
        field_n = "You have entered another game.";
        field_J = new vd();
        field_f = 0.0;
        field_o = new String[]{"", "<br>You have ten minutes before the battle in orbit reaches the surface.", "<br>Capture the MGFN technology to win the score-gaining power.", "<br>Stay within the crashed ship's energy shield to gain score.", "<br>Reach the enemy ship and return to help your team win the battle."};
        field_F = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
