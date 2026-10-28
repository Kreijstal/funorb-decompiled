/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    static BitmapFont field_a;
    static int field_h;
    SecondaryIntrusiveDeque field_p;
    static int field_b;
    SecondaryIntrusiveDeque field_l;
    static String field_i;
    SecondaryIntrusiveDeque field_j;
    SecondaryIntrusiveDeque field_n;
    long field_k;
    PacketBuffer field_e;
    int field_f;
    volatile int field_d;
    byte field_m;
    volatile int field_g;
    PacketBuffer field_o;
    Js5NetworkRequest field_c;

    final boolean c(int param0) {
        if (param0 == 20) {
          return 20 <= this.a(true) ? true : false;
        }
        this.field_n = (SecondaryIntrusiveDeque) null;
        return 20 <= this.a(true) ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
          return this.field_p.c(0) + this.field_l.c(0);
        }
        this.a(-59);
        return this.field_p.c(0) + this.field_l.c(0);
    }

    abstract void a(int param0);

    final int a(byte param0) {
        if (param0 == 88) {
          return this.field_j.c(0) + this.field_n.c(0);
        }
        this.field_e = (PacketBuffer) null;
        return this.field_j.c(0) + this.field_n.c(0);
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -4470) {
          field_b = 100;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 == 20) {
          return 20 <= this.a((byte) 88) ? true : false;
        }
        this.field_n = (SecondaryIntrusiveDeque) null;
        return 20 <= this.a((byte) 88) ? true : false;
    }

    abstract void b(byte param0);

    abstract void a(Object param0, boolean param1, byte param2);

    abstract boolean d(int param0);

    final Js5NetworkRequest a(int param0, boolean param1, byte param2, int param3, byte param4) {
        long var6 = (long)param3 + ((long)param0 << 32);
        if (param2 == 0) {
          Js5NetworkRequest var8 = new Js5NetworkRequest();
          var8.field_y = param4;
          Js5NetworkRequest stackIn_16_0 = var8;
          boolean stackIn_17_1 = (!param1) ? false : true;
          stackIn_16_0.field_r = stackIn_17_1;
          var8.secondaryKey = var6;
          if (param1) {
            if (this.a(true) >= 20) {
              throw new RuntimeException();
            }
            this.field_p.addLast(-1, var8);
          } else {
            if (this.a((byte) 88) >= 20) {
              throw new RuntimeException();
            }
            this.field_j.addLast(~param2, var8);
          }
          return var8;
        }
        this.field_f = -16;
        Js5NetworkRequest var8Lifetime1 = new Js5NetworkRequest();
        var8Lifetime1.field_y = param4;
        Js5NetworkRequest stackIn_3_0 = var8Lifetime1;
        boolean stackIn_4_1 = (!param1) ? false : true;
        stackIn_3_0.field_r = stackIn_4_1;
        var8Lifetime1.secondaryKey = var6;
        if (param1) {
          if (this.a(true) >= 20) {
            throw new RuntimeException();
          }
          this.field_p.addLast(-1, var8Lifetime1);
        } else {
          if (this.a((byte) 88) >= 20) {
            throw new RuntimeException();
          }
          this.field_j.addLast(~param2, var8Lifetime1);
        }
        return var8Lifetime1;
    }

    Js5Transport() {
        this.field_p = new SecondaryIntrusiveDeque();
        this.field_l = new SecondaryIntrusiveDeque();
        this.field_j = new SecondaryIntrusiveDeque();
        this.field_n = new SecondaryIntrusiveDeque();
        this.field_e = new PacketBuffer(6);
        this.field_g = 0;
        this.field_m = (byte) 0;
        this.field_d = 0;
        this.field_o = new PacketBuffer(10);
    }

    static {
        field_b = 0;
        field_i = "";
    }
}
