/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    private tk field_g;
    static int field_f;
    static fe field_h;
    private int field_i;
    static String field_a;
    private tk field_d;
    private int field_c;
    static nc field_b;
    static String field_e;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Main.field_T;
        try {
          L0: {
            if (bk.field_c != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              bk.field_c = new String[22];
              bk.field_c[3] = td.field_a;
              bk.field_c[0] = tj.field_J;
              bk.field_c[5] = field_e;
              bk.field_c[15] = bl.field_g;
              bk.field_c[12] = ii.field_f;
              bk.field_c[9] = field_a;
              bk.field_c[13] = dd.field_e;
              bk.field_c[1] = sg.field_e;
              bk.field_c[14] = gg.field_c;
              bk.field_c[16] = q.field_f;
              bk.field_c[17] = db.field_b;
              bk.field_c[10] = tf.field_m;
              if (param0) {
                bk.field_c[2] = rf.field_e;
                bk.field_c[4] = lf.field_d;
                bk.field_c[11] = Main.field_y;
                bk.field_c[8] = pg.field_b;
                bk.field_c[7] = id.field_f;
                bk.field_c[6] = n.field_D;
                bk.field_c[20] = jk.field_d[2];
                bk.field_c[19] = jk.field_d[1];
                bk.field_c[21] = n.field_D;
                bk.field_c[18] = jk.field_d[0];
                var1_int = 0;
                L1: while (true) {
                  if (bk.field_c.length <= var1_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    bk.field_c[var1_int] = bk.field_c[var1_int].toUpperCase();
                    var1_int++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "hc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var5_ref = this.field_d;
            synchronized (var5_ref) {
              L1: {
                L2: {
                  if (0 > param2) {
                    break L2;
                  } else {
                    if (param2 > this.field_i) {
                      break L2;
                    } else {
                      if (param1 >= 51) {
                        L3: {
                          var6 = this.a(true, param0, param3, param2, (byte) 2) ? 1 : 0;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            var6 = this.a(false, param0, param3, param2, (byte) 2) ? 1 : 0;
                            break L3;
                          }
                        }
                        stackIn_11_0 = var6;
                        break L1;
                      } else {
                        stackIn_7_0 = 0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5_ref2);

            stackIn_16_1 = new StringBuilder().append("hc.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static wb[] a(int param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        wb[] var1 = new wb[cf.field_c];
        for (var2 = 0; var2 < cf.field_c; var2++) {
            var1[var2] = new wb(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], rd.field_k[var2], jf.field_i);
        }
        rh.d(param0 ^ -3343315);
        if (param0 != 3343272) {
            return (wb[]) null;
        }
        return var1;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -127) {
                break L1;
              } else {
                var3 = (String) null;
                hc.a((String) null, (byte) 7);
                break L1;
              }
            }
            stackIn_3_0 = gk.field_d.a((byte) 7, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("hc.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] a(byte param0, int param1) {
        try {
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var18 = 0;
            Object stackIn_3_0 = null;
            byte[] stackIn_7_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_57_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var4 = null;
            var18 = Main.field_T;
            var3_ref = this.field_d;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (((long)(6 + 6 * param1) ^ -1L) >= (this.field_g.b((byte) -95) ^ -1L)) {
                    this.field_g.a((long)(param1 * 6), 79);
                    this.field_g.a((byte) -118, fb.field_e, 0, 6);
                    if (param0 == 19) {
                      var4_int = (255 & fb.field_e[2]) + (((fb.field_e[0] & 255) << -818831280) - -(fb.field_e[1] << 3343272 & 65280));
                      var5 = (255 & fb.field_e[5]) + ((255 & fb.field_e[3]) << -283753712) - -((255 & fb.field_e[4]) << 1051356680);
                      if (-1 >= (var4_int ^ -1)) {
                        if (this.field_i >= var4_int) {
                          if (0 < var5) {
                            if (((long)var5 ^ -1L) >= (this.field_d.b((byte) -95) / 520L ^ -1L)) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackIn_54_0 = (byte[]) (var6);

                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  if (-1 != (var5 ^ -1)) {
                                    L2: {
                                      this.field_d.a((long)(520 * var5), 55);
                                      var9 = var4_int + -var7;
                                      if (param1 <= 65535) {
                                        L3: {
                                          var14 = 8;
                                          if (-513 > (var9 ^ -1)) {
                                            var9 = 512;
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                        this.field_d.a((byte) -118, fb.field_e, 0, var14 + var9);
                                        var12 = ((fb.field_e[4] & 255) << -1495617808) - -((255 & fb.field_e[5]) << 1597269000) + (fb.field_e[6] & 255);
                                        var11 = (fb.field_e[2] << -1609538872 & 65280) - -(fb.field_e[3] & 255);
                                        var13 = fb.field_e[7] & 255;
                                        var10 = (fb.field_e[1] & 255) + ((255 & fb.field_e[0]) << -310005464);
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 10;
                                          if ((var9 ^ -1) < -511) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        this.field_d.a((byte) -118, fb.field_e, 0, var9 - -var14);
                                        var10 = (255 & fb.field_e[3]) + ((fb.field_e[0] & 255) << -1236232904) - (-((fb.field_e[1] & 255) << -31962448) + -(65280 & fb.field_e[2] << 1475207688));
                                        var13 = fb.field_e[9] & 255;
                                        var12 = (16711680 & fb.field_e[6] << -722145616) + ((fb.field_e[7] << -1468322168 & 65280) + (fb.field_e[8] & 255));
                                        var11 = (255 & fb.field_e[5]) + (65280 & fb.field_e[4] << 905770952);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param1) {
                                      if (var11 == var8) {
                                        if (var13 == this.field_c) {
                                          if (-1 >= (var12 ^ -1)) {
                                            if ((long)var12 <= this.field_d.b((byte) -95) / 520L) {
                                              var15 = var14 + var9;
                                              var5 = var12;
                                              var8++;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  continue L1;
                                                } else {
                                                  incrementValue$2 = var7;
                                                  var7++;
                                                  var6[incrementValue$2] = fb.field_e[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackIn_48_0 = null;

                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    stackIn_25_0 = null;

                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              stackIn_19_0 = null;

                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      stackIn_7_0 = (byte[]) null;

                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_3_0 = null;

                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_57_0 = null;
                return (byte[]) ((Object) stackIn_57_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_3_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_7_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_19_0);
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return (byte[]) ((Object) stackIn_25_0);
                    } else {
                      if (decompiledRegionSelector0 == 4) {
                        return (byte[]) ((Object) stackIn_48_0);
                      } else {
                        return stackIn_54_0;
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_c;
    }

    hc(int param0, tk param1, tk param2, int param3) {
        this.field_g = null;
        this.field_d = null;
        this.field_i = 65000;
        try {
            this.field_c = param0;
            this.field_g = param2;
            this.field_i = param3;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_a = (String) null;
        }
        field_a = null;
        field_h = null;
        field_b = null;
        field_e = null;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, byte param4) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            Object var6 = null;
            RuntimeException var6_ref = null;
            int var7_int = 0;
            IOException var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            int var16 = 0;
            var16 = Main.field_T;
            try {
              var6 = this.field_d;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (!param0) {
                        var7_int = (int)((this.field_d.b((byte) -95) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (this.field_g.b((byte) -95) >= (long)(6 + param2 * 6)) {
                          L2: {
                            this.field_g.a((long)(param2 * 6), -65);
                            this.field_g.a((byte) -118, fb.field_e, 0, 6);
                            var7_int = (fb.field_e[3] << -154627664 & 16711680) + ((255 & fb.field_e[4]) << -724984504) + (255 & fb.field_e[5]);
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if ((long)var7_int <= this.field_d.b((byte) -95) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_11_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackIn_5_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    fb.field_e[2] = (byte)param3;
                    fb.field_e[5] = (byte)var7_int;
                    fb.field_e[1] = (byte)(param3 >> -161480696);
                    fb.field_e[0] = (byte)(param3 >> -2129914736);
                    fb.field_e[3] = (byte)(var7_int >> 1987771280);
                    fb.field_e[4] = (byte)(var7_int >> -871337784);
                    this.field_g.a((long)(6 * param2), -76);
                    this.field_g.a(fb.field_e, 0, 6, -1);
                    if (param4 == 2) {
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (param3 <= var8) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (param0) {
                                L6: {
                                  this.field_d.a((long)(var7_int * 520), -98);
                                  if ((param2 ^ -1) < -65536) {
                                    try {
                                      L7: {
                                        this.field_d.a((byte) -118, fb.field_e, 0, 10);
                                        decompiledRegionSelector0 = 0;
                                        break L7;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L8: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector0 = 1;
                                        break L8;
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var10 = (16711680 & fb.field_e[6] << 318418000) - -(fb.field_e[7] << -1520354904 & 65280) - -(fb.field_e[8] & 255);
                                      var13 = 255 & fb.field_e[9];
                                      var12 = (fb.field_e[5] & 255) + ((fb.field_e[4] & 255) << -1691588856);
                                      var11 = ((255 & fb.field_e[1]) << -1590617744) + ((255 & fb.field_e[0]) << 1428562040) - (-(fb.field_e[2] << -1631064504 & 65280) + -(fb.field_e[3] & 255));
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_d.a((byte) -118, fb.field_e, 0, 8);
                                        decompiledRegionSelector1 = 0;
                                        break L9;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L10: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector1 = 1;
                                        break L10;
                                      }
                                    }
                                    if (decompiledRegionSelector1 == 0) {
                                      var11 = ((255 & fb.field_e[0]) << -2074176664) + (fb.field_e[1] & 255);
                                      var12 = ((255 & fb.field_e[2]) << -1026058776) + (255 & fb.field_e[3]);
                                      var13 = fb.field_e[7] & 255;
                                      var10 = (fb.field_e[6] & 255) + ((fb.field_e[5] << 278414728 & 65280) + (16711680 & fb.field_e[4] << 1451688784));
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L11: {
                                  if (var11 != param2) {
                                    break L11;
                                  } else {
                                    if (var12 != var9) {
                                      break L11;
                                    } else {
                                      if (this.field_c != var13) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (0 > var10) {
                                            break L12;
                                          } else {
                                            if (this.field_d.b((byte) -95) / 520L < (long)var10) {
                                              break L12;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        stackIn_44_0 = 0;

                                        decompiledRegionSelector2 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                stackIn_38_0 = 0;

                                decompiledRegionSelector2 = 3;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                            L13: {
                              if (var10 == 0) {
                                L14: {
                                  var10 = (int)((this.field_d.b((byte) -95) - -519L) / 520L);
                                  param0 = false;
                                  if (-1 == (var10 ^ -1)) {
                                    var10++;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                if (var7_int == var10) {
                                  var10++;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            L15: {
                              if ((-var8 + param3 ^ -1) < -513) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if (65535 >= param2) {
                                L17: {
                                  fb.field_e[4] = (byte)(var10 >> 287224976);
                                  fb.field_e[5] = (byte)(var10 >> -293689592);
                                  fb.field_e[3] = (byte)var9;
                                  fb.field_e[6] = (byte)var10;
                                  fb.field_e[7] = (byte)this.field_c;
                                  fb.field_e[1] = (byte)param2;
                                  fb.field_e[0] = (byte)(param2 >> 1395767720);
                                  fb.field_e[2] = (byte)(var9 >> -1777890584);
                                  this.field_d.a((long)(520 * var7_int), 23);
                                  this.field_d.a(fb.field_e, 0, 8, param4 ^ -3);
                                  var11 = param3 - var8;
                                  if (var11 <= 512) {
                                    break L17;
                                  } else {
                                    var11 = 512;
                                    break L17;
                                  }
                                }
                                this.field_d.a(param1, var8, var11, -1);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  fb.field_e[5] = (byte)var9;
                                  fb.field_e[2] = (byte)(param2 >> -566601848);
                                  fb.field_e[9] = (byte)this.field_c;
                                  fb.field_e[3] = (byte)param2;
                                  fb.field_e[1] = (byte)(param2 >> 1373882832);
                                  fb.field_e[4] = (byte)(var9 >> -1266986328);
                                  fb.field_e[8] = (byte)var10;
                                  fb.field_e[7] = (byte)(var10 >> 1957470600);
                                  fb.field_e[6] = (byte)(var10 >> 990672816);
                                  fb.field_e[0] = (byte)(param2 >> 488200888);
                                  this.field_d.a((long)(var7_int * 520), 108);
                                  this.field_d.a(fb.field_e, 0, 10, -1);
                                  var11 = param3 - var8;
                                  if ((var11 ^ -1) < -511) {
                                    var11 = 510;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                this.field_d.a(param1, var8, var11, -1);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var9++;
                            var7_int = var10;
                            continue L3;
                          }
                        }
                        stackIn_66_0 = 1;

                        decompiledRegionSelector2 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_18_0 = 0;

                      decompiledRegionSelector2 = 2;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_69_0 = 0;
                  return stackIn_69_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_5_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_11_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_18_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_38_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 4) {
                          return stackIn_44_0 != 0;
                        } else {
                          return stackIn_66_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_74_0 = (RuntimeException) (var6_ref);

                stackIn_74_1 = new StringBuilder().append("hc.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackIn_75_2 = "null";
                  break L19;
                } else {
                  stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackIn_75_2 = "{...}";
                  break L19;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Achievements";
        field_f = -1;
        field_h = new fe(2);
        field_b = new nc();
        field_e = "Instructions";
    }
}
