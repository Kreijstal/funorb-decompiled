/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rob extends rqa {
    static byte[] field_o;
    static String field_p;
    static llb field_q;

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        ds var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var9 = new ds(param1);
          var3 = var9.e((byte) -93);
          var4 = var9.h(38);
          if (var4 >= param0 && (ph.field_o == 0 ||
            !(var4 > ph.field_o))) {
            if (0 == var3) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(0, var12, (byte) -59, var4);
              stackIn_7_0 = var5_ref_byte__;
              return stackIn_7_0;
            }
            var5 = var9.h(119);
            if (var5 >= 0 && (ph.field_o == 0 ||
              !(var5 > ph.field_o))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 != var3) {
                var7 = oaa.field_h;
                synchronized (var7) {
                  oaa.field_h.a(20773, var13, var9);
                }
              } else {
                cv.a(var13, var5, param1, var4, 9);
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("rob.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_o = (byte[]) null;
          }
          stackIn_3_0 = new nc(frb.a(194, 127));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rob.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 >= -22) {
          field_p = (String) null;
        }
    }

    final static String a(int param0, int[] param1) {
        int var3 = 0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = new byte[1 + param1.length];
          var2 = var5;
          var5[0] = tcb.field_p;
          for (var3 = 0; var3 < param1.length; var3++) {
            var5[var3 + 1] = (byte)param1[var3];
          }
          if (param0 == 65535) {
            stackIn_8_0 = fb.a(var2, (byte) -116);
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("rob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    rob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int incrementValue$0 = 0;
        field_o = new byte[32896];
        int var0 = 0;
        for (var1 = 0; var1 < 256; var1++) {
          for (var2 = 0; var1 >= var2; var2++) {
            incrementValue$0 = var0;
            var0++;
            field_o[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + var1 * var1 + var2 * var2) / 65535.0f)));
          }
        }
        field_p = "DESTROY THE DRONES";
    }
}
