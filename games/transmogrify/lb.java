/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static qj field_f;
    static long field_b;
    static hi field_e;
    static int field_a;
    static String field_h;
    static boolean field_d;
    static int[][] field_g;
    static byte[][][] field_c;
    static int field_i;
    static int field_j;

    public static void a(byte param0) {
        if (param0 <= 62) {
            field_g = null;
        }
        field_c = null;
        field_h = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final static short[] a(short[] param0, int param1, int param2, hj param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        var4 = param3.k(param2, 1522829539);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (var4 != param0.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          if (param1 == 256) {
            L2: {
              var5 = param3.k(4, 1522829539);
              var6 = (short)param3.k(16, 1522829539);
              if (0 >= var5) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (short)var6;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (short)(param3.k(var5, 1522829539) + var6);
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static String a(boolean param0) {
        String var1 = "";
        if (!(null == ok.field_a)) {
            var1 = ok.field_a.e((byte) 28);
        }
        if (-1 == (var1.length() ^ -1)) {
            var1 = gj.a(-113);
        }
        if (!param0) {
            field_g = null;
        }
        if (!(0 != var1.length())) {
            var1 = nf.field_q;
        }
        return var1;
    }

    final static q a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var2 = param0.length();
        if (var2 == -1) {
          return ai.field_a;
        } else {
          L0: {
            if (param1 == 5507) {
              break L0;
            } else {
              field_a = -60;
              break L0;
            }
          }
          if (-65 < var2) {
            return rd.field_d;
          } else {
            if (param0.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var2 > var4) {
                  var5 = param0.charAt(var4);
                  if (46 != var5) {
                    if (-1 == nb.field_c.indexOf(var5)) {
                      return vc.field_N;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  } else {
                    L2: {
                      if (0 == var4) {
                        break L2;
                      } else {
                        if (var4 == var2 - 1) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L1;
                          }
                        }
                      }
                    }
                    return vc.field_N;
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (-35 == (param0.charAt(var2 + -1) ^ -1)) {
                var3 = 0;
                var4 = 1;
                L3: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param0.charAt(var4);
                    if (92 == var5) {
                      L4: {
                        if (var3 != 0) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_19_0;
                      var4++;
                      continue L3;
                    } else {
                      L5: {
                        if (var5 != 34) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            return vc.field_N;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L3;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return vc.field_N;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
        field_f = new qj();
        field_a = 256;
        field_e = new hi();
        field_i = 0;
        field_g = new int[][]{new int[4]};
    }
}
