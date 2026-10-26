/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    byte field_s;
    byte field_k;
    boolean field_a;
    byte field_c;
    boolean field_m;
    boolean field_p;
    boolean field_o;
    byte field_n;
    boolean field_l;
    byte field_b;
    static PcmSample[] upgradeSounds;
    boolean field_i;
    short field_t;
    int field_h;
    boolean field_f;
    byte field_j;
    byte field_r;
    int field_q;
    boolean field_d;
    int field_e;

    public static void a(int param0) {
        upgradeSounds = null;
        if (param0 > -72) {
          upgradeSounds = (PcmSample[]) null;
        }
    }

    final static boolean a(int param0, Vector2 param1, double param2, Vector2 param3) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        try {
          if (param0 < 59) {
            upgradeSounds = (PcmSample[]) null;
          }
          boolean stackIn_5_0 = !(!(param2 * param2 > lc.a(param3, false, param1)));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("uh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private uh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
