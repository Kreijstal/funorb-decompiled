/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static String field_b;
    private long[] field_f;
    static String field_h;
    private byte[] field_d;
    static String field_c;
    private byte[] field_l;
    static int[] field_k;
    private long[] field_a;
    private int field_o;
    private long[] field_g;
    private long[] field_n;
    static String field_j;
    private long[] field_i;
    static String field_e;
    private int field_m;

    final void b(byte param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((qe) this).field_l[var2] = (byte) 0;
        }
        ((qe) this).field_o = 0;
        ((qe) this).field_m = 0;
        ((qe) this).field_d[0] = (byte) 0;
        var2 = 0;
        if (param0 >= -32) {
            return;
        }
        while (-9 < (var2 ^ -1)) {
            ((qe) this).field_g[var2] = 0L;
            var2++;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    L3: {
                      if (param0 <= -24) {
                        break L3;
                      } else {
                        ((qe) this).field_l = null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((qe) this).field_g[var2] = pj.a(((qe) this).field_g[var2], pj.a(((qe) this).field_f[var2], ((qe) this).field_n[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            ((qe) this).field_a[0] = pj.a(((qe) this).field_a[0], uk.field_x[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((qe) this).field_n[var3] = ((qe) this).field_i[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((qe) this).field_i[var3] = ((qe) this).field_a[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((qe) this).field_i[var3] = pj.a(((qe) this).field_i[var3], uk.field_s[var7][lb.a((int)(((qe) this).field_n[lb.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((qe) this).field_a[var3] = ((qe) this).field_i[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((qe) this).field_i[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((qe) this).field_i[var3] = pj.a(((qe) this).field_i[var3], uk.field_s[var4][lb.a((int)(((qe) this).field_a[lb.a(7, -var4 + var3)] >>> var5), 255)]);
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
                ((qe) this).field_a[var2] = ((qe) this).field_g[var2];
                ((qe) this).field_n[var2] = pj.a(((qe) this).field_f[var2], ((qe) this).field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((qe) this).field_f[var2] = pj.a(pj.a(jg.a((long)((qe) this).field_d[var3 + 6], 255L) << -383590584, pj.a(jg.a((long)((qe) this).field_d[var3 + 5] << -306192304, 16711680L), pj.a(jg.a(4278190080L, (long)((qe) this).field_d[var3 + 4] << 413393112), pj.a(jg.a((long)((qe) this).field_d[3 + var3] << 459903008, 1095216660480L), pj.a(pj.a((long)((qe) this).field_d[var3] << 1570355832, jg.a((long)((qe) this).field_d[var3 + 1] << -455555024, 71776119061217280L)), jg.a(280375465082880L, (long)((qe) this).field_d[2 + var3] << -197783768)))))), jg.a(255L, (long)((qe) this).field_d[7 + var3]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
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
        L0: {
          var13 = client.field_A ? 1 : 0;
          var5 = 0;
          var6 = 7 & 8 - ((int)param2 & 7);
          if (param0 == 255) {
            break L0;
          } else {
            String discarded$1 = qe.a((byte) 13);
            break L0;
          }
        }
        var7 = 7 & ((qe) this).field_o;
        var9 = param2;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (0 > var11) {
            L2: while (true) {
              if ((param2 ^ -1L) >= -9L) {
                L3: {
                  if (param2 > 0L) {
                    var8 = param1[var5] << var6 & 255;
                    ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if ((param2 + (long)var7 ^ -1L) <= -9L) {
                    L5: {
                      ((qe) this).field_o = ((qe) this).field_o + (-var7 + 8);
                      ((qe) this).field_m = ((qe) this).field_m + 1;
                      param2 = param2 - (long)(8 - var7);
                      if ((((qe) this).field_o ^ -1) != -513) {
                        break L5;
                      } else {
                        this.b(-26);
                        ((qe) this).field_m = 0;
                        ((qe) this).field_o = 0;
                        break L5;
                      }
                    }
                    ((qe) this).field_d[((qe) this).field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                    ((qe) this).field_o = ((qe) this).field_o + (int)param2;
                    break L4;
                  } else {
                    ((qe) this).field_o = (int)((long)((qe) this).field_o + param2);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param1[var5] << var6 | (param1[1 + var5] & 255) >>> 8 + -var6;
                  if (0 > var8) {
                    break L6;
                  } else {
                    if (-257 < (var8 ^ -1)) {
                      L7: {
                        ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], var8 >>> var7);
                        ((qe) this).field_o = ((qe) this).field_o + (-var7 + 8);
                        ((qe) this).field_m = ((qe) this).field_m + 1;
                        if (-513 != (((qe) this).field_o ^ -1)) {
                          break L7;
                        } else {
                          this.b(-63);
                          ((qe) this).field_o = 0;
                          ((qe) this).field_m = 0;
                          break L7;
                        }
                      }
                      ((qe) this).field_d[((qe) this).field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                      param2 = param2 - 8L;
                      var5++;
                      ((qe) this).field_o = ((qe) this).field_o + var7;
                      continue L2;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((((qe) this).field_l[var11] & 255) - -(255 & (int)var9));
            ((qe) this).field_l[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 3) {
            field_k = null;
        }
        return null != ed.a(param0, (byte) -108) ? true : false;
    }

    final void a(int param0, int param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], 128 >>> lb.a(((qe) this).field_o, 7));
          ((qe) this).field_m = ((qe) this).field_m + 1;
          if ((((qe) this).field_m ^ -1) >= -33) {
            break L0;
          } else {
            L1: while (true) {
              if ((((qe) this).field_m ^ -1) <= -65) {
                this.b(-115);
                ((qe) this).field_m = 0;
                break L0;
              } else {
                int fieldTemp$2 = ((qe) this).field_m;
                ((qe) this).field_m = ((qe) this).field_m + 1;
                ((qe) this).field_d[fieldTemp$2] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((qe) this).field_m) {
            an.a(((qe) this).field_l, 0, ((qe) this).field_d, 32, 32);
            this.b(-76);
            var4 = 0;
            var5 = param1;
            L3: while (true) {
              if (var4 >= 8) {
                L4: {
                  if (param0 == 64767752) {
                    break L4;
                  } else {
                    ((qe) this).field_m = -86;
                    break L4;
                  }
                }
                return;
              } else {
                var6 = ((qe) this).field_g[var4];
                param2[var5] = (byte)(int)(var6 >>> 1762041848);
                param2[var5 - -1] = (byte)(int)(var6 >>> 442716528);
                param2[2 + var5] = (byte)(int)(var6 >>> -499075224);
                param2[3 + var5] = (byte)(int)(var6 >>> 1507390240);
                param2[var5 + 4] = (byte)(int)(var6 >>> 1776836824);
                param2[5 + var5] = (byte)(int)(var6 >>> -396321520);
                param2[6 + var5] = (byte)(int)(var6 >>> 64767752);
                param2[7 + var5] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L3;
              }
            }
          } else {
            int fieldTemp$3 = ((qe) this).field_m;
            ((qe) this).field_m = ((qe) this).field_m + 1;
            ((qe) this).field_d[fieldTemp$3] = (byte) 0;
            continue L2;
          }
        }
    }

    final static String a(byte param0) {
        String var1 = "";
        if (param0 < 85) {
            return null;
        }
        if (!(dm.field_c == null)) {
            var1 = dm.field_c.j(80);
        }
        if (!(-1 != (var1.length() ^ -1))) {
            var1 = db.b((byte) 122);
        }
        if (var1.length() == 0) {
            var1 = wh.field_e;
        }
        return var1;
    }

    final static ck[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ck var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        ck var13 = null;
        ck var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          if (param5 == -26198) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          var18 = hk.field_l;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = hk.field_j;
          var8 = hk.field_i;
          var9 = new ck(16, param1);
          var9.a();
          hk.d(0, 0, 16, param1, param3, param4);
          var10 = null;
          if (param2) {
            var13 = var9.c();
            var10 = (Object) (Object) var13;
            var13.a();
            hk.a(0, 0, 5, 0);
            hk.a(0, 1, 3, 0);
            hk.a(0, 2, 2, 0);
            hk.a(0, 3, 1, 0);
            hk.a(0, 4, 1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var11 = null;
          if (!param0) {
            break L2;
          } else {
            var14 = var9.c();
            var11 = (Object) (Object) var14;
            var14.a();
            hk.a(11, 0, 5, 0);
            hk.a(13, 1, 3, 0);
            hk.a(14, 2, 2, 0);
            hk.a(15, 3, 1, 0);
            hk.a(15, 4, 1, 0);
            break L2;
          }
        }
        hk.a(var18, var7, var8);
        return new ck[]{null, null, null, (ck) var10, var9, (ck) var11, null, null, null};
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_k = null;
        field_b = null;
        field_j = null;
        if (param0 != -20007) {
            field_c = null;
        }
    }

    final static void a(long param0, int param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        if (param1 < -100) {
          try {
            L0: {
              Thread.sleep(param0);
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              var3 = (InterruptedException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    qe() {
        ((qe) this).field_d = new byte[64];
        ((qe) this).field_f = new long[8];
        ((qe) this).field_o = 0;
        ((qe) this).field_g = new long[8];
        ((qe) this).field_l = new byte[32];
        ((qe) this).field_i = new long[8];
        ((qe) this).field_n = new long[8];
        ((qe) this).field_m = 0;
        ((qe) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8];
        field_h = "Unable to add name - system busy";
        field_j = "To activate a special item, pop a shape next to it.";
        field_b = "Asking to join <%0>'s game...";
        field_e = "Age:";
        field_c = "Play rated game";
    }
}
