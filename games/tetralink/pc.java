/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private static short[] field_e;
    private static short[] field_g;
    short[] field_l;
    short[] field_n;
    short[] field_c;
    oe field_f;
    private static short[] field_a;
    private static byte[] field_m;
    int field_d;
    private static short[] field_j;
    short[] field_b;
    private static short[] field_k;
    short[] field_h;
    byte[] field_i;

    public static void a() {
        field_a = null;
        field_k = null;
        field_j = null;
        field_g = null;
        field_e = null;
        field_m = null;
    }

    pc(byte[] param0, oe param1) {
        Exception var3 = null;
        bh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bh var14 = null;
        Throwable decompiledCaughtException = null;
        ((pc) this).field_f = null;
        ((pc) this).field_d = -1;
        ((pc) this).field_f = param1;
        try {
          L0: {
            var14 = new bh(param0);
            var4 = new bh(param0);
            int discarded$1 = var14.d((byte) -99);
            var14.field_t = var14.field_t + 2;
            var5 = var14.d((byte) -99);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_t = var14.field_t + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_t == param0.length) {
                  ((pc) this).field_d = var6;
                  ((pc) this).field_b = new short[var6];
                  ((pc) this).field_l = new short[var6];
                  ((pc) this).field_h = new short[var6];
                  ((pc) this).field_c = new short[var6];
                  ((pc) this).field_n = new short[var6];
                  ((pc) this).field_i = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      ((pc) this).field_b[var13] = field_a[var13];
                      ((pc) this).field_l[var13] = field_k[var13];
                      ((pc) this).field_h[var13] = field_j[var13];
                      ((pc) this).field_c[var13] = field_g[var13];
                      ((pc) this).field_n[var13] = field_e[var13];
                      ((pc) this).field_i[var13] = field_m[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = ((pc) this).field_f.field_p[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.d((byte) -99);
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
                      field_a[var6] = (short)var9;
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
                        field_k[var6] = (short)var4.e((byte) 82);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var11 & 2) == 0) {
                        field_j[var6] = (short)var12;
                        break L8;
                      } else {
                        field_j[var6] = (short)var4.e((byte) 82);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 4) == 0) {
                        field_g[var6] = (short)var12;
                        break L9;
                      } else {
                        field_g[var6] = (short)var4.e((byte) 82);
                        break L9;
                      }
                    }
                    L10: {
                      field_m[var6] = (byte)(var11 >>> 3 & 3);
                      if (var10 != 2) {
                        break L10;
                      } else {
                        field_k[var6] = (short)(((field_k[var6] & 255) << 3) + (field_k[var6] >> 8 & 7));
                        field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                        field_g[var6] = (short)(((field_g[var6] & 255) << 3) + (field_g[var6] >> 8 & 7));
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_e[var6] = (short) -1;
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
                        field_e[var6] = (short)var7;
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
            ((pc) this).field_d = 0;
            break L13;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new short[500];
        field_g = new short[500];
        field_m = new byte[500];
        field_a = new short[500];
        field_j = new short[500];
        field_k = new short[500];
    }
}
