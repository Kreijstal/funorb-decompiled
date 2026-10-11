/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    static ul field_d;
    static int[] field_c;
    static int field_a;
    static String field_b;

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ol.a(param1, false)) {
            return false;
          }
          if (qa.a((byte) 29, param1)) {
            return false;
          }
          if (gn.b((byte) 62, param1)) {
            return false;
          }
          if (param0.length() == 0) {
            return true;
          }
          if (cr.a(param0, param1, param2 ^ 9)) {
            return false;
          }
          if (param2 != -10) {
            return true;
          }
          if (a.a(param1, param0, (byte) -74)) {
            return false;
          }
          if (!ia.a(127, param0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("lb.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_H) {
          return;
        }
        if (-1 == param0) {
          fk.a(hl.field_d[12], true);
        } else {
          if (0 == param2) {
            fk.a(hl.field_d[1], true);
          } else {
            if (param2 == 1) {
              fk.a(hl.field_d[2], true);
            } else {
              if (param2 == 2) {
                fk.a(hl.field_d[3], true);
              } else {
                if (param2 == 3) {
                  fk.a(hl.field_d[4], true);
                } else {
                  if (4 == param2) {
                    fk.a(hl.field_d[1], true);
                  }
                }
              }
            }
          }
        }
        if (!param1) {
          return;
        }
        field_c = (int[]) null;
    }

    final static void a(int param0) {
        if (!ch.field_e) {
          throw new IllegalStateException();
        }
        if (h.field_L != null) {
          h.field_L.m(-7435);
        }
        String var1 = ob.e(-24093);
        b.field_c = new qm(var1, (String) null, true, false, false);
        nb.field_a.b(3016, wj.field_i);
        wj.field_i.a((cf) (b.field_c), (byte) -123);
        if (param0 == 9047) {
          wj.field_i.h((byte) 49);
          return;
        }
        lb.a((byte) -43);
        wj.field_i.h((byte) 49);
    }

    public static void a(byte param0) {
        if (param0 == 43) {
          field_c = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
        field_b = (String) null;
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != 53) {
          return false;
        }
        return 0 <= param1 ? true : false;
    }

    static {
        field_b = "You cannot join this game - it is in progress";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
