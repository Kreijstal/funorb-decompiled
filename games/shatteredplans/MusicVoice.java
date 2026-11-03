/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVoice extends IntrusiveNode {
    int field_E;
    int field_G;
    int field_v;
    int field_F;
    int field_H;
    PcmSample field_M;
    MusicEnvelope field_u;
    PcmSampleStream field_K;
    MusicPatch field_A;
    int field_j;
    int field_r;
    int field_C;
    int field_q;
    int field_y;
    static String field_s;
    int field_J;
    static fg field_m;
    int field_h;
    int field_z;
    int field_k;
    static String field_l;
    int field_p;
    int field_B;
    static WidgetTheme field_o;
    static wa field_D;
    int field_i;
    static String field_N;
    static String[] field_w;
    static String field_x;
    static WidgetStyle field_I;
    static String field_t;
    static Sprite field_n;

    final static FleetMove a(GameState param0, int param1, PacketBuffer param2) {
        Star var3 = null;
        RuntimeException var3_ref = null;
        Star var4 = null;
        int var5 = 0;
        int var6 = 0;
        FleetMove stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = FleetMove.a(param0, param2, 20);
          var5 = 21 / ((param1 + 64) / 43);
          var4 = FleetMove.a(param0, param2, 20);
          var6 = param2.readUnsignedShort(-20976);
          stackIn_1_0 = new FleetMove(var3, var4, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("qq.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void d(boolean param0) {
        this.field_A = null;
        this.field_K = null;
        this.field_M = null;
        this.field_u = null;
        if (param0) {
          this.field_J = -43;
        }
    }

    public static void clearStatics(int param0) {
        field_w = null;
        field_N = null;
        field_I = null;
        field_D = null;
        field_t = null;
        field_o = null;
        if (param0 <= -52) {
          field_x = null;
          field_l = null;
          field_n = null;
          field_m = null;
          field_s = null;
          return;
        }
    }

    final static void c(boolean param0) {
        if (param0) {
          return;
        }
        cg.field_E.setLength(0);
        ProductionContent.field_h = 0;
    }

    MusicVoice() {
    }

    static {
        field_s = "Accept unrated rematch";
        field_l = "Confirm Password: ";
        field_m = new fg();
        field_N = "Please remove <%0> from your friend list first.";
        field_x = "Buying or selling an account";
        field_w = new String[]{"New Cambridge Colony", "Historical Archives"};
        field_t = "Try again";
    }
}
