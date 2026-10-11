/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends llb {
    llb field_Wb;
    llb field_wb;
    String field_Vb;
    byte[] field_Pb;
    boolean field_xb;
    int field_Db;
    llb field_Jb;
    int field_Kb;
    llb field_Hb;
    int field_ec;
    boolean field_Qb;
    llb field_bc;
    int field_Cb;
    llb field_vb;
    llb[] field_Zb;
    llb field_Tb;
    boolean field_cc;
    llb field_Rb;
    boolean field_Gb;
    int field_Bb;
    boolean field_ac;
    int field_Fb;
    int field_zb;
    llb field_Sb;
    llb field_Mb;
    llb field_Ab;
    long field_Ob;
    llb field_Lb;
    llb field_dc;
    boolean field_fc;
    llb field_Yb;
    long field_Nb;
    boolean field_Xb;
    llb field_yb;
    llb field_Eb;
    String[] field_Ib;
    int field_Ub;

    mm(int param0) {
        super(0L, (llb) null);
        this.field_Pb = new byte[param0];
    }

    final int f(byte param0) {
        if (param0 == -13) {
          return (int)this.c(26390);
        }
        mm var3 = (mm) null;
        this.a((mm) null, -117);
        return (int)this.c(26390);
    }

    final boolean e(byte param0) {
        if (param0 >= 21) {
          return !this.c((byte) 87) ? true : false;
        }
        this.f((byte) -41);
        return !this.c((byte) 87) ? true : false;
    }

    final boolean a(mm param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_63_0 = false;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mm var7 = null;
        try {
          if (!this.field_ac) {
            stackIn_6_0 = (6 == this.field_ec) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (param1 >= -120) {
            var7 = (mm) null;
            this.a((mm) null, -66);
          }
          if (!param0.field_ac) {
            stackIn_14_0 = (param0.field_ec == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          stackIn_17_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_17_0 == var3_int) {
            stackIn_19_0 = var3_int;
            return stackIn_19_0 != 0;
          }
          if (var3_int == 0) {
            if (param0.field_cc != this.field_cc) {
              stackIn_24_0 = this.field_cc;
              return stackIn_24_0;
            }
            if (this.field_cc &&
              this.field_Cb != param0.field_Cb) {
              stackIn_30_0 = !(this.field_Cb >= param0.field_Cb);
              return stackIn_30_0;
            }
          }
          if (param0.field_fc != this.field_fc) {
            stackIn_36_0 = !(this.field_fc);
            return stackIn_36_0;
          }
          if (!this.field_fc) {
            stackIn_41_0 = !(param0.field_Ob <= this.field_Ob);
            return stackIn_41_0;
          }
          if (this.field_Gb) {
            stackIn_48_0 = 1;
          } else {
            stackIn_48_0 = (this.field_Bb == 2) ? 1 : 0;
          }
          var5 = stackIn_48_0;
          if (!param0.field_Gb) {
            stackIn_54_0 = (param0.field_Bb == 2) ? 1 : 0;
          } else {
            stackIn_54_0 = 1;
          }
          var6 = stackIn_54_0;
          stackIn_57_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_57_0 != var5) {
            stackIn_63_0 = !(param0.field_Ob >= this.field_Ob);
            return stackIn_63_0;
          }
          stackIn_59_0 = var5;
          return stackIn_59_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
