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
        int var2 = 0;
        if (((jaclib.memory.Stream) this).b.length <= 3 + ((jaclib.memory.Stream) this).d) {
          ((jaclib.memory.Stream) this).a();
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$16 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$16] = (byte)(var2 >> 24);
          int fieldTemp$17 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$17] = (byte)(var2 >> 16);
          int fieldTemp$18 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$18] = (byte)(var2 >> 8);
          int fieldTemp$19 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$19] = (byte)var2;
          return;
        } else {
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$20 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$20] = (byte)(var2 >> 24);
          int fieldTemp$21 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$21] = (byte)(var2 >> 16);
          int fieldTemp$22 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$22] = (byte)(var2 >> 8);
          int fieldTemp$23 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$23] = (byte)var2;
          return;
        }
    }

    public final void b(float param0) {
        int var2 = 0;
        if (((jaclib.memory.Stream) this).b.length <= 3 + ((jaclib.memory.Stream) this).d) {
          ((jaclib.memory.Stream) this).a();
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$16 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$16] = (byte)var2;
          int fieldTemp$17 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$17] = (byte)(var2 >> 8);
          int fieldTemp$18 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$18] = (byte)(var2 >> 16);
          int fieldTemp$19 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$19] = (byte)(var2 >> 24);
          return;
        } else {
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$20 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$20] = (byte)var2;
          int fieldTemp$21 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$21] = (byte)(var2 >> 8);
          int fieldTemp$22 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$22] = (byte)(var2 >> 16);
          int fieldTemp$23 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$23] = (byte)(var2 >> 24);
          return;
        }
    }

    public final native static int floatToRawIntBits(float param0);

    public final void a() {
        if (!(((jaclib.memory.Stream) this).d <= 0)) {
            if (!(((jaclib.memory.Stream) this).c - -((jaclib.memory.Stream) this).d <= ((jaclib.memory.Stream) this).e)) {
                throw new RuntimeException();
            }
            ((jaclib.memory.Stream) this).a.a(((jaclib.memory.Stream) this).b, 0, ((jaclib.memory.Stream) this).c, ((jaclib.memory.Stream) this).d);
            ((jaclib.memory.Stream) this).c = ((jaclib.memory.Stream) this).c + ((jaclib.memory.Stream) this).d;
            ((jaclib.memory.Stream) this).d = 0;
        }
    }

    public final static boolean b() {
        return Stream.getLSB(-65536) == -1;
    }

    public final void a(int param0) {
        if (((jaclib.memory.Stream) this).b.length <= ((jaclib.memory.Stream) this).d + 1) {
          ((jaclib.memory.Stream) this).a();
          int fieldTemp$8 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$8] = (byte)param0;
          int fieldTemp$9 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$9] = (byte)(param0 >> 8);
          return;
        } else {
          int fieldTemp$10 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$10] = (byte)param0;
          int fieldTemp$11 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$11] = (byte)(param0 >> 8);
          return;
        }
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        ((jaclib.memory.Stream) this).a();
        ((jaclib.memory.Stream) this).c = 0;
        ((jaclib.memory.Stream) this).e = param2;
        ((jaclib.memory.Stream) this).a = param0;
        if (!(((jaclib.memory.Stream) this).e <= param0.getSize())) {
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
        if (((jaclib.memory.Stream) this).b.length <= ((jaclib.memory.Stream) this).d - -1) {
          ((jaclib.memory.Stream) this).a();
          int fieldTemp$8 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$8] = (byte)(param0 >> 8);
          int fieldTemp$9 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$9] = (byte)param0;
          return;
        } else {
          int fieldTemp$10 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$10] = (byte)(param0 >> 8);
          int fieldTemp$11 = ((jaclib.memory.Stream) this).d;
          ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + 1;
          ((jaclib.memory.Stream) this).b[fieldTemp$11] = (byte)param0;
          return;
        }
    }

    private Stream(int param0) {
        ((jaclib.memory.Stream) this).b = new byte[param0];
    }
}
