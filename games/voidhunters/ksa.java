/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ksa {
    ksa field_c;
    ksa field_a;
    long field_b;

    final boolean b(byte param0) {
        int discarded$8 = 0;
        if (param0 == -63) {
          if (this.field_a == null) {
            return false;
          } else {
            return true;
          }
        } else {
          discarded$8 = ksa.a(-99, -70, 95, 66);
          if (this.field_a == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(phb[] param0, int param1, int param2, phb[] param3, phb[] param4, int param5, int param6, int param7, int param8, no param9, int param10, int param11, int param12, int param13, int param14) {
        int var15_int = param9.field_A + param9.field_o;
        int var16 = param9.field_o;
        if (param13 != -14109) {
            return;
        }
        try {
            dia.a(param6, param1, param2, param9, var16, param3, param5, param14, var15_int, param8, var15_int, param4, param12, var16, param9, param7, param10, param13 + 14192, param11, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ksa.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int discarded$14 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 31123) {
          L0: {
            discarded$14 = ksa.a(-107, -16, 102, -117);
            if (param1 <= param3) {
              if (param3 > param2) {
                stackOut_11_0 = param2;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = param3;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = param1;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (param1 <= param3) {
              if (param3 > param2) {
                stackOut_5_0 = param2;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = param3;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = param1;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    final void b(int param0) {
        if (this.field_a != null) {
          this.field_a.field_c = this.field_c;
          if (param0 != -3846) {
            return;
          } else {
            this.field_c.field_a = this.field_a;
            this.field_a = null;
            this.field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    final static faa a(byte param0) {
        no var2 = null;
        if (param0 != -6) {
          var2 = (no) null;
          ksa.a((phb[]) null, 27, -49, (phb[]) null, (phb[]) null, 58, 92, 102, -42, (no) null, 125, 6, -7, 73, -90);
          return new faa(wi.a((byte) 73, bk.field_w));
        } else {
          return new faa(wi.a((byte) 73, bk.field_w));
        }
    }

    static {
    }
}
