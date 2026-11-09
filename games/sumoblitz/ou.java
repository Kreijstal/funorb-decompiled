/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou extends na {
    static String field_g;
    private boolean field_e;
    private String field_f;

    ou(TextInputWidget param0) {
        super(param0);
        this.field_e = false;
    }

    final void e(int param0) {
        this.field_f = null;
        if (param0 != -1) {
          ou.a(false, -24, (byte) -79);
        }
    }

    final static void d(byte param0) {
        if (param0 != -112) {
          field_g = (String) null;
        }
        if (!vs.b((byte) 9) &&
          !TimedSceneEffect.field_r) {
          if (nq.field_g == null) {
            nq.field_g = ew.a((byte) -92, 4);
          }
          if (nq.field_g.field_o) {
            kh.field_e = kh.field_e | nq.field_g.field_k;
            OpenGlTransparentWaterEffect.field_e = OpenGlTransparentWaterEffect.field_e & ~nq.field_g.field_k;
            TimedSceneEffect.field_r = true;
            nq.field_g = null;
          }
        }
        if (null == Drone.field_g) {
          ResourceArchive.b(6);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 107) {
          ou.a(-41, -16);
        }
        pl var2 = InwardSparkParticle.field_v;
        var2.g(param1, 8);
        var2.writeByte((byte) 116, 1);
        var2.writeByte((byte) 107, 2);
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        an var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = CacheIoWorker.a(false, var5);
          if (param0 != 0) {
            ou.releaseStatics((byte) 14);
          }
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_f)) {
            var4 = im.a((byte) -109, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_g != null) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_e = var4.field_b;
            this.field_f = param1;
          }
          if (this.field_e) {
            return PrimitiveType.nameIsAvailableText;
          }
          stackIn_16_0 = au.field_e;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ou.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final gf a(byte param0, String param1) {
        an var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        gf stackIn_3_0 = null;
        gf stackIn_11_0 = null;
        gf stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!gr.a(var4, (byte) 53)) {
            stackIn_3_0 = qr.field_e;
            return stackIn_3_0;
          }
          if (param0 != 26) {
            this.e(-22);
          }
          if (!param1.equals(this.field_f)) {
            var3 = im.a((byte) -71, param1);
            if (var3 != null &&
              var3.field_g == null) {
              this.field_e = var3.field_b;
              this.field_f = param1;
            } else {
              stackIn_11_0 = kt.field_a;
              return stackIn_11_0;
            }
          }
          if (!this.field_e) {
            stackIn_16_0 = qr.field_e;
          } else {
            stackIn_16_0 = qe.field_a;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ou.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 119 % ((-43 - param0) / 63);
        field_g = null;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        String stackIn_49_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          LimitedRandomAccessFile.field_d = true;
          DroneChargeParticle.field_s = param1;
          if (0 == DroneChargeParticle.field_s) {
            var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, IntrusiveNode.fullscreenPlayIsAnText);
            var4 = 3 + var3_int;
            IntIndexHashTable.field_c = new String[var4];
            eb.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              eb.field_a[var5] = -1;
            }
            jo.field_b = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
            }
            IntIndexHashTable.field_c[-3 + var4] = "";
            IntIndexHashTable.field_c[-2 + var4] = AudioServiceThread.membersText;
            eb.field_a[-2 + var4] = 0;
            jo.field_b[0] = 4;
            IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
            eb.field_a[-1 + var4] = 1;
            jo.field_b[1] = 5;
          } else if (DroneChargeParticle.field_s == 1) {
            var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, IntrusiveNode.fullscreenPlayIsAnText);
            var4 = var3_int + 2;
            eb.field_a = new int[var4];
            IntIndexHashTable.field_c = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              eb.field_a[var5] = -1;
            }
            jo.field_b = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
            }
            IntIndexHashTable.field_c[-2 + var4] = "";
            IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
            eb.field_a[var4 - 1] = 0;
            jo.field_b[0] = 5;
          } else if (DroneChargeParticle.field_s != 2) {
            if (DroneChargeParticle.field_s == 3) {
              if (!lt.field_m.field_f) {
                var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, LegacyOpenGlGraphicsToolkit.unfortunatelyYourConfigurationDoesnText);
              } else {
                var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, ni.field_f);
              }
              var4 = var3_int + 2;
              eb.field_a = new int[var4];
              IntIndexHashTable.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                eb.field_a[var5] = -1;
              }
              jo.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-2 + var4] = "";
              IntIndexHashTable.field_c[-1 + var4] = DraggableWidget.closeText;
              eb.field_a[-1 + var4] = 0;
              jo.field_b[0] = 5;
            } else if (4 == DroneChargeParticle.field_s) {
              var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, LimitedRandomAccessFile.field_c);
              var4 = var3_int + 2;
              IntIndexHashTable.field_c = new String[var4];
              eb.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                eb.field_a[var5] = -1;
              }
              jo.field_b = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-2 + var4] = "";
              IntIndexHashTable.field_c[var4 - 1] = DraggableWidget.closeText;
              eb.field_a[var4 - 1] = 0;
              jo.field_b[0] = 5;
            } else {
              if (DroneChargeParticle.field_s != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, OpenGlBuffer.fullscreenModeWasCancelledText);
              var4 = 3 + var3_int;
              eb.field_a = new int[var4];
              IntIndexHashTable.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                eb.field_a[var5] = -1;
              }
              jo.field_b = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                IntIndexHashTable.field_c[var5] = GameInstructions.field_c[var5];
              }
              IntIndexHashTable.field_c[-3 + var4] = "";
              IntIndexHashTable.field_c[var4 - 2] = FullscreenMembershipDialog.tryAgainText;
              eb.field_a[-2 + var4] = 0;
              jo.field_b[0] = 3;
              IntIndexHashTable.field_c[var4 - 1] = DraggableWidget.closeText;
              eb.field_a[var4 - 1] = 1;
              jo.field_b[1] = 5;
            }
          } else {
            var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, ic.a(ClientExceptionSupport.ifYouDoNothingText, new String[]{"<br><%0><br>"}, (byte) -128));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(GameInstructions.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            no.field_b = new String[var4];
            la.a(GameInstructions.field_c, 0, no.field_b, 0, var4);
            uw.field_c = new String[-1 - var4 + var3_int];
            la.a(GameInstructions.field_c, var4 + 1, uw.field_c, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = wo.a(GameInstructions.field_c, qq.field_R, hn.field_j, false, ic.a(lq.field_a, new String[]{"<br><%0><br>"}, (byte) -128));
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(GameInstructions.field_c[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ResizingDialog.field_F = new String[var4];
            la.a(GameInstructions.field_c, 0, ResizingDialog.field_F, 0, var4);
            uw.field_b = new String[-1 + (-var4 + var3_int)];
            la.a(GameInstructions.field_c, var4 + 1, uw.field_b, 0, -1 - var4 + var3_int);
            if (no.field_b.length >= ResizingDialog.field_F.length) {
              stackIn_31_0 = no.field_b.length;
            } else {
              stackIn_31_0 = ResizingDialog.field_F.length;
            }
            var5 = stackIn_31_0;
            if (uw.field_b.length <= uw.field_c.length) {
              stackIn_34_0 = uw.field_c.length;
            } else {
              stackIn_34_0 = uw.field_b.length;
            }
            var6 = stackIn_34_0;
            var7 = var6 + 7 + var5;
            IntIndexHashTable.field_c = new String[var7];
            eb.field_a = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              eb.field_a[var8] = -1;
            }
            jo.field_b = new int[2];
            IntIndexHashTable.field_c[0] = fd.clickText;
            IntIndexHashTable.field_c[1] = km.acceptText;
            eb.field_a[1] = 0;
            jo.field_b[1] = 2;
            jo.field_b[0] = 5;
            eb.field_a[3] = 1;
            IntIndexHashTable.field_c[5] = "";
            IntIndexHashTable.field_c[3] = up.cancelText;
            IntIndexHashTable.field_c[2] = ws.toKeepFullscreenOrText;
            IntIndexHashTable.field_c[4] = OpenGlShaderProgram.toReturnToTheText;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_41_0 = IntIndexHashTable.field_c;
              stackIn_41_1 = var8Lifetime2 + 6;
              if (ResizingDialog.field_F.length + (var8Lifetime2 - var5) < 0) {
                stackIn_42_2 = "";
              } else {
                stackIn_42_2 = ResizingDialog.field_F[var8Lifetime2 + ResizingDialog.field_F.length - var5];
              }
              stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            }
            IntIndexHashTable.field_c[6 + var5] = null;
            eb.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_46_0 = IntIndexHashTable.field_c;
              stackIn_46_1 = var5 + (7 + var8Lifetime3);
              stackIn_46_2 = ~uw.field_b.length;
              stackIn_46_3 = ~var8Lifetime3;
              if (stackIn_46_2 >= stackIn_46_3) {
                stackIn_49_2 = "";
              } else {
                stackIn_49_2 = uw.field_b[var8Lifetime3];
              }
              stackIn_46_0[stackIn_46_1] = stackIn_49_2;
            }
            LegacyOpenGlEffectManager.field_f = wq.a(-17);
          }
          nj.field_a.field_e = jo.field_b.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < IntIndexHashTable.field_c.length; var4Lifetime1++) {
            stackIn_90_0 = -27;
            stackIn_90_1 = IntIndexHashTable.field_c[var4Lifetime1];
            stackIn_91_2 = !(eb.field_a[var4Lifetime1] < 0);
            var5Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (DroneChargeParticle.field_s == 2) {
            var11 = no.field_b;
            var4_ref_String__ = var11;
            for (var5Lifetime2 = 0; var11.length > var5Lifetime2; var5Lifetime2++) {
              var12 = var11[var5Lifetime2];
              var7Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-42, var12, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = uw.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var13 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-120, var13, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          VertexStreamLayout.field_b = -(var3_intLifetime1 >> 1) + oj.field_a;
          PlayingSound.field_n = var3_intLifetime1 + oj.field_a - (var3_intLifetime1 >> 1);
          RenderPresentationException.field_d = nj.field_a.field_e * (TextLayout.field_b + qc.field_a << 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < IntIndexHashTable.field_c.length; var4Lifetime2++) {
            stackIn_116_0 = RenderPresentationException.field_d;
            if (0 <= eb.field_a[var4Lifetime2]) {
              stackIn_117_1 = ga.field_h;
            } else {
              stackIn_117_1 = GameClientShell.field_t;
            }
            RenderPresentationException.field_d = stackIn_116_0 + stackIn_117_1;
          }
          hh.field_f = -(RenderPresentationException.field_d >> 1) + nv.field_b;
          var4Lifetime3 = -96 % ((param2 - 48) / 57);
          ib.field_g = new int[IntIndexHashTable.field_c.length][];
          var5Lifetime3 = 0;
          var6Lifetime1 = hh.field_f;
          while (IntIndexHashTable.field_c.length > var5Lifetime3) {
            var7Lifetime2 = eb.field_a[var5Lifetime3];
            if (var7Lifetime2 < 0) {
              var6Lifetime1 = var6Lifetime1 + GameClientShell.field_t;
            } else {
              var8Lifetime1 = MessageDialog.$cfr$intArgs$a$590e95718a07(-116, IntIndexHashTable.field_c[var5Lifetime3], true);
              var9 = -(var8Lifetime1 >> 1) + oj.field_a;
              var6Lifetime1 = var6Lifetime1 + qc.field_a;
              ib.field_g[var5Lifetime3] = new int[4];
              ib.field_g[var5Lifetime3][0] = var9 - dw.field_b;
              ib.field_g[var5Lifetime3][1] = var6Lifetime1;
              ib.field_g[var5Lifetime3][2] = (dw.field_b << 1) + var8Lifetime1;
              var6Lifetime1 = var6Lifetime1 + (qc.field_a + (TextLayout.field_b << 1) + ga.field_h);
              ib.field_g[var5Lifetime3][3] = (TextLayout.field_b << 1) + ga.field_h;
            }
            var5Lifetime3++;
          }
          if (DroneChargeParticle.field_s == 2) {
            nj.field_a.a(param0, 84, -1, -1);
          } else {
            nj.field_a.a(param0, -27, OpenGlAssemblyProgram.b(pi.field_e, 1882601153, ko.field_p), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "ou.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "save";
    }
}
