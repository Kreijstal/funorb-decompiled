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
        return this.a(param3, param4, ((rb) this).field_Ob.field_R, param5, param0, param1, 99);
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, int param4) {
        L0: {
          if (((rb) this).field_Qb.c(true)) {
            ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db + param3;
            break L0;
          } else {
            break L0;
          }
        }
        if (!((rb) this).field_Qb.i(-14)) {
          L1: {
            if (((rb) this).field_Qb.d((byte) -125)) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db + param4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((rb) this).field_Qb.h(-45)) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db - param4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((rb) this).field_Y) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db - param1;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param2) {
            L4: {
              if (-(((rb) this).field_Pb.field_Db + ((rb) this).field_Pb.field_yb) > ((rb) this).field_Pb.field_R - -((rb) this).field_Pb.field_mb - ((rb) this).field_Ob.field_R) {
                ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb + -(((rb) this).field_Pb.field_R + ((rb) this).field_Pb.field_mb - ((rb) this).field_Ob.field_R);
                break L4;
              } else {
                break L4;
              }
            }
            if (-(((rb) this).field_Pb.field_yb - -((rb) this).field_Pb.field_Db) >= 0) {
              if (((rb) this).field_Qb.e(true)) {
                ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
                ((rb) this).field_Pb.field_Db = 0;
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              } else {
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              }
            } else {
              ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb;
              if (((rb) this).field_Qb.e(true)) {
                ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
                ((rb) this).field_Pb.field_Db = 0;
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              } else {
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              }
            }
          } else {
            if (-(((rb) this).field_Pb.field_Db + ((rb) this).field_Pb.field_yb) >= 0) {
              if (-(((rb) this).field_Pb.field_yb - -((rb) this).field_Pb.field_Db) > ((rb) this).field_Pb.field_R - (-((rb) this).field_Pb.field_mb + ((rb) this).field_Ob.field_R)) {
                ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb + -(-((rb) this).field_Ob.field_R + (((rb) this).field_Pb.field_mb + ((rb) this).field_Pb.field_R));
                if (((rb) this).field_Qb.e(true)) {
                  ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
                  ((rb) this).field_Pb.field_Db = 0;
                  ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                  return;
                } else {
                  ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                  return;
                }
              } else {
                if (((rb) this).field_Qb.e(true)) {
                  ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
                  ((rb) this).field_Pb.field_Db = 0;
                  ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                  return;
                } else {
                  ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                  return;
                }
              }
            } else {
              L5: {
                ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb;
                if (-(((rb) this).field_Pb.field_yb - -((rb) this).field_Pb.field_Db) > ((rb) this).field_Pb.field_R - (-((rb) this).field_Pb.field_mb + ((rb) this).field_Ob.field_R)) {
                  ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb + -(-((rb) this).field_Ob.field_R + (((rb) this).field_Pb.field_mb + ((rb) this).field_Pb.field_R));
                  break L5;
                } else {
                  break L5;
                }
              }
              if (((rb) this).field_Qb.e(true)) {
                ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
                ((rb) this).field_Pb.field_Db = 0;
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              } else {
                ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
                return;
              }
            }
          }
        } else {
          L6: {
            ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db - param3;
            if (((rb) this).field_Qb.d((byte) -125)) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db + param4;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (((rb) this).field_Qb.h(-45)) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db - param4;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (((rb) this).field_Y) {
              ((rb) this).field_Pb.field_Db = ((rb) this).field_Pb.field_Db - param1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (!param2) {
              L10: {
                if (-(((rb) this).field_Pb.field_Db + ((rb) this).field_Pb.field_yb) > ((rb) this).field_Pb.field_R - -((rb) this).field_Pb.field_mb - ((rb) this).field_Ob.field_R) {
                  ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb + -(((rb) this).field_Pb.field_R + ((rb) this).field_Pb.field_mb - ((rb) this).field_Ob.field_R);
                  break L10;
                } else {
                  break L10;
                }
              }
              if (-(((rb) this).field_Pb.field_yb - -((rb) this).field_Pb.field_Db) >= 0) {
                break L9;
              } else {
                ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb;
                break L9;
              }
            } else {
              L11: {
                if (-(((rb) this).field_Pb.field_Db + ((rb) this).field_Pb.field_yb) >= 0) {
                  break L11;
                } else {
                  ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb;
                  break L11;
                }
              }
              if (-(((rb) this).field_Pb.field_yb - -((rb) this).field_Pb.field_Db) > ((rb) this).field_Pb.field_R - (-((rb) this).field_Pb.field_mb + ((rb) this).field_Ob.field_R)) {
                ((rb) this).field_Pb.field_Db = -((rb) this).field_Pb.field_yb + -(-((rb) this).field_Ob.field_R + (((rb) this).field_Pb.field_mb + ((rb) this).field_Pb.field_R));
                break L9;
              } else {
                break L9;
              }
            }
          }
          if (!((rb) this).field_Qb.e(true)) {
            ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
            return;
          } else {
            ((rb) this).field_Pb.field_yb = -((rb) this).field_Qb.a(((rb) this).field_Pb.field_R, param2, 0, ((rb) this).field_Ob.field_R);
            ((rb) this).field_Pb.field_Db = 0;
            ((rb) this).field_Qb.a(113, -((rb) this).field_Pb.field_yb, ((rb) this).field_Pb.field_R, ((rb) this).field_Ob.field_R);
            return;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        ((rb) this).field_Ob.field_Hb = ((rb) this).field_Hb + (-param2 - param1);
        ((rb) this).field_Pb.field_M = 0;
        if (param0) {
          ((rb) this).field_Qb = null;
          ((rb) this).field_Ob.field_R = ((rb) this).field_R;
          ((rb) this).field_Pb.field_Hb = -param1 + ((rb) this).field_Hb + -param2;
          ((rb) this).field_Qb.a(-param2 + ((rb) this).field_Hb, ((rb) this).field_R, 0, param2, ((rb) this).field_Pb.field_R, true, -((rb) this).field_Pb.field_yb, ((rb) this).field_Ob.field_R);
          return;
        } else {
          ((rb) this).field_Ob.field_R = ((rb) this).field_R;
          ((rb) this).field_Pb.field_Hb = -param1 + ((rb) this).field_Hb + -param2;
          ((rb) this).field_Qb.a(-param2 + ((rb) this).field_Hb, ((rb) this).field_R, 0, param2, ((rb) this).field_Pb.field_R, true, -((rb) this).field_Pb.field_yb, ((rb) this).field_Ob.field_R);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 != -1) {
          ((rb) this).field_Ob = null;
          this.a(true, param2, param1, param3, ((rb) this).field_Ob.field_R);
          return;
        } else {
          this.a(true, param2, param1, param3, ((rb) this).field_Ob.field_R);
          return;
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (!param1) {
          if (((rb) this).field_Y) {
            if (param0) {
              var8 = 0;
              ((rb) this).field_Pb.a(-23983, param4, var8 != 0, ((rb) this).field_Ob.field_R);
              this.a(true, param3, false, param5, param2);
              return var8 != 0;
            } else {
              var8 = 1;
              ((rb) this).field_Pb.a(-23983, param4, var8 != 0, ((rb) this).field_Ob.field_R);
              this.a(true, param3, false, param5, param2);
              return var8 != 0;
            }
          } else {
            var8 = 0;
            ((rb) this).field_Pb.a(-23983, param4, var8 != 0, ((rb) this).field_Ob.field_R);
            this.a(true, param3, false, param5, param2);
            return var8 != 0;
          }
        } else {
          var8 = 1;
          ((rb) this).field_Pb.a(-23983, param4, var8 != 0, ((rb) this).field_Ob.field_R);
          this.a(true, param3, false, param5, param2);
          return var8 != 0;
        }
    }

    rb(long param0, hl param1, hl param2, bl param3) {
        super(param0, (hl) null);
        try {
            ((rb) this).field_Ob = new hl(0L, param2);
            ((rb) this).field_Qb = new bl(0L, param3);
            ((rb) this).a((byte) 27, ((rb) this).field_Ob);
            ((rb) this).a((byte) -101, (hl) (Object) ((rb) this).field_Qb);
            ((rb) this).field_Pb = param1;
            ((rb) this).field_Ob.a((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_Nb = null;
        field_Mb = null;
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
            boolean discarded$2 = rb.c(true);
            ((rb) this).field_R = param2;
            ((rb) this).field_Hb = param0;
            ((rb) this).field_yb = param4;
            ((rb) this).field_M = param5;
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
            ((rb) this).field_R = param2;
            ((rb) this).field_Hb = param0;
            ((rb) this).field_yb = param4;
            ((rb) this).field_M = param5;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Seriously offensive language";
        field_Nb = null;
        field_Mb = new Random();
    }
}
