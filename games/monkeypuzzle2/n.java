/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_c;
    static float[][] field_d;
    static int field_a;
    static PcmSampleStream[] field_b;

    public static void clearStaticReferences(int param0) {
        if (param0 != -6991) {
          return;
        }
        field_d = (float[][]) null;
        field_c = null;
        field_b = null;
    }

    final static BinaryBitmapFont a(ResourceArchive param0, ResourceArchive param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param3, param4, param0, -3)) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          if (param2 <= 114) {
            field_d = (float[][]) null;
          }
          stackIn_6_0 = IntrusiveDeque.a((byte) 101, param1.getFile(255, param4, param3));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("n.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ki var5;
        float var6;
        if (wd.field_h.size(-89) <= 0) {
          if (param4 == -301) {
            return;
          }
          n.clearStaticReferences(54);
          return;
        }
        if (!RichTextWidget.b(true)) {
          if (param4 == -301) {
            return;
          }
          n.clearStaticReferences(54);
          return;
        }
        var5 = (ki) (wd.field_h.removeLast(4011));
        var5.field_q = (float)(-48 + param3);
        var5.field_B = (float)param2;
        var6 = (float)(10.0 / Math.sqrt((double)(param0 * param0 + param1 * param1)));
        var5.field_v = (float)param1 * var6;
        var5.field_u = 0;
        var5.field_D = var6 * (float)param0;
        hd.field_u.addLast(var5, (byte) 13);
        sc.field_c = sc.field_c + 1;
        if (sc.field_c >= 300) {
          e.a(255, (byte) 40, 0);
        }
        ok.field_d = false;
        if (param4 == -301) {
          return;
        }
        n.clearStaticReferences(54);
        return;
    }

    static {
        field_c = "Names cannot start or end with space or underscore";
        field_d = new float[20][2];
        field_a = 3;
        field_b = new PcmSampleStream[field_a];
    }
}
