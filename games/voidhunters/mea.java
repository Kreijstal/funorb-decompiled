/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mea extends ksa {
    boolean field_f;
    static ij field_e;
    qfa field_d;

    abstract void a(int param0, int param1);

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 < 112) {
            mea.a(-5, (byte) 121, 58, -64);
          }
          var2_int = param1.charAt(0);
          var3 = 1;
          while (true) {
            if (param1.length() <= var3) {
              return true;
            }
            if (var2_int == param1.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("mea.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 != 23230) {
          this.field_f = false;
          return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 >= -88) {
          field_e = (ij) null;
        }
    }

    abstract void c(byte param0);

    abstract void a(int param0, int param1, int param2);

    int d(byte param0) {
        if (param0 != 7) {
          this.a(39, 72);
          return 0;
        }
        return 0;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
          this.field_f = false;
          return this.field_f;
        }
        return this.field_f;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param3 == 0) {
          if (param0 == kib.field_d) {
            if (param1 > -69) {
              field_e = (ij) null;
            }
            if (param3 == 1 &&
              idb.field_p != param0) {
              ebb.field_b = true;
              idb.field_p = param0;
              deb.a(40, param2);
            }
            if (2 != param3) {
              return;
            }
            if (lla.field_h == param0) {
              return;
            }
            ebb.field_b = true;
            lla.field_h = param0;
            deb.a(40, param2);
            return;
          }
          kib.field_d = param0;
          ebb.field_b = true;
          deb.a(40, param2);
        }
        if (param1 <= -69) {
          if (param3 == 1 &&
            idb.field_p != param0) {
            ebb.field_b = true;
            idb.field_p = param0;
            deb.a(40, param2);
          }
        } else {
          field_e = (ij) null;
          if (param3 == 1) {
            if (idb.field_p == param0) {
              if (2 != param3) {
                return;
              }
              if (lla.field_h == param0) {
                return;
              }
              ebb.field_b = true;
              lla.field_h = param0;
              deb.a(40, param2);
              return;
            }
            ebb.field_b = true;
            idb.field_p = param0;
            deb.a(40, param2);
          }
        }
        if (2 == param3) {
          if (lla.field_h == param0) {
            return;
          }
          ebb.field_b = true;
          lla.field_h = param0;
          deb.a(40, param2);
        }
    }

    abstract void a(aia param0, int param1, aia param2, int param3);

    abstract boolean f(int param0);

    abstract boolean a(int param0);

    mea(qfa param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "mea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0) {
        if (!param0) {
          field_e = (ij) null;
          return qga.field_b.a(-1);
        }
        return qga.field_b.a(-1);
    }

    static {
    }
}
