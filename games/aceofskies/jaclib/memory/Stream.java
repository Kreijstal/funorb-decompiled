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
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int var2 = 0;
        if (3 + this.b >= this.e.length) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$16 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$16] = (byte)var2;
          fieldTemp$17 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$17] = (byte)(var2 >> 1618928616);
          fieldTemp$18 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$18] = (byte)(var2 >> -654575952);
          fieldTemp$19 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$19] = (byte)(var2 >> -1580217352);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$20 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$20] = (byte)var2;
          fieldTemp$21 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$21] = (byte)(var2 >> 1618928616);
          fieldTemp$22 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$22] = (byte)(var2 >> -654575952);
          fieldTemp$23 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$23] = (byte)(var2 >> -1580217352);
          return;
        }
    }

    public final native static int floatToRawIntBits(float param0);

    public final void a() {
        if (0 < this.b) {
          if (this.d + this.b > this.a) {
            throw new RuntimeException();
          } else {
            this.c.a(this.e, 0, this.d, this.b);
            this.d = this.d + this.b;
            this.b = 0;
            return;
          }
        } else {
          return;
        }
    }

    public final static boolean b() {
        return (jaclib.memory.Stream.getLSB(-65536) ^ -1) == 0;
    }

    public final void b(float param0) {
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int var2 = 0;
        if (this.e.length <= 3 + this.b) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$16 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$16] = (byte)(var2 >> 1616824536);
          fieldTemp$17 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$17] = (byte)(var2 >> 1310780240);
          fieldTemp$18 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$18] = (byte)(var2 >> 823797832);
          fieldTemp$19 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$19] = (byte)var2;
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$20 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$20] = (byte)(var2 >> 1616824536);
          fieldTemp$21 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$21] = (byte)(var2 >> 1310780240);
          fieldTemp$22 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$22] = (byte)(var2 >> 823797832);
          fieldTemp$23 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$23] = (byte)var2;
          return;
        }
    }

    public final void a(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (1 + this.b >= this.e.length) {
          this.a();
          fieldTemp$8 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$8] = (byte)(param0 >> 2025106600);
          fieldTemp$9 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$9] = (byte)param0;
          return;
        } else {
          fieldTemp$10 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$10] = (byte)(param0 >> 2025106600);
          fieldTemp$11 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    public Stream() {
        this(4096);
    }

    public final void a(jaclib.memory.Buffer param0) {
        this.a(param0, 0, param0.getSize());
    }

    public final void b(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (this.e.length <= this.b + 1) {
          this.a();
          fieldTemp$8 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$8] = (byte)param0;
          fieldTemp$9 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$9] = (byte)(param0 >> -1546484856);
          return;
        } else {
          fieldTemp$10 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$10] = (byte)param0;
          fieldTemp$11 = this.b;
          this.b = this.b + 1;
          this.e[fieldTemp$11] = (byte)(param0 >> -1546484856);
          return;
        }
    }

    private final native static byte getLSB(int param0);

    private Stream(int param0) {
        this.e = new byte[param0];
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        this.a();
        this.d = param1;
        this.c = param0;
        this.a = param1 - -param2;
        if (!(this.a <= param0.getSize())) {
            throw new RuntimeException();
        }
    }
}
