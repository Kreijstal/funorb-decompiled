/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    static String field_g;
    static vj field_b;
    static String field_f;
    static String field_a;
    static int field_c;
    static int field_d;
    static w field_e;

    final static int a(int param0) {
        if (param0 != 1) {
            return -83;
        }
        return ql.field_c;
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 != 28180) {
            return;
        }
        field_a = null;
    }

    final static void a(wl param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (dj.field_cb != null) {
                    try {
                      L2: {
                        dj.field_cb.a(0L, (byte) -109);
                        dj.field_cb.a(var6, (byte) -76);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (-25 >= (var3_int ^ -1)) {
                              break L4;
                            } else {
                              if (-1 == (var2[var3_int] ^ -1)) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int < 24) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if ((var4 ^ -1) <= -25) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(false, 24, var2, param1);
                    break L1;
                  } else {
                    param0.a(false, 24, var2, param1);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("i.A(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        int var6_int = 0;
        byte[] var7 = null;
        Object var8 = null;
        wl var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              var10 = new wl(param0);
              var3 = var10.d((byte) -119);
              var5 = -11 / ((-4 - param1) / 59);
              var4 = var10.i(7553);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (ad.field_u == 0) {
                    break L2;
                  } else {
                    if (var4 > ad.field_u) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == 0) {
                  var14 = new byte[var4];
                  var12 = var14;
                  var6 = var12;
                  var10.a(var14, 0, (byte) 126, var4);
                  stackIn_21_0 = (byte[]) (var6);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var6_int = var10.i(7553);
                    if (var6_int < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (ad.field_u ^ -1)) {
                          break L4;
                        } else {
                          if (ad.field_u >= var6_int) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var13 = new byte[var6_int];
                        var11 = var13;
                        var7 = var11;
                        if (1 != var3) {
                          var8 = jf.field_g;
                          synchronized (var8) {
                            L6: {
                              jf.field_g.a((byte) 111, var10, var13);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          td.a(var13, var6_int, param0, var4, 9);
                          break L5;
                        }
                      }
                      stackIn_19_0 = (byte[]) (var7);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("i.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Create a free Account";
        field_g = "Accept";
    }
}
