/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ff {
    static String field_e;
    static String field_b;
    int field_a;
    int field_c;
    static String field_f;
    static String field_d;

    final static void b(int param0) {
        ph.field_f = ec.b(false);
        u.field_b = new i();
        hl.a(true, 24574, true);
        if (param0 != -13408) {
            String var2 = (String) null;
            ff.a(113, 57, (String[]) null, (String) null);
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -99) {
                break L1;
              } else {
                var6 = (String) null;
                ff.a(4, 59, (String[]) null, (String) null);
                break L1;
              }
            }
            ma.field_o = da.field_d;
            if (255 == param0) {
              L2: {
                stackIn_11_0 = 0;

                if (-14 >= (uh.field_d ^ -1)) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 1;
                  break L2;
                }
              }
              vb.field_j = di.a(stackIn_12_0 != 0, stackIn_12_1 != 0);
              break L0;
            } else {
              if ((param0 ^ -1) > -101) {
                vb.field_j = mh.a(param0, true, param3);
                return;
              } else {
                if (-106 > (param0 ^ -1)) {
                  vb.field_j = mh.a(param0, true, param3);
                  return;
                } else {
                  vb.field_j = wk.a((byte) 17, param2);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("ff.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 107 / ((param0 - 10) / 41);
        ga.field_E = new nc();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ff(int param0, int param1, int param2, int param3) {
        this.field_c = param3;
        this.field_a = param0;
    }

    final static void a(int param0, dl param1, boolean param2, byte param3, int param4, int param5, int param6, int param7, String param8, boolean param9, int param10, int param11, int param12, long param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  te.field_N = new jd(param11);
                  id.field_c = new jd(param7);
                  if (!param9) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  cl.field_m = stackIn_3_0 != 0;
                  if (!param2) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                b.field_b = stackIn_6_0 != 0;
                lc.field_l = param8;
                if (param3 > 87) {
                  ia.field_kb = param6;
                  qa.field_n = param1;
                  ci.field_jb = param10;
                  al.field_n = param4;
                  jj.field_s = param0;
                  ki.field_C = param5;
                  jh.field_f = param12;
                  wk.field_b = param13;
                  if (qa.field_n.field_b == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    try {
                      L3: {
                        pj.field_D = new hb(qa.field_n.field_b, 64, 0);
                        break L3;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    return;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("ff.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

                if (param8 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 255) {
            return;
        }
        field_e = null;
        field_f = null;
    }

    static {
        field_b = "Discard";
        field_e = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_f = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_d = "Orb points: <%0>";
    }
}
