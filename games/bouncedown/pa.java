/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa {
    private long[] field_k;
    static boolean field_e;
    private byte[] field_m;
    private long[] field_f;
    private int field_g;
    static gk field_c;
    static gk field_i;
    private long[] field_o;
    private int field_j;
    private long[] field_h;
    static ae field_d;
    static java.awt.Font field_a;
    private byte[] field_l;
    static String field_b;
    private long[] field_n;

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Bounce.field_N;
          ((pa) this).field_l[((pa) this).field_j] = (byte)ge.a((int) ((pa) this).field_l[((pa) this).field_j], 128 >>> da.b(7, ((pa) this).field_g));
          ((pa) this).field_j = ((pa) this).field_j + 1;
          if (((pa) this).field_j <= 32) {
            break L0;
          } else {
            L1: while (true) {
              if (((pa) this).field_j >= 64) {
                this.c(param1 + -54286);
                ((pa) this).field_j = 0;
                break L0;
              } else {
                ((pa) this).field_j = ((pa) this).field_j + 1;
                ((pa) this).field_l[((pa) this).field_j] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((pa) this).field_j) {
            cb.a(((pa) this).field_m, 0, ((pa) this).field_l, 32, 32);
            this.c(-26394);
            if (param1 == 27892) {
              var4 = 0;
              var5 = param2;
              L3: while (true) {
                if (8 <= var4) {
                  return;
                } else {
                  var6 = ((pa) this).field_n[var4];
                  param0[var5] = (byte)(int)(var6 >>> 1161280248);
                  param0[1 + var5] = (byte)(int)(var6 >>> -1025025808);
                  param0[var5 - -2] = (byte)(int)(var6 >>> -57990104);
                  param0[var5 + 3] = (byte)(int)(var6 >>> -683840864);
                  param0[4 + var5] = (byte)(int)(var6 >>> 511708120);
                  param0[var5 - -5] = (byte)(int)(var6 >>> -533904048);
                  param0[6 + var5] = (byte)(int)(var6 >>> -1842774072);
                  param0[7 + var5] = (byte)(int)var6;
                  var4++;
                  var5 += 8;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            ((pa) this).field_j = ((pa) this).field_j + 1;
            ((pa) this).field_l[((pa) this).field_j] = (byte) 0;
            continue L2;
          }
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Bounce.field_N;
        if ((param0 ^ -1L) >= -1L) {
            return null;
        }
        if ((param0 ^ -1L) <= -6582952005840035282L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        if (param1 != 7) {
            pa.b(-20);
        }
        long var4 = param0;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = li.field_c[(int)(-(37L * param0) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 37) {
            field_b = null;
        }
        field_i = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        for (var2 = 0; var2 < 32; var2++) {
            ((pa) this).field_m[var2] = (byte) 0;
        }
        ((pa) this).field_l[0] = (byte) 0;
        ((pa) this).field_j = 0;
        ((pa) this).field_g = 0;
        var2 = 0;
        if (param0 != -28530) {
            Object var4 = null;
            ((pa) this).a((byte[]) null, 51, 73);
        }
        while ((var2 ^ -1) > -9) {
            ((pa) this).field_n[var2] = 0L;
            var2++;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        var2 = Bounce.field_N;
        if (!fi.b(param0 + 21921)) {
          if (sj.field_f == null) {
            return;
          } else {
            L0: {
              if (sj.field_f.field_f) {
                eh.a(true);
                kf.field_b.b((lk) (Object) new nh(kf.field_b, jb.field_c), false);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          L1: {
            if (param0 == -65) {
              break L1;
            } else {
              pa.b(110);
              break L1;
            }
          }
          boolean discarded$12 = kf.field_b.a(aj.field_f, true, true, kl.field_t);
          kf.field_b.d((byte) 120);
          L2: while (true) {
            if (!q.g((byte) -15)) {
              return;
            } else {
              boolean discarded$13 = kf.field_b.a((byte) -90, lh.field_f, gk.field_d);
              continue L2;
            }
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Bounce.field_N;
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
                      var2 = 0;
                      if (param0 == -26394) {
                        break L3;
                      } else {
                        ((pa) this).field_f = null;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        ((pa) this).field_n[var2] = hf.a(((pa) this).field_n[var2], hf.a(((pa) this).field_f[var2], ((pa) this).field_k[var2]));
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
                          if (var3 >= 8) {
                            ((pa) this).field_o[0] = hf.a(((pa) this).field_o[0], eh.field_d[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((pa) this).field_k[var3] = ((pa) this).field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((pa) this).field_h[var3] = ((pa) this).field_o[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((pa) this).field_h[var3] = hf.a(((pa) this).field_h[var3], eh.field_a[var7][da.b((int)(((pa) this).field_k[da.b(-var7 + var3, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((pa) this).field_o[var3] = ((pa) this).field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((pa) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((pa) this).field_h[var3] = hf.a(((pa) this).field_h[var3], eh.field_a[var4][da.b((int)(((pa) this).field_o[da.b(-var4 + var3, 7)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((pa) this).field_o[var2] = ((pa) this).field_n[var2];
                ((pa) this).field_k[var2] = hf.a(((pa) this).field_f[var2], ((pa) this).field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((pa) this).field_f[var2] = hf.a(tk.a((long)((pa) this).field_l[7 + var3], 255L), hf.a(hf.a(tk.a(255L, (long)((pa) this).field_l[var3 + 5]) << 2034309712, hf.a(hf.a(tk.a(1095216660480L, (long)((pa) this).field_l[var3 - -3] << -889532640), hf.a(hf.a((long)((pa) this).field_l[var3] << 1029492600, tk.a((long)((pa) this).field_l[1 + var3], 255L) << 251525232), tk.a(255L, (long)((pa) this).field_l[var3 + 2]) << 1058064680)), tk.a(4278190080L, (long)((pa) this).field_l[4 + var3] << -808968744))), tk.a((long)((pa) this).field_l[6 + var3], 255L) << 112285448));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static void a(String param0, int param1, boolean param2, long param3, int param4, boolean param5, int param6, int param7, int param8, int param9, int param10, si param11, int param12, int param13) {
        try {
            if (param6 != 25342) {
                pa.a((byte) 46);
            }
            jc.field_g = new ii(param7);
            hh.field_p = new ii(param12);
            tc.field_t = param2 ? true : false;
            td.field_b = param1;
            mb.field_s = param3;
            pj.field_c = param11;
            nb.field_f = param4;
            of.field_c = param13;
            fi.field_b = param9;
            wa.field_b = param8;
            cf.field_a = param10;
            ba.field_B = param5 ? true : false;
            gk.field_h = param0;
            if (pj.field_c.field_v != null) {
                try {
                    gf.field_g = new jf(pj.field_c.field_v, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(long param0, byte[] param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Bounce.field_N;
        var5 = 0;
        var6 = 8 + -((int)param0 & 7) & 7;
        if (param2 >= 33) {
          var7 = ((pa) this).field_g & 7;
          var9 = param0;
          var11 = 31;
          var12 = 0;
          L0: while (true) {
            if (-1 < (var11 ^ -1)) {
              L1: while (true) {
                if (param0 <= 8L) {
                  L2: {
                    if (0L >= param0) {
                      var8 = 0;
                      break L2;
                    } else {
                      var8 = 255 & param1[var5] << var6;
                      ((pa) this).field_l[((pa) this).field_j] = (byte)ge.a((int) ((pa) this).field_l[((pa) this).field_j], var8 >>> var7);
                      break L2;
                    }
                  }
                  L3: {
                    if (8L > (long)var7 - -param0) {
                      ((pa) this).field_g = (int)((long)((pa) this).field_g + param0);
                      break L3;
                    } else {
                      L4: {
                        ((pa) this).field_g = ((pa) this).field_g + (-var7 + 8);
                        ((pa) this).field_j = ((pa) this).field_j + 1;
                        param0 = param0 - (long)(-var7 + 8);
                        if (-513 != (((pa) this).field_g ^ -1)) {
                          break L4;
                        } else {
                          this.c(-26394);
                          ((pa) this).field_g = 0;
                          ((pa) this).field_j = 0;
                          break L4;
                        }
                      }
                      ((pa) this).field_l[((pa) this).field_j] = (byte)da.b(var8 << 8 + -var7, 255);
                      ((pa) this).field_g = ((pa) this).field_g + (int)param0;
                      break L3;
                    }
                  }
                  return;
                } else {
                  L5: {
                    var8 = 255 & param1[var5] << var6 | (255 & param1[1 + var5]) >>> -var6 + 8;
                    if ((var8 ^ -1) > -1) {
                      break L5;
                    } else {
                      if (var8 >= 256) {
                        break L5;
                      } else {
                        L6: {
                          ((pa) this).field_l[((pa) this).field_j] = (byte)ge.a((int) ((pa) this).field_l[((pa) this).field_j], var8 >>> var7);
                          ((pa) this).field_g = ((pa) this).field_g + (8 - var7);
                          ((pa) this).field_j = ((pa) this).field_j + 1;
                          if (512 == ((pa) this).field_g) {
                            this.c(-26394);
                            ((pa) this).field_j = 0;
                            ((pa) this).field_g = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((pa) this).field_l[((pa) this).field_j] = (byte)da.b(var8 << -var7 + 8, 255);
                        var5++;
                        param0 = param0 - 8L;
                        ((pa) this).field_g = ((pa) this).field_g + var7;
                        continue L1;
                      }
                    }
                  }
                  throw new RuntimeException("LOGIC ERROR");
                }
              }
            } else {
              var12 = var12 + ((255 & (int)var9) + (255 & ((pa) this).field_m[var11]));
              ((pa) this).field_m[var11] = (byte)var12;
              var12 = var12 >>> 8;
              var9 = var9 >>> 8;
              var11--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    pa() {
        ((pa) this).field_m = new byte[32];
        ((pa) this).field_k = new long[8];
        ((pa) this).field_j = 0;
        ((pa) this).field_g = 0;
        ((pa) this).field_f = new long[8];
        ((pa) this).field_h = new long[8];
        ((pa) this).field_o = new long[8];
        ((pa) this).field_l = new byte[64];
        ((pa) this).field_n = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
