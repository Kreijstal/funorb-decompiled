/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int c;

    public final boolean a() {
        return this.c != 0;
    }

    public final boolean b() {
        RuntimeException var1;
        boolean var1_int = true;
        if (this.c != 0) {
          var1_int = (jaggl.OpenGL.glUnmapBufferARB(this.c));
          this.a(0L, 0);
          this.c = 0;
        }
        return (var1_int);
    }

    public MapBuffer() {
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (0 == this.c) {
          throw new RuntimeException();
        }
        super.a(param0, param1, param2, param3);
    }

    public final boolean a(int param0, int param1, int param2) {
        RuntimeException var4;
        if (this.c != 0) {
          return false;
        }
        long var4_long = jaggl.OpenGL.glMapBufferARB(param0, param2);
        if (var4_long == 0L) {
          return false;
        }
        this.a(var4_long, param1);
        this.c = param0;
        return true;
    }
}
