/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static long field_g;
    static String field_e;
    private cn field_h;
    static String field_d;
    static int field_f;
    static String field_c;
    private dd field_b;
    private cn field_a;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -119) {
            field_d = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final wua a(boolean param0, int param1) {
        wua var3 = null;
        wua var3_ref = null;
        byte[] var4 = null;
        var3 = (wua) ((tr) this).field_b.a((byte) 74, (long)param1);
        if (var3 == null) {
          L0: {
            if (32768 > param1) {
              var4 = ((tr) this).field_a.a(param0, 1, param1);
              break L0;
            } else {
              var4 = ((tr) this).field_h.a(false, 1, param1 & 32767);
              break L0;
            }
          }
          if (!param0) {
            var3_ref = new wua();
            if (var4 != null) {
              L1: {
                var3_ref.a(new uia(var4), (byte) 113);
                if (32768 <= param1) {
                  var3_ref.a(100);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((tr) this).field_b.a(29166, (Object) (Object) var3_ref, (long)param1);
              return var3_ref;
            } else {
              L2: {
                if (32768 <= param1) {
                  var3_ref.a(100);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((tr) this).field_b.a(29166, (Object) (Object) var3_ref, (long)param1);
              return var3_ref;
            }
          } else {
            return null;
          }
        } else {
          return var3;
        }
    }

    tr(int param0, cn param1, cn param2, pp param3) {
        ((tr) this).field_b = new dd(64);
        ((tr) this).field_a = param1;
        ((tr) this).field_h = param2;
        if (null != ((tr) this).field_a) {
            int discarded$0 = ((tr) this).field_a.a((byte) 106, 1);
        }
        if (null != ((tr) this).field_h) {
            int discarded$1 = ((tr) this).field_h.a((byte) 118, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The previous occupant's idea of DIY public transport, moving platforms can transport you swiftly to your destination.";
        field_f = 3;
        field_e = "Wilbur";
        field_c = "Enter name of friend to add to list";
    }
}
