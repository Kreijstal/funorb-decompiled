/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends tc {
    private int field_t;
    private byte[] field_s;
    int field_p;
    private ne[] field_r;
    int field_l;
    static me field_q;
    int field_n;
    int field_k;
    static um field_u;
    static String field_m;
    static String field_o;

    final static void a(mo param0, int param1) {
        int var2 = 0;
        mo var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != param0.field_h) {
          L0: {
            L1: {
              if ((param0.field_a ^ -1) != param1) {
                break L1;
              } else {
                if (0 == param0.field_e) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (lk.field_h <= var2) {
                break L0;
              } else {
                var3 = an.field_F[var2];
                if (2 == var3.field_b) {
                  if (param0.field_a == var3.field_a) {
                    if (var3.field_e == param0.field_e) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null == param0.field_d) {
              break L3;
            } else {
              ma.field_ab = param0.field_n;
              rv.field_b = param0.field_d;
              ge.field_h = param0.field_m;
              no.field_S = param0.field_b;
              break L3;
            }
          }
          bc.a(3208, param0);
          return;
        } else {
          return;
        }
    }

    private final void a(ne[] param0, vh param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 >= 86) {
          if (param0 != null) {
            var4 = param1.k(0);
            var5 = 0;
            var6 = 0;
            L0: while (true) {
              if (var4 <= var6) {
                return;
              } else {
                var7 = param1.k(0);
                var8 = param1.k(0);
                if (-1 >= (var7 ^ -1)) {
                  if (((lo) this).field_l > var7) {
                    if (var8 >= 0) {
                      if (var8 < ((lo) this).field_n) {
                        var9 = new jd(var7, var8, 0);
                        var10 = var7 + var8 * ((lo) this).field_l;
                        if (0 <= var10) {
                          if (var10 <= param0.length) {
                            param0[var10].field_c = var9;
                            param0[var10].field_c.field_O = var5;
                            var5++;
                            var6++;
                            continue L0;
                          } else {
                            var6++;
                            continue L0;
                          }
                        } else {
                          var6++;
                          continue L0;
                        }
                      } else {
                        var6++;
                        continue L0;
                      }
                    } else {
                      var6++;
                      continue L0;
                    }
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
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int[][] e(int param0) {
        int[][] var2 = null;
        vh var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = new int[((lo) this).field_n][((lo) this).field_l];
          var7 = var8;
          var2 = var7;
          if (((lo) this).field_r != null) {
            var3 = 0;
            L1: while (true) {
              if (((lo) this).field_n <= var3) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((lo) this).field_l) {
                    var3++;
                    continue L1;
                  } else {
                    var8[var3][var4] = ((lo) this).field_r[var4 - -(((lo) this).field_l * var3)].field_h;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var3_ref = this.a((byte) 126);
            var4 = 0;
            L3: while (true) {
              if (((lo) this).field_n <= var4) {
                break L0;
              } else {
                var5 = 0;
                L4: while (true) {
                  if (((lo) this).field_l <= var5) {
                    var4++;
                    continue L3;
                  } else {
                    var8[var4][var5] = var3_ref.k(0);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        if (param0 == 28554) {
          return var2;
        } else {
          return null;
        }
    }

    private final ne[] a(int[] param0, int param1, ha param2) {
        int var4 = 0;
        ne[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((lo) this).field_n * ((lo) this).field_l;
          if (param1 == 22654) {
            break L0;
          } else {
            int[][] discarded$2 = ((lo) this).e(117);
            break L0;
          }
        }
        var5 = new ne[var4];
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((lo) this).field_n <= var7) {
            return var5;
          } else {
            var8 = 0;
            L2: while (true) {
              if (var8 >= ((lo) this).field_l) {
                var7++;
                continue L1;
              } else {
                if (var5.length >= var6) {
                  var5[var6] = new ne(param0[var6], param2);
                  if (-12 == (var5[var6].field_h ^ -1)) {
                    var5[var6].field_h = 0;
                    var6++;
                    var8++;
                    continue L2;
                  } else {
                    var6++;
                    var8++;
                    continue L2;
                  }
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final vh a(byte param0) {
        sc var3_ref = null;
        int var3 = 0;
        ne[] var4 = null;
        int var5 = 0;
        ne var6 = null;
        int var7 = 0;
        bv var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-5 >= (((lo) this).field_s.length ^ -1)) {
          L0: {
            var8 = new bv(((lo) this).field_s);
            ((lo) this).field_t = bs.a((vh) (Object) var8, 3);
            if (param0 == 126) {
              break L0;
            } else {
              ((lo) this).field_l = 72;
              break L0;
            }
          }
          if ((((lo) this).field_t ^ -1) == -3) {
            var3_ref = po.a(var8, param0 + -24046);
            ((lo) this).field_l = var3_ref.field_k;
            ((lo) this).field_p = var3_ref.field_a;
            ((lo) this).field_n = var3_ref.field_e;
            ((lo) this).field_r = var3_ref.field_c;
            ((lo) this).field_k = var3_ref.field_j;
            var4 = ((lo) this).field_r;
            var5 = 0;
            L1: while (true) {
              if (var5 < var4.length) {
                var6 = var4[var5];
                var6.field_m = var6.e(10);
                var5++;
                continue L1;
              } else {
                return null;
              }
            }
          } else {
            L2: {
              ((lo) this).field_l = var8.k(0);
              ((lo) this).field_n = var8.k(0);
              if (-2 < (((lo) this).field_t ^ -1)) {
                ((lo) this).field_p = 0;
                break L2;
              } else {
                ((lo) this).field_p = var8.k(0);
                break L2;
              }
            }
            L3: {
              if ((((lo) this).field_t ^ -1) <= -1) {
                ((lo) this).field_k = var8.k(0);
                break L3;
              } else {
                var3 = ((lo) this).field_l * ((lo) this).field_n;
                var8.field_q = var8.field_q + var3;
                ((lo) this).field_k = var8.k(0);
                var8.field_q = var8.field_q - (var3 + 1);
                break L3;
              }
            }
            return (vh) (Object) var8;
          }
        } else {
          return null;
        }
    }

    final static void a(va param0, int param1) {
        param0.field_y = new int[]{-1};
        param0.field_v = new char[]{(char)63};
        if (param1 != 19003) {
            Object var3 = null;
            lo.a((va) null, 21);
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            Object var2 = null;
            ru[] discarded$0 = lo.a((String) null, 125, (String) null, (kl) null);
        }
        field_u = null;
        field_q = null;
        field_m = null;
    }

    final static ru[] a(String param0, int param1, String param2, kl param3) {
        if (param1 != -28106) {
            return null;
        }
        int var4 = param3.a(param2, 110);
        int var5 = param3.a((byte) -74, var4, param0);
        return ak.a(var5, param3, 0, var4);
    }

    final ne[] a(int param0, ha param1) {
        int var3 = 0;
        ne[] var3_ref_ne__ = null;
        vh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7_int = 0;
        ne[] var7 = null;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        ne var13 = null;
        jd var14 = null;
        int var15 = 0;
        ne[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((lo) this).field_r) {
          var3 = 116 % ((param0 - -31) / 60);
          var4 = this.a((byte) 126);
          var5 = ((lo) this).field_n * ((lo) this).field_l;
          var20 = new int[var5];
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var6 = var17;
          if (2 + var5 > ((lo) this).field_s.length) {
            throw new RuntimeException("Problem loading file");
          } else {
            var7_int = 0;
            L0: while (true) {
              if (var5 <= var7_int) {
                L1: {
                  var7 = this.a(var20, 22654, param1);
                  if (0 <= ((lo) this).field_t) {
                    var8 = var4.k(0);
                    var9 = new tf(0, 0);
                    var10 = 0;
                    L2: while (true) {
                      if (var8 <= var10) {
                        break L1;
                      } else {
                        var11 = var4.k(0);
                        var12 = var11;
                        if (var12 == 0) {
                          var9.field_n = var4.k(0);
                          var9.field_o = var4.k(0);
                          var12 = var4.k(0);
                          var13_int = var4.k(0);
                          var14 = new jd(var9.field_n, var9.field_o, var12);
                          var14.field_O = var13_int;
                          var7[var9.field_o * ((lo) this).field_l + var9.field_n].field_c = var14;
                          var10++;
                          continue L2;
                        } else {
                          if (1 != var12) {
                            throw new RuntimeException("Illegal saved item type: " + var11);
                          } else {
                            L3: {
                              var9.field_n = var4.k(0);
                              var9.field_o = var4.k(0);
                              var12 = var4.k(0);
                              var13 = var7[var9.field_n - -(var9.field_o * ((lo) this).field_l)];
                              if (var13.a(false)) {
                                break L3;
                              } else {
                                if (var13.e((byte) -125)) {
                                  break L3;
                                } else {
                                  var10++;
                                  continue L2;
                                }
                              }
                            }
                            var13.field_a = var12;
                            var10++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    this.a(var7, var4, 105);
                    break L1;
                  }
                }
                return var7;
              } else {
                var6[var7_int] = var4.k(0);
                var7_int++;
                continue L0;
              }
            }
          }
        } else {
          vh discarded$1 = this.a((byte) 126);
          var16 = ((lo) this).field_r;
          var3_ref_ne__ = var16;
          var4_int = 0;
          L4: while (true) {
            if (var4_int >= var16.length) {
              return ((lo) this).field_r;
            } else {
              var5_ref_ne = var16[var4_int];
              var5_ref_ne.a((byte) -68, param1);
              if (var5_ref_ne.e((byte) -122)) {
                if (var5_ref_ne.a((byte) -107) == 0) {
                  var5_ref_ne.a(true, 1);
                  var4_int++;
                  continue L4;
                } else {
                  var4_int++;
                  continue L4;
                }
              } else {
                var4_int++;
                continue L4;
              }
            }
          }
        }
    }

    lo(int param0, byte[] param1) {
        ((lo) this).field_s = param1;
        ((lo) this).field_r = null;
        vh discarded$0 = this.a((byte) 126);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new me(12, 0, 1, 0);
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_o = "Logging in...";
    }
}
