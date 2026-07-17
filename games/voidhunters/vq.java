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
        try {
            ((vq) this).field_z = param1;
            if (param0 <= 73) {
                eeb discarded$0 = ((vq) this).a(68);
            }
            ((vq) this).field_z.field_c = (vq) this;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vq.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        boolean stackOut_3_0 = false;
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
              var3_int = -28 / (param1 / 33);
              stackOut_0_0 = (faa) param0;
              stackOut_0_1 = -632;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param2) {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (faa) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            ((faa) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, 1);
            stackOut_3_0 = param2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vq.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    public final eeb a(int param0) {
        if (param0 != -782444220) {
            eeb discarded$0 = ((vq) this).a(84);
            return (eeb) (Object) ((vq) this).field_z;
        }
        return (eeb) (Object) ((vq) this).field_z;
    }

    abstract int f(int param0);

    public static void i(byte param0) {
        field_y = null;
        int var1 = -9;
        field_w = null;
        field_x = null;
    }

    abstract int c(boolean param0);

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ds var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_32_0 = 0;
            if (-5 >= ff.field_o.field_g) {
              if (0 == ff.field_o.field_k) {
                return 3;
              } else {
                if (ff.field_o.field_k == -2) {
                  return 4;
                } else {
                  return 1;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 == gob.field_c) {
                      ija.field_b = gia.field_k.a(esa.field_p, hob.field_l, 68);
                      gob.field_c = gob.field_c + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != gob.field_c) {
                      break L2;
                    } else {
                      if (-3 != ija.field_b.field_f) {
                        if (-2 == ija.field_b.field_f) {
                          gob.field_c = gob.field_c + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_14_0 = jia.a(-93, -1);
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                  }
                  L3: {
                    if (gob.field_c != 2) {
                      break L3;
                    } else {
                      eu.field_h = new lpb((java.net.Socket) ija.field_b.field_d, gia.field_k);
                      var2 = new ds(13);
                      jdb.a(nia.field_p, (byte) -48, wlb.field_o, var2, qfa.field_Ib);
                      var2.c(0, 15);
                      var2.d(ea.field_d, 332614536);
                      eu.field_h.a(0, var2.field_h, 13, 0);
                      gob.field_c = gob.field_c + 1;
                      ldb.field_r = 30000L + wt.a(false);
                      break L3;
                    }
                  }
                  L4: {
                    if (gob.field_c != 3) {
                      break L4;
                    } else {
                      if (0 < eu.field_h.c(0)) {
                        var1_int = eu.field_h.a(-123);
                        if (var1_int != 0) {
                          stackOut_28_0 = jia.a(-71, var1_int);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          gob.field_c = gob.field_c + 1;
                          break L4;
                        }
                      } else {
                        if (~ldb.field_r <= ~wt.a(false)) {
                          break L4;
                        } else {
                          stackOut_24_0 = jia.a(-84, -2);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    }
                  }
                  if (gob.field_c != 4) {
                    stackOut_34_0 = -1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    ff.field_o.a((Object) (Object) eu.field_h, sw.field_f, false);
                    gob.field_c = 0;
                    eu.field_h = null;
                    ija.field_b = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return jia.a(-91, -3);
              }
              return stackIn_35_0;
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
