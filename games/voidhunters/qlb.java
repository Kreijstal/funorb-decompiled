/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qlb implements dja {
    static int field_a;

    public final tv a(byte param0) {
        int var2 = -87 / ((param0 + 64) / 50);
        return null;
    }

    final static Object[] a(Object[] param0, Object param1, dja param2, boolean param3, boolean param4, int param5) {
        tv[] stackIn_7_0 = null;
        Object[] stackIn_18_0 = null;
        tv[] stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        tv[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        tv[] var12 = null;
        int var13 = 0;
        iu var14 = null;
        iu var15 = null;
        tv[] var6Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var10 = VoidHunters.field_G;
        try {
          if (param5 != 1) {
            ((boolean[]) (param0[0]))[0] = ((boolean[]) (param0[0]))[1];
          }
          if (param0 != null &&
            param0.length != 0) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted0 = true;
            if (!param3) {
              var12 = param2.a(11995, param0.length + 1);
              var6 = var12;
              decompiledFrameRemainder0 = (param4);
              if (decompiledFrameRemainder0) {
                var7 = 0;
                var14 = (iu) (param1);
                for (var9 = 0; param0.length > var9; var9++) {
                  if (var14.a(param0[var9], true) <= 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var7++;
                }
                decompiledFrameRemainder2 = !(decompiledFrameCompleted0);
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var6_int = 0;
              while (true) {
                if (var6_int < param0.length) {
                  if (param1 != param0[var6_int]) {
                    var6_int++;
                    continue;
                  }
                  stackIn_18_0 = (Object[]) (param0);
                  return stackIn_18_0;
                }
                break;
              }
              var12 = param2.a(11995, param0.length + 1);
              var6 = var12;
              decompiledFrameRemainder0 = (param4);
              if (decompiledFrameRemainder0) {
                var7 = 0;
                var15 = (iu) (param1);
                for (var9Lifetime3 = 0; param0.length > var9Lifetime3; var9Lifetime3++) {
                  if (var15.a(param0[var9Lifetime3], true) <= 0) {
                    break;
                  }
                  var7++;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              for (var9Lifetime1 = 0; var9Lifetime1 < var7; var9Lifetime1++) {
                var6[var9Lifetime1] = (tv) (param0[var9Lifetime1]);
              }
              var6[var7] = (tv) (param1);
              for (var9Lifetime2 = var7; var9Lifetime2 < param0.length; var9Lifetime2++) {
                var6[1 + var9Lifetime2] = (tv) (param0[var9Lifetime2]);
              }
              decompiledFrameRemainder1 = false;
            }
            if (decompiledFrameRemainder1) {
              var13 = 0;
              var7Lifetime1 = var13;
              while (param0.length > var13) {
                var12[var13] = (tv) (param0[var13]);
                var13++;
              }
              var6[param0.length] = (tv) (param1);
            }
            stackIn_36_0 = var6;
            return stackIn_36_0;
          }
          var6Lifetime1 = param2.a(11995, 1);
          var6Lifetime1 = var6Lifetime1;
          var6Lifetime1[0] = (tv) (param1);
          stackIn_7_0 = var6Lifetime1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_39_0 = var6_ref;
          stackIn_39_1 = new StringBuilder().append("qlb.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (param0 != -75) {
          qlb.b((byte) 0);
        }
        kl.a(vpa.b((byte) -119), 0);
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_a = -48;
        }
        return (tv[]) ((Object) new dmb[param1]);
    }

    static {
        field_a = 0;
    }
}
