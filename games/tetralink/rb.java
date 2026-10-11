/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb extends hl {
    bl field_Qb;
    static Random field_Mb;
    static String field_Lb;
    static String field_Nb;
    hl field_Ob;
    hl field_Pb;
    static hl field_Kb;

    final boolean a(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int var7 = 30 / ((-77 - param2) / 39);
        return this.a(param3, param4, this.field_Ob.field_R, param5, param0, param1, 99);
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4) {
        if (this.field_Qb.c(true)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db + param3;
        }
        if (this.field_Qb.i(-14)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param3;
        }
        if (this.field_Qb.d((byte) -125)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db + param4;
        }
        if (this.field_Qb.h(-45)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param4;
        }
        if (this.field_Y) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param1;
        }
        if (!param2) {
          if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) > this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb - (this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R);
          }
          if (-(this.field_Pb.field_yb + this.field_Pb.field_Db) < 0) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb;
          }
        } else {
          if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) < 0) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb;
          }
          if (-(this.field_Pb.field_yb + this.field_Pb.field_Db) > this.field_Pb.field_R - (-this.field_Pb.field_mb + this.field_Ob.field_R)) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb - (-this.field_Ob.field_R + (this.field_Pb.field_mb + this.field_Pb.field_R));
          }
        }
        if (this.field_Qb.e(param0)) {
          this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
          this.field_Pb.field_Db = 0;
        }
        this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_Ob.field_Hb = this.field_Hb + (-param2 - param1);
        this.field_Pb.field_M = 0;
        if (!param0) {
          this.field_Ob.field_R = this.field_R;
          this.field_Pb.field_Hb = -param1 + this.field_Hb - param2;
          this.field_Qb.a(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
          return;
        }
        this.field_Qb = (bl) null;
        this.field_Ob.field_R = this.field_R;
        this.field_Pb.field_Hb = -param1 + this.field_Hb - param2;
        this.field_Qb.a(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 == -1) {
          this.a(true, param2, param1, param3, this.field_Ob.field_R);
          return;
        }
        this.field_Ob = (hl) null;
        this.a(true, param2, param1, param3, this.field_Ob.field_R);
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param1) {
          if (!this.field_Y) {
            var8 = 0;
            this.field_Pb.a(-23983, param4, var8 != 0, this.field_Ob.field_R);
            this.a(true, param3, false, param5, param2);
            if (param6 > 45) {
              return var8 != 0;
            }
            field_Kb = (hl) null;
            return var8 != 0;
          }
          if (param0) {
            var8Lifetime2 = 0;
            this.field_Pb.a(-23983, param4, var8Lifetime2 != 0, this.field_Ob.field_R);
            this.a(true, param3, false, param5, param2);
            if (param6 > 45) {
              return var8Lifetime2 != 0;
            }
            field_Kb = (hl) null;
            return var8Lifetime2 != 0;
          }
          var8Lifetime3 = 1;
          this.field_Pb.a(-23983, param4, var8Lifetime3 != 0, this.field_Ob.field_R);
          this.a(true, param3, false, param5, param2);
          if (param6 > 45) {
            return var8Lifetime3 != 0;
          }
          field_Kb = (hl) null;
          return var8Lifetime3 != 0;
        }
        var8Lifetime1 = 1;
        this.field_Pb.a(-23983, param4, var8Lifetime1 != 0, this.field_Ob.field_R);
        this.a(true, param3, false, param5, param2);
        if (param6 > 45) {
          return var8Lifetime1 != 0;
        }
        field_Kb = (hl) null;
        return var8Lifetime1 != 0;
    }

    rb(long param0, hl param1, hl param2, bl param3) {
        super(param0, (hl) null);
        try {
          this.field_Ob = new hl(0L, param2);
          this.field_Qb = new bl(0L, param3);
          this.a((byte) 27, this.field_Ob);
          this.a((byte) -101, this.field_Qb);
          this.field_Pb = param1;
          this.field_Ob.a((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_Nb = null;
        field_Mb = null;
        if (param0 >= -104) {
          rb.c(true);
          field_Lb = null;
          field_Kb = null;
          return;
        }
        field_Lb = null;
        field_Kb = null;
    }

    final static boolean c(boolean param0) {
        if (param0) {
          return true;
        }
        return vj.field_q;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param3) {
          this.field_R = param2;
          this.field_Hb = param0;
          this.field_yb = param4;
          this.field_M = param5;
          this.a(!param3 ? true : false, param6, param1);
          return;
        }
        rb.c(true);
        this.field_R = param2;
        this.field_Hb = param0;
        this.field_yb = param4;
        this.field_M = param5;
        this.a(!param3 ? true : false, param6, param1);
    }

    static {
        field_Lb = "Seriously offensive language";
        field_Nb = null;
        field_Mb = new Random();
    }
}
