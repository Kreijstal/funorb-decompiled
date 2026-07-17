/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int c;

    public final boolean a(int param0, int param1, int param2) {
        if (0 != ((jaggl.MapBuffer) this).c) {
            return false;
        }
        long var4 = jaggl.OpenGL.glMapBufferARB(param0, param2);
        if (!(0L != var4)) {
            return false;
        }
        ((jaggl.MapBuffer) this).a(var4, param1);
        ((jaggl.MapBuffer) this).c = param0;
        return true;
    }

    public final boolean b() {
        return ((jaggl.MapBuffer) this).c != 0;
    }

    public final boolean a() {
        int var1 = 1;
        if (!(((jaggl.MapBuffer) this).c == 0)) {
            var1 = jaggl.OpenGL.glUnmapBufferARB(((jaggl.MapBuffer) this).c) ? 1 : 0;
            ((jaggl.MapBuffer) this).a(0L, 0);
            ((jaggl.MapBuffer) this).c = 0;
        }
        return var1 != 0;
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((jaggl.MapBuffer) this).c == 0) {
            throw new RuntimeException();
        }
        super.a(param0, param1, param2, param3);
    }

    public MapBuffer() {
    }
}
