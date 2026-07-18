/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm {
    static String field_n;
    private float field_j;
    static String field_b;
    static int field_f;
    static String field_m;
    private float field_a;
    private hm field_e;
    private float field_i;
    private float field_o;
    private int[][] field_k;
    private float field_c;
    private int field_l;
    static dd[] field_d;
    private so field_h;
    static String field_g;

    final void a(vf param0, int param1) {
        RuntimeException var3 = null;
        float var3_float = 0.0f;
        int var4 = 0;
        hm var4_ref_hm = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_19_0 = null;
        float stackIn_19_1 = 0.0f;
        Object stackIn_20_0 = null;
        float stackIn_20_1 = 0.0f;
        Object stackIn_21_0 = null;
        float stackIn_21_1 = 0.0f;
        float stackIn_21_2 = 0.0f;
        Object stackIn_22_0 = null;
        float stackIn_22_1 = 0.0f;
        Object stackIn_23_0 = null;
        float stackIn_23_1 = 0.0f;
        Object stackIn_24_0 = null;
        float stackIn_24_1 = 0.0f;
        float stackIn_24_2 = 0.0f;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        float stackOut_18_1 = 0.0f;
        Object stackOut_20_0 = null;
        float stackOut_20_1 = 0.0f;
        float stackOut_20_2 = 0.0f;
        Object stackOut_19_0 = null;
        float stackOut_19_1 = 0.0f;
        float stackOut_19_2 = 0.0f;
        Object stackOut_21_0 = null;
        float stackOut_21_1 = 0.0f;
        Object stackOut_23_0 = null;
        float stackOut_23_1 = 0.0f;
        float stackOut_23_2 = 0.0f;
        Object stackOut_22_0 = null;
        float stackOut_22_1 = 0.0f;
        float stackOut_22_2 = 0.0f;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var3_float = ((vm) this).field_j * ((vm) this).field_j + ((vm) this).field_o * ((vm) this).field_o;
              if (10000000.0f >= var3_float) {
                L2: {
                  L3: {
                    if (0.0f != ((vm) this).field_i) {
                      break L3;
                    } else {
                      if (((vm) this).field_a == 0.0f) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((vm) this).field_j = ((vm) this).field_j + ((vm) this).field_i;
                  ((vm) this).field_o = ((vm) this).field_o + ((vm) this).field_a;
                  var4 = 0;
                  L4: while (true) {
                    if (var4 >= ((vm) this).field_h.field_b.length) {
                      break L2;
                    } else {
                      ((vm) this).field_h.field_b[var4].field_d[0] = (int)(((vm) this).field_j + (float)((vm) this).field_k[var4][0]);
                      ((vm) this).field_h.field_b[var4].field_d[1] = (int)((float)((vm) this).field_k[var4][1] + ((vm) this).field_o);
                      var4++;
                      continue L4;
                    }
                  }
                }
                L5: {
                  if (((vm) this).field_c == 0.0f) {
                    break L5;
                  } else {
                    var4_ref_hm = new hm();
                    var4_ref_hm.a(66, 0, 0, 1, (int)((vm) this).field_c);
                    ((vm) this).field_e.a(param1 ^ 9, var4_ref_hm);
                    ((vm) this).field_e.a(ek.field_b, -96);
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= ((vm) this).field_h.field_b.length) {
                        break L5;
                      } else {
                        ((vm) this).field_h.field_b[var5].field_d[3] = ek.field_b[3];
                        ((vm) this).field_h.field_b[var5].field_d[4] = ek.field_b[4];
                        ((vm) this).field_h.field_b[var5].field_d[5] = ek.field_b[5];
                        ((vm) this).field_h.field_b[var5].field_d[6] = ek.field_b[6];
                        ((vm) this).field_h.field_b[var5].field_d[7] = ek.field_b[7];
                        ((vm) this).field_h.field_b[var5].field_d[8] = ek.field_b[8];
                        ((vm) this).field_h.field_b[var5].field_d[9] = ek.field_b[9];
                        ((vm) this).field_h.field_b[var5].field_d[10] = ek.field_b[10];
                        ((vm) this).field_h.field_b[var5].field_d[11] = ek.field_b[11];
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
                L7: {
                  if (0.0f != ((vm) this).field_i) {
                    break L7;
                  } else {
                    if (((vm) this).field_a != 0.0f) {
                      break L7;
                    } else {
                      if (((vm) this).field_c != 0.0f) {
                        break L7;
                      } else {
                        if (0 == ga.a(1500, true, ea.field_r)) {
                          L8: {
                            stackOut_18_0 = this;
                            stackOut_18_1 = ((vm) this).field_i;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            if (((vm) this).field_k[0][0] <= 0) {
                              stackOut_20_0 = this;
                              stackOut_20_1 = stackIn_20_1;
                              stackOut_20_2 = (float)(-ga.a(256, true, ea.field_r)) / 256.0f;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              stackIn_21_2 = stackOut_20_2;
                              break L8;
                            } else {
                              stackOut_19_0 = this;
                              stackOut_19_1 = stackIn_19_1;
                              stackOut_19_2 = (float)ga.a(256, true, ea.field_r) / 256.0f;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              stackIn_21_2 = stackOut_19_2;
                              break L8;
                            }
                          }
                          L9: {
                            ((vm) this).field_i = stackIn_21_1 + stackIn_21_2;
                            stackOut_21_0 = this;
                            stackOut_21_1 = ((vm) this).field_a;
                            stackIn_23_0 = stackOut_21_0;
                            stackIn_23_1 = stackOut_21_1;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            if (0 < ((vm) this).field_k[0][1]) {
                              stackOut_23_0 = this;
                              stackOut_23_1 = stackIn_23_1;
                              stackOut_23_2 = (float)ga.a(256, true, ea.field_r) / 256.0f;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              stackIn_24_2 = stackOut_23_2;
                              break L9;
                            } else {
                              stackOut_22_0 = this;
                              stackOut_22_1 = stackIn_22_1;
                              stackOut_22_2 = (float)(-ga.a(256, true, ea.field_r)) / 256.0f;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              stackIn_24_2 = stackOut_22_2;
                              break L9;
                            }
                          }
                          ((vm) this).field_a = stackIn_24_1 + stackIn_24_2;
                          ((vm) this).field_c = ((vm) this).field_c + ((float)ga.a(256, true, ea.field_r) / 32.0f - 0.5f);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L10: {
                  ((vm) this).field_h.a(param0.field_q, param0.field_e, param0.field_F, (byte) -88, param0.field_u, param0.field_C);
                  ((vm) this).field_i = (float)((double)((vm) this).field_i * 0.99);
                  ((vm) this).field_a = (float)((double)((vm) this).field_a * 0.99);
                  ((vm) this).field_c = (float)((double)((vm) this).field_c * 0.99);
                  if (((vm) this).field_i <= 0.0f) {
                    break L10;
                  } else {
                    if (0.001 <= (double)((vm) this).field_i) {
                      break L10;
                    } else {
                      ((vm) this).field_i = 0.0f;
                      break L10;
                    }
                  }
                }
                L11: {
                  if (((vm) this).field_a <= 0.0f) {
                    break L11;
                  } else {
                    if (0.001 > (double)((vm) this).field_a) {
                      ((vm) this).field_a = 0.0f;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (((vm) this).field_i >= 0.0f) {
                    break L12;
                  } else {
                    if (-0.001 < (double)((vm) this).field_i) {
                      ((vm) this).field_i = 0.0f;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0.0f <= ((vm) this).field_a) {
                    break L13;
                  } else {
                    if ((double)((vm) this).field_a > -0.001) {
                      ((vm) this).field_a = 0.0f;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (0.0f >= ((vm) this).field_c) {
                    break L14;
                  } else {
                    if ((double)((vm) this).field_c < 0.001) {
                      ((vm) this).field_c = 0.0f;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                if (((vm) this).field_c >= 0.0f) {
                  break L1;
                } else {
                  if (-0.001 >= (double)((vm) this).field_c) {
                    break L1;
                  } else {
                    ((vm) this).field_c = 0.0f;
                    break L1;
                  }
                }
              } else {
                ((vm) this).field_i = 0.0f;
                ((vm) this).field_c = 0.0f;
                ((vm) this).field_a = 0.0f;
                break L1;
              }
            }
            var7 = 0;
            var4 = var7;
            L15: while (true) {
              if (((vm) this).field_h.field_b.length <= var7) {
                L16: {
                  if (param1 == 10) {
                    break L16;
                  } else {
                    ((vm) this).a(-110);
                    break L16;
                  }
                }
                break L0;
              } else {
                ((vm) this).field_h.field_b[var7].field_d[2] = ((vm) this).field_k[var7][2] - -(o.a(ci.field_f * ((vm) this).field_l, (byte) 82) >> 13);
                var7++;
                continue L15;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var3;
            stackOut_53_1 = new StringBuilder().append("vm.A(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L17;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L17;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var15 = null;
        var7 = Pool.field_O;
        var2 = -82 % ((param0 - 62) / 60);
        var3 = 0;
        L0: while (true) {
          if (~((vm) this).field_h.field_b.length >= ~var3) {
            return;
          } else {
            var14 = ((vm) this).field_h.field_b[var3].field_d;
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var5 = var8;
            var15 = ((vm) this).field_k[var3];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (~var4 <= ~var14.length) {
                  break L2;
                } else {
                  if (~var4 <= ~var15.length) {
                    break L2;
                  } else {
                    var5[var4] = var15[var4];
                    var4++;
                    continue L1;
                  }
                }
              }
              L3: {
                if (var4 >= 4) {
                  break L3;
                } else {
                  var14[4] = 0;
                  break L3;
                }
              }
              L4: {
                if (var4 >= 9) {
                  break L4;
                } else {
                  var14[9] = 0;
                  break L4;
                }
              }
              L5: {
                if (var4 < 10) {
                  var14[10] = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 < 3) {
                  var14[3] = 65536;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 >= 11) {
                  break L7;
                } else {
                  var14[11] = 65536;
                  break L7;
                }
              }
              L8: {
                if (var4 < 7) {
                  var14[7] = 65536;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 >= 6) {
                  break L9;
                } else {
                  var14[6] = 0;
                  break L9;
                }
              }
              L10: {
                if (8 > var4) {
                  var14[8] = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 >= 5) {
                  break L11;
                } else {
                  var14[5] = 0;
                  break L11;
                }
              }
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        field_g = null;
        field_b = null;
        field_d = null;
        field_n = null;
        field_m = null;
    }

    vm(so param0) {
        int var2_int = 0;
        try {
            ((vm) this).field_h = param0;
            ((vm) this).field_e = new hm();
            ((vm) this).field_k = new int[param0.field_b.length][];
            for (var2_int = 0; param0.field_b.length > var2_int; var2_int++) {
                ((vm) this).field_k[var2_int] = new int[3];
            }
            ((vm) this).field_l = 32 + ga.a(32, true, ea.field_r);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> secs";
        field_n = "You must play <%1> more rated games before playing with the current options.";
        field_f = 0;
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_g = null;
    }
}
