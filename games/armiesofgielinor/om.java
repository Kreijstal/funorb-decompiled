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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 == 37) {
            break L0;
          } else {
            fu discarded$2 = ((om) this).g(-112);
            break L0;
          }
        }
        L1: {
          if (!param2.equals((Object) (Object) "id")) {
            if (param2.equals((Object) (Object) "flg")) {
              if (param0 > 0) {
                ((om) this).field_k = (int)tn.a(false, param0, param1);
                break L1;
              } else {
                break L1;
              }
            } else {
              if (!param2.equals((Object) (Object) "name")) {
                if (!param2.equals((Object) (Object) "key")) {
                  if (param2.equals((Object) (Object) "pos")) {
                    if (-1 <= (param0 ^ -1)) {
                      break L1;
                    } else {
                      ((om) this).field_w = (int)tn.a(false, param0, param1);
                      break L1;
                    }
                  } else {
                    if (!param2.equals((Object) (Object) "w")) {
                      if (param2.equals((Object) (Object) "h")) {
                        if (0 < param0) {
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (!param2.equals((Object) (Object) "mid")) {
                          if (param2.equals((Object) (Object) "ngb")) {
                            if ((param0 ^ -1) < -1) {
                              var5 = ai.a(param1, true);
                              ((om) this).field_y = new int[var5];
                              var6 = 0;
                              L2: while (true) {
                                if (var6 >= var5) {
                                  break L1;
                                } else {
                                  ((om) this).field_y[var6] = (int)tn.a(false, 2, param1);
                                  var6++;
                                  continue L2;
                                }
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            if (param2.equals((Object) (Object) "mpsz")) {
                              if (0 >= param0) {
                                break L1;
                              } else {
                                ((om) this).field_o = (int)tn.a(false, param0, param1);
                                break L1;
                              }
                            } else {
                              if (!param2.equals((Object) (Object) "mpt")) {
                                if (!param2.equals((Object) (Object) "ptc")) {
                                  if (!param2.equals((Object) (Object) "rwd")) {
                                    if (param2.equals((Object) (Object) "mbr")) {
                                      if (0 < param0) {
                                        ((om) this).field_u = (int)tn.a(false, param0, param1);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (!param2.equals((Object) (Object) "tr")) {
                                        if (!param2.equals((Object) (Object) "df")) {
                                          if (!param2.equals((Object) (Object) "dsc")) {
                                            if (param2.equals((Object) (Object) "gt")) {
                                              if (0 < param0) {
                                                ((om) this).field_m = (int)tn.a(false, param0, param1);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (param2.equals((Object) (Object) "gd")) {
                                                if ((param0 ^ -1) >= -1) {
                                                  break L1;
                                                } else {
                                                  ((om) this).field_F = (int)tn.a(false, param0, param1);
                                                  break L1;
                                                }
                                              } else {
                                                if (!param2.equals((Object) (Object) "ach")) {
                                                  if (param2.equals((Object) (Object) "song")) {
                                                    if (param0 <= 0) {
                                                      break L1;
                                                    } else {
                                                      ((om) this).field_q = (int)tn.a(false, param0, param1);
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (param2.equals((Object) (Object) "team")) {
                                                      if (param0 <= 0) {
                                                        break L1;
                                                      } else {
                                                        var5 = ai.a(param1, true);
                                                        ((om) this).field_x = new int[var5];
                                                        var6 = 0;
                                                        L3: while (true) {
                                                          if (var5 <= var6) {
                                                            break L1;
                                                          } else {
                                                            ((om) this).field_x[var6] = (int)tn.a(false, 2, param1);
                                                            var6++;
                                                            continue L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  if (0 < param0) {
                                                    break L1;
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (0 < param0) {
                                              ((om) this).field_n = up.a(param1, param0, (byte) -119);
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        } else {
                                          if (0 >= param0) {
                                            break L1;
                                          } else {
                                            ((om) this).field_E = (int)tn.a(false, param0, param1);
                                            break L1;
                                          }
                                        }
                                      } else {
                                        if (param0 > 0) {
                                          ((om) this).field_l = (int)tn.a(false, param0, param1);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    if (-1 <= (param0 ^ -1)) {
                                      break L1;
                                    } else {
                                      var5 = ai.a(param1, true);
                                      ((om) this).field_D = new int[var5];
                                      var6 = 0;
                                      L4: while (true) {
                                        if (var6 >= var5) {
                                          break L1;
                                        } else {
                                          ((om) this).field_D[var6] = (int)tn.a(false, 2, param1);
                                          var6++;
                                          continue L4;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (-1 < param0) {
                                    var5 = ai.a(param1, true);
                                    ((om) this).field_B = new int[var5];
                                    var6 = 0;
                                    L5: while (true) {
                                      if (var5 <= var6) {
                                        break L1;
                                      } else {
                                        ((om) this).field_B[var6] = (int)tn.a(false, 2, param1);
                                        var6++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              } else {
                                if (-1 <= param0) {
                                  break L1;
                                } else {
                                  ((om) this).field_z = (int)tn.a(false, param0, param1);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          if (0 >= param0) {
                            break L1;
                          } else {
                            ((om) this).field_t = (int)tn.a(false, param0, param1);
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (param0 <= 0) {
                        break L1;
                      } else {
                        ((om) this).field_A = (int)tn.a(false, param0, param1);
                        break L1;
                      }
                    }
                  }
                } else {
                  if (param0 <= 0) {
                    break L1;
                  } else {
                    String discarded$3 = up.a(param1, param0, (byte) -82);
                    break L1;
                  }
                }
              } else {
                if (-1 > (param0 ^ -1)) {
                  ((om) this).field_J = up.a(param1, param0, (byte) -82);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            if (-1 <= (param0 ^ -1)) {
              break L1;
            } else {
              ((om) this).field_v = (int)tn.a(false, param0, param1);
              break L1;
            }
          }
        }
    }

    final lo a(int param0) {
        if (null == ((om) this).field_C) {
            ((om) this).field_C = this.d((byte) 92);
        }
        if (param0 > -88) {
            ((om) this).field_q = 10;
        }
        return ((om) this).field_C;
    }

    public static void f(int param0) {
        field_r = null;
        field_I = null;
        field_s = null;
        field_p = null;
        if (param0 != 0) {
            field_r = null;
        }
    }

    private final lo d(byte param0) {
        if (param0 < 86) {
            gl discarded$0 = om.c((byte) 8);
        }
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
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        wk[] var7 = fk.a(param1, (byte) -126, param3, param2);
        wk[] var4 = var7;
        for (var5 = 0; -10 < (var5 ^ -1); var5++) {
            var7[var5].i();
        }
        var5 = -30 % ((2 - param0) / 55);
        return var4;
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
        if (param1 != -22696) {
            field_s = null;
        }
        ij.field_x = param0;
        te.field_l = param2;
        if (null != ee.field_v) {
            ee.field_v.a(param2, param0, (byte) -14);
        }
    }

    final static gl c(byte param0) {
        if (param0 >= -11) {
            Object var2 = null;
            wk[] discarded$0 = om.a((byte) -102, (String) null, (String) null, (kl) null);
        }
        return new gl(cn.e(488997228), rf.c(-104));
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
