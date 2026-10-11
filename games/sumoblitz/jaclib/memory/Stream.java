/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public final class Stream {
    private jaclib.memory.Buffer a;
    private byte[] b;
    private int c;
    private int e;
    private int d;

    public final void a(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.b.length > 3 + this.d) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$0] = (byte)(var2 >> 24);
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$1] = (byte)(var2 >> 16);
          fieldTemp$2 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$2] = (byte)(var2 >> 8);
          fieldTemp$3 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$3] = (byte)var2;
          return;
        }
        this.a();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$4] = (byte)(var2Lifetime1 >> 24);
        int fieldTemp$5 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$5] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$6 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$6] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$7 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$7] = (byte)var2Lifetime1;
    }

    public final void b(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.b.length > 3 + this.d) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$0] = (byte)var2;
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$1] = (byte)(var2 >> 8);
          fieldTemp$2 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$2] = (byte)(var2 >> 16);
          fieldTemp$3 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$3] = (byte)(var2 >> 24);
          return;
        }
        this.a();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$4] = (byte)var2Lifetime1;
        int fieldTemp$5 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$5] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$6 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$6] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$7 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$7] = (byte)(var2Lifetime1 >> 24);
    }

    public final native static int floatToRawIntBits(float param0);

    public final void a() {
        if (this.d > 0) {
          if (this.c + this.d > this.e) {
            throw new RuntimeException();
          }
          this.a.a(this.b, 0, this.c, this.d);
          this.c = this.c + this.d;
          this.d = 0;
        }
    }

    public final static boolean b() {
        return jaclib.memory.Stream.getLSB(-65536) == -1;
    }

    public final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.b.length > this.d + 1) {
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$0] = (byte)param0;
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$1] = (byte)(param0 >> 8);
          return;
        }
        this.a();
        int fieldTemp$2 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$2] = (byte)param0;
        int fieldTemp$3 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$3] = (byte)(param0 >> 8);
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        this.a();
        this.c = param1;
        this.e = param1 + param2;
        this.a = param0;
        if (!(this.e <= param0.getSize())) {
          throw new RuntimeException();
        }
    }

    private final native static byte getLSB(int param0);

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public Stream() {
        this(4096);
    }

    public final void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.b.length > this.d + 1) {
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$0] = (byte)(param0 >> 8);
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$1] = (byte)param0;
          return;
        }
        this.a();
        int fieldTemp$2 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.d;
        this.d = this.d + 1;
        this.b[fieldTemp$3] = (byte)param0;
    }

    private Stream(int param0) {
        this.b = new byte[param0];
    }
}
