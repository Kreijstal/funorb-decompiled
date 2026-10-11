/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private int field_d;
    int field_b;
    private static String[] field_a;
    private String field_c;

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -30600) {
          if (wla.field_ub <= 0) {
            if (vpa.a(9)) {
              var2 = 0;
            } else {
              var2 = 1;
            }
          } else {
            if (wba.field_o == null) {
              dq.field_f = r.a(480, 0, param0 ^ -15579, dsa.field_c, 640, 0);
              if (dq.field_f == null) {
                var2 = 3;
              } else {
                fpa.a(dq.field_f, (byte) 75);
                var2 = 2;
              }
              if (wba.field_o == null &&
                foa.field_b) {
                qna.a(1, param1, var2);
              }
              return;
            }
            dq.field_f = wba.field_o.b(27013);
            uu.b(param0 ^ -18237, 2);
            if (dq.field_f == null) {
              var2 = 3;
            } else {
              fpa.a(dq.field_f, (byte) 75);
              var2 = 2;
            }
          }
        } else {
          in.a(118, false);
          if (wla.field_ub <= 0) {
            if (vpa.a(9)) {
              var2 = 0;
              if (wba.field_o == null &&
                foa.field_b) {
                qna.a(1, param1, var2);
                return;
              }
              return;
            }
            var2 = 1;
            if (wba.field_o == null &&
              foa.field_b) {
              qna.a(1, param1, var2);
              return;
            }
            return;
          }
          if (wba.field_o == null) {
            dq.field_f = r.a(480, 0, param0 ^ -15579, dsa.field_c, 640, 0);
            if (dq.field_f == null) {
              var2 = 3;
              if (wba.field_o == null &&
                foa.field_b) {
                qna.a(1, param1, var2);
                return;
              }
              return;
            }
            fpa.a(dq.field_f, (byte) 75);
            var2 = 2;
          } else {
            dq.field_f = wba.field_o.b(27013);
            uu.b(param0 ^ -18237, 2);
            if (dq.field_f == null) {
              var2 = 3;
            } else {
              fpa.a(dq.field_f, (byte) 75);
              var2 = 2;
            }
          }
        }
        if (wba.field_o != null) {
          return;
        }
        if (!foa.field_b) {
          return;
        }
        qna.a(1, param1, var2);
    }

    public static void a(boolean param0) {
        if (!param0) {
          in.a(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 480) {
            stackIn_4_0 = qi.a(30054, param0, qt.class);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("in.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final char b(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 21098) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$0);
        }
        this.toString();
        int fieldTemp$1 = this.field_b;
        this.field_b = this.field_b + 1;
        return this.field_c.charAt(fieldTemp$1);
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          return this.field_d <= this.field_b ? true : false;
        }
        in.a(126, -107, (byte) 95);
        return this.field_d <= this.field_b ? true : false;
    }

    public final String toString() {
        return this.field_c.substring(0, this.field_b) + "|" + this.field_c.substring(this.field_b);
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 > -5) {
          field_a = (String[]) null;
          if (!(aca.a(param0, 32768, param1) | ((param0 & 2048) != 0 ? true : false))) {
            return vua.e(param0, param1, 13650) ? true : false;
          }
          return true;
        }
        if (aca.a(param0, 32768, param1) | ((param0 & 2048) != 0 ? true : false)) {
          return true;
        }
        if (!vua.e(param0, param1, 13650)) {
          return false;
        }
        return true;
    }

    in(String param0) {
        this.field_b = 0;
        try {
          this.field_c = param0;
          this.field_d = this.field_c.length();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[2];
        field_a[0] = "Brick";
        field_a[1] = "Sand";
    }
}
