/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static boolean field_e;
    static ma field_a;
    static int[] field_b;
    static String field_d;
    static oh field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 >= -90) {
          ac.a(107, -51, false, 107);
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 < 97) {
          return false;
        }
        if (122 >= param1) {
          return true;
        }
        return false;
    }

    final static boolean a(int param0) {
        if (param0 != -19403) {
          ac.a((byte) 73, '~');
          if (fn.field_R < 10) {
            return false;
          }
          if (13 <= vd.field_a) {
            return true;
          }
          return false;
        }
        if (fn.field_R < 10) {
          return false;
        }
        if (13 <= vd.field_a) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        hd.field_v = 0;
        ed.field_O = param0;
        pf.field_d = param3;
        if (qb.a(ed.field_O, (byte) 114)) {
          var4 = 0;
          kk.field_X[ed.field_O].b(param2, var4, -1);
        }
        if (param1 <= -64) {
          if (ed.field_O == -4) {
            cl.field_g = 2;
            im.field_e = 3.1415927410125732f;
            ok.field_d = 84.0f;
          }
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 > -88) {
          return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, byte[] param1, int param2, bh param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var10Lifetime1;
        var11 = TetraLink.field_J;
        try {
          var7_int = k.a(false, param2);
          var9 = -127 / ((param0 - 47) / 35);
          if (null == re.field_R) {
            re.field_R = new java.security.SecureRandom();
          }
          var14 = new int[4];
          var13 = var14;
          var8 = var13;
          for (var10 = 0; 4 > var10; var10++) {
            var8[var10] = re.field_R.nextInt();
          }
          if (null == ug.field_hb ||
            !(var7_int <= ug.field_hb.field_u.length)) {
            ug.field_hb = new bh(var7_int);
          }
          ug.field_hb.field_t = 0;
          ug.field_hb.a(param4, 128, param1, param2);
          ug.field_hb.b((byte) -71, var7_int);
          ug.field_hb.a(10830, var14);
          if (null == ce.field_f ||
            !(100 <= ce.field_f.field_u.length)) {
            ce.field_f = new bh(100);
          }
          ce.field_f.field_t = 0;
          ce.field_f.a(10, false);
          var12 = 0;
          var10Lifetime1 = var12;
          while (4 > var12) {
            ce.field_f.d(var14[var12], (byte) -124);
            var12++;
          }
          ce.field_f.b(param2, false);
          ce.field_f.a(param5, param6, -25035);
          param3.a(0, 128, ce.field_f.field_u, ce.field_f.field_t);
          param3.a(0, 128, ug.field_hb.field_u, ug.field_hb.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_d = "This password contains repeated characters, and would be easy to guess";
    }
}
