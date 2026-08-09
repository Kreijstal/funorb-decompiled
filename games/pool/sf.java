/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends rg {
    static int field_y;
    char[] field_w;
    static String field_z;
    static eg field_E;
    int[] field_D;
    char[] field_A;
    boolean field_C;
    static String field_x;
    static wc field_B;
    int[] field_F;
    String field_G;

    public static void e(int param0) {
        field_E = null;
        field_z = null;
        field_x = null;
        if (param0 > -73) {
            field_E = (eg) null;
        }
        field_B = null;
    }

    private final void a(int param0, ge param1, int param2) {
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 != 1) {
                if ((param2 ^ -1) == -3) {
                  var4_int = param1.g(-90);
                  this.field_w = new char[var4_int];
                  this.field_F = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        this.field_F[var5] = param1.d(-1034);
                        var6 = param1.e((byte) 105);
                        stackIn_17_0 = this.field_w;

                        stackIn_17_1 = var5;

                        if (-1 != (var6 ^ -1)) {
                          stackIn_18_0 = (char[]) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = s.a((byte) var6, 8);
                          break L3;
                        } else {
                          stackIn_18_0 = (char[]) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = 0;
                          break L3;
                        }
                      }
                      stackIn_18_0[stackIn_18_1] = (char) stackIn_18_2;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if ((param2 ^ -1) == -4) {
                    var4_int = param1.g(-106);
                    this.field_A = new char[var4_int];
                    this.field_D = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L5: {
                          this.field_D[var5] = param1.d(-1034);
                          var6 = param1.e((byte) 105);
                          stackIn_11_0 = this.field_A;

                          stackIn_11_1 = var5;

                          if (-1 != (var6 ^ -1)) {
                            stackIn_12_0 = (char[]) ((Object) stackIn_11_0);
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = s.a((byte) var6, 8);
                            break L5;
                          } else {
                            stackIn_12_0 = (char[]) ((Object) stackIn_11_0);
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = 0;
                            break L5;
                          }
                        }
                        stackIn_12_0[stackIn_12_1] = (char) stackIn_12_2;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (param2 != 4) {
                      break L1;
                    } else {
                      this.field_C = true;
                      break L1;
                    }
                  }
                }
              } else {
                this.field_G = param1.j(-119);
                break L1;
              }
            }
            L6: {
              if (param0 < -109) {
                break L6;
              } else {
                field_x = (String) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("sf.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    final void f(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = Pool.field_O;
        if (this.field_D != null) {
            for (var2 = 0; var2 < this.field_D.length; var2++) {
                this.field_D[var2] = md.a(this.field_D[var2], 32768);
            }
        }
        if (!(null == this.field_F)) {
            var5 = 0;
            var2 = var5;
            while (this.field_F.length > var5) {
                this.field_F[var5] = md.a(this.field_F[var5], 32768);
                var5++;
            }
        }
        if (param0 != 0) {
            ge var4 = (ge) null;
            this.a((byte) -86, (ge) null);
        }
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.g(param0 ^ 1);
              if (var3_int != 0) {
                this.a(-121, param1, var3_int);
                continue L1;
              } else {
                L2: {
                  if (param0 == -123) {
                    break L2;
                  } else {
                    this.field_w = (char[]) null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("sf.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void b(byte param0, ge param1) {
        int var2_int = 0;
        try {
            wi.field_a = param1.d(-1034) << -1078580283;
            var2_int = param1.g(-74);
            jj.field_F = (var2_int & 7) << 1428122834;
            wi.field_a = wi.field_a + (var2_int >> 955408483);
            jj.field_F = jj.field_F + (param1.d(-1034) << 272319778);
            var2_int = param1.g(-115);
            vd.field_n = (63 & var2_int) << 1268324143;
            jj.field_F = jj.field_F + (var2_int >> 953647014);
            if (param0 <= 112) {
                field_x = (String) null;
            }
            vd.field_n = vd.field_n + (param1.g(-75) << 1166961127);
            var2_int = param1.g(-61);
            vd.field_n = vd.field_n + (var2_int >> 444756769);
            vb.field_f = (var2_int & 1) << 520027824;
            vb.field_f = vb.field_f + param1.d(-1034);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sf() {
        this.field_C = false;
    }

    static {
        field_x = "The '<%0>' setting needs to be changed.";
        field_z = "<img=0> Click on the cue ball to take your shot.";
    }
}
