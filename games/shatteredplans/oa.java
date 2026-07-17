/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa {
    static fg field_a;
    static fr field_b;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 0) {
                break L1;
              } else {
                param2 = param2 + param1;
                param1 = 0;
                break L1;
              }
            }
            L2: {
              if (param4 < 0) {
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
                  if (var9 <= 0) {
                    var6++;
                    continue L5;
                  } else {
                    var8++;
                    var10 = gf.field_h[var8];
                    var10 = (var10 >> 2 & 4144959) + (8355711 & var10 >> 1);
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
          throw r.a((Throwable) (Object) var5, "oa.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (vp.field_o == null) {
                    break L1;
                  } else {
                    vp.field_o.e(-16363);
                    break L1;
                  }
                }
                L2: {
                  if (vn.field_w == null) {
                    break L2;
                  } else {
                    vn.field_w.a((byte) -122);
                    break L2;
                  }
                }
                L3: {
                  if (null == oq.field_g) {
                    break L3;
                  } else {
                    {
                      L4: {
                        oq.field_g.b((byte) 127);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null == tr.field_Eb) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= tr.field_Eb.length) {
                        break L6;
                      } else {
                        L8: {
                          if (tr.field_Eb[var1_int] != null) {
                            {
                              L9: {
                                tr.field_Eb[var1_int].b((byte) -65);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw r.a((Throwable) (Object) var1, "oa.C(" + 0 + 41);
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
        if (var2 >= 128) {
            if (!(var2 >= 160)) {
                var3 = tl.field_p[-128 + var2];
                if (var3 == 0) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static bi[] a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            oa.a(-72, 121, 20, (byte) 125, 74);
        }
        return ao.a((byte) 97, param0, param2, 1, param3);
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fg();
    }
}
