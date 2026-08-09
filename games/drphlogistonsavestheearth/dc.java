/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc implements qi {
    static String field_b;
    private long field_d;
    static int field_e;
    static String field_f;
    static volatile long field_c;
    static nh field_a;
    static String field_g;

    final static void a(bl param0, int param1, boolean param2, ug param3, byte param4, java.awt.Component param5) {
        try {
            if (param4 > -91) {
                field_b = (String) null;
            }
            id.a(param1, param2, 10);
            el.field_sb = id.a(param0, param5, 0, 22050);
            k.field_J = id.a(param0, param5, 1, 1024);
            ej.field_a = new ec();
            k.field_J.a(ej.field_a);
            s.field_a = param3;
            param3.a(oa.field_b * 128 / 80, (byte) -13);
            el.field_sb.a(param3);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dc.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract vh c(byte param0);

    public final vh a(int param0) {
        if (this.a(false)) {
            return pi.field_P;
        }
        if (param0 != -12317) {
            field_e = -119;
            if (!(this.field_d + 350L <= la.a(false))) {
                return ai.field_A;
            }
            return this.c((byte) -98);
        }
        if (!(this.field_d + 350L <= la.a(false))) {
            return ai.field_A;
        }
        return this.c((byte) -98);
    }

    public final String b(int param0) {
        if (!this.a(false)) {
          if (param0 == -16034) {
            if (this.field_d + 350L > la.a(false)) {
              return null;
            } else {
              return this.b((byte) -66);
            }
          } else {
            this.a(8);
            if (this.field_d + 350L > la.a(false)) {
              return null;
            } else {
              return this.b((byte) -66);
            }
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    final static void a(boolean param0, int param1, String param2, rf param3, mi param4) {
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
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        mi var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (!param0) {
                break L1;
              } else {
                var10 = (mi) null;
                dc.a(false, 13, (String) null, (rf) null, (mi) null);
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (param2.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param2.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = param4.field_a[0] + ((var5_int >> -75123224) - -param3.b(param2.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (0 == (var6 ^ -1)) {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param1;
                        break L5;
                      }
                    }
                    param4.field_a[var7] = param4.field_a[0] + (var5_int >> 530696776) - (-param3.b(param2.substring(0, 1 + var7)) - -param3.a((char) var8));
                    break L4;
                  } else {
                    param4.field_a[var7] = var6;
                    break L4;
                  }
                }
                L6: {
                  if (var8 != 62) {
                    break L6;
                  } else {
                    var6 = -1;
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("dc.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    public static void c(int param0) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 <= 5) {
            mi var2 = (mi) null;
            dc.a(false, 91, (String) null, (rf) null, (mi) null);
        }
    }

    public final void a(byte param0) {
        this.field_d = la.a(false);
        if (param0 != 87) {
            mi var3 = (mi) null;
            dc.a(true, 28, (String) null, (rf) null, (mi) null);
        }
    }

    static {
        field_b = "OK";
        field_c = 0L;
        field_g = "Updates will sent to the email address you've given";
    }
}
