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
        L0: {
          if (this.field_Qb.c(true)) {
            this.field_Pb.field_Db = this.field_Pb.field_Db + param3;
            break L0;
          } else {
            break L0;
          }
        }
        if (!this.field_Qb.i(-14)) {
          L1: {
            if (this.field_Qb.d((byte) -125)) {
              this.field_Pb.field_Db = this.field_Pb.field_Db + param4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (this.field_Qb.h(-45)) {
              this.field_Pb.field_Db = this.field_Pb.field_Db - param4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (this.field_Y) {
              this.field_Pb.field_Db = this.field_Pb.field_Db - param1;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param2) {
            L4: {
              if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) > this.field_Pb.field_R - -this.field_Pb.field_mb - this.field_Ob.field_R) {
                this.field_Pb.field_Db = -this.field_Pb.field_yb + -(this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R);
                break L4;
              } else {
                break L4;
              }
            }
            if ((-(this.field_Pb.field_yb - -this.field_Pb.field_Db) ^ -1) <= -1) {
              if (this.field_Qb.e(param0)) {
                this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
                this.field_Pb.field_Db = 0;
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              } else {
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              }
            } else {
              this.field_Pb.field_Db = -this.field_Pb.field_yb;
              if (this.field_Qb.e(param0)) {
                this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
                this.field_Pb.field_Db = 0;
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              } else {
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              }
            }
          } else {
            if ((-(this.field_Pb.field_Db + this.field_Pb.field_yb) ^ -1) <= -1) {
              if (-(this.field_Pb.field_yb - -this.field_Pb.field_Db) > this.field_Pb.field_R - (-this.field_Pb.field_mb + this.field_Ob.field_R)) {
                this.field_Pb.field_Db = -this.field_Pb.field_yb + -(-this.field_Ob.field_R + (this.field_Pb.field_mb + this.field_Pb.field_R));
                if (this.field_Qb.e(param0)) {
                  this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
                  this.field_Pb.field_Db = 0;
                  this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                  return;
                } else {
                  this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                  return;
                }
              } else {
                if (this.field_Qb.e(param0)) {
                  this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
                  this.field_Pb.field_Db = 0;
                  this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                  return;
                } else {
                  this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                  return;
                }
              }
            } else {
              L5: {
                this.field_Pb.field_Db = -this.field_Pb.field_yb;
                if (-(this.field_Pb.field_yb - -this.field_Pb.field_Db) > this.field_Pb.field_R - (-this.field_Pb.field_mb + this.field_Ob.field_R)) {
                  this.field_Pb.field_Db = -this.field_Pb.field_yb + -(-this.field_Ob.field_R + (this.field_Pb.field_mb + this.field_Pb.field_R));
                  break L5;
                } else {
                  break L5;
                }
              }
              if (this.field_Qb.e(param0)) {
                this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
                this.field_Pb.field_Db = 0;
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              } else {
                this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
                return;
              }
            }
          }
        } else {
          L6: {
            this.field_Pb.field_Db = this.field_Pb.field_Db - param3;
            if (this.field_Qb.d((byte) -125)) {
              this.field_Pb.field_Db = this.field_Pb.field_Db + param4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (this.field_Qb.h(-45)) {
              this.field_Pb.field_Db = this.field_Pb.field_Db - param4;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (this.field_Y) {
              this.field_Pb.field_Db = this.field_Pb.field_Db - param1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (!param2) {
              L10: {
                if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) > this.field_Pb.field_R - -this.field_Pb.field_mb - this.field_Ob.field_R) {
                  this.field_Pb.field_Db = -this.field_Pb.field_yb + -(this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R);
                  break L10;
                } else {
                  break L10;
                }
              }
              if ((-(this.field_Pb.field_yb - -this.field_Pb.field_Db) ^ -1) <= -1) {
                break L9;
              } else {
                this.field_Pb.field_Db = -this.field_Pb.field_yb;
                break L9;
              }
            } else {
              L11: {
                if ((-(this.field_Pb.field_Db + this.field_Pb.field_yb) ^ -1) <= -1) {
                  break L11;
                } else {
                  this.field_Pb.field_Db = -this.field_Pb.field_yb;
                  break L11;
                }
              }
              if (-(this.field_Pb.field_yb - -this.field_Pb.field_Db) > this.field_Pb.field_R - (-this.field_Pb.field_mb + this.field_Ob.field_R)) {
                this.field_Pb.field_Db = -this.field_Pb.field_yb + -(-this.field_Ob.field_R + (this.field_Pb.field_mb + this.field_Pb.field_R));
                break L9;
              } else {
                break L9;
              }
            }
          }
          if (!this.field_Qb.e(param0)) {
            this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
            return;
          } else {
            this.field_Pb.field_yb = -this.field_Qb.a(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
            this.field_Pb.field_Db = 0;
            this.field_Qb.a(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
            return;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_Ob.field_Hb = this.field_Hb + (-param2 - param1);
        this.field_Pb.field_M = 0;
        if (param0) {
          this.field_Qb = (bl) null;
          this.field_Ob.field_R = this.field_R;
          this.field_Pb.field_Hb = -param1 + this.field_Hb + -param2;
          this.field_Qb.a(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
          return;
        } else {
          this.field_Ob.field_R = this.field_R;
          this.field_Pb.field_Hb = -param1 + this.field_Hb + -param2;
          this.field_Qb.a(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 != -1) {
          this.field_Ob = (hl) null;
          this.a(true, param2, param1, param3, this.field_Ob.field_R);
          return;
        } else {
          this.a(true, param2, param1, param3, this.field_Ob.field_R);
          return;
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (param1) {
          var8 = 1;
          this.field_Pb.a(-23983, param4, var8 != 0, this.field_Ob.field_R);
          this.a(true, param3, false, param5, param2);
          if (param6 <= 45) {
            field_Kb = (hl) null;
            return var8 != 0;
          } else {
            return var8 != 0;
          }
        } else {
          if (this.field_Y) {
            if (!param0) {
              var8 = 1;
              this.field_Pb.a(-23983, param4, var8 != 0, this.field_Ob.field_R);
              this.a(true, param3, false, param5, param2);
              if (param6 <= 45) {
                field_Kb = (hl) null;
                return var8 != 0;
              } else {
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_Pb.a(-23983, param4, var8 != 0, this.field_Ob.field_R);
              this.a(true, param3, false, param5, param2);
              if (param6 <= 45) {
                field_Kb = (hl) null;
                return var8 != 0;
              } else {
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            this.field_Pb.a(-23983, param4, var8 != 0, this.field_Ob.field_R);
            this.a(true, param3, false, param5, param2);
            if (param6 <= 45) {
              field_Kb = (hl) null;
              return var8 != 0;
            } else {
              return var8 != 0;
            }
          }
        }
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
        boolean discarded$0 = false;
        field_Nb = null;
        field_Mb = null;
        if (param0 >= -104) {
            discarded$0 = rb.c(true);
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
        boolean discarded$2 = false;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param3) {
          L0: {
            discarded$2 = rb.c(true);
            this.field_R = param2;
            this.field_Hb = param0;
            this.field_yb = param4;
            this.field_M = param5;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (param3) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          this.a(stackIn_8_1 != 0, param6, param1);
          return;
        } else {
          L1: {
            this.field_R = param2;
            this.field_Hb = param0;
            this.field_yb = param4;
            this.field_M = param5;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param3) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          this.a(stackIn_4_1 != 0, param6, param1);
          return;
        }
    }

    static {
        field_Lb = "Seriously offensive language";
        field_Nb = null;
        field_Mb = new Random();
    }
}
