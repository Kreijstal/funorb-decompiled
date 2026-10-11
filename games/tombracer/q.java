/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends ql {
    static boolean field_r;
    private int field_p;
    private int field_q;
    static String field_o;
    private ffa field_n;

    final static void a(byte param0, int param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param1, -2988);
        var3.i(3, 0);
        var3.i(8, 0);
        if (param0 < -100) {
          var3.f(-1477662136, param2);
          return;
        }
        field_r = true;
        var3.f(-1477662136, param2);
    }

    public final int hashCode() {
        return ira.a(this.field_q, this.field_p, (byte) -93);
    }

    final ffa a(byte param0) {
        if (param0 >= -67) {
          this.field_q = 19;
          return this.field_n;
        }
        return this.field_n;
    }

    final void a(int param0, ffa param1, byte param2, int param3) {
        try {
          this.field_p = param3;
          this.field_n = param1;
          this.field_q = param0;
          if (param2 != 116) {
            ffa var6 = (ffa) null;
            this.a(92, (ffa) null, (byte) -51, 63);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "q.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 != 11955) {
          field_o = (String) null;
          if (48 > param0) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 57) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (48 > param0) {
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (param0 <= 90) {
          return true;
        }
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -98) {
          return true;
        }
        if (param3 >= this.field_q) {
          return false;
        }
        if (param1 < this.field_q) {
          return false;
        }
        if (this.field_p <= param2) {
          return false;
        }
        if (param0 >= this.field_p) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, ffa param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 57) {
            field_o = (String) null;
          }
          stackIn_7_0 = (this.field_n == param2) && (param1 == this.field_q) && (param0 == this.field_p);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("q.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 8) {
          field_r = false;
        }
    }

    final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          field_r = false;
          if (this.field_q != param0) {
            return false;
          }
          if (param1 == this.field_p) {
            return true;
          }
          return false;
        }
        if (this.field_q != param0) {
          return false;
        }
        if (param1 == this.field_p) {
          return true;
        }
        return false;
    }

    q(ffa param0, int param1, int param2) {
        try {
          this.field_q = param1;
          this.field_n = param0;
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "q.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Loading graphics";
    }
}
