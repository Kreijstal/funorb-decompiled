/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ge {
    static volatile int field_a;
    static String[] field_b;
    static boolean[] field_c;
    private java.util.zip.Inflater field_d;

    final void a(pb param0, int param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param0.field_g[param0.field_i] ^ -1)) {
                break L0;
              } else {
                if (-117 == param0.field_g[1 + param0.field_i]) {
                  L1: {
                    if (param1 == 2) {
                      break L1;
                    } else {
                      field_c = null;
                      break L1;
                    }
                  }
                  L2: {
                    if (null != ((ge) this).field_d) {
                      break L2;
                    } else {
                      ((ge) this).field_d = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      ((ge) this).field_d.setInput(param0.field_g, param0.field_i - -10, -18 - param0.field_i + param0.field_g.length);
                      int discarded$2 = ((ge) this).field_d.inflate(param2);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((ge) this).field_d.reset();
                    throw new RuntimeException("");
                  }
                  ((ge) this).field_d.reset();
                  return;
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc[] param1, int param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        if (param1 != null) {
          if (-1 > (param0 ^ -1)) {
            var6 = param1[0].field_l;
            var7 = param1[2].field_l;
            if (param5 != -10) {
              boolean discarded$1 = ge.b((byte) 56);
              var8 = param1[1].field_l;
              param1[0].a(param3, param4, param2);
              param1[2].a(param0 + param3 - var7, param4, param2);
              vj.a(sg.field_c);
              vj.f(var6 + param3, param4, -var7 + param0 + param3, param1[1].field_k + param4);
              var9 = var6 + param3;
              var10 = -var7 + param3 - -param0;
              param3 = var9;
              L0: while (true) {
                if (var10 <= param3) {
                  vj.b(sg.field_c);
                  return;
                } else {
                  param1[1].a(param3, param4, param2);
                  param3 = param3 + var8;
                  continue L0;
                }
              }
            } else {
              var8 = param1[1].field_l;
              param1[0].a(param3, param4, param2);
              param1[2].a(param0 + param3 - var7, param4, param2);
              vj.a(sg.field_c);
              vj.f(var6 + param3, param4, -var7 + param0 + param3, param1[1].field_k + param4);
              var9 = var6 + param3;
              var10 = -var7 + param3 - -param0;
              param3 = var9;
              L1: while (true) {
                if (var10 <= param3) {
                  vj.b(sg.field_c);
                  return;
                } else {
                  param1[1].a(param3, param4, param2);
                  param3 = param3 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static jk a(int param0) {
        String var1 = null;
        if (param0 == -23339) {
          var1 = ij.a((byte) 114);
          if (var1 != null) {
            if ((var1.indexOf('@') ^ -1) > -1) {
              return new jk(ij.a((byte) 122), dg.a(0));
            } else {
              var1 = "";
              return new jk(ij.a((byte) 122), dg.a(0));
            }
          } else {
            return new jk(ij.a((byte) 122), dg.a(0));
          }
        } else {
          field_b = null;
          var1 = ij.a((byte) 114);
          if (var1 == null) {
            return new jk(ij.a((byte) 122), dg.a(0));
          } else {
            L0: {
              if ((var1.indexOf('@') ^ -1) <= -1) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            return new jk(ij.a((byte) 122), dg.a(0));
          }
        }
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) sj.field_d;
        synchronized (var1_ref) {
          L0: {
            if (ce.field_b != ab.field_t) {
              tb.field_d = db.field_c[ab.field_t];
              fd.field_n = e.field_b[ab.field_t];
              if (param0 == -114) {
                ab.field_t = ab.field_t - -1 & 127;
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -117) {
            Object var2 = null;
            ge.a(120, (kc[]) null, -103, -3, 58, (byte) 16);
        }
    }

    public ge() {
        this(-1, 1000000, 1000000);
    }

    private ge(int param0, int param1, int param2) {
    }

    final static String a(byte[] param0, byte param1) {
        if (param1 < 77) {
            return null;
        }
        return bd.a(255, 0, param0, param0.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Cowboy", "Deputy", "Sheriff", "Mayor", "Governor", "Memory Expert", "Memory Master", "Memory Maniac", "Quickshot", "Master Quickshot", "Expert Quickshot", "Fastest Gun in the West", "Sharpshooter", "Expert Sharpshooter", "Master Sharpshooter"};
        field_c = new boolean[112];
        field_a = 0;
    }
}
