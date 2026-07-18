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
        for (var2 = 0; var2 < 32; var2++) {
            ((qe) this).field_l[var2] = (byte) 0;
        }
        ((qe) this).field_o = 0;
        ((qe) this).field_m = 0;
        ((qe) this).field_d[0] = (byte) 0;
        var2 = 0;
        if (param0 >= -32) {
            return;
        }
        while (var2 < 8) {
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
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
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
                          if (var3 >= 8) {
                            ((qe) this).field_a[0] = pj.a(((qe) this).field_a[0], uk.field_x[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
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
            ((qe) this).field_f[var2] = pj.a(pj.a(jg.a((long)((qe) this).field_d[var3 + 6], 255L) << 8, pj.a(jg.a((long)((qe) this).field_d[var3 + 5] << 16, 16711680L), pj.a(jg.a(4278190080L, (long)((qe) this).field_d[var3 + 4] << 24), pj.a(jg.a((long)((qe) this).field_d[3 + var3] << 32, 1095216660480L), pj.a(pj.a((long)((qe) this).field_d[var3] << 56, jg.a((long)((qe) this).field_d[var3 + 1] << 48, 71776119061217280L)), jg.a(280375465082880L, (long)((qe) this).field_d[2 + var3] << 40)))))), jg.a(255L, (long)((qe) this).field_d[7 + var3]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final void a(int param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 - ((int)param2 & 7);
              if (param0 == 255) {
                break L1;
              } else {
                String discarded$1 = qe.a((byte) 13);
                break L1;
              }
            }
            var7 = 7 & ((qe) this).field_o;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (param2 <= 8L) {
                    L4: {
                      if (param2 > 0L) {
                        var8 = param1[var5_int] << var6 & 255;
                        ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 + (long)var7 >= 8L) {
                        L6: {
                          ((qe) this).field_o = ((qe) this).field_o + (-var7 + 8);
                          ((qe) this).field_m = ((qe) this).field_m + 1;
                          param2 = param2 - (long)(8 - var7);
                          if (((qe) this).field_o != 512) {
                            break L6;
                          } else {
                            this.b(-26);
                            ((qe) this).field_m = 0;
                            ((qe) this).field_o = 0;
                            break L6;
                          }
                        }
                        ((qe) this).field_d[((qe) this).field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                        ((qe) this).field_o = ((qe) this).field_o + (int)param2;
                        break L5;
                      } else {
                        ((qe) this).field_o = (int)((long)((qe) this).field_o + param2);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 + -var6;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], var8 >>> var7);
                            ((qe) this).field_o = ((qe) this).field_o + (-var7 + 8);
                            ((qe) this).field_m = ((qe) this).field_m + 1;
                            if (((qe) this).field_o != 512) {
                              break L8;
                            } else {
                              this.b(-63);
                              ((qe) this).field_o = 0;
                              ((qe) this).field_m = 0;
                              break L8;
                            }
                          }
                          ((qe) this).field_d[((qe) this).field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                          param2 = param2 - 8L;
                          var5_int++;
                          ((qe) this).field_o = ((qe) this).field_o + var7;
                          continue L3;
                        } else {
                          break L7;
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        return null != ed.a(param0, (byte) -108);
    }

    final void a(int param0, int param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ((qe) this).field_d[((qe) this).field_m] = (byte)de.b((int) ((qe) this).field_d[((qe) this).field_m], 128 >>> lb.a(((qe) this).field_o, 7));
              ((qe) this).field_m = ((qe) this).field_m + 1;
              if (((qe) this).field_m <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((qe) this).field_m >= 64) {
                    this.b(-115);
                    ((qe) this).field_m = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((qe) this).field_m;
                    ((qe) this).field_m = ((qe) this).field_m + 1;
                    ((qe) this).field_d[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= ((qe) this).field_m) {
                an.a(((qe) this).field_l, 0, ((qe) this).field_d, 32, 32);
                this.b(-76);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (var4_int >= 8) {
                    L5: {
                      if (param0 == 64767752) {
                        break L5;
                      } else {
                        ((qe) this).field_m = -86;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = ((qe) this).field_g[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 56);
                    param2[var5 - -1] = (byte)(int)(var6 >>> 48);
                    param2[2 + var5] = (byte)(int)(var6 >>> 40);
                    param2[3 + var5] = (byte)(int)(var6 >>> 32);
                    param2[var5 + 4] = (byte)(int)(var6 >>> 24);
                    param2[5 + var5] = (byte)(int)(var6 >>> 16);
                    param2[6 + var5] = (byte)(int)(var6 >>> 8);
                    param2[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((qe) this).field_m;
                ((qe) this).field_m = ((qe) this).field_m + 1;
                ((qe) this).field_d[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
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
        if (!(var1.length() != 0)) {
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
            var10 = var13;
            var13.a();
            hk.a(0, 0, 5, 0);
            hk.a(0, 1, 3, 0);
            hk.a(0, 2, 2, 0);
            hk.a(0, 3, 1, 0);
            hk.a(0, 4, 1, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var11 = null;
          if (!param0) {
            break L1;
          } else {
            var14 = var9.c();
            var11 = var14;
            var14.a();
            hk.a(11, 0, 5, 0);
            hk.a(13, 1, 3, 0);
            hk.a(14, 2, 2, 0);
            hk.a(15, 3, 1, 0);
            hk.a(15, 4, 1, 0);
            break L1;
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
    }

    final static void a(long param0, int param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            if (param1 < -100) {
              {
                L0: {
                  Thread.sleep(param0);
                  break L0;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        field_k = new int[8];
        field_h = "Unable to add name - system busy";
        field_j = "To activate a special item, pop a shape next to it.";
        field_b = "Asking to join <%0>'s game...";
        field_e = "Age:";
        field_c = "Play rated game";
    }
}
