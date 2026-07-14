/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends qf {
    static int field_j;
    static int field_k;

    final String a(String param0, boolean param1) {
        Object var4 = null;
        if (((mh) this).a(param0, -26188) == sb.field_n) {
          return il.field_f;
        } else {
          if (param1) {
            var4 = null;
            String discarded$2 = ((mh) this).a((String) null, false);
            return wi.field_a;
          } else {
            return wi.field_a;
          }
        }
    }

    final p a(String param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 == -26188) {
          L0: {
            if (null != ng.a((byte) 124, param0)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var3 = stackIn_11_0;
          if (var3 == 0) {
            return sb.field_n;
          } else {
            return bf.field_x;
          }
        } else {
          L1: {
            var4 = null;
            String discarded$8 = ((mh) this).a((String) null, true);
            if (null != ng.a((byte) 124, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          if (var3 == 0) {
            return sb.field_n;
          } else {
            return bf.field_x;
          }
        }
    }

    mh(fe param0) {
        super(param0);
    }

    final static StringBuilder a(int param0, char param1, StringBuilder param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3 == 31917) {
          var4 = param2.length();
          param2.setLength(param0);
          var5 = var4;
          L0: while (true) {
            if (param0 <= var5) {
              return param2;
            } else {
              param2.setCharAt(var5, param1);
              var5++;
              continue L0;
            }
          }
        } else {
          field_k = 48;
          var4 = param2.length();
          param2.setLength(param0);
          var5 = var4;
          L1: while (true) {
            if (param0 <= var5) {
              return param2;
            } else {
              param2.setCharAt(var5, param1);
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
