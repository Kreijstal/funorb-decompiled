/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static char[] field_b;
    private int field_g;
    private long[] field_e;
    private int field_c;
    private long[] field_d;
    static gh[] field_i;
    private byte[] field_h;
    private long[] field_f;
    private byte[] field_j;
    private long[] field_a;
    private long[] field_k;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        var4 = 116 % ((param0 - 75) / 32);
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > var2) {
                    var2 = 0;
                    L3: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((wb) this).field_d[var2] = un.a(((wb) this).field_d[var2], un.a(((wb) this).field_k[var2], ((wb) this).field_e[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (-9 <= var3) {
                        var3 = 0;
                        L5: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            ((wb) this).field_f[0] = un.a(((wb) this).field_f[0], aj.field_w[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((wb) this).field_k[var3] = ((wb) this).field_a[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((wb) this).field_a[var3] = ((wb) this).field_f[var3];
                                var4 = 0;
                                var5 = 56;
                                L8: while (true) {
                                  if (var4 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((wb) this).field_a[var3] = un.a(((wb) this).field_a[var3], aj.field_t[var4][pg.a(255, (int)(((wb) this).field_k[pg.a(-var4 + var3, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var4++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((wb) this).field_f[var3] = ((wb) this).field_a[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((wb) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((wb) this).field_a[var3] = un.a(((wb) this).field_a[var3], aj.field_t[var4][pg.a((int)(((wb) this).field_f[pg.a(var3 - var4, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((wb) this).field_f[var2] = ((wb) this).field_d[var2];
                ((wb) this).field_k[var2] = un.a(((wb) this).field_e[var2], ((wb) this).field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((wb) this).field_e[var2] = un.a(ct.a(255L, (long)((wb) this).field_j[7 + var3]), un.a(ct.a((long)((wb) this).field_j[6 + var3] << 497826760, 65280L), un.a(ct.a(255L, (long)((wb) this).field_j[var3 - -5]) << -288143920, un.a(un.a(un.a(un.a((long)((wb) this).field_j[var3] << -1472861000, ct.a((long)((wb) this).field_j[1 + var3], 255L) << 1640223600), ct.a((long)((wb) this).field_j[2 + var3], 255L) << 939656424), ct.a((long)((wb) this).field_j[var3 + 3], 255L) << -316181664), ct.a((long)((wb) this).field_j[4 + var3] << -1446632168, 4278190080L)))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        CharSequence var3 = null;
        if (param1 != 17337) {
            return;
        }
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            var3 = (CharSequence) var2;
            if (AceOfSkies.a(var3, -119) == 0L) {
                return;
            }
            return;
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], 128 >>> pg.a(7, ((wb) this).field_c));
          ((wb) this).field_g = ((wb) this).field_g + 1;
          if (-33 > (((wb) this).field_g ^ -1)) {
            L1: while (true) {
              if (64 <= ((wb) this).field_g) {
                this.a((byte) 114);
                ((wb) this).field_g = 0;
                break L0;
              } else {
                ((wb) this).field_g = ((wb) this).field_g + 1;
                ((wb) this).field_j[((wb) this).field_g] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (-33 >= (((wb) this).field_g ^ -1)) {
            au.a(((wb) this).field_h, 0, ((wb) this).field_j, 32, 32);
            this.a((byte) 107);
            if (param1 == 82) {
              var4 = 0;
              var5 = param2;
              L3: while (true) {
                if ((var4 ^ -1) <= -9) {
                  return;
                } else {
                  var6 = ((wb) this).field_d[var4];
                  param0[var5] = (byte)(int)(var6 >>> 1258650744);
                  param0[1 + var5] = (byte)(int)(var6 >>> -1715064144);
                  param0[var5 - -2] = (byte)(int)(var6 >>> 971803944);
                  param0[var5 + 3] = (byte)(int)(var6 >>> 1600824352);
                  param0[var5 + 4] = (byte)(int)(var6 >>> -1910840488);
                  param0[var5 - -5] = (byte)(int)(var6 >>> -1809315248);
                  param0[6 + var5] = (byte)(int)(var6 >>> -2102918904);
                  param0[var5 - -7] = (byte)(int)var6;
                  var5 += 8;
                  var4++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            ((wb) this).field_g = ((wb) this).field_g + 1;
            ((wb) this).field_j[((wb) this).field_g] = (byte) 0;
            continue L2;
          }
        }
    }

    final static fn a(boolean param0, String param1, String param2, long param3, boolean param4) {
        if (!param4) {
            java.applet.Applet var7 = (java.applet.Applet) null;
            wb.a((java.applet.Applet) null, -75);
        }
        if ((param3 ^ -1L) == -1L) {
            if (param1 != null) {
                return (fn) (Object) new ki(param1, param2);
            }
        }
        if (param0) {
            return (fn) (Object) new ko(param3, param2);
        }
        return (fn) (Object) new pm(param3, param2);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((wb) this).field_h[var2] = (byte) 0;
        }
        ((wb) this).field_c = 0;
        ((wb) this).field_g = 0;
        ((wb) this).field_j[0] = (byte)param0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((wb) this).field_d[var2] = 0L;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
        field_b = null;
    }

    final void a(int param0, byte[] param1, long param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = AceOfSkies.field_G ? 1 : 0;
        var5 = 0;
        var6 = param0 - ((int)param2 & 7) & 7;
        var7 = 7 & ((wb) this).field_c;
        var9 = param2;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (0 > var11) {
            L1: while (true) {
              if (-9L <= (param2 ^ -1L)) {
                L2: {
                  if ((param2 ^ -1L) < -1L) {
                    var8 = 255 & param1[var5] << var6;
                    ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], var8 >>> var7);
                    break L2;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
                L3: {
                  if ((param2 + (long)var7 ^ -1L) > -9L) {
                    ((wb) this).field_c = (int)((long)((wb) this).field_c + param2);
                    break L3;
                  } else {
                    L4: {
                      ((wb) this).field_g = ((wb) this).field_g + 1;
                      param2 = param2 - (long)(8 - var7);
                      ((wb) this).field_c = ((wb) this).field_c + (-var7 + 8);
                      if (-513 != (((wb) this).field_c ^ -1)) {
                        break L4;
                      } else {
                        this.a((byte) 123);
                        ((wb) this).field_g = 0;
                        ((wb) this).field_c = 0;
                        break L4;
                      }
                    }
                    ((wb) this).field_j[((wb) this).field_g] = (byte)pg.a(255, var8 << -var7 + 8);
                    ((wb) this).field_c = ((wb) this).field_c + (int)param2;
                    break L3;
                  }
                }
                return;
              } else {
                L5: {
                  var8 = param1[var5] << var6 & 255 | (255 & param1[var5 + 1]) >>> 8 - var6;
                  if (0 > var8) {
                    break L5;
                  } else {
                    if (var8 < 256) {
                      L6: {
                        ((wb) this).field_j[((wb) this).field_g] = (byte)vo.a((int) ((wb) this).field_j[((wb) this).field_g], var8 >>> var7);
                        ((wb) this).field_c = ((wb) this).field_c + (8 + -var7);
                        ((wb) this).field_g = ((wb) this).field_g + 1;
                        if (-513 != (((wb) this).field_c ^ -1)) {
                          break L6;
                        } else {
                          this.a((byte) 109);
                          ((wb) this).field_c = 0;
                          ((wb) this).field_g = 0;
                          break L6;
                        }
                      }
                      ((wb) this).field_j[((wb) this).field_g] = (byte)pg.a(255, var8 << 8 + -var7);
                      param2 = param2 - 8L;
                      ((wb) this).field_c = ((wb) this).field_c + var7;
                      var5++;
                      continue L1;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((((wb) this).field_h[var11] & 255) - -((int)var9 & 255));
            ((wb) this).field_h[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    wb() {
        ((wb) this).field_g = 0;
        ((wb) this).field_c = 0;
        ((wb) this).field_h = new byte[32];
        ((wb) this).field_e = new long[8];
        ((wb) this).field_f = new long[8];
        ((wb) this).field_a = new long[8];
        ((wb) this).field_d = new long[8];
        ((wb) this).field_j = new byte[64];
        ((wb) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{(char)91, (char)93, (char)35};
        nb.a(10536, 50);
    }
}
