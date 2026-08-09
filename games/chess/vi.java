/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    volatile boolean field_e;
    volatile md[] field_c;
    jk field_b;
    volatile boolean field_f;
    static int field_d;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 != -3) {
            vi.a(68);
            return ad.field_b;
        }
        return ad.field_b;
    }

    final static boolean a(um param0, int param1, um param2, um param3) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 44) {
                break L1;
              } else {
                field_d = -26;
                break L1;
              }
            }
            L2: {
              if (!param0.c((byte) 127)) {
                break L2;
              } else {
                if (!param0.b("commonui", 100)) {
                  break L2;
                } else {
                  if (!param2.c((byte) 121)) {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (param2.b("commonui", 100)) {
                      L3: {
                        if (!param3.c((byte) 126)) {
                          break L3;
                        } else {
                          if (!param3.b("button.gif", 100)) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_6_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("vi.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 5 % ((param0 - 65) / 51);
    }

    public final void run() {
        int var1_int = 0;
        md var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = Chess.field_G;
        this.field_e = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_f) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (-3 >= (var1_int ^ -1)) {
                        bc.a(10L, (byte) -121);
                        var5 = (Object) null;
                        ak.a(this.field_b, (byte) -37, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_c[var1_int];
                          if (var2 != null) {
                            var2.b();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              fg.a((Throwable) ((Object) var1), (byte) -77, (String) null);
              this.field_e = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_e = false;
          throw vi.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_e = false;
    }

    vi() {
        this.field_c = new md[2];
        this.field_f = false;
        this.field_e = false;
    }

    static {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
