/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static String[] field_a;
    private gm field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            j.a(112);
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = bo.a(-1, param1);
            var4 = -111 % ((-20 - param0) / 49);
            if (-1 != param2.indexOf(param1)) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2.indexOf(var3) == -1) {
                L1: {
                  L2: {
                    if (param2.startsWith(param1)) {
                      break L2;
                    } else {
                      if (param2.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param2.endsWith(param1)) {
                          break L2;
                        } else {
                          if (!param2.endsWith(var3)) {
                            stackIn_12_0 = 0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static ut a(int param0) {
        if (param0 != -5275) {
            field_a = (String[]) null;
            return cv.field_b[ih.field_c][rm.field_C];
        }
        return cv.field_b[ih.field_c][rm.field_C];
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        var4 = this.field_b.field_R;
        if (!ia.field_c) {
          iw.a(param0 + 39, wa.field_a);
          on.b();
          this.field_b.a(1200, 300, 48, 90, (byte) -105);
          ta.e(127);
          wa.field_a.f(param2 - param0, -47 + param1);
          if (ia.field_c) {
            this.field_b.field_R = var4;
            return;
          } else {
            return;
          }
        } else {
          this.field_b.field_R = (this.field_b.field_R + 1024) % 2048;
          iw.a(param0 + 39, wa.field_a);
          on.b();
          this.field_b.a(1200, 300, 48, 90, (byte) -105);
          ta.e(127);
          wa.field_a.f(param2 - param0, -47 + param1);
          if (!ia.field_c) {
            return;
          } else {
            this.field_b.field_R = var4;
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
          this.field_b.field_G = 8;
          if ((param0 ^ -1) != -130) {
            this.field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = (String[]) null;
              this.field_b.g((byte) 125);
              return;
            } else {
              this.field_b.g((byte) 125);
              return;
            }
          } else {
            this.field_b.field_G = 3;
            this.field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = (String[]) null;
              this.field_b.g((byte) 125);
              return;
            } else {
              this.field_b.g((byte) 125);
              return;
            }
          }
        } else {
          this.field_b.field_G = 0;
          this.field_b.field_j = 1;
          this.field_b.field_n = 0;
          if ((param0 ^ -1) == -130) {
            this.field_b.field_G = 3;
            this.field_b.a(2, (la[]) null, false, false);
            if (param1 == 1) {
              this.field_b.g((byte) 125);
              return;
            } else {
              field_a = (String[]) null;
              this.field_b.g((byte) 125);
              return;
            }
          } else {
            this.field_b.a(2, (la[]) null, false, false);
            if (param1 != 1) {
              field_a = (String[]) null;
              this.field_b.g((byte) 125);
              return;
            } else {
              this.field_b.g((byte) 125);
              return;
            }
          }
        }
    }

    j(int param0) {
        int var2 = 3;
        gr var3 = new gr();
        var3.field_w = 4;
        if (param0 != 0) {
            var3.field_k = 10;
            var3.field_R = 31;
        } else {
            var3.field_R = 31;
            var3.field_k = 16;
        }
        vn var4 = fp.a(var3.field_w, var3.field_k, 0, var2, 0, 0, var3.field_R, false, false, false);
        this.field_b = new gm(var4, var2, false);
        this.field_b.field_G = 8;
        this.field_b.field_R = 1536;
        this.field_b.b((byte) -128, 5);
        if (-1 == (param0 ^ -1)) {
            this.field_b.field_mb.a(10, 126);
        }
    }

    static {
    }
}
