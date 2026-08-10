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
            this.field_l[var2] = (byte) 0;
        }
        this.field_o = 0;
        this.field_m = 0;
        this.field_d[0] = (byte) 0;
        var2 = 0;
        if (param0 >= -32) {
            return;
        }
        while (-9 < (var2 ^ -1)) {
            this.field_g[var2] = 0L;
            var2++;
        }
    }

    private final void b(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
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
                        this.field_l = (byte[]) null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
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
                            this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_n[var3] = this.field_i[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_i[var3] = this.field_a[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var7][lb.a((int)(this.field_n[lb.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_a[var3] = this.field_i[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_i[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_a[lb.a(7, -var4 + var3)] >>> var5), 255)]);
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
                dupTemp$0 = this.field_g[var2];
                arrayValue$1 = this.field_f[var2];
                this.field_a[var2] = dupTemp$0;
                this.field_n[var2] = pj.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_f[var2] = pj.a(pj.a(jg.a((long)this.field_d[var3 + 6], 255L) << -383590584, pj.a(jg.a((long)this.field_d[var3 + 5] << -306192304, 16711680L), pj.a(jg.a(4278190080L, (long)this.field_d[var3 + 4] << 413393112), pj.a(jg.a((long)this.field_d[3 + var3] << 459903008, 1095216660480L), pj.a(pj.a((long)this.field_d[var3] << 1570355832, jg.a((long)this.field_d[var3 + 1] << -455555024, 71776119061217280L)), jg.a(280375465082880L, (long)this.field_d[2 + var3] << -197783768)))))), jg.a(255L, (long)this.field_d[7 + var3]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final void a(int param0, byte[] param1, long param2) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 - ((int)param2 & 7);
              if (param0 == 255) {
                break L1;
              } else {
                qe.a((byte) 13);
                break L1;
              }
            }
            var7 = 7 & this.field_o;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if ((param2 ^ -1L) >= -9L) {
                    L4: {
                      if (param2 > 0L) {
                        stackIn_17_0 = param1[var5_int] << var6;
                        stackIn_17_1 = 255;
                        var8 = stackIn_17_0 & stackIn_17_1;
                        this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if ((param2 + (long)var7 ^ -1L) <= -9L) {
                        L6: {
                          this.field_o = this.field_o + (-var7 + 8);
                          this.field_m = this.field_m + 1;
                          param2 = param2 - (long)(8 - var7);
                          if ((this.field_o ^ -1) != -513) {
                            break L6;
                          } else {
                            this.b(-26);
                            this.field_m = 0;
                            this.field_o = 0;
                            break L6;
                          }
                        }
                        this.field_d[this.field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                        this.field_o = this.field_o + (int)param2;
                        break L5;
                      } else {
                        this.field_o = (int)((long)this.field_o + param2);
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
                        if (-257 < (var8 ^ -1)) {
                          L8: {
                            this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8 >>> var7);
                            this.field_o = this.field_o + (-var7 + 8);
                            this.field_m = this.field_m + 1;
                            if (-513 != (this.field_o ^ -1)) {
                              break L8;
                            } else {
                              this.b(-63);
                              this.field_o = 0;
                              this.field_m = 0;
                              break L8;
                            }
                          }
                          this.field_d[this.field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                          param2 = param2 - 8L;
                          var5_int++;
                          this.field_o = this.field_o + var7;
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
                var12 = var12 + ((this.field_l[var11] & 255) - -(255 & (int)var9));
                this.field_l[var11] = (byte)var12;
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
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("qe.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (null == ed.a(param0, (byte) -108)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("qe.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], 128 >>> lb.a(this.field_o, 7));
              this.field_m = this.field_m + 1;
              if ((this.field_m ^ -1) >= -33) {
                break L1;
              } else {
                L2: while (true) {
                  if ((this.field_m ^ -1) <= -65) {
                    this.b(-115);
                    this.field_m = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_m;
                    this.field_m = this.field_m + 1;
                    this.field_d[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= this.field_m) {
                an.a(this.field_l, 0, this.field_d, 32, 32);
                this.b(-76);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (var4_int >= 8) {
                    L5: {
                      if (param0 == 64767752) {
                        break L5;
                      } else {
                        this.field_m = -86;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = this.field_g[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 1762041848);
                    param2[var5 - -1] = (byte)(int)(var6 >>> 442716528);
                    param2[2 + var5] = (byte)(int)(var6 >>> -499075224);
                    param2[3 + var5] = (byte)(int)(var6 >>> 1507390240);
                    param2[var5 + 4] = (byte)(int)(var6 >>> 1776836824);
                    param2[5 + var5] = (byte)(int)(var6 >>> -396321520);
                    param2[6 + var5] = (byte)(int)(var6 >>> 64767752);
                    param2[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$1 = this.field_m;
                this.field_m = this.field_m + 1;
                this.field_d[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static String a(byte param0) {
        String var1 = "";
        if (param0 < 85) {
            return (String) null;
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
        ck var13 = null;
        ck var14 = null;
        if (param5 != -26198) {
            field_j = (String) null;
        }
        int[] var16 = hk.field_l;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = hk.field_j;
        int var8 = hk.field_i;
        ck var9 = new ck(16, param1);
        var9.a();
        hk.d(0, 0, 16, param1, param3, param4);
        Object var10 = null;
        if (!(!param2)) {
            var13 = var9.c();
            var10 = var13;
            var13.a();
            hk.a(0, 0, 5, 0);
            hk.a(0, 1, 3, 0);
            hk.a(0, 2, 2, 0);
            hk.a(0, 3, 1, 0);
            hk.a(0, 4, 1, 0);
        }
        Object var11 = null;
        if (param0) {
            var14 = var9.c();
            var11 = var14;
            var14.a();
            hk.a(11, 0, 5, 0);
            hk.a(13, 1, 3, 0);
            hk.a(14, 2, 2, 0);
            hk.a(15, 3, 1, 0);
            hk.a(15, 4, 1, 0);
        }
        hk.a(var16, var7, var8);
        return new ck[]{null, null, null, (ck) (var10), var9, (ck) (var11), null, null, null};
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_k = null;
        field_b = null;
        field_j = null;
        if (param0 != -20007) {
            field_c = (String) null;
        }
    }

    final static void a(long param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            if (param1 < -100) {
              try {
                L0: {
                  Thread.sleep(param0);
                  break L0;
                }
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qe() {
        this.field_d = new byte[64];
        this.field_f = new long[8];
        this.field_o = 0;
        this.field_g = new long[8];
        this.field_l = new byte[32];
        this.field_i = new long[8];
        this.field_n = new long[8];
        this.field_m = 0;
        this.field_a = new long[8];
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
