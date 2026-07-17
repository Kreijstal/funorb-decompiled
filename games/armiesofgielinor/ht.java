/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht {
    private static short[] field_j;
    ig field_n;
    short[] field_a;
    private static short[] field_b;
    private static short[] field_g;
    short[] field_f;
    short[] field_h;
    private static byte[] field_c;
    int field_d;
    byte[] field_m;
    private static short[] field_k;
    short[] field_l;
    private static short[] field_e;
    short[] field_i;

    ht(byte[] param0, ig param1) {
        Exception var3 = null;
        vh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vh var14 = null;
        Throwable decompiledCaughtException = null;
        ((ht) this).field_d = -1;
        ((ht) this).field_n = null;
        ((ht) this).field_n = param1;
        try {
          L0: {
            var14 = new vh(param0);
            var4 = new vh(param0);
            int discarded$1 = var14.k(0);
            var14.field_q = var14.field_q + 2;
            var5 = var14.k(0);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_q = var14.field_q + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_q == param0.length) {
                  ((ht) this).field_d = var6;
                  ((ht) this).field_a = new short[var6];
                  ((ht) this).field_l = new short[var6];
                  ((ht) this).field_f = new short[var6];
                  ((ht) this).field_h = new short[var6];
                  ((ht) this).field_i = new short[var6];
                  ((ht) this).field_m = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      ((ht) this).field_a[var13] = field_j[var13];
                      ((ht) this).field_l[var13] = field_k[var13];
                      ((ht) this).field_f[var13] = field_e[var13];
                      ((ht) this).field_h[var13] = field_b[var13];
                      ((ht) this).field_i[var13] = field_g[var13];
                      ((ht) this).field_m[var13] = field_c[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = ((ht) this).field_n.field_p[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.k(0);
                  if (var11 <= 0) {
                    break L4;
                  } else {
                    L5: {
                      if (var10 != 0) {
                        break L5;
                      } else {
                        var8 = var9;
                        break L5;
                      }
                    }
                    L6: {
                      field_j[var6] = (short)var9;
                      var12 = 0;
                      if (var10 != 3) {
                        break L6;
                      } else {
                        var12 = 128;
                        break L6;
                      }
                    }
                    L7: {
                      if ((var11 & 1) == 0) {
                        field_k[var6] = (short)var12;
                        break L7;
                      } else {
                        field_k[var6] = (short)var4.a(114);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var11 & 2) == 0) {
                        field_e[var6] = (short)var12;
                        break L8;
                      } else {
                        field_e[var6] = (short)var4.a(95);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 4) == 0) {
                        field_b[var6] = (short)var12;
                        break L9;
                      } else {
                        field_b[var6] = (short)var4.a(55);
                        break L9;
                      }
                    }
                    L10: {
                      field_c[var6] = (byte)(var11 >>> 3 & 3);
                      if (var10 != 2) {
                        break L10;
                      } else {
                        field_k[var6] = (short)(((field_k[var6] & 255) << 3) + (field_k[var6] >> 8 & 7));
                        field_e[var6] = (short)(((field_e[var6] & 255) << 3) + (field_e[var6] >> 8 & 7));
                        field_b[var6] = (short)(((field_b[var6] & 255) << 3) + (field_b[var6] >> 8 & 7));
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_g[var6] = (short) -1;
                        if (var10 == 1) {
                          break L12;
                        } else {
                          if (var10 == 2) {
                            break L12;
                          } else {
                            if (var10 != 3) {
                              if (var10 == 5) {
                                break L11;
                              } else {
                                if (var10 != 7) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var7 <= var8) {
                        break L11;
                      } else {
                        field_g[var6] = (short)var7;
                        var8 = var7;
                        break L11;
                      }
                    }
                    var6++;
                    break L4;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = (Exception) (Object) decompiledCaughtException;
            ((ht) this).field_d = 0;
            break L13;
          }
        }
    }

    public static void a() {
        field_j = null;
        field_k = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new short[500];
        field_b = new short[500];
        field_g = new short[500];
        field_k = new short[500];
        field_c = new byte[500];
        field_e = new short[500];
    }
}
