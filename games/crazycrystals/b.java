/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class b {
    static int field_a;
    private be field_c;
    private int field_f;
    private ug field_e;
    static String field_b;
    static String field_d;
    private int field_g;

    private final void a(int param0, ib param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 62) {
                break L1;
              } else {
                this.a((Object) null, -109, (byte) 8, -120L);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                param1.a(false);
                param1.a(1);
                this.field_g = this.field_g + param1.field_n;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("b.D(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static Vector a(int param0, InputStream param1, String[] param2) throws IOException {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Vector var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        f[][] var12 = null;
        f var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        DataInputStream var17 = null;
        String var18 = null;
        String var19 = null;
        Vector stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Vector stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var16 = CrazyCrystals.field_B;
        try {
          L0: {
            var17 = new DataInputStream(param1);
            var4 = var17.readByte();
            var5 = var17.readShort();
            var6 = new Vector();
            var7 = param0;
            L1: while (true) {
              if (var5 <= var7) {
                stackOut_26_0 = (Vector) (var6);
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                var18 = sb.a(1, var17);
                var8 = var18;
                var9 = var17.readUnsignedByte();
                var10 = var17.readInt();
                var11 = var17.readInt();
                var12 = new f[var11 - -2][2 + var10];
                var13 = ff.a(0, 0, 1, var4, var17);
                var14 = 0;
                L2: while (true) {
                  if (var14 >= 2 + var10) {
                    var14 = 1;
                    L3: while (true) {
                      if (1 + var11 <= var14) {
                        var14 = 0;
                        L4: while (true) {
                          if (var14 >= 2 + var10) {
                            L5: {
                              L6: {
                                if (param2 != null) {
                                  if (-1 != (var18.length() ^ -1)) {
                                    L7: {
                                      if (ul.field_g != 0) {
                                        break L7;
                                      } else {
                                        if (!param2[var7].equals(var18)) {
                                          throw new IllegalStateException(Integer.toString(var7));
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var19 = param2[var7];
                                    var8 = var19;
                                    if ((go.field_l.a(var19) ^ -1) < -147) {
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    var6.addElement((Object) null);
                                    break L5;
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              var6.addElement(new kb(var12, var8, var9));
                              break L5;
                            }
                            var7++;
                            continue L1;
                          } else {
                            var12[1 + var11][var14] = var13;
                            var14++;
                            continue L4;
                          }
                        }
                      } else {
                        var12[var14][0] = var13;
                        var15 = 1;
                        L8: while (true) {
                          if (var10 + 1 <= var15) {
                            var12[var14][var10 - -1] = var13;
                            var14++;
                            continue L3;
                          } else {
                            var12[var14][var15] = ff.a(var4, var15, oe.a(param0, 1), var14, var17);
                            var15++;
                            continue L8;
                          }
                        }
                      }
                    }
                  } else {
                    var12[0][var14] = var13;
                    var14++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("b.H(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_27_0;
    }

    final Object a(int param0, long param1) {
        qd var6 = null;
        ib var7 = (ib) ((Object) this.field_e.a(param1, -114));
        if (var7 == null) {
            return null;
        }
        if (param0 < 83) {
            field_b = (String) null;
        }
        Object var5 = var7.f(-18088);
        if (!(var5 != null)) {
            var7.a(false);
            var7.a(1);
            this.field_g = this.field_g + var7.field_n;
            return null;
        }
        if (!var7.h(-964)) {
            this.field_c.a((byte) 8, var7);
            var7.field_k = 0L;
        } else {
            var6 = new qd(var5, var7.field_n);
            this.field_e.a(var7.field_e, (byte) 42, var6);
            this.field_c.a((byte) 124, var6);
            ((ib) ((Object) var6)).field_k = 0L;
            var7.a(false);
            var7.a(1);
        }
        return var5;
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        ib var6 = null;
        qd var6_ref = null;
        int var7 = CrazyCrystals.field_B;
        try {
            if (param2 < 46) {
                field_d = (String) null;
            }
            if (param1 > this.field_f) {
                throw new IllegalStateException();
            }
            this.a(param3, -70);
            this.field_g = this.field_g - param1;
            while (this.field_g < 0) {
                var6 = (ib) ((Object) this.field_c.a(30244));
                this.a(66, var6);
            }
            var6_ref = new qd(param0, param1);
            this.field_e.a(param3, (byte) 42, var6_ref);
            this.field_c.a((byte) 119, var6_ref);
            ((ib) ((Object) var6_ref)).field_k = 0L;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "b.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = CrazyCrystals.field_B;
          if (param10 == 44) {
            break L0;
          } else {
            b.a(127);
            break L0;
          }
        }
        L1: {
          if (param11 <= param13) {
            if (param3 <= param13) {
              if (param3 <= param11) {
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                break L1;
              } else {
                cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                break L1;
              }
            } else {
              cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
              break L1;
            }
          } else {
            if (param3 <= param11) {
              if (param3 <= param13) {
                cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                break L1;
              } else {
                cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
                break L1;
              }
            } else {
              cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, param15);
              break L1;
            }
          }
        }
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_a = -27;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == oi.field_c) {
              break L2;
            } else {
              if (!gj.field_k.a(-2)) {
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

    final static byte[] a(byte[] param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        ng var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new ng(param0);
              var3 = var9.h(255);
              var4 = var9.b((byte) 127);
              if (param1 < (var4 ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (0 == w.field_g) {
                    break L2;
                  } else {
                    if (w.field_g >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.b((byte) 126);
                    if (-1 < (var5 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (w.field_g ^ -1)) {
                          break L4;
                        } else {
                          if (w.field_g < var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (var3 == 1) {
                          discarded$1 = di.a(var13, var5, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = qg.field_s;
                          synchronized (var7) {
                            L6: {
                              qg.field_s.a(var13, var9, -19515);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) (var6);
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var4, var12, (byte) -58, 0);
                  stackOut_6_0 = (byte[]) (var5_ref_byte__);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("b.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_21_0;
        }
    }

    private final void a(long param0, int param1) {
        ib var4 = (ib) ((Object) this.field_e.a(param0, -117));
        this.a(98, var4);
        if (param1 > -66) {
            b.a(6, -67, 121, -107, 106, -115, -66, 114, 26, -103, -124, 35, 74, -126, 34, 60);
        }
    }

    final void a(Object param0, int param1, long param2) {
        try {
            this.a(param0, param1, (byte) 60, param2);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "b.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Select Level";
        field_d = "Arcade Levels";
    }
}
