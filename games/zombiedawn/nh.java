/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends hp implements hh {
    static vn[] field_R;
    qi field_F;
    private an field_N;
    private an field_Q;
    static int field_G;
    boolean field_H;
    pk field_T;
    String field_U;
    static int field_I;
    rb field_L;
    static int field_P;
    private boolean field_S;
    private int field_M;
    private int field_V;
    static ke field_J;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        if (param1 != 1) {
            ((nh) this).c((byte) -2);
        }
        return super.a(param0, 1, param2, param3, param4, param5, param6);
    }

    public static void f(byte param0) {
        field_R = null;
        int var1 = -87 / ((64 - param0) / 49);
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -17741) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((nh) this).field_S) {
              break L2;
            } else {
              if (!super.e(-17741)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        super.a(119, param1, param0, param2, param3);
        ((nh) this).field_N.a(44, 0, 0, -20 + param2, ((nh) this).field_M);
        ((nh) this).field_Q.a(-79, 0, param2 + -20, 20, ((nh) this).field_M);
        if (!(!((nh) this).field_H)) {
            ((nh) this).field_F.a(-107, ((nh) this).field_M, 0, param2, -((nh) this).field_M + param3);
        }
        if (param4 < 11) {
            Object var7 = null;
            int discarded$0 = this.a(28, (String) null);
        }
    }

    private final int a(int param0, String param1) {
        String var4 = null;
        int var5 = ZombieDawn.field_J;
        param1 = param1.toLowerCase();
        int var3 = 0;
        if (param0 != -129) {
            ((nh) this).field_T = null;
        }
        while (var3 < ((nh) this).field_T.field_L.length) {
            var4 = ((nh) this).field_T.field_L[var3].toString().toLowerCase();
            if (var4.startsWith(param1)) {
                return var3;
            }
            var3++;
        }
        return -1;
    }

    final static boolean a(byte param0, ec param1) {
        if (param0 != 77) {
            field_G = 1;
        }
        return param1.c(10);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((nh) this).field_M = param4;
        int var6 = -42 % ((-23 - param0) / 48);
        this.c(param2, param1, param3, param4, 81);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var5 = 44 % ((-83 - param0) / 32);
        if (((nh) this).e(-17741)) {
          L0: {
            if (null == ((nh) this).field_T.field_L) {
              break L0;
            } else {
              L1: {
                var6 = ((nh) this).field_T.field_L.length;
                if (99 == param1) {
                  break L1;
                } else {
                  if ((param1 ^ -1) == -99) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 == 105) {
                        break L2;
                      } else {
                        if (param1 != 104) {
                          if ((param1 ^ -1) != -85) {
                            if (85 == param1) {
                              var7_int = ((nh) this).field_U.length();
                              if (0 >= var7_int) {
                                return true;
                              } else {
                                ((nh) this).field_U = ((nh) this).field_U.substring(0, var7_int - 1);
                                return true;
                              }
                            } else {
                              if (param3 < 32) {
                                break L0;
                              } else {
                                if (param3 >= 128) {
                                  break L0;
                                } else {
                                  var7 = ((nh) this).field_U + param3;
                                  this.a(var7, (byte) -89);
                                  return true;
                                }
                              }
                            }
                          } else {
                            L3: {
                              if (((nh) this).field_H) {
                                this.g((byte) -44);
                                break L3;
                              } else {
                                this.h((byte) -117);
                                break L3;
                              }
                            }
                            return true;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (((nh) this).e((byte) -109)) {
                        break L4;
                      } else {
                        this.h((byte) -115);
                        break L4;
                      }
                    }
                    L5: {
                      var7_int = ((nh) this).field_F.field_D.field_n / ((nh) this).field_T.field_I;
                      if (-106 == (param1 ^ -1)) {
                        ((nh) this).field_T.field_K = ((nh) this).field_T.field_K + var7_int;
                        break L5;
                      } else {
                        ((nh) this).field_T.field_K = ((nh) this).field_T.field_K - var7_int;
                        break L5;
                      }
                    }
                    L6: {
                      if (0 > ((nh) this).field_T.field_K) {
                        ((nh) this).field_T.field_K = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((nh) this).field_T.field_K < var6) {
                        break L7;
                      } else {
                        ((nh) this).field_T.field_K = var6 - 1;
                        break L7;
                      }
                    }
                    this.a(24);
                    return true;
                  }
                }
              }
              L8: {
                if (((nh) this).e((byte) -43)) {
                  break L8;
                } else {
                  this.h((byte) -123);
                  break L8;
                }
              }
              L9: {
                if (param1 != 99) {
                  ((nh) this).field_T.field_K = ((nh) this).field_T.field_K - 1;
                  break L9;
                } else {
                  ((nh) this).field_T.field_K = ((nh) this).field_T.field_K + 1;
                  break L9;
                }
              }
              L10: {
                if ((((nh) this).field_T.field_K ^ -1) <= -1) {
                  break L10;
                } else {
                  ((nh) this).field_T.field_K = 0;
                  break L10;
                }
              }
              L11: {
                if (var6 <= ((nh) this).field_T.field_K) {
                  ((nh) this).field_T.field_K = var6 + -1;
                  break L11;
                } else {
                  break L11;
                }
              }
              this.a(24);
              return true;
            }
          }
          if (-81 == (param1 ^ -1)) {
            this.g((byte) -44);
            return false;
          } else {
            return super.a(-119, param1, param2, param3);
          }
        } else {
          return false;
        }
    }

    final void c(byte param0) {
        ((nh) this).field_S = false;
        super.c(param0);
    }

    final boolean e(byte param0) {
        if (param0 >= -10) {
            return true;
        }
        return ((nh) this).field_H;
    }

    final int h(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((nh) this).e(-95);
        }
        return ((nh) this).field_T.field_K;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -7, param2, param3);
        int var5 = 60 / ((param1 - 46) / 42);
    }

    private final void g(byte param0) {
        if (param0 != -44) {
            return;
        }
        if (!((nh) this).e((byte) -84)) {
            return;
        }
        this.c(((nh) this).field_k, ((nh) this).field_j, ((nh) this).field_i, ((nh) this).field_M, 27);
        ((nh) this).field_H = false;
        ((nh) this).field_F.b(-27598);
    }

    nh(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (io) null);
        ((nh) this).field_U = "";
        ((nh) this).field_L = ia.field_e;
        ((nh) this).field_T = new pk((nh) this, ((nh) this).field_L, param0, param1);
        ((nh) this).field_V = param2;
        ((nh) this).field_T.field_v = (sk) this;
        ((nh) this).field_H = false;
        ((nh) this).field_N = new an("", (io) (Object) new ud((nh) this), (sk) this);
        ((nh) this).field_Q = new an();
        ((nh) this).field_Q.field_h = (io) (Object) new eb();
        ((nh) this).field_Q.field_v = (sk) this;
        ((nh) this).a((ga) (Object) ((nh) this).field_N, 10);
        ((nh) this).a((ga) (Object) ((nh) this).field_Q, 10);
    }

    private final void h(byte param0) {
        int var2 = ((nh) this).field_T.h(1227847265);
        int var3 = var2;
        int var4 = 0;
        if (!(((nh) this).field_V >= var3)) {
            var3 = ((nh) this).field_V;
            var4 = 1;
        }
        this.c(((nh) this).field_k, ((nh) this).field_j, ((nh) this).field_i, var3 + ((nh) this).field_M, 82);
        ((nh) this).field_T.a(-117, 0, 0, ((nh) this).field_i, var2);
        ((nh) this).field_F = new qi(0, 0, 0, 0, (io) (Object) new kh(), (ga) (Object) ((nh) this).field_T, (io) null);
        if (var4 != 0) {
            ((nh) this).field_F.a(true, (byte) 100, wo.v(6130));
        }
        ((nh) this).field_F.a(-78, ((nh) this).field_M, 0, ((nh) this).field_i, ((nh) this).field_n - ((nh) this).field_M);
        ((nh) this).field_H = true;
        if (param0 > -114) {
            return;
        }
        ((nh) this).a((ga) (Object) ((nh) this).field_F, 10);
        this.a(24);
    }

    final void b(boolean param0) {
        if (!param0) {
            boolean discarded$0 = ((nh) this).e((byte) 82);
        }
        if (((nh) this).field_v instanceof qa) {
            ((qa) (Object) ((nh) this).field_v).a(-16510, (nh) this);
        }
    }

    final boolean a(byte param0, ga param1) {
        if (param0 < 67) {
            ((nh) this).field_L = null;
        }
        param1.c((byte) 57);
        ((nh) this).field_S = true;
        ((nh) this).field_U = "";
        if (null != ((nh) this).field_v) {
            if (((nh) this).field_v instanceof ef) {
                ((ef) (Object) ((nh) this).field_v).a(((nh) this).field_S, (ga) this, (byte) 15);
            }
        }
        return true;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = aa.a(sd.a(-66, param0), -27513);
        int var3 = 55 / ((-49 - param1) / 61);
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        if (!((nh) this).e((byte) -127)) {
          return;
        } else {
          L0: {
            if ((((nh) this).field_T.field_K ^ -1) == 0) {
              break L0;
            } else {
              if (null == ((nh) this).field_T.field_L) {
                break L0;
              } else {
                if (((nh) this).field_F.field_L == null) {
                  break L0;
                } else {
                  var2 = ((nh) this).field_F.field_D.field_n;
                  var3 = ((nh) this).field_T.field_I;
                  var4 = -var2 + ((nh) this).field_T.field_n;
                  if (var4 <= 0) {
                    return;
                  } else {
                    L1: {
                      var5 = var3 * ((nh) this).field_T.field_K;
                      var6 = var5 + ((nh) this).field_F.field_D.field_z.field_j;
                      var7 = var2 >> -1346871262;
                      if (var6 < var7) {
                        L2: {
                          var8 = -(-var5 + var7 << -610829616) / var4;
                          if ((var8 ^ -1) > -1) {
                            var8 = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((nh) this).field_F.field_L.field_E = var8;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L3: {
                      if (param0 == 24) {
                        break L3;
                      } else {
                        var9 = null;
                        this.a((String) null, (byte) 100);
                        break L3;
                      }
                    }
                    L4: {
                      var7 = (3 * var2 >> 1497756354) - var3;
                      if (var6 <= var7) {
                        break L4;
                      } else {
                        L5: {
                          var8 = -(var7 - var5 << -1014289456) / var4;
                          if (var8 <= 65536) {
                            break L5;
                          } else {
                            var8 = 65536;
                            break L5;
                          }
                        }
                        ((nh) this).field_F.field_L.field_E = var8;
                        break L4;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void a(String param0, byte param1) {
        if (((nh) this).field_T.field_L == null) {
            return;
        }
        int var4 = 31 / ((param1 - 47) / 48);
        int var3 = this.a(-129, param0.toLowerCase());
        if (var3 == -1) {
            return;
        }
        ((nh) this).field_T.field_K = var3;
        this.a(24);
        ((nh) this).field_U = param0;
    }

    final String d(int param0) {
        int var2 = 0;
        if (((nh) this).field_l) {
          L0: {
            if (!((nh) this).e((byte) -57)) {
              break L0;
            } else {
              if (!((nh) this).field_F.field_l) {
                break L0;
              } else {
                if ((((nh) this).field_T.field_O ^ -1) != 0) {
                  return ((nh) this).field_T.field_L[((nh) this).field_T.field_O].toString();
                } else {
                  break L0;
                }
              }
            }
          }
          if (null == ((nh) this).field_T.g(0)) {
            var2 = 49 % ((10 - param0) / 58);
            return super.d(-89);
          } else {
            return ((nh) this).field_T.g(0).toString();
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (((nh) this).e((byte) -48)) {
            this.g((byte) -44);
        } else {
            this.h((byte) -122);
        }
        if (param1 != -6) {
            ((nh) this).field_U = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = null;
        field_P = 480;
        field_I = 2 + field_P / 24;
        field_G = field_P / 2;
    }
}
