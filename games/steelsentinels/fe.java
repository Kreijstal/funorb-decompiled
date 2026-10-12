/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends DualNode {
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
        ArchiveIndex.a(false);
        int var5 = 80 % ((param2 + 37) / 40);
        SoftwareRaster.h(param0, param1, param3, param4);
    }

    abstract int g(int param0);

    abstract byte[] d(byte param0);

    final static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        cc var1 = null;
        hk var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        cc var1Lifetime1;
        var2 = SteelSentinels.obfuscationControl;
        try {
          var1 = (cc) (q.field_m.first(13058));
          while (var1 != null) {
            if (var1.field_Ub > 0) {
              var1.field_Ub = var1.field_Ub - 1;
              if (var1.field_Ub == 0) {
                var1.field_Wb = 0;
                if (var1.d((byte) -36)) {
                  var1.unlink(4);
                }
              }
            }
            var1 = (cc) (q.field_m.next((byte) -36));
          }
          if (param0 <= 102) {
            fe.e((byte) 19);
          }
          var1_ref = (hk) (ci.field_e.first(13058));
          while (var1_ref != null) {
            if (var1_ref.field_mc > 0) {
              var1_ref.field_mc = var1_ref.field_mc - 1;
              if (var1_ref.field_mc == 0) {
                var1_ref.field_Ac = 0;
                if (var1_ref.k(4219)) {
                  var1_ref.unlink(4);
                }
              }
            }
            var1_ref = (hk) (ci.field_e.next((byte) -33));
          }
          var1Lifetime1 = (cc) (o.field_d.first(13058));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Ub > 0) {
              var1Lifetime1.field_Ub = var1Lifetime1.field_Ub - 1;
              if (var1Lifetime1.field_Ub != 0) {
                var1Lifetime1 = (cc) (o.field_d.next((byte) -34));
                continue;
              }
              var1Lifetime1.field_Wb = 0;
              if (var1Lifetime1.d((byte) -36)) {
                var1Lifetime1.unlink(4);
              }
            }
            var1Lifetime1 = (cc) (o.field_d.next((byte) -34));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref2), "fe.J(" + param0 + ')');
        }
    }

    fe() {
        this.field_z = true;
    }

    static {
        field_D = new int[2];
        field_y = 65;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
