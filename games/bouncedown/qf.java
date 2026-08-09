/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static uf field_a;
    static int field_c;
    static int field_b;

    final static byte[] a(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ah var4 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param0 == 0) {
                if (param2 instanceof byte[]) {
                  var3 = (byte[]) (param2);
                  if (param1) {
                    stackIn_12_0 = rd.a((byte) -82, var3);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_10_0 = (byte[]) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  if (!(param2 instanceof ah)) {
                    throw new IllegalArgumentException();
                  } else {
                    var4 = (ah) (param2);
                    stackIn_15_0 = var4.a(0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = (byte[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("qf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 >= -94) {
            qf.b(88);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (nk.field_a == null) {
          il.field_b = new q();
          ed.field_c.a(10768, il.field_b);
          if (param0 != 0) {
            field_b = 53;
            return;
          } else {
            return;
          }
        } else {
          nk.field_a.a(true);
          il.field_b = new q();
          ed.field_c.a(10768, il.field_b);
          if (param0 == 0) {
            return;
          } else {
            field_b = 53;
            return;
          }
        }
    }

    static {
        field_a = new uf();
        field_b = 0;
    }
}
