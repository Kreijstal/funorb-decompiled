/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends bp {
    static long field_Kb;
    static String field_Jb;
    static tk field_Hb;
    static int[] field_Ib;

    private final void a(int param0, int param1, int param2) {
        sr var4 = this.field_zb[param2];
        if (param1 == -23061) {
          if (var4 != null) {
            if (this.field_Db == param2) {
              var4.a(true, 125);
            }
            this.field_Db = param2;
          }
          return;
        }
        jh.a(108, (byte) -45);
        if (var4 != null) {
          if (this.field_Db == param2) {
            var4.a(true, 125);
          }
          this.field_Db = param2;
        }
    }

    final void b(int param0, int param1) {
        this.a(0, -23061, param0);
        if (param1 < 97) {
          this.a(117, -16, -93);
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 != -25) {
          jh.a(-62, (byte) -61);
          sb.field_h[4] = param0;
          return;
        }
        sb.field_h[4] = param0;
    }

    jh(int[] param0, String[] param1, sr[] param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void k(byte param0) {
        if (param0 != 68) {
          return;
        }
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
    }

    final static lk a(q param0, int param1) throws fi {
        lk stackIn_3_0 = null;
        lk stackIn_10_0 = null;
        lk stackIn_23_0 = null;
        lk stackIn_28_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        lk var5 = null;
        lk var6 = null;
        lk var7 = null;
        var4 = Kickabout.field_G;
        try {
          if (param1 != 1422) {
            stackIn_3_0 = (lk) null;
            return stackIn_3_0;
          }
          var5 = param0.a((byte) 82);
          if (rb.field_Mb != var5.field_k &&
            var5.field_k != v.field_d &&
            pv.field_H != var5.field_k &&
            ra.field_N != var5.field_k) {
            if (var5.field_k != vu.field_Ab) {
              throw new fi(var5.field_f);
            }
            if (param0.a(6)) {
              throw new fi(var5.field_f);
            }
            var6 = param0.a((byte) 94);
            if (si.field_g != var6.field_k) {
              throw new fi(var6.field_f);
            }
            var5.field_j = new tf();
            while (true) {
              if (param0.a(6)) {
                throw new fi(var5.field_f);
              }
              if (param0.a((byte) 90).field_k == og.field_c) {
                stackIn_23_0 = var5;
                return stackIn_23_0;
              }
              param0.field_a = param0.field_a - 1;
              var5.field_j.a(jh.a(param0, 1422), 3);
              if (param0.a(6)) {
                throw new fi(var5.field_f);
              }
              var7 = param0.a((byte) 72);
              if (og.field_c == var7.field_k) {
                stackIn_28_0 = var5;
                return stackIn_28_0;
              }
              if (var7.field_k == bp.field_Gb) {
                continue;
              }
              break;
            }
            throw new fi(var7.field_f);
          }
          stackIn_10_0 = var5;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("jh.D(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Jb = "<%0> auction selected";
        field_Ib = new int[74];
        field_Ib[12] = 4;
        field_Ib[30] = 2;
        field_Ib[41] = -2;
        field_Ib[14] = 7;
        field_Ib[18] = 4;
        field_Ib[33] = 4;
        field_Ib[32] = 2;
        field_Ib[20] = 7;
        field_Ib[45] = 4;
        field_Ib[21] = 7;
        field_Ib[17] = 4;
        field_Ib[2] = 4;
        field_Ib[28] = -2;
        field_Ib[16] = 2;
        field_Ib[11] = 4;
        field_Ib[19] = 7;
        field_Ib[3] = 7;
        field_Ib[29] = -2;
        field_Ib[43] = -2;
        field_Ib[13] = 7;
        field_Ib[31] = -2;
        field_Ib[15] = 7;
        field_Ib[10] = 2;
        field_Ib[40] = -2;
        field_Ib[44] = 2;
        field_Ib[1] = 2;
        field_Ib[42] = 2;
    }
}
