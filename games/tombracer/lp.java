/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    int field_b;
    boolean field_a;
    int field_d;
    int field_e;
    int field_c;
    boolean field_i;
    int field_f;
    static ko field_h;
    static int field_g;

    final void a(int param0, int param1, uia param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -1) {
            return;
          }
          while (true) {
            var4_int = param2.h(255);
            if (var4_int == 0) {
              return;
            }
            this.a(param2, param1, (byte) -124, var4_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("lp.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static vna a(byte param0, String param1) {
        vna stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna var2 = null;
        RuntimeException var2_ref = null;
        in var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 48) {
            field_h = (ko) null;
          }
          var2 = new vna();
          var3 = new in(param1);
          while (!var3.a(0)) {
            var4 = var3.b(21098);
            if (Character.isWhitespace((char) var4)) {
              continue;
            }
            if (var4 != 34 &&
              var4 != 39) {
              if (var4 == 40) {
                var2.b((byte) -90, new mi(lna.field_a, -1 + var3.field_b));
                continue;
              }
              if (var4 == 41) {
                var2.b((byte) -112, new mi(rs.field_a, var3.field_b - 1));
                continue;
              }
              if (44 == var4) {
                var2.b((byte) -107, new mi(qba.field_c, var3.field_b - 1));
                continue;
              }
              var2.b((byte) -75, ska.a(param0 - 93, var3));
              continue;
            }
            var2.b((byte) -81, hb.a(var3, false));
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("lp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(uia param0, int param1, byte param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (1 != param3) {
            if (param3 == 2) {
              this.field_d = 1 + param0.d(123);
              this.field_b = 1 + param0.d(122);
            } else {
              if (param3 != 3) {
                if (param3 == 4) {
                  this.field_e = param0.h(255);
                } else {
                  if (param3 != 5) {
                    if (param3 == 6) {
                      this.field_a = true;
                    } else {
                      if (param3 == 7) {
                        this.field_i = true;
                      }
                    }
                  } else {
                    this.field_c = param0.h(255);
                  }
                }
              } else {
                param0.c((byte) 64);
              }
            }
          } else {
            this.field_f = param0.d(126);
            if (this.field_f == 65535) {
              this.field_f = -1;
            }
          }
          if (param2 < -121) {
            return;
          }
          lp.a((byte) -38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("lp.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 34) {
          field_g = 31;
          field_h = null;
          return;
        }
        field_h = null;
    }

    lp() {
        this.field_e = 2;
        this.field_a = false;
        this.field_i = false;
        this.field_b = 64;
        this.field_d = 64;
        this.field_f = -1;
        this.field_c = 1;
    }

    static {
        field_h = new ko(1);
        field_g = 0;
    }
}
