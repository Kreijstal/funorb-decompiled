/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends ch {
    private int field_P;
    static String field_S;
    boolean field_R;
    static int field_V;
    static int field_Q;
    static so field_U;
    private lq field_T;
    static String field_O;
    static String field_N;

    public static void h(int param0) {
        field_N = null;
        if (param0 != -1) {
            Object var2 = null;
            boolean discarded$0 = oe.a(false, (int[]) null);
        }
        field_O = null;
        field_U = null;
        field_S = null;
    }

    private final int a(int param0) {
        if (param0 >= -65) {
            return -39;
        }
        return !((oe) this).field_R ? 0 : this == (Object) (Object) ((oe) this).field_T.j(117) ? 256 : 0;
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(boolean param0, int param1) {
        ff.a(0, param0);
        if (!(null == kk.field_B)) {
            pp.a(kk.field_B, 1259627265);
        }
        if (param1 != 1) {
            Object var3 = null;
            boolean discarded$0 = oe.a(true, (int[]) null);
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 == -20) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        L1: {
          var2 = this.a(-69);
          var3 = -((oe) this).field_P + var2;
          if (var3 <= 0) {
            break L1;
          } else {
            ((oe) this).field_P = ((oe) this).field_P + (8 + var3 - 1) / 8;
            break L1;
          }
        }
        L2: {
          if (0 <= var3) {
            break L2;
          } else {
            ((oe) this).field_P = ((oe) this).field_P + (1 + (var3 + -16)) / 16;
            break L2;
          }
        }
        L3: {
          L4: {
            if (((oe) this).field_P != 0) {
              break L4;
            } else {
              if (0 != var2) {
                break L4;
              } else {
                if (((oe) this).field_R) {
                  break L4;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
            }
          }
          stackOut_10_0 = 0;
          stackIn_11_0 = stackOut_10_0;
          break L3;
        }
        return stackIn_11_0 != 0;
    }

    boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              ((oe) this).field_P = this.a(-82);
              if (0 != ((oe) this).field_P) {
                break L1;
              } else {
                if (((oe) this).field_R) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static int a(bf[] param0, int param1, pq[] param2, int[][] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sa var7 = null;
        pq var8 = null;
        int var8_int = 0;
        pq var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var5 = 0;
        var6 = param4;
        L0: while (true) {
          if (var6 >= param2.length) {
            if (var5 == 0) {
              return -1;
            } else {
              var10 = 0;
              var6 = var10;
              L1: while (true) {
                if (var5 <= var10) {
                  return param1;
                } else {
                  L2: {
                    var7 = kj.field_g[var10];
                    param1 = var7.field_u;
                    var8 = param2[var7.field_n];
                    if (-1 != var7.field_i) {
                      L3: {
                        if (var7.field_n != 0) {
                          break L3;
                        } else {
                          if (-1 == hb.field_s) {
                            hb.field_s = var7.field_i;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if ((33554432L & pd.field_i) == 0L) {
                          break L4;
                        } else {
                          System.out.println("Bounce ball " + var7.field_n + " and ball " + var7.field_i + " at time " + Integer.toString(var7.field_u, 16));
                          break L4;
                        }
                      }
                      var9 = param2[var7.field_i];
                      ok.a(var7.field_u, var8, var9, (byte) 105);
                      if (var8.field_q != null) {
                        var8.field_q.a(param2, (int) var7.field_i, param4 + -5);
                        break L2;
                      } else {
                        if (var9.field_q == null) {
                          break L2;
                        } else {
                          var9.field_q.a(param2, (int) var7.field_n, -5);
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L5: {
                    if (-1 != var7.field_x) {
                      var8.field_c = var8.field_c + 1;
                      sm.a(var7.field_u, param0[var7.field_x], 117, var8);
                      if (null == var8.field_q) {
                        break L5;
                      } else {
                        var8.field_q.a((int) var7.field_x, -26401, var8);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (var7.field_a != -1) {
                    var8.field_c = var8.field_c + 1;
                    dk.a(param3[var7.field_a][0], (byte) -20, var7.field_u, var8, param3[var7.field_a][1]);
                    if (var8.field_q != null) {
                      var8.field_q.a(var8, (int) var7.field_a, (byte) 5);
                      var10++;
                      continue L1;
                    } else {
                      var10++;
                      continue L1;
                    }
                  } else {
                    var10++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            if (param2[var6].field_s) {
              var7_int = var6 + 1;
              L6: while (true) {
                if (var7_int >= param2.length) {
                  if (0 != param2[var6].field_v) {
                    var7_int = 0;
                    L7: while (true) {
                      if (var7_int >= param0.length) {
                        var7_int = 0;
                        L8: while (true) {
                          if (var7_int < param3.length) {
                            var8_int = j.a(param2[var6].field_k, param3[var7_int][0], param2[var6].field_I, param2[var6].field_t, param2[var6].field_w, 8, param2[var6].field_g, (byte) -121, param3[var7_int][1]);
                            if (var8_int > param1) {
                              var5 = bq.a((byte) -123, var5, var7_int, -1, -1, var6, var8_int);
                              var7_int++;
                              continue L8;
                            } else {
                              var7_int++;
                              continue L8;
                            }
                          } else {
                            var6++;
                            continue L0;
                          }
                        }
                      } else {
                        var8_int = c.a(param2[var6].field_w, param0[var7_int].field_f, param2[var6].field_k, param0[var7_int].field_j, param2[var6].field_t, param2[var6].field_g, 8, param0[var7_int].field_l, (byte) 98, param0[var7_int].field_a, param2[var6].field_I);
                        if (param1 < var8_int) {
                          var5 = bq.a((byte) -128, var5, -1, -1, var7_int, var6, var8_int);
                          var7_int++;
                          continue L7;
                        } else {
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  if (param2[var7_int].field_s) {
                    L9: {
                      if (param2[var6].field_v != 0) {
                        break L9;
                      } else {
                        if (0 != param2[var7_int].field_v) {
                          break L9;
                        } else {
                          var7_int++;
                          continue L6;
                        }
                      }
                    }
                    var8_int = no.a(param2[var7_int].field_t, param2[var6].field_w, param2[var7_int].field_I, param2[var7_int].field_w, param2[var6].field_I, param2[var7_int].field_k, param2[var6].field_t, param2[var7_int].field_g, 8, param2[var6].field_g, param2[var6].field_k, -1);
                    if (param1 < var8_int) {
                      L10: {
                        if (param2[var6].field_w < param2[var7_int].field_w) {
                          stackOut_16_0 = param2[var7_int].field_w;
                          stackIn_17_0 = stackOut_16_0;
                          break L10;
                        } else {
                          stackOut_15_0 = param2[var6].field_w;
                          stackIn_17_0 = stackOut_15_0;
                          break L10;
                        }
                      }
                      if (stackIn_17_0 <= var8_int) {
                        var5 = bq.a((byte) -124, var5, -1, var7_int, -1, var6, var8_int);
                        var7_int++;
                        continue L6;
                      } else {
                        var7_int++;
                        continue L6;
                      }
                    } else {
                      var7_int++;
                      continue L6;
                    }
                  } else {
                    var7_int++;
                    continue L6;
                  }
                }
              }
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 31936) {
            int discarded$0 = this.a(87);
        }
        ((oe) this).a(param2, -param2 + nk.field_j >> -2016834047, param0, false, md.field_b + -param0 >> 152102657);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        if (-1 == ((oe) this).field_P) {
          return;
        } else {
          if (256 > ((oe) this).field_P) {
            L0: {
              L1: {
                if (ad.field_y == null) {
                  break L1;
                } else {
                  if (ad.field_y.field_z < ((oe) this).field_l) {
                    break L1;
                  } else {
                    if (((oe) this).field_y > ad.field_y.field_A) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              ad.field_y = new dd(((oe) this).field_l, ((oe) this).field_y);
              break L0;
            }
            kj.a(117, ad.field_y);
            qh.d();
            ((oe) this).a(0, 0, 260);
            super.a(param0, (byte) 48, -((oe) this).field_C + -param2, -((oe) this).field_D + -param3);
            oc.a(117);
            ad.field_y.a(((oe) this).field_C + param2, param3 - -((oe) this).field_D, ((oe) this).field_P);
            var5 = 121 / ((param1 - -42) / 53);
            return;
          } else {
            if (-1 != param0) {
              return;
            } else {
              ((oe) this).a(param2 + ((oe) this).field_C, param3 + ((oe) this).field_D, 260);
              super.a(param0, (byte) 70, param2, param3);
              return;
            }
          }
        }
    }

    oe(lq param0, int param1, int param2) {
        super(-param1 + nk.field_j >> -764801279, -param2 + md.field_b >> 454206785, param1, param2, (fp) null);
        ((oe) this).field_T = param0;
        ((oe) this).field_P = 0;
        ((oe) this).field_R = false;
    }

    final static boolean a(boolean param0, int[] param1) {
        int var2 = 0;
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = oe.a(true, (int[]) null);
        }
        for (var2 = 0; var2 < 8; var2++) {
            if (param1[var2] != 0) {
                return true;
            }
        }
        return false;
    }

    final ei f(byte param0) {
        int var2 = 69 / ((param0 - 51) / 61);
        ei var3 = super.f((byte) 123);
        if (!(var3 == null)) {
            return var3;
        }
        return (ei) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 0;
        field_O = "You are not currently logged in to the game.";
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_S = "Blues";
        field_Q = 250;
    }
}
