/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int[] field_b;
    static double[][] field_a;
    static double[][] field_c;
    static String muLobbyLocation;
    static int field_f;
    static int field_h;
    static int field_g;
    static UiComponent field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param1) {
          var2 = BallDebugOverlay.field_i;
        }
        if (param1 == 1) {
          var2 = ol.field_e;
        }
        if (param1 == 2) {
          var2 = ResourceArchive.field_e;
        }
        if (param0 == 5) {
          return var2;
        }
        return 112;
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 125 / ((20 - param0) / 32);
          stackIn_1_0 = new int[]{param1[0], param1[1], param1[2], param1[3], param1[4], param1[5], param1[6], param1[7], param1[8], param1[9], param1[10], param1[11]};
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("f.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void layoutLobbyPanels(int param0) {
        field_h = SoftwareRasterizer.height;
        fr.field_s = SoftwareRasterizer.width;
        IterableDualLinkDeque.a((byte) -95);
        kg.field_l.a(BufferedFile.field_a.height - 40 - 2, BufferedFile.field_a.width, 0, 0, (byte) -124);
        pm.field_m.setBounds(0, 2147483647, 0, BirthDateValidator.field_m.width, ArchiveIndex.field_x);
        int var1 = 2 + ArchiveIndex.field_x;
        c.field_e.setBounds(!tq.field_p ? 0 : var1, 2147483647, 0, BirthDateValidator.field_m.width, -(!tq.field_p ? 0 : var1) + BirthDateValidator.field_m.height);
        da.a(true);
        ProgressBarWidget.field_K.setBounds(BufferedFile.field_a.height - 40, 2147483647, 0, BufferedFile.field_a.width, 40);
        ll.field_d.setBounds(0, 2147483647, 0, oi.field_n.width, 30);
        pk.field_a.setBounds(30, 2147483647, 0, oi.field_n.width, -70 + (oi.field_n.height - 2));
        MessageDialogContent.field_N.setBounds(5, 2147483647, 5, 68, 30);
        pp.field_c.setBounds(5, param0 ^ 2147483599, 75, 78, 30);
        KillerBallSkin.field_p.setBounds(5, 2147483647, 155, 48, 30);
        Camera.field_g.setBounds(5, 2147483647, 205, param0, 30);
        int var2 = tq.field_p ? 250 : 200;
        DualLinkDequeIterator.field_e.setBounds(5, 2147483647, 5 + var2, -var2 + 363, 30);
        l.field_f.setBounds(5, param0 ^ 2147483599, 370, -10 + oi.field_n.width - 365, 30);
        BufferedSocket.field_m.setScrollPaneBounds(TranslatedUiText.field_n, -5 + (pk.field_a.height - 37), (byte) -112, 2, pk.field_a.width - 10, 5, 37);
        int var3 = (2 + oi.field_n.width) / 2;
        DiskCacheWorker.field_f.setBounds(oi.field_n.height - 40, 2147483647, 0, -2 + var3, 40);
        if (!tq.field_p) {
          var3 = 0;
        }
        uc.field_b.setBounds(oi.field_n.height - 40, param0 + 2147483599, var3, oi.field_n.width - var3, 40);
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_c = (double[][]) null;
        if (param0 < 57) {
          return;
        }
        field_b = null;
        muLobbyLocation = null;
        field_a = (double[][]) null;
    }

    static {
        DirectByteStorage.g(-128);
        muLobbyLocation = "Location";
        field_f = 8;
        field_g = 12;
    }
}
