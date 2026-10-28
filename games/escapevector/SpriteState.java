/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int offsetY;
    int fullWidth;
    int width;
    static IntrusiveDeque field_w;
    int height;
    int offsetX;
    static NameAvailabilityResult field_y;
    int fullHeight;
    static boolean field_u;
    static boolean field_r;
    static int[] field_t;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void b(int param0, int param1) {
        ee.field_a = cb.field_b[param0];
        if (param1 == 15) {
          md.field_H = SpriteStrip.field_i[param0];
          gj.field_g = jj.field_c[param0];
          return;
        }
        field_y = (NameAvailabilityResult) null;
        md.field_H = SpriteStrip.field_i[param0];
        gj.field_g = jj.field_c[param0];
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = QuickChatDynamicCommand.mouseHandler;
        synchronized (var1) {
          md.mouseIdleTicks = md.mouseIdleTicks + 1;
          eb.field_K = vj.heldMouseButton;
          dh.field_d = IterableDualLinkDeque.pendingMouseX;
          UiContainer.field_y = jk.pendingMouseY;
          TextFieldValidator.field_h = ke.mouseInputChanged;
          ke.mouseInputChanged = false;
          qi.field_N = SocketConnector.pendingClickButton;
          sf.field_c = fk.pendingClickX;
          ng.field_ob = PcmResampler.pendingClickY;
          if (param0 != -3657) {
            SpriteState.b(30, 39);
          }
          SocketConnector.pendingClickButton = 0;
        }
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        if (guard != -363232252) {
          field_y = (NameAvailabilityResult) null;
          field_y = null;
          field_w = null;
          return;
        }
        field_y = null;
        field_w = null;
    }

    final static void a(int param0, boolean param1) {
        e.field_a = true;
        da.field_b = new ta();
        int var2 = -121 / ((param0 + 63) / 34);
        int var3 = da.field_b.d((byte) -73);
        di.field_d = new wc(var3);
        int var4 = da.field_b.c(5201);
        int var5 = da.field_b.a(-3, dh.field_d, UiContainer.field_y);
        di.field_d.a(95, param1, var5, var4);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 34) {
          int var6 = this.fullWidth << 3;
          int var7 = this.fullHeight << 3;
          param0 = (param0 << 4) + (15 & var6);
          param4 = (param4 << 4) + (15 & var7);
          this.a(var6, var7, param0, param4, param3, param2);
          return;
        }
        this.offsetY = 118;
        int var6Lifetime1 = this.fullWidth << 3;
        int var7Lifetime1 = this.fullHeight << 3;
        param0 = (param0 << 4) + (15 & var6Lifetime1);
        param4 = (param4 << 4) + (15 & var7Lifetime1);
        this.a(var6Lifetime1, var7Lifetime1, param0, param4, param3, param2);
    }

    SpriteState() {
    }

    static {
        field_w = new IntrusiveDeque();
        field_t = new int[8192];
        field_u = true;
    }
}
