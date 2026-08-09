/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class im {
    private java.util.zip.Inflater field_b;
    static jp[] field_a;
    static boolean field_g;
    static mh field_d;
    static int field_e;
    static jp[][] field_f;
    static String[] field_c;

    private im(int param0, int param1, int param2) {
    }

    public im() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 >= -51) {
          im.a(39, -27, -77, 50, -59, (byte) -97, -42);
          hb.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
          return;
        } else {
          hb.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
          return;
        }
    }

    final static void a(int param0, String param1, boolean param2, int param3, int param4, int param5, int param6, int param7, tg param8, byte param9, boolean param10, long param11, int param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  jl.field_e = new pi(param4);
                  k.field_h = new pi(param5);
                  fe.field_ob = param6;
                  tq.field_h = param1;
                  lh.field_s = param8;
                  ko.field_e = param0;
                  if (!param2) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  qb.field_u = stackIn_3_0 != 0;
                  rp.field_x = param7;
                  if (param9 > 121) {
                    break L2;
                  } else {
                    im.b(47);
                    break L2;
                  }
                }
                L3: {
                  dl.field_b = param13;
                  pj.field_a = param12;
                  if (!param10) {
                    stackIn_8_0 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
                    break L3;
                  }
                }
                ec.field_O = stackIn_8_0 != 0;
                ud.field_E = param11;
                pe.field_r = param3;
                if (null == lh.field_s.field_k) {
                  break L0;
                } else {
                  try {
                    L4: {
                      go.field_a = new jg(lh.field_s.field_k, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("im.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

                if (param8 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = (jp[][]) null;
        field_c = null;
        if (param0 != -32) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        pp.field_a = ga.field_i;
        if (param0 != -8) {
            im.a(42);
        }
    }

    final void a(byte[] param0, int param1, wq param2) {
        try {
            try {
                if (-32 != (param2.field_k[param2.field_l] ^ -1) || -117 != param2.field_k[param2.field_l - -1]) {
                    throw new RuntimeException("");
                }
                if (this.field_b == null) {
                    this.field_b = new java.util.zip.Inflater(true);
                }
                if (param1 != -20555) {
                    im.b(-99);
                }
                try {
                    this.field_b.setInput(param2.field_k, param2.field_l + 10, param2.field_k.length + (-8 + -param2.field_l) + -10);
                    this.field_b.inflate(param0);
                } catch (Exception exception) {
                    this.field_b.reset();
                    throw new RuntimeException("");
                }
                this.field_b.reset();
            } catch (RuntimeException runtimeException) {
                throw qb.a((Throwable) ((Object) runtimeException), "im.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = false;
    }
}
