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
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var2;
        if (this.c.length <= this.a - -3) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$8 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$8] = (byte)var2;
          fieldTemp$9 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$9] = (byte)(var2 >> -1697071448);
          fieldTemp$10 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$10] = (byte)(var2 >> -959246672);
          fieldTemp$11 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$11] = (byte)(var2 >> -1248572904);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$12 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$12] = (byte)var2;
          fieldTemp$13 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$13] = (byte)(var2 >> -1697071448);
          fieldTemp$14 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$14] = (byte)(var2 >> -959246672);
          fieldTemp$15 = this.a;
          this.a = this.a + 1;
          this.c[fieldTemp$15] = (byte)(var2 >> -1248572904);
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
