/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends kd {
    static int[] field_D;
    static int field_y;
    volatile boolean field_z;
    static String[] field_A;
    static boolean field_E;
    boolean field_B;
    static int field_F;
    boolean field_C;

    public static void e(byte param0) {
        if (param0 < 11) {
            return;
        }
        field_D = null;
        field_A = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        jl.a(false);
        int var5 = 80 % ((param2 - -37) / 40);
        pb.h(param0, param1, param3, param4);
    }

    abstract int g(int param0);

    abstract byte[] d(byte param0);

    final static void c(byte param0) {
        RuntimeException var1 = null;
        cc var1_ref = null;
        hk var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            var1_ref = (cc) (Object) q.field_m.e(13058);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (hk) (Object) ci.field_e.e(13058);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (cc) (Object) o.field_d.e(13058);
                    L3: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        if (var1_ref.field_Ub > 0) {
                          var1_ref.field_Ub = var1_ref.field_Ub - 1;
                          if (var1_ref.field_Ub == 0) {
                            var1_ref.field_Wb = 0;
                            if (!var1_ref.d((byte) -36)) {
                              var1_ref = (cc) (Object) o.field_d.a((byte) -34);
                              continue L3;
                            } else {
                              var1_ref.b(4);
                              var1_ref = (cc) (Object) o.field_d.a((byte) -34);
                              continue L3;
                            }
                          } else {
                            var1_ref = (cc) (Object) o.field_d.a((byte) -34);
                            continue L3;
                          }
                        } else {
                          var1_ref = (cc) (Object) o.field_d.a((byte) -34);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (var1_ref2.field_mc > 0) {
                      var1_ref2.field_mc = var1_ref2.field_mc - 1;
                      if (var1_ref2.field_mc == 0) {
                        var1_ref2.field_Ac = 0;
                        if (var1_ref2.k(4219)) {
                          var1_ref2.b(4);
                          var1_ref2 = (hk) (Object) ci.field_e.a((byte) -33);
                          continue L2;
                        } else {
                          var1_ref2 = (hk) (Object) ci.field_e.a((byte) -33);
                          continue L2;
                        }
                      } else {
                        var1_ref2 = (hk) (Object) ci.field_e.a((byte) -33);
                        continue L2;
                      }
                    } else {
                      var1_ref2 = (hk) (Object) ci.field_e.a((byte) -33);
                      continue L2;
                    }
                  }
                }
              } else {
                if (var1_ref.field_Ub > 0) {
                  var1_ref.field_Ub = var1_ref.field_Ub - 1;
                  if (var1_ref.field_Ub == 0) {
                    var1_ref.field_Wb = 0;
                    if (var1_ref.d((byte) -36)) {
                      var1_ref.b(4);
                      var1_ref = (cc) (Object) q.field_m.a((byte) -36);
                      continue L1;
                    } else {
                      var1_ref = (cc) (Object) q.field_m.a((byte) -36);
                      continue L1;
                    }
                  } else {
                    var1_ref = (cc) (Object) q.field_m.a((byte) -36);
                    continue L1;
                  }
                } else {
                  var1_ref = (cc) (Object) q.field_m.a((byte) -36);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "fe.J(" + 123 + 41);
        }
    }

    fe() {
        ((fe) this).field_z = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[2];
        field_y = 65;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
