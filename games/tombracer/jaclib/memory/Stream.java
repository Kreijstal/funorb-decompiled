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
        if (!(((jaclib.memory.Stream) this).a + 1 < ((jaclib.memory.Stream) this).c.length)) {
            ((jaclib.memory.Stream) this).a();
        }
        int fieldTemp$0 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$1] = (byte)param0;
    }

    public final void b(int param0) {
        if (!(((jaclib.memory.Stream) this).c.length > ((jaclib.memory.Stream) this).a + 1)) {
            ((jaclib.memory.Stream) this).a();
        }
        int fieldTemp$0 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$0] = (byte)param0;
        int fieldTemp$1 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$1] = (byte)(param0 >> 8);
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
        int var2 = 0;
        if (((jaclib.memory.Stream) this).c.length <= ((jaclib.memory.Stream) this).a - -3) {
          ((jaclib.memory.Stream) this).a();
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$16 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$16] = (byte)var2;
          int fieldTemp$17 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$17] = (byte)(var2 >> 8);
          int fieldTemp$18 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$18] = (byte)(var2 >> 16);
          int fieldTemp$19 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$19] = (byte)(var2 >> 24);
          return;
        } else {
          var2 = Stream.floatToRawIntBits(param0);
          int fieldTemp$20 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$20] = (byte)var2;
          int fieldTemp$21 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$21] = (byte)(var2 >> 8);
          int fieldTemp$22 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$22] = (byte)(var2 >> 16);
          int fieldTemp$23 = ((jaclib.memory.Stream) this).a;
          ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
          ((jaclib.memory.Stream) this).c[fieldTemp$23] = (byte)(var2 >> 24);
          return;
        }
    }

    public final void a() {
        if (0 >= ((jaclib.memory.Stream) this).a) {
            return;
        }
        if (!(((jaclib.memory.Stream) this).a + ((jaclib.memory.Stream) this).d <= ((jaclib.memory.Stream) this).e)) {
            throw new RuntimeException();
        }
        ((jaclib.memory.Stream) this).b.a(((jaclib.memory.Stream) this).c, 0, ((jaclib.memory.Stream) this).d, ((jaclib.memory.Stream) this).a);
        ((jaclib.memory.Stream) this).d = ((jaclib.memory.Stream) this).d + ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = 0;
    }

    private final void a(jaclib.memory.Buffer param0, int param1, int param2) {
        ((jaclib.memory.Stream) this).a();
        ((jaclib.memory.Stream) this).b = param0;
        ((jaclib.memory.Stream) this).d = param1;
        ((jaclib.memory.Stream) this).e = param1 + param2;
        if (((jaclib.memory.Stream) this).e > param0.getSize()) {
          throw new RuntimeException();
        } else {
          return;
        }
    }

    public final void b(float param0) {
        if (!(((jaclib.memory.Stream) this).a + 3 < ((jaclib.memory.Stream) this).c.length)) {
            ((jaclib.memory.Stream) this).a();
        }
        int var2 = Stream.floatToRawIntBits(param0);
        int fieldTemp$0 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$0] = (byte)(var2 >> 24);
        int fieldTemp$1 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$1] = (byte)(var2 >> 16);
        int fieldTemp$2 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$2] = (byte)(var2 >> 8);
        int fieldTemp$3 = ((jaclib.memory.Stream) this).a;
        ((jaclib.memory.Stream) this).a = ((jaclib.memory.Stream) this).a + 1;
        ((jaclib.memory.Stream) this).c[fieldTemp$3] = (byte)var2;
    }

    private Stream(int param0) {
        ((jaclib.memory.Stream) this).c = new byte[param0];
    }

    public final static boolean b() {
        return Stream.getLSB(-65536) == -1;
    }
}
