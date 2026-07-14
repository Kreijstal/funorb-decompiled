/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static nh field_a;
    static rf field_e;
    static he[] field_c;
    private int[] field_g;
    static java.applet.Applet field_d;
    static int[] field_f;
    static long[] field_b;
    static String field_h;

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        boolean discarded$12 = ng.field_c.a(nl.field_m, ri.field_d, true, 0);
        ng.field_c.b(false);
        L0: while (true) {
          if (!th.a(param0 + -94)) {
            if (param0 == pe.field_b) {
              if (!oi.field_c) {
                if (hg.field_ub != lc.field_h) {
                  if (ib.field_f.a(false)) {
                    if (hg.field_ub == fk.field_q) {
                      return 2;
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              var1 = pe.field_b;
              sf.a(-1, param0 + 11650);
              return var1;
            }
          } else {
            boolean discarded$13 = ng.field_c.a(di.field_c, sj.field_g, 127);
            continue L0;
          }
        }
    }

    final static u a(String param0, int param1, boolean param2, String param3) {
        long var4 = 0L;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        if (param1 != 7957) {
          L0: {
            field_h = null;
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var7 = (CharSequence) (Object) param0;
              var4 = ub.a(109, var7);
              break L0;
            } else {
              var6 = param0;
              break L0;
            }
          }
          return tc.a(var4, param3, var6, 0, param2);
        } else {
          L1: {
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var8 = (CharSequence) (Object) param0;
              var4 = ub.a(109, var8);
              break L1;
            } else {
              var6 = param0;
              break L1;
            }
          }
          return tc.a(var4, param3, var6, 0, param2);
        }
    }

    final static vk a(int param0, int param1, int param2) {
        vk var3 = null;
        byte[] var4 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = new vk(22050, param0);
        if (param2 != 100) {
          int discarded$1 = wi.b(-9);
          var4 = var3.field_i;
          var5 = (double)param1 * 6.283185307179586 / 22050.0;
          var7 = -1 + param0;
          L0: while (true) {
            if (var7 < 0) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(100.0 * ji.a(65535, var5 * (double)var7) + ji.a(65535, 2.0 * ((double)var7 * var5)) * 27.0);
              var7--;
              continue L0;
            }
          }
        } else {
          var4 = var3.field_i;
          var5 = (double)param1 * 6.283185307179586 / 22050.0;
          var7 = -1 + param0;
          L1: while (true) {
            if (var7 < 0) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(100.0 * ji.a(65535, var5 * (double)var7) + ji.a(65535, 2.0 * ((double)var7 * var5)) * 27.0);
              var7--;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        if (param0 != 2) {
          field_b = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, bl param6, int param7, int param8) {
        oi.field_e = param6;
        j.field_ib = param0;
        tb.field_a = param1;
        gi.field_c = param7;
        mi.field_j = param3;
        g.field_r = param4;
        vc.field_e = param5;
        pk.field_q = param2;
        if (param8 < 48) {
          vk discarded$2 = wi.a(88, 114, -72);
          p.field_a = (gb) (Object) new cl();
          pd.field_d = new n(param6);
          fl.field_a = new df(p.field_a, pd.field_d);
          return;
        } else {
          p.field_a = (gb) (Object) new cl();
          pd.field_d = new n(param6);
          fl.field_a = new df(p.field_a, pd.field_d);
          return;
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
          return 0;
        } else {
          var7 = param2;
          param0 = param0 + param4;
          var8 = param3;
          L0: while (true) {
            L1: {
              var9 = param1[var8];
              if (0 <= var9) {
                var7++;
                break L1;
              } else {
                var7 = ((wi) this).field_g[var7];
                break L1;
              }
            }
            L2: {
              var10 = ((wi) this).field_g[var7];
              if (0 <= ((wi) this).field_g[var7]) {
                break L2;
              } else {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param0 > param4) {
                  var7 = 0;
                  break L2;
                } else {
                  return 1 + (var8 - param3);
                }
              }
            }
            L3: {
              if ((var9 & 64) == -1) {
                var7++;
                break L3;
              } else {
                var7 = ((wi) this).field_g[var7];
                break L3;
              }
            }
            L4: {
              var10 = ((wi) this).field_g[var7];
              if (-1 > ((wi) this).field_g[var7]) {
                param4++;
                param5[param4] = (byte)var10;
                if (param0 > param4) {
                  var7 = 0;
                  break L4;
                } else {
                  return 1 + (var8 - param3);
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 != (32 & var9)) {
                var7 = ((wi) this).field_g[var7];
                break L5;
              } else {
                var7++;
                break L5;
              }
            }
            L6: {
              var10 = ((wi) this).field_g[var7];
              if (0 > ((wi) this).field_g[var7]) {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param4 < param0) {
                  var7 = 0;
                  break L6;
                } else {
                  return 1 + (var8 - param3);
                }
              } else {
                break L6;
              }
            }
            L7: {
              if ((16 & var9) == 0) {
                var7++;
                break L7;
              } else {
                var7 = ((wi) this).field_g[var7];
                break L7;
              }
            }
            L8: {
              var10 = ((wi) this).field_g[var7];
              if (((wi) this).field_g[var7] >= 0) {
                break L8;
              } else {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param0 > param4) {
                  var7 = 0;
                  break L8;
                } else {
                  return 1 + (var8 - param3);
                }
              }
            }
            L9: {
              if ((var9 & 8) == 0) {
                var7++;
                break L9;
              } else {
                var7 = ((wi) this).field_g[var7];
                break L9;
              }
            }
            L10: {
              var10 = ((wi) this).field_g[var7];
              if (((wi) this).field_g[var7] >= 0) {
                break L10;
              } else {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param0 > param4) {
                  var7 = 0;
                  break L10;
                } else {
                  return 1 + (var8 - param3);
                }
              }
            }
            L11: {
              if (0 != (4 & var9)) {
                var7 = ((wi) this).field_g[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var10 = ((wi) this).field_g[var7];
              if (-1 < (((wi) this).field_g[var7] ^ -1)) {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param0 > param4) {
                  var7 = 0;
                  break L12;
                } else {
                  return 1 + (var8 - param3);
                }
              } else {
                break L12;
              }
            }
            L13: {
              if (0 == (var9 & 2)) {
                var7++;
                break L13;
              } else {
                var7 = ((wi) this).field_g[var7];
                break L13;
              }
            }
            L14: {
              var10 = ((wi) this).field_g[var7];
              if (((wi) this).field_g[var7] < 0) {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param0 > param4) {
                  var7 = 0;
                  break L14;
                } else {
                  return 1 + (var8 - param3);
                }
              } else {
                break L14;
              }
            }
            L15: {
              if ((var9 & 1) != 0) {
                var7 = ((wi) this).field_g[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            var10 = ((wi) this).field_g[var7];
            if (((wi) this).field_g[var7] < 0) {
              param4++;
              param5[param4] = (byte)(var10 ^ -1);
              if (param0 > param4) {
                var7 = 0;
                var8++;
                var8++;
                continue L0;
              } else {
                return 1 + (var8 - param3);
              }
            } else {
              var8++;
              var8++;
              continue L0;
            }
          }
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[75];
        field_b = new long[32];
        field_h = "Waiting for sound effects";
    }
}
