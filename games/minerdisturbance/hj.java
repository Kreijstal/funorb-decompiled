/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    String field_l;
    static sj field_e;
    String field_g;
    int field_d;
    bj field_j;
    static String field_a;
    static ta field_k;
    String field_m;
    static ea field_h;
    private static int[] field_c;
    static char[] field_n;
    static ta field_b;
    static hg field_f;
    static hg field_o;
    static bj field_i;

    final static String a(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var5 = MinerDisturbance.field_ab;
        var6 = "(" + lc.field_s + " " + rd.field_a + " " + ud.field_a + ") " + oj.field_K;
        if ((rj.field_d ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (rj.field_d > var2) {
              var7 = var1 + 32;
              var3 = kj.field_a.field_u[var2] & 255;
              var4 = var3 >> 347664612;
              var3 = var3 & 15;
              stackOut_11_0 = var4;
              stackOut_11_1 = 10;
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (var5 != 0) {
                if (stackIn_14_0 <= stackIn_14_1) {
                  field_e = null;
                  return var7;
                } else {
                  return var7;
                }
              } else {
                L1: {
                  L2: {
                    if (stackIn_12_0 >= stackIn_12_1) {
                      break L2;
                    } else {
                      var4 += 48;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 += 55;
                  break L1;
                }
                L3: {
                  L4: {
                    if ((var3 ^ -1) > -11) {
                      break L4;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 += 48;
                  break L3;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  if (param0 <= 48) {
                    field_e = null;
                    return var1;
                  } else {
                    return var1;
                  }
                }
              }
            } else {
              if (param0 <= 48) {
                field_e = null;
                return var1;
              } else {
                return var1;
              }
            }
          }
        } else {
          if (param0 <= 48) {
            field_e = null;
            return var6;
          } else {
            return var6;
          }
        }
    }

    final static void a(bj param0, int param1) {
        ld var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        ld var8 = null;
        pb var13 = null;
        int[] var14 = null;
        pb var15 = null;
        pb var17 = null;
        int[] var18 = null;
        pb var19 = null;
        int[] var20 = null;
        var7 = MinerDisturbance.field_ab;
        if (param1 == 347664612) {
          var8 = new ld(param0.a("", 0, "logo.fo3d"));
          var2 = var8;
          var3 = var2.d((byte) -54);
          var2.f((byte) 16);
          bl.field_v = tk.a(-123, var2);
          aj.field_b = new pb[var3];
          pa.field_b = new int[var3][];
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3) {
              var2.o(-98);
              var4 = 0;
              L1: while (true) {
                if (var3 > var4) {
                  var13 = aj.field_b[var4];
                  var15 = var13;
                  var17 = var15;
                  var19 = var17;
                  var15 = var13;
                  var13.a(1, 6, 6, 6, (byte) -81);
                  var13.a(true);
                  var14 = new int[]{var13.field_v + var13.field_H >> 130271905, var13.field_h + var13.field_l >> 1490739201, var13.field_J + var13.field_j >> -111880767};
                  pa.field_b[var4] = var14;
                  var13.a(-var14[2], -var14[1], 0, -var14[0]);
                  var4++;
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              aj.field_b[var4] = lj.a(var8, (byte) -62);
              var4++;
              if (var7 != 0) {
                var4 = 0;
                L2: while (true) {
                  if (var3 > var4) {
                    var19 = aj.field_b[var4];
                    var19.a(1, 6, 6, 6, (byte) -81);
                    var19.a(true);
                    var20 = new int[]{var19.field_v + var19.field_H >> 130271905, var19.field_h + var19.field_l >> 1490739201, var19.field_J + var19.field_j >> -111880767};
                    pa.field_b[var4] = var20;
                    var19.a(-var20[2], -var20[1], 0, -var20[0]);
                    var4++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (var7 == 0) {
                  continue L0;
                } else {
                  var2.o(-98);
                  var4 = 0;
                  L3: while (true) {
                    if (var3 > var4) {
                      var17 = aj.field_b[var4];
                      var19 = var17;
                      var19 = var17;
                      var17.a(1, 6, 6, 6, (byte) -81);
                      var17.a(true);
                      var18 = new int[]{var17.field_v + var17.field_H >> 130271905, var17.field_h + var17.field_l >> 1490739201, var17.field_J + var17.field_j >> -111880767};
                      pa.field_b[var4] = var18;
                      var17.a(-var18[2], -var18[1], 0, -var18[0]);
                      var4++;
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        if (param0) {
          hj.a(false);
          field_c = null;
          field_b = null;
          field_n = null;
          field_o = null;
          field_k = null;
          field_e = null;
          field_h = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_n = null;
          field_o = null;
          field_k = null;
          field_e = null;
          field_h = null;
          field_f = null;
          return;
        }
    }

    private hj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_e = new sj("usename");
        field_a = "Just play";
        field_k = new ta();
        field_c = new int[98304];
        for (var0 = 92682; -46342 >= (var0 ^ -1); var0--) {
            var4 = (long)(-1 + (var0 << 1678240737));
            var6 = (long)((var0 << -922672735) - -1);
            var2 = (int)((var4 * var4 >> -884165806) + -32768L);
            var3 = (int)((var6 * var6 >> -2085222830) - 32768L);
            if (field_c.length <= var3) {
                var3 = -1 + field_c.length;
            }
            for (var1 = -1 >= (var2 ^ -1) ? var2 : 0; var3 >= var1; var1++) {
                field_c[var1] = var0;
            }
        }
        field_n = new char[128];
        field_b = new ta();
    }
}
