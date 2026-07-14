/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends gi {
    int field_p;
    static vk[] field_r;
    int field_h;
    int field_l;
    static he[][] field_n;
    static int field_m;
    int field_q;
    int field_k;
    static String[] field_i;
    static String field_o;
    int field_j;

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != -1321745375) {
          nl.a((byte) -105);
          var1 = ie.a(false);
          var2 = ig.a((byte) 115);
          cb.field_a.a(var2 + (di.field_d << -97716703), -df.field_h + si.field_B, var1 + (df.field_h << -1321745375), jd.field_N - di.field_d, 7453);
          tf.n(17077);
          return;
        } else {
          var1 = ie.a(false);
          var2 = ig.a((byte) 115);
          cb.field_a.a(var2 + (di.field_d << -97716703), -df.field_h + si.field_B, var1 + (df.field_h << -1321745375), jd.field_N - di.field_d, 7453);
          tf.n(17077);
          return;
        }
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 >= -56) {
          field_m = -5;
          field_o = null;
          field_i = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_i = null;
          field_r = null;
          return;
        }
    }

    final static byte[] a(byte param0, int param1, lh param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = param2.e(param1, (byte) -124);
        if (param0 == 65) {
          if (-1 != (var4 ^ -1)) {
            if (param3 != null) {
              if (param3.length == var4) {
                L0: {
                  var5 = param2.e(3, (byte) 102);
                  var6 = (byte)param2.e(8, (byte) -95);
                  if (0 < var5) {
                    var7 = 0;
                    L1: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    var7 = 0;
                    L2: while (true) {
                      if (var4 <= var7) {
                        break L0;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L2;
                      }
                    }
                  }
                }
                return param3;
              } else {
                L3: {
                  param3 = new byte[var4];
                  var5 = param2.e(3, (byte) 102);
                  var6 = (byte)param2.e(8, (byte) -95);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4 <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                return param3;
              }
            } else {
              L6: {
                param3 = new byte[var4];
                var5 = param2.e(3, (byte) 102);
                var6 = (byte)param2.e(8, (byte) -95);
                if (0 < var5) {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  var7 = 0;
                  L8: while (true) {
                    if (var4 <= var7) {
                      break L6;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
              return param3;
            }
          } else {
            return null;
          }
        } else {
          nl.a((byte) -84);
          if (-1 != (var4 ^ -1)) {
            L9: {
              if (param3 == null) {
                param3 = new byte[var4];
                break L9;
              } else {
                if (param3.length != var4) {
                  param3 = new byte[var4];
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            var5 = param2.e(3, (byte) 102);
            var6 = (byte)param2.e(8, (byte) -95);
            if (0 < var5) {
              var7 = 0;
              L10: while (true) {
                if (var4 > var7) {
                  param3[var7] = (byte)(param2.e(var5, (byte) -110) + var6);
                  var7++;
                  continue L10;
                } else {
                  return param3;
                }
              }
            } else {
              var7 = 0;
              L11: while (true) {
                if (var4 > var7) {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L11;
                } else {
                  return param3;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    nl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((nl) this).field_p = param3;
        ((nl) this).field_q = param4;
        ((nl) this).field_k = param5;
        ((nl) this).field_h = param2;
        ((nl) this).field_l = param1;
        ((nl) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new vk[74];
        field_n = new he[3][];
        field_i = new String[]{"By rating", "By win percentage"};
        field_o = "To server list";
    }
}
