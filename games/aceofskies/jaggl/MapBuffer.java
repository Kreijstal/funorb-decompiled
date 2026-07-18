/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int c;

    public final boolean a() {
        return ((jaggl.MapBuffer) this).c != 0;
    }

    public final boolean b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        L0: {
          var1_int = 1;
          if (((jaggl.MapBuffer) this).c != 0) {
            var1_int = jaggl.OpenGL.glUnmapBufferARB(((jaggl.MapBuffer) this).c) ? 1 : 0;
            ((jaggl.MapBuffer) this).a(0L, 0);
            ((jaggl.MapBuffer) this).c = 0;
            break L0;
          } else {
            break L0;
          }
        }
        return var1_int != 0;
    }

    public MapBuffer() {
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (0 != ((jaggl.MapBuffer) this).c) {
          super.a(param0, param1, param2, param3);
          return;
        } else {
          throw new RuntimeException();
        }
    }

    public final boolean a(int param0, int param1, int param2) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        if (((jaggl.MapBuffer) this).c != 0) {
          return false;
        } else {
          var4_long = jaggl.OpenGL.glMapBufferARB(param0, param2);
          if (var4_long == 0L) {
            return false;
          } else {
            ((jaggl.MapBuffer) this).a(var4_long, param1);
            ((jaggl.MapBuffer) this).c = param0;
            return true;
          }
        }
    }
}
