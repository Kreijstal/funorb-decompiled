/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public final class Stream {
    private byte[] c;
    private int d;
    private int a;
    private jaclib.memory.Buffer b;
    private int e;

    public final void a(int param0) {
        if (this.a + 1 >= this.c.length) {
          this.a();
        }
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)param0;
    }

    public final void b(int param0) {
        if (this.c.length <= this.a + 1) {
          this.a();
        }
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)param0;
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)(param0 >> 8);
    }

    private final native static byte getLSB(int param0);

    public final native static int floatToRawIntBits(float param0);

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public Stream() {
        this(4096);
    }

    public final void a(float param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.c.length > this.a + 3) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$0 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$0] = (byte)var2;
          fieldTemp$1 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$1] = (byte)(var2 >> 8);
          fieldTemp$2 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$2] = (byte)(var2 >> 16);
          fieldTemp$3 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$3] = (byte)(var2 >> 24);
          return;
        }
        this.a();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$4] = (byte)var2Lifetime1;
        int fieldTemp$5 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$5] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$6 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$6] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$7 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$7] = (byte)(var2Lifetime1 >> 24);
    }

    public final void a() {
        if (0 >= this.a) {
          return;
        }
        if (this.a + this.d > this.e) {
          throw new RuntimeException();
        }
        this.b.a(this.c, 0, this.d, this.a);
        this.d = this.d + this.a;
        this.a = 0;
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        this.a();
        this.b = param0;
        this.d = param1;
        this.e = param1 + param2;
        if (this.e <= param0.getSize()) {
          return;
        }
        throw new RuntimeException();
    }

    public final void b(float param0) {
        if (this.a + 3 >= this.c.length) {
          this.a();
        }
        int var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)(var2 >> 24);
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)(var2 >> 16);
        int fieldTemp$2 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$2] = (byte)(var2 >> 8);
        int fieldTemp$3 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$3] = (byte)var2;
    }

    private Stream(int param0) {
        this.c = new byte[param0];
    }

    public final static boolean b() {
        return jaclib.memory.Stream.getLSB(-65536) == -1;
    }
}
