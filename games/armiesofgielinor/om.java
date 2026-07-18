/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends tc implements uo {
    int field_k;
    int field_l;
    static String field_s;
    static long[] field_r;
    int field_z;
    int field_q;
    private lo field_C;
    static String field_p;
    private int field_A;
    String field_n;
    int[] field_D;
    int field_m;
    int field_u;
    int[] field_B;
    int[] field_y;
    static el field_I;
    int field_o;
    int field_v;
    cf field_G;
    kl field_H;
    int field_E;
    int field_w;
    int field_F;
    private int[] field_x;
    String field_J;
    private int field_t;

    public final void a(int param0, bv param1, String param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                fu discarded$6 = ((om) this).g(-112);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2.equals((Object) (Object) "id")) {
                  if (param2.equals((Object) (Object) "flg")) {
                    if (param0 > 0) {
                      ((om) this).field_k = (int)tn.a(false, param0, param1);
                      break L3;
                    } else {
                      break L2;
                    }
                  } else {
                    if (!param2.equals((Object) (Object) "name")) {
                      if (!param2.equals((Object) (Object) "key")) {
                        if (param2.equals((Object) (Object) "pos")) {
                          if (param0 <= 0) {
                            break L3;
                          } else {
                            ((om) this).field_w = (int)tn.a(false, param0, param1);
                            break L2;
                          }
                        } else {
                          if (!param2.equals((Object) (Object) "w")) {
                            if (param2.equals((Object) (Object) "h")) {
                              if (0 < param0) {
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              if (!param2.equals((Object) (Object) "mid")) {
                                if (param2.equals((Object) (Object) "ngb")) {
                                  if (param0 > 0) {
                                    int discarded$7 = 1;
                                    var5_int = ai.a(param1);
                                    ((om) this).field_y = new int[var5_int];
                                    var6 = 0;
                                    L4: while (true) {
                                      if (~var6 <= ~var5_int) {
                                        break L3;
                                      } else {
                                        ((om) this).field_y[var6] = (int)tn.a(false, 2, param1);
                                        var6++;
                                        continue L4;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  if (param2.equals((Object) (Object) "mpsz")) {
                                    if (0 >= param0) {
                                      break L3;
                                    } else {
                                      ((om) this).field_o = (int)tn.a(false, param0, param1);
                                      break L2;
                                    }
                                  } else {
                                    if (!param2.equals((Object) (Object) "mpt")) {
                                      if (!param2.equals((Object) (Object) "ptc")) {
                                        if (!param2.equals((Object) (Object) "rwd")) {
                                          if (param2.equals((Object) (Object) "mbr")) {
                                            if (0 < param0) {
                                              ((om) this).field_u = (int)tn.a(false, param0, param1);
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            if (!param2.equals((Object) (Object) "tr")) {
                                              if (!param2.equals((Object) (Object) "df")) {
                                                if (!param2.equals((Object) (Object) "dsc")) {
                                                  if (param2.equals((Object) (Object) "gt")) {
                                                    if (0 < param0) {
                                                      ((om) this).field_m = (int)tn.a(false, param0, param1);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  } else {
                                                    if (param2.equals((Object) (Object) "gd")) {
                                                      if (param0 <= 0) {
                                                        break L3;
                                                      } else {
                                                        ((om) this).field_F = (int)tn.a(false, param0, param1);
                                                        break L2;
                                                      }
                                                    } else {
                                                      if (!param2.equals((Object) (Object) "ach")) {
                                                        if (param2.equals((Object) (Object) "song")) {
                                                          if (param0 <= 0) {
                                                            break L3;
                                                          } else {
                                                            ((om) this).field_q = (int)tn.a(false, param0, param1);
                                                            break L2;
                                                          }
                                                        } else {
                                                          if (param2.equals((Object) (Object) "team")) {
                                                            if (param0 <= 0) {
                                                              break L3;
                                                            } else {
                                                              int discarded$8 = 1;
                                                              var5_int = ai.a(param1);
                                                              ((om) this).field_x = new int[var5_int];
                                                              var6 = 0;
                                                              L5: while (true) {
                                                                if (~var5_int >= ~var6) {
                                                                  break L3;
                                                                } else {
                                                                  ((om) this).field_x[var6] = (int)tn.a(false, 2, param1);
                                                                  var6++;
                                                                  continue L5;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        if (0 < param0) {
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (0 < param0) {
                                                    ((om) this).field_n = up.a(param1, param0, (byte) -119);
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                if (0 >= param0) {
                                                  break L3;
                                                } else {
                                                  ((om) this).field_E = (int)tn.a(false, param0, param1);
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              if (param0 > 0) {
                                                ((om) this).field_l = (int)tn.a(false, param0, param1);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          if (param0 <= 0) {
                                            break L3;
                                          } else {
                                            int discarded$9 = 1;
                                            var5_int = ai.a(param1);
                                            ((om) this).field_D = new int[var5_int];
                                            var6 = 0;
                                            L6: while (true) {
                                              if (~var6 <= ~var5_int) {
                                                break L3;
                                              } else {
                                                ((om) this).field_D[var6] = (int)tn.a(false, 2, param1);
                                                var6++;
                                                continue L6;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (param0 > 0) {
                                          int discarded$10 = 1;
                                          var5_int = ai.a(param1);
                                          ((om) this).field_B = new int[var5_int];
                                          var6 = 0;
                                          L7: while (true) {
                                            if (var5_int <= var6) {
                                              break L3;
                                            } else {
                                              ((om) this).field_B[var6] = (int)tn.a(false, 2, param1);
                                              var6++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      if (param0 <= 0) {
                                        break L3;
                                      } else {
                                        ((om) this).field_z = (int)tn.a(false, param0, param1);
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (0 >= param0) {
                                  break L3;
                                } else {
                                  ((om) this).field_t = (int)tn.a(false, param0, param1);
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (param0 <= 0) {
                              break L3;
                            } else {
                              ((om) this).field_A = (int)tn.a(false, param0, param1);
                              break L2;
                            }
                          }
                        }
                      } else {
                        if (param0 <= 0) {
                          break L3;
                        } else {
                          String discarded$11 = up.a(param1, param0, (byte) -82);
                          break L2;
                        }
                      }
                    } else {
                      if (param0 > 0) {
                        ((om) this).field_J = up.a(param1, param0, (byte) -82);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  if (param0 <= 0) {
                    break L3;
                  } else {
                    ((om) this).field_v = (int)tn.a(false, param0, param1);
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_89_0 = (RuntimeException) var5;
            stackOut_89_1 = new StringBuilder().append("om.B(").append(param0).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param1 == null) {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L8;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L8;
            }
          }
          L9: {
            stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
            stackOut_92_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',');
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param2 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L9;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + ',' + param3 + ')');
        }
    }

    final lo a(int param0) {
        if (null == ((om) this).field_C) {
            int discarded$0 = 92;
            ((om) this).field_C = this.d();
        }
        if (param0 > -88) {
            ((om) this).field_q = 10;
        }
        return ((om) this).field_C;
    }

    public static void f() {
        field_r = null;
        field_I = null;
        field_s = null;
        field_p = null;
    }

    private final lo d() {
        byte[] var3 = ((om) this).field_H.a((byte) 76, ((om) this).field_t, ((om) this).field_H.a(gk.field_O[((om) this).field_G.field_r], 102));
        byte[] var2 = var3;
        return new lo(((om) this).field_v, var3);
    }

    final String[] e(int param0) {
        String[] var2 = null;
        int var3 = 0;
        sd var4 = null;
        int var5 = 0;
        String[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -23209) {
          var6 = new String[((om) this).field_B.length];
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var6.length <= var3) {
              return var2;
            } else {
              if (var3 == ((om) this).field_w) {
                var6[var3] = ((om) this).field_G.field_l;
                var3++;
                continue L0;
              } else {
                var4 = ((om) this).field_G.field_q[((om) this).field_B[var3]];
                var6[var3] = var4.field_u;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final int[] a(byte param0) {
        int var2 = -73 % ((param0 - 13) / 33);
        return ((om) this).field_x;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
            return true;
        }
        return (((om) this).field_k & 2) != 0 ? true : false;
    }

    final fu g(int param0) {
        if (param0 != -1) {
            fu discarded$0 = ((om) this).g(-55);
        }
        return new fu(((om) this).field_D, ((om) this).field_l, ((om) this).field_u);
    }

    final static wk[] a(byte param0, String param1, String param2, kl param3) {
        wk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        wk[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = fk.a(param1, (byte) -126, param3, param2);
            var4 = var7;
            var5 = 0;
            L1: while (true) {
              if (var5 >= 9) {
                var5 = -30 % ((2 - param0) / 55);
                stackOut_4_0 = (wk[]) var4;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var7[var5].i();
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("om.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_5_0;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; var2 < hs.field_G.length; var2++) {
            if (!(hs.field_G[var2] != ((om) this).field_A)) {
                ((om) this).field_o = var2;
                break;
            }
        }
        if (!param0) {
            int[] discarded$0 = ((om) this).a((byte) 40);
        }
    }

    final static void a(int param0, int param1, int param2) {
        ij.field_x = param0;
        te.field_l = param2;
        if (null != ee.field_v) {
            ee.field_v.a(param2, param0, (byte) -14);
        }
    }

    final static gl c() {
        int discarded$0 = 488997228;
        int discarded$1 = -104;
        return new gl(cn.e(), rf.c());
    }

    om() {
        ((om) this).field_q = -1;
        ((om) this).field_l = -1;
        ((om) this).field_E = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Unfortunately we are unable to create an account for you at this time.";
        field_p = "Blue_Team";
        field_r = new long[32];
    }
}
