/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static String[] field_a;
    static int[] field_b;

    final static byte[] a(byte param0) {
        ld var1 = null;
        if (param0 != -92) {
          field_a = null;
          var1 = new ld(10);
          var1.c(2, 25564);
          aa.field_j.b(param0 + 27529, var1);
          return var1.field_u;
        } else {
          var1 = new ld(10);
          var1.c(2, 25564);
          aa.field_j.b(param0 + 27529, var1);
          return var1.field_u;
        }
    }

    final static void a(String[] args, int param1) {
        Object var3 = null;
        L0: {
          if (kb.field_b != null) {
            kb.field_b.field_U.a((byte) -123, args);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 18423) {
          L1: {
            var3 = null;
            en.a((String[]) null, 63);
            if (bh.field_Z != null) {
              bh.field_Z.field_K.a((byte) 118, args);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (bh.field_Z != null) {
              bh.field_Z.field_K.a((byte) 118, args);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 10) {
            byte[] discarded$0 = en.a((byte) -13);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Iron mined: <%0>/25", "Silver mined: <%0>/25", "Gold mined: <%0>/25", "Effluvium mined: <%0>/25", "Diamonds mined: <%0>/10", "Equipment collected: <%0>", null, "Underwater gems collected: <%0>/25", "Gems mined from rocks: <%0>/25", "Diamonds mined: <%0>/10", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Current score: <%0>", "Freezium mined: <%0>/25", "Points in oil: <%0>", null, "Walrus-free points: <%0>", null, null, "Snow blocks mined: <%0>", "Current score: <%0>", "Oil burnt: <%0>%", "Tutorial tips seen: <%0>/<%1>", "Ice blocks created: <%0>", null, null, "Seconds into game: <%0>", null, "Longest Explosion: <%0> sec."};
        field_b = new int[4];
    }
}
