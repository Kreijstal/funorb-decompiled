/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Spawner implements noa {
    Room field_a;

    abstract void a(byte param0, ui param1, boolean param2, ui param3);

    void encode(BitPacketBuffer param0, byte param1) {
        try {
          param0.writeBits((byte) -126, this.getTypeId(true), 4);
          if (param1 != 52) {
            this.getTypeId(true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ib.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(byte param0);

    abstract int getTypeId(boolean param0);

    Spawner(Room param0, BitPacketBuffer param1) {
        this(param0);
    }

    abstract lj a(boolean param0, int param1, int param2);

    abstract void spawn(int param0, int param1, int param2, int param3);

    private Spawner(Room param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
