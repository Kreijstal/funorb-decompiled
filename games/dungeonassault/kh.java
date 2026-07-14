/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends ip {
    private boolean field_p;
    private String field_o;
    private static long[] field_q;
    static cn field_r;
    static int field_t;
    static int field_n;
    static en field_u;
    static boolean field_s;
    static cn[] field_m;

    final void e(boolean param0) {
        if (!param0) {
            return;
        }
        ((kh) this).field_o = null;
    }

    public static void e(byte param0) {
        field_q = null;
        field_m = null;
        int var1 = -44 / ((-37 - param0) / 44);
        field_r = null;
        field_u = null;
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          jh.c();
          if (null != wm.field_c) {
            break L0;
          } else {
            bn.field_f = new cn(378, 300);
            wm.field_c = new cn(410, 332);
            wm.field_c.field_A = -16;
            wm.field_c.field_w = -16;
            break L0;
          }
        }
        bn.field_f.e();
        gf.a();
        var1 = 0;
        L1: while (true) {
          if (-8 >= (var1 ^ -1)) {
            var1 = 7;
            L2: while (true) {
              if (13 <= var1) {
                L3: {
                  wm.field_c.e();
                  gf.a();
                  if (param0 >= 35) {
                    break L3;
                  } else {
                    field_t = -99;
                    break L3;
                  }
                }
                bn.field_f.e(16, 16, 8454143);
                gf.d(8, 8, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
                bn.field_f.e(16, 16, 0);
                jh.b();
                return;
              } else {
                var2 = -162 + 27 * var1;
                var3 = 20 * var1;
                var8 = var1 * 7 - 42;
                var4 = var8;
                var5 = 0;
                L4: while (true) {
                  if (13 - var1 <= var5) {
                    var1++;
                    continue L2;
                  } else {
                    var6 = 16777215;
                    if (null != qj.field_c[var8]) {
                      rl.field_d[5].e(var2, var3, var6);
                      rl.field_d[4].e(27 + var2, var3, var6);
                      ed.a(var3, var2, var8, (byte) -93, var6);
                      rl.field_d[5].e(27 + var2, var3 - -20 + 0, var6);
                      rl.field_d[4].e(var2, var3 - -20 - 0, var6);
                      var8 += 8;
                      var5++;
                      var2 += 54;
                      continue L4;
                    } else {
                      var8 += 8;
                      var5++;
                      var2 += 54;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var2 = 27 * (-var1 - -6);
            var3 = 20 * var1;
            var4 = -var1 + 6;
            var5 = 0;
            L5: while (true) {
              if (1 + var1 <= var5) {
                var1++;
                continue L1;
              } else {
                var6 = 16777215;
                if (null != qj.field_c[var4]) {
                  L6: {
                    if (var4 == 0) {
                      break L6;
                    } else {
                      if ((var4 ^ -1) == -7) {
                        break L6;
                      } else {
                        rl.field_d[5].e(var2, var3, var6);
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((var4 ^ -1) == -7) {
                      break L7;
                    } else {
                      if (48 != var4) {
                        rl.field_d[4].e(27 + var2, var3, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ed.a(var3, var2, var4, (byte) -127, var6);
                  rl.field_d[4].e(var2, var3 + 20, var6);
                  rl.field_d[5].e(27 + var2, 20 + var3, var6);
                  var4 += 8;
                  var5++;
                  var2 += 54;
                  continue L5;
                } else {
                  var4 += 8;
                  var5++;
                  var2 += 54;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static boolean d(byte param0) {
        if (!(-1 != nj.field_b)) {
            if (!(oi.a(-12929, 1))) {
                return false;
            }
            nj.field_b = ra.field_c.c(true);
            ra.field_c.field_o = 0;
        }
        if ((nj.field_b ^ -1) == 1) {
            if (!oi.a(-12929, 2)) {
                return false;
            }
            nj.field_b = ra.field_c.k(0);
            ra.field_c.field_o = 0;
        }
        if (param0 > -59) {
            field_q = null;
        }
        return oi.a(-12929, nj.field_b);
    }

    final static boolean d(boolean param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != gi.field_S) {
              break L2;
            } else {
              if (uc.g(127)) {
                break L2;
              } else {
                if (null != mh.field_e) {
                  break L2;
                } else {
                  if (!ck.g(-1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final od a(String param0, int param1) {
        vk var3_ref = null;
        int var3 = 0;
        CharSequence var4 = null;
        od stackIn_12_0 = null;
        od stackOut_11_0 = null;
        od stackOut_10_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (!o.a((byte) 31, var4)) {
          return pd.field_J;
        } else {
          L0: {
            if (param0.equals((Object) (Object) ((kh) this).field_o)) {
              break L0;
            } else {
              L1: {
                var3_ref = vk.a((byte) -126, param0);
                if (var3_ref == null) {
                  break L1;
                } else {
                  if (null == var3_ref.field_g) {
                    ((kh) this).field_p = var3_ref.field_a;
                    ((kh) this).field_o = param0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return oc.field_A;
            }
          }
          L2: {
            var3 = 108 % ((5 - param1) / 44);
            if (((kh) this).field_p) {
              stackOut_11_0 = c.field_d;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = pd.field_J;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          return stackIn_12_0;
        }
    }

    final String a(byte param0, String param1) {
        vk var4 = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = jg.a(104, var5);
        if (var3 != null) {
            return var3;
        }
        if (!(param1.equals((Object) (Object) ((kh) this).field_o))) {
            var4 = vk.a((byte) -126, param1);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_g) {
                return null;
            }
            ((kh) this).field_p = var4.field_a;
            ((kh) this).field_o = param1;
        }
        if (!(((kh) this).field_p)) {
            return fp.field_a;
        }
        if (param0 < 44) {
            return null;
        }
        return ng.field_N;
    }

    kh(rm param0) {
        super(param0);
        ((kh) this).field_p = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_q = new long[256];
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_q[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0 ^ -1L) != -2L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1378413441 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
