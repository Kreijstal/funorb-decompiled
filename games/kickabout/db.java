/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    int field_i;
    short[] field_f;
    private static byte[] field_k;
    je field_e;
    private static short[] field_n;
    private static short[] field_g;
    byte[] field_j;
    short[] field_m;
    short[] field_d;
    short[] field_c;
    short[] field_a;
    private static short[] field_l;
    private static short[] field_b;
    private static short[] field_h;

    public static void a() {
        field_b = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_n = null;
        field_k = null;
    }

    db(byte[] param0, je param1) {
        int discarded$1 = 0;
        Exception var3 = null;
        iw var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        iw var14 = null;
        Throwable decompiledCaughtException = null;
        this.field_i = -1;
        this.field_e = null;
        this.field_e = param1;
        try {
          L0: {
            var14 = new iw(param0);
            var4 = new iw(param0);
            discarded$1 = var14.h((byte) -126);
            var14.field_n = var14.field_n + 2;
            var5 = var14.h((byte) -112);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_n = var14.field_n + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_n == param0.length) {
                  this.field_i = var6;
                  this.field_a = new short[var6];
                  this.field_c = new short[var6];
                  this.field_f = new short[var6];
                  this.field_d = new short[var6];
                  this.field_m = new short[var6];
                  this.field_j = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      this.field_a[var13] = field_b[var13];
                      this.field_c[var13] = field_l[var13];
                      this.field_f[var13] = field_g[var13];
                      this.field_d[var13] = field_h[var13];
                      this.field_m[var13] = field_n[var13];
                      this.field_j[var13] = field_k[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = this.field_e.field_o[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.h((byte) -114);
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
                      field_b[var6] = (short)var9;
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
                        field_l[var6] = (short)var12;
                        break L7;
                      } else {
                        field_l[var6] = (short)var4.e(83);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var11 & 2) == 0) {
                        field_g[var6] = (short)var12;
                        break L8;
                      } else {
                        field_g[var6] = (short)var4.e(-120);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 4) == 0) {
                        field_h[var6] = (short)var12;
                        break L9;
                      } else {
                        field_h[var6] = (short)var4.e(-119);
                        break L9;
                      }
                    }
                    L10: {
                      field_k[var6] = (byte)(var11 >>> 3 & 3);
                      if (var10 != 2) {
                        break L10;
                      } else {
                        field_l[var6] = (short)(((field_l[var6] & 255) << 3) + (field_l[var6] >> 8 & 7));
                        field_g[var6] = (short)(((field_g[var6] & 255) << 3) + (field_g[var6] >> 8 & 7));
                        field_h[var6] = (short)(((field_h[var6] & 255) << 3) + (field_h[var6] >> 8 & 7));
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_n[var6] = (short)-1;
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
                        field_n[var6] = (short)var7;
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
            this.field_i = 0;
            break L13;
          }
        }
    }

    static {
        field_g = new short[500];
        field_n = new short[500];
        field_k = new byte[500];
        field_h = new short[500];
        field_l = new short[500];
        field_b = new short[500];
    }
}
