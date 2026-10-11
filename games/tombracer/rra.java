/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rra {
    static hja[] field_a;
    int field_b;
    static jea field_e;
    int field_d;
    int field_c;

    final static int a(boolean param0, int param1) {
        if (param0) {
          return 45;
        }
        if (0 <= param1) {
          if (param1 > 65536) {
            return -wl.field_i[134217728 / param1] + 2048;
          }
          return wl.field_i[param1 >> 5];
        }
        if (param1 >= -65536) {
          return -wl.field_i[-param1 >> 5];
        }
        return wl.field_i[134217728 / -param1] - 2048;
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(int param0) {
        try {
          int var1 = 0;
          Exception var2 = null;
          Throwable decompiledCaughtException = null;
          var1 = 103 % ((12 - param0) / 39);
          if (fua.field_b != null) {
            try {
              fua.field_b.a((byte) 27, 0L);
              fua.field_b.a(vc.field_q.field_g, vc.field_q.field_h, (byte) -17, 24);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          vc.field_q.field_h = vc.field_q.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(byte param0, int param1, int param2);

    abstract void a(int param0, int param1, boolean param2);

    final static boolean a(byte param0, char param1) {
        if (param0 <= -77) {
          if (32 > param1) {
            if (param1 >= 160 &&
              param1 <= 255) {
              return true;
            }
            if (8364 != param1 &&
              param1 != 338 &&
              8212 != param1 &&
              param1 != 339) {
              if (param1 != 376) {
                return false;
              }
              return true;
            }
            return true;
          }
          if (126 >= param1) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (8364 == param1) {
            return true;
          }
          if (param1 == 338) {
            return true;
          }
          if (8212 == param1) {
            return true;
          }
          if (param1 == 339) {
            return true;
          }
          if (param1 == 376) {
            return true;
          }
          return false;
        }
        field_a = (hja[]) null;
        if (32 > param1) {
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (8364 == param1) {
            return true;
          }
          if (param1 == 338) {
            return true;
          }
          if (8212 == param1) {
            return true;
          }
          if (param1 == 339) {
            return true;
          }
          if (param1 == 376) {
            return true;
          }
          return false;
        }
        if (126 >= param1) {
          return true;
        }
        if (param1 < 160) {
          if (8364 == param1) {
            return true;
          }
          if (param1 == 338) {
            return true;
          }
          if (8212 == param1) {
            return true;
          }
          if (param1 == 339) {
            return true;
          }
          if (param1 == 376) {
            return true;
          }
          return false;
        }
        if (param1 <= 255) {
          return true;
        }
        if (8364 == param1) {
          return true;
        }
        if (param1 == 338) {
          return true;
        }
        if (8212 == param1) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (param1 != 376) {
          return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
          rra.a(false);
          field_a = null;
          field_e = null;
          return;
        }
        field_a = null;
        field_e = null;
    }

    rra(int param0, int param1, int param2) {
        this.field_c = param0;
        this.field_b = param1;
        this.field_d = param2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param4 != 0) {
          rra.a(false);
        }
        if (param3 == param5) {
          nf.a(param5, param2, param6, param0, param7, param1, -91);
          return;
        }
        if (pka.field_b > param0 - param5) {
          hl.a(param6, param1, param2, param0, true, param5, param7, param3);
          return;
        }
        if (param0 + param5 > ss.field_c) {
          hl.a(param6, param1, param2, param0, true, param5, param7, param3);
          return;
        }
        if (-param3 + param2 < gca.field_d) {
          hl.a(param6, param1, param2, param0, true, param5, param7, param3);
          return;
        }
        if (hc.field_h >= param3 + param2) {
          ota.a(param7, param3, param5, param6, param0, -1923382751, param1, param2);
          return;
        }
        hl.a(param6, param1, param2, param0, true, param5, param7, param3);
    }

    static {
    }
}
