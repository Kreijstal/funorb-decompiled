/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa {
    static fg field_a;
    static fr field_b;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 >= (param1 ^ -1)) {
                break L1;
              } else {
                param2 = param2 + param1;
                param1 = 0;
                break L1;
              }
            }
            L2: {
              if ((param4 ^ -1) > -1) {
                param0 = param0 + param4;
                param4 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (gf.field_k >= param0 + param4) {
                break L3;
              } else {
                param0 = gf.field_k + -param4;
                break L3;
              }
            }
            L4: {
              if (gf.field_b >= param2 + param1) {
                break L4;
              } else {
                param2 = gf.field_b - param1;
                break L4;
              }
            }
            param1--;
            var5_int = param0 + param4;
            var6 = param4;
            var7 = -15 % ((6 - param3) / 48);
            L5: while (true) {
              if (var5_int <= var6) {
                break L0;
              } else {
                var8 = param1 + gf.field_b * var6;
                var9 = param2;
                L6: while (true) {
                  if ((var9 ^ -1) >= -1) {
                    var6++;
                    continue L5;
                  } else {
                    var8++;
                    var10 = gf.field_h[var8];
                    var10 = (var10 >> -1233052606 & 4144959) + (8355711 & var10 >> -80429087);
                    gf.field_h[var8] = var10;
                    var9--;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "oa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        try {
            int var1_int = 0;
            int var3 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
                if (param0 != 0) {
                    oa.b(-14);
                }
                if (vp.field_o != null) {
                    vp.field_o.e(param0 + -16363);
                }
                if (vn.field_w != null) {
                    vn.field_w.a((byte) -122);
                }
                if (null != oq.field_g) {
                    try {
                        oq.field_g.b((byte) 127);
                    } catch (IOException iOException) {
                    }
                }
                if (null != tr.field_Eb) {
                    for (var1_int = 0; var1_int < tr.field_Eb.length; var1_int++) {
                        if (!(tr.field_Eb[var1_int] == null)) {
                            try {
                                tr.field_Eb[var1_int].b((byte) -65);
                            } catch (IOException var2_ref) {
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeException) {
                throw r.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (!((var2 ^ -1) <= -161)) {
                var3 = tl.field_p[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        if (param0 != -12541) {
            return 'ﾷ';
        }
        return (char)var2;
    }

    final static bi[] a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            oa.a(-72, 121, 20, (byte) 125, 74);
        }
        return ao.a((byte) 97, param0, param2, 1, param3);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= 7) {
            return;
        }
        field_a = null;
    }

    static {
        field_a = new fg();
    }
}
