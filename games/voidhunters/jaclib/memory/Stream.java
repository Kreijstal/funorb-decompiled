/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public final class Stream {
    private int d;
    private int e;
    private int b;
    private byte[] c;
    private jaclib.memory.Buffer a;

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        this.b();
        this.a = param0;
        this.b = param2 + param1;
        this.e = param1;
        if (!(this.b <= param0.getSize())) {
          throw new RuntimeException();
        }
    }

    public final void a(int param0) {
        if (this.d + 1 >= this.c.length) {
          this.b();
        }
        int fieldTemp$0 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$0] = (byte)param0;
        int fieldTemp$1 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$1] = (byte)(param0 >> 8);
    }

    public final void b() {
        if (this.d <= 0) {
          return;
        }
        if (this.e + this.d <= this.b) {
          this.a.a(this.c, 0, this.e, this.d);
          this.e = this.e + this.d;
          this.d = 0;
          return;
        }
        throw new RuntimeException();
    }

    public Stream() {
        this(4096);
    }

    public final native static int floatToRawIntBits(float param0);

    public final void b(int param0) {
        if (this.c.length <= this.d + 1) {
          this.b();
        }
        int fieldTemp$0 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$1] = (byte)param0;
    }

    private final native static byte getLSB(int param0);

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public final static boolean a() {
        return jaclib.memory.Stream.getLSB(-65536) == -1;
    }

    public final void b(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.c.length > 3 + this.d) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$0] = (byte)(var2 >> 24);
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$1] = (byte)(var2 >> 16);
          fieldTemp$2 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$2] = (byte)(var2 >> 8);
          fieldTemp$3 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$3] = (byte)var2;
          return;
        }
        this.b();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$4] = (byte)(var2Lifetime1 >> 24);
        int fieldTemp$5 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$5] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$6 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$6] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$7 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$7] = (byte)var2Lifetime1;
    }

    public final void a(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (3 + this.d < this.c.length) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$0] = (byte)var2;
          fieldTemp$1 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$1] = (byte)(var2 >> 8);
          fieldTemp$2 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$2] = (byte)(var2 >> 16);
          fieldTemp$3 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$3] = (byte)(var2 >> 24);
          return;
        }
        this.b();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$4] = (byte)var2Lifetime1;
        int fieldTemp$5 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$5] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$6 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$6] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$7 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$7] = (byte)(var2Lifetime1 >> 24);
    }

    private Stream(int param0) {
        this.c = new byte[param0];
    }
}
