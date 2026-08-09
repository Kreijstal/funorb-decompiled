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
        if (!(this.d + 1 < this.c.length)) {
            this.b();
        }
        int fieldTemp$0 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$0] = (byte)param0;
        int fieldTemp$1 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$1] = (byte)(param0 >> -840856696);
    }

    public final void b() {
        if (this.d > 0) {
          if (this.e - -this.d > this.b) {
            throw new RuntimeException();
          } else {
            this.a.a(this.c, 0, this.e, this.d);
            this.e = this.e + this.d;
            this.d = 0;
            return;
          }
        } else {
          return;
        }
    }

    public Stream() {
        this(4096);
    }

    public final native static int floatToRawIntBits(float param0);

    public final void b(int param0) {
        if (!(this.c.length > this.d + 1)) {
            this.b();
        }
        int fieldTemp$0 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$0] = (byte)(param0 >> 354896296);
        int fieldTemp$1 = this.d;
        this.d = this.d + 1;
        this.c[fieldTemp$1] = (byte)param0;
    }

    private final native static byte getLSB(int param0);

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public final static boolean a() {
        return 0 == (jaclib.memory.Stream.getLSB(-65536) ^ -1);
    }

    public final void b(float param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var2;
        if (this.c.length <= 3 + this.d) {
          this.b();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$8] = (byte)(var2 >> -399536200);
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$9] = (byte)(var2 >> 1896096816);
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$10] = (byte)(var2 >> 368326600);
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$11] = (byte)var2;
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$12 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$12] = (byte)(var2 >> -399536200);
          fieldTemp$13 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$13] = (byte)(var2 >> 1896096816);
          fieldTemp$14 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$14] = (byte)(var2 >> 368326600);
          fieldTemp$15 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$15] = (byte)var2;
          return;
        }
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
        if (3 + this.d >= this.c.length) {
          this.b();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$8] = (byte)var2;
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$9] = (byte)(var2 >> -1477512760);
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$10] = (byte)(var2 >> 562390672);
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$11] = (byte)(var2 >> 937001208);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$12 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$12] = (byte)var2;
          fieldTemp$13 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$13] = (byte)(var2 >> -1477512760);
          fieldTemp$14 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$14] = (byte)(var2 >> 562390672);
          fieldTemp$15 = this.d;
          this.d = this.d + 1;
          this.c[fieldTemp$15] = (byte)(var2 >> 937001208);
          return;
        }
    }

    private Stream(int param0) {
        this.c = new byte[param0];
    }
}
