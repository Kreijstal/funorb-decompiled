/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ac {
    private ld field_M;
    Object[] field_K;
    static String field_I;
    static wb[] field_O;
    private vn field_P;
    static ki field_H;
    int field_J;
    int field_N;
    int field_L;

    public static void f(int param0) {
        field_I = null;
        field_H = null;
        int var1 = 84 / ((-18 - param0) / 55);
        field_O = null;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        ((hd) this).field_N = -1;
        if (!((hd) this).field_M.field_A) {
          return false;
        } else {
          if (((hd) this).field_M.field_J.field_D.field_k) {
            if (null == ((hd) this).field_K) {
              return super.b(param0, -1, param2, param3, param4);
            } else {
              param3 = param3 - (((hd) this).field_v + param4);
              param0 = param0 - (((hd) this).field_r + param2);
              if (param1 >= param0) {
                if (-1 <= param3) {
                  if (param0 <= ((hd) this).field_q) {
                    if (param3 <= ((hd) this).field_p) {
                      ((hd) this).field_N = param3 / ((hd) this).field_J;
                      if (((hd) this).field_K.length <= ((hd) this).field_N) {
                        ((hd) this).field_N = -1;
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final int e(byte param0) {
        int var2 = -28 / ((param0 - -73) / 48);
        return ((hd) this).field_K == null ? 200 : (1 + ((hd) this).field_K.length * 2) * ((hd) this).field_J >> -1827804159;
    }

    final Object a(int param0) {
        if (param0 < -22) {
          if (null != ((hd) this).field_K) {
            if (0 == (((hd) this).field_L ^ -1)) {
              return null;
            } else {
              return ((hd) this).field_K[((hd) this).field_L];
            }
          } else {
            return null;
          }
        } else {
          ((hd) this).a(((int[]) ((hd) this).field_K[0])[0], ((int[]) ((hd) this).field_K[1])[7], (byte) -89, -41);
          if (null != ((hd) this).field_K) {
            if (0 == (((hd) this).field_L ^ -1)) {
              return null;
            } else {
              return ((hd) this).field_K[((hd) this).field_L];
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        super.b(param0, param1, param2, param3);
        param3 = param3 - ((hd) this).field_v;
        param1 = param1 - ((hd) this).field_r;
        if (((hd) this).field_K != null) {
          var5 = param3 / ((hd) this).field_J;
          if (var5 >= 0) {
            if (var5 >= ((hd) this).field_K.length) {
              return;
            } else {
              ((hd) this).field_L = var5;
              ((hd) this).field_M.h(0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, Object[] param2) {
        ((hd) this).field_K = param2;
        ((hd) this).field_N = -1;
        ((hd) this).field_L = param1;
        if (param2 != null) {
          if (((hd) this).field_L >= -1) {
            if (((hd) this).field_K.length > ((hd) this).field_L) {
              if (param0 != -22994) {
                ((hd) this).field_N = ((int[]) ((hd) this).field_K[1])[1];
                return;
              } else {
                return;
              }
            } else {
              throw new IllegalStateException();
            }
          } else {
            throw new IllegalStateException();
          }
        } else {
          if (param0 != -22994) {
            ((hd) this).field_N = ((int[]) ((hd) this).field_K[1])[1];
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        String var17 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (param3 == 0) {
          if (param2 < -35) {
            L0: {
              var5 = param0 - -((hd) this).field_r;
              var6 = param1 - -((hd) this).field_v;
              lk.d(var5, var6, ((hd) this).field_q, ((hd) this).field_p, 0);
              var7 = ((hd) this).field_L;
              if (-1 != ((hd) this).field_N) {
                var7 = ((hd) this).field_N;
                break L0;
              } else {
                break L0;
              }
            }
            if (((hd) this).field_K == null) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (((hd) this).field_K.length <= var8) {
                  return;
                } else {
                  L2: {
                    var16 = ((hd) this).field_K[var8];
                    var17 = var16.toString();
                    if (var7 != var8) {
                      break L2;
                    } else {
                      lk.b(2 + var5, var6 + 4, -4 + ((hd) this).field_q, ((hd) this).field_J, 2188450, 128);
                      break L2;
                    }
                  }
                  var6 = var6 + ((hd) this).field_J;
                  ((hd) this).field_P.b(var17, 2 + var5, var6, 10000536, -1);
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L3: {
              ((hd) this).b(56, -9, false, ((int[]) ((hd) this).field_K[0])[2]);
              var5 = param0 - -((hd) this).field_r;
              var6 = param1 - -((hd) this).field_v;
              lk.d(var5, var6, ((hd) this).field_q, ((hd) this).field_p, 0);
              var7 = ((hd) this).field_L;
              if (-1 != ((hd) this).field_N) {
                var7 = ((hd) this).field_N;
                break L3;
              } else {
                break L3;
              }
            }
            if (((hd) this).field_K != null) {
              var8 = 0;
              L4: while (true) {
                if (((hd) this).field_K.length > var8) {
                  L5: {
                    var14 = ((hd) this).field_K[var8];
                    var15 = var14.toString();
                    if (var7 != var8) {
                      break L5;
                    } else {
                      lk.b(2 + var5, var6 + 4, -4 + ((hd) this).field_q, ((hd) this).field_J, 2188450, 128);
                      break L5;
                    }
                  }
                  var6 = var6 + ((hd) this).field_J;
                  ((hd) this).field_P.b(var15, 2 + var5, var6, 10000536, -1);
                  var8++;
                  continue L4;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    hd(ld param0, vn param1, Object[] param2, int param3) {
        super((pk) (Object) param0);
        ((hd) this).field_M = param0;
        ((hd) this).field_P = param1;
        ((hd) this).field_J = ((hd) this).field_P.field_I + ((hd) this).field_P.field_s;
        this.a(-22994, param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "regular";
    }
}
