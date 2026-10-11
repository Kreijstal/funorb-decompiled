/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends o {
    static String field_m;
    int field_p;
    int field_o;
    static int field_n;
    int field_l;
    int[] field_q;
    int field_j;
    int field_k;
    static lb field_s;
    int field_r;

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        this.field_l = param5;
        this.field_j = param0;
        this.field_k = param6;
        this.field_o = param7;
        this.field_r = param1;
        this.field_q = param3;
        if (param2 != 0) {
          return;
        }
        try {
          this.field_p = param4;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "h.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_s = null;
        if (param0 != 1187598372) {
          int[] var2 = (int[]) null;
          h.a((byte[]) null, -55, 110, (int[]) null, 44);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        pg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Chess.field_G;
        try {
          if (param1 != 0) {
            return;
          }
          var4 = (pg) (nd.field_h.g(-18110));
          while (var4 != null) {
            tm.a(false, var4, param0);
            var4 = (pg) (nd.field_h.a((byte) -122));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "h.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, int param1, int param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          var5_int = 0;
          while (true) {
            if (var5_int >= ge.field_eb.length) {
              if (param2 != 1187598372) {
                h.a(104);
              }
              return;
            }
            param1 = ge.field_eb[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = ve.field_Hb[incrementValue$1];
              dupTemp$2 = param0[param4];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              ve.field_Hb[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("h.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    h() {
    }

    static {
        field_m = "Mute this player for 48 hours";
    }
}
