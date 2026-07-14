/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int[] field_b;
    private static int[] field_e;
    static int field_a;
    static String field_c;
    static String field_f;
    static mg field_d;

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!ck.a(param0.charAt(var2), -46)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!ck.a(param0.charAt(var3 - 1), -46)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              L4: {
                if (param1) {
                  break L4;
                } else {
                  c.a(true);
                  break L4;
                }
              }
              var4 = -var2 + var3;
              if (var4 >= 1) {
                if ((var4 ^ -1) >= -13) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (-1 != (var5.length() ^ -1)) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (bn.a(-110, (char) var7)) {
                        var8 = dm.a((char) var7, (byte) 4);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static short[] a(short[] param0, int param1, int param2, hg param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var4 = param3.c((byte) -78, param2);
        if (param1 <= -5) {
          if (var4 != 0) {
            L0: {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length != var4) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              param0 = new short[var4];
              break L0;
            }
            L2: {
              var5 = param3.c((byte) -78, 4);
              var6 = (short)param3.c((byte) -78, 16);
              if (var5 > 0) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (short)(var6 + param3.c((byte) -78, var5));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param0[var7] = (short)var6;
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

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
            field_d = null;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        double var1 = 0.0;
        field_e = new int[65536];
        field_b = new int[65536];
        for (var0 = 0; -65537 < (var0 ^ -1); var0++) {
            var1 = -Math.sqrt((double)var0) + 256.0;
            field_b[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0 = 0; 65536 > var0; var0++) {
            var1 = Math.sqrt((double)var0);
            field_e[var0] = (int)Math.floor(-(var1 * 9.0) + 768.5 + (double)var0 * 0.0234375);
        }
        field_a = 256;
        field_c = "Invite";
        field_f = "<%0> has resigned and is offering a rematch.";
    }
}
