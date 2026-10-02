/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh {
    private sk field_d;
    private int field_a;
    private int field_b;
    private sk field_c;

    final boolean a(byte[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        kj var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_d;
          synchronized (var5) {
            L1: {
              if (0 <= param3) {
                if (param3 <= this.field_a) {
                  if (param1 != -53) {
                    var8 = (kj) null;
                    jh.a((java.awt.Component) null, (d) null, false, (kj) null, false, -103);
                  }
                  var6 = this.a(255, param3, param2, param0, true) ? 1 : 0;
                  if (var6 == 0) {
                    var6 = this.a(255, param3, param2, param0, false) ? 1 : 0;
                  }
                  stackIn_9_0 = var6;
                  break L1;
                }
              }
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var5_ref);

          stackIn_14_1 = new StringBuilder().append("jh.A(");

          if (param0 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
        return stackIn_9_0 != 0;
    }

    final byte[] a(int param0, byte param1) {
        try {
            int var16 = 0;
            int incrementValue$0 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_11_0 = null;
            Object stackIn_23_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_56_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var3 = null;
            int var4_int = 0;
            IOException var4 = null;
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
            int var18 = 0;
            var18 = Geoblox.field_C;
            var3 = this.field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (~this.field_c.a((byte) 46) <= ~(long)(param0 * 6 + 6)) {
                    if (param1 > -14) {
                      this.field_d = (sk) null;
                    }
                    this.field_c.a(-128, (long)(6 * param0));
                    this.field_c.a(dj.field_F, 6, 0, 9868);
                    var4_int = (dj.field_F[2] & 255) + (((255 & dj.field_F[0]) << 16) + (dj.field_F[1] << 8 & 65280));
                    var5 = (dj.field_F[3] << 16 & 16711680) + (65280 & dj.field_F[4] << 8) + (255 & dj.field_F[5]);
                    if (var4_int >= 0) {
                      if (this.field_a >= var4_int) {
                        if (var5 > 0) {
                          if ((long)var5 <= this.field_d.a((byte) 46) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackIn_53_0 = (byte[]) (var6);

                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  this.field_d.a(0, (long)(520 * var5));
                                  var9 = -var7 + var4_int;
                                  if (65535 < param0) {
                                    if (510 < var9) {
                                      var9 = 510;
                                    }
                                    var14 = 10;
                                    this.field_d.a(dj.field_F, var9 + var14, 0, 9868);
                                    var10 = (255 & dj.field_F[3]) + ((65280 & dj.field_F[2] << 8) + (-16777216 & dj.field_F[0] << 24) + (16711680 & dj.field_F[1] << 16));
                                    var11 = (255 & dj.field_F[5]) + (65280 & dj.field_F[4] << 8);
                                    var13 = dj.field_F[9] & 255;
                                    var12 = ((dj.field_F[7] & 255) << 8) + ((16711680 & dj.field_F[6] << 16) + (dj.field_F[8] & 255));
                                  } else {
                                    var14 = 8;
                                    if (var9 > 512) {
                                      var9 = 512;
                                    }
                                    this.field_d.a(dj.field_F, var9 + var14, 0, 9868);
                                    var12 = (255 & dj.field_F[6]) + (((dj.field_F[4] & 255) << 16) + ((255 & dj.field_F[5]) << 8));
                                    var11 = (255 & dj.field_F[3]) + (dj.field_F[2] << 8 & 65280);
                                    var13 = 255 & dj.field_F[7];
                                    var10 = (dj.field_F[1] & 255) + ((dj.field_F[0] & 255) << 8);
                                  }
                                  if (var10 == param0) {
                                    if (var11 == var8) {
                                      if (this.field_b == var13) {
                                        if (var12 >= 0) {
                                          if (this.field_d.a((byte) 46) / 520L >= (long)var12) {
                                            var15 = var9 + var14;
                                            var8++;
                                            for (var16 = var14; var16 < var15; var16++) {
                                              incrementValue$0 = var7;
                                              var7++;
                                              var6[incrementValue$0] = dj.field_F[var16];
                                            }
                                            var5 = var12;
                                            continue L2;
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
                                    return null;
                                  }
                                } else {
                                  stackIn_23_0 = null;

                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackIn_11_0 = null;

                        decompiledRegionSelector0 = 1;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackIn_3_0 = null;

                    decompiledRegionSelector0 = 0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_56_0 = null;
                return (byte[]) ((Object) stackIn_56_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_3_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_11_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_23_0);
                  } else {
                    return stackIn_53_0;
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

    private final boolean a(int param0, int param1, int param2, byte[] param3, boolean param4) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_66_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
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
            var16 = Geoblox.field_C;
            try {
              var6 = this.field_d;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_d.a((byte) 46) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                        }
                      } else {
                        if (this.field_c.a((byte) 46) < (long)(6 + param2 * 6)) {
                          stackIn_6_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          this.field_c.a(param0 - 228, (long)(param2 * 6));
                          this.field_c.a(dj.field_F, 6, 0, 9868);
                          var7_int = (dj.field_F[5] & 255) + (((255 & dj.field_F[4]) << 8) + ((255 & dj.field_F[3]) << 16));
                          if (var7_int > 0) {
                            if (this.field_d.a((byte) 46) / 520L >= (long)var7_int) {
                              break L1;
                            }
                          }
                          stackIn_12_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      }
                    }
                    dj.field_F[3] = (byte)(var7_int >> 16);
                    dj.field_F[2] = (byte)param1;
                    dj.field_F[1] = (byte)(param1 >> 8);
                    if (param0 != 255) {
                      this.field_c = (sk) null;
                    }
                    dj.field_F[4] = (byte)(var7_int >> 8);
                    dj.field_F[5] = (byte)var7_int;
                    dj.field_F[0] = (byte)(param1 >> 16);
                    this.field_c.a(param0 - 380, (long)(param2 * 6));
                    this.field_c.a(6, 0, dj.field_F, false);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param1 > var8) {
                          L6: {
                            var10 = 0;
                            if (param4) {
                              this.field_d.a(param0 - 191, (long)(520 * var7_int));
                              if (65535 >= param2) {
                                try {
                                  this.field_d.a(dj.field_F, 8, 0, 9868);
                                  decompiledRegionSelector0 = 0;
                                } catch (java.io.EOFException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var14 = (EOFException) (Object) decompiledCaughtException;
                                  decompiledRegionSelector0 = 1;
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  var11 = ((255 & dj.field_F[0]) << 8) + (255 & dj.field_F[1]);
                                  var12 = (dj.field_F[3] & 255) + ((255 & dj.field_F[2]) << 8);
                                  var13 = 255 & dj.field_F[7];
                                  var10 = (dj.field_F[6] & 255) + ((65280 & dj.field_F[5] << 8) + (16711680 & dj.field_F[4] << 16));
                                } else {
                                  break L5;
                                }
                              } else {
                                try {
                                  this.field_d.a(dj.field_F, 10, 0, 9868);
                                  decompiledRegionSelector1 = 0;
                                } catch (java.io.EOFException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  var14 = (EOFException) (Object) decompiledCaughtException;
                                  decompiledRegionSelector1 = 1;
                                }
                                if (decompiledRegionSelector1 == 0) {
                                  var11 = (65280 & dj.field_F[2] << 8) + (((255 & dj.field_F[0]) << 24) + (((dj.field_F[1] & 255) << 16) + (255 & dj.field_F[3])));
                                  var13 = dj.field_F[9] & 255;
                                  var10 = (dj.field_F[8] & 255) + ((255 & dj.field_F[6]) << 16) + (65280 & dj.field_F[7] << 8);
                                  var12 = (dj.field_F[4] << 8 & 65280) + (255 & dj.field_F[5]);
                                } else {
                                  break L5;
                                }
                              }
                              if (var11 == param2) {
                                if (var9 == var12) {
                                  if (var13 == this.field_b) {
                                    if (var10 >= 0) {
                                      if (~(this.field_d.a((byte) 46) / 520L) <= ~(long)var10) {
                                        break L6;
                                      }
                                    }
                                    stackIn_42_0 = 0;

                                    decompiledRegionSelector2 = 3;
                                    break L0;
                                  }
                                }
                              }
                              stackIn_36_0 = 0;

                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          if (var10 == 0) {
                            param4 = false;
                            var10 = (int)((519L + this.field_d.a((byte) 46)) / 520L);
                            if (var10 == 0) {
                              var10++;
                            }
                            if (var7_int == var10) {
                              var10++;
                            }
                          }
                          if (512 >= -var8 + param1) {
                            var10 = 0;
                          }
                          if (param2 <= 65535) {
                            dj.field_F[4] = (byte)(var10 >> 16);
                            dj.field_F[2] = (byte)(var9 >> 8);
                            dj.field_F[0] = (byte)(param2 >> 8);
                            dj.field_F[7] = (byte)this.field_b;
                            dj.field_F[1] = (byte)param2;
                            dj.field_F[5] = (byte)(var10 >> 8);
                            dj.field_F[3] = (byte)var9;
                            dj.field_F[6] = (byte)var10;
                            this.field_d.a(-97, (long)(520 * var7_int));
                            this.field_d.a(8, 0, dj.field_F, false);
                            var11 = param1 - var8;
                            if (512 < var11) {
                              var11 = 512;
                            }
                            this.field_d.a(var11, var8, param3, false);
                            var8 = var8 + var11;
                          } else {
                            dj.field_F[6] = (byte)(var10 >> 16);
                            dj.field_F[5] = (byte)var9;
                            dj.field_F[2] = (byte)(param2 >> 8);
                            dj.field_F[9] = (byte)this.field_b;
                            dj.field_F[4] = (byte)(var9 >> 8);
                            dj.field_F[1] = (byte)(param2 >> 16);
                            dj.field_F[7] = (byte)(var10 >> 8);
                            dj.field_F[8] = (byte)var10;
                            dj.field_F[3] = (byte)param2;
                            dj.field_F[0] = (byte)(param2 >> 24);
                            this.field_d.a(73, (long)(var7_int * 520));
                            this.field_d.a(10, 0, dj.field_F, false);
                            var11 = param1 - var8;
                            if (510 < var11) {
                              var11 = 510;
                            }
                            this.field_d.a(var11, var8, param3, false);
                            var8 = var8 + var11;
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackIn_63_0 = 1;

                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_66_0 = 0;
                  return stackIn_66_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_63_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_71_0 = (RuntimeException) (var6_ref);

              stackIn_71_1 = new StringBuilder().append("jh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

              if (param3 == null) {
                stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                stackIn_72_2 = "null";
              } else {
                stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                stackIn_72_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param4).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    final static void a(java.awt.Component param0, d param1, boolean param2, kj param3, boolean param4, int param5) {
        qk.a(param5, param4, 10);
        fj.field_p = qk.a(param1, param0, 0, 22050);
        if (param2) {
            return;
        }
        try {
            oh.field_a = qk.a(param1, param0, 1, 1000);
            ge.field_d = new ob();
            oh.field_a.b(ge.field_d);
            uh.field_y = param3;
            wg.a(-15346, oc.field_c);
            ag.a(j.field_gb, (byte) -67);
            fj.field_p.b(param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    jh(int param0, sk param1, sk param2, int param3) {
        this.field_d = null;
        this.field_a = 65000;
        this.field_c = null;
        try {
            this.field_a = param3;
            this.field_d = param1;
            this.field_c = param2;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
