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
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = client.field_A ? 1 : 0;
              var6 = new byte[24];
              var2 = var6;
              if (dj.field_cb != null) {
                try {
                  dj.field_cb.a(0L, (byte) -109);
                  dj.field_cb.a(var6, (byte) -76);
                  var3_int = 0;
                  L1: while (true) {
                    L2: {
                      if (-25 >= var3_int) {
                        break L2;
                      } else {
                        if (-1 == var2[var3_int]) {
                          var3_int++;
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var3_int < 24) {
                      break L1;
                    } else {
                      throw new IOException();
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  var4 = 0;
                  L3: while (true) {
                    if ((var4 ^ -1) <= -25) {
                      break L3;
                    } else {
                      var2[var4] = (byte)-1;
                      var4++;
                      continue L3;
                    }
                  }
                }
                param0.a(false, 24, var2, param1);
                break L0;
              } else {
                param0.a(false, 24, var2, param1);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        wl var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var10 = new wl(param0);
          var3 = var10.d((byte) -119);
          var5 = -11 / ((-4 - param1) / 59);
          var4 = var10.i(7553);
          if (var4 < 0) {
            break L0;
          } else {
            L1: {
              if (ad.field_u == 0) {
                break L1;
              } else {
                if (var4 > ad.field_u) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var3 == -1) {
              var18 = new byte[var4];
              var16 = var18;
              var14 = var16;
              var12 = var14;
              var6 = var12;
              var10.a(var18, 0, (byte) 126, var4);
              return var6;
            } else {
              L2: {
                var6_int = var10.i(7553);
                if (var6_int < 0) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == ad.field_u) {
                      break L3;
                    } else {
                      if (ad.field_u >= var6_int) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var17 = new byte[var6_int];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var7 = var11;
                    if (1 != var3) {
                      var8 = (Object) (Object) jf.field_g;
                      synchronized (var8) {
                        jf.field_g.a((byte) 111, var10, var17);
                      }
                      break L4;
                    } else {
                      int discarded$4 = td.a(var17, var6_int, param0, var4, 9);
                      break L4;
                    }
                  }
                  return var7;
                }
              }
              throw new RuntimeException();
            }
          }
        }
        throw new RuntimeException();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = "Create a free Account";
        field_g = "Accept";
    }
}
