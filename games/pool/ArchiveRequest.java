/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static hj field_G;
    static vh field_y;
    static String playerNameTwoShots;
    static int field_z;
    static Sprite[] field_I;
    static int[] field_w;
    volatile boolean pending;
    static int[] field_B;
    boolean field_C;
    static String entermultiplayerlobby;
    boolean field_x;
    static String muOptions;
    static byte[] field_E;

    final static void g(int param0) {
        if (param0 > 92) {
          lk.field_o = false;
          rq.field_H = null;
          NanoTickClock.field_n = null;
          MultiHandleSliderWidget.field_W = null;
          KeyHandler.field_a = null;
          return;
        }
        ArchiveRequest.f(4);
        lk.field_o = false;
        rq.field_H = null;
        NanoTickClock.field_n = null;
        MultiHandleSliderWidget.field_W = null;
        KeyHandler.field_a = null;
    }

    abstract byte[] getBytes(boolean param0);

    public static void f(int param0) {
        field_G = null;
        field_y = null;
        field_E = null;
        if (param0 < -119) {
          muOptions = null;
          playerNameTwoShots = null;
          field_I = null;
          field_B = null;
          field_w = null;
          entermultiplayerlobby = null;
          return;
        }
        field_B = (int[]) null;
        muOptions = null;
        playerNameTwoShots = null;
        field_I = null;
        field_B = null;
        field_w = null;
        entermultiplayerlobby = null;
    }

    final static IndexedSprite[] a(di param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_2_0 = null;
        IndexedSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param1, -1);
          var5 = param0.a(var4_int, 0, param3);
          if (param2 == -24155) {
            stackIn_4_0 = pn.a(var5, param0, var4_int, 120);
            return stackIn_4_0;
          }
          stackIn_2_0 = (IndexedSprite[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gr.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract int getProgress(int param0);

    ArchiveRequest() {
        this.pending = true;
    }

    static {
        entermultiplayerlobby = "Enter multiplayer lobby";
        muOptions = "Game options";
        field_w = new int[12];
        playerNameTwoShots = "<%0>: Two shots!";
        field_G = new hj(0, 2, 2, 1);
    }
}
