/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_d;
    static wl field_c;
    static la field_e;
    static int field_f;
    static String field_b;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var11 = Torquing.field_u;
          var6 = 72 % ((param1 - -9) / 50);
          if (qk.field_p < param0) {
            break L0;
          } else {
            if (j.field_q > param5) {
              break L0;
            } else {
              L1: {
                if (param4 < kn.field_e) {
                  param4 = kn.field_e;
                  var7 = 0;
                  break L1;
                } else {
                  if (qg.field_z < param4) {
                    var7 = 0;
                    param4 = qg.field_z;
                    break L1;
                  } else {
                    var7 = 1;
                    break L1;
                  }
                }
              }
              L2: {
                if (param2 < kn.field_e) {
                  var8 = 0;
                  param2 = kn.field_e;
                  break L2;
                } else {
                  if (qg.field_z < param2) {
                    param2 = qg.field_z;
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = 1;
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < j.field_q) {
                  param0 = j.field_q;
                  break L3;
                } else {
                  param0++;
                  di.a(param4, (byte) -101, param3, qd.field_a[param0], param2);
                  break L3;
                }
              }
              L4: {
                if (qk.field_p < param5) {
                  param5 = qk.field_p;
                  break L4;
                } else {
                  param5--;
                  di.a(param4, (byte) 113, param3, qd.field_a[param5], param2);
                  break L4;
                }
              }
              L5: {
                if (var7 == 0) {
                  break L5;
                } else {
                  if (var8 != 0) {
                    var9 = param0;
                    L6: while (true) {
                      if (var9 > param5) {
                        break L0;
                      } else {
                        var15 = qd.field_a[var9];
                        var14 = var15;
                        var13 = var14;
                        var12 = var13;
                        var10 = var12;
                        var15[param2] = param3;
                        var10[param4] = param3;
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              if (var7 != 0) {
                var9 = param0;
                L7: while (true) {
                  if (var9 > param5) {
                    break L0;
                  } else {
                    qd.field_a[var9][param4] = param3;
                    var9++;
                    continue L7;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_a = null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        df var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        qp var11 = null;
        df var12 = null;
        int[] var13 = null;
        nh var14 = null;
        nh var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = Torquing.field_u;
          var12 = kj.field_d;
          if (param0 == 27912) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var2 = var12.i((byte) -101);
          if (var2 != 0) {
            if ((var2 ^ -1) != -2) {
              if (2 != var2) {
                nn.a("A1: " + me.a(-1), (Throwable) null, param0 + -37870);
                ih.b(true);
                break L1;
              } else {
                var15 = (nh) (Object) to.field_q.b(param0 + -27912);
                if (var15 == null) {
                  ih.b(true);
                  return;
                } else {
                  var15.field_r = kb.a((byte) -91);
                  var15.field_m = var15.field_r[0];
                  var15.field_n = true;
                  var15.f(0);
                  break L1;
                }
              }
            } else {
              var11 = (qp) (Object) tl.field_p.b(0);
              if (var11 != null) {
                var11.f(0);
                break L1;
              } else {
                ih.b(true);
                return;
              }
            }
          } else {
            var10 = kb.a((byte) -84);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((fj) (Object) var5).i((byte) -101);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var14 = (nh) (Object) to.field_q.b(0);
                if (var14 != null) {
                  var14.field_r = var3;
                  var14.field_n = true;
                  var14.field_m = var18[0];
                  var14.f(0);
                  break L1;
                } else {
                  ih.b(true);
                  return;
                }
              } else {
                var9[var7] = ((fj) (Object) var5).c((byte) -65);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var3 = lk.a(param2, 23, param1);
          if (param0 < -92) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (var3 != null) {
          return var3;
        } else {
          var4 = 0;
          L1: while (true) {
            if (var4 < param1.length()) {
              if (co.a(-112, param1.charAt(var4))) {
                var4++;
                continue L1;
              } else {
                return wc.field_s;
              }
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Continue";
        field_f = -2147483648;
        field_a = "Guide <col=2>Torquing</col> to the flag across the maze of platforms. Be careful not to run out of time or fall to your doom!";
    }
}
