/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_m;
    private long[] field_c;
    private long[] field_h;
    private int field_i;
    private long[] field_k;
    private byte[] field_j;
    private byte[] field_a;
    private long[] field_l;
    static char[] field_d;
    private long[] field_b;
    static ve field_e;
    static String field_g;
    static int field_f;

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], 128 >>> b.a(((bd) this).field_i, 7));
          ((bd) this).field_m = ((bd) this).field_m + 1;
          if (-33 <= (((bd) this).field_m ^ -1)) {
            break L0;
          } else {
            L1: while (true) {
              if ((((bd) this).field_m ^ -1) <= -65) {
                this.b(120);
                ((bd) this).field_m = 0;
                break L0;
              } else {
                ((bd) this).field_m = ((bd) this).field_m + 1;
                ((bd) this).field_a[((bd) this).field_m] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((bd) this).field_m) {
            qq.a(((bd) this).field_j, 0, ((bd) this).field_a, 32, 32);
            this.b(120);
            var4 = 0;
            var5 = param2;
            L3: while (true) {
              if (var4 >= 8) {
                L4: {
                  if (param1 > 83) {
                    break L4;
                  } else {
                    ((bd) this).a((byte[]) null, 114L, 12);
                    break L4;
                  }
                }
                return;
              } else {
                var6 = ((bd) this).field_l[var4];
                param0[var5] = (byte)(int)(var6 >>> -1451393480);
                param0[var5 - -1] = (byte)(int)(var6 >>> 1261419184);
                param0[2 + var5] = (byte)(int)(var6 >>> -676879128);
                param0[var5 - -3] = (byte)(int)(var6 >>> -894975776);
                param0[4 + var5] = (byte)(int)(var6 >>> 2064389208);
                param0[var5 + 5] = (byte)(int)(var6 >>> 1612148368);
                param0[var5 + 6] = (byte)(int)(var6 >>> 2104559176);
                param0[var5 - -7] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L3;
              }
            }
          } else {
            ((bd) this).field_m = ((bd) this).field_m + 1;
            ((bd) this).field_a[((bd) this).field_m] = (byte) 0;
            continue L2;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((bd) this).field_j[var2] = (byte) 0;
        }
        ((bd) this).field_a[0] = (byte) 0;
        ((bd) this).field_m = 0;
        ((bd) this).field_i = 0;
        var2 = 0;
        if (param0 != 8) {
            field_d = null;
        }
        while (var2 < 8) {
            ((bd) this).field_l[var2] = 0L;
            var2++;
        }
    }

    public static void c(int param0) {
        if (param0 != 4) {
            field_d = null;
        }
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final void a(byte[] param0, long param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        var5 = 0;
        var6 = 7 & 8 - (7 & (int)param1);
        var7 = 7 & ((bd) this).field_i;
        var9 = param1;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (var11 < 0) {
            L1: while (true) {
              if (-9L <= (param1 ^ -1L)) {
                L2: {
                  if ((param1 ^ -1L) >= -1L) {
                    var8 = 0;
                    break L2;
                  } else {
                    var8 = param0[var5] << var6 & 255;
                    ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], var8 >>> var7);
                    break L2;
                  }
                }
                L3: {
                  if (param2 > 93) {
                    break L3;
                  } else {
                    field_f = 119;
                    break L3;
                  }
                }
                L4: {
                  if (-9L < (param1 + (long)var7 ^ -1L)) {
                    ((bd) this).field_i = (int)((long)((bd) this).field_i + param1);
                    break L4;
                  } else {
                    L5: {
                      ((bd) this).field_m = ((bd) this).field_m + 1;
                      ((bd) this).field_i = ((bd) this).field_i + (-var7 + 8);
                      param1 = param1 - (long)(8 + -var7);
                      if ((((bd) this).field_i ^ -1) == -513) {
                        this.b(120);
                        ((bd) this).field_i = 0;
                        ((bd) this).field_m = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((bd) this).field_a[((bd) this).field_m] = (byte)b.a(255, var8 << -var7 + 8);
                    ((bd) this).field_i = ((bd) this).field_i + (int)param1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param0[var5] << var6 | (param0[1 + var5] & 255) >>> -var6 + 8;
                  if (var8 > -1) {
                    break L6;
                  } else {
                    if (-257 > var8) {
                      L7: {
                        ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], var8 >>> var7);
                        ((bd) this).field_i = ((bd) this).field_i + (8 - var7);
                        ((bd) this).field_m = ((bd) this).field_m + 1;
                        if (((bd) this).field_i != 512) {
                          break L7;
                        } else {
                          this.b(120);
                          ((bd) this).field_i = 0;
                          ((bd) this).field_m = 0;
                          break L7;
                        }
                      }
                      ((bd) this).field_a[((bd) this).field_m] = (byte)b.a(255, var8 << 8 + -var7);
                      param1 = param1 - 8L;
                      ((bd) this).field_i = ((bd) this).field_i + var7;
                      var5++;
                      continue L1;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + (((int)var9 & 255) + (255 & ((bd) this).field_j[var11]));
            ((bd) this).field_j[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    L3: {
                      if (param0 == 120) {
                        break L3;
                      } else {
                        this.b(66);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        ((bd) this).field_l[var2] = og.a(((bd) this).field_l[var2], og.a(((bd) this).field_c[var2], ((bd) this).field_k[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (8 <= var3) {
                            ((bd) this).field_h[0] = og.a(((bd) this).field_h[0], ro.field_d[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bd) this).field_k[var3] = ((bd) this).field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((bd) this).field_b[var3] = ((bd) this).field_h[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((bd) this).field_b[var3] = og.a(((bd) this).field_b[var3], ro.field_h[var7][b.a(255, (int)(((bd) this).field_k[b.a(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bd) this).field_h[var3] = ((bd) this).field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((bd) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((bd) this).field_b[var3] = og.a(((bd) this).field_b[var3], ro.field_h[var4][b.a(255, (int)(((bd) this).field_h[b.a(7, -var4 + var3)] >>> var5))]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((bd) this).field_h[var2] = ((bd) this).field_l[var2];
                ((bd) this).field_k[var2] = og.a(((bd) this).field_c[var2], ((bd) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bd) this).field_c[var2] = og.a(j.a((long)((bd) this).field_a[var3 + 7], 255L), og.a(og.a(j.a((long)((bd) this).field_a[5 + var3], 255L) << -341619888, og.a(j.a(4278190080L, (long)((bd) this).field_a[4 + var3] << -852000424), og.a(j.a((long)((bd) this).field_a[var3 + 3] << 1141036768, 1095216660480L), og.a(og.a(j.a(71776119061217280L, (long)((bd) this).field_a[1 + var3] << 1025557616), (long)((bd) this).field_a[var3] << -1827128520), j.a((long)((bd) this).field_a[var3 - -2], 255L) << -2075266648)))), j.a(255L, (long)((bd) this).field_a[var3 + 6]) << 921468040));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    bd() {
        ((bd) this).field_m = 0;
        ((bd) this).field_c = new long[8];
        ((bd) this).field_k = new long[8];
        ((bd) this).field_i = 0;
        ((bd) this).field_a = new byte[64];
        ((bd) this).field_j = new byte[32];
        ((bd) this).field_b = new long[8];
        ((bd) this).field_h = new long[8];
        ((bd) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_e = new ve(9, 0, 4, 1);
        field_f = 0;
    }
}
