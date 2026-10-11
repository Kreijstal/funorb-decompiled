/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public final class Stream {
    private int a;
    private jaclib.memory.Buffer c;
    private int d;
    private int b;
    private byte[] e;

    public final void a(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (3 + this.b < this.e.length) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$0] = (byte)var2;
          fieldTemp$1 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$1] = (byte)(var2 >> 8);
          fieldTemp$2 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$2] = (byte)(var2 >> 16);
          fieldTemp$3 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$3] = (byte)(var2 >> 24);
          return;
        }
        this.a();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$4] = (byte)var2Lifetime1;
        int fieldTemp$5 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$5] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$6 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$6] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$7 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$7] = (byte)(var2Lifetime1 >> 24);
    }

    public final native static int floatToRawIntBits(float param0);

    public final void a() {
        if (0 >= this.b) {
          return;
        }
        if (this.d + this.b <= this.a) {
          this.c.a(this.e, 0, this.d, this.b);
          this.d = this.d + this.b;
          this.b = 0;
          return;
        }
        throw new RuntimeException();
    }

    public final static boolean b() {
        return jaclib.memory.Stream.getLSB(-65536) == -1;
    }

    public final void b(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.e.length > 3 + this.b) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$0] = (byte)(var2 >> 24);
          fieldTemp$1 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$1] = (byte)(var2 >> 16);
          fieldTemp$2 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$2] = (byte)(var2 >> 8);
          fieldTemp$3 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$3] = (byte)var2;
          return;
        }
        this.a();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$4] = (byte)(var2Lifetime1 >> 24);
        int fieldTemp$5 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$5] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$6 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$6] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$7 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$7] = (byte)var2Lifetime1;
    }

    public final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (1 + this.b < this.e.length) {
          fieldTemp$0 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$0] = (byte)(param0 >> 8);
          fieldTemp$1 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$1] = (byte)param0;
          return;
        }
        this.a();
        int fieldTemp$2 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$3] = (byte)param0;
    }

    public Stream() {
        this(4096);
    }

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public final void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.e.length > this.b + 1) {
          fieldTemp$0 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$0] = (byte)param0;
          fieldTemp$1 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$1] = (byte)(param0 >> 8);
          return;
        }
        this.a();
        int fieldTemp$2 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$2] = (byte)param0;
        int fieldTemp$3 = this.b;
        this.b = this.b + 1;
        this.e[fieldTemp$3] = (byte)(param0 >> 8);
    }

    private final native static byte getLSB(int param0);

    private Stream(int param0) {
        this.e = new byte[param0];
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        this.a();
        this.d = param1;
        this.c = param0;
        this.a = param1 + param2;
        if (!(this.a <= param0.getSize())) {
          throw new RuntimeException();
        }
    }
}
