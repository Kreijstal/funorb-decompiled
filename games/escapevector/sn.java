/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static ResourceArchive field_c;
    private boolean field_e;
    static long field_d;
    static boolean[] field_b;
    private String field_a;

    final static void c(int param0) {
        int var1 = AccountChoicePanel.a(-8462, SelfDestructEffects.field_q);
        int var2 = Bullet.accountStateIndex(127);
        if (param0 != -1) {
          field_b = (boolean[]) null;
        }
        if (var1 != SelfDestructEffects.field_q ||
          CheckboxPainter.field_l.field_h != var2) {
          boolean var3 = (di.field_d.field_j);
          ArchiveKeyRequest.a(0, var1, (var3), var2);
        }
    }

    public static void releaseStatics(byte guard) {
        field_b = null;
        field_c = null;
        if (guard > -66) {
          field_c = (ResourceArchive) null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String stackIn_63_2 = null;
        String stackIn_70_2 = null;
        int stackIn_113_1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var9 = EscapeVector.obfuscationControl;
        try {
          ModalStack.field_D = true;
          ArchiveIndex.field_j = param0;
          if (ArchiveIndex.field_j == 0) {
            var3_int = PasswordFieldPainter.a(pf.field_e, -118, nb.field_a, Js5Transport.field_h, KeyboardStateSupport.field_a);
            var4 = var3_int + 3;
            jj.field_a = new int[var4];
            Js5NetworkRequest.field_I = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              jj.field_a[var5] = -1;
            }
            CachedTextLayout.field_j = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              Js5NetworkRequest.field_I[var5] = pf.field_e[var5];
            }
            Js5NetworkRequest.field_I[var4 - 3] = "";
            Js5NetworkRequest.field_I[var4 - 2] = lh.field_a;
            jj.field_a[-2 + var4] = 0;
            CachedTextLayout.field_j[0] = 4;
            Js5NetworkRequest.field_I[var4 - 1] = TextFieldValidator.field_k;
            jj.field_a[-1 + var4] = 1;
            CachedTextLayout.field_j[1] = 5;
          } else if (ArchiveIndex.field_j == 1) {
            var3_int = PasswordFieldPainter.a(pf.field_e, -126, nb.field_a, Js5Transport.field_h, KeyboardStateSupport.field_a);
            var4 = 2 + var3_int;
            Js5NetworkRequest.field_I = new String[var4];
            jj.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              jj.field_a[var5] = -1;
            }
            CachedTextLayout.field_j = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              Js5NetworkRequest.field_I[var5] = pf.field_e[var5];
            }
            Js5NetworkRequest.field_I[-2 + var4] = "";
            Js5NetworkRequest.field_I[-1 + var4] = TextFieldValidator.field_k;
            jj.field_a[var4 - 1] = 0;
            CachedTextLayout.field_j[0] = 5;
          } else if (ArchiveIndex.field_j != 2) {
            if (ArchiveIndex.field_j == 3) {
              if (!NetworkGameClient.field_r.field_f) {
                var3_int = PasswordFieldPainter.a(pf.field_e, param1 ^ 114, nb.field_a, Js5Transport.field_h, DialogueScreen.field_k);
              } else {
                var3_int = PasswordFieldPainter.a(pf.field_e, -122, nb.field_a, Js5Transport.field_h, aj.field_e);
              }
              var4 = 2 + var3_int;
              Js5NetworkRequest.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              CachedTextLayout.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                Js5NetworkRequest.field_I[var5] = pf.field_e[var5];
              }
              Js5NetworkRequest.field_I[-2 + var4] = "";
              Js5NetworkRequest.field_I[-1 + var4] = TextFieldValidator.field_k;
              jj.field_a[var4 - 1] = 0;
              CachedTextLayout.field_j[0] = 5;
            } else if (ArchiveIndex.field_j == 4) {
              var3_int = PasswordFieldPainter.a(pf.field_e, -110, nb.field_a, Js5Transport.field_h, LegacyWidgetStyle.field_K);
              var4 = var3_int + 2;
              Js5NetworkRequest.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              CachedTextLayout.field_j = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                Js5NetworkRequest.field_I[var5] = pf.field_e[var5];
              }
              Js5NetworkRequest.field_I[var4 - 2] = "";
              Js5NetworkRequest.field_I[-1 + var4] = TextFieldValidator.field_k;
              jj.field_a[var4 - 1] = 0;
              CachedTextLayout.field_j[0] = 5;
            } else {
              if (5 != ArchiveIndex.field_j) {
                throw new IllegalArgumentException();
              }
              var3_int = PasswordFieldPainter.a(pf.field_e, 122, nb.field_a, Js5Transport.field_h, MouseInputHandler.field_a);
              var4 = 3 + var3_int;
              Js5NetworkRequest.field_I = new String[var4];
              jj.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                jj.field_a[var5] = -1;
              }
              CachedTextLayout.field_j = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                Js5NetworkRequest.field_I[var5] = pf.field_e[var5];
              }
              Js5NetworkRequest.field_I[var4 - 3] = "";
              Js5NetworkRequest.field_I[-2 + var4] = MarkerSliderPainter.field_f;
              jj.field_a[var4 - 2] = 0;
              CachedTextLayout.field_j[0] = 3;
              Js5NetworkRequest.field_I[-1 + var4] = TextFieldValidator.field_k;
              jj.field_a[-1 + var4] = 1;
              CachedTextLayout.field_j[1] = 5;
            }
          } else {
            var3_int = PasswordFieldPainter.a(pf.field_e, -101, nb.field_a, Js5Transport.field_h, SingleChildContainer.a(SpriteOffset.field_d, -63, new String[]{"<br><%0><br>"}));
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(pf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            ContactEntry.field_nb = new String[var4];
            ArraySupport.copy(pf.field_e, 0, ContactEntry.field_nb, 0, var4);
            SecondaryNodeHashTable.field_i = new String[-1 - var4 + var3_int];
            ArraySupport.copy(pf.field_e, 1 + var4, SecondaryNodeHashTable.field_i, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = PasswordFieldPainter.a(pf.field_e, param1 ^ 71, nb.field_a, Js5Transport.field_h, SingleChildContainer.a(al.field_c, param1 ^ -63, new String[]{"<br><%0><br>"}));
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(pf.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            IterableNodeHashTable.field_f = new String[var4];
            ArraySupport.copy(pf.field_e, 0, IterableNodeHashTable.field_f, 0, var4);
            ModalStack.field_G = new String[var3_int - var4 - 1];
            ArraySupport.copy(pf.field_e, 1 + var4, ModalStack.field_G, 0, -1 + var3_int - var4);
            if (IterableNodeHashTable.field_f.length > ContactEntry.field_nb.length) {
              stackIn_52_0 = IterableNodeHashTable.field_f.length;
            } else {
              stackIn_52_0 = ContactEntry.field_nb.length;
            }
            var5 = stackIn_52_0;
            if (SecondaryNodeHashTable.field_i.length >= ModalStack.field_G.length) {
              stackIn_55_0 = SecondaryNodeHashTable.field_i.length;
            } else {
              stackIn_55_0 = ModalStack.field_G.length;
            }
            int var6 = stackIn_55_0;
            int var7 = var5 + 7 + var6;
            jj.field_a = new int[var7];
            Js5NetworkRequest.field_I = new String[var7];
            for (int var8 = 0; var8 < var7; var8++) {
              jj.field_a[var8] = -1;
            }
            CachedTextLayout.field_j = new int[2];
            jj.field_a[1] = 0;
            Js5NetworkRequest.field_I[1] = AchievementQuery.field_j;
            Js5NetworkRequest.field_I[0] = td.field_a;
            Js5NetworkRequest.field_I[2] = ModalPanel.field_I;
            CachedTextLayout.field_j[0] = 5;
            jj.field_a[3] = 1;
            Js5NetworkRequest.field_I[5] = "";
            Js5NetworkRequest.field_I[4] = p.field_e;
            Js5NetworkRequest.field_I[3] = ModalPanel.field_J;
            CachedTextLayout.field_j[1] = 2;
            for (int var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              String[] stackIn_62_0 = Js5NetworkRequest.field_I;
              int stackIn_62_1 = 6 + var8Lifetime2;
              if (IterableNodeHashTable.field_f.length + var8Lifetime2 - var5 < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = IterableNodeHashTable.field_f[-var5 + (IterableNodeHashTable.field_f.length + var8Lifetime2)];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            Js5NetworkRequest.field_I[6 + var5] = null;
            jj.field_a[var5 + 6] = -2;
            for (int var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              String[] stackIn_67_0 = Js5NetworkRequest.field_I;
              int stackIn_67_1 = var8Lifetime3 + var5 + 7;
              int stackIn_67_2 = ~var8Lifetime3;
              int stackIn_67_3 = ~ModalStack.field_G.length;
              if (stackIn_67_2 > stackIn_67_3) {
                stackIn_70_2 = ModalStack.field_G[var8Lifetime3];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_67_0[stackIn_67_1] = stackIn_70_2;
            }
            SavedDataWrite.field_k = td.b(128);
          }
          cb.field_c.field_k = CachedTextLayout.field_j.length;
          int var3_intLifetime1 = 0;
          for (int var4Lifetime1 = 0; var4Lifetime1 < Js5NetworkRequest.field_I.length; var4Lifetime1++) {
            int stackIn_90_0 = 25;
            String stackIn_90_1 = Js5NetworkRequest.field_I[var4Lifetime1];
            boolean stackIn_91_2 = !(0 > jj.field_a[var4Lifetime1]);
            int var5Lifetime1 = LoginMethod.a(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == ArchiveIndex.field_j) {
            String[] var10 = ContactEntry.field_nb;
            String[] var4_ref_String__ = var10;
            for (int var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              String var11 = var10[var5Lifetime2];
              int var7Lifetime1 = LoginMethod.a(param1 ^ -92, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            String[] var4_ref_String__Lifetime1 = SecondaryNodeHashTable.field_i;
            for (int var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              String var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              int var7Lifetime1Lifetime1 = LoginMethod.a(-104, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ChatHistorySupport.field_a = -(var3_intLifetime1 >> 1) + ClientException.field_e + var3_intLifetime1;
          TriangleMesh.field_x = ClientException.field_e - (var3_intLifetime1 >> 1);
          mh.field_f = cb.field_c.field_k * (CheckboxPainter.field_s + AchievementTracker.field_k << 1);
          for (int var4Lifetime2 = param1; Js5NetworkRequest.field_I.length > var4Lifetime2; var4Lifetime2++) {
            int stackIn_112_0 = mh.field_f;
            if (jj.field_a[var4Lifetime2] < 0) {
              stackIn_113_1 = SpriteFactorySupport.field_b;
            } else {
              stackIn_113_1 = ok.field_a;
            }
            mh.field_f = stackIn_112_0 + stackIn_113_1;
          }
          EmailSyntaxValidator.field_o = LoginDialog.field_nb - (mh.field_f >> 1);
          cj.field_d = new int[Js5NetworkRequest.field_I.length][];
          int var4Lifetime3 = 0;
          int var5Lifetime3 = EmailSyntaxValidator.field_o;
          while (Js5NetworkRequest.field_I.length > var4Lifetime3) {
            int var6Lifetime1 = jj.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              int var7Lifetime2 = LoginMethod.a(param1 ^ 61, Js5NetworkRequest.field_I[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + CheckboxPainter.field_s;
              int var8Lifetime1 = ClientException.field_e - (var7Lifetime2 >> 1);
              cj.field_d[var4Lifetime3] = new int[4];
              cj.field_d[var4Lifetime3][0] = var8Lifetime1 - fe.field_k;
              cj.field_d[var4Lifetime3][1] = var5Lifetime3;
              cj.field_d[var4Lifetime3][2] = (fe.field_k << 1) + var7Lifetime2;
              cj.field_d[var4Lifetime3][3] = (AchievementTracker.field_k << 1) + ok.field_a;
              var5Lifetime3 = var5Lifetime3 + (CheckboxPainter.field_s + (AchievementTracker.field_k << 1) + ok.field_a);
            } else {
              var5Lifetime3 = var5Lifetime3 + SpriteFactorySupport.field_b;
            }
            var4Lifetime3++;
          }
          if (2 != ArchiveIndex.field_j) {
            cb.field_c.a(param1 ^ 90, param2, CachedArchiveProvider.a((byte) 122, GzipDecoder.field_d, UiContainer.field_y), 0);
          } else {
            cb.field_c.a(param1 + 91, param2, -1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "sn.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 <= 75) {
          return true;
        }
        return this.field_e;
    }

    sn(String param0) {
        this(param0, false);
    }

    sn(String param0, boolean param1) {
        String stackIn_12_2 = null;
        try {
          this.field_a = param0;
          boolean stackIn_4_1 = (param1);
          this.field_e = stackIn_4_1;
          if (this.field_a == null) {
            this.field_a = "";
          }
          if (this.field_a.length() == 0) {
            this.field_e = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("sn.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(int param0) {
        if (param0 > -67) {
          sn.a(119, -87, true);
        }
        return this.field_a;
    }

    static {
        field_d = 20000000L;
        field_b = new boolean[64];
    }
}
