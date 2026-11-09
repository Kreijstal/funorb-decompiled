/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Bzip2State {
    int field_x;
    byte[][] field_C;
    int field_g;
    int field_B;
    byte field_v;
    boolean[] field_a;
    byte[] field_c;
    int field_m;
    int field_z;
    int[][] field_y;
    int field_f;
    int field_p;
    int field_G;
    int[] field_q;
    int field_w;
    static Random field_u;
    int field_b;
    int[] field_i;
    int field_j;
    int[][] field_o;
    boolean[] field_M;
    byte[] field_D;
    byte[] field_A;
    int[][] field_H;
    byte[] field_t;
    byte[] field_n;
    int field_k;
    int field_e;
    int[] field_l;
    int[] field_K;
    static gq field_I;
    byte[] field_E;
    int field_h;
    static IntrusiveDeque field_J;
    static int field_L;
    static String field_s;
    static int field_r;
    int field_d;
    static int field_F;

    public static void clearStatics(byte param0) {
        int var1 = 104 % ((-30 - param0) / 39);
        field_s = null;
        field_J = null;
        field_u = null;
        field_I = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = DraggableWidget.a(param2, 1, '_', "");
          var3 = DualLinkDequeSequence.a(param2, true);
          if (param1 < 126) {
            var4 = (String) null;
            Bzip2State.a((String) null, 75, (String) null);
          }
          stackIn_7_0 = (-1 != param0.indexOf(param2)) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("na.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (oq.field_i != null) {
          return;
        }
        try {
          MidiPcmStream.field_L = rs.field_zb + uq.field_h;
          RecklessAi.field_r = rs.field_zb + an.field_a;
          oq.field_i = new String[33];
          oq.field_i[14] = tm.field_o;
          oq.field_i[0] = wm.field_f;
          oq.field_i[7] = sn.field_b;
          oq.field_i[4] = lr.field_e;
          oq.field_i[12] = ArchiveNetworkClient.field_g;
          oq.field_i[1] = GameSession.field_a;
          oq.field_i[8] = TutorialAi.field_v;
          oq.field_i[5] = ro.field_e;
          if (param0 < 6) {
            field_u = (Random) null;
          }
          oq.field_i[10] = uc.field_y;
          oq.field_i[9] = null;
          oq.field_i[6] = ro.field_e;
          oq.field_i[2] = StarLinkPlanner.field_a;
          oq.field_i[15] = bf.field_a[0];
          oq.field_i[27] = MenuButton.field_z;
          oq.field_i[21] = NumericDateInputWidget.field_Q;
          oq.field_i[32] = MidiPcmStream.field_L;
          oq.field_i[19] = ul.field_Fb[1];
          oq.field_i[17] = bf.field_a[2];
          oq.field_i[28] = lm.field_a;
          oq.field_i[30] = PrivateChatMessage.field_j;
          oq.field_i[29] = SliderPainter.field_k;
          oq.field_i[20] = rl.field_d;
          oq.field_i[24] = lq.field_p;
          oq.field_i[26] = PrivateChatMessage.field_n;
          oq.field_i[31] = ep.field_d;
          oq.field_i[25] = SpriteState.field_v;
          oq.field_i[23] = ScrollBar.field_Db;
          oq.field_i[16] = bf.field_a[1];
          oq.field_i[18] = ul.field_Fb[0];
          oq.field_i[22] = rs.field_zb;
          QuickChatPhraseRegistry.field_g[0] = ih.field_e;
          QuickChatPhraseRegistry.field_g[9] = SecondaryNodeHashTable.field_a;
          QuickChatPhraseRegistry.field_g[7] = DialWidget.field_J;
          QuickChatPhraseRegistry.field_g[11] = qe.field_l;
          QuickChatPhraseRegistry.field_g[3] = DialogRoot.field_D;
          QuickChatPhraseRegistry.field_g[14] = ss.field_d;
          QuickChatPhraseRegistry.field_g[5] = ClientException.field_g;
          QuickChatPhraseRegistry.field_g[8] = ck.field_d;
          QuickChatPhraseRegistry.field_g[4] = CheckboxWidget.field_D;
          QuickChatPhraseRegistry.field_g[6] = ChatMessage.field_f;
          QuickChatPhraseRegistry.field_g[10] = Dialog.field_H;
          QuickChatPhraseRegistry.field_g[12] = am.field_zb;
          QuickChatPhraseRegistry.field_g[2] = LinkPainter.field_c;
          QuickChatPhraseRegistry.field_g[15] = DelegatingCanvas.field_c;
          QuickChatPhraseRegistry.field_g[13] = kh.field_Eb;
          QuickChatPhraseRegistry.field_g[1] = gq.field_g;
          bk.field_b[6] = en.field_e;
          bk.field_b[11] = vo.field_a;
          bk.field_b[0] = MenuLabel.field_v;
          bk.field_b[15] = ta.field_e;
          bk.field_b[13] = oo.field_d;
          bk.field_b[4] = vs.field_c;
          bk.field_b[12] = vs.field_b;
          bk.field_b[14] = RoundedFrameSupport.field_b;
          bk.field_b[1] = np.field_l;
          bk.field_b[5] = rk.field_m;
          bk.field_b[10] = nd.field_b;
          bk.field_b[9] = Star.field_P;
          bk.field_b[8] = StarAbandonedEvent.field_s;
          bk.field_b[7] = VictoryChecker.field_f;
          bk.field_b[2] = nf.field_m;
          bk.field_b[3] = wa.field_i;
          Dialog.field_J[0] = new String[5];
          ScrollPane.field_Db = new String[5][];
          ScrollPane.field_Db[0] = new String[5];
          for (var1_int = 0; var1_int < 5; var1_int++) {
            Dialog.field_J[0][var1_int] = Integer.toString(var1_int);
            ScrollPane.field_Db[0][var1_int] = BytePayloadNode.field_i;
          }
          ScrollPane.field_Db[4] = SectorCacheStore.field_c;
          ScrollPane.field_Db[2] = DialogRoot.field_E;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "na.B(" + param0 + ')');
        }
    }

    Bzip2State() {
        this.field_C = new byte[6][258];
        this.field_c = new byte[18002];
        this.field_o = new int[6][258];
        this.field_D = new byte[4096];
        this.field_b = 0;
        this.field_M = new boolean[16];
        this.field_y = new int[6][258];
        this.field_t = new byte[18002];
        this.field_A = new byte[256];
        this.field_K = new int[16];
        this.field_i = new int[6];
        this.field_l = new int[257];
        this.field_a = new boolean[256];
        this.field_q = new int[256];
        this.field_H = new int[6][258];
        this.field_d = 0;
    }

    static {
        field_u = new Random();
        field_I = new gq(9, 0, 4, 1);
        field_s = "Production";
        field_J = new IntrusiveDeque();
        field_F = 0;
    }
}
