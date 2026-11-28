/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveNetworkClient {
    static String field_c;
    ci field_l;
    static int field_i;
    static java.math.BigInteger field_m;
    static java.awt.Image field_g;
    ci field_k;
    ci field_d;
    ci field_f;
    PacketBuffer field_b;
    int field_e;
    long field_n;
    volatile int field_p;
    byte field_a;
    PacketBuffer field_h;
    volatile int field_j;
    NetworkArchiveRequest field_o;

    final int getPriorityRequestCount(byte param0) {
        if (param0 == 67) {
          return this.field_l.b(97) + this.field_k.b(109);
        }
        this.field_p = -101;
        return this.field_l.b(97) + this.field_k.b(109);
    }

    abstract boolean pollNetwork(byte param0);

    abstract void close(int param0);

    public static void clearStaticReferences(int param0) {
        field_m = null;
        field_c = null;
        field_g = null;
        if (param0 != 5) {
          field_m = (java.math.BigInteger) null;
        }
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        var2 = Lexicominos.field_L ? 1 : 0;
        jj.field_d = null;
        gb.field_d = false;
        if (DualLinkNode.field_k) {
          jj.field_a.showConnectionFailure(15);
          if (param0 == 50) {
            return;
          }
          field_g = (java.awt.Image) null;
          return;
        }
        var1 = BufferedRandomAccessFile.field_l;
        if (var1 > 0) {
          if (var1 == 1) {
            jj.field_d = oj.field_d;
          } else {
            jj.field_d = MouseInputHandler.a(new String[]{Integer.toString(var1)}, mc.field_m, false);
          }
          jj.field_d = ef.a(new CharSequence[]{(CharSequence) ((Object) jj.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) gj.field_u)}, 0);
        }
        jj.field_a.closeDialog(true);
        vg.a(113);
        if (param0 == 50) {
          return;
        }
        field_g = (java.awt.Image) null;
        return;
    }

    abstract void resetAfterValidationFailure(int param0);

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, int param4) {
        RgbSprite[] var6 = new RgbSprite[9];
        RgbSprite[] var5 = var6;
        RgbSprite dupTemp$0 = gf.a((byte) -76, param2, param0);
        var6[6] = dupTemp$0;
        var5[param4] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        RgbSprite dupTemp$1 = gf.a((byte) -76, param2, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = gf.a((byte) -76, 64, param1);
        }
        return var5;
    }

    final int getPrefetchRequestCount(boolean param0) {
        if (param0) {
          return this.field_d.b(97) + this.field_f.b(111);
        }
        this.enqueueRequest(-12, 71, 119, (byte) 102, true);
        return this.field_d.b(97) + this.field_f.b(111);
    }

    final boolean isPriorityQueueFull(int param0) {
        if (param0 == 20) {
          return 20 <= this.getPriorityRequestCount((byte) 67) ? true : false;
        }
        this.isPriorityQueueFull(-75);
        return 20 <= this.getPriorityRequestCount((byte) 67) ? true : false;
    }

    final NetworkArchiveRequest enqueueRequest(int param0, int param1, int param2, byte param3, boolean param4) {
        if (param0 != 5) {
          return (NetworkArchiveRequest) null;
        }
        long var6 = (long)param2 + ((long)param1 << 32);
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.field_j = var6;
        var8.field_p = param4 ? true : false;
        var8.field_A = param3;
        if (!param4) {
          if (!(this.getPrefetchRequestCount(true) < 20)) {
            throw new RuntimeException();
          }
          this.field_d.a(83, var8);
        } else {
          if (!(this.getPriorityRequestCount((byte) 67) < 20)) {
            throw new RuntimeException();
          }
          this.field_l.a(param0 - 74, var8);
        }
        return var8;
    }

    abstract void attachSocket(boolean param0, int param1, Object param2);

    final boolean isPrefetchQueueFull(int param0) {
        if (param0 != 9172) {
          return true;
        }
        return this.getPrefetchRequestCount(true) >= 20 ? true : false;
    }

    ArchiveNetworkClient() {
        this.field_l = new ci();
        this.field_k = new ci();
        this.field_d = new ci();
        this.field_f = new ci();
        this.field_b = new PacketBuffer(6);
        this.field_p = 0;
        this.field_a = (byte) 0;
        this.field_j = 0;
        this.field_h = new PacketBuffer(10);
    }

    static {
        field_i = 0;
        field_c = "Updates will sent to the email address you've given";
        field_m = new java.math.BigInteger("65537");
    }
}
