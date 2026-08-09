/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ni {
    static boolean field_c;
    private qm field_a;
    private qm field_d;
    private eja field_b;

    final void a(byte param0) {
        this.field_a.a(12574);
        if (param0 < 22) {
            this.field_d = (qm) null;
        }
    }

    final static void a(uia param0, byte param1) {
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
            var5 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null == fua.field_b) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        fua.field_b.a((byte) 2, 0L);
                        fua.field_b.a(var6, 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var3_int) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
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
                    break L1;
                  }
                }
                L7: {
                  param0.a(0, var2, 24, 68);
                  if (param1 > 61) {
                    break L7;
                  } else {
                    field_c = true;
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("ni.B(");

                if (param0 == null) {
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
              throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(eo param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4_int = 0;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        try {
          L0: {
            L1: {
              param0.a(new ne[]{new ne(new gj[]{gj.field_p, gj.field_b, gj.field_n}), new ne(gj.field_e)}, 0);
              this.field_a = param0.c(6, true);
              this.field_d = param0.c(6, false);
              this.field_d.a(393168, 12, true);
              this.field_b = param0.a(26, false);
              this.field_b.a(18, 49146);
              var7 = this.field_b.a(true, (byte) -44);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(var7, 125);
                  if (jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.a(var5);
                        var8.a(1 + var5);
                        var8.a(2 + var5);
                        var8.a(var5 + 2);
                        var8.a(var5 - -3);
                        var8.a(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (-8192 >= (var4_int ^ -1)) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.b(var5);
                        var8.b(var5 + 1);
                        var8.b(2 + var5);
                        var8.b(2 + var5);
                        var8.b(var5 + 3);
                        var8.b(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.a();
                this.field_b.a((byte) -97);
                break L1;
              }
            }
            L5: {
              var9 = this.field_d.a(-15730, true);
              if (var9 == null) {
                break L5;
              } else {
                L6: {
                  var4 = param0.a(var9, 127);
                  if (!jaclib.memory.Stream.b()) {
                    var5 = 0;
                    L7: while (true) {
                      if ((var5 ^ -1) <= -8192) {
                        break L6;
                      } else {
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var5++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if ((var5 ^ -1) <= -8192) {
                        break L6;
                      } else {
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
                var4.a();
                this.field_d.a(true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("ni.<init>(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final void a(int param0, eo param1) {
        try {
            this.field_a.a(786336, 24, true);
            int var3_int = -61 / ((param0 - -55) / 41);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ni.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = true;
    }
}
