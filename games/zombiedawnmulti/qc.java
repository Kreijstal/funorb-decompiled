/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends qa {
    static ul field_s;
    boolean field_x;
    boolean field_r;
    static int field_q;
    static cj field_u;
    static int field_v;
    static String field_w;
    volatile boolean field_t;

    final static void a(int param0, byte param1, ja[] param2, int param3, int param4) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.c();
          if (0 != param4) {
            if (1 == param4) {
              param2[param3].a();
              param2[param0].c(0, 0);
              for (var5_int = 0; var5_int < 24; var5_int++) {
                oo.b(var5_int, 0, 24, 0, var5_int * 5);
              }
            } else {
              if (param4 == 2) {
                param2[param3].a();
                param2[param0].c(0, 0);
                for (var5_int = 0; var5_int < 24; var5_int++) {
                  oo.b(var5_int, 0, 24, 0, -(5 * var5_int) + 120);
                }
              } else {
                if (3 == param4) {
                  param2[param3].a();
                  param2[param0].c(0, 0);
                  for (var5_int = 0; var5_int < 24; var5_int++) {
                    oo.c(0, var5_int, 24, 0, var5_int * 5);
                  }
                } else {
                  if (param4 == 4) {
                    param2[param3].a();
                    param2[param0].c(0, 0);
                    for (var5_int = 0; var5_int < 24; var5_int++) {
                      oo.c(0, var5_int, 24, 0, -(5 * var5_int) + 120);
                    }
                  } else {
                    if (param4 == 6) {
                      param2[param3].a();
                      param2[param0].c(0, 0);
                      for (var5_int = 0; 24 > var5_int; var5_int++) {
                        oo.c(var5_int + 1, var5_int, 24 - var5_int, 0, 5 * var5_int);
                        oo.b(var5_int, var5_int, -var5_int + 24, 0, var5_int * 5);
                      }
                    } else {
                      if (param4 == 8) {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        for (var5_int = 0; 24 > var5_int; var5_int++) {
                          oo.c(0, var5_int, var5_int + 1, 0, -(var5_int * 5) + 120);
                          oo.b(var5_int, 0, var5_int, 0, -(5 * var5_int) + 120);
                        }
                      } else {
                        if (7 == param4) {
                          param2[param3].a();
                          param2[param0].c(0, 0);
                          for (var5_int = 0; var5_int < 24; var5_int++) {
                            oo.c(0, var5_int, 24 - var5_int, 0, 5 * var5_int);
                            oo.b(var5_int, -var5_int + 24, var5_int, 0, -(5 * var5_int) + 120);
                          }
                        } else {
                          if (param4 == 5) {
                            param2[param3].a();
                            param2[param0].c(0, 0);
                            for (var5_int = 0; var5_int < 24; var5_int++) {
                              oo.c(-var5_int + 24, var5_int, var5_int, 0, -(5 * var5_int) + 120);
                              oo.b(var5_int, 0, 24 - var5_int, 0, var5_int * 5);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            param2[param3].a();
            param2[param0].c(0, 0);
            oo.f(0, 0, 24, 24, 0, 128);
          }
          g.b();
          if (param1 != -126) {
            field_q = 122;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("qc.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract byte[] e(int param0);

    final static void a(br param0, br param1, int param2) {
        if (param2 != 0) {
          return;
        }
        try {
          if (param0.field_b != null) {
            param0.a(true);
          }
          param0.field_b = param1;
          param0.field_d = param1.field_d;
          param0.field_b.field_d = param0;
          param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qc.O(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_u = null;
        field_s = null;
        field_w = null;
        if (param0 < 97) {
          qc.c((byte) 22);
        }
    }

    final static String b(byte param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 != -32) {
            field_u = (cj) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 - 1 + var2_int] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("qc.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    abstract int f(int param0);

    qc() {
        this.field_t = true;
    }

    static {
        field_w = "Hungry";
    }
}
