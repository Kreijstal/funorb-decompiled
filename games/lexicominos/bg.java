/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bg implements Iterable {
    static ng field_c;
    static pj field_b;
    static int[][] field_f;
    static fh field_d;
    static tb field_a;
    ca field_e;

    final static void a(boolean param0) {
        field_b = new pj();
        if (param0) {
          field_a = (tb) null;
          di.field_x.b(117, field_b);
          return;
        } else {
          di.field_x.b(117, field_b);
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == 482) {
            return;
        }
        field_a = (tb) null;
    }

    final void a(ca param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_m) {
                param0.b(12);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_l = this.field_e;
            param0.field_m = this.field_e.field_m;
            param0.field_m.field_l = param0;
            param0.field_l.field_m = param0;
            if (param1 == 25) {
              break L0;
            } else {
              field_d = (fh) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("bg.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static tf a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        tf stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        tf stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = 0;
              if (param1 == -21637) {
                break L1;
              } else {
                bg.a((byte) -109);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2_int <= var3) {
                  break L3;
                } else {
                  var4 = param0.charAt(var3);
                  if (var4 >= 48) {
                    if (var4 <= 57) {
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    } else {
                      stackOut_7_0 = null;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              stackOut_10_0 = ll.field_a;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("bg.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tf) ((Object) stackIn_8_0);
        } else {
          return stackIn_11_0;
        }
    }

    private bg() throws Throwable {
        throw new Error();
    }

    final ca b(byte param0) {
        int var2 = 0;
        ca var3 = null;
        var2 = 10 % ((42 - param0) / 37);
        var3 = this.field_e.field_l;
        if (this.field_e == var3) {
          return null;
        } else {
          var3.b(12);
          return var3;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ec((bg) (this)));
    }

    public static void a(byte param0) {
        field_f = (int[][]) null;
        field_a = null;
        field_d = null;
        if (param0 != 70) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_c = new ng();
        field_f = new int[][]{new int[]{464, 469, 473, 475, 475, 472, 471, 468, 469, 471}, new int[]{464, 469, 473, 475, 475, 473, 471, 469, 470, 471}, new int[]{464, 469, 473, 475, 476, 473, 472, 470, 471, 472}, new int[]{464, 469, 473, 476, 477, 475, 473, 471, 472, 475}, new int[]{464, 469, 474, 477, 478, 477, 475, 474, 475, 479}, new int[]{464, 469, 475, 478, 481, 480, 478, 478, 479, 484}, new int[]{464, 469, 476, 480, 484, 483, 482, 482, 483, 489}, new int[]{464, 469, 476, 481, 486, 486, 485, 485, 486, 493}, new int[]{464, 469, 477, 482, 488, 488, 487, 487, 488, 495}, new int[]{464, 470, 477, 483, 490, 490, 489, 488, 489, 496}, new int[]{464, 470, 478, 484, 491, 492, 490, 489, 489, 497}, new int[]{464, 470, 478, 485, 493, 493, 491, 489, 489, 496}, new int[]{464, 470, 479, 486, 495, 495, 492, 490, 489, 496}, new int[]{464, 470, 480, 488, 497, 496, 493, 490, 489, 495}, new int[]{464, 470, 481, 490, 500, 498, 494, 489, 488, 494}, new int[]{464, 470, 481, 492, 502, 500, 495, 489, 487, 493}, new int[]{464, 470, 481, 492, 503, 500, 495, 488, 486, 491}, new int[]{464, 470, 479, 491, 503, 501, 495, 487, 486, 491}, new int[]{464, 470, 478, 489, 502, 501, 495, 488, 487, 493}, new int[]{464, 470, 476, 487, 500, 501, 496, 489, 489, 495}, new int[]{464, 470, 476, 486, 499, 501, 496, 489, 489, 495}, new int[]{464, 470, 475, 485, 499, 502, 496, 489, 489, 494}, new int[]{464, 469, 475, 485, 500, 503, 498, 490, 489, 493}, new int[]{464, 469, 476, 485, 500, 506, 501, 493, 492, 494}, new int[]{464, 469, 476, 485, 501, 510, 507, 498, 496, 496}, new int[]{464, 469, 476, 485, 501, 514, 512, 505, 501, 499}, new int[]{464, 469, 477, 485, 499, 517, 517, 510, 506, 502}, new int[]{464, 469, 477, 484, 497, 517, 519, 513, 509, 504}, new int[]{464, 469, 477, 484, 495, 515, 520, 515, 511, 505}, new int[]{464, 469, 477, 483, 492, 513, 519, 516, 512, 506}, new int[]{464, 469, 477, 483, 491, 512, 518, 517, 514, 508}, new int[]{464, 469, 476, 482, 489, 509, 517, 519, 517, 514}, new int[]{464, 469, 476, 481, 487, 507, 516, 524, 527, 527}, new int[]{464, 469, 475, 480, 484, 502, 513, 530, 538, 546}, new int[]{464, 469, 475, 479, 482, 496, 507, 530, 544, 560}, new int[]{464, 468, 474, 477, 479, 489, 497, 518, 533, 552}, new int[]{464, 468, 474, 476, 477, 482, 487, 499, 510, 523}, new int[]{464, 468, 473, 475, 476, 477, 479, 484, 489, 497}, new int[]{464, 468, 473, 475, 475, 474, 474, 474, 477, 481}, new int[]{464, 468, 473, 475, 475, 473, 471, 469, 471, 473}, new int[]{464, 468, 473, 475, 475, 472, 471, 468, 469, 470}};
    }
}
