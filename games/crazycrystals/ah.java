/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private long[] field_n;
    static fc field_a;
    static int field_g;
    static int field_e;
    private byte[] field_c;
    static String field_d;
    private long[] field_k;
    private int field_j;
    private byte[] field_l;
    private long[] field_o;
    private long[] field_h;
    static dl field_b;
    private int field_i;
    private long[] field_m;
    static String field_f;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      if (param0 == 18236) {
                        break L3;
                      } else {
                        var7 = null;
                        ah.a((ng) null, -120, 88, (un) null);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((ah) this).field_h[var2] = km.a(((ah) this).field_h[var2], km.a(((ah) this).field_k[var2], ((ah) this).field_n[var2]));
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
                            ((ah) this).field_o[0] = km.a(((ah) this).field_o[0], so.field_a[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ah) this).field_n[var3] = ((ah) this).field_m[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ah) this).field_m[var3] = ((ah) this).field_o[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var8 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ah) this).field_m[var3] = km.a(((ah) this).field_m[var3], so.field_b[var8][pf.b(255, (int)(((ah) this).field_n[pf.b(var3 + -var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ah) this).field_o[var3] = ((ah) this).field_m[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ah) this).field_m[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((ah) this).field_m[var3] = km.a(((ah) this).field_m[var3], so.field_b[var4][pf.b((int)(((ah) this).field_o[pf.b(7, -var4 + var3)] >>> var5), 255)]);
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
                ((ah) this).field_o[var2] = ((ah) this).field_h[var2];
                ((ah) this).field_n[var2] = km.a(((ah) this).field_k[var2], ((ah) this).field_h[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ah) this).field_k[var2] = km.a(km.a(ao.a((long)((ah) this).field_c[var3 - -6] << -354718264, 65280L), km.a(km.a(km.a(km.a(ao.a((long)((ah) this).field_c[2 + var3], 255L) << 1169651432, km.a((long)((ah) this).field_c[var3] << 591702072, ao.a((long)((ah) this).field_c[var3 - -1], 255L) << 1516352624)), ao.a(255L, (long)((ah) this).field_c[var3 + 3]) << -244409120), ao.a((long)((ah) this).field_c[var3 + 4] << 435423000, 4278190080L)), ao.a((long)((ah) this).field_c[var3 - -5], 255L) << -881362352)), ao.a(255L, (long)((ah) this).field_c[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(ng param0, int param1, int param2, un param3) {
        try {
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            Class[] var13 = null;
            int var13_int = 0;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            pi var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            Throwable decompiledCaughtException = null;
            var15 = CrazyCrystals.field_B;
            var19 = new pi();
            var19.field_i = param0.h(255);
            var19.field_l = param0.b((byte) -61);
            var19.field_g = new int[var19.field_i];
            var5 = 115 % ((-71 - param2) / 52);
            var19.field_m = new gb[var19.field_i];
            var19.field_n = new int[var19.field_i];
            var19.field_f = new int[var19.field_i];
            var19.field_h = new byte[var19.field_i][][];
            var19.field_k = new gb[var19.field_i];
            var6 = 0;
            L0: while (true) {
              if (var6 >= var19.field_i) {
                hc.field_b.b(0, (jb) (Object) var19);
                return;
              } else {
                try {
                  L1: {
                    L2: {
                      L3: {
                        var7_int = param0.h(255);
                        if (0 == var7_int) {
                          break L3;
                        } else {
                          if (-2 == (var7_int ^ -1)) {
                            break L3;
                          } else {
                            if (2 != var7_int) {
                              L4: {
                                if (-4 == (var7_int ^ -1)) {
                                  break L4;
                                } else {
                                  if ((var7_int ^ -1) == -5) {
                                    break L4;
                                  } else {
                                    var6++;
                                    break L2;
                                  }
                                }
                              }
                              var21 = param0.i(122);
                              var22 = param0.i(115);
                              var10 = param0.h(255);
                              var11 = new String[var10];
                              var12_int = 0;
                              L5: while (true) {
                                if (var12_int >= var10) {
                                  L6: {
                                    var25 = new byte[var10][];
                                    var24 = var25;
                                    var23 = var24;
                                    var20 = var23;
                                    var12 = var20;
                                    if ((var7_int ^ -1) != -4) {
                                      break L6;
                                    } else {
                                      var13_int = 0;
                                      L7: while (true) {
                                        if (var10 <= var13_int) {
                                          break L6;
                                        } else {
                                          var14 = param0.b((byte) 126);
                                          var12[var13_int] = new byte[var14];
                                          param0.a(var14, var25[var13_int], (byte) -89, 0);
                                          var13_int++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                  var19.field_f[var6] = var7_int;
                                  var13 = new Class[var10];
                                  var18 = 0;
                                  var14 = var18;
                                  L8: while (true) {
                                    if (var18 >= var10) {
                                      var19.field_m[var6] = param3.a((byte) -93, nh.a((byte) -126, var21), var13, var22);
                                      var19.field_h[var6] = var25;
                                      var6++;
                                      break L2;
                                    } else {
                                      var13[var18] = nh.a((byte) 121, var11[var18]);
                                      var18++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var11[var12_int] = param0.i(116);
                                  var12_int++;
                                  continue L5;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L9: {
                        var17 = param0.i(111);
                        var8 = var17;
                        var16 = param0.i(115);
                        var9 = var16;
                        var10 = 0;
                        if (var7_int != 1) {
                          break L9;
                        } else {
                          var10 = param0.b((byte) 126);
                          break L9;
                        }
                      }
                      var19.field_f[var6] = var7_int;
                      var19.field_g[var6] = var10;
                      var19.field_k[var6] = param3.a(22, var16, nh.a((byte) -105, var17));
                      var6++;
                      break L2;
                    }
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L10: {
                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    var19.field_n[var6] = -1;
                    var6++;
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var7_ref3 = (Exception) (Object) decompiledCaughtException;
                    var19.field_n[var6] = -4;
                    var6++;
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L14: {
                    var7_ref4 = decompiledCaughtException;
                    var19.field_n[var6] = -5;
                    var6++;
                    break L14;
                  }
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = CrazyCrystals.field_B;
          var5 = 0;
          var6 = 7 & 8 + -((int)param1 & 7);
          var7 = ((ah) this).field_i & 7;
          var9 = param1;
          if (param0 == -82) {
            break L0;
          } else {
            ((ah) this).field_n = null;
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (-1 < (var11 ^ -1)) {
            L2: while (true) {
              if (8L >= param1) {
                L3: {
                  if (-1L <= (param1 ^ -1L)) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param2[var5] << var6 & 255;
                    ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if ((param1 + (long)var7 ^ -1L) > -9L) {
                    ((ah) this).field_i = (int)((long)((ah) this).field_i + param1);
                    break L4;
                  } else {
                    L5: {
                      ((ah) this).field_j = ((ah) this).field_j + 1;
                      param1 = param1 - (long)(8 - var7);
                      ((ah) this).field_i = ((ah) this).field_i + (8 + -var7);
                      if (((ah) this).field_i != 512) {
                        break L5;
                      } else {
                        this.a(18236);
                        ((ah) this).field_j = 0;
                        ((ah) this).field_i = 0;
                        break L5;
                      }
                    }
                    ((ah) this).field_c[((ah) this).field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                    ((ah) this).field_i = ((ah) this).field_i + (int)param1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param2[var5] << var6 | (param2[var5 + 1] & 255) >>> -var6 + 8;
                  if (0 > var8) {
                    break L6;
                  } else {
                    if (-257 >= (var8 ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], var8 >>> var7);
                        ((ah) this).field_i = ((ah) this).field_i + (8 + -var7);
                        ((ah) this).field_j = ((ah) this).field_j + 1;
                        if (((ah) this).field_i == 512) {
                          this.a(18236);
                          ((ah) this).field_i = 0;
                          ((ah) this).field_j = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((ah) this).field_c[((ah) this).field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                      param1 = param1 - 8L;
                      ((ah) this).field_i = ((ah) this).field_i + var7;
                      var5++;
                      continue L2;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + (((int)var9 & 255) + (255 & ((ah) this).field_l[var11]));
            ((ah) this).field_l[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static void a(String param0, int param1, int param2, byte param3, int param4) {
        int var5 = 108 % ((param3 - 31) / 54);
        aj.a(32293, 32, param1, param4, param2, param0);
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != 40) {
            return;
        }
        field_f = null;
    }

    final static String a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            var7 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  var3 = (String) hi.a(param1, "getcookies", -92);
                  if (param0) {
                    break L1;
                  } else {
                    var8 = null;
                    ah.a(33, (String) null, (java.applet.Applet) null);
                    break L1;
                  }
                }
                var4 = ik.a(var3, (byte) -76, ';');
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4.length) {
                    break L0;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (0 > var6) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                          stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = decompiledCaughtException;
                break L4;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != 5236) {
            field_f = null;
        }
        return ci.field_i.a(7693, param0, "");
    }

    final void a(byte[] param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], 128 >>> pf.b(7, ((ah) this).field_i));
          ((ah) this).field_j = ((ah) this).field_j + 1;
          if (param1) {
            break L0;
          } else {
            ah.a((byte) -28);
            break L0;
          }
        }
        L1: {
          if (-33 > (((ah) this).field_j ^ -1)) {
            L2: while (true) {
              if (64 <= ((ah) this).field_j) {
                this.a(18236);
                ((ah) this).field_j = 0;
                break L1;
              } else {
                int fieldTemp$2 = ((ah) this).field_j;
                ((ah) this).field_j = ((ah) this).field_j + 1;
                ((ah) this).field_c[fieldTemp$2] = (byte) 0;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L3: while (true) {
          if ((((ah) this).field_j ^ -1) <= -33) {
            eg.a(((ah) this).field_l, 0, ((ah) this).field_c, 32, 32);
            this.a(18236);
            var4 = 0;
            var5 = param2;
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((ah) this).field_h[var4];
                param0[var5] = (byte)(int)(var6 >>> -1225529032);
                param0[var5 + 1] = (byte)(int)(var6 >>> 1604689584);
                param0[2 + var5] = (byte)(int)(var6 >>> -1983510424);
                param0[3 + var5] = (byte)(int)(var6 >>> 1924117856);
                param0[4 + var5] = (byte)(int)(var6 >>> 439097048);
                param0[var5 + 5] = (byte)(int)(var6 >>> 308363280);
                param0[var5 - -6] = (byte)(int)(var6 >>> -1182762552);
                param0[7 + var5] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((ah) this).field_j;
            ((ah) this).field_j = ((ah) this).field_j + 1;
            ((ah) this).field_c[fieldTemp$3] = (byte) 0;
            continue L3;
          }
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            to.field_f = param1;
            try {
                if (param0 > -46) {
                    Object var6 = null;
                    byte[] discarded$0 = ah.a((String) null, -38);
                }
                var7 = param2.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (0 == param1.length()) {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var8 + "; Expires=" + sm.a(lo.a((byte) -101) + 94608000000L, (byte) 126) + "; Max-Age=" + 94608000L;
                }
                hi.a("document.cookie=\"" + var5 + "\"", param2, (byte) -98);
            } catch (Throwable throwable) {
            }
            hk.a(112, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = CrazyCrystals.field_B;
        for (var2 = 0; var2 < 32; var2++) {
            ((ah) this).field_l[var2] = (byte) 0;
        }
        ((ah) this).field_c[0] = (byte) 0;
        ((ah) this).field_j = 0;
        ((ah) this).field_i = 0;
        var2 = 0;
        int var3 = -31 / ((61 - param0) / 51);
        while ((var2 ^ -1) > -9) {
            ((ah) this).field_h[var2] = 0L;
            var2++;
        }
    }

    ah() {
        ((ah) this).field_o = new long[8];
        ((ah) this).field_j = 0;
        ((ah) this).field_c = new byte[64];
        ((ah) this).field_i = 0;
        ((ah) this).field_l = new byte[32];
        ((ah) this).field_h = new long[8];
        ((ah) this).field_m = new long[8];
        ((ah) this).field_n = new long[8];
        ((ah) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_d = "END";
        field_a = new fc(16);
        field_f = "Laser Beam";
    }
}
