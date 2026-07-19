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
        if (!(this.a + 1 < this.c.length)) {
            this.a();
        }
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)(param0 >> 925983208);
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)param0;
    }

    public final void b(int param0) {
        if (!(this.c.length > this.a + 1)) {
            this.a();
        }
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)param0;
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)(param0 >> 1309083400);
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
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int var2 = 0;
        if (this.c.length <= this.a - -3) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$16 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$16] = (byte)var2;
          fieldTemp$17 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$17] = (byte)(var2 >> -1697071448);
          fieldTemp$18 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$18] = (byte)(var2 >> -959246672);
          fieldTemp$19 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$19] = (byte)(var2 >> -1248572904);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$20 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$20] = (byte)var2;
          fieldTemp$21 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$21] = (byte)(var2 >> -1697071448);
          fieldTemp$22 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$22] = (byte)(var2 >> -959246672);
          fieldTemp$23 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$23] = (byte)(var2 >> -1248572904);
          return;
        }
    }

    public final void a() {
        if (0 >= this.a) {
            return;
        }
        if (!(this.a + this.d <= this.e)) {
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
        if (this.e > param0.getSize()) {
          throw new RuntimeException();
        } else {
          return;
        }
    }

    public final void b(float param0) {
        if (!(this.a + 3 < this.c.length)) {
            this.a();
        }
        int var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$0 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$0] = (byte)(var2 >> -484083720);
        int fieldTemp$1 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$1] = (byte)(var2 >> -860722576);
        int fieldTemp$2 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$2] = (byte)(var2 >> 1994507336);
        int fieldTemp$3 = this.a;
        this.a = this.a + 1;
        this.c[fieldTemp$3] = (byte)var2;
    }

    private Stream(int param0) {
        this.c = new byte[param0];
    }

    public final static boolean b() {
        return 0 == (jaclib.memory.Stream.getLSB(-65536) ^ -1);
    }
}
