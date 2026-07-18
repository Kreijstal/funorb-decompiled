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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Main.field_T;
        try {
          L0: {
            if (bk.field_c != null) {
              return;
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
                  break L0;
                } else {
                  bk.field_c[var1_int] = bk.field_c[var1_int].toUpperCase();
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "hc.B(" + true + ')');
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          var5_ref = (Object) (Object) ((hc) this).field_d;
          synchronized (var5_ref) {
            L0: {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (param2 > ((hc) this).field_i) {
                    break L1;
                  } else {
                    if (param1 >= 51) {
                      L2: {
                        int discarded$6 = 2;
                        var6 = this.a(true, param0, param3, param2) ? 1 : 0;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          int discarded$7 = 2;
                          var6 = this.a(false, param0, param3, param2) ? 1 : 0;
                          break L2;
                        }
                      }
                      stackOut_10_0 = var6;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    }
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5_ref2;
            stackOut_14_1 = new StringBuilder().append("hc.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static wb[] a() {
        int var2 = 0;
        int var3 = Main.field_T;
        wb[] var1 = new wb[cf.field_c];
        for (var2 = 0; var2 < cf.field_c; var2++) {
            var1[var2] = new wb(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], rd.field_k[var2], jf.field_i);
        }
        rh.d(-123);
        return var1;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -127) {
                break L1;
              } else {
                var3 = null;
                byte[] discarded$2 = hc.a((String) null, (byte) 7);
                break L1;
              }
            }
            stackOut_2_0 = gk.field_d.a((byte) 7, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hc.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] a(byte param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            Object stackIn_48_0 = null;
            Object stackIn_49_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_48_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_56_0 = null;
            var18 = Main.field_T;
            var3 = (Object) (Object) ((hc) this).field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + 6 * param1) >= ~((hc) this).field_g.b((byte) -95)) {
                    ((hc) this).field_g.a((long)(param1 * 6), 79);
                    ((hc) this).field_g.a((byte) -118, fb.field_e, 0, 6);
                    if (param0 == 19) {
                      var4_int = (255 & fb.field_e[2]) + (((fb.field_e[0] & 255) << 16) - -(fb.field_e[1] << 8 & 65280));
                      var5 = (255 & fb.field_e[5]) + ((255 & fb.field_e[3]) << 16) - -((255 & fb.field_e[4]) << 8);
                      if (var4_int >= 0) {
                        if (((hc) this).field_i >= var4_int) {
                          if (0 < var5) {
                            if (~(long)var5 >= ~(((hc) this).field_d.b((byte) -95) / 520L)) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) var6;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      ((hc) this).field_d.a((long)(520 * var5), 55);
                                      var9 = var4_int + -var7;
                                      if (param1 <= 65535) {
                                        L3: {
                                          var14 = 8;
                                          if (var9 > 512) {
                                            var9 = 512;
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        }
                                        ((hc) this).field_d.a((byte) -118, fb.field_e, 0, var14 + var9);
                                        var12 = ((fb.field_e[4] & 255) << 16) - -((255 & fb.field_e[5]) << 8) + (fb.field_e[6] & 255);
                                        var11 = (fb.field_e[2] << 8 & 65280) - -(fb.field_e[3] & 255);
                                        var13 = fb.field_e[7] & 255;
                                        var10 = (fb.field_e[1] & 255) + ((255 & fb.field_e[0]) << 8);
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 10;
                                          if (var9 > 510) {
                                            var9 = 510;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        ((hc) this).field_d.a((byte) -118, fb.field_e, 0, var9 - -var14);
                                        var10 = (255 & fb.field_e[3]) + ((fb.field_e[0] & 255) << 24) - (-((fb.field_e[1] & 255) << 16) + -(65280 & fb.field_e[2] << 8));
                                        var13 = fb.field_e[9] & 255;
                                        var12 = (16711680 & fb.field_e[6] << 16) + ((fb.field_e[7] << 8 & 65280) + (fb.field_e[8] & 255));
                                        var11 = (255 & fb.field_e[5]) + (65280 & fb.field_e[4] << 8);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param1) {
                                      if (var11 == var8) {
                                        if (var13 == ((hc) this).field_c) {
                                          if (var12 >= 0) {
                                            if ((long)var12 <= ((hc) this).field_d.b((byte) -95) / 520L) {
                                              var15 = var14 + var9;
                                              var5 = var12;
                                              var8++;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  continue L1;
                                                } else {
                                                  int incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = fb.field_e[var16];
                                                  var16++;
                                                  continue L5;
                                                }
                                              }
                                            } else {
                                              stackOut_47_0 = null;
                                              stackIn_48_0 = stackOut_47_0;
                                              stackOut_48_0 = stackIn_48_0;
                                              stackIn_49_0 = stackOut_48_0;
                                              return (byte[]) (Object) stackIn_49_0;
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
                                    stackOut_24_0 = null;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackOut_25_0 = stackIn_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return (byte[]) (Object) stackIn_26_0;
                                  }
                                }
                              }
                            } else {
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
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
                      stackOut_6_0 = null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      return (byte[]) (Object) stackIn_8_0;
                    }
                  } else {
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    return (byte[]) (Object) stackIn_4_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) (Object) stackIn_57_0;
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((hc) this).field_c;
    }

    hc(int param0, tk param1, tk param2, int param3) {
        ((hc) this).field_g = null;
        ((hc) this).field_d = null;
        ((hc) this).field_i = 65000;
        try {
            ((hc) this).field_c = param0;
            ((hc) this).field_g = param2;
            ((hc) this).field_i = param3;
            ((hc) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b() {
        field_a = null;
        field_h = null;
        field_b = null;
        field_e = null;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3) {
        try {
            Object var6 = null;
            RuntimeException var6_ref = null;
            Object var6_ref2 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var16 = Main.field_T;
            try {
              var6_ref2 = (Object) (Object) ((hc) this).field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param0) {
                        var7_int = (int)((((hc) this).field_d.b((byte) -95) + 519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (((hc) this).field_g.b((byte) -95) >= (long)(6 + param2 * 6)) {
                          L2: {
                            ((hc) this).field_g.a((long)(param2 * 6), -65);
                            ((hc) this).field_g.a((byte) -118, fb.field_e, 0, 6);
                            var7_int = (fb.field_e[3] << 16 & 16711680) + ((255 & fb.field_e[4]) << 8) + (255 & fb.field_e[5]);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((hc) this).field_d.b((byte) -95) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0 != 0;
                        }
                      }
                    }
                    fb.field_e[2] = (byte)param3;
                    fb.field_e[5] = (byte)var7_int;
                    fb.field_e[1] = (byte)(param3 >> 8);
                    fb.field_e[0] = (byte)(param3 >> 16);
                    fb.field_e[3] = (byte)(var7_int >> 16);
                    fb.field_e[4] = (byte)(var7_int >> 8);
                    ((hc) this).field_g.a((long)(6 * param2), -76);
                    ((hc) this).field_g.a(fb.field_e, 0, 6, -1);
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
                                ((hc) this).field_d.a((long)(var7_int * 520), -98);
                                if (param2 > 65535) {
                                  try {
                                    L7: {
                                      ((hc) this).field_d.a((byte) -118, fb.field_e, 0, 10);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var10 = (16711680 & fb.field_e[6] << 16) - -(fb.field_e[7] << 8 & 65280) - -(fb.field_e[8] & 255);
                                    var13 = 255 & fb.field_e[9];
                                    var12 = (fb.field_e[5] & 255) + ((fb.field_e[4] & 255) << 8);
                                    var11 = ((255 & fb.field_e[1]) << 16) + ((255 & fb.field_e[0]) << 24) - (-(fb.field_e[2] << 8 & 65280) + -(fb.field_e[3] & 255));
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((hc) this).field_d.a((byte) -118, fb.field_e, 0, 8);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = ((255 & fb.field_e[0]) << 8) + (fb.field_e[1] & 255);
                                    var12 = ((255 & fb.field_e[2]) << 8) + (255 & fb.field_e[3]);
                                    var13 = fb.field_e[7] & 255;
                                    var10 = (fb.field_e[6] & 255) + ((fb.field_e[5] << 8 & 65280) + (16711680 & fb.field_e[4] << 16));
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
                                    if (((hc) this).field_c != var13) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (0 > var10) {
                                          break L12;
                                        } else {
                                          if (((hc) this).field_d.b((byte) -95) / 520L < (long)var10) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_42_0 = 0;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackOut_43_0 = stackIn_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      return stackIn_44_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_36_0 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              stackOut_37_0 = stackIn_37_0;
                              stackIn_38_0 = stackOut_37_0;
                              return stackIn_38_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var10 == 0) {
                              L14: {
                                var10 = (int)((((hc) this).field_d.b((byte) -95) - -519L) / 520L);
                                param0 = false;
                                if (var10 == 0) {
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
                            if (-var8 + param3 > 512) {
                              break L15;
                            } else {
                              var10 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (65535 >= param2) {
                              L17: {
                                fb.field_e[4] = (byte)(var10 >> 16);
                                fb.field_e[5] = (byte)(var10 >> 8);
                                fb.field_e[3] = (byte)var9;
                                fb.field_e[6] = (byte)var10;
                                fb.field_e[7] = (byte)((hc) this).field_c;
                                fb.field_e[1] = (byte)param2;
                                fb.field_e[0] = (byte)(param2 >> 8);
                                fb.field_e[2] = (byte)(var9 >> 8);
                                ((hc) this).field_d.a((long)(520 * var7_int), 23);
                                ((hc) this).field_d.a(fb.field_e, 0, 8, -1);
                                var11 = param3 - var8;
                                if (var11 <= 512) {
                                  break L17;
                                } else {
                                  var11 = 512;
                                  break L17;
                                }
                              }
                              ((hc) this).field_d.a(param1, var8, var11, -1);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                fb.field_e[5] = (byte)var9;
                                fb.field_e[2] = (byte)(param2 >> 8);
                                fb.field_e[9] = (byte)((hc) this).field_c;
                                fb.field_e[3] = (byte)param2;
                                fb.field_e[1] = (byte)(param2 >> 16);
                                fb.field_e[4] = (byte)(var9 >> 8);
                                fb.field_e[8] = (byte)var10;
                                fb.field_e[7] = (byte)(var10 >> 8);
                                fb.field_e[6] = (byte)(var10 >> 16);
                                fb.field_e[0] = (byte)(param2 >> 24);
                                ((hc) this).field_d.a((long)(var7_int * 520), 108);
                                ((hc) this).field_d.a(fb.field_e, 0, 10, -1);
                                var11 = param3 - var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((hc) this).field_d.a(param1, var8, var11, -1);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L3;
                        }
                      }
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      stackOut_65_0 = stackIn_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  return stackIn_68_0 != 0;
                }
                return stackIn_66_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) var6_ref;
                stackOut_71_1 = new StringBuilder().append("hc.E(").append(param0).append(',');
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param1 == null) {
                  stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                  stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L19;
                } else {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L19;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param2 + ',' + param3 + ',' + 2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achievements";
        field_f = -1;
        field_h = new fe(2);
        field_b = new nc();
        field_e = "Instructions";
    }
}
