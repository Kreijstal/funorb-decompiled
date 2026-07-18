/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vq extends dqa implements lca {
    static int field_v;
    static fab field_x;
    private wta field_z;
    static String field_y;
    static String field_w;

    void a(int param0, wta param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((vq) this).field_z = param1;
              if (param0 > 73) {
                break L1;
              } else {
                eeb discarded$2 = ((vq) this).a(68);
                break L1;
              }
            }
            ((vq) this).field_z.field_c = (vq) this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vq.K(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    vq(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract boolean d(int param0);

    abstract int e(int param0);

    final static boolean a(faa param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -28 / (param1 / 33);
              stackOut_0_0 = (faa) param0;
              stackOut_0_1 = -632;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param2) {
                stackOut_3_0 = (faa) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (faa) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            ((faa) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, 1);
            stackOut_4_0 = param2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vq.Q(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    public final eeb a(int param0) {
        RuntimeException var2 = null;
        wta stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wta stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -782444220) {
                break L1;
              } else {
                eeb discarded$2 = ((vq) this).a(84);
                break L1;
              }
            }
            stackOut_3_0 = ((vq) this).field_z;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "vq.J(" + param0 + ')');
        }
        return (eeb) (Object) stackIn_4_0;
    }

    abstract int f(int param0);

    public static void i(byte param0) {
        try {
            field_y = null;
            int var1_int = -9 / ((35 - param0) / 62);
            field_w = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vq.R(" + param0 + ')');
        }
    }

    abstract int c(boolean param0);

    final static int g(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            ds var1_ref2 = null;
            int var1_int = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_53_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_52_0 = 0;
            try {
              if (ff.field_o.field_g >= 4) {
                if (ff.field_o.field_k == -1) {
                  stackOut_6_0 = 3;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (ff.field_o.field_k != -2) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    stackOut_9_0 = 4;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                if (param0 == -6269) {
                  L0: {
                    if (0 == gob.field_c) {
                      ija.field_b = gia.field_k.a(esa.field_p, hob.field_l, param0 ^ -6201);
                      gob.field_c = gob.field_c + 1;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if (1 != gob.field_c) {
                      break L1;
                    } else {
                      if (ija.field_b.field_f != 2) {
                        if (ija.field_b.field_f == 1) {
                          gob.field_c = gob.field_c + 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        stackOut_24_0 = jia.a(-93, -1);
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    }
                  }
                  L2: {
                    if (gob.field_c != 2) {
                      break L2;
                    } else {
                      eu.field_h = new lpb((java.net.Socket) ija.field_b.field_d, gia.field_k);
                      var1_ref2 = new ds(13);
                      jdb.a(nia.field_p, (byte) -48, wlb.field_o, var1_ref2, qfa.field_Ib);
                      var1_ref2.c(0, 15);
                      var1_ref2.d(ea.field_d, 332614536);
                      eu.field_h.a(0, var1_ref2.field_h, 13, 0);
                      gob.field_c = gob.field_c + 1;
                      ldb.field_r = 30000L + wt.a(false);
                      break L2;
                    }
                  }
                  L3: {
                    if (gob.field_c != 3) {
                      break L3;
                    } else {
                      if (0 < eu.field_h.c(param0 ^ -6269)) {
                        var1_int = eu.field_h.a(-123);
                        if (var1_int != 0) {
                          stackOut_44_0 = jia.a(-71, var1_int);
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          gob.field_c = gob.field_c + 1;
                          break L3;
                        }
                      } else {
                        if (~ldb.field_r <= ~wt.a(false)) {
                          break L3;
                        } else {
                          stackOut_39_0 = jia.a(-84, -2);
                          stackIn_40_0 = stackOut_39_0;
                          return stackIn_40_0;
                        }
                      }
                    }
                  }
                  if (gob.field_c != 4) {
                    stackOut_50_0 = -1;
                    stackIn_51_0 = stackOut_50_0;
                    return stackIn_51_0;
                  } else {
                    ff.field_o.a((Object) (Object) eu.field_h, sw.field_f, false);
                    gob.field_c = 0;
                    eu.field_h = null;
                    ija.field_b = null;
                    stackOut_48_0 = 0;
                    stackIn_49_0 = stackOut_48_0;
                    return stackIn_49_0;
                  }
                } else {
                  stackOut_14_0 = 121;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              stackOut_52_0 = jia.a(param0 ^ 6182, -3);
              stackIn_53_0 = stackOut_52_0;
              return stackIn_53_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw rta.a((Throwable) (Object) var1_ref, "vq.P(" + param0 + ')');
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
        field_v = -1;
        field_y = "Click or press F10 to open Quick Chat";
        field_w = "Playing";
    }
}
