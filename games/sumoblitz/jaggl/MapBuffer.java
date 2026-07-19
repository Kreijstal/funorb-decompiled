/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int c;

    public MapBuffer() {
    }

    public final boolean b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        L0: {
          var1_int = 1;
          if ((this.c ^ -1) == -1) {
            break L0;
          } else {
            var1_int = jaggl.OpenGL.glUnmapBufferARB(this.c) ? 1 : 0;
            this.a(0L, 0);
            this.c = 0;
            break L0;
          }
        }
        return var1_int != 0;
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (0 == this.c) {
          throw new RuntimeException();
        } else {
          super.a(param0, param1, param2, param3);
          return;
        }
    }

    public final boolean a() {
        return (this.c ^ -1) != -1;
    }

    public final boolean a(int param0, int param1, int param2) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        if (this.c == 0) {
          var4_long = jaggl.OpenGL.glMapBufferARB(param0, param2);
          if (0L != var4_long) {
            this.a(var4_long, param1);
            this.c = param0;
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }
}
