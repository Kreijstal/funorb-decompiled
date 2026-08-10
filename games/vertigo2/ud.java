/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gp {
    int[] field_C;
    char[] field_u;
    boolean field_y;
    static String field_E;
    int[] field_z;
    static cr field_A;
    static String field_w;
    static String field_t;
    String field_D;
    static cr field_x;
    char[] field_v;

    private final void a(int param0, int param1, ed param2) {
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char stackIn_14_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 6267) {
              L1: {
                if (param1 != 1) {
                  L2: {
                    if (-3 == (param1 ^ -1)) {
                      var4_int = param2.h(-11);
                      this.field_v = new char[var4_int];
                      this.field_C = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          break L2;
                        } else {
                          L4: {
                            this.field_C[var5] = param2.a((byte) -11);
                            var6 = param2.g(88);
                            stackIn_19_0 = this.field_v;

                            stackIn_19_1 = var5;

                            if (var6 != 0) {
                              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = mn.a((byte) var6, 93);
                              break L4;
                            } else {
                              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = 0;
                              break L4;
                            }
                          }
                          stackIn_20_0[stackIn_20_1] = (char) stackIn_20_2;
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param1 == 3) {
                        var4_int = param2.h(-11);
                        this.field_z = new int[var4_int];
                        this.field_u = new char[var4_int];
                        var5 = 0;
                        L5: while (true) {
                          if (var5 >= var4_int) {
                            break L2;
                          } else {
                            L6: {
                              this.field_z[var5] = param2.a((byte) -11);
                              var6 = param2.g(112);
                              stackIn_13_0 = this.field_u;

                              stackIn_13_1 = var5;

                              if (var6 == 0) {
                                stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = (char)0;
                                break L6;
                              } else {
                                stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
                                stackIn_14_1 = stackIn_13_1;
                                stackIn_14_2 = mn.a((byte) var6, -48);
                                break L6;
                              }
                            }
                            stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        if (4 != param1) {
                          break L2;
                        } else {
                          this.field_y = true;
                          break L1;
                        }
                      }
                    }
                  }
                  break L1;
                } else {
                  this.field_D = param2.f(param0 ^ 6395);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("ud.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ed param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                ud.b((byte) -4);
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param0.h(-11);
              if (0 != var3_int) {
                this.a(6267, var3_int, param0);
                continue L2;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ud.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_w = null;
        field_E = null;
        field_t = null;
        field_A = null;
        field_x = null;
        if (param0 != -37) {
            ud.b((byte) -106);
        }
    }

    final void a(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 89) {
            ud.b((byte) -113);
        }
        if (!(this.field_z == null)) {
            for (var2 = 0; this.field_z.length > var2; var2++) {
                this.field_z[var2] = om.a(this.field_z[var2], 32768);
            }
        }
        if (!(this.field_C == null)) {
            var4 = 0;
            var2 = var4;
            while (this.field_C.length > var4) {
                this.field_C[var4] = om.a(this.field_C[var4], 32768);
                var4++;
            }
        }
    }

    ud() {
        this.field_y = false;
    }

    static {
        field_w = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "<%0> would need a rating of <%1> to play with the current options.";
        field_E = "Show all private chat";
    }
}
