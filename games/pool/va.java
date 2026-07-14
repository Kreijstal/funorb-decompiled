/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends fe {
    static int[] field_T;
    private tc field_S;
    static int[] field_N;
    static String field_O;
    static int field_V;
    static String field_P;
    private int field_U;
    static int field_X;
    int field_R;
    static String[] field_W;
    int field_Q;

    final int g(int param0) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          boolean discarded$2 = ((va) this).a((ei) null, -110, false, -50, 44, -90, -14);
          return ((va) this).field_S.a((byte) 98);
        } else {
          return ((va) this).field_S.a((byte) 98);
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pool.field_O;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -param1 + (param6 - ((va) this).field_Q);
            var9 = -(2 * ((va) this).field_Q) + ((va) this).field_l;
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var8) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((va) this).field_U / var9;
          if (-2 != (param3 ^ -1)) {
            if ((param3 ^ -1) == -3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((va) this).field_S.a((byte) 87) <= var12) {
                  if (var11 < 0) {
                    return true;
                  } else {
                    ((va) this).field_S.c(var11, 40);
                    return true;
                  }
                } else {
                  var13 = -var8 + ((va) this).field_S.a(var12, 2229);
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((va) this).field_S.a((byte) -2, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_P = null;
        field_W = null;
        field_N = null;
        field_O = null;
        if (param0 != 2) {
          boolean discarded$2 = va.g((byte) 126);
          field_T = null;
          return;
        } else {
          field_T = null;
          return;
        }
    }

    final int f(int param0) {
        if (param0 != 0) {
            return 73;
        }
        return ((va) this).field_U;
    }

    final static String a(String param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        oq var7 = null;
        oq var8 = null;
        CharSequence var9 = null;
        var9 = (CharSequence) (Object) param0;
        if (gj.a(-25908, var9)) {
          if (2 != th.field_a) {
            return ka.field_n;
          } else {
            if (or.a((byte) 3, param0)) {
              return fn.field_Qb;
            } else {
              if (!lq.a(param0, -1)) {
                if (-101 < (nr.field_S ^ -1)) {
                  if (nr.field_S >= 200) {
                    return wk.field_V;
                  } else {
                    if (ia.a(param0, 24552)) {
                      return nr.a(new String[1], -1, jp.field_R);
                    } else {
                      var8 = ej.field_j;
                      var8.b(false, param1);
                      var8.field_v = var8.field_v + 1;
                      var4 = var8.field_v;
                      var8.a(0, false);
                      var5 = -59 % ((-53 - param2) / 33);
                      var8.a(-9946, param0);
                      var8.b(var8.field_v + -var4, true);
                      return null;
                    }
                  }
                } else {
                  if (mp.field_V > 0) {
                    if (nr.field_S >= 200) {
                      return wk.field_V;
                    } else {
                      if (ia.a(param0, 24552)) {
                        return nr.a(new String[1], -1, jp.field_R);
                      } else {
                        var7 = ej.field_j;
                        var7.b(false, param1);
                        var7.field_v = var7.field_v + 1;
                        var4 = var7.field_v;
                        var7.a(0, false);
                        var5 = -59 % ((-53 - param2) / 33);
                        var7.a(-9946, param0);
                        var7.b(var7.field_v + -var4, true);
                        return null;
                      }
                    }
                  } else {
                    return wk.field_V;
                  }
                }
              } else {
                return nr.a(new String[1], -1, tl.field_H);
              }
            }
          }
        } else {
          return p.field_g;
        }
    }

    final static boolean g(byte param0) {
        ho var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ho var5 = null;
        var4 = Pool.field_O;
        var5 = (ho) (Object) pj.field_H.c((byte) -88);
        var1 = var5;
        if (var1 != null) {
          var2 = 0;
          var3 = -7 % ((param0 - -62) / 57);
          L0: while (true) {
            if (var1.field_t > var2) {
              L1: {
                if (null == var5.field_n[var2]) {
                  break L1;
                } else {
                  if (0 != var5.field_n[var2].field_f) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              if (null != var5.field_p[var2]) {
                if (var5.field_p[var2].field_f == 0) {
                  return false;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                var2++;
                var2++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0, vh param1, vh param2) {
        if (param0) {
          field_T = null;
          param2.field_eb = -param2.field_Db + param1.field_Db >> -1507683615;
          return;
        } else {
          param2.field_eb = -param2.field_Db + param1.field_Db >> -1507683615;
          return;
        }
    }

    final int b(byte param0, int param1) {
        Object var4 = null;
        if (param0 <= -22) {
          if (0 <= param1) {
            if (param1 >= ((va) this).field_S.a((byte) 127)) {
              return -1;
            } else {
              return ((va) this).field_S.a(param1, 2229);
            }
          } else {
            return -1;
          }
        } else {
          var4 = null;
          va.a(true, (vh) null, (vh) null);
          if (0 <= param1) {
            if (param1 >= ((va) this).field_S.a((byte) 127)) {
              return -1;
            } else {
              return ((va) this).field_S.a(param1, 2229);
            }
          } else {
            return -1;
          }
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Friends can be added in multiplayer<nbsp>games";
        field_O = "Just play";
    }
}
