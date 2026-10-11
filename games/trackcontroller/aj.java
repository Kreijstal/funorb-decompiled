/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fc {
    int field_q;
    int field_n;
    int field_i;
    int field_p;
    int field_l;
    int[] field_o;
    int field_k;
    long field_j;
    static int field_m;
    int field_r;

    final static boolean a(boolean param0, ve param1, ve param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          var3_int = -param1.field_R + param2.field_R;
          if (!param0) {
            return false;
          }
          if (la.field_q != param2.field_ib) {
            if (param2.field_ib == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (la.field_q != param1.field_ib) {
            if (param1.field_ib == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("aj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        if (param0 != 107) {
          field_m = 13;
          return ne.field_a.g(0);
        }
        return ne.field_a.g(0);
    }

    final static void a(byte param0, String param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          vl.field_H = vl.field_H + 1;
          if (param0 >= -117) {
            field_m = -86;
          }
          if (-1 == j.field_c &&
            nk.field_l == -1) {
            nk.field_l = fg.field_a;
            j.field_c = kf.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(nl.field_f));
          } else {
            decompiledFrameRemainder0 = (nl.field_f == null);
          }
          if (decompiledFrameRemainder0) {
            if (!cd.field_j) {
              if (vl.field_H >= ib.field_d) {
                stackIn_19_0 = (kj.field_r + ib.field_d > vl.field_H) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param1 == null) {
              vl.field_H = 0;
            } else {
              if (cd.field_j) {
                vl.field_H = ib.field_d;
              } else {
                if (var2_int == 0) {
                  vl.field_H = 0;
                } else {
                  vl.field_H = ib.field_d;
                }
              }
            }
            field_m = nk.field_l;
            if (param1 != null) {
              cd.field_j = false;
            } else {
              if (var2_int != 0) {
                cd.field_j = true;
              }
            }
            r.field_j = j.field_c;
          }
          nl.field_f = param1;
          if (!cd.field_j &&
            ib.field_d > vl.field_H &&
            mg.field_a) {
            r.field_j = j.field_c;
            vl.field_H = 0;
            field_m = nk.field_l;
          }
          nk.field_l = -1;
          j.field_c = -1;
          if (cd.field_j &&
            vl.field_H == ib.field_f) {
            vl.field_H = 0;
            cd.field_j = false;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("aj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    aj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          fieldTemp$0 = la.field_o;
          la.field_o = la.field_o + 1;
          this.field_q = fieldTemp$0 & 65535;
          this.field_i = param5;
          this.field_k = param3;
          this.field_l = param4;
          this.field_p = param0;
          this.field_r = param2;
          this.field_n = param1;
          this.field_o = param6;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "aj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = -1;
    }
}
