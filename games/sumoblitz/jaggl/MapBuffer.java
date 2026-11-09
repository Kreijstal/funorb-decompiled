/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaggl;

public class MapBuffer extends jaclib.memory.NativeBuffer {
    private int mappedTarget;

    public MapBuffer() {
    }

    public final boolean unmap() {
        int var1_int;
        RuntimeException var1;
        var1_int = 1;
        if (this.mappedTarget != 0) {
          var1_int = jaggl.OpenGL.glUnmapBufferARB(this.mappedTarget) ? 1 : 0;
          this.bindAddress(0L, 0);
          this.mappedTarget = 0;
        }
        return var1_int != 0;
    }

    public final void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length) {
        if (0 == this.mappedTarget) {
          throw new RuntimeException();
        }
        super.putBytes(source, sourceOffset, destinationOffset, length);
    }

    public final boolean isMapped() {
        return this.mappedTarget != 0;
    }

    public final boolean map(int target, int byteLength, int access) {
        long var4_long;
        RuntimeException var4;
        if (this.mappedTarget != 0) {
          return false;
        }
        var4_long = jaggl.OpenGL.glMapBufferARB(target, access);
        if (0L == var4_long) {
          return false;
        }
        this.bindAddress(var4_long, byteLength);
        this.mappedTarget = target;
        return true;
    }
}
