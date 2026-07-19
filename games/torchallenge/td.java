/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class td {
    private byte[] field_b;
    static String field_q;
    private int field_a;
    static int[] field_m;
    private long[] field_p;
    private int field_g;
    private long[] field_k;
    private long[] field_l;
    static int field_e;
    static String[] field_c;
    static String field_i;
    static int[][] field_j;
    static ka field_o;
    private byte[] field_d;
    private long[] field_h;
    static int field_n;
    private long[] field_f;

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], 128 >>> jh.a(this.field_g, 7));
              this.field_a = this.field_a + 1;
              if ((this.field_a ^ -1) < -33) {
                L2: while (true) {
                  if (-65 >= (this.field_a ^ -1)) {
                    this.b(-109);
                    this.field_a = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_a;
                    this.field_a = this.field_a + 1;
                    this.field_b[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 == -6) {
              L3: while (true) {
                if (32 <= this.field_a) {
                  he.a(this.field_d, 0, this.field_b, 32, 32);
                  this.b(-106);
                  var4_int = 0;
                  var5 = param2;
                  L4: while (true) {
                    if (-9 >= (var4_int ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_l[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> -1287773960);
                      param0[1 + var5] = (byte)(int)(var6 >>> 2069040560);
                      param0[var5 - -2] = (byte)(int)(var6 >>> -1496483608);
                      param0[3 + var5] = (byte)(int)(var6 >>> -1469387360);
                      param0[var5 + 4] = (byte)(int)(var6 >>> -1455521064);
                      param0[5 + var5] = (byte)(int)(var6 >>> 867249040);
                      param0[var5 - -6] = (byte)(int)(var6 >>> -1969291448);
                      param0[7 + var5] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  fieldTemp$3 = this.field_a;
                  this.field_a = this.field_a + 1;
                  this.field_b[fieldTemp$3] = (byte) 0;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("td.G(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_q = null;
        field_i = null;
        field_c = null;
        field_m = null;
        if (param0 != 0) {
            td.b((byte) 9);
        }
        field_j = (int[][]) null;
        field_o = null;
    }

    final static void b(byte param0) {
        ka var1 = null;
        ka var2 = null;
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        try {
            var1 = new ka(540, 140);
            ad.a(-32, var1);
            oc.c();
            qg.b();
            jc.field_c = 0;
            ef.a(3);
            var2 = var1.c();
            for (var3 = 0; 15 > var3; var3++) {
                var2.a(-2, -2, 16777215);
                qg.d(4, 4, 0, 0, 540, 140);
            }
            ul.field_k.d();
            var1.f(0, 0);
            if (param0 < 105) {
                field_q = (String) null;
            }
            ie.b((byte) -9);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "td.A(" + param0 + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 + -((int)param0 & 7);
            var7 = this.field_g & 7;
            if (param1 == 19668) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (0 > var11) {
                  L2: while (true) {
                    if ((param0 ^ -1L) >= -9L) {
                      L3: {
                        if (-1L > (param0 ^ -1L)) {
                          var8 = 255 & param2[var5_int] << var6;
                          this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], var8 >>> var7);
                          break L3;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (param0 + (long)var7 >= 8L) {
                          L5: {
                            this.field_g = this.field_g + (-var7 + 8);
                            param0 = param0 - (long)(8 + -var7);
                            this.field_a = this.field_a + 1;
                            if (512 != this.field_g) {
                              break L5;
                            } else {
                              this.b(-127);
                              this.field_g = 0;
                              this.field_a = 0;
                              break L5;
                            }
                          }
                          this.field_b[this.field_a] = (byte)jh.a(var8 << -var7 + 8, 255);
                          this.field_g = this.field_g + (int)param0;
                          break L4;
                        } else {
                          this.field_g = (int)((long)this.field_g + param0);
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var8 = param2[var5_int] << var6 & 255 | (param2[var5_int + 1] & 255) >>> 8 + -var6;
                        if ((var8 ^ -1) > -1) {
                          break L6;
                        } else {
                          if ((var8 ^ -1) > -257) {
                            L7: {
                              this.field_b[this.field_a] = (byte)p.a((int) this.field_b[this.field_a], var8 >>> var7);
                              this.field_g = this.field_g + (-var7 + 8);
                              this.field_a = this.field_a + 1;
                              if (-513 != (this.field_g ^ -1)) {
                                break L7;
                              } else {
                                this.b(-124);
                                this.field_g = 0;
                                this.field_a = 0;
                                break L7;
                              }
                            }
                            this.field_b[this.field_a] = (byte)jh.a(255, var8 << -var7 + 8);
                            param0 = param0 - 8L;
                            var5_int++;
                            this.field_g = this.field_g + var7;
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
                  var12 = var12 + ((255 & this.field_d[var11]) - -(255 & (int)var9));
                  this.field_d[var11] = (byte)var12;
                  var12 = var12 >>> 8;
                  var9 = var9 >>> 8;
                  var11--;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("td.F(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            if (param0 < -103) {
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) <= -9) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if ((var2 ^ -1) <= -9) {
                          return;
                        } else {
                          this.field_l[var2] = d.a(this.field_l[var2], d.a(this.field_k[var2], this.field_p[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if (8 <= var3) {
                          var3 = 0;
                          L5: while (true) {
                            if (var3 >= 8) {
                              this.field_h[0] = d.a(this.field_h[0], oh.field_f[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (var3 >= 8) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (8 <= var3) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      this.field_p[var3] = this.field_f[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  this.field_f[var3] = this.field_h[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if ((var7 ^ -1) <= -9) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      this.field_f[var3] = d.a(this.field_f[var3], oh.field_b[var7][jh.a(255, (int)(this.field_p[jh.a(var3 - var7, 7)] >>> var5))]);
                                      var7++;
                                      var5 -= 8;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_h[var3] = this.field_f[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          this.field_f[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (-9 >= (var4 ^ -1)) {
                              var3++;
                              continue L4;
                            } else {
                              this.field_f[var3] = d.a(this.field_f[var3], oh.field_b[var4][jh.a(255, (int)(this.field_h[jh.a(7, var3 + -var4)] >>> var5))]);
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
                  this.field_h[var2] = this.field_l[var2];
                  this.field_p[var2] = d.a(this.field_k[var2], this.field_l[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            this.field_k[var2] = d.a(ba.a((long)this.field_b[var3 + 7], 255L), d.a(d.a(ba.a((long)this.field_b[var3 - -5] << -177213104, 16711680L), d.a(ba.a((long)this.field_b[var3 - -4] << 1827251800, 4278190080L), d.a(ba.a(1095216660480L, (long)this.field_b[var3 + 3] << 596928672), d.a(d.a(ba.a(255L, (long)this.field_b[1 + var3]) << -1207532688, (long)this.field_b[var3] << 350345208), ba.a(255L, (long)this.field_b[var3 - -2]) << -406464600)))), ba.a(65280L, (long)this.field_b[var3 - -6] << 758147528)));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(String param0, Throwable param1, byte param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            mi var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            uj stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            uj stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            uj stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            String stackIn_17_5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            uj stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            uj stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            uj stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            var6 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L1;
                  } else {
                    var3_ref = fk.a(param1, -1);
                    break L1;
                  }
                }
                L2: {
                  if (param0 != null) {
                    L3: {
                      if (param1 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                cf.a(1, var3_ref);
                var3_ref = kl.a(var3_ref, "%3a", 0, ":");
                var3_ref = kl.a(var3_ref, "%40", 0, "@");
                var3_ref = kl.a(var3_ref, "%26", 0, "&");
                var7 = kl.a(var3_ref, "%23", 0, "#");
                if (null == li.field_O) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    if (param2 < -48) {
                      break L4;
                    } else {
                      td.c(-88);
                      break L4;
                    }
                  }
                  L5: {
                    stackOut_14_0 = u.field_a;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = li.field_O.getCodeBase();
                    stackOut_14_4 = new StringBuilder().append("clienterror.ws?c=").append(ae.field_k).append("&u=");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    if (ch.field_d == null) {
                      stackOut_16_0 = (uj) ((Object) stackIn_16_0);
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackOut_16_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackOut_16_5 = "" + je.field_a;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      break L5;
                    } else {
                      stackOut_15_0 = (uj) ((Object) stackIn_15_0);
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) ((Object) stackIn_15_3);
                      stackOut_15_4 = (StringBuilder) ((Object) stackIn_15_4);
                      stackOut_15_5 = ch.field_d;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      break L5;
                    }
                  }
                  var4 = ((uj) (Object) stackIn_17_0).a(new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + uj.field_j + "&v2=" + uj.field_n + "&e=" + var7), -123);
                  L6: while (true) {
                    if (var4.field_d != 0) {
                      L7: {
                        if ((var4.field_d ^ -1) != -2) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) (var4.field_g);
                          discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      c.a(51, 1L);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
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

    final static String a(long param0, byte param1) {
        cf.field_e.setTime(new Date(param0));
        int var3 = cf.field_e.get(7);
        int var4 = cf.field_e.get(5);
        int var5 = cf.field_e.get(2);
        int var6 = cf.field_e.get(1);
        int var7 = cf.field_e.get(11);
        if (param1 != -8) {
            field_n = -84;
        }
        int var8 = cf.field_e.get(12);
        int var9 = cf.field_e.get(13);
        return il.field_s[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + ui.field_h[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            this.field_d[var2] = (byte) 0;
        }
        this.field_b[0] = (byte)param0;
        this.field_g = 0;
        this.field_a = 0;
        for (var2 = 0; var2 < 8; var2++) {
            this.field_l[var2] = 0L;
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 20422) {
            break L0;
          } else {
            field_i = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (qf.field_a == null) {
              break L2;
            } else {
              if (!aj.field_c.b(668905488)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    td() {
        this.field_a = 0;
        this.field_b = new byte[64];
        this.field_p = new long[8];
        this.field_l = new long[8];
        this.field_k = new long[8];
        this.field_g = 0;
        this.field_d = new byte[32];
        this.field_h = new long[8];
        this.field_f = new long[8];
    }

    static {
        field_e = 0;
        field_j = new int[][]{new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}};
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
