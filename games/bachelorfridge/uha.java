/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends sna {
    sna field_wb;
    sna field_xb;
    sna field_Ib;
    static String field_Vb;
    boolean field_Bb;
    boolean field_Fb;
    long field_Sb;
    int field_Pb;
    sna field_ac;
    sna field_Tb;
    sna field_Qb;
    sna field_yb;
    sna field_Hb;
    String[] field_Cb;
    sna field_cc;
    sna field_Ub;
    boolean field_gc;
    static kv[][] field_Xb;
    sna field_hc;
    byte[] field_Eb;
    long field_Ob;
    sna field_Yb;
    sna field_Gb;
    boolean field_Zb;
    sna field_vb;
    boolean field_dc;
    sna field_Db;
    String field_Jb;
    sna field_fc;
    int field_Rb;
    int field_Lb;
    boolean field_Wb;
    int field_Mb;
    int field_Kb;
    sna[] field_Ab;
    boolean field_zb;
    int field_ec;
    int field_bc;
    int field_Nb;

    public static void g(byte param0) {
        if (param0 <= 32) {
          field_Vb = (String) null;
          field_Vb = null;
          field_Xb = (kv[][]) null;
          return;
        }
        field_Vb = null;
        field_Xb = (kv[][]) null;
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        mh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param0, (byte) 90);
          if (param1 != -7) {
            uha.g((byte) 6);
          }
          stackIn_5_0 = (param0.b(16711935) == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = new mh(var2, var3 != 0);
          return (pp) ((Object) stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("uha.BA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, uha param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_23_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_36_1 = 0;
        boolean stackIn_41_0 = false;
        boolean stackIn_48_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_70_0 = false;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lu var7 = null;
        try {
          if (!this.field_Wb) {
            stackIn_6_0 = (this.field_ec == 6) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param1.field_Wb) {
            stackIn_12_0 = (param1.field_ec == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          stackIn_14_0 = var4;
          if (var3_int != 0) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if (stackIn_14_0 == stackIn_15_1) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0 != 0;
          }
          if (var3_int == 0) {
            if (param1.field_zb != this.field_zb) {
              stackIn_23_0 = this.field_zb;
              return stackIn_23_0;
            }
            if (this.field_zb &&
              this.field_Kb != param1.field_Kb) {
              stackIn_29_0 = !(this.field_Kb >= param1.field_Kb);
              return stackIn_29_0;
            }
          }
          stackIn_33_0 = (param1.field_Zb) ? 0 : 1;
          if (this.field_Zb) {
            stackIn_36_1 = 0;
          } else {
            stackIn_36_1 = 1;
          }
          if (stackIn_33_0 != stackIn_36_1) {
            stackIn_41_0 = !(this.field_Zb);
            return stackIn_41_0;
          }
          if (param0 != -7) {
            var7 = (lu) null;
            uha.b((lu) null, -6);
          }
          if (!this.field_Zb) {
            stackIn_48_0 = !(this.field_Ob >= param1.field_Ob);
            return stackIn_48_0;
          }
          if (this.field_Fb) {
            stackIn_55_0 = 1;
          } else {
            stackIn_55_0 = (2 == this.field_Lb) ? 1 : 0;
          }
          var5 = stackIn_55_0;
          if (!param1.field_Fb) {
            stackIn_61_0 = (2 == param1.field_Lb) ? 1 : 0;
          } else {
            stackIn_61_0 = 1;
          }
          var6 = stackIn_61_0;
          stackIn_63_0 = var5;
          if (var6 != 0) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          if (stackIn_63_0 != stackIn_64_1) {
            stackIn_70_0 = !(this.field_Ob <= param1.field_Ob);
            return stackIn_70_0;
          }
          stackIn_66_0 = var5;
          return stackIn_66_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("uha.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final int f(byte param0) {
        if (param0 >= -44) {
          return -126;
        }
        return (int)this.d(-115);
    }

    uha(int param0) {
        super(0L, (sna) null);
        this.field_Eb = new byte[param0];
    }

    final boolean f(int param0) {
        if (param0 >= 24) {
          return !this.a(0) ? true : false;
        }
        this.field_Zb = true;
        return !this.a(0) ? true : false;
    }

    static {
        field_Vb = "Public";
    }
}
