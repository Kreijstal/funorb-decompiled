/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sqb extends fh {
    int field_p;
    static phb[] field_o;
    int field_l;
    int field_n;
    int field_q;
    int field_k;
    int field_m;

    final static tv[] a(tv[] param0, tv[] param1, int param2, dja param3, boolean param4) {
        int var5_int = 0;
        tv dupTemp$0 = null;
        tv[] stackIn_10_0 = null;
        tv[] stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        tv var6 = null;
        tv var7 = null;
        int var8 = 0;
        tv var9 = null;
        tv var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 == null ||
            param0.length != param1.length) {
            param0 = param3.a(11995, param1.length);
          }
          if (param4) {
            stackIn_10_0 = (tv[]) null;
            return stackIn_10_0;
          }
          for (var5_int = 0; param1.length > var5_int; var5_int++) {
            var6 = param1[var5_int];
            if (var6 != null) {
              var7 = param0[var5_int];
              if (var7 == null) {
                dupTemp$0 = param3.a((byte) -124);
                param0[var5_int] = dupTemp$0;
                var7 = dupTemp$0;
              }
              var8 = param2;
              var9 = var6;
              var10 = var7;
              if (var8 == 1) {
                var9.b((byte) 124, var10);
              } else {
                if (2 == var8) {
                  ((tva) (var9)).a(var10, 29106);
                } else {
                  if (var8 == 3) {
                    ((sjb) (var9)).a(var10, (byte) 39);
                  }
                }
              }
            } else {
              param0[var5_int] = null;
            }
          }
          stackIn_28_0 = (tv[]) (param0);
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("sqb.A(");
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
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 <= 42) {
          field_o = (phb[]) null;
        }
        if (param2 == 0) {
          if (param0 == 0) {
            return 0;
          }
          if (0 <= param0) {
            return 2048;
          }
          return -2048;
        }
        if (param2 >= 0) {
          if (0 == param0) {
            return 0;
          }
          if (0 <= param0) {
            return kq.a(param0, param2, 11105);
          }
          return -kq.a(-param0, param2, 11105);
        }
        if (0 == param0) {
          return 4096;
        }
        if (param0 < 0) {
          return -4096 + kq.a(-param0, -param2, 11105);
        }
        return -kq.a(param0, -param2, 11105) + 4096;
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
          sqb.a(2, -61, -79);
        }
    }

    sqb() {
    }

    static {
    }
}
