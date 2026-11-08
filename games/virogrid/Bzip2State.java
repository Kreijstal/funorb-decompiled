/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int field_J;
    int field_E;
    int field_L;
    byte field_G;
    int field_r;
    byte[] field_g;
    int field_e;
    int[] field_w;
    byte[] field_d;
    int[] field_H;
    int field_A;
    int[][] field_F;
    int field_l;
    int[] field_m;
    static String field_f;
    byte[] field_i;
    int field_j;
    int field_n;
    int field_p;
    boolean[] field_t;
    int field_o;
    int field_y;
    static int field_D;
    boolean[] field_a;
    byte[] field_q;
    byte[] field_K;
    int field_x;
    static TypeCode field_z;
    int field_b;
    int[][] field_s;
    static int[] field_k;
    static BinaryBitmapFont generalFont;
    byte[][] field_c;
    byte[] field_I;
    static int field_v;
    int[][] field_C;
    int[] field_u;
    int field_B;

    public static void releaseStatics(int param0) {
        field_k = null;
        if (param0 != 6) {
          return;
        }
        generalFont = null;
        field_f = null;
        field_z = null;
    }

    final static void allocateChatHistory(byte param0, int param1) {
        AccountCreationForm.field_K = 0;
        ArchiveRequest.field_s = param1;
        ThreeSliceButtonPainter.field_D = new int[3];
        BufferedSocket.field_s = new ChatMessage[15 * param1];
        if (param0 < 33) {
          field_v = -82;
        }
    }

    final static boolean isNameCheckPending(int param0) {
        if (param0 == 16) {
          return ScrollPaneWithFooter.field_Kb == MouseWheelInput.field_c ? true : false;
        }
        Bzip2State.hasFeatureBit((byte) 58, 113);
        return ScrollPaneWithFooter.field_Kb == MouseWheelInput.field_c ? true : false;
    }

    final static boolean hasFeatureBit(byte param0, int param1) {
        if (param1 == -1) {
          return true;
        }
        if (param0 == 13) {
          return (1 << param1 & QueuedRequest.field_g) != 0 ? true : false;
        }
        Bzip2State.allocateChatHistory((byte) 49, 53);
        return (1 << param1 & QueuedRequest.field_g) != 0 ? true : false;
    }

    final static String formatLoadingProgress(Js5Archive param0, String param1, byte param2, String param3) {
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.ensureIndexLoaded(0)) {
            stackIn_2_0 = (String) (param3);
            return stackIn_2_0;
          }
          if (param2 > -36) {
            var5 = (String) null;
            Bzip2State.formatLoadingProgress((Js5Archive) null, (String) null, (byte) 85, (String) null);
          }
          stackIn_6_0 = param1 + " - " + param0.getOverallProgress(-2677) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("db.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static LobbyPlayerEntry findLobbyPlayer(long param0, boolean param1) {
        if (param1) {
          Bzip2State.allocateChatHistory((byte) 12, 38);
          return (LobbyPlayerEntry) (LinkTextPainter.field_i.get(param0, (byte) -9));
        }
        return (LobbyPlayerEntry) (LinkTextPainter.field_i.get(param0, (byte) -9));
    }

    Bzip2State() {
        this.field_g = new byte[4096];
        this.field_H = new int[257];
        this.field_m = new int[6];
        this.field_a = new boolean[256];
        this.field_n = 0;
        this.field_F = new int[6][258];
        this.field_s = new int[6][258];
        this.field_c = new byte[6][258];
        this.field_K = new byte[18002];
        this.field_t = new boolean[16];
        this.field_d = new byte[18002];
        this.field_p = 0;
        this.field_w = new int[16];
        this.field_I = new byte[256];
        this.field_C = new int[6][258];
        this.field_u = new int[256];
    }

    static {
        field_f = "Report <%0> for abuse";
        field_z = new TypeCode(2, 4, 4, 0);
    }
}
