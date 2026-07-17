/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ksa {
    ksa field_c;
    ksa field_a;
    long field_b;

    final boolean b(byte param0) {
        if (param0 == -63) {
          if (((ksa) this).field_a == null) {
            return false;
          } else {
            return true;
          }
        } else {
          int discarded$8 = ksa.a(-99, -70, 95, 66);
          if (((ksa) this).field_a == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(phb[] param0, int param1, int param2, phb[] param3, phb[] param4, int param5, int param6, int param7, int param8, no param9, int param10, int param11, int param12, int param13, int param14) {
        int var15_int = param9.field_A + param9.field_o;
        int var16 = param9.field_o;
        try {
            dia.a(0, 8, 0, param9, var16, param3, 8555923, param14, var15_int, 15658751, var15_int, param4, 0, var16, param9, 15658751, param10, 83, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ksa.OB(" + (param0 != null ? "{...}" : "null") + 44 + 8 + 44 + 0 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + 8555923 + 44 + 0 + 44 + 15658751 + 44 + 15658751 + 44 + (param9 != null ? "{...}" : "null") + 44 + param10 + 44 + 0 + 44 + 0 + 44 + -14109 + 44 + param14 + 41);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
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
            int discarded$14 = ksa.a(-107, -16, 102, -117);
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
        if (((ksa) this).field_a != null) {
          ((ksa) this).field_a.field_c = ((ksa) this).field_c;
          if (param0 != -3846) {
            return;
          } else {
            ((ksa) this).field_c.field_a = ((ksa) this).field_a;
            ((ksa) this).field_a = null;
            ((ksa) this).field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    final static faa a(byte param0) {
        return new faa(wi.a((byte) 73, (ds) (Object) bk.field_w));
    }

    static {
    }
}
