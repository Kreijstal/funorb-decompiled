/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lla {
    private int field_g;
    static int field_h;
    static int field_e;
    private java.util.zip.Inflater field_j;
    ds field_f;
    private java.util.zip.Deflater field_i;
    private java.util.zip.CRC32 field_a;
    private int field_d;
    static int field_b;
    private int field_c;

    final byte[] a(int param0, byte[] param1) {
        ds var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new ds(param1);
            var3.field_e = -4 + param1.length;
            var4 = var3.i(11468);
            var3.field_e = param0;
            var5 = new byte[var4];
            ((lla) this).a(20773, var5, var3);
            stackOut_0_0 = (byte[]) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("lla.C(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public lla() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, byte[] param1, ds param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              L0: {
                L1: {
                  if (param2.field_h[param2.field_e] != 31) {
                    break L1;
                  } else {
                    if (-117 == param2.field_h[param2.field_e + 1]) {
                      L2: {
                        if (((lla) this).field_j == null) {
                          ((lla) this).field_j = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            ((lla) this).field_j.setInput(param2.field_h, param2.field_e + 10, -10 - (param2.field_e - -8) + param2.field_h.length);
                            if (param0 == 20773) {
                              break L4;
                            } else {
                              field_e = 59;
                              break L4;
                            }
                          }
                          int discarded$2 = ((lla) this).field_j.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((lla) this).field_j.reset();
                        throw new RuntimeException("");
                      }
                      ((lla) this).field_j.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) runtimeException;
                stackOut_14_1 = new StringBuilder().append("lla.B(").append(param0).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              L6: {
                stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (null == ((lla) this).field_f) {
                ((lla) this).field_i = new java.util.zip.Deflater(((lla) this).field_c, true);
                ((lla) this).field_a = new java.util.zip.CRC32();
                ((lla) this).field_f = new ds(((lla) this).field_g);
                ((lla) this).field_f.a(0, pb.field_f, -1, pb.field_f.length);
                break L1;
              } else {
                ((lla) this).field_f.field_e = pb.field_f.length;
                break L1;
              }
            }
            ((lla) this).field_a.update(param2, param1, param3);
            ((lla) this).field_i.setInput(param2, param1, param3);
            ((lla) this).field_i.finish();
            var5_int = 1;
            L2: while (true) {
              L3: {
                var6 = ((lla) this).field_f.field_h.length + -((lla) this).field_f.field_e;
                if (var6 < 8) {
                  var12 = new byte[((lla) this).field_d + ((lla) this).field_f.field_h.length];
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var7 = var9;
                  cua.a(((lla) this).field_f.field_h, 0, var12, 0, ((lla) this).field_f.field_e);
                  var6 = var6 + ((lla) this).field_d;
                  ((lla) this).field_f.field_h = var7;
                  if (var5_int == 0) {
                    break L3;
                  } else {
                    var5_int = 0;
                    System.out.println("[blue]Warning: GZIP deflate buffer required expanding[/blue]");
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (((lla) this).field_i.finished()) {
                ((lla) this).field_f.a((byte) 103, (int)((lla) this).field_a.getValue());
                if (param0 >= 72) {
                  ((lla) this).field_f.a((byte) 93, ((lla) this).field_i.getTotalIn());
                  ((lla) this).field_i.reset();
                  ((lla) this).field_a.reset();
                  break L0;
                } else {
                  return;
                }
              } else {
                ((lla) this).field_f.field_e = ((lla) this).field_f.field_e + ((lla) this).field_i.deflate(((lla) this).field_f.field_h, ((lla) this).field_f.field_e, var6);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("lla.A(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    private lla(int param0, int param1, int param2) {
        ((lla) this).field_d = param2;
        ((lla) this).field_g = param1;
        ((lla) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 2;
        field_b = 200;
        field_e = field_b / 2;
    }
}
