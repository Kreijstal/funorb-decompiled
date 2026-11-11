/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CourseGenerator {
    private IsaacCipher random;
    static int[] field_e;
    int roomCount;
    private int[] field_d;
    private int seed;

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 < 98) {
          CourseGenerator.releaseStatics(56);
        }
    }

    final boolean randomFlag(byte param0) {
        if (param0 >= -23) {
          return false;
        }
        return this.random.nextBounded(2, 0) == 0 ? true : false;
    }

    private final void initRandom(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2Lifetime1;
        this.random = new IsaacCipher(new int[]{this.seed});
        this.field_d = new int[this.roomCount];
        for (var2 = 0; var2 < this.roomCount; var2++) {
          this.field_d[var2] = this.random.nextInt(95);
        }
        var2Lifetime1 = -123 % ((-62 - param0) / 49);
    }

    abstract CourseLayout generateLayout(byte param0);

    CourseGenerator(int param0, int param1) {
        this.roomCount = param0;
        this.seed = param1;
        this.initRandom(-125);
    }

    static {
    }
}
