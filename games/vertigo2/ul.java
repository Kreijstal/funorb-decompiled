/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_l;
    private static short[] field_c;
    mb field_a;
    private static short[] field_i;
    short[] field_k;
    short[] field_e;
    short[] field_n;
    short[] field_f;
    private static short[] field_m;
    private static short[] field_j;
    short[] field_d;
    private static byte[] field_b;
    byte[] field_g;
    private static short[] field_h;

    public static void a() {
        field_c = null;
        field_m = null;
        field_j = null;
        field_h = null;
        field_i = null;
        field_b = null;
    }

    ul(byte[] param0, mb param1) {
        Exception var3 = null;
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ed var14 = null;
        Throwable decompiledCaughtException = null;
        ((ul) this).field_a = null;
        ((ul) this).field_l = -1;
        ((ul) this).field_a = param1;
        try {
          L0: {
            var14 = new ed(param0);
            var4 = new ed(param0);
            int discarded$1 = var14.h(-11);
            var14.field_u = var14.field_u + 2;
            var5 = var14.h(-11);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_u = var14.field_u + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_u == param0.length) {
                  ((ul) this).field_l = var6;
                  ((ul) this).field_f = new short[var6];
                  ((ul) this).field_d = new short[var6];
                  ((ul) this).field_n = new short[var6];
                  ((ul) this).field_k = new short[var6];
                  ((ul) this).field_e = new short[var6];
                  ((ul) this).field_g = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      ((ul) this).field_f[var13] = field_c[var13];
                      ((ul) this).field_d[var13] = field_m[var13];
                      ((ul) this).field_n[var13] = field_j[var13];
                      ((ul) this).field_k[var13] = field_h[var13];
                      ((ul) this).field_e[var13] = field_i[var13];
                      ((ul) this).field_g[var13] = field_b[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = ((ul) this).field_a.field_r[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.h(-11);
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
                      field_c[var6] = (short)var9;
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
                        field_m[var6] = (short)var12;
                        break L7;
                      } else {
                        field_m[var6] = (short)var4.j(-3084);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var11 & 2) == 0) {
                        field_j[var6] = (short)var12;
                        break L8;
                      } else {
                        field_j[var6] = (short)var4.j(-3084);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 4) == 0) {
                        field_h[var6] = (short)var12;
                        break L9;
                      } else {
                        field_h[var6] = (short)var4.j(-3084);
                        break L9;
                      }
                    }
                    L10: {
                      field_b[var6] = (byte)(var11 >>> 3 & 3);
                      if (var10 != 2) {
                        break L10;
                      } else {
                        field_m[var6] = (short)(((field_m[var6] & 255) << 3) + (field_m[var6] >> 8 & 7));
                        field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                        field_h[var6] = (short)(((field_h[var6] & 255) << 3) + (field_h[var6] >> 8 & 7));
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_i[var6] = (short) -1;
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
                        field_i[var6] = (short)var7;
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
            ((ul) this).field_l = 0;
            break L13;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new short[500];
        field_i = new short[500];
        field_j = new short[500];
        field_m = new short[500];
        field_b = new byte[500];
        field_h = new short[500];
    }
}
