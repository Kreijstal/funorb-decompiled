/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    int field_G;
    int field_l;
    int field_y;
    int field_A;
    static String field_z;
    int field_w;
    int field_D;
    int field_o;
    int field_u;
    MusicPatch field_E;
    static SpriteWidget field_m;
    static String field_n;
    int field_s;
    int field_F;
    PcmSample field_q;
    int field_v;
    static int field_C;
    int field_k;
    PcmSampleStream field_p;
    int field_B;
    int field_x;
    int field_g;
    int field_h;
    MusicPatchEnvelope field_t;
    static Js5Archive field_i;
    int field_r;
    static int[] field_j;

    final void releaseAudioReferences(int param0) {
        if (param0 == -11382) {
          this.field_E = null;
          this.field_p = null;
          this.field_q = null;
          this.field_t = null;
          return;
        }
        field_n = (String) null;
        this.field_E = null;
        this.field_p = null;
        this.field_q = null;
        this.field_t = null;
    }

    final static void setGameViewFlag(boolean param0) {
        RasterEffectHelpers.field_f = param0 ? true : false;
    }

    final static LoginMethod[] getLoginMethods(int param0) {
        if (param0 == 5) {
          return new LoginMethod[]{QuickChatHelpHelpers.field_b, Virogrid.field_O, GrowableIntList.field_j};
        }
        MidiNote.getLoginMethods(56);
        return new LoginMethod[]{QuickChatHelpHelpers.field_b, Virogrid.field_O, GrowableIntList.field_j};
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_n = null;
        field_i = null;
        field_z = null;
        if (param0 >= 71) {
          field_m = null;
          return;
        }
        field_z = (String) null;
        field_m = null;
    }

    final static void registerScreens(byte param0) {
        BoundedRandomAccessFile.defineMenuScreen((byte) -51, AccountCreationSupport.field_a, 6);
        if (param0 <= 95) {
          field_n = (String) null;
          BoundedRandomAccessFile.defineMenuScreen((byte) -82, BufferedSocket.field_h, 8);
          if (!LobbySortHelpers.isRankedPlayUnavailable((byte) -126)) {
            BoundedRandomAccessFile.defineMenuScreen((byte) -87, ChatPanelSetupHelpers.field_d, 2);
            BoundedRandomAccessFile.defineMenuScreen((byte) -74, DiskCacheWorker.field_c, 3);
            BoundedRandomAccessFile.defineMenuScreen((byte) -53, ArchiveRequest.field_u, 4);
            BoundedRandomAccessFile.defineMenuScreen((byte) -124, TextEncodingHelpers.field_f, 5);
            DelegatingCanvas.field_f[8] = DelegatingCanvas.field_f[8] + 32;
            return;
          }
          DelegatingCanvas.field_f[8] = DelegatingCanvas.field_f[8] + 32;
          return;
        }
        BoundedRandomAccessFile.defineMenuScreen((byte) -82, BufferedSocket.field_h, 8);
        if (LobbySortHelpers.isRankedPlayUnavailable((byte) -126)) {
          DelegatingCanvas.field_f[8] = DelegatingCanvas.field_f[8] + 32;
          return;
        }
        BoundedRandomAccessFile.defineMenuScreen((byte) -87, ChatPanelSetupHelpers.field_d, 2);
        BoundedRandomAccessFile.defineMenuScreen((byte) -74, DiskCacheWorker.field_c, 3);
        BoundedRandomAccessFile.defineMenuScreen((byte) -53, ArchiveRequest.field_u, 4);
        BoundedRandomAccessFile.defineMenuScreen((byte) -124, TextEncodingHelpers.field_f, 5);
        DelegatingCanvas.field_f[8] = DelegatingCanvas.field_f[8] + 32;
    }

    MidiNote() {
    }

    static {
        field_z = "Log in / Create account";
        field_j = new int[]{2};
    }
}
