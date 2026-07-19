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
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int var2 = 0;
        if (this.b.length <= 3 + this.d) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$16 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$16] = (byte)(var2 >> 1666619256);
          fieldTemp$17 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$17] = (byte)(var2 >> -625364688);
          fieldTemp$18 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$18] = (byte)(var2 >> 2120829832);
          fieldTemp$19 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$19] = (byte)var2;
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$20 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$20] = (byte)(var2 >> 1666619256);
          fieldTemp$21 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$21] = (byte)(var2 >> -625364688);
          fieldTemp$22 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$22] = (byte)(var2 >> 2120829832);
          fieldTemp$23 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$23] = (byte)var2;
          return;
        }
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
        if (this.b.length <= 3 + this.d) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$16 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$16] = (byte)var2;
          fieldTemp$17 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$17] = (byte)(var2 >> -2098105272);
          fieldTemp$18 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$18] = (byte)(var2 >> -1363528112);
          fieldTemp$19 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$19] = (byte)(var2 >> 410438488);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$20 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$20] = (byte)var2;
          fieldTemp$21 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$21] = (byte)(var2 >> -2098105272);
          fieldTemp$22 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$22] = (byte)(var2 >> -1363528112);
          fieldTemp$23 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$23] = (byte)(var2 >> 410438488);
          return;
        }
    }

    public final native static int floatToRawIntBits(float param0);

    public final void a() {
        if (!(-1 <= (this.d ^ -1))) {
            if (!(this.c - -this.d <= this.e)) {
                throw new RuntimeException();
            }
            this.a.a(this.b, 0, this.c, this.d);
            this.c = this.c + this.d;
            this.d = 0;
        }
    }

    public final static boolean b() {
        return (jaclib.memory.Stream.getLSB(-65536) ^ -1) == 0;
    }

    public final void a(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (this.b.length <= this.d + 1) {
          this.a();
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$8] = (byte)param0;
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$9] = (byte)(param0 >> 814993096);
          return;
        } else {
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$10] = (byte)param0;
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$11] = (byte)(param0 >> 814993096);
          return;
        }
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
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        if (this.b.length <= this.d - -1) {
          this.a();
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$8] = (byte)(param0 >> -1390280152);
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$9] = (byte)param0;
          return;
        } else {
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$10] = (byte)(param0 >> -1390280152);
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    private Stream(int param0) {
        this.b = new byte[param0];
    }
}
