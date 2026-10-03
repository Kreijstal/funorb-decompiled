/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientSessionSnapshot {
    private long field_h;
    int field_f;
    private static int[] field_b;
    String field_k;
    int field_o;
    static int keyboardEventReadIndex;
    private int field_c;
    static volatile int pendingPointerPressButton;
    private String field_i;
    int[] field_g;
    private boolean field_j;
    static String[] highscoreModeNames;
    int field_d;
    static boolean field_l;
    static int field_p;
    static String tutorialShapeMatchMessage;

    public static void b(int param0) {
        field_b = null;
        tutorialShapeMatchMessage = null;
        highscoreModeNames = null;
        int var1 = -39 % ((62 - param0) / 42);
    }

    final static String a(String param0, String param1, int param2, boolean param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4.ensureIndexLoaded(0)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (param3) {
            var6 = (ResourceArchive) null;
            ClientSessionSnapshot.a((String) null, (String) null, 53, false, (ResourceArchive) null);
          }
          stackIn_7_0 = param0 + " - " + param4.getGroupProgress((byte) 42, param2) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vd.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int chooseSpawnSpriteKind(int methodGuard) {
        if (methodGuard != 741924304) {
            return 104;
        }
        if (!(Math.random() < ContextualRuntimeException.specialSpriteKindProbability)) {
            return 0;
        }
        double specialKindRoll = Math.random();
        if (0.13 > specialKindRoll) {
            return 3;
        }
        if (specialKindRoll < 0.25) {
            return 4;
        }
        if (!(specialKindRoll < 0.65)) {
            return 2;
        }
        return 1;
    }

    final int c(int param0) {
        if (this.field_j) {
          return 2;
        }
        if ((this.field_f == 2) &&
            (this.field_c > 0)) {
          return 2;
        }
        if (SpriteState.field_n == this.field_h) {
          return 1;
        }
        if ((MouseWheelInput.field_a == 2) &&
            (CanvasResizeController.a(this.field_i, (byte) 89))) {
          return 1;
        }
        if (param0 > 113) {
          return 0;
        }
        ClientSessionSnapshot.chooseSpawnSpriteKind(-69);
        return 0;
    }

    ClientSessionSnapshot(boolean param0) {
        this.field_i = AvatarFeedbackSupport.field_b;
        this.field_f = StrongCacheReference.field_u;
        this.field_h = DiskCacheWorker.field_c;
        this.field_d = UsernameAvailabilityValidator.field_o;
        this.field_k = RankedListQuery.field_f;
        this.field_j = field_l;
        if (param0) {
            this.field_g = vj.field_c;
        } else {
            this.field_g = null;
        }
        this.field_o = tj.field_b;
        this.field_c = ArchiveIndex.field_s;
    }

    static {
        int var0 = 0;
        field_b = new int[5];
        keyboardEventReadIndex = 0;
        pendingPointerPressButton = 0;
        highscoreModeNames = new String[]{"All scores", "My scores", "Best each"};
        field_p = 6;
        for (var0 = 0; field_b.length > var0; var0++) {
          if (var0 != 0) {
            field_b[var0] = (1 + var0) * 51 << 16;
          } else {
            field_b[var0] = (var0 + 1) * 20 << 16;
          }
          if (var0 <= 2) {
            continue;
          }
          field_b[var0] = lb.orInt(field_b[var0], (var0 - 2) * 22 << 8);
        }
        tutorialShapeMatchMessage = "Excellent! Now try connecting three of a kind by shape.<br>Press <img=2> to continue.";
    }
}
