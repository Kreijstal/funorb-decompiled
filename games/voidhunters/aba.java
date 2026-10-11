/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aba {
    static dja field_b;
    static aw field_a;

    final static void a(lbb param0, wm[] param1, lta param2, int param3, byte param4, int param5, rsb param6) {
        int var8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        wm var9 = null;
        int var11 = 0;
        anb var12 = null;
        int var13 = 0;
        iia var14 = null;
        vp var15 = null;
        Object var16 = null;
        anb var17 = null;
        cq var18 = null;
        anb var19 = null;
        anb var20 = null;
        cc var21 = null;
        var16 = null;
        var13 = VoidHunters.field_G;
        try {
          var7_int = 43 / ((param4 + 6) / 39);
          for (var8 = 0; param1.length > var8; var8++) {
            var9 = param1[var8];
            if (!(var9 instanceof iia)) {
              if (var9 instanceof cc) {
                var21 = (cc) (var9);
                var11 = var21.a((byte) -123, 0);
                var20 = param6.field_g.d((byte) -27, var11);
                var12 = var20;
                if (var20 != null) {
                  if (param3 == param5) {
                    uba.a((byte) -100, 0, var20);
                  } else {
                    uba.a((byte) -100, 1, var20);
                  }
                }
              } else {
                if (var9 instanceof vp) {
                  var15 = (vp) (var9);
                  var11 = var15.a((byte) -106, 1);
                  var19 = param6.field_g.g((byte) 118, var11);
                  var12 = var19;
                  if (var19 != null) {
                    if (param3 != param5) {
                      uba.a((byte) -100, 1, var19);
                    } else {
                      uba.a((byte) -100, 3, var19);
                    }
                  }
                }
              }
            } else {
              var14 = (iia) (var9);
              if (param3 == param5) {
                var11 = var14.a((byte) -122, 0);
                var17 = param6.field_g.d((byte) -27, var11);
                if (var17 != null) {
                  uba.a((byte) -100, 2, var17);
                }
              }
              var11 = var14.a((byte) -124, 1);
              var18 = param6.field_g.e((byte) -79, var11);
              if (var18 != null) {
                if (param0.e(8) == 3) {
                  var18.a(32, qpb.a(false, param3, 13894143), param2);
                } else {
                  if (param5 == param3) {
                    uba.a((byte) -100, 2, var18);
                    var18.a(32, qpb.a(false, param3, 13894143), param2);
                  } else {
                    var18.a(32, qpb.a(false, param3, 13894143), param2);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_31_0 = var7;
          stackIn_31_1 = new StringBuilder().append("aba.A(");
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
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == -3696) {
          field_b = null;
          return;
        }
        rsb var2 = (rsb) null;
        aba.a((lbb) null, (wm[]) null, (lta) null, -51, (byte) -22, -26, (rsb) null);
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new byte[param1];
          var3 = var4;
          if (param2 != -28321) {
            field_b = (dja) null;
          }
          cua.a(param0, 0, var4, 0, param1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("aba.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = (dja) ((Object) new beb());
    }
}
