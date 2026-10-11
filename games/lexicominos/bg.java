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
        if (!param0) {
          di.field_x.b(117, field_b);
          return;
        }
        field_a = (tb) null;
        di.field_x.b(117, field_b);
    }

    final static void a(int param0) {
        if (param0 == 482) {
          return;
        }
        field_a = (tb) null;
    }

    final void a(ca param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_m) {
            param0.b(12);
          }
          param0.field_l = this.field_e;
          param0.field_m = this.field_e.field_m;
          param0.field_m.field_l = param0;
          param0.field_l.field_m = param0;
          if (param1 == 25) {
            return;
          }
          field_d = (fh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bg.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1 != -21637) {
            bg.a((byte) -109);
          }
          while (true) {
            if (var2_int <= var3) {
              stackIn_11_0 = ll.field_a;
              return stackIn_11_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_8_0 = null;
          return (tf) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("bg.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private bg() throws Throwable {
        throw new Error();
    }

    final ca b(byte param0) {
        int var2 = 10 % ((42 - param0) / 37);
        ca var3 = this.field_e.field_l;
        if (this.field_e != var3) {
          var3.b(12);
          return var3;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ec(this));
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
