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
            try {
                if (-32 != (param0.field_g[param0.field_i] ^ -1) || -117 != param0.field_g[1 + param0.field_i]) {
                    throw new RuntimeException("");
                }
                if (param1 != 2) {
                    field_c = (boolean[]) null;
                }
                if (null == this.field_d) {
                    this.field_d = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_d.setInput(param0.field_g, param0.field_i - -10, -18 - param0.field_i + param0.field_g.length);
                    this.field_d.inflate(param2);
                } catch (Exception exception) {
                    this.field_d.reset();
                    throw new RuntimeException("");
                }
                this.field_d.reset();
            } catch (RuntimeException runtimeException) {
                throw ma.a((Throwable) ((Object) runtimeException), "ge.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, kc[] param1, int param2, int param3, int param4, byte param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 <= (param0 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var6_int = param1[0].field_l;
                    var7 = param1[2].field_l;
                    if (param5 == -10) {
                      break L2;
                    } else {
                      ge.b((byte) 56);
                      break L2;
                    }
                  }
                  var8 = param1[1].field_l;
                  param1[0].a(param3, param4, param2);
                  param1[2].a(param0 + param3 - var7, param4, param2);
                  vj.a(sg.field_c);
                  vj.f(var6_int + param3, param4, -var7 + param0 + param3, param1[1].field_k + param4);
                  var9 = var6_int + param3;
                  var10 = -var7 + param3 - -param0;
                  param3 = var9;
                  L3: while (true) {
                    if (var10 <= param3) {
                      vj.b(sg.field_c);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1[1].a(param3, param4, param2);
                      param3 = param3 + var8;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("ge.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static jk a(int param0) {
        String var1;
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
          field_b = (String[]) null;
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
        var1_ref = sj.field_d;
        synchronized (var1_ref) {
          L0: {
            if (ce.field_b != ab.field_t) {
              tb.field_d = db.field_c[ab.field_t];
              fd.field_n = e.field_b[ab.field_t];
              if (param0 == -114) {
                ab.field_t = ab.field_t - -1 & 127;
                stackIn_8_0 = 1;
                break L0;
              } else {
                stackIn_6_0 = 0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackIn_3_0 = 0;
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
            kc[] var2 = (kc[]) null;
            ge.a(120, (kc[]) null, -103, -3, 58, (byte) 16);
        }
    }

    public ge() {
        this(-1, 1000000, 1000000);
    }

    private ge(int param0, int param1, int param2) {
    }

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 77) {
              stackIn_4_0 = bd.a(255, 0, param0, param0.length);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ge.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_b = new String[]{"Cowboy", "Deputy", "Sheriff", "Mayor", "Governor", "Memory Expert", "Memory Master", "Memory Maniac", "Quickshot", "Master Quickshot", "Expert Quickshot", "Fastest Gun in the West", "Sharpshooter", "Expert Sharpshooter", "Master Sharpshooter"};
        field_c = new boolean[112];
        field_a = 0;
    }
}
