/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int c;

    public final boolean a(int param0, int param1, int param2) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        if (0 == this.c) {
          var4_long = jaggl.OpenGL.glMapBufferARB(param0, param2);
          if (0L == var4_long) {
            return false;
          } else {
            this.a(var4_long, param1);
            this.c = param0;
            return true;
          }
        } else {
          return false;
        }
    }

    public final boolean b() {
        return (this.c ^ -1) != -1;
    }

    public final boolean a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        L0: {
          var1_int = 1;
          if (-1 != (this.c ^ -1)) {
            var1_int = jaggl.OpenGL.glUnmapBufferARB(this.c) ? 1 : 0;
            this.a(0L, 0);
            this.c = 0;
            break L0;
          } else {
            break L0;
          }
        }
        return var1_int != 0;
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (this.c != 0) {
          super.a(param0, param1, param2, param3);
          return;
        } else {
          throw new RuntimeException();
        }
    }

    public MapBuffer() {
    }
}
