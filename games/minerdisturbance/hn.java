/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn {
    static String field_a;
    static int field_b;
    static String field_d;
    static boolean field_c;

    final static String c(int param0) {
        String var1 = "";
        if (MidiPcmStream.field_D != null) {
          var1 = MidiPcmStream.field_D.a((byte) 117);
        }
        if (param0 > 74) {
          if (var1.length() == 0) {
            var1 = cb.a((byte) -98);
          }
          if (var1.length() == 0) {
            var1 = bm.field_r;
          }
          return var1;
        }
        hn.createAccountSuccessResult(true, (byte) 38);
        if (var1.length() == 0) {
          var1 = cb.a((byte) -98);
        }
        if (var1.length() == 0) {
          var1 = bm.field_r;
        }
        return var1;
    }

    abstract ec b(int param0);

    public static void resetStaticState(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 0) {
          field_c = false;
        }
    }

    abstract void a(PacketBuffer param0, byte param1);

    final static AccountServiceResult createAccountSuccessResult(boolean param0, byte param1) {
        AccountServiceResult var2 = null;
        if (param1 == 105) {
          var2 = new AccountServiceResult(true);
          var2.field_i = param0 ? true : false;
          return var2;
        }
        return (AccountServiceResult) null;
    }

    final static void a(byte param0) {
        ti.field_J = kj.field_a.readString(false);
        CharSequence var2 = (CharSequence) ((Object) ti.field_J);
        in.field_b = cl.a(-95, var2);
        if (param0 > -22) {
          hn.createAccountSuccessResult(true, (byte) 100);
        }
    }

    static {
        field_a = "Rock blaster: Gun that fires explosives. Does not work underwater.";
        field_d = "Please check if address is correct";
        field_c = false;
    }
}
