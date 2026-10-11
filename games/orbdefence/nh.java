/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    private gb field_f;
    private ki field_g;
    static tl field_c;
    static String field_e;
    static int field_b;
    static String field_a;
    private ki field_d;

    public static void a(byte param0) {
        if (param0 > -51) {
          return;
        }
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0) {
          field_e = (String) null;
          if (48 > param1) {
            if (65 <= param1 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (65 > param1) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (48 > param1) {
          if (65 > param1) {
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (65 > param1) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
    }

    final oe b(int param0, int param1) {
        byte[] var4 = null;
        if (param0 != -11244) {
          return (oe) null;
        }
        oe var3 = (oe) (this.field_f.a((long)param1, 0));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_g.b(1, false, 32767 & param1);
        } else {
          var4 = this.field_d.b(1, false, param1);
        }
        var3 = new oe();
        if (var4 != null) {
          var3.a((byte) 67, new mg(var4));
        }
        if (param1 >= 32768) {
          var3.b((byte) -77);
        }
        this.field_f.a(var3, (byte) -100, (long)param1);
        return var3;
    }

    final static void a(int param0, int param1) {
        d var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 15968) {
            nh.a((byte) 53);
          }
          var2 = (d) (md.field_h.b((byte) -25));
          while (var2 != null) {
            fa.a(var2, param1, param0 ^ 15999);
            var2 = (d) (md.field_h.d(853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "nh.C(" + param0 + ',' + param1 + ')');
        }
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Wave";
        field_a = "ENERGY";
        field_c = new tl();
    }
}
