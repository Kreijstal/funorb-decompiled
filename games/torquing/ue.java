/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_e;
    private long field_d;
    static t[] field_c;
    static int field_h;
    static t field_f;
    static t field_b;
    private RandomAccessFile field_a;
    static si field_g;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException var5 = null;
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
            if (~((ue) this).field_e <= ~((long)param0 + ((ue) this).field_d)) {
              L1: {
                ((ue) this).field_a.write(param3, param2, param0);
                ((ue) this).field_d = ((ue) this).field_d + (long)param0;
                if (param1 == 2) {
                  break L1;
                } else {
                  ue.a(-61, 120);
                  break L1;
                }
              }
              break L0;
            } else {
              ((ue) this).field_a.seek(((ue) this).field_e);
              ((ue) this).field_a.write(1);
              throw new EOFException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ue.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        var23 = Torquing.field_u;
        try {
          L0: {
            pl.b(param4, param0 ^ -15867);
            var7_int = 0;
            var8 = -param5 + param4;
            if (param0 == -15788) {
              L1: {
                if (var8 < 0) {
                  var8 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = param4;
                var10 = -param4;
                var11 = var8;
                var12 = -var8;
                var13 = -1;
                if (j.field_q > param2) {
                  break L2;
                } else {
                  if (param2 > qk.field_p) {
                    break L2;
                  } else {
                    var39 = qd.field_a[param2];
                    var16 = ln.a(qg.field_z, kn.field_e, -param4 + param1, 97);
                    var17 = ln.a(qg.field_z, kn.field_e, param1 - -param4, 114);
                    var18 = ln.a(qg.field_z, kn.field_e, -var8 + param1, 88);
                    var19 = ln.a(qg.field_z, kn.field_e, var8 + param1, param0 + 15882);
                    di.a(var16, (byte) -125, param3, var39, var18);
                    di.a(var18, (byte) -114, param6, var39, var19);
                    di.a(var19, (byte) 108, param3, var39, var17);
                    break L2;
                  }
                }
              }
              var14 = -1;
              L3: while (true) {
                if (var7_int >= var9) {
                  break L0;
                } else {
                  L4: {
                    var13 += 2;
                    var14 += 2;
                    var12 = var12 + var14;
                    var10 = var10 + var13;
                    if (var12 < 0) {
                      break L4;
                    } else {
                      if (var11 < 1) {
                        break L4;
                      } else {
                        var11--;
                        vc.field_a[var11] = var7_int;
                        var12 = var12 - (var11 << 1);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var7_int++;
                    if (var10 < 0) {
                      break L5;
                    } else {
                      var9--;
                      var10 = var10 - (var9 << 1);
                      var15 = param2 + -var9;
                      var16 = param2 + var9;
                      if (var16 < j.field_q) {
                        break L5;
                      } else {
                        if (qk.field_p >= var15) {
                          if (~var8 >= ~var9) {
                            L6: {
                              var17 = ln.a(qg.field_z, kn.field_e, param1 + var7_int, param0 ^ -15853);
                              var18 = ln.a(qg.field_z, kn.field_e, -var7_int + param1, 118);
                              if (qk.field_p < var16) {
                                break L6;
                              } else {
                                di.a(var18, (byte) 76, param3, qd.field_a[var16], var17);
                                break L6;
                              }
                            }
                            if (j.field_q > var15) {
                              break L5;
                            } else {
                              di.a(var18, (byte) 15, param3, qd.field_a[var15], var17);
                              break L5;
                            }
                          } else {
                            L7: {
                              var17 = vc.field_a[var9];
                              var18 = ln.a(qg.field_z, kn.field_e, var7_int + param1, 119);
                              var19 = ln.a(qg.field_z, kn.field_e, param1 + -var7_int, param0 ^ -15855);
                              var20 = ln.a(qg.field_z, kn.field_e, var17 + param1, 95);
                              var21 = ln.a(qg.field_z, kn.field_e, -var17 + param1, 96);
                              if (var16 <= qk.field_p) {
                                var40 = qd.field_a[var16];
                                di.a(var19, (byte) -111, param3, var40, var21);
                                di.a(var21, (byte) -94, param6, var40, var20);
                                di.a(var20, (byte) 33, param3, var40, var18);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if (~var15 <= ~j.field_q) {
                              var41 = qd.field_a[var15];
                              di.a(var19, (byte) -93, param3, var41, var21);
                              di.a(var21, (byte) 107, param6, var41, var20);
                              di.a(var20, (byte) -95, param3, var41, var18);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L8: {
                    var15 = param2 - var7_int;
                    var16 = var7_int + param2;
                    if (~var16 > ~j.field_q) {
                      break L8;
                    } else {
                      if (~qk.field_p <= ~var15) {
                        var17 = var9 + param1;
                        var18 = param1 - var9;
                        if (kn.field_e > var17) {
                          break L8;
                        } else {
                          if (qg.field_z < var18) {
                            break L8;
                          } else {
                            var17 = ln.a(qg.field_z, kn.field_e, var17, 94);
                            var18 = ln.a(qg.field_z, kn.field_e, var18, 118);
                            if (var7_int < var8) {
                              L9: {
                                if (~var7_int >= ~var11) {
                                  stackOut_41_0 = var11;
                                  stackIn_42_0 = stackOut_41_0;
                                  break L9;
                                } else {
                                  stackOut_40_0 = vc.field_a[var7_int];
                                  stackIn_42_0 = stackOut_40_0;
                                  break L9;
                                }
                              }
                              L10: {
                                var19 = stackIn_42_0;
                                var20 = ln.a(qg.field_z, kn.field_e, param1 + var19, 100);
                                var21 = ln.a(qg.field_z, kn.field_e, param1 - var19, 81);
                                if (~var16 >= ~qk.field_p) {
                                  var42 = qd.field_a[var16];
                                  di.a(var18, (byte) -103, param3, var42, var21);
                                  di.a(var21, (byte) -115, param6, var42, var20);
                                  di.a(var20, (byte) -116, param3, var42, var17);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (j.field_q > var15) {
                                break L8;
                              } else {
                                var43 = qd.field_a[var15];
                                di.a(var18, (byte) 4, param3, var43, var21);
                                di.a(var21, (byte) -5, param6, var43, var20);
                                di.a(var20, (byte) -95, param3, var43, var17);
                                break L8;
                              }
                            } else {
                              L11: {
                                if (~qk.field_p > ~var16) {
                                  break L11;
                                } else {
                                  di.a(var18, (byte) 51, param3, qd.field_a[var16], var17);
                                  break L11;
                                }
                              }
                              if (j.field_q > var15) {
                                break L8;
                              } else {
                                di.a(var18, (byte) 71, param3, qd.field_a[var15], var17);
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  }
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var7, "ue.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 26 % ((param0 - 16) / 52);
        if (!(null == ((ue) this).field_a)) {
            ((ue) this).field_a.close();
            ((ue) this).field_a = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        int var1 = -70 % ((-19 - param0) / 59);
        field_b = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ue) this).field_a)) {
            System.out.println("");
            ((ue) this).a((byte) -89);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((ue) this).field_a.read(param2, param1, param0);
              if (0 >= var5_int) {
                break L1;
              } else {
                ((ue) this).field_d = ((ue) this).field_d + (long)var5_int;
                break L1;
              }
            }
            if (param3 == 15389) {
              stackOut_5_0 = var5_int;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 40;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ue.C(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1) {
        if (param0 != -16513) {
            ue.a(28, -38, 8, -108, 43, -40, 73);
        }
        int discarded$0 = 0;
        int discarded$1 = sh.b();
    }

    final void a(int param0, long param1) throws IOException {
        ((ue) this).field_a.seek(param1);
        if (param0 != -2) {
            return;
        }
        ((ue) this).field_d = param1;
    }

    final long b(byte param0) throws IOException {
        int var2 = 108 % ((param0 - -8) / 56);
        return ((ue) this).field_a.length();
    }

    ue(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((ue) this).field_a = new RandomAccessFile(param0, param1);
            ((ue) this).field_e = param2;
            ((ue) this).field_d = 0L;
            var5_int = ((ue) this).field_a.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ue) this).field_a.seek(0L);
                    ((ue) this).field_a.write(var5_int);
                }
            }
            ((ue) this).field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
