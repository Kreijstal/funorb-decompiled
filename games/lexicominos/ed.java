/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ed extends ca {
    static int field_v;
    int field_x;
    static th field_q;
    int field_p;
    int field_s;
    int field_u;
    int field_w;
    int field_r;
    static String[] field_t;

    public static void c(int param0) {
        field_q = null;
        field_t = null;
        if (param0 >= -31) {
            field_v = -74;
        }
    }

    final static void a(int param0, wf param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            wf var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  var10 = new byte[24];
                  var8 = var10;
                  var7 = var8;
                  var11 = var7;
                  var9 = var11;
                  var2 = var9;
                  if (null == kf.field_y) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        kf.field_y.a((byte) 40, 0L);
                        kf.field_y.a(var10, 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var3_int) {
                              break L4;
                            } else {
                              if (var10[var3_int] != 0) {
                                break L4;
                              } else {
                                var3_int++;
                                continue L3;
                              }
                            }
                          }
                          if (-25 >= (var3_int ^ -1)) {
                            throw new IOException();
                          } else {
                            break L2;
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (-25 >= (var4 ^ -1)) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  if (param0 > 79) {
                    break L7;
                  } else {
                    var6 = (wf) null;
                    ed.a(-106, (wf) null);
                    break L7;
                  }
                }
                param1.a(0, var11, 255, 24);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (runtimeException);

                stackIn_19_1 = new StringBuilder().append("ed.GB(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L8;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L8;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, sh param1) {
        sd var2 = null;
        try {
            sd.b(param1.a((byte) 127, "", "headers.packvorbis"));
            if (param0 != 0) {
                ed.c(-110);
            }
            var2 = sd.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ed.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static eb[] a(sh param0, boolean param1) {
        eb[] var2 = null;
        RuntimeException var2_ref = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eb var7 = null;
        int var8 = 0;
        int var9 = 0;
        eb[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = new eb[64];
              if (param1) {
                break L1;
              } else {
                field_q = (th) null;
                break L1;
              }
            }
            var3 = new wf(param0.a((byte) 127, "", "index"));
            L2: while (true) {
              if (var3.field_j.length <= var3.field_h) {
                stackIn_10_0 = (eb[]) (var2);
                break L0;
              } else {
                var4 = var3.d(true);
                var5 = var3.b(-1698573656);
                var6 = var3.d(true);
                var7 = new eb(var4, var3.b(-1698573656));
                var2[var7.field_g] = var7;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= var7.field_c.length) {
                    var7.a(new wf(param0.a(var5, -27493, var6)), (byte) 96);
                    continue L2;
                  } else {
                    var7.field_c[var8][0] = var3.c(false);
                    var7.field_c[var8][1] = var3.c(false);
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("ed.DB(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    ed() {
    }

    static {
        field_v = 0;
    }
}
