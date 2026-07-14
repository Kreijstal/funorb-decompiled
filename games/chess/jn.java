/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jn extends fb {
    private vb field_O;
    static char[] field_M;
    private int field_N;
    static byte[] field_P;

    final void a(int param0, int param1, mf param2, int param3) {
        if (param1 >= -6) {
          String discarded$2 = ((jn) this).g(110);
          ((jn) this).field_N = ((jn) this).field_N + 1;
          super.a(param0, -10, param2, param3);
          return;
        } else {
          ((jn) this).field_N = ((jn) this).field_N + 1;
          super.a(param0, -10, param2, param3);
          return;
        }
    }

    final static void a(double[] param0, int param1, int param2) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        var3 = param0[param1];
        if (param2 == 16801) {
          var5 = param0[param1 - -1];
          var7 = param0[2 + param1];
          var9 = var3 * var3 + var5 * var5 + var7 * var7;
          if (Math.abs(-1.0 + var9) < 1e-16) {
            return;
          } else {
            var9 = Math.sqrt(var9);
            param0[param1] = var3 / var9;
            param0[1 + param1] = var5 / var9;
            param0[param1 - -2] = var7 / var9;
            return;
          }
        } else {
          jn.e((byte) 65);
          var5 = param0[param1 - -1];
          var7 = param0[2 + param1];
          var9 = var3 * var3 + var5 * var5 + var7 * var7;
          if (Math.abs(-1.0 + var9) < 1e-16) {
            return;
          } else {
            var9 = Math.sqrt(var9);
            param0[param1] = var3 / var9;
            param0[1 + param1] = var5 / var9;
            param0[param1 - -2] = var7 / var9;
            return;
          }
        }
    }

    final static rk a(String param0, int param1, String param2, um param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param3.a(param2, 0);
        if (param1 != 8221) {
          return null;
        } else {
          var5 = param3.a(param0, 7, var4);
          return gi.a(var5, param1 + -4414, var4, param3);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        mk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        km var15 = null;
        km var16 = null;
        km var17 = null;
        km var18 = null;
        km var19 = null;
        km var20 = null;
        km var21 = null;
        km var22 = null;
        var11 = Chess.field_G;
        if (param2 >= -80) {
          ((jn) this).a(-42, 127, 34, -25);
          super.a(param0, param1, -109, param3);
          if (param1 != 0) {
            return;
          } else {
            var5 = (((jn) this).field_y >> 1927383553) + param3 + ((jn) this).field_u;
            var6 = param0 - (-((jn) this).field_r + -(((jn) this).field_C >> -1483991263));
            var8 = ((jn) this).field_O.a(21314);
            if (in.field_g == var8) {
              var20 = uh.field_p[0];
              var9 = var20.field_v << 1804184001;
              var10 = var20.field_u << -1038820255;
              if (null != ca.field_a) {
                if (ca.field_a.field_w >= var9) {
                  if (var10 <= ca.field_a.field_t) {
                    tl.a((byte) -67, ca.field_a);
                    wb.b();
                    var20.b(112, 144, var20.field_v << 326892900, var20.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                    fd.a(28773);
                    ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                    return;
                  } else {
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    var20.b(112, 144, var20.field_v << 326892900, var20.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                    fd.a(28773);
                    ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                    return;
                  }
                } else {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var20.b(112, 144, var20.field_v << 326892900, var20.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                  fd.a(28773);
                  ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                  return;
                }
              } else {
                ca.field_a = new km(var9, var10);
                tl.a((byte) -67, ca.field_a);
                var20.b(112, 144, var20.field_v << 326892900, var20.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                fd.a(28773);
                ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                return;
              }
            } else {
              if (var8 != ek.field_d) {
                if (qk.field_b != var8) {
                  if (oa.field_a == var8) {
                    var21 = uh.field_p[1];
                    var21.d(-(var21.field_w >> -654101951) + var5, var6 - (var21.field_t >> -975452479), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var22 = uh.field_p[2];
                  var22.d(var5 + -(var22.field_w >> 1487286913), -(var22.field_t >> -1699346591) + var6, 256);
                  return;
                }
              } else {
                var19 = uh.field_p[0];
                var9 = var19.field_v << 1804184001;
                var10 = var19.field_u << -1038820255;
                if (null == ca.field_a) {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var19.b(112, 144, var19.field_v << 326892900, var19.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                  fd.a(28773);
                  ca.field_a.d(var5 - var19.field_v, var6 - var19.field_u, 256);
                  return;
                } else {
                  L0: {
                    L1: {
                      if (ca.field_a.field_w < var9) {
                        break L1;
                      } else {
                        if (var10 > ca.field_a.field_t) {
                          break L1;
                        } else {
                          tl.a((byte) -67, ca.field_a);
                          wb.b();
                          break L0;
                        }
                      }
                    }
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    break L0;
                  }
                  var19.b(112, 144, var19.field_v << 326892900, var19.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                  fd.a(28773);
                  ca.field_a.d(var5 - var19.field_v, var6 - var19.field_u, 256);
                  return;
                }
              }
            }
          }
        } else {
          super.a(param0, param1, -109, param3);
          if (param1 != 0) {
            return;
          } else {
            var5 = (((jn) this).field_y >> 1927383553) + param3 + ((jn) this).field_u;
            var6 = param0 - (-((jn) this).field_r + -(((jn) this).field_C >> -1483991263));
            var8 = ((jn) this).field_O.a(21314);
            if (in.field_g == var8) {
              var16 = uh.field_p[0];
              var9 = var16.field_v << 1804184001;
              var10 = var16.field_u << -1038820255;
              if (null != ca.field_a) {
                if (ca.field_a.field_w >= var9) {
                  if (var10 <= ca.field_a.field_t) {
                    tl.a((byte) -67, ca.field_a);
                    wb.b();
                    var16.b(112, 144, var16.field_v << 326892900, var16.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                    fd.a(28773);
                    ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                    return;
                  } else {
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    var16.b(112, 144, var16.field_v << 326892900, var16.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                    fd.a(28773);
                    ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                    return;
                  }
                } else {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var16.b(112, 144, var16.field_v << 326892900, var16.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                  fd.a(28773);
                  ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                  return;
                }
              } else {
                ca.field_a = new km(var9, var10);
                tl.a((byte) -67, ca.field_a);
                var16.b(112, 144, var16.field_v << 326892900, var16.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                fd.a(28773);
                ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                return;
              }
            } else {
              if (var8 != ek.field_d) {
                if (qk.field_b != var8) {
                  if (oa.field_a != var8) {
                    return;
                  } else {
                    var17 = uh.field_p[1];
                    var17.d(-(var17.field_w >> -654101951) + var5, var6 - (var17.field_t >> -975452479), 256);
                    return;
                  }
                } else {
                  var18 = uh.field_p[2];
                  var18.d(var5 + -(var18.field_w >> 1487286913), -(var18.field_t >> -1699346591) + var6, 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var15 = uh.field_p[0];
                    var9 = var15.field_v << 1804184001;
                    var10 = var15.field_u << -1038820255;
                    if (null == ca.field_a) {
                      break L3;
                    } else {
                      if (ca.field_a.field_w < var9) {
                        break L3;
                      } else {
                        if (var10 > ca.field_a.field_t) {
                          break L3;
                        } else {
                          tl.a((byte) -67, ca.field_a);
                          wb.b();
                          break L2;
                        }
                      }
                    }
                  }
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  break L2;
                }
                var15.b(112, 144, var15.field_v << 326892900, var15.field_u << -676473276, -((jn) this).field_N << 134898698, 4096);
                fd.a(28773);
                ca.field_a.d(var5 - var15.field_v, var6 - var15.field_u, 256);
                return;
              }
            }
          }
        }
    }

    final static void a(boolean param0, jk param1, String param2, int param3, int param4, int param5, int param6, long param7, byte param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              tk.field_h = new nk(param5);
              qn.field_U = new nk(param9);
              qh.field_a = param4;
              if (param8 <= -91) {
                break L0;
              } else {
                field_M = null;
                break L0;
              }
            }
            L1: {
              cm.field_u = param6;
              ub.field_e = param3;
              gb.field_s = param13;
              fn.field_b = param12;
              am.field_d = param2;
              re.field_n = param1;
              if (!param10) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              on.field_a = stackIn_5_0 != 0;
              qc.field_a = param7;
              if (!param0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            ln.field_Kb = stackIn_8_0 != 0;
            bk.field_n = param11;
            if (null == re.field_n.field_d) {
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            } else {
              try {
                tc.field_z = new lc(re.field_n.field_d, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, mf param1) {
        if (param0 != 0) {
            field_P = null;
            return false;
        }
        return false;
    }

    final String g(int param0) {
        if (!(!((jn) this).field_w)) {
            return ((jn) this).field_O.a(false);
        }
        if (param0 == 0) {
            return null;
        }
        return null;
    }

    jn(vb param0) {
        ((jn) this).field_O = param0;
    }

    final static boolean a(int param0) {
        if (param0 != 32359) {
            return false;
        }
        return of.a(bh.i(81), (byte) 95);
    }

    public static void e(byte param0) {
        field_P = null;
        if (param0 != -61) {
            field_P = null;
            field_M = null;
            return;
        }
        field_M = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
