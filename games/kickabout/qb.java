/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends hd {
    hd field_Rb;
    static String[] field_Qb;
    hd field_kc;
    hd field_Bb;
    hd field_Lb;
    int field_Ab;
    hd field_fc;
    boolean field_Cb;
    hd field_dc;
    boolean field_Tb;
    hd field_zb;
    hd field_jc;
    long field_Nb;
    long field_Fb;
    int field_Mb;
    boolean field_Ub;
    hd field_Zb;
    hd field_Hb;
    hd field_Ib;
    int field_Db;
    boolean field_ic;
    hd field_Gb;
    hd field_cc;
    int field_ac;
    int field_bc;
    hd field_Yb;
    hd field_Jb;
    hd field_Pb;
    boolean field_Xb;
    byte[] field_Eb;
    boolean field_hc;
    String[] field_Kb;
    static String field_Vb;
    String field_ec;
    static String field_lc;
    boolean field_yb;
    int field_gc;
    hd[] field_Sb;
    int field_Wb;
    int field_Ob;

    final int h(byte param0) {
        int var2 = 106 % ((35 - param0) / 37);
        return (int)this.f((byte) 98);
    }

    public static void a(int param0) {
        field_Qb = null;
        field_Vb = null;
        field_lc = null;
        if (param0 != -7) {
          field_Vb = (String) null;
        }
    }

    final boolean a(int param0, qb param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        boolean stackIn_31_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        boolean stackIn_57_0 = false;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qb var7 = null;
        try {
          if (param0 != 20724) {
            var7 = (qb) null;
            this.a(89, (qb) null);
          }
          if (!this.field_hc) {
            stackIn_8_0 = (this.field_Ab == 6) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var3_int = stackIn_8_0;
          if (!param1.field_hc) {
            stackIn_14_0 = (param1.field_Ab == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          if (var3_int != var4) {
            stackIn_17_0 = var3_int;
            return stackIn_17_0 != 0;
          }
          if (var3_int == 0) {
            stackIn_22_0 = (this.field_Xb) ? 0 : 1;
            if (stackIn_22_0 == (param1.field_Xb ? 1 : 0)) {
              stackIn_25_0 = this.field_Xb;
              return stackIn_25_0;
            }
            if (this.field_Xb &&
              param1.field_Wb != this.field_Wb) {
              stackIn_31_0 = !(this.field_Wb >= param1.field_Wb);
              return stackIn_31_0;
            }
          }
          if (param1.field_Cb != this.field_Cb) {
            stackIn_37_0 = !(this.field_Cb);
            return stackIn_37_0;
          }
          if (!this.field_Cb) {
            stackIn_61_0 = !(this.field_Fb >= param1.field_Fb);
            return stackIn_61_0;
          }
          if (this.field_ic) {
            stackIn_45_0 = 1;
          } else {
            stackIn_45_0 = (this.field_Mb == 2) ? 1 : 0;
          }
          var5 = stackIn_45_0;
          if (!param1.field_ic) {
            stackIn_51_0 = (param1.field_Mb == 2) ? 1 : 0;
          } else {
            stackIn_51_0 = 1;
          }
          var6 = stackIn_51_0;
          if (var5 == var6) {
            stackIn_57_0 = !(this.field_Fb <= param1.field_Fb);
            return stackIn_57_0;
          }
          stackIn_53_0 = var5;
          return stackIn_53_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_64_0 = var3;
          stackIn_64_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 == -7) {
          return !this.a((byte) -60) ? true : false;
        }
        this.field_Db = 32;
        return !this.a((byte) -60) ? true : false;
    }

    qb(int param0) {
        super(0L, (hd) null);
        this.field_Eb = new byte[param0];
    }

    static {
        field_lc = "<%0> has lost connection.";
        field_Vb = "goals";
    }
}
