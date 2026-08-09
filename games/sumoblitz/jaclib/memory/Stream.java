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
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var2;
        if (this.b.length <= 3 + this.d) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$8] = (byte)(var2 >> 1666619256);
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$9] = (byte)(var2 >> -625364688);
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$10] = (byte)(var2 >> 2120829832);
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$11] = (byte)var2;
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$12 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$12] = (byte)(var2 >> 1666619256);
          fieldTemp$13 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$13] = (byte)(var2 >> -625364688);
          fieldTemp$14 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$14] = (byte)(var2 >> 2120829832);
          fieldTemp$15 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$15] = (byte)var2;
          return;
        }
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
        if (this.b.length <= 3 + this.d) {
          this.a();
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$8 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$8] = (byte)var2;
          fieldTemp$9 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$9] = (byte)(var2 >> -2098105272);
          fieldTemp$10 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$10] = (byte)(var2 >> -1363528112);
          fieldTemp$11 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$11] = (byte)(var2 >> 410438488);
          return;
        } else {
          var2 = jaclib.memory.Stream.floatToRawIntBits(param0);
          fieldTemp$12 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$12] = (byte)var2;
          fieldTemp$13 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$13] = (byte)(var2 >> -2098105272);
          fieldTemp$14 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$14] = (byte)(var2 >> -1363528112);
          fieldTemp$15 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$15] = (byte)(var2 >> 410438488);
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (this.b.length <= this.d + 1) {
          this.a();
          fieldTemp$4 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$4] = (byte)param0;
          fieldTemp$5 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$5] = (byte)(param0 >> 814993096);
          return;
        } else {
          fieldTemp$6 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$6] = (byte)param0;
          fieldTemp$7 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$7] = (byte)(param0 >> 814993096);
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (this.b.length <= this.d - -1) {
          this.a();
          fieldTemp$4 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$4] = (byte)(param0 >> -1390280152);
          fieldTemp$5 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$5] = (byte)param0;
          return;
        } else {
          fieldTemp$6 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$6] = (byte)(param0 >> -1390280152);
          fieldTemp$7 = this.d;
          this.d = this.d + 1;
          this.b[fieldTemp$7] = (byte)param0;
          return;
        }
    }

    private Stream(int param0) {
        this.b = new byte[param0];
    }
}
