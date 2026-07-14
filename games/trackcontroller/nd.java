/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends td implements m {
    private rh[] field_K;
    private a field_J;
    private String[] field_D;
    static int[] field_F;
    static nh field_M;
    static int[] field_G;
    static String field_I;
    static String field_H;
    static qj[] field_L;

    final static String a(int param0, be param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        L0: {
          if (param0 < -4) {
            break L0;
          } else {
            field_I = null;
            break L0;
          }
        }
        try {
          L1: {
            var3_int = param1.l(-1);
            if (param2 < var3_int) {
              var3_int = param2;
              break L1;
            } else {
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param1.field_k = param1.field_k + nb.field_v.a(param1.field_j, param1.field_k, 0, 0, var3_int, var4);
          var5 = ka.a(0, -129, var4, var3_int);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29221) {
            nd.b(false);
        }
        super.a(param0, param1, param2, param3 ^ 0);
        if (param0 != 0) {
            return;
        }
        oh var5 = gk.field_c;
        if (!(null == ((nd) this).field_D)) {
            int discarded$0 = var5.a(el.field_K, ((nd) this).field_p + param1, ((nd) this).field_m + param2, ((nd) this).field_x, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_G);
        }
    }

    final static ng[] a(kk param0, int param1, int param2, int param3) {
        if (param3 != 16777215) {
            Object var5 = null;
            String discarded$0 = nd.a(83, (be) null, -120);
        }
        if (!sk.a(param1, param0, 1, param2)) {
            return null;
        }
        return me.d(-104);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          if (param4 <= param3) {
            if (param3 < param1) {
              e.a(param7, param1, ll.field_i, param3, param2, param6, param5, param0 ^ -26362, param4);
              break L0;
            } else {
              if (param1 <= param4) {
                e.a(param6, param3, ll.field_i, param4, param7, param2, param5, param0 ^ -26362, param1);
                break L0;
              } else {
                e.a(param7, param3, ll.field_i, param1, param6, param2, param5, -26361, param4);
                break L0;
              }
            }
          } else {
            if (param4 < param1) {
              e.a(param2, param1, ll.field_i, param4, param7, param6, param5, param0 ^ -26362, param3);
              break L0;
            } else {
              if (param1 <= param3) {
                e.a(param6, param4, ll.field_i, param3, param2, param7, param5, -26361, param1);
                break L0;
              } else {
                e.a(param2, param4, ll.field_i, param1, param6, param7, param5, -26361, param3);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            field_L = null;
            break L1;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 <= -34) {
          L0: {
            if (param1 <= 0) {
              break L0;
            } else {
              if (param1 < 128) {
                return true;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (param1 < 160) {
              break L1;
            } else {
              if (param1 > 255) {
                break L1;
              } else {
                return true;
              }
            }
          }
          L2: {
            if (param1 == 0) {
              break L2;
            } else {
              var6 = h.field_e;
              var2 = var6;
              var3 = 0;
              L3: while (true) {
                if (var3 >= var6.length) {
                  break L2;
                } else {
                  var4 = var6[var3];
                  if (var4 != param1) {
                    var3++;
                    continue L3;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return true;
        }
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        ne var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          ((nd) this).field_B.e(1);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length != 0) {
              var3 = param0.length;
              ((nd) this).field_D = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  L2: {
                    var4 = new ne(gk.field_c, 0, 1);
                    ((nd) this).field_K = new rh[1 + var3];
                    if (param1 == -58) {
                      break L2;
                    } else {
                      var7 = null;
                      String discarded$1 = nd.a(59, (be) null, -116);
                      break L2;
                    }
                  }
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((nd) this).field_K[var3] = new rh(j.field_d, (tg) this);
                      ((nd) this).field_K[var3].field_y = (t) (Object) var4;
                      ((nd) this).field_K[var3].a(15, -3050, (var3 + 1) * 16 + 20, 100, 0);
                      ((nd) this).a(false, (al) (Object) ((nd) this).field_K[var3]);
                      return;
                    } else {
                      ((nd) this).field_K[var5] = new rh(((nd) this).field_D[var5], (tg) this);
                      ((nd) this).field_K[var5].field_y = (t) (Object) var4;
                      ((nd) this).field_K[var5].field_n = ke.field_b;
                      ((nd) this).field_K[var5].a(15, -3050, 16 * var5 + 20, 80, 0);
                      ((nd) this).a(false, (al) (Object) ((nd) this).field_K[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((nd) this).field_D[var4_int] = ob.a((byte) 100, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((nd) this).field_D = null;
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        if (param4 == -27322) {
          var6 = 0;
          L0: while (true) {
            if (((nd) this).field_D.length <= var6) {
              L1: {
                if (param0 != ((nd) this).field_K[((nd) this).field_D.length]) {
                  break L1;
                } else {
                  ((nd) this).field_J.a((byte) 125);
                  break L1;
                }
              }
              return;
            } else {
              if (((nd) this).field_K[var6] == param0) {
                ((nd) this).field_J.a(true, ((nd) this).field_D[var6]);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    nd(a param0) {
        super(0, 0, 0, 0, (t) null);
        ((nd) this).field_J = param0;
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        if (!(!super.a((byte) -84, param1, param2, param3))) {
            return true;
        }
        if (!((param3 ^ -1) != -99)) {
            return ((nd) this).a(param2, -52);
        }
        if (!((param3 ^ -1) != -100)) {
            return ((nd) this).a(param2, true);
        }
        int var5 = 68 / ((17 - param0) / 51);
        return false;
    }

    public static void b(boolean param0) {
        field_M = null;
        field_H = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0) {
            Object var2 = null;
            ng[] discarded$0 = nd.a((kk) null, 7, 76, -121);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new int[4];
        field_M = new nh(3);
        field_G = new int[13];
        field_H = "Log in";
        field_I = "No highscores";
    }
}
