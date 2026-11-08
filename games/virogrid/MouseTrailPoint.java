/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseTrailPoint extends IntrusiveNode {
    static String field_i;
    static String field_s;
    int field_h;
    static long field_o;
    static TypeCode field_q;
    static String field_g;
    int field_r;
    int field_m;
    static MouseInputHandler field_l;
    static SpriteWidget field_n;
    static int field_k;
    static byte[] field_p;
    static BitmapFont field_j;

    final static BinaryBitmapFont createBitmapFont(int param0, byte[] param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Js5Archive var3 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9618) {
            var3 = (Js5Archive) null;
            MouseTrailPoint.loadLogoModel((Js5Archive) null, -49);
          }
          if (param1 == null) {
            return null;
          }
          var2 = new BinaryBitmapFont(param1, BufferedSocket.field_w, ContentTransitionDialog.field_bb, Bzip2State.field_k, MarkerSlider.field_F, CheckboxPainter.field_j);
          PlayingSound.releaseDecodeArrays((byte) -28);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        if (param0 == 0) {
          field_q = null;
          field_g = null;
          field_l = null;
          field_p = null;
          field_i = null;
          field_j = null;
          field_n = null;
          return;
        }
        Js5Archive var2 = (Js5Archive) null;
        MouseTrailPoint.loadLogoModel((Js5Archive) null, -125);
        field_q = null;
        field_g = null;
        field_l = null;
        field_p = null;
        field_i = null;
        field_j = null;
        field_n = null;
    }

    final static void loadLogoModel(Js5Archive param0, int param1) {
        int var5_int = 0;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        int var9 = 0;
        CipherPacketBuffer var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var8 = new CipherPacketBuffer(param0.getFileByName("logo.fo3d", 100, ""));
          var10 = var8;
          var3 = var10.readUnsignedByte(11132);
          var10.beginBitAccess(8);
          CanvasPresentHelpers.field_e = RankingArraySupport.readMeshMaterials(var10, 9);
          ProxySocketConnector.field_n = new TriangleMesh[var3];
          ClientServiceHelpers.field_f = new int[var3][];
          var4 = -94 / ((9 - param1) / 56);
          for (var5_int = 0; var3 > var5_int; var5_int++) {
            ProxySocketConnector.field_n[var5_int] = DialWidget.decodeMesh(var8, 13472);
          }
          var10.endBitAccess(7);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = ProxySocketConnector.field_n[var9];
            var5.scaleVertices(false, 6, 1, 6, 6);
            var5.ensureBounds((byte) 126);
            var6 = new int[]{var5.field_C + var5.field_U >> 1, var5.field_T + var5.field_g >> 1, var5.field_p + var5.field_L >> 1};
            ClientServiceHelpers.field_f[var9] = var6;
            var5.translateVertices(-var6[1], -var6[0], -var6[2], (byte) 112);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("pm.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    MouseTrailPoint(int param0, int param1, int param2) {
        this.field_m = param0;
        this.field_r = param2;
        this.field_h = param1;
    }

    static {
        field_i = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = "Buying or selling an account";
        field_q = new TypeCode(0, 2, 2, 1);
        Sprite discarded$0 = new Sprite(0, 0);
        field_l = new MouseInputHandler();
    }
}
